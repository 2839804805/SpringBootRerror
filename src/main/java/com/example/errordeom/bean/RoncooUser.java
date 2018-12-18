package com.example.errordeom.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 实体类
 *
 * @author wujing
 */
@Entity
public class RoncooUser {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String name;
    @Column
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "RoncooUser [id=" + id + ", name=" + name + ", createTime=" + createTime
                + "]";
    }

}