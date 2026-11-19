.class public final Lse/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgf/a;

.field public static final b:Lye/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/g0<",
            "Lse/u0;",
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
            "Lse/t0;",
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

    const-string v0, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    invoke-static {v0}, Lye/s0;->h(Ljava/lang/String;)Lgf/a;

    move-result-object v0

    sput-object v0, Lse/z0;->a:Lgf/a;

    new-instance v1, Lse/v0;

    invoke-direct {v1}, Lse/v0;-><init>()V

    const-class v2, Lse/u0;

    const-class v3, Lye/m0;

    invoke-static {v1, v2, v3}, Lye/g0;->a(Lye/g0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/g0;

    move-result-object v1

    sput-object v1, Lse/z0;->b:Lye/g0;

    new-instance v1, Lse/w0;

    invoke-direct {v1}, Lse/w0;-><init>()V

    invoke-static {v1, v0, v3}, Lye/f0;->a(Lye/f0$b;Lgf/a;Ljava/lang/Class;)Lye/f0;

    move-result-object v1

    sput-object v1, Lse/z0;->c:Lye/f0;

    new-instance v1, Lse/x0;

    invoke-direct {v1}, Lse/x0;-><init>()V

    const-class v2, Lse/t0;

    const-class v3, Lye/l0;

    invoke-static {v1, v2, v3}, Lye/n;->a(Lye/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/n;

    move-result-object v1

    sput-object v1, Lse/z0;->d:Lye/n;

    new-instance v1, Lse/y0;

    invoke-direct {v1}, Lse/y0;-><init>()V

    invoke-static {v1, v0, v3}, Lye/m;->a(Lye/m$b;Lgf/a;Ljava/lang/Class;)Lye/m;

    move-result-object v0

    sput-object v0, Lse/z0;->e:Lye/m;

    return-void
.end method

.method public static synthetic a(Lye/m0;)Lse/u0;
    .locals 0

    invoke-static {p0}, Lse/z0;->g(Lye/m0;)Lse/u0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lse/t0;Lre/d0;)Lye/l0;
    .locals 0

    invoke-static {p0, p1}, Lse/z0;->j(Lse/t0;Lre/d0;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lse/u0;)Lye/m0;
    .locals 0

    invoke-static {p0}, Lse/z0;->k(Lse/u0;)Lye/m0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lye/l0;Lre/d0;)Lse/t0;
    .locals 0

    invoke-static {p0, p1}, Lse/z0;->e(Lye/l0;Lre/d0;)Lse/t0;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lye/l0;Lre/d0;)Lse/t0;
    .locals 2

    invoke-virtual {p0}, Lye/l0;->f()Ljava/lang/String;

    move-result-object p1

    const-string v0, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lye/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lcf/n0;->e0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/n0;

    move-result-object p1

    invoke-virtual {p1}, Lcf/n0;->c0()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcf/n0;->b0()Lcf/o0;

    move-result-object p1

    invoke-virtual {p0}, Lye/l0;->e()Lcf/p0;

    move-result-object v0

    invoke-static {p1, v0}, Lse/z0;->f(Lcf/o0;Lcf/p0;)Lse/u0;

    move-result-object p1

    invoke-virtual {p0}, Lye/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p1, p0}, Lse/t0;->b(Lse/u0;Ljava/lang/Integer;)Lse/t0;

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

