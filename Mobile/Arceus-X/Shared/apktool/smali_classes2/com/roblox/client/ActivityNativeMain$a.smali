.class public Lcom/roblox/client/ActivityNativeMain$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/c$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/ActivityNativeMain;->g(Lnl/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/client/ActivityNativeMain;


# direct methods
.method public constructor <init>(Lcom/roblox/client/ActivityNativeMain;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/ActivityNativeMain$a;->a:Lcom/roblox/client/ActivityNativeMain;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain$a;->a:Lcom/roblox/client/ActivityNativeMain;

    invoke-static {v0}, Lcom/roblox/client/ActivityNativeMain;->u2(Lcom/roblox/client/ActivityNativeMain;)Lcom/roblox/protocols/webview/WebViewProtocol;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/ActivityNativeMain$a;->a:Lcom/roblox/client/ActivityNativeMain;

    invoke-static {v0}, Lcom/roblox/client/ActivityNativeMain;->u2(Lcom/roblox/client/ActivityNativeMain;)Lcom/roblox/protocols/webview/WebViewProtocol;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roblox/protocols/webview/WebViewProtocol;->u(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
