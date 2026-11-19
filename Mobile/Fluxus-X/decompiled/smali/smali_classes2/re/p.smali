.class public final Lre/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lre/p$c;,
        Lre/p$b;
    }
.end annotation


# instance fields
.field public final a:Lcf/j0;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lre/p$c;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lye/r;


# direct methods
.method public constructor <init>(Lcf/j0;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcf/j0;",
            "Ljava/util/List<",
            "Lre/p$c;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lre/p;->a:Lcf/j0;

    .line 4
    iput-object p2, p0, Lre/p;->b:Ljava/util/List;

    .line 5
    sget-object p1, Lye/r;->b:Lye/r;

    iput-object p1, p0, Lre/p;->c:Lye/r;

    return-void
.end method

.method public constructor <init>(Lcf/j0;Ljava/util/List;Lye/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcf/j0;",
            "Ljava/util/List<",
            "Lre/p$c;",
            ">;",
            "Lye/r;",
            ")V"
        }
    .end annotation

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lre/p;->a:Lcf/j0;

    .line 8
    iput-object p2, p0, Lre/p;->b:Ljava/util/List;

    .line 9
    iput-object p3, p0, Lre/p;->c:Lye/r;

    return-void
.end method

.method public synthetic constructor <init>(Lcf/j0;Ljava/util/List;Lye/r;Lre/p$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lre/p;-><init>(Lcf/j0;Ljava/util/List;Lye/r;)V

    return-void
.end method

.method public static A(ILcf/g0;Lye/l0;)Lcf/j0$c;
    .locals 3

    invoke-static {}, Lcf/j0$c;->j0()Lcf/j0$c$a;

    move-result-object v0

    invoke-static {}, Lcf/f0;->h0()Lcf/f0$b;

    move-result-object v1

    invoke-virtual {p2}, Lye/l0;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcf/f0$b;->F(Ljava/lang/String;)Lcf/f0$b;

    move-result-object v1

    invoke-virtual {p2}, Lye/l0;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcf/f0$b;->G(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/f0$b;

    move-result-object v1

    invoke-virtual {p2}, Lye/l0;->d()Lcf/f0$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcf/f0$b;->D(Lcf/f0$c;)Lcf/f0$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcf/j0$c$a;->D(Lcf/f0$b;)Lcf/j0$c$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcf/j0$c$a;->J(Lcf/g0;)Lcf/j0$c$a;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcf/j0$c$a;->G(I)Lcf/j0$c$a;

    move-result-object p0

    invoke-virtual {p2}, Lye/l0;->e()Lcf/p0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcf/j0$c$a;->H(Lcf/p0;)Lcf/j0$c$a;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lcf/j0$c;

    return-object p0
.end method

.method public static B(Lcf/j0$c;)Lye/l0;
    .locals 4

    invoke-virtual {p0}, Lcf/j0$c;->f0()I

    move-result v0

    invoke-virtual {p0}, Lcf/j0$c;->g0()Lcf/p0;

    move-result-object v1

    sget-object v2, Lcf/p0;->e:Lcf/p0;

    if-ne v1, v2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    invoke-virtual {p0}, Lcf/j0$c;->e0()Lcf/f0;

    move-result-object v1

    invoke-virtual {v1}, Lcf/f0;->f0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcf/j0$c;->e0()Lcf/f0;

    move-result-object v2

    invoke-virtual {v2}, Lcf/f0;->g0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {p0}, Lcf/j0$c;->e0()Lcf/f0;

    move-result-object v3

    invoke-virtual {v3}, Lcf/f0;->e0()Lcf/f0$c;

    move-result-object v3

    invoke-virtual {p0}, Lcf/j0$c;->g0()Lcf/p0;

    move-result-object p0

    invoke-static {v1, v2, v3, p0, v0}, Lye/l0;->b(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/h;Lcf/f0$c;Lcf/p0;Ljava/lang/Integer;)Lye/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lre/l;Lre/n;I)Lcf/j0$c;
    .locals 0

    invoke-static {p0, p1, p2}, Lre/p;->f(Lre/l;Lre/n;I)Lcf/j0$c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcf/j0;)V
    .locals 0

    invoke-static {p0}, Lre/p;->d(Lcf/j0;)V

    return-void
.end method

.method public static c(Lcf/a0;)V
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcf/a0;->e0()Lcom/google/crypto/tink/shaded/protobuf/h;

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

.method public static d(Lcf/j0;)V
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcf/j0;->f0()I

    move-result p0

    if-lez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "empty keyset"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(Lcf/j0;)V
    .locals 3

    invoke-virtual {p0}, Lcf/j0;->g0()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcf/j0$c;

    invoke-virtual {v0}, Lcf/j0$c;->e0()Lcf/f0;

    move-result-object v1

    invoke-virtual {v1}, Lcf/f0;->e0()Lcf/f0$c;

    move-result-object v1

    sget-object v2, Lcf/f0$c;->b:Lcf/f0$c;

    if-eq v1, v2, :cond_0

    invoke-virtual {v0}, Lcf/j0$c;->e0()Lcf/f0;

    move-result-object v1

    invoke-virtual {v1}, Lcf/f0;->e0()Lcf/f0$c;

    move-result-object v1

    sget-object v2, Lcf/f0$c;->c:Lcf/f0$c;

    if-eq v1, v2, :cond_0

    invoke-virtual {v0}, Lcf/j0$c;->e0()Lcf/f0;

    move-result-object v1

    invoke-virtual {v1}, Lcf/f0;->e0()Lcf/f0$c;

    move-result-object v1

    sget-object v2, Lcf/f0$c;->d:Lcf/f0$c;

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-virtual {v0}, Lcf/j0$c;->e0()Lcf/f0;

    move-result-object v1

    invoke-virtual {v1}, Lcf/f0;->e0()Lcf/f0$c;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcf/j0$c;->e0()Lcf/f0;

    move-result-object v0

    invoke-virtual {v0}, Lcf/f0;->f0()Ljava/lang/String;

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

.method public static f(Lre/l;Lre/n;I)Lcf/j0$c;
    .locals 3

    invoke-static {}, Lye/d0;->c()Lye/d0;

    move-result-object v0

    const-class v1, Lye/l0;

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v2

    invoke-virtual {v0, p0, v1, v2}, Lye/d0;->n(Lre/l;Ljava/lang/Class;Lre/d0;)Lye/p0;

    move-result-object p0

    check-cast p0, Lye/l0;

    invoke-virtual {p0}, Lye/l0;->c()Ljava/lang/Integer;

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
    invoke-static {p1}, Lre/p;->x(Lre/n;)Lcf/g0;

    move-result-object p1

    invoke-static {p2, p1, p0}, Lre/p;->A(ILcf/g0;Lye/l0;)Lcf/j0$c;

    move-result-object p0

    return-object p0
.end method

.method public static g(Lcf/a0;Lre/a;[B)Lcf/j0;
    .locals 0

    :try_start_0
    invoke-virtual {p0}, Lcf/a0;->e0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/h;->v()[B

    move-result-object p0

    invoke-interface {p1, p0, p2}, Lre/a;->b([B[B)[B

    move-result-object p0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object p1

    invoke-static {p0, p1}, Lcf/j0;->k0([BLcom/google/crypto/tink/shaded/protobuf/p;)Lcf/j0;

    move-result-object p0

    invoke-static {p0}, Lre/p;->d(Lcf/j0;)V
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "invalid keyset, corrupted key material"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static h(Lcf/j0;Lre/a;[B)Lcf/a0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/a;->n()[B

    move-result-object v0

    invoke-interface {p1, v0, p2}, Lre/a;->a([B[B)[B

    move-result-object p1

    invoke-static {}, Lcf/a0;->f0()Lcf/a0$b;

    move-result-object p2

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->e([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcf/a0$b;->F(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcf/a0$b;

    move-result-object p1

    invoke-static {p0}, Lre/i0;->b(Lcf/j0;)Lcf/k0;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcf/a0$b;->G(Lcf/k0;)Lcf/a0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lcf/a0;

    return-object p0
.end method

.method public static final i(Lcf/j0;)Lre/p;
    .locals 2

    invoke-static {p0}, Lre/p;->d(Lcf/j0;)V

    invoke-static {p0}, Lre/p;->m(Lcf/j0;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lre/p;

    invoke-direct {v1, p0, v0}, Lre/p;-><init>(Lcf/j0;Ljava/util/List;)V

    return-object v1
.end method

.method public static j(Lre/x;)Lre/p$b$a;
    .locals 2

    new-instance v0, Lre/p$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lre/p$b$a;-><init>(Lre/x;Lre/p$a;)V

    return-object v0
.end method

.method public static final k(Lre/o;)Lre/p;
    .locals 0

    invoke-virtual {p0}, Lre/o;->d()Lre/x;

    move-result-object p0

    invoke-static {p0}, Lre/p;->l(Lre/x;)Lre/p;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Lre/x;)Lre/p;
    .locals 1

    invoke-static {}, Lre/p;->s()Lre/p$b;

    move-result-object v0

    invoke-static {p0}, Lre/p;->j(Lre/x;)Lre/p$b$a;

    move-result-object p0

    invoke-virtual {p0}, Lre/p$b$a;->j()Lre/p$b$a;

    move-result-object p0

    invoke-virtual {p0}, Lre/p$b$a;->i()Lre/p$b$a;

    move-result-object p0

    invoke-virtual {v0, p0}, Lre/p$b;->b(Lre/p$b$a;)Lre/p$b;

    move-result-object p0

    invoke-virtual {p0}, Lre/p$b;->c()Lre/p;

    move-result-object p0

    return-object p0
.end method

.method public static m(Lcf/j0;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcf/j0;",
            ")",
            "Ljava/util/List<",
            "Lre/p$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcf/j0;->f0()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, Lcf/j0;->g0()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcf/j0$c;

    invoke-virtual {v2}, Lcf/j0$c;->f0()I

    move-result v6

    :try_start_0
    invoke-static {v2}, Lre/p;->z(Lcf/j0$c;)Lre/l;

    move-result-object v4

    new-instance v3, Lre/p$c;

    invoke-virtual {v2}, Lcf/j0$c;->h0()Lcf/g0;

    move-result-object v2

    invoke-static {v2}, Lre/p;->t(Lcf/g0;)Lre/n;

    move-result-object v5

    invoke-virtual {p0}, Lcf/j0;->h0()I

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

    invoke-direct/range {v3 .. v8}, Lre/p$c;-><init>(Lre/l;Lre/n;IZLre/p$a;)V

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

.method public static s()Lre/p$b;
    .locals 1

    new-instance v0, Lre/p$b;

    invoke-direct {v0}, Lre/p$b;-><init>()V

    return-object v0
.end method

.method public static t(Lcf/g0;)Lre/n;
    .locals 1

    sget-object v0, Lre/p$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Lre/n;->d:Lre/n;

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Unknown key status"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sget-object p0, Lre/n;->c:Lre/n;

    return-object p0

    :cond_2
    sget-object p0, Lre/n;->b:Lre/n;

    return-object p0
.end method

.method public static final u(Lre/r;)Lre/p;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    :try_start_0
    invoke-interface {p0}, Lre/r;->read()Lcf/j0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/a;->n()[B

    move-result-object p0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {p0}, Lre/p;->v([B)Lre/p;

    move-result-object p0

    return-object p0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid keyset"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final v([B)Lre/p;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    :try_start_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p0, v0}, Lcf/j0;->k0([BLcom/google/crypto/tink/shaded/protobuf/p;)Lcf/j0;

    move-result-object p0

    invoke-static {p0}, Lre/p;->e(Lcf/j0;)V

    invoke-static {p0}, Lre/p;->i(Lcf/j0;)Lre/p;

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

.method public static final w(Lre/r;Lre/a;[B)Lre/p;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-interface {p0}, Lre/r;->a()Lcf/a0;

    move-result-object p0

    invoke-static {p0}, Lre/p;->c(Lcf/a0;)V

    invoke-static {p0, p1, p2}, Lre/p;->g(Lcf/a0;Lre/a;[B)Lcf/j0;

    move-result-object p0

    invoke-static {p0}, Lre/p;->i(Lcf/j0;)Lre/p;

    move-result-object p0

    return-object p0
.end method

.method public static x(Lre/n;)Lcf/g0;
    .locals 1

    sget-object v0, Lre/n;->b:Lre/n;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lcf/g0;->c:Lcf/g0;

    return-object p0

    :cond_0
    sget-object v0, Lre/n;->c:Lre/n;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lcf/g0;->d:Lcf/g0;

    return-object p0

    :cond_1
    sget-object v0, Lre/n;->d:Lre/n;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    sget-object p0, Lcf/g0;->e:Lcf/g0;

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Unknown key status"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static z(Lcf/j0$c;)Lre/l;
    .locals 2

    invoke-static {p0}, Lre/p;->B(Lcf/j0$c;)Lye/l0;

    move-result-object p0

    invoke-static {}, Lye/d0;->c()Lye/d0;

    move-result-object v0

    invoke-static {}, Lre/j;->a()Lre/d0;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lye/d0;->g(Lye/l0;Lre/d0;)Lre/l;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public C(Lre/s;Lre/a;[B)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lre/p;->a:Lcf/j0;

    invoke-static {v0, p2, p3}, Lre/p;->h(Lcf/j0;Lre/a;[B)Lcf/a0;

    move-result-object p2

    invoke-interface {p1, p2}, Lre/s;->b(Lcf/a0;)V

    return-void
.end method

.method public n()Lcf/j0;
    .locals 1

    iget-object v0, p0, Lre/p;->a:Lcf/j0;

    return-object v0
.end method

.method public o()Lcf/k0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lre/p;->a:Lcf/j0;

    invoke-static {v0}, Lre/i0;->b(Lcf/j0;)Lcf/k0;

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

    invoke-static {}, Lre/c0;->a()Lre/e;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lre/p;->q(Lre/e;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public q(Lre/e;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(",
            "Lre/e;",
            "Ljava/lang/Class<",
            "TP;>;)TP;"
        }
    .end annotation

    instance-of v0, p1, Lye/j;

    if-eqz v0, :cond_1

    check-cast p1, Lye/j;

    invoke-virtual {p1, p2}, Lye/j;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2, v0}, Lre/p;->r(Lye/j;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

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

.method public final r(Lye/j;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<B:",
            "Ljava/lang/Object;",
            "P:",
            "Ljava/lang/Object;",
            ">(",
            "Lye/j;",
            "Ljava/lang/Class<",
            "TP;>;",
            "Ljava/lang/Class<",
            "TB;>;)TP;"
        }
    .end annotation

    iget-object v0, p0, Lre/p;->a:Lcf/j0;

    invoke-static {v0}, Lre/i0;->e(Lcf/j0;)V

    invoke-static {p3}, Lye/j0;->i(Ljava/lang/Class;)Lye/j0$b;

    move-result-object v0

    iget-object v1, p0, Lre/p;->c:Lye/r;

    invoke-virtual {v0, v1}, Lye/j0$b;->e(Lye/r;)Lye/j0$b;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lre/p;->y()I

    move-result v2

    if-ge v1, v2, :cond_3

    iget-object v2, p0, Lre/p;->a:Lcf/j0;

    invoke-virtual {v2, v1}, Lcf/j0;->e0(I)Lcf/j0$c;

    move-result-object v2

    invoke-virtual {v2}, Lcf/j0$c;->h0()Lcf/g0;

    move-result-object v3

    sget-object v4, Lcf/g0;->c:Lcf/g0;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lre/p;->b:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lre/p$c;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lre/p$c;->a()Lre/l;

    move-result-object v3

    :try_start_0
    invoke-virtual {p1, v3, p3}, Lye/j;->b(Lre/l;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v2}, Lcf/j0$c;->f0()I

    move-result v5

    iget-object v6, p0, Lre/p;->a:Lcf/j0;

    invoke-virtual {v6}, Lcf/j0;->h0()I

    move-result v6

    if-ne v5, v6, :cond_0

    invoke-virtual {v0, v4, v3, v2}, Lye/j0$b;->c(Ljava/lang/Object;Lre/l;Lcf/j0$c;)Lye/j0$b;

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v4, v3, v2}, Lye/j0$b;->b(Ljava/lang/Object;Lre/l;Lcf/j0$c;)Lye/j0$b;

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

    invoke-virtual {v2}, Lcf/j0$c;->e0()Lcf/f0;

    move-result-object p3

    invoke-virtual {p3}, Lcf/f0;->f0()Ljava/lang/String;

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

    invoke-virtual {v2}, Lcf/j0$c;->e0()Lcf/f0;

    move-result-object p3

    invoke-virtual {p3}, Lcf/f0;->f0()Ljava/lang/String;

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
    invoke-virtual {v0}, Lye/j0$b;->d()Lye/j0;

    move-result-object p3

    invoke-virtual {p1, p3, p2}, Lye/j;->c(Lye/j0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lre/p;->o()Lcf/k0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public y()I
    .locals 1

    iget-object v0, p0, Lre/p;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
