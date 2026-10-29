.class public final Lcf/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpe/z;


# static fields
.field public static final g:Lue/b$b;

.field public static final h:[B

.field public static final i:[B


# instance fields
.field public final a:Ljava/security/interfaces/RSAPrivateCrtKey;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/security/spec/PSSParameterSpec;

.field public final d:[B

.field public final e:[B

.field public final f:Ljava/security/Provider;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lue/b$b;->b:Lue/b$b;

    sput-object v0, Lcf/f0;->g:Lue/b$b;

    const/4 v0, 0x0

    new-array v1, v0, [B

    sput-object v1, Lcf/f0;->h:[B

    const/4 v1, 0x1

    new-array v1, v1, [B

    aput-byte v0, v1, v0

    sput-object v1, Lcf/f0;->i:[B

    return-void
.end method

.method public constructor <init>(Ljava/security/interfaces/RSAPrivateCrtKey;Lbf/r0$c;Lbf/r0$c;I[B[BLjava/security/Provider;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcf/f0;->g:Lue/b$b;

    invoke-virtual {v0}, Lue/b$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    invoke-static {v0}, Ldf/a0;->c(I)V

    invoke-interface {p1}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v0}, Ldf/a0;->d(Ljava/math/BigInteger;)V

    iput-object p1, p0, Lcf/f0;->a:Ljava/security/interfaces/RSAPrivateCrtKey;

    invoke-static {p2}, Lcf/g0;->d(Lbf/r0$c;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcf/f0;->b:Ljava/lang/String;

    invoke-static {p2, p3, p4}, Lcf/g0;->g(Lbf/r0$c;Lbf/r0$c;I)Ljava/security/spec/PSSParameterSpec;

    move-result-object p1

    iput-object p1, p0, Lcf/f0;->c:Ljava/security/spec/PSSParameterSpec;

    iput-object p5, p0, Lcf/f0;->d:[B

    iput-object p6, p0, Lcf/f0;->e:[B

    iput-object p7, p0, Lcf/f0;->f:Ljava/security/Provider;

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static b(Lbf/s0;)Lpe/z;
    .locals 18

    invoke-static {}, Lcf/g0;->b()Ljava/security/Provider;

    move-result-object v7

    if-eqz v7, :cond_1

    const-string v0, "RSA"

    invoke-static {v0, v7}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyFactory;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lbf/s0;->f()Lbf/r0;

    move-result-object v1

    new-instance v8, Ljava/security/spec/RSAPrivateCrtKeySpec;

    invoke-virtual/range {p0 .. p0}, Lbf/s0;->l()Lbf/t0;

    move-result-object v2

    invoke-virtual {v2}, Lbf/t0;->d()Ljava/math/BigInteger;

    move-result-object v9

    invoke-virtual {v1}, Lbf/r0;->e()Ljava/math/BigInteger;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lbf/s0;->k()Lef/b;

    move-result-object v2

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lbf/s0;->i()Lef/b;

    move-result-object v2

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lbf/s0;->j()Lef/b;

    move-result-object v2

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lbf/s0;->g()Lef/b;

    move-result-object v2

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lbf/s0;->h()Lef/b;

    move-result-object v2

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Lbf/s0;->e()Lef/b;

    move-result-object v2

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object v16

    invoke-direct/range {v8 .. v16}, Ljava/security/spec/RSAPrivateCrtKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0, v8}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/RSAPrivateCrtKey;

    move-object v2, v1

    move-object v1, v0

    new-instance v0, Lcf/f0;

    move-object v3, v2

    invoke-virtual {v3}, Lbf/r0;->g()Lbf/r0$c;

    move-result-object v2

    move-object v4, v3

    invoke-virtual {v4}, Lbf/r0;->c()Lbf/r0$c;

    move-result-object v3

    move-object v5, v4

    invoke-virtual {v5}, Lbf/r0;->f()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Lbf/b1;->b()Lef/a;

    move-result-object v6

    invoke-virtual {v6}, Lef/a;->d()[B

    move-result-object v6

    invoke-virtual {v5}, Lbf/r0;->h()Lbf/r0$d;

    move-result-object v5

    sget-object v8, Lbf/r0$d;->d:Lbf/r0$d;

    invoke-virtual {v5, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Lcf/f0;->i:[B

    :goto_0
    move-object/from16 v17, v6

    move-object v6, v5

    move-object/from16 v5, v17

    goto :goto_1

    :cond_0
    sget-object v5, Lcf/f0;->h:[B

    goto :goto_0

    :goto_1
    invoke-direct/range {v0 .. v7}, Lcf/f0;-><init>(Ljava/security/interfaces/RSAPrivateCrtKey;Lbf/r0$c;Lbf/r0$c;I[B[BLjava/security/Provider;)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/security/NoSuchProviderException;

    const-string v1, "RSA SSA PSS using Conscrypt is not supported."

    invoke-direct {v0, v1}, Ljava/security/NoSuchProviderException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a([B)[B
    .locals 2

    iget-object v0, p0, Lcf/f0;->b:Ljava/lang/String;

    iget-object v1, p0, Lcf/f0;->f:Ljava/security/Provider;

    invoke-static {v0, v1}, Ljava/security/Signature;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/Signature;

    move-result-object v0

    iget-object v1, p0, Lcf/f0;->a:Ljava/security/interfaces/RSAPrivateCrtKey;

    invoke-virtual {v0, v1}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    iget-object v1, p0, Lcf/f0;->c:Ljava/security/spec/PSSParameterSpec;

    invoke-virtual {v0, v1}, Ljava/security/Signature;->setParameter(Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {v0, p1}, Ljava/security/Signature;->update([B)V

    iget-object p1, p0, Lcf/f0;->e:[B

    array-length v1, p1

    if-lez v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/security/Signature;->update([B)V

    :cond_0
    invoke-virtual {v0}, Ljava/security/Signature;->sign()[B

    move-result-object p1

    iget-object v0, p0, Lcf/f0;->d:[B

    array-length v1, v0

    if-nez v1, :cond_1

    return-object p1

    :cond_1
    filled-new-array {v0, p1}, [[B

    move-result-object p1

    invoke-static {p1}, Ldf/e;->a([[B)[B

    move-result-object p1

    return-object p1
.end method
