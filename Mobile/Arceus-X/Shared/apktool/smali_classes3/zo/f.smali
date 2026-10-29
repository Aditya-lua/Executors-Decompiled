.class public final Lzo/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B#\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lzo/f;",
        "",
        "Lyn/d;",
        "collector",
        "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
        "apiHelper",
        "Lku/l0;",
        "dispatcher",
        "<init>",
        "(Lyn/d;Lcom/withpersona/sdk2/inquiry/internal/network/e;Lku/l0;)V",
        "",
        "sessionToken",
        "",
        "a",
        "(Ljava/lang/String;)V",
        "c",
        "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;",
        "b",
        "()V",
        "Lyn/d;",
        "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
        "Lku/l0;",
        "Lku/p0;",
        "d",
        "Lku/p0;",
        "scope",
        "",
        "e",
        "Z",
        "hasSent",
        "inquiry-internal_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lyn/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/withpersona/sdk2/inquiry/internal/network/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lku/l0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lku/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public volatile e:Z


# direct methods
.method public constructor <init>(Lyn/d;Lcom/withpersona/sdk2/inquiry/internal/network/e;Lku/l0;)V
    .locals 1
    .param p1    # Lyn/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/internal/network/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lku/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "collector"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzo/f;->a:Lyn/d;

    iput-object p2, p0, Lzo/f;->b:Lcom/withpersona/sdk2/inquiry/internal/network/e;

    iput-object p3, p0, Lzo/f;->c:Lku/l0;

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {p1, p2, p1}, Lku/z2;->b(Lku/d2;ILjava/lang/Object;)Lku/a0;

    move-result-object p1

    invoke-virtual {p3, p1}, Lkotlin/coroutines/a;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    invoke-static {p1}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object p1

    iput-object p1, p0, Lzo/f;->d:Lku/p0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sessionToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lzo/f;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lzo/f;->e:Z

    iget-object v1, p0, Lzo/f;->d:Lku/p0;

    new-instance v4, Lzo/f$a;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lzo/f$a;-><init>(Lzo/f;Ljava/lang/String;Lnt/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Lzo/f;->d:Lku/p0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lku/q0;->f(Lku/p0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method

.method public final c(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p2, Lzo/f$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lzo/f$b;

    iget v1, v0, Lzo/f$b;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lzo/f$b;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lzo/f$b;

    invoke-direct {v0, p0, p2}, Lzo/f$b;-><init>(Lzo/f;Lnt/b;)V

    :goto_0
    iget-object p2, v0, Lzo/f$b;->v:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lzo/f$b;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lzo/f$b;->u:Ljava/lang/Object;

    check-cast p1, Lyn/c;

    iget-object p1, v0, Lzo/f$b;->t:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lzo/f;->a:Lyn/d;

    invoke-interface {p2}, Lyn/d;->a()Lyn/c;

    move-result-object p2

    :try_start_1
    iget-object v2, p0, Lzo/f;->b:Lcom/withpersona/sdk2/inquiry/internal/network/e;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lzo/f$b;->t:Ljava/lang/Object;

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lzo/f$b;->u:Ljava/lang/Object;

    iput v3, v0, Lzo/f$b;->x:I

    invoke-virtual {v2, p1, p2, v0}, Lcom/withpersona/sdk2/inquiry/internal/network/e;->s(Ljava/lang/String;Lyn/c;Lnt/b;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lcom/withpersona/sdk2/inquiry/internal/network/i;

    instance-of p1, p2, Lcom/withpersona/sdk2/inquiry/internal/network/i$b;

    if-nez p1, :cond_5

    instance-of p1, p2, Lcom/withpersona/sdk2/inquiry/internal/network/i$a;

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :cond_5
    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :goto_3
    throw p1
.end method
