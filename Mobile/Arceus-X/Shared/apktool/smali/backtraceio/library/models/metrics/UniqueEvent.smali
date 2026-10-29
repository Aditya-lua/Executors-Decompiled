.class public Lbacktraceio/library/models/metrics/UniqueEvent;
.super Lbacktraceio/library/models/metrics/Event;
.source "SourceFile"


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String; = "UniqueEvent"


# instance fields
.field private final name:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "unique"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lbacktraceio/library/models/metrics/UniqueEvent;-><init>(Ljava/lang/String;Ljava/util/Map;)V

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
    new-instance p2, Lbacktraceio/library/models/metrics/UniqueEvent$1;

    invoke-direct {p2, p0, p1}, Lbacktraceio/library/models/metrics/UniqueEvent$1;-><init>(Lbacktraceio/library/models/metrics/UniqueEvent;Ljava/lang/String;)V

    iput-object p2, p0, Lbacktraceio/library/models/metrics/UniqueEvent;->name:Ljava/util/List;

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

    invoke-direct {p0, p1, v0, v1, p2}, Lbacktraceio/library/models/metrics/UniqueEvent;-><init>(Ljava/lang/String;JLjava/util/Map;)V

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lbacktraceio/library/models/metrics/UniqueEvent;->name:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lbacktraceio/library/models/metrics/UniqueEvent;->name:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lbacktraceio/library/common/BacktraceStringHelper;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lbacktraceio/library/models/metrics/UniqueEvent;->name:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    sget-object v0, Lbacktraceio/library/models/metrics/UniqueEvent;->LOG_TAG:Ljava/lang/String;

    const-string v1, "Unique Event name must not be null or empty"

    invoke-static {v0, v1}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, ""

    return-object v0
.end method

.method public update(JLjava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, Lbacktraceio/library/models/metrics/Event;->timestamp:J

    invoke-virtual {p0, p3}, Lbacktraceio/library/models/metrics/Event;->addAttributesImpl(Ljava/util/Map;)V

    return-void
.end method
