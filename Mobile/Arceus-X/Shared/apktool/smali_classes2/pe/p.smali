.class public final Lpe/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpe/p$c;,
        Lpe/p$b;
    }
.end annotation


# instance fields
.field public final a:Laf/j0;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpe/p$c;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lwe/r;


# direct methods
.method public constructor <init>(Laf/j0;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laf/j0;",
            "Ljava/util/List<",
            "Lpe/p$c;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lpe/p;->a:Laf/j0;

    .line 4
    iput-object p2, p0, Lpe/p;->b:Ljava/util/List;

    .line 5
    sget-object p1, Lwe/r;->b:Lwe/r;

    iput-object p1, p0, Lpe/p;->c:Lwe/r;

    return-void
.end method

.method public constructor <init>(Laf/j0;Ljava/util/List;Lwe/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laf/j0;",
            "Ljava/util/List<",
            "Lpe/p$c;",
            ">;",
            "Lwe/r;",
            ")V"
        }
    .end annotation

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lpe/p;->a:Laf/j0;

    .line 8
    iput-object p2, p0, Lpe/p;->b:Ljava/util/List;

    .line 9
    iput-object p3, p0, Lpe/p;->c:Lwe/r;

    return-void
.end method

.method public synthetic constructor <init>(Laf/j0;Ljava/util/List;Lwe/r;Lpe/p$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lpe/p;-><init>(Laf/j0;Ljava/util/List;Lwe/r;)V

    return-void
.end method

.method public static A(ILaf/g0;Lwe/l0;)Laf/j0$c;
    .locals 3

    invoke-static {}, Laf/j0$c;->j0()Laf/j0$c$a;

    move-result-object v0

    invoke-static {}, Laf/f0;->h0()Laf/f0$b;

    move-result-object v1

    invoke-virtual {p2}, Lwe/l0;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Laf/f0$b;->D(Ljava/lang/String;)Laf/f0$b;

    move-result-object v1

    invoke-virtual {p2}, Lwe/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v1, v2}, Laf/f0$b;->E(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/f0$b;

    move-result-object v1

    invoke-virtual {p2}, Lwe/l0;->d()Laf/f0$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Laf/f0$b;->C(Laf/f0$c;)Laf/f0$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Laf/j0$c$a;->C(Laf/f0$b;)Laf/j0$c$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Laf/j0$c$a;->J(Laf/g0;)Laf/j0$c$a;

    move-result-object p1

    invoke-virtual {p1, p0}, Laf/j0$c$a;->E(I)Laf/j0$c$a;

    move-result-object p0

    invoke-virtual {p2}, Lwe/l0;->e()Laf/p0;

    move-result-object p1

    invoke-virtual {p0, p1}, Laf/j0$c$a;->G(Laf/p0;)Laf/j0$c$a;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Laf/j0$c;

    return-object p0
.end method

.method public static B(Laf/j0$c;)Lwe/l0;
    .locals 4

    invoke-virtual {p0}, Laf/j0$c;->f0()I

    move-result v0

    invoke-virtual {p0}, Laf/j0$c;->g0()Laf/p0;

    move-result-object v1

    sget-object v2, Laf/p0;->e:Laf/p0;

    if-ne v1, v2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    invoke-virtual {p0}, Laf/j0$c;->e0()Laf/f0;

    move-result-object v1

    invoke-virtual {v1}, Laf/f0;->f0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Laf/j0$c;->e0()Laf/f0;

    move-result-object v2

    invoke-virtual {v2}, Laf/f0;->g0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {p0}, Laf/j0$c;->e0()Laf/f0;

    move-result-object v3

    invoke-virtual {v3}, Laf/f0;->e0()Laf/f0$c;

    move-result-object v3

    invoke-virtual {p0}, Laf/j0$c;->g0()Laf/p0;

    move-result-object p0

    invoke-static {v1, v2, v3, p0, v0}, Lwe/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Laf/f0$c;Laf/p0;Ljava/lang/Integer;)Lwe/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lpe/l;Lpe/n;I)Laf/j0$c;
    .locals 0

    invoke-static {p0, p1, p2}, Lpe/p;->f(Lpe/l;Lpe/n;I)Laf/j0$c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Laf/j0;)V
    .locals 0

    invoke-static {p0}, Lpe/p;->d(Laf/j0;)V

    return-void
.end method

