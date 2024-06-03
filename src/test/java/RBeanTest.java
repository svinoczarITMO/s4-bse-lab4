import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import aca98b.web3lv2.beans.RBean;

public class RBeanTest {

    @Test
    public void testGetValue() {
        RBean rBean = new RBean();
        rBean.setValue("test");
        Assertions.assertEquals("test", rBean.getValue());
    }
}
