.class public final Lff/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lre/z;


# static fields
.field public static final f:Lwe/b$b;

.field public static final g:[B

.field public static final h:[B

.field public static final i:[B


# instance fields
.field public final a:Ljava/security/interfaces/RSAPrivateCrtKey;

.field public final b:Ljava/security/interfaces/RSAPublicKey;

.field public final c:Ljava/lang/String;

.field public final d:[B

.field public final e:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lwe/b$b;->b:Lwe/b$b;

    sput-object v0, Lff/v;->f:Lwe/b$b;

    const/4 v0, 0x0

    new-array v1, v0, [B

    sput-object v1, Lff/v;->g:[B

    const/4 v1, 0x1

    new-array v1, v1, [B

    aput-byte v0, v1, v0

    sput-object v1, Lff/v;->h:[B

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lff/v;->i:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x1t
        0x2t
        0x3t
    .end array-data
.end method

.method public constructor <init>(Ljava/security/interfaces/RSAPrivateCrtKey;Lff/o;[B[B)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lff/v;->f:Lwe/b$b;

    invoke-virtual {v0}, Lwe/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Lff/a0;->e(Lff/o;)V

    invoke-interface {p1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    invoke-static {v0}, Lff/a0;->c(I)V

    invoke-interface {p1}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v0}, Lff/a0;->d(Ljava/math/BigInteger;)V

    iput-object p1, p0, Lff/v;->a:Ljava/security/interfaces/RSAPrivateCrtKey;

    invoke-static {p2}, Lff/z;->g(Lff/o;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lff/v;->c:Ljava/lang/String;

    sget-object p2, Lff/m;->h:Lff/m;

    const-string v0, "RSA"

    invoke-virtual {p2, v0}, Lff/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/security/KeyFactory;

    new-instance v0, Ljava/security/spec/RSAPublicKeySpec;

    invoke-interface {p1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v1

    invoke-interface {p1}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/security/spec/RSAPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {p2, v0}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p1

    check-cast p1, Ljava/security/interfaces/RSAPublicKey;

    iput-object p1, p0, Lff/v;->b:Ljava/security/interfaces/RSAPublicKey;

    iput-object p3, p0, Lff/v;->d:[B

    iput-object p4, p0, Lff/v;->e:[B

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static b(Ldf/k0;)Lre/z;
    .locals 11

    sget-object v0, Lff/m;->h:Lff/m;

    const-string v1, "RSA"

    invoke-virtual {v0, v1}, Lff/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/KeyFactory;

    new-instance v1, Ljava/security/spec/RSAPrivateCrtKeySpec;

    invoke-virtual {p0}, Ldf/k0;->l()Ldf/l0;

    move-result-object v2

    invoke-virtual {v2}, Ldf/l0;->d()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p0}, Ldf/k0;->f()Ldf/j0;

    move-result-object v3

    invoke-virtual {v3}, Ldf/j0;->e()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {p0}, Ldf/k0;->k()Lgf/b;

    move-result-object v4

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v5

    invoke-virtual {v4, v5}, Lgf/b;->b(Lre/d0;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {p0}, Ldf/k0;->i()Lgf/b;

    move-result-object v5

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v6

    invoke-virtual {v5, v6}, Lgf/b;->b(Lre/d0;)Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {p0}, Ldf/k0;->j()Lgf/b;

    move-result-object v6

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v7

    invoke-virtual {v6, v7}, Lgf/b;->b(Lre/d0;)Ljava/math/BigInteger;

    move-result-object v6

    invoke-virtual {p0}, Ldf/k0;->g()Lgf/b;

    move-result-object v7

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v8

    invoke-virtual {v7, v8}, Lgf/b;->b(Lre/d0;)Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {p0}, Ldf/k0;->h()Lgf/b;

    move-result-object v8

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v9

    invoke-virtual {v8, v9}, Lgf/b;->b(Lre/d0;)Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {p0}, Ldf/k0;->e()Lgf/b;

    move-result-object v9

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v10

    invoke-virtual {v9, v10}, Lgf/b;->b(Lre/d0;)Ljava/math/BigInteger;

    move-result-object v9

    invoke-direct/range {v1 .. v9}, Ljava/security/spec/RSAPrivateCrtKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/RSAPrivateCrtKey;

    new-instance v1, Lff/v;

    sget-object v2, Lff/w;->d:Lye/h;

    invoke-virtual {p0}, Ldf/k0;->f()Ldf/j0;

    move-result-object v3

    invoke-virtual {v3}, Ldf/j0;->c()Ldf/j0$c;

    move-result-object v3

    invoke-virtual {v2, v3}, Lye/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v2

    check-cast v2, Lff/o;

    invoke-virtual {p0}, Ldf/b1;->b()Lgf/a;

    move-result-object v3

    invoke-virtual {v3}, Lgf/a;->d()[B

    move-result-object v3

    invoke-virtual {p0}, Ldf/k0;->f()Ldf/j0;

    move-result-object v4

    invoke-virtual {v4}, Ldf/j0;->f()Ldf/j0$d;

    move-result-object v4

    sget-object v5, Ldf/j0$d;->d:Ldf/j0$d;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v4, Lff/v;->h:[B

    goto :goto_0

    :cond_0
    sget-object v4, Lff/v;->g:[B

    :goto_0
    invoke-direct {v1, v0, v2, v3, v4}, Lff/v;-><init>(Ljava/security/interfaces/RSAPrivateCrtKey;Lff/o;[B[B)V

    invoke-virtual {p0}, Ldf/k0;->l()Ldf/l0;

    move-result-object p0

    invoke-static {p0}, Lff/w;->b(Ldf/l0;)Lre/a0;

    move-result-object p0

    :try_start_0
    sget-object v0, Lff/v;->i:[B

    invoke-interface {v1, v0}, Lre/z;->a([B)[B

    move-result-object v2

    invoke-interface {p0, v2, v0}, Lre/a0;->a([B[B)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    move-object p0, v0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "RsaSsaPkcs1 signing with private key followed by verifying with public key failed. The key may be corrupted."

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private c([B)[B
    .locals 4

    sget-object v0, Lff/m;->d:Lff/m;

    iget-object v1, p0, Lff/v;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lff/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/Signature;

    iget-object v2, p0, Lff/v;->a:Ljava/security/interfaces/RSAPrivateCrtKey;

    invoke-virtual {v1, v2}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    invoke-virtual {v1, p1}, Ljava/security/Signature;->update([B)V

    iget-object v2, p0, Lff/v;->e:[B

    array-length v3, v2

    if-lez v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/security/Signature;->update([B)V

    :cond_0
    invoke-virtual {v1}, Ljava/security/Signature;->sign()[B

    move-result-object v1

    iget-object v2, p0, Lff/v;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lff/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/Signature;

    iget-object v2, p0, Lff/v;->b:Ljava/security/interfaces/RSAPublicKey;

    invoke-virtual {v0, v2}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    invoke-virtual {v0, p1}, Ljava/security/Signature;->update([B)V

    iget-object p1, p0, Lff/v;->e:[B

    array-length v2, p1

    if-lez v2, :cond_1

    invoke-virtual {v0, p1}, Ljava/security/Signature;->update([B)V

    :cond_1
    invoke-virtual {v0, v1}, Ljava/security/Signature;->verify([B)Z

    move-result p1

    if-eqz p1, :cond_2

    return-object v1

    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Security bug: RSA signature computation error"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a([B)[B
    .locals 2

    invoke-direct {p0, p1}, Lff/v;->c([B)[B

    move-result-object p1

    iget-object v0, p0, Lff/v;->d:[B

    array-length v1, v0

    if-nez v1, :cond_0

    return-object p1

    :cond_0
    filled-new-array {v0, p1}, [[B

    move-result-object p1

    invoke-static {p1}, Lff/e;->a([[B)[B

    move-result-object p1

    return-object p1
.end method
