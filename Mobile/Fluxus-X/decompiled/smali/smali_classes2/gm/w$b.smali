.class public final Lgm/w$b;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgm/w;->c(Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lav/p0;",
        "Leu/b<",
        "-",
        "Ljava/lang/Integer;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2"
    f = "Replicator.kt"
    l = {
        0x29,
        0x52
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "",
        "<anonymous>",
        "(Lav/p0;)I"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public w:I

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lgm/w;


# direct methods
.method public constructor <init>(Lgm/w;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgm/w;",
            "Leu/b<",
            "-",
            "Lgm/w$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lgm/w$b;->y:Lgm/w;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Leu/b<",
            "*>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lgm/w$b;

    iget-object v1, p0, Lgm/w$b;->y:Lgm/w;

    invoke-direct {v0, v1, p2}, Lgm/w$b;-><init>(Lgm/w;Leu/b;)V

    iput-object p1, v0, Lgm/w$b;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lgm/w$b;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lgm/w$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lgm/w$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lgm/w$b;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lgm/w$b;->x:Ljava/lang/Object;

    check-cast v0, Lav/p0;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lgm/w$b;->w:I

    const-string v3, "rbx.achievement.replicator"

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_0

    iget-object v0, p0, Lgm/w$b;->u:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, p0, Lgm/w$b;->t:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    const-string p1, "Starting local to remote achievement sync"

    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lgm/w$b;->y:Lgm/w;

    invoke-static {p1}, Lgm/w;->a(Lgm/w;)Lgm/b;

    move-result-object p1

    iput-object v0, p0, Lgm/w$b;->x:Ljava/lang/Object;

    iput v5, p0, Lgm/w$b;->w:I

    invoke-interface {p1, p0}, Lgm/b;->c(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto/16 :goto_5

    :cond_3
    :goto_0
    check-cast p1, Ljava/util/List;

    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_4

    const/4 v6, 0x0

    goto :goto_2

    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lgm/a;

    invoke-virtual {v7}, Lgm/a;->b()I

    move-result v7

    invoke-static {v7}, Lgu/b;->c(I)Ljava/lang/Integer;

    move-result-object v7

    :cond_5
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lgm/a;

    invoke-virtual {v8}, Lgm/a;->b()I

    move-result v8

    invoke-static {v8}, Lgu/b;->c(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v9

    if-gez v9, :cond_5

    move-object v7, v8

    goto :goto_1

    :cond_6
    move-object v6, v7

    :goto_2
    const/4 v7, 0x0

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    goto :goto_3

    :cond_7
    move v6, v7

    :goto_3
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_8
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lgm/a;

    invoke-virtual {v10}, Lgm/a;->c()Ljava/time/Instant;

    move-result-object v10

    if-nez v10, :cond_8

    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    invoke-static {v8}, Ldv/j;->x(Ljava/lang/Object;)Ldv/h;

    move-result-object v2

    iget-object v9, p0, Lgm/w$b;->y:Lgm/w;

    invoke-static {v9}, Lgm/w;->a(Lgm/w;)Lgm/b;

    move-result-object v9

    invoke-interface {v9, v6}, Lgm/b;->b(I)Ldv/h;

    move-result-object v9

    invoke-static {v9}, Ldv/j;->k(Ldv/h;)Ldv/h;

    move-result-object v9

    new-array v10, v4, [Ldv/h;

    aput-object v2, v10, v7

    aput-object v9, v10, v5

    invoke-static {v10}, Ldv/j;->C([Ldv/h;)Ldv/h;

    move-result-object v2

    new-instance v5, Lgm/w$b$b;

    invoke-direct {v5, v2}, Lgm/w$b$b;-><init>(Ldv/h;)V

    iget-object v2, p0, Lgm/w$b;->y:Lgm/w;

    new-instance v7, Lgm/w$b$c;

    invoke-direct {v7, v5, v0, v2}, Lgm/w$b$c;-><init>(Ldv/h;Lav/p0;Lgm/w;)V

    iget-object v2, p0, Lgm/w$b;->y:Lgm/w;

    new-instance v5, Lgm/w$b$d;

    invoke-direct {v5, v7, v0, v2}, Lgm/w$b$d;-><init>(Ldv/h;Lav/p0;Lgm/w;)V

    invoke-static {v0}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lgm/w$b;->x:Ljava/lang/Object;

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lgm/w$b;->t:Ljava/lang/Object;

    invoke-static {v8}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lgm/w$b;->u:Ljava/lang/Object;

    iput v6, p0, Lgm/w$b;->v:I

    iput v4, p0, Lgm/w$b;->w:I

    invoke-static {v5, p0}, Ldv/j;->i(Ldv/h;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_5
    return-object v1

    :cond_a
    :goto_6
    const-string p1, "Finished local to remote achievement sync"

    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Lgu/b;->c(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
