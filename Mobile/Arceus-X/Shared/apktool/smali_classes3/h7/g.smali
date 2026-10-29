.class public Lh7/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh7/e;
.implements Li7/a$b;
.implements Lh7/k;


# instance fields
.field public final a:Landroid/graphics/Path;

.field public final b:Landroid/graphics/Paint;

.field public final c:Lo7/b;

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lh7/m;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public i:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "Landroid/graphics/ColorFilter;",
            "Landroid/graphics/ColorFilter;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Lf7/h0;

.field public k:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public l:F


# direct methods
.method public constructor <init>(Lf7/h0;Lo7/b;Ln7/p;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lh7/g;->a:Landroid/graphics/Path;

    new-instance v1, Lg7/a;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lg7/a;-><init>(I)V

    iput-object v1, p0, Lh7/g;->b:Landroid/graphics/Paint;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lh7/g;->f:Ljava/util/List;

    iput-object p2, p0, Lh7/g;->c:Lo7/b;

    invoke-virtual {p3}, Ln7/p;->d()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lh7/g;->d:Ljava/lang/String;

    invoke-virtual {p3}, Ln7/p;->f()Z

    move-result v1

    iput-boolean v1, p0, Lh7/g;->e:Z

    iput-object p1, p0, Lh7/g;->j:Lf7/h0;

    invoke-virtual {p2}, Lo7/b;->x()Ln7/a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Lo7/b;->x()Ln7/a;

    move-result-object p1

    invoke-virtual {p1}, Ln7/a;->a()Lm7/b;

    move-result-object p1

    invoke-virtual {p1}, Lm7/b;->d()Li7/d;

    move-result-object p1

    iput-object p1, p0, Lh7/g;->k:Li7/a;

    invoke-virtual {p1, p0}, Li7/a;->a(Li7/a$b;)V

    iget-object p1, p0, Lh7/g;->k:Li7/a;

    invoke-virtual {p2, p1}, Lo7/b;->j(Li7/a;)V

    :cond_0
    invoke-virtual {p3}, Ln7/p;->b()Lm7/a;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p3}, Ln7/p;->e()Lm7/d;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p3}, Ln7/p;->c()Landroid/graphics/Path$FillType;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    invoke-virtual {p3}, Ln7/p;->b()Lm7/a;

    move-result-object p1

    invoke-virtual {p1}, Lm7/a;->a()Li7/a;

    move-result-object p1

    iput-object p1, p0, Lh7/g;->g:Li7/a;

    invoke-virtual {p1, p0}, Li7/a;->a(Li7/a$b;)V

    invoke-virtual {p2, p1}, Lo7/b;->j(Li7/a;)V

    invoke-virtual {p3}, Ln7/p;->e()Lm7/d;

    move-result-object p1

    invoke-virtual {p1}, Lm7/d;->a()Li7/a;

    move-result-object p1

    iput-object p1, p0, Lh7/g;->h:Li7/a;

    invoke-virtual {p1, p0}, Li7/a;->a(Li7/a$b;)V

    invoke-virtual {p2, p1}, Lo7/b;->j(Li7/a;)V

    return-void

    :cond_2
    :goto_0
    const/4 p1, 0x0

    iput-object p1, p0, Lh7/g;->g:Li7/a;

    iput-object p1, p0, Lh7/g;->h:Li7/a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lh7/g;->j:Lf7/h0;

    invoke-virtual {v0}, Lf7/h0;->invalidateSelf()V

    return-void
.end method

