package org.baeldung;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.baeldung.ecommerce.EcommerceApplicationIntegrationTest;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EcommerceApplicationIntegrationTest.class)
public class SpringContextIntegrationTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}
