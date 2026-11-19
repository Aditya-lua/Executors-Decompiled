.class public final Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field final browserStartUrl:Ljava/lang/String;

.field final nonce:Ljava/lang/String;

.field final provider:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;


# direct methods
.method public constructor <init>(Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;->provider:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    iput-object p2, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;->nonce:Ljava/lang/String;

    iput-object p3, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;->browserStartUrl:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getBrowserStartUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;->browserStartUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getNonce()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;->nonce:Ljava/lang/String;

    return-object v0
.end method

.method public getProvider()Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;->provider:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ExternalIdentityRequest{provider="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;->provider:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityProvider;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",nonce="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;->nonce:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",browserStartUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;->browserStartUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
