.class public Lp5/f$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp5/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# static fields
.field public static final q:Landroid/graphics/Matrix;


# instance fields
.field public final a:Landroid/graphics/Path;

.field public final b:Landroid/graphics/Path;

.field public final c:Landroid/graphics/Matrix;

.field public d:Landroid/graphics/Paint;

.field public e:Landroid/graphics/Paint;

.field public f:Landroid/graphics/PathMeasure;

.field public g:I

.field public final h:Lp5/f$d;

.field public i:F

.field public j:F

.field public k:F

.field public l:F

.field public m:I

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/Boolean;

.field public final p:Lw1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw1/a<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    sput-object v0, Lp5/f$g;->q:Landroid/graphics/Matrix;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lp5/f$g;->c:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lp5/f$g;->i:F

    .line 4
    iput v0, p0, Lp5/f$g;->j:F

    .line 5
    iput v0, p0, Lp5/f$g;->k:F

    .line 6
    iput v0, p0, Lp5/f$g;->l:F

    const/16 v0, 0xff

    .line 7
    iput v0, p0, Lp5/f$g;->m:I

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lp5/f$g;->n:Ljava/lang/String;

    .line 9
    iput-object v0, p0, Lp5/f$g;->o:Ljava/lang/Boolean;

    .line 10
    new-instance v0, Lw1/a;

    invoke-direct {v0}, Lw1/a;-><init>()V

    iput-object v0, p0, Lp5/f$g;->p:Lw1/a;

    .line 11
    new-instance v0, Lp5/f$d;

    invoke-direct {v0}, Lp5/f$d;-><init>()V

    iput-object v0, p0, Lp5/f$g;->h:Lp5/f$d;

    .line 12
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lp5/f$g;->a:Landroid/graphics/Path;

    .line 13
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lp5/f$g;->b:Landroid/graphics/Path;

    return-void
.end method

.method public constructor <init>(Lp5/f$g;)V
    .locals 3

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lp5/f$g;->c:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    .line 16
    iput v0, p0, Lp5/f$g;->i:F

    .line 17
    iput v0, p0, Lp5/f$g;->j:F

    .line 18
    iput v0, p0, Lp5/f$g;->k:F

    .line 19
    iput v0, p0, Lp5/f$g;->l:F

    const/16 v0, 0xff

    .line 20
    iput v0, p0, Lp5/f$g;->m:I

    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lp5/f$g;->n:Ljava/lang/String;

    .line 22
    iput-object v0, p0, Lp5/f$g;->o:Ljava/lang/Boolean;

    .line 23
    new-instance v0, Lw1/a;

    invoke-direct {v0}, Lw1/a;-><init>()V

    iput-object v0, p0, Lp5/f$g;->p:Lw1/a;

    .line 24
    new-instance v1, Lp5/f$d;

    iget-object v2, p1, Lp5/f$g;->h:Lp5/f$d;

    invoke-direct {v1, v2, v0}, Lp5/f$d;-><init>(Lp5/f$d;Lw1/a;)V

    iput-object v1, p0, Lp5/f$g;->h:Lp5/f$d;

    .line 25
    new-instance v1, Landroid/graphics/Path;

    iget-object v2, p1, Lp5/f$g;->a:Landroid/graphics/Path;

    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object v1, p0, Lp5/f$g;->a:Landroid/graphics/Path;

    .line 26
    new-instance v1, Landroid/graphics/Path;

    iget-object v2, p1, Lp5/f$g;->b:Landroid/graphics/Path;

    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object v1, p0, Lp5/f$g;->b:Landroid/graphics/Path;

    .line 27
    iget v1, p1, Lp5/f$g;->i:F

    iput v1, p0, Lp5/f$g;->i:F

    .line 28
    iget v1, p1, Lp5/f$g;->j:F

    iput v1, p0, Lp5/f$g;->j:F

    .line 29
    iget v1, p1, Lp5/f$g;->k:F

    iput v1, p0, Lp5/f$g;->k:F

    .line 30
    iget v1, p1, Lp5/f$g;->l:F

    iput v1, p0, Lp5/f$g;->l:F

    .line 31
    iget v1, p1, Lp5/f$g;->g:I

    iput v1, p0, Lp5/f$g;->g:I

    .line 32
    iget v1, p1, Lp5/f$g;->m:I

    iput v1, p0, Lp5/f$g;->m:I

    .line 33
    iget-object v1, p1, Lp5/f$g;->n:Ljava/lang/String;

    iput-object v1, p0, Lp5/f$g;->n:Ljava/lang/String;

    .line 34
    iget-object v1, p1, Lp5/f$g;->n:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 35
    invoke-virtual {v0, v1, p0}, Lw1/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    :cond_0
    iget-object p1, p1, Lp5/f$g;->o:Ljava/lang/Boolean;

    iput-object p1, p0, Lp5/f$g;->o:Ljava/lang/Boolean;

    return-void
