.class public final Lep/a$d;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lep/a;->h(Ljava/lang/String;)V
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
    c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$prepare$1"
    f = "PlayIntegrityHelper.kt"
    l = {
        0x99,
        0x48,
        0x9c,
        0x5b,
        0x5f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public A:I

.field public B:I

.field public final synthetic C:Lep/a;

.field public final synthetic D:Ljava/lang/String;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lep/a;Ljava/lang/String;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lep/a;",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Lep/a$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lep/a$d;->C:Lep/a;

    iput-object p2, p0, Lep/a$d;->D:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

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

    new-instance p1, Lep/a$d;

    iget-object v0, p0, Lep/a$d;->C:Lep/a;

    iget-object v1, p0, Lep/a$d;->D:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lep/a$d;-><init>(Lep/a;Ljava/lang/String;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lep/a$d;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lep/a$d;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lep/a$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lep/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v2, v1, Lep/a$d;->B:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v7, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, v1, Lep/a$d;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    :goto_0
    iget-object v0, v1, Lep/a$d;->v:Ljava/lang/Object;

    check-cast v0, Ltd/c$a;

    iget-object v0, v1, Lep/a$d;->u:Ljava/lang/Object;

    check-cast v0, Ltd/c;

    iget-object v0, v1, Lep/a$d;->t:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Luu/a;

    :try_start_0
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v1, Lep/a$d;->w:Ljava/lang/Object;

    check-cast v0, Ltd/c$c;

    goto :goto_0

    :cond_2
    iget v2, v1, Lep/a$d;->z:I

    iget v5, v1, Lep/a$d;->y:I

    iget-object v7, v1, Lep/a$d;->x:Ljava/lang/Object;

    check-cast v7, Lep/a$d;

    iget-object v7, v1, Lep/a$d;->w:Ljava/lang/Object;

    check-cast v7, Ltd/c$a;

    iget-object v10, v1, Lep/a$d;->v:Ljava/lang/Object;

    check-cast v10, Ltd/c;

    iget-object v11, v1, Lep/a$d;->u:Ljava/lang/Object;

    check-cast v11, Lep/a;

    iget-object v12, v1, Lep/a$d;->t:Ljava/lang/Object;

    check-cast v12, Luu/a;

    :try_start_1
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v4, p1

    move-object v14, v10

    move v10, v2

    move-object v2, v12

    goto/16 :goto_3

    :catchall_1
    move-exception v0

    move-object v2, v12

    goto/16 :goto_6

    :cond_3
    iget v2, v1, Lep/a$d;->z:I

    iget v10, v1, Lep/a$d;->y:I

    iget-object v11, v1, Lep/a$d;->v:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v12, v1, Lep/a$d;->u:Ljava/lang/Object;

    check-cast v12, Lep/a;

    iget-object v13, v1, Lep/a$d;->t:Ljava/lang/Object;

    check-cast v13, Luu/a;

    :try_start_2
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move/from16 v16, v10

    move v10, v2

    move-object v2, v13

    move-object v13, v11

    move/from16 v11, v16

    goto/16 :goto_2

    :catchall_2
    move-exception v0

    move-object v2, v13

    goto/16 :goto_6

    :cond_4
    iget v2, v1, Lep/a$d;->y:I

    iget-object v10, v1, Lep/a$d;->v:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v11, v1, Lep/a$d;->u:Ljava/lang/Object;

    check-cast v11, Lep/a;

    iget-object v12, v1, Lep/a$d;->t:Ljava/lang/Object;

    check-cast v12, Luu/a;

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v16, v10

    move v10, v2

    move-object v2, v12

    move-object/from16 v12, v16

    goto :goto_1

    :cond_5
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object v2, v1, Lep/a$d;->C:Lep/a;

    invoke-static {v2}, Lep/a;->d(Lep/a;)Luu/a;

    move-result-object v2

    iget-object v11, v1, Lep/a$d;->C:Lep/a;

    iget-object v10, v1, Lep/a$d;->D:Ljava/lang/String;

    iput-object v2, v1, Lep/a$d;->t:Ljava/lang/Object;

    iput-object v11, v1, Lep/a$d;->u:Ljava/lang/Object;

    iput-object v10, v1, Lep/a$d;->v:Ljava/lang/Object;

    iput v8, v1, Lep/a$d;->y:I

    iput v7, v1, Lep/a$d;->B:I

    invoke-interface {v2, v9, v1}, Luu/a;->f(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v0, :cond_6

    goto/16 :goto_4

    :cond_6
    move-object v12, v10

    move v10, v8

    :goto_1
    :try_start_3
    invoke-static {v11}, Lep/a;->e(Lep/a;)Lnu/c0;

    move-result-object v13

    invoke-interface {v13}, Lnu/c0;->getValue()Ljava/lang/Object;

    move-result-object v13

    sget-object v14, Lep/a$b$b;->a:Lep/a$b$b;

    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_7

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-interface {v2, v9}, Luu/a;->e(Ljava/lang/Object;)V

    return-object v0

    :cond_7
    :try_start_4
    invoke-static {v11}, Lep/a;->e(Lep/a;)Lnu/c0;

    move-result-object v13

    sget-object v14, Lep/a$b$c;->a:Lep/a$b$c;

    iput-object v2, v1, Lep/a$d;->t:Ljava/lang/Object;

    iput-object v11, v1, Lep/a$d;->u:Ljava/lang/Object;

    iput-object v12, v1, Lep/a$d;->v:Ljava/lang/Object;

    iput v10, v1, Lep/a$d;->y:I

    iput v8, v1, Lep/a$d;->z:I

    iput v6, v1, Lep/a$d;->B:I

    invoke-interface {v13, v14, v1}, Lnu/b0;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v0, :cond_8

    goto/16 :goto_4

    :cond_8
    move-object v13, v12

    move-object v12, v11

    move v11, v10

    move v10, v8

    :goto_2
    invoke-static {v12}, Lep/a;->f(Lep/a;)Lep/f;

    move-result-object v14

    invoke-static {v12}, Lep/a;->a(Lep/a;)Landroid/content/Context;

    move-result-object v15

    invoke-interface {v14, v15}, Lep/f;->create(Landroid/content/Context;)Ltd/c;

    move-result-object v14

    invoke-static {}, Ltd/c$a;->c()Ltd/c$a$a;

    move-result-object v15

    invoke-static {v13}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {v15, v3, v4}, Ltd/c$a$a;->b(J)Ltd/c$a$a;

    move-result-object v3

    invoke-virtual {v3}, Ltd/c$a$a;->a()Ltd/c$a;

    move-result-object v3

    iput-object v2, v1, Lep/a$d;->t:Ljava/lang/Object;

    iput-object v12, v1, Lep/a$d;->u:Ljava/lang/Object;

    iput-object v14, v1, Lep/a$d;->v:Ljava/lang/Object;

    iput-object v3, v1, Lep/a$d;->w:Ljava/lang/Object;

    iput-object v1, v1, Lep/a$d;->x:Ljava/lang/Object;

    iput v11, v1, Lep/a$d;->y:I

    iput v10, v1, Lep/a$d;->z:I

    iput v8, v1, Lep/a$d;->A:I

    iput v5, v1, Lep/a$d;->B:I

    new-instance v4, Lku/p;

    invoke-static {v1}, Lot/b;->c(Lnt/b;)Lnt/b;

    move-result-object v5

    invoke-direct {v4, v5, v7}, Lku/p;-><init>(Lnt/b;I)V

    invoke-virtual {v4}, Lku/p;->H()V

    invoke-interface {v14, v3}, Ltd/c;->a(Ltd/c$a;)Lcom/google/android/gms/tasks/Task;

    move-result-object v5

    new-instance v7, Lep/a$d$a;

    invoke-direct {v7, v4}, Lep/a$d$a;-><init>(Lku/n;)V

    new-instance v13, Lep/b;

    invoke-direct {v13, v7}, Lep/b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v5, v13}, Lcom/google/android/gms/tasks/Task;->g(Lsb/g;)Lcom/google/android/gms/tasks/Task;

    move-result-object v5

    new-instance v7, Lep/a$d$b;

    invoke-direct {v7, v4}, Lep/a$d$b;-><init>(Lku/n;)V

    invoke-virtual {v5, v7}, Lcom/google/android/gms/tasks/Task;->e(Lsb/f;)Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v4}, Lku/p;->A()Ljava/lang/Object;

    move-result-object v4

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_9

    invoke-static {v1}, Lpt/h;->c(Lnt/b;)V

    :cond_9
    if-ne v4, v0, :cond_a

    goto/16 :goto_4

    :cond_a
    move-object v7, v3

    move v5, v11

    move-object v11, v12

    :goto_3
    check-cast v4, Ljt/n;

    invoke-virtual {v4}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-nez v4, :cond_b

    check-cast v3, Ltd/c$c;

    invoke-static {v11}, Lep/a;->e(Lep/a;)Lnu/c0;

    move-result-object v4

    new-instance v6, Lep/a$b$d;

    invoke-direct {v6, v3}, Lep/a$b$d;-><init>(Ltd/c$c;)V

    iput-object v2, v1, Lep/a$d;->t:Ljava/lang/Object;

    invoke-static {v14}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v1, Lep/a$d;->u:Ljava/lang/Object;

    invoke-static {v7}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v1, Lep/a$d;->v:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lep/a$d;->w:Ljava/lang/Object;

    iput-object v9, v1, Lep/a$d;->x:Ljava/lang/Object;

    iput v5, v1, Lep/a$d;->y:I

    iput v10, v1, Lep/a$d;->z:I

    iput v8, v1, Lep/a$d;->A:I

    const/4 v3, 0x4

    iput v3, v1, Lep/a$d;->B:I

    invoke-interface {v4, v6, v1}, Lnu/b0;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_c

    goto :goto_4

    :cond_b
    invoke-static {v11}, Lep/a;->c(Lep/a;)Lnp/e;

    move-result-object v3

    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v12

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "integrity:prepare:"

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v3, v12, v9, v6, v9}, Lnp/e;->b(Lnp/e;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-static {v11}, Lep/a;->e(Lep/a;)Lnu/c0;

    move-result-object v3

    sget-object v6, Lep/a$b$a;->a:Lep/a$b$a;

    iput-object v2, v1, Lep/a$d;->t:Ljava/lang/Object;

    invoke-static {v14}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v1, Lep/a$d;->u:Ljava/lang/Object;

    invoke-static {v7}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v1, Lep/a$d;->v:Ljava/lang/Object;

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v1, Lep/a$d;->w:Ljava/lang/Object;

    iput-object v9, v1, Lep/a$d;->x:Ljava/lang/Object;

    iput v5, v1, Lep/a$d;->y:I

    iput v10, v1, Lep/a$d;->z:I

    iput v8, v1, Lep/a$d;->A:I

    const/4 v4, 0x5

    iput v4, v1, Lep/a$d;->B:I

    invoke-interface {v3, v6, v1}, Lnu/b0;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_c

    :goto_4
    return-object v0

    :cond_c
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-interface {v2, v9}, Luu/a;->e(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :goto_6
    invoke-interface {v2, v9}, Luu/a;->e(Ljava/lang/Object;)V

    throw v0
.end method
