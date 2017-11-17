package com.logger;

import java.text.SimpleDateFormat;

public class Logger extends Thread {

    public final String DATE_PATTERN_FULL = "yyyy-MM-dd HH:mm:ss";

    private static LogFile logFile;

    private Logger() {
        logFile = new LogFile();
    }

    public static Logger getLogger() {
        return new Logger();
    }

    public void info(String msg, String... args) {
        logFile.WriteLoggToFile(fileName(), Level.INFO.name() + "-" + fileName() + msg);
    }

    public void debug(String msg, String... args) {
        logFile.WriteLoggToFile(fileName(), Level.DUBUG.name() + "-" + fileName() + msg);

    }

    public void error(String msg, String... args) {
        logFile.WriteLoggToFile(fileName(), Level.ERROR.name() + "-" + fileName() + msg);

    }

    private String fileName() {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_PATTERN_FULL);
        String fileName = sdf.format(System.currentTimeMillis());
        return fileName;
    }

}

enum Level {
    INFO, DUBUG, ERROR;
}
