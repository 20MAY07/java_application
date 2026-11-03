package demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testApp() {
        demo.App app = new demo.App();
        assertNotNull(app);
    }
}