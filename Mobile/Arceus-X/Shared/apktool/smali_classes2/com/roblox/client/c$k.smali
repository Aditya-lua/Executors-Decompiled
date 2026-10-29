.class public Lcom/roblox/client/c$k;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "k"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public final synthetic b:Lcom/roblox/client/c;


# direct methods
.method public constructor <init>(Lcom/roblox/client/c;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/roblox/client/c$k;->a:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(Lcom/roblox/client/c$k;Ljava/lang/String;Le4/q;Landroid/webkit/WebView;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/roblox/client/c$k;->g(Ljava/lang/String;Le4/q;Landroid/webkit/WebView;Z)V

    return-void
.end method

.method public static synthetic b(Lcom/roblox/client/c$k;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/c$k;->e()V

    return-void
.end method

.method public static synthetic c(Lcom/roblox/client/c$k;Le4/q;Ljava/lang/String;Landroid/webkit/WebView;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/roblox/client/c$k;->f(Le4/q;Ljava/lang/String;Landroid/webkit/WebView;)V

    return-void
.end method


# virtual methods
.method public final d(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 10

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "-> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.web"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    if-nez p2, :cond_0

    const-string p1, "RWF.shouldOverrideUrlLoading() urlString is null!"

    invoke-static {v1, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lvg/c0$c;->b:Lvg/c0$c;

    invoke-static {p1}, Lvg/c0;->v(Lvg/c0$c;)V

    return v0

    :cond_0
    iget-object v2, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-virtual {v2}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v6

    const/4 v2, 0x1

    if-eqz v6, :cond_11

    invoke-virtual {v6}, Landroid/app/Activity;->isFinishing()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    iget-object v3, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-virtual {v3}, Lsg/x0;->u2()Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object p1, Lvg/c0$c;->d:Lvg/c0$c;

    invoke-static {p1}, Lvg/c0;->v(Lvg/c0$c;)V

    return v2

    :cond_2
    iget-object v3, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-static {v3, p2}, Lcom/roblox/client/c;->R2(Lcom/roblox/client/c;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object p1, Lvg/c0$c;->e:Lvg/c0$c;

    invoke-static {p1}, Lvg/c0;->v(Lvg/c0$c;)V

    return v2

    :cond_3
    sget-object v3, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    invoke-virtual {v3}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->enableDomainAllowListChecker()Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v3, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-static {v3, p2}, Lcom/roblox/client/c;->U2(Lcom/roblox/client/c;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    const-string p1, "Navigating social media Link..."

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lvg/c0$c;->f:Lvg/c0$c;

    invoke-static {p1}, Lvg/c0;->v(Lvg/c0$c;)V

    return v2

    :cond_4
    invoke-static {}, Lsg/a1;->z0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-static {p1}, Lcom/roblox/client/c;->O2(Lcom/roblox/client/c;)Lcom/roblox/client/c$j;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-static {p1}, Lcom/roblox/client/c;->O2(Lcom/roblox/client/c;)Lcom/roblox/client/c$j;

    move-result-object p1

    invoke-interface {p1}, Lcom/roblox/client/c$j;->a()V

    :cond_5
    sget-object p1, Lvg/c0$c;->g:Lvg/c0$c;

    invoke-static {p1}, Lvg/c0;->v(Lvg/c0$c;)V

    return v2

    :cond_6
    invoke-static {p2}, Lsg/a1;->m0(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    iget-object v3, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-static {v3}, Lcom/roblox/client/c;->K2(Lcom/roblox/client/c;)Z

    move-result v3

    if-nez v3, :cond_7

    const-string p1, "RWF.shouldOverrideUrlLoading() The URL is a LOGIN type!"

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-virtual {p1}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object v1

    sget v3, Lsg/q0;->o:I

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v3, v0}, Lri/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v2}, Lsg/x0;->z2(Ljava/lang/String;I)V

    invoke-static {}, Lvi/b;->f()Lvi/b;

    move-result-object p1

    sget-object v0, Lvi/b$d;->d:Lvi/b$d;

    invoke-virtual {p1, v6, v0}, Lvi/b;->i(Landroid/app/Activity;Lvi/b$d;)V

    invoke-static {p2}, Lsg/a1;->V(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object p1

    new-instance p2, Lcom/roblox/client/c$k$a;

    invoke-direct {p2, p0}, Lcom/roblox/client/c$k$a;-><init>(Lcom/roblox/client/c$k;)V

    invoke-virtual {p1, p2}, Lvi/h;->d(Lei/m;)V

    sget-object p1, Lvg/c0$c;->h:Lvg/c0$c;

    invoke-static {p1}, Lvg/c0;->v(Lvg/c0$c;)V

    return v2

    :cond_7
    iget-object v0, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    iget-object v0, v0, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v0, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-static {v0, p2, v2}, Lcom/roblox/client/c;->V2(Lcom/roblox/client/c;Ljava/lang/String;Z)V

    const-string v0, "mobile-app-upgrades/buy?"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_10

    sget-object p1, Lvg/c0$c;->i:Lvg/c0$c;

    invoke-static {p1}, Lvg/c0;->v(Lvg/c0$c;)V

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object p1

    invoke-virtual {p1}, Lfk/c;->k()Ljava/lang/String;

    move-result-object v4

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    const-string p1, "id"

    invoke-virtual {v5, p1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lgk/t;->i()Z

    move-result p2

    const-string v0, "rbx.purchaseflow"

    if-eqz p2, :cond_9

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "RobloxWebDialogFragment to start an in-app purchase. Username = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->I5()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {v6}, Lij/b;->a(Landroid/content/Context;)Lij/b;

    iget-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    sget p2, Lsg/q0;->v1:I

    invoke-virtual {p1, p2}, Lsg/x0;->U(I)V

    goto/16 :goto_2

    :cond_8
    invoke-static {v6}, Lij/a;->a(Landroid/content/Context;)Lij/a;

    iget-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    sget p2, Lsg/q0;->v1:I

    invoke-virtual {p1, p2}, Lsg/x0;->U(I)V

    goto/16 :goto_2

    :cond_9
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->O()Z

    move-result p2

    const-string v3, "paymentSessionId"

    if-eqz p2, :cond_a

    const-string p2, "ctx"

    invoke-virtual {v5, p2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v7, "type"

    invoke-virtual {v5, v7}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v3}, Lgk/e0;->c(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz p2, :cond_a

    if-eqz v7, :cond_a

    const-string v9, "subscription"

    invoke-virtual {p2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a

    const-string p2, "RobloxWebDialogFragment to start an in-app subscription purchase."

    invoke-static {v0, p2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string p2, "GooglePlayStore"

    invoke-static {v7, p1, p2, v8}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativePerformSubscriptionPurchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v2

    :cond_a
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->H1()Z

    move-result p2

    const-string v7, "purchaseStart"

    if-eqz p2, :cond_b

    const-string p2, "PaymentsProtocol: tryStartInAppPurchase in RobloxWebDialogFragment."

    invoke-static {v0, p2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v6}, Lfj/a0;->R(Landroid/content/Context;)Lfj/a0;

    move-result-object v3

    iget-object p2, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-virtual {p2}, Lcom/roblox/client/c;->c3()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lsg/t0;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    iget-object v8, p2, Lcom/roblox/client/c;->c1:Lej/j;

    new-instance v9, Lsg/l1;

    invoke-direct {v9, p0}, Lsg/l1;-><init>(Lcom/roblox/client/c$k;)V

    move-object v7, v6

    move-object v6, v4

    move-object v4, p1

    invoke-interface/range {v3 .. v9}, Lej/g;->e(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Le4/q;Lej/j;Ljava/lang/Runnable;)V

    goto/16 :goto_2

    :cond_b
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->m3()Z

    move-result p2

    if-eqz p2, :cond_d

    sget-object p2, Lcom/roblox/client/purchase/IAPPurchaseManager;->l:Ljava/lang/String;

    invoke-static {p2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetMetricsPurchaseType(Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->h3()Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-static {v5, v3}, Lgk/e0;->c(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_c

    goto :goto_0

    :cond_c
    const-string p2, ""

    :goto_0
    invoke-static {v6}, Lfj/m;->F0(Landroid/content/Context;)Lfj/m;

    move-result-object v0

    invoke-interface {v0, v1}, Lej/g;->j(Ljava/lang/String;)Z

    invoke-interface {v0, v2}, Lej/g;->k(Z)V

    invoke-static {v2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentsProtocolIsInApp(Z)V

    invoke-static {p2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentSessionId(Ljava/lang/String;)V

    invoke-interface {v0, p1}, Lej/g;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetProviderCurrencyCode(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeBeginPaymentsProtocolPurchase(Ljava/lang/String;)V

    goto :goto_2

    :cond_d
    invoke-static {v6}, Lfj/m;->F0(Landroid/content/Context;)Lfj/m;

    move-result-object v3

    if-nez v3, :cond_e

    iget-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    sget p2, Lsg/q0;->v1:I

    invoke-virtual {p1, p2}, Lsg/x0;->U(I)V

    goto :goto_2

    :cond_e
    iget-object p2, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-virtual {p2}, Lcom/roblox/client/c;->c3()Ljava/lang/String;

    move-result-object p2

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {p2, v7}, Lsg/t0;->d(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    const-string p2, "recurring"

    invoke-virtual {v5, p2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string p2, "UnsupportedOperationException thrown while parsing recurring parameter for purchase url"

    invoke-static {v0, p2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :catch_1
    const-string p2, "NullPointerException thrown while parsing recurring parameter for purchase url"

    invoke-static {v0, p2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    iget-object p2, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    iget-object v7, p2, Lcom/roblox/client/c;->c1:Lej/j;

    move-object v5, p1

    invoke-interface/range {v3 .. v8}, Lej/g;->i(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lej/j;Z)Z

    move-result p1

    if-nez p1, :cond_f

    iget-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    sget p2, Lsg/q0;->q1:I

    invoke-virtual {p1, p2}, Lsg/x0;->U(I)V

    :cond_f
    :goto_2
    return v2

    :cond_10
    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v0

    new-instance v1, Lsg/m1;

    invoke-direct {v1, p0, p2, v6, p1}, Lsg/m1;-><init>(Lcom/roblox/client/c$k;Ljava/lang/String;Le4/q;Landroid/webkit/WebView;)V

    invoke-virtual {v0, p2, v1}, Lkm/f;->p(Ljava/lang/String;Lkm/f$k;)V

    return v2

    :cond_11
    :goto_3
    const-string p1, "RWF.shouldOverrideUrlLoading() activity is null or finishing"

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lvg/c0$c;->c:Lvg/c0$c;

    invoke-static {p1}, Lvg/c0;->v(Lvg/c0$c;)V

    return v2
.end method

.method public final synthetic e()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    sget v1, Lsg/q0;->q1:I

    invoke-virtual {v0, v1}, Lsg/x0;->U(I)V

    return-void
.end method

.method public final synthetic f(Le4/q;Ljava/lang/String;Landroid/webkit/WebView;)V
    .locals 1

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-static {p1}, Lcom/roblox/client/c;->M2(Lcom/roblox/client/c;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p3, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final synthetic g(Ljava/lang/String;Le4/q;Landroid/webkit/WebView;Z)V
    .locals 2

    if-eqz p4, :cond_3

    sget-object p2, Lvg/c0$c;->j:Lvg/c0$c;

    invoke-static {p2}, Lvg/c0;->v(Lvg/c0$c;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->M1()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-static {p2}, Lcom/roblox/client/c;->O2(Lcom/roblox/client/c;)Lcom/roblox/client/c$j;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/roblox/client/c$j;->b(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->d1()Z

    move-result p2

    const/4 p3, 0x0

    const-string p4, "android_webview"

    if-eqz p2, :cond_2

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object p2

    invoke-virtual {p2, p1, p4, p3}, Lkm/f;->x(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {p2, p1, p4}, Lkm/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object p4

    new-instance v0, Lcom/roblox/client/c$h;

    iget-object v1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-direct {v0, v1}, Lcom/roblox/client/c$h;-><init>(Lcom/roblox/client/c;)V

    invoke-virtual {p4, v0}, Lfv/c;->j(Ljava/lang/Object;)V

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_1

    invoke-virtual {p2, p3}, Lkm/f;->j(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {p2, p1}, Lkm/f;->m(Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object p2

    new-instance v0, Lcom/roblox/client/c$h;

    iget-object v1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-direct {v0, v1}, Lcom/roblox/client/c$h;-><init>(Lcom/roblox/client/c;)V

    invoke-virtual {p2, v0}, Lfv/c;->j(Ljava/lang/Object;)V

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object p2

    invoke-virtual {p2, p1, p4, p3}, Lkm/f;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object p2

    invoke-virtual {p2, p1}, Lkm/f;->k(Ljava/lang/String;)V

    return-void

    :cond_3
    sget-object p4, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    invoke-virtual {p4}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->enableDomainAllowListChecker()Z

    move-result p4

    if-eqz p4, :cond_4

    iget-object p2, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-virtual {p2, p1}, Lcom/roblox/client/c;->y3(Ljava/lang/String;)V

    return-void

    :cond_4
    sget-object p4, Lvg/c0$c;->n:Lvg/c0$c;

    invoke-static {p4}, Lvg/c0;->v(Lvg/c0$c;)V

    new-instance p4, Lsg/n1;

    invoke-direct {p4, p0, p2, p1, p3}, Lsg/n1;-><init>(Lcom/roblox/client/c$k;Le4/q;Ljava/lang/String;Landroid/webkit/WebView;)V

    invoke-virtual {p2, p4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V

    invoke-static {}, Lwk/h;->h()Lwk/h;

    move-result-object p1

    invoke-static {}, Lsg/a1;->g()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lwk/h;->k(Ljava/lang/String;)V

    return-void
.end method

.method public onPageCommitVisible(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    iget-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-virtual {p1, p2}, Lcom/roblox/client/c;->v3(Ljava/lang/String;)V

    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-static {v0}, Lcom/roblox/client/c;->L2(Lcom/roblox/client/c;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onPageFinished. url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.web"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-virtual {v0, p2}, Lcom/roblox/client/c;->w3(Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->j2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    :cond_0
    sget-object p1, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    invoke-virtual {p1}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->enableDomainAllowListChecker()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/roblox/client/c$k;->a:Ljava/lang/String;

    :cond_1
    invoke-static {}, Lvh/m;->b()Lvh/m;

    move-result-object p1

    invoke-virtual {p1, p2}, Lvh/m;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    iget-object p1, p1, Lcom/roblox/client/c;->I0:Lcom/roblox/client/hybrid/RBHybridWebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->reload()V

    :cond_2
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "-> "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p3, "rbx.web"

    invoke-static {p3, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-virtual {p1, p2}, Lcom/roblox/client/c;->t3(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-static {p1}, Lcom/roblox/client/c;->L2(Lcom/roblox/client/c;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "onReceivedMainFrameError: suppressing impression. error="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Landroid/webkit/WebResourceError;->getErrorCode()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ": "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Landroid/webkit/WebResourceError;->getDescription()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "rbx.web"

    invoke-static {p2, p1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-virtual {p1}, Lcom/roblox/client/c;->u3()V

    invoke-static {}, Lcom/roblox/client/RobloxApplication;->f()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lsg/e2;->j(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Lvg/c0$c;->d:Lvg/c0$c;

    invoke-static {p1}, Lvg/c0;->v(Lvg/c0$c;)V

    :cond_0
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 2

    sget-object v0, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    invoke-virtual {v0}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->enableDomainAllowListChecker()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/c$k;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->hasGesture()Z

    move-result p2

    if-nez p2, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Skipping duplicate shouldOverrideUrlLoading call for URL: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "rbx.web"

    invoke-static {p2, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x1

    return p1

    :cond_0
    iput-object v0, p0, Lcom/roblox/client/c$k;->a:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/c$k;->d(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_1
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/c$k;->d(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
