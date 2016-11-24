package me.lixinwen.aurora;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by chucklee on 2016/11/24.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AuroraApplication.class, properties = "spring.profiles.active=test")
public abstract class BaseAbstractTest {
}
