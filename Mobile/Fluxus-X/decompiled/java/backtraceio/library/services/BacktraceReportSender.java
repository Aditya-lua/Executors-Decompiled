package backtraceio.library.services;

import backtraceio.library.common.BacktraceSerializeHelper;
import backtraceio.library.common.BacktraceStringHelper;
import backtraceio.library.common.MultiFormRequestHelper;
import backtraceio.library.common.RequestHelper;
import backtraceio.library.events.OnServerErrorEventListener;
import backtraceio.library.http.HttpHelper;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceApiResult;
import backtraceio.library.models.BacktraceResult;
import backtraceio.library.models.json.BacktraceReport;
import backtraceio.library.models.metrics.EventsPayload;
import backtraceio.library.models.metrics.EventsResult;
import backtraceio.library.models.types.BacktraceResultStatus;
import backtraceio.library.models.types.HttpException;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class BacktraceReportSender {
    private static final int CHUNK_SIZE = 131072;
    private static final String LOG_TAG = "BacktraceReportSender";

    public static EventsResult sendEvents(String str, String str2, EventsPayload eventsPayload, OnServerErrorEventListener onServerErrorEventListener) throws Throwable {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
                    try {
                        httpURLConnection2.setRequestMethod("POST");
                        httpURLConnection2.setUseCaches(false);
                        httpURLConnection2.setDoOutput(true);
                        httpURLConnection2.setDoInput(true);
                        httpURLConnection2.setRequestProperty("Connection", "Keep-Alive");
                        httpURLConnection2.setRequestProperty("Content-Type", RequestHelper.getContentType());
                        String str3 = LOG_TAG;
                        BacktraceLogger.d(str3, "HttpURLConnection successfully initialized");
                        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                        RequestHelper.addJson(dataOutputStream, str2);
                        RequestHelper.addEndOfRequest(dataOutputStream);
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        int responseCode = httpURLConnection2.getResponseCode();
                        BacktraceLogger.d(str3, "Received response status from Backtrace API for HTTP request is: " + responseCode);
                        if (responseCode == 200) {
                            EventsResult eventsResult = new EventsResult(eventsPayload, httpURLConnection2.getResponseMessage(), BacktraceResultStatus.Ok, responseCode);
                            httpURLConnection2.disconnect();
                            BacktraceLogger.d(str3, "Disconnecting HttpUrlConnection successful");
                            return eventsResult;
                        }
                        String responseMessage = HttpHelper.getResponseMessage(httpURLConnection2);
                        if (BacktraceStringHelper.isNullOrEmpty(responseMessage)) {
                            responseMessage = httpURLConnection2.getResponseMessage();
                        }
                        throw new HttpException(Integer.valueOf(responseCode), String.format("%s: %s", Integer.valueOf(responseCode), responseMessage));
                    } catch (Exception e10) {
                        e = e10;
                        httpURLConnection = httpURLConnection2;
                        if (onServerErrorEventListener != null) {
                            BacktraceLogger.d(LOG_TAG, "Custom handler on server error");
                            onServerErrorEventListener.onEvent(e);
                        }
                        String str4 = LOG_TAG;
                        BacktraceLogger.e(str4, "Sending HTTP request failed to Backtrace API", e);
                        BacktraceLogger.e(str4, "Failed HTTP request URL " + str);
                        EventsResult eventsResultOnError = EventsResult.OnError(eventsPayload, e, -1);
                        if (httpURLConnection == null) {
                            return eventsResultOnError;
                        }
                        httpURLConnection.disconnect();
                        BacktraceLogger.d(str4, "Disconnecting HttpUrlConnection successful");
                        return eventsResultOnError;
                    } catch (Throwable th2) {
                        th = th2;
                        httpURLConnection = httpURLConnection2;
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                                BacktraceLogger.d(LOG_TAG, "Disconnecting HttpUrlConnection successful");
                            } catch (Exception e11) {
                                BacktraceLogger.e(LOG_TAG, "Disconnecting HttpUrlConnection failed", e11);
                                EventsResult.OnError(eventsPayload, e11, -1);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Exception e13) {
            BacktraceLogger.e(LOG_TAG, "Disconnecting HttpUrlConnection failed", e13);
            return EventsResult.OnError(eventsPayload, e13, -1);
        }
    }

    public static BacktraceResult sendReport(String str, String str2, List<String> list, BacktraceReport backtraceReport, OnServerErrorEventListener onServerErrorEventListener) throws Throwable {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
                    try {
                        httpURLConnection2.setRequestMethod("POST");
                        httpURLConnection2.setUseCaches(false);
                        httpURLConnection2.setDoOutput(true);
                        httpURLConnection2.setDoInput(true);
                        httpURLConnection2.setChunkedStreamingMode(CHUNK_SIZE);
                        httpURLConnection2.setRequestProperty("Connection", "Keep-Alive");
                        httpURLConnection2.setRequestProperty("Cache-Control", "no-cache");
                        httpURLConnection2.setRequestProperty("Content-Type", MultiFormRequestHelper.getContentType());
                        String str3 = LOG_TAG;
                        BacktraceLogger.d(str3, "HttpURLConnection successfully initialized");
                        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                        MultiFormRequestHelper.addJson(dataOutputStream, str2);
                        MultiFormRequestHelper.addFiles(dataOutputStream, list);
                        MultiFormRequestHelper.addEndOfRequest(dataOutputStream);
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        int responseCode = httpURLConnection2.getResponseCode();
                        BacktraceLogger.d(str3, "Received response status from Backtrace API for HTTP request is: " + responseCode);
                        if (responseCode != 200) {
                            String responseMessage = HttpHelper.getResponseMessage(httpURLConnection2);
                            if (BacktraceStringHelper.isNullOrEmpty(responseMessage)) {
                                responseMessage = httpURLConnection2.getResponseMessage();
                            }
                            throw new HttpException(Integer.valueOf(responseCode), String.format("%s: %s", Integer.valueOf(responseCode), responseMessage));
                        }
                        BacktraceResult backtraceResult = new BacktraceResult((BacktraceApiResult) BacktraceSerializeHelper.fromJson(HttpHelper.getResponseMessage(httpURLConnection2), BacktraceApiResult.class));
                        backtraceResult.setBacktraceReport(backtraceReport);
                        httpURLConnection2.disconnect();
                        BacktraceLogger.d(str3, "Disconnecting HttpUrlConnection successful");
                        return backtraceResult;
                    } catch (Exception e10) {
                        e = e10;
                        httpURLConnection = httpURLConnection2;
                        if (onServerErrorEventListener != null) {
                            BacktraceLogger.d(LOG_TAG, "Custom handler on server error");
                            onServerErrorEventListener.onEvent(e);
                        }
                        String str4 = LOG_TAG;
                        BacktraceLogger.e(str4, "Sending HTTP request failed to Backtrace API", e);
                        BacktraceResult backtraceResultOnError = BacktraceResult.OnError(backtraceReport, e);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                            BacktraceLogger.d(str4, "Disconnecting HttpUrlConnection successful");
                        }
                        return backtraceResultOnError;
                    } catch (Throwable th2) {
                        th = th2;
                        httpURLConnection = httpURLConnection2;
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                                BacktraceLogger.d(LOG_TAG, "Disconnecting HttpUrlConnection successful");
                            } catch (Exception e11) {
                                BacktraceLogger.e(LOG_TAG, "Disconnecting HttpUrlConnection failed", e11);
                                BacktraceResult.OnError(backtraceReport, e11);
                            }
                        }
                        throw th;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e13) {
            BacktraceLogger.e(LOG_TAG, "Disconnecting HttpUrlConnection failed", e13);
            return BacktraceResult.OnError(backtraceReport, e13);
        }
    }
}
