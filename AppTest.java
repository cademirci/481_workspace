import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    App a = new App();

    @Test
    public void testEmptyArray() {
        a.stringArray = new String[]{};
        assertEquals(0, a.calculate(0, 0, a.stringArray));
    }

    @Test
    public void test45() { // there is no number between consecutive numbers
        a.stringArray = new String[]{"cafe", "phone"};
        assertEquals(0, a.calculate(4, 5, a.stringArray));
    }

    @Test
    public void testFound2() {
        a.stringArray = new String[]{"cafe", "phone", "computer", "cat"};
        assertEquals(2, a.calculate(4, 9, a.stringArray));
    }

    @Test
    public void testNotFound() {
        a.stringArray = new String[]{"cafe", "phone", "computer", "cat"};
        assertEquals(0, a.calculate(8, 1000, a.stringArray));
    }

    @Test
    public void testArraySize() {
        a.stringArray = new String[]{"cafe", "phone", "computer", "cat"};
        assertEquals(4, a.calculate(0, 1000, a.stringArray));
    }

    @Test
    public void testLength0() {
        a.stringArray = new String[]{"", "phone", "computer", "cat"};
        assertEquals(1, a.calculate(-1, 1, a.stringArray));
    }

}