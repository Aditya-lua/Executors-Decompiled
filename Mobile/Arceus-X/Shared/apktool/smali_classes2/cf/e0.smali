.class public final Lcf/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lef/a;

.field public static final b:Lef/a;

.field public static final c:Lwe/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/g0<",
            "Lbf/r0;",
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
            "Lbf/t0;",
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
            "Lbf/s0;",
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
            "Lbf/r0$d;",
            ">;"
        }
    .end annotation
.end field

.field public static final j:Lwe/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h<",
            "Laf/b0;",
            "Lbf/r0$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey"

    invoke-static {v0}, Lwe/s0;->h(Ljava/lang/String;)Lef/a;

    move-result-object v0

    sput-object v0, Lcf/e0;->a:Lef/a;

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey"

    invoke-static {v1}, Lwe/s0;->h(Ljava/lang/String;)Lef/a;

    move-result-object v1

    sput-object v1, Lcf/e0;->b:Lef/a;

    new-instance v2, Lcf/y;

    invoke-direct {v2}, Lcf/y;-><init>()V

    const-class v3, Lbf/r0;

    const-class v4, Lwe/m0;

    invoke-static {v2, v3, v4}, Lwe/g0;->a(Lwe/g0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/g0;

    move-result-object v2

    sput-object v2, Lcf/e0;->c:Lwe/g0;

    new-instance v2, Lcf/z;

    invoke-direct {v2}, Lcf/z;-><init>()V

    invoke-static {v2, v0, v4}, Lwe/f0;->a(Lwe/f0$b;Lef/a;Ljava/lang/Class;)Lwe/f0;

    move-result-object v2

    sput-object v2, Lcf/e0;->d:Lwe/f0;

    new-instance v2, Lcf/a0;

    invoke-direct {v2}, Lcf/a0;-><init>()V

    const-class v3, Lbf/t0;

    const-class v4, Lwe/l0;

    invoke-static {v2, v3, v4}, Lwe/n;->a(Lwe/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/n;

    move-result-object v2

    sput-object v2, Lcf/e0;->e:Lwe/n;

    new-instance v2, Lcf/b0;

    invoke-direct {v2}, Lcf/b0;-><init>()V

    invoke-static {v2, v1, v4}, Lwe/m;->a(Lwe/m$b;Lef/a;Ljava/lang/Class;)Lwe/m;

    move-result-object v1

    sput-object v1, Lcf/e0;->f:Lwe/m;

    new-instance v1, Lcf/c0;

    invoke-direct {v1}, Lcf/c0;-><init>()V

    const-class v2, Lbf/s0;

    invoke-static {v1, v2, v4}, Lwe/n;->a(Lwe/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/n;

    move-result-object v1

    sput-object v1, Lcf/e0;->g:Lwe/n;

    new-instance v1, Lcf/d0;

    invoke-direct {v1}, Lcf/d0;-><init>()V

    invoke-static {v1, v0, v4}, Lwe/m;->a(Lwe/m$b;Lef/a;Ljava/lang/Class;)Lwe/m;

    move-result-object v0

    sput-object v0, Lcf/e0;->h:Lwe/m;

    invoke-static {}, Lwe/h;->a()Lwe/h$b;

    move-result-object v0

    sget-object v1, Laf/p0;->e:Laf/p0;

    sget-object v2, Lbf/r0$d;->e:Lbf/r0$d;

    invoke-virtual {v0, v1, v2}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v0

    sget-object v1, Laf/p0;->c:Laf/p0;

    sget-object v2, Lbf/r0$d;->b:Lbf/r0$d;

    invoke-virtual {v0, v1, v2}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v0

    sget-object v1, Laf/p0;->f:Laf/p0;

    sget-object v2, Lbf/r0$d;->c:Lbf/r0$d;

    invoke-virtual {v0, v1, v2}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v0

    sget-object v1, Laf/p0;->d:Laf/p0;

    sget-object v2, Lbf/r0$d;->d:Lbf/r0$d;

    invoke-virtual {v0, v1, v2}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lwe/h$b;->b()Lwe/h;

    move-result-object v0

    sput-object v0, Lcf/e0;->i:Lwe/h;

    invoke-static {}, Lwe/h;->a()Lwe/h$b;

    move-result-object v0

    sget-object v1, Laf/b0;->e:Laf/b0;

    sget-object v2, Lbf/r0$c;->b:Lbf/r0$c;

    invoke-virtual {v0, v1, v2}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v0

    sget-object v1, Laf/b0;->d:Laf/b0;

    sget-object v2, Lbf/r0$c;->c:Lbf/r0$c;

    invoke-virtual {v0, v1, v2}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v0

    sget-object v1, Laf/b0;->f:Laf/b0;

    sget-object v2, Lbf/r0$c;->d:Lbf/r0$c;

    invoke-virtual {v0, v1, v2}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lwe/h$b;->b()Lwe/h;

    move-result-object v0

    sput-object v0, Lcf/e0;->j:Lwe/h;

    return-void
.end method

.method public static synthetic a(Lwe/l0;Lpe/d0;)Lbf/t0;
    .locals 0

    invoke-static {p0, p1}, Lcf/e0;->o(Lwe/l0;Lpe/d0;)Lbf/t0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lwe/m0;)Lbf/r0;
    .locals 0

    invoke-static {p0}, Lcf/e0;->m(Lwe/m0;)Lbf/r0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lbf/r0;)Lwe/m0;
    .locals 0

    invoke-static {p0}, Lcf/e0;->r(Lbf/r0;)Lwe/m0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lbf/t0;Lpe/d0;)Lwe/l0;
    .locals 0

    invoke-static {p0, p1}, Lcf/e0;->t(Lbf/t0;Lpe/d0;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lwe/l0;Lpe/d0;)Lbf/s0;
    .locals 0

    invoke-static {p0, p1}, Lcf/e0;->n(Lwe/l0;Lpe/d0;)Lbf/s0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lbf/s0;Lpe/d0;)Lwe/l0;
    .locals 0

    invoke-static {p0, p1}, Lcf/e0;->s(Lbf/s0;Lpe/d0;)Lwe/l0;

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

    invoke-static {p0}, Lcf/e0;->i(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    return-object p0
.end method

.method public static k(Lbf/r0;)Laf/w0;
    .locals 3

    invoke-static {}, Laf/w0;->h0()Laf/w0$b;

    move-result-object v0

    sget-object v1, Lcf/e0;->j:Lwe/h;

    invoke-virtual {p0}, Lbf/r0;->g()Lbf/r0$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Lwe/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v2

    check-cast v2, Laf/b0;

    invoke-virtual {v0, v2}, Laf/w0$b;->E(Laf/b0;)Laf/w0$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/r0;->c()Lbf/r0$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Lwe/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Laf/b0;

    invoke-virtual {v0, v1}, Laf/w0$b;->C(Laf/b0;)Laf/w0$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/r0;->f()I

    move-result p0

    invoke-virtual {v0, p0}, Laf/w0$b;->D(I)Laf/w0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Laf/w0;

    return-object p0
.end method

.method public static l(Lbf/t0;)Laf/y0;
    .locals 2

    invoke-static {}, Laf/y0;->j0()Laf/y0$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/t0;->e()Lbf/r0;

    move-result-object v1

    invoke-static {v1}, Lcf/e0;->k(Lbf/r0;)Laf/w0;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/y0$b;->E(Laf/w0;)Laf/y0$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/t0;->d()Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v1}, Lcf/e0;->i(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/y0$b;->D(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/y0$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/t0;->e()Lbf/r0;

    move-result-object p0

    invoke-virtual {p0}, Lbf/r0;->e()Ljava/math/BigInteger;

    move-result-object p0

    invoke-static {p0}, Lcf/e0;->i(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    invoke-virtual {v0, p0}, Laf/y0$b;->C(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/y0$b;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Laf/y0$b;->G(I)Laf/y0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Laf/y0;

    return-object p0
.end method

.method public static m(Lwe/m0;)Lbf/r0;
    .locals 4

    invoke-virtual {p0}, Lwe/m0;->d()Laf/h0;

    move-result-object v0

    invoke-virtual {v0}, Laf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey"

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

    invoke-static {v0, v1}, Laf/v0;->h0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/v0;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lbf/r0;->b()Lbf/r0$b;

    move-result-object v1

    sget-object v2, Lcf/e0;->j:Lwe/h;

    invoke-virtual {v0}, Laf/v0;->e0()Laf/w0;

    move-result-object v3

    invoke-virtual {v3}, Laf/w0;->g0()Laf/b0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lwe/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbf/r0$c;

    invoke-virtual {v1, v3}, Lbf/r0$b;->f(Lbf/r0$c;)Lbf/r0$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/v0;->e0()Laf/w0;

    move-result-object v3

    invoke-virtual {v3}, Laf/w0;->e0()Laf/b0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lwe/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbf/r0$c;

    invoke-virtual {v1, v2}, Lbf/r0$b;->b(Lbf/r0$c;)Lbf/r0$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/v0;->f0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-static {v2}, Lcf/e0;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v1, v2}, Lbf/r0$b;->d(Ljava/math/BigInteger;)Lbf/r0$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/v0;->d0()I

    move-result v2

    invoke-virtual {v1, v2}, Lbf/r0$b;->c(I)Lbf/r0$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/v0;->e0()Laf/w0;

    move-result-object v0

    invoke-virtual {v0}, Laf/w0;->f0()I

    move-result v0

    invoke-virtual {v1, v0}, Lbf/r0$b;->e(I)Lbf/r0$b;

    move-result-object v0

    sget-object v1, Lcf/e0;->i:Lwe/h;

    invoke-virtual {p0}, Lwe/m0;->d()Laf/h0;

    move-result-object p0

    invoke-virtual {p0}, Laf/h0;->e0()Laf/p0;

    move-result-object p0

    invoke-virtual {v1, p0}, Lwe/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbf/r0$d;

    invoke-virtual {v0, p0}, Lbf/r0$b;->g(Lbf/r0$d;)Lbf/r0$b;

    move-result-object p0

    invoke-virtual {p0}, Lbf/r0$b;->a()Lbf/r0;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing RsaSsaPssParameters failed: "

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: "

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

.method public static n(Lwe/l0;Lpe/d0;)Lbf/s0;
    .locals 8

    invoke-virtual {p0}, Lwe/l0;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    invoke-virtual {p0}, Lwe/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Laf/x0;->r0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/x0;

    move-result-object v0

    invoke-virtual {v0}, Laf/x0;->p0()I

    move-result v1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "Only version 0 keys are accepted"

    if-nez v1, :cond_1

    :try_start_1
    invoke-virtual {v0}, Laf/x0;->n0()Laf/y0;

    move-result-object v1

    invoke-virtual {v1}, Laf/y0;->i0()I

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v1}, Laf/y0;->g0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-static {v2}, Lcf/e0;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->bitLength()I

    move-result v3

    invoke-virtual {v1}, Laf/y0;->f0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v4

    invoke-static {v4}, Lcf/e0;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-static {}, Lbf/r0;->b()Lbf/r0$b;

    move-result-object v5

    sget-object v6, Lcf/e0;->j:Lwe/h;

    invoke-virtual {v1}, Laf/y0;->h0()Laf/w0;

    move-result-object v7

    invoke-virtual {v7}, Laf/w0;->g0()Laf/b0;

    move-result-object v7

    invoke-virtual {v6, v7}, Lwe/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lbf/r0$c;

    invoke-virtual {v5, v7}, Lbf/r0$b;->f(Lbf/r0$c;)Lbf/r0$b;

    move-result-object v5

    invoke-virtual {v1}, Laf/y0;->h0()Laf/w0;

    move-result-object v7

    invoke-virtual {v7}, Laf/w0;->e0()Laf/b0;

    move-result-object v7

    invoke-virtual {v6, v7}, Lwe/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lbf/r0$c;

    invoke-virtual {v5, v6}, Lbf/r0$b;->b(Lbf/r0$c;)Lbf/r0$b;

    move-result-object v5

    invoke-virtual {v5, v4}, Lbf/r0$b;->d(Ljava/math/BigInteger;)Lbf/r0$b;

    move-result-object v4

    invoke-virtual {v4, v3}, Lbf/r0$b;->c(I)Lbf/r0$b;

    move-result-object v3

    invoke-virtual {v1}, Laf/y0;->h0()Laf/w0;

    move-result-object v1

    invoke-virtual {v1}, Laf/w0;->f0()I

    move-result v1

    invoke-virtual {v3, v1}, Lbf/r0$b;->e(I)Lbf/r0$b;

    move-result-object v1

    sget-object v3, Lcf/e0;->i:Lwe/h;

    invoke-virtual {p0}, Lwe/l0;->e()Laf/p0;

    move-result-object v4

    invoke-virtual {v3, v4}, Lwe/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbf/r0$d;

    invoke-virtual {v1, v3}, Lbf/r0$b;->g(Lbf/r0$d;)Lbf/r0$b;

    move-result-object v1

    invoke-virtual {v1}, Lbf/r0$b;->a()Lbf/r0;

    move-result-object v1

    invoke-static {}, Lbf/t0;->c()Lbf/t0$b;

    move-result-object v3

    invoke-virtual {v3, v1}, Lbf/t0$b;->e(Lbf/r0;)Lbf/t0$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lbf/t0$b;->d(Ljava/math/BigInteger;)Lbf/t0$b;

    move-result-object v1

    invoke-virtual {p0}, Lwe/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v1, p0}, Lbf/t0$b;->c(Ljava/lang/Integer;)Lbf/t0$b;

    move-result-object p0

    invoke-virtual {p0}, Lbf/t0$b;->a()Lbf/t0;

    move-result-object p0

    invoke-static {p1}, Lpe/d0;->b(Lpe/d0;)Lpe/d0;

    move-result-object p1

    invoke-static {}, Lbf/s0;->d()Lbf/s0$b;

    move-result-object v1

    invoke-virtual {v1, p0}, Lbf/s0$b;->f(Lbf/t0;)Lbf/s0$b;

    move-result-object p0

    invoke-virtual {v0}, Laf/x0;->m0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-static {v1, p1}, Lcf/e0;->h(Lcom/google/crypto/tink/shaded/protobuf/h;Lpe/d0;)Lef/b;

    move-result-object v1

    invoke-virtual {v0}, Laf/x0;->o0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-static {v2, p1}, Lcf/e0;->h(Lcom/google/crypto/tink/shaded/protobuf/h;Lpe/d0;)Lef/b;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lbf/s0$b;->d(Lef/b;Lef/b;)Lbf/s0$b;

    move-result-object p0

    invoke-virtual {v0}, Laf/x0;->j0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-static {v1, p1}, Lcf/e0;->h(Lcom/google/crypto/tink/shaded/protobuf/h;Lpe/d0;)Lef/b;

    move-result-object v1

    invoke-virtual {p0, v1}, Lbf/s0$b;->e(Lef/b;)Lbf/s0$b;

    move-result-object p0

    invoke-virtual {v0}, Laf/x0;->k0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-static {v1, p1}, Lcf/e0;->h(Lcom/google/crypto/tink/shaded/protobuf/h;Lpe/d0;)Lef/b;

    move-result-object v1

    invoke-virtual {v0}, Laf/x0;->l0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-static {v2, p1}, Lcf/e0;->h(Lcom/google/crypto/tink/shaded/protobuf/h;Lpe/d0;)Lef/b;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lbf/s0$b;->c(Lef/b;Lef/b;)Lbf/s0$b;

    move-result-object p0

    invoke-virtual {v0}, Laf/x0;->i0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {v0, p1}, Lcf/e0;->h(Lcom/google/crypto/tink/shaded/protobuf/h;Lpe/d0;)Lef/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbf/s0$b;->b(Lef/b;)Lbf/s0$b;

    move-result-object p0

    invoke-virtual {p0}, Lbf/s0$b;->a()Lbf/s0;

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

    const-string p1, "Parsing RsaSsaPssPrivateKey failed"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lwe/l0;->f()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static o(Lwe/l0;Lpe/d0;)Lbf/t0;
    .locals 5

    invoke-virtual {p0}, Lwe/l0;->f()Ljava/lang/String;

    move-result-object p1

    const-string v0, "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lwe/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Laf/y0;->k0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/y0;

    move-result-object p1

    invoke-virtual {p1}, Laf/y0;->i0()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Laf/y0;->g0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {v0}, Lcf/e0;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v1

    invoke-static {}, Lbf/r0;->b()Lbf/r0$b;

    move-result-object v2

    sget-object v3, Lcf/e0;->j:Lwe/h;

    invoke-virtual {p1}, Laf/y0;->h0()Laf/w0;

    move-result-object v4

    invoke-virtual {v4}, Laf/w0;->g0()Laf/b0;

    move-result-object v4

    invoke-virtual {v3, v4}, Lwe/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbf/r0$c;

    invoke-virtual {v2, v4}, Lbf/r0$b;->f(Lbf/r0$c;)Lbf/r0$b;

    move-result-object v2

    invoke-virtual {p1}, Laf/y0;->h0()Laf/w0;

    move-result-object v4

    invoke-virtual {v4}, Laf/w0;->e0()Laf/b0;

    move-result-object v4

    invoke-virtual {v3, v4}, Lwe/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbf/r0$c;

    invoke-virtual {v2, v3}, Lbf/r0$b;->b(Lbf/r0$c;)Lbf/r0$b;

    move-result-object v2

    invoke-virtual {p1}, Laf/y0;->f0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v3

    invoke-static {v3}, Lcf/e0;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v2, v3}, Lbf/r0$b;->d(Ljava/math/BigInteger;)Lbf/r0$b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lbf/r0$b;->c(I)Lbf/r0$b;

    move-result-object v1

    invoke-virtual {p1}, Laf/y0;->h0()Laf/w0;

    move-result-object p1

    invoke-virtual {p1}, Laf/w0;->f0()I

    move-result p1

    invoke-virtual {v1, p1}, Lbf/r0$b;->e(I)Lbf/r0$b;

    move-result-object p1

    sget-object v1, Lcf/e0;->i:Lwe/h;

    invoke-virtual {p0}, Lwe/l0;->e()Laf/p0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lwe/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbf/r0$d;

    invoke-virtual {p1, v1}, Lbf/r0$b;->g(Lbf/r0$d;)Lbf/r0$b;

    move-result-object p1

    invoke-virtual {p1}, Lbf/r0$b;->a()Lbf/r0;

    move-result-object p1

    invoke-static {}, Lbf/t0;->c()Lbf/t0$b;

    move-result-object v1

    invoke-virtual {v1, p1}, Lbf/t0$b;->e(Lbf/r0;)Lbf/t0$b;

    move-result-object p1

    invoke-virtual {p1, v0}, Lbf/t0$b;->d(Ljava/math/BigInteger;)Lbf/t0$b;

    move-result-object p1

    invoke-virtual {p0}, Lwe/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0}, Lbf/t0$b;->c(Ljava/lang/Integer;)Lbf/t0$b;

    move-result-object p0

    invoke-virtual {p0}, Lbf/t0$b;->a()Lbf/t0;

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

    const-string p1, "Parsing RsaSsaPssPublicKey failed"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: "

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

    invoke-static {v0}, Lcf/e0;->q(Lwe/d0;)V

    return-void
