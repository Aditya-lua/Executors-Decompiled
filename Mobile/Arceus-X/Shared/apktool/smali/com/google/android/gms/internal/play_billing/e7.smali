.class public final Lcom/google/android/gms/internal/play_billing/e7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/google/android/gms/internal/play_billing/e3;->a:I

    return-void
.end method

.method public static a(Ljava/lang/String;[BII)I
    .locals 10

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    add-int v2, p2, p3

    const/16 v3, 0x80

    if-ge v1, v0, :cond_0

    add-int v4, v1, p2

    if-ge v4, v2, :cond_0

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-ge v5, v3, :cond_0

    int-to-byte v2, v5

    aput-byte v2, p1, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    if-ne v1, v0, :cond_1

    add-int/2addr p2, v0

    return p2

    :cond_1
    add-int v4, p2, v1

    :goto_1
    if-ge v1, v0, :cond_b

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-ge v5, v3, :cond_2

    if-ge v4, v2, :cond_2

    add-int/lit8 v6, v4, 0x1

    int-to-byte v5, v5

    aput-byte v5, p1, v4

    move v4, v6

    goto/16 :goto_2

    :cond_2
    const/16 v6, 0x800

    if-ge v5, v6, :cond_3

    add-int/lit8 v6, v2, -0x2

    if-gt v4, v6, :cond_3

    add-int/lit8 v6, v4, 0x1

    add-int/lit8 v7, v4, 0x2

    ushr-int/lit8 v8, v5, 0x6

    or-int/lit16 v8, v8, 0x3c0

    int-to-byte v8, v8

    aput-byte v8, p1, v4

    and-int/lit8 v4, v5, 0x3f

    or-int/2addr v4, v3

    int-to-byte v4, v4

    aput-byte v4, p1, v6

    move v4, v7

    goto :goto_2

    :cond_3
    const v6, 0xdfff

    const v7, 0xd800

    if-lt v5, v7, :cond_4

    if-le v5, v6, :cond_5

    :cond_4
    add-int/lit8 v8, v2, -0x3

    if-gt v4, v8, :cond_5

    add-int/lit8 v6, v4, 0x1

    add-int/lit8 v7, v4, 0x2

    add-int/lit8 v8, v4, 0x3

    ushr-int/lit8 v9, v5, 0xc

    or-int/lit16 v9, v9, 0x1e0

    int-to-byte v9, v9

    aput-byte v9, p1, v4

    ushr-int/lit8 v4, v5, 0x6

    and-int/lit8 v4, v4, 0x3f

    or-int/2addr v4, v3

    int-to-byte v4, v4

    aput-byte v4, p1, v6

    and-int/lit8 v4, v5, 0x3f

    or-int/2addr v4, v3

    int-to-byte v4, v4

    aput-byte v4, p1, v7

    move v4, v8

    goto :goto_2

    :cond_5
    add-int/lit8 v8, v2, -0x4

    if-gt v4, v8, :cond_8

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v6

    if-eq v1, v6, :cond_7

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_3

    :cond_6
    add-int/lit8 v7, v4, 0x1

    add-int/lit8 v8, v4, 0x2

    add-int/lit8 v9, v4, 0x3

    invoke-static {v5, v6}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v5

    ushr-int/lit8 v6, v5, 0x12

    or-int/lit16 v6, v6, 0xf0

    int-to-byte v6, v6

    aput-byte v6, p1, v4

    ushr-int/lit8 v6, v5, 0xc

    and-int/lit8 v6, v6, 0x3f

    or-int/2addr v6, v3

    int-to-byte v6, v6

    aput-byte v6, p1, v7

    ushr-int/lit8 v6, v5, 0x6

    and-int/lit8 v6, v6, 0x3f

    or-int/2addr v6, v3

    int-to-byte v6, v6

    aput-byte v6, p1, v8

    add-int/lit8 v4, v4, 0x4

    and-int/lit8 v5, v5, 0x3f

    or-int/2addr v5, v3

    int-to-byte v5, v5

    aput-byte v5, p1, v9

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_1

    :cond_7
    :goto_3
    invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/internal/play_billing/c7;->a(Ljava/lang/String;[BII)I

    move-result p0

    return p0

    :cond_8
    if-lt v5, v7, :cond_a

    if-gt v5, v6, :cond_a

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eq v1, v0, :cond_9

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v5, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v0

    if-nez v0, :cond_a

    :cond_9
    invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/internal/play_billing/c7;->a(Ljava/lang/String;[BII)I

    move-result p0

    return p0

    :cond_a
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string p1, "Not enough space in output buffer to encode UTF-8 string"

    invoke-direct {p0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b
    return v4
.end method

.method public static b([BII)Z
    .locals 8

    :goto_0
    if-ge p1, p2, :cond_0

    aget-byte v0, p0, p1

    if-ltz v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-lt p1, p2, :cond_1

    return v0

    :cond_1
    :goto_1
    if-lt p1, p2, :cond_2

    return v0

    :cond_2
    add-int/lit8 v1, p1, 0x1

    aget-byte v2, p0, p1

    if-gez v2, :cond_f

    const/16 v3, -0x20

    const/16 v4, -0x41

    const/4 v5, 0x0

    if-ge v2, v3, :cond_5

    if-lt v1, p2, :cond_3

    return v5

    :cond_3
    const/16 v3, -0x3e

    if-lt v2, v3, :cond_4

    add-int/lit8 p1, p1, 0x2

    aget-byte v1, p0, v1

    if-le v1, v4, :cond_1

    :cond_4
    return v5

    :cond_5
    const/16 v6, -0x10

    if-ge v2, v6, :cond_c

    add-int/lit8 v6, p2, -0x1

    if-lt v1, v6, :cond_6

    return v5

    :cond_6
    add-int/lit8 v6, p1, 0x2

    aget-byte v1, p0, v1

    if-gt v1, v4, :cond_b

    const/16 v7, -0x60

    if-ne v2, v3, :cond_8

    if-lt v1, v7, :cond_7

    goto :goto_2

    :cond_7
    return v5

    :cond_8
    :goto_2
    const/16 v3, -0x13

    if-ne v2, v3, :cond_a

    if-ge v1, v7, :cond_9

    goto :goto_3

    :cond_9
    return v5

    :cond_a
    :goto_3
    add-int/lit8 p1, p1, 0x3

    aget-byte v1, p0, v6

    if-le v1, v4, :cond_1

    :cond_b
    return v5

    :cond_c
    add-int/lit8 v3, p2, -0x2

    if-lt v1, v3, :cond_d

    return v5

    :cond_d
    add-int/lit8 v3, p1, 0x2

    aget-byte v1, p0, v1

    if-gt v1, v4, :cond_e

    shl-int/lit8 v2, v2, 0x1c

    add-int/lit8 v1, v1, 0x70

    add-int/2addr v2, v1

    shr-int/lit8 v1, v2, 0x1e

    if-nez v1, :cond_e

    add-int/lit8 v1, p1, 0x3

    aget-byte v2, p0, v3

    if-gt v2, v4, :cond_e

    add-int/lit8 p1, p1, 0x4

    aget-byte v1, p0, v1

    if-le v1, v4, :cond_1

    :cond_e
    return v5

    :cond_f
    move p1, v1

    goto :goto_1
.end method
