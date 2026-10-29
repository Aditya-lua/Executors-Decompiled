.class public Lcom/roblox/client/qrscanner/CustomViewfinderView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public final a:F

.field public final b:F

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public g:I

.field public h:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 p2, 0x41800000    # 16.0f

    iput p2, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->a:F

    iput p2, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->b:F

    const/16 v0, 0x190

    iput v0, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->c:I

    const/16 v0, 0x50

    iput v0, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->d:I

    invoke-virtual {p0, p2, p1}, Lcom/roblox/client/qrscanner/CustomViewfinderView;->a(FLandroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->e:I

    invoke-virtual {p0, p2, p1}, Lcom/roblox/client/qrscanner/CustomViewfinderView;->a(FLandroid/content/Context;)I

    move-result p1

    iput p1, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->f:I

    return-void
.end method


# virtual methods
.method public final a(FLandroid/content/Context;)I
    .locals 0

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->densityDpi:I

    div-int/lit16 p2, p2, 0xa0

    int-to-float p2, p2

    mul-float/2addr p1, p2

    float-to-int p1, p1

    return p1
.end method

.method public final b(Landroid/graphics/Canvas;Landroid/content/Context;)V
    .locals 8

    invoke-virtual {p0, p2}, Lcom/roblox/client/qrscanner/CustomViewfinderView;->e(Landroid/content/Context;)Landroid/graphics/Rect;

    move-result-object p2

    iget v0, p2, Landroid/graphics/Rect;->left:I

    iget v1, p2, Landroid/graphics/Rect;->top:I

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result p2

    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    const/high16 v2, 0x7f000000

    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget v2, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->g:I

    int-to-float v5, v2

    int-to-float v4, v1

    const/4 v3, 0x0

    move v6, v4

    const/4 v4, 0x0

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move v4, v6

    int-to-float v5, v0

    add-int/2addr v1, p2

    int-to-float v6, v1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    add-int/2addr v0, p2

    int-to-float v3, v0

    iget p1, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->g:I

    int-to-float v5, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget p1, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->g:I

    int-to-float v5, p1

    iget p1, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->h:I

    int-to-float p1, p1

    const/4 v3, 0x0

    move v4, v6

    move v6, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final c(Landroid/graphics/Canvas;Landroid/content/Context;ILandroid/graphics/Rect;)V
    .locals 0

    invoke-static {p2, p3}, Ll2/b;->f(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p2, p4}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public final d(Landroid/graphics/Canvas;Landroid/content/Context;)V
    .locals 7

    invoke-virtual {p0, p2}, Lcom/roblox/client/qrscanner/CustomViewfinderView;->e(Landroid/content/Context;)Landroid/graphics/Rect;

    move-result-object v0

    iget v1, v0, Landroid/graphics/Rect;->left:I

    iget v2, v0, Landroid/graphics/Rect;->top:I

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iget v4, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->e:I

    add-int/2addr v4, v1

    iget v5, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->f:I

    add-int/2addr v5, v2

    invoke-virtual {v3, v1, v2, v4, v5}, Landroid/graphics/Rect;->set(IIII)V

    sget v4, Lsg/l0;->e:I

    invoke-virtual {p0, p1, p2, v4, v3}, Lcom/roblox/client/qrscanner/CustomViewfinderView;->c(Landroid/graphics/Canvas;Landroid/content/Context;ILandroid/graphics/Rect;)V

    add-int v4, v1, v0

    iget v5, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->e:I

    sub-int v5, v4, v5

    iget v6, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->f:I

    add-int/2addr v6, v2

    invoke-virtual {v3, v5, v2, v4, v6}, Landroid/graphics/Rect;->set(IIII)V

    sget v5, Lsg/l0;->g:I

    invoke-virtual {p0, p1, p2, v5, v3}, Lcom/roblox/client/qrscanner/CustomViewfinderView;->c(Landroid/graphics/Canvas;Landroid/content/Context;ILandroid/graphics/Rect;)V

    add-int/2addr v2, v0

    iget v0, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->f:I

    sub-int v0, v2, v0

    iget v5, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->e:I

    add-int/2addr v5, v1

    invoke-virtual {v3, v1, v0, v5, v2}, Landroid/graphics/Rect;->set(IIII)V

    sget v0, Lsg/l0;->d:I

    invoke-virtual {p0, p1, p2, v0, v3}, Lcom/roblox/client/qrscanner/CustomViewfinderView;->c(Landroid/graphics/Canvas;Landroid/content/Context;ILandroid/graphics/Rect;)V

    iget v0, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->e:I

    sub-int v0, v4, v0

    iget v1, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->f:I

    sub-int v1, v2, v1

    invoke-virtual {v3, v0, v1, v4, v2}, Landroid/graphics/Rect;->set(IIII)V

    sget v0, Lsg/l0;->f:I

    invoke-virtual {p0, p1, p2, v0, v3}, Lcom/roblox/client/qrscanner/CustomViewfinderView;->c(Landroid/graphics/Canvas;Landroid/content/Context;ILandroid/graphics/Rect;)V

    return-void
.end method

.method public final e(Landroid/content/Context;)Landroid/graphics/Rect;
    .locals 4

    const/high16 v0, 0x42a00000    # 80.0f

    invoke-virtual {p0, v0, p1}, Lcom/roblox/client/qrscanner/CustomViewfinderView;->a(FLandroid/content/Context;)I

    move-result v0

    const/high16 v1, 0x43c80000    # 400.0f

    invoke-virtual {p0, v1, p1}, Lcom/roblox/client/qrscanner/CustomViewfinderView;->a(FLandroid/content/Context;)I

    move-result p1

    iget v1, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->g:I

    mul-int/lit8 v2, v0, 0x2

    sub-int v2, v1, v2

    if-le v2, p1, :cond_0

    sub-int/2addr v1, p1

    div-int/lit8 v0, v1, 0x2

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    iget v1, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->h:I

    sub-int/2addr v1, p1

    div-int/lit8 v1, v1, 0x2

    new-instance v2, Landroid/graphics/Rect;

    add-int v3, v0, p1

    add-int/2addr p1, v1

    invoke-direct {v2, v0, v1, v3, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v2
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    iput v1, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->g:I

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    iput v1, p0, Lcom/roblox/client/qrscanner/CustomViewfinderView;->h:I

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/qrscanner/CustomViewfinderView;->b(Landroid/graphics/Canvas;Landroid/content/Context;)V

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/qrscanner/CustomViewfinderView;->d(Landroid/graphics/Canvas;Landroid/content/Context;)V

    return-void
.end method
