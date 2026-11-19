.class public Lcom/roblox/client/RobloxApplication;
.super Landroid/app/Application;
.source "SourceFile"

# interfaces
.implements Ll6/d0$a;
.implements Landroidx/work/a$c;


# static fields
.field public static c:Landroid/content/Context;

.field public static d:Ljava/util/Locale;


# instance fields
.field public final a:J

.field public b:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roblox/client/RobloxApplication;->a:J

    invoke-static {}, Lik/x;->m()Lik/x;

    move-result-object v0

    invoke-virtual {v0}, Lik/x;->x()V

    invoke-virtual {v0}, Lik/x;->A()V

    invoke-virtual {v0}, Lik/x;->o()V

    return-void
.end method

.method public static synthetic c(Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "rbx.application"

    const-string v1, "WorkManager failed to initialize"

    invoke-static {v0, v1, p0}, Lok/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public static f()Landroid/content/Context;
    .locals 1

    sget-object v0, Lcom/roblox/client/RobloxApplication;->c:Landroid/content/Context;

    return-object v0
.end method

.method public static g(Ljava/lang/String;Lei/u0;I)V
    .locals 2

    sget-object v0, Lcom/roblox/client/RobloxApplication$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const-string v1, "unknown"

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    move-object p1, v1

    goto :goto_0

    :cond_0
    const-string p1, "experience"

    goto :goto_0

    :cond_1
    const-string p1, "app"

    :goto_0
    const/4 v0, 0x5

    if-eq p2, v0, :cond_8

    const/16 v0, 0xa

    if-eq p2, v0, :cond_7

    const/16 v0, 0xf

    if-eq p2, v0, :cond_6

    const/16 v0, 0x14

    if-eq p2, v0, :cond_5

    const/16 v0, 0x28

    if-eq p2, v0, :cond_4

    const/16 v0, 0x3c

    if-eq p2, v0, :cond_3

    const/16 v0, 0x50

    if-eq p2, v0, :cond_2

    goto :goto_1

    :cond_2
    const-string v1, "TRIM_MEMORY_COMPLETE"

    goto :goto_1

    :cond_3
    const-string v1, "TRIM_MEMORY_MODERATE"

    goto :goto_1

    :cond_4
    const-string v1, "TRIM_MEMORY_BACKGROUND"

    goto :goto_1

    :cond_5
    const-string v1, "TRIM_MEMORY_UI_HIDDEN"

    goto :goto_1

    :cond_6
    const-string v1, "TRIM_MEMORY_RUNNING_CRITICAL"

    goto :goto_1

    :cond_7
    const-string v1, "TRIM_MEMORY_RUNNING_LOW"

    goto :goto_1

    :cond_8
    const-string v1, "TRIM_MEMORY_RUNNING_MODERATE"

    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Mode: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", TrimLevel: "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Ll6/s;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Lqk/a;->a:Lqk/a;

    invoke-virtual {v0, p1}, Lqk/a;->a(Landroid/content/Context;)Ll6/s;

    move-result-object p1

    return-object p1
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roblox/client/RobloxApplication;->b:J

    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    invoke-static {p1}, Lik/w0;->i(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lik/w0;->h(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lik/w0;->A(Landroid/content/Context;)V

    :cond_0
    invoke-static {p0}, Lai/j;->a(Landroid/content/Context;)V

    return-void
.end method

.method public b()Landroidx/work/a;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Landroidx/work/a$a;

    invoke-direct {v0}, Landroidx/work/a$a;-><init>()V

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroidx/work/a$a;->w(I)Landroidx/work/a$a;

    move-result-object v0

    new-instance v1, Lbh/v0;

    invoke-direct {v1}, Lbh/v0;-><init>()V

    invoke-virtual {v0, v1}, Landroidx/work/a$a;->v(Lx2/a;)Landroidx/work/a$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/work/a$a;->a()Landroidx/work/a;

    move-result-object v0

    return-object v0
.end method

.method public final d()V
    .locals 6

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->G3()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-static {p0}, Lai/j;->c(Landroid/content/Context;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "_installed"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    add-int/lit8 v3, v3, 0x1

    const/16 v4, 0xa

    if-lt v3, v4, :cond_0

    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    sub-long/2addr v2, v0

    const-string v0, "ondemand_module_check"

    invoke-static {v0, v2, v3}, Lcom/roblox/universalapp/logging/LoggingProtocol;->h(Ljava/lang/String;J)V

    :cond_2
    return-void
.end method

.method public final e()V
    .locals 1

    new-instance v0, Landroid/os/StrictMode$ThreadPolicy$Builder;

    invoke-direct {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectAll()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->penaltyLog()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    new-instance v0, Landroid/os/StrictMode$VmPolicy$Builder;

    invoke-direct {v0}, Landroid/os/StrictMode$VmPolicy$Builder;-><init>()V

    invoke-virtual {v0}, Landroid/os/StrictMode$VmPolicy$Builder;->detectAll()Landroid/os/StrictMode$VmPolicy$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/StrictMode$VmPolicy$Builder;->penaltyLog()Landroid/os/StrictMode$VmPolicy$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/StrictMode$VmPolicy$Builder;->build()Landroid/os/StrictMode$VmPolicy;

    move-result-object v0

    invoke-static {v0}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2
    .param p1    # Landroid/content/res/Configuration;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroid/app/Application;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-static {}, Lyi/b;->f()Lyi/b;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object p1

    invoke-virtual {v0, p1}, Lyi/b;->q(Ljava/util/Locale;)V

    return-void
.end method

.method public onCreate()V
    .locals 13

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    sput-object v2, Lcom/roblox/client/RobloxApplication;->c:Landroid/content/Context;

    invoke-static {}, Lwh/b;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/RobloxApplication;->e()V

    :cond_0
    sget-object v2, Lbi/f;->a:Lbi/f;

    invoke-static {p0}, Lbh/a1;->U(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-virtual {v2, v3}, Lbi/f;->p(Landroid/content/SharedPreferences;)V

    invoke-static {}, Lrj/m;->g()V

    sget-object v2, Lcom/roblox/client/RobloxApplication;->c:Landroid/content/Context;

    invoke-static {v2}, Leh/j;->a(Landroid/content/Context;)V

    sget-object v2, Lcom/roblox/client/RobloxApplication;->c:Landroid/content/Context;

    invoke-static {v2}, Leh/a0;->w(Landroid/content/Context;)V

    invoke-static {}, Lik/x;->m()Lik/x;

    move-result-object v2

    invoke-virtual {v2}, Lik/x;->E()V

    invoke-virtual {v2}, Lik/x;->B()V

    sget-object v2, Lcom/roblox/client/RobloxApplication;->c:Landroid/content/Context;

    invoke-static {v2}, Ljh/c;->c(Landroid/content/Context;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    sget-object v4, Lcom/roblox/client/RobloxApplication;->c:Landroid/content/Context;

    invoke-static {v4}, Lik/r2;->c(Landroid/content/Context;)V

    sget-object v4, Lcom/roblox/client/RobloxApplication;->c:Landroid/content/Context;

    invoke-static {v4}, Lbh/s;->b(Landroid/content/Context;)V

    invoke-static {}, Lbh/r;->c()V

    sget-object v4, Lcom/roblox/client/RobloxApplication;->c:Landroid/content/Context;

    invoke-static {v4}, Ljh/c;->h(Landroid/content/Context;)V

    new-instance v4, Lcom/roblox/universalapp/activitylifecyclecallbacks/JNIActivityLifecycleCallbacks;

    invoke-direct {v4}, Lcom/roblox/universalapp/activitylifecyclecallbacks/JNIActivityLifecycleCallbacks;-><init>()V

    invoke-virtual {p0, v4}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v4

    invoke-interface {v4}, Lbi/i;->c3()Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->INSTANCE:Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;

    invoke-virtual {p0, v4}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    :cond_1
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v4

    invoke-interface {v4}, Lbi/i;->f5()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {}, Landroidx/lifecycle/h0;->m()Landroidx/lifecycle/s;

    move-result-object v4

    invoke-interface {v4}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object v4

    sget-object v5, Lxi/m;->a:Lxi/m;

    invoke-virtual {v4, v5}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    goto :goto_0

    :cond_2
    invoke-static {}, Landroidx/lifecycle/h0;->m()Landroidx/lifecycle/s;

    move-result-object v4

    invoke-interface {v4}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object v4

    sget-object v5, Lxi/c;->a:Lxi/c;

    invoke-virtual {v4, v5}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :goto_0
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v4

    invoke-interface {v4}, Lbi/i;->W1()Z

    move-result v4

    const-string v5, "rbx.application"

    if-eqz v4, :cond_3

    invoke-static {p0}, Ldl/e;->x(Landroid/content/Context;)V

    invoke-static {}, Lbh/a1;->g()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ldl/e;->z(Ljava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "NativeCookieStorage context injected, migrationSourceUrl="

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lbh/a1;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v4

    invoke-interface {v4}, Lbi/i;->k4()Z

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual {p0}, Lcom/roblox/client/RobloxApplication;->b()Landroidx/work/a;

    move-result-object v4

    invoke-static {p0, v4}, Ly5/p0;->i(Landroid/content/Context;Landroidx/work/a;)V

    goto :goto_1

    :cond_4
    const-string v4, "work_manager_initialization_deferred"

    invoke-static {v4}, Lcom/roblox/universalapp/logging/LoggingProtocol;->k(Ljava/lang/String;)V

    :goto_1
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v4

    invoke-interface {v4}, Lbi/i;->Q1()Z

    move-result v4

    const-string v6, "Background process detected"

    const-string v7, "foreground"

    const-string v8, "application_oncreate"

    const-string v9, "application_constructor"

    const-string v10, "application_attachbasecontext"

    const-string v11, "main"

    if-eqz v4, :cond_8

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->v4()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-static {p0}, Lik/r0;->a(Landroid/content/Context;)V

    :cond_5
    invoke-static {v11}, Lcom/roblox/client/startup/a;->I(Ljava/lang/String;)V

    sget-object v2, Lcom/roblox/client/RobloxApplication;->c:Landroid/content/Context;

    invoke-static {v2}, Lcom/roblox/client/JNIAAssetManagerSetup;->a(Landroid/content/Context;)V

    sget-object v2, Lcom/roblox/client/RobloxApplication;->c:Landroid/content/Context;

    invoke-static {v2}, Lcom/roblox/client/LocalStorageManager;->a(Landroid/content/Context;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->H2()Z

    move-result v2

    if-eqz v2, :cond_6

    iget-wide v2, p0, Lcom/roblox/client/RobloxApplication;->b:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v10, v2}, Lcom/roblox/universalapp/logging/LoggingProtocol;->l(Ljava/lang/String;Ljava/lang/Long;)V

    :cond_6
    iget-wide v2, p0, Lcom/roblox/client/RobloxApplication;->a:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v9, v2}, Lcom/roblox/universalapp/logging/LoggingProtocol;->l(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v8, v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->l(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-static {}, Lik/w0;->k()V

    invoke-static {p0}, Lok/w;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-static {v5, v6}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lxm/a;->i()V

    :cond_7
    invoke-static {}, Landroidx/lifecycle/h0;->m()Landroidx/lifecycle/s;

    move-result-object v0

    invoke-interface {v0}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object v0

    new-instance v1, Lcom/roblox/universalapp/applifecyclenativeadapter/JNIAppLifecycleNativeAdapter;

    invoke-direct {v1}, Lcom/roblox/universalapp/applifecyclenativeadapter/JNIAppLifecycleNativeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    const-string v0, "GameActivity = ON. Return after loading native libs!"

    invoke-static {v5, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_8
    sget-object v4, Lcom/roblox/client/RobloxApplication;->c:Landroid/content/Context;

    invoke-static {v4}, Lcom/roblox/client/startup/a;->v(Landroid/content/Context;)V

    invoke-static {p0}, Lok/w;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    invoke-static {}, Lei/p;->e()Lcom/roblox/engine/jni/model/DeviceStaticParams;

    move-result-object v7

    invoke-static {v7}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setDeviceStaticParams(Lcom/roblox/engine/jni/model/DeviceStaticParams;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v7

    invoke-interface {v7}, Lbi/i;->v4()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-static {p0}, Lik/r0;->a(Landroid/content/Context;)V

    :cond_9
    invoke-static {v11}, Lcom/roblox/client/startup/a;->I(Ljava/lang/String;)V

    sget-object v7, Lcom/roblox/client/RobloxApplication;->c:Landroid/content/Context;

    invoke-static {v7}, Lcom/roblox/client/JNIAAssetManagerSetup;->a(Landroid/content/Context;)V

    sget-object v7, Lcom/roblox/client/RobloxApplication;->c:Landroid/content/Context;

    invoke-static {v7}, Lcom/roblox/client/LocalStorageManager;->a(Landroid/content/Context;)V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v7

    sput-object v7, Lcom/roblox/client/RobloxApplication;->d:Ljava/util/Locale;

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v7

    invoke-interface {v7}, Lbi/i;->H2()Z

    move-result v7

    if-eqz v7, :cond_a

    iget-wide v11, p0, Lcom/roblox/client/RobloxApplication;->b:J

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-static {v10, v7}, Lcom/roblox/universalapp/logging/LoggingProtocol;->l(Ljava/lang/String;Ljava/lang/Long;)V

    :cond_a
    iget-wide v10, p0, Lcom/roblox/client/RobloxApplication;->a:J

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-static {v9, v7}, Lcom/roblox/universalapp/logging/LoggingProtocol;->l(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v7, "flag_prefetch_begin"

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v7, v2}, Lcom/roblox/universalapp/logging/LoggingProtocol;->l(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v8, v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->l(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-static {}, Lik/w0;->k()V

    if-nez v4, :cond_b

    invoke-static {v5, v6}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lxm/a;->i()V

    :cond_b
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/universalapp/linking/JNIBaseUrlProtocol;->init(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/universalapp/linking/JNIWebLoginProtocol;->init(Landroid/content/Context;)V

    invoke-static {}, Landroidx/lifecycle/h0;->m()Landroidx/lifecycle/s;

    move-result-object v0

    invoke-interface {v0}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object v0

    new-instance v1, Lcom/roblox/universalapp/applifecyclenativeadapter/JNIAppLifecycleNativeAdapter;

    invoke-direct {v1}, Lcom/roblox/universalapp/applifecyclenativeadapter/JNIAppLifecycleNativeAdapter;-><init>()V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    invoke-virtual {p0}, Lcom/roblox/client/RobloxApplication;->d()V

    return-void
.end method
