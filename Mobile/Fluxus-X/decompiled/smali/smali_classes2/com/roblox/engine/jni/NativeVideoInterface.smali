.class public Lcom/roblox/engine/jni/NativeVideoInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/engine/jni/NativeVideoInterface$VideoStreamListener;,
        Lcom/roblox/engine/jni/NativeVideoInterface$VideoDeviceId;,
        Lcom/roblox/engine/jni/NativeVideoInterface$ImageOrientation;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native connectListener(JLcom/roblox/engine/jni/NativeVideoInterface$VideoStreamListener;)Z
.end method

.method public static native createCameraStream()J
.end method

.method public static native destroyCameraStream(J)Z
.end method

.method public static native nativeGetCameraDevices()[Lcom/roblox/engine/jni/NativeVideoInterface$VideoDeviceId;
.end method

.method public static native openVideoStream(JLjava/lang/String;IID)I
.end method

.method public static native setPlaying(JZ)V
.end method
