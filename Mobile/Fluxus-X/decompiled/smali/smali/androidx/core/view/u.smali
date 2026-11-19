.class public Landroidx/core/view/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/view/ViewParent;

.field public b:Landroid/view/ViewParent;

.field public final c:Landroid/view/View;

.field public d:Z

.field public e:[I


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/core/view/u;->c:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public a(FFZ)Z
    .locals 2

    invoke-virtual {p0}, Landroidx/core/view/u;->l()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1}, Landroidx/core/view/u;->h(I)Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/core/view/u;->c:Landroid/view/View;

    invoke-static {v0, v1, p1, p2, p3}, Landroidx/core/view/w0;->a(Landroid/view/ViewParent;Landroid/view/View;FFZ)Z

    move-result p1

    return p1

    :cond_0
    return v1
.end method

.method public b(FF)Z
    .locals 2

    invoke-virtual {p0}, Landroidx/core/view/u;->l()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1}, Landroidx/core/view/u;->h(I)Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/core/view/u;->c:Landroid/view/View;

    invoke-static {v0, v1, p1, p2}, Landroidx/core/view/w0;->b(Landroid/view/ViewParent;Landroid/view/View;FF)Z

    move-result p1

    return p1

    :cond_0
    return v1
.end method

.method public c(II[I[I)Z
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Landroidx/core/view/u;->d(II[I[II)Z

    move-result p1

    return p1
.end method

.method public d(II[I[II)Z
    .locals 10

    invoke-virtual {p0}, Landroidx/core/view/u;->l()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    invoke-virtual {p0, p5}, Landroidx/core/view/u;->h(I)Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-nez p1, :cond_2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p4, :cond_8

    aput v1, p4, v1

    aput v1, p4, v0

    goto :goto_3

    :cond_2
    :goto_0
    if-eqz p4, :cond_3

    iget-object v3, p0, Landroidx/core/view/u;->c:Landroid/view/View;

    invoke-virtual {v3, p4}, Landroid/view/View;->getLocationInWindow([I)V

    aget v3, p4, v1

    aget v4, p4, v0

    move v8, v3

    move v9, v4

    goto :goto_1

    :cond_3
    move v8, v1

    move v9, v8

    :goto_1
    if-nez p3, :cond_4

    invoke-virtual {p0}, Landroidx/core/view/u;->i()[I

    move-result-object p3

    :cond_4
    move-object v6, p3

    aput v1, v6, v1

    aput v1, v6, v0

    iget-object v3, p0, Landroidx/core/view/u;->c:Landroid/view/View;

    move v4, p1

    move v5, p2

    move v7, p5

    invoke-static/range {v2 .. v7}, Landroidx/core/view/w0;->c(Landroid/view/ViewParent;Landroid/view/View;II[II)V

    if-eqz p4, :cond_5

    iget-object p1, p0, Landroidx/core/view/u;->c:Landroid/view/View;

    invoke-virtual {p1, p4}, Landroid/view/View;->getLocationInWindow([I)V

    aget p1, p4, v1

    sub-int/2addr p1, v8

    aput p1, p4, v1

    aget p1, p4, v0

    sub-int/2addr p1, v9

    aput p1, p4, v0

    :cond_5
    aget p1, v6, v1

    if-nez p1, :cond_7

    aget p1, v6, v0

    if-eqz p1, :cond_6

    goto :goto_2

    :cond_6
    return v1

    :cond_7
    :goto_2
    return v0

    :cond_8
    :goto_3
    return v1
.end method

.method public e(IIII[II[I)V
    .locals 0

    invoke-virtual/range {p0 .. p7}, Landroidx/core/view/u;->g(IIII[II[I)Z

    return-void
.end method

.method public f(IIII[I)Z
    .locals 8

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v7}, Landroidx/core/view/u;->g(IIII[II[I)Z

    move-result p1

    return p1
.end method

.method public final g(IIII[II[I)Z
    .locals 13

    move-object/from16 v0, p5

    invoke-virtual {p0}, Landroidx/core/view/u;->l()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    move/from16 v9, p6

    invoke-virtual {p0, v9}, Landroidx/core/view/u;->h(I)Landroid/view/ViewParent;

    move-result-object v3

    if-nez v3, :cond_0

    return v2

    :cond_0
    const/4 v1, 0x1

    if-nez p1, :cond_2

    if-nez p2, :cond_2

    if-nez p3, :cond_2

    if-eqz p4, :cond_1

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_6

    aput v2, v0, v2

    aput v2, v0, v1

    goto :goto_3

    :cond_2
    :goto_0
    if-eqz v0, :cond_3

    iget-object v4, p0, Landroidx/core/view/u;->c:Landroid/view/View;

    invoke-virtual {v4, v0}, Landroid/view/View;->getLocationInWindow([I)V

    aget v4, v0, v2

    aget v5, v0, v1

    move v11, v4

    move v12, v5

    goto :goto_1

    :cond_3
    move v11, v2

    move v12, v11

    :goto_1
    if-nez p7, :cond_4

    invoke-virtual {p0}, Landroidx/core/view/u;->i()[I

    move-result-object v4

    aput v2, v4, v2

    aput v2, v4, v1

    move-object v10, v4

    goto :goto_2

    :cond_4
    move-object/from16 v10, p7

    :goto_2
    iget-object v4, p0, Landroidx/core/view/u;->c:Landroid/view/View;

    move v5, p1

    move v6, p2

    move/from16 v7, p3

    move/from16 v8, p4

    invoke-static/range {v3 .. v10}, Landroidx/core/view/w0;->d(Landroid/view/ViewParent;Landroid/view/View;IIIII[I)V

    if-eqz v0, :cond_5

    iget-object p1, p0, Landroidx/core/view/u;->c:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    aget p1, v0, v2

    sub-int/2addr p1, v11

    aput p1, v0, v2

    aget p1, v0, v1

    sub-int/2addr p1, v12

    aput p1, v0, v1

    :cond_5
    return v1

    :cond_6
    :goto_3
    return v2
.end method

.method public final h(I)Landroid/view/ViewParent;
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p1, p0, Landroidx/core/view/u;->b:Landroid/view/ViewParent;

    return-object p1

    :cond_1
    iget-object p1, p0, Landroidx/core/view/u;->a:Landroid/view/ViewParent;

    return-object p1
.end method

.method public final i()[I
    .locals 1

    iget-object v0, p0, Landroidx/core/view/u;->e:[I

    if-nez v0, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Landroidx/core/view/u;->e:[I

    :cond_0
    iget-object v0, p0, Landroidx/core/view/u;->e:[I

    return-object v0
.end method

.method public j()Z
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/core/view/u;->k(I)Z

    move-result v0

    return v0
.end method

.method public k(I)Z
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/core/view/u;->h(I)Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/core/view/u;->d:Z

    return v0
.end method

.method public m(Z)V
    .locals 1

    iget-boolean v0, p0, Landroidx/core/view/u;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/core/view/u;->c:Landroid/view/View;

    invoke-static {v0}, Landroidx/core/view/o0;->K0(Landroid/view/View;)V

    :cond_0
    iput-boolean p1, p0, Landroidx/core/view/u;->d:Z

    return-void
.end method

.method public final n(ILandroid/view/ViewParent;)V
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    iput-object p2, p0, Landroidx/core/view/u;->b:Landroid/view/ViewParent;

    return-void

    :cond_1
    iput-object p2, p0, Landroidx/core/view/u;->a:Landroid/view/ViewParent;

    return-void
.end method

.method public o(I)Z
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/core/view/u;->p(II)Z

    move-result p1

    return p1
.end method

.method public p(II)Z
    .locals 4

    invoke-virtual {p0, p2}, Landroidx/core/view/u;->k(I)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Landroidx/core/view/u;->l()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroidx/core/view/u;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v2, p0, Landroidx/core/view/u;->c:Landroid/view/View;

    :goto_0
    if-eqz v0, :cond_3

    iget-object v3, p0, Landroidx/core/view/u;->c:Landroid/view/View;

    invoke-static {v0, v2, v3, p1, p2}, Landroidx/core/view/w0;->f(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;II)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0, p2, v0}, Landroidx/core/view/u;->n(ILandroid/view/ViewParent;)V

    iget-object v3, p0, Landroidx/core/view/u;->c:Landroid/view/View;

    invoke-static {v0, v2, v3, p1, p2}, Landroidx/core/view/w0;->e(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;II)V

    return v1

    :cond_1
    instance-of v3, v0, Landroid/view/View;

    if-eqz v3, :cond_2

    move-object v2, v0

    check-cast v2, Landroid/view/View;

    :cond_2
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public q()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/core/view/u;->r(I)V

    return-void
.end method

.method public r(I)V
    .locals 2

    invoke-virtual {p0, p1}, Landroidx/core/view/u;->h(I)Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/core/view/u;->c:Landroid/view/View;

    invoke-static {v0, v1, p1}, Landroidx/core/view/w0;->g(Landroid/view/ViewParent;Landroid/view/View;I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/core/view/u;->n(ILandroid/view/ViewParent;)V

    :cond_0
    return-void
.end method
