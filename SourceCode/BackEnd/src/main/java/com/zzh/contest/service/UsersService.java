package com.zzh.contest.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zzh.contest.entity.Users;
import com.zzh.contest.entity.dto.PageQuery;
import com.zzh.contest.utils.result.Result;

import java.util.List;

public interface UsersService extends IService<Users> {
    /**
     * 分页链表查询
     *
     * @param pageQuery 分页查询对象
     * @return 结果对象
     */
    Page<Users> selectListPage(PageQuery pageQuery);

    /**
     * 登录功能（账号为手机号或邮箱）
     *
     * @param users Users对象
     * @return 登录结果
     */
    Result login(Users users);

    /**
     * 退出登录
     */
    Result logout();

    /**
     * 注册
     *
     * @param users 对象
     * @return 用户id
     */
    Result insertUsers(Users users);

    /**
     * 查询手机号和邮箱是否存在
     *
     * @param users 登录信息的对象
     * @return true或false
     */
    Result selectPhoneEmail(Users users);

    /**
     * 查询单个用户信息
     *
     * @param uid 用户id
     * @return 该id的用户信息
     */
    Result selectById(int uid);

    /**
     * 根据组id查询该组下有哪用户，生成一个用户id列表
     *
     * @param gid 组id
     * @return 列表
     */
    List<Users> selectByGid(Integer gid);


}
