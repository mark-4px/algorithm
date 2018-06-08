/*
 * Copyright (c) 2018, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.funny;

import java.util.ArrayList;
import java.util.List;

/**
 * 水仙花数
 * 
 * 水仙花数（Narcissistic number）也被称为超完全数字不变数（pluperfect digital invariant, PPDI）、自恋数、自幂数、阿姆斯壮数或阿姆斯特朗数（Armstrong
 * number），水仙花数是指一个 n 位数（n≥3 ），它的每个位上的数字的 n 次幂之和等于它本身（例如：1^3 + 5^3+ 3^3 = 153）
 * 
 * @author mark
 * @date 2018年6月8日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */
public class NarcissisticNumber {

    /**
     * 
     * @param level 位数 >= 3
     * @return 返回所有的水仙花数集合
     */
    public static List<Integer> narcissistic(int level) {
        int max = (int) Math.pow(10, level) - 1;

        System.out.println("max : " + max);

        int min = 100;

        System.out.println("min : " + min);

        List<Integer> result = new ArrayList<>();

        for (int i = min; i < max; i++) {

            int numberLevel = (i + "").length();

            int total = 0;

            for (int j = 1; j <= numberLevel; j++) {

                // 找出每一位的具体数字
                int current = i;
                if (j == 1) {
                    current = i / (int) Math.pow(10, numberLevel - j);
                } else {
                    current = current % (int) Math.pow(10, numberLevel - j + 1) / (int) Math.pow(10, numberLevel - j);
                }
                int pow = (int) Math.pow(current, numberLevel);
                total += pow;
            }

            if (total == i) {
                result.add(total);
            }
        }

        return result;
    }

}
