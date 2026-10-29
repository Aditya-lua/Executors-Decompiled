.class public final Lnb/nc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;
.implements Ln9/c$a;
.implements Ln9/c$b;


# instance fields
.field public volatile a:Z

.field public volatile b:Lnb/q5;

.field public final synthetic c:Lnb/tc;


# direct methods
.method public constructor <init>(Lnb/tc;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/nc;->c:Lnb/tc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Intent;)V
    .locals 5

    iget-object v0, p0, Lnb/nc;->c:Lnb/tc;

    invoke-virtual {v0}, Lnb/j8;->h()V

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lt9/a;->b()Lt9/a;

    move-result-object v1

    monitor-enter p0

    :try_start_0
    iget-boolean v2, p0, Lnb/nc;->a:Z

    if-eqz v2, :cond_0

    iget-object p1, p0, Lnb/nc;->c:Lnb/tc;

    iget-object p1, p1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->w()Lnb/u5;

    move-result-object p1

    const-string v0, "Connection attempt already in progress"

    invoke-virtual {p1, v0}, Lnb/u5;->a(Ljava/lang/String;)V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lnb/nc;->c:Lnb/tc;

    iget-object v3, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v3}, Lnb/g7;->a()Lnb/w5;

    move-result-object v3

    invoke-virtual {v3}, Lnb/w5;->w()Lnb/u5;

    move-result-object v3

    const-string v4, "Using local app measurement service"

    invoke-virtual {v3, v4}, Lnb/u5;->a(Ljava/lang/String;)V

    const/4 v3, 0x1

    iput-boolean v3, p0, Lnb/nc;->a:Z

    invoke-virtual {v2}, Lnb/tc;->M()Lnb/nc;

    move-result-object v2

    const/16 v3, 0x81

    invoke-virtual {v1, v0, p1, v2, v3}, Lt9/a;->a(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    monitor-exit p0

    return-void

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lnb/nc;->b:Lnb/q5;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnb/nc;->b:Lnb/q5;

    invoke-virtual {v0}, Ln9/c;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnb/nc;->b:Lnb/q5;

    invoke-virtual {v0}, Ln9/c;->isConnecting()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lnb/nc;->b:Lnb/q5;

    invoke-virtual {v0}, Ln9/c;->disconnect()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lnb/nc;->b:Lnb/q5;

    return-void
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Lnb/nc;->c:Lnb/tc;

    invoke-virtual {v0}, Lnb/j8;->h()V

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v0

    monitor-enter p0

    :try_start_0
    iget-boolean v1, p0, Lnb/nc;->a:Z

    if-eqz v1, :cond_0

    iget-object v0, p0, Lnb/nc;->c:Lnb/tc;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v1, "Connection attempt already in progress"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lnb/nc;->b:Lnb/q5;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lnb/nc;->b:Lnb/q5;

    invoke-virtual {v1}, Ln9/c;->isConnecting()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lnb/nc;->b:Lnb/q5;

    invoke-virtual {v1}, Ln9/c;->isConnected()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    iget-object v0, p0, Lnb/nc;->c:Lnb/tc;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v1, "Already awaiting connection attempt"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    monitor-exit p0

    return-void

    :cond_2
    new-instance v1, Lnb/q5;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v0, v2, p0, p0}, Lnb/q5;-><init>(Landroid/content/Context;Landroid/os/Looper;Ln9/c$a;Ln9/c$b;)V

    iput-object v1, p0, Lnb/nc;->b:Lnb/q5;

    iget-object v0, p0, Lnb/nc;->c:Lnb/tc;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v1, "Connecting to remote service"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnb/nc;->a:Z

    iget-object v0, p0, Lnb/nc;->b:Lnb/q5;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lnb/nc;->b:Lnb/q5;

    invoke-virtual {v0}, Ln9/c;->checkAvailabilityAndConnect()V

    monitor-exit p0

    return-void

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final synthetic d(Z)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lnb/nc;->a:Z

    return-void
.end method

