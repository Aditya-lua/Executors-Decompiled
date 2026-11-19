.class public Lcom/roblox/universalapp/messagebus/MakeRequestContract;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final callback:Lcom/roblox/universalapp/messagebus/NewCallback;

.field private final methodName:Ljava/lang/String;

.field private final params:Lorg/json/JSONObject;

.field private final protocolName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/roblox/universalapp/messagebus/NewCallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/universalapp/messagebus/MakeRequestContract;->protocolName:Ljava/lang/String;

    iput-object p2, p0, Lcom/roblox/universalapp/messagebus/MakeRequestContract;->methodName:Ljava/lang/String;

    iput-object p4, p0, Lcom/roblox/universalapp/messagebus/MakeRequestContract;->callback:Lcom/roblox/universalapp/messagebus/NewCallback;

    iput-object p3, p0, Lcom/roblox/universalapp/messagebus/MakeRequestContract;->params:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final getCallback()Lcom/roblox/universalapp/messagebus/NewCallback;
    .locals 1

    iget-object v0, p0, Lcom/roblox/universalapp/messagebus/MakeRequestContract;->callback:Lcom/roblox/universalapp/messagebus/NewCallback;

    return-object v0
.end method

.method public final getMethodName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/universalapp/messagebus/MakeRequestContract;->methodName:Ljava/lang/String;

    return-object v0
.end method

.method public final getParams()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/roblox/universalapp/messagebus/MakeRequestContract;->params:Lorg/json/JSONObject;

    return-object v0
.end method

.method public final getProtocolName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/universalapp/messagebus/MakeRequestContract;->protocolName:Ljava/lang/String;

    return-object v0
.end method
