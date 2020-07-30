import cn.demo.mpmockitodemo.DemoAppliocation;
import cn.demo.mpmockitodemo.entity.UserEntity;
import cn.demo.mpmockitodemo.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = DemoAppliocation.class)
@RunWith(SpringRunner.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;


    /**
     * 插入成功
     */
    @Test
    public void testInsert() {
        UserEntity userEntity = new UserEntity();
        userEntity.setName("wangwu");
        int insert = userMapper.insert(userEntity);
        Assert.assertEquals(1, insert);
    }
}
