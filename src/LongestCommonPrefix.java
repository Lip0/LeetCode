import org.junit.Test;

import java.util.HashMap;

/**
 * 最长公共前缀
 */

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int len=strs[0].length();
        String result;
        for (int i = 0; i <len ; i++) {
            for (String str: strs) {

            }
        }
    }
    @Test
    public void testLongestCommonPrefix(){
        // Create a new Solution instance
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String[] strs={"flower","flow","flight"};
        String answer = solution.longestCommonPrefix(strs);
        // Print the answer
        System.out.println(answer);
    }
}



