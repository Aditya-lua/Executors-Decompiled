.class public final synthetic Lxu/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u001d\u0010\u000f\u001a\u00020\u0001*\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\rH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u0011\u0010\u0011\u001a\u00020\u0005*\u00020\u000c\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Ljava/io/OutputStream;",
        "Lxu/p0;",
        "b",
        "(Ljava/io/OutputStream;)Lxu/p0;",
        "Ljava/io/InputStream;",
        "Lxu/r0;",
        "f",
        "(Ljava/io/InputStream;)Lxu/r0;",
        "Ljava/net/Socket;",
        "Lxu/q0;",
        "d",
        "(Ljava/net/Socket;)Lxu/q0;",
        "Ljava/io/File;",
        "",
        "append",
        "a",
        "(Ljava/io/File;Z)Lxu/p0;",
        "e",
        "(Ljava/io/File;)Lxu/r0;",
        "okio"
    }
    k = 0x5
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
    xs = "okio/Okio"
.end annotation


# direct methods
.method public static final a(Ljava/io/File;Z)Lxu/p0;
    .locals 1
    .param p0    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    invoke-static {v0}, Lxu/b0;->f(Ljava/io/OutputStream;)Lxu/p0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/io/OutputStream;)Lxu/p0;
    .locals 2
    .param p0    # Ljava/io/OutputStream;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxu/g0;

    new-instance v1, Lxu/s0;

    invoke-direct {v1}, Lxu/s0;-><init>()V

    invoke-direct {v0, p0, v1}, Lxu/g0;-><init>(Ljava/io/OutputStream;Lxu/s0;)V

    return-object v0
.end method

.method public static synthetic c(Ljava/io/File;ZILjava/lang/Object;)Lxu/p0;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lxu/b0;->e(Ljava/io/File;Z)Lxu/p0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ljava/net/Socket;)Lxu/q0;
    .locals 1
    .param p0    # Ljava/net/Socket;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyu/h;

    invoke-direct {v0, p0}, Lyu/h;-><init>(Ljava/net/Socket;)V

    return-object v0
.end method

.method public static final e(Ljava/io/File;)Lxu/r0;
    .locals 2
    .param p0    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxu/v;

    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    sget-object p0, Lxu/s0;->NONE:Lxu/s0;

    invoke-direct {v0, v1, p0}, Lxu/v;-><init>(Ljava/io/InputStream;Lxu/s0;)V

    return-object v0
.end method

.method public static final f(Ljava/io/InputStream;)Lxu/r0;
    .locals 2
    .param p0    # Ljava/io/InputStream;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxu/v;

    new-instance v1, Lxu/s0;

    invoke-direct {v1}, Lxu/s0;-><init>()V

    invoke-direct {v0, p0, v1}, Lxu/v;-><init>(Ljava/io/InputStream;Lxu/s0;)V

    return-object v0
.end method
