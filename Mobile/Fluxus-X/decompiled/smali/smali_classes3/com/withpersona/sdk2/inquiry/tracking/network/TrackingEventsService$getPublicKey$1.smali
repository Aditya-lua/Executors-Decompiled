.class final Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$getPublicKey$1;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;->getPublicKey-gIAlu-s$tracking_events_release(Ljava/lang/String;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsService"
    f = "TrackingEventsService.kt"
    l = {
        0xd
    }
    m = "getPublicKey-gIAlu-s$tracking_events_release"
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


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;",
            "Leu/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$getPublicKey$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$getPublicKey$1;->this$0:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;

    invoke-direct {p0, p2}, Lgu/d;-><init>(Leu/b;)V

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

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$getPublicKey$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$getPublicKey$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$getPublicKey$1;->label:I

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$getPublicKey$1;->this$0:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;->getPublicKey-gIAlu-s$tracking_events_release(Ljava/lang/String;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {p1}, Lzt/n;->a(Ljava/lang/Object;)Lzt/n;

    move-result-object p1

    return-object p1
.end method
