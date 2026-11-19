.class public Lcom/roblox/engine/jni/memstorage/MemStorage;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native bind(Ljava/lang/String;Lcom/roblox/engine/jni/memstorage/Callback;)Lcom/roblox/engine/jni/memstorage/Connection;
.end method

.method public static native fire(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static native getItem(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native hasItem(Ljava/lang/String;)Z
.end method

.method public static native removeItem(Ljava/lang/String;)Z
.end method

.method public static native setItem(Ljava/lang/String;Ljava/lang/String;)V
.end method
