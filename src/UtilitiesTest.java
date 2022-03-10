import static org.junit.Assert.*;

public class UtilitiesTest {
    private Utilities utils;

    @org.junit.Before
    public void setup(){
        utils = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() {
 //       Utilities utils = new Utilities();
        char[] output = utils.everyNthChar(new char[] {'h','e','l','l','o'}, 2);
        assertArrayEquals(new char[] {'e','l'},output);
        char[] output2 = utils.everyNthChar(new char[] {'h','e','l','l','o'}, 6);
        assertArrayEquals(new char[] {'h','e','l','l','o'},output2);
    }

    @org.junit.Test
    public void removePairs() {
   //     Utilities utils = new Utilities();
        assertEquals("ABCDEF", utils.removePairs("AABBCDDEFF"));
        assertEquals("ABCEF", utils.removePairs("AABCEF"));
        assertEquals("A", utils.removePairs("A"));
        assertEquals("", utils.removePairs(""));
        assertNull("Did not get null",utils.removePairs(null));
    }

    @org.junit.Test
    public void converter() throws Exception{
     //   Utilities utils = new Utilities();
        assertEquals(300, utils.converter(10,5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converter_arithmeticException() throws Exception{
     //   Utilities utils = new Utilities();
        utils.converter(10,0);
    }

    @org.junit.Test
    public void nullIfOddLength() throws Exception{
     //   Utilities utils = new Utilities();
        assertNull(utils.nullIfOddLength("odd"));
        assertNotNull(utils.nullIfOddLength("Even"));
    }
}