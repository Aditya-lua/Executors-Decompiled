.class Lcom/roblox/universalapp/messagebus/MessageBus$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/RequestHandlerRaw;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/universalapp/messagebus/MessageBus;->getRequestHandlerRaw(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/RequestHandler;)Lcom/roblox/universalapp/messagebus/RequestHandlerRaw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/roblox/universalapp/messagebus/MessageBus;

.field final synthetic val$callback:Lcom/roblox/universalapp/messagebus/RequestHandler;

.field final synthetic val$methodName:Ljava/lang/String;

.field final synthetic val$protocolName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lcom/roblox/universalapp/messagebus/RequestHandler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/universalapp/messagebus/MessageBus$2;->this$0:Lcom/roblox/universalapp/messagebus/MessageBus;

    iput-object p2, p0, Lcom/roblox/universalapp/messagebus/MessageBus$2;->val$callback:Lcom/roblox/universalapp/messagebus/RequestHandler;

    iput-object p3, p0, Lcom/roblox/universalapp/messagebus/MessageBus$2;->val$protocolName:Ljava/lang/String;

    iput-object p4, p0, Lcom/roblox/universalapp/messagebus/MessageBus$2;->val$methodName:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    :try_start_0
    invoke-static {p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->d(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/universalapp/messagebus/MessageBus$2;->val$callback:Lcom/roblox/universalapp/messagebus/RequestHandler;

    invoke-interface {v0, p1}, Lcom/roblox/universalapp/messagebus/RequestHandler;->run(Lorg/json/JSONObject;)Lcom/roblox/universalapp/messagebus/Response;

    move-result-object p1

    iget-object v0, p1, Lcom/roblox/universalapp/messagebus/Response;->customTelemetryData:Lorg/json/JSONObject;

    invoke-static {v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->e(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/universalapp/messagebus/MessageBus$2;->this$0:Lcom/roblox/universalapp/messagebus/MessageBus;

    iget-object v2, p0, Lcom/roblox/universalapp/messagebus/MessageBus$2;->val$protocolName:Ljava/lang/String;

    iget-object v3, p0, Lcom/roblox/universalapp/messagebus/MessageBus$2;->val$methodName:Ljava/lang/String;

    iget v4, p1, Lcom/roblox/universalapp/messagebus/Response;->telemetryResponseCode:I

    invoke-static {v1, v2, v3, v4, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->c(Lcom/roblox/universalapp/messagebus/MessageBus;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    iget-object p1, p1, Lcom/roblox/universalapp/messagebus/Response;->params:Lorg/json/JSONObject;

    invoke-static {p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->e(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Serializing message params in getRequestHandlerRaw failed with error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "MessageBus"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, ""

    return-object p1
.end method
