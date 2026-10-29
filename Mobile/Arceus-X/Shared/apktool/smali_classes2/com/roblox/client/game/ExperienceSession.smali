.class public Lcom/roblox/client/game/ExperienceSession;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwh/v0;
.implements Lej/a;
.implements Lcom/roblox/client/game/a$a;
.implements Lxl/g$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/game/ExperienceSession$d;,
        Lcom/roblox/client/game/ExperienceSession$f;,
        Lcom/roblox/client/game/ExperienceSession$e;
    }
.end annotation


# static fields
.field public static x:Z


# instance fields
.field public a:Lwh/x0;

.field public final b:Ljava/lang/String;

.field public c:Z

.field public d:Z

.field public e:Landroid/os/CountDownTimer;

.field public f:Lcom/roblox/client/game/ExperienceSession$d;

.field public final g:Landroid/os/Bundle;

.field public final h:J

.field public final i:Lcom/roblox/client/game/ExperienceSession$f;

.field public j:Lwh/i0;

.field public k:Lcom/roblox/client/game/b;

.field public l:Landroid/os/Handler;

.field public m:Lcom/roblox/client/purchase/IAPPurchaseManager;

.field public n:Lsg/y;

.field public o:I

.field public p:Z

.field public q:J

.field public r:Lwh/y0;

.field public s:Landroid/view/ViewGroup;

.field public t:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field public u:J

.field public v:Z

.field public w:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "ExperienceSession"

    iput-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->b:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roblox/client/game/ExperienceSession;->c:Z

    const-wide/16 v1, 0x7530

    iput-wide v1, p0, Lcom/roblox/client/game/ExperienceSession;->h:J

    new-instance v1, Lcom/roblox/client/game/ExperienceSession$f;

    invoke-direct {v1, p0}, Lcom/roblox/client/game/ExperienceSession$f;-><init>(Lcom/roblox/client/game/ExperienceSession;)V

    iput-object v1, p0, Lcom/roblox/client/game/ExperienceSession;->i:Lcom/roblox/client/game/ExperienceSession$f;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/roblox/client/game/ExperienceSession;->k:Lcom/roblox/client/game/b;

    iput-boolean v0, p0, Lcom/roblox/client/game/ExperienceSession;->v:Z

    iput-boolean v0, p0, Lcom/roblox/client/game/ExperienceSession;->w:Z

    iput-object p1, p0, Lcom/roblox/client/game/ExperienceSession;->g:Landroid/os/Bundle;

    return-void
.end method

