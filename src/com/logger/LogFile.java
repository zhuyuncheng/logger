package com.logger;

import java.io.*;

public class LogFile {

    public void WriteLoggToFile(String logFile, String msg) {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/Users/xiaofengzi/Desktop/log/" + logFile + ".log", true)));
            out.write(msg + '\n');
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
