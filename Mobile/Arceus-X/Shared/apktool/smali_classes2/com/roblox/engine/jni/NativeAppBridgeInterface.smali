.class public Lcom/roblox/engine/jni/NativeAppBridgeInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v5, ""

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-static/range {v0 .. v5}, Lcom/roblox/engine/jni/NativeAppBridgeInterface;->nativeAppBridgeAppStart(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static native nativeAppBridgeAppStart(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static native setEnableConnectivityV2ForAndroid(Z)V
.end method

.method public static native setFastFollowedCJKPath(Ljava/lang/String;)V
.end method

.method public static native setIsFirstInstall(Z)V
.end method
