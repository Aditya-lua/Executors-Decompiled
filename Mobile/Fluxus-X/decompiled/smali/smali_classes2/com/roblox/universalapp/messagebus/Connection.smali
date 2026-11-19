.class public Lcom/roblox/universalapp/messagebus/Connection;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private ref:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/roblox/universalapp/messagebus/Connection;->ref:J

    return-void
.end method

.method private native deleteSharedPtr(J)V
.end method

.method private native isConnected(J)Z
.end method


# virtual methods
.method public connected()Z
    .locals 2

    iget-wide v0, p0, Lcom/roblox/universalapp/messagebus/Connection;->ref:J

    invoke-direct {p0, v0, v1}, Lcom/roblox/universalapp/messagebus/Connection;->isConnected(J)Z

    move-result v0

    return v0
.end method

.method public disconnect()V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/universalapp/messagebus/Connection;->ref:J

    invoke-direct {p0, v0, v1}, Lcom/roblox/universalapp/messagebus/Connection;->deleteSharedPtr(J)V

    return-void
.end method

.method public finalize()V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/universalapp/messagebus/Connection;->ref:J

    invoke-direct {p0, v0, v1}, Lcom/roblox/universalapp/messagebus/Connection;->deleteSharedPtr(J)V

    return-void
.end method
