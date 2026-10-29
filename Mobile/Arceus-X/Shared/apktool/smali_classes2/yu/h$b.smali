.class public final Lyu/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxu/r0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyu/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lyu/h$b;",
        "Lxu/r0;",
        "<init>",
        "(Lyu/h;)V",
        "Lxu/e;",
        "sink",
        "",
        "byteCount",
        "read",
        "(Lxu/e;J)J",
        "",
        "close",
        "()V",
        "Lyu/n;",
        "a",
        "()Lyu/n;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Ljava/io/InputStream;",
        "kotlin.jvm.PlatformType",
        "Ljava/io/InputStream;",
        "inputStream",
        "b",
        "Lyu/n;",
        "timeout",
        "okio"
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
.field public final a:Ljava/io/InputStream;

.field public final b:Lyu/n;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final synthetic c:Lyu/h;


# direct methods
.method public constructor <init>(Lyu/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lyu/h$b;->c:Lyu/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lyu/h;->b()Ljava/net/Socket;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    iput-object v0, p0, Lyu/h$b;->a:Ljava/io/InputStream;

    new-instance v0, Lyu/n;

    invoke-virtual {p1}, Lyu/h;->b()Ljava/net/Socket;

    move-result-object p1

    invoke-direct {v0, p1}, Lyu/n;-><init>(Ljava/net/Socket;)V

    iput-object v0, p0, Lyu/h$b;->b:Lyu/n;

    return-void
.end method


# virtual methods
.method public a()Lyu/n;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lyu/h$b;->b:Lyu/n;

    return-object v0
.end method

.method public close()V
    .locals 4

    iget-object v0, p0, Lyu/h$b;->b:Lyu/n;

    iget-object v1, p0, Lyu/h$b;->c:Lyu/h;

    invoke-virtual {v0}, Lxu/c;->enter()V

    :try_start_0
    invoke-static {v1}, Lyu/h;->a(Lyu/h;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {v2, v3}, Lyu/u;->a(Ljava/util/concurrent/atomic/AtomicInteger;I)I

    move-result v2

    if-eqz v2, :cond_4

    const/4 v3, 0x3

    if-eq v2, v3, :cond_2

    invoke-virtual {v1}, Lyu/h;->b()Ljava/net/Socket;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/Socket;->isClosed()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Lyu/h;->b()Ljava/net/Socket;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    :try_start_1
    invoke-virtual {v1}, Lyu/h;->b()Ljava/net/Socket;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/Socket;->shutdownInput()V
    :try_end_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_4

    :catch_0
    move-exception v1

    goto :goto_2

    :catch_1
    :try_start_2
    iget-object v1, p0, Lyu/h$b;->a:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v0}, Lxu/c;->exit()Z

    return-void

    :cond_2
    :try_start_3
    invoke-virtual {v1}, Lyu/h;->b()Ljava/net/Socket;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/Socket;->close()V

    :goto_1
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-virtual {v0}, Lxu/c;->exit()Z

    move-result v1

    if-nez v1, :cond_3

    return-void

    :cond_3
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lxu/c;->access$newTimeoutException(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    :cond_4
    invoke-virtual {v0}, Lxu/c;->exit()Z

    return-void

    :goto_2
    :try_start_4
    invoke-virtual {v0}, Lxu/c;->exit()Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v0, v1}, Lxu/c;->access$newTimeoutException(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v1

    :goto_3
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_4
    invoke-virtual {v0}, Lxu/c;->exit()Z

    throw v1
.end method

.method public read(Lxu/e;J)J
    .locals 4
    .param p1    # Lxu/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-nez v2, :cond_0

    return-wide v0

    :cond_0
    if-ltz v2, :cond_6

    iget-object v0, p0, Lyu/h$b;->b:Lyu/n;

    invoke-virtual {v0}, Lxu/s0;->throwIfReached()V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lxu/e;->Z(I)Lxu/m0;

    move-result-object v0

    iget v1, v0, Lxu/m0;->c:I

    rsub-int v1, v1, 0x2000

    int-to-long v1, v1

    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    long-to-int p2, p2

    :try_start_0
    iget-object p3, p0, Lyu/h$b;->b:Lyu/n;

    invoke-virtual {p3}, Lxu/c;->enter()V
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v1, p0, Lyu/h$b;->a:Ljava/io/InputStream;

    iget-object v2, v0, Lxu/m0;->a:[B

    iget v3, v0, Lxu/m0;->c:I

    invoke-virtual {v1, v2, v3, p2}, Ljava/io/InputStream;->read([BII)I

    move-result p2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {p3}, Lxu/c;->exit()Z

    move-result v1
    :try_end_2
    .catch Ljava/lang/AssertionError; {:try_start_2 .. :try_end_2} :catch_0

    if-nez v1, :cond_3

    const/4 p3, -0x1

    if-ne p2, p3, :cond_2

    iget p2, v0, Lxu/m0;->b:I

    iget p3, v0, Lxu/m0;->c:I

    if-ne p2, p3, :cond_1

    invoke-virtual {v0}, Lxu/m0;->b()Lxu/m0;

    move-result-object p2

    iput-object p2, p1, Lxu/e;->a:Lxu/m0;

    invoke-static {v0}, Lxu/n0;->b(Lxu/m0;)V

    :cond_1
    const-wide/16 p1, -0x1

    return-wide p1

    :cond_2
    iget p3, v0, Lxu/m0;->c:I

    add-int/2addr p3, p2

    iput p3, v0, Lxu/m0;->c:I

    invoke-virtual {p1}, Lxu/e;->size()J

    move-result-wide v0

    int-to-long p2, p2

    add-long/2addr v0, p2

    invoke-virtual {p1, v0, v1}, Lxu/e;->U(J)V

    return-wide p2

    :cond_3
    const/4 p1, 0x0

    :try_start_3
    invoke-virtual {p3, p1}, Lxu/c;->access$newTimeoutException(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_3
    .catch Ljava/lang/AssertionError; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception p1

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    :try_start_4
    invoke-virtual {p3}, Lxu/c;->exit()Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {p3, p1}, Lxu/c;->access$newTimeoutException(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    :goto_0
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_1
    :try_start_5
    invoke-virtual {p3}, Lxu/c;->exit()Z

    throw p1
    :try_end_5
    .catch Ljava/lang/AssertionError; {:try_start_5 .. :try_end_5} :catch_0

    :goto_2
    invoke-static {p1}, Lyu/v;->b(Ljava/lang/AssertionError;)Z

    move-result p2

    if-eqz p2, :cond_5

    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_5
    throw p1

    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "byteCount < 0: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public bridge synthetic timeout()Lxu/s0;
    .locals 1

    invoke-virtual {p0}, Lyu/h$b;->a()Lyu/n;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "source("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lyu/h$b;->c:Lyu/h;

    invoke-virtual {v1}, Lyu/h;->b()Ljava/net/Socket;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
