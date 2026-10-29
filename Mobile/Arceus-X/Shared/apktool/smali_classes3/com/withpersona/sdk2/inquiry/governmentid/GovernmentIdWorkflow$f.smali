.class public final Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$f;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->j0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$renderScreen$24"
    f = "GovernmentIdWorkflow.kt"
    l = {
        0x306
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

.field public final synthetic v:Lym/k$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lym/k<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;",
            "Ljava/lang/Object;",
            ">.a;"
        }
    .end annotation
.end field

.field public final synthetic w:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$f;->u:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$f;->v:Lym/k$a;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$f;->w:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method

.method public static synthetic q(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$f;->r(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final r(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p1, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

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

    new-instance p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$f;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$f;->u:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$f;->v:Lym/k$a;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$f;->w:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$f;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$f;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$f;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$f;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$f;->t:I

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

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$f;->u:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->V(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Landroid/content/Context;

    move-result-object v1

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$f;->t:I

    invoke-virtual {p1, v1, p0}, Lfn/j;->b(Landroid/content/Context;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$f;->u:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;->W(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;)Luo/l;

    move-result-object p1

    invoke-virtual {p1}, Luo/l;->a()V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$f;->v:Lym/k$a;

    invoke-virtual {p1}, Lym/k$a;->d()Lym/h;

    move-result-object p1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$f;->u:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$f;->w:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    new-instance v3, Lio/l1;

    invoke-direct {v3, v1}, Lio/l1;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)V

    const/4 v1, 0x0

    invoke-static {v0, v1, v3, v2, v1}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object v0

    invoke-interface {p1, v0}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
