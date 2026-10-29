.class public Lcom/roblox/client/ActivityNativeMain;
.super Lcom/roblox/client/a;
.source "SourceFile"

# interfaces
.implements Lvi/e$e;
.implements Lrh/d;
.implements Lak/n0;
.implements Lwg/c$d;
.implements Lwh/a$g;
.implements Lcom/roblox/client/startup/c$b;
.implements Lcom/roblox/engine/jni/NativeGLJavaInterface$OnAppShellReloadNeededListener;
.implements Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;
.implements Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;
.implements Lzj/c;
.implements Lwh/a$f;
.implements Lcom/roblox/client/game/ExperienceSession$d;
.implements Lcom/roblox/protocols/webview/a$f;
.implements Lwh/q;


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

.field public T:Lrh/a;

.field public U:Landroid/view/View;

.field public V:Landroid/view/View;

.field public W:Z

.field public X:J

.field public Y:Ljava/lang/String;

.field public Z:I

.field public a0:Lqi/f;

.field public b0:Lwg/c;

.field public c0:Lcom/roblox/protocols/webview/WebViewProtocol;

.field public d0:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

.field public e0:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public f0:Lwh/s0;

.field public g0:Lg/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg/c<",
            "Landroidx/activity/result/IntentSenderRequest;",
            ">;"
        }
    .end annotation
.end field

.field public h0:Z

.field public i0:Ldk/h;

.field public j0:Lwh/i;

.field public k0:Lwh/z0;

.field public l0:Landroid/widget/ImageView;

.field public final m0:Ljava/lang/Runnable;

.field public final n0:Ljava/lang/Runnable;

.field public o0:Ltg/a;

.field public final p0:Lei/m;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/roblox/client/a;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->b0:Lwg/c;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->h0:Z

    new-instance v0, Lsg/j;

    invoke-direct {v0, p0}, Lsg/j;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->m0:Ljava/lang/Runnable;

    new-instance v0, Lsg/k;

    invoke-direct {v0, p0}, Lsg/k;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->n0:Ljava/lang/Runnable;

    new-instance v0, Lcom/roblox/client/ActivityNativeMain$g;

    invoke-direct {v0, p0}, Lcom/roblox/client/ActivityNativeMain$g;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->p0:Lei/m;

    return-void
.end method

.method private E2()V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/c;->v2(Lj/b;)V

    return-void
.end method

