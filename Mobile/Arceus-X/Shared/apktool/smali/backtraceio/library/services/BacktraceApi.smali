.class public Lbacktraceio/library/services/BacktraceApi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbacktraceio/library/interfaces/Api;


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String; = "BacktraceApi"


# instance fields
.field private onServerError:Lbacktraceio/library/events/OnServerErrorEventListener;

.field private final reportSubmissionUrl:Ljava/lang/String;

.field private requestHandler:Lbacktraceio/library/events/RequestHandler;

.field private summedEventsRequestHandler:Lbacktraceio/library/events/EventsRequestHandler;

.field private summedEventsServerResponse:Lbacktraceio/library/events/EventsOnServerResponseEventListener;

.field private final transient threadSender:Lbacktraceio/library/services/BacktraceHandlerThread;

.field private uniqueEventsRequestHandler:Lbacktraceio/library/events/EventsRequestHandler;

.field private uniqueEventsServerResponse:Lbacktraceio/library/events/EventsOnServerResponseEventListener;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lj6/b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lbacktraceio/library/services/BacktraceApi;->onServerError:Lbacktraceio/library/events/OnServerErrorEventListener;

    iput-object v0, p0, Lbacktraceio/library/services/BacktraceApi;->requestHandler:Lbacktraceio/library/events/RequestHandler;

    iput-object v0, p0, Lbacktraceio/library/services/BacktraceApi;->uniqueEventsRequestHandler:Lbacktraceio/library/events/EventsRequestHandler;

    iput-object v0, p0, Lbacktraceio/library/services/BacktraceApi;->summedEventsRequestHandler:Lbacktraceio/library/events/EventsRequestHandler;

    iput-object v0, p0, Lbacktraceio/library/services/BacktraceApi;->uniqueEventsServerResponse:Lbacktraceio/library/events/EventsOnServerResponseEventListener;

    iput-object v0, p0, Lbacktraceio/library/services/BacktraceApi;->summedEventsServerResponse:Lbacktraceio/library/events/EventsOnServerResponseEventListener;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lj6/b;->f()Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lbacktraceio/library/services/BacktraceApi;->reportSubmissionUrl:Ljava/lang/String;

    new-instance v0, Lbacktraceio/library/services/BacktraceHandlerThread;

    const-class v1, Lbacktraceio/library/services/BacktraceHandlerThread;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1, p2}, Lbacktraceio/library/services/BacktraceHandlerThread;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lbacktraceio/library/services/BacktraceApi;->threadSender:Lbacktraceio/library/services/BacktraceHandlerThread;

    return-void

    :cond_0
    sget-object p1, Lbacktraceio/library/services/BacktraceApi;->LOG_TAG:Ljava/lang/String;

    const-string p2, "BacktraceCredentials parameter passed to BacktraceApi constructor is null"

    invoke-static {p1, p2}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "BacktraceCredentials cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public enableSummedEvents(Lbacktraceio/library/services/BacktraceMetrics;)Lbacktraceio/library/services/SummedEventsHandler;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceApi;->threadSender:Lbacktraceio/library/services/BacktraceHandlerThread;

    invoke-virtual {v0, p1, p0}, Lbacktraceio/library/services/BacktraceHandlerThread;->createSummedEventsHandler(Lbacktraceio/library/services/BacktraceMetrics;Lbacktraceio/library/interfaces/Api;)Lbacktraceio/library/services/SummedEventsHandler;

    move-result-object p1

    return-object p1
.end method

.method public enableUniqueEvents(Lbacktraceio/library/services/BacktraceMetrics;)Lbacktraceio/library/services/UniqueEventsHandler;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceApi;->threadSender:Lbacktraceio/library/services/BacktraceHandlerThread;

    invoke-virtual {v0, p1, p0}, Lbacktraceio/library/services/BacktraceHandlerThread;->createUniqueEventsHandler(Lbacktraceio/library/services/BacktraceMetrics;Lbacktraceio/library/interfaces/Api;)Lbacktraceio/library/services/UniqueEventsHandler;

    move-result-object p1

    return-object p1
.end method

.method public send(Lbacktraceio/library/models/BacktraceData;Lbacktraceio/library/events/OnServerResponseEventListener;)V
    .locals 3

    new-instance v0, Lbacktraceio/library/services/BacktraceHandlerInputReport;

    iget-object v1, p0, Lbacktraceio/library/services/BacktraceApi;->onServerError:Lbacktraceio/library/events/OnServerErrorEventListener;

    iget-object v2, p0, Lbacktraceio/library/services/BacktraceApi;->requestHandler:Lbacktraceio/library/events/RequestHandler;

    invoke-direct {v0, p1, p2, v1, v2}, Lbacktraceio/library/services/BacktraceHandlerInputReport;-><init>(Lbacktraceio/library/models/BacktraceData;Lbacktraceio/library/events/OnServerResponseEventListener;Lbacktraceio/library/events/OnServerErrorEventListener;Lbacktraceio/library/events/RequestHandler;)V

    iget-object p1, p0, Lbacktraceio/library/services/BacktraceApi;->threadSender:Lbacktraceio/library/services/BacktraceHandlerThread;

    invoke-virtual {p1, v0}, Lbacktraceio/library/services/BacktraceHandlerThread;->sendReport(Lbacktraceio/library/services/BacktraceHandlerInputReport;)V

    return-void
