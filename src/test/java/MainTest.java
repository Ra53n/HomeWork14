import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void numbersAfterFour() {
        int[] a = new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] resA = new int[]{1, 7};
        int[] b = new int[]{1, 2, 3, 5, 6, 7, 8, 9, 4};
        int[] resB = new int[]{};
        int[] c = new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4};
        int[] resC = new int[]{};
        int[] d = new int[]{4, 1, 2, 3, 5, 6, 7, 8, 9};
        int[] resD = new int[]{1, 2, 3, 5, 6, 7, 8, 9};
        Assert.assertArrayEquals(resA, Main.numbersAfterFour(a) );
        Assert.assertArrayEquals(resB, Main.numbersAfterFour(b) );
        Assert.assertArrayEquals(resC, Main.numbersAfterFour(c) );
        Assert.assertArrayEquals(resD, Main.numbersAfterFour(d) );

    }

    @Test
    void oneAndFour(){
        int[] a = new int[]{1, 1, 4, 4};
        int[] b = new int[]{1, 4, 4, 1, 1, 4, 3};
        int[] c = new int[]{1, 1, 1, 1, 1};
        int[] d = new int[]{4, 4, 4, 4, 4};
        Assert.assertEquals(true,Main.oneAndFour(a));
        Assert.assertEquals(false,Main.oneAndFour(b));
        Assert.assertEquals(true,Main.oneAndFour(c));
        Assert.assertEquals(true,Main.oneAndFour(d));
    }
}