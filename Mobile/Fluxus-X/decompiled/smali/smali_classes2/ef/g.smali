.class public final Lef/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgf/a;

.field public static final b:Lgf/a;

.field public static final c:Lye/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/g0<",
            "Ldf/a;",
            "Lye/m0;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lye/f0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/f0<",
            "Lye/m0;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lye/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/n<",
            "Ldf/c;",
            "Lye/l0;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lye/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/m<",
            "Lye/l0;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Lye/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/n<",
            "Ldf/b;",
            "Lye/l0;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Lye/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/m<",
            "Lye/l0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"

    invoke-static {v0}, Lye/s0;->h(Ljava/lang/String;)Lgf/a;

    move-result-object v0

    sput-object v0, Lef/g;->a:Lgf/a;

    const-string v1, "type.googleapis.com/google.crypto.tink.EcdsaPublicKey"

    invoke-static {v1}, Lye/s0;->h(Ljava/lang/String;)Lgf/a;

    move-result-object v1

    sput-object v1, Lef/g;->b:Lgf/a;

    new-instance v2, Lef/a;

    invoke-direct {v2}, Lef/a;-><init>()V

    const-class v3, Ldf/a;

    const-class v4, Lye/m0;

    invoke-static {v2, v3, v4}, Lye/g0;->a(Lye/g0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/g0;

    move-result-object v2

    sput-object v2, Lef/g;->c:Lye/g0;

    new-instance v2, Lef/b;

    invoke-direct {v2}, Lef/b;-><init>()V

    invoke-static {v2, v0, v4}, Lye/f0;->a(Lye/f0$b;Lgf/a;Ljava/lang/Class;)Lye/f0;

    move-result-object v2

    sput-object v2, Lef/g;->d:Lye/f0;

    new-instance v2, Lef/c;

    invoke-direct {v2}, Lef/c;-><init>()V

    const-class v3, Ldf/c;

    const-class v4, Lye/l0;

    invoke-static {v2, v3, v4}, Lye/n;->a(Lye/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/n;

    move-result-object v2

    sput-object v2, Lef/g;->e:Lye/n;

    new-instance v2, Lef/d;

    invoke-direct {v2}, Lef/d;-><init>()V

    invoke-static {v2, v1, v4}, Lye/m;->a(Lye/m$b;Lgf/a;Ljava/lang/Class;)Lye/m;

    move-result-object v1

    sput-object v1, Lef/g;->f:Lye/m;

    new-instance v1, Lef/e;

    invoke-direct {v1}, Lef/e;-><init>()V

    const-class v2, Ldf/b;

    invoke-static {v1, v2, v4}, Lye/n;->a(Lye/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/n;

    move-result-object v1

    sput-object v1, Lef/g;->g:Lye/n;

    new-instance v1, Lef/f;

    invoke-direct {v1}, Lef/f;-><init>()V

    invoke-static {v1, v0, v4}, Lye/m;->a(Lye/m$b;Lgf/a;Ljava/lang/Class;)Lye/m;

    move-result-object v0

    sput-object v0, Lef/g;->h:Lye/m;

    return-void
.end method

.method public static synthetic a(Lye/m0;)Ldf/a;
    .locals 0

    invoke-static {p0}, Lef/g;->j(Lye/m0;)Ldf/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ldf/b;Lre/d0;)Lye/l0;
    .locals 0

    invoke-static {p0, p1}, Lef/g;->p(Ldf/b;Lre/d0;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ldf/c;Lre/d0;)Lye/l0;
    .locals 0

    invoke-static {p0, p1}, Lef/g;->q(Ldf/c;Lre/d0;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ldf/a;)Lye/m0;
    .locals 0

    invoke-static {p0}, Lef/g;->o(Ldf/a;)Lye/m0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lye/l0;Lre/d0;)Ldf/c;
    .locals 0

    invoke-static {p0, p1}, Lef/g;->l(Lye/l0;Lre/d0;)Ldf/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lye/l0;Lre/d0;)Ldf/b;
    .locals 0

    invoke-static {p0, p1}, Lef/g;->k(Lye/l0;Lre/d0;)Ldf/b;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ldf/a$c;)I
    .locals 3

    sget-object v0, Ldf/a$c;->c:Ldf/a$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 p0, 0x21

    return p0

    :cond_0
    sget-object v0, Ldf/a$c;->d:Ldf/a$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 p0, 0x31

    return p0

    :cond_1
    sget-object v0, Ldf/a$c;->e:Ldf/a$c;

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

