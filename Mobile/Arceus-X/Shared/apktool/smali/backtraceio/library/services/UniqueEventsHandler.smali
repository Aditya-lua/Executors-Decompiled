.class public Lbacktraceio/library/services/UniqueEventsHandler;
.super Lbacktraceio/library/services/BacktraceEventsHandler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbacktraceio/library/services/BacktraceEventsHandler<",
        "Lbacktraceio/library/models/metrics/UniqueEvent;",
        ">;"
    }
.end annotation


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String; = "UniqueEventsHandler"

.field private static final urlPrefix:Ljava/lang/String; = "unique-events"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lbacktraceio/library/services/BacktraceMetrics;Lbacktraceio/library/interfaces/Api;Lbacktraceio/library/services/BacktraceHandlerThread;)V
    .locals 1

    const-string v0, "unique-events"

    invoke-direct {p0, p1, p2, p3, v0}, Lbacktraceio/library/services/BacktraceEventsHandler;-><init>(Lbacktraceio/library/services/BacktraceMetrics;Lbacktraceio/library/interfaces/Api;Lbacktraceio/library/services/BacktraceHandlerThread;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic getCount()I
    .locals 1

    invoke-super {p0}, Lbacktraceio/library/services/BacktraceEventsHandler;->getCount()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getEventsPayload()Lbacktraceio/library/models/metrics/EventsPayload;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbacktraceio/library/services/UniqueEventsHandler;->getEventsPayload()Lbacktraceio/library/models/metrics/UniqueEventsPayload;

    move-result-object v0

    return-object v0
.end method

.method public getEventsPayload()Lbacktraceio/library/models/metrics/UniqueEventsPayload;
    .locals 5

    .line 2
    iget-object v0, p0, Lbacktraceio/library/services/BacktraceEventsHandler;->backtraceMetrics:Lbacktraceio/library/services/BacktraceMetrics;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lbacktraceio/library/services/BacktraceMetrics;->createLocalAttributes(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lbacktraceio/library/services/BacktraceEventsHandler;->events:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedDeque;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbacktraceio/library/models/metrics/UniqueEvent;

    .line 4
    invoke-static {}, Lbacktraceio/library/common/BacktraceTimeHelper;->getTimestampSeconds()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4, v0}, Lbacktraceio/library/models/metrics/UniqueEvent;->update(JLjava/util/Map;)V

    goto :goto_0

    .line 5
    :cond_0
    new-instance v0, Lbacktraceio/library/models/metrics/UniqueEventsPayload;

    iget-object v1, p0, Lbacktraceio/library/services/BacktraceEventsHandler;->events:Ljava/util/concurrent/ConcurrentLinkedDeque;

    iget-object v2, p0, Lbacktraceio/library/services/BacktraceEventsHandler;->backtraceMetrics:Lbacktraceio/library/services/BacktraceMetrics;

    invoke-virtual {v2}, Lbacktraceio/library/services/BacktraceMetrics;->getApplicationName()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lbacktraceio/library/services/BacktraceEventsHandler;->backtraceMetrics:Lbacktraceio/library/services/BacktraceMetrics;

    invoke-virtual {v3}, Lbacktraceio/library/services/BacktraceMetrics;->getApplicationVersion()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lbacktraceio/library/models/metrics/UniqueEventsPayload;-><init>(Ljava/util/concurrent/ConcurrentLinkedDeque;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic getMaximumNumberOfEvents()I
    .locals 1

    invoke-super {p0}, Lbacktraceio/library/services/BacktraceEventsHandler;->getMaximumNumberOfEvents()I

    move-result v0

    return v0
.end method

.method public bridge synthetic handleMessage(Landroid/os/Message;)V
    .locals 0

    invoke-super {p0, p1}, Lbacktraceio/library/services/BacktraceEventsHandler;->handleMessage(Landroid/os/Message;)V

    return-void
.end method

.method public bridge synthetic send()V
    .locals 0

    invoke-super {p0}, Lbacktraceio/library/services/BacktraceEventsHandler;->send()V

    return-void
.end method

.method public sendEvents(Ljava/util/concurrent/ConcurrentLinkedDeque;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ConcurrentLinkedDeque<",
            "Lbacktraceio/library/models/metrics/UniqueEvent;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lbacktraceio/library/services/UniqueEventsHandler;->getEventsPayload()Lbacktraceio/library/models/metrics/UniqueEventsPayload;

    move-result-object p1

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceEventsHandler;->api:Lbacktraceio/library/interfaces/Api;

    invoke-interface {v0, p1}, Lbacktraceio/library/interfaces/Api;->sendEventsPayload(Lbacktraceio/library/models/metrics/UniqueEventsPayload;)V

    return-void
.end method

.method public sendEventsPayload(Lbacktraceio/library/models/metrics/EventsPayload;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbacktraceio/library/models/metrics/EventsPayload<",
            "Lbacktraceio/library/models/metrics/UniqueEvent;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceEventsHandler;->api:Lbacktraceio/library/interfaces/Api;

    check-cast p1, Lbacktraceio/library/models/metrics/UniqueEventsPayload;

    invoke-interface {v0, p1}, Lbacktraceio/library/interfaces/Api;->sendEventsPayload(Lbacktraceio/library/models/metrics/UniqueEventsPayload;)V

    return-void
.end method

.method public bridge synthetic setMaximumNumberOfEvents(I)V
    .locals 0

    invoke-super {p0, p1}, Lbacktraceio/library/services/BacktraceEventsHandler;->setMaximumNumberOfEvents(I)V

    return-void
.end method
