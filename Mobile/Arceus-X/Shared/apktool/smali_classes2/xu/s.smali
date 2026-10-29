.class public final Lxu/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxu/r0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0005\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0010J\'\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\'\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001fR\u0014\u0010\u0002\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\"R\u0018\u0010&\u001a\u00060#j\u0002`$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010%R\u0014\u0010)\u001a\u00020\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010(R\u0018\u0010.\u001a\u00060*j\u0002`+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-\u00a8\u0006/"
    }
    d2 = {
        "Lxu/s;",
        "Lxu/r0;",
        "source",
        "<init>",
        "(Lxu/r0;)V",
        "Lxu/e;",
        "sink",
        "",
        "byteCount",
        "read",
        "(Lxu/e;J)J",
        "Lxu/s0;",
        "timeout",
        "()Lxu/s0;",
        "",
        "close",
        "()V",
        "b",
        "c",
        "buffer",
        "offset",
        "d",
        "(Lxu/e;JJ)V",
        "",
        "name",
        "",
        "expected",
        "actual",
        "a",
        "(Ljava/lang/String;II)V",
        "",
        "B",
        "section",
        "Lxu/l0;",
        "Lxu/l0;",
        "Ljava/util/zip/Inflater;",
        "Lokio/Inflater;",
        "Ljava/util/zip/Inflater;",
        "inflater",
        "Lxu/u;",
        "Lxu/u;",
        "inflaterSource",
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
.field public a:B

.field public final b:Lxu/l0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ljava/util/zip/Inflater;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lxu/u;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Ljava/util/zip/CRC32;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lxu/r0;)V
    .locals 2
    .param p1    # Lxu/r0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lxu/l0;

    invoke-direct {v0, p1}, Lxu/l0;-><init>(Lxu/r0;)V

    iput-object v0, p0, Lxu/s;->b:Lxu/l0;

    new-instance p1, Ljava/util/zip/Inflater;

    const/4 v1, 0x1

    invoke-direct {p1, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    iput-object p1, p0, Lxu/s;->c:Ljava/util/zip/Inflater;

    new-instance v1, Lxu/u;

    invoke-direct {v1, v0, p1}, Lxu/u;-><init>(Lxu/g;Ljava/util/zip/Inflater;)V

    iput-object v1, p0, Lxu/s;->d:Lxu/u;

    new-instance p1, Ljava/util/zip/CRC32;

    invoke-direct {p1}, Ljava/util/zip/CRC32;-><init>()V

    iput-object p1, p0, Lxu/s;->e:Ljava/util/zip/CRC32;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;II)V
    .locals 3

    if-ne p3, p2, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": actual 0x"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p3}, Lxu/b;->l(I)Ljava/lang/String;

    move-result-object p1

    const/16 p3, 0x8

    const/16 v2, 0x30

    invoke-static {p1, p3, v2}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " != expected 0x"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lxu/b;->l(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p3, v2}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lxu/s;->b:Lxu/l0;

    const-wide/16 v2, 0xa

    invoke-virtual {v1, v2, v3}, Lxu/l0;->w1(J)V

    iget-object v1, v0, Lxu/s;->b:Lxu/l0;

    iget-object v1, v1, Lxu/l0;->b:Lxu/e;

    const-wide/16 v2, 0x3

    invoke-virtual {v1, v2, v3}, Lxu/e;->j(J)B

    move-result v6

    shr-int/lit8 v1, v6, 0x1

    const/4 v7, 0x1

    and-int/2addr v1, v7

    const/4 v8, 0x0

    if-ne v1, v7, :cond_0

    move v9, v7

    goto :goto_0

    :cond_0
    move v9, v8

    :goto_0
    if-eqz v9, :cond_1

    iget-object v1, v0, Lxu/s;->b:Lxu/l0;

    iget-object v1, v1, Lxu/l0;->b:Lxu/e;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0xa

    invoke-virtual/range {v0 .. v5}, Lxu/s;->d(Lxu/e;JJ)V

    :cond_1
    iget-object v1, v0, Lxu/s;->b:Lxu/l0;

    invoke-virtual {v1}, Lxu/l0;->readShort()S

    move-result v1

    const-string v2, "ID1ID2"

    const/16 v3, 0x1f8b

    invoke-virtual {v0, v2, v3, v1}, Lxu/s;->a(Ljava/lang/String;II)V

    iget-object v1, v0, Lxu/s;->b:Lxu/l0;

    const-wide/16 v2, 0x8

    invoke-virtual {v1, v2, v3}, Lxu/l0;->skip(J)V

    shr-int/lit8 v1, v6, 0x2

    and-int/2addr v1, v7

    if-ne v1, v7, :cond_4

    iget-object v1, v0, Lxu/s;->b:Lxu/l0;

    const-wide/16 v2, 0x2

    invoke-virtual {v1, v2, v3}, Lxu/l0;->w1(J)V

    if-eqz v9, :cond_2

    iget-object v1, v0, Lxu/s;->b:Lxu/l0;

    iget-object v1, v1, Lxu/l0;->b:Lxu/e;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x2

    invoke-virtual/range {v0 .. v5}, Lxu/s;->d(Lxu/e;JJ)V

    :cond_2
    iget-object v1, v0, Lxu/s;->b:Lxu/l0;

    iget-object v1, v1, Lxu/l0;->b:Lxu/e;

    invoke-virtual {v1}, Lxu/e;->k1()S

    move-result v1

    const v2, 0xffff

    and-int/2addr v1, v2

    int-to-long v4, v1

    iget-object v1, v0, Lxu/s;->b:Lxu/l0;

    invoke-virtual {v1, v4, v5}, Lxu/l0;->w1(J)V

    if-eqz v9, :cond_3

    iget-object v1, v0, Lxu/s;->b:Lxu/l0;

    iget-object v1, v1, Lxu/l0;->b:Lxu/e;

    const-wide/16 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Lxu/s;->d(Lxu/e;JJ)V

    :cond_3
    iget-object v1, v0, Lxu/s;->b:Lxu/l0;

    invoke-virtual {v1, v4, v5}, Lxu/l0;->skip(J)V

    :cond_4
    shr-int/lit8 v1, v6, 0x3

    and-int/2addr v1, v7

    const-wide/16 v10, -0x1

    const-wide/16 v12, 0x1

    if-ne v1, v7, :cond_7

    iget-object v1, v0, Lxu/s;->b:Lxu/l0;

    invoke-virtual {v1, v8}, Lxu/l0;->a(B)J

    move-result-wide v14

    cmp-long v1, v14, v10

    if-eqz v1, :cond_6

    if-eqz v9, :cond_5

    iget-object v1, v0, Lxu/s;->b:Lxu/l0;

    iget-object v1, v1, Lxu/l0;->b:Lxu/e;

    const-wide/16 v2, 0x0

    add-long v4, v14, v12

    invoke-virtual/range {v0 .. v5}, Lxu/s;->d(Lxu/e;JJ)V

    :cond_5
    iget-object v1, v0, Lxu/s;->b:Lxu/l0;

    add-long/2addr v14, v12

    invoke-virtual {v1, v14, v15}, Lxu/l0;->skip(J)V

    goto :goto_1

    :cond_6
    new-instance v1, Ljava/io/EOFException;

    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    throw v1

    :cond_7
    :goto_1
    shr-int/lit8 v1, v6, 0x4

    and-int/2addr v1, v7

    if-ne v1, v7, :cond_a

    iget-object v1, v0, Lxu/s;->b:Lxu/l0;

    invoke-virtual {v1, v8}, Lxu/l0;->a(B)J

    move-result-wide v6

    cmp-long v1, v6, v10

    if-eqz v1, :cond_9

    if-eqz v9, :cond_8

    iget-object v1, v0, Lxu/s;->b:Lxu/l0;

    iget-object v1, v1, Lxu/l0;->b:Lxu/e;

    const-wide/16 v2, 0x0

    add-long v4, v6, v12

    invoke-virtual/range {v0 .. v5}, Lxu/s;->d(Lxu/e;JJ)V

    :cond_8
    iget-object v1, v0, Lxu/s;->b:Lxu/l0;

    add-long/2addr v6, v12

    invoke-virtual {v1, v6, v7}, Lxu/l0;->skip(J)V

    goto :goto_2

    :cond_9
    new-instance v1, Ljava/io/EOFException;

    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    throw v1

    :cond_a
    :goto_2
    if-eqz v9, :cond_b

    iget-object v1, v0, Lxu/s;->b:Lxu/l0;

    invoke-virtual {v1}, Lxu/l0;->k1()S

    move-result v1

    iget-object v2, v0, Lxu/s;->e:Ljava/util/zip/CRC32;

    invoke-virtual {v2}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v2

    long-to-int v2, v2

    int-to-short v2, v2

    const-string v3, "FHCRC"

    invoke-virtual {v0, v3, v1, v2}, Lxu/s;->a(Ljava/lang/String;II)V

    iget-object v1, v0, Lxu/s;->e:Ljava/util/zip/CRC32;

    invoke-virtual {v1}, Ljava/util/zip/CRC32;->reset()V

    :cond_b
    return-void
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Lxu/s;->b:Lxu/l0;

    invoke-virtual {v0}, Lxu/l0;->M2()I

    move-result v0

    iget-object v1, p0, Lxu/s;->e:Ljava/util/zip/CRC32;

    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v1

    long-to-int v1, v1

    const-string v2, "CRC"

    invoke-virtual {p0, v2, v0, v1}, Lxu/s;->a(Ljava/lang/String;II)V

    iget-object v0, p0, Lxu/s;->b:Lxu/l0;

    invoke-virtual {v0}, Lxu/l0;->M2()I

    move-result v0

    iget-object v1, p0, Lxu/s;->c:Ljava/util/zip/Inflater;

    invoke-virtual {v1}, Ljava/util/zip/Inflater;->getBytesWritten()J

    move-result-wide v1

    long-to-int v1, v1

    const-string v2, "ISIZE"

    invoke-virtual {p0, v2, v0, v1}, Lxu/s;->a(Ljava/lang/String;II)V

    return-void
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lxu/s;->d:Lxu/u;

    invoke-virtual {v0}, Lxu/u;->close()V

    return-void
