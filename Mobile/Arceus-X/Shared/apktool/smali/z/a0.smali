.class public final Lz/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/n0;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lh0/a;

.field public final c:Ln0/h1;

.field public final d:Ln0/g1;

.field public final e:La0/p0;

.field public final f:Lz/q3;

.field public final g:J

.field public final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lz/z0;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ls0/m;

.field public final j:Lg0/g0;

.field public final k:Lz/q2;

.field public final l:Lg0/v;

.field public final m:Ljava/lang/Object;

.field public n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ln0/h1;Lg0/v;JLg0/g0;Ls0/m;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lz/a0;->h:Ljava/util/Map;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lz/a0;->m:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lz/a0;->n:Ljava/util/List;

    iput-object p1, p0, Lz/a0;->a:Landroid/content/Context;

    iput-object p2, p0, Lz/a0;->c:Ln0/h1;

    invoke-virtual {p2}, Ln0/h1;->c()Landroid/os/Handler;

    move-result-object v0

    invoke-static {p1, v0}, La0/p0;->b(Landroid/content/Context;Landroid/os/Handler;)La0/p0;

    move-result-object v0

    iput-object v0, p0, Lz/a0;->e:La0/p0;

    invoke-static {p1}, Lz/q3;->c(Landroid/content/Context;)Lz/q3;

    move-result-object p1

    iput-object p1, p0, Lz/a0;->f:Lz/q3;

    new-instance p1, Le0/a;

    invoke-direct {p1, v0}, Le0/a;-><init>(La0/p0;)V

    iput-object p1, p0, Lz/a0;->b:Lh0/a;

    new-instance v1, Ln0/g1;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Ln0/g1;-><init>(Lh0/a;I)V

    iput-object v1, p0, Lz/a0;->d:Ln0/g1;

    invoke-interface {p1, v1}, Lh0/a;->c(Lh0/a$a;)V

    iput-wide p4, p0, Lz/a0;->g:J

    iput-object p7, p0, Lz/a0;->i:Ls0/m;

    iput-object p6, p0, Lz/a0;->j:Lg0/g0;

    iput-object p3, p0, Lz/a0;->l:Lg0/v;

    :try_start_0
    invoke-virtual {v0}, La0/p0;->d()[Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch La0/f; {:try_start_0 .. :try_end_0} :catch_0

    new-instance p3, Lz/q2;

    invoke-virtual {p2}, Ln0/h1;->b()Ljava/util/concurrent/Executor;

    move-result-object p2

    invoke-direct {p3, p1, v0, p2}, Lz/q2;-><init>(Ljava/util/List;La0/p0;Ljava/util/concurrent/Executor;)V

    iput-object p3, p0, Lz/a0;->k:Lz/q2;

    invoke-virtual {p0, p1}, Lz/a0;->e(Ljava/util/List;)V

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lg0/p1;

    invoke-static {p1}, Lz/a3;->a(La0/f;)Lg0/x;

    move-result-object p1

    invoke-direct {p2, p1}, Lg0/p1;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lz/a0;->i()La0/p0;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;)Ln0/p0;
    .locals 16

    move-object/from16 v1, p0

    iget-object v2, v1, Lz/a0;->m:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v0, v1, Lz/a0;->n:Ljava/util/List;

    move-object/from16 v6, p1

    invoke-interface {v0, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v3, Lz/u0;

    iget-object v4, v1, Lz/a0;->a:Landroid/content/Context;

    iget-object v5, v1, Lz/a0;->e:La0/p0;

    invoke-virtual/range {p0 .. p1}, Lz/a0;->h(Ljava/lang/String;)Lz/z0;

    move-result-object v7

    iget-object v8, v1, Lz/a0;->b:Lh0/a;

    iget-object v9, v1, Lz/a0;->d:Ln0/g1;

    iget-object v0, v1, Lz/a0;->c:Ln0/h1;

    invoke-virtual {v0}, Ln0/h1;->b()Ljava/util/concurrent/Executor;

    move-result-object v10

    iget-object v0, v1, Lz/a0;->c:Ln0/h1;

    invoke-virtual {v0}, Ln0/h1;->c()Landroid/os/Handler;

    move-result-object v11

    iget-object v12, v1, Lz/a0;->f:Lz/q3;

    iget-wide v13, v1, Lz/a0;->g:J

    iget-object v15, v1, Lz/a0;->j:Lg0/g0;

    invoke-direct/range {v3 .. v15}, Lz/u0;-><init>(Landroid/content/Context;La0/p0;Ljava/lang/String;Lz/z0;Lh0/a;Ln0/g1;Ljava/util/concurrent/Executor;Landroid/os/Handler;Lz/q3;JLg0/g0;)V

    return-object v3

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v3, "The given camera id is not on the available camera id list."

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_0
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public c()Ln0/a3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln0/a3<",
            "Ljava/util/List<",
            "Lg0/s;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lz/a0;->k:Lz/q2;

    return-object v0
.end method

.method public d()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz/a0;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/LinkedHashSet;

    iget-object v2, p0, Lz/a0;->n:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public e(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object p1, p0, Lz/a0;->l:Lg0/v;

    invoke-static {p0, p1, v0}, Lz/y2;->b(Lz/a0;Lg0/v;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz/a0;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lz/a0;->m:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catch Lg0/p1; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v1, p0, Lz/a0;->n:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    const-string v1, "Camera2CameraFactory"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Updated available camera list: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lz/a0;->n:Ljava/util/List;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lz/a0;->n:Ljava/util/List;

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catch Lg0/p1; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p1

    const-string v0, "Camera2CameraFactory"

    const-string v1, "Unable to get backward compatible camera ids"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    throw p1
.end method

.method public f()Lh0/a;
    .locals 1

    iget-object v0, p0, Lz/a0;->b:Lh0/a;

    return-object v0
.end method

.method public final g(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "0"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "1"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lz/a0;->e:La0/p0;

    invoke-static {v2, v1}, Lz/x2;->a(La0/p0;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Camera "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Camera2CameraFactory"

    invoke-static {v2, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    :goto_1
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public h(Ljava/lang/String;)Lz/z0;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lz/a0;->h:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz/z0;

    if-nez v0, :cond_0

    new-instance v0, Lz/z0;

    iget-object v1, p0, Lz/a0;->e:La0/p0;

    iget-object v2, p0, Lz/a0;->i:Ls0/m;

    invoke-direct {v0, p1, v1, v2}, Lz/z0;-><init>(Ljava/lang/String;La0/p0;Ls0/m;)V

    iget-object v1, p0, Lz/a0;->h:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch La0/f; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    return-object v0

    :goto_0
    invoke-static {p1}, Lz/a3;->a(La0/f;)Lg0/x;

    move-result-object p1

    throw p1
.end method

.method public i()La0/p0;
    .locals 1

    iget-object v0, p0, Lz/a0;->e:La0/p0;

    return-object v0
.end method

.method public shutdown()V
    .locals 1

    iget-object v0, p0, Lz/a0;->b:Lh0/a;

    invoke-interface {v0}, Lh0/a;->shutdown()V

    iget-object v0, p0, Lz/a0;->k:Lz/q2;

    invoke-virtual {v0}, Lz/q2;->h()V

    return-void
.end method
