.class public Lcom/roblox/engine/jni/NativeReportingInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native applicationBackgrounded()V
.end method

.method public static native applicationForegrounded()V
.end method

.method public static native flushEngineTelemetryV1Events()V
.end method

.method public static native flushEngineTelemetryV2Events()V
.end method

.method public static native gameBackgrounded()V
.end method

.method public static native gameForegrounded()V
.end method

.method public static native getPushNotificationSessionInfo(Ljava/lang/String;)Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public static native initAppShellReporter()V
.end method

.method public static native pushNotificationInteracted(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
.end method

.method public static native pushNotificationReceived(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
.end method

.method public static native setAppSuspended(Z)V
.end method

.method public static native stopPushNotificationSession()V
.end method
