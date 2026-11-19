.class public Lfm/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfm/j$a;
    }
.end annotation


# instance fields
.field public a:Ljava/util/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Optional<",
            "Lvd/c;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/util/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Optional<",
            "Lvd/c$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    move-result-object v0

    iput-object v0, p0, Lfm/j;->a:Ljava/util/Optional;

    .line 4
    invoke-static {}, Ljava/util/Optional;->empty()Ljava/util/Optional;

    move-result-object v0

    iput-object v0, p0, Lfm/j;->b:Ljava/util/Optional;

    return-void
.end method

.method public synthetic constructor <init>(Lfm/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lfm/j;-><init>()V

    return-void
.end method

.method public static synthetic a(Lfm/j;Lvd/c$c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lfm/j;->g(Lvd/c$c;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/Exception;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to set token provider "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "DeviceIntegrityManager"

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static synthetic c(Ljava/lang/Exception;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to re-set token provider "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "DeviceIntegrityManager"

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static synthetic d(Lfm/j;Lvd/c$c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lfm/j;->h(Lvd/c$c;)V

    return-void
.end method

.method public static j()Lfm/j;
    .locals 1

    invoke-static {}, Lfm/j$a;->a()Lfm/j;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public e(Lorg/json/JSONObject;)Lcom/roblox/universalapp/messagebus/Response;
    .locals 7

    new-instance v0, Lcom/roblox/universalapp/messagebus/Response;

    invoke-direct {v0}, Lcom/roblox/universalapp/messagebus/Response;-><init>()V

    sget-object v1, Lfm/m;->b:Lfm/m;

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->f3()Z

    move-result v2

    const-string v3, "DeviceIntegrityManager"

    const-string v4, ""

    if-eqz v2, :cond_0

    :try_start_0
    const-string v2, "refreshTokenProvider"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v2
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "JSON exception on retrieving refreshTokenProvider key: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_0

    iget-object v2, p0, Lfm/j;->a:Ljava/util/Optional;

    invoke-virtual {v2}, Ljava/util/Optional;->isPresent()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string p1, "Refreshing token provider"

    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lfm/j;->a:Ljava/util/Optional;

    invoke-virtual {p1}, Ljava/util/Optional;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvd/c;

    invoke-static {}, Lvd/c$a;->c()Lvd/c$a$a;

    move-result-object v1

    const-wide v2, 0xd344527c8L

    invoke-virtual {v1, v2, v3}, Lvd/c$a$a;->b(J)Lvd/c$a$a;

    move-result-object v1

    invoke-virtual {v1}, Lvd/c$a$a;->a()Lvd/c$a;

    move-result-object v1

    invoke-interface {p1, v1}, Lvd/c;->a(Lvd/c$a;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v1, Lfm/h;

    invoke-direct {v1, p0}, Lfm/h;-><init>(Lfm/j;)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/tasks/Task;->g(Ltb/g;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v1, Lfm/i;

    invoke-direct {v1}, Lfm/i;-><init>()V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/tasks/Task;->e(Ltb/f;)Lcom/google/android/gms/tasks/Task;

    sget-object p1, Lfm/m;->h:Lfm/m;

    invoke-static {v4, p1}, Lfm/l;->a(Ljava/lang/String;Lfm/m;)Lorg/json/JSONObject;

    move-result-object p1

    iput-object p1, v0, Lcom/roblox/universalapp/messagebus/Response;->params:Lorg/json/JSONObject;

    return-object v0

    :cond_0
    :try_start_1
    invoke-static {}, Lcom/roblox/universalapp/account/JNIAccountProtocol;->getRequestHashKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2

    :try_start_2
    invoke-static {}, Lcom/roblox/universalapp/account/JNIAccountProtocol;->getTimeoutKey()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v5
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    move-object v2, v4

    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "JSON exception on retrieving integrity token: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-wide/16 v5, 0x12c

    :goto_2
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lfm/m;->c:Lfm/m;

    invoke-static {v4, p1}, Lfm/l;->a(Ljava/lang/String;Lfm/m;)Lorg/json/JSONObject;

    move-result-object p1

    iput-object p1, v0, Lcom/roblox/universalapp/messagebus/Response;->params:Lorg/json/JSONObject;

    return-object v0

    :cond_1
    iget-object p1, p0, Lfm/j;->b:Ljava/util/Optional;

    invoke-virtual {p1}, Ljava/util/Optional;->isPresent()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lfm/j;->b:Ljava/util/Optional;

    invoke-virtual {p1}, Ljava/util/Optional;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvd/c$c;

    invoke-static {}, Lvd/c$d;->a()Lvd/c$d$a;

    move-result-object v1

    invoke-virtual {v1, v2}, Lvd/c$d$a;->b(Ljava/lang/String;)Lvd/c$d$a;

    move-result-object v1

    invoke-virtual {v1}, Lvd/c$d$a;->a()Lvd/c$d;

    move-result-object v1

    invoke-interface {p1, v1}, Lvd/c$c;->a(Lvd/c$d;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    :try_start_3
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p1, v5, v6, v1}, Ltb/m;->b(Lcom/google/android/gms/tasks/Task;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvd/c$b;

    invoke-virtual {p1}, Lvd/c$b;->a()Ljava/lang/String;

    move-result-object v4

    sget-object v1, Lfm/m;->g:Lfm/m;
    :try_end_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_6

    :catch_3
    move-exception p1

    goto :goto_3

    :catch_4
    move-exception p1

    goto :goto_4

    :catch_5
    move-exception p1

    goto :goto_5

    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Integrity request timed out: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v1, Lfm/m;->d:Lfm/m;

    goto :goto_6

    :goto_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Integrity request interrupted: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v1, Lfm/m;->f:Lfm/m;

    goto :goto_6

    :goto_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception during integrity token retrieval: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v1, Lfm/m;->e:Lfm/m;

    :cond_2
    :goto_6
    invoke-static {v4, v1}, Lfm/l;->a(Ljava/lang/String;Lfm/m;)Lorg/json/JSONObject;

    move-result-object p1

    iput-object p1, v0, Lcom/roblox/universalapp/messagebus/Response;->params:Lorg/json/JSONObject;

    return-object v0
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final synthetic g(Lvd/c$c;)V
    .locals 2

    const-string v0, "DeviceIntegrityManager"

    const-string v1, "Successfully re-set integrity token provider"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p1}, Ljava/util/Optional;->of(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object p1

    iput-object p1, p0, Lfm/j;->b:Ljava/util/Optional;

    return-void
.end method

.method public final synthetic h(Lvd/c$c;)V
    .locals 2

    const-string v0, "DeviceIntegrityManager"

    const-string v1, "Successfully set integrity token provider"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p1}, Ljava/util/Optional;->of(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object p1

    iput-object p1, p0, Lfm/j;->b:Ljava/util/Optional;

    return-void
.end method

.method public declared-synchronized i(Landroid/content/Context;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lfm/j;->b:Ljava/util/Optional;

    invoke-virtual {v0}, Ljava/util/Optional;->isPresent()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "DeviceIntegrityManager"

    const-string v0, "Token provider already initialized"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :try_start_1
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->f3()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lfm/j;->a:Ljava/util/Optional;

    invoke-static {v0}, Lfm/e;->a(Ljava/util/Optional;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/play/core/integrity/IntegrityManagerFactory;->a(Landroid/content/Context;)Lvd/c;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Optional;->of(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object p1

    iput-object p1, p0, Lfm/j;->a:Ljava/util/Optional;

    :cond_1
    iget-object p1, p0, Lfm/j;->a:Ljava/util/Optional;

    invoke-virtual {p1}, Ljava/util/Optional;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvd/c;

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/play/core/integrity/IntegrityManagerFactory;->a(Landroid/content/Context;)Lvd/c;

    move-result-object p1

    :goto_0
    invoke-static {}, Lvd/c$a;->c()Lvd/c$a$a;

    move-result-object v0

    const-wide v1, 0xd344527c8L

    invoke-virtual {v0, v1, v2}, Lvd/c$a$a;->b(J)Lvd/c$a$a;

    move-result-object v0

    invoke-virtual {v0}, Lvd/c$a$a;->a()Lvd/c$a;

    move-result-object v0

    invoke-interface {p1, v0}, Lvd/c;->a(Lvd/c$a;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lfm/f;

    invoke-direct {v0, p0}, Lfm/f;-><init>(Lfm/j;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->g(Ltb/g;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lfm/g;

    invoke-direct {v0}, Lfm/g;-><init>()V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->e(Ltb/f;)Lcom/google/android/gms/tasks/Task;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
