import com.sz.Hello;
import org.junit.Test;

/**
 * .
 *
 * @Auther: liaosz
 * @Date: 2021/01/09/15:22
 * @Description:
 */
public class HelloTest {
    @Test
    public void sayHell(){
        Hello hello = new Hello();
        hello.sayHello("liaosz");
    }
}
