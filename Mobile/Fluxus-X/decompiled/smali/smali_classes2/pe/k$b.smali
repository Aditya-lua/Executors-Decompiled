.class public abstract Lpe/k$b;
.super Lpe/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpe/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lpe/w<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final c:Ljava/util/concurrent/Executor;

.field public final synthetic d:Lpe/k;


# direct methods
.method public constructor <init>(Lpe/k;Ljava/util/concurrent/Executor;)V
    .locals 0

    iput-object p1, p0, Lpe/k$b;->d:Lpe/k;

    invoke-direct {p0}, Lpe/w;-><init>()V

    invoke-static {p2}, Lje/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Executor;

    iput-object p1, p0, Lpe/k$b;->c:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lpe/k$b;->d:Lpe/k;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lpe/k;->a0(Lpe/k;Lpe/k$b;)Lpe/k$b;

    instance-of v0, p1, Ljava/util/concurrent/ExecutionException;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpe/k$b;->d:Lpe/k;

    check-cast p1, Ljava/util/concurrent/ExecutionException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {v0, p1}, Lpe/b;->E(Ljava/lang/Throwable;)Z

    return-void

    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lpe/k$b;->d:Lpe/k;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lpe/b$j;->cancel(Z)Z

    return-void

    :cond_1
    iget-object v0, p0, Lpe/k$b;->d:Lpe/k;

    invoke-virtual {v0, p1}, Lpe/b;->E(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lpe/k$b;->d:Lpe/k;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lpe/k;->a0(Lpe/k;Lpe/k$b;)Lpe/k$b;

    invoke-virtual {p0, p1}, Lpe/k$b;->i(Ljava/lang/Object;)V

    return-void
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lpe/k$b;->d:Lpe/k;

    invoke-virtual {v0}, Lpe/b$j;->isDone()Z

    move-result v0

    return v0
.end method

.method public final h()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lpe/k$b;->c:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lpe/k$b;->d:Lpe/k;

    invoke-virtual {v1, v0}, Lpe/b;->E(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public abstract i(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method
