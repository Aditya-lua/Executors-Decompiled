.class public final Ldd/j;
.super Ldd/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ldd/b;",
        ">",
        "Ldd/g;"
    }
.end annotation


# instance fields
.field public p:Ldd/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldd/h<",
            "TS;>;"
        }
    .end annotation
.end field

.field public q:Ldd/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldd/i<",
            "Landroid/animation/ObjectAnimator;",
            ">;"
        }
    .end annotation
.end field

.field public r:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ldd/b;Ldd/h;Ldd/i;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ldd/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ldd/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ldd/i;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ldd/b;",
            "Ldd/h<",
            "TS;>;",
            "Ldd/i<",
            "Landroid/animation/ObjectAnimator;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ldd/g;-><init>(Landroid/content/Context;Ldd/b;)V

    invoke-virtual {p0, p3}, Ldd/j;->y(Ldd/h;)V

    invoke-virtual {p0, p4}, Ldd/j;->x(Ldd/i;)V

    return-void
.end method

.method public static t(Landroid/content/Context;Ldd/e;Ldd/c;)Ldd/j;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ldd/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ldd/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ldd/e;",
            "Ldd/c;",
            ")",
            "Ldd/j<",
            "Ldd/e;",
            ">;"
        }
    .end annotation

    new-instance v0, Ldd/j;

    new-instance v1, Ldd/d;

    invoke-direct {v1, p1}, Ldd/d;-><init>(Ldd/e;)V

    invoke-direct {v0, p0, p1, p2, v1}, Ldd/j;-><init>(Landroid/content/Context;Ldd/b;Ldd/h;Ldd/i;)V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget p1, Lic/e;->d:I

    const/4 p2, 0x0

    invoke-static {p0, p1, p2}, Lp5/f;->b(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Lp5/f;

    move-result-object p0

    invoke-virtual {v0, p0}, Ldd/j;->z(Landroid/graphics/drawable/Drawable;)V

    return-object v0
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 10
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p0}, Ldd/j;->w()Z

    move-result v0

    const/4 v8, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ldd/j;->r:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    iget-object v0, p0, Ldd/j;->r:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Ldd/g;->b:Ldd/b;

    iget-object v2, v2, Ldd/b;->c:[I

    aget v2, v2, v8

    invoke-static {v0, v2}, Lq2/a;->n(Landroid/graphics/drawable/Drawable;I)V

    iget-object v0, p0, Ldd/j;->r:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void

    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-object v0, p0, Ldd/j;->p:Ldd/h;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {p0}, Ldd/g;->h()F

    move-result v3

    invoke-virtual {p0}, Ldd/j;->k()Z

    move-result v4

    invoke-virtual {p0}, Ldd/j;->j()Z

    move-result v5

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Ldd/h;->g(Landroid/graphics/Canvas;Landroid/graphics/Rect;FZZ)V

    iget-object v0, p0, Ldd/g;->b:Ldd/b;

    iget v9, v0, Ldd/b;->g:I

    invoke-virtual {p0}, Ldd/j;->getAlpha()I

    move-result v6

    if-nez v9, :cond_2

    iget-object v0, p0, Ldd/j;->p:Ldd/h;

    iget-object v2, p0, Ldd/g;->m:Landroid/graphics/Paint;

    iget-object v1, p0, Ldd/g;->b:Ldd/b;

    iget v5, v1, Ldd/b;->d:I

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    move-object v1, p1

    invoke-virtual/range {v0 .. v7}, Ldd/h;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    move v7, v9

    goto :goto_0

    :cond_2
    iget-object v0, p0, Ldd/j;->q:Ldd/i;

    iget-object v0, v0, Ldd/i;->b:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldd/h$a;

    iget-object v1, p0, Ldd/j;->q:Ldd/i;

    iget-object v1, v1, Ldd/i;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldd/h$a;

    iget-object v2, p0, Ldd/j;->p:Ldd/h;

    move-object v3, v2

    iget-object v2, p0, Ldd/g;->m:Landroid/graphics/Paint;

    iget v1, v1, Ldd/h$a;->b:F

    iget v0, v0, Ldd/h$a;->a:F

    const/high16 v4, 0x3f800000    # 1.0f

    add-float/2addr v4, v0

    iget-object v0, p0, Ldd/g;->b:Ldd/b;

    iget v5, v0, Ldd/b;->d:I

    const/4 v6, 0x0

    move-object v0, v3

    move v7, v9

    move v3, v1

    move-object v1, p1

    invoke-virtual/range {v0 .. v7}, Ldd/h;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    :goto_0
    iget-object v0, p0, Ldd/j;->q:Ldd/i;

    iget-object v0, v0, Ldd/i;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_4

    iget-object v0, p0, Ldd/j;->q:Ldd/i;

    iget-object v0, v0, Ldd/i;->b:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldd/h$a;

    iget-object v2, p0, Ldd/j;->p:Ldd/h;

    iget-object v3, p0, Ldd/g;->m:Landroid/graphics/Paint;

    invoke-virtual {p0}, Ldd/j;->getAlpha()I

    move-result v4

    invoke-virtual {v2, p1, v3, v0, v4}, Ldd/h;->c(Landroid/graphics/Canvas;Landroid/graphics/Paint;Ldd/h$a;I)V

    if-lez v8, :cond_3

    if-lez v7, :cond_3

    iget-object v2, p0, Ldd/j;->q:Ldd/i;

    iget-object v2, v2, Ldd/i;->b:Ljava/util/List;

    add-int/lit8 v3, v8, -0x1

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldd/h$a;

    iget-object v3, p0, Ldd/j;->p:Ldd/h;

    iget-object v4, p0, Ldd/g;->m:Landroid/graphics/Paint;

    iget v2, v2, Ldd/h$a;->b:F

    iget v0, v0, Ldd/h$a;->a:F

    iget-object v5, p0, Ldd/g;->b:Ldd/b;

    iget v5, v5, Ldd/b;->d:I

    move-object v1, v4

    move v4, v0

    move-object v0, v3

    move v3, v2

    move-object v2, v1

    move-object v1, p1

    invoke-virtual/range {v0 .. v7}, Ldd/h;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic getAlpha()I
    .locals 1

    invoke-super {p0}, Ldd/g;->getAlpha()I

    move-result v0

    return v0
.end method

.method public getIntrinsicHeight()I
    .locals 1

    iget-object v0, p0, Ldd/j;->p:Ldd/h;

    invoke-virtual {v0}, Ldd/h;->e()I

    move-result v0

    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 1

    iget-object v0, p0, Ldd/j;->p:Ldd/h;

    invoke-virtual {v0}, Ldd/h;->f()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getOpacity()I
    .locals 1

    invoke-super {p0}, Ldd/g;->getOpacity()I

    move-result v0

    return v0
.end method

.method public bridge synthetic i()Z
    .locals 1

    invoke-super {p0}, Ldd/g;->i()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic isRunning()Z
    .locals 1

    invoke-super {p0}, Ldd/g;->isRunning()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic j()Z
    .locals 1

    invoke-super {p0}, Ldd/g;->j()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic k()Z
    .locals 1

    invoke-super {p0}, Ldd/g;->k()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic m(Lp5/b;)V
    .locals 0
    .param p1    # Lp5/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Ldd/g;->m(Lp5/b;)V

    return-void
.end method

.method public bridge synthetic q(ZZZ)Z
    .locals 0

    invoke-super {p0, p1, p2, p3}, Ldd/g;->q(ZZZ)Z

    move-result p1

    return p1
.end method

.method public r(ZZZ)Z
    .locals 2

    invoke-super {p0, p1, p2, p3}, Ldd/g;->r(ZZZ)Z

    move-result v0

    invoke-virtual {p0}, Ldd/j;->w()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ldd/j;->r:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0}, Ldd/j;->isRunning()Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p2, p0, Ldd/j;->q:Ldd/i;

    invoke-virtual {p2}, Ldd/i;->a()V

    :cond_1
    if-eqz p1, :cond_3

    if-nez p3, :cond_2

    return v0

    :cond_2
    iget-object p1, p0, Ldd/j;->q:Ldd/i;

    invoke-virtual {p1}, Ldd/i;->g()V

    :cond_3
    return v0
