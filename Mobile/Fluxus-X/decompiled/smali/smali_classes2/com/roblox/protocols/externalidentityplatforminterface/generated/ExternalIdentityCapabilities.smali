.class public final Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityCapabilities;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field final apple:Z

.field final google:Z


# direct methods
.method public constructor <init>(ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityCapabilities;->google:Z

    iput-boolean p2, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityCapabilities;->apple:Z

    return-void
.end method


# virtual methods
.method public getApple()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityCapabilities;->apple:Z

    return v0
.end method

.method public getGoogle()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityCapabilities;->google:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ExternalIdentityCapabilities{google="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityCapabilities;->google:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",apple="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityCapabilities;->apple:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
