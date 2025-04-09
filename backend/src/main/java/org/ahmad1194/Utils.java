package org.ahmad1194.core;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {
    public static String getVersion() {
        return "1.0.0";
    }
    
    public static String timestamp() {
        return LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
    }
}
