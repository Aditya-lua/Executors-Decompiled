.class public Lzj/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lf4/k0;Ljava/lang/String;Landroid/os/Bundle;)V
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

    invoke-static {v0, p1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lf4/k0;->a1()V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p0

    invoke-interface {p0}, Lbi/i;->g1()Z

    move-result p0

    const/4 p1, 0x0

    const-string v0, "android_qr_scanner"

    if-eqz p0, :cond_0

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object p0

    invoke-virtual {p0, p2, v0, p1}, Lym/g;->j(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto :goto_0

    :cond_0
    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object p0

    invoke-virtual {p0, p2, v0, p1}, Lym/g;->h(Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_0
    invoke-static {p2}, Lzj/f;->e(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/String;Z)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object p1

    invoke-virtual {p1, p0}, Lym/g;->m(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p1, "QrCodeScanResult"

    const-string v0, "InvalidQr"

    invoke-static {p1, p0, v0}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeBroadcastEventWithNamespace(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic c(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lzj/f;->e(Ljava/lang/String;)V

    return-void
.end method

.method public static d(Lf4/v;)Z
    .locals 2
    .param p0    # Lf4/v;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lf4/v;->l1()Lf4/k0;

    move-result-object p0

    const-string v0, "CustomCaptureFragment"

    invoke-virtual {p0, v0}, Lf4/k0;->n0(Ljava/lang/String;)Lf4/q;

    move-result-object v0

    instance-of v0, v0, Lzj/c;

    if-eqz v0, :cond_0

    const-string v0, "QrCodeScanner"

    const-string v1, "handleOnBackPressed: Return \'Cancel\' using an empty Url."

    invoke-static {v0, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lf4/k0;->a1()V

    const-string p0, ""

    invoke-static {p0}, Lzj/f;->e(Ljava/lang/String;)V

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

    invoke-static {v1, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "QrCodeScanResult"

    const-string v1, "Cancelled"

    invoke-static {v0, p0, v1}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeBroadcastEventWithNamespace(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object v0

    new-instance v1, Lzj/e;

    invoke-direct {v1, p0}, Lzj/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0, v1}, Lym/g;->s(Ljava/lang/String;Lym/g$k;)V

    return-void
.end method

.method public static f(Lf4/v;I)V
    .locals 4
    .param p0    # Lf4/v;
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

    invoke-static {v1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/mlkit/common/sdkinternal/MlKitContext;->initializeIfNeeded(Landroid/content/Context;)Lcom/google/mlkit/common/sdkinternal/MlKitContext;

    const-string v0, "content/fonts/BuilderSans-Medium.otf"

    invoke-static {v0}, Lzj/c;->d2(Ljava/lang/String;)Lzj/c;

    move-result-object v0

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->Q1()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Le/p;->P()Le/p0;

    move-result-object v1

    new-instance v2, Lzj/f$a;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p0}, Lzj/f$a;-><init>(ZLf4/v;)V

    invoke-virtual {v1, v0, v2}, Le/p0;->d(Landroidx/lifecycle/s;Le/m0;)V

    :cond_0
    invoke-virtual {p0}, Lf4/v;->l1()Lf4/k0;

    move-result-object v1

    invoke-virtual {v1}, Lf4/k0;->r()Lf4/t0;

    move-result-object v2

    const-string v3, "CustomCaptureFragment"

    invoke-virtual {v2, p1, v0, v3}, Lf4/t0;->b(ILf4/q;Ljava/lang/String;)Lf4/t0;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lf4/t0;->f(Ljava/lang/String;)Lf4/t0;

    move-result-object p1

    invoke-virtual {p1}, Lf4/t0;->g()I

    new-instance p1, Lzj/d;

    invoke-direct {p1, v1}, Lzj/d;-><init>(Lf4/k0;)V

    const-string v0, "QrCode_requestKey"

    invoke-virtual {v1, v0, p0, p1}, Lf4/k0;->t1(Ljava/lang/String;Landroidx/lifecycle/s;Lf4/p0;)V

    return-void
.end method
