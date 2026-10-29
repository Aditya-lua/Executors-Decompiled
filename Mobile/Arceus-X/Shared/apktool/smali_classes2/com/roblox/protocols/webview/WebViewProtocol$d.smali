.class public Lcom/roblox/protocols/webview/WebViewProtocol$d;
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

    iput-object p1, p0, Lcom/roblox/protocols/webview/WebViewProtocol$d;->a:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)V
    .locals 0

    iget-object p1, p0, Lcom/roblox/protocols/webview/WebViewProtocol$d;->a:Lcom/roblox/protocols/webview/WebViewProtocol;

    invoke-static {p1}, Lcom/roblox/protocols/webview/WebViewProtocol;->b(Lcom/roblox/protocols/webview/WebViewProtocol;)Lnl/b;

    move-result-object p1

    invoke-interface {p1}, Lnl/b;->c()V

    return-void
.end method
