/*
 * Copyright (c) 2018, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.funny;

/**
 * 输出金字塔
 * 
 * @author mark
 * @date 2018年6月8日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */
public class Pyramid {

    /**
     * 
     *     *
          ***
         *****
        *******
       *********
     * 
     * @param level 金字塔层数
     */
    public static void print(int level) {
        for (int i = 1; i <= level; i++) {
            for (int j = 1; j <= level - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }

    }

}
