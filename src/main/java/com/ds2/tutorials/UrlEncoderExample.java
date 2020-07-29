package com.ds2.tutorials;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
//TODO - Java URL Encode – URLEncoder
public class UrlEncoderExample
{
    public static void main(String[] args)
    {
        // URL
        String url = "https://www.java.com/?name=Java Interview Point";

        try
        {
            // Encoding using encode()
            String encodedUrl = URLEncoder.encode(url, "UTF-8");

            System.out.println("Encoded Url : "+encodedUrl);
        } catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
    }
}
