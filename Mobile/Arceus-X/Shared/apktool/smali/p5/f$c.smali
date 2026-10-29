.class public Lp5/f$c;
.super Lp5/f$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp5/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public e:[I

.field public f:Ln2/d;

.field public g:F

.field public h:Ln2/d;

.field public i:F

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public n:Landroid/graphics/Paint$Cap;

.field public o:Landroid/graphics/Paint$Join;

.field public p:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lp5/f$f;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lp5/f$c;->g:F

    const/high16 v1, 0x3f800000    # 1.0f

    .line 3
    iput v1, p0, Lp5/f$c;->i:F

    .line 4
    iput v1, p0, Lp5/f$c;->j:F

    .line 5
    iput v0, p0, Lp5/f$c;->k:F

    .line 6
    iput v1, p0, Lp5/f$c;->l:F

    .line 7
    iput v0, p0, Lp5/f$c;->m:F

    .line 8
    sget-object v0, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    iput-object v0, p0, Lp5/f$c;->n:Landroid/graphics/Paint$Cap;

    .line 9
    sget-object v0, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    iput-object v0, p0, Lp5/f$c;->o:Landroid/graphics/Paint$Join;

    const/high16 v0, 0x40800000    # 4.0f

    .line 10
    iput v0, p0, Lp5/f$c;->p:F

    return-void
.end method

.method public constructor <init>(Lp5/f$c;)V
    .locals 2

    .line 11
    invoke-direct {p0, p1}, Lp5/f$f;-><init>(Lp5/f$f;)V

    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lp5/f$c;->g:F

    const/high16 v1, 0x3f800000    # 1.0f

    .line 13
    iput v1, p0, Lp5/f$c;->i:F

    .line 14
    iput v1, p0, Lp5/f$c;->j:F

    .line 15
    iput v0, p0, Lp5/f$c;->k:F

    .line 16
    iput v1, p0, Lp5/f$c;->l:F

    .line 17
    iput v0, p0, Lp5/f$c;->m:F

    .line 18
    sget-object v0, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    iput-object v0, p0, Lp5/f$c;->n:Landroid/graphics/Paint$Cap;

    .line 19
    sget-object v0, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    iput-object v0, p0, Lp5/f$c;->o:Landroid/graphics/Paint$Join;

    const/high16 v0, 0x40800000    # 4.0f

    .line 20
    iput v0, p0, Lp5/f$c;->p:F

    .line 21
    iget-object v0, p1, Lp5/f$c;->e:[I

    iput-object v0, p0, Lp5/f$c;->e:[I

    .line 22
    iget-object v0, p1, Lp5/f$c;->f:Ln2/d;

    iput-object v0, p0, Lp5/f$c;->f:Ln2/d;

    .line 23
    iget v0, p1, Lp5/f$c;->g:F

    iput v0, p0, Lp5/f$c;->g:F

    .line 24
    iget v0, p1, Lp5/f$c;->i:F

    iput v0, p0, Lp5/f$c;->i:F

    .line 25
    iget-object v0, p1, Lp5/f$c;->h:Ln2/d;

    iput-object v0, p0, Lp5/f$c;->h:Ln2/d;

    .line 26
    iget v0, p1, Lp5/f$f;->c:I

    iput v0, p0, Lp5/f$f;->c:I

    .line 27
    iget v0, p1, Lp5/f$c;->j:F

    iput v0, p0, Lp5/f$c;->j:F

    .line 28
    iget v0, p1, Lp5/f$c;->k:F

    iput v0, p0, Lp5/f$c;->k:F

    .line 29
    iget v0, p1, Lp5/f$c;->l:F

    iput v0, p0, Lp5/f$c;->l:F

    .line 30
    iget v0, p1, Lp5/f$c;->m:F

    iput v0, p0, Lp5/f$c;->m:F

    .line 31
    iget-object v0, p1, Lp5/f$c;->n:Landroid/graphics/Paint$Cap;

    iput-object v0, p0, Lp5/f$c;->n:Landroid/graphics/Paint$Cap;

    .line 32
    iget-object v0, p1, Lp5/f$c;->o:Landroid/graphics/Paint$Join;

    iput-object v0, p0, Lp5/f$c;->o:Landroid/graphics/Paint$Join;

    .line 33
    iget p1, p1, Lp5/f$c;->p:F

    iput p1, p0, Lp5/f$c;->p:F

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lp5/f$c;->h:Ln2/d;

    invoke-virtual {v0}, Ln2/d;->i()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lp5/f$c;->f:Ln2/d;

    invoke-virtual {v0}, Ln2/d;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public b([I)Z
    .locals 2

    iget-object v0, p0, Lp5/f$c;->h:Ln2/d;

    invoke-virtual {v0, p1}, Ln2/d;->j([I)Z

    move-result v0

    iget-object v1, p0, Lp5/f$c;->f:Ln2/d;

    invoke-virtual {v1, p1}, Ln2/d;->j([I)Z

    move-result p1

    or-int/2addr p1, v0

    return p1
.end method

.method public final e(ILandroid/graphics/Paint$Cap;)Landroid/graphics/Paint$Cap;
    .locals 1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    return-object p2

    :cond_0
    sget-object p1, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    return-object p1

    :cond_1
    sget-object p1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    return-object p1

    :cond_2
    sget-object p1, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    return-object p1
.end method

.method public final f(ILandroid/graphics/Paint$Join;)Landroid/graphics/Paint$Join;
    .locals 1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    return-object p2

    :cond_0
    sget-object p1, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    return-object p1

    :cond_1
    sget-object p1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    return-object p1

    :cond_2
    sget-object p1, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    return-object p1
.end method

.method public g(Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 1

    sget-object v0, Lp5/a;->c:[I

    invoke-static {p1, p3, p2, v0}, Ln2/k;->i(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p0, p1, p4, p3}, Lp5/f$c;->h(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public getFillAlpha()F
    .locals 1

    iget v0, p0, Lp5/f$c;->j:F

    return v0
.end method

.method public getFillColor()I
    .locals 1

    iget-object v0, p0, Lp5/f$c;->h:Ln2/d;

    invoke-virtual {v0}, Ln2/d;->e()I

    move-result v0

    return v0
.end method

.method public getStrokeAlpha()F
    .locals 1

    iget v0, p0, Lp5/f$c;->i:F

    return v0
.end method

.method public getStrokeColor()I
    .locals 1

    iget-object v0, p0, Lp5/f$c;->f:Ln2/d;

    invoke-virtual {v0}, Ln2/d;->e()I

    move-result v0

    return v0
.end method

.method public getStrokeWidth()F
    .locals 1

    iget v0, p0, Lp5/f$c;->g:F

    return v0
.end method

.method public getTrimPathEnd()F
    .locals 1

    iget v0, p0, Lp5/f$c;->l:F

    return v0
.end method

.method public getTrimPathOffset()F
    .locals 1

    iget v0, p0, Lp5/f$c;->m:F

    return v0
.end method

.method public getTrimPathStart()F
    .locals 1

    iget v0, p0, Lp5/f$c;->k:F

    return v0
.end method

.method public final h(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;)V
    .locals 7

    const/4 v0, 0x0

    iput-object v0, p0, Lp5/f$c;->e:[I

    const-string v0, "pathData"

    invoke-static {p2, v0}, Ln2/k;->h(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iput-object v0, p0, Lp5/f$f;->b:Ljava/lang/String;

    :cond_1
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Landroidx/core/graphics/e;->d(Ljava/lang/String;)[Landroidx/core/graphics/e$b;

    move-result-object v0

    iput-object v0, p0, Lp5/f$f;->a:[Landroidx/core/graphics/e$b;

    :cond_2
    const/4 v5, 0x1

    const/4 v6, 0x0

    const-string v4, "fillColor"

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-static/range {v1 .. v6}, Ln2/k;->e(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;II)Ln2/d;

    move-result-object p1

    move-object v0, v1

    move-object v1, v2

    move-object v2, v3

    iput-object p1, p0, Lp5/f$c;->h:Ln2/d;

    const/16 p1, 0xc

    iget p2, p0, Lp5/f$c;->j:F

    const-string p3, "fillAlpha"

    invoke-static {v0, v1, p3, p1, p2}, Ln2/k;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result p1

    iput p1, p0, Lp5/f$c;->j:F

    const-string p1, "strokeLineCap"

    const/16 p2, 0x8

    const/4 p3, -0x1

    invoke-static {v0, v1, p1, p2, p3}, Ln2/k;->g(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result p1

    iget-object p2, p0, Lp5/f$c;->n:Landroid/graphics/Paint$Cap;

    invoke-virtual {p0, p1, p2}, Lp5/f$c;->e(ILandroid/graphics/Paint$Cap;)Landroid/graphics/Paint$Cap;

    move-result-object p1

    iput-object p1, p0, Lp5/f$c;->n:Landroid/graphics/Paint$Cap;

    const-string p1, "strokeLineJoin"

    const/16 p2, 0x9

    invoke-static {v0, v1, p1, p2, p3}, Ln2/k;->g(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result p1

    iget-object p2, p0, Lp5/f$c;->o:Landroid/graphics/Paint$Join;

    invoke-virtual {p0, p1, p2}, Lp5/f$c;->f(ILandroid/graphics/Paint$Join;)Landroid/graphics/Paint$Join;

    move-result-object p1

    iput-object p1, p0, Lp5/f$c;->o:Landroid/graphics/Paint$Join;

    const/16 p1, 0xa

    iget p2, p0, Lp5/f$c;->p:F

    const-string p3, "strokeMiterLimit"

    invoke-static {v0, v1, p3, p1, p2}, Ln2/k;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result p1

    iput p1, p0, Lp5/f$c;->p:F

    const/4 v4, 0x3

    const/4 v5, 0x0

    const-string v3, "strokeColor"

    invoke-static/range {v0 .. v5}, Ln2/k;->e(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;II)Ln2/d;

    move-result-object p1

    iput-object p1, p0, Lp5/f$c;->f:Ln2/d;

    const/16 p1, 0xb

    iget p2, p0, Lp5/f$c;->i:F

    const-string p3, "strokeAlpha"

    invoke-static {v0, v1, p3, p1, p2}, Ln2/k;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result p1

    iput p1, p0, Lp5/f$c;->i:F

    const/4 p1, 0x4

    iget p2, p0, Lp5/f$c;->g:F

    const-string p3, "strokeWidth"

    invoke-static {v0, v1, p3, p1, p2}, Ln2/k;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result p1

    iput p1, p0, Lp5/f$c;->g:F

    const/4 p1, 0x6

    iget p2, p0, Lp5/f$c;->l:F

    const-string p3, "trimPathEnd"

    invoke-static {v0, v1, p3, p1, p2}, Ln2/k;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result p1

    iput p1, p0, Lp5/f$c;->l:F

    const/4 p1, 0x7

    iget p2, p0, Lp5/f$c;->m:F

    const-string p3, "trimPathOffset"

    invoke-static {v0, v1, p3, p1, p2}, Ln2/k;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result p1

    iput p1, p0, Lp5/f$c;->m:F

    const/4 p1, 0x5

    iget p2, p0, Lp5/f$c;->k:F

    const-string p3, "trimPathStart"

    invoke-static {v0, v1, p3, p1, p2}, Ln2/k;->f(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result p1

    iput p1, p0, Lp5/f$c;->k:F

    const/16 p1, 0xd

    iget p2, p0, Lp5/f$f;->c:I

    const-string p3, "fillType"

    invoke-static {v0, v1, p3, p1, p2}, Ln2/k;->g(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result p1

    iput p1, p0, Lp5/f$f;->c:I

    return-void
.end method

.method public setFillAlpha(F)V
    .locals 0

    iput p1, p0, Lp5/f$c;->j:F

    return-void
.end method

.method public setFillColor(I)V
    .locals 1

    iget-object v0, p0, Lp5/f$c;->h:Ln2/d;

    invoke-virtual {v0, p1}, Ln2/d;->k(I)V

    return-void
.end method

.method public setStrokeAlpha(F)V
    .locals 0

    iput p1, p0, Lp5/f$c;->i:F

    return-void
.end method

.method public setStrokeColor(I)V
    .locals 1

    iget-object v0, p0, Lp5/f$c;->f:Ln2/d;

    invoke-virtual {v0, p1}, Ln2/d;->k(I)V

    return-void
.end method

.method public setStrokeWidth(F)V
    .locals 0

    iput p1, p0, Lp5/f$c;->g:F

    return-void
.end method

.method public setTrimPathEnd(F)V
    .locals 0

    iput p1, p0, Lp5/f$c;->l:F

    return-void
.end method

.method public setTrimPathOffset(F)V
    .locals 0

    iput p1, p0, Lp5/f$c;->m:F

    return-void
.end method

.method public setTrimPathStart(F)V
    .locals 0

    iput p1, p0, Lp5/f$c;->k:F

    return-void
.end method
