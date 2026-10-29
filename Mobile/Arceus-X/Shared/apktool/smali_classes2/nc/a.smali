.class public Lnc/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final u:Z

.field public static final v:Z


# instance fields
.field public final a:Lcom/google/android/material/button/MaterialButton;

.field public b:Lhd/k;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:Landroid/graphics/PorterDuff$Mode;

.field public j:Landroid/content/res/ColorStateList;

.field public k:Landroid/content/res/ColorStateList;

.field public l:Landroid/content/res/ColorStateList;

.field public m:Landroid/graphics/drawable/Drawable;

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Landroid/graphics/drawable/LayerDrawable;

.field public t:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lnc/a;->u:Z

    const/4 v0, 0x0

    sput-boolean v0, Lnc/a;->v:Z

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/button/MaterialButton;Lhd/k;)V
    .locals 1
    .param p2    # Lhd/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnc/a;->n:Z

    iput-boolean v0, p0, Lnc/a;->o:Z

    iput-boolean v0, p0, Lnc/a;->p:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnc/a;->r:Z

    iput-object p1, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    iput-object p2, p0, Lnc/a;->b:Lhd/k;

    return-void
.end method


# virtual methods
.method public A(Z)V
    .locals 0

    iput-boolean p1, p0, Lnc/a;->n:Z

    invoke-virtual {p0}, Lnc/a;->J()V

    return-void
.end method

