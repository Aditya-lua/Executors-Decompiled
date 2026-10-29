.class public Lbacktraceio/library/services/BacktraceHandlerThread;
.super Landroid/os/HandlerThread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;
    }
.end annotation


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String; = "BacktraceHandlerThread"


# instance fields
.field private final transient context:Landroid/content/Context;

.field private mHandler:Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;

.field private mSummedEventsHandler:Lbacktraceio/library/services/SummedEventsHandler;

.field private mUniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;

.field private final url:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p3, p0, Lbacktraceio/library/services/BacktraceHandlerThread;->url:Ljava/lang/String;

    iput-object p1, p0, Lbacktraceio/library/services/BacktraceHandlerThread;->context:Landroid/content/Context;

    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    return-void
.end method


# virtual methods
.method public createMessage(Lbacktraceio/library/services/BacktraceHandlerInput;)Landroid/os/Message;
    .locals 1

    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    return-object v0
.end method

.method public createSummedEventsHandler(Lbacktraceio/library/services/BacktraceMetrics;Lbacktraceio/library/interfaces/Api;)Lbacktraceio/library/services/SummedEventsHandler;
    .locals 1

    new-instance v0, Lbacktraceio/library/services/SummedEventsHandler;

    invoke-direct {v0, p1, p2, p0}, Lbacktraceio/library/services/SummedEventsHandler;-><init>(Lbacktraceio/library/services/BacktraceMetrics;Lbacktraceio/library/interfaces/Api;Lbacktraceio/library/services/BacktraceHandlerThread;)V

    iput-object v0, p0, Lbacktraceio/library/services/BacktraceHandlerThread;->mSummedEventsHandler:Lbacktraceio/library/services/SummedEventsHandler;

    return-object v0
.end method

.method public createUniqueEventsHandler(Lbacktraceio/library/services/BacktraceMetrics;Lbacktraceio/library/interfaces/Api;)Lbacktraceio/library/services/UniqueEventsHandler;
    .locals 1

    new-instance v0, Lbacktraceio/library/services/UniqueEventsHandler;

    invoke-direct {v0, p1, p2, p0}, Lbacktraceio/library/services/UniqueEventsHandler;-><init>(Lbacktraceio/library/services/BacktraceMetrics;Lbacktraceio/library/interfaces/Api;Lbacktraceio/library/services/BacktraceHandlerThread;)V

    iput-object v0, p0, Lbacktraceio/library/services/BacktraceHandlerThread;->mUniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;

    return-object v0
.end method

.method public onLooperPrepared()V
    .locals 7

    invoke-super {p0}, Landroid/os/HandlerThread;->onLooperPrepared()V

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceHandlerThread;->mHandler:Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;

    if-nez v0, :cond_0

    new-instance v1, Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;

    iget-object v3, p0, Lbacktraceio/library/services/BacktraceHandlerThread;->context:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v4

    iget-object v5, p0, Lbacktraceio/library/services/BacktraceHandlerThread;->url:Ljava/lang/String;

    const/4 v6, 0x0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;-><init>(Lbacktraceio/library/services/BacktraceHandlerThread;Landroid/content/Context;Landroid/os/Looper;Ljava/lang/String;Lbacktraceio/library/services/BacktraceHandlerThread$1;)V

    iput-object v1, v2, Lbacktraceio/library/services/BacktraceHandlerThread;->mHandler:Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;

    return-void

    :cond_0
    move-object v2, p0

    return-void
.end method

.method public sendReport(Lbacktraceio/library/services/BacktraceHandlerInputReport;)V
    .locals 7

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceHandlerThread;->mHandler:Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;

    if-nez v0, :cond_0

    new-instance v1, Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;

    iget-object v3, p0, Lbacktraceio/library/services/BacktraceHandlerThread;->context:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v4

    iget-object v5, p0, Lbacktraceio/library/services/BacktraceHandlerThread;->url:Ljava/lang/String;

    const/4 v6, 0x0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;-><init>(Lbacktraceio/library/services/BacktraceHandlerThread;Landroid/content/Context;Landroid/os/Looper;Ljava/lang/String;Lbacktraceio/library/services/BacktraceHandlerThread$1;)V

    iput-object v1, v2, Lbacktraceio/library/services/BacktraceHandlerThread;->mHandler:Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;

    goto :goto_0

    :cond_0
    move-object v2, p0

    :goto_0
    iget-object v0, v2, Lbacktraceio/library/services/BacktraceHandlerThread;->mHandler:Lbacktraceio/library/services/BacktraceHandlerThread$BacktraceHandler;

    invoke-virtual {p0, p1}, Lbacktraceio/library/services/BacktraceHandlerThread;->createMessage(Lbacktraceio/library/services/BacktraceHandlerInput;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public sendSummedEvents(Lbacktraceio/library/services/BacktraceHandlerInputEvents;)V
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceHandlerThread;->mSummedEventsHandler:Lbacktraceio/library/services/SummedEventsHandler;

    invoke-virtual {p0, p1}, Lbacktraceio/library/services/BacktraceHandlerThread;->createMessage(Lbacktraceio/library/services/BacktraceHandlerInput;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public sendUniqueEvents(Lbacktraceio/library/services/BacktraceHandlerInputEvents;)V
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceHandlerThread;->mUniqueEventsHandler:Lbacktraceio/library/services/UniqueEventsHandler;

    invoke-virtual {p0, p1}, Lbacktraceio/library/services/BacktraceHandlerThread;->createMessage(Lbacktraceio/library/services/BacktraceHandlerInput;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
