package com.hthyaq.zybadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hthyaq.zybadmin.mapper.UserMapper;
import com.hthyaq.zybadmin.model.entity.User;
import com.hthyaq.zybadmin.service.AaService;
import com.hthyaq.zybadmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hk
 * @since 2019-08-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
   @Autowired
   private AaService aaService;



    @Override
    public boolean deleteById(Integer id) {
        boolean b = this.removeById(id);
        return b;
    }

    @Override
    public List<User> queryUserByName(String name) {
        List<User> users = this.baseMapper.queryUserByName("%"+name+"%");
        return users;
    }
    @Override
    public List<User> queryById(Integer id){
        List<User> users = this.baseMapper.queryById(id);
        return users;
    }
}
