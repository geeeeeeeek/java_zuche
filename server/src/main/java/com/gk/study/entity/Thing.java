package com.gk.study.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.List;

@Data
@TableName("b_thing")
public class Thing implements Serializable {
    @TableId(value = "id",type = IdType.AUTO)
    public Long id;
    @TableField
    public String title;
    @TableField
    public String cover;
    @TableField
    public String description;
    @TableField
    public String price;
    @TableField
    public String status;
    @TableField
    public String createTime;
    @TableField
    public String score;
    @TableField
    public String mobile;
    @TableField
    public String age; // 车龄
    @TableField
    public String xuhang; // 续航
    @TableField
    public String dongli; // 动力
    @TableField
    public String xianzhi; // 闲置时间
    @TableField
    public String location;
    @TableField
    public String pv;
    @TableField
    public String recommendCount;
    @TableField
    public String wishCount;
    @TableField
    public String collectCount;
    @TableField
    public Long classificationId;

    @TableField(exist = false)
    public List<Long> tags; // 标签

    @TableField(exist = false)
    public MultipartFile imageFile;

    @TableField
    public String userId;
}
