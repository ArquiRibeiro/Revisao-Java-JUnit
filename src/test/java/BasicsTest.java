import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import arquiribeiro.Basics;

public class BasicsTest {
    private static Basics basics;

    @BeforeAll
    public static void setupTests(){
        basics = new Basics();
    }

    @Test
    public void compare(){
        int value = basics.sum(2, 1);
        Assertions.assertEquals(3, value);
    }

    @Test
    public void fibonacci(){
        Assertions.assertEquals(13, basics.fibonacci(7));
        Assertions.assertEquals(1597, basics.fibonacci(17));
        Assertions.assertEquals(1597, basics.fibonacci(17));
    }

    @Test
    public void reverseArray(){
        int[] array1 = {1,2,3};
        Assertions.assertEquals(3, basics.reverseArray(array1)[0]);
    }
} 