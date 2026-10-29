.class public final Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->Z1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;
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
    c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCountdownToCapture$2"
    f = "SelfieWorkflow.kt"
    l = {
        0x4a3
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:J

.field public u:I

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

.field public final synthetic w:Lym/k$a;
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

.field public final synthetic x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

.field public final synthetic y:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;->v:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;->w:Lym/k$a;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;->y:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method

.method public static synthetic q(JLcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;->r(JLcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final r(JLcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/r$c;)Lkotlin/Unit;
    .locals 24

    move-object/from16 v0, p4

    invoke-virtual {v0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;

    :goto_0
    move-object v2, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    if-nez v2, :cond_1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_1
    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->D()I

    move-result v1

    const/4 v3, 0x1

    if-le v1, v3, :cond_2

    const-wide/16 v4, 0x0

    cmp-long v4, p0, v4

    if-lez v4, :cond_2

    add-int/lit8 v3, v1, -0x1

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->G()Lkn/b;

    move-result-object v4

    const/16 v20, 0x7ffc

    const/16 v21, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v2 .. v21}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->A(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;ILkn/b;JLcom/withpersona/sdk2/camera/CameraProperties;JFLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$b;ZZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;

    move-result-object v1

    invoke-virtual {v0, v1}, Lym/r$c;->e(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->w()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->G()Lkn/b;

    move-result-object v4

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->g()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->n()J

    move-result-wide v9

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v14

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->t()J

    move-result-wide v12

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->k(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v15

    invoke-virtual/range {p3 .. p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->E()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;

    move-result-object v16

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->E()F

    move-result v5

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->C()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v17

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->s()Z

    move-result v18

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->I()Z

    move-result v21

    new-instance v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    const/16 v22, 0x6040

    const/16 v23, 0x0

    const/4 v11, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v3 .. v23}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;-><init>(Lkn/b;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;Ljava/lang/Long;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v3}, Lym/r$c;->e(Ljava/lang/Object;)V

    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 6
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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;->v:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;->w:Lym/k$a;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;->y:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;->u:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-wide v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;->t:J

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;->v:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/selfie/n;->a(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)J

    move-result-wide v3

    iput-wide v3, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;->t:J

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;->u:I

    invoke-static {v3, v4, p0}, Lku/z0;->b(JLnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-wide v0, v3

    :goto_0
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;->w:Lym/k$a;

    invoke-virtual {p1}, Lym/k$a;->d()Lym/h;

    move-result-object p1

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;->y:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;->v:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    new-instance v6, Lyp/b5;

    invoke-direct {v6, v0, v1, v4, v5}, Lyp/b5;-><init>(JLcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V

    const/4 v0, 0x0

    invoke-static {v3, v0, v6, v2, v0}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object v0

    invoke-interface {p1, v0}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
