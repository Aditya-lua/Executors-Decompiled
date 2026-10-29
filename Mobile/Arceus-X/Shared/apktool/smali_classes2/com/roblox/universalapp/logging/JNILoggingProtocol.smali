.class public Lcom/roblox/universalapp/logging/JNILoggingProtocol;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static varargs a(Ljava/lang/String;J[Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/roblox/universalapp/logging/JNILoggingProtocol;->nativeLogEvent(Ljava/lang/String;J[Ljava/lang/Object;)V

    return-void
.end method

.method public static native nativeGetTimestamp()J
.end method

.method private static native nativeLogEvent(Ljava/lang/String;J[Ljava/lang/Object;)V
.end method

.method public static native nativeLogRobloxTelemetryEvent(Lcom/roblox/engine/jni/autovalue/RobloxTelemetryEvent;)V
.end method
