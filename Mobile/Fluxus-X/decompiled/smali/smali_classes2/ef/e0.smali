.class public final Lef/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgf/a;

.field public static final b:Lgf/a;

.field public static final c:Lye/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/g0<",
            "Ldf/r0;",
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
            "Ldf/t0;",
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
            "Ldf/s0;",
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
            "Ldf/r0$d;",
            ">;"
        }
    .end annotation
.end field

.field public static final j:Lye/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h<",
            "Lcf/b0;",
            "Ldf/r0$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey"

    invoke-static {v0}, Lye/s0;->h(Ljava/lang/String;)Lgf/a;

    move-result-object v0

    sput-object v0, Lef/e0;->a:Lgf/a;

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey"

    invoke-static {v1}, Lye/s0;->h(Ljava/lang/String;)Lgf/a;

    move-result-object v1

    sput-object v1, Lef/e0;->b:Lgf/a;

    new-instance v2, Lef/y;

    invoke-direct {v2}, Lef/y;-><init>()V

    const-class v3, Ldf/r0;

    const-class v4, Lye/m0;

    invoke-static {v2, v3, v4}, Lye/g0;->a(Lye/g0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/g0;

    move-result-object v2

    sput-object v2, Lef/e0;->c:Lye/g0;

    new-instance v2, Lef/z;

    invoke-direct {v2}, Lef/z;-><init>()V

    invoke-static {v2, v0, v4}, Lye/f0;->a(Lye/f0$b;Lgf/a;Ljava/lang/Class;)Lye/f0;

    move-result-object v2

    sput-object v2, Lef/e0;->d:Lye/f0;

    new-instance v2, Lef/a0;

    invoke-direct {v2}, Lef/a0;-><init>()V

    const-class v3, Ldf/t0;

    const-class v4, Lye/l0;

    invoke-static {v2, v3, v4}, Lye/n;->a(Lye/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/n;

    move-result-object v2

    sput-object v2, Lef/e0;->e:Lye/n;

    new-instance v2, Lef/b0;

    invoke-direct {v2}, Lef/b0;-><init>()V

    invoke-static {v2, v1, v4}, Lye/m;->a(Lye/m$b;Lgf/a;Ljava/lang/Class;)Lye/m;

    move-result-object v1

    sput-object v1, Lef/e0;->f:Lye/m;

    new-instance v1, Lef/c0;

    invoke-direct {v1}, Lef/c0;-><init>()V

    const-class v2, Ldf/s0;

    invoke-static {v1, v2, v4}, Lye/n;->a(Lye/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/n;

    move-result-object v1

    sput-object v1, Lef/e0;->g:Lye/n;

    new-instance v1, Lef/d0;

    invoke-direct {v1}, Lef/d0;-><init>()V

    invoke-static {v1, v0, v4}, Lye/m;->a(Lye/m$b;Lgf/a;Ljava/lang/Class;)Lye/m;

    move-result-object v0

    sput-object v0, Lef/e0;->h:Lye/m;

    invoke-static {}, Lye/h;->a()Lye/h$b;

    move-result-object v0

    sget-object v1, Lcf/p0;->e:Lcf/p0;

    sget-object v2, Ldf/r0$d;->e:Ldf/r0$d;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    sget-object v1, Lcf/p0;->c:Lcf/p0;

    sget-object v2, Ldf/r0$d;->b:Ldf/r0$d;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    sget-object v1, Lcf/p0;->f:Lcf/p0;

    sget-object v2, Ldf/r0$d;->c:Ldf/r0$d;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    sget-object v1, Lcf/p0;->d:Lcf/p0;

    sget-object v2, Ldf/r0$d;->d:Ldf/r0$d;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lye/h$b;->b()Lye/h;

    move-result-object v0

    sput-object v0, Lef/e0;->i:Lye/h;

    invoke-static {}, Lye/h;->a()Lye/h$b;

    move-result-object v0

    sget-object v1, Lcf/b0;->e:Lcf/b0;

    sget-object v2, Ldf/r0$c;->b:Ldf/r0$c;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    sget-object v1, Lcf/b0;->d:Lcf/b0;

    sget-object v2, Ldf/r0$c;->c:Ldf/r0$c;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    sget-object v1, Lcf/b0;->f:Lcf/b0;

    sget-object v2, Ldf/r0$c;->d:Ldf/r0$c;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lye/h$b;->b()Lye/h;

    move-result-object v0

    sput-object v0, Lef/e0;->j:Lye/h;

    return-void
.end method

.method public static synthetic a(Lye/l0;Lre/d0;)Ldf/t0;
    .locals 0

    invoke-static {p0, p1}, Lef/e0;->o(Lye/l0;Lre/d0;)Ldf/t0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lye/m0;)Ldf/r0;
    .locals 0

    invoke-static {p0}, Lef/e0;->m(Lye/m0;)Ldf/r0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ldf/r0;)Lye/m0;
    .locals 0

    invoke-static {p0}, Lef/e0;->r(Ldf/r0;)Lye/m0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ldf/t0;Lre/d0;)Lye/l0;
    .locals 0

    invoke-static {p0, p1}, Lef/e0;->t(Ldf/t0;Lre/d0;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lye/l0;Lre/d0;)Ldf/s0;
    .locals 0

    invoke-static {p0, p1}, Lef/e0;->n(Lye/l0;Lre/d0;)Ldf/s0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ldf/s0;Lre/d0;)Lye/l0;
    .locals 0

    invoke-static {p0, p1}, Lef/e0;->s(Ldf/s0;Lre/d0;)Lye/l0;

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

    invoke-static {p0}, Lef/e0;->i(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    return-object p0
.end method

.method public static k(Ldf/r0;)Lcf/w0;
    .locals 3

    invoke-static {}, Lcf/w0;->h0()Lcf/w0$b;

    move-result-object v0

    sget-object v1, Lef/e0;->j:Lye/h;

    invoke-virtual {p0}, Ldf/r0;->g()Ldf/r0$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Lye/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v2

    check-cast v2, Lcf/b0;

    invoke-virtual {v0, v2}, Lcf/w0$b;->G(Lcf/b0;)Lcf/w0$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/r0;->c()Ldf/r0$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Lye/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lcf/b0;

    invoke-virtual {v0, v1}, Lcf/w0$b;->D(Lcf/b0;)Lcf/w0$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/r0;->f()I

    move-result p0

    invoke-virtual {v0, p0}, Lcf/w0$b;->F(I)Lcf/w0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lcf/w0;

    return-object p0
.end method

.method public static l(Ldf/t0;)Lcf/y0;
    .locals 2

    invoke-static {}, Lcf/y0;->j0()Lcf/y0$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/t0;->e()Ldf/r0;

    move-result-object v1

    invoke-static {v1}, Lef/e0;->k(Ldf/r0;)Lcf/w0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/y0$b;->G(Lcf/w0;)Lcf/y0$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/t0;->d()Ljava/math/BigInteger;

    move-result-object v1

    invoke-static {v1}, Lef/e0;->i(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/y0$b;->F(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/y0$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/t0;->e()Ldf/r0;

    move-result-object p0

    invoke-virtual {p0}, Ldf/r0;->e()Ljava/math/BigInteger;

    move-result-object p0

    invoke-static {p0}, Lef/e0;->i(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcf/y0$b;->D(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/y0$b;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcf/y0$b;->H(I)Lcf/y0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lcf/y0;

    return-object p0
.end method

.method public static m(Lye/m0;)Ldf/r0;
    .locals 4

    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object v0

    invoke-virtual {v0}, Lcf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey"

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

    invoke-static {v0, v1}, Lcf/v0;->h0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/v0;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Ldf/r0;->b()Ldf/r0$b;

    move-result-object v1

    sget-object v2, Lef/e0;->j:Lye/h;

    invoke-virtual {v0}, Lcf/v0;->e0()Lcf/w0;

    move-result-object v3

    invoke-virtual {v3}, Lcf/w0;->g0()Lcf/b0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lye/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldf/r0$c;

    invoke-virtual {v1, v3}, Ldf/r0$b;->f(Ldf/r0$c;)Ldf/r0$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/v0;->e0()Lcf/w0;

    move-result-object v3

    invoke-virtual {v3}, Lcf/w0;->e0()Lcf/b0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lye/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldf/r0$c;

    invoke-virtual {v1, v2}, Ldf/r0$b;->b(Ldf/r0$c;)Ldf/r0$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/v0;->f0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-static {v2}, Lef/e0;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v1, v2}, Ldf/r0$b;->d(Ljava/math/BigInteger;)Ldf/r0$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/v0;->d0()I

    move-result v2

    invoke-virtual {v1, v2}, Ldf/r0$b;->c(I)Ldf/r0$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/v0;->e0()Lcf/w0;

    move-result-object v0

    invoke-virtual {v0}, Lcf/w0;->f0()I

    move-result v0

    invoke-virtual {v1, v0}, Ldf/r0$b;->e(I)Ldf/r0$b;

    move-result-object v0

    sget-object v1, Lef/e0;->i:Lye/h;

    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object p0

    invoke-virtual {p0}, Lcf/h0;->e0()Lcf/p0;

    move-result-object p0

    invoke-virtual {v1, p0}, Lye/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldf/r0$d;

    invoke-virtual {v0, p0}, Ldf/r0$b;->g(Ldf/r0$d;)Ldf/r0$b;

    move-result-object p0

    invoke-virtual {p0}, Ldf/r0$b;->a()Ldf/r0;

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

.method public static n(Lye/l0;Lre/d0;)Ldf/s0;
    .locals 8

    invoke-virtual {p0}, Lye/l0;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    invoke-virtual {p0}, Lye/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lcf/x0;->r0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/x0;

    move-result-object v0

    invoke-virtual {v0}, Lcf/x0;->p0()I

    move-result v1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "Only version 0 keys are accepted"

    if-nez v1, :cond_1

    :try_start_1
    invoke-virtual {v0}, Lcf/x0;->n0()Lcf/y0;

    move-result-object v1

    invoke-virtual {v1}, Lcf/y0;->i0()I

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v1}, Lcf/y0;->g0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-static {v2}, Lef/e0;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->bitLength()I

    move-result v3

    invoke-virtual {v1}, Lcf/y0;->f0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v4

    invoke-static {v4}, Lef/e0;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-static {}, Ldf/r0;->b()Ldf/r0$b;

    move-result-object v5

    sget-object v6, Lef/e0;->j:Lye/h;

    invoke-virtual {v1}, Lcf/y0;->h0()Lcf/w0;

    move-result-object v7

    invoke-virtual {v7}, Lcf/w0;->g0()Lcf/b0;

    move-result-object v7

    invoke-virtual {v6, v7}, Lye/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ldf/r0$c;

    invoke-virtual {v5, v7}, Ldf/r0$b;->f(Ldf/r0$c;)Ldf/r0$b;

    move-result-object v5

    invoke-virtual {v1}, Lcf/y0;->h0()Lcf/w0;

    move-result-object v7

    invoke-virtual {v7}, Lcf/w0;->e0()Lcf/b0;

    move-result-object v7

    invoke-virtual {v6, v7}, Lye/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ldf/r0$c;

    invoke-virtual {v5, v6}, Ldf/r0$b;->b(Ldf/r0$c;)Ldf/r0$b;

    move-result-object v5

    invoke-virtual {v5, v4}, Ldf/r0$b;->d(Ljava/math/BigInteger;)Ldf/r0$b;

    move-result-object v4

    invoke-virtual {v4, v3}, Ldf/r0$b;->c(I)Ldf/r0$b;

    move-result-object v3

    invoke-virtual {v1}, Lcf/y0;->h0()Lcf/w0;

    move-result-object v1

    invoke-virtual {v1}, Lcf/w0;->f0()I

    move-result v1

    invoke-virtual {v3, v1}, Ldf/r0$b;->e(I)Ldf/r0$b;

    move-result-object v1

    sget-object v3, Lef/e0;->i:Lye/h;

    invoke-virtual {p0}, Lye/l0;->e()Lcf/p0;

    move-result-object v4

    invoke-virtual {v3, v4}, Lye/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldf/r0$d;

    invoke-virtual {v1, v3}, Ldf/r0$b;->g(Ldf/r0$d;)Ldf/r0$b;

    move-result-object v1

    invoke-virtual {v1}, Ldf/r0$b;->a()Ldf/r0;

    move-result-object v1

    invoke-static {}, Ldf/t0;->c()Ldf/t0$b;

    move-result-object v3

    invoke-virtual {v3, v1}, Ldf/t0$b;->e(Ldf/r0;)Ldf/t0$b;

    move-result-object v1

    invoke-virtual {v1, v2}, Ldf/t0$b;->d(Ljava/math/BigInteger;)Ldf/t0$b;

    move-result-object v1

    invoke-virtual {p0}, Lye/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v1, p0}, Ldf/t0$b;->c(Ljava/lang/Integer;)Ldf/t0$b;

    move-result-object p0

    invoke-virtual {p0}, Ldf/t0$b;->a()Ldf/t0;

    move-result-object p0

    invoke-static {p1}, Lre/d0;->b(Lre/d0;)Lre/d0;

    move-result-object p1

    invoke-static {}, Ldf/s0;->d()Ldf/s0$b;

    move-result-object v1

    invoke-virtual {v1, p0}, Ldf/s0$b;->f(Ldf/t0;)Ldf/s0$b;

    move-result-object p0

    invoke-virtual {v0}, Lcf/x0;->m0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-static {v1, p1}, Lef/e0;->h(Lcom/google/crypto/tink/shaded/protobuf/h;Lre/d0;)Lgf/b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/x0;->o0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-static {v2, p1}, Lef/e0;->h(Lcom/google/crypto/tink/shaded/protobuf/h;Lre/d0;)Lgf/b;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Ldf/s0$b;->d(Lgf/b;Lgf/b;)Ldf/s0$b;

    move-result-object p0

    invoke-virtual {v0}, Lcf/x0;->j0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-static {v1, p1}, Lef/e0;->h(Lcom/google/crypto/tink/shaded/protobuf/h;Lre/d0;)Lgf/b;

    move-result-object v1

    invoke-virtual {p0, v1}, Ldf/s0$b;->e(Lgf/b;)Ldf/s0$b;

    move-result-object p0

    invoke-virtual {v0}, Lcf/x0;->k0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-static {v1, p1}, Lef/e0;->h(Lcom/google/crypto/tink/shaded/protobuf/h;Lre/d0;)Lgf/b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/x0;->l0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-static {v2, p1}, Lef/e0;->h(Lcom/google/crypto/tink/shaded/protobuf/h;Lre/d0;)Lgf/b;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Ldf/s0$b;->c(Lgf/b;Lgf/b;)Ldf/s0$b;

    move-result-object p0

    invoke-virtual {v0}, Lcf/x0;->i0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {v0, p1}, Lef/e0;->h(Lcom/google/crypto/tink/shaded/protobuf/h;Lre/d0;)Lgf/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Ldf/s0$b;->b(Lgf/b;)Ldf/s0$b;

    move-result-object p0

    invoke-virtual {p0}, Ldf/s0$b;->a()Ldf/s0;

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

    invoke-virtual {p0}, Lye/l0;->f()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static o(Lye/l0;Lre/d0;)Ldf/t0;
    .locals 5

    invoke-virtual {p0}, Lye/l0;->f()Ljava/lang/String;

    move-result-object p1

    const-string v0, "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lye/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lcf/y0;->k0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/y0;

    move-result-object p1

    invoke-virtual {p1}, Lcf/y0;->i0()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcf/y0;->g0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {v0}, Lef/e0;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->bitLength()I

    move-result v1

    invoke-static {}, Ldf/r0;->b()Ldf/r0$b;

    move-result-object v2

    sget-object v3, Lef/e0;->j:Lye/h;

    invoke-virtual {p1}, Lcf/y0;->h0()Lcf/w0;

    move-result-object v4

    invoke-virtual {v4}, Lcf/w0;->g0()Lcf/b0;

    move-result-object v4

    invoke-virtual {v3, v4}, Lye/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ldf/r0$c;

    invoke-virtual {v2, v4}, Ldf/r0$b;->f(Ldf/r0$c;)Ldf/r0$b;

    move-result-object v2

    invoke-virtual {p1}, Lcf/y0;->h0()Lcf/w0;

    move-result-object v4

    invoke-virtual {v4}, Lcf/w0;->e0()Lcf/b0;

    move-result-object v4

    invoke-virtual {v3, v4}, Lye/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldf/r0$c;

    invoke-virtual {v2, v3}, Ldf/r0$b;->b(Ldf/r0$c;)Ldf/r0$b;

    move-result-object v2

    invoke-virtual {p1}, Lcf/y0;->f0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v3

    invoke-static {v3}, Lef/e0;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldf/r0$b;->d(Ljava/math/BigInteger;)Ldf/r0$b;

    move-result-object v2

    invoke-virtual {v2, v1}, Ldf/r0$b;->c(I)Ldf/r0$b;

    move-result-object v1

    invoke-virtual {p1}, Lcf/y0;->h0()Lcf/w0;

    move-result-object p1

    invoke-virtual {p1}, Lcf/w0;->f0()I

    move-result p1

    invoke-virtual {v1, p1}, Ldf/r0$b;->e(I)Ldf/r0$b;

    move-result-object p1

    sget-object v1, Lef/e0;->i:Lye/h;

    invoke-virtual {p0}, Lye/l0;->e()Lcf/p0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lye/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldf/r0$d;

    invoke-virtual {p1, v1}, Ldf/r0$b;->g(Ldf/r0$d;)Ldf/r0$b;

    move-result-object p1

    invoke-virtual {p1}, Ldf/r0$b;->a()Ldf/r0;

    move-result-object p1

    invoke-static {}, Ldf/t0;->c()Ldf/t0$b;

    move-result-object v1

    invoke-virtual {v1, p1}, Ldf/t0$b;->e(Ldf/r0;)Ldf/t0$b;

    move-result-object p1

    invoke-virtual {p1, v0}, Ldf/t0$b;->d(Ljava/math/BigInteger;)Ldf/t0$b;

    move-result-object p1

    invoke-virtual {p0}, Lye/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0}, Ldf/t0$b;->c(Ljava/lang/Integer;)Ldf/t0$b;

    move-result-object p0

    invoke-virtual {p0}, Ldf/t0$b;->a()Ldf/t0;

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

    invoke-static {v0}, Lef/e0;->q(Lye/d0;)V

    return-void
.end method

.method public static q(Lye/d0;)V
    .locals 1

    sget-object v0, Lef/e0;->c:Lye/g0;

    invoke-virtual {p0, v0}, Lye/d0;->m(Lye/g0;)V

    sget-object v0, Lef/e0;->d:Lye/f0;

    invoke-virtual {p0, v0}, Lye/d0;->l(Lye/f0;)V

    sget-object v0, Lef/e0;->e:Lye/n;

    invoke-virtual {p0, v0}, Lye/d0;->k(Lye/n;)V

    sget-object v0, Lef/e0;->f:Lye/m;

    invoke-virtual {p0, v0}, Lye/d0;->j(Lye/m;)V

    sget-object v0, Lef/e0;->g:Lye/n;

    invoke-virtual {p0, v0}, Lye/d0;->k(Lye/n;)V

    sget-object v0, Lef/e0;->h:Lye/m;

    invoke-virtual {p0, v0}, Lye/d0;->j(Lye/m;)V

    return-void
.end method

.method public static r(Ldf/r0;)Lye/m0;
    .locals 3

    invoke-static {}, Lcf/h0;->h0()Lcf/h0$b;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey"

    invoke-virtual {v0, v1}, Lcf/h0$b;->F(Ljava/lang/String;)Lcf/h0$b;

    move-result-object v0

    invoke-static {}, Lcf/v0;->g0()Lcf/v0$b;

    move-result-object v1

    invoke-static {p0}, Lef/e0;->k(Ldf/r0;)Lcf/w0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcf/v0$b;->F(Lcf/w0;)Lcf/v0$b;

    move-result-object v1

    invoke-virtual {p0}, Ldf/r0;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Lcf/v0$b;->D(I)Lcf/v0$b;

    move-result-object v1

    invoke-virtual {p0}, Ldf/r0;->e()Ljava/math/BigInteger;

    move-result-object v2

    invoke-static {v2}, Lef/e0;->i(Ljava/math/BigInteger;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcf/v0$b;->G(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/v0$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v1

    check-cast v1, Lcf/v0;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/h0$b;->G(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/h0$b;

    move-result-object v0

    sget-object v1, Lef/e0;->i:Lye/h;

    invoke-virtual {p0}, Ldf/r0;->h()Ldf/r0$d;

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

.method public static s(Ldf/s0;Lre/d0;)Lye/l0;
    .locals 3

    invoke-static {p1}, Lre/d0;->b(Lre/d0;)Lre/d0;

    move-result-object p1

    invoke-static {}, Lcf/x0;->q0()Lcf/x0$b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcf/x0$b;->P(I)Lcf/x0$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/s0;->l()Ldf/t0;

    move-result-object v1

    invoke-static {v1}, Lef/e0;->l(Ldf/t0;)Lcf/y0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/x0$b;->M(Lcf/y0;)Lcf/x0$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/s0;->k()Lgf/b;

    move-result-object v1

    invoke-static {v1, p1}, Lef/e0;->j(Lgf/b;Lre/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/x0$b;->F(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/x0$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/s0;->i()Lgf/b;

    move-result-object v1

    invoke-static {v1, p1}, Lef/e0;->j(Lgf/b;Lre/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/x0$b;->J(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/x0$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/s0;->j()Lgf/b;

    move-result-object v1

    invoke-static {v1, p1}, Lef/e0;->j(Lgf/b;Lre/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/x0$b;->O(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/x0$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/s0;->g()Lgf/b;

    move-result-object v1

    invoke-static {v1, p1}, Lef/e0;->j(Lgf/b;Lre/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/x0$b;->G(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/x0$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/s0;->h()Lgf/b;

    move-result-object v1

    invoke-static {v1, p1}, Lef/e0;->j(Lgf/b;Lre/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/x0$b;->H(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/x0$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/s0;->e()Lgf/b;

    move-result-object v1

    invoke-static {v1, p1}, Lef/e0;->j(Lgf/b;Lre/d0;)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcf/x0$b;->D(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/x0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lcf/x0;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Lcf/f0$c;->d:Lcf/f0$c;

    sget-object v1, Lef/e0;->i:Lye/h;

    invoke-virtual {p0}, Ldf/s0;->f()Ldf/r0;

    move-result-object v2

    invoke-virtual {v2}, Ldf/r0;->h()Ldf/r0$d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lye/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lcf/p0;

    invoke-virtual {p0}, Ldf/b1;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey"

    invoke-static {v2, p1, v0, v1, p0}, Lye/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Lcf/f0$c;Lcf/p0;Ljava/lang/Integer;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static t(Ldf/t0;Lre/d0;)Lye/l0;
    .locals 3

    invoke-static {p0}, Lef/e0;->l(Ldf/t0;)Lcf/y0;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Lcf/f0$c;->e:Lcf/f0$c;

    sget-object v1, Lef/e0;->i:Lye/h;

    invoke-virtual {p0}, Ldf/t0;->e()Ldf/r0;

    move-result-object v2

    invoke-virtual {v2}, Ldf/r0;->h()Ldf/r0$d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lye/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lcf/p0;

    invoke-virtual {p0}, Ldf/t0;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey"

    invoke-static {v2, p1, v0, v1, p0}, Lye/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Lcf/f0$c;Lcf/p0;Ljava/lang/Integer;)Lye/l0;

    move-result-object p0

    return-object p0
.end method
