import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SolutionTest {

    private int[] input1;
    private int input2;
    private int expected;
    private Solution soln = new Solution2();

    public SolutionTest(int[] input1, int input2, int expected) {
        this.input1 = input1;
        this.input2 = input2;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection parameters() {
        return Arrays.asList(new Object[][]{
                {new int[]{-1,2,1,-4}, 1, 2},
                {new int[]{1,1,-1,-1,3}, -1, -1},
                {new int[]{1,2,4,8,16,32,64,128}, 82, 82}
        });
    }

    @Test
    public void testThreeSumClosest() {
        assertEquals(expected, soln.threeSumClosest(input1, input2));
    }
}
