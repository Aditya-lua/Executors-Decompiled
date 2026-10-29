.class public final Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0010\u0018\u00002\u00020\u0001B\u001d\u0008\u0016\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00082\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0007J/\u0010\u001c\u001a\u00020\u00082\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0016\u0010$\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0016\u0010\u0014\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008)\u0010#R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00085\u00106\u001a\u0004\u00087\u00108\"\u0004\u00089\u0010:R.\u0010C\u001a\u0004\u0018\u00010\u00012\u0008\u0010<\u001a\u0004\u0018\u00010\u00018\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008=\u0010>\u001a\u0004\u0008?\u0010@\"\u0004\u0008A\u0010B\u00a8\u0006D"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;",
        "Landroid/view/View;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "onFinishInflate",
        "()V",
        "",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onMeasure",
        "(II)V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "draw",
        "(Landroid/graphics/Canvas;)V",
        "borderColor",
        "setBorderColor",
        "(I)V",
        "e",
        "left",
        "top",
        "right",
        "bottom",
        "g",
        "(IIII)V",
        "Landroid/animation/ValueAnimator;",
        "a",
        "Landroid/animation/ValueAnimator;",
        "intensityAnimator",
        "b",
        "I",
        "targetViewId",
        "Landroid/graphics/Path;",
        "c",
        "Landroid/graphics/Path;",
        "clipPath",
        "d",
        "Landroid/graphics/Rect;",
        "Landroid/graphics/Rect;",
        "rect",
        "Landroid/graphics/Paint;",
        "f",
        "Landroid/graphics/Paint;",
        "borderPaint",
        "Landroid/view/View$OnLayoutChangeListener;",
        "Landroid/view/View$OnLayoutChangeListener;",
        "targetLayoutChangeListener",
        "",
        "h",
        "F",
        "getRadius",
        "()F",
        "setRadius",
        "(F)V",
        "radius",
        "value",
        "i",
        "Landroid/view/View;",
        "getTargetView",
        "()Landroid/view/View;",
        "setTargetView",
        "(Landroid/view/View;)V",
        "targetView",
        "shared_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public a:Landroid/animation/ValueAnimator;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public b:I

.field public c:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public d:I

.field public e:Landroid/graphics/Rect;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final f:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Landroid/view/View$OnLayoutChangeListener;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public h:F

.field public i:Landroid/view/View;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    const-wide/high16 v1, 0x401c000000000000L    # 7.0

    invoke-static {v1, v2}, Ljq/j;->a(D)D

    move-result-wide v1

    double-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->f:Landroid/graphics/Paint;

    new-instance v0, Lwq/r;

    invoke-direct {v0, p0}, Lwq/r;-><init>(Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->g:Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->e(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static synthetic a(Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;Landroid/view/View;IIIIIIII)V
    .locals 0

    invoke-static/range {p0 .. p9}, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->i(Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;Landroid/view/View;IIIIIIII)V

    return-void
.end method

.method public static synthetic b(Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->f(Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;IILandroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->h(Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;IILandroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static final synthetic d(Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;Landroid/animation/ValueAnimator;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->a:Landroid/animation/ValueAnimator;

    return-void
.end method

.method public static final f(Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/View;

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->b:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->setTargetView(Landroid/view/View;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final h(Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;IILandroid/animation/ValueAnimator;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p3

    invoke-static {p1, p2, p3}, Landroidx/core/graphics/c;->c(IIF)I

    move-result p1

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->d:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public static final i(Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;Landroid/view/View;IIIIIIII)V
    .locals 0

    invoke-virtual {p0, p2, p3, p4, p5}, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->g(IIII)V

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 11
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->c:Landroid/graphics/Path;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipOutPath(Landroid/graphics/Path;)Z

    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    iget v0, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->d:I

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->f:Landroid/graphics/Paint;

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->e:Landroid/graphics/Rect;

    if-eqz v0, :cond_0

    iget v2, v0, Landroid/graphics/Rect;->left:I

    int-to-float v4, v2

    iget v2, v0, Landroid/graphics/Rect;->top:I

    int-to-float v5, v2

    iget v2, v0, Landroid/graphics/Rect;->right:I

    int-to-float v6, v2

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    int-to-float v7, v0

    iget v8, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->h:F

    iget-object v10, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->f:Landroid/graphics/Paint;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move v9, v8

    move-object v3, p1

    :try_start_1
    invoke-virtual/range {v3 .. v10}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    :goto_0
    move-object p1, v0

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v3, p1

    goto :goto_0

    :cond_0
    move-object v3, p1

    :goto_1
    invoke-virtual {v3, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void

    :goto_2
    invoke-virtual {v3, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    throw p1

    :cond_1
    move-object v3, p1

    invoke-super {p0, v3}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public final e(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, Ljq/w;->j:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    if-eqz p1, :cond_0

    :try_start_0
    sget p2, Ljq/w;->l:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->b:I

    sget p2, Ljq/w;->k:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->h:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2

    :cond_0
    return-void
.end method

.method public final g(IIII)V
    .locals 9

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->e:Landroid/graphics/Rect;

    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    int-to-float v2, p1

    int-to-float v3, p2

    int-to-float v4, p3

    int-to-float v5, p4

    iget v6, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->h:F

    sget-object v8, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    move v7, v6

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Path;->addRoundRect(FFFFFFLandroid/graphics/Path$Direction;)V

    iput-object v1, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->c:Landroid/graphics/Path;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final getRadius()F
    .locals 1

    iget v0, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->h:F

    return v0
.end method

.method public final getTargetView()Landroid/view/View;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->i:Landroid/view/View;

    return-object v0
.end method

.method public onFinishInflate()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    new-instance v0, Lwq/q;

    invoke-direct {v0, p0}, Lwq/q;-><init>(Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;)V

    invoke-static {p0, v0}, Lwq/z;->b(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 2

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->i:Landroid/view/View;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    invoke-virtual {p0, p2, v0, v1, p1}, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->g(IIII)V

    :cond_0
    return-void
.end method

.method public final setBorderColor(I)V
    .locals 4

    iget v0, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->d:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->a:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    :cond_1
    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    new-instance v2, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v2}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const-wide/16 v2, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v2, Lwq/p;

    invoke-direct {v2, p0, v0, p1}, Lwq/p;-><init>(Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;II)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance p1, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView$a;

    invoke-direct {p1, p0}, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView$a;-><init>(Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;)V

    invoke-virtual {v1, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    iput-object v1, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->a:Landroid/animation/ValueAnimator;

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final setRadius(F)V
    .locals 0

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->h:F

    return-void
.end method

.method public final setTargetView(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->i:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->g:Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_0
    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->i:Landroid/view/View;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->g:Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {p1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/shared/ui/SpotlightView;->g(IIII)V

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method