.end method

.method public static q(Lwe/d0;)V
    .locals 1

    sget-object v0, Lcf/e0;->c:Lwe/g0;

    invoke-virtual {p0, v0}, Lwe/d0;->m(Lwe/g0;)V

    sget-object v0, Lcf/e0;->d:Lwe/f0;

    invoke-virtual {p0, v0}, Lwe/d0;->l(Lwe/f0;)V

    sget-object v0, Lcf/e0;->e:Lwe/n;

    invoke-virtual {p0, v0}, Lwe/d0;->k(Lwe/n;)V

    sget-object v0, Lcf/e0;->f:Lwe/m;

    invoke-virtual {p0, v0}, Lwe/d0;->j(Lwe/m;)V

    sget-object v0, Lcf/e0;->g:Lwe/n;

    invoke-virtual {p0, v0}, Lwe/d0;->k(Lwe/n;)V

    sget-object v0, Lcf/e0;->h:Lwe/m;

    invoke-virtual {p0, v0}, Lwe/d0;->j(Lwe/m;)V

    return-void
.end method

.method public static r(Lbf/r0;)Lwe/m0;
    .locals 3

    invoke-static {}, Laf/h0;->h0()Laf/h0$b;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey"

    invoke-virtual {v0, v1}, Laf/h0$b;->D(Ljava/lang/String;)Laf/h0$b;

    move-result-object v0

    invoke-static {}, Laf/v0;->g0()Laf/v0$b;

    move-result-object v1

    invoke-static {p0}, Lcf/e0;->k(Lbf/r0;)Laf/w0;

    move-result-object v2

    invoke-virtual {v1, v2}, Laf/v0$b;->D(Laf/w0;)Laf/v0$b;

    move-result-object v1

    invoke-virtual {p0}, Lbf/r0;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Laf/v0$b;->C(I)Laf/v0$b;

    move-result-object v1

    invoke-virtual {p0}, Lbf/r0;->e()Ljava/math/BigInteger;

    move-result-object v2

    invoke-static {v2}, Lcf/e0;->i(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v1, v2}, Laf/v0$b;->E(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/v0$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v1

    check-cast v1, Laf/v0;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/h0$b;->E(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/h0$b;

    move-result-object v0

    sget-object v1, Lcf/e0;->i:Lwe/h;

    invoke-virtual {p0}, Lbf/r0;->h()Lbf/r0$d;

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

.method public static s(Lbf/s0;Lpe/d0;)Lwe/l0;
    .locals 3

    invoke-static {p1}, Lpe/d0;->b(Lpe/d0;)Lpe/d0;

    move-result-object p1

    invoke-static {}, Laf/x0;->q0()Laf/x0$b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Laf/x0$b;->O(I)Laf/x0$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/s0;->l()Lbf/t0;

    move-result-object v1

    invoke-static {v1}, Lcf/e0;->l(Lbf/t0;)Laf/y0;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/x0$b;->K(Laf/y0;)Laf/x0$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/s0;->k()Lef/b;

    move-result-object v1

    invoke-static {v1, p1}, Lcf/e0;->j(Lef/b;Lpe/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/x0$b;->D(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/x0$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/s0;->i()Lef/b;

    move-result-object v1

    invoke-static {v1, p1}, Lcf/e0;->j(Lef/b;Lpe/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/x0$b;->J(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/x0$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/s0;->j()Lef/b;

    move-result-object v1

    invoke-static {v1, p1}, Lcf/e0;->j(Lef/b;Lpe/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/x0$b;->N(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/x0$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/s0;->g()Lef/b;

    move-result-object v1

    invoke-static {v1, p1}, Lcf/e0;->j(Lef/b;Lpe/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/x0$b;->E(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/x0$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/s0;->h()Lef/b;

    move-result-object v1

    invoke-static {v1, p1}, Lcf/e0;->j(Lef/b;Lpe/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/x0$b;->G(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/x0$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/s0;->e()Lef/b;

    move-result-object v1

    invoke-static {v1, p1}, Lcf/e0;->j(Lef/b;Lpe/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Laf/x0$b;->C(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/x0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Laf/x0;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Laf/f0$c;->d:Laf/f0$c;

    sget-object v1, Lcf/e0;->i:Lwe/h;

    invoke-virtual {p0}, Lbf/s0;->f()Lbf/r0;

    move-result-object v2

    invoke-virtual {v2}, Lbf/r0;->h()Lbf/r0$d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lwe/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Laf/p0;

    invoke-virtual {p0}, Lbf/b1;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey"

    invoke-static {v2, p1, v0, v1, p0}, Lwe/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Laf/f0$c;Laf/p0;Ljava/lang/Integer;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method

.method public static t(Lbf/t0;Lpe/d0;)Lwe/l0;
    .locals 3

    invoke-static {p0}, Lcf/e0;->l(Lbf/t0;)Laf/y0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Laf/f0$c;->e:Laf/f0$c;

    sget-object v1, Lcf/e0;->i:Lwe/h;

    invoke-virtual {p0}, Lbf/t0;->e()Lbf/r0;

    move-result-object v2

    invoke-virtual {v2}, Lbf/r0;->h()Lbf/r0$d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lwe/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Laf/p0;

    invoke-virtual {p0}, Lbf/t0;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey"

    invoke-static {v2, p1, v0, v1, p0}, Lwe/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Laf/f0$c;Laf/p0;Ljava/lang/Integer;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method
