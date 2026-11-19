.class public final Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field final constrained:Z

.field final interfaceType:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

.field final ipv4:[B

.field final ipv6:[B

.field final ipv6PrefixLength:I

.field final metered:Z

.field final pathSatisfied:Z

.field final validation:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;


# direct methods
.method public constructor <init>(Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;[B[BIZLcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;->interfaceType:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    iput-object p2, p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;->ipv4:[B

    iput-object p3, p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;->ipv6:[B

    iput p4, p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;->ipv6PrefixLength:I

    iput-boolean p5, p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;->pathSatisfied:Z

    iput-object p6, p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;->validation:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

    iput-boolean p7, p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;->metered:Z

    iput-boolean p8, p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;->constrained:Z

    return-void
.end method


# virtual methods
.method public getConstrained()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;->constrained:Z

    return v0
.end method

.method public getInterfaceType()Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;->interfaceType:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    return-object v0
.end method

.method public getIpv4()[B
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;->ipv4:[B

    return-object v0
.end method

.method public getIpv6()[B
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;->ipv6:[B

    return-object v0
.end method

.method public getIpv6PrefixLength()I
    .locals 1

    iget v0, p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;->ipv6PrefixLength:I

    return v0
.end method

.method public getMetered()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;->metered:Z

    return v0
.end method

.method public getPathSatisfied()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;->pathSatisfied:Z

    return v0
.end method

.method public getValidation()Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;->validation:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NetworkChangeReportV2{interfaceType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;->interfaceType:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkInterfaceType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",ipv4="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;->ipv4:[B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",ipv6="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;->ipv6:[B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",ipv6PrefixLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;->ipv6PrefixLength:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",pathSatisfied="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;->pathSatisfied:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",validation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;->validation:Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkValidationState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",metered="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;->metered:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",constrained="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;->constrained:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
