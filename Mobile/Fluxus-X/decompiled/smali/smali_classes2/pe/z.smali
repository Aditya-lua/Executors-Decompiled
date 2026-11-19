.class public interface abstract Lpe/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/ExecutorService;
.implements Ljava/lang/AutoCloseable;


# virtual methods
.method public synthetic close()V
    .locals 0

    invoke-static {p0}, Le/k0;->a(Ljava/util/concurrent/ExecutorService;)V

    return-void
.end method

.method public bridge synthetic submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lpe/z;->submit(Ljava/lang/Runnable;)Lpe/x;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic submit(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;
    .locals 0

    .line 2
    invoke-interface {p0, p1, p2}, Lpe/z;->submit(Ljava/lang/Runnable;Ljava/lang/Object;)Lpe/x;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    .locals 0

    .line 3
    invoke-interface {p0, p1}, Lpe/z;->submit(Ljava/util/concurrent/Callable;)Lpe/x;

    move-result-object p1

    return-object p1
.end method

.method public abstract submit(Ljava/lang/Runnable;)Lpe/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            ")",
            "Lpe/x<",
            "*>;"
        }
    .end annotation
.end method

.method public abstract submit(Ljava/lang/Runnable;Ljava/lang/Object;)Lpe/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Runnable;",
            "TT;)",
            "Lpe/x<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract submit(Ljava/util/concurrent/Callable;)Lpe/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)",
            "Lpe/x<",
            "TT;>;"
        }
    .end annotation
.end method
