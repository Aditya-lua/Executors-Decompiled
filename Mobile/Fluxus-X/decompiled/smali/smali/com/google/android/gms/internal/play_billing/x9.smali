.class public final Lcom/google/android/gms/internal/play_billing/x9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/i2;


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;

.field public final b:Lcom/google/android/gms/internal/play_billing/s9;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/play_billing/t9;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/play_billing/w9;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/play_billing/w9;-><init>(Lcom/google/android/gms/internal/play_billing/x9;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/x9;->b:Lcom/google/android/gms/internal/play_billing/s9;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/x9;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/Executor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/x9;->b:Lcom/google/android/gms/internal/play_billing/s9;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/play_billing/s9;->b(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/x9;->b:Lcom/google/android/gms/internal/play_billing/s9;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/s9;->e(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final cancel(Z)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/x9;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/t9;

    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/x9;->b:Lcom/google/android/gms/internal/play_billing/s9;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/play_billing/s9;->cancel(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/t9;->a()V

    const/4 p1, 0x1

    :cond_0
    return p1
.end method

.method public final d(Ljava/lang/Throwable;)Z
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/play_billing/m4;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/play_billing/m4;-><init>(Ljava/lang/Throwable;)V

    sget-object p1, Lcom/google/android/gms/internal/play_billing/s9;->f:Lcom/google/android/gms/internal/play_billing/x1;

    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/x9;->b:Lcom/google/android/gms/internal/play_billing/s9;

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2, v0}, Lcom/google/android/gms/internal/play_billing/x1;->d(Lcom/google/android/gms/internal/play_billing/s9;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/s9;->d(Lcom/google/android/gms/internal/play_billing/s9;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/x9;->b:Lcom/google/android/gms/internal/play_billing/s9;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/s9;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1
    .param p3    # Ljava/util/concurrent/TimeUnit;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/x9;->b:Lcom/google/android/gms/internal/play_billing/s9;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/play_billing/s9;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final isCancelled()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/x9;->b:Lcom/google/android/gms/internal/play_billing/s9;

    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/s9;->a:Ljava/lang/Object;

    instance-of v0, v0, Lcom/google/android/gms/internal/play_billing/q2;

    return v0
.end method

.method public final isDone()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/x9;->b:Lcom/google/android/gms/internal/play_billing/s9;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/s9;->isDone()Z

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/x9;->b:Lcom/google/android/gms/internal/play_billing/s9;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/s9;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
