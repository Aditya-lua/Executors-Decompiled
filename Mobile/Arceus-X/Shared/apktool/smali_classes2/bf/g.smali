.class public final Lbf/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwe/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h0<",
            "Lbf/b;",
            "Lpe/z;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lwe/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h0<",
            "Lbf/c;",
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
            "Lbf/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lue/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lbf/d;

    invoke-direct {v0}, Lbf/d;-><init>()V

    const-class v1, Lbf/b;

    const-class v2, Lpe/z;

    invoke-static {v0, v1, v2}, Lwe/h0;->b(Lwe/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/h0;

    move-result-object v0

    sput-object v0, Lbf/g;->a:Lwe/h0;

    new-instance v0, Lbf/e;

    invoke-direct {v0}, Lbf/e;-><init>()V

    const-class v1, Lbf/c;

    const-class v3, Lpe/a0;

    invoke-static {v0, v1, v3}, Lwe/h0;->b(Lwe/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/h0;

    move-result-object v0

    sput-object v0, Lbf/g;->b:Lwe/h0;

    invoke-static {}, Lbf/g;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Laf/t;->h0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lwe/o;->f(Ljava/lang/String;Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lpe/y;

    move-result-object v0

    sput-object v0, Lbf/g;->c:Lpe/y;

    invoke-static {}, Lbf/h;->a()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Laf/f0$c;->e:Laf/f0$c;

    invoke-static {}, Laf/u;->k0()Lcom/google/crypto/tink/shaded/protobuf/a1;

    move-result-object v2

    invoke-static {v0, v3, v1, v2}, Lwe/o;->e(Ljava/lang/String;Ljava/lang/Class;Laf/f0$c;Lcom/google/crypto/tink/shaded/protobuf/a1;)Lpe/m;

    move-result-object v0

    sput-object v0, Lbf/g;->d:Lpe/m;

    new-instance v0, Lbf/f;

    invoke-direct {v0}, Lbf/f;-><init>()V

    sput-object v0, Lbf/g;->e:Lwe/w$a;

    sget-object v0, Lue/b$b;->b:Lue/b$b;

    sput-object v0, Lbf/g;->f:Lue/b$b;

    return-void
.end method

.method public static synthetic a(Lbf/a;Ljava/lang/Integer;)Lbf/b;
    .locals 0

    invoke-static {p0, p1}, Lbf/g;->b(Lbf/a;Ljava/lang/Integer;)Lbf/b;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lbf/a;Ljava/lang/Integer;)Lbf/b;
    .locals 3

    invoke-virtual {p0}, Lbf/a;->c()Lbf/a$c;

    move-result-object v0

    invoke-virtual {v0}, Lbf/a$c;->a()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    invoke-static {v0}, Ldf/k;->f(Ljava/security/spec/ECParameterSpec;)Ljava/security/KeyPair;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v1

    check-cast v1, Ljava/security/interfaces/ECPublicKey;

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/ECPrivateKey;

    invoke-static {}, Lbf/c;->c()Lbf/c$b;

    move-result-object v2

    invoke-virtual {v2, p0}, Lbf/c$b;->d(Lbf/a;)Lbf/c$b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lbf/c$b;->c(Ljava/lang/Integer;)Lbf/c$b;

    move-result-object p0

    invoke-interface {v1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbf/c$b;->e(Ljava/security/spec/ECPoint;)Lbf/c$b;

    move-result-object p0

    invoke-virtual {p0}, Lbf/c$b;->a()Lbf/c;

    move-result-object p0

    invoke-static {}, Lbf/b;->d()Lbf/b$b;

    move-result-object p1

    invoke-virtual {p1, p0}, Lbf/b$b;->c(Lbf/c;)Lbf/b$b;

    move-result-object p0

    invoke-interface {v0}, Ljava/security/interfaces/ECPrivateKey;->getS()Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v0

    invoke-static {p1, v0}, Lef/b;->a(Ljava/math/BigInteger;Lpe/d0;)Lef/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbf/b$b;->b(Lef/b;)Lbf/b$b;

    move-result-object p0

    invoke-virtual {p0}, Lbf/b$b;->a()Lbf/b;

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
            "Lpe/x;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "ECDSA_P256"

    sget-object v2, Lbf/e0;->a:Lbf/a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "ECDSA_P256_IEEE_P1363"

    sget-object v2, Lbf/e0;->d:Lbf/a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lbf/a;->b()Lbf/a$b;

    move-result-object v1

    sget-object v2, Lbf/a$d;->b:Lbf/a$d;

    invoke-virtual {v1, v2}, Lbf/a$b;->c(Lbf/a$d;)Lbf/a$b;

    move-result-object v1

    sget-object v2, Lbf/a$c;->c:Lbf/a$c;

    invoke-virtual {v1, v2}, Lbf/a$b;->b(Lbf/a$c;)Lbf/a$b;

    move-result-object v1

    sget-object v2, Lbf/a$e;->b:Lbf/a$e;

    invoke-virtual {v1, v2}, Lbf/a$b;->d(Lbf/a$e;)Lbf/a$b;

    move-result-object v1

    sget-object v2, Lbf/a$f;->e:Lbf/a$f;

    invoke-virtual {v1, v2}, Lbf/a$b;->e(Lbf/a$f;)Lbf/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lbf/a$b;->a()Lbf/a;

    move-result-object v1

    const-string v2, "ECDSA_P256_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX"

    sget-object v2, Lbf/e0;->f:Lbf/a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "ECDSA_P384"

    sget-object v2, Lbf/e0;->b:Lbf/a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "ECDSA_P384_IEEE_P1363"

    sget-object v2, Lbf/e0;->e:Lbf/a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lbf/a;->b()Lbf/a$b;

    move-result-object v1

    sget-object v2, Lbf/a$d;->d:Lbf/a$d;

    invoke-virtual {v1, v2}, Lbf/a$b;->c(Lbf/a$d;)Lbf/a$b;

    move-result-object v1

    sget-object v2, Lbf/a$c;->d:Lbf/a$c;

    invoke-virtual {v1, v2}, Lbf/a$b;->b(Lbf/a$c;)Lbf/a$b;

    move-result-object v1

    sget-object v3, Lbf/a$e;->c:Lbf/a$e;

    invoke-virtual {v1, v3}, Lbf/a$b;->d(Lbf/a$e;)Lbf/a$b;

    move-result-object v1

    sget-object v4, Lbf/a$f;->b:Lbf/a$f;

    invoke-virtual {v1, v4}, Lbf/a$b;->e(Lbf/a$f;)Lbf/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lbf/a$b;->a()Lbf/a;

    move-result-object v1

    const-string v5, "ECDSA_P384_SHA512"

    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lbf/a;->b()Lbf/a$b;

    move-result-object v1

    sget-object v5, Lbf/a$d;->c:Lbf/a$d;

    invoke-virtual {v1, v5}, Lbf/a$b;->c(Lbf/a$d;)Lbf/a$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lbf/a$b;->b(Lbf/a$c;)Lbf/a$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lbf/a$b;->d(Lbf/a$e;)Lbf/a$b;

    move-result-object v1

    invoke-virtual {v1, v4}, Lbf/a$b;->e(Lbf/a$f;)Lbf/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lbf/a$b;->a()Lbf/a;

    move-result-object v1

    const-string v2, "ECDSA_P384_SHA384"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "ECDSA_P521"

    sget-object v2, Lbf/e0;->c:Lbf/a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "ECDSA_P521_IEEE_P1363"

    sget-object v2, Lbf/e0;->g:Lbf/a;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static e(Z)V
    .locals 4

    sget-object v0, Lbf/g;->f:Lue/b$b;

    invoke-virtual {v0}, Lue/b$b;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lcf/g;->m()V

    invoke-static {}, Lwe/z;->a()Lwe/z;

    move-result-object v1

    invoke-static {}, Lbf/g;->d()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, v2}, Lwe/z;->c(Ljava/util/Map;)V

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v1

    sget-object v2, Lbf/g;->a:Lwe/h0;

    invoke-virtual {v1, v2}, Lwe/a0;->d(Lwe/h0;)V

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v1

    sget-object v2, Lbf/g;->b:Lwe/h0;

    invoke-virtual {v1, v2}, Lwe/a0;->d(Lwe/h0;)V

    invoke-static {}, Lwe/w;->f()Lwe/w;

    move-result-object v1

    sget-object v2, Lbf/g;->e:Lwe/w$a;

    const-class v3, Lbf/a;

    invoke-virtual {v1, v2, v3}, Lwe/w;->b(Lwe/w$a;Ljava/lang/Class;)V

    invoke-static {}, Lwe/l;->d()Lwe/l;

    move-result-object v1

    sget-object v2, Lbf/g;->c:Lpe/y;

    invoke-virtual {v1, v2, v0, p0}, Lwe/l;->h(Lpe/m;Lue/b$b;Z)V

    invoke-static {}, Lwe/l;->d()Lwe/l;

    move-result-object p0

    sget-object v1, Lbf/g;->d:Lpe/m;

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v0, v2}, Lwe/l;->h(Lpe/m;Lue/b$b;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
