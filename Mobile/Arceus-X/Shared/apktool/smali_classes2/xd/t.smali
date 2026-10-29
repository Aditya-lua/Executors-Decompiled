.class public final Lxd/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final n:Ljava/util/Map;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lxd/i;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/Set;

.field public final f:Ljava/lang/Object;

.field public g:Z

.field public final h:Landroid/content/Intent;

.field public final i:Ljava/lang/ref/WeakReference;

.field public final j:Landroid/os/IBinder$DeathRecipient;

.field public final k:Ljava/util/concurrent/atomic/AtomicInteger;

.field public l:Landroid/content/ServiceConnection;

.field public m:Landroid/os/IInterface;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lxd/t;->n:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lxd/i;Ljava/lang/String;Landroid/content/Intent;Lwd/d;Lxd/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lxd/t;->d:Ljava/util/List;

    new-instance p3, Ljava/util/HashSet;

    invoke-direct {p3}, Ljava/util/HashSet;-><init>()V

    iput-object p3, p0, Lxd/t;->e:Ljava/util/Set;

    new-instance p3, Ljava/lang/Object;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lxd/t;->f:Ljava/lang/Object;

    new-instance p3, Lxd/k;

    invoke-direct {p3, p0}, Lxd/k;-><init>(Lxd/t;)V

    iput-object p3, p0, Lxd/t;->j:Landroid/os/IBinder$DeathRecipient;

    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p5, 0x0

    invoke-direct {p3, p5}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p3, p0, Lxd/t;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, p0, Lxd/t;->a:Landroid/content/Context;

    iput-object p2, p0, Lxd/t;->b:Lxd/i;

    const-string p1, "com.google.android.finsky.inappreviewservice.InAppReviewService"

    iput-object p1, p0, Lxd/t;->c:Ljava/lang/String;

    iput-object p4, p0, Lxd/t;->h:Landroid/content/Intent;

    new-instance p1, Ljava/lang/ref/WeakReference;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lxd/t;->i:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static bridge synthetic a(Lxd/t;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lxd/t;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static bridge synthetic b(Lxd/t;)Landroid/content/ServiceConnection;
    .locals 0

    iget-object p0, p0, Lxd/t;->l:Landroid/content/ServiceConnection;

    return-object p0
.end method

.method public static bridge synthetic d(Lxd/t;)Landroid/os/IInterface;
    .locals 0

    iget-object p0, p0, Lxd/t;->m:Landroid/os/IInterface;

    return-object p0
.end method

.method public static bridge synthetic f(Lxd/t;)Lxd/i;
    .locals 0

    iget-object p0, p0, Lxd/t;->b:Lxd/i;

    return-object p0
.end method

.method public static bridge synthetic g(Lxd/t;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lxd/t;->f:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic h(Lxd/t;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lxd/t;->d:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic i(Lxd/t;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    iget-object p0, p0, Lxd/t;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method public static synthetic j(Lxd/t;)V
    .locals 4

    iget-object v0, p0, Lxd/t;->b:Lxd/i;

    const-string v1, "reportBinderDeath"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v3}, Lxd/i;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lxd/t;->i:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxd/o;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lxd/t;->b:Lxd/i;

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "calling onBinderDied"

    invoke-virtual {v1, v3, v2}, Lxd/i;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    invoke-interface {v0}, Lxd/o;->zza()V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lxd/t;->b:Lxd/i;

    iget-object v1, p0, Lxd/t;->c:Ljava/lang/String;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "%s : Binder has died."

    invoke-virtual {v0, v2, v1}, Lxd/i;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lxd/t;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxd/j;

    invoke-virtual {p0}, Lxd/t;->v()Landroid/os/RemoteException;

    move-result-object v2

    invoke-virtual {v1, v2}, Lxd/j;->c(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lxd/t;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :goto_1
    iget-object v0, p0, Lxd/t;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lxd/t;->w()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static bridge synthetic k(Lxd/t;Landroid/content/ServiceConnection;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lxd/t;->l:Landroid/content/ServiceConnection;

    return-void
.end method

.method public static bridge synthetic l(Lxd/t;Z)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lxd/t;->g:Z

    return-void
.end method

.method public static bridge synthetic m(Lxd/t;Landroid/os/IInterface;)V
    .locals 0

    iput-object p1, p0, Lxd/t;->m:Landroid/os/IInterface;

    return-void
.end method

.method public static bridge synthetic n(Lxd/t;Lsb/k;)V
    .locals 2

    iget-object v0, p0, Lxd/t;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lxd/l;

    invoke-direct {v1, p0, p1}, Lxd/l;-><init>(Lxd/t;Lsb/k;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public static bridge synthetic o(Lxd/t;)V
    .locals 0

    invoke-virtual {p0}, Lxd/t;->w()V

    return-void
.end method

.method public static bridge synthetic p(Lxd/t;Lxd/j;)V
    .locals 4

    iget-object v0, p0, Lxd/t;->m:Landroid/os/IInterface;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lxd/t;->g:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lxd/t;->b:Lxd/i;

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Initiate binding to the service."

    invoke-virtual {v0, v3, v2}, Lxd/i;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lxd/t;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Lxd/r;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lxd/r;-><init>(Lxd/t;Lxd/s;)V

    iput-object p1, p0, Lxd/t;->l:Landroid/content/ServiceConnection;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lxd/t;->g:Z

    iget-object v2, p0, Lxd/t;->a:Landroid/content/Context;

    iget-object v3, p0, Lxd/t;->h:Landroid/content/Intent;

    invoke-virtual {v2, v3, p1, v0}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lxd/t;->b:Lxd/i;

    new-array v0, v1, [Ljava/lang/Object;

    const-string v2, "Failed to bind to the service."

    invoke-virtual {p1, v2, v0}, Lxd/i;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iput-boolean v1, p0, Lxd/t;->g:Z

    iget-object p1, p0, Lxd/t;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxd/j;

    new-instance v1, Lxd/u;

    invoke-direct {v1}, Lxd/u;-><init>()V

    invoke-virtual {v0, v1}, Lxd/j;->c(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_0
    iget-object p0, p0, Lxd/t;->d:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->clear()V

    :cond_1
    return-void

    :cond_2
    iget-boolean v0, p0, Lxd/t;->g:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lxd/t;->b:Lxd/i;

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Waiting to bind to the service."

    invoke-virtual {v0, v2, v1}, Lxd/i;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object p0, p0, Lxd/t;->d:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_3
    invoke-virtual {p1}, Lxd/j;->run()V

    return-void
.end method

.method public static bridge synthetic q(Lxd/t;)V
    .locals 4

    iget-object v0, p0, Lxd/t;->b:Lxd/i;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "linkToDeath"

    invoke-virtual {v0, v3, v2}, Lxd/i;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    :try_start_0
    iget-object v0, p0, Lxd/t;->m:Landroid/os/IInterface;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iget-object v2, p0, Lxd/t;->j:Landroid/os/IBinder$DeathRecipient;

    invoke-interface {v0, v2, v1}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object p0, p0, Lxd/t;->b:Lxd/i;

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "linkToDeath failed"

    invoke-virtual {p0, v0, v2, v1}, Lxd/i;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public static bridge synthetic r(Lxd/t;)V
    .locals 4

    iget-object v0, p0, Lxd/t;->b:Lxd/i;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "unlinkToDeath"

    invoke-virtual {v0, v3, v2}, Lxd/i;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lxd/t;->m:Landroid/os/IInterface;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iget-object p0, p0, Lxd/t;->j:Landroid/os/IBinder$DeathRecipient;

    invoke-interface {v0, p0, v1}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    return-void
.end method


# virtual methods
.method public final c()Landroid/os/Handler;
    .locals 4

    sget-object v0, Lxd/t;->n:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lxd/t;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/os/HandlerThread;

    iget-object v2, p0, Lxd/t;->c:Ljava/lang/String;

    const/16 v3, 0xa

    invoke-direct {v1, v2, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    iget-object v2, p0, Lxd/t;->c:Ljava/lang/String;

    new-instance v3, Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v3, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lxd/t;->c:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler;

    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final e()Landroid/os/IInterface;
    .locals 1

    iget-object v0, p0, Lxd/t;->m:Landroid/os/IInterface;

    return-object v0
.end method

.method public final s(Lxd/j;Lsb/k;)V
    .locals 2

    new-instance v0, Lxd/m;

    invoke-virtual {p1}, Lxd/j;->b()Lsb/k;

    move-result-object v1

    invoke-direct {v0, p0, v1, p2, p1}, Lxd/m;-><init>(Lxd/t;Lsb/k;Lsb/k;Lxd/j;)V

    invoke-virtual {p0}, Lxd/t;->c()Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final synthetic t(Lsb/k;Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object p2, p0, Lxd/t;->f:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, Lxd/t;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    monitor-exit p2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final u(Lsb/k;)V
    .locals 2

    iget-object v0, p0, Lxd/t;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lxd/t;->e:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance p1, Lxd/n;

    invoke-direct {p1, p0}, Lxd/n;-><init>(Lxd/t;)V

    invoke-virtual {p0}, Lxd/t;->c()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final v()Landroid/os/RemoteException;
    .locals 3

    iget-object v0, p0, Lxd/t;->c:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/os/RemoteException;

    const-string v2, " : Binder has died."

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    return-object v1
.end method

.method public final w()V
    .locals 3

    iget-object v0, p0, Lxd/t;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsb/k;

    invoke-virtual {p0}, Lxd/t;->v()Landroid/os/RemoteException;

    move-result-object v2

    invoke-virtual {v1, v2}, Lsb/k;->d(Ljava/lang/Exception;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lxd/t;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method
