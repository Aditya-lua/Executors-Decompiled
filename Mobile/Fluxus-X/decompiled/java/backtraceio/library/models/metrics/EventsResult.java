package backtraceio.library.models.metrics;

import backtraceio.library.models.types.BacktraceResultStatus;

/* JADX INFO: loaded from: classes.dex */
public class EventsResult {
    private EventsPayload eventsPayload;
    public String message;
    public BacktraceResultStatus status;
    private int statusCode;

    public EventsResult(EventsPayload eventsPayload, String str, BacktraceResultStatus backtraceResultStatus, int i10) {
        this.status = BacktraceResultStatus.Ok;
        this.statusCode = -1;
        setEventsPayload(eventsPayload);
        this.message = str;
        this.status = backtraceResultStatus;
        this.statusCode = i10;
    }

    public static EventsResult OnError(EventsPayload eventsPayload, Exception exc, int i10) {
        return new EventsResult(eventsPayload, exc.getMessage(), BacktraceResultStatus.ServerError, i10);
    }

    public EventsPayload getEventsPayload() {
        return this.eventsPayload;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setEventsPayload(EventsPayload eventsPayload) {
        this.eventsPayload = eventsPayload;
    }

    public void setStatusCode(int i10) {
        this.statusCode = i10;
    }
}