.method public static f(Lcf/o0;Lcf/p0;)Lse/u0;
    .locals 3

    invoke-static {}, Lcf/h0;->h0()Lcf/h0$b;

    move-result-object v0

    invoke-virtual {p0}, Lcf/o0;->d0()Lcf/h0;

    move-result-object v1

    invoke-virtual {v1}, Lcf/h0;->f0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/h0$b;->F(Ljava/lang/String;)Lcf/h0$b;

    move-result-object v0

    invoke-virtual {p0}, Lcf/o0;->d0()Lcf/h0;

    move-result-object v1

    invoke-virtual {v1}, Lcf/h0;->g0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/h0$b;->G(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/h0$b;

    move-result-object v0

    sget-object v1, Lcf/p0;->e:Lcf/p0;

    invoke-virtual {v0, v1}, Lcf/h0$b;->D(Lcf/p0;)Lcf/h0$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    check-cast v0, Lcf/h0;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/a;->n()[B

    move-result-object v0

    invoke-static {v0}, Lre/h0;->a([B)Lre/x;

    move-result-object v0

    instance-of v1, v0, Lse/u;

    if-eqz v1, :cond_0

    sget-object v1, Lse/u0$c;->b:Lse/u0$c;

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lse/e0;

    if-eqz v1, :cond_1

    sget-object v1, Lse/u0$c;->d:Lse/u0$c;

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lse/t1;

    if-eqz v1, :cond_2

    sget-object v1, Lse/u0$c;->c:Lse/u0$c;

    goto :goto_0

    :cond_2
    instance-of v1, v0, Lse/k;

    if-eqz v1, :cond_3

    sget-object v1, Lse/u0$c;->e:Lse/u0$c;

    goto :goto_0

    :cond_3
    instance-of v1, v0, Lse/p;

    if-eqz v1, :cond_4

    sget-object v1, Lse/u0$c;->f:Lse/u0$c;

    goto :goto_0

    :cond_4
    instance-of v1, v0, Lse/z;

    if-eqz v1, :cond_5

    sget-object v1, Lse/u0$c;->g:Lse/u0$c;

    :goto_0
    invoke-static {}, Lse/u0;->b()Lse/u0$b;

    move-result-object v2

    invoke-static {p1}, Lse/z0;->n(Lcf/p0;)Lse/u0$d;

    move-result-object p1

    invoke-virtual {v2, p1}, Lse/u0$b;->f(Lse/u0$d;)Lse/u0$b;

    move-result-object p1

    invoke-virtual {p0}, Lcf/o0;->e0()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lse/u0$b;->e(Ljava/lang/String;)Lse/u0$b;

    move-result-object p0

    check-cast v0, Lse/c;

    invoke-virtual {p0, v0}, Lse/u0$b;->c(Lse/c;)Lse/u0$b;

    move-result-object p0

    invoke-virtual {p0, v1}, Lse/u0$b;->d(Lse/u0$c;)Lse/u0$b;

    move-result-object p0

    invoke-virtual {p0}, Lse/u0$b;->a()Lse/u0;

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

.method public static g(Lye/m0;)Lse/u0;
    .locals 3

    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object v0

    invoke-virtual {v0}, Lcf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

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

    invoke-static {v0, v1}, Lcf/o0;->g0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/o0;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object p0

    invoke-virtual {p0}, Lcf/h0;->e0()Lcf/p0;

    move-result-object p0

    invoke-static {v0, p0}, Lse/z0;->f(Lcf/o0;Lcf/p0;)Lse/u0;

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

    invoke-static {v0}, Lse/z0;->i(Lye/d0;)V

    return-void
.end method

.method public static i(Lye/d0;)V
    .locals 1

    sget-object v0, Lse/z0;->b:Lye/g0;

    invoke-virtual {p0, v0}, Lye/d0;->m(Lye/g0;)V

    sget-object v0, Lse/z0;->c:Lye/f0;

    invoke-virtual {p0, v0}, Lye/d0;->l(Lye/f0;)V

    sget-object v0, Lse/z0;->d:Lye/n;

    invoke-virtual {p0, v0}, Lye/d0;->k(Lye/n;)V

    sget-object v0, Lse/z0;->e:Lye/m;

    invoke-virtual {p0, v0}, Lye/d0;->j(Lye/m;)V

    return-void
.end method

.method public static j(Lse/t0;Lre/d0;)Lye/l0;
    .locals 3

    invoke-static {}, Lcf/n0;->d0()Lcf/n0$b;

    move-result-object p1

    invoke-virtual {p0}, Lse/t0;->d()Lse/u0;

    move-result-object v0

    invoke-static {v0}, Lse/z0;->l(Lse/u0;)Lcf/o0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcf/n0$b;->D(Lcf/o0;)Lcf/n0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lcf/n0;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Lcf/f0$c;->f:Lcf/f0$c;

    invoke-virtual {p0}, Lse/t0;->d()Lse/u0;

    move-result-object v1

    invoke-virtual {v1}, Lse/u0;->e()Lse/u0$d;

    move-result-object v1

    invoke-static {v1}, Lse/z0;->m(Lse/u0$d;)Lcf/p0;

    move-result-object v1

    invoke-virtual {p0}, Lse/t0;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    invoke-static {v2, p1, v0, v1, p0}, Lye/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Lcf/f0$c;Lcf/p0;Ljava/lang/Integer;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static k(Lse/u0;)Lye/m0;
    .locals 2

    invoke-static {}, Lcf/h0;->h0()Lcf/h0$b;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    invoke-virtual {v0, v1}, Lcf/h0$b;->F(Ljava/lang/String;)Lcf/h0$b;

    move-result-object v0

    invoke-static {p0}, Lse/z0;->l(Lse/u0;)Lcf/o0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/h0$b;->G(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/h0$b;

    move-result-object v0

    invoke-virtual {p0}, Lse/u0;->e()Lse/u0$d;

    move-result-object p0

    invoke-static {p0}, Lse/z0;->m(Lse/u0$d;)Lcf/p0;

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

.method public static l(Lse/u0;)Lcf/o0;
    .locals 2

    invoke-virtual {p0}, Lse/u0;->c()Lse/c;

    move-result-object v0

    invoke-static {v0}, Lre/h0;->b(Lre/x;)[B

    move-result-object v0

    :try_start_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lcf/h0;->j0([BLcom/google/crypto/tink/shaded/protobuf/p;)Lcf/h0;

    move-result-object v0

    invoke-static {}, Lcf/o0;->f0()Lcf/o0$b;

    move-result-object v1

    invoke-virtual {p0}, Lse/u0;->d()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcf/o0$b;->F(Ljava/lang/String;)Lcf/o0$b;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcf/o0$b;->D(Lcf/h0;)Lcf/o0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lcf/o0;
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

.method public static m(Lse/u0$d;)Lcf/p0;
    .locals 3

    sget-object v0, Lse/u0$d;->b:Lse/u0$d;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcf/p0;->c:Lcf/p0;

    return-object p0

    :cond_0
    sget-object v0, Lse/u0$d;->c:Lse/u0$d;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lcf/p0;->e:Lcf/p0;

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

.method public static n(Lcf/p0;)Lse/u0$d;
    .locals 3

    sget-object v0, Lse/z0$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    sget-object p0, Lse/u0$d;->c:Lse/u0$d;

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
    sget-object p0, Lse/u0$d;->b:Lse/u0$d;

    return-object p0
.end method
