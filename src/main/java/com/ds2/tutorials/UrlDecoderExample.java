package com.ds2.tutorials;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
//TODO - Java URL Decode – URLDecoder
public class UrlDecoderExample
{
    public static void main(String[] args)
    {
        // Encoded URL
        String encodedUrl = "https%3A%2F%2Fwww.java.com%2F%3Fname%3DJava+Interview+Point";

        try
        {
            // Decoding using decode()
            String decodedUrl = URLDecoder.decode(encodedUrl, "UTF-8");

            System.out.println("Decoded Url : "+decodedUrl);
        } catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
    }
}