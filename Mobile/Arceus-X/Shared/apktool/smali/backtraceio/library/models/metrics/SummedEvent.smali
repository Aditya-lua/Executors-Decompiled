.class public final Lbacktraceio/library/models/metrics/SummedEvent;
.super Lbacktraceio/library/models/metrics/Event;
.source "SourceFile"


# instance fields
.field private final name:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "metric_group"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbacktraceio/library/models/metrics/SummedEvent;)V
    .locals 3

    .line 6
    iget-object v0, p1, Lbacktraceio/library/models/metrics/SummedEvent;->name:Ljava/lang/String;

    iget-wide v1, p1, Lbacktraceio/library/models/metrics/Event;->timestamp:J

    iget-object p1, p1, Lbacktraceio/library/models/metrics/Event;->attributes:Ljava/util/Map;

    invoke-direct {p0, v0, v1, v2, p1}, Lbacktraceio/library/models/metrics/SummedEvent;-><init>(Ljava/lang/String;JLjava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lbacktraceio/library/models/metrics/SummedEvent;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JLjava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p2, p3}, Lbacktraceio/library/models/metrics/Event;-><init>(J)V

    .line 4
    iput-object p1, p0, Lbacktraceio/library/models/metrics/SummedEvent;->name:Ljava/lang/String;

    .line 5
    invoke-virtual {p0, p4}, Lbacktraceio/library/models/metrics/Event;->addAttributesImpl(Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-static {}, Lbacktraceio/library/common/BacktraceTimeHelper;->getTimestampSeconds()J

    move-result-wide v0

    invoke-direct {p0, p1, v0, v1, p2}, Lbacktraceio/library/models/metrics/SummedEvent;-><init>(Ljava/lang/String;JLjava/util/Map;)V

    return-void
.end method


# virtual methods
.method public addAttributes(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lbacktraceio/library/models/metrics/Event;->addAttributesImpl(Ljava/util/Map;)V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/models/metrics/SummedEvent;->name:Ljava/lang/String;

    return-object v0
.end method
