.class public Lv1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv1/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lv1/b;)F
    .locals 0

    invoke-virtual {p0, p1}, Lv1/a;->p(Lv1/b;)Lv1/d;

    move-result-object p1

    invoke-virtual {p1}, Lv1/d;->d()F

    move-result p1

    return p1
.end method

.method public b(Lv1/b;)F
    .locals 1

    invoke-virtual {p0, p1}, Lv1/a;->a(Lv1/b;)F

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr p1, v0

    return p1
.end method

.method public c(Lv1/b;Landroid/content/res/ColorStateList;)V
    .locals 0

    invoke-virtual {p0, p1}, Lv1/a;->p(Lv1/b;)Lv1/d;

    move-result-object p1

    invoke-virtual {p1, p2}, Lv1/d;->f(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public d(Lv1/b;)F
    .locals 0

    invoke-interface {p1}, Lv1/b;->f()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getElevation()F

    move-result p1

    return p1
.end method

.method public e(Lv1/b;Landroid/content/Context;Landroid/content/res/ColorStateList;FFF)V
    .locals 0

    new-instance p2, Lv1/d;

    invoke-direct {p2, p3, p4}, Lv1/d;-><init>(Landroid/content/res/ColorStateList;F)V

    invoke-interface {p1, p2}, Lv1/b;->b(Landroid/graphics/drawable/Drawable;)V

    invoke-interface {p1}, Lv1/b;->f()Landroid/view/View;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Landroid/view/View;->setClipToOutline(Z)V

    invoke-virtual {p2, p5}, Landroid/view/View;->setElevation(F)V

    invoke-virtual {p0, p1, p6}, Lv1/a;->f(Lv1/b;F)V

    return-void
.end method

.method public f(Lv1/b;F)V
    .locals 3

    invoke-virtual {p0, p1}, Lv1/a;->p(Lv1/b;)Lv1/d;

    move-result-object v0

    invoke-interface {p1}, Lv1/b;->c()Z

    move-result v1

    invoke-interface {p1}, Lv1/b;->e()Z

    move-result v2

    invoke-virtual {v0, p2, v1, v2}, Lv1/d;->g(FZZ)V

    invoke-virtual {p0, p1}, Lv1/a;->l(Lv1/b;)V

    return-void
.end method

.method public g(Lv1/b;)Landroid/content/res/ColorStateList;
    .locals 0

    invoke-virtual {p0, p1}, Lv1/a;->p(Lv1/b;)Lv1/d;

    move-result-object p1

    invoke-virtual {p1}, Lv1/d;->b()Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1
.end method

.method public h(Lv1/b;)F
    .locals 1

    invoke-virtual {p0, p1}, Lv1/a;->a(Lv1/b;)F

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr p1, v0

    return p1
.end method

.method public i(Lv1/b;)F
    .locals 0

    invoke-virtual {p0, p1}, Lv1/a;->p(Lv1/b;)Lv1/d;

    move-result-object p1

    invoke-virtual {p1}, Lv1/d;->c()F

    move-result p1

    return p1
.end method

.method public j(Lv1/b;)V
    .locals 1

    invoke-virtual {p0, p1}, Lv1/a;->i(Lv1/b;)F

    move-result v0

    invoke-virtual {p0, p1, v0}, Lv1/a;->f(Lv1/b;F)V

    return-void
.end method

.method public k(Lv1/b;F)V
    .locals 0

    invoke-interface {p1}, Lv1/b;->f()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setElevation(F)V

    return-void
.end method

.method public l(Lv1/b;)V
    .locals 4

    invoke-interface {p1}, Lv1/b;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0, v0, v0, v0}, Lv1/b;->a(IIII)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lv1/a;->i(Lv1/b;)F

    move-result v0

    invoke-virtual {p0, p1}, Lv1/a;->a(Lv1/b;)F

    move-result v1

    invoke-interface {p1}, Lv1/b;->e()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lv1/e;->a(FFZ)F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    invoke-interface {p1}, Lv1/b;->e()Z

    move-result v3

    invoke-static {v0, v1, v3}, Lv1/e;->b(FFZ)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-interface {p1, v2, v0, v2, v0}, Lv1/b;->a(IIII)V

    return-void
.end method

.method public m(Lv1/b;)V
    .locals 1

    invoke-virtual {p0, p1}, Lv1/a;->i(Lv1/b;)F

    move-result v0

    invoke-virtual {p0, p1, v0}, Lv1/a;->f(Lv1/b;F)V

    return-void
.end method

.method public n(Lv1/b;F)V
    .locals 0

    invoke-virtual {p0, p1}, Lv1/a;->p(Lv1/b;)Lv1/d;

    move-result-object p1

    invoke-virtual {p1, p2}, Lv1/d;->h(F)V

    return-void
.end method

.method public o()V
    .locals 0

    return-void
.end method

.method public final p(Lv1/b;)Lv1/d;
    .locals 0

    invoke-interface {p1}, Lv1/b;->d()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    check-cast p1, Lv1/d;

    return-object p1
.end method
