package com.retalcar.sys.controller;

import com.retalcar.sys.domain.News;
import com.retalcar.sys.domain.User;
import com.retalcar.sys.service.NewsService;
import com.retalcar.sys.utils.DataGridView;
import com.retalcar.sys.utils.ResultObj;
import com.retalcar.sys.utils.WebUtils;
import com.retalcar.sys.vo.NewsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author laiyunjing
 * @version 1.0
 * @date 2020/6/11 0011 17:20
 */
@RestController
@RequestMapping("news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    /**
     * 加载公告列表返回DataGridView
     */
    @RequestMapping("loadAllNews")
    public DataGridView loadAllNews(NewsVo newsVo) {
        return this.newsService.queryAllNews(newsVo);
    }

    /**
     * 添加公告
     */
    @RequestMapping("addNews")
    public ResultObj addNews(NewsVo newsVo) {
        try {
            newsVo.setCreatetime(new Date());
            User user=(User) WebUtils.getHttpSession().getAttribute("user");
            newsVo.setOpername(user.getRealname());
            this.newsService.addNews(newsVo);
            return ResultObj.ADD_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.ADD_ERROR;
        }
    }
    /**
     * 修改公告
     */
    @RequestMapping("updateNews")
    public ResultObj updateNews(NewsVo newsVo) {
        try {
            this.newsService.updateNews(newsVo);
            return ResultObj.ADD_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.ADD_ERROR;
        }
    }

    /**
     * 删除公告
     */
    @RequestMapping("deleteNews")
    public ResultObj deleteNews(NewsVo newsVo) {
        try {
            this.newsService.deleteNews(newsVo.getId());
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.DELETE_ERROR;
        }
    }

    /**
     * 批量删除公告
     */
    @RequestMapping("deleteBatchNews")
    public ResultObj deleteBatchNews(NewsVo newsVo) {
        try {
            this.newsService.deleteBatchNews(newsVo.getIds());
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.DELETE_ERROR;
        }
    }

    /**
     * 根据id查询公告
     */
    @RequestMapping("loadNewsById")
    public News loadNewsById(Integer id) {
        return this.newsService.queryNewsById(id);
    }
}
