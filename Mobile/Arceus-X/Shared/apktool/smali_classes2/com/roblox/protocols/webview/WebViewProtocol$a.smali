.class public Lcom/roblox/protocols/webview/WebViewProtocol$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmm/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/protocols/webview/WebViewProtocol;-><init>(Lcom/roblox/protocols/webview/a$f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/protocols/webview/WebViewProtocol;


# direct methods
.method public constructor <init>(Lcom/roblox/protocols/webview/WebViewProtocol;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/protocols/webview/WebViewProtocol$a;->a:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)Lmm/l;
    .locals 3

    new-instance p1, Lmm/l;

    invoke-direct {p1}, Lmm/l;-><init>()V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p1, Lmm/l;->a:Lorg/json/JSONObject;

    :try_start_0
    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->f()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    iget-object v0, p0, Lcom/roblox/protocols/webview/WebViewProtocol$a;->a:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-static {v0}, Lcom/roblox/protocols/webview/WebViewProtocol;->a(Lcom/roblox/protocols/webview/WebViewProtocol;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Failed to write Availability to JSON"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object p1
.end method
