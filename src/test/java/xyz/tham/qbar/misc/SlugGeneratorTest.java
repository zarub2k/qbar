package xyz.tham.qbar.misc;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class SlugGeneratorTest {
    @Test
    public void testGet() {
        String value = SlugGenerator.get("Hello Tham");
        System.out.println(value);
    }
}
