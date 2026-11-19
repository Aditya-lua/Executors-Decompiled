.class public final Lcom/google/crypto/tink/shaded/protobuf/r1$c;
.super Lcom/google/crypto/tink/shaded/protobuf/r1$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/crypto/tink/shaded/protobuf/r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/r1$b;-><init>()V

    return-void
.end method

.method public static e([BII)I
    .locals 1

    :goto_0
    if-ge p1, p2, :cond_0

    aget-byte v0, p0, p1

    if-ltz v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    if-lt p1, p2, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-static {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/r1$c;->f([BII)I

    move-result p0

    return p0
.end method

.method public static f([BII)I
    .locals 7

    :cond_0
    :goto_0
    if-lt p1, p2, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    add-int/lit8 v0, p1, 0x1

    aget-byte v1, p0, p1

    if-gez v1, :cond_c

    const/16 v2, -0x20

    const/4 v3, -0x1

    const/16 v4, -0x41

    if-ge v1, v2, :cond_4

    if-lt v0, p2, :cond_2

    return v1

    :cond_2
    const/16 v2, -0x3e

    if-lt v1, v2, :cond_3

    add-int/lit8 p1, p1, 0x2

    aget-byte v0, p0, v0

    if-le v0, v4, :cond_0

    :cond_3
    return v3

    :cond_4
    const/16 v5, -0x10

    if-ge v1, v5, :cond_9

    add-int/lit8 v5, p2, -0x1

    if-lt v0, v5, :cond_5

    invoke-static {p0, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/r1;->c([BII)I

    move-result p0

    return p0

    :cond_5
    add-int/lit8 v5, p1, 0x2

    aget-byte v0, p0, v0

    if-gt v0, v4, :cond_8

    const/16 v6, -0x60

    if-ne v1, v2, :cond_6

    if-lt v0, v6, :cond_8

    :cond_6
    const/16 v2, -0x13

    if-ne v1, v2, :cond_7

    if-ge v0, v6, :cond_8

    :cond_7
    add-int/lit8 p1, p1, 0x3

    aget-byte v0, p0, v5

    if-le v0, v4, :cond_0

    :cond_8
    return v3

    :cond_9
    add-int/lit8 v2, p2, -0x2

    if-lt v0, v2, :cond_a

    invoke-static {p0, v0, p2}, Lcom/google/crypto/tink/shaded/protobuf/r1;->c([BII)I

    move-result p0

    return p0

    :cond_a
    add-int/lit8 v2, p1, 0x2

    aget-byte v0, p0, v0

    if-gt v0, v4, :cond_b

    shl-int/lit8 v1, v1, 0x1c

    add-int/lit8 v0, v0, 0x70

    add-int/2addr v1, v0

    shr-int/lit8 v0, v1, 0x1e

    if-nez v0, :cond_b

    add-int/lit8 v0, p1, 0x3

    aget-byte v1, p0, v2

    if-gt v1, v4, :cond_b

    add-int/lit8 p1, p1, 0x4

    aget-byte v0, p0, v0

    if-le v0, v4, :cond_0

    :cond_b
    return v3

    :cond_c
    move p1, v0

    goto :goto_0
.end method


# virtual methods
.method public a([BII)Ljava/lang/String;
    .locals 7

    or-int v0, p2, p3

    array-length v1, p1

    sub-int/2addr v1, p2

    sub-int/2addr v1, p3

    or-int/2addr v0, v1

    if-ltz v0, :cond_b

    add-int v0, p2, p3

    new-array v5, p3, [C

    const/4 p3, 0x0

    move v1, p3

    :goto_0
    if-ge p2, v0, :cond_1

    aget-byte v2, p1, p2

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/r1$a;->b(B)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p2, p2, 0x1

    add-int/lit8 v3, v1, 0x1

    invoke-static {v2, v5, v1}, Lcom/google/crypto/tink/shaded/protobuf/r1$a;->c(B[CI)V

    move v1, v3

    goto :goto_0

    :cond_1
    :goto_1
    move v6, v1

    :goto_2
    if-ge p2, v0, :cond_a

    add-int/lit8 v1, p2, 0x1

    move v2, v1

    aget-byte v1, p1, p2

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/r1$a;->b(B)Z

    move-result v3

    if-eqz v3, :cond_4

    add-int/lit8 p2, v6, 0x1

    invoke-static {v1, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/r1$a;->c(B[CI)V

    move v1, v2

    :goto_3
    if-ge v1, v0, :cond_3

    aget-byte v2, p1, v1

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/r1$a;->b(B)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_4

    :cond_2
    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v3, p2, 0x1

    invoke-static {v2, v5, p2}, Lcom/google/crypto/tink/shaded/protobuf/r1$a;->c(B[CI)V

    move p2, v3

    goto :goto_3

    :cond_3
    :goto_4
    move v6, p2

    move p2, v1

    goto :goto_2

    :cond_4
    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/r1$a;->d(B)Z

    move-result v3

    if-eqz v3, :cond_6

    if-ge v2, v0, :cond_5

    add-int/lit8 p2, p2, 0x2

    aget-byte v2, p1, v2

    add-int/lit8 v3, v6, 0x1

    invoke-static {v1, v2, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/r1$a;->e(BB[CI)V

    move v6, v3

    goto :goto_2

    :cond_5
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->d()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p1

    throw p1

    :cond_6
    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/r1$a;->f(B)Z

    move-result v3

    if-eqz v3, :cond_8

    add-int/lit8 v3, v0, -0x1

    if-ge v2, v3, :cond_7

    add-int/lit8 v3, p2, 0x2

    aget-byte v2, p1, v2

    add-int/lit8 p2, p2, 0x3

    aget-byte v3, p1, v3

    add-int/lit8 v4, v6, 0x1

    invoke-static {v1, v2, v3, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/r1$a;->g(BBB[CI)V

    move v6, v4

    goto :goto_2

    :cond_7
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->d()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p1

    throw p1

    :cond_8
    add-int/lit8 v3, v0, -0x2

    if-ge v2, v3, :cond_9

    add-int/lit8 v3, p2, 0x2

    aget-byte v2, p1, v2

    add-int/lit8 v4, p2, 0x3

    aget-byte v3, p1, v3

    add-int/lit8 p2, p2, 0x4

    aget-byte v4, p1, v4

    invoke-static/range {v1 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/r1$a;->a(BBBB[CI)V

    add-int/lit8 v6, v6, 0x2

    goto :goto_2

    :cond_9
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/b0;->d()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object p1

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v5, p3, v6}, Ljava/lang/String;-><init>([CII)V

    return-object p1

    :cond_b
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    array-length p1, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "buffer length=%d, index=%d, size=%d"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Ljava/lang/String;[BII)I
    .locals 7

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr p4, p3

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x80

    if-ge v1, v0, :cond_0

    add-int v3, v1, p3

    if-ge v3, p4, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-ge v4, v2, :cond_0

    int-to-byte v2, v4

    aput-byte v2, p2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    if-ne v1, v0, :cond_1

    add-int/2addr p3, v0

    return p3

    :cond_1
    add-int/2addr p3, v1

    :goto_1
    if-ge v1, v0, :cond_b

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ge v3, v2, :cond_2

    if-ge p3, p4, :cond_2

    add-int/lit8 v4, p3, 0x1

    int-to-byte v3, v3

    aput-byte v3, p2, p3

    move p3, v4

    goto/16 :goto_2

    :cond_2
    const/16 v4, 0x800

    if-ge v3, v4, :cond_3

    add-int/lit8 v4, p4, -0x2

    if-gt p3, v4, :cond_3

    add-int/lit8 v4, p3, 0x1

    ushr-int/lit8 v5, v3, 0x6

    or-int/lit16 v5, v5, 0x3c0

    int-to-byte v5, v5

    aput-byte v5, p2, p3

    add-int/lit8 p3, p3, 0x2

    and-int/lit8 v3, v3, 0x3f

    or-int/2addr v3, v2

    int-to-byte v3, v3

    aput-byte v3, p2, v4

    goto :goto_2

    :cond_3
    const v4, 0xdfff

    const v5, 0xd800

    if-lt v3, v5, :cond_4

    if-ge v4, v3, :cond_5

    :cond_4
    add-int/lit8 v6, p4, -0x3

    if-gt p3, v6, :cond_5

    add-int/lit8 v4, p3, 0x1

    ushr-int/lit8 v5, v3, 0xc

    or-int/lit16 v5, v5, 0x1e0

    int-to-byte v5, v5

    aput-byte v5, p2, p3

    add-int/lit8 v5, p3, 0x2

    ushr-int/lit8 v6, v3, 0x6

    and-int/lit8 v6, v6, 0x3f

    or-int/2addr v6, v2

    int-to-byte v6, v6

    aput-byte v6, p2, v4

    add-int/lit8 p3, p3, 0x3

    and-int/lit8 v3, v3, 0x3f

    or-int/2addr v3, v2

    int-to-byte v3, v3

    aput-byte v3, p2, v5

    goto :goto_2

    :cond_5
    add-int/lit8 v6, p4, -0x4

    if-gt p3, v6, :cond_8

    add-int/lit8 v4, v1, 0x1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    if-eq v4, v5, :cond_7

    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v3, v1}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-static {v3, v1}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v1

    add-int/lit8 v3, p3, 0x1

    ushr-int/lit8 v5, v1, 0x12

    or-int/lit16 v5, v5, 0xf0

    int-to-byte v5, v5

    aput-byte v5, p2, p3

    add-int/lit8 v5, p3, 0x2

    ushr-int/lit8 v6, v1, 0xc

    and-int/lit8 v6, v6, 0x3f

    or-int/2addr v6, v2

    int-to-byte v6, v6

    aput-byte v6, p2, v3

    add-int/lit8 v3, p3, 0x3

    ushr-int/lit8 v6, v1, 0x6

    and-int/lit8 v6, v6, 0x3f

    or-int/2addr v6, v2

    int-to-byte v6, v6

    aput-byte v6, p2, v5

    add-int/lit8 p3, p3, 0x4

    and-int/lit8 v1, v1, 0x3f

    or-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, p2, v3

    move v1, v4

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_1

    :cond_6
    move v1, v4

    :cond_7
    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/r1$d;

    add-int/lit8 v1, v1, -0x1

    invoke-direct {p1, v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/r1$d;-><init>(II)V

    throw p1

    :cond_8
    if-gt v5, v3, :cond_a

    if-gt v3, v4, :cond_a

    add-int/lit8 p2, v1, 0x1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p4

    if-eq p2, p4, :cond_9

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-static {v3, p1}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result p1

    if-nez p1, :cond_a

    :cond_9
    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/r1$d;

    invoke-direct {p1, v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/r1$d;-><init>(II)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Failed writing "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p4, " at index "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    return p3
.end method

.method public d(I[BII)I
    .locals 6

    if-eqz p1, :cond_f

    if-lt p3, p4, :cond_0

    return p1

    :cond_0
    int-to-byte v0, p1

    const/16 v1, -0x20

    const/4 v2, -0x1

    const/16 v3, -0x41

    if-ge v0, v1, :cond_3

    const/16 p1, -0x3e

    if-lt v0, p1, :cond_2

    add-int/lit8 p1, p3, 0x1

    aget-byte p3, p2, p3

    if-le p3, v3, :cond_1

    goto :goto_0

    :cond_1
    move p3, p1

    goto/16 :goto_2

    :cond_2
    :goto_0
    return v2

    :cond_3
    const/16 v4, -0x10

    if-ge v0, v4, :cond_9

    shr-int/lit8 p1, p1, 0x8

    not-int p1, p1

    int-to-byte p1, p1

    if-nez p1, :cond_5

    add-int/lit8 p1, p3, 0x1

    aget-byte p3, p2, p3

    if-lt p1, p4, :cond_4

    invoke-static {v0, p3}, Lcom/google/crypto/tink/shaded/protobuf/r1;->a(II)I

    move-result p1

    return p1

    :cond_4
    move v5, p3

    move p3, p1

    move p1, v5

    :cond_5
    if-gt p1, v3, :cond_8

    const/16 v4, -0x60

    if-ne v0, v1, :cond_6

    if-lt p1, v4, :cond_8

    :cond_6
    const/16 v1, -0x13

    if-ne v0, v1, :cond_7

    if-ge p1, v4, :cond_8

    :cond_7
    add-int/lit8 p1, p3, 0x1

    aget-byte p3, p2, p3

    if-le p3, v3, :cond_1

    :cond_8
    return v2

    :cond_9
    shr-int/lit8 v1, p1, 0x8

    not-int v1, v1

    int-to-byte v1, v1

    if-nez v1, :cond_b

    add-int/lit8 p1, p3, 0x1

    aget-byte v1, p2, p3

    if-lt p1, p4, :cond_a

    invoke-static {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/r1;->a(II)I

    move-result p1

    return p1

    :cond_a
    const/4 p3, 0x0

    goto :goto_1

    :cond_b
    shr-int/lit8 p1, p1, 0x10

    int-to-byte p1, p1

    move v5, p3

    move p3, p1

    move p1, v5

    :goto_1
    if-nez p3, :cond_d

    add-int/lit8 p3, p1, 0x1

    aget-byte p1, p2, p1

    if-lt p3, p4, :cond_c

    invoke-static {v0, v1, p1}, Lcom/google/crypto/tink/shaded/protobuf/r1;->b(III)I

    move-result p1

    return p1

    :cond_c
    move v5, p3

    move p3, p1

    move p1, v5

    :cond_d
    if-gt v1, v3, :cond_e

    shl-int/lit8 v0, v0, 0x1c

    add-int/lit8 v1, v1, 0x70

    add-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x1e

    if-nez v0, :cond_e

    if-gt p3, v3, :cond_e

    add-int/lit8 p3, p1, 0x1

    aget-byte p1, p2, p1

    if-le p1, v3, :cond_f

    :cond_e
    return v2

    :cond_f
    :goto_2
    invoke-static {p2, p3, p4}, Lcom/google/crypto/tink/shaded/protobuf/r1$c;->e([BII)I

    move-result p1

    return p1
.end method
