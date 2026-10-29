.class public Ls7/h;
.super Ls7/a;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field public d:F

.field public e:Z

.field public f:J

.field public g:F

.field public h:F

.field public i:I

.field public j:F

.field public k:F

.field public l:Lf7/i;

.field public m:Z

.field public n:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ls7/a;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Ls7/h;->d:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Ls7/h;->e:Z

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Ls7/h;->f:J

    const/4 v1, 0x0

    iput v1, p0, Ls7/h;->g:F

    iput v1, p0, Ls7/h;->h:F

    iput v0, p0, Ls7/h;->i:I

    const/high16 v1, -0x31000000

    iput v1, p0, Ls7/h;->j:F

    const/high16 v1, 0x4f000000

    iput v1, p0, Ls7/h;->k:F

    iput-boolean v0, p0, Ls7/h;->m:Z

    iput-boolean v0, p0, Ls7/h;->n:Z

    return-void
.end method


# virtual methods
.method public A()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ls7/h;->C(Z)V

    return-void
.end method

.method public C(Z)V
    .locals 1

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Ls7/h;->m:Z

    :cond_0
    return-void
.end method

.method public D()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Ls7/h;->m:Z

    invoke-virtual {p0}, Ls7/h;->z()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Ls7/h;->f:J

    invoke-virtual {p0}, Ls7/h;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ls7/h;->p()F

    move-result v0

    invoke-virtual {p0}, Ls7/h;->s()F

    move-result v1

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ls7/h;->r()F

    move-result v0

    invoke-virtual {p0, v0}, Ls7/h;->J(F)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ls7/h;->v()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ls7/h;->p()F

    move-result v0

    invoke-virtual {p0}, Ls7/h;->r()F

    move-result v1

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ls7/h;->s()F

    move-result v0

    invoke-virtual {p0, v0}, Ls7/h;->J(F)V

    :cond_1
    :goto_0
    invoke-virtual {p0}, Ls7/a;->f()V

    return-void
.end method

.method public E()V
    .locals 1

    invoke-virtual {p0}, Ls7/h;->t()F

    move-result v0

    neg-float v0, v0

    invoke-virtual {p0, v0}, Ls7/h;->P(F)V

    return-void
.end method

