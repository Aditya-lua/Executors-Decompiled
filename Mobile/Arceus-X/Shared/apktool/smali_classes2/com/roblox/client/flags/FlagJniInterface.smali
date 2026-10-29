.class public Lcom/roblox/client/flags/FlagJniInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static native nativeGetFFlag(Ljava/lang/String;Z)Z
.end method

.method public static native nativeGetFInt(Ljava/lang/String;I)I
.end method

.method public static native nativeGetFString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native nativeInitializeNativeFlags([Ljava/lang/String;)Lcom/roblox/client/flags/NativeFlagsInitResult;
.end method

.method public static native nativeRegisterFFlag(Ljava/lang/String;I)V
.end method

.method public static native nativeRegisterFInt(Ljava/lang/String;I)V
.end method

.method public static native nativeRegisterFString(Ljava/lang/String;I)V
.end method
