.class public final Lu6/m$d;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu6/m;->a(Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lu6/q;",
        "Leu/b<",
        "-",
        "Lp6/o;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "coil3.network.NetworkFetcher$fetch$2"
    f = "NetworkFetcher.kt"
    l = {
        0x68
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lu6/q;",
        "response",
        "Lp6/o;",
        "<anonymous>",
        "(Lu6/q;)Lp6/o;"
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

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lu6/m;


# direct methods
.method public constructor <init>(Lu6/m;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu6/m;",
            "Leu/b<",
            "-",
            "Lu6/m$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lu6/m$d;->v:Lu6/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 2
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

    new-instance v0, Lu6/m$d;

    iget-object v1, p0, Lu6/m$d;->v:Lu6/m;

    invoke-direct {v0, v1, p2}, Lu6/m$d;-><init>(Lu6/m;Leu/b;)V

    iput-object p1, v0, Lu6/m$d;->u:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu6/q;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lu6/m$d;->m(Lu6/q;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lu6/m$d;->u:Ljava/lang/Object;

    check-cast v0, Lu6/q;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lu6/m$d;->t:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lu6/m$d;->v:Lu6/m;

    invoke-static {v0}, Lv6/e;->f(Lu6/q;)Lu6/r;

    move-result-object v2

    iput-object v0, p0, Lu6/m$d;->u:Ljava/lang/Object;

    iput v3, p0, Lu6/m$d;->t:I

    invoke-static {p1, v2, p0}, Lu6/m;->c(Lu6/m;Lu6/r;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    check-cast p1, Ln6/s;

    iget-object v1, p0, Lu6/m$d;->v:Lu6/m;

    invoke-static {v1}, Lu6/m;->b(Lu6/m;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lu6/q;->e()Lu6/n;

    move-result-object v0

    const-string v3, "Content-Type"

    invoke-virtual {v0, v3}, Lu6/n;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lu6/m;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ln6/f;->d:Ln6/f;

    new-instance v2, Lp6/o;

    invoke-direct {v2, p1, v0, v1}, Lp6/o;-><init>(Ln6/s;Ljava/lang/String;Ln6/f;)V

    return-object v2
.end method

.method public final m(Lu6/q;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu6/q;",
            "Leu/b<",
            "-",
            "Lp6/o;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lu6/m$d;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lu6/m$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lu6/m$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
