.class public Lew/c;
.super Lew/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lew/c$a;,
        Lew/c$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u000f\u0008\u0016\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\r\u001a\u00020\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u000f\u0010\u0003J\u0019\u0010\u0012\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014\u00a2\u0006\u0004\u0008\u0014\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00158\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0017R$\u0010 \u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t8\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006$"
    }
    d2 = {
        "Lew/c;",
        "Lew/m0;",
        "<init>",
        "()V",
        "",
        "s",
        "",
        "t",
        "()Z",
        "",
        "now",
        "w",
        "(J)J",
        "x",
        "(J)V",
        "z",
        "Ljava/io/IOException;",
        "cause",
        "p",
        "(Ljava/io/IOException;)Ljava/io/IOException;",
        "v",
        "",
        "f",
        "I",
        "state",
        "g",
        "index",
        "value",
        "h",
        "J",
        "u",
        "()J",
        "timeoutAt",
        "i",
        "b",
        "a",
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


# static fields
.field public static final i:Lew/c$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final j:Lew/d0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static k:Lew/c;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public static final l:Ljava/util/concurrent/locks/ReentrantLock;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final m:Ljava/util/concurrent/locks/Condition;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final n:J

.field public static final o:J


# instance fields
.field public f:I

.field public g:I

.field public h:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lew/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lew/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lew/c;->i:Lew/c$a;

    new-instance v0, Lew/d0;

    invoke-direct {v0}, Lew/d0;-><init>()V

    sput-object v0, Lew/c;->j:Lew/d0;

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lew/c;->l:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    const-string v1, "newCondition(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lew/c;->m:Ljava/util/concurrent/locks/Condition;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3c

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lew/c;->n:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Lew/c;->o:J

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lew/m0;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lew/c;->g:I

    return-void
.end method

.method public static final synthetic i()Lew/c$a;
    .locals 1

    sget-object v0, Lew/c;->i:Lew/c$a;

    return-object v0
.end method

.method public static final synthetic j()Ljava/util/concurrent/locks/Condition;
    .locals 1

    sget-object v0, Lew/c;->m:Ljava/util/concurrent/locks/Condition;

    return-object v0
.end method

.method public static final synthetic k()J
    .locals 2

    sget-wide v0, Lew/c;->n:J

    return-wide v0
.end method

.method public static final synthetic l()J
    .locals 2

    sget-wide v0, Lew/c;->o:J

    return-wide v0
.end method

.method public static final synthetic m()Lew/c;
    .locals 1

    sget-object v0, Lew/c;->k:Lew/c;

    return-object v0
.end method

.method public static final synthetic n()Ljava/util/concurrent/locks/ReentrantLock;
    .locals 1

    sget-object v0, Lew/c;->l:Ljava/util/concurrent/locks/ReentrantLock;

    return-object v0
.end method

.method public static final synthetic o()Lew/d0;
    .locals 1

    sget-object v0, Lew/c;->j:Lew/d0;

    return-object v0
.end method

.method public static final synthetic q(Lew/c;)V
    .locals 0

    sput-object p0, Lew/c;->k:Lew/c;

    return-void
.end method

.method public static final synthetic r(Lew/c;I)V
    .locals 0

    iput p1, p0, Lew/c;->f:I

    return-void
.end method

.method public static synthetic y(Lew/c;JILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide p1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lew/c;->x(J)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: setTimeoutAt"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final p(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 0
    .param p1    # Ljava/io/IOException;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0, p1}, Lew/c;->v(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method public final s()V
    .locals 5

    invoke-virtual {p0}, Lew/m0;->h()J

    move-result-wide v0

    invoke-virtual {p0}, Lew/m0;->e()Z

    move-result v2

    const-wide/16 v3, 0x0

    cmp-long v0, v0, v3

    if-nez v0, :cond_0

    if-nez v2, :cond_0

    return-void

    :cond_0
    sget-object v0, Lew/c;->l:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget v1, p0, Lew/c;->f:I

    if-nez v1, :cond_1

    const/4 v1, 0x1

    iput v1, p0, Lew/c;->f:I

    sget-object v1, Lew/c;->i:Lew/c$a;

    invoke-static {v1, p0}, Lew/c$a;->a(Lew/c$a;Lew/c;)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_1
    :try_start_1
    const-string v1, "Unbalanced enter/exit"

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method public final t()Z
    .locals 5

    sget-object v0, Lew/c;->l:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget v1, p0, Lew/c;->f:I

    const/4 v2, 0x0

    iput v2, p0, Lew/c;->f:I

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    sget-object v1, Lew/c;->j:Lew/d0;

    invoke-virtual {v1, p0}, Lew/d0;->e(Lew/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v2

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    if-ne v1, v4, :cond_1

    move v2, v3

    :cond_1
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v2

    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method public final u()J
    .locals 2

    iget-wide v0, p0, Lew/c;->h:J

    return-wide v0
.end method

.method public v(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2
    .param p1    # Ljava/io/IOException;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_0
    return-object v0
.end method

.method public final w(J)J
    .locals 2

    iget-wide v0, p0, Lew/c;->h:J

    sub-long/2addr v0, p1

    return-wide v0
.end method

.method public final x(J)V
    .locals 7

    invoke-virtual {p0}, Lew/m0;->h()J

    move-result-wide v0

    invoke-virtual {p0}, Lew/m0;->e()Z

    move-result v2

    invoke-virtual {p0}, Lew/m0;->h()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Lew/m0;->e()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Lew/m0;->c()J

    move-result-wide v2

    sub-long/2addr v2, p1

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    add-long/2addr p1, v0

    iput-wide p1, p0, Lew/c;->h:J

    return-void

    :cond_0
    cmp-long v3, v0, v5

    if-eqz v3, :cond_1

    add-long/2addr p1, v0

    iput-wide p1, p0, Lew/c;->h:J

    return-void

    :cond_1
    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lew/m0;->c()J

    move-result-wide p1

    iput-wide p1, p0, Lew/c;->h:J

    return-void

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public z()V
    .locals 0

    return-void
.end method
