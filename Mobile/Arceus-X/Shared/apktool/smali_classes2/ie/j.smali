.class public Lie/j;
.super Ljava/util/AbstractSet;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractSet<",
        "TE;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field public transient a:Ljava/lang/Object;

.field public transient b:[I

.field public transient c:[Ljava/lang/Object;

.field public transient d:I

.field public transient e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lie/j;->u(I)V

    return-void
.end method

.method public static synthetic a(Lie/j;)I
    .locals 0

    iget p0, p0, Lie/j;->d:I

    return p0
.end method

.method public static synthetic b(Lie/j;I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lie/j;->i(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static f()Lie/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lie/j<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, Lie/j;

    invoke-direct {v0}, Lie/j;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final A()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lie/j;->c:[Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    return-object v0
.end method

.method public final B()[I
    .locals 1

    iget-object v0, p0, Lie/j;->b:[I

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, [I

    return-object v0
.end method

.method public final C()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lie/j;->a:Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public D(I)V
    .locals 1

    invoke-virtual {p0}, Lie/j;->B()[I

    move-result-object v0

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Lie/j;->b:[I

    invoke-virtual {p0}, Lie/j;->A()[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lie/j;->c:[Ljava/lang/Object;

    return-void
.end method

.method public final E(I)V
    .locals 2

    invoke-virtual {p0}, Lie/j;->B()[I

    move-result-object v0

    array-length v0, v0

    if-le p1, v0, :cond_0

    ushr-int/lit8 p1, v0, 0x1

    const/4 v1, 0x1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/2addr p1, v0

    or-int/2addr p1, v1

    const v1, 0x3fffffff    # 1.9999999f

    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    if-eq p1, v0, :cond_0

    invoke-virtual {p0, p1}, Lie/j;->D(I)V

    :cond_0
    return-void
.end method

.method public final F(IIII)I
    .locals 8

    invoke-static {p2}, Lie/k;->a(I)Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 p2, p2, -0x1

    if-eqz p4, :cond_0

    and-int/2addr p3, p2

    add-int/lit8 p4, p4, 0x1

    invoke-static {v0, p3, p4}, Lie/k;->i(Ljava/lang/Object;II)V

    :cond_0
    invoke-virtual {p0}, Lie/j;->C()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p0}, Lie/j;->B()[I

    move-result-object p4

    const/4 v1, 0x0

    :goto_0
    if-gt v1, p1, :cond_2

    invoke-static {p3, v1}, Lie/k;->h(Ljava/lang/Object;I)I

    move-result v2

    :goto_1
    if-eqz v2, :cond_1

    add-int/lit8 v3, v2, -0x1

    aget v4, p4, v3

    invoke-static {v4, p1}, Lie/k;->b(II)I

    move-result v5

    or-int/2addr v5, v1

    and-int v6, v5, p2

    invoke-static {v0, v6}, Lie/k;->h(Ljava/lang/Object;I)I

    move-result v7

    invoke-static {v0, v6, v2}, Lie/k;->i(Ljava/lang/Object;II)V

    invoke-static {v5, v7, p2}, Lie/k;->d(III)I

    move-result v2

    aput v2, p4, v3

    invoke-static {v4, p1}, Lie/k;->c(II)I

    move-result v2

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iput-object v0, p0, Lie/j;->a:Ljava/lang/Object;

    invoke-virtual {p0, p2}, Lie/j;->I(I)V

    return p2
.end method

.method public final G(ILjava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lie/j;->A()[Ljava/lang/Object;

    move-result-object v0

    aput-object p2, v0, p1

    return-void
.end method

.method public final H(II)V
    .locals 1

    invoke-virtual {p0}, Lie/j;->B()[I

    move-result-object v0

    aput p2, v0, p1

    return-void
.end method

.method public final I(I)V
    .locals 2

    invoke-static {p1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p1

    rsub-int/lit8 p1, p1, 0x20

    iget v0, p0, Lie/j;->d:I

    const/16 v1, 0x1f

    invoke-static {v0, p1, v1}, Lie/k;->d(III)I

    move-result p1

    iput p1, p0, Lie/j;->d:I

    return-void
.end method

.method public add(Ljava/lang/Object;)Z
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Lie/j;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lie/j;->d()I

    :cond_0
    invoke-virtual {p0}, Lie/j;->h()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    invoke-virtual {p0}, Lie/j;->B()[I

    move-result-object v0

    invoke-virtual {p0}, Lie/j;->A()[Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lie/j;->e:I

    add-int/lit8 v3, v2, 0x1

    invoke-static {p1}, Lie/p;->c(Ljava/lang/Object;)I

    move-result v4

    invoke-virtual {p0}, Lie/j;->p()I

    move-result v5

    and-int v6, v4, v5

    invoke-virtual {p0}, Lie/j;->C()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v6}, Lie/k;->h(Ljava/lang/Object;I)I

    move-result v7

    const/4 v8, 0x1

    if-nez v7, :cond_3

    if-le v3, v5, :cond_2

    invoke-static {v5}, Lie/k;->e(I)I

    move-result v0

    invoke-virtual {p0, v5, v0, v4, v2}, Lie/j;->F(IIII)I

    move-result v5

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lie/j;->C()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v6, v3}, Lie/k;->i(Ljava/lang/Object;II)V

    goto :goto_1

    :cond_3
    invoke-static {v4, v5}, Lie/k;->b(II)I

    move-result v6

    const/4 v9, 0x0

    move v10, v9

    :goto_0
    sub-int/2addr v7, v8

    aget v11, v0, v7

    invoke-static {v11, v5}, Lie/k;->b(II)I

    move-result v12

    if-ne v12, v6, :cond_4

    aget-object v12, v1, v7

    invoke-static {p1, v12}, Lhe/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    return v9

    :cond_4
    invoke-static {v11, v5}, Lie/k;->c(II)I

    move-result v12

    add-int/2addr v10, v8

    if-nez v12, :cond_7

    const/16 v1, 0x9

    if-lt v10, v1, :cond_5

    invoke-virtual {p0}, Lie/j;->e()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_5
    if-le v3, v5, :cond_6

    invoke-static {v5}, Lie/k;->e(I)I

    move-result v0

    invoke-virtual {p0, v5, v0, v4, v2}, Lie/j;->F(IIII)I

    move-result v5

    goto :goto_1

    :cond_6
    invoke-static {v11, v3, v5}, Lie/k;->d(III)I

    move-result v1

    aput v1, v0, v7

    :goto_1
    invoke-virtual {p0, v3}, Lie/j;->E(I)V

    invoke-virtual {p0, v2, p1, v4, v5}, Lie/j;->x(ILjava/lang/Object;II)V

    iput v3, p0, Lie/j;->e:I

    invoke-virtual {p0}, Lie/j;->t()V

    return v8

    :cond_7
    move v7, v12

    goto :goto_0
.end method

.method public c(II)I
    .locals 0

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public clear()V
    .locals 6

    invoke-virtual {p0}, Lie/j;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lie/j;->t()V

    invoke-virtual {p0}, Lie/j;->h()Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lie/j;->size()I

    move-result v3

    const/4 v4, 0x3

    const v5, 0x3fffffff    # 1.9999999f

    invoke-static {v3, v4, v5}, Lme/a;->a(III)I

    move-result v3

    iput v3, p0, Lie/j;->d:I

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    iput-object v1, p0, Lie/j;->a:Ljava/lang/Object;

    iput v2, p0, Lie/j;->e:I

    return-void

    :cond_1
    invoke-virtual {p0}, Lie/j;->A()[Ljava/lang/Object;

    move-result-object v0

    iget v3, p0, Lie/j;->e:I

    invoke-static {v0, v2, v3, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    invoke-virtual {p0}, Lie/j;->C()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lie/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lie/j;->B()[I

    move-result-object v0

    iget v1, p0, Lie/j;->e:I

    invoke-static {v0, v2, v1, v2}, Ljava/util/Arrays;->fill([IIII)V

    iput v2, p0, Lie/j;->e:I

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 7

    invoke-virtual {p0}, Lie/j;->z()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lie/j;->h()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    invoke-static {p1}, Lie/p;->c(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0}, Lie/j;->p()I

    move-result v2

    invoke-virtual {p0}, Lie/j;->C()Ljava/lang/Object;

    move-result-object v3

    and-int v4, v0, v2

    invoke-static {v3, v4}, Lie/k;->h(Ljava/lang/Object;I)I

    move-result v3

    if-nez v3, :cond_2

    return v1

    :cond_2
    invoke-static {v0, v2}, Lie/k;->b(II)I

    move-result v0

    :cond_3
    const/4 v4, 0x1

    sub-int/2addr v3, v4

    invoke-virtual {p0, v3}, Lie/j;->k(I)I

    move-result v5

    invoke-static {v5, v2}, Lie/k;->b(II)I

    move-result v6

    if-ne v6, v0, :cond_4

    invoke-virtual {p0, v3}, Lie/j;->i(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p1, v3}, Lhe/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    return v4

    :cond_4
    invoke-static {v5, v2}, Lie/k;->c(II)I

    move-result v3

    if-nez v3, :cond_3

    return v1
.end method

.method public d()I
    .locals 3

    invoke-virtual {p0}, Lie/j;->z()Z

    move-result v0

    const-string v1, "Arrays already allocated"

    invoke-static {v0, v1}, Lhe/n;->s(ZLjava/lang/Object;)V

    iget v0, p0, Lie/j;->d:I

    invoke-static {v0}, Lie/k;->j(I)I

    move-result v1

    invoke-static {v1}, Lie/k;->a(I)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lie/j;->a:Ljava/lang/Object;

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, Lie/j;->I(I)V

    new-array v1, v0, [I

    iput-object v1, p0, Lie/j;->b:[I

    new-array v1, v0, [Ljava/lang/Object;

    iput-object v1, p0, Lie/j;->c:[Ljava/lang/Object;

    return v0
.end method

.method public e()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TE;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lie/j;->p()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lie/j;->g(I)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, Lie/j;->l()I

    move-result v1

    :goto_0
    if-ltz v1, :cond_0

    invoke-virtual {p0, v1}, Lie/j;->i(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v1}, Lie/j;->m(I)I

    move-result v1

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lie/j;->a:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, Lie/j;->b:[I

    iput-object v1, p0, Lie/j;->c:[Ljava/lang/Object;

    invoke-virtual {p0}, Lie/j;->t()V

    return-object v0
.end method

.method public final g(I)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/Set<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashSet;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, p1, v1}, Ljava/util/LinkedHashSet;-><init>(IF)V

    return-object v0
.end method

.method public h()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, Lie/j;->a:Ljava/lang/Object;

    instance-of v1, v0, Ljava/util/Set;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/util/Set;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final i(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    invoke-virtual {p0}, Lie/j;->A()[Ljava/lang/Object;

    move-result-object v0

    aget-object p1, v0, p1

    return-object p1
.end method

.method public isEmpty()Z
    .locals 1

    invoke-virtual {p0}, Lie/j;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TE;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lie/j;->h()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lie/j$a;

    invoke-direct {v0, p0}, Lie/j$a;-><init>(Lie/j;)V

    return-object v0
.end method

.method public final k(I)I
    .locals 1

    invoke-virtual {p0}, Lie/j;->B()[I

    move-result-object v0

    aget p1, v0, p1

    return p1
.end method

.method public l()I
    .locals 1

    invoke-virtual {p0}, Lie/j;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public m(I)I
    .locals 1

    add-int/lit8 p1, p1, 0x1

    iget v0, p0, Lie/j;->e:I

    if-ge p1, v0, :cond_0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final p()I
    .locals 2

    iget v0, p0, Lie/j;->d:I

    and-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x1

    shl-int v0, v1, v0

    sub-int/2addr v0, v1

    return v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 9

    invoke-virtual {p0}, Lie/j;->z()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lie/j;->h()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    invoke-virtual {p0}, Lie/j;->p()I

    move-result v4

    invoke-virtual {p0}, Lie/j;->C()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {p0}, Lie/j;->B()[I

    move-result-object v6

    invoke-virtual {p0}, Lie/j;->A()[Ljava/lang/Object;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v3, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v8}, Lie/k;->f(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;[I[Ljava/lang/Object;[Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0, p1, v4}, Lie/j;->y(II)V

    iget p1, p0, Lie/j;->e:I

    const/4 v0, 0x1

    sub-int/2addr p1, v0

    iput p1, p0, Lie/j;->e:I

    invoke-virtual {p0}, Lie/j;->t()V

    return v0
.end method

.method public size()I
    .locals 1

    invoke-virtual {p0}, Lie/j;->h()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    return v0

    :cond_0
    iget v0, p0, Lie/j;->e:I

    return v0
.end method

.method public t()V
    .locals 1

    iget v0, p0, Lie/j;->d:I

    add-int/lit8 v0, v0, 0x20

    iput v0, p0, Lie/j;->d:I

    return-void
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lie/j;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    return-object v0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lie/j;->h()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {v0}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {p0}, Lie/j;->A()[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lie/j;->e:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .line 5
    invoke-virtual {p0}, Lie/j;->z()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 6
    array-length v0, p1

    if-lez v0, :cond_0

    const/4 v0, 0x0

    .line 7
    aput-object v0, p1, v1

    :cond_0
    return-object p1

    .line 8
    :cond_1
    invoke-virtual {p0}, Lie/j;->h()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 9
    invoke-interface {v0, p1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 10
    :cond_2
    invoke-virtual {p0}, Lie/j;->A()[Ljava/lang/Object;

    move-result-object v0

    iget v2, p0, Lie/j;->e:I

    invoke-static {v0, v1, v2, p1}, Lie/l0;->e([Ljava/lang/Object;II[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public u(I)V
    .locals 3

    const/4 v0, 0x1

    if-ltz p1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Expected size must be >= 0"

    invoke-static {v1, v2}, Lhe/n;->e(ZLjava/lang/Object;)V

    const v1, 0x3fffffff    # 1.9999999f

    invoke-static {p1, v0, v1}, Lme/a;->a(III)I

    move-result p1

    iput p1, p0, Lie/j;->d:I

    return-void
.end method

.method public x(ILjava/lang/Object;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;II)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p3, v0, p4}, Lie/k;->d(III)I

    move-result p3

    invoke-virtual {p0, p1, p3}, Lie/j;->H(II)V

    invoke-virtual {p0, p1, p2}, Lie/j;->G(ILjava/lang/Object;)V

    return-void
.end method

.method public y(II)V
    .locals 8

    invoke-virtual {p0}, Lie/j;->C()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Lie/j;->B()[I

    move-result-object v1

    invoke-virtual {p0}, Lie/j;->A()[Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0}, Lie/j;->size()I

    move-result v3

    add-int/lit8 v4, v3, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-ge p1, v4, :cond_2

    aget-object v7, v2, v4

    aput-object v7, v2, p1

    aput-object v6, v2, v4

    aget v2, v1, v4

    aput v2, v1, p1

    aput v5, v1, v4

    invoke-static {v7}, Lie/p;->c(Ljava/lang/Object;)I

    move-result v2

    and-int/2addr v2, p2

    invoke-static {v0, v2}, Lie/k;->h(Ljava/lang/Object;I)I

    move-result v4

    if-ne v4, v3, :cond_0

    add-int/lit8 p1, p1, 0x1

    invoke-static {v0, v2, p1}, Lie/k;->i(Ljava/lang/Object;II)V

    return-void

    :cond_0
    :goto_0
    add-int/lit8 v4, v4, -0x1

    aget v0, v1, v4

    invoke-static {v0, p2}, Lie/k;->c(II)I

    move-result v2

    if-ne v2, v3, :cond_1

    add-int/lit8 p1, p1, 0x1

    invoke-static {v0, p1, p2}, Lie/k;->d(III)I

    move-result p1

    aput p1, v1, v4

    return-void

    :cond_1
    move v4, v2

    goto :goto_0

    :cond_2
    aput-object v6, v2, p1

    aput v5, v1, p1

    return-void
.end method

.method public z()Z
    .locals 1

    iget-object v0, p0, Lie/j;->a:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
