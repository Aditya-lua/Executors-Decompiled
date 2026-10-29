.class public final Lre/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lef/a;

.field public static final b:Lwe/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/g0<",
            "Lqe/k;",
            "Lwe/m0;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lwe/f0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/f0<",
            "Lwe/m0;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lwe/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/n<",
            "Lqe/f;",
            "Lwe/l0;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lwe/m;
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
    .locals 4

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-static {v0}, Lwe/s0;->h(Ljava/lang/String;)Lef/a;

    move-result-object v0

    sput-object v0, Lre/e;->a:Lef/a;

    new-instance v1, Lre/a;

    invoke-direct {v1}, Lre/a;-><init>()V

    const-class v2, Lqe/k;

    const-class v3, Lwe/m0;

    invoke-static {v1, v2, v3}, Lwe/g0;->a(Lwe/g0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/g0;

    move-result-object v1

    sput-object v1, Lre/e;->b:Lwe/g0;

    new-instance v1, Lre/b;

    invoke-direct {v1}, Lre/b;-><init>()V

    invoke-static {v1, v0, v3}, Lwe/f0;->a(Lwe/f0$b;Lef/a;Ljava/lang/Class;)Lwe/f0;

    move-result-object v1

    sput-object v1, Lre/e;->c:Lwe/f0;

    new-instance v1, Lre/c;

    invoke-direct {v1}, Lre/c;-><init>()V

    const-class v2, Lqe/f;

    const-class v3, Lwe/l0;

    invoke-static {v1, v2, v3}, Lwe/n;->a(Lwe/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/n;

    move-result-object v1

    sput-object v1, Lre/e;->d:Lwe/n;

    new-instance v1, Lre/d;

    invoke-direct {v1}, Lre/d;-><init>()V

    invoke-static {v1, v0, v3}, Lwe/m;->a(Lwe/m$b;Lef/a;Ljava/lang/Class;)Lwe/m;

    move-result-object v0

    sput-object v0, Lre/e;->e:Lwe/m;

    return-void
.end method

.method public static synthetic a(Lwe/m0;)Lqe/k;
    .locals 0

    invoke-static {p0}, Lre/e;->g(Lwe/m0;)Lqe/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lqe/k;)Lwe/m0;
    .locals 0

    invoke-static {p0}, Lre/e;->k(Lqe/k;)Lwe/m0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lqe/f;Lpe/d0;)Lwe/l0;
    .locals 0

    invoke-static {p0, p1}, Lre/e;->j(Lqe/f;Lpe/d0;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lwe/l0;Lpe/d0;)Lqe/f;
    .locals 0

    invoke-static {p0, p1}, Lre/e;->f(Lwe/l0;Lpe/d0;)Lqe/f;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lqe/k;)Laf/e0;
    .locals 2

    invoke-static {}, Laf/e0;->f0()Laf/e0$b;

    move-result-object v0

    invoke-virtual {p0}, Lqe/k;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Laf/e0$b;->D(I)Laf/e0$b;

    move-result-object v0

    invoke-virtual {p0}, Lqe/k;->d()Lqe/k$c;

    move-result-object p0

    invoke-static {p0}, Lre/e;->m(Lqe/k$c;)Laf/b0;

    move-result-object p0

    invoke-virtual {v0, p0}, Laf/e0$b;->C(Laf/b0;)Laf/e0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Laf/e0;

    return-object p0
.end method

