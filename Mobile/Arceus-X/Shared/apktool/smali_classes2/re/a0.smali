.class public final Lre/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lef/a;

.field public static final b:Lwe/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/g0<",
            "Lqe/e0;",
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
            "Lqe/a0;",
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

    const-string v0, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    invoke-static {v0}, Lwe/s0;->h(Ljava/lang/String;)Lef/a;

    move-result-object v0

    sput-object v0, Lre/a0;->a:Lef/a;

    new-instance v1, Lre/w;

    invoke-direct {v1}, Lre/w;-><init>()V

    const-class v2, Lqe/e0;

    const-class v3, Lwe/m0;

    invoke-static {v1, v2, v3}, Lwe/g0;->a(Lwe/g0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/g0;

    move-result-object v1

    sput-object v1, Lre/a0;->b:Lwe/g0;

    new-instance v1, Lre/x;

    invoke-direct {v1}, Lre/x;-><init>()V

    invoke-static {v1, v0, v3}, Lwe/f0;->a(Lwe/f0$b;Lef/a;Ljava/lang/Class;)Lwe/f0;

    move-result-object v1

    sput-object v1, Lre/a0;->c:Lwe/f0;

    new-instance v1, Lre/y;

    invoke-direct {v1}, Lre/y;-><init>()V

    const-class v2, Lqe/a0;

    const-class v3, Lwe/l0;

    invoke-static {v1, v2, v3}, Lwe/n;->a(Lwe/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/n;

    move-result-object v1

    sput-object v1, Lre/a0;->d:Lwe/n;

    new-instance v1, Lre/z;

    invoke-direct {v1}, Lre/z;-><init>()V

    invoke-static {v1, v0, v3}, Lwe/m;->a(Lwe/m$b;Lef/a;Ljava/lang/Class;)Lwe/m;

    move-result-object v0

    sput-object v0, Lre/a0;->e:Lwe/m;

    return-void
.end method

.method public static synthetic a(Lqe/a0;Lpe/d0;)Lwe/l0;
    .locals 0

    invoke-static {p0, p1}, Lre/a0;->i(Lqe/a0;Lpe/d0;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lwe/l0;Lpe/d0;)Lqe/a0;
    .locals 0

    invoke-static {p0, p1}, Lre/a0;->e(Lwe/l0;Lpe/d0;)Lqe/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lqe/e0;)Lwe/m0;
    .locals 0

    invoke-static {p0}, Lre/a0;->j(Lqe/e0;)Lwe/m0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lwe/m0;)Lqe/e0;
    .locals 0

    invoke-static {p0}, Lre/a0;->f(Lwe/m0;)Lqe/e0;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lwe/l0;Lpe/d0;)Lqe/a0;
    .locals 2

    invoke-virtual {p0}, Lwe/l0;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lwe/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Laf/p;->e0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/p;

    move-result-object v0

    invoke-virtual {v0}, Laf/p;->c0()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lwe/l0;->e()Laf/p0;

    move-result-object v1

    invoke-static {v1}, Lre/a0;->l(Laf/p0;)Lqe/e0$a;

    move-result-object v1

    invoke-virtual {v0}, Laf/p;->b0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->x()[B

    move-result-object v0

    invoke-static {p1}, Lpe/d0;->b(Lpe/d0;)Lpe/d0;

    move-result-object p1

    invoke-static {v0, p1}, Lef/c;->a([BLpe/d0;)Lef/c;

    move-result-object p1

    invoke-virtual {p0}, Lwe/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-static {v1, p1, p0}, Lqe/a0;->b(Lqe/e0$a;Lef/c;Ljava/lang/Integer;)Lqe/a0;

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

    const-string p1, "Parsing ChaCha20Poly1305Key failed"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static f(Lwe/m0;)Lqe/e0;
    .locals 3

    invoke-virtual {p0}, Lwe/m0;->d()Laf/h0;

    move-result-object v0

    invoke-virtual {v0}, Laf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

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

    invoke-static {v0, v1}, Laf/q;->b0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/q;
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0}, Lwe/m0;->d()Laf/h0;

    move-result-object p0

    invoke-virtual {p0}, Laf/h0;->e0()Laf/p0;

    move-result-object p0

    invoke-static {p0}, Lre/a0;->l(Laf/p0;)Lqe/e0$a;

    move-result-object p0

    invoke-static {p0}, Lqe/e0;->b(Lqe/e0$a;)Lqe/e0;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing ChaCha20Poly1305Parameters failed: "

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: "

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

.method public static g()V
    .locals 1

    invoke-static {}, Lwe/d0;->c()Lwe/d0;

    move-result-object v0

    invoke-static {v0}, Lre/a0;->h(Lwe/d0;)V

    return-void
.end method

.method public static h(Lwe/d0;)V
    .locals 1

    sget-object v0, Lre/a0;->b:Lwe/g0;

    invoke-virtual {p0, v0}, Lwe/d0;->m(Lwe/g0;)V

    sget-object v0, Lre/a0;->c:Lwe/f0;

    invoke-virtual {p0, v0}, Lwe/d0;->l(Lwe/f0;)V

    sget-object v0, Lre/a0;->d:Lwe/n;

    invoke-virtual {p0, v0}, Lwe/d0;->k(Lwe/n;)V

    sget-object v0, Lre/a0;->e:Lwe/m;

    invoke-virtual {p0, v0}, Lwe/d0;->j(Lwe/m;)V

    return-void
.end method

.method public static i(Lqe/a0;Lpe/d0;)Lwe/l0;
    .locals 3

    invoke-static {}, Laf/p;->d0()Laf/p$b;

    move-result-object v0

    invoke-virtual {p0}, Lqe/a0;->c()Lef/c;

    move-result-object v1

    invoke-static {p1}, Lpe/d0;->b(Lpe/d0;)Lpe/d0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lef/c;->d(Lpe/d0;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Laf/p$b;->C(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/p$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Laf/p;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Laf/f0$c;->c:Laf/f0$c;

    invoke-virtual {p0}, Lqe/a0;->f()Lqe/e0;

    move-result-object v1

    invoke-virtual {v1}, Lqe/e0;->c()Lqe/e0$a;

    move-result-object v1

    invoke-static {v1}, Lre/a0;->k(Lqe/e0$a;)Laf/p0;

    move-result-object v1

    invoke-virtual {p0}, Lqe/a0;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    invoke-static {v2, p1, v0, v1, p0}, Lwe/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Laf/f0$c;Laf/p0;Ljava/lang/Integer;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method

.method public static j(Lqe/e0;)Lwe/m0;
    .locals 2

    invoke-static {}, Laf/h0;->h0()Laf/h0$b;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    invoke-virtual {v0, v1}, Laf/h0$b;->D(Ljava/lang/String;)Laf/h0$b;

    move-result-object v0

    invoke-static {}, Laf/q;->a0()Laf/q;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/h0$b;->E(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/h0$b;

    move-result-object v0

    invoke-virtual {p0}, Lqe/e0;->c()Lqe/e0$a;

    move-result-object p0

    invoke-static {p0}, Lre/a0;->k(Lqe/e0$a;)Laf/p0;

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

.method public static k(Lqe/e0$a;)Laf/p0;
    .locals 3

    sget-object v0, Lqe/e0$a;->b:Lqe/e0$a;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Laf/p0;->c:Laf/p0;

    return-object p0

    :cond_0
    sget-object v0, Lqe/e0$a;->c:Lqe/e0$a;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Laf/p0;->f:Laf/p0;

    return-object p0

    :cond_1
    sget-object v0, Lqe/e0$a;->d:Lqe/e0$a;

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

.method public static l(Laf/p0;)Lqe/e0$a;
    .locals 3

    sget-object v0, Lre/a0$a;->a:[I

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

    sget-object p0, Lqe/e0$a;->d:Lqe/e0$a;

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
    sget-object p0, Lqe/e0$a;->c:Lqe/e0$a;

    return-object p0

    :cond_2
    sget-object p0, Lqe/e0$a;->b:Lqe/e0$a;

    return-object p0
.end method
