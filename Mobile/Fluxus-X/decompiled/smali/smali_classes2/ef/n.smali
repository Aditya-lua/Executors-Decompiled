.class public final Lef/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgf/a;

.field public static final b:Lgf/a;

.field public static final c:Lye/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/g0<",
            "Ldf/i;",
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
            "Ldf/o;",
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
            "Ldf/j;",
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
            "Ldf/i$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey"

    invoke-static {v0}, Lye/s0;->h(Ljava/lang/String;)Lgf/a;

    move-result-object v0

    sput-object v0, Lef/n;->a:Lgf/a;

    const-string v1, "type.googleapis.com/google.crypto.tink.Ed25519PublicKey"

    invoke-static {v1}, Lye/s0;->h(Ljava/lang/String;)Lgf/a;

    move-result-object v1

    sput-object v1, Lef/n;->b:Lgf/a;

    new-instance v2, Lef/h;

    invoke-direct {v2}, Lef/h;-><init>()V

    const-class v3, Ldf/i;

    const-class v4, Lye/m0;

    invoke-static {v2, v3, v4}, Lye/g0;->a(Lye/g0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/g0;

    move-result-object v2

    sput-object v2, Lef/n;->c:Lye/g0;

    new-instance v2, Lef/i;

    invoke-direct {v2}, Lef/i;-><init>()V

    invoke-static {v2, v0, v4}, Lye/f0;->a(Lye/f0$b;Lgf/a;Ljava/lang/Class;)Lye/f0;

    move-result-object v2

    sput-object v2, Lef/n;->d:Lye/f0;

    new-instance v2, Lef/j;

    invoke-direct {v2}, Lef/j;-><init>()V

    const-class v3, Ldf/o;

    const-class v4, Lye/l0;

    invoke-static {v2, v3, v4}, Lye/n;->a(Lye/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/n;

    move-result-object v2

    sput-object v2, Lef/n;->e:Lye/n;

    new-instance v2, Lef/k;

    invoke-direct {v2}, Lef/k;-><init>()V

    invoke-static {v2, v1, v4}, Lye/m;->a(Lye/m$b;Lgf/a;Ljava/lang/Class;)Lye/m;

    move-result-object v1

    sput-object v1, Lef/n;->f:Lye/m;

    new-instance v1, Lef/l;

    invoke-direct {v1}, Lef/l;-><init>()V

    const-class v2, Ldf/j;

    invoke-static {v1, v2, v4}, Lye/n;->a(Lye/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/n;

    move-result-object v1

    sput-object v1, Lef/n;->g:Lye/n;

    new-instance v1, Lef/m;

    invoke-direct {v1}, Lef/m;-><init>()V

    invoke-static {v1, v0, v4}, Lye/m;->a(Lye/m$b;Lgf/a;Ljava/lang/Class;)Lye/m;

    move-result-object v0

    sput-object v0, Lef/n;->h:Lye/m;

    invoke-static {}, Lye/h;->a()Lye/h$b;

    move-result-object v0

    sget-object v1, Lcf/p0;->e:Lcf/p0;

    sget-object v2, Ldf/i$a;->e:Ldf/i$a;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    sget-object v1, Lcf/p0;->c:Lcf/p0;

    sget-object v2, Ldf/i$a;->b:Ldf/i$a;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    sget-object v1, Lcf/p0;->f:Lcf/p0;

    sget-object v2, Ldf/i$a;->c:Ldf/i$a;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    sget-object v1, Lcf/p0;->d:Lcf/p0;

    sget-object v2, Ldf/i$a;->d:Ldf/i$a;

    invoke-virtual {v0, v1, v2}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lye/h$b;->b()Lye/h;

    move-result-object v0

    sput-object v0, Lef/n;->i:Lye/h;

    return-void
.end method

.method public static synthetic a(Ldf/i;)Lye/m0;
    .locals 0

    invoke-static {p0}, Lef/n;->m(Ldf/i;)Lye/m0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lye/l0;Lre/d0;)Ldf/j;
    .locals 0

    invoke-static {p0, p1}, Lef/n;->i(Lye/l0;Lre/d0;)Ldf/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ldf/o;Lre/d0;)Lye/l0;
    .locals 0

    invoke-static {p0, p1}, Lef/n;->o(Ldf/o;Lre/d0;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lye/l0;Lre/d0;)Ldf/o;
    .locals 0

    invoke-static {p0, p1}, Lef/n;->j(Lye/l0;Lre/d0;)Ldf/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lye/m0;)Ldf/i;
    .locals 0

    invoke-static {p0}, Lef/n;->h(Lye/m0;)Ldf/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ldf/j;Lre/d0;)Lye/l0;
    .locals 0

    invoke-static {p0, p1}, Lef/n;->n(Ldf/j;Lre/d0;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ldf/o;)Lcf/y;
    .locals 1

    invoke-static {}, Lcf/y;->e0()Lcf/y$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/o;->f()Lgf/a;

    move-result-object p0

    invoke-virtual {p0}, Lgf/a;->d()[B

    move-result-object p0

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcf/y$b;->D(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/y$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lcf/y;

    return-object p0
.end method

.method public static h(Lye/m0;)Ldf/i;
    .locals 3

    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object v0

    invoke-virtual {v0}, Lcf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey"

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

    invoke-static {v0, v1}, Lcf/w;->c0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/w;

    move-result-object v0

    invoke-virtual {v0}, Lcf/w;->b0()I

    move-result v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    sget-object v0, Lef/n;->i:Lye/h;

    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object p0

    invoke-virtual {p0}, Lcf/h0;->e0()Lcf/p0;

    move-result-object p0

    invoke-virtual {v0, p0}, Lye/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldf/i$a;

    invoke-static {p0}, Ldf/i;->b(Ldf/i$a;)Ldf/i;

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

.method public static i(Lye/l0;Lre/d0;)Ldf/j;
    .locals 4

    invoke-virtual {p0}, Lye/l0;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    invoke-virtual {p0}, Lye/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lcf/x;->g0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/x;

    move-result-object v0

    invoke-virtual {v0}, Lcf/x;->e0()I

    move-result v1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "Only version 0 keys are accepted"

    if-nez v1, :cond_1

    :try_start_1
    invoke-virtual {v0}, Lcf/x;->d0()Lcf/y;

    move-result-object v1

    invoke-virtual {v1}, Lcf/y;->d0()I

    move-result v3

    if-nez v3, :cond_0

    sget-object v2, Lef/n;->i:Lye/h;

    invoke-virtual {p0}, Lye/l0;->e()Lcf/p0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lye/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldf/i$a;

    invoke-virtual {v1}, Lcf/y;->c0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->v()[B

    move-result-object v1

    invoke-static {v1}, Lgf/a;->a([B)Lgf/a;

    move-result-object v1

    invoke-virtual {p0}, Lye/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-static {v2, v1, p0}, Ldf/o;->c(Ldf/i$a;Lgf/a;Ljava/lang/Integer;)Ldf/o;

    move-result-object p0

    invoke-virtual {v0}, Lcf/x;->c0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->v()[B

    move-result-object v0

    invoke-static {p1}, Lre/d0;->b(Lre/d0;)Lre/d0;

    move-result-object p1

    invoke-static {v0, p1}, Lgf/c;->a([BLre/d0;)Lgf/c;

    move-result-object p1

    invoke-static {p0, p1}, Ldf/j;->d(Ldf/o;Lgf/c;)Ldf/j;

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

    invoke-virtual {p0}, Lye/l0;->f()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static j(Lye/l0;Lre/d0;)Ldf/o;
    .locals 2

    invoke-virtual {p0}, Lye/l0;->f()Ljava/lang/String;

    move-result-object p1

    const-string v0, "type.googleapis.com/google.crypto.tink.Ed25519PublicKey"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lye/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lcf/y;->f0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/y;

    move-result-object p1

    invoke-virtual {p1}, Lcf/y;->d0()I

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lef/n;->i:Lye/h;

    invoke-virtual {p0}, Lye/l0;->e()Lcf/p0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lye/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldf/i$a;

    invoke-virtual {p1}, Lcf/y;->c0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->v()[B

    move-result-object p1

    invoke-static {p1}, Lgf/a;->a([B)Lgf/a;

    move-result-object p1

    invoke-virtual {p0}, Lye/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-static {v0, p1, p0}, Ldf/o;->c(Ldf/i$a;Lgf/a;Ljava/lang/Integer;)Ldf/o;

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

    invoke-virtual {p0}, Lye/l0;->f()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static k()V
    .locals 1

    invoke-static {}, Lye/d0;->c()Lye/d0;

    move-result-object v0

    invoke-static {v0}, Lef/n;->l(Lye/d0;)V

    return-void
.end method

.method public static l(Lye/d0;)V
    .locals 1

    sget-object v0, Lef/n;->c:Lye/g0;

    invoke-virtual {p0, v0}, Lye/d0;->m(Lye/g0;)V

    sget-object v0, Lef/n;->d:Lye/f0;

    invoke-virtual {p0, v0}, Lye/d0;->l(Lye/f0;)V

    sget-object v0, Lef/n;->e:Lye/n;

    invoke-virtual {p0, v0}, Lye/d0;->k(Lye/n;)V

    sget-object v0, Lef/n;->f:Lye/m;

    invoke-virtual {p0, v0}, Lye/d0;->j(Lye/m;)V

    sget-object v0, Lef/n;->g:Lye/n;

    invoke-virtual {p0, v0}, Lye/d0;->k(Lye/n;)V

    sget-object v0, Lef/n;->h:Lye/m;

    invoke-virtual {p0, v0}, Lye/d0;->j(Lye/m;)V

    return-void
.end method

.method public static m(Ldf/i;)Lye/m0;
    .locals 2

    invoke-static {}, Lcf/h0;->h0()Lcf/h0$b;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey"

    invoke-virtual {v0, v1}, Lcf/h0$b;->F(Ljava/lang/String;)Lcf/h0$b;

    move-result-object v0

    invoke-static {}, Lcf/w;->a0()Lcf/w;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/h0$b;->G(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/h0$b;

    move-result-object v0

    sget-object v1, Lef/n;->i:Lye/h;

    invoke-virtual {p0}, Ldf/i;->c()Ldf/i$a;

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

.method public static n(Ldf/j;Lre/d0;)Lye/l0;
    .locals 3

    invoke-static {}, Lcf/x;->f0()Lcf/x$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/j;->g()Ldf/o;

    move-result-object v1

    invoke-static {v1}, Lef/n;->g(Ldf/o;)Lcf/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/x$b;->F(Lcf/y;)Lcf/x$b;

    move-result-object v0

    invoke-virtual {p0}, Ldf/j;->f()Lgf/c;

    move-result-object v1

    invoke-static {p1}, Lre/d0;->b(Lre/d0;)Lre/d0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lgf/c;->d(Lre/d0;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcf/x$b;->D(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/x$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lcf/x;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Lcf/f0$c;->d:Lcf/f0$c;

    sget-object v1, Lef/n;->i:Lye/h;

    invoke-virtual {p0}, Ldf/j;->e()Ldf/i;

    move-result-object v2

    invoke-virtual {v2}, Ldf/i;->c()Ldf/i$a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lye/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lcf/p0;

    invoke-virtual {p0}, Ldf/b1;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey"

    invoke-static {v2, p1, v0, v1, p0}, Lye/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Lcf/f0$c;Lcf/p0;Ljava/lang/Integer;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static o(Ldf/o;Lre/d0;)Lye/l0;
    .locals 3

    invoke-static {p0}, Lef/n;->g(Ldf/o;)Lcf/y;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Lcf/f0$c;->e:Lcf/f0$c;

    sget-object v1, Lef/n;->i:Lye/h;

    invoke-virtual {p0}, Ldf/o;->e()Ldf/i;

    move-result-object v2

    invoke-virtual {v2}, Ldf/i;->c()Ldf/i$a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lye/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lcf/p0;

    invoke-virtual {p0}, Ldf/o;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.Ed25519PublicKey"

    invoke-static {v2, p1, v0, v1, p0}, Lye/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Lcf/f0$c;Lcf/p0;Ljava/lang/Integer;)Lye/l0;

    move-result-object p0

    return-object p0
.end method
