.class public final Lcom/google/android/gms/internal/play_billing/p1;
.super Lcom/google/android/gms/internal/play_billing/n1;
.source "SourceFile"


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/play_billing/w1;)V
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/play_billing/n1;-><init>(Lcom/google/android/gms/internal/play_billing/w1;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/play_billing/s1;Lcom/google/android/gms/internal/play_billing/k1;)Lcom/google/android/gms/internal/play_billing/k1;
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/internal/play_billing/s1;->b:Lcom/google/android/gms/internal/play_billing/k1;

    if-eq v0, p2, :cond_0

    iput-object p2, p1, Lcom/google/android/gms/internal/play_billing/s1;->b:Lcom/google/android/gms/internal/play_billing/k1;

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p1

    return-object v0

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final b(Lcom/google/android/gms/internal/play_billing/s1;Lcom/google/android/gms/internal/play_billing/r1;)Lcom/google/android/gms/internal/play_billing/r1;
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/internal/play_billing/s1;->c:Lcom/google/android/gms/internal/play_billing/r1;

    if-eq v0, p2, :cond_0

    iput-object p2, p1, Lcom/google/android/gms/internal/play_billing/s1;->c:Lcom/google/android/gms/internal/play_billing/r1;

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p1

    return-object v0

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final c(Lcom/google/android/gms/internal/play_billing/r1;Lcom/google/android/gms/internal/play_billing/r1;)V
    .locals 0

    iput-object p2, p1, Lcom/google/android/gms/internal/play_billing/r1;->b:Lcom/google/android/gms/internal/play_billing/r1;

    return-void
.end method

.method public final d(Lcom/google/android/gms/internal/play_billing/r1;Ljava/lang/Thread;)V
    .locals 0

    iput-object p2, p1, Lcom/google/android/gms/internal/play_billing/r1;->a:Ljava/lang/Thread;

    return-void
.end method

.method public final e(Lcom/google/android/gms/internal/play_billing/s1;Lcom/google/android/gms/internal/play_billing/k1;Lcom/google/android/gms/internal/play_billing/k1;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/internal/play_billing/s1;->b:Lcom/google/android/gms/internal/play_billing/k1;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lcom/google/android/gms/internal/play_billing/s1;->b:Lcom/google/android/gms/internal/play_billing/k1;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final f(Lcom/google/android/gms/internal/play_billing/s1;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/internal/play_billing/s1;->a:Ljava/lang/Object;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lcom/google/android/gms/internal/play_billing/s1;->a:Ljava/lang/Object;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final g(Lcom/google/android/gms/internal/play_billing/s1;Lcom/google/android/gms/internal/play_billing/r1;Lcom/google/android/gms/internal/play_billing/r1;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/internal/play_billing/s1;->c:Lcom/google/android/gms/internal/play_billing/r1;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lcom/google/android/gms/internal/play_billing/s1;->c:Lcom/google/android/gms/internal/play_billing/r1;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
