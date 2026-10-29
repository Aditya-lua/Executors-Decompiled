.class public final Ldd/d;
.super Ldd/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldd/i<",
        "Landroid/animation/ObjectAnimator;",
        ">;"
    }
.end annotation


# static fields
.field public static final k:[I

.field public static final l:[I

.field public static final m:[I

.field public static final n:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Ldd/d;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public static final o:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Ldd/d;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public c:Landroid/animation/ObjectAnimator;

.field public d:Landroid/animation/ObjectAnimator;

.field public final e:Lg4/b;

.field public final f:Ldd/b;

.field public g:I

.field public h:F

.field public i:F

.field public j:Lp5/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0xa8c

    const/16 v1, 0xfd2

    const/4 v2, 0x0

    const/16 v3, 0x546

    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Ldd/d;->k:[I

    const/16 v0, 0xd27

    const/16 v1, 0x126d

    const/16 v2, 0x29b

    const/16 v3, 0x7e1

    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Ldd/d;->l:[I

    const/16 v0, 0xe74

    const/16 v1, 0x13ba

    const/16 v2, 0x3e8

    const/16 v3, 0x92e

    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Ldd/d;->m:[I

    new-instance v0, Ldd/d$c;

    const-string v1, "animationFraction"

    const-class v2, Ljava/lang/Float;

    invoke-direct {v0, v2, v1}, Ldd/d$c;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Ldd/d;->n:Landroid/util/Property;

    new-instance v0, Ldd/d$d;

    const-string v1, "completeEndFraction"

    invoke-direct {v0, v2, v1}, Ldd/d$d;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Ldd/d;->o:Landroid/util/Property;

    return-void
.end method

.method public constructor <init>(Ldd/e;)V
    .locals 1
    .param p1    # Ldd/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ldd/i;-><init>(I)V

    const/4 v0, 0x0

    iput v0, p0, Ldd/d;->g:I

    const/4 v0, 0x0

    iput-object v0, p0, Ldd/d;->j:Lp5/b;

    iput-object p1, p0, Ldd/d;->f:Ldd/b;

    new-instance p1, Lg4/b;

    invoke-direct {p1}, Lg4/b;-><init>()V

    iput-object p1, p0, Ldd/d;->e:Lg4/b;

    return-void
.end method

.method public static synthetic i(Ldd/d;)I
    .locals 0

    iget p0, p0, Ldd/d;->g:I

    return p0
.end method

.method public static synthetic j(Ldd/d;I)I
    .locals 0

    iput p1, p0, Ldd/d;->g:I

    return p1
.end method

.method public static synthetic k(Ldd/d;)Ldd/b;
    .locals 0

    iget-object p0, p0, Ldd/d;->f:Ldd/b;

    return-object p0
.end method

.method public static synthetic l(Ldd/d;)F
    .locals 0

    invoke-virtual {p0}, Ldd/d;->o()F

    move-result p0

    return p0
.end method

.method public static synthetic m(Ldd/d;)F
    .locals 0

    invoke-virtual {p0}, Ldd/d;->p()F

    move-result p0

    return p0
.end method

.method public static synthetic n(Ldd/d;F)V
    .locals 0

    invoke-virtual {p0, p1}, Ldd/d;->u(F)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Ldd/d;->c:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 0

    invoke-virtual {p0}, Ldd/d;->s()V

    return-void
.end method

.method public d(Lp5/b;)V
    .locals 0
    .param p1    # Lp5/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iput-object p1, p0, Ldd/d;->j:Lp5/b;

    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Ldd/d;->d:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ldd/i;->a:Ldd/j;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ldd/d;->d:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-void

    :cond_1
    invoke-virtual {p0}, Ldd/d;->a()V

    :cond_2
    :goto_0
    return-void
.end method

.method public g()V
    .locals 1

    invoke-virtual {p0}, Ldd/d;->q()V

    invoke-virtual {p0}, Ldd/d;->s()V

    iget-object v0, p0, Ldd/d;->c:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-void
.end method

.method public h()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ldd/d;->j:Lp5/b;

    return-void
.end method

.method public final o()F
    .locals 1

    iget v0, p0, Ldd/d;->h:F

    return v0
.end method

.method public final p()F
    .locals 1

    iget v0, p0, Ldd/d;->i:F

    return v0
.end method

.method public final q()V
    .locals 4

    iget-object v0, p0, Ldd/d;->c:Landroid/animation/ObjectAnimator;

    const/4 v1, 0x2

    if-nez v0, :cond_0

    sget-object v0, Ldd/d;->n:Landroid/util/Property;

    new-array v2, v1, [F

    fill-array-data v2, :array_0

    invoke-static {p0, v0, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Ldd/d;->c:Landroid/animation/ObjectAnimator;

    const-wide/16 v2, 0x1518

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    iget-object v0, p0, Ldd/d;->c:Landroid/animation/ObjectAnimator;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v0, p0, Ldd/d;->c:Landroid/animation/ObjectAnimator;

    const/4 v2, -0x1

    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    iget-object v0, p0, Ldd/d;->c:Landroid/animation/ObjectAnimator;

    new-instance v2, Ldd/d$a;

    invoke-direct {v2, p0}, Ldd/d$a;-><init>(Ldd/d;)V

    invoke-virtual {v0, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_0
    iget-object v0, p0, Ldd/d;->d:Landroid/animation/ObjectAnimator;

    if-nez v0, :cond_1

    sget-object v0, Ldd/d;->o:Landroid/util/Property;

    new-array v1, v1, [F

    fill-array-data v1, :array_1

    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Ldd/d;->d:Landroid/animation/ObjectAnimator;

    const-wide/16 v1, 0x14d

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    iget-object v0, p0, Ldd/d;->d:Landroid/animation/ObjectAnimator;

    iget-object v1, p0, Ldd/d;->e:Lg4/b;

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v0, p0, Ldd/d;->d:Landroid/animation/ObjectAnimator;

    new-instance v1, Ldd/d$b;

    invoke-direct {v1, p0}, Ldd/d$b;-><init>(Ldd/d;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_1
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final r(I)V
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, 0x4

    if-ge v1, v2, :cond_1

    sget-object v2, Ldd/d;->m:[I

    aget v2, v2, v1

    const/16 v3, 0x14d

    invoke-virtual {p0, p1, v2, v3}, Ldd/i;->b(III)F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v3, v2, v3

    if-ltz v3, :cond_0

    const/high16 v3, 0x3f800000    # 1.0f

    cmpg-float v3, v2, v3

    if-gtz v3, :cond_0

    iget p1, p0, Ldd/d;->g:I

    add-int/2addr v1, p1

    iget-object p1, p0, Ldd/d;->f:Ldd/b;

    iget-object p1, p1, Ldd/b;->c:[I

    array-length v3, p1

    rem-int/2addr v1, v3

    add-int/lit8 v3, v1, 0x1

    array-length v4, p1

    rem-int/2addr v3, v4

    aget v1, p1, v1

    aget p1, p1, v3

    iget-object v3, p0, Ldd/d;->e:Lg4/b;

    invoke-virtual {v3, v2}, Lg4/b;->getInterpolation(F)F

    move-result v2

    iget-object v3, p0, Ldd/i;->b:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldd/h$a;

    invoke-static {}, Ljc/c;->b()Ljc/c;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v3, v2, v1, p1}, Ljc/c;->a(FLjava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, v0, Ldd/h$a;->c:I

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public s()V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Ldd/d;->g:I

    iget-object v1, p0, Ldd/i;->b:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldd/h$a;

    iget-object v2, p0, Ldd/d;->f:Ldd/b;

    iget-object v2, v2, Ldd/b;->c:[I

    aget v0, v2, v0

    iput v0, v1, Ldd/h$a;->c:I

    const/4 v0, 0x0

    iput v0, p0, Ldd/d;->i:F

    return-void
.end method

.method public t(F)V
    .locals 1

    iput p1, p0, Ldd/d;->h:F

    const v0, 0x45a8c000    # 5400.0f

    mul-float/2addr p1, v0

    float-to-int p1, p1

    invoke-virtual {p0, p1}, Ldd/d;->v(I)V

    invoke-virtual {p0, p1}, Ldd/d;->r(I)V

    iget-object p1, p0, Ldd/i;->a:Ldd/j;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final u(F)V
    .locals 0

    iput p1, p0, Ldd/d;->i:F

    return-void
.end method

.method public final v(I)V
    .locals 6

    iget-object v0, p0, Ldd/i;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldd/h$a;

    iget v2, p0, Ldd/d;->h:F

    const/high16 v3, 0x44be0000    # 1520.0f

    mul-float v4, v2, v3

    const/high16 v5, -0x3e600000    # -20.0f

    add-float/2addr v4, v5

    iput v4, v0, Ldd/h$a;->a:F

    mul-float/2addr v2, v3

    iput v2, v0, Ldd/h$a;->b:F

    :goto_0
    const/4 v2, 0x4

    if-ge v1, v2, :cond_0

    sget-object v2, Ldd/d;->k:[I

    aget v2, v2, v1

    const/16 v3, 0x29b

    invoke-virtual {p0, p1, v2, v3}, Ldd/i;->b(III)F

    move-result v2

    iget v4, v0, Ldd/h$a;->b:F

    iget-object v5, p0, Ldd/d;->e:Lg4/b;

    invoke-virtual {v5, v2}, Lg4/b;->getInterpolation(F)F

    move-result v2

    const/high16 v5, 0x437a0000    # 250.0f

    mul-float/2addr v2, v5

    add-float/2addr v4, v2

    iput v4, v0, Ldd/h$a;->b:F

    sget-object v2, Ldd/d;->l:[I

    aget v2, v2, v1

    invoke-virtual {p0, p1, v2, v3}, Ldd/i;->b(III)F

    move-result v2

    iget v3, v0, Ldd/h$a;->a:F

    iget-object v4, p0, Ldd/d;->e:Lg4/b;

    invoke-virtual {v4, v2}, Lg4/b;->getInterpolation(F)F

    move-result v2

    mul-float/2addr v2, v5

    add-float/2addr v3, v2

    iput v3, v0, Ldd/h$a;->a:F

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget p1, v0, Ldd/h$a;->a:F

    iget v1, v0, Ldd/h$a;->b:F

    sub-float v2, v1, p1

    iget v3, p0, Ldd/d;->i:F

    mul-float/2addr v2, v3

    add-float/2addr p1, v2

    const/high16 v2, 0x43b40000    # 360.0f

    div-float/2addr p1, v2

    iput p1, v0, Ldd/h$a;->a:F

    div-float/2addr v1, v2

    iput v1, v0, Ldd/h$a;->b:F

    return-void
.end method
