package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Loadprop
{
    static Properties prop;
    static FileInputStream input;
    //static String FileName = "test1config.properties";
    static String fileLocation = "src\\test\\Resources\\exceltestcases\\test1config.properties";

    public String getProperty(String key){
        prop = new Properties();

        try {
            input = new FileInputStream(fileLocation);
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);

    }




}
