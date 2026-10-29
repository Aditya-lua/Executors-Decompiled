.class public final Lxu/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxu/p0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\rJ\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0016R\u001b\u0010\u001a\u001a\u00060\u0017j\u0002`\u00188\u0007\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0018\u0010(\u001a\u00060$j\u0002`%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'\u00a8\u0006)"
    }
    d2 = {
        "Lxu/r;",
        "Lxu/p0;",
        "sink",
        "<init>",
        "(Lxu/p0;)V",
        "Lxu/e;",
        "source",
        "",
        "byteCount",
        "",
        "write",
        "(Lxu/e;J)V",
        "flush",
        "()V",
        "Lxu/s0;",
        "timeout",
        "()Lxu/s0;",
        "close",
        "b",
        "buffer",
        "a",
        "Lxu/k0;",
        "Lxu/k0;",
        "Ljava/util/zip/Deflater;",
        "Lokio/Deflater;",
        "Ljava/util/zip/Deflater;",
        "deflater",
        "()Ljava/util/zip/Deflater;",
        "Lxu/i;",
        "c",
        "Lxu/i;",
        "deflaterSink",
        "",
        "d",
        "Z",
        "closed",
        "Ljava/util/zip/CRC32;",
        "Lokio/internal/CRC32;",
        "e",
        "Ljava/util/zip/CRC32;",
        "crc",
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
.field public final a:Lxu/k0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ljava/util/zip/Deflater;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lxu/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public d:Z

.field public final e:Ljava/util/zip/CRC32;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lxu/p0;)V
    .locals 3
    .param p1    # Lxu/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lxu/k0;

    invoke-direct {v0, p1}, Lxu/k0;-><init>(Lxu/p0;)V

    iput-object v0, p0, Lxu/r;->a:Lxu/k0;

    new-instance p1, Ljava/util/zip/Deflater;

    invoke-static {}, Lyu/w;->b()I

    move-result v1

    const/4 v2, 0x1

    invoke-direct {p1, v1, v2}, Ljava/util/zip/Deflater;-><init>(IZ)V

    iput-object p1, p0, Lxu/r;->b:Ljava/util/zip/Deflater;

    new-instance v1, Lxu/i;

    invoke-direct {v1, v0, p1}, Lxu/i;-><init>(Lxu/f;Ljava/util/zip/Deflater;)V

    iput-object v1, p0, Lxu/r;->c:Lxu/i;

    new-instance p1, Ljava/util/zip/CRC32;

    invoke-direct {p1}, Ljava/util/zip/CRC32;-><init>()V

    iput-object p1, p0, Lxu/r;->e:Ljava/util/zip/CRC32;

    iget-object p1, v0, Lxu/k0;->b:Lxu/e;

    const/16 v0, 0x1f8b

    invoke-virtual {p1, v0}, Lxu/e;->z0(I)Lxu/e;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lxu/e;->i0(I)Lxu/e;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lxu/e;->i0(I)Lxu/e;

    invoke-virtual {p1, v0}, Lxu/e;->t0(I)Lxu/e;

    invoke-virtual {p1, v0}, Lxu/e;->i0(I)Lxu/e;

    invoke-virtual {p1, v0}, Lxu/e;->i0(I)Lxu/e;

    return-void
.end method


# virtual methods
.method public final a(Lxu/e;J)V
    .locals 4

    iget-object p1, p1, Lxu/e;->a:Lxu/m0;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_0

    iget v0, p1, Lxu/m0;->c:I

    iget v1, p1, Lxu/m0;->b:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    iget-object v1, p0, Lxu/r;->e:Ljava/util/zip/CRC32;

    iget-object v2, p1, Lxu/m0;->a:[B

    iget v3, p1, Lxu/m0;->b:I

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/zip/CRC32;->update([BII)V

    int-to-long v0, v0

    sub-long/2addr p2, v0

    iget-object p1, p1, Lxu/m0;->f:Lxu/m0;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Lxu/r;->a:Lxu/k0;

    iget-object v1, p0, Lxu/r;->e:Ljava/util/zip/CRC32;

    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v1

    long-to-int v1, v1

    invoke-virtual {v0, v1}, Lxu/k0;->a(I)Lxu/f;

    iget-object v0, p0, Lxu/r;->a:Lxu/k0;

    iget-object v1, p0, Lxu/r;->b:Ljava/util/zip/Deflater;

    invoke-virtual {v1}, Ljava/util/zip/Deflater;->getBytesRead()J

    move-result-wide v1

    long-to-int v1, v1

    invoke-virtual {v0, v1}, Lxu/k0;->a(I)Lxu/f;

    return-void
.end method

.method public close()V
    .locals 2

    iget-boolean v0, p0, Lxu/r;->d:Z

    if-eqz v0, :cond_0

    goto :goto_3

    :cond_0
    :try_start_0
    iget-object v0, p0, Lxu/r;->c:Lxu/i;

    invoke-virtual {v0}, Lxu/i;->b()V

    invoke-virtual {p0}, Lxu/r;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    :goto_0
    :try_start_1
    iget-object v1, p0, Lxu/r;->b:Ljava/util/zip/Deflater;

    invoke-virtual {v1}, Ljava/util/zip/Deflater;->end()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    if-nez v0, :cond_1

    move-object v0, v1

    :cond_1
    :goto_1
    :try_start_2
    iget-object v1, p0, Lxu/r;->a:Lxu/k0;

    invoke-virtual {v1}, Lxu/k0;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v1

    if-nez v0, :cond_2

    move-object v0, v1

    :cond_2
    :goto_2
    const/4 v1, 0x1

    iput-boolean v1, p0, Lxu/r;->d:Z

    if-nez v0, :cond_3

    :goto_3
    return-void

    :cond_3
    throw v0
.end method

.method public flush()V
    .locals 1

    iget-object v0, p0, Lxu/r;->c:Lxu/i;

    invoke-virtual {v0}, Lxu/i;->flush()V

    return-void
.end method

.method public timeout()Lxu/s0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lxu/r;->a:Lxu/k0;

    invoke-virtual {v0}, Lxu/k0;->timeout()Lxu/s0;

    move-result-object v0

    return-object v0
.end method

.method public write(Lxu/e;J)V
    .locals 2
    .param p1    # Lxu/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-ltz v0, :cond_1

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lxu/r;->a(Lxu/e;J)V

    iget-object v0, p0, Lxu/r;->c:Lxu/i;

    invoke-virtual {v0, p1, p2, p3}, Lxu/i;->write(Lxu/e;J)V

    return-void

    :cond_1
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
