.class public abstract Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/autovalue/StartAppParams;
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
.method public abstract build()Lcom/roblox/engine/jni/autovalue/StartAppParams;
.end method

.method public abstract setAppStarterPlace(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
.end method

.method public abstract setAppStarterScript(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
.end method

.method public abstract setAppUserId(J)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
.end method

.method public abstract setIsUnder13(Z)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
.end method

.method public abstract setMembershipType(I)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
.end method

.method public abstract setPlatformParams(Lcom/roblox/engine/jni/model/PlatformParams;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
.end method

.method public abstract setSelectedTheme(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
.end method

.method public abstract setSurface(Landroid/view/Surface;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
.end method

.method public abstract setUsername(Ljava/lang/String;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
.end method

.method public abstract setVrContext(Landroid/app/Activity;)Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
.end method
