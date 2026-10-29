.class final Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$currentCount$1;
.super Lpt/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->currentCount(Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache"
    f = "TrackingEventsCache.kt"
    l = {
        0x5e
    }
    m = "currentCount"
.end annotation


# instance fields
.field I$0:I

.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$currentCount$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$currentCount$1;->this$0:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;

    invoke-direct {p0, p2}, Lpt/d;-><init>(Lnt/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$currentCount$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$currentCount$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$currentCount$1;->label:I

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$currentCount$1;->this$0:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;

    invoke-virtual {p1, p0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;->currentCount(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