.end method

.method public final d(Lxu/e;JJ)V
    .locals 4

    iget-object p1, p1, Lxu/e;->a:Lxu/m0;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    :goto_0
    iget v0, p1, Lxu/m0;->c:I

    iget v1, p1, Lxu/m0;->b:I

    sub-int v2, v0, v1

    int-to-long v2, v2

    cmp-long v2, p2, v2

    if-ltz v2, :cond_0

    sub-int/2addr v0, v1

    int-to-long v0, v0

    sub-long/2addr p2, v0

    iget-object p1, p1, Lxu/m0;->f:Lxu/m0;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    :goto_1
    const-wide/16 v0, 0x0

    cmp-long v2, p4, v0

    if-lez v2, :cond_1

    iget v2, p1, Lxu/m0;->b:I

    int-to-long v2, v2

    add-long/2addr v2, p2

    long-to-int p2, v2

    iget p3, p1, Lxu/m0;->c:I

    sub-int/2addr p3, p2

    int-to-long v2, p3

    invoke-static {v2, v3, p4, p5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int p3, v2

    iget-object v2, p0, Lxu/s;->e:Ljava/util/zip/CRC32;

    iget-object v3, p1, Lxu/m0;->a:[B

    invoke-virtual {v2, v3, p2, p3}, Ljava/util/zip/CRC32;->update([BII)V

    int-to-long p2, p3

    sub-long/2addr p4, p2

    iget-object p1, p1, Lxu/m0;->f:Lxu/m0;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-wide p2, v0

    goto :goto_1

    :cond_1
    return-void
.end method

.method public read(Lxu/e;J)J
    .locals 11
    .param p1    # Lxu/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_6

    if-nez v2, :cond_0

    return-wide v0

    :cond_0
    iget-byte v0, p0, Lxu/s;->a:B

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lxu/s;->b()V

    iput-byte v1, p0, Lxu/s;->a:B

    :cond_1
    iget-byte v0, p0, Lxu/s;->a:B

    const/4 v2, 0x2

    const-wide/16 v3, -0x1

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, Lxu/e;->size()J

    move-result-wide v7

    iget-object v0, p0, Lxu/s;->d:Lxu/u;

    invoke-virtual {v0, p1, p2, p3}, Lxu/u;->read(Lxu/e;J)J

    move-result-wide v9

    cmp-long p2, v9, v3

    if-eqz p2, :cond_2

    move-object v5, p0

    move-object v6, p1

    invoke-virtual/range {v5 .. v10}, Lxu/s;->d(Lxu/e;JJ)V

    return-wide v9

    :cond_2
    move-object v5, p0

    iput-byte v2, v5, Lxu/s;->a:B

    goto :goto_0

    :cond_3
    move-object v5, p0

    :goto_0
    iget-byte p1, v5, Lxu/s;->a:B

    if-ne p1, v2, :cond_5

    invoke-virtual {p0}, Lxu/s;->c()V

    const/4 p1, 0x3

    iput-byte p1, v5, Lxu/s;->a:B

    iget-object p1, v5, Lxu/s;->b:Lxu/l0;

    invoke-virtual {p1}, Lxu/l0;->Z1()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "gzip finished without exhausting source"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_1
    return-wide v3

    :cond_6
    move-object v5, p0

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

.method public timeout()Lxu/s0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lxu/s;->b:Lxu/l0;

    invoke-virtual {v0}, Lxu/l0;->timeout()Lxu/s0;

    move-result-object v0

    return-object v0
.end method
