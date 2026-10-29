.class public final Landroidx/lifecycle/j0$a$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/j0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        0x0,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1"
    f = "RepeatOnLifecycle.kt"
    l = {
        0xa1
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public final synthetic A:Landroidx/lifecycle/l;

.field public final synthetic B:Landroidx/lifecycle/l$b;

.field public final synthetic C:Lku/p0;

.field public final synthetic D:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
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
.end field

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:I


# direct methods
.method public constructor <init>(Landroidx/lifecycle/l;Landroidx/lifecycle/l$b;Lku/p0;Lkotlin/jvm/functions/Function2;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/l;",
            "Landroidx/lifecycle/l$b;",
            "Lku/p0;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lku/p0;",
            "-",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lnt/b<",
            "-",
            "Landroidx/lifecycle/j0$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/lifecycle/j0$a$a;->A:Landroidx/lifecycle/l;

    iput-object p2, p0, Landroidx/lifecycle/j0$a$a;->B:Landroidx/lifecycle/l$b;

    iput-object p3, p0, Landroidx/lifecycle/j0$a$a;->C:Lku/p0;

    iput-object p4, p0, Landroidx/lifecycle/j0$a$a;->D:Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 6
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

    new-instance v0, Landroidx/lifecycle/j0$a$a;

    iget-object v1, p0, Landroidx/lifecycle/j0$a$a;->A:Landroidx/lifecycle/l;

    iget-object v2, p0, Landroidx/lifecycle/j0$a$a;->B:Landroidx/lifecycle/l$b;

    iget-object v3, p0, Landroidx/lifecycle/j0$a$a;->C:Lku/p0;

    iget-object v4, p0, Landroidx/lifecycle/j0$a$a;->D:Lkotlin/jvm/functions/Function2;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/lifecycle/j0$a$a;-><init>(Landroidx/lifecycle/l;Landroidx/lifecycle/l$b;Lku/p0;Lkotlin/jvm/functions/Function2;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/j0$a$a;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/j0$a$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/j0$a$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/j0$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/lifecycle/j0$a$a;->z:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/j0$a$a;->y:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    iget-object v0, p0, Landroidx/lifecycle/j0$a$a;->x:Ljava/lang/Object;

    check-cast v0, Lku/p0;

    iget-object v0, p0, Landroidx/lifecycle/j0$a$a;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/l;

    iget-object v0, p0, Landroidx/lifecycle/j0$a$a;->v:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/l$b;

    iget-object v0, p0, Landroidx/lifecycle/j0$a$a;->u:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkotlin/jvm/internal/c0;

    iget-object v0, p0, Landroidx/lifecycle/j0$a$a;->t:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/internal/c0;

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/lifecycle/j0$a$a;->A:Landroidx/lifecycle/l;

    invoke-virtual {p1}, Landroidx/lifecycle/l;->b()Landroidx/lifecycle/l$b;

    move-result-object p1

    sget-object v1, Landroidx/lifecycle/l$b;->a:Landroidx/lifecycle/l$b;

    if-ne p1, v1, :cond_2

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_2
    new-instance v6, Lkotlin/jvm/internal/c0;

    invoke-direct {v6}, Lkotlin/jvm/internal/c0;-><init>()V

    new-instance v1, Lkotlin/jvm/internal/c0;

    invoke-direct {v1}, Lkotlin/jvm/internal/c0;-><init>()V

    :try_start_1
    iget-object p1, p0, Landroidx/lifecycle/j0$a$a;->B:Landroidx/lifecycle/l$b;

    iget-object v12, p0, Landroidx/lifecycle/j0$a$a;->A:Landroidx/lifecycle/l;

    iget-object v7, p0, Landroidx/lifecycle/j0$a$a;->C:Lku/p0;

    iget-object v11, p0, Landroidx/lifecycle/j0$a$a;->D:Lkotlin/jvm/functions/Function2;

    iput-object v6, p0, Landroidx/lifecycle/j0$a$a;->t:Ljava/lang/Object;

    iput-object v1, p0, Landroidx/lifecycle/j0$a$a;->u:Ljava/lang/Object;

    iput-object p1, p0, Landroidx/lifecycle/j0$a$a;->v:Ljava/lang/Object;

    iput-object v12, p0, Landroidx/lifecycle/j0$a$a;->w:Ljava/lang/Object;

    iput-object v7, p0, Landroidx/lifecycle/j0$a$a;->x:Ljava/lang/Object;

    iput-object v11, p0, Landroidx/lifecycle/j0$a$a;->y:Ljava/lang/Object;

    iput v3, p0, Landroidx/lifecycle/j0$a$a;->z:I

    new-instance v9, Lku/p;

    invoke-static {p0}, Lot/b;->c(Lnt/b;)Lnt/b;

    move-result-object v4

    invoke-direct {v9, v4, v3}, Lku/p;-><init>(Lnt/b;I)V

    invoke-virtual {v9}, Lku/p;->H()V

    sget-object v4, Landroidx/lifecycle/l$a;->Companion:Landroidx/lifecycle/l$a$a;

    invoke-virtual {v4, p1}, Landroidx/lifecycle/l$a$a;->c(Landroidx/lifecycle/l$b;)Landroidx/lifecycle/l$a;

    move-result-object v5

    invoke-virtual {v4, p1}, Landroidx/lifecycle/l$a$a;->a(Landroidx/lifecycle/l$b;)Landroidx/lifecycle/l$a;

    move-result-object v8

    const/4 p1, 0x0

    invoke-static {p1, v3, v2}, Luu/g;->b(ZILjava/lang/Object;)Luu/a;

    move-result-object v10

    new-instance v4, Landroidx/lifecycle/j0$a$a$a;

    invoke-direct/range {v4 .. v11}, Landroidx/lifecycle/j0$a$a$a;-><init>(Landroidx/lifecycle/l$a;Lkotlin/jvm/internal/c0;Lku/p0;Landroidx/lifecycle/l$a;Lku/n;Luu/a;Lkotlin/jvm/functions/Function2;)V

    iput-object v4, v1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    const-string p1, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Landroidx/lifecycle/p;

    invoke-virtual {v12, v4}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    invoke-virtual {v9}, Lku/p;->A()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v4

    if-ne p1, v4, :cond_3

    invoke-static {p0}, Lpt/h;->c(Lnt/b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object p1, v0

    move-object v4, v6

    goto :goto_2

    :cond_3
    :goto_0
    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    move-object v4, v6

    :goto_1
    iget-object p1, v4, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    check-cast p1, Lku/d2;

    if-eqz p1, :cond_5

    invoke-static {p1, v2, v3, v2}, Lku/d2$a;->a(Lku/d2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_5
    iget-object p1, v1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    check-cast p1, Landroidx/lifecycle/p;

    if-eqz p1, :cond_6

    iget-object v0, p0, Landroidx/lifecycle/j0$a$a;->A:Landroidx/lifecycle/l;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/l;->d(Landroidx/lifecycle/r;)V

    :cond_6
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :goto_2
    iget-object v0, v4, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    check-cast v0, Lku/d2;

    if-eqz v0, :cond_7

    invoke-static {v0, v2, v3, v2}, Lku/d2$a;->a(Lku/d2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_7
    iget-object v0, v1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/p;

    if-eqz v0, :cond_8

    iget-object v1, p0, Landroidx/lifecycle/j0$a$a;->A:Landroidx/lifecycle/l;

    invoke-virtual {v1, v0}, Landroidx/lifecycle/l;->d(Landroidx/lifecycle/r;)V

    :cond_8
    throw p1
.end method
