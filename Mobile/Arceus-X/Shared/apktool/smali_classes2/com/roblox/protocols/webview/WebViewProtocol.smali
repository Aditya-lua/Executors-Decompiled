.class public Lcom/roblox/protocols/webview/WebViewProtocol;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public final b:Lnl/b;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public c:Lcom/roblox/universalapp/messagebus/Connection;

.field public d:Lcom/roblox/universalapp/messagebus/Connection;

.field public e:Lcom/roblox/universalapp/messagebus/Connection;


# direct methods
.method public constructor <init>(Lcom/roblox/protocols/webview/a$f;)V
    .locals 3
    .param p1    # Lcom/roblox/protocols/webview/a$f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "WebViewProtocol"

    iput-object v0, p0, Lcom/roblox/protocols/webview/WebViewProtocol;->a:Ljava/lang/String;

    new-instance v0, Lcom/roblox/protocols/webview/a;

    invoke-direct {v0, p1}, Lcom/roblox/protocols/webview/a;-><init>(Lcom/roblox/protocols/webview/a$f;)V

    iput-object v0, p0, Lcom/roblox/protocols/webview/WebViewProtocol;->b:Lnl/b;

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->f()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object p1

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->getProtocolName()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->getIsAvailableId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/roblox/protocols/webview/WebViewProtocol$a;

    invoke-direct {v2, p0}, Lcom/roblox/protocols/webview/WebViewProtocol$a;-><init>(Lcom/roblox/protocols/webview/WebViewProtocol;)V

    invoke-virtual {p1, v0, v1, v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->p(Ljava/lang/String;Ljava/lang/String;Lmm/i;)V

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->f()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object p1

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->getProtocolName()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->getOpenWindowId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->getMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/roblox/protocols/webview/WebViewProtocol$b;

    invoke-direct {v1, p0}, Lcom/roblox/protocols/webview/WebViewProtocol$b;-><init>(Lcom/roblox/protocols/webview/WebViewProtocol;)V

    invoke-virtual {p1, v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->t(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/protocols/webview/WebViewProtocol;->c:Lcom/roblox/universalapp/messagebus/Connection;

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->f()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object p1

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->getProtocolName()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->getMutateWindowId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->getMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/roblox/protocols/webview/WebViewProtocol$c;

    invoke-direct {v1, p0}, Lcom/roblox/protocols/webview/WebViewProtocol$c;-><init>(Lcom/roblox/protocols/webview/WebViewProtocol;)V

    invoke-virtual {p1, v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->t(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/protocols/webview/WebViewProtocol;->d:Lcom/roblox/universalapp/messagebus/Connection;

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->f()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object p1

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->getProtocolName()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->getCloseWindowId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->getMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/roblox/protocols/webview/WebViewProtocol$d;

    invoke-direct {v1, p0}, Lcom/roblox/protocols/webview/WebViewProtocol$d;-><init>(Lcom/roblox/protocols/webview/WebViewProtocol;)V

    invoke-virtual {p1, v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->t(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/protocols/webview/WebViewProtocol;->e:Lcom/roblox/universalapp/messagebus/Connection;

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->initializeAndroidWebViewProtocol()V

    return-void
.end method

.method public static bridge synthetic a(Lcom/roblox/protocols/webview/WebViewProtocol;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/roblox/protocols/webview/WebViewProtocol;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/roblox/protocols/webview/WebViewProtocol;)Lnl/b;
    .locals 0

    iget-object p0, p0, Lcom/roblox/protocols/webview/WebViewProtocol;->b:Lnl/b;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/roblox/protocols/webview/WebViewProtocol;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/protocols/webview/WebViewProtocol;->r(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/roblox/protocols/webview/WebViewProtocol;Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/protocols/webview/WebViewProtocol;->s(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/roblox/protocols/webview/WebViewProtocol;Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/protocols/webview/WebViewProtocol;->t(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic f()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->getAvailableKey()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic g()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->getBackButtonVisibleKey()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static native getAvailableKey()Ljava/lang/String;
.end method

.method private static native getBackButtonVisibleKey()Ljava/lang/String;
.end method

.method private static native getCloseWindowId()Ljava/lang/String;
.end method

.method private static native getFFlagWebViewHasBackButtonVisible()Z
.end method

.method private static native getFFlagWebViewHasHideHeader()Z
.end method

.method private static native getHandleWindowCloseId()Ljava/lang/String;
.end method

.method private static native getHideHeaderKey()Ljava/lang/String;
.end method

.method private static native getIsAvailableId()Ljava/lang/String;
.end method

.method private static native getIsVisibleKey()Ljava/lang/String;
.end method

.method private static native getMutateWindowId()Ljava/lang/String;
.end method

.method private static native getOpenWindowId()Ljava/lang/String;
.end method

.method private static native getProtocolName()Ljava/lang/String;
.end method

.method private static native getSearchParamsKey()Ljava/lang/String;
.end method

.method private static native getSearchTypeKey()Ljava/lang/String;
.end method

.method private static native getShowDomainAsTitleKey()Ljava/lang/String;
.end method

.method private static native getTitleKey()Ljava/lang/String;
.end method

.method private static native getUrlKey()Ljava/lang/String;
.end method

.method private static native getWindowTypeKey()Ljava/lang/String;
.end method

.method public static bridge synthetic h()Z
    .locals 1

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->getFFlagWebViewHasBackButtonVisible()Z

    move-result v0

    return v0
.end method

.method public static bridge synthetic i()Z
    .locals 1

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->getFFlagWebViewHasHideHeader()Z

    move-result v0

    return v0
.end method

.method private static native initializeAndroidWebViewProtocol()V
.end method

.method public static bridge synthetic j()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->getHideHeaderKey()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic k()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->getIsVisibleKey()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic l()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->getSearchParamsKey()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic m()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->getSearchTypeKey()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic n()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->getShowDomainAsTitleKey()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic o()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->getTitleKey()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic p()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->getUrlKey()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic q()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->getWindowTypeKey()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static native signalJavascriptCallback(Ljava/lang/String;)V
.end method


# virtual methods
.method public final r(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :cond_0
    return-object v0

    :catch_0
    iget-object p1, p0, Lcom/roblox/protocols/webview/WebViewProtocol;->a:Ljava/lang/String;

    const-string v1, "Received \"%s\" that is not a Boolean type"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {v1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0
.end method

.method public final s(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :cond_0
    return-object v0

    :catch_0
    iget-object p1, p0, Lcom/roblox/protocols/webview/WebViewProtocol;->a:Ljava/lang/String;

    const-string v1, "Received \"%s\" that is not a JSON Object type"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {v1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0
.end method

.method public final t(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :cond_0
    return-object v0

    :catch_0
    iget-object p1, p0, Lcom/roblox/protocols/webview/WebViewProtocol;->a:Ljava/lang/String;

    const-string v1, "Received \"%s\" that is not a String type"

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {v1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0
.end method

.method public u(Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lcom/roblox/protocols/webview/WebViewProtocol;->signalJavascriptCallback(Ljava/lang/String;)V

    return-void
.end method

.method public v()V
    .locals 3

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->f()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v0

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->getProtocolName()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/roblox/protocols/webview/WebViewProtocol;->getHandleWindowCloseId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->getMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->l(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
