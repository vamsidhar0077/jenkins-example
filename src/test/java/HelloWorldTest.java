/**
 * Created By ReddyGadu
 * Created On 11/17/20
 * Project Name jenkins-example
 **/
import org.junit.Test;
import org.junit.jupiter.api.*;

public class HelloWorldTest {
    public HelloWorld hw;

    @DisplayName("HelloWorld with Vamsi")
    @Test
    public void testGreet() {
        hw = new HelloWorld();
        String wishes = hw.greet("Vamsi");
        Assertions.assertEquals(wishes, "Welcome Vamsi :)");
    }
}
