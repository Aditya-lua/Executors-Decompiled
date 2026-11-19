.class public Lcom/roblox/universalapp/messagebus/MessageBus;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/universalapp/messagebus/MessageBus$Holder;
    }
.end annotation


# static fields
.field public static final CANCELLED:I = 0x1

.field public static final DENIED:I = 0x7

.field public static final INTERNAL:I = 0xd

.field public static final OK:I = 0x0

.field static final TAG:Ljava/lang/String; = "MessageBus"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/roblox/universalapp/messagebus/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/roblox/universalapp/messagebus/MessageBus;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/roblox/universalapp/messagebus/NewCallback;Ljava/lang/String;)Z
    .locals 1

    :try_start_0
    invoke-static {p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->deserializeMessageParams(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/roblox/universalapp/messagebus/NewCallback;->run(Lorg/json/JSONObject;)Z

    move-result p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Serializing message params in Do Subscribe failed with error: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "MessageBus"

    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic b(Lcom/roblox/universalapp/messagebus/MessageBus;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/roblox/universalapp/messagebus/MessageBus;->callResponseHandlerRaw(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic c(Lcom/roblox/universalapp/messagebus/MessageBus;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/roblox/universalapp/messagebus/MessageBus;->reportProtocolMethodResponseTelemetryData(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method private native callResponseHandlerRaw(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static bridge synthetic d(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 0

    invoke-static {p0}, Lcom/roblox/universalapp/messagebus/MessageBus;->deserializeMessageParams(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method private static deserializeMessageParams(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 1

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private native doSubscribeProtocolMethodRequestRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;Z)Lcom/roblox/universalapp/messagebus/Connection;
.end method

.method private native doSubscribeProtocolMethodResponseRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;Z)Lcom/roblox/universalapp/messagebus/Connection;
.end method

.method private native doSubscribeRaw(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;Z)Lcom/roblox/universalapp/messagebus/Connection;
.end method

.method public static bridge synthetic e(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/roblox/universalapp/messagebus/MessageBus;->serializeMessageParams(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getInstance()Lcom/roblox/universalapp/messagebus/MessageBus;
    .locals 1

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus$Holder;->a()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v0

    return-object v0
.end method

.method public static native getMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method private static getRawCallback(Lcom/roblox/universalapp/messagebus/NewCallback;)Lcom/roblox/universalapp/messagebus/NewRawCallback;
    .locals 1

    .line 2
    new-instance v0, Lcom/roblox/universalapp/messagebus/a;

    invoke-direct {v0, p0}, Lcom/roblox/universalapp/messagebus/a;-><init>(Lcom/roblox/universalapp/messagebus/NewCallback;)V

    return-object v0
.end method

.method private static getRawCallback(Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/RawCallback;
    .locals 1

    .line 1
    new-instance v0, Lcom/roblox/universalapp/messagebus/MessageBus$1;

    invoke-direct {v0, p0}, Lcom/roblox/universalapp/messagebus/MessageBus$1;-><init>(Lcom/roblox/universalapp/messagebus/Callback;)V

    return-object v0
.end method

.method private getRequestHandlerAsyncRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RequestHandlerAsync;)Lcom/roblox/universalapp/messagebus/RequestHandlerAsyncRaw;
    .locals 1

    new-instance v0, Lcom/roblox/universalapp/messagebus/MessageBus$3;

    invoke-direct {v0, p0, p3, p1, p2}, Lcom/roblox/universalapp/messagebus/MessageBus$3;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lcom/roblox/universalapp/messagebus/RequestHandlerAsync;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private getRequestHandlerRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RequestHandler;)Lcom/roblox/universalapp/messagebus/RequestHandlerRaw;
    .locals 1

    new-instance v0, Lcom/roblox/universalapp/messagebus/MessageBus$2;

    invoke-direct {v0, p0, p3, p1, p2}, Lcom/roblox/universalapp/messagebus/MessageBus$2;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lcom/roblox/universalapp/messagebus/RequestHandler;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private native makeRequest(Lcom/roblox/universalapp/messagebus/MakeRequestContractRaw;)V
.end method

.method private native makeRequestRaw(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;)V
.end method

.method private native reportProtocolMethodRequestTelemetryData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method private native reportProtocolMethodResponseTelemetryData(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
.end method

.method private static serializeMessageParams(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static serializeTelemetryMetadataMap(Ljava/util/Map;)Ljava/lang/String;
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

.method public makeRequest(Lcom/roblox/universalapp/messagebus/MakeRequestContract;)V
    .locals 4

    .line 5
    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/MakeRequestContract;->getProtocolName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/MakeRequestContract;->getMethodName()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-direct {p0, v0, v1, v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->reportProtocolMethodRequestTelemetryData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    new-instance v0, Lcom/roblox/universalapp/messagebus/MakeRequestContractRaw;

    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/MakeRequestContract;->getProtocolName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/MakeRequestContract;->getMethodName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/MakeRequestContract;->getParams()Lorg/json/JSONObject;

    move-result-object v3

    invoke-static {v3}, Lcom/roblox/universalapp/messagebus/MessageBus;->serializeMessageParams(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/MakeRequestContract;->getCallback()Lcom/roblox/universalapp/messagebus/NewCallback;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->getRawCallback(Lcom/roblox/universalapp/messagebus/NewCallback;)Lcom/roblox/universalapp/messagebus/NewRawCallback;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/roblox/universalapp/messagebus/MakeRequestContractRaw;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/NewRawCallback;)V

    invoke-direct {p0, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->makeRequest(Lcom/roblox/universalapp/messagebus/MakeRequestContractRaw;)V

    return-void
.end method

.method public makeRequest(Lcom/roblox/universalapp/messagebus/MakeRequestContract;Lorg/json/JSONObject;)V
    .locals 3

    .line 7
    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/MakeRequestContract;->getProtocolName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/MakeRequestContract;->getMethodName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Lcom/roblox/universalapp/messagebus/MessageBus;->serializeMessageParams(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, v0, v1, p2}, Lcom/roblox/universalapp/messagebus/MessageBus;->reportProtocolMethodRequestTelemetryData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    new-instance p2, Lcom/roblox/universalapp/messagebus/MakeRequestContractRaw;

    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/MakeRequestContract;->getProtocolName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/MakeRequestContract;->getMethodName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/MakeRequestContract;->getParams()Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->serializeMessageParams(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/MakeRequestContract;->getCallback()Lcom/roblox/universalapp/messagebus/NewCallback;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->getRawCallback(Lcom/roblox/universalapp/messagebus/NewCallback;)Lcom/roblox/universalapp/messagebus/NewRawCallback;

    move-result-object p1

    invoke-direct {p2, v0, v1, v2, p1}, Lcom/roblox/universalapp/messagebus/MakeRequestContractRaw;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/NewRawCallback;)V

    invoke-direct {p0, p2}, Lcom/roblox/universalapp/messagebus/MessageBus;->makeRequest(Lcom/roblox/universalapp/messagebus/MakeRequestContractRaw;)V

    return-void
.end method

.method public makeRequest(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/roblox/universalapp/messagebus/Callback;)V
    .locals 1

    .line 1
    const-string v0, ""

    invoke-direct {p0, p1, p2, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->reportProtocolMethodRequestTelemetryData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {p3}, Lcom/roblox/universalapp/messagebus/MessageBus;->serializeMessageParams(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p4}, Lcom/roblox/universalapp/messagebus/MessageBus;->getRawCallback(Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/RawCallback;

    move-result-object p4

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/roblox/universalapp/messagebus/MessageBus;->makeRequestRaw(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;)V

    return-void
.end method

.method public makeRequest(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/roblox/universalapp/messagebus/Callback;Lorg/json/JSONObject;)V
    .locals 0

    .line 3
    invoke-static {p5}, Lcom/roblox/universalapp/messagebus/MessageBus;->serializeMessageParams(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p5

    invoke-direct {p0, p1, p2, p5}, Lcom/roblox/universalapp/messagebus/MessageBus;->reportProtocolMethodRequestTelemetryData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-static {p3}, Lcom/roblox/universalapp/messagebus/MessageBus;->serializeMessageParams(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p4}, Lcom/roblox/universalapp/messagebus/MessageBus;->getRawCallback(Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/RawCallback;

    move-result-object p4

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/roblox/universalapp/messagebus/MessageBus;->makeRequestRaw(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;)V

    return-void
.end method

.method public publish(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p2}, Lcom/roblox/universalapp/messagebus/MessageBus;->serializeMessageParams(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/roblox/universalapp/messagebus/MessageBus;->publishRaw(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public publishProtocolMethodRequest(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "Publish request for protocol: %s, method: %s."

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "MessageBus"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p3}, Lcom/roblox/universalapp/messagebus/MessageBus;->serializeMessageParams(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p4}, Lcom/roblox/universalapp/messagebus/MessageBus;->serializeTelemetryMetadataMap(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/roblox/universalapp/messagebus/MessageBus;->publishProtocolMethodRequestRaw(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public native publishProtocolMethodRequestRaw(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public publishProtocolMethodResponse(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/Map;)V
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

    invoke-static {p3}, Lcom/roblox/universalapp/messagebus/MessageBus;->serializeMessageParams(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v5

    invoke-static {p5}, Lcom/roblox/universalapp/messagebus/MessageBus;->serializeTelemetryMetadataMap(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v6, p4

    invoke-virtual/range {v2 .. v7}, Lcom/roblox/universalapp/messagebus/MessageBus;->publishProtocolMethodResponseRaw(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public native publishProtocolMethodResponseRaw(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
.end method

.method public native publishRaw(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public setRequestHandler(Lcom/roblox/universalapp/messagebus/AsyncRequestHandlerContract;)V
    .locals 5

    .line 5
    new-instance v0, Lcom/roblox/universalapp/messagebus/AsyncRequestHandlerRawContract;

    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/AsyncRequestHandlerContract;->getProtocolName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/AsyncRequestHandlerContract;->getMethodName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/AsyncRequestHandlerContract;->getProtocolName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/AsyncRequestHandlerContract;->getProtocolName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/AsyncRequestHandlerContract;->getCallback()Lcom/roblox/universalapp/messagebus/RequestHandlerAsync;

    move-result-object p1

    invoke-direct {p0, v3, v4, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->getRequestHandlerAsyncRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RequestHandlerAsync;)Lcom/roblox/universalapp/messagebus/RequestHandlerAsyncRaw;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lcom/roblox/universalapp/messagebus/AsyncRequestHandlerRawContract;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RequestHandlerAsyncRaw;)V

    .line 6
    invoke-direct {p0, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->setRequestHandlerAsync(Lcom/roblox/universalapp/messagebus/AsyncRequestHandlerRawContract;)V

    return-void
.end method

.method public setRequestHandler(Lcom/roblox/universalapp/messagebus/RequestHandlerContract;)V
    .locals 5

    .line 3
    new-instance v0, Lcom/roblox/universalapp/messagebus/RawRequestHandlerContract;

    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/RequestHandlerContract;->getProtocolName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/RequestHandlerContract;->getMethodName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/RequestHandlerContract;->getProtocolName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/RequestHandlerContract;->getMethodName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/RequestHandlerContract;->getCallback()Lcom/roblox/universalapp/messagebus/RequestHandler;

    move-result-object p1

    invoke-direct {p0, v3, v4, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->getRequestHandlerRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RequestHandler;)Lcom/roblox/universalapp/messagebus/RequestHandlerRaw;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lcom/roblox/universalapp/messagebus/RawRequestHandlerContract;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RequestHandlerRaw;)V

    .line 4
    invoke-direct {p0, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->setRequestHandler(Lcom/roblox/universalapp/messagebus/RawRequestHandlerContract;)V

    return-void
.end method

.method public setRequestHandler(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RequestHandler;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/universalapp/messagebus/MessageBus;->getRequestHandlerRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RequestHandler;)Lcom/roblox/universalapp/messagebus/RequestHandlerRaw;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/universalapp/messagebus/MessageBus;->setRequestHandlerRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RequestHandlerRaw;)V

    return-void
.end method

.method public setRequestHandler(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RequestHandlerAsync;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/universalapp/messagebus/MessageBus;->getRequestHandlerAsyncRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RequestHandlerAsync;)Lcom/roblox/universalapp/messagebus/RequestHandlerAsyncRaw;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/universalapp/messagebus/MessageBus;->setRequestHandlerAsyncRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RequestHandlerAsyncRaw;)V

    return-void
.end method

.method public native subscribe(Lcom/roblox/universalapp/messagebus/RawSubscriptionContract;)Lcom/roblox/universalapp/messagebus/Connection;
.end method

.method public subscribe(Lcom/roblox/universalapp/messagebus/SubscriptionContract;)Lcom/roblox/universalapp/messagebus/Connection;
    .locals 4

    .line 3
    new-instance v0, Lcom/roblox/universalapp/messagebus/RawSubscriptionContract;

    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->getMid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->getCallback()Lcom/roblox/universalapp/messagebus/NewCallback;

    move-result-object v2

    invoke-static {v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->getRawCallback(Lcom/roblox/universalapp/messagebus/NewCallback;)Lcom/roblox/universalapp/messagebus/NewRawCallback;

    move-result-object v2

    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->getDomain()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/roblox/universalapp/messagebus/SubscriptionContract;->getDisconnectAfterReceive()Z

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/roblox/universalapp/messagebus/RawSubscriptionContract;-><init>(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/NewRawCallback;Ljava/lang/String;Z)V

    .line 4
    invoke-virtual {p0, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->subscribe(Lcom/roblox/universalapp/messagebus/RawSubscriptionContract;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    return-object p1
.end method

.method public subscribe(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->subscribe(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;Z)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    return-object p1
.end method

.method public subscribe(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;Z)Lcom/roblox/universalapp/messagebus/Connection;
    .locals 0

    .line 1
    invoke-static {p2}, Lcom/roblox/universalapp/messagebus/MessageBus;->getRawCallback(Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/RawCallback;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/universalapp/messagebus/MessageBus;->doSubscribeRaw(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;Z)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    return-object p1
.end method

.method public subscribeProtocolMethodRequest(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->subscribeProtocolMethodRequest(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;Z)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    return-object p1
.end method

.method public subscribeProtocolMethodRequest(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;Z)Lcom/roblox/universalapp/messagebus/Connection;
    .locals 0

    .line 1
    invoke-static {p3}, Lcom/roblox/universalapp/messagebus/MessageBus;->getRawCallback(Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/RawCallback;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/roblox/universalapp/messagebus/MessageBus;->doSubscribeProtocolMethodRequestRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;Z)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    return-object p1
.end method

.method public subscribeProtocolMethodResponse(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->subscribeProtocolMethodResponse(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;Z)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    return-object p1
.end method

.method public subscribeProtocolMethodResponse(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;Z)Lcom/roblox/universalapp/messagebus/Connection;
    .locals 0

    .line 1
    invoke-static {p3}, Lcom/roblox/universalapp/messagebus/MessageBus;->getRawCallback(Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/RawCallback;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/roblox/universalapp/messagebus/MessageBus;->doSubscribeProtocolMethodResponseRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;Z)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    return-object p1
.end method

.method public subscribeRaw(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;)Lcom/roblox/universalapp/messagebus/Connection;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->doSubscribeRaw(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;Z)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    return-object p1
.end method

.method public subscribeRaw(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;Z)Lcom/roblox/universalapp/messagebus/Connection;
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/universalapp/messagebus/MessageBus;->doSubscribeRaw(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RawCallback;Z)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    return-object p1
.end method
