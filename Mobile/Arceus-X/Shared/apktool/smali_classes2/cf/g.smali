.class public final Lcf/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lef/a;

.field public static final b:Lef/a;

.field public static final c:Lwe/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/g0<",
            "Lbf/a;",
            "Lwe/m0;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lwe/f0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/f0<",
            "Lwe/m0;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lwe/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/n<",
            "Lbf/c;",
            "Lwe/l0;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lwe/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/m<",
            "Lwe/l0;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Lwe/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/n<",
            "Lbf/b;",
            "Lwe/l0;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Lwe/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/m<",
            "Lwe/l0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"

    invoke-static {v0}, Lwe/s0;->h(Ljava/lang/String;)Lef/a;

    move-result-object v0

    sput-object v0, Lcf/g;->a:Lef/a;

    const-string v1, "type.googleapis.com/google.crypto.tink.EcdsaPublicKey"

    invoke-static {v1}, Lwe/s0;->h(Ljava/lang/String;)Lef/a;

    move-result-object v1

    sput-object v1, Lcf/g;->b:Lef/a;

    new-instance v2, Lcf/a;

    invoke-direct {v2}, Lcf/a;-><init>()V

    const-class v3, Lbf/a;

    const-class v4, Lwe/m0;

    invoke-static {v2, v3, v4}, Lwe/g0;->a(Lwe/g0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/g0;

    move-result-object v2

    sput-object v2, Lcf/g;->c:Lwe/g0;

    new-instance v2, Lcf/b;

    invoke-direct {v2}, Lcf/b;-><init>()V

    invoke-static {v2, v0, v4}, Lwe/f0;->a(Lwe/f0$b;Lef/a;Ljava/lang/Class;)Lwe/f0;

    move-result-object v2

    sput-object v2, Lcf/g;->d:Lwe/f0;

    new-instance v2, Lcf/c;

    invoke-direct {v2}, Lcf/c;-><init>()V

    const-class v3, Lbf/c;

    const-class v4, Lwe/l0;

    invoke-static {v2, v3, v4}, Lwe/n;->a(Lwe/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/n;

    move-result-object v2

    sput-object v2, Lcf/g;->e:Lwe/n;

    new-instance v2, Lcf/d;

    invoke-direct {v2}, Lcf/d;-><init>()V

    invoke-static {v2, v1, v4}, Lwe/m;->a(Lwe/m$b;Lef/a;Ljava/lang/Class;)Lwe/m;

    move-result-object v1

    sput-object v1, Lcf/g;->f:Lwe/m;

    new-instance v1, Lcf/e;

    invoke-direct {v1}, Lcf/e;-><init>()V

    const-class v2, Lbf/b;

    invoke-static {v1, v2, v4}, Lwe/n;->a(Lwe/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/n;

    move-result-object v1

    sput-object v1, Lcf/g;->g:Lwe/n;

    new-instance v1, Lcf/f;

    invoke-direct {v1}, Lcf/f;-><init>()V

    invoke-static {v1, v0, v4}, Lwe/m;->a(Lwe/m$b;Lef/a;Ljava/lang/Class;)Lwe/m;

    move-result-object v0

    sput-object v0, Lcf/g;->h:Lwe/m;

    return-void
.end method

.method public static synthetic a(Lwe/m0;)Lbf/a;
    .locals 0

    invoke-static {p0}, Lcf/g;->j(Lwe/m0;)Lbf/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lbf/b;Lpe/d0;)Lwe/l0;
    .locals 0

    invoke-static {p0, p1}, Lcf/g;->p(Lbf/b;Lpe/d0;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lbf/c;Lpe/d0;)Lwe/l0;
    .locals 0

    invoke-static {p0, p1}, Lcf/g;->q(Lbf/c;Lpe/d0;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lbf/a;)Lwe/m0;
    .locals 0

    invoke-static {p0}, Lcf/g;->o(Lbf/a;)Lwe/m0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lwe/l0;Lpe/d0;)Lbf/c;
    .locals 0

    invoke-static {p0, p1}, Lcf/g;->l(Lwe/l0;Lpe/d0;)Lbf/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lwe/l0;Lpe/d0;)Lbf/b;
    .locals 0

    invoke-static {p0, p1}, Lcf/g;->k(Lwe/l0;Lpe/d0;)Lbf/b;

    move-result-object p0

    return-object p0
.end method

