.class public final Lfq/k2$o;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfq/k2;->e2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;
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
    c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderShowInstructions$1"
    f = "SelfieStepStateManager.kt"
    l = {
        0x175
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lfq/k2;


# direct methods
.method public constructor <init>(Lfq/k2;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfq/k2;",
            "Lnt/b<",
            "-",
            "Lfq/k2$o;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfq/k2$o;->u:Lfq/k2;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 2
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

    new-instance v0, Lfq/k2$o;

    iget-object v1, p0, Lfq/k2$o;->u:Lfq/k2;

    invoke-direct {v0, v1, p1}, Lfq/k2$o;-><init>(Lfq/k2;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Lfq/k2$o;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lfq/k2$o;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/time/a;->b:Lkotlin/time/a$a;

    const/4 p1, 0x3

    sget-object v1, Lju/b;->e:Lju/b;

    invoke-static {p1, v1}, Lkotlin/time/b;->p(ILju/b;)J

    move-result-wide v3

    iput v2, p0, Lfq/k2$o;->t:I

    invoke-static {v3, v4, p0}, Lku/z0;->c(JLnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lfq/k2$o;->u:Lfq/k2;

    invoke-virtual {p1}, Lvr/c;->d()Lvr/f;

    move-result-object p1

    invoke-virtual {p1}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object p1

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;

    :goto_1
    move-object v0, p1

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    goto :goto_1

    :goto_2
    if-nez v0, :cond_4

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_4
    iget-object p1, p0, Lfq/k2$o;->u:Lfq/k2;

    invoke-virtual {p1}, Lvr/c;->d()Lvr/f;

    move-result-object p1

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;->A(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;

    move-result-object v0

    invoke-virtual {p1, v0}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
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

    invoke-virtual {p0, p1}, Lfq/k2$o;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lfq/k2$o;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lfq/k2$o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
