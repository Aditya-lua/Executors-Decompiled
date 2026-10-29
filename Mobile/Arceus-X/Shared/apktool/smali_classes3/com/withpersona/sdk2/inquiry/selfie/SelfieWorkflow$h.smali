.class public final Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->K1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;
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
    c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCapture$1"
    f = "SelfieWorkflow.kt"
    l = {
        0x563,
        0x565
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:J

.field public u:I

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

.field public final synthetic w:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

.field public final synthetic x:Lym/k$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lym/k<",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "Ljava/lang/Object;",
            ">.a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;->v:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;->w:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;->x:Lym/k$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method

.method public static synthetic q(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;->r(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final r(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lym/r$c;)Lkotlin/Unit;
    .locals 12

    invoke-virtual {p1}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_1
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->D()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->D()Ljava/lang/Long;

    move-result-object p0

    invoke-static {v1, p0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_2
    invoke-static {v0}, Lfq/l2;->c(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)V

    invoke-virtual {p1}, Lym/r$c;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->K()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v2

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->t()J

    move-result-wide v3

    const/4 p0, 0x0

    invoke-static {p1, p0}, Lcom/withpersona/sdk2/inquiry/selfie/p;->k(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v6

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v7

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->s()Z

    move-result v8

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->g()Ljava/util/List;

    move-result-object v9

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->i()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;

    move-result-object v10

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->f()Z

    move-result v11

    new-instance v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;

    invoke-direct/range {v1 .. v11}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;-><init>(Lcom/withpersona/sdk2/camera/CameraProperties;JLjava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZLjava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Z)V

    invoke-virtual {p1, v1}, Lym/r$c;->e(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    new-instance v2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v2}, Lym/r$c;->e(Ljava/lang/Object;)V

    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 3
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

    new-instance p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;->v:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;->w:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;->x:Lym/k$a;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;->u:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-wide v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;->t:J

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;->v:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->D()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sub-long/2addr v5, v7

    sget-object p1, Lkotlin/time/a;->b:Lkotlin/time/a$a;

    sget-object p1, Lju/b;->d:Lju/b;

    invoke-static {v5, v6, p1}, Lkotlin/time/b;->q(JLju/b;)J

    move-result-wide v7

    iput-wide v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;->t:J

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;->u:I

    invoke-static {v7, v8, p0}, Lku/z0;->c(JLnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;->w:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Ldq/a;

    move-result-object p1

    if-nez p1, :cond_4

    const-string p1, "selfiePoseManager"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    move-object p1, v3

    :cond_4
    iput-wide v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;->t:J

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;->u:I

    invoke-virtual {p1, p0}, Ldq/a;->o(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;->w:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->p1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lcom/withpersona/sdk2/inquiry/selfie/g;

    move-result-object p1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/g;->n()V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;->x:Lym/k$a;

    invoke-virtual {p1}, Lym/k$a;->d()Lym/h;

    move-result-object p1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;->w:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;->v:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    new-instance v2, Lyp/y4;

    invoke-direct {v2, v1}, Lyp/y4;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;)V

    invoke-static {v0, v3, v2, v4, v3}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object v0

    invoke-interface {p1, v0}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
