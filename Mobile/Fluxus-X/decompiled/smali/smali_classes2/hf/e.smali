.class public Lhf/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhf/e$b;,
        Lhf/e$a;,
        Lhf/e$c;
    }
.end annotation


# static fields
.field public static final k:Ljava/lang/Object;

.field public static final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lhf/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Lhf/k;

.field public final d:Lof/o;

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final f:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final g:Lof/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lof/x<",
            "Lgg/a;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Lag/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lag/b<",
            "Lyf/f;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lhf/e$a;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lhf/e;->k:Ljava/lang/Object;

    new-instance v0, Lw1/a;

    invoke-direct {v0}, Lw1/a;-><init>()V

    sput-object v0, Lhf/e;->l:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lhf/k;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lhf/e;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lhf/e;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lhf/e;->i:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lhf/e;->j:Ljava/util/List;

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Lhf/e;->a:Landroid/content/Context;

    invoke-static {p2}, Lo9/s;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lhf/e;->b:Ljava/lang/String;

    invoke-static {p3}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lhf/k;

    iput-object p2, p0, Lhf/e;->c:Lhf/k;

    invoke-static {}, Lcom/google/firebase/provider/FirebaseInitProvider;->b()Lhf/l;

    move-result-object p2

    const-string v0, "Firebase"

    invoke-static {v0}, Lkg/c;->b(Ljava/lang/String;)V

    const-string v0, "ComponentDiscovery"

    invoke-static {v0}, Lkg/c;->b(Ljava/lang/String;)V

    const-class v0, Lcom/google/firebase/components/ComponentDiscoveryService;

    invoke-static {p1, v0}, Lof/f;->c(Landroid/content/Context;Ljava/lang/Class;)Lof/f;

    move-result-object v0

    invoke-virtual {v0}, Lof/f;->b()Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lkg/c;->a()V

    const-string v2, "Runtime"

    invoke-static {v2}, Lkg/c;->b(Ljava/lang/String;)V

    sget-object v2, Lpf/a0;->a:Lpf/a0;

    invoke-static {v2}, Lof/o;->l(Ljava/util/concurrent/Executor;)Lof/o$b;

    move-result-object v2

    invoke-virtual {v2, v0}, Lof/o$b;->d(Ljava/util/Collection;)Lof/o$b;

    move-result-object v0

    new-instance v2, Lcom/google/firebase/FirebaseCommonRegistrar;

    invoke-direct {v2}, Lcom/google/firebase/FirebaseCommonRegistrar;-><init>()V

    invoke-virtual {v0, v2}, Lof/o$b;->c(Lcom/google/firebase/components/ComponentRegistrar;)Lof/o$b;

    move-result-object v0

    new-instance v2, Lcom/google/firebase/concurrent/ExecutorsRegistrar;

    invoke-direct {v2}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;-><init>()V

    invoke-virtual {v0, v2}, Lof/o$b;->c(Lcom/google/firebase/components/ComponentRegistrar;)Lof/o$b;

    move-result-object v0

    const-class v2, Landroid/content/Context;

    new-array v3, v1, [Ljava/lang/Class;

    invoke-static {p1, v2, v3}, Lof/c;->q(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Lof/c;

    move-result-object v2

    invoke-virtual {v0, v2}, Lof/o$b;->b(Lof/c;)Lof/o$b;

    move-result-object v0

    const-class v2, Lhf/e;

    new-array v3, v1, [Ljava/lang/Class;

    invoke-static {p0, v2, v3}, Lof/c;->q(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Lof/c;

    move-result-object v2

    invoke-virtual {v0, v2}, Lof/o$b;->b(Lof/c;)Lof/o$b;

    move-result-object v0

    const-class v2, Lhf/k;

    new-array v3, v1, [Ljava/lang/Class;

    invoke-static {p3, v2, v3}, Lof/c;->q(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Lof/c;

    move-result-object p3

    invoke-virtual {v0, p3}, Lof/o$b;->b(Lof/c;)Lof/o$b;

    move-result-object p3

    new-instance v0, Lkg/b;

    invoke-direct {v0}, Lkg/b;-><init>()V

    invoke-virtual {p3, v0}, Lof/o$b;->f(Lof/i;)Lof/o$b;

    move-result-object p3

    invoke-static {p1}, Lu2/p;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/firebase/provider/FirebaseInitProvider;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const-class v0, Lhf/l;

    new-array v1, v1, [Ljava/lang/Class;

    invoke-static {p2, v0, v1}, Lof/c;->q(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Lof/c;

    move-result-object p2

    invoke-virtual {p3, p2}, Lof/o$b;->b(Lof/c;)Lof/o$b;

    :cond_0
    invoke-virtual {p3}, Lof/o$b;->e()Lof/o;

    move-result-object p2

    iput-object p2, p0, Lhf/e;->d:Lof/o;

    invoke-static {}, Lkg/c;->a()V

    new-instance p3, Lof/x;

    new-instance v0, Lhf/c;

    invoke-direct {v0, p0, p1}, Lhf/c;-><init>(Lhf/e;Landroid/content/Context;)V

    invoke-direct {p3, v0}, Lof/x;-><init>(Lag/b;)V

    iput-object p3, p0, Lhf/e;->g:Lof/x;

    const-class p1, Lyf/f;

    invoke-interface {p2, p1}, Lof/d;->d(Ljava/lang/Class;)Lag/b;

    move-result-object p1

    iput-object p1, p0, Lhf/e;->h:Lag/b;

    new-instance p1, Lhf/d;

    invoke-direct {p1, p0}, Lhf/d;-><init>(Lhf/e;)V

    invoke-virtual {p0, p1}, Lhf/e;->g(Lhf/e$a;)V

    invoke-static {}, Lkg/c;->a()V

    return-void
.end method

.method public static synthetic a(Lhf/e;Z)V
    .locals 0

    if-nez p1, :cond_0

    iget-object p0, p0, Lhf/e;->h:Lag/b;

    invoke-interface {p0}, Lag/b;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lyf/f;

    invoke-virtual {p0}, Lyf/f;->h()Lcom/google/android/gms/tasks/Task;

    return-void

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public static synthetic b(Lhf/e;Landroid/content/Context;)Lgg/a;
    .locals 3

    new-instance v0, Lgg/a;

    invoke-virtual {p0}, Lhf/e;->o()Ljava/lang/String;

    move-result-object v1

    iget-object p0, p0, Lhf/e;->d:Lof/o;

    const-class v2, Lxf/c;

    invoke-interface {p0, v2}, Lof/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lxf/c;

    invoke-direct {v0, p1, v1, p0}, Lgg/a;-><init>(Landroid/content/Context;Ljava/lang/String;Lxf/c;)V

    return-object v0
.end method

.method public static synthetic c()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lhf/e;->k:Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic d(Lhf/e;)V
    .locals 0

    invoke-virtual {p0}, Lhf/e;->p()V

    return-void
.end method

.method public static synthetic e(Lhf/e;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lhf/e;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static synthetic f(Lhf/e;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lhf/e;->w(Z)V

    return-void
.end method

.method public static k(Landroid/content/Context;)Ljava/util/List;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Lhf/e;",
            ">;"
        }
    .end annotation

    sget-object p0, Lhf/e;->k:Ljava/lang/Object;

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    sget-object v1, Lhf/e;->l:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static l()Lhf/e;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Lhf/e;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lhf/e;->l:Ljava/util/Map;

    const-string v2, "[DEFAULT]"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhf/e;

    if-eqz v1, :cond_0

    iget-object v2, v1, Lhf/e;->h:Lag/b;

    invoke-interface {v2}, Lag/b;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lyf/f;

    invoke-virtual {v2}, Lyf/f;->h()Lcom/google/android/gms/tasks/Task;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Default FirebaseApp is not initialized in this process "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lv9/n;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ". Make sure to call FirebaseApp.initializeApp(Context) first."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static q(Landroid/content/Context;)Lhf/e;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lhf/e;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lhf/e;->l:Ljava/util/Map;

    const-string v2, "[DEFAULT]"

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lhf/e;->l()Lhf/e;

    move-result-object p0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lhf/k;->a(Landroid/content/Context;)Lhf/k;

    move-result-object v1

    if-nez v1, :cond_1

    const-string p0, "FirebaseApp"

    const-string v1, "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project."

    invoke-static {p0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x0

    monitor-exit v0

    return-object p0

    :cond_1
    invoke-static {p0, v1}, Lhf/e;->r(Landroid/content/Context;Lhf/k;)Lhf/e;

    move-result-object p0

    monitor-exit v0

    return-object p0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static r(Landroid/content/Context;Lhf/k;)Lhf/e;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lhf/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "[DEFAULT]"

    invoke-static {p0, p1, v0}, Lhf/e;->s(Landroid/content/Context;Lhf/k;Ljava/lang/String;)Lhf/e;

    move-result-object p0

    return-object p0
.end method

.method public static s(Landroid/content/Context;Lhf/k;Ljava/lang/String;)Lhf/e;
    .locals 5
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lhf/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Lhf/e$b;->b(Landroid/content/Context;)V

    invoke-static {p2}, Lhf/e;->v(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    :goto_0
    sget-object v0, Lhf/e;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lhf/e;->l:Ljava/util/Map;

    invoke-interface {v1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "FirebaseApp name "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " already exists!"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo9/s;->q(ZLjava/lang/Object;)V

    const-string v2, "Application context cannot be null."

    invoke-static {p0, v2}, Lo9/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lhf/e;

    invoke-direct {v2, p0, p2, p1}, Lhf/e;-><init>(Landroid/content/Context;Ljava/lang/String;Lhf/k;)V

    invoke-interface {v1, p2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, Lhf/e;->p()V

    return-object v2

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static v(Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lhf/e;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lhf/e;->b:Ljava/lang/String;

    check-cast p1, Lhf/e;

    invoke-virtual {p1}, Lhf/e;->m()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public g(Lhf/e$a;)V
    .locals 1

    invoke-virtual {p0}, Lhf/e;->h()V

    iget-object v0, p0, Lhf/e;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lm9/c;->b()Lm9/c;

    move-result-object v0

    invoke-virtual {v0}, Lm9/c;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lhf/e$a;->a(Z)V

    :cond_0
    iget-object v0, p0, Lhf/e;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final h()V
    .locals 2

    iget-object v0, p0, Lhf/e;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "FirebaseApp was deleted"

    invoke-static {v0, v1}, Lo9/s;->q(ZLjava/lang/Object;)V

    return-void
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lhf/e;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public i(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lhf/e;->h()V

    iget-object v0, p0, Lhf/e;->d:Lof/o;

    invoke-interface {v0, p1}, Lof/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public j()Landroid/content/Context;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lhf/e;->h()V

    iget-object v0, p0, Lhf/e;->a:Landroid/content/Context;

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lhf/e;->h()V

    iget-object v0, p0, Lhf/e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public n()Lhf/k;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lhf/e;->h()V

    iget-object v0, p0, Lhf/e;->c:Lhf/k;

    return-object v0
.end method

.method public o()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lhf/e;->m()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-static {v1}, Lv9/c;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lhf/e;->n()Lhf/k;

    move-result-object v1

    invoke-virtual {v1}, Lhf/k;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-static {v1}, Lv9/c;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final p()V
    .locals 3

    iget-object v0, p0, Lhf/e;->a:Landroid/content/Context;

    invoke-static {v0}, Lu2/p;->a(Landroid/content/Context;)Z

    move-result v0

    const-string v1, "FirebaseApp"

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lhf/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lhf/e;->a:Landroid/content/Context;

    invoke-static {v0}, Lhf/e$c;->a(Landroid/content/Context;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Device unlocked: initializing all Firebase APIs for app "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lhf/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lhf/e;->d:Lof/o;

    invoke-virtual {p0}, Lhf/e;->u()Z

    move-result v1

    invoke-virtual {v0, v1}, Lof/o;->o(Z)V

    iget-object v0, p0, Lhf/e;->h:Lag/b;

    invoke-interface {v0}, Lag/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyf/f;

    invoke-virtual {v0}, Lyf/f;->h()Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public t()Z
    .locals 1

    invoke-virtual {p0}, Lhf/e;->h()V

    iget-object v0, p0, Lhf/e;->g:Lof/x;

    invoke-virtual {v0}, Lof/x;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgg/a;

    invoke-virtual {v0}, Lgg/a;->b()Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lo9/q;->d(Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "name"

    iget-object v2, p0, Lhf/e;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    const-string v1, "options"

    iget-object v2, p0, Lhf/e;->c:Lhf/k;

    invoke-virtual {v0, v1, v2}, Lo9/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lo9/q$a;

    move-result-object v0

    invoke-virtual {v0}, Lo9/q$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Z
    .locals 2

    const-string v0, "[DEFAULT]"

    invoke-virtual {p0}, Lhf/e;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final w(Z)V
    .locals 2

    const-string v0, "FirebaseApp"

    const-string v1, "Notifying background state change listeners."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lhf/e;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhf/e$a;

    invoke-interface {v1, p1}, Lhf/e$a;->a(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method
