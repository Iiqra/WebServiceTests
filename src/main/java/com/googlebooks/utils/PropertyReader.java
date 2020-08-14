package com.googlebooks.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    protected static Properties prop;

    public PropertyReader() {
        try{
            prop = new Properties();
            FileInputStream ipStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources"
                    + "/config/config.properties");
            prop.load(ipStream);
        }
        catch (IOException exc){
            exc.printStackTrace();
        }
    }
}
