package com.alexsobiek.logger;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;

public class LogUtil {
    public static Logger root() {
        return (Logger) org.slf4j.LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
    }

    public static void setLevel(Level level) {
        root().setLevel(level);
    }
}
