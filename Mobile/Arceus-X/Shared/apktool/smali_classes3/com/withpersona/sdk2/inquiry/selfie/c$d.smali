.class public final Lcom/withpersona/sdk2/inquiry/selfie/c$d;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/selfie/c;->w(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;Lan/y;)V
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
    c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1"
    f = "OldCameraScreenRunner.kt"
    l = {
        0xec,
        0xee
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/selfie/c;

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;

.field public final synthetic w:Landroidx/lifecycle/m;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Landroidx/lifecycle/m;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/c;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;",
            "Landroidx/lifecycle/m;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/c$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d;->u:Lcom/withpersona/sdk2/inquiry/selfie/c;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d;->v:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d;->w:Landroidx/lifecycle/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

    return-void
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

    new-instance p1, Lcom/withpersona/sdk2/inquiry/selfie/c$d;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d;->u:Lcom/withpersona/sdk2/inquiry/selfie/c;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d;->v:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d;->w:Landroidx/lifecycle/m;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/withpersona/sdk2/inquiry/selfie/c$d;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Landroidx/lifecycle/m;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/c$d;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/c$d;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/c$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/c$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d;->t:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

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

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d;->u:Lcom/withpersona/sdk2/inquiry/selfie/c;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/selfie/c;->l(Lcom/withpersona/sdk2/inquiry/selfie/c;)Lfn/g;

    move-result-object p1

    invoke-interface {p1}, Lfn/g;->b()Lnu/p0;

    move-result-object p1

    new-instance v1, Lcom/withpersona/sdk2/inquiry/selfie/c$d$a;

    invoke-direct {v1, v2}, Lcom/withpersona/sdk2/inquiry/selfie/c$d$a;-><init>(Lnt/b;)V

    invoke-static {p1, v1}, Lnu/j;->N(Lnu/h;Lkotlin/jvm/functions/Function2;)Lnu/h;

    move-result-object p1

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d;->t:I

    invoke-static {p1, p0}, Lnu/j;->i(Lnu/h;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    invoke-static {}, Lku/g1;->c()Lku/n2;

    move-result-object p1

    new-instance v1, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d;->v:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d;->u:Lcom/withpersona/sdk2/inquiry/selfie/c;

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d;->w:Landroidx/lifecycle/m;

    invoke-direct {v1, v4, v5, v6, v2}, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/selfie/c;Landroidx/lifecycle/m;Lnt/b;)V

    iput v3, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d;->t:I

    invoke-static {p1, v1, p0}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
