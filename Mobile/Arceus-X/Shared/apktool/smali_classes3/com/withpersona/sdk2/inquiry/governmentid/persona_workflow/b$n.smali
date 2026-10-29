.class public final Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$n;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->g0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;
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
    c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager$renderScreen$42"
    f = "GovernmentIdStepStateManager.kt"
    l = {
        0x383
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$n;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$n;->u:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$n;->v:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$n;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$n;->u:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$n;->v:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    invoke-direct {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$n;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$n;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$n;->t:I

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

    sget-object p1, Lfn/j;->a:Lfn/j;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$n;->u:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->U(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Landroid/content/Context;

    move-result-object v1

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$n;->t:I

    invoke-virtual {p1, v1, p0}, Lfn/j;->b(Landroid/content/Context;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$n;->u:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->V(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Luo/l;

    move-result-object p1

    invoke-virtual {p1}, Luo/l;->a()V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$n;->u:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    invoke-virtual {p1}, Lvr/c;->d()Lvr/f;

    move-result-object p1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$n;->v:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

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

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$n;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$n;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
