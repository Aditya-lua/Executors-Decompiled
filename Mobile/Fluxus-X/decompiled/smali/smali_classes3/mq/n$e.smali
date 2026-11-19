.class public final Lmq/n$e;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmq/n;->w(Lmq/q5$d$c;Lnn/z;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lav/p0;",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$2"
    f = "OldCameraScreenRunner.kt"
    l = {
        0x118
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "",
        "<anonymous>",
        "(Lav/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lmq/q5$d$c$b;

.field public final synthetic v:Lmq/n;


# direct methods
.method public constructor <init>(Lmq/q5$d$c$b;Lmq/n;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmq/q5$d$c$b;",
            "Lmq/n;",
            "Leu/b<",
            "-",
            "Lmq/n$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmq/n$e;->u:Lmq/q5$d$c$b;

    iput-object p2, p0, Lmq/n$e;->v:Lmq/n;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Leu/b<",
            "*>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lmq/n$e;

    iget-object v0, p0, Lmq/n$e;->u:Lmq/q5$d$c$b;

    iget-object v1, p0, Lmq/n$e;->v:Lmq/n;

    invoke-direct {p1, v0, v1, p2}, Lmq/n$e;-><init>(Lmq/q5$d$c$b;Lmq/n;Leu/b;)V

    return-object p1
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lmq/n$e;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lmq/n$e;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lmq/n$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lmq/n$e;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lmq/n$e;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lmq/n$e;->u:Lmq/q5$d$c$b;

    check-cast p1, Lmq/q5$d$c$b$i;

    invoke-virtual {p1}, Lmq/q5$d$c$b$i;->b()J

    move-result-wide v3

    iput v2, p0, Lmq/n$e;->t:I

    invoke-static {v3, v4, p0}, Lav/z0;->b(JLeu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lmq/n$e;->v:Lmq/n;

    invoke-static {p1}, Lmq/n;->l(Lmq/n;)Lsn/i;

    move-result-object p1

    invoke-interface {p1}, Lsn/i;->b()Ldv/p0;

    move-result-object p1

    invoke-interface {p1}, Ldv/p0;->getValue()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lsn/y$a;

    if-eqz p1, :cond_3

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_3
    iget-object p1, p0, Lmq/n$e;->v:Lmq/n;

    invoke-static {p1}, Lmq/n;->p(Lmq/n;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object p1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;

    sget-object v1, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureState;->RECORDING_TIMED_OUT:Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureState;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const-string v2, "webrtc"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v0, v3, v1, v2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logSelfieCaptureStateEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;ZILjava/lang/Object;)V

    iget-object p1, p0, Lmq/n$e;->v:Lmq/n;

    invoke-static {p1}, Lmq/n;->m(Lmq/n;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v0, Lsn/a1;

    invoke-direct {v0}, Lsn/a1;-><init>()V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
