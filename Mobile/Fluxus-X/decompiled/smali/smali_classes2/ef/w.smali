.class public final Lef/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgf/a;

.field public static final b:Lgf/a;

.field public static final c:Lye/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/g0<",
            "Ldf/j0;",
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
            "Ldf/l0;",
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
            "Ldf/k0;",
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

.field public static final i:Lye/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h<",
            "Lcf/p0;",
            "Ldf/j0$d;",
            ">;"
        }
    .end annotation
.end field

.field public static final j:Lye/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h<",
            "Lcf/b0;",
            "Ldf/j0$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey"

    invoke-static {v0}, Lye/s0;->h(Ljava/lang/String;)Lgf/a;

    move-result-object v0

    sput-object v0, Lef/w;->a:Lgf/a;

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey"

    invoke-static {v1}, Lye/s0;->h(Ljava/lang/String;)Lgf/a;

    move-result-object v1

    sput-object v1, Lef/w;->b:Lgf/a;

    new-instance v2, Lef/q;

    invoke-direct {v2}, Lef/q;-><init>()V

    const-class v3, Ldf/j0;

    const-class v4, Lye/m0;

    invoke-static {v2, v3, v4}, Lye/g0;->a(Lye/g0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/g0;

    move-result-object v2

    sput-object v2, Lef/w;->c:Lye/g0;

    new-instance v2, Lef/r;

    invoke-direct {v2}, Lef/r;-><init>()V

    invoke-static {v2, v0, v4}, Lye/f0;->a(Lye/f0$b;Lgf/a;Ljava/lang/Class;)Lye/f0;

    move-result-object v2

    sput-object v2, Lef/w;->d:Lye/f0;

    new-instance v2, Lef/s;

    invoke-direct {v2}, Lef/s;-><init>()V

    const-class v3, Ldf/l0;

    const-class v4, Lye/l0;

    invoke-static {v2, v3, v4}, Lye/n;->a(Lye/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/n;

    move-result-object v2

    sput-object v2, Lef/w;->e:Lye/n;

    new-instance v2, Lef/t;

    invoke-direct {v2}, Lef/t;-><init>()V

    invoke-static {v2, v1, v4}, Lye/m;->a(Lye/m$b;Lgf/a;Ljava/lang/Class;)Lye/m;

    move-result-object v1

    sput-object v1, Lef/w;->f:Lye/m;

    new-instance v1, Lef/u;

    invoke-direct {v1}, Lef/u;-><init>()V

    const-class v2, Ldf/k0;

    invoke-static {v1, v2, v4}, Lye/n;->a(Lye/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/n;

    move-result-object v1

    sput-object v1, Lef/w;->g:Lye/n;

    new-instance v1, Lef/v;

    invoke-direct {v1}, Lef/v;-><init>()V

    invoke-static {v1, v0, v4}, Lye/m;->a(Lye/m$b;Lgf/a;Ljava/lang/Class;)Lye/m;

    move-result-object v0

    sput-object v0, Lef/w;->h:Lye/m;

    invoke-static {}, Lye/h;->a()Lye/h$b;

    move-result-object v0

    sget-object v1, Lcf/p0;->e:Lcf/p0;

    sget-object v2, Ldf/j0$d;->e:Ldf/j0$d;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    sget-object v1, Lcf/p0;->c:Lcf/p0;

    sget-object v2, Ldf/j0$d;->b:Ldf/j0$d;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    sget-object v1, Lcf/p0;->f:Lcf/p0;

    sget-object v2, Ldf/j0$d;->c:Ldf/j0$d;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    sget-object v1, Lcf/p0;->d:Lcf/p0;

    sget-object v2, Ldf/j0$d;->d:Ldf/j0$d;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lye/h$b;->b()Lye/h;

    move-result-object v0

    sput-object v0, Lef/w;->i:Lye/h;

    invoke-static {}, Lye/h;->a()Lye/h$b;

    move-result-object v0

    sget-object v1, Lcf/b0;->e:Lcf/b0;

    sget-object v2, Ldf/j0$c;->b:Ldf/j0$c;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    sget-object v1, Lcf/b0;->d:Lcf/b0;

    sget-object v2, Ldf/j0$c;->c:Ldf/j0$c;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    sget-object v1, Lcf/b0;->f:Lcf/b0;

    sget-object v2, Ldf/j0$c;->d:Ldf/j0$c;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lye/h$b;->b()Lye/h;

    move-result-object v0

    sput-object v0, Lef/w;->j:Lye/h;

    return-void
.end method

.method public static synthetic a(Ldf/l0;Lre/d0;)Lye/l0;
    .locals 0

    invoke-static {p0, p1}, Lef/w;->t(Ldf/l0;Lre/d0;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lye/m0;)Ldf/j0;
    .locals 0

    invoke-static {p0}, Lef/w;->m(Lye/m0;)Ldf/j0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ldf/k0;Lre/d0;)Lye/l0;
    .locals 0

    invoke-static {p0, p1}, Lef/w;->s(Ldf/k0;Lre/d0;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lye/l0;Lre/d0;)Ldf/l0;
    .locals 0

    invoke-static {p0, p1}, Lef/w;->o(Lye/l0;Lre/d0;)Ldf/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ldf/j0;)Lye/m0;
    .locals 0

    invoke-static {p0}, Lef/w;->r(Ldf/j0;)Lye/m0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lye/l0;Lre/d0;)Ldf/k0;
    .locals 0

    invoke-static {p0, p1}, Lef/w;->n(Lye/l0;Lre/d0;)Ldf/k0;

    move-result-object p0

    return-object p0
