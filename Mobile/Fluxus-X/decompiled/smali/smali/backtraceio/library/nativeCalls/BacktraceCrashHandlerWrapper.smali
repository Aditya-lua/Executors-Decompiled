.class public Lbacktraceio/library/nativeCalls/BacktraceCrashHandlerWrapper;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbacktraceio/library/interfaces/NativeCommunication;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleCrash([Ljava/lang/String;)Z
    .locals 0

    invoke-static {p1}, Lbacktraceio/library/nativeCalls/BacktraceCrashHandler;->handleCrash([Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public initializeCrashHandler(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ZLbacktraceio/library/enums/UnwindingMode;)Z
    .locals 0

    invoke-static/range {p1 .. p8}, Lbacktraceio/library/nativeCalls/BacktraceCrashHandler;->initializeCrashHandler(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ZLbacktraceio/library/enums/UnwindingMode;)Z

    move-result p1

    return p1
.end method

.method public initializeJavaCrashHandler(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 0

    invoke-static/range {p1 .. p7}, Lbacktraceio/library/nativeCalls/BacktraceCrashHandler;->initializeJavaCrashHandler(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
