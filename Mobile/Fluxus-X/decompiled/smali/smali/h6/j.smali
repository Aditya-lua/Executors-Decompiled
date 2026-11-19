.class public Lh6/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "EnqueueRunnable"

    invoke-static {v0}, Ly5/w;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lh6/j;->a:Ljava/lang/String;

    return-void
.end method

.method public static a(Lz5/f0;)Z
    .locals 2

    invoke-virtual {p0}, Lz5/f0;->h()Lz5/f1;

    move-result-object v0

    invoke-virtual {v0}, Lz5/f1;->u()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    invoke-virtual {v1}, Ly4/u;->i()V

    :try_start_0
    invoke-virtual {v0}, Lz5/f1;->n()Landroidx/work/a;

    move-result-object v0

    invoke-static {v1, v0, p0}, Lh6/k;->a(Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Lz5/f0;)V

    invoke-static {p0}, Lh6/j;->e(Lz5/f0;)Z

    move-result p0

    invoke-virtual {v1}, Ly4/u;->V()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Ly4/u;->p()V

    return p0

    :catchall_0
    move-exception p0

    invoke-virtual {v1}, Ly4/u;->p()V

    throw p0
.end method

.method public static b(Lz5/f0;)V
    .locals 3

    invoke-virtual {p0}, Lz5/f0;->i()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lh6/j;->a(Lz5/f0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lh6/j;->f(Lz5/f0;)V

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "WorkContinuation has cycles ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static c(Lz5/f0;)Z
    .locals 5

    invoke-static {p0}, Lz5/f0;->m(Lz5/f0;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, Lz5/f0;->h()Lz5/f1;

    move-result-object v1

    invoke-virtual {p0}, Lz5/f0;->g()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/String;

    invoke-interface {v0, v3}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {p0}, Lz5/f0;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lz5/f0;->c()Ly5/j;

    move-result-object v4

    invoke-static {v1, v2, v0, v3, v4}, Lh6/j;->d(Lz5/f1;Ljava/util/List;[Ljava/lang/String;Ljava/lang/String;Ly5/j;)Z

    move-result v0

    invoke-virtual {p0}, Lz5/f0;->l()V

    return v0
.end method

.method public static d(Lz5/f1;Ljava/util/List;[Ljava/lang/String;Ljava/lang/String;Ly5/j;)Z
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz5/f1;",
            "Ljava/util/List<",
            "+",
            "Ly5/q0;",
            ">;[",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ly5/j;",
            ")Z"
        }
    .end annotation

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    invoke-virtual/range {p0 .. p0}, Lz5/f1;->n()Landroidx/work/a;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/work/a;->a()Ly5/b;

    move-result-object v3

    invoke-interface {v3}, Ly5/b;->a()J

    move-result-wide v3

    invoke-virtual/range {p0 .. p0}, Lz5/f1;->u()Landroidx/work/impl/WorkDatabase;

    move-result-object v5

    const/4 v7, 0x0

    if-eqz v0, :cond_0

    array-length v8, v0

    if-lez v8, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    move v8, v7

    :goto_0
    if-eqz v8, :cond_5

    array-length v9, v0

    move v10, v7

    move v12, v10

    move v13, v12

    const/4 v11, 0x1

    :goto_1
    if-ge v10, v9, :cond_6

    aget-object v14, v0, v10

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->c0()Lg6/k0;

    move-result-object v15

    invoke-interface {v15, v14}, Lg6/k0;->h(Ljava/lang/String;)Lg6/j0;

    move-result-object v15

    if-nez v15, :cond_1

    invoke-static {}, Ly5/w;->e()Ly5/w;

    move-result-object v0

    sget-object v1, Lh6/j;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Prerequisite "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " doesn\'t exist; not enqueuing"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ly5/w;->c(Ljava/lang/String;Ljava/lang/String;)V

    return v7

    :cond_1
    iget-object v14, v15, Lg6/j0;->b:Ly5/o0$c;

    sget-object v15, Ly5/o0$c;->c:Ly5/o0$c;

    if-ne v14, v15, :cond_2

    const/4 v15, 0x1

    goto :goto_2

    :cond_2
    move v15, v7

    :goto_2
    and-int/2addr v11, v15

    sget-object v15, Ly5/o0$c;->d:Ly5/o0$c;

    if-ne v14, v15, :cond_3

    const/4 v13, 0x1

    goto :goto_3

    :cond_3
    sget-object v15, Ly5/o0$c;->f:Ly5/o0$c;

    if-ne v14, v15, :cond_4

    const/4 v12, 0x1

    :cond_4
    :goto_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_5
    move v12, v7

    move v13, v12

    const/4 v11, 0x1

    :cond_6
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_16

    if-nez v8, :cond_16

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->c0()Lg6/k0;

    move-result-object v10

    invoke-interface {v10, v1}, Lg6/k0;->r(Ljava/lang/String;)Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v14

    if-nez v14, :cond_16

    sget-object v14, Ly5/j;->c:Ly5/j;

    if-eq v2, v14, :cond_7

    sget-object v14, Ly5/j;->d:Ly5/j;

    if-ne v2, v14, :cond_8

    :cond_7
    move-object/from16 v14, p0

    goto :goto_5

    :cond_8
    sget-object v14, Ly5/j;->b:Ly5/j;

    if-ne v2, v14, :cond_b

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lg6/j0$b;

    iget-object v14, v14, Lg6/j0$b;->b:Ly5/o0$c;

    sget-object v15, Ly5/o0$c;->a:Ly5/o0$c;

    if-eq v14, v15, :cond_a

    sget-object v15, Ly5/o0$c;->b:Ly5/o0$c;

    if-ne v14, v15, :cond_9

    :cond_a
    return v7

    :cond_b
    move-object/from16 v14, p0

    invoke-static {v1, v14}, Lh6/h;->m(Ljava/lang/String;Lz5/f1;)V

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->c0()Lg6/k0;

    move-result-object v2

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_c

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lg6/j0$b;

    iget-object v15, v15, Lg6/j0$b;->a:Ljava/lang/String;

    invoke-interface {v2, v15}, Lg6/k0;->a(Ljava/lang/String;)V

    goto :goto_4

    :cond_c
    move-object/from16 v17, v5

    const/4 v6, 0x1

    goto/16 :goto_c

    :goto_5
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->X()Lg6/b;

    move-result-object v8

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_11

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v6, v16

    check-cast v6, Lg6/j0$b;

    iget-object v7, v6, Lg6/j0$b;->a:Ljava/lang/String;

    invoke-interface {v8, v7}, Lg6/b;->d(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_10

    iget-object v7, v6, Lg6/j0$b;->b:Ly5/o0$c;

    move-object/from16 v17, v5

    sget-object v5, Ly5/o0$c;->c:Ly5/o0$c;

    if-ne v7, v5, :cond_d

    const/4 v5, 0x1

    goto :goto_7

    :cond_d
    const/4 v5, 0x0

    :goto_7
    and-int/2addr v5, v11

    sget-object v11, Ly5/o0$c;->d:Ly5/o0$c;

    if-ne v7, v11, :cond_e

    const/4 v13, 0x1

    goto :goto_8

    :cond_e
    sget-object v11, Ly5/o0$c;->f:Ly5/o0$c;

    if-ne v7, v11, :cond_f

    const/4 v12, 0x1

    :cond_f
    :goto_8
    iget-object v6, v6, Lg6/j0$b;->a:Ljava/lang/String;

    invoke-interface {v15, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v11, v5

    goto :goto_9

    :cond_10
    move-object/from16 v17, v5

    :goto_9
    move-object/from16 v5, v17

    const/4 v7, 0x0

    goto :goto_6

    :cond_11
    move-object/from16 v17, v5

    sget-object v5, Ly5/j;->d:Ly5/j;

    if-ne v2, v5, :cond_14

    if-nez v12, :cond_12

    if-eqz v13, :cond_14

    :cond_12
    invoke-virtual/range {v17 .. v17}, Landroidx/work/impl/WorkDatabase;->c0()Lg6/k0;

    move-result-object v2

    invoke-interface {v2, v1}, Lg6/k0;->r(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg6/j0$b;

    iget-object v6, v6, Lg6/j0$b;->a:Ljava/lang/String;

    invoke-interface {v2, v6}, Lg6/k0;->a(Ljava/lang/String;)V

    goto :goto_a

    :cond_13
    sget-object v15, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/4 v12, 0x0

    const/4 v13, 0x0

    :cond_14
    invoke-interface {v15, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    array-length v2, v0

    if-lez v2, :cond_15

    const/4 v8, 0x1

    goto :goto_b

    :cond_15
    const/4 v8, 0x0

    :goto_b
    const/4 v6, 0x0

    goto :goto_c

    :cond_16
    move-object/from16 v14, p0

    move-object/from16 v17, v5

    goto :goto_b

    :goto_c
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly5/q0;

    invoke-virtual {v5}, Ly5/q0;->d()Lg6/j0;

    move-result-object v7

    if-eqz v8, :cond_19

    if-nez v11, :cond_19

    if-eqz v13, :cond_17

    sget-object v10, Ly5/o0$c;->d:Ly5/o0$c;

    iput-object v10, v7, Lg6/j0;->b:Ly5/o0$c;

    goto :goto_e

    :cond_17
    if-eqz v12, :cond_18

    sget-object v10, Ly5/o0$c;->f:Ly5/o0$c;

    iput-object v10, v7, Lg6/j0;->b:Ly5/o0$c;

    goto :goto_e

    :cond_18
    sget-object v10, Ly5/o0$c;->e:Ly5/o0$c;

    iput-object v10, v7, Lg6/j0;->b:Ly5/o0$c;

    goto :goto_e

    :cond_19
    iput-wide v3, v7, Lg6/j0;->n:J

    :goto_e
    iget-object v10, v7, Lg6/j0;->b:Ly5/o0$c;

    sget-object v15, Ly5/o0$c;->a:Ly5/o0$c;

    if-ne v10, v15, :cond_1a

    const/4 v6, 0x1

    :cond_1a
    invoke-virtual/range {v17 .. v17}, Landroidx/work/impl/WorkDatabase;->c0()Lg6/k0;

    move-result-object v10

    invoke-virtual {v14}, Lz5/f1;->s()Ljava/util/List;

    move-result-object v15

    invoke-static {v15, v7}, Lh6/k;->c(Ljava/util/List;Lg6/j0;)Lg6/j0;

    move-result-object v7

    invoke-interface {v10, v7}, Lg6/k0;->o(Lg6/j0;)V

    if-eqz v8, :cond_1b

    array-length v7, v0

    const/4 v10, 0x0

    :goto_f
    if-ge v10, v7, :cond_1b

    aget-object v15, v0, v10

    move-object/from16 p2, v0

    new-instance v0, Lg6/a;

    move-object/from16 p1, v2

    invoke-virtual {v5}, Ly5/q0;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v15}, Lg6/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {v17 .. v17}, Landroidx/work/impl/WorkDatabase;->X()Lg6/b;

    move-result-object v2

    invoke-interface {v2, v0}, Lg6/b;->c(Lg6/a;)V

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    goto :goto_f

    :cond_1b
    move-object/from16 p2, v0

    move-object/from16 p1, v2

    invoke-virtual/range {v17 .. v17}, Landroidx/work/impl/WorkDatabase;->d0()Lg6/q1;

    move-result-object v0

    invoke-virtual {v5}, Ly5/q0;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5}, Ly5/q0;->c()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v0, v2, v7}, Lg6/q1;->d(Ljava/lang/String;Ljava/util/Set;)V

    if-nez v9, :cond_1c

    invoke-virtual/range {v17 .. v17}, Landroidx/work/impl/WorkDatabase;->a0()Lg6/y;

    move-result-object v0

    new-instance v2, Lg6/x;

    invoke-virtual {v5}, Ly5/q0;->b()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v1, v5}, Lg6/x;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Lg6/y;->a(Lg6/x;)V

    :cond_1c
    move-object/from16 v2, p1

    move-object/from16 v0, p2

    goto/16 :goto_d

    :cond_1d
    return v6
.end method

.method public static e(Lz5/f0;)Z
    .locals 7

    invoke-virtual {p0}, Lz5/f0;->f()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz5/f0;

    invoke-virtual {v2}, Lz5/f0;->k()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v2}, Lh6/j;->e(Lz5/f0;)Z

    move-result v2

    or-int/2addr v1, v2

    goto :goto_0

    :cond_0
    invoke-static {}, Ly5/w;->e()Ly5/w;

    move-result-object v3

    sget-object v4, Lh6/j;->a:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Already enqueued work ids ("

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ", "

    invoke-virtual {v2}, Lz5/f0;->d()Ljava/util/List;

    move-result-object v2

    invoke-static {v6, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, Ly5/w;->k(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lh6/j;->c(Lz5/f0;)Z

    move-result p0

    or-int/2addr p0, v1

    return p0
.end method

.method public static f(Lz5/f0;)V
    .locals 2

    invoke-virtual {p0}, Lz5/f0;->h()Lz5/f1;

    move-result-object p0

    invoke-virtual {p0}, Lz5/f1;->n()Landroidx/work/a;

    move-result-object v0

    invoke-virtual {p0}, Lz5/f1;->u()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    invoke-virtual {p0}, Lz5/f1;->s()Ljava/util/List;

    move-result-object p0

    invoke-static {v0, v1, p0}, Lz5/x;->f(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    return-void
.end method