.method public static c(Laf/a0;)V
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Laf/a0;->e0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result p0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "empty keyset"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static d(Laf/j0;)V
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Laf/j0;->f0()I

    move-result p0

    if-lez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "empty keyset"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(Laf/j0;)V
    .locals 3

    invoke-virtual {p0}, Laf/j0;->g0()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laf/j0$c;

    invoke-virtual {v0}, Laf/j0$c;->e0()Laf/f0;

    move-result-object v1

    invoke-virtual {v1}, Laf/f0;->e0()Laf/f0$c;

    move-result-object v1

    sget-object v2, Laf/f0$c;->b:Laf/f0$c;

    if-eq v1, v2, :cond_0

    invoke-virtual {v0}, Laf/j0$c;->e0()Laf/f0;

    move-result-object v1

    invoke-virtual {v1}, Laf/f0;->e0()Laf/f0$c;

    move-result-object v1

    sget-object v2, Laf/f0$c;->c:Laf/f0$c;

    if-eq v1, v2, :cond_0

    invoke-virtual {v0}, Laf/j0$c;->e0()Laf/f0;

    move-result-object v1

    invoke-virtual {v1}, Laf/f0;->e0()Laf/f0$c;

    move-result-object v1

    sget-object v2, Laf/f0$c;->d:Laf/f0$c;

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-virtual {v0}, Laf/j0$c;->e0()Laf/f0;

    move-result-object v1

    invoke-virtual {v1}, Laf/f0;->e0()Laf/f0$c;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Laf/j0$c;->e0()Laf/f0;

    move-result-object v0

    invoke-virtual {v0}, Laf/f0;->f0()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "keyset contains key material of type %s for type url %s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-void
.end method

.method public static f(Lpe/l;Lpe/n;I)Laf/j0$c;
    .locals 3

    invoke-static {}, Lwe/d0;->c()Lwe/d0;

    move-result-object v0

    const-class v1, Lwe/l0;

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v2

    invoke-virtual {v0, p0, v1, v2}, Lwe/d0;->n(Lpe/l;Ljava/lang/Class;Lpe/d0;)Lwe/p0;

    move-result-object p0

    check-cast p0, Lwe/l0;

    invoke-virtual {p0}, Lwe/l0;->c()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Wrong ID set for key with ID requirement"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    invoke-static {p1}, Lpe/p;->x(Lpe/n;)Laf/g0;

    move-result-object p1

    invoke-static {p2, p1, p0}, Lpe/p;->A(ILaf/g0;Lwe/l0;)Laf/j0$c;

    move-result-object p0

    return-object p0
.end method

