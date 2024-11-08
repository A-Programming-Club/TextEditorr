import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.programmingclub.Main;


public class Tests {
    @Test
    public void testMethod() {
        assertEquals("test", "test");
    }
    @Test
    public void exampleTest() {
        for (int i = 0; i < 100000; ++i) {
            assertEquals(Main.exampleMethod(i), i);
        }
    }
}
