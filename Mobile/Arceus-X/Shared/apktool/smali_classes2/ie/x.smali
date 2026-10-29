.class public Lie/x;
.super Lie/v;
.source "SourceFile"

# interfaces
.implements Lie/g0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lie/x$b;,
        Lie/x$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lie/v<",
        "TK;TV;>;",
        "Lie/g0;"
    }
.end annotation


# instance fields
.field public final transient c:Lie/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lie/w<",
            "TV;>;"
        }
    .end annotation
.end field

.field public transient d:Lie/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lie/w<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lie/u;ILjava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lie/u<",
            "TK;",
            "Lie/w<",
            "TV;>;>;I",
            "Ljava/util/Comparator<",
            "-TV;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lie/v;-><init>(Lie/u;I)V

    invoke-static {p3}, Lie/x;->g(Ljava/util/Comparator;)Lie/w;

    move-result-object p1

    iput-object p1, p0, Lie/x;->c:Lie/w;

    return-void
.end method

.method public static f()Lie/x$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lie/x$a<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, Lie/x$a;

    invoke-direct {v0}, Lie/x$a;-><init>()V

    return-object v0
.end method

.method public static g(Ljava/util/Comparator;)Lie/w;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TV;>;)",
            "Lie/w<",
            "TV;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    invoke-static {}, Lie/w;->t()Lie/w;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lie/y;->F(Ljava/util/Comparator;)Lie/s0;

    move-result-object p0

    return-object p0
.end method

.method public static i(Ljava/util/Collection;Ljava/util/Comparator;)Lie/x;
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
            "Lie/x<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lie/x;->j()Lie/x;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lie/u$a;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Lie/u$a;-><init>(I)V

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

    invoke-static {p1, v2}, Lie/x;->k(Ljava/util/Comparator;Ljava/util/Collection;)Lie/w;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v0, v3, v2}, Lie/u$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Lie/u$a;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_2
    new-instance p0, Lie/x;

    invoke-virtual {v0}, Lie/u$a;->c()Lie/u;

    move-result-object v0

    invoke-direct {p0, v0, v1, p1}, Lie/x;-><init>(Lie/u;ILjava/util/Comparator;)V

    return-object p0
.end method

.method public static j()Lie/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lie/x<",
            "TK;TV;>;"
        }
    .end annotation

    sget-object v0, Lie/n;->e:Lie/n;

    return-object v0
.end method

.method public static k(Ljava/util/Comparator;Ljava/util/Collection;)Lie/w;
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
            "Lie/w<",
            "TV;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    invoke-static {p1}, Lie/w;->k(Ljava/util/Collection;)Lie/w;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0, p1}, Lie/y;->C(Ljava/util/Comparator;Ljava/util/Collection;)Lie/y;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public h()Lie/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lie/w<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lie/x;->d:Lie/w;

    if-nez v0, :cond_0

    new-instance v0, Lie/x$b;

    invoke-direct {v0, p0}, Lie/x$b;-><init>(Lie/x;)V

    iput-object v0, p0, Lie/x;->d:Lie/w;

    :cond_0
    return-object v0
.end method
