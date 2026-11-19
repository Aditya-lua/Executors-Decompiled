.class public Lcom/roblox/client/startup/ActivitySplash;
.super Lcom/roblox/client/a;
.source "SourceFile"

# interfaces
.implements Lik/n0;
.implements Lcom/roblox/client/startup/c$b;


# static fields
.field public static e0:Z = true

.field public static f0:Z


# instance fields
.field public S:Lcom/roblox/client/components/LoadingBar;

.field public T:Ljava/lang/Runnable;

.field public U:J

.field public V:Landroid/os/Handler;

.field public W:Z

.field public X:Landroid/content/Intent;

.field public Y:Z

.field public Z:Z

.field public a0:Lcom/roblox/client/startup/StartedForEnum;

.field public b0:Z

.field public c0:Z

.field public d0:Lam/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/roblox/client/a;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->V:Landroid/os/Handler;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roblox/client/startup/ActivitySplash;->W:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->d0:Lam/d;

    return-void
.end method

.method private A2(I)V
    .locals 1

    const-string v0, "retry_during_splash"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/roblox/client/startup/c;->y2(Lj/b;I)V

    return-void
.end method

.method private B2()V
    .locals 2

    const-string v0, "rbx.splash"

    const-string v1, "startup:"

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/roblox/client/startup/ActivitySplash;->C2(Z)V

    invoke-static {p0}, Lik/k0;->s(Landroid/content/Context;)Lik/k0;

    move-result-object v0

    invoke-virtual {v0}, Lik/k0;->O()V

    return-void
.end method

