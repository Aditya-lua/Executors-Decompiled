.class public Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;
.super Ljava/lang/Thread;
.source "SourceFile"

# interfaces
.implements Lbacktraceio/library/anr/BacktraceANRHandler;


# static fields
.field private static final ANR_COMPLEX_ATTR_KEY:Ljava/lang/String; = "ANR annotations"

.field private static final ANR_STACKTRACE_ATTR_KEY:Ljava/lang/String; = "ANR stacktrace"

.field private static final ANR_STACKTRACE_PARSED_ATTR_KEY:Ljava/lang/String; = "ANR parsed stacktrace"

.field private static final LOG_TAG:Ljava/lang/String; = "BacktraceAppExitInfoSenderHandler"

.field private static final THREAD_NAME:Ljava/lang/String; = "main-anr-appexit"


# instance fields
.field private final activityManager:Lbacktraceio/library/anr/ProcessExitInfoProvider;

.field private final anrAppExitInfoState:Lbacktraceio/library/anr/AnrExitInfoState;

.field private final backtraceClient:Lj6/a;

.field private final packageName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lj6/a;Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-static {p2}, Lbacktraceio/library/common/ApplicationMetadataCache;->getInstance(Landroid/content/Context;)Lbacktraceio/library/common/ApplicationMetadataCache;

    move-result-object v0

    invoke-virtual {v0}, Lbacktraceio/library/common/ApplicationMetadataCache;->getPackageName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lbacktraceio/library/anr/AnrExitInfoState;

    invoke-direct {v1, p2}, Lbacktraceio/library/anr/AnrExitInfoState;-><init>(Landroid/content/Context;)V

    new-instance v2, Lbacktraceio/library/anr/ActivityManagerExitInfoProvider;

    invoke-direct {v2, p2}, Lbacktraceio/library/anr/ActivityManagerExitInfoProvider;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-direct {p0, p1, v0, v1, v2}, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;-><init>(Lj6/a;Ljava/lang/String;Lbacktraceio/library/anr/AnrExitInfoState;Lbacktraceio/library/anr/ProcessExitInfoProvider;)V

    return-void
.end method

