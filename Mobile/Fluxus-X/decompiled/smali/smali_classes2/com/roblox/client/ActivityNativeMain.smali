.class public Lcom/roblox/client/ActivityNativeMain;
.super Lcom/roblox/client/a;
.source "SourceFile"

# interfaces
.implements Ldj/e$e;
.implements Lzh/e;
.implements Lik/n0;
.implements Lfh/b$d;
.implements Lei/a$g;
.implements Lcom/roblox/client/startup/c$b;
.implements Lcom/roblox/engine/jni/NativeGLJavaInterface$OnAppShellReloadNeededListener;
.implements Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;
.implements Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;
.implements Lhk/c;
.implements Lei/a$f;
.implements Lcom/roblox/client/game/ExperienceSession$d;
.implements Lcom/roblox/protocols/webview/a$d;
.implements Lei/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/ActivityNativeMain$l;
    }
.end annotation


# static fields
.field public static q0:Z = true


# instance fields
.field public S:Z

.field public T:Lzh/a;

.field public U:Landroid/view/View;

.field public V:Landroid/view/View;

.field public W:Z

.field public X:J

.field public Y:Ljava/lang/String;

.field public Z:I

.field public a0:Lyi/f;

.field public b0:Lfh/b;

.field public c0:Lcom/roblox/protocols/webview/WebViewProtocol;

.field public d0:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

.field public e0:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public f0:Lei/t0;

.field public g0:Lg/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg/d<",
            "Lg/i;",
            ">;"
        }
    .end annotation
.end field

.field public h0:Z

.field public i0:Llk/i;

.field public j0:Lei/i;

.field public k0:Lei/a1;

.field public l0:Landroid/widget/ImageView;

.field public final m0:Ljava/lang/Runnable;

.field public final n0:Ljava/lang/Runnable;

.field public o0:Lch/a;

.field public final p0:Lmi/m;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/roblox/client/a;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->b0:Lfh/b;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->h0:Z

    new-instance v0, Lbh/j;

    invoke-direct {v0, p0}, Lbh/j;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->m0:Ljava/lang/Runnable;

    new-instance v0, Lbh/k;

    invoke-direct {v0, p0}, Lbh/k;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->n0:Ljava/lang/Runnable;

    new-instance v0, Lcom/roblox/client/ActivityNativeMain$g;

    invoke-direct {v0, p0}, Lcom/roblox/client/ActivityNativeMain$g;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->p0:Lmi/m;

    return-void
.end method

.method private E2()V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/c;->v2(Lj/b;)V

    return-void
.end method

