package hello.domain.user;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;

class UserDaoTesthjklhkjlhklj {

    ApplicationContext ac = new AnnotationConfigApplicationContext();

    @Test
    @DisplayName("유저 등록하기!")
    void createUser() {
        int a = 0;
        assertThatThrownBy(() -> {}).isInstanceOf(Exception.class);
    }

    @BeforeEach
    void kkk() {

    }

    @AfterEach
    void kkkk() {

    }


}