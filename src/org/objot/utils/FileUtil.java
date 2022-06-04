package org.objot.utils;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FileUtil {

    public static File file;

    public static void setConfigFile(File file) {

    }

    public static void open(File file) throws IOException {
        Desktop desktop = Desktop.getDesktop();
        desktop.open(file);
    }

    public static void createConfigFile() {
        String path = System.getProperty("user.home") + "\\AppData\\Roaming\\";
        String path2 = path + "ObJot\\configs";
        File file1 = new File(path2);
        if (!file1.exists()) {
           file1.mkdirs();
           File file2 = new File(file1.getAbsolutePath());
           if (!file2.exists()) {
               try {
                   file2.createNewFile();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
        }
    }

    public static void write(String text) {

    }

    public static void getConfig() {

    }
}
