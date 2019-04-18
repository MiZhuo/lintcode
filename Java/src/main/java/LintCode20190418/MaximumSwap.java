package LintCode20190418;

public class MaximumSwap {

    public int maximumSwap(int num) {
        // Write your code here
        if(num <= 11)
            return num;
        char[] arr = String.valueOf(num).toCharArray();
        int index = 0;
        int max = 1;
        while (max != arr.length - 1) {
            char a = arr[max - 1];
            for (int i = max; i < arr.length; i++) {
                if (arr[i] > a) {
                    a = arr[i];
                    index = i;
                }
            }
            if (index == 0) {
                max++;
                continue;
            }
            else
                break;
        }
        if(index != 0) {
            arr[max - 1] = (char) (arr[max - 1] ^ arr[index]);
            arr[index] = (char) (arr[max - 1] ^ arr[index]);
            arr[max - 1] = (char) (arr[max - 1] ^ arr[index]);
        }
        String s = "";
        for (char c:arr
             ) {
            s += c;
        }
        return  Integer.parseInt(s);
    }
}
