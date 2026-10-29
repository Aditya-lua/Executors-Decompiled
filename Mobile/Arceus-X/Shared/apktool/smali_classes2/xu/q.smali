.class public Lxu/q;
.super Lxu/s0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0007\u0008\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\u0008\u001a\u00020\u00012\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0001H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0001H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\u0008 \u0010!R\"\u0010\u0002\u001a\u00020\u00018\u0007@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\"\u0010#\u001a\u0004\u0008\"\u0010\u0014\"\u0004\u0008$\u0010\u0004\u00a8\u0006%"
    }
    d2 = {
        "Lxu/q;",
        "Lxu/s0;",
        "delegate",
        "<init>",
        "(Lxu/s0;)V",
        "b",
        "(Lxu/s0;)Lxu/q;",
        "",
        "timeout",
        "Ljava/util/concurrent/TimeUnit;",
        "unit",
        "(JLjava/util/concurrent/TimeUnit;)Lxu/s0;",
        "timeoutNanos",
        "()J",
        "",
        "hasDeadline",
        "()Z",
        "deadlineNanoTime",
        "(J)Lxu/s0;",
        "clearTimeout",
        "()Lxu/s0;",
        "clearDeadline",
        "",
        "throwIfReached",
        "()V",
        "cancel",
        "Ljava/util/concurrent/locks/Condition;",
        "condition",
        "awaitSignal",
        "(Ljava/util/concurrent/locks/Condition;)V",
        "",
        "monitor",
        "waitUntilNotified",
        "(Ljava/lang/Object;)V",
        "a",
        "Lxu/s0;",
        "setDelegate",
        "okio"
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
.field public a:Lxu/s0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lxu/s0;)V
    .locals 1
    .param p1    # Lxu/s0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lxu/s0;-><init>()V

    iput-object p1, p0, Lxu/q;->a:Lxu/s0;

    return-void
.end method


# virtual methods
.method public final a()Lxu/s0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lxu/q;->a:Lxu/s0;

    return-object v0
.end method

.method public awaitSignal(Ljava/util/concurrent/locks/Condition;)V
    .locals 1
    .param p1    # Ljava/util/concurrent/locks/Condition;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "condition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxu/q;->a:Lxu/s0;

    invoke-virtual {v0, p1}, Lxu/s0;->awaitSignal(Ljava/util/concurrent/locks/Condition;)V

    return-void
.end method

.method public final b(Lxu/s0;)Lxu/q;
    .locals 1
    .param p1    # Lxu/s0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lxu/q;->a:Lxu/s0;

    return-object p0
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lxu/q;->a:Lxu/s0;

    invoke-virtual {v0}, Lxu/s0;->cancel()V

    return-void
.end method

.method public clearDeadline()Lxu/s0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lxu/q;->a:Lxu/s0;

    invoke-virtual {v0}, Lxu/s0;->clearDeadline()Lxu/s0;

    move-result-object v0

    return-object v0
.end method

.method public clearTimeout()Lxu/s0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lxu/q;->a:Lxu/s0;

    invoke-virtual {v0}, Lxu/s0;->clearTimeout()Lxu/s0;

    move-result-object v0

    return-object v0
.end method

.method public deadlineNanoTime()J
    .locals 2

    .line 1
    iget-object v0, p0, Lxu/q;->a:Lxu/s0;

    invoke-virtual {v0}, Lxu/s0;->deadlineNanoTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public deadlineNanoTime(J)Lxu/s0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lxu/q;->a:Lxu/s0;

    invoke-virtual {v0, p1, p2}, Lxu/s0;->deadlineNanoTime(J)Lxu/s0;

    move-result-object p1

    return-object p1
.end method

.method public hasDeadline()Z
    .locals 1

    iget-object v0, p0, Lxu/q;->a:Lxu/s0;

    invoke-virtual {v0}, Lxu/s0;->hasDeadline()Z

    move-result v0

    return v0
.end method

.method public throwIfReached()V
    .locals 1

    iget-object v0, p0, Lxu/q;->a:Lxu/s0;

    invoke-virtual {v0}, Lxu/s0;->throwIfReached()V

    return-void
.end method

.method public timeout(JLjava/util/concurrent/TimeUnit;)Lxu/s0;
    .locals 1
    .param p3    # Ljava/util/concurrent/TimeUnit;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "unit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxu/q;->a:Lxu/s0;

    invoke-virtual {v0, p1, p2, p3}, Lxu/s0;->timeout(JLjava/util/concurrent/TimeUnit;)Lxu/s0;

    move-result-object p1

    return-object p1
.end method

.method public timeoutNanos()J
    .locals 2

    iget-object v0, p0, Lxu/q;->a:Lxu/s0;

    invoke-virtual {v0}, Lxu/s0;->timeoutNanos()J

    move-result-wide v0

    return-wide v0
.end method

.method public waitUntilNotified(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "monitor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxu/q;->a:Lxu/s0;

    invoke-virtual {v0, p1}, Lxu/s0;->waitUntilNotified(Ljava/lang/Object;)V

    return-void
.end method
