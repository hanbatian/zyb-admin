package com.hthyaq.zybadmin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hthyaq.zybadmin.model.entity.User;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hk
 * @since 2019-08-09
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> queryUserByName(String name);
    List<User> queryById(Integer id);
}
