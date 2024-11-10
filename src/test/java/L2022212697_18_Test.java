import edu.hit.Solution18;
import org.junit.Test;

import org.testng.internal.junit.ArrayAsserts;


import static org.junit.Assert.assertArrayEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class L2022212697_18_Test{
    @Test
    public void testProductExceptSelf_case1() {
        Solution18 solution = new Solution18();
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        ArrayAsserts.assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    @Test
    public void testProductExceptSelf_case2() {
        Solution18 solution = new Solution18();
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};
        ArrayAsserts.assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    @Test
    public void testProductExceptSelf_case3() {
        Solution18 solution = new Solution18();
        int[] nums = {1, 1, 1, 1};
        int[] expected = {1, 1, 1, 1};
        ArrayAsserts.assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    @Test
    public void testProductExceptSelf_case4() {
        Solution18 solution = new Solution18();
        int[] nums = {-2, 3, 4, -1};
        int[] expected = {};
//        int[] expected = {-12, 8, 6, -24};
        ArrayAsserts.assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    @Test
    public void testProductExceptSelf_case5() {
        Solution18 solution = new Solution18();
        int[] nums = {0, 2, 3, 4};
        int[] expected = {24, 0, 0, 0};
        ArrayAsserts.assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    @Test
    public void testProductExceptSelf_singleElement() {
        Solution18 solution = new Solution18();
        int[] nums = {5};
        int[] expected = {1};  // 边界情况: 单一元素数组
        ArrayAsserts.assertArrayEquals(expected, solution.productExceptSelf(nums));
    }

    @Test
    public void testProductExceptSelf_twoElements() {
        Solution18 solution = new Solution18();
        int[] nums = {3, 7};
        int[] expected = {7, 3};
        ArrayAsserts.assertArrayEquals(expected, solution.productExceptSelf(nums));
    }
}