.class public Lwh/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwk/h$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwh/f$g;,
        Lwh/f$h;,
        Lwh/f$f;,
        Lwh/f$d;,
        Lwh/f$e;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Lwh/f$d;

.field public i:Lwh/f$f;

.field public j:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector<",
            "Lok/b;",
            ">;"
        }
    .end annotation
.end field

.field public k:Lwh/f$e;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "rbx.appshell"

    iput-object v0, p0, Lwh/f;->a:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lwh/f;->b:Z

    iput-boolean v0, p0, Lwh/f;->c:Z

    iput-boolean v0, p0, Lwh/f;->d:Z

    iput-boolean v0, p0, Lwh/f;->e:Z

    iput-boolean v0, p0, Lwh/f;->g:Z

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lwh/f;->j:Ljava/util/Vector;

    return-void
.end method

.method public static synthetic b(Lne/e0;Ljava/lang/String;)V
    .locals 0

    const-string p1, "asset_unpack_end"

    invoke-static {p1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lne/e0;->D(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic c(Lwh/f;Landroid/content/Context;Lwh/f$h;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lwh/f;->n(Landroid/content/Context;Lwh/f$h;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lne/e0;Ljava/lang/String;)V
    .locals 0

    const-string p1, "asset_unpack_end"

    invoke-static {p1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lne/e0;->D(Ljava/lang/Object;)Z

    return-void
.end method

.method public static bridge synthetic e(Lwh/f;Z)V
    .locals 0

    iput-boolean p1, p0, Lwh/f;->c:Z

    return-void
.end method

.method public static j()Lwh/f;
    .locals 1

    invoke-static {}, Lwh/f$g;->a()Lwh/f;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public A(Lok/c;)V
    .locals 2

    iget-boolean v0, p0, Lwh/f;->b:Z

    if-nez v0, :cond_0

    const-string p1, "rbx.appshell"

    const-string v0, "ASMA.sendAppEventOnGameLoaded: The manager is not yet setup. Ignore."

    invoke-static {p1, v0}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p1, Lok/c;->a:Ljava/lang/String;

    iget-object v1, p1, Lok/c;->b:Ljava/lang/String;

    iget-object p1, p1, Lok/c;->c:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2SendAppEventOnGameLoaded(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public B(Z)V
    .locals 1

    new-instance v0, Lok/a;

    invoke-direct {v0, p1}, Lok/a;-><init>(Z)V

    invoke-virtual {p0, v0}, Lwh/f;->A(Lok/c;)V

    return-void
.end method

.method public C(Lok/b;)V
    .locals 1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lwh/f;->j:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lwh/f;->l()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lwh/f;->j:Ljava/util/Vector;

    invoke-virtual {p0, p1}, Lwh/f;->u(Ljava/util/Vector;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public D(Lcom/roblox/engine/jni/EngineJavaCallback2;)V
    .locals 1

    new-instance v0, Lwh/f$e;

    invoke-direct {v0, p0, p1}, Lwh/f$e;-><init>(Lwh/f;Lcom/roblox/engine/jni/EngineJavaCallback2;)V

    iput-object v0, p0, Lwh/f;->k:Lwh/f$e;

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setImplementation(Lcom/roblox/engine/jni/EngineJavaCallback2;)V

    return-void
.end method

.method public E()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lwh/f;->f:Z

    return-void
.end method

.method public F(Landroid/content/Context;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ASMA.setup() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lwh/f;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.appshell"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v0, p0, Lwh/f;->b:Z

    if-nez v0, :cond_6

    const/4 v0, 0x1

    iput-boolean v0, p0, Lwh/f;->b:Z

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->E2()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v1, "update_native_settings_begin"

    invoke-static {v1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :cond_0
    invoke-static {}, Lsg/a1;->V0()V

    if-eqz v0, :cond_1

    const-string v1, "update_native_settings_end"

    invoke-static {v1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :cond_1
    if-eqz v0, :cond_2

    const-string v1, "fmod_init_begin"

    invoke-static {v1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :cond_2
    invoke-static {p1}, Lorg/fmod/FMOD;->init(Landroid/content/Context;)V

    if-eqz v0, :cond_3

    const-string p1, "fmod_init_end"

    invoke-static {p1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :cond_3
    if-eqz v0, :cond_4

    const-string p1, "game_global_init_begin"

    invoke-static {p1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :cond_4
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeGameGlobalInit()V

    if-eqz v0, :cond_5

    const-string p1, "game_global_init_end"

    invoke-static {p1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :cond_5
    invoke-static {}, Lsg/a1;->U0()V

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeUpdateAdapterInit()V

    return-void

    :cond_6
    invoke-static {}, Lsg/a1;->S0()V

    return-void
.end method

.method public G(Landroid/view/Surface;)V
    .locals 3

    iget-boolean v0, p0, Lwh/f;->d:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lwh/f;->g:Z

    invoke-virtual {p0}, Lwh/f;->z()V

    invoke-virtual {p0}, Lwh/f;->i()Lwh/f$d;

    move-result-object v0

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/StartAppParams;->builder()Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;->setSurface(Landroid/view/Surface;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;

    move-result-object p1

    iget-object v1, v0, Lwh/f$d;->b:Lcom/roblox/engine/jni/model/PlatformParams;

    invoke-virtual {p1, v1}, Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;->setPlatformParams(Lcom/roblox/engine/jni/model/PlatformParams;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;

    move-result-object p1

    iget-object v1, v0, Lwh/f$d;->d:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;->setAppStarterPlace(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;

    move-result-object p1

    iget-object v1, v0, Lwh/f$d;->e:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;->setAppStarterScript(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;

    move-result-object p1

    iget-wide v1, v0, Lwh/f$d;->f:J

    invoke-virtual {p1, v1, v2}, Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;->setAppUserId(J)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;

    move-result-object p1

    iget-boolean v1, v0, Lwh/f$d;->g:Z

    invoke-virtual {p1, v1}, Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;->setIsUnder13(Z)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;

    move-result-object p1

    iget-object v1, v0, Lwh/f$d;->h:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;->setUsername(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;

    move-result-object p1

    iget v1, v0, Lwh/f$d;->i:I

    invoke-virtual {p1, v1}, Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;->setMembershipType(I)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;

    move-result-object p1

    iget-object v1, v0, Lwh/f$d;->j:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;->setSelectedTheme(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;

    move-result-object p1

    invoke-static {}, Lsg/a1;->D0()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lwh/f$d;->a:Landroid/app/Activity;

    invoke-virtual {p1, v1}, Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;->setVrContext(Landroid/app/Activity;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;

    :cond_0
    invoke-virtual {p1}, Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;->build()Lcom/roblox/engine/jni/autovalue/StartAppParams;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2StartAppWithParams(Lcom/roblox/engine/jni/autovalue/StartAppParams;)V

    invoke-static {}, Lsg/a1;->D0()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    new-instance v1, Lwh/f$c;

    invoke-direct {v1, p0, v0}, Lwh/f$c;-><init>(Lwh/f;Lwh/f$d;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public H()V
    .locals 2

    const-string v0, "rbx.appshell"

    const-string v1, "ASMA.stop"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v0, p0, Lwh/f;->d:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lwh/f;->g:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lwh/f;->g:Z

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2PauseApp()V

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->f()Lcom/roblox/client/game/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/game/c;->i()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {v0, v1}, Lcom/roblox/engine/jni/NativeGLInterface;->setTaskSchedulerBackgroundMode(ZLjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public I(Landroid/view/Surface;FII)V
    .locals 2

    const-string v0, "rbx.appshell"

    const-string v1, "ASMA.updateWindowHandle"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v0, p0, Lwh/f;->d:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/roblox/engine/jni/model/PlatformParams;

    invoke-direct {v0}, Lcom/roblox/engine/jni/model/PlatformParams;-><init>()V

    iput p2, v0, Lcom/roblox/engine/jni/model/PlatformParams;->dpiScale:F

    iput p3, v0, Lcom/roblox/engine/jni/model/PlatformParams;->viewportWidthMm:I

    iput p4, v0, Lcom/roblox/engine/jni/model/PlatformParams;->viewportHeightMm:I

    invoke-static {p1, v0}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2UpdateSurfaceAppWithPlatformParams(Landroid/view/Surface;Lcom/roblox/engine/jni/model/PlatformParams;)V

    :cond_0
    return-void
.end method

.method public a()V
    .locals 2

    const-string v0, "rbx.appshell"

    const-string v1, "onCookieChanged."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->S1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lwk/e;->k()V

    :cond_0
    invoke-static {}, Lsg/a1;->S0()V

    return-void
.end method

.method public f()V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lwh/f;->g()V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final g()V
    .locals 2

    iget-boolean v0, p0, Lwh/f;->d:Z

    if-eqz v0, :cond_0

    const-string v0, "rbx.appshell"

    const-string v1, "ASMA.destroy() ...."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2DestroyApp()V

    :cond_0
    invoke-virtual {p0}, Lwh/f;->v()V

    return-void
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, Lwh/f;->k:Lwh/f$e;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setImplementation(Lcom/roblox/engine/jni/EngineJavaCallback2;)V

    :cond_0
    return-void
.end method

.method public i()Lwh/f$d;
    .locals 1

    iget-object v0, p0, Lwh/f;->h:Lwh/f$d;

    return-object v0
.end method

.method public k(Lwh/f$d;)V
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ASMA.initializeDataModel: hasSettings:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lwh/f;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isInitialized:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lwh/f;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", CrashWhenAppBridgeNotStarted:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->o3()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", appBridgeStarted:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lwh/f;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.appshell"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v0, p0, Lwh/f;->c:Z

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Lwh/f;->d:Z

    if-nez v0, :cond_5

    invoke-virtual {p0}, Lwh/f;->h()V

    const-string v0, "ASMA.initializeDataModel()"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iput-object p1, p0, Lwh/f;->h:Lwh/f$d;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lwh/f;->d:Z

    invoke-static {}, Lsg/a1;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lsg/a1;->Z0()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lsg/a1;->r0()Z

    move-result v3

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/InitParams;->builder()Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    move-result-object v4

    iget-object v5, p1, Lwh/f$d;->b:Lcom/roblox/engine/jni/model/PlatformParams;

    invoke-virtual {v4, v5}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->setPlatformParams(Lcom/roblox/engine/jni/model/PlatformParams;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    move-result-object v4

    iget-object v5, p1, Lwh/f$d;->c:Lcom/roblox/engine/jni/model/DeviceParams;

    invoke-virtual {v4, v5}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->setDeviceParams(Lcom/roblox/engine/jni/model/DeviceParams;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->setBaseURL(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->setUserAgent(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->setIsTablet(Z)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    move-result-object v0

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->g1()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lgk/h;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->setBuildVariant(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    :cond_0
    invoke-static {}, Lsg/a1;->q0()Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->setIsVrDevice(Z)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    invoke-static {}, Lsg/a1;->t0()Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->setIsPotato(Z)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    iget-object v2, p1, Lwh/f$d;->b:Lcom/roblox/engine/jni/model/PlatformParams;

    iget-object v2, v2, Lcom/roblox/engine/jni/model/PlatformParams;->assetFolderPath:Ljava/lang/String;

    const-string v3, "Asset folder path is null"

    if-nez v2, :cond_1

    invoke-static {v1, v3}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Asset folder path: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p1, Lwh/f$d;->b:Lcom/roblox/engine/jni/model/PlatformParams;

    iget-object v4, v4, Lcom/roblox/engine/jni/model/PlatformParams;->assetFolderPath:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    iget-object p1, p1, Lwh/f$d;->b:Lcom/roblox/engine/jni/model/PlatformParams;

    iget-object p1, p1, Lcom/roblox/engine/jni/model/PlatformParams;->assetFolderPath:Ljava/lang/String;

    if-eqz p1, :cond_4

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->o3()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-boolean p1, p0, Lwh/f;->f:Z

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "AppBridge is not yet started"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    invoke-virtual {v0}, Lcom/roblox/engine/jni/autovalue/InitParams$Builder;->build()Lcom/roblox/engine/jni/autovalue/InitParams;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2InitWithParams(Lcom/roblox/engine/jni/autovalue/InitParams;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    return-void
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Lwh/f;->e:Z

    return v0
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, Lwh/f;->d:Z

    return v0
.end method

.method public final synthetic n(Landroid/content/Context;Lwh/f$h;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Lwh/f;->s(Landroid/content/Context;Lwh/f$h;Z)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public o(Landroid/content/Context;Lwh/f$h;)V
    .locals 4

    const-string v0, "rbx.appshell"

    const-string v1, "ASMA.loadAllAppSettings()"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "asset_unpack_begin"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    invoke-static {}, Lne/e0;->H()Lne/e0;

    move-result-object v0

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->v2()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lmk/c;->p()Lmk/c;

    move-result-object v1

    invoke-virtual {v1}, Lmk/c;->q()Ljava/util/concurrent/CompletableFuture;

    move-result-object v1

    new-instance v2, Lwh/c;

    invoke-direct {v2, v0}, Lwh/c;-><init>(Lne/e0;)V

    invoke-virtual {v1, v2}, Ljava/util/concurrent/CompletableFuture;->thenAccept(Ljava/util/function/Consumer;)Ljava/util/concurrent/CompletableFuture;

    goto :goto_0

    :cond_0
    invoke-static {}, Lmk/c;->p()Lmk/c;

    move-result-object v1

    new-instance v2, Lwh/d;

    invoke-direct {v2, v0}, Lwh/d;-><init>(Lne/e0;)V

    invoke-virtual {v1, v2}, Lmk/c;->s(Ljava/util/function/Consumer;)V

    :goto_0
    invoke-static {p1}, Lcom/roblox/client/startup/a;->i(Landroid/content/Context;)Lne/x;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lne/x;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v1, 0x1

    aput-object v0, v2, v1

    invoke-static {v2}, Lne/s;->o([Lne/x;)Lne/s$b;

    move-result-object v0

    new-instance v1, Lwh/e;

    invoke-direct {v1, p0, p1, p2}, Lwh/e;-><init>(Lwh/f;Landroid/content/Context;Lwh/f$h;)V

    invoke-static {}, Lne/a0;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lne/s$b;->a(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lne/x;

    return-void
.end method

.method public p(Lwh/f$h;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ASMA.loadSettings() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lwh/f;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.appshell"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v0, p0, Lwh/f;->c:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    const-string v0, "ASMA.loadSettings() ... skipping because Init already does it!"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_0

    invoke-interface {p1, v2}, Lwh/f$h;->a(I)V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lwh/f;->w()V

    new-instance v0, Lwh/f$f;

    new-instance v1, Lwh/f$b;

    invoke-direct {v1, p0, p1}, Lwh/f$b;-><init>(Lwh/f;Lwh/f$h;)V

    invoke-direct {v0, v1}, Lwh/f$f;-><init>(Lwh/f$h;)V

    iput-object v0, p0, Lwh/f;->i:Lwh/f$f;

    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array v1, v2, [Ljava/lang/Void;

    invoke-virtual {v0, p1, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public q(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ASMA.onAppReady() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rbx.appshell"

    invoke-static {v0, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lwh/f;->e:Z

    iget-object p1, p0, Lwh/f;->j:Ljava/util/Vector;

    invoke-virtual {p0, p1}, Lwh/f;->u(Ljava/util/Vector;)V

    return-void
.end method

.method public r()V
    .locals 0

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeHandleBackPressed()V

    return-void
.end method

.method public final s(Landroid/content/Context;Lwh/f$h;Z)V
    .locals 1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->E2()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "settings_join_resolved"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p0, p1}, Lwh/f;->F(Landroid/content/Context;)V

    const-string p1, "update_setting_to_app_bridge_start"

    invoke-static {p1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    new-instance p1, Lwh/f$a;

    invoke-direct {p1, p0, p2}, Lwh/f$a;-><init>(Lwh/f;Lwh/f$h;)V

    invoke-virtual {p0, p1}, Lwh/f;->p(Lwh/f$h;)V

    return-void

    :cond_1
    const/4 p1, 0x1

    invoke-interface {p2, p1}, Lwh/f$h;->a(I)V

    return-void
.end method

.method public t()V
    .locals 3

    const-string v0, "rbx.appshell"

    const-string v1, "ASMA.pause"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v2, p0, Lwh/f;->d:Z

    if-eqz v2, :cond_0

    const-string v2, "ASMA.pause(): Do nothing in AppBridge refactor!"

    invoke-static {v0, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->f()Lcom/roblox/client/game/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/game/c;->i()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {v0, v1}, Lcom/roblox/engine/jni/NativeGLInterface;->setTaskSchedulerBackgroundMode(ZLjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final u(Ljava/util/Vector;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Vector<",
            "Lok/b;",
            ">;)V"
        }
    .end annotation

    :goto_0
    invoke-virtual {p1}, Ljava/util/Vector;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lok/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "publishPendingReadyEvents() "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lok/c;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lok/c;->b:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lok/c;->c:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lok/b;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "rbx.appshell"

    invoke-static {v2, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, v0, Lok/c;->a:Ljava/lang/String;

    iget-object v2, v0, Lok/c;->b:Ljava/lang/String;

    iget-object v3, v0, Lok/c;->c:Ljava/lang/String;

    iget-object v0, v0, Lok/b;->d:Ljava/lang/String;

    invoke-static {v1, v2, v3, v0}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2SendAppEventOnAppReady(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public v()V
    .locals 2

    const-string v0, "rbx.appshell"

    const-string v1, "ASMA.reset()"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lwh/f;->b:Z

    iput-boolean v0, p0, Lwh/f;->d:Z

    iput-boolean v0, p0, Lwh/f;->e:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lwh/f;->h:Lwh/f$d;

    new-instance v0, Lcom/roblox/engine/jni/EngineJavaCallback2;

    invoke-direct {v0}, Lcom/roblox/engine/jni/EngineJavaCallback2;-><init>()V

    const-class v1, Lwh/f$e;

    invoke-static {v1, v0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->replaceImplementation(Ljava/lang/Class;Lcom/roblox/engine/jni/EngineJavaCallback2;)V

    invoke-virtual {p0}, Lwh/f;->w()V

    invoke-static {}, Lcm/a;->a()Lcm/a;

    move-result-object v0

    invoke-virtual {v0}, Lcm/a;->c()V

    return-void
.end method

.method public final w()V
    .locals 3

    iget-object v0, p0, Lwh/f;->i:Lwh/f$f;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/AsyncTask;->isCancelled()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "rbx.appshell"

    const-string v2, "ASMA.resetTask: Cancel the current (running) task..."

    invoke-static {v1, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lwh/f;->i:Lwh/f$f;

    return-void
.end method

.method public x(Landroid/content/Context;Landroid/view/Surface;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lwh/f;->y(Landroid/content/Context;Landroid/view/Surface;Landroid/app/Activity;)V

    return-void
.end method

.method public y(Landroid/content/Context;Landroid/view/Surface;Landroid/app/Activity;)V
    .locals 2

    const-string v0, "rbx.appshell"

    const-string v1, "ASMA.restart"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lwh/f;->f()V

    invoke-static {}, Lsg/a1;->D0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1, p3}, Lwh/p;->b(Landroid/content/Context;Landroid/app/Activity;)Lwh/f$d;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lwh/p;->a(Landroid/content/Context;)Lwh/f$d;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Lwh/f;->k(Lwh/f$d;)V

    invoke-virtual {p0, p2}, Lwh/f;->G(Landroid/view/Surface;)V

    return-void
.end method

.method public z()V
    .locals 2

    invoke-virtual {p0}, Lwh/f;->h()V

    const/4 v0, 0x0

    const-string v1, "ASMA.start"

    invoke-static {v0, v1}, Lcom/roblox/engine/jni/NativeGLInterface;->setTaskSchedulerBackgroundMode(ZLjava/lang/String;)V

    return-void
.end method
