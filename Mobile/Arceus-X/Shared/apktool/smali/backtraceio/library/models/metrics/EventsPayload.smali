.class public abstract Lbacktraceio/library/models/metrics/EventsPayload;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lbacktraceio/library/models/metrics/Event;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String; = "EventsPayload"


# instance fields
.field private final appVersion:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "appversion"
    .end annotation
.end field

.field private final application:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "application"
    .end annotation
.end field

.field private final eventsMetadata:Lbacktraceio/library/models/metrics/EventsMetadata;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "metadata"
    .end annotation
.end field

.field public transient numRetries:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lbacktraceio/library/models/metrics/EventsPayload;->numRetries:I

    iput-object p1, p0, Lbacktraceio/library/models/metrics/EventsPayload;->application:Ljava/lang/String;

    iput-object p2, p0, Lbacktraceio/library/models/metrics/EventsPayload;->appVersion:Ljava/lang/String;

    new-instance p1, Lbacktraceio/library/models/metrics/EventsMetadata;

    invoke-direct {p1, v0}, Lbacktraceio/library/models/metrics/EventsMetadata;-><init>(I)V

    iput-object p1, p0, Lbacktraceio/library/models/metrics/EventsPayload;->eventsMetadata:Lbacktraceio/library/models/metrics/EventsMetadata;

    return-void
.end method


# virtual methods
.method public getApplicationName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/metrics/EventsPayload;->application:Ljava/lang/String;

    return-object v0
.end method

.method public getApplicationVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/metrics/EventsPayload;->appVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getDroppedEvents()I
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/metrics/EventsPayload;->eventsMetadata:Lbacktraceio/library/models/metrics/EventsMetadata;

    invoke-virtual {v0}, Lbacktraceio/library/models/metrics/EventsMetadata;->getDroppedEvents()I

    move-result v0

    return v0
.end method

.method public abstract getEvents()Ljava/util/concurrent/ConcurrentLinkedDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/ConcurrentLinkedDeque<",
            "TT;>;"
        }
    .end annotation
.end method

.method public setDroppedEvents(I)V
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/metrics/EventsPayload;->eventsMetadata:Lbacktraceio/library/models/metrics/EventsMetadata;

    invoke-virtual {v0, p1}, Lbacktraceio/library/models/metrics/EventsMetadata;->setDroppedEvents(I)V

    return-void
.end method
