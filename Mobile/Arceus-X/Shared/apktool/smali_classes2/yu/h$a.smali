.class public final Lyu/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxu/p0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyu/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lyu/h$a;",
        "Lxu/p0;",
        "<init>",
        "(Lyu/h;)V",
        "Lxu/e;",
        "source",
        "",
        "byteCount",
        "",
        "write",
        "(Lxu/e;J)V",
        "flush",
        "()V",
        "close",
        "Lyu/n;",
        "a",
        "()Lyu/n;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Ljava/io/OutputStream;",
        "kotlin.jvm.PlatformType",
        "Ljava/io/OutputStream;",
        "outputStream",
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
.field public final a:Ljava/io/OutputStream;

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

    iput-object p1, p0, Lyu/h$a;->c:Lyu/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lyu/h;->b()Ljava/net/Socket;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    iput-object v0, p0, Lyu/h$a;->a:Ljava/io/OutputStream;

    new-instance v0, Lyu/n;

    invoke-virtual {p1}, Lyu/h;->b()Ljava/net/Socket;

    move-result-object p1

    invoke-direct {v0, p1}, Lyu/n;-><init>(Ljava/net/Socket;)V

    iput-object v0, p0, Lyu/h$a;->b:Lyu/n;

    return-void
.end method


# virtual methods
.method public a()Lyu/n;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lyu/h$a;->b:Lyu/n;

    return-object v0
.end method

.method public close()V
    .locals 4

    iget-object v0, p0, Lyu/h$a;->b:Lyu/n;

    iget-object v1, p0, Lyu/h$a;->c:Lyu/h;

    invoke-virtual {v0}, Lxu/c;->enter()V

    :try_start_0
    invoke-static {v1}, Lyu/h;->a(Lyu/h;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    const/4 v3, 0x1

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

    invoke-virtual {v2}, Ljava/net/Socket;->isOutputShutdown()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lyu/h$a;->a:Ljava/io/OutputStream;

    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v1}, Lyu/h;->b()Ljava/net/Socket;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/Socket;->shutdownOutput()V
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
    iget-object v1, p0, Lyu/h$a;->a:Ljava/io/OutputStream;

    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
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

.method public flush()V
    .locals 3

    iget-object v0, p0, Lyu/h$a;->b:Lyu/n;

    invoke-virtual {v0}, Lxu/c;->enter()V

    :try_start_0
    iget-object v1, p0, Lyu/h$a;->a:Ljava/io/OutputStream;

    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lxu/c;->exit()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lxu/c;->access$newTimeoutException(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_1
    invoke-virtual {v0}, Lxu/c;->exit()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1}, Lxu/c;->access$newTimeoutException(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v1

    :goto_0
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {v0}, Lxu/c;->exit()Z

    throw v1
.end method

.method public bridge synthetic timeout()Lxu/s0;
    .locals 1

    invoke-virtual {p0}, Lyu/h$a;->a()Lyu/n;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sink("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lyu/h$a;->c:Lyu/h;

    invoke-virtual {v1}, Lyu/h;->b()Ljava/net/Socket;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public write(Lxu/e;J)V
    .locals 7
    .param p1    # Lxu/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lxu/e;->size()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, Lxu/b;->b(JJJ)V

    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_3

    iget-object v0, p0, Lyu/h$a;->b:Lyu/n;

    invoke-virtual {v0}, Lxu/s0;->throwIfReached()V

    iget-object v0, p1, Lxu/e;->a:Lxu/m0;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v1, v0, Lxu/m0;->c:I

    iget v2, v0, Lxu/m0;->b:I

    sub-int/2addr v1, v2

    int-to-long v1, v1

    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v1, v1

    iget-object v2, p0, Lyu/h$a;->b:Lyu/n;

    invoke-virtual {v2}, Lxu/c;->enter()V

    :try_start_0
    iget-object v3, p0, Lyu/h$a;->a:Ljava/io/OutputStream;

    iget-object v4, v0, Lxu/m0;->a:[B

    iget v5, v0, Lxu/m0;->b:I

    invoke-virtual {v3, v4, v5, v1}, Ljava/io/OutputStream;->write([BII)V

    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, Lxu/c;->exit()Z

    move-result v3

    if-nez v3, :cond_1

    iget v2, v0, Lxu/m0;->b:I

    add-int/2addr v2, v1

    iput v2, v0, Lxu/m0;->b:I

    int-to-long v1, v1

    sub-long/2addr p2, v1

    invoke-virtual {p1}, Lxu/e;->size()J

    move-result-wide v3

    sub-long/2addr v3, v1

    invoke-virtual {p1, v3, v4}, Lxu/e;->U(J)V

    iget v1, v0, Lxu/m0;->b:I

    iget v2, v0, Lxu/m0;->c:I

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lxu/m0;->b()Lxu/m0;

    move-result-object v1

    iput-object v1, p1, Lxu/e;->a:Lxu/m0;

    invoke-static {v0}, Lxu/n0;->b(Lxu/m0;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    invoke-virtual {v2, p1}, Lxu/c;->access$newTimeoutException(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :catch_0
    move-exception v0

    move-object p1, v0

    :try_start_1
    invoke-virtual {v2}, Lxu/c;->exit()Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v2, p1}, Lxu/c;->access$newTimeoutException(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    :goto_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    invoke-virtual {v2}, Lxu/c;->exit()Z

    throw p1

    :cond_3
    return-void
.end method
