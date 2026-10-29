.class public Lcom/roblox/client/c$b;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/c;->J0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/c;


# direct methods
.method public constructor <init>(Lcom/roblox/client/c;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/c$b;->a:Lcom/roblox/client/c;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z
    .locals 0

    if-eqz p3, :cond_0

    new-instance p2, Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    new-instance p1, Lcom/roblox/client/c$b$a;

    invoke-direct {p1, p0}, Lcom/roblox/client/c$b$a;-><init>(Lcom/roblox/client/c$b;)V

    invoke-virtual {p2, p1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    iget-object p1, p4, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/webkit/WebView$WebViewTransport;

    invoke-virtual {p1, p2}, Landroid/webkit/WebView$WebViewTransport;->setWebView(Landroid/webkit/WebView;)V

    invoke-virtual {p4}, Landroid/os/Message;->sendToTarget()V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z

    move-result p1

    return p1
.end method

.method public onPermissionRequest(Landroid/webkit/PermissionRequest;)V
    .locals 7

    invoke-virtual {p1}, Landroid/webkit/PermissionRequest;->getResources()[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_4

    aget-object v3, v0, v2

    const-string v4, "android.webkit.resource.VIDEO_CAPTURE"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v4, p0, Lcom/roblox/client/c$b;->a:Lcom/roblox/client/c;

    invoke-virtual {v4}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v4

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v5

    invoke-virtual {v5}, Lsg/y;->k()Lom/k;

    move-result-object v5

    sget-object v6, Lom/n;->a:Lom/n;

    invoke-virtual {v5, v6}, Lom/k;->s(Lom/n;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Ll2/b;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v5

    invoke-interface {v5}, Lth/i;->S5()Z

    move-result v5

    const-string v6, "rbx.web"

    if-eqz v5, :cond_1

    if-nez v4, :cond_0

    const-string v4, "Camera permission already granted"

    invoke-static {v6, v4}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/webkit/PermissionRequest;->grant([Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    const-string v3, "Camera permission not granted, requesting via ActivityResultLauncher"

    invoke-static {v6, v3}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v3, p0, Lcom/roblox/client/c$b;->a:Lcom/roblox/client/c;

    invoke-static {v3, p1}, Lcom/roblox/client/c;->Q2(Lcom/roblox/client/c;Landroid/webkit/PermissionRequest;)V

    iget-object v3, p0, Lcom/roblox/client/c$b;->a:Lcom/roblox/client/c;

    invoke-static {v3}, Lcom/roblox/client/c;->P2(Lcom/roblox/client/c;)Lg/c;

    move-result-object v3

    const-string v4, "android.permission.CAMERA"

    invoke-virtual {v3, v4}, Lg/c;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    if-eqz v4, :cond_2

    const-string v3, "No permission granted for camera"

    invoke-static {v6, v3}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Landroid/webkit/PermissionRequest;->deny()V

    goto :goto_1

    :cond_2
    const-string v4, "Permission granted for camera"

    invoke-static {v6, v4}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/webkit/PermissionRequest;->grant([Ljava/lang/String;)V

    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    iget-object v0, p0, Lcom/roblox/client/c$b;->a:Lcom/roblox/client/c;

    invoke-virtual {v0, p1, p2}, Lcom/roblox/client/c;->x3(Landroid/webkit/WebView;I)V

    return-void
.end method

.method public onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebView;",
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;",
            "Landroid/webkit/WebChromeClient$FileChooserParams;",
            ")Z"
        }
    .end annotation

    iget-object p1, p0, Lcom/roblox/client/c$b;->a:Lcom/roblox/client/c;

    iput-object p2, p1, Lcom/roblox/client/c;->U0:Landroid/webkit/ValueCallback;

    new-instance p1, Landroid/content/Intent;

    const-string p2, "android.intent.action.GET_CONTENT"

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string p2, "image/*"

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    iget-object p2, p0, Lcom/roblox/client/c$b;->a:Lcom/roblox/client/c;

    const-string p3, "Select Picture"

    invoke-static {p1, p3}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    const/16 p3, 0x4e9b

    invoke-virtual {p2, p1, p3}, Landroidx/fragment/app/c;->startActivityForResult(Landroid/content/Intent;I)V

    const/4 p1, 0x1

    return p1
.end method
