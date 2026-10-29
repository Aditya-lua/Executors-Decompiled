.class public final Lbf/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwe/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h0<",
            "Lbf/k0;",
            "Lpe/z;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lwe/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h0<",
            "Lbf/l0;",
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
            "Lbf/j0;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lue/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lbf/m0;

    invoke-direct {v0}, Lbf/m0;-><init>()V

    const-class v1, Lbf/k0;

    const-class v2, Lpe/z;

    invoke-static {v0, v1, v2}, Lwe/h0;->b(Lwe/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/h0;

    move-result-object v0

    sput-object v0, Lbf/p0;->a:Lwe/h0;

    new-instance v0, Lbf/n0;

    invoke-direct {v0}, Lbf/n0;-><init>()V

    const-class v1, Lbf/l0;

    const-class v3, Lpe/a0;

    invoke-static {v0, v1, v3}, Lwe/h0;->b(Lwe/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/h0;

    move-result-object v0

    sput-object v0, Lbf/p0;->b:Lwe/h0;

    invoke-static {}, Lbf/p0;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Laf/t0;->s0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lwe/o;->f(Ljava/lang/String;Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lpe/y;

    move-result-object v0

    sput-object v0, Lbf/p0;->c:Lpe/y;

    invoke-static {}, Lbf/q0;->a()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Laf/f0$c;->e:Laf/f0$c;

    invoke-static {}, Laf/u0;->k0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v2

    invoke-static {v0, v3, v1, v2}, Lwe/o;->e(Ljava/lang/String;Ljava/lang/Class;Laf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lpe/m;

    move-result-object v0

    sput-object v0, Lbf/p0;->d:Lpe/m;

    new-instance v0, Lbf/o0;

    invoke-direct {v0}, Lbf/o0;-><init>()V

    sput-object v0, Lbf/p0;->e:Lwe/w$a;

    sget-object v0, Lue/b$b;->b:Lue/b$b;

    sput-object v0, Lbf/p0;->f:Lue/b$b;

    return-void
.end method

.method public static synthetic a(Lbf/j0;Ljava/lang/Integer;)Lbf/k0;
    .locals 0

    invoke-static {p0, p1}, Lbf/p0;->b(Lbf/j0;Ljava/lang/Integer;)Lbf/k0;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lbf/j0;Ljava/lang/Integer;)Lbf/k0;
    .locals 6

    sget-object v0, Ldf/m;->g:Ldf/m;

    const-string v1, "RSA"

    invoke-virtual {v0, v1}, Ldf/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/KeyPairGenerator;

    new-instance v1, Ljava/security/spec/RSAKeyGenParameterSpec;

    invoke-virtual {p0}, Lbf/j0;->d()I

    move-result v2

    new-instance v3, Ljava/math/BigInteger;

    invoke-virtual {p0}, Lbf/j0;->e()Ljava/math/BigInteger;

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

    invoke-static {}, Lbf/l0;->c()Lbf/l0$b;

    move-result-object v2

    invoke-virtual {v2, p0}, Lbf/l0$b;->e(Lbf/j0;)Lbf/l0$b;

    move-result-object p0

    invoke-interface {v1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {p0, v1}, Lbf/l0$b;->d(Ljava/math/BigInteger;)Lbf/l0$b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lbf/l0$b;->c(Ljava/lang/Integer;)Lbf/l0$b;

    move-result-object p0

    invoke-virtual {p0}, Lbf/l0$b;->a()Lbf/l0;

    move-result-object p0

    invoke-static {}, Lbf/k0;->d()Lbf/k0$b;

    move-result-object p1

    invoke-virtual {p1, p0}, Lbf/k0$b;->f(Lbf/l0;)Lbf/k0$b;

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

    invoke-virtual {p0, p1, v1}, Lbf/k0$b;->d(Lef/b;Lef/b;)Lbf/k0$b;

    move-result-object p0

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateKey;->getPrivateExponent()Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v1

    invoke-static {p1, v1}, Lef/b;->a(Ljava/math/BigInteger;Lpe/d0;)Lef/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbf/k0$b;->e(Lef/b;)Lbf/k0$b;

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

    invoke-virtual {p0, p1, v1}, Lbf/k0$b;->c(Lef/b;Lef/b;)Lbf/k0$b;

    move-result-object p0

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateCrtKey;->getCrtCoefficient()Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v0

    invoke-static {p1, v0}, Lef/b;->a(Ljava/math/BigInteger;Lpe/d0;)Lef/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbf/k0$b;->b(Lef/b;)Lbf/k0$b;

    move-result-object p0

    invoke-virtual {p0}, Lbf/k0$b;->a()Lbf/k0;

    move-result-object p0

    return-object p0
.end method

.method public static c()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey"

    return-object v0
.end method

.method public static d()Ljava/util/Map;
    .locals 5
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

    const-string v1, "RSA_SSA_PKCS1_3072_SHA256_F4"

    sget-object v2, Lbf/e0;->j:Lbf/j0;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lbf/j0;->b()Lbf/j0$b;

    move-result-object v1

    sget-object v2, Lbf/j0$c;->b:Lbf/j0$c;

    invoke-virtual {v1, v2}, Lbf/j0$b;->b(Lbf/j0$c;)Lbf/j0$b;

    move-result-object v1

    const/16 v2, 0xc00

    invoke-virtual {v1, v2}, Lbf/j0$b;->c(I)Lbf/j0$b;

    move-result-object v1

    sget-object v2, Lbf/j0;->e:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Lbf/j0$b;->d(Ljava/math/BigInteger;)Lbf/j0$b;

    move-result-object v1

    sget-object v3, Lbf/j0$d;->e:Lbf/j0$d;

    invoke-virtual {v1, v3}, Lbf/j0$b;->e(Lbf/j0$d;)Lbf/j0$b;

    move-result-object v1

    invoke-virtual {v1}, Lbf/j0$b;->a()Lbf/j0;

    move-result-object v1

    const-string v4, "RSA_SSA_PKCS1_3072_SHA256_F4_RAW"

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX"

    sget-object v4, Lbf/e0;->k:Lbf/j0;

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "RSA_SSA_PKCS1_4096_SHA512_F4"

    sget-object v4, Lbf/e0;->l:Lbf/j0;

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lbf/j0;->b()Lbf/j0$b;

    move-result-object v1

    sget-object v4, Lbf/j0$c;->d:Lbf/j0$c;

    invoke-virtual {v1, v4}, Lbf/j0$b;->b(Lbf/j0$c;)Lbf/j0$b;

    move-result-object v1

    const/16 v4, 0x1000

    invoke-virtual {v1, v4}, Lbf/j0$b;->c(I)Lbf/j0$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lbf/j0$b;->d(Ljava/math/BigInteger;)Lbf/j0$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lbf/j0$b;->e(Lbf/j0$d;)Lbf/j0$b;

    move-result-object v1

    invoke-virtual {v1}, Lbf/j0$b;->a()Lbf/j0;

    move-result-object v1

    const-string v2, "RSA_SSA_PKCS1_4096_SHA512_F4_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static e(Z)V
    .locals 4

    sget-object v0, Lbf/p0;->f:Lue/b$b;

    invoke-virtual {v0}, Lue/b$b;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lcf/w;->p()V

    invoke-static {}, Lwe/z;->a()Lwe/z;

    move-result-object v1

    invoke-static {}, Lbf/p0;->d()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, v2}, Lwe/z;->c(Ljava/util/Map;)V

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v1

    sget-object v2, Lbf/p0;->a:Lwe/h0;

    invoke-virtual {v1, v2}, Lwe/a0;->d(Lwe/h0;)V

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v1

    sget-object v2, Lbf/p0;->b:Lwe/h0;

    invoke-virtual {v1, v2}, Lwe/a0;->d(Lwe/h0;)V

    invoke-static {}, Lwe/w;->f()Lwe/w;

    move-result-object v1

    sget-object v2, Lbf/p0;->e:Lwe/w$a;

    const-class v3, Lbf/j0;

    invoke-virtual {v1, v2, v3}, Lwe/w;->b(Lwe/w$a;Ljava/lang/Class;)V

    invoke-static {}, Lwe/l;->d()Lwe/l;

    move-result-object v1

    sget-object v2, Lbf/p0;->c:Lpe/y;

    invoke-virtual {v1, v2, v0, p0}, Lwe/l;->h(Lpe/m;Lue/b$b;Z)V

    invoke-static {}, Lwe/l;->d()Lwe/l;

    move-result-object p0

    sget-object v1, Lbf/p0;->d:Lpe/m;

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v0, v2}, Lwe/l;->h(Lpe/m;Lue/b$b;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
