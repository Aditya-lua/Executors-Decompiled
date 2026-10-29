.class public Lcom/roblox/client/startup/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/startup/a$b;,
        Lcom/roblox/client/startup/a$a;
    }
.end annotation


# static fields
.field public static a:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/roblox/client/startup/a$b;",
            ">;"
        }
    .end annotation
.end field

.field public static b:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Lcom/roblox/client/startup/b$b;",
            ">;"
        }
    .end annotation
.end field

.field public static c:Z

.field public static d:Ljava/lang/String;

.field public static e:J

.field public static final f:Ljava/lang/Object;

.field public static final g:Ljava/lang/Object;

.field public static final h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static i:Z

.field public static j:Lorg/json/JSONObject;

.field public static final k:Lcom/roblox/client/startup/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lcom/roblox/client/startup/a$b;->a:Lcom/roblox/client/startup/a$b;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/roblox/client/startup/a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x1

    sput-boolean v0, Lcom/roblox/client/startup/a;->c:Z

    const-string v0, "roblox"

    sput-object v0, Lcom/roblox/client/startup/a;->d:Ljava/lang/String;

    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/roblox/client/startup/a;->e:J

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/roblox/client/startup/a;->f:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/roblox/client/startup/a;->g:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/roblox/client/startup/a;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    sput-boolean v1, Lcom/roblox/client/startup/a;->i:Z

    const/4 v0, 0x0

    sput-object v0, Lcom/roblox/client/startup/a;->j:Lorg/json/JSONObject;

    new-instance v1, Lcom/roblox/client/startup/a$a;

    invoke-direct {v1, v0}, Lcom/roblox/client/startup/a$a;-><init>(Lak/l;)V

    sput-object v1, Lcom/roblox/client/startup/a;->k:Lcom/roblox/client/startup/a$a;

    return-void
.end method

