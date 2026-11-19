.class public final Laf/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgf/a;

.field public static final b:Lye/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h<",
            "Lcf/p0;",
            "Lze/o$d;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lye/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/h<",
            "Lcf/b0;",
            "Lze/o$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lye/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/g0<",
            "Lze/o;",
            "Lye/m0;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lye/f0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/f0<",
            "Lye/m0;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lye/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/n<",
            "Lze/i;",
            "Lye/l0;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Lye/m;
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

    const-string v0, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-static {v0}, Lye/s0;->h(Ljava/lang/String;)Lgf/a;

    move-result-object v0

    sput-object v0, Laf/m;->a:Lgf/a;

    invoke-static {}, Lye/h;->a()Lye/h$b;

    move-result-object v1

    sget-object v2, Lcf/p0;->e:Lcf/p0;

    sget-object v3, Lze/o$d;->e:Lze/o$d;

    invoke-virtual {v1, v2, v3}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v1

    sget-object v2, Lcf/p0;->c:Lcf/p0;

    sget-object v3, Lze/o$d;->b:Lze/o$d;

    invoke-virtual {v1, v2, v3}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v1

    sget-object v2, Lcf/p0;->d:Lcf/p0;

    sget-object v3, Lze/o$d;->d:Lze/o$d;

    invoke-virtual {v1, v2, v3}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v1

    sget-object v2, Lcf/p0;->f:Lcf/p0;

    sget-object v3, Lze/o$d;->c:Lze/o$d;

    invoke-virtual {v1, v2, v3}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v1

    invoke-virtual {v1}, Lye/h$b;->b()Lye/h;

    move-result-object v1

    sput-object v1, Laf/m;->b:Lye/h;

    invoke-static {}, Lye/h;->a()Lye/h$b;

    move-result-object v1

    sget-object v2, Lcf/b0;->c:Lcf/b0;

    sget-object v3, Lze/o$c;->b:Lze/o$c;

    invoke-virtual {v1, v2, v3}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v1

    sget-object v2, Lcf/b0;->g:Lcf/b0;

    sget-object v3, Lze/o$c;->c:Lze/o$c;

    invoke-virtual {v1, v2, v3}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v1

    sget-object v2, Lcf/b0;->e:Lcf/b0;

    sget-object v3, Lze/o$c;->d:Lze/o$c;

    invoke-virtual {v1, v2, v3}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v1

    sget-object v2, Lcf/b0;->d:Lcf/b0;

    sget-object v3, Lze/o$c;->e:Lze/o$c;

    invoke-virtual {v1, v2, v3}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v1

    sget-object v2, Lcf/b0;->f:Lcf/b0;

    sget-object v3, Lze/o$c;->f:Lze/o$c;

    invoke-virtual {v1, v2, v3}, Lye/h$b;->a(Ljava/lang/Enum;Ljava/lang/Object;)Lye/h$b;

    move-result-object v1

    invoke-virtual {v1}, Lye/h$b;->b()Lye/h;

    move-result-object v1

    sput-object v1, Laf/m;->c:Lye/h;

    new-instance v1, Laf/i;

    invoke-direct {v1}, Laf/i;-><init>()V

    const-class v2, Lze/o;

    const-class v3, Lye/m0;

    invoke-static {v1, v2, v3}, Lye/g0;->a(Lye/g0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/g0;

    move-result-object v1

    sput-object v1, Laf/m;->d:Lye/g0;

    new-instance v1, Laf/j;

    invoke-direct {v1}, Laf/j;-><init>()V

    invoke-static {v1, v0, v3}, Lye/f0;->a(Lye/f0$b;Lgf/a;Ljava/lang/Class;)Lye/f0;

    move-result-object v1

    sput-object v1, Laf/m;->e:Lye/f0;

    new-instance v1, Laf/k;

    invoke-direct {v1}, Laf/k;-><init>()V

    const-class v2, Lze/i;

    const-class v3, Lye/l0;

    invoke-static {v1, v2, v3}, Lye/n;->a(Lye/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/n;

    move-result-object v1

    sput-object v1, Laf/m;->f:Lye/n;

    new-instance v1, Laf/l;

    invoke-direct {v1}, Laf/l;-><init>()V

    invoke-static {v1, v0, v3}, Lye/m;->a(Lye/m$b;Lgf/a;Ljava/lang/Class;)Lye/m;

    move-result-object v0

    sput-object v0, Laf/m;->g:Lye/m;

    return-void
.end method

.method public static synthetic a(Lze/o;)Lye/m0;
    .locals 0

    invoke-static {p0}, Laf/m;->k(Lze/o;)Lye/m0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lye/m0;)Lze/o;
    .locals 0

    invoke-static {p0}, Laf/m;->g(Lye/m0;)Lze/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lye/l0;Lre/d0;)Lze/i;
    .locals 0

    invoke-static {p0, p1}, Laf/m;->f(Lye/l0;Lre/d0;)Lze/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lze/i;Lre/d0;)Lye/l0;
    .locals 0

    invoke-static {p0, p1}, Laf/m;->j(Lze/i;Lre/d0;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lze/o;)Lcf/e0;
    .locals 2

    invoke-static {}, Lcf/e0;->f0()Lcf/e0$b;

    move-result-object v0

    invoke-virtual {p0}, Lze/o;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lcf/e0$b;->F(I)Lcf/e0$b;

    move-result-object v0

    sget-object v1, Laf/m;->c:Lye/h;

    invoke-virtual {p0}, Lze/o;->d()Lze/o$c;

    move-result-object p0

    invoke-virtual {v1, p0}, Lye/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcf/b0;

    invoke-virtual {v0, p0}, Lcf/e0$b;->D(Lcf/b0;)Lcf/e0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lcf/e0;

    return-object p0
