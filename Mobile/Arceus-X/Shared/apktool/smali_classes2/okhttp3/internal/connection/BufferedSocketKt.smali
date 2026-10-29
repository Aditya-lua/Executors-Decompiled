.class public final Lokhttp3/internal/connection/BufferedSocketKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Ljava/net/Socket;",
        "Lokhttp3/internal/connection/BufferedSocket;",
        "asBufferedSocket",
        "(Ljava/net/Socket;)Lokhttp3/internal/connection/BufferedSocket;",
        "Lxu/q0;",
        "(Lxu/q0;)Lokhttp3/internal/connection/BufferedSocket;",
        "okhttp"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final asBufferedSocket(Ljava/net/Socket;)Lokhttp3/internal/connection/BufferedSocket;
    .locals 1
    .param p0    # Ljava/net/Socket;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p0}, Lxu/b0;->h(Ljava/net/Socket;)Lxu/q0;

    move-result-object p0

    invoke-static {p0}, Lokhttp3/internal/connection/BufferedSocketKt;->asBufferedSocket(Lxu/q0;)Lokhttp3/internal/connection/BufferedSocket;

    move-result-object p0

    return-object p0
.end method

.method public static final asBufferedSocket(Lxu/q0;)Lokhttp3/internal/connection/BufferedSocket;
    .locals 1
    .param p0    # Lxu/q0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;

    invoke-direct {v0, p0}, Lokhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1;-><init>(Lxu/q0;)V

    return-object v0
.end method
