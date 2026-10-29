.class public Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;
.super Ljava/lang/Thread;
.source "SourceFile"

# interfaces
.implements Lbacktraceio/library/anr/BacktraceANRHandler;


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "BacktraceANRHandlerWatchdog"


# instance fields
.field private final backtraceClient:Lj6/a;

.field private final debug:Z

.field private final mainThreadHandler:Landroid/os/Handler;

.field private onApplicationNotRespondingEvent:Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;

.field private volatile shouldStop:Z

.field private final timeout:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lj6/a;)V
    .locals 1

    const/16 v0, 0x1388

    .line 1
    invoke-direct {p0, p1, v0}, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;-><init>(Lj6/a;I)V

    return-void
.end method

.method public constructor <init>(Lj6/a;I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;-><init>(Lj6/a;IZ)V

    return-void
.end method

.method public constructor <init>(Lj6/a;IZ)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 4
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;->mainThreadHandler:Landroid/os/Handler;

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;->shouldStop:Z

    .line 6
    sget-object v0, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Start monitoring ANR"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    iput-object p1, p0, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;->backtraceClient:Lj6/a;

    .line 8
    iput p2, p0, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;->timeout:I

    .line 9
    iput-boolean p3, p0, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;->debug:Z

    .line 10
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-boolean v0, p0, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;->debug:Z

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/Debug;->isDebuggerConnected()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Landroid/os/Debug;->waitingForDebugger()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    sget-object v0, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Detected a debugger connection. ANR Watchdog is disabled"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    const/4 v0, 0x0

    :goto_0
    move v1, v0

    :goto_1
    iget-boolean v2, p0, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;->shouldStop:Z

    if-nez v2, :cond_4

    invoke-virtual {p0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Date;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;->LOG_TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ANR WATCHDOG - "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v2, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;

    invoke-direct {v2, v0, v0}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;-><init>(II)V

    iget-object v4, p0, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;->mainThreadHandler:Landroid/os/Handler;

    new-instance v5, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog$1;

    invoke-direct {v5, p0, v2}, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog$1;-><init>(Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;Lbacktraceio/library/watchdog/BacktraceThreadWatcher;)V

    invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :try_start_0
    iget v4, p0, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;->timeout:I

    int-to-long v4, v4

    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v2}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->tickPrivateCounter()V

    invoke-virtual {v2}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->getCounter()I

    move-result v4

    invoke-virtual {v2}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->getPrivateCounter()I

    move-result v2

    if-ne v4, v2, :cond_2

    const-string v1, "ANR is not detected"

    invoke-static {v3, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;->backtraceClient:Lj6/a;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v2

    iget-object v4, p0, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;->onApplicationNotRespondingEvent:Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;

    invoke-static {v1, v2, v4, v3}, Lbacktraceio/library/watchdog/BacktraceWatchdogShared;->sendReportCauseBlockedThread(Lj6/a;Ljava/lang/Thread;Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;Ljava/lang/String;)V

    const/4 v1, 0x1

    goto :goto_1

    :catch_0
    move-exception v0

    sget-object v1, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Thread is interrupted"

    invoke-static {v1, v2, v0}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_4
    return-void
.end method

.method public setOnApplicationNotRespondingEvent(Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;)V
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;->onApplicationNotRespondingEvent:Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;

    return-void
.end method

.method public stopMonitoringAnr()V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;->LOG_TAG:Ljava/lang/String;

    const-string v1, "ANR monitoring thread has already been interrupted."

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    sget-object v0, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Stop monitoring ANR"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;->shouldStop:Z

    return-void
.end method
