package com.hthyaq.zybadmin.service;

import com.hthyaq.zybadmin.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hk
 * @since 2019-08-09
 */
public interface UserService extends IService<User> {


    boolean deleteById(Integer id);
    List<User> queryUserByName(String name);
    List<User> queryById(Integer id);
}
