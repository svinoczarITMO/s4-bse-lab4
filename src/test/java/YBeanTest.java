import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import aca98b.web3lv2.beans.YBean;

public class YBeanTest {

    @Test
    public void testGetValue() {
        YBean yBean = new YBean();
        yBean.setValue("test");
        Assertions.assertEquals("test", yBean.getValue());
    }
}
