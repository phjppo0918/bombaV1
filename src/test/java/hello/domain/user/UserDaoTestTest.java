package hello.domain.user;

import hello.DaoConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

import static org.assertj.core.api.Assertions.*;


class UserDaoTestTest {

    @Test
    @DisplayName("유저 생성")
    public void createUser() throws ClassNotFoundException, SQLException {
        ApplicationContext ac
                = new AnnotationConfigApplicationContext(DaoConfig.class);

        UserDao dao = ac.getBean(UserDao.class);


        dao.deleteAll();

        User user = new User();
        user.setId("777"); //일일이 코드 수정
        user.setName("test");
        user.setPassword("1234");

        dao.add(user);

        User user2 = dao.get(user.getId());

        assertThat(user2.getId()).isEqualTo(user.getId());
        assertThat(user2.getName()).isEqualTo(user.getName());
        assertThat(user2.getPassword()).isEqualTo(user.getPassword());


    }

}