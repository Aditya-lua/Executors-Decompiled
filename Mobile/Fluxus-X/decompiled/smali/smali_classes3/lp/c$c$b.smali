.class public final Llp/c$c$b;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llp/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lav/p0;",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker$run$1$2"
    f = "IntegrationBrowserWorker.kt"
    l = {}
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "",
        "<anonymous>",
        "(Lav/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Llp/c;


# direct methods
.method public constructor <init>(Llp/c;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llp/c;",
            "Leu/b<",
            "-",
            "Llp/c$c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llp/c$c$b;->u:Llp/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Leu/b<",
            "*>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Llp/c$c$b;

    iget-object v0, p0, Llp/c$c$b;->u:Llp/c;

    invoke-direct {p1, v0, p2}, Llp/c$c$b;-><init>(Llp/c;Leu/b;)V

    return-object p1
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Llp/c$c$b;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Llp/c$c$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Llp/c$c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Llp/c$c$b;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Llp/c$c$b;->t:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Llp/c$c$b;->u:Llp/c;

    invoke-static {p1}, Llp/c;->f(Llp/c;)Lg/d;

    move-result-object p1

    iget-object v0, p0, Llp/c$c$b;->u:Llp/c;

    invoke-static {v0}, Llp/c;->e(Llp/c;)Llp/a;

    move-result-object v0

    invoke-virtual {v0}, Llp/a;->b()Z

    move-result v0

    const-string v1, "build(...)"

    if-eqz v0, :cond_0

    new-instance v2, Laq/a;

    new-instance v0, Lv/b$b;

    invoke-direct {v0}, Lv/b$b;-><init>()V

    invoke-virtual {v0}, Lv/b$b;->a()Lv/b;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llp/c$c$b;->u:Llp/c;

    invoke-static {v0}, Llp/c;->i(Llp/c;)Ljava/lang/String;

    move-result-object v4

    sget-object v0, Llp/h;->a:Llp/h;

    iget-object v1, p0, Llp/c$c$b;->u:Llp/c;

    invoke-static {v1}, Llp/c;->i(Llp/c;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Llp/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Llp/c$c$b;->u:Llp/c;

    invoke-static {v0}, Llp/c;->h(Llp/c;)Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, Llp/c$c$b;->u:Llp/c;

    invoke-static {v0}, Llp/c;->e(Llp/c;)Llp/a;

    move-result-object v0

    invoke-virtual {v0}, Llp/a;->a()Ljava/lang/String;

    move-result-object v7

    invoke-direct/range {v2 .. v7}, Laq/a;-><init>(Lv/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v2, Laq/c;

    new-instance v0, Lw/d$e;

    invoke-direct {v0}, Lw/d$e;-><init>()V

    invoke-virtual {v0}, Lw/d$e;->a()Lw/d;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Llp/c$c$b;->u:Llp/c;

    invoke-static {v1}, Llp/c;->i(Llp/c;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Llp/c$c$b;->u:Llp/c;

    invoke-static {v3}, Llp/c;->e(Llp/c;)Llp/a;

    move-result-object v3

    invoke-virtual {v3}, Llp/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v0, v1, v3}, Laq/c;-><init>(Lw/d;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p1, v2}, Lg/d;->b(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
