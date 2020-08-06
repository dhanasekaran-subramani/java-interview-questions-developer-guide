package com.ds2.tutorials;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class JavaGetFileSizeUsingApacheCommonsIO {

    //TODO - Get file size using Apache Commons IO
    static final String FILE_NAME = "/Users/Dhana/Downloads/file.pdf";

    public static void main(String[] args) {
        File file = new File(FILE_NAME);

        long fileSize = FileUtils.sizeOf(file);

        System.out.println(fileSize + " bytes");
    }
}
