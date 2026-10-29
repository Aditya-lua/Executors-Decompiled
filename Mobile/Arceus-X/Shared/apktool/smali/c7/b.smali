.class public final Lc7/b;
.super Lc7/c;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008B\u0013\u0008\u0016\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\nJ \u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00178\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0014\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lc7/b;",
        "Lc7/c;",
        "",
        "topLeft",
        "topRight",
        "bottomLeft",
        "bottomRight",
        "<init>",
        "(FFFF)V",
        "radius",
        "(F)V",
        "Landroid/graphics/Bitmap;",
        "input",
        "Ly6/g;",
        "size",
        "b",
        "(Landroid/graphics/Bitmap;Ly6/g;Lnt/b;)Ljava/lang/Object;",
        "Le7/r;",
        "c",
        "(Landroid/graphics/Bitmap;Ly6/g;)J",
        "a",
        "F",
        "d",
        "",
        "e",
        "Ljava/lang/String;",
        "()Ljava/lang/String;",
        "cacheKey",
        "coil-core_release"
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
.field public final a:F

.field public final b:F

.field public final c:F

.field public final d:F

.field public final e:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(F)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p1, p1, p1}, Lc7/b;-><init>(FFFF)V

    return-void
.end method

.method public constructor <init>(FFFF)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc7/c;-><init>()V

    .line 2
    iput p1, p0, Lc7/b;->a:F

    .line 3
    iput p2, p0, Lc7/b;->b:F

    .line 4
    iput p3, p0, Lc7/b;->c:F

    .line 5
    iput p4, p0, Lc7/b;->d:F

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    if-ltz v1, :cond_0

    cmpl-float v1, p2, v0

    if-ltz v1, :cond_0

    cmpl-float v1, p3, v0

    if-ltz v1, :cond_0

    cmpl-float v0, p4, v0

    if-ltz v0, :cond_0

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lc7/b;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v1

    invoke-interface {v1}, Lhu/c;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 p1, 0x2c

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lc7/b;->e:Ljava/lang/String;

    return-void

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "All radii must be >= 0."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lc7/b;->e:Ljava/lang/String;

    return-object v0
.end method

.method public b(Landroid/graphics/Bitmap;Ly6/g;Lnt/b;)Ljava/lang/Object;
    .locals 9
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ly6/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Ly6/g;",
            "Lnt/b<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lc7/b;->c(Landroid/graphics/Bitmap;Ly6/g;)J

    move-result-wide p2

    invoke-static {p2, p3}, Le7/r;->c(J)I

    move-result v0

    invoke-static {p2, p3}, Le7/r;->d(J)I

    move-result p2

    invoke-static {p1}, Le7/b;->c(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap$Config;

    move-result-object p3

    invoke-static {v0, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p3

    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, p3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-static {p1, v0, p2}, Lc7/d;->a(Landroid/graphics/Bitmap;II)Landroid/graphics/Paint;

    move-result-object v8

    iget v6, p0, Lc7/b;->a:F

    iget p1, p0, Lc7/b;->b:F

    cmpg-float v2, v6, p1

    if-nez v2, :cond_0

    iget v2, p0, Lc7/b;->c:F

    cmpg-float v3, p1, v2

    if-nez v3, :cond_0

    iget v3, p0, Lc7/b;->d:F

    cmpg-float v2, v2, v3

    if-nez v2, :cond_0

    int-to-float v4, v0

    int-to-float v5, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v7, v6

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    return-object p3

    :cond_0
    iget v2, p0, Lc7/b;->d:F

    iget v3, p0, Lc7/b;->c:F

    const/16 v4, 0x8

    new-array v4, v4, [F

    const/4 v5, 0x0

    aput v6, v4, v5

    const/4 v5, 0x1

    aput v6, v4, v5

    const/4 v5, 0x2

    aput p1, v4, v5

    const/4 v5, 0x3

    aput p1, v4, v5

    const/4 p1, 0x4

    aput v2, v4, p1

    const/4 p1, 0x5

    aput v2, v4, p1

    const/4 p1, 0x6

    aput v3, v4, p1

    const/4 p1, 0x7

    aput v3, v4, p1

    new-instance p1, Landroid/graphics/RectF;

    int-to-float v0, v0

    int-to-float p2, p2

    const/4 v2, 0x0

    invoke-direct {p1, v2, v2, v0, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    new-instance p2, Landroid/graphics/Path;

    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    sget-object v0, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {p2, p1, v4, v0}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    invoke-virtual {v1, p2, v8}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-object p3
.end method

.method public final c(Landroid/graphics/Bitmap;Ly6/g;)J
    .locals 5

    invoke-static {p2}, Ly6/h;->b(Ly6/g;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    invoke-static {p2, p1}, Le7/r;->a(II)J

    move-result-wide p1

    return-wide p1

    :cond_0
    invoke-virtual {p2}, Ly6/g;->a()Ly6/a;

    move-result-object v0

    invoke-virtual {p2}, Ly6/g;->b()Ly6/a;

    move-result-object v1

    instance-of v2, v0, Ly6/a$a;

    if-eqz v2, :cond_1

    instance-of v2, v1, Ly6/a$a;

    if-eqz v2, :cond_1

    check-cast v0, Ly6/a$a;

    invoke-virtual {v0}, Ly6/a$a;->f()I

    move-result p1

    check-cast v1, Ly6/a$a;

    invoke-virtual {v1}, Ly6/a$a;->f()I

    move-result p2

    invoke-static {p1, p2}, Le7/r;->a(II)J

    move-result-wide p1

    return-wide p1

    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-virtual {p2}, Ly6/g;->d()Ly6/a;

    move-result-object v2

    instance-of v3, v2, Ly6/a$a;

    const/high16 v4, -0x80000000

    if-eqz v3, :cond_2

    check-cast v2, Ly6/a$a;

    invoke-virtual {v2}, Ly6/a$a;->f()I

    move-result v2

    goto :goto_0

    :cond_2
    move v2, v4

    :goto_0
    invoke-virtual {p2}, Ly6/g;->c()Ly6/a;

    move-result-object p2

    instance-of v3, p2, Ly6/a$a;

    if-eqz v3, :cond_3

    check-cast p2, Ly6/a$a;

    invoke-virtual {p2}, Ly6/a$a;->f()I

    move-result v4

    :cond_3
    sget-object p2, Ly6/f;->a:Ly6/f;

    invoke-static {v0, v1, v2, v4, p2}, Lm6/h;->d(IIIILy6/f;)D

    move-result-wide v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p2

    int-to-double v2, p2

    mul-double/2addr v2, v0

    invoke-static {v2, v3}, Lcu/b;->c(D)I

    move-result p2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    int-to-double v2, p1

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Lcu/b;->c(D)I

    move-result p1

    invoke-static {p2, p1}, Le7/r;->a(II)J

    move-result-wide p1

    return-wide p1
.end method
