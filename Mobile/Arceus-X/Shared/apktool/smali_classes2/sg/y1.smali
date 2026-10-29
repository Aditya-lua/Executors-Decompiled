.class public Lsg/y1;
.super Landroidx/fragment/app/c;
.source "SourceFile"

# interfaces
.implements Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsg/y1$h;,
        Lsg/y1$i;,
        Lsg/y1$g;
    }
.end annotation


# instance fields
.field public final A0:Lej/j;

.field public final B0:Lej/j;

.field public f0:Landroid/widget/TextView;

.field public g0:Lcom/roblox/client/hybrid/RBHybridWebView;

.field public h0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

.field public i0:Ljava/lang/String;

.field public j0:I

.field public k0:I

.field public l0:Ljava/lang/String;

.field public m0:Ljava/lang/String;

.field public n0:Landroid/app/ProgressDialog;

.field public o0:Landroid/widget/FrameLayout;

.field public p0:Z

.field public q0:Landroid/webkit/ValueCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field public r0:Z

.field public s0:Z

.field public t0:Landroid/widget/ImageView;

.field public u0:Z

.field public v0:Z

.field public w0:Lil/c;

.field public x0:Ljava/lang/String;

.field public final y0:Lej/j;

.field public final z0:Lej/j;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/fragment/app/c;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lsg/y1;->f0:Landroid/widget/TextView;

    iput-object v0, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    iput-object v0, p0, Lsg/y1;->h0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iput-object v0, p0, Lsg/y1;->i0:Ljava/lang/String;

    const/4 v1, 0x0

    iput v1, p0, Lsg/y1;->j0:I

    iput v1, p0, Lsg/y1;->k0:I

    iput-object v0, p0, Lsg/y1;->l0:Ljava/lang/String;

    iput-boolean v1, p0, Lsg/y1;->r0:Z

    iput-boolean v1, p0, Lsg/y1;->s0:Z

    iput-boolean v1, p0, Lsg/y1;->u0:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lsg/y1;->v0:Z

    sget-object v1, Lil/b;->c:Lil/c;

    iput-object v1, p0, Lsg/y1;->w0:Lil/c;

    iput-object v0, p0, Lsg/y1;->x0:Ljava/lang/String;

    new-instance v0, Lsg/y1$b;

    invoke-direct {v0, p0}, Lsg/y1$b;-><init>(Lsg/y1;)V

    iput-object v0, p0, Lsg/y1;->y0:Lej/j;

    new-instance v0, Lsg/y1$c;

    invoke-direct {v0, p0}, Lsg/y1$c;-><init>(Lsg/y1;)V

    iput-object v0, p0, Lsg/y1;->z0:Lej/j;

    new-instance v0, Lsg/y1$d;

    invoke-direct {v0, p0}, Lsg/y1$d;-><init>(Lsg/y1;)V

    iput-object v0, p0, Lsg/y1;->A0:Lej/j;

    new-instance v0, Lsg/y1$e;

    invoke-direct {v0, p0}, Lsg/y1$e;-><init>(Lsg/y1;)V

    iput-object v0, p0, Lsg/y1;->B0:Lej/j;

    return-void
.end method