.method public B(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lnc/a;->k:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lnc/a;->k:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Lnc/a;->J()V

    :cond_0
    return-void
.end method

.method public C(I)V
    .locals 1

    iget v0, p0, Lnc/a;->h:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lnc/a;->h:I

    invoke-virtual {p0}, Lnc/a;->J()V

    :cond_0
    return-void
.end method

.method public D(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lnc/a;->j:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lnc/a;->j:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Lnc/a;->f()Lhd/g;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lnc/a;->f()Lhd/g;

    move-result-object p1

    iget-object v0, p0, Lnc/a;->j:Landroid/content/res/ColorStateList;

    invoke-static {p1, v0}, Lq2/a;->o(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public E(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lnc/a;->i:Landroid/graphics/PorterDuff$Mode;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lnc/a;->i:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0}, Lnc/a;->f()Lhd/g;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lnc/a;->i:Landroid/graphics/PorterDuff$Mode;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lnc/a;->f()Lhd/g;

    move-result-object p1

    iget-object v0, p0, Lnc/a;->i:Landroid/graphics/PorterDuff$Mode;

    invoke-static {p1, v0}, Lq2/a;->p(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public F(Z)V
    .locals 0

    iput-boolean p1, p0, Lnc/a;->r:Z

    return-void
.end method

.method public final G(II)V
    .locals 7

    iget-object v0, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-static {v0}, Landroidx/core/view/o0;->E(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    iget-object v2, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-static {v2}, Landroidx/core/view/o0;->D(Landroid/view/View;)I

    move-result v2

    iget-object v3, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    iget v4, p0, Lnc/a;->e:I

    iget v5, p0, Lnc/a;->f:I

    iput p2, p0, Lnc/a;->f:I

    iput p1, p0, Lnc/a;->e:I

    iget-boolean v6, p0, Lnc/a;->o:Z

    if-nez v6, :cond_0

    invoke-virtual {p0}, Lnc/a;->H()V

    :cond_0
    iget-object v6, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    add-int/2addr v1, p1

    sub-int/2addr v1, v4

    add-int/2addr v3, p2

    sub-int/2addr v3, v5

    invoke-static {v6, v0, v1, v2, v3}, Landroidx/core/view/o0;->B0(Landroid/view/View;IIII)V

    return-void
.end method

.method public final H()V
    .locals 2

    iget-object v0, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {p0}, Lnc/a;->a()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/button/MaterialButton;->setInternalBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Lnc/a;->f()Lhd/g;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v1, p0, Lnc/a;->t:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lhd/g;->Z(F)V

    iget-object v1, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v1}, Landroid/view/View;->getDrawableState()[I

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_0
    return-void
.end method

.method public final I(Lhd/k;)V
    .locals 4
    .param p1    # Lhd/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-boolean v0, Lnc/a;->v:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lnc/a;->o:Z

    if-nez v0, :cond_0

    iget-object p1, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-static {p1}, Landroidx/core/view/o0;->E(Landroid/view/View;)I

    move-result p1

    iget-object v0, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    iget-object v1, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-static {v1}, Landroidx/core/view/o0;->D(Landroid/view/View;)I

    move-result v1

    iget-object v2, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v2}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    invoke-virtual {p0}, Lnc/a;->H()V

    iget-object v3, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-static {v3, p1, v0, v1, v2}, Landroidx/core/view/o0;->B0(Landroid/view/View;IIII)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lnc/a;->f()Lhd/g;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lnc/a;->f()Lhd/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhd/g;->setShapeAppearanceModel(Lhd/k;)V

    :cond_1
    invoke-virtual {p0}, Lnc/a;->n()Lhd/g;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lnc/a;->n()Lhd/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhd/g;->setShapeAppearanceModel(Lhd/k;)V

    :cond_2
    invoke-virtual {p0}, Lnc/a;->e()Lhd/n;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lnc/a;->e()Lhd/n;

    move-result-object v0

    invoke-interface {v0, p1}, Lhd/n;->setShapeAppearanceModel(Lhd/k;)V

    :cond_3
    return-void
.end method

.method public final J()V
    .locals 4

    invoke-virtual {p0}, Lnc/a;->f()Lhd/g;

    move-result-object v0

    invoke-virtual {p0}, Lnc/a;->n()Lhd/g;

    move-result-object v1

    if-eqz v0, :cond_1

    iget v2, p0, Lnc/a;->h:I

    int-to-float v2, v2

    iget-object v3, p0, Lnc/a;->k:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v2, v3}, Lhd/g;->h0(FLandroid/content/res/ColorStateList;)V

    if-eqz v1, :cond_1

    iget v0, p0, Lnc/a;->h:I

    int-to-float v0, v0

    iget-boolean v2, p0, Lnc/a;->n:Z

    if-eqz v2, :cond_0

    iget-object v2, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    sget v3, Lic/b;->o:I

    invoke-static {v2, v3}, Luc/a;->d(Landroid/view/View;I)I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v0, v2}, Lhd/g;->g0(FI)V

    :cond_1
    return-void
.end method

.method public final K(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/InsetDrawable;
    .locals 6
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Landroid/graphics/drawable/InsetDrawable;

    iget v2, p0, Lnc/a;->c:I

    iget v3, p0, Lnc/a;->e:I

    iget v4, p0, Lnc/a;->d:I

    iget v5, p0, Lnc/a;->f:I

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    return-object v0
.end method

.method public final a()Landroid/graphics/drawable/Drawable;
    .locals 8

    new-instance v0, Lhd/g;

    iget-object v1, p0, Lnc/a;->b:Lhd/k;

    invoke-direct {v0, v1}, Lhd/g;-><init>(Lhd/k;)V

    iget-object v1, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lhd/g;->Q(Landroid/content/Context;)V

    iget-object v1, p0, Lnc/a;->j:Landroid/content/res/ColorStateList;

    invoke-static {v0, v1}, Lq2/a;->o(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    iget-object v1, p0, Lnc/a;->i:Landroid/graphics/PorterDuff$Mode;

    if-eqz v1, :cond_0

    invoke-static {v0, v1}, Lq2/a;->p(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    iget v1, p0, Lnc/a;->h:I

    int-to-float v1, v1

    iget-object v2, p0, Lnc/a;->k:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1, v2}, Lhd/g;->h0(FLandroid/content/res/ColorStateList;)V

    new-instance v1, Lhd/g;

    iget-object v2, p0, Lnc/a;->b:Lhd/k;

    invoke-direct {v1, v2}, Lhd/g;-><init>(Lhd/k;)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lhd/g;->setTint(I)V

    iget v3, p0, Lnc/a;->h:I

    int-to-float v3, v3

    iget-boolean v4, p0, Lnc/a;->n:Z

    if-eqz v4, :cond_1

    iget-object v4, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    sget v5, Lic/b;->o:I

    invoke-static {v4, v5}, Luc/a;->d(Landroid/view/View;I)I

    move-result v4

    goto :goto_0

    :cond_1
    move v4, v2

    :goto_0
    invoke-virtual {v1, v3, v4}, Lhd/g;->g0(FI)V

    sget-boolean v3, Lnc/a;->u:Z

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-eqz v3, :cond_2

    new-instance v3, Lhd/g;

    iget-object v6, p0, Lnc/a;->b:Lhd/k;

    invoke-direct {v3, v6}, Lhd/g;-><init>(Lhd/k;)V

    iput-object v3, p0, Lnc/a;->m:Landroid/graphics/drawable/Drawable;

    const/4 v6, -0x1

    invoke-static {v3, v6}, Lq2/a;->n(Landroid/graphics/drawable/Drawable;I)V

    new-instance v3, Landroid/graphics/drawable/RippleDrawable;

    iget-object v6, p0, Lnc/a;->l:Landroid/content/res/ColorStateList;

    invoke-static {v6}, Lfd/b;->a(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    move-result-object v6

    new-instance v7, Landroid/graphics/drawable/LayerDrawable;

    new-array v5, v5, [Landroid/graphics/drawable/Drawable;

    aput-object v1, v5, v2

    aput-object v0, v5, v4

    invoke-direct {v7, v5}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0, v7}, Lnc/a;->K(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/InsetDrawable;

    move-result-object v0

    iget-object v1, p0, Lnc/a;->m:Landroid/graphics/drawable/Drawable;

    invoke-direct {v3, v6, v0, v1}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iput-object v3, p0, Lnc/a;->s:Landroid/graphics/drawable/LayerDrawable;

    return-object v3

    :cond_2
    new-instance v3, Lfd/a;

    iget-object v6, p0, Lnc/a;->b:Lhd/k;

    invoke-direct {v3, v6}, Lfd/a;-><init>(Lhd/k;)V

    iput-object v3, p0, Lnc/a;->m:Landroid/graphics/drawable/Drawable;

    iget-object v6, p0, Lnc/a;->l:Landroid/content/res/ColorStateList;

    invoke-static {v6}, Lfd/b;->a(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    move-result-object v6

    invoke-static {v3, v6}, Lq2/a;->o(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    new-instance v3, Landroid/graphics/drawable/LayerDrawable;

    iget-object v6, p0, Lnc/a;->m:Landroid/graphics/drawable/Drawable;

    const/4 v7, 0x3

    new-array v7, v7, [Landroid/graphics/drawable/Drawable;

    aput-object v1, v7, v2

    aput-object v0, v7, v4

    aput-object v6, v7, v5

    invoke-direct {v3, v7}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object v3, p0, Lnc/a;->s:Landroid/graphics/drawable/LayerDrawable;

    invoke-virtual {p0, v3}, Lnc/a;->K(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/InsetDrawable;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lnc/a;->g:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lnc/a;->f:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lnc/a;->e:I

    return v0
.end method

.method public e()Lhd/n;
    .locals 3

    iget-object v0, p0, Lnc/a;->s:Landroid/graphics/drawable/LayerDrawable;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/graphics/drawable/LayerDrawable;->getNumberOfLayers()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    iget-object v0, p0, Lnc/a;->s:Landroid/graphics/drawable/LayerDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/LayerDrawable;->getNumberOfLayers()I

    move-result v0

    const/4 v2, 0x2

    if-le v0, v2, :cond_0

    iget-object v0, p0, Lnc/a;->s:Landroid/graphics/drawable/LayerDrawable;

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Lhd/n;

    return-object v0

    :cond_0
    iget-object v0, p0, Lnc/a;->s:Landroid/graphics/drawable/LayerDrawable;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Lhd/n;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public f()Lhd/g;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lnc/a;->g(Z)Lhd/g;

    move-result-object v0

    return-object v0
.end method

.method public final g(Z)Lhd/g;
    .locals 2

    iget-object v0, p0, Lnc/a;->s:Landroid/graphics/drawable/LayerDrawable;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/graphics/drawable/LayerDrawable;->getNumberOfLayers()I

    move-result v0

    if-lez v0, :cond_1

    sget-boolean v0, Lnc/a;->u:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnc/a;->s:Landroid/graphics/drawable/LayerDrawable;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/InsetDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/DrawableWrapper;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/LayerDrawable;

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    check-cast p1, Lhd/g;

    return-object p1

    :cond_0
    iget-object v0, p0, Lnc/a;->s:Landroid/graphics/drawable/LayerDrawable;

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    check-cast p1, Lhd/g;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public h()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lnc/a;->l:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public i()Lhd/k;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lnc/a;->b:Lhd/k;

    return-object v0
.end method

.method public j()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lnc/a;->k:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public k()I
    .locals 1

    iget v0, p0, Lnc/a;->h:I

    return v0
.end method

.method public l()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lnc/a;->j:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public m()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lnc/a;->i:Landroid/graphics/PorterDuff$Mode;

    return-object v0
.end method

.method public final n()Lhd/g;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lnc/a;->g(Z)Lhd/g;

    move-result-object v0

    return-object v0
.end method

.method public o()Z
    .locals 1

    iget-boolean v0, p0, Lnc/a;->o:Z

    return v0
.end method

.method public p()Z
    .locals 1

    iget-boolean v0, p0, Lnc/a;->q:Z

    return v0
.end method

.method public q()Z
    .locals 1

    iget-boolean v0, p0, Lnc/a;->r:Z

    return v0
.end method

.method public r(Landroid/content/res/TypedArray;)V
    .locals 5
    .param p1    # Landroid/content/res/TypedArray;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget v0, Lic/k;->H2:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v0

    iput v0, p0, Lnc/a;->c:I

    sget v0, Lic/k;->I2:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v0

    iput v0, p0, Lnc/a;->d:I

    sget v0, Lic/k;->J2:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v0

    iput v0, p0, Lnc/a;->e:I

    sget v0, Lic/k;->K2:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v0

    iput v0, p0, Lnc/a;->f:I

    sget v0, Lic/k;->O2:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, -0x1

    if-eqz v2, :cond_0

    invoke-virtual {p1, v0, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lnc/a;->g:I

    iget-object v2, p0, Lnc/a;->b:Lhd/k;

    int-to-float v0, v0

    invoke-virtual {v2, v0}, Lhd/k;->w(F)Lhd/k;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnc/a;->z(Lhd/k;)V

    iput-boolean v3, p0, Lnc/a;->p:Z

    :cond_0
    sget v0, Lic/k;->Y2:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lnc/a;->h:I

    sget v0, Lic/k;->N2:I

    invoke-virtual {p1, v0, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v0, v2}, Lad/r;->i(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    iput-object v0, p0, Lnc/a;->i:Landroid/graphics/PorterDuff$Mode;

    iget-object v0, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lic/k;->M2:I

    invoke-static {v0, p1, v2}, Led/c;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lnc/a;->j:Landroid/content/res/ColorStateList;

    iget-object v0, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lic/k;->X2:I

    invoke-static {v0, p1, v2}, Led/c;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lnc/a;->k:Landroid/content/res/ColorStateList;

    iget-object v0, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lic/k;->W2:I

    invoke-static {v0, p1, v2}, Led/c;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lnc/a;->l:Landroid/content/res/ColorStateList;

    sget v0, Lic/k;->L2:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lnc/a;->q:Z

    sget v0, Lic/k;->P2:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lnc/a;->t:I

    sget v0, Lic/k;->Z2:I

    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lnc/a;->r:Z

    iget-object v0, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-static {v0}, Landroidx/core/view/o0;->E(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    iget-object v2, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-static {v2}, Landroidx/core/view/o0;->D(Landroid/view/View;)I

    move-result v2

    iget-object v3, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sget v4, Lic/k;->G2:I

    invoke-virtual {p1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lnc/a;->t()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lnc/a;->H()V

    :goto_0
    iget-object p1, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    iget v4, p0, Lnc/a;->c:I

    add-int/2addr v0, v4

    iget v4, p0, Lnc/a;->e:I

    add-int/2addr v1, v4

    iget v4, p0, Lnc/a;->d:I

    add-int/2addr v2, v4

    iget v4, p0, Lnc/a;->f:I

    add-int/2addr v3, v4

    invoke-static {p1, v0, v1, v2, v3}, Landroidx/core/view/o0;->B0(Landroid/view/View;IIII)V

    return-void
.end method

.method public s(I)V
    .locals 1

    invoke-virtual {p0}, Lnc/a;->f()Lhd/g;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lnc/a;->f()Lhd/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhd/g;->setTint(I)V

    :cond_0
    return-void
.end method

.method public t()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnc/a;->o:Z

    iget-object v0, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    iget-object v1, p0, Lnc/a;->j:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Lcom/google/android/material/button/MaterialButton;->setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    iget-object v1, p0, Lnc/a;->i:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1}, Lcom/google/android/material/button/MaterialButton;->setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public u(Z)V
    .locals 0

    iput-boolean p1, p0, Lnc/a;->q:Z

    return-void
.end method

.method public v(I)V
    .locals 1

    iget-boolean v0, p0, Lnc/a;->p:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lnc/a;->g:I

    if-eq v0, p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iput p1, p0, Lnc/a;->g:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnc/a;->p:Z

    iget-object v0, p0, Lnc/a;->b:Lhd/k;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Lhd/k;->w(F)Lhd/k;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnc/a;->z(Lhd/k;)V

    return-void
.end method

.method public w(I)V
    .locals 1

    iget v0, p0, Lnc/a;->e:I

    invoke-virtual {p0, v0, p1}, Lnc/a;->G(II)V

    return-void
.end method

.method public x(I)V
    .locals 1

    iget v0, p0, Lnc/a;->f:I

    invoke-virtual {p0, p1, v0}, Lnc/a;->G(II)V

    return-void
.end method

.method public y(Landroid/content/res/ColorStateList;)V
    .locals 2

    iget-object v0, p0, Lnc/a;->l:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_1

    iput-object p1, p0, Lnc/a;->l:Landroid/content/res/ColorStateList;

    sget-boolean v0, Lnc/a;->u:Z

    if-eqz v0, :cond_0

    iget-object v1, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    instance-of v1, v1, Landroid/graphics/drawable/RippleDrawable;

    if-eqz v1, :cond_0

    iget-object v0, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/RippleDrawable;

    invoke-static {p1}, Lfd/b;->a(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/RippleDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    return-void

    :cond_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v0, v0, Lfd/a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnc/a;->a:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Lfd/a;

    invoke-static {p1}, Lfd/b;->a(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lfd/a;->setTintList(Landroid/content/res/ColorStateList;)V

    :cond_1
    return-void
.end method

.method public z(Lhd/k;)V
    .locals 0
    .param p1    # Lhd/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iput-object p1, p0, Lnc/a;->b:Lhd/k;

    invoke-virtual {p0, p1}, Lnc/a;->I(Lhd/k;)V

    return-void
.end method
