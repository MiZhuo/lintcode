package LintCode20190413;

/**
 * Description
 * Given 2*n + 1 numbers, every numbers occurs twice except one, find it.
 * <p>
 * Example
 * Input：[1,1,2,2,3,4,4]
 * Output：3
 * Explanation:
 * Only 3 appear once
 * Challenge
 * One-pass, constant extra space.
 */
public class SingleNumber {
    /**
     * @param A: An integer array
     * @return: An integer
     */
    public int singleNumber(int[] A) {
        // write your code here
        for (int i = 0; i < A.length; i++) {
            int temp = 0;
            for (int j = 0; j < A.length; j++) {
                if (i != j && A[i] == A[j]) {
                    temp++;
                }
            }
            if (temp == 0)
                return A[i];
        }
        return -1;
    }
}
