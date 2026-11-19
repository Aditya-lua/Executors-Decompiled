.class Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;

.field final synthetic val$threadWatcher:Lbacktraceio/library/watchdog/BacktraceThreadWatcher;


# direct methods
.method public constructor <init>(Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;Lbacktraceio/library/watchdog/BacktraceThreadWatcher;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog$1;->this$0:Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog;

    iput-object p2, p0, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog$1;->val$threadWatcher:Lbacktraceio/library/watchdog/BacktraceThreadWatcher;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/watchdog/BacktraceANRHandlerWatchdog$1;->val$threadWatcher:Lbacktraceio/library/watchdog/BacktraceThreadWatcher;

    invoke-virtual {v0}, Lbacktraceio/library/watchdog/BacktraceThreadWatcher;->tickCounter()V

    return-void
.end method
