.class public final Ldf/w$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/a0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/security/interfaces/RSAPublicKey;

.field public final b:Ldf/o;

.field public final c:[B

.field public final d:[B


# direct methods
.method public constructor <init>(Ljava/security/interfaces/RSAPublicKey;Ldf/o;[B[B)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Lue/b;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    invoke-static {p2}, Ldf/a0;->e(Ldf/o;)V

    .line 5
    invoke-interface {p1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    invoke-static {v0}, Ldf/a0;->c(I)V

    .line 6
    invoke-interface {p1}, Ljava/security/interfaces/RSAPublicKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v0}, Ldf/a0;->d(Ljava/math/BigInteger;)V

    .line 7
    iput-object p1, p0, Ldf/w$b;->a:Ljava/security/interfaces/RSAPublicKey;

    .line 8
    iput-object p2, p0, Ldf/w$b;->b:Ldf/o;

    .line 9
    iput-object p3, p0, Ldf/w$b;->c:[B

    .line 10
    iput-object p4, p0, Ldf/w$b;->d:[B

    return-void

    .line 11
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(Ljava/security/interfaces/RSAPublicKey;Ldf/o;[B[BLdf/w$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Ldf/w$b;-><init>(Ljava/security/interfaces/RSAPublicKey;Ldf/o;[B[B)V

    return-void
.end method

.method private c([B[B)V
    .locals 4

    iget-object v0, p0, Ldf/w$b;->a:Ljava/security/interfaces/RSAPublicKey;

    invoke-interface {v0}, Ljava/security/interfaces/RSAPublicKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object v0

    iget-object v1, p0, Ldf/w$b;->a:Ljava/security/interfaces/RSAPublicKey;

    invoke-interface {v1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->bitLength()I

    move-result v2

    add-int/lit8 v2, v2, 0x7

    div-int/lit8 v2, v2, 0x8

    array-length v3, p1

    if-ne v2, v3, :cond_2

    invoke-static {p1}, Ldf/z;->a([B)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v3

    if-gez v3, :cond_1

    invoke-virtual {p1, v0, v1}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {p1, v2}, Ldf/z;->b(Ljava/math/BigInteger;I)[B

    move-result-object p1

    iget-object v0, p0, Ldf/w$b;->b:Ldf/o;

    invoke-virtual {p0, p2, v2, v0}, Ldf/w$b;->b([BILdf/o;)[B

    move-result-object p2

    invoke-static {p1, p2}, Ldf/e;->b([B[B)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "invalid signature"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "signature out of range"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "invalid signature\'s length"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a([B[B)V
    .locals 2

    iget-object v0, p0, Ldf/w$b;->c:[B

    array-length v1, v0

    if-nez v1, :cond_0

    invoke-direct {p0, p1, p2}, Ldf/w$b;->c([B[B)V

    return-void

    :cond_0
    invoke-static {v0, p1}, Lwe/s0;->e([B[B)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ldf/w$b;->c:[B

    array-length v0, v0

    array-length v1, p1

    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-direct {p0, p1, p2}, Ldf/w$b;->c([B[B)V

    return-void

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Invalid signature (output prefix mismatch)"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b([BILdf/o;)[B
    .locals 7

    invoke-static {p3}, Ldf/a0;->e(Ldf/o;)V

    sget-object v0, Ldf/m;->e:Ldf/m;

    iget-object v1, p0, Ldf/w$b;->b:Ldf/o;

    invoke-static {v1}, Ldf/z;->e(Ldf/o;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldf/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/MessageDigest;

    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->update([B)V

    iget-object p1, p0, Ldf/w$b;->d:[B

    array-length v1, p1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->update([B)V

    :cond_0
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    invoke-virtual {p0, p3}, Ldf/w$b;->d(Ldf/o;)[B

    move-result-object p3

    array-length v0, p3

    array-length v1, p1

    add-int/2addr v0, v1

    add-int/lit8 v1, v0, 0xb

    if-lt p2, v1, :cond_2

    new-array v1, p2, [B

    const/4 v2, 0x0

    aput-byte v2, v1, v2

    const/4 v3, 0x1

    aput-byte v3, v1, v3

    const/4 v3, 0x2

    move v4, v2

    :goto_0
    sub-int v5, p2, v0

    add-int/lit8 v5, v5, -0x3

    if-ge v4, v5, :cond_1

    add-int/lit8 v5, v3, 0x1

    const/4 v6, -0x1

    aput-byte v6, v1, v3

    add-int/lit8 v4, v4, 0x1

    move v3, v5

    goto :goto_0

    :cond_1
    add-int/lit8 p2, v3, 0x1

    aput-byte v2, v1, v3

    array-length v0, p3

    invoke-static {p3, v2, v1, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length p3, p3

    add-int/2addr p2, p3

    array-length p3, p1

    invoke-static {p1, v2, v1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "intended encoded message length too short"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d(Ldf/o;)[B
    .locals 3

    sget-object v0, Ldf/w$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const-string p1, "3051300d060960864801650304020305000440"

    invoke-static {p1}, Ldf/p;->a(Ljava/lang/String;)[B

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported hash "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const-string p1, "3041300d060960864801650304020205000430"

    invoke-static {p1}, Ldf/p;->a(Ljava/lang/String;)[B

    move-result-object p1

    return-object p1

    :cond_2
    const-string p1, "3031300d060960864801650304020105000420"

    invoke-static {p1}, Ldf/p;->a(Ljava/lang/String;)[B

    move-result-object p1

    return-object p1
.end method
