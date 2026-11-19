.class public final Lte/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgf/a;

.field public static final b:Lye/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/g0<",
            "Lse/u;",
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
            "Lse/q;",
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

    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-static {v0}, Lye/s0;->h(Ljava/lang/String;)Lgf/a;

    move-result-object v0

    sput-object v0, Lte/p;->a:Lgf/a;

    new-instance v1, Lte/l;

    invoke-direct {v1}, Lte/l;-><init>()V

    const-class v2, Lse/u;

    const-class v3, Lye/m0;

    invoke-static {v1, v2, v3}, Lye/g0;->a(Lye/g0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/g0;

    move-result-object v1

    sput-object v1, Lte/p;->b:Lye/g0;

    new-instance v1, Lte/m;

    invoke-direct {v1}, Lte/m;-><init>()V

    invoke-static {v1, v0, v3}, Lye/f0;->a(Lye/f0$b;Lgf/a;Ljava/lang/Class;)Lye/f0;

    move-result-object v1

    sput-object v1, Lte/p;->c:Lye/f0;

    new-instance v1, Lte/n;

    invoke-direct {v1}, Lte/n;-><init>()V

    const-class v2, Lse/q;

    const-class v3, Lye/l0;

    invoke-static {v1, v2, v3}, Lye/n;->a(Lye/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/n;

    move-result-object v1

    sput-object v1, Lte/p;->d:Lye/n;

    new-instance v1, Lte/o;

    invoke-direct {v1}, Lte/o;-><init>()V

    invoke-static {v1, v0, v3}, Lye/m;->a(Lye/m$b;Lgf/a;Ljava/lang/Class;)Lye/m;

    move-result-object v0

    sput-object v0, Lte/p;->e:Lye/m;

    return-void
.end method

.method public static synthetic a(Lse/u;)Lye/m0;
    .locals 0

    invoke-static {p0}, Lte/p;->j(Lse/u;)Lye/m0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lye/m0;)Lse/u;
    .locals 0

    invoke-static {p0}, Lte/p;->f(Lye/m0;)Lse/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lse/q;Lre/d0;)Lye/l0;
    .locals 0

    invoke-static {p0, p1}, Lte/p;->i(Lse/q;Lre/d0;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lye/l0;Lre/d0;)Lse/q;
    .locals 0

    invoke-static {p0, p1}, Lte/p;->e(Lye/l0;Lre/d0;)Lse/q;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lye/l0;Lre/d0;)Lse/q;
    .locals 3

    invoke-virtual {p0}, Lye/l0;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lye/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lcf/l;->e0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/l;

    move-result-object v0

    invoke-virtual {v0}, Lcf/l;->c0()I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lse/u;->b()Lse/u$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/l;->b0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Lse/u$b;->c(I)Lse/u$b;

    move-result-object v1

    const/16 v2, 0xc

    invoke-virtual {v1, v2}, Lse/u$b;->b(I)Lse/u$b;

    move-result-object v1

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Lse/u$b;->d(I)Lse/u$b;

    move-result-object v1

    invoke-virtual {p0}, Lye/l0;->e()Lcf/p0;

    move-result-object v2

    invoke-static {v2}, Lte/p;->l(Lcf/p0;)Lse/u$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Lse/u$b;->e(Lse/u$c;)Lse/u$b;

    move-result-object v1

    invoke-virtual {v1}, Lse/u$b;->a()Lse/u;

    move-result-object v1

    invoke-static {}, Lse/q;->b()Lse/q$b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lse/q$b;->e(Lse/u;)Lse/q$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/l;->b0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->v()[B

    move-result-object v0

    invoke-static {p1}, Lre/d0;->b(Lre/d0;)Lre/d0;

    move-result-object p1

    invoke-static {v0, p1}, Lgf/c;->a([BLre/d0;)Lgf/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Lse/q$b;->d(Lgf/c;)Lse/q$b;

    move-result-object p1

    invoke-virtual {p0}, Lye/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0}, Lse/q$b;->c(Ljava/lang/Integer;)Lse/q$b;

    move-result-object p0

    invoke-virtual {p0}, Lse/q$b;->a()Lse/q;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Only version 0 keys are accepted"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Parsing AesGcmKey failed"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Wrong type URL in call to AesGcmProtoSerialization.parseKey"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static f(Lye/m0;)Lse/u;
    .locals 3

    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object v0

    invoke-virtual {v0}, Lcf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmKey"

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

    invoke-static {v0, v1}, Lcf/m;->e0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/m;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Lcf/m;->c0()I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lse/u;->b()Lse/u$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/m;->b0()I

    move-result v0

    invoke-virtual {v1, v0}, Lse/u$b;->c(I)Lse/u$b;

    move-result-object v0

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Lse/u$b;->b(I)Lse/u$b;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Lse/u$b;->d(I)Lse/u$b;

    move-result-object v0

    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object p0

    invoke-virtual {p0}, Lcf/h0;->e0()Lcf/p0;

    move-result-object p0

    invoke-static {p0}, Lte/p;->l(Lcf/p0;)Lse/u$c;

    move-result-object p0

    invoke-virtual {v0, p0}, Lse/u$b;->e(Lse/u$c;)Lse/u$b;

    move-result-object p0

    invoke-virtual {p0}, Lse/u$b;->a()Lse/u;

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

    const-string v1, "Parsing AesGcmParameters failed: "

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong type URL in call to AesGcmProtoSerialization.parseParameters: "

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

    invoke-static {v0}, Lte/p;->h(Lye/d0;)V

    return-void
.end method

.method public static h(Lye/d0;)V
    .locals 1

    sget-object v0, Lte/p;->b:Lye/g0;

    invoke-virtual {p0, v0}, Lye/d0;->m(Lye/g0;)V

    sget-object v0, Lte/p;->c:Lye/f0;

    invoke-virtual {p0, v0}, Lye/d0;->l(Lye/f0;)V

    sget-object v0, Lte/p;->d:Lye/n;

    invoke-virtual {p0, v0}, Lye/d0;->k(Lye/n;)V

    sget-object v0, Lte/p;->e:Lye/m;

    invoke-virtual {p0, v0}, Lye/d0;->j(Lye/m;)V

    return-void
.end method

.method public static i(Lse/q;Lre/d0;)Lye/l0;
    .locals 3

    invoke-virtual {p0}, Lse/q;->e()Lse/u;

    move-result-object v0

    invoke-static {v0}, Lte/p;->m(Lse/u;)V

    invoke-static {}, Lcf/l;->d0()Lcf/l$b;

    move-result-object v0

    invoke-virtual {p0}, Lse/q;->c()Lgf/c;

    move-result-object v1

    invoke-static {p1}, Lre/d0;->b(Lre/d0;)Lre/d0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lgf/c;->d(Lre/d0;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcf/l$b;->D(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/l$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lcf/l;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Lcf/f0$c;->c:Lcf/f0$c;

    invoke-virtual {p0}, Lse/q;->e()Lse/u;

    move-result-object v1

    invoke-virtual {v1}, Lse/u;->f()Lse/u$c;

    move-result-object v1

    invoke-static {v1}, Lte/p;->k(Lse/u$c;)Lcf/p0;

    move-result-object v1

    invoke-virtual {p0}, Lse/q;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-static {v2, p1, v0, v1, p0}, Lye/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Lcf/f0$c;Lcf/p0;Ljava/lang/Integer;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static j(Lse/u;)Lye/m0;
    .locals 3

    invoke-static {p0}, Lte/p;->m(Lse/u;)V

    invoke-static {}, Lcf/h0;->h0()Lcf/h0$b;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-virtual {v0, v1}, Lcf/h0$b;->F(Ljava/lang/String;)Lcf/h0$b;

    move-result-object v0

    invoke-static {}, Lcf/m;->d0()Lcf/m$b;

    move-result-object v1

    invoke-virtual {p0}, Lse/u;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Lcf/m$b;->D(I)Lcf/m$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v1

    check-cast v1, Lcf/m;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/h0$b;->G(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/h0$b;

    move-result-object v0

    invoke-virtual {p0}, Lse/u;->f()Lse/u$c;

    move-result-object p0

    invoke-static {p0}, Lte/p;->k(Lse/u$c;)Lcf/p0;

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

.method public static k(Lse/u$c;)Lcf/p0;
    .locals 3

    sget-object v0, Lse/u$c;->b:Lse/u$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcf/p0;->c:Lcf/p0;

    return-object p0

    :cond_0
    sget-object v0, Lse/u$c;->c:Lse/u$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lcf/p0;->f:Lcf/p0;

    return-object p0

    :cond_1
    sget-object v0, Lse/u$c;->d:Lse/u$c;

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

.method public static l(Lcf/p0;)Lse/u$c;
    .locals 3

    sget-object v0, Lte/p$a;->a:[I

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

    sget-object p0, Lse/u$c;->d:Lse/u$c;

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
    sget-object p0, Lse/u$c;->c:Lse/u$c;

    return-object p0

    :cond_2
    sget-object p0, Lse/u$c;->b:Lse/u$c;

    return-object p0
.end method

.method public static m(Lse/u;)V
    .locals 2

    invoke-virtual {p0}, Lse/u;->e()I

    move-result v0

    const/16 v1, 0x10

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lse/u;->c()I

    move-result v0

    const/16 v1, 0xc

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {p0}, Lse/u;->c()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v1, "Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes."

    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {p0}, Lse/u;->e()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v1, "Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes."

    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
