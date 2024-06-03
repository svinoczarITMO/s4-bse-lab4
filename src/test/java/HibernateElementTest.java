import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import aca98b.web3lv2.HibernateElement;

public class HibernateElementTest {

    @Test
    public void testSettersAndGetters() {
        HibernateElement hibernateElement = new HibernateElement();
        hibernateElement.setId(1);
        hibernateElement.setX(1.0f);
        hibernateElement.setY(1.0f);
        hibernateElement.setR(1.0f);
        hibernateElement.setResult("true");
        hibernateElement.setTime("2022-12-12T12:12:12");
        hibernateElement.setScriptTime("0.01");
        hibernateElement.setUid("test");

        Assertions.assertEquals(1, hibernateElement.getId());
        Assertions.assertEquals(1.0f, hibernateElement.getX());
        Assertions.assertEquals(1.0f, hibernateElement.getY());
        Assertions.assertEquals(1.0f, hibernateElement.getR());
        Assertions.assertEquals("true", hibernateElement.getResult());
        Assertions.assertEquals("2022-12-12T12:12:12", hibernateElement.getTime());
        Assertions.assertEquals("0.01", hibernateElement.getScriptTime());
        Assertions.assertEquals("test", hibernateElement.getUid());
    }
}