.method private Y2(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p2}, Lgk/f;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p2, p1}, Lsg/q;->f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private d3()V
    .locals 4

    const-string v0, "rbx.main"

    const-string v1, "processPushNotification."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Ljj/r;->k()Ljj/r;

    move-result-object v0

    invoke-virtual {v0}, Ljj/r;->i()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {}, Ljj/r;->k()Ljj/r;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljj/r;->t(Landroid/os/Bundle;)Z

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

    invoke-static {}, Ltj/a;->a()Ltj/a;

    move-result-object v1

    const-string v2, "EXTRA_NOTIFICATION_LINK_ON_INTERACTION"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ltj/a;->b(Ljava/lang/String;)V

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

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->F2()Lrh/a;

    move-result-object v0

    invoke-virtual {v0}, Lrh/a;->d()Lwh/a;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->r()Landroidx/fragment/app/h;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroidx/fragment/app/h;->m(Landroidx/fragment/app/c;)Landroidx/fragment/app/h;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/fragment/app/h;->h()I

    :cond_0
    const-string p0, "rbx.appshell"

    const-string p1, "removeGlApp() clearing app shell"

    invoke-static {p0, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object p0

    invoke-virtual {p0}, Lwh/f;->f()V

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

    invoke-static {p0}, Lak/n2;->b(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic n2(Lcom/roblox/client/ActivityNativeMain;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->J2()V

    return-void
.end method

.method public static synthetic o2(Ljava/lang/String;)V
    .locals 1

    invoke-static {p0}, Lol/a;->b(Ljava/lang/String;)Lol/a;

    move-result-object p0

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lfk/c;->u(Lol/a;)V

    return-void
.end method

.method private o3(I)V
    .locals 1

    const-string v0, "retry_during_main"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/roblox/client/startup/c;->y2(Lj/b;I)V

    return-void
.end method

.method public static synthetic p2(Lcom/roblox/client/ActivityNativeMain;Landroidx/activity/result/ActivityResult;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->P2(Landroidx/activity/result/ActivityResult;)V

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

.method public static bridge synthetic x2(Lcom/roblox/client/ActivityNativeMain;)Lrh/a;
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->F2()Lrh/a;

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

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->Z4()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->D(Landroid/content/Context;Z)V

    return-void

    :cond_0
    invoke-static {}, Lgk/t;->g()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_5

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v3

    invoke-virtual {v3}, Lfk/c;->j()J

    move-result-wide v3

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_8

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v5

    invoke-interface {v5}, Lth/i;->H1()Z

    move-result v5

    if-eqz v5, :cond_2

    cmp-long v0, v3, v1

    if-lez v0, :cond_1

    invoke-static {p0}, Lfj/a0;->R(Landroid/content/Context;)Lfj/a0;

    move-result-object v0

    invoke-virtual {v0, v3, v4, p1}, Lfj/a0;->K(JZ)V

    return-void

    :cond_1
    invoke-static {p0}, Lfj/a0;->R(Landroid/content/Context;)Lfj/a0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lfj/a0;->L(Z)V

    return-void

    :cond_2
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v5

    invoke-interface {v5}, Lth/i;->m3()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v5

    invoke-interface {v5}, Lth/i;->r()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static {p0}, Lfj/m;->F0(Landroid/content/Context;)Lfj/m;

    move-result-object v1

    invoke-virtual {v1, v3, v4, v0, p1}, Lfj/m;->m1(JLjava/lang/String;Z)V

    return-void

    :cond_3
    cmp-long v1, v3, v1

    if-lez v1, :cond_4

    invoke-static {p0}, Lfj/m;->F0(Landroid/content/Context;)Lfj/m;

    move-result-object v1

    invoke-virtual {v1, v3, v4, v0, p1}, Lfj/m;->A0(JLjava/lang/String;Z)V

    return-void

    :cond_4
    invoke-static {p0}, Lfj/m;->F0(Landroid/content/Context;)Lfj/m;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lfj/m;->B0(Ljava/lang/String;Z)V

    return-void

    :cond_5
    invoke-static {}, Lgk/t;->i()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object p1

    invoke-virtual {p1}, Lfk/c;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lfk/c;->j()J

    move-result-wide v3

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_8

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->I5()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_7

    cmp-long p1, v3, v1

    if-lez p1, :cond_6

    invoke-static {p0}, Lij/a;->a(Landroid/content/Context;)Lij/a;

    throw v0

    :cond_6
    invoke-static {p0}, Lij/a;->a(Landroid/content/Context;)Lij/a;

    throw v0

    :cond_7
    invoke-static {p0}, Lij/b;->a(Landroid/content/Context;)Lij/b;

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

    sget v0, Lsg/m0;->F:I

    iput v0, p0, Lcom/roblox/client/ActivityNativeMain;->Z:I

    new-instance v2, Landroid/widget/FrameLayout;

    invoke-direct {v2, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setId(I)V

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v0, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->J0()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lsg/n0;->k:I

    goto :goto_0

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->B4()Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lsg/n0;->l:I

    goto :goto_0

    :cond_1
    sget v0, Lsg/n0;->j:I

    :goto_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v3

    invoke-interface {v3}, Lth/i;->l2()Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, "fragment_shared_inflate_begin"

    invoke-static {v3}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v3, v0, v2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->l2()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "fragment_shared_inflate_end"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    :cond_3
    new-instance v0, Lwh/s0;

    sget v3, Lsg/m0;->h0:I

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/view/SurfaceView;

    invoke-direct {v0, p0, v4}, Lwh/s0;-><init>(Lcom/roblox/client/a;Landroid/view/SurfaceView;)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lwh/s0;

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object v0

    iget-object v4, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lwh/s0;

    invoke-virtual {v0, v4}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    sget-object v0, Lmk/h;->a:Lmk/h;

    invoke-virtual {p0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    invoke-virtual {v0, v4}, Lmk/h;->c(Landroid/content/res/Configuration;)V

    const-string v0, "rbx.main"

    const-string v4, "createGlAppsFrame() apps frame created"

    invoke-static {v0, v4}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    invoke-virtual {v1, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->l3()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

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

.method public F(ILandroidx/fragment/app/c;Ljava/lang/String;)V
    .locals 2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->r()Landroidx/fragment/app/h;

    move-result-object v0

    invoke-virtual {p2}, Landroidx/fragment/app/c;->p0()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Landroidx/fragment/app/h;->b(ILandroidx/fragment/app/c;Ljava/lang/String;)Landroidx/fragment/app/h;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p2}, Landroidx/fragment/app/h;->t(Landroidx/fragment/app/c;)Landroidx/fragment/app/h;

    :goto_0
    invoke-virtual {v0}, Landroidx/fragment/app/h;->h()I

    :cond_1
    return-void
.end method

.method public final F2()Lrh/a;
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->T:Lrh/a;

    if-nez v0, :cond_0

    new-instance v0, Lrh/a;

    iget v1, p0, Lcom/roblox/client/ActivityNativeMain;->Z:I

    invoke-direct {v0, p0, v1}, Lrh/a;-><init>(Lrh/d;I)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->T:Lrh/a;

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->T:Lrh/a;

    return-object v0
.end method

.method public G()V
    .locals 2

    const-string v0, "rbx.main"

    const-string v1, "updateViewAppSettingsLoaded:"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->k3()V

    return-void
.end method

.method public final G2()Lph/g;
    .locals 2

    const-string v0, "CUSTOM_WEBVIEW_TAG"

    invoke-static {v0}, Lph/g;->b(Ljava/lang/String;)Lph/g;

    move-result-object v0

    invoke-static {p0}, Lsg/a1;->Q(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lph/g;->g(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lph/g;->j(Z)V

    return-object v0
.end method

.method public final H2()V
    .locals 3

    const-string v0, "internalOnResume:"

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->A2(Z)V

    invoke-static {}, Lcom/roblox/client/d;->e()Lcom/roblox/client/d;

    move-result-object v0

    new-instance v2, Lcom/roblox/client/ActivityNativeMain$h;

    invoke-direct {v2, p0}, Lcom/roblox/client/ActivityNativeMain$h;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, v2}, Lcom/roblox/client/d;->b(Lcom/roblox/client/d$d;)V

    invoke-static {}, Lgk/t;->j()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v0

    invoke-virtual {v0}, Lvi/h;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-static {p0}, Lsg/e2;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v0

    iget-object v2, p0, Lcom/roblox/client/ActivityNativeMain;->p0:Lei/m;

    invoke-virtual {v0, v2}, Lvi/h;->d(Lei/m;)V

    :cond_1
    const-string v0, "internalOnResume: NotificationManager addObserver"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lvi/e;->c()Lvi/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Lvi/e;->b(Lvi/e$e;)V

    invoke-static {}, Ljj/r;->k()Ljj/r;

    move-result-object v0

    invoke-virtual {v0}, Ljj/r;->u()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {p0}, Lsg/e2;->j(Landroid/content/Context;)Z

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

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->a3()V

    :cond_4
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->F2()Lrh/a;

    move-result-object v0

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->j0()Z

    invoke-virtual {v0}, Lrh/a;->d()Lwh/a;

    move-result-object v1

    if-nez v1, :cond_5

    new-instance v1, Lcom/roblox/client/feature/FeatureState;

    const-string v2, "CUSTOM_LUAVIEW_TAG"

    invoke-direct {v1, v2}, Lcom/roblox/client/feature/FeatureState;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lrh/a;->g(Lcom/roblox/client/feature/FeatureState;)V

    :cond_5
    return-void
.end method

.method public I()V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/b;->E1()V

    return-void
.end method

.method public final synthetic I2(Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p1, p0}, Lsg/q;->b(Lorg/json/JSONObject;Landroid/app/Activity;)V

    return-void
.end method

.method public J()V
    .locals 2

    const-string v0, "rbx.main"

    const-string v1, "showRetryUI:"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lsg/a1;->q0()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lsg/q0;->S:I

    invoke-static {p0, v0}, Lgk/x;->a(Landroid/app/Activity;I)V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->finish()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/b;->J1()Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lsg/q0;->S:I

    invoke-direct {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->o3(I)V

    :cond_1
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

.method public final synthetic M2(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lsg/e;

    invoke-direct {v0, p1}, Lsg/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public N()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->E2()V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->q3()V

    return-void
.end method

.method public final synthetic N2(Z)V
    .locals 1

    sget-object v0, Lpi/c;->a:Lpi/c;

    invoke-virtual {v0, p1}, Lpi/c;->j(Z)V

    sget-object v0, Lpi/b;->a:Lpi/b;

    invoke-virtual {v0, p0, p1}, Lpi/b;->b(Landroid/app/Activity;Z)V

    return-void
.end method

.method public O()V
    .locals 3

    const-string v0, "rbx.main"

    const-string v1, "navigateToLandingScreen:"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0, p0}, Lsg/y;->o(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "send_app_input_focus_to_lua"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->finish()V

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

.method public final synthetic P2(Landroidx/activity/result/ActivityResult;)V
    .locals 1

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->g()Lim/f;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/activity/result/ActivityResult;->a()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lim/f;->r(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method public Q1()Lmi/c;
    .locals 1

    new-instance v0, Lmi/d;

    invoke-direct {v0}, Lmi/d;-><init>()V

    return-object v0
.end method

.method public final Q2(Lcom/roblox/client/feature/FeatureState;)V
    .locals 2

    const-string v0, "rbx.appshell"

    const-string v1, "loadDataModel()"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object v0

    invoke-virtual {v0, p0}, Lwh/f;->F(Landroid/content/Context;)V

    invoke-static {p0}, Lwh/p;->a(Landroid/content/Context;)Lwh/f$d;

    move-result-object v0

    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object v1

    invoke-virtual {v1, v0}, Lwh/f;->k(Lwh/f$d;)V

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->isColdStartDeeplinkToGame()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lvi/h;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcm/a;->a()Lcm/a;

    move-result-object v0

    new-instance v1, Lsg/h;

    invoke-direct {v1, p0}, Lsg/h;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, v1}, Lcm/a;->b(Lcm/a$b;)V

    invoke-static {}, Lvi/h;->l()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lak/k0;->G(Landroid/app/Activity;Ljava/lang/String;)V

    :cond_0
    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->f()Lcom/roblox/client/game/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/game/c;->i()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->m3(Lcom/roblox/client/feature/FeatureState;)V

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeStartLuaAppDM()V

    :cond_1
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

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object p1

    invoke-virtual {p1}, Lvi/h;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Lsg/a1;->a0(J)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_2
    invoke-static {v3, v4}, Lsg/a1;->c0(J)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_3
    cmp-long p1, v3, v1

    if-nez p1, :cond_4

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object p1

    invoke-virtual {p1}, Lvi/h;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Lsg/a1;->b0(J)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_4
    invoke-static {v3, v4}, Lsg/a1;->c0(J)Ljava/lang/String;

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
    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object p1

    invoke-virtual {p1}, Lvi/h;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Lsg/a1;->a0(J)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_7
    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object p1

    invoke-virtual {p1}, Lvi/h;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Lsg/a1;->b0(J)Ljava/lang/String;

    move-result-object v5

    :goto_0
    invoke-virtual {p0, v5}, Lcom/roblox/client/ActivityNativeMain;->p3(Ljava/lang/String;)V

    return-void
.end method

.method public S(ILandroid/os/Bundle;)V
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

    invoke-static {p1}, Lwh/j0;->c(Landroid/os/Bundle;)Lwh/j0;

    move-result-object p1

    invoke-static {p1, p0}, Lsg/q;->j(Lwh/j0;Landroid/app/Activity;)V

    return-void

    :cond_1
    const-string p1, "rbx.main"

    const-string v0, "ANM.handleNotification() Logout event..."

    invoke-static {p1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeAppBridgeV2UserDidLogout()V

    invoke-static {}, Lwj/c;->a()Z

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
    invoke-static {p2}, Lvi/b;->g(Landroid/os/Bundle;)Lvi/b$d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/roblox/client/a;->X1(Lvi/b$d;)V

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

    invoke-static {}, Lsg/a1;->w0()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {v3, v4}, Lsg/a1;->A0(J)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->p3(Ljava/lang/String;)V

    return-void
.end method

.method public T()V
    .locals 1

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lgk/c;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->setMobileAdvertisingId(Ljava/lang/String;)V

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

    sget p1, Lsg/q0;->I:I

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v6, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, Lsg/q;->i(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    return-void

    :cond_2
    move-object v3, p0

    const-string v1, "SETTINGS_TAG"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget v0, Lsg/q0;->L:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lsg/q;->f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0}, Lrh/b;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lsg/q;->f(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

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

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->u0()I

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

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lcom/roblox/client/feature/FeatureState;

    const-string v1, "CHAT_TAG"

    invoke-direct {v0, v1}, Lcom/roblox/client/feature/FeatureState;-><init>(Ljava/lang/String;)V

    const-string v1, "CHAT_CONVERSATION_ID"

    invoke-virtual {v0, v1, p1, p2}, Lcom/roblox/client/feature/FeatureState;->g(Ljava/lang/String;J)V

    invoke-virtual {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->X2(Lcom/roblox/client/feature/FeatureState;)V

    return-void
.end method

.method public final X2(Lcom/roblox/client/feature/FeatureState;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "navigateToFeature:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/roblox/client/feature/FeatureState;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " bundle:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/roblox/client/feature/FeatureState;->a()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->m3(Lcom/roblox/client/feature/FeatureState;)V

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

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lcom/roblox/client/feature/FeatureState;

    const-string v1, "CHAT_TAG"

    invoke-direct {v0, v1}, Lcom/roblox/client/feature/FeatureState;-><init>(Ljava/lang/String;)V

    const-string v1, "USER_ID_EXTRA"

    invoke-virtual {v0, v1, p1, p2}, Lcom/roblox/client/feature/FeatureState;->g(Ljava/lang/String;J)V

    invoke-virtual {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->X2(Lcom/roblox/client/feature/FeatureState;)V

    return-void
.end method

.method public a0()V
    .locals 3

    const-string v0, "rbx.main"

    const-string v1, "onAppStarted: "

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/b;->J1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lvi/b;->e()Z

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

.method public final a3()V
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->n3()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lwh/s0;

    invoke-virtual {v0}, Lwh/s0;->b()Z

    move-result v0

    return v0
.end method

.method public b3(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1, p2}, Lzj/a;->c(Ljava/lang/String;Ljava/lang/String;)V

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

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

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

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object p1

    invoke-virtual {p1}, Lsg/y;->k()Lom/k;

    move-result-object p1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lom/k;->b0(Landroid/content/Context;)V

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
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->h2()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-instance v1, Lsg/f;

    invoke-direct {v1, p1}, Lsg/f;-><init>(Landroid/content/Context;)V

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

    invoke-static {v0, p1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

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
    sget-object p1, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;->b:Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    goto :goto_2

    :pswitch_1
    sget-object p1, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;->a:Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    goto :goto_2

    :pswitch_2
    sget-object p1, Lcom/roblox/client/captcha/LoginCaptchaConfig$c;->c:Lcom/roblox/client/captcha/LoginCaptchaConfig$c;

    :goto_2
    new-instance v2, Lcom/roblox/client/captcha/LoginCaptchaConfig;

    invoke-direct {v2, p1, v1}, Lcom/roblox/client/captcha/LoginCaptchaConfig;-><init>(Lcom/roblox/client/captcha/LoginCaptchaConfig$c;Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    new-instance v2, Lcom/roblox/client/captcha/SignUpCaptchaConfig;

    invoke-direct {v2}, Lcom/roblox/client/captcha/SignUpCaptchaConfig;-><init>()V

    :goto_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "openFunCaptchaActivity: config = "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, v2}, Lcom/roblox/client/captcha/ActivityFunCaptcha;->i2(Landroid/content/Context;Lcom/roblox/client/captcha/CaptchaConfig;)Landroid/content/Intent;

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

.method public d(Lnl/a;)V
    .locals 2

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->u0()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    sget v1, Lsg/m0;->j:I

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->m0(I)Landroidx/fragment/app/c;

    move-result-object v0

    instance-of v1, v0, Lcom/roblox/client/c;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/roblox/client/c;

    invoke-virtual {v0, p1}, Lcom/roblox/client/c;->H3(Lnl/a;)V

    :cond_0
    return-void
.end method

.method public e()V
    .locals 1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->b1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->h3()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/protocols/webview/WebViewProtocol;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roblox/protocols/webview/WebViewProtocol;->v()V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->h3()Z

    return-void
.end method

.method public e3()V
    .locals 2

    new-instance v0, Lcom/roblox/client/startup/d;

    invoke-direct {v0}, Lcom/roblox/client/startup/d;-><init>()V

    new-instance v1, Lsg/l;

    invoke-direct {v1, p0}, Lsg/l;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, p0, v1}, Lcom/roblox/client/startup/d;->c(Landroid/content/Context;Lcom/roblox/client/startup/d$a;)V

    return-void
.end method

.method public f(Z)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lwh/s0;

    invoke-virtual {v0, p1}, Lwh/s0;->f(Z)V

    return-void
.end method

.method public f3()V
    .locals 2

    const-string v0, "rbx.main"

    const-string v1, "Registering activity result for IdentityProtocol."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lh/j;

    invoke-direct {v0}, Lh/j;-><init>()V

    new-instance v1, Lsg/d;

    invoke-direct {v1, p0}, Lsg/d;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {p0, v0, v1}, Le/p;->h(Lh/a;Lg/a;)Lg/c;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->g0:Lg/c;

    return-void
.end method

.method public finish()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->finish()V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->L2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lsg/a1;->q0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    :cond_0
    return-void
.end method

.method public g(Lnl/a;)V
    .locals 10

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->B2()V

    iget-object v0, p1, Lnl/a;->d:Ljava/lang/Boolean;

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
    iget-object v3, p1, Lnl/a;->c:Ljava/lang/Boolean;

    if-nez v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :goto_1
    iget-object v4, p1, Lnl/a;->e:Ljava/lang/Boolean;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v2

    goto :goto_2

    :cond_2
    move v4, v1

    :goto_2
    iget-object v5, p1, Lnl/a;->f:Ljava/lang/Boolean;

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v2

    goto :goto_3

    :cond_3
    move v5, v1

    :goto_3
    iget-object v6, p1, Lnl/a;->g:Ljava/lang/Boolean;

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_4

    move v1, v2

    :cond_4
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v6

    invoke-interface {v6}, Lth/i;->b1()Z

    move-result v6

    if-eqz v0, :cond_5

    new-instance v0, Lsg/y0;

    invoke-direct {v0}, Lsg/y0;-><init>()V

    goto :goto_4

    :cond_5
    new-instance v0, Lvh/l;

    invoke-direct {v0}, Lvh/l;-><init>()V

    :goto_4
    invoke-virtual {v0}, Landroidx/fragment/app/c;->a()Landroidx/lifecycle/l;

    move-result-object v7

    new-instance v8, Lwg/b;

    invoke-direct {v8}, Lwg/b;-><init>()V

    invoke-virtual {v7, v8}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    invoke-virtual {v0}, Landroidx/fragment/app/c;->a()Landroidx/lifecycle/l;

    move-result-object v7

    new-instance v8, Lwg/a;

    invoke-direct {v8}, Lwg/a;-><init>()V

    invoke-virtual {v7, v8}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    const-string v8, "DEFAULT_URL"

    iget-object v9, p1, Lnl/a;->a:Ljava/lang/String;

    invoke-virtual {v7, v8, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v8, "USE_APP_HYBRID"

    invoke-virtual {v7, v8, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v8, "VISIBLE"

    invoke-virtual {v7, v8, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v3, "BACK_NAVIGATION_DISABLED"

    invoke-virtual {v7, v3, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v3, "TITLE_STRING"

    iget-object p1, p1, Lnl/a;->b:Ljava/lang/String;

    invoke-virtual {v7, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "HAS_PARENT"

    invoke-virtual {v7, p1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p1, "HIDE_ACCESSORY_BUTTONS"

    invoke-virtual {v7, p1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p1, "SHOW_DOMAIN_AS_TITLE"

    invoke-virtual {v7, p1, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    if-eqz v6, :cond_6

    const-string p1, "ENABLE_WEB_VIEW_SERVICE"

    invoke-virtual {v7, p1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p1, "hideNativeHeader"

    invoke-virtual {v7, p1, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_6
    invoke-virtual {v0, v7}, Landroidx/fragment/app/c;->O1(Landroid/os/Bundle;)V

    if-eqz v6, :cond_7

    new-instance p1, Lcom/roblox/client/ActivityNativeMain$a;

    invoke-direct {p1, p0}, Lcom/roblox/client/ActivityNativeMain$a;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, p1}, Lcom/roblox/client/c;->B3(Lcom/roblox/client/c$i;)V

    :cond_7
    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->r()Landroidx/fragment/app/h;

    move-result-object p1

    sget v1, Lsg/m0;->j:I

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->V2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v0, v2}, Landroidx/fragment/app/h;->b(ILandroidx/fragment/app/c;Ljava/lang/String;)Landroidx/fragment/app/h;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/h;->f(Ljava/lang/String;)Landroidx/fragment/app/h;

    invoke-virtual {p1}, Landroidx/fragment/app/h;->h()I

    return-void
.end method

.method public final h3()Z
    .locals 4

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->U0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->b1()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->u0()I

    move-result v0

    move v3, v1

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/fragment/app/FragmentManager;->a1()V

    add-int/lit8 v1, v1, 0x1

    move v3, v2

    goto :goto_0

    :cond_1
    return v3

    :cond_2
    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->u0()I

    move-result v0

    if-lez v0, :cond_3

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->a1()V

    return v2

    :cond_3
    return v1
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

    new-instance v0, Lok/a;

    invoke-direct {v0, p1}, Lok/a;-><init>(Z)V

    iget-object p1, v0, Lok/c;->a:Ljava/lang/String;

    iget-object v1, v0, Lok/c;->b:Ljava/lang/String;

    iget-object v0, v0, Lok/c;->c:Ljava/lang/String;

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

    invoke-static {v1, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

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
    invoke-static {v0, p1}, Lzj/a;->c(Ljava/lang/String;Ljava/lang/String;)V

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

    invoke-static {v1, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public k0()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "navigateToMainScreen: IsLoggedIn = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v1

    invoke-virtual {v1}, Lvi/h;->f()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->k3()V

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->f()Lcom/roblox/client/game/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/game/c;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/b;->J1()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v0

    invoke-virtual {v0}, Lvi/h;->f()Z

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

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->S:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->S:Z

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->T2()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lgk/t;->j()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/roblox/client/feature/FeatureState;

    const-string v1, "GAMES_TAG"

    invoke-direct {v0, v1}, Lcom/roblox/client/feature/FeatureState;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/roblox/client/feature/FeatureState;

    const-string v1, "CUSTOM_LUAVIEW_TAG"

    invoke-direct {v0, v1}, Lcom/roblox/client/feature/FeatureState;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->Q2(Lcom/roblox/client/feature/FeatureState;)V

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->b0:Lwg/c;

    if-nez v0, :cond_2

    new-instance v0, Lwg/c;

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v0, p0, v1}, Lwg/c;-><init>(Lwg/c$d;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->b0:Lwg/c;

    invoke-virtual {v0}, Lwg/c;->c()V

    :cond_2
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->b1()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lsg/a1;->q0()Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-direct {v0, p0}, Lcom/roblox/protocols/webview/WebViewProtocol;-><init>(Lcom/roblox/protocols/webview/a$f;)V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->c0:Lcom/roblox/protocols/webview/WebViewProtocol;

    :cond_3
    :goto_1
    return-void
.end method

.method public l()V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lwh/s0;

    invoke-virtual {v0}, Lwh/s0;->l()V

    return-void
.end method

.method public final l3()Z
    .locals 1

    invoke-static {}, Lsg/a1;->q0()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public m(Landroid/os/Bundle;)V
    .locals 4

    const-string v0, "Request to end the game. Performing app restoration."

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->k0()Z

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
    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object p1

    invoke-virtual {p1}, Lsg/y;->f()Lcom/roblox/client/game/c;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/roblox/client/game/c;->l(Landroid/content/Context;)V

    sget-object p1, Lwh/t0;->b:Lwh/t0;

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->r3(Lwh/t0;)V

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p0}, Lcom/roblox/client/b;->J1()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->U0()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-static {p0}, Lsg/a1;->U(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "ROBLOXCrash"

    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object p1

    invoke-virtual {p1}, Lwh/f;->z()V

    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object p1

    invoke-virtual {p1, v2}, Lwh/f;->B(Z)V

    new-instance p1, Lsg/g;

    invoke-direct {p1, p0}, Lsg/g;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :cond_1
    const-string p1, "Experience has been ended in the background."

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iput-boolean v2, p0, Lcom/roblox/client/ActivityNativeMain;->h0:Z

    return-void
.end method

.method public m3(Lcom/roblox/client/feature/FeatureState;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ANM.showFeature: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/roblox/client/feature/FeatureState;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->F2()Lrh/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lrh/a;->g(Lcom/roblox/client/feature/FeatureState;)V

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

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->h2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lak/n2;->c(Landroid/content/Context;)Ljava/lang/String;

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

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->g3()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->i2()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ldh/b;->b()Ldh/b;

    move-result-object v0

    invoke-virtual {v0}, Ldh/b;->c()I

    move-result v0

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->u()I

    move-result v1

    if-lt v0, v1, :cond_1

    invoke-static {}, Lxg/a;->e()Lxg/a;

    move-result-object v0

    iget-wide v1, p0, Lcom/roblox/client/ActivityNativeMain;->X:J

    iget-object v3, p0, Lcom/roblox/client/ActivityNativeMain;->Y:Ljava/lang/String;

    invoke-virtual {v0, p0, v1, v2, v3}, Lxg/a;->i(Landroid/app/Activity;JLjava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public o0()Le4/q;
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

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

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
    invoke-static {}, Lzj/a;->a()V

    invoke-virtual {p0, v3}, Lcom/roblox/client/ActivityNativeMain;->j3(Z)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->a3()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, Lem/a;->k()Lem/a;

    move-result-object p1

    invoke-virtual {p1, p3}, Lem/a;->e(Landroid/content/Intent;)V

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

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object p1

    new-instance p2, Lok/a;

    invoke-direct {p2, v3}, Lok/a;-><init>(Z)V

    invoke-virtual {p1, p2}, Lwh/f;->A(Lok/c;)V

    new-instance p1, Lcom/roblox/client/feature/FeatureState;

    const-string p2, "HOME_TAG"

    invoke-direct {p1, p2}, Lcom/roblox/client/feature/FeatureState;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->m3(Lcom/roblox/client/feature/FeatureState;)V

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

.method public onBackButtonNotConsumedEvent(Lph/c;)V
    .locals 0
    .annotation runtime Lfv/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->e3()V

    return-void
.end method

.method public onBackPressed()V
    .locals 2

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->u0()I

    move-result v0

    if-lez v0, :cond_5

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    sget v1, Lsg/m0;->j:I

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->m0(I)Landroidx/fragment/app/c;

    move-result-object v0

    instance-of v1, v0, Lcom/roblox/client/c;

    if-eqz v1, :cond_2

    check-cast v0, Lcom/roblox/client/c;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->b1()Z

    move-result v1

    if-eqz v1, :cond_1

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

    invoke-virtual {v0}, Lcom/roblox/protocols/webview/WebViewProtocol;->v()V

    return-void

    :cond_1
    invoke-virtual {v0}, Lcom/roblox/client/c;->h3()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v0}, Lcom/roblox/client/c;->e3()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->a1()V

    return-void

    :cond_2
    instance-of v1, v0, Lsg/y1;

    if-eqz v1, :cond_3

    check-cast v0, Lsg/y1;

    invoke-virtual {v0}, Lsg/y1;->J2()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v0}, Lsg/y1;->G2()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->a1()V

    return-void

    :cond_3
    invoke-static {p0}, Lrj/f;->d(Le4/q;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "rbx.main"

    const-string v1, "onBackPressed: BACK button is handled for QrCodeScanner."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_4
    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->a1()V

    return-void

    :cond_5
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->F2()Lrh/a;

    move-result-object v0

    invoke-virtual {v0}, Lrh/a;->f()Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    return-void

    :cond_7
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->e3()V

    return-void
.end method

.method public onCodeParsedFromSMS(Lph/j;)V
    .locals 2
    .annotation runtime Lfv/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    const-string v0, "SMS code received."

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "Calling IdentityProtocol to parse OTP."

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->g()Lim/f;

    move-result-object v0

    iget-object p1, p1, Lph/j;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lim/f;->o(Ljava/lang/String;)V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    invoke-super {p0, p1}, Lj/b;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    sget-object v0, Lmk/h;->a:Lmk/h;

    invoke-virtual {v0, p1}, Lmk/h;->d(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->l3()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->m0:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->a:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;

    invoke-virtual {v0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->C()V

    invoke-static {}, Lsg/a1;->l0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->z2(Landroid/content/res/Configuration;)V

    :cond_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 11

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

    invoke-static {v0}, Lak/k0;->x(Z)V

    invoke-static {}, Lak/k0;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "onCreate: App was previously destroyed due to process death"

    invoke-static {v2, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1}, Lcom/roblox/client/a;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->finish()V

    return-void

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->H3()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-boolean v0, Lcom/roblox/client/ActivityNativeMain;->q0:Z

    if-nez v0, :cond_1

    const-string v0, "onCreate: Activity recreated"

    invoke-static {v2, v0}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "activity_recreated"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    sput-boolean v1, Lcom/roblox/client/ActivityNativeMain;->q0:Z

    :cond_2
    :goto_0
    invoke-static {p0}, Lgk/w;->a(Landroid/content/Context;)Ljava/lang/String;

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

    invoke-static {v2, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->d0:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    if-nez v0, :cond_5

    new-instance v0, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    invoke-direct {v0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->d0:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    invoke-virtual {v0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->c()V

    :cond_5
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->u3()Z

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
    invoke-static {}, Lqi/b;->f()Lqi/b;

    move-result-object v0

    invoke-virtual {v0}, Lqi/b;->j()Lqi/f;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->a0:Lqi/f;

    invoke-static {p0}, Lak/k0;->s(Landroid/content/Context;)Lak/k0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lak/k0;->N(Lak/n0;)V

    sget v0, Lsg/n0;->d:I

    invoke-virtual {p0, v0}, Lcom/roblox/client/a;->setContentView(I)V

    if-eqz p1, :cond_7

    const-string v0, "BACK_FROM_GAME"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    :cond_7
    invoke-static {p0}, Ljm/a;->c(Landroid/content/Context;)V

    iget-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->W:Z

    if-nez v0, :cond_8

    invoke-static {}, Ljm/a;->j()Ljm/a;

    move-result-object v0

    sget-object v4, Ljm/a$a;->b:Ljm/a$a;

    invoke-virtual {v0, v4, p1}, Ljm/a;->a(Ljm/a$a;Landroid/os/Bundle;)V

    :cond_8
    sget p1, Lsg/m0;->i:I

    invoke-virtual {p0, p1}, Lj/b;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->U:Landroid/view/View;

    sget p1, Lsg/m0;->V:I

    invoke-virtual {p0, p1}, Lj/b;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object p1

    invoke-virtual {p1}, Lsg/y;->f()Lcom/roblox/client/game/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/roblox/client/game/c;->h()Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    new-instance v0, Lsg/m;

    invoke-direct {v0, p0}, Lsg/m;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_2

    :cond_9
    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->V:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_2
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->C2()V

    invoke-static {p0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setAppShellReloadNeededListener(Lcom/roblox/engine/jni/NativeGLJavaInterface$OnAppShellReloadNeededListener;)V

    invoke-static {p0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setWebviewUserAgentGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;)V

    invoke-static {p0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setMobileAdvertisingIdGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;)V

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->e0:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    if-nez p1, :cond_a

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->o0()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->A3()J

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

    invoke-static {v2, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v4, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-direct {v4, v3}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(I)V

    iput-object v4, p0, Lcom/roblox/client/ActivityNativeMain;->e0:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v5, Lcom/roblox/client/ActivityNativeMain$c;

    invoke-direct {v5, p0}, Lcom/roblox/client/ActivityNativeMain$c;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    sget-object v10, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide v8, v6

    invoke-virtual/range {v4 .. v10}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    :cond_a
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->b2()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object p1

    invoke-virtual {p1}, Lsg/y;->g()Lim/f;

    move-result-object p1

    invoke-virtual {p1, p0}, Lim/f;->n(Le/p;)V

    goto :goto_3

    :cond_b
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->f3()V

    :goto_3
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->W1()Z

    move-result p1

    if-eqz p1, :cond_c

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->i0:Ldk/h;

    if-nez p1, :cond_c

    new-instance p1, Ldk/h;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {p1, v0}, Ldk/h;-><init>(Landroid/os/Handler;)V

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->i0:Ldk/h;

    invoke-virtual {p1}, Ldk/h;->a()V

    :cond_c
    invoke-static {}, Ljj/r;->k()Ljj/r;

    move-result-object p1

    invoke-virtual {p1}, Ljj/r;->u()Z

    move-result p1

    if-eqz p1, :cond_d

    invoke-direct {p0}, Lcom/roblox/client/ActivityNativeMain;->d3()V

    :cond_d
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->g3()Z

    move-result p1

    if-eqz p1, :cond_e

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->a:Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_e
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->V0()Z

    move-result p1

    if-eqz p1, :cond_f

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lcom/roblox/client/shortcuts/PinShortcutHandler;->INSTANCE:Lcom/roblox/client/shortcuts/PinShortcutHandler;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_f
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->K5()Z

    move-result p1

    if-eqz p1, :cond_10

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->INSTANCE:Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_10
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->Q()Z

    move-result p1

    if-nez p1, :cond_11

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->c5()Z

    move-result p1

    if-eqz p1, :cond_12

    :cond_11
    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->INSTANCE:Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_12
    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->a:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    new-instance p1, Lsg/n;

    invoke-direct {p1, p0}, Lsg/n;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, p1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->O(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->Y4()Z

    move-result p1

    if-eqz p1, :cond_13

    sget-object p1, Lpi/m;->a:Lpi/m;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lsg/o;

    invoke-direct {v1, p1}, Lsg/o;-><init>(Lpi/m;)V

    invoke-virtual {v0, v1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->H(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;)V

    goto :goto_4

    :cond_13
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->T0()Z

    move-result p1

    if-eqz p1, :cond_14

    new-instance p1, Lsg/c;

    invoke-direct {p1, p0}, Lsg/c;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    invoke-virtual {v0, p1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->K(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;)V

    :cond_14
    :goto_4
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->m4()Z

    move-result p1

    if-eqz p1, :cond_15

    new-instance p1, Lsh/a;

    const/4 v0, 0x3

    const-wide/16 v4, 0x7d0

    invoke-direct {p1, v0, v4, v5}, Lsh/a;-><init>(IJ)V

    const-string v0, "webrtcsdk"

    invoke-static {v0, p1}, Lsg/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Lsh/g;->q(Ljava/util/Map;)V

    const-string p1, "Requesting WebRTC SDK module download immediately."

    invoke-static {v2, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v0}, Lsh/g;->l(Ljava/lang/String;)V

    :cond_15
    invoke-static {}, Lgk/v;->b()Z

    move-result p1

    if-eqz p1, :cond_16

    sget-object p1, Lsh/g;->a:Lsh/g;

    invoke-static {p1, v2}, Lgk/v;->a(Lsh/g;Ljava/lang/String;)V

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->INSTANCE:Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_16
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->w5()Z

    move-result p1

    if-eqz p1, :cond_18

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->n2()Z

    move-result p1

    if-eqz p1, :cond_17

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lfl/g;->a:Lfl/g;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    goto :goto_5

    :cond_17
    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lfl/d;->a:Lfl/d;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_18
    :goto_5
    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->INSTANCE:Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    new-instance p1, Ltg/a;

    invoke-direct {p1}, Ltg/a;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->o0:Ltg/a;

    invoke-virtual {p1, p0}, Ltg/a;->e(Lj/b;)V

    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->j0:Lwh/i;

    if-nez p1, :cond_19

    new-instance p1, Lwh/i;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lwh/i;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->j0:Lwh/i;

    invoke-virtual {p1}, Lwh/i;->o()V

    :cond_19
    iget-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->k0:Lwh/z0;

    if-nez p1, :cond_1a

    new-instance p1, Lwh/z0;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lwh/z0;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain;->k0:Lwh/z0;

    invoke-virtual {p1}, Lwh/z0;->a()V

    :cond_1a
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->T2()Z

    move-result p1

    if-eqz p1, :cond_1b

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lwh/u0;->a:Lwh/u0;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_1b
    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    invoke-static {}, Lil/b;->a()Landroidx/lifecycle/f;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->k1()Z

    move-result p1

    if-eqz p1, :cond_1c

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->INSTANCE:Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_1c
    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object p1

    invoke-virtual {p1}, Lvi/h;->i()Z

    move-result p1

    if-eqz p1, :cond_1d

    new-instance p1, Ljava/util/ArrayList;

    invoke-static {}, Ljj/r;->l()Ljava/util/List;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v0

    invoke-virtual {v0}, Lvi/h;->g()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/roblox/client/datastructures/NameValuePair;

    const-string v2, "recipient_user_id"

    invoke-direct {v1, v2, v0}, Lcom/roblox/client/datastructures/NameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v0, "androidNotificationsSettings"

    const-string v1, "onAppForeground"

    invoke-static {v0, v1, p1, v3}, Lvg/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    :cond_1d
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/client/startup/a;->g(Landroid/content/Context;)V

    return-void
.end method

.method public onDestroy()V
    .locals 3

    invoke-static {}, Lak/k0;->B()Z

    move-result v0

    const-string v1, "rbx.main"

    if-eqz v0, :cond_0

    const-string v0, "onDestroy: App was previously destroyed due to process death"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

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

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setAppShellReloadNeededListener(Lcom/roblox/engine/jni/NativeGLJavaInterface$OnAppShellReloadNeededListener;)V

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setWebviewUserAgentGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;)V

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setMobileAdvertisingIdGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;)V

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lwh/s0;

    iget-object v1, v1, Lwh/s0;->a:Lwh/t0;

    sget-object v2, Lwh/t0;->a:Lwh/t0;

    if-ne v1, v2, :cond_1

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v1

    invoke-virtual {v1}, Lsg/y;->f()Lcom/roblox/client/game/c;

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

    invoke-static {p0}, Lak/k0;->s(Landroid/content/Context;)Lak/k0;

    move-result-object v1

    invoke-virtual {v1, p0}, Lak/k0;->S(Lak/n0;)V

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->b0:Lwg/c;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lwg/c;->e()V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->b0:Lwg/c;

    :cond_2
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->W1()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->i0:Ldk/h;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ldk/h;->b()V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->i0:Ldk/h;

    :cond_3
    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->o0:Ltg/a;

    invoke-virtual {v1}, Ltg/a;->f()V

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->j0:Lwh/i;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lwh/i;->q()V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->j0:Lwh/i;

    :cond_4
    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->k0:Lwh/z0;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lwh/z0;->b()V

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->k0:Lwh/z0;

    :cond_5
    invoke-super {p0}, Lcom/roblox/client/a;->onDestroy()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    sget-object v0, Lmk/h;->a:Lmk/h;

    invoke-virtual {v0, p2}, Lmk/h;->e(Landroid/view/KeyEvent;)Z

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

    sget-object v0, Lmk/h;->a:Lmk/h;

    invoke-virtual {v0, p2}, Lmk/h;->f(Landroid/view/KeyEvent;)Z

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

.method public onNavigateToConversationEvent(Lph/f;)V
    .locals 4
    .annotation runtime Lfv/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    iget-wide v0, p1, Lph/f;->b:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/ActivityNativeMain;->Z2(J)V

    return-void

    :cond_0
    iget-wide v0, p1, Lph/f;->a:J

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/ActivityNativeMain;->W2(J)V

    return-void
.end method

.method public onNavigateToFeatureEvent(Lph/g;)V
    .locals 13
    .annotation runtime Lfv/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NavigateToFeature: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lph/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "FRIEND_FINDER_TAG"

    iget-object v2, p1, Lph/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "UNIVERSAL_FRIENDS_TAG"

    iget-object v2, p1, Lph/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->G2()Lph/g;

    move-result-object p1

    :cond_1
    const-string v0, "PROFILE_TAG"

    iget-object v2, p1, Lph/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, Lsg/q0;->I:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    iget-object v2, p1, Lph/g;->b:Ljava/lang/String;

    iget-boolean v4, p1, Lph/g;->e:Z

    invoke-virtual {p1}, Lph/g;->f()Z

    move-result v5

    const/4 v6, 0x1

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lsg/q;->i(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    move-object v7, v1

    return-void

    :cond_2
    move-object v7, p0

    const-string v0, "GAME_DETAILS_TAG"

    iget-object v2, p1, Lph/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v2, "games/"

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lsg/a1;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lph/g;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget v1, Lsg/q0;->v:I

    iget-boolean v2, p1, Lph/g;->e:Z

    invoke-virtual {p1}, Lph/g;->f()Z

    move-result p1

    invoke-static {p0, v0, v1, v2, p1}, Lsg/q;->e(Landroid/app/Activity;Ljava/lang/String;IZZ)V

    return-void

    :cond_3
    const-string v0, "CUSTOM_WEBVIEW_TAG"

    iget-object v3, p1, Lph/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v3, "YOUTUBE_TAG"

    if-nez v0, :cond_f

    iget-object v0, p1, Lph/g;->a:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v0, "SOCIAL_MEDIA_TAG"

    iget-object v3, p1, Lph/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Lkm/a;

    invoke-direct {v0, v1}, Lkm/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lph/g;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lkm/a;->h(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_5
    const-string v0, "MY_FEED_TAG"

    iget-object v3, p1, Lph/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lsg/a1;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "feeds/inapp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget v1, Lsg/q0;->G:I

    iget-boolean v2, p1, Lph/g;->e:Z

    invoke-virtual {p1}, Lph/g;->f()Z

    move-result p1

    invoke-static {p0, v0, v1, v2, p1}, Lsg/q;->e(Landroid/app/Activity;Ljava/lang/String;IZZ)V

    return-void

    :cond_6
    const-string v0, "SEARCH_GAMES_TAG"

    iget-object v3, p1, Lph/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p1, Lph/g;->b:Ljava/lang/String;

    invoke-static {v0}, Lsg/a1;->G0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget v1, Lsg/q0;->J:I

    iget-boolean v2, p1, Lph/g;->e:Z

    invoke-virtual {p1}, Lph/g;->f()Z

    move-result p1

    invoke-static {p0, v0, v1, v2, p1}, Lsg/q;->e(Landroid/app/Activity;Ljava/lang/String;IZZ)V

    return-void

    :cond_7
    const-string v0, "GAMES_SEE_ALL_TAG"

    iget-object v3, p1, Lph/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p1, Lph/g;->b:Ljava/lang/String;

    invoke-static {v0}, Lsg/a1;->A(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget v1, Lsg/q0;->D:I

    iget-boolean v2, p1, Lph/g;->e:Z

    invoke-virtual {p1}, Lph/g;->f()Z

    move-result p1

    invoke-static {p0, v0, v1, v2, p1}, Lsg/q;->e(Landroid/app/Activity;Ljava/lang/String;IZZ)V

    return-void

    :cond_8
    const-string v0, "ABUSE_REPORT_TAG"

    iget-object v3, p1, Lph/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p1, Lph/g;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lph/g;->f()Z

    move-result p1

    invoke-static {p0, v0, p1}, Lsg/q;->d(Landroid/app/Activity;Ljava/lang/String;Z)V

    return-void

    :cond_9
    const-string v0, "ANIMATED_ASSET_DETAILS_TAG"

    iget-object v3, p1, Lph/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p1, Lph/g;->b:Ljava/lang/String;

    if-eqz v0, :cond_a

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lsg/a1;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "catalog/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lph/g;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v8, v0

    goto :goto_1

    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lsg/a1;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :goto_1
    sget v0, Lsg/q0;->M:I

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    iget-boolean v10, p1, Lph/g;->e:Z

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-static/range {v7 .. v12}, Lsg/q;->i(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    return-void

    :cond_b
    const-string v0, "CAPTCHA_SUCCESS_TAG"

    iget-object v2, p1, Lph/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    const-string p1, "NavigateToFeature: Received \'CAPTCHA_SUCCESS\' tag. Do nothing for now."

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_c
    const-string v0, "CAPTCHA_TAG"

    iget-object v1, p1, Lph/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {p1}, Lph/g;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/roblox/client/ActivityNativeMain;->c3(Ljava/lang/String;)V

    return-void

    :cond_d
    const-string v0, "SCAN_QR_CODE"

    iget-object v1, p1, Lph/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    iget p1, v7, Lcom/roblox/client/ActivityNativeMain;->Z:I

    invoke-static {p0, p1}, Lrj/f;->f(Le4/q;I)V

    return-void

    :cond_e
    iget-object v0, p1, Lph/g;->a:Ljava/lang/String;

    invoke-static {p0, v0}, Lrh/b;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object p1, p1, Lph/g;->b:Ljava/lang/String;

    invoke-direct {p0, v0, p1}, Lcom/roblox/client/ActivityNativeMain;->Y2(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_f
    :goto_2
    const/4 v0, 0x0

    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lph/g;->d()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    const-string v2, "Exception parsing data onNavigateToFeatureEvent CUSTOM_WEBVIEW_TAG"

    invoke-static {v1, v2}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

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

    iget-object v6, p1, Lph/g;->a:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-static {}, Lsg/a1;->q0()Z

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

    invoke-static {v1, p1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :cond_11
    iget-boolean p1, p1, Lph/g;->e:Z

    if-nez p1, :cond_12

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-static {p0, v5, v4, p1, v0}, Lsg/q;->h(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZZ)V

    goto :goto_4

    :cond_12
    const-string p1, "searchParams"

    invoke-virtual {v2, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_13
    invoke-static {p0, v5, v4, v0}, Lsg/q;->g(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    :cond_14
    const-string p1, "URL must not be empty onNavigateToFeatureEvent CUSTOM_WEBVIEW_TAG"

    invoke-static {v1, p1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    :cond_15
    :goto_4
    return-void
.end method

.method public onNavigateToLuaEvent(Lcom/roblox/client/c$h;)V
    .locals 0
    .annotation runtime Lfv/j;
    .end annotation

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->e()V

    return-void
.end method

.method public onPause()V
    .locals 3

    invoke-super {p0}, Lcom/roblox/client/a;->onPause()V

    const-string v0, "onPause"

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lem/a;->k()Lem/a;

    move-result-object v0

    invoke-virtual {v0}, Lem/a;->m()V

    invoke-static {}, Ljm/a;->j()Ljm/a;

    move-result-object v0

    sget-object v2, Ljm/a$a;->b:Ljm/a$a;

    invoke-virtual {v0, v2}, Ljm/a;->b(Ljm/a$a;)V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->l3()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->D2()V

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->e4()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "onPause: NotificationManager removerObserver"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lvi/e;->c()Lvi/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Lvi/e;->g(Lvi/e$e;)V

    :cond_1
    invoke-static {}, Lyl/c;->i()Lyl/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lyl/c;->k(Landroid/content/Context;)V

    const-string v0, "onAppBackground"

    invoke-static {v0}, Lsg/t0;->k(Ljava/lang/String;)V

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

    invoke-super {p0, p1, p2, p3}, Le4/q;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->k()Lom/k;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lom/k;->Q(I[Ljava/lang/String;[I)V

    return-void
.end method

.method public onResume()V
    .locals 5

    invoke-super {p0}, Lcom/roblox/client/a;->onResume()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onResume: IsLoggedIn = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v1

    invoke-virtual {v1}, Lvi/h;->f()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lyl/c;->i()Lyl/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lyl/c;->j(Landroid/content/Context;)V

    invoke-static {}, Lqi/b;->f()Lqi/b;

    move-result-object v0

    invoke-virtual {v0}, Lqi/b;->j()Lqi/f;

    move-result-object v0

    iget-object v2, p0, Lcom/roblox/client/ActivityNativeMain;->a0:Lqi/f;

    if-eq v2, v0, :cond_0

    iput-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->a0:Lqi/f;

    const-string v0, "onResume: Recreating activity due to Locale change."

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroid/app/Activity;->recreate()V

    return-void

    :cond_0
    invoke-static {p0}, Lak/k0;->s(Landroid/content/Context;)Lak/k0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lak/k0;->N(Lak/n0;)V

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->f()Lcom/roblox/client/game/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/game/c;->i()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->q3()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lwh/s0;

    iget-object v0, v0, Lwh/s0;->a:Lwh/t0;

    sget-object v3, Lwh/t0;->a:Lwh/t0;

    if-ne v0, v3, :cond_2

    invoke-static {}, Ljj/r;->k()Ljj/r;

    move-result-object v0

    invoke-virtual {v0}, Ljj/r;->u()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->f()Lcom/roblox/client/game/c;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roblox/client/game/c;->g(Z)V

    :cond_2
    :goto_0
    iget-boolean v0, p0, Lcom/roblox/client/ActivityNativeMain;->h0:Z

    if-eqz v0, :cond_3

    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object v0

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lwh/f;->B(Z)V

    iput-boolean v2, p0, Lcom/roblox/client/ActivityNativeMain;->h0:Z

    :cond_3
    invoke-static {}, Lsg/a1;->l0()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roblox/client/ActivityNativeMain;->z2(Landroid/content/res/Configuration;)V

    :cond_4
    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->k()Lom/k;

    move-result-object v0

    invoke-virtual {v0, p0}, Lom/k;->d0(Landroid/app/Activity;)V

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->k()Lom/k;

    move-result-object v0

    invoke-virtual {v0}, Lom/k;->c0()V

    invoke-static {}, Lem/a;->k()Lem/a;

    move-result-object v0

    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/roblox/client/ShareAppChosenReceiver;

    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance v3, Lsg/i;

    invoke-direct {v3, p0}, Lsg/i;-><init>(Lcom/roblox/client/ActivityNativeMain;)V

    const/16 v4, 0x4e9c

    invoke-virtual {v0, p0, v2, v4, v3}, Lem/a;->l(Lj/b;Landroid/content/Intent;ILem/a$g;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->b2()Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "Setting result launcher for IdentityProtocol"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->g()Lim/f;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/ActivityNativeMain;->g0:Lg/c;

    invoke-virtual {v0, v1}, Lim/f;->y(Lg/c;)V

    :cond_5
    invoke-static {}, Lgk/t;->e()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->e()Lbm/r;

    move-result-object v0

    invoke-virtual {v0, p0}, Lbm/r;->x(Landroid/app/Activity;)V

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

    invoke-static {}, Ljm/a;->j()Ljm/a;

    move-result-object v0

    invoke-virtual {v0}, Ljm/a;->g()V

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->d0:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    invoke-virtual {v0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->b()V

    invoke-virtual {p0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    sput-object v0, Lsg/e2;->a:Landroid/util/DisplayMetrics;

    sget v0, Lcom/roblox/client/a;->R:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lwh/s0;

    iget-object v0, v0, Lwh/s0;->a:Lwh/t0;

    sget-object v1, Lwh/t0;->b:Lwh/t0;

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/roblox/engine/jni/NativeReportingInterface;->applicationForegrounded()V

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->C5()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "rbx.main"

    const-string v1, "onStart: App is going to foreground. setAppSuspended(false)"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeReportingInterface;->setAppSuspended(Z)V

    :cond_1
    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lfv/c;->n(Ljava/lang/Object;)V

    invoke-static {}, Lwk/h;->h()Lwk/h;

    move-result-object v0

    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwk/h;->i(Lwk/h$d;)V

    const-string v0, "main"

    invoke-static {v0}, Lsg/t0;->v(Ljava/lang/String;)V

    invoke-static {}, Lhm/b;->h()Lhm/b;

    move-result-object v0

    invoke-virtual {v0}, Lhm/b;->e()V

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lwh/s0;

    iget-object v0, v0, Lwh/s0;->a:Lwh/t0;

    sget-object v1, Lwh/t0;->a:Lwh/t0;

    if-ne v0, v1, :cond_2

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->f()Lcom/roblox/client/game/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/game/c;->p()V

    :cond_2
    invoke-static {}, Lpm/a;->c()Lpm/a;

    move-result-object v0

    invoke-virtual {v0}, Lpm/a;->a()V

    return-void
.end method

.method public onStop()V
    .locals 4

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lfv/c;->p(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->d0:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    invoke-virtual {v0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->a()V

    sget v0, Lcom/roblox/client/a;->R:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lwh/s0;

    iget-object v0, v0, Lwh/s0;->a:Lwh/t0;

    sget-object v2, Lwh/t0;->b:Lwh/t0;

    if-ne v0, v2, :cond_0

    invoke-static {}, Lcom/roblox/engine/jni/NativeReportingInterface;->applicationBackgrounded()V

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->C5()Z

    move-result v0

    const-string v2, "rbx.main"

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lwh/s0;

    iget-object v0, v0, Lwh/s0;->a:Lwh/t0;

    sget-object v3, Lwh/t0;->b:Lwh/t0;

    if-ne v0, v3, :cond_1

    const-string v0, "onStop: App is going to background. setAppSuspended(true)"

    invoke-static {v2, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v1}, Lcom/roblox/engine/jni/NativeReportingInterface;->setAppSuspended(Z)V

    :cond_1
    invoke-static {}, Lwk/h;->h()Lwk/h;

    move-result-object v0

    invoke-static {}, Lwh/f;->j()Lwh/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwk/h;->j(Lwk/h$d;)V

    invoke-static {}, Lhm/b;->h()Lhm/b;

    move-result-object v0

    invoke-virtual {v0}, Lhm/b;->f()V

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lwh/s0;

    iget-object v0, v0, Lwh/s0;->a:Lwh/t0;

    sget-object v1, Lwh/t0;->a:Lwh/t0;

    if-ne v0, v1, :cond_2

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->f()Lcom/roblox/client/game/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roblox/client/game/c;->n()V

    :cond_2
    invoke-static {}, Lpm/a;->c()Lpm/a;

    move-result-object v0

    invoke-virtual {v0}, Lpm/a;->b()V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->e4()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "onStop: NotificationManager removerObserver"

    invoke-static {v2, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lvi/e;->c()Lvi/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Lvi/e;->g(Lvi/e$e;)V

    :cond_3
    invoke-super {p0}, Lcom/roblox/client/a;->onStop()V

    const-string v0, "onStop"

    invoke-static {v2, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 1

    invoke-super {p0, p1}, Lcom/roblox/client/b;->onTrimMemory(I)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->O2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lvg/c0;->s(I)V

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lwh/s0;

    invoke-virtual {v0, p1}, Lwh/s0;->j(I)V

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

    sget p1, Lsg/g0;->b:I

    sget v0, Lsg/g0;->c:I

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method public final q3()V
    .locals 2

    const-string v0, "startup:"

    const-string v1, "rbx.main"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0}, Lak/k0;->s(Landroid/content/Context;)Lak/k0;

    move-result-object v0

    invoke-virtual {v0}, Lak/k0;->v()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v0

    invoke-virtual {v0}, Lvi/h;->f()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/roblox/client/startup/a;->m()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lgk/t;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Incomplete initialization, restarting app"

    invoke-static {v1, v0}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/roblox/client/startup/StartedForEnum;->SHELL_PROCESS_RESTART:Lcom/roblox/client/startup/StartedForEnum;

    invoke-static {p0, v0}, Lcom/roblox/client/startup/ActivitySplash;->o2(Landroid/content/Context;Lcom/roblox/client/startup/StartedForEnum;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/roblox/client/ActivityNativeMain;->finish()V

    return-void

    :cond_0
    invoke-static {p0}, Lak/k0;->s(Landroid/content/Context;)Lak/k0;

    move-result-object v0

    invoke-virtual {v0}, Lak/k0;->Q()V

    return-void
.end method

.method public r(Ljava/lang/String;)Landroidx/fragment/app/c;
    .locals 1

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentManager;->n0(Ljava/lang/String;)Landroidx/fragment/app/c;

    move-result-object p1

    return-object p1
.end method

.method public r3(Lwh/t0;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lwh/s0;

    invoke-virtual {v0, p1}, Lwh/s0;->k(Lwh/t0;)V

    return-void
.end method

.method public final z2(Landroid/content/res/Configuration;)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain;->f0:Lwh/s0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lwh/s0;->a:Lwh/t0;

    sget-object v1, Lwh/t0;->a:Lwh/t0;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0, p1}, Lsg/c2;->a(Landroid/view/Window;Landroid/content/res/Configuration;)V

    return-void
.end method
