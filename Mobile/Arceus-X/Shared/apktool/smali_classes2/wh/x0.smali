.class public Lwh/x0;
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

    iput-object p1, p0, Lwh/x0;->a:Landroid/content/Context;

    return-void
.end method

.method public static bridge synthetic a(Lwh/x0;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lwh/x0;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static bridge synthetic b(Lwh/x0;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lwh/x0;->b:Landroid/graphics/Rect;

    return-void
.end method

.method public static bridge synthetic c(Lwh/x0;Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lwh/x0;->c:Landroid/graphics/Rect;

    return-void
.end method

.method public static bridge synthetic d(Lwh/x0;Landroid/graphics/RectF;F)Landroid/graphics/Rect;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lwh/x0;->g(Landroid/graphics/RectF;F)Landroid/graphics/Rect;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic e(Lwh/x0;)V
    .locals 0

    invoke-virtual {p0}, Lwh/x0;->h()V

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

    invoke-virtual {p0, v1, p2}, Lwh/x0;->f(FF)I

    move-result v1

    iget v2, p1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p0, v2, p2}, Lwh/x0;->f(FF)I

    move-result v2

    iget v3, p1, Landroid/graphics/RectF;->right:F

    invoke-virtual {p0, v3, p2}, Lwh/x0;->f(FF)I

    move-result v3

    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0, p1, p2}, Lwh/x0;->f(FF)I

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method public final h()V
    .locals 8

    iget-object v0, p0, Lwh/x0;->a:Landroid/content/Context;

    invoke-static {v0}, Lel/a;->e(Landroid/content/Context;)F

    move-result v0

    iget-object v1, p0, Lwh/x0;->c:Landroid/graphics/Rect;

    const/4 v2, 0x0

    if-eqz v1, :cond_9

    iget-object v1, p0, Lwh/x0;->a:Landroid/content/Context;

    instance-of v3, v1, Landroid/app/Activity;

    if-eqz v3, :cond_9

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Landroidx/core/view/o0;->F(Landroid/view/View;)Landroidx/core/view/WindowInsetsCompat;

    move-result-object v3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v4

    invoke-interface {v4}, Lth/i;->R5()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1e

    if-ge v4, v6, :cond_1

    :cond_0
    invoke-static {}, Lsg/a1;->l0()Z

    move-result v4

    if-eqz v4, :cond_4

    if-eqz v3, :cond_4

    :cond_1
    if-eqz v3, :cond_2

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->statusBars()I

    move-result v1

    invoke-virtual {v3, v1}, Landroidx/core/view/WindowInsetsCompat;->isVisible(I)Z

    move-result v1

    if-nez v1, :cond_2

    move v1, v5

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    if-eqz v3, :cond_3

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->navigationBars()I

    move-result v4

    invoke-virtual {v3, v4}, Landroidx/core/view/WindowInsetsCompat;->isVisible(I)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    move v5, v2

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v1

    and-int/lit8 v3, v1, 0x4

    if-eqz v3, :cond_5

    move v3, v5

    goto :goto_1

    :cond_5
    move v3, v2

    :goto_1
    and-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_6

    goto :goto_2

    :cond_6
    move v5, v2

    :goto_2
    move v1, v3

    :goto_3
    if-nez v1, :cond_7

    iget-object v1, p0, Lwh/x0;->c:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    int-to-float v1, v1

    invoke-virtual {p0, v1, v0}, Lwh/x0;->f(FF)I

    move-result v1

    goto :goto_4

    :cond_7
    move v1, v2

    :goto_4
    if-nez v5, :cond_8

    iget-object v2, p0, Lwh/x0;->c:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    int-to-float v2, v2

    invoke-virtual {p0, v2, v0}, Lwh/x0;->f(FF)I

    move-result v2

    :cond_8
    move v7, v2

    move v2, v1

    move v1, v7

    goto :goto_5

    :cond_9
    move v1, v2

    :goto_5
    iget-object v3, p0, Lwh/x0;->b:Landroid/graphics/Rect;

    if-nez v3, :cond_a

    invoke-static {}, Lqm/a;->b()Lqm/a;

    move-result-object v0

    int-to-float v2, v2

    int-to-float v1, v1

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2, v3, v1}, Lqm/a;->a(FFFF)V

    return-void

    :cond_a
    new-instance v3, Landroid/graphics/RectF;

    iget-object v4, p0, Lwh/x0;->b:Landroid/graphics/Rect;

    invoke-direct {v3, v4}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {p0, v3, v0}, Lwh/x0;->g(Landroid/graphics/RectF;F)Landroid/graphics/Rect;

    move-result-object v0

    iget v3, v0, Landroid/graphics/Rect;->top:I

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    int-to-float v2, v2

    iget v3, v0, Landroid/graphics/Rect;->bottom:I

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    int-to-float v1, v1

    invoke-static {}, Lqm/a;->b()Lqm/a;

    move-result-object v3

    iget v4, v0, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    iget v0, v0, Landroid/graphics/Rect;->right:I

    int-to-float v0, v0

    invoke-virtual {v3, v4, v2, v0, v1}, Lqm/a;->a(FFFF)V

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

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->C0()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lwh/x0$a;

    invoke-direct {v0, p0}, Lwh/x0$a;-><init>(Lwh/x0;)V

    invoke-virtual {p2, p1, v0}, Landroidx/lifecycle/a0;->i(Landroidx/lifecycle/s;Landroidx/lifecycle/e0;)V

    instance-of p2, p1, Lcom/roblox/client/b;

    if-eqz p2, :cond_1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->Y0()Z

    move-result p2

    if-eqz p2, :cond_0

    move-object p2, p1

    check-cast p2, Lcom/roblox/client/b;

    invoke-virtual {p2}, Lcom/roblox/client/b;->G1()Lmi/a;

    move-result-object p2

    invoke-virtual {p2}, Lmi/a;->d()Landroidx/lifecycle/a0;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, p1

    check-cast p2, Lcom/roblox/client/b;

    invoke-virtual {p2}, Lcom/roblox/client/b;->G1()Lmi/a;

    move-result-object p2

    invoke-virtual {p2}, Lmi/a;->b()Landroidx/lifecycle/d0;

    move-result-object p2

    :goto_0
    new-instance v0, Lwh/x0$b;

    invoke-direct {v0, p0}, Lwh/x0$b;-><init>(Lwh/x0;)V

    invoke-virtual {p2, p1, v0}, Landroidx/lifecycle/a0;->i(Landroidx/lifecycle/s;Landroidx/lifecycle/e0;)V

    :cond_1
    return-void

    :cond_2
    new-instance v0, Lwh/x0$c;

    invoke-direct {v0, p0}, Lwh/x0$c;-><init>(Lwh/x0;)V

    invoke-virtual {p2, p1, v0}, Landroidx/lifecycle/a0;->i(Landroidx/lifecycle/s;Landroidx/lifecycle/e0;)V

    return-void
.end method
