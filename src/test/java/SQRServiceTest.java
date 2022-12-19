import org.example.SQRService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceTest {
    @Test


    public void shouldCalcExact() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSQR(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldCalcExac() {
        SQRService service = new SQRService();

        int expected = 8;
        int actual = service.calcSQR(200, 500);

        Assertions.assertEquals(expected, actual);
    }
}
