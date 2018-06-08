/*
 * Copyright (c) 2018, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.sort;

/**
 * 选择排序
 * 
 * @author mark
 * @date 2018年6月8日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */
public class SelectSort {

    /**
     * 选择排序
     * 
     * 在未排序序列中找到最小元素，存放到排序序列的起始位置
     * 再从剩余未排序元素中继续寻找最小元素，然后放到排序序列末尾。
     * 以此类推，直到所有元素均排序完毕。
     * 
     */
    public static int[] sort(int[] numbers) {
        int size = numbers.length, temp;
        for (int i = 0; i < size; i++) {
            int k = i;
            for (int j = size - 1; j > i; j--) {
                if (numbers[j] < numbers[k])
                    k = j;
            }
            temp = numbers[i];
            numbers[i] = numbers[k];
            numbers[k] = temp;
        }

        return numbers;
    }

}
