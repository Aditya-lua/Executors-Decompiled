.class public final Lcf/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lef/a;

.field public static final b:Lef/a;

.field public static final c:Lwe/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/g0<",
            "Lbf/i;",
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
            "Lbf/o;",
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
            "Lbf/j;",
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
            "Lbf/i$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey"

    invoke-static {v0}, Lwe/s0;->h(Ljava/lang/String;)Lef/a;

    move-result-object v0

    sput-object v0, Lcf/n;->a:Lef/a;

    const-string v1, "type.googleapis.com/google.crypto.tink.Ed25519PublicKey"

    invoke-static {v1}, Lwe/s0;->h(Ljava/lang/String;)Lef/a;

    move-result-object v1

    sput-object v1, Lcf/n;->b:Lef/a;

    new-instance v2, Lcf/h;

    invoke-direct {v2}, Lcf/h;-><init>()V

    const-class v3, Lbf/i;

    const-class v4, Lwe/m0;

    invoke-static {v2, v3, v4}, Lwe/g0;->a(Lwe/g0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/g0;

    move-result-object v2

    sput-object v2, Lcf/n;->c:Lwe/g0;

    new-instance v2, Lcf/i;

    invoke-direct {v2}, Lcf/i;-><init>()V

    invoke-static {v2, v0, v4}, Lwe/f0;->a(Lwe/f0$b;Lef/a;Ljava/lang/Class;)Lwe/f0;

    move-result-object v2

    sput-object v2, Lcf/n;->d:Lwe/f0;

    new-instance v2, Lcf/j;

    invoke-direct {v2}, Lcf/j;-><init>()V

    const-class v3, Lbf/o;

    const-class v4, Lwe/l0;

    invoke-static {v2, v3, v4}, Lwe/n;->a(Lwe/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/n;

    move-result-object v2

    sput-object v2, Lcf/n;->e:Lwe/n;

    new-instance v2, Lcf/k;

    invoke-direct {v2}, Lcf/k;-><init>()V

    invoke-static {v2, v1, v4}, Lwe/m;->a(Lwe/m$b;Lef/a;Ljava/lang/Class;)Lwe/m;

    move-result-object v1

    sput-object v1, Lcf/n;->f:Lwe/m;

    new-instance v1, Lcf/l;

    invoke-direct {v1}, Lcf/l;-><init>()V

    const-class v2, Lbf/j;

    invoke-static {v1, v2, v4}, Lwe/n;->a(Lwe/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/n;

    move-result-object v1

    sput-object v1, Lcf/n;->g:Lwe/n;

    new-instance v1, Lcf/m;

    invoke-direct {v1}, Lcf/m;-><init>()V

    invoke-static {v1, v0, v4}, Lwe/m;->a(Lwe/m$b;Lef/a;Ljava/lang/Class;)Lwe/m;

    move-result-object v0

    sput-object v0, Lcf/n;->h:Lwe/m;

    invoke-static {}, Lwe/h;->a()Lwe/h$b;

    move-result-object v0

    sget-object v1, Laf/p0;->e:Laf/p0;

    sget-object v2, Lbf/i$a;->e:Lbf/i$a;

    invoke-virtual {v0, v1, v2}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v0

    sget-object v1, Laf/p0;->c:Laf/p0;

    sget-object v2, Lbf/i$a;->b:Lbf/i$a;

    invoke-virtual {v0, v1, v2}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v0

    sget-object v1, Laf/p0;->f:Laf/p0;

    sget-object v2, Lbf/i$a;->c:Lbf/i$a;

    invoke-virtual {v0, v1, v2}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v0

    sget-object v1, Laf/p0;->d:Laf/p0;

    sget-object v2, Lbf/i$a;->d:Lbf/i$a;

    invoke-virtual {v0, v1, v2}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lwe/h$b;->b()Lwe/h;

    move-result-object v0

    sput-object v0, Lcf/n;->i:Lwe/h;

    return-void
.end method

.method public static synthetic a(Lbf/i;)Lwe/m0;
    .locals 0

    invoke-static {p0}, Lcf/n;->m(Lbf/i;)Lwe/m0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lwe/l0;Lpe/d0;)Lbf/j;
    .locals 0

    invoke-static {p0, p1}, Lcf/n;->i(Lwe/l0;Lpe/d0;)Lbf/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lbf/o;Lpe/d0;)Lwe/l0;
    .locals 0

    invoke-static {p0, p1}, Lcf/n;->o(Lbf/o;Lpe/d0;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lwe/l0;Lpe/d0;)Lbf/o;
    .locals 0

    invoke-static {p0, p1}, Lcf/n;->j(Lwe/l0;Lpe/d0;)Lbf/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lwe/m0;)Lbf/i;
    .locals 0

    invoke-static {p0}, Lcf/n;->h(Lwe/m0;)Lbf/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lbf/j;Lpe/d0;)Lwe/l0;
    .locals 0

    invoke-static {p0, p1}, Lcf/n;->n(Lbf/j;Lpe/d0;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method

.method public static g(Lbf/o;)Laf/y;
    .locals 1

    invoke-static {}, Laf/y;->e0()Laf/y$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/o;->f()Lef/a;

    move-result-object p0

    invoke-virtual {p0}, Lef/a;->d()[B

    move-result-object p0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    invoke-virtual {v0, p0}, Laf/y$b;->C(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/y$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Laf/y;

    return-object p0
.end method

.method public static h(Lwe/m0;)Lbf/i;
    .locals 3

    invoke-virtual {p0}, Lwe/m0;->d()Laf/h0;

    move-result-object v0

    invoke-virtual {v0}, Laf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey"

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

    invoke-static {v0, v1}, Laf/w;->c0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/w;

    move-result-object v0

    invoke-virtual {v0}, Laf/w;->b0()I

    move-result v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    sget-object v0, Lcf/n;->i:Lwe/h;

    invoke-virtual {p0}, Lwe/m0;->d()Laf/h0;

    move-result-object p0

    invoke-virtual {p0}, Laf/h0;->e0()Laf/p0;

    move-result-object p0

    invoke-virtual {v0, p0}, Lwe/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbf/i$a;

    invoke-static {p0}, Lbf/i;->b(Lbf/i$a;)Lbf/i;

    move-result-object p0

    return-object p0

    :cond_0
    :try_start_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Only version 0 keys are accepted"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing Ed25519Parameters failed: "

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: "

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

.method public static i(Lwe/l0;Lpe/d0;)Lbf/j;
    .locals 4

    invoke-virtual {p0}, Lwe/l0;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    invoke-virtual {p0}, Lwe/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Laf/x;->g0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/x;

    move-result-object v0

    invoke-virtual {v0}, Laf/x;->e0()I

    move-result v1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "Only version 0 keys are accepted"

    if-nez v1, :cond_1

    :try_start_1
    invoke-virtual {v0}, Laf/x;->d0()Laf/y;

    move-result-object v1

    invoke-virtual {v1}, Laf/y;->d0()I

    move-result v3

    if-nez v3, :cond_0

    sget-object v2, Lcf/n;->i:Lwe/h;

    invoke-virtual {p0}, Lwe/l0;->e()Laf/p0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lwe/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbf/i$a;

    invoke-virtual {v1}, Laf/y;->c0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->x()[B

    move-result-object v1

    invoke-static {v1}, Lef/a;->a([B)Lef/a;

    move-result-object v1

    invoke-virtual {p0}, Lwe/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-static {v2, v1, p0}, Lbf/o;->c(Lbf/i$a;Lef/a;Ljava/lang/Integer;)Lbf/o;

    move-result-object p0

    invoke-virtual {v0}, Laf/x;->c0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->x()[B

    move-result-object v0

    invoke-static {p1}, Lpe/d0;->b(Lpe/d0;)Lpe/d0;

    move-result-object p1

    invoke-static {v0, p1}, Lef/c;->a([BLpe/d0;)Lef/c;

    move-result-object p1

    invoke-static {p0, p1}, Lbf/j;->d(Lbf/o;Lef/c;)Lbf/j;

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

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Parsing Ed25519PrivateKey failed"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lwe/l0;->f()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static j(Lwe/l0;Lpe/d0;)Lbf/o;
    .locals 2

    invoke-virtual {p0}, Lwe/l0;->f()Ljava/lang/String;

    move-result-object p1

    const-string v0, "type.googleapis.com/google.crypto.tink.Ed25519PublicKey"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lwe/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Laf/y;->f0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/y;

    move-result-object p1

    invoke-virtual {p1}, Laf/y;->d0()I

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcf/n;->i:Lwe/h;

    invoke-virtual {p0}, Lwe/l0;->e()Laf/p0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lwe/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbf/i$a;

    invoke-virtual {p1}, Laf/y;->c0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->x()[B

    move-result-object p1

    invoke-static {p1}, Lef/a;->a([B)Lef/a;

    move-result-object p1

    invoke-virtual {p0}, Lwe/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-static {v0, p1, p0}, Lbf/o;->c(Lbf/i$a;Lef/a;Ljava/lang/Integer;)Lbf/o;

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

    const-string p1, "Parsing Ed25519PublicKey failed"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lwe/l0;->f()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static k()V
    .locals 1

    invoke-static {}, Lwe/d0;->c()Lwe/d0;

    move-result-object v0

    invoke-static {v0}, Lcf/n;->l(Lwe/d0;)V

    return-void
.end method

.method public static l(Lwe/d0;)V
    .locals 1

    sget-object v0, Lcf/n;->c:Lwe/g0;

    invoke-virtual {p0, v0}, Lwe/d0;->m(Lwe/g0;)V

    sget-object v0, Lcf/n;->d:Lwe/f0;

    invoke-virtual {p0, v0}, Lwe/d0;->l(Lwe/f0;)V

    sget-object v0, Lcf/n;->e:Lwe/n;

    invoke-virtual {p0, v0}, Lwe/d0;->k(Lwe/n;)V

    sget-object v0, Lcf/n;->f:Lwe/m;

    invoke-virtual {p0, v0}, Lwe/d0;->j(Lwe/m;)V

    sget-object v0, Lcf/n;->g:Lwe/n;

    invoke-virtual {p0, v0}, Lwe/d0;->k(Lwe/n;)V

    sget-object v0, Lcf/n;->h:Lwe/m;

    invoke-virtual {p0, v0}, Lwe/d0;->j(Lwe/m;)V

    return-void
.end method

.method public static m(Lbf/i;)Lwe/m0;
    .locals 2

    invoke-static {}, Laf/h0;->h0()Laf/h0$b;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey"

    invoke-virtual {v0, v1}, Laf/h0$b;->D(Ljava/lang/String;)Laf/h0$b;

    move-result-object v0

    invoke-static {}, Laf/w;->a0()Laf/w;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/h0$b;->E(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/h0$b;

    move-result-object v0

    sget-object v1, Lcf/n;->i:Lwe/h;

    invoke-virtual {p0}, Lbf/i;->c()Lbf/i$a;

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

.method public static n(Lbf/j;Lpe/d0;)Lwe/l0;
    .locals 3

    invoke-static {}, Laf/x;->f0()Laf/x$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/j;->g()Lbf/o;

    move-result-object v1

    invoke-static {v1}, Lcf/n;->g(Lbf/o;)Laf/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/x$b;->D(Laf/y;)Laf/x$b;

    move-result-object v0

    invoke-virtual {p0}, Lbf/j;->f()Lef/c;

    move-result-object v1

    invoke-static {p1}, Lpe/d0;->b(Lpe/d0;)Lpe/d0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lef/c;->d(Lpe/d0;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Laf/x$b;->C(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/x$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Laf/x;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Laf/f0$c;->d:Laf/f0$c;

    sget-object v1, Lcf/n;->i:Lwe/h;

    invoke-virtual {p0}, Lbf/j;->e()Lbf/i;

    move-result-object v2

    invoke-virtual {v2}, Lbf/i;->c()Lbf/i$a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lwe/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Laf/p0;

    invoke-virtual {p0}, Lbf/b1;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey"

    invoke-static {v2, p1, v0, v1, p0}, Lwe/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Laf/f0$c;Laf/p0;Ljava/lang/Integer;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method

.method public static o(Lbf/o;Lpe/d0;)Lwe/l0;
    .locals 3

    invoke-static {p0}, Lcf/n;->g(Lbf/o;)Laf/y;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Laf/f0$c;->e:Laf/f0$c;

    sget-object v1, Lcf/n;->i:Lwe/h;

    invoke-virtual {p0}, Lbf/o;->e()Lbf/i;

    move-result-object v2

    invoke-virtual {v2}, Lbf/i;->c()Lbf/i$a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lwe/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Laf/p0;

    invoke-virtual {p0}, Lbf/o;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.Ed25519PublicKey"

    invoke-static {v2, p1, v0, v1, p0}, Lwe/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Laf/f0$c;Laf/p0;Ljava/lang/Integer;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method
