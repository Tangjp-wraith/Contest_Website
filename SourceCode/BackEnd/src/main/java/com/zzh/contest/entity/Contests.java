package com.zzh.contest.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "contests")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Contests {
    @TableId
    private Integer contestId;
    private String contestTitle;
    private String contestText;
    private String url;
    private Integer promulgator;
    private Integer groupId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date regStartTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date regEndTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endTime;
    private Boolean status;
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private String statusText;
    // 链表查询-用户表字段：姓名
    @TableField(exist = false)
    private String name;
    // 链表查询-组表字段：组名
    @TableField(exist = false)
    private String groupName;
    // 链表查询-自定义字段：数量
    @TableField(exist = false)
    private Integer number;
}