.method private C2(Ljava/lang/String;Z)V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p2}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lsg/t1;

    invoke-direct {v0, p0, p2, p1}, Lsg/t1;-><init>(Lsg/y1;Le4/q;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private H2(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "mailto:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SENDTO"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    goto :goto_0

    :cond_0
    const-string v0, "tel:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.DIAL"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    const/4 p1, 0x0

    return p1

    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lgk/t;->a(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result p1

    const/4 v1, 0x1

    if-eqz p1, :cond_3

    invoke-virtual {p0, v0}, Landroidx/fragment/app/c;->X1(Landroid/content/Intent;)V

    return v1

    :cond_3
    :try_start_0
    invoke-virtual {p0}, Lsg/y1;->D2()Lcom/roblox/client/a;

    move-result-object p1

    sget v0, Lsg/q0;->U:I

    invoke-virtual {p1, v0, v1}, Lcom/roblox/client/b;->K1(II)V
    :try_end_0
    .catch Lsg/u0; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    invoke-static {}, Lsg/y1;->U2()V

    :goto_1
    return v1
.end method

.method private I2()V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lsg/r1;

    invoke-direct {v1, p0, v0}, Lsg/r1;-><init>(Lsg/y1;Le4/q;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method private synthetic K2(Le4/q;Landroid/content/DialogInterface;)V
    .locals 0

    iget-object p2, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p2}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Le/p;->onBackPressed()V

    :cond_0
    return-void
.end method

.method private synthetic L2(Le4/q;Ljava/lang/String;)V
    .locals 3

    new-instance v0, Landroidx/appcompat/app/a$a;

    invoke-direct {v0, p1}, Landroidx/appcompat/app/a$a;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/a$a;->d(Z)Landroidx/appcompat/app/a$a;

    move-result-object v0

    sget v1, Lsg/q0;->p0:I

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/a$a;->p(I)Landroidx/appcompat/app/a$a;

    move-result-object v0

    sget v1, Lsg/q0;->o0:I

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/a$a;->g(I)Landroidx/appcompat/app/a$a;

    move-result-object v0

    sget v1, Lsg/q0;->r:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/a$a;->i(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/a$a;

    move-result-object v0

    sget v1, Lsg/q0;->s:I

    new-instance v2, Lsg/v1;

    invoke-direct {v2, p1, p2}, Lsg/v1;-><init>(Le4/q;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/a$a;->m(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/a$a;

    move-result-object p2

    new-instance v0, Lsg/w1;

    invoke-direct {v0, p0, p1}, Lsg/w1;-><init>(Lsg/y1;Le4/q;)V

    invoke-virtual {p2, v0}, Landroidx/appcompat/app/a$a;->k(Landroid/content/DialogInterface$OnDismissListener;)Landroidx/appcompat/app/a$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/a$a;->r()Landroidx/appcompat/app/a;

    return-void
.end method

.method private synthetic M2(Le4/q;Lej/k;)V
    .locals 1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lsg/y1;->I2()V

    invoke-direct {p0, p2}, Lsg/y1;->e3(Lej/k;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private synthetic N2(Le4/q;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lsg/y1;->f0:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static U2()V
    .locals 2

    const-string v0, "roblox.app"

    const-string v1, "The activity containing this fragment must be of type RobloxActivity!"

    invoke-static {v0, v1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private V2(Ljava/lang/String;)Z
    .locals 2

    new-instance v0, Lzj/b;

    const-string v1, "rbx.web"

    invoke-direct {v0, v1}, Lzj/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lzj/b;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p1}, Lzj/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private a3(Ljava/lang/String;)V
    .locals 3

    sget-object v0, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    iget-object v1, p0, Lsg/y1;->x0:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->isKnownTrustedDomain(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lsg/y1;->C2(Ljava/lang/String;Z)V

    return-void

    :cond_0
    iget-object v1, p0, Lsg/y1;->x0:Ljava/lang/String;

    new-instance v2, Lsg/s1;

    invoke-direct {v2, p0, p1}, Lsg/s1;-><init>(Lsg/y1;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1, v2}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->checkDomainAllowList(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/protocols/webview/DomainAllowListChecker$Callback;)V

    return-void
.end method

.method public static synthetic b2(Lsg/y1;Le4/q;Lej/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lsg/y1;->M2(Le4/q;Lej/k;)V

    return-void
.end method

.method public static synthetic c2(Lsg/y1;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lsg/y1;->Q2(Landroid/view/View;)V

    return-void
.end method

.method private c3(Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "sponsored"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    return-void

    :cond_0
    iget-object p1, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    return-void
.end method

.method public static synthetic d2(Lsg/y1;Le4/q;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lsg/y1;->K2(Le4/q;Landroid/content/DialogInterface;)V

    return-void
.end method

.method private d3()V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lsg/x1;

    invoke-direct {v1, p0, v0}, Lsg/x1;-><init>(Lsg/y1;Le4/q;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public static synthetic e2(Lsg/y1;Le4/q;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lsg/y1;->L2(Le4/q;Ljava/lang/String;)V

    return-void
.end method

.method private e3(Lej/k;)V
    .locals 4

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->m5()Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, Lej/f;

    invoke-interface {v1}, Lej/f;->a()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->M0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isBonusItemEnabled = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "rbx.web"

    invoke-static {v3, v2}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1, v0}, Lej/k;->c(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1}, Lej/k;->f()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0, v0}, Lsg/y1;->y2(Ljava/lang/CharSequence;)V

    return-void

    :cond_2
    if-eqz v1, :cond_3

    :try_start_0
    sget p1, Lsg/q0;->u1:I

    invoke-virtual {p0, p1}, Landroidx/fragment/app/c;->e0(I)Ljava/lang/String;

    move-result-object p1

    sget v0, Lsg/q0;->t1:I

    invoke-virtual {p0, v0}, Landroidx/fragment/app/c;->e0(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lsg/y1;->D2()Lcom/roblox/client/a;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lcom/roblox/client/b;->F1(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    invoke-virtual {p0}, Lsg/y1;->D2()Lcom/roblox/client/a;

    move-result-object p1

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/roblox/client/b;->W(Ljava/lang/String;)V
    :try_end_0
    .catch Lsg/u0; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-static {}, Lsg/y1;->U2()V

    return-void
.end method

.method public static synthetic f2(Le4/q;Ljava/lang/String;Landroid/content/DialogInterface;I)V
    .locals 0

    new-instance p2, Lkm/a;

    const-string p3, "rbx.web"

    invoke-direct {p2, p3}, Lkm/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0, p1, p1}, Lkm/a;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic g2(Lsg/y1;Le4/q;)V
    .locals 0

    invoke-virtual {p0, p1}, Lsg/y1;->O2(Le4/q;)V

    return-void
.end method

.method public static synthetic h2(Lsg/y1;ILandroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lsg/y1;->R2(ILandroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i2(Lsg/y1;Le4/q;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lsg/y1;->N2(Le4/q;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic j2(Lsg/y1;Ljava/lang/String;Lcom/roblox/protocols/webview/DomainAllowListChecker$a;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lsg/y1;->P2(Ljava/lang/String;Lcom/roblox/protocols/webview/DomainAllowListChecker$a;)V

    return-void
.end method

.method public static synthetic k2(Lsg/y1;Le4/q;)V
    .locals 0

    invoke-virtual {p0, p1}, Lsg/y1;->S2(Le4/q;)V

    return-void
.end method

.method public static bridge synthetic l2(Lsg/y1;)Z
    .locals 0

    iget-boolean p0, p0, Lsg/y1;->p0:Z

    return p0
.end method

.method public static bridge synthetic m2(Lsg/y1;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;
    .locals 0

    iget-object p0, p0, Lsg/y1;->h0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    return-object p0
.end method

.method public static bridge synthetic n2(Lsg/y1;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lsg/y1;->f0:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic o2(Lsg/y1;)Lsg/y1$h;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic p2(Lsg/y1;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, Lsg/y1;->H2(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic q2(Lsg/y1;)V
    .locals 0

    invoke-direct {p0}, Lsg/y1;->I2()V

    return-void
.end method

.method public static bridge synthetic r2(Lsg/y1;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, Lsg/y1;->V2(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic s2(Lsg/y1;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lsg/y1;->a3(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic t2(Lsg/y1;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lsg/y1;->c3(Ljava/lang/String;Z)V

    return-void
.end method

.method public static bridge synthetic u2(Lsg/y1;)V
    .locals 0

    invoke-direct {p0}, Lsg/y1;->d3()V

    return-void
.end method

.method public static bridge synthetic v2()V
    .locals 0

    invoke-static {}, Lsg/y1;->U2()V

    return-void
.end method

.method private w2(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lsg/u1;

    invoke-direct {v1, p0, v0, p1}, Lsg/u1;-><init>(Lsg/y1;Le4/q;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private declared-synchronized y2(Ljava/lang/CharSequence;)V
    .locals 8

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    new-instance v0, Landroidx/appcompat/app/a$a;

    invoke-direct {v0, v1}, Landroidx/appcompat/app/a$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroidx/appcompat/app/a$a;->a()Landroidx/appcompat/app/a;

    move-result-object v6

    new-instance v7, Landroid/widget/TextView;

    invoke-direct {v7, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    sget v0, Lsg/q0;->W:I

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    add-int v5, v4, v0

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lhk/c;

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lhk/c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    const/4 v1, 0x1

    new-array v2, v1, [Lhk/a;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v7, p1, v2}, Lhk/b;->b(Landroid/widget/TextView;Ljava/lang/String;[Lhk/a;)V

    const/high16 p1, 0x41a00000    # 20.0f

    invoke-virtual {v7, p1}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 p1, 0x0

    invoke-virtual {v7, p1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    move-object v2, v6

    const/16 v6, 0x96

    move-object v3, v7

    const/16 v7, 0x64

    const/16 v4, 0x96

    const/16 v5, 0x64

    invoke-virtual/range {v2 .. v7}, Landroidx/appcompat/app/a;->w(Landroid/view/View;IIII)V

    invoke-virtual {v2, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v2}, Landroid/app/Dialog;->show()V
    :try_end_2
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :catch_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method private z2(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/ProgressDialog;
    .locals 1

    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p2}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, p3}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    return-object v0
.end method


# virtual methods
.method public A0(IILandroid/content/Intent;)V
    .locals 1

    const/16 v0, 0x4e9b

    if-ne p1, v0, :cond_1

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    filled-new-array {p1}, [Landroid/net/Uri;

    move-result-object p1

    iget-object p2, p0, Lsg/y1;->q0:Landroid/webkit/ValueCallback;

    invoke-interface {p2, p1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    return-void

    :cond_0
    const-string p1, "rbx.web"

    const-string p2, "Result of file chooser invalid."

    invoke-static {p1, p2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lsg/y1;->q0:Landroid/webkit/ValueCallback;

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public A2()Lcom/roblox/client/hybrid/RBHybridWebView;
    .locals 2

    iget-boolean v0, p0, Lsg/y1;->r0:Z

    if-eqz v0, :cond_0

    new-instance v0, Lii/a;

    invoke-virtual {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lii/a;-><init>(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/roblox/client/hybrid/RBHybridWebView;-><init>(Landroid/content/Context;)V

    :goto_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->S1()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Lsg/a1;->O()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwk/e;->r(Ljava/lang/String;)V

    :cond_1
    return-object v0
.end method

.method public B2()V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    invoke-virtual {v0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->a1()V

    :cond_0
    return-void
.end method

.method public D2()Lcom/roblox/client/a;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    instance-of v1, v0, Lcom/roblox/client/a;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/roblox/client/a;

    return-object v0

    :cond_0
    new-instance v0, Lsg/u0;

    invoke-direct {v0}, Lsg/u0;-><init>()V

    throw v0
.end method

.method public E2(Ljava/lang/String;Z)Z
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->t()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    return p1

    :cond_0
    return p2
.end method

.method public F0(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Landroidx/fragment/app/c;->F0(Landroid/os/Bundle;)V

    invoke-static {}, Luk/b;->a()Lfv/c;

    move-result-object p1

    invoke-virtual {p1, p0}, Lfv/c;->n(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/fragment/app/c;->t()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v0, "DEFAULT_URL"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCreate: default-URL = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "rbx.web"

    invoke-static {v3, v2}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v0, :cond_0

    iput-object v0, p0, Lsg/y1;->l0:Ljava/lang/String;

    iget-object v2, p0, Lsg/y1;->i0:Ljava/lang/String;

    if-nez v2, :cond_0

    iput-object v0, p0, Lsg/y1;->i0:Ljava/lang/String;

    sget-object v2, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    invoke-virtual {v2}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->enableDomainAllowListChecker()Z

    move-result v2

    if-eqz v2, :cond_0

    iput-object v0, p0, Lsg/y1;->x0:Ljava/lang/String;

    :cond_0
    const-string v0, "WEB_VIEW_TAG"

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lsg/y1;->m0:Ljava/lang/String;

    const-string v0, "USE_APP_HYBRID"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lsg/y1;->r0:Z

    :cond_1
    return-void
.end method

.method public F2()Ljava/lang/String;
    .locals 1

    const-string v0, "undefinedWebContext"

    return-object v0
.end method

.method public G2()Z
    .locals 2

    iget-object v0, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v1}, Lsg/y1;->c3(Ljava/lang/String;Z)V

    iget-object v0, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p3

    invoke-interface {p3}, Lth/i;->D0()Z

    move-result p3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p3, :cond_0

    const-string p3, "hideNativeHeader"

    invoke-virtual {p0, p3, v1}, Lsg/y1;->E2(Ljava/lang/String;Z)Z

    move-result p3

    if-eqz p3, :cond_0

    move p3, v0

    goto :goto_0

    :cond_0
    move p3, v1

    :goto_0
    iput-boolean p3, p0, Lsg/y1;->s0:Z

    if-eqz p3, :cond_1

    sget p3, Lsg/n0;->n:I

    goto :goto_1

    :cond_1
    sget p3, Lsg/n0;->m:I

    :goto_1
    invoke-virtual {p1, p3, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    sget p2, Lsg/m0;->i0:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/view/ViewGroup;

    sget v2, Lsg/m0;->v0:I

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lsg/y1;->f0:Landroid/widget/TextView;

    new-instance v2, Lsg/y1$i;

    invoke-direct {v2, p0}, Lsg/y1$i;-><init>(Lsg/y1;)V

    invoke-virtual {p0}, Lsg/y1;->A2()Lcom/roblox/client/hybrid/RBHybridWebView;

    move-result-object v3

    iput-object v3, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v3

    invoke-interface {v3}, Lth/i;->k2()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    new-instance v4, Lsg/x;

    invoke-direct {v4}, Lsg/x;-><init>()V

    invoke-virtual {v3, v4}, Ltk/d;->setCommandListener(Ltk/d$b;)V

    :cond_2
    iget-object v3, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    const/4 v5, -0x1

    invoke-direct {v4, v5, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p3, v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p3, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    iget-object v3, p0, Lsg/y1;->m0:Ljava/lang/String;

    invoke-virtual {p3, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    iget-object p3, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p3, v2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    iget-object p3, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p3}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p3

    invoke-virtual {p3, v0}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    iget-object p3, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    new-instance v2, Lsg/y1$a;

    invoke-direct {v2, p0}, Lsg/y1$a;-><init>(Lsg/y1;)V

    invoke-virtual {p3, v2}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    iget-object p3, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p3}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p3

    invoke-virtual {p3, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    iget-object p3, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p3}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p3

    invoke-virtual {p3, v0}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    iget-object p3, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p3}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p3

    invoke-static {}, Lsg/a1;->Z0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    iget-object p3, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p3}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p3

    invoke-virtual {p3, v5}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    iget-object p3, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p3, v1}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    iget-object p3, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p3, v1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    invoke-static {}, Lnh/b;->a()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {v0}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    :cond_3
    iget-object p3, p0, Lsg/y1;->i0:Ljava/lang/String;

    if-eqz p3, :cond_5

    sget-object p3, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    invoke-virtual {p3}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->enableDomainAllowListChecker()Z

    move-result p3

    if-eqz p3, :cond_4

    iget-object p3, p0, Lsg/y1;->i0:Ljava/lang/String;

    invoke-direct {p0, p3}, Lsg/y1;->a3(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    iget-object p3, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    iget-object v2, p0, Lsg/y1;->i0:Ljava/lang/String;

    invoke-virtual {p3, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :goto_2
    const/4 p3, 0x0

    iput-object p3, p0, Lsg/y1;->i0:Ljava/lang/String;

    :cond_5
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    iput-object p2, p0, Lsg/y1;->h0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-virtual {p2, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;)V

    iget-object p2, p0, Lsg/y1;->h0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    sget p3, Lsg/j0;->b:I

    sget v2, Lsg/j0;->q:I

    filled-new-array {p3, p3, v2, v2}, [I

    move-result-object p3

    invoke-virtual {p2, p3}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setColorSchemeResources([I)V

    sget p2, Lsg/m0;->j0:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/FrameLayout;

    iput-object p2, p0, Lsg/y1;->o0:Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Landroidx/fragment/app/c;->t()Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_7

    const-string p3, "dialogHeight"

    invoke-virtual {p2, p3, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p3

    iput p3, p0, Lsg/y1;->j0:I

    const-string p3, "dialogWidth"

    invoke-virtual {p2, p3, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p3

    iput p3, p0, Lsg/y1;->k0:I

    const-string p3, "enablePullToRefresh"

    invoke-virtual {p2, p3, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p3

    if-nez p3, :cond_6

    iget-object p3, p0, Lsg/y1;->h0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-virtual {p3, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    :cond_6
    const-string p3, "USING_LOGIN_WEB_URL"

    invoke-virtual {p2, p3, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p3

    iput-boolean p3, p0, Lsg/y1;->p0:Z

    const-string p3, "VISIBLE"

    invoke-virtual {p2, p3, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p3

    iput-boolean p3, p0, Lsg/y1;->v0:Z

    const-string p3, "BACK_NAVIGATION_DISABLED"

    invoke-virtual {p2, p3, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    iput-boolean p2, p0, Lsg/y1;->u0:Z

    :cond_7
    :try_start_0
    invoke-virtual {p0}, Lsg/y1;->D2()Lcom/roblox/client/a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/roblox/client/a;->N1()Z
    :try_end_0
    .catch Lsg/u0; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    invoke-static {}, Lsg/y1;->U2()V

    :goto_3
    iget-object p2, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p2}, Lcom/roblox/client/hybrid/RBHybridWebView;->h()V

    iget-boolean p2, p0, Lsg/y1;->s0:Z

    if-eqz p2, :cond_8

    invoke-virtual {p0, p1}, Lsg/y1;->b3(Landroid/view/View;)V

    :cond_8
    return-object p1
.end method

.method public J2()Z
    .locals 1

    iget-boolean v0, p0, Lsg/y1;->u0:Z

    return v0
.end method

.method public K0()V
    .locals 1

    invoke-static {}, Luk/b;->a()Lfv/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lfv/c;->p(Ljava/lang/Object;)V

    invoke-super {p0}, Landroidx/fragment/app/c;->K0()V

    return-void
.end method

.method public M0()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/c;->M0()V

    iget-object v0, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v0}, Lcom/roblox/client/hybrid/RBHybridWebView;->i()V

    return-void
.end method

.method public final synthetic O2(Le4/q;)V
    .locals 1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lsg/y1;->n0:Landroid/app/ProgressDialog;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lsg/y1;->n0:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    :cond_1
    :goto_0
    return-void
.end method

.method public P0(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/c;->P0(Z)V

    if-nez p1, :cond_0

    invoke-static {}, Lvh/m;->b()Lvh/m;

    move-result-object p1

    iget-object v0, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lvh/m;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->reload()V

    :cond_0
    return-void
.end method

.method public final synthetic P2(Ljava/lang/String;Lcom/roblox/protocols/webview/DomainAllowListChecker$a;)V
    .locals 2

    sget-object v0, Lsg/y1$f;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v1, 0x2

    if-eq p2, v1, :cond_1

    const/4 v0, 0x3

    if-eq p2, v0, :cond_0

    const/4 v0, 0x4

    if-eq p2, v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lsg/y1;->w2(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-direct {p0, p1, v0}, Lsg/y1;->C2(Ljava/lang/String;Z)V

    return-void

    :cond_2
    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lsg/y1;->C2(Ljava/lang/String;Z)V

    return-void
.end method

.method public final synthetic Q2(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lsg/y1;->B2()V

    return-void
.end method

.method public final synthetic R2(ILandroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 1

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->systemBars()I

    move-result p2

    invoke-virtual {p3, p2}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object p2

    iget-object v0, p0, Lsg/y1;->t0:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    iget p2, p2, Landroidx/core/graphics/Insets;->top:I

    add-int/2addr p1, p2

    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    iget-object p1, p0, Lsg/y1;->t0:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object p3
.end method

.method public final synthetic S2(Le4/q;)V
    .locals 2

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lsg/y1;->n0:Landroid/app/ProgressDialog;

    if-nez v0, :cond_1

    sget v0, Lsg/q0;->P:I

    invoke-virtual {p0, v0}, Landroidx/fragment/app/c;->e0(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0}, Lsg/y1;->z2(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/ProgressDialog;

    move-result-object p1

    iput-object p1, p0, Lsg/y1;->n0:Landroid/app/ProgressDialog;

    :cond_1
    iget-object p1, p0, Lsg/y1;->n0:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    :cond_2
    :goto_0
    return-void
.end method

.method public T2(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lsg/y1;->g3()Lvg/c0$b;

    move-result-object v0

    invoke-static {v0, p1}, Lvg/c0;->w(Lvg/c0$b;Ljava/lang/String;)V

    iget-object v0, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    if-nez v0, :cond_0

    iput-object p1, p0, Lsg/y1;->i0:Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    invoke-virtual {v0}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->enableDomainAllowListChecker()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lsg/y1;->a3(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :goto_0
    sget-object v0, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    invoke-virtual {v0}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->enableDomainAllowListChecker()Z

    move-result v0

    if-eqz v0, :cond_2

    iput-object p1, p0, Lsg/y1;->x0:Ljava/lang/String;

    :cond_2
    return-void
.end method

.method public V0()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/c;->V0()V

    iget-object v0, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/webkit/WebView;->onPause()V

    :cond_0
    return-void
.end method

.method public W2(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public X2(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public Y2(Landroid/webkit/WebView;I)V
    .locals 0

    return-void
.end method

.method public final Z2(Lol/a;)I
    .locals 2

    sget-object v0, Lol/a;->d:Lol/a;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lsg/y1;->w0:Lil/c;

    const-string v1, "Surface.Surface_0"

    invoke-interface {v0, v1}, Lil/c;->b(Ljava/lang/String;)Lil/a;

    move-result-object v0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Lil/a;->a()I

    move-result p1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lil/a;->b()I

    move-result p1

    goto :goto_1

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object p1

    sget v0, Lsg/j0;->h:I

    invoke-static {p1, v0}, Ll2/b;->c(Landroid/content/Context;I)I

    move-result p1

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object p1

    sget v0, Lsg/j0;->q:I

    invoke-static {p1, v0}, Ll2/b;->c(Landroid/content/Context;I)I

    move-result p1

    :goto_1
    const/16 v0, 0xeb

    invoke-static {p1, v0}, Landroidx/core/graphics/c;->l(II)I

    move-result p1

    return p1
.end method

.method public a1()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/c;->a1()V

    iget-object v0, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/webkit/WebView;->onResume()V

    :cond_0
    return-void
.end method

.method public b3(Landroid/view/View;)V
    .locals 3

    sget v0, Lsg/m0;->D:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lsg/y1;->t0:Landroid/widget/ImageView;

    iget-boolean v1, p0, Lsg/y1;->s0:Z

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lsg/y1;->t0:Landroid/widget/ImageView;

    new-instance v1, Lcom/roblox/client/components/RobloxToolbar$c;

    invoke-direct {v1}, Lcom/roblox/client/components/RobloxToolbar$c;-><init>()V

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v2

    invoke-virtual {v2}, Lfk/c;->g()Lol/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/roblox/client/components/RobloxToolbar$c;->a(Lol/a;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lsg/y1;->t0:Landroid/widget/ImageView;

    new-instance v1, Lsg/p1;

    invoke-direct {v1, p0}, Lsg/p1;-><init>(Lsg/y1;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->g()Lol/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lsg/y1;->f3(Lol/a;)V

    invoke-virtual {p0}, Landroidx/fragment/app/c;->T()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    new-instance v1, Lsg/q1;

    invoke-direct {v1, p0, v0}, Lsg/q1;-><init>(Lsg/y1;I)V

    invoke-static {p1, v1}, Landroidx/core/view/o0;->A0(Landroid/view/View;Landroidx/core/view/y;)V

    :cond_0
    return-void
.end method

.method public c1()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/c;->c1()V

    return-void
.end method

.method public d1()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/c;->d1()V

    return-void
.end method

.method public e()V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    check-cast v0, Lcom/roblox/client/a;

    invoke-virtual {v0}, Lcom/roblox/client/a;->N1()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->reload()V

    return-void

    :cond_0
    iget-object v0, p0, Lsg/y1;->h0:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    :cond_1
    return-void
.end method

.method public f3(Lol/a;)V
    .locals 2

    iget-object v0, p0, Lsg/y1;->t0:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lsg/y1;->Z2(Lol/a;)I

    move-result p1

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    iget-object p1, p0, Lsg/y1;->t0:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public g3()Lvg/c0$b;
    .locals 1

    sget-object v0, Lvg/c0$b;->d:Lvg/c0$b;

    return-object v0
.end method

.method public onEmitRbHybridEvent(Luk/a;)V
    .locals 0
    .annotation runtime Lfv/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    iget-object p1, p0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method

.method public x2(Lej/k;)V
    .locals 3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->q1()Z

    move-result v0

    if-eqz v0, :cond_0

    instance-of v0, p1, Lej/f;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lej/f;

    invoke-interface {v0}, Lej/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p1}, Lej/k;->d()Z

    move-result v2

    invoke-interface {v0}, Lej/f;->a()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, v1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeMarketplacePurchaseFinished(ZLjava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v1, Lsg/o1;

    invoke-direct {v1, p0, v0, p1}, Lsg/o1;-><init>(Lsg/y1;Le4/q;Lej/k;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method
