package springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springbootdemo.bean.Pet;
import springbootdemo.bean.User;
import springbootdemo.config.MyConfig;

/**
 * @author: Xugp
 * @date: 2022/5/16 15:17
 * @description:
 */
@SpringBootApplication
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan("springbootdemo")
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
//        String[] beanDefinitionNames = run.getBeanDefinitionNames();
//        for (String name : beanDefinitionNames) {
//            System.out.println(name);
//        }

        Pet bean1 = run.getBean("tom", Pet.class);
        Pet bean2 = run.getBean("tom",Pet.class);
        User bean3 = run.getBean(User.class);
        System.out.println(bean3.getClass());
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println(bean1 == bean2);
        System.out.println("$$$$$$$$$$$");
        MyConfig bean = run.getBean(MyConfig.class);
        Pet pet = bean.user01().getPet();
        System.out.println(pet == bean1);
        System.out.println("#############");
//        boolean tom = run.containsBean("tom");
//        boolean user01 = run.containsBean("user01");
//        System.out.println(tom);
//        System.out.println(user01);
    }
}
