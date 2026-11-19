.class public final Lrv/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrv/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\u00082\n\u0010\u0007\u001a\u00060\u0000R\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00082\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0015R$\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0018\u001a\u0004\u0008\u0010\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u001b8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010!\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lrv/m$a;",
        "Ljava/lang/Runnable;",
        "Lmv/f;",
        "responseCallback",
        "<init>",
        "(Lrv/m;Lmv/f;)V",
        "Lrv/m;",
        "other",
        "",
        "g",
        "(Lrv/m$a;)V",
        "Ljava/util/concurrent/ExecutorService;",
        "executorService",
        "a",
        "(Ljava/util/concurrent/ExecutorService;)V",
        "Ljava/util/concurrent/RejectedExecutionException;",
        "e",
        "b",
        "(Ljava/util/concurrent/RejectedExecutionException;)V",
        "run",
        "()V",
        "Lmv/f;",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "value",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "()Ljava/util/concurrent/atomic/AtomicInteger;",
        "callsPerHost",
        "",
        "f",
        "()Ljava/lang/String;",
        "host",
        "d",
        "()Lrv/m;",
        "call",
        "okhttp"
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
.field public final a:Lmv/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public volatile b:Ljava/util/concurrent/atomic/AtomicInteger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final synthetic c:Lrv/m;


