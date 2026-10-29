.class public final Lnu/s0;
.super Lou/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lou/d<",
        "Lnu/q0<",
        "*>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J)\u0010\u000c\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u0002H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R(\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014`\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lnu/s0;",
        "Lou/d;",
        "Lnu/q0;",
        "<init>",
        "()V",
        "flow",
        "",
        "d",
        "(Lnu/q0;)Z",
        "",
        "Lnt/b;",
        "",
        "f",
        "(Lnu/q0;)[Lnt/b;",
        "g",
        "h",
        "()Z",
        "e",
        "(Lnt/b;)Ljava/lang/Object;",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "",
        "Lkotlinx/coroutines/internal/WorkaroundAtomicReference;",
        "a",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "_state",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lou/d;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lnu/s0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static final synthetic c(Lnu/s0;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    iget-object p0, p0, Lnu/s0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lnu/q0;

    invoke-virtual {p0, p1}, Lnu/s0;->d(Lnu/q0;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)[Lnt/b;
    .locals 0

    check-cast p1, Lnu/q0;

    invoke-virtual {p0, p1}, Lnu/s0;->f(Lnu/q0;)[Lnt/b;

    move-result-object p1

    return-object p1
.end method

.method public d(Lnu/q0;)Z
    .locals 1
    .param p1    # Lnu/q0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/q0<",
            "*>;)Z"
        }
    .end annotation

    iget-object p1, p0, Lnu/s0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p1}, Lqu/d;->a(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object p1, p0, Lnu/s0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Lnu/r0;->b()Lqu/e0;

    move-result-object v0

    invoke-static {p1, v0}, Lqu/d;->b(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final e(Lnt/b;)Ljava/lang/Object;
    .locals 3
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    new-instance v0, Lku/p;

    invoke-static {p1}, Lot/b;->c(Lnt/b;)Lnt/b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lku/p;-><init>(Lnt/b;I)V

    invoke-virtual {v0}, Lku/p;->H()V

    invoke-static {p0}, Lnu/s0;->c(Lnu/s0;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v1

    invoke-static {}, Lnu/r0;->b()Lqu/e0;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lp1/t;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Ljt/n;->b:Ljt/n$a;

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-static {v1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lnt/b;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {v0}, Lku/p;->A()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-static {p1}, Lpt/h;->c(Lnt/b;)V

    :cond_1
    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne v0, p1, :cond_2

    return-object v0

    :cond_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public f(Lnu/q0;)[Lnt/b;
    .locals 1
    .param p1    # Lnu/q0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/q0<",
            "*>;)[",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object p1, p0, Lnu/s0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lqu/d;->b(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;)V

    sget-object p1, Lou/c;->a:[Lnt/b;

    return-object p1
.end method

.method public final g()V
    .locals 4

    iget-object v0, p0, Lnu/s0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_0
    invoke-static {v0}, Lqu/d;->a(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Lnu/r0;->c()Lqu/e0;

    move-result-object v2

    if-ne v1, v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {}, Lnu/r0;->b()Lqu/e0;

    move-result-object v2

    if-ne v1, v2, :cond_3

    iget-object v2, p0, Lnu/s0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Lnu/r0;->c()Lqu/e0;

    move-result-object v3

    invoke-static {v2, v1, v3}, Lp1/t;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    return-void

    :cond_3
    iget-object v2, p0, Lnu/s0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Lnu/r0;->b()Lqu/e0;

    move-result-object v3

    invoke-static {v2, v1, v3}, Lp1/t;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    check-cast v1, Lku/p;

    sget-object v0, Ljt/n;->b:Ljt/n$a;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0}, Lnt/b;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public final h()Z
    .locals 2

    iget-object v0, p0, Lnu/s0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Lnu/r0;->b()Lqu/e0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {}, Lnu/r0;->c()Lqu/e0;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
