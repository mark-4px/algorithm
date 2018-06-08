/*
 * Copyright (c) 2018, mark and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.mark.crypto;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * commons codec进行加密
 * @author mark
 * @date 2018年6月8日
 * @site www.mark.ah.cn
 * @email mark@mark.ah.cn
 */
public class CodecDemo {

    public static void main(String[] args) {
        String str = "abcd"; // 待加密字符串
        
        // 1、MD5加密
        String md5Str = DigestUtils.md5Hex(str);
        System.out.println("MD5-->" + md5Str);
        
        // SHA1加密
        String sha1Str = DigestUtils.sha1Hex(str);
        System.out.println("SHA1-->" + sha1Str);
        
        // Base64加密
        String base64Str = Base64.encodeBase64String(str.getBytes());
        System.out.println("base64加密-->" + base64Str);
        
        // Base64解密
        String base64DecodeStr = new String(Base64.decodeBase64(base64Str));
        System.out.println("base64解密-->" + base64DecodeStr);
    }

}
