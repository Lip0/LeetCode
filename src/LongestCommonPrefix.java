import org.junit.Test;

import java.util.HashMap;

/**
 * 最长公共前缀
 */

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String str1=strs[0];
        String result;
        for (int i=1;i<strs.length;i++) {
            while(strs[i].indexOf(str1)!=0){
                str1=str1.substring(0,str1.length()-1);
                if(str1.equals("")){
                    return "";
                }
            }
        }
        return str1;
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



