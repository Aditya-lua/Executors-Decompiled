.class public Lcom/google/crypto/tink/shaded/protobuf/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lcom/google/crypto/tink/shaded/protobuf/h;

.field public b:Lcom/google/crypto/tink/shaded/protobuf/p;

.field public volatile c:Lcom/google/crypto/tink/shaded/protobuf/s0;

.field public volatile d:Lcom/google/crypto/tink/shaded/protobuf/h;


# virtual methods
.method public a(Lcom/google/crypto/tink/shaded/protobuf/s0;)V
    .locals 3

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/s0;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/s0;

    if-eqz v0, :cond_1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/s0;->h()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->b:Lcom/google/crypto/tink/shaded/protobuf/p;

    invoke-interface {v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/a1;->b(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/s0;

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/s0;

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->d:Lcom/google/crypto/tink/shaded/protobuf/h;

    goto :goto_0

    :cond_2
    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/s0;

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/h;->b:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->d:Lcom/google/crypto/tink/shaded/protobuf/h;
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/s0;

    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/h;->b:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->d:Lcom/google/crypto/tink/shaded/protobuf/h;

    :goto_0
    monitor-exit p0

    :goto_1
    return-void

    :goto_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->d:Lcom/google/crypto/tink/shaded/protobuf/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->d:Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v0

    return v0

    :cond_1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/s0;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/s0;

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/s0;->c()I

    move-result v0

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public c(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/e0;->a(Lcom/google/crypto/tink/shaded/protobuf/s0;)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/s0;

    return-object p1
.end method

.method public d(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/s0;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->d:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/s0;

    return-object v0
.end method

.method public e()Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->d:Lcom/google/crypto/tink/shaded/protobuf/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->d:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->a:Lcom/google/crypto/tink/shaded/protobuf/h;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->d:Lcom/google/crypto/tink/shaded/protobuf/h;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->d:Lcom/google/crypto/tink/shaded/protobuf/h;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/s0;

    if-nez v0, :cond_3

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/h;->b:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->d:Lcom/google/crypto/tink/shaded/protobuf/h;

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->c:Lcom/google/crypto/tink/shaded/protobuf/s0;

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/s0;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->d:Lcom/google/crypto/tink/shaded/protobuf/h;

    :goto_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/e0;->d:Lcom/google/crypto/tink/shaded/protobuf/h;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
