.class public final Ldf/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lye/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h0<",
            "Ldf/k0;",
            "Lre/z;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lye/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h0<",
            "Ldf/l0;",
            "Lre/a0;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lre/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lre/y<",
            "Lre/z;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lre/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lre/m<",
            "Lre/a0;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lye/w$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/w$a<",
            "Ldf/j0;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lwe/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ldf/m0;

    invoke-direct {v0}, Ldf/m0;-><init>()V

    const-class v1, Ldf/k0;

    const-class v2, Lre/z;

    invoke-static {v0, v1, v2}, Lye/h0;->b(Lye/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/h0;

    move-result-object v0

    sput-object v0, Ldf/p0;->a:Lye/h0;

    new-instance v0, Ldf/n0;

    invoke-direct {v0}, Ldf/n0;-><init>()V

    const-class v1, Ldf/l0;

    const-class v3, Lre/a0;

    invoke-static {v0, v1, v3}, Lye/h0;->b(Lye/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/h0;

    move-result-object v0

    sput-object v0, Ldf/p0;->b:Lye/h0;

    invoke-static {}, Ldf/p0;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcf/t0;->s0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lye/o;->f(Ljava/lang/String;Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lre/y;

    move-result-object v0

    sput-object v0, Ldf/p0;->c:Lre/y;

    invoke-static {}, Ldf/q0;->a()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcf/f0$c;->e:Lcf/f0$c;

    invoke-static {}, Lcf/u0;->k0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v2

    invoke-static {v0, v3, v1, v2}, Lye/o;->e(Ljava/lang/String;Ljava/lang/Class;Lcf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lre/m;

    move-result-object v0

    sput-object v0, Ldf/p0;->d:Lre/m;

    new-instance v0, Ldf/o0;

    invoke-direct {v0}, Ldf/o0;-><init>()V

    sput-object v0, Ldf/p0;->e:Lye/w$a;

    sget-object v0, Lwe/b$b;->b:Lwe/b$b;

    sput-object v0, Ldf/p0;->f:Lwe/b$b;

    return-void
.end method

.method public static synthetic a(Ldf/j0;Ljava/lang/Integer;)Ldf/k0;
    .locals 0

    invoke-static {p0, p1}, Ldf/p0;->b(Ldf/j0;Ljava/lang/Integer;)Ldf/k0;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ldf/j0;Ljava/lang/Integer;)Ldf/k0;
    .locals 6

    sget-object v0, Lff/m;->g:Lff/m;

    const-string v1, "RSA"

    invoke-virtual {v0, v1}, Lff/m;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/KeyPairGenerator;

    new-instance v1, Ljava/security/spec/RSAKeyGenParameterSpec;

    invoke-virtual {p0}, Ldf/j0;->d()I

    move-result v2

    new-instance v3, Ljava/math/BigInteger;

    invoke-virtual {p0}, Ldf/j0;->e()Ljava/math/BigInteger;

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

    invoke-static {}, Ldf/l0;->c()Ldf/l0$b;

    move-result-object v2

    invoke-virtual {v2, p0}, Ldf/l0$b;->e(Ldf/j0;)Ldf/l0$b;

    move-result-object p0

    invoke-interface {v1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {p0, v1}, Ldf/l0$b;->d(Ljava/math/BigInteger;)Ldf/l0$b;

    move-result-object p0

    invoke-virtual {p0, p1}, Ldf/l0$b;->c(Ljava/lang/Integer;)Ldf/l0$b;

    move-result-object p0

    invoke-virtual {p0}, Ldf/l0$b;->a()Ldf/l0;

    move-result-object p0

    invoke-static {}, Ldf/k0;->d()Ldf/k0$b;

    move-result-object p1

    invoke-virtual {p1, p0}, Ldf/k0$b;->f(Ldf/l0;)Ldf/k0$b;

    move-result-object p0

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPrimeP()Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v1

    invoke-static {p1, v1}, Lgf/b;->a(Ljava/math/BigInteger;Lre/d0;)Lgf/b;

    move-result-object p1

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPrimeQ()Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v2

    invoke-static {v1, v2}, Lgf/b;->a(Ljava/math/BigInteger;Lre/d0;)Lgf/b;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Ldf/k0$b;->d(Lgf/b;Lgf/b;)Ldf/k0$b;

    move-result-object p0

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateKey;->getPrivateExponent()Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v1

    invoke-static {p1, v1}, Lgf/b;->a(Ljava/math/BigInteger;Lre/d0;)Lgf/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Ldf/k0$b;->e(Lgf/b;)Ldf/k0$b;

    move-result-object p0

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPrimeExponentP()Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v1

    invoke-static {p1, v1}, Lgf/b;->a(Ljava/math/BigInteger;Lre/d0;)Lgf/b;

    move-result-object p1

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateCrtKey;->getPrimeExponentQ()Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v2

    invoke-static {v1, v2}, Lgf/b;->a(Ljava/math/BigInteger;Lre/d0;)Lgf/b;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Ldf/k0$b;->c(Lgf/b;Lgf/b;)Ldf/k0$b;

    move-result-object p0

    invoke-interface {v0}, Ljava/security/interfaces/RSAPrivateCrtKey;->getCrtCoefficient()Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v0

    invoke-static {p1, v0}, Lgf/b;->a(Ljava/math/BigInteger;Lre/d0;)Lgf/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Ldf/k0$b;->b(Lgf/b;)Ldf/k0$b;

    move-result-object p0

    invoke-virtual {p0}, Ldf/k0$b;->a()Ldf/k0;

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
            "Lre/x;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "RSA_SSA_PKCS1_3072_SHA256_F4"

    sget-object v2, Ldf/e0;->j:Ldf/j0;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ldf/j0;->b()Ldf/j0$b;

    move-result-object v1

    sget-object v2, Ldf/j0$c;->b:Ldf/j0$c;

    invoke-virtual {v1, v2}, Ldf/j0$b;->b(Ldf/j0$c;)Ldf/j0$b;

    move-result-object v1

    const/16 v2, 0xc00

    invoke-virtual {v1, v2}, Ldf/j0$b;->c(I)Ldf/j0$b;

    move-result-object v1

    sget-object v2, Ldf/j0;->e:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ldf/j0$b;->d(Ljava/math/BigInteger;)Ldf/j0$b;

    move-result-object v1

    sget-object v3, Ldf/j0$d;->e:Ldf/j0$d;

    invoke-virtual {v1, v3}, Ldf/j0$b;->e(Ldf/j0$d;)Ldf/j0$b;

    move-result-object v1

    invoke-virtual {v1}, Ldf/j0$b;->a()Ldf/j0;

    move-result-object v1

    const-string v4, "RSA_SSA_PKCS1_3072_SHA256_F4_RAW"

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX"

    sget-object v4, Ldf/e0;->k:Ldf/j0;

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "RSA_SSA_PKCS1_4096_SHA512_F4"

    sget-object v4, Ldf/e0;->l:Ldf/j0;

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ldf/j0;->b()Ldf/j0$b;

    move-result-object v1

    sget-object v4, Ldf/j0$c;->d:Ldf/j0$c;

    invoke-virtual {v1, v4}, Ldf/j0$b;->b(Ldf/j0$c;)Ldf/j0$b;

    move-result-object v1

    const/16 v4, 0x1000

    invoke-virtual {v1, v4}, Ldf/j0$b;->c(I)Ldf/j0$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Ldf/j0$b;->d(Ljava/math/BigInteger;)Ldf/j0$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Ldf/j0$b;->e(Ldf/j0$d;)Ldf/j0$b;

    move-result-object v1

    invoke-virtual {v1}, Ldf/j0$b;->a()Ldf/j0;

    move-result-object v1

    const-string v2, "RSA_SSA_PKCS1_4096_SHA512_F4_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static e(Z)V
    .locals 4

    sget-object v0, Ldf/p0;->f:Lwe/b$b;

    invoke-virtual {v0}, Lwe/b$b;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lef/w;->p()V

    invoke-static {}, Lye/z;->a()Lye/z;

    move-result-object v1

    invoke-static {}, Ldf/p0;->d()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, v2}, Lye/z;->c(Ljava/util/Map;)V

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object v1

    sget-object v2, Ldf/p0;->a:Lye/h0;

    invoke-virtual {v1, v2}, Lye/a0;->d(Lye/h0;)V

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object v1

    sget-object v2, Ldf/p0;->b:Lye/h0;

    invoke-virtual {v1, v2}, Lye/a0;->d(Lye/h0;)V

    invoke-static {}, Lye/w;->f()Lye/w;

    move-result-object v1

    sget-object v2, Ldf/p0;->e:Lye/w$a;

    const-class v3, Ldf/j0;

    invoke-virtual {v1, v2, v3}, Lye/w;->b(Lye/w$a;Ljava/lang/Class;)V

    invoke-static {}, Lye/l;->d()Lye/l;

    move-result-object v1

    sget-object v2, Ldf/p0;->c:Lre/y;

    invoke-virtual {v1, v2, v0, p0}, Lye/l;->h(Lre/m;Lwe/b$b;Z)V

    invoke-static {}, Lye/l;->d()Lye/l;

    move-result-object p0

    sget-object v1, Ldf/p0;->d:Lre/m;

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v0, v2}, Lye/l;->h(Lre/m;Lwe/b$b;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
