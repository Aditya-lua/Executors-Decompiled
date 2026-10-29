.class public Lxe/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwe/k0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/h$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwe/k0<",
        "Lxe/g;",
        "Lxe/g;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lxe/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxe/h;

    invoke-direct {v0}, Lxe/h;-><init>()V

    sput-object v0, Lxe/h;->a:Lxe/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d()V
    .locals 2

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v0

    sget-object v1, Lxe/h;->a:Lxe/h;

    invoke-virtual {v0, v1}, Lwe/a0;->e(Lwe/k0;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lxe/g;",
            ">;"
        }
    .end annotation

    const-class v0, Lxe/g;

    return-object v0
.end method

.method public bridge synthetic b(Lwe/j0;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lxe/h;->e(Lwe/j0;)Lxe/g;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lxe/g;",
            ">;"
        }
    .end annotation

    const-class v0, Lxe/g;

    return-object v0
.end method

.method public e(Lwe/j0;)Lxe/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwe/j0<",
            "Lxe/g;",
            ">;)",
            "Lxe/g;"
        }
    .end annotation

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lwe/j0;->d()Lwe/j0$c;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lwe/j0;->b()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwe/j0$c;

    invoke-virtual {v2}, Lwe/j0$c;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxe/g;

    goto :goto_0

    :cond_1
    new-instance v0, Lxe/h$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lxe/h$b;-><init>(Lwe/j0;Lxe/h$a;)V

    return-object v0

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "no primary in primitive set"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "primitive set must be non-null"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