.method public constructor <init>(Lj6/a;Ljava/lang/String;Lbacktraceio/library/anr/AnrExitInfoState;Lbacktraceio/library/anr/ProcessExitInfoProvider;)V
    .locals 1

    .line 3
    const-string v0, "main-anr-appexit"

    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 4
    iput-object p1, p0, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->backtraceClient:Lj6/a;

    .line 5
    iput-object p2, p0, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->packageName:Ljava/lang/String;

    .line 6
    iput-object p3, p0, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->anrAppExitInfoState:Lbacktraceio/library/anr/AnrExitInfoState;

    .line 7
    iput-object p4, p0, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->activityManager:Lbacktraceio/library/anr/ProcessExitInfoProvider;

    .line 8
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static synthetic a(Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;Lbacktraceio/library/anr/ExitInfo;Lbacktraceio/library/models/BacktraceResult;)V
    .locals 2

    iget-object v0, p0, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->anrAppExitInfoState:Lbacktraceio/library/anr/AnrExitInfoState;

    monitor-enter v0

    :try_start_0
    iget-object p2, p2, Lbacktraceio/library/models/BacktraceResult;->status:Lbacktraceio/library/models/types/BacktraceResultStatus;

    sget-object v1, Lbacktraceio/library/models/types/BacktraceResultStatus;->Ok:Lbacktraceio/library/models/types/BacktraceResultStatus;

    if-ne p2, v1, :cond_0

    invoke-direct {p0, p1}, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->shouldUpdateLastTimestamp(Lbacktraceio/library/anr/ExitInfo;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p0, p0, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->anrAppExitInfoState:Lbacktraceio/library/anr/AnrExitInfoState;

    invoke-interface {p1}, Lbacktraceio/library/anr/ExitInfo;->getTimestamp()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lbacktraceio/library/anr/AnrExitInfoState;->saveTimestamp(J)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private generateBacktraceReport(Lbacktraceio/library/anr/ExitInfo;)Lbacktraceio/library/models/json/BacktraceReport;
    .locals 5

    invoke-static {p1}, Lbacktraceio/library/anr/AppExitInfoDetailsExtractor;->getANRAttributes(Lbacktraceio/library/anr/ExitInfo;)Ljava/util/HashMap;

    move-result-object v0

    invoke-static {p1}, Lbacktraceio/library/anr/AppExitInfoDetailsExtractor;->getStackTraceInfo(Lbacktraceio/library/anr/ExitInfo;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, v1}, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->getAttributesFromStacktrace(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v2}, Lbacktraceio/library/anr/ExitInfoStackTraceParser;->parseMainThreadStackTrace(Ljava/util/Map;)[Ljava/lang/StackTraceElement;

    move-result-object v3

    new-instance v4, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler$1;

    invoke-direct {v4, p0, v0, v1, v2}, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler$1;-><init>(Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V

    new-instance v0, Lbacktraceio/library/models/json/BacktraceReport;

    new-instance v1, Lbacktraceio/library/anr/BacktraceANRExitInfoException;

    invoke-direct {v1, p1, v3}, Lbacktraceio/library/anr/BacktraceANRExitInfoException;-><init>(Lbacktraceio/library/anr/ExitInfo;[Ljava/lang/StackTraceElement;)V

    invoke-direct {v0, v1, v4}, Lbacktraceio/library/models/json/BacktraceReport;-><init>(Ljava/lang/Throwable;Ljava/util/Map;)V

    return-object v0

    :cond_1
    :goto_0
    sget-object p1, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->LOG_TAG:Ljava/lang/String;

    const-string v0, "Empty stacktrace for ApplicationExitInfo"

    invoke-static {p1, v0}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method private getAttributesFromStacktrace(Ljava/lang/String;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    :try_start_0
    invoke-static {p1}, Lbacktraceio/library/anr/ExitInfoStackTraceParser;->parseANRStackTrace(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    sget-object v0, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Error during parsing ExitInfoStackTrace"

    invoke-static {v0, v1, p1}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    return-object p1
.end method

.method private isSupportedTypeOfApplicationExit(Lbacktraceio/library/anr/ExitInfo;)Z
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->activityManager:Lbacktraceio/library/anr/ProcessExitInfoProvider;

    invoke-interface {v0}, Lbacktraceio/library/anr/ProcessExitInfoProvider;->getSupportedTypesOfExitInfo()Ljava/util/List;

    move-result-object v0

    invoke-interface {p1}, Lbacktraceio/library/anr/ExitInfo;->getReason()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private send()V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_0

    sget-object v1, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->LOG_TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unsupported Android version "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " to send ANR based on applicationExitInfoList"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->activityManager:Lbacktraceio/library/anr/ProcessExitInfoProvider;

    iget-object v1, p0, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->packageName:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, v2}, Lbacktraceio/library/anr/ProcessExitInfoProvider;->getHistoricalExitInfo(Ljava/lang/String;II)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbacktraceio/library/anr/ExitInfo;

    iget-object v2, p0, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->anrAppExitInfoState:Lbacktraceio/library/anr/AnrExitInfoState;

    monitor-enter v2

    :try_start_0
    invoke-direct {p0, v1}, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->shouldProcessAppExitInfo(Lbacktraceio/library/anr/ExitInfo;)Z

    move-result v3

    if-nez v3, :cond_1

    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    invoke-direct {p0, v1}, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->sendApplicationExitInfoReport(Lbacktraceio/library/anr/ExitInfo;)V

    monitor-exit v2

    goto :goto_0

    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    return-void
.end method

.method private sendApplicationExitInfoReport(Lbacktraceio/library/anr/ExitInfo;)V
    .locals 4

    invoke-direct {p0, p1}, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->generateBacktraceReport(Lbacktraceio/library/anr/ExitInfo;)Lbacktraceio/library/models/json/BacktraceReport;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v1, p0, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->anrAppExitInfoState:Lbacktraceio/library/anr/AnrExitInfoState;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->anrAppExitInfoState:Lbacktraceio/library/anr/AnrExitInfoState;

    invoke-interface {p1}, Lbacktraceio/library/anr/ExitInfo;->getTimestamp()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lbacktraceio/library/anr/AnrExitInfoState;->saveTimestamp(J)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    sget-object v1, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->LOG_TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Sending ApplicationExitInfo ANR: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lbacktraceio/library/models/json/BacktraceReport;->message:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->backtraceClient:Lj6/a;

    new-instance v2, Lbacktraceio/library/anr/a;

    invoke-direct {v2, p0, p1}, Lbacktraceio/library/anr/a;-><init>(Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;Lbacktraceio/library/anr/ExitInfo;)V

    invoke-virtual {v1, v0, v2}, Lj6/a;->send(Lbacktraceio/library/models/json/BacktraceReport;Lbacktraceio/library/events/OnServerResponseEventListener;)V

    return-void
.end method

.method private shouldProcessAppExitInfo(Lbacktraceio/library/anr/ExitInfo;)Z
    .locals 4

    iget-object v0, p0, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->anrAppExitInfoState:Lbacktraceio/library/anr/AnrExitInfoState;

    invoke-virtual {v0}, Lbacktraceio/library/anr/AnrExitInfoState;->getLastTimestamp()J

    move-result-wide v0

    invoke-interface {p1}, Lbacktraceio/library/anr/ExitInfo;->getTimestamp()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-direct {p0, p1}, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->isSupportedTypeOfApplicationExit(Lbacktraceio/library/anr/ExitInfo;)Z

    move-result p1

    return p1
.end method

.method private shouldUpdateLastTimestamp(Lbacktraceio/library/anr/ExitInfo;)Z
    .locals 4

    iget-object v0, p0, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->anrAppExitInfoState:Lbacktraceio/library/anr/AnrExitInfoState;

    invoke-virtual {v0}, Lbacktraceio/library/anr/AnrExitInfoState;->getLastTimestamp()J

    move-result-wide v0

    invoke-interface {p1}, Lbacktraceio/library/anr/ExitInfo;->getTimestamp()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-gez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public run()V
    .locals 0

    invoke-direct {p0}, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->send()V

    return-void
.end method

.method public setOnApplicationNotRespondingEvent(Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;)V
    .locals 0

    return-void
.end method

.method public stopMonitoringAnr()V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lbacktraceio/library/anr/BacktraceAppExitInfoSenderHandler;->LOG_TAG:Ljava/lang/String;

    const-string v1, "ANR thread will be interrupted."

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    return-void
.end method
