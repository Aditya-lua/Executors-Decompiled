.class public final Lyu/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a#\u0010\u000c\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a#\u0010\u0010\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a#\u0010\u0014\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\r\u001a)\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0016*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001aH\u0010\u001e\u001a\u00020\u000b*\u0008\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u001b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0080@\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u001a\u001d\u0010 \u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lxu/l;",
        "Lxu/h0;",
        "path",
        "Lxu/k;",
        "g",
        "(Lxu/l;Lxu/h0;)Lxu/k;",
        "",
        "e",
        "(Lxu/l;Lxu/h0;)Z",
        "dir",
        "mustCreate",
        "",
        "c",
        "(Lxu/l;Lxu/h0;Z)V",
        "source",
        "target",
        "b",
        "(Lxu/l;Lxu/h0;Lxu/h0;)V",
        "fileOrDirectory",
        "mustExist",
        "d",
        "followSymlinks",
        "Lkotlin/sequences/Sequence;",
        "f",
        "(Lxu/l;Lxu/h0;Z)Lkotlin/sequences/Sequence;",
        "Liu/h;",
        "fileSystem",
        "Lkotlin/collections/i;",
        "stack",
        "postorder",
        "a",
        "(Liu/h;Lxu/l;Lkotlin/collections/i;Lxu/h0;ZZLnt/b;)Ljava/lang/Object;",
        "h",
        "(Lxu/l;Lxu/h0;)Lxu/h0;",
        "okio"
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
.method public static final a(Liu/h;Lxu/l;Lkotlin/collections/i;Lxu/h0;ZZLnt/b;)Ljava/lang/Object;
    .locals 17
    .param p0    # Liu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lxu/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/collections/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liu/h<",
            "-",
            "Lxu/h0;",
            ">;",
            "Lxu/l;",
            "Lkotlin/collections/i<",
            "Lxu/h0;",
            ">;",
            "Lxu/h0;",
            "ZZ",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move/from16 v2, p5

    move-object/from16 v3, p6

    instance-of v4, v3, Lyu/d$a;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lyu/d$a;

    iget v5, v4, Lyu/d$a;->F:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lyu/d$a;->F:I

    goto :goto_0

    :cond_0
    new-instance v4, Lyu/d$a;

    invoke-direct {v4, v3}, Lyu/d$a;-><init>(Lnt/b;)V

    :goto_0
    iget-object v3, v4, Lyu/d$a;->E:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v5

    iget v6, v4, Lyu/d$a;->F:I

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz v6, :cond_4

    if-eq v6, v9, :cond_3

    if-eq v6, v8, :cond_2

    if-ne v6, v7, :cond_1

    iget-object v0, v4, Lyu/d$a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, v4, Lyu/d$a;->w:Ljava/lang/Object;

    check-cast v0, Lxu/h0;

    iget-object v0, v4, Lyu/d$a;->v:Ljava/lang/Object;

    check-cast v0, Lkotlin/collections/i;

    iget-object v0, v4, Lyu/d$a;->u:Ljava/lang/Object;

    check-cast v0, Lxu/l;

    iget-object v0, v4, Lyu/d$a;->t:Ljava/lang/Object;

    check-cast v0, Liu/h;

    invoke-static {v3}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v0, v4, Lyu/d$a;->D:I

    iget-boolean v1, v4, Lyu/d$a;->C:Z

    iget-boolean v2, v4, Lyu/d$a;->B:Z

    iget-object v6, v4, Lyu/d$a;->A:Ljava/lang/Object;

    check-cast v6, Lxu/h0;

    iget-object v6, v4, Lyu/d$a;->z:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v9, v4, Lyu/d$a;->y:Ljava/lang/Object;

    check-cast v9, Lxu/h0;

    iget-object v10, v4, Lyu/d$a;->x:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v11, v4, Lyu/d$a;->w:Ljava/lang/Object;

    check-cast v11, Lxu/h0;

    iget-object v12, v4, Lyu/d$a;->v:Ljava/lang/Object;

    check-cast v12, Lkotlin/collections/i;

    iget-object v13, v4, Lyu/d$a;->u:Ljava/lang/Object;

    check-cast v13, Lxu/l;

    iget-object v14, v4, Lyu/d$a;->t:Ljava/lang/Object;

    check-cast v14, Liu/h;

    :try_start_0
    invoke-static {v3}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v3, v11

    move v11, v0

    move v0, v2

    move v2, v1

    move-object v1, v12

    move-object v12, v9

    move-object v9, v13

    move-object v13, v3

    move-object v3, v10

    :goto_1
    move-object v10, v14

    goto/16 :goto_5

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_3
    iget-boolean v0, v4, Lyu/d$a;->C:Z

    iget-boolean v1, v4, Lyu/d$a;->B:Z

    iget-object v2, v4, Lyu/d$a;->w:Ljava/lang/Object;

    check-cast v2, Lxu/h0;

    iget-object v6, v4, Lyu/d$a;->v:Ljava/lang/Object;

    check-cast v6, Lkotlin/collections/i;

    iget-object v9, v4, Lyu/d$a;->u:Ljava/lang/Object;

    check-cast v9, Lxu/l;

    iget-object v10, v4, Lyu/d$a;->t:Ljava/lang/Object;

    check-cast v10, Liu/h;

    invoke-static {v3}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v16, v2

    move v2, v0

    move v0, v1

    move-object/from16 v1, v16

    goto :goto_2

    :cond_4
    invoke-static {v3}, Ljt/o;->b(Ljava/lang/Object;)V

    if-nez v2, :cond_5

    iput-object v0, v4, Lyu/d$a;->t:Ljava/lang/Object;

    move-object/from16 v3, p1

    iput-object v3, v4, Lyu/d$a;->u:Ljava/lang/Object;

    move-object/from16 v6, p2

    iput-object v6, v4, Lyu/d$a;->v:Ljava/lang/Object;

    iput-object v1, v4, Lyu/d$a;->w:Ljava/lang/Object;

    move/from16 v10, p4

    iput-boolean v10, v4, Lyu/d$a;->B:Z

    iput-boolean v2, v4, Lyu/d$a;->C:Z

    iput v9, v4, Lyu/d$a;->F:I

    invoke-virtual {v0, v1, v4}, Liu/h;->a(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v5, :cond_6

    goto/16 :goto_9

    :cond_5
    move-object/from16 v3, p1

    move-object/from16 v6, p2

    move/from16 v10, p4

    :cond_6
    move v9, v10

    move-object v10, v0

    move v0, v9

    move-object v9, v3

    :goto_2
    invoke-virtual {v9, v1}, Lxu/l;->listOrNull(Lxu/h0;)Ljava/util/List;

    move-result-object v3

    if-nez v3, :cond_7

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v3

    :cond_7
    move-object v11, v3

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_e

    const/4 v11, 0x0

    move-object v12, v1

    :goto_3
    if-eqz v0, :cond_9

    invoke-virtual {v6, v12}, Lkotlin/collections/i;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_8

    goto :goto_4

    :cond_8
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "symlink cycle at "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    :goto_4
    invoke-static {v9, v12}, Lyu/d;->h(Lxu/l;Lxu/h0;)Lxu/h0;

    move-result-object v13

    if-nez v13, :cond_d

    if-nez v0, :cond_a

    if-nez v11, :cond_e

    :cond_a
    invoke-virtual {v6, v12}, Lkotlin/collections/i;->addLast(Ljava/lang/Object;)V

    :try_start_1
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    move-object/from16 v16, v13

    move-object v13, v1

    move-object v1, v6

    move-object/from16 v6, v16

    :goto_5
    :try_start_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lxu/h0;

    iput-object v10, v4, Lyu/d$a;->t:Ljava/lang/Object;

    iput-object v9, v4, Lyu/d$a;->u:Ljava/lang/Object;

    iput-object v1, v4, Lyu/d$a;->v:Ljava/lang/Object;

    iput-object v13, v4, Lyu/d$a;->w:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v4, Lyu/d$a;->x:Ljava/lang/Object;

    invoke-static {v12}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v4, Lyu/d$a;->y:Ljava/lang/Object;

    iput-object v6, v4, Lyu/d$a;->z:Ljava/lang/Object;

    invoke-static {v14}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v4, Lyu/d$a;->A:Ljava/lang/Object;

    iput-boolean v0, v4, Lyu/d$a;->B:Z

    iput-boolean v2, v4, Lyu/d$a;->C:Z

    iput v11, v4, Lyu/d$a;->D:I

    iput v8, v4, Lyu/d$a;->F:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move/from16 p4, v0

    move-object/from16 p2, v1

    move/from16 p5, v2

    move-object/from16 p6, v4

    move-object/from16 p1, v9

    move-object/from16 p0, v10

    move-object/from16 p3, v14

    :try_start_3
    invoke-static/range {p0 .. p6}, Lyu/d;->a(Liu/h;Lxu/l;Lkotlin/collections/i;Lxu/h0;ZZLnt/b;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-object/from16 v14, p0

    move-object/from16 v10, p1

    move-object/from16 v9, p2

    move/from16 v2, p4

    move/from16 v1, p5

    move-object/from16 v4, p6

    if-ne v0, v5, :cond_b

    goto/16 :goto_9

    :cond_b
    move v0, v2

    move v2, v1

    move-object v1, v9

    move-object v9, v10

    goto/16 :goto_1

    :catchall_1
    move-exception v0

    move-object/from16 v9, p2

    :goto_6
    move-object v12, v9

    goto :goto_7

    :catchall_2
    move-exception v0

    move-object v9, v1

    goto :goto_6

    :cond_c
    move-object v14, v10

    move-object v10, v9

    move-object v9, v1

    move v1, v2

    move v2, v0

    invoke-virtual {v9}, Lkotlin/collections/i;->removeLast()Ljava/lang/Object;

    move-object v6, v9

    move-object v9, v10

    move-object v10, v14

    move v2, v1

    move-object v1, v13

    goto :goto_8

    :catchall_3
    move-exception v0

    move-object v12, v6

    :goto_7
    invoke-virtual {v12}, Lkotlin/collections/i;->removeLast()Ljava/lang/Object;

    throw v0

    :cond_d
    add-int/lit8 v11, v11, 0x1

    move-object v12, v13

    goto/16 :goto_3

    :cond_e
    :goto_8
    if-eqz v2, :cond_10

    invoke-static {v10}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v4, Lyu/d$a;->t:Ljava/lang/Object;

    invoke-static {v9}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v4, Lyu/d$a;->u:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lyu/d$a;->v:Ljava/lang/Object;

    invoke-static {v1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lyu/d$a;->w:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v4, Lyu/d$a;->x:Ljava/lang/Object;

    const/4 v3, 0x0

    iput-object v3, v4, Lyu/d$a;->y:Ljava/lang/Object;

    iput-object v3, v4, Lyu/d$a;->z:Ljava/lang/Object;

    iput-object v3, v4, Lyu/d$a;->A:Ljava/lang/Object;

    iput-boolean v0, v4, Lyu/d$a;->B:Z

    iput-boolean v2, v4, Lyu/d$a;->C:Z

    iput v7, v4, Lyu/d$a;->F:I

    invoke-virtual {v10, v1, v4}, Liu/h;->a(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_f

    :goto_9
    return-object v5

    :cond_f
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static final b(Lxu/l;Lxu/h0;Lxu/h0;)V
    .locals 3
    .param p0    # Lxu/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "target"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lxu/l;->source(Lxu/h0;)Lxu/r0;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    :try_start_0
    invoke-static {p0, p2, v0, v1, v2}, Lxu/l;->sink$default(Lxu/l;Lxu/h0;ZILjava/lang/Object;)Lxu/p0;

    move-result-object p0

    invoke-static {p0}, Lxu/b0;->b(Lxu/p0;)Lxu/f;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    invoke-interface {p0, p1}, Lxu/f;->g2(Lxu/r0;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz p0, :cond_0

    :try_start_2
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_0
    :goto_0
    move-object p0, v2

    goto :goto_2

    :catchall_1
    move-exception p2

    if-eqz p0, :cond_1

    :try_start_3
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p0

    :try_start_4
    invoke-static {p2, p0}, Ljt/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :catchall_3
    move-exception p0

    goto :goto_3

    :cond_1
    :goto_1
    move-object p0, p2

    move-object p2, v2

    :goto_2
    if-nez p0, :cond_2

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    if-eqz p1, :cond_4

    :try_start_5
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_5

    :catchall_4
    move-exception v2

    goto :goto_5

    :cond_2
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :goto_3
    if-eqz p1, :cond_3

    :try_start_7
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    goto :goto_4

    :catchall_5
    move-exception p1

    invoke-static {p0, p1}, Ljt/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_3
    :goto_4
    move-object v2, p0

    :cond_4
    :goto_5
    if-nez v2, :cond_5

    return-void

    :cond_5
    throw v2
.end method

.method public static final c(Lxu/l;Lxu/h0;Z)V
    .locals 3
    .param p0    # Lxu/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/collections/i;

    invoke-direct {v0}, Lkotlin/collections/i;-><init>()V

    move-object v1, p1

    :goto_0
    if-eqz v1, :cond_0

    invoke-virtual {p0, v1}, Lxu/l;->exists(Lxu/h0;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Lkotlin/collections/i;->addFirst(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lxu/h0;->j()Lxu/h0;

    move-result-object v1

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_2

    invoke-virtual {v0}, Lkotlin/collections/i;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " already exists."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lxu/h0;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p2, v2, v0, v1}, Lxu/l;->createDirectory$default(Lxu/l;Lxu/h0;ZILjava/lang/Object;)V

    goto :goto_2

    :cond_3
    return-void
.end method

.method public static final d(Lxu/l;Lxu/h0;Z)V
    .locals 2
    .param p0    # Lxu/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileOrDirectory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyu/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lyu/d$b;-><init>(Lxu/l;Lxu/h0;Lnt/b;)V

    invoke-static {v0}, Liu/i;->b(Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxu/h0;

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {p0, v0, v1}, Lxu/l;->delete(Lxu/h0;Z)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static final e(Lxu/l;Lxu/h0;)Z
    .locals 1
    .param p0    # Lxu/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lxu/l;->metadataOrNull(Lxu/h0;)Lxu/k;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final f(Lxu/l;Lxu/h0;Z)Lkotlin/sequences/Sequence;
    .locals 2
    .param p0    # Lxu/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxu/l;",
            "Lxu/h0;",
            "Z)",
            "Lkotlin/sequences/Sequence<",
            "Lxu/h0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyu/d$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, p2, v1}, Lyu/d$c;-><init>(Lxu/h0;Lxu/l;ZLnt/b;)V

    invoke-static {v0}, Liu/i;->b(Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lxu/l;Lxu/h0;)Lxu/k;
    .locals 2
    .param p0    # Lxu/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lxu/l;->metadataOrNull(Lxu/h0;)Lxu/k;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/io/FileNotFoundException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "no such file: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final h(Lxu/l;Lxu/h0;)Lxu/h0;
    .locals 1
    .param p0    # Lxu/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lxu/h0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lxu/l;->metadata(Lxu/h0;)Lxu/k;

    move-result-object p0

    invoke-virtual {p0}, Lxu/k;->e()Lxu/h0;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p1}, Lxu/h0;->j()Lxu/h0;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, p0}, Lxu/h0;->o(Lxu/h0;)Lxu/h0;

    move-result-object p0

    return-object p0
.end method
