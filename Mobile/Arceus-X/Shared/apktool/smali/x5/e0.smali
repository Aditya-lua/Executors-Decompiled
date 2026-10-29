.class public final Lx5/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a5\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lx5/l0;",
        "tracer",
        "",
        "label",
        "Ljava/util/concurrent/Executor;",
        "executor",
        "Lkotlin/Function0;",
        "",
        "block",
        "Lx5/a0;",
        "c",
        "(Lx5/l0;Ljava/lang/String;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)Lx5/a0;",
        "work-runtime_release"
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
.method public static synthetic a(Ljava/util/concurrent/Executor;Lx5/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/lifecycle/d0;Ly1/c$a;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lx5/e0;->d(Ljava/util/concurrent/Executor;Lx5/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/lifecycle/d0;Ly1/c$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lx5/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/lifecycle/d0;Ly1/c$a;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lx5/e0;->e(Lx5/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/lifecycle/d0;Ly1/c$a;)V

    return-void
.end method

.method public static final c(Lx5/l0;Ljava/lang/String;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)Lx5/a0;
    .locals 7
    .param p0    # Lx5/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/Executor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx5/l0;",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/Executor;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)",
            "Lx5/a0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "tracer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "executor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Landroidx/lifecycle/d0;

    sget-object v0, Lx5/a0;->b:Lx5/a0$b$b;

    invoke-direct {v6, v0}, Landroidx/lifecycle/d0;-><init>(Ljava/lang/Object;)V

    new-instance v1, Lx5/c0;

    move-object v3, p0

    move-object v4, p1

    move-object v2, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lx5/c0;-><init>(Ljava/util/concurrent/Executor;Lx5/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/lifecycle/d0;)V

    invoke-static {v1}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p0

    const-string p1, "getFuture(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lx5/b0;

    invoke-direct {p1, v6, p0}, Lx5/b0;-><init>(Landroidx/lifecycle/a0;Lne/x;)V

    return-object p1
.end method

.method public static final d(Ljava/util/concurrent/Executor;Lx5/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/lifecycle/d0;Ly1/c$a;)Lkotlin/Unit;
    .locals 7

    const-string v0, "completer"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lx5/d0;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lx5/d0;-><init>(Lx5/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/lifecycle/d0;Ly1/c$a;)V

    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final e(Lx5/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/lifecycle/d0;Ly1/c$a;)V
    .locals 1

    invoke-interface {p0}, Lx5/l0;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {p0, p1}, Lx5/l0;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    :try_start_1
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p1, Lx5/a0;->a:Lx5/a0$b$c;

    invoke-virtual {p3, p1}, Landroidx/lifecycle/d0;->m(Ljava/lang/Object;)V

    invoke-virtual {p4, p1}, Ly1/c$a;->c(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    :try_start_2
    new-instance p2, Lx5/a0$b$a;

    invoke-direct {p2, p1}, Lx5/a0$b$a;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p3, p2}, Landroidx/lifecycle/d0;->m(Ljava/lang/Object;)V

    invoke-virtual {p4, p1}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Lx5/l0;->d()V

    :cond_1
    return-void

    :goto_2
    if-eqz v0, :cond_2

    invoke-interface {p0}, Lx5/l0;->d()V

    :cond_2
    throw p1
.end method
