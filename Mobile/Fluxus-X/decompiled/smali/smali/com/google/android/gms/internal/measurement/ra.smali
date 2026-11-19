.class public final Lcom/google/android/gms/internal/measurement/ra;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/ce;


# instance fields
.field public final a:Lcom/google/android/gms/internal/measurement/qa;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/qa;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/measurement/ub;->a:Ljava/nio/charset/Charset;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    iput-object p0, p1, Lcom/google/android/gms/internal/measurement/qa;->a:Lcom/google/android/gms/internal/measurement/ra;

    return-void
.end method

.method public static M(Lcom/google/android/gms/internal/measurement/qa;)Lcom/google/android/gms/internal/measurement/ra;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/qa;->a:Lcom/google/android/gms/internal/measurement/ra;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/measurement/ra;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/ra;-><init>(Lcom/google/android/gms/internal/measurement/qa;)V

    return-object v0
.end method


# virtual methods
.method public final A(IJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/qa;->m(IJ)V

    return-void
.end method

.method public final B(ILjava/util/List;Z)V
    .locals 3

    instance-of v0, p2, Lcom/google/android/gms/internal/measurement/lb;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/measurement/lb;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/lb;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/lb;->c(I)I

    move-result v1

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/qa;->G(I)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/lb;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/lb;->c(I)I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/lb;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/lb;->c(I)I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/measurement/qa;->k(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/qa;->G(I)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/measurement/qa;->k(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public final C(ILjava/util/List;Z)V
    .locals 3

    instance-of v0, p2, Lcom/google/android/gms/internal/measurement/sa;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/measurement/sa;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/sa;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/sa;->c(I)D

    add-int/lit8 v0, v0, 0x8

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/sa;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/sa;->c(I)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Lcom/google/android/gms/internal/measurement/qa;->C(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/sa;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/sa;->c(I)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/measurement/qa;->n(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v0, v0, 0x8

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Lcom/google/android/gms/internal/measurement/qa;->C(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/measurement/qa;->n(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public final D(ILjava/util/List;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/la;

    invoke-virtual {v1, p1, v2}, Lcom/google/android/gms/internal/measurement/qa;->q(ILcom/google/android/gms/internal/measurement/la;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final E(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/qa;->k(II)V

    return-void
.end method

.method public final F(ILjava/util/List;)V
    .locals 4

    instance-of v0, p2, Lcom/google/android/gms/internal/measurement/cc;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v0, p2

    check-cast v0, Lcom/google/android/gms/internal/measurement/cc;

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/cc;->zzc()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v3, p1, v2}, Lcom/google/android/gms/internal/measurement/qa;->p(ILjava/lang/String;)V

    goto :goto_1

    :cond_0
    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    check-cast v2, Lcom/google/android/gms/internal/measurement/la;

    invoke-virtual {v3, p1, v2}, Lcom/google/android/gms/internal/measurement/qa;->q(ILcom/google/android/gms/internal/measurement/la;)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, p1, v2}, Lcom/google/android/gms/internal/measurement/qa;->p(ILjava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final G(II)V
    .locals 1

    add-int v0, p2, p2

    shr-int/lit8 p2, p2, 0x1f

    xor-int/2addr p2, v0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/qa;->k(II)V

    return-void
.end method

.method public final H(ILjava/util/List;Z)V
    .locals 3

    instance-of v0, p2, Lcom/google/android/gms/internal/measurement/ba;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/measurement/ba;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/ba;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/ba;->c(I)Z

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/ba;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/ba;->c(I)Z

    move-result p1

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/measurement/qa;->x(B)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/ba;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/ba;->c(I)Z

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/measurement/qa;->o(IZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/measurement/qa;->x(B)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/measurement/qa;->o(IZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public final I(ILjava/util/List;Z)V
    .locals 3

    instance-of v0, p2, Lcom/google/android/gms/internal/measurement/lb;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/measurement/lb;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/lb;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/lb;->c(I)I

    add-int/lit8 v0, v0, 0x4

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/lb;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/lb;->c(I)I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/measurement/qa;->A(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/lb;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/lb;->c(I)I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/measurement/qa;->l(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v0, v0, 0x4

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/measurement/qa;->A(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/measurement/qa;->l(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public final J(ILjava/lang/Object;)V
    .locals 1

    instance-of v0, p2, Lcom/google/android/gms/internal/measurement/la;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    check-cast p2, Lcom/google/android/gms/internal/measurement/la;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/qa;->v(ILcom/google/android/gms/internal/measurement/la;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    check-cast p2, Lcom/google/android/gms/internal/measurement/sc;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/qa;->u(ILcom/google/android/gms/internal/measurement/sc;)V

    return-void
.end method

.method public final K(IZ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/qa;->o(IZ)V

    return-void
.end method

.method public final L(ILjava/util/List;Z)V
    .locals 5

    instance-of v0, p2, Lcom/google/android/gms/internal/measurement/lb;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/measurement/lb;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/lb;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/lb;->c(I)I

    move-result v1

    int-to-long v3, v1

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/qa;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/lb;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/lb;->c(I)I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/measurement/qa;->y(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/lb;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/lb;->c(I)I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/measurement/qa;->j(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v3, v1

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/qa;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/measurement/qa;->y(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/measurement/qa;->j(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public final a(ID)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-static {p2, p3}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p2

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/qa;->n(IJ)V

    return-void
.end method

.method public final b(ILjava/util/List;Z)V
    .locals 4

    instance-of v0, p2, Lcom/google/android/gms/internal/measurement/lb;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/measurement/lb;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/lb;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/lb;->c(I)I

    move-result v1

    add-int v3, v1, v1

    shr-int/lit8 v1, v1, 0x1f

    xor-int/2addr v1, v3

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/qa;->G(I)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/lb;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/lb;->c(I)I

    move-result p1

    add-int v0, p1, p1

    shr-int/lit8 p1, p1, 0x1f

    xor-int/2addr p1, v0

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/lb;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/lb;->c(I)I

    move-result v0

    add-int v1, v0, v0

    shr-int/lit8 v0, v0, 0x1f

    xor-int/2addr v0, v1

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/measurement/qa;->k(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int v3, v1, v1

    shr-int/lit8 v1, v1, 0x1f

    xor-int/2addr v1, v3

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/qa;->G(I)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    add-int v0, p1, p1

    shr-int/lit8 p1, p1, 0x1f

    xor-int/2addr p1, v0

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int v1, v0, v0

    shr-int/lit8 v0, v0, 0x1f

    xor-int/2addr v0, v1

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/measurement/qa;->k(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public final c(ILjava/util/List;Z)V
    .locals 5

    instance-of v0, p2, Lcom/google/android/gms/internal/measurement/gc;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/measurement/gc;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/gc;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/gc;->w0(I)J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/qa;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/gc;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/gc;->w0(I)J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Lcom/google/android/gms/internal/measurement/qa;->B(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/gc;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/gc;->w0(I)J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/measurement/qa;->m(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/qa;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Lcom/google/android/gms/internal/measurement/qa;->B(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/measurement/qa;->m(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public final d(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/qa;->l(II)V

    return-void
.end method

.method public final e(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/qa;->j(II)V

    return-void
.end method

.method public final f(ILjava/util/List;Z)V
    .locals 3

    instance-of v0, p2, Lcom/google/android/gms/internal/measurement/cb;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/measurement/cb;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/cb;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/cb;->c(I)F

    add-int/lit8 v0, v0, 0x4

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/cb;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/cb;->c(I)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/measurement/qa;->A(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/cb;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/cb;->c(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/measurement/qa;->l(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v0, v0, 0x4

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/measurement/qa;->A(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/measurement/qa;->l(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public final g(ILjava/util/List;Z)V
    .locals 5

    instance-of v0, p2, Lcom/google/android/gms/internal/measurement/lb;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/measurement/lb;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/lb;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/lb;->c(I)I

    move-result v1

    int-to-long v3, v1

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/qa;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/lb;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/lb;->c(I)I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/measurement/qa;->y(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/lb;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/lb;->c(I)I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/measurement/qa;->j(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v3, v1

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/qa;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/measurement/qa;->y(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/measurement/qa;->j(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public final h(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/qa;->l(II)V

    return-void
.end method

.method public final i(ILcom/google/android/gms/internal/measurement/kc;Ljava/util/Map;)V
    .locals 4

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    const/4 v2, 0x2

    invoke-virtual {v1, p1, v2}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/measurement/lc;->c(Lcom/google/android/gms/internal/measurement/kc;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, p2, v2, v0}, Lcom/google/android/gms/internal/measurement/lc;->b(Lcom/google/android/gms/internal/measurement/qa;Lcom/google/android/gms/internal/measurement/kc;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final j(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/dd;)V
    .locals 1

    check-cast p2, Lcom/google/android/gms/internal/measurement/sc;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/qa;->t(ILcom/google/android/gms/internal/measurement/sc;Lcom/google/android/gms/internal/measurement/dd;)V

    return-void
.end method

.method public final k(IJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/qa;->m(IJ)V

    return-void
.end method

.method public final l(IJ)V
    .locals 3

    add-long v0, p2, p2

    const/16 v2, 0x3f

    shr-long/2addr p2, v2

    xor-long/2addr p2, v0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/qa;->m(IJ)V

    return-void
.end method

.method public final m(ILjava/util/List;Z)V
    .locals 3

    instance-of v0, p2, Lcom/google/android/gms/internal/measurement/gc;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/measurement/gc;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/gc;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/gc;->w0(I)J

    add-int/lit8 v0, v0, 0x8

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/gc;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/gc;->w0(I)J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Lcom/google/android/gms/internal/measurement/qa;->C(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/gc;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/gc;->w0(I)J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/measurement/qa;->n(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v0, v0, 0x8

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Lcom/google/android/gms/internal/measurement/qa;->C(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/measurement/qa;->n(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public final n(I)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    return-void
.end method

.method public final o(I)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    const/4 v1, 0x4

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    return-void
.end method

.method public final p(ILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/qa;->p(ILjava/lang/String;)V

    return-void
.end method

.method public final q(ILjava/util/List;Z)V
    .locals 8

    instance-of v0, p2, Lcom/google/android/gms/internal/measurement/gc;

    const/4 v1, 0x2

    const/16 v2, 0x3f

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/measurement/gc;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v3

    move v0, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/gc;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/gc;->w0(I)J

    move-result-wide v4

    add-long v6, v4, v4

    shr-long/2addr v4, v2

    xor-long/2addr v4, v6

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/measurement/qa;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/gc;->size()I

    move-result p1

    if-ge v3, p1, :cond_5

    invoke-virtual {p2, v3}, Lcom/google/android/gms/internal/measurement/gc;->w0(I)J

    move-result-wide v0

    add-long v4, v0, v0

    shr-long/2addr v0, v2

    xor-long/2addr v0, v4

    invoke-virtual {p3, v0, v1}, Lcom/google/android/gms/internal/measurement/qa;->B(J)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/gc;->size()I

    move-result p3

    if-ge v3, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p2, v3}, Lcom/google/android/gms/internal/measurement/gc;->w0(I)J

    move-result-wide v0

    add-long v4, v0, v0

    shr-long/2addr v0, v2

    xor-long/2addr v0, v4

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/measurement/qa;->m(IJ)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v3

    move v0, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    add-long v6, v4, v4

    shr-long/2addr v4, v2

    xor-long/2addr v4, v6

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/measurement/qa;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v3, p1, :cond_5

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    add-long v4, v0, v0

    shr-long/2addr v0, v2

    xor-long/2addr v0, v4

    invoke-virtual {p3, v0, v1}, Lcom/google/android/gms/internal/measurement/qa;->B(J)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v3, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    add-long v4, v0, v0

    shr-long/2addr v0, v2

    xor-long/2addr v0, v4

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/measurement/qa;->m(IJ)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public final r(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/qa;->j(II)V

    return-void
.end method

.method public final s(ILjava/lang/Object;Lcom/google/android/gms/internal/measurement/dd;)V
    .locals 2

    check-cast p2, Lcom/google/android/gms/internal/measurement/sc;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/qa;->a:Lcom/google/android/gms/internal/measurement/ra;

    invoke-interface {p3, p2, v1}, Lcom/google/android/gms/internal/measurement/dd;->e(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/ce;)V

    const/4 p2, 0x4

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    return-void
.end method

.method public final t(IJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/qa;->n(IJ)V

    return-void
.end method

.method public final u(IF)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/qa;->l(II)V

    return-void
.end method

.method public final v(ILcom/google/android/gms/internal/measurement/la;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/qa;->q(ILcom/google/android/gms/internal/measurement/la;)V

    return-void
.end method

.method public final w(IJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/qa;->n(IJ)V

    return-void
.end method

.method public final x(ILjava/util/List;Z)V
    .locals 5

    instance-of v0, p2, Lcom/google/android/gms/internal/measurement/gc;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/measurement/gc;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/gc;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/gc;->w0(I)J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/qa;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/gc;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/gc;->w0(I)J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Lcom/google/android/gms/internal/measurement/qa;->B(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/gc;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/gc;->w0(I)J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/measurement/qa;->m(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/android/gms/internal/measurement/qa;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Lcom/google/android/gms/internal/measurement/qa;->B(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/measurement/qa;->m(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public final y(ILjava/util/List;Z)V
    .locals 3

    instance-of v0, p2, Lcom/google/android/gms/internal/measurement/lb;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/measurement/lb;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/lb;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/lb;->c(I)I

    add-int/lit8 v0, v0, 0x4

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/lb;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/lb;->c(I)I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/measurement/qa;->A(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/lb;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/lb;->c(I)I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/measurement/qa;->l(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v0, v0, 0x4

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/measurement/qa;->A(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p3, p1, v0}, Lcom/google/android/gms/internal/measurement/qa;->l(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public final z(ILjava/util/List;Z)V
    .locals 3

    instance-of v0, p2, Lcom/google/android/gms/internal/measurement/gc;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p2, Lcom/google/android/gms/internal/measurement/gc;

    if-eqz p3, :cond_1

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_0
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/gc;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/measurement/gc;->w0(I)J

    add-int/lit8 v0, v0, 0x8

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/gc;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/gc;->w0(I)J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Lcom/google/android/gms/internal/measurement/qa;->C(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/gc;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/gc;->w0(I)J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/measurement/qa;->n(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_4

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-virtual {p3, p1, v1}, Lcom/google/android/gms/internal/measurement/qa;->i(II)V

    move p1, v2

    move v0, p1

    :goto_3
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v0, v0, 0x8

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/measurement/qa;->z(I)V

    :goto_4
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v2, p1, :cond_5

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Lcom/google/android/gms/internal/measurement/qa;->C(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    :goto_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    iget-object p3, p0, Lcom/google/android/gms/internal/measurement/ra;->a:Lcom/google/android/gms/internal/measurement/qa;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p3, p1, v0, v1}, Lcom/google/android/gms/internal/measurement/qa;->n(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method
