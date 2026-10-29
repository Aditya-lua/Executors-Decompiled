.class public final synthetic Lc5/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001aB\u0010\t\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0087@\u00a2\u0006\u0004\u0008\t\u0010\n\u001aA\u0010\u000b\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a<\u0010\u000f\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\u0008\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0006H\u0087@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u001c\u0010\u0012\u001a\u00020\u0011*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\u0080@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "R",
        "Lx4/u;",
        "db",
        "",
        "isReadOnly",
        "inTransaction",
        "Lkotlin/Function1;",
        "Lf5/b;",
        "block",
        "d",
        "(Lx4/u;ZZLkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;",
        "b",
        "(Lx4/u;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
        "Lnt/b;",
        "",
        "c",
        "(Lx4/u;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;",
        "Lkotlin/coroutines/CoroutineContext;",
        "a",
        "(Lx4/u;ZLnt/b;)Ljava/lang/Object;",
        "Ljava/io/File;",
        "databaseFile",
        "",
        "e",
        "(Ljava/io/File;)I",
        "room-runtime"
    }
    k = 0x5
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
    xs = "androidx/room/util/DBUtil"
.end annotation


# direct methods
.method public static final a(Lx4/u;ZLnt/b;)Ljava/lang/Object;
    .locals 1
    .param p0    # Lx4/u;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx4/u;",
            "Z",
            "Lnt/b<",
            "-",
            "Lkotlin/coroutines/CoroutineContext;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-interface {p2}, Lnt/b;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p2

    sget-object v0, Lx4/c0;->b:Lx4/c0$a;

    invoke-interface {p2, v0}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object p2

    check-cast p2, Lx4/c0;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lx4/c0;->a()Lkotlin/coroutines/d;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p0}, Lx4/u;->F()Z

    move-result v0

    if-eqz v0, :cond_3

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lx4/u;->v()Lkotlin/coroutines/CoroutineContext;

    move-result-object p0

    invoke-interface {p0, p2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p0

    return-object p0

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lx4/u;->C()Lkotlin/coroutines/CoroutineContext;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-virtual {p0}, Lx4/u;->v()Lkotlin/coroutines/CoroutineContext;

    move-result-object p0

    return-object p0

    :cond_3
    invoke-virtual {p0}, Lx4/u;->v()Lkotlin/coroutines/CoroutineContext;

    move-result-object p0

    if-eqz p2, :cond_4

    goto :goto_1

    :cond_4
    sget-object p2, Lkotlin/coroutines/e;->a:Lkotlin/coroutines/e;

    :goto_1
    invoke-interface {p0, p2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lx4/u;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 8
    .param p0    # Lx4/u;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lx4/u;",
            "ZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lf5/b;",
            "+TR;>;)TR;"
        }
    .end annotation

    const-string v0, "db"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lx4/u;->g()V

    invoke-virtual {p0}, Lx4/u;->h()V

    invoke-virtual {p0}, Lx4/u;->B()Ljava/lang/ThreadLocal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    if-nez v0, :cond_0

    sget-object v0, Lkotlin/coroutines/e;->a:Lkotlin/coroutines/e;

    :cond_0
    move-object v2, v0

    new-instance v1, Lc5/c$a;

    const/4 v7, 0x0

    move-object v3, p0

    move v5, p1

    move v4, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v7}, Lc5/c$a;-><init>(Lkotlin/coroutines/CoroutineContext;Lx4/u;ZZLkotlin/jvm/functions/Function1;Lnt/b;)V

    invoke-static {v1}, Lz4/r;->a(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lx4/u;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;
    .locals 11
    .param p0    # Lx4/u;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lx4/u;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lnt/b<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lnt/b<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v1, p2, Lc5/c$c;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lc5/c$c;

    iget v2, v1, Lc5/c$c;->w:I

    const/high16 v4, -0x80000000

    and-int v6, v2, v4

    if-eqz v6, :cond_0

    sub-int/2addr v2, v4

    iput v2, v1, Lc5/c$c;->w:I

    :goto_0
    move-object v6, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lc5/c$c;

    invoke-direct {v1, p2}, Lc5/c$c;-><init>(Lnt/b;)V

    goto :goto_0

    :goto_1
    iget-object v0, v6, Lc5/c$c;->v:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v7

    iget v1, v6, Lc5/c$c;->w:I

    const/4 v2, 0x4

    const/4 v4, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v1, :cond_5

    if-eq v1, v9, :cond_4

    if-eq v1, v8, :cond_3

    if-eq v1, v4, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v1, v6, Lc5/c$c;->u:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v3, v6, Lc5/c$c;->t:Ljava/lang/Object;

    check-cast v3, Lx4/u;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    return-object v0

    :cond_4
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    return-object v0

    :cond_5
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lx4/u;->F()Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance v0, Lc5/c$d;

    invoke-direct {v0, p0, p1, v10}, Lc5/c$d;-><init>(Lx4/u;Lkotlin/jvm/functions/Function1;Lnt/b;)V

    iput v9, v6, Lc5/c$c;->w:I

    invoke-static {p0, v0, v6}, Lx4/v;->e(Lx4/u;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_6

    goto :goto_3

    :cond_6
    return-object v0

    :cond_7
    invoke-virtual {p0}, Lx4/u;->F()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Lx4/u;->M()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Lx4/u;->G()Z

    move-result v0

    if-eqz v0, :cond_9

    new-instance v0, Lc5/c$e;

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x1

    move-object v3, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lc5/c$e;-><init>(ZZLx4/u;Lnt/b;Lkotlin/jvm/functions/Function1;)V

    iput v8, v6, Lc5/c$c;->w:I

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v6}, Lx4/u;->W(ZLkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_8

    goto :goto_3

    :cond_8
    return-object v0

    :cond_9
    iput-object p0, v6, Lc5/c$c;->t:Ljava/lang/Object;

    iput-object p1, v6, Lc5/c$c;->u:Ljava/lang/Object;

    iput v4, v6, Lc5/c$c;->w:I

    invoke-static {p0, v9, v6}, Lc5/a;->b(Lx4/u;ZLnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_a

    goto :goto_3

    :cond_a
    move-object v3, p0

    move-object v1, p1

    :goto_2
    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v4, Lc5/c$b;

    invoke-direct {v4, v10, v3, v1}, Lc5/c$b;-><init>(Lnt/b;Lx4/u;Lkotlin/jvm/functions/Function1;)V

    iput-object v10, v6, Lc5/c$c;->t:Ljava/lang/Object;

    iput-object v10, v6, Lc5/c$c;->u:Ljava/lang/Object;

    iput v2, v6, Lc5/c$c;->w:I

    invoke-static {v0, v4, v6}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_b

    :goto_3
    return-object v7

    :cond_b
    return-object v0
.end method

.method public static final d(Lx4/u;ZZLkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;
    .locals 14
    .param p0    # Lx4/u;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lx4/u;",
            "ZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lf5/b;",
            "+TR;>;",
            "Lnt/b<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v0, p4

    instance-of v1, v0, Lc5/c$g;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lc5/c$g;

    iget v2, v1, Lc5/c$g;->y:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lc5/c$g;->y:I

    :goto_0
    move-object v6, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lc5/c$g;

    invoke-direct {v1, v0}, Lc5/c$g;-><init>(Lnt/b;)V

    goto :goto_0

    :goto_1
    iget-object v0, v6, Lc5/c$g;->x:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v7

    iget v1, v6, Lc5/c$g;->y:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v8, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v8, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-boolean p0, v6, Lc5/c$g;->w:Z

    iget-boolean p1, v6, Lc5/c$g;->v:Z

    iget-object v1, v6, Lc5/c$g;->u:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v3, v6, Lc5/c$g;->t:Ljava/lang/Object;

    check-cast v3, Lx4/u;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    move v12, p0

    move-object v13, v1

    move-object v10, v3

    :goto_2
    move v11, p1

    goto :goto_3

    :cond_3
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    return-object v0

    :cond_4
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lx4/u;->F()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lx4/u;->M()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lx4/u;->G()Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Lc5/c$h;

    const/4 v4, 0x0

    move-object v3, p0

    move v2, p1

    move/from16 v1, p2

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v5}, Lc5/c$h;-><init>(ZZLx4/u;Lnt/b;Lkotlin/jvm/functions/Function1;)V

    move-object v2, v0

    iput v8, v6, Lc5/c$g;->y:I

    invoke-virtual {p0, p1, v2, v6}, Lx4/u;->W(ZLkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v7, :cond_5

    goto :goto_4

    :cond_5
    return-object p0

    :cond_6
    move/from16 v4, p2

    iput-object p0, v6, Lc5/c$g;->t:Ljava/lang/Object;

    move-object/from16 v5, p3

    iput-object v5, v6, Lc5/c$g;->u:Ljava/lang/Object;

    iput-boolean p1, v6, Lc5/c$g;->v:Z

    iput-boolean v4, v6, Lc5/c$g;->w:Z

    iput v3, v6, Lc5/c$g;->y:I

    invoke-static {p0, v4, v6}, Lc5/a;->b(Lx4/u;ZLnt/b;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v7, :cond_7

    goto :goto_4

    :cond_7
    move-object v10, p0

    move-object v0, v3

    move v12, v4

    move-object v13, v5

    goto :goto_2

    :goto_3
    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v8, Lc5/c$f;

    const/4 v9, 0x0

    invoke-direct/range {v8 .. v13}, Lc5/c$f;-><init>(Lnt/b;Lx4/u;ZZLkotlin/jvm/functions/Function1;)V

    const/4 p0, 0x0

    iput-object p0, v6, Lc5/c$g;->t:Ljava/lang/Object;

    iput-object p0, v6, Lc5/c$g;->u:Ljava/lang/Object;

    iput v2, v6, Lc5/c$g;->y:I

    invoke-static {v0, v8, v6}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v7, :cond_8

    :goto_4
    return-object v7

    :cond_8
    return-object p0
.end method

.method public static final e(Ljava/io/File;)I
    .locals 7
    .param p0    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "databaseFile"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-virtual {v0}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v1

    const/4 p0, 0x4

    :try_start_0
    invoke-static {p0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-wide/16 v4, 0x4

    const/4 v6, 0x1

    const-wide/16 v2, 0x3c

    invoke-virtual/range {v1 .. v6}, Ljava/nio/channels/FileChannel;->tryLock(JJZ)Ljava/nio/channels/FileLock;

    const-wide/16 v2, 0x3c

    invoke-virtual {v1, v2, v3}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    invoke-virtual {v1, v0}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v2

    if-ne v2, p0, :cond_0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    invoke-static {v1, v0}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return p0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Bad database header, unable to read 4 bytes at offset 60"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v1, p0}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method
