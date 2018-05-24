package com.river.bend.collection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String[] args) throws IOException {
        Properties pps = new Properties();

        pps.load(new FileInputStream("Test.properteis"));

        Enumeration enumeration = pps.propertyNames();

        while(enumeration.hasMoreElements()){
            String strKey = (String)enumeration.nextElement();
        }
    }
}
