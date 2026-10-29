package backtraceio.library.services;

import android.os.Handler;
import android.os.Message;
import backtraceio.library.common.BacktraceMathHelper;
import backtraceio.library.common.BacktraceSerializeHelper;
import backtraceio.library.interfaces.Api;
import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.metrics.Event;
import backtraceio.library.models.metrics.EventsPayload;
import backtraceio.library.models.metrics.EventsResult;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: loaded from: classes.dex */
abstract class BacktraceEventsHandler<T extends Event> extends Handler {
    private static final transient String LOG_TAG = "BacktraceEventsHandler";
    protected final Api api;
    protected final BacktraceHandlerThread backtraceHandlerThread;
    protected final BacktraceMetrics backtraceMetrics;
    protected ConcurrentLinkedDeque<T> events;
    private int maximumNumberOfEvents;
    private final String submissionUrl;
    private final int timeBetweenRetriesMillis;

    public BacktraceEventsHandler(BacktraceMetrics backtraceMetrics, Api api, BacktraceHandlerThread backtraceHandlerThread, String str) {
        super(backtraceHandlerThread.getLooper());
        this.events = new ConcurrentLinkedDeque<>();
        this.maximumNumberOfEvents = 350;
        if (!backtraceHandlerThread.isAlive()) {
            throw new NullPointerException("Handler thread is not alive, this should not happen");
        }
        this.backtraceMetrics = backtraceMetrics;
        this.backtraceHandlerThread = backtraceHandlerThread;
        this.api = api;
        this.submissionUrl = backtraceMetrics.settings.getSubmissionUrl(str);
        this.timeBetweenRetriesMillis = backtraceMetrics.settings.getTimeBetweenRetriesMillis();
        final long timeIntervalMillis = backtraceMetrics.settings.getTimeIntervalMillis();
        if (timeIntervalMillis != 0) {
            postDelayed(new Runnable() { // from class: backtraceio.library.services.BacktraceEventsHandler.1
                @Override // java.lang.Runnable
                public void run() {
                    this.send();
                    this.postDelayed(this, timeIntervalMillis);
                }
            }, timeIntervalMillis);
        }
    }

    private long calculateNextRetryTime(int i10) {
        double dClamp = BacktraceMathHelper.clamp(((double) this.timeBetweenRetriesMillis) * Math.pow(10.0d, i10 - 1), 0.0d, 300000.0d);
        return (long) BacktraceMathHelper.uniform(dClamp, (1.0d * dClamp) + dClamp);
    }

    private EventsResult getEventsResult(BacktraceHandlerInputEvents backtraceHandlerInputEvents) {
        if (backtraceHandlerInputEvents.eventsRequestHandler != null) {
            BacktraceLogger.m7080d(LOG_TAG, "Sending using custom request handler");
            return backtraceHandlerInputEvents.eventsRequestHandler.onRequest(backtraceHandlerInputEvents.payload);
        }
        BacktraceLogger.m7080d(LOG_TAG, "Sending report using default request handler");
        return BacktraceReportSender.sendEvents(this.submissionUrl, BacktraceSerializeHelper.toJson(backtraceHandlerInputEvents.payload), backtraceHandlerInputEvents.payload, backtraceHandlerInputEvents.serverErrorEventListener);
    }

    private void retrySendEvents(final BacktraceHandlerInputEvents backtraceHandlerInputEvents, int i10) {
        if (i10 <= 501 || i10 == 505) {
            return;
        }
        EventsPayload eventsPayload = backtraceHandlerInputEvents.payload;
        final int i11 = eventsPayload.numRetries + 1;
        eventsPayload.numRetries = i11;
        if (i11 >= 3 || this.timeBetweenRetriesMillis == 0) {
            onMaximumAttemptsReached(eventsPayload.getEvents());
        } else {
            postDelayed(new Runnable() { // from class: backtraceio.library.services.BacktraceEventsHandler.2
                @Override // java.lang.Runnable
                public void run() {
                    EventsPayload<T> eventsPayload2 = backtraceHandlerInputEvents.payload;
                    eventsPayload2.setDroppedEvents(i11);
                    BacktraceEventsHandler.this.sendEventsPayload(eventsPayload2);
                }
            }, calculateNextRetryTime(i11));
        }
    }

    public int getCount() {
        return this.events.size();
    }

    public abstract EventsPayload<T> getEventsPayload();

    public int getMaximumNumberOfEvents() {
        return this.maximumNumberOfEvents;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        BacktraceHandlerInputEvents backtraceHandlerInputEvents = (BacktraceHandlerInputEvents) message.obj;
        EventsResult eventsResult = getEventsResult(backtraceHandlerInputEvents);
        if (backtraceHandlerInputEvents.eventsOnServerResponseEventListener != null) {
            BacktraceLogger.m7080d(LOG_TAG, "Processing result using custom event");
            backtraceHandlerInputEvents.eventsOnServerResponseEventListener.onEvent(eventsResult);
        }
        retrySendEvents(backtraceHandlerInputEvents, eventsResult.getStatusCode());
    }

    public void onMaximumAttemptsReached(ConcurrentLinkedDeque<T> concurrentLinkedDeque) {
    }

    public void send() {
        ConcurrentLinkedDeque<T> concurrentLinkedDeque = this.events;
        if (concurrentLinkedDeque == null || concurrentLinkedDeque.size() == 0) {
            return;
        }
        sendEvents(this.events);
    }

    public abstract void sendEvents(ConcurrentLinkedDeque<T> concurrentLinkedDeque);

    public abstract void sendEventsPayload(EventsPayload<T> eventsPayload);

    public void setMaximumNumberOfEvents(int i10) {
        this.maximumNumberOfEvents = i10;
    }
}
