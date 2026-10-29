.class public final Lyu/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0016\n\u0002\u0008\u0003\u001a7\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a%\u0010\u0014\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001aA\u0010\u001d\u001a\u00020\u000c*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u001a\u001b\u0010!\u001a\u00020\u001f*\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0000\u00a2\u0006\u0004\u0008!\u0010\"\"\u001a\u0010\'\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&\"\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010)\u00a8\u0006+"
    }
    d2 = {
        "Lxu/m0;",
        "segment",
        "",
        "segmentPos",
        "",
        "bytes",
        "bytesOffset",
        "bytesLimit",
        "",
        "g",
        "(Lxu/m0;I[BII)Z",
        "Lxu/e;",
        "",
        "newline",
        "",
        "h",
        "(Lxu/e;J)Ljava/lang/String;",
        "Lxu/f0;",
        "options",
        "selectTruncated",
        "i",
        "(Lxu/e;Lxu/f0;Z)I",
        "v",
        "e",
        "(J)I",
        "Lxu/h;",
        "fromIndex",
        "toIndex",
        "byteCount",
        "b",
        "(Lxu/e;Lxu/h;JJII)J",
        "Lxu/e$a;",
        "unsafeCursor",
        "d",
        "(Lxu/e;Lxu/e$a;)Lxu/e$a;",
        "a",
        "[B",
        "f",
        "()[B",
        "HEX_DIGIT_BYTES",
        "",
        "[J",
        "DigitCountToLargestValue",
        "okio"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:[B
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:[J
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "0123456789abcdef"

    invoke-static {v0}, Lxu/v0;->a(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lyu/a;->a:[B

    const/16 v0, 0x14

    new-array v0, v0, [J

    fill-array-data v0, :array_0

    sput-object v0, Lyu/a;->b:[J

    return-void

    :array_0
    .array-data 8
        -0x1
        0x9
        0x63
        0x3e7
        0x270f
        0x1869f
        0xf423f
        0x98967f
        0x5f5e0ff
        0x3b9ac9ff
        0x2540be3ffL
        0x174876e7ffL
        0xe8d4a50fffL
        0x9184e729fffL
        0x5af3107a3fffL
        0x38d7ea4c67fffL
        0x2386f26fc0ffffL
        0x16345785d89ffffL
        0xde0b6b3a763ffffL
        0x7fffffffffffffffL
    .end array-data
.end method

.method public static final synthetic a(J)I
    .locals 0

    invoke-static {p0, p1}, Lyu/a;->e(J)I

    move-result p0

    return p0
.end method

.method public static final b(Lxu/e;Lxu/h;JJII)J
    .locals 20
    .param p0    # Lxu/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lxu/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    move-wide/from16 v3, p4

    move/from16 v5, p6

    move/from16 v6, p7

    const-string v7, "<this>"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "bytes"

    move-object/from16 v8, p1

    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8}, Lxu/h;->I()I

    move-result v7

    int-to-long v9, v7

    int-to-long v11, v5

    int-to-long v13, v6

    invoke-static/range {v9 .. v14}, Lxu/b;->b(JJJ)V

    if-lez v6, :cond_e

    const-wide/16 v9, 0x0

    cmp-long v7, v1, v9

    if-ltz v7, :cond_d

    cmp-long v7, v1, v3

    if-gtz v7, :cond_c

    invoke-virtual {v0}, Lxu/e;->size()J

    move-result-wide v11

    cmp-long v7, v3, v11

    if-lez v7, :cond_0

    invoke-virtual {v0}, Lxu/e;->size()J

    move-result-wide v3

    :cond_0
    cmp-long v7, v1, v3

    const-wide/16 v11, -0x1

    if-nez v7, :cond_1

    return-wide v11

    :cond_1
    iget-object v7, v0, Lxu/e;->a:Lxu/m0;

    if-nez v7, :cond_2

    return-wide v11

    :cond_2
    invoke-virtual {v0}, Lxu/e;->size()J

    move-result-wide v15

    sub-long/2addr v15, v1

    cmp-long v15, v15, v1

    const-wide/16 v16, 0x1

    if-gez v15, :cond_7

    invoke-virtual {v0}, Lxu/e;->size()J

    move-result-wide v9

    :goto_0
    cmp-long v15, v9, v1

    if-lez v15, :cond_3

    iget-object v7, v7, Lxu/m0;->g:Lxu/m0;

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v15, v7, Lxu/m0;->c:I

    move-wide/from16 p4, v11

    iget v11, v7, Lxu/m0;->b:I

    sub-int/2addr v15, v11

    int-to-long v11, v15

    sub-long/2addr v9, v11

    move-wide/from16 v11, p4

    goto :goto_0

    :cond_3
    move-wide/from16 p4, v11

    invoke-virtual {v8}, Lxu/h;->w()[B

    move-result-object v8

    aget-byte v11, v8, v5

    invoke-virtual {v0}, Lxu/e;->size()J

    move-result-wide v18

    sub-long v18, v18, v13

    add-long v12, v18, v16

    invoke-static {v3, v4, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    :goto_1
    cmp-long v0, v9, v3

    if-gez v0, :cond_6

    iget-object v0, v7, Lxu/m0;->a:[B

    iget v12, v7, Lxu/m0;->c:I

    iget v13, v7, Lxu/m0;->b:I

    int-to-long v13, v13

    add-long/2addr v13, v3

    sub-long/2addr v13, v9

    move-wide/from16 p0, v1

    move-object v2, v0

    int-to-long v0, v12

    invoke-static {v0, v1, v13, v14}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    iget v1, v7, Lxu/m0;->b:I

    int-to-long v12, v1

    add-long v12, v12, p0

    sub-long/2addr v12, v9

    long-to-int v1, v12

    :goto_2
    if-ge v1, v0, :cond_5

    aget-byte v12, v2, v1

    if-ne v12, v11, :cond_4

    add-int/lit8 v12, v1, 0x1

    add-int/lit8 v13, v5, 0x1

    invoke-static {v7, v12, v8, v13, v6}, Lyu/a;->g(Lxu/m0;I[BII)Z

    move-result v12

    if-eqz v12, :cond_4

    :goto_3
    iget v0, v7, Lxu/m0;->b:I

    sub-int/2addr v1, v0

    int-to-long v0, v1

    add-long/2addr v0, v9

    return-wide v0

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_5
    iget v0, v7, Lxu/m0;->c:I

    iget v1, v7, Lxu/m0;->b:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    add-long/2addr v9, v0

    iget-object v7, v7, Lxu/m0;->f:Lxu/m0;

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-wide v1, v9

    goto :goto_1

    :cond_6
    return-wide p4

    :cond_7
    move-wide/from16 p4, v11

    :goto_4
    iget v11, v7, Lxu/m0;->c:I

    iget v12, v7, Lxu/m0;->b:I

    sub-int/2addr v11, v12

    int-to-long v11, v11

    add-long/2addr v11, v9

    cmp-long v15, v11, v1

    if-gtz v15, :cond_8

    iget-object v7, v7, Lxu/m0;->f:Lxu/m0;

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-wide v9, v11

    goto :goto_4

    :cond_8
    invoke-virtual {v8}, Lxu/h;->w()[B

    move-result-object v8

    aget-byte v11, v8, v5

    invoke-virtual {v0}, Lxu/e;->size()J

    move-result-wide v18

    sub-long v18, v18, v13

    add-long v12, v18, v16

    invoke-static {v3, v4, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    :goto_5
    cmp-long v0, v9, v3

    if-gez v0, :cond_b

    iget-object v0, v7, Lxu/m0;->a:[B

    iget v12, v7, Lxu/m0;->c:I

    iget v13, v7, Lxu/m0;->b:I

    int-to-long v13, v13

    add-long/2addr v13, v3

    sub-long/2addr v13, v9

    move-wide/from16 p0, v1

    move-object v2, v0

    int-to-long v0, v12

    invoke-static {v0, v1, v13, v14}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    iget v1, v7, Lxu/m0;->b:I

    int-to-long v12, v1

    add-long v12, v12, p0

    sub-long/2addr v12, v9

    long-to-int v1, v12

    :goto_6
    if-ge v1, v0, :cond_a

    aget-byte v12, v2, v1

    if-ne v12, v11, :cond_9

    add-int/lit8 v12, v1, 0x1

    add-int/lit8 v13, v5, 0x1

    invoke-static {v7, v12, v8, v13, v6}, Lyu/a;->g(Lxu/m0;I[BII)Z

    move-result v12

    if-eqz v12, :cond_9

    goto :goto_3

    :cond_9
    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_a
    iget v0, v7, Lxu/m0;->c:I

    iget v1, v7, Lxu/m0;->b:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    add-long/2addr v9, v0

    iget-object v7, v7, Lxu/m0;->f:Lxu/m0;

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-wide v1, v9

    goto :goto_5

    :cond_b
    return-wide p4

    :cond_c
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "fromIndex > toIndex: "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " > "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fromIndex < 0: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "byteCount == 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic c(Lxu/e;Lxu/h;JJIIILjava/lang/Object;)J
    .locals 8

    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_0

    const-wide p4, 0x7fffffffffffffffL

    :cond_0
    move-wide v4, p4

    and-int/lit8 p4, p8, 0x8

    if-eqz p4, :cond_1

    const/4 p4, 0x0

    move v6, p4

    goto :goto_0

    :cond_1
    move v6, p6

    :goto_0
    and-int/lit8 p4, p8, 0x10

    if-eqz p4, :cond_2

    invoke-virtual {p1}, Lxu/h;->I()I

    move-result p4

    move v7, p4

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    goto :goto_2

    :cond_2
    move v7, p7

    goto :goto_1

    :goto_2
    invoke-static/range {v0 .. v7}, Lyu/a;->b(Lxu/e;Lxu/h;JJII)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final d(Lxu/e;Lxu/e$a;)Lxu/e$a;
    .locals 1
    .param p0    # Lxu/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lxu/e$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unsafeCursor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lxu/b;->g(Lxu/e$a;)Lxu/e$a;

    move-result-object p1

    iget-object v0, p1, Lxu/e$a;->a:Lxu/e;

    if-nez v0, :cond_0

    iput-object p0, p1, Lxu/e$a;->a:Lxu/e;

    const/4 p0, 0x1

    iput-boolean p0, p1, Lxu/e$a;->b:Z

    return-object p1

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "already attached to a buffer"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final e(J)I
    .locals 4

    invoke-static {p0, p1}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x40

    mul-int/lit8 v0, v0, 0xa

    ushr-int/lit8 v0, v0, 0x5

    sget-object v1, Lyu/a;->b:[J

    aget-wide v2, v1, v0

    cmp-long p0, p0, v2

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    add-int/2addr v0, p0

    return v0
.end method

.method public static final f()[B
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lyu/a;->a:[B

    return-object v0
.end method

.method public static final g(Lxu/m0;I[BII)Z
    .locals 5
    .param p0    # Lxu/m0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "segment"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bytes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lxu/m0;->c:I

    iget-object v1, p0, Lxu/m0;->a:[B

    :goto_0
    if-ge p3, p4, :cond_2

    if-ne p1, v0, :cond_0

    iget-object p0, p0, Lxu/m0;->f:Lxu/m0;

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object p1, p0, Lxu/m0;->a:[B

    iget v0, p0, Lxu/m0;->b:I

    iget v1, p0, Lxu/m0;->c:I

    move v4, v1

    move-object v1, p1

    move p1, v0

    move v0, v4

    :cond_0
    aget-byte v2, v1, p1

    aget-byte v3, p2, p3

    if-eq v2, v3, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method public static final h(Lxu/e;J)Ljava/lang/String;
    .locals 6
    .param p0    # Lxu/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    const-wide/16 v1, 0x1

    if-lez v0, :cond_0

    sub-long v3, p1, v1

    invoke-virtual {p0, v3, v4}, Lxu/e;->j(J)B

    move-result v0

    const/16 v5, 0xd

    if-ne v0, v5, :cond_0

    invoke-virtual {p0, v3, v4}, Lxu/e;->G1(J)Ljava/lang/String;

    move-result-object p1

    const-wide/16 v0, 0x2

    invoke-virtual {p0, v0, v1}, Lxu/e;->skip(J)V

    return-object p1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lxu/e;->G1(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v1, v2}, Lxu/e;->skip(J)V

    return-object p1
.end method

.method public static final i(Lxu/e;Lxu/f0;Z)I
    .locals 17
    .param p0    # Lxu/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lxu/f0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v0, p0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "options"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lxu/e;->a:Lxu/m0;

    const/4 v1, -0x2

    const/4 v3, -0x1

    if-nez v0, :cond_1

    if-eqz p2, :cond_0

    return v1

    :cond_0
    return v3

    :cond_1
    iget-object v4, v0, Lxu/m0;->a:[B

    iget v5, v0, Lxu/m0;->b:I

    iget v6, v0, Lxu/m0;->c:I

    invoke-virtual {v2}, Lxu/f0;->g()[I

    move-result-object v2

    const/4 v7, 0x0

    move-object v9, v0

    move v10, v3

    move v8, v7

    :goto_0
    add-int/lit8 v11, v8, 0x1

    aget v12, v2, v8

    add-int/lit8 v8, v8, 0x2

    aget v11, v2, v11

    if-eq v11, v3, :cond_2

    move v10, v11

    :cond_2
    if-nez v9, :cond_3

    goto :goto_3

    :cond_3
    const/4 v11, 0x0

    if-gez v12, :cond_a

    mul-int/lit8 v12, v12, -0x1

    add-int v13, v8, v12

    :goto_1
    add-int/lit8 v12, v5, 0x1

    aget-byte v5, v4, v5

    and-int/lit16 v5, v5, 0xff

    add-int/lit8 v14, v8, 0x1

    aget v8, v2, v8

    if-eq v5, v8, :cond_4

    goto :goto_6

    :cond_4
    if-ne v14, v13, :cond_5

    const/4 v5, 0x1

    goto :goto_2

    :cond_5
    move v5, v7

    :goto_2
    if-ne v12, v6, :cond_8

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v4, v9, Lxu/m0;->f:Lxu/m0;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v6, v4, Lxu/m0;->b:I

    iget-object v8, v4, Lxu/m0;->a:[B

    iget v9, v4, Lxu/m0;->c:I

    if-ne v4, v0, :cond_7

    if-eqz v5, :cond_6

    move-object v4, v8

    move-object v8, v11

    goto :goto_4

    :cond_6
    :goto_3
    if-eqz p2, :cond_b

    return v1

    :cond_7
    move-object/from16 v16, v8

    move-object v8, v4

    move-object/from16 v4, v16

    goto :goto_4

    :cond_8
    move-object v8, v9

    move v9, v6

    move v6, v12

    :goto_4
    if-eqz v5, :cond_9

    aget v5, v2, v14

    move v13, v6

    move v6, v9

    move-object v9, v8

    goto :goto_7

    :cond_9
    move v5, v6

    move v6, v9

    move-object v9, v8

    move v8, v14

    goto :goto_1

    :cond_a
    add-int/lit8 v13, v5, 0x1

    aget-byte v5, v4, v5

    and-int/lit16 v5, v5, 0xff

    add-int v14, v8, v12

    :goto_5
    if-ne v8, v14, :cond_c

    :cond_b
    :goto_6
    return v10

    :cond_c
    aget v15, v2, v8

    if-ne v5, v15, :cond_f

    add-int/2addr v8, v12

    aget v5, v2, v8

    if-ne v13, v6, :cond_d

    iget-object v9, v9, Lxu/m0;->f:Lxu/m0;

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v4, v9, Lxu/m0;->b:I

    iget-object v6, v9, Lxu/m0;->a:[B

    iget v8, v9, Lxu/m0;->c:I

    move v13, v4

    move-object v4, v6

    move v6, v8

    if-ne v9, v0, :cond_d

    move-object v9, v11

    :cond_d
    :goto_7
    if-ltz v5, :cond_e

    return v5

    :cond_e
    neg-int v8, v5

    move v5, v13

    goto/16 :goto_0

    :cond_f
    add-int/lit8 v8, v8, 0x1

    goto :goto_5
.end method

.method public static synthetic j(Lxu/e;Lxu/f0;ZILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lyu/a;->i(Lxu/e;Lxu/f0;Z)I

    move-result p0

    return p0
.end method
