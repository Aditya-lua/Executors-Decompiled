.class public final Lcf/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lef/a;

.field public static final b:Lef/a;

.field public static final c:Lwe/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/g0<",
            "Lbf/j0;",
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
            "Lbf/l0;",
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
            "Lbf/k0;",
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

.field public static final i:Lwe/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h<",
            "Laf/p0;",
            "Lbf/j0$d;",
            ">;"
        }
    .end annotation
.end field

.field public static final j:Lwe/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h<",
            "Laf/b0;",
            "Lbf/j0$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey"

    invoke-static {v0}, Lwe/s0;->h(Ljava/lang/String;)Lef/a;

    move-result-object v0

    sput-object v0, Lcf/w;->a:Lef/a;

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey"

    invoke-static {v1}, Lwe/s0;->h(Ljava/lang/String;)Lef/a;

    move-result-object v1

    sput-object v1, Lcf/w;->b:Lef/a;

    new-instance v2, Lcf/q;

    invoke-direct {v2}, Lcf/q;-><init>()V

    const-class v3, Lbf/j0;

    const-class v4, Lwe/m0;

    invoke-static {v2, v3, v4}, Lwe/g0;->a(Lwe/g0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/g0;

    move-result-object v2

    sput-object v2, Lcf/w;->c:Lwe/g0;

    new-instance v2, Lcf/r;

    invoke-direct {v2}, Lcf/r;-><init>()V

    invoke-static {v2, v0, v4}, Lwe/f0;->a(Lwe/f0$b;Lef/a;Ljava/lang/Class;)Lwe/f0;

    move-result-object v2

    sput-object v2, Lcf/w;->d:Lwe/f0;

    new-instance v2, Lcf/s;

    invoke-direct {v2}, Lcf/s;-><init>()V

    const-class v3, Lbf/l0;

    const-class v4, Lwe/l0;

    invoke-static {v2, v3, v4}, Lwe/n;->a(Lwe/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/n;

    move-result-object v2

    sput-object v2, Lcf/w;->e:Lwe/n;

    new-instance v2, Lcf/t;

    invoke-direct {v2}, Lcf/t;-><init>()V

    invoke-static {v2, v1, v4}, Lwe/m;->a(Lwe/m$b;Lef/a;Ljava/lang/Class;)Lwe/m;

    move-result-object v1

    sput-object v1, Lcf/w;->f:Lwe/m;

    new-instance v1, Lcf/u;

    invoke-direct {v1}, Lcf/u;-><init>()V

    const-class v2, Lbf/k0;

    invoke-static {v1, v2, v4}, Lwe/n;->a(Lwe/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/n;

    move-result-object v1

    sput-object v1, Lcf/w;->g:Lwe/n;

    new-instance v1, Lcf/v;

    invoke-direct {v1}, Lcf/v;-><init>()V

    invoke-static {v1, v0, v4}, Lwe/m;->a(Lwe/m$b;Lef/a;Ljava/lang/Class;)Lwe/m;

    move-result-object v0

    sput-object v0, Lcf/w;->h:Lwe/m;

    invoke-static {}, Lwe/h;->a()Lwe/h$b;

    move-result-object v0

    sget-object v1, Laf/p0;->e:Laf/p0;

    sget-object v2, Lbf/j0$d;->e:Lbf/j0$d;

    invoke-virtual {v0, v1, v2}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v0

    sget-object v1, Laf/p0;->c:Laf/p0;

    sget-object v2, Lbf/j0$d;->b:Lbf/j0$d;

    invoke-virtual {v0, v1, v2}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v0

    sget-object v1, Laf/p0;->f:Laf/p0;

    sget-object v2, Lbf/j0$d;->c:Lbf/j0$d;

    invoke-virtual {v0, v1, v2}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v0

    sget-object v1, Laf/p0;->d:Laf/p0;

    sget-object v2, Lbf/j0$d;->d:Lbf/j0$d;

    invoke-virtual {v0, v1, v2}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lwe/h$b;->b()Lwe/h;

    move-result-object v0

    sput-object v0, Lcf/w;->i:Lwe/h;

    invoke-static {}, Lwe/h;->a()Lwe/h$b;

    move-result-object v0

    sget-object v1, Laf/b0;->e:Laf/b0;

    sget-object v2, Lbf/j0$c;->b:Lbf/j0$c;

    invoke-virtual {v0, v1, v2}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v0

    sget-object v1, Laf/b0;->d:Laf/b0;

    sget-object v2, Lbf/j0$c;->c:Lbf/j0$c;

    invoke-virtual {v0, v1, v2}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v0

    sget-object v1, Laf/b0;->f:Laf/b0;

    sget-object v2, Lbf/j0$c;->d:Lbf/j0$c;

    invoke-virtual {v0, v1, v2}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lwe/h$b;->b()Lwe/h;

    move-result-object v0

    sput-object v0, Lcf/w;->j:Lwe/h;

    return-void
.end method

.method public static synthetic a(Lbf/l0;Lpe/d0;)Lwe/l0;
    .locals 0

    invoke-static {p0, p1}, Lcf/w;->t(Lbf/l0;Lpe/d0;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lwe/m0;)Lbf/j0;
    .locals 0

    invoke-static {p0}, Lcf/w;->m(Lwe/m0;)Lbf/j0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lbf/k0;Lpe/d0;)Lwe/l0;
    .locals 0

    invoke-static {p0, p1}, Lcf/w;->s(Lbf/k0;Lpe/d0;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lwe/l0;Lpe/d0;)Lbf/l0;
    .locals 0

    invoke-static {p0, p1}, Lcf/w;->o(Lwe/l0;Lpe/d0;)Lbf/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lbf/j0;)Lwe/m0;
    .locals 0

    invoke-static {p0}, Lcf/w;->r(Lbf/j0;)Lwe/m0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lwe/l0;Lpe/d0;)Lbf/k0;
    .locals 0

    invoke-static {p0, p1}, Lcf/w;->n(Lwe/l0;Lpe/d0;)Lbf/k0;

    move-result-object p0

    return-object p0
