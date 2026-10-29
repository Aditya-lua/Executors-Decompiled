.class public final Lwe/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwe/e$b;,
        Lwe/e$a;,
        Lwe/e$c;,
        Lwe/e$e;,
        Lwe/e$d;
    }
.end annotation


# static fields
.field public static final a:Lwe/e$a;

.field public static final b:Lwe/e$c;

.field public static final c:[B


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lwe/e$a;

    const/16 v1, 0xa

    new-array v2, v1, [J

    fill-array-data v2, :array_0

    new-array v3, v1, [J

    fill-array-data v3, :array_1

    new-array v4, v1, [J

    fill-array-data v4, :array_2

    invoke-direct {v0, v2, v3, v4}, Lwe/e$a;-><init>([J[J[J)V

    sput-object v0, Lwe/e;->a:Lwe/e$a;

    new-instance v0, Lwe/e$c;

    new-instance v2, Lwe/e$d;

    new-array v3, v1, [J

    fill-array-data v3, :array_3

    new-array v4, v1, [J

    fill-array-data v4, :array_4

    new-array v5, v1, [J

    fill-array-data v5, :array_5

    invoke-direct {v2, v3, v4, v5}, Lwe/e$d;-><init>([J[J[J)V

    new-array v1, v1, [J

    fill-array-data v1, :array_6

    invoke-direct {v0, v2, v1}, Lwe/e$c;-><init>(Lwe/e$d;[J)V

    sput-object v0, Lwe/e;->b:Lwe/e$c;

    const/16 v0, 0x20

    new-array v0, v0, [B

    fill-array-data v0, :array_7

    sput-object v0, Lwe/e;->c:[B

    return-void

    :array_0
    .array-data 8
        0x1
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data

    :array_1
    .array-data 8
        0x1
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data

    :array_2
    .array-data 8
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data

    :array_3
    .array-data 8
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data

    :array_4
    .array-data 8
        0x1
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data

    :array_5
    .array-data 8
        0x1
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data

    :array_6
    .array-data 8
        0x1
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data

    :array_7
    .array-data 1
        -0x13t
        -0x2dt
        -0xbt
        0x5ct
        0x1at
        0x63t
        0x12t
        0x58t
        -0x2at
        -0x64t
        -0x9t
        -0x5et
        -0x22t
        -0x7t
        -0x22t
        0x14t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x10t
    .end array-data
.end method

.method public static A([B[B[B)Z
    .locals 5

    array-length v0, p1

    const/4 v1, 0x0

    const/16 v2, 0x40

    if-eq v0, v2, :cond_0

    return v1

    :cond_0
    const/16 v0, 0x20

    invoke-static {p1, v0, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v2

    invoke-static {v2}, Lwe/e;->n([B)Z

    move-result v3

    if-nez v3, :cond_1

    return v1

    :cond_1
    sget-object v3, Ldf/m;->e:Ldf/m;

    const-string v4, "SHA-512"

    invoke-virtual {v3, v4}, Ldf/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/MessageDigest;

    invoke-virtual {v3, p1, v1, v0}, Ljava/security/MessageDigest;->update([BII)V

    invoke-virtual {v3, p2}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v3, p0}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    invoke-static {p0}, Lwe/e;->t([B)V

    invoke-static {p2}, Lwe/e$e;->b([B)Lwe/e$e;

    move-result-object p2

    invoke-static {p0, p2, v2}, Lwe/e;->f([BLwe/e$e;[B)Lwe/e$d;

    move-result-object p0

    invoke-virtual {p0}, Lwe/e$d;->c()[B

    move-result-object p0

    move p2, v1

    :goto_0
    if-ge p2, v0, :cond_3

    aget-byte v2, p0, p2

    aget-byte v3, p1, p2

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic a([J)I
    .locals 0

    invoke-static {p0}, Lwe/e;->k([J)I

    move-result p0

    return p0
.end method

.method public static synthetic b([J[J)V
    .locals 0

    invoke-static {p0, p1}, Lwe/e;->s([J[J)V

    return-void
.end method

.method public static synthetic c([J)Z
    .locals 0

    invoke-static {p0}, Lwe/e;->m([J)Z

    move-result p0

    return p0
.end method

.method public static synthetic d([J[J)V
    .locals 0

    invoke-static {p0, p1}, Lwe/e;->r([J[J)V

    return-void
.end method

.method public static e(Lwe/e$c;Lwe/e$e;Lwe/e$a;)V
    .locals 4

    const/16 v0, 0xa

    new-array v0, v0, [J

    iget-object v1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object v1, v1, Lwe/e$d;->a:[J

    iget-object v2, p1, Lwe/e$e;->a:Lwe/e$d;

    iget-object v3, v2, Lwe/e$d;->b:[J

    iget-object v2, v2, Lwe/e$d;->a:[J

    invoke-static {v1, v3, v2}, Lwe/i;->o([J[J[J)V

    iget-object v1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object v1, v1, Lwe/e$d;->b:[J

    iget-object v2, p1, Lwe/e$e;->a:Lwe/e$d;

    iget-object v3, v2, Lwe/e$d;->b:[J

    iget-object v2, v2, Lwe/e$d;->a:[J

    invoke-static {v1, v3, v2}, Lwe/i;->m([J[J[J)V

    iget-object v1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object v1, v1, Lwe/e$d;->b:[J

    iget-object v2, p2, Lwe/e$a;->b:[J

    invoke-static {v1, v1, v2}, Lwe/i;->f([J[J[J)V

    iget-object v1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object v2, v1, Lwe/e$d;->c:[J

    iget-object v1, v1, Lwe/e$d;->a:[J

    iget-object v3, p2, Lwe/e$a;->a:[J

    invoke-static {v2, v1, v3}, Lwe/i;->f([J[J[J)V

    iget-object v1, p0, Lwe/e$c;->b:[J

    iget-object v2, p1, Lwe/e$e;->b:[J

    iget-object v3, p2, Lwe/e$a;->c:[J

    invoke-static {v1, v2, v3}, Lwe/i;->f([J[J[J)V

    iget-object v1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object v1, v1, Lwe/e$d;->a:[J

    iget-object p1, p1, Lwe/e$e;->a:Lwe/e$d;

    iget-object p1, p1, Lwe/e$d;->c:[J

    invoke-virtual {p2, v1, p1}, Lwe/e$a;->b([J[J)V

    iget-object p1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object p1, p1, Lwe/e$d;->a:[J

    invoke-static {v0, p1, p1}, Lwe/i;->o([J[J[J)V

    iget-object p1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object p2, p1, Lwe/e$d;->a:[J

    iget-object v1, p1, Lwe/e$d;->c:[J

    iget-object p1, p1, Lwe/e$d;->b:[J

    invoke-static {p2, v1, p1}, Lwe/i;->m([J[J[J)V

    iget-object p1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object p2, p1, Lwe/e$d;->b:[J

    iget-object p1, p1, Lwe/e$d;->c:[J

    invoke-static {p2, p1, p2}, Lwe/i;->o([J[J[J)V

    iget-object p1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object p1, p1, Lwe/e$d;->c:[J

    iget-object p2, p0, Lwe/e$c;->b:[J

    invoke-static {p1, v0, p2}, Lwe/i;->o([J[J[J)V

    iget-object p0, p0, Lwe/e$c;->b:[J

    invoke-static {p0, v0, p0}, Lwe/i;->m([J[J[J)V

    return-void
.end method

.method public static f([BLwe/e$e;[B)Lwe/e$d;
    .locals 6

    const/16 v0, 0x8

    new-array v1, v0, [Lwe/e$b;

    new-instance v2, Lwe/e$b;

    invoke-direct {v2, p1}, Lwe/e$b;-><init>(Lwe/e$e;)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Lwe/e$c;

    invoke-direct {v2}, Lwe/e$c;-><init>()V

    invoke-static {v2, p1}, Lwe/e;->h(Lwe/e$c;Lwe/e$e;)V

    new-instance p1, Lwe/e$e;

    invoke-direct {p1, v2}, Lwe/e$e;-><init>(Lwe/e$c;)V

    const/4 v3, 0x1

    :goto_0
    if-ge v3, v0, :cond_0

    add-int/lit8 v4, v3, -0x1

    aget-object v4, v1, v4

    invoke-static {v2, p1, v4}, Lwe/e;->e(Lwe/e$c;Lwe/e$e;Lwe/e$a;)V

    new-instance v4, Lwe/e$b;

    new-instance v5, Lwe/e$e;

    invoke-direct {v5, v2}, Lwe/e$e;-><init>(Lwe/e$c;)V

    invoke-direct {v4, v5}, Lwe/e$b;-><init>(Lwe/e$e;)V

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lwe/e;->y([B)[B

    move-result-object p0

    invoke-static {p2}, Lwe/e;->y([B)[B

    move-result-object p1

    new-instance p2, Lwe/e$c;

    sget-object v0, Lwe/e;->b:Lwe/e$c;

    invoke-direct {p2, v0}, Lwe/e$c;-><init>(Lwe/e$c;)V

    new-instance v0, Lwe/e$e;

    invoke-direct {v0}, Lwe/e$e;-><init>()V

    const/16 v2, 0xff

    :goto_1
    if-ltz v2, :cond_2

    aget-byte v3, p0, v2

    if-nez v3, :cond_2

    aget-byte v3, p1, v2

    if-eqz v3, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_2
    :goto_2
    if-ltz v2, :cond_7

    new-instance v3, Lwe/e$d;

    invoke-direct {v3, p2}, Lwe/e$d;-><init>(Lwe/e$c;)V

    invoke-static {p2, v3}, Lwe/e;->g(Lwe/e$c;Lwe/e$d;)V

    aget-byte v3, p0, v2

    if-lez v3, :cond_3

    invoke-static {v0, p2}, Lwe/e$e;->a(Lwe/e$e;Lwe/e$c;)Lwe/e$e;

    move-result-object v3

    aget-byte v4, p0, v2

    div-int/lit8 v4, v4, 0x2

    aget-object v4, v1, v4

    invoke-static {p2, v3, v4}, Lwe/e;->e(Lwe/e$c;Lwe/e$e;Lwe/e$a;)V

    goto :goto_3

    :cond_3
    if-gez v3, :cond_4

    invoke-static {v0, p2}, Lwe/e$e;->a(Lwe/e$e;Lwe/e$c;)Lwe/e$e;

    move-result-object v3

    aget-byte v4, p0, v2

    neg-int v4, v4

    div-int/lit8 v4, v4, 0x2

    aget-object v4, v1, v4

    invoke-static {p2, v3, v4}, Lwe/e;->z(Lwe/e$c;Lwe/e$e;Lwe/e$a;)V

    :cond_4
    :goto_3
    aget-byte v3, p1, v2

    if-lez v3, :cond_5

    invoke-static {v0, p2}, Lwe/e$e;->a(Lwe/e$e;Lwe/e$c;)Lwe/e$e;

    move-result-object v3

    sget-object v4, Lwe/f;->e:[Lwe/e$a;

    aget-byte v5, p1, v2

    div-int/lit8 v5, v5, 0x2

    aget-object v4, v4, v5

    invoke-static {p2, v3, v4}, Lwe/e;->e(Lwe/e$c;Lwe/e$e;Lwe/e$a;)V

    goto :goto_4

    :cond_5
    if-gez v3, :cond_6

    invoke-static {v0, p2}, Lwe/e$e;->a(Lwe/e$e;Lwe/e$c;)Lwe/e$e;

    move-result-object v3

    sget-object v4, Lwe/f;->e:[Lwe/e$a;

    aget-byte v5, p1, v2

    neg-int v5, v5

    div-int/lit8 v5, v5, 0x2

    aget-object v4, v4, v5

    invoke-static {p2, v3, v4}, Lwe/e;->z(Lwe/e$c;Lwe/e$e;Lwe/e$a;)V

    :cond_6
    :goto_4
    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    :cond_7
    new-instance p0, Lwe/e$d;

    invoke-direct {p0, p2}, Lwe/e$d;-><init>(Lwe/e$c;)V

    return-object p0
.end method

.method public static g(Lwe/e$c;Lwe/e$d;)V
    .locals 3

    const/16 v0, 0xa

    new-array v0, v0, [J

    iget-object v1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object v1, v1, Lwe/e$d;->a:[J

    iget-object v2, p1, Lwe/e$d;->a:[J

    invoke-static {v1, v2}, Lwe/i;->k([J[J)V

    iget-object v1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object v1, v1, Lwe/e$d;->c:[J

    iget-object v2, p1, Lwe/e$d;->b:[J

    invoke-static {v1, v2}, Lwe/i;->k([J[J)V

    iget-object v1, p0, Lwe/e$c;->b:[J

    iget-object v2, p1, Lwe/e$d;->c:[J

    invoke-static {v1, v2}, Lwe/i;->k([J[J)V

    iget-object v1, p0, Lwe/e$c;->b:[J

    invoke-static {v1, v1, v1}, Lwe/i;->o([J[J[J)V

    iget-object v1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object v1, v1, Lwe/e$d;->b:[J

    iget-object v2, p1, Lwe/e$d;->a:[J

    iget-object p1, p1, Lwe/e$d;->b:[J

    invoke-static {v1, v2, p1}, Lwe/i;->o([J[J[J)V

    iget-object p1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object p1, p1, Lwe/e$d;->b:[J

    invoke-static {v0, p1}, Lwe/i;->k([J[J)V

    iget-object p1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object v1, p1, Lwe/e$d;->b:[J

    iget-object v2, p1, Lwe/e$d;->c:[J

    iget-object p1, p1, Lwe/e$d;->a:[J

    invoke-static {v1, v2, p1}, Lwe/i;->o([J[J[J)V

    iget-object p1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object v1, p1, Lwe/e$d;->c:[J

    iget-object p1, p1, Lwe/e$d;->a:[J

    invoke-static {v1, v1, p1}, Lwe/i;->m([J[J[J)V

    iget-object p1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object v1, p1, Lwe/e$d;->a:[J

    iget-object p1, p1, Lwe/e$d;->b:[J

    invoke-static {v1, v0, p1}, Lwe/i;->m([J[J[J)V

    iget-object p1, p0, Lwe/e$c;->b:[J

    iget-object p0, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object p0, p0, Lwe/e$d;->c:[J

    invoke-static {p1, p1, p0}, Lwe/i;->m([J[J[J)V

    return-void
.end method

.method public static h(Lwe/e$c;Lwe/e$e;)V
    .locals 0

    iget-object p1, p1, Lwe/e$e;->a:Lwe/e$d;

    invoke-static {p0, p1}, Lwe/e;->g(Lwe/e$c;Lwe/e$d;)V

    return-void
.end method

.method public static i(II)I
    .locals 0

    xor-int/2addr p0, p1

    not-int p0, p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p1, p0, 0x4

    and-int/2addr p0, p1

    shl-int/lit8 p1, p0, 0x2

    and-int/2addr p0, p1

    shl-int/lit8 p1, p0, 0x1

    and-int/2addr p0, p1

    shr-int/lit8 p0, p0, 0x7

    and-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static j([B)[B
    .locals 3

    sget-object v0, Ldf/m;->e:Ldf/m;

    const-string v1, "SHA-512"

    invoke-virtual {v0, v1}, Ldf/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/MessageDigest;

    const/16 v1, 0x20

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v2, v1}, Ljava/security/MessageDigest;->update([BII)V

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    aget-byte v0, p0, v2

    and-int/lit16 v0, v0, 0xf8

    int-to-byte v0, v0

    aput-byte v0, p0, v2

    const/16 v0, 0x1f

    aget-byte v1, p0, v0

    and-int/lit8 v1, v1, 0x7f

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    or-int/lit8 v1, v1, 0x40

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    return-object p0
.end method

.method public static k([J)I
    .locals 1

    invoke-static {p0}, Lwe/i;->a([J)[B

    move-result-object p0

    const/4 v0, 0x0

    aget-byte p0, p0, v0

    and-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static l()V
    .locals 2

    sget-object v0, Lwe/f;->a:[J

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Could not initialize Ed25519."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static m([J)Z
    .locals 5

    array-length v0, p0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    new-array v0, v0, [J

    array-length v2, p0

    const/4 v3, 0x0

    invoke-static {p0, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v0}, Lwe/i;->i([J)V

    invoke-static {v0}, Lwe/i;->a([J)[B

    move-result-object p0

    array-length v0, p0

    move v2, v3

    :goto_0
    if-ge v2, v0, :cond_1

    aget-byte v4, p0, v2

    if-eqz v4, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v3
.end method

.method public static n([B)Z
    .locals 4

    const/16 v0, 0x1f

    :goto_0
    const/4 v1, 0x0

    if-ltz v0, :cond_2

    aget-byte v2, p0, v0

    and-int/lit16 v2, v2, 0xff

    sget-object v3, Lwe/e;->c:[B

    aget-byte v3, v3, v0

    and-int/lit16 v3, v3, 0xff

    if-eq v2, v3, :cond_1

    if-ge v2, v3, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    return v1

    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public static o([BI)J
    .locals 5

    aget-byte v0, p0, p1

    int-to-long v0, v0

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    add-int/lit8 v2, p1, 0x1

    aget-byte v2, p0, v2

    and-int/lit16 v2, v2, 0xff

    int-to-long v2, v2

    const/16 v4, 0x8

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    add-int/lit8 p1, p1, 0x2

    aget-byte p0, p0, p1

    and-int/lit16 p0, p0, 0xff

    int-to-long p0, p0

    const/16 v2, 0x10

    shl-long/2addr p0, v2

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public static p([BI)J
    .locals 3

    invoke-static {p0, p1}, Lwe/e;->o([BI)J

    move-result-wide v0

    add-int/lit8 p1, p1, 0x3

    aget-byte p0, p0, p1

    and-int/lit16 p0, p0, 0xff

    int-to-long p0, p0

    const/16 v2, 0x18

    shl-long/2addr p0, v2

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public static q([B[B[B[B)V
    .locals 90

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const/4 v3, 0x0

    invoke-static {v0, v3}, Lwe/e;->o([BI)J

    move-result-wide v4

    const-wide/32 v6, 0x1fffff

    and-long/2addr v4, v6

    const/4 v8, 0x2

    invoke-static {v0, v8}, Lwe/e;->p([BI)J

    move-result-wide v9

    const/4 v11, 0x5

    shr-long/2addr v9, v11

    and-long/2addr v9, v6

    invoke-static {v0, v11}, Lwe/e;->o([BI)J

    move-result-wide v12

    shr-long/2addr v12, v8

    and-long/2addr v12, v6

    const/4 v14, 0x7

    invoke-static {v0, v14}, Lwe/e;->p([BI)J

    move-result-wide v15

    shr-long/2addr v15, v14

    and-long/2addr v15, v6

    move-wide/from16 v17, v6

    const/16 v6, 0xa

    invoke-static {v0, v6}, Lwe/e;->p([BI)J

    move-result-wide v19

    const/4 v7, 0x4

    shr-long v19, v19, v7

    and-long v19, v19, v17

    move/from16 v21, v7

    const/16 v7, 0xd

    invoke-static {v0, v7}, Lwe/e;->o([BI)J

    move-result-wide v22

    const/16 v24, 0x1

    shr-long v22, v22, v24

    and-long v22, v22, v17

    const/16 v7, 0xf

    invoke-static {v0, v7}, Lwe/e;->p([BI)J

    move-result-wide v26

    const/16 v28, 0x6

    shr-long v26, v26, v28

    and-long v26, v26, v17

    const/16 v7, 0x12

    invoke-static {v0, v7}, Lwe/e;->o([BI)J

    move-result-wide v30

    const/16 v32, 0x3

    shr-long v30, v30, v32

    and-long v30, v30, v17

    const/16 v7, 0x15

    invoke-static {v0, v7}, Lwe/e;->o([BI)J

    move-result-wide v34

    and-long v34, v34, v17

    const/16 v7, 0x17

    invoke-static {v0, v7}, Lwe/e;->p([BI)J

    move-result-wide v37

    shr-long v37, v37, v11

    and-long v37, v37, v17

    const/16 v7, 0x1a

    invoke-static {v0, v7}, Lwe/e;->o([BI)J

    move-result-wide v40

    shr-long v40, v40, v8

    and-long v40, v40, v17

    const/16 v7, 0x1c

    invoke-static {v0, v7}, Lwe/e;->p([BI)J

    move-result-wide v42

    shr-long v42, v42, v14

    invoke-static {v1, v3}, Lwe/e;->o([BI)J

    move-result-wide v44

    and-long v44, v44, v17

    invoke-static {v1, v8}, Lwe/e;->p([BI)J

    move-result-wide v46

    shr-long v46, v46, v11

    and-long v46, v46, v17

    invoke-static {v1, v11}, Lwe/e;->o([BI)J

    move-result-wide v48

    shr-long v48, v48, v8

    and-long v48, v48, v17

    invoke-static {v1, v14}, Lwe/e;->p([BI)J

    move-result-wide v50

    shr-long v50, v50, v14

    and-long v50, v50, v17

    invoke-static {v1, v6}, Lwe/e;->p([BI)J

    move-result-wide v52

    shr-long v52, v52, v21

    and-long v52, v52, v17

    const/16 v0, 0xd

    invoke-static {v1, v0}, Lwe/e;->o([BI)J

    move-result-wide v54

    shr-long v54, v54, v24

    and-long v54, v54, v17

    const/16 v0, 0xf

    invoke-static {v1, v0}, Lwe/e;->p([BI)J

    move-result-wide v56

    shr-long v56, v56, v28

    and-long v56, v56, v17

    const/16 v0, 0x12

    invoke-static {v1, v0}, Lwe/e;->o([BI)J

    move-result-wide v58

    shr-long v58, v58, v32

    and-long v58, v58, v17

    const/16 v0, 0x15

    invoke-static {v1, v0}, Lwe/e;->o([BI)J

    move-result-wide v60

    and-long v60, v60, v17

    const/16 v0, 0x17

    invoke-static {v1, v0}, Lwe/e;->p([BI)J

    move-result-wide v62

    shr-long v62, v62, v11

    and-long v62, v62, v17

    const/16 v0, 0x1a

    invoke-static {v1, v0}, Lwe/e;->o([BI)J

    move-result-wide v64

    shr-long v64, v64, v8

    and-long v64, v64, v17

    const/16 v0, 0x1c

    invoke-static {v1, v0}, Lwe/e;->p([BI)J

    move-result-wide v0

    shr-long/2addr v0, v14

    invoke-static {v2, v3}, Lwe/e;->o([BI)J

    move-result-wide v66

    and-long v66, v66, v17

    invoke-static {v2, v8}, Lwe/e;->p([BI)J

    move-result-wide v68

    shr-long v68, v68, v11

    and-long v68, v68, v17

    invoke-static {v2, v11}, Lwe/e;->o([BI)J

    move-result-wide v70

    shr-long v70, v70, v8

    and-long v70, v70, v17

    invoke-static {v2, v14}, Lwe/e;->p([BI)J

    move-result-wide v72

    shr-long v72, v72, v14

    and-long v72, v72, v17

    invoke-static {v2, v6}, Lwe/e;->p([BI)J

    move-result-wide v74

    shr-long v74, v74, v21

    and-long v74, v74, v17

    const/16 v7, 0xd

    invoke-static {v2, v7}, Lwe/e;->o([BI)J

    move-result-wide v76

    shr-long v76, v76, v24

    and-long v76, v76, v17

    const/16 v7, 0xf

    invoke-static {v2, v7}, Lwe/e;->p([BI)J

    move-result-wide v78

    shr-long v78, v78, v28

    and-long v78, v78, v17

    const/16 v7, 0x12

    invoke-static {v2, v7}, Lwe/e;->o([BI)J

    move-result-wide v80

    shr-long v80, v80, v32

    and-long v80, v80, v17

    const/16 v7, 0x15

    invoke-static {v2, v7}, Lwe/e;->o([BI)J

    move-result-wide v82

    and-long v82, v82, v17

    const/16 v7, 0x17

    invoke-static {v2, v7}, Lwe/e;->p([BI)J

    move-result-wide v84

    shr-long v84, v84, v11

    and-long v84, v84, v17

    const/16 v7, 0x1a

    invoke-static {v2, v7}, Lwe/e;->o([BI)J

    move-result-wide v86

    shr-long v86, v86, v8

    and-long v17, v86, v17

    const/16 v7, 0x1c

    invoke-static {v2, v7}, Lwe/e;->p([BI)J

    move-result-wide v86

    shr-long v86, v86, v14

    mul-long v88, v4, v44

    add-long v66, v66, v88

    mul-long v88, v4, v46

    add-long v68, v68, v88

    mul-long v88, v9, v44

    add-long v68, v68, v88

    mul-long v88, v4, v48

    add-long v70, v70, v88

    mul-long v88, v9, v46

    add-long v70, v70, v88

    mul-long v88, v12, v44

    add-long v70, v70, v88

    mul-long v88, v4, v50

    add-long v72, v72, v88

    mul-long v88, v9, v48

    add-long v72, v72, v88

    mul-long v88, v12, v46

    add-long v72, v72, v88

    mul-long v88, v15, v44

    add-long v72, v72, v88

    mul-long v88, v4, v52

    add-long v74, v74, v88

    mul-long v88, v9, v50

    add-long v74, v74, v88

    mul-long v88, v12, v48

    add-long v74, v74, v88

    mul-long v88, v15, v46

    add-long v74, v74, v88

    mul-long v88, v19, v44

    add-long v74, v74, v88

    mul-long v88, v4, v54

    add-long v76, v76, v88

    mul-long v88, v9, v52

    add-long v76, v76, v88

    mul-long v88, v12, v50

    add-long v76, v76, v88

    mul-long v88, v15, v48

    add-long v76, v76, v88

    mul-long v88, v19, v46

    add-long v76, v76, v88

    mul-long v88, v22, v44

    add-long v76, v76, v88

    mul-long v88, v4, v56

    add-long v78, v78, v88

    mul-long v88, v9, v54

    add-long v78, v78, v88

    mul-long v88, v12, v52

    add-long v78, v78, v88

    mul-long v88, v15, v50

    add-long v78, v78, v88

    mul-long v88, v19, v48

    add-long v78, v78, v88

    mul-long v88, v22, v46

    add-long v78, v78, v88

    mul-long v88, v26, v44

    add-long v78, v78, v88

    mul-long v88, v4, v58

    add-long v80, v80, v88

    mul-long v88, v9, v56

    add-long v80, v80, v88

    mul-long v88, v12, v54

    add-long v80, v80, v88

    mul-long v88, v15, v52

    add-long v80, v80, v88

    mul-long v88, v19, v50

    add-long v80, v80, v88

    mul-long v88, v22, v48

    add-long v80, v80, v88

    mul-long v88, v26, v46

    add-long v80, v80, v88

    mul-long v88, v30, v44

    add-long v80, v80, v88

    mul-long v88, v4, v60

    add-long v82, v82, v88

    mul-long v88, v9, v58

    add-long v82, v82, v88

    mul-long v88, v12, v56

    add-long v82, v82, v88

    mul-long v88, v15, v54

    add-long v82, v82, v88

    mul-long v88, v19, v52

    add-long v82, v82, v88

    mul-long v88, v22, v50

    add-long v82, v82, v88

    mul-long v88, v26, v48

    add-long v82, v82, v88

    mul-long v88, v30, v46

    add-long v82, v82, v88

    mul-long v88, v34, v44

    add-long v82, v82, v88

    mul-long v88, v4, v62

    add-long v84, v84, v88

    mul-long v88, v9, v60

    add-long v84, v84, v88

    mul-long v88, v12, v58

    add-long v84, v84, v88

    mul-long v88, v15, v56

    add-long v84, v84, v88

    mul-long v88, v19, v54

    add-long v84, v84, v88

    mul-long v88, v22, v52

    add-long v84, v84, v88

    mul-long v88, v26, v50

    add-long v84, v84, v88

    mul-long v88, v30, v48

    add-long v84, v84, v88

    mul-long v88, v34, v46

    add-long v84, v84, v88

    mul-long v88, v37, v44

    add-long v84, v84, v88

    mul-long v88, v4, v64

    add-long v17, v17, v88

    mul-long v88, v9, v62

    add-long v17, v17, v88

    mul-long v88, v12, v60

    add-long v17, v17, v88

    mul-long v88, v15, v58

    add-long v17, v17, v88

    mul-long v88, v19, v56

    add-long v17, v17, v88

    mul-long v88, v22, v54

    add-long v17, v17, v88

    mul-long v88, v26, v52

    add-long v17, v17, v88

    mul-long v88, v30, v50

    add-long v17, v17, v88

    mul-long v88, v34, v48

    add-long v17, v17, v88

    mul-long v88, v37, v46

    add-long v17, v17, v88

    mul-long v88, v40, v44

    add-long v17, v17, v88

    mul-long/2addr v4, v0

    add-long v86, v86, v4

    mul-long v4, v9, v64

    add-long v86, v86, v4

    mul-long v4, v12, v62

    add-long v86, v86, v4

    mul-long v4, v15, v60

    add-long v86, v86, v4

    mul-long v4, v19, v58

    add-long v86, v86, v4

    mul-long v4, v22, v56

    add-long v86, v86, v4

    mul-long v4, v26, v54

    add-long v86, v86, v4

    mul-long v4, v30, v52

    add-long v86, v86, v4

    mul-long v4, v34, v50

    add-long v86, v86, v4

    mul-long v4, v37, v48

    add-long v86, v86, v4

    mul-long v4, v40, v46

    add-long v86, v86, v4

    mul-long v44, v44, v42

    add-long v86, v86, v44

    mul-long/2addr v9, v0

    mul-long v4, v12, v64

    add-long/2addr v9, v4

    mul-long v4, v15, v62

    add-long/2addr v9, v4

    mul-long v4, v19, v60

    add-long/2addr v9, v4

    mul-long v4, v22, v58

    add-long/2addr v9, v4

    mul-long v4, v26, v56

    add-long/2addr v9, v4

    mul-long v4, v30, v54

    add-long/2addr v9, v4

    mul-long v4, v34, v52

    add-long/2addr v9, v4

    mul-long v4, v37, v50

    add-long/2addr v9, v4

    mul-long v4, v40, v48

    add-long/2addr v9, v4

    mul-long v46, v46, v42

    add-long v9, v9, v46

    mul-long/2addr v12, v0

    mul-long v4, v15, v64

    add-long/2addr v12, v4

    mul-long v4, v19, v62

    add-long/2addr v12, v4

    mul-long v4, v22, v60

    add-long/2addr v12, v4

    mul-long v4, v26, v58

    add-long/2addr v12, v4

    mul-long v4, v30, v56

    add-long/2addr v12, v4

    mul-long v4, v34, v54

    add-long/2addr v12, v4

    mul-long v4, v37, v52

    add-long/2addr v12, v4

    mul-long v4, v40, v50

    add-long/2addr v12, v4

    mul-long v48, v48, v42

    add-long v12, v12, v48

    mul-long/2addr v15, v0

    mul-long v4, v19, v64

    add-long/2addr v15, v4

    mul-long v4, v22, v62

    add-long/2addr v15, v4

    mul-long v4, v26, v60

    add-long/2addr v15, v4

    mul-long v4, v30, v58

    add-long/2addr v15, v4

    mul-long v4, v34, v56

    add-long/2addr v15, v4

    mul-long v4, v37, v54

    add-long/2addr v15, v4

    mul-long v4, v40, v52

    add-long/2addr v15, v4

    mul-long v50, v50, v42

    add-long v15, v15, v50

    mul-long v19, v19, v0

    mul-long v4, v22, v64

    add-long v19, v19, v4

    mul-long v4, v26, v62

    add-long v19, v19, v4

    mul-long v4, v30, v60

    add-long v19, v19, v4

    mul-long v4, v34, v58

    add-long v19, v19, v4

    mul-long v4, v37, v56

    add-long v19, v19, v4

    mul-long v4, v40, v54

    add-long v19, v19, v4

    mul-long v52, v52, v42

    add-long v19, v19, v52

    mul-long v22, v22, v0

    mul-long v4, v26, v64

    add-long v22, v22, v4

    mul-long v4, v30, v62

    add-long v22, v22, v4

    mul-long v4, v34, v60

    add-long v22, v22, v4

    mul-long v4, v37, v58

    add-long v22, v22, v4

    mul-long v4, v40, v56

    add-long v22, v22, v4

    mul-long v54, v54, v42

    add-long v22, v22, v54

    mul-long v26, v26, v0

    mul-long v4, v30, v64

    add-long v26, v26, v4

    mul-long v4, v34, v62

    add-long v26, v26, v4

    mul-long v4, v37, v60

    add-long v26, v26, v4

    mul-long v4, v40, v58

    add-long v26, v26, v4

    mul-long v56, v56, v42

    add-long v26, v26, v56

    mul-long v30, v30, v0

    mul-long v4, v34, v64

    add-long v30, v30, v4

    mul-long v4, v37, v62

    add-long v30, v30, v4

    mul-long v4, v40, v60

    add-long v30, v30, v4

    mul-long v58, v58, v42

    add-long v30, v30, v58

    mul-long v34, v34, v0

    mul-long v4, v37, v64

    add-long v34, v34, v4

    mul-long v4, v40, v62

    add-long v34, v34, v4

    mul-long v60, v60, v42

    add-long v34, v34, v60

    mul-long v37, v37, v0

    mul-long v4, v40, v64

    add-long v37, v37, v4

    mul-long v62, v62, v42

    add-long v37, v37, v62

    mul-long v40, v40, v0

    mul-long v64, v64, v42

    add-long v40, v40, v64

    mul-long v42, v42, v0

    const-wide/32 v0, 0x100000

    add-long v4, v66, v0

    const/16 v36, 0x15

    shr-long v4, v4, v36

    add-long v68, v68, v4

    shl-long v4, v4, v36

    sub-long v66, v66, v4

    add-long v4, v70, v0

    shr-long v4, v4, v36

    add-long v72, v72, v4

    shl-long v4, v4, v36

    sub-long v70, v70, v4

    add-long v4, v74, v0

    shr-long v4, v4, v36

    add-long v76, v76, v4

    shl-long v4, v4, v36

    sub-long v74, v74, v4

    add-long v4, v78, v0

    shr-long v4, v4, v36

    add-long v80, v80, v4

    shl-long v4, v4, v36

    sub-long v78, v78, v4

    add-long v4, v82, v0

    shr-long v4, v4, v36

    add-long v84, v84, v4

    shl-long v4, v4, v36

    sub-long v82, v82, v4

    add-long v4, v17, v0

    shr-long v4, v4, v36

    add-long v86, v86, v4

    shl-long v4, v4, v36

    sub-long v17, v17, v4

    add-long v4, v9, v0

    shr-long v4, v4, v36

    add-long/2addr v12, v4

    shl-long v4, v4, v36

    sub-long/2addr v9, v4

    add-long v4, v15, v0

    shr-long v4, v4, v36

    add-long v19, v19, v4

    shl-long v4, v4, v36

    sub-long/2addr v15, v4

    add-long v4, v22, v0

    shr-long v4, v4, v36

    add-long v26, v26, v4

    shl-long v4, v4, v36

    sub-long v22, v22, v4

    add-long v4, v30, v0

    shr-long v4, v4, v36

    add-long v34, v34, v4

    shl-long v4, v4, v36

    sub-long v30, v30, v4

    add-long v4, v37, v0

    shr-long v4, v4, v36

    add-long v40, v40, v4

    shl-long v4, v4, v36

    sub-long v37, v37, v4

    add-long v4, v42, v0

    shr-long v4, v4, v36

    shl-long v44, v4, v36

    sub-long v42, v42, v44

    add-long v44, v68, v0

    shr-long v44, v44, v36

    add-long v70, v70, v44

    shl-long v44, v44, v36

    sub-long v68, v68, v44

    add-long v44, v72, v0

    shr-long v44, v44, v36

    add-long v74, v74, v44

    shl-long v44, v44, v36

    sub-long v72, v72, v44

    add-long v44, v76, v0

    shr-long v44, v44, v36

    add-long v78, v78, v44

    shl-long v44, v44, v36

    sub-long v76, v76, v44

    add-long v44, v80, v0

    shr-long v44, v44, v36

    add-long v82, v82, v44

    shl-long v44, v44, v36

    sub-long v80, v80, v44

    add-long v44, v84, v0

    shr-long v44, v44, v36

    add-long v17, v17, v44

    shl-long v44, v44, v36

    sub-long v84, v84, v44

    add-long v44, v86, v0

    shr-long v44, v44, v36

    add-long v9, v9, v44

    shl-long v44, v44, v36

    sub-long v86, v86, v44

    add-long v44, v12, v0

    shr-long v44, v44, v36

    add-long v15, v15, v44

    shl-long v44, v44, v36

    sub-long v12, v12, v44

    add-long v44, v19, v0

    shr-long v44, v44, v36

    add-long v22, v22, v44

    shl-long v44, v44, v36

    sub-long v19, v19, v44

    add-long v44, v26, v0

    shr-long v44, v44, v36

    add-long v30, v30, v44

    shl-long v44, v44, v36

    sub-long v26, v26, v44

    add-long v44, v34, v0

    shr-long v44, v44, v36

    add-long v37, v37, v44

    shl-long v44, v44, v36

    sub-long v34, v34, v44

    add-long v44, v40, v0

    shr-long v44, v44, v36

    add-long v42, v42, v44

    shl-long v44, v44, v36

    sub-long v40, v40, v44

    const-wide/32 v44, 0xa2c13

    mul-long v46, v4, v44

    add-long v86, v86, v46

    const-wide/32 v46, 0x72d18

    mul-long v48, v4, v46

    add-long v9, v9, v48

    const-wide/32 v48, 0x9fb67

    mul-long v50, v4, v48

    add-long v12, v12, v50

    const-wide/32 v50, 0xf39ad

    mul-long v52, v4, v50

    sub-long v15, v15, v52

    const-wide/32 v52, 0x215d1

    mul-long v54, v4, v52

    add-long v19, v19, v54

    const-wide/32 v54, 0xa6f7d

    mul-long v4, v4, v54

    sub-long v22, v22, v4

    mul-long v4, v42, v44

    add-long v17, v17, v4

    mul-long v4, v42, v46

    add-long v86, v86, v4

    mul-long v4, v42, v48

    add-long/2addr v9, v4

    mul-long v4, v42, v50

    sub-long/2addr v12, v4

    mul-long v4, v42, v52

    add-long/2addr v15, v4

    mul-long v42, v42, v54

    sub-long v19, v19, v42

    mul-long v4, v40, v44

    add-long v84, v84, v4

    mul-long v4, v40, v46

    add-long v17, v17, v4

    mul-long v4, v40, v48

    add-long v86, v86, v4

    mul-long v4, v40, v50

    sub-long/2addr v9, v4

    mul-long v4, v40, v52

    add-long/2addr v12, v4

    mul-long v40, v40, v54

    sub-long v15, v15, v40

    mul-long v4, v37, v44

    add-long v82, v82, v4

    mul-long v4, v37, v46

    add-long v84, v84, v4

    mul-long v4, v37, v48

    add-long v17, v17, v4

    mul-long v4, v37, v50

    sub-long v86, v86, v4

    mul-long v4, v37, v52

    add-long/2addr v9, v4

    mul-long v37, v37, v54

    sub-long v12, v12, v37

    mul-long v4, v34, v44

    add-long v80, v80, v4

    mul-long v4, v34, v46

    add-long v82, v82, v4

    mul-long v4, v34, v48

    add-long v84, v84, v4

    mul-long v4, v34, v50

    sub-long v17, v17, v4

    mul-long v4, v34, v52

    add-long v86, v86, v4

    mul-long v34, v34, v54

    sub-long v9, v9, v34

    mul-long v4, v30, v44

    add-long v78, v78, v4

    mul-long v4, v30, v46

    add-long v80, v80, v4

    mul-long v4, v30, v48

    add-long v82, v82, v4

    mul-long v4, v30, v50

    sub-long v84, v84, v4

    mul-long v4, v30, v52

    add-long v17, v17, v4

    mul-long v30, v30, v54

    sub-long v86, v86, v30

    add-long v4, v78, v0

    const/16 v36, 0x15

    shr-long v4, v4, v36

    add-long v80, v80, v4

    shl-long v4, v4, v36

    sub-long v78, v78, v4

    add-long v4, v82, v0

    shr-long v4, v4, v36

    add-long v84, v84, v4

    shl-long v4, v4, v36

    sub-long v82, v82, v4

    add-long v4, v17, v0

    shr-long v4, v4, v36

    add-long v86, v86, v4

    shl-long v4, v4, v36

    sub-long v17, v17, v4

    add-long v4, v9, v0

    shr-long v4, v4, v36

    add-long/2addr v12, v4

    shl-long v4, v4, v36

    sub-long/2addr v9, v4

    add-long v4, v15, v0

    shr-long v4, v4, v36

    add-long v19, v19, v4

    shl-long v4, v4, v36

    sub-long/2addr v15, v4

    add-long v4, v22, v0

    shr-long v4, v4, v36

    add-long v26, v26, v4

    shl-long v4, v4, v36

    sub-long v22, v22, v4

    add-long v4, v80, v0

    shr-long v4, v4, v36

    add-long v82, v82, v4

    shl-long v4, v4, v36

    sub-long v80, v80, v4

    add-long v4, v84, v0

    shr-long v4, v4, v36

    add-long v17, v17, v4

    shl-long v4, v4, v36

    sub-long v84, v84, v4

    add-long v4, v86, v0

    shr-long v4, v4, v36

    add-long/2addr v9, v4

    shl-long v4, v4, v36

    sub-long v86, v86, v4

    add-long v4, v12, v0

    shr-long v4, v4, v36

    add-long/2addr v15, v4

    shl-long v4, v4, v36

    sub-long/2addr v12, v4

    add-long v4, v19, v0

    shr-long v4, v4, v36

    add-long v22, v22, v4

    shl-long v4, v4, v36

    sub-long v19, v19, v4

    mul-long v4, v26, v44

    add-long v76, v76, v4

    mul-long v4, v26, v46

    add-long v78, v78, v4

    mul-long v4, v26, v48

    add-long v80, v80, v4

    mul-long v4, v26, v50

    sub-long v82, v82, v4

    mul-long v4, v26, v52

    add-long v84, v84, v4

    mul-long v26, v26, v54

    sub-long v17, v17, v26

    mul-long v4, v22, v44

    add-long v74, v74, v4

    mul-long v4, v22, v46

    add-long v76, v76, v4

    mul-long v4, v22, v48

    add-long v78, v78, v4

    mul-long v4, v22, v50

    sub-long v80, v80, v4

    mul-long v4, v22, v52

    add-long v82, v82, v4

    mul-long v22, v22, v54

    sub-long v84, v84, v22

    mul-long v4, v19, v44

    add-long v72, v72, v4

    mul-long v4, v19, v46

    add-long v74, v74, v4

    mul-long v4, v19, v48

    add-long v76, v76, v4

    mul-long v4, v19, v50

    sub-long v78, v78, v4

    mul-long v4, v19, v52

    add-long v80, v80, v4

    mul-long v19, v19, v54

    sub-long v82, v82, v19

    mul-long v4, v15, v44

    add-long v70, v70, v4

    mul-long v4, v15, v46

    add-long v72, v72, v4

    mul-long v4, v15, v48

    add-long v74, v74, v4

    mul-long v4, v15, v50

    sub-long v76, v76, v4

    mul-long v4, v15, v52

    add-long v78, v78, v4

    mul-long v15, v15, v54

    sub-long v80, v80, v15

    mul-long v4, v12, v44

    add-long v68, v68, v4

    mul-long v4, v12, v46

    add-long v70, v70, v4

    mul-long v4, v12, v48

    add-long v72, v72, v4

    mul-long v4, v12, v50

    sub-long v74, v74, v4

    mul-long v4, v12, v52

    add-long v76, v76, v4

    mul-long v12, v12, v54

    sub-long v78, v78, v12

    mul-long v4, v9, v44

    add-long v66, v66, v4

    mul-long v4, v9, v46

    add-long v68, v68, v4

    mul-long v4, v9, v48

    add-long v70, v70, v4

    mul-long v4, v9, v50

    sub-long v72, v72, v4

    mul-long v4, v9, v52

    add-long v74, v74, v4

    mul-long v9, v9, v54

    sub-long v76, v76, v9

    add-long v4, v66, v0

    const/16 v36, 0x15

    shr-long v4, v4, v36

    add-long v68, v68, v4

    shl-long v4, v4, v36

    sub-long v66, v66, v4

    add-long v4, v70, v0

    shr-long v4, v4, v36

    add-long v72, v72, v4

    shl-long v4, v4, v36

    sub-long v70, v70, v4

    add-long v4, v74, v0

    shr-long v4, v4, v36

    add-long v76, v76, v4

    shl-long v4, v4, v36

    sub-long v74, v74, v4

    add-long v4, v78, v0

    shr-long v4, v4, v36

    add-long v80, v80, v4

    shl-long v4, v4, v36

    sub-long v78, v78, v4

    add-long v4, v82, v0

    shr-long v4, v4, v36

    add-long v84, v84, v4

    shl-long v4, v4, v36

    sub-long v82, v82, v4

    add-long v4, v17, v0

    shr-long v4, v4, v36

    add-long v86, v86, v4

    shl-long v4, v4, v36

    sub-long v17, v17, v4

    add-long v4, v68, v0

    shr-long v4, v4, v36

    add-long v70, v70, v4

    shl-long v4, v4, v36

    sub-long v68, v68, v4

    add-long v4, v72, v0

    shr-long v4, v4, v36

    add-long v74, v74, v4

    shl-long v4, v4, v36

    sub-long v72, v72, v4

    add-long v4, v76, v0

    shr-long v4, v4, v36

    add-long v78, v78, v4

    shl-long v4, v4, v36

    sub-long v76, v76, v4

    add-long v4, v80, v0

    shr-long v4, v4, v36

    add-long v82, v82, v4

    shl-long v4, v4, v36

    sub-long v80, v80, v4

    add-long v4, v84, v0

    shr-long v4, v4, v36

    add-long v17, v17, v4

    shl-long v4, v4, v36

    sub-long v84, v84, v4

    add-long v0, v86, v0

    shr-long v0, v0, v36

    shl-long v4, v0, v36

    sub-long v86, v86, v4

    mul-long v4, v0, v44

    add-long v66, v66, v4

    mul-long v4, v0, v46

    add-long v68, v68, v4

    mul-long v4, v0, v48

    add-long v70, v70, v4

    mul-long v4, v0, v50

    sub-long v72, v72, v4

    mul-long v4, v0, v52

    add-long v74, v74, v4

    mul-long v0, v0, v54

    sub-long v76, v76, v0

    const/16 v36, 0x15

    shr-long v0, v66, v36

    add-long v68, v68, v0

    shl-long v0, v0, v36

    sub-long v66, v66, v0

    shr-long v0, v68, v36

    add-long v70, v70, v0

    shl-long v0, v0, v36

    sub-long v68, v68, v0

    shr-long v0, v70, v36

    add-long v72, v72, v0

    shl-long v0, v0, v36

    sub-long v70, v70, v0

    shr-long v0, v72, v36

    add-long v74, v74, v0

    shl-long v0, v0, v36

    sub-long v72, v72, v0

    shr-long v0, v74, v36

    add-long v76, v76, v0

    shl-long v0, v0, v36

    sub-long v74, v74, v0

    shr-long v0, v76, v36

    add-long v78, v78, v0

    shl-long v0, v0, v36

    sub-long v76, v76, v0

    shr-long v0, v78, v36

    add-long v80, v80, v0

    shl-long v0, v0, v36

    sub-long v78, v78, v0

    shr-long v0, v80, v36

    add-long v82, v82, v0

    shl-long v0, v0, v36

    sub-long v80, v80, v0

    shr-long v0, v82, v36

    add-long v84, v84, v0

    shl-long v0, v0, v36

    sub-long v82, v82, v0

    shr-long v0, v84, v36

    add-long v17, v17, v0

    shl-long v0, v0, v36

    sub-long v84, v84, v0

    shr-long v0, v17, v36

    add-long v86, v86, v0

    shl-long v0, v0, v36

    sub-long v17, v17, v0

    shr-long v0, v86, v36

    shl-long v4, v0, v36

    sub-long v86, v86, v4

    mul-long v44, v44, v0

    add-long v66, v66, v44

    mul-long v46, v46, v0

    add-long v68, v68, v46

    mul-long v48, v48, v0

    add-long v70, v70, v48

    mul-long v50, v50, v0

    sub-long v72, v72, v50

    mul-long v52, v52, v0

    add-long v74, v74, v52

    mul-long v0, v0, v54

    sub-long v76, v76, v0

    const/16 v36, 0x15

    shr-long v0, v66, v36

    add-long v68, v68, v0

    shl-long v0, v0, v36

    sub-long v0, v66, v0

    shr-long v4, v68, v36

    add-long v70, v70, v4

    shl-long v4, v4, v36

    sub-long v68, v68, v4

    shr-long v4, v70, v36

    add-long v72, v72, v4

    shl-long v4, v4, v36

    sub-long v70, v70, v4

    shr-long v4, v72, v36

    add-long v74, v74, v4

    shl-long v4, v4, v36

    sub-long v72, v72, v4

    shr-long v4, v74, v36

    add-long v76, v76, v4

    shl-long v4, v4, v36

    sub-long v74, v74, v4

    shr-long v4, v76, v36

    add-long v78, v78, v4

    shl-long v4, v4, v36

    sub-long v76, v76, v4

    shr-long v4, v78, v36

    add-long v80, v80, v4

    shl-long v4, v4, v36

    sub-long v78, v78, v4

    shr-long v4, v80, v36

    add-long v82, v82, v4

    shl-long v4, v4, v36

    sub-long v80, v80, v4

    shr-long v4, v82, v36

    add-long v84, v84, v4

    shl-long v4, v4, v36

    sub-long v4, v82, v4

    shr-long v9, v84, v36

    add-long v17, v17, v9

    shl-long v9, v9, v36

    sub-long v84, v84, v9

    shr-long v9, v17, v36

    add-long v86, v86, v9

    shl-long v9, v9, v36

    sub-long v17, v17, v9

    long-to-int v2, v0

    int-to-byte v2, v2

    aput-byte v2, p0, v3

    const/16 v2, 0x8

    shr-long v2, v0, v2

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, p0, v24

    const/16 v2, 0x10

    shr-long/2addr v0, v2

    shl-long v2, v68, v11

    or-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v0, v0

    aput-byte v0, p0, v8

    shr-long v0, v68, v32

    long-to-int v0, v0

    int-to-byte v0, v0

    aput-byte v0, p0, v32

    const/16 v0, 0xb

    shr-long v0, v68, v0

    long-to-int v0, v0

    int-to-byte v0, v0

    aput-byte v0, p0, v21

    const/16 v0, 0x13

    shr-long v0, v68, v0

    shl-long v2, v70, v8

    or-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v0, v0

    aput-byte v0, p0, v11

    shr-long v0, v70, v28

    long-to-int v0, v0

    int-to-byte v0, v0

    aput-byte v0, p0, v28

    const/16 v0, 0xe

    shr-long v0, v70, v0

    shl-long v2, v72, v14

    or-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v0, v0

    aput-byte v0, p0, v14

    shr-long v0, v72, v24

    long-to-int v0, v0

    int-to-byte v0, v0

    const/16 v1, 0x8

    aput-byte v0, p0, v1

    const/16 v0, 0x9

    shr-long v0, v72, v0

    long-to-int v0, v0

    int-to-byte v0, v0

    const/16 v1, 0x9

    aput-byte v0, p0, v1

    const/16 v0, 0x11

    shr-long v0, v72, v0

    shl-long v2, v74, v21

    or-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v0, v0

    aput-byte v0, p0, v6

    shr-long v0, v74, v21

    long-to-int v0, v0

    int-to-byte v0, v0

    const/16 v1, 0xb

    aput-byte v0, p0, v1

    const/16 v0, 0xc

    shr-long v0, v74, v0

    long-to-int v0, v0

    int-to-byte v0, v0

    const/16 v1, 0xc

    aput-byte v0, p0, v1

    const/16 v0, 0x14

    shr-long v0, v74, v0

    shl-long v2, v76, v24

    or-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v0, v0

    const/16 v25, 0xd

    aput-byte v0, p0, v25

    shr-long v0, v76, v14

    long-to-int v0, v0

    int-to-byte v0, v0

    const/16 v1, 0xe

    aput-byte v0, p0, v1

    const/16 v29, 0xf

    shr-long v0, v76, v29

    shl-long v2, v78, v28

    or-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v0, v0

    aput-byte v0, p0, v29

    shr-long v0, v78, v8

    long-to-int v0, v0

    int-to-byte v0, v0

    const/16 v1, 0x10

    aput-byte v0, p0, v1

    shr-long v0, v78, v6

    long-to-int v0, v0

    int-to-byte v0, v0

    const/16 v1, 0x11

    aput-byte v0, p0, v1

    const/16 v33, 0x12

    shr-long v0, v78, v33

    shl-long v2, v80, v32

    or-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v0, v0

    aput-byte v0, p0, v33

    shr-long v0, v80, v11

    long-to-int v0, v0

    int-to-byte v0, v0

    const/16 v1, 0x13

    aput-byte v0, p0, v1

    const/16 v25, 0xd

    shr-long v0, v80, v25

    long-to-int v0, v0

    int-to-byte v0, v0

    const/16 v1, 0x14

    aput-byte v0, p0, v1

    long-to-int v0, v4

    int-to-byte v0, v0

    const/16 v36, 0x15

    aput-byte v0, p0, v36

    const/16 v0, 0x8

    shr-long v0, v4, v0

    long-to-int v0, v0

    int-to-byte v0, v0

    const/16 v1, 0x16

    aput-byte v0, p0, v1

    const/16 v0, 0x10

    shr-long v0, v4, v0

    shl-long v2, v84, v11

    or-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v0, v0

    const/16 v39, 0x17

    aput-byte v0, p0, v39

    shr-long v0, v84, v32

    long-to-int v0, v0

    int-to-byte v0, v0

    const/16 v1, 0x18

    aput-byte v0, p0, v1

    const/16 v0, 0xb

    shr-long v0, v84, v0

    long-to-int v0, v0

    int-to-byte v0, v0

    const/16 v1, 0x19

    aput-byte v0, p0, v1

    const/16 v0, 0x13

    shr-long v0, v84, v0

    shl-long v2, v17, v8

    or-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v0, v0

    const/16 v1, 0x1a

    aput-byte v0, p0, v1

    shr-long v0, v17, v28

    long-to-int v0, v0

    int-to-byte v0, v0

    const/16 v1, 0x1b

    aput-byte v0, p0, v1

    const/16 v0, 0xe

    shr-long v0, v17, v0

    shl-long v2, v86, v14

    or-long/2addr v0, v2

    long-to-int v0, v0

    int-to-byte v0, v0

    const/16 v1, 0x1c

    aput-byte v0, p0, v1

    shr-long v0, v86, v24

    long-to-int v0, v0

    int-to-byte v0, v0

    const/16 v1, 0x1d

    aput-byte v0, p0, v1

    const/16 v0, 0x9

    shr-long v0, v86, v0

    long-to-int v0, v0

    int-to-byte v0, v0

    const/16 v1, 0x1e

    aput-byte v0, p0, v1

    const/16 v0, 0x11

    shr-long v0, v86, v0

    long-to-int v0, v0

    int-to-byte v0, v0

    const/16 v1, 0x1f

    aput-byte v0, p0, v1

    return-void
.end method

.method public static r([J[J)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    aget-wide v1, p1, v0

    neg-long v1, v1

    aput-wide v1, p0, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static s([J[J)V
    .locals 7

    const/16 v0, 0xa

    new-array v1, v0, [J

    new-array v2, v0, [J

    new-array v3, v0, [J

    invoke-static {v1, p1}, Lwe/i;->k([J[J)V

    invoke-static {v2, v1}, Lwe/i;->k([J[J)V

    invoke-static {v2, v2}, Lwe/i;->k([J[J)V

    invoke-static {v2, p1, v2}, Lwe/i;->f([J[J[J)V

    invoke-static {v1, v1, v2}, Lwe/i;->f([J[J[J)V

    invoke-static {v1, v1}, Lwe/i;->k([J[J)V

    invoke-static {v1, v2, v1}, Lwe/i;->f([J[J[J)V

    invoke-static {v2, v1}, Lwe/i;->k([J[J)V

    const/4 v4, 0x1

    move v5, v4

    :goto_0
    const/4 v6, 0x5

    if-ge v5, v6, :cond_0

    invoke-static {v2, v2}, Lwe/i;->k([J[J)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v1, v2, v1}, Lwe/i;->f([J[J[J)V

    invoke-static {v2, v1}, Lwe/i;->k([J[J)V

    move v5, v4

    :goto_1
    if-ge v5, v0, :cond_1

    invoke-static {v2, v2}, Lwe/i;->k([J[J)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    invoke-static {v2, v2, v1}, Lwe/i;->f([J[J[J)V

    invoke-static {v3, v2}, Lwe/i;->k([J[J)V

    move v5, v4

    :goto_2
    const/16 v6, 0x14

    if-ge v5, v6, :cond_2

    invoke-static {v3, v3}, Lwe/i;->k([J[J)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_2
    invoke-static {v2, v3, v2}, Lwe/i;->f([J[J[J)V

    invoke-static {v2, v2}, Lwe/i;->k([J[J)V

    move v5, v4

    :goto_3
    if-ge v5, v0, :cond_3

    invoke-static {v2, v2}, Lwe/i;->k([J[J)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_3
    invoke-static {v1, v2, v1}, Lwe/i;->f([J[J[J)V

    invoke-static {v2, v1}, Lwe/i;->k([J[J)V

    move v0, v4

    :goto_4
    const/16 v5, 0x32

    if-ge v0, v5, :cond_4

    invoke-static {v2, v2}, Lwe/i;->k([J[J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_4
    invoke-static {v2, v2, v1}, Lwe/i;->f([J[J[J)V

    invoke-static {v3, v2}, Lwe/i;->k([J[J)V

    move v0, v4

    :goto_5
    const/16 v6, 0x64

    if-ge v0, v6, :cond_5

    invoke-static {v3, v3}, Lwe/i;->k([J[J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_5
    invoke-static {v2, v3, v2}, Lwe/i;->f([J[J[J)V

    invoke-static {v2, v2}, Lwe/i;->k([J[J)V

    :goto_6
    if-ge v4, v5, :cond_6

    invoke-static {v2, v2}, Lwe/i;->k([J[J)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_6
    invoke-static {v1, v2, v1}, Lwe/i;->f([J[J[J)V

    invoke-static {v1, v1}, Lwe/i;->k([J[J)V

    invoke-static {v1, v1}, Lwe/i;->k([J[J)V

    invoke-static {p0, v1, p1}, Lwe/i;->f([J[J[J)V

    return-void
.end method

.method public static t([B)V
    .locals 74

    move-object/from16 v0, p0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lwe/e;->o([BI)J

    move-result-wide v1

    const-wide/32 v3, 0x1fffff

    and-long/2addr v1, v3

    const/4 v5, 0x2

    invoke-static {v0, v5}, Lwe/e;->p([BI)J

    move-result-wide v6

    const/4 v8, 0x5

    shr-long/2addr v6, v8

    and-long/2addr v6, v3

    invoke-static {v0, v8}, Lwe/e;->o([BI)J

    move-result-wide v9

    shr-long/2addr v9, v5

    and-long/2addr v9, v3

    const/4 v11, 0x7

    invoke-static {v0, v11}, Lwe/e;->p([BI)J

    move-result-wide v12

    shr-long/2addr v12, v11

    and-long/2addr v12, v3

    const/16 v14, 0xa

    invoke-static {v0, v14}, Lwe/e;->p([BI)J

    move-result-wide v15

    const/16 v17, 0x4

    shr-long v15, v15, v17

    and-long/2addr v15, v3

    move-wide/from16 v18, v3

    const/16 v3, 0xd

    invoke-static {v0, v3}, Lwe/e;->o([BI)J

    move-result-wide v20

    const/4 v4, 0x1

    shr-long v20, v20, v4

    and-long v20, v20, v18

    move/from16 v22, v3

    const/16 v3, 0xf

    invoke-static {v0, v3}, Lwe/e;->p([BI)J

    move-result-wide v23

    const/16 v25, 0x6

    shr-long v23, v23, v25

    and-long v23, v23, v18

    move/from16 v26, v3

    const/16 v3, 0x12

    invoke-static {v0, v3}, Lwe/e;->o([BI)J

    move-result-wide v27

    const/16 v29, 0x3

    shr-long v27, v27, v29

    and-long v27, v27, v18

    move/from16 v30, v3

    const/16 v3, 0x15

    invoke-static {v0, v3}, Lwe/e;->o([BI)J

    move-result-wide v31

    and-long v31, v31, v18

    move/from16 v33, v3

    const/16 v3, 0x17

    invoke-static {v0, v3}, Lwe/e;->p([BI)J

    move-result-wide v34

    shr-long v34, v34, v8

    and-long v34, v34, v18

    const/16 v3, 0x1a

    invoke-static {v0, v3}, Lwe/e;->o([BI)J

    move-result-wide v36

    shr-long v36, v36, v5

    and-long v36, v36, v18

    const/16 v3, 0x1c

    invoke-static {v0, v3}, Lwe/e;->p([BI)J

    move-result-wide v38

    shr-long v38, v38, v11

    and-long v38, v38, v18

    const/16 v3, 0x1f

    invoke-static {v0, v3}, Lwe/e;->p([BI)J

    move-result-wide v40

    shr-long v40, v40, v17

    and-long v40, v40, v18

    const/16 v3, 0x22

    invoke-static {v0, v3}, Lwe/e;->o([BI)J

    move-result-wide v42

    shr-long v42, v42, v4

    and-long v42, v42, v18

    const/16 v3, 0x24

    invoke-static {v0, v3}, Lwe/e;->p([BI)J

    move-result-wide v44

    shr-long v44, v44, v25

    and-long v44, v44, v18

    const/16 v3, 0x27

    invoke-static {v0, v3}, Lwe/e;->o([BI)J

    move-result-wide v46

    shr-long v46, v46, v29

    and-long v46, v46, v18

    const/16 v3, 0x2a

    invoke-static {v0, v3}, Lwe/e;->o([BI)J

    move-result-wide v48

    and-long v48, v48, v18

    const/16 v3, 0x2c

    invoke-static {v0, v3}, Lwe/e;->p([BI)J

    move-result-wide v50

    shr-long v50, v50, v8

    and-long v50, v50, v18

    const/16 v3, 0x2f

    invoke-static {v0, v3}, Lwe/e;->o([BI)J

    move-result-wide v52

    shr-long v52, v52, v5

    and-long v52, v52, v18

    const/16 v3, 0x31

    invoke-static {v0, v3}, Lwe/e;->p([BI)J

    move-result-wide v54

    shr-long v54, v54, v11

    and-long v54, v54, v18

    const/16 v3, 0x34

    invoke-static {v0, v3}, Lwe/e;->p([BI)J

    move-result-wide v56

    shr-long v56, v56, v17

    and-long v56, v56, v18

    const/16 v3, 0x37

    invoke-static {v0, v3}, Lwe/e;->o([BI)J

    move-result-wide v58

    shr-long v58, v58, v4

    and-long v58, v58, v18

    const/16 v3, 0x39

    invoke-static {v0, v3}, Lwe/e;->p([BI)J

    move-result-wide v60

    shr-long v60, v60, v25

    and-long v18, v60, v18

    const/16 v3, 0x3c

    invoke-static {v0, v3}, Lwe/e;->p([BI)J

    move-result-wide v60

    shr-long v60, v60, v29

    const-wide/32 v62, 0xa2c13

    mul-long v64, v60, v62

    add-long v38, v38, v64

    const-wide/32 v64, 0x72d18

    mul-long v66, v60, v64

    add-long v40, v40, v66

    const-wide/32 v66, 0x9fb67

    mul-long v68, v60, v66

    add-long v42, v42, v68

    const-wide/32 v68, 0xf39ad

    mul-long v70, v60, v68

    sub-long v44, v44, v70

    const-wide/32 v70, 0x215d1

    mul-long v72, v60, v70

    add-long v46, v46, v72

    const-wide/32 v72, 0xa6f7d

    mul-long v60, v60, v72

    sub-long v48, v48, v60

    mul-long v60, v18, v62

    add-long v36, v36, v60

    mul-long v60, v18, v64

    add-long v38, v38, v60

    mul-long v60, v18, v66

    add-long v40, v40, v60

    mul-long v60, v18, v68

    sub-long v42, v42, v60

    mul-long v60, v18, v70

    add-long v44, v44, v60

    mul-long v18, v18, v72

    sub-long v46, v46, v18

    mul-long v18, v58, v62

    add-long v34, v34, v18

    mul-long v18, v58, v64

    add-long v36, v36, v18

    mul-long v18, v58, v66

    add-long v38, v38, v18

    mul-long v18, v58, v68

    sub-long v40, v40, v18

    mul-long v18, v58, v70

    add-long v42, v42, v18

    mul-long v58, v58, v72

    sub-long v44, v44, v58

    mul-long v18, v56, v62

    add-long v31, v31, v18

    mul-long v18, v56, v64

    add-long v34, v34, v18

    mul-long v18, v56, v66

    add-long v36, v36, v18

    mul-long v18, v56, v68

    sub-long v38, v38, v18

    mul-long v18, v56, v70

    add-long v40, v40, v18

    mul-long v56, v56, v72

    sub-long v42, v42, v56

    mul-long v18, v54, v62

    add-long v27, v27, v18

    mul-long v18, v54, v64

    add-long v31, v31, v18

    mul-long v18, v54, v66

    add-long v34, v34, v18

    mul-long v18, v54, v68

    sub-long v36, v36, v18

    mul-long v18, v54, v70

    add-long v38, v38, v18

    mul-long v54, v54, v72

    sub-long v40, v40, v54

    mul-long v18, v52, v62

    add-long v23, v23, v18

    mul-long v18, v52, v64

    add-long v27, v27, v18

    mul-long v18, v52, v66

    add-long v31, v31, v18

    mul-long v18, v52, v68

    sub-long v34, v34, v18

    mul-long v18, v52, v70

    add-long v36, v36, v18

    mul-long v52, v52, v72

    sub-long v38, v38, v52

    const-wide/32 v18, 0x100000

    add-long v52, v23, v18

    shr-long v52, v52, v33

    add-long v27, v27, v52

    shl-long v52, v52, v33

    sub-long v23, v23, v52

    add-long v52, v31, v18

    shr-long v52, v52, v33

    add-long v34, v34, v52

    shl-long v52, v52, v33

    sub-long v31, v31, v52

    add-long v52, v36, v18

    shr-long v52, v52, v33

    add-long v38, v38, v52

    shl-long v52, v52, v33

    sub-long v36, v36, v52

    add-long v52, v40, v18

    shr-long v52, v52, v33

    add-long v42, v42, v52

    shl-long v52, v52, v33

    sub-long v40, v40, v52

    add-long v52, v44, v18

    shr-long v52, v52, v33

    add-long v46, v46, v52

    shl-long v52, v52, v33

    sub-long v44, v44, v52

    add-long v52, v48, v18

    shr-long v52, v52, v33

    add-long v50, v50, v52

    shl-long v52, v52, v33

    sub-long v48, v48, v52

    add-long v52, v27, v18

    shr-long v52, v52, v33

    add-long v31, v31, v52

    shl-long v52, v52, v33

    sub-long v27, v27, v52

    add-long v52, v34, v18

    shr-long v52, v52, v33

    add-long v36, v36, v52

    shl-long v52, v52, v33

    sub-long v34, v34, v52

    add-long v52, v38, v18

    shr-long v52, v52, v33

    add-long v40, v40, v52

    shl-long v52, v52, v33

    sub-long v38, v38, v52

    add-long v52, v42, v18

    shr-long v52, v52, v33

    add-long v44, v44, v52

    shl-long v52, v52, v33

    sub-long v42, v42, v52

    add-long v52, v46, v18

    shr-long v52, v52, v33

    add-long v48, v48, v52

    shl-long v52, v52, v33

    sub-long v46, v46, v52

    mul-long v52, v50, v62

    add-long v20, v20, v52

    mul-long v52, v50, v64

    add-long v23, v23, v52

    mul-long v52, v50, v66

    add-long v27, v27, v52

    mul-long v52, v50, v68

    sub-long v31, v31, v52

    mul-long v52, v50, v70

    add-long v34, v34, v52

    mul-long v50, v50, v72

    sub-long v36, v36, v50

    mul-long v50, v48, v62

    add-long v15, v15, v50

    mul-long v50, v48, v64

    add-long v20, v20, v50

    mul-long v50, v48, v66

    add-long v23, v23, v50

    mul-long v50, v48, v68

    sub-long v27, v27, v50

    mul-long v50, v48, v70

    add-long v31, v31, v50

    mul-long v48, v48, v72

    sub-long v34, v34, v48

    mul-long v48, v46, v62

    add-long v12, v12, v48

    mul-long v48, v46, v64

    add-long v15, v15, v48

    mul-long v48, v46, v66

    add-long v20, v20, v48

    mul-long v48, v46, v68

    sub-long v23, v23, v48

    mul-long v48, v46, v70

    add-long v27, v27, v48

    mul-long v46, v46, v72

    sub-long v31, v31, v46

    mul-long v46, v44, v62

    add-long v9, v9, v46

    mul-long v46, v44, v64

    add-long v12, v12, v46

    mul-long v46, v44, v66

    add-long v15, v15, v46

    mul-long v46, v44, v68

    sub-long v20, v20, v46

    mul-long v46, v44, v70

    add-long v23, v23, v46

    mul-long v44, v44, v72

    sub-long v27, v27, v44

    mul-long v44, v42, v62

    add-long v6, v6, v44

    mul-long v44, v42, v64

    add-long v9, v9, v44

    mul-long v44, v42, v66

    add-long v12, v12, v44

    mul-long v44, v42, v68

    sub-long v15, v15, v44

    mul-long v44, v42, v70

    add-long v20, v20, v44

    mul-long v42, v42, v72

    sub-long v23, v23, v42

    mul-long v42, v40, v62

    add-long v1, v1, v42

    mul-long v42, v40, v64

    add-long v6, v6, v42

    mul-long v42, v40, v66

    add-long v9, v9, v42

    mul-long v42, v40, v68

    sub-long v12, v12, v42

    mul-long v42, v40, v70

    add-long v15, v15, v42

    mul-long v40, v40, v72

    sub-long v20, v20, v40

    add-long v40, v1, v18

    shr-long v40, v40, v33

    add-long v6, v6, v40

    shl-long v40, v40, v33

    sub-long v1, v1, v40

    add-long v40, v9, v18

    shr-long v40, v40, v33

    add-long v12, v12, v40

    shl-long v40, v40, v33

    sub-long v9, v9, v40

    add-long v40, v15, v18

    shr-long v40, v40, v33

    add-long v20, v20, v40

    shl-long v40, v40, v33

    sub-long v15, v15, v40

    add-long v40, v23, v18

    shr-long v40, v40, v33

    add-long v27, v27, v40

    shl-long v40, v40, v33

    sub-long v23, v23, v40

    add-long v40, v31, v18

    shr-long v40, v40, v33

    add-long v34, v34, v40

    shl-long v40, v40, v33

    sub-long v31, v31, v40

    add-long v40, v36, v18

    shr-long v40, v40, v33

    add-long v38, v38, v40

    shl-long v40, v40, v33

    sub-long v36, v36, v40

    add-long v40, v6, v18

    shr-long v40, v40, v33

    add-long v9, v9, v40

    shl-long v40, v40, v33

    sub-long v6, v6, v40

    add-long v40, v12, v18

    shr-long v40, v40, v33

    add-long v15, v15, v40

    shl-long v40, v40, v33

    sub-long v12, v12, v40

    add-long v40, v20, v18

    shr-long v40, v40, v33

    add-long v23, v23, v40

    shl-long v40, v40, v33

    sub-long v20, v20, v40

    add-long v40, v27, v18

    shr-long v40, v40, v33

    add-long v31, v31, v40

    shl-long v40, v40, v33

    sub-long v27, v27, v40

    add-long v40, v34, v18

    shr-long v40, v40, v33

    add-long v36, v36, v40

    shl-long v40, v40, v33

    sub-long v34, v34, v40

    add-long v18, v38, v18

    shr-long v18, v18, v33

    shl-long v40, v18, v33

    sub-long v38, v38, v40

    mul-long v40, v18, v62

    add-long v1, v1, v40

    mul-long v40, v18, v64

    add-long v6, v6, v40

    mul-long v40, v18, v66

    add-long v9, v9, v40

    mul-long v40, v18, v68

    sub-long v12, v12, v40

    mul-long v40, v18, v70

    add-long v15, v15, v40

    mul-long v18, v18, v72

    sub-long v20, v20, v18

    shr-long v18, v1, v33

    add-long v6, v6, v18

    shl-long v18, v18, v33

    sub-long v1, v1, v18

    shr-long v18, v6, v33

    add-long v9, v9, v18

    shl-long v18, v18, v33

    sub-long v6, v6, v18

    shr-long v18, v9, v33

    add-long v12, v12, v18

    shl-long v18, v18, v33

    sub-long v9, v9, v18

    shr-long v18, v12, v33

    add-long v15, v15, v18

    shl-long v18, v18, v33

    sub-long v12, v12, v18

    shr-long v18, v15, v33

    add-long v20, v20, v18

    shl-long v18, v18, v33

    sub-long v15, v15, v18

    shr-long v18, v20, v33

    add-long v23, v23, v18

    shl-long v18, v18, v33

    sub-long v20, v20, v18

    shr-long v18, v23, v33

    add-long v27, v27, v18

    shl-long v18, v18, v33

    sub-long v23, v23, v18

    shr-long v18, v27, v33

    add-long v31, v31, v18

    shl-long v18, v18, v33

    sub-long v27, v27, v18

    shr-long v18, v31, v33

    add-long v34, v34, v18

    shl-long v18, v18, v33

    sub-long v31, v31, v18

    shr-long v18, v34, v33

    add-long v36, v36, v18

    shl-long v18, v18, v33

    sub-long v34, v34, v18

    shr-long v18, v36, v33

    add-long v38, v38, v18

    shl-long v18, v18, v33

    sub-long v36, v36, v18

    shr-long v18, v38, v33

    shl-long v40, v18, v33

    sub-long v38, v38, v40

    mul-long v62, v62, v18

    add-long v1, v1, v62

    mul-long v64, v64, v18

    add-long v6, v6, v64

    mul-long v66, v66, v18

    add-long v9, v9, v66

    mul-long v68, v68, v18

    sub-long v12, v12, v68

    mul-long v70, v70, v18

    add-long v15, v15, v70

    mul-long v18, v18, v72

    sub-long v20, v20, v18

    shr-long v18, v1, v33

    add-long v6, v6, v18

    shl-long v18, v18, v33

    sub-long v1, v1, v18

    shr-long v18, v6, v33

    add-long v9, v9, v18

    shl-long v18, v18, v33

    sub-long v6, v6, v18

    shr-long v18, v9, v33

    add-long v12, v12, v18

    shl-long v18, v18, v33

    sub-long v9, v9, v18

    shr-long v18, v12, v33

    add-long v15, v15, v18

    shl-long v18, v18, v33

    sub-long v12, v12, v18

    shr-long v18, v15, v33

    add-long v20, v20, v18

    shl-long v18, v18, v33

    sub-long v15, v15, v18

    shr-long v18, v20, v33

    add-long v23, v23, v18

    shl-long v18, v18, v33

    sub-long v20, v20, v18

    shr-long v18, v23, v33

    add-long v27, v27, v18

    shl-long v18, v18, v33

    sub-long v23, v23, v18

    shr-long v18, v27, v33

    add-long v31, v31, v18

    shl-long v18, v18, v33

    sub-long v27, v27, v18

    shr-long v18, v31, v33

    add-long v34, v34, v18

    shl-long v18, v18, v33

    move/from16 v40, v4

    move v3, v5

    sub-long v4, v31, v18

    shr-long v18, v34, v33

    add-long v36, v36, v18

    shl-long v18, v18, v33

    sub-long v34, v34, v18

    shr-long v18, v36, v33

    add-long v38, v38, v18

    shl-long v18, v18, v33

    sub-long v36, v36, v18

    move/from16 v18, v3

    long-to-int v3, v1

    int-to-byte v3, v3

    const/16 v19, 0x0

    aput-byte v3, v0, v19

    const/16 v3, 0x8

    move/from16 v19, v8

    move-wide/from16 v31, v9

    shr-long v8, v1, v3

    long-to-int v8, v8

    int-to-byte v8, v8

    aput-byte v8, v0, v40

    const/16 v8, 0x10

    shr-long/2addr v1, v8

    shl-long v9, v6, v19

    or-long/2addr v1, v9

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, v0, v18

    shr-long v1, v6, v29

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, v0, v29

    const/16 v1, 0xb

    shr-long v1, v6, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, v0, v17

    const/16 v1, 0x13

    shr-long v1, v6, v1

    shl-long v6, v31, v18

    or-long/2addr v1, v6

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, v0, v19

    shr-long v1, v31, v25

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, v0, v25

    const/16 v1, 0xe

    shr-long v1, v31, v1

    shl-long v6, v12, v11

    or-long/2addr v1, v6

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, v0, v11

    shr-long v1, v12, v40

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, v0, v3

    const/16 v1, 0x9

    shr-long v1, v12, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    const/16 v2, 0x9

    aput-byte v1, v0, v2

    const/16 v1, 0x11

    shr-long v1, v12, v1

    shl-long v6, v15, v17

    or-long/2addr v1, v6

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, v0, v14

    shr-long v1, v15, v17

    long-to-int v1, v1

    int-to-byte v1, v1

    const/16 v2, 0xb

    aput-byte v1, v0, v2

    const/16 v1, 0xc

    shr-long v1, v15, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    const/16 v2, 0xc

    aput-byte v1, v0, v2

    const/16 v1, 0x14

    shr-long v1, v15, v1

    shl-long v6, v20, v40

    or-long/2addr v1, v6

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, v0, v22

    shr-long v1, v20, v11

    long-to-int v1, v1

    int-to-byte v1, v1

    const/16 v2, 0xe

    aput-byte v1, v0, v2

    shr-long v1, v20, v26

    shl-long v6, v23, v25

    or-long/2addr v1, v6

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, v0, v26

    shr-long v1, v23, v18

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, v0, v8

    shr-long v1, v23, v14

    long-to-int v1, v1

    int-to-byte v1, v1

    const/16 v2, 0x11

    aput-byte v1, v0, v2

    shr-long v1, v23, v30

    shl-long v6, v27, v29

    or-long/2addr v1, v6

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, v0, v30

    shr-long v1, v27, v19

    long-to-int v1, v1

    int-to-byte v1, v1

    const/16 v2, 0x13

    aput-byte v1, v0, v2

    shr-long v1, v27, v22

    long-to-int v1, v1

    int-to-byte v1, v1

    const/16 v2, 0x14

    aput-byte v1, v0, v2

    long-to-int v1, v4

    int-to-byte v1, v1

    aput-byte v1, v0, v33

    shr-long v1, v4, v3

    long-to-int v1, v1

    int-to-byte v1, v1

    const/16 v2, 0x16

    aput-byte v1, v0, v2

    shr-long v1, v4, v8

    shl-long v3, v34, v19

    or-long/2addr v1, v3

    long-to-int v1, v1

    int-to-byte v1, v1

    const/16 v2, 0x17

    aput-byte v1, v0, v2

    shr-long v1, v34, v29

    long-to-int v1, v1

    int-to-byte v1, v1

    const/16 v2, 0x18

    aput-byte v1, v0, v2

    const/16 v1, 0xb

    shr-long v1, v34, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    const/16 v2, 0x19

    aput-byte v1, v0, v2

    const/16 v1, 0x13

    shr-long v1, v34, v1

    shl-long v3, v36, v18

    or-long/2addr v1, v3

    long-to-int v1, v1

    int-to-byte v1, v1

    const/16 v2, 0x1a

    aput-byte v1, v0, v2

    shr-long v1, v36, v25

    long-to-int v1, v1

    int-to-byte v1, v1

    const/16 v2, 0x1b

    aput-byte v1, v0, v2

    const/16 v1, 0xe

    shr-long v1, v36, v1

    shl-long v3, v38, v11

    or-long/2addr v1, v3

    long-to-int v1, v1

    int-to-byte v1, v1

    const/16 v2, 0x1c

    aput-byte v1, v0, v2

    shr-long v1, v38, v40

    long-to-int v1, v1

    int-to-byte v1, v1

    const/16 v2, 0x1d

    aput-byte v1, v0, v2

    const/16 v1, 0x9

    shr-long v1, v38, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    const/16 v2, 0x1e

    aput-byte v1, v0, v2

    const/16 v1, 0x11

    shr-long v1, v38, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    const/16 v2, 0x1f

    aput-byte v1, v0, v2

    return-void
.end method

.method public static u([B)Lwe/e$d;
    .locals 8

    const/16 v0, 0x40

    new-array v1, v0, [B

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/16 v4, 0x20

    const/4 v5, 0x1

    if-ge v3, v4, :cond_0

    mul-int/lit8 v4, v3, 0x2

    aget-byte v6, p0, v3

    and-int/lit8 v6, v6, 0xf

    int-to-byte v6, v6

    aput-byte v6, v1, v4

    add-int/2addr v4, v5

    aget-byte v5, p0, v3

    and-int/lit16 v5, v5, 0xff

    shr-int/lit8 v5, v5, 0x4

    and-int/lit8 v5, v5, 0xf

    int-to-byte v5, v5

    aput-byte v5, v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    move p0, v2

    move v3, p0

    :goto_1
    const/16 v4, 0x3f

    if-ge p0, v4, :cond_1

    aget-byte v4, v1, p0

    add-int/2addr v4, v3

    int-to-byte v3, v4

    aput-byte v3, v1, p0

    add-int/lit8 v4, v3, 0x8

    shr-int/lit8 v4, v4, 0x4

    shl-int/lit8 v6, v4, 0x4

    sub-int/2addr v3, v6

    int-to-byte v3, v3

    aput-byte v3, v1, p0

    add-int/lit8 p0, p0, 0x1

    move v3, v4

    goto :goto_1

    :cond_1
    aget-byte p0, v1, v4

    add-int/2addr p0, v3

    int-to-byte p0, p0

    aput-byte p0, v1, v4

    new-instance p0, Lwe/e$c;

    sget-object v3, Lwe/e;->b:Lwe/e$c;

    invoke-direct {p0, v3}, Lwe/e$c;-><init>(Lwe/e$c;)V

    new-instance v3, Lwe/e$e;

    invoke-direct {v3}, Lwe/e$e;-><init>()V

    :goto_2
    if-ge v5, v0, :cond_2

    new-instance v4, Lwe/e$a;

    sget-object v6, Lwe/e;->a:Lwe/e$a;

    invoke-direct {v4, v6}, Lwe/e$a;-><init>(Lwe/e$a;)V

    div-int/lit8 v6, v5, 0x2

    aget-byte v7, v1, v5

    invoke-static {v4, v6, v7}, Lwe/e;->w(Lwe/e$a;IB)V

    invoke-static {v3, p0}, Lwe/e$e;->a(Lwe/e$e;Lwe/e$c;)Lwe/e$e;

    move-result-object v6

    invoke-static {p0, v6, v4}, Lwe/e;->e(Lwe/e$c;Lwe/e$e;Lwe/e$a;)V

    add-int/lit8 v5, v5, 0x2

    goto :goto_2

    :cond_2
    new-instance v4, Lwe/e$d;

    invoke-direct {v4}, Lwe/e$d;-><init>()V

    invoke-static {v4, p0}, Lwe/e$d;->a(Lwe/e$d;Lwe/e$c;)Lwe/e$d;

    move-result-object v5

    invoke-static {p0, v5}, Lwe/e;->g(Lwe/e$c;Lwe/e$d;)V

    invoke-static {v4, p0}, Lwe/e$d;->a(Lwe/e$d;Lwe/e$c;)Lwe/e$d;

    move-result-object v5

    invoke-static {p0, v5}, Lwe/e;->g(Lwe/e$c;Lwe/e$d;)V

    invoke-static {v4, p0}, Lwe/e$d;->a(Lwe/e$d;Lwe/e$c;)Lwe/e$d;

    move-result-object v5

    invoke-static {p0, v5}, Lwe/e;->g(Lwe/e$c;Lwe/e$d;)V

    invoke-static {v4, p0}, Lwe/e$d;->a(Lwe/e$d;Lwe/e$c;)Lwe/e$d;

    move-result-object v4

    invoke-static {p0, v4}, Lwe/e;->g(Lwe/e$c;Lwe/e$d;)V

    :goto_3
    if-ge v2, v0, :cond_3

    new-instance v4, Lwe/e$a;

    sget-object v5, Lwe/e;->a:Lwe/e$a;

    invoke-direct {v4, v5}, Lwe/e$a;-><init>(Lwe/e$a;)V

    div-int/lit8 v5, v2, 0x2

    aget-byte v6, v1, v2

    invoke-static {v4, v5, v6}, Lwe/e;->w(Lwe/e$a;IB)V

    invoke-static {v3, p0}, Lwe/e$e;->a(Lwe/e$e;Lwe/e$c;)Lwe/e$e;

    move-result-object v5

    invoke-static {p0, v5, v4}, Lwe/e;->e(Lwe/e$c;Lwe/e$e;Lwe/e$a;)V

    add-int/lit8 v2, v2, 0x2

    goto :goto_3

    :cond_3
    new-instance v0, Lwe/e$d;

    invoke-direct {v0, p0}, Lwe/e$d;-><init>(Lwe/e$c;)V

    invoke-virtual {v0}, Lwe/e$d;->b()Z

    move-result p0

    if-eqz p0, :cond_4

    return-object v0

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "arithmetic error in scalar multiplication"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static v([B)[B
    .locals 0

    invoke-static {p0}, Lwe/e;->u([B)Lwe/e$d;

    move-result-object p0

    invoke-virtual {p0}, Lwe/e$d;->c()[B

    move-result-object p0

    return-object p0
.end method

.method public static w(Lwe/e$a;IB)V
    .locals 6

    and-int/lit16 v0, p2, 0xff

    const/4 v1, 0x7

    shr-int/2addr v0, v1

    neg-int v2, v0

    and-int/2addr v2, p2

    const/4 v3, 0x1

    shl-int/2addr v2, v3

    sub-int/2addr p2, v2

    sget-object v2, Lwe/f;->d:[[Lwe/e$a;

    aget-object v4, v2, p1

    const/4 v5, 0x0

    aget-object v4, v4, v5

    invoke-static {p2, v3}, Lwe/e;->i(II)I

    move-result v5

    invoke-virtual {p0, v4, v5}, Lwe/e$a;->a(Lwe/e$a;I)V

    aget-object v4, v2, p1

    aget-object v3, v4, v3

    const/4 v4, 0x2

    invoke-static {p2, v4}, Lwe/e;->i(II)I

    move-result v5

    invoke-virtual {p0, v3, v5}, Lwe/e$a;->a(Lwe/e$a;I)V

    aget-object v3, v2, p1

    aget-object v3, v3, v4

    const/4 v4, 0x3

    invoke-static {p2, v4}, Lwe/e;->i(II)I

    move-result v5

    invoke-virtual {p0, v3, v5}, Lwe/e$a;->a(Lwe/e$a;I)V

    aget-object v3, v2, p1

    aget-object v3, v3, v4

    const/4 v4, 0x4

    invoke-static {p2, v4}, Lwe/e;->i(II)I

    move-result v5

    invoke-virtual {p0, v3, v5}, Lwe/e$a;->a(Lwe/e$a;I)V

    aget-object v3, v2, p1

    aget-object v3, v3, v4

    const/4 v4, 0x5

    invoke-static {p2, v4}, Lwe/e;->i(II)I

    move-result v5

    invoke-virtual {p0, v3, v5}, Lwe/e$a;->a(Lwe/e$a;I)V

    aget-object v3, v2, p1

    aget-object v3, v3, v4

    const/4 v4, 0x6

    invoke-static {p2, v4}, Lwe/e;->i(II)I

    move-result v5

    invoke-virtual {p0, v3, v5}, Lwe/e$a;->a(Lwe/e$a;I)V

    aget-object v3, v2, p1

    aget-object v3, v3, v4

    invoke-static {p2, v1}, Lwe/e;->i(II)I

    move-result v4

    invoke-virtual {p0, v3, v4}, Lwe/e$a;->a(Lwe/e$a;I)V

    aget-object p1, v2, p1

    aget-object p1, p1, v1

    const/16 v1, 0x8

    invoke-static {p2, v1}, Lwe/e;->i(II)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lwe/e$a;->a(Lwe/e$a;I)V

    iget-object p1, p0, Lwe/e$a;->b:[J

    const/16 p2, 0xa

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    iget-object v1, p0, Lwe/e$a;->a:[J

    invoke-static {v1, p2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v1

    iget-object v2, p0, Lwe/e$a;->c:[J

    invoke-static {v2, p2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p2

    invoke-static {p2, p2}, Lwe/e;->r([J[J)V

    new-instance v2, Lwe/e$a;

    invoke-direct {v2, p1, v1, p2}, Lwe/e$a;-><init>([J[J[J)V

    invoke-virtual {p0, v2, v0}, Lwe/e$a;->a(Lwe/e$a;I)V

    return-void
.end method

.method public static x([B[B[B)[B
    .locals 5

    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p0

    sget-object v0, Ldf/m;->e:Ldf/m;

    const-string v2, "SHA-512"

    invoke-virtual {v0, v2}, Ldf/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/MessageDigest;

    const/16 v2, 0x20

    invoke-virtual {v0, p2, v2, v2}, Ljava/security/MessageDigest;->update([BII)V

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v3

    invoke-static {v3}, Lwe/e;->t([B)V

    invoke-static {v3}, Lwe/e;->u([B)Lwe/e$d;

    move-result-object v4

    invoke-virtual {v4}, Lwe/e$d;->c()[B

    move-result-object v4

    invoke-static {v4, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    invoke-virtual {v0}, Ljava/security/MessageDigest;->reset()V

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    invoke-static {p0}, Lwe/e;->t([B)V

    new-array p1, v2, [B

    invoke-static {p1, p0, p2, v3}, Lwe/e;->q([B[B[B[B)V

    filled-new-array {v1, p1}, [[B

    move-result-object p0

    invoke-static {p0}, Ldf/e;->a([[B)[B

    move-result-object p0

    return-object p0
.end method

.method public static y([B)[B
    .locals 10

    const/16 v0, 0x100

    new-array v1, v0, [B

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v4, 0x1

    if-ge v3, v0, :cond_0

    shr-int/lit8 v5, v3, 0x3

    aget-byte v5, p0, v5

    and-int/lit16 v5, v5, 0xff

    and-int/lit8 v6, v3, 0x7

    shr-int/2addr v5, v6

    and-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    move p0, v2

    :goto_1
    if-ge p0, v0, :cond_5

    aget-byte v3, v1, p0

    if-eqz v3, :cond_4

    move v3, v4

    :goto_2
    const/4 v5, 0x6

    if-gt v3, v5, :cond_4

    add-int v5, p0, v3

    if-ge v5, v0, :cond_4

    aget-byte v6, v1, v5

    if-eqz v6, :cond_3

    aget-byte v7, v1, p0

    shl-int v8, v6, v3

    add-int/2addr v8, v7

    const/16 v9, 0xf

    if-gt v8, v9, :cond_1

    shl-int/2addr v6, v3

    add-int/2addr v7, v6

    int-to-byte v6, v7

    aput-byte v6, v1, p0

    aput-byte v2, v1, v5

    goto :goto_4

    :cond_1
    shl-int v8, v6, v3

    sub-int v8, v7, v8

    const/16 v9, -0xf

    if-lt v8, v9, :cond_4

    shl-int/2addr v6, v3

    sub-int/2addr v7, v6

    int-to-byte v6, v7

    aput-byte v6, v1, p0

    :goto_3
    if-ge v5, v0, :cond_3

    aget-byte v6, v1, v5

    if-nez v6, :cond_2

    aput-byte v4, v1, v5

    goto :goto_4

    :cond_2
    aput-byte v2, v1, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_3
    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_4
    add-int/lit8 p0, p0, 0x1

    goto :goto_1

    :cond_5
    return-object v1
.end method

.method public static z(Lwe/e$c;Lwe/e$e;Lwe/e$a;)V
    .locals 4

    const/16 v0, 0xa

    new-array v0, v0, [J

    iget-object v1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object v1, v1, Lwe/e$d;->a:[J

    iget-object v2, p1, Lwe/e$e;->a:Lwe/e$d;

    iget-object v3, v2, Lwe/e$d;->b:[J

    iget-object v2, v2, Lwe/e$d;->a:[J

    invoke-static {v1, v3, v2}, Lwe/i;->o([J[J[J)V

    iget-object v1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object v1, v1, Lwe/e$d;->b:[J

    iget-object v2, p1, Lwe/e$e;->a:Lwe/e$d;

    iget-object v3, v2, Lwe/e$d;->b:[J

    iget-object v2, v2, Lwe/e$d;->a:[J

    invoke-static {v1, v3, v2}, Lwe/i;->m([J[J[J)V

    iget-object v1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object v1, v1, Lwe/e$d;->b:[J

    iget-object v2, p2, Lwe/e$a;->a:[J

    invoke-static {v1, v1, v2}, Lwe/i;->f([J[J[J)V

    iget-object v1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object v2, v1, Lwe/e$d;->c:[J

    iget-object v1, v1, Lwe/e$d;->a:[J

    iget-object v3, p2, Lwe/e$a;->b:[J

    invoke-static {v2, v1, v3}, Lwe/i;->f([J[J[J)V

    iget-object v1, p0, Lwe/e$c;->b:[J

    iget-object v2, p1, Lwe/e$e;->b:[J

    iget-object v3, p2, Lwe/e$a;->c:[J

    invoke-static {v1, v2, v3}, Lwe/i;->f([J[J[J)V

    iget-object v1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object v1, v1, Lwe/e$d;->a:[J

    iget-object p1, p1, Lwe/e$e;->a:Lwe/e$d;

    iget-object p1, p1, Lwe/e$d;->c:[J

    invoke-virtual {p2, v1, p1}, Lwe/e$a;->b([J[J)V

    iget-object p1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object p1, p1, Lwe/e$d;->a:[J

    invoke-static {v0, p1, p1}, Lwe/i;->o([J[J[J)V

    iget-object p1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object p2, p1, Lwe/e$d;->a:[J

    iget-object v1, p1, Lwe/e$d;->c:[J

    iget-object p1, p1, Lwe/e$d;->b:[J

    invoke-static {p2, v1, p1}, Lwe/i;->m([J[J[J)V

    iget-object p1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object p2, p1, Lwe/e$d;->b:[J

    iget-object p1, p1, Lwe/e$d;->c:[J

    invoke-static {p2, p1, p2}, Lwe/i;->o([J[J[J)V

    iget-object p1, p0, Lwe/e$c;->a:Lwe/e$d;

    iget-object p1, p1, Lwe/e$d;->c:[J

    iget-object p2, p0, Lwe/e$c;->b:[J

    invoke-static {p1, v0, p2}, Lwe/i;->m([J[J[J)V

    iget-object p0, p0, Lwe/e$c;->b:[J

    invoke-static {p0, v0, p0}, Lwe/i;->o([J[J[J)V

    return-void
.end method
