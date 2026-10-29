.class public final Lokhttp3/internal/connection/RealConnection$Companion$newTestConnection$bufferedSocket$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/internal/connection/BufferedSocket;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/connection/RealConnection$Companion;->newTestConnection(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Route;Ljava/net/Socket;J)Lokhttp3/internal/connection/RealConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tR\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0007\u001a\u0004\u0008\u000b\u0010\t\u00a8\u0006\u000c"
    }
    d2 = {
        "okhttp3/internal/connection/RealConnection$Companion$newTestConnection$bufferedSocket$1",
        "Lokhttp3/internal/connection/BufferedSocket;",
        "",
        "cancel",
        "()V",
        "Lxu/e;",
        "sink",
        "Lxu/e;",
        "getSink",
        "()Lxu/e;",
        "source",
        "getSource",
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
.field private final sink:Lxu/e;

.field private final source:Lxu/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lxu/e;

    invoke-direct {v0}, Lxu/e;-><init>()V

    iput-object v0, p0, Lokhttp3/internal/connection/RealConnection$Companion$newTestConnection$bufferedSocket$1;->sink:Lxu/e;

    new-instance v0, Lxu/e;

    invoke-direct {v0}, Lxu/e;-><init>()V

    iput-object v0, p0, Lokhttp3/internal/connection/RealConnection$Companion$newTestConnection$bufferedSocket$1;->source:Lxu/e;

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 0

    return-void
.end method

.method public getSink()Lxu/e;
    .locals 1

    .line 3
    iget-object v0, p0, Lokhttp3/internal/connection/RealConnection$Companion$newTestConnection$bufferedSocket$1;->sink:Lxu/e;

    return-object v0
.end method

.method public bridge synthetic getSink()Lxu/f;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokhttp3/internal/connection/RealConnection$Companion$newTestConnection$bufferedSocket$1;->getSink()Lxu/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getSink()Lxu/p0;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lokhttp3/internal/connection/RealConnection$Companion$newTestConnection$bufferedSocket$1;->getSink()Lxu/e;

    move-result-object v0

    return-object v0
.end method

.method public getSource()Lxu/e;
    .locals 1

    .line 3
    iget-object v0, p0, Lokhttp3/internal/connection/RealConnection$Companion$newTestConnection$bufferedSocket$1;->source:Lxu/e;

    return-object v0
.end method

.method public bridge synthetic getSource()Lxu/g;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokhttp3/internal/connection/RealConnection$Companion$newTestConnection$bufferedSocket$1;->getSource()Lxu/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getSource()Lxu/r0;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lokhttp3/internal/connection/RealConnection$Companion$newTestConnection$bufferedSocket$1;->getSource()Lxu/e;

    move-result-object v0

    return-object v0
.end method