.method public static A(Lne/e0;Lcom/roblox/client/startup/b$b;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne/e0<",
            "Lcom/roblox/client/startup/b$b;",
            ">;",
            "Lcom/roblox/client/startup/b$b;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    invoke-static {p1, p2}, Lcom/roblox/client/startup/a;->E(Lcom/roblox/client/startup/b$b;Landroid/content/Context;)Z

    invoke-static {}, Lcom/roblox/client/startup/a;->h()V

    invoke-static {}, Lcom/roblox/client/startup/a;->x()V

    invoke-virtual {p0, p1}, Lne/e0;->D(Ljava/lang/Object;)Z

    invoke-static {}, Lwk/j;->c()Lwk/j;

    move-result-object p0

    instance-of p0, p0, Lei/s;

    if-eqz p0, :cond_0

    invoke-static {}, Lwk/j;->c()Lwk/j;

    move-result-object p0

    check-cast p0, Lei/s;

    invoke-virtual {p0}, Lei/s;->k()V

    :cond_0
    return-void
.end method

.method public static B(Landroid/content/Context;)V
    .locals 2

    invoke-static {p0}, Lsg/a1;->U(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    sget-object v1, Lcom/roblox/client/flags/b;->a:Lcom/roblox/client/flags/b;

    invoke-virtual {v1, v0}, Lcom/roblox/client/flags/b;->f(Landroid/content/SharedPreferences;)V

    sget-object v0, Lcom/roblox/client/startup/a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lcom/roblox/client/startup/a$b;->d:Lcom/roblox/client/startup/a$b;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->D1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->getOtaPrefs(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->getActiveBehaviorNames(Landroid/content/SharedPreferences;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {p0, v1}, Lcom/roblox/client/scheduledwork/OtaConfigHandler;->checkAndPromoteWorkerBlob(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/roblox/client/scheduledwork/OtaPollingWorker;->x(Landroid/content/Context;)V

    return-void
.end method

.method public static C(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lcom/roblox/client/startup/a;->d:Ljava/lang/String;

    return-void
.end method

.method public static D()V
    .locals 6

    const-string v0, "1"

    :try_start_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->V()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-static {}, Landroid/os/Process;->is64Bit()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-interface {v1}, Lth/i;->W2()Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x200

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Lth/i;->k()Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v2, 0x300

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Lth/i;->r2()Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x400

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x1

    if-eqz v2, :cond_3

    const-string v4, "MIMALLOC_RESERVE_OS_MEMORY"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "M"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2, v3}, Landroid/system/Os;->setenv(Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_3
    invoke-interface {v1}, Lth/i;->M3()Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v2, "MIMALLOC_DISALLOW_OS_ALLOC"

    invoke-static {v2, v0, v3}, Landroid/system/Os;->setenv(Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "MIMALLOC_LIMIT_OS_ALLOC"

    invoke-static {v2, v0, v3}, Landroid/system/Os;->setenv(Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_4
    invoke-interface {v1}, Lth/i;->e2()Z

    move-result v0
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "0"

    if-eqz v0, :cond_5

    :try_start_1
    const-string v0, "MIMALLOC_EAGER_COMMIT"

    invoke-static {v0, v2, v3}, Landroid/system/Os;->setenv(Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_5
    invoke-interface {v1}, Lth/i;->i3()Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "MIMALLOC_ARENA_EAGER_COMMIT"

    invoke-static {v0, v2, v3}, Landroid/system/Os;->setenv(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_1
    .catch Landroid/system/ErrnoException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_6
    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "tuneMimalloc failed "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroid/system/ErrnoException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AndroidAppSettings"

    invoke-static {v1, v0}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static E(Lcom/roblox/client/startup/b$b;Landroid/content/Context;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/roblox/client/startup/b$b;->c()Lorg/json/JSONObject;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const/4 v1, 0x1

    invoke-static {p0, v1}, Lcom/roblox/client/startup/a;->H(Lorg/json/JSONObject;I)Z

    move-result v1

    invoke-static {p1, p0, v0}, Lcom/roblox/client/startup/a;->G(Landroid/content/Context;Lorg/json/JSONObject;Z)V

    sget-object p0, Lcom/roblox/client/startup/a;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-static {v1}, Lcom/roblox/client/startup/a;->y(Z)V

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/roblox/client/startup/a;->k(Landroid/content/Context;)V

    :goto_0
    invoke-static {p1}, Lcom/roblox/client/startup/a;->l(Landroid/content/Context;)V

    sget-object p0, Lth/f;->a:Lth/f;

    invoke-static {p1}, Lsg/a1;->U(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-virtual {p0, v1}, Lth/f;->h(Landroid/content/SharedPreferences;)V

    invoke-static {p1}, Lvg/g;->a(Landroid/content/Context;)V

    return v0
.end method

.method public static F(Ljava/lang/String;Landroid/content/Context;)V
    .locals 1

    invoke-static {p0}, Lcom/roblox/client/startup/b$b;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    invoke-static {p1, p0, v0}, Lcom/roblox/client/startup/a;->G(Landroid/content/Context;Lorg/json/JSONObject;Z)V

    invoke-static {p0, v0}, Lcom/roblox/client/startup/a;->H(Lorg/json/JSONObject;I)Z

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/roblox/client/startup/a;->k(Landroid/content/Context;)V

    :goto_0
    invoke-static {p1}, Lcom/roblox/client/startup/a;->l(Landroid/content/Context;)V

    sget-object p0, Lth/f;->a:Lth/f;

    invoke-static {p1}, Lsg/a1;->U(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-virtual {p0, v0}, Lth/f;->h(Landroid/content/SharedPreferences;)V

    invoke-static {p1}, Lvg/g;->a(Landroid/content/Context;)V

    return-void
.end method

.method public static G(Landroid/content/Context;Lorg/json/JSONObject;Z)V
    .locals 1

    if-nez p2, :cond_0

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->W0()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-static {p0}, Lgk/w;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "foreground"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p0, Lcom/roblox/client/startup/a;->k:Lcom/roblox/client/startup/a$a;

    invoke-virtual {p0, p1}, Lcom/roblox/client/startup/a$a;->b(Lorg/json/JSONObject;)V

    return-void

    :cond_0
    sget-object p2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-instance v0, Lak/g;

    invoke-direct {v0, p0, p1}, Lak/g;-><init>(Landroid/content/Context;Lorg/json/JSONObject;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static H(Lorg/json/JSONObject;I)Z
    .locals 6

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/g;->R3()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/roblox/client/flags/a;

    invoke-static {p0, v3, v2}, Lcom/roblox/client/startup/a;->p(Lorg/json/JSONObject;Ljava/lang/String;Lcom/roblox/client/flags/a;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5

    :try_start_0
    instance-of v5, v2, Lcom/roblox/client/flags/a$a;

    if-nez v5, :cond_4

    instance-of v5, v2, Lcom/roblox/client/flags/a$d;

    if-eqz v5, :cond_0

    goto :goto_2

    :cond_0
    instance-of v5, v2, Lcom/roblox/client/flags/a$c;

    if-eqz v5, :cond_1

    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    goto :goto_3

    :cond_1
    instance-of v5, v2, Lcom/roblox/client/flags/a$b;

    if-nez v5, :cond_3

    instance-of v5, v2, Lcom/roblox/client/flags/a$f;

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    :cond_3
    :goto_1
    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_3

    :cond_4
    :goto_2
    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    :goto_3
    invoke-virtual {v2, v4, p1}, Lcom/roblox/client/flags/a;->f(Ljava/lang/Object;I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x1

    goto :goto_0

    :catch_0
    invoke-virtual {v2, p1}, Lcom/roblox/client/flags/a;->c(I)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error reading value for setting: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AndroidAppSettings"

    invoke-static {v3, v2}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_5
    invoke-virtual {v2, p1}, Lcom/roblox/client/flags/a;->c(I)V

    goto :goto_0

    :cond_6
    return v1
.end method

.method public static I(Ljava/lang/String;)V
    .locals 5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-static {}, Lcom/roblox/client/startup/a;->t()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "native_lib_wait_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "_begin"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->l(Ljava/lang/String;Ljava/lang/Long;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "_end"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->k(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;Lne/e0;)V
    .locals 4

    sget-object v0, Lcom/roblox/client/startup/a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lcom/roblox/client/startup/a$b;->b:Lcom/roblox/client/startup/a$b;

    sget-object v2, Lcom/roblox/client/startup/a$b;->c:Lcom/roblox/client/startup/a$b;

    invoke-static {v0, v1, v2}, Lp1/t;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {}, Lcom/roblox/client/startup/a;->w()V

    const-string v0, "vb_flag_enabled"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->k(Ljava/lang/String;)V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sget-object v2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-instance v3, Lak/j;

    invoke-direct {v3, p0, v0, p1}, Lak/j;-><init>(Landroid/content/Context;Ljava/util/concurrent/atomic/AtomicBoolean;Lne/e0;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-static {p0}, Lcom/roblox/client/startup/b;->b(Landroid/content/Context;)Lcom/roblox/client/startup/b$b;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    const-string v1, "AndroidAppSettings"

    if-eqz v0, :cond_0

    const-string v0, "[VersionB] Network won the race."

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p1, v2, p0}, Lcom/roblox/client/startup/a;->A(Lne/e0;Lcom/roblox/client/startup/b$b;Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    const-string p1, "[VersionB] Network fetch complete; cache already won."

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    invoke-static {v2, p0}, Lcom/roblox/client/startup/FlagCacheUtils;->storePendingVersionBWrite(Lcom/roblox/client/startup/b$b;Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic b(Landroid/content/Context;Ljava/util/concurrent/atomic/AtomicBoolean;Lne/e0;)V
    .locals 6

    const-string v0, "AndroidAppSettings"

    :try_start_0
    invoke-static {p0}, Lcom/roblox/client/startup/FlagCacheUtils;->tryLoadVersionBCache(Landroid/content/Context;)Lcom/roblox/client/startup/b$b;

    move-result-object v1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    if-nez v1, :cond_0

    invoke-static {}, Lcom/roblox/client/startup/FlagCacheUtils;->getLastCacheOutcomeValue()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "vb_cache_"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/roblox/universalapp/logging/LoggingProtocol;->l(Ljava/lang/String;Ljava/lang/Long;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "[VersionB] Cache miss ("

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "); waiting for network."

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :catch_0
    move-exception p0

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-virtual {p1, v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "vb_cache_applied"

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {p1, v4}, Lcom/roblox/universalapp/logging/LoggingProtocol;->l(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->t3()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {p0}, Lcom/roblox/client/startup/FlagCacheUtils;->wasVersionBCacheWrittenByWorker(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "vb_cache_source_worker"

    goto :goto_0

    :cond_1
    const-string p1, "vb_cache_source_previous_launch"

    :goto_0
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/roblox/universalapp/logging/LoggingProtocol;->l(Ljava/lang/String;Ljava/lang/Long;)V

    :cond_2
    const-string p1, "[VersionB] Cache won the race."

    invoke-static {v0, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/client/startup/FlagCacheUtils$a;->b:Lcom/roblox/client/startup/FlagCacheUtils$a;

    invoke-static {p1}, Lcom/roblox/client/startup/FlagCacheUtils;->recordVersionBCacheOutcome(Lcom/roblox/client/startup/FlagCacheUtils$a;)V

    invoke-static {p2, v1, p0}, Lcom/roblox/client/startup/a;->A(Lne/e0;Lcom/roblox/client/startup/b$b;Landroid/content/Context;)V

    return-void

    :cond_3
    const-string p0, "vb_network_faster"

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->l(Ljava/lang/String;Ljava/lang/Long;)V

    const-string p0, "[VersionB] Cache hit, but network already won."

    invoke-static {v0, p0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Lcom/roblox/client/startup/FlagCacheUtils$a;->i:Lcom/roblox/client/startup/FlagCacheUtils$a;

    invoke-static {p0}, Lcom/roblox/client/startup/FlagCacheUtils;->recordVersionBCacheOutcome(Lcom/roblox/client/startup/FlagCacheUtils$a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    const-string p1, "Failed to read cache"

    invoke-static {v0, p1, p0}, Lgk/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public static synthetic c(Landroid/content/Context;)V
    .locals 2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->j0()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v1, "cookie_manager_init_begin"

    invoke-static {v1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->k(Ljava/lang/String;)V

    :cond_0
    invoke-static {}, Lwk/j;->c()Lwk/j;

    if-eqz v0, :cond_1

    const-string v0, "cookie_manager_init_end"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->k(Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Lgk/c;->g()Lgk/c;

    move-result-object v0

    new-instance v1, Lak/h;

    invoke-direct {v1}, Lak/h;-><init>()V

    invoke-virtual {v0, p0, v1}, Lgk/c;->f(Landroid/content/Context;Lgk/a$a;)V

    return-void
.end method

.method public static synthetic d(Landroid/content/Context;Lcom/roblox/client/startup/b$b;)Lne/x;
    .locals 0

    sget-object p1, Lth/f;->a:Lth/f;

    invoke-virtual {p1}, Lth/f;->q()V

    invoke-static {p0}, Lcom/roblox/client/startup/a;->j(Landroid/content/Context;)Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lgk/c;->c:Lne/e0;

    invoke-virtual {v0, p0}, Lne/e0;->D(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic f(Landroid/content/Context;Lorg/json/JSONObject;)V
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lsg/a1;->L(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const-string v0, "AndroidAppSettingsCache"

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public static declared-synchronized g(Landroid/content/Context;)V
    .locals 10

    const-class v1, Lcom/roblox/client/startup/a;

    monitor-enter v1

    :try_start_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->t3()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-static {p0}, Lsg/a1;->U(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v3, "flag_task_scheduled"

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {p0}, Lx5/p0;->h(Landroid/content/Context;)Lx5/p0;

    move-result-object p0

    const-string v3, "fetch_flags"

    invoke-virtual {p0, v3}, Lx5/p0;->a(Ljava/lang/String;)Lx5/a0;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const-string v0, "flag_task_scheduled"

    invoke-interface {p0, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto/16 :goto_1

    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    :cond_1
    :try_start_1
    invoke-static {p0}, Lx5/p0;->h(Landroid/content/Context;)Lx5/p0;

    move-result-object v0

    invoke-static {p0}, Lsg/a1;->U(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const-string v3, "last_startup_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-interface {p0, v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    const-string v3, "flag_task_scheduled"

    const/4 v4, 0x1

    invoke-interface {p0, v3, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    new-instance p0, Lx5/d$a;

    invoke-direct {p0}, Lx5/d$a;-><init>()V

    sget-object v3, Lx5/x;->b:Lx5/x;

    invoke-virtual {p0, v3}, Lx5/d$a;->b(Lx5/x;)Lx5/d$a;

    move-result-object p0

    invoke-virtual {p0, v2}, Lx5/d$a;->d(Z)Lx5/d$a;

    move-result-object p0

    invoke-virtual {p0, v4}, Lx5/d$a;->c(Z)Lx5/d$a;

    move-result-object p0

    invoke-virtual {p0, v2}, Lx5/d$a;->f(Z)Lx5/d$a;

    move-result-object p0

    invoke-virtual {p0, v2}, Lx5/d$a;->e(Z)Lx5/d$a;

    move-result-object p0

    invoke-virtual {p0}, Lx5/d$a;->a()Lx5/d;

    move-result-object p0

    new-instance v2, Lx5/g0$a;

    const-class v3, Lcom/roblox/client/scheduledwork/FlagFetchWorker;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v4

    invoke-interface {v4}, Lth/i;->A4()I

    move-result v4

    int-to-long v4, v4

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v7

    invoke-interface {v7}, Lth/i;->u1()I

    move-result v7

    int-to-long v7, v7

    move-object v9, v6

    invoke-direct/range {v2 .. v9}, Lx5/g0$a;-><init>(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;JLjava/util/concurrent/TimeUnit;)V

    const-string v3, "fetch_flags"

    invoke-virtual {v2, v3}, Lx5/q0$a;->a(Ljava/lang/String;)Lx5/q0$a;

    move-result-object v2

    check-cast v2, Lx5/g0$a;

    invoke-virtual {v2, p0}, Lx5/q0$a;->k(Lx5/d;)Lx5/q0$a;

    move-result-object p0

    check-cast p0, Lx5/g0$a;

    sget-object v2, Lx5/a;->a:Lx5/a;

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x3c

    invoke-virtual {p0, v2, v4, v5, v3}, Lx5/q0$a;->i(Lx5/a;JLjava/util/concurrent/TimeUnit;)Lx5/q0$a;

    move-result-object p0

    check-cast p0, Lx5/g0$a;

    invoke-virtual {p0}, Lx5/q0$a;->b()Lx5/q0;

    move-result-object p0

    check-cast p0, Lx5/g0;

    const-string v2, "fetch_flags"

    const-string v3, "requested periodic work"

    invoke-static {v2, v3}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v2, "fetch_flags"

    sget-object v3, Lx5/i;->a:Lx5/i;

    invoke-virtual {v0, v2, v3, p0}, Lx5/p0;->e(Ljava/lang/String;Lx5/i;Lx5/g0;)Lx5/a0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-void

    :goto_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static h()V
    .locals 2

    sget-wide v0, Lcom/roblox/client/startup/a;->e:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "fetch_flag_begin"

    invoke-static {v1, v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->l(Ljava/lang/String;Ljava/lang/Long;)V

    return-void
.end method

.method public static declared-synchronized i(Landroid/content/Context;)Lne/x;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lne/x<",
            "Lcom/roblox/client/startup/b$b;",
            ">;"
        }
    .end annotation

    const-class v0, Lcom/roblox/client/startup/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/roblox/client/startup/a;->b:Lne/x;

    if-eqz v1, :cond_0

    sget-boolean v2, Lcom/roblox/client/startup/a;->c:Z

    if-eqz v2, :cond_0

    const/4 p0, 0x0

    sput-boolean p0, Lcom/roblox/client/startup/a;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    :try_start_1
    invoke-static {p0}, Lcom/roblox/client/startup/a;->j(Landroid/content/Context;)Lne/x;

    move-result-object p0

    sput-object p0, Lcom/roblox/client/startup/a;->b:Lne/x;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p0

    :goto_0
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static j(Landroid/content/Context;)Lne/x;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lne/x<",
            "Lcom/roblox/client/startup/b$b;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lne/e0;->H()Lne/e0;

    move-result-object v0

    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-instance v2, Lak/i;

    invoke-direct {v2, p0, v0}, Lak/i;-><init>(Landroid/content/Context;Lne/e0;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public static k(Landroid/content/Context;)V
    .locals 2

    invoke-static {p0}, Lsg/a1;->L(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string v0, "AndroidAppSettingsCache"

    const-string v1, "{}"

    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :goto_0
    const/4 p0, 0x1

    invoke-static {v0, p0}, Lcom/roblox/client/startup/a;->H(Lorg/json/JSONObject;I)Z

    return-void
.end method

.method public static l(Landroid/content/Context;)V
    .locals 7

    invoke-static {p0}, Lnh/a;->b(Landroid/content/Context;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/roblox/client/startup/a;->H(Lorg/json/JSONObject;I)Z

    :cond_0
    const-string v1, "fetch"

    invoke-static {v1}, Lcom/roblox/client/startup/a;->I(Ljava/lang/String;)V

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->readLocalFlags()Lcom/roblox/engine/jni/model/ClientLocalFlags;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roblox/engine/jni/model/ClientLocalFlags;->getAll()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v1}, Lcom/roblox/engine/jni/model/ClientLocalFlags;->isEmpty()Z

    move-result v3

    const/4 v4, 0x3

    const-string v5, "AndroidAppSettings"

    if-nez v3, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "localFlags size:"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/roblox/engine/jni/model/ClientLocalFlags;->size()I

    move-result v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v2, v4}, Lcom/roblox/client/startup/a;->H(Lorg/json/JSONObject;I)Z

    :cond_1
    invoke-static {}, Lnh/b;->a()Z

    move-result v1

    const/4 v3, 0x0

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Lwj/a;

    invoke-direct {v1, p0}, Lwj/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lwj/a;->h()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {v1, v4}, Lcom/roblox/client/startup/a;->H(Lorg/json/JSONObject;I)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    move-object v3, v1

    goto :goto_1

    :catch_0
    move-exception p0

    move-object v3, v1

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    const-string v1, "Failed to parse external dev app settings JSON"

    invoke-static {v5, v1, p0}, Lgk/q;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_3
    :goto_1
    invoke-static {}, Lnh/b;->a()Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    new-instance p0, Lorg/json/JSONObject;

    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    sput-object p0, Lcom/roblox/client/startup/a;->j:Lorg/json/JSONObject;

    invoke-static {p0, v0}, Lgk/o;->a(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    sget-object p0, Lcom/roblox/client/startup/a;->j:Lorg/json/JSONObject;

    invoke-static {p0, v2}, Lgk/o;->a(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    sget-object p0, Lcom/roblox/client/startup/a;->j:Lorg/json/JSONObject;

    invoke-static {p0, v3}, Lgk/o;->a(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    :goto_2
    return-void
.end method

.method public static m()Z
    .locals 2

    sget-object v0, Lcom/roblox/client/startup/a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/roblox/client/startup/a$b;->d:Lcom/roblox/client/startup/a$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static n()V
    .locals 1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->W0()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/roblox/client/startup/a;->k:Lcom/roblox/client/startup/a$a;

    invoke-virtual {v0}, Lcom/roblox/client/startup/a$a;->a()V

    :cond_0
    return-void
.end method

.method public static o()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/client/startup/a;->j:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static p(Lorg/json/JSONObject;Ljava/lang/String;Lcom/roblox/client/flags/a;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1, p2}, Lnh/a;->c(Lorg/json/JSONObject;Ljava/lang/String;Lcom/roblox/client/flags/a;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static q(Lcom/roblox/client/startup/b$b;)Z
    .locals 1

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/roblox/client/startup/b$b;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/roblox/client/startup/b$b;->d()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static r()V
    .locals 8

    invoke-static {}, Lak/x;->m()Lak/x;

    move-result-object v0

    sget-object v1, Lcom/roblox/client/startup/a;->f:Ljava/lang/Object;

    monitor-enter v1

    const/4 v2, 0x0

    :try_start_0
    invoke-static {}, Lcom/github/luben/zstd/util/Native;->isLoaded()Z

    move-result v3

    if-nez v3, :cond_0

    sget-object v3, Lak/k2;->b:Lak/k2;

    invoke-virtual {v0, v3}, Lak/x;->n(Lak/k2;)Lne/e0;

    move-result-object v4

    invoke-virtual {v4}, Lne/b$j;->isDone()Z

    move-result v4

    if-nez v4, :cond_0

    const/16 v4, 0x14

    new-array v4, v4, [B

    fill-array-data v4, :array_0

    invoke-static {}, Lcom/github/luben/zstd/util/Native;->load()V

    new-instance v5, Lcom/github/luben/zstd/ZstdInputStream;

    new-instance v6, Ljava/io/ByteArrayInputStream;

    invoke-direct {v6, v4}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v5, v6}, Lcom/github/luben/zstd/ZstdInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v4, Ljava/lang/String;

    invoke-static {v5}, Lke/d;->d(Ljava/io/InputStream;)[B

    move-result-object v6

    sget-object v7, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v4, v6, v7}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    new-array v6, v2, [B

    invoke-virtual {v5, v6}, Lcom/github/luben/zstd/ZstdInputStream;->setDict([B)Lcom/github/luben/zstd/ZstdInputStream;

    const-string v6, "Testing 123"

    invoke-virtual {v6, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v0, v3, v4}, Lak/x;->G(Lak/k2;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v5}, Lcom/github/luben/zstd/ZstdInputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :catch_0
    move-exception v3

    goto :goto_1

    :catchall_1
    move-exception v3

    :try_start_3
    invoke-virtual {v5}, Lcom/github/luben/zstd/ZstdInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v4

    :try_start_4
    invoke-virtual {v3, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v3
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_1
    :try_start_5
    const-string v4, "AndroidAppSettings"

    const-string v5, "Failed to initialize ZSTD library"

    invoke-static {v4, v5, v3}, Lgk/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    sget-object v3, Lak/k2;->b:Lak/k2;

    invoke-virtual {v0, v3, v2}, Lak/x;->G(Lak/k2;Z)V

    :cond_0
    :goto_2
    monitor-exit v1

    return-void

    :goto_3
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v0

    nop

    :array_0
    .array-data 1
        0x28t
        -0x4bt
        0x2ft
        -0x3t
        0x20t
        0xbt
        0x59t
        0x0t
        0x0t
        0x54t
        0x65t
        0x73t
        0x74t
        0x69t
        0x6et
        0x67t
        0x20t
        0x31t
        0x32t
        0x33t
    .end array-data
.end method

.method public static s(Landroid/content/Context;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/a;->k(Landroid/content/Context;)V

    invoke-static {p0}, Lcom/roblox/client/startup/a;->l(Landroid/content/Context;)V

    return-void
.end method

.method public static t()V
    .locals 4

    :try_start_0
    sget-object v0, Lcom/roblox/client/startup/a;->f:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-static {}, Lcom/roblox/client/startup/a;->r()V

    sget-boolean v1, Lcom/roblox/client/startup/a;->i:Z

    if-nez v1, :cond_1

    invoke-static {}, Lcom/roblox/client/startup/a;->D()V

    sget-object v1, Lcom/roblox/client/startup/a;->d:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->h5()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/roblox/client/RobloxApplication;->f()Landroid/content/Context;

    move-result-object v1

    const-string v2, "robloxwebrtc"

    const-string v3, "android_app_settings"

    invoke-static {v1, v2, v3}, Lsh/b;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lcom/roblox/universalapp/webrtc/WebRtcLoader;->initialize(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v1, 0x1

    sput-boolean v1, Lcom/roblox/client/startup/a;->i:Z

    invoke-static {}, Lak/x;->m()Lak/x;

    move-result-object v2

    sget-object v3, Lak/k2;->a:Lak/k2;

    invoke-virtual {v2, v3, v1}, Lak/x;->G(Lak/k2;Z)V

    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    const-string v1, "AndroidAppSettings"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static u()Lcom/roblox/client/startup/b$b;
    .locals 6

    const-string v0, "AndroidAppSettings"

    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Lcom/roblox/client/startup/a;->b:Lne/x;

    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/roblox/client/startup/b$b;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v3

    invoke-interface {v3}, Lth/i;->P4()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {v2}, Lcom/roblox/client/startup/a;->q(Lcom/roblox/client/startup/b$b;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {}, Lcom/roblox/client/RobloxApplication;->f()Landroid/content/Context;

    move-result-object v3

    if-eqz v3, :cond_1

    const-string v4, "Initial prefetch returned empty; retrying before popping."

    invoke-static {v0, v4}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    const-string v4, "automatic_retry_applied"

    invoke-static {v4}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    invoke-static {v3}, Lcom/roblox/client/startup/b;->b(Landroid/content/Context;)Lcom/roblox/client/startup/b$b;

    move-result-object v4

    invoke-static {v4}, Lcom/roblox/client/startup/a;->q(Lcom/roblox/client/startup/b$b;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-static {v4, v3}, Lcom/roblox/client/startup/a;->E(Lcom/roblox/client/startup/b$b;Landroid/content/Context;)Z

    invoke-static {v4, v3}, Lcom/roblox/client/startup/FlagCacheUtils;->storePendingVersionBWrite(Lcom/roblox/client/startup/b$b;Landroid/content/Context;)V

    move-object v2, v4

    goto :goto_0

    :cond_0
    const-string v3, "popFetchedResponse retry still returned empty."

    invoke-static {v0, v3}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "flag_fetch_retry_empty_payload"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :cond_1
    :goto_0
    sput-object v1, Lcom/roblox/client/startup/a;->b:Lne/x;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    return-object v1
.end method

.method public static v(Landroid/content/Context;)V
    .locals 2

    invoke-static {p0}, Lcom/roblox/client/startup/a;->i(Landroid/content/Context;)Lne/x;

    move-result-object v0

    sput-object v0, Lcom/roblox/client/startup/a;->b:Lne/x;

    sget-object v0, Lcom/roblox/client/startup/a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lcom/roblox/client/startup/a$b;->b:Lcom/roblox/client/startup/a$b;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-instance v1, Lak/f;

    invoke-direct {v1, p0}, Lak/f;-><init>(Landroid/content/Context;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static w()V
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sput-wide v0, Lcom/roblox/client/startup/a;->e:J

    return-void
.end method

.method public static x()V
    .locals 1

    const-string v0, "fetch_flag_end"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->k(Ljava/lang/String;)V

    return-void
.end method

.method public static y(Z)V
    .locals 0

    if-eqz p0, :cond_0

    const-string p0, "fastflag_load_success"

    invoke-static {p0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->k(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p0, "fastflag_load_failure"

    invoke-static {p0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->k(Ljava/lang/String;)V

    return-void
.end method

.method public static declared-synchronized z(Landroid/content/Context;)V
    .locals 3

    const-class v0, Lcom/roblox/client/startup/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/roblox/client/startup/a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roblox/client/startup/a$b;

    sget-object v2, Lcom/roblox/client/startup/a$b;->a:Lcom/roblox/client/startup/a$b;

    if-eq v1, v2, :cond_1

    sget-object v2, Lcom/roblox/client/startup/a$b;->b:Lcom/roblox/client/startup/a$b;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/roblox/client/startup/a;->b:Lne/x;

    new-instance v2, Lak/e;

    invoke-direct {v2, p0}, Lak/e;-><init>(Landroid/content/Context;)V

    invoke-static {p0}, Ll2/b;->i(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    move-result-object p0

    invoke-static {v1, v2, p0}, Lne/s;->m(Lne/x;Lne/i;Ljava/util/concurrent/Executor;)Lne/x;

    move-result-object p0

    sput-object p0, Lcom/roblox/client/startup/a;->b:Lne/x;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method
