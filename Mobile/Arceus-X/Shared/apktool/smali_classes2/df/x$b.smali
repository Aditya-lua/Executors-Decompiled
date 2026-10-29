.class public final Ldf/x$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/security/interfaces/RSAPrivateCrtKey;

.field public final b:Ljava/security/interfaces/RSAPublicKey;

.field public final c:Ldf/o;

.field public final d:Ldf/o;

.field public final e:I

.field public final f:[B

.field public final g:[B


# direct methods
.method public constructor <init>(Ljava/security/interfaces/RSAPrivateCrtKey;Ldf/o;Ldf/o;I[B[B)V
    .locals 3

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
    invoke-interface {p1}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v0}, Ldf/a0;->d(Ljava/math/BigInteger;)V

    .line 8
    iput-object p1, p0, Ldf/x$b;->a:Ljava/security/interfaces/RSAPrivateCrtKey;

    .line 9
    sget-object v0, Ldf/m;->h:Ldf/m;

    const-string v1, "RSA"

    invoke-virtual {v0, v1}, Ldf/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/KeyFactory;

    .line 10
    new-instance v1, Ljava/security/spec/RSAPublicKeySpec;

    .line 11
    invoke-interface {p1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v2

    invoke-interface {p1}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Ljava/security/spec/RSAPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p1

    check-cast p1, Ljava/security/interfaces/RSAPublicKey;

    iput-object p1, p0, Ldf/x$b;->b:Ljava/security/interfaces/RSAPublicKey;

    .line 12
    iput-object p2, p0, Ldf/x$b;->c:Ldf/o;

    .line 13
    iput-object p3, p0, Ldf/x$b;->d:Ldf/o;

    .line 14
    iput p4, p0, Ldf/x$b;->e:I

    .line 15
    iput-object p5, p0, Ldf/x$b;->f:[B

    .line 16
    iput-object p6, p0, Ldf/x$b;->g:[B

    return-void

    .line 17
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "sigHash and mgf1Hash must be the same"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(Ljava/security/interfaces/RSAPrivateCrtKey;Ldf/o;Ldf/o;I[B[BLdf/x$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Ldf/x$b;-><init>(Ljava/security/interfaces/RSAPrivateCrtKey;Ldf/o;Ldf/o;I[B[B)V

    return-void
.end method

.method private c([B)[B
    .locals 1

    iget-object v0, p0, Ldf/x$b;->b:Ljava/security/interfaces/RSAPublicKey;

    invoke-interface {v0}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, p1, v0}, Ldf/x$b;->b([BI)[B

    move-result-object p1

    invoke-virtual {p0, p1}, Ldf/x$b;->d([B)[B

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a([B)[B
    .locals 2

    invoke-direct {p0, p1}, Ldf/x$b;->c([B)[B

    move-result-object p1

    iget-object v0, p0, Ldf/x$b;->f:[B

    array-length v1, v0

    if-nez v1, :cond_0

    return-object p1

    :cond_0
    filled-new-array {v0, p1}, [[B

    move-result-object p1

    invoke-static {p1}, Ldf/e;->a([[B)[B

    move-result-object p1

    return-object p1
.end method

.method public final b([BI)[B
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p2

    iget-object v2, v0, Ldf/x$b;->c:Ldf/o;

    invoke-static {v2}, Ldf/a0;->e(Ldf/o;)V

    sget-object v2, Ldf/m;->e:Ldf/m;

    iget-object v3, v0, Ldf/x$b;->c:Ldf/o;

    invoke-static {v3}, Ldf/z;->e(Ldf/o;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldf/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/MessageDigest;

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/security/MessageDigest;->update([B)V

    iget-object v3, v0, Ldf/x$b;->g:[B

    array-length v4, v3

    if-eqz v4, :cond_0

    invoke-virtual {v2, v3}, Ljava/security/MessageDigest;->update([B)V

    :cond_0
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v3

    invoke-virtual {v2}, Ljava/security/MessageDigest;->getDigestLength()I

    move-result v4

    add-int/lit8 v5, v1, -0x1

    const/16 v6, 0x8

    div-int/2addr v5, v6

    const/4 v7, 0x1

    add-int/2addr v5, v7

    iget v8, v0, Ldf/x$b;->e:I

    add-int v9, v4, v8

    add-int/lit8 v9, v9, 0x2

    if-lt v5, v9, :cond_3

    invoke-static {v8}, Ldf/u;->a(I)[B

    move-result-object v8

    add-int/lit8 v9, v4, 0x8

    iget v10, v0, Ldf/x$b;->e:I

    add-int/2addr v10, v9

    new-array v10, v10, [B

    const/4 v11, 0x0

    invoke-static {v3, v11, v10, v6, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v3, v8

    invoke-static {v8, v11, v10, v9, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {v2, v10}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v2

    sub-int v3, v5, v4

    sub-int/2addr v3, v7

    new-array v6, v3, [B

    iget v9, v0, Ldf/x$b;->e:I

    sub-int v10, v5, v9

    sub-int/2addr v10, v4

    add-int/lit8 v10, v10, -0x2

    aput-byte v7, v6, v10

    sub-int v9, v5, v9

    sub-int/2addr v9, v4

    sub-int/2addr v9, v7

    array-length v10, v8

    invoke-static {v8, v11, v6, v9, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v8, v0, Ldf/x$b;->d:Ldf/o;

    invoke-static {v2, v3, v8}, Ldf/z;->d([BILdf/o;)[B

    move-result-object v8

    new-array v9, v3, [B

    move v10, v11

    :goto_0
    if-ge v10, v3, :cond_1

    aget-byte v12, v6, v10

    aget-byte v13, v8, v10

    xor-int/2addr v12, v13

    int-to-byte v12, v12

    aput-byte v12, v9, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_1
    move v6, v11

    :goto_1
    int-to-long v12, v6

    int-to-long v14, v5

    const-wide/16 v16, 0x8

    mul-long v14, v14, v16

    move/from16 p1, v7

    int-to-long v7, v1

    sub-long/2addr v14, v7

    cmp-long v7, v12, v14

    if-gez v7, :cond_2

    div-int/lit8 v7, v6, 0x8

    rem-int/lit8 v8, v6, 0x8

    rsub-int/lit8 v8, v8, 0x7

    aget-byte v10, v9, v7

    shl-int v8, p1, v8

    not-int v8, v8

    and-int/2addr v8, v10

    int-to-byte v8, v8

    aput-byte v8, v9, v7

    add-int/lit8 v6, v6, 0x1

    move/from16 v7, p1

    goto :goto_1

    :cond_2
    add-int/2addr v4, v3

    add-int/lit8 v1, v4, 0x1

    new-array v1, v1, [B

    invoke-static {v9, v11, v1, v11, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v5, v2

    invoke-static {v2, v11, v1, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v2, -0x44

    aput-byte v2, v1, v4

    return-object v1

    :cond_3
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "encoding error"

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final d([B)[B
    .locals 5

    sget-object v0, Ldf/m;->b:Ldf/m;

    const-string v1, "RSA/ECB/NOPADDING"

    invoke-virtual {v0, v1}, Ldf/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljavax/crypto/Cipher;

    const/4 v3, 0x2

    iget-object v4, p0, Ldf/x$b;->a:Ljava/security/interfaces/RSAPrivateCrtKey;

    invoke-virtual {v2, v3, v4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    invoke-virtual {v2, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v2

    invoke-virtual {v0, v1}, Ldf/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/crypto/Cipher;

    iget-object v1, p0, Ldf/x$b;->b:Ljava/security/interfaces/RSAPublicKey;

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    invoke-virtual {v0, v2}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    new-instance v1, Ljava/math/BigInteger;

    invoke-direct {v1, v3, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    new-instance p1, Ljava/math/BigInteger;

    invoke-direct {p1, v3, v0}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-virtual {v1, p1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object v2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Security bug: RSA signature computation error"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
