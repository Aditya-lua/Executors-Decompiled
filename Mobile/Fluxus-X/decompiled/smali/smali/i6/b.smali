.class public interface abstract Li6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a()Ljava/util/concurrent/Executor;
.end method

.method public b()Lav/l0;
    .locals 1

    invoke-interface {p0}, Li6/b;->c()Li6/a;

    move-result-object v0

    invoke-static {v0}, Lav/v1;->b(Ljava/util/concurrent/Executor;)Lav/l0;

    move-result-object v0

    return-object v0
.end method

.method public abstract c()Li6/a;
.end method

.method public d(Ljava/lang/Runnable;)V
    .locals 1

    invoke-interface {p0}, Li6/b;->c()Li6/a;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
