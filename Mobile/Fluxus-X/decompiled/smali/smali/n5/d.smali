.class public Ln5/d;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/w;
.implements Landroidx/core/view/v;
.implements Landroidx/core/view/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln5/d$k;,
        Ln5/d$j;,
        Ln5/d$i;
    }
.end annotation


# static fields
.field public static final P:Ljava/lang/String; = "d"

.field public static final Q:[I


# instance fields
.field public A:I

.field public B:I

.field public C:Ln5/b;

.field public D:Landroid/view/animation/Animation;

.field public E:Landroid/view/animation/Animation;

.field public F:Landroid/view/animation/Animation;

.field public G:Landroid/view/animation/Animation;

.field public H:Landroid/view/animation/Animation;

.field public I:Z

.field public J:I

.field public K:Z

.field public L:Z

.field public M:Landroid/view/animation/Animation$AnimationListener;

.field public final N:Landroid/view/animation/Animation;

.field public final O:Landroid/view/animation/Animation;

.field public a:Landroid/view/View;

.field public b:Ln5/d$j;

.field public c:Z

.field public d:I

.field public e:F

.field public f:F

.field public final g:Landroidx/core/view/x;

.field public final h:Landroidx/core/view/u;

.field public final i:[I

.field public final j:[I

.field public final k:[I

.field public l:Z

.field public m:I

.field public n:I

.field public o:F

.field public p:F

.field public q:Z

.field public r:I

.field public s:Z

.field public t:Z

.field public final u:Landroid/view/animation/DecelerateInterpolator;

.field public v:Ln5/a;

.field public w:I

.field public x:I

.field public y:F

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const v0, 0x101000e

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ln5/d;->Q:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ln5/d;->c:Z

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Ln5/d;->e:F

    const/4 v1, 0x2

    new-array v2, v1, [I

    iput-object v2, p0, Ln5/d;->i:[I

    new-array v2, v1, [I

    iput-object v2, p0, Ln5/d;->j:[I

    new-array v1, v1, [I

    iput-object v1, p0, Ln5/d;->k:[I

    const/4 v1, -0x1

    iput v1, p0, Ln5/d;->r:I

    iput v1, p0, Ln5/d;->w:I

    new-instance v1, Ln5/d$a;

    invoke-direct {v1, p0}, Ln5/d$a;-><init>(Ln5/d;)V

    iput-object v1, p0, Ln5/d;->M:Landroid/view/animation/Animation$AnimationListener;

    new-instance v1, Ln5/d$f;

    invoke-direct {v1, p0}, Ln5/d$f;-><init>(Ln5/d;)V

    iput-object v1, p0, Ln5/d;->N:Landroid/view/animation/Animation;

    new-instance v1, Ln5/d$g;

    invoke-direct {v1, p0}, Ln5/d$g;-><init>(Ln5/d;)V

    iput-object v1, p0, Ln5/d;->O:Landroid/view/animation/Animation;

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v1

    iput v1, p0, Ln5/d;->d:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x10e0001

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    iput v1, p0, Ln5/d;->m:I

    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {v1, v2}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    iput-object v1, p0, Ln5/d;->u:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    const/high16 v2, 0x42200000    # 40.0f

    iget v3, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v3, v2

    float-to-int v2, v3

    iput v2, p0, Ln5/d;->J:I

    invoke-virtual {p0}, Ln5/d;->e()V

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    const/high16 v3, 0x42800000    # 64.0f

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v1, v3

    float-to-int v1, v1

    iput v1, p0, Ln5/d;->A:I

    int-to-float v1, v1

    iput v1, p0, Ln5/d;->e:F

    new-instance v1, Landroidx/core/view/x;

    invoke-direct {v1, p0}, Landroidx/core/view/x;-><init>(Landroid/view/ViewGroup;)V

    iput-object v1, p0, Ln5/d;->g:Landroidx/core/view/x;

    new-instance v1, Landroidx/core/view/u;

    invoke-direct {v1, p0}, Landroidx/core/view/u;-><init>(Landroid/view/View;)V

    iput-object v1, p0, Ln5/d;->h:Landroidx/core/view/u;

    invoke-virtual {p0, v2}, Ln5/d;->setNestedScrollingEnabled(Z)V

    iget v1, p0, Ln5/d;->J:I

    neg-int v1, v1

    iput v1, p0, Ln5/d;->n:I

    iput v1, p0, Ln5/d;->z:I

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p0, v1}, Ln5/d;->q(F)V

    sget-object v1, Ln5/d;->Q:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-virtual {p0, p2}, Ln5/d;->setEnabled(Z)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static synthetic a(Ln5/d;)V
    .locals 0

    invoke-virtual {p0}, Ln5/d;->s()V

    return-void
.end method

.method private r(Landroid/view/MotionEvent;)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iget v2, p0, Ln5/d;->r:I

    if-ne v1, v2, :cond_1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Ln5/d;->r:I

    :cond_1
    return-void
.end method

.method private setColorViewAlpha(I)V
    .locals 1

    iget-object v0, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    iget-object v0, p0, Ln5/d;->C:Ln5/b;

    invoke-virtual {v0, p1}, Ln5/b;->setAlpha(I)V

    return-void
.end method


# virtual methods
.method public final A(ILandroid/view/animation/Animation$AnimationListener;)V
    .locals 2

    iput p1, p0, Ln5/d;->x:I

    iget-object p1, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {p1}, Landroid/view/View;->getScaleX()F

    move-result p1

    iput p1, p0, Ln5/d;->y:F

    new-instance p1, Ln5/d$h;

    invoke-direct {p1, p0}, Ln5/d$h;-><init>(Ln5/d;)V

    iput-object p1, p0, Ln5/d;->H:Landroid/view/animation/Animation;

    const-wide/16 v0, 0x96

    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    if-eqz p2, :cond_0

    iget-object p1, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {p1, p2}, Ln5/a;->b(Landroid/view/animation/Animation$AnimationListener;)V

    :cond_0
    iget-object p1, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    iget-object p1, p0, Ln5/d;->v:Ln5/a;

    iget-object p2, p0, Ln5/d;->H:Landroid/view/animation/Animation;

    invoke-virtual {p1, p2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public final B(Landroid/view/animation/Animation$AnimationListener;)V
    .locals 3

    iget-object v0, p0, Ln5/d;->v:Ln5/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Ln5/d;->C:Ln5/b;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Ln5/b;->setAlpha(I)V

    new-instance v0, Ln5/d$b;

    invoke-direct {v0, p0}, Ln5/d$b;-><init>(Ln5/d;)V

    iput-object v0, p0, Ln5/d;->D:Landroid/view/animation/Animation;

    iget v1, p0, Ln5/d;->m:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {v0, p1}, Ln5/a;->b(Landroid/view/animation/Animation$AnimationListener;)V

    :cond_0
    iget-object p1, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    iget-object p1, p0, Ln5/d;->v:Ln5/a;

    iget-object v0, p0, Ln5/d;->D:Landroid/view/animation/Animation;

    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public final b(ILandroid/view/animation/Animation$AnimationListener;)V
    .locals 2

    iput p1, p0, Ln5/d;->x:I

    iget-object p1, p0, Ln5/d;->N:Landroid/view/animation/Animation;

    invoke-virtual {p1}, Landroid/view/animation/Animation;->reset()V

    iget-object p1, p0, Ln5/d;->N:Landroid/view/animation/Animation;

    const-wide/16 v0, 0xc8

    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    iget-object p1, p0, Ln5/d;->N:Landroid/view/animation/Animation;

    iget-object v0, p0, Ln5/d;->u:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    if-eqz p2, :cond_0

    iget-object p1, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {p1, p2}, Ln5/a;->b(Landroid/view/animation/Animation$AnimationListener;)V

    :cond_0
    iget-object p1, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    iget-object p1, p0, Ln5/d;->v:Ln5/a;

    iget-object p2, p0, Ln5/d;->N:Landroid/view/animation/Animation;

    invoke-virtual {p1, p2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public final c(ILandroid/view/animation/Animation$AnimationListener;)V
    .locals 2

    iget-boolean v0, p0, Ln5/d;->s:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2}, Ln5/d;->A(ILandroid/view/animation/Animation$AnimationListener;)V

    return-void

    :cond_0
    iput p1, p0, Ln5/d;->x:I

    iget-object p1, p0, Ln5/d;->O:Landroid/view/animation/Animation;

    invoke-virtual {p1}, Landroid/view/animation/Animation;->reset()V

    iget-object p1, p0, Ln5/d;->O:Landroid/view/animation/Animation;

    const-wide/16 v0, 0xc8

    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    iget-object p1, p0, Ln5/d;->O:Landroid/view/animation/Animation;

    iget-object v0, p0, Ln5/d;->u:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    if-eqz p2, :cond_1

    iget-object p1, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {p1, p2}, Ln5/a;->b(Landroid/view/animation/Animation$AnimationListener;)V

    :cond_1
    iget-object p1, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    iget-object p1, p0, Ln5/d;->v:Ln5/a;

    iget-object p2, p0, Ln5/d;->O:Landroid/view/animation/Animation;

    invoke-virtual {p1, p2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public d()Z
    .locals 3

    iget-object v0, p0, Ln5/d;->a:Landroid/view/View;

    instance-of v1, v0, Landroid/widget/ListView;

    const/4 v2, -0x1

    if-eqz v1, :cond_0

    check-cast v0, Landroid/widget/ListView;

    invoke-virtual {v0, v2}, Landroid/widget/AbsListView;->canScrollList(I)Z

    move-result v0

    return v0

    :cond_0
    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v0

    return v0
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v2, 0x11d

    if-ne v0, v2, :cond_0

    invoke-virtual {p0, v1, v1}, Ln5/d;->u(ZZ)V

    return v1

    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedFling(FFZ)Z
    .locals 1

    iget-object v0, p0, Ln5/d;->h:Landroidx/core/view/u;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/core/view/u;->a(FFZ)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedPreFling(FF)Z
    .locals 1

    iget-object v0, p0, Ln5/d;->h:Landroidx/core/view/u;

    invoke-virtual {v0, p1, p2}, Landroidx/core/view/u;->b(FF)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedPreScroll(II[I[I)Z
    .locals 1

    iget-object v0, p0, Ln5/d;->h:Landroidx/core/view/u;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/core/view/u;->c(II[I[I)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedScroll(IIII[I)Z
    .locals 6

    iget-object v0, p0, Ln5/d;->h:Landroidx/core/view/u;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Landroidx/core/view/u;->f(IIII[I)Z

    move-result p1

    return p1
.end method

.method public final e()V
    .locals 2

    new-instance v0, Ln5/a;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Ln5/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ln5/d;->v:Ln5/a;

    new-instance v0, Ln5/b;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Ln5/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ln5/d;->C:Ln5/b;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ln5/b;->l(I)V

    iget-object v0, p0, Ln5/d;->v:Ln5/a;

    iget-object v1, p0, Ln5/d;->C:Ln5/b;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Ln5/d;->v:Ln5/a;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public f(IIII[II[I)V
    .locals 8

    if-nez p6, :cond_0

    iget-object v0, p0, Ln5/d;->h:Landroidx/core/view/u;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move v6, p6

    move-object v7, p7

    invoke-virtual/range {v0 .. v7}, Landroidx/core/view/u;->e(IIII[II[I)V

    :cond_0
    return-void
.end method

.method public final g()V
    .locals 3

    iget-object v0, p0, Ln5/d;->a:Landroid/view/View;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iput-object v1, p0, Ln5/d;->a:Landroid/view/View;

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public getChildDrawingOrder(II)I
    .locals 1

    iget v0, p0, Ln5/d;->w:I

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, -0x1

    if-ne p2, p1, :cond_1

    return v0

    :cond_1
    if-lt p2, v0, :cond_2

    add-int/lit8 p2, p2, 0x1

    :cond_2
    :goto_0
    return p2
.end method

.method public getNestedScrollAxes()I
    .locals 1

    iget-object v0, p0, Ln5/d;->g:Landroidx/core/view/x;

    invoke-virtual {v0}, Landroidx/core/view/x;->a()I

    move-result v0

    return v0
.end method

.method public getProgressCircleDiameter()I
    .locals 1

    iget v0, p0, Ln5/d;->J:I

    return v0
.end method

.method public getProgressViewEndOffset()I
    .locals 1

    iget v0, p0, Ln5/d;->A:I

    return v0
.end method

.method public getProgressViewStartOffset()I
    .locals 1

    iget v0, p0, Ln5/d;->z:I

    return v0
.end method

.method public final h(F)V
    .locals 2

    iget v0, p0, Ln5/d;->e:F

    cmpl-float p1, p1, v0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1, p1}, Ln5/d;->t(ZZ)V

    return-void

    :cond_0
    const/4 p1, 0x0

    iput-boolean p1, p0, Ln5/d;->c:Z

    iget-object v0, p0, Ln5/d;->C:Ln5/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Ln5/b;->j(FF)V

    iget-boolean v0, p0, Ln5/d;->s:Z

    if-nez v0, :cond_1

    new-instance v0, Ln5/d$e;

    invoke-direct {v0, p0}, Ln5/d$e;-><init>(Ln5/d;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Ln5/d;->n:I

    invoke-virtual {p0, v1, v0}, Ln5/d;->c(ILandroid/view/animation/Animation$AnimationListener;)V

    iget-object v0, p0, Ln5/d;->C:Ln5/b;

    invoke-virtual {v0, p1}, Ln5/b;->d(Z)V

    return-void
.end method

.method public hasNestedScrollingParent()Z
    .locals 1

    iget-object v0, p0, Ln5/d;->h:Landroidx/core/view/u;

    invoke-virtual {v0}, Landroidx/core/view/u;->j()Z

    move-result v0

    return v0
.end method

.method public i(Landroid/view/View;Landroid/view/View;II)V
    .locals 0

    if-nez p4, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Ln5/d;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public isNestedScrollingEnabled()Z
    .locals 1

    iget-object v0, p0, Ln5/d;->h:Landroidx/core/view/u;

    invoke-virtual {v0}, Landroidx/core/view/u;->l()Z

    move-result v0

    return v0
.end method

.method public j(Landroid/view/View;I)V
    .locals 0

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, Ln5/d;->onStopNestedScroll(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public k(Landroid/view/View;II[II)V
    .locals 0

    if-nez p5, :cond_0

    invoke-virtual {p0, p1, p2, p3, p4}, Ln5/d;->onNestedPreScroll(Landroid/view/View;II[I)V

    :cond_0
    return-void
.end method

.method public final l(Landroid/view/animation/Animation;)Z
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/animation/Animation;->hasStarted()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/animation/Animation;->hasEnded()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public m(Landroid/view/View;IIIII[I)V
    .locals 9

    if-eqz p6, :cond_0

    goto :goto_1

    :cond_0
    const/4 p1, 0x1

    aget v0, p7, p1

    iget-object v6, p0, Ln5/d;->j:[I

    move-object v1, p0

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v7, p6

    move-object/from16 v8, p7

    invoke-virtual/range {v1 .. v8}, Ln5/d;->f(IIII[II[I)V

    aget p2, p7, p1

    sub-int/2addr p2, v0

    sub-int p2, p5, p2

    if-nez p2, :cond_1

    iget-object p3, p0, Ln5/d;->j:[I

    aget p3, p3, p1

    add-int/2addr p5, p3

    goto :goto_0

    :cond_1
    move p5, p2

    :goto_0
    if-gez p5, :cond_2

    invoke-virtual {p0}, Ln5/d;->d()Z

    move-result p3

    if-nez p3, :cond_2

    iget p3, p0, Ln5/d;->f:F

    invoke-static {p5}, Ljava/lang/Math;->abs(I)I

    move-result p4

    int-to-float p4, p4

    add-float/2addr p3, p4

    iput p3, p0, Ln5/d;->f:F

    invoke-virtual {p0, p3}, Ln5/d;->p(F)V

    aget p3, p7, p1

    add-int/2addr p3, p2

    aput p3, p7, p1

    :cond_2
    :goto_1
    return-void
.end method

.method public n(Landroid/view/View;IIIII)V
    .locals 8

    iget-object v7, p0, Ln5/d;->k:[I

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v7}, Ln5/d;->m(Landroid/view/View;IIIII[I)V

    return-void
.end method

.method public o(Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    if-nez p4, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Ln5/d;->onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onDetachedFromWindow()V
    .locals 0

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    invoke-virtual {p0}, Ln5/d;->s()V

    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    invoke-virtual {p0}, Ln5/d;->g()V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    iget-boolean v1, p0, Ln5/d;->t:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    if-nez v0, :cond_0

    iput-boolean v2, p0, Ln5/d;->t:Z

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_9

    iget-boolean v1, p0, Ln5/d;->t:Z

    if-nez v1, :cond_9

    invoke-virtual {p0}, Ln5/d;->d()Z

    move-result v1

    if-nez v1, :cond_9

    iget-boolean v1, p0, Ln5/d;->c:Z

    if-nez v1, :cond_9

    iget-boolean v1, p0, Ln5/d;->l:Z

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_7

    const/4 v1, 0x1

    const/4 v3, -0x1

    if-eq v0, v1, :cond_6

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_6

    const/4 v1, 0x6

    if-eq v0, v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-direct {p0, p1}, Ln5/d;->r(Landroid/view/MotionEvent;)V

    goto :goto_0

    :cond_3
    iget v0, p0, Ln5/d;->r:I

    if-ne v0, v3, :cond_4

    sget-object p1, Ln5/d;->P:Ljava/lang/String;

    const-string v0, "Got ACTION_MOVE event but don\'t have an active pointer id."

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_4
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_5

    return v2

    :cond_5
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    invoke-virtual {p0, p1}, Ln5/d;->w(F)V

    goto :goto_0

    :cond_6
    iput-boolean v2, p0, Ln5/d;->q:Z

    iput v3, p0, Ln5/d;->r:I

    goto :goto_0

    :cond_7
    iget v0, p0, Ln5/d;->z:I

    iget-object v1, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Ln5/d;->setTargetOffsetTopAndBottom(I)V

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Ln5/d;->r:I

    iput-boolean v2, p0, Ln5/d;->q:Z

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_8

    return v2

    :cond_8
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    iput p1, p0, Ln5/d;->p:F

    :goto_0
    iget-boolean p1, p0, Ln5/d;->q:Z

    return p1

    :cond_9
    :goto_1
    return v2
.end method

.method public onLayout(ZIIII)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p3

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    iget-object p3, p0, Ln5/d;->a:Landroid/view/View;

    if-nez p3, :cond_1

    invoke-virtual {p0}, Ln5/d;->g()V

    :cond_1
    iget-object p3, p0, Ln5/d;->a:Landroid/view/View;

    if-nez p3, :cond_2

    :goto_0
    return-void

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    sub-int v0, p1, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    sub-int/2addr p2, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    sub-int/2addr p2, v1

    add-int/2addr v0, p4

    add-int/2addr p2, p5

    invoke-virtual {p3, p4, p5, v0, p2}, Landroid/view/View;->layout(IIII)V

    iget-object p2, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    iget-object p3, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    move-result p3

    iget-object p4, p0, Ln5/d;->v:Ln5/a;

    div-int/lit8 p1, p1, 0x2

    div-int/lit8 p2, p2, 0x2

    sub-int p5, p1, p2

    iget v0, p0, Ln5/d;->n:I

    add-int/2addr p1, p2

    add-int/2addr p3, v0

    invoke-virtual {p4, p5, v0, p1, p3}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 3

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    iget-object p1, p0, Ln5/d;->a:Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ln5/d;->g()V

    :cond_0
    iget-object p1, p0, Ln5/d;->a:Landroid/view/View;

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    sub-int/2addr p2, v0

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {p1, p2, v1}, Landroid/view/View;->measure(II)V

    iget-object p1, p0, Ln5/d;->v:Ln5/a;

    iget p2, p0, Ln5/d;->J:I

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    iget v1, p0, Ln5/d;->J:I

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p1, p2, v0}, Landroid/view/View;->measure(II)V

    const/4 p1, -0x1

    iput p1, p0, Ln5/d;->w:I

    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-ge p1, p2, :cond_3

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    iget-object v0, p0, Ln5/d;->v:Ln5/a;

    if-ne p2, v0, :cond_2

    iput p1, p0, Ln5/d;->w:I

    return-void

    :cond_2
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .locals 0

    invoke-virtual {p0, p2, p3, p4}, Ln5/d;->dispatchNestedFling(FFZ)Z

    move-result p1

    return p1
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .locals 0

    invoke-virtual {p0, p2, p3}, Ln5/d;->dispatchNestedPreFling(FF)Z

    move-result p1

    return p1
.end method

.method public onNestedPreScroll(Landroid/view/View;II[I)V
    .locals 4

    const/4 p1, 0x0

    const/4 v0, 0x1

    if-lez p3, :cond_1

    iget v1, p0, Ln5/d;->f:F

    cmpl-float v2, v1, p1

    if-lez v2, :cond_1

    int-to-float v2, p3

    cmpl-float v3, v2, v1

    if-lez v3, :cond_0

    float-to-int v1, v1

    aput v1, p4, v0

    iput p1, p0, Ln5/d;->f:F

    goto :goto_0

    :cond_0
    sub-float/2addr v1, v2

    iput v1, p0, Ln5/d;->f:F

    aput p3, p4, v0

    :goto_0
    iget v1, p0, Ln5/d;->f:F

    invoke-virtual {p0, v1}, Ln5/d;->p(F)V

    :cond_1
    iget-boolean v1, p0, Ln5/d;->K:Z

    if-eqz v1, :cond_2

    if-lez p3, :cond_2

    iget v1, p0, Ln5/d;->f:F

    cmpl-float p1, v1, p1

    if-nez p1, :cond_2

    aget p1, p4, v0

    sub-int p1, p3, p1

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    if-lez p1, :cond_2

    iget-object p1, p0, Ln5/d;->v:Ln5/a;

    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    iget-object p1, p0, Ln5/d;->i:[I

    const/4 v1, 0x0

    aget v2, p4, v1

    sub-int/2addr p2, v2

    aget v2, p4, v0

    sub-int/2addr p3, v2

    const/4 v2, 0x0

    invoke-virtual {p0, p2, p3, p1, v2}, Ln5/d;->dispatchNestedPreScroll(II[I[I)Z

    move-result p2

    if-eqz p2, :cond_3

    aget p2, p4, v1

    aget p3, p1, v1

    add-int/2addr p2, p3

    aput p2, p4, v1

    aget p2, p4, v0

    aget p1, p1, v0

    add-int/2addr p2, p1

    aput p2, p4, v0

    :cond_3
    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIII)V
    .locals 8

    const/4 v6, 0x0

    iget-object v7, p0, Ln5/d;->k:[I

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v7}, Ln5/d;->m(Landroid/view/View;IIIII[I)V

    return-void
.end method

.method public onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .locals 1

    iget-object v0, p0, Ln5/d;->g:Landroidx/core/view/x;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/core/view/x;->b(Landroid/view/View;Landroid/view/View;I)V

    and-int/lit8 p1, p3, 0x2

    invoke-virtual {p0, p1}, Ln5/d;->startNestedScroll(I)Z

    const/4 p1, 0x0

    iput p1, p0, Ln5/d;->f:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Ln5/d;->l:Z

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    check-cast p1, Ln5/d$k;

    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget-boolean p1, p1, Ln5/d$k;->a:Z

    invoke-virtual {p0, p1}, Ln5/d;->setRefreshing(Z)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Ln5/d$k;

    iget-boolean v2, p0, Ln5/d;->c:Z

    invoke-direct {v1, v0, v2}, Ln5/d$k;-><init>(Landroid/os/Parcelable;Z)V

    return-object v1
.end method

.method public onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .locals 0

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Ln5/d;->t:Z

    if-nez p1, :cond_0

    iget-boolean p1, p0, Ln5/d;->c:Z

    if-nez p1, :cond_0

    and-int/lit8 p1, p3, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onStopNestedScroll(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Ln5/d;->g:Landroidx/core/view/x;

    invoke-virtual {v0, p1}, Landroidx/core/view/x;->d(Landroid/view/View;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Ln5/d;->l:Z

    iget p1, p0, Ln5/d;->f:F

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    if-lez v1, :cond_0

    invoke-virtual {p0, p1}, Ln5/d;->h(F)V

    iput v0, p0, Ln5/d;->f:F

    goto :goto_0

    :cond_0
    new-instance p1, Ln5/c;

    invoke-direct {p1, p0}, Ln5/c;-><init>(Ln5/d;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :goto_0
    invoke-virtual {p0}, Ln5/d;->stopNestedScroll()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    iget-boolean v1, p0, Ln5/d;->t:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    if-nez v0, :cond_0

    iput-boolean v2, p0, Ln5/d;->t:Z

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_e

    iget-boolean v1, p0, Ln5/d;->t:Z

    if-nez v1, :cond_e

    invoke-virtual {p0}, Ln5/d;->d()Z

    move-result v1

    if-nez v1, :cond_e

    iget-boolean v1, p0, Ln5/d;->c:Z

    if-nez v1, :cond_e

    iget-boolean v1, p0, Ln5/d;->l:Z

    if-eqz v1, :cond_1

    goto/16 :goto_1

    :cond_1
    const/4 v1, 0x1

    if-eqz v0, :cond_c

    const/high16 v3, 0x3f000000    # 0.5f

    if-eq v0, v1, :cond_9

    const/4 v4, 0x2

    if-eq v0, v4, :cond_6

    const/4 v3, 0x3

    if-eq v0, v3, :cond_5

    const/4 v3, 0x5

    if-eq v0, v3, :cond_3

    const/4 v2, 0x6

    if-eq v0, v2, :cond_2

    goto/16 :goto_0

    :cond_2
    invoke-direct {p0, p1}, Ln5/d;->r(Landroid/view/MotionEvent;)V

    goto/16 :goto_0

    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    if-gez v0, :cond_4

    sget-object p1, Ln5/d;->P:Ljava/lang/String;

    const-string v0, "Got ACTION_POINTER_DOWN event but have an invalid action index."

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_4
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Ln5/d;->r:I

    goto :goto_0

    :cond_5
    return v2

    :cond_6
    iget v0, p0, Ln5/d;->r:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_7

    sget-object p1, Ln5/d;->P:Ljava/lang/String;

    const-string v0, "Got ACTION_MOVE event but have an invalid active pointer id."

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_7
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    invoke-virtual {p0, p1}, Ln5/d;->w(F)V

    iget-boolean v0, p0, Ln5/d;->q:Z

    if-eqz v0, :cond_d

    iget v0, p0, Ln5/d;->o:F

    sub-float/2addr p1, v0

    mul-float/2addr p1, v3

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_8

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    invoke-virtual {p0, p1}, Ln5/d;->p(F)V

    goto :goto_0

    :cond_8
    return v2

    :cond_9
    iget v0, p0, Ln5/d;->r:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_a

    sget-object p1, Ln5/d;->P:Ljava/lang/String;

    const-string v0, "Got ACTION_UP event but don\'t have an active pointer id."

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_a
    iget-boolean v1, p0, Ln5/d;->q:Z

    if-eqz v1, :cond_b

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    iget v0, p0, Ln5/d;->o:F

    sub-float/2addr p1, v0

    mul-float/2addr p1, v3

    iput-boolean v2, p0, Ln5/d;->q:Z

    invoke-virtual {p0, p1}, Ln5/d;->h(F)V

    :cond_b
    const/4 p1, -0x1

    iput p1, p0, Ln5/d;->r:I

    return v2

    :cond_c
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Ln5/d;->r:I

    iput-boolean v2, p0, Ln5/d;->q:Z

    :cond_d
    :goto_0
    return v1

    :cond_e
    :goto_1
    return v2
.end method

.method public final p(F)V
    .locals 11

    iget-object v0, p0, Ln5/d;->C:Ln5/b;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ln5/b;->d(Z)V

    iget v0, p0, Ln5/d;->e:F

    div-float v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    float-to-double v2, v0

    const-wide v4, 0x3fd999999999999aL    # 0.4

    sub-double/2addr v2, v4

    const-wide/16 v4, 0x0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    double-to-float v2, v2

    const/high16 v3, 0x40a00000    # 5.0f

    mul-float/2addr v2, v3

    const/high16 v3, 0x40400000    # 3.0f

    div-float/2addr v2, v3

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v4, p0, Ln5/d;->e:F

    sub-float/2addr v3, v4

    iget v4, p0, Ln5/d;->B:I

    if-lez v4, :cond_0

    :goto_0
    int-to-float v4, v4

    goto :goto_1

    :cond_0
    iget-boolean v4, p0, Ln5/d;->K:Z

    if-eqz v4, :cond_1

    iget v4, p0, Ln5/d;->A:I

    iget v5, p0, Ln5/d;->z:I

    sub-int/2addr v4, v5

    goto :goto_0

    :cond_1
    iget v4, p0, Ln5/d;->A:I

    goto :goto_0

    :goto_1
    const/high16 v5, 0x40000000    # 2.0f

    mul-float v6, v4, v5

    invoke-static {v3, v6}, Ljava/lang/Math;->min(FF)F

    move-result v3

    div-float/2addr v3, v4

    const/4 v6, 0x0

    invoke-static {v6, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    const/high16 v7, 0x40800000    # 4.0f

    div-float/2addr v3, v7

    float-to-double v7, v3

    const-wide/high16 v9, 0x4000000000000000L    # 2.0

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v9

    sub-double/2addr v7, v9

    double-to-float v3, v7

    mul-float/2addr v3, v5

    mul-float v7, v4, v3

    mul-float/2addr v7, v5

    iget v8, p0, Ln5/d;->z:I

    mul-float/2addr v4, v0

    add-float/2addr v4, v7

    float-to-int v0, v4

    add-int/2addr v8, v0

    iget-object v0, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ln5/d;->v:Ln5/a;

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    iget-boolean v0, p0, Ln5/d;->s:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleX(F)V

    iget-object v0, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleY(F)V

    :cond_3
    iget-boolean v0, p0, Ln5/d;->s:Z

    if-eqz v0, :cond_4

    iget v0, p0, Ln5/d;->e:F

    div-float v0, p1, v0

    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-virtual {p0, v0}, Ln5/d;->setAnimationProgress(F)V

    :cond_4
    iget v0, p0, Ln5/d;->e:F

    cmpg-float p1, p1, v0

    if-gez p1, :cond_5

    iget-object p1, p0, Ln5/d;->C:Ln5/b;

    invoke-virtual {p1}, Ln5/b;->getAlpha()I

    move-result p1

    const/16 v0, 0x4c

    if-le p1, v0, :cond_6

    iget-object p1, p0, Ln5/d;->F:Landroid/view/animation/Animation;

    invoke-virtual {p0, p1}, Ln5/d;->l(Landroid/view/animation/Animation;)Z

    move-result p1

    if-nez p1, :cond_6

    invoke-virtual {p0}, Ln5/d;->y()V

    goto :goto_2

    :cond_5
    iget-object p1, p0, Ln5/d;->C:Ln5/b;

    invoke-virtual {p1}, Ln5/b;->getAlpha()I

    move-result p1

    const/16 v0, 0xff

    if-ge p1, v0, :cond_6

    iget-object p1, p0, Ln5/d;->G:Landroid/view/animation/Animation;

    invoke-virtual {p0, p1}, Ln5/d;->l(Landroid/view/animation/Animation;)Z

    move-result p1

    if-nez p1, :cond_6

    invoke-virtual {p0}, Ln5/d;->x()V

    :cond_6
    :goto_2
    const p1, 0x3f4ccccd    # 0.8f

    mul-float v0, v2, p1

    iget-object v4, p0, Ln5/d;->C:Ln5/b;

    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-virtual {v4, v6, p1}, Ln5/b;->j(FF)V

    iget-object p1, p0, Ln5/d;->C:Ln5/b;

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-virtual {p1, v0}, Ln5/b;->e(F)V

    const p1, 0x3ecccccd    # 0.4f

    mul-float/2addr v2, p1

    const/high16 p1, -0x41800000    # -0.25f

    add-float/2addr v2, p1

    mul-float/2addr v3, v5

    add-float/2addr v2, v3

    const/high16 p1, 0x3f000000    # 0.5f

    mul-float/2addr v2, p1

    iget-object p1, p0, Ln5/d;->C:Ln5/b;

    invoke-virtual {p1, v2}, Ln5/b;->g(F)V

    iget p1, p0, Ln5/d;->n:I

    sub-int/2addr v8, p1

    invoke-virtual {p0, v8}, Ln5/d;->setTargetOffsetTopAndBottom(I)V

    return-void
.end method

.method public q(F)V
    .locals 2

    iget v0, p0, Ln5/d;->x:I

    iget v1, p0, Ln5/d;->z:I

    sub-int/2addr v1, v0

    int-to-float v1, v1

    mul-float/2addr v1, p1

    float-to-int p1, v1

    add-int/2addr v0, p1

    iget-object p1, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    sub-int/2addr v0, p1

    invoke-virtual {p0, v0}, Ln5/d;->setTargetOffsetTopAndBottom(I)V

    return-void
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 1

    iget-boolean v0, p0, Ln5/d;->L:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ln5/d;->a:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroidx/core/view/o0;->S(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    return-void
.end method

.method public s()V
    .locals 2

    iget-object v0, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    iget-object v0, p0, Ln5/d;->C:Ln5/b;

    invoke-virtual {v0}, Ln5/b;->stop()V

    iget-object v0, p0, Ln5/d;->v:Ln5/a;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const/16 v0, 0xff

    invoke-direct {p0, v0}, Ln5/d;->setColorViewAlpha(I)V

    iget-boolean v0, p0, Ln5/d;->s:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ln5/d;->setAnimationProgress(F)V

    goto :goto_0

    :cond_0
    iget v0, p0, Ln5/d;->z:I

    iget v1, p0, Ln5/d;->n:I

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Ln5/d;->setTargetOffsetTopAndBottom(I)V

    :goto_0
    iget-object v0, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    iput v0, p0, Ln5/d;->n:I

    return-void
.end method

.method public setAnimationProgress(F)V
    .locals 1

    iget-object v0, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleX(F)V

    iget-object v0, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleY(F)V

    return-void
.end method

.method public varargs setColorScheme([I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Ln5/d;->setColorSchemeResources([I)V

    return-void
.end method

.method public varargs setColorSchemeColors([I)V
    .locals 1

    invoke-virtual {p0}, Ln5/d;->g()V

    iget-object v0, p0, Ln5/d;->C:Ln5/b;

    invoke-virtual {v0, p1}, Ln5/b;->f([I)V

    return-void
.end method

.method public varargs setColorSchemeResources([I)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    array-length v1, p1

    new-array v1, v1, [I

    const/4 v2, 0x0

    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_0

    aget v3, p1, v2

    invoke-static {v0, v3}, Ll2/b;->c(Landroid/content/Context;I)I

    move-result v3

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Ln5/d;->setColorSchemeColors([I)V

    return-void
.end method

.method public setDistanceToTriggerSync(I)V
    .locals 0

    int-to-float p1, p1

    iput p1, p0, Ln5/d;->e:F

    return-void
.end method

.method public setEnabled(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ln5/d;->s()V

    :cond_0
    return-void
.end method

.method public setLegacyRequestDisallowInterceptTouchEventEnabled(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-boolean p1, p0, Ln5/d;->L:Z

    return-void
.end method

.method public setNestedScrollingEnabled(Z)V
    .locals 1

    iget-object v0, p0, Ln5/d;->h:Landroidx/core/view/u;

    invoke-virtual {v0, p1}, Landroidx/core/view/u;->m(Z)V

    return-void
.end method

.method public setOnChildScrollUpCallback(Ln5/d$i;)V
    .locals 0

    return-void
.end method

.method public setOnRefreshListener(Ln5/d$j;)V
    .locals 0

    iput-object p1, p0, Ln5/d;->b:Ln5/d$j;

    return-void
.end method

.method public setProgressBackgroundColor(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Ln5/d;->setProgressBackgroundColorSchemeResource(I)V

    return-void
.end method

.method public setProgressBackgroundColorSchemeColor(I)V
    .locals 1

    iget-object v0, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {v0, p1}, Ln5/a;->setBackgroundColor(I)V

    return-void
.end method

.method public setProgressBackgroundColorSchemeResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Ll2/b;->c(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Ln5/d;->setProgressBackgroundColorSchemeColor(I)V

    return-void
.end method

.method public setRefreshing(Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ln5/d;->u(ZZ)V

    return-void
.end method

.method public setSize(I)V
    .locals 2

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    if-nez p1, :cond_1

    const/high16 v1, 0x42600000    # 56.0f

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Ln5/d;->J:I

    goto :goto_0

    :cond_1
    const/high16 v1, 0x42200000    # 40.0f

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Ln5/d;->J:I

    :goto_0
    iget-object v0, p0, Ln5/d;->v:Ln5/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Ln5/d;->C:Ln5/b;

    invoke-virtual {v0, p1}, Ln5/b;->l(I)V

    iget-object p1, p0, Ln5/d;->v:Ln5/a;

    iget-object v0, p0, Ln5/d;->C:Ln5/b;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setSlingshotDistance(I)V
    .locals 0

    iput p1, p0, Ln5/d;->B:I

    return-void
.end method

.method public setTargetOffsetTopAndBottom(I)V
    .locals 1

    iget-object v0, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    iget-object v0, p0, Ln5/d;->v:Ln5/a;

    invoke-static {v0, p1}, Landroidx/core/view/o0;->X(Landroid/view/View;I)V

    iget-object p1, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    iput p1, p0, Ln5/d;->n:I

    return-void
.end method

.method public startNestedScroll(I)Z
    .locals 1

    iget-object v0, p0, Ln5/d;->h:Landroidx/core/view/u;

    invoke-virtual {v0, p1}, Landroidx/core/view/u;->o(I)Z

    move-result p1

    return p1
.end method

.method public stopNestedScroll()V
    .locals 1

    iget-object v0, p0, Ln5/d;->h:Landroidx/core/view/u;

    invoke-virtual {v0}, Landroidx/core/view/u;->q()V

    return-void
.end method

.method public final t(ZZ)V
    .locals 1

    iget-boolean v0, p0, Ln5/d;->c:Z

    if-eq v0, p1, :cond_1

    iput-boolean p2, p0, Ln5/d;->I:Z

    invoke-virtual {p0}, Ln5/d;->g()V

    iput-boolean p1, p0, Ln5/d;->c:Z

    if-eqz p1, :cond_0

    iget p1, p0, Ln5/d;->n:I

    iget-object p2, p0, Ln5/d;->M:Landroid/view/animation/Animation$AnimationListener;

    invoke-virtual {p0, p1, p2}, Ln5/d;->b(ILandroid/view/animation/Animation$AnimationListener;)V

    return-void

    :cond_0
    iget-object p1, p0, Ln5/d;->M:Landroid/view/animation/Animation$AnimationListener;

    invoke-virtual {p0, p1}, Ln5/d;->z(Landroid/view/animation/Animation$AnimationListener;)V

    :cond_1
    return-void
.end method

.method public final u(ZZ)V
    .locals 1

    if-eqz p1, :cond_1

    iget-boolean v0, p0, Ln5/d;->c:Z

    if-eq v0, p1, :cond_1

    iput-boolean p1, p0, Ln5/d;->c:Z

    iget-boolean p1, p0, Ln5/d;->K:Z

    if-nez p1, :cond_0

    iget p1, p0, Ln5/d;->A:I

    iget v0, p0, Ln5/d;->z:I

    add-int/2addr p1, v0

    goto :goto_0

    :cond_0
    iget p1, p0, Ln5/d;->A:I

    :goto_0
    iget v0, p0, Ln5/d;->n:I

    sub-int/2addr p1, v0

    invoke-virtual {p0, p1}, Ln5/d;->setTargetOffsetTopAndBottom(I)V

    iput-boolean p2, p0, Ln5/d;->I:Z

    iget-object p1, p0, Ln5/d;->M:Landroid/view/animation/Animation$AnimationListener;

    invoke-virtual {p0, p1}, Ln5/d;->B(Landroid/view/animation/Animation$AnimationListener;)V

    return-void

    :cond_1
    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Ln5/d;->t(ZZ)V

    return-void
.end method

.method public final v(II)Landroid/view/animation/Animation;
    .locals 1

    new-instance v0, Ln5/d$d;

    invoke-direct {v0, p0, p1, p2}, Ln5/d$d;-><init>(Ln5/d;II)V

    const-wide/16 p1, 0x12c

    invoke-virtual {v0, p1, p2}, Landroid/view/animation/Animation;->setDuration(J)V

    iget-object p1, p0, Ln5/d;->v:Ln5/a;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ln5/a;->b(Landroid/view/animation/Animation$AnimationListener;)V

    iget-object p1, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    iget-object p1, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-object v0
.end method

.method public final w(F)V
    .locals 3

    iget v0, p0, Ln5/d;->p:F

    sub-float/2addr p1, v0

    iget v1, p0, Ln5/d;->d:I

    int-to-float v2, v1

    cmpl-float p1, p1, v2

    if-lez p1, :cond_0

    iget-boolean p1, p0, Ln5/d;->q:Z

    if-nez p1, :cond_0

    int-to-float p1, v1

    add-float/2addr v0, p1

    iput v0, p0, Ln5/d;->o:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Ln5/d;->q:Z

    iget-object p1, p0, Ln5/d;->C:Ln5/b;

    const/16 v0, 0x4c

    invoke-virtual {p1, v0}, Ln5/b;->setAlpha(I)V

    :cond_0
    return-void
.end method

.method public final x()V
    .locals 2

    iget-object v0, p0, Ln5/d;->C:Ln5/b;

    invoke-virtual {v0}, Ln5/b;->getAlpha()I

    move-result v0

    const/16 v1, 0xff

    invoke-virtual {p0, v0, v1}, Ln5/d;->v(II)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Ln5/d;->G:Landroid/view/animation/Animation;

    return-void
.end method

.method public final y()V
    .locals 2

    iget-object v0, p0, Ln5/d;->C:Ln5/b;

    invoke-virtual {v0}, Ln5/b;->getAlpha()I

    move-result v0

    const/16 v1, 0x4c

    invoke-virtual {p0, v0, v1}, Ln5/d;->v(II)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Ln5/d;->F:Landroid/view/animation/Animation;

    return-void
.end method

.method public z(Landroid/view/animation/Animation$AnimationListener;)V
    .locals 3

    new-instance v0, Ln5/d$c;

    invoke-direct {v0, p0}, Ln5/d$c;-><init>(Ln5/d;)V

    iput-object v0, p0, Ln5/d;->E:Landroid/view/animation/Animation;

    const-wide/16 v1, 0x96

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    iget-object v0, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {v0, p1}, Ln5/a;->b(Landroid/view/animation/Animation$AnimationListener;)V

    iget-object p1, p0, Ln5/d;->v:Ln5/a;

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    iget-object p1, p0, Ln5/d;->v:Ln5/a;

    iget-object v0, p0, Ln5/d;->E:Landroid/view/animation/Animation;

    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method