.method public G(Lf7/i;)V
    .locals 2

    iget-object v0, p0, Ls7/h;->l:Lf7/i;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object p1, p0, Ls7/h;->l:Lf7/i;

    if-eqz v0, :cond_1

    iget v0, p0, Ls7/h;->j:F

    invoke-virtual {p1}, Lf7/i;->p()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iget v1, p0, Ls7/h;->k:F

    invoke-virtual {p1}, Lf7/i;->f()F

    move-result p1

    invoke-static {v1, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-virtual {p0, v0, p1}, Ls7/h;->N(FF)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lf7/i;->p()F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    invoke-virtual {p1}, Lf7/i;->f()F

    move-result p1

    float-to-int p1, p1

    int-to-float p1, p1

    invoke-virtual {p0, v0, p1}, Ls7/h;->N(FF)V

    :goto_1
    iget p1, p0, Ls7/h;->h:F

    const/4 v0, 0x0

    iput v0, p0, Ls7/h;->h:F

    iput v0, p0, Ls7/h;->g:F

    float-to-int p1, p1

    int-to-float p1, p1

    invoke-virtual {p0, p1}, Ls7/h;->J(F)V

    invoke-virtual {p0}, Ls7/a;->i()V

    return-void
.end method

.method public J(F)V
    .locals 2

    iget v0, p0, Ls7/h;->g:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Ls7/h;->s()F

    move-result v0

    invoke-virtual {p0}, Ls7/h;->r()F

    move-result v1

    invoke-static {p1, v0, v1}, Ls7/j;->b(FFF)F

    move-result p1

    iput p1, p0, Ls7/h;->g:F

    iget-boolean v0, p0, Ls7/h;->n:Z

    if-eqz v0, :cond_1

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-float p1, v0

    :cond_1
    iput p1, p0, Ls7/h;->h:F

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Ls7/h;->f:J

    invoke-virtual {p0}, Ls7/a;->i()V

    return-void
.end method

.method public K(F)V
    .locals 1

    iget v0, p0, Ls7/h;->j:F

    invoke-virtual {p0, v0, p1}, Ls7/h;->N(FF)V

    return-void
.end method

.method public N(FF)V
    .locals 2

    cmpl-float v0, p1, p2

    if-gtz v0, :cond_4

    iget-object v0, p0, Ls7/h;->l:Lf7/i;

    if-nez v0, :cond_0

    const v0, -0x800001

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lf7/i;->p()F

    move-result v0

    :goto_0
    iget-object v1, p0, Ls7/h;->l:Lf7/i;

    if-nez v1, :cond_1

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lf7/i;->f()F

    move-result v1

    :goto_1
    invoke-static {p1, v0, v1}, Ls7/j;->b(FFF)F

    move-result p1

    invoke-static {p2, v0, v1}, Ls7/j;->b(FFF)F

    move-result p2

    iget v0, p0, Ls7/h;->j:F

    cmpl-float v0, p1, v0

    if-nez v0, :cond_3

    iget v0, p0, Ls7/h;->k:F

    cmpl-float v0, p2, v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    return-void

    :cond_3
    :goto_2
    iput p1, p0, Ls7/h;->j:F

    iput p2, p0, Ls7/h;->k:F

    iget v0, p0, Ls7/h;->h:F

    invoke-static {v0, p1, p2}, Ls7/j;->b(FFF)F

    move-result p1

    float-to-int p1, p1

    int-to-float p1, p1

    invoke-virtual {p0, p1}, Ls7/h;->J(F)V

    return-void

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "minFrame (%s) must be <= maxFrame (%s)"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public O(I)V
    .locals 1

    int-to-float p1, p1

    iget v0, p0, Ls7/h;->k:F

    float-to-int v0, v0

    int-to-float v0, v0

    invoke-virtual {p0, p1, v0}, Ls7/h;->N(FF)V

    return-void
.end method

.method public P(F)V
    .locals 0

    iput p1, p0, Ls7/h;->d:F

    return-void
.end method

.method public Q(Z)V
    .locals 0

    iput-boolean p1, p0, Ls7/h;->n:Z

    return-void
.end method

.method public final R()V
    .locals 4

    iget-object v0, p0, Ls7/h;->l:Lf7/i;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Ls7/h;->h:F

    iget v1, p0, Ls7/h;->j:F

    cmpg-float v1, v0, v1

    if-ltz v1, :cond_1

    iget v1, p0, Ls7/h;->k:F

    cmpl-float v0, v0, v1

    if-gtz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    iget v1, p0, Ls7/h;->j:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v2, p0, Ls7/h;->k:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iget v3, p0, Ls7/h;->h:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Frame must be [%f,%f]. It is %f"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a()V
    .locals 1

    invoke-super {p0}, Ls7/a;->a()V

    invoke-virtual {p0}, Ls7/h;->v()Z

    move-result v0

    invoke-virtual {p0, v0}, Ls7/a;->b(Z)V

    return-void
.end method

.method public cancel()V
    .locals 0

    invoke-virtual {p0}, Ls7/h;->a()V

    invoke-virtual {p0}, Ls7/h;->A()V

    return-void
.end method

.method public doFrame(J)V
    .locals 6

    invoke-virtual {p0}, Ls7/h;->z()V

    iget-object v0, p0, Ls7/h;->l:Lf7/i;

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Ls7/h;->isRunning()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-static {}, Lf7/e;->h()Z

    move-result v0

    const-string v1, "LottieValueAnimator#doFrame"

    if-eqz v0, :cond_1

    invoke-static {v1}, Lf7/e;->b(Ljava/lang/String;)V

    :cond_1
    iget-wide v2, p0, Ls7/h;->f:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    sub-long v4, p1, v2

    :goto_0
    invoke-virtual {p0}, Ls7/h;->q()F

    move-result v0

    long-to-float v2, v4

    div-float/2addr v2, v0

    iget v0, p0, Ls7/h;->g:F

    invoke-virtual {p0}, Ls7/h;->v()Z

    move-result v3

    if-eqz v3, :cond_3

    neg-float v2, v2

    :cond_3
    add-float/2addr v0, v2

    invoke-virtual {p0}, Ls7/h;->s()F

    move-result v2

    invoke-virtual {p0}, Ls7/h;->r()F

    move-result v3

    invoke-static {v0, v2, v3}, Ls7/j;->d(FFF)Z

    move-result v2

    iget v3, p0, Ls7/h;->g:F

    invoke-virtual {p0}, Ls7/h;->s()F

    move-result v4

    invoke-virtual {p0}, Ls7/h;->r()F

    move-result v5

    invoke-static {v0, v4, v5}, Ls7/j;->b(FFF)F

    move-result v0

    iput v0, p0, Ls7/h;->g:F

    iget-boolean v4, p0, Ls7/h;->n:Z

    if-eqz v4, :cond_4

    float-to-double v4, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-float v0, v4

    :cond_4
    iput v0, p0, Ls7/h;->h:F

    iput-wide p1, p0, Ls7/h;->f:J

    if-nez v2, :cond_9

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getRepeatCount()I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_6

    iget v0, p0, Ls7/h;->i:I

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getRepeatCount()I

    move-result v2

    if-lt v0, v2, :cond_6

    iget p1, p0, Ls7/h;->d:F

    const/4 p2, 0x0

    cmpg-float p1, p1, p2

    if-gez p1, :cond_5

    invoke-virtual {p0}, Ls7/h;->s()F

    move-result p1

    goto :goto_1

    :cond_5
    invoke-virtual {p0}, Ls7/h;->r()F

    move-result p1

    :goto_1
    iput p1, p0, Ls7/h;->g:F

    iput p1, p0, Ls7/h;->h:F

    invoke-virtual {p0}, Ls7/h;->A()V

    invoke-virtual {p0, v3}, Ls7/h;->j(F)V

    invoke-virtual {p0}, Ls7/h;->v()Z

    move-result p1

    invoke-virtual {p0, p1}, Ls7/a;->b(Z)V

    goto :goto_4

    :cond_6
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getRepeatMode()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_7

    iget-boolean v0, p0, Ls7/h;->e:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Ls7/h;->e:Z

    invoke-virtual {p0}, Ls7/h;->E()V

    goto :goto_3

    :cond_7
    invoke-virtual {p0}, Ls7/h;->v()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Ls7/h;->r()F

    move-result v0

    goto :goto_2

    :cond_8
    invoke-virtual {p0}, Ls7/h;->s()F

    move-result v0

    :goto_2
    iput v0, p0, Ls7/h;->g:F

    iput v0, p0, Ls7/h;->h:F

    :goto_3
    iput-wide p1, p0, Ls7/h;->f:J

    invoke-virtual {p0, v3}, Ls7/h;->j(F)V

    invoke-virtual {p0}, Ls7/a;->e()V

    iget p1, p0, Ls7/h;->i:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ls7/h;->i:I

    goto :goto_4

    :cond_9
    invoke-virtual {p0, v3}, Ls7/h;->j(F)V

    :goto_4
    invoke-virtual {p0}, Ls7/h;->R()V

    invoke-static {}, Lf7/e;->h()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-static {v1}, Lf7/e;->c(Ljava/lang/String;)F

    :cond_a
    :goto_5
    return-void
.end method

.method public getAnimatedFraction()F
    .locals 3

    iget-object v0, p0, Ls7/h;->l:Lf7/i;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {p0}, Ls7/h;->v()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ls7/h;->r()F

    move-result v0

    iget v1, p0, Ls7/h;->h:F

    sub-float/2addr v0, v1

    invoke-virtual {p0}, Ls7/h;->r()F

    move-result v1

    invoke-virtual {p0}, Ls7/h;->s()F

    move-result v2

    :goto_0
    sub-float/2addr v1, v2

    div-float/2addr v0, v1

    return v0

    :cond_1
    iget v0, p0, Ls7/h;->h:F

    invoke-virtual {p0}, Ls7/h;->s()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-virtual {p0}, Ls7/h;->r()F

    move-result v1

    invoke-virtual {p0}, Ls7/h;->s()F

    move-result v2

    goto :goto_0
.end method

.method public getAnimatedValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ls7/h;->o()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public getDuration()J
    .locals 2

    iget-object v0, p0, Ls7/h;->l:Lf7/i;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    invoke-virtual {v0}, Lf7/i;->d()F

    move-result v0

    float-to-long v0, v0

    return-wide v0
.end method

.method public isRunning()Z
    .locals 1

    iget-boolean v0, p0, Ls7/h;->m:Z

    return v0
.end method

.method public final j(F)V
    .locals 1

    iget-boolean v0, p0, Ls7/h;->n:Z

    if-eqz v0, :cond_1

    iget v0, p0, Ls7/h;->g:F

    cmpl-float p1, v0, p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0}, Ls7/a;->i()V

    return-void
