.class public Lbacktraceio/library/models/json/ThreadInformation;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final fault:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "fault"
    .end annotation
.end field

.field public name:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "name"
    .end annotation
.end field

.field private final stack:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "stack"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lbacktraceio/library/models/BacktraceStackFrame;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Lbacktraceio/library/models/BacktraceStackFrame;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p3, :cond_0

    .line 2
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    iput-object p3, p0, Lbacktraceio/library/models/json/ThreadInformation;->stack:Ljava/util/List;

    .line 3
    iput-object p1, p0, Lbacktraceio/library/models/json/ThreadInformation;->name:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lbacktraceio/library/models/json/ThreadInformation;->fault:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Thread;Ljava/util/List;Ljava/lang/Boolean;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Thread;",
            "Ljava/util/List<",
            "Lbacktraceio/library/models/BacktraceStackFrame;",
            ">;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    .line 5
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p3, p2}, Lbacktraceio/library/models/json/ThreadInformation;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public getFault()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/json/ThreadInformation;->fault:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/json/ThreadInformation;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getStack()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lbacktraceio/library/models/BacktraceStackFrame;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbacktraceio/library/models/json/ThreadInformation;->stack:Ljava/util/List;

    return-object v0
.end method