.end method

.method public sendEventsPayload(Lbacktraceio/library/models/metrics/SummedEventsPayload;)V
    .locals 4

    .line 3
    new-instance v0, Lbacktraceio/library/services/BacktraceHandlerInputEvents;

    iget-object v1, p0, Lbacktraceio/library/services/BacktraceApi;->summedEventsServerResponse:Lbacktraceio/library/events/EventsOnServerResponseEventListener;

    iget-object v2, p0, Lbacktraceio/library/services/BacktraceApi;->onServerError:Lbacktraceio/library/events/OnServerErrorEventListener;

    iget-object v3, p0, Lbacktraceio/library/services/BacktraceApi;->summedEventsRequestHandler:Lbacktraceio/library/events/EventsRequestHandler;

    invoke-direct {v0, p1, v1, v2, v3}, Lbacktraceio/library/services/BacktraceHandlerInputEvents;-><init>(Lbacktraceio/library/models/metrics/EventsPayload;Lbacktraceio/library/events/EventsOnServerResponseEventListener;Lbacktraceio/library/events/OnServerErrorEventListener;Lbacktraceio/library/events/EventsRequestHandler;)V

    .line 4
    iget-object p1, p0, Lbacktraceio/library/services/BacktraceApi;->threadSender:Lbacktraceio/library/services/BacktraceHandlerThread;

    invoke-virtual {p1, v0}, Lbacktraceio/library/services/BacktraceHandlerThread;->sendSummedEvents(Lbacktraceio/library/services/BacktraceHandlerInputEvents;)V

    return-void
.end method

.method public sendEventsPayload(Lbacktraceio/library/models/metrics/UniqueEventsPayload;)V
    .locals 4

    .line 1
    new-instance v0, Lbacktraceio/library/services/BacktraceHandlerInputEvents;

    iget-object v1, p0, Lbacktraceio/library/services/BacktraceApi;->uniqueEventsServerResponse:Lbacktraceio/library/events/EventsOnServerResponseEventListener;

    iget-object v2, p0, Lbacktraceio/library/services/BacktraceApi;->onServerError:Lbacktraceio/library/events/OnServerErrorEventListener;

    iget-object v3, p0, Lbacktraceio/library/services/BacktraceApi;->uniqueEventsRequestHandler:Lbacktraceio/library/events/EventsRequestHandler;

    invoke-direct {v0, p1, v1, v2, v3}, Lbacktraceio/library/services/BacktraceHandlerInputEvents;-><init>(Lbacktraceio/library/models/metrics/EventsPayload;Lbacktraceio/library/events/EventsOnServerResponseEventListener;Lbacktraceio/library/events/OnServerErrorEventListener;Lbacktraceio/library/events/EventsRequestHandler;)V

    .line 2
    iget-object p1, p0, Lbacktraceio/library/services/BacktraceApi;->threadSender:Lbacktraceio/library/services/BacktraceHandlerThread;

    invoke-virtual {p1, v0}, Lbacktraceio/library/services/BacktraceHandlerThread;->sendUniqueEvents(Lbacktraceio/library/services/BacktraceHandlerInputEvents;)V

    return-void
.end method

.method public setOnServerError(Lbacktraceio/library/events/OnServerErrorEventListener;)V
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/services/BacktraceApi;->onServerError:Lbacktraceio/library/events/OnServerErrorEventListener;

    return-void
.end method

.method public setRequestHandler(Lbacktraceio/library/events/RequestHandler;)V
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/services/BacktraceApi;->requestHandler:Lbacktraceio/library/events/RequestHandler;

    return-void
.end method

.method public setSummedEventsOnServerResponse(Lbacktraceio/library/events/EventsOnServerResponseEventListener;)V
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/services/BacktraceApi;->summedEventsServerResponse:Lbacktraceio/library/events/EventsOnServerResponseEventListener;

    return-void
.end method

.method public setSummedEventsRequestHandler(Lbacktraceio/library/events/EventsRequestHandler;)V
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/services/BacktraceApi;->summedEventsRequestHandler:Lbacktraceio/library/events/EventsRequestHandler;

    return-void
.end method

.method public setUniqueEventsOnServerResponse(Lbacktraceio/library/events/EventsOnServerResponseEventListener;)V
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/services/BacktraceApi;->uniqueEventsServerResponse:Lbacktraceio/library/events/EventsOnServerResponseEventListener;

    return-void
.end method

.method public setUniqueEventsRequestHandler(Lbacktraceio/library/events/EventsRequestHandler;)V
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/services/BacktraceApi;->uniqueEventsRequestHandler:Lbacktraceio/library/events/EventsRequestHandler;

    return-void
.end method
