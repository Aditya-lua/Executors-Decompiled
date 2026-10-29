package backtraceio.library.common;

import backtraceio.library.logger.BacktraceLogger;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class RequestHelper {
    private static final String CRLF = "\r\n";
    private static final String ENCODING = "utf-8";
    private static final transient String LOG_TAG = "RequestHelper";

    public static void addEndOfRequest(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            BacktraceLogger.m7083w(LOG_TAG, "Output stream is null");
        } else {
            outputStream.write(CRLF.getBytes());
        }
    }

    public static void addJson(OutputStream outputStream, String str) throws IOException {
        if (BacktraceStringHelper.isNullOrEmpty(str)) {
            BacktraceLogger.m7083w(LOG_TAG, "JSON is null or empty");
        } else if (outputStream == null) {
            BacktraceLogger.m7083w(LOG_TAG, "Output stream is null");
        } else {
            outputStream.write(str.getBytes(ENCODING));
        }
    }

    public static String getContentType() {
        return "application/json";
    }
}
