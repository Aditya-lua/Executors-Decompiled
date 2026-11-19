.class public final Lef/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lre/a0;


# static fields
.field public static final f:Lwe/b$b;

.field public static final g:[B

.field public static final h:[B


# instance fields
.field public final a:Ljava/security/interfaces/RSAPublicKey;

.field public final b:Ljava/lang/String;

.field public final c:[B

.field public final d:[B

.field public final e:Ljava/security/Provider;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lwe/b$b;->b:Lwe/b$b;

    sput-object v0, Lef/x;->f:Lwe/b$b;

    const/4 v0, 0x0

    new-array v1, v0, [B

    sput-object v1, Lef/x;->g:[B

    const/4 v1, 0x1

    new-array v1, v1, [B

    aput-byte v0, v1, v0

    sput-object v1, Lef/x;->h:[B

    return-void
.end method

.method public constructor <init>(Ljava/security/interfaces/RSAPublicKey;Ldf/j0$c;[B[BLjava/security/Provider;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lef/x;->f:Lwe/b$b;

    invoke-virtual {v0}, Lwe/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    invoke-static {v0}, Lff/a0;->c(I)V

    invoke-interface {p1}, Ljava/security/interfaces/RSAPublicKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v0}, Lff/a0;->d(Ljava/math/BigInteger;)V

    iput-object p1, p0, Lef/x;->a:Ljava/security/interfaces/RSAPublicKey;

    invoke-static {p2}, Lef/x;->d(Ldf/j0$c;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lef/x;->b:Ljava/lang/String;

    iput-object p3, p0, Lef/x;->c:[B

    iput-object p4, p0, Lef/x;->d:[B

    iput-object p5, p0, Lef/x;->e:Ljava/security/Provider;

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static b()Ljava/security/Provider;
    .locals 2

    invoke-static {}, Lye/s0;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lye/s0;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x15

    if-gt v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {}, Lye/c;->a()Ljava/security/Provider;

    move-result-object v0

    return-object v0
.end method

.method public static c(Ldf/l0;)Lre/a0;
    .locals 6

    invoke-static {}, Lef/x;->b()Ljava/security/Provider;

    move-result-object v5

    if-eqz v5, :cond_1

    const-string v0, "RSA"

    invoke-static {v0, v5}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyFactory;

    move-result-object v0

    new-instance v1, Ljava/security/spec/RSAPublicKeySpec;

    invoke-virtual {p0}, Ldf/l0;->d()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p0}, Ldf/l0;->e()Ldf/j0;

    move-result-object v3

    invoke-virtual {v3}, Ldf/j0;->e()Ljava/math/BigInteger;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/security/spec/RSAPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/security/interfaces/RSAPublicKey;

    new-instance v0, Lef/x;

    invoke-virtual {p0}, Ldf/l0;->e()Ldf/j0;

    move-result-object v2

    invoke-virtual {v2}, Ldf/j0;->c()Ldf/j0$c;

    move-result-object v2

    invoke-virtual {p0}, Ldf/l0;->b()Lgf/a;

    move-result-object v3

    invoke-virtual {v3}, Lgf/a;->d()[B

    move-result-object v3

    invoke-virtual {p0}, Ldf/l0;->e()Ldf/j0;

    move-result-object p0

    invoke-virtual {p0}, Ldf/j0;->f()Ldf/j0$d;

    move-result-object p0

    sget-object v4, Ldf/j0$d;->d:Ldf/j0$d;

    invoke-virtual {p0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lef/x;->h:[B

    :goto_0
    move-object v4, p0

    goto :goto_1

    :cond_0
    sget-object p0, Lef/x;->g:[B

    goto :goto_0

    :goto_1
    invoke-direct/range {v0 .. v5}, Lef/x;-><init>(Ljava/security/interfaces/RSAPublicKey;Ldf/j0$c;[B[BLjava/security/Provider;)V

    return-object v0

    :cond_1
    new-instance p0, Ljava/security/NoSuchProviderException;

    const-string v0, "RSA-PKCS1.5 using Conscrypt is not supported."

    invoke-direct {p0, v0}, Ljava/security/NoSuchProviderException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static d(Ldf/j0$c;)Ljava/lang/String;
    .locals 1

    sget-object v0, Ldf/j0$c;->b:Ldf/j0$c;

    if-ne p0, v0, :cond_0

    const-string p0, "SHA256withRSA"

    return-object p0

    :cond_0
    sget-object v0, Ldf/j0$c;->c:Ldf/j0$c;

    if-ne p0, v0, :cond_1

    const-string p0, "SHA384withRSA"

    return-object p0

    :cond_1
    sget-object v0, Ldf/j0$c;->d:Ldf/j0$c;

    if-ne p0, v0, :cond_2

    const-string p0, "SHA512withRSA"

    return-object p0

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "unknown hash type"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a([B[B)V
    .locals 2

    iget-object v0, p0, Lef/x;->c:[B

    invoke-static {v0, p1}, Lye/s0;->e([B[B)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lef/x;->b:Ljava/lang/String;

    iget-object v1, p0, Lef/x;->e:Ljava/security/Provider;

    invoke-static {v0, v1}, Ljava/security/Signature;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/Signature;

    move-result-object v0

    iget-object v1, p0, Lef/x;->a:Ljava/security/interfaces/RSAPublicKey;

    invoke-virtual {v0, v1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    invoke-virtual {v0, p2}, Ljava/security/Signature;->update([B)V

    iget-object p2, p0, Lef/x;->d:[B

    array-length v1, p2

    if-lez v1, :cond_0

    invoke-virtual {v0, p2}, Ljava/security/Signature;->update([B)V

    :cond_0
    :try_start_0
    iget-object p2, p0, Lef/x;->c:[B

    array-length p2, p2

    array-length v1, p1

    invoke-static {p1, p2, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/security/Signature;->verify([B)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    return-void

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Invalid signature"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Invalid signature (output prefix mismatch)"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
