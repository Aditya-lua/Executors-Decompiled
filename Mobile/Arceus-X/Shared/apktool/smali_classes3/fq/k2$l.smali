.class public final Lfq/k2$l;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfq/k2;->A1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;
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
    c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderCountdownToCapture$2"
    f = "SelfieStepStateManager.kt"
    l = {
        0x49c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:J

.field public u:I

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

.field public final synthetic w:Lfq/k2;

.field public final synthetic x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lfq/k2;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lfq/k2;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;",
            "Lnt/b<",
            "-",
            "Lfq/k2$l;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfq/k2$l;->v:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    iput-object p2, p0, Lfq/k2$l;->w:Lfq/k2;

    iput-object p3, p0, Lfq/k2$l;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 4
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

    new-instance v0, Lfq/k2$l;

    iget-object v1, p0, Lfq/k2$l;->v:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    iget-object v2, p0, Lfq/k2$l;->w:Lfq/k2;

    iget-object v3, p0, Lfq/k2$l;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;

    invoke-direct {v0, v1, v2, v3, p1}, Lfq/k2$l;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lfq/k2;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Lfq/k2$l;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v0, p0

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lfq/k2$l;->u:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-wide v1, v0, Lfq/k2$l;->t:J

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object v2, v0, Lfq/k2$l;->v:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    invoke-static {v2}, Lcom/withpersona/sdk2/inquiry/selfie/n;->a(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)J

    move-result-wide v4

    iput-wide v4, v0, Lfq/k2$l;->t:J

    iput v3, v0, Lfq/k2$l;->u:I

    invoke-static {v4, v5, v0}, Lku/z0;->b(JLnt/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    return-object v1

    :cond_2
    move-wide v1, v4

    :goto_0
    iget-object v4, v0, Lfq/k2$l;->w:Lfq/k2;

    invoke-virtual {v4}, Lvr/c;->d()Lvr/f;

    move-result-object v4

    invoke-virtual {v4}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v4

    instance-of v5, v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;

    if-eqz v5, :cond_3

    check-cast v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;

    :goto_1
    move-object v5, v4

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    goto :goto_1

    :goto_2
    if-nez v5, :cond_4

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1

    :cond_4
    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->D()I

    move-result v4

    if-le v4, v3, :cond_5

    const-wide/16 v6, 0x0

    cmp-long v1, v1, v6

    if-lez v1, :cond_5

    iget-object v1, v0, Lfq/k2$l;->w:Lfq/k2;

    invoke-virtual {v1}, Lvr/c;->d()Lvr/f;

    move-result-object v1

    add-int/lit8 v6, v4, -0x1

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->G()Lkn/b;

    move-result-object v7

    const/16 v23, 0x7ffc

    const/16 v24, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v5 .. v24}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->A(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;ILkn/b;JLcom/withpersona/sdk2/camera/CameraProperties;JFLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$b;ZZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;

    move-result-object v2

    invoke-virtual {v1, v2}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    goto :goto_3

    :cond_5
    iget-object v1, v0, Lfq/k2$l;->w:Lfq/k2;

    invoke-virtual {v1}, Lvr/c;->d()Lvr/f;

    move-result-object v1

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->G()Lkn/b;

    move-result-object v7

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->g()Ljava/util/List;

    move-result-object v11

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->n()J

    move-result-wide v12

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v17

    iget-object v2, v0, Lfq/k2$l;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->t()J

    move-result-wide v15

    iget-object v2, v0, Lfq/k2$l;->w:Lfq/k2;

    invoke-virtual {v2}, Lvr/c;->d()Lvr/f;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lfq/l2;->a(Lvr/f;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v18

    iget-object v2, v0, Lfq/k2$l;->v:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->E()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;

    move-result-object v19

    iget-object v2, v0, Lfq/k2$l;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->E()F

    move-result v8

    iget-object v2, v0, Lfq/k2$l;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->C()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    move-result-object v9

    iget-object v2, v0, Lfq/k2$l;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v20

    iget-object v2, v0, Lfq/k2$l;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->s()Z

    move-result v21

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->I()Z

    move-result v24

    new-instance v6, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    const/16 v25, 0x6048

    const/16 v26, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v6 .. v26}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;-><init>(Lkn/b;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;Ljava/lang/Long;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v6}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    :goto_3
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

    invoke-virtual {p0, p1}, Lfq/k2$l;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lfq/k2$l;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lfq/k2$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
