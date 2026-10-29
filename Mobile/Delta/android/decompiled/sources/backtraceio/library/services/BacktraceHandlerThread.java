package backtraceio.library.services;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import backtraceio.library.common.BacktraceSerializeHelper;
import backtraceio.library.interfaces.Api;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceDataAttachmentsFileHelper;
import backtraceio.library.models.BacktraceResult;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceHandlerThread extends HandlerThread {
    private static final transient String LOG_TAG = "BacktraceHandlerThread";
    private final transient Context context;
    private BacktraceHandler mHandler;
    private SummedEventsHandler mSummedEventsHandler;
    private UniqueEventsHandler mUniqueEventsHandler;
    private final String url;

    public class BacktraceHandler extends Handler {
        private final transient String LOG_TAG;
        private final transient Context context;
        String url;

        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            BacktraceResult backtraceResultSendReport;
            BacktraceHandlerInputReport backtraceHandlerInputReport = (BacktraceHandlerInputReport) message.obj;
            if (backtraceHandlerInputReport.requestHandler != null) {
                BacktraceLogger.d(this.LOG_TAG, "Sending using custom request handler");
                backtraceResultSendReport = backtraceHandlerInputReport.requestHandler.onRequest(backtraceHandlerInputReport.data);
            } else {
                BacktraceLogger.d(this.LOG_TAG, "Sending report using default request handler");
                backtraceResultSendReport = BacktraceReportSender.sendReport(this.url, BacktraceSerializeHelper.toJson(backtraceHandlerInputReport.data), BacktraceDataAttachmentsFileHelper.getValidAttachments(this.context, backtraceHandlerInputReport.data), backtraceHandlerInputReport.data.getReport(), backtraceHandlerInputReport.serverErrorEventListener);
            }
            if (backtraceHandlerInputReport.serverResponseEventListener != null) {
                BacktraceLogger.d(this.LOG_TAG, "Processing result using custom event");
                backtraceHandlerInputReport.serverResponseEventListener.onEvent(backtraceResultSendReport);
            }
        }

        private BacktraceHandler(Context context, Looper looper, String str) {
            super(looper);
            this.LOG_TAG = BacktraceHandler.class.getSimpleName();
            this.context = context;
            this.url = str;
        }
    }

    public BacktraceHandlerThread(Context context, String str, String str2) {
        super(str);
        this.url = str2;
        this.context = context;
        start();
    }

    public Message createMessage(BacktraceHandlerInput backtraceHandlerInput) {
        Message message = new Message();
        message.obj = backtraceHandlerInput;
        return message;
    }

    public SummedEventsHandler createSummedEventsHandler(BacktraceMetrics backtraceMetrics, Api api) {
        SummedEventsHandler summedEventsHandler = new SummedEventsHandler(backtraceMetrics, api, this);
        this.mSummedEventsHandler = summedEventsHandler;
        return summedEventsHandler;
    }

    public UniqueEventsHandler createUniqueEventsHandler(BacktraceMetrics backtraceMetrics, Api api) {
        UniqueEventsHandler uniqueEventsHandler = new UniqueEventsHandler(backtraceMetrics, api, this);
        this.mUniqueEventsHandler = uniqueEventsHandler;
        return uniqueEventsHandler;
    }

    @Override // android.os.HandlerThread
    public void onLooperPrepared() {
        super.onLooperPrepared();
        if (this.mHandler == null) {
            this.mHandler = new BacktraceHandler(this.context, getLooper(), this.url);
        }
    }

    public void sendReport(BacktraceHandlerInputReport backtraceHandlerInputReport) {
        BacktraceHandlerThread backtraceHandlerThread;
        if (this.mHandler == null) {
            backtraceHandlerThread = this;
            backtraceHandlerThread.mHandler = new BacktraceHandler(this.context, getLooper(), this.url);
        } else {
            backtraceHandlerThread = this;
        }
        backtraceHandlerThread.mHandler.sendMessage(createMessage(backtraceHandlerInputReport));
    }

    public void sendSummedEvents(BacktraceHandlerInputEvents backtraceHandlerInputEvents) {
        this.mSummedEventsHandler.sendMessage(createMessage(backtraceHandlerInputEvents));
    }

    public void sendUniqueEvents(BacktraceHandlerInputEvents backtraceHandlerInputEvents) {
        this.mUniqueEventsHandler.sendMessage(createMessage(backtraceHandlerInputEvents));
    }
}
