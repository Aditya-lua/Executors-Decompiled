.class public Lmk/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmk/i$a;
    }
.end annotation


# instance fields
.field public a:Landroid/graphics/Point;

.field public b:Landroid/graphics/Point;

.field public c:Landroid/graphics/Point;

.field public d:I

.field public e:I

.field public f:F

.field public g:I

.field public h:Lmk/i$a;


# direct methods
.method public constructor <init>(Lmk/i$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lmk/i;->a:Landroid/graphics/Point;

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lmk/i;->b:Landroid/graphics/Point;

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Lmk/i;->c:Landroid/graphics/Point;

    const/4 v0, 0x0

    iput v0, p0, Lmk/i;->f:F

    iput-object p1, p0, Lmk/i;->h:Lmk/i$a;

    const/4 p1, -0x1

    iput p1, p0, Lmk/i;->g:I

    iput p1, p0, Lmk/i;->d:I

    iput p1, p0, Lmk/i;->e:I

    return-void
.end method


# virtual methods
.method public final a(FFFF)V
    .locals 7

    sub-float v0, p1, p3

    float-to-int v0, v0

    sub-float v1, p2, p4

    float-to-int v1, v1

    iget-object v2, p0, Lmk/i;->c:Landroid/graphics/Point;

    iget-object v3, p0, Lmk/i;->b:Landroid/graphics/Point;

    iget v4, v3, Landroid/graphics/Point;->x:I

    iget-object v5, p0, Lmk/i;->a:Landroid/graphics/Point;

    iget v6, v5, Landroid/graphics/Point;->x:I

    sub-int/2addr v4, v6

    iput v4, v2, Landroid/graphics/Point;->x:I

    iget v3, v3, Landroid/graphics/Point;->y:I

    iget v5, v5, Landroid/graphics/Point;->y:I

    sub-int/2addr v3, v5

    iput v3, v2, Landroid/graphics/Point;->y:I

    mul-int v2, v4, v0

    mul-int v5, v3, v1

    add-int/2addr v2, v5

    int-to-float v2, v2

    mul-int/2addr v0, v3

    mul-int/2addr v1, v4

    sub-int/2addr v0, v1

    int-to-double v0, v0

    float-to-double v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v0

    iget-object v2, p0, Lmk/i;->b:Landroid/graphics/Point;

    float-to-int p1, p1

    iput p1, v2, Landroid/graphics/Point;->x:I

    float-to-int p1, p2

    iput p1, v2, Landroid/graphics/Point;->y:I

    iget-object p1, p0, Lmk/i;->a:Landroid/graphics/Point;

    float-to-int p2, p3

    iput p2, p1, Landroid/graphics/Point;->x:I

    float-to-int p2, p4

    iput p2, p1, Landroid/graphics/Point;->y:I

    iget p1, p0, Lmk/i;->f:F

    double-to-float p2, v0

    sub-float/2addr p1, p2

    iput p1, p0, Lmk/i;->f:F

    return-void
.end method

.method public b()F
    .locals 1

    iget v0, p0, Lmk/i;->f:F

    return v0
.end method

.method public c()Landroid/graphics/Point;
    .locals 2

    iget v0, p0, Lmk/i;->d:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lmk/i;->a:Landroid/graphics/Point;

    return-object v0

    :cond_0
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    return-object v0
.end method

.method public d()Landroid/graphics/Point;
    .locals 2

    iget v0, p0, Lmk/i;->e:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lmk/i;->b:Landroid/graphics/Point;

    return-object v0

    :cond_0
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lmk/i;->g:I

    return v0
.end method

.method public f(Landroid/view/MotionEvent;)Z
    .locals 6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, -0x1

    if-eqz v0, :cond_b

    const/4 v4, 0x2

    if-eq v0, v2, :cond_9

    if-eq v0, v4, :cond_5

    const/4 v5, 0x5

    if-eq v0, v5, :cond_2

    const/4 p1, 0x6

    if-eq v0, p1, :cond_0

    goto/16 :goto_2

    :cond_0
    iput v4, p0, Lmk/i;->g:I

    iget p1, p0, Lmk/i;->d:I

    if-eq p1, v3, :cond_1

    iget p1, p0, Lmk/i;->e:I

    if-eq p1, v3, :cond_1

    iget-object p1, p0, Lmk/i;->h:Lmk/i$a;

    invoke-interface {p1, p0}, Lmk/i$a;->a(Lmk/i;)V

    :cond_1
    iput v1, p0, Lmk/i;->f:F

    iput v3, p0, Lmk/i;->e:I

    goto/16 :goto_2

    :cond_2
    iget v0, p0, Lmk/i;->e:I

    if-ne v0, v3, :cond_c

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lmk/i;->e:I

    iget v0, p0, Lmk/i;->d:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    iget v1, p0, Lmk/i;->e:I

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v1

    if-eq v0, v3, :cond_3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v4

    if-ge v0, v4, :cond_3

    iget-object v0, p0, Lmk/i;->a:Landroid/graphics/Point;

    iget v4, p0, Lmk/i;->d:I

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v4

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    float-to-int v4, v4

    iput v4, v0, Landroid/graphics/Point;->x:I

    iget-object v0, p0, Lmk/i;->a:Landroid/graphics/Point;

    iget v4, p0, Lmk/i;->d:I

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v4

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    move-result v4

    float-to-int v4, v4

    iput v4, v0, Landroid/graphics/Point;->y:I

    :cond_3
    if-eq v1, v3, :cond_4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    if-ge v1, v0, :cond_4

    iget-object v0, p0, Lmk/i;->b:Landroid/graphics/Point;

    iget v1, p0, Lmk/i;->e:I

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    float-to-int v1, v1

    iput v1, v0, Landroid/graphics/Point;->x:I

    iget-object v0, p0, Lmk/i;->b:Landroid/graphics/Point;

    iget v1, p0, Lmk/i;->e:I

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    float-to-int p1, p1

    iput p1, v0, Landroid/graphics/Point;->y:I

    :cond_4
    iget-object p1, p0, Lmk/i;->c:Landroid/graphics/Point;

    iget-object v0, p0, Lmk/i;->b:Landroid/graphics/Point;

    iget v1, v0, Landroid/graphics/Point;->x:I

    iget-object v4, p0, Lmk/i;->a:Landroid/graphics/Point;

    iget v5, v4, Landroid/graphics/Point;->x:I

    sub-int/2addr v1, v5

    iput v1, p1, Landroid/graphics/Point;->x:I

    iget v0, v0, Landroid/graphics/Point;->y:I

    iget v1, v4, Landroid/graphics/Point;->y:I

    sub-int/2addr v0, v1

    iput v0, p1, Landroid/graphics/Point;->y:I

    iget p1, p0, Lmk/i;->d:I

    if-eq p1, v3, :cond_c

    iget-object p1, p0, Lmk/i;->h:Lmk/i$a;

    invoke-interface {p1, p0}, Lmk/i$a;->a(Lmk/i;)V

    goto/16 :goto_2

    :cond_5
    iget v0, p0, Lmk/i;->d:I

    if-eq v0, v3, :cond_c

    iget v1, p0, Lmk/i;->e:I

    if-eq v1, v3, :cond_c

    iput v2, p0, Lmk/i;->g:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    iget v1, p0, Lmk/i;->e:I

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v1

    const/high16 v4, -0x40800000    # -1.0f

    if-eq v0, v3, :cond_6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v5

    if-ge v0, v5, :cond_6

    iget v0, p0, Lmk/i;->d:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    iget v5, p0, Lmk/i;->d:I

    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v5

    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getY(I)F

    move-result v5

    goto :goto_0

    :cond_6
    move v0, v4

    move v5, v0

    :goto_0
    if-eq v1, v3, :cond_7

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v3

    if-ge v1, v3, :cond_7

    iget v1, p0, Lmk/i;->e:I

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    iget v3, p0, Lmk/i;->e:I

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    goto :goto_1

    :cond_7
    move p1, v4

    move v1, p1

    :goto_1
    cmpl-float v3, v1, v4

    if-eqz v3, :cond_8

    cmpl-float v3, p1, v4

    if-eqz v3, :cond_8

    cmpl-float v3, v0, v4

    if-eqz v3, :cond_8

    cmpl-float v3, v5, v4

    if-eqz v3, :cond_8

    invoke-virtual {p0, v1, p1, v0, v5}, Lmk/i;->a(FFFF)V

    :cond_8
    iget-object p1, p0, Lmk/i;->h:Lmk/i$a;

    if-eqz p1, :cond_c

    invoke-interface {p1, p0}, Lmk/i$a;->a(Lmk/i;)V

    goto :goto_2

    :cond_9
    iput v4, p0, Lmk/i;->g:I

    iget p1, p0, Lmk/i;->d:I

    if-eq p1, v3, :cond_a

    iget p1, p0, Lmk/i;->e:I

    if-eq p1, v3, :cond_a

    iget-object p1, p0, Lmk/i;->h:Lmk/i$a;

    invoke-interface {p1, p0}, Lmk/i$a;->a(Lmk/i;)V

    :cond_a
    iput v1, p0, Lmk/i;->f:F

    iput v3, p0, Lmk/i;->d:I

    goto :goto_2

    :cond_b
    iget v0, p0, Lmk/i;->d:I

    if-ne v0, v3, :cond_c

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Lmk/i;->d:I

    iput v3, p0, Lmk/i;->e:I

    const/4 p1, 0x0

    iput p1, p0, Lmk/i;->g:I

    iput v1, p0, Lmk/i;->f:F

    :cond_c
    :goto_2
    return v2
.end method
