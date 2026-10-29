.class public final Lcf/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/a0;


# static fields
.field public static final g:Lue/b$b;

.field public static final h:[B

.field public static final i:[B


# instance fields
.field public final a:Ljava/security/interfaces/RSAPublicKey;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/security/spec/PSSParameterSpec;

.field public final d:[B

.field public final e:[B

.field public final f:Ljava/security/Provider;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lue/b$b;->b:Lue/b$b;

    sput-object v0, Lcf/g0;->g:Lue/b$b;

    const/4 v0, 0x0

    new-array v1, v0, [B

    sput-object v1, Lcf/g0;->h:[B

    const/4 v1, 0x1

    new-array v1, v1, [B

    aput-byte v0, v1, v0

    sput-object v1, Lcf/g0;->i:[B

    return-void
.end method

.method public constructor <init>(Ljava/security/interfaces/RSAPublicKey;Lbf/r0$c;Lbf/r0$c;I[B[BLjava/security/Provider;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcf/g0;->g:Lue/b$b;

    invoke-virtual {v0}, Lue/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    invoke-static {v0}, Ldf/a0;->c(I)V

    invoke-interface {p1}, Ljava/security/interfaces/RSAPublicKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v0}, Ldf/a0;->d(Ljava/math/BigInteger;)V

    iput-object p1, p0, Lcf/g0;->a:Ljava/security/interfaces/RSAPublicKey;

    invoke-static {p2}, Lcf/g0;->d(Lbf/r0$c;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcf/g0;->b:Ljava/lang/String;

    invoke-static {p2, p3, p4}, Lcf/g0;->g(Lbf/r0$c;Lbf/r0$c;I)Ljava/security/spec/PSSParameterSpec;

    move-result-object p1

    iput-object p1, p0, Lcf/g0;->c:Ljava/security/spec/PSSParameterSpec;

    iput-object p5, p0, Lcf/g0;->d:[B

    iput-object p6, p0, Lcf/g0;->e:[B

    iput-object p7, p0, Lcf/g0;->f:Ljava/security/Provider;

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "sigHash and mgf1Hash must be the same"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static b()Ljava/security/Provider;
    .locals 2

    invoke-static {}, Lwe/s0;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lwe/s0;->c()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x17

    if-gt v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {}, Lwe/c;->a()Ljava/security/Provider;

    move-result-object v0

    return-object v0
.end method

.method public static c(Lbf/t0;)Lpe/a0;
    .locals 8

    invoke-static {}, Lcf/g0;->b()Ljava/security/Provider;

    move-result-object v7

    if-eqz v7, :cond_1

    const-string v0, "RSA"

    invoke-static {v0, v7}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyFactory;

    move-result-object v0

    new-instance v1, Ljava/security/spec/RSAPublicKeySpec;

    invoke-virtual {p0}, Lbf/t0;->d()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p0}, Lbf/t0;->e()Lbf/r0;

    move-result-object v3

    invoke-virtual {v3}, Lbf/r0;->e()Ljava/math/BigInteger;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/security/spec/RSAPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/security/interfaces/RSAPublicKey;

    invoke-virtual {p0}, Lbf/t0;->e()Lbf/r0;

    move-result-object v0

    move-object v2, v0

    new-instance v0, Lcf/g0;

    move-object v3, v2

    invoke-virtual {v3}, Lbf/r0;->g()Lbf/r0$c;

    move-result-object v2

    move-object v4, v3

    invoke-virtual {v4}, Lbf/r0;->c()Lbf/r0$c;

    move-result-object v3

    invoke-virtual {v4}, Lbf/r0;->f()I

    move-result v4

    invoke-virtual {p0}, Lbf/t0;->b()Lef/a;

    move-result-object v5

    invoke-virtual {v5}, Lef/a;->d()[B

    move-result-object v5

    invoke-virtual {p0}, Lbf/t0;->e()Lbf/r0;

    move-result-object p0

    invoke-virtual {p0}, Lbf/r0;->h()Lbf/r0$d;

    move-result-object p0

    sget-object v6, Lbf/r0$d;->d:Lbf/r0$d;

    invoke-virtual {p0, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lcf/g0;->i:[B

    :goto_0
    move-object v6, p0

    goto :goto_1

    :cond_0
    sget-object p0, Lcf/g0;->h:[B

    goto :goto_0

    :goto_1
    invoke-direct/range {v0 .. v7}, Lcf/g0;-><init>(Ljava/security/interfaces/RSAPublicKey;Lbf/r0$c;Lbf/r0$c;I[B[BLjava/security/Provider;)V

    return-object v0

    :cond_1
    new-instance p0, Ljava/security/NoSuchProviderException;

    const-string v0, "RSA SSA PSS using Conscrypt is not supported."

    invoke-direct {p0, v0}, Ljava/security/NoSuchProviderException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static d(Lbf/r0$c;)Ljava/lang/String;
    .locals 3

    sget-object v0, Lbf/r0$c;->b:Lbf/r0$c;

    if-ne p0, v0, :cond_0

    const-string p0, "SHA256withRSA/PSS"

    return-object p0

    :cond_0
    sget-object v0, Lbf/r0$c;->c:Lbf/r0$c;

    if-ne p0, v0, :cond_1

    const-string p0, "SHA384withRSA/PSS"

    return-object p0

    :cond_1
    sget-object v0, Lbf/r0$c;->d:Lbf/r0$c;

    if-ne p0, v0, :cond_2

    const-string p0, "SHA512withRSA/PSS"

    return-object p0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported hash: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static e(Lbf/r0$c;)Ljava/lang/String;
    .locals 3

    sget-object v0, Lbf/r0$c;->b:Lbf/r0$c;

    if-ne p0, v0, :cond_0

    const-string p0, "SHA-256"

    return-object p0

    :cond_0
    sget-object v0, Lbf/r0$c;->c:Lbf/r0$c;

    if-ne p0, v0, :cond_1

    const-string p0, "SHA-384"

    return-object p0

    :cond_1
    sget-object v0, Lbf/r0$c;->d:Lbf/r0$c;

    if-ne p0, v0, :cond_2

    const-string p0, "SHA-512"

    return-object p0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported MD hash: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static f(Lbf/r0$c;)Ljava/security/spec/MGF1ParameterSpec;
    .locals 3

    sget-object v0, Lbf/r0$c;->b:Lbf/r0$c;

    if-ne p0, v0, :cond_0

    sget-object p0, Ljava/security/spec/MGF1ParameterSpec;->SHA256:Ljava/security/spec/MGF1ParameterSpec;

    return-object p0

    :cond_0
    sget-object v0, Lbf/r0$c;->c:Lbf/r0$c;

    if-ne p0, v0, :cond_1

    sget-object p0, Ljava/security/spec/MGF1ParameterSpec;->SHA384:Ljava/security/spec/MGF1ParameterSpec;

    return-object p0

    :cond_1
    sget-object v0, Lbf/r0$c;->d:Lbf/r0$c;

    if-ne p0, v0, :cond_2

    sget-object p0, Ljava/security/spec/MGF1ParameterSpec;->SHA512:Ljava/security/spec/MGF1ParameterSpec;

    return-object p0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported MGF1 hash: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static g(Lbf/r0$c;Lbf/r0$c;I)Ljava/security/spec/PSSParameterSpec;
    .locals 6

    new-instance v0, Ljava/security/spec/PSSParameterSpec;

    invoke-static {p0}, Lcf/g0;->e(Lbf/r0$c;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lcf/g0;->f(Lbf/r0$c;)Ljava/security/spec/MGF1ParameterSpec;

    move-result-object v3

    const/4 v5, 0x1

    const-string v2, "MGF1"

    move v4, p2

    invoke-direct/range {v0 .. v5}, Ljava/security/spec/PSSParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;II)V

    return-object v0
.end method


# virtual methods
.method public a([B[B)V
    .locals 3

    iget-object v0, p0, Lcf/g0;->d:[B

    invoke-static {v0, p1}, Lwe/s0;->e([B[B)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcf/g0;->b:Ljava/lang/String;

    iget-object v1, p0, Lcf/g0;->f:Ljava/security/Provider;

    invoke-static {v0, v1}, Ljava/security/Signature;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/Signature;

    move-result-object v0

    iget-object v1, p0, Lcf/g0;->a:Ljava/security/interfaces/RSAPublicKey;

    invoke-virtual {v0, v1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    iget-object v1, p0, Lcf/g0;->c:Ljava/security/spec/PSSParameterSpec;

    invoke-virtual {v0, v1}, Ljava/security/Signature;->setParameter(Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {v0, p2}, Ljava/security/Signature;->update([B)V

    iget-object p2, p0, Lcf/g0;->e:[B

    array-length v1, p2

    if-lez v1, :cond_0

    invoke-virtual {v0, p2}, Ljava/security/Signature;->update([B)V

    :cond_0
    iget-object p2, p0, Lcf/g0;->d:[B

    array-length v1, p2

    array-length v2, p1

    array-length p2, p2

    sub-int/2addr v2, p2

    invoke-virtual {v0, p1, v1, v2}, Ljava/security/Signature;->verify([BII)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "signature verification failed"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Invalid signature (output prefix mismatch)"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
