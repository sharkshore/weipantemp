package com.shark.weipan.dto;

public class MenuUser {
    private Integer id;

    private Integer menuId;

    private Integer userId;

    public MenuUser(Integer id, Integer menuId, Integer userId) {
        this.id = id;
        this.menuId = menuId;
        this.userId = userId;
    }

    public MenuUser() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}