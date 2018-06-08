/*
 * Copyright (c) 2018, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.sort;

/**
 * 直接插入排序
 * 
 * @author mark
 * @date 2018年6月8日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */
public class InsertSort {
    /**
     * 插入排序
     * 
     * 从第一个元素开始，该元素可以认为已经被排序
     * 取出下一个元素，在已经排序的元素序列中从后向前扫描
     * 如果该元素（已排序）大于新元素，将该元素移到下一位置
     * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
     * 将新元素插入到该位置中
     * 重复步骤2
     * 
     * @param numbers 需要排序的整型数组
     */
    public static int[] sort(int[] numbers) {
        int size = numbers.length, temp, j;
        for (int i = 1; i < size; i++) {
            temp = numbers[i];
            for (j = i; j > 0 && temp < numbers[j - 1]; j--)
                numbers[j] = numbers[j - 1];
            numbers[j] = temp;
        }

        return numbers;
    }
}
