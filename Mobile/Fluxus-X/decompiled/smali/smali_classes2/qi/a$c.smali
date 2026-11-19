.class public Lqi/a$c;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqi/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public a:Landroid/webkit/WebViewClient;

.field public final synthetic b:Lqi/a;


# direct methods
.method public constructor <init>(Lqi/a;Landroid/webkit/WebViewClient;)V
    .locals 0

    iput-object p1, p0, Lqi/a$c;->b:Lqi/a;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    iput-object p2, p0, Lqi/a$c;->a:Landroid/webkit/WebViewClient;

    return-void
.end method


# virtual methods
.method public onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lqi/a$c;->a:Landroid/webkit/WebViewClient;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebViewClient;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onPageCommitVisible(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lqi/a$c;->a:Landroid/webkit/WebViewClient;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebViewClient;->onPageCommitVisible(Landroid/webkit/WebView;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lqi/a$c;->b:Lqi/a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lqi/a;->j(Lqi/a;Z)V

    iget-object v0, p0, Lqi/a$c;->a:Landroid/webkit/WebViewClient;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lqi/a$c;->b:Lqi/a;

    invoke-static {p1}, Lqi/a;->k(Lqi/a;)V

    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    iget-object v0, p0, Lqi/a$c;->b:Lqi/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lqi/a;->j(Lqi/a;Z)V

    iget-object v0, p0, Lqi/a$c;->a:Landroid/webkit/WebViewClient;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 1

    iget-object v0, p0, Lqi/a$c;->a:Landroid/webkit/WebViewClient;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    :cond_0
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 1

    iget-object v0, p0, Lqi/a$c;->a:Landroid/webkit/WebViewClient;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
