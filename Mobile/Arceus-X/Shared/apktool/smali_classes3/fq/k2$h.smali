.class public final Lfq/k2$h;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfq/k2;->g1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function1<",
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
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        ""
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderAcquireNextPose$1"
    f = "SelfieStepStateManager.kt"
    l = {
        0x10e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lfq/k2;

.field public final synthetic v:I


# direct methods
.method public constructor <init>(Lfq/k2;ILnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfq/k2;",
            "I",
            "Lnt/b<",
            "-",
            "Lfq/k2$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfq/k2$h;->u:Lfq/k2;

    iput p2, p0, Lfq/k2$h;->v:I

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lfq/k2$h;

    iget-object v1, p0, Lfq/k2$h;->u:Lfq/k2;

    iget v2, p0, Lfq/k2$h;->v:I

    invoke-direct {v0, v1, v2, p1}, Lfq/k2$h;-><init>(Lfq/k2;ILnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Lfq/k2$h;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lfq/k2$h;->t:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    check-cast v1, Ljt/n;

    invoke-virtual {v1}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object v2, v0, Lfq/k2$h;->u:Lfq/k2;

    invoke-static {v2}, Lfq/k2;->T0(Lfq/k2;)Ldq/a;

    move-result-object v2

    iget v4, v0, Lfq/k2$h;->v:I

    iput v3, v0, Lfq/k2$h;->t:I

    invoke-virtual {v2, v4, v0}, Ldq/a;->k(ILnt/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    return-object v1

    :cond_2
    move-object v1, v2

    :goto_0
    iget-object v2, v0, Lfq/k2$h;->u:Lfq/k2;

    invoke-static {v1}, Ljt/n;->h(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    move-object v3, v1

    check-cast v3, Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;

    invoke-virtual {v2}, Lvr/c;->d()Lvr/f;

    move-result-object v4

    invoke-virtual {v4}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v4

    instance-of v5, v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;

    const/4 v6, 0x0

    if-eqz v5, :cond_3

    check-cast v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;

    move-object v7, v4

    goto :goto_1

    :cond_3
    move-object v7, v6

    :goto_1
    if-nez v7, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v2}, Lvr/c;->d()Lvr/f;

    move-result-object v4

    invoke-virtual {v2}, Lvr/c;->d()Lvr/f;

    move-result-object v5

    invoke-static {v3}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    const/16 v18, 0x1bf

    const/16 v19, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v7 .. v19}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;->A(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;Lcom/withpersona/sdk2/camera/CameraProperties;JLjava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZLjava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;

    move-result-object v3

    invoke-static {v2, v5, v3, v6}, Lfq/k2;->V0(Lfq/k2;Lvr/f;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v2

    invoke-virtual {v4, v2}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    :cond_5
    :goto_2
    iget-object v2, v0, Lfq/k2$h;->u:Lfq/k2;

    invoke-static {v1}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-static {v2, v1}, Lfq/k2;->W0(Lfq/k2;Ljava/lang/Throwable;)V

    :cond_6
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1
.end method

.method public final q(Lnt/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lfq/k2$h;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lfq/k2$h;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lfq/k2$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