.method private Y2(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p2}, Lok/f;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p2, p1}, Lbh/q;->f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private d3()V
    .locals 4

    const-string v0, "rbx.main"

    const-string v1, "processPushNotification."

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lrj/r;->k()Lrj/r;

    move-result-object v0

    invoke-virtual {v0}, Lrj/r;->i()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {}, Lrj/r;->k()Lrj/r;

    move-result-object v1

    invoke-virtual {v1, v0}, Lrj/r;->t(Landroid/os/Bundle;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    :try_start_0
    const-string v1, "EXTRA_NOTIFICATION_TYPE"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v2, "FriendRequestReceived"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_2

    :sswitch_1
    const-string v2, "DefaultNotification"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, Lbk/a;->a()Lbk/a;

    move-result-object v1

    const-string v2, "EXTRA_NOTIFICATION_LINK_ON_INTERACTION"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lbk/a;->b(Ljava/lang/String;)V

    return-void

    :sswitch_2
    const-string v2, "PrivateMessageReceived"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->S2(Landroid/os/Bundle;)V

    return-void

    :sswitch_3
    const-string v2, "ChatNewMessage"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "EXTRA_CONVERSATION_ID"

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/ActivityNativeMain;->W2(J)V

    return-void

    :sswitch_4
    const-string v2, "FriendRequestAccepted"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_0
    invoke-virtual {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->R2(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_1
    return-void

    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void

    :sswitch_data_0
    .sparse-switch
        0x253fa4b8 -> :sswitch_4
        0x3766c7df -> :sswitch_3
        0x3ea07f25 -> :sswitch_2
        0x664121ac -> :sswitch_1
        0x74fceef2 -> :sswitch_0
    .end sparse-switch
.end method

.method public static g3(Lcom/roblox/client/ActivityNativeMain;Z)V
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->F2()Lzh/a;

    move-result-object v0

    invoke-virtual {v0}, Lzh/a;->d()Lei/a;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lf4/v;->l1()Lf4/k0;

    move-result-object p0

    invoke-virtual {p0}, Lf4/k0;->r()Lf4/t0;

    move-result-object p0

    invoke-virtual {p0, v0}, Lf4/t0;->m(Lf4/q;)Lf4/t0;

    move-result-object p0

    invoke-virtual {p0}, Lf4/t0;->h()I

    :cond_0
    const-string p0, "rbx.appshell"

    const-string p1, "removeGlApp() clearing app shell"

    invoke-static {p0, p1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lei/f;->j()Lei/f;

    move-result-object p0

    invoke-virtual {p0}, Lei/f;->f()V

    return-void
.end method

.method public static synthetic i2(Lcom/roblox/client/ActivityNativeMain;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->K2()V

    return-void
.end method

.method public static synthetic j2(Lcom/roblox/client/ActivityNativeMain;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->M2(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic k2(Lcom/roblox/client/ActivityNativeMain;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->N2(Z)V

    return-void
.end method

.method public static synthetic l2(Lcom/roblox/client/ActivityNativeMain;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->O2()V

    return-void
.end method

.method public static synthetic m2(Landroid/content/Context;)V
    .locals 0

    invoke-static {p0}, Lik/u2;->b(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic n2(Lcom/roblox/client/ActivityNativeMain;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->J2()V

    return-void
.end method

.method public static synthetic o2(Ljava/lang/String;)V
    .locals 1

    invoke-static {p0}, Lcm/a;->b(Ljava/lang/String;)Lcm/a;

    move-result-object p0

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lnk/c;->u(Lcm/a;)V

    return-void
.end method

.method private o3(I)V
    .locals 1

    const-string v0, "retry_during_main"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/roblox/client/startup/c;->y2(Lj/b;I)V

    return-void
.end method

.method public static synthetic p2(Lcom/roblox/client/ActivityNativeMain;Lg/a;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->P2(Lg/a;)V

    return-void
.end method

.method public static synthetic q2(Lcom/roblox/client/ActivityNativeMain;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->L2()V

    return-void
.end method

.method public static synthetic r2(Lcom/roblox/client/ActivityNativeMain;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->I2(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static bridge synthetic s2(Lcom/roblox/client/ActivityNativeMain;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/ActivityNativeMain;->U:Landroid/view/View;

    return-object p0
.end method

.method public static bridge synthetic t2(Lcom/roblox/client/ActivityNativeMain;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    return-object p0
.end method

.method public static bridge synthetic u2(Lcom/roblox/client/ActivityNativeMain;)Lcom/roblox/protocols/webview/WebViewProtocol;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/protocols/webview/WebViewProtocol;

    return-object p0
.end method

.method public static bridge synthetic v2(Lcom/roblox/client/ActivityNativeMain;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/ActivityNativeMain;->l0:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static bridge synthetic w2(Lcom/roblox/client/ActivityNativeMain;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->A2(Z)V

    return-void
.end method

.method public static bridge synthetic x2(Lcom/roblox/client/ActivityNativeMain;)Lzh/a;
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->F2()Lzh/a;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic y2(Lcom/roblox/client/ActivityNativeMain;J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/ActivityNativeMain;->i3(J)V

    return-void
.end method


# virtual methods
.method public final A2(Z)V
    .locals 6

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->g5()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->M(Landroid/content/Context;Z)V

    return-void

    :cond_0
    invoke-static {}, Lok/t;->g()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_5

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    invoke-virtual {v0}, Lnk/c;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v3

    invoke-virtual {v3}, Lnk/c;->j()J

    move-result-wide v3

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_8

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v5

    invoke-interface {v5}, Lbi/i;->L1()Z

    move-result v5

    if-eqz v5, :cond_2

    cmp-long v0, v3, v1

    if-lez v0, :cond_1

    invoke-static {p0}, Lnj/a0;->R(Landroid/content/Context;)Lnj/a0;

    move-result-object v0

    invoke-virtual {v0, v3, v4, p1}, Lnj/a0;->K(JZ)V

    return-void

    :cond_1
    invoke-static {p0}, Lnj/a0;->R(Landroid/content/Context;)Lnj/a0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lnj/a0;->L(Z)V

    return-void

    :cond_2
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v5

    invoke-interface {v5}, Lbi/i;->t3()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v5

    invoke-interface {v5}, Lbi/i;->q()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static {p0}, Lnj/m;->F0(Landroid/content/Context;)Lnj/m;

    move-result-object v1

    invoke-virtual {v1, v3, v4, v0, p1}, Lnj/m;->m1(JLjava/lang/String;Z)V

    return-void

    :cond_3
    cmp-long v1, v3, v1

    if-lez v1, :cond_4

    invoke-static {p0}, Lnj/m;->F0(Landroid/content/Context;)Lnj/m;

    move-result-object v1

    invoke-virtual {v1, v3, v4, v0, p1}, Lnj/m;->A0(JLjava/lang/String;Z)V

    return-void

    :cond_4
    invoke-static {p0}, Lnj/m;->F0(Landroid/content/Context;)Lnj/m;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lnj/m;->B0(Ljava/lang/String;Z)V

    return-void

    :cond_5
    invoke-static {}, Lok/t;->i()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object p1

    invoke-virtual {p1}, Lnk/c;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lnk/c;->j()J

    move-result-wide v3

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_8

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->L5()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_7

    cmp-long p1, v3, v1

    if-lez p1, :cond_6

    invoke-static {p0}, Lqj/a;->a(Landroid/content/Context;)Lqj/a;

    throw v0

    :cond_6
    invoke-static {p0}, Lqj/a;->a(Landroid/content/Context;)Lqj/a;

    throw v0

    :cond_7
    invoke-static {p0}, Lqj/b;->a(Landroid/content/Context;)Lqj/b;

    throw v0

    :cond_8
    return-void
.end method

.method public final B2()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->U:Landroid/view/View;

    new-instance v1, Lcom/roblox/client/ActivityNativeMain$i;

    invoke-direct {v1, p0}, Lcom/roblox/client/ActivityNativeMain$i;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final C2()V
    .locals 5

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->U:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v2, Lcom/roblox/client/ActivityNativeMain$d;

    invoke-direct {v2, p0, v1}, Lcom/roblox/client/ActivityNativeMain$d;-><init>(Lcom/roblox/client/ActivityNativeMain;Landroid/view/ViewGroup;)V

    invoke-virtual {v0, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    sget v0, Lbh/m0;->F:I

    iput v0, p0, Lcom/roblox/client/ActivityNativeMain;->Z:I

    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    sget v2, Lbh/m0;->F:I

    invoke-virtual {v0, v2}, Landroid/view/View;->setId(I)V

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->O0()Z

    move-result v2

    if-eqz v2, :cond_0

    sget v2, Lbh/n0;->k:I

    goto :goto_0

    :cond_0
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->J4()Z

    move-result v2

    if-eqz v2, :cond_1

    sget v2, Lbh/n0;->l:I

    goto :goto_0

    :cond_1
    sget v2, Lbh/n0;->j:I

    :goto_0
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v3

    invoke-interface {v3}, Lbi/i;->r2()Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, "fragment_shared_inflate_begin"

    invoke-static {v3}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v3, v2, v0, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->r2()Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "fragment_shared_inflate_end"

    invoke-static {v2}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :cond_3
    new-instance v2, Lei/t0;

    sget v3, Lbh/m0;->k0:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/SurfaceView;

    invoke-direct {v2, p0, v3}, Lei/t0;-><init>(Lcom/roblox/client/a;Landroid/view/SurfaceView;)V

    iput-object v2, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lei/t0;

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object v2

    iget-object v3, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lei/t0;

    invoke-virtual {v2, v3}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    sget-object v2, Luk/h;->a:Luk/h;

    invoke-virtual {p0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    invoke-virtual {v2, v3}, Luk/h;->c(Landroid/content/res/Configuration;)V

    const-string v2, "rbx.main"

    const-string v3, "createGlAppsFrame() apps frame created"

    invoke-static {v2, v3}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->l3()Z

    move-result v0

    if-eqz v0, :cond_4

    sget v0, Lbh/m0;->k0:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v2

    new-instance v3, Lcom/roblox/client/ActivityNativeMain$e;

    invoke-direct {v3, p0, v1, v0}, Lcom/roblox/client/ActivityNativeMain$e;-><init>(Lcom/roblox/client/ActivityNativeMain;Landroid/view/ViewGroup;Landroid/view/SurfaceView;)V

    invoke-interface {v2, v3}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    :cond_4
    return-void
.end method

.method public final D2()V
    .locals 3

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->l0:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->U:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    new-instance v1, Landroid/widget/ImageView;

    invoke-direct {v1, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->l0:Landroid/widget/ImageView;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->l0:Landroid/widget/ImageView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->l0:Landroid/widget/ImageView;

    new-instance v2, Lcom/roblox/client/ActivityNativeMain$f;

    invoke-direct {v2, p0}, Lcom/roblox/client/ActivityNativeMain$f;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->l0:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->n0:Ljava/lang/Runnable;

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeScheduleOnFirstFrame(Ljava/lang/Runnable;)V

    return-void
.end method

.method public E()V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/b;->E1()V

    return-void
.end method

.method public F()V
    .locals 2

    const-string v0, "rbx.main"

    const-string v1, "updateViewAppSettingsLoaded:"

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->k3()V

    return-void
.end method

.method public final F2()Lzh/a;
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->T:Lzh/a;

    if-nez v0, :cond_0

    new-instance v0, Lzh/a;

    iget v1, p0, Lcom/roblox/client/ActivityNativeMain;->Z:I

    invoke-direct {v0, p0, v1}, Lzh/a;-><init>(Lzh/e;I)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->T:Lzh/a;

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->T:Lzh/a;

    return-object v0
.end method

.method public final G2()Lyh/g;
    .locals 2

    const-string v0, "CUSTOM_WEBVIEW_TAG"

    invoke-static {v0}, Lyh/g;->b(Ljava/lang/String;)Lyh/g;

    move-result-object v0

    invoke-static {p0}, Lbh/a1;->Q(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyh/g;->g(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lyh/g;->j(Z)V

    return-object v0
.end method

.method public H()V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/b;->E1()V

    return-void
.end method

.method public final H2()V
    .locals 3

    const-string v0, "internalOnResume:"

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->A2(Z)V

    invoke-static {}, Lcom/roblox/client/d;->e()Lcom/roblox/client/d;

    move-result-object v0

    new-instance v2, Lcom/roblox/client/ActivityNativeMain$h;

    invoke-direct {v2, p0}, Lcom/roblox/client/ActivityNativeMain$h;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, v2}, Lcom/roblox/client/d;->b(Lcom/roblox/client/d$d;)V

    invoke-static {}, Lok/t;->j()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object v0

    invoke-virtual {v0}, Ldj/h;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-static {p0}, Lbh/e2;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object v0

    iget-object v2, p0, Lcom/roblox/client/ActivityNativeMain;->p0:Lmi/m;

    invoke-virtual {v0, v2}, Ldj/h;->d(Lmi/m;)V

    :cond_1
    const-string v0, "internalOnResume: NotificationManager addObserver"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Ldj/e;->c()Ldj/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Ldj/e;->b(Ldj/e$e;)V

    invoke-static {}, Lrj/r;->k()Lrj/r;

    move-result-object v0

    invoke-virtual {v0}, Lrj/r;->u()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p0}, Lbh/e2;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    :cond_2
    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->d3()V

    :cond_3
    iget-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    if-eqz v0, :cond_4

    const-string v0, "Back from game. Resuming Lua App."

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->a3()V

    :cond_4
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->F2()Lzh/a;

    move-result-object v0

    invoke-virtual {p0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v1

    invoke-virtual {v1}, Lf4/k0;->j0()Z

    invoke-virtual {v0}, Lzh/a;->d()Lei/a;

    move-result-object v1

    if-nez v1, :cond_5

    new-instance v1, Lzh/c;

    const-string v2, "CUSTOM_LUAVIEW_TAG"

    invoke-direct {v1, v2}, Lzh/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lzh/a;->g(Lzh/c;)V

    :cond_5
    return-void
.end method

.method public I()V
    .locals 2

    const-string v0, "rbx.main"

    const-string v1, "showRetryUI:"

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lbh/a1;->q0()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lbh/q0;->S:I

    invoke-static {p0, v0}, Lok/x;->a(Landroid/app/Activity;I)V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->finish()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/b;->J1()Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lbh/q0;->S:I

    invoke-direct {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->o3(I)V

    :cond_1
    return-void
.end method

.method public final synthetic I2(Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p1, p0}, Lbh/q;->b(Lorg/json/JSONObject;Landroid/app/Activity;)V

    return-void
.end method

.method public final synthetic J2()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->l0:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->l0:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public final synthetic K2()V
    .locals 2

    const-wide/16 v0, 0x1f4

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/ActivityNativeMain;->i3(J)V

    return-void
.end method

.method public final synthetic L2()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public M()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->E2()V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->q3()V

    return-void
.end method

.method public final synthetic M2(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lbh/e;

    invoke-direct {v0, p1}, Lbh/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public N()V
    .locals 3

    const-string v0, "rbx.main"

    const-string v1, "navigateToLandingScreen:"

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object v0

    invoke-virtual {v0, p0}, Lbh/y;->o(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "send_app_input_focus_to_lua"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->finish()V

    return-void
.end method

.method public final synthetic N2(Z)V
    .locals 1

    sget-object v0, Lxi/c;->a:Lxi/c;

    invoke-virtual {v0, p1}, Lxi/c;->j(Z)V

    sget-object v0, Lxi/b;->a:Lxi/b;

    invoke-virtual {v0, p0, p1}, Lxi/b;->b(Landroid/app/Activity;Z)V

    return-void
.end method

.method public final synthetic O2()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->k0()V

    return-void
.end method

.method public P1()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final synthetic P2(Lg/a;)V
    .locals 1

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object v0

    invoke-virtual {v0}, Lbh/y;->g()Lwm/f;

    move-result-object v0

    invoke-virtual {p1}, Lg/a;->a()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lwm/f;->r(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method public Q1()Lui/c;
    .locals 1

    new-instance v0, Lui/d;

    invoke-direct {v0}, Lui/d;-><init>()V

    return-object v0
.end method

.method public final Q2(Lzh/c;)V
    .locals 2

    const-string v0, "rbx.appshell"

    const-string v1, "loadDataModel()"

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lei/f;->j()Lei/f;

    move-result-object v0

    invoke-virtual {v0, p0}, Lei/f;->F(Landroid/content/Context;)V

    invoke-static {p0}, Lei/p;->a(Landroid/content/Context;)Lei/f$d;

    move-result-object v0

    invoke-static {}, Lei/f;->j()Lei/f;

    move-result-object v1

    invoke-virtual {v1, v0}, Lei/f;->k(Lei/f$d;)V

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->isColdStartDeeplinkToGame()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ldj/h;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lqm/a;->a()Lqm/a;

    move-result-object v0

    new-instance v1, Lbh/h;

    invoke-direct {v1, p0}, Lbh/h;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, v1}, Lqm/a;->b(Lqm/a$b;)V

    invoke-static {}, Ldj/h;->l()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lik/k0;->G(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_0
    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object v0

    invoke-virtual {v0}, Lbh/y;->f()Lcom/roblox/client/game/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/game/c;->i()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->m3(Lzh/c;)V

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeStartLuaAppDM()V

    :cond_1
    return-void
.end method

.method public R(ILandroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/16 v0, 0x65

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    const-string p1, "game_init_params"

    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    invoke-static {p1}, Lei/k0;->c(Landroid/os/Bundle;)Lei/k0;

    move-result-object p1

    invoke-static {p1, p0}, Lbh/q;->j(Lei/k0;Landroid/app/Activity;)V

    return-void

    :cond_1
    const-string p1, "rbx.main"

    const-string v0, "ANM.handleNotification() Logout event..."

    invoke-static {p1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2UserDidLogout()V

    invoke-static {}, Lek/c;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lcom/roblox/client/ActivityNativeMain$l;

    invoke-direct {p1, p0}, Lcom/roblox/client/ActivityNativeMain$l;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    sget-object p2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {p1, p2, v0}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void

    :cond_2
    invoke-static {p2}, Ldj/b;->g(Landroid/os/Bundle;)Ldj/b$d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/roblox/client/a;->X1(Ldj/b$d;)V

    return-void
.end method

.method public final R2(Landroid/os/Bundle;)V
    .locals 8

    const-string v0, "EXTRA_NOTIFICATION_USER_ID"

    const-wide/16 v1, -0x1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    const-string v0, "EXTRA_NOTIFICATION_TYPE"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v5, "EXTRA_STACKED_NOTIFICATION"

    const/4 v6, 0x0

    invoke-virtual {p1, v5, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    const/4 v5, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->finish()V

    goto :goto_0

    :cond_0
    const-string v6, "FriendRequestReceived"

    const-string v7, "FriendRequestAccepted"

    if-nez p1, :cond_5

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    cmp-long p1, v3, v1

    if-nez p1, :cond_2

    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object p1

    invoke-virtual {p1}, Ldj/h;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Lbh/a1;->a0(J)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_2
    invoke-static {v3, v4}, Lbh/a1;->c0(J)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_3
    cmp-long p1, v3, v1

    if-nez p1, :cond_4

    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object p1

    invoke-virtual {p1}, Ldj/h;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Lbh/a1;->b0(J)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_4
    invoke-static {v3, v4}, Lbh/a1;->c0(J)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_5
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object p1

    invoke-virtual {p1}, Ldj/h;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Lbh/a1;->a0(J)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_7
    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object p1

    invoke-virtual {p1}, Ldj/h;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Lbh/a1;->b0(J)Ljava/lang/String;

    move-result-object v5

    :goto_0
    invoke-virtual {p0, v5}, Lcom/roblox/client/ActivityNativeMain;->p3(Ljava/lang/String;)V

    return-void
.end method

.method public S()V
    .locals 1

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lok/c;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->setMobileAdvertisingId(Ljava/lang/String;)V

    return-void
.end method

.method public final S2(Landroid/os/Bundle;)V
    .locals 5

    const-string v0, "EXTRA_CONVERSATION_ID"

    const-wide/16 v1, -0x1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    cmp-long p1, v3, v1

    if-nez p1, :cond_0

    invoke-static {}, Lbh/a1;->w0()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {v3, v4}, Lbh/a1;->A0(J)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->p3(Ljava/lang/String;)V

    return-void
.end method

.method public final T2()Z
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "loginAfterSignup"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    return v0

    :cond_0
    return v1
.end method

.method public final U2(Landroid/content/Intent;)V
    .locals 9

    if-eqz p1, :cond_4

    const-string v0, "FEATURE_EXTRA"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v1, "CHAT_TAG"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "USER_ID_EXTRA"

    const-wide/16 v1, -0x1

    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-eqz v0, :cond_0

    invoke-virtual {p0, v3, v4}, Lcom/roblox/client/ActivityNativeMain;->Z2(J)V

    return-void

    :cond_0
    const-string v0, "CONVERSATION_ID_EXTRA"

    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/ActivityNativeMain;->W2(J)V

    return-void

    :cond_1
    const-string v1, "PROFILE_TAG"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "PATH_EXTRA"

    if-eqz v1, :cond_2

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget p1, Lbh/q0;->I:I

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v6, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, Lbh/q;->i(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    return-void

    :cond_2
    move-object v3, p0

    const-string v1, "SETTINGS_TAG"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget v0, Lbh/q0;->L:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lbh/q;->f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0}, Lzh/b;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lbh/q;->f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_4
    move-object v3, p0

    return-void
.end method

.method public final V2()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OVERLAY_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v1

    invoke-virtual {v1}, Lf4/k0;->u0()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final W2(J)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "navigateToConversation() conversation:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lzh/c;

    const-string v1, "CHAT_TAG"

    invoke-direct {v0, v1}, Lzh/c;-><init>(Ljava/lang/String;)V

    const-string v1, "CHAT_CONVERSATION_ID"

    invoke-virtual {v0, v1, p1, p2}, Lzh/c;->g(Ljava/lang/String;J)V

    invoke-virtual {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->X2(Lzh/c;)V

    return-void
.end method

.method public final X2(Lzh/c;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "navigateToFeature:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lzh/c;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " bundle:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lzh/c;->a()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lok/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->m3(Lzh/c;)V

    return-void
.end method

.method public Z()V
    .locals 3

    const-string v0, "rbx.main"

    const-string v1, "onAppStarted: "

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/b;->J1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ldj/b;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/roblox/client/ActivityNativeMain$l;

    invoke-direct {v0, p0}, Lcom/roblox/client/ActivityNativeMain$l;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    invoke-virtual {v0, v1, v2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_0
    return-void
.end method

.method public final Z2(J)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "navigateToUserConversation() user:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lzh/c;

    const-string v1, "CHAT_TAG"

    invoke-direct {v0, v1}, Lzh/c;-><init>(Ljava/lang/String;)V

    const-string v1, "USER_ID_EXTRA"

    invoke-virtual {v0, v1, p1, p2}, Lzh/c;->g(Ljava/lang/String;J)V

    invoke-virtual {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->X2(Lzh/c;)V

    return-void
.end method

.method public final a3()V
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->n3()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lei/t0;

    invoke-virtual {v0}, Lei/t0;->b()Z

    move-result v0

    return v0
.end method

.method public b3(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1, p2}, Lhk/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onAppReady: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    new-instance v1, Lcom/roblox/client/ActivityNativeMain$j;

    invoke-direct {v1, p0}, Lcom/roblox/client/ActivityNativeMain$j;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    const-string v0, "Landing"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "Home"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "Push"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object p1

    invoke-virtual {p1}, Lbh/y;->k()Lbn/k;

    move-result-object p1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lbn/k;->Q(Landroid/content/Context;)V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static {}, Lcom/roblox/client/d;->e()Lcom/roblox/client/d;

    move-result-object p1

    new-instance v0, Lcom/roblox/client/ActivityNativeMain$k;

    invoke-direct {v0, p0}, Lcom/roblox/client/ActivityNativeMain$k;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {p1, v0}, Lcom/roblox/client/d;->b(Lcom/roblox/client/d$d;)V

    :cond_3
    :goto_1
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->m2()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-instance v1, Lbh/f;

    invoke-direct {v1, p1}, Lbh/f;-><init>(Landroid/content/Context;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_4
    return-void
.end method

.method public final c3(Ljava/lang/String;)V
    .locals 4

    const-string v0, "rbx.main"

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "openFunCaptchaActivity: Exception parsing json data."

    invoke-static {v0, p1}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_4

    const-string p1, "captchaType"

    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "login"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "cvalueType"

    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "cvalue"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v3, -0x1

    sparse-switch v2, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v2, "email"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v3, 0x2

    goto :goto_1

    :sswitch_1
    const-string v2, "username"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x1

    goto :goto_1

    :sswitch_2
    const-string v2, "phone_number"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    packed-switch v3, :pswitch_data_0

    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported credential Type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object p1, Llh/b$c;->b:Llh/b$c;

    goto :goto_2

    :pswitch_1
    sget-object p1, Llh/b$c;->a:Llh/b$c;

    goto :goto_2

    :pswitch_2
    sget-object p1, Llh/b$c;->c:Llh/b$c;

    :goto_2
    new-instance v2, Llh/b;

    invoke-direct {v2, p1, v1}, Llh/b;-><init>(Llh/b$c;Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    new-instance v2, Llh/d;

    invoke-direct {v2}, Llh/d;-><init>()V

    :goto_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "openFunCaptchaActivity: config = "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, v2}, Lcom/roblox/client/captcha/ActivityFunCaptcha;->i2(Landroid/content/Context;Llh/a;)Landroid/content/Intent;

    move-result-object p1

    const/16 v0, 0x4e93

    invoke-virtual {p0, p1, v0}, Le/p;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_4
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x247fbcc6 -> :sswitch_2
        -0xfd6772a -> :sswitch_1
        0x5c24b9c -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d(Lbm/a;)V
    .locals 9

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->B2()V

    iget-object v0, p1, Lbm/a;->d:Ljava/lang/Boolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v3, p1, Lbm/a;->c:Ljava/lang/Boolean;

    if-nez v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :goto_1
    iget-object v4, p1, Lbm/a;->e:Ljava/lang/Boolean;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v2

    goto :goto_2

    :cond_2
    move v4, v1

    :goto_2
    iget-object v5, p1, Lbm/a;->f:Ljava/lang/Boolean;

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v2

    goto :goto_3

    :cond_3
    move v5, v1

    :goto_3
    iget-object v6, p1, Lbm/a;->g:Ljava/lang/Boolean;

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_4

    move v1, v2

    :cond_4
    if-eqz v0, :cond_5

    new-instance v0, Lbh/y0;

    invoke-direct {v0}, Lbh/y0;-><init>()V

    goto :goto_4

    :cond_5
    new-instance v0, Ldi/k;

    invoke-direct {v0}, Ldi/k;-><init>()V

    :goto_4
    invoke-virtual {v0}, Lf4/q;->a()Landroidx/lifecycle/l;

    move-result-object v6

    new-instance v7, Lfh/a;

    invoke-direct {v7}, Lfh/a;-><init>()V

    invoke-virtual {v6, v7}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    const-string v7, "DEFAULT_URL"

    iget-object v8, p1, Lbm/a;->a:Ljava/lang/String;

    invoke-virtual {v6, v7, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "USE_APP_HYBRID"

    invoke-virtual {v6, v7, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v7, "VISIBLE"

    invoke-virtual {v6, v7, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v3, "BACK_NAVIGATION_DISABLED"

    invoke-virtual {v6, v3, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v3, "TITLE_STRING"

    iget-object p1, p1, Lbm/a;->b:Ljava/lang/String;

    invoke-virtual {v6, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "HAS_PARENT"

    invoke-virtual {v6, p1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p1, "HIDE_ACCESSORY_BUTTONS"

    invoke-virtual {v6, p1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p1, "SHOW_DOMAIN_AS_TITLE"

    invoke-virtual {v6, p1, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p1, "hideNativeHeader"

    invoke-virtual {v6, p1, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-virtual {v0, v6}, Lf4/q;->O1(Landroid/os/Bundle;)V

    new-instance p1, Lcom/roblox/client/ActivityNativeMain$a;

    invoke-direct {p1, p0}, Lcom/roblox/client/ActivityNativeMain$a;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, p1}, Lcom/roblox/client/c;->B3(Lcom/roblox/client/c$i;)V

    invoke-virtual {p0}, Lf4/v;->l1()Lf4/k0;

    move-result-object p1

    invoke-virtual {p1}, Lf4/k0;->r()Lf4/t0;

    move-result-object p1

    sget v1, Lbh/m0;->j:I

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->V2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v0, v2}, Lf4/t0;->b(ILf4/q;Ljava/lang/String;)Lf4/t0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lf4/t0;->f(Ljava/lang/String;)Lf4/t0;

    invoke-virtual {p1}, Lf4/t0;->h()I

    return-void
.end method

.method public e()V
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->h3()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/protocols/webview/WebViewProtocol;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roblox/protocols/webview/WebViewProtocol;->t()V

    :cond_0
    return-void
.end method

.method public e3()V
    .locals 2

    new-instance v0, Lcom/roblox/client/startup/d;

    invoke-direct {v0}, Lcom/roblox/client/startup/d;-><init>()V

    new-instance v1, Lbh/l;

    invoke-direct {v1, p0}, Lbh/l;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, p0, v1}, Lcom/roblox/client/startup/d;->c(Landroid/content/Context;Lcom/roblox/client/startup/d$a;)V

    return-void
.end method

.method public f(Z)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lei/t0;

    invoke-virtual {v0, p1}, Lei/t0;->f(Z)V

    return-void
.end method

.method public f3()V
    .locals 2

    const-string v0, "rbx.main"

    const-string v1, "Registering activity result for IdentityProtocol."

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lh/j;

    invoke-direct {v0}, Lh/j;-><init>()V

    new-instance v1, Lbh/d;

    invoke-direct {v1, p0}, Lbh/d;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {p0, v0, v1}, Le/p;->h(Lh/a;Lg/b;)Lg/d;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->g0:Lg/d;

    return-void
.end method

.method public finish()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->finish()V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->S2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lbh/a1;->q0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    :cond_0
    return-void
.end method

.method public g(Lbm/a;)V
    .locals 2

    invoke-virtual {p0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v0

    invoke-virtual {v0}, Lf4/k0;->u0()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v0

    sget v1, Lbh/m0;->j:I

    invoke-virtual {v0, v1}, Lf4/k0;->m0(I)Lf4/q;

    move-result-object v0

    instance-of v1, v0, Lcom/roblox/client/c;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/roblox/client/c;

    invoke-virtual {v0, p1}, Lcom/roblox/client/c;->H3(Lbm/a;)V

    :cond_0
    return-void
.end method

.method public final h3()Z
    .locals 3

    invoke-virtual {p0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v0

    invoke-virtual {v0}, Lf4/k0;->U0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v0

    invoke-virtual {v0}, Lf4/k0;->u0()I

    move-result v0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v2

    invoke-virtual {v2}, Lf4/k0;->a1()V

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public i()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->E2()V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->q3()V

    return-void
.end method

.method public i0()V
    .locals 0

    return-void
.end method

.method public final i3(J)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->l0:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->m0:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->l0:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->m0:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, p1, p2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public j3(Z)V
    .locals 2

    new-instance v0, Lwk/a;

    invoke-direct {v0, p1}, Lwk/a;-><init>(Z)V

    iget-object p1, v0, Lwk/c;->a:Ljava/lang/String;

    iget-object v1, v0, Lwk/c;->b:Ljava/lang/String;

    iget-object v0, v0, Lwk/c;->c:Ljava/lang/String;

    invoke-static {p1, v1, v0}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeBroadcastEventWithNamespace(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 3

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "rbx.main"

    if-eqz v0, :cond_0

    const-string p1, "Share data is empty"

    invoke-static {v1, p1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "url"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "context"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    invoke-static {v0, p1}, Lhk/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SEND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "text/plain"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.extra.TEXT"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/ShareAppChosenReceiver;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0xa000000

    const/4 v2, 0x0

    invoke-static {p0, v2, p1, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    invoke-virtual {p0, v2}, Lcom/roblox/client/ActivityNativeMain;->j3(Z)V

    const/4 v1, 0x0

    invoke-virtual {p1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object p1

    invoke-static {v0, v1, p1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;Landroid/content/IntentSender;)Landroid/content/Intent;

    move-result-object p1

    const/16 v0, 0x4e9c

    invoke-virtual {p0, p1, v0}, Le/p;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    :catch_0
    const-string p1, "Error parsing share data."

    invoke-static {v1, p1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public k0()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "navigateToMainScreen: IsLoggedIn = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object v1

    invoke-virtual {v1}, Ldj/h;->f()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->k3()V

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object v0

    invoke-virtual {v0}, Lbh/y;->f()Lcom/roblox/client/game/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/game/c;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/b;->J1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object v0

    invoke-virtual {v0}, Ldj/h;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->H2()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final k3()V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setupMainTabs: tabs-loaded = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/client/ActivityNativeMain;->S:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->S:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->S:Z

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->T2()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lok/t;->j()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lzh/c;

    const-string v1, "GAMES_TAG"

    invoke-direct {v0, v1}, Lzh/c;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lzh/c;

    const-string v1, "CUSTOM_LUAVIEW_TAG"

    invoke-direct {v0, v1}, Lzh/c;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->Q2(Lzh/c;)V

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->b0:Lfh/b;

    if-nez v0, :cond_2

    new-instance v0, Lfh/b;

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v0, p0, v1}, Lfh/b;-><init>(Lfh/b$d;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->b0:Lfh/b;

    invoke-virtual {v0}, Lfh/b;->c()V

    :cond_2
    invoke-static {}, Lbh/a1;->q0()Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-direct {v0, p0}, Lcom/roblox/protocols/webview/WebViewProtocol;-><init>(Lcom/roblox/protocols/webview/a$d;)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/protocols/webview/WebViewProtocol;

    :cond_3
    :goto_1
    return-void
.end method

.method public l()V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lei/t0;

    invoke-virtual {v0}, Lei/t0;->l()V

    return-void
.end method

.method public final l3()Z
    .locals 1

    invoke-static {}, Lbh/a1;->q0()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public m(Landroid/os/Bundle;)V
    .locals 4

    const-string v0, "Request to end the game. Performing app restoration."

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->n0()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "placeId"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/roblox/client/ActivityNativeMain;->X:J

    const-string v0, "gameId"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->Y:Ljava/lang/String;

    :cond_0
    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object p1

    invoke-virtual {p1}, Lbh/y;->f()Lcom/roblox/client/game/c;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/roblox/client/game/c;->l(Landroid/content/Context;)V

    sget-object p1, Lei/u0;->b:Lei/u0;

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->r3(Lei/u0;)V

    invoke-virtual {p0}, Lf4/v;->l1()Lf4/k0;

    move-result-object p1

    invoke-virtual {p0}, Lcom/roblox/client/b;->J1()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lf4/k0;->U0()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-static {p0}, Lbh/a1;->U(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "ROBLOXCrash"

    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-static {}, Lei/f;->j()Lei/f;

    move-result-object p1

    invoke-virtual {p1}, Lei/f;->z()V

    invoke-static {}, Lei/f;->j()Lei/f;

    move-result-object p1

    invoke-virtual {p1, v2}, Lei/f;->B(Z)V

    new-instance p1, Lbh/g;

    invoke-direct {p1, p0}, Lbh/g;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :cond_1
    const-string p1, "Experience has been ended in the background."

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iput-boolean v2, p0, Lcom/roblox/client/ActivityNativeMain;->h0:Z

    return-void
.end method

.method public m3(Lzh/c;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ANM.showFeature: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lzh/c;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->F2()Lzh/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lzh/a;->g(Lzh/c;)V

    return-void
.end method

.method public n()V
    .locals 1

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/roblox/client/ActivityNativeMain$b;

    invoke-direct {v0, p0, p0}, Lcom/roblox/client/ActivityNativeMain$b;-><init>(Lcom/roblox/client/ActivityNativeMain;Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public n0()V
    .locals 1

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->m2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lik/u2;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->setWebviewUserAgent(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {p0}, Landroid/webkit/WebSettings;->getDefaultUserAgent(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->setWebviewUserAgent(Ljava/lang/String;)V

    return-void
.end method

.method public final n3()V
    .locals 4

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->m3()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->n2()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lmh/b;->b()Lmh/b;

    move-result-object v0

    invoke-virtual {v0}, Lmh/b;->c()I

    move-result v0

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->t()I

    move-result v1

    if-lt v0, v1, :cond_1

    invoke-static {}, Lgh/a;->e()Lgh/a;

    move-result-object v0

    iget-wide v1, p0, Lcom/roblox/client/ActivityNativeMain;->X:J

    iget-object v3, p0, Lcom/roblox/client/ActivityNativeMain;->Y:Ljava/lang/String;

    invoke-virtual {v0, p0, v1, v2, v3}, Lgh/a;->i(Landroid/app/Activity;JLjava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public o0()Lf4/v;
    .locals 0

    return-object p0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onActivityResult: requestCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " resultCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " Intent data = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_5

    const/16 v2, 0x4e88

    const/4 v3, 0x1

    if-eq p1, v2, :cond_4

    const/16 v2, 0x4e8e

    if-eq p1, v2, :cond_3

    const/16 v0, 0x4e93

    if-eq p1, v0, :cond_1

    const/16 v0, 0x4e9c

    if-eq p1, v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Lcom/roblox/client/a;->onActivityResult(IILandroid/content/Intent;)V

    return-void

    :cond_0
    invoke-static {}, Lhk/a;->a()V

    invoke-virtual {p0, v3}, Lcom/roblox/client/ActivityNativeMain;->j3(Z)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->h3()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, Lsm/a;->k()Lsm/a;

    move-result-object p1

    invoke-virtual {p1, p3}, Lsm/a;->e(Landroid/content/Intent;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "onActivityResult from FunCaptcha: code:"

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ", result:"

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p3, 0x65

    if-ne p2, p3, :cond_2

    const-string p2, "success"

    goto :goto_0

    :cond_2
    const-string p2, "dismiss"

    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lei/f;->j()Lei/f;

    move-result-object p1

    new-instance p2, Lwk/a;

    invoke-direct {p2, v3}, Lwk/a;-><init>(Z)V

    invoke-virtual {p1, p2}, Lei/f;->A(Lwk/c;)V

    new-instance p1, Lzh/c;

    const-string p2, "HOME_TAG"

    invoke-direct {p1, p2}, Lzh/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->m3(Lzh/c;)V

    return-void

    :cond_3
    if-ne p2, v0, :cond_5

    invoke-virtual {p0, p3}, Lcom/roblox/client/ActivityNativeMain;->U2(Landroid/content/Intent;)V

    return-void

    :cond_4
    iput-boolean v3, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    :cond_5
    return-void
.end method

.method public onBackButtonNotConsumedEvent(Lyh/c;)V
    .locals 0
    .annotation runtime Lmw/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->e3()V

    return-void
.end method

.method public onBackPressed()V
    .locals 2

    invoke-virtual {p0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v0

    invoke-virtual {v0}, Lf4/k0;->u0()I

    move-result v0

    if-lez v0, :cond_5

    invoke-virtual {p0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v0

    sget v1, Lbh/m0;->j:I

    invoke-virtual {v0, v1}, Lf4/k0;->m0(I)Lf4/q;

    move-result-object v0

    instance-of v1, v0, Lcom/roblox/client/c;

    if-eqz v1, :cond_2

    check-cast v0, Lcom/roblox/client/c;

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/protocols/webview/WebViewProtocol;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/roblox/client/c;->h3()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/roblox/client/c;->e3()Z

    move-result v0

    if-nez v0, :cond_6

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-virtual {v0}, Lcom/roblox/protocols/webview/WebViewProtocol;->t()V

    return-void

    :cond_1
    invoke-virtual {v0}, Lcom/roblox/client/c;->h3()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v0}, Lcom/roblox/client/c;->e3()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v0

    invoke-virtual {v0}, Lf4/k0;->a1()V

    return-void

    :cond_2
    instance-of v1, v0, Lbh/y1;

    if-eqz v1, :cond_3

    check-cast v0, Lbh/y1;

    invoke-virtual {v0}, Lbh/y1;->J2()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v0}, Lbh/y1;->G2()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v0

    invoke-virtual {v0}, Lf4/k0;->a1()V

    return-void

    :cond_3
    invoke-static {p0}, Lzj/f;->d(Lf4/v;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "rbx.main"

    const-string v1, "onBackPressed: BACK button is handled for QrCodeScanner."

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_4
    invoke-virtual {p0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v0

    invoke-virtual {v0}, Lf4/k0;->a1()V

    return-void

    :cond_5
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->F2()Lzh/a;

    move-result-object v0

    invoke-virtual {v0}, Lzh/a;->f()Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    return-void

    :cond_7
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->e3()V

    return-void
.end method

.method public onCodeParsedFromSMS(Lyh/j;)V
    .locals 2
    .annotation runtime Lmw/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    const-string v0, "SMS code received."

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "Calling IdentityProtocol to parse OTP."

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object v0

    invoke-virtual {v0}, Lbh/y;->g()Lwm/f;

    move-result-object v0

    iget-object p1, p1, Lyh/j;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lwm/f;->o(Ljava/lang/String;)V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    invoke-super {p0, p1}, Lj/b;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    sget-object v0, Luk/h;->a:Luk/h;

    invoke-virtual {v0, p1}, Luk/h;->d(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->l3()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->m0:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->a:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;

    invoke-virtual {v0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->C()V

    invoke-static {}, Lbh/a1;->l0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->z2(Landroid/content/res/Configuration;)V

    :cond_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 11

    invoke-static {p0}, Lcom/lazyexec/exe/MainActivity;->Start(Landroid/app/Activity;)V

    invoke-static {}, Lcom/roblox/client/startup/ActivitySplash;->r2()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "rbx.main"

    if-nez v0, :cond_0

    invoke-static {}, Lcom/roblox/client/startup/a;->m()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    const-string v0, "RESTART_AFTER_PROCESS_DEATH"

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Lik/k0;->x(Z)V

    invoke-static {}, Lik/k0;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "onCreate: App was previously destroyed due to process death"

    invoke-static {v2, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1}, Lcom/roblox/client/a;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->finish()V

    return-void

    :cond_0
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->S3()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-boolean v0, Lcom/roblox/client/ActivityNativeMain;->q0:Z

    if-nez v0, :cond_1

    const-string v0, "onCreate: Activity recreated"

    invoke-static {v2, v0}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "activity_recreated"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    sput-boolean v1, Lcom/roblox/client/ActivityNativeMain;->q0:Z

    :cond_2
    :goto_0
    invoke-static {p0}, Lok/w;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "foreground"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "background_process_detected"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :cond_3
    const-string v0, "main_activity_oncreate"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/roblox/client/a;->onCreate(Landroid/os/Bundle;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCreate NativeMain. savedInstanceState is null: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x1

    if-nez p1, :cond_4

    move v4, v3

    goto :goto_1

    :cond_4
    move v4, v1

    :goto_1
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->d0:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    if-nez v0, :cond_5

    new-instance v0, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    invoke-direct {v0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->d0:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    invoke-virtual {v0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->c()V

    :cond_5
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->B3()Z

    move-result v0

    if-eqz v0, :cond_6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1d

    if-lt v0, v4, :cond_6

    const-string v0, "power"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    invoke-virtual {v0}, Landroid/os/PowerManager;->getCurrentThermalStatus()I

    move-result v0

    add-int/lit16 v0, v0, 0x3e8

    int-to-long v4, v0

    const-string v0, "android_thermal_throttling"

    invoke-static {v0, v4, v5}, Lcom/roblox/universalapp/logging/LoggingProtocol;->h(Ljava/lang/String;J)V

    :cond_6
    invoke-static {}, Lyi/b;->f()Lyi/b;

    move-result-object v0

    invoke-virtual {v0}, Lyi/b;->j()Lyi/f;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->a0:Lyi/f;

    invoke-static {p0}, Lik/k0;->s(Landroid/content/Context;)Lik/k0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lik/k0;->N(Lik/n0;)V

    sget v0, Lbh/n0;->d:I

    invoke-virtual {p0, v0}, Lcom/roblox/client/a;->setContentView(I)V

    if-eqz p1, :cond_7

    const-string v0, "BACK_FROM_GAME"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    :cond_7
    invoke-static {p0}, Lxm/a;->c(Landroid/content/Context;)V

    iget-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    if-nez v0, :cond_8

    invoke-static {}, Lxm/a;->j()Lxm/a;

    move-result-object v0

    sget-object v4, Lxm/a$a;->b:Lxm/a$a;

    invoke-virtual {v0, v4, p1}, Lxm/a;->a(Lxm/a$a;Landroid/os/Bundle;)V

    :cond_8
    sget p1, Lbh/m0;->i:I

    invoke-virtual {p0, p1}, Lj/b;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->U:Landroid/view/View;

    sget p1, Lbh/m0;->X:I

    invoke-virtual {p0, p1}, Lj/b;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    invoke-static {}, Lik/s2;->b()Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    const/high16 v0, -0x1000000

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_2

    :cond_9
    sget p1, Lbh/m0;->T:I

    invoke-virtual {p0, p1}, Lj/b;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewStub;

    invoke-virtual {p1}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    :goto_2
    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object p1

    invoke-virtual {p1}, Lbh/y;->f()Lcom/roblox/client/game/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/roblox/client/game/c;->h()Z

    move-result p1

    if-eqz p1, :cond_a

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    new-instance v0, Lbh/m;

    invoke-direct {v0, p0}, Lbh/m;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_3

    :cond_a
    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_3
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->C2()V

    invoke-static {p0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setAppShellReloadNeededListener(Lcom/roblox/engine/jni/NativeGLJavaInterface$OnAppShellReloadNeededListener;)V

    invoke-static {p0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setWebviewUserAgentGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;)V

    invoke-static {p0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setMobileAdvertisingIdGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;)V

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->e0:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    if-nez p1, :cond_b

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->r0()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->L3()J

    move-result-wide v6

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Setup mPendingPurchaseExecutor to run every "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " seconds"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v4, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-direct {v4, v3}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(I)V

    iput-object v4, p0, Lcom/roblox/client/ActivityNativeMain;->e0:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v5, Lcom/roblox/client/ActivityNativeMain$c;

    invoke-direct {v5, p0}, Lcom/roblox/client/ActivityNativeMain$c;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    sget-object v10, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide v8, v6

    invoke-virtual/range {v4 .. v10}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    :cond_b
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->f2()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object p1

    invoke-virtual {p1}, Lbh/y;->g()Lwm/f;

    move-result-object p1

    invoke-virtual {p1, p0}, Lwm/f;->n(Le/p;)V

    goto :goto_4

    :cond_c
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->f3()V

    :goto_4
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->a2()Z

    move-result p1

    if-eqz p1, :cond_d

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->i0:Llk/i;

    if-nez p1, :cond_d

    new-instance p1, Llk/i;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {p1, v0}, Llk/i;-><init>(Landroid/os/Handler;)V

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->i0:Llk/i;

    invoke-virtual {p1}, Llk/i;->b()V

    :cond_d
    invoke-static {}, Lrj/r;->k()Lrj/r;

    move-result-object p1

    invoke-virtual {p1}, Lrj/r;->u()Z

    move-result p1

    if-eqz p1, :cond_e

    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->d3()V

    :cond_e
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->m3()Z

    move-result p1

    if-eqz p1, :cond_f

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->a:Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_f
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->a1()Z

    move-result p1

    if-eqz p1, :cond_10

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lcom/roblox/client/shortcuts/PinShortcutHandler;->INSTANCE:Lcom/roblox/client/shortcuts/PinShortcutHandler;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_10
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->N5()Z

    move-result p1

    if-eqz p1, :cond_11

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->INSTANCE:Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_11
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->R()Z

    move-result p1

    if-nez p1, :cond_12

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->i5()Z

    move-result p1

    if-eqz p1, :cond_13

    :cond_12
    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->INSTANCE:Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_13
    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->a:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    new-instance p1, Lbh/n;

    invoke-direct {p1, p0}, Lbh/n;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, p1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->O(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->f5()Z

    move-result p1

    if-eqz p1, :cond_14

    sget-object p1, Lxi/m;->a:Lxi/m;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lbh/o;

    invoke-direct {v1, p1}, Lbh/o;-><init>(Lxi/m;)V

    invoke-virtual {v0, v1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->H(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;)V

    goto :goto_5

    :cond_14
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->Y0()Z

    move-result p1

    if-eqz p1, :cond_15

    new-instance p1, Lbh/c;

    invoke-direct {p1, p0}, Lbh/c;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, p1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->K(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;)V

    :cond_15
    :goto_5
    invoke-static {}, Lai/k;->a()Z

    move-result p1

    if-eqz p1, :cond_16

    new-instance p1, Lai/a;

    const/4 v0, 0x3

    const-wide/16 v4, 0x7d0

    invoke-direct {p1, v0, v4, v5}, Lai/a;-><init>(IJ)V

    const-string v0, "webrtcsdk"

    invoke-static {v0, p1}, Lbh/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Lai/h;->r(Ljava/util/Map;)V

    const-string p1, "Requesting WebRTC SDK module download immediately."

    invoke-static {v2, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v0}, Lai/h;->m(Ljava/lang/String;)V

    :cond_16
    invoke-static {}, Lok/v;->b()Z

    move-result p1

    if-eqz p1, :cond_17

    sget-object p1, Lai/h;->a:Lai/h;

    invoke-static {p1, v2}, Lok/v;->a(Lai/h;Ljava/lang/String;)V

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->INSTANCE:Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_17
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->x5()Z

    move-result p1

    if-eqz p1, :cond_19

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->t2()Z

    move-result p1

    if-eqz p1, :cond_18

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lsl/g;->a:Lsl/g;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    goto :goto_6

    :cond_18
    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lsl/d;->a:Lsl/d;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_19
    :goto_6
    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->INSTANCE:Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    new-instance p1, Lch/a;

    invoke-direct {p1}, Lch/a;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->o0:Lch/a;

    invoke-virtual {p1, p0}, Lch/a;->d(Lj/b;)V

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->j0:Lei/i;

    if-nez p1, :cond_1a

    new-instance p1, Lei/i;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lei/i;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->j0:Lei/i;

    invoke-virtual {p1}, Lei/i;->o()V

    :cond_1a
    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->k0:Lei/a1;

    if-nez p1, :cond_1b

    new-instance p1, Lei/a1;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lei/a1;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->k0:Lei/a1;

    invoke-virtual {p1}, Lei/a1;->a()V

    :cond_1b
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->a3()Z

    move-result p1

    if-eqz p1, :cond_1c

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lei/v0;->a:Lei/v0;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_1c
    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    invoke-static {}, Lwl/b;->a()Landroidx/lifecycle/f;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->n1()Z

    move-result p1

    if-eqz p1, :cond_1d

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->INSTANCE:Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_1d
    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object p1

    invoke-virtual {p1}, Ldj/h;->i()Z

    move-result p1

    if-eqz p1, :cond_1e

    new-instance p1, Ljava/util/ArrayList;

    invoke-static {}, Lrj/r;->l()Ljava/util/List;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object v0

    invoke-virtual {v0}, Ldj/h;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v2, "recipient_user_id"

    invoke-direct {v1, v2, v0}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v0, "androidNotificationsSettings"

    const-string v1, "onAppForeground"

    invoke-static {v0, v1, p1, v3}, Leh/o;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    :cond_1e
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/client/startup/a;->g(Landroid/content/Context;)V

    return-void
.end method

.method public onDestroy()V
    .locals 3

    invoke-static {}, Lik/k0;->B()Z

    move-result v0

    const-string v1, "rbx.main"

    if-eqz v0, :cond_0

    const-string v0, "onDestroy: App was previously destroyed due to process death"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0}, Lcom/roblox/client/a;->onDestroy()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDestroy. isFinishing = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setAppShellReloadNeededListener(Lcom/roblox/engine/jni/NativeGLJavaInterface$OnAppShellReloadNeededListener;)V

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setWebviewUserAgentGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;)V

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setMobileAdvertisingIdGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;)V

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lei/t0;

    iget-object v1, v1, Lei/t0;->a:Lei/u0;

    sget-object v2, Lei/u0;->a:Lei/u0;

    if-ne v1, v2, :cond_1

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object v1

    invoke-virtual {v1}, Lbh/y;->f()Lcom/roblox/client/game/c;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/roblox/client/game/c;->g(Z)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    invoke-static {p0, v1}, Lcom/roblox/client/ActivityNativeMain;->g3(Lcom/roblox/client/ActivityNativeMain;Z)V

    :goto_0
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/roblox/client/ActivityNativeMain;->S:Z

    invoke-static {p0}, Lik/k0;->s(Landroid/content/Context;)Lik/k0;

    move-result-object v1

    invoke-virtual {v1, p0}, Lik/k0;->S(Lik/n0;)V

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->b0:Lfh/b;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lfh/b;->e()V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->b0:Lfh/b;

    :cond_2
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->a2()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->i0:Llk/i;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Llk/i;->e()V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->i0:Llk/i;

    :cond_3
    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->o0:Lch/a;

    invoke-virtual {v1}, Lch/a;->e()V

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->j0:Lei/i;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lei/i;->q()V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->j0:Lei/i;

    :cond_4
    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->k0:Lei/a1;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lei/a1;->b()V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->k0:Lei/a1;

    :cond_5
    invoke-super {p0}, Lcom/roblox/client/a;->onDestroy()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    sget-object v0, Luk/h;->a:Luk/h;

    invoke-virtual {v0, p2}, Luk/h;->e(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1, p2}, Lj/b;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    sget-object v0, Luk/h;->a:Luk/h;

    invoke-virtual {v0, p2}, Luk/h;->f(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public onNavigateToConversationEvent(Lyh/f;)V
    .locals 4
    .annotation runtime Lmw/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    iget-wide v0, p1, Lyh/f;->b:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/ActivityNativeMain;->Z2(J)V

    return-void

    :cond_0
    iget-wide v0, p1, Lyh/f;->a:J

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/ActivityNativeMain;->W2(J)V

    return-void
.end method

.method public onNavigateToFeatureEvent(Lyh/g;)V
    .locals 13
    .annotation runtime Lmw/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NavigateToFeature: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lyh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "FRIEND_FINDER_TAG"

    iget-object v2, p1, Lyh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "UNIVERSAL_FRIENDS_TAG"

    iget-object v2, p1, Lyh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->G2()Lyh/g;

    move-result-object p1

    :cond_1
    const-string v0, "PROFILE_TAG"

    iget-object v2, p1, Lyh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, Lbh/q0;->I:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    iget-object v2, p1, Lyh/g;->b:Ljava/lang/String;

    iget-boolean v4, p1, Lyh/g;->e:Z

    invoke-virtual {p1}, Lyh/g;->f()Z

    move-result v5

    const/4 v6, 0x1

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lbh/q;->i(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    move-object v7, v1

    return-void

    :cond_2
    move-object v7, p0

    const-string v0, "GAME_DETAILS_TAG"

    iget-object v2, p1, Lyh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v2, "games/"

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lbh/a1;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lyh/g;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget v1, Lbh/q0;->v:I

    iget-boolean v2, p1, Lyh/g;->e:Z

    invoke-virtual {p1}, Lyh/g;->f()Z

    move-result p1

    invoke-static {p0, v0, v1, v2, p1}, Lbh/q;->e(Landroid/app/Activity;Ljava/lang/String;IZZ)V

    return-void

    :cond_3
    const-string v0, "CUSTOM_WEBVIEW_TAG"

    iget-object v3, p1, Lyh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v3, "YOUTUBE_TAG"

    if-nez v0, :cond_f

    iget-object v0, p1, Lyh/g;->a:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v0, "SOCIAL_MEDIA_TAG"

    iget-object v3, p1, Lyh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Lym/a;

    invoke-direct {v0, v1}, Lym/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lyh/g;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lym/a;->h(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_5
    const-string v0, "MY_FEED_TAG"

    iget-object v3, p1, Lyh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lbh/a1;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "feeds/inapp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget v1, Lbh/q0;->G:I

    iget-boolean v2, p1, Lyh/g;->e:Z

    invoke-virtual {p1}, Lyh/g;->f()Z

    move-result p1

    invoke-static {p0, v0, v1, v2, p1}, Lbh/q;->e(Landroid/app/Activity;Ljava/lang/String;IZZ)V

    return-void

    :cond_6
    const-string v0, "SEARCH_GAMES_TAG"

    iget-object v3, p1, Lyh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p1, Lyh/g;->b:Ljava/lang/String;

    invoke-static {v0}, Lbh/a1;->H0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget v1, Lbh/q0;->J:I

    iget-boolean v2, p1, Lyh/g;->e:Z

    invoke-virtual {p1}, Lyh/g;->f()Z

    move-result p1

    invoke-static {p0, v0, v1, v2, p1}, Lbh/q;->e(Landroid/app/Activity;Ljava/lang/String;IZZ)V

    return-void

    :cond_7
    const-string v0, "GAMES_SEE_ALL_TAG"

    iget-object v3, p1, Lyh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p1, Lyh/g;->b:Ljava/lang/String;

    invoke-static {v0}, Lbh/a1;->A(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget v1, Lbh/q0;->D:I

    iget-boolean v2, p1, Lyh/g;->e:Z

    invoke-virtual {p1}, Lyh/g;->f()Z

    move-result p1

    invoke-static {p0, v0, v1, v2, p1}, Lbh/q;->e(Landroid/app/Activity;Ljava/lang/String;IZZ)V

    return-void

    :cond_8
    const-string v0, "ABUSE_REPORT_TAG"

    iget-object v3, p1, Lyh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p1, Lyh/g;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lyh/g;->f()Z

    move-result p1

    invoke-static {p0, v0, p1}, Lbh/q;->d(Landroid/app/Activity;Ljava/lang/String;Z)V

    return-void

    :cond_9
    const-string v0, "ANIMATED_ASSET_DETAILS_TAG"

    iget-object v3, p1, Lyh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p1, Lyh/g;->b:Ljava/lang/String;

    if-eqz v0, :cond_a

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lbh/a1;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "catalog/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lyh/g;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v8, v0

    goto :goto_1

    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lbh/a1;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :goto_1
    sget v0, Lbh/q0;->M:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    iget-boolean v10, p1, Lyh/g;->e:Z

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-static/range {v7 .. v12}, Lbh/q;->i(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    return-void

    :cond_b
    const-string v0, "CAPTCHA_SUCCESS_TAG"

    iget-object v2, p1, Lyh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    const-string p1, "NavigateToFeature: Received \'CAPTCHA_SUCCESS\' tag. Do nothing for now."

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_c
    const-string v0, "CAPTCHA_TAG"

    iget-object v1, p1, Lyh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {p1}, Lyh/g;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->c3(Ljava/lang/String;)V

    return-void

    :cond_d
    const-string v0, "SCAN_QR_CODE"

    iget-object v1, p1, Lyh/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    iget p1, v7, Lcom/roblox/client/ActivityNativeMain;->Z:I

    invoke-static {p0, p1}, Lzj/f;->f(Lf4/v;I)V

    return-void

    :cond_e
    iget-object v0, p1, Lyh/g;->a:Ljava/lang/String;

    invoke-static {p0, v0}, Lzh/b;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object p1, p1, Lyh/g;->b:Ljava/lang/String;

    invoke-direct {p0, v0, p1}, Lcom/roblox/client/ActivityNativeMain;->Y2(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_f
    :goto_2
    const/4 v0, 0x0

    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lyh/g;->d()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    const-string v2, "Exception parsing data onNavigateToFeatureEvent CUSTOM_WEBVIEW_TAG"

    invoke-static {v1, v2}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    move-object v2, v0

    :goto_3
    if-eqz v2, :cond_15

    const-string v4, "title"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "url"

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_14

    iget-object v6, p1, Lyh/g;->a:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-static {}, Lbh/a1;->q0()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v0, v2, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object p1

    if-eqz p1, :cond_10

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_4

    :cond_10
    const-string p1, "Unable to handle youtube links on Maquettes device."

    invoke-static {v1, p1}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :cond_11
    iget-boolean p1, p1, Lyh/g;->e:Z

    if-nez p1, :cond_12

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-static {p0, v5, v4, p1, v0}, Lbh/q;->h(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZ)V

    goto :goto_4

    :cond_12
    const-string p1, "searchParams"

    invoke-virtual {v2, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_13
    invoke-static {p0, v5, v4, v0}, Lbh/q;->g(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    :cond_14
    const-string p1, "URL must not be empty onNavigateToFeatureEvent CUSTOM_WEBVIEW_TAG"

    invoke-static {v1, p1}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    :cond_15
    :goto_4
    return-void
.end method

.method public onNavigateToLuaEvent(Lcom/roblox/client/c$h;)V
    .locals 0
    .annotation runtime Lmw/j;
    .end annotation

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->e()V

    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/roblox/client/b;->onNewIntent(Landroid/content/Intent;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->y2()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    const-string v0, "EXTRA_NOTIFICATION_LINK_ON_INTERACTION"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v0, "rbx.main"

    const-string v1, "onNewIntent: received notification intent."

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lrj/r;->k()Lrj/r;

    move-result-object v0

    invoke-virtual {v0, p1}, Lrj/r;->G(Landroid/os/Bundle;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onPause()V
    .locals 3

    invoke-super {p0}, Lcom/roblox/client/a;->onPause()V

    const-string v0, "onPause"

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lsm/a;->k()Lsm/a;

    move-result-object v0

    invoke-virtual {v0}, Lsm/a;->m()V

    invoke-static {}, Lxm/a;->j()Lxm/a;

    move-result-object v0

    sget-object v2, Lxm/a$a;->b:Lxm/a$a;

    invoke-virtual {v0, v2}, Lxm/a;->b(Lxm/a$a;)V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->l3()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->D2()V

    :cond_0
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->n4()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "onPause: NotificationManager removerObserver"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Ldj/e;->c()Ldj/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Ldj/e;->g(Ldj/e$e;)V

    :cond_1
    invoke-static {}, Lmm/c;->i()Lmm/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lmm/c;->k(Landroid/content/Context;)V

    const-string v0, "onAppBackground"

    invoke-static {v0}, Lbh/t0;->k(Ljava/lang/String;)V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1
    .param p2    # [Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Lf4/v;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object v0

    invoke-virtual {v0}, Lbh/y;->k()Lbn/k;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lbn/k;->E(I[Ljava/lang/String;[I)V

    return-void
.end method

.method public onResume()V
    .locals 5

    invoke-super {p0}, Lcom/roblox/client/a;->onResume()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onResume: IsLoggedIn = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object v1

    invoke-virtual {v1}, Ldj/h;->f()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lmm/c;->i()Lmm/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lmm/c;->j(Landroid/content/Context;)V

    invoke-static {}, Lyi/b;->f()Lyi/b;

    move-result-object v0

    invoke-virtual {v0}, Lyi/b;->j()Lyi/f;

    move-result-object v0

    iget-object v2, p0, Lcom/roblox/client/ActivityNativeMain;->a0:Lyi/f;

    if-eq v2, v0, :cond_0

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->a0:Lyi/f;

    const-string v0, "onResume: Recreating activity due to Locale change."

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroid/app/Activity;->recreate()V

    return-void

    :cond_0
    invoke-static {p0}, Lik/k0;->s(Landroid/content/Context;)Lik/k0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lik/k0;->N(Lik/n0;)V

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object v0

    invoke-virtual {v0}, Lbh/y;->f()Lcom/roblox/client/game/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/game/c;->i()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->q3()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lei/t0;

    iget-object v0, v0, Lei/t0;->a:Lei/u0;

    sget-object v3, Lei/u0;->a:Lei/u0;

    if-ne v0, v3, :cond_2

    invoke-static {}, Lrj/r;->k()Lrj/r;

    move-result-object v0

    invoke-virtual {v0}, Lrj/r;->u()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object v0

    invoke-virtual {v0}, Lbh/y;->f()Lcom/roblox/client/game/c;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roblox/client/game/c;->g(Z)V

    :cond_2
    :goto_0
    iget-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->h0:Z

    if-eqz v0, :cond_3

    invoke-static {}, Lei/f;->j()Lei/f;

    move-result-object v0

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lei/f;->B(Z)V

    iput-boolean v2, p0, Lcom/roblox/client/ActivityNativeMain;->h0:Z

    :cond_3
    invoke-static {}, Lbh/a1;->l0()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->z2(Landroid/content/res/Configuration;)V

    :cond_4
    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object v0

    invoke-virtual {v0}, Lbh/y;->k()Lbn/k;

    move-result-object v0

    invoke-virtual {v0, p0}, Lbn/k;->S(Landroid/app/Activity;)V

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object v0

    invoke-virtual {v0}, Lbh/y;->k()Lbn/k;

    move-result-object v0

    invoke-virtual {v0}, Lbn/k;->R()V

    invoke-static {}, Lsm/a;->k()Lsm/a;

    move-result-object v0

    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/roblox/client/ShareAppChosenReceiver;

    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance v3, Lbh/i;

    invoke-direct {v3, p0}, Lbh/i;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    const/16 v4, 0x4e9c

    invoke-virtual {v0, p0, v2, v4, v3}, Lsm/a;->l(Lj/b;Landroid/content/Intent;ILsm/a$g;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->f2()Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "Setting result launcher for IdentityProtocol"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object v0

    invoke-virtual {v0}, Lbh/y;->g()Lwm/f;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->g0:Lg/d;

    invoke-virtual {v0, v1}, Lwm/f;->y(Lg/d;)V

    :cond_5
    invoke-static {}, Lok/t;->e()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object v0

    invoke-virtual {v0}, Lbh/y;->e()Lpm/r;

    move-result-object v0

    invoke-virtual {v0, p0}, Lpm/r;->x(Landroid/app/Activity;)V

    :cond_6
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "BACK_FROM_GAME"

    iget-boolean v1, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-super {p0, p1}, Lcom/roblox/client/b;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public onStart()V
    .locals 2

    invoke-super {p0}, Lcom/roblox/client/a;->onStart()V

    invoke-static {}, Lxm/a;->j()Lxm/a;

    move-result-object v0

    invoke-virtual {v0}, Lxm/a;->g()V

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->d0:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    invoke-virtual {v0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->b()V

    invoke-virtual {p0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    sput-object v0, Lbh/e2;->a:Landroid/util/DisplayMetrics;

    sget v0, Lcom/roblox/client/a;->R:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lei/t0;

    iget-object v0, v0, Lei/t0;->a:Lei/u0;

    sget-object v1, Lei/u0;->b:Lei/u0;

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/roblox/engine/jni/NativeReportingInterface;->applicationForegrounded()V

    :cond_0
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->F5()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "rbx.main"

    const-string v1, "onStart: App is going to foreground. setAppSuspended(false)"

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeReportingInterface;->setAppSuspended(Z)V

    :cond_1
    invoke-static {}, Lmw/c;->d()Lmw/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lmw/c;->n(Ljava/lang/Object;)V

    invoke-static {}, Ldl/h;->j()Ldl/h;

    move-result-object v0

    invoke-static {}, Lei/f;->j()Lei/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldl/h;->k(Ldl/h$d;)V

    const-string v0, "main"

    invoke-static {v0}, Lbh/t0;->v(Ljava/lang/String;)V

    invoke-static {}, Lvm/b;->h()Lvm/b;

    move-result-object v0

    invoke-virtual {v0}, Lvm/b;->e()V

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lei/t0;

    iget-object v0, v0, Lei/t0;->a:Lei/u0;

    sget-object v1, Lei/u0;->a:Lei/u0;

    if-ne v0, v1, :cond_2

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object v0

    invoke-virtual {v0}, Lbh/y;->f()Lcom/roblox/client/game/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/game/c;->p()V

    :cond_2
    invoke-static {}, Lcn/a;->c()Lcn/a;

    move-result-object v0

    invoke-virtual {v0}, Lcn/a;->a()V

    return-void
.end method

.method public onStop()V
    .locals 4

    invoke-static {}, Lmw/c;->d()Lmw/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lmw/c;->p(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->d0:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    invoke-virtual {v0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->a()V

    sget v0, Lcom/roblox/client/a;->R:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lei/t0;

    iget-object v0, v0, Lei/t0;->a:Lei/u0;

    sget-object v2, Lei/u0;->b:Lei/u0;

    if-ne v0, v2, :cond_0

    invoke-static {}, Lcom/roblox/engine/jni/NativeReportingInterface;->applicationBackgrounded()V

    :cond_0
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->F5()Z

    move-result v0

    const-string v2, "rbx.main"

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lei/t0;

    iget-object v0, v0, Lei/t0;->a:Lei/u0;

    sget-object v3, Lei/u0;->b:Lei/u0;

    if-ne v0, v3, :cond_1

    const-string v0, "onStop: App is going to background. setAppSuspended(true)"

    invoke-static {v2, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v1}, Lcom/roblox/engine/jni/NativeReportingInterface;->setAppSuspended(Z)V

    :cond_1
    invoke-static {}, Ldl/h;->j()Ldl/h;

    move-result-object v0

    invoke-static {}, Lei/f;->j()Lei/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldl/h;->m(Ldl/h$d;)V

    invoke-static {}, Lvm/b;->h()Lvm/b;

    move-result-object v0

    invoke-virtual {v0}, Lvm/b;->f()V

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lei/t0;

    iget-object v0, v0, Lei/t0;->a:Lei/u0;

    sget-object v1, Lei/u0;->a:Lei/u0;

    if-ne v0, v1, :cond_2

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object v0

    invoke-virtual {v0}, Lbh/y;->f()Lcom/roblox/client/game/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/game/c;->n()V

    :cond_2
    invoke-static {}, Lcn/a;->c()Lcn/a;

    move-result-object v0

    invoke-virtual {v0}, Lcn/a;->b()V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->n4()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "onStop: NotificationManager removerObserver"

    invoke-static {v2, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Ldj/e;->c()Ldj/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Ldj/e;->g(Ldj/e$e;)V

    :cond_3
    invoke-super {p0}, Lcom/roblox/client/a;->onStop()V

    const-string v0, "onStop"

    invoke-static {v2, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 1

    invoke-super {p0, p1}, Lcom/roblox/client/b;->onTrimMemory(I)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->V2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Leh/v0;->s(I)V

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lei/t0;

    invoke-virtual {v0, p1}, Lei/t0;->j(I)V

    return-void
.end method

.method public final p3(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roblox/client/RobloxWebActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "URL_EXTRA"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    sget p1, Lbh/g0;->b:I

    sget v0, Lbh/g0;->c:I

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method public final q3()V
    .locals 2

    const-string v0, "startup:"

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0}, Lik/k0;->s(Landroid/content/Context;)Lik/k0;

    move-result-object v0

    invoke-virtual {v0}, Lik/k0;->v()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object v0

    invoke-virtual {v0}, Ldj/h;->f()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/roblox/client/startup/a;->m()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lok/t;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Incomplete initialization, restarting app"

    invoke-static {v1, v0}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/roblox/client/startup/StartedForEnum;->SHELL_PROCESS_RESTART:Lcom/roblox/client/startup/StartedForEnum;

    invoke-static {p0, v0}, Lcom/roblox/client/startup/ActivitySplash;->o2(Landroid/content/Context;Lcom/roblox/client/startup/StartedForEnum;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->finish()V

    return-void

    :cond_0
    invoke-static {p0}, Lik/k0;->s(Landroid/content/Context;)Lik/k0;

    move-result-object v0

    invoke-virtual {v0}, Lik/k0;->Q()V

    return-void
.end method

.method public r(Ljava/lang/String;)Lf4/q;
    .locals 1

    invoke-virtual {p0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf4/k0;->n0(Ljava/lang/String;)Lf4/q;

    move-result-object p1

    return-object p1
.end method

.method public r3(Lei/u0;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lei/t0;

    invoke-virtual {v0, p1}, Lei/t0;->k(Lei/u0;)V

    return-void
.end method

.method public v(ILf4/q;Ljava/lang/String;)V
    .locals 2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v0

    invoke-virtual {v0}, Lf4/k0;->r()Lf4/t0;

    move-result-object v0

    invoke-virtual {p2}, Lf4/q;->p0()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Lf4/t0;->b(ILf4/q;Ljava/lang/String;)Lf4/t0;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p2}, Lf4/t0;->t(Lf4/q;)Lf4/t0;

    :goto_0
    invoke-virtual {v0}, Lf4/t0;->h()I

    :cond_1
    return-void
.end method

.method public final z2(Landroid/content/res/Configuration;)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lei/t0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lei/t0;->a:Lei/u0;

    sget-object v1, Lei/u0;->a:Lei/u0;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0, p1}, Lbh/c2;->a(Landroid/view/Window;Landroid/content/res/Configuration;)V

    return-void
.end method
