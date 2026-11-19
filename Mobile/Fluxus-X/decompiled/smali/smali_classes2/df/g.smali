.class public final Ldf/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lye/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h0<",
            "Ldf/b;",
            "Lre/z;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lye/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h0<",
            "Ldf/c;",
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
            "Ldf/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lwe/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ldf/d;

    invoke-direct {v0}, Ldf/d;-><init>()V

    const-class v1, Ldf/b;

    const-class v2, Lre/z;

    invoke-static {v0, v1, v2}, Lye/h0;->b(Lye/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/h0;

    move-result-object v0

    sput-object v0, Ldf/g;->a:Lye/h0;

    new-instance v0, Ldf/e;

    invoke-direct {v0}, Ldf/e;-><init>()V

    const-class v1, Ldf/c;

    const-class v3, Lre/a0;

    invoke-static {v0, v1, v3}, Lye/h0;->b(Lye/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/h0;

    move-result-object v0

    sput-object v0, Ldf/g;->b:Lye/h0;

    invoke-static {}, Ldf/g;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcf/t;->h0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lye/o;->f(Ljava/lang/String;Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lre/y;

    move-result-object v0

    sput-object v0, Ldf/g;->c:Lre/y;

    invoke-static {}, Ldf/h;->a()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcf/f0$c;->e:Lcf/f0$c;

    invoke-static {}, Lcf/u;->k0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v2

    invoke-static {v0, v3, v1, v2}, Lye/o;->e(Ljava/lang/String;Ljava/lang/Class;Lcf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lre/m;

    move-result-object v0

    sput-object v0, Ldf/g;->d:Lre/m;

    new-instance v0, Ldf/f;

    invoke-direct {v0}, Ldf/f;-><init>()V

    sput-object v0, Ldf/g;->e:Lye/w$a;

    sget-object v0, Lwe/b$b;->b:Lwe/b$b;

    sput-object v0, Ldf/g;->f:Lwe/b$b;

    return-void
.end method

.method public static synthetic a(Ldf/a;Ljava/lang/Integer;)Ldf/b;
    .locals 0

    invoke-static {p0, p1}, Ldf/g;->b(Ldf/a;Ljava/lang/Integer;)Ldf/b;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ldf/a;Ljava/lang/Integer;)Ldf/b;
    .locals 3

    invoke-virtual {p0}, Ldf/a;->c()Ldf/a$c;

    move-result-object v0

    invoke-virtual {v0}, Ldf/a$c;->a()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    invoke-static {v0}, Lff/k;->f(Ljava/security/spec/ECParameterSpec;)Ljava/security/KeyPair;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v1

    check-cast v1, Ljava/security/interfaces/ECPublicKey;

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/ECPrivateKey;

    invoke-static {}, Ldf/c;->c()Ldf/c$b;

    move-result-object v2

    invoke-virtual {v2, p0}, Ldf/c$b;->d(Ldf/a;)Ldf/c$b;

    move-result-object p0

    invoke-virtual {p0, p1}, Ldf/c$b;->c(Ljava/lang/Integer;)Ldf/c$b;

    move-result-object p0

    invoke-interface {v1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object p1

    invoke-virtual {p0, p1}, Ldf/c$b;->e(Ljava/security/spec/ECPoint;)Ldf/c$b;

    move-result-object p0

    invoke-virtual {p0}, Ldf/c$b;->a()Ldf/c;

    move-result-object p0

    invoke-static {}, Ldf/b;->d()Ldf/b$b;

    move-result-object p1

    invoke-virtual {p1, p0}, Ldf/b$b;->c(Ldf/c;)Ldf/b$b;

    move-result-object p0

    invoke-interface {v0}, Ljava/security/interfaces/ECPrivateKey;->getS()Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v0

    invoke-static {p1, v0}, Lgf/b;->a(Ljava/math/BigInteger;Lre/d0;)Lgf/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Ldf/b$b;->b(Lgf/b;)Ldf/b$b;

    move-result-object p0

    invoke-virtual {p0}, Ldf/b$b;->a()Ldf/b;

    move-result-object p0

    return-object p0
.end method

.method public static c()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"

    return-object v0
.end method

.method public static d()Ljava/util/Map;
    .locals 6
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

    const-string v1, "ECDSA_P256"

    sget-object v2, Ldf/e0;->a:Ldf/a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "ECDSA_P256_IEEE_P1363"

    sget-object v2, Ldf/e0;->d:Ldf/a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ldf/a;->b()Ldf/a$b;

    move-result-object v1

    sget-object v2, Ldf/a$d;->b:Ldf/a$d;

    invoke-virtual {v1, v2}, Ldf/a$b;->c(Ldf/a$d;)Ldf/a$b;

    move-result-object v1

    sget-object v2, Ldf/a$c;->c:Ldf/a$c;

    invoke-virtual {v1, v2}, Ldf/a$b;->b(Ldf/a$c;)Ldf/a$b;

    move-result-object v1

    sget-object v2, Ldf/a$e;->b:Ldf/a$e;

    invoke-virtual {v1, v2}, Ldf/a$b;->d(Ldf/a$e;)Ldf/a$b;

    move-result-object v1

    sget-object v2, Ldf/a$f;->e:Ldf/a$f;

    invoke-virtual {v1, v2}, Ldf/a$b;->e(Ldf/a$f;)Ldf/a$b;

    move-result-object v1

    invoke-virtual {v1}, Ldf/a$b;->a()Ldf/a;

    move-result-object v1

    const-string v2, "ECDSA_P256_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX"

    sget-object v2, Ldf/e0;->f:Ldf/a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "ECDSA_P384"

    sget-object v2, Ldf/e0;->b:Ldf/a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "ECDSA_P384_IEEE_P1363"

    sget-object v2, Ldf/e0;->e:Ldf/a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ldf/a;->b()Ldf/a$b;

    move-result-object v1

    sget-object v2, Ldf/a$d;->d:Ldf/a$d;

    invoke-virtual {v1, v2}, Ldf/a$b;->c(Ldf/a$d;)Ldf/a$b;

    move-result-object v1

    sget-object v2, Ldf/a$c;->d:Ldf/a$c;

    invoke-virtual {v1, v2}, Ldf/a$b;->b(Ldf/a$c;)Ldf/a$b;

    move-result-object v1

    sget-object v3, Ldf/a$e;->c:Ldf/a$e;

    invoke-virtual {v1, v3}, Ldf/a$b;->d(Ldf/a$e;)Ldf/a$b;

    move-result-object v1

    sget-object v4, Ldf/a$f;->b:Ldf/a$f;

    invoke-virtual {v1, v4}, Ldf/a$b;->e(Ldf/a$f;)Ldf/a$b;

    move-result-object v1

    invoke-virtual {v1}, Ldf/a$b;->a()Ldf/a;

    move-result-object v1

    const-string v5, "ECDSA_P384_SHA512"

    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ldf/a;->b()Ldf/a$b;

    move-result-object v1

    sget-object v5, Ldf/a$d;->c:Ldf/a$d;

    invoke-virtual {v1, v5}, Ldf/a$b;->c(Ldf/a$d;)Ldf/a$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Ldf/a$b;->b(Ldf/a$c;)Ldf/a$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Ldf/a$b;->d(Ldf/a$e;)Ldf/a$b;

    move-result-object v1

    invoke-virtual {v1, v4}, Ldf/a$b;->e(Ldf/a$f;)Ldf/a$b;

    move-result-object v1

    invoke-virtual {v1}, Ldf/a$b;->a()Ldf/a;

    move-result-object v1

    const-string v2, "ECDSA_P384_SHA384"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "ECDSA_P521"

    sget-object v2, Ldf/e0;->c:Ldf/a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "ECDSA_P521_IEEE_P1363"

    sget-object v2, Ldf/e0;->g:Ldf/a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static e(Z)V
    .locals 4

    sget-object v0, Ldf/g;->f:Lwe/b$b;

    invoke-virtual {v0}, Lwe/b$b;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lef/g;->m()V

    invoke-static {}, Lye/z;->a()Lye/z;

    move-result-object v1

    invoke-static {}, Ldf/g;->d()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, v2}, Lye/z;->c(Ljava/util/Map;)V

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object v1

    sget-object v2, Ldf/g;->a:Lye/h0;

    invoke-virtual {v1, v2}, Lye/a0;->d(Lye/h0;)V

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object v1

    sget-object v2, Ldf/g;->b:Lye/h0;

    invoke-virtual {v1, v2}, Lye/a0;->d(Lye/h0;)V

    invoke-static {}, Lye/w;->f()Lye/w;

    move-result-object v1

    sget-object v2, Ldf/g;->e:Lye/w$a;

    const-class v3, Ldf/a;

    invoke-virtual {v1, v2, v3}, Lye/w;->b(Lye/w$a;Ljava/lang/Class;)V

    invoke-static {}, Lye/l;->d()Lye/l;

    move-result-object v1

    sget-object v2, Ldf/g;->c:Lre/y;

    invoke-virtual {v1, v2, v0, p0}, Lye/l;->h(Lre/m;Lwe/b$b;Z)V

    invoke-static {}, Lye/l;->d()Lye/l;

    move-result-object p0

    sget-object v1, Ldf/g;->d:Lre/m;

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v0, v2}, Lye/l;->h(Lre/m;Lwe/b$b;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
