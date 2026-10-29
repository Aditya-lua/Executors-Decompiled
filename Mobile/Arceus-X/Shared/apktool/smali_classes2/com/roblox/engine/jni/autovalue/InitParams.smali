.class public abstract Lcom/roblox/engine/jni/autovalue/InitParams;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/engine/jni/autovalue/InitParams$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/roblox/engine/jni/autovalue/InitParams$Builder;
    .locals 2

    new-instance v0, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$Builder;

    invoke-direct {v0}, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$Builder;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roblox/engine/jni/autovalue/AutoValue_InitParams$Builder;->setIsVrDevice(Z)Lcom/roblox/engine/jni/autovalue/InitParams$Builder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract baseURL()Ljava/lang/String;
.end method

.method public abstract buildVariant()Ljava/lang/String;
.end method

.method public abstract deviceParams()Lcom/roblox/engine/jni/model/DeviceParams;
.end method

.method public abstract isPotato()Z
.end method

.method public abstract isTablet()Z
.end method

.method public abstract isVrDevice()Z
.end method

.method public abstract platformParams()Lcom/roblox/engine/jni/model/PlatformParams;
.end method

.method public abstract userAgent()Ljava/lang/String;
.end method

.method public abstract vrContext()Landroid/app/Activity;
.end method