# direct methods
.method public constructor <init>(Lrv/m;Lmv/f;)V
    .locals 1
    .param p1    # Lrv/m;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmv/f;",
            ")V"
        }
    .end annotation

    const-string v0, "responseCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lrv/m$a;->c:Lrv/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lrv/m$a;->a:Lmv/f;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lrv/m$a;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public static synthetic c(Lrv/m$a;Ljava/util/concurrent/RejectedExecutionException;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lrv/m$a;->b(Ljava/util/concurrent/RejectedExecutionException;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/ExecutorService;)V
    .locals 1
    .param p1    # Ljava/util/concurrent/ExecutorService;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "executorService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrv/m$a;->c:Lrv/m;

    invoke-virtual {v0}, Lrv/m;->o()Lmv/d0;

    move-result-object v0

    invoke-virtual {v0}, Lmv/d0;->o()Lmv/q;

    move-result-object v0

    invoke-static {v0}, Lnv/q;->e(Lmv/q;)V

    :try_start_0
    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    invoke-virtual {p0, p1}, Lrv/m$a;->b(Ljava/util/concurrent/RejectedExecutionException;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object p1, p0, Lrv/m$a;->c:Lrv/m;

    invoke-virtual {p1}, Lrv/m;->o()Lmv/d0;

    move-result-object p1

    invoke-virtual {p1}, Lmv/d0;->o()Lmv/q;

    move-result-object p1

    invoke-virtual {p1, p0}, Lmv/q;->e(Lrv/m$a;)V

    return-void

    :goto_0
    iget-object v0, p0, Lrv/m$a;->c:Lrv/m;

    invoke-virtual {v0}, Lrv/m;->o()Lmv/d0;

    move-result-object v0

    invoke-virtual {v0}, Lmv/d0;->o()Lmv/q;

    move-result-object v0

    invoke-virtual {v0, p0}, Lmv/q;->e(Lrv/m$a;)V

    throw p1
.end method

.method public final b(Ljava/util/concurrent/RejectedExecutionException;)V
    .locals 2
    .param p1    # Ljava/util/concurrent/RejectedExecutionException;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "executor rejected"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    iget-object p1, p0, Lrv/m$a;->c:Lrv/m;

    invoke-virtual {p1, v0}, Lrv/m;->B(Ljava/io/IOException;)Ljava/io/IOException;

    iget-object p1, p0, Lrv/m$a;->a:Lmv/f;

    iget-object v1, p0, Lrv/m$a;->c:Lrv/m;

    invoke-interface {p1, v1, v0}, Lmv/f;->onFailure(Lmv/e;Ljava/io/IOException;)V

    return-void
.end method

.method public final d()Lrv/m;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lrv/m$a;->c:Lrv/m;

    return-object v0
.end method

.method public final e()Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lrv/m$a;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lrv/m$a;->c:Lrv/m;

    invoke-virtual {v0}, Lrv/m;->t()Lmv/f0;

    move-result-object v0

    invoke-virtual {v0}, Lmv/f0;->m()Lmv/z;

    move-result-object v0

    invoke-virtual {v0}, Lmv/z;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final g(Lrv/m$a;)V
    .locals 1
    .param p1    # Lrv/m$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lrv/m$a;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, p0, Lrv/m$a;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public run()V
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OkHttp "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lrv/m$a;->c:Lrv/m;

    invoke-virtual {v1}, Lrv/m;->C()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lrv/m$a;->c:Lrv/m;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :try_start_0
    invoke-static {v1}, Lrv/m;->a(Lrv/m;)Lrv/m$c;

    move-result-object v0

    invoke-virtual {v0}, Lew/c;->s()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {v1}, Lrv/m;->v()Lmv/h0;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v4, 0x1

    :try_start_2
    iget-object v5, p0, Lrv/m$a;->a:Lmv/f;

    invoke-interface {v5, v1, v0}, Lmv/f;->onResponse(Lmv/e;Lmv/h0;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {v1}, Lrv/m;->o()Lmv/d0;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Lmv/d0;->o()Lmv/q;

    move-result-object v0

    invoke-virtual {v0, p0}, Lmv/q;->e(Lrv/m$a;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :catchall_1
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_3

    :catchall_2
    move-exception v4

    move-object v7, v4

    move v4, v0

    move-object v0, v7

    :goto_1
    :try_start_4
    invoke-virtual {v1}, Lrv/m;->cancel()V

    if-nez v4, :cond_0

    new-instance v4, Ljava/io/IOException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "canceled due to "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    iget-object v5, p0, Lrv/m$a;->a:Lmv/f;

    invoke-interface {v5, v1, v4}, Lmv/f;->onFailure(Lmv/e;Ljava/io/IOException;)V

    goto :goto_2

    :catchall_3
    move-exception v0

    goto :goto_6

    :cond_0
    :goto_2
    instance-of v4, v0, Ljava/lang/InterruptedException;

    if-eqz v4, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    invoke-virtual {v1}, Lrv/m;->o()Lmv/d0;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    :cond_1
    :try_start_6
    throw v0

    :catch_1
    move-exception v4

    move-object v7, v4

    move v4, v0

    move-object v0, v7

    :goto_3
    if-eqz v4, :cond_2

    sget-object v4, Lokhttp3/internal/platform/c;->a:Lokhttp3/internal/platform/c$a;

    invoke-virtual {v4}, Lokhttp3/internal/platform/c$a;->e()Lokhttp3/internal/platform/c;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Callback failure for "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lrv/m;->b(Lrv/m;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x4

    invoke-virtual {v4, v5, v6, v0}, Lokhttp3/internal/platform/c;->m(Ljava/lang/String;ILjava/lang/Throwable;)V

    goto :goto_4

    :cond_2
    iget-object v4, p0, Lrv/m$a;->a:Lmv/f;

    invoke-interface {v4, v1, v0}, Lmv/f;->onFailure(Lmv/e;Ljava/io/IOException;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :goto_4
    :try_start_7
    invoke-virtual {v1}, Lrv/m;->o()Lmv/d0;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_0

    :goto_5
    invoke-virtual {v2, v3}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    return-void

    :goto_6
    :try_start_8
    invoke-virtual {v1}, Lrv/m;->o()Lmv/d0;

    move-result-object v1

    invoke-virtual {v1}, Lmv/d0;->o()Lmv/q;

    move-result-object v1

    invoke-virtual {v1, p0}, Lmv/q;->e(Lrv/m$a;)V

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :goto_7
    invoke-virtual {v2, v3}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    throw v0
.end method
