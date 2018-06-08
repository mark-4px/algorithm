/*
 * Copyright (c) 2018, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.sort;

/**
 * 冒泡法排序
 * 
 * @author mark
 * @date 2018年6月8日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */
public class BubbleSort {
    /**
     * 冒泡法排序
     * 
     * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
     * 针对所有的元素重复以上的步骤，除了最后一个。
     * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     *
     * @param numbers 需要排序的整型数组
     */
    public static int[] sort(int[] numbers) {
        int temp; // 记录临时中间值
        for (int i = 0, size = numbers.length; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] < numbers[j]) { // 交换两数的位置
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        return numbers;
    }
}
