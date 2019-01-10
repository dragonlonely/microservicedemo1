package springcloud.feign;
/**
 * @Classname FeignClientHyStrix
 * @Description TODO
 * @Date 2018/12/14 20:44
 * @Created by Administrator
 */

import org.springframework.stereotype.Component;
import springcloud.pojo.User;

import java.util.Date;

/**
 * @author Administrator
 * @Date 2018/12/14 20:44
 * @Classname FeignClientHyStrix
 */
@Component
public class FeignClientHyStrix implements FeignClientInter{

    @Override
    public User getorder(Long id) {
        User user=new User();
        user.setId(-300L);
        user.setDate(new Date());
        return user;
    }

    @Override
    public User get_user(User user) {
        return user;
    }
}