.end method

.method public k()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ls7/h;->l:Lf7/i;

    const/high16 v0, -0x31000000

    iput v0, p0, Ls7/h;->j:F

    const/high16 v0, 0x4f000000

    iput v0, p0, Ls7/h;->k:F

    return-void
.end method

.method public n()V
    .locals 1

    invoke-virtual {p0}, Ls7/h;->A()V

    invoke-virtual {p0}, Ls7/h;->v()Z

    move-result v0

    invoke-virtual {p0, v0}, Ls7/a;->b(Z)V

    return-void
.end method

.method public o()F
    .locals 3

    iget-object v0, p0, Ls7/h;->l:Lf7/i;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v1, p0, Ls7/h;->h:F

    invoke-virtual {v0}, Lf7/i;->p()F

    move-result v0

    sub-float/2addr v1, v0

    iget-object v0, p0, Ls7/h;->l:Lf7/i;

    invoke-virtual {v0}, Lf7/i;->f()F

    move-result v0

    iget-object v2, p0, Ls7/h;->l:Lf7/i;

    invoke-virtual {v2}, Lf7/i;->p()F

    move-result v2

    sub-float/2addr v0, v2

    div-float/2addr v1, v0

    return v1
.end method

.method public p()F
    .locals 1

    iget v0, p0, Ls7/h;->h:F

    return v0
