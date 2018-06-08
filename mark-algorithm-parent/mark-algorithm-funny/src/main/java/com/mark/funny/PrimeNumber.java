/*
 * Copyright (c) 2018, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.funny;

import java.util.ArrayList;
import java.util.List;

/**
 * 素数 又称 质数
 *
 * @author mark
 * @date 2018年6月8日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */
public class PrimeNumber {

    /**
     * 获取范围内的所有素数
     * 
     * @param max
     * @return
     */
    public static List<Integer> prime(int max) {

        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            if (isPrime(i)) {
                values.add(i);
            }
        }
        return values;
    }

    /**
     * 用这个数循环除以 2,3,...一直到这个数的平方根
     * 
     * @param number
     * @return
     */
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        if (number == 3) {
            return true;
        }

        int max = (int) Math.sqrt(number);

        if (max < 2) {
            return false;
        }

        for (int i = 2; i <= max; i++) {
            // 如果有一个数整除说明不是素数
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
