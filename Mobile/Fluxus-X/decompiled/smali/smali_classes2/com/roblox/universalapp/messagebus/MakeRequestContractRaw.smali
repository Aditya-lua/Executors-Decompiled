.class Lcom/roblox/universalapp/messagebus/MakeRequestContractRaw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final callback:Lcom/roblox/universalapp/messagebus/NewRawCallback;

.field private final methodName:Ljava/lang/String;

.field private final params:Ljava/lang/String;

.field private final protocolName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/messagebus/NewRawCallback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/universalapp/messagebus/MakeRequestContractRaw;->protocolName:Ljava/lang/String;

    iput-object p2, p0, Lcom/roblox/universalapp/messagebus/MakeRequestContractRaw;->methodName:Ljava/lang/String;

    iput-object p4, p0, Lcom/roblox/universalapp/messagebus/MakeRequestContractRaw;->callback:Lcom/roblox/universalapp/messagebus/NewRawCallback;

    iput-object p3, p0, Lcom/roblox/universalapp/messagebus/MakeRequestContractRaw;->params:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getCallback()Lcom/roblox/universalapp/messagebus/NewRawCallback;
    .locals 1

    iget-object v0, p0, Lcom/roblox/universalapp/messagebus/MakeRequestContractRaw;->callback:Lcom/roblox/universalapp/messagebus/NewRawCallback;

    return-object v0
.end method

.method public final getMethodName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/universalapp/messagebus/MakeRequestContractRaw;->methodName:Ljava/lang/String;

    return-object v0
.end method

.method public final getParams()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/universalapp/messagebus/MakeRequestContractRaw;->params:Ljava/lang/String;

    return-object v0
.end method

.method public final getProtocolName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/universalapp/messagebus/MakeRequestContractRaw;->protocolName:Ljava/lang/String;

    return-object v0
.end method
