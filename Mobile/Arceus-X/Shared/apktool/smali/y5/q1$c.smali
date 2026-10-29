.class public final Ly5/q1$c;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly5/q1;->r()Lne/x;
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
        "Ljava/lang/Boolean;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "androidx.work.impl.WorkerWrapper$launch$1"
    f = "WorkerWrapper.kt"
    l = {
        0x62
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Ly5/q1;


# direct methods
.method public constructor <init>(Ly5/q1;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly5/q1;",
            "Lnt/b<",
            "-",
            "Ly5/q1$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ly5/q1$c;->u:Ly5/q1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method

.method public static synthetic q(Ly5/q1$b;Ly5/q1;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Ly5/q1$c;->r(Ly5/q1$b;Ly5/q1;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final r(Ly5/q1$b;Ly5/q1;)Ljava/lang/Boolean;
    .locals 1

    instance-of v0, p0, Ly5/q1$b$b;

    if-eqz v0, :cond_0

    check-cast p0, Ly5/q1$b$b;

    invoke-virtual {p0}, Ly5/q1$b$b;->a()Landroidx/work/c$a;

    move-result-object p0

    invoke-static {p1, p0}, Ly5/q1;->i(Ly5/q1;Landroidx/work/c$a;)Z

    move-result p0

    goto :goto_0

    :cond_0
    instance-of v0, p0, Ly5/q1$b$a;

    if-eqz v0, :cond_1

    check-cast p0, Ly5/q1$b$a;

    invoke-virtual {p0}, Ly5/q1$b$a;->a()Landroidx/work/c$a;

    move-result-object p0

    invoke-static {p1, p0}, Ly5/q1;->h(Ly5/q1;Landroidx/work/c$a;)Z

    move-result p0

    goto :goto_0

    :cond_1
    instance-of v0, p0, Ly5/q1$b$c;

    if-eqz v0, :cond_2

    check-cast p0, Ly5/q1$b$c;

    invoke-virtual {p0}, Ly5/q1$b$c;->a()I

    move-result p0

    invoke-static {p1, p0}, Ly5/q1;->j(Ly5/q1;I)Z

    move-result p0

    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 1
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

    new-instance p1, Ly5/q1$c;

    iget-object v0, p0, Ly5/q1$c;->u:Ly5/q1;

    invoke-direct {p1, v0, p2}, Ly5/q1$c;-><init>(Ly5/q1;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Ly5/q1$c;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Ly5/q1$c;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Ly5/q1$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Ly5/q1$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ly5/q1$c;->t:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ly5/h1; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Ly5/q1$c;->u:Ly5/q1;

    invoke-static {p1}, Ly5/q1;->g(Ly5/q1;)Lku/a0;

    move-result-object p1

    new-instance v1, Ly5/q1$c$a;

    iget-object v4, p0, Ly5/q1$c;->u:Ly5/q1;

    invoke-direct {v1, v4, v3}, Ly5/q1$c$a;-><init>(Ly5/q1;Lnt/b;)V

    iput v2, p0, Ly5/q1$c;->t:I

    invoke-static {p1, v1, p0}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ly5/q1$b;
    :try_end_1
    .catch Ly5/h1; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :goto_1
    invoke-static {}, Ly5/s1;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v1

    const-string v4, "Unexpected error in WorkerWrapper"

    invoke-virtual {v1, v0, v4, p1}, Lx5/w;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p1, Ly5/q1$b$a;

    invoke-direct {p1, v3, v2, v3}, Ly5/q1$b$a;-><init>(Landroidx/work/c$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :catch_1
    new-instance p1, Ly5/q1$b$a;

    invoke-direct {p1, v3, v2, v3}, Ly5/q1$b$a;-><init>(Landroidx/work/c$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :goto_2
    new-instance v0, Ly5/q1$b$c;

    invoke-virtual {p1}, Ly5/h1;->a()I

    move-result p1

    invoke-direct {v0, p1}, Ly5/q1$b$c;-><init>(I)V

    move-object p1, v0

    :goto_3
    iget-object v0, p0, Ly5/q1$c;->u:Ly5/q1;

    invoke-static {v0}, Ly5/q1;->e(Ly5/q1;)Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    iget-object v1, p0, Ly5/q1$c;->u:Ly5/q1;

    new-instance v2, Ly5/r1;

    invoke-direct {v2, p1, v1}, Ly5/r1;-><init>(Ly5/q1$b;Ly5/q1;)V

    invoke-virtual {v0, v2}, Lx4/u;->P(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "runInTransaction(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
