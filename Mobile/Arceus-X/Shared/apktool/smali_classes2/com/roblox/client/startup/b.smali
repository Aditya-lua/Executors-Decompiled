.class public Lcom/roblox/client/startup/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/startup/b$a;,
        Lcom/roblox/client/startup/b$b;
    }
.end annotation


# static fields
.field public static final a:Lak/d0;

.field public static b:Lokhttp3/Cache;

.field public static c:Ljavax/net/ssl/X509TrustManager;

.field public static d:Ljavax/net/ssl/SSLSocketFactory;

.field public static e:Z

.field public static final f:Ljava/lang/Object;

.field public static final g:Ljava/lang/Object;

.field public static final h:Ljava/lang/Object;

.field public static i:Z

.field public static j:Lokhttp3/OkHttpClient;

.field public static final k:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final l:Lne/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/e0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final m:Lcom/roblox/client/startup/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lak/d0;

    invoke-direct {v0}, Lak/d0;-><init>()V

    sput-object v0, Lcom/roblox/client/startup/b;->a:Lak/d0;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/roblox/client/startup/b;->f:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/roblox/client/startup/b;->g:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/roblox/client/startup/b;->h:Ljava/lang/Object;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/roblox/client/startup/b;->i:Z

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/roblox/client/startup/b;->k:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Lne/e0;->H()Lne/e0;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/startup/b;->l:Lne/e0;

    new-instance v0, Lcom/roblox/client/startup/b$a;

    invoke-direct {v0, v1}, Lcom/roblox/client/startup/b$a;-><init>(Lak/c0;)V

    sput-object v0, Lcom/roblox/client/startup/b;->m:Lcom/roblox/client/startup/b$a;

    return-void
.end method

