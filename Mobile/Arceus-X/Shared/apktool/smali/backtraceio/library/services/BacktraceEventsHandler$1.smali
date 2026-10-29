.class Lbacktraceio/library/services/BacktraceEventsHandler$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbacktraceio/library/services/BacktraceEventsHandler;-><init>(Lbacktraceio/library/services/BacktraceMetrics;Lbacktraceio/library/interfaces/Api;Lbacktraceio/library/services/BacktraceHandlerThread;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lbacktraceio/library/services/BacktraceEventsHandler;

.field final synthetic val$handler:Lbacktraceio/library/services/BacktraceEventsHandler;

.field final synthetic val$timeIntervalMillis:J


# direct methods
.method public constructor <init>(Lbacktraceio/library/services/BacktraceEventsHandler;Lbacktraceio/library/services/BacktraceEventsHandler;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lbacktraceio/library/services/BacktraceEventsHandler$1;->this$0:Lbacktraceio/library/services/BacktraceEventsHandler;

    iput-object p2, p0, Lbacktraceio/library/services/BacktraceEventsHandler$1;->val$handler:Lbacktraceio/library/services/BacktraceEventsHandler;

    iput-wide p3, p0, Lbacktraceio/library/services/BacktraceEventsHandler$1;->val$timeIntervalMillis:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceEventsHandler$1;->val$handler:Lbacktraceio/library/services/BacktraceEventsHandler;

    invoke-virtual {v0}, Lbacktraceio/library/services/BacktraceEventsHandler;->send()V

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceEventsHandler$1;->val$handler:Lbacktraceio/library/services/BacktraceEventsHandler;

    iget-wide v1, p0, Lbacktraceio/library/services/BacktraceEventsHandler$1;->val$timeIntervalMillis:J

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