.method private C2(Z)V
    .locals 6

    invoke-static {}, Lbh/a1;->q0()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "rbx.splash"

    const-string v0, "updateLoadingView is disabled to disable loading screen for full VR experience."

    invoke-static {p1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->S:Lcom/roblox/client/components/LoadingBar;

    if-nez v0, :cond_1

    return-void

    :cond_1
    if-eqz p1, :cond_4

    sget-boolean p1, Lcom/roblox/client/startup/ActivitySplash;->e0:Z

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    sput-boolean v1, Lcom/roblox/client/startup/ActivitySplash;->e0:Z

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/roblox/client/startup/ActivitySplash;->U:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x1388

    cmp-long p1, v2, v4

    if-ltz p1, :cond_2

    iget-object p1, p0, Lcom/roblox/client/startup/ActivitySplash;->S:Lcom/roblox/client/components/LoadingBar;

    invoke-virtual {p1, v1}, Lcom/roblox/client/components/LoadingBar;->setVisibility(I)V

    return-void

    :cond_2
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/startup/ActivitySplash;->V:Landroid/os/Handler;

    new-instance p1, Lcom/roblox/client/startup/ActivitySplash$a;

    invoke-direct {p1, p0}, Lcom/roblox/client/startup/ActivitySplash$a;-><init>(Lcom/roblox/client/startup/ActivitySplash;)V

    iput-object p1, p0, Lcom/roblox/client/startup/ActivitySplash;->T:Ljava/lang/Runnable;

    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->V:Landroid/os/Handler;

    sub-long/2addr v4, v2

    invoke-virtual {v0, p1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_3
    invoke-virtual {v0, v1}, Lcom/roblox/client/components/LoadingBar;->setVisibility(I)V

    return-void

    :cond_4
    invoke-virtual {p0}, Lcom/roblox/client/startup/ActivitySplash;->p2()V

    iget-object p1, p0, Lcom/roblox/client/startup/ActivitySplash;->S:Lcom/roblox/client/components/LoadingBar;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lcom/roblox/client/components/LoadingBar;->setVisibility(I)V

    return-void
.end method

.method public static synthetic i2(Lcom/roblox/client/startup/ActivitySplash;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/startup/ActivitySplash;->v2()V

    return-void
.end method

.method public static synthetic j2(Lcom/roblox/client/startup/ActivitySplash;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/startup/ActivitySplash;->u2()V

    return-void
.end method

.method public static synthetic k2(Lcom/roblox/client/startup/ActivitySplash;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/startup/ActivitySplash;->s2()V

    return-void
.end method

.method public static synthetic l2(Lcom/roblox/client/startup/ActivitySplash;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/startup/ActivitySplash;->t2()V

    return-void
.end method

.method public static bridge synthetic m2(Lcom/roblox/client/startup/ActivitySplash;)Lcom/roblox/client/components/LoadingBar;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/ActivitySplash;->S:Lcom/roblox/client/components/LoadingBar;

    return-object p0
.end method

.method public static bridge synthetic n2(Lcom/roblox/client/startup/ActivitySplash;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/startup/ActivitySplash;->T:Ljava/lang/Runnable;

    return-void
.end method

.method public static o2(Landroid/content/Context;Lcom/roblox/client/startup/StartedForEnum;)Landroid/content/Intent;
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/startup/ActivitySplash;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "buildIntent for: "

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "rbx.splash"

    invoke-static {v1, p0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string p0, "STARTED_FOR_INTENT_KEY"

    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    return-object v0
.end method

.method private q2()V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/c;->v2(Lj/b;)V

    return-void
.end method

.method public static r2()Z
    .locals 1

    sget-boolean v0, Lcom/roblox/client/startup/ActivitySplash;->f0:Z

    return v0
.end method


# virtual methods
.method public F()V
    .locals 2

    invoke-static {}, Ldj/g;->b()Ldj/g;

    move-result-object v0

    iget-boolean v1, p0, Lcom/roblox/client/startup/ActivitySplash;->W:Z

    invoke-virtual {v0, v1}, Ldj/g;->i(Z)V

    invoke-virtual {p0}, Lcom/roblox/client/startup/ActivitySplash;->z2()V

    invoke-virtual {p0}, Lcom/roblox/client/b;->J1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->q0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->d0:Lam/d;

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lik/c;

    invoke-direct {v1, p0}, Lik/c;-><init>(Lcom/roblox/client/startup/ActivitySplash;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void

    :cond_0
    const-string v0, "rbx.splash"

    const-string v1, "updateViewAppSettingsLoaded: (NEW_STARTUP) launch the Main activity now..."

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roblox/client/startup/ActivitySplash;->c0:Z

    invoke-static {p0}, Lik/k0;->s(Landroid/content/Context;)Lik/k0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lik/k0;->S(Lik/n0;)V

    iget-boolean v0, p0, Lcom/roblox/client/startup/ActivitySplash;->b0:Z

    invoke-virtual {p0, v0}, Lcom/roblox/client/startup/ActivitySplash;->w2(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_1
    return-void
.end method

.method public I()V
    .locals 1

    invoke-static {}, Lbh/a1;->q0()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lbh/q0;->S:I

    invoke-static {p0, v0}, Lok/x;->a(Landroid/app/Activity;I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roblox/client/startup/ActivitySplash;->C2(Z)V

    invoke-virtual {p0}, Lcom/roblox/client/b;->J1()Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lbh/q0;->S:I

    invoke-direct {p0, v0}, Lcom/roblox/client/startup/ActivitySplash;->A2(I)V

    :cond_1
    return-void
.end method

.method public M()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/startup/ActivitySplash;->q2()V

    invoke-direct {p0}, Lcom/roblox/client/startup/ActivitySplash;->B2()V

    return-void
.end method

.method public N()V
    .locals 0

    return-void
.end method

.method public P1()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public Q1()Lui/c;
    .locals 1

    new-instance v0, Lui/d;

    invoke-direct {v0}, Lui/d;-><init>()V

    return-object v0
.end method

.method public i()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/startup/ActivitySplash;->q2()V

    invoke-direct {p0}, Lcom/roblox/client/startup/ActivitySplash;->B2()V

    return-void
.end method

.method public i0()V
    .locals 0

    return-void
.end method

.method public k0()V
    .locals 2

    invoke-virtual {p0}, Lcom/roblox/client/b;->J1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->q0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->d0:Lam/d;

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lik/a;

    invoke-direct {v1, p0}, Lik/a;-><init>(Lcom/roblox/client/startup/ActivitySplash;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roblox/client/startup/ActivitySplash;->w2(Z)V

    :cond_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roblox/client/startup/ActivitySplash;->y2(Landroid/content/Intent;)Lcom/roblox/client/startup/StartedForEnum;

    move-result-object v0

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->Q1()Z

    move-result v1

    const-string v2, "rbx.splash"

    if-eqz v1, :cond_1

    const-string v1, "GameActivity = ON. Start new GameActivity..."

    invoke-static {v2, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1}, Lcom/roblox/client/a;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0, v0}, Lcom/roblox/client/startup/MainGameActivity;->i2(Landroid/content/Context;Lcom/roblox/client/startup/StartedForEnum;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_0
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_1
    invoke-static {}, Lcom/roblox/client/startup/ActivitySplash;->r2()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "Process reuse detected."

    invoke-static {v2, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, "process_reuse"

    invoke-static {v1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :cond_2
    const-string v1, "splash_activity_oncreate"

    invoke-static {v1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/roblox/client/a;->onCreate(Landroid/os/Bundle;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->q0()Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "Attach platform emergency observer."

    invoke-static {v2, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lcom/roblox/client/startup/ActivitySplash;->d0:Lam/d;

    if-nez v1, :cond_3

    new-instance v1, Lam/d;

    invoke-direct {v1}, Lam/d;-><init>()V

    iput-object v1, p0, Lcom/roblox/client/startup/ActivitySplash;->d0:Lam/d;

    :cond_3
    sget-object v1, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->INSTANCE:Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;

    iget-object v3, p0, Lcom/roblox/client/startup/ActivitySplash;->d0:Lam/d;

    invoke-virtual {v1, v3}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->attachObserver(Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;)Z

    invoke-virtual {v1, p0}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->setActivity(Landroid/app/Activity;)V

    :cond_4
    invoke-static {p0}, Lxm/a;->c(Landroid/content/Context;)V

    invoke-static {}, Lxm/a;->j()Lxm/a;

    move-result-object v1

    sget-object v3, Lxm/a$a;->a:Lxm/a$a;

    invoke-virtual {v1, v3, p1}, Lxm/a;->a(Lxm/a$a;Landroid/os/Bundle;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/roblox/client/startup/ActivitySplash;->U:J

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    iput-object v1, p0, Lcom/roblox/client/startup/ActivitySplash;->X:Landroid/content/Intent;

    iput-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->a0:Lcom/roblox/client/startup/StartedForEnum;

    invoke-static {}, Lcom/roblox/engine/jni/NativeReportingInterface;->initAppShellReporter()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Started for: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/client/startup/ActivitySplash;->a0:Lcom/roblox/client/startup/StartedForEnum;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->a0:Lcom/roblox/client/startup/StartedForEnum;

    sget-object v1, Lcom/roblox/client/startup/StartedForEnum;->SHELL_PROCESS_RESTART_FOR_RESULT:Lcom/roblox/client/startup/StartedForEnum;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v0, v1, :cond_6

    sget-object v1, Lcom/roblox/client/startup/StartedForEnum;->AFTER_LOGIN_FOR_RESULT:Lcom/roblox/client/startup/StartedForEnum;

    if-ne v0, v1, :cond_5

    goto :goto_0

    :cond_5
    move v1, v3

    goto :goto_1

    :cond_6
    :goto_0
    move v1, v4

    :goto_1
    iput-boolean v1, p0, Lcom/roblox/client/startup/ActivitySplash;->Y:Z

    sget-object v1, Lcom/roblox/client/startup/StartedForEnum;->AFTER_SIGN_UP:Lcom/roblox/client/startup/StartedForEnum;

    if-ne v0, v1, :cond_7

    move v1, v4

    goto :goto_2

    :cond_7
    move v1, v3

    :goto_2
    iput-boolean v1, p0, Lcom/roblox/client/startup/ActivitySplash;->Z:Z

    sget-object v1, Lcom/roblox/client/startup/StartedForEnum;->PROTOCOL_LAUNCH:Lcom/roblox/client/startup/StartedForEnum;

    if-ne v0, v1, :cond_8

    move v1, v4

    goto :goto_3

    :cond_8
    move v1, v3

    :goto_3
    iput-boolean v1, p0, Lcom/roblox/client/startup/ActivitySplash;->b0:Z

    sget-object v1, Lcom/roblox/client/startup/StartedForEnum;->APP_RESTART:Lcom/roblox/client/startup/StartedForEnum;

    if-ne v0, v1, :cond_9

    move v3, v4

    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onCreate: startedForResult="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/client/startup/ActivitySplash;->Y:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", appRestarted="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lik/s2;->b()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/high16 v3, -0x1000000

    invoke-direct {v1, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_4

    :cond_a
    sget v0, Lbh/n0;->e:I

    invoke-virtual {p0, v0}, Lcom/roblox/client/a;->setContentView(I)V

    sget v0, Lbh/m0;->W:I

    invoke-virtual {p0, v0}, Lj/b;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/components/LoadingBar;

    iput-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->S:Lcom/roblox/client/components/LoadingBar;

    :goto_4
    invoke-static {}, Lwh/b;->a()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, Lbh/a1;->G()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_b

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Using "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_b
    invoke-static {}, Lti/a;->h()V

    invoke-virtual {p0}, Lcom/roblox/client/a;->R1()Z

    move-result v0

    iput-boolean v0, p0, Lcom/roblox/client/startup/ActivitySplash;->W:Z

    if-nez p1, :cond_c

    invoke-static {}, Ldj/b;->f()Ldj/b;

    move-result-object p1

    invoke-virtual {p1, p0}, Ldj/b;->c(Landroid/content/Context;)V

    :cond_c
    invoke-static {}, Lwh/b;->a()Z

    move-result p1

    if-eqz p1, :cond_d

    invoke-static {}, Lbh/a1;->x0()Z

    move-result p1

    if-eqz p1, :cond_d

    const-string p1, "Alert: needs restart"

    invoke-static {v2, p1}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/a;->O1()V

    return-void

    :cond_d
    invoke-static {p0}, Lik/k0;->s(Landroid/content/Context;)Lik/k0;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->a0:Lcom/roblox/client/startup/StartedForEnum;

    invoke-virtual {p1, v0}, Lik/k0;->M(Lcom/roblox/client/startup/StartedForEnum;)V

    invoke-static {p0}, Lik/k0;->s(Landroid/content/Context;)Lik/k0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lik/k0;->N(Lik/n0;)V

    return-void
.end method

.method public onDestroy()V
    .locals 3

    invoke-super {p0}, Lcom/roblox/client/a;->onDestroy()V

    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->d0:Lam/d;

    const-string v1, "rbx.splash"

    if-eqz v0, :cond_0

    const-string v0, "Detach platform emergency observer."

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->INSTANCE:Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;

    iget-object v2, p0, Lcom/roblox/client/startup/ActivitySplash;->d0:Lam/d;

    invoke-virtual {v0, v2}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->detachObserver(Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->d0:Lam/d;

    :cond_0
    const-string v0, "onDestroy: unset the activity from InitHelper."

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0}, Lik/k0;->s(Landroid/content/Context;)Lik/k0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lik/k0;->S(Lik/n0;)V

    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/roblox/client/b;->onNewIntent(Landroid/content/Intent;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onNewIntent: intent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.splash"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iput-object p1, p0, Lcom/roblox/client/startup/ActivitySplash;->X:Landroid/content/Intent;

    invoke-virtual {p0, p1}, Lcom/roblox/client/startup/ActivitySplash;->y2(Landroid/content/Intent;)Lcom/roblox/client/startup/StartedForEnum;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/startup/ActivitySplash;->a0:Lcom/roblox/client/startup/StartedForEnum;

    invoke-virtual {p0}, Lcom/roblox/client/startup/ActivitySplash;->x2()V

    return-void
.end method

.method public onPause()V
    .locals 3

    invoke-super {p0}, Lcom/roblox/client/a;->onPause()V

    const-string v0, "splash_activity_onpause"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->S3()Z

    move-result v0

    const-string v1, "rbx.splash"

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ActivitySplash is paused due to finish()"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    const-string v0, "ActivitySplash is paused due to the app being put into the background."

    invoke-static {v1, v0}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "startup_interrupted"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onPause: isFinishing = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/startup/ActivitySplash;->p2()V

    iget-boolean v0, p0, Lcom/roblox/client/startup/ActivitySplash;->c0:Z

    if-nez v0, :cond_2

    invoke-static {}, Lxm/a;->j()Lxm/a;

    move-result-object v0

    sget-object v1, Lxm/a$a;->a:Lxm/a$a;

    invoke-virtual {v0, v1}, Lxm/a;->b(Lxm/a$a;)V

    :cond_2
    return-void
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Lcom/roblox/client/a;->onResume()V

    const-string v0, "rbx.splash"

    const-string v1, "onResume:"

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/roblox/client/startup/ActivitySplash;->q2()V

    invoke-direct {p0}, Lcom/roblox/client/startup/ActivitySplash;->B2()V

    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Lcom/roblox/client/a;->onStart()V

    const/4 v0, 0x1

    sput-boolean v0, Lcom/roblox/client/startup/ActivitySplash;->f0:Z

    invoke-static {}, Lxm/a;->j()Lxm/a;

    move-result-object v0

    invoke-virtual {v0}, Lxm/a;->h()V

    const-string v0, "splash"

    invoke-static {v0}, Lbh/t0;->v(Ljava/lang/String;)V

    return-void
.end method

.method public final p2()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->T:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/roblox/client/startup/ActivitySplash;->V:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->T:Ljava/lang/Runnable;

    :cond_0
    return-void
.end method

.method public final synthetic s2()V
    .locals 2

    const-string v0, "rbx.splash"

    const-string v1, "navigateToMainScreen: launch the Main activity now..."

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roblox/client/startup/ActivitySplash;->w2(Z)V

    return-void
.end method

.method public final synthetic t2()V
    .locals 2

    const-string v0, "rbx.splash"

    const-string v1, "navigateToMainScreen: check for platform emergency..."

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->d0:Lam/d;

    new-instance v1, Lik/b;

    invoke-direct {v1, p0}, Lik/b;-><init>(Lcom/roblox/client/startup/ActivitySplash;)V

    invoke-virtual {v0, v1}, Lam/d;->g(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final synthetic u2()V
    .locals 2

    const-string v0, "rbx.splash"

    const-string v1, "updateViewAppSettingsLoaded: (NEW_STARTUP) launch the Main activity now..."

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roblox/client/startup/ActivitySplash;->c0:Z

    invoke-static {p0}, Lik/k0;->s(Landroid/content/Context;)Lik/k0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lik/k0;->S(Lik/n0;)V

    iget-boolean v0, p0, Lcom/roblox/client/startup/ActivitySplash;->b0:Z

    invoke-virtual {p0, v0}, Lcom/roblox/client/startup/ActivitySplash;->w2(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final synthetic v2()V
    .locals 2

    const-string v0, "rbx.splash"

    const-string v1, "updateViewAppSettingsLoaded: (NEW_STARTUP) check for platform emergency..."

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->d0:Lam/d;

    new-instance v1, Lik/d;

    invoke-direct {v1, p0}, Lik/d;-><init>(Lcom/roblox/client/startup/ActivitySplash;)V

    invoke-virtual {v0, v1}, Lam/d;->g(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final w2(Z)V
    .locals 2

    invoke-virtual {p0}, Lcom/roblox/client/startup/ActivitySplash;->x2()V

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    const-string v1, "rbx.splash"

    if-eqz v0, :cond_0

    const-string p1, "isFinishing"

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const-string v0, "launchMainActivity"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object v0

    invoke-virtual {v0, p0}, Lbh/y;->i(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    if-eqz p1, :cond_1

    const-string p1, "protocolLaunch"

    invoke-static {p0, p1}, Lbh/t0;->b(Landroid/content/Context;Ljava/lang/String;)V

    :cond_1
    iget-boolean p1, p0, Lcom/roblox/client/startup/ActivitySplash;->Z:Z

    if-eqz p1, :cond_2

    const-string p1, "loginAfterSignup"

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_2
    iget-object p1, p0, Lcom/roblox/client/startup/ActivitySplash;->X:Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/roblox/client/startup/ActivitySplash;->X:Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_3
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->c4()Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "main_activity_launch_begin"

    invoke-static {p1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :cond_4
    invoke-static {}, Lxm/a;->j()Lxm/a;

    move-result-object p1

    invoke-virtual {p1}, Lxm/a;->e()V

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Landroid/app/Activity;->overridePendingTransition(II)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final x2()V
    .locals 12

    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->a0:Lcom/roblox/client/startup/StartedForEnum;

    sget-object v1, Lcom/roblox/client/startup/StartedForEnum;->LOADED_FROM_PUSH_NOTIFICATION:Lcom/roblox/client/startup/StartedForEnum;

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->X:Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lrj/r;->k()Lrj/r;

    move-result-object v1

    invoke-virtual {v1, v0}, Lrj/r;->G(Landroid/os/Bundle;)V

    :cond_1
    const-string v1, "EXTRA_NOTIFICATION_TYPE"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v1, "EXTRA_NOTIFICATION_VERSION"

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v1, "EXTRA_NOTIFICATION_ID"

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v1, p0, Lcom/roblox/client/startup/ActivitySplash;->X:Landroid/content/Intent;

    invoke-static {v1}, Lrj/w;->a(Landroid/content/Intent;)Ljava/util/List;

    move-result-object v11

    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "ChatNewMessage"

    if-ne v5, v1, :cond_2

    const-string v1, "EXTRA_CATEGORY"

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lrj/u;->c()Lrj/u;

    move-result-object v1

    invoke-virtual {v1, v0}, Lrj/u;->i(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-static {}, Lrj/u;->c()Lrj/u;

    move-result-object v0

    invoke-virtual {v0, v5}, Lrj/u;->d(Ljava/lang/String;)Lrj/j;

    move-result-object v0

    invoke-interface {v0}, Lrj/j;->clear()V

    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->X:Landroid/content/Intent;

    invoke-static {v0, p0}, Lvj/h;->g(Landroid/content/Intent;Landroid/content/Context;)V

    :cond_3
    :goto_0
    new-instance v0, Lrj/x;

    invoke-direct {v0}, Lrj/x;-><init>()V

    const-string v1, "GcmPlatform"

    invoke-virtual {v0, p0, v1}, Lrj/x;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {p0}, Lok/w;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x1

    const-string v10, "startup"

    const-string v3, "clicked"

    invoke-static/range {v3 .. v11}, Lbh/t0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    iget-object v0, p0, Lcom/roblox/client/startup/ActivitySplash;->X:Landroid/content/Intent;

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lcom/roblox/client/pushnotification/actions/a;->a(Landroid/content/Context;Landroid/content/Intent;Z)V

    return-void
.end method

.method public final y2(Landroid/content/Intent;)Lcom/roblox/client/startup/StartedForEnum;
    .locals 4

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    const-class v1, Lcom/roblox/client/startup/StartedForEnum;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v2, 0x21

    const-string v3, "STARTED_FOR_INTENT_KEY"

    if-lt v0, v2, :cond_0

    :try_start_1
    invoke-virtual {p1, v3, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/startup/StartedForEnum;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-virtual {p1, v3}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/startup/StartedForEnum;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_0
    if-eqz p1, :cond_1

    return-object p1

    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "readStartedForEnum: Exception caught: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rbx.splash"

    invoke-static {v0, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    sget-object p1, Lcom/roblox/client/startup/StartedForEnum;->SYSTEM:Lcom/roblox/client/startup/StartedForEnum;

    return-object p1
.end method

.method public final z2()V
    .locals 3

    invoke-static {}, Ldi/m;->b()Ldi/m;

    move-result-object v0

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->e2()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ldi/m;->d(J)V

    invoke-static {}, Lbh/a1;->e0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldi/m;->c(Ljava/lang/String;)V

    return-void
.end method