.method public static g(Lbf/a$c;)I
    .locals 3

    sget-object v0, Lbf/a$c;->c:Lbf/a$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 p0, 0x21

    return p0

    :cond_0
    sget-object v0, Lbf/a$c;->d:Lbf/a$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 p0, 0x31

    return p0

    :cond_1
    sget-object v0, Lbf/a$c;->e:Lbf/a$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 p0, 0x43

    return p0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to serialize CurveType "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static h(Lbf/a;)Laf/s;
    .locals 2

    invoke-static {}, Laf/s;->h0()Laf/s$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/a;->d()Lbf/a$d;

    move-result-object v1

    invoke-static {v1}, Lcf/g;->u(Lbf/a$d;)Laf/b0;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/s$b;->E(Laf/b0;)Laf/s$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/a;->c()Lbf/a$c;

    move-result-object v1

    invoke-static {v1}, Lcf/g;->t(Lbf/a$c;)Laf/z;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/s$b;->C(Laf/z;)Laf/s$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/a;->e()Lbf/a$e;

    move-result-object p0

    invoke-static {p0}, Lcf/g;->w(Lbf/a$e;)Laf/v;

    move-result-object p0

    invoke-virtual {v0, p0}, Laf/s$b;->D(Laf/v;)Laf/s$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Laf/s;

    return-object p0
.end method

