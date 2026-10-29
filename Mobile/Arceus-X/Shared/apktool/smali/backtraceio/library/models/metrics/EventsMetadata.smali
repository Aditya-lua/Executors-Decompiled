.class public Lbacktraceio/library/models/metrics/EventsMetadata;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private droppedEvents:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "dropped_events"
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lbacktraceio/library/models/metrics/EventsMetadata;->droppedEvents:I

    return-void
.end method


# virtual methods
.method public getDroppedEvents()I
    .locals 1

    iget v0, p0, Lbacktraceio/library/models/metrics/EventsMetadata;->droppedEvents:I

    return v0
.end method

.method public setDroppedEvents(I)V
    .locals 0

    iput p1, p0, Lbacktraceio/library/models/metrics/EventsMetadata;->droppedEvents:I

    return-void
.end method
