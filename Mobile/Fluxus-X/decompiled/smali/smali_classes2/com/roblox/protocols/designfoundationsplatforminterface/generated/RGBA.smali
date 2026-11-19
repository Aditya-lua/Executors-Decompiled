.class public final Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field final a:D

.field final b:D

.field final g:D

.field final r:D


# direct methods
.method public constructor <init>(DDDD)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;->r:D

    iput-wide p3, p0, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;->g:D

    iput-wide p5, p0, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;->b:D

    iput-wide p7, p0, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;->a:D

    return-void
.end method


# virtual methods
.method public getA()D
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;->a:D

    return-wide v0
.end method

.method public getB()D
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;->b:D

    return-wide v0
.end method

.method public getG()D
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;->g:D

    return-wide v0
.end method

.method public getR()D
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;->r:D

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RGBA{r="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;->r:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ",g="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;->g:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ",b="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;->b:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ",a="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;->a:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
