package com.mark.algorithm;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class DescartesTest {

    @Test
    void testRecursive() {
        
        //颜色
        List<String> colorList = new ArrayList<String>();
        colorList.add("红色");
        colorList.add("绿色");
        colorList.add("黑色");
        colorList.add("蓝色");

        //尺寸
        List<String> sizeList = new ArrayList<String>();
        sizeList.add("S");
        sizeList.add("M");
        sizeList.add("L");
        sizeList.add("XL");
        sizeList.add("XXL");

        //款式
        List<String> brandList = new ArrayList<String>();
        brandList.add("长款");
        brandList.add("中款");
        brandList.add("短款");

        List<List<String>> dimValue = new ArrayList<List<String>>();
        dimValue.add(colorList);
        dimValue.add(sizeList);
        dimValue.add(brandList);

        List<List<String>> result = new Descartes().recursive(dimValue);

        StringBuilder builder = new StringBuilder();

        for (List<String> subSet : result) {
            builder.append("------------------------------------------").append("\n");
            for (String str : subSet) {
                builder.append("\t ").append(str);
            }
            builder.append("\n");
            builder.append("------------------------------------------").append("\n");
        }

        System.out.println(builder.toString());

    }

}