.method private L(Landroid/view/View;)V
    .locals 3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->J0()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lsg/m0;->R:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    :cond_0
    sget v0, Lsg/m0;->G:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/RbxKeyboard;

    if-nez p1, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->I()Landroid/content/Context;

    move-result-object v0

    const-string v1, "SourceSansPro-Regular.ttf"

    invoke-static {p1, v0, v1}, Leh/e;->d(Landroid/widget/TextView;Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Lcom/roblox/client/game/b;

    iget-object v1, p0, Lcom/roblox/client/game/ExperienceSession;->j:Lwh/i0;

    iget-object v2, p0, Lcom/roblox/client/game/ExperienceSession;->i:Lcom/roblox/client/game/ExperienceSession$f;

    invoke-direct {v0, p1, v1, v2}, Lcom/roblox/client/game/b;-><init>(Lcom/roblox/client/RbxKeyboard;Lwh/i0;Lcom/roblox/client/game/ExperienceSession$f;)V

    iput-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->k:Lcom/roblox/client/game/b;

    invoke-static {}, Lcom/roblox/client/RobloxApplication;->f()Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->k:Lcom/roblox/client/game/b;

    invoke-virtual {p1, v0}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    return-void
.end method

.method public static synthetic d(Lcom/roblox/client/game/ExperienceSession;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->O()V

    return-void
.end method

.method public static synthetic e(Lcom/roblox/client/game/ExperienceSession;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/game/ExperienceSession;->S(I)V

    return-void
.end method

.method private k0()V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_3

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->f:Lcom/roblox/client/game/ExperienceSession$d;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Le/z;->a(Landroid/view/WindowManager$LayoutParams;I)V

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->q0()Lcom/roblox/client/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roblox/client/b;->G1()Lmi/a;

    move-result-object v1

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v1, v0}, Lmi/a;->e(Landroid/view/View;)V

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->a:Lwh/x0;

    if-nez v0, :cond_2

    new-instance v0, Lwh/x0;

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lwh/x0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->a:Lwh/x0;

    :cond_2
    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->a:Lwh/x0;

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->q0()Lcom/roblox/client/b;

    move-result-object v1

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->q0()Lcom/roblox/client/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roblox/client/b;->G1()Lmi/a;

    move-result-object v2

    invoke-virtual {v2}, Lmi/a;->a()Landroidx/lifecycle/a0;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lwh/x0;->i(Landroidx/lifecycle/s;Landroidx/lifecycle/a0;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public static synthetic r(Lcom/roblox/client/game/ExperienceSession;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/game/ExperienceSession;->R(I)V

    return-void
.end method

.method public static synthetic s(Landroid/view/View;)V
    .locals 1

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static shouldDisableExperienceIdleTimer()Z
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-static {}, Lxl/g;->x()Lxl/g;

    move-result-object v0

    invoke-virtual {v0}, Lxl/g;->h()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->isCapturingMedia()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->y3()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->INSTANCE:Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;

    invoke-virtual {v0}, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->isInInquiryFlow()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public static synthetic t(Lcom/roblox/client/game/ExperienceSession;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/game/ExperienceSession;->P(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic u(Lcom/roblox/client/game/ExperienceSession;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/game/ExperienceSession;->Q(Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic w(Lcom/roblox/client/game/ExperienceSession;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->N()V

    return-void
.end method

.method public static bridge synthetic x(Lcom/roblox/client/game/ExperienceSession;)Landroid/view/ViewGroup;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/game/ExperienceSession;->s:Landroid/view/ViewGroup;

    return-object p0
.end method

.method public static bridge synthetic y(Lcom/roblox/client/game/ExperienceSession;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->B()V

    return-void
.end method

.method public static bridge synthetic z(Lcom/roblox/client/game/ExperienceSession;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->G()V

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 2

    const-string v0, "ExperienceSession"

    const-string v1, "GameSession cancelScheduledGameExit"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->e:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->e:Landroid/os/CountDownTimer;

    :cond_0
    return-void
.end method

.method public final B()V
    .locals 3

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "ExperienceSession"

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const-string v0, "endGameInBackground: call finish() on this GL activity."

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, v2}, Lcom/roblox/client/game/ExperienceSession;->D(Z)V

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->C5()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "endGameInBackground: setAppSuspended(true)"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v2}, Lcom/roblox/engine/jni/NativeReportingInterface;->setAppSuspended(Z)V

    :cond_1
    const-string v0, "ES.endGameInBackground"

    invoke-static {v2, v0}, Lcom/roblox/engine/jni/NativeGLInterface;->setTaskSchedulerBackgroundMode(ZLjava/lang/String;)V

    invoke-virtual {p0, v2}, Lcom/roblox/client/game/ExperienceSession;->T(Z)V

    return-void
.end method

.method public C(Ljava/lang/String;Z)V
    .locals 0

    return-void
.end method

.method public D(Z)V
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Ending game session with place ID "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/roblox/client/game/ExperienceSession;->u:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExperienceSession"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roblox/client/game/ExperienceSession;->w:Z

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->A()V

    invoke-static {}, Lxl/g;->x()Lxl/g;

    move-result-object v2

    invoke-virtual {v2, p0}, Lxl/g;->w(Lxl/g$a;)V

    if-nez p1, :cond_0

    invoke-static {}, Lcom/roblox/engine/jni/NativeReportingInterface;->applicationForegrounded()V

    :cond_0
    invoke-virtual {p0, v0}, Lcom/roblox/client/game/ExperienceSession;->h0(Z)V

    iget-boolean v0, p0, Lcom/roblox/client/game/ExperienceSession;->c:Z

    if-eqz v0, :cond_1

    const-string p1, "Trying to end the session but it has already ended."

    invoke-static {v1, p1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roblox/client/game/ExperienceSession;->c:Z

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->c0()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v2, "gameExitStatus"

    const/16 v3, 0x66

    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->k0()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/roblox/client/game/ExperienceSession;->g:Landroid/os/Bundle;

    const-string v3, "roblox_placeId"

    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    const-string v4, "placeId"

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    iget-object v2, p0, Lcom/roblox/client/game/ExperienceSession;->g:Landroid/os/Bundle;

    const-string v3, "roblox_gameId"

    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "gameId"

    invoke-virtual {v0, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v2

    xor-int/lit8 v3, v2, 0x1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "onDestroy: shutdown = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", hasGameStarted = "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v3, p0, Lcom/roblox/client/game/ExperienceSession;->d:Z

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-nez v2, :cond_4

    iget-boolean v2, p0, Lcom/roblox/client/game/ExperienceSession;->d:Z

    if-eqz v2, :cond_4

    const-string v2, "onDestroy: Call stopDataModel (SYNC) if the GL fragment is still there..."

    invoke-static {v1, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/roblox/client/game/ExperienceSession;->j:Lwh/i0;

    invoke-virtual {p1}, Lwh/i0;->j()V

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lcom/roblox/client/game/ExperienceSession;->j:Lwh/i0;

    invoke-virtual {p1}, Lwh/i0;->D()V

    :cond_4
    :goto_0
    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object p1

    new-instance v1, Lwh/r;

    invoke-direct {v1, p0}, Lwh/r;-><init>(Lcom/roblox/client/game/ExperienceSession;)V

    invoke-virtual {p1, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setExitImplementation(Lcom/roblox/engine/jni/EngineExitJavaCallback2;)V

    iget-object p1, p0, Lcom/roblox/client/game/ExperienceSession;->f:Lcom/roblox/client/game/ExperienceSession$d;

    invoke-interface {p1, v0}, Lcom/roblox/client/game/ExperienceSession$d;->m(Landroid/os/Bundle;)V

    invoke-static {}, Lcom/roblox/client/RobloxApplication;->f()Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->k:Lcom/roblox/client/game/b;

    invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    return-void
.end method

.method public final E()V
    .locals 3

    const-string v0, "Entering immersive mode"

    const-string v1, "ExperienceSession"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v0, p0, Lcom/roblox/client/game/ExperienceSession;->p:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, Lsg/c2;->b(Landroid/view/Window;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "System visibility "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/roblox/client/game/ExperienceSession;->o:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget v0, p0, Lcom/roblox/client/game/ExperienceSession;->o:I

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    iput v0, p0, Lcom/roblox/client/game/ExperienceSession;->o:I

    :cond_1
    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x1706

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    :goto_0
    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/ActivityNativeMain;

    invoke-virtual {v0}, Lcom/roblox/client/a;->W1()Lmi/c;

    move-result-object v0

    sget-object v1, Lwh/t0;->a:Lwh/t0;

    invoke-virtual {v0, v1}, Lmi/c;->o(Lwh/t0;)V

    return-void
.end method

.method public final F()V
    .locals 3

    const-string v0, "ExperienceSession"

    const-string v1, "Exiting immersive mode"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    move-object v1, v0

    check-cast v1, Lcom/roblox/client/a;

    invoke-virtual {v1}, Lcom/roblox/client/a;->W1()Lmi/c;

    move-result-object v1

    sget-object v2, Lwh/t0;->b:Lwh/t0;

    invoke-virtual {v1, v2}, Lmi/c;->o(Lwh/t0;)V

    iget-boolean v1, p0, Lcom/roblox/client/game/ExperienceSession;->p:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-static {v1}, Lsg/c2;->c(Landroid/view/Window;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    iget v2, p0, Lcom/roblox/client/game/ExperienceSession;->o:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setSystemUiVisibility(I)V

    :goto_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-static {v1}, Lsg/a1;->Q0(Landroid/content/res/Configuration;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lwh/s;

    invoke-direct {v1, p0}, Lwh/s;-><init>(Lcom/roblox/client/game/ExperienceSession;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_2
    :goto_1
    return-void
.end method

.method public final G()V
    .locals 2

    const-string v0, "ExperienceSession"

    const-string v1, "finishGame:"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Le4/q;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->b0()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roblox/client/game/ExperienceSession;->D(Z)V

    :cond_0
    return-void
.end method

.method public H()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->f:Lcom/roblox/client/game/ExperienceSession$d;

    invoke-interface {v0}, Lcom/roblox/client/game/ExperienceSession$d;->o0()Le4/q;

    move-result-object v0

    return-object v0
.end method

.method public I()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->f:Lcom/roblox/client/game/ExperienceSession$d;

    invoke-interface {v0}, Lcom/roblox/client/game/ExperienceSession$d;->o0()Le4/q;

    move-result-object v0

    return-object v0
.end method

.method public final J()V
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->G()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roblox/client/game/ExperienceSession;->T(Z)V

    return-void
.end method

.method public final K()V
    .locals 3

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v0

    sget v1, Lsg/m0;->V:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v2, 0x8

    if-eq v1, v2, :cond_0

    new-instance v1, Lwh/u;

    invoke-direct {v1, v0}, Lwh/u;-><init>(Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public M()Z
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->f:Lcom/roblox/client/game/ExperienceSession$d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lsg/f0;->b()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final synthetic N()V
    .locals 2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->c5()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->b0()V

    iget-boolean v0, p0, Lcom/roblox/client/game/ExperienceSession;->p:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnSystemUiVisibilityChangeListener(Landroid/view/View$OnSystemUiVisibilityChangeListener;)V

    :cond_1
    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->F()V

    return-void
.end method

.method public final synthetic O()V
    .locals 2

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, Lsg/c2;->b(Landroid/view/Window;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final synthetic P(Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->J()V

    return-void
.end method

.method public final synthetic Q(Landroid/content/DialogInterface;)V
    .locals 0

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->J()V

    return-void
.end method

.method public final synthetic R(I)V
    .locals 2

    invoke-static {}, Lqi/b;->f()Lqi/b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->I()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqi/b;->u(Landroid/content/Context;)V

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v0

    sget v1, Lsg/q0;->N:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lwh/w;

    invoke-direct {v1, p0}, Lwh/w;-><init>(Lcom/roblox/client/game/ExperienceSession;)V

    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    new-instance v0, Lwh/x;

    invoke-direct {v0, p0}, Lwh/x;-><init>(Lcom/roblox/client/game/ExperienceSession;)V

    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public final synthetic S(I)V
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/client/game/ExperienceSession;->c:Z

    if-nez v0, :cond_0

    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->E()V

    :cond_0
    return-void
.end method

.method public T(Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onGameEnded: success = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, ", hasGameStarted = "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean p1, p0, Lcom/roblox/client/game/ExperienceSession;->d:Z

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ExperienceSession"

    invoke-static {v0, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/roblox/client/game/ExperienceSession;->d:Z

    return-void
.end method

.method public U(I)V
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/b;

    invoke-virtual {v0, p1}, Lcom/roblox/client/b;->U(I)V

    return-void
.end method

.method public V(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public W(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/b;

    invoke-virtual {v0, p1}, Lcom/roblox/client/b;->W(Ljava/lang/String;)V

    return-void
.end method

.method public X()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onSurfaceCreated: finished = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/client/game/ExperienceSession;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExperienceSession"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    const-string v1, "ES.onSurfaceCreated"

    invoke-static {v0, v1}, Lcom/roblox/engine/jni/NativeGLInterface;->setTaskSchedulerBackgroundMode(ZLjava/lang/String;)V

    return-void
.end method

.method public Y()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onSurfaceDestroyed: finished = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/client/game/ExperienceSession;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExperienceSession"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public Z()V
    .locals 3

    invoke-static {}, Lcom/roblox/client/game/ExperienceSession;->shouldDisableExperienceIdleTimer()Z

    move-result v0

    const/4 v1, 0x1

    const-string v2, "ExperienceSession"

    if-eqz v0, :cond_0

    const-string v0, "Not pausing game session, user is in a call or capturing media or in a persona session"

    invoke-static {v2, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iput-boolean v1, p0, Lcom/roblox/client/game/ExperienceSession;->w:Z

    return-void

    :cond_0
    const-string v0, "Pause game session"

    invoke-static {v2, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->n:Lsg/y;

    invoke-virtual {v0}, Lsg/y;->p()Lvj/a;

    move-result-object v0

    invoke-virtual {v0}, Lvj/a;->d()V

    invoke-virtual {p0, v1}, Lcom/roblox/client/game/ExperienceSession;->h0(Z)V

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->e0()V

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->b0()V

    return-void
.end method

.method public a(J)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onGameStarting: placeId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ExperienceSession"

    invoke-static {p2, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/game/ExperienceSession;->n:Lsg/y;

    invoke-virtual {p1}, Lsg/y;->p()Lvj/a;

    move-result-object p1

    invoke-virtual {p1}, Lvj/a;->b()V

    return-void
.end method

.method public a0(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->l:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b(J)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onGameStarted: placeId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExperienceSession"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roblox/client/game/ExperienceSession;->d:Z

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->n:Lsg/y;

    invoke-virtual {v0}, Lsg/y;->p()Lvj/a;

    move-result-object v0

    invoke-virtual {v0}, Lvj/a;->a()V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->n5()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->I()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/roblox/client/ossearch/b;->b(Landroid/content/Context;J)V

    :cond_0
    return-void
.end method

.method public final b0()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->t:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    if-eqz v0, :cond_0

    const-string v0, "rbx.screen"

    const-string v1, "removing GlobalLayoutListener"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->s:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/game/ExperienceSession;->t:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->t:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    const-string v0, "ExperienceSession"

    const-string v1, "onSettingsNotLoaded (detected from Game fragment)"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v0

    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setResult(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roblox/client/game/ExperienceSession;->D(Z)V

    :cond_0
    return-void
.end method

.method public final c0()V
    .locals 4

    iget-wide v0, p0, Lcom/roblox/client/game/ExperienceSession;->q:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/roblox/client/game/ExperienceSession;->q:J

    sub-long/2addr v0, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Game duration: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, "ms."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ExperienceSession"

    invoke-static {v3, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v2

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->I()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3, v0, v1}, Lvi/g;->k(Landroid/content/Context;J)V

    :cond_0
    return-void
.end method

.method public d0()V
    .locals 2

    const-string v0, "ExperienceSession"

    const-string v1, "Resume game session"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roblox/client/game/ExperienceSession;->w:Z

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/roblox/client/game/ExperienceSession;->g0(Z)V

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->A()V

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->n:Lsg/y;

    invoke-virtual {v0}, Lsg/y;->p()Lvj/a;

    move-result-object v0

    invoke-virtual {v0}, Lvj/a;->e()V

    return-void
.end method

.method public final e0()V
    .locals 9

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->O0()Z

    move-result v0

    const-wide/16 v1, 0x7530

    if-eqz v0, :cond_0

    invoke-static {}, Ldm/b;->i()Ldm/b;

    move-result-object v0

    const-string v3, "Backgrounding.General"

    invoke-virtual {v0, v3}, Ldm/b;->d(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    new-instance v3, Ldm/a;

    invoke-direct {v3, v0, v1, v2}, Ldm/a;-><init>(Lorg/json/JSONObject;J)V

    invoke-virtual {v3}, Ldm/a;->a()J

    move-result-wide v1

    :cond_0
    move-wide v5, v1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CountDownTimer constructed with delay:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExperienceSession"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v3, Lcom/roblox/client/game/ExperienceSession$c;

    const-wide/16 v7, 0x3e8

    move-object v4, p0

    invoke-direct/range {v3 .. v8}, Lcom/roblox/client/game/ExperienceSession$c;-><init>(Lcom/roblox/client/game/ExperienceSession;JJ)V

    invoke-virtual {v3}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    move-result-object v0

    iput-object v0, v4, Lcom/roblox/client/game/ExperienceSession;->e:Landroid/os/CountDownTimer;

    return-void
.end method

.method public f(Z)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->f:Lcom/roblox/client/game/ExperienceSession$d;

    invoke-interface {v0, p1}, Lsg/f0;->f(Z)V

    return-void
.end method

.method public f0()Landroid/app/Activity;
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method public g(I)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->r:Lwh/y0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/roblox/client/game/ExperienceSession$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/roblox/client/game/ExperienceSession$e;-><init>(Lcom/roblox/client/game/ExperienceSession;Lwh/y;)V

    iput-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->r:Lwh/y0;

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->r:Lwh/y0;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Leh/a;->e(Ljava/lang/Object;)V

    return-void
.end method

.method public final declared-synchronized g0(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/roblox/client/game/ExperienceSession;->v:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lcom/roblox/client/game/ExperienceSession;->v:Z

    invoke-static {}, Lcom/roblox/engine/jni/NativeReportingInterface;->gameForegrounded()V

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeOnExperienceSessionResume()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeOnFragmentStart()V

    :goto_0
    invoke-static {}, Lhm/b;->h()Lhm/b;

    move-result-object p1

    invoke-virtual {p1}, Lhm/b;->e()V

    iget-object p1, p0, Lcom/roblox/client/game/ExperienceSession;->t:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/roblox/client/game/ExperienceSession;->k:Lcom/roblox/client/game/b;

    if-eqz p1, :cond_2

    const-string p1, "rbx.screen"

    const-string v0, "adding GlobalLayoutListener"

    invoke-static {p1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/game/ExperienceSession;->k:Lcom/roblox/client/game/b;

    iput-object p1, p0, Lcom/roblox/client/game/ExperienceSession;->t:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    iget-object p1, p0, Lcom/roblox/client/game/ExperienceSession;->s:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->t:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_2
    iget-object p1, p0, Lcom/roblox/client/game/ExperienceSession;->k:Lcom/roblox/client/game/b;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/roblox/client/game/b;->y()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public h(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->m:Lcom/roblox/client/purchase/IAPPurchaseManager;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->A(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final declared-synchronized h0(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/roblox/client/game/ExperienceSession;->v:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    iput-boolean v0, p0, Lcom/roblox/client/game/ExperienceSession;->v:Z

    invoke-static {}, Lcom/roblox/engine/jni/NativeReportingInterface;->gameBackgrounded()V

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeOnExperienceSessionPause()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeOnFragmentStop()V

    :goto_0
    invoke-static {}, Lhm/b;->h()Lhm/b;

    move-result-object p1

    invoke-virtual {p1}, Lhm/b;->f()V

    iget-object p1, p0, Lcom/roblox/client/game/ExperienceSession;->k:Lcom/roblox/client/game/b;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/roblox/client/game/b;->G()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->f:Lcom/roblox/client/game/ExperienceSession$d;

    invoke-interface {v0}, Lcom/roblox/client/game/ExperienceSession$d;->o0()Le4/q;

    move-result-object v0

    invoke-static {v0, p1, p2, p3}, Lsg/q;->g(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public i0(Lcom/roblox/client/game/ExperienceSession$d;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/game/ExperienceSession;->f:Lcom/roblox/client/game/ExperienceSession$d;

    return-void
.end method

.method public j(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->m:Lcom/roblox/client/purchase/IAPPurchaseManager;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->z(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final j0(J)V
    .locals 1

    new-instance p1, Lcom/roblox/client/game/a;

    iget-object p2, p0, Lcom/roblox/client/game/ExperienceSession;->k:Lcom/roblox/client/game/b;

    invoke-direct {p1, p0, p2}, Lcom/roblox/client/game/a;-><init>(Lcom/roblox/client/game/a$a;Lwh/w0;)V

    new-instance p2, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->l:Landroid/os/Handler;

    invoke-direct {p2, v0, p1}, Lcom/roblox/engine/jni/RunOnMainEngineJavaCallback;-><init>(Landroid/os/Handler;Lcom/roblox/engine/jni/EngineJavaCallback2;)V

    invoke-static {p2}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setImplementation(Lcom/roblox/engine/jni/EngineJavaCallback2;)V

    new-instance p1, Lcom/roblox/client/game/ExperienceSession$b;

    invoke-direct {p1, p0}, Lcom/roblox/client/game/ExperienceSession$b;-><init>(Lcom/roblox/client/game/ExperienceSession;)V

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setExitImplementation(Lcom/roblox/engine/jni/EngineExitJavaCallback2;)V

    return-void
.end method

.method public k(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->m:Lcom/roblox/client/purchase/IAPPurchaseManager;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/roblox/client/purchase/IAPPurchaseManager;->B(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public l(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->m:Lcom/roblox/client/purchase/IAPPurchaseManager;

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/roblox/client/purchase/IAPPurchaseManager;->C(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public l0()V
    .locals 6

    const-string v0, "ExperienceSession"

    const-string v1, "Start game session"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->k4()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "native_experience_start"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->A()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->l:Landroid/os/Handler;

    new-instance v0, Lcom/roblox/client/purchase/IAPPurchaseManager;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/roblox/client/purchase/IAPPurchaseManager;-><init>(Lej/a;Z)V

    iput-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->m:Lcom/roblox/client/purchase/IAPPurchaseManager;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->R5()Z

    move-result v0

    iput-boolean v0, p0, Lcom/roblox/client/game/ExperienceSession;->p:Z

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->E()V

    iget-boolean v0, p0, Lcom/roblox/client/game/ExperienceSession;->p:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    new-instance v2, Lwh/t;

    invoke-direct {v2, p0}, Lwh/t;-><init>(Lcom/roblox/client/game/ExperienceSession;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnSystemUiVisibilityChangeListener(Landroid/view/View$OnSystemUiVisibilityChangeListener;)V

    :cond_1
    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->K()V

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->g:Landroid/os/Bundle;

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v2

    sget v3, Lsg/m0;->e:I

    invoke-virtual {v2, v3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, p0, Lcom/roblox/client/game/ExperienceSession;->s:Landroid/view/ViewGroup;

    invoke-direct {p0}, Lcom/roblox/client/game/ExperienceSession;->k0()V

    invoke-static {}, Lwh/y0;->j()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/roblox/client/game/ExperienceSession;->f:Lcom/roblox/client/game/ExperienceSession$d;

    invoke-interface {v2}, Lsg/f0;->I()V

    :cond_2
    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v2

    iput-object v2, p0, Lcom/roblox/client/game/ExperienceSession;->n:Lsg/y;

    new-instance v2, Lwh/l0;

    invoke-direct {v2, v0}, Lwh/l0;-><init>(Landroid/os/Bundle;)V

    const-string v3, "roblox_placeId"

    const-wide/16 v4, 0x0

    invoke-virtual {v0, v3, v4, v5}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    iput-wide v3, p0, Lcom/roblox/client/game/ExperienceSession;->u:J

    invoke-static {}, Lsg/a1;->V0()V

    sget-boolean v0, Lcom/roblox/client/game/ExperienceSession;->x:Z

    if-nez v0, :cond_3

    const/4 v0, 0x1

    sput-boolean v0, Lcom/roblox/client/game/ExperienceSession;->x:Z

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeGameGlobalInit()V

    :cond_3
    invoke-static {}, Lsg/a1;->U0()V

    new-instance v0, Lwh/i0;

    invoke-direct {v0, p0, v2}, Lwh/i0;-><init>(Lcom/roblox/client/game/ExperienceSession;Lwh/l0;)V

    iput-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->j:Lwh/i0;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2, v2}, Lwh/i0;->A(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->s:Landroid/view/ViewGroup;

    invoke-direct {p0, v0}, Lcom/roblox/client/game/ExperienceSession;->L(Landroid/view/View;)V

    iget-wide v2, p0, Lcom/roblox/client/game/ExperienceSession;->u:J

    invoke-virtual {p0, v2, v3}, Lcom/roblox/client/game/ExperienceSession;->j0(J)V

    invoke-virtual {p0, v1}, Lcom/roblox/client/game/ExperienceSession;->g0(Z)V

    invoke-static {}, Lcom/roblox/engine/jni/NativeReportingInterface;->applicationBackgrounded()V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->c5()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    :cond_4
    invoke-static {}, Lxl/g;->x()Lxl/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lxl/g;->g(Lxl/g$a;)V

    return-void
.end method

.method public m(J)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onGameLoaded: placeId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ExperienceSession"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->k:Lcom/roblox/client/game/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/roblox/client/game/b;->K(J)V

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/roblox/client/game/ExperienceSession;->q:J

    return-void
.end method

.method public m0(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public n(JLjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/ExperienceSession;->m:Lcom/roblox/client/purchase/IAPPurchaseManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->y(JLjava/lang/String;)V

    return-void
.end method

.method public o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public q(I)V
    .locals 1

    new-instance v0, Lwh/v;

    invoke-direct {v0, p0, p1}, Lwh/v;-><init>(Lcom/roblox/client/game/ExperienceSession;I)V

    invoke-virtual {p0, v0}, Lcom/roblox/client/game/ExperienceSession;->a0(Ljava/lang/Runnable;)V

    return-void
.end method

.method public q0()Lcom/roblox/client/b;
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/game/ExperienceSession;->H()Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/a;

    return-object v0
.end method

.method public v(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iget-boolean p1, p0, Lcom/roblox/client/game/ExperienceSession;->w:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/roblox/client/game/ExperienceSession;->l:Landroid/os/Handler;

    new-instance p2, Lcom/roblox/client/game/ExperienceSession$a;

    invoke-direct {p2, p0}, Lcom/roblox/client/game/ExperienceSession$a;-><init>(Lcom/roblox/client/game/ExperienceSession;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/roblox/client/game/ExperienceSession;->w:Z

    :cond_0
    return-void
.end method
