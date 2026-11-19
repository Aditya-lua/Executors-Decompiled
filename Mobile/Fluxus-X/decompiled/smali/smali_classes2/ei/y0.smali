.class public Lei/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Landroid/graphics/Rect;

.field public c:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lei/y0;->a:Landroid/content/Context;

    return-void
.end method

.method public static bridge synthetic a(Lei/y0;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lei/y0;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static bridge synthetic b(Lei/y0;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lei/y0;->b:Landroid/graphics/Rect;

    return-void
.end method

.method public static bridge synthetic c(Lei/y0;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lei/y0;->c:Landroid/graphics/Rect;

    return-void
.end method

.method public static bridge synthetic d(Lei/y0;Landroid/graphics/RectF;F)Landroid/graphics/Rect;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lei/y0;->g(Landroid/graphics/RectF;F)Landroid/graphics/Rect;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic e(Lei/y0;)V
    .locals 0

    invoke-virtual {p0}, Lei/y0;->h()V

    return-void
.end method


# virtual methods
.method public final f(FF)I
    .locals 2

    div-float/2addr p1, p2

    float-to-double p1, p1

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    add-double/2addr p1, v0

    double-to-int p1, p1

    return p1
.end method

.method public final g(Landroid/graphics/RectF;F)Landroid/graphics/Rect;
    .locals 4

    new-instance v0, Landroid/graphics/Rect;

    iget v1, p1, Landroid/graphics/RectF;->left:F

    invoke-virtual {p0, v1, p2}, Lei/y0;->f(FF)I

    move-result v1

    iget v2, p1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p0, v2, p2}, Lei/y0;->f(FF)I

    move-result v2

    iget v3, p1, Landroid/graphics/RectF;->right:F

    invoke-virtual {p0, v3, p2}, Lei/y0;->f(FF)I

    move-result v3

    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0, p1, p2}, Lei/y0;->f(FF)I

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method public final h()V
    .locals 10

    iget-object v0, p0, Lei/y0;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/roblox/platform/util/DeviceUtils;->getScreenDensity(Landroid/content/Context;)F

    move-result v0

    iget-object v1, p0, Lei/y0;->c:Landroid/graphics/Rect;

    const/4 v2, 0x0

    if-eqz v1, :cond_b

    iget-object v1, p0, Lei/y0;->a:Landroid/content/Context;

    instance-of v3, v1, Landroid/app/Activity;

    if-eqz v3, :cond_b

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Landroidx/core/view/o0;->F(Landroid/view/View;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v3

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v4

    invoke-interface {v4}, Lbi/i;->T5()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1e

    if-ge v4, v6, :cond_1

    :cond_0
    invoke-static {}, Lbh/a1;->l0()Z

    move-result v4

    if-eqz v4, :cond_2

    if-eqz v3, :cond_2

    :cond_1
    move v4, v5

    goto :goto_0

    :cond_2
    move v4, v2

    :goto_0
    if-eqz v4, :cond_5

    if-eqz v3, :cond_3

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->statusBars()I

    move-result v1

    invoke-virtual {v3, v1}, Landroidx/core/view/WindowInsetsCompat;->isVisible(I)Z

    move-result v1

    if-nez v1, :cond_3

    move v1, v5

    goto :goto_1

    :cond_3
    move v1, v2

    :goto_1
    if-eqz v3, :cond_4

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->navigationBars()I

    move-result v6

    invoke-virtual {v3, v6}, Landroidx/core/view/WindowInsetsCompat;->isVisible(I)Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_4

    :cond_4
    move v5, v2

    goto :goto_4

    :cond_5
    invoke-virtual {v1}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v1

    and-int/lit8 v6, v1, 0x4

    if-eqz v6, :cond_6

    move v6, v5

    goto :goto_2

    :cond_6
    move v6, v2

    :goto_2
    and-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_7

    goto :goto_3

    :cond_7
    move v5, v2

    :goto_3
    move v1, v6

    :goto_4
    iget-object v6, p0, Lei/y0;->c:Landroid/graphics/Rect;

    iget v7, v6, Landroid/graphics/Rect;->top:I

    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v8

    invoke-interface {v8}, Lbi/i;->T5()Z

    move-result v8

    if-eqz v8, :cond_8

    if-eqz v4, :cond_8

    if-eqz v3, :cond_8

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->systemBars()I

    move-result v4

    invoke-virtual {v3, v4}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object v3

    iget v7, v3, Landroidx/core/graphics/Insets;->top:I

    iget v6, v3, Landroidx/core/graphics/Insets;->bottom:I

    :cond_8
    if-nez v1, :cond_9

    int-to-float v1, v7

    invoke-virtual {p0, v1, v0}, Lei/y0;->f(FF)I

    move-result v1

    goto :goto_5

    :cond_9
    move v1, v2

    :goto_5
    if-nez v5, :cond_a

    int-to-float v2, v6

    invoke-virtual {p0, v2, v0}, Lei/y0;->f(FF)I

    move-result v2

    :cond_a
    move v9, v2

    move v2, v1

    move v1, v9

    goto :goto_6

    :cond_b
    move v1, v2

    :goto_6
    iget-object v3, p0, Lei/y0;->b:Landroid/graphics/Rect;

    if-nez v3, :cond_c

    invoke-static {}, Ldn/a;->b()Ldn/a;

    move-result-object v0

    int-to-float v2, v2

    int-to-float v1, v1

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2, v3, v1}, Ldn/a;->a(FFFF)V

    return-void

    :cond_c
    new-instance v3, Landroid/graphics/RectF;

    iget-object v4, p0, Lei/y0;->b:Landroid/graphics/Rect;

    invoke-direct {v3, v4}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {p0, v3, v0}, Lei/y0;->g(Landroid/graphics/RectF;F)Landroid/graphics/Rect;

    move-result-object v0

    iget v3, v0, Landroid/graphics/Rect;->top:I

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    int-to-float v2, v2

    iget v3, v0, Landroid/graphics/Rect;->bottom:I

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    int-to-float v1, v1

    invoke-static {}, Ldn/a;->b()Ldn/a;

    move-result-object v3

    iget v4, v0, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    iget v0, v0, Landroid/graphics/Rect;->right:I

    int-to-float v0, v0

    invoke-virtual {v3, v4, v2, v0, v1}, Ldn/a;->a(FFFF)V

    return-void
.end method

.method public i(Landroidx/lifecycle/s;Landroidx/lifecycle/a0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/s;",
            "Landroidx/lifecycle/a0<",
            "Landroid/graphics/Rect;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->G0()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lei/y0$a;

    invoke-direct {v0, p0}, Lei/y0$a;-><init>(Lei/y0;)V

    invoke-virtual {p2, p1, v0}, Landroidx/lifecycle/a0;->i(Landroidx/lifecycle/s;Landroidx/lifecycle/e0;)V

    instance-of p2, p1, Lcom/roblox/client/b;

    if-eqz p2, :cond_1

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p2

    invoke-interface {p2}, Lbi/i;->d1()Z

    move-result p2

    if-eqz p2, :cond_0

    move-object p2, p1

    check-cast p2, Lcom/roblox/client/b;

    invoke-virtual {p2}, Lcom/roblox/client/b;->G1()Lui/a;

    move-result-object p2

    invoke-virtual {p2}, Lui/a;->e()Landroidx/lifecycle/a0;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, p1

    check-cast p2, Lcom/roblox/client/b;

    invoke-virtual {p2}, Lcom/roblox/client/b;->G1()Lui/a;

    move-result-object p2

    invoke-virtual {p2}, Lui/a;->c()Landroidx/lifecycle/d0;

    move-result-object p2

    :goto_0
    new-instance v0, Lei/y0$b;

    invoke-direct {v0, p0}, Lei/y0$b;-><init>(Lei/y0;)V

    invoke-virtual {p2, p1, v0}, Landroidx/lifecycle/a0;->i(Landroidx/lifecycle/s;Landroidx/lifecycle/e0;)V

    :cond_1
    return-void

    :cond_2
    new-instance v0, Lei/y0$c;

    invoke-direct {v0, p0}, Lei/y0$c;-><init>(Lei/y0;)V

    invoke-virtual {p2, p1, v0}, Landroidx/lifecycle/a0;->i(Landroidx/lifecycle/s;Landroidx/lifecycle/e0;)V

    return-void
.end method
