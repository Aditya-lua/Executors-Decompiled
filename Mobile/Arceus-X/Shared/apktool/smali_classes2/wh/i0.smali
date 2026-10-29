.class public Lwh/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# instance fields
.field public a:Lwh/l0;

.field public final b:Ljava/lang/String;

.field public c:Landroid/widget/FrameLayout;

.field public d:J

.field public e:Ljava/lang/String;

.field public f:Z

.field public g:Landroid/view/SurfaceView;

.field public h:Landroid/widget/FrameLayout;

.field public i:I

.field public j:Lej/g;

.field public k:Ljava/util/concurrent/ExecutorService;

.field public l:Lwh/v0;

.field public m:Lcom/roblox/client/game/ExperienceSession;


# direct methods
.method public constructor <init>(Lcom/roblox/client/game/ExperienceSession;Lwh/l0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "rbx.game"

    iput-object v0, p0, Lwh/i0;->b:Ljava/lang/String;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lwh/i0;->d:J

    const-string v0, ""

    iput-object v0, p0, Lwh/i0;->e:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lwh/i0;->f:Z

    const/4 v0, -0x1

    iput v0, p0, Lwh/i0;->i:I

    iput-object p1, p0, Lwh/i0;->m:Lcom/roblox/client/game/ExperienceSession;

    iput-object p1, p0, Lwh/i0;->l:Lwh/v0;

    iput-object p2, p0, Lwh/i0;->a:Lwh/l0;

    return-void
.end method

.method public static synthetic a(Lwh/i0;)V
    .locals 0

    invoke-virtual {p0}, Lwh/i0;->t()V

    return-void
.end method

.method public static synthetic b(Lwh/i0;)V
    .locals 0

    invoke-virtual {p0}, Lwh/i0;->y()V

    return-void
.end method

.method public static synthetic c(Lwh/i0;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lwh/i0;->u(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Lwh/i0;)V
    .locals 0

    invoke-virtual {p0}, Lwh/i0;->G()V

    return-void
.end method

.method public static synthetic e(Lwh/i0;)V
    .locals 0

    invoke-virtual {p0}, Lwh/i0;->x()V

    return-void
.end method

.method public static synthetic f(Lwh/i0;)V
    .locals 0

    invoke-virtual {p0}, Lwh/i0;->w()V

    return-void
.end method

.method public static synthetic g(Ljava/lang/Runnable;)V
    .locals 0

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public static synthetic h(Lwh/i0;)V
    .locals 0

    invoke-virtual {p0}, Lwh/i0;->v()V

    return-void
.end method

.method public static synthetic i(Lwh/i0;)V
    .locals 0

    invoke-virtual {p0}, Lwh/i0;->z()V

    return-void
.end method


# virtual methods
.method public A(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "onCreateView: savedInstanceState = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", surfaceState = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Lwh/i0;->i:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "rbx.game"

    invoke-static {p2, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/roblox/client/startup/a;->m()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    if-eqz p3, :cond_0

    const-string p1, "onCreateView: No Settings with non-null savedInstanceState. No need to create view."

    invoke-static {p2, p1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lwh/i0;->l:Lwh/v0;

    invoke-interface {p1}, Lwh/v0;->c()V

    return-object v0

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->H1()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lwh/i0;->l()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lfj/a0;->R(Landroid/content/Context;)Lfj/a0;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lwh/i0;->l()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lfj/m;->F0(Landroid/content/Context;)Lfj/m;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lwh/i0;->j:Lej/g;

    invoke-virtual {p0}, Lwh/i0;->q()Lcom/roblox/client/a;

    move-result-object p1

    sget v1, Lsg/m0;->e:I

    invoke-virtual {p1, v1}, Lj/b;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lwh/i0;->h:Landroid/widget/FrameLayout;

    invoke-static {}, Lsg/a1;->k0()Z

    move-result p1

    if-eqz p1, :cond_2

    if-eqz p3, :cond_2

    iget p1, p0, Lwh/i0;->i:I

    const/4 p3, 0x2

    if-ne p1, p3, :cond_2

    const-string p1, "onCreateView: The game is being recreated. Keep the current surface state."

    invoke-static {p2, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    iput p1, p0, Lwh/i0;->i:I

    :goto_1
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->J0()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lwh/i0;->h:Landroid/widget/FrameLayout;

    sget p2, Lsg/m0;->T:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewStub;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lwh/i0;->c:Landroid/widget/FrameLayout;

    goto :goto_2

    :cond_3
    iget-object p1, p0, Lwh/i0;->h:Landroid/widget/FrameLayout;

    sget p2, Lsg/m0;->S:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lwh/i0;->c:Landroid/widget/FrameLayout;

    goto :goto_2

    :cond_4
    iget-object p1, p0, Lwh/i0;->h:Landroid/widget/FrameLayout;

    sget p2, Lsg/m0;->S:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lwh/i0;->c:Landroid/widget/FrameLayout;

    :goto_2
    invoke-virtual {p0, v0}, Lwh/i0;->s(Landroid/view/View;)V

    invoke-static {}, Lmk/c;->p()Lmk/c;

    move-result-object p1

    new-instance p2, Lwh/b0;

    invoke-direct {p2, p0}, Lwh/b0;-><init>(Lwh/i0;)V

    invoke-virtual {p1, p2}, Lmk/c;->s(Ljava/util/function/Consumer;)V

    return-object v0
.end method

.method public final B(Ljava/lang/Runnable;)V
    .locals 2

    invoke-virtual {p0}, Lwh/i0;->o()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lwh/f0;

    invoke-direct {v1, p1}, Lwh/f0;-><init>(Ljava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final C(Lwh/l0;)V
    .locals 5

    const-string v0, "rbx.game"

    const-string v1, "startGame"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lwh/i0;->g:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v0

    new-instance v1, Lqk/a;

    invoke-virtual {p0}, Lwh/i0;->p()Lcom/roblox/engine/jni/model/PlatformParams;

    move-result-object v2

    invoke-direct {v1, v2}, Lqk/a;-><init>(Lcom/roblox/engine/jni/model/PlatformParams;)V

    invoke-static {}, Lsg/a1;->r0()Z

    move-result v2

    iput-boolean v2, v1, Lqk/a;->isTablet:Z

    iget-object v2, p0, Lwh/i0;->l:Lwh/v0;

    iget-wide v3, p1, Lwh/l0;->c:J

    invoke-interface {v2, v3, v4}, Lwh/v0;->a(J)V

    invoke-static {}, Lcom/roblox/engine/jni/autovalue/StartGameParams;->builder()Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->setSurface(Landroid/view/Surface;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->setPlatformParams(Lcom/roblox/engine/jni/model/PlatformParams;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->setDeviceParams(Lcom/roblox/engine/jni/model/DeviceParams;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-wide v1, p1, Lwh/l0;->c:J

    invoke-virtual {v0, v1, v2}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->setPlaceId(J)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-wide v1, p1, Lwh/l0;->b:J

    invoke-virtual {v0, v1, v2}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->setUserId(J)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-object v1, p1, Lwh/l0;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->setAccessCode(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-object v1, p1, Lwh/l0;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->setLinkCode(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-object v1, p1, Lwh/l0;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->setGameId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v1

    invoke-virtual {v1}, Lfk/c;->n()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->setIsUnder13(Z)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v1

    invoke-virtual {v1}, Lfk/c;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->setUsername(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-wide v1, p1, Lwh/l0;->g:J

    invoke-virtual {v0, v1, v2}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->setConversationId(J)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-object v1, p1, Lwh/l0;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->setReservedServerAccessCode(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-object v1, p1, Lwh/l0;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->setCallId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget v1, p1, Lwh/l0;->a:I

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->setJoinRequestType(I)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-object v1, p1, Lwh/l0;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->setReferralPage(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-object v1, p1, Lwh/l0;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->setLaunchData(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-object v1, p1, Lwh/l0;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->setJoinAttemptId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-object v1, p1, Lwh/l0;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->setJoinAttemptOrigin(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-object v1, p1, Lwh/l0;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->setIsoContext(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    iget-wide v1, p1, Lwh/l0;->q:J

    invoke-virtual {v0, v1, v2}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->setReferredByPlayerId(J)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    move-result-object v0

    invoke-static {}, Lsg/a1;->D0()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lwh/i0;->q()Lcom/roblox/client/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->setVrContext(Landroid/app/Activity;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    :cond_0
    iget-object v1, p1, Lwh/l0;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->setGameJoinContext(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    iget-object v1, p1, Lwh/l0;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->setEventId(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->x3()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p1, Lwh/l0;->r:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->setGameIdToExclude(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;

    :cond_1
    invoke-virtual {p0}, Lwh/i0;->q()Lcom/roblox/client/a;

    move-result-object v1

    new-instance v2, Lwh/g0;

    invoke-direct {v2, p0}, Lwh/g0;-><init>(Lwh/i0;)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lcom/roblox/engine/jni/autovalue/StartGameParams$Builder;->build()Lcom/roblox/engine/jni/autovalue/StartGameParams;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2StartGameWithParam(Lcom/roblox/engine/jni/autovalue/StartGameParams;)I

    invoke-virtual {p0}, Lwh/i0;->q()Lcom/roblox/client/a;

    move-result-object v0

    new-instance v1, Lwh/h0;

    invoke-direct {v1, p0}, Lwh/h0;-><init>(Lwh/i0;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lwh/i0;->l:Lwh/v0;

    iget-wide v1, p1, Lwh/l0;->c:J

    invoke-interface {v0, v1, v2}, Lwh/v0;->b(J)V

    return-void
.end method

.method public D()V
    .locals 1

    new-instance v0, Lwh/d0;

    invoke-direct {v0, p0}, Lwh/d0;-><init>(Lwh/i0;)V

    invoke-virtual {p0, v0}, Lwh/i0;->B(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final E()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "stopDataModel: dataModel = GAME, surfaceState = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lwh/i0;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", graphicsStarted = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lwh/i0;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.game"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lwh/i0;->g:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0, p0}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    const/4 v0, -0x1

    iput v0, p0, Lwh/i0;->i:I

    return-void
.end method

.method public final F()V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "surfaceDestroyed: surfaceState = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lwh/i0;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", graphicsStarted = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lwh/i0;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.game"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget v0, p0, Lwh/i0;->i:I

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lwh/i0;->f:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lwh/i0;->f:Z

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2PauseGame()V

    :cond_1
    invoke-virtual {p0}, Lwh/i0;->q()Lcom/roblox/client/a;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "surfaceDestroyed() activity finishing ignore task scheduler"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lwh/i0;->m:Lcom/roblox/client/game/ExperienceSession;

    invoke-virtual {v0}, Lcom/roblox/client/game/ExperienceSession;->Y()V

    :cond_2
    :goto_0
    return-void
.end method

.method public final G()V
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateSurface() surfaceState = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lwh/i0;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.game"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lwh/i0;->q()Lcom/roblox/client/a;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lwh/i0;->i:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-nez v0, :cond_1

    iput v3, p0, Lwh/i0;->i:I

    iput-boolean v2, p0, Lwh/i0;->f:Z

    iget-object v0, p0, Lwh/i0;->a:Lwh/l0;

    invoke-virtual {p0, v0}, Lwh/i0;->C(Lwh/l0;)V

    return-void

    :cond_1
    if-ne v0, v3, :cond_5

    iget-object v0, p0, Lwh/i0;->g:Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v0

    new-instance v3, Lcom/roblox/engine/jni/model/PlatformParams;

    invoke-direct {v3}, Lcom/roblox/engine/jni/model/PlatformParams;-><init>()V

    invoke-virtual {p0}, Lwh/i0;->m()F

    move-result v4

    invoke-virtual {p0}, Lwh/i0;->n()Lcom/roblox/client/game/ExperienceSession;

    move-result-object v5

    invoke-virtual {v5}, Lcom/roblox/client/game/ExperienceSession;->I()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lel/a;->i(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object v5

    iput v4, v3, Lcom/roblox/engine/jni/model/PlatformParams;->dpiScale:F

    iget v4, v5, Landroid/graphics/Point;->x:I

    iput v4, v3, Lcom/roblox/engine/jni/model/PlatformParams;->viewportWidthMm:I

    iget v4, v5, Landroid/graphics/Point;->y:I

    iput v4, v3, Lcom/roblox/engine/jni/model/PlatformParams;->viewportHeightMm:I

    iget-boolean v4, p0, Lwh/i0;->f:Z

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    const-string v2, "updateSurface: nativeUpdateGraphics"

    invoke-static {v1, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lsg/a1;->q0()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lwh/i0;->q()Lcom/roblox/client/a;

    move-result-object v5

    :cond_2
    invoke-static {v0, v3, v5}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2UpdateSurfaceGameWithPlatformParams(Landroid/view/Surface;Lcom/roblox/engine/jni/model/PlatformParams;Landroid/app/Activity;)V

    return-void

    :cond_3
    const-string v4, "updateSurface: nativeStartUpGraphics"

    invoke-static {v1, v4}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iput-boolean v2, p0, Lwh/i0;->f:Z

    invoke-static {}, Lsg/a1;->q0()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lwh/i0;->q()Lcom/roblox/client/a;

    move-result-object v5

    :cond_4
    invoke-static {v0, v3, v5}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2ResumeGameWithPlatformParams(Landroid/view/Surface;Lcom/roblox/engine/jni/model/PlatformParams;Landroid/app/Activity;)V

    :cond_5
    return-void

    :cond_6
    :goto_0
    const-string v0, "updateSurface() activity finishing ignore update"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public j()V
    .locals 1

    new-instance v0, Lwh/z;

    invoke-direct {v0, p0}, Lwh/z;-><init>(Lwh/i0;)V

    invoke-virtual {p0, v0}, Lwh/i0;->B(Ljava/lang/Runnable;)V

    return-void
.end method

.method public k()Landroid/widget/FrameLayout;
    .locals 1

    iget-object v0, p0, Lwh/i0;->h:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public l()Landroid/content/Context;
    .locals 1

    invoke-virtual {p0}, Lwh/i0;->n()Lcom/roblox/client/game/ExperienceSession;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/game/ExperienceSession;->I()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public m()F
    .locals 1

    invoke-virtual {p0}, Lwh/i0;->n()Lcom/roblox/client/game/ExperienceSession;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/game/ExperienceSession;->I()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lel/a;->e(Landroid/content/Context;)F

    move-result v0

    return v0
.end method

.method public n()Lcom/roblox/client/game/ExperienceSession;
    .locals 1

    iget-object v0, p0, Lwh/i0;->m:Lcom/roblox/client/game/ExperienceSession;

    return-object v0
.end method

.method public final o()Ljava/util/concurrent/ExecutorService;
    .locals 1

    iget-object v0, p0, Lwh/i0;->k:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lwh/i0;->k:Ljava/util/concurrent/ExecutorService;

    :cond_0
    iget-object v0, p0, Lwh/i0;->k:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public final p()Lcom/roblox/engine/jni/model/PlatformParams;
    .locals 3

    invoke-static {}, Lmk/c;->p()Lmk/c;

    move-result-object v0

    invoke-virtual {v0}, Lmk/c;->r()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getPlatformParams: assetFolderPath = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "rbx.game"

    invoke-static {v2, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v1, Lcom/roblox/engine/jni/model/PlatformParams;

    invoke-direct {v1}, Lcom/roblox/engine/jni/model/PlatformParams;-><init>()V

    iput-object v0, v1, Lcom/roblox/engine/jni/model/PlatformParams;->assetFolderPath:Ljava/lang/String;

    invoke-virtual {p0}, Lwh/i0;->q()Lcom/roblox/client/a;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v2, "android.hardware.touchscreen"

    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, v1, Lcom/roblox/engine/jni/model/PlatformParams;->isTouchDevice:Z

    invoke-virtual {p0}, Lwh/i0;->q()Lcom/roblox/client/a;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v2, "android.hardware.type.pc"

    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, v1, Lcom/roblox/engine/jni/model/PlatformParams;->isMouseDevice:Z

    invoke-virtual {p0}, Lwh/i0;->q()Lcom/roblox/client/a;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, v1, Lcom/roblox/engine/jni/model/PlatformParams;->isKeyboardDevice:Z

    invoke-virtual {p0}, Lwh/i0;->m()F

    move-result v0

    iput v0, v1, Lcom/roblox/engine/jni/model/PlatformParams;->dpiScale:F

    invoke-virtual {p0}, Lwh/i0;->n()Lcom/roblox/client/game/ExperienceSession;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/game/ExperienceSession;->I()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lel/a;->i(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object v0

    iget v2, v0, Landroid/graphics/Point;->x:I

    iput v2, v1, Lcom/roblox/engine/jni/model/PlatformParams;->viewportWidthMm:I

    iget v0, v0, Landroid/graphics/Point;->y:I

    iput v0, v1, Lcom/roblox/engine/jni/model/PlatformParams;->viewportHeightMm:I

    return-object v1
.end method

.method public q()Lcom/roblox/client/a;
    .locals 1

    iget-object v0, p0, Lwh/i0;->m:Lcom/roblox/client/game/ExperienceSession;

    invoke-virtual {v0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/a;

    return-object v0
.end method

.method public r()Landroid/view/SurfaceView;
    .locals 1

    iget-object v0, p0, Lwh/i0;->g:Landroid/view/SurfaceView;

    return-object v0
.end method

.method public final s(Landroid/view/View;)V
    .locals 1

    const-string p1, "rbx.game"

    const-string v0, "initSurfaceView: ..."

    invoke-static {p1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lwh/i0;->q()Lcom/roblox/client/a;

    move-result-object p1

    sget v0, Lsg/m0;->h0:I

    invoke-virtual {p1, v0}, Lj/b;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/SurfaceView;

    iput-object p1, p0, Lwh/i0;->g:Landroid/view/SurfaceView;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusable(Z)V

    iget-object p1, p0, Lwh/i0;->g:Landroid/view/SurfaceView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    iget-object p1, p0, Lwh/i0;->g:Landroid/view/SurfaceView;

    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    invoke-virtual {p0}, Lwh/i0;->n()Lcom/roblox/client/game/ExperienceSession;

    move-result-object p1

    invoke-virtual {p1}, Lcom/roblox/client/game/ExperienceSession;->M()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lwh/i0;->surfaceCreated(Landroid/view/SurfaceHolder;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, v0, v0}, Lwh/i0;->surfaceChanged(Landroid/view/SurfaceHolder;III)V

    :cond_0
    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    const-string p1, "rbx.game"

    const-string p2, "surfaceChanged: ..."

    invoke-static {p1, p2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Lwh/e0;

    invoke-direct {p1, p0}, Lwh/e0;-><init>(Lwh/i0;)V

    invoke-virtual {p0, p1}, Lwh/i0;->B(Ljava/lang/Runnable;)V

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1

    const-string p1, "rbx.game"

    const-string v0, "surfaceCreated: ..."

    invoke-static {p1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Lwh/a0;

    invoke-direct {p1, p0}, Lwh/a0;-><init>(Lwh/i0;)V

    invoke-virtual {p0, p1}, Lwh/i0;->B(Ljava/lang/Runnable;)V

    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    :try_start_0
    iget-object p1, p0, Lwh/i0;->k:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Lwh/c0;

    invoke-direct {v0, p0}, Lwh/c0;-><init>(Lwh/i0;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p1, "rbx.game"

    const-string v0, "game thread times out"

    invoke-static {p1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final synthetic t()V
    .locals 0

    invoke-virtual {p0}, Lwh/i0;->E()V

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2LeaveGame()V

    return-void
.end method

.method public final synthetic u(Ljava/lang/String;)V
    .locals 1

    iget-object p1, p0, Lwh/i0;->g:Landroid/view/SurfaceView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/SurfaceView;->setVisibility(I)V

    return-void
.end method

.method public final synthetic v()V
    .locals 2

    iget-object v0, p0, Lwh/i0;->c:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public final synthetic w()V
    .locals 2

    invoke-virtual {p0}, Lwh/i0;->q()Lcom/roblox/client/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/b;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lwh/i0;->c:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public final synthetic x()V
    .locals 0

    invoke-virtual {p0}, Lwh/i0;->E()V

    return-void
.end method

.method public final synthetic y()V
    .locals 1

    iget-object v0, p0, Lwh/i0;->m:Lcom/roblox/client/game/ExperienceSession;

    invoke-virtual {v0}, Lcom/roblox/client/game/ExperienceSession;->X()V

    return-void
.end method

.method public final synthetic z()V
    .locals 1

    invoke-virtual {p0}, Lwh/i0;->q()Lcom/roblox/client/a;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lwh/i0;->F()V

    return-void
.end method
