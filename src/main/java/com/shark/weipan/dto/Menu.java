package com.shark.weipan.dto;

public class Menu {
    private Integer menuId;

    private String name;

    private String url;

    private String description;

    public Menu(Integer menuId, String name, String url, String description) {
        this.menuId = menuId;
        this.name = name;
        this.url = url;
        this.description = description;
    }

    public Menu() {
        super();
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}