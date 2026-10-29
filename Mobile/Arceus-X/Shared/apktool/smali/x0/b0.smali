.class public abstract Lx0/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static j(Landroid/graphics/Bitmap;Lp0/g;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Ln0/e0;)Lx0/b0;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lp0/g;",
            "Landroid/graphics/Rect;",
            "I",
            "Landroid/graphics/Matrix;",
            "Ln0/e0;",
            ")",
            "Lx0/b0<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    new-instance v0, Lx0/b;

    new-instance v4, Landroid/util/Size;

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-direct {v4, v1, v2}, Landroid/util/Size;-><init>(II)V

    const/16 v3, 0x2a

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    move v6, p3

    move-object v7, p4

    move-object v8, p5

    invoke-direct/range {v0 .. v8}, Lx0/b;-><init>(Ljava/lang/Object;Lp0/g;ILandroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Ln0/e0;)V

    return-object v0
.end method

.method public static k(Landroidx/camera/core/d;Lp0/g;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Ln0/e0;)Lx0/b0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/d;",
            "Lp0/g;",
            "Landroid/graphics/Rect;",
            "I",
            "Landroid/graphics/Matrix;",
            "Ln0/e0;",
            ")",
            "Lx0/b0<",
            "Landroidx/camera/core/d;",
            ">;"
        }
    .end annotation

    new-instance v2, Landroid/util/Size;

    invoke-interface {p0}, Landroidx/camera/core/d;->getWidth()I

    move-result v0

    invoke-interface {p0}, Landroidx/camera/core/d;->getHeight()I

    move-result v1

    invoke-direct {v2, v0, v1}, Landroid/util/Size;-><init>(II)V

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-static/range {v0 .. v6}, Lx0/b0;->l(Landroidx/camera/core/d;Lp0/g;Landroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Ln0/e0;)Lx0/b0;

    move-result-object p0

    return-object p0
.end method

.method public static l(Landroidx/camera/core/d;Lp0/g;Landroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Ln0/e0;)Lx0/b0;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/d;",
            "Lp0/g;",
            "Landroid/util/Size;",
            "Landroid/graphics/Rect;",
            "I",
            "Landroid/graphics/Matrix;",
            "Ln0/e0;",
            ")",
            "Lx0/b0<",
            "Landroidx/camera/core/d;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Landroidx/camera/core/d;->getFormat()I

    move-result v0

    invoke-static {v0}, Lw0/b;->j(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "JPEG image must have Exif."

    invoke-static {p1, v0}, Lx2/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    new-instance v1, Lx0/b;

    invoke-interface {p0}, Landroidx/camera/core/d;->getFormat()I

    move-result v4

    move-object v2, p0

    move-object v3, p1

    move-object v5, p2

    move-object v6, p3

    move v7, p4

    move-object v8, p5

    move-object/from16 v9, p6

    invoke-direct/range {v1 .. v9}, Lx0/b;-><init>(Ljava/lang/Object;Lp0/g;ILandroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Ln0/e0;)V

    return-object v1
.end method

.method public static m([BLp0/g;ILandroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Ln0/e0;)Lx0/b0;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Lp0/g;",
            "I",
            "Landroid/util/Size;",
            "Landroid/graphics/Rect;",
            "I",
            "Landroid/graphics/Matrix;",
            "Ln0/e0;",
            ")",
            "Lx0/b0<",
            "[B>;"
        }
    .end annotation

    new-instance v0, Lx0/b;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lx0/b;-><init>(Ljava/lang/Object;Lp0/g;ILandroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Ln0/e0;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Ln0/e0;
.end method

.method public abstract b()Landroid/graphics/Rect;
.end method

.method public abstract c()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public abstract d()Lp0/g;
.end method

.method public abstract e()I
.end method

.method public abstract f()I
.end method

.method public abstract g()Landroid/graphics/Matrix;
.end method

.method public abstract h()Landroid/util/Size;
.end method

.method public i()Z
    .locals 2

    invoke-virtual {p0}, Lx0/b0;->b()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p0}, Lx0/b0;->h()Landroid/util/Size;

    move-result-object v1

    invoke-static {v0, v1}, Lp0/a0;->h(Landroid/graphics/Rect;Landroid/util/Size;)Z

    move-result v0

    return v0
.end method
