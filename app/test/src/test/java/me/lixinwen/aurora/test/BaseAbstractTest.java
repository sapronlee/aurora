package me.lixinwen.aurora.test;

import me.lixinwen.aurora.AuroraApplication;
import me.lixinwen.aurora.domain.repository.UserRepository;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by chucklee on 2016/11/24.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AuroraApplication.class, properties = "spring.profiles.active=test")
@DataJpaTest
public abstract class BaseAbstractTest {

    @Resource
    protected TestEntityManager testEntityManager;

    @Resource
    protected UserRepository userRepository;
}
