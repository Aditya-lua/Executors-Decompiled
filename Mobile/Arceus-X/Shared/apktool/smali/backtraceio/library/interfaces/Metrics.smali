.class public interface abstract Lbacktraceio/library/interfaces/Metrics;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract addSummedEvent(Ljava/lang/String;)Z
.end method

.method public abstract addSummedEvent(Ljava/lang/String;Ljava/util/Map;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract addUniqueEvent(Ljava/lang/String;)Z
.end method

.method public abstract addUniqueEvent(Ljava/lang/String;Ljava/util/Map;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract count()I
.end method

.method public abstract enable()V
.end method

.method public abstract enable(Lbacktraceio/library/models/BacktraceMetricsSettings;)V
.end method

.method public abstract enable(Lbacktraceio/library/models/BacktraceMetricsSettings;Ljava/lang/String;)V
.end method

.method public abstract enable(Ljava/lang/String;)V
.end method

.method public abstract getSummedEvents()Ljava/util/concurrent/ConcurrentLinkedDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentLinkedDeque<",
            "Lbacktraceio/library/models/metrics/SummedEvent;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getUniqueEvents()Ljava/util/concurrent/ConcurrentLinkedDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentLinkedDeque<",
            "Lbacktraceio/library/models/metrics/UniqueEvent;",
            ">;"
        }
    .end annotation
.end method

.method public abstract send()V
.end method

.method public abstract sendStartupEvent()V
.end method

.method public abstract setMaximumNumberOfEvents(I)V
.end method

.method public abstract setSummedEventsOnServerResponse(Lbacktraceio/library/events/EventsOnServerResponseEventListener;)V
.end method

.method public abstract setSummedEventsRequestHandler(Lbacktraceio/library/events/EventsRequestHandler;)V
.end method

.method public abstract setUniqueEventsOnServerResponse(Lbacktraceio/library/events/EventsOnServerResponseEventListener;)V
.end method

.method public abstract setUniqueEventsRequestHandler(Lbacktraceio/library/events/EventsRequestHandler;)V
.end method
