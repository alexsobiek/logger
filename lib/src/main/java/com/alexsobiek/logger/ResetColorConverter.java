package com.alexsobiek.logger;

import ch.qos.logback.classic.pattern.MessageConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class ResetColorConverter extends MessageConverter {
    @Override
    public String convert(ILoggingEvent event) {
        return Color.RESET.toString();
    }
}