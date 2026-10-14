import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CalcTest {
    @Test
    void Calc_Null_Test() {
        assertNotNull(new Calc());
    }
}