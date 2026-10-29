.class public final Lqe/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lef/a;

.field public static final b:Lwe/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/g0<",
            "Lqe/u0;",
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
            "Lqe/t0;",
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

    const-string v0, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    invoke-static {v0}, Lwe/s0;->h(Ljava/lang/String;)Lef/a;

    move-result-object v0

    sput-object v0, Lqe/z0;->a:Lef/a;

    new-instance v1, Lqe/v0;

    invoke-direct {v1}, Lqe/v0;-><init>()V

    const-class v2, Lqe/u0;

    const-class v3, Lwe/m0;

    invoke-static {v1, v2, v3}, Lwe/g0;->a(Lwe/g0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/g0;

    move-result-object v1

    sput-object v1, Lqe/z0;->b:Lwe/g0;

    new-instance v1, Lqe/w0;

    invoke-direct {v1}, Lqe/w0;-><init>()V

    invoke-static {v1, v0, v3}, Lwe/f0;->a(Lwe/f0$b;Lef/a;Ljava/lang/Class;)Lwe/f0;

    move-result-object v1

    sput-object v1, Lqe/z0;->c:Lwe/f0;

    new-instance v1, Lqe/x0;

    invoke-direct {v1}, Lqe/x0;-><init>()V

    const-class v2, Lqe/t0;

    const-class v3, Lwe/l0;

    invoke-static {v1, v2, v3}, Lwe/n;->a(Lwe/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/n;

    move-result-object v1

    sput-object v1, Lqe/z0;->d:Lwe/n;

    new-instance v1, Lqe/y0;

    invoke-direct {v1}, Lqe/y0;-><init>()V

    invoke-static {v1, v0, v3}, Lwe/m;->a(Lwe/m$b;Lef/a;Ljava/lang/Class;)Lwe/m;

    move-result-object v0

    sput-object v0, Lqe/z0;->e:Lwe/m;

    return-void
.end method

.method public static synthetic a(Lwe/m0;)Lqe/u0;
    .locals 0

    invoke-static {p0}, Lqe/z0;->g(Lwe/m0;)Lqe/u0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lqe/t0;Lpe/d0;)Lwe/l0;
    .locals 0

    invoke-static {p0, p1}, Lqe/z0;->j(Lqe/t0;Lpe/d0;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lqe/u0;)Lwe/m0;
    .locals 0

    invoke-static {p0}, Lqe/z0;->k(Lqe/u0;)Lwe/m0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lwe/l0;Lpe/d0;)Lqe/t0;
    .locals 0

    invoke-static {p0, p1}, Lqe/z0;->e(Lwe/l0;Lpe/d0;)Lqe/t0;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lwe/l0;Lpe/d0;)Lqe/t0;
    .locals 2

    invoke-virtual {p0}, Lwe/l0;->f()Ljava/lang/String;

    move-result-object p1

    const-string v0, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lwe/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Laf/n0;->e0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/n0;

    move-result-object p1

    invoke-virtual {p1}, Laf/n0;->c0()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Laf/n0;->b0()Laf/o0;

    move-result-object p1

    invoke-virtual {p0}, Lwe/l0;->e()Laf/p0;

    move-result-object v0

    invoke-static {p1, v0}, Lqe/z0;->f(Laf/o0;Laf/p0;)Lqe/u0;

    move-result-object p1

    invoke-virtual {p0}, Lwe/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p1, p0}, Lqe/t0;->b(Lqe/u0;Ljava/lang/Integer;)Lqe/t0;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "KmsEnvelopeAeadKeys are only accepted with version 0, got "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing KmsEnvelopeAeadKey failed: "

    invoke-direct {p1, v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static f(Laf/o0;Laf/p0;)Lqe/u0;
    .locals 3

    invoke-static {}, Laf/h0;->h0()Laf/h0$b;

    move-result-object v0

    invoke-virtual {p0}, Laf/o0;->d0()Laf/h0;

    move-result-object v1

    invoke-virtual {v1}, Laf/h0;->f0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/h0$b;->D(Ljava/lang/String;)Laf/h0$b;

    move-result-object v0

    invoke-virtual {p0}, Laf/o0;->d0()Laf/h0;

    move-result-object v1

    invoke-virtual {v1}, Laf/h0;->g0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/h0$b;->E(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/h0$b;

    move-result-object v0

    sget-object v1, Laf/p0;->e:Laf/p0;

    invoke-virtual {v0, v1}, Laf/h0$b;->C(Laf/p0;)Laf/h0$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    check-cast v0, Laf/h0;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->n()[B

    move-result-object v0

    invoke-static {v0}, Lpe/h0;->a([B)Lpe/x;

    move-result-object v0

    instance-of v1, v0, Lqe/u;

    if-eqz v1, :cond_0

    sget-object v1, Lqe/u0$c;->b:Lqe/u0$c;

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lqe/e0;

    if-eqz v1, :cond_1

    sget-object v1, Lqe/u0$c;->d:Lqe/u0$c;

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lqe/t1;

    if-eqz v1, :cond_2

    sget-object v1, Lqe/u0$c;->c:Lqe/u0$c;

    goto :goto_0

    :cond_2
    instance-of v1, v0, Lqe/k;

    if-eqz v1, :cond_3

    sget-object v1, Lqe/u0$c;->e:Lqe/u0$c;

    goto :goto_0

    :cond_3
    instance-of v1, v0, Lqe/p;

    if-eqz v1, :cond_4

    sget-object v1, Lqe/u0$c;->f:Lqe/u0$c;

    goto :goto_0

    :cond_4
    instance-of v1, v0, Lqe/z;

    if-eqz v1, :cond_5

    sget-object v1, Lqe/u0$c;->g:Lqe/u0$c;

    :goto_0
    invoke-static {}, Lqe/u0;->b()Lqe/u0$b;

    move-result-object v2

    invoke-static {p1}, Lqe/z0;->n(Laf/p0;)Lqe/u0$d;

    move-result-object p1

    invoke-virtual {v2, p1}, Lqe/u0$b;->f(Lqe/u0$d;)Lqe/u0$b;

    move-result-object p1

    invoke-virtual {p0}, Laf/o0;->e0()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lqe/u0$b;->e(Ljava/lang/String;)Lqe/u0$b;

    move-result-object p0

    check-cast v0, Lqe/c;

    invoke-virtual {p0, v0}, Lqe/u0$b;->c(Lqe/c;)Lqe/u0$b;

    move-result-object p0

    invoke-virtual {p0, v1}, Lqe/u0$b;->d(Lqe/u0$c;)Lqe/u0$b;

    move-result-object p0

    invoke-virtual {p0}, Lqe/u0$b;->a()Lqe/u0;

    move-result-object p0

    return-object p0

    :cond_5
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported DEK parameters when parsing "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static g(Lwe/m0;)Lqe/u0;
    .locals 3

    invoke-virtual {p0}, Lwe/m0;->d()Laf/h0;

    move-result-object v0

    invoke-virtual {v0}, Laf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

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

    invoke-static {v0, v1}, Laf/o0;->g0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/o0;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0}, Lwe/m0;->d()Laf/h0;

    move-result-object p0

    invoke-virtual {p0}, Laf/h0;->e0()Laf/p0;

    move-result-object p0

    invoke-static {v0, p0}, Lqe/z0;->f(Laf/o0;Laf/p0;)Lqe/u0;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing KmsEnvelopeAeadKeyFormat failed: "

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: "

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

    invoke-static {v0}, Lqe/z0;->i(Lwe/d0;)V

    return-void
.end method

.method public static i(Lwe/d0;)V
    .locals 1

    sget-object v0, Lqe/z0;->b:Lwe/g0;

    invoke-virtual {p0, v0}, Lwe/d0;->m(Lwe/g0;)V

    sget-object v0, Lqe/z0;->c:Lwe/f0;

    invoke-virtual {p0, v0}, Lwe/d0;->l(Lwe/f0;)V

    sget-object v0, Lqe/z0;->d:Lwe/n;

    invoke-virtual {p0, v0}, Lwe/d0;->k(Lwe/n;)V

    sget-object v0, Lqe/z0;->e:Lwe/m;

    invoke-virtual {p0, v0}, Lwe/d0;->j(Lwe/m;)V

    return-void
.end method

.method public static j(Lqe/t0;Lpe/d0;)Lwe/l0;
    .locals 3

    invoke-static {}, Laf/n0;->d0()Laf/n0$b;

    move-result-object p1

    invoke-virtual {p0}, Lqe/t0;->d()Lqe/u0;

    move-result-object v0

    invoke-static {v0}, Lqe/z0;->l(Lqe/u0;)Laf/o0;

    move-result-object v0

    invoke-virtual {p1, v0}, Laf/n0$b;->C(Laf/o0;)Laf/n0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Laf/n0;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Laf/f0$c;->f:Laf/f0$c;

    invoke-virtual {p0}, Lqe/t0;->d()Lqe/u0;

    move-result-object v1

    invoke-virtual {v1}, Lqe/u0;->e()Lqe/u0$d;

    move-result-object v1

    invoke-static {v1}, Lqe/z0;->m(Lqe/u0$d;)Laf/p0;

    move-result-object v1

    invoke-virtual {p0}, Lqe/t0;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    invoke-static {v2, p1, v0, v1, p0}, Lwe/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Laf/f0$c;Laf/p0;Ljava/lang/Integer;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method

.method public static k(Lqe/u0;)Lwe/m0;
    .locals 2

    invoke-static {}, Laf/h0;->h0()Laf/h0$b;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    invoke-virtual {v0, v1}, Laf/h0$b;->D(Ljava/lang/String;)Laf/h0$b;

    move-result-object v0

    invoke-static {p0}, Lqe/z0;->l(Lqe/u0;)Laf/o0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/h0$b;->E(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/h0$b;

    move-result-object v0

    invoke-virtual {p0}, Lqe/u0;->e()Lqe/u0$d;

    move-result-object p0

    invoke-static {p0}, Lqe/z0;->m(Lqe/u0$d;)Laf/p0;

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

.method public static l(Lqe/u0;)Laf/o0;
    .locals 2

    invoke-virtual {p0}, Lqe/u0;->c()Lqe/c;

    move-result-object v0

    invoke-static {v0}, Lpe/h0;->b(Lpe/x;)[B

    move-result-object v0

    :try_start_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Laf/h0;->j0([BLcom/google/crypto/tink/shaded/protobuf/p;)Laf/h0;

    move-result-object v0

    invoke-static {}, Laf/o0;->f0()Laf/o0$b;

    move-result-object v1

    invoke-virtual {p0}, Lqe/u0;->d()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Laf/o0$b;->D(Ljava/lang/String;)Laf/o0$b;

    move-result-object p0

    invoke-virtual {p0, v0}, Laf/o0$b;->C(Laf/h0;)Laf/o0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Laf/o0;
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing KmsEnvelopeAeadKeyFormat failed: "

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static m(Lqe/u0$d;)Laf/p0;
    .locals 3

    sget-object v0, Lqe/u0$d;->b:Lqe/u0$d;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Laf/p0;->c:Laf/p0;

    return-object p0

    :cond_0
    sget-object v0, Lqe/u0$d;->c:Lqe/u0$d;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Laf/p0;->e:Laf/p0;

    return-object p0

    :cond_1
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

.method public static n(Laf/p0;)Lqe/u0$d;
    .locals 3

    sget-object v0, Lqe/z0$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    sget-object p0, Lqe/u0$d;->c:Lqe/u0$d;

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
    sget-object p0, Lqe/u0$d;->b:Lqe/u0$d;

    return-object p0
.end method
