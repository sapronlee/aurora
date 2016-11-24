package me.lixinwen.aurora.test.repository;

import me.lixinwen.aurora.test.BaseAbstractTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by chucklee on 2016/11/24.
 */
public class UserRepositoryTest extends BaseAbstractTest {

    @Test
    public void userRepositoryTest() throws Exception {
        assertThat(userRepository).isNotNull();
    }
}
