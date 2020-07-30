package cn.demo.mpmockitodemo.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.demo.mpmockitodemo.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
}
