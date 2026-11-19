.class public final Lte/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgf/a;

.field public static final b:Lye/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lye/g0<",
            "Lse/p;",
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
            "Lse/l;",
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

    const-string v0, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-static {v0}, Lye/s0;->h(Ljava/lang/String;)Lgf/a;

    move-result-object v0

    sput-object v0, Lte/j;->a:Lgf/a;

    new-instance v1, Lte/f;

    invoke-direct {v1}, Lte/f;-><init>()V

    const-class v2, Lse/p;

    const-class v3, Lye/m0;

    invoke-static {v1, v2, v3}, Lye/g0;->a(Lye/g0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/g0;

    move-result-object v1

    sput-object v1, Lte/j;->b:Lye/g0;

    new-instance v1, Lte/g;

    invoke-direct {v1}, Lte/g;-><init>()V

    invoke-static {v1, v0, v3}, Lye/f0;->a(Lye/f0$b;Lgf/a;Ljava/lang/Class;)Lye/f0;

    move-result-object v1

    sput-object v1, Lte/j;->c:Lye/f0;

    new-instance v1, Lte/h;

    invoke-direct {v1}, Lte/h;-><init>()V

    const-class v2, Lse/l;

    const-class v3, Lye/l0;

    invoke-static {v1, v2, v3}, Lye/n;->a(Lye/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/n;

    move-result-object v1

    sput-object v1, Lte/j;->d:Lye/n;

    new-instance v1, Lte/i;

    invoke-direct {v1}, Lte/i;-><init>()V

    invoke-static {v1, v0, v3}, Lye/m;->a(Lye/m$b;Lgf/a;Ljava/lang/Class;)Lye/m;

    move-result-object v0

    sput-object v0, Lte/j;->e:Lye/m;

    return-void
.end method

.method public static synthetic a(Lye/m0;)Lse/p;
    .locals 0

    invoke-static {p0}, Lte/j;->g(Lye/m0;)Lse/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lse/l;Lre/d0;)Lye/l0;
    .locals 0

    invoke-static {p0, p1}, Lte/j;->j(Lse/l;Lre/d0;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lye/l0;Lre/d0;)Lse/l;
    .locals 0

    invoke-static {p0, p1}, Lte/j;->f(Lye/l0;Lre/d0;)Lse/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lse/p;)Lye/m0;
    .locals 0

    invoke-static {p0}, Lte/j;->k(Lse/p;)Lye/m0;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lse/p;)Lcf/k;
    .locals 2

    invoke-virtual {p0}, Lse/p;->e()I

    move-result v0

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcf/k;->d0()Lcf/k$b;

    move-result-object v0

    invoke-virtual {p0}, Lse/p;->c()I

    move-result p0

    invoke-virtual {v0, p0}, Lcf/k$b;->D(I)Lcf/k$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lcf/k;

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {p0}, Lse/p;->e()I

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

