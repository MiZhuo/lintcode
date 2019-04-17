package com.main;
import LintCode20190413.SingleNumber;
import LintCode20190412.getNarcissusNumbers;
import LintCode20190414.PalindromeNumber;
import Written_examination_questions.IsCuboid;
import Written_examination_questions.MinLoopPosition;
import Written_examination_questions.TransAndMergElement;

import java.util.List;

public class main {
    public static void main(String[] args) {
        /**落单的数
         SingleNumber single = new SingleNumber();
        int[] Arr = {0,1,3,1,0,4,5,5,4};
        int singlenumber = single.singleNumber(Arr);
        System.out.println(singlenumber);*/
        /**水仙花数
        List<Integer> list = new getNarcissusNumbers().getNarcissisticNumbers(3);
        for (int i:list) {
            System.out.println(i);
        }
         *
         */
        /**
         * 回文数
         *     PalindromeNumber pn = new PalindromeNumber();
         *         int a = 1312;
         *         boolean bool = pn.isPalindrome(a);
         *         System.out.println(bool);
         */
        /**
         * 交换合并数组
         *   TransAndMergElement transAndMergElement = new TransAndMergElement();
         *         int[] ints = transAndMergElement.crossMerge(new int[]{1, 2, 3,8,9,10}, new int[]{4, 5, 6, 7});
         *         for (int i:ints
         *              ) {
         *             System.out.println(i);
         *         }
         */
        /**
         * 字符串循环排序
         * MinLoopPosition minLoopPosition = new MinLoopPosition();
         *         int i = minLoopPosition.caclMinLoopPosition("cba");
         *         System.out.println(i);
         */
        IsCuboid isCuboid = new IsCuboid();
        boolean cuboid = isCuboid.isCuboid(new int[][]{{1, 2}, {2, 3}, {1, 4}, {1, 3}, {2, 3}, {1, 2}});
        System.out.println(cuboid);

    }
}