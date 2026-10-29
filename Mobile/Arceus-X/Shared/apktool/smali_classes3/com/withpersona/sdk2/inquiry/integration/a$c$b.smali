.class public final Lcom/withpersona/sdk2/inquiry/integration/a$c$b;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/integration/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker$run$1$2"
    f = "IntegrationBrowserWorker.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/integration/a;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/integration/a;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/integration/a;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/integration/a$c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c$b;->u:Lcom/withpersona/sdk2/inquiry/integration/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 1
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

    new-instance p1, Lcom/withpersona/sdk2/inquiry/integration/a$c$b;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c$b;->u:Lcom/withpersona/sdk2/inquiry/integration/a;

    invoke-direct {p1, v0, p2}, Lcom/withpersona/sdk2/inquiry/integration/a$c$b;-><init>(Lcom/withpersona/sdk2/inquiry/integration/a;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/integration/a$c$b;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/integration/a$c$b;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/integration/a$c$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/integration/a$c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c$b;->t:I

    if-nez v0, :cond_1

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c$b;->u:Lcom/withpersona/sdk2/inquiry/integration/a;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/integration/a;->f(Lcom/withpersona/sdk2/inquiry/integration/a;)Lg/c;

    move-result-object p1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c$b;->u:Lcom/withpersona/sdk2/inquiry/integration/a;

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/integration/a;->e(Lcom/withpersona/sdk2/inquiry/integration/a;)Lxo/a;

    move-result-object v0

    invoke-virtual {v0}, Lxo/a;->b()Z

    move-result v0

    const-string v1, "build(...)"

    if-eqz v0, :cond_0

    new-instance v2, Lmp/a;

    new-instance v0, Lv/b$b;

    invoke-direct {v0}, Lv/b$b;-><init>()V

    invoke-virtual {v0}, Lv/b$b;->a()Lv/b;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c$b;->u:Lcom/withpersona/sdk2/inquiry/integration/a;

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/integration/a;->i(Lcom/withpersona/sdk2/inquiry/integration/a;)Ljava/lang/String;

    move-result-object v4

    sget-object v0, Lxo/e;->a:Lxo/e;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c$b;->u:Lcom/withpersona/sdk2/inquiry/integration/a;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/integration/a;->i(Lcom/withpersona/sdk2/inquiry/integration/a;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxo/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c$b;->u:Lcom/withpersona/sdk2/inquiry/integration/a;

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/integration/a;->h(Lcom/withpersona/sdk2/inquiry/integration/a;)Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c$b;->u:Lcom/withpersona/sdk2/inquiry/integration/a;

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/integration/a;->e(Lcom/withpersona/sdk2/inquiry/integration/a;)Lxo/a;

    move-result-object v0

    invoke-virtual {v0}, Lxo/a;->a()Ljava/lang/String;

    move-result-object v7

    invoke-direct/range {v2 .. v7}, Lmp/a;-><init>(Lv/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v2, Lmp/c;

    new-instance v0, Lw/d$e;

    invoke-direct {v0}, Lw/d$e;-><init>()V

    invoke-virtual {v0}, Lw/d$e;->a()Lw/d;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c$b;->u:Lcom/withpersona/sdk2/inquiry/integration/a;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/integration/a;->i(Lcom/withpersona/sdk2/inquiry/integration/a;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/integration/a$c$b;->u:Lcom/withpersona/sdk2/inquiry/integration/a;

    invoke-static {v3}, Lcom/withpersona/sdk2/inquiry/integration/a;->e(Lcom/withpersona/sdk2/inquiry/integration/a;)Lxo/a;

    move-result-object v3

    invoke-virtual {v3}, Lxo/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v0, v1, v3}, Lmp/c;-><init>(Lw/d;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p1, v2}, Lg/c;->b(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
