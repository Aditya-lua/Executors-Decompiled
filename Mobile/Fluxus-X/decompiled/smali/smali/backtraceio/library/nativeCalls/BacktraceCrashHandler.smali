.class public Lbacktraceio/library/nativeCalls/BacktraceCrashHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native handleCrash([Ljava/lang/String;)Z
.end method

.method public static native initializeCrashHandler(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ZLbacktraceio/library/enums/UnwindingMode;)Z
.end method

.method public static native initializeJavaCrashHandler(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Z
.end method
