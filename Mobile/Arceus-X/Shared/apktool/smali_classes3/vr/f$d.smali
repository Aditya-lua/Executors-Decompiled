.class public final Lvr/f$d;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvr/f;->n(Lvr/h;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lku/p0;",
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.workflows.WorkflowContextAdapter$runningWorker$1"
    f = "WorkflowContextAdapter.kt"
    l = {
        0xa3
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public final synthetic A:Lvr/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvr/h<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic B:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "TT;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:I

.field public y:I

.field public final synthetic z:Lvr/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvr/f<",
            "TState;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lvr/f;Lvr/h;Lkotlin/jvm/functions/Function1;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvr/f<",
            "TState;>;",
            "Lvr/h<",
            "+TT;>;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;",
            "Lnt/b<",
            "-",
            "Lvr/f$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvr/f$d;->z:Lvr/f;

    iput-object p2, p0, Lvr/f$d;->A:Lvr/h;

    iput-object p3, p0, Lvr/f$d;->B:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 3
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

    new-instance p1, Lvr/f$d;

    iget-object v0, p0, Lvr/f$d;->z:Lvr/f;

    iget-object v1, p0, Lvr/f$d;->A:Lvr/h;

    iget-object v2, p0, Lvr/f$d;->B:Lkotlin/jvm/functions/Function1;

    invoke-direct {p1, v0, v1, v2, p2}, Lvr/f$d;-><init>(Lvr/f;Lvr/h;Lkotlin/jvm/functions/Function1;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lvr/f$d;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/p0;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lvr/f$d;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lvr/f$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lvr/f$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v2, v1, Lvr/f$d;->y:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

    iget-object v0, v1, Lvr/f$d;->w:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v2, v1, Lvr/f$d;->v:Ljava/lang/Object;

    check-cast v2, Lvr/f;

    iget-object v6, v1, Lvr/f$d;->u:Ljava/lang/Object;

    check-cast v6, Lvr/h;

    iget-object v7, v1, Lvr/f$d;->t:Ljava/lang/Object;

    check-cast v7, Luu/a;

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    :goto_0
    move-object v8, v2

    move-object v2, v7

    move-object v7, v6

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object v2, v1, Lvr/f$d;->z:Lvr/f;

    invoke-static {v2}, Lvr/f;->c(Lvr/f;)Luu/a;

    move-result-object v7

    iget-object v6, v1, Lvr/f$d;->A:Lvr/h;

    iget-object v2, v1, Lvr/f$d;->z:Lvr/f;

    iget-object v8, v1, Lvr/f$d;->B:Lkotlin/jvm/functions/Function1;

    iput-object v7, v1, Lvr/f$d;->t:Ljava/lang/Object;

    iput-object v6, v1, Lvr/f$d;->u:Ljava/lang/Object;

    iput-object v2, v1, Lvr/f$d;->v:Ljava/lang/Object;

    iput-object v8, v1, Lvr/f$d;->w:Ljava/lang/Object;

    iput v3, v1, Lvr/f$d;->x:I

    iput v4, v1, Lvr/f$d;->y:I

    invoke-interface {v7, v5, v1}, Luu/a;->f(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, v8

    goto :goto_0

    :goto_1
    :try_start_0
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    invoke-static {v8}, Lvr/f;->e(Lvr/f;)Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_3

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_3
    :goto_2
    check-cast v6, Ljava/util/List;

    move-object v10, v6

    check-cast v10, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_4
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_5

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lvr/f$b;

    invoke-virtual {v13}, Lvr/f$b;->c()Lvr/h;

    move-result-object v13

    invoke-interface {v13, v7}, Lvr/h;->a(Lvr/h;)Z

    move-result v13

    if-eqz v13, :cond_4

    invoke-interface {v11, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    move-object v10, v6

    check-cast v10, Ljava/lang/Iterable;

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_7

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lvr/f$b;

    invoke-virtual {v13}, Lvr/f$b;->c()Lvr/h;

    move-result-object v13

    invoke-interface {v13, v7}, Lvr/h;->c(Lvr/h;)Z

    move-result v13

    if-eqz v13, :cond_6

    goto :goto_4

    :cond_7
    move-object v12, v5

    :goto_4
    check-cast v12, Lvr/f$b;

    if-eqz v12, :cond_8

    const-string v3, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any?, kotlin.Unit>"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v4}, Lkotlin/jvm/internal/h0;->e(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v12, v0}, Lvr/f$b;->e(Lkotlin/jvm/functions/Function1;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v2, v5}, Luu/a;->e(Ljava/lang/Object;)V

    return-object v0

    :cond_8
    :try_start_1
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_a

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v10

    :cond_9
    :goto_5
    if-ge v3, v10, :cond_a

    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    add-int/lit8 v3, v3, 0x1

    check-cast v12, Lvr/f$b;

    invoke-virtual {v12}, Lvr/f$b;->a()Lku/d2;

    move-result-object v12

    if-eqz v12, :cond_9

    invoke-static {v12, v5, v4, v5}, Lku/d2$a;->a(Lku/d2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    goto :goto_5

    :cond_a
    new-instance v10, Lvr/f$b;

    invoke-direct {v10, v7, v0}, Lvr/f$b;-><init>(Lvr/h;Lkotlin/jvm/functions/Function1;)V

    invoke-static {v8}, Lvr/f;->e(Lvr/f;)Ljava/util/Map;

    move-result-object v0

    check-cast v6, Ljava/util/Collection;

    invoke-static {v6, v10}, Lkotlin/collections/CollectionsKt;->x0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v0, v9, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v8}, Lvr/f;->b(Lvr/f;)Lku/p0;

    move-result-object v0

    new-instance v14, Lvr/f$d$a;

    const/4 v11, 0x0

    move-object v6, v14

    invoke-direct/range {v6 .. v11}, Lvr/f$d$a;-><init>(Lvr/h;Lvr/f;Ljava/lang/Class;Lvr/f$b;Lnt/b;)V

    const/4 v15, 0x3

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v11, v0

    invoke-static/range {v11 .. v16}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    move-result-object v0

    invoke-virtual {v10, v0}, Lvr/f$b;->d(Lku/d2;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v2, v5}, Luu/a;->e(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :goto_6
    invoke-interface {v2, v5}, Luu/a;->e(Ljava/lang/Object;)V

    throw v0
.end method
