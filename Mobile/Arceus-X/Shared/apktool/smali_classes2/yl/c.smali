.class public Lyl/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyl/c$a;,
        Lyl/c$b;,
        Lyl/c$c;
    }
.end annotation


# instance fields
.field public final a:Lcom/roblox/universalapp/messagebus/MessageBus;

.field public final b:Ljava/lang/Object;

.field public volatile c:Lyl/c$b;

.field public d:Ljava/util/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Optional<",
            "Lyl/c$c;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lyl/c;->b:Ljava/lang/Object;

    iput-object p1, p0, Lyl/c;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance p1, Lyl/c$b;

    invoke-direct {p1}, Lyl/c$b;-><init>()V

    iput-object p1, p0, Lyl/c;->c:Lyl/c$b;

    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    move-result-object p1

    iput-object p1, p0, Lyl/c;->d:Ljava/util/Optional;

    new-instance p1, Ljava/lang/ref/WeakReference;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lyl/c;->e:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static synthetic a(Lyl/c;Lorg/json/JSONObject;)Lmm/l;
    .locals 0

    invoke-virtual {p0, p1}, Lyl/c;->f(Lorg/json/JSONObject;)Lmm/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lorg/json/JSONObject;)Lmm/l;
    .locals 3

    new-instance p0, Lmm/l;

    invoke-direct {p0}, Lmm/l;-><init>()V

    :try_start_0
    iget-object v0, p0, Lmm/l;->a:Lorg/json/JSONObject;

    const-string v1, "isNetworkStatusAvailable"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    const-string v1, "ConnectivityProtocol"

    const-string v2, "JSON exception on onIsNetworkStatusAvailable: "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object p0
.end method

