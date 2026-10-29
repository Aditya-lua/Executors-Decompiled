.class public Lrj/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    const-string p1, "BundleKey_success"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    const-string v0, "BundleKey_urlString"

    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "... (callback): success = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, ", urlString = "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "QrCodeScanner"

    invoke-static {v0, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->a1()V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p0

    invoke-interface {p0}, Lth/i;->d1()Z

    move-result p0

    const/4 p1, 0x0

    const-string v0, "android_qr_scanner"

    if-eqz p0, :cond_0

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object p0

    invoke-virtual {p0, p2, v0, p1}, Lkm/f;->h(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto :goto_0

    :cond_0
    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object p0

    invoke-virtual {p0, p2, v0, p1}, Lkm/f;->f(Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_0
    invoke-static {p2}, Lrj/f;->e(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/String;Z)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object p1

    invoke-virtual {p1, p0}, Lkm/f;->k(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p1, "QrCodeScanResult"

    const-string v0, "InvalidQr"

    invoke-static {p1, p0, v0}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeBroadcastEventWithNamespace(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic c(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lrj/f;->e(Ljava/lang/String;)V

    return-void
.end method

.method public static d(Le4/q;)Z
    .locals 2
    .param p0    # Le4/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object p0

    const-string v0, "CustomCaptureFragment"

    invoke-virtual {p0, v0}, Landroidx/fragment/app/FragmentManager;->n0(Ljava/lang/String;)Landroidx/fragment/app/c;

    move-result-object v0

    instance-of v0, v0, Lrj/c;

    if-eqz v0, :cond_0

    const-string v0, "QrCodeScanner"

    const-string v1, "handleOnBackPressed: Return \'Cancel\' using an empty Url."

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->a1()V

    const-string p0, ""

    invoke-static {p0}, Lrj/f;->e(Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static e(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleUrlString: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "QrCodeScanner"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "QrCodeScanResult"

    const-string v1, "Cancelled"

    invoke-static {v0, p0, v1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeBroadcastEventWithNamespace(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v0

    new-instance v1, Lrj/e;

    invoke-direct {v1, p0}, Lrj/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0, v1}, Lkm/f;->p(Ljava/lang/String;Lkm/f$k;)V

    return-void
.end method

.method public static f(Le4/q;I)V
    .locals 4
    .param p0    # Le4/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showFragmentInActivity: containerViewId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "QrCodeScanner"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/mlkit/common/sdkinternal/MlKitContext;->initializeIfNeeded(Landroid/content/Context;)Lcom/google/mlkit/common/sdkinternal/MlKitContext;

    const-string v0, "content/fonts/BuilderSans-Medium.otf"

    invoke-static {v0}, Lrj/c;->d2(Ljava/lang/String;)Lrj/c;

    move-result-object v0

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->M1()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Le/p;->Q()Le/p0;

    move-result-object v1

    new-instance v2, Lrj/f$a;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p0}, Lrj/f$a;-><init>(ZLe4/q;)V

    invoke-virtual {v1, v0, v2}, Le/p0;->d(Landroidx/lifecycle/s;Le/m0;)V

    :cond_0
    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->r()Landroidx/fragment/app/h;

    move-result-object v2

    const-string v3, "CustomCaptureFragment"

    invoke-virtual {v2, p1, v0, v3}, Landroidx/fragment/app/h;->b(ILandroidx/fragment/app/c;Ljava/lang/String;)Landroidx/fragment/app/h;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/h;->f(Ljava/lang/String;)Landroidx/fragment/app/h;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/h;->g()I

    new-instance p1, Lrj/d;

    invoke-direct {p1, v1}, Lrj/d;-><init>(Landroidx/fragment/app/FragmentManager;)V

    const-string v0, "QrCode_requestKey"

    invoke-virtual {v1, v0, p0, p1}, Landroidx/fragment/app/FragmentManager;->t1(Ljava/lang/String;Landroidx/lifecycle/s;Le4/f0;)V

    return-void
.end method
