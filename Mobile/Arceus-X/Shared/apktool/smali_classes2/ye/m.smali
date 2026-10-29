.class public final Lye/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lef/a;

.field public static final b:Lwe/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h<",
            "Laf/p0;",
            "Lxe/o$d;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lwe/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h<",
            "Laf/b0;",
            "Lxe/o$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lwe/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/g0<",
            "Lxe/o;",
            "Lwe/m0;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lwe/f0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/f0<",
            "Lwe/m0;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lwe/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/n<",
            "Lxe/i;",
            "Lwe/l0;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Lwe/m;
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

    const-string v0, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-static {v0}, Lwe/s0;->h(Ljava/lang/String;)Lef/a;

    move-result-object v0

    sput-object v0, Lye/m;->a:Lef/a;

    invoke-static {}, Lwe/h;->a()Lwe/h$b;

    move-result-object v1

    sget-object v2, Laf/p0;->e:Laf/p0;

    sget-object v3, Lxe/o$d;->e:Lxe/o$d;

    invoke-virtual {v1, v2, v3}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v1

    sget-object v2, Laf/p0;->c:Laf/p0;

    sget-object v3, Lxe/o$d;->b:Lxe/o$d;

    invoke-virtual {v1, v2, v3}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v1

    sget-object v2, Laf/p0;->d:Laf/p0;

    sget-object v3, Lxe/o$d;->d:Lxe/o$d;

    invoke-virtual {v1, v2, v3}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v1

    sget-object v2, Laf/p0;->f:Laf/p0;

    sget-object v3, Lxe/o$d;->c:Lxe/o$d;

    invoke-virtual {v1, v2, v3}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v1

    invoke-virtual {v1}, Lwe/h$b;->b()Lwe/h;

    move-result-object v1

    sput-object v1, Lye/m;->b:Lwe/h;

    invoke-static {}, Lwe/h;->a()Lwe/h$b;

    move-result-object v1

    sget-object v2, Laf/b0;->c:Laf/b0;

    sget-object v3, Lxe/o$c;->b:Lxe/o$c;

    invoke-virtual {v1, v2, v3}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v1

    sget-object v2, Laf/b0;->g:Laf/b0;

    sget-object v3, Lxe/o$c;->c:Lxe/o$c;

    invoke-virtual {v1, v2, v3}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v1

    sget-object v2, Laf/b0;->e:Laf/b0;

    sget-object v3, Lxe/o$c;->d:Lxe/o$c;

    invoke-virtual {v1, v2, v3}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v1

    sget-object v2, Laf/b0;->d:Laf/b0;

    sget-object v3, Lxe/o$c;->e:Lxe/o$c;

    invoke-virtual {v1, v2, v3}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v1

    sget-object v2, Laf/b0;->f:Laf/b0;

    sget-object v3, Lxe/o$c;->f:Lxe/o$c;

    invoke-virtual {v1, v2, v3}, Lwe/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lwe/h$b;

    move-result-object v1

    invoke-virtual {v1}, Lwe/h$b;->b()Lwe/h;

    move-result-object v1

    sput-object v1, Lye/m;->c:Lwe/h;

    new-instance v1, Lye/i;

    invoke-direct {v1}, Lye/i;-><init>()V

    const-class v2, Lxe/o;

    const-class v3, Lwe/m0;

    invoke-static {v1, v2, v3}, Lwe/g0;->a(Lwe/g0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/g0;

    move-result-object v1

    sput-object v1, Lye/m;->d:Lwe/g0;

    new-instance v1, Lye/j;

    invoke-direct {v1}, Lye/j;-><init>()V

    invoke-static {v1, v0, v3}, Lwe/f0;->a(Lwe/f0$b;Lef/a;Ljava/lang/Class;)Lwe/f0;

    move-result-object v1

    sput-object v1, Lye/m;->e:Lwe/f0;

    new-instance v1, Lye/k;

    invoke-direct {v1}, Lye/k;-><init>()V

    const-class v2, Lxe/i;

    const-class v3, Lwe/l0;

    invoke-static {v1, v2, v3}, Lwe/n;->a(Lwe/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/n;

    move-result-object v1

    sput-object v1, Lye/m;->f:Lwe/n;

    new-instance v1, Lye/l;

    invoke-direct {v1}, Lye/l;-><init>()V

    invoke-static {v1, v0, v3}, Lwe/m;->a(Lwe/m$b;Lef/a;Ljava/lang/Class;)Lwe/m;

    move-result-object v0

    sput-object v0, Lye/m;->g:Lwe/m;

    return-void
.end method

.method public static synthetic a(Lxe/o;)Lwe/m0;
    .locals 0

    invoke-static {p0}, Lye/m;->k(Lxe/o;)Lwe/m0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lwe/m0;)Lxe/o;
    .locals 0

    invoke-static {p0}, Lye/m;->g(Lwe/m0;)Lxe/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lwe/l0;Lpe/d0;)Lxe/i;
    .locals 0

    invoke-static {p0, p1}, Lye/m;->f(Lwe/l0;Lpe/d0;)Lxe/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lxe/i;Lpe/d0;)Lwe/l0;
    .locals 0

    invoke-static {p0, p1}, Lye/m;->j(Lxe/i;Lpe/d0;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lxe/o;)Laf/e0;
    .locals 2

    invoke-static {}, Laf/e0;->f0()Laf/e0$b;

    move-result-object v0

    invoke-virtual {p0}, Lxe/o;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Laf/e0$b;->D(I)Laf/e0$b;

    move-result-object v0

    sget-object v1, Lye/m;->c:Lwe/h;

    invoke-virtual {p0}, Lxe/o;->d()Lxe/o$c;

    move-result-object p0

    invoke-virtual {v1, p0}, Lwe/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Laf/b0;

    invoke-virtual {v0, p0}, Laf/e0$b;->C(Laf/b0;)Laf/e0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Laf/e0;

    return-object p0