.end method

.method public static g(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/math/BigInteger;
    .locals 0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h;->v()[B

    move-result-object p0

    invoke-static {p0}, Lye/a;->a([B)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method

.method public static h(Lcom/google/crypto/tink/shaded/protobuf/h;Lre/d0;)Lgf/b;
    .locals 0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h;->v()[B

    move-result-object p0

    invoke-static {p0}, Lye/a;->a([B)Ljava/math/BigInteger;

    move-result-object p0

    invoke-static {p0, p1}, Lgf/b;->a(Ljava/math/BigInteger;Lre/d0;)Lgf/b;

    move-result-object p0

    return-object p0
.end method

.method public static i(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 0

    invoke-static {p0}, Lye/a;->b(Ljava/math/BigInteger;)[B

    move-result-object p0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    return-object p0
.end method

.method public static j(Lgf/b;Lre/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 0

    invoke-virtual {p0, p1}, Lgf/b;->b(Lre/d0;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-static {p0}, Lef/w;->i(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    return-object p0
.end method

.method public static k(Ldf/j0;)Lcf/s0;
    .locals 2

    invoke-static {}, Lcf/s0;->d0()Lcf/s0$b;

    move-result-object v0

    sget-object v1, Lef/w;->j:Lye/h;

    invoke-virtual {p0}, Ldf/j0;->c()Ldf/j0$c;

    move-result-object p0

    invoke-virtual {v1, p0}, Lye/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcf/b0;

    invoke-virtual {v0, p0}, Lcf/s0$b;->D(Lcf/b0;)Lcf/s0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lcf/s0;

    return-object p0
.end method

.method public static l(Ldf/l0;)Lcf/u0;
    .locals 2

    invoke-static {}, Lcf/u0;->i0()Lcf/u0$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/l0;->e()Ldf/j0;

    move-result-object v1

    invoke-static {v1}, Lef/w;->k(Ldf/j0;)Lcf/s0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/u0$b;->G(Lcf/s0;)Lcf/u0$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/l0;->d()Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v1}, Lef/w;->i(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/u0$b;->F(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/u0$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/l0;->e()Ldf/j0;

    move-result-object p0

    invoke-virtual {p0}, Ldf/j0;->e()Ljava/math/BigInteger;

    move-result-object p0

    invoke-static {p0}, Lef/w;->i(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcf/u0$b;->D(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/u0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lcf/u0;

    return-object p0
.end method

.method public static m(Lye/m0;)Ldf/j0;
    .locals 4

    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object v0

    invoke-virtual {v0}, Lcf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey"

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

    invoke-static {v0, v1}, Lcf/r0;->h0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/r0;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Ldf/j0;->b()Ldf/j0$b;

    move-result-object v1

    sget-object v2, Lef/w;->j:Lye/h;

    invoke-virtual {v0}, Lcf/r0;->e0()Lcf/s0;

    move-result-object v3

    invoke-virtual {v3}, Lcf/s0;->c0()Lcf/b0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lye/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldf/j0$c;

    invoke-virtual {v1, v2}, Ldf/j0$b;->b(Ldf/j0$c;)Ldf/j0$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/r0;->f0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-static {v2}, Lef/w;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v1, v2}, Ldf/j0$b;->d(Ljava/math/BigInteger;)Ldf/j0$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/r0;->d0()I

    move-result v0

    invoke-virtual {v1, v0}, Ldf/j0$b;->c(I)Ldf/j0$b;

    move-result-object v0

    sget-object v1, Lef/w;->i:Lye/h;

    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object p0

    invoke-virtual {p0}, Lcf/h0;->e0()Lcf/p0;

    move-result-object p0

    invoke-virtual {v1, p0}, Lye/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldf/j0$d;

    invoke-virtual {v0, p0}, Ldf/j0$b;->e(Ldf/j0$d;)Ldf/j0$b;

    move-result-object p0

    invoke-virtual {p0}, Ldf/j0$b;->a()Ldf/j0;

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

.method public static n(Lye/l0;Lre/d0;)Ldf/k0;
    .locals 7

    invoke-virtual {p0}, Lye/l0;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    invoke-virtual {p0}, Lye/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lcf/t0;->r0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/t0;

    move-result-object v0

    invoke-virtual {v0}, Lcf/t0;->p0()I

    move-result v1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "Only version 0 keys are accepted"

    if-nez v1, :cond_1

    :try_start_1
    invoke-virtual {v0}, Lcf/t0;->n0()Lcf/u0;

    move-result-object v1

    invoke-virtual {v1}, Lcf/u0;->h0()I

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v1}, Lcf/u0;->f0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-static {v2}, Lef/w;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->bitLength()I

    move-result v3

    invoke-virtual {v1}, Lcf/u0;->e0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v4

    invoke-static {v4}, Lef/w;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-static {}, Ldf/j0;->b()Ldf/j0$b;

    move-result-object v5

    sget-object v6, Lef/w;->j:Lye/h;

    invoke-virtual {v1}, Lcf/u0;->g0()Lcf/s0;

    move-result-object v1

    invoke-virtual {v1}, Lcf/s0;->c0()Lcf/b0;

    move-result-object v1

    invoke-virtual {v6, v1}, Lye/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldf/j0$c;

    invoke-virtual {v5, v1}, Ldf/j0$b;->b(Ldf/j0$c;)Ldf/j0$b;

    move-result-object v1

    invoke-virtual {v1, v4}, Ldf/j0$b;->d(Ljava/math/BigInteger;)Ldf/j0$b;

    move-result-object v1

    invoke-virtual {v1, v3}, Ldf/j0$b;->c(I)Ldf/j0$b;

    move-result-object v1

    sget-object v3, Lef/w;->i:Lye/h;

    invoke-virtual {p0}, Lye/l0;->e()Lcf/p0;

    move-result-object v4

    invoke-virtual {v3, v4}, Lye/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldf/j0$d;

    invoke-virtual {v1, v3}, Ldf/j0$b;->e(Ldf/j0$d;)Ldf/j0$b;

    move-result-object v1

    invoke-virtual {v1}, Ldf/j0$b;->a()Ldf/j0;

    move-result-object v1

    invoke-static {}, Ldf/l0;->c()Ldf/l0$b;

    move-result-object v3

    invoke-virtual {v3, v1}, Ldf/l0$b;->e(Ldf/j0;)Ldf/l0$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Ldf/l0$b;->d(Ljava/math/BigInteger;)Ldf/l0$b;

    move-result-object v1

    invoke-virtual {p0}, Lye/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v1, p0}, Ldf/l0$b;->c(Ljava/lang/Integer;)Ldf/l0$b;

    move-result-object p0

    invoke-virtual {p0}, Ldf/l0$b;->a()Ldf/l0;

    move-result-object p0

    invoke-static {p1}, Lre/d0;->b(Lre/d0;)Lre/d0;

    move-result-object p1

    invoke-static {}, Ldf/k0;->d()Ldf/k0$b;

    move-result-object v1

    invoke-virtual {v1, p0}, Ldf/k0$b;->f(Ldf/l0;)Ldf/k0$b;

    move-result-object p0

    invoke-virtual {v0}, Lcf/t0;->m0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-static {v1, p1}, Lef/w;->h(Lcom/google/crypto/tink/shaded/protobuf/h;Lre/d0;)Lgf/b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/t0;->o0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-static {v2, p1}, Lef/w;->h(Lcom/google/crypto/tink/shaded/protobuf/h;Lre/d0;)Lgf/b;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Ldf/k0$b;->d(Lgf/b;Lgf/b;)Ldf/k0$b;

    move-result-object p0

    invoke-virtual {v0}, Lcf/t0;->j0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-static {v1, p1}, Lef/w;->h(Lcom/google/crypto/tink/shaded/protobuf/h;Lre/d0;)Lgf/b;

    move-result-object v1

    invoke-virtual {p0, v1}, Ldf/k0$b;->e(Lgf/b;)Ldf/k0$b;

    move-result-object p0

    invoke-virtual {v0}, Lcf/t0;->k0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-static {v1, p1}, Lef/w;->h(Lcom/google/crypto/tink/shaded/protobuf/h;Lre/d0;)Lgf/b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/t0;->l0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-static {v2, p1}, Lef/w;->h(Lcom/google/crypto/tink/shaded/protobuf/h;Lre/d0;)Lgf/b;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Ldf/k0$b;->c(Lgf/b;Lgf/b;)Ldf/k0$b;

    move-result-object p0

    invoke-virtual {v0}, Lcf/t0;->i0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {v0, p1}, Lef/w;->h(Lcom/google/crypto/tink/shaded/protobuf/h;Lre/d0;)Lgf/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Ldf/k0$b;->b(Lgf/b;)Ldf/k0$b;

    move-result-object p0

    invoke-virtual {p0}, Ldf/k0$b;->a()Ldf/k0;

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

    invoke-virtual {p0}, Lye/l0;->f()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static o(Lye/l0;Lre/d0;)Ldf/l0;
    .locals 5

    invoke-virtual {p0}, Lye/l0;->f()Ljava/lang/String;

    move-result-object p1

    const-string v0, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lye/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lcf/u0;->j0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/u0;

    move-result-object p1

    invoke-virtual {p1}, Lcf/u0;->h0()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcf/u0;->f0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {v0}, Lef/w;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v1

    invoke-static {}, Ldf/j0;->b()Ldf/j0$b;

    move-result-object v2

    sget-object v3, Lef/w;->j:Lye/h;

    invoke-virtual {p1}, Lcf/u0;->g0()Lcf/s0;

    move-result-object v4

    invoke-virtual {v4}, Lcf/s0;->c0()Lcf/b0;

    move-result-object v4

    invoke-virtual {v3, v4}, Lye/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldf/j0$c;

    invoke-virtual {v2, v3}, Ldf/j0$b;->b(Ldf/j0$c;)Ldf/j0$b;

    move-result-object v2

    invoke-virtual {p1}, Lcf/u0;->e0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-static {p1}, Lef/w;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v2, p1}, Ldf/j0$b;->d(Ljava/math/BigInteger;)Ldf/j0$b;

    move-result-object p1

    invoke-virtual {p1, v1}, Ldf/j0$b;->c(I)Ldf/j0$b;

    move-result-object p1

    sget-object v1, Lef/w;->i:Lye/h;

    invoke-virtual {p0}, Lye/l0;->e()Lcf/p0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lye/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldf/j0$d;

    invoke-virtual {p1, v1}, Ldf/j0$b;->e(Ldf/j0$d;)Ldf/j0$b;

    move-result-object p1

    invoke-virtual {p1}, Ldf/j0$b;->a()Ldf/j0;

    move-result-object p1

    invoke-static {}, Ldf/l0;->c()Ldf/l0$b;

    move-result-object v1

    invoke-virtual {v1, p1}, Ldf/l0$b;->e(Ldf/j0;)Ldf/l0$b;

    move-result-object p1

    invoke-virtual {p1, v0}, Ldf/l0$b;->d(Ljava/math/BigInteger;)Ldf/l0$b;

    move-result-object p1

    invoke-virtual {p0}, Lye/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0}, Ldf/l0$b;->c(Ljava/lang/Integer;)Ldf/l0$b;

    move-result-object p0

    invoke-virtual {p0}, Ldf/l0$b;->a()Ldf/l0;

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

    invoke-virtual {p0}, Lye/l0;->f()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static p()V
    .locals 1

    invoke-static {}, Lye/d0;->c()Lye/d0;

    move-result-object v0

    invoke-static {v0}, Lef/w;->q(Lye/d0;)V

    return-void
.end method

.method public static q(Lye/d0;)V
    .locals 1

    sget-object v0, Lef/w;->c:Lye/g0;

    invoke-virtual {p0, v0}, Lye/d0;->m(Lye/g0;)V

    sget-object v0, Lef/w;->d:Lye/f0;

    invoke-virtual {p0, v0}, Lye/d0;->l(Lye/f0;)V

    sget-object v0, Lef/w;->e:Lye/n;

    invoke-virtual {p0, v0}, Lye/d0;->k(Lye/n;)V

    sget-object v0, Lef/w;->f:Lye/m;

    invoke-virtual {p0, v0}, Lye/d0;->j(Lye/m;)V

    sget-object v0, Lef/w;->g:Lye/n;

    invoke-virtual {p0, v0}, Lye/d0;->k(Lye/n;)V

    sget-object v0, Lef/w;->h:Lye/m;

    invoke-virtual {p0, v0}, Lye/d0;->j(Lye/m;)V

    return-void
.end method

.method public static r(Ldf/j0;)Lye/m0;
    .locals 3

    invoke-static {}, Lcf/h0;->h0()Lcf/h0$b;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey"

    invoke-virtual {v0, v1}, Lcf/h0$b;->F(Ljava/lang/String;)Lcf/h0$b;

    move-result-object v0

    invoke-static {}, Lcf/r0;->g0()Lcf/r0$b;

    move-result-object v1

    invoke-static {p0}, Lef/w;->k(Ldf/j0;)Lcf/s0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcf/r0$b;->F(Lcf/s0;)Lcf/r0$b;

    move-result-object v1

    invoke-virtual {p0}, Ldf/j0;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Lcf/r0$b;->D(I)Lcf/r0$b;

    move-result-object v1

    invoke-virtual {p0}, Ldf/j0;->e()Ljava/math/BigInteger;

    move-result-object v2

    invoke-static {v2}, Lef/w;->i(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcf/r0$b;->G(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/r0$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v1

    check-cast v1, Lcf/r0;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/h0$b;->G(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/h0$b;

    move-result-object v0

    sget-object v1, Lef/w;->i:Lye/h;

    invoke-virtual {p0}, Ldf/j0;->f()Ldf/j0$d;

    move-result-object p0

    invoke-virtual {v1, p0}, Lye/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcf/p0;

    invoke-virtual {v0, p0}, Lcf/h0$b;->D(Lcf/p0;)Lcf/h0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lcf/h0;

    invoke-static {p0}, Lye/m0;->c(Lcf/h0;)Lye/m0;

    move-result-object p0

    return-object p0
.end method

.method public static s(Ldf/k0;Lre/d0;)Lye/l0;
    .locals 3

    invoke-static {p1}, Lre/d0;->b(Lre/d0;)Lre/d0;

    move-result-object p1

    invoke-static {}, Lcf/t0;->q0()Lcf/t0$b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcf/t0$b;->P(I)Lcf/t0$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/k0;->l()Ldf/l0;

    move-result-object v1

    invoke-static {v1}, Lef/w;->l(Ldf/l0;)Lcf/u0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/t0$b;->M(Lcf/u0;)Lcf/t0$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/k0;->k()Lgf/b;

    move-result-object v1

    invoke-static {v1, p1}, Lef/w;->j(Lgf/b;Lre/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/t0$b;->F(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/t0$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/k0;->i()Lgf/b;

    move-result-object v1

    invoke-static {v1, p1}, Lef/w;->j(Lgf/b;Lre/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/t0$b;->J(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/t0$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/k0;->j()Lgf/b;

    move-result-object v1

    invoke-static {v1, p1}, Lef/w;->j(Lgf/b;Lre/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/t0$b;->O(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/t0$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/k0;->g()Lgf/b;

    move-result-object v1

    invoke-static {v1, p1}, Lef/w;->j(Lgf/b;Lre/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/t0$b;->G(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/t0$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/k0;->h()Lgf/b;

    move-result-object v1

    invoke-static {v1, p1}, Lef/w;->j(Lgf/b;Lre/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/t0$b;->H(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/t0$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/k0;->e()Lgf/b;

    move-result-object v1

    invoke-static {v1, p1}, Lef/w;->j(Lgf/b;Lre/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcf/t0$b;->D(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/t0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lcf/t0;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Lcf/f0$c;->d:Lcf/f0$c;

    sget-object v1, Lef/w;->i:Lye/h;

    invoke-virtual {p0}, Ldf/k0;->f()Ldf/j0;

    move-result-object v2

    invoke-virtual {v2}, Ldf/j0;->f()Ldf/j0$d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lye/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lcf/p0;

    invoke-virtual {p0}, Ldf/b1;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey"

    invoke-static {v2, p1, v0, v1, p0}, Lye/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Lcf/f0$c;Lcf/p0;Ljava/lang/Integer;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static t(Ldf/l0;Lre/d0;)Lye/l0;
    .locals 3

    invoke-static {p0}, Lef/w;->l(Ldf/l0;)Lcf/u0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Lcf/f0$c;->e:Lcf/f0$c;

    sget-object v1, Lef/w;->i:Lye/h;

    invoke-virtual {p0}, Ldf/l0;->e()Ldf/j0;

    move-result-object v2

    invoke-virtual {v2}, Ldf/j0;->f()Ldf/j0$d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lye/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lcf/p0;

    invoke-virtual {p0}, Ldf/l0;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey"

    invoke-static {v2, p1, v0, v1, p0}, Lye/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Lcf/f0$c;Lcf/p0;Ljava/lang/Integer;)Lye/l0;

    move-result-object p0

    return-object p0
.end method
