.class public abstract Lcom/roblox/protocols/devicedisplayplatforminterface/generated/IPlatformDeviceDisplayHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/protocols/devicedisplayplatforminterface/generated/IPlatformDeviceDisplayHandler$CppProxy;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBrightness()F
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public hasCapability(Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public isAvailable()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public setBrightness(F)V
    .locals 0

    return-void
.end method

.method public setBrightnessToDefault()V
    .locals 0

    return-void
.end method

.method public setKeepAwake(Z)V
    .locals 0

    return-void
.end method