.method public b(Ljava/util/List;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lh7/c;",
            ">;",
            "Ljava/util/List<",
            "Lh7/c;",
            ">;)V"
        }
    .end annotation

    const/4 p1, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh7/c;

    instance-of v1, v0, Lh7/m;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lh7/g;->f:Ljava/util/List;

    check-cast v0, Lh7/m;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public c(Ljava/lang/Object;Lt7/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lt7/c<",
            "TT;>;)V"
        }
    .end annotation

    sget-object v0, Lf7/o0;->a:Ljava/lang/Integer;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lh7/g;->g:Li7/a;

    invoke-virtual {p1, p2}, Li7/a;->o(Lt7/c;)V

    return-void

    :cond_0
    sget-object v0, Lf7/o0;->d:Ljava/lang/Integer;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lh7/g;->h:Li7/a;

    invoke-virtual {p1, p2}, Li7/a;->o(Lt7/c;)V

    return-void

    :cond_1
    sget-object v0, Lf7/o0;->K:Landroid/graphics/ColorFilter;

    if-ne p1, v0, :cond_4

    iget-object p1, p0, Lh7/g;->i:Li7/a;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lh7/g;->c:Lo7/b;

    invoke-virtual {v0, p1}, Lo7/b;->H(Li7/a;)V

    :cond_2
    if-nez p2, :cond_3

    const/4 p1, 0x0

    iput-object p1, p0, Lh7/g;->i:Li7/a;

    return-void

    :cond_3
    new-instance p1, Li7/q;

    invoke-direct {p1, p2}, Li7/q;-><init>(Lt7/c;)V

    iput-object p1, p0, Lh7/g;->i:Li7/a;

    invoke-virtual {p1, p0}, Li7/a;->a(Li7/a$b;)V

    iget-object p1, p0, Lh7/g;->c:Lo7/b;

    iget-object p2, p0, Lh7/g;->i:Li7/a;

    invoke-virtual {p1, p2}, Lo7/b;->j(Li7/a;)V

    return-void

    :cond_4
    sget-object v0, Lf7/o0;->j:Ljava/lang/Float;

    if-ne p1, v0, :cond_6

    iget-object p1, p0, Lh7/g;->k:Li7/a;

    if-eqz p1, :cond_5

    invoke-virtual {p1, p2}, Li7/a;->o(Lt7/c;)V

    return-void

    :cond_5
    new-instance p1, Li7/q;

    invoke-direct {p1, p2}, Li7/q;-><init>(Lt7/c;)V

    iput-object p1, p0, Lh7/g;->k:Li7/a;

    invoke-virtual {p1, p0}, Li7/a;->a(Li7/a$b;)V

    iget-object p1, p0, Lh7/g;->c:Lo7/b;

    iget-object p2, p0, Lh7/g;->k:Li7/a;

    invoke-virtual {p1, p2}, Lo7/b;->j(Li7/a;)V

    :cond_6
    return-void
.end method

.method public e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 3

    iget-object p3, p0, Lh7/g;->a:Landroid/graphics/Path;

    invoke-virtual {p3}, Landroid/graphics/Path;->reset()V

    const/4 p3, 0x0

    move v0, p3

    :goto_0
    iget-object v1, p0, Lh7/g;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lh7/g;->a:Landroid/graphics/Path;

    iget-object v2, p0, Lh7/g;->f:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh7/m;

    invoke-interface {v2}, Lh7/m;->getPath()Landroid/graphics/Path;

    move-result-object v2

    invoke-virtual {v1, v2, p2}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lh7/g;->a:Landroid/graphics/Path;

    invoke-virtual {p2, p1, p3}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    iget p2, p1, Landroid/graphics/RectF;->left:F

    const/high16 p3, 0x3f800000    # 1.0f

    sub-float/2addr p2, p3

    iget v0, p1, Landroid/graphics/RectF;->top:F

    sub-float/2addr v0, p3

    iget v1, p1, Landroid/graphics/RectF;->right:F

    add-float/2addr v1, p3

    iget v2, p1, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v2, p3

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh7/g;->d:Ljava/lang/String;

    return-object v0
.end method

.method public h(Ll7/e;ILjava/util/List;Ll7/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll7/e;",
            "I",
            "Ljava/util/List<",
            "Ll7/e;",
            ">;",
            "Ll7/e;",
            ")V"
        }
    .end annotation

    invoke-static {p1, p2, p3, p4, p0}, Ls7/j;->k(Ll7/e;ILjava/util/List;Ll7/e;Lh7/k;)V

    return-void
