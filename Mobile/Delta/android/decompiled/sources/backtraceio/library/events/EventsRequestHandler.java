package backtraceio.library.events;

import backtraceio.library.models.metrics.EventsPayload;
import backtraceio.library.models.metrics.EventsResult;

/* JADX INFO: loaded from: classes.dex */
public interface EventsRequestHandler {
    EventsResult onRequest(EventsPayload eventsPayload);
}
