.class public Landroidx/datastore/preferences/protobuf/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroidx/datastore/preferences/protobuf/g;

.field public b:Landroidx/datastore/preferences/protobuf/o;

.field public volatile c:Landroidx/datastore/preferences/protobuf/r0;

.field public volatile d:Landroidx/datastore/preferences/protobuf/g;


# virtual methods
.method public a(Landroidx/datastore/preferences/protobuf/r0;)V
    .locals 3

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/d0;->c:Landroidx/datastore/preferences/protobuf/r0;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/d0;->c:Landroidx/datastore/preferences/protobuf/r0;

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
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/d0;->a:Landroidx/datastore/preferences/protobuf/g;

    if-eqz v0, :cond_2

    invoke-interface {p1}, Landroidx/datastore/preferences/protobuf/r0;->h()Landroidx/datastore/preferences/protobuf/z0;

    move-result-object v0

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/d0;->a:Landroidx/datastore/preferences/protobuf/g;

    iget-object v2, p0, Landroidx/datastore/preferences/protobuf/d0;->b:Landroidx/datastore/preferences/protobuf/o;

    invoke-interface {v0, v1, v2}, Landroidx/datastore/preferences/protobuf/z0;->a(Landroidx/datastore/preferences/protobuf/g;Landroidx/datastore/preferences/protobuf/o;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/r0;

    iput-object v0, p0, Landroidx/datastore/preferences/protobuf/d0;->c:Landroidx/datastore/preferences/protobuf/r0;

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/d0;->a:Landroidx/datastore/preferences/protobuf/g;

    iput-object v0, p0, Landroidx/datastore/preferences/protobuf/d0;->d:Landroidx/datastore/preferences/protobuf/g;

    goto :goto_0

    :cond_2
    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/d0;->c:Landroidx/datastore/preferences/protobuf/r0;

    sget-object v0, Landroidx/datastore/preferences/protobuf/g;->b:Landroidx/datastore/preferences/protobuf/g;

    iput-object v0, p0, Landroidx/datastore/preferences/protobuf/d0;->d:Landroidx/datastore/preferences/protobuf/g;
    :try_end_1
    .catch Landroidx/datastore/preferences/protobuf/a0; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/d0;->c:Landroidx/datastore/preferences/protobuf/r0;

    sget-object p1, Landroidx/datastore/preferences/protobuf/g;->b:Landroidx/datastore/preferences/protobuf/g;

    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/d0;->d:Landroidx/datastore/preferences/protobuf/g;

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

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/d0;->d:Landroidx/datastore/preferences/protobuf/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/d0;->d:Landroidx/datastore/preferences/protobuf/g;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/g;->size()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/d0;->a:Landroidx/datastore/preferences/protobuf/g;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/g;->size()I

    move-result v0

    return v0

    :cond_1
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/d0;->c:Landroidx/datastore/preferences/protobuf/r0;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/d0;->c:Landroidx/datastore/preferences/protobuf/r0;

    invoke-interface {v0}, Landroidx/datastore/preferences/protobuf/r0;->c()I

    move-result v0

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public c(Landroidx/datastore/preferences/protobuf/r0;)Landroidx/datastore/preferences/protobuf/r0;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/d0;->a(Landroidx/datastore/preferences/protobuf/r0;)V

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/d0;->c:Landroidx/datastore/preferences/protobuf/r0;

    return-object p1
.end method

.method public d(Landroidx/datastore/preferences/protobuf/r0;)Landroidx/datastore/preferences/protobuf/r0;
    .locals 2

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/d0;->c:Landroidx/datastore/preferences/protobuf/r0;

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/datastore/preferences/protobuf/d0;->a:Landroidx/datastore/preferences/protobuf/g;

    iput-object v1, p0, Landroidx/datastore/preferences/protobuf/d0;->d:Landroidx/datastore/preferences/protobuf/g;

    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/d0;->c:Landroidx/datastore/preferences/protobuf/r0;

    return-object v0
.end method

.method public e()Landroidx/datastore/preferences/protobuf/g;
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/d0;->d:Landroidx/datastore/preferences/protobuf/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/d0;->d:Landroidx/datastore/preferences/protobuf/g;

    return-object v0

    :cond_0
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/d0;->a:Landroidx/datastore/preferences/protobuf/g;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/d0;->d:Landroidx/datastore/preferences/protobuf/g;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/d0;->d:Landroidx/datastore/preferences/protobuf/g;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_2
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/d0;->c:Landroidx/datastore/preferences/protobuf/r0;

    if-nez v0, :cond_3

    sget-object v0, Landroidx/datastore/preferences/protobuf/g;->b:Landroidx/datastore/preferences/protobuf/g;

    iput-object v0, p0, Landroidx/datastore/preferences/protobuf/d0;->d:Landroidx/datastore/preferences/protobuf/g;

    goto :goto_0

    :cond_3
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/d0;->c:Landroidx/datastore/preferences/protobuf/r0;

    invoke-interface {v0}, Landroidx/datastore/preferences/protobuf/r0;->b()Landroidx/datastore/preferences/protobuf/g;

    move-result-object v0

    iput-object v0, p0, Landroidx/datastore/preferences/protobuf/d0;->d:Landroidx/datastore/preferences/protobuf/g;

    :goto_0
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/d0;->d:Landroidx/datastore/preferences/protobuf/g;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
