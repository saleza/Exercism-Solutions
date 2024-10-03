public class LogLevels {
    
    public static String message(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.message() method");
        String[] newLogLine = logLine.split(": ");
        return newLogLine[1].trim();
    }

    public static String logLevel(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.logLevel() method");
        String errorWord = logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]"));
        return errorWord.toLowerCase();
    }

    public static String reformat(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLevels.reformat() method");
        String[] newLogLine = logLine.split(": ");
        String newLine = message(logLine).replaceAll("[\t\r\n]","");
        String errorWord = " (" + logLevel(logLine) + ")";
        return newLine.concat(errorWord);
    }
}
