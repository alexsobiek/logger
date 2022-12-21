package com.alexsobiek.logger;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.pattern.MessageConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class ColorConverter extends MessageConverter {
    @Override
    public String convert(ILoggingEvent event) {
        return enhance(event).toString();
    }

    private Color enhance(ILoggingEvent event) {
        Level level = event.getLevel();
        if (level == Level.ERROR) return Color.RED;
        else if (level == Level.WARN) return Color.YELLOW;
        else if (level == Level.INFO) return Color.WHITE;
        else if (level == Level.DEBUG) return Color.BLUE;
        else if (level == Level.TRACE) return Color.GREEN;
        else return Color.WHITE;
    }
}