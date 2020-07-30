package cn.demo.mpmockitodemo.service;


import com.baomidou.mybatisplus.extension.service.IService;
import cn.demo.mpmockitodemo.entity.UserEntity;

import java.util.List;

public interface IUserService extends IService<UserEntity> {

    int insertUser(String name);

    int deleteUser(int id);

    int updateUser(int id, String name);

    List<UserEntity> listUsers();
}
