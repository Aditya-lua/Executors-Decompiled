.class public final Ldf/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/z;


# static fields
.field public static final f:Lue/b$b;

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

    sget-object v0, Lue/b$b;->b:Lue/b$b;

    sput-object v0, Ldf/v;->f:Lue/b$b;

    const/4 v0, 0x0

    new-array v1, v0, [B

    sput-object v1, Ldf/v;->g:[B

    const/4 v1, 0x1

    new-array v1, v1, [B

    aput-byte v0, v1, v0

    sput-object v1, Ldf/v;->h:[B

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Ldf/v;->i:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x1t
        0x2t
        0x3t
    .end array-data
.end method

.method public constructor <init>(Ljava/security/interfaces/RSAPrivateCrtKey;Ldf/o;[B[B)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ldf/v;->f:Lue/b$b;

    invoke-virtual {v0}, Lue/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Ldf/a0;->e(Ldf/o;)V

    invoke-interface {p1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    invoke-static {v0}, Ldf/a0;->c(I)V

    invoke-interface {p1}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v0}, Ldf/a0;->d(Ljava/math/BigInteger;)V

    iput-object p1, p0, Ldf/v;->a:Ljava/security/interfaces/RSAPrivateCrtKey;

    invoke-static {p2}, Ldf/z;->g(Ldf/o;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ldf/v;->c:Ljava/lang/String;

    sget-object p2, Ldf/m;->h:Ldf/m;

    const-string v0, "RSA"

    invoke-virtual {p2, v0}, Ldf/m;->a(Ljava/lang/String;)Ljava/lang/Object;

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

    iput-object p1, p0, Ldf/v;->b:Ljava/security/interfaces/RSAPublicKey;

    iput-object p3, p0, Ldf/v;->d:[B

    iput-object p4, p0, Ldf/v;->e:[B

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static b(Lbf/k0;)Lpe/z;
    .locals 11

    sget-object v0, Ldf/m;->h:Ldf/m;

    const-string v1, "RSA"

    invoke-virtual {v0, v1}, Ldf/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/KeyFactory;

    new-instance v1, Ljava/security/spec/RSAPrivateCrtKeySpec;

    invoke-virtual {p0}, Lbf/k0;->l()Lbf/l0;

    move-result-object v2

    invoke-virtual {v2}, Lbf/l0;->d()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p0}, Lbf/k0;->f()Lbf/j0;

    move-result-object v3

    invoke-virtual {v3}, Lbf/j0;->e()Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {p0}, Lbf/k0;->k()Lef/b;

    move-result-object v4

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v5

    invoke-virtual {v4, v5}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {p0}, Lbf/k0;->i()Lef/b;

    move-result-object v5

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v6

    invoke-virtual {v5, v6}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {p0}, Lbf/k0;->j()Lef/b;

    move-result-object v6

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v7

    invoke-virtual {v6, v7}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v6

    invoke-virtual {p0}, Lbf/k0;->g()Lef/b;

    move-result-object v7

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v8

    invoke-virtual {v7, v8}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {p0}, Lbf/k0;->h()Lef/b;

    move-result-object v8

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v9

    invoke-virtual {v8, v9}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {p0}, Lbf/k0;->e()Lef/b;

    move-result-object v9

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v10

    invoke-virtual {v9, v10}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v9

    invoke-direct/range {v1 .. v9}, Ljava/security/spec/RSAPrivateCrtKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/RSAPrivateCrtKey;

    new-instance v1, Ldf/v;

    sget-object v2, Ldf/w;->d:Lwe/h;

    invoke-virtual {p0}, Lbf/k0;->f()Lbf/j0;

    move-result-object v3

    invoke-virtual {v3}, Lbf/j0;->c()Lbf/j0$c;

    move-result-object v3

    invoke-virtual {v2, v3}, Lwe/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v2

    check-cast v2, Ldf/o;

    invoke-virtual {p0}, Lbf/b1;->b()Lef/a;

    move-result-object v3

    invoke-virtual {v3}, Lef/a;->d()[B

    move-result-object v3

    invoke-virtual {p0}, Lbf/k0;->f()Lbf/j0;

    move-result-object v4

    invoke-virtual {v4}, Lbf/j0;->f()Lbf/j0$d;

    move-result-object v4

    sget-object v5, Lbf/j0$d;->d:Lbf/j0$d;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v4, Ldf/v;->h:[B

    goto :goto_0

    :cond_0
    sget-object v4, Ldf/v;->g:[B

    :goto_0
    invoke-direct {v1, v0, v2, v3, v4}, Ldf/v;-><init>(Ljava/security/interfaces/RSAPrivateCrtKey;Ldf/o;[B[B)V

    invoke-virtual {p0}, Lbf/k0;->l()Lbf/l0;

    move-result-object p0

    invoke-static {p0}, Ldf/w;->b(Lbf/l0;)Lpe/a0;

    move-result-object p0

    :try_start_0
    sget-object v0, Ldf/v;->i:[B

    invoke-interface {v1, v0}, Lpe/z;->a([B)[B

    move-result-object v2

    invoke-interface {p0, v2, v0}, Lpe/a0;->a([B[B)V
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

    sget-object v0, Ldf/m;->d:Ldf/m;

    iget-object v1, p0, Ldf/v;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ldf/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/Signature;

    iget-object v2, p0, Ldf/v;->a:Ljava/security/interfaces/RSAPrivateCrtKey;

    invoke-virtual {v1, v2}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    invoke-virtual {v1, p1}, Ljava/security/Signature;->update([B)V

    iget-object v2, p0, Ldf/v;->e:[B

    array-length v3, v2

    if-lez v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/security/Signature;->update([B)V

    :cond_0
    invoke-virtual {v1}, Ljava/security/Signature;->sign()[B

    move-result-object v1

    iget-object v2, p0, Ldf/v;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ldf/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/Signature;

    iget-object v2, p0, Ldf/v;->b:Ljava/security/interfaces/RSAPublicKey;

    invoke-virtual {v0, v2}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    invoke-virtual {v0, p1}, Ljava/security/Signature;->update([B)V

    iget-object p1, p0, Ldf/v;->e:[B

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

    invoke-direct {p0, p1}, Ldf/v;->c([B)[B

    move-result-object p1

    iget-object v0, p0, Ldf/v;->d:[B

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
