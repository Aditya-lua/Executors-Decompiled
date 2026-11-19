.class public Lbacktraceio/library/services/BacktraceCrashHandlerRunner;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "BacktraceCrashHandlerRunner"


# instance fields
.field private final crashHandler:Lbacktraceio/library/nativeCalls/BacktraceCrashHandlerWrapper;

.field private final loader:Lbacktraceio/library/nativeCalls/SystemLoader;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    new-instance v0, Lbacktraceio/library/nativeCalls/BacktraceCrashHandlerWrapper;

    invoke-direct {v0}, Lbacktraceio/library/nativeCalls/BacktraceCrashHandlerWrapper;-><init>()V

    new-instance v1, Lbacktraceio/library/nativeCalls/SystemLoader;

    invoke-direct {v1}, Lbacktraceio/library/nativeCalls/SystemLoader;-><init>()V

    invoke-direct {p0, v0, v1}, Lbacktraceio/library/services/BacktraceCrashHandlerRunner;-><init>(Lbacktraceio/library/nativeCalls/BacktraceCrashHandlerWrapper;Lbacktraceio/library/nativeCalls/SystemLoader;)V

    return-void
.end method

.method public constructor <init>(Lbacktraceio/library/nativeCalls/BacktraceCrashHandlerWrapper;Lbacktraceio/library/nativeCalls/SystemLoader;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lbacktraceio/library/services/BacktraceCrashHandlerRunner;->crashHandler:Lbacktraceio/library/nativeCalls/BacktraceCrashHandlerWrapper;

    .line 4
    iput-object p2, p0, Lbacktraceio/library/services/BacktraceCrashHandlerRunner;->loader:Lbacktraceio/library/nativeCalls/SystemLoader;

    return-void
.end method

.method public static main([Ljava/lang/String;)V
    .locals 2

    new-instance v0, Lbacktraceio/library/services/BacktraceCrashHandlerRunner;

    invoke-direct {v0}, Lbacktraceio/library/services/BacktraceCrashHandlerRunner;-><init>()V

    invoke-static {}, Ljava/lang/System;->getenv()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lbacktraceio/library/services/BacktraceCrashHandlerRunner;->run([Ljava/lang/String;Ljava/util/Map;)Z

    return-void
.end method


# virtual methods
.method public run([Ljava/lang/String;Ljava/util/Map;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p2, :cond_0

    sget-object p1, Lbacktraceio/library/services/BacktraceCrashHandlerRunner;->LOG_TAG:Ljava/lang/String;

    const-string p2, "Cannot capture crash dump. Environment variables are undefined"

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v0

    :cond_0
    const-string v1, "BACKTRACE_CRASH_HANDLER"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_1

    sget-object p1, Lbacktraceio/library/services/BacktraceCrashHandlerRunner;->LOG_TAG:Ljava/lang/String;

    const-string p2, "Cannot capture crash dump. Cannot find %s environment variable"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {p2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v0

    :cond_1
    iget-object v1, p0, Lbacktraceio/library/services/BacktraceCrashHandlerRunner;->loader:Lbacktraceio/library/nativeCalls/SystemLoader;

    invoke-virtual {v1, p2}, Lbacktraceio/library/nativeCalls/SystemLoader;->loadLibrary(Ljava/lang/String;)V

    iget-object p2, p0, Lbacktraceio/library/services/BacktraceCrashHandlerRunner;->crashHandler:Lbacktraceio/library/nativeCalls/BacktraceCrashHandlerWrapper;

    invoke-virtual {p2, p1}, Lbacktraceio/library/nativeCalls/BacktraceCrashHandlerWrapper;->handleCrash([Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_2

    sget-object p2, Lbacktraceio/library/services/BacktraceCrashHandlerRunner;->LOG_TAG:Ljava/lang/String;

    const-string v1, " "

    invoke-static {v1, p1}, Ljava/lang/String;->join(Ljava/lang/CharSequence;[Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Cannot capture crash dump. Invocation parameters: %s"

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v0

    :cond_2
    sget-object p1, Lbacktraceio/library/services/BacktraceCrashHandlerRunner;->LOG_TAG:Ljava/lang/String;

    const-string p2, "Successfully ran crash handler code."

    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x1

    return p1
.end method
