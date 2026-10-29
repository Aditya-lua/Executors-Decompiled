.class public final Ldf/y$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/a0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/security/interfaces/RSAPublicKey;

.field public final b:Ldf/o;

.field public final c:Ldf/o;

.field public final d:I

.field public final e:[B

.field public final f:[B


# direct methods
.method public constructor <init>(Ljava/security/interfaces/RSAPublicKey;Ldf/o;Ldf/o;I[B[B)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Lue/b;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    invoke-static {p2}, Ldf/a0;->e(Ldf/o;)V

    .line 5
    invoke-virtual {p2, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    invoke-interface {p1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    invoke-static {v0}, Ldf/a0;->c(I)V

    .line 7
    invoke-interface {p1}, Ljava/security/interfaces/RSAPublicKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v0}, Ldf/a0;->d(Ljava/math/BigInteger;)V

    .line 8
    iput-object p1, p0, Ldf/y$b;->a:Ljava/security/interfaces/RSAPublicKey;

    .line 9
    iput-object p2, p0, Ldf/y$b;->b:Ldf/o;

    .line 10
    iput-object p3, p0, Ldf/y$b;->c:Ldf/o;

    .line 11
    iput p4, p0, Ldf/y$b;->d:I

    .line 12
    iput-object p5, p0, Ldf/y$b;->e:[B

    .line 13
    iput-object p6, p0, Ldf/y$b;->f:[B

    return-void

    .line 14
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "sigHash and mgf1Hash must be the same"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 15
    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(Ljava/security/interfaces/RSAPublicKey;Ldf/o;Ldf/o;I[B[BLdf/y$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Ldf/y$b;-><init>(Ljava/security/interfaces/RSAPublicKey;Ldf/o;Ldf/o;I[B[B)V

    return-void
.end method

.method private c([B[B)V
    .locals 5

    iget-object v0, p0, Ldf/y$b;->a:Ljava/security/interfaces/RSAPublicKey;

    invoke-interface {v0}, Ljava/security/interfaces/RSAPublicKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object v0

    iget-object v1, p0, Ldf/y$b;->a:Ljava/security/interfaces/RSAPublicKey;

    invoke-interface {v1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->bitLength()I

    move-result v2

    add-int/lit8 v2, v2, 0x7

    div-int/lit8 v2, v2, 0x8

    invoke-virtual {v1}, Ljava/math/BigInteger;->bitLength()I

    move-result v3

    add-int/lit8 v3, v3, 0x6

    div-int/lit8 v3, v3, 0x8

    array-length v4, p1

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Ldf/z;->a([B)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v2

    if-gez v2, :cond_0

    invoke-virtual {p1, v0, v1}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {p1, v3}, Ldf/z;->b(Ljava/math/BigInteger;I)[B

    move-result-object p1

    invoke-virtual {v1}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, p2, p1, v0}, Ldf/y$b;->b([B[BI)V

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "signature out of range"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "invalid signature\'s length"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a([B[B)V
    .locals 2

    iget-object v0, p0, Ldf/y$b;->e:[B

    array-length v1, v0

    if-nez v1, :cond_0

    invoke-direct {p0, p1, p2}, Ldf/y$b;->c([B[B)V

    return-void

    :cond_0
    invoke-static {v0, p1}, Lwe/s0;->e([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ldf/y$b;->e:[B

    array-length v0, v0

    array-length v1, p1

    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-direct {p0, p1, p2}, Ldf/y$b;->c([B[B)V

    return-void

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Invalid signature (output prefix mismatch)"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b([B[BI)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    iget-object v2, v0, Ldf/y$b;->b:Ldf/o;

    invoke-static {v2}, Ldf/a0;->e(Ldf/o;)V

    sget-object v2, Ldf/m;->e:Ldf/m;

    iget-object v3, v0, Ldf/y$b;->b:Ldf/o;

    invoke-static {v3}, Ldf/z;->e(Ldf/o;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldf/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/MessageDigest;

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/security/MessageDigest;->update([B)V

    iget-object v3, v0, Ldf/y$b;->f:[B

    array-length v4, v3

    if-eqz v4, :cond_0

    invoke-virtual {v2, v3}, Ljava/security/MessageDigest;->update([B)V

    :cond_0
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v3

    invoke-virtual {v2}, Ljava/security/MessageDigest;->getDigestLength()I

    move-result v4

    array-length v5, v1

    iget v6, v0, Ldf/y$b;->d:I

    add-int/2addr v6, v4

    add-int/lit8 v6, v6, 0x2

    const-string v7, "inconsistent"

    if-lt v5, v6, :cond_a

    array-length v6, v1

    const/4 v8, 0x1

    sub-int/2addr v6, v8

    aget-byte v6, v1, v6

    const/16 v9, -0x44

    if-ne v6, v9, :cond_9

    sub-int v6, v5, v4

    add-int/lit8 v9, v6, -0x1

    invoke-static {v1, v9}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v10

    array-length v11, v10

    array-length v12, v10

    add-int/2addr v12, v4

    invoke-static {v1, v11, v12}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    const/4 v12, 0x0

    :goto_0
    int-to-long v13, v12

    move/from16 p2, v12

    int-to-long v11, v5

    const-wide/16 v15, 0x8

    mul-long/2addr v11, v15

    move/from16 v15, p3

    move/from16 v16, v8

    move/from16 v17, v9

    int-to-long v8, v15

    sub-long/2addr v11, v8

    cmp-long v8, v13, v11

    if-gez v8, :cond_2

    div-int/lit8 v12, p2, 0x8

    rem-int/lit8 v8, p2, 0x8

    rsub-int/lit8 v8, v8, 0x7

    aget-byte v9, v10, v12

    shr-int v8, v9, v8

    and-int/lit8 v8, v8, 0x1

    if-nez v8, :cond_1

    add-int/lit8 v12, p2, 0x1

    move/from16 v8, v16

    move/from16 v9, v17

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/security/GeneralSecurityException;

    invoke-direct {v1, v7}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v5, v0, Ldf/y$b;->c:Ldf/o;

    move/from16 v8, v17

    invoke-static {v1, v8, v5}, Ldf/z;->d([BILdf/o;)[B

    move-result-object v5

    array-length v8, v5

    new-array v9, v8, [B

    const/4 v13, 0x0

    :goto_1
    if-ge v13, v8, :cond_3

    aget-byte v14, v5, v13

    aget-byte v15, v10, v13

    xor-int/2addr v14, v15

    int-to-byte v14, v14

    aput-byte v14, v9, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    :goto_2
    int-to-long v13, v5

    cmp-long v10, v13, v11

    if-gtz v10, :cond_4

    div-int/lit8 v10, v5, 0x8

    rem-int/lit8 v13, v5, 0x8

    rsub-int/lit8 v13, v13, 0x7

    aget-byte v14, v9, v10

    shl-int v13, v16, v13

    not-int v13, v13

    and-int/2addr v13, v14

    int-to-byte v13, v13

    aput-byte v13, v9, v10

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_4
    const/4 v5, 0x0

    :goto_3
    iget v10, v0, Ldf/y$b;->d:I

    sub-int v11, v6, v10

    add-int/lit8 v11, v11, -0x2

    if-ge v5, v11, :cond_6

    aget-byte v10, v9, v5

    if-nez v10, :cond_5

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_5
    new-instance v1, Ljava/security/GeneralSecurityException;

    invoke-direct {v1, v7}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    sub-int/2addr v6, v10

    add-int/lit8 v6, v6, -0x2

    aget-byte v5, v9, v6

    move/from16 v6, v16

    if-ne v5, v6, :cond_8

    sub-int v5, v8, v10

    invoke-static {v9, v5, v8}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v5

    const/16 v6, 0x8

    add-int/2addr v4, v6

    iget v8, v0, Ldf/y$b;->d:I

    add-int/2addr v8, v4

    new-array v8, v8, [B

    array-length v9, v3

    const/4 v10, 0x0

    invoke-static {v3, v10, v8, v6, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v3, v5

    invoke-static {v5, v10, v8, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {v2, v8}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v2

    invoke-static {v2, v1}, Ldf/e;->b([B[B)Z

    move-result v1

    if-eqz v1, :cond_7

    return-void

    :cond_7
    new-instance v1, Ljava/security/GeneralSecurityException;

    invoke-direct {v1, v7}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    new-instance v1, Ljava/security/GeneralSecurityException;

    invoke-direct {v1, v7}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    new-instance v1, Ljava/security/GeneralSecurityException;

    invoke-direct {v1, v7}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    new-instance v1, Ljava/security/GeneralSecurityException;

    invoke-direct {v1, v7}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
