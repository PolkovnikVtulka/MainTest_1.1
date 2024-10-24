import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetLocalNumber() {
        Assert.assertEquals("Invalid number entered",14 ,MainClass.getLocalNumber());
    }

}