.end method

.method public static a(FFFF)F
    .locals 0

    mul-float/2addr p0, p3

    mul-float/2addr p1, p2

    sub-float/2addr p0, p1

    return p0
.end method


# virtual methods
.method public b(Landroid/graphics/Canvas;IILandroid/graphics/ColorFilter;)V
    .locals 7

    iget-object v1, p0, Lp5/f$g;->h:Lp5/f$d;

    sget-object v2, Lp5/f$g;->q:Landroid/graphics/Matrix;

    move-object v0, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    move-object v6, p4

    invoke-virtual/range {v0 .. v6}, Lp5/f$g;->c(Lp5/f$d;Landroid/graphics/Matrix;Landroid/graphics/Canvas;IILandroid/graphics/ColorFilter;)V

    return-void
.end method

.method public final c(Lp5/f$d;Landroid/graphics/Matrix;Landroid/graphics/Canvas;IILandroid/graphics/ColorFilter;)V
    .locals 15

    move-object/from16 v1, p1

    iget-object v0, v1, Lp5/f$d;->a:Landroid/graphics/Matrix;

    move-object/from16 v2, p2

    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object v0, v1, Lp5/f$d;->a:Landroid/graphics/Matrix;

    iget-object v2, v1, Lp5/f$d;->j:Landroid/graphics/Matrix;

    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->save()I

    const/4 v0, 0x0

    move v7, v0

    :goto_0
    iget-object v0, v1, Lp5/f$d;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v7, v0, :cond_2

    iget-object v0, v1, Lp5/f$d;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp5/f$e;

    instance-of v2, v0, Lp5/f$d;

    if-eqz v2, :cond_0

    move-object v9, v0

    check-cast v9, Lp5/f$d;

    iget-object v10, v1, Lp5/f$d;->a:Landroid/graphics/Matrix;

    move-object v8, p0

    move-object/from16 v11, p3

    move/from16 v12, p4

    move/from16 v13, p5

    move-object/from16 v14, p6

    invoke-virtual/range {v8 .. v14}, Lp5/f$g;->c(Lp5/f$d;Landroid/graphics/Matrix;Landroid/graphics/Canvas;IILandroid/graphics/ColorFilter;)V

    goto :goto_1

    :cond_0
    instance-of v2, v0, Lp5/f$f;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lp5/f$f;

    move-object v0, p0

    move-object/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-virtual/range {v0 .. v6}, Lp5/f$g;->d(Lp5/f$d;Lp5/f$f;Landroid/graphics/Canvas;IILandroid/graphics/ColorFilter;)V

    :cond_1
    :goto_1
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v1, p1

    goto :goto_0

    :cond_2
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final d(Lp5/f$d;Lp5/f$f;Landroid/graphics/Canvas;IILandroid/graphics/ColorFilter;)V
    .locals 7

    int-to-float p4, p4

    iget v0, p0, Lp5/f$g;->k:F

    div-float/2addr p4, v0

    int-to-float p5, p5

    iget v0, p0, Lp5/f$g;->l:F

    div-float/2addr p5, v0

    invoke-static {p4, p5}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iget-object p1, p1, Lp5/f$d;->a:Landroid/graphics/Matrix;

    iget-object v1, p0, Lp5/f$g;->c:Landroid/graphics/Matrix;

    invoke-virtual {v1, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object v1, p0, Lp5/f$g;->c:Landroid/graphics/Matrix;

    invoke-virtual {v1, p4, p5}, Landroid/graphics/Matrix;->postScale(FF)Z

    invoke-virtual {p0, p1}, Lp5/f$g;->e(Landroid/graphics/Matrix;)F

    move-result p1

    const/4 p4, 0x0

    cmpl-float p5, p1, p4

    if-nez p5, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object p5, p0, Lp5/f$g;->a:Landroid/graphics/Path;

    invoke-virtual {p2, p5}, Lp5/f$f;->d(Landroid/graphics/Path;)V

    iget-object p5, p0, Lp5/f$g;->a:Landroid/graphics/Path;

    iget-object v1, p0, Lp5/f$g;->b:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    invoke-virtual {p2}, Lp5/f$f;->c()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p0, Lp5/f$g;->b:Landroid/graphics/Path;

    iget p2, p2, Lp5/f$f;->c:I

    if-nez p2, :cond_1

    sget-object p2, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    goto :goto_0

    :cond_1
    sget-object p2, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    :goto_0
    invoke-virtual {p1, p2}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    iget-object p1, p0, Lp5/f$g;->b:Landroid/graphics/Path;

    iget-object p2, p0, Lp5/f$g;->c:Landroid/graphics/Matrix;

    invoke-virtual {p1, p5, p2}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    iget-object p1, p0, Lp5/f$g;->b:Landroid/graphics/Path;

    invoke-virtual {p3, p1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    return-void

    :cond_2
    check-cast p2, Lp5/f$c;

    iget v1, p2, Lp5/f$c;->k:F

    cmpl-float v2, v1, p4

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x1

    if-nez v2, :cond_3

    iget v2, p2, Lp5/f$c;->l:F

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_6

    :cond_3
    iget v2, p2, Lp5/f$c;->m:F

    add-float/2addr v1, v2

    rem-float/2addr v1, v3

    iget v5, p2, Lp5/f$c;->l:F

    add-float/2addr v5, v2

    rem-float/2addr v5, v3

    iget-object v2, p0, Lp5/f$g;->f:Landroid/graphics/PathMeasure;

    if-nez v2, :cond_4

    new-instance v2, Landroid/graphics/PathMeasure;

    invoke-direct {v2}, Landroid/graphics/PathMeasure;-><init>()V

    iput-object v2, p0, Lp5/f$g;->f:Landroid/graphics/PathMeasure;

    :cond_4
    iget-object v2, p0, Lp5/f$g;->f:Landroid/graphics/PathMeasure;

    iget-object v3, p0, Lp5/f$g;->a:Landroid/graphics/Path;

    const/4 v6, 0x0

    invoke-virtual {v2, v3, v6}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    iget-object v2, p0, Lp5/f$g;->f:Landroid/graphics/PathMeasure;

    invoke-virtual {v2}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v2

    mul-float/2addr v1, v2

    mul-float/2addr v5, v2

    invoke-virtual {p5}, Landroid/graphics/Path;->reset()V

    cmpl-float v3, v1, v5

    if-lez v3, :cond_5

    iget-object v3, p0, Lp5/f$g;->f:Landroid/graphics/PathMeasure;

    invoke-virtual {v3, v1, v2, p5, v4}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    iget-object v1, p0, Lp5/f$g;->f:Landroid/graphics/PathMeasure;

    invoke-virtual {v1, p4, v5, p5, v4}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    goto :goto_1

    :cond_5
    iget-object v2, p0, Lp5/f$g;->f:Landroid/graphics/PathMeasure;

    invoke-virtual {v2, v1, v5, p5, v4}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    :goto_1
    invoke-virtual {p5, p4, p4}, Landroid/graphics/Path;->rLineTo(FF)V

    :cond_6
    iget-object p4, p0, Lp5/f$g;->b:Landroid/graphics/Path;

    iget-object v1, p0, Lp5/f$g;->c:Landroid/graphics/Matrix;

    invoke-virtual {p4, p5, v1}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    iget-object p4, p2, Lp5/f$c;->h:Ln2/d;

    invoke-virtual {p4}, Ln2/d;->l()Z

    move-result p4

    const/16 p5, 0xff

    const/4 v1, 0x0

    const/high16 v2, 0x437f0000    # 255.0f

    if-eqz p4, :cond_a

    iget-object p4, p2, Lp5/f$c;->h:Ln2/d;

    iget-object v3, p0, Lp5/f$g;->e:Landroid/graphics/Paint;

    if-nez v3, :cond_7

    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v3, p0, Lp5/f$g;->e:Landroid/graphics/Paint;

    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    :cond_7
    iget-object v3, p0, Lp5/f$g;->e:Landroid/graphics/Paint;

    invoke-virtual {p4}, Ln2/d;->h()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-virtual {p4}, Ln2/d;->f()Landroid/graphics/Shader;

    move-result-object p4

    iget-object v5, p0, Lp5/f$g;->c:Landroid/graphics/Matrix;

    invoke-virtual {p4, v5}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    invoke-virtual {v3, p4}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget p4, p2, Lp5/f$c;->j:F

    mul-float/2addr p4, v2

    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    move-result p4

    invoke-virtual {v3, p4}, Landroid/graphics/Paint;->setAlpha(I)V

    goto :goto_2

    :cond_8
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    invoke-virtual {v3, p5}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-virtual {p4}, Ln2/d;->e()I

    move-result p4

    iget v5, p2, Lp5/f$c;->j:F

    invoke-static {p4, v5}, Lp5/f;->a(IF)I

    move-result p4

    invoke-virtual {v3, p4}, Landroid/graphics/Paint;->setColor(I)V

    :goto_2
    invoke-virtual {v3, p6}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    iget-object p4, p0, Lp5/f$g;->b:Landroid/graphics/Path;

    iget v5, p2, Lp5/f$f;->c:I

    if-nez v5, :cond_9

    sget-object v5, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    goto :goto_3

    :cond_9
    sget-object v5, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    :goto_3
    invoke-virtual {p4, v5}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    iget-object p4, p0, Lp5/f$g;->b:Landroid/graphics/Path;

    invoke-virtual {p3, p4, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_a
    iget-object p4, p2, Lp5/f$c;->f:Ln2/d;

    invoke-virtual {p4}, Ln2/d;->l()Z

    move-result p4

    if-eqz p4, :cond_f

    iget-object p4, p2, Lp5/f$c;->f:Ln2/d;

    iget-object v3, p0, Lp5/f$g;->d:Landroid/graphics/Paint;

    if-nez v3, :cond_b

    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v3, p0, Lp5/f$g;->d:Landroid/graphics/Paint;

    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    :cond_b
    iget-object v3, p0, Lp5/f$g;->d:Landroid/graphics/Paint;

    iget-object v4, p2, Lp5/f$c;->o:Landroid/graphics/Paint$Join;

    if-eqz v4, :cond_c

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    :cond_c
    iget-object v4, p2, Lp5/f$c;->n:Landroid/graphics/Paint$Cap;

    if-eqz v4, :cond_d

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    :cond_d
    iget v4, p2, Lp5/f$c;->p:F

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    invoke-virtual {p4}, Ln2/d;->h()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-virtual {p4}, Ln2/d;->f()Landroid/graphics/Shader;

    move-result-object p4

    iget-object p5, p0, Lp5/f$g;->c:Landroid/graphics/Matrix;

    invoke-virtual {p4, p5}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    invoke-virtual {v3, p4}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget p4, p2, Lp5/f$c;->i:F

    mul-float/2addr p4, v2

    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    move-result p4

    invoke-virtual {v3, p4}, Landroid/graphics/Paint;->setAlpha(I)V

    goto :goto_4

    :cond_e
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    invoke-virtual {v3, p5}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-virtual {p4}, Ln2/d;->e()I

    move-result p4

    iget p5, p2, Lp5/f$c;->i:F

    invoke-static {p4, p5}, Lp5/f;->a(IF)I

    move-result p4

    invoke-virtual {v3, p4}, Landroid/graphics/Paint;->setColor(I)V

    :goto_4
    invoke-virtual {v3, p6}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    mul-float/2addr v0, p1

    iget p1, p2, Lp5/f$c;->g:F

    mul-float/2addr p1, v0

    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p1, p0, Lp5/f$g;->b:Landroid/graphics/Path;

    invoke-virtual {p3, p1, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_f
    :goto_5
    return-void
.end method

.method public final e(Landroid/graphics/Matrix;)F
    .locals 9

    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->mapVectors([F)V

    const/4 p1, 0x0

    aget v1, v0, p1

    float-to-double v1, v1

    const/4 v3, 0x1

    aget v4, v0, v3

    float-to-double v4, v4

    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v1

    double-to-float v1, v1

    const/4 v2, 0x2

    aget v4, v0, v2

    float-to-double v4, v4

    const/4 v6, 0x3

    aget v7, v0, v6

    float-to-double v7, v7

    invoke-static {v4, v5, v7, v8}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v4

    double-to-float v4, v4

    aget p1, v0, p1

    aget v3, v0, v3

    aget v2, v0, v2

    aget v0, v0, v6

    invoke-static {p1, v3, v2, v0}, Lp5/f$g;->a(FFFF)F

    move-result p1

    invoke-static {v1, v4}, Ljava/lang/Math;->max(FF)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-lez v2, :cond_0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    div-float/2addr p1, v0

    return p1

    :cond_0
    return v1

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lp5/f$g;->o:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    iget-object v0, p0, Lp5/f$g;->h:Lp5/f$d;

    invoke-virtual {v0}, Lp5/f$d;->a()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lp5/f$g;->o:Ljava/lang/Boolean;

    :cond_0
    iget-object v0, p0, Lp5/f$g;->o:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public g([I)Z
    .locals 1

    iget-object v0, p0, Lp5/f$g;->h:Lp5/f$d;

    invoke-virtual {v0, p1}, Lp5/f$d;->b([I)Z

    move-result p1

    return p1
.end method

.method public getAlpha()F
    .locals 2

    invoke-virtual {p0}, Lp5/f$g;->getRootAlpha()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x437f0000    # 255.0f

    div-float/2addr v0, v1

    return v0
.end method

.method public getRootAlpha()I
    .locals 1

    iget v0, p0, Lp5/f$g;->m:I

    return v0
.end method

.method public setAlpha(F)V
    .locals 1

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float/2addr p1, v0

    float-to-int p1, p1

    invoke-virtual {p0, p1}, Lp5/f$g;->setRootAlpha(I)V

    return-void
.end method

.method public setRootAlpha(I)V
    .locals 0

    iput p1, p0, Lp5/f$g;->m:I

    return-void
.end method
