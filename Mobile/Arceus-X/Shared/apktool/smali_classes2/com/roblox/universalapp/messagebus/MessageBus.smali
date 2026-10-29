.class public Lcom/roblox/universalapp/messagebus/MessageBus;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/universalapp/messagebus/MessageBus$d;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lmm/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/roblox/universalapp/messagebus/MessageBus;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(Lcom/roblox/universalapp/messagebus/MessageBus;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/roblox/universalapp/messagebus/MessageBus;->callResponseHandlerRaw(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic b(Lcom/roblox/universalapp/messagebus/MessageBus;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/roblox/universalapp/messagebus/MessageBus;->reportProtocolMethodResponseTelemetryData(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic c(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 0

    invoke-static {p0}, Lcom/roblox/universalapp/messagebus/MessageBus;->e(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method private native callResponseHandlerRaw(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static bridge synthetic d(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/roblox/universalapp/messagebus/MessageBus;->n(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private native doSubscribeProtocolMethodRequestRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;Z)Lcom/roblox/universalapp/messagebus/Connection;
.end method

.method private native doSubscribeProtocolMethodResponseRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;Z)Lcom/roblox/universalapp/messagebus/Connection;
.end method

.method private native doSubscribeRaw(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;Z)Lcom/roblox/universalapp/messagebus/Connection;
.end method

.method public static e(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 1

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static f()Lcom/roblox/universalapp/messagebus/MessageBus;
    .locals 1

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus$d;->a()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v0

    return-object v0
.end method

.method public static g(Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/RawCallback;
    .locals 1

    new-instance v0, Lcom/roblox/universalapp/messagebus/MessageBus$a;

    invoke-direct {v0, p0}, Lcom/roblox/universalapp/messagebus/MessageBus$a;-><init>(Lcom/roblox/universalapp/messagebus/Callback;)V

    return-object v0
.end method

.method public static native getMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static h(Lmm/g;)Lmm/h;
    .locals 1

    new-instance v0, Lmm/c;

    invoke-direct {v0, p0}, Lmm/c;-><init>(Lmm/g;)V

    return-object v0
.end method

.method private native makeRequest(Lcom/roblox/universalapp/messagebus/MakeRequestContractRaw;)V
.end method

.method private native makeRequestRaw(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;)V
.end method

.method public static n(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static o(Ljava/util/Map;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private native reportProtocolMethodRequestTelemetryData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method private native reportProtocolMethodResponseTelemetryData(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
.end method

.method private native setRequestHandler(Lcom/roblox/universalapp/messagebus/RawRequestHandlerContract;)V
.end method

.method private native setRequestHandlerAsync(Lcom/roblox/universalapp/messagebus/AsyncRequestHandlerRawContract;)V
.end method

.method private native setRequestHandlerAsyncRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RequestHandlerAsyncRaw;)V
.end method

.method private native setRequestHandlerRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RequestHandlerRaw;)V
.end method


# virtual methods
.method public native clearRequestHandler(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public native getLastRaw(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public final i(Ljava/lang/String;Ljava/lang/String;Lmm/j;)Lcom/roblox/universalapp/messagebus/RequestHandlerAsyncRaw;
    .locals 1

    new-instance v0, Lcom/roblox/universalapp/messagebus/MessageBus$c;

    invoke-direct {v0, p0, p3, p1, p2}, Lcom/roblox/universalapp/messagebus/MessageBus$c;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lmm/j;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final j(Ljava/lang/String;Ljava/lang/String;Lmm/i;)Lcom/roblox/universalapp/messagebus/RequestHandlerRaw;
    .locals 1

    new-instance v0, Lcom/roblox/universalapp/messagebus/MessageBus$b;

    invoke-direct {v0, p0, p3, p1, p2}, Lcom/roblox/universalapp/messagebus/MessageBus$b;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lmm/i;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public k(Lmm/b;)V
    .locals 4

    invoke-virtual {p1}, Lmm/b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lmm/b;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-direct {p0, v0, v1, v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->reportProtocolMethodRequestTelemetryData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/roblox/universalapp/messagebus/MakeRequestContractRaw;

    invoke-virtual {p1}, Lmm/b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lmm/b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lmm/b;->c()Lorg/json/JSONObject;

    move-result-object v3

    invoke-static {v3}, Lcom/roblox/universalapp/messagebus/MessageBus;->n(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lmm/b;->a()Lmm/g;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->h(Lmm/g;)Lmm/h;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/roblox/universalapp/messagebus/MakeRequestContractRaw;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmm/h;)V

    invoke-direct {p0, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->makeRequest(Lcom/roblox/universalapp/messagebus/MakeRequestContractRaw;)V

    return-void
.end method

.method public l(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p2}, Lcom/roblox/universalapp/messagebus/MessageBus;->n(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/roblox/universalapp/messagebus/MessageBus;->publishRaw(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public m(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "Publish response for protocol: %s, method: %s."

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "MessageBus"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p3}, Lcom/roblox/universalapp/messagebus/MessageBus;->n(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v5

    invoke-static {p5}, Lcom/roblox/universalapp/messagebus/MessageBus;->o(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v6, p4

    invoke-virtual/range {v2 .. v7}, Lcom/roblox/universalapp/messagebus/MessageBus;->publishProtocolMethodResponseRaw(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public p(Ljava/lang/String;Ljava/lang/String;Lmm/i;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/roblox/universalapp/messagebus/MessageBus;->j(Ljava/lang/String;Ljava/lang/String;Lmm/i;)Lcom/roblox/universalapp/messagebus/RequestHandlerRaw;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/universalapp/messagebus/MessageBus;->setRequestHandlerRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RequestHandlerRaw;)V

    return-void
.end method

.method public native publishProtocolMethodRequestRaw(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public native publishProtocolMethodResponseRaw(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
.end method

.method public native publishRaw(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public q(Ljava/lang/String;Ljava/lang/String;Lmm/j;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/roblox/universalapp/messagebus/MessageBus;->i(Ljava/lang/String;Ljava/lang/String;Lmm/j;)Lcom/roblox/universalapp/messagebus/RequestHandlerAsyncRaw;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/universalapp/messagebus/MessageBus;->setRequestHandlerAsyncRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RequestHandlerAsyncRaw;)V

    return-void
.end method

.method public r(Lmm/a;)V
    .locals 5

    new-instance v0, Lcom/roblox/universalapp/messagebus/AsyncRequestHandlerRawContract;

    invoke-virtual {p1}, Lmm/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lmm/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lmm/a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lmm/a;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lmm/a;->a()Lmm/j;

    move-result-object p1

    invoke-virtual {p0, v3, v4, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->i(Ljava/lang/String;Ljava/lang/String;Lmm/j;)Lcom/roblox/universalapp/messagebus/RequestHandlerAsyncRaw;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lcom/roblox/universalapp/messagebus/AsyncRequestHandlerRawContract;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RequestHandlerAsyncRaw;)V

    invoke-direct {p0, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->setRequestHandlerAsync(Lcom/roblox/universalapp/messagebus/AsyncRequestHandlerRawContract;)V

    return-void
.end method

.method public s(Lmm/k;)V
    .locals 5

    new-instance v0, Lcom/roblox/universalapp/messagebus/RawRequestHandlerContract;

    invoke-virtual {p1}, Lmm/k;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lmm/k;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lmm/k;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lmm/k;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lmm/k;->a()Lmm/i;

    move-result-object p1

    invoke-virtual {p0, v3, v4, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->j(Ljava/lang/String;Ljava/lang/String;Lmm/i;)Lcom/roblox/universalapp/messagebus/RequestHandlerRaw;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lcom/roblox/universalapp/messagebus/RawRequestHandlerContract;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RequestHandlerRaw;)V

    invoke-direct {p0, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->setRequestHandler(Lcom/roblox/universalapp/messagebus/RawRequestHandlerContract;)V

    return-void
.end method

.method public native subscribe(Lcom/roblox/universalapp/messagebus/RawSubscriptionContract;)Lcom/roblox/universalapp/messagebus/Connection;
.end method

.method public t(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->u(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;Z)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    return-object p1
.end method

.method public u(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;Z)Lcom/roblox/universalapp/messagebus/Connection;
    .locals 0

    invoke-static {p2}, Lcom/roblox/universalapp/messagebus/MessageBus;->g(Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/RawCallback;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/universalapp/messagebus/MessageBus;->doSubscribeRaw(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;Z)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    return-object p1
.end method

.method public v(Lmm/n;)Lcom/roblox/universalapp/messagebus/Connection;
    .locals 4

    new-instance v0, Lcom/roblox/universalapp/messagebus/RawSubscriptionContract;

    invoke-virtual {p1}, Lmm/n;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lmm/n;->a()Lmm/g;

    move-result-object v2

    invoke-static {v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->h(Lmm/g;)Lmm/h;

    move-result-object v2

    invoke-virtual {p1}, Lmm/n;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lmm/n;->b()Z

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/roblox/universalapp/messagebus/RawSubscriptionContract;-><init>(Ljava/lang/String;Lmm/h;Ljava/lang/String;Z)V

    invoke-virtual {p0, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->subscribe(Lcom/roblox/universalapp/messagebus/RawSubscriptionContract;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    return-object p1
.end method

.method public w(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->x(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;Z)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    return-object p1
.end method

.method public x(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;Z)Lcom/roblox/universalapp/messagebus/Connection;
    .locals 0

    invoke-static {p3}, Lcom/roblox/universalapp/messagebus/MessageBus;->g(Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/RawCallback;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/roblox/universalapp/messagebus/MessageBus;->doSubscribeProtocolMethodRequestRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;Z)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    return-object p1
.end method
