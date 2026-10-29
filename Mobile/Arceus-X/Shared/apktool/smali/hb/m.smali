.class public final Lhb/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lhb/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhb/r<",
            "Lhb/f;",
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
            "Ll9/k$a<",
            "Llb/e;",
            ">;",
            "Lhb/l;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ll9/k$a;",
            "Lhb/j;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ll9/k$a<",
            "Llb/d;",
            ">;",
            "Lhb/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lhb/r;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lhb/r<",
            "Lhb/f;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lhb/m;->c:Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lhb/m;->d:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lhb/m;->e:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lhb/m;->f:Ljava/util/Map;

    iput-object p1, p0, Lhb/m;->b:Landroid/content/Context;

    iput-object p2, p0, Lhb/m;->a:Lhb/r;

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 1

    iget-object v0, p0, Lhb/m;->a:Lhb/r;

    check-cast v0, Lhb/u;

    iget-object v0, v0, Lhb/u;->a:Lhb/v;

    invoke-static {v0}, Lhb/v;->g(Lhb/v;)V

    iget-object v0, p0, Lhb/m;->a:Lhb/r;

    check-cast v0, Lhb/u;

    invoke-virtual {v0}, Lhb/u;->a()Lhb/f;

    move-result-object v0

    invoke-interface {v0, p1}, Lhb/f;->q2(Z)V

    iput-boolean p1, p0, Lhb/m;->c:Z

    return-void
.end method

.method public final b()V
    .locals 7

    iget-object v0, p0, Lhb/m;->d:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lhb/m;->d:Ljava/util/Map;

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

    check-cast v2, Lhb/l;

    if-eqz v2, :cond_0

    iget-object v4, p0, Lhb/m;->a:Lhb/r;

    check-cast v4, Lhb/u;

    invoke-virtual {v4}, Lhb/u;->a()Lhb/f;

    move-result-object v4

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/location/zzbc;->a(Llb/r;Lhb/d;)Lcom/google/android/gms/internal/location/zzbc;

    move-result-object v2

    invoke-interface {v4, v2}, Lhb/f;->w(Lcom/google/android/gms/internal/location/zzbc;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto/16 :goto_5

    :cond_1
    iget-object v1, p0, Lhb/m;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lhb/m;->f:Ljava/util/Map;

    monitor-enter v1

    :try_start_1
    iget-object v0, p0, Lhb/m;->f:Ljava/util/Map;

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

    check-cast v2, Lhb/i;

    if-eqz v2, :cond_2

    iget-object v4, p0, Lhb/m;->a:Lhb/r;

    check-cast v4, Lhb/u;

    invoke-virtual {v4}, Lhb/u;->a()Lhb/f;

    move-result-object v4

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/location/zzbc;->v3(Llb/o;Lhb/d;)Lcom/google/android/gms/internal/location/zzbc;

    move-result-object v2

    invoke-interface {v4, v2}, Lhb/f;->w(Lcom/google/android/gms/internal/location/zzbc;)V

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_3
    iget-object v0, p0, Lhb/m;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iget-object v0, p0, Lhb/m;->e:Ljava/util/Map;

    monitor-enter v0

    :try_start_2
    iget-object v1, p0, Lhb/m;->e:Ljava/util/Map;

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

    check-cast v2, Lhb/j;

    if-eqz v2, :cond_4

    iget-object v4, p0, Lhb/m;->a:Lhb/r;

    check-cast v4, Lhb/u;

    invoke-virtual {v4}, Lhb/u;->a()Lhb/f;

    move-result-object v4

    new-instance v5, Lcom/google/android/gms/internal/location/zzl;

    const/4 v6, 0x2

    invoke-direct {v5, v6, v3, v2, v3}, Lcom/google/android/gms/internal/location/zzl;-><init>(ILcom/google/android/gms/internal/location/zzj;Landroid/os/IBinder;Landroid/os/IBinder;)V

    invoke-interface {v4, v5}, Lhb/f;->U(Lcom/google/android/gms/internal/location/zzl;)V

    goto :goto_2

    :catchall_2
    move-exception v1

    goto :goto_3

    :cond_5
    iget-object v1, p0, Lhb/m;->e:Ljava/util/Map;

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

    iget-boolean v0, p0, Lhb/m;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lhb/m;->a(Z)V

    :cond_0
    return-void
.end method
