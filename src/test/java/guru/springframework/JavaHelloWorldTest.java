package guru.springframework;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaHelloWorldTest {

    @Test
    public void getHello() {
        System.out.println("environment variable: \n");
        System.out.println(System.getenv("TEST_HOST"));
    }
}