.end method

.method public bridge synthetic s(Lp5/b;)Z
    .locals 0
    .param p1    # Lp5/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Ldd/g;->s(Lp5/b;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic setAlpha(I)V
    .locals 0

    invoke-super {p0, p1}, Ldd/g;->setAlpha(I)V

    return-void
.end method

.method public bridge synthetic setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    invoke-super {p0, p1}, Ldd/g;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method public bridge synthetic setVisible(ZZ)Z
    .locals 0

    invoke-super {p0, p1, p2}, Ldd/g;->setVisible(ZZ)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic start()V
    .locals 0

    invoke-super {p0}, Ldd/g;->start()V

    return-void
.end method

.method public bridge synthetic stop()V
    .locals 0

    invoke-super {p0}, Ldd/g;->stop()V

    return-void
.end method

.method public u()Ldd/i;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldd/i<",
            "Landroid/animation/ObjectAnimator;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldd/j;->q:Ldd/i;

    return-object v0
.end method

.method public v()Ldd/h;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldd/h<",
            "TS;>;"
        }
    .end annotation

    iget-object v0, p0, Ldd/j;->p:Ldd/h;

    return-object v0
.end method

.method public final w()Z
    .locals 3

    iget-object v0, p0, Ldd/g;->c:Ldd/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Ldd/g;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-virtual {v0, v2}, Ldd/a;->a(Landroid/content/ContentResolver;)F

    move-result v0

    const/4 v2, 0x0

    cmpl-float v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public x(Ldd/i;)V
    .locals 0
    .param p1    # Ldd/i;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldd/i<",
            "Landroid/animation/ObjectAnimator;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldd/j;->q:Ldd/i;

    invoke-virtual {p1, p0}, Ldd/i;->e(Ldd/j;)V

    return-void
.end method

.method public y(Ldd/h;)V
    .locals 0
    .param p1    # Ldd/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldd/h<",
            "TS;>;)V"
        }
    .end annotation

    iput-object p1, p0, Ldd/j;->p:Ldd/h;

    return-void
.end method

.method public z(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, Ldd/j;->r:Landroid/graphics/drawable/Drawable;

    return-void
.end method