.method public static i(Lbf/c;)Laf/u;
    .locals 3

    invoke-virtual {p0}, Lbf/c;->d()Lbf/a;

    move-result-object v0

    invoke-virtual {v0}, Lbf/a;->c()Lbf/a$c;

    move-result-object v0

    invoke-static {v0}, Lcf/g;->g(Lbf/a$c;)I

    move-result v0

    invoke-virtual {p0}, Lbf/c;->e()Ljava/security/spec/ECPoint;

    move-result-object v1

    invoke-static {}, Laf/u;->i0()Laf/u$b;

    move-result-object v2

    invoke-virtual {p0}, Lbf/c;->d()Lbf/a;

    move-result-object p0

    invoke-static {p0}, Lcf/g;->h(Lbf/a;)Laf/s;

    move-result-object p0

    invoke-virtual {v2, p0}, Laf/u$b;->C(Laf/s;)Laf/u$b;

    move-result-object p0

    invoke-virtual {v1}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    move-result-object v2

    invoke-static {v2, v0}, Lwe/a;->c(Ljava/math/BigInteger;I)[B

    move-result-object v2

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {p0, v2}, Laf/u$b;->D(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/u$b;

    move-result-object p0

    invoke-virtual {v1}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v1, v0}, Lwe/a;->c(Ljava/math/BigInteger;I)[B

    move-result-object v0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {p0, v0}, Laf/u$b;->E(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/u$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Laf/u;

    return-object p0
.end method

.method public static j(Lwe/m0;)Lbf/a;
    .locals 3

    invoke-virtual {p0}, Lwe/m0;->d()Laf/h0;

    move-result-object v0

    invoke-virtual {v0}, Laf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Lwe/m0;->d()Laf/h0;

    move-result-object v0

    invoke-virtual {v0}, Laf/h0;->g0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Laf/r;->d0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/r;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lbf/a;->b()Lbf/a$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/r;->b0()Laf/s;

    move-result-object v2

    invoke-virtual {v2}, Laf/s;->g0()Laf/b0;

    move-result-object v2

    invoke-static {v2}, Lcf/g;->s(Laf/b0;)Lbf/a$d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lbf/a$b;->c(Lbf/a$d;)Lbf/a$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/r;->b0()Laf/s;

    move-result-object v2

    invoke-virtual {v2}, Laf/s;->f0()Laf/v;

    move-result-object v2

    invoke-static {v2}, Lcf/g;->x(Laf/v;)Lbf/a$e;

    move-result-object v2

    invoke-virtual {v1, v2}, Lbf/a$b;->d(Lbf/a$e;)Lbf/a$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/r;->b0()Laf/s;

    move-result-object v0

    invoke-virtual {v0}, Laf/s;->d0()Laf/z;

    move-result-object v0

    invoke-static {v0}, Lcf/g;->r(Laf/z;)Lbf/a$c;

    move-result-object v0

    invoke-virtual {v1, v0}, Lbf/a$b;->b(Lbf/a$c;)Lbf/a$b;

    move-result-object v0

    invoke-virtual {p0}, Lwe/m0;->d()Laf/h0;

    move-result-object p0

    invoke-virtual {p0}, Laf/h0;->e0()Laf/p0;

    move-result-object p0

    invoke-static {p0}, Lcf/g;->y(Laf/p0;)Lbf/a$f;

    move-result-object p0

    invoke-virtual {v0, p0}, Lbf/a$b;->e(Lbf/a$f;)Lbf/a$b;

    move-result-object p0

    invoke-virtual {p0}, Lbf/a$b;->a()Lbf/a;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing EcdsaParameters failed: "

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong type URL in call to EcdsaProtoSerialization.parseParameters: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lwe/m0;->d()Laf/h0;

    move-result-object p0

    invoke-virtual {p0}, Laf/h0;->f0()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static k(Lwe/l0;Lpe/d0;)Lbf/b;
    .locals 5

    invoke-virtual {p0}, Lwe/l0;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    invoke-virtual {p0}, Lwe/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Laf/t;->g0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/t;

    move-result-object v0

    invoke-virtual {v0}, Laf/t;->e0()I

    move-result v1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "Only version 0 keys are accepted"

    if-nez v1, :cond_1

    :try_start_1
    invoke-virtual {v0}, Laf/t;->d0()Laf/u;

    move-result-object v1

    invoke-virtual {v1}, Laf/u;->f0()I

    move-result v3

    if-nez v3, :cond_0

    invoke-static {}, Lbf/a;->b()Lbf/a$b;

    move-result-object v2

    invoke-virtual {v1}, Laf/u;->e0()Laf/s;

    move-result-object v3

    invoke-virtual {v3}, Laf/s;->g0()Laf/b0;

    move-result-object v3

    invoke-static {v3}, Lcf/g;->s(Laf/b0;)Lbf/a$d;

    move-result-object v3

    invoke-virtual {v2, v3}, Lbf/a$b;->c(Lbf/a$d;)Lbf/a$b;

    move-result-object v2

    invoke-virtual {v1}, Laf/u;->e0()Laf/s;

    move-result-object v3

    invoke-virtual {v3}, Laf/s;->f0()Laf/v;

    move-result-object v3

    invoke-static {v3}, Lcf/g;->x(Laf/v;)Lbf/a$e;

    move-result-object v3

    invoke-virtual {v2, v3}, Lbf/a$b;->d(Lbf/a$e;)Lbf/a$b;

    move-result-object v2

    invoke-virtual {v1}, Laf/u;->e0()Laf/s;

    move-result-object v3

    invoke-virtual {v3}, Laf/s;->d0()Laf/z;

    move-result-object v3

    invoke-static {v3}, Lcf/g;->r(Laf/z;)Lbf/a$c;

    move-result-object v3

    invoke-virtual {v2, v3}, Lbf/a$b;->b(Lbf/a$c;)Lbf/a$b;

    move-result-object v2

    invoke-virtual {p0}, Lwe/l0;->e()Laf/p0;

    move-result-object v3

    invoke-static {v3}, Lcf/g;->y(Laf/p0;)Lbf/a$f;

    move-result-object v3

    invoke-virtual {v2, v3}, Lbf/a$b;->e(Lbf/a$f;)Lbf/a$b;

    move-result-object v2

    invoke-virtual {v2}, Lbf/a$b;->a()Lbf/a;

    move-result-object v2

    invoke-static {}, Lbf/c;->c()Lbf/c$b;

    move-result-object v3

    invoke-virtual {v3, v2}, Lbf/c$b;->d(Lbf/a;)Lbf/c$b;

    move-result-object v2

    new-instance v3, Ljava/security/spec/ECPoint;

    invoke-virtual {v1}, Laf/u;->g0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/crypto/tink/shaded/protobuf/h;->x()[B

    move-result-object v4

    invoke-static {v4}, Lwe/a;->a([B)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v1}, Laf/u;->h0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->x()[B

    move-result-object v1

    invoke-static {v1}, Lwe/a;->a([B)Ljava/math/BigInteger;

    move-result-object v1

    invoke-direct {v3, v4, v1}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v2, v3}, Lbf/c$b;->e(Ljava/security/spec/ECPoint;)Lbf/c$b;

    move-result-object v1

    invoke-virtual {p0}, Lwe/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v1, p0}, Lbf/c$b;->c(Ljava/lang/Integer;)Lbf/c$b;

    move-result-object p0

    invoke-virtual {p0}, Lbf/c$b;->a()Lbf/c;

    move-result-object p0

    invoke-static {}, Lbf/b;->d()Lbf/b$b;

    move-result-object v1

    invoke-virtual {v1, p0}, Lbf/b$b;->c(Lbf/c;)Lbf/b$b;

    move-result-object p0

    invoke-virtual {v0}, Laf/t;->c0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->x()[B

    move-result-object v0

    invoke-static {v0}, Lwe/a;->a([B)Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {p1}, Lpe/d0;->b(Lpe/d0;)Lpe/d0;

    move-result-object p1

    invoke-static {v0, p1}, Lef/b;->a(Ljava/math/BigInteger;Lpe/d0;)Lef/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbf/b$b;->b(Lef/b;)Lbf/b$b;

    move-result-object p0

    invoke-virtual {p0}, Lbf/b$b;->a()Lbf/b;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Parsing EcdsaPrivateKey failed"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lwe/l0;->f()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static l(Lwe/l0;Lpe/d0;)Lbf/c;
    .locals 3

    invoke-virtual {p0}, Lwe/l0;->f()Ljava/lang/String;

    move-result-object p1

    const-string v0, "type.googleapis.com/google.crypto.tink.EcdsaPublicKey"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lwe/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Laf/u;->j0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/u;

    move-result-object p1

    invoke-virtual {p1}, Laf/u;->f0()I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lbf/a;->b()Lbf/a$b;

    move-result-object v0

    invoke-virtual {p1}, Laf/u;->e0()Laf/s;

    move-result-object v1

    invoke-virtual {v1}, Laf/s;->g0()Laf/b0;

    move-result-object v1

    invoke-static {v1}, Lcf/g;->s(Laf/b0;)Lbf/a$d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbf/a$b;->c(Lbf/a$d;)Lbf/a$b;

    move-result-object v0

    invoke-virtual {p1}, Laf/u;->e0()Laf/s;

    move-result-object v1

    invoke-virtual {v1}, Laf/s;->f0()Laf/v;

    move-result-object v1

    invoke-static {v1}, Lcf/g;->x(Laf/v;)Lbf/a$e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbf/a$b;->d(Lbf/a$e;)Lbf/a$b;

    move-result-object v0

    invoke-virtual {p1}, Laf/u;->e0()Laf/s;

    move-result-object v1

    invoke-virtual {v1}, Laf/s;->d0()Laf/z;

    move-result-object v1

    invoke-static {v1}, Lcf/g;->r(Laf/z;)Lbf/a$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbf/a$b;->b(Lbf/a$c;)Lbf/a$b;

    move-result-object v0

    invoke-virtual {p0}, Lwe/l0;->e()Laf/p0;

    move-result-object v1

    invoke-static {v1}, Lcf/g;->y(Laf/p0;)Lbf/a$f;

    move-result-object v1

    invoke-virtual {v0, v1}, Lbf/a$b;->e(Lbf/a$f;)Lbf/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lbf/a$b;->a()Lbf/a;

    move-result-object v0

    invoke-static {}, Lbf/c;->c()Lbf/c$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lbf/c$b;->d(Lbf/a;)Lbf/c$b;

    move-result-object v0

    new-instance v1, Ljava/security/spec/ECPoint;

    invoke-virtual {p1}, Laf/u;->g0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->x()[B

    move-result-object v2

    invoke-static {v2}, Lwe/a;->a([B)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p1}, Laf/u;->h0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->x()[B

    move-result-object p1

    invoke-static {p1}, Lwe/a;->a([B)Ljava/math/BigInteger;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Lbf/c$b;->e(Ljava/security/spec/ECPoint;)Lbf/c$b;

    move-result-object p1

    invoke-virtual {p0}, Lwe/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0}, Lbf/c$b;->c(Ljava/lang/Integer;)Lbf/c$b;

    move-result-object p0

    invoke-virtual {p0}, Lbf/c$b;->a()Lbf/c;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Only version 0 keys are accepted"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Parsing EcdsaPublicKey failed"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lwe/l0;->f()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static m()V
    .locals 1

    invoke-static {}, Lwe/d0;->c()Lwe/d0;

    move-result-object v0

    invoke-static {v0}, Lcf/g;->n(Lwe/d0;)V

    return-void
.end method

.method public static n(Lwe/d0;)V
    .locals 1

    sget-object v0, Lcf/g;->c:Lwe/g0;

    invoke-virtual {p0, v0}, Lwe/d0;->m(Lwe/g0;)V

    sget-object v0, Lcf/g;->d:Lwe/f0;

    invoke-virtual {p0, v0}, Lwe/d0;->l(Lwe/f0;)V

    sget-object v0, Lcf/g;->e:Lwe/n;

    invoke-virtual {p0, v0}, Lwe/d0;->k(Lwe/n;)V

    sget-object v0, Lcf/g;->f:Lwe/m;

    invoke-virtual {p0, v0}, Lwe/d0;->j(Lwe/m;)V

    sget-object v0, Lcf/g;->g:Lwe/n;

    invoke-virtual {p0, v0}, Lwe/d0;->k(Lwe/n;)V

    sget-object v0, Lcf/g;->h:Lwe/m;

    invoke-virtual {p0, v0}, Lwe/d0;->j(Lwe/m;)V

    return-void
.end method

.method public static o(Lbf/a;)Lwe/m0;
    .locals 3

    invoke-static {}, Laf/h0;->h0()Laf/h0$b;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"

    invoke-virtual {v0, v1}, Laf/h0$b;->D(Ljava/lang/String;)Laf/h0$b;

    move-result-object v0

    invoke-static {}, Laf/r;->c0()Laf/r$b;

    move-result-object v1

    invoke-static {p0}, Lcf/g;->h(Lbf/a;)Laf/s;

    move-result-object v2

    invoke-virtual {v1, v2}, Laf/r$b;->C(Laf/s;)Laf/r$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v1

    check-cast v1, Laf/r;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/h0$b;->E(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/h0$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/a;->f()Lbf/a$f;

    move-result-object p0

    invoke-static {p0}, Lcf/g;->v(Lbf/a$f;)Laf/p0;

    move-result-object p0

    invoke-virtual {v0, p0}, Laf/h0$b;->C(Laf/p0;)Laf/h0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Laf/h0;

    invoke-static {p0}, Lwe/m0;->c(Laf/h0;)Lwe/m0;

    move-result-object p0

    return-object p0
.end method

.method public static p(Lbf/b;Lpe/d0;)Lwe/l0;
    .locals 3

    invoke-virtual {p0}, Lbf/b;->e()Lbf/a;

    move-result-object v0

    invoke-virtual {v0}, Lbf/a;->c()Lbf/a$c;

    move-result-object v0

    invoke-static {v0}, Lcf/g;->g(Lbf/a$c;)I

    move-result v0

    invoke-static {}, Laf/t;->f0()Laf/t$b;

    move-result-object v1

    invoke-virtual {p0}, Lbf/b;->g()Lbf/c;

    move-result-object v2

    invoke-static {v2}, Lcf/g;->i(Lbf/c;)Laf/u;

    move-result-object v2

    invoke-virtual {v1, v2}, Laf/t$b;->D(Laf/u;)Laf/t$b;

    move-result-object v1

    invoke-virtual {p0}, Lbf/b;->f()Lef/b;

    move-result-object v2

    invoke-static {p1}, Lpe/d0;->b(Lpe/d0;)Lpe/d0;

    move-result-object p1

    invoke-virtual {v2, p1}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {p1, v0}, Lwe/a;->c(Ljava/math/BigInteger;I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v1, p1}, Laf/t$b;->C(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/t$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Laf/t;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Laf/f0$c;->d:Laf/f0$c;

    invoke-virtual {p0}, Lbf/b;->e()Lbf/a;

    move-result-object v1

    invoke-virtual {v1}, Lbf/a;->f()Lbf/a$f;

    move-result-object v1

    invoke-static {v1}, Lcf/g;->v(Lbf/a$f;)Laf/p0;

    move-result-object v1

    invoke-virtual {p0}, Lbf/b1;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"

    invoke-static {v2, p1, v0, v1, p0}, Lwe/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Laf/f0$c;Laf/p0;Ljava/lang/Integer;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method

.method public static q(Lbf/c;Lpe/d0;)Lwe/l0;
    .locals 3

    invoke-static {p0}, Lcf/g;->i(Lbf/c;)Laf/u;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Laf/f0$c;->e:Laf/f0$c;

    invoke-virtual {p0}, Lbf/c;->d()Lbf/a;

    move-result-object v1

    invoke-virtual {v1}, Lbf/a;->f()Lbf/a$f;

    move-result-object v1

    invoke-static {v1}, Lcf/g;->v(Lbf/a$f;)Laf/p0;

    move-result-object v1

    invoke-virtual {p0}, Lbf/c;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.EcdsaPublicKey"

    invoke-static {v2, p1, v0, v1, p0}, Lwe/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Laf/f0$c;Laf/p0;Ljava/lang/Integer;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method

.method public static r(Laf/z;)Lbf/a$c;
    .locals 3

    sget-object v0, Lcf/g$a;->c:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    sget-object p0, Lbf/a$c;->e:Lbf/a$c;

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to parse EllipticCurveType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Laf/z;->getNumber()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lbf/a$c;->d:Lbf/a$c;

    return-object p0

    :cond_2
    sget-object p0, Lbf/a$c;->c:Lbf/a$c;

    return-object p0
.end method

.method public static s(Laf/b0;)Lbf/a$d;
    .locals 3

    sget-object v0, Lcf/g$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    sget-object p0, Lbf/a$d;->d:Lbf/a$d;

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to parse HashType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Laf/b0;->getNumber()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lbf/a$d;->c:Lbf/a$d;

    return-object p0

    :cond_2
    sget-object p0, Lbf/a$d;->b:Lbf/a$d;

    return-object p0
.end method

.method public static t(Lbf/a$c;)Laf/z;
    .locals 3

    sget-object v0, Lbf/a$c;->c:Lbf/a$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Laf/z;->c:Laf/z;

    return-object p0

    :cond_0
    sget-object v0, Lbf/a$c;->d:Lbf/a$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Laf/z;->d:Laf/z;

    return-object p0

    :cond_1
    sget-object v0, Lbf/a$c;->e:Lbf/a$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Laf/z;->e:Laf/z;

    return-object p0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to serialize CurveType "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static u(Lbf/a$d;)Laf/b0;
    .locals 3

    sget-object v0, Lbf/a$d;->b:Lbf/a$d;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Laf/b0;->e:Laf/b0;

    return-object p0

    :cond_0
    sget-object v0, Lbf/a$d;->c:Lbf/a$d;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Laf/b0;->d:Laf/b0;

    return-object p0

    :cond_1
    sget-object v0, Lbf/a$d;->d:Lbf/a$d;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Laf/b0;->f:Laf/b0;

    return-object p0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to serialize HashType "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static v(Lbf/a$f;)Laf/p0;
    .locals 3

    sget-object v0, Lbf/a$f;->b:Lbf/a$f;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Laf/p0;->c:Laf/p0;

    return-object p0

    :cond_0
    sget-object v0, Lbf/a$f;->c:Lbf/a$f;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Laf/p0;->f:Laf/p0;

    return-object p0

    :cond_1
    sget-object v0, Lbf/a$f;->e:Lbf/a$f;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Laf/p0;->e:Laf/p0;

    return-object p0

    :cond_2
    sget-object v0, Lbf/a$f;->d:Lbf/a$f;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Laf/p0;->d:Laf/p0;

    return-object p0

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to serialize variant: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static w(Lbf/a$e;)Laf/v;
    .locals 3

    sget-object v0, Lbf/a$e;->b:Lbf/a$e;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Laf/v;->c:Laf/v;

    return-object p0

    :cond_0
    sget-object v0, Lbf/a$e;->c:Lbf/a$e;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Laf/v;->d:Laf/v;

    return-object p0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to serialize SignatureEncoding "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static x(Laf/v;)Lbf/a$e;
    .locals 3

    sget-object v0, Lcf/g$a;->d:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    sget-object p0, Lbf/a$e;->c:Lbf/a$e;

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to parse EcdsaSignatureEncoding: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Laf/v;->getNumber()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lbf/a$e;->b:Lbf/a$e;

    return-object p0
.end method

.method public static y(Laf/p0;)Lbf/a$f;
    .locals 3

    sget-object v0, Lcf/g$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    sget-object p0, Lbf/a$f;->e:Lbf/a$f;

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to parse OutputPrefixType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Laf/p0;->getNumber()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lbf/a$f;->d:Lbf/a$f;

    return-object p0

    :cond_2
    sget-object p0, Lbf/a$f;->c:Lbf/a$f;

    return-object p0

    :cond_3
    sget-object p0, Lbf/a$f;->b:Lbf/a$f;

    return-object p0
.end method
