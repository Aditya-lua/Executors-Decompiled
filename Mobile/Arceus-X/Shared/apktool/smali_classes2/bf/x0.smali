.class public final Lbf/x0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwe/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h0<",
            "Lbf/s0;",
            "Lpe/z;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lwe/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h0<",
            "Lbf/t0;",
            "Lpe/a0;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lpe/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpe/y<",
            "Lpe/z;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lpe/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpe/m<",
            "Lpe/a0;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lwe/w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/w$a<",
            "Lbf/r0;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lue/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lbf/u0;

    invoke-direct {v0}, Lbf/u0;-><init>()V

    const-class v1, Lbf/s0;

    const-class v2, Lpe/z;

    invoke-static {v0, v1, v2}, Lwe/h0;->b(Lwe/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/h0;

    move-result-object v0

    sput-object v0, Lbf/x0;->a:Lwe/h0;

    new-instance v0, Lbf/v0;

    invoke-direct {v0}, Lbf/v0;-><init>()V

    const-class v1, Lbf/t0;

    const-class v3, Lpe/a0;

    invoke-static {v0, v1, v3}, Lwe/h0;->b(Lwe/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/h0;

    move-result-object v0

    sput-object v0, Lbf/x0;->b:Lwe/h0;

    invoke-static {}, Lbf/x0;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Laf/x0;->s0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lwe/o;->f(Ljava/lang/String;Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lpe/y;

    move-result-object v0

    sput-object v0, Lbf/x0;->c:Lpe/y;

    invoke-static {}, Lbf/y0;->a()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Laf/f0$c;->e:Laf/f0$c;

    invoke-static {}, Laf/y0;->l0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v2

    invoke-static {v0, v3, v1, v2}, Lwe/o;->e(Ljava/lang/String;Ljava/lang/Class;Laf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lpe/m;

    move-result-object v0

    sput-object v0, Lbf/x0;->d:Lpe/m;

    new-instance v0, Lbf/w0;

    invoke-direct {v0}, Lbf/w0;-><init>()V

    sput-object v0, Lbf/x0;->e:Lwe/w$a;

    sget-object v0, Lue/b$b;->b:Lue/b$b;

    sput-object v0, Lbf/x0;->f:Lue/b$b;

    return-void
.end method

.method public static synthetic a(Lbf/r0;Ljava/lang/Integer;)Lbf/s0;
    .locals 0

    invoke-static {p0, p1}, Lbf/x0;->b(Lbf/r0;Ljava/lang/Integer;)Lbf/s0;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lbf/r0;Ljava/lang/Integer;)Lbf/s0;
    .locals 6

    sget-object v0, Ldf/m;->g:Ldf/m;

    const-string v1, "RSA"

    invoke-virtual {v0, v1}, Ldf/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/KeyPairGenerator;

    new-instance v1, Ljava/security/spec/RSAKeyGenParameterSpec;

    invoke-virtual {p0}, Lbf/r0;->d()I

    move-result v2

    new-instance v3, Ljava/math/BigInteger;

    invoke-virtual {p0}, Lbf/r0;->e()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v4}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v4

    const/4 v5, 0x1

    invoke-direct {v3, v5, v4}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-direct {v1, v2, v3}, Ljava/security/spec/RSAKeyGenParameterSpec;-><init>(ILjava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {v0}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v1

    check-cast v1, Ljava/security/interfaces/RSAPublicKey;

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/RSAPrivateCrtKey;

    invoke-static {}, Lbf/t0;->c()Lbf/t0$b;

    move-result-object v2

    invoke-virtual {v2, p0}, Lbf/t0$b;->e(Lbf/r0;)Lbf/t0$b;

    move-result-object p0

    invoke-interface {v1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {p0, v1}, Lbf/t0$b;->d(Ljava/math/BigInteger;)Lbf/t0$b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lbf/t0$b;->c(Ljava/lang/Integer;)Lbf/t0$b;

    move-result-object p0

    invoke-virtual {p0}, Lbf/t0$b;->a()Lbf/t0;

    move-result-object p0

    invoke-static {}, Lbf/s0;->d()Lbf/s0$b;

    move-result-object p1

    invoke-virtual {p1, p0}, Lbf/s0$b;->f(Lbf/t0;)Lbf/s0$b;

    move-result-object p0

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPrimeP()Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v1

    invoke-static {p1, v1}, Lef/b;->a(Ljava/math/BigInteger;Lpe/d0;)Lef/b;

    move-result-object p1

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPrimeQ()Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v2

    invoke-static {v1, v2}, Lef/b;->a(Ljava/math/BigInteger;Lpe/d0;)Lef/b;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lbf/s0$b;->d(Lef/b;Lef/b;)Lbf/s0$b;

    move-result-object p0

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateKey;->getPrivateExponent()Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v1

    invoke-static {p1, v1}, Lef/b;->a(Ljava/math/BigInteger;Lpe/d0;)Lef/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbf/s0$b;->e(Lef/b;)Lbf/s0$b;

    move-result-object p0

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPrimeExponentP()Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v1

    invoke-static {p1, v1}, Lef/b;->a(Ljava/math/BigInteger;Lpe/d0;)Lef/b;

    move-result-object p1

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPrimeExponentQ()Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v2

    invoke-static {v1, v2}, Lef/b;->a(Ljava/math/BigInteger;Lpe/d0;)Lef/b;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lbf/s0$b;->c(Lef/b;Lef/b;)Lbf/s0$b;

    move-result-object p0

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateCrtKey;->getCrtCoefficient()Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v0

    invoke-static {p1, v0}, Lef/b;->a(Ljava/math/BigInteger;Lpe/d0;)Lef/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbf/s0$b;->b(Lef/b;)Lbf/s0$b;

    move-result-object p0

    invoke-virtual {p0}, Lbf/s0$b;->a()Lbf/s0;

    move-result-object p0

    return-object p0
.end method

.method public static c()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey"

    return-object v0
.end method

.method public static d()Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lpe/x;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Lbf/r0;->b()Lbf/r0$b;

    move-result-object v1

    sget-object v2, Lbf/r0$c;->b:Lbf/r0$c;

    invoke-virtual {v1, v2}, Lbf/r0$b;->f(Lbf/r0$c;)Lbf/r0$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lbf/r0$b;->b(Lbf/r0$c;)Lbf/r0$b;

    move-result-object v1

    const/16 v3, 0x20

    invoke-virtual {v1, v3}, Lbf/r0$b;->e(I)Lbf/r0$b;

    move-result-object v1

    const/16 v4, 0xc00

    invoke-virtual {v1, v4}, Lbf/r0$b;->c(I)Lbf/r0$b;

    move-result-object v1

    sget-object v5, Lbf/r0;->g:Ljava/math/BigInteger;

    invoke-virtual {v1, v5}, Lbf/r0$b;->d(Ljava/math/BigInteger;)Lbf/r0$b;

    move-result-object v1

    sget-object v6, Lbf/r0$d;->b:Lbf/r0$d;

    invoke-virtual {v1, v6}, Lbf/r0$b;->g(Lbf/r0$d;)Lbf/r0$b;

    move-result-object v1

    invoke-virtual {v1}, Lbf/r0$b;->a()Lbf/r0;

    move-result-object v1

    const-string v7, "RSA_SSA_PSS_3072_SHA256_F4"

    invoke-interface {v0, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lbf/r0;->b()Lbf/r0$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lbf/r0$b;->f(Lbf/r0$c;)Lbf/r0$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lbf/r0$b;->b(Lbf/r0$c;)Lbf/r0$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lbf/r0$b;->e(I)Lbf/r0$b;

    move-result-object v1

    invoke-virtual {v1, v4}, Lbf/r0$b;->c(I)Lbf/r0$b;

    move-result-object v1

    invoke-virtual {v1, v5}, Lbf/r0$b;->d(Ljava/math/BigInteger;)Lbf/r0$b;

    move-result-object v1

    sget-object v2, Lbf/r0$d;->e:Lbf/r0$d;

    invoke-virtual {v1, v2}, Lbf/r0$b;->g(Lbf/r0$d;)Lbf/r0$b;

    move-result-object v1

    invoke-virtual {v1}, Lbf/r0$b;->a()Lbf/r0;

    move-result-object v1

    const-string v3, "RSA_SSA_PSS_3072_SHA256_F4_RAW"

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "RSA_SSA_PSS_3072_SHA256_SHA256_32_F4"

    sget-object v3, Lbf/e0;->m:Lbf/r0;

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lbf/r0;->b()Lbf/r0$b;

    move-result-object v1

    sget-object v3, Lbf/r0$c;->d:Lbf/r0$c;

    invoke-virtual {v1, v3}, Lbf/r0$b;->f(Lbf/r0$c;)Lbf/r0$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lbf/r0$b;->b(Lbf/r0$c;)Lbf/r0$b;

    move-result-object v1

    const/16 v4, 0x40

    invoke-virtual {v1, v4}, Lbf/r0$b;->e(I)Lbf/r0$b;

    move-result-object v1

    const/16 v7, 0x1000

    invoke-virtual {v1, v7}, Lbf/r0$b;->c(I)Lbf/r0$b;

    move-result-object v1

    invoke-virtual {v1, v5}, Lbf/r0$b;->d(Ljava/math/BigInteger;)Lbf/r0$b;

    move-result-object v1

    invoke-virtual {v1, v6}, Lbf/r0$b;->g(Lbf/r0$d;)Lbf/r0$b;

    move-result-object v1

    invoke-virtual {v1}, Lbf/r0$b;->a()Lbf/r0;

    move-result-object v1

    const-string v6, "RSA_SSA_PSS_4096_SHA512_F4"

    invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lbf/r0;->b()Lbf/r0$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lbf/r0$b;->f(Lbf/r0$c;)Lbf/r0$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lbf/r0$b;->b(Lbf/r0$c;)Lbf/r0$b;

    move-result-object v1

    invoke-virtual {v1, v4}, Lbf/r0$b;->e(I)Lbf/r0$b;

    move-result-object v1

    invoke-virtual {v1, v7}, Lbf/r0$b;->c(I)Lbf/r0$b;

    move-result-object v1

    invoke-virtual {v1, v5}, Lbf/r0$b;->d(Ljava/math/BigInteger;)Lbf/r0$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lbf/r0$b;->g(Lbf/r0$d;)Lbf/r0$b;

    move-result-object v1

    invoke-virtual {v1}, Lbf/r0$b;->a()Lbf/r0;

    move-result-object v1

    const-string v2, "RSA_SSA_PSS_4096_SHA512_F4_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "RSA_SSA_PSS_4096_SHA512_SHA512_64_F4"

    sget-object v2, Lbf/e0;->n:Lbf/r0;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static e(Z)V
    .locals 4

    sget-object v0, Lbf/x0;->f:Lue/b$b;

    invoke-virtual {v0}, Lue/b$b;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lcf/e0;->p()V

    invoke-static {}, Lwe/z;->a()Lwe/z;

    move-result-object v1

    invoke-static {}, Lbf/x0;->d()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, v2}, Lwe/z;->c(Ljava/util/Map;)V

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v1

    sget-object v2, Lbf/x0;->a:Lwe/h0;

    invoke-virtual {v1, v2}, Lwe/a0;->d(Lwe/h0;)V

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v1

    sget-object v2, Lbf/x0;->b:Lwe/h0;

    invoke-virtual {v1, v2}, Lwe/a0;->d(Lwe/h0;)V

    invoke-static {}, Lwe/w;->f()Lwe/w;

    move-result-object v1

    sget-object v2, Lbf/x0;->e:Lwe/w$a;

    const-class v3, Lbf/r0;

    invoke-virtual {v1, v2, v3}, Lwe/w;->b(Lwe/w$a;Ljava/lang/Class;)V

    invoke-static {}, Lwe/l;->d()Lwe/l;

    move-result-object v1

    sget-object v2, Lbf/x0;->c:Lpe/y;

    invoke-virtual {v1, v2, v0, p0}, Lwe/l;->h(Lpe/m;Lue/b$b;Z)V

    invoke-static {}, Lwe/l;->d()Lwe/l;

    move-result-object p0

    sget-object v1, Lbf/x0;->d:Lpe/m;

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v0, v2}, Lwe/l;->h(Lpe/m;Lue/b$b;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
