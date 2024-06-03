import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import aca98b.web3lv2.beans.BeanOfElements;
import aca98b.web3lv2.beans.XBean;
import aca98b.web3lv2.beans.YBean;
import aca98b.web3lv2.beans.RBean;

public class BeanOfElementsTest {

    private BeanOfElements beanOfElements;
    private XBean xBean;
    private YBean yBean;
    private RBean rBean;

    @BeforeEach
    public void setup() {
        xBean = Mockito.mock(XBean.class);
        yBean = Mockito.mock(YBean.class);
        rBean = Mockito.mock(RBean.class);
        beanOfElements = new BeanOfElements();
    }

    @Test
    public void testAddNew() {
        String x = "1.0";
        String y = "1.0";
        String r = "1.0";

        beanOfElements.addNew(x, y, r);

        Mockito.verify(xBean, Mockito.times(1)).setValue(x);
        Mockito.verify(yBean, Mockito.times(1)).setValue(y);
        Mockito.verify(rBean, Mockito.times(1)).setValue(r);
    }

    @Test
    public void testGetSize() {
        int expectedSize = 0;
        int actualSize = beanOfElements.getSize();
        assert(expectedSize == actualSize);

        beanOfElements.addNew("1.0", "1.0", "1.0");
        expectedSize = 1;
        actualSize = beanOfElements.getSize();
        assert(expectedSize == actualSize);
    }

    @Test
    public void testClear() {
        beanOfElements.addNew("1.0", "1.0", "1.0");
        int expectedSize = 1;
        int actualSize = beanOfElements.getSize();
        assert(expectedSize == actualSize);

        beanOfElements.clear();
        expectedSize = 0;
        actualSize = beanOfElements.getSize();
        assert(expectedSize == actualSize);
    }
}
