.class public Lcom/roblox/protocols/webview/WebViewProtocol$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


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

    iput-object p1, p0, Lcom/roblox/protocols/webview/WebViewProtocol$b;->a:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)V
    .locals 11

    iget-object v0, p0, Lcom/roblox/protocols/webview/WebViewProtocol$b;->a:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->p()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/roblox/protocols/webview/WebViewProtocol;->e(Lcom/roblox/protocols/webview/WebViewProtocol;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    iget-object p1, p0, Lcom/roblox/protocols/webview/WebViewProtocol$b;->a:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-static {p1}, Lcom/roblox/protocols/webview/WebViewProtocol;->a(Lcom/roblox/protocols/webview/WebViewProtocol;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Attempted to open WebView window with no URL"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lcom/roblox/protocols/webview/WebViewProtocol$b;->a:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->o()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/roblox/protocols/webview/WebViewProtocol;->e(Lcom/roblox/protocols/webview/WebViewProtocol;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/roblox/protocols/webview/WebViewProtocol$b;->a:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->l()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/roblox/protocols/webview/WebViewProtocol;->d(Lcom/roblox/protocols/webview/WebViewProtocol;Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/roblox/protocols/webview/WebViewProtocol$b;->a:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->m()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/roblox/protocols/webview/WebViewProtocol;->e(Lcom/roblox/protocols/webview/WebViewProtocol;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lcom/roblox/protocols/webview/WebViewProtocol$b;->a:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->k()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/roblox/protocols/webview/WebViewProtocol;->c(Lcom/roblox/protocols/webview/WebViewProtocol;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v6

    iget-object v0, p0, Lcom/roblox/protocols/webview/WebViewProtocol$b;->a:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->q()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/roblox/protocols/webview/WebViewProtocol;->e(Lcom/roblox/protocols/webview/WebViewProtocol;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget-object v0, p0, Lcom/roblox/protocols/webview/WebViewProtocol$b;->a:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->n()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/roblox/protocols/webview/WebViewProtocol;->c(Lcom/roblox/protocols/webview/WebViewProtocol;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v8

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roblox/protocols/webview/WebViewProtocol$b;->a:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/roblox/protocols/webview/WebViewProtocol;->c(Lcom/roblox/protocols/webview/WebViewProtocol;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v9

    iget-object v0, p0, Lcom/roblox/protocols/webview/WebViewProtocol$b;->a:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->j()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/roblox/protocols/webview/WebViewProtocol;->c(Lcom/roblox/protocols/webview/WebViewProtocol;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v10

    iget-object p1, p0, Lcom/roblox/protocols/webview/WebViewProtocol$b;->a:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-static {p1}, Lcom/roblox/protocols/webview/WebViewProtocol;->b(Lcom/roblox/protocols/webview/WebViewProtocol;)Lnl/b;

    move-result-object v2

    invoke-interface/range {v2 .. v10}, Lnl/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-void

    :cond_2
    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roblox/protocols/webview/WebViewProtocol$b;->a:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/roblox/protocols/webview/WebViewProtocol;->c(Lcom/roblox/protocols/webview/WebViewProtocol;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v9

    iget-object p1, p0, Lcom/roblox/protocols/webview/WebViewProtocol$b;->a:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-static {p1}, Lcom/roblox/protocols/webview/WebViewProtocol;->b(Lcom/roblox/protocols/webview/WebViewProtocol;)Lnl/b;

    move-result-object v2

    invoke-interface/range {v2 .. v9}, Lnl/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-void

    :cond_3
    iget-object p1, p0, Lcom/roblox/protocols/webview/WebViewProtocol$b;->a:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-static {p1}, Lcom/roblox/protocols/webview/WebViewProtocol;->b(Lcom/roblox/protocols/webview/WebViewProtocol;)Lnl/b;

    move-result-object v2

    invoke-interface/range {v2 .. v8}, Lnl/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method
