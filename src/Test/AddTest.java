package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    @Test
    void add() {
        Add a = new Add(5, 3);
        Add b = new Add(4, 34);
//        int[] array={1224,353,45,34,532,3}
        assertEquals(46, a.add(8, 8));
        assertEquals(555, b.add(500, 25));
//        assertEquals(0,a.add(-234,453));

    }

    @Test
    void sub(){

    }
}