.end method

.method public final q()F
    .locals 2

    iget-object v0, p0, Ls7/h;->l:Lf7/i;

    if-nez v0, :cond_0

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    return v0

    :cond_0
    const v1, 0x4e6e6b28    # 1.0E9f

    invoke-virtual {v0}, Lf7/i;->i()F

    move-result v0

    div-float/2addr v1, v0

    iget v0, p0, Ls7/h;->d:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    div-float/2addr v1, v0

    return v1
.end method

.method public r()F
    .locals 3

    iget-object v0, p0, Ls7/h;->l:Lf7/i;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v1, p0, Ls7/h;->k:F

    const/high16 v2, 0x4f000000

    cmpl-float v2, v1, v2

    if-nez v2, :cond_1

    invoke-virtual {v0}, Lf7/i;->f()F

    move-result v0

    return v0

    :cond_1
    return v1
.end method

.method public s()F
    .locals 3

    iget-object v0, p0, Ls7/h;->l:Lf7/i;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v1, p0, Ls7/h;->j:F

    const/high16 v2, -0x31000000

    cmpl-float v2, v1, v2

    if-nez v2, :cond_1

    invoke-virtual {v0}, Lf7/i;->p()F

    move-result v0

    return v0

    :cond_1
    return v1
.end method

.method public setRepeatMode(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    iget-boolean p1, p0, Ls7/h;->e:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Ls7/h;->e:Z

    invoke-virtual {p0}, Ls7/h;->E()V

    :cond_0
    return-void
.end method

.method public t()F
    .locals 1

    iget v0, p0, Ls7/h;->d:F

    return v0
.end method

.method public final v()Z
    .locals 2

    invoke-virtual {p0}, Ls7/h;->t()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public w()V
    .locals 0

    invoke-virtual {p0}, Ls7/h;->A()V

    invoke-virtual {p0}, Ls7/a;->c()V

    return-void
.end method

.method public x()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Ls7/h;->m:Z

    invoke-virtual {p0}, Ls7/h;->v()Z

    move-result v0

    invoke-virtual {p0, v0}, Ls7/a;->h(Z)V

    invoke-virtual {p0}, Ls7/h;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ls7/h;->r()F

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ls7/h;->s()F

    move-result v0

    :goto_0
    float-to-int v0, v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Ls7/h;->J(F)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Ls7/h;->f:J

    const/4 v0, 0x0

    iput v0, p0, Ls7/h;->i:I

    invoke-virtual {p0}, Ls7/h;->z()V

    return-void
.end method

.method public z()V
    .locals 1

    invoke-virtual {p0}, Ls7/h;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ls7/h;->C(Z)V

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    :cond_0
    return-void
.end method
