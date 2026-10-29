.class public interface abstract Lh6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a()Ljava/util/concurrent/Executor;
.end method

.method public b()Lku/l0;
    .locals 1

    invoke-interface {p0}, Lh6/b;->c()Lh6/a;

    move-result-object v0

    invoke-static {v0}, Lku/v1;->b(Ljava/util/concurrent/Executor;)Lku/l0;

    move-result-object v0

    return-object v0
.end method

.method public abstract c()Lh6/a;
.end method

.method public d(Ljava/lang/Runnable;)V
    .locals 1

    invoke-interface {p0}, Lh6/b;->c()Lh6/a;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
