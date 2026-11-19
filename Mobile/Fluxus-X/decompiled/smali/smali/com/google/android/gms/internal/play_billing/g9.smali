.class public final Lcom/google/android/gms/internal/play_billing/g9;
.super Lcom/google/android/gms/internal/play_billing/x1;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/play_billing/x1;-><init>(Lcom/google/android/gms/internal/play_billing/r9;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/play_billing/q9;Lcom/google/android/gms/internal/play_billing/q9;)V
    .locals 0

    iput-object p2, p1, Lcom/google/android/gms/internal/play_billing/q9;->b:Lcom/google/android/gms/internal/play_billing/q9;

    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/play_billing/q9;Ljava/lang/Thread;)V
    .locals 0

    iput-object p2, p1, Lcom/google/android/gms/internal/play_billing/q9;->a:Ljava/lang/Thread;

    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/play_billing/s9;Lcom/google/android/gms/internal/play_billing/k5;Lcom/google/android/gms/internal/play_billing/k5;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/internal/play_billing/s9;->b:Lcom/google/android/gms/internal/play_billing/k5;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lcom/google/android/gms/internal/play_billing/s9;->b:Lcom/google/android/gms/internal/play_billing/k5;

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

.method public final d(Lcom/google/android/gms/internal/play_billing/s9;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/internal/play_billing/s9;->a:Ljava/lang/Object;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lcom/google/android/gms/internal/play_billing/s9;->a:Ljava/lang/Object;

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

.method public final e(Lcom/google/android/gms/internal/play_billing/s9;Lcom/google/android/gms/internal/play_billing/q9;Lcom/google/android/gms/internal/play_billing/q9;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/internal/play_billing/s9;->c:Lcom/google/android/gms/internal/play_billing/q9;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lcom/google/android/gms/internal/play_billing/s9;->c:Lcom/google/android/gms/internal/play_billing/q9;

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
