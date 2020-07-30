package cn.demo.mpmockitodemo.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.demo.mpmockitodemo.entity.UserEntity;
import cn.demo.mpmockitodemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.demo.mpmockitodemo.service.IUserService;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insertUser(String name) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(name);
        //System.out.println("userMapper = " + userMapper.hashCode());
        return userMapper.insert(userEntity);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.deleteById(id);
    }

    @Override
    public int updateUser(int id, String name) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(id);
        userEntity.setName(name);
        return userMapper.updateById(userEntity);
    }

    @Override
    public List<UserEntity> listUsers() {
        return userMapper.selectList(null);
    }
}
