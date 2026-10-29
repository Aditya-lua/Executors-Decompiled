.class public final Lga/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:Ljava/util/concurrent/atomic/AtomicReference;


# instance fields
.field public final a:Landroid/app/Application;

.field public final b:Landroid/app/Application$ActivityLifecycleCallbacks;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/util/Set;

.field public e:Ljava/lang/ref/WeakReference;

.field public f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, Lga/o;->g:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lga/n;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lga/n;-><init>(Lga/o;[B)V

    iput-object v0, p0, Lga/o;->b:Landroid/app/Application$ActivityLifecycleCallbacks;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lga/o;->c:Ljava/lang/Object;

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lga/o;->d:Ljava/util/Set;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lga/o;->f:Z

    iput-object p1, p0, Lga/o;->a:Landroid/app/Application;

    return-void
.end method

.method public static a(Landroid/app/Application;)Lga/o;
    .locals 2

    invoke-static {p0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lga/o;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lga/o;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    new-instance v1, Lga/o;

    invoke-direct {v1, p0}, Lga/o;-><init>(Landroid/app/Application;)V

    const/4 p0, 0x0

    invoke-static {v0, p0, v1}, Lp1/t;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lga/o;

    return-object p0
.end method


# virtual methods
.method public final b()V
    .locals 3

    iget-object v0, p0, Lga/o;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lga/o;->f:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lga/o;->a:Landroid/app/Application;

    iget-object v2, p0, Lga/o;->b:Landroid/app/Application$ActivityLifecycleCallbacks;

    invoke-virtual {v1, v2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lga/o;->f:Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final c(Lga/l;)V
    .locals 2

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lga/o;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lga/o;->d:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1}, Lga/o;->h(Lga/l;)V

    return-void

    :cond_0
    sget-object v0, Lsb/l;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lga/m;

    invoke-direct {v1, p0, p1}, Lga/m;-><init>(Lga/o;Lga/l;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final d()Landroid/app/Activity;
    .locals 2

    iget-object v0, p0, Lga/o;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lga/o;->e:Ljava/lang/ref/WeakReference;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final synthetic e(Lga/l;)V
    .locals 0

    invoke-virtual {p0, p1}, Lga/o;->h(Lga/l;)V

    return-void
.end method

.method public final synthetic f(Landroid/app/Activity;)V
    .locals 3

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lga/o;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lga/o;->d()Landroid/app/Activity;

    move-result-object v1

    if-ne v1, p1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lga/o;->e:Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lga/o;->d:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lga/l;

    invoke-interface {v2, p1}, Lga/l;->a(Landroid/app/Activity;)V

    goto :goto_0

    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final synthetic g(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lga/o;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lga/o;->e:Ljava/lang/ref/WeakReference;

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lga/o;->e:Ljava/lang/ref/WeakReference;

    :cond_1
    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final h(Lga/l;)V
    .locals 1

    invoke-virtual {p0}, Lga/o;->d()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1, v0}, Lga/l;->a(Landroid/app/Activity;)V

    return-void
.end method
