.class public final Lbacktraceio/library/services/BacktraceMetrics;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbacktraceio/library/interfaces/Metrics;


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String; = "BacktraceMetrics"

.field public static final defaultBaseUrl:Ljava/lang/String; = "https://events.backtrace.io/api"

.field public static final defaultTimeBetweenRetriesMs:I = 0x2710

.field public static final defaultTimeIntervalInMin:I = 0x1e

.field public static final defaultTimeIntervalMs:J = 0x1b7740L

.field public static final maxNumberOfAttempts:I = 0x3

.field public static final maxTimeBetweenRetriesMs:I = 0x493e0


# instance fields
.field private applicationName:Ljava/lang/String;

.field private applicationVersion:Ljava/lang/String;

.field private final backtraceApi:Lbacktraceio/library/interfaces/Api;

.field private final context:Landroid/content/Context;

.field private final credentials:Lj6/b;

.field customReportAttributes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final defaultUniqueEventName:Ljava/lang/String;

.field private enabled:Z

.field private maximumNumberOfEvents:I

.field settings:Lbacktraceio/library/models/BacktraceMetricsSettings;

.field private final startupSummedEventName:Ljava/lang/String;

.field private startupUniqueEventName:Ljava/lang/String;

.field public summedEventsHandler:Lbacktraceio/library/services/SummedEventsHandler;

.field public uniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/Map;Lbacktraceio/library/interfaces/Api;Lj6/b;)V
    .locals 2
    .param p2    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lbacktraceio/library/interfaces/Api;",
            "Lj6/b;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "guid"

    iput-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->defaultUniqueEventName:Ljava/lang/String;

    const-string v1, "Application Launches"

    iput-object v1, p0, Lbacktraceio/library/services/BacktraceMetrics;->startupSummedEventName:Ljava/lang/String;

    const/4 v1, 0x0

    iput-object v1, p0, Lbacktraceio/library/services/BacktraceMetrics;->settings:Lbacktraceio/library/models/BacktraceMetricsSettings;

    iput-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->startupUniqueEventName:Ljava/lang/String;

    const/16 v0, 0x15e

    iput v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->maximumNumberOfEvents:I

    iput-object p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->context:Landroid/content/Context;

    iput-object p2, p0, Lbacktraceio/library/services/BacktraceMetrics;->customReportAttributes:Ljava/util/Map;

    iput-object p3, p0, Lbacktraceio/library/services/BacktraceMetrics;->backtraceApi:Lbacktraceio/library/interfaces/Api;

    iput-object p4, p0, Lbacktraceio/library/services/BacktraceMetrics;->credentials:Lj6/b;

    return-void
.end method

.method private getClientMetricsAttributes()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->customReportAttributes:Ljava/util/Map;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lbacktraceio/library/models/attributes/ReportDataBuilder;->getReportAttributes(Ljava/util/Map;Z)Lbacktraceio/library/models/attributes/ReportDataAttributes;

    move-result-object v0

    invoke-virtual {v0}, Lbacktraceio/library/models/attributes/ReportDataAttributes;->getAttributes()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private shouldProcessEvent(Ljava/lang/String;)Z
    .locals 3

    invoke-static {p1}, Lbacktraceio/library/common/BacktraceStringHelper;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    sget-object p1, Lbacktraceio/library/services/BacktraceMetrics;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Cannot process event, attribute name is null or empty"

    invoke-static {p1, v1}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v0

    :cond_0
    iget p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->maximumNumberOfEvents:I

    const/4 v1, 0x1

    if-lez p1, :cond_1

    invoke-virtual {p0}, Lbacktraceio/library/services/BacktraceMetrics;->count()I

    move-result p1

    add-int/2addr p1, v1

    iget v2, p0, Lbacktraceio/library/services/BacktraceMetrics;->maximumNumberOfEvents:I

    if-le p1, v2, :cond_1

    sget-object p1, Lbacktraceio/library/services/BacktraceMetrics;->LOG_TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot process event, reached maximum number of events: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lbacktraceio/library/services/BacktraceMetrics;->maximumNumberOfEvents:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " events count: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lbacktraceio/library/services/BacktraceMetrics;->count()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v0

    :cond_1
    return v1
.end method

