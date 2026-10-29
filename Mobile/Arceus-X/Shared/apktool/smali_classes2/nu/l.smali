.class public final synthetic Lnu/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a6\u0010\t\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u0082@\u00a2\u0006\u0004\u0008\t\u0010\n\u001a#\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a+\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "T",
        "Lnu/i;",
        "Lmu/x;",
        "channel",
        "",
        "b",
        "(Lnu/i;Lmu/x;Lnt/b;)Ljava/lang/Object;",
        "",
        "consume",
        "c",
        "(Lnu/i;Lmu/x;ZLnt/b;)Ljava/lang/Object;",
        "Lnu/h;",
        "e",
        "(Lmu/x;)Lnu/h;",
        "Lku/p0;",
        "scope",
        "d",
        "(Lnu/h;Lku/p0;)Lmu/x;",
        "kotlinx-coroutines-core"
    }
    k = 0x5
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
    xs = "kotlinx/coroutines/flow/FlowKt"
.end annotation


# direct methods
.method public static final synthetic a(Lnu/i;Lmu/x;ZLnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lnu/l;->c(Lnu/i;Lmu/x;ZLnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lnu/i;Lmu/x;Lnt/b;)Ljava/lang/Object;
    .locals 1
    .param p0    # Lnu/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lmu/x;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnu/i<",
            "-TT;>;",
            "Lmu/x<",
            "+TT;>;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const/4 v0, 0x1

    invoke-static {p0, p1, v0, p2}, Lnu/l;->c(Lnu/i;Lmu/x;ZLnt/b;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final c(Lnu/i;Lmu/x;ZLnt/b;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnu/i<",
            "-TT;>;",
            "Lmu/x<",
            "+TT;>;Z",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lnu/l$a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lnu/l$a;

    iget v1, v0, Lnu/l$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lnu/l$a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lnu/l$a;

    invoke-direct {v0, p3}, Lnu/l$a;-><init>(Lnt/b;)V

    :goto_0
    iget-object p3, v0, Lnu/l$a;->x:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lnu/l$a;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v4, :cond_3

    if-ne v2, v3, :cond_2

    iget-boolean p2, v0, Lnu/l$a;->w:Z

    iget-object p0, v0, Lnu/l$a;->v:Ljava/lang/Object;

    check-cast p0, Lmu/i;

    iget-object p1, v0, Lnu/l$a;->u:Ljava/lang/Object;

    check-cast p1, Lmu/x;

    iget-object v2, v0, Lnu/l$a;->t:Ljava/lang/Object;

    check-cast v2, Lnu/i;

    :try_start_0
    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    move-object p3, p0

    move-object p0, v2

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_4

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    iget-boolean p2, v0, Lnu/l$a;->w:Z

    iget-object p0, v0, Lnu/l$a;->v:Ljava/lang/Object;

    check-cast p0, Lmu/i;

    iget-object p1, v0, Lnu/l$a;->u:Ljava/lang/Object;

    check-cast p1, Lmu/x;

    iget-object v2, v0, Lnu/l$a;->t:Ljava/lang/Object;

    check-cast v2, Lnu/i;

    :try_start_1
    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :cond_4
    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-static {p0}, Lnu/j;->r(Lnu/i;)V

    :try_start_2
    invoke-interface {p1}, Lmu/x;->iterator()Lmu/i;

    move-result-object p3

    :goto_1
    iput-object p0, v0, Lnu/l$a;->t:Ljava/lang/Object;

    iput-object p1, v0, Lnu/l$a;->u:Ljava/lang/Object;

    iput-object p3, v0, Lnu/l$a;->v:Ljava/lang/Object;

    iput-boolean p2, v0, Lnu/l$a;->w:Z

    iput v4, v0, Lnu/l$a;->y:I

    invoke-interface {p3, v0}, Lmu/i;->a(Lnt/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    goto :goto_3

    :cond_5
    move-object v5, v2

    move-object v2, p0

    move-object p0, p3

    move-object p3, v5

    :goto_2
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-interface {p0}, Lmu/i;->next()Ljava/lang/Object;

    move-result-object p3

    iput-object v2, v0, Lnu/l$a;->t:Ljava/lang/Object;

    iput-object p1, v0, Lnu/l$a;->u:Ljava/lang/Object;

    iput-object p0, v0, Lnu/l$a;->v:Ljava/lang/Object;

    iput-boolean p2, v0, Lnu/l$a;->w:Z

    iput v3, v0, Lnu/l$a;->y:I

    invoke-interface {v2, p3, v0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne p3, v1, :cond_1

    :goto_3
    return-object v1

    :cond_6
    if-eqz p2, :cond_7

    const/4 p0, 0x0

    invoke-static {p1, p0}, Lmu/n;->a(Lmu/x;Ljava/lang/Throwable;)V

    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :goto_4
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p3

    if-eqz p2, :cond_8

    invoke-static {p1, p0}, Lmu/n;->a(Lmu/x;Ljava/lang/Throwable;)V

    :cond_8
    throw p3
.end method

.method public static final d(Lnu/h;Lku/p0;)Lmu/x;
    .locals 0
    .param p0    # Lnu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lku/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnu/h<",
            "+TT;>;",
            "Lku/p0;",
            ")",
            "Lmu/x<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p0}, Lou/f;->b(Lnu/h;)Lou/e;

    move-result-object p0

    invoke-virtual {p0, p1}, Lou/e;->m(Lku/p0;)Lmu/x;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lmu/x;)Lnu/h;
    .locals 8
    .param p0    # Lmu/x;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lmu/x<",
            "+TT;>;)",
            "Lnu/h<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lnu/e;

    const/16 v6, 0x1c

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v7}, Lnu/e;-><init>(Lmu/x;ZLkotlin/coroutines/CoroutineContext;ILmu/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
