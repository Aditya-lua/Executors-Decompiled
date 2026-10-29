package backtraceio.library.http;

import backtraceio.library.logger.BacktraceLogger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes.dex */
public class HttpHelper {
    private static final String LOG_TAG = "HttpHelper";

    public static String getResponseMessage(HttpURLConnection httpURLConnection) throws IOException {
        BacktraceLogger.m7080d(LOG_TAG, "Reading response from HTTP request");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getResponseCode() < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return sb2.toString();
            }
            sb2.append(line);
        }
    }
}
