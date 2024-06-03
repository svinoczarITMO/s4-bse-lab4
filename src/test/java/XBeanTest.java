import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import aca98b.web3lv2.beans.XBean;

public class XBeanTest {

    @Test
    public void testGetValue() {
        XBean xBean = new XBean();
        xBean.setValue("test");
        Assertions.assertEquals("test", xBean.getValue());
    }
}
