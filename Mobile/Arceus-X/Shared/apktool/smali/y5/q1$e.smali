.class public final Ly5/q1$e;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly5/q1;->x(Lnt/b;)Ljava/lang/Object;
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
        "Landroidx/work/c$a;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lku/p0;",
        "Landroidx/work/c$a;",
        "kotlin.jvm.PlatformType",
        "<anonymous>",
        "(Lku/p0;)Landroidx/work/c$a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "androidx.work.impl.WorkerWrapper$runWorker$result$1"
    f = "WorkerWrapper.kt"
    l = {
        0x129,
        0x134
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Ly5/q1;

.field public final synthetic v:Landroidx/work/c;

.field public final synthetic w:Lx5/l;


# direct methods
.method public constructor <init>(Ly5/q1;Landroidx/work/c;Lx5/l;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly5/q1;",
            "Landroidx/work/c;",
            "Lx5/l;",
            "Lnt/b<",
            "-",
            "Ly5/q1$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ly5/q1$e;->u:Ly5/q1;

    iput-object p2, p0, Ly5/q1$e;->v:Landroidx/work/c;

    iput-object p3, p0, Ly5/q1$e;->w:Lx5/l;

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

    new-instance p1, Ly5/q1$e;

    iget-object v0, p0, Ly5/q1$e;->u:Ly5/q1;

    iget-object v1, p0, Ly5/q1$e;->v:Landroidx/work/c;

    iget-object v2, p0, Ly5/q1$e;->w:Lx5/l;

    invoke-direct {p1, v0, v1, v2, p2}, Ly5/q1$e;-><init>(Ly5/q1;Landroidx/work/c;Lx5/l;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Ly5/q1$e;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
            "Landroidx/work/c$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Ly5/q1$e;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Ly5/q1$e;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Ly5/q1$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ly5/q1$e;->t:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object v9, p0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ly5/q1$e;->u:Ly5/q1;

    invoke-static {p1}, Ly5/q1;->d(Ly5/q1;)Landroid/content/Context;

    move-result-object v4

    iget-object p1, p0, Ly5/q1$e;->u:Ly5/q1;

    invoke-virtual {p1}, Ly5/q1;->n()Lf6/j0;

    move-result-object v5

    iget-object v6, p0, Ly5/q1$e;->v:Landroidx/work/c;

    iget-object v7, p0, Ly5/q1$e;->w:Lx5/l;

    iget-object p1, p0, Ly5/q1$e;->u:Ly5/q1;

    invoke-static {p1}, Ly5/q1;->f(Ly5/q1;)Lh6/b;

    move-result-object v8

    iput v3, p0, Ly5/q1$e;->t:I

    move-object v9, p0

    invoke-static/range {v4 .. v9}, Lg6/c0;->b(Landroid/content/Context;Lf6/j0;Landroidx/work/c;Lx5/l;Lh6/b;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    invoke-static {}, Ly5/s1;->a()Ljava/lang/String;

    move-result-object p1

    iget-object v1, v9, Ly5/q1$e;->u:Ly5/q1;

    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Starting work for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ly5/q1;->n()Lf6/j0;

    move-result-object v1

    iget-object v1, v1, Lf6/j0;->c:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, p1, v1}, Lx5/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, v9, Ly5/q1$e;->v:Landroidx/work/c;

    invoke-virtual {p1}, Landroidx/work/c;->startWork()Lne/x;

    move-result-object p1

    const-string v1, "startWork(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v9, Ly5/q1$e;->v:Landroidx/work/c;

    iput v2, v9, Ly5/q1$e;->t:I

    invoke-static {p1, v1, p0}, Ly5/s1;->d(Lne/x;Landroidx/work/c;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    return-object p1
.end method
