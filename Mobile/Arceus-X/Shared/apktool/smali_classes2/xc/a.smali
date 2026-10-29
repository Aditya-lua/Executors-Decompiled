.class public Lxc/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:I


# instance fields
.field public final a:Z

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, 0x4014666666666667L    # 5.1000000000000005

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    sput v0, Lxc/a;->f:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    sget v0, Lic/b;->s:I

    const/4 v1, 0x0

    .line 2
    invoke-static {p1, v0, v1}, Led/b;->b(Landroid/content/Context;IZ)Z

    move-result v3

    sget v0, Lic/b;->r:I

    .line 3
    invoke-static {p1, v0, v1}, Luc/a;->b(Landroid/content/Context;II)I

    move-result v4

    sget v0, Lic/b;->q:I

    .line 4
    invoke-static {p1, v0, v1}, Luc/a;->b(Landroid/content/Context;II)I

    move-result v5

    sget v0, Lic/b;->o:I

    .line 5
    invoke-static {p1, v0, v1}, Luc/a;->b(Landroid/content/Context;II)I

    move-result v6

    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget v7, p1, Landroid/util/DisplayMetrics;->density:F

    move-object v2, p0

    .line 7
    invoke-direct/range {v2 .. v7}, Lxc/a;-><init>(ZIIIF)V

    return-void
.end method

.method public constructor <init>(ZIIIF)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-boolean p1, p0, Lxc/a;->a:Z

    .line 10
    iput p2, p0, Lxc/a;->b:I

    .line 11
    iput p3, p0, Lxc/a;->c:I

    .line 12
    iput p4, p0, Lxc/a;->d:I

    .line 13
    iput p5, p0, Lxc/a;->e:F

    return-void
.end method


# virtual methods
.method public a(F)F
    .locals 3

    iget v0, p0, Lxc/a;->e:F

    const/4 v1, 0x0

    cmpg-float v2, v0, v1

    if-lez v2, :cond_1

    cmpg-float v2, p1, v1

    if-gtz v2, :cond_0

    goto :goto_0

    :cond_0
    div-float/2addr p1, v0

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->log1p(D)D

    move-result-wide v0

    double-to-float p1, v0

    const/high16 v0, 0x40900000    # 4.5f

    mul-float/2addr p1, v0

    const/high16 v0, 0x40000000    # 2.0f

    add-float/2addr p1, v0

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr p1, v0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    return p1

    :cond_1
    :goto_0
    return v1
.end method

.method public b(IF)I
    .locals 2

    invoke-virtual {p0, p2}, Lxc/a;->a(F)F

    move-result p2

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    const/16 v1, 0xff

    invoke-static {p1, v1}, Landroidx/core/graphics/c;->l(II)I

    move-result p1

    iget v1, p0, Lxc/a;->b:I

    invoke-static {p1, v1, p2}, Luc/a;->j(IIF)I

    move-result p1

    const/4 v1, 0x0

    cmpl-float p2, p2, v1

    if-lez p2, :cond_0

    iget p2, p0, Lxc/a;->c:I

    if-eqz p2, :cond_0

    sget v1, Lxc/a;->f:I

    invoke-static {p2, v1}, Landroidx/core/graphics/c;->l(II)I

    move-result p2

    invoke-static {p1, p2}, Luc/a;->i(II)I

    move-result p1

    :cond_0
    invoke-static {p1, v0}, Landroidx/core/graphics/c;->l(II)I

    move-result p1

    return p1
.end method

.method public c(IF)I
    .locals 1

    iget-boolean v0, p0, Lxc/a;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lxc/a;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lxc/a;->b(IF)I

    move-result p1

    :cond_0
    return p1
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lxc/a;->a:Z

    return v0
.end method

.method public final e(I)Z
    .locals 1

    const/16 v0, 0xff

    invoke-static {p1, v0}, Landroidx/core/graphics/c;->l(II)I

    move-result p1

    iget v0, p0, Lxc/a;->d:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
