.class public final Landroidx/lifecycle/j0$a$a$a$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/j0$a$a$a;->g(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1"
    f = "RepeatOnLifecycle.kt"
    l = {
        0xa6,
        0x6e
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "",
        "<anonymous>",
        "(Lav/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public final synthetic w:Lkv/a;

.field public final synthetic x:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkv/a;Lkotlin/jvm/functions/Function2;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkv/a;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lav/p0;",
            "-",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Leu/b<",
            "-",
            "Landroidx/lifecycle/j0$a$a$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/lifecycle/j0$a$a$a$a;->w:Lkv/a;

    iput-object p2, p0, Landroidx/lifecycle/j0$a$a$a$a;->x:Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

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

    new-instance p1, Landroidx/lifecycle/j0$a$a$a$a;

    iget-object v0, p0, Landroidx/lifecycle/j0$a$a$a$a;->w:Lkv/a;

    iget-object v1, p0, Landroidx/lifecycle/j0$a$a$a$a;->x:Lkotlin/jvm/functions/Function2;

    invoke-direct {p1, v0, v1, p2}, Landroidx/lifecycle/j0$a$a$a$a;-><init>(Lkv/a;Lkotlin/jvm/functions/Function2;Leu/b;)V

    return-object p1
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/j0$a$a$a$a;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/j0$a$a$a$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/j0$a$a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/j0$a$a$a$a;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/lifecycle/j0$a$a$a$a;->v:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/j0$a$a$a$a;->t:Ljava/lang/Object;

    check-cast v0, Lkv/a;

    :try_start_0
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Landroidx/lifecycle/j0$a$a$a$a;->u:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function2;

    iget-object v3, p0, Landroidx/lifecycle/j0$a$a$a$a;->t:Ljava/lang/Object;

    check-cast v3, Lkv/a;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object p1, v3

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/lifecycle/j0$a$a$a$a;->w:Lkv/a;

    iget-object v1, p0, Landroidx/lifecycle/j0$a$a$a$a;->x:Lkotlin/jvm/functions/Function2;

    iput-object p1, p0, Landroidx/lifecycle/j0$a$a$a$a;->t:Ljava/lang/Object;

    iput-object v1, p0, Landroidx/lifecycle/j0$a$a$a$a;->u:Ljava/lang/Object;

    iput v3, p0, Landroidx/lifecycle/j0$a$a$a$a;->v:I

    invoke-interface {p1, v4, p0}, Lkv/a;->d(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    :try_start_1
    new-instance v3, Landroidx/lifecycle/j0$a$a$a$a$a;

    invoke-direct {v3, v1, v4}, Landroidx/lifecycle/j0$a$a$a$a$a;-><init>(Lkotlin/jvm/functions/Function2;Leu/b;)V

    iput-object p1, p0, Landroidx/lifecycle/j0$a$a$a$a;->t:Ljava/lang/Object;

    iput-object v4, p0, Landroidx/lifecycle/j0$a$a$a$a;->u:Ljava/lang/Object;

    iput v2, p0, Landroidx/lifecycle/j0$a$a$a$a;->v:I

    invoke-static {v3, p0}, Lav/q0;->g(Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    move-object v0, p1

    :goto_2
    :try_start_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {v0, v4}, Lkv/a;->f(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :catchall_1
    move-exception v0

    move-object v5, v0

    move-object v0, p1

    move-object p1, v5

    :goto_3
    invoke-interface {v0, v4}, Lkv/a;->f(Ljava/lang/Object;)V

    throw p1
.end method
