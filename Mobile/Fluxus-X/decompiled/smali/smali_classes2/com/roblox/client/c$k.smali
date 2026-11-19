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

.method public static synthetic a(Lcom/roblox/client/c$k;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/c$k;->e()V

    return-void
.end method

.method public static synthetic b(Lcom/roblox/client/c$k;Ljava/lang/String;Ljava/lang/String;Lf4/v;Landroid/webkit/WebView;Z)V
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lcom/roblox/client/c$k;->g(Ljava/lang/String;Ljava/lang/String;Lf4/v;Landroid/webkit/WebView;Z)V

    return-void
.end method

.method public static synthetic c(Lcom/roblox/client/c$k;Lf4/v;Ljava/lang/String;Landroid/webkit/WebView;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/roblox/client/c$k;->f(Lf4/v;Ljava/lang/String;Landroid/webkit/WebView;)V

    return-void
.end method


# virtual methods
.method public final d(Landroid/webkit/WebView;Ljava/lang/String;ZZ)Z
    .locals 10

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "-> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.web"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    if-nez p2, :cond_0

    const-string p1, "RWF.shouldOverrideUrlLoading() urlString is null!"

    invoke-static {v1, p1}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Leh/v0$c;->b:Leh/v0$c;

    invoke-static {p1}, Leh/v0;->v(Leh/v0$c;)V

    return v0

    :cond_0
    iget-object v2, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-virtual {v2}, Lf4/q;->p()Lf4/v;

    move-result-object v7

    const/4 v2, 0x1

    if-eqz v7, :cond_13

    invoke-virtual {v7}, Landroid/app/Activity;->isFinishing()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    iget-object v3, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-virtual {v3}, Lbh/x0;->u2()Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object p1, Leh/v0$c;->d:Leh/v0$c;

    invoke-static {p1}, Leh/v0;->v(Leh/v0$c;)V

    return v2

    :cond_2
    iget-object v3, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-static {v3, p2}, Lcom/roblox/client/c;->R2(Lcom/roblox/client/c;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object p1, Leh/v0$c;->e:Leh/v0$c;

    invoke-static {p1}, Leh/v0;->v(Leh/v0$c;)V

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

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Leh/v0$c;->f:Leh/v0$c;

    invoke-static {p1}, Leh/v0;->v(Leh/v0$c;)V

    return v2

    :cond_4
    invoke-static {}, Lbh/a1;->z0()Ljava/lang/String;

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
    sget-object p1, Leh/v0$c;->g:Leh/v0$c;

    invoke-static {p1}, Leh/v0;->v(Leh/v0$c;)V

    return v2

    :cond_6
    invoke-static {p2}, Lbh/a1;->m0(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    iget-object v3, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-static {v3}, Lcom/roblox/client/c;->K2(Lcom/roblox/client/c;)Z

    move-result v3

    if-nez v3, :cond_7

    const-string p1, "RWF.shouldOverrideUrlLoading() The URL is a LOGIN type!"

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-virtual {p1}, Lf4/q;->v()Landroid/content/Context;

    move-result-object p3

    sget p4, Lbh/q0;->o:I

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p3, p4, v0}, Lzi/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3, v2}, Lbh/x0;->z2(Ljava/lang/String;I)V

    invoke-static {}, Ldj/b;->f()Ldj/b;

    move-result-object p1

    sget-object p3, Ldj/b$d;->d:Ldj/b$d;

    invoke-virtual {p1, v7, p3}, Ldj/b;->i(Landroid/app/Activity;Ldj/b$d;)V

    invoke-static {p2}, Lbh/a1;->V(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object p1

    new-instance p2, Lcom/roblox/client/c$k$a;

    invoke-direct {p2, p0}, Lcom/roblox/client/c$k$a;-><init>(Lcom/roblox/client/c$k;)V

    invoke-virtual {p1, p2}, Ldj/h;->d(Lmi/m;)V

    sget-object p1, Leh/v0$c;->h:Leh/v0$c;

    invoke-static {p1}, Leh/v0;->v(Leh/v0$c;)V

    return v2

    :cond_7
    iget-object v0, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    iget-object v0, v0, Lcom/roblox/client/c;->I0:Lqi/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v0, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-static {v0, p2, v2}, Lcom/roblox/client/c;->V2(Lcom/roblox/client/c;Ljava/lang/String;Z)V

    const-string v0, "mobile-app-upgrades/buy?"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_10

    sget-object p1, Leh/v0$c;->i:Leh/v0$c;

    invoke-static {p1}, Leh/v0;->v(Leh/v0$c;)V

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object p1

    invoke-virtual {p1}, Lnk/c;->k()Ljava/lang/String;

    move-result-object v4

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    const-string p1, "id"

    invoke-virtual {v5, p1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lok/t;->i()Z

    move-result p2

    const-string p3, "rbx.purchaseflow"

    if-eqz p2, :cond_9

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "RobloxWebDialogFragment to start an in-app purchase. Username = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p3, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->L5()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {v7}, Lqj/b;->a(Landroid/content/Context;)Lqj/b;

    iget-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    sget p2, Lbh/q0;->F1:I

    invoke-virtual {p1, p2}, Lbh/x0;->T(I)V

    goto/16 :goto_2

    :cond_8
    invoke-static {v7}, Lqj/a;->a(Landroid/content/Context;)Lqj/a;

    iget-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    sget p2, Lbh/q0;->F1:I

    invoke-virtual {p1, p2}, Lbh/x0;->T(I)V

    goto/16 :goto_2

    :cond_9
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p2

    invoke-interface {p2}, Lbi/i;->P()Z

    move-result p2

    const-string p4, "paymentSessionId"

    if-eqz p2, :cond_a

    const-string p2, "ctx"

    invoke-virtual {v5, p2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "type"

    invoke-virtual {v5, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, p4}, Lok/e0;->c(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz p2, :cond_a

    if-eqz v0, :cond_a

    const-string v6, "subscription"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a

    const-string p2, "RobloxWebDialogFragment to start an in-app subscription purchase."

    invoke-static {p3, p2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string p2, "GooglePlayStore"

    invoke-static {v0, p1, p2, v3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativePerformSubscriptionPurchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v2

    :cond_a
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p2

    invoke-interface {p2}, Lbi/i;->L1()Z

    move-result p2

    const-string v0, "purchaseStart"

    if-eqz p2, :cond_b

    const-string p2, "PaymentsProtocol: tryStartInAppPurchase in RobloxWebDialogFragment."

    invoke-static {p3, p2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v7}, Lnj/a0;->R(Landroid/content/Context;)Lnj/a0;

    move-result-object v3

    iget-object p2, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-virtual {p2}, Lcom/roblox/client/c;->c3()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Lbh/t0;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    iget-object v8, p2, Lcom/roblox/client/c;->c1:Lmj/o;

    new-instance v9, Lbh/l1;

    invoke-direct {v9, p0}, Lbh/l1;-><init>(Lcom/roblox/client/c$k;)V

    move-object v6, v4

    move-object v4, p1

    invoke-interface/range {v3 .. v9}, Lmj/k;->c(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Lf4/v;Lmj/o;Ljava/lang/Runnable;)V

    goto/16 :goto_2

    :cond_b
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p2

    invoke-interface {p2}, Lbi/i;->t3()Z

    move-result p2

    if-eqz p2, :cond_d

    sget-object p2, Lcom/roblox/client/purchase/IAPPurchaseManager;->l:Ljava/lang/String;

    invoke-static {p2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetMetricsPurchaseType(Ljava/lang/String;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p2

    invoke-interface {p2}, Lbi/i;->n3()Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-static {v5, p4}, Lok/e0;->c(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_c

    goto :goto_0

    :cond_c
    const-string p2, ""

    :goto_0
    invoke-static {v7}, Lnj/m;->F0(Landroid/content/Context;)Lnj/m;

    move-result-object p3

    invoke-interface {p3, v1}, Lmj/k;->i(Ljava/lang/String;)Z

    invoke-interface {p3, v2}, Lmj/k;->k(Z)V

    invoke-static {v2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentsProtocolIsInApp(Z)V

    invoke-static {p2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentSessionId(Ljava/lang/String;)V

    invoke-interface {p3, p1}, Lmj/k;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetProviderCurrencyCode(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeBeginPaymentsProtocolPurchase(Ljava/lang/String;)V

    goto :goto_2

    :cond_d
    invoke-static {v7}, Lnj/m;->F0(Landroid/content/Context;)Lnj/m;

    move-result-object v3

    if-nez v3, :cond_e

    iget-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    sget p2, Lbh/q0;->F1:I

    invoke-virtual {p1, p2}, Lbh/x0;->T(I)V

    goto :goto_2

    :cond_e
    iget-object p2, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-virtual {p2}, Lcom/roblox/client/c;->c3()Ljava/lang/String;

    move-result-object p2

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p2, p4}, Lbh/t0;->d(Ljava/lang/String;Ljava/lang/String;)V

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

    invoke-static {p3, p2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :catch_1
    const-string p2, "NullPointerException thrown while parsing recurring parameter for purchase url"

    invoke-static {p3, p2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    iget-object p2, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    iget-object p2, p2, Lcom/roblox/client/c;->c1:Lmj/o;

    move-object v5, p1

    move-object v6, v7

    move-object v7, p2

    invoke-interface/range {v3 .. v8}, Lmj/k;->f(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lmj/o;Z)Z

    move-result p1

    if-nez p1, :cond_f

    iget-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    sget p2, Lbh/q0;->A1:I

    invoke-virtual {p1, p2}, Lbh/x0;->T(I)V

    :cond_f
    :goto_2
    return v2

    :cond_10
    invoke-static {p2, p3}, Lbh/f2;->a(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_11

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->M0()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {p2, p4}, Lbh/f2;->c(Ljava/lang/String;Z)Z

    move-result p4

    if-eqz p4, :cond_11

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object p3

    const-string p4, "android_webview"

    invoke-virtual {p3, p2, p4}, Lym/g;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    :cond_11
    move-object v5, p3

    new-instance v3, Lbh/m1;

    move-object v4, p0

    move-object v8, p1

    move-object v6, p2

    invoke-direct/range {v3 .. v8}, Lbh/m1;-><init>(Lcom/roblox/client/c$k;Ljava/lang/String;Ljava/lang/String;Lf4/v;Landroid/webkit/WebView;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->M0()Z

    move-result p1

    if-eqz p1, :cond_12

    if-eqz v5, :cond_12

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object p1

    invoke-virtual {p1, v5, v3}, Lym/g;->p(Ljava/lang/String;Lym/g$k;)V

    goto :goto_3

    :cond_12
    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object p1

    invoke-virtual {p1, v6, v3}, Lym/g;->s(Ljava/lang/String;Lym/g$k;)V

    :goto_3
    return v2

    :cond_13
    :goto_4
    const-string p1, "RWF.shouldOverrideUrlLoading() activity is null or finishing"

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Leh/v0$c;->c:Leh/v0$c;

    invoke-static {p1}, Leh/v0;->v(Leh/v0$c;)V

    return v2
.end method

.method public final synthetic e()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    sget v1, Lbh/q0;->A1:I

    invoke-virtual {v0, v1}, Lbh/x0;->T(I)V

    return-void
.end method

.method public final synthetic f(Lf4/v;Ljava/lang/String;Landroid/webkit/WebView;)V
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

.method public final synthetic g(Ljava/lang/String;Ljava/lang/String;Lf4/v;Landroid/webkit/WebView;Z)V
    .locals 2

    if-eqz p5, :cond_5

    sget-object p3, Leh/v0$c;->j:Leh/v0$c;

    invoke-static {p3}, Leh/v0;->v(Leh/v0$c;)V

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object p3

    const-string p4, "android_webview"

    if-nez p1, :cond_0

    invoke-virtual {p3, p2, p4}, Lym/g;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    const/4 p5, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    move v0, p5

    :goto_0
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->Q1()Z

    move-result v1

    if-eqz v1, :cond_3

    if-eqz v0, :cond_2

    invoke-virtual {p3, p2, p4, p5}, Lym/g;->A(Ljava/lang/String;Ljava/lang/String;Z)V

    iget-object p3, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-static {p3}, Lcom/roblox/client/c;->O2(Lcom/roblox/client/c;)Lcom/roblox/client/c$j;

    move-result-object p3

    invoke-interface {p3, p2, p1}, Lcom/roblox/client/c$j;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-static {p1}, Lcom/roblox/client/c;->O2(Lcom/roblox/client/c;)Lcom/roblox/client/c$j;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/roblox/client/c$j;->b(Ljava/lang/String;)V

    return-void

    :cond_3
    if-eqz v0, :cond_4

    invoke-virtual {p3, p2, p4, p5}, Lym/g;->A(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {}, Lmw/c;->d()Lmw/c;

    move-result-object p2

    new-instance p4, Lcom/roblox/client/c$h;

    iget-object p5, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-direct {p4, p5}, Lcom/roblox/client/c$h;-><init>(Lcom/roblox/client/c;)V

    invoke-virtual {p2, p4}, Lmw/c;->j(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Lym/g;->l(Ljava/lang/String;)V

    return-void

    :cond_4
    invoke-static {}, Lmw/c;->d()Lmw/c;

    move-result-object p1

    new-instance p3, Lcom/roblox/client/c$h;

    iget-object v0, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-direct {p3, v0}, Lcom/roblox/client/c$h;-><init>(Lcom/roblox/client/c;)V

    invoke-virtual {p1, p3}, Lmw/c;->j(Ljava/lang/Object;)V

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object p1

    invoke-virtual {p1, p2, p4, p5}, Lym/g;->h(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object p1

    invoke-virtual {p1, p2}, Lym/g;->m(Ljava/lang/String;)V

    return-void

    :cond_5
    if-eqz p1, :cond_6

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object p5

    const-string v0, "success"

    const-string v1, "handled_in_webview"

    invoke-virtual {p5, p1, v0, v1}, Lym/g;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    sget-object p1, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    invoke-virtual {p1}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->enableDomainAllowListChecker()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-virtual {p1, p2}, Lcom/roblox/client/c;->y3(Ljava/lang/String;)V

    return-void

    :cond_7
    sget-object p1, Leh/v0$c;->n:Leh/v0$c;

    invoke-static {p1}, Leh/v0;->v(Leh/v0$c;)V

    new-instance p1, Lbh/n1;

    invoke-direct {p1, p0, p3, p2, p4}, Lbh/n1;-><init>(Lcom/roblox/client/c$k;Lf4/v;Ljava/lang/String;Landroid/webkit/WebView;)V

    invoke-virtual {p3, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V

    invoke-static {}, Ldl/h;->j()Ldl/h;

    move-result-object p1

    invoke-static {}, Lbh/a1;->g()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ldl/h;->n(Ljava/lang/String;)V

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

    invoke-static {v0}, Lcom/roblox/client/c;->L2(Lcom/roblox/client/c;)Ln5/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ln5/d;->setRefreshing(Z)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onPageFinished. url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.web"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-virtual {v0, p2}, Lcom/roblox/client/c;->w3(Ljava/lang/String;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->W1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ldl/h;->j()Ldl/h;

    move-result-object v0

    invoke-static {}, Lbh/a1;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldl/h;->n(Ljava/lang/String;)V

    :cond_0
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->p2()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    :cond_1
    sget-object p1, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    invoke-virtual {p1}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->enableDomainAllowListChecker()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/roblox/client/c$k;->a:Ljava/lang/String;

    :cond_2
    invoke-static {}, Ldi/m;->b()Ldi/m;

    move-result-object p1

    invoke-virtual {p1, p2}, Ldi/m;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    iget-object p1, p1, Lcom/roblox/client/c;->I0:Lqi/b;

    invoke-virtual {p1}, Landroid/webkit/WebView;->reload()V

    :cond_3
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

    invoke-static {p3, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-virtual {p1, p2}, Lcom/roblox/client/c;->t3(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-static {p1}, Lcom/roblox/client/c;->L2(Lcom/roblox/client/c;)Ln5/d;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ln5/d;->setRefreshing(Z)V

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

    invoke-static {p2, p1}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/c$k;->b:Lcom/roblox/client/c;

    invoke-virtual {p1}, Lcom/roblox/client/c;->u3()V

    invoke-static {}, Lcom/roblox/client/RobloxApplication;->f()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lbh/e2;->j(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Leh/v0$c;->d:Leh/v0$c;

    invoke-static {p1}, Leh/v0;->v(Leh/v0$c;)V

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

    move-result v1

    if-nez v1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Skipping duplicate shouldOverrideUrlLoading call for URL: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "rbx.web"

    invoke-static {p2, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x1

    return p1

    :cond_0
    iput-object v0, p0, Lcom/roblox/client/c$k;->a:Ljava/lang/String;

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->hasGesture()Z

    move-result v1

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result p2

    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/roblox/client/c$k;->d(Landroid/webkit/WebView;Ljava/lang/String;ZZ)Z

    move-result p1

    return p1

    :cond_1
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->hasGesture()Z

    move-result v1

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result p2

    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/roblox/client/c$k;->d(Landroid/webkit/WebView;Ljava/lang/String;ZZ)Z

    move-result p1

    return p1
.end method