.method public final onConnected(Landroid/os/Bundle;)V
    .locals 2

    iget-object p1, p0, Lnb/nc;->c:Lnb/tc;

    iget-object p1, p1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->b()Lnb/c7;

    move-result-object p1

    invoke-virtual {p1}, Lnb/c7;->o()V

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lnb/nc;->b:Lnb/q5;

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lnb/nc;->b:Lnb/q5;

    invoke-virtual {p1}, Ln9/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lnb/d5;

    iget-object v0, p0, Lnb/nc;->c:Lnb/tc;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    new-instance v1, Lnb/ic;

    invoke-direct {v1, p0, p1}, Lnb/ic;-><init>(Lnb/nc;Lnb/d5;)V

    invoke-virtual {v0, v1}, Lnb/c7;->t(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    const/4 p1, 0x0

    :try_start_1
    iput-object p1, p0, Lnb/nc;->b:Lnb/q5;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lnb/nc;->a:Z

    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2
    .param p1    # Lcom/google/android/gms/common/ConnectionResult;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lnb/nc;->c:Lnb/tc;

    iget-object v1, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->b()Lnb/c7;

    move-result-object v1

    invoke-virtual {v1}, Lnb/c7;->o()V

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->y()Lnb/w5;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v1, "Service connection failed"

    invoke-virtual {v0, v1, p1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lnb/nc;->a:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lnb/nc;->b:Lnb/q5;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lnb/nc;->c:Lnb/tc;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    new-instance v1, Lnb/mc;

    invoke-direct {v1, p0, p1}, Lnb/mc;-><init>(Lnb/nc;Lcom/google/android/gms/common/ConnectionResult;)V

    invoke-virtual {v0, v1}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final onConnectionSuspended(I)V
    .locals 2

    iget-object p1, p0, Lnb/nc;->c:Lnb/tc;

    iget-object p1, p1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    invoke-virtual {v0}, Lnb/c7;->o()V

    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->v()Lnb/u5;

    move-result-object v0

    const-string v1, "Service connection suspended"

    invoke-virtual {v0, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Lnb/g7;->b()Lnb/c7;

    move-result-object p1

    new-instance v0, Lnb/jc;

    invoke-direct {v0, p0}, Lnb/jc;-><init>(Lnb/nc;)V

    invoke-virtual {p1, v0}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    iget-object p1, p0, Lnb/nc;->c:Lnb/tc;

    iget-object p1, p1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->b()Lnb/c7;

    move-result-object p1

    invoke-virtual {p1}, Lnb/c7;->o()V

    monitor-enter p0

    const/4 p1, 0x0

    if-nez p2, :cond_0

    :try_start_0
    iput-boolean p1, p0, Lnb/nc;->a:Z

    iget-object p1, p0, Lnb/nc;->c:Lnb/tc;

    iget-object p1, p1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    const-string p2, "Service connected with null binder"

    invoke-virtual {p1, p2}, Lnb/u5;->a(Ljava/lang/String;)V

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    invoke-interface {p2}, Landroid/os/IBinder;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.google.android.gms.measurement.internal.IMeasurementService"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v1, "com.google.android.gms.measurement.internal.IMeasurementService"

    invoke-interface {p2, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    instance-of v2, v1, Lnb/d5;

    if-eqz v2, :cond_1

    check-cast v1, Lnb/d5;

    :goto_0
    move-object v0, v1

    goto :goto_1

    :cond_1
    new-instance v1, Lnb/a5;

    invoke-direct {v1, p2}, Lnb/a5;-><init>(Landroid/os/IBinder;)V

    goto :goto_0

    :goto_1
    iget-object p2, p0, Lnb/nc;->c:Lnb/tc;

    iget-object p2, p2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p2}, Lnb/g7;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->w()Lnb/u5;

    move-result-object p2

    const-string v1, "Bound to IMeasurementService interface"

    invoke-virtual {p2, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    iget-object p2, p0, Lnb/nc;->c:Lnb/tc;

    iget-object p2, p2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p2}, Lnb/g7;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->o()Lnb/u5;

    move-result-object p2

    const-string v2, "Got binder with a wrong descriptor"

    invoke-virtual {p2, v2, v1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catch_0
    :try_start_2
    iget-object p2, p0, Lnb/nc;->c:Lnb/tc;

    iget-object p2, p2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p2}, Lnb/g7;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->o()Lnb/u5;

    move-result-object p2

    const-string v1, "Service connect failed to get IMeasurementService"

    invoke-virtual {p2, v1}, Lnb/u5;->a(Ljava/lang/String;)V

    :goto_2
    if-nez v0, :cond_3

    iput-boolean p1, p0, Lnb/nc;->a:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {}, Lt9/a;->b()Lt9/a;

    move-result-object p1

    iget-object p2, p0, Lnb/nc;->c:Lnb/tc;

    iget-object v0, p2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2}, Lnb/tc;->M()Lnb/nc;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lt9/a;->c(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_3

    :cond_3
    :try_start_4
    iget-object p1, p0, Lnb/nc;->c:Lnb/tc;

    iget-object p1, p1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->b()Lnb/c7;

    move-result-object p1

    new-instance p2, Lnb/fc;

    invoke-direct {p2, p0, v0}, Lnb/fc;-><init>(Lnb/nc;Lnb/d5;)V

    invoke-virtual {p1, p2}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    :catch_1
    :goto_3
    monitor-exit p0

    return-void

    :goto_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3

    iget-object v0, p0, Lnb/nc;->c:Lnb/tc;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v1

    invoke-virtual {v1}, Lnb/c7;->o()V

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->v()Lnb/u5;

    move-result-object v1

    const-string v2, "Service disconnected"

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    new-instance v1, Lnb/gc;

    invoke-direct {v1, p0, p1}, Lnb/gc;-><init>(Lnb/nc;Landroid/content/ComponentName;)V

    invoke-virtual {v0, v1}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void
.end method
