.class public final Lte/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgf/a;

.field public static final b:Lye/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/g0<",
            "Lse/o1;",
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
            "Lse/k1;",
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

    const-string v0, "type.googleapis.com/google.crypto.tink.XAesGcmKey"

    invoke-static {v0}, Lye/s0;->h(Ljava/lang/String;)Lgf/a;

    move-result-object v0

    sput-object v0, Lte/q0;->a:Lgf/a;

    new-instance v1, Lte/m0;

    invoke-direct {v1}, Lte/m0;-><init>()V

    const-class v2, Lse/o1;

    const-class v3, Lye/m0;

    invoke-static {v1, v2, v3}, Lye/g0;->a(Lye/g0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/g0;

    move-result-object v1

    sput-object v1, Lte/q0;->b:Lye/g0;

    new-instance v1, Lte/n0;

    invoke-direct {v1}, Lte/n0;-><init>()V

    invoke-static {v1, v0, v3}, Lye/f0;->a(Lye/f0$b;Lgf/a;Ljava/lang/Class;)Lye/f0;

    move-result-object v1

    sput-object v1, Lte/q0;->c:Lye/f0;

    new-instance v1, Lte/o0;

    invoke-direct {v1}, Lte/o0;-><init>()V

    const-class v2, Lse/k1;

    const-class v3, Lye/l0;

    invoke-static {v1, v2, v3}, Lye/n;->a(Lye/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/n;

    move-result-object v1

    sput-object v1, Lte/q0;->d:Lye/n;

    new-instance v1, Lte/p0;

    invoke-direct {v1}, Lte/p0;-><init>()V

    invoke-static {v1, v0, v3}, Lye/m;->a(Lye/m$b;Lgf/a;Ljava/lang/Class;)Lye/m;

    move-result-object v0

    sput-object v0, Lte/q0;->e:Lye/m;

    return-void
.end method

.method public static synthetic a(Lye/m0;)Lse/o1;
    .locals 0

    invoke-static {p0}, Lte/q0;->f(Lye/m0;)Lse/o1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lse/o1;)Lye/m0;
    .locals 0

    invoke-static {p0}, Lte/q0;->j(Lse/o1;)Lye/m0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lye/l0;Lre/d0;)Lse/k1;
    .locals 0

    invoke-static {p0, p1}, Lte/q0;->e(Lye/l0;Lre/d0;)Lse/k1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lse/k1;Lre/d0;)Lye/l0;
    .locals 0

    invoke-static {p0, p1}, Lte/q0;->i(Lse/k1;Lre/d0;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lye/l0;Lre/d0;)Lse/k1;
    .locals 3

    invoke-virtual {p0}, Lye/l0;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.XAesGcmKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    invoke-virtual {p0}, Lye/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lcf/z0;->g0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/z0;

    move-result-object v0

    invoke-virtual {v0}, Lcf/z0;->e0()I

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcf/z0;->c0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v1

    const/16 v2, 0x20

    if-ne v1, v2, :cond_0

    invoke-virtual {p0}, Lye/l0;->e()Lcf/p0;

    move-result-object v1

    invoke-static {v1}, Lte/q0;->l(Lcf/p0;)Lse/o1$a;

    move-result-object v1

    invoke-virtual {v0}, Lcf/z0;->d0()Lcf/b1;

    move-result-object v2

    invoke-virtual {v2}, Lcf/b1;->c0()I

    move-result v2

    invoke-static {v1, v2}, Lse/o1;->b(Lse/o1$a;I)Lse/o1;

    move-result-object v1

    invoke-virtual {v0}, Lcf/z0;->c0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->v()[B

    move-result-object v0

    invoke-static {p1}, Lre/d0;->b(Lre/d0;)Lre/d0;

    move-result-object p1

    invoke-static {v0, p1}, Lgf/c;->a([BLre/d0;)Lgf/c;

    move-result-object p1

    invoke-virtual {p0}, Lye/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-static {v1, p1, p0}, Lse/k1;->b(Lse/o1;Lgf/c;Ljava/lang/Integer;)Lse/k1;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Only 32 byte key size is accepted"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Only version 0 keys are accepted"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Parsing XAesGcmKey failed"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Wrong type URL in call to XAesGcmProtoSerialization.parseKey"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static f(Lye/m0;)Lse/o1;
    .locals 3

    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object v0

    invoke-virtual {v0}, Lcf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.XAesGcmKey"

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

    invoke-static {v0, v1}, Lcf/a1;->e0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/a1;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Lcf/a1;->c0()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object p0

    invoke-virtual {p0}, Lcf/h0;->e0()Lcf/p0;

    move-result-object p0

    invoke-static {p0}, Lte/q0;->l(Lcf/p0;)Lse/o1$a;

    move-result-object p0

    invoke-virtual {v0}, Lcf/a1;->b0()Lcf/b1;

    move-result-object v0

    invoke-virtual {v0}, Lcf/b1;->c0()I

    move-result v0

    invoke-static {p0, v0}, Lse/o1;->b(Lse/o1$a;I)Lse/o1;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 parameters are accepted"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing XAesGcmParameters failed: "

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: "

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

.method public static g()V
    .locals 1

    invoke-static {}, Lye/d0;->c()Lye/d0;

    move-result-object v0

    invoke-static {v0}, Lte/q0;->h(Lye/d0;)V

    return-void
.end method

.method public static h(Lye/d0;)V
    .locals 1

    sget-object v0, Lte/q0;->b:Lye/g0;

    invoke-virtual {p0, v0}, Lye/d0;->m(Lye/g0;)V

    sget-object v0, Lte/q0;->c:Lye/f0;

    invoke-virtual {p0, v0}, Lye/d0;->l(Lye/f0;)V

    sget-object v0, Lte/q0;->d:Lye/n;

    invoke-virtual {p0, v0}, Lye/d0;->k(Lye/n;)V

    sget-object v0, Lte/q0;->e:Lye/m;

    invoke-virtual {p0, v0}, Lye/d0;->j(Lye/m;)V

    return-void
.end method

.method public static i(Lse/k1;Lre/d0;)Lye/l0;
    .locals 3

    invoke-static {}, Lcf/z0;->f0()Lcf/z0$b;

    move-result-object v0

    invoke-virtual {p0}, Lse/k1;->c()Lgf/c;

    move-result-object v1

    invoke-static {p1}, Lre/d0;->b(Lre/d0;)Lre/d0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lgf/c;->d(Lre/d0;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcf/z0$b;->D(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/z0$b;

    move-result-object p1

    invoke-static {}, Lcf/b1;->d0()Lcf/b1$b;

    move-result-object v0

    invoke-virtual {p0}, Lse/k1;->f()Lse/o1;

    move-result-object v1

    invoke-virtual {v1}, Lse/o1;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lcf/b1$b;->D(I)Lcf/b1$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    check-cast v0, Lcf/b1;

    invoke-virtual {p1, v0}, Lcf/z0$b;->F(Lcf/b1;)Lcf/z0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lcf/z0;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Lcf/f0$c;->c:Lcf/f0$c;

    invoke-virtual {p0}, Lse/k1;->f()Lse/o1;

    move-result-object v1

    invoke-virtual {v1}, Lse/o1;->d()Lse/o1$a;

    move-result-object v1

    invoke-static {v1}, Lte/q0;->k(Lse/o1$a;)Lcf/p0;

    move-result-object v1

    invoke-virtual {p0}, Lse/k1;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.XAesGcmKey"

    invoke-static {v2, p1, v0, v1, p0}, Lye/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Lcf/f0$c;Lcf/p0;Ljava/lang/Integer;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static j(Lse/o1;)Lye/m0;
    .locals 4

    invoke-static {}, Lcf/h0;->h0()Lcf/h0$b;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.XAesGcmKey"

    invoke-virtual {v0, v1}, Lcf/h0$b;->F(Ljava/lang/String;)Lcf/h0$b;

    move-result-object v0

    invoke-static {}, Lcf/a1;->d0()Lcf/a1$b;

    move-result-object v1

    invoke-static {}, Lcf/b1;->d0()Lcf/b1$b;

    move-result-object v2

    invoke-virtual {p0}, Lse/o1;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Lcf/b1$b;->D(I)Lcf/b1$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v2

    check-cast v2, Lcf/b1;

    invoke-virtual {v1, v2}, Lcf/a1$b;->D(Lcf/b1;)Lcf/a1$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v1

    check-cast v1, Lcf/a1;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/h0$b;->G(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/h0$b;

    move-result-object v0

    invoke-virtual {p0}, Lse/o1;->d()Lse/o1$a;

    move-result-object p0

    invoke-static {p0}, Lte/q0;->k(Lse/o1$a;)Lcf/p0;

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

.method public static k(Lse/o1$a;)Lcf/p0;
    .locals 3

    sget-object v0, Lse/o1$a;->b:Lse/o1$a;

    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcf/p0;->c:Lcf/p0;

    return-object p0

    :cond_0
    sget-object v0, Lse/o1$a;->c:Lse/o1$a;

    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

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

.method public static l(Lcf/p0;)Lse/o1$a;
    .locals 3

    sget-object v0, Lte/q0$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    sget-object p0, Lse/o1$a;->c:Lse/o1$a;

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
    sget-object p0, Lse/o1$a;->b:Lse/o1$a;

    return-object p0
.end method
