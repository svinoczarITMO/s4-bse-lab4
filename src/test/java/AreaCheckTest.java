import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import aca98b.web3lv2.AreaCheck;
public class AreaCheckTest {

    @Test
    public void testChecker() {
        AreaCheck areaCheck = new AreaCheck();

        assertEquals("true", areaCheck.checker(0, 0, 1));
        assertEquals("true", areaCheck.checker(-0.5f, 0.5f, 1));
        assertEquals("true", areaCheck.checker(-0.5f, -0.5f, 1));
        assertEquals("true", areaCheck.checker(0.5f, 0.5f, 1));
        assertEquals("false", areaCheck.checker(0.5f, -0.5f, 1));
        assertEquals("false", areaCheck.checker(-0.5f, 1.5f, 1));
        assertEquals("false", areaCheck.checker(1.5f, 0.5f, 1));
    }

    @Test
    public void testInArr() {
        AreaCheck areaCheck = new AreaCheck();

        float[] arr = {1, 2, 3};
        assertEquals(true, areaCheck.inArr(2, arr));
        assertEquals(false, areaCheck.inArr(4, arr));
        assertEquals(true, areaCheck.inArr(1, arr));
        assertEquals(true, areaCheck.inArr(3, arr));
        assertEquals(false, areaCheck.inArr(0, arr));
    }
}
