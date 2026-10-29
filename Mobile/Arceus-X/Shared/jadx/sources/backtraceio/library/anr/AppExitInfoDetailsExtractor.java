package backtraceio.library.anr;

import backtraceio.library.logger.BacktraceLogger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class AppExitInfoDetailsExtractor {
    private static final String LOG_TAG = "AppExitInfoDetailsExtractor";

    public static HashMap<String, Object> getANRAttributes(ExitInfo exitInfo) {
        if (exitInfo == null) {
            return new HashMap<>();
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("description", exitInfo.getDescription());
        map.put("timestamp", getANRTimestamp(exitInfo));
        map.put("reason-code", Integer.valueOf(exitInfo.getReason()));
        map.put("reason", reasonCodeToDescription(exitInfo.getReason()));
        map.put("PID", Integer.valueOf(exitInfo.getPid()));
        map.put("Importance", Integer.valueOf(exitInfo.getImportance()));
        map.put("PSS", Long.valueOf(exitInfo.getPss()));
        map.put("RSS", Long.valueOf(exitInfo.getRss()));
        return map;
    }

    public static String getANRMessage(ExitInfo exitInfo) {
        return "Application Not Responding | Description: " + exitInfo.getDescription() + " | Timestamp: " + getANRTimestamp(exitInfo);
    }

    private static String getANRTimestamp(ExitInfo exitInfo) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(exitInfo.getTimestamp()));
    }

    public static String getStackTraceInfo(ExitInfo exitInfo) {
        InputStream streamOrNull = getStreamOrNull(exitInfo);
        if (streamOrNull == null) {
            BacktraceLogger.m7083w(LOG_TAG, "Unexpected null trace stream");
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(streamOrNull));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        return sb2.toString();
                    }
                    sb2.append(line);
                    sb2.append("\n");
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
                BacktraceLogger.m7082e(LOG_TAG, "Unexpected exception on getting stacktrace from exitInfo", e);
                return "";
            }
        } catch (Exception e10) {
            BacktraceLogger.m7082e(LOG_TAG, "Unexpected exception on getting stacktrace from exitInfo", e10);
            return "";
        }
    }

    private static InputStream getStreamOrNull(ExitInfo exitInfo) {
        try {
            return exitInfo.getTraceInputStream();
        } catch (IOException unused) {
            return null;
        }
    }

    private static String reasonCodeToDescription(int i10) {
        return i10 == 6 ? "anr" : "unsupported code";
    }
}