.method private startMetricsEventHandlers(Lbacktraceio/library/interfaces/Api;)V
    .locals 1

    invoke-direct {p0}, Lbacktraceio/library/services/BacktraceMetrics;->verifyIfMetricsAvailable()V

    invoke-interface {p1, p0}, Lbacktraceio/library/interfaces/Api;->enableUniqueEvents(Lbacktraceio/library/services/BacktraceMetrics;)Lbacktraceio/library/services/UniqueEventsHandler;

    move-result-object v0

    iput-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->uniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;

    invoke-interface {p1, p0}, Lbacktraceio/library/interfaces/Api;->enableSummedEvents(Lbacktraceio/library/services/BacktraceMetrics;)Lbacktraceio/library/services/SummedEventsHandler;

    move-result-object p1

    iput-object p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->summedEventsHandler:Lbacktraceio/library/services/SummedEventsHandler;

    return-void
.end method

.method private verifyIfMetricsAvailable()V
    .locals 2

    iget-boolean v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->enabled:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Metrics are not available!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public addSummedEvent(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lbacktraceio/library/services/BacktraceMetrics;->addSummedEvent(Ljava/lang/String;Ljava/util/Map;)Z

    move-result p1

    return p1
.end method

.method public addSummedEvent(Ljava/lang/String;Ljava/util/Map;)Z
    .locals 2
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

    .line 2
    invoke-direct {p0}, Lbacktraceio/library/services/BacktraceMetrics;->verifyIfMetricsAvailable()V

    .line 3
    invoke-direct {p0, p1}, Lbacktraceio/library/services/BacktraceMetrics;->shouldProcessEvent(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    sget-object p1, Lbacktraceio/library/services/BacktraceMetrics;->LOG_TAG:Ljava/lang/String;

    const-string p2, "Skipping report"

    invoke-static {p1, p2}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v0, 0x1

    .line 5
    invoke-static {p2, v0}, Lbacktraceio/library/models/attributes/ReportDataBuilder;->getReportAttributes(Ljava/util/Map;Z)Lbacktraceio/library/models/attributes/ReportDataAttributes;

    move-result-object p2

    invoke-virtual {p2}, Lbacktraceio/library/models/attributes/ReportDataAttributes;->getAttributes()Ljava/util/Map;

    move-result-object p2

    .line 6
    new-instance v1, Lbacktraceio/library/models/metrics/SummedEvent;

    invoke-direct {v1, p1}, Lbacktraceio/library/models/metrics/SummedEvent;-><init>(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v1, p2}, Lbacktraceio/library/models/metrics/SummedEvent;->addAttributes(Ljava/util/Map;)V

    .line 8
    iget-object p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->summedEventsHandler:Lbacktraceio/library/services/SummedEventsHandler;

    iget-object p1, p1, Lbacktraceio/library/services/BacktraceEventsHandler;->events:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/ConcurrentLinkedDeque;->addLast(Ljava/lang/Object;)V

    .line 9
    invoke-virtual {p0}, Lbacktraceio/library/services/BacktraceMetrics;->count()I

    move-result p1

    iget p2, p0, Lbacktraceio/library/services/BacktraceMetrics;->maximumNumberOfEvents:I

    if-ne p1, p2, :cond_1

    .line 10
    iget-object p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->uniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;

    invoke-virtual {p1}, Lbacktraceio/library/services/UniqueEventsHandler;->send()V

    .line 11
    iget-object p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->summedEventsHandler:Lbacktraceio/library/services/SummedEventsHandler;

    invoke-virtual {p1}, Lbacktraceio/library/services/SummedEventsHandler;->send()V

    :cond_1
    return v0
.end method

.method public addUniqueEvent(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lbacktraceio/library/services/BacktraceMetrics;->addUniqueEvent(Ljava/lang/String;Ljava/util/Map;)Z

    move-result p1

    return p1
.end method

.method public addUniqueEvent(Ljava/lang/String;Ljava/util/Map;)Z
    .locals 4
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

    .line 2
    invoke-direct {p0}, Lbacktraceio/library/services/BacktraceMetrics;->verifyIfMetricsAvailable()V

    .line 3
    invoke-direct {p0, p1}, Lbacktraceio/library/services/BacktraceMetrics;->shouldProcessEvent(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 4
    sget-object p1, Lbacktraceio/library/services/BacktraceMetrics;->LOG_TAG:Ljava/lang/String;

    const-string p2, "Skipping report"

    invoke-static {p1, p2}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_0
    const/4 v0, 0x1

    .line 5
    invoke-static {p2, v0}, Lbacktraceio/library/models/attributes/ReportDataBuilder;->getReportAttributes(Ljava/util/Map;Z)Lbacktraceio/library/models/attributes/ReportDataAttributes;

    move-result-object p2

    invoke-virtual {p2}, Lbacktraceio/library/models/attributes/ReportDataAttributes;->getAttributes()Ljava/util/Map;

    move-result-object p2

    .line 6
    invoke-virtual {p0, p2}, Lbacktraceio/library/services/BacktraceMetrics;->createLocalAttributes(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    .line 7
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 8
    invoke-static {v2}, Lbacktraceio/library/common/BacktraceStringHelper;->isObjectNotNullOrNotEmptyString(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 9
    sget-object p1, Lbacktraceio/library/services/BacktraceMetrics;->LOG_TAG:Ljava/lang/String;

    const-string p2, "Attribute name for Unique Event is not available in attribute scope"

    invoke-static {p1, p2}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    .line 10
    :cond_1
    iget-object v2, p0, Lbacktraceio/library/services/BacktraceMetrics;->uniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;

    iget-object v2, v2, Lbacktraceio/library/services/BacktraceEventsHandler;->events:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedDeque;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbacktraceio/library/models/metrics/UniqueEvent;

    .line 11
    invoke-virtual {v3}, Lbacktraceio/library/models/metrics/UniqueEvent;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 12
    sget-object p1, Lbacktraceio/library/services/BacktraceMetrics;->LOG_TAG:Ljava/lang/String;

    const-string p2, "Already defined unique event with this attribute name, skipping"

    invoke-static {p1, p2}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    .line 13
    :cond_3
    new-instance v1, Lbacktraceio/library/models/metrics/UniqueEvent;

    invoke-static {}, Lbacktraceio/library/common/BacktraceTimeHelper;->getTimestampSeconds()J

    move-result-wide v2

    invoke-direct {v1, p1, v2, v3, p2}, Lbacktraceio/library/models/metrics/UniqueEvent;-><init>(Ljava/lang/String;JLjava/util/Map;)V

    .line 14
    iget-object p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->uniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;

    iget-object p1, p1, Lbacktraceio/library/services/BacktraceEventsHandler;->events:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/ConcurrentLinkedDeque;->addLast(Ljava/lang/Object;)V

    .line 15
    invoke-virtual {p0}, Lbacktraceio/library/services/BacktraceMetrics;->count()I

    move-result p1

    iget p2, p0, Lbacktraceio/library/services/BacktraceMetrics;->maximumNumberOfEvents:I

    if-ne p1, p2, :cond_4

    .line 16
    iget-object p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->uniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;

    invoke-virtual {p1}, Lbacktraceio/library/services/UniqueEventsHandler;->send()V

    .line 17
    iget-object p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->summedEventsHandler:Lbacktraceio/library/services/SummedEventsHandler;

    invoke-virtual {p1}, Lbacktraceio/library/services/SummedEventsHandler;->send()V

    :cond_4
    return v0
.end method

.method public count()I
    .locals 2

    invoke-virtual {p0}, Lbacktraceio/library/services/BacktraceMetrics;->getUniqueEvents()Ljava/util/concurrent/ConcurrentLinkedDeque;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedDeque;->size()I

    move-result v0

    invoke-virtual {p0}, Lbacktraceio/library/services/BacktraceMetrics;->getSummedEvents()Ljava/util/concurrent/ConcurrentLinkedDeque;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedDeque;->size()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public createLocalAttributes(Ljava/util/Map;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lbacktraceio/library/models/json/BacktraceAttributes;

    iget-object v1, p0, Lbacktraceio/library/services/BacktraceMetrics;->context:Landroid/content/Context;

    const/4 v2, 0x0

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v0, v1, v2, v2, v3}, Lbacktraceio/library/models/json/BacktraceAttributes;-><init>(Landroid/content/Context;Lbacktraceio/library/models/json/BacktraceReport;Ljava/util/Map;Ljava/lang/Boolean;)V

    iget-object v0, v0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    invoke-direct {p0}, Lbacktraceio/library/services/BacktraceMetrics;->getClientMetricsAttributes()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_0
    return-object v0
.end method

.method public enable()V
    .locals 2

    .line 1
    new-instance v0, Lbacktraceio/library/models/BacktraceMetricsSettings;

    iget-object v1, p0, Lbacktraceio/library/services/BacktraceMetrics;->credentials:Lj6/b;

    invoke-direct {v0, v1}, Lbacktraceio/library/models/BacktraceMetricsSettings;-><init>(Lj6/b;)V

    const-string v1, "guid"

    invoke-virtual {p0, v0, v1}, Lbacktraceio/library/services/BacktraceMetrics;->enable(Lbacktraceio/library/models/BacktraceMetricsSettings;Ljava/lang/String;)V

    return-void
.end method

.method public enable(Lbacktraceio/library/models/BacktraceMetricsSettings;)V
    .locals 1

    .line 3
    const-string v0, "guid"

    invoke-virtual {p0, p1, v0}, Lbacktraceio/library/services/BacktraceMetrics;->enable(Lbacktraceio/library/models/BacktraceMetricsSettings;Ljava/lang/String;)V

    return-void
.end method

.method public enable(Lbacktraceio/library/models/BacktraceMetricsSettings;Ljava/lang/String;)V
    .locals 5

    .line 4
    iget-boolean v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->enabled:Z

    if-nez v0, :cond_2

    .line 5
    invoke-virtual {p1}, Lbacktraceio/library/models/BacktraceMetricsSettings;->isBacktraceServer()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    .line 6
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {p0}, Lbacktraceio/library/services/BacktraceMetrics;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lbacktraceio/library/common/ApplicationMetadataCache;->getInstance(Landroid/content/Context;)Lbacktraceio/library/common/ApplicationMetadataCache;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lbacktraceio/library/common/ApplicationMetadataCache;->getApplicationName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lbacktraceio/library/services/BacktraceMetrics;->applicationName:Ljava/lang/String;

    .line 9
    invoke-virtual {v0}, Lbacktraceio/library/common/ApplicationMetadataCache;->getApplicationVersion()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->applicationVersion:Ljava/lang/String;

    .line 10
    invoke-static {}, Lbacktraceio/library/common/serialization/DebugHelper;->getCurrentTimeMillis()J

    move-result-wide v0

    .line 11
    invoke-virtual {p0, p2}, Lbacktraceio/library/services/BacktraceMetrics;->setStartupUniqueEventName(Ljava/lang/String;)V

    .line 12
    iput-object p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->settings:Lbacktraceio/library/models/BacktraceMetricsSettings;

    const/4 p1, 0x1

    .line 13
    iput-boolean p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->enabled:Z

    .line 14
    :try_start_0
    iget-object p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->backtraceApi:Lbacktraceio/library/interfaces/Api;

    invoke-direct {p0, p1}, Lbacktraceio/library/services/BacktraceMetrics;->startMetricsEventHandlers(Lbacktraceio/library/interfaces/Api;)V

    .line 15
    invoke-virtual {p0}, Lbacktraceio/library/services/BacktraceMetrics;->sendStartupEvent()V

    .line 16
    sget-object p1, Lbacktraceio/library/services/BacktraceMetrics;->LOG_TAG:Ljava/lang/String;

    const-string p2, "Metrics enabled"

    invoke-static {p1, p2}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 17
    sget-object p2, Lbacktraceio/library/services/BacktraceMetrics;->LOG_TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not enable metrics, exception "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    :goto_0
    invoke-static {}, Lbacktraceio/library/common/serialization/DebugHelper;->getCurrentTimeMillis()J

    move-result-wide p1

    .line 19
    sget-object v2, Lbacktraceio/library/services/BacktraceMetrics;->LOG_TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Setup metrics integration took "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sub-long/2addr p1, v0

    invoke-virtual {v3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " milliseconds"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unique event name must be defined!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 21
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unsupported metrics server"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 22
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Metrics already enabled"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public enable(Ljava/lang/String;)V
    .locals 2

    .line 2
    new-instance v0, Lbacktraceio/library/models/BacktraceMetricsSettings;

    iget-object v1, p0, Lbacktraceio/library/services/BacktraceMetrics;->credentials:Lj6/b;

    invoke-direct {v0, v1, p1}, Lbacktraceio/library/models/BacktraceMetricsSettings;-><init>(Lj6/b;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lbacktraceio/library/services/BacktraceMetrics;->enable(Lbacktraceio/library/models/BacktraceMetricsSettings;)V

    return-void
.end method

.method public getApplicationName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->applicationName:Ljava/lang/String;

    return-object v0
.end method

.method public getApplicationVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->applicationVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getBaseUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->settings:Lbacktraceio/library/models/BacktraceMetricsSettings;

    invoke-virtual {v0}, Lbacktraceio/library/models/BacktraceMetricsSettings;->getBaseUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->context:Landroid/content/Context;

    return-object v0
.end method

.method public getSummedEvents()Ljava/util/concurrent/ConcurrentLinkedDeque;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentLinkedDeque<",
            "Lbacktraceio/library/models/metrics/SummedEvent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->summedEventsHandler:Lbacktraceio/library/services/SummedEventsHandler;

    iget-object v0, v0, Lbacktraceio/library/services/BacktraceEventsHandler;->events:Ljava/util/concurrent/ConcurrentLinkedDeque;

    return-object v0
.end method

.method public getUniqueEvents()Ljava/util/concurrent/ConcurrentLinkedDeque;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentLinkedDeque<",
            "Lbacktraceio/library/models/metrics/UniqueEvent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->uniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;

    iget-object v0, v0, Lbacktraceio/library/services/BacktraceEventsHandler;->events:Ljava/util/concurrent/ConcurrentLinkedDeque;

    return-object v0
.end method

.method public send()V
    .locals 1

    invoke-direct {p0}, Lbacktraceio/library/services/BacktraceMetrics;->verifyIfMetricsAvailable()V

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->uniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;

    invoke-virtual {v0}, Lbacktraceio/library/services/UniqueEventsHandler;->send()V

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->summedEventsHandler:Lbacktraceio/library/services/SummedEventsHandler;

    invoke-virtual {v0}, Lbacktraceio/library/services/SummedEventsHandler;->send()V

    return-void
.end method

.method public sendStartupEvent()V
    .locals 1

    invoke-direct {p0}, Lbacktraceio/library/services/BacktraceMetrics;->verifyIfMetricsAvailable()V

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->startupUniqueEventName:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lbacktraceio/library/services/BacktraceMetrics;->addUniqueEvent(Ljava/lang/String;)Z

    const-string v0, "Application Launches"

    invoke-virtual {p0, v0}, Lbacktraceio/library/services/BacktraceMetrics;->addSummedEvent(Ljava/lang/String;)Z

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->uniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;

    invoke-virtual {v0}, Lbacktraceio/library/services/UniqueEventsHandler;->send()V

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->summedEventsHandler:Lbacktraceio/library/services/SummedEventsHandler;

    invoke-virtual {v0}, Lbacktraceio/library/services/SummedEventsHandler;->send()V

    return-void
.end method

.method public setMaximumNumberOfEvents(I)V
    .locals 1

    iput p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->maximumNumberOfEvents:I

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->uniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;

    invoke-virtual {v0, p1}, Lbacktraceio/library/services/UniqueEventsHandler;->setMaximumNumberOfEvents(I)V

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->summedEventsHandler:Lbacktraceio/library/services/SummedEventsHandler;

    invoke-virtual {v0, p1}, Lbacktraceio/library/services/SummedEventsHandler;->setMaximumNumberOfEvents(I)V

    return-void
.end method

.method public setStartupUniqueEventName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/services/BacktraceMetrics;->startupUniqueEventName:Ljava/lang/String;

    return-void
.end method

.method public setSummedEventsOnServerResponse(Lbacktraceio/library/events/EventsOnServerResponseEventListener;)V
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->backtraceApi:Lbacktraceio/library/interfaces/Api;

    invoke-interface {v0, p1}, Lbacktraceio/library/interfaces/Api;->setSummedEventsOnServerResponse(Lbacktraceio/library/events/EventsOnServerResponseEventListener;)V

    return-void
.end method

.method public setSummedEventsRequestHandler(Lbacktraceio/library/events/EventsRequestHandler;)V
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->backtraceApi:Lbacktraceio/library/interfaces/Api;

    invoke-interface {v0, p1}, Lbacktraceio/library/interfaces/Api;->setSummedEventsRequestHandler(Lbacktraceio/library/events/EventsRequestHandler;)V

    return-void
.end method

.method public setUniqueEventsOnServerResponse(Lbacktraceio/library/events/EventsOnServerResponseEventListener;)V
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->backtraceApi:Lbacktraceio/library/interfaces/Api;

    invoke-interface {v0, p1}, Lbacktraceio/library/interfaces/Api;->setUniqueEventsOnServerResponse(Lbacktraceio/library/events/EventsOnServerResponseEventListener;)V

    return-void
.end method

.method public setUniqueEventsRequestHandler(Lbacktraceio/library/events/EventsRequestHandler;)V
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceMetrics;->backtraceApi:Lbacktraceio/library/interfaces/Api;

    invoke-interface {v0, p1}, Lbacktraceio/library/interfaces/Api;->setUniqueEventsRequestHandler(Lbacktraceio/library/events/EventsRequestHandler;)V

    return-void
.end method
