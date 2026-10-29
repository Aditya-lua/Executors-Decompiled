.class public abstract Lie/y;
.super Lie/z;
.source "SourceFile"

# interfaces
.implements Ljava/util/NavigableSet;
.implements Lie/v0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lie/z<",
        "TE;>;",
        "Ljava/util/NavigableSet<",
        "TE;>;",
        "Lie/v0<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final transient c:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "-TE;>;"
        }
    .end annotation
.end field

.field public transient d:Lie/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lie/y<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "-TE;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lie/z;-><init>()V

    iput-object p1, p0, Lie/y;->c:Ljava/util/Comparator;

    return-void
.end method

.method public static varargs A(Ljava/util/Comparator;I[Ljava/lang/Object;)Lie/y;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TE;>;I[TE;)",
            "Lie/y<",
            "TE;>;"
        }
    .end annotation

    if-nez p1, :cond_0

    invoke-static {p0}, Lie/y;->F(Ljava/util/Comparator;)Lie/s0;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p2, p1}, Lie/l0;->c([Ljava/lang/Object;I)[Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-static {p2, v0, p1, p0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    const/4 v0, 0x1

    move v1, v0

    :goto_0
    if-ge v0, p1, :cond_2

    aget-object v2, p2, v0

    add-int/lit8 v3, v1, -0x1

    aget-object v3, p2, v3

    invoke-interface {p0, v2, v3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v3, v1, 0x1

    aput-object v2, p2, v1

    move v1, v3

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    invoke-static {p2, v1, p1, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    array-length p1, p2

    div-int/lit8 p1, p1, 0x2

    if-ge v1, p1, :cond_3

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    :cond_3
    new-instance p1, Lie/s0;

    invoke-static {p2, v1}, Lie/t;->i([Ljava/lang/Object;I)Lie/t;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Lie/s0;-><init>(Lie/t;Ljava/util/Comparator;)V

    return-object p1
.end method

.method public static B(Ljava/util/Comparator;Ljava/lang/Iterable;)Lie/y;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TE;>;",
            "Ljava/lang/Iterable<",
            "+TE;>;)",
            "Lie/y<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p0}, Lhe/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0, p1}, Lie/w0;->b(Ljava/util/Comparator;Ljava/lang/Iterable;)Z

    move-result v0

    if-eqz v0, :cond_0

    instance-of v0, p1, Lie/y;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lie/y;

    invoke-virtual {v0}, Lie/r;->f()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {p1}, Lie/a0;->b(Ljava/lang/Iterable;)[Ljava/lang/Object;

    move-result-object p1

    array-length v0, p1

    invoke-static {p0, v0, p1}, Lie/y;->A(Ljava/util/Comparator;I[Ljava/lang/Object;)Lie/y;

    move-result-object p0

    return-object p0
.end method

.method public static C(Ljava/util/Comparator;Ljava/util/Collection;)Lie/y;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TE;>;",
            "Ljava/util/Collection<",
            "+TE;>;)",
            "Lie/y<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lie/y;->B(Ljava/util/Comparator;Ljava/lang/Iterable;)Lie/y;

    move-result-object p0

    return-object p0
.end method

.method public static F(Ljava/util/Comparator;)Lie/s0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TE;>;)",
            "Lie/s0<",
            "TE;>;"
        }
    .end annotation

    invoke-static {}, Lie/m0;->c()Lie/m0;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lie/s0;->f:Lie/s0;

    return-object p0

    :cond_0
    new-instance v0, Lie/s0;

    invoke-static {}, Lie/t;->z()Lie/t;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lie/s0;-><init>(Lie/t;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public static Q(Ljava/util/Comparator;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")I"
        }
    .end annotation

    invoke-interface {p0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public abstract D()Lie/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lie/y<",
            "TE;>;"
        }
    .end annotation
.end method

.method public E()Lie/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lie/y<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, Lie/y;->d:Lie/y;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lie/y;->D()Lie/y;

    move-result-object v0

    iput-object v0, p0, Lie/y;->d:Lie/y;

    iput-object p0, v0, Lie/y;->d:Lie/y;

    :cond_0
    return-object v0
.end method

.method public G(Ljava/lang/Object;)Lie/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lie/y<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lie/y;->H(Ljava/lang/Object;Z)Lie/y;

    move-result-object p1

    return-object p1
.end method

.method public H(Ljava/lang/Object;Z)Lie/y;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;Z)",
            "Lie/y<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p1}, Lhe/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lie/y;->I(Ljava/lang/Object;Z)Lie/y;

    move-result-object p1

    return-object p1
.end method

.method public abstract I(Ljava/lang/Object;Z)Lie/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;Z)",
            "Lie/y<",
            "TE;>;"
        }
    .end annotation
.end method

.method public J(Ljava/lang/Object;Ljava/lang/Object;)Lie/y;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;TE;)",
            "Lie/y<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, p2, v1}, Lie/y;->K(Ljava/lang/Object;ZLjava/lang/Object;Z)Lie/y;

    move-result-object p1

    return-object p1
.end method

.method public K(Ljava/lang/Object;ZLjava/lang/Object;Z)Lie/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;ZTE;Z)",
            "Lie/y<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p1}, Lhe/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lhe/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lie/y;->c:Ljava/util/Comparator;

    invoke-interface {v0, p1, p3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lhe/n;->d(Z)V

    invoke-virtual {p0, p1, p2, p3, p4}, Lie/y;->L(Ljava/lang/Object;ZLjava/lang/Object;Z)Lie/y;

    move-result-object p1

    return-object p1
.end method

.method public abstract L(Ljava/lang/Object;ZLjava/lang/Object;Z)Lie/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;ZTE;Z)",
            "Lie/y<",
            "TE;>;"
        }
    .end annotation
.end method

.method public M(Ljava/lang/Object;)Lie/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lie/y<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lie/y;->N(Ljava/lang/Object;Z)Lie/y;

    move-result-object p1

    return-object p1
.end method

.method public N(Ljava/lang/Object;Z)Lie/y;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;Z)",
            "Lie/y<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p1}, Lhe/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lie/y;->O(Ljava/lang/Object;Z)Lie/y;

    move-result-object p1

    return-object p1
.end method

.method public abstract O(Ljava/lang/Object;Z)Lie/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;Z)",
            "Lie/y<",
            "TE;>;"
        }
    .end annotation
.end method

.method public P(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lie/y;->c:Ljava/util/Comparator;

    invoke-static {v0, p1, p2}, Lie/y;->Q(Ljava/util/Comparator;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public comparator()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator<",
            "-TE;>;"
        }
    .end annotation

    iget-object v0, p0, Lie/y;->c:Ljava/util/Comparator;

    return-object v0
.end method

.method public bridge synthetic descendingSet()Ljava/util/NavigableSet;
    .locals 1

    invoke-virtual {p0}, Lie/y;->E()Lie/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic headSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lie/y;->H(Ljava/lang/Object;Z)Lie/y;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lie/y;->G(Ljava/lang/Object;)Lie/y;

    move-result-object p1

    return-object p1
.end method

.method public final pollFirst()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final pollLast()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public bridge synthetic subSet(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lie/y;->K(Ljava/lang/Object;ZLjava/lang/Object;Z)Lie/y;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lie/y;->J(Ljava/lang/Object;Ljava/lang/Object;)Lie/y;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic tailSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lie/y;->N(Ljava/lang/Object;Z)Lie/y;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lie/y;->M(Ljava/lang/Object;)Lie/y;

    move-result-object p1

    return-object p1
.end method
