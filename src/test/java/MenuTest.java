import static org.junit.Assert.*;
import java.util.*;

public class MenuTest {

    @org.junit.Test
    public void mainTest() {
        System.out.println("Array test");
        int[] testArray = new int[]{23,90,43};
        Array testobj = new Array(testArray.length, testArray);

        assertEquals(0, testobj.getInteger(23));
        assertEquals(1, testobj.getInteger(90));
        assertEquals(2, testobj.getInteger(43));
        assertEquals(-1, testobj.getInteger(2));

        assertEquals(23, testobj.findMin(testArray));
        assertEquals(90, testobj.findMax(testArray));

        int[] reversedArray = new int[]{43,90,23};
        int[] sortedArray = new int[]{90,43,23};

        assertEquals(true, Arrays.equals(reversedArray, testobj.reverseArray(testArray)));
        assertEquals(true, Arrays.equals(sortedArray, testobj.sortInDescending(testArray)));

    }
}