.class public final Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/internal/connection/BufferedSocket;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/connection/BufferedSocketKt;->asBufferedSocket(Lxu/q0;)Lokhttp3/internal/connection/BufferedSocket;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "okhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1",
        "Lokhttp3/internal/connection/BufferedSocket;",
        "",
        "cancel",
        "()V",
        "Lxu/q0;",
        "delegate",
        "Lxu/q0;",
        "Lxu/g;",
        "source",
        "Lxu/g;",
        "getSource",
        "()Lxu/g;",
        "Lxu/f;",
        "sink",
        "Lxu/f;",
        "getSink",
        "()Lxu/f;",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final delegate:Lxu/q0;

.field private final sink:Lxu/f;

.field private final source:Lxu/g;


# direct methods
.method public constructor <init>(Lxu/q0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;->delegate:Lxu/q0;

    invoke-interface {p1}, Lxu/q0;->getSource()Lxu/r0;

    move-result-object v0

    invoke-static {v0}, Lxu/b0;->c(Lxu/r0;)Lxu/g;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;->source:Lxu/g;

    invoke-interface {p1}, Lxu/q0;->getSink()Lxu/p0;

    move-result-object p1

    invoke-static {p1}, Lxu/b0;->b(Lxu/p0;)Lxu/f;

    move-result-object p1

    iput-object p1, p0, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;->sink:Lxu/f;

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;->delegate:Lxu/q0;

    invoke-interface {v0}, Lxu/q0;->cancel()V

    return-void
.end method

.method public getSink()Lxu/f;
    .locals 1

    .line 2
    iget-object v0, p0, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;->sink:Lxu/f;

    return-object v0
.end method

.method public bridge synthetic getSink()Lxu/p0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;->getSink()Lxu/f;

    move-result-object v0

    return-object v0
.end method

.method public getSource()Lxu/g;
    .locals 1

    .line 2
    iget-object v0, p0, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;->source:Lxu/g;

    return-object v0
.end method

.method public bridge synthetic getSource()Lxu/r0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;->getSource()Lxu/g;

    move-result-object v0

    return-object v0
.end method
