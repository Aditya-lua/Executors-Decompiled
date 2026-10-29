.class public final Lp0/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Landroid/util/Rational;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Landroid/util/Rational;

.field public final b:Landroid/graphics/RectF;

.field public final c:Landroid/util/Rational;


# direct methods
.method public constructor <init>(Landroid/util/Rational;Landroid/util/Rational;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/a$a;->a:Landroid/util/Rational;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Landroid/util/Rational;

    const/4 v0, 0x4

    const/4 v1, 0x3

    invoke-direct {p2, v0, v1}, Landroid/util/Rational;-><init>(II)V

    :goto_0
    iput-object p2, p0, Lp0/a$a;->c:Landroid/util/Rational;

    invoke-virtual {p0, p1}, Lp0/a$a;->d(Landroid/util/Rational;)Landroid/graphics/RectF;

    move-result-object p1

    iput-object p1, p0, Lp0/a$a;->b:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public a(Landroid/util/Rational;Landroid/util/Rational;)I
    .locals 2

    invoke-virtual {p1, p2}, Landroid/util/Rational;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0, p1}, Lp0/a$a;->d(Landroid/util/Rational;)Landroid/graphics/RectF;

    move-result-object p1

    invoke-virtual {p0, p2}, Lp0/a$a;->d(Landroid/util/Rational;)Landroid/graphics/RectF;

    move-result-object p2

    iget-object v0, p0, Lp0/a$a;->b:Landroid/graphics/RectF;

    invoke-virtual {p0, p1, v0}, Lp0/a$a;->e(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    move-result v0

    iget-object v1, p0, Lp0/a$a;->b:Landroid/graphics/RectF;

    invoke-virtual {p0, p2, v1}, Lp0/a$a;->e(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    move-result v1

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    invoke-virtual {p0, p1}, Lp0/a$a;->b(Landroid/graphics/RectF;)F

    move-result p1

    invoke-virtual {p0, p2}, Lp0/a$a;->b(Landroid/graphics/RectF;)F

    move-result p2

    sub-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result p1

    float-to-int p1, p1

    return p1

    :cond_1
    if-eqz v0, :cond_2

    const/4 p1, -0x1

    return p1

    :cond_2
    if-eqz v1, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    iget-object v0, p0, Lp0/a$a;->b:Landroid/graphics/RectF;

    invoke-virtual {p0, p1, v0}, Lp0/a$a;->c(Landroid/graphics/RectF;Landroid/graphics/RectF;)F

    move-result p1

    iget-object v0, p0, Lp0/a$a;->b:Landroid/graphics/RectF;

    invoke-virtual {p0, p2, v0}, Lp0/a$a;->c(Landroid/graphics/RectF;Landroid/graphics/RectF;)F

    move-result p2

    sub-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result p1

    float-to-int p1, p1

    neg-int p1, p1

    return p1
.end method

.method public final b(Landroid/graphics/RectF;)F
    .locals 1

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    mul-float/2addr v0, p1

    return v0
.end method

.method public final c(Landroid/graphics/RectF;Landroid/graphics/RectF;)F
    .locals 3

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result v0

    :goto_0
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v1

    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    move-result v2

    cmpg-float v1, v1, v2

    if-gez v1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    move-result p1

    :goto_1
    mul-float/2addr v0, p1

    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Landroid/util/Rational;

    check-cast p2, Landroid/util/Rational;

    invoke-virtual {p0, p1, p2}, Lp0/a$a;->a(Landroid/util/Rational;Landroid/util/Rational;)I

    move-result p1

    return p1
.end method

.method public final d(Landroid/util/Rational;)Landroid/graphics/RectF;
    .locals 5

    invoke-virtual {p1}, Landroid/util/Rational;->floatValue()F

    move-result v0

    iget-object v1, p0, Lp0/a$a;->c:Landroid/util/Rational;

    invoke-virtual {v1}, Landroid/util/Rational;->floatValue()F

    move-result v1

    cmpl-float v0, v0, v1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-instance p1, Landroid/graphics/RectF;

    iget-object v0, p0, Lp0/a$a;->c:Landroid/util/Rational;

    invoke-virtual {v0}, Landroid/util/Rational;->getNumerator()I

    move-result v0

    int-to-float v0, v0

    iget-object v2, p0, Lp0/a$a;->c:Landroid/util/Rational;

    invoke-virtual {v2}, Landroid/util/Rational;->getDenominator()I

    move-result v2

    int-to-float v2, v2

    invoke-direct {p1, v1, v1, v0, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroid/util/Rational;->floatValue()F

    move-result v0

    iget-object v2, p0, Lp0/a$a;->c:Landroid/util/Rational;

    invoke-virtual {v2}, Landroid/util/Rational;->floatValue()F

    move-result v2

    cmpl-float v0, v0, v2

    if-lez v0, :cond_1

    new-instance v0, Landroid/graphics/RectF;

    iget-object v2, p0, Lp0/a$a;->c:Landroid/util/Rational;

    invoke-virtual {v2}, Landroid/util/Rational;->getNumerator()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1}, Landroid/util/Rational;->getDenominator()I

    move-result v3

    int-to-float v3, v3

    iget-object v4, p0, Lp0/a$a;->c:Landroid/util/Rational;

    invoke-virtual {v4}, Landroid/util/Rational;->getNumerator()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-virtual {p1}, Landroid/util/Rational;->getNumerator()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr v3, p1

    invoke-direct {v0, v1, v1, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object v0

    :cond_1
    new-instance v0, Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/util/Rational;->getNumerator()I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Lp0/a$a;->c:Landroid/util/Rational;

    invoke-virtual {v3}, Landroid/util/Rational;->getDenominator()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-virtual {p1}, Landroid/util/Rational;->getDenominator()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr v2, p1

    iget-object p1, p0, Lp0/a$a;->c:Landroid/util/Rational;

    invoke-virtual {p1}, Landroid/util/Rational;->getDenominator()I

    move-result p1

    int-to-float p1, p1

    invoke-direct {v0, v1, v1, v2, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object v0
.end method

.method public final e(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    move-result p2

    cmpl-float p1, p1, p2

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
