import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();

        int min = 300;
        int max = 450;
        int expected = 4;
        int actual = service.calcSQRService(max = 450, min = 300);

        Assertions.assertEquals(expected, actual);
    }
}
