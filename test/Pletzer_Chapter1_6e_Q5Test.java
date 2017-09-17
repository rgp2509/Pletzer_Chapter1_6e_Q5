import org.junit.Test;

import static org.junit.Assert.*;

public class Pletzer_Chapter1_6e_Q5Test {
    @Test
    public void mainTest() throws Exception {
        int first = 10, last = 14;
        String finalOut = "10, 11, 12, 13, and 14.";
        assertEquals(finalOut,Pletzer_Chapter1_6e_Q5.printBetween(first,last));
    }

}