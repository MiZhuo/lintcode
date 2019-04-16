package Written_examination_questions;

/**
 * 给定字符串，判断从哪个位置开始循环，得到的字符串在字典中排序最小(a<b<c,abc<abd<bbc)
 * 例如:字符串"bac"，从位置0/1/2开始循环，分别为"bac/acb/cba"，从1位置字典排序最小
 * 异常数据返回-1
 */
public class MinLoopPosition {
    public int caclMinLoopPosition(String str){
        String[] strArr = new String[str.length()];
        for(int i = 0; i < str.length();i++){
            String str1 = str.substring(0,i);
            String str2 = str.substring(i,str.length() - 1);
            strArr[i] = str2 + str1;
        }
        
        return -1;
    }
}
