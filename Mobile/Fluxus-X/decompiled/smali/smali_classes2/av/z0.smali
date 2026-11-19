.class public final Lav/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0010\u0001\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\n\u0010\u0007\u001a\u0013\u0010\u000b\u001a\u00020\u0003*\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\"\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "",
        "a",
        "(Leu/b;)Ljava/lang/Object;",
        "",
        "timeMillis",
        "",
        "b",
        "(JLeu/b;)Ljava/lang/Object;",
        "Lkotlin/time/a;",
        "duration",
        "c",
        "e",
        "(J)J",
        "Lkotlin/coroutines/CoroutineContext;",
        "Lav/y0;",
        "d",
        "(Lkotlin/coroutines/CoroutineContext;)Lav/y0;",
        "delay",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Leu/b;)Ljava/lang/Object;
    .locals 4
    .param p0    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p0, Lav/z0$a;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lav/z0$a;

    iget v1, v0, Lav/z0$a;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lav/z0$a;->u:I

    goto :goto_0

    :cond_0
    new-instance v0, Lav/z0$a;

    invoke-direct {v0, p0}, Lav/z0$a;-><init>(Leu/b;)V

    :goto_0
    iget-object p0, v0, Lav/z0$a;->t:Ljava/lang/Object;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lav/z0$a;->u:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p0}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p0}, Lzt/o;->b(Ljava/lang/Object;)V

    iput v3, v0, Lav/z0$a;->u:I

    new-instance p0, Lav/p;

    invoke-static {v0}, Lfu/b;->c(Leu/b;)Leu/b;

    move-result-object v2

    invoke-direct {p0, v2, v3}, Lav/p;-><init>(Leu/b;I)V

    invoke-virtual {p0}, Lav/p;->G()V

    invoke-virtual {p0}, Lav/p;->y()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v2

    if-ne p0, v2, :cond_3

    invoke-static {v0}, Lgu/h;->c(Leu/b;)V

    :cond_3
    if-ne p0, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    new-instance p0, Lzt/d;

    invoke-direct {p0}, Lzt/d;-><init>()V

    throw p0
.end method

.method public static final b(JLeu/b;)Ljava/lang/Object;
    .locals 3
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-gtz v0, :cond_0

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_0
    new-instance v0, Lav/p;

    invoke-static {p2}, Lfu/b;->c(Leu/b;)Leu/b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lav/p;-><init>(Leu/b;I)V

    invoke-virtual {v0}, Lav/p;->G()V

    const-wide v1, 0x7fffffffffffffffL

    cmp-long v1, p0, v1

    if-gez v1, :cond_1

    invoke-interface {v0}, Leu/b;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v1

    invoke-static {v1}, Lav/z0;->d(Lkotlin/coroutines/CoroutineContext;)Lav/y0;

    move-result-object v1

    invoke-interface {v1, p0, p1, v0}, Lav/y0;->A(JLav/n;)V

    :cond_1
    invoke-virtual {v0}, Lav/p;->y()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2

    invoke-static {p2}, Lgu/h;->c(Leu/b;)V

    :cond_2
    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_3

    return-object p0

    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final c(JLeu/b;)Ljava/lang/Object;
    .locals 0
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1}, Lav/z0;->e(J)J

    move-result-wide p0

    invoke-static {p0, p1, p2}, Lav/z0;->b(JLeu/b;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final d(Lkotlin/coroutines/CoroutineContext;)Lav/y0;
    .locals 1
    .param p0    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lkotlin/coroutines/d;->No:Lkotlin/coroutines/d$b;

    invoke-interface {p0, v0}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object p0

    instance-of v0, p0, Lav/y0;

    if-eqz v0, :cond_0

    check-cast p0, Lav/y0;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    invoke-static {}, Lav/v0;->a()Lav/y0;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static final e(J)J
    .locals 3

    invoke-static {p0, p1}, Lkotlin/time/a;->K(J)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const-wide/32 v0, 0xf423f

    sget-object v2, Lzu/b;->b:Lzu/b;

    invoke-static {v0, v1, v2}, Lkotlin/time/b;->q(JLzu/b;)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Lkotlin/time/a;->M(JJ)J

    move-result-wide p0

    invoke-static {p0, p1}, Lkotlin/time/a;->w(J)J

    move-result-wide p0

    return-wide p0

    :cond_0
    if-nez v0, :cond_1

    const-wide/16 p0, 0x0

    return-wide p0

    :cond_1
    new-instance p0, Lzt/l;

    invoke-direct {p0}, Lzt/l;-><init>()V

    throw p0
.end method
