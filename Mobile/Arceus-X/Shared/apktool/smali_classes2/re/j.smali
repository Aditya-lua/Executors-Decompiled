.class public final Lre/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lef/a;

.field public static final b:Lwe/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/g0<",
            "Lqe/p;",
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
            "Lqe/l;",
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

    const-string v0, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-static {v0}, Lwe/s0;->h(Ljava/lang/String;)Lef/a;

    move-result-object v0

    sput-object v0, Lre/j;->a:Lef/a;

    new-instance v1, Lre/f;

    invoke-direct {v1}, Lre/f;-><init>()V

    const-class v2, Lqe/p;

    const-class v3, Lwe/m0;

    invoke-static {v1, v2, v3}, Lwe/g0;->a(Lwe/g0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/g0;

    move-result-object v1

    sput-object v1, Lre/j;->b:Lwe/g0;

    new-instance v1, Lre/g;

    invoke-direct {v1}, Lre/g;-><init>()V

    invoke-static {v1, v0, v3}, Lwe/f0;->a(Lwe/f0$b;Lef/a;Ljava/lang/Class;)Lwe/f0;

    move-result-object v1

    sput-object v1, Lre/j;->c:Lwe/f0;

    new-instance v1, Lre/h;

    invoke-direct {v1}, Lre/h;-><init>()V

    const-class v2, Lqe/l;

    const-class v3, Lwe/l0;

    invoke-static {v1, v2, v3}, Lwe/n;->a(Lwe/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/n;

    move-result-object v1

    sput-object v1, Lre/j;->d:Lwe/n;

    new-instance v1, Lre/i;

    invoke-direct {v1}, Lre/i;-><init>()V

    invoke-static {v1, v0, v3}, Lwe/m;->a(Lwe/m$b;Lef/a;Ljava/lang/Class;)Lwe/m;

    move-result-object v0

    sput-object v0, Lre/j;->e:Lwe/m;

    return-void
.end method

.method public static synthetic a(Lwe/m0;)Lqe/p;
    .locals 0

    invoke-static {p0}, Lre/j;->g(Lwe/m0;)Lqe/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lqe/l;Lpe/d0;)Lwe/l0;
    .locals 0

    invoke-static {p0, p1}, Lre/j;->j(Lqe/l;Lpe/d0;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lwe/l0;Lpe/d0;)Lqe/l;
    .locals 0

    invoke-static {p0, p1}, Lre/j;->f(Lwe/l0;Lpe/d0;)Lqe/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lqe/p;)Lwe/m0;
    .locals 0

    invoke-static {p0}, Lre/j;->k(Lqe/p;)Lwe/m0;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lqe/p;)Laf/k;
    .locals 2

    invoke-virtual {p0}, Lqe/p;->e()I

    move-result v0

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    invoke-static {}, Laf/k;->d0()Laf/k$b;

    move-result-object v0

    invoke-virtual {p0}, Lqe/p;->c()I

    move-result p0

    invoke-virtual {v0, p0}, Laf/k$b;->C(I)Laf/k$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Laf/k;

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {p0}, Lqe/p;->e()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v1, "Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes."

    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static f(Lwe/l0;Lpe/d0;)Lqe/l;
    .locals 3

    invoke-virtual {p0}, Lwe/l0;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lwe/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Laf/i;->g0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/i;

    move-result-object v0

    invoke-virtual {v0}, Laf/i;->e0()I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lqe/p;->b()Lqe/p$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/i;->c0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Lqe/p$b;->c(I)Lqe/p$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/i;->d0()Laf/k;

    move-result-object v2

    invoke-virtual {v2}, Laf/k;->c0()I

    move-result v2

    invoke-virtual {v1, v2}, Lqe/p$b;->b(I)Lqe/p$b;

    move-result-object v1

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Lqe/p$b;->d(I)Lqe/p$b;

    move-result-object v1

    invoke-virtual {p0}, Lwe/l0;->e()Laf/p0;

    move-result-object v2

    invoke-static {v2}, Lre/j;->m(Laf/p0;)Lqe/p$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Lqe/p$b;->e(Lqe/p$c;)Lqe/p$b;

    move-result-object v1

    invoke-virtual {v1}, Lqe/p$b;->a()Lqe/p;

    move-result-object v1

    invoke-static {}, Lqe/l;->b()Lqe/l$b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lqe/l$b;->e(Lqe/p;)Lqe/l$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/i;->c0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->x()[B

    move-result-object v0

    invoke-static {p1}, Lpe/d0;->b(Lpe/d0;)Lpe/d0;

    move-result-object p1

    invoke-static {v0, p1}, Lef/c;->a([BLpe/d0;)Lef/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Lqe/l$b;->d(Lef/c;)Lqe/l$b;

    move-result-object p1

    invoke-virtual {p0}, Lwe/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0}, Lqe/l$b;->c(Ljava/lang/Integer;)Lqe/l$b;

    move-result-object p0

    invoke-virtual {p0}, Lqe/l$b;->a()Lqe/l;

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

    const-string p1, "Parsing AesEaxcKey failed"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Wrong type URL in call to AesEaxProtoSerialization.parseKey"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static g(Lwe/m0;)Lqe/p;
    .locals 3

    invoke-virtual {p0}, Lwe/m0;->d()Laf/h0;

    move-result-object v0

    invoke-virtual {v0}, Laf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesEaxKey"

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

    invoke-static {v0, v1}, Laf/j;->f0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/j;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lqe/p;->b()Lqe/p$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/j;->c0()I

    move-result v2

    invoke-virtual {v1, v2}, Lqe/p$b;->c(I)Lqe/p$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/j;->d0()Laf/k;

    move-result-object v0

    invoke-virtual {v0}, Laf/k;->c0()I

    move-result v0

    invoke-virtual {v1, v0}, Lqe/p$b;->b(I)Lqe/p$b;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Lqe/p$b;->d(I)Lqe/p$b;

    move-result-object v0

    invoke-virtual {p0}, Lwe/m0;->d()Laf/h0;

    move-result-object p0

    invoke-virtual {p0}, Laf/h0;->e0()Laf/p0;

    move-result-object p0

    invoke-static {p0}, Lre/j;->m(Laf/p0;)Lqe/p$c;

    move-result-object p0

    invoke-virtual {v0, p0}, Lqe/p$b;->e(Lqe/p$c;)Lqe/p$b;

    move-result-object p0

    invoke-virtual {p0}, Lqe/p$b;->a()Lqe/p;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing AesEaxParameters failed: "

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong type URL in call to AesEaxProtoSerialization.parseParameters: "

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

    invoke-static {v0}, Lre/j;->i(Lwe/d0;)V

    return-void
.end method

.method public static i(Lwe/d0;)V
    .locals 1

    sget-object v0, Lre/j;->b:Lwe/g0;

    invoke-virtual {p0, v0}, Lwe/d0;->m(Lwe/g0;)V

    sget-object v0, Lre/j;->c:Lwe/f0;

    invoke-virtual {p0, v0}, Lwe/d0;->l(Lwe/f0;)V

    sget-object v0, Lre/j;->d:Lwe/n;

    invoke-virtual {p0, v0}, Lwe/d0;->k(Lwe/n;)V

    sget-object v0, Lre/j;->e:Lwe/m;

    invoke-virtual {p0, v0}, Lwe/d0;->j(Lwe/m;)V

    return-void
.end method

.method public static j(Lqe/l;Lpe/d0;)Lwe/l0;
    .locals 3

    invoke-static {}, Laf/i;->f0()Laf/i$b;

    move-result-object v0

    invoke-virtual {p0}, Lqe/l;->e()Lqe/p;

    move-result-object v1

    invoke-static {v1}, Lre/j;->e(Lqe/p;)Laf/k;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/i$b;->D(Laf/k;)Laf/i$b;

    move-result-object v0

    invoke-virtual {p0}, Lqe/l;->c()Lef/c;

    move-result-object v1

    invoke-static {p1}, Lpe/d0;->b(Lpe/d0;)Lpe/d0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lef/c;->d(Lpe/d0;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Laf/i$b;->C(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/i$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Laf/i;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Laf/f0$c;->c:Laf/f0$c;

    invoke-virtual {p0}, Lqe/l;->e()Lqe/p;

    move-result-object v1

    invoke-virtual {v1}, Lqe/p;->f()Lqe/p$c;

    move-result-object v1

    invoke-static {v1}, Lre/j;->l(Lqe/p$c;)Laf/p0;

    move-result-object v1

    invoke-virtual {p0}, Lqe/l;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-static {v2, p1, v0, v1, p0}, Lwe/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Laf/f0$c;Laf/p0;Ljava/lang/Integer;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method

.method public static k(Lqe/p;)Lwe/m0;
    .locals 3

    invoke-static {}, Laf/h0;->h0()Laf/h0$b;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-virtual {v0, v1}, Laf/h0$b;->D(Ljava/lang/String;)Laf/h0$b;

    move-result-object v0

    invoke-static {}, Laf/j;->e0()Laf/j$b;

    move-result-object v1

    invoke-static {p0}, Lre/j;->e(Lqe/p;)Laf/k;

    move-result-object v2

    invoke-virtual {v1, v2}, Laf/j$b;->D(Laf/k;)Laf/j$b;

    move-result-object v1

    invoke-virtual {p0}, Lqe/p;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Laf/j$b;->C(I)Laf/j$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v1

    check-cast v1, Laf/j;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/h0$b;->E(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/h0$b;

    move-result-object v0

    invoke-virtual {p0}, Lqe/p;->f()Lqe/p$c;

    move-result-object p0

    invoke-static {p0}, Lre/j;->l(Lqe/p$c;)Laf/p0;

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

.method public static l(Lqe/p$c;)Laf/p0;
    .locals 3

    sget-object v0, Lqe/p$c;->b:Lqe/p$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Laf/p0;->c:Laf/p0;

    return-object p0

    :cond_0
    sget-object v0, Lqe/p$c;->c:Lqe/p$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Laf/p0;->f:Laf/p0;

    return-object p0

    :cond_1
    sget-object v0, Lqe/p$c;->d:Lqe/p$c;

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

.method public static m(Laf/p0;)Lqe/p$c;
    .locals 3

    sget-object v0, Lre/j$a;->a:[I

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

    sget-object p0, Lqe/p$c;->d:Lqe/p$c;

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
    sget-object p0, Lqe/p$c;->c:Lqe/p$c;

    return-object p0

    :cond_2
    sget-object p0, Lqe/p$c;->b:Lqe/p$c;

    return-object p0
.end method
