.class public Lke/x;
.super Lke/v;
.source "SourceFile"

# interfaces
.implements Lke/g0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lke/x$b;,
        Lke/x$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lke/v<",
        "TK;TV;>;",
        "Lke/g0;"
    }
.end annotation


# instance fields
.field public final transient c:Lke/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lke/w<",
            "TV;>;"
        }
    .end annotation
.end field

.field public transient d:Lke/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lke/w<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lke/u;ILjava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lke/u<",
            "TK;",
            "Lke/w<",
            "TV;>;>;I",
            "Ljava/util/Comparator<",
            "-TV;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lke/v;-><init>(Lke/u;I)V

    invoke-static {p3}, Lke/x;->g(Ljava/util/Comparator;)Lke/w;

    move-result-object p1

    iput-object p1, p0, Lke/x;->c:Lke/w;

    return-void
.end method

.method public static f()Lke/x$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lke/x$a<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, Lke/x$a;

    invoke-direct {v0}, Lke/x$a;-><init>()V

    return-object v0
.end method

.method public static g(Ljava/util/Comparator;)Lke/w;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TV;>;)",
            "Lke/w<",
            "TV;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    invoke-static {}, Lke/w;->q()Lke/w;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lke/y;->F(Ljava/util/Comparator;)Lke/s0;

    move-result-object p0

    return-object p0
.end method

.method public static i(Ljava/util/Collection;Ljava/util/Comparator;)Lke/x;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/util/Map$Entry<",
            "+TK;+",
            "Ljava/util/Collection<",
            "+TV;>;>;>;",
            "Ljava/util/Comparator<",
            "-TV;>;)",
            "Lke/x<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lke/x;->j()Lke/x;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lke/u$a;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Lke/u$a;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static {p1, v2}, Lke/x;->k(Ljava/util/Comparator;Ljava/util/Collection;)Lke/w;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v0, v3, v2}, Lke/u$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Lke/u$a;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_2
    new-instance p0, Lke/x;

    invoke-virtual {v0}, Lke/u$a;->c()Lke/u;

    move-result-object v0

    invoke-direct {p0, v0, v1, p1}, Lke/x;-><init>(Lke/u;ILjava/util/Comparator;)V

    return-object p0
.end method

.method public static j()Lke/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lke/x<",
            "TK;TV;>;"
        }
    .end annotation

    sget-object v0, Lke/n;->e:Lke/n;

    return-object v0
.end method

.method public static k(Ljava/util/Comparator;Ljava/util/Collection;)Lke/w;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TV;>;",
            "Ljava/util/Collection<",
            "+TV;>;)",
            "Lke/w<",
            "TV;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    invoke-static {p1}, Lke/w;->j(Ljava/util/Collection;)Lke/w;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0, p1}, Lke/y;->C(Ljava/util/Comparator;Ljava/util/Collection;)Lke/y;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public h()Lke/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lke/w<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lke/x;->d:Lke/w;

    if-nez v0, :cond_0

    new-instance v0, Lke/x$b;

    invoke-direct {v0, p0}, Lke/x$b;-><init>(Lke/x;)V

    iput-object v0, p0, Lke/x;->d:Lke/w;

    :cond_0
    return-object v0
.end method
