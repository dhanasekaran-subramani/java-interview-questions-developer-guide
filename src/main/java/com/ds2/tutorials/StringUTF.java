package com.ds2.tutorials;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class StringUTF {
//TODO - Java URL Decode – URLDecoder
    public static void main(String[] args)
    {
        try {
            String result = java.net.URLDecoder.decode("https:0x30x3sales.payments.rabobank.nl0x3dopa-config-war0x3ws0x3LoadRPKConfigData/rparam=IntegrationId=", StandardCharsets.UTF_16LE.name());
            System.out.println("result -- " +result);
        } catch (UnsupportedEncodingException e) {
            // not going to happen - value came from JDK's own StandardCharsets
        }
    }
}
