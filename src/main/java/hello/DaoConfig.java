package hello;

import hello.domain.user.UserDao;
import hello.util.ConnectionMaker;
import hello.util.SimpleConnectionMaker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//클래스들 간의 관계를 설정해주는 칭구

@Configuration
@ComponentScan(basePackages = "hello.domain")
public class DaoConfig {

    @Bean
    public UserDao userDao() {
        return new UserDao(connectionMaker());
    }

    @Bean
    public ConnectionMaker connectionMaker() {
        return new SimpleConnectionMaker();
    }

}