.method public static h(Ldf/a;)Lcf/s;
    .locals 2

    invoke-static {}, Lcf/s;->h0()Lcf/s$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/a;->d()Ldf/a$d;

    move-result-object v1

    invoke-static {v1}, Lef/g;->u(Ldf/a$d;)Lcf/b0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/s$b;->G(Lcf/b0;)Lcf/s$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/a;->c()Ldf/a$c;

    move-result-object v1

    invoke-static {v1}, Lef/g;->t(Ldf/a$c;)Lcf/z;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/s$b;->D(Lcf/z;)Lcf/s$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/a;->e()Ldf/a$e;

    move-result-object p0

    invoke-static {p0}, Lef/g;->w(Ldf/a$e;)Lcf/v;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcf/s$b;->F(Lcf/v;)Lcf/s$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lcf/s;

    return-object p0
.end method

.method public static i(Ldf/c;)Lcf/u;
    .locals 3

    invoke-virtual {p0}, Ldf/c;->d()Ldf/a;

    move-result-object v0

    invoke-virtual {v0}, Ldf/a;->c()Ldf/a$c;

    move-result-object v0

    invoke-static {v0}, Lef/g;->g(Ldf/a$c;)I

    move-result v0

    invoke-virtual {p0}, Ldf/c;->e()Ljava/security/spec/ECPoint;

    move-result-object v1

    invoke-static {}, Lcf/u;->i0()Lcf/u$b;

    move-result-object v2

    invoke-virtual {p0}, Ldf/c;->d()Ldf/a;

    move-result-object p0

    invoke-static {p0}, Lef/g;->h(Ldf/a;)Lcf/s;

    move-result-object p0

    invoke-virtual {v2, p0}, Lcf/u$b;->D(Lcf/s;)Lcf/u$b;

    move-result-object p0

    invoke-virtual {v1}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    move-result-object v2

    invoke-static {v2, v0}, Lye/a;->c(Ljava/math/BigInteger;I)[B

    move-result-object v2

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcf/u$b;->F(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/u$b;

    move-result-object p0

    invoke-virtual {v1}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v1, v0}, Lye/a;->c(Ljava/math/BigInteger;I)[B

    move-result-object v0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcf/u$b;->G(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/u$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lcf/u;

    return-object p0
.end method

.method public static j(Lye/m0;)Ldf/a;
    .locals 3

    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object v0

    invoke-virtual {v0}, Lcf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object v0

    invoke-virtual {v0}, Lcf/h0;->g0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lcf/r;->d0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/r;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Ldf/a;->b()Ldf/a$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/r;->b0()Lcf/s;

    move-result-object v2

    invoke-virtual {v2}, Lcf/s;->g0()Lcf/b0;

    move-result-object v2

    invoke-static {v2}, Lef/g;->s(Lcf/b0;)Ldf/a$d;

    move-result-object v2

    invoke-virtual {v1, v2}, Ldf/a$b;->c(Ldf/a$d;)Ldf/a$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/r;->b0()Lcf/s;

    move-result-object v2

    invoke-virtual {v2}, Lcf/s;->f0()Lcf/v;

    move-result-object v2

    invoke-static {v2}, Lef/g;->x(Lcf/v;)Ldf/a$e;

    move-result-object v2

    invoke-virtual {v1, v2}, Ldf/a$b;->d(Ldf/a$e;)Ldf/a$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/r;->b0()Lcf/s;

    move-result-object v0

    invoke-virtual {v0}, Lcf/s;->d0()Lcf/z;

    move-result-object v0

    invoke-static {v0}, Lef/g;->r(Lcf/z;)Ldf/a$c;

    move-result-object v0

    invoke-virtual {v1, v0}, Ldf/a$b;->b(Ldf/a$c;)Ldf/a$b;

    move-result-object v0

    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object p0

    invoke-virtual {p0}, Lcf/h0;->e0()Lcf/p0;

    move-result-object p0

    invoke-static {p0}, Lef/g;->y(Lcf/p0;)Ldf/a$f;

    move-result-object p0

    invoke-virtual {v0, p0}, Ldf/a$b;->e(Ldf/a$f;)Ldf/a$b;

    move-result-object p0

    invoke-virtual {p0}, Ldf/a$b;->a()Ldf/a;

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

    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object p0

    invoke-virtual {p0}, Lcf/h0;->f0()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static k(Lye/l0;Lre/d0;)Ldf/b;
    .locals 5

    invoke-virtual {p0}, Lye/l0;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    invoke-virtual {p0}, Lye/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lcf/t;->g0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/t;

    move-result-object v0

    invoke-virtual {v0}, Lcf/t;->e0()I

    move-result v1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "Only version 0 keys are accepted"

    if-nez v1, :cond_1

    :try_start_1
    invoke-virtual {v0}, Lcf/t;->d0()Lcf/u;

    move-result-object v1

    invoke-virtual {v1}, Lcf/u;->f0()I

    move-result v3

    if-nez v3, :cond_0

    invoke-static {}, Ldf/a;->b()Ldf/a$b;

    move-result-object v2

    invoke-virtual {v1}, Lcf/u;->e0()Lcf/s;

    move-result-object v3

    invoke-virtual {v3}, Lcf/s;->g0()Lcf/b0;

    move-result-object v3

    invoke-static {v3}, Lef/g;->s(Lcf/b0;)Ldf/a$d;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldf/a$b;->c(Ldf/a$d;)Ldf/a$b;

    move-result-object v2

    invoke-virtual {v1}, Lcf/u;->e0()Lcf/s;

    move-result-object v3

    invoke-virtual {v3}, Lcf/s;->f0()Lcf/v;

    move-result-object v3

    invoke-static {v3}, Lef/g;->x(Lcf/v;)Ldf/a$e;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldf/a$b;->d(Ldf/a$e;)Ldf/a$b;

    move-result-object v2

    invoke-virtual {v1}, Lcf/u;->e0()Lcf/s;

    move-result-object v3

    invoke-virtual {v3}, Lcf/s;->d0()Lcf/z;

    move-result-object v3

    invoke-static {v3}, Lef/g;->r(Lcf/z;)Ldf/a$c;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldf/a$b;->b(Ldf/a$c;)Ldf/a$b;

    move-result-object v2

    invoke-virtual {p0}, Lye/l0;->e()Lcf/p0;

    move-result-object v3

    invoke-static {v3}, Lef/g;->y(Lcf/p0;)Ldf/a$f;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldf/a$b;->e(Ldf/a$f;)Ldf/a$b;

    move-result-object v2

    invoke-virtual {v2}, Ldf/a$b;->a()Ldf/a;

    move-result-object v2

    invoke-static {}, Ldf/c;->c()Ldf/c$b;

    move-result-object v3

    invoke-virtual {v3, v2}, Ldf/c$b;->d(Ldf/a;)Ldf/c$b;

    move-result-object v2

    new-instance v3, Ljava/security/spec/ECPoint;

    invoke-virtual {v1}, Lcf/u;->g0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/crypto/tink/shaded/protobuf/h;->v()[B

    move-result-object v4

    invoke-static {v4}, Lye/a;->a([B)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v1}, Lcf/u;->h0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->v()[B

    move-result-object v1

    invoke-static {v1}, Lye/a;->a([B)Ljava/math/BigInteger;

    move-result-object v1

    invoke-direct {v3, v4, v1}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v2, v3}, Ldf/c$b;->e(Ljava/security/spec/ECPoint;)Ldf/c$b;

    move-result-object v1

    invoke-virtual {p0}, Lye/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v1, p0}, Ldf/c$b;->c(Ljava/lang/Integer;)Ldf/c$b;

    move-result-object p0

    invoke-virtual {p0}, Ldf/c$b;->a()Ldf/c;

    move-result-object p0

    invoke-static {}, Ldf/b;->d()Ldf/b$b;

    move-result-object v1

    invoke-virtual {v1, p0}, Ldf/b$b;->c(Ldf/c;)Ldf/b$b;

    move-result-object p0

    invoke-virtual {v0}, Lcf/t;->c0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->v()[B

    move-result-object v0

    invoke-static {v0}, Lye/a;->a([B)Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {p1}, Lre/d0;->b(Lre/d0;)Lre/d0;

    move-result-object p1

    invoke-static {v0, p1}, Lgf/b;->a(Ljava/math/BigInteger;Lre/d0;)Lgf/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Ldf/b$b;->b(Lgf/b;)Ldf/b$b;

    move-result-object p0

    invoke-virtual {p0}, Ldf/b$b;->a()Ldf/b;

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

    invoke-virtual {p0}, Lye/l0;->f()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static l(Lye/l0;Lre/d0;)Ldf/c;
    .locals 3

    invoke-virtual {p0}, Lye/l0;->f()Ljava/lang/String;

    move-result-object p1

    const-string v0, "type.googleapis.com/google.crypto.tink.EcdsaPublicKey"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lye/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lcf/u;->j0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/u;

    move-result-object p1

    invoke-virtual {p1}, Lcf/u;->f0()I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ldf/a;->b()Ldf/a$b;

    move-result-object v0

    invoke-virtual {p1}, Lcf/u;->e0()Lcf/s;

    move-result-object v1

    invoke-virtual {v1}, Lcf/s;->g0()Lcf/b0;

    move-result-object v1

    invoke-static {v1}, Lef/g;->s(Lcf/b0;)Ldf/a$d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldf/a$b;->c(Ldf/a$d;)Ldf/a$b;

    move-result-object v0

    invoke-virtual {p1}, Lcf/u;->e0()Lcf/s;

    move-result-object v1

    invoke-virtual {v1}, Lcf/s;->f0()Lcf/v;

    move-result-object v1

    invoke-static {v1}, Lef/g;->x(Lcf/v;)Ldf/a$e;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldf/a$b;->d(Ldf/a$e;)Ldf/a$b;

    move-result-object v0

    invoke-virtual {p1}, Lcf/u;->e0()Lcf/s;

    move-result-object v1

    invoke-virtual {v1}, Lcf/s;->d0()Lcf/z;

    move-result-object v1

    invoke-static {v1}, Lef/g;->r(Lcf/z;)Ldf/a$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldf/a$b;->b(Ldf/a$c;)Ldf/a$b;

    move-result-object v0

    invoke-virtual {p0}, Lye/l0;->e()Lcf/p0;

    move-result-object v1

    invoke-static {v1}, Lef/g;->y(Lcf/p0;)Ldf/a$f;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldf/a$b;->e(Ldf/a$f;)Ldf/a$b;

    move-result-object v0

    invoke-virtual {v0}, Ldf/a$b;->a()Ldf/a;

    move-result-object v0

    invoke-static {}, Ldf/c;->c()Ldf/c$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Ldf/c$b;->d(Ldf/a;)Ldf/c$b;

    move-result-object v0

    new-instance v1, Ljava/security/spec/ECPoint;

    invoke-virtual {p1}, Lcf/u;->g0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->v()[B

    move-result-object v2

    invoke-static {v2}, Lye/a;->a([B)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p1}, Lcf/u;->h0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->v()[B

    move-result-object p1

    invoke-static {p1}, Lye/a;->a([B)Ljava/math/BigInteger;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {v0, v1}, Ldf/c$b;->e(Ljava/security/spec/ECPoint;)Ldf/c$b;

    move-result-object p1

    invoke-virtual {p0}, Lye/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0}, Ldf/c$b;->c(Ljava/lang/Integer;)Ldf/c$b;

    move-result-object p0

    invoke-virtual {p0}, Ldf/c$b;->a()Ldf/c;

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

    invoke-virtual {p0}, Lye/l0;->f()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static m()V
    .locals 1

    invoke-static {}, Lye/d0;->c()Lye/d0;

    move-result-object v0

    invoke-static {v0}, Lef/g;->n(Lye/d0;)V

    return-void
.end method

.method public static n(Lye/d0;)V
    .locals 1

    sget-object v0, Lef/g;->c:Lye/g0;

    invoke-virtual {p0, v0}, Lye/d0;->m(Lye/g0;)V

    sget-object v0, Lef/g;->d:Lye/f0;

    invoke-virtual {p0, v0}, Lye/d0;->l(Lye/f0;)V

    sget-object v0, Lef/g;->e:Lye/n;

    invoke-virtual {p0, v0}, Lye/d0;->k(Lye/n;)V

    sget-object v0, Lef/g;->f:Lye/m;

    invoke-virtual {p0, v0}, Lye/d0;->j(Lye/m;)V

    sget-object v0, Lef/g;->g:Lye/n;

    invoke-virtual {p0, v0}, Lye/d0;->k(Lye/n;)V

    sget-object v0, Lef/g;->h:Lye/m;

    invoke-virtual {p0, v0}, Lye/d0;->j(Lye/m;)V

    return-void
.end method

.method public static o(Ldf/a;)Lye/m0;
    .locals 3

    invoke-static {}, Lcf/h0;->h0()Lcf/h0$b;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"

    invoke-virtual {v0, v1}, Lcf/h0$b;->F(Ljava/lang/String;)Lcf/h0$b;

    move-result-object v0

    invoke-static {}, Lcf/r;->c0()Lcf/r$b;

    move-result-object v1

    invoke-static {p0}, Lef/g;->h(Ldf/a;)Lcf/s;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcf/r$b;->D(Lcf/s;)Lcf/r$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v1

    check-cast v1, Lcf/r;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/h0$b;->G(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/h0$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/a;->f()Ldf/a$f;

    move-result-object p0

    invoke-static {p0}, Lef/g;->v(Ldf/a$f;)Lcf/p0;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcf/h0$b;->D(Lcf/p0;)Lcf/h0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lcf/h0;

    invoke-static {p0}, Lye/m0;->c(Lcf/h0;)Lye/m0;

    move-result-object p0

    return-object p0
.end method

.method public static p(Ldf/b;Lre/d0;)Lye/l0;
    .locals 3

    invoke-virtual {p0}, Ldf/b;->e()Ldf/a;

    move-result-object v0

    invoke-virtual {v0}, Ldf/a;->c()Ldf/a$c;

    move-result-object v0

    invoke-static {v0}, Lef/g;->g(Ldf/a$c;)I

    move-result v0

    invoke-static {}, Lcf/t;->f0()Lcf/t$b;

    move-result-object v1

    invoke-virtual {p0}, Ldf/b;->g()Ldf/c;

    move-result-object v2

    invoke-static {v2}, Lef/g;->i(Ldf/c;)Lcf/u;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcf/t$b;->F(Lcf/u;)Lcf/t$b;

    move-result-object v1

    invoke-virtual {p0}, Ldf/b;->f()Lgf/b;

    move-result-object v2

    invoke-static {p1}, Lre/d0;->b(Lre/d0;)Lre/d0;

    move-result-object p1

    invoke-virtual {v2, p1}, Lgf/b;->b(Lre/d0;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {p1, v0}, Lye/a;->c(Ljava/math/BigInteger;I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcf/t$b;->D(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/t$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lcf/t;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Lcf/f0$c;->d:Lcf/f0$c;

    invoke-virtual {p0}, Ldf/b;->e()Ldf/a;

    move-result-object v1

    invoke-virtual {v1}, Ldf/a;->f()Ldf/a$f;

    move-result-object v1

    invoke-static {v1}, Lef/g;->v(Ldf/a$f;)Lcf/p0;

    move-result-object v1

    invoke-virtual {p0}, Ldf/b1;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey"

    invoke-static {v2, p1, v0, v1, p0}, Lye/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Lcf/f0$c;Lcf/p0;Ljava/lang/Integer;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static q(Ldf/c;Lre/d0;)Lye/l0;
    .locals 3

    invoke-static {p0}, Lef/g;->i(Ldf/c;)Lcf/u;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Lcf/f0$c;->e:Lcf/f0$c;

    invoke-virtual {p0}, Ldf/c;->d()Ldf/a;

    move-result-object v1

    invoke-virtual {v1}, Ldf/a;->f()Ldf/a$f;

    move-result-object v1

    invoke-static {v1}, Lef/g;->v(Ldf/a$f;)Lcf/p0;

    move-result-object v1

    invoke-virtual {p0}, Ldf/c;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.EcdsaPublicKey"

    invoke-static {v2, p1, v0, v1, p0}, Lye/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Lcf/f0$c;Lcf/p0;Ljava/lang/Integer;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static r(Lcf/z;)Ldf/a$c;
    .locals 3

    sget-object v0, Lef/g$a;->c:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    sget-object p0, Ldf/a$c;->e:Ldf/a$c;

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to parse EllipticCurveType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcf/z;->getNumber()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Ldf/a$c;->d:Ldf/a$c;

    return-object p0

    :cond_2
    sget-object p0, Ldf/a$c;->c:Ldf/a$c;

    return-object p0
.end method

.method public static s(Lcf/b0;)Ldf/a$d;
    .locals 3

    sget-object v0, Lef/g$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    sget-object p0, Ldf/a$d;->d:Ldf/a$d;

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to parse HashType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcf/b0;->getNumber()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Ldf/a$d;->c:Ldf/a$d;

    return-object p0

    :cond_2
    sget-object p0, Ldf/a$d;->b:Ldf/a$d;

    return-object p0
.end method

.method public static t(Ldf/a$c;)Lcf/z;
    .locals 3

    sget-object v0, Ldf/a$c;->c:Ldf/a$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcf/z;->c:Lcf/z;

    return-object p0

    :cond_0
    sget-object v0, Ldf/a$c;->d:Ldf/a$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lcf/z;->d:Lcf/z;

    return-object p0

    :cond_1
    sget-object v0, Ldf/a$c;->e:Ldf/a$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lcf/z;->e:Lcf/z;

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

.method public static u(Ldf/a$d;)Lcf/b0;
    .locals 3

    sget-object v0, Ldf/a$d;->b:Ldf/a$d;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcf/b0;->e:Lcf/b0;

    return-object p0

    :cond_0
    sget-object v0, Ldf/a$d;->c:Ldf/a$d;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lcf/b0;->d:Lcf/b0;

    return-object p0

    :cond_1
    sget-object v0, Ldf/a$d;->d:Ldf/a$d;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lcf/b0;->f:Lcf/b0;

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

.method public static v(Ldf/a$f;)Lcf/p0;
    .locals 3

    sget-object v0, Ldf/a$f;->b:Ldf/a$f;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcf/p0;->c:Lcf/p0;

    return-object p0

    :cond_0
    sget-object v0, Ldf/a$f;->c:Ldf/a$f;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lcf/p0;->f:Lcf/p0;

    return-object p0

    :cond_1
    sget-object v0, Ldf/a$f;->e:Ldf/a$f;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lcf/p0;->e:Lcf/p0;

    return-object p0

    :cond_2
    sget-object v0, Ldf/a$f;->d:Ldf/a$f;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Lcf/p0;->d:Lcf/p0;

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

.method public static w(Ldf/a$e;)Lcf/v;
    .locals 3

    sget-object v0, Ldf/a$e;->b:Ldf/a$e;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcf/v;->c:Lcf/v;

    return-object p0

    :cond_0
    sget-object v0, Ldf/a$e;->c:Ldf/a$e;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lcf/v;->d:Lcf/v;

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

.method public static x(Lcf/v;)Ldf/a$e;
    .locals 3

    sget-object v0, Lef/g$a;->d:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    sget-object p0, Ldf/a$e;->c:Ldf/a$e;

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to parse EcdsaSignatureEncoding: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcf/v;->getNumber()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Ldf/a$e;->b:Ldf/a$e;

    return-object p0
.end method

.method public static y(Lcf/p0;)Ldf/a$f;
    .locals 3

    sget-object v0, Lef/g$a;->b:[I

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

    sget-object p0, Ldf/a$f;->e:Ldf/a$f;

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to parse OutputPrefixType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcf/p0;->getNumber()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Ldf/a$f;->d:Ldf/a$f;

    return-object p0

    :cond_2
    sget-object p0, Ldf/a$f;->c:Ldf/a$f;

    return-object p0

    :cond_3
    sget-object p0, Ldf/a$f;->b:Ldf/a$f;

    return-object p0
.end method
