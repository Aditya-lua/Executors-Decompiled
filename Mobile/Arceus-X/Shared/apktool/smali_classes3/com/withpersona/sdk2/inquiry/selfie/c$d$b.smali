.class public final Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/selfie/c$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1$2"
    f = "OldCameraScreenRunner.kt"
    l = {
        0xf0
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/selfie/c;

.field public final synthetic w:Landroidx/lifecycle/m;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/selfie/c;Landroidx/lifecycle/m;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;",
            "Lcom/withpersona/sdk2/inquiry/selfie/c;",
            "Landroidx/lifecycle/m;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;->u:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;->v:Lcom/withpersona/sdk2/inquiry/selfie/c;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;->w:Landroidx/lifecycle/m;

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

    new-instance p1, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;->u:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;->v:Lcom/withpersona/sdk2/inquiry/selfie/c;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;->w:Landroidx/lifecycle/m;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/selfie/c;Landroidx/lifecycle/m;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Ljt/n;

    invoke-virtual {p1}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;->u:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$g;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$g;->e()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;->v:Lcom/withpersona/sdk2/inquiry/selfie/c;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/selfie/c;->l(Lcom/withpersona/sdk2/inquiry/selfie/c;)Lfn/g;

    move-result-object p1

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;->t:I

    invoke-interface {p1, p0}, Lfn/g;->j(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;->v:Lcom/withpersona/sdk2/inquiry/selfie/c;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;->w:Landroidx/lifecycle/m;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;->u:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;

    invoke-static {p1}, Ljt/n;->h(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    move-object v4, p1

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/selfie/c;->n(Lcom/withpersona/sdk2/inquiry/selfie/c;)Lku/d2;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    invoke-static {v4, v5, v2, v5}, Lku/d2$a;->a(Lku/d2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_3
    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v4

    new-instance v6, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b$a;

    invoke-direct {v6, v1, v0, v5}, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b$a;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/selfie/c;Lnt/b;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/selfie/c;->r(Lcom/withpersona/sdk2/inquiry/selfie/c;Lku/d2;)V

    :cond_4
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;->u:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;

    invoke-static {p1}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_5

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$g;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$g;->c()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;->u:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$g;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$g;->d()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/c$d$b;->v:Lcom/withpersona/sdk2/inquiry/selfie/c;

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/selfie/c;->l(Lcom/withpersona/sdk2/inquiry/selfie/c;)Lfn/g;

    move-result-object v0

    invoke-interface {v0}, Lfn/g;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
