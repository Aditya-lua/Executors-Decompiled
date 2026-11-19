.class public Lcom/google/android/gms/internal/measurement/bc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public volatile a:Lcom/google/android/gms/internal/measurement/sc;

.field public volatile b:Lcom/google/android/gms/internal/measurement/la;


# virtual methods
.method public final a(Lcom/google/android/gms/internal/measurement/sc;)Lcom/google/android/gms/internal/measurement/sc;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/bc;->a:Lcom/google/android/gms/internal/measurement/sc;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/bc;->b:Lcom/google/android/gms/internal/measurement/la;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/bc;->a:Lcom/google/android/gms/internal/measurement/sc;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/bc;->b:Lcom/google/android/gms/internal/measurement/la;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/bc;->b:Lcom/google/android/gms/internal/measurement/la;

    check-cast v0, Lcom/google/android/gms/internal/measurement/ka;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/ka;->c:[B

    array-length v0, v0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/bc;->a:Lcom/google/android/gms/internal/measurement/sc;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/bc;->a:Lcom/google/android/gms/internal/measurement/sc;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/sc;->a()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final c()Lcom/google/android/gms/internal/measurement/la;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/bc;->b:Lcom/google/android/gms/internal/measurement/la;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/bc;->b:Lcom/google/android/gms/internal/measurement/la;

    return-object v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/bc;->b:Lcom/google/android/gms/internal/measurement/la;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/bc;->b:Lcom/google/android/gms/internal/measurement/la;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/bc;->a:Lcom/google/android/gms/internal/measurement/sc;

    if-nez v0, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/measurement/la;->b:Lcom/google/android/gms/internal/measurement/la;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/bc;->b:Lcom/google/android/gms/internal/measurement/la;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/bc;->a:Lcom/google/android/gms/internal/measurement/sc;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/sc;->b()Lcom/google/android/gms/internal/measurement/la;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/bc;->b:Lcom/google/android/gms/internal/measurement/la;

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/bc;->b:Lcom/google/android/gms/internal/measurement/la;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
