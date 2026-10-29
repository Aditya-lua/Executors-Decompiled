.class public final Lm0/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/a0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lx0/a0<",
        "Lx0/b0<",
        "[B>;",
        "Lx0/b0<",
        "Landroid/graphics/Bitmap;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lx0/b0;)Lx0/b0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/b0<",
            "[B>;)",
            "Lx0/b0<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lx0/b0;->b()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p1}, Lx0/b0;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    invoke-virtual {p0, v1, v0}, Lm0/e0;->b([BLandroid/graphics/Rect;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {p1}, Lx0/b0;->d()Lp0/g;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    const/4 v6, 0x0

    invoke-direct {v4, v6, v6, v1, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {p1}, Lx0/b0;->f()I

    move-result v5

    invoke-virtual {p1}, Lx0/b0;->g()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-static {v1, v0}, Lp0/a0;->v(Landroid/graphics/Matrix;Landroid/graphics/Rect;)Landroid/graphics/Matrix;

    move-result-object v6

    invoke-virtual {p1}, Lx0/b0;->a()Ln0/e0;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lx0/b0;->j(Landroid/graphics/Bitmap;Lp0/g;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Ln0/e0;)Lx0/b0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx0/b0;

    invoke-virtual {p0, p1}, Lm0/e0;->a(Lx0/b0;)Lx0/b0;

    move-result-object p1

    return-object p1
.end method

.method public final b([BLandroid/graphics/Rect;)Landroid/graphics/Bitmap;
    .locals 2

    :try_start_0
    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, Landroid/graphics/BitmapRegionDecoder;->newInstance([BIIZ)Landroid/graphics/BitmapRegionDecoder;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    invoke-virtual {p1, p2, v0}, Landroid/graphics/BitmapRegionDecoder;->decodeRegion(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Lg0/h1;

    const/4 v0, 0x1

    const-string v1, "Failed to decode JPEG."

    invoke-direct {p2, v0, v1, p1}, Lg0/h1;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method
