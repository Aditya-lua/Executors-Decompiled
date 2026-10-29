.class public Landroidx/core/view/d1$c;
.super Landroidx/core/view/d1$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/d1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/view/d1$c$a;
    }
.end annotation


# static fields
.field public static final f:Landroid/view/animation/Interpolator;

.field public static final g:Landroid/view/animation/Interpolator;

.field public static final h:Landroid/view/animation/Interpolator;

.field public static final i:Landroid/view/animation/Interpolator;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const v1, 0x3f8ccccd    # 1.1f

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v3, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Landroidx/core/view/d1$c;->f:Landroid/view/animation/Interpolator;

    new-instance v0, Lg4/a;

    invoke-direct {v0}, Lg4/a;-><init>()V

    sput-object v0, Landroidx/core/view/d1$c;->g:Landroid/view/animation/Interpolator;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v1, 0x3fc00000    # 1.5f

    invoke-direct {v0, v1}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    sput-object v0, Landroidx/core/view/d1$c;->h:Landroid/view/animation/Interpolator;

    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0, v1}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V

    sput-object v0, Landroidx/core/view/d1$c;->i:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>(ILandroid/view/animation/Interpolator;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/core/view/d1$e;-><init>(ILandroid/view/animation/Interpolator;J)V

    return-void
.end method

.method public static f(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat;[I[I)V
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    const/4 v0, 0x1

    move v1, v0

    :goto_0
    const/16 v2, 0x200

    if-gt v1, v2, :cond_6

    invoke-virtual {p0, v1}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object v2

    invoke-virtual {p1, v1}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object v3

    iget v4, v2, Landroidx/core/graphics/Insets;->left:I

    iget v5, v3, Landroidx/core/graphics/Insets;->left:I

    const/4 v6, 0x0

    if-gt v4, v5, :cond_1

    iget v7, v2, Landroidx/core/graphics/Insets;->top:I

    iget v8, v3, Landroidx/core/graphics/Insets;->top:I

    if-gt v7, v8, :cond_1

    iget v7, v2, Landroidx/core/graphics/Insets;->right:I

    iget v8, v3, Landroidx/core/graphics/Insets;->right:I

    if-gt v7, v8, :cond_1

    iget v7, v2, Landroidx/core/graphics/Insets;->bottom:I

    iget v8, v3, Landroidx/core/graphics/Insets;->bottom:I

    if-le v7, v8, :cond_0

    goto :goto_1

    :cond_0
    move v7, v6

    goto :goto_2

    :cond_1
    :goto_1
    move v7, v0

    :goto_2
    if-lt v4, v5, :cond_3

    iget v4, v2, Landroidx/core/graphics/Insets;->top:I

    iget v5, v3, Landroidx/core/graphics/Insets;->top:I

    if-lt v4, v5, :cond_3

    iget v4, v2, Landroidx/core/graphics/Insets;->right:I

    iget v5, v3, Landroidx/core/graphics/Insets;->right:I

    if-lt v4, v5, :cond_3

    iget v2, v2, Landroidx/core/graphics/Insets;->bottom:I

    iget v3, v3, Landroidx/core/graphics/Insets;->bottom:I

    if-ge v2, v3, :cond_2

    goto :goto_3

    :cond_2
    move v2, v6

    goto :goto_4

    :cond_3
    :goto_3
    move v2, v0

    :goto_4
    if-eq v7, v2, :cond_5

    if-eqz v7, :cond_4

    aget v2, p2, v6

    or-int/2addr v2, v1

    aput v2, p2, v6

    goto :goto_5

    :cond_4
    aget v2, p3, v6

    or-int/2addr v2, v1

    aput v2, p3, v6

    :cond_5
    :goto_5
    shl-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_6
    return-void
.end method

.method public static g(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat;I)Landroidx/core/view/d1$a;
    .locals 4

    invoke-virtual {p0, p2}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object p0

    invoke-virtual {p1, p2}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object p1

    iget p2, p0, Landroidx/core/graphics/Insets;->left:I

    iget v0, p1, Landroidx/core/graphics/Insets;->left:I

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    iget v0, p0, Landroidx/core/graphics/Insets;->top:I

    iget v1, p1, Landroidx/core/graphics/Insets;->top:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget v1, p0, Landroidx/core/graphics/Insets;->right:I

    iget v2, p1, Landroidx/core/graphics/Insets;->right:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget v2, p0, Landroidx/core/graphics/Insets;->bottom:I

    iget v3, p1, Landroidx/core/graphics/Insets;->bottom:I

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {p2, v0, v1, v2}, Landroidx/core/graphics/Insets;->of(IIII)Landroidx/core/graphics/Insets;

    move-result-object p2

    iget v0, p0, Landroidx/core/graphics/Insets;->left:I

    iget v1, p1, Landroidx/core/graphics/Insets;->left:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v1, p0, Landroidx/core/graphics/Insets;->top:I

    iget v2, p1, Landroidx/core/graphics/Insets;->top:I

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget v2, p0, Landroidx/core/graphics/Insets;->right:I

    iget v3, p1, Landroidx/core/graphics/Insets;->right:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget p0, p0, Landroidx/core/graphics/Insets;->bottom:I

    iget p1, p1, Landroidx/core/graphics/Insets;->bottom:I

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {v0, v1, v2, p0}, Landroidx/core/graphics/Insets;->of(IIII)Landroidx/core/graphics/Insets;

    move-result-object p0

    new-instance p1, Landroidx/core/view/d1$a;

    invoke-direct {p1, p2, p0}, Landroidx/core/view/d1$a;-><init>(Landroidx/core/graphics/Insets;Landroidx/core/graphics/Insets;)V

    return-object p1
.end method

.method public static h(II)Landroid/view/animation/Interpolator;
    .locals 1

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->ime()I

    move-result v0

    and-int/2addr v0, p0

    if-eqz v0, :cond_0

    sget-object p0, Landroidx/core/view/d1$c;->f:Landroid/view/animation/Interpolator;

    return-object p0

    :cond_0
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->ime()I

    move-result v0

    and-int/2addr v0, p1

    if-eqz v0, :cond_1

    sget-object p0, Landroidx/core/view/d1$c;->g:Landroid/view/animation/Interpolator;

    return-object p0

    :cond_1
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->systemBars()I

    move-result v0

    and-int/2addr p0, v0

    if-eqz p0, :cond_2

    sget-object p0, Landroidx/core/view/d1$c;->h:Landroid/view/animation/Interpolator;

    return-object p0

    :cond_2
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->systemBars()I

    move-result p0

    and-int/2addr p0, p1

    if-eqz p0, :cond_3

    sget-object p0, Landroidx/core/view/d1$c;->i:Landroid/view/animation/Interpolator;

    return-object p0

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static i(Landroid/view/View;Landroidx/core/view/d1$b;)Landroid/view/View$OnApplyWindowInsetsListener;
    .locals 1

    new-instance v0, Landroidx/core/view/d1$c$a;

    invoke-direct {v0, p0, p1}, Landroidx/core/view/d1$c$a;-><init>(Landroid/view/View;Landroidx/core/view/d1$b;)V

    return-object v0
.end method

.method public static j(Landroid/view/View;Landroidx/core/view/d1;)V
    .locals 2

    invoke-static {p0}, Landroidx/core/view/d1$c;->o(Landroid/view/View;)Landroidx/core/view/d1$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/core/view/d1$b;->b(Landroidx/core/view/d1;)V

    invoke-virtual {v0}, Landroidx/core/view/d1$b;->a()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, p1}, Landroidx/core/view/d1$c;->j(Landroid/view/View;Landroidx/core/view/d1;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static k(Landroid/view/View;Landroidx/core/view/d1;Landroidx/core/view/WindowInsetsCompat;Z)V
    .locals 2

    invoke-static {p0}, Landroidx/core/view/d1$c;->o(Landroid/view/View;)Landroidx/core/view/d1$b;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iput-object p2, v0, Landroidx/core/view/d1$b;->a:Landroidx/core/view/WindowInsetsCompat;

    if-nez p3, :cond_1

    invoke-virtual {v0, p1}, Landroidx/core/view/d1$b;->c(Landroidx/core/view/d1;)V

    invoke-virtual {v0}, Landroidx/core/view/d1$b;->a()I

    move-result p3

    if-nez p3, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    move p3, v1

    :cond_1
    :goto_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p0, Landroid/view/ViewGroup;

    :goto_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p1, p2, p3}, Landroidx/core/view/d1$c;->k(Landroid/view/View;Landroidx/core/view/d1;Landroidx/core/view/WindowInsetsCompat;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public static l(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Landroidx/core/view/WindowInsetsCompat;",
            "Ljava/util/List<",
            "Landroidx/core/view/d1;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0}, Landroidx/core/view/d1$c;->o(Landroid/view/View;)Landroidx/core/view/d1$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroidx/core/view/d1$b;->d(Landroidx/core/view/WindowInsetsCompat;Ljava/util/List;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object p1

    invoke-virtual {v0}, Landroidx/core/view/d1$b;->a()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, p1, p2}, Landroidx/core/view/d1$c;->l(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;Ljava/util/List;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static m(Landroid/view/View;Landroidx/core/view/d1;Landroidx/core/view/d1$a;)V
    .locals 2

    invoke-static {p0}, Landroidx/core/view/d1$c;->o(Landroid/view/View;)Landroidx/core/view/d1$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroidx/core/view/d1$b;->e(Landroidx/core/view/d1;Landroidx/core/view/d1$a;)Landroidx/core/view/d1$a;

    invoke-virtual {v0}, Landroidx/core/view/d1$b;->a()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, p1, p2}, Landroidx/core/view/d1$c;->m(Landroid/view/View;Landroidx/core/view/d1;Landroidx/core/view/d1$a;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static n(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 1

    sget v0, Lj2/e;->M:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p0

    return-object p0
.end method

.method public static o(Landroid/view/View;)Landroidx/core/view/d1$b;
    .locals 1

    sget v0, Lj2/e;->U:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Landroidx/core/view/d1$c$a;

    if-eqz v0, :cond_0

    check-cast p0, Landroidx/core/view/d1$c$a;

    iget-object p0, p0, Landroidx/core/view/d1$c$a;->a:Landroidx/core/view/d1$b;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static p(Landroidx/core/view/WindowInsetsCompat;Landroidx/core/view/WindowInsetsCompat;FI)Landroidx/core/view/WindowInsetsCompat;
    .locals 12
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    new-instance v0, Landroidx/core/view/WindowInsetsCompat$Builder;

    invoke-direct {v0, p0}, Landroidx/core/view/WindowInsetsCompat$Builder;-><init>(Landroidx/core/view/WindowInsetsCompat;)V

    const/4 v1, 0x1

    :goto_0
    const/16 v2, 0x200

    if-gt v1, v2, :cond_1

    and-int v2, p3, v1

    if-nez v2, :cond_0

    invoke-virtual {p0, v1}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/core/view/WindowInsetsCompat$Builder;->setInsets(ILandroidx/core/graphics/Insets;)Landroidx/core/view/WindowInsetsCompat$Builder;

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v1}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object v2

    invoke-virtual {p1, v1}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object v3

    iget v4, v2, Landroidx/core/graphics/Insets;->left:I

    iget v5, v3, Landroidx/core/graphics/Insets;->left:I

    sub-int/2addr v4, v5

    int-to-float v4, v4

    const/high16 v5, 0x3f800000    # 1.0f

    sub-float/2addr v5, p2

    mul-float/2addr v4, v5

    float-to-double v6, v4

    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    add-double/2addr v6, v8

    double-to-int v4, v6

    iget v6, v2, Landroidx/core/graphics/Insets;->top:I

    iget v7, v3, Landroidx/core/graphics/Insets;->top:I

    sub-int/2addr v6, v7

    int-to-float v6, v6

    mul-float/2addr v6, v5

    float-to-double v6, v6

    add-double/2addr v6, v8

    double-to-int v6, v6

    iget v7, v2, Landroidx/core/graphics/Insets;->right:I

    iget v10, v3, Landroidx/core/graphics/Insets;->right:I

    sub-int/2addr v7, v10

    int-to-float v7, v7

    mul-float/2addr v7, v5

    float-to-double v10, v7

    add-double/2addr v10, v8

    double-to-int v7, v10

    iget v10, v2, Landroidx/core/graphics/Insets;->bottom:I

    iget v3, v3, Landroidx/core/graphics/Insets;->bottom:I

    sub-int/2addr v10, v3

    int-to-float v3, v10

    mul-float/2addr v3, v5

    float-to-double v10, v3

    add-double/2addr v10, v8

    double-to-int v3, v10

    invoke-static {v2, v4, v6, v7, v3}, Landroidx/core/view/WindowInsetsCompat;->insetInsets(Landroidx/core/graphics/Insets;IIII)Landroidx/core/graphics/Insets;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/core/view/WindowInsetsCompat$Builder;->setInsets(ILandroidx/core/graphics/Insets;)Landroidx/core/view/WindowInsetsCompat$Builder;

    :goto_1
    shl-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroidx/core/view/WindowInsetsCompat$Builder;->build()Landroidx/core/view/WindowInsetsCompat;

    move-result-object p0

    return-object p0
.end method

.method public static q(Landroid/view/View;Landroidx/core/view/d1$b;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {p0, p1}, Landroidx/core/view/d1$c;->i(Landroid/view/View;Landroidx/core/view/d1$b;)Landroid/view/View$OnApplyWindowInsetsListener;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    sget v0, Lj2/e;->U:I

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    sget v0, Lj2/e;->L:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    sget v0, Lj2/e;->M:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    :cond_1
    return-void
.end method
