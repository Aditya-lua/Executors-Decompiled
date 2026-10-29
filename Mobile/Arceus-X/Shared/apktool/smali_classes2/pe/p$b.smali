.class public final Lpe/p$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpe/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpe/p$b$a;,
        Lpe/p$b$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lpe/p$b$a;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/security/GeneralSecurityException;

.field public c:Lwe/r;

.field public d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lpe/p$b;->a:Ljava/util/List;

    const/4 v0, 0x0

    iput-object v0, p0, Lpe/p$b;->b:Ljava/security/GeneralSecurityException;

    sget-object v0, Lwe/r;->b:Lwe/r;

    iput-object v0, p0, Lpe/p$b;->c:Lwe/r;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lpe/p$b;->d:Z

    return-void
.end method

.method public static synthetic a(Lpe/p$b;)V
    .locals 0

    invoke-virtual {p0}, Lpe/p$b;->e()V

    return-void
.end method

.method public static d(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lpe/p$b$a;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_2

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpe/p$b$a;

    invoke-static {v1}, Lpe/p$b$a;->f(Lpe/p$b$a;)Lpe/p$b$b;

    move-result-object v1

    invoke-static {}, Lpe/p$b$b;->b()Lpe/p$b$b;

    move-result-object v2

    if-ne v1, v2, :cond_1

    add-int/lit8 v1, v0, 0x1

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpe/p$b$a;

    invoke-static {v1}, Lpe/p$b$a;->f(Lpe/p$b$a;)Lpe/p$b$b;

    move-result-object v1

    invoke-static {}, Lpe/p$b$b;->b()Lpe/p$b$b;

    move-result-object v2

    if-ne v1, v2, :cond_0

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Entries with \'withRandomId()\' may only be followed by other entries with \'withRandomId()\'."

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static f(Lpe/p$b$a;Ljava/util/Set;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpe/p$b$a;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    invoke-static {p0}, Lpe/p$b$a;->f(Lpe/p$b$a;)Lpe/p$b$b;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Lpe/p$b$a;->f(Lpe/p$b$a;)Lpe/p$b$b;

    move-result-object v0

    invoke-static {}, Lpe/p$b$b;->b()Lpe/p$b$b;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lpe/p$b;->g(Ljava/util/Set;)I

    move-result p0

    return p0

    :cond_0
    invoke-static {p0}, Lpe/p$b$a;->f(Lpe/p$b$a;)Lpe/p$b$b;

    move-result-object p0

    invoke-static {p0}, Lpe/p$b$b;->c(Lpe/p$b$b;)I

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "No ID was set (with withFixedId or withRandomId)"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static g(Ljava/util/Set;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    return v0

    :cond_1
    :goto_1
    invoke-static {}, Lwe/s0;->f()I

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public b(Lpe/p$b$a;)Lpe/p$b;
    .locals 1

    invoke-static {p1}, Lpe/p$b$a;->d(Lpe/p$b$a;)Lpe/p$b;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {p1}, Lpe/p$b$a;->b(Lpe/p$b$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpe/p$b;->e()V

    :cond_0
    invoke-static {p1, p0}, Lpe/p$b$a;->e(Lpe/p$b$a;Lpe/p$b;)Lpe/p$b;

    iget-object v0, p0, Lpe/p$b;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Entry has already been added to a KeysetHandle.Builder"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c()Lpe/p;
    .locals 14

    iget-object v0, p0, Lpe/p$b;->b:Ljava/security/GeneralSecurityException;

    if-nez v0, :cond_a

    iget-boolean v0, p0, Lpe/p$b;->d:Z

    if-nez v0, :cond_9

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpe/p$b;->d:Z

    invoke-static {}, Laf/j0;->i0()Laf/j0$b;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lpe/p$b;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v2, p0, Lpe/p$b;->a:Ljava/util/List;

    invoke-static {v2}, Lpe/p$b;->d(Ljava/util/List;)V

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iget-object v3, p0, Lpe/p$b;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    move-object v5, v4

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpe/p$b$a;

    invoke-static {v6}, Lpe/p$b$a;->g(Lpe/p$b$a;)Lpe/n;

    move-result-object v7

    if-eqz v7, :cond_6

    invoke-static {v6, v2}, Lpe/p$b;->f(Lpe/p$b$a;Ljava/util/Set;)I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v2, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v2, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-static {v6}, Lpe/p$b$a;->h(Lpe/p$b$a;)Lpe/l;

    move-result-object v7

    if-eqz v7, :cond_0

    new-instance v8, Lpe/p$c;

    invoke-static {v6}, Lpe/p$b$a;->h(Lpe/p$b$a;)Lpe/l;

    move-result-object v9

    invoke-static {v6}, Lpe/p$b$a;->g(Lpe/p$b$a;)Lpe/n;

    move-result-object v10

    invoke-static {v6}, Lpe/p$b$a;->b(Lpe/p$b$a;)Z

    move-result v12

    const/4 v13, 0x0

    invoke-direct/range {v8 .. v13}, Lpe/p$c;-><init>(Lpe/l;Lpe/n;IZLpe/p$a;)V

    invoke-static {v6}, Lpe/p$b$a;->h(Lpe/p$b$a;)Lpe/l;

    move-result-object v7

    invoke-static {v6}, Lpe/p$b$a;->g(Lpe/p$b$a;)Lpe/n;

    move-result-object v9

    invoke-static {v7, v9, v11}, Lpe/p;->a(Lpe/l;Lpe/n;I)Laf/j0$c;

    move-result-object v7

    goto :goto_2

    :cond_0
    invoke-static {v6}, Lpe/p$b$a;->a(Lpe/p$b$a;)Lpe/x;

    move-result-object v7

    invoke-virtual {v7}, Lpe/x;->a()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    goto :goto_1

    :cond_1
    move-object v7, v4

    :goto_1
    invoke-static {}, Lwe/w;->f()Lwe/w;

    move-result-object v8

    invoke-static {v6}, Lpe/p$b$a;->a(Lpe/p$b$a;)Lpe/x;

    move-result-object v9

    invoke-virtual {v8, v9, v7}, Lwe/w;->c(Lpe/x;Ljava/lang/Integer;)Lpe/l;

    move-result-object v9

    new-instance v8, Lpe/p$c;

    invoke-static {v6}, Lpe/p$b$a;->g(Lpe/p$b$a;)Lpe/n;

    move-result-object v10

    invoke-static {v6}, Lpe/p$b$a;->b(Lpe/p$b$a;)Z

    move-result v12

    const/4 v13, 0x0

    invoke-direct/range {v8 .. v13}, Lpe/p$c;-><init>(Lpe/l;Lpe/n;IZLpe/p$a;)V

    invoke-static {v6}, Lpe/p$b$a;->g(Lpe/p$b$a;)Lpe/n;

    move-result-object v7

    invoke-static {v9, v7, v11}, Lpe/p;->a(Lpe/l;Lpe/n;I)Laf/j0$c;

    move-result-object v7

    :goto_2
    invoke-virtual {v0, v7}, Laf/j0$b;->C(Laf/j0$c;)Laf/j0$b;

    invoke-static {v6}, Lpe/p$b$a;->b(Lpe/p$b$a;)Z

    move-result v7

    if-eqz v7, :cond_4

    if-nez v5, :cond_3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v6}, Lpe/p$b$a;->g(Lpe/p$b$a;)Lpe/n;

    move-result-object v6

    sget-object v7, Lpe/n;->b:Lpe/n;

    if-ne v6, v7, :cond_2

    goto :goto_3

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Primary key is not enabled"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Two primaries were set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_3
    invoke-interface {v1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Id "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " is used twice in the keyset"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key Status not set."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    if-eqz v5, :cond_8

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v2}, Laf/j0$b;->D(I)Laf/j0$b;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->o()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    check-cast v0, Laf/j0;

    invoke-static {v0}, Lpe/p;->b(Laf/j0;)V

    new-instance v2, Lpe/p;

    iget-object v3, p0, Lpe/p$b;->c:Lwe/r;

    invoke-direct {v2, v0, v1, v3, v4}, Lpe/p;-><init>(Laf/j0;Ljava/util/List;Lwe/r;Lpe/p$a;)V

    return-object v2

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "No primary was set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "KeysetHandle.Builder#build must only be called once"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build keyset due to error in original"

    iget-object v2, p0, Lpe/p$b;->b:Ljava/security/GeneralSecurityException;

    invoke-direct {v0, v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final e()V
    .locals 3

    iget-object v0, p0, Lpe/p$b;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpe/p$b$a;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lpe/p$b$a;->c(Lpe/p$b$a;Z)Z

    goto :goto_0

    :cond_0
    return-void
.end method
