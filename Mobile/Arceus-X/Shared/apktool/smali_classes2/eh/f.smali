.class public Leh/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/view/View;

.field public b:F

.field public c:F

.field public d:F

.field public e:F

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:Z

.field public o:Landroid/animation/ValueAnimator;

.field public p:Landroid/animation/ValueAnimator;

.field public q:Landroid/animation/ValueAnimator;

.field public r:Landroid/graphics/Rect;

.field public final s:I

.field public final t:I

.field public final u:I

.field public final v:I

.field public final w:I

.field public final x:F


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/util/AttributeSet;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Leh/f;->a:Landroid/view/View;

    const/4 v1, 0x0

    iput-boolean v1, p0, Leh/f;->n:Z

    iput-object v0, p0, Leh/f;->o:Landroid/animation/ValueAnimator;

    iput-object v0, p0, Leh/f;->p:Landroid/animation/ValueAnimator;

    iput-object v0, p0, Leh/f;->q:Landroid/animation/ValueAnimator;

    iput-object v0, p0, Leh/f;->r:Landroid/graphics/Rect;

    const/16 v0, 0x3c

    iput v0, p0, Leh/f;->s:I

    const/16 v1, 0xa

    iput v1, p0, Leh/f;->t:I

    const v2, 0xb8b8b8

    iput v2, p0, Leh/f;->u:I

    const/16 v3, 0xdac

    iput v3, p0, Leh/f;->v:I

    const/16 v4, 0x12c

    iput v4, p0, Leh/f;->w:I

    const/high16 v5, 0x42480000    # 50.0f

    iput v5, p0, Leh/f;->x:F

    if-eqz p1, :cond_1

    iput-object p1, p0, Leh/f;->a:Landroid/view/View;

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v6, Lsg/s0;->D0:[I

    invoke-virtual {p1, p2, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    sget p2, Lsg/s0;->K0:I

    invoke-virtual {p1, p2, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iput p2, p0, Leh/f;->d:F

    iput p2, p0, Leh/f;->e:F

    sget p2, Lsg/s0;->G0:I

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Leh/f;->i:I

    sget p2, Lsg/s0;->H0:I

    invoke-virtual {p1, p2, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Leh/f;->j:I

    sget p2, Lsg/s0;->I0:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Leh/f;->f:I

    sget p2, Lsg/s0;->E0:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Leh/f;->g:I

    sget p2, Lsg/s0;->J0:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Leh/f;->k:I

    sget p2, Lsg/s0;->F0:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Leh/f;->m:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :cond_0
    iput v5, p0, Leh/f;->d:F

    iput v5, p0, Leh/f;->e:F

    iput v3, p0, Leh/f;->i:I

    iput v4, p0, Leh/f;->j:I

    iput v0, p0, Leh/f;->f:I

    iput v1, p0, Leh/f;->g:I

    iput v2, p0, Leh/f;->k:I

    iput v2, p0, Leh/f;->m:I

    :cond_1
    return-void
.end method

.method public static bridge synthetic a(Leh/f;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Leh/f;->a:Landroid/view/View;

    return-object p0
.end method

.method public static bridge synthetic b(Leh/f;I)V
    .locals 0

    iput p1, p0, Leh/f;->h:I

    return-void
.end method

.method public static bridge synthetic c(Leh/f;F)V
    .locals 0

    iput p1, p0, Leh/f;->d:F

    return-void
.end method

.method public static bridge synthetic d(Leh/f;Z)V
    .locals 0

    iput-boolean p1, p0, Leh/f;->n:Z

    return-void
.end method

.method public static bridge synthetic e(Leh/f;)V
    .locals 0

    invoke-virtual {p0}, Leh/f;->h()V

    return-void
.end method


# virtual methods
.method public final f()Z
    .locals 1

    iget-object v0, p0, Leh/f;->o:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Leh/f;->p:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Leh/f;->q:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final g(II)F
    .locals 5

    iget-object v0, p0, Leh/f;->r:Landroid/graphics/Rect;

    if-eqz v0, :cond_2

    iget v1, v0, Landroid/graphics/Rect;->left:I

    sub-int v2, p1, v1

    iget v3, v0, Landroid/graphics/Rect;->right:I

    sub-int v4, v3, p1

    if-le v2, v4, :cond_0

    sub-int/2addr p1, v1

    goto :goto_0

    :cond_0
    sub-int p1, v3, p1

    :goto_0
    iget v1, v0, Landroid/graphics/Rect;->top:I

    sub-int v2, p2, v1

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    sub-int v3, v0, p2

    if-le v2, v3, :cond_1

    sub-int/2addr p2, v1

    goto :goto_1

    :cond_1
    sub-int p2, v0, p2

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    move p2, p1

    :goto_1
    if-le p2, p1, :cond_3

    move p1, p2

    :cond_3
    int-to-float p1, p1

    const/high16 p2, 0x43960000    # 300.0f

    add-float/2addr p1, p2

    return p1
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, Leh/f;->o:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    iget-object v0, p0, Leh/f;->o:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/Animator;->removeAllListeners()V

    :cond_0
    iget-object v0, p0, Leh/f;->p:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    iget-object v0, p0, Leh/f;->p:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/Animator;->removeAllListeners()V

    :cond_1
    iget-object v0, p0, Leh/f;->q:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    iget-object v0, p0, Leh/f;->q:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/Animator;->removeAllListeners()V

    :cond_2
    return-void
.end method

.method public i(Landroid/graphics/Canvas;)V
    .locals 4

    iget-boolean v0, p0, Leh/f;->n:Z

    if-eqz v0, :cond_0

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iget v1, p0, Leh/f;->l:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget v1, p0, Leh/f;->h:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    iget v1, p0, Leh/f;->b:F

    iget v2, p0, Leh/f;->c:F

    iget v3, p0, Leh/f;->d:F

    invoke-virtual {p1, v1, v2, v3, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method public final j()V
    .locals 3

    invoke-virtual {p0}, Leh/f;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Leh/f;->h()V

    :cond_0
    iget v0, p0, Leh/f;->h:I

    const/4 v1, 0x0

    filled-new-array {v0, v1}, [I

    move-result-object v0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Leh/f;->p:Landroid/animation/ValueAnimator;

    new-instance v1, Leh/f$c;

    invoke-direct {v1, p0}, Leh/f$c;-><init>(Leh/f;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object v0, p0, Leh/f;->p:Landroid/animation/ValueAnimator;

    new-instance v1, Leh/f$d;

    invoke-direct {v1, p0}, Leh/f$d;-><init>(Leh/f;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object v0, p0, Leh/f;->p:Landroid/animation/ValueAnimator;

    iget v1, p0, Leh/f;->j:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object v0, p0, Leh/f;->p:Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v0, p0, Leh/f;->p:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method public final k(II)Z
    .locals 6

    const/4 v0, 0x2

    new-array v0, v0, [I

    iget-object v1, p0, Leh/f;->a:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    const/4 v1, 0x0

    aget v2, v0, v1

    const/4 v3, 0x1

    aget v0, v0, v3

    iget-object v4, p0, Leh/f;->a:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    iget-object v5, p0, Leh/f;->a:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v5

    if-lt p1, v2, :cond_1

    add-int/2addr v2, v4

    if-gt p1, v2, :cond_1

    if-lt p2, v0, :cond_1

    add-int/2addr v0, v5

    if-le p2, v0, :cond_0

    goto :goto_0

    :cond_0
    return v3

    :cond_1
    :goto_0
    return v1
.end method

.method public l(Landroid/view/MotionEvent;)V
    .locals 2

    iget-object v0, p0, Leh/f;->r:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Leh/f;->r:Landroid/graphics/Rect;

    iget-object v1, p0, Leh/f;->a:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 p1, 0x3

    if-eq v0, p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Leh/f;->j()V

    return-void

    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    float-to-int p1, p1

    invoke-virtual {p0, v0, p1}, Leh/f;->k(II)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p0}, Leh/f;->j()V

    :cond_3
    :goto_0
    return-void

    :cond_4
    invoke-virtual {p0}, Leh/f;->j()V

    return-void

    :cond_5
    iput-boolean v1, p0, Leh/f;->n:Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Leh/f;->b:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Leh/f;->c:F

    invoke-virtual {p0}, Leh/f;->m()V

    return-void
.end method

.method public final m()V
    .locals 4

    invoke-virtual {p0}, Leh/f;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Leh/f;->h()V

    :cond_0
    iget v0, p0, Leh/f;->e:F

    iput v0, p0, Leh/f;->d:F

    iget v1, p0, Leh/f;->f:I

    iput v1, p0, Leh/f;->h:I

    iget v1, p0, Leh/f;->k:I

    iput v1, p0, Leh/f;->l:I

    iget v1, p0, Leh/f;->b:F

    float-to-int v1, v1

    iget v2, p0, Leh/f;->c:F

    float-to-int v2, v2

    invoke-virtual {p0, v1, v2}, Leh/f;->g(II)F

    move-result v1

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    aput v0, v2, v3

    const/4 v0, 0x1

    aput v1, v2, v0

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Leh/f;->o:Landroid/animation/ValueAnimator;

    new-instance v1, Leh/f$a;

    invoke-direct {v1, p0}, Leh/f$a;-><init>(Leh/f;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object v0, p0, Leh/f;->o:Landroid/animation/ValueAnimator;

    iget v1, p0, Leh/f;->i:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object v0, p0, Leh/f;->o:Landroid/animation/ValueAnimator;

    new-instance v1, Lg4/c;

    invoke-direct {v1}, Lg4/c;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v0, p0, Leh/f;->o:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    iget v0, p0, Leh/f;->h:I

    iget v1, p0, Leh/f;->g:I

    filled-new-array {v0, v1}, [I

    move-result-object v0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Leh/f;->p:Landroid/animation/ValueAnimator;

    new-instance v1, Leh/f$b;

    invoke-direct {v1, p0}, Leh/f$b;-><init>(Leh/f;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object v0, p0, Leh/f;->p:Landroid/animation/ValueAnimator;

    iget v1, p0, Leh/f;->i:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object v0, p0, Leh/f;->p:Landroid/animation/ValueAnimator;

    new-instance v1, Lg4/a;

    invoke-direct {v1}, Lg4/a;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v0, p0, Leh/f;->p:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method