.method public static f(Lwe/l0;Lpe/d0;)Lqe/f;
    .locals 4

    invoke-virtual {p0}, Lwe/l0;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :try_start_0
    invoke-virtual {p0}, Lwe/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Laf/d;->g0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/d;

    move-result-object v0

    invoke-virtual {v0}, Laf/d;->e0()I

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Laf/d;->c0()Laf/f;

    move-result-object v1

    invoke-virtual {v1}, Laf/f;->f0()I

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Laf/d;->d0()Laf/c0;

    move-result-object v1

    invoke-virtual {v1}, Laf/c0;->f0()I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lqe/k;->b()Lqe/k$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/d;->c0()Laf/f;

    move-result-object v2

    invoke-virtual {v2}, Laf/f;->d0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Lqe/k$b;->b(I)Lqe/k$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/d;->d0()Laf/c0;

    move-result-object v2

    invoke-virtual {v2}, Laf/c0;->d0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Lqe/k$b;->d(I)Lqe/k$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/d;->c0()Laf/f;

    move-result-object v2

    invoke-virtual {v2}, Laf/f;->e0()Laf/h;

    move-result-object v2

    invoke-virtual {v2}, Laf/h;->c0()I

    move-result v2

    invoke-virtual {v1, v2}, Lqe/k$b;->e(I)Lqe/k$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/d;->d0()Laf/c0;

    move-result-object v2

    invoke-virtual {v2}, Laf/c0;->e0()Laf/e0;

    move-result-object v2

    invoke-virtual {v2}, Laf/e0;->e0()I

    move-result v2

    invoke-virtual {v1, v2}, Lqe/k$b;->f(I)Lqe/k$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/d;->d0()Laf/c0;

    move-result-object v2

    invoke-virtual {v2}, Laf/c0;->e0()Laf/e0;

    move-result-object v2

    invoke-virtual {v2}, Laf/e0;->d0()Laf/b0;

    move-result-object v2

    invoke-static {v2}, Lre/e;->l(Laf/b0;)Lqe/k$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Lqe/k$b;->c(Lqe/k$c;)Lqe/k$b;

    move-result-object v1

    invoke-virtual {p0}, Lwe/l0;->e()Laf/p0;

    move-result-object v2

    invoke-static {v2}, Lre/e;->o(Laf/p0;)Lqe/k$d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lqe/k$b;->g(Lqe/k$d;)Lqe/k$b;

    move-result-object v1

    invoke-virtual {v1}, Lqe/k$b;->a()Lqe/k;

    move-result-object v1

    invoke-static {}, Lqe/f;->b()Lqe/f$b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lqe/f$b;->f(Lqe/k;)Lqe/f$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/d;->c0()Laf/f;

    move-result-object v2

    invoke-virtual {v2}, Laf/f;->d0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->x()[B

    move-result-object v2

    invoke-static {p1}, Lpe/d0;->b(Lpe/d0;)Lpe/d0;

    move-result-object v3

    invoke-static {v2, v3}, Lef/c;->a([BLpe/d0;)Lef/c;

    move-result-object v2

    invoke-virtual {v1, v2}, Lqe/f$b;->c(Lef/c;)Lqe/f$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/d;->d0()Laf/c0;

    move-result-object v0

    invoke-virtual {v0}, Laf/c0;->d0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->x()[B

    move-result-object v0

    invoke-static {p1}, Lpe/d0;->b(Lpe/d0;)Lpe/d0;

    move-result-object p1

    invoke-static {v0, p1}, Lef/c;->a([BLpe/d0;)Lef/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Lqe/f$b;->d(Lef/c;)Lqe/f$b;

    move-result-object p1

    invoke-virtual {p0}, Lwe/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0}, Lqe/f$b;->e(Ljava/lang/Integer;)Lqe/f$b;

    move-result-object p0

    invoke-virtual {p0}, Lqe/f$b;->a()Lqe/f;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Only version 0 keys inner HMAC keys are accepted"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Only version 0 keys inner AES CTR keys are accepted"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Only version 0 keys are accepted"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Parsing AesCtrHmacAeadKey failed"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static g(Lwe/m0;)Lqe/k;
    .locals 3

    invoke-virtual {p0}, Lwe/m0;->d()Laf/h0;

    move-result-object v0

    invoke-virtual {v0}, Laf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lwe/m0;->d()Laf/h0;

    move-result-object v0

    invoke-virtual {v0}, Laf/h0;->g0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Laf/e;->f0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/e;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Laf/e;->d0()Laf/d0;

    move-result-object v1

    invoke-virtual {v1}, Laf/d0;->f0()I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lqe/k;->b()Lqe/k$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/e;->c0()Laf/g;

    move-result-object v2

    invoke-virtual {v2}, Laf/g;->d0()I

    move-result v2

    invoke-virtual {v1, v2}, Lqe/k$b;->b(I)Lqe/k$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/e;->d0()Laf/d0;

    move-result-object v2

    invoke-virtual {v2}, Laf/d0;->d0()I

    move-result v2

    invoke-virtual {v1, v2}, Lqe/k$b;->d(I)Lqe/k$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/e;->c0()Laf/g;

    move-result-object v2

    invoke-virtual {v2}, Laf/g;->e0()Laf/h;

    move-result-object v2

    invoke-virtual {v2}, Laf/h;->c0()I

    move-result v2

    invoke-virtual {v1, v2}, Lqe/k$b;->e(I)Lqe/k$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/e;->d0()Laf/d0;

    move-result-object v2

    invoke-virtual {v2}, Laf/d0;->e0()Laf/e0;

    move-result-object v2

    invoke-virtual {v2}, Laf/e0;->e0()I

    move-result v2

    invoke-virtual {v1, v2}, Lqe/k$b;->f(I)Lqe/k$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/e;->d0()Laf/d0;

    move-result-object v0

    invoke-virtual {v0}, Laf/d0;->e0()Laf/e0;

    move-result-object v0

    invoke-virtual {v0}, Laf/e0;->d0()Laf/b0;

    move-result-object v0

    invoke-static {v0}, Lre/e;->l(Laf/b0;)Lqe/k$c;

    move-result-object v0

    invoke-virtual {v1, v0}, Lqe/k$b;->c(Lqe/k$c;)Lqe/k$b;

    move-result-object v0

    invoke-virtual {p0}, Lwe/m0;->d()Laf/h0;

    move-result-object p0

    invoke-virtual {p0}, Laf/h0;->e0()Laf/p0;

    move-result-object p0

    invoke-static {p0}, Lre/e;->o(Laf/p0;)Lqe/k$d;

    move-result-object p0

    invoke-virtual {v0, p0}, Lqe/k$b;->g(Lqe/k$d;)Lqe/k$b;

    move-result-object p0

    invoke-virtual {p0}, Lqe/k$b;->a()Lqe/k;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing AesCtrHmacAeadParameters failed: "

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: "

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

.method public static h()V
    .locals 1

    invoke-static {}, Lwe/d0;->c()Lwe/d0;

    move-result-object v0

    invoke-static {v0}, Lre/e;->i(Lwe/d0;)V

    return-void
.end method

.method public static i(Lwe/d0;)V
    .locals 1

    sget-object v0, Lre/e;->b:Lwe/g0;

    invoke-virtual {p0, v0}, Lwe/d0;->m(Lwe/g0;)V

    sget-object v0, Lre/e;->c:Lwe/f0;

    invoke-virtual {p0, v0}, Lwe/d0;->l(Lwe/f0;)V

    sget-object v0, Lre/e;->d:Lwe/n;

    invoke-virtual {p0, v0}, Lwe/d0;->k(Lwe/n;)V

    sget-object v0, Lre/e;->e:Lwe/m;

    invoke-virtual {p0, v0}, Lwe/d0;->j(Lwe/m;)V

    return-void
.end method

.method public static j(Lqe/f;Lpe/d0;)Lwe/l0;
    .locals 4

    invoke-static {}, Laf/d;->f0()Laf/d$b;

    move-result-object v0

    invoke-static {}, Laf/f;->g0()Laf/f$b;

    move-result-object v1

    invoke-static {}, Laf/h;->d0()Laf/h$b;

    move-result-object v2

    invoke-virtual {p0}, Lqe/f;->f()Lqe/k;

    move-result-object v3

    invoke-virtual {v3}, Lqe/k;->f()I

    move-result v3

    invoke-virtual {v2, v3}, Laf/h$b;->C(I)Laf/h$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v2

    check-cast v2, Laf/h;

    invoke-virtual {v1, v2}, Laf/f$b;->D(Laf/h;)Laf/f$b;

    move-result-object v1

    invoke-virtual {p0}, Lqe/f;->c()Lef/c;

    move-result-object v2

    invoke-static {p1}, Lpe/d0;->b(Lpe/d0;)Lpe/d0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lef/c;->d(Lpe/d0;)[B

    move-result-object v2

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v1, v2}, Laf/f$b;->C(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/f$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v1

    check-cast v1, Laf/f;

    invoke-virtual {v0, v1}, Laf/d$b;->C(Laf/f;)Laf/d$b;

    move-result-object v0

    invoke-static {}, Laf/c0;->g0()Laf/c0$b;

    move-result-object v1

    invoke-virtual {p0}, Lqe/f;->f()Lqe/k;

    move-result-object v2

    invoke-static {v2}, Lre/e;->e(Lqe/k;)Laf/e0;

    move-result-object v2

    invoke-virtual {v1, v2}, Laf/c0$b;->D(Laf/e0;)Laf/c0$b;

    move-result-object v1

    invoke-virtual {p0}, Lqe/f;->d()Lef/c;

    move-result-object v2

    invoke-static {p1}, Lpe/d0;->b(Lpe/d0;)Lpe/d0;

    move-result-object p1

    invoke-virtual {v2, p1}, Lef/c;->d(Lpe/d0;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v1, p1}, Laf/c0$b;->C(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/c0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Laf/c0;

    invoke-virtual {v0, p1}, Laf/d$b;->D(Laf/c0;)Laf/d$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Laf/d;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Laf/f0$c;->c:Laf/f0$c;

    invoke-virtual {p0}, Lqe/f;->f()Lqe/k;

    move-result-object v1

    invoke-virtual {v1}, Lqe/k;->h()Lqe/k$d;

    move-result-object v1

    invoke-static {v1}, Lre/e;->n(Lqe/k$d;)Laf/p0;

    move-result-object v1

    invoke-virtual {p0}, Lqe/f;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-static {v2, p1, v0, v1, p0}, Lwe/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Laf/f0$c;Laf/p0;Ljava/lang/Integer;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method

.method public static k(Lqe/k;)Lwe/m0;
    .locals 5

    invoke-static {}, Laf/h0;->h0()Laf/h0$b;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {v0, v1}, Laf/h0$b;->D(Ljava/lang/String;)Laf/h0$b;

    move-result-object v0

    invoke-static {}, Laf/e;->e0()Laf/e$b;

    move-result-object v1

    invoke-static {}, Laf/g;->f0()Laf/g$b;

    move-result-object v2

    invoke-static {}, Laf/h;->d0()Laf/h$b;

    move-result-object v3

    invoke-virtual {p0}, Lqe/k;->f()I

    move-result v4

    invoke-virtual {v3, v4}, Laf/h$b;->C(I)Laf/h$b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v3

    check-cast v3, Laf/h;

    invoke-virtual {v2, v3}, Laf/g$b;->D(Laf/h;)Laf/g$b;

    move-result-object v2

    invoke-virtual {p0}, Lqe/k;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Laf/g$b;->C(I)Laf/g$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v2

    check-cast v2, Laf/g;

    invoke-virtual {v1, v2}, Laf/e$b;->C(Laf/g;)Laf/e$b;

    move-result-object v1

    invoke-static {}, Laf/d0;->g0()Laf/d0$b;

    move-result-object v2

    invoke-static {p0}, Lre/e;->e(Lqe/k;)Laf/e0;

    move-result-object v3

    invoke-virtual {v2, v3}, Laf/d0$b;->D(Laf/e0;)Laf/d0$b;

    move-result-object v2

    invoke-virtual {p0}, Lqe/k;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Laf/d0$b;->C(I)Laf/d0$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v2

    check-cast v2, Laf/d0;

    invoke-virtual {v1, v2}, Laf/e$b;->D(Laf/d0;)Laf/e$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v1

    check-cast v1, Laf/e;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/h0$b;->E(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/h0$b;

    move-result-object v0

    invoke-virtual {p0}, Lqe/k;->h()Lqe/k$d;

    move-result-object p0

    invoke-static {p0}, Lre/e;->n(Lqe/k$d;)Laf/p0;

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

.method public static l(Laf/b0;)Lqe/k$c;
    .locals 3

    sget-object v0, Lre/e$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    sget-object p0, Lqe/k$c;->f:Lqe/k$c;

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
    sget-object p0, Lqe/k$c;->e:Lqe/k$c;

    return-object p0

    :cond_2
    sget-object p0, Lqe/k$c;->d:Lqe/k$c;

    return-object p0

    :cond_3
    sget-object p0, Lqe/k$c;->c:Lqe/k$c;

    return-object p0

    :cond_4
    sget-object p0, Lqe/k$c;->b:Lqe/k$c;

    return-object p0
.end method

.method public static m(Lqe/k$c;)Laf/b0;
    .locals 3

    sget-object v0, Lqe/k$c;->b:Lqe/k$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Laf/b0;->c:Laf/b0;

    return-object p0

    :cond_0
    sget-object v0, Lqe/k$c;->c:Lqe/k$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Laf/b0;->g:Laf/b0;

    return-object p0

    :cond_1
    sget-object v0, Lqe/k$c;->d:Lqe/k$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Laf/b0;->e:Laf/b0;

    return-object p0

    :cond_2
    sget-object v0, Lqe/k$c;->e:Lqe/k$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Laf/b0;->d:Laf/b0;

    return-object p0

    :cond_3
    sget-object v0, Lqe/k$c;->f:Lqe/k$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p0, Laf/b0;->f:Laf/b0;

    return-object p0

    :cond_4
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

.method public static n(Lqe/k$d;)Laf/p0;
    .locals 3

    sget-object v0, Lqe/k$d;->b:Lqe/k$d;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Laf/p0;->c:Laf/p0;

    return-object p0

    :cond_0
    sget-object v0, Lqe/k$d;->c:Lqe/k$d;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Laf/p0;->f:Laf/p0;

    return-object p0

    :cond_1
    sget-object v0, Lqe/k$d;->d:Lqe/k$d;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Laf/p0;->e:Laf/p0;

    return-object p0

    :cond_2
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

.method public static o(Laf/p0;)Lqe/k$d;
    .locals 3

    sget-object v0, Lre/e$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    sget-object p0, Lqe/k$d;->d:Lqe/k$d;

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
    sget-object p0, Lqe/k$d;->c:Lqe/k$d;

    return-object p0

    :cond_2
    sget-object p0, Lqe/k$d;->b:Lqe/k$d;

    return-object p0
.end method