.end method

.method public i(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILs7/b;)V
    .locals 6

    iget-boolean v0, p0, Lh7/g;->e:Z

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-static {}, Lf7/e;->h()Z

    move-result v0

    const-string v1, "FillContent#draw"

    if-eqz v0, :cond_1

    invoke-static {v1}, Lf7/e;->b(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lh7/g;->g:Li7/a;

    check-cast v0, Li7/b;

    invoke-virtual {v0}, Li7/b;->r()I

    move-result v0

    iget-object v2, p0, Lh7/g;->h:Li7/a;

    invoke-virtual {v2}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr v2, v3

    int-to-float p3, p3

    mul-float/2addr p3, v2

    float-to-int p3, p3

    const/16 v3, 0xff

    const/4 v4, 0x0

    invoke-static {p3, v4, v3}, Ls7/j;->c(III)I

    move-result p3

    iget-object v3, p0, Lh7/g;->b:Landroid/graphics/Paint;

    shl-int/lit8 p3, p3, 0x18

    const v5, 0xffffff

    and-int/2addr v0, v5

    or-int/2addr p3, v0

    invoke-virtual {v3, p3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p3, p0, Lh7/g;->i:Li7/a;

    if-eqz p3, :cond_2

    iget-object v0, p0, Lh7/g;->b:Landroid/graphics/Paint;

    invoke-virtual {p3}, Li7/a;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/ColorFilter;

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    :cond_2
    iget-object p3, p0, Lh7/g;->k:Li7/a;

    if-eqz p3, :cond_5

    invoke-virtual {p3}, Li7/a;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p3

    const/4 v0, 0x0

    cmpl-float v0, p3, v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lh7/g;->b:Landroid/graphics/Paint;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    goto :goto_0

    :cond_3
    iget v0, p0, Lh7/g;->l:F

    cmpl-float v0, p3, v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lh7/g;->c:Lo7/b;

    invoke-virtual {v0, p3}, Lo7/b;->y(F)Landroid/graphics/BlurMaskFilter;

    move-result-object v0

    iget-object v3, p0, Lh7/g;->b:Landroid/graphics/Paint;

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    :cond_4
    :goto_0
    iput p3, p0, Lh7/g;->l:F

    :cond_5
    if-eqz p4, :cond_6

    const/high16 p3, 0x437f0000    # 255.0f

    mul-float/2addr v2, p3

    float-to-int p3, v2

    iget-object v0, p0, Lh7/g;->b:Landroid/graphics/Paint;

    invoke-virtual {p4, p3, v0}, Ls7/b;->c(ILandroid/graphics/Paint;)V

    goto :goto_1

    :cond_6
    iget-object p3, p0, Lh7/g;->b:Landroid/graphics/Paint;

    invoke-virtual {p3}, Landroid/graphics/Paint;->clearShadowLayer()V

    :goto_1
    iget-object p3, p0, Lh7/g;->a:Landroid/graphics/Path;

    invoke-virtual {p3}, Landroid/graphics/Path;->reset()V

    :goto_2
    iget-object p3, p0, Lh7/g;->f:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    if-ge v4, p3, :cond_7

    iget-object p3, p0, Lh7/g;->a:Landroid/graphics/Path;

    iget-object p4, p0, Lh7/g;->f:Ljava/util/List;

    invoke-interface {p4, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lh7/m;

    invoke-interface {p4}, Lh7/m;->getPath()Landroid/graphics/Path;

    move-result-object p4

    invoke-virtual {p3, p4, p2}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_7
    iget-object p2, p0, Lh7/g;->a:Landroid/graphics/Path;

    iget-object p3, p0, Lh7/g;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-static {}, Lf7/e;->h()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {v1}, Lf7/e;->c(Ljava/lang/String;)F

    :cond_8
    :goto_3
    return-void
.end method
