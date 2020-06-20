package com.retalcar.sys.vo;

import com.retalcar.sys.domain.Menu;

/**
 * @author laiyunjing
 * @version 1.0
 * @date 2020/5/28 0028 下午 7:43
 */
public class MenuVo extends Menu {
    /**
     * 分页参数
     */
    private Integer page;
    private Integer limit;
    public Integer getPage() {
        return page;
    }
    public void setPage(Integer page) {
        this.page = page;
    }
    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
