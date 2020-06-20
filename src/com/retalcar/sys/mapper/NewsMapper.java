package com.retalcar.sys.mapper;

import com.retalcar.sys.domain.News;

import java.util.List;

/**
 * @author laiyunjing
 * @version 1.0
 * @date 2020/6/10 0010 18:43
 */
public interface NewsMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    /**
     * 查询
     */
    List<News> queryAllNews(News news);
}
