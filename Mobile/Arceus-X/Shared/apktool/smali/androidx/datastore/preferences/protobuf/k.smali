.class public final Landroidx/datastore/preferences/protobuf/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/t1;


# instance fields
.field public final a:Landroidx/datastore/preferences/protobuf/j;


# direct methods
.method public constructor <init>(Landroidx/datastore/preferences/protobuf/j;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "output"

    invoke-static {p1, v0}, Landroidx/datastore/preferences/protobuf/z;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/datastore/preferences/protobuf/j;

    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    iput-object p0, p1, Landroidx/datastore/preferences/protobuf/j;->a:Landroidx/datastore/preferences/protobuf/k;

    return-void
.end method

.method public static P(Landroidx/datastore/preferences/protobuf/j;)Landroidx/datastore/preferences/protobuf/k;
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/j;->a:Landroidx/datastore/preferences/protobuf/k;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Landroidx/datastore/preferences/protobuf/k;

    invoke-direct {v0, p0}, Landroidx/datastore/preferences/protobuf/k;-><init>(Landroidx/datastore/preferences/protobuf/j;)V

    return-object v0
.end method


# virtual methods
.method public A(ILjava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Landroidx/datastore/preferences/protobuf/e;

    if-eqz v0, :cond_0

    check-cast p2, Landroidx/datastore/preferences/protobuf/e;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->Q(ILandroidx/datastore/preferences/protobuf/e;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->R(ILjava/util/List;Z)V

    return-void
.end method

.method public B(IF)V
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {v0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->x0(IF)V

    return-void
.end method

.method public C(I)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x4

    invoke-virtual {v0, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    return-void
.end method

.method public D(ILjava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Landroidx/datastore/preferences/protobuf/y;

    if-eqz v0, :cond_0

    check-cast p2, Landroidx/datastore/preferences/protobuf/y;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->q0(ILandroidx/datastore/preferences/protobuf/y;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->r0(ILjava/util/List;Z)V

    return-void
.end method

.method public E(II)V
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {v0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->r0(II)V

    return-void
.end method

.method public F(ILjava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Landroidx/datastore/preferences/protobuf/i0;

    if-eqz v0, :cond_0

    check-cast p2, Landroidx/datastore/preferences/protobuf/i0;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->j0(ILandroidx/datastore/preferences/protobuf/i0;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->k0(ILjava/util/List;Z)V

    return-void
.end method

.method public G(ILjava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Landroidx/datastore/preferences/protobuf/l;

    if-eqz v0, :cond_0

    check-cast p2, Landroidx/datastore/preferences/protobuf/l;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->X(ILandroidx/datastore/preferences/protobuf/l;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->Y(ILjava/util/List;Z)V

    return-void
.end method

.method public H(II)V
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {v0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->P0(II)V

    return-void
.end method

.method public I(ILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Landroidx/datastore/preferences/protobuf/g;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/datastore/preferences/protobuf/g;

    invoke-virtual {v1, p1, v2}, Landroidx/datastore/preferences/protobuf/j;->n0(ILandroidx/datastore/preferences/protobuf/g;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public J(ILjava/util/List;Landroidx/datastore/preferences/protobuf/g1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "*>;",
            "Landroidx/datastore/preferences/protobuf/g1;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, p1, v1, p3}, Landroidx/datastore/preferences/protobuf/k;->N(ILjava/lang/Object;Landroidx/datastore/preferences/protobuf/g1;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public K(ILandroidx/datastore/preferences/protobuf/g;)V
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {v0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->n0(ILandroidx/datastore/preferences/protobuf/g;)V

    return-void
.end method

.method public L(ILjava/lang/Object;Landroidx/datastore/preferences/protobuf/g1;)V
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    check-cast p2, Landroidx/datastore/preferences/protobuf/r0;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/j;->H0(ILandroidx/datastore/preferences/protobuf/r0;Landroidx/datastore/preferences/protobuf/g1;)V

    return-void
.end method

.method public M(ILandroidx/datastore/preferences/protobuf/k0$a;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(I",
            "Landroidx/datastore/preferences/protobuf/k0$a<",
            "TK;TV;>;",
            "Ljava/util/Map<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/j;->d0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->V(ILandroidx/datastore/preferences/protobuf/k0$a;Ljava/util/Map;)V

    return-void

    :cond_0
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v2, 0x2

    invoke-virtual {v1, p1, v2}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v2, v3}, Landroidx/datastore/preferences/protobuf/k0;->b(Landroidx/datastore/preferences/protobuf/k0$a;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    iget-object v1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, p2, v2, v0}, Landroidx/datastore/preferences/protobuf/k0;->e(Landroidx/datastore/preferences/protobuf/j;Landroidx/datastore/preferences/protobuf/k0$a;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public N(ILjava/lang/Object;Landroidx/datastore/preferences/protobuf/g1;)V
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    check-cast p2, Landroidx/datastore/preferences/protobuf/r0;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/j;->A0(ILandroidx/datastore/preferences/protobuf/r0;Landroidx/datastore/preferences/protobuf/g1;)V

    return-void
.end method

.method public O(ILjava/util/List;Landroidx/datastore/preferences/protobuf/g1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "*>;",
            "Landroidx/datastore/preferences/protobuf/g1;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, p1, v1, p3}, Landroidx/datastore/preferences/protobuf/k;->L(ILjava/lang/Object;Landroidx/datastore/preferences/protobuf/g1;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final Q(ILandroidx/datastore/preferences/protobuf/e;Z)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/e;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Landroidx/datastore/preferences/protobuf/e;->c(I)Z

    move-result v1

    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->e(Z)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/e;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/e;->c(I)Z

    move-result p3

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->k0(Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/e;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/e;->c(I)Z

    move-result v1

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->j0(IZ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final R(ILjava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->e(Z)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->k0(Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->j0(IZ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final S(IZLjava/lang/Object;Landroidx/datastore/preferences/protobuf/k0$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(IZTV;",
            "Landroidx/datastore/preferences/protobuf/k0$a<",
            "Ljava/lang/Boolean;",
            "TV;>;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {v0, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p4, v0, p3}, Landroidx/datastore/preferences/protobuf/k0;->b(Landroidx/datastore/preferences/protobuf/k0$a;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p1, p4, p2, p3}, Landroidx/datastore/preferences/protobuf/k0;->e(Landroidx/datastore/preferences/protobuf/j;Landroidx/datastore/preferences/protobuf/k0$a;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final T(ILandroidx/datastore/preferences/protobuf/k0$a;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(I",
            "Landroidx/datastore/preferences/protobuf/k0$a<",
            "Ljava/lang/Integer;",
            "TV;>;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "TV;>;)V"
        }
    .end annotation

    invoke-interface {p3}, Ljava/util/Map;->size()I

    move-result v0

    new-array v1, v0, [I

    invoke-interface {p3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    add-int/lit8 v6, v4, 0x1

    aput v5, v1, v4

    move v4, v6

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ljava/util/Arrays;->sort([I)V

    :goto_1
    if-ge v3, v0, :cond_1

    aget v2, v1, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v6, 0x2

    invoke-virtual {v5, p1, v6}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    iget-object v5, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {p2, v6, v4}, Landroidx/datastore/preferences/protobuf/k0;->b(Landroidx/datastore/preferences/protobuf/k0$a;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v6

    invoke-virtual {v5, v6}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    iget-object v5, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v5, p2, v2, v4}, Landroidx/datastore/preferences/protobuf/k0;->e(Landroidx/datastore/preferences/protobuf/j;Landroidx/datastore/preferences/protobuf/k0$a;Ljava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final U(ILandroidx/datastore/preferences/protobuf/k0$a;Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(I",
            "Landroidx/datastore/preferences/protobuf/k0$a<",
            "Ljava/lang/Long;",
            "TV;>;",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "TV;>;)V"
        }
    .end annotation

    invoke-interface {p3}, Ljava/util/Map;->size()I

    move-result v0

    new-array v1, v0, [J

    invoke-interface {p3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    add-int/lit8 v7, v4, 0x1

    aput-wide v5, v1, v4

    move v4, v7

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ljava/util/Arrays;->sort([J)V

    :goto_1
    if-ge v3, v0, :cond_1

    aget-wide v4, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {p3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iget-object v6, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v7, 0x2

    invoke-virtual {v6, p1, v7}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    iget-object v6, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-static {p2, v7, v2}, Landroidx/datastore/preferences/protobuf/k0;->b(Landroidx/datastore/preferences/protobuf/k0$a;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v7

    invoke-virtual {v6, v7}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    iget-object v6, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v6, p2, v4, v2}, Landroidx/datastore/preferences/protobuf/k0;->e(Landroidx/datastore/preferences/protobuf/j;Landroidx/datastore/preferences/protobuf/k0$a;Ljava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final V(ILandroidx/datastore/preferences/protobuf/k0$a;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(I",
            "Landroidx/datastore/preferences/protobuf/k0$a<",
            "TK;TV;>;",
            "Ljava/util/Map<",
            "TK;TV;>;)V"
        }
    .end annotation

    sget-object v0, Landroidx/datastore/preferences/protobuf/k$a;->a:[I

    iget-object v1, p2, Landroidx/datastore/preferences/protobuf/k0$a;->a:Landroidx/datastore/preferences/protobuf/s1$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "does not support key type: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p2, Landroidx/datastore/preferences/protobuf/k0$a;->a:Landroidx/datastore/preferences/protobuf/s1$b;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->W(ILandroidx/datastore/preferences/protobuf/k0$a;Ljava/util/Map;)V

    return-void

    :pswitch_1
    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->U(ILandroidx/datastore/preferences/protobuf/k0$a;Ljava/util/Map;)V

    return-void

    :pswitch_2
    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->T(ILandroidx/datastore/preferences/protobuf/k0$a;Ljava/util/Map;)V

    return-void

    :pswitch_3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0, p2}, Landroidx/datastore/preferences/protobuf/k;->S(IZLjava/lang/Object;Landroidx/datastore/preferences/protobuf/k0$a;)V

    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0, p3, p2}, Landroidx/datastore/preferences/protobuf/k;->S(IZLjava/lang/Object;Landroidx/datastore/preferences/protobuf/k0$a;)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final W(ILandroidx/datastore/preferences/protobuf/k0$a;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(I",
            "Landroidx/datastore/preferences/protobuf/k0$a<",
            "Ljava/lang/String;",
            "TV;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "TV;>;)V"
        }
    .end annotation

    invoke-interface {p3}, Ljava/util/Map;->size()I

    move-result v0

    new-array v1, v0, [Ljava/lang/String;

    invoke-interface {p3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    add-int/lit8 v6, v4, 0x1

    aput-object v5, v1, v4

    move v4, v6

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    :goto_1
    if-ge v3, v0, :cond_1

    aget-object v2, v1, v3

    invoke-interface {p3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v6, 0x2

    invoke-virtual {v5, p1, v6}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    iget-object v5, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-static {p2, v2, v4}, Landroidx/datastore/preferences/protobuf/k0;->b(Landroidx/datastore/preferences/protobuf/k0$a;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v6

    invoke-virtual {v5, v6}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    iget-object v5, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-static {v5, p2, v2, v4}, Landroidx/datastore/preferences/protobuf/k0;->e(Landroidx/datastore/preferences/protobuf/j;Landroidx/datastore/preferences/protobuf/k0$a;Ljava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final X(ILandroidx/datastore/preferences/protobuf/l;Z)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/l;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Landroidx/datastore/preferences/protobuf/l;->c(I)D

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/datastore/preferences/protobuf/j;->j(D)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/l;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/l;->c(I)D

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Landroidx/datastore/preferences/protobuf/j;->q0(D)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/l;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/l;->c(I)D

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Landroidx/datastore/preferences/protobuf/j;->p0(ID)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final Y(ILjava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;Z)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/datastore/preferences/protobuf/j;->j(D)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Landroidx/datastore/preferences/protobuf/j;->q0(D)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Landroidx/datastore/preferences/protobuf/j;->p0(ID)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final Z(ILandroidx/datastore/preferences/protobuf/y;Z)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/y;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Landroidx/datastore/preferences/protobuf/y;->h(I)I

    move-result v1

    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->l(I)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/y;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/y;->h(I)I

    move-result p3

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->s0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/y;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/y;->h(I)I

    move-result v1

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->r0(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public a(ILjava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Landroidx/datastore/preferences/protobuf/v;

    if-eqz v0, :cond_0

    check-cast p2, Landroidx/datastore/preferences/protobuf/v;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->f0(ILandroidx/datastore/preferences/protobuf/v;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->g0(ILjava/util/List;Z)V

    return-void
.end method

.method public final a0(ILjava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->l(I)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->s0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->r0(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final b(ILjava/lang/Object;)V
    .locals 1

    instance-of v0, p2, Landroidx/datastore/preferences/protobuf/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    check-cast p2, Landroidx/datastore/preferences/protobuf/g;

    invoke-virtual {v0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->K0(ILandroidx/datastore/preferences/protobuf/g;)V

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    check-cast p2, Landroidx/datastore/preferences/protobuf/r0;

    invoke-virtual {v0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->J0(ILandroidx/datastore/preferences/protobuf/r0;)V

    return-void
.end method

.method public final b0(ILandroidx/datastore/preferences/protobuf/y;Z)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/y;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Landroidx/datastore/preferences/protobuf/y;->h(I)I

    move-result v1

    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->n(I)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/y;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/y;->h(I)I

    move-result p3

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->u0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/y;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/y;->h(I)I

    move-result v1

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->t0(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public c(II)V
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {v0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->t0(II)V

    return-void
.end method

.method public final c0(ILjava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->n(I)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->u0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->t0(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public d(ILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p2, Landroidx/datastore/preferences/protobuf/e0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Landroidx/datastore/preferences/protobuf/e0;

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {v0, v1}, Landroidx/datastore/preferences/protobuf/e0;->q(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, p1, v2}, Landroidx/datastore/preferences/protobuf/k;->l0(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, p1, v2}, Landroidx/datastore/preferences/protobuf/j;->T0(ILjava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final d0(ILandroidx/datastore/preferences/protobuf/i0;Z)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/i0;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(I)J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/datastore/preferences/protobuf/j;->p(J)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/i0;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/i0;->h(I)J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Landroidx/datastore/preferences/protobuf/j;->w0(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/i0;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/i0;->h(I)J

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Landroidx/datastore/preferences/protobuf/j;->v0(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public e(ILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {v0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->T0(ILjava/lang/String;)V

    return-void
.end method

.method public final e0(ILjava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;Z)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/datastore/preferences/protobuf/j;->p(J)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Landroidx/datastore/preferences/protobuf/j;->w0(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Landroidx/datastore/preferences/protobuf/j;->v0(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public f(IJ)V
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/j;->Y0(IJ)V

    return-void
.end method

.method public final f0(ILandroidx/datastore/preferences/protobuf/v;Z)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/v;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Landroidx/datastore/preferences/protobuf/v;->c(I)F

    move-result v1

    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->r(F)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/v;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/v;->c(I)F

    move-result p3

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->y0(F)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/v;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/v;->c(I)F

    move-result v1

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->x0(IF)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public g(ILjava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Landroidx/datastore/preferences/protobuf/y;

    if-eqz v0, :cond_0

    check-cast p2, Landroidx/datastore/preferences/protobuf/y;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->h0(ILandroidx/datastore/preferences/protobuf/y;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->i0(ILjava/util/List;Z)V

    return-void
.end method

.method public final g0(ILjava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;Z)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->r(F)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p3

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->y0(F)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->x0(IF)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public h(II)V
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {v0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->D0(II)V

    return-void
.end method

.method public final h0(ILandroidx/datastore/preferences/protobuf/y;Z)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/y;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Landroidx/datastore/preferences/protobuf/y;->h(I)I

    move-result v1

    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->w(I)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/y;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/y;->h(I)I

    move-result p3

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->E0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/y;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/y;->h(I)I

    move-result v1

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->D0(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public i(IJ)V
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/j;->N0(IJ)V

    return-void
.end method

.method public final i0(ILjava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->w(I)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->E0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->D0(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public j(ILjava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Landroidx/datastore/preferences/protobuf/y;

    if-eqz v0, :cond_0

    check-cast p2, Landroidx/datastore/preferences/protobuf/y;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->b0(ILandroidx/datastore/preferences/protobuf/y;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->c0(ILjava/util/List;Z)V

    return-void
.end method

.method public final j0(ILandroidx/datastore/preferences/protobuf/i0;Z)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/i0;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(I)J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/datastore/preferences/protobuf/j;->y(J)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/i0;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/i0;->h(I)J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Landroidx/datastore/preferences/protobuf/j;->G0(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/i0;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/i0;->h(I)J

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Landroidx/datastore/preferences/protobuf/j;->F0(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public k(ILjava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Landroidx/datastore/preferences/protobuf/y;

    if-eqz v0, :cond_0

    check-cast p2, Landroidx/datastore/preferences/protobuf/y;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->u0(ILandroidx/datastore/preferences/protobuf/y;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->v0(ILjava/util/List;Z)V

    return-void
.end method

.method public final k0(ILjava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;Z)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/datastore/preferences/protobuf/j;->y(J)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Landroidx/datastore/preferences/protobuf/j;->G0(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Landroidx/datastore/preferences/protobuf/j;->F0(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public l(ILjava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Landroidx/datastore/preferences/protobuf/i0;

    if-eqz v0, :cond_0

    check-cast p2, Landroidx/datastore/preferences/protobuf/i0;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->s0(ILandroidx/datastore/preferences/protobuf/i0;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->t0(ILjava/util/List;Z)V

    return-void
.end method

.method public final l0(ILjava/lang/Object;)V
    .locals 1

    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->T0(ILjava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    check-cast p2, Landroidx/datastore/preferences/protobuf/g;

    invoke-virtual {v0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->n0(ILandroidx/datastore/preferences/protobuf/g;)V

    return-void
.end method

.method public m(IJ)V
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/j;->R0(IJ)V

    return-void
.end method

.method public final m0(ILandroidx/datastore/preferences/protobuf/y;Z)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/y;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Landroidx/datastore/preferences/protobuf/y;->h(I)I

    move-result v1

    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->L(I)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/y;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/y;->h(I)I

    move-result p3

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->M0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/y;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/y;->h(I)I

    move-result v1

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->L0(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public n(ILjava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Landroidx/datastore/preferences/protobuf/y;

    if-eqz v0, :cond_0

    check-cast p2, Landroidx/datastore/preferences/protobuf/y;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->Z(ILandroidx/datastore/preferences/protobuf/y;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->a0(ILjava/util/List;Z)V

    return-void
.end method

.method public final n0(ILjava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->L(I)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->M0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->L0(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public o(II)V
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {v0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->W0(II)V

    return-void
.end method

.method public final o0(ILandroidx/datastore/preferences/protobuf/i0;Z)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/i0;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(I)J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/datastore/preferences/protobuf/j;->N(J)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/i0;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/i0;->h(I)J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Landroidx/datastore/preferences/protobuf/j;->O0(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/i0;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/i0;->h(I)J

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Landroidx/datastore/preferences/protobuf/j;->N0(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public p(ID)V
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/j;->p0(ID)V

    return-void
.end method

.method public final p0(ILjava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;Z)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/datastore/preferences/protobuf/j;->N(J)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Landroidx/datastore/preferences/protobuf/j;->O0(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Landroidx/datastore/preferences/protobuf/j;->N0(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public q(ILjava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Landroidx/datastore/preferences/protobuf/i0;

    if-eqz v0, :cond_0

    check-cast p2, Landroidx/datastore/preferences/protobuf/i0;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->o0(ILandroidx/datastore/preferences/protobuf/i0;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->p0(ILjava/util/List;Z)V

    return-void
.end method

.method public final q0(ILandroidx/datastore/preferences/protobuf/y;Z)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/y;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Landroidx/datastore/preferences/protobuf/y;->h(I)I

    move-result v1

    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->P(I)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/y;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/y;->h(I)I

    move-result p3

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->Q0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/y;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/y;->h(I)I

    move-result v1

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->P0(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public r(ILjava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Landroidx/datastore/preferences/protobuf/i0;

    if-eqz v0, :cond_0

    check-cast p2, Landroidx/datastore/preferences/protobuf/i0;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->w0(ILandroidx/datastore/preferences/protobuf/i0;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->x0(ILjava/util/List;Z)V

    return-void
.end method

.method public r0(ILjava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->P(I)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->Q0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->P0(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public s(IJ)V
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/j;->v0(IJ)V

    return-void
.end method

.method public final s0(ILandroidx/datastore/preferences/protobuf/i0;Z)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/i0;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(I)J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/datastore/preferences/protobuf/j;->R(J)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/i0;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/i0;->h(I)J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Landroidx/datastore/preferences/protobuf/j;->S0(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/i0;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/i0;->h(I)J

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Landroidx/datastore/preferences/protobuf/j;->R0(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public t()Landroidx/datastore/preferences/protobuf/t1$a;
    .locals 1

    sget-object v0, Landroidx/datastore/preferences/protobuf/t1$a;->a:Landroidx/datastore/preferences/protobuf/t1$a;

    return-object v0
.end method

.method public final t0(ILjava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;Z)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/datastore/preferences/protobuf/j;->R(J)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Landroidx/datastore/preferences/protobuf/j;->S0(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Landroidx/datastore/preferences/protobuf/j;->R0(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public u(IJ)V
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/j;->F0(IJ)V

    return-void
.end method

.method public final u0(ILandroidx/datastore/preferences/protobuf/y;Z)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/y;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Landroidx/datastore/preferences/protobuf/y;->h(I)I

    move-result v1

    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->W(I)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/y;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/y;->h(I)I

    move-result p3

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/y;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/y;->h(I)I

    move-result v1

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->W0(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public v(IZ)V
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {v0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->j0(IZ)V

    return-void
.end method

.method public v0(ILjava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Landroidx/datastore/preferences/protobuf/j;->W(I)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->W0(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public w(II)V
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {v0, p1, p2}, Landroidx/datastore/preferences/protobuf/j;->L0(II)V

    return-void
.end method

.method public final w0(ILandroidx/datastore/preferences/protobuf/i0;Z)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/i0;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Landroidx/datastore/preferences/protobuf/i0;->h(I)J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/datastore/preferences/protobuf/j;->Y(J)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/i0;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/i0;->h(I)J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Landroidx/datastore/preferences/protobuf/j;->Z0(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Landroidx/datastore/preferences/protobuf/i0;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p2, v0}, Landroidx/datastore/preferences/protobuf/i0;->h(I)J

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Landroidx/datastore/preferences/protobuf/j;->Y0(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public x(I)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    return-void
.end method

.method public final x0(ILjava/util/List;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;Z)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Landroidx/datastore/preferences/protobuf/j;->V0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/datastore/preferences/protobuf/j;->Y(J)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-virtual {p1, p3}, Landroidx/datastore/preferences/protobuf/j;->X0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Landroidx/datastore/preferences/protobuf/j;->Z0(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Landroidx/datastore/preferences/protobuf/k;->a:Landroidx/datastore/preferences/protobuf/j;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Landroidx/datastore/preferences/protobuf/j;->Y0(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public y(ILjava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Landroidx/datastore/preferences/protobuf/i0;

    if-eqz v0, :cond_0

    check-cast p2, Landroidx/datastore/preferences/protobuf/i0;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->d0(ILandroidx/datastore/preferences/protobuf/i0;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->e0(ILjava/util/List;Z)V

    return-void
.end method

.method public z(ILjava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    instance-of v0, p2, Landroidx/datastore/preferences/protobuf/y;

    if-eqz v0, :cond_0

    check-cast p2, Landroidx/datastore/preferences/protobuf/y;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->m0(ILandroidx/datastore/preferences/protobuf/y;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/k;->n0(ILjava/util/List;Z)V

    return-void
.end method
