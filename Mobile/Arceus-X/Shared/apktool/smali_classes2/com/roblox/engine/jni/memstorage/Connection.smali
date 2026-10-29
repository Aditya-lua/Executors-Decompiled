.class public Lcom/roblox/engine/jni/memstorage/Connection;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private ref:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/roblox/engine/jni/memstorage/Connection;->ref:J

    return-void
.end method

.method private static native disconnect(Lcom/roblox/engine/jni/memstorage/Connection;)V
.end method

.method private static native releaseConnection(Lcom/roblox/engine/jni/memstorage/Connection;)V
.end method


# virtual methods
.method public disconnect()V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/roblox/engine/jni/memstorage/Connection;->disconnect(Lcom/roblox/engine/jni/memstorage/Connection;)V

    return-void
.end method

.method public finalize()V
    .locals 0

    invoke-static {p0}, Lcom/roblox/engine/jni/memstorage/Connection;->releaseConnection(Lcom/roblox/engine/jni/memstorage/Connection;)V

    return-void
.end method