.end method

.method public static f(Lye/l0;Lre/d0;)Lze/i;
    .locals 4

    invoke-virtual {p0}, Lye/l0;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lye/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lcf/c0;->h0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/c0;

    move-result-object v0

    invoke-virtual {v0}, Lcf/c0;->f0()I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lze/o;->b()Lze/o$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/c0;->d0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Lze/o$b;->c(I)Lze/o$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/c0;->e0()Lcf/e0;

    move-result-object v2

    invoke-virtual {v2}, Lcf/e0;->e0()I

    move-result v2

    invoke-virtual {v1, v2}, Lze/o$b;->d(I)Lze/o$b;

    move-result-object v1

    sget-object v2, Laf/m;->c:Lye/h;

    invoke-virtual {v0}, Lcf/c0;->e0()Lcf/e0;

    move-result-object v3

    invoke-virtual {v3}, Lcf/e0;->d0()Lcf/b0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lye/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lze/o$c;

    invoke-virtual {v1, v2}, Lze/o$b;->b(Lze/o$c;)Lze/o$b;

    move-result-object v1

    sget-object v2, Laf/m;->b:Lye/h;

    invoke-virtual {p0}, Lye/l0;->e()Lcf/p0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lye/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lze/o$d;

    invoke-virtual {v1, v2}, Lze/o$b;->e(Lze/o$d;)Lze/o$b;

    move-result-object v1

    invoke-virtual {v1}, Lze/o$b;->a()Lze/o;

    move-result-object v1

    invoke-static {}, Lze/i;->b()Lze/i$b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lze/i$b;->e(Lze/o;)Lze/i$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/c0;->d0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->v()[B

    move-result-object v0

    invoke-static {p1}, Lre/d0;->b(Lre/d0;)Lre/d0;

    move-result-object p1

    invoke-static {v0, p1}, Lgf/c;->a([BLre/d0;)Lgf/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Lze/i$b;->d(Lgf/c;)Lze/i$b;

    move-result-object p1

    invoke-virtual {p0}, Lye/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0}, Lze/i$b;->c(Ljava/lang/Integer;)Lze/i$b;

    move-result-object p0

    invoke-virtual {p0}, Lze/i$b;->a()Lze/i;

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

.method public static g(Lye/m0;)Lze/o;
    .locals 3

    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object v0

    invoke-virtual {v0}, Lcf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.HmacKey"

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

    invoke-static {v0, v1}, Lcf/d0;->h0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/d0;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Lcf/d0;->f0()I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lze/o;->b()Lze/o$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/d0;->d0()I

    move-result v2

    invoke-virtual {v1, v2}, Lze/o$b;->c(I)Lze/o$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/d0;->e0()Lcf/e0;

    move-result-object v2

    invoke-virtual {v2}, Lcf/e0;->e0()I

    move-result v2

    invoke-virtual {v1, v2}, Lze/o$b;->d(I)Lze/o$b;

    move-result-object v1

    sget-object v2, Laf/m;->c:Lye/h;

    invoke-virtual {v0}, Lcf/d0;->e0()Lcf/e0;

    move-result-object v0

    invoke-virtual {v0}, Lcf/e0;->d0()Lcf/b0;

    move-result-object v0

    invoke-virtual {v2, v0}, Lye/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lze/o$c;

    invoke-virtual {v1, v0}, Lze/o$b;->b(Lze/o$c;)Lze/o$b;

    move-result-object v0

    sget-object v1, Laf/m;->b:Lye/h;

    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object p0

    invoke-virtual {p0}, Lcf/h0;->e0()Lcf/p0;

    move-result-object p0

    invoke-virtual {v1, p0}, Lye/h;->b(Ljava/lang/Enum;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lze/o$d;

    invoke-virtual {v0, p0}, Lze/o$b;->e(Lze/o$d;)Lze/o$b;

    move-result-object p0

    invoke-virtual {p0}, Lze/o$b;->a()Lze/o;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Parsing HmacParameters failed: unknown Version "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcf/d0;->f0()I

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

    invoke-static {v0}, Laf/m;->i(Lye/d0;)V

    return-void
.end method

.method public static i(Lye/d0;)V
    .locals 1

    sget-object v0, Laf/m;->d:Lye/g0;

    invoke-virtual {p0, v0}, Lye/d0;->m(Lye/g0;)V

    sget-object v0, Laf/m;->e:Lye/f0;

    invoke-virtual {p0, v0}, Lye/d0;->l(Lye/f0;)V

    sget-object v0, Laf/m;->f:Lye/n;

    invoke-virtual {p0, v0}, Lye/d0;->k(Lye/n;)V

    sget-object v0, Laf/m;->g:Lye/m;

    invoke-virtual {p0, v0}, Lye/d0;->j(Lye/m;)V

    return-void
.end method

.method public static j(Lze/i;Lre/d0;)Lye/l0;
    .locals 3

    invoke-static {}, Lcf/c0;->g0()Lcf/c0$b;

    move-result-object v0

    invoke-virtual {p0}, Lze/i;->e()Lze/o;

    move-result-object v1

    invoke-static {v1}, Laf/m;->e(Lze/o;)Lcf/e0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/c0$b;->F(Lcf/e0;)Lcf/c0$b;

    move-result-object v0

    invoke-virtual {p0}, Lze/i;->c()Lgf/c;

    move-result-object v1

    invoke-static {p1}, Lre/d0;->b(Lre/d0;)Lre/d0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lgf/c;->d(Lre/d0;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcf/c0$b;->D(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/c0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lcf/c0;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Lcf/f0$c;->c:Lcf/f0$c;

    sget-object v1, Laf/m;->b:Lye/h;

    invoke-virtual {p0}, Lze/i;->e()Lze/o;

    move-result-object v2

    invoke-virtual {v2}, Lze/o;->g()Lze/o$d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lye/h;->c(Ljava/lang/Object;)Ljava/lang/Enum;

    move-result-object v1

    check-cast v1, Lcf/p0;

    invoke-virtual {p0}, Lze/i;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-static {v2, p1, v0, v1, p0}, Lye/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Lcf/f0$c;Lcf/p0;Ljava/lang/Integer;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static k(Lze/o;)Lye/m0;
    .locals 3

    invoke-static {}, Lcf/h0;->h0()Lcf/h0$b;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-virtual {v0, v1}, Lcf/h0$b;->F(Ljava/lang/String;)Lcf/h0$b;

    move-result-object v0

    invoke-static {}, Lcf/d0;->g0()Lcf/d0$b;

    move-result-object v1

    invoke-static {p0}, Laf/m;->e(Lze/o;)Lcf/e0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcf/d0$b;->F(Lcf/e0;)Lcf/d0$b;

    move-result-object v1

    invoke-virtual {p0}, Lze/o;->e()I

    move-result v2

    invoke-virtual {v1, v2}, Lcf/d0$b;->D(I)Lcf/d0$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v1

    check-cast v1, Lcf/d0;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/h0$b;->G(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/h0$b;

    move-result-object v0

    sget-object v1, Laf/m;->b:Lye/h;

    invoke-virtual {p0}, Lze/o;->g()Lze/o$d;

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
