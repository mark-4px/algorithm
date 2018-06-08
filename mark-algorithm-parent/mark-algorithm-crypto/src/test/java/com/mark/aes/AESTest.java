package com.mark.aes;

import org.junit.Test;

public class AESTest {

    @Test
    public void testMethod1() throws Exception {
        String orginal = "12345678abcdefgh";//length需要为16
        
        String encrypt = AES.method4Encode(orginal);
        
        System.out.println("orginal : " + orginal);
        System.out.println("encrypt : " + encrypt);
        
        String decode = AES.method4Decode(encrypt);
        System.out.println("decode : " + decode);
        
    }

    @Test
    public void testMethod2() {
    }

    @Test
    public void testMethod3() {
    }

    @Test
    public void testMethod4() {
    }

}
