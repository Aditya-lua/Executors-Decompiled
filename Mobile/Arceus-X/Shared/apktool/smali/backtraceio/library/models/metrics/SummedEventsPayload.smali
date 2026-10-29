.class public Lbacktraceio/library/models/metrics/SummedEventsPayload;
.super Lbacktraceio/library/models/metrics/EventsPayload;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbacktraceio/library/models/metrics/EventsPayload<",
        "Lbacktraceio/library/models/metrics/SummedEvent;",
        ">;"
    }
.end annotation


# instance fields
.field private final summedEvents:Ljava/util/concurrent/ConcurrentLinkedDeque;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "summed_events"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedDeque<",
            "Lbacktraceio/library/models/metrics/SummedEvent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ConcurrentLinkedDeque;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ConcurrentLinkedDeque<",
            "Lbacktraceio/library/models/metrics/SummedEvent;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p2, p3}, Lbacktraceio/library/models/metrics/EventsPayload;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lbacktraceio/library/models/metrics/SummedEventsPayload;->summedEvents:Ljava/util/concurrent/ConcurrentLinkedDeque;

    return-void
.end method


# virtual methods
.method public getEvents()Ljava/util/concurrent/ConcurrentLinkedDeque;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentLinkedDeque<",
            "Lbacktraceio/library/models/metrics/SummedEvent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbacktraceio/library/models/metrics/SummedEventsPayload;->summedEvents:Ljava/util/concurrent/ConcurrentLinkedDeque;

    return-object v0
.end method
