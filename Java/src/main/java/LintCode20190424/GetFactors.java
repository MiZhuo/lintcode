package LintCode20190424;

import java.util.ArrayList;
import java.util.List;

public class GetFactors {
    public List<List<Integer>> getFactors(int n) {
        // write your code here
        List<List<Integer>> douList = new ArrayList<>();
        List<Integer> pids = new ArrayList<>();
        getSonFactors(pids,douList,n);
        return douList;
    }

    public void getSonFactors( List<Integer> pids,List<List<Integer>> douList,int n){
        List<Integer> list = new ArrayList<>();
        for(Integer i : pids) {
            list.add(i);
        }
        int des;
        for (int i = 2;i < n;i++){
            if(n % i == 0){
                pids.add(i);
                des = n / i;
                list.add(i);
                list.add(des);
                douList.add(list);
                getSonFactors(pids,douList,des);
            }
        }
        pids.remove(pids.size() - 1);
    }
}
