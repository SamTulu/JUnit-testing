import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayUtilsTest {

    private MyArrayUtils myArrayUtils;

    @Before
    public void setUp() throws Exception {
        this.myArrayUtils = new MyArrayUtils();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void hasMultipleMaximum() {

        boolean check = this.myArrayUtils.hasMultipleMaximum(new int[] {1,2,3,4,4});
        assertTrue(check);
    }

    @Test
    public void hasMultipleMaximumWhenEmpty() {

        boolean check = this.myArrayUtils.hasMultipleMaximum(new int[] {});
        assertFalse(check);
    }

    @Test
    public void hasMultipleMaximumWhenNull() {

        boolean check = this.myArrayUtils.hasMultipleMaximum(null);
        assertFalse(check);
    }
}