.class public final Lx4/l0$j;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx4/l0;->x(Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lx4/g0;",
        "Lnt/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lx4/g0;",
        "connection",
        "",
        "<anonymous>",
        "(Lx4/g0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1"
    f = "InvalidationTracker.kt"
    l = {
        0x133,
        0x13a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:I

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lx4/l0;


# direct methods
.method public constructor <init>(Lx4/l0;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx4/l0;",
            "Lnt/b<",
            "-",
            "Lx4/l0$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lx4/l0$j;->w:Lx4/l0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lx4/l0$j;

    iget-object v1, p0, Lx4/l0$j;->w:Lx4/l0;

    invoke-direct {v0, v1, p2}, Lx4/l0$j;-><init>(Lx4/l0;Lnt/b;)V

    iput-object p1, v0, Lx4/l0$j;->v:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx4/g0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lx4/l0$j;->q(Lx4/g0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v1, p0

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v2, v1, Lx4/l0$j;->u:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, v1, Lx4/l0$j;->t:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/concurrent/locks/ReentrantLock;

    iget-object v0, v1, Lx4/l0$j;->v:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lx4/k;

    :try_start_0
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_7

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v2, v1, Lx4/l0$j;->v:Ljava/lang/Object;

    check-cast v2, Lx4/g0;

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v6, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object v2, v1, Lx4/l0$j;->v:Ljava/lang/Object;

    check-cast v2, Lx4/g0;

    iput-object v2, v1, Lx4/l0$j;->v:Ljava/lang/Object;

    iput v5, v1, Lx4/l0$j;->u:I

    invoke-interface {v2, v1}, Lx4/g0;->b(Lnt/b;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_3

    goto/16 :goto_6

    :cond_3
    :goto_0
    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_4

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_4
    iget-object v6, v1, Lx4/l0$j;->w:Lx4/l0;

    invoke-static {v6}, Lx4/l0;->e(Lx4/l0;)Lx4/k;

    move-result-object v6

    iget-object v7, v1, Lx4/l0$j;->w:Lx4/l0;

    invoke-static {v6}, Lx4/k;->c(Lx4/k;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_1
    invoke-static {v6, v5}, Lx4/k;->f(Lx4/k;Z)V

    invoke-static {v6}, Lx4/k;->a(Lx4/k;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v9

    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    :try_start_2
    invoke-static {v6}, Lx4/k;->b(Lx4/k;)Z

    move-result v10

    const/4 v11, 0x0

    if-nez v10, :cond_6

    :cond_5
    move-object v12, v11

    goto :goto_5

    :cond_6
    invoke-static {v6, v4}, Lx4/k;->g(Lx4/k;Z)V

    invoke-static {v6}, Lx4/k;->e(Lx4/k;)[J

    move-result-object v10

    array-length v10, v10

    new-array v12, v10, [Lx4/k$a;

    move v13, v4

    move v14, v13

    :goto_1
    if-ge v13, v10, :cond_a

    invoke-static {v6}, Lx4/k;->e(Lx4/k;)[J

    move-result-object v15

    aget-wide v16, v15, v13

    const-wide/16 v18, 0x0

    cmp-long v15, v16, v18

    if-lez v15, :cond_7

    move v15, v5

    goto :goto_2

    :cond_7
    move v15, v4

    :goto_2
    invoke-static {v6}, Lx4/k;->d(Lx4/k;)[Z

    move-result-object v16

    aget-boolean v5, v16, v13

    if-eq v15, v5, :cond_9

    invoke-static {v6}, Lx4/k;->d(Lx4/k;)[Z

    move-result-object v5

    aput-boolean v15, v5, v13

    if-eqz v15, :cond_8

    sget-object v5, Lx4/k$a;->b:Lx4/k$a;

    :goto_3
    const/4 v14, 0x1

    goto :goto_4

    :catchall_1
    move-exception v0

    goto :goto_a

    :cond_8
    sget-object v5, Lx4/k$a;->c:Lx4/k$a;

    goto :goto_3

    :cond_9
    sget-object v5, Lx4/k$a;->a:Lx4/k$a;

    :goto_4
    aput-object v5, v12, v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    add-int/lit8 v13, v13, 0x1

    const/4 v5, 0x1

    goto :goto_1

    :cond_a
    if-eqz v14, :cond_5

    :goto_5
    :try_start_3
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    if-eqz v12, :cond_d

    :try_start_4
    array-length v5, v12

    if-nez v5, :cond_b

    goto :goto_9

    :cond_b
    sget-object v5, Lx4/g0$a;->b:Lx4/g0$a;

    new-instance v9, Lx4/l0$j$a;

    invoke-direct {v9, v12, v7, v2, v11}, Lx4/l0$j$a;-><init>([Lx4/k$a;Lx4/l0;Lx4/g0;Lnt/b;)V

    iput-object v6, v1, Lx4/l0$j;->v:Ljava/lang/Object;

    iput-object v8, v1, Lx4/l0$j;->t:Ljava/lang/Object;

    iput v3, v1, Lx4/l0$j;->u:I

    invoke-interface {v2, v5, v9, v1}, Lx4/g0;->c(Lx4/g0$a;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-ne v2, v0, :cond_c

    :goto_6
    return-object v0

    :cond_c
    move-object v3, v6

    move-object v2, v8

    :goto_7
    move-object v8, v2

    move-object v6, v3

    goto :goto_9

    :catchall_2
    move-exception v0

    move-object v3, v6

    move-object v2, v8

    :goto_8
    :try_start_5
    invoke-static {v3, v4}, Lx4/k;->f(Lx4/k;Z)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    move-exception v0

    move-object v8, v2

    goto :goto_b

    :cond_d
    :goto_9
    :try_start_6
    invoke-static {v6, v4}, Lx4/k;->f(Lx4/k;Z)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :catchall_4
    move-exception v0

    goto :goto_b

    :goto_a
    :try_start_7
    invoke-virtual {v9}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :goto_b
    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method public final q(Lx4/g0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx4/g0;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lx4/l0$j;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lx4/l0$j;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lx4/l0$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
