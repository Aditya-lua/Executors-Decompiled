.class public interface abstract Lcom/roblox/engine/jni/NativeVideoInterface$VideoStreamListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/engine/jni/NativeVideoInterface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "VideoStreamListener"
.end annotation


# virtual methods
.method public abstract signalCameraDisconnected()V
.end method

.method public abstract signalFormatChanged(IIII)V
.end method

.method public abstract signalVideoFrameArrived(JLjava/nio/ByteBuffer;IIII)V
.end method

.method public abstract signalVideoStart()V
.end method

.method public abstract signalVideoStop()V
.end method
