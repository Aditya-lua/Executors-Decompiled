.class public final Lae/a1;
.super Lbe/o1;
.source "SourceFile"


# static fields
.field public static j:Lae/a1;


# instance fields
.field public final g:Landroid/os/Handler;

.field public final h:Lae/j0;

.field public final i:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lae/j0;)V
    .locals 3

    new-instance v0, Lbe/q1;

    const-string v1, "SplitInstallListenerRegistry"

    invoke-direct {v0, v1}, Lbe/q1;-><init>(Ljava/lang/String;)V

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, v1, p1}, Lbe/o1;-><init>(Lbe/q1;Landroid/content/IntentFilter;Landroid/content/Context;)V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lae/a1;->g:Landroid/os/Handler;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lae/a1;->i:Ljava/util/Set;

    iput-object p2, p0, Lae/a1;->h:Lae/j0;

    return-void
.end method

.method public static synthetic g(Lae/a1;)Lbe/q1;
    .locals 0

    iget-object p0, p0, Lbe/o1;->a:Lbe/q1;

    return-object p0
.end method

.method public static declared-synchronized h(Landroid/content/Context;)Lae/a1;
    .locals 3

    const-class v0, Lae/a1;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lae/a1;->j:Lae/a1;

    if-nez v1, :cond_0

    new-instance v1, Lae/a1;

    sget-object v2, Lae/r0;->a:Lae/r0;

    invoke-direct {v1, p0, v2}, Lae/a1;-><init>(Landroid/content/Context;Lae/j0;)V

    sput-object v1, Lae/a1;->j:Lae/a1;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p0, Lae/a1;->j:Lae/a1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static bridge synthetic i(Lae/a1;Lae/e;II)V
    .locals 2

    iget-object v0, p0, Lae/a1;->g:Landroid/os/Handler;

    new-instance v1, Lae/z0;

    invoke-direct {v1, p0, p1, p2, p3}, Lae/z0;-><init>(Lae/a1;Lae/e;II)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    const-string v0, "session_state"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lae/e;->n(Landroid/os/Bundle;)Lae/e;

    move-result-object v0

    iget-object v1, p0, Lbe/o1;->a:Lbe/q1;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "ListenerRegistryBroadcastReceiver.onReceive: %s"

    invoke-virtual {v1, v3, v2}, Lbe/q1;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Lae/a1;->h:Lae/j0;

    invoke-interface {v1}, Lae/j0;->zza()Lae/k0;

    move-result-object v1

    invoke-virtual {v0}, Lae/e;->i()I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lae/e;->m()Ljava/util/List;

    move-result-object v2

    new-instance v3, Lae/y0;

    invoke-direct {v3, p0, v0, p2, p1}, Lae/y0;-><init>(Lae/a1;Lae/e;Landroid/content/Intent;Landroid/content/Context;)V

    invoke-interface {v1, v2, v3}, Lae/k0;->a(Ljava/util/List;Lae/i0;)V

    return-void

    :cond_1
    invoke-virtual {p0, v0}, Lae/a1;->j(Lae/e;)V

    return-void
.end method

.method public final declared-synchronized j(Lae/e;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/LinkedHashSet;

    iget-object v1, p0, Lae/a1;->i:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lae/f;

    invoke-interface {v1, p1}, Lvd/a;->a(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-super {p0, p1}, Lbe/o1;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
