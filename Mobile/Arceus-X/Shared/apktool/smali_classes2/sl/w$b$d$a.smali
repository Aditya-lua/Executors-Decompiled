.class public final Lsl/w$b$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl/w$b$d;->collect(Lnu/i;Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lnu/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lnu/i;

.field public final synthetic b:Lku/p0;

.field public final synthetic c:Lsl/w;


# direct methods
.method public constructor <init>(Lnu/i;Lku/p0;Lsl/w;)V
    .locals 0

    iput-object p1, p0, Lsl/w$b$d$a;->a:Lnu/i;

    iput-object p2, p0, Lsl/w$b$d$a;->b:Lku/p0;

    iput-object p3, p0, Lsl/w$b$d$a;->c:Lsl/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lsl/w$b$d$a$a;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lsl/w$b$d$a$a;

    iget v3, v2, Lsl/w$b$d$a$a;->u:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lsl/w$b$d$a$a;->u:I

    :goto_0
    move-object v6, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lsl/w$b$d$a$a;

    invoke-direct {v2, v1, v0}, Lsl/w$b$d$a$a;-><init>(Lsl/w$b$d$a;Lnt/b;)V

    goto :goto_0

    :goto_1
    iget-object v0, v6, Lsl/w$b$d$a$a;->t:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v2

    iget v3, v6, Lsl/w$b$d$a$a;->u:I

    const/4 v9, 0x3

    const/4 v4, 0x2

    const-string v10, "rbx.achievement.replicator"

    const/4 v11, 0x1

    if-eqz v3, :cond_4

    if-eq v3, v11, :cond_3

    if-eq v3, v4, :cond_2

    if-ne v3, v9, :cond_1

    iget-object v2, v6, Lsl/w$b$d$a$a;->z:Ljava/lang/Object;

    check-cast v2, Lnu/i;

    iget-object v2, v6, Lsl/w$b$d$a$a;->x:Ljava/lang/Object;

    check-cast v2, Lsl/w$b$d$a$a;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v3, v6, Lsl/w$b$d$a$a;->F:I

    iget-object v4, v6, Lsl/w$b$d$a$a;->E:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v6, Lsl/w$b$d$a$a;->D:Ljava/lang/Object;

    check-cast v4, Lku/p0;

    iget-object v4, v6, Lsl/w$b$d$a$a;->C:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v6, Lsl/w$b$d$a$a;->B:Ljava/lang/Object;

    check-cast v4, Lnt/b;

    iget-object v4, v6, Lsl/w$b$d$a$a;->A:Ljava/lang/Object;

    check-cast v4, Lnu/i;

    iget-object v5, v6, Lsl/w$b$d$a$a;->z:Ljava/lang/Object;

    check-cast v5, Lnu/i;

    iget-object v7, v6, Lsl/w$b$d$a$a;->y:Ljava/lang/Object;

    iget-object v8, v6, Lsl/w$b$d$a$a;->x:Ljava/lang/Object;

    check-cast v8, Lsl/w$b$d$a$a;

    iget-object v13, v6, Lsl/w$b$d$a$a;->v:Ljava/lang/Object;

    :try_start_0
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_6

    :catchall_0
    move-exception v0

    move-object v12, v7

    move-object v11, v13

    move-object v13, v8

    goto/16 :goto_7

    :cond_3
    iget v3, v6, Lsl/w$b$d$a$a;->H:I

    iget v5, v6, Lsl/w$b$d$a$a;->G:I

    iget v7, v6, Lsl/w$b$d$a$a;->F:I

    iget-object v8, v6, Lsl/w$b$d$a$a;->D:Ljava/lang/Object;

    check-cast v8, Lku/p0;

    iget-object v13, v6, Lsl/w$b$d$a$a;->C:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    iget-object v14, v6, Lsl/w$b$d$a$a;->B:Ljava/lang/Object;

    check-cast v14, Lnt/b;

    iget-object v15, v6, Lsl/w$b$d$a$a;->A:Ljava/lang/Object;

    check-cast v15, Lnu/i;

    iget-object v9, v6, Lsl/w$b$d$a$a;->z:Ljava/lang/Object;

    check-cast v9, Lnu/i;

    iget-object v12, v6, Lsl/w$b$d$a$a;->y:Ljava/lang/Object;

    iget-object v4, v6, Lsl/w$b$d$a$a;->x:Ljava/lang/Object;

    check-cast v4, Lsl/w$b$d$a$a;

    iget-object v11, v6, Lsl/w$b$d$a$a;->v:Ljava/lang/Object;

    :try_start_1
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v19, v13

    move-object v13, v4

    move-object/from16 v4, v19

    move-object/from16 v19, v9

    move v9, v7

    move-object v7, v14

    move-object/from16 v14, v19

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v13, v4

    move v3, v7

    move-object v5, v9

    :goto_2
    move-object v4, v15

    goto/16 :goto_7

    :cond_4
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object v4, v1, Lsl/w$b$d$a;->a:Lnu/i;

    move-object/from16 v13, p1

    check-cast v13, Ljava/util/List;

    iget-object v8, v1, Lsl/w$b$d$a;->b:Lku/p0;

    const/4 v3, 0x0

    :try_start_2
    sget-object v0, Ljt/n;->b:Ljt/n$a;

    move-object v0, v13

    check-cast v0, Ljava/util/Collection;

    invoke-static/range {p1 .. p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v6, Lsl/w$b$d$a$a;->v:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v6, Lsl/w$b$d$a$a;->x:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v6, Lsl/w$b$d$a$a;->y:Ljava/lang/Object;

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v6, Lsl/w$b$d$a$a;->z:Ljava/lang/Object;

    iput-object v4, v6, Lsl/w$b$d$a$a;->A:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v6, Lsl/w$b$d$a$a;->B:Ljava/lang/Object;

    invoke-static {v13}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v6, Lsl/w$b$d$a$a;->C:Ljava/lang/Object;

    invoke-static {v8}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v6, Lsl/w$b$d$a$a;->D:Ljava/lang/Object;

    iput v3, v6, Lsl/w$b$d$a$a;->F:I

    iput v3, v6, Lsl/w$b$d$a$a;->G:I

    iput v3, v6, Lsl/w$b$d$a$a;->H:I

    const/4 v5, 0x1

    iput v5, v6, Lsl/w$b$d$a$a;->u:I

    invoke-static {v0, v6}, Lku/f;->a(Ljava/util/Collection;Lnt/b;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-ne v0, v2, :cond_5

    goto/16 :goto_9

    :cond_5
    move-object/from16 v11, p1

    move-object v12, v11

    move v5, v3

    move v9, v5

    move-object v14, v4

    move-object v15, v14

    move-object v7, v6

    move-object v4, v13

    move-object v13, v7

    :goto_3
    :try_start_3
    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 v16, v4

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ljt/n;

    invoke-virtual/range {v17 .. v17}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Ljt/n;->g(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_6

    const/16 v17, 0x0

    :cond_6
    move-object/from16 p1, v0

    move-object/from16 v0, v17

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_7

    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :catchall_2
    move-exception v0

    move v3, v9

    move-object v5, v14

    goto/16 :goto_2

    :cond_7
    :goto_5
    move-object/from16 v0, p1

    goto :goto_4

    :cond_8
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    move-object/from16 p1, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v17, v7

    const-string v7, "Marking "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " achievements synced"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, v1, Lsl/w$b$d$a;->c:Lsl/w;

    invoke-static {v0}, Lsl/w;->a(Lsl/w;)Lsl/b;

    move-result-object v0

    invoke-static {v11}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v6, Lsl/w$b$d$a$a;->v:Ljava/lang/Object;

    invoke-static {v13}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v6, Lsl/w$b$d$a$a;->x:Ljava/lang/Object;

    invoke-static {v12}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v6, Lsl/w$b$d$a$a;->y:Ljava/lang/Object;

    invoke-static {v14}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v6, Lsl/w$b$d$a$a;->z:Ljava/lang/Object;

    iput-object v15, v6, Lsl/w$b$d$a$a;->A:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v6, Lsl/w$b$d$a$a;->B:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v6, Lsl/w$b$d$a$a;->C:Ljava/lang/Object;

    invoke-static {v8}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v6, Lsl/w$b$d$a$a;->D:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v6, Lsl/w$b$d$a$a;->E:Ljava/lang/Object;

    iput v9, v6, Lsl/w$b$d$a$a;->F:I

    iput v5, v6, Lsl/w$b$d$a$a;->G:I

    iput v3, v6, Lsl/w$b$d$a$a;->H:I

    const/4 v3, 0x2

    iput v3, v6, Lsl/w$b$d$a$a;->u:I

    const/4 v5, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    move-object/from16 v4, p1

    move-object v3, v0

    invoke-static/range {v3 .. v8}, Lsl/b;->b(Lsl/b;Ljava/util/List;Ljava/time/Instant;Lnt/b;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne v0, v2, :cond_9

    goto/16 :goto_9

    :cond_9
    move v3, v9

    move-object v7, v12

    move-object v8, v13

    move-object v5, v14

    move-object v4, v15

    move-object v13, v11

    :goto_6
    :try_start_4
    const-string v0, "All achievements marked."

    invoke-static {v10, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->D()Z

    move-result v0

    if-eqz v0, :cond_a

    sget-object v0, Lsl/t;->a:Lsl/t;

    const-string v9, "remote"

    const/4 v11, 0x1

    invoke-virtual {v0, v9, v11}, Lsl/t;->o(Ljava/lang/String;Z)V

    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_8

    :catchall_3
    move-exception v0

    move-object/from16 v11, p1

    move-object v12, v11

    move-object v5, v4

    move-object v13, v6

    :goto_7
    sget-object v7, Ljt/n;->b:Ljt/n$a;

    invoke-static {v0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v12

    move-object v8, v13

    move-object v13, v11

    :goto_8
    invoke-static {v0}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v9

    if-eqz v9, :cond_b

    const-string v11, "Unable to mark achievements synced"

    invoke-static {v10, v11, v9}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_b
    invoke-static {v0}, Ljt/n;->a(Ljava/lang/Object;)Ljt/n;

    move-result-object v0

    invoke-static {v13}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v6, Lsl/w$b$d$a$a;->v:Ljava/lang/Object;

    invoke-static {v8}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v6, Lsl/w$b$d$a$a;->x:Ljava/lang/Object;

    invoke-static {v7}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v6, Lsl/w$b$d$a$a;->y:Ljava/lang/Object;

    invoke-static {v5}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v6, Lsl/w$b$d$a$a;->z:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v6, Lsl/w$b$d$a$a;->A:Ljava/lang/Object;

    iput-object v5, v6, Lsl/w$b$d$a$a;->B:Ljava/lang/Object;

    iput-object v5, v6, Lsl/w$b$d$a$a;->C:Ljava/lang/Object;

    iput-object v5, v6, Lsl/w$b$d$a$a;->D:Ljava/lang/Object;

    iput-object v5, v6, Lsl/w$b$d$a$a;->E:Ljava/lang/Object;

    iput v3, v6, Lsl/w$b$d$a$a;->F:I

    const/4 v3, 0x3

    iput v3, v6, Lsl/w$b$d$a$a;->u:I

    invoke-interface {v4, v0, v6}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_c

    :goto_9
    return-object v2

    :cond_c
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method
