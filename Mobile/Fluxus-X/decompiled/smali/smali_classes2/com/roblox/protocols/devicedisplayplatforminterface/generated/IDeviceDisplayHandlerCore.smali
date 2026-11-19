.class public abstract Lcom/roblox/protocols/devicedisplayplatforminterface/generated/IDeviceDisplayHandlerCore;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/protocols/devicedisplayplatforminterface/generated/IDeviceDisplayHandlerCore$CppProxy;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native setPlatformImpl(Lcom/roblox/protocols/devicedisplayplatforminterface/generated/IPlatformDeviceDisplayHandler;)Lcom/roblox/protocols/devicedisplayplatforminterface/generated/IDeviceDisplayHandlerCore;
.end method


# virtual methods
.method public getBrightness()F
    .locals 1

    const/4 v0, 0x0

    return v0
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
