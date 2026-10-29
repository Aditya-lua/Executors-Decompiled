.class public abstract Lcom/roblox/engine/jni/autovalue/StartAppParams;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/roblox/engine/jni/autovalue/StartAppParams$Builder;
    .locals 1

    new-instance v0, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;

    invoke-direct {v0}, Lcom/roblox/engine/jni/autovalue/AutoValue_StartAppParams$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract appStarterPlace()Ljava/lang/String;
.end method

.method public abstract appStarterScript()Ljava/lang/String;
.end method

.method public abstract appUserId()J
.end method

.method public abstract isUnder13()Z
.end method

.method public abstract membershipType()I
.end method

.method public abstract platformParams()Lcom/roblox/engine/jni/model/PlatformParams;
.end method

.method public abstract selectedTheme()Ljava/lang/String;
.end method

.method public abstract surface()Landroid/view/Surface;
.end method

.method public abstract username()Ljava/lang/String;
.end method

.method public abstract vrContext()Landroid/app/Activity;
.end method
