.class public final Laf/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgf/a;

.field public static final b:Lye/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/g0<",
            "Lze/f;",
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
            "Lze/a;",
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

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    invoke-static {v0}, Lye/s0;->h(Ljava/lang/String;)Lgf/a;

    move-result-object v0

    sput-object v0, Laf/e;->a:Lgf/a;

    new-instance v1, Laf/a;

    invoke-direct {v1}, Laf/a;-><init>()V

    const-class v2, Lze/f;

    const-class v3, Lye/m0;

    invoke-static {v1, v2, v3}, Lye/g0;->a(Lye/g0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/g0;

    move-result-object v1

    sput-object v1, Laf/e;->b:Lye/g0;

    new-instance v1, Laf/b;

    invoke-direct {v1}, Laf/b;-><init>()V

    invoke-static {v1, v0, v3}, Lye/f0;->a(Lye/f0$b;Lgf/a;Ljava/lang/Class;)Lye/f0;

    move-result-object v1

    sput-object v1, Laf/e;->c:Lye/f0;

    new-instance v1, Laf/c;

    invoke-direct {v1}, Laf/c;-><init>()V

    const-class v2, Lze/a;

    const-class v3, Lye/l0;

    invoke-static {v1, v2, v3}, Lye/n;->a(Lye/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/n;

    move-result-object v1

    sput-object v1, Laf/e;->d:Lye/n;

    new-instance v1, Laf/d;

    invoke-direct {v1}, Laf/d;-><init>()V

    invoke-static {v1, v0, v3}, Lye/m;->a(Lye/m$b;Lgf/a;Ljava/lang/Class;)Lye/m;

    move-result-object v0

    sput-object v0, Laf/e;->e:Lye/m;

    return-void
.end method

.method public static synthetic a(Lze/f;)Lye/m0;
    .locals 0

    invoke-static {p0}, Laf/e;->k(Lze/f;)Lye/m0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lze/a;Lre/d0;)Lye/l0;
    .locals 0

    invoke-static {p0, p1}, Laf/e;->j(Lze/a;Lre/d0;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lye/l0;Lre/d0;)Lze/a;
    .locals 0

    invoke-static {p0, p1}, Laf/e;->f(Lye/l0;Lre/d0;)Lze/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lye/m0;)Lze/f;
    .locals 0

    invoke-static {p0}, Laf/e;->g(Lye/m0;)Lze/f;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lze/f;)Lcf/c;
    .locals 1

    invoke-static {}, Lcf/c;->d0()Lcf/c$b;

    move-result-object v0

    invoke-virtual {p0}, Lze/f;->c()I

    move-result p0

    invoke-virtual {v0, p0}, Lcf/c$b;->D(I)Lcf/c$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lcf/c;

    return-object p0
.end method

