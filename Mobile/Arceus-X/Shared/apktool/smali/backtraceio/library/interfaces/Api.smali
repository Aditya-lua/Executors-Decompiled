.class public interface abstract Lbacktraceio/library/interfaces/Api;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract enableSummedEvents(Lbacktraceio/library/services/BacktraceMetrics;)Lbacktraceio/library/services/SummedEventsHandler;
.end method

.method public abstract enableUniqueEvents(Lbacktraceio/library/services/BacktraceMetrics;)Lbacktraceio/library/services/UniqueEventsHandler;
.end method

.method public abstract send(Lbacktraceio/library/models/BacktraceData;Lbacktraceio/library/events/OnServerResponseEventListener;)V
.end method

.method public abstract sendEventsPayload(Lbacktraceio/library/models/metrics/SummedEventsPayload;)V
.end method

.method public abstract sendEventsPayload(Lbacktraceio/library/models/metrics/UniqueEventsPayload;)V
.end method

.method public abstract setOnServerError(Lbacktraceio/library/events/OnServerErrorEventListener;)V
.end method

.method public abstract setRequestHandler(Lbacktraceio/library/events/RequestHandler;)V
.end method

.method public abstract setSummedEventsOnServerResponse(Lbacktraceio/library/events/EventsOnServerResponseEventListener;)V
.end method

.method public abstract setSummedEventsRequestHandler(Lbacktraceio/library/events/EventsRequestHandler;)V
.end method

.method public abstract setUniqueEventsOnServerResponse(Lbacktraceio/library/events/EventsOnServerResponseEventListener;)V
.end method

.method public abstract setUniqueEventsRequestHandler(Lbacktraceio/library/events/EventsRequestHandler;)V
.end method
