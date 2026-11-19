.class public final Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field final errorClass:Ljava/lang/String;

.field final proofType:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;

.field final provider:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

.field final status:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;


# direct methods
.method public constructor <init>(Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityResult;->provider:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    iput-object p2, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityResult;->status:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    iput-object p3, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityResult;->proofType:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;

    iput-object p4, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityResult;->errorClass:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getErrorClass()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityResult;->errorClass:Ljava/lang/String;

    return-object v0
.end method

.method public getProofType()Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityResult;->proofType:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;

    return-object v0
.end method

.method public getProvider()Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityResult;->provider:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    return-object v0
.end method

.method public getStatus()Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityResult;->status:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ExternalIdentityResult{provider="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityResult;->provider:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityResult;->status:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityStatus;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",proofType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityResult;->proofType:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProofType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",errorClass="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityResult;->errorClass:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
