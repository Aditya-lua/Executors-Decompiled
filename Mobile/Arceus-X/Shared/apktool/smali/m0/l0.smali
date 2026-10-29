.class public final Lm0/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/a0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lx0/a0<",
        "Lm0/u0$b;",
        "Lx0/b0<",
        "Landroidx/camera/core/d;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lm0/v0;Lp0/g;Landroidx/camera/core/d;)Lx0/b0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm0/v0;",
            "Lp0/g;",
            "Landroidx/camera/core/d;",
            ")",
            "Lx0/b0<",
            "Landroidx/camera/core/d;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lm0/v0;->b()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {p0}, Lm0/v0;->f()I

    move-result v3

    invoke-virtual {p0}, Lm0/v0;->h()Landroid/graphics/Matrix;

    move-result-object v4

    invoke-static {p2}, Lm0/l0;->d(Landroidx/camera/core/d;)Ln0/e0;

    move-result-object v5

    move-object v1, p1

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lx0/b0;->k(Landroidx/camera/core/d;Lp0/g;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Ln0/e0;)Lx0/b0;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lm0/v0;Lp0/g;Landroidx/camera/core/d;)Lx0/b0;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm0/v0;",
            "Lp0/g;",
            "Landroidx/camera/core/d;",
            ")",
            "Lx0/b0<",
            "Landroidx/camera/core/d;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroid/util/Size;

    invoke-interface {p2}, Landroidx/camera/core/d;->getWidth()I

    move-result v1

    invoke-interface {p2}, Landroidx/camera/core/d;->getHeight()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    invoke-virtual {p0}, Lm0/v0;->f()I

    move-result v1

    invoke-virtual {p1}, Lp0/g;->s()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {v1, v0}, Lm0/l0;->e(ILandroid/util/Size;)Landroid/util/Size;

    move-result-object v4

    new-instance v2, Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const/4 v5, 0x0

    invoke-direct {v2, v5, v5, v3, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    new-instance v0, Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    move-result v6

    int-to-float v6, v6

    invoke-direct {v0, v5, v5, v3, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-static {v2, v0, v1}, Lp0/a0;->d(Landroid/graphics/RectF;Landroid/graphics/RectF;I)Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p0}, Lm0/v0;->b()Landroid/graphics/Rect;

    move-result-object v1

    invoke-static {v1, v0}, Lm0/l0;->f(Landroid/graphics/Rect;Landroid/graphics/Matrix;)Landroid/graphics/Rect;

    move-result-object v5

    invoke-virtual {p1}, Lp0/g;->s()I

    move-result v6

    invoke-virtual {p0}, Lm0/v0;->h()Landroid/graphics/Matrix;

    move-result-object p0

    invoke-static {p0, v0}, Lm0/l0;->g(Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    move-result-object v7

    invoke-static {p2}, Lm0/l0;->d(Landroidx/camera/core/d;)Ln0/e0;

    move-result-object v8

    move-object v3, p1

    move-object v2, p2

    invoke-static/range {v2 .. v8}, Lx0/b0;->l(Landroidx/camera/core/d;Lp0/g;Landroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Ln0/e0;)Lx0/b0;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroidx/camera/core/d;)Ln0/e0;
    .locals 1

    invoke-interface {p0}, Landroidx/camera/core/d;->H2()Lg0/i1;

    move-result-object v0

    instance-of v0, v0, Ls0/c;

    if-eqz v0, :cond_0

    invoke-interface {p0}, Landroidx/camera/core/d;->H2()Lg0/i1;

    move-result-object p0

    check-cast p0, Ls0/c;

    invoke-virtual {p0}, Ls0/c;->f()Ln0/e0;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {}, Ln0/e0$a;->k()Ln0/e0;

    move-result-object p0

    return-object p0
.end method

.method public static e(ILandroid/util/Size;)Landroid/util/Size;
    .locals 1

    invoke-static {p0}, Lp0/a0;->w(I)I

    move-result p0

    invoke-static {p0}, Lp0/a0;->i(I)Z

    move-result p0

    if-eqz p0, :cond_0

    new-instance p0, Landroid/util/Size;

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result p1

    invoke-direct {p0, v0, p1}, Landroid/util/Size;-><init>(II)V

    return-object p0

    :cond_0
    return-object p1
.end method

.method public static f(Landroid/graphics/Rect;Landroid/graphics/Matrix;)Landroid/graphics/Rect;
    .locals 1

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0, p0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    invoke-virtual {v0}, Landroid/graphics/RectF;->sort()V

    new-instance p0, Landroid/graphics/Rect;

    invoke-direct {p0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v0, p0}, Landroid/graphics/RectF;->round(Landroid/graphics/Rect;)V

    return-object p0
.end method

.method public static g(Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Landroid/graphics/Matrix;
    .locals 1

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0, p0}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    return-object v0
.end method


# virtual methods
.method public a(Lm0/u0$b;)Lx0/b0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm0/u0$b;",
            ")",
            "Lx0/b0<",
            "Landroidx/camera/core/d;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lm0/u0$b;->a()Landroidx/camera/core/d;

    move-result-object v0

    invoke-virtual {p1}, Lm0/u0$b;->b()Lm0/v0;

    move-result-object p1

    invoke-interface {v0}, Landroidx/camera/core/d;->getFormat()I

    move-result v1

    invoke-static {v1}, Lw0/b;->j(I)Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    invoke-static {v0}, Lp0/g;->j(Landroidx/camera/core/d;)Lp0/g;

    move-result-object v1

    invoke-interface {v0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v2

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-interface {v2}, Landroidx/camera/core/d$a;->k()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Lg0/h1;

    const/4 v1, 0x1

    const-string v2, "Failed to extract EXIF data."

    invoke-direct {v0, v1, v2, p1}, Lg0/h1;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    sget-object v2, Lm0/d0;->g:Lv0/b;

    invoke-virtual {v2, v0}, Lv0/b;->b(Landroidx/camera/core/d;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "JPEG image must have exif."

    invoke-static {v1, v2}, Lx2/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1, v1, v0}, Lm0/l0;->c(Lm0/v0;Lp0/g;Landroidx/camera/core/d;)Lx0/b0;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p1, v1, v0}, Lm0/l0;->b(Lm0/v0;Lp0/g;Landroidx/camera/core/d;)Lx0/b0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm0/u0$b;

    invoke-virtual {p0, p1}, Lm0/l0;->a(Lm0/u0$b;)Lx0/b0;

    move-result-object p1

    return-object p1
.end method
