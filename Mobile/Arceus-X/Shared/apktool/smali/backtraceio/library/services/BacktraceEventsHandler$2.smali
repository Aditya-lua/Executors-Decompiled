.class Lbacktraceio/library/services/BacktraceEventsHandler$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbacktraceio/library/services/BacktraceEventsHandler;->retrySendEvents(Lbacktraceio/library/services/BacktraceHandlerInputEvents;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lbacktraceio/library/services/BacktraceEventsHandler;

.field final synthetic val$input:Lbacktraceio/library/services/BacktraceHandlerInputEvents;

.field final synthetic val$numRetries:I


# direct methods
.method public constructor <init>(Lbacktraceio/library/services/BacktraceEventsHandler;Lbacktraceio/library/services/BacktraceHandlerInputEvents;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lbacktraceio/library/services/BacktraceEventsHandler$2;->this$0:Lbacktraceio/library/services/BacktraceEventsHandler;

    iput-object p2, p0, Lbacktraceio/library/services/BacktraceEventsHandler$2;->val$input:Lbacktraceio/library/services/BacktraceHandlerInputEvents;

    iput p3, p0, Lbacktraceio/library/services/BacktraceEventsHandler$2;->val$numRetries:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lbacktraceio/library/services/BacktraceEventsHandler$2;->val$input:Lbacktraceio/library/services/BacktraceHandlerInputEvents;

    iget-object v0, v0, Lbacktraceio/library/services/BacktraceHandlerInputEvents;->payload:Lbacktraceio/library/models/metrics/EventsPayload;

    iget v1, p0, Lbacktraceio/library/services/BacktraceEventsHandler$2;->val$numRetries:I

    invoke-virtual {v0, v1}, Lbacktraceio/library/models/metrics/EventsPayload;->setDroppedEvents(I)V

    iget-object v1, p0, Lbacktraceio/library/services/BacktraceEventsHandler$2;->this$0:Lbacktraceio/library/services/BacktraceEventsHandler;

    invoke-virtual {v1, v0}, Lbacktraceio/library/services/BacktraceEventsHandler;->sendEventsPayload(Lbacktraceio/library/models/metrics/EventsPayload;)V

    return-void
.end method
