package com.example.administrator.gelinhaotaichange;

import com.lidroid.xutils.db.annotation.Column;
import com.lidroid.xutils.db.annotation.Id;
import com.lidroid.xutils.db.annotation.NoAutoIncrement;
import com.lidroid.xutils.db.annotation.NotNull;
import com.lidroid.xutils.db.annotation.Table;
import com.lidroid.xutils.db.annotation.Unique;

/**
 * Created by Administrator on 2015/4/15.
 */
@Table( name = "Bean")
public class Bean {
    @Id(column = "id")
    //取消自增
    @NoAutoIncrement
    private int id;
    @Column(column="title")
    //添加唯一属性
    @Unique
    //添加非空属性
    @NotNull
    private String title;
    @Column(column="image")
    private String image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
