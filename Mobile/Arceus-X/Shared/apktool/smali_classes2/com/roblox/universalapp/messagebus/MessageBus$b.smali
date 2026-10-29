.class public Lcom/roblox/universalapp/messagebus/MessageBus$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/RequestHandlerRaw;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/universalapp/messagebus/MessageBus;->j(Ljava/lang/String;Ljava/lang/String;Lmm/i;)Lcom/roblox/universalapp/messagebus/RequestHandlerRaw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lmm/i;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/roblox/universalapp/messagebus/MessageBus;


# direct methods
.method public constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lmm/i;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/universalapp/messagebus/MessageBus$b;->d:Lcom/roblox/universalapp/messagebus/MessageBus;

    iput-object p2, p0, Lcom/roblox/universalapp/messagebus/MessageBus$b;->a:Lmm/i;

    iput-object p3, p0, Lcom/roblox/universalapp/messagebus/MessageBus$b;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/roblox/universalapp/messagebus/MessageBus$b;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    :try_start_0
    invoke-static {p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->c(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/universalapp/messagebus/MessageBus$b;->a:Lmm/i;

    invoke-interface {v0, p1}, Lmm/i;->a(Lorg/json/JSONObject;)Lmm/l;

    move-result-object p1

    iget-object v0, p1, Lmm/l;->b:Lorg/json/JSONObject;

    invoke-static {v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->d(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/universalapp/messagebus/MessageBus$b;->d:Lcom/roblox/universalapp/messagebus/MessageBus;

    iget-object v2, p0, Lcom/roblox/universalapp/messagebus/MessageBus$b;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/roblox/universalapp/messagebus/MessageBus$b;->c:Ljava/lang/String;

    iget v4, p1, Lmm/l;->c:I

    invoke-static {v1, v2, v3, v4, v0}, Lcom/roblox/universalapp/messagebus/MessageBus;->b(Lcom/roblox/universalapp/messagebus/MessageBus;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    iget-object p1, p1, Lmm/l;->a:Lorg/json/JSONObject;

    invoke-static {p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->d(Lorg/json/JSONObject;)Ljava/lang/String;

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
