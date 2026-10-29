.class Lbacktraceio/library/watchdog/BacktraceWatchdogShared;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static sendReportCauseBlockedThread(Lj6/a;Ljava/lang/Thread;Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lbacktraceio/library/watchdog/BacktraceWatchdogTimeoutException;

    invoke-direct {v0}, Lbacktraceio/library/watchdog/BacktraceWatchdogTimeoutException;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    const-string p1, "Blocked thread detected, sending a report"

    invoke-static {p3, p1, v0}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    if-eqz p2, :cond_0

    invoke-interface {p2, v0}, Lbacktraceio/library/watchdog/OnApplicationNotRespondingEvent;->onEvent(Lbacktraceio/library/watchdog/BacktraceWatchdogTimeoutException;)V

    return-void

    :cond_0
    if-eqz p0, :cond_1

    const-string p1, "ANR detected - thread is blocked"

    invoke-virtual {p0, p1}, Lbacktraceio/library/base/BacktraceBase;->addBreadcrumb(Ljava/lang/String;)Z

    new-instance p1, Lbacktraceio/library/models/json/BacktraceReport;

    new-instance p2, Lbacktraceio/library/watchdog/BacktraceWatchdogShared$1;

    invoke-direct {p2}, Lbacktraceio/library/watchdog/BacktraceWatchdogShared$1;-><init>()V

    invoke-direct {p1, v0, p2}, Lbacktraceio/library/models/json/BacktraceReport;-><init>(Ljava/lang/Throwable;Ljava/util/Map;)V

    invoke-virtual {p0, p1}, Lj6/a;->send(Lbacktraceio/library/models/json/BacktraceReport;)V

    :cond_1
    return-void
.end method
