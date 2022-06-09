import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution sol = new Solution();
    @Test
    void containDuplicateExample1() {
        assertTrue(sol.containDuplicate(new int[]{1, 2, 3, 1}));
    }
    @Test
    void containDuplicateExample2() {
        assertFalse(sol.containDuplicate(new int[]{1, 2, 3, 4}));
    }
    @Test
    void containDuplicateExample3() {
        assertTrue(sol.containDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}