.class public final Lib/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lib/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lib/t<",
            "Lib/f;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Landroid/content/Context;

.field public c:Z

.field public final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lm9/k$a<",
            "Lmb/e;",
            ">;",
            "Lib/l;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lm9/k$a;",
            "Lib/j;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lm9/k$a<",
            "Lmb/d;",
            ">;",
            "Lib/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lib/t;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lib/t<",
            "Lib/f;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lib/m;->c:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lib/m;->d:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lib/m;->e:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lib/m;->f:Ljava/util/Map;

    iput-object p1, p0, Lib/m;->b:Landroid/content/Context;

    iput-object p2, p0, Lib/m;->a:Lib/t;

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 1

    iget-object v0, p0, Lib/m;->a:Lib/t;

    check-cast v0, Lib/w;

    iget-object v0, v0, Lib/w;->a:Lib/x;

    invoke-static {v0}, Lib/x;->g(Lib/x;)V

    iget-object v0, p0, Lib/m;->a:Lib/t;

    check-cast v0, Lib/w;

    invoke-virtual {v0}, Lib/w;->a()Lib/f;

    move-result-object v0

    invoke-interface {v0, p1}, Lib/f;->q2(Z)V

    iput-boolean p1, p0, Lib/m;->c:Z

    return-void
.end method

.method public final b()V
    .locals 7

    iget-object v0, p0, Lib/m;->d:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lib/m;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lib/l;

    if-eqz v2, :cond_0

    iget-object v4, p0, Lib/m;->a:Lib/t;

    check-cast v4, Lib/w;

    invoke-virtual {v4}, Lib/w;->a()Lib/f;

    move-result-object v4

    invoke-static {v2, v3}, Lib/r;->a(Lmb/r;Lib/d;)Lib/r;

    move-result-object v2

    invoke-interface {v4, v2}, Lib/f;->k2(Lib/r;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto/16 :goto_5

    :cond_1
    iget-object v1, p0, Lib/m;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lib/m;->f:Ljava/util/Map;

    monitor-enter v1

    :try_start_1
    iget-object v0, p0, Lib/m;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lib/i;

    if-eqz v2, :cond_2

    iget-object v4, p0, Lib/m;->a:Lib/t;

    check-cast v4, Lib/w;

    invoke-virtual {v4}, Lib/w;->a()Lib/f;

    move-result-object v4

    invoke-static {v2, v3}, Lib/r;->A3(Lmb/o;Lib/d;)Lib/r;

    move-result-object v2

    invoke-interface {v4, v2}, Lib/f;->k2(Lib/r;)V

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_3
    iget-object v0, p0, Lib/m;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iget-object v0, p0, Lib/m;->e:Ljava/util/Map;

    monitor-enter v0

    :try_start_2
    iget-object v1, p0, Lib/m;->e:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lib/j;

    if-eqz v2, :cond_4

    iget-object v4, p0, Lib/m;->a:Lib/t;

    check-cast v4, Lib/w;

    invoke-virtual {v4}, Lib/w;->a()Lib/f;

    move-result-object v4

    new-instance v5, Lib/a0;

    const/4 v6, 0x2

    invoke-direct {v5, v6, v3, v2, v3}, Lib/a0;-><init>(ILib/y;Landroid/os/IBinder;Landroid/os/IBinder;)V

    invoke-interface {v4, v5}, Lib/f;->D1(Lib/a0;)V

    goto :goto_2

    :catchall_2
    move-exception v1

    goto :goto_3

    :cond_5
    iget-object v1, p0, Lib/m;->e:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    throw v1

    :goto_4
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    :goto_5
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v1
.end method

.method public final c()V
    .locals 1

    iget-boolean v0, p0, Lib/m;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lib/m;->a(Z)V

    :cond_0
    return-void
.end method
