.class public Lsg/y1$i;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsg/y1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "i"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public final synthetic b:Lsg/y1;


# direct methods
.method public constructor <init>(Lsg/y1;)V
    .locals 0

    iput-object p1, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lsg/y1$i;->a:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(Lsg/y1$i;Le4/q;Ljava/lang/String;Landroid/webkit/WebView;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lsg/y1$i;->f(Le4/q;Ljava/lang/String;Landroid/webkit/WebView;)V

    return-void
.end method

.method public static synthetic b(Lsg/y1$i;)V
    .locals 0

    invoke-virtual {p0}, Lsg/y1$i;->e()V

    return-void
.end method

.method public static synthetic c(Lsg/y1$i;Ljava/lang/String;Le4/q;Landroid/webkit/WebView;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lsg/y1$i;->g(Ljava/lang/String;Le4/q;Landroid/webkit/WebView;Z)V

    return-void
.end method


# virtual methods
.method public final d(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 12

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

    return v0

    :cond_0
    iget-object v2, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-virtual {v2}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_10

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_9

    :cond_1
    :try_start_0
    iget-object v4, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-virtual {v4}, Lsg/y1;->D2()Lcom/roblox/client/a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roblox/client/a;->N1()Z

    move-result v4
    :try_end_0
    .catch Lsg/u0; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v4, :cond_2

    return v3

    :catch_0
    invoke-static {}, Lsg/y1;->v2()V

    :cond_2
    iget-object v4, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-static {v4, p2}, Lsg/y1;->p2(Lsg/y1;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    return v3

    :cond_3
    sget-object v4, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    invoke-virtual {v4}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->enableDomainAllowListChecker()Z

    move-result v4

    if-nez v4, :cond_4

    iget-object v4, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-static {v4, p2}, Lsg/y1;->r2(Lsg/y1;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    const-string p1, "Navigating social media Link..."

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return v3

    :cond_4
    invoke-static {}, Lsg/a1;->z0()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    iget-object p1, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-static {p1}, Lsg/y1;->o2(Lsg/y1;)Lsg/y1$h;

    return v3

    :cond_5
    invoke-static {p2}, Lsg/a1;->m0(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    iget-object v4, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-static {v4}, Lsg/y1;->l2(Lsg/y1;)Z

    move-result v4

    if-nez v4, :cond_6

    const-string p1, "RWF.shouldOverrideUrlLoading() The URL is a LOGIN type!"

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_1
    iget-object p1, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-virtual {p1}, Lsg/y1;->D2()Lcom/roblox/client/a;

    move-result-object p1

    iget-object v1, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-virtual {v1}, Landroidx/fragment/app/c;->x()Landroid/content/Context;

    move-result-object v1

    sget v4, Lsg/q0;->o:I

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v4, v0}, Lri/a;->c(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v3}, Lcom/roblox/client/b;->L1(Ljava/lang/String;I)V
    :try_end_1
    .catch Lsg/u0; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    invoke-static {}, Lsg/y1;->v2()V

    :goto_0
    invoke-static {}, Lvi/b;->f()Lvi/b;

    move-result-object p1

    sget-object v0, Lvi/b$d;->d:Lvi/b$d;

    invoke-virtual {p1, v2, v0}, Lvi/b;->i(Landroid/app/Activity;Lvi/b$d;)V

    invoke-static {p2}, Lsg/a1;->V(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object p1

    new-instance p2, Lsg/y1$i$a;

    invoke-direct {p2, p0}, Lsg/y1$i$a;-><init>(Lsg/y1$i;)V

    invoke-virtual {p1, p2}, Lvi/h;->d(Lei/m;)V

    return v3

    :cond_6
    iget-object v0, p0, Lsg/y1$i;->b:Lsg/y1;

    iget-object v0, v0, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v0, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-static {v0, p2, v3}, Lsg/y1;->t2(Lsg/y1;Ljava/lang/String;Z)V

    const-string v0, "mobile-app-upgrades/buy?"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_f

    move-object v7, v2

    check-cast v7, Lcom/roblox/client/a;

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object p1

    invoke-virtual {p1}, Lfk/c;->k()Ljava/lang/String;

    move-result-object v5

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    const-string p1, "id"

    invoke-virtual {v6, p1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lgk/t;->i()Z

    move-result v0

    const-string v2, "NullPointerException thrown while parsing paymentSession parameter for purchase url"

    const-string v4, "paymentSessionId"

    const-string v8, "rbx.purchaseflow"

    if-eqz v0, :cond_9

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->I5()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->U2()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {v6, v4}, Lgk/e0;->c(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_1

    :cond_7
    :try_start_2
    invoke-virtual {v6, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catch_2
    move-exception v0

    move-object p1, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UnsupportedOperationException thrown while parsing paymentSession parameter for purchase url "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v8, p2, p1}, Lgk/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    :catch_3
    invoke-static {v8, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    invoke-static {v7}, Lij/b;->a(Landroid/content/Context;)Lij/b;

    :try_start_3
    iget-object p1, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-virtual {p1}, Lsg/y1;->D2()Lcom/roblox/client/a;

    move-result-object p1

    sget p2, Lsg/q0;->r1:I

    invoke-virtual {p1, p2}, Lcom/roblox/client/b;->U(I)V
    :try_end_3
    .catch Lsg/u0; {:try_start_3 .. :try_end_3} :catch_4

    goto/16 :goto_8

    :catch_4
    invoke-static {}, Lsg/y1;->v2()V

    goto/16 :goto_8

    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "RobloxWebFragment to start an in-app purchase. Username = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v8, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v7}, Lij/a;->a(Landroid/content/Context;)Lij/a;

    :try_start_4
    iget-object p1, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-virtual {p1}, Lsg/y1;->D2()Lcom/roblox/client/a;

    move-result-object p1

    sget p2, Lsg/q0;->v1:I

    invoke-virtual {p1, p2}, Lcom/roblox/client/b;->U(I)V
    :try_end_4
    .catch Lsg/u0; {:try_start_4 .. :try_end_4} :catch_5

    goto/16 :goto_8

    :catch_5
    invoke-static {}, Lsg/y1;->v2()V

    goto/16 :goto_8

    :cond_9
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->O()Z

    move-result p2

    if-eqz p2, :cond_a

    const-string p2, "ctx"

    invoke-virtual {v6, p2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "type"

    invoke-virtual {v6, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v4}, Lgk/e0;->c(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-eqz p2, :cond_a

    if-eqz v0, :cond_a

    const-string v10, "subscription"

    invoke-virtual {p2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a

    const-string p2, "RobloxWebFragment to start an in-app subscription purchase."

    invoke-static {v8, p2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string p2, "GooglePlayStore"

    invoke-static {v0, p1, p2, v9}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativePerformSubscriptionPurchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_a
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->H1()Z

    move-result p2

    const-string v0, "purchaseStart"

    if-eqz p2, :cond_b

    const-string p2, "PaymentsProtocolV2: tryStartInAppPurchase."

    invoke-static {v8, p2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v7}, Lfj/a0;->R(Landroid/content/Context;)Lfj/a0;

    move-result-object v4

    iget-object p2, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-virtual {p2}, Lsg/y1;->F2()Ljava/lang/String;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lsg/t0;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lsg/y1$i;->b:Lsg/y1;

    iget-object v9, p2, Lsg/y1;->y0:Lej/j;

    new-instance v10, Lsg/z1;

    invoke-direct {v10, p0}, Lsg/z1;-><init>(Lsg/y1$i;)V

    move-object v8, v7

    move-object v7, v5

    move-object v5, p1

    invoke-interface/range {v4 .. v10}, Lej/g;->e(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Le4/q;Lej/j;Ljava/lang/Runnable;)V

    goto/16 :goto_8

    :cond_b
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->m3()Z

    move-result p2

    const-string v9, "UnsupportedOperationException thrown while parsing paymentSession parameter for purchase url"

    if-eqz p2, :cond_c

    sget-object p2, Lcom/roblox/client/purchase/IAPPurchaseManager;->l:Ljava/lang/String;

    invoke-static {p2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetMetricsPurchaseType(Ljava/lang/String;)V

    :try_start_5
    invoke-virtual {v6, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2
    :try_end_5
    .catch Ljava/lang/NullPointerException; {:try_start_5 .. :try_end_5} :catch_7
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_5 .. :try_end_5} :catch_6

    goto :goto_3

    :catch_6
    invoke-static {v8, v9}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :catch_7
    invoke-static {v8, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :goto_2
    const-string p2, ""

    :goto_3
    invoke-static {v7}, Lfj/m;->F0(Landroid/content/Context;)Lfj/m;

    move-result-object v0

    invoke-interface {v0, v1}, Lej/g;->j(Ljava/lang/String;)Z

    invoke-interface {v0, v3}, Lej/g;->k(Z)V

    invoke-static {v3}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentsProtocolIsInApp(Z)V

    invoke-static {p2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetPaymentSessionId(Ljava/lang/String;)V

    invoke-interface {v0, p1}, Lej/g;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeSetProviderCurrencyCode(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/roblox/client/purchase/IAPPurchaseManager;->nativeBeginPaymentsProtocolPurchase(Ljava/lang/String;)V

    goto/16 :goto_8

    :cond_c
    move-object p2, v4

    invoke-static {v7}, Lfj/m;->F0(Landroid/content/Context;)Lfj/m;

    move-result-object v4

    if-nez v4, :cond_d

    :try_start_6
    iget-object p1, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-virtual {p1}, Lsg/y1;->D2()Lcom/roblox/client/a;

    move-result-object p1

    sget p2, Lsg/q0;->v1:I

    invoke-virtual {p1, p2}, Lcom/roblox/client/b;->U(I)V
    :try_end_6
    .catch Lsg/u0; {:try_start_6 .. :try_end_6} :catch_8

    goto :goto_8

    :catch_8
    invoke-static {}, Lsg/y1;->v2()V

    goto :goto_8

    :cond_d
    iget-object v10, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-virtual {v10}, Lsg/y1;->F2()Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Lsg/t0;->d(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_7
    const-string v0, "recurring"

    invoke-virtual {v6, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_7
    .catch Ljava/lang/NullPointerException; {:try_start_7 .. :try_end_7} :catch_a
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_7 .. :try_end_7} :catch_9

    goto :goto_5

    :catch_9
    const-string v0, "UnsupportedOperationException thrown while parsing recurring parameter for purchase url"

    invoke-static {v8, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :catch_a
    const-string v0, "NullPointerException thrown while parsing recurring parameter for purchase url"

    invoke-static {v8, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :goto_4
    move-object v0, v1

    :goto_5
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :try_start_8
    invoke-virtual {v6, p2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_8
    .catch Ljava/lang/NullPointerException; {:try_start_8 .. :try_end_8} :catch_c
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_8 .. :try_end_8} :catch_b

    :goto_6
    move-object v10, v1

    goto :goto_7

    :catch_b
    invoke-static {v8, v9}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_6

    :catch_c
    invoke-static {v8, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_6

    :goto_7
    iget-object p2, p0, Lsg/y1$i;->b:Lsg/y1;

    iget-object v8, p2, Lsg/y1;->y0:Lej/j;

    move-object v6, p1

    move v9, v0

    invoke-interface/range {v4 .. v10}, Lej/g;->h(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lej/j;ZLjava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_e

    :try_start_9
    iget-object p1, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-virtual {p1}, Lsg/y1;->D2()Lcom/roblox/client/a;

    move-result-object p1

    sget p2, Lsg/q0;->q1:I

    invoke-virtual {p1, p2}, Lcom/roblox/client/b;->U(I)V
    :try_end_9
    .catch Lsg/u0; {:try_start_9 .. :try_end_9} :catch_d

    goto :goto_8

    :catch_d
    invoke-static {}, Lsg/y1;->v2()V

    :cond_e
    :goto_8
    return v3

    :cond_f
    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v0

    new-instance v1, Lsg/a2;

    invoke-direct {v1, p0, p2, v2, p1}, Lsg/a2;-><init>(Lsg/y1$i;Ljava/lang/String;Le4/q;Landroid/webkit/WebView;)V

    invoke-virtual {v0, p2, v1}, Lkm/f;->p(Ljava/lang/String;Lkm/f$k;)V

    return v3

    :cond_10
    :goto_9
    const-string p1, "RWF.shouldOverrideUrlLoading() activity is null or finishing"

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return v3
.end method

.method public final synthetic e()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-virtual {v0}, Lsg/y1;->D2()Lcom/roblox/client/a;

    move-result-object v0

    sget v1, Lsg/q0;->q1:I

    invoke-virtual {v0, v1}, Lcom/roblox/client/b;->U(I)V
    :try_end_0
    .catch Lsg/u0; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-static {}, Lsg/y1;->v2()V

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
    iget-object p1, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-static {p1}, Lsg/y1;->n2(Lsg/y1;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p3, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final synthetic g(Ljava/lang/String;Le4/q;Landroid/webkit/WebView;Z)V
    .locals 2

    if-eqz p4, :cond_2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->d1()Z

    move-result p2

    const/4 p3, 0x0

    const-string p4, "android_webview"

    if-eqz p2, :cond_1

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object p2

    invoke-virtual {p2, p1, p4, p3}, Lkm/f;->x(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {p2, p1, p4}, Lkm/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object p4

    new-instance v0, Lsg/y1$g;

    iget-object v1, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-direct {v0, v1}, Lsg/y1$g;-><init>(Lsg/y1;)V

    invoke-virtual {p4, v0}, Lfv/c;->j(Ljava/lang/Object;)V

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_0

    invoke-virtual {p2, p3}, Lkm/f;->j(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p2, p1}, Lkm/f;->m(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object p2

    new-instance v0, Lsg/y1$g;

    iget-object v1, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-direct {v0, v1}, Lsg/y1$g;-><init>(Lsg/y1;)V

    invoke-virtual {p2, v0}, Lfv/c;->j(Ljava/lang/Object;)V

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object p2

    invoke-virtual {p2, p1, p4, p3}, Lkm/f;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object p2

    invoke-virtual {p2, p1}, Lkm/f;->k(Ljava/lang/String;)V

    return-void

    :cond_2
    sget-object p4, Lcom/roblox/protocols/webview/DomainAllowListChecker;->a:Lcom/roblox/protocols/webview/DomainAllowListChecker;

    invoke-virtual {p4}, Lcom/roblox/protocols/webview/DomainAllowListChecker;->enableDomainAllowListChecker()Z

    move-result p4

    if-eqz p4, :cond_3

    iget-object p2, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-static {p2, p1}, Lsg/y1;->s2(Lsg/y1;Ljava/lang/String;)V

    return-void

    :cond_3
    new-instance p4, Lsg/b2;

    invoke-direct {p4, p0, p2, p1, p3}, Lsg/b2;-><init>(Lsg/y1$i;Le4/q;Ljava/lang/String;Landroid/webkit/WebView;)V

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

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-static {v0}, Lsg/y1;->m2(Lsg/y1;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

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

    iget-object v0, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-virtual {v0, p2}, Lsg/y1;->X2(Ljava/lang/String;)V

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

    iput-object p1, p0, Lsg/y1$i;->a:Ljava/lang/String;

    :cond_1
    invoke-static {}, Lvh/m;->b()Lvh/m;

    move-result-object p1

    invoke-virtual {p1, p2}, Lvh/m;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lsg/y1$i;->b:Lsg/y1;

    iget-object p1, p1, Lsg/y1;->g0:Lcom/roblox/client/hybrid/RBHybridWebView;

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

    iget-object p1, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-virtual {p1, p2}, Lsg/y1;->W2(Ljava/lang/String;)V

    iget-object p1, p0, Lsg/y1$i;->b:Lsg/y1;

    invoke-static {p1}, Lsg/y1;->m2(Lsg/y1;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

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

    iget-object v1, p0, Lsg/y1$i;->a:Ljava/lang/String;

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
    iput-object v0, p0, Lsg/y1$i;->a:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lsg/y1$i;->d(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_1
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lsg/y1$i;->d(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
