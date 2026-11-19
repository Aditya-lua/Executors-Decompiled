.class public Lcom/roblox/engine/jni/model/ChannelRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private expiration:J

.field private name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/engine/jni/model/ChannelRecord;->name:Ljava/lang/String;

    iput-wide p2, p0, Lcom/roblox/engine/jni/model/ChannelRecord;->expiration:J

    return-void
.end method


# virtual methods
.method public getExpiration()J
    .locals 2

    iget-wide v0, p0, Lcom/roblox/engine/jni/model/ChannelRecord;->expiration:J

    return-wide v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/model/ChannelRecord;->name:Ljava/lang/String;

    return-object v0
.end method

.method public isEmpty()Z
    .locals 4

    const-wide/16 v0, 0x0

    iget-wide v2, p0, Lcom/roblox/engine/jni/model/ChannelRecord;->expiration:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    iget-object v0, p0, Lcom/roblox/engine/jni/model/ChannelRecord;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isExpired(J)Z
    .locals 2

    iget-wide v0, p0, Lcom/roblox/engine/jni/model/ChannelRecord;->expiration:J

    cmp-long p1, v0, p1

    if-gez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public isReset()Z
    .locals 4

    const-wide/16 v0, 0x0

    iget-wide v2, p0, Lcom/roblox/engine/jni/model/ChannelRecord;->expiration:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isValid()Z
    .locals 4

    const-wide/16 v0, 0x0

    iget-wide v2, p0, Lcom/roblox/engine/jni/model/ChannelRecord;->expiration:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public setExpiration(J)V
    .locals 0

    iput-wide p1, p0, Lcom/roblox/engine/jni/model/ChannelRecord;->expiration:J

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/model/ChannelRecord;->name:Ljava/lang/String;

    return-void
.end method
