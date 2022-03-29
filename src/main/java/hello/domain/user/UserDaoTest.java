package hello.domain.user;

import hello.DaoConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


       // DaoConfig dc = new DaoConfig();

       ApplicationContext ac
               = new AnnotationConfigApplicationContext(DaoConfig.class);

       UserDao dao = ac.getBean(UserDao.class);

        User user = new User();
        user.setId("qwerasdf"); //일일이 코드 수정
        user.setName("test");
        user.setPassword("1234");

        dao.add(user);

        System.out.println(user.getId() + "등록성공");


        User user2 = dao.get(user.getId()); //눈으로 직접 검토
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + "조회성공");
    }
}
