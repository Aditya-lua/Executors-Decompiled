.class public Ln0/e;
.super Ln0/d2;
.source "SourceFile"


# instance fields
.field public final b:Ln0/o0;

.field public final c:Ln0/q3;

.field public d:Z

.field public e:Z

.field public final f:Ln0/h0;

.field public g:Landroidx/lifecycle/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/a0<",
            "Lg0/z2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln0/o0;Ln0/h0;)V
    .locals 1

    invoke-direct {p0, p1}, Ln0/d2;-><init>(Ln0/o0;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ln0/e;->d:Z

    iput-boolean v0, p0, Ln0/e;->e:Z

    const/4 v0, 0x0

    iput-object v0, p0, Ln0/e;->g:Landroidx/lifecycle/a0;

    iput-object p1, p0, Ln0/e;->b:Ln0/o0;

    iput-object p2, p0, Ln0/e;->f:Ln0/h0;

    invoke-interface {p2, v0}, Ln0/h0;->w(Ln0/q3;)Ln0/q3;

    move-result-object p1

    iput-object p1, p0, Ln0/e;->c:Ln0/q3;

    invoke-interface {p2}, Ln0/h0;->U()Z

    move-result p1

    invoke-virtual {p0, p1}, Ln0/e;->H(Z)V

    invoke-interface {p2}, Ln0/h0;->c0()Z

    move-result p1

    invoke-virtual {p0, p1}, Ln0/e;->G(Z)V

    return-void
.end method

.method public static synthetic B(Landroid/util/Range;Lg0/z2;)Lg0/z2;
    .locals 4

    invoke-interface {p1}, Lg0/z2;->d()F

    move-result v0

    invoke-virtual {p0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {p0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-interface {p1}, Lg0/z2;->d()F

    move-result p1

    invoke-virtual {p0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {p0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    invoke-static {p1, v3, p0}, Ln0/e;->D(FFF)F

    move-result p0

    invoke-static {v0, v1, v2, p0}, Ls0/h;->e(FFFF)Lg0/z2;

    move-result-object p0

    return-object p0
.end method

.method public static D(FFF)F
    .locals 3

    cmpl-float v0, p2, p1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    cmpl-float v0, p0, p2

    const/high16 v2, 0x3f800000    # 1.0f

    if-nez v0, :cond_1

    return v2

    :cond_1
    cmpl-float v0, p0, p1

    if-nez v0, :cond_2

    return v1

    :cond_2
    div-float p0, v2, p0

    div-float p2, v2, p2

    div-float/2addr v2, p1

    sub-float/2addr p0, v2

    sub-float/2addr p2, v2

    div-float/2addr p0, p2

    return p0
.end method

.method public static F(FFF)F
    .locals 11

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v1, p0, v0

    if-nez v1, :cond_0

    return p2

    :cond_0
    const/4 v1, 0x0

    cmpl-float v1, p0, v1

    if-nez v1, :cond_1

    return p1

    :cond_1
    div-float v1, v0, p2

    float-to-double v1, v1

    div-float/2addr v0, p1

    float-to-double v3, v0

    sub-double/2addr v1, v3

    float-to-double v5, p0

    mul-double/2addr v1, v5

    add-double/2addr v3, v1

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    div-double v5, v0, v3

    float-to-double v7, p1

    float-to-double v9, p2

    invoke-static/range {v5 .. v10}, Ls2/a;->a(DDD)D

    move-result-wide p0

    double-to-float p0, p0

    return p0
.end method


# virtual methods
.method public C()Ln0/h0;
    .locals 1

    iget-object v0, p0, Ln0/e;->f:Ln0/h0;

    return-object v0
.end method

.method public E()Ln0/q3;
    .locals 1

    iget-object v0, p0, Ln0/e;->c:Ln0/q3;

    return-object v0
.end method

.method public G(Z)V
    .locals 0

    iput-boolean p1, p0, Ln0/e;->e:Z

    return-void
.end method

.method public H(Z)V
    .locals 0

    iput-boolean p1, p0, Ln0/e;->d:Z

    return-void
.end method

.method public o()Z
    .locals 6

    iget-object v0, p0, Ln0/e;->c:Ln0/q3;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ln0/q3;->m()[I

    move-result-object v0

    if-eqz v0, :cond_2

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget v4, v0, v3

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    return v5

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    invoke-super {p0}, Ln0/d2;->o()Z

    move-result v0

    return v0
.end method

.method public p()Landroidx/lifecycle/a0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/a0<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln0/e;->c:Ln0/q3;

    const/4 v1, 0x6

    filled-new-array {v1}, [I

    move-result-object v1

    invoke-static {v0, v1}, Lp0/x;->b(Ln0/q3;[I)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/d0;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/lifecycle/d0;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    iget-object v0, p0, Ln0/e;->b:Ln0/o0;

    invoke-interface {v0}, Lg0/t;->p()Landroidx/lifecycle/a0;

    move-result-object v0

    return-object v0
.end method

.method public q()Ln0/o0;
    .locals 1

    iget-object v0, p0, Ln0/e;->b:Ln0/o0;

    return-object v0
.end method

.method public z()Landroidx/lifecycle/a0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/a0<",
            "Lg0/z2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln0/e;->c:Ln0/q3;

    const/4 v1, 0x0

    filled-new-array {v1}, [I

    move-result-object v1

    invoke-static {v0, v1}, Lp0/x;->b(Ln0/q3;[I)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/d0;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v2, v2, v1}, Ls0/h;->e(FFFF)Lg0/z2;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/lifecycle/d0;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    iget-object v0, p0, Ln0/e;->c:Ln0/q3;

    if-eqz v0, :cond_3

    iget-object v0, p0, Ln0/e;->b:Ln0/o0;

    invoke-interface {v0}, Lg0/t;->z()Landroidx/lifecycle/a0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/a0;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/z2;

    iget-object v1, p0, Ln0/e;->c:Ln0/q3;

    invoke-interface {v1}, Ln0/q3;->j()Landroid/util/Range;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-interface {v0}, Lg0/z2;->c()F

    move-result v3

    cmpl-float v2, v2, v3

    if-nez v2, :cond_1

    invoke-virtual {v1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-interface {v0}, Lg0/z2;->a()F

    move-result v0

    cmpl-float v0, v2, v0

    if-eqz v0, :cond_3

    :cond_1
    iget-object v0, p0, Ln0/e;->g:Landroidx/lifecycle/a0;

    if-nez v0, :cond_2

    iget-object v0, p0, Ln0/e;->b:Ln0/o0;

    invoke-interface {v0}, Lg0/t;->z()Landroidx/lifecycle/a0;

    move-result-object v0

    new-instance v2, Ln0/d;

    invoke-direct {v2, v1}, Ln0/d;-><init>(Landroid/util/Range;)V

    invoke-static {v0, v2}, Lp0/m;->a(Landroidx/lifecycle/a0;Lt/a;)Landroidx/lifecycle/a0;

    move-result-object v0

    iput-object v0, p0, Ln0/e;->g:Landroidx/lifecycle/a0;

    :cond_2
    iget-object v0, p0, Ln0/e;->g:Landroidx/lifecycle/a0;

    return-object v0

    :cond_3
    iget-object v0, p0, Ln0/e;->b:Ln0/o0;

    invoke-interface {v0}, Lg0/t;->z()Landroidx/lifecycle/a0;

    move-result-object v0

    return-object v0
.end method
