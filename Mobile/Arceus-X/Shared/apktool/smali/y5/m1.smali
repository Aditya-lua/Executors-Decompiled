.class public final Ly5/m1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a#\u0010\u0016\u001a\u00020\u0015*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Ly5/s;",
        "processor",
        "Landroidx/work/impl/WorkDatabase;",
        "workDatabase",
        "Landroidx/work/a;",
        "configuration",
        "",
        "Ly5/u;",
        "schedulers",
        "Lf6/j0;",
        "newWorkSpec",
        "",
        "",
        "tags",
        "Lx5/p0$b;",
        "h",
        "(Ly5/s;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Ljava/util/List;Lf6/j0;Ljava/util/Set;)Lx5/p0$b;",
        "Ly5/f1;",
        "name",
        "Lx5/q0;",
        "workRequest",
        "Lx5/a0;",
        "e",
        "(Ly5/f1;Ljava/lang/String;Lx5/q0;)Lx5/a0;",
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
.method public static synthetic a(Ly5/f1;Ljava/lang/String;Lx5/q0;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Ly5/m1;->f(Ly5/f1;Ljava/lang/String;Lx5/q0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/work/impl/WorkDatabase;Lf6/j0;Lf6/j0;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Z)V
    .locals 0

    invoke-static/range {p0 .. p6}, Ly5/m1;->j(Landroidx/work/impl/WorkDatabase;Lf6/j0;Lf6/j0;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Z)V

    return-void
.end method

.method public static synthetic c(Lf6/j0;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Ly5/m1;->i(Lf6/j0;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lx5/q0;Ly5/f1;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Ly5/m1;->g(Lx5/q0;Ly5/f1;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ly5/f1;Ljava/lang/String;Lx5/q0;)Lx5/a0;
    .locals 4
    .param p0    # Ly5/f1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lx5/q0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workRequest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ly5/f1;->n()Landroidx/work/a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/work/a;->n()Lx5/l0;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "enqueueUniquePeriodic_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ly5/f1;->v()Lh6/b;

    move-result-object v2

    invoke-interface {v2}, Lh6/b;->c()Lh6/a;

    move-result-object v2

    const-string v3, "getSerialTaskExecutor(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ly5/i1;

    invoke-direct {v3, p0, p1, p2}, Ly5/i1;-><init>(Ly5/f1;Ljava/lang/String;Lx5/q0;)V

    invoke-static {v0, v1, v2, v3}, Lx5/e0;->c(Lx5/l0;Ljava/lang/String;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)Lx5/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ly5/f1;Ljava/lang/String;Lx5/q0;)Lkotlin/Unit;
    .locals 46

    move-object/from16 v0, p1

    new-instance v1, Ly5/j1;

    move-object/from16 v2, p0

    move-object/from16 v3, p2

    invoke-direct {v1, v3, v2, v0}, Ly5/j1;-><init>(Lx5/q0;Ly5/f1;Ljava/lang/String;)V

    invoke-virtual {v2}, Ly5/f1;->u()Landroidx/work/impl/WorkDatabase;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->c0()Lf6/k0;

    move-result-object v4

    invoke-interface {v4, v0}, Lf6/k0;->r(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x1

    if-gt v6, v7, :cond_4

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf6/j0$b;

    if-nez v5, :cond_0

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_0
    iget-object v6, v5, Lf6/j0$b;->a:Ljava/lang/String;

    invoke-interface {v4, v6}, Lf6/k0;->k(Ljava/lang/String;)Lf6/j0;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lf6/j0;->o()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, v5, Lf6/j0$b;->b:Lx5/o0$c;

    sget-object v6, Lx5/o0$c;->f:Lx5/o0$c;

    if-ne v0, v6, :cond_1

    iget-object v0, v5, Lf6/j0$b;->a:Ljava/lang/String;

    invoke-interface {v4, v0}, Lf6/k0;->a(Ljava/lang/String;)V

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_1
    invoke-virtual {v3}, Lx5/q0;->d()Lf6/j0;

    move-result-object v4

    iget-object v5, v5, Lf6/j0$b;->a:Ljava/lang/String;

    const v38, 0x1fffffe

    const/16 v39, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const-wide/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    invoke-static/range {v4 .. v39}, Lf6/j0;->e(Lf6/j0;Ljava/lang/String;Lx5/o0$c;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLx5/d;ILx5/a;JJJJZLx5/f0;IIJIILjava/lang/String;Ljava/lang/Boolean;ILjava/lang/Object;)Lf6/j0;

    move-result-object v44

    invoke-virtual {v2}, Ly5/f1;->r()Ly5/s;

    move-result-object v0

    const-string v1, "getProcessor(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ly5/f1;->u()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    const-string v4, "getWorkDatabase(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ly5/f1;->n()Landroidx/work/a;

    move-result-object v4

    const-string v5, "<get-configuration>(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ly5/f1;->s()Ljava/util/List;

    move-result-object v2

    const-string v5, "getSchedulers(...)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lx5/q0;->c()Ljava/util/Set;

    move-result-object v45

    move-object/from16 v40, v0

    move-object/from16 v41, v1

    move-object/from16 v43, v2

    move-object/from16 v42, v4

    invoke-static/range {v40 .. v45}, Ly5/m1;->h(Ly5/s;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Ljava/util/List;Lf6/j0;Ljava/util/Set;)Lx5/p0$b;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Can\'t update OneTimeWorker to Periodic Worker. Update operation must preserve worker\'s type."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WorkSpec with "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v5, Lf6/j0$b;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", that matches a name \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\", wasn\'t found"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Can\'t apply UPDATE policy to the chains of work."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final g(Lx5/q0;Ly5/f1;Ljava/lang/String;)Lkotlin/Unit;
    .locals 2

    invoke-static {p0}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    new-instance v0, Ly5/f0;

    sget-object v1, Lx5/j;->b:Lx5/j;

    invoke-direct {v0, p1, p2, v1, p0}, Ly5/f0;-><init>(Ly5/f1;Ljava/lang/String;Lx5/j;Ljava/util/List;)V

    invoke-static {v0}, Lg6/j;->b(Ly5/f0;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final h(Ly5/s;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Ljava/util/List;Lf6/j0;Ljava/util/Set;)Lx5/p0$b;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly5/s;",
            "Landroidx/work/impl/WorkDatabase;",
            "Landroidx/work/a;",
            "Ljava/util/List<",
            "+",
            "Ly5/u;",
            ">;",
            "Lf6/j0;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lx5/p0$b;"
        }
    .end annotation

    iget-object v5, p4, Lf6/j0;->a:Ljava/lang/String;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->c0()Lf6/k0;

    move-result-object v0

    invoke-interface {v0, v5}, Lf6/k0;->k(Ljava/lang/String;)Lf6/j0;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-object v0, v2, Lf6/j0;->b:Lx5/o0$c;

    invoke-virtual {v0}, Lx5/o0$c;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lx5/p0$b;->a:Lx5/p0$b;

    return-object p0

    :cond_0
    invoke-virtual {v2}, Lf6/j0;->o()Z

    move-result v0

    invoke-virtual {p4}, Lf6/j0;->o()Z

    move-result v1

    xor-int/2addr v0, v1

    if-nez v0, :cond_4

    invoke-virtual {p0, v5}, Ly5/s;->k(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_1

    move-object p0, p3

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly5/u;

    invoke-interface {v0, v5}, Ly5/u;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v0, Ly5/l1;

    move-object v1, p1

    move-object v4, p3

    move-object v3, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v7}, Ly5/l1;-><init>(Landroidx/work/impl/WorkDatabase;Lf6/j0;Lf6/j0;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Z)V

    invoke-virtual {v1, v0}, Lx4/u;->R(Ljava/lang/Runnable;)V

    if-nez v7, :cond_2

    invoke-static {p2, v1, v4}, Ly5/x;->f(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    :cond_2
    if-eqz v7, :cond_3

    sget-object p0, Lx5/p0$b;->c:Lx5/p0$b;

    return-object p0

    :cond_3
    sget-object p0, Lx5/p0$b;->b:Lx5/p0$b;

    return-object p0

    :cond_4
    move-object v3, p4

    new-instance p0, Ly5/k1;

    invoke-direct {p0}, Ly5/k1;-><init>()V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Can\'t update "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " Worker to "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " Worker. Update operation must preserve worker\'s type."

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Worker with "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " doesn\'t exist"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final i(Lf6/j0;)Ljava/lang/String;
    .locals 1

    const-string v0, "spec"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf6/j0;->o()Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "Periodic"

    return-object p0

    :cond_0
    const-string p0, "OneTime"

    return-object p0
.end method

.method public static final j(Landroidx/work/impl/WorkDatabase;Lf6/j0;Lf6/j0;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Z)V
    .locals 40

    move-object/from16 v0, p1

    move-object/from16 v1, p4

    invoke-virtual/range {p0 .. p0}, Landroidx/work/impl/WorkDatabase;->c0()Lf6/k0;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Landroidx/work/impl/WorkDatabase;->d0()Lf6/q1;

    move-result-object v3

    iget-object v6, v0, Lf6/j0;->b:Lx5/o0$c;

    iget v4, v0, Lf6/j0;->k:I

    iget-wide v7, v0, Lf6/j0;->n:J

    invoke-virtual {v0}, Lf6/j0;->g()I

    move-result v5

    const/4 v9, 0x1

    add-int/lit8 v31, v5, 0x1

    invoke-virtual {v0}, Lf6/j0;->j()I

    move-result v30

    invoke-virtual {v0}, Lf6/j0;->h()J

    move-result-wide v32

    invoke-virtual {v0}, Lf6/j0;->i()I

    move-result v34

    const v38, 0x1c3dbfd

    const/16 v39, 0x0

    const/4 v5, 0x0

    move-wide/from16 v22, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v0, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const-wide/16 v24, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    move/from16 v18, v4

    move-object/from16 v4, p2

    invoke-static/range {v4 .. v39}, Lf6/j0;->e(Lf6/j0;Ljava/lang/String;Lx5/o0$c;Ljava/lang/String;Ljava/lang/String;Landroidx/work/b;Landroidx/work/b;JJJLx5/d;ILx5/a;JJJJZLx5/f0;IIJIILjava/lang/String;Ljava/lang/Boolean;ILjava/lang/Object;)Lf6/j0;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, Lf6/j0;->i()I

    move-result v4

    if-ne v4, v0, :cond_0

    invoke-virtual/range {p2 .. p2}, Lf6/j0;->h()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lf6/j0;->q(J)V

    invoke-virtual {v5}, Lf6/j0;->i()I

    move-result v4

    add-int/2addr v4, v0

    invoke-virtual {v5, v4}, Lf6/j0;->r(I)V

    :cond_0
    move-object/from16 v0, p3

    invoke-static {v0, v5}, Lg6/k;->c(Ljava/util/List;Lf6/j0;)Lf6/j0;

    move-result-object v0

    invoke-interface {v2, v0}, Lf6/k0;->g(Lf6/j0;)V

    invoke-interface {v3, v1}, Lf6/q1;->b(Ljava/lang/String;)V

    move-object/from16 v0, p5

    invoke-interface {v3, v1, v0}, Lf6/q1;->d(Ljava/lang/String;Ljava/util/Set;)V

    if-nez p6, :cond_1

    const-wide/16 v3, -0x1

    invoke-interface {v2, v1, v3, v4}, Lf6/k0;->q(Ljava/lang/String;J)I

    invoke-virtual/range {p0 .. p0}, Landroidx/work/impl/WorkDatabase;->b0()Lf6/d0;

    move-result-object v0

    invoke-interface {v0, v1}, Lf6/d0;->a(Ljava/lang/String;)V

    :cond_1
    return-void
.end method
