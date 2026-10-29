.class public final Lz/l2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/m0;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lz/g5;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lz/g;

.field public final d:La0/p0;

.field public final e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/Object;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lz/l2$a;

    invoke-direct {v0}, Lz/l2$a;-><init>()V

    invoke-direct {p0, p1, v0, p2, p3}, Lz/l2;-><init>(Landroid/content/Context;Lz/g;Ljava/lang/Object;Ljava/util/Set;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lz/g;Ljava/lang/Object;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lz/g;",
            "Ljava/lang/Object;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lz/l2;->a:Ljava/lang/Object;

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lz/l2;->b:Ljava/util/Map;

    .line 5
    invoke-static {p2}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    iput-object p2, p0, Lz/l2;->c:Lz/g;

    .line 7
    iput-object p1, p0, Lz/l2;->e:Landroid/content/Context;

    .line 8
    instance-of p2, p3, La0/p0;

    if-eqz p2, :cond_0

    .line 9
    check-cast p3, La0/p0;

    iput-object p3, p0, Lz/l2;->d:La0/p0;

    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p1}, La0/p0;->a(Landroid/content/Context;)La0/p0;

    move-result-object p1

    iput-object p1, p0, Lz/l2;->d:La0/p0;

    .line 11
    :goto_0
    :try_start_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, p1}, Lz/l2;->f(Ljava/util/List;)V
    :try_end_0
    .catch Ln0/i1; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Lg0/x;

    if-eqz p2, :cond_1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    check-cast p1, Lg0/x;

    throw p1

    .line 14
    :cond_1
    new-instance p2, Lg0/x;

    const/4 p3, 0x3

    invoke-direct {p2, p3, p1}, Lg0/x;-><init>(ILjava/lang/Throwable;)V

    throw p2
.end method


# virtual methods
.method public b(ILjava/lang/String;ILandroid/util/Size;Ln0/u3;)Ln0/w3;
    .locals 4

    iget-object v0, p0, Lz/l2;->b:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz/g5;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No such camera id in supported combination list: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lx2/g;->b(ZLjava/lang/Object;)V

    invoke-virtual {v0, p1, p3, p4, p5}, Lz/g5;->a0(IILandroid/util/Size;Ln0/u3;)Ln0/w3;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lz/l2;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iget-object v3, p0, Lz/l2;->b:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v2}, Lz/l2;->i(Ljava/lang/String;)Lz/g5;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Lg0/x; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    goto :goto_3

    :cond_0
    iget-object v1, p0, Lz/l2;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_2
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v4, p0, Lz/l2;->b:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lz/l2;->b:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lz/g5;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lz/g5;

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lz/l2;->b:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    iget-object p1, p0, Lz/l2;->b:Ljava/util/Map;

    invoke-interface {p1, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    monitor-exit v1

    return-void

    :goto_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :goto_3
    new-instance v0, Ln0/i1;

    const-string v1, "Failed to create SupportedSurfaceCombination"

    invoke-direct {v0, v1, p1}, Ln0/i1;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method public g(ILjava/lang/String;Ljava/util/List;Ljava/util/Map;ZZZZ)Ln0/y3;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ln0/g;",
            ">;",
            "Ljava/util/Map<",
            "Ln0/i4<",
            "*>;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;ZZZZ)",
            "Ln0/y3;"
        }
    .end annotation

    invoke-interface {p4}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "No new use cases to be bound."

    invoke-static {v0, v2}, Lx2/g;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lz/l2;->b:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz/g5;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No such camera id in supported combination list: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lx2/g;->b(ZLjava/lang/Object;)V

    move p2, p1

    move-object p1, v0

    invoke-virtual/range {p1 .. p8}, Lz/g5;->K(ILjava/util/List;Ljava/util/Map;ZZZZ)Ln0/y3;

    move-result-object p1

    return-object p1
.end method

.method public final i(Ljava/lang/String;)Lz/g5;
    .locals 9

    sget-object v0, Lj0/a;->b:Lj0/a;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x23

    if-lt v1, v2, :cond_0

    new-instance v0, Ly/m;

    iget-object v1, p0, Lz/l2;->e:Landroid/content/Context;

    iget-object v2, p0, Lz/l2;->d:La0/p0;

    invoke-direct {v0, v1, p1, v2}, Ly/m;-><init>(Landroid/content/Context;Ljava/lang/String;La0/p0;)V

    :cond_0
    move-object v8, v0

    new-instance v3, Lz/g5;

    iget-object v4, p0, Lz/l2;->e:Landroid/content/Context;

    iget-object v6, p0, Lz/l2;->d:La0/p0;

    iget-object v7, p0, Lz/l2;->c:Lz/g;

    move-object v5, p1

    invoke-direct/range {v3 .. v8}, Lz/g5;-><init>(Landroid/content/Context;Ljava/lang/String;La0/p0;Lz/g;Lj0/a;)V

    return-object v3
.end method
