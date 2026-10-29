.class public abstract Lcom/roblox/protocols/externalidentityplatforminterface/generated/IExternalIdentityCoreListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/protocols/externalidentityplatforminterface/generated/IExternalIdentityCoreListener$CppProxy;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native setPlatformImpl(Lcom/roblox/protocols/externalidentityplatforminterface/generated/IPlatformExternalIdentity;)Lcom/roblox/protocols/externalidentityplatforminterface/generated/IExternalIdentityCoreListener;
.end method


# virtual methods
.method public onCapabilitiesResult(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityCapabilities;)V
    .locals 0

    return-void
.end method

.method public onProofCommitStarted(J)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onProofResult(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityResult;Ljava/lang/String;)V
    .locals 0

    return-void
.end method
