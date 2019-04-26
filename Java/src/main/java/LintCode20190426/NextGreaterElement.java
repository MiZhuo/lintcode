package LintCode20190426;

import java.util.Arrays;

public class NextGreaterElement {
    public int nextGreaterElement(int n) {
        // Write your code here
        char[] temp = String.valueOf(n).toCharArray();
        String s = "";
        Arrays.sort(temp);
        for(int i = temp.length -1;i > -1;i--){
            s += temp[i];
        }
        int ii = Integer.parseInt(s);
        if(ii > n){
            return ii;
        }
        return -1;
    }
}
