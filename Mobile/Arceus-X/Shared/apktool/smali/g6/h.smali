.class public final Lg6/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u001d\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a\u001d\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0014\u001a\u001d\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Ly5/f1;",
        "workManagerImpl",
        "",
        "workSpecId",
        "",
        "g",
        "(Ly5/f1;Ljava/lang/String;)V",
        "s",
        "(Ly5/f1;)V",
        "Landroidx/work/impl/WorkDatabase;",
        "workDatabase",
        "r",
        "(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V",
        "Ljava/util/UUID;",
        "id",
        "Lx5/a0;",
        "h",
        "(Ljava/util/UUID;Ly5/f1;)Lx5/a0;",
        "tag",
        "o",
        "(Ljava/lang/String;Ly5/f1;)Lx5/a0;",
        "name",
        "k",
        "m",
        "(Ljava/lang/String;Ly5/f1;)V",
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
.method public static synthetic a(Ljava/lang/String;Ly5/f1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lg6/h;->l(Ljava/lang/String;Ly5/f1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;Ly5/f1;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lg6/h;->n(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;Ly5/f1;)V

    return-void
.end method

.method public static synthetic c(Ly5/f1;Ljava/util/UUID;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lg6/h;->i(Ly5/f1;Ljava/util/UUID;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ly5/f1;Ljava/util/UUID;)V
    .locals 0

    invoke-static {p0, p1}, Lg6/h;->j(Ly5/f1;Ljava/util/UUID;)V

    return-void
.end method

.method public static synthetic e(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;Ly5/f1;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lg6/h;->q(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;Ly5/f1;)V

    return-void
.end method

.method public static synthetic f(Ly5/f1;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lg6/h;->p(Ly5/f1;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Ly5/f1;Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Ly5/f1;->u()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    const-string v1, "getWorkDatabase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lg6/h;->r(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V

    invoke-virtual {p0}, Ly5/f1;->r()Ly5/s;

    move-result-object v0

    const-string v1, "getProcessor(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Ly5/s;->p(Ljava/lang/String;I)Z

    invoke-virtual {p0}, Ly5/f1;->s()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly5/u;

    invoke-interface {v0, p1}, Ly5/u;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final h(Ljava/util/UUID;Ly5/f1;)Lx5/a0;
    .locals 3
    .param p0    # Ljava/util/UUID;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ly5/f1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "id"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workManagerImpl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ly5/f1;->n()Landroidx/work/a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/work/a;->n()Lx5/l0;

    move-result-object v0

    invoke-virtual {p1}, Ly5/f1;->v()Lh6/b;

    move-result-object v1

    invoke-interface {v1}, Lh6/b;->c()Lh6/a;

    move-result-object v1

    const-string v2, "getSerialTaskExecutor(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lg6/b;

    invoke-direct {v2, p1, p0}, Lg6/b;-><init>(Ly5/f1;Ljava/util/UUID;)V

    const-string p0, "CancelWorkById"

    invoke-static {v0, p0, v1, v2}, Lx5/e0;->c(Lx5/l0;Ljava/lang/String;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)Lx5/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Ly5/f1;Ljava/util/UUID;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Ly5/f1;->u()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    const-string v1, "getWorkDatabase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lg6/e;

    invoke-direct {v1, p0, p1}, Lg6/e;-><init>(Ly5/f1;Ljava/util/UUID;)V

    invoke-virtual {v0, v1}, Lx4/u;->R(Ljava/lang/Runnable;)V

    invoke-static {p0}, Lg6/h;->s(Ly5/f1;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final j(Ly5/f1;Ljava/util/UUID;)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lg6/h;->g(Ly5/f1;Ljava/lang/String;)V

    return-void
.end method

.method public static final k(Ljava/lang/String;Ly5/f1;)Lx5/a0;
    .locals 4
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ly5/f1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workManagerImpl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ly5/f1;->n()Landroidx/work/a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/work/a;->n()Lx5/l0;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CancelWorkByName_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ly5/f1;->v()Lh6/b;

    move-result-object v2

    invoke-interface {v2}, Lh6/b;->c()Lh6/a;

    move-result-object v2

    const-string v3, "getSerialTaskExecutor(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lg6/g;

    invoke-direct {v3, p0, p1}, Lg6/g;-><init>(Ljava/lang/String;Ly5/f1;)V

    invoke-static {v0, v1, v2, v3}, Lx5/e0;->c(Lx5/l0;Ljava/lang/String;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)Lx5/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Ljava/lang/String;Ly5/f1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lg6/h;->m(Ljava/lang/String;Ly5/f1;)V

    invoke-static {p1}, Lg6/h;->s(Ly5/f1;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final m(Ljava/lang/String;Ly5/f1;)V
    .locals 2
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ly5/f1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workManagerImpl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ly5/f1;->u()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    const-string v1, "getWorkDatabase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lg6/c;

    invoke-direct {v1, v0, p0, p1}, Lg6/c;-><init>(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;Ly5/f1;)V

    invoke-virtual {v0, v1}, Lx4/u;->R(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static final n(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;Ly5/f1;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->c0()Lf6/k0;

    move-result-object p0

    invoke-interface {p0, p1}, Lf6/k0;->i(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p2, p1}, Lg6/h;->g(Ly5/f1;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final o(Ljava/lang/String;Ly5/f1;)Lx5/a0;
    .locals 4
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ly5/f1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "tag"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workManagerImpl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ly5/f1;->n()Landroidx/work/a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/work/a;->n()Lx5/l0;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CancelWorkByTag_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ly5/f1;->v()Lh6/b;

    move-result-object v2

    invoke-interface {v2}, Lh6/b;->c()Lh6/a;

    move-result-object v2

    const-string v3, "getSerialTaskExecutor(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lg6/d;

    invoke-direct {v3, p1, p0}, Lg6/d;-><init>(Ly5/f1;Ljava/lang/String;)V

    invoke-static {v0, v1, v2, v3}, Lx5/e0;->c(Lx5/l0;Ljava/lang/String;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)Lx5/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Ly5/f1;Ljava/lang/String;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Ly5/f1;->u()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    const-string v1, "getWorkDatabase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lg6/f;

    invoke-direct {v1, v0, p1, p0}, Lg6/f;-><init>(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;Ly5/f1;)V

    invoke-virtual {v0, v1}, Lx4/u;->R(Ljava/lang/Runnable;)V

    invoke-static {p0}, Lg6/h;->s(Ly5/f1;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final q(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;Ly5/f1;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->c0()Lf6/k0;

    move-result-object p0

    invoke-interface {p0, p1}, Lf6/k0;->m(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p2, p1}, Lg6/h;->g(Ly5/f1;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final r(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V
    .locals 4

    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->c0()Lf6/k0;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->X()Lf6/b;

    move-result-object p0

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/p;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_0
    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {p1}, Lkotlin/collections/u;->H(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0, v1}, Lf6/k0;->j(Ljava/lang/String;)Lx5/o0$c;

    move-result-object v2

    sget-object v3, Lx5/o0$c;->c:Lx5/o0$c;

    if-eq v2, v3, :cond_0

    sget-object v3, Lx5/o0$c;->d:Lx5/o0$c;

    if-eq v2, v3, :cond_0

    invoke-interface {v0, v1}, Lf6/k0;->l(Ljava/lang/String;)I

    :cond_0
    invoke-interface {p0, v1}, Lf6/b;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {p1, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static final s(Ly5/f1;)V
    .locals 2

    invoke-virtual {p0}, Ly5/f1;->n()Landroidx/work/a;

    move-result-object v0

    invoke-virtual {p0}, Ly5/f1;->u()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    invoke-virtual {p0}, Ly5/f1;->s()Ljava/util/List;

    move-result-object p0

    invoke-static {v0, v1, p0}, Ly5/x;->f(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    return-void
.end method
