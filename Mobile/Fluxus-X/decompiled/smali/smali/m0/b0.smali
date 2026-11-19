.class public final Lm0/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/a0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm0/b0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lx0/a0<",
        "Lm0/b0$a;",
        "Lx0/b0<",
        "[B>;>;"
    }
.end annotation


# instance fields
.field public final a:Lv0/d;


# direct methods
.method public constructor <init>(Ln0/k3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lv0/d;

    invoke-direct {v0, p1}, Lv0/d;-><init>(Ln0/k3;)V

    iput-object v0, p0, Lm0/b0;->a:Lv0/d;

    return-void
.end method

.method public static b([B)Lp0/g;
    .locals 3

    :try_start_0
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-static {v0}, Lp0/g;->k(Ljava/io/InputStream;)Lp0/g;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Lg0/h1;

    const/4 v1, 0x0

    const-string v2, "Failed to extract Exif from YUV-generated JPEG"

    invoke-direct {v0, v1, v2, p0}, Lg0/h1;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public a(Lm0/b0$a;)Lx0/b0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm0/b0$a;",
            ")",
            "Lx0/b0<",
            "[B>;"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p1}, Lm0/b0$a;->b()Lx0/b0;

    move-result-object v0

    invoke-virtual {v0}, Lx0/b0;->e()I

    move-result v0

    const/16 v1, 0x23

    if-eq v0, v1, :cond_2

    const/16 v1, 0x100

    if-eq v0, v1, :cond_1

    const/16 v1, 0x1005

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected format: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_0
    invoke-virtual {p0, p1, v0}, Lm0/b0;->c(Lm0/b0$a;I)Lx0/b0;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-virtual {p1}, Lm0/b0$a;->b()Lx0/b0;

    move-result-object p1

    invoke-virtual {p1}, Lx0/b0;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/d;

    invoke-interface {p1}, Landroidx/camera/core/d;->close()V

    return-object v0

    :cond_2
    :try_start_1
    invoke-virtual {p0, p1}, Lm0/b0;->d(Lm0/b0$a;)Lx0/b0;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :goto_2
    invoke-virtual {p1}, Lm0/b0$a;->b()Lx0/b0;

    move-result-object p1

    invoke-virtual {p1}, Lx0/b0;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/core/d;

    invoke-interface {p1}, Landroidx/camera/core/d;->close()V

    throw v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm0/b0$a;

    invoke-virtual {p0, p1}, Lm0/b0;->a(Lm0/b0$a;)Lx0/b0;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lm0/b0$a;I)Lx0/b0;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm0/b0$a;",
            "I)",
            "Lx0/b0<",
            "[B>;"
        }
    .end annotation

    invoke-virtual {p1}, Lm0/b0$a;->b()Lx0/b0;

    move-result-object p1

    iget-object v0, p0, Lm0/b0;->a:Lv0/d;

    invoke-virtual {p1}, Lx0/b0;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/d;

    invoke-virtual {v0, v1}, Lv0/d;->a(Landroidx/camera/core/d;)[B

    move-result-object v2

    invoke-virtual {p1}, Lx0/b0;->d()Lp0/g;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lx0/b0;->h()Landroid/util/Size;

    move-result-object v5

    invoke-virtual {p1}, Lx0/b0;->b()Landroid/graphics/Rect;

    move-result-object v6

    invoke-virtual {p1}, Lx0/b0;->f()I

    move-result v7

    invoke-virtual {p1}, Lx0/b0;->g()Landroid/graphics/Matrix;

    move-result-object v8

    invoke-virtual {p1}, Lx0/b0;->a()Ln0/e0;

    move-result-object v9

    move v4, p2

    invoke-static/range {v2 .. v9}, Lx0/b0;->m([BLp0/g;ILandroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Ln0/e0;)Lx0/b0;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lm0/b0$a;)Lx0/b0;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm0/b0$a;",
            ")",
            "Lx0/b0<",
            "[B>;"
        }
    .end annotation

    invoke-virtual {p1}, Lm0/b0$a;->b()Lx0/b0;

    move-result-object v0

    invoke-virtual {v0}, Lx0/b0;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/d;

    invoke-virtual {v0}, Lx0/b0;->b()Landroid/graphics/Rect;

    move-result-object v2

    :try_start_0
    invoke-virtual {p1}, Lm0/b0$a;->a()I

    move-result p1

    invoke-virtual {v0}, Lx0/b0;->f()I

    move-result v3

    invoke-static {v1, v2, p1, v3}, Lw0/b;->n(Landroidx/camera/core/d;Landroid/graphics/Rect;II)[B

    move-result-object v4
    :try_end_0
    .catch Lw0/b$a; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {v4}, Lm0/b0;->b([B)Lp0/g;

    move-result-object v5

    new-instance v7, Landroid/util/Size;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result p1

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v1

    invoke-direct {v7, p1, v1}, Landroid/util/Size;-><init>(II)V

    new-instance v8, Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result p1

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v1

    const/4 v3, 0x0

    invoke-direct {v8, v3, v3, p1, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {v0}, Lx0/b0;->f()I

    move-result v9

    invoke-virtual {v0}, Lx0/b0;->g()Landroid/graphics/Matrix;

    move-result-object p1

    invoke-static {p1, v2}, Lp0/a0;->v(Landroid/graphics/Matrix;Landroid/graphics/Rect;)Landroid/graphics/Matrix;

    move-result-object v10

    invoke-virtual {v0}, Lx0/b0;->a()Ln0/e0;

    move-result-object v11

    const/16 v6, 0x100

    invoke-static/range {v4 .. v11}, Lx0/b0;->m([BLp0/g;ILandroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Ln0/e0;)Lx0/b0;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception v0

    move-object p1, v0

    new-instance v0, Lg0/h1;

    const/4 v1, 0x1

    const-string v2, "Failed to encode the image to JPEG."

    invoke-direct {v0, v1, v2, p1}, Lg0/h1;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