.method public static bridge synthetic c(Lyl/c;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lyl/c;->g(I)V

    return-void
.end method

.method public static d(Lyl/c$b;)Lorg/json/JSONObject;
    .locals 3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "networkStatus"

    iget p0, p0, Lyl/c$b;->a:I

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    const-string v1, "ConnectivityProtocol"

    const-string v2, "JSON exception on get network status: "

    invoke-static {v1, v2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v0
.end method

.method public static h(Landroid/net/ConnectivityManager;Landroid/net/ConnectivityManager$NetworkCallback;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    return-void
.end method

.method public static i()Lyl/c;
    .locals 1

    invoke-static {}, Lyl/c$a;->a()Lyl/c;

    move-result-object v0

    return-object v0
.end method

.method public static l(Landroid/net/ConnectivityManager;Landroid/net/ConnectivityManager$NetworkCallback;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 4

    iget-object v0, p0, Lyl/c;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v1, Lyl/a;

    invoke-direct {v1, p0}, Lyl/a;-><init>(Lyl/c;)V

    const-string v2, "ConnectivityProtocol"

    const-string v3, "GetNetworkStatus"

    invoke-virtual {v0, v2, v3, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->p(Ljava/lang/String;Ljava/lang/String;Lmm/i;)V

    iget-object v0, p0, Lyl/c;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v1, Lyl/b;

    invoke-direct {v1}, Lyl/b;-><init>()V

    const-string v3, "IsNetworkStatusAvailable"

    invoke-virtual {v0, v2, v3, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->p(Ljava/lang/String;Ljava/lang/String;Lmm/i;)V

    return-void
.end method

.method public final synthetic f(Lorg/json/JSONObject;)Lmm/l;
    .locals 2

    iget-object p1, p0, Lyl/c;->b:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lyl/c;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lyl/c;->c:Lyl/c$b;

    iget v1, v1, Lyl/c$b;->a:I

    if-nez v1, :cond_1

    if-eqz v0, :cond_1

    iget-object v1, p0, Lyl/c;->c:Lyl/c$b;

    invoke-static {v0}, Lgk/s;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    iput v0, v1, Lyl/c$b;->a:I

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_1
    iget-object v0, p0, Lyl/c;->c:Lyl/c$b;

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance p1, Lmm/l;

    invoke-direct {p1}, Lmm/l;-><init>()V

    invoke-static {v0}, Lyl/c;->d(Lyl/c$b;)Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p1, Lmm/l;->a:Lorg/json/JSONObject;

    return-object p1

    :goto_2
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final g(I)V
    .locals 3

    iget-object v0, p0, Lyl/c;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lyl/c;->c:Lyl/c$b;

    iget v1, v1, Lyl/c$b;->a:I

    if-ne v1, p1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lyl/c;->c:Lyl/c$b;

    iput p1, v1, Lyl/c$b;->a:I

    iget-object p1, p0, Lyl/c;->c:Lyl/c$b;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v0, "ConnectivityProtocol"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Published network status change with new status: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p1, Lyl/c$b;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lyl/c;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    const-string v1, "ConnectivityProtocol.NetworkStatusChanged.Broadcast"

    invoke-static {p1}, Lyl/c;->d(Lyl/c$b;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->l(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public j(Landroid/content/Context;)V
    .locals 2

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lyl/c;->e:Ljava/lang/ref/WeakReference;

    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    if-nez p1, :cond_0

    const-string p1, "ConnectivityProtocol"

    const-string v0, "ConnectivityManager unavailable for monitoring"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, Lyl/c;->g(I)V

    return-void

    :cond_0
    new-instance v0, Lyl/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lyl/c$c;-><init>(Lyl/c;Lyl/d;)V

    invoke-static {v0}, Ljava/util/Optional;->of(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object v0

    iput-object v0, p0, Lyl/c;->d:Ljava/util/Optional;

    invoke-virtual {v0}, Ljava/util/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-static {p1, v0}, Lyl/c;->h(Landroid/net/ConnectivityManager;Landroid/net/ConnectivityManager$NetworkCallback;)V

    return-void
.end method

.method public k(Landroid/content/Context;)V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "connectivity"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    if-nez p1, :cond_0

    const-string p1, "ConnectivityProtocol"

    const-string v1, "ConnectivityManager unavailable for monitoring clean up"

    invoke-static {p1, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object p1, p0, Lyl/c;->b:Ljava/lang/Object;

    monitor-enter p1

    :try_start_1
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lyl/c;->e:Ljava/lang/ref/WeakReference;

    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    move-result-object v0

    iput-object v0, p0, Lyl/c;->d:Ljava/util/Optional;

    new-instance v0, Lyl/c$b;

    invoke-direct {v0}, Lyl/c$b;-><init>()V

    iput-object v0, p0, Lyl/c;->c:Lyl/c$b;

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :catchall_1
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_2
    iget-object v1, p0, Lyl/c;->d:Ljava/util/Optional;

    invoke-virtual {v1}, Ljava/util/Optional;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lyl/c;->d:Ljava/util/Optional;

    invoke-virtual {v1}, Ljava/util/Optional;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-static {p1, v1}, Lyl/c;->l(Landroid/net/ConnectivityManager;Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_1
    iget-object p1, p0, Lyl/c;->b:Ljava/lang/Object;

    monitor-enter p1

    :try_start_3
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lyl/c;->e:Ljava/lang/ref/WeakReference;

    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    move-result-object v0

    iput-object v0, p0, Lyl/c;->d:Ljava/util/Optional;

    new-instance v0, Lyl/c$b;

    invoke-direct {v0}, Lyl/c$b;-><init>()V

    iput-object v0, p0, Lyl/c;->c:Lyl/c$b;

    monitor-exit p1

    return-void

    :catchall_2
    move-exception v0

    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw v0

    :goto_0
    iget-object v1, p0, Lyl/c;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_4
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v2, p0, Lyl/c;->e:Ljava/lang/ref/WeakReference;

    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    move-result-object v0

    iput-object v0, p0, Lyl/c;->d:Ljava/util/Optional;

    new-instance v0, Lyl/c$b;

    invoke-direct {v0}, Lyl/c$b;-><init>()V

    iput-object v0, p0, Lyl/c;->c:Lyl/c$b;

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    throw p1

    :catchall_3
    move-exception p1

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    throw p1
.end method
