package com.retalcar.sys.service;

import com.retalcar.sys.domain.News;
import com.retalcar.sys.utils.DataGridView;
import com.retalcar.sys.vo.NewsVo;

/**
 * @author laiyunjing
 * @version 1.0
 * @date 2020/6/11 0011 17:21
 */
public interface NewsService {

    /**
     * 查询所有公告
     * @param newsVo
     * @return
     */
    public DataGridView queryAllNews(NewsVo newsVo);
    /**
     * 添加公告
     * @param newsVo
     */
    public void addNews(NewsVo newsVo);
    /**
     * 修改公告
     * @param newsVo
     */
    public void updateNews(NewsVo newsVo);
    /**
     * 根据id删除公告
     * @param newsid
     */
    public void deleteNews(Integer newsid);
    /**
     * 批量删除公告
     * @param newsVo
     */
    public void deleteBatchNews(Integer [] ids);

    /**
     * 查询一个公告
     * @param id
     * @return
     */
    public News queryNewsById(Integer id);
}
