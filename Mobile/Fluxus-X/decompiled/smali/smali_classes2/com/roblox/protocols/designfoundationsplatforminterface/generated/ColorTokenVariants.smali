.class public final Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field final dark:Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;

.field final light:Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;


# direct methods
.method public constructor <init>(Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;->dark:Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;

    iput-object p2, p0, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;->light:Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;

    return-void
.end method


# virtual methods
.method public getDark()Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;->dark:Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;

    return-object v0
.end method

.method public getLight()Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;
    .locals 1

    iget-object v0, p0, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;->light:Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ColorTokenVariants{dark="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;->dark:Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",light="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;->light:Lcom/roblox/protocols/designfoundationsplatforminterface/generated/RGBA;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
