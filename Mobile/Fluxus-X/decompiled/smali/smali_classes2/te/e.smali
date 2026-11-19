.class public final Lte/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgf/a;

.field public static final b:Lye/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/g0<",
            "Lse/k;",
            "Lye/m0;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lye/f0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/f0<",
            "Lye/m0;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lye/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/n<",
            "Lse/f;",
            "Lye/l0;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lye/m;
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
    .locals 4

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-static {v0}, Lye/s0;->h(Ljava/lang/String;)Lgf/a;

    move-result-object v0

    sput-object v0, Lte/e;->a:Lgf/a;

    new-instance v1, Lte/a;

    invoke-direct {v1}, Lte/a;-><init>()V

    const-class v2, Lse/k;

    const-class v3, Lye/m0;

    invoke-static {v1, v2, v3}, Lye/g0;->a(Lye/g0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/g0;

    move-result-object v1

    sput-object v1, Lte/e;->b:Lye/g0;

    new-instance v1, Lte/b;

    invoke-direct {v1}, Lte/b;-><init>()V

    invoke-static {v1, v0, v3}, Lye/f0;->a(Lye/f0$b;Lgf/a;Ljava/lang/Class;)Lye/f0;

    move-result-object v1

    sput-object v1, Lte/e;->c:Lye/f0;

    new-instance v1, Lte/c;

    invoke-direct {v1}, Lte/c;-><init>()V

    const-class v2, Lse/f;

    const-class v3, Lye/l0;

    invoke-static {v1, v2, v3}, Lye/n;->a(Lye/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/n;

    move-result-object v1

    sput-object v1, Lte/e;->d:Lye/n;

    new-instance v1, Lte/d;

    invoke-direct {v1}, Lte/d;-><init>()V

    invoke-static {v1, v0, v3}, Lye/m;->a(Lye/m$b;Lgf/a;Ljava/lang/Class;)Lye/m;

    move-result-object v0

    sput-object v0, Lte/e;->e:Lye/m;

    return-void
.end method

.method public static synthetic a(Lye/m0;)Lse/k;
    .locals 0

    invoke-static {p0}, Lte/e;->g(Lye/m0;)Lse/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lse/k;)Lye/m0;
    .locals 0

    invoke-static {p0}, Lte/e;->k(Lse/k;)Lye/m0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lse/f;Lre/d0;)Lye/l0;
    .locals 0

    invoke-static {p0, p1}, Lte/e;->j(Lse/f;Lre/d0;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lye/l0;Lre/d0;)Lse/f;
    .locals 0

    invoke-static {p0, p1}, Lte/e;->f(Lye/l0;Lre/d0;)Lse/f;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lse/k;)Lcf/e0;
    .locals 2

    invoke-static {}, Lcf/e0;->f0()Lcf/e0$b;

    move-result-object v0

    invoke-virtual {p0}, Lse/k;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Lcf/e0$b;->F(I)Lcf/e0$b;

    move-result-object v0

    invoke-virtual {p0}, Lse/k;->d()Lse/k$c;

    move-result-object p0

    invoke-static {p0}, Lte/e;->m(Lse/k$c;)Lcf/b0;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcf/e0$b;->D(Lcf/b0;)Lcf/e0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lcf/e0;

    return-object p0
.end method

