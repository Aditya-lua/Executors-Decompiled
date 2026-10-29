.class public Lcom/google/android/gms/internal/measurement/xb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public volatile a:Lcom/google/android/gms/internal/measurement/oc;

.field public volatile b:Lcom/google/android/gms/internal/measurement/ha;


# virtual methods
.method public final a(Lcom/google/android/gms/internal/measurement/oc;)Lcom/google/android/gms/internal/measurement/oc;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/xb;->a:Lcom/google/android/gms/internal/measurement/oc;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/xb;->b:Lcom/google/android/gms/internal/measurement/ha;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/xb;->a:Lcom/google/android/gms/internal/measurement/oc;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/xb;->b:Lcom/google/android/gms/internal/measurement/ha;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/xb;->b:Lcom/google/android/gms/internal/measurement/ha;

    check-cast v0, Lcom/google/android/gms/internal/measurement/ga;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/ga;->c:[B

    array-length v0, v0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/xb;->a:Lcom/google/android/gms/internal/measurement/oc;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/xb;->a:Lcom/google/android/gms/internal/measurement/oc;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/oc;->a()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final c()Lcom/google/android/gms/internal/measurement/ha;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/xb;->b:Lcom/google/android/gms/internal/measurement/ha;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/xb;->b:Lcom/google/android/gms/internal/measurement/ha;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/xb;->b:Lcom/google/android/gms/internal/measurement/ha;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/xb;->b:Lcom/google/android/gms/internal/measurement/ha;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/xb;->a:Lcom/google/android/gms/internal/measurement/oc;

    if-nez v0, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/measurement/ha;->b:Lcom/google/android/gms/internal/measurement/ha;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/xb;->b:Lcom/google/android/gms/internal/measurement/ha;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/xb;->a:Lcom/google/android/gms/internal/measurement/oc;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/oc;->b()Lcom/google/android/gms/internal/measurement/ha;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/xb;->b:Lcom/google/android/gms/internal/measurement/ha;

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/xb;->b:Lcom/google/android/gms/internal/measurement/ha;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
