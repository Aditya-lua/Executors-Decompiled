.class public final Lcom/google/crypto/tink/shaded/protobuf/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/t1;


# instance fields
.field public final a:Lcom/google/crypto/tink/shaded/protobuf/k;


# direct methods
.method public constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/k;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "output"

    invoke-static {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/a0;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/k;

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    iput-object p0, p1, Lcom/google/crypto/tink/shaded/protobuf/k;->a:Lcom/google/crypto/tink/shaded/protobuf/l;

    return-void
.end method

.method public static P(Lcom/google/crypto/tink/shaded/protobuf/k;)Lcom/google/crypto/tink/shaded/protobuf/l;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k;->a:Lcom/google/crypto/tink/shaded/protobuf/l;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-direct {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/l;-><init>(Lcom/google/crypto/tink/shaded/protobuf/k;)V

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

    instance-of v0, p2, Lcom/google/crypto/tink/shaded/protobuf/f;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/f;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->Q(ILcom/google/crypto/tink/shaded/protobuf/f;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->R(ILjava/util/List;Z)V

    return-void
.end method

.method public B(IF)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k;->u0(IF)V

    return-void
.end method

.method public C(I)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x4

    invoke-virtual {v0, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

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

    instance-of v0, p2, Lcom/google/crypto/tink/shaded/protobuf/z;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/z;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->m0(ILcom/google/crypto/tink/shaded/protobuf/z;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->n0(ILjava/util/List;Z)V

    return-void
.end method

.method public E(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k;->o0(II)V

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

    instance-of v0, p2, Lcom/google/crypto/tink/shaded/protobuf/j0;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/j0;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->f0(ILcom/google/crypto/tink/shaded/protobuf/j0;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->g0(ILjava/util/List;Z)V

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

    instance-of v0, p2, Lcom/google/crypto/tink/shaded/protobuf/m;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/m;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->T(ILcom/google/crypto/tink/shaded/protobuf/m;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->U(ILjava/util/List;Z)V

    return-void
.end method

.method public H(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k;->J0(II)V

    return-void
.end method

.method public I(ILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/google/crypto/tink/shaded/protobuf/h;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v1, p1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->l0(ILcom/google/crypto/tink/shaded/protobuf/h;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public J(ILcom/google/crypto/tink/shaded/protobuf/l0$a;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(I",
            "Lcom/google/crypto/tink/shaded/protobuf/l0$a<",
            "TK;TV;>;",
            "Ljava/util/Map<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/k;->d0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->S(ILcom/google/crypto/tink/shaded/protobuf/l0$a;Ljava/util/Map;)V

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

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v2, 0x2

    invoke-virtual {v1, p1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v2, v3}, Lcom/google/crypto/tink/shaded/protobuf/l0;->b(Lcom/google/crypto/tink/shaded/protobuf/l0$a;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, p2, v2, v0}, Lcom/google/crypto/tink/shaded/protobuf/l0;->d(Lcom/google/crypto/tink/shaded/protobuf/k;Lcom/google/crypto/tink/shaded/protobuf/l0$a;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public K(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/g1;)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/s0;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->w0(ILcom/google/crypto/tink/shaded/protobuf/s0;Lcom/google/crypto/tink/shaded/protobuf/g1;)V

    return-void
.end method

.method public L(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/g1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/g1;",
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

    invoke-virtual {p0, p1, v1, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->N(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/g1;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public M(ILcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k;->l0(ILcom/google/crypto/tink/shaded/protobuf/h;)V

    return-void
.end method

.method public N(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/g1;)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/s0;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->C0(ILcom/google/crypto/tink/shaded/protobuf/s0;Lcom/google/crypto/tink/shaded/protobuf/g1;)V

    return-void
.end method

.method public O(ILjava/util/List;Lcom/google/crypto/tink/shaded/protobuf/g1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "*>;",
            "Lcom/google/crypto/tink/shaded/protobuf/g1;",
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

    invoke-virtual {p0, p1, v1, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->K(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/g1;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final Q(ILcom/google/crypto/tink/shaded/protobuf/f;Z)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/f;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/f;->h(I)Z

    move-result v1

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->e(Z)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/f;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/f;->h(I)Z

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->k0(Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/f;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/f;->h(I)Z

    move-result v1

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->j0(IZ)V

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

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

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

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->e(Z)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->k0(Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->j0(IZ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final S(ILcom/google/crypto/tink/shaded/protobuf/l0$a;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(I",
            "Lcom/google/crypto/tink/shaded/protobuf/l0$a<",
            "TK;TV;>;",
            "Ljava/util/Map<",
            "TK;TV;>;)V"
        }
    .end annotation

    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/l$a;->a:[I

    const/4 p1, 0x0

    throw p1
.end method

.method public final T(ILcom/google/crypto/tink/shaded/protobuf/m;Z)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/m;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/m;->h(I)D

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->j(D)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/m;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/m;->h(I)D

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->n0(D)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/m;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/m;->h(I)D

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->m0(ID)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final U(ILjava/util/List;Z)V
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

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

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

    invoke-static {v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->j(D)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->n0(D)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->m0(ID)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final V(ILcom/google/crypto/tink/shaded/protobuf/z;Z)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/z;->h(I)I

    move-result v1

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->l(I)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->h(I)I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->p0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->h(I)I

    move-result v1

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->o0(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final W(ILjava/util/List;Z)V
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

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

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

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->l(I)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->p0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->o0(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final X(ILcom/google/crypto/tink/shaded/protobuf/z;Z)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/z;->h(I)I

    move-result v1

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->n(I)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->h(I)I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->r0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->h(I)I

    move-result v1

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->q0(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final Y(ILjava/util/List;Z)V
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

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

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

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->n(I)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->r0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->q0(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final Z(ILcom/google/crypto/tink/shaded/protobuf/j0;Z)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/j0;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/j0;->h(I)J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->p(J)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/j0;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/j0;->h(I)J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->t0(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/j0;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/j0;->h(I)J

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->s0(IJ)V

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

    instance-of v0, p2, Lcom/google/crypto/tink/shaded/protobuf/w;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/w;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->b0(ILcom/google/crypto/tink/shaded/protobuf/w;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->c0(ILjava/util/List;Z)V

    return-void
.end method

.method public final a0(ILjava/util/List;Z)V
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

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

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

    invoke-static {v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->p(J)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->t0(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->s0(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final b(ILjava/lang/Object;)V
    .locals 1

    instance-of v0, p2, Lcom/google/crypto/tink/shaded/protobuf/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k;->E0(ILcom/google/crypto/tink/shaded/protobuf/h;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/s0;

    invoke-virtual {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k;->D0(ILcom/google/crypto/tink/shaded/protobuf/s0;)V

    return-void
.end method

.method public final b0(ILcom/google/crypto/tink/shaded/protobuf/w;Z)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/w;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/w;->h(I)F

    move-result v1

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->r(F)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/w;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->h(I)F

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->v0(F)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/w;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/w;->h(I)F

    move-result v1

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->u0(IF)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public c(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k;->q0(II)V

    return-void
.end method

.method public final c0(ILjava/util/List;Z)V
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

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

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

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->r(F)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->v0(F)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->u0(IF)V

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

    instance-of v0, p2, Lcom/google/crypto/tink/shaded/protobuf/f0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/f0;

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/f0;->q(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, p1, v2}, Lcom/google/crypto/tink/shaded/protobuf/l;->h0(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, p1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->N0(ILjava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final d0(ILcom/google/crypto/tink/shaded/protobuf/z;Z)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/z;->h(I)I

    move-result v1

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->w(I)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->h(I)I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->z0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->h(I)I

    move-result v1

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->y0(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public e(ILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k;->N0(ILjava/lang/String;)V

    return-void
.end method

.method public final e0(ILjava/util/List;Z)V
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

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

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

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->w(I)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->z0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->y0(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public f(IJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->R0(IJ)V

    return-void
.end method

.method public final f0(ILcom/google/crypto/tink/shaded/protobuf/j0;Z)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/j0;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/j0;->h(I)J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->y(J)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/j0;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/j0;->h(I)J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->B0(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/j0;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/j0;->h(I)J

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->A0(IJ)V

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

    instance-of v0, p2, Lcom/google/crypto/tink/shaded/protobuf/z;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/z;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->d0(ILcom/google/crypto/tink/shaded/protobuf/z;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->e0(ILjava/util/List;Z)V

    return-void
.end method

.method public final g0(ILjava/util/List;Z)V
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

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

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

    invoke-static {v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->y(J)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->B0(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->A0(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public h(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k;->y0(II)V

    return-void
.end method

.method public final h0(ILjava/lang/Object;)V
    .locals 1

    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k;->N0(ILjava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/h;

    invoke-virtual {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k;->l0(ILcom/google/crypto/tink/shaded/protobuf/h;)V

    return-void
.end method

.method public i(IJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->H0(IJ)V

    return-void
.end method

.method public final i0(ILcom/google/crypto/tink/shaded/protobuf/z;Z)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/z;->h(I)I

    move-result v1

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->L(I)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->h(I)I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->G0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->h(I)I

    move-result v1

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->F0(II)V

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

    instance-of v0, p2, Lcom/google/crypto/tink/shaded/protobuf/z;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/z;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->X(ILcom/google/crypto/tink/shaded/protobuf/z;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->Y(ILjava/util/List;Z)V

    return-void
.end method

.method public final j0(ILjava/util/List;Z)V
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

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

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

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->L(I)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->G0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->F0(II)V

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

    instance-of v0, p2, Lcom/google/crypto/tink/shaded/protobuf/z;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/z;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->q0(ILcom/google/crypto/tink/shaded/protobuf/z;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->r0(ILjava/util/List;Z)V

    return-void
.end method

.method public final k0(ILcom/google/crypto/tink/shaded/protobuf/j0;Z)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/j0;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/j0;->h(I)J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->N(J)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/j0;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/j0;->h(I)J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->I0(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/j0;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/j0;->h(I)J

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->H0(IJ)V

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

    instance-of v0, p2, Lcom/google/crypto/tink/shaded/protobuf/j0;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/j0;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->o0(ILcom/google/crypto/tink/shaded/protobuf/j0;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->p0(ILjava/util/List;Z)V

    return-void
.end method

.method public final l0(ILjava/util/List;Z)V
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

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

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

    invoke-static {v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->N(J)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->I0(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->H0(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public m(IJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->L0(IJ)V

    return-void
.end method

.method public final m0(ILcom/google/crypto/tink/shaded/protobuf/z;Z)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/z;->h(I)I

    move-result v1

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->P(I)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->h(I)I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->K0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->h(I)I

    move-result v1

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->J0(II)V

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

    instance-of v0, p2, Lcom/google/crypto/tink/shaded/protobuf/z;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/z;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->V(ILcom/google/crypto/tink/shaded/protobuf/z;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->W(ILjava/util/List;Z)V

    return-void
.end method

.method public n0(ILjava/util/List;Z)V
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

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

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

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->P(I)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->K0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->J0(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public o(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k;->P0(II)V

    return-void
.end method

.method public final o0(ILcom/google/crypto/tink/shaded/protobuf/j0;Z)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/j0;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/j0;->h(I)J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->R(J)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/j0;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/j0;->h(I)J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->M0(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/j0;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/j0;->h(I)J

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->L0(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public p(ID)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->m0(ID)V

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

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

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

    invoke-static {v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->R(J)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->M0(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->L0(IJ)V

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

    instance-of v0, p2, Lcom/google/crypto/tink/shaded/protobuf/j0;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/j0;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->k0(ILcom/google/crypto/tink/shaded/protobuf/j0;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->l0(ILjava/util/List;Z)V

    return-void
.end method

.method public final q0(ILcom/google/crypto/tink/shaded/protobuf/z;Z)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/z;->h(I)I

    move-result v1

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->W(I)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->h(I)I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/z;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->h(I)I

    move-result v1

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->P0(II)V

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

    instance-of v0, p2, Lcom/google/crypto/tink/shaded/protobuf/j0;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/j0;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->s0(ILcom/google/crypto/tink/shaded/protobuf/j0;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->t0(ILjava/util/List;Z)V

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

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

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

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->W(I)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->P0(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public s(IJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->s0(IJ)V

    return-void
.end method

.method public final s0(ILcom/google/crypto/tink/shaded/protobuf/j0;Z)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

    move p1, v0

    move p3, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/j0;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/j0;->h(I)J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->Y(J)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/j0;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/j0;->h(I)J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->S0(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/j0;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p2, v0}, Lcom/google/crypto/tink/shaded/protobuf/j0;->h(I)J

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->R0(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public t()Lcom/google/crypto/tink/shaded/protobuf/t1$a;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/t1$a;->a:Lcom/google/crypto/tink/shaded/protobuf/t1$a;

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

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x2

    invoke-virtual {p3, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

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

    invoke-static {v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->Y(J)I

    move-result v1

    add-int/2addr p3, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->Q0(I)V

    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_2

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->S0(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v0, p3, :cond_2

    iget-object p3, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p3, p1, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/k;->R0(IJ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public u(IJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/k;->A0(IJ)V

    return-void
.end method

.method public v(IZ)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k;->j0(IZ)V

    return-void
.end method

.method public w(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    invoke-virtual {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/k;->F0(II)V

    return-void
.end method

.method public x(I)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/l;->a:Lcom/google/crypto/tink/shaded/protobuf/k;

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/k;->O0(II)V

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

    instance-of v0, p2, Lcom/google/crypto/tink/shaded/protobuf/j0;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/j0;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->Z(ILcom/google/crypto/tink/shaded/protobuf/j0;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->a0(ILjava/util/List;Z)V

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

    instance-of v0, p2, Lcom/google/crypto/tink/shaded/protobuf/z;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/z;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->i0(ILcom/google/crypto/tink/shaded/protobuf/z;Z)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/l;->j0(ILjava/util/List;Z)V

    return-void
.end method
