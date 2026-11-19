.class public final Lmq/c0$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmq/c0$e;->collect(Ldv/i;Leu/b;)Ljava/lang/Object;
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
        "Ldv/i;"
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
.field public final synthetic a:Ldv/i;

.field public final synthetic b:Lmq/c0;


# direct methods
.method public constructor <init>(Ldv/i;Lmq/c0;)V
    .locals 0

    iput-object p1, p0, Lmq/c0$e$a;->a:Ldv/i;

    iput-object p2, p0, Lmq/c0$e$a;->b:Lmq/c0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p2, Lmq/c0$e$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lmq/c0$e$a$a;

    iget v1, v0, Lmq/c0$e$a$a;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lmq/c0$e$a$a;->u:I

    goto :goto_0

    :cond_0
    new-instance v0, Lmq/c0$e$a$a;

    invoke-direct {v0, p0, p2}, Lmq/c0$e$a$a;-><init>(Lmq/c0$e$a;Leu/b;)V

    :goto_0
    iget-object p2, v0, Lmq/c0$e$a$a;->t:Ljava/lang/Object;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lmq/c0$e$a$a;->u:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lmq/c0$e$a$a;->A:Ljava/lang/Object;

    check-cast p1, Lmq/c0$c;

    iget-object p1, v0, Lmq/c0$e$a$a;->z:Ljava/lang/Object;

    check-cast p1, Ldv/i;

    iget-object p1, v0, Lmq/c0$e$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lmq/c0$e$a$a;

    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lmq/c0$e$a$a;->F:I

    iget-object v2, v0, Lmq/c0$e$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lsn/d1;

    iget-object v2, v0, Lmq/c0$e$a$a;->D:Ljava/lang/Object;

    check-cast v2, Lxn/d;

    iget-object v4, v0, Lmq/c0$e$a$a;->C:Ljava/lang/Object;

    check-cast v4, Lmq/c0;

    iget-object v4, v0, Lmq/c0$e$a$a;->B:Ljava/lang/Object;

    check-cast v4, Lxn/d;

    iget-object v4, v0, Lmq/c0$e$a$a;->A:Ljava/lang/Object;

    check-cast v4, Leu/b;

    iget-object v4, v0, Lmq/c0$e$a$a;->z:Ljava/lang/Object;

    check-cast v4, Ldv/i;

    iget-object v6, v0, Lmq/c0$e$a$a;->y:Ljava/lang/Object;

    iget-object v7, v0, Lmq/c0$e$a$a;->x:Ljava/lang/Object;

    check-cast v7, Lmq/c0$e$a$a;

    iget-object v8, v0, Lmq/c0$e$a$a;->v:Ljava/lang/Object;

    :try_start_0
    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v9, p1

    move-object p1, v8

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_7

    :cond_3
    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lmq/c0$e$a;->a:Ldv/i;

    move-object v2, p1

    check-cast v2, Lxn/d;

    iget-object v6, p0, Lmq/c0$e$a;->b:Lmq/c0;

    :try_start_1
    invoke-virtual {v2}, Lxn/d;->h()Lsn/k0;

    move-result-object v7

    invoke-static {v6, v7}, Lmq/c0;->j(Lmq/c0;Lsn/k0;)Z

    move-result v7

    invoke-virtual {v2}, Lxn/d;->i()Lsn/d1;

    move-result-object v8

    iget-object v9, p0, Lmq/c0$e$a;->b:Lmq/c0;

    invoke-static {v9}, Lmq/c0;->i(Lmq/c0;)Lmq/f0;

    move-result-object v9

    iget-object v10, p0, Lmq/c0$e$a;->b:Lmq/c0;

    invoke-static {v10}, Lmq/c0;->g(Lmq/c0;)Lrq/a;

    move-result-object v10

    invoke-virtual {v10}, Lrq/a;->f()Lxn/a;

    move-result-object v10

    invoke-virtual {v9, v10, v2}, Lmq/f0;->h(Lxn/a;Lxn/d;)V

    const/4 v9, 0x0

    if-eqz v8, :cond_7

    invoke-static {v8}, Lmq/m0;->d(Lsn/d1;)Lxn/a;

    move-result-object v4

    iget-object v6, p0, Lmq/c0$e$a;->b:Lmq/c0;

    invoke-static {v6}, Lmq/c0;->g(Lmq/c0;)Lrq/a;

    move-result-object v6

    invoke-virtual {v6}, Lrq/a;->f()Lxn/a;

    move-result-object v6

    if-ne v4, v6, :cond_6

    iget-object v4, p0, Lmq/c0$e$a;->b:Lmq/c0;

    invoke-static {v4}, Lmq/c0;->e(Lmq/c0;)Z

    move-result v4

    const/high16 v6, 0x3f800000    # 1.0f

    if-eqz v4, :cond_5

    iget-object v4, p0, Lmq/c0$e$a;->b:Lmq/c0;

    invoke-static {v4}, Lmq/c0;->h(Lmq/c0;)Ler/c;

    move-result-object v4

    iget-object v10, p0, Lmq/c0$e$a;->b:Lmq/c0;

    invoke-static {v10}, Lmq/c0;->g(Lmq/c0;)Lrq/a;

    move-result-object v10

    invoke-static {v8, v4, v10}, Lmq/m0;->b(Lsn/d1;Ler/c;Lrq/a;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lzt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v8

    if-nez v8, :cond_4

    check-cast v4, Lmq/b0;

    new-instance v8, Lmq/c0$c$a;

    invoke-virtual {v2}, Lxn/d;->a()Lxn/b;

    move-result-object v10

    invoke-direct {v8, v4, v6, v10, v7}, Lmq/c0$c$a;-><init>(Lmq/b0;FLxn/b;Z)V

    :goto_1
    move-object v6, p1

    move-object v7, v0

    goto/16 :goto_4

    :cond_4
    new-instance v4, Lmq/c0$c$b;

    invoke-direct {v4, v8}, Lmq/c0$c$b;-><init>(Ljava/lang/Throwable;)V

    :goto_2
    move-object v6, p1

    move-object v7, v0

    move-object v8, v4

    goto/16 :goto_4

    :cond_5
    new-instance v8, Lmq/c0$c$a;

    invoke-virtual {v2}, Lxn/d;->a()Lxn/b;

    move-result-object v4

    invoke-direct {v8, v5, v6, v4, v7}, Lmq/c0$c$a;-><init>(Lmq/b0;FLxn/b;Z)V

    goto :goto_1

    :cond_6
    new-instance v8, Lmq/c0$c$c;

    sget-object v4, Lxn/c;->g:Lxn/c;

    iget-object v6, p0, Lmq/c0$e$a;->b:Lmq/c0;

    invoke-static {v6}, Lmq/c0;->g(Lmq/c0;)Lrq/a;

    move-result-object v10

    invoke-virtual {v10}, Lrq/a;->f()Lxn/a;

    move-result-object v10

    invoke-static {v6, v2, v10}, Lmq/c0;->d(Lmq/c0;Lxn/d;Lxn/a;)F

    move-result v6

    invoke-virtual {v2}, Lxn/d;->a()Lxn/b;

    move-result-object v10

    invoke-direct {v8, v4, v6, v10, v7}, Lmq/c0$c$c;-><init>(Lxn/c;FLxn/b;Z)V

    goto :goto_1

    :cond_7
    invoke-virtual {v2}, Lxn/d;->c()Lxn/c;

    move-result-object v10

    sget-object v11, Lxn/c;->h:Lxn/c;

    if-ne v10, v11, :cond_a

    iget-object v10, p0, Lmq/c0$e$a;->b:Lmq/c0;

    invoke-static {v10}, Lmq/c0;->f(Lmq/c0;)I

    move-result v12

    add-int/2addr v12, v4

    invoke-static {v10, v12}, Lmq/c0;->k(Lmq/c0;I)V

    iget-object v10, p0, Lmq/c0$e$a;->b:Lmq/c0;

    invoke-static {v10}, Lmq/c0;->f(Lmq/c0;)I

    move-result v10

    const/4 v12, 0x6

    if-lt v10, v12, :cond_8

    new-instance v4, Lmq/c0$c$c;

    invoke-virtual {v2}, Lxn/d;->a()Lxn/b;

    move-result-object v6

    const/4 v8, 0x0

    invoke-direct {v4, v11, v8, v6, v7}, Lmq/c0$c$c;-><init>(Lxn/c;FLxn/b;Z)V

    goto :goto_2

    :cond_8
    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lmq/c0$e$a$a;->v:Ljava/lang/Object;

    invoke-static {v0}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lmq/c0$e$a$a;->x:Ljava/lang/Object;

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lmq/c0$e$a$a;->y:Ljava/lang/Object;

    iput-object p2, v0, Lmq/c0$e$a$a;->z:Ljava/lang/Object;

    invoke-static {v0}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lmq/c0$e$a$a;->A:Ljava/lang/Object;

    invoke-static {v2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lmq/c0$e$a$a;->B:Ljava/lang/Object;

    invoke-static {v6}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v0, Lmq/c0$e$a$a;->C:Ljava/lang/Object;

    iput-object v2, v0, Lmq/c0$e$a$a;->D:Ljava/lang/Object;

    invoke-static {v8}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v0, Lmq/c0$e$a$a;->E:Ljava/lang/Object;

    iput v9, v0, Lmq/c0$e$a$a;->F:I

    iput v9, v0, Lmq/c0$e$a$a;->G:I

    iput v9, v0, Lmq/c0$e$a$a;->H:I

    iput v9, v0, Lmq/c0$e$a$a;->I:I

    iput-boolean v7, v0, Lmq/c0$e$a$a;->J:Z

    iput v4, v0, Lmq/c0$e$a$a;->u:I

    const-wide/16 v6, 0x1f4

    invoke-static {v6, v7, v0}, Lav/z0;->b(JLeu/b;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_9

    goto/16 :goto_5

    :cond_9
    move-object v6, p1

    move-object v4, p2

    move-object v7, v0

    :goto_3
    move-object p2, v4

    move-object v8, v5

    goto :goto_4

    :cond_a
    new-instance v4, Lmq/c0$c$c;

    invoke-virtual {v2}, Lxn/d;->c()Lxn/c;

    move-result-object v6

    if-nez v6, :cond_b

    sget-object v6, Lxn/c;->i:Lxn/c;

    :cond_b
    iget-object v8, p0, Lmq/c0$e$a;->b:Lmq/c0;

    invoke-static {v8}, Lmq/c0;->g(Lmq/c0;)Lrq/a;

    move-result-object v10

    invoke-virtual {v10}, Lrq/a;->f()Lxn/a;

    move-result-object v10

    invoke-static {v8, v2, v10}, Lmq/c0;->d(Lmq/c0;Lxn/d;Lxn/a;)F

    move-result v8

    invoke-virtual {v2}, Lxn/d;->a()Lxn/b;

    move-result-object v10

    invoke-direct {v4, v6, v8, v10, v7}, Lmq/c0$c$c;-><init>(Lxn/c;FLxn/b;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_2

    :goto_4
    invoke-virtual {v2}, Lxn/d;->i()Lsn/d1;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Lsn/d1;->a()Landroid/graphics/Bitmap;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v4

    if-nez v4, :cond_c

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    :cond_c
    if-eqz v8, :cond_d

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lmq/c0$e$a$a;->v:Ljava/lang/Object;

    invoke-static {v7}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lmq/c0$e$a$a;->x:Ljava/lang/Object;

    invoke-static {v6}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lmq/c0$e$a$a;->y:Ljava/lang/Object;

    invoke-static {p2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lmq/c0$e$a$a;->z:Ljava/lang/Object;

    invoke-static {v8}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lmq/c0$e$a$a;->A:Ljava/lang/Object;

    iput-object v5, v0, Lmq/c0$e$a$a;->B:Ljava/lang/Object;

    iput-object v5, v0, Lmq/c0$e$a$a;->C:Ljava/lang/Object;

    iput-object v5, v0, Lmq/c0$e$a$a;->D:Ljava/lang/Object;

    iput-object v5, v0, Lmq/c0$e$a$a;->E:Ljava/lang/Object;

    iput v9, v0, Lmq/c0$e$a$a;->F:I

    iput v3, v0, Lmq/c0$e$a$a;->u:I

    invoke-interface {p2, v8, v0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_d

    :goto_5
    return-object v1

    :cond_d
    :goto_6
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :goto_7
    invoke-virtual {v2}, Lxn/d;->i()Lsn/d1;

    move-result-object p2

    if-eqz p2, :cond_e

    invoke-virtual {p2}, Lsn/d1;->a()Landroid/graphics/Bitmap;

    move-result-object p2

    if-eqz p2, :cond_e

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_e

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->recycle()V

    :cond_e
    throw p1
.end method