.method public static f(Lye/l0;Lre/d0;)Lse/l;
    .locals 3

    invoke-virtual {p0}, Lye/l0;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lye/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lcf/i;->g0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/i;

    move-result-object v0

    invoke-virtual {v0}, Lcf/i;->e0()I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lse/p;->b()Lse/p$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/i;->c0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Lse/p$b;->c(I)Lse/p$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/i;->d0()Lcf/k;

    move-result-object v2

    invoke-virtual {v2}, Lcf/k;->c0()I

    move-result v2

    invoke-virtual {v1, v2}, Lse/p$b;->b(I)Lse/p$b;

    move-result-object v1

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, Lse/p$b;->d(I)Lse/p$b;

    move-result-object v1

    invoke-virtual {p0}, Lye/l0;->e()Lcf/p0;

    move-result-object v2

    invoke-static {v2}, Lte/j;->m(Lcf/p0;)Lse/p$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Lse/p$b;->e(Lse/p$c;)Lse/p$b;

    move-result-object v1

    invoke-virtual {v1}, Lse/p$b;->a()Lse/p;

    move-result-object v1

    invoke-static {}, Lse/l;->b()Lse/l$b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lse/l$b;->e(Lse/p;)Lse/l$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/i;->c0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->v()[B

    move-result-object v0

    invoke-static {p1}, Lre/d0;->b(Lre/d0;)Lre/d0;

    move-result-object p1

    invoke-static {v0, p1}, Lgf/c;->a([BLre/d0;)Lgf/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Lse/l$b;->d(Lgf/c;)Lse/l$b;

    move-result-object p1

    invoke-virtual {p0}, Lye/l0;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0}, Lse/l$b;->c(Ljava/lang/Integer;)Lse/l$b;

    move-result-object p0

    invoke-virtual {p0}, Lse/l$b;->a()Lse/l;

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

.method public static g(Lye/m0;)Lse/p;
    .locals 3

    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object v0

    invoke-virtual {v0}, Lcf/h0;->f0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesEaxKey"

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

    invoke-static {v0, v1}, Lcf/j;->f0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcf/j;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lse/p;->b()Lse/p$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/j;->c0()I

    move-result v2

    invoke-virtual {v1, v2}, Lse/p$b;->c(I)Lse/p$b;

    move-result-object v1

    invoke-virtual {v0}, Lcf/j;->d0()Lcf/k;

    move-result-object v0

    invoke-virtual {v0}, Lcf/k;->c0()I

    move-result v0

    invoke-virtual {v1, v0}, Lse/p$b;->b(I)Lse/p$b;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Lse/p$b;->d(I)Lse/p$b;

    move-result-object v0

    invoke-virtual {p0}, Lye/m0;->d()Lcf/h0;

    move-result-object p0

    invoke-virtual {p0}, Lcf/h0;->e0()Lcf/p0;

    move-result-object p0

    invoke-static {p0}, Lte/j;->m(Lcf/p0;)Lse/p$c;

    move-result-object p0

    invoke-virtual {v0, p0}, Lse/p$b;->e(Lse/p$c;)Lse/p$b;

    move-result-object p0

    invoke-virtual {p0}, Lse/p$b;->a()Lse/p;

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

    invoke-static {v0}, Lte/j;->i(Lye/d0;)V

    return-void
.end method

.method public static i(Lye/d0;)V
    .locals 1

    sget-object v0, Lte/j;->b:Lye/g0;

    invoke-virtual {p0, v0}, Lye/d0;->m(Lye/g0;)V

    sget-object v0, Lte/j;->c:Lye/f0;

    invoke-virtual {p0, v0}, Lye/d0;->l(Lye/f0;)V

    sget-object v0, Lte/j;->d:Lye/n;

    invoke-virtual {p0, v0}, Lye/d0;->k(Lye/n;)V

    sget-object v0, Lte/j;->e:Lye/m;

    invoke-virtual {p0, v0}, Lye/d0;->j(Lye/m;)V

    return-void
.end method

.method public static j(Lse/l;Lre/d0;)Lye/l0;
    .locals 3

    invoke-static {}, Lcf/i;->f0()Lcf/i$b;

    move-result-object v0

    invoke-virtual {p0}, Lse/l;->e()Lse/p;

    move-result-object v1

    invoke-static {v1}, Lte/j;->e(Lse/p;)Lcf/k;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/i$b;->F(Lcf/k;)Lcf/i$b;

    move-result-object v0

    invoke-virtual {p0}, Lse/l;->c()Lgf/c;

    move-result-object v1

    invoke-static {p1}, Lre/d0;->b(Lre/d0;)Lre/d0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lgf/c;->d(Lre/d0;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcf/i$b;->D(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/i$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lcf/i;

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    sget-object v0, Lcf/f0$c;->c:Lcf/f0$c;

    invoke-virtual {p0}, Lse/l;->e()Lse/p;

    move-result-object v1

    invoke-virtual {v1}, Lse/p;->f()Lse/p$c;

    move-result-object v1

    invoke-static {v1}, Lte/j;->l(Lse/p$c;)Lcf/p0;

    move-result-object v1

    invoke-virtual {p0}, Lse/l;->a()Ljava/lang/Integer;

    move-result-object p0

    const-string v2, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-static {v2, p1, v0, v1, p0}, Lye/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Lcf/f0$c;Lcf/p0;Ljava/lang/Integer;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static k(Lse/p;)Lye/m0;
    .locals 3

    invoke-static {}, Lcf/h0;->h0()Lcf/h0$b;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-virtual {v0, v1}, Lcf/h0$b;->F(Ljava/lang/String;)Lcf/h0$b;

    move-result-object v0

    invoke-static {}, Lcf/j;->e0()Lcf/j$b;

    move-result-object v1

    invoke-static {p0}, Lte/j;->e(Lse/p;)Lcf/k;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcf/j$b;->F(Lcf/k;)Lcf/j$b;

    move-result-object v1

    invoke-virtual {p0}, Lse/p;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Lcf/j$b;->D(I)Lcf/j$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v1

    check-cast v1, Lcf/j;

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/a;->b()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/h0$b;->G(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/h0$b;

    move-result-object v0

    invoke-virtual {p0}, Lse/p;->f()Lse/p$c;

    move-result-object p0

    invoke-static {p0}, Lte/j;->l(Lse/p$c;)Lcf/p0;

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

.method public static l(Lse/p$c;)Lcf/p0;
    .locals 3

    sget-object v0, Lse/p$c;->b:Lse/p$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcf/p0;->c:Lcf/p0;

    return-object p0

    :cond_0
    sget-object v0, Lse/p$c;->c:Lse/p$c;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lcf/p0;->f:Lcf/p0;

    return-object p0

    :cond_1
    sget-object v0, Lse/p$c;->d:Lse/p$c;

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

.method public static m(Lcf/p0;)Lse/p$c;
    .locals 3

    sget-object v0, Lte/j$a;->a:[I

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

    sget-object p0, Lse/p$c;->d:Lse/p$c;

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
    sget-object p0, Lse/p$c;->c:Lse/p$c;

    return-object p0

    :cond_2
    sget-object p0, Lse/p$c;->b:Lse/p$c;

    return-object p0
.end method
