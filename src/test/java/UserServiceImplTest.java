import cn.demo.mpmockitodemo.entity.UserEntity;
import cn.demo.mpmockitodemo.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import cn.demo.mpmockitodemo.service.impl.UserServiceImpl;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {

    @Mock
    private UserMapper userMapper;

    @InjectMocks
    private UserServiceImpl userService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    /**
     * 断言失败 excepted 1    actual 0
     */
    @Test
    public void testInsert() {
        UserEntity userEntity = new UserEntity();
        when(userMapper.insert(userEntity)).thenReturn(1);
        //System.out.println("userMapper = " + userMapper.hashCode());
        Assert.assertEquals(1, userService.insertUser("张三"));
    }
}