.class public Lze/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lye/k0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lze/h$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lye/k0<",
        "Lze/g;",
        "Lze/g;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lze/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lze/h;

    invoke-direct {v0}, Lze/h;-><init>()V

    sput-object v0, Lze/h;->a:Lze/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d()V
    .locals 2

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object v0

    sget-object v1, Lze/h;->a:Lze/h;

    invoke-virtual {v0, v1}, Lye/a0;->e(Lye/k0;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lze/g;",
            ">;"
        }
    .end annotation

    const-class v0, Lze/g;

    return-object v0
.end method

.method public b()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lze/g;",
            ">;"
        }
    .end annotation

    const-class v0, Lze/g;

    return-object v0
.end method

.method public bridge synthetic c(Lye/j0;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lze/h;->e(Lye/j0;)Lze/g;

    move-result-object p1

    return-object p1
.end method

.method public e(Lye/j0;)Lze/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lye/j0<",
            "Lze/g;",
            ">;)",
            "Lze/g;"
        }
    .end annotation

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lye/j0;->d()Lye/j0$c;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lye/j0;->b()Ljava/util/Collection;

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

    check-cast v2, Lye/j0$c;

    invoke-virtual {v2}, Lye/j0$c;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lze/g;

    goto :goto_0

    :cond_1
    new-instance v0, Lze/h$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lze/h$b;-><init>(Lye/j0;Lze/h$a;)V

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
