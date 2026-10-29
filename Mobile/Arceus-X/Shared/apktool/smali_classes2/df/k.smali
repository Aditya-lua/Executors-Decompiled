.class public final Ldf/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldf/k$c;,
        Ldf/k$b;,
        Ldf/k$d;
    }
.end annotation


# direct methods
.method public static a(Ljava/security/interfaces/ECPublicKey;)V
    .locals 1

    invoke-interface {p0}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v0

    invoke-interface {p0}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object p0

    invoke-virtual {p0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object p0

    invoke-static {v0, p0}, Lwe/g;->b(Ljava/security/spec/ECPoint;Ljava/security/spec/EllipticCurve;)V

    return-void
.end method

.method public static b([BI)[B
    .locals 8

    invoke-static {p0}, Ldf/k;->n([B)Z

    move-result v0

    if-eqz v0, :cond_3

    new-array v0, p1, [B

    const/4 v1, 0x1

    aget-byte v2, p0, v1

    and-int/lit16 v2, v2, 0xff

    const/16 v3, 0x80

    const/4 v4, 0x2

    if-lt v2, v3, :cond_0

    const/4 v2, 0x3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    add-int/lit8 v3, v2, 0x1

    add-int/2addr v2, v4

    aget-byte v3, p0, v3

    aget-byte v4, p0, v2

    const/4 v5, 0x0

    if-nez v4, :cond_1

    move v4, v1

    goto :goto_1

    :cond_1
    move v4, v5

    :goto_1
    add-int v6, v2, v4

    div-int/lit8 v7, p1, 0x2

    sub-int/2addr v7, v3

    add-int/2addr v7, v4

    sub-int v4, v3, v4

    invoke-static {p0, v6, v0, v7, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v3, v1

    add-int/2addr v2, v3

    add-int/lit8 v3, v2, 0x1

    aget-byte v2, p0, v2

    aget-byte v4, p0, v3

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    move v1, v5

    :goto_2
    add-int/2addr v3, v1

    sub-int/2addr p1, v2

    add-int/2addr p1, v1

    sub-int/2addr v2, v1

    invoke-static {p0, v3, v0, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0

    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Invalid DER encoding"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c([B)[B
    .locals 7

    array-length v0, p0

    const/4 v1, 0x2

    rem-int/2addr v0, v1

    if-nez v0, :cond_1

    array-length v0, p0

    if-eqz v0, :cond_1

    array-length v0, p0

    const/16 v2, 0x84

    if-gt v0, v2, :cond_1

    array-length v0, p0

    div-int/2addr v0, v1

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    invoke-static {v0}, Ldf/k;->o([B)[B

    move-result-object v0

    array-length v2, p0

    div-int/2addr v2, v1

    array-length v3, p0

    invoke-static {p0, v2, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p0

    invoke-static {p0}, Ldf/k;->o([B)[B

    move-result-object p0

    array-length v2, v0

    add-int/lit8 v2, v2, 0x4

    array-length v3, p0

    add-int/2addr v2, v3

    const/16 v3, 0x80

    const/16 v4, 0x30

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-lt v2, v3, :cond_0

    add-int/lit8 v3, v2, 0x3

    new-array v3, v3, [B

    aput-byte v4, v3, v5

    const/16 v4, -0x7f

    aput-byte v4, v3, v6

    int-to-byte v2, v2

    aput-byte v2, v3, v1

    const/4 v2, 0x3

    goto :goto_0

    :cond_0
    add-int/lit8 v3, v2, 0x2

    new-array v3, v3, [B

    aput-byte v4, v3, v5

    int-to-byte v2, v2

    aput-byte v2, v3, v6

    move v2, v1

    :goto_0
    add-int/lit8 v4, v2, 0x1

    aput-byte v1, v3, v2

    add-int/2addr v2, v1

    array-length v6, v0

    int-to-byte v6, v6

    aput-byte v6, v3, v4

    array-length v4, v0

    invoke-static {v0, v5, v3, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v0, v0

    add-int/2addr v2, v0

    add-int/lit8 v0, v2, 0x1

    aput-byte v1, v3, v2

    add-int/2addr v2, v1

    array-length v1, p0

    int-to-byte v1, v1

    aput-byte v1, v3, v0

    array-length v0, p0

    invoke-static {p0, v5, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v3

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Invalid IEEE_P1363 encoding"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static d(Ljava/security/spec/EllipticCurve;)I
    .locals 1

    invoke-static {p0}, Ldf/k;->j(Ljava/security/spec/EllipticCurve;)Ljava/math/BigInteger;

    move-result-object p0

    sget-object v0, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I

    move-result p0

    return p0
.end method

.method public static e(Ljava/security/spec/EllipticCurve;)I
    .locals 0

    invoke-static {p0}, Ldf/k;->d(Ljava/security/spec/EllipticCurve;)I

    move-result p0

    add-int/lit8 p0, p0, 0x7

    div-int/lit8 p0, p0, 0x8

    return p0
.end method

.method public static f(Ljava/security/spec/ECParameterSpec;)Ljava/security/KeyPair;
    .locals 2

    sget-object v0, Ldf/m;->g:Ldf/m;

    const-string v1, "EC"

    invoke-virtual {v0, v1}, Ldf/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/KeyPairGenerator;

    invoke-virtual {v0, p0}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {v0}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ldf/k$b;)Ljava/security/spec/ECParameterSpec;
    .locals 3

    sget-object v0, Ldf/k$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-static {}, Ldf/k;->m()Ljava/security/spec/ECParameterSpec;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/NoSuchAlgorithmException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "curve not implemented:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/NoSuchAlgorithmException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {}, Ldf/k;->l()Ljava/security/spec/ECParameterSpec;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-static {}, Ldf/k;->k()Ljava/security/spec/ECParameterSpec;

    move-result-object p0

    return-object p0
.end method

.method public static h(Ldf/k$b;[B)Ljava/security/interfaces/ECPrivateKey;
    .locals 1

    invoke-static {p0}, Ldf/k;->g(Ldf/k$b;)Ljava/security/spec/ECParameterSpec;

    move-result-object p0

    invoke-static {p1}, Lwe/a;->a([B)Ljava/math/BigInteger;

    move-result-object p1

    new-instance v0, Ljava/security/spec/ECPrivateKeySpec;

    invoke-direct {v0, p1, p0}, Ljava/security/spec/ECPrivateKeySpec;-><init>(Ljava/math/BigInteger;Ljava/security/spec/ECParameterSpec;)V

    sget-object p0, Ldf/m;->h:Ldf/m;

    const-string p1, "EC"

    invoke-virtual {p0, p1}, Ldf/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/security/KeyFactory;

    invoke-virtual {p0, v0}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object p0

    check-cast p0, Ljava/security/interfaces/ECPrivateKey;

    return-object p0
.end method

.method public static i(Ldf/k$b;[B[B)Ljava/security/interfaces/ECPublicKey;
    .locals 2

    invoke-static {p0}, Ldf/k;->g(Ldf/k$b;)Ljava/security/spec/ECParameterSpec;

    move-result-object p0

    new-instance v0, Ljava/math/BigInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    new-instance p1, Ljava/math/BigInteger;

    invoke-direct {p1, v1, p2}, Ljava/math/BigInteger;-><init>(I[B)V

    new-instance p2, Ljava/security/spec/ECPoint;

    invoke-direct {p2, v0, p1}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {p0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object p1

    invoke-static {p2, p1}, Lwe/g;->b(Ljava/security/spec/ECPoint;Ljava/security/spec/EllipticCurve;)V

    new-instance p1, Ljava/security/spec/ECPublicKeySpec;

    invoke-direct {p1, p2, p0}, Ljava/security/spec/ECPublicKeySpec;-><init>(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)V

    sget-object p0, Ldf/m;->h:Ldf/m;

    const-string p2, "EC"

    invoke-virtual {p0, p2}, Ldf/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/security/KeyFactory;

    invoke-virtual {p0, p1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p0

    check-cast p0, Ljava/security/interfaces/ECPublicKey;

    return-object p0
.end method

.method public static j(Ljava/security/spec/EllipticCurve;)Ljava/math/BigInteger;
    .locals 0

    invoke-static {p0}, Lwe/g;->d(Ljava/security/spec/EllipticCurve;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method

.method public static k()Ljava/security/spec/ECParameterSpec;
    .locals 1

    sget-object v0, Lwe/g;->a:Ljava/security/spec/ECParameterSpec;

    return-object v0
.end method

.method public static l()Ljava/security/spec/ECParameterSpec;
    .locals 1

    sget-object v0, Lwe/g;->b:Ljava/security/spec/ECParameterSpec;

    return-object v0
.end method

.method public static m()Ljava/security/spec/ECParameterSpec;
    .locals 1

    sget-object v0, Lwe/g;->c:Ljava/security/spec/ECParameterSpec;

    return-object v0
.end method

.method public static n([B)Z
    .locals 11

    array-length v0, p0

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    aget-byte v0, p0, v2

    const/16 v1, 0x30

    if-eq v0, v1, :cond_1

    return v2

    :cond_1
    const/4 v0, 0x1

    aget-byte v1, p0, v0

    and-int/lit16 v1, v1, 0xff

    const/16 v3, 0x81

    const/16 v4, 0x80

    const/4 v5, 0x2

    if-ne v1, v3, :cond_3

    aget-byte v1, p0, v5

    and-int/lit16 v1, v1, 0xff

    if-ge v1, v4, :cond_2

    return v2

    :cond_2
    move v3, v5

    goto :goto_0

    :cond_3
    if-eq v1, v4, :cond_10

    if-le v1, v3, :cond_4

    goto :goto_1

    :cond_4
    move v3, v0

    :goto_0
    array-length v6, p0

    sub-int/2addr v6, v0

    sub-int/2addr v6, v3

    if-eq v1, v6, :cond_5

    return v2

    :cond_5
    add-int/lit8 v1, v3, 0x1

    aget-byte v1, p0, v1

    if-eq v1, v5, :cond_6

    return v2

    :cond_6
    add-int/lit8 v1, v3, 0x2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v6, v3, 0x3

    add-int/2addr v6, v1

    add-int/lit8 v7, v6, 0x1

    array-length v8, p0

    if-lt v7, v8, :cond_7

    return v2

    :cond_7
    if-nez v1, :cond_8

    return v2

    :cond_8
    add-int/lit8 v8, v3, 0x3

    aget-byte v9, p0, v8

    and-int/lit16 v10, v9, 0xff

    if-lt v10, v4, :cond_9

    return v2

    :cond_9
    if-le v1, v0, :cond_a

    if-nez v9, :cond_a

    add-int/lit8 v9, v3, 0x4

    aget-byte v9, p0, v9

    and-int/lit16 v9, v9, 0xff

    if-ge v9, v4, :cond_a

    return v2

    :cond_a
    add-int/2addr v8, v1

    aget-byte v8, p0, v8

    if-eq v8, v5, :cond_b

    return v2

    :cond_b
    aget-byte v7, p0, v7

    and-int/lit16 v7, v7, 0xff

    add-int/2addr v6, v5

    add-int/2addr v6, v7

    array-length v5, p0

    if-eq v6, v5, :cond_c

    return v2

    :cond_c
    if-nez v7, :cond_d

    return v2

    :cond_d
    add-int/lit8 v5, v3, 0x5

    add-int/2addr v5, v1

    aget-byte v5, p0, v5

    and-int/lit16 v6, v5, 0xff

    if-lt v6, v4, :cond_e

    return v2

    :cond_e
    if-le v7, v0, :cond_f

    if-nez v5, :cond_f

    add-int/lit8 v3, v3, 0x6

    add-int/2addr v3, v1

    aget-byte p0, p0, v3

    and-int/lit16 p0, p0, 0xff

    if-ge p0, v4, :cond_f

    return v2

    :cond_f
    return v0

    :cond_10
    :goto_1
    return v2
.end method

.method public static o([B)[B
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    aget-byte v2, p0, v1

    if-nez v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    array-length v2, p0

    const/4 v3, 0x1

    if-ne v1, v2, :cond_1

    array-length v1, p0

    sub-int/2addr v1, v3

    :cond_1
    aget-byte v2, p0, v1

    const/16 v4, 0x80

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_2

    move v0, v3

    :cond_2
    array-length v2, p0

    sub-int/2addr v2, v1

    add-int/2addr v2, v0

    new-array v2, v2, [B

    array-length v3, p0

    sub-int/2addr v3, v1

    invoke-static {p0, v1, v2, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
