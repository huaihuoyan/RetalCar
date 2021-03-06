package com.retalcar.sys.vo;

import com.retalcar.sys.domain.User;

/**
 * @author laiyunjing
 * @version 1.0
 * @date 2020/5/23 0023 下午 3:25
 */
public class UserVo extends User {

    /**
     * 分页参数
     */
    private Integer page;
    private Integer limit;

    // 接收多个角色id
    private Integer[] ids;

    private String code;

    public Integer[] getIds() {
        return ids;
    }

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
