package backtraceio.library.interfaces;

import backtraceio.library.events.EventsOnServerResponseEventListener;
import backtraceio.library.events.EventsRequestHandler;
import backtraceio.library.events.OnServerErrorEventListener;
import backtraceio.library.events.OnServerResponseEventListener;
import backtraceio.library.events.RequestHandler;
import backtraceio.library.models.BacktraceData;
import backtraceio.library.models.metrics.SummedEventsPayload;
import backtraceio.library.models.metrics.UniqueEventsPayload;
import backtraceio.library.services.BacktraceMetrics;
import backtraceio.library.services.SummedEventsHandler;
import backtraceio.library.services.UniqueEventsHandler;

/* JADX INFO: loaded from: classes.dex */
public interface Api {
    SummedEventsHandler enableSummedEvents(BacktraceMetrics backtraceMetrics);

    UniqueEventsHandler enableUniqueEvents(BacktraceMetrics backtraceMetrics);

    void send(BacktraceData backtraceData, OnServerResponseEventListener onServerResponseEventListener);

    void sendEventsPayload(SummedEventsPayload summedEventsPayload);

    void sendEventsPayload(UniqueEventsPayload uniqueEventsPayload);

    void setOnServerError(OnServerErrorEventListener onServerErrorEventListener);

    void setRequestHandler(RequestHandler requestHandler);

    void setSummedEventsOnServerResponse(EventsOnServerResponseEventListener eventsOnServerResponseEventListener);

    void setSummedEventsRequestHandler(EventsRequestHandler eventsRequestHandler);

    void setUniqueEventsOnServerResponse(EventsOnServerResponseEventListener eventsOnServerResponseEventListener);

    void setUniqueEventsRequestHandler(EventsRequestHandler eventsRequestHandler);
}