.method public static f(Lye/l0;Lre/d0;)Lse/f;
    .locals 4

    invoke-virtual {p0}, Lye/l0;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :try_start_0
    invoke-virtual {p0}, Lye/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lcf/d;->g0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/d;

    move-result-object v0

    invoke-virtual {v0}, Lcf/d;->e0()I

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lcf/d;->c0()Lcf/f;

    move-result-object v1

    invoke-virtual {v1}, Lcf/f;->f0()I

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcf/d;->d0()Lcf/c0;

    move-result-object v1

    invoke-virtual {v1}, Lcf/c0;->f0()I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lse/k;->b()Lse/k$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/d;->c0()Lcf/f;

    move-result-object v2

    invoke-virtual {v2}, Lcf/f;->d0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Lse/k$b;->b(I)Lse/k$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/d;->d0()Lcf/c0;

    move-result-object v2

    invoke-virtual {v2}, Lcf/c0;->d0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Lse/k$b;->d(I)Lse/k$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/d;->c0()Lcf/f;

    move-result-object v2

    invoke-virtual {v2}, Lcf/f;->e0()Lcf/h;

    move-result-object v2

    invoke-virtual {v2}, Lcf/h;->c0()I

    move-result v2

    invoke-virtual {v1, v2}, Lse/k$b;->e(I)Lse/k$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/d;->d0()Lcf/c0;

    move-result-object v2

    invoke-virtual {v2}, Lcf/c0;->e0()Lcf/e0;

    move-result-object v2

    invoke-virtual {v2}, Lcf/e0;->e0()I

    move-result v2

    invoke-virtual {v1, v2}, Lse/k$b;->f(I)Lse/k$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/d;->d0()Lcf/c0;

    move-result-object v2

    invoke-virtual {v2}, Lcf/c0;->e0()Lcf/e0;

    move-result-object v2

    invoke-virtual {v2}, Lcf/e0;->d0()Lcf/b0;

    move-result-object v2

    invoke-static {v2}, Lte/e;->l(Lcf/b0;)Lse/k$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Lse/k$b;->c(Lse/k$c;)Lse/k$b;

    move-result-object v1

    invoke-virtual {p0}, Lye/l0;->e()Lcf/p0;

    move-result-object v2

    invoke-static {v2}, Lte/e;->o(Lcf/p0;)Lse/k$d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lse/k$b;->g(Lse/k$d;)Lse/k$b;

    move-result-object v1

    invoke-virtual {v1}, Lse/k$b;->a()Lse/k;

    move-result-object v1

    invoke-static {}, Lse/f;->b()Lse/f$b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lse/f$b;->f(Lse/k;)Lse/f$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/d;->c0()Lcf/f;

    move-result-object v2

    invoke-virtual {v2}, Lcf/f;->d0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->v()[B

    move-result-object v2

    invoke-static {p1}, Lre/d0;->b(Lre/d0;)Lre/d0;

    move-result-object v3

    invoke-static {v2, v3}, Lgf/c;->a([BLre/d0;)Lgf/c;

    move-result-object v2

    invoke-virtual {v1, v2}, Lse/f$b;->c(Lgf/c;)Lse/f$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/d;->d0()Lcf/c0;

    move-result-object v0

    invoke-virtual {v0}, Lcf/c0;->d0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->v()[B

    move-result-object v0

    invoke-static {p1}, Lre/d0;->b(Lre/d0;)Lre/d0;

    move-result-object p1

    invoke-static {v0, p1}, Lgf/c;->a([BLre/d0;)Lgf/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Lse/f$b;->d(Lgf/c;)Lse/f$b;

    move-result-object p1

    invoke-virtual {p0}, Lye/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0}, Lse/f$b;->e(Ljava/lang/Integer;)Lse/f$b;

    move-result-object p0

    invoke-virtual {p0}, Lse/f$b;->a()Lse/f;

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

.method public static g(Lye/m0;)Lse/k;
    .locals 3

    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object v0

    invoke-virtual {v0}, Lcf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object v0

    invoke-virtual {v0}, Lcf/h0;->g0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lcf/e;->f0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/e;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Lcf/e;->d0()Lcf/d0;

    move-result-object v1

    invoke-virtual {v1}, Lcf/d0;->f0()I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lse/k;->b()Lse/k$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/e;->c0()Lcf/g;

    move-result-object v2

    invoke-virtual {v2}, Lcf/g;->d0()I

    move-result v2

    invoke-virtual {v1, v2}, Lse/k$b;->b(I)Lse/k$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/e;->d0()Lcf/d0;

    move-result-object v2

    invoke-virtual {v2}, Lcf/d0;->d0()I

    move-result v2

    invoke-virtual {v1, v2}, Lse/k$b;->d(I)Lse/k$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/e;->c0()Lcf/g;

    move-result-object v2

    invoke-virtual {v2}, Lcf/g;->e0()Lcf/h;

    move-result-object v2

    invoke-virtual {v2}, Lcf/h;->c0()I

    move-result v2

    invoke-virtual {v1, v2}, Lse/k$b;->e(I)Lse/k$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/e;->d0()Lcf/d0;

    move-result-object v2

    invoke-virtual {v2}, Lcf/d0;->e0()Lcf/e0;

    move-result-object v2

    invoke-virtual {v2}, Lcf/e0;->e0()I

    move-result v2

    invoke-virtual {v1, v2}, Lse/k$b;->f(I)Lse/k$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/e;->d0()Lcf/d0;

    move-result-object v0

    invoke-virtual {v0}, Lcf/d0;->e0()Lcf/e0;

    move-result-object v0

    invoke-virtual {v0}, Lcf/e0;->d0()Lcf/b0;

    move-result-object v0

    invoke-static {v0}, Lte/e;->l(Lcf/b0;)Lse/k$c;

    move-result-object v0

    invoke-virtual {v1, v0}, Lse/k$b;->c(Lse/k$c;)Lse/k$b;

    move-result-object v0

    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object p0

    invoke-virtual {p0}, Lcf/h0;->e0()Lcf/p0;

    move-result-object p0

    invoke-static {p0}, Lte/e;->o(Lcf/p0;)Lse/k$d;

    move-result-object p0

    invoke-virtual {v0, p0}, Lse/k$b;->g(Lse/k$d;)Lse/k$b;

    move-result-object p0

    invoke-virtual {p0}, Lse/k$b;->a()Lse/k;

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

.method public static h()V
    .locals 1

    invoke-static {}, Lye/d0;->c()Lye/d0;

    move-result-object v0

    invoke-static {v0}, Lte/e;->i(Lye/d0;)V

    return-void
.end method

.method public static i(Lye/d0;)V
    .locals 1

    sget-object v0, Lte/e;->b:Lye/g0;

    invoke-virtual {p0, v0}, Lye/d0;->m(Lye/g0;)V

    sget-object v0, Lte/e;->c:Lye/f0;

    invoke-virtual {p0, v0}, Lye/d0;->l(Lye/f0;)V

    sget-object v0, Lte/e;->d:Lye/n;

    invoke-virtual {p0, v0}, Lye/d0;->k(Lye/n;)V

    sget-object v0, Lte/e;->e:Lye/m;

    invoke-virtual {p0, v0}, Lye/d0;->j(Lye/m;)V

    return-void
.end method

.method public static j(Lse/f;Lre/d0;)Lye/l0;
    .locals 4

    invoke-static {}, Lcf/d;->f0()Lcf/d$b;

    move-result-object v0

    invoke-static {}, Lcf/f;->g0()Lcf/f$b;

    move-result-object v1

    invoke-static {}, Lcf/h;->d0()Lcf/h$b;

    move-result-object v2

    invoke-virtual {p0}, Lse/f;->f()Lse/k;

    move-result-object v3

    invoke-virtual {v3}, Lse/k;->f()I

    move-result v3

    invoke-virtual {v2, v3}, Lcf/h$b;->D(I)Lcf/h$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v2

    check-cast v2, Lcf/h;

    invoke-virtual {v1, v2}, Lcf/f$b;->F(Lcf/h;)Lcf/f$b;

    move-result-object v1

    invoke-virtual {p0}, Lse/f;->c()Lgf/c;

    move-result-object v2

    invoke-static {p1}, Lre/d0;->b(Lre/d0;)Lre/d0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lgf/c;->d(Lre/d0;)[B

    move-result-object v2

    invoke-static {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcf/f$b;->D(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/f$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v1

    check-cast v1, Lcf/f;

    invoke-virtual {v0, v1}, Lcf/d$b;->D(Lcf/f;)Lcf/d$b;

    move-result-object v0

    invoke-static {}, Lcf/c0;->g0()Lcf/c0$b;

    move-result-object v1

    invoke-virtual {p0}, Lse/f;->f()Lse/k;

    move-result-object v2

    invoke-static {v2}, Lte/e;->e(Lse/k;)Lcf/e0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcf/c0$b;->F(Lcf/e0;)Lcf/c0$b;

    move-result-object v1

    invoke-virtual {p0}, Lse/f;->d()Lgf/c;

    move-result-object v2

    invoke-static {p1}, Lre/d0;->b(Lre/d0;)Lre/d0;

    move-result-object p1

    invoke-virtual {v2, p1}, Lgf/c;->d(Lre/d0;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcf/c0$b;->D(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/c0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lcf/c0;

    invoke-virtual {v0, p1}, Lcf/d$b;->F(Lcf/c0;)Lcf/d$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lcf/d;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Lcf/f0$c;->c:Lcf/f0$c;

    invoke-virtual {p0}, Lse/f;->f()Lse/k;

    move-result-object v1

    invoke-virtual {v1}, Lse/k;->h()Lse/k$d;

    move-result-object v1

    invoke-static {v1}, Lte/e;->n(Lse/k$d;)Lcf/p0;

    move-result-object v1

    invoke-virtual {p0}, Lse/f;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-static {v2, p1, v0, v1, p0}, Lye/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Lcf/f0$c;Lcf/p0;Ljava/lang/Integer;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static k(Lse/k;)Lye/m0;
    .locals 5

    invoke-static {}, Lcf/h0;->h0()Lcf/h0$b;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {v0, v1}, Lcf/h0$b;->F(Ljava/lang/String;)Lcf/h0$b;

    move-result-object v0

    invoke-static {}, Lcf/e;->e0()Lcf/e$b;

    move-result-object v1

    invoke-static {}, Lcf/g;->f0()Lcf/g$b;

    move-result-object v2

    invoke-static {}, Lcf/h;->d0()Lcf/h$b;

    move-result-object v3

    invoke-virtual {p0}, Lse/k;->f()I

    move-result v4

    invoke-virtual {v3, v4}, Lcf/h$b;->D(I)Lcf/h$b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v3

    check-cast v3, Lcf/h;

    invoke-virtual {v2, v3}, Lcf/g$b;->F(Lcf/h;)Lcf/g$b;

    move-result-object v2

    invoke-virtual {p0}, Lse/k;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Lcf/g$b;->D(I)Lcf/g$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v2

    check-cast v2, Lcf/g;

    invoke-virtual {v1, v2}, Lcf/e$b;->D(Lcf/g;)Lcf/e$b;

    move-result-object v1

    invoke-static {}, Lcf/d0;->g0()Lcf/d0$b;

    move-result-object v2

    invoke-static {p0}, Lte/e;->e(Lse/k;)Lcf/e0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcf/d0$b;->F(Lcf/e0;)Lcf/d0$b;

    move-result-object v2

    invoke-virtual {p0}, Lse/k;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Lcf/d0$b;->D(I)Lcf/d0$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v2

    check-cast v2, Lcf/d0;

    invoke-virtual {v1, v2}, Lcf/e$b;->F(Lcf/d0;)Lcf/e$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v1

    check-cast v1, Lcf/e;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/h0$b;->G(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/h0$b;

    move-result-object v0

    invoke-virtual {p0}, Lse/k;->h()Lse/k$d;

    move-result-object p0

    invoke-static {p0}, Lte/e;->n(Lse/k$d;)Lcf/p0;

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

.method public static l(Lcf/b0;)Lse/k$c;
    .locals 3

    sget-object v0, Lte/e$a;->b:[I

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

    sget-object p0, Lse/k$c;->f:Lse/k$c;

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
    sget-object p0, Lse/k$c;->e:Lse/k$c;

    return-object p0

    :cond_2
    sget-object p0, Lse/k$c;->d:Lse/k$c;

    return-object p0

    :cond_3
    sget-object p0, Lse/k$c;->c:Lse/k$c;

    return-object p0

    :cond_4
    sget-object p0, Lse/k$c;->b:Lse/k$c;

    return-object p0
.end method

.method public static m(Lse/k$c;)Lcf/b0;
    .locals 3

    sget-object v0, Lse/k$c;->b:Lse/k$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcf/b0;->c:Lcf/b0;

    return-object p0

    :cond_0
    sget-object v0, Lse/k$c;->c:Lse/k$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lcf/b0;->g:Lcf/b0;

    return-object p0

    :cond_1
    sget-object v0, Lse/k$c;->d:Lse/k$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lcf/b0;->e:Lcf/b0;

    return-object p0

    :cond_2
    sget-object v0, Lse/k$c;->e:Lse/k$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Lcf/b0;->d:Lcf/b0;

    return-object p0

    :cond_3
    sget-object v0, Lse/k$c;->f:Lse/k$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p0, Lcf/b0;->f:Lcf/b0;

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

.method public static n(Lse/k$d;)Lcf/p0;
    .locals 3

    sget-object v0, Lse/k$d;->b:Lse/k$d;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcf/p0;->c:Lcf/p0;

    return-object p0

    :cond_0
    sget-object v0, Lse/k$d;->c:Lse/k$d;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lcf/p0;->f:Lcf/p0;

    return-object p0

    :cond_1
    sget-object v0, Lse/k$d;->d:Lse/k$d;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lcf/p0;->e:Lcf/p0;

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

.method public static o(Lcf/p0;)Lse/k$d;
    .locals 3

    sget-object v0, Lte/e$a;->a:[I

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

    sget-object p0, Lse/k$d;->d:Lse/k$d;

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
    sget-object p0, Lse/k$d;->c:Lse/k$d;

    return-object p0

    :cond_2
    sget-object p0, Lse/k$d;->b:Lse/k$d;

    return-object p0
.end method