.end method

.method public static g(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/math/BigInteger;
    .locals 0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h;->x()[B

    move-result-object p0

    invoke-static {p0}, Lwe/a;->a([B)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method

.method public static h(Lcom/google/crypto/tink/shaded/protobuf/h;Lpe/d0;)Lef/b;
    .locals 0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h;->x()[B

    move-result-object p0

    invoke-static {p0}, Lwe/a;->a([B)Ljava/math/BigInteger;

    move-result-object p0

    invoke-static {p0, p1}, Lef/b;->a(Ljava/math/BigInteger;Lpe/d0;)Lef/b;

    move-result-object p0

    return-object p0
.end method

.method public static i(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 0

    invoke-static {p0}, Lwe/a;->b(Ljava/math/BigInteger;)[B

    move-result-object p0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    return-object p0
.end method

.method public static j(Lef/b;Lpe/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 0

    invoke-virtual {p0, p1}, Lef/b;->b(Lpe/d0;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-static {p0}, Lcf/w;->i(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    return-object p0
.end method

.method public static k(Lbf/j0;)Laf/s0;
    .locals 2

    invoke-static {}, Laf/s0;->d0()Laf/s0$b;

    move-result-object v0

    sget-object v1, Lcf/w;->j:Lwe/h;

    invoke-virtual {p0}, Lbf/j0;->c()Lbf/j0$c;

    move-result-object p0

    invoke-virtual {v1, p0}, Lwe/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Laf/b0;

    invoke-virtual {v0, p0}, Laf/s0$b;->C(Laf/b0;)Laf/s0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Laf/s0;

    return-object p0
.end method

.method public static l(Lbf/l0;)Laf/u0;
    .locals 2

    invoke-static {}, Laf/u0;->i0()Laf/u0$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/l0;->e()Lbf/j0;

    move-result-object v1

    invoke-static {v1}, Lcf/w;->k(Lbf/j0;)Laf/s0;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/u0$b;->E(Laf/s0;)Laf/u0$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/l0;->d()Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v1}, Lcf/w;->i(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/u0$b;->D(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/u0$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/l0;->e()Lbf/j0;

    move-result-object p0

    invoke-virtual {p0}, Lbf/j0;->e()Ljava/math/BigInteger;

    move-result-object p0

    invoke-static {p0}, Lcf/w;->i(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    invoke-virtual {v0, p0}, Laf/u0$b;->C(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/u0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Laf/u0;

    return-object p0
.end method

.method public static m(Lwe/m0;)Lbf/j0;
    .locals 4

    invoke-virtual {p0}, Lwe/m0;->d()Laf/h0;

    move-result-object v0

    invoke-virtual {v0}, Laf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey"

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

    invoke-static {v0, v1}, Laf/r0;->h0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/r0;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lbf/j0;->b()Lbf/j0$b;

    move-result-object v1

    sget-object v2, Lcf/w;->j:Lwe/h;

    invoke-virtual {v0}, Laf/r0;->e0()Laf/s0;

    move-result-object v3

    invoke-virtual {v3}, Laf/s0;->c0()Laf/b0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lwe/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbf/j0$c;

    invoke-virtual {v1, v2}, Lbf/j0$b;->b(Lbf/j0$c;)Lbf/j0$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/r0;->f0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-static {v2}, Lcf/w;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v1, v2}, Lbf/j0$b;->d(Ljava/math/BigInteger;)Lbf/j0$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/r0;->d0()I

    move-result v0

    invoke-virtual {v1, v0}, Lbf/j0$b;->c(I)Lbf/j0$b;

    move-result-object v0

    sget-object v1, Lcf/w;->i:Lwe/h;

    invoke-virtual {p0}, Lwe/m0;->d()Laf/h0;

    move-result-object p0

    invoke-virtual {p0}, Laf/h0;->e0()Laf/p0;

    move-result-object p0

    invoke-virtual {v1, p0}, Lwe/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbf/j0$d;

    invoke-virtual {v0, p0}, Lbf/j0$b;->e(Lbf/j0$d;)Lbf/j0$b;

    move-result-object p0

    invoke-virtual {p0}, Lbf/j0$b;->a()Lbf/j0;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing RsaSsaPkcs1Parameters failed: "

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: "

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

.method public static n(Lwe/l0;Lpe/d0;)Lbf/k0;
    .locals 7

    invoke-virtual {p0}, Lwe/l0;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    invoke-virtual {p0}, Lwe/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Laf/t0;->r0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/t0;

    move-result-object v0

    invoke-virtual {v0}, Laf/t0;->p0()I

    move-result v1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "Only version 0 keys are accepted"

    if-nez v1, :cond_1

    :try_start_1
    invoke-virtual {v0}, Laf/t0;->n0()Laf/u0;

    move-result-object v1

    invoke-virtual {v1}, Laf/u0;->h0()I

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v1}, Laf/u0;->f0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-static {v2}, Lcf/w;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->bitLength()I

    move-result v3

    invoke-virtual {v1}, Laf/u0;->e0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v4

    invoke-static {v4}, Lcf/w;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-static {}, Lbf/j0;->b()Lbf/j0$b;

    move-result-object v5

    sget-object v6, Lcf/w;->j:Lwe/h;

    invoke-virtual {v1}, Laf/u0;->g0()Laf/s0;

    move-result-object v1

    invoke-virtual {v1}, Laf/s0;->c0()Laf/b0;

    move-result-object v1

    invoke-virtual {v6, v1}, Lwe/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbf/j0$c;

    invoke-virtual {v5, v1}, Lbf/j0$b;->b(Lbf/j0$c;)Lbf/j0$b;

    move-result-object v1

    invoke-virtual {v1, v4}, Lbf/j0$b;->d(Ljava/math/BigInteger;)Lbf/j0$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Lbf/j0$b;->c(I)Lbf/j0$b;

    move-result-object v1

    sget-object v3, Lcf/w;->i:Lwe/h;

    invoke-virtual {p0}, Lwe/l0;->e()Laf/p0;

    move-result-object v4

    invoke-virtual {v3, v4}, Lwe/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbf/j0$d;

    invoke-virtual {v1, v3}, Lbf/j0$b;->e(Lbf/j0$d;)Lbf/j0$b;

    move-result-object v1

    invoke-virtual {v1}, Lbf/j0$b;->a()Lbf/j0;

    move-result-object v1

    invoke-static {}, Lbf/l0;->c()Lbf/l0$b;

    move-result-object v3

    invoke-virtual {v3, v1}, Lbf/l0$b;->e(Lbf/j0;)Lbf/l0$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lbf/l0$b;->d(Ljava/math/BigInteger;)Lbf/l0$b;

    move-result-object v1

    invoke-virtual {p0}, Lwe/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v1, p0}, Lbf/l0$b;->c(Ljava/lang/Integer;)Lbf/l0$b;

    move-result-object p0

    invoke-virtual {p0}, Lbf/l0$b;->a()Lbf/l0;

    move-result-object p0

    invoke-static {p1}, Lpe/d0;->b(Lpe/d0;)Lpe/d0;

    move-result-object p1

    invoke-static {}, Lbf/k0;->d()Lbf/k0$b;

    move-result-object v1

    invoke-virtual {v1, p0}, Lbf/k0$b;->f(Lbf/l0;)Lbf/k0$b;

    move-result-object p0

    invoke-virtual {v0}, Laf/t0;->m0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-static {v1, p1}, Lcf/w;->h(Lcom/google/crypto/tink/shaded/protobuf/h;Lpe/d0;)Lef/b;

    move-result-object v1

    invoke-virtual {v0}, Laf/t0;->o0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-static {v2, p1}, Lcf/w;->h(Lcom/google/crypto/tink/shaded/protobuf/h;Lpe/d0;)Lef/b;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lbf/k0$b;->d(Lef/b;Lef/b;)Lbf/k0$b;

    move-result-object p0

    invoke-virtual {v0}, Laf/t0;->j0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-static {v1, p1}, Lcf/w;->h(Lcom/google/crypto/tink/shaded/protobuf/h;Lpe/d0;)Lef/b;

    move-result-object v1

    invoke-virtual {p0, v1}, Lbf/k0$b;->e(Lef/b;)Lbf/k0$b;

    move-result-object p0

    invoke-virtual {v0}, Laf/t0;->k0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-static {v1, p1}, Lcf/w;->h(Lcom/google/crypto/tink/shaded/protobuf/h;Lpe/d0;)Lef/b;

    move-result-object v1

    invoke-virtual {v0}, Laf/t0;->l0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-static {v2, p1}, Lcf/w;->h(Lcom/google/crypto/tink/shaded/protobuf/h;Lpe/d0;)Lef/b;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lbf/k0$b;->c(Lef/b;Lef/b;)Lbf/k0$b;

    move-result-object p0

    invoke-virtual {v0}, Laf/t0;->i0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {v0, p1}, Lcf/w;->h(Lcom/google/crypto/tink/shaded/protobuf/h;Lpe/d0;)Lef/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbf/k0$b;->b(Lef/b;)Lbf/k0$b;

    move-result-object p0

    invoke-virtual {p0}, Lbf/k0$b;->a()Lbf/k0;

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

    const-string p1, "Parsing RsaSsaPkcs1PrivateKey failed"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lwe/l0;->f()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static o(Lwe/l0;Lpe/d0;)Lbf/l0;
    .locals 5

    invoke-virtual {p0}, Lwe/l0;->f()Ljava/lang/String;

    move-result-object p1

    const-string v0, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lwe/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Laf/u0;->j0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/u0;

    move-result-object p1

    invoke-virtual {p1}, Laf/u0;->h0()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Laf/u0;->f0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {v0}, Lcf/w;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v1

    invoke-static {}, Lbf/j0;->b()Lbf/j0$b;

    move-result-object v2

    sget-object v3, Lcf/w;->j:Lwe/h;

    invoke-virtual {p1}, Laf/u0;->g0()Laf/s0;

    move-result-object v4

    invoke-virtual {v4}, Laf/s0;->c0()Laf/b0;

    move-result-object v4

    invoke-virtual {v3, v4}, Lwe/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbf/j0$c;

    invoke-virtual {v2, v3}, Lbf/j0$b;->b(Lbf/j0$c;)Lbf/j0$b;

    move-result-object v2

    invoke-virtual {p1}, Laf/u0;->e0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-static {p1}, Lcf/w;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v2, p1}, Lbf/j0$b;->d(Ljava/math/BigInteger;)Lbf/j0$b;

    move-result-object p1

    invoke-virtual {p1, v1}, Lbf/j0$b;->c(I)Lbf/j0$b;

    move-result-object p1

    sget-object v1, Lcf/w;->i:Lwe/h;

    invoke-virtual {p0}, Lwe/l0;->e()Laf/p0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lwe/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbf/j0$d;

    invoke-virtual {p1, v1}, Lbf/j0$b;->e(Lbf/j0$d;)Lbf/j0$b;

    move-result-object p1

    invoke-virtual {p1}, Lbf/j0$b;->a()Lbf/j0;

    move-result-object p1

    invoke-static {}, Lbf/l0;->c()Lbf/l0$b;

    move-result-object v1

    invoke-virtual {v1, p1}, Lbf/l0$b;->e(Lbf/j0;)Lbf/l0$b;

    move-result-object p1

    invoke-virtual {p1, v0}, Lbf/l0$b;->d(Ljava/math/BigInteger;)Lbf/l0$b;

    move-result-object p1

    invoke-virtual {p0}, Lwe/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0}, Lbf/l0$b;->c(Ljava/lang/Integer;)Lbf/l0$b;

    move-result-object p0

    invoke-virtual {p0}, Lbf/l0$b;->a()Lbf/l0;

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

    const-string p1, "Parsing RsaSsaPkcs1PublicKey failed"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lwe/l0;->f()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static p()V
    .locals 1

    invoke-static {}, Lwe/d0;->c()Lwe/d0;

    move-result-object v0

    invoke-static {v0}, Lcf/w;->q(Lwe/d0;)V

    return-void
.end method

.method public static q(Lwe/d0;)V
    .locals 1

    sget-object v0, Lcf/w;->c:Lwe/g0;

    invoke-virtual {p0, v0}, Lwe/d0;->m(Lwe/g0;)V

    sget-object v0, Lcf/w;->d:Lwe/f0;

    invoke-virtual {p0, v0}, Lwe/d0;->l(Lwe/f0;)V

    sget-object v0, Lcf/w;->e:Lwe/n;

    invoke-virtual {p0, v0}, Lwe/d0;->k(Lwe/n;)V

    sget-object v0, Lcf/w;->f:Lwe/m;

    invoke-virtual {p0, v0}, Lwe/d0;->j(Lwe/m;)V

    sget-object v0, Lcf/w;->g:Lwe/n;

    invoke-virtual {p0, v0}, Lwe/d0;->k(Lwe/n;)V

    sget-object v0, Lcf/w;->h:Lwe/m;

    invoke-virtual {p0, v0}, Lwe/d0;->j(Lwe/m;)V

    return-void
.end method

.method public static r(Lbf/j0;)Lwe/m0;
    .locals 3

    invoke-static {}, Laf/h0;->h0()Laf/h0$b;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey"

    invoke-virtual {v0, v1}, Laf/h0$b;->D(Ljava/lang/String;)Laf/h0$b;

    move-result-object v0

    invoke-static {}, Laf/r0;->g0()Laf/r0$b;

    move-result-object v1

    invoke-static {p0}, Lcf/w;->k(Lbf/j0;)Laf/s0;

    move-result-object v2

    invoke-virtual {v1, v2}, Laf/r0$b;->D(Laf/s0;)Laf/r0$b;

    move-result-object v1

    invoke-virtual {p0}, Lbf/j0;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Laf/r0$b;->C(I)Laf/r0$b;

    move-result-object v1

    invoke-virtual {p0}, Lbf/j0;->e()Ljava/math/BigInteger;

    move-result-object v2

    invoke-static {v2}, Lcf/w;->i(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v1, v2}, Laf/r0$b;->E(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/r0$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v1

    check-cast v1, Laf/r0;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/h0$b;->E(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/h0$b;

    move-result-object v0

    sget-object v1, Lcf/w;->i:Lwe/h;

    invoke-virtual {p0}, Lbf/j0;->f()Lbf/j0$d;

    move-result-object p0

    invoke-virtual {v1, p0}, Lwe/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Laf/p0;

    invoke-virtual {v0, p0}, Laf/h0$b;->C(Laf/p0;)Laf/h0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Laf/h0;

    invoke-static {p0}, Lwe/m0;->c(Laf/h0;)Lwe/m0;

    move-result-object p0

    return-object p0
.end method

.method public static s(Lbf/k0;Lpe/d0;)Lwe/l0;
    .locals 3

    invoke-static {p1}, Lpe/d0;->b(Lpe/d0;)Lpe/d0;

    move-result-object p1

    invoke-static {}, Laf/t0;->q0()Laf/t0$b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Laf/t0$b;->O(I)Laf/t0$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/k0;->l()Lbf/l0;

    move-result-object v1

    invoke-static {v1}, Lcf/w;->l(Lbf/l0;)Laf/u0;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/t0$b;->K(Laf/u0;)Laf/t0$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/k0;->k()Lef/b;

    move-result-object v1

    invoke-static {v1, p1}, Lcf/w;->j(Lef/b;Lpe/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/t0$b;->D(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/t0$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/k0;->i()Lef/b;

    move-result-object v1

    invoke-static {v1, p1}, Lcf/w;->j(Lef/b;Lpe/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/t0$b;->J(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/t0$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/k0;->j()Lef/b;

    move-result-object v1

    invoke-static {v1, p1}, Lcf/w;->j(Lef/b;Lpe/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/t0$b;->N(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/t0$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/k0;->g()Lef/b;

    move-result-object v1

    invoke-static {v1, p1}, Lcf/w;->j(Lef/b;Lpe/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/t0$b;->E(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/t0$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/k0;->h()Lef/b;

    move-result-object v1

    invoke-static {v1, p1}, Lcf/w;->j(Lef/b;Lpe/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/t0$b;->G(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/t0$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/k0;->e()Lef/b;

    move-result-object v1

    invoke-static {v1, p1}, Lcf/w;->j(Lef/b;Lpe/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Laf/t0$b;->C(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/t0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Laf/t0;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Laf/f0$c;->d:Laf/f0$c;

    sget-object v1, Lcf/w;->i:Lwe/h;

    invoke-virtual {p0}, Lbf/k0;->f()Lbf/j0;

    move-result-object v2

    invoke-virtual {v2}, Lbf/j0;->f()Lbf/j0$d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lwe/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Laf/p0;

    invoke-virtual {p0}, Lbf/b1;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey"

    invoke-static {v2, p1, v0, v1, p0}, Lwe/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Laf/f0$c;Laf/p0;Ljava/lang/Integer;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method

.method public static t(Lbf/l0;Lpe/d0;)Lwe/l0;
    .locals 3

    invoke-static {p0}, Lcf/w;->l(Lbf/l0;)Laf/u0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Laf/f0$c;->e:Laf/f0$c;

    sget-object v1, Lcf/w;->i:Lwe/h;

    invoke-virtual {p0}, Lbf/l0;->e()Lbf/j0;

    move-result-object v2

    invoke-virtual {v2}, Lbf/j0;->f()Lbf/j0$d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lwe/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Laf/p0;

    invoke-virtual {p0}, Lbf/l0;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey"

    invoke-static {v2, p1, v0, v1, p0}, Lwe/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Laf/f0$c;Laf/p0;Ljava/lang/Integer;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method
