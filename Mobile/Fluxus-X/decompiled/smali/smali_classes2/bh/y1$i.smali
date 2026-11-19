.class public Lbh/y1$i;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbh/y1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "i"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public final synthetic b:Lbh/y1;


# direct methods
.method public constructor <init>(Lbh/y1;)V
    .locals 0

    iput-object p1, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lbh/y1$i;->a:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(Lbh/y1$i;Ljava/lang/String;Ljava/lang/String;Lf4/v;Landroid/webkit/WebView;Z)V
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lbh/y1$i;->g(Ljava/lang/String;Ljava/lang/String;Lf4/v;Landroid/webkit/WebView;Z)V

    return-void
.end method

.method public static synthetic b(Lbh/y1$i;Lf4/v;Ljava/lang/String;Landroid/webkit/WebView;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lbh/y1$i;->f(Lf4/v;Ljava/lang/String;Landroid/webkit/WebView;)V

    return-void
.end method

.method public static synthetic c(Lbh/y1$i;)V
    .locals 0

    invoke-virtual {p0}, Lbh/y1$i;->e()V

    return-void
.end method


# virtual methods
.method public final d(Landroid/webkit/WebView;Ljava/lang/String;ZZ)Z
    .locals 14

    move-object/from16 v3, p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "-> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.web"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    if-nez v3, :cond_0

    const-string v2, "RWF.shouldOverrideUrlLoading() urlString is null!"

    invoke-static {v1, v2}, Lok/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v0

    :cond_0
    iget-object v2, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-virtual {v2}, Lf4/q;->p()Lf4/v;

    move-result-object v4

    const/4 v6, 0x1

    if-eqz v4, :cond_12

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_a

    :cond_1
    :try_start_0
    iget-object v2, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-virtual {v2}, Lbh/y1;->D2()Lcom/roblox/client/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roblox/client/a;->N1()Z

    move-result v2
    :try_end_0
    .catch Lbh/u0; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v2, :cond_2

    return v6

    :catch_0
    invoke-static {}, Lbh/y1;->v2()V

    :cond_2
    iget-object v2, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-static {v2, v3}, Lbh/y1;->p2(Lbh/y1;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    return v6

    :cond_3
    sget-object v2, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    invoke-virtual {v2}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->enableDomainAllowListChecker()Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-static {v2, v3}, Lbh/y1;->r2(Lbh/y1;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v0, "Navigating social media Link..."

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return v6

    :cond_4
    invoke-static {}, Lbh/a1;->z0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v0, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-static {v0}, Lbh/y1;->o2(Lbh/y1;)Lbh/y1$h;

    return v6

    :cond_5
    invoke-static {v3}, Lbh/a1;->m0(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-static {v2}, Lbh/y1;->l2(Lbh/y1;)Z

    move-result v2

    if-nez v2, :cond_6

    const-string v2, "RWF.shouldOverrideUrlLoading() The URL is a LOGIN type!"

    invoke-static {v1, v2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_1
    iget-object v1, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-virtual {v1}, Lbh/y1;->D2()Lcom/roblox/client/a;

    move-result-object v1

    iget-object v2, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-virtual {v2}, Lf4/q;->v()Landroid/content/Context;

    move-result-object v2

    sget v5, Lbh/q0;->o:I

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v2, v5, v0}, Lzi/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v6}, Lcom/roblox/client/b;->L1(Ljava/lang/String;I)V
    :try_end_1
    .catch Lbh/u0; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    invoke-static {}, Lbh/y1;->v2()V

    :goto_0
    invoke-static {}, Ldj/b;->f()Ldj/b;

    move-result-object v0

    sget-object v1, Ldj/b$d;->d:Ldj/b$d;

    invoke-virtual {v0, v4, v1}, Ldj/b;->i(Landroid/app/Activity;Ldj/b$d;)V

    invoke-static {v3}, Lbh/a1;->V(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Ldj/h;->e()Ldj/h;

    move-result-object v0

    new-instance v1, Lbh/y1$i$a;

    invoke-direct {v1, p0}, Lbh/y1$i$a;-><init>(Lbh/y1$i;)V

    invoke-virtual {v0, v1}, Ldj/h;->d(Lmi/m;)V

    return v6

    :cond_6
    iget-object v0, p0, Lbh/y1$i;->b:Lbh/y1;

    iget-object v0, v0, Lbh/y1;->g0:Lqi/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v0, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-static {v0, v3, v6}, Lbh/y1;->t2(Lbh/y1;Ljava/lang/String;Z)V

    const-string v0, "mobile-app-upgrades/buy?"

    invoke-virtual {v3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_f

    move-object v11, v4

    check-cast v11, Lcom/roblox/client/a;

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    invoke-virtual {v0}, Lnk/c;->k()Ljava/lang/String;

    move-result-object v8

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v9

    const-string v0, "id"

    invoke-virtual {v9, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lok/t;->i()Z

    move-result v2

    const-string v4, "NullPointerException thrown while parsing paymentSession parameter for purchase url"

    const-string v5, "paymentSessionId"

    const-string v7, "rbx.purchaseflow"

    if-eqz v2, :cond_9

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->L5()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->b3()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {v9, v5}, Lok/e0;->c(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_1

    :cond_7
    :try_start_2
    invoke-virtual {v9, v5}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catch_2
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UnsupportedOperationException thrown while parsing paymentSession parameter for purchase url "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v1, v0}, Lok/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    :catch_3
    invoke-static {v7, v4}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    invoke-static {v11}, Lqj/b;->a(Landroid/content/Context;)Lqj/b;

    :try_start_3
    iget-object v0, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-virtual {v0}, Lbh/y1;->D2()Lcom/roblox/client/a;

    move-result-object v0

    sget v1, Lbh/q0;->B1:I

    invoke-virtual {v0, v1}, Lcom/roblox/client/b;->T(I)V
    :try_end_3
    .catch Lbh/u0; {:try_start_3 .. :try_end_3} :catch_4

    goto/16 :goto_8

    :catch_4
    invoke-static {}, Lbh/y1;->v2()V

    goto/16 :goto_8

    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RobloxWebFragment to start an in-app purchase. Username = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v11}, Lqj/a;->a(Landroid/content/Context;)Lqj/a;

    :try_start_4
    iget-object v0, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-virtual {v0}, Lbh/y1;->D2()Lcom/roblox/client/a;

    move-result-object v0

    sget v1, Lbh/q0;->F1:I

    invoke-virtual {v0, v1}, Lcom/roblox/client/b;->T(I)V
    :try_end_4
    .catch Lbh/u0; {:try_start_4 .. :try_end_4} :catch_5

    goto/16 :goto_8

    :catch_5
    invoke-static {}, Lbh/y1;->v2()V

    goto/16 :goto_8

    :cond_9
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->P()Z

    move-result v2

    if-eqz v2, :cond_a

    const-string v2, "ctx"

    invoke-virtual {v9, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "type"

    invoke-virtual {v9, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v9, v5}, Lok/e0;->c(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v2, :cond_a

    if-eqz v3, :cond_a

    const-string v12, "subscription"

    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    const-string v1, "RobloxWebFragment to start an in-app subscription purchase."

    invoke-static {v7, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, "GooglePlayStore"

    invoke-static {v3, v0, v1, v10}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativePerformSubscriptionPurchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v6

    :cond_a
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->L1()Z

    move-result v2

    const-string v3, "purchaseStart"

    if-eqz v2, :cond_b

    const-string v1, "PaymentsProtocolV2: tryStartInAppPurchase."

    invoke-static {v7, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v11}, Lnj/a0;->R(Landroid/content/Context;)Lnj/a0;

    move-result-object v7

    iget-object v1, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-virtual {v1}, Lbh/y1;->F2()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lbh/t0;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lbh/y1$i;->b:Lbh/y1;

    iget-object v12, v1, Lbh/y1;->y0:Lmj/o;

    new-instance v13, Lbh/z1;

    invoke-direct {v13, p0}, Lbh/z1;-><init>(Lbh/y1$i;)V

    move-object v10, v8

    move-object v8, v0

    invoke-interface/range {v7 .. v13}, Lmj/k;->c(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Lf4/v;Lmj/o;Ljava/lang/Runnable;)V

    goto/16 :goto_8

    :cond_b
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->t3()Z

    move-result v2

    const-string v10, "UnsupportedOperationException thrown while parsing paymentSession parameter for purchase url"

    if-eqz v2, :cond_c

    sget-object v2, Lcom/roblox/client/purchase/IAPPurchaseManager;->l:Ljava/lang/String;

    invoke-static {v2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetMetricsPurchaseType(Ljava/lang/String;)V

    :try_start_5
    invoke-virtual {v9, v5}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_5
    .catch Ljava/lang/NullPointerException; {:try_start_5 .. :try_end_5} :catch_7
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_5 .. :try_end_5} :catch_6

    goto :goto_3

    :catch_6
    invoke-static {v7, v10}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :catch_7
    invoke-static {v7, v4}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :goto_2
    const-string v2, ""

    :goto_3
    invoke-static {v11}, Lnj/m;->F0(Landroid/content/Context;)Lnj/m;

    move-result-object v3

    invoke-interface {v3, v1}, Lmj/k;->i(Ljava/lang/String;)Z

    invoke-interface {v3, v6}, Lmj/k;->k(Z)V

    invoke-static {v6}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentsProtocolIsInApp(Z)V

    invoke-static {v2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentSessionId(Ljava/lang/String;)V

    invoke-interface {v3, v0}, Lmj/k;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetProviderCurrencyCode(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeBeginPaymentsProtocolPurchase(Ljava/lang/String;)V

    goto/16 :goto_8

    :cond_c
    invoke-static {v11}, Lnj/m;->F0(Landroid/content/Context;)Lnj/m;

    move-result-object v2

    if-nez v2, :cond_d

    :try_start_6
    iget-object v0, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-virtual {v0}, Lbh/y1;->D2()Lcom/roblox/client/a;

    move-result-object v0

    sget v1, Lbh/q0;->F1:I

    invoke-virtual {v0, v1}, Lcom/roblox/client/b;->T(I)V
    :try_end_6
    .catch Lbh/u0; {:try_start_6 .. :try_end_6} :catch_8

    goto/16 :goto_8

    :catch_8
    invoke-static {}, Lbh/y1;->v2()V

    goto :goto_8

    :cond_d
    iget-object v12, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-virtual {v12}, Lbh/y1;->F2()Ljava/lang/String;

    move-result-object v12

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v12, v3}, Lbh/t0;->d(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_7
    const-string v3, "recurring"

    invoke-virtual {v9, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_7
    .catch Ljava/lang/NullPointerException; {:try_start_7 .. :try_end_7} :catch_a
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_7 .. :try_end_7} :catch_9

    goto :goto_5

    :catch_9
    const-string v3, "UnsupportedOperationException thrown while parsing recurring parameter for purchase url"

    invoke-static {v7, v3}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :catch_a
    const-string v3, "NullPointerException thrown while parsing recurring parameter for purchase url"

    invoke-static {v7, v3}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :goto_4
    move-object v3, v1

    :goto_5
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    :try_start_8
    invoke-virtual {v9, v5}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_8
    .catch Ljava/lang/NullPointerException; {:try_start_8 .. :try_end_8} :catch_c
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_8 .. :try_end_8} :catch_b

    :goto_6
    move-object v13, v1

    goto :goto_7

    :catch_b
    invoke-static {v7, v10}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_6

    :catch_c
    invoke-static {v7, v4}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_6

    :goto_7
    iget-object v1, p0, Lbh/y1$i;->b:Lbh/y1;

    iget-object v1, v1, Lbh/y1;->y0:Lmj/o;

    move-object v9, v0

    move-object v7, v2

    move-object v10, v11

    move-object v11, v1

    invoke-interface/range {v7 .. v13}, Lmj/k;->l(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lmj/o;ZLjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_e

    :try_start_9
    iget-object v0, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-virtual {v0}, Lbh/y1;->D2()Lcom/roblox/client/a;

    move-result-object v0

    sget v1, Lbh/q0;->A1:I

    invoke-virtual {v0, v1}, Lcom/roblox/client/b;->T(I)V
    :try_end_9
    .catch Lbh/u0; {:try_start_9 .. :try_end_9} :catch_d

    goto :goto_8

    :catch_d
    invoke-static {}, Lbh/y1;->v2()V

    :cond_e
    :goto_8
    return v6

    :cond_f
    invoke-static/range {p2 .. p3}, Lbh/f2;->a(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_10

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->M0()Z

    move-result v1

    if-eqz v1, :cond_10

    move/from16 v1, p4

    invoke-static {v3, v1}, Lbh/f2;->c(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object v0

    const-string v1, "android_webview"

    invoke-virtual {v0, v3, v1}, Lym/g;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_10
    move-object v2, v0

    new-instance v0, Lbh/a2;

    move-object v1, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lbh/a2;-><init>(Lbh/y1$i;Ljava/lang/String;Ljava/lang/String;Lf4/v;Landroid/webkit/WebView;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->M0()Z

    move-result v1

    if-eqz v1, :cond_11

    if-eqz v2, :cond_11

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object v1

    invoke-virtual {v1, v2, v0}, Lym/g;->p(Ljava/lang/String;Lym/g$k;)V

    goto :goto_9

    :cond_11
    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object v1

    invoke-virtual {v1, v3, v0}, Lym/g;->s(Ljava/lang/String;Lym/g$k;)V

    :goto_9
    return v6

    :cond_12
    :goto_a
    const-string v0, "RWF.shouldOverrideUrlLoading() activity is null or finishing"

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return v6
.end method

.method public final synthetic e()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-virtual {v0}, Lbh/y1;->D2()Lcom/roblox/client/a;

    move-result-object v0

    sget v1, Lbh/q0;->A1:I

    invoke-virtual {v0, v1}, Lcom/roblox/client/b;->T(I)V
    :try_end_0
    .catch Lbh/u0; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-static {}, Lbh/y1;->v2()V

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
    iget-object p1, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-static {p1}, Lbh/y1;->n2(Lbh/y1;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p3, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final synthetic g(Ljava/lang/String;Ljava/lang/String;Lf4/v;Landroid/webkit/WebView;Z)V
    .locals 2

    if-eqz p5, :cond_2

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

    invoke-virtual {p3, p2, p4, p5}, Lym/g;->A(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {}, Lmw/c;->d()Lmw/c;

    move-result-object p2

    new-instance p4, Lbh/y1$g;

    iget-object p5, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-direct {p4, p5}, Lbh/y1$g;-><init>(Lbh/y1;)V

    invoke-virtual {p2, p4}, Lmw/c;->j(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Lym/g;->l(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {}, Lmw/c;->d()Lmw/c;

    move-result-object p1

    new-instance p3, Lbh/y1$g;

    iget-object v0, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-direct {p3, v0}, Lbh/y1$g;-><init>(Lbh/y1;)V

    invoke-virtual {p1, p3}, Lmw/c;->j(Ljava/lang/Object;)V

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object p1

    invoke-virtual {p1, p2, p4, p5}, Lym/g;->h(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object p1

    invoke-virtual {p1, p2}, Lym/g;->m(Ljava/lang/String;)V

    return-void

    :cond_2
    if-eqz p1, :cond_3

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object p5

    const-string v0, "success"

    const-string v1, "handled_in_webview"

    invoke-virtual {p5, p1, v0, v1}, Lym/g;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    sget-object p1, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    invoke-virtual {p1}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->enableDomainAllowListChecker()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-static {p1, p2}, Lbh/y1;->s2(Lbh/y1;Ljava/lang/String;)V

    return-void

    :cond_4
    new-instance p1, Lbh/b2;

    invoke-direct {p1, p0, p3, p2, p4}, Lbh/b2;-><init>(Lbh/y1$i;Lf4/v;Ljava/lang/String;Landroid/webkit/WebView;)V

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

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-static {v0}, Lbh/y1;->m2(Lbh/y1;)Ln5/d;

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

    iget-object v0, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-virtual {v0, p2}, Lbh/y1;->X2(Ljava/lang/String;)V

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

    iput-object p1, p0, Lbh/y1$i;->a:Ljava/lang/String;

    :cond_2
    invoke-static {}, Ldi/m;->b()Ldi/m;

    move-result-object p1

    invoke-virtual {p1, p2}, Ldi/m;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lbh/y1$i;->b:Lbh/y1;

    iget-object p1, p1, Lbh/y1;->g0:Lqi/b;

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

    iget-object p1, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-virtual {p1, p2}, Lbh/y1;->W2(Ljava/lang/String;)V

    iget-object p1, p0, Lbh/y1$i;->b:Lbh/y1;

    invoke-static {p1}, Lbh/y1;->m2(Lbh/y1;)Ln5/d;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ln5/d;->setRefreshing(Z)V

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

    iget-object v1, p0, Lbh/y1$i;->a:Ljava/lang/String;

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
    iput-object v0, p0, Lbh/y1$i;->a:Ljava/lang/String;

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->hasGesture()Z

    move-result v1

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result p2

    invoke-virtual {p0, p1, v0, v1, p2}, Lbh/y1$i;->d(Landroid/webkit/WebView;Ljava/lang/String;ZZ)Z

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

    invoke-virtual {p0, p1, v0, v1, p2}, Lbh/y1$i;->d(Landroid/webkit/WebView;Ljava/lang/String;ZZ)Z

    move-result p1

    return p1
.end method