.end method

.method public static f(Lwe/l0;Lpe/d0;)Lxe/i;
    .locals 4

    invoke-virtual {p0}, Lwe/l0;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lwe/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Laf/c0;->h0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/c0;

    move-result-object v0

    invoke-virtual {v0}, Laf/c0;->f0()I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lxe/o;->b()Lxe/o$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/c0;->d0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Lxe/o$b;->c(I)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/c0;->e0()Laf/e0;

    move-result-object v2

    invoke-virtual {v2}, Laf/e0;->e0()I

    move-result v2

    invoke-virtual {v1, v2}, Lxe/o$b;->d(I)Lxe/o$b;

    move-result-object v1

    sget-object v2, Lye/m;->c:Lwe/h;

    invoke-virtual {v0}, Laf/c0;->e0()Laf/e0;

    move-result-object v3

    invoke-virtual {v3}, Laf/e0;->d0()Laf/b0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lwe/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxe/o$c;

    invoke-virtual {v1, v2}, Lxe/o$b;->b(Lxe/o$c;)Lxe/o$b;

    move-result-object v1

    sget-object v2, Lye/m;->b:Lwe/h;

    invoke-virtual {p0}, Lwe/l0;->e()Laf/p0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lwe/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxe/o$d;

    invoke-virtual {v1, v2}, Lxe/o$b;->e(Lxe/o$d;)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v1}, Lxe/o$b;->a()Lxe/o;

    move-result-object v1

    invoke-static {}, Lxe/i;->b()Lxe/i$b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lxe/i$b;->e(Lxe/o;)Lxe/i$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/c0;->d0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->x()[B

    move-result-object v0

    invoke-static {p1}, Lpe/d0;->b(Lpe/d0;)Lpe/d0;

    move-result-object p1

    invoke-static {v0, p1}, Lef/c;->a([BLpe/d0;)Lef/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Lxe/i$b;->d(Lef/c;)Lxe/i$b;

    move-result-object p1

    invoke-virtual {p0}, Lwe/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0}, Lxe/i$b;->c(Ljava/lang/Integer;)Lxe/i$b;

    move-result-object p0

    invoke-virtual {p0}, Lxe/i$b;->a()Lxe/i;

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

    const-string p1, "Parsing HmacKey failed"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Wrong type URL in call to HmacProtoSerialization.parseKey"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static g(Lwe/m0;)Lxe/o;
    .locals 3

    invoke-virtual {p0}, Lwe/m0;->d()Laf/h0;

    move-result-object v0

    invoke-virtual {v0}, Laf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.HmacKey"

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

    invoke-static {v0, v1}, Laf/d0;->h0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Laf/d0;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Laf/d0;->f0()I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lxe/o;->b()Lxe/o$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/d0;->d0()I

    move-result v2

    invoke-virtual {v1, v2}, Lxe/o$b;->c(I)Lxe/o$b;

    move-result-object v1

    invoke-virtual {v0}, Laf/d0;->e0()Laf/e0;

    move-result-object v2

    invoke-virtual {v2}, Laf/e0;->e0()I

    move-result v2

    invoke-virtual {v1, v2}, Lxe/o$b;->d(I)Lxe/o$b;

    move-result-object v1

    sget-object v2, Lye/m;->c:Lwe/h;

    invoke-virtual {v0}, Laf/d0;->e0()Laf/e0;

    move-result-object v0

    invoke-virtual {v0}, Laf/e0;->d0()Laf/b0;

    move-result-object v0

    invoke-virtual {v2, v0}, Lwe/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxe/o$c;

    invoke-virtual {v1, v0}, Lxe/o$b;->b(Lxe/o$c;)Lxe/o$b;

    move-result-object v0

    sget-object v1, Lye/m;->b:Lwe/h;

    invoke-virtual {p0}, Lwe/m0;->d()Laf/h0;

    move-result-object p0

    invoke-virtual {p0}, Laf/h0;->e0()Laf/p0;

    move-result-object p0

    invoke-virtual {v1, p0}, Lwe/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lxe/o$d;

    invoke-virtual {v0, p0}, Lxe/o$b;->e(Lxe/o$d;)Lxe/o$b;

    move-result-object p0

    invoke-virtual {p0}, Lxe/o$b;->a()Lxe/o;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Parsing HmacParameters failed: unknown Version "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Laf/d0;->f0()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing HmacParameters failed: "

    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Wrong type URL in call to HmacProtoSerialization.parseParameters: "

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

    invoke-static {v0}, Lye/m;->i(Lwe/d0;)V

    return-void
.end method

.method public static i(Lwe/d0;)V
    .locals 1

    sget-object v0, Lye/m;->d:Lwe/g0;

    invoke-virtual {p0, v0}, Lwe/d0;->m(Lwe/g0;)V

    sget-object v0, Lye/m;->e:Lwe/f0;

    invoke-virtual {p0, v0}, Lwe/d0;->l(Lwe/f0;)V

    sget-object v0, Lye/m;->f:Lwe/n;

    invoke-virtual {p0, v0}, Lwe/d0;->k(Lwe/n;)V

    sget-object v0, Lye/m;->g:Lwe/m;

    invoke-virtual {p0, v0}, Lwe/d0;->j(Lwe/m;)V

    return-void
.end method

.method public static j(Lxe/i;Lpe/d0;)Lwe/l0;
    .locals 3

    invoke-static {}, Laf/c0;->g0()Laf/c0$b;

    move-result-object v0

    invoke-virtual {p0}, Lxe/i;->e()Lxe/o;

    move-result-object v1

    invoke-static {v1}, Lye/m;->e(Lxe/o;)Laf/e0;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/c0$b;->D(Laf/e0;)Laf/c0$b;

    move-result-object v0

    invoke-virtual {p0}, Lxe/i;->c()Lef/c;

    move-result-object v1

    invoke-static {p1}, Lpe/d0;->b(Lpe/d0;)Lpe/d0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lef/c;->d(Lpe/d0;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Laf/c0$b;->C(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/c0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Laf/c0;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Laf/f0$c;->c:Laf/f0$c;

    sget-object v1, Lye/m;->b:Lwe/h;

    invoke-virtual {p0}, Lxe/i;->e()Lxe/o;

    move-result-object v2

    invoke-virtual {v2}, Lxe/o;->g()Lxe/o$d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lwe/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Laf/p0;

    invoke-virtual {p0}, Lxe/i;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-static {v2, p1, v0, v1, p0}, Lwe/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Laf/f0$c;Laf/p0;Ljava/lang/Integer;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method

.method public static k(Lxe/o;)Lwe/m0;
    .locals 3

    invoke-static {}, Laf/h0;->h0()Laf/h0$b;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-virtual {v0, v1}, Laf/h0$b;->D(Ljava/lang/String;)Laf/h0$b;

    move-result-object v0

    invoke-static {}, Laf/d0;->g0()Laf/d0$b;

    move-result-object v1

    invoke-static {p0}, Lye/m;->e(Lxe/o;)Laf/e0;

    move-result-object v2

    invoke-virtual {v1, v2}, Laf/d0$b;->D(Laf/e0;)Laf/d0$b;

    move-result-object v1

    invoke-virtual {p0}, Lxe/o;->e()I

    move-result v2

    invoke-virtual {v1, v2}, Laf/d0$b;->C(I)Laf/d0$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v1

    check-cast v1, Laf/d0;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/h0$b;->E(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/h0$b;

    move-result-object v0

    sget-object v1, Lye/m;->b:Lwe/h;

    invoke-virtual {p0}, Lxe/o;->g()Lxe/o$d;

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
