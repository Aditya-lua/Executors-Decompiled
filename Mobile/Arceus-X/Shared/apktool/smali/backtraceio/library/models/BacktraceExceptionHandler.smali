.class public Lbacktraceio/library/models/BacktraceExceptionHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "BacktraceExceptionHandler"

.field private static final customAttributes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final client:Lj6/a;

.field private final rootHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

.field private final signal:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbacktraceio/library/models/BacktraceExceptionHandler$1;

    invoke-direct {v0}, Lbacktraceio/library/models/BacktraceExceptionHandler$1;-><init>()V

    sput-object v0, Lbacktraceio/library/models/BacktraceExceptionHandler;->customAttributes:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Lj6/a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lbacktraceio/library/models/BacktraceExceptionHandler;->signal:Ljava/util/concurrent/CountDownLatch;

    sget-object v0, Lbacktraceio/library/models/BacktraceExceptionHandler;->LOG_TAG:Ljava/lang/String;

    const-string v1, "BacktraceExceptionHandler initialization"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    iput-object p1, p0, Lbacktraceio/library/models/BacktraceExceptionHandler;->client:Lj6/a;

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object p1

    iput-object p1, p0, Lbacktraceio/library/models/BacktraceExceptionHandler;->rootHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-static {p0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    return-void
.end method

.method public static synthetic a(Lbacktraceio/library/models/BacktraceExceptionHandler;Ljava/lang/Thread;Ljava/lang/Throwable;Lbacktraceio/library/models/BacktraceResult;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p3, Lbacktraceio/library/models/BacktraceExceptionHandler;->LOG_TAG:Ljava/lang/String;

    const-string v0, "Root handler event callback"

    invoke-static {p3, v0}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p3, p0, Lbacktraceio/library/models/BacktraceExceptionHandler;->rootHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {p3, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    iget-object p0, p0, Lbacktraceio/library/models/BacktraceExceptionHandler;->signal:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public static enable(Lj6/a;)V
    .locals 1

    new-instance v0, Lbacktraceio/library/models/BacktraceExceptionHandler;

    invoke-direct {v0, p0}, Lbacktraceio/library/models/BacktraceExceptionHandler;-><init>(Lj6/a;)V

    return-void
.end method

.method private getCallbackToDefaultHandler(Ljava/lang/Thread;Ljava/lang/Throwable;)Lbacktraceio/library/events/OnServerResponseEventListener;
    .locals 1

    new-instance v0, Lbacktraceio/library/models/a;

    invoke-direct {v0, p0, p1, p2}, Lbacktraceio/library/models/a;-><init>(Lbacktraceio/library/models/BacktraceExceptionHandler;Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static setCustomAttributes(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lbacktraceio/library/models/BacktraceExceptionHandler;->customAttributes:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 3

    invoke-direct {p0, p1, p2}, Lbacktraceio/library/models/BacktraceExceptionHandler;->getCallbackToDefaultHandler(Ljava/lang/Thread;Ljava/lang/Throwable;)Lbacktraceio/library/events/OnServerResponseEventListener;

    move-result-object p1

    sget-object v0, Lbacktraceio/library/models/BacktraceExceptionHandler;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Sending uncaught exception to Backtrace API"

    invoke-static {v0, v1, p2}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v1, p0, Lbacktraceio/library/models/BacktraceExceptionHandler;->client:Lj6/a;

    sget-object v2, Lbacktraceio/library/models/BacktraceExceptionHandler;->customAttributes:Ljava/util/Map;

    invoke-virtual {v1, p2, v2, p1}, Lj6/a;->i(Ljava/lang/Throwable;Ljava/util/Map;Lbacktraceio/library/events/OnServerResponseEventListener;)V

    const-string p1, "Uncaught exception sent to Backtrace API"

    invoke-static {v0, p1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_0
    const-string p1, "Default uncaught exception handler"

    invoke-static {v0, p1}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lbacktraceio/library/models/BacktraceExceptionHandler;->signal:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    sget-object p2, Lbacktraceio/library/models/BacktraceExceptionHandler;->LOG_TAG:Ljava/lang/String;

    const-string v0, "Exception during waiting for response"

    invoke-static {p2, v0, p1}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method
