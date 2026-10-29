.class public Lqu/a0;
.super Lku/a;
.source "SourceFile"

# interfaces
.implements Lpt/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lku/a<",
        "TT;>;",
        "Lpt/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0010\u0018\u0000*\u0006\u0008\u0000\u0010\u0001 \u00002\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0014\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\r2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0014\u00a2\u0006\u0004\u0008\u0012\u0010\u000fR\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00078\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0019\u0010\u0017\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lqu/a0;",
        "T",
        "Lku/a;",
        "Lpt/e;",
        "Lkotlinx/coroutines/internal/CoroutineStackFrame;",
        "Lkotlin/coroutines/CoroutineContext;",
        "context",
        "Lnt/b;",
        "uCont",
        "<init>",
        "(Lkotlin/coroutines/CoroutineContext;Lnt/b;)V",
        "",
        "state",
        "",
        "P",
        "(Ljava/lang/Object;)V",
        "X0",
        "()V",
        "T0",
        "d",
        "Lnt/b;",
        "getCallerFrame",
        "()Lpt/e;",
        "callerFrame",
        "",
        "s0",
        "()Z",
        "isScopedCoroutine",
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
.field public final d:Lnt/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnt/b<",
            "TT;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/coroutines/CoroutineContext;Lnt/b;)V
    .locals 1
    .param p1    # Lkotlin/coroutines/CoroutineContext;
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
            "Lkotlin/coroutines/CoroutineContext;",
            "Lnt/b<",
            "-TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, v0}, Lku/a;-><init>(Lkotlin/coroutines/CoroutineContext;ZZ)V

    iput-object p2, p0, Lqu/a0;->d:Lnt/b;

    return-void
.end method


# virtual methods
.method public P(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lqu/a0;->d:Lnt/b;

    invoke-static {v0}, Lot/b;->c(Lnt/b;)Lnt/b;

    move-result-object v0

    iget-object v1, p0, Lqu/a0;->d:Lnt/b;

    invoke-static {p1, v1}, Lku/e0;->a(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Lqu/j;->b(Lnt/b;Ljava/lang/Object;)V

    return-void
.end method

.method public T0(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lqu/a0;->d:Lnt/b;

    invoke-static {p1, v0}, Lku/e0;->a(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lnt/b;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public X0()V
    .locals 0

    return-void
.end method

.method public final getCallerFrame()Lpt/e;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lqu/a0;->d:Lnt/b;

    instance-of v1, v0, Lpt/e;

    if-eqz v1, :cond_0

    check-cast v0, Lpt/e;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final s0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
