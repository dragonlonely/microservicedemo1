package springcloud.feign;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import springcloud.pojo.User;

import java.util.Date;

/**
 * @author Administrator
 * @Date 2018/12/14 21:30
 * @Classname FeignClientFactory
 */
@Component
public class FeignClientFactory implements FallbackFactory<FeignClientInter> {

    @Override
    public FeignClientInter create(Throwable throwable) {
        return new FeignClientInter() {
            @Override
            public User getorder(Long id) {
                User user=new User();
                user.setId(-500L);
                user.setDate(new Date());
                return user;
            }

            @Override
            public User get_user(User user) {
                return user;
            }
        };
    }
}
