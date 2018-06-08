/*
 * Copyright (c) 2018, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 递归实现未知维度集合的笛卡尔积
 *
 * @author mark
 * @date 2018年6月8日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */
public class Descartes {

    /**
     * 递归实现dimValue中的笛卡尔积，结果放在result中
     * 
     * @param dimValue 原始数据
     * @param result 结果数据
     * @param layer dimValue的层数
     * @param curList 每次笛卡尔积的结果
     */
    private void recursive(List<List<String>> dimValue, List<List<String>> result, int layer, List<String> curList) {
        if (layer < dimValue.size() - 1) {
            if (dimValue.get(layer).size() == 0) {
                recursive(dimValue, result, layer + 1, curList);
            } else {
                for (int i = 0; i < dimValue.get(layer).size(); i++) {
                    List<String> list = new ArrayList<String>(curList);
                    list.add(dimValue.get(layer).get(i));
                    recursive(dimValue, result, layer + 1, list);
                }
            }
        } else if (layer == dimValue.size() - 1) {
            if (dimValue.get(layer).size() == 0) {
                result.add(curList);
            } else {
                for (int i = 0; i < dimValue.get(layer).size(); i++) {
                    List<String> list = new ArrayList<String>(curList);
                    list.add(dimValue.get(layer).get(i));
                    result.add(list);
                }
            }
        }
    }

    /**
     * 暴露方法包装
     * 
     * @param dimValue
     * @return
     */
    public List<List<String>> recursive(List<List<String>> dimValue) {
        List<List<String>> recursiveResult = new ArrayList<List<String>>();
        recursive(dimValue, recursiveResult, 0, new ArrayList<String>());
        return recursiveResult;
    }

}