.method public static g(Laf/a0;Lpe/a;[B)Laf/j0;
    .locals 0

    :try_start_0
    invoke-virtual {p0}, Laf/a0;->e0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h;->x()[B

    move-result-object p0

    invoke-interface {p1, p0, p2}, Lpe/a;->b([B[B)[B

    move-result-object p0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object p1

    invoke-static {p0, p1}, Laf/j0;->k0([BLcom/google/crypto/tink/shaded/protobuf/p;)Laf/j0;

    move-result-object p0

    invoke-static {p0}, Lpe/p;->d(Laf/j0;)V
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "invalid keyset, corrupted key material"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static h(Laf/j0;Lpe/a;[B)Laf/a0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/a;->n()[B

    move-result-object v0

    invoke-interface {p1, v0, p2}, Lpe/a;->a([B[B)[B

    move-result-object p1

    invoke-static {}, Laf/a0;->f0()Laf/a0$b;

    move-result-object p2

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {p2, p1}, Laf/a0$b;->D(Lcom/google/crypto/tink/shaded/protobuf/h;)Laf/a0$b;

    move-result-object p1

    invoke-static {p0}, Lpe/i0;->b(Laf/j0;)Laf/k0;

    move-result-object p0

    invoke-virtual {p1, p0}, Laf/a0$b;->E(Laf/k0;)Laf/a0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Laf/a0;

    return-object p0
.end method

.method public static final i(Laf/j0;)Lpe/p;
    .locals 2

    invoke-static {p0}, Lpe/p;->d(Laf/j0;)V

    invoke-static {p0}, Lpe/p;->m(Laf/j0;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lpe/p;

    invoke-direct {v1, p0, v0}, Lpe/p;-><init>(Laf/j0;Ljava/util/List;)V

    return-object v1
.end method

.method public static j(Lpe/x;)Lpe/p$b$a;
    .locals 2

    new-instance v0, Lpe/p$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lpe/p$b$a;-><init>(Lpe/x;Lpe/p$a;)V

    return-object v0
.end method

.method public static final k(Lpe/o;)Lpe/p;
    .locals 0

    invoke-virtual {p0}, Lpe/o;->d()Lpe/x;

    move-result-object p0

    invoke-static {p0}, Lpe/p;->l(Lpe/x;)Lpe/p;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Lpe/x;)Lpe/p;
    .locals 1

    invoke-static {}, Lpe/p;->s()Lpe/p$b;

    move-result-object v0

    invoke-static {p0}, Lpe/p;->j(Lpe/x;)Lpe/p$b$a;

    move-result-object p0

    invoke-virtual {p0}, Lpe/p$b$a;->j()Lpe/p$b$a;

    move-result-object p0

    invoke-virtual {p0}, Lpe/p$b$a;->i()Lpe/p$b$a;

    move-result-object p0

    invoke-virtual {v0, p0}, Lpe/p$b;->b(Lpe/p$b$a;)Lpe/p$b;

    move-result-object p0

    invoke-virtual {p0}, Lpe/p$b;->c()Lpe/p;

    move-result-object p0

    return-object p0
.end method

.method public static m(Laf/j0;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laf/j0;",
            ")",
            "Ljava/util/List<",
            "Lpe/p$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Laf/j0;->f0()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, Laf/j0;->g0()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Laf/j0$c;

    invoke-virtual {v2}, Laf/j0$c;->f0()I

    move-result v6

    :try_start_0
    invoke-static {v2}, Lpe/p;->z(Laf/j0$c;)Lpe/l;

    move-result-object v4

    new-instance v3, Lpe/p$c;

    invoke-virtual {v2}, Laf/j0$c;->h0()Laf/g0;

    move-result-object v2

    invoke-static {v2}, Lpe/p;->t(Laf/g0;)Lpe/n;

    move-result-object v5

    invoke-virtual {p0}, Laf/j0;->h0()I

    move-result v2

    if-ne v6, v2, :cond_0

    const/4 v2, 0x1

    :goto_1
    move v7, v2

    goto :goto_2

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :goto_2
    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, Lpe/p$c;-><init>(Lpe/l;Lpe/n;IZLpe/p$a;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static s()Lpe/p$b;
    .locals 1

    new-instance v0, Lpe/p$b;

    invoke-direct {v0}, Lpe/p$b;-><init>()V

    return-object v0
.end method

.method public static t(Laf/g0;)Lpe/n;
    .locals 1

    sget-object v0, Lpe/p$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Lpe/n;->d:Lpe/n;

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Unknown key status"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sget-object p0, Lpe/n;->c:Lpe/n;

    return-object p0

    :cond_2
    sget-object p0, Lpe/n;->b:Lpe/n;

    return-object p0
.end method

.method public static final u(Lpe/r;)Lpe/p;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    :try_start_0
    invoke-interface {p0}, Lpe/r;->read()Laf/j0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/a;->n()[B

    move-result-object p0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {p0}, Lpe/p;->v([B)Lpe/p;

    move-result-object p0

    return-object p0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid keyset"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final v([B)Lpe/p;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    :try_start_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p0, v0}, Laf/j0;->k0([BLcom/google/crypto/tink/shaded/protobuf/p;)Laf/j0;

    move-result-object p0

    invoke-static {p0}, Lpe/p;->e(Laf/j0;)V

    invoke-static {p0}, Lpe/p;->i(Laf/j0;)Lpe/p;

    move-result-object p0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid keyset"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final w(Lpe/r;Lpe/a;[B)Lpe/p;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-interface {p0}, Lpe/r;->a()Laf/a0;

    move-result-object p0

    invoke-static {p0}, Lpe/p;->c(Laf/a0;)V

    invoke-static {p0, p1, p2}, Lpe/p;->g(Laf/a0;Lpe/a;[B)Laf/j0;

    move-result-object p0

    invoke-static {p0}, Lpe/p;->i(Laf/j0;)Lpe/p;

    move-result-object p0

    return-object p0
.end method

.method public static x(Lpe/n;)Laf/g0;
    .locals 1

    sget-object v0, Lpe/n;->b:Lpe/n;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Laf/g0;->c:Laf/g0;

    return-object p0

    :cond_0
    sget-object v0, Lpe/n;->c:Lpe/n;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Laf/g0;->d:Laf/g0;

    return-object p0

    :cond_1
    sget-object v0, Lpe/n;->d:Lpe/n;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    sget-object p0, Laf/g0;->e:Laf/g0;

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Unknown key status"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static z(Laf/j0$c;)Lpe/l;
    .locals 2

    invoke-static {p0}, Lpe/p;->B(Laf/j0$c;)Lwe/l0;

    move-result-object p0

    invoke-static {}, Lwe/d0;->c()Lwe/d0;

    move-result-object v0

    invoke-static {}, Lpe/j;->a()Lpe/d0;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lwe/d0;->g(Lwe/l0;Lpe/d0;)Lpe/l;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public C(Lpe/s;Lpe/a;[B)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lpe/p;->a:Laf/j0;

    invoke-static {v0, p2, p3}, Lpe/p;->h(Laf/j0;Lpe/a;[B)Laf/a0;

    move-result-object p2

    invoke-interface {p1, p2}, Lpe/s;->b(Laf/a0;)V

    return-void
.end method

.method public n()Laf/j0;
    .locals 1

    iget-object v0, p0, Lpe/p;->a:Laf/j0;

    return-object v0
.end method

.method public o()Laf/k0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lpe/p;->a:Laf/j0;

    invoke-static {v0}, Lpe/i0;->b(Laf/j0;)Laf/k0;

    move-result-object v0

    return-object v0
.end method

.method public p(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TP;>;)TP;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lpe/c0;->a()Lpe/e;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lpe/p;->q(Lpe/e;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public q(Lpe/e;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(",
            "Lpe/e;",
            "Ljava/lang/Class<",
            "TP;>;)TP;"
        }
    .end annotation

    instance-of v0, p1, Lwe/j;

    if-eqz v0, :cond_1

    check-cast p1, Lwe/j;

    invoke-virtual {p1, p2}, Lwe/j;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2, v0}, Lpe/p;->r(Lwe/j;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No wrapper found for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Currently only subclasses of InternalConfiguration are accepted"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final r(Lwe/j;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<B:",
            "Ljava/lang/Object;",
            "P:",
            "Ljava/lang/Object;",
            ">(",
            "Lwe/j;",
            "Ljava/lang/Class<",
            "TP;>;",
            "Ljava/lang/Class<",
            "TB;>;)TP;"
        }
    .end annotation

    iget-object v0, p0, Lpe/p;->a:Laf/j0;

    invoke-static {v0}, Lpe/i0;->e(Laf/j0;)V

    invoke-static {p3}, Lwe/j0;->i(Ljava/lang/Class;)Lwe/j0$b;

    move-result-object v0

    iget-object v1, p0, Lpe/p;->c:Lwe/r;

    invoke-virtual {v0, v1}, Lwe/j0$b;->e(Lwe/r;)Lwe/j0$b;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lpe/p;->y()I

    move-result v2

    if-ge v1, v2, :cond_3

    iget-object v2, p0, Lpe/p;->a:Laf/j0;

    invoke-virtual {v2, v1}, Laf/j0;->e0(I)Laf/j0$c;

    move-result-object v2

    invoke-virtual {v2}, Laf/j0$c;->h0()Laf/g0;

    move-result-object v3

    sget-object v4, Laf/g0;->c:Laf/g0;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lpe/p;->b:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpe/p$c;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lpe/p$c;->a()Lpe/l;

    move-result-object v3

    :try_start_0
    invoke-virtual {p1, v3, p3}, Lwe/j;->b(Lpe/l;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v2}, Laf/j0$c;->f0()I

    move-result v5

    iget-object v6, p0, Lpe/p;->a:Laf/j0;

    invoke-virtual {v6}, Laf/j0;->h0()I

    move-result v6

    if-ne v5, v6, :cond_0

    invoke-virtual {v0, v4, v3, v2}, Lwe/j0$b;->c(Ljava/lang/Object;Lpe/l;Laf/j0$c;)Lwe/j0$b;

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v4, v3, v2}, Lwe/j0$b;->b(Ljava/lang/Object;Lpe/l;Laf/j0$c;)Lwe/j0$b;

    goto :goto_1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to get primitive "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " for key of type "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Laf/j0$c;->e0()Laf/f0;

    move-result-object p3

    invoke-virtual {p3}, Laf/f0;->f0()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ", see https://developers.google.com/tink/faq/registration_errors"

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Key parsing of key with index "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " and type_url "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Laf/j0$c;->e0()Laf/f0;

    move-result-object p3

    invoke-virtual {p3}, Laf/f0;->f0()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " failed, unable to get primitive"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_3
    invoke-virtual {v0}, Lwe/j0$b;->d()Lwe/j0;

    move-result-object p3

    invoke-virtual {p1, p3, p2}, Lwe/j;->c(Lwe/j0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lpe/p;->o()Laf/k0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public y()I
    .locals 1

    iget-object v0, p0, Lpe/p;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
