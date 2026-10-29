.class public abstract Lb3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb3/b$a;
    }
.end annotation


# static fields
.field public static final l:Landroid/view/animation/Interpolator;

.field public static final m:Landroid/view/animation/Interpolator;

.field public static final n:Landroid/view/animation/Interpolator;

.field public static final o:Landroid/view/animation/Interpolator;


# instance fields
.field public final a:I

.field public final b:Lb3/b$a;

.field public c:Landroidx/core/graphics/Insets;

.field public d:Landroidx/core/graphics/Insets;

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:Ljava/lang/Object;

.field public j:Landroid/animation/ValueAnimator;

.field public k:Landroid/animation/ValueAnimator;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v1, v1, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Lb3/b;->l:Landroid/view/animation/Interpolator;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const v3, 0x3f19999a    # 0.6f

    invoke-direct {v0, v3, v1, v2, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Lb3/b;->m:Landroid/view/animation/Interpolator;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const v3, 0x3e4ccccd    # 0.2f

    invoke-direct {v0, v1, v1, v3, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Lb3/b;->n:Landroid/view/animation/Interpolator;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const v3, 0x3ecccccd    # 0.4f

    invoke-direct {v0, v3, v1, v2, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Lb3/b;->o:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lb3/b$a;

    invoke-direct {v0}, Lb3/b$a;-><init>()V

    iput-object v0, p0, Lb3/b;->b:Lb3/b$a;

    sget-object v0, Landroidx/core/graphics/Insets;->NONE:Landroidx/core/graphics/Insets;

    iput-object v0, p0, Lb3/b;->c:Landroidx/core/graphics/Insets;

    iput-object v0, p0, Lb3/b;->d:Landroidx/core/graphics/Insets;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lb3/b;->e:F

    iput v0, p0, Lb3/b;->f:F

    iput v0, p0, Lb3/b;->g:F

    iput v0, p0, Lb3/b;->h:F

    const/4 v0, 0x0

    iput-object v0, p0, Lb3/b;->i:Ljava/lang/Object;

    iput-object v0, p0, Lb3/b;->j:Landroid/animation/ValueAnimator;

    iput-object v0, p0, Lb3/b;->k:Landroid/animation/ValueAnimator;

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/16 v0, 0x8

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected side: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iput p1, p0, Lb3/b;->a:I

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    return-void
.end method

.method public b(Landroidx/core/graphics/Insets;Landroidx/core/graphics/Insets;Landroidx/core/graphics/Insets;)Landroidx/core/graphics/Insets;
    .locals 0

    iput-object p1, p0, Lb3/b;->c:Landroidx/core/graphics/Insets;

    iput-object p2, p0, Lb3/b;->d:Landroidx/core/graphics/Insets;

    iget-object p1, p0, Lb3/b;->b:Lb3/b$a;

    invoke-static {p1, p3}, Lb3/b$a;->a(Lb3/b$a;Landroidx/core/graphics/Insets;)V

    invoke-virtual {p0}, Lb3/b;->o()Landroidx/core/graphics/Insets;

    move-result-object p1

    return-object p1
.end method

.method public c()Lb3/b$a;
    .locals 1

    iget-object v0, p0, Lb3/b;->b:Lb3/b$a;

    return-object v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lb3/b;->i:Ljava/lang/Object;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lb3/b;->a:I

    return v0
.end method

.method public f(I)I
    .locals 0

    return p1
.end method

.method public g()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public h(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lb3/b;->i:Ljava/lang/Object;

    return-void
.end method

.method public i(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Lb3/b;->b:Lb3/b$a;

    invoke-static {v0, p1}, Lb3/b$a;->j(Lb3/b$a;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public j(F)V
    .locals 0

    iput p1, p0, Lb3/b;->e:F

    invoke-virtual {p0}, Lb3/b;->m()V

    return-void
.end method

.method public k(F)V
    .locals 0

    iput p1, p0, Lb3/b;->g:F

    invoke-virtual {p0}, Lb3/b;->n()V

    return-void
.end method

.method public l(Z)V
    .locals 1

    iget-object v0, p0, Lb3/b;->b:Lb3/b$a;

    invoke-static {v0, p1}, Lb3/b$a;->d(Lb3/b$a;Z)V

    return-void
.end method

.method public final m()V
    .locals 3

    iget-object v0, p0, Lb3/b;->b:Lb3/b$a;

    iget v1, p0, Lb3/b;->e:F

    iget v2, p0, Lb3/b;->f:F

    mul-float/2addr v1, v2

    invoke-static {v0, v1}, Lb3/b$a;->e(Lb3/b$a;F)V

    return-void
.end method

.method public final n()V
    .locals 4

    iget v0, p0, Lb3/b;->h:F

    iget v1, p0, Lb3/b;->g:F

    mul-float/2addr v0, v1

    iget v1, p0, Lb3/b;->a:I

    const/4 v2, 0x1

    const/high16 v3, 0x3f800000    # 1.0f

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v2, 0x4

    if-eq v1, v2, :cond_1

    const/16 v2, 0x8

    if-eq v1, v2, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lb3/b;->b:Lb3/b$a;

    sub-float/2addr v3, v0

    invoke-static {v1}, Lb3/b$a;->h(Lb3/b$a;)I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v3, v0

    invoke-static {v1, v3}, Lb3/b$a;->i(Lb3/b$a;F)V

    return-void

    :cond_1
    iget-object v1, p0, Lb3/b;->b:Lb3/b$a;

    sub-float/2addr v3, v0

    invoke-static {v1}, Lb3/b$a;->f(Lb3/b$a;)I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v3, v0

    invoke-static {v1, v3}, Lb3/b$a;->g(Lb3/b$a;F)V

    return-void

    :cond_2
    iget-object v1, p0, Lb3/b;->b:Lb3/b$a;

    sub-float/2addr v3, v0

    neg-float v0, v3

    invoke-static {v1}, Lb3/b$a;->h(Lb3/b$a;)I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v0, v2

    invoke-static {v1, v0}, Lb3/b$a;->i(Lb3/b$a;F)V

    return-void

    :cond_3
    iget-object v1, p0, Lb3/b;->b:Lb3/b$a;

    sub-float/2addr v3, v0

    neg-float v0, v3

    invoke-static {v1}, Lb3/b$a;->f(Lb3/b$a;)I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v0, v2

    invoke-static {v1, v0}, Lb3/b$a;->g(Lb3/b$a;F)V

    return-void
.end method

.method public o()Landroidx/core/graphics/Insets;
    .locals 6

    sget-object v0, Landroidx/core/graphics/Insets;->NONE:Landroidx/core/graphics/Insets;

    iget v1, p0, Lb3/b;->a:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v1, v3, :cond_3

    const/4 v4, 0x2

    if-eq v1, v4, :cond_2

    const/4 v4, 0x4

    if-eq v1, v4, :cond_1

    const/16 v4, 0x8

    if-eq v1, v4, :cond_0

    move v1, v2

    goto/16 :goto_0

    :cond_0
    iget-object v1, p0, Lb3/b;->c:Landroidx/core/graphics/Insets;

    iget v1, v1, Landroidx/core/graphics/Insets;->bottom:I

    iget-object v4, p0, Lb3/b;->b:Lb3/b$a;

    iget-object v5, p0, Lb3/b;->d:Landroidx/core/graphics/Insets;

    iget v5, v5, Landroidx/core/graphics/Insets;->bottom:I

    invoke-virtual {p0, v5}, Lb3/b;->f(I)I

    move-result v5

    invoke-static {v4, v5}, Lb3/b$a;->c(Lb3/b$a;I)V

    invoke-virtual {p0}, Lb3/b;->g()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {p0, v1}, Lb3/b;->f(I)I

    move-result v0

    invoke-static {v2, v2, v2, v0}, Landroidx/core/graphics/Insets;->of(IIII)Landroidx/core/graphics/Insets;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lb3/b;->c:Landroidx/core/graphics/Insets;

    iget v1, v1, Landroidx/core/graphics/Insets;->right:I

    iget-object v4, p0, Lb3/b;->b:Lb3/b$a;

    iget-object v5, p0, Lb3/b;->d:Landroidx/core/graphics/Insets;

    iget v5, v5, Landroidx/core/graphics/Insets;->right:I

    invoke-virtual {p0, v5}, Lb3/b;->f(I)I

    move-result v5

    invoke-static {v4, v5}, Lb3/b$a;->b(Lb3/b$a;I)V

    invoke-virtual {p0}, Lb3/b;->g()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {p0, v1}, Lb3/b;->f(I)I

    move-result v0

    invoke-static {v2, v2, v0, v2}, Landroidx/core/graphics/Insets;->of(IIII)Landroidx/core/graphics/Insets;

    move-result-object v0

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lb3/b;->c:Landroidx/core/graphics/Insets;

    iget v1, v1, Landroidx/core/graphics/Insets;->top:I

    iget-object v4, p0, Lb3/b;->b:Lb3/b$a;

    iget-object v5, p0, Lb3/b;->d:Landroidx/core/graphics/Insets;

    iget v5, v5, Landroidx/core/graphics/Insets;->top:I

    invoke-virtual {p0, v5}, Lb3/b;->f(I)I

    move-result v5

    invoke-static {v4, v5}, Lb3/b$a;->c(Lb3/b$a;I)V

    invoke-virtual {p0}, Lb3/b;->g()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {p0, v1}, Lb3/b;->f(I)I

    move-result v0

    invoke-static {v2, v0, v2, v2}, Landroidx/core/graphics/Insets;->of(IIII)Landroidx/core/graphics/Insets;

    move-result-object v0

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lb3/b;->c:Landroidx/core/graphics/Insets;

    iget v1, v1, Landroidx/core/graphics/Insets;->left:I

    iget-object v4, p0, Lb3/b;->b:Lb3/b$a;

    iget-object v5, p0, Lb3/b;->d:Landroidx/core/graphics/Insets;

    iget v5, v5, Landroidx/core/graphics/Insets;->left:I

    invoke-virtual {p0, v5}, Lb3/b;->f(I)I

    move-result v5

    invoke-static {v4, v5}, Lb3/b$a;->b(Lb3/b$a;I)V

    invoke-virtual {p0}, Lb3/b;->g()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {p0, v1}, Lb3/b;->f(I)I

    move-result v0

    invoke-static {v0, v2, v2, v2}, Landroidx/core/graphics/Insets;->of(IIII)Landroidx/core/graphics/Insets;

    move-result-object v0

    :cond_4
    :goto_0
    if-lez v1, :cond_5

    move v2, v3

    :cond_5
    invoke-virtual {p0, v2}, Lb3/b;->l(Z)V

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    if-lez v1, :cond_6

    move v4, v3

    goto :goto_1

    :cond_6
    move v4, v2

    :goto_1
    invoke-virtual {p0, v4}, Lb3/b;->j(F)V

    if-lez v1, :cond_7

    move v2, v3

    :cond_7
    invoke-virtual {p0, v2}, Lb3/b;->k(F)V

    return-object v0
.end method
