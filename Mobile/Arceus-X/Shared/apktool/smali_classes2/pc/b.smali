.class public Lpc/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final A:Landroid/graphics/drawable/Drawable;

.field public static final z:D


# instance fields
.field public final a:Lcom/google/android/material/card/MaterialCardView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final b:Landroid/graphics/Rect;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final c:Lhd/g;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final d:Lhd/g;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:Landroid/graphics/drawable/Drawable;

.field public j:Landroid/graphics/drawable/Drawable;

.field public k:Landroid/content/res/ColorStateList;

.field public l:Landroid/content/res/ColorStateList;

.field public m:Lhd/k;

.field public n:Landroid/content/res/ColorStateList;

.field public o:Landroid/graphics/drawable/Drawable;

.field public p:Landroid/graphics/drawable/LayerDrawable;

.field public q:Lhd/g;

.field public r:Lhd/g;

.field public s:Z

.field public t:Z

.field public u:Landroid/animation/ValueAnimator;

.field public final v:Landroid/animation/TimeInterpolator;

.field public final w:I

.field public final x:I

.field public y:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, 0x4046800000000000L    # 45.0

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    sput-wide v0, Lpc/b;->z:D

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-gt v0, v1, :cond_0

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/ColorDrawable;-><init>()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-object v0, Lpc/b;->A:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/card/MaterialCardView;Landroid/util/AttributeSet;II)V
    .locals 4
    .param p1    # Lcom/google/android/material/card/MaterialCardView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lpc/b;->b:Landroid/graphics/Rect;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lpc/b;->s:Z

    const/4 v0, 0x0

    iput v0, p0, Lpc/b;->y:F

    iput-object p1, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    new-instance v1, Lhd/g;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, p2, p3, p4}, Lhd/g;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    iput-object v1, p0, Lpc/b;->c:Lhd/g;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p4

    invoke-virtual {v1, p4}, Lhd/g;->Q(Landroid/content/Context;)V

    const p4, -0xbbbbbc

    invoke-virtual {v1, p4}, Lhd/g;->f0(I)V

    invoke-virtual {v1}, Lhd/g;->E()Lhd/k;

    move-result-object p4

    invoke-virtual {p4}, Lhd/k;->v()Lhd/k$b;

    move-result-object p4

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lic/k;->j0:[I

    sget v3, Lic/j;->a:I

    invoke-virtual {v1, p2, v2, p3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    sget p3, Lic/k;->k0:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p3

    invoke-virtual {p4, p3}, Lhd/k$b;->o(F)Lhd/k$b;

    :cond_0
    new-instance p3, Lhd/g;

    invoke-direct {p3}, Lhd/g;-><init>()V

    iput-object p3, p0, Lpc/b;->d:Lhd/g;

    invoke-virtual {p4}, Lhd/k$b;->m()Lhd/k;

    move-result-object p3

    invoke-virtual {p0, p3}, Lpc/b;->Y(Lhd/k;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    sget p4, Lic/b;->Q:I

    sget-object v0, Ljc/a;->a:Landroid/animation/TimeInterpolator;

    invoke-static {p3, p4, v0}, Lcd/h;->g(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    move-result-object p3

    iput-object p3, p0, Lpc/b;->v:Landroid/animation/TimeInterpolator;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    sget p4, Lic/b;->K:I

    const/16 v0, 0x12c

    invoke-static {p3, p4, v0}, Lcd/h;->f(Landroid/content/Context;II)I

    move-result p3

    iput p3, p0, Lpc/b;->w:I

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget p3, Lic/b;->J:I

    invoke-static {p1, p3, v0}, Lcd/h;->f(Landroid/content/Context;II)I

    move-result p1

    iput p1, p0, Lpc/b;->x:I

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static synthetic a(Lpc/b;Landroid/animation/ValueAnimator;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float/2addr v0, p1

    float-to-int v0, v0

    iget-object v1, p0, Lpc/b;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    iput p1, p0, Lpc/b;->y:F

    return-void
.end method


# virtual methods
.method public A()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lpc/b;->n:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public B()I
    .locals 1

    iget v0, p0, Lpc/b;->h:I

    return v0
.end method

.method public C()Landroid/graphics/Rect;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lpc/b;->b:Landroid/graphics/Rect;

    return-object v0
.end method

.method public final D(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 8
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroidx/cardview/widget/CardView;->getUseCompatPadding()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpc/b;->f()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-virtual {p0}, Lpc/b;->e()F

    move-result v1

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    move v5, v0

    move v4, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    move v4, v0

    move v5, v4

    :goto_0
    new-instance v1, Lpc/b$a;

    move v6, v4

    move v7, v5

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v1 .. v7}, Lpc/b$a;-><init>(Lpc/b;Landroid/graphics/drawable/Drawable;IIII)V

    return-object v1
.end method

.method public E()Z
    .locals 1

    iget-boolean v0, p0, Lpc/b;->s:Z

    return v0
.end method

.method public F()Z
    .locals 1

    iget-boolean v0, p0, Lpc/b;->t:Z

    return v0
.end method

.method public final G()Z
    .locals 2

    iget v0, p0, Lpc/b;->g:I

    const/16 v1, 0x50

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final H()Z
    .locals 2

    iget v0, p0, Lpc/b;->g:I

    const v1, 0x800005

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public I(Landroid/content/res/TypedArray;)V
    .locals 3
    .param p1    # Landroid/content/res/TypedArray;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lic/k;->J3:I

    invoke-static {v0, p1, v1}, Led/c;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lpc/b;->n:Landroid/content/res/ColorStateList;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lpc/b;->n:Landroid/content/res/ColorStateList;

    :cond_0
    sget v0, Lic/k;->K3:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lpc/b;->h:I

    sget v0, Lic/k;->B3:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lpc/b;->t:Z

    iget-object v2, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v2, v0}, Landroid/view/View;->setLongClickable(Z)V

    iget-object v0, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lic/k;->H3:I

    invoke-static {v0, p1, v2}, Led/c;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lpc/b;->l:Landroid/content/res/ColorStateList;

    iget-object v0, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lic/k;->D3:I

    invoke-static {v0, p1, v2}, Led/c;->d(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lpc/b;->Q(Landroid/graphics/drawable/Drawable;)V

    sget v0, Lic/k;->G3:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lpc/b;->T(I)V

    sget v0, Lic/k;->F3:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lpc/b;->S(I)V

    sget v0, Lic/k;->E3:I

    const v1, 0x800035

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v0

    iput v0, p0, Lpc/b;->g:I

    iget-object v0, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lic/k;->I3:I

    invoke-static {v0, p1, v1}, Led/c;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lpc/b;->k:Landroid/content/res/ColorStateList;

    if-nez v0, :cond_1

    iget-object v0, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    sget v1, Lic/b;->h:I

    invoke-static {v0, v1}, Luc/a;->d(Landroid/view/View;I)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lpc/b;->k:Landroid/content/res/ColorStateList;

    :cond_1
    iget-object v0, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lic/k;->C3:I

    invoke-static {v0, p1, v1}, Led/c;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpc/b;->M(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, Lpc/b;->k0()V

    invoke-virtual {p0}, Lpc/b;->h0()V

    invoke-virtual {p0}, Lpc/b;->l0()V

    iget-object p1, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    iget-object v0, p0, Lpc/b;->c:Lhd/g;

    invoke-virtual {p0, v0}, Lpc/b;->D(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/material/card/MaterialCardView;->setBackgroundInternal(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Lpc/b;->e0()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lpc/b;->t()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lpc/b;->d:Lhd/g;

    :goto_0
    iput-object p1, p0, Lpc/b;->i:Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {p0, p1}, Lpc/b;->D(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public J(II)V
    .locals 10

    iget-object v0, p0, Lpc/b;->p:Landroid/graphics/drawable/LayerDrawable;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroidx/cardview/widget/CardView;->getUseCompatPadding()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpc/b;->f()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v0, v1

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v0, v2

    invoke-virtual {p0}, Lpc/b;->e()F

    move-result v2

    mul-float/2addr v2, v1

    float-to-double v1, v2

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p0}, Lpc/b;->H()Z

    move-result v2

    if-eqz v2, :cond_1

    iget v2, p0, Lpc/b;->e:I

    sub-int v2, p1, v2

    iget v3, p0, Lpc/b;->f:I

    sub-int/2addr v2, v3

    sub-int/2addr v2, v1

    goto :goto_1

    :cond_1
    iget v2, p0, Lpc/b;->e:I

    :goto_1
    invoke-virtual {p0}, Lpc/b;->G()Z

    move-result v3

    if-eqz v3, :cond_2

    iget v3, p0, Lpc/b;->e:I

    :goto_2
    move v9, v3

    goto :goto_3

    :cond_2
    iget v3, p0, Lpc/b;->e:I

    sub-int v3, p2, v3

    iget v4, p0, Lpc/b;->f:I

    sub-int/2addr v3, v4

    sub-int/2addr v3, v0

    goto :goto_2

    :goto_3
    invoke-virtual {p0}, Lpc/b;->H()Z

    move-result v3

    if-eqz v3, :cond_3

    iget p1, p0, Lpc/b;->e:I

    goto :goto_4

    :cond_3
    iget v3, p0, Lpc/b;->e:I

    sub-int/2addr p1, v3

    iget v3, p0, Lpc/b;->f:I

    sub-int/2addr p1, v3

    sub-int/2addr p1, v1

    :goto_4
    invoke-virtual {p0}, Lpc/b;->G()Z

    move-result v1

    if-eqz v1, :cond_4

    iget v1, p0, Lpc/b;->e:I

    sub-int/2addr p2, v1

    iget v1, p0, Lpc/b;->f:I

    sub-int/2addr p2, v1

    sub-int/2addr p2, v0

    :goto_5
    move v7, p2

    goto :goto_6

    :cond_4
    iget p2, p0, Lpc/b;->e:I

    goto :goto_5

    :goto_6
    iget-object p2, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-static {p2}, Landroidx/core/view/o0;->z(Landroid/view/View;)I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_5

    move v6, p1

    move v8, v2

    goto :goto_7

    :cond_5
    move v8, p1

    move v6, v2

    :goto_7
    iget-object v4, p0, Lpc/b;->p:Landroid/graphics/drawable/LayerDrawable;

    const/4 v5, 0x2

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/drawable/LayerDrawable;->setLayerInset(IIIII)V

    :cond_6
    return-void
.end method

.method public K(Z)V
    .locals 0

    iput-boolean p1, p0, Lpc/b;->s:Z

    return-void
.end method

.method public L(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lpc/b;->c:Lhd/g;

    invoke-virtual {v0, p1}, Lhd/g;->a0(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public M(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lpc/b;->d:Lhd/g;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    :cond_0
    invoke-virtual {v0, p1}, Lhd/g;->a0(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public N(Z)V
    .locals 0

    iput-boolean p1, p0, Lpc/b;->t:Z

    return-void
.end method

.method public O(Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lpc/b;->P(ZZ)V

    return-void
.end method

.method public P(ZZ)V
    .locals 1

    iget-object v0, p0, Lpc/b;->j:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lpc/b;->b(Z)V

    return-void

    :cond_0
    if-eqz p1, :cond_1

    const/16 p2, 0xff

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {v0, p2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    if-eqz p1, :cond_2

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    iput p1, p0, Lpc/b;->y:F

    :cond_3
    return-void
.end method

.method public Q(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-static {p1}, Lq2/a;->r(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lpc/b;->j:Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Lpc/b;->l:Landroid/content/res/ColorStateList;

    invoke-static {p1, v0}, Lq2/a;->o(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    iget-object p1, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {p1}, Lcom/google/android/material/card/MaterialCardView;->isChecked()Z

    move-result p1

    invoke-virtual {p0, p1}, Lpc/b;->O(Z)V

    goto :goto_0

    :cond_0
    sget-object p1, Lpc/b;->A:Landroid/graphics/drawable/Drawable;

    iput-object p1, p0, Lpc/b;->j:Landroid/graphics/drawable/Drawable;

    :goto_0
    iget-object p1, p0, Lpc/b;->p:Landroid/graphics/drawable/LayerDrawable;

    if-eqz p1, :cond_1

    sget v0, Lic/f;->D:I

    iget-object v1, p0, Lpc/b;->j:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/LayerDrawable;->setDrawableByLayerId(ILandroid/graphics/drawable/Drawable;)Z

    :cond_1
    return-void
.end method

.method public R(I)V
    .locals 1

    iput p1, p0, Lpc/b;->g:I

    iget-object p1, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    iget-object v0, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lpc/b;->J(II)V

    return-void
.end method

.method public S(I)V
    .locals 0

    iput p1, p0, Lpc/b;->e:I

    return-void
.end method

.method public T(I)V
    .locals 0

    iput p1, p0, Lpc/b;->f:I

    return-void
.end method

.method public U(Landroid/content/res/ColorStateList;)V
    .locals 1

    iput-object p1, p0, Lpc/b;->l:Landroid/content/res/ColorStateList;

    iget-object v0, p0, Lpc/b;->j:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lq2/a;->o(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public V(F)V
    .locals 1

    iget-object v0, p0, Lpc/b;->m:Lhd/k;

    invoke-virtual {v0, p1}, Lhd/k;->w(F)Lhd/k;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpc/b;->Y(Lhd/k;)V

    iget-object p1, p0, Lpc/b;->i:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    invoke-virtual {p0}, Lpc/b;->d0()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lpc/b;->c0()Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lpc/b;->g0()V

    :cond_1
    invoke-virtual {p0}, Lpc/b;->d0()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lpc/b;->j0()V

    :cond_2
    return-void
.end method

.method public W(F)V
    .locals 1

    iget-object v0, p0, Lpc/b;->c:Lhd/g;

    invoke-virtual {v0, p1}, Lhd/g;->b0(F)V

    iget-object v0, p0, Lpc/b;->d:Lhd/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lhd/g;->b0(F)V

    :cond_0
    iget-object v0, p0, Lpc/b;->r:Lhd/g;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lhd/g;->b0(F)V

    :cond_1
    return-void
.end method

.method public X(Landroid/content/res/ColorStateList;)V
    .locals 0

    iput-object p1, p0, Lpc/b;->k:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Lpc/b;->k0()V

    return-void
.end method

.method public Y(Lhd/k;)V
    .locals 2
    .param p1    # Lhd/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iput-object p1, p0, Lpc/b;->m:Lhd/k;

    iget-object v0, p0, Lpc/b;->c:Lhd/g;

    invoke-virtual {v0, p1}, Lhd/g;->setShapeAppearanceModel(Lhd/k;)V

    iget-object v0, p0, Lpc/b;->c:Lhd/g;

    invoke-virtual {v0}, Lhd/g;->T()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lhd/g;->e0(Z)V

    iget-object v0, p0, Lpc/b;->d:Lhd/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lhd/g;->setShapeAppearanceModel(Lhd/k;)V

    :cond_0
    iget-object v0, p0, Lpc/b;->r:Lhd/g;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lhd/g;->setShapeAppearanceModel(Lhd/k;)V

    :cond_1
    iget-object v0, p0, Lpc/b;->q:Lhd/g;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Lhd/g;->setShapeAppearanceModel(Lhd/k;)V

    :cond_2
    return-void
.end method

.method public Z(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lpc/b;->n:Landroid/content/res/ColorStateList;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lpc/b;->n:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Lpc/b;->l0()V

    return-void
.end method

.method public a0(I)V
    .locals 1

    iget v0, p0, Lpc/b;->h:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lpc/b;->h:I

    invoke-virtual {p0}, Lpc/b;->l0()V

    return-void
.end method

.method public b(Z)V
    .locals 5

    const/high16 v0, 0x3f800000    # 1.0f

    if-eqz p1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iget v2, p0, Lpc/b;->y:F

    sub-float/2addr v0, v2

    goto :goto_1

    :cond_1
    iget v0, p0, Lpc/b;->y:F

    :goto_1
    iget-object v2, p0, Lpc/b;->u:Landroid/animation/ValueAnimator;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->cancel()V

    const/4 v2, 0x0

    iput-object v2, p0, Lpc/b;->u:Landroid/animation/ValueAnimator;

    :cond_2
    iget v2, p0, Lpc/b;->y:F

    const/4 v3, 0x2

    new-array v3, v3, [F

    const/4 v4, 0x0

    aput v2, v3, v4

    const/4 v2, 0x1

    aput v1, v3, v2

    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Lpc/b;->u:Landroid/animation/ValueAnimator;

    new-instance v2, Lpc/a;

    invoke-direct {v2, p0}, Lpc/a;-><init>(Lpc/b;)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object v1, p0, Lpc/b;->u:Landroid/animation/ValueAnimator;

    iget-object v2, p0, Lpc/b;->v:Landroid/animation/TimeInterpolator;

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v1, p0, Lpc/b;->u:Landroid/animation/ValueAnimator;

    if-eqz p1, :cond_3

    iget p1, p0, Lpc/b;->w:I

    :goto_2
    int-to-float p1, p1

    mul-float/2addr p1, v0

    float-to-long v2, p1

    goto :goto_3

    :cond_3
    iget p1, p0, Lpc/b;->x:I

    goto :goto_2

    :goto_3
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object p1, p0, Lpc/b;->u:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method public b0(IIII)V
    .locals 1

    iget-object v0, p0, Lpc/b;->b:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    invoke-virtual {p0}, Lpc/b;->g0()V

    return-void
.end method

.method public final c()F
    .locals 4

    iget-object v0, p0, Lpc/b;->m:Lhd/k;

    invoke-virtual {v0}, Lhd/k;->q()Lhd/d;

    move-result-object v0

    iget-object v1, p0, Lpc/b;->c:Lhd/g;

    invoke-virtual {v1}, Lhd/g;->J()F

    move-result v1

    invoke-virtual {p0, v0, v1}, Lpc/b;->d(Lhd/d;F)F

    move-result v0

    iget-object v1, p0, Lpc/b;->m:Lhd/k;

    invoke-virtual {v1}, Lhd/k;->s()Lhd/d;

    move-result-object v1

    iget-object v2, p0, Lpc/b;->c:Lhd/g;

    invoke-virtual {v2}, Lhd/g;->K()F

    move-result v2

    invoke-virtual {p0, v1, v2}, Lpc/b;->d(Lhd/d;F)F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iget-object v1, p0, Lpc/b;->m:Lhd/k;

    invoke-virtual {v1}, Lhd/k;->k()Lhd/d;

    move-result-object v1

    iget-object v2, p0, Lpc/b;->c:Lhd/g;

    invoke-virtual {v2}, Lhd/g;->t()F

    move-result v2

    invoke-virtual {p0, v1, v2}, Lpc/b;->d(Lhd/d;F)F

    move-result v1

    iget-object v2, p0, Lpc/b;->m:Lhd/k;

    invoke-virtual {v2}, Lhd/k;->i()Lhd/d;

    move-result-object v2

    iget-object v3, p0, Lpc/b;->c:Lhd/g;

    invoke-virtual {v3}, Lhd/g;->s()F

    move-result v3

    invoke-virtual {p0, v2, v3}, Lpc/b;->d(Lhd/d;F)F

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    return v0
.end method

.method public final c0()Z
    .locals 1

    iget-object v0, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroidx/cardview/widget/CardView;->getPreventCornerOverlap()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpc/b;->g()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final d(Lhd/d;F)F
    .locals 4

    instance-of v0, p1, Lhd/j;

    if-eqz v0, :cond_0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    sget-wide v2, Lpc/b;->z:D

    sub-double/2addr v0, v2

    float-to-double p1, p2

    mul-double/2addr v0, p1

    double-to-float p1, v0

    return p1

    :cond_0
    instance-of p1, p1, Lhd/e;

    if-eqz p1, :cond_1

    const/high16 p1, 0x40000000    # 2.0f

    div-float/2addr p2, p1

    return p2

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final d0()Z
    .locals 1

    iget-object v0, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroidx/cardview/widget/CardView;->getPreventCornerOverlap()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpc/b;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroidx/cardview/widget/CardView;->getUseCompatPadding()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e()F
    .locals 2

    iget-object v0, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroidx/cardview/widget/CardView;->getMaxCardElevation()F

    move-result v0

    invoke-virtual {p0}, Lpc/b;->d0()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lpc/b;->c()F

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-float/2addr v0, v1

    return v0
.end method

.method public final e0()Z
    .locals 2

    iget-object v0, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroid/view/View;->isClickable()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    iget-object v0, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->isDuplicateParentStateEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v1, v1, Landroid/view/View;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->isClickable()Z

    move-result v0

    return v0
.end method

.method public final f()F
    .locals 2

    iget-object v0, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroidx/cardview/widget/CardView;->getMaxCardElevation()F

    move-result v0

    const/high16 v1, 0x3fc00000    # 1.5f

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Lpc/b;->d0()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lpc/b;->c()F

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-float/2addr v0, v1

    return v0
.end method

.method public f0()V
    .locals 2

    iget-object v0, p0, Lpc/b;->i:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lpc/b;->e0()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lpc/b;->t()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lpc/b;->d:Lhd/g;

    :goto_0
    iput-object v1, p0, Lpc/b;->i:Landroid/graphics/drawable/Drawable;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0, v1}, Lpc/b;->i0(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    return-void
.end method

.method public final g()Z
    .locals 1

    iget-object v0, p0, Lpc/b;->c:Lhd/g;

    invoke-virtual {v0}, Lhd/g;->T()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public g0()V
    .locals 6

    invoke-virtual {p0}, Lpc/b;->c0()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lpc/b;->d0()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lpc/b;->c()F

    move-result v0

    :goto_1
    invoke-virtual {p0}, Lpc/b;->v()F

    move-result v1

    sub-float/2addr v0, v1

    float-to-int v0, v0

    iget-object v1, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    iget-object v2, p0, Lpc/b;->b:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->left:I

    add-int/2addr v3, v0

    iget v4, v2, Landroid/graphics/Rect;->top:I

    add-int/2addr v4, v0

    iget v5, v2, Landroid/graphics/Rect;->right:I

    add-int/2addr v5, v0

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v2, v0

    invoke-virtual {v1, v3, v4, v5, v2}, Lcom/google/android/material/card/MaterialCardView;->i(IIII)V

    return-void
.end method

.method public final h()Landroid/graphics/drawable/Drawable;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    invoke-virtual {p0}, Lpc/b;->j()Lhd/g;

    move-result-object v1

    iput-object v1, p0, Lpc/b;->q:Lhd/g;

    iget-object v2, p0, Lpc/b;->k:Landroid/content/res/ColorStateList;

    invoke-virtual {v1, v2}, Lhd/g;->a0(Landroid/content/res/ColorStateList;)V

    const v1, 0x10100a7

    filled-new-array {v1}, [I

    move-result-object v1

    iget-object v2, p0, Lpc/b;->q:Lhd/g;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    return-object v0
.end method

.method public h0()V
    .locals 2

    iget-object v0, p0, Lpc/b;->c:Lhd/g;

    iget-object v1, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v1}, Landroidx/cardview/widget/CardView;->getCardElevation()F

    move-result v1

    invoke-virtual {v0, v1}, Lhd/g;->Z(F)V

    return-void
.end method

.method public final i()Landroid/graphics/drawable/Drawable;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-boolean v0, Lfd/b;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpc/b;->j()Lhd/g;

    move-result-object v0

    iput-object v0, p0, Lpc/b;->r:Lhd/g;

    new-instance v0, Landroid/graphics/drawable/RippleDrawable;

    iget-object v1, p0, Lpc/b;->k:Landroid/content/res/ColorStateList;

    const/4 v2, 0x0

    iget-object v3, p0, Lpc/b;->r:Lhd/g;

    invoke-direct {v0, v1, v2, v3}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lpc/b;->h()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public final i0(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroid/view/View;->getForeground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v0, v0, Landroid/graphics/drawable/InsetDrawable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroid/view/View;->getForeground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/InsetDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/DrawableWrapper;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {p0, p1}, Lpc/b;->D(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final j()Lhd/g;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lhd/g;

    iget-object v1, p0, Lpc/b;->m:Lhd/k;

    invoke-direct {v0, v1}, Lhd/g;-><init>(Lhd/k;)V

    return-object v0
.end method

.method public j0()V
    .locals 2

    invoke-virtual {p0}, Lpc/b;->E()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    iget-object v1, p0, Lpc/b;->c:Lhd/g;

    invoke-virtual {p0, v1}, Lpc/b;->D(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/card/MaterialCardView;->setBackgroundInternal(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    iget-object v0, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    iget-object v1, p0, Lpc/b;->i:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v1}, Lpc/b;->D(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public k()V
    .locals 7

    iget-object v0, p0, Lpc/b;->o:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    iget-object v2, p0, Lpc/b;->o:Landroid/graphics/drawable/Drawable;

    iget v3, v0, Landroid/graphics/Rect;->left:I

    iget v4, v0, Landroid/graphics/Rect;->top:I

    iget v5, v0, Landroid/graphics/Rect;->right:I

    add-int/lit8 v6, v1, -0x1

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v2, p0, Lpc/b;->o:Landroid/graphics/drawable/Drawable;

    iget v3, v0, Landroid/graphics/Rect;->left:I

    iget v4, v0, Landroid/graphics/Rect;->top:I

    iget v0, v0, Landroid/graphics/Rect;->right:I

    invoke-virtual {v2, v3, v4, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_0
    return-void
.end method

.method public final k0()V
    .locals 2

    sget-boolean v0, Lfd/b;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpc/b;->o:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    check-cast v0, Landroid/graphics/drawable/RippleDrawable;

    iget-object v1, p0, Lpc/b;->k:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/RippleDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    return-void

    :cond_0
    iget-object v0, p0, Lpc/b;->q:Lhd/g;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lpc/b;->k:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Lhd/g;->a0(Landroid/content/res/ColorStateList;)V

    :cond_1
    return-void
.end method

.method public l()Lhd/g;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lpc/b;->c:Lhd/g;

    return-object v0
.end method

.method public l0()V
    .locals 3

    iget-object v0, p0, Lpc/b;->d:Lhd/g;

    iget v1, p0, Lpc/b;->h:I

    int-to-float v1, v1

    iget-object v2, p0, Lpc/b;->n:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1, v2}, Lhd/g;->h0(FLandroid/content/res/ColorStateList;)V

    return-void
.end method

.method public m()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lpc/b;->c:Lhd/g;

    invoke-virtual {v0}, Lhd/g;->x()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public n()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lpc/b;->d:Lhd/g;

    invoke-virtual {v0}, Lhd/g;->x()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public o()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lpc/b;->j:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public p()I
    .locals 1

    iget v0, p0, Lpc/b;->g:I

    return v0
.end method

.method public q()I
    .locals 1

    iget v0, p0, Lpc/b;->e:I

    return v0
.end method

.method public r()I
    .locals 1

    iget v0, p0, Lpc/b;->f:I

    return v0
.end method

.method public s()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lpc/b;->l:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public final t()Landroid/graphics/drawable/Drawable;
    .locals 6
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lpc/b;->o:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lpc/b;->i()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lpc/b;->o:Landroid/graphics/drawable/Drawable;

    :cond_0
    iget-object v0, p0, Lpc/b;->p:Landroid/graphics/drawable/LayerDrawable;

    if-nez v0, :cond_1

    new-instance v0, Landroid/graphics/drawable/LayerDrawable;

    iget-object v1, p0, Lpc/b;->o:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Lpc/b;->d:Lhd/g;

    iget-object v3, p0, Lpc/b;->j:Landroid/graphics/drawable/Drawable;

    const/4 v4, 0x3

    new-array v4, v4, [Landroid/graphics/drawable/Drawable;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v1, 0x1

    aput-object v2, v4, v1

    const/4 v1, 0x2

    aput-object v3, v4, v1

    invoke-direct {v0, v4}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    iput-object v0, p0, Lpc/b;->p:Landroid/graphics/drawable/LayerDrawable;

    sget v2, Lic/f;->D:I

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    :cond_1
    iget-object v0, p0, Lpc/b;->p:Landroid/graphics/drawable/LayerDrawable;

    return-object v0
.end method

.method public u()F
    .locals 1

    iget-object v0, p0, Lpc/b;->c:Lhd/g;

    invoke-virtual {v0}, Lhd/g;->J()F

    move-result v0

    return v0
.end method

.method public final v()F
    .locals 4

    iget-object v0, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroidx/cardview/widget/CardView;->getPreventCornerOverlap()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v0}, Landroidx/cardview/widget/CardView;->getUseCompatPadding()Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    sget-wide v2, Lpc/b;->z:D

    sub-double/2addr v0, v2

    iget-object v2, p0, Lpc/b;->a:Lcom/google/android/material/card/MaterialCardView;

    invoke-virtual {v2}, Lcom/google/android/material/card/MaterialCardView;->getCardViewRadius()F

    move-result v2

    float-to-double v2, v2

    mul-double/2addr v0, v2

    double-to-float v0, v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public w()F
    .locals 1

    iget-object v0, p0, Lpc/b;->c:Lhd/g;

    invoke-virtual {v0}, Lhd/g;->y()F

    move-result v0

    return v0
.end method

.method public x()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lpc/b;->k:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public y()Lhd/k;
    .locals 1

    iget-object v0, p0, Lpc/b;->m:Lhd/k;

    return-object v0
.end method

.method public z()I
    .locals 1

    iget-object v0, p0, Lpc/b;->n:Landroid/content/res/ColorStateList;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v0

    return v0
.end method
