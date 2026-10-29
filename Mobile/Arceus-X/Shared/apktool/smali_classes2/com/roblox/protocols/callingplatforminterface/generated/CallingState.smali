.class public final Lcom/roblox/protocols/callingplatforminterface/generated/CallingState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field final callId:Ljava/lang/String;

.field final status:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingState;->callId:Ljava/lang/String;

    iput-object p2, p0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingState;->status:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    return-void
.end method


# virtual methods
.method public getCallId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingState;->callId:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingState;->status:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CallingState{callId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingState;->callId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/callingplatforminterface/generated/CallingState;->status:Lcom/roblox/protocols/callingplatforminterface/generated/CallingStatus;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
