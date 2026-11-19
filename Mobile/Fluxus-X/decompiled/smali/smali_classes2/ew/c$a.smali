.class public final Lew/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lew/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0008\u0008\u0082\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nR\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0006\"\u0004\u0008\u0013\u0010\nR\u0017\u0010\u0015\u001a\u00020\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010#R\u0014\u0010%\u001a\u00020\u001e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008%\u0010 R\u0014\u0010&\u001a\u00020\u001e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008&\u0010 R\u0014\u0010\'\u001a\u00020\u001e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\'\u0010 R\u0014\u0010(\u001a\u00020\u001e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008(\u0010 \u00a8\u0006)"
    }
    d2 = {
        "Lew/c$a;",
        "",
        "<init>",
        "()V",
        "Lew/c;",
        "b",
        "()Lew/c;",
        "node",
        "",
        "g",
        "(Lew/c;)V",
        "Lew/d0;",
        "queue",
        "Lew/d0;",
        "f",
        "()Lew/d0;",
        "idleSentinel",
        "Lew/c;",
        "d",
        "h",
        "Ljava/util/concurrent/locks/ReentrantLock;",
        "lock",
        "Ljava/util/concurrent/locks/ReentrantLock;",
        "e",
        "()Ljava/util/concurrent/locks/ReentrantLock;",
        "Ljava/util/concurrent/locks/Condition;",
        "condition",
        "Ljava/util/concurrent/locks/Condition;",
        "c",
        "()Ljava/util/concurrent/locks/Condition;",
        "",
        "TIMEOUT_WRITE_SIZE",
        "I",
        "",
        "IDLE_TIMEOUT_MILLIS",
        "J",
        "IDLE_TIMEOUT_NANOS",
        "STATE_IDLE",
        "STATE_IN_QUEUE",
        "STATE_TIMED_OUT",
        "STATE_CANCELED",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lew/c$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lew/c$a;Lew/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lew/c$a;->g(Lew/c;)V

    return-void
.end method


# virtual methods
.method public final b()Lew/c;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0}, Lew/c$a;->f()Lew/d0;

    move-result-object v0

    invoke-virtual {v0}, Lew/d0;->b()Lew/c;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    invoke-virtual {p0}, Lew/c$a;->c()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    invoke-static {}, Lew/c;->k()J

    move-result-wide v4

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v4, v5, v6}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z

    invoke-virtual {p0}, Lew/c$a;->f()Lew/d0;

    move-result-object v0

    invoke-virtual {v0}, Lew/d0;->b()Lew/c;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sub-long/2addr v4, v2

    invoke-static {}, Lew/c;->l()J

    move-result-wide v2

    cmp-long v0, v4, v2

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Lew/c$a;->d()Lew/c;

    move-result-object v0

    return-object v0

    :cond_0
    return-object v1

    :cond_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lew/c;->w(J)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-lez v4, :cond_2

    invoke-virtual {p0}, Lew/c$a;->c()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v2, v3, v4}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z

    return-object v1

    :cond_2
    invoke-virtual {p0}, Lew/c$a;->f()Lew/d0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lew/d0;->e(Lew/c;)V

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lew/c;->r(Lew/c;I)V

    return-object v0
.end method

.method public final c()Ljava/util/concurrent/locks/Condition;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {}, Lew/c;->j()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lew/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lew/c;->m()Lew/c;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/util/concurrent/locks/ReentrantLock;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {}, Lew/c;->n()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lew/d0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {}, Lew/c;->o()Lew/d0;

    move-result-object v0

    return-object v0
.end method

.method public final g(Lew/c;)V
    .locals 4

    invoke-virtual {p0}, Lew/c$a;->d()Lew/c;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lew/c;

    invoke-direct {v0}, Lew/c;-><init>()V

    invoke-virtual {p0, v0}, Lew/c$a;->h(Lew/c;)V

    new-instance v0, Lew/c$b;

    invoke-direct {v0}, Lew/c$b;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_0
    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p1, v0, v1, v3, v2}, Lew/c;->y(Lew/c;JILjava/lang/Object;)V

    invoke-virtual {p0}, Lew/c$a;->f()Lew/d0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lew/d0;->a(Lew/c;)V

    iget p1, p1, Lew/c;->g:I

    if-ne p1, v3, :cond_1

    invoke-virtual {p0}, Lew/c$a;->c()Ljava/util/concurrent/locks/Condition;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Condition;->signal()V

    :cond_1
    return-void
.end method

.method public final h(Lew/c;)V
    .locals 0
    .param p1    # Lew/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-static {p1}, Lew/c;->q(Lew/c;)V

    return-void
.end method
