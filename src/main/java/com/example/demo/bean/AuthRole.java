package com.example.demo.bean;

import java.lang.reflect.Field;
import java.util.Date;

/**
 * @Auther Lee53
 * @Date 2019-12-01 15:58
 */
public class AuthRole {
    private Long id;
    private String role;
    private String name;
    private String description;
    private Date createtime;
    private Date updatetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public void setValueByFieldName(String fieldName, Object value){
        try {
            Field field = this.getClass().getField(fieldName);
            boolean accessible = field.isAccessible();
            field.setAccessible(true);
            field.set(this, value);
            field.setAccessible(accessible);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public Object getValueByFieldName(String fieldName){
        Object value = null;
        try {
            Field field = this.getClass().getField(fieldName);
            boolean accessible = field.isAccessible();
            field.setAccessible(true);
            value = field.get(this);
            field.setAccessible(accessible);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return value;
    }


}
