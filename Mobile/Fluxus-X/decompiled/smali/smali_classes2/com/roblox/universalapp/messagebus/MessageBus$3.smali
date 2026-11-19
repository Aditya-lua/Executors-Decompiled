.class Lcom/roblox/universalapp/messagebus/MessageBus$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/RequestHandlerAsyncRaw;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/universalapp/messagebus/MessageBus;->getRequestHandlerAsyncRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RequestHandlerAsync;)Lcom/roblox/universalapp/messagebus/RequestHandlerAsyncRaw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/roblox/universalapp/messagebus/MessageBus;

.field final synthetic val$asyncCallback:Lcom/roblox/universalapp/messagebus/RequestHandlerAsync;

.field final synthetic val$methodName:Ljava/lang/String;

.field final synthetic val$protocolName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lcom/roblox/universalapp/messagebus/RequestHandlerAsync;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/universalapp/messagebus/MessageBus$3;->this$0:Lcom/roblox/universalapp/messagebus/MessageBus;

    iput-object p2, p0, Lcom/roblox/universalapp/messagebus/MessageBus$3;->val$asyncCallback:Lcom/roblox/universalapp/messagebus/RequestHandlerAsync;

    iput-object p3, p0, Lcom/roblox/universalapp/messagebus/MessageBus$3;->val$protocolName:Ljava/lang/String;

    iput-object p4, p0, Lcom/roblox/universalapp/messagebus/MessageBus$3;->val$methodName:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/roblox/universalapp/messagebus/MessageBus$3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Response;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/roblox/universalapp/messagebus/MessageBus$3;->lambda$run$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Response;)V

    return-void
.end method

.method private synthetic lambda$run$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Response;)V
    .locals 3

    iget-object v0, p4, Lcom/roblox/universalapp/messagebus/Response;->customTelemetryData:Lorg/json/JSONObject;

    invoke-static {v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->e(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/universalapp/messagebus/MessageBus$3;->this$0:Lcom/roblox/universalapp/messagebus/MessageBus;

    iget v2, p4, Lcom/roblox/universalapp/messagebus/Response;->telemetryResponseCode:I

    invoke-static {v1, p1, p2, v2, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->c(Lcom/roblox/universalapp/messagebus/MessageBus;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    iget-object p1, p0, Lcom/roblox/universalapp/messagebus/MessageBus$3;->this$0:Lcom/roblox/universalapp/messagebus/MessageBus;

    iget-object p2, p4, Lcom/roblox/universalapp/messagebus/Response;->params:Lorg/json/JSONObject;

    invoke-static {p2}, Lcom/roblox/universalapp/messagebus/MessageBus;->e(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p3, p2}, Lcom/roblox/universalapp/messagebus/MessageBus;->b(Lcom/roblox/universalapp/messagebus/MessageBus;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public run(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    :try_start_0
    invoke-static {p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->d(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/universalapp/messagebus/MessageBus$3;->val$asyncCallback:Lcom/roblox/universalapp/messagebus/RequestHandlerAsync;

    iget-object v1, p0, Lcom/roblox/universalapp/messagebus/MessageBus$3;->val$protocolName:Ljava/lang/String;

    iget-object v2, p0, Lcom/roblox/universalapp/messagebus/MessageBus$3;->val$methodName:Ljava/lang/String;

    new-instance v3, Lcom/roblox/universalapp/messagebus/b;

    invoke-direct {v3, p0, v1, v2, p2}, Lcom/roblox/universalapp/messagebus/b;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus$3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, p1, v3}, Lcom/roblox/universalapp/messagebus/RequestHandlerAsync;->run(Lorg/json/JSONObject;Lcom/roblox/universalapp/messagebus/ResponseCallback;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Serializing message params in getRequestHandlerAsyncRaw failed with error: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "MessageBus"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
