import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.sqr.SQRService;

public class MathServiceTest {
    @Test
    public void test1() {
        SQRService service = new SQRService();
        int actual = service.SQRArea(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        SQRService service = new SQRService();
        int actual = service.SQRArea(300, 500);
        int expected = 5;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void test3() {
        SQRService service = new SQRService();
        int actual = service.SQRArea(100, 700);
        int expected = 16;
        Assertions.assertEquals(expected, actual);

    }
}
