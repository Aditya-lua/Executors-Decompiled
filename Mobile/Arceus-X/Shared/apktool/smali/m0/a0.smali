.class public Lm0/a0;
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
        "Landroidx/camera/core/d;",
        ">;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lx0/b0;)Landroid/graphics/Bitmap;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/b0<",
            "Landroidx/camera/core/d;",
            ">;)",
            "Landroid/graphics/Bitmap;"
        }
    .end annotation

    const/16 v0, 0x23

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p1}, Lx0/b0;->e()I

    move-result v3

    if-ne v3, v0, :cond_4

    invoke-virtual {p1}, Lx0/b0;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/d;

    invoke-virtual {p1}, Lx0/b0;->f()I

    move-result v4

    rem-int/lit16 v4, v4, 0xb4

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    move v4, v1

    :goto_0
    if-eqz v4, :cond_1

    invoke-interface {v3}, Landroidx/camera/core/d;->getHeight()I

    move-result v6

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_7

    :catch_0
    move-exception v3

    goto/16 :goto_5

    :cond_1
    invoke-interface {v3}, Landroidx/camera/core/d;->getWidth()I

    move-result v6

    :goto_1
    if-eqz v4, :cond_2

    invoke-interface {v3}, Landroidx/camera/core/d;->getWidth()I

    move-result v4

    goto :goto_2

    :cond_2
    invoke-interface {v3}, Landroidx/camera/core/d;->getHeight()I

    move-result v4

    :goto_2
    new-instance v7, Landroidx/camera/core/f;

    const/4 v8, 0x2

    invoke-static {v6, v4, v5, v8}, Lg0/n1;->a(IIII)Ln0/j2;

    move-result-object v4

    invoke-direct {v7, v4}, Landroidx/camera/core/f;-><init>(Ln0/j2;)V
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v3}, Landroidx/camera/core/d;->getWidth()I

    move-result v4

    invoke-interface {v3}, Landroidx/camera/core/d;->getHeight()I

    move-result v5

    mul-int/2addr v4, v5

    mul-int/lit8 v4, v4, 0x4

    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-virtual {p1}, Lx0/b0;->f()I

    move-result v5

    invoke-static {v3, v7, v4, v5, v1}, Landroidx/camera/core/ImageProcessingUtil;->g(Landroidx/camera/core/d;Ln0/j2;Ljava/nio/ByteBuffer;IZ)Landroidx/camera/core/d;

    move-result-object v4

    invoke-interface {v3}, Landroidx/camera/core/d;->close()V

    if-eqz v4, :cond_3

    invoke-static {v4}, Lw0/b;->b(Landroidx/camera/core/d;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-interface {v4}, Landroidx/camera/core/d;->close()V

    goto :goto_4

    :catchall_1
    move-exception p1

    move-object v2, v7

    goto/16 :goto_7

    :catch_1
    move-exception v3

    move-object v2, v7

    goto :goto_5

    :cond_3
    new-instance v3, Lg0/h1;

    const-string v4, "Can\'t covert YUV to RGB"

    invoke-direct {v3, v1, v4, v2}, Lg0/h1;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    throw v3
    :try_end_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_4
    const/16 v4, 0x100

    if-eq v3, v4, :cond_6

    const/16 v4, 0x1005

    if-ne v3, v4, :cond_5

    goto :goto_3

    :cond_5
    :try_start_2
    new-instance v3, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Invalid postview image format : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lx0/b0;->e()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_6
    :goto_3
    invoke-virtual {p1}, Lx0/b0;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/d;

    invoke-static {v3}, Lw0/b;->b(Landroidx/camera/core/d;)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-interface {v3}, Landroidx/camera/core/d;->close()V

    invoke-virtual {p1}, Lx0/b0;->f()I

    move-result v3

    invoke-static {v4, v3}, Lw0/b;->m(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v7, v2

    move-object v2, p1

    :goto_4
    if-eqz v7, :cond_7

    invoke-virtual {v7}, Landroidx/camera/core/f;->close()V

    :cond_7
    return-object v2

    :goto_5
    :try_start_3
    invoke-virtual {p1}, Lx0/b0;->e()I

    move-result p1

    if-ne p1, v0, :cond_8

    const-string p1, "YUV"

    goto :goto_6

    :cond_8
    const-string p1, "JPEG"

    :goto_6
    new-instance v0, Lg0/h1;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Can\'t convert "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " to bitmap"

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1, v3}, Lg0/h1;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_7
    if-eqz v2, :cond_9

    invoke-virtual {v2}, Landroidx/camera/core/f;->close()V

    :cond_9
    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx0/b0;

    invoke-virtual {p0, p1}, Lm0/a0;->a(Lx0/b0;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method
