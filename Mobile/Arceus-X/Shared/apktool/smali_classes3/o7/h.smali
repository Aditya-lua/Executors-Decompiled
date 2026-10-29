.class public Lo7/h;
.super Lo7/b;
.source "SourceFile"


# instance fields
.field public final E:Landroid/graphics/RectF;

.field public final F:Landroid/graphics/Paint;

.field public final G:[F

.field public final H:Landroid/graphics/Path;

.field public final I:Lo7/e;

.field public J:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "Landroid/graphics/ColorFilter;",
            "Landroid/graphics/ColorFilter;",
            ">;"
        }
    .end annotation
.end field

.field public K:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf7/h0;Lo7/e;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lo7/b;-><init>(Lf7/h0;Lo7/e;)V

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lo7/h;->E:Landroid/graphics/RectF;

    new-instance p1, Lg7/a;

    invoke-direct {p1}, Lg7/a;-><init>()V

    iput-object p1, p0, Lo7/h;->F:Landroid/graphics/Paint;

    const/16 v0, 0x8

    new-array v0, v0, [F

    iput-object v0, p0, Lo7/h;->G:[F

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo7/h;->H:Landroid/graphics/Path;

    iput-object p2, p0, Lo7/h;->I:Lo7/e;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {p2}, Lo7/e;->p()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;Lt7/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lt7/c<",
            "TT;>;)V"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lo7/b;->c(Ljava/lang/Object;Lt7/c;)V

    sget-object v0, Lf7/o0;->K:Landroid/graphics/ColorFilter;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_1

    if-nez p2, :cond_0

    iput-object v1, p0, Lo7/h;->J:Li7/a;

    return-void

    :cond_0
    new-instance p1, Li7/q;

    invoke-direct {p1, p2}, Li7/q;-><init>(Lt7/c;)V

    iput-object p1, p0, Lo7/h;->J:Li7/a;

    return-void

    :cond_1
    sget-object v0, Lf7/o0;->a:Ljava/lang/Integer;

    if-ne p1, v0, :cond_3

    if-nez p2, :cond_2

    iput-object v1, p0, Lo7/h;->K:Li7/a;

    iget-object p1, p0, Lo7/h;->F:Landroid/graphics/Paint;

    iget-object p2, p0, Lo7/h;->I:Lo7/e;

    invoke-virtual {p2}, Lo7/e;->p()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    return-void

    :cond_2
    new-instance p1, Li7/q;

    invoke-direct {p1, p2}, Li7/q;-><init>(Lt7/c;)V

    iput-object p1, p0, Lo7/h;->K:Li7/a;

    :cond_3
    return-void
.end method

.method public e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 2

    invoke-super {p0, p1, p2, p3}, Lo7/b;->e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object p2, p0, Lo7/h;->E:Landroid/graphics/RectF;

    iget-object p3, p0, Lo7/h;->I:Lo7/e;

    invoke-virtual {p3}, Lo7/e;->r()I

    move-result p3

    int-to-float p3, p3

    iget-object v0, p0, Lo7/h;->I:Lo7/e;

    invoke-virtual {v0}, Lo7/e;->q()I

    move-result v0

    int-to-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {p2, v1, v1, p3, v0}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object p2, p0, Lo7/b;->o:Landroid/graphics/Matrix;

    iget-object p3, p0, Lo7/h;->E:Landroid/graphics/RectF;

    invoke-virtual {p2, p3}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget-object p2, p0, Lo7/h;->E:Landroid/graphics/RectF;

    invoke-virtual {p1, p2}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    return-void
.end method

.method public u(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILs7/b;)V
    .locals 8

    iget-object v0, p0, Lo7/h;->I:Lo7/e;

    invoke-virtual {v0}, Lo7/e;->p()I

    move-result v0

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    iget-object v1, p0, Lo7/h;->K:Li7/a;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    :goto_0
    if-eqz v1, :cond_2

    iget-object v2, p0, Lo7/h;->F:Landroid/graphics/Paint;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lo7/h;->F:Landroid/graphics/Paint;

    iget-object v2, p0, Lo7/h;->I:Lo7/e;

    invoke-virtual {v2}, Lo7/e;->p()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    :goto_1
    iget-object v1, p0, Lo7/b;->x:Li7/p;

    invoke-virtual {v1}, Li7/p;->h()Li7/a;

    move-result-object v1

    if-nez v1, :cond_3

    const/16 v1, 0x64

    goto :goto_2

    :cond_3
    iget-object v1, p0, Lo7/b;->x:Li7/p;

    invoke-virtual {v1}, Li7/p;->h()Li7/a;

    move-result-object v1

    invoke-virtual {v1}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_2
    int-to-float p3, p3

    const/high16 v2, 0x437f0000    # 255.0f

    div-float/2addr p3, v2

    int-to-float v0, v0

    div-float/2addr v0, v2

    int-to-float v1, v1

    mul-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    mul-float/2addr p3, v0

    mul-float/2addr p3, v2

    float-to-int p3, p3

    iget-object v0, p0, Lo7/h;->F:Landroid/graphics/Paint;

    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setAlpha(I)V

    if-eqz p4, :cond_4

    iget-object v0, p0, Lo7/h;->F:Landroid/graphics/Paint;

    invoke-virtual {p4, v0}, Ls7/b;->a(Landroid/graphics/Paint;)V

    goto :goto_3

    :cond_4
    iget-object p4, p0, Lo7/h;->F:Landroid/graphics/Paint;

    invoke-virtual {p4}, Landroid/graphics/Paint;->clearShadowLayer()V

    :goto_3
    iget-object p4, p0, Lo7/h;->J:Li7/a;

    if-eqz p4, :cond_5

    iget-object v0, p0, Lo7/h;->F:Landroid/graphics/Paint;

    invoke-virtual {p4}, Li7/a;->h()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/graphics/ColorFilter;

    invoke-virtual {v0, p4}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    :cond_5
    if-lez p3, :cond_6

    iget-object p3, p0, Lo7/h;->G:[F

    const/4 p4, 0x0

    const/4 v0, 0x0

    aput v0, p3, p4

    const/4 v1, 0x1

    aput v0, p3, v1

    iget-object v2, p0, Lo7/h;->I:Lo7/e;

    invoke-virtual {v2}, Lo7/e;->r()I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x2

    aput v2, p3, v3

    iget-object p3, p0, Lo7/h;->G:[F

    const/4 v2, 0x3

    aput v0, p3, v2

    iget-object v4, p0, Lo7/h;->I:Lo7/e;

    invoke-virtual {v4}, Lo7/e;->r()I

    move-result v4

    int-to-float v4, v4

    const/4 v5, 0x4

    aput v4, p3, v5

    iget-object p3, p0, Lo7/h;->G:[F

    iget-object v4, p0, Lo7/h;->I:Lo7/e;

    invoke-virtual {v4}, Lo7/e;->q()I

    move-result v4

    int-to-float v4, v4

    const/4 v6, 0x5

    aput v4, p3, v6

    iget-object p3, p0, Lo7/h;->G:[F

    const/4 v4, 0x6

    aput v0, p3, v4

    iget-object v0, p0, Lo7/h;->I:Lo7/e;

    invoke-virtual {v0}, Lo7/e;->q()I

    move-result v0

    int-to-float v0, v0

    const/4 v7, 0x7

    aput v0, p3, v7

    iget-object p3, p0, Lo7/h;->G:[F

    invoke-virtual {p2, p3}, Landroid/graphics/Matrix;->mapPoints([F)V

    iget-object p2, p0, Lo7/h;->H:Landroid/graphics/Path;

    invoke-virtual {p2}, Landroid/graphics/Path;->reset()V

    iget-object p2, p0, Lo7/h;->H:Landroid/graphics/Path;

    iget-object p3, p0, Lo7/h;->G:[F

    aget v0, p3, p4

    aget p3, p3, v1

    invoke-virtual {p2, v0, p3}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object p2, p0, Lo7/h;->H:Landroid/graphics/Path;

    iget-object p3, p0, Lo7/h;->G:[F

    aget v0, p3, v3

    aget p3, p3, v2

    invoke-virtual {p2, v0, p3}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object p2, p0, Lo7/h;->H:Landroid/graphics/Path;

    iget-object p3, p0, Lo7/h;->G:[F

    aget v0, p3, v5

    aget p3, p3, v6

    invoke-virtual {p2, v0, p3}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object p2, p0, Lo7/h;->H:Landroid/graphics/Path;

    iget-object p3, p0, Lo7/h;->G:[F

    aget v0, p3, v4

    aget p3, p3, v7

    invoke-virtual {p2, v0, p3}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object p2, p0, Lo7/h;->H:Landroid/graphics/Path;

    iget-object p3, p0, Lo7/h;->G:[F

    aget p4, p3, p4

    aget p3, p3, v1

    invoke-virtual {p2, p4, p3}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object p2, p0, Lo7/h;->H:Landroid/graphics/Path;

    invoke-virtual {p2}, Landroid/graphics/Path;->close()V

    iget-object p2, p0, Lo7/h;->H:Landroid/graphics/Path;

    iget-object p3, p0, Lo7/h;->F:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_6
    :goto_4
    return-void
.end method
