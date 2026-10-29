.class public Lbacktraceio/library/watchdog/BacktraceWatchdog;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String; = "BacktraceWatchdog"


# instance fields
.field private final backtraceClient:Lj6/a;

.field private onApplicationNotRespondingEvent:Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;

.field private final sendException:Z

.field private final threadsIdWatcher:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Thread;",
            "Lbacktraceio/library/watchdog/BacktraceThreadWatcher;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lj6/a;)V
    .locals 1

    const/4 v0, 0x1

    .line 5
    invoke-direct {p0, p1, v0}, Lbacktraceio/library/watchdog/BacktraceWatchdog;-><init>(Lj6/a;Z)V

    return-void
.end method

.method public constructor <init>(Lj6/a;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->threadsIdWatcher:Ljava/util/Map;

    .line 3
    iput-boolean p2, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->sendException:Z

    .line 4
    iput-object p1, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->backtraceClient:Lj6/a;

    return-void
.end method


# virtual methods
.method public activateWatcher(Ljava/lang/Thread;)V
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->threadsIdWatcher:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->threadsIdWatcher:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;

    if-nez p1, :cond_1

    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->setActive(Z)V

    return-void
.end method

.method public checkIsAnyThreadIsBlocked()Z
    .locals 11

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lbacktraceio/library/watchdog/BacktraceWatchdog;->LOG_TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Checking watchdog. Timestamp: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v3, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->threadsIdWatcher:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Thread;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;

    if-eqz v5, :cond_0

    if-eqz v4, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    if-ne v5, v6, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v5}, Ljava/lang/Thread;->isAlive()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v4}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->isActive()Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v4}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->getCounter()I

    move-result v6

    invoke-virtual {v4}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->getPrivateCounter()I

    move-result v7

    if-eq v6, v7, :cond_3

    invoke-virtual {v4}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->getCounter()I

    move-result v5

    invoke-virtual {v4, v5}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->setPrivateCounter(I)V

    invoke-virtual {v4, v0, v1}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->setLastTimestamp(J)V

    goto :goto_0

    :cond_3
    sget-object v6, Lbacktraceio/library/watchdog/BacktraceWatchdog;->LOG_TAG:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v5}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v8

    filled-new-array {v7, v8, v2}, [Ljava/lang/Object;

    move-result-object v7

    const-string v8, "Thread %d %s  might be hung, timestamp: %s"

    invoke-static {v8, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lbacktraceio/library/logger/BacktraceLogger;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v4}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->getLastTimestamp()J

    move-result-wide v7

    const-wide/16 v9, 0x0

    cmp-long v9, v7, v9

    if-nez v9, :cond_4

    invoke-virtual {v4}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->getTimeout()I

    move-result v4

    int-to-long v9, v4

    goto :goto_1

    :cond_4
    invoke-virtual {v4}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->getTimeout()I

    move-result v9

    invoke-virtual {v4}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->getDelay()I

    move-result v4

    add-int/2addr v9, v4

    int-to-long v9, v9

    :goto_1
    sub-long v7, v0, v7

    cmp-long v4, v7, v9

    if-lez v4, :cond_0

    iget-boolean v0, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->sendException:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->backtraceClient:Lj6/a;

    iget-object v1, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->onApplicationNotRespondingEvent:Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;

    invoke-static {v0, v5, v1, v6}, Lbacktraceio/library/watchdog/BacktraceWatchdogShared;->sendReportCauseBlockedThread(Lj6/a;Ljava/lang/Thread;Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;Ljava/lang/String;)V

    :cond_5
    const/4 v0, 0x1

    return v0

    :cond_6
    const/4 v0, 0x0

    return v0
.end method

.method public deactivateWatcher(Ljava/lang/Thread;)V
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->threadsIdWatcher:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->threadsIdWatcher:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;

    if-nez p1, :cond_1

    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->setActive(Z)V

    return-void
.end method

.method public registerThread(Ljava/lang/Thread;II)V
    .locals 2

    iget-object v0, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->threadsIdWatcher:Ljava/util/Map;

    new-instance v1, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;

    invoke-direct {v1, p2, p3}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;-><init>(II)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setOnApplicationNotRespondingEvent(Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;)V
    .locals 0

    iput-object p1, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->onApplicationNotRespondingEvent:Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;

    return-void
.end method

.method public tick(Ljava/lang/Thread;)V
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->threadsIdWatcher:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->threadsIdWatcher:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;

    if-nez p1, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p1}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->tickCounter()V

    return-void
.end method

.method public unRegisterThread(Ljava/lang/Thread;)V
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/watchdog/BacktraceWatchdog;->threadsIdWatcher:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