.method public static bridge synthetic a()Lne/e0;
    .locals 1

    sget-object v0, Lcom/roblox/client/startup/b;->l:Lne/e0;

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Lcom/roblox/client/startup/b$b;
    .locals 3

    invoke-static {p0}, Lcom/roblox/client/startup/b;->g(Landroid/content/Context;)Lokhttp3/Cache;

    move-result-object p0

    invoke-static {}, Lcom/roblox/client/startup/b;->j()V

    invoke-static {}, Lcom/roblox/client/startup/b;->h()Lokhttp3/OkHttpClient;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget-object v1, Lcom/roblox/client/startup/b;->a:Lak/d0;

    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->eventListener(Lokhttp3/EventListener;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lokhttp3/OkHttpClient$Builder;->cache(Lokhttp3/Cache;)Lokhttp3/OkHttpClient$Builder;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/client/startup/b;->f(Lokhttp3/OkHttpClient$Builder;)V

    sget-object v0, Lcom/roblox/client/startup/b;->d:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_0

    sget-object v2, Lcom/roblox/client/startup/b;->c:Ljavax/net/ssl/X509TrustManager;

    if-eqz v2, :cond_0

    invoke-virtual {p0, v0, v2}, Lokhttp3/OkHttpClient$Builder;->sslSocketFactory(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lokhttp3/OkHttpClient$Builder;

    :cond_0
    invoke-virtual {p0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object p0

    invoke-static {}, Lcom/roblox/client/startup/b;->n()V

    invoke-static {p0}, Lcom/roblox/client/startup/b;->k(Lokhttp3/OkHttpClient;)Lcom/roblox/client/startup/b$b;

    move-result-object p0

    invoke-virtual {v1}, Lak/d0;->j()V

    invoke-static {}, Lcom/roblox/client/startup/b;->e()V

    return-object p0
.end method

.method public static c(Lokhttp3/Response;)Ljava/lang/String;
    .locals 1

    const-string v0, ""

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object p0

    if-nez p0, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p0}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ljava/lang/String;)Lokhttp3/Request;
    .locals 2

    new-instance v0, Lokhttp3/Request$Builder;

    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    invoke-virtual {v0, p0}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p0

    const-string v0, "Pragma"

    const-string v1, "akamai-x-cache-on"

    invoke-virtual {p0, v0, v1}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    invoke-virtual {p0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p0

    return-object p0
.end method

.method public static e()V
    .locals 2

    sget-object v0, Lcom/roblox/client/startup/b;->h:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    sput-object v1, Lcom/roblox/client/startup/b;->d:Ljavax/net/ssl/SSLSocketFactory;

    sput-object v1, Lcom/roblox/client/startup/b;->c:Ljavax/net/ssl/X509TrustManager;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static f(Lokhttp3/OkHttpClient$Builder;)V
    .locals 2

    const/4 v0, 0x0

    sput-boolean v0, Lcom/roblox/client/startup/b;->i:Z

    invoke-static {}, Lak/x;->m()Lak/x;

    move-result-object v0

    sget-object v1, Lak/k2;->b:Lak/k2;

    invoke-virtual {v0, v1}, Lak/x;->H(Lak/k2;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lfi/b;

    invoke-direct {v0}, Lfi/b;-><init>()V

    invoke-virtual {p0, v0}, Lokhttp3/OkHttpClient$Builder;->addInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    new-instance v0, Lfi/a;

    invoke-direct {v0}, Lfi/a;-><init>()V

    invoke-virtual {p0, v0}, Lokhttp3/OkHttpClient$Builder;->addInterceptor(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;

    const/4 v0, 0x1

    sput-boolean v0, Lcom/roblox/client/startup/b;->i:Z

    :cond_0
    invoke-static {}, Lei/n;->c()Lei/n;

    move-result-object v0

    invoke-virtual {p0, v0}, Lokhttp3/OkHttpClient$Builder;->dns(Lokhttp3/Dns;)Lokhttp3/OkHttpClient$Builder;

    return-void
.end method

.method public static g(Landroid/content/Context;)Lokhttp3/Cache;
    .locals 4

    sget-object v0, Lcom/roblox/client/startup/b;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/roblox/client/startup/b;->b:Lokhttp3/Cache;

    if-nez v1, :cond_0

    new-instance v1, Lokhttp3/Cache;

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p0

    const-wide/32 v2, 0x200000

    invoke-direct {v1, p0, v2, v3}, Lokhttp3/Cache;-><init>(Ljava/io/File;J)V

    sput-object v1, Lcom/roblox/client/startup/b;->b:Lokhttp3/Cache;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p0, Lcom/roblox/client/startup/b;->b:Lokhttp3/Cache;

    monitor-exit v0

    return-object p0

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static h()Lokhttp3/OkHttpClient;
    .locals 4

    sget-object v0, Lcom/roblox/client/startup/b;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/roblox/client/startup/b;->j:Lokhttp3/OkHttpClient;

    if-nez v1, :cond_1

    sget-object v1, Lcom/roblox/client/startup/b;->m:Lcom/roblox/client/startup/b$a;

    invoke-virtual {v1}, Lak/d0;->i()V

    new-instance v2, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {v2}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    invoke-virtual {v2, v1}, Lokhttp3/OkHttpClient$Builder;->eventListener(Lokhttp3/EventListener;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v1

    invoke-static {}, Lei/n;->c()Lei/n;

    move-result-object v2

    invoke-virtual {v1, v2}, Lokhttp3/OkHttpClient$Builder;->dns(Lokhttp3/Dns;)Lokhttp3/OkHttpClient$Builder;

    sget-object v2, Lcom/roblox/client/startup/b;->d:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v2, :cond_0

    sget-object v3, Lcom/roblox/client/startup/b;->c:Ljavax/net/ssl/X509TrustManager;

    if-eqz v3, :cond_0

    invoke-virtual {v1, v2, v3}, Lokhttp3/OkHttpClient$Builder;->sslSocketFactory(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lokhttp3/OkHttpClient$Builder;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object v1

    sput-object v1, Lcom/roblox/client/startup/b;->j:Lokhttp3/OkHttpClient;

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lcom/roblox/client/startup/b;->j:Lokhttp3/OkHttpClient;

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static i()Ljava/lang/String;
    .locals 3

    sget-object v0, Lcom/roblox/client/startup/b;->k:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-static {v1}, Lsg/a1;->d(Z)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lp1/t;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public static j()V
    .locals 9

    sget-object v0, Lcom/roblox/client/startup/b;->h:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    :try_start_0
    sget-boolean v3, Lcom/roblox/client/startup/b;->e:Z

    if-nez v3, :cond_4

    sget-object v3, Lcom/roblox/client/startup/b;->d:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v3, :cond_0

    sget-object v3, Lcom/roblox/client/startup/b;->c:Ljavax/net/ssl/X509TrustManager;

    if-eqz v3, :cond_0

    goto :goto_2

    :catchall_0
    move-exception v1

    goto/16 :goto_5

    :catch_0
    move-exception v3

    goto :goto_3

    :catch_1
    move-exception v3

    goto :goto_3

    :catch_2
    move-exception v3

    goto :goto_3

    :catch_3
    move-exception v3

    goto :goto_3

    :cond_0
    invoke-static {}, Ljavax/net/ssl/TrustManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    invoke-virtual {v3}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v4, :cond_2

    aget-object v7, v3, v6

    aget-object v8, v3, v5

    instance-of v8, v8, Ljavax/net/ssl/X509TrustManager;

    if-eqz v8, :cond_1

    check-cast v7, Ljavax/net/ssl/X509TrustManager;

    sput-object v7, Lcom/roblox/client/startup/b;->c:Ljavax/net/ssl/X509TrustManager;

    goto :goto_1

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    sget-object v3, Lcom/roblox/client/startup/b;->c:Ljavax/net/ssl/X509TrustManager;

    if-eqz v3, :cond_3

    const-string v3, "TLS"

    invoke-static {v3}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v3

    new-array v4, v1, [Ljavax/net/ssl/TrustManager;

    sget-object v6, Lcom/roblox/client/startup/b;->c:Ljavax/net/ssl/X509TrustManager;

    aput-object v6, v4, v5

    invoke-virtual {v3, v2, v4, v2}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    invoke-virtual {v3}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v3

    sput-object v3, Lcom/roblox/client/startup/b;->d:Ljavax/net/ssl/SSLSocketFactory;

    goto :goto_4

    :cond_3
    new-instance v3, Ljava/lang/IllegalStateException;

    const-string v4, "Could not find X509TrustManager in TrustManagerFactory"

    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/KeyManagementException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    :goto_2
    :try_start_1
    monitor-exit v0

    return-void

    :goto_3
    const-string v4, "ClientSettingsRequest"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Error initializing the SSL Socket Factory: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v3}, Lgk/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    sput-boolean v1, Lcom/roblox/client/startup/b;->e:Z

    sput-object v2, Lcom/roblox/client/startup/b;->d:Ljavax/net/ssl/SSLSocketFactory;

    sput-object v2, Lcom/roblox/client/startup/b;->c:Ljavax/net/ssl/X509TrustManager;

    :goto_4
    monitor-exit v0

    return-void

    :goto_5
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static k(Lokhttp3/OkHttpClient;)Lcom/roblox/client/startup/b$b;
    .locals 5

    const-string v0, ""

    sget-boolean v1, Lcom/roblox/client/startup/b;->i:Z

    invoke-static {v1}, Lsg/a1;->d(Z)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/roblox/client/startup/b;->d(Ljava/lang/String;)Lokhttp3/Request;

    move-result-object v1

    invoke-virtual {p0, v1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v1

    :try_start_0
    invoke-interface {v1}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    move-result-object v1

    invoke-static {v1}, Lcom/roblox/client/startup/b;->m(Lokhttp3/Response;)Lokhttp3/Response;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    :try_start_1
    sget-boolean v2, Lcom/roblox/client/startup/b;->i:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v3, "X-Signature-Ed25519"

    if-eqz v2, :cond_3

    if-eqz v1, :cond_0

    :try_start_2
    invoke-virtual {v1}, Lokhttp3/Response;->isSuccessful()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_0
    :goto_0
    sget-object v2, Lcom/roblox/client/startup/b;->a:Lak/d0;

    invoke-virtual {v2}, Lak/d0;->i()V

    const/4 v2, 0x0

    invoke-static {v2}, Lsg/a1;->d(Z)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/roblox/client/startup/b;->d(Ljava/lang/String;)Lokhttp3/Request;

    move-result-object v2

    invoke-virtual {p0, v2}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object p0

    invoke-interface {p0}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/client/startup/b;->m(Lokhttp3/Response;)Lokhttp3/Response;

    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    new-instance v2, Lcom/roblox/client/startup/b$b;

    invoke-static {p0}, Lcom/roblox/client/startup/b;->c(Lokhttp3/Response;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v3, v0}, Lokhttp3/Response;->header(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v4, v3}, Lcom/roblox/client/startup/b$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-virtual {p0}, Lokhttp3/Response;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v1, :cond_1

    :try_start_5
    invoke-virtual {v1}, Lokhttp3/Response;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :cond_1
    invoke-static {}, Lei/b;->b()Lei/b;

    move-result-object p0

    invoke-virtual {p0}, Lei/b;->c()V

    return-object v2

    :catchall_1
    move-exception v2

    if-eqz p0, :cond_2

    :try_start_6
    invoke-virtual {p0}, Lokhttp3/Response;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p0

    :try_start_7
    invoke-virtual {v2, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    throw v2

    :cond_3
    new-instance p0, Lcom/roblox/client/startup/b$b;

    invoke-static {v1}, Lcom/roblox/client/startup/b;->c(Lokhttp3/Response;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v3, v0}, Lokhttp3/Response;->header(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v2, v3}, Lcom/roblox/client/startup/b$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    invoke-virtual {v1}, Lokhttp3/Response;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :goto_2
    invoke-static {}, Lei/b;->b()Lei/b;

    move-result-object v0

    invoke-virtual {v0}, Lei/b;->c()V

    return-object p0

    :goto_3
    if-eqz v1, :cond_4

    :try_start_9
    invoke-virtual {v1}, Lokhttp3/Response;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v1

    :try_start_a
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_4
    throw p0
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :catch_0
    :try_start_b
    new-instance p0, Lcom/roblox/client/startup/b$b;

    invoke-direct {p0, v0, v0}, Lcom/roblox/client/startup/b$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    goto :goto_2

    :catchall_4
    move-exception p0

    invoke-static {}, Lei/b;->b()Lei/b;

    move-result-object v0

    invoke-virtual {v0}, Lei/b;->c()V

    throw p0
.end method

.method public static l()V
    .locals 2

    const-string v0, "ClientSettingsRequest"

    const-string v1, "Pre-warm connection failed"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/roblox/client/startup/b;->l:Lne/e0;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lne/e0;->D(Ljava/lang/Object;)Z

    return-void
.end method

.method public static m(Lokhttp3/Response;)Lokhttp3/Response;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lokhttp3/Response;->cacheResponse()Lokhttp3/Response;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lokhttp3/Response;->networkResponse()Lokhttp3/Response;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lokhttp3/Response;->networkResponse()Lokhttp3/Response;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Response;->code()I

    move-result v0

    const/16 v1, 0x130

    if-ne v0, v1, :cond_1

    sget-object v0, Lcom/roblox/client/startup/b;->a:Lak/d0;

    invoke-virtual {v0}, Lak/d0;->a()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lokhttp3/Response;->cacheResponse()Lokhttp3/Response;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lokhttp3/Response;->networkResponse()Lokhttp3/Response;

    move-result-object v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/roblox/client/startup/b;->a:Lak/d0;

    invoke-virtual {v0}, Lak/d0;->b()V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lokhttp3/Response;->networkResponse()Lokhttp3/Response;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lokhttp3/Response;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/roblox/client/startup/b;->a:Lak/d0;

    invoke-virtual {v0}, Lak/d0;->c()V

    :cond_3
    :goto_0
    const-string v0, "Content-Encoding"

    invoke-virtual {p0, v0}, Lokhttp3/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "dcz"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v0, Lcom/roblox/client/startup/b;->a:Lak/d0;

    invoke-virtual {v0}, Lak/d0;->l()V

    goto :goto_1

    :cond_4
    const-string v1, "zst"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lcom/roblox/client/startup/b;->a:Lak/d0;

    invoke-virtual {v0}, Lak/d0;->m()V

    :cond_5
    :goto_1
    invoke-virtual {p0}, Lokhttp3/Response;->networkResponse()Lokhttp3/Response;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {p0}, Lokhttp3/Response;->networkResponse()Lokhttp3/Response;

    move-result-object v0

    const-string v1, "X-Cache"

    invoke-virtual {v0, v1}, Lokhttp3/Response;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_d

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "tcp_hit"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_a

    const-string v1, "tcp_ims_hit"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_a

    const-string v1, "tcm_mem_hit"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_a

    const-string v1, "hit from cloudfront"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    const-string v1, "tcp_refresh_hit"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_9

    const-string v1, "refreshhit from cloudfront"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_2

    :cond_7
    const-string v1, "tcp_miss"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_8

    const-string v1, "tcp_refresh_miss"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_8

    const-string v1, "miss from cloudfront"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    :cond_8
    sget-object v1, Lcom/roblox/client/startup/b;->a:Lak/d0;

    invoke-virtual {v1}, Lak/d0;->f()V

    goto :goto_4

    :cond_9
    :goto_2
    sget-object v1, Lcom/roblox/client/startup/b;->a:Lak/d0;

    invoke-virtual {v1}, Lak/d0;->g()V

    goto :goto_4

    :cond_a
    :goto_3
    sget-object v1, Lcom/roblox/client/startup/b;->a:Lak/d0;

    invoke-virtual {v1}, Lak/d0;->e()V

    :cond_b
    :goto_4
    const-string v1, "cloudfront"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_c

    sget-object v0, Lcom/roblox/client/startup/b;->a:Lak/d0;

    invoke-virtual {v0}, Lak/d0;->h()V

    return-object p0

    :cond_c
    const-string v1, "tcp"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    sget-object v0, Lcom/roblox/client/startup/b;->a:Lak/d0;

    invoke-virtual {v0}, Lak/d0;->d()V

    :cond_d
    return-object p0
.end method

.method public static n()V
    .locals 6

    const-string v0, "ClientSettingsRequest"

    :try_start_0
    sget-object v1, Lcom/roblox/client/startup/b;->k:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_2

    invoke-static {}, Lsg/a1;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    sget-object v1, Lcom/roblox/client/startup/b;->a:Lak/d0;

    invoke-virtual {v1}, Lak/d0;->n()V

    sget-object v2, Lcom/roblox/client/startup/b;->l:Lne/e0;

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/32 v4, 0x7fffffff

    invoke-virtual {v2, v4, v5, v3}, Lne/b$j;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "tlsPreWarmSuccess"

    invoke-static {v2}, Lcom/roblox/universalapp/logging/LoggingProtocol;->k(Ljava/lang/String;)V

    sget-object v2, Lcom/roblox/client/startup/b;->m:Lcom/roblox/client/startup/b$a;

    invoke-virtual {v2}, Lak/d0;->j()V
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_3

    :catch_1
    move-exception v1

    goto :goto_3

    :catch_2
    move-exception v1

    goto :goto_3

    :cond_1
    :goto_0
    invoke-virtual {v1}, Lak/d0;->o()V

    return-void

    :cond_2
    :goto_1
    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Not waiting for connection, as flag URL has changed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lsg/a1;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    sget-object v0, Lcom/roblox/client/startup/b;->a:Lak/d0;

    invoke-virtual {v0}, Lak/d0;->o()V

    return-void

    :goto_3
    :try_start_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Timed out waiting to establish connection: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    sget-object v1, Lcom/roblox/client/startup/b;->a:Lak/d0;

    invoke-virtual {v1}, Lak/d0;->o()V

    throw v0
.end method
