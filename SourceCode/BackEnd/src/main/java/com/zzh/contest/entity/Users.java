package com.zzh.contest.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.zzh.contest.entity.dto.PageQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "users")
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Users extends PageQuery {
    @TableId
    private Integer userId;
    private String name;
    private Boolean sex;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date birthday;
    private String school_id;
    private String address;
    private String phone;
    private String email;
    private String password;
    // 链表查询-组表字段：组名、组编码
    @TableField(exist = false)
    private String groupName;
    @TableField(exist = false)
    private String encoding;
    // 登录需要的验证码
    @TableField(exist = false)
    private String captcha;
}