.class public final Lcom/withpersona/sdk2/inquiry/selfie/c$d$b$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lku/p0;",
        "Lnt/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1$2$1$1"
    f = "OldCameraScreenRunner.kt"
    l = {
        0xf5,
        0xf9
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/selfie/c;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/selfie/c;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;",
            "Lcom/withpersona/sdk2/inquiry/selfie/c;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/c$d$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b$a;->u:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b$a;->v:Lcom/withpersona/sdk2/inquiry/selfie/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b$a;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b$a;->u:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b$a;->v:Lcom/withpersona/sdk2/inquiry/selfie/c;

    invoke-direct {p1, v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b$a;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/selfie/c;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b$a;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/p0;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b$a;->t:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Ljt/n;

    invoke-virtual {p1}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b$a;->u:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$g;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$g;->b()J

    move-result-wide v4

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b$a;->t:I

    invoke-static {v4, v5, p0}, Lku/z0;->b(JLnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b$a;->v:Lcom/withpersona/sdk2/inquiry/selfie/c;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/selfie/c;->l(Lcom/withpersona/sdk2/inquiry/selfie/c;)Lfn/g;

    move-result-object p1

    invoke-interface {p1}, Lfn/g;->b()Lnu/p0;

    move-result-object p1

    invoke-interface {p1}, Lnu/p0;->getValue()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lcom/withpersona/sdk2/camera/d$a;

    if-eqz p1, :cond_4

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_4
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b$a;->v:Lcom/withpersona/sdk2/inquiry/selfie/c;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/selfie/c;->l(Lcom/withpersona/sdk2/inquiry/selfie/c;)Lfn/g;

    move-result-object p1

    iput v3, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b$a;->t:I

    invoke-interface {p1, p0}, Lfn/g;->i(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    invoke-static {p1}, Ljt/n;->h(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    check-cast p1, Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    :cond_6
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b$a;->v:Lcom/withpersona/sdk2/inquiry/selfie/c;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/selfie/c;->p(Lcom/withpersona/sdk2/inquiry/selfie/c;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object p1

    new-instance v4, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;

    sget-object v5, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureState;->RECORDING_TIMED_OUT:Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureState;

    const/16 v9, 0x8

    const/4 v10, 0x0

    const-string v6, "local_video"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v4, v0, v3, v1}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logSelfieCaptureStateEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;ZILjava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b$a;->v:Lcom/withpersona/sdk2/inquiry/selfie/c;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/selfie/c;->m(Lcom/withpersona/sdk2/inquiry/selfie/c;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    if-eqz p1, :cond_7

    new-instance v0, Lfn/m0;

    invoke-direct {v0}, Lfn/m0;-><init>()V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
