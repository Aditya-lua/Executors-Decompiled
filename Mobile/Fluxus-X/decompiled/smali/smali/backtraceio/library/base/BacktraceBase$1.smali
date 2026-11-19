.class Lbacktraceio/library/base/BacktraceBase$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbacktraceio/library/events/OnServerResponseEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbacktraceio/library/base/BacktraceBase;->getDatabaseCallback(Lbacktraceio/library/models/database/BacktraceDatabaseRecord;Lbacktraceio/library/events/OnServerResponseEventListener;)Lbacktraceio/library/events/OnServerResponseEventListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lbacktraceio/library/base/BacktraceBase;

.field final synthetic val$customCallback:Lbacktraceio/library/events/OnServerResponseEventListener;

.field final synthetic val$record:Lbacktraceio/library/models/database/BacktraceDatabaseRecord;


# direct methods
.method public constructor <init>(Lbacktraceio/library/base/BacktraceBase;Lbacktraceio/library/models/database/BacktraceDatabaseRecord;Lbacktraceio/library/events/OnServerResponseEventListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lbacktraceio/library/base/BacktraceBase$1;->this$0:Lbacktraceio/library/base/BacktraceBase;

    iput-object p2, p0, Lbacktraceio/library/base/BacktraceBase$1;->val$record:Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    iput-object p3, p0, Lbacktraceio/library/base/BacktraceBase$1;->val$customCallback:Lbacktraceio/library/events/OnServerResponseEventListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEvent(Lbacktraceio/library/models/BacktraceResult;)V
    .locals 3

    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase$1;->val$record:Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lbacktraceio/library/models/database/BacktraceDatabaseRecord;->close()Z

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase$1;->val$record:Lbacktraceio/library/models/database/BacktraceDatabaseRecord;

    if-eqz v0, :cond_1

    iget-object v1, p1, Lbacktraceio/library/models/BacktraceResult;->status:Lbacktraceio/library/models/types/BacktraceResultStatus;

    sget-object v2, Lbacktraceio/library/models/types/BacktraceResultStatus;->Ok:Lbacktraceio/library/models/types/BacktraceResultStatus;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lbacktraceio/library/base/BacktraceBase$1;->this$0:Lbacktraceio/library/base/BacktraceBase;

    iget-object v1, v1, Lbacktraceio/library/base/BacktraceBase;->database:Lbacktraceio/library/interfaces/Database;

    invoke-interface {v1, v0}, Lbacktraceio/library/interfaces/Database;->delete(Lbacktraceio/library/models/database/BacktraceDatabaseRecord;)V

    :cond_1
    iget-object v0, p0, Lbacktraceio/library/base/BacktraceBase$1;->val$customCallback:Lbacktraceio/library/events/OnServerResponseEventListener;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lbacktraceio/library/events/OnServerResponseEventListener;->onEvent(Lbacktraceio/library/models/BacktraceResult;)V

    :cond_2
    return-void
.end method
