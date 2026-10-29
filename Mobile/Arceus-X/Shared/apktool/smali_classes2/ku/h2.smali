.class public final synthetic Lku/h2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\r\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a#\u0010\u0014\u001a\u00020\u0013*\u00020\u000f2\u0010\u0008\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\u0011\u0010\u0016\u001a\u00020\u0013*\u00020\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a\u0011\u0010\u0018\u001a\u00020\u0013*\u00020\u000f\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\"\u0015\u0010\u001c\u001a\u00020\u0001*\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001b\"\u0015\u0010\u001f\u001a\u00020\u0000*\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Lku/d2;",
        "",
        "invokeImmediately",
        "Lku/i2;",
        "handler",
        "Lku/i1;",
        "i",
        "(Lku/d2;ZLku/i2;)Lku/i1;",
        "parent",
        "Lku/a0;",
        "a",
        "(Lku/d2;)Lku/a0;",
        "handle",
        "e",
        "(Lku/d2;Lku/i1;)Lku/i1;",
        "Lkotlin/coroutines/CoroutineContext;",
        "Ljava/util/concurrent/CancellationException;",
        "Lkotlinx/coroutines/CancellationException;",
        "cause",
        "",
        "c",
        "(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/CancellationException;)V",
        "g",
        "(Lku/d2;)V",
        "f",
        "(Lkotlin/coroutines/CoroutineContext;)V",
        "k",
        "(Lkotlin/coroutines/CoroutineContext;)Z",
        "isActive",
        "h",
        "(Lkotlin/coroutines/CoroutineContext;)Lku/d2;",
        "job",
        "kotlinx-coroutines-core"
    }
    k = 0x5
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
    xs = "kotlinx/coroutines/JobKt"
.end annotation


# direct methods
.method public static final a(Lku/d2;)Lku/a0;
    .locals 1
    .param p0    # Lku/d2;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lku/f2;

    invoke-direct {v0, p0}, Lku/f2;-><init>(Lku/d2;)V

    return-object v0
.end method

.method public static synthetic b(Lku/d2;ILjava/lang/Object;)Lku/a0;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, Lku/g2;->a(Lku/d2;)Lku/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/CancellationException;)V
    .locals 1
    .param p0    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/concurrent/CancellationException;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    sget-object v0, Lku/d2;->Mo:Lku/d2$b;

    invoke-interface {p0, v0}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object p0

    check-cast p0, Lku/d2;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lku/d2;->c(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method

.method public static synthetic d(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lku/g2;->c(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final e(Lku/d2;Lku/i1;)Lku/i1;
    .locals 3
    .param p0    # Lku/d2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lku/i1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lku/k1;

    invoke-direct {v0, p1}, Lku/k1;-><init>(Lku/i1;)V

    const/4 p1, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, p1, v1}, Lku/g2;->j(Lku/d2;ZLku/i2;ILjava/lang/Object;)Lku/i1;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lkotlin/coroutines/CoroutineContext;)V
    .locals 1
    .param p0    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    sget-object v0, Lku/d2;->Mo:Lku/d2$b;

    invoke-interface {p0, v0}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object p0

    check-cast p0, Lku/d2;

    if-eqz p0, :cond_0

    invoke-static {p0}, Lku/g2;->g(Lku/d2;)V

    :cond_0
    return-void
.end method

.method public static final g(Lku/d2;)V
    .locals 1
    .param p0    # Lku/d2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-interface {p0}, Lku/d2;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p0}, Lku/d2;->m()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    throw p0
.end method

.method public static final h(Lkotlin/coroutines/CoroutineContext;)Lku/d2;
    .locals 3
    .param p0    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lku/d2;->Mo:Lku/d2$b;

    invoke-interface {p0, v0}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v0

    check-cast v0, Lku/d2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Current context doesn\'t contain Job in it: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final i(Lku/d2;ZLku/i2;)Lku/i1;
    .locals 2
    .param p0    # Lku/d2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lku/i2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    instance-of v0, p0, Lku/j2;

    if-eqz v0, :cond_0

    check-cast p0, Lku/j2;

    invoke-virtual {p0, p1, p2}, Lku/j2;->r0(ZLku/i2;)Lku/i1;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p2}, Lku/i2;->w()Z

    move-result v0

    new-instance v1, Lku/h2$a;

    invoke-direct {v1, p2}, Lku/h2$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p0, v0, p1, v1}, Lku/d2;->l(ZZLkotlin/jvm/functions/Function1;)Lku/i1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lku/d2;ZLku/i2;ILjava/lang/Object;)Lku/i1;
    .locals 0

    const/4 p4, 0x1

    and-int/2addr p3, p4

    if-eqz p3, :cond_0

    move p1, p4

    :cond_0
    invoke-static {p0, p1, p2}, Lku/g2;->i(Lku/d2;ZLku/i2;)Lku/i1;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Lkotlin/coroutines/CoroutineContext;)Z
    .locals 1
    .param p0    # Lkotlin/coroutines/CoroutineContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    sget-object v0, Lku/d2;->Mo:Lku/d2$b;

    invoke-interface {p0, v0}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object p0

    check-cast p0, Lku/d2;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lku/d2;->b()Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method