.method public static f(Lye/l0;Lre/d0;)Lze/a;
    .locals 3

    invoke-virtual {p0}, Lye/l0;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lye/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lcf/a;->g0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/a;

    move-result-object v0

    invoke-virtual {v0}, Lcf/a;->e0()I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lze/f;->b()Lze/f$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/a;->c0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Lze/f$b;->b(I)Lze/f$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/a;->d0()Lcf/c;

    move-result-object v2

    invoke-virtual {v2}, Lcf/c;->c0()I

    move-result v2

    invoke-virtual {v1, v2}, Lze/f$b;->c(I)Lze/f$b;

    move-result-object v1

    invoke-virtual {p0}, Lye/l0;->e()Lcf/p0;

    move-result-object v2

    invoke-static {v2}, Laf/e;->m(Lcf/p0;)Lze/f$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Lze/f$b;->d(Lze/f$c;)Lze/f$b;

    move-result-object v1

    invoke-virtual {v1}, Lze/f$b;->a()Lze/f;

    move-result-object v1

    invoke-static {}, Lze/a;->b()Lze/a$b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lze/a$b;->e(Lze/f;)Lze/a$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/a;->c0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->v()[B

    move-result-object v0

    invoke-static {p1}, Lre/d0;->b(Lre/d0;)Lre/d0;

    move-result-object p1

    invoke-static {v0, p1}, Lgf/c;->a([BLre/d0;)Lgf/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Lze/a$b;->c(Lgf/c;)Lze/a$b;

    move-result-object p1

    invoke-virtual {p0}, Lye/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0}, Lze/a$b;->d(Ljava/lang/Integer;)Lze/a$b;

    move-result-object p0

    invoke-virtual {p0}, Lze/a$b;->a()Lze/a;

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

    const-string p1, "Parsing AesCmacKey failed"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Wrong type URL in call to AesCmacProtoSerialization.parseKey"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static g(Lye/m0;)Lze/f;
    .locals 3

    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object v0

    invoke-virtual {v0}, Lcf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCmacKey"

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

    invoke-static {v0, v1}, Lcf/b;->f0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/b;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lze/f;->b()Lze/f$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/b;->c0()I

    move-result v2

    invoke-virtual {v1, v2}, Lze/f$b;->b(I)Lze/f$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/b;->d0()Lcf/c;

    move-result-object v0

    invoke-virtual {v0}, Lcf/c;->c0()I

    move-result v0

    invoke-virtual {v1, v0}, Lze/f$b;->c(I)Lze/f$b;

    move-result-object v0

    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object p0

    invoke-virtual {p0}, Lcf/h0;->e0()Lcf/p0;

    move-result-object p0

    invoke-static {p0}, Laf/e;->m(Lcf/p0;)Lze/f$c;

    move-result-object p0

    invoke-virtual {v0, p0}, Lze/f$b;->d(Lze/f$c;)Lze/f$b;

    move-result-object p0

    invoke-virtual {p0}, Lze/f$b;->a()Lze/f;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing AesCmacParameters failed: "

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong type URL in call to AesCmacProtoSerialization.parseParameters: "

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

    invoke-static {v0}, Laf/e;->i(Lye/d0;)V

    return-void
.end method

.method public static i(Lye/d0;)V
    .locals 1

    sget-object v0, Laf/e;->b:Lye/g0;

    invoke-virtual {p0, v0}, Lye/d0;->m(Lye/g0;)V

    sget-object v0, Laf/e;->c:Lye/f0;

    invoke-virtual {p0, v0}, Lye/d0;->l(Lye/f0;)V

    sget-object v0, Laf/e;->d:Lye/n;

    invoke-virtual {p0, v0}, Lye/d0;->k(Lye/n;)V

    sget-object v0, Laf/e;->e:Lye/m;

    invoke-virtual {p0, v0}, Lye/d0;->j(Lye/m;)V

    return-void
.end method

.method public static j(Lze/a;Lre/d0;)Lye/l0;
    .locals 3

    invoke-static {}, Lcf/a;->f0()Lcf/a$b;

    move-result-object v0

    invoke-virtual {p0}, Lze/a;->e()Lze/f;

    move-result-object v1

    invoke-static {v1}, Laf/e;->e(Lze/f;)Lcf/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/a$b;->F(Lcf/c;)Lcf/a$b;

    move-result-object v0

    invoke-virtual {p0}, Lze/a;->c()Lgf/c;

    move-result-object v1

    invoke-static {p1}, Lre/d0;->b(Lre/d0;)Lre/d0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lgf/c;->d(Lre/d0;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcf/a$b;->D(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/a$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lcf/a;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Lcf/f0$c;->c:Lcf/f0$c;

    invoke-virtual {p0}, Lze/a;->e()Lze/f;

    move-result-object v1

    invoke-virtual {v1}, Lze/f;->f()Lze/f$c;

    move-result-object v1

    invoke-static {v1}, Laf/e;->l(Lze/f$c;)Lcf/p0;

    move-result-object v1

    invoke-virtual {p0}, Lze/a;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    invoke-static {v2, p1, v0, v1, p0}, Lye/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Lcf/f0$c;Lcf/p0;Ljava/lang/Integer;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static k(Lze/f;)Lye/m0;
    .locals 3

    invoke-static {}, Lcf/h0;->h0()Lcf/h0$b;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    invoke-virtual {v0, v1}, Lcf/h0$b;->F(Ljava/lang/String;)Lcf/h0$b;

    move-result-object v0

    invoke-static {}, Lcf/b;->e0()Lcf/b$b;

    move-result-object v1

    invoke-static {p0}, Laf/e;->e(Lze/f;)Lcf/c;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcf/b$b;->F(Lcf/c;)Lcf/b$b;

    move-result-object v1

    invoke-virtual {p0}, Lze/f;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Lcf/b$b;->D(I)Lcf/b$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v1

    check-cast v1, Lcf/b;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/h0$b;->G(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/h0$b;

    move-result-object v0

    invoke-virtual {p0}, Lze/f;->f()Lze/f$c;

    move-result-object p0

    invoke-static {p0}, Laf/e;->l(Lze/f$c;)Lcf/p0;

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

.method public static l(Lze/f$c;)Lcf/p0;
    .locals 3

    sget-object v0, Lze/f$c;->b:Lze/f$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcf/p0;->c:Lcf/p0;

    return-object p0

    :cond_0
    sget-object v0, Lze/f$c;->c:Lze/f$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lcf/p0;->f:Lcf/p0;

    return-object p0

    :cond_1
    sget-object v0, Lze/f$c;->e:Lze/f$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lcf/p0;->e:Lcf/p0;

    return-object p0

    :cond_2
    sget-object v0, Lze/f$c;->d:Lze/f$c;

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

.method public static m(Lcf/p0;)Lze/f$c;
    .locals 3

    sget-object v0, Laf/e$a;->a:[I

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

    sget-object p0, Lze/f$c;->e:Lze/f$c;

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
    sget-object p0, Lze/f$c;->d:Lze/f$c;

    return-object p0

    :cond_2
    sget-object p0, Lze/f$c;->c:Lze/f$c;

    return-object p0

    :cond_3
    sget-object p0, Lze/f$c;->b:Lze/f$c;

    return-object p0
.end method
