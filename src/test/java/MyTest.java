import com.microsoft.demo.Demo;
import org.junit.Test;

public class MyTest {
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        d.DoSomething(true);
    }

    @Test
    public void test_method_2() {
        Demo d = new Demo();
        d.DoSomething(false);
    }

    @Test
    public void test_method_3(){
        System.out.println("this is new commit!");
    }
}