.class public final Lmk/f$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/GestureDetector$OnGestureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmk/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "g"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:Landroid/view/VelocityTracker;

.field public final synthetic h:Lmk/f;


# direct methods
.method public constructor <init>(Lmk/f;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lmk/f$g;->h:Lmk/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    .line 3
    iput p1, p0, Lmk/f$g;->a:I

    .line 4
    iput p1, p0, Lmk/f$g;->b:I

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lmk/f$g;->c:I

    .line 6
    iput p1, p0, Lmk/f$g;->d:I

    .line 7
    iput p1, p0, Lmk/f$g;->e:I

    .line 8
    iput p1, p0, Lmk/f$g;->f:I

    return-void
.end method

.method public synthetic constructor <init>(Lmk/f;Lmk/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lmk/f$g;-><init>(Lmk/f;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 8

    const/4 v0, -0x1

    iput v0, p0, Lmk/f$g;->b:I

    iget-object v0, p0, Lmk/f$g;->g:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v0, 0x0

    iput-object v0, p0, Lmk/f$g;->g:Landroid/view/VelocityTracker;

    :cond_0
    iget-object v0, p0, Lmk/f$g;->h:Lmk/f;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lmk/f;->e(Lmk/f;Z)V

    iget v0, p0, Lmk/f$g;->c:I

    int-to-float v2, v0

    iget v0, p0, Lmk/f$g;->d:I

    int-to-float v3, v0

    iget v0, p0, Lmk/f$g;->e:I

    int-to-float v4, v0

    iget v0, p0, Lmk/f$g;->f:I

    int-to-float v5, v0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v1, 0x2

    invoke-static/range {v1 .. v7}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassPanGestureWithVelocity(IFFFFFF)V

    return-void
.end method

.method public b(Landroid/view/MotionEvent;)V
    .locals 7

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->e0()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    iput v0, p0, Lmk/f$g;->b:I

    iget-object v0, p0, Lmk/f$g;->g:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v0, 0x0

    iput-object v0, p0, Lmk/f$g;->g:Landroid/view/VelocityTracker;

    :cond_0
    iget-object v0, p0, Lmk/f$g;->h:Lmk/f;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lmk/f;->e(Lmk/f;Z)V

    iget-object v0, p0, Lmk/f$g;->h:Lmk/f;

    invoke-static {v0}, Lmk/f;->h(Lmk/f;)F

    move-result v0

    invoke-static {p1, v0}, Lmk/f;->m(Landroid/view/MotionEvent;F)[F

    move-result-object v2

    iget p1, p0, Lmk/f$g;->e:I

    int-to-float v3, p1

    iget p1, p0, Lmk/f$g;->f:I

    int-to-float v4, p1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v1, 0x2

    invoke-static/range {v1 .. v6}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassPanGestureMultitouch(I[FFFFF)V

    :cond_1
    return-void
.end method

.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    if-nez p2, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v1

    const/16 v2, 0x2002

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    return v0

    :cond_1
    :try_start_0
    iget-object v1, p0, Lmk/f$g;->h:Lmk/f;

    invoke-static {v1}, Lmk/f;->h(Lmk/f;)F

    move-result v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    div-float/2addr v2, v1

    float-to-int v2, v2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    div-float/2addr p2, v1

    float-to-int p2, p2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    div-float/2addr v3, v1

    float-to-int v3, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    div-float/2addr p1, v1

    float-to-int p1, p1

    sub-int/2addr p2, p1

    int-to-float p2, p2

    sub-int/2addr v2, v3

    int-to-float v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v2

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v4

    cmpl-float v2, v2, v4

    const/4 v4, 0x0

    const/high16 v5, 0x42480000    # 50.0f

    if-lez v2, :cond_3

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result p2

    cmpl-float p2, p2, v5

    if-lez p2, :cond_5

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p2

    cmpl-float p2, p2, v5

    if-lez p2, :cond_5

    cmpl-float p2, v1, v4

    if-lez p2, :cond_2

    iget-object p2, p0, Lmk/f$g;->h:Lmk/f;

    invoke-virtual {p2, v3, p1}, Lmk/f;->C(II)V

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_2
    iget-object p2, p0, Lmk/f$g;->h:Lmk/f;

    invoke-virtual {p2, v3, p1}, Lmk/f;->B(II)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p3

    cmpl-float p3, p3, v5

    if-lez p3, :cond_5

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result p3

    cmpl-float p3, p3, v5

    if-lez p3, :cond_5

    cmpl-float p2, p2, v4

    if-lez p2, :cond_4

    iget-object p2, p0, Lmk/f$g;->h:Lmk/f;

    invoke-virtual {p2, v3, p1}, Lmk/f;->A(II)V

    goto :goto_1

    :cond_4
    iget-object p2, p0, Lmk/f$g;->h:Lmk/f;

    invoke-virtual {p2, v3, p1}, Lmk/f;->D(II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_5
    :goto_1
    return v0
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v0

    const/16 v1, 0x2002

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lmk/f$g;->a:I

    iget-object v0, p0, Lmk/f$g;->h:Lmk/f;

    invoke-static {v0}, Lmk/f;->h(Lmk/f;)F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    div-float/2addr v1, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    div-float/2addr p1, v0

    const/4 v0, 0x0

    invoke-static {v0, v1, p1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassLongPressGesture(IFF)V

    return-void
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 7

    const/4 p3, 0x0

    if-eqz p1, :cond_9

    if-nez p2, :cond_0

    goto/16 :goto_3

    :cond_0
    iget p4, p0, Lmk/f$g;->b:I

    const/4 v0, -0x1

    if-ne p4, v0, :cond_1

    iget-object p4, p0, Lmk/f$g;->h:Lmk/f;

    const/4 v0, 0x1

    invoke-static {p4, v0}, Lmk/f;->e(Lmk/f;Z)V

    goto :goto_0

    :cond_1
    move v0, p3

    :goto_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result p4

    invoke-virtual {p2, p4}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p4

    iput p4, p0, Lmk/f$g;->b:I

    iget-object p4, p0, Lmk/f$g;->h:Lmk/f;

    invoke-static {p4}, Lmk/f;->h(Lmk/f;)F

    move-result p4

    iget v1, p0, Lmk/f$g;->c:I

    iget v2, p0, Lmk/f$g;->d:I

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    div-float/2addr v3, p4

    float-to-int v3, v3

    iput v3, p0, Lmk/f$g;->c:I

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    div-float/2addr v3, p4

    float-to-int v3, v3

    iput v3, p0, Lmk/f$g;->d:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    div-float/2addr v3, p4

    float-to-int v3, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    div-float/2addr v4, p4

    float-to-int v4, v4

    iget v5, p0, Lmk/f$g;->c:I

    sub-int/2addr v5, v3

    iput v5, p0, Lmk/f$g;->e:I

    iget v5, p0, Lmk/f$g;->d:I

    sub-int/2addr v5, v4

    iput v5, p0, Lmk/f$g;->f:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result p1

    const/16 v5, 0x2002

    and-int/2addr p1, v5

    if-ne p1, v5, :cond_3

    if-eqz v0, :cond_2

    iget v1, p0, Lmk/f$g;->c:I

    iget v2, p0, Lmk/f$g;->d:I

    :cond_2
    iget-object p1, p0, Lmk/f$g;->h:Lmk/f;

    invoke-static {p1}, Lmk/f;->d(Lmk/f;)Landroid/view/SurfaceView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p1, p4

    iget-object p2, p0, Lmk/f$g;->h:Lmk/f;

    invoke-static {p2}, Lmk/f;->d(Lmk/f;)Landroid/view/SurfaceView;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p2, p4

    iget p4, p0, Lmk/f$g;->c:I

    sub-int/2addr p4, v1

    int-to-float p4, p4

    iget v0, p0, Lmk/f$g;->d:I

    sub-int/2addr v0, v2

    int-to-float v0, v0

    const/high16 v1, 0x40e00000    # 7.0f

    mul-float/2addr p4, v1

    div-float/2addr p4, p1

    mul-float/2addr v0, v1

    div-float/2addr v0, p2

    int-to-float p1, v3

    int-to-float p2, v4

    invoke-static {p1, p2, p4, v0}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassMousePan(FFFF)V

    return p3

    :cond_3
    if-eqz v0, :cond_6

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->e0()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {p2, p4}, Lmk/f;->m(Landroid/view/MotionEvent;F)[F

    move-result-object v1

    iget p1, p0, Lmk/f$g;->e:I

    int-to-float v2, p1

    iget p1, p0, Lmk/f$g;->f:I

    int-to-float v3, p1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v0, 0x0

    invoke-static/range {v0 .. v5}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassPanGestureMultitouch(I[FFFFF)V

    goto :goto_1

    :cond_4
    iget p1, p0, Lmk/f$g;->c:I

    int-to-float v1, p1

    iget p1, p0, Lmk/f$g;->d:I

    int-to-float v2, p1

    iget p1, p0, Lmk/f$g;->e:I

    int-to-float v3, p1

    iget p1, p0, Lmk/f$g;->f:I

    int-to-float v4, p1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v0, 0x0

    invoke-static/range {v0 .. v6}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassPanGestureWithVelocity(IFFFFFF)V

    :goto_1
    iget-object p1, p0, Lmk/f$g;->g:Landroid/view/VelocityTracker;

    if-nez p1, :cond_5

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object p1

    iput-object p1, p0, Lmk/f$g;->g:Landroid/view/VelocityTracker;

    :cond_5
    iget-object p1, p0, Lmk/f$g;->g:Landroid/view/VelocityTracker;

    invoke-virtual {p1, p2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    goto :goto_3

    :cond_6
    iget-object p1, p0, Lmk/f$g;->g:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_7

    invoke-virtual {p1, p2}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    iget-object p1, p0, Lmk/f$g;->g:Landroid/view/VelocityTracker;

    const/16 v0, 0x3e8

    invoke-virtual {p1, v0}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    iget-object p1, p0, Lmk/f$g;->g:Landroid/view/VelocityTracker;

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result p1

    div-float/2addr p1, p4

    iget-object v0, p0, Lmk/f$g;->g:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v0

    div-float/2addr v0, p4

    move v4, p1

    move v5, v0

    goto :goto_2

    :cond_7
    const/4 p1, 0x0

    move v4, p1

    move v5, v4

    :goto_2
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->e0()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {p2, p4}, Lmk/f;->m(Landroid/view/MotionEvent;F)[F

    move-result-object v1

    iget p1, p0, Lmk/f$g;->e:I

    int-to-float v2, p1

    iget p1, p0, Lmk/f$g;->f:I

    int-to-float v3, p1

    const/4 v0, 0x1

    invoke-static/range {v0 .. v5}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassPanGestureMultitouch(I[FFFFF)V

    goto :goto_3

    :cond_8
    iget p1, p0, Lmk/f$g;->c:I

    int-to-float v1, p1

    iget p1, p0, Lmk/f$g;->d:I

    int-to-float v2, p1

    iget p1, p0, Lmk/f$g;->e:I

    int-to-float v3, p1

    iget p1, p0, Lmk/f$g;->f:I

    int-to-float p1, p1

    const/4 v0, 0x1

    move v6, v5

    move v5, v4

    move v4, p1

    invoke-static/range {v0 .. v6}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassPanGestureWithVelocity(IFFFFFF)V

    :cond_9
    :goto_3
    return p3
.end method

.method public onShowPress(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v0

    const/16 v1, 0x2002

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    iget-object v0, p0, Lmk/f$g;->h:Lmk/f;

    invoke-static {v0}, Lmk/f;->h(Lmk/f;)F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    div-float/2addr v1, v0

    float-to-int v1, v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    div-float/2addr p1, v0

    float-to-int p1, p1

    int-to-float v0, v1

    int-to-float p1, p1

    invoke-static {v0, p1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassTapGesture(FF)V

    return v2
.end method
