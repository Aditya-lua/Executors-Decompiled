.class public abstract Lcom/roblox/engine/jni/autovalue/InitParams$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/autovalue/InitParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/roblox/engine/jni/autovalue/InitParams;
.end method

.method public abstract setBaseURL(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;
.end method

.method public abstract setBuildVariant(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;
.end method

.method public abstract setDeviceParams(Lcom/roblox/engine/jni/model/DeviceParams;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;
.end method

.method public abstract setIsPotato(Z)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;
.end method

.method public abstract setIsTablet(Z)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;
.end method

.method public abstract setIsVrDevice(Z)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;
.end method

.method public abstract setPlatformParams(Lcom/roblox/engine/jni/model/PlatformParams;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;
.end method

.method public abstract setUserAgent(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;
.end method

.method public abstract setVrContext(Landroid/app/Activity;)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;
.end method
