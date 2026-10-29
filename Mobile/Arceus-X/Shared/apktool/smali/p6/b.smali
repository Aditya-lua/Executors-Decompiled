.class public final Lp6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a:\u0010\n\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0080@\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lp6/a$b;",
        "result",
        "Lx6/g;",
        "request",
        "Lx6/p;",
        "options",
        "Lk6/j;",
        "eventListener",
        "Le7/u;",
        "logger",
        "a",
        "(Lp6/a$b;Lx6/g;Lx6/p;Lk6/j;Le7/u;Lnt/b;)Ljava/lang/Object;",
        "coil-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lp6/a$b;Lx6/g;Lx6/p;Lk6/j;Le7/u;Lnt/b;)Ljava/lang/Object;
    .locals 23
    .param p0    # Lp6/a$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lx6/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lx6/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lk6/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Le7/u;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp6/a$b;",
            "Lx6/g;",
            "Lx6/p;",
            "Lk6/j;",
            "Le7/u;",
            "Lnt/b<",
            "-",
            "Lp6/a$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v0, p4

    move-object/from16 v1, p5

    instance-of v2, v1, Lp6/b$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lp6/b$a;

    iget v3, v2, Lp6/b$a;->L:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lp6/b$a;->L:I

    goto :goto_0

    :cond_0
    new-instance v2, Lp6/b$a;

    invoke-direct {v2, v1}, Lp6/b$a;-><init>(Lnt/b;)V

    :goto_0
    iget-object v1, v2, Lp6/b$a;->K:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, Lp6/b$a;->L:I

    const/4 v7, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v7, :cond_1

    iget v0, v2, Lp6/b$a;->I:I

    iget v4, v2, Lp6/b$a;->H:I

    iget v8, v2, Lp6/b$a;->G:I

    iget-object v9, v2, Lp6/b$a;->F:Ljava/lang/Object;

    check-cast v9, Landroid/graphics/Bitmap;

    iget-object v9, v2, Lp6/b$a;->E:Ljava/lang/Object;

    check-cast v9, Lc7/c;

    iget-object v9, v2, Lp6/b$a;->D:Ljava/lang/Object;

    check-cast v9, Landroid/graphics/Bitmap;

    iget-object v9, v2, Lp6/b$a;->C:Ljava/lang/Object;

    check-cast v9, Landroid/graphics/Bitmap;

    iget-object v10, v2, Lp6/b$a;->B:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v11, v2, Lp6/b$a;->A:Ljava/lang/Object;

    check-cast v11, Landroid/graphics/Bitmap;

    iget-object v12, v2, Lp6/b$a;->z:Ljava/lang/Object;

    check-cast v12, Lk6/n;

    iget-object v13, v2, Lp6/b$a;->y:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    iget-object v14, v2, Lp6/b$a;->x:Ljava/lang/Object;

    check-cast v14, Le7/u;

    iget-object v15, v2, Lp6/b$a;->w:Ljava/lang/Object;

    check-cast v15, Lk6/j;

    iget-object v7, v2, Lp6/b$a;->v:Ljava/lang/Object;

    check-cast v7, Lx6/p;

    iget-object v6, v2, Lp6/b$a;->u:Ljava/lang/Object;

    check-cast v6, Lx6/g;

    iget-object v5, v2, Lp6/b$a;->t:Ljava/lang/Object;

    check-cast v5, Lp6/a$b;

    invoke-static {v1}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v16, v5

    move-object v5, v7

    move-object v7, v6

    move-object v6, v12

    move-object v12, v10

    move v10, v8

    move-object v8, v15

    move-object v15, v13

    move-object v13, v11

    move-object v11, v9

    move v9, v0

    const/4 v0, 0x1

    goto/16 :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v1}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-static/range {p1 .. p1}, Lx6/i;->h(Lx6/g;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3

    return-object p0

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lp6/a$b;->e()Lk6/n;

    move-result-object v4

    instance-of v5, v4, Lk6/a;

    if-nez v5, :cond_5

    invoke-static/range {p1 .. p1}, Lx6/i;->e(Lx6/g;)Z

    move-result v5

    if-nez v5, :cond_5

    if-eqz v0, :cond_4

    sget-object v1, Le7/u$a;->c:Le7/u$a;

    invoke-interface {v0}, Le7/u;->a()Le7/u$a;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-gtz v2, :cond_4

    invoke-virtual/range {p0 .. p0}, Lp6/a$b;->e()Lk6/n;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v2

    invoke-interface {v2}, Lhu/c;->g()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "allowConversionToBitmap=false, skipping transformations for type "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2e

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "EngineInterceptor"

    const/4 v4, 0x0

    invoke-interface {v0, v3, v1, v2, v4}, Le7/u;->b(Ljava/lang/String;Le7/u$a;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    return-object p0

    :cond_5
    move-object/from16 v5, p2

    invoke-static {v4, v5, v1, v0}, Lp6/c;->a(Lk6/n;Lx6/p;Ljava/util/List;Le7/u;)Landroid/graphics/Bitmap;

    move-result-object v6

    move-object/from16 v7, p1

    move-object/from16 v8, p3

    invoke-virtual {v8, v7, v6}, Lk6/j;->p(Lx6/g;Landroid/graphics/Bitmap;)V

    move-object v9, v1

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    move-object v12, v1

    move-object v15, v12

    move-object v14, v4

    move-object v11, v6

    move-object v13, v11

    const/4 v4, 0x0

    const/4 v10, 0x0

    move-object v1, v0

    move-object/from16 v0, p0

    :goto_1
    if-ge v4, v9, :cond_7

    invoke-interface {v12, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 p0, v1

    move-object/from16 v1, v16

    check-cast v1, Lc7/c;

    move-object/from16 p1, v11

    invoke-virtual {v5}, Lx6/p;->k()Ly6/g;

    move-result-object v11

    iput-object v0, v2, Lp6/b$a;->t:Ljava/lang/Object;

    iput-object v7, v2, Lp6/b$a;->u:Ljava/lang/Object;

    iput-object v5, v2, Lp6/b$a;->v:Ljava/lang/Object;

    iput-object v8, v2, Lp6/b$a;->w:Ljava/lang/Object;

    move-object/from16 v16, v0

    invoke-static/range {p0 .. p0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lp6/b$a;->x:Ljava/lang/Object;

    invoke-static {v15}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lp6/b$a;->y:Ljava/lang/Object;

    invoke-static {v14}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lp6/b$a;->z:Ljava/lang/Object;

    invoke-static {v13}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lp6/b$a;->A:Ljava/lang/Object;

    iput-object v12, v2, Lp6/b$a;->B:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lp6/b$a;->C:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lp6/b$a;->D:Ljava/lang/Object;

    invoke-static {v1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lp6/b$a;->E:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lp6/b$a;->F:Ljava/lang/Object;

    iput v10, v2, Lp6/b$a;->G:I

    iput v4, v2, Lp6/b$a;->H:I

    iput v9, v2, Lp6/b$a;->I:I

    const/4 v0, 0x0

    iput v0, v2, Lp6/b$a;->J:I

    const/4 v0, 0x1

    iput v0, v2, Lp6/b$a;->L:I

    invoke-virtual {v1, v6, v11, v2}, Lc7/c;->b(Landroid/graphics/Bitmap;Ly6/g;Lnt/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_6

    return-object v3

    :cond_6
    move-object/from16 v11, p1

    move-object v6, v14

    move-object/from16 v14, p0

    :goto_2
    check-cast v1, Landroid/graphics/Bitmap;

    invoke-interface {v2}, Lnt/b;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Lku/g2;->f(Lkotlin/coroutines/CoroutineContext;)V

    add-int/2addr v4, v0

    move-object v0, v6

    move-object v6, v1

    move-object v1, v14

    move-object v14, v0

    move-object/from16 v0, v16

    goto :goto_1

    :cond_7
    move-object/from16 v16, v0

    const/4 v0, 0x1

    invoke-virtual {v8, v7, v6}, Lk6/j;->o(Lx6/g;Landroid/graphics/Bitmap;)V

    const/4 v1, 0x0

    const/4 v4, 0x0

    invoke-static {v6, v1, v0, v4}, Lk6/v;->d(Landroid/graphics/Bitmap;ZILjava/lang/Object;)Lk6/a;

    move-result-object v17

    const/16 v21, 0xe

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v16 .. v22}, Lp6/a$b;->b(Lp6/a$b;Lk6/n;ZLm6/f;Ljava/lang/String;ILjava/lang/Object;)Lp6/a$b;

    move-result-object v0

    return-object v0
.end method
