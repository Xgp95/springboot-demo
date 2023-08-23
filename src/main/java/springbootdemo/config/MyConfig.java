package springbootdemo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;
import springbootdemo.bean.Pet;
import springbootdemo.bean.User;

import java.lang.reflect.Type;

/**
 * @author: Xugp
 * @date: 2022/5/16 15:35
 * @description:
 */
//@Configuration(proxyBeanMethods = false)
@Configuration
//@Import({User.class,Pet.class})
//@ConditionalOnMissingBean(name = "tom")
public class MyConfig {
//    @ConditionalOnBean(name = "tom")
    @Bean
    public User user01() {
        User user = new User("zhangsan", 18);
        user.setPet(pet());
        return user;
    }

    @Bean("tom")
//    @Scope("prototype")
    public Pet pet() {
        Pet pet = new Pet("tom");
        return pet;
    }
}
