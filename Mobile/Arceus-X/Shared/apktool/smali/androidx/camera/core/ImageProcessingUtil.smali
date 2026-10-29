.class public final Landroidx/camera/core/ImageProcessingUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/ImageProcessingUtil$c;,
        Landroidx/camera/core/ImageProcessingUtil$a;,
        Landroidx/camera/core/ImageProcessingUtil$b;
    }
.end annotation


# static fields
.field public static a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "image_processing_util_jni"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Landroidx/camera/core/d;Landroidx/camera/core/d;Landroidx/camera/core/d;)V
    .locals 0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroidx/camera/core/d;->close()V

    :cond_0
    return-void
.end method

.method public static synthetic b(Landroidx/camera/core/d;Landroidx/camera/core/d;Landroidx/camera/core/d;)V
    .locals 0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroidx/camera/core/d;->close()V

    :cond_0
    return-void
.end method

.method public static c(Landroidx/camera/core/d;)Z
    .locals 3

    invoke-static {p0}, Landroidx/camera/core/ImageProcessingUtil;->m(Landroidx/camera/core/d;)Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "ImageProcessingUtil"

    if-nez v0, :cond_0

    const-string p0, "Unsupported format for YUV to RGB"

    invoke-static {v2, p0}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_0
    invoke-static {p0}, Landroidx/camera/core/ImageProcessingUtil;->d(Landroidx/camera/core/d;)Landroidx/camera/core/ImageProcessingUtil$c;

    move-result-object p0

    sget-object v0, Landroidx/camera/core/ImageProcessingUtil$c;->c:Landroidx/camera/core/ImageProcessingUtil$c;

    if-ne p0, v0, :cond_1

    const-string p0, "One pixel shift for YUV failure"

    invoke-static {v2, p0}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static d(Landroidx/camera/core/d;)Landroidx/camera/core/ImageProcessingUtil$c;
    .locals 13

    invoke-interface {p0}, Landroidx/camera/core/d;->getWidth()I

    move-result v8

    invoke-interface {p0}, Landroidx/camera/core/d;->getHeight()I

    move-result v9

    invoke-interface {p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Landroidx/camera/core/d$a;->l()I

    move-result v0

    invoke-interface {p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v2

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-interface {v2}, Landroidx/camera/core/d$a;->l()I

    move-result v2

    invoke-interface {p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v4

    const/4 v5, 0x2

    aget-object v4, v4, v5

    invoke-interface {v4}, Landroidx/camera/core/d$a;->l()I

    move-result v4

    invoke-interface {p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v6

    aget-object v6, v6, v1

    invoke-interface {v6}, Landroidx/camera/core/d$a;->m()I

    move-result v6

    invoke-interface {p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v7

    aget-object v7, v7, v3

    invoke-interface {v7}, Landroidx/camera/core/d$a;->m()I

    move-result v7

    invoke-interface {p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v10

    aget-object v1, v10, v1

    invoke-interface {v1}, Landroidx/camera/core/d$a;->k()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-interface {p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v10

    aget-object v3, v10, v3

    invoke-interface {v3}, Landroidx/camera/core/d$a;->k()Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-interface {p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object p0

    aget-object p0, p0, v5

    invoke-interface {p0}, Landroidx/camera/core/d$a;->k()Ljava/nio/ByteBuffer;

    move-result-object p0

    move v10, v6

    move v11, v7

    move v12, v7

    move-object v5, v1

    move v1, v0

    move-object v0, v5

    move-object v5, v3

    move v3, v2

    move-object v2, v5

    move v5, v4

    move-object v4, p0

    invoke-static/range {v0 .. v12}, Landroidx/camera/core/ImageProcessingUtil;->nativeShiftPixel(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;ILjava/nio/ByteBuffer;IIIIIIII)I

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Landroidx/camera/core/ImageProcessingUtil$c;->c:Landroidx/camera/core/ImageProcessingUtil$c;

    return-object p0

    :cond_0
    sget-object p0, Landroidx/camera/core/ImageProcessingUtil$c;->b:Landroidx/camera/core/ImageProcessingUtil$c;

    return-object p0
.end method

.method public static e(Ln0/j2;[B)Landroidx/camera/core/d;
    .locals 2

    invoke-interface {p0}, Ln0/j2;->c()I

    move-result v0

    const/16 v1, 0x100

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lx2/g;->a(Z)V

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Ln0/j2;->getSurface()Landroid/view/Surface;

    move-result-object v0

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1, v0}, Landroidx/camera/core/ImageProcessingUtil;->nativeWriteJpegToSurface([BLandroid/view/Surface;)I

    move-result p1

    const-string v0, "ImageProcessingUtil"

    if-eqz p1, :cond_1

    const-string p0, "Failed to enqueue JPEG image."

    invoke-static {v0, p0}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0

    :cond_1
    invoke-interface {p0}, Ln0/j2;->b()Landroidx/camera/core/d;

    move-result-object p0

    if-nez p0, :cond_2

    const-string p1, "Failed to get acquire JPEG image."

    invoke-static {v0, p1}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-object p0
.end method

.method public static f(Landroidx/camera/core/d;)Landroid/graphics/Bitmap;
    .locals 14

    invoke-interface {p0}, Landroidx/camera/core/d;->getFormat()I

    move-result v0

    const/16 v1, 0x23

    if-ne v0, v1, :cond_1

    invoke-interface {p0}, Landroidx/camera/core/d;->getWidth()I

    move-result v12

    invoke-interface {p0}, Landroidx/camera/core/d;->getHeight()I

    move-result v13

    invoke-interface {p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Landroidx/camera/core/d$a;->l()I

    move-result v3

    invoke-interface {p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v0

    const/4 v2, 0x1

    aget-object v0, v0, v2

    invoke-interface {v0}, Landroidx/camera/core/d$a;->l()I

    move-result v5

    invoke-interface {p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v0

    const/4 v4, 0x2

    aget-object v0, v0, v4

    invoke-interface {v0}, Landroidx/camera/core/d$a;->l()I

    move-result v7

    invoke-interface {p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v0

    aget-object v0, v0, v1

    invoke-interface {v0}, Landroidx/camera/core/d$a;->m()I

    move-result v8

    invoke-interface {p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v0

    aget-object v0, v0, v2

    invoke-interface {v0}, Landroidx/camera/core/d$a;->m()I

    move-result v9

    invoke-interface {p0}, Landroidx/camera/core/d;->getWidth()I

    move-result v0

    invoke-interface {p0}, Landroidx/camera/core/d;->getHeight()I

    move-result v6

    sget-object v10, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v6, v10}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v10

    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getRowBytes()I

    move-result v11

    invoke-interface {p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v0

    aget-object v0, v0, v1

    invoke-interface {v0}, Landroidx/camera/core/d$a;->k()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-interface {p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v1

    aget-object v1, v1, v2

    invoke-interface {v1}, Landroidx/camera/core/d$a;->k()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-interface {p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object p0

    aget-object p0, p0, v4

    invoke-interface {p0}, Landroidx/camera/core/d$a;->k()Ljava/nio/ByteBuffer;

    move-result-object v6

    move-object v2, v0

    move-object v4, v1

    invoke-static/range {v2 .. v13}, Landroidx/camera/core/ImageProcessingUtil;->nativeConvertAndroid420ToBitmap(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;ILjava/nio/ByteBuffer;IIILandroid/graphics/Bitmap;III)I

    move-result p0

    if-nez p0, :cond_0

    return-object v10

    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "YUV to RGB conversion failed"

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Input image format must be YUV_420_888"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static g(Landroidx/camera/core/d;Ln0/j2;Ljava/nio/ByteBuffer;IZ)Landroidx/camera/core/d;
    .locals 5

    invoke-static {p0}, Landroidx/camera/core/ImageProcessingUtil;->m(Landroidx/camera/core/d;)Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "ImageProcessingUtil"

    if-nez v0, :cond_0

    const-string p0, "Unsupported format for YUV to RGB"

    invoke-static {v2, p0}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {p3}, Landroidx/camera/core/ImageProcessingUtil;->l(I)Z

    move-result v0

    if-nez v0, :cond_1

    const-string p0, "Unsupported rotation degrees for rotate RGB"

    invoke-static {v2, p0}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_1
    invoke-interface {p1}, Ln0/j2;->getSurface()Landroid/view/Surface;

    move-result-object v0

    invoke-static {p0, v0, p2, p3, p4}, Landroidx/camera/core/ImageProcessingUtil;->h(Landroidx/camera/core/d;Landroid/view/Surface;Ljava/nio/ByteBuffer;IZ)Landroidx/camera/core/ImageProcessingUtil$c;

    move-result-object p2

    sget-object p3, Landroidx/camera/core/ImageProcessingUtil$c;->c:Landroidx/camera/core/ImageProcessingUtil$c;

    if-ne p2, p3, :cond_2

    const-string p0, "YUV to RGB conversion failure"

    invoke-static {v2, p0}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_2
    const-string p2, "MH"

    const/4 p3, 0x3

    invoke-static {p2, p3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_3

    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p3

    sub-long/2addr p3, v3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    sget p4, Landroidx/camera/core/ImageProcessingUtil;->a:I

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    filled-new-array {p3, p4}, [Ljava/lang/Object;

    move-result-object p3

    const-string p4, "Image processing performance profiling, duration: [%d], image count: %d"

    invoke-static {p2, p4, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v2, p2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget p2, Landroidx/camera/core/ImageProcessingUtil;->a:I

    add-int/lit8 p2, p2, 0x1

    sput p2, Landroidx/camera/core/ImageProcessingUtil;->a:I

    :cond_3
    invoke-interface {p1}, Ln0/j2;->b()Landroidx/camera/core/d;

    move-result-object p1

    if-nez p1, :cond_4

    const-string p0, "YUV to RGB acquireLatestImage failure"

    invoke-static {v2, p0}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_4
    new-instance p2, Lg0/i2;

    invoke-direct {p2, p1}, Lg0/i2;-><init>(Landroidx/camera/core/d;)V

    new-instance p3, Lg0/j1;

    invoke-direct {p3, p1, p0}, Lg0/j1;-><init>(Landroidx/camera/core/d;Landroidx/camera/core/d;)V

    invoke-virtual {p2, p3}, Landroidx/camera/core/b;->a(Landroidx/camera/core/b$a;)V

    return-object p2
.end method

.method public static h(Landroidx/camera/core/d;Landroid/view/Surface;Ljava/nio/ByteBuffer;IZ)Landroidx/camera/core/ImageProcessingUtil$c;
    .locals 17

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->getWidth()I

    move-result v11

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->getHeight()I

    move-result v12

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Landroidx/camera/core/d$a;->l()I

    move-result v2

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v0

    const/4 v3, 0x1

    aget-object v0, v0, v3

    invoke-interface {v0}, Landroidx/camera/core/d$a;->l()I

    move-result v4

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v0

    const/4 v5, 0x2

    aget-object v0, v0, v5

    invoke-interface {v0}, Landroidx/camera/core/d$a;->l()I

    move-result v6

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v0

    aget-object v0, v0, v1

    invoke-interface {v0}, Landroidx/camera/core/d$a;->m()I

    move-result v7

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v0

    aget-object v0, v0, v3

    invoke-interface {v0}, Landroidx/camera/core/d$a;->m()I

    move-result v8

    if-eqz p4, :cond_0

    move v13, v7

    goto :goto_0

    :cond_0
    move v13, v1

    :goto_0
    if-eqz p4, :cond_1

    move v14, v8

    goto :goto_1

    :cond_1
    move v14, v1

    :goto_1
    if-eqz p4, :cond_2

    move v15, v8

    goto :goto_2

    :cond_2
    move v15, v1

    :goto_2
    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v0

    aget-object v0, v0, v1

    invoke-interface {v0}, Landroidx/camera/core/d$a;->k()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v0

    aget-object v0, v0, v3

    invoke-interface {v0}, Landroidx/camera/core/d$a;->k()Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v0

    aget-object v0, v0, v5

    invoke-interface {v0}, Landroidx/camera/core/d$a;->k()Ljava/nio/ByteBuffer;

    move-result-object v5

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move/from16 v16, p3

    invoke-static/range {v1 .. v16}, Landroidx/camera/core/ImageProcessingUtil;->nativeConvertAndroid420ToABGR(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;ILjava/nio/ByteBuffer;IIILandroid/view/Surface;Ljava/nio/ByteBuffer;IIIIII)I

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Landroidx/camera/core/ImageProcessingUtil$c;->c:Landroidx/camera/core/ImageProcessingUtil$c;

    return-object v0

    :cond_3
    sget-object v0, Landroidx/camera/core/ImageProcessingUtil$c;->b:Landroidx/camera/core/ImageProcessingUtil$c;

    return-object v0
.end method

.method public static i(Landroid/graphics/Bitmap;Ljava/nio/ByteBuffer;I)V
    .locals 7

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getRowBytes()I

    move-result v2

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v3, p2

    invoke-static/range {v0 .. v6}, Landroidx/camera/core/ImageProcessingUtil;->nativeCopyBetweenByteBufferAndBitmap(Landroid/graphics/Bitmap;Ljava/nio/ByteBuffer;IIIIZ)I

    return-void
.end method

.method public static j(Landroid/graphics/Bitmap;Ljava/nio/ByteBuffer;I)V
    .locals 7

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getRowBytes()I

    move-result v3

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    const/4 v6, 0x1

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-static/range {v0 .. v6}, Landroidx/camera/core/ImageProcessingUtil;->nativeCopyBetweenByteBufferAndBitmap(Landroid/graphics/Bitmap;Ljava/nio/ByteBuffer;IIIIZ)I

    return-void
.end method

.method public static k(Landroidx/camera/core/d;)Z
    .locals 4

    invoke-interface {p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    invoke-interface {p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Landroidx/camera/core/d$a;->m()I

    move-result v0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1

    return v2

    :cond_1
    invoke-interface {p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v0

    aget-object v0, v0, v3

    invoke-interface {v0}, Landroidx/camera/core/d$a;->k()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-interface {p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object p0

    aget-object p0, p0, v1

    invoke-interface {p0}, Landroidx/camera/core/d$a;->k()Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-static {v0, p0}, Landroidx/camera/core/ImageProcessingUtil;->nativeGetYUVImageVUOff(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)I

    move-result p0

    const/4 v0, -0x1

    if-ne p0, v0, :cond_2

    return v1

    :cond_2
    return v2
.end method

.method public static l(I)Z
    .locals 1

    if-eqz p0, :cond_1

    const/16 v0, 0x5a

    if-eq p0, v0, :cond_1

    const/16 v0, 0xb4

    if-eq p0, v0, :cond_1

    const/16 v0, 0x10e

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static m(Landroidx/camera/core/d;)Z
    .locals 2

    invoke-interface {p0}, Landroidx/camera/core/d;->getFormat()I

    move-result v0

    const/16 v1, 0x23

    if-ne v0, v1, :cond_0

    invoke-interface {p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object p0

    array-length p0, p0

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static n(Landroidx/camera/core/d;Ln0/j2;Landroid/media/ImageWriter;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)Landroidx/camera/core/d;
    .locals 9

    invoke-static {p0}, Landroidx/camera/core/ImageProcessingUtil;->m(Landroidx/camera/core/d;)Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "ImageProcessingUtil"

    if-nez v0, :cond_0

    const-string p0, "Unsupported format for rotate YUV"

    invoke-static {v2, p0}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_0
    invoke-static {p6}, Landroidx/camera/core/ImageProcessingUtil;->l(I)Z

    move-result v0

    if-nez v0, :cond_1

    const-string p0, "Unsupported rotation degrees for rotate YUV"

    invoke-static {v2, p0}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_1
    sget-object v0, Landroidx/camera/core/ImageProcessingUtil$c;->c:Landroidx/camera/core/ImageProcessingUtil$c;

    if-lez p6, :cond_2

    move-object v3, p0

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    move v8, p6

    invoke-static/range {v3 .. v8}, Landroidx/camera/core/ImageProcessingUtil;->p(Landroidx/camera/core/d;Landroid/media/ImageWriter;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)Landroidx/camera/core/ImageProcessingUtil$c;

    move-result-object p0

    goto :goto_0

    :cond_2
    move-object v3, p0

    move-object p0, v0

    :goto_0
    if-ne p0, v0, :cond_3

    const-string p0, "rotate YUV failure"

    invoke-static {v2, p0}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_3
    invoke-interface {p1}, Ln0/j2;->b()Landroidx/camera/core/d;

    move-result-object p0

    if-nez p0, :cond_4

    const-string p0, "YUV rotation acquireLatestImage failure"

    invoke-static {v2, p0}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_4
    new-instance p1, Lg0/i2;

    invoke-direct {p1, p0}, Lg0/i2;-><init>(Landroidx/camera/core/d;)V

    new-instance p2, Lg0/k1;

    invoke-direct {p2, p0, v3}, Lg0/k1;-><init>(Landroidx/camera/core/d;Landroidx/camera/core/d;)V

    invoke-virtual {p1, p2}, Landroidx/camera/core/b;->a(Landroidx/camera/core/b$a;)V

    return-object p1
.end method

.method private static native nativeConvertAndroid420ToABGR(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;ILjava/nio/ByteBuffer;IIILandroid/view/Surface;Ljava/nio/ByteBuffer;IIIIII)I
.end method

.method private static native nativeConvertAndroid420ToBitmap(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;ILjava/nio/ByteBuffer;IIILandroid/graphics/Bitmap;III)I
.end method

.method private static native nativeCopyBetweenByteBufferAndBitmap(Landroid/graphics/Bitmap;Ljava/nio/ByteBuffer;IIIIZ)I
.end method

.method public static native nativeGetYUVImageVUOff(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)I
.end method

.method public static native nativeNewDirectByteBuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;
.end method

.method private static native nativeRotateYUV(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;ILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;III)I
.end method

.method private static native nativeShiftPixel(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;ILjava/nio/ByteBuffer;IIIIIIII)I
.end method

.method private static native nativeWriteJpegToSurface([BLandroid/view/Surface;)I
.end method

.method public static o(Landroidx/camera/core/d;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)Landroidx/camera/core/d;
    .locals 25

    move/from16 v7, p6

    invoke-static/range {p0 .. p0}, Landroidx/camera/core/ImageProcessingUtil;->m(Landroidx/camera/core/d;)Z

    move-result v0

    const-string v1, "ImageProcessingUtil"

    const/16 v23, 0x0

    if-nez v0, :cond_0

    const-string v0, "Unsupported format for rotate YUV"

    invoke-static {v1, v0}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-object v23

    :cond_0
    invoke-static {v7}, Landroidx/camera/core/ImageProcessingUtil;->l(I)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Unsupported rotation degrees for rotate YUV"

    invoke-static {v1, v0}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-object v23

    :cond_1
    if-nez v7, :cond_2

    invoke-static/range {p0 .. p0}, Landroidx/camera/core/ImageProcessingUtil;->k(Landroidx/camera/core/d;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-object v23

    :cond_2
    rem-int/lit16 v0, v7, 0xb4

    if-nez v0, :cond_3

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->getWidth()I

    move-result v2

    :goto_0
    move v9, v2

    goto :goto_1

    :cond_3
    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->getHeight()I

    move-result v2

    goto :goto_0

    :goto_1
    if-nez v0, :cond_4

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->getHeight()I

    move-result v0

    goto :goto_2

    :cond_4
    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->getWidth()I

    move-result v0

    :goto_2
    invoke-virtual/range {p5 .. p5}, Ljava/nio/Buffer;->capacity()I

    move-result v2

    const/4 v3, 0x1

    move-object/from16 v14, p5

    invoke-static {v14, v3, v2}, Landroidx/camera/core/ImageProcessingUtil;->nativeNewDirectByteBuffer(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;

    move-result-object v11

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v2

    const/4 v4, 0x0

    aget-object v2, v2, v4

    invoke-interface {v2}, Landroidx/camera/core/d$a;->k()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v5

    aget-object v4, v5, v4

    invoke-interface {v4}, Landroidx/camera/core/d$a;->l()I

    move-result v4

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v5

    aget-object v5, v5, v3

    invoke-interface {v5}, Landroidx/camera/core/d$a;->k()Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v6

    aget-object v3, v6, v3

    invoke-interface {v3}, Landroidx/camera/core/d$a;->l()I

    move-result v3

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v6

    const/4 v8, 0x2

    aget-object v6, v6, v8

    invoke-interface {v6}, Landroidx/camera/core/d$a;->k()Ljava/nio/ByteBuffer;

    move-result-object v6

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v10

    aget-object v10, v10, v8

    invoke-interface {v10}, Landroidx/camera/core/d$a;->l()I

    move-result v10

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v12

    aget-object v8, v12, v8

    invoke-interface {v8}, Landroidx/camera/core/d$a;->m()I

    move-result v8

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->getWidth()I

    move-result v20

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->getHeight()I

    move-result v21

    move-object v12, v1

    move-object v1, v2

    move v2, v4

    move v4, v3

    move-object v3, v5

    move-object v5, v6

    move v6, v10

    const/4 v10, 0x1

    const/4 v13, 0x2

    const/16 v16, 0x2

    move-object v15, v12

    move v12, v9

    move-object/from16 v17, v15

    move v15, v9

    move-object/from16 v18, p2

    move-object/from16 v19, p3

    move/from16 v24, v0

    move/from16 v22, v7

    move v7, v8

    move-object/from16 v0, v17

    move-object/from16 v17, p1

    move-object/from16 v8, p4

    invoke-static/range {v1 .. v22}, Landroidx/camera/core/ImageProcessingUtil;->nativeRotateYUV(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;ILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;III)I

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, "rotate YUV failure"

    invoke-static {v0, v1}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-object v23

    :cond_5
    new-instance v8, Lg0/i2;

    new-instance v0, Landroidx/camera/core/ImageProcessingUtil$a;

    move-object/from16 v1, p0

    move-object/from16 v2, p4

    move-object/from16 v4, p5

    move/from16 v7, p6

    move v5, v9

    move-object v3, v11

    move/from16 v6, v24

    invoke-direct/range {v0 .. v7}, Landroidx/camera/core/ImageProcessingUtil$a;-><init>(Landroidx/camera/core/d;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;III)V

    invoke-direct {v8, v0}, Lg0/i2;-><init>(Landroidx/camera/core/d;)V

    return-object v8
.end method

.method public static p(Landroidx/camera/core/d;Landroid/media/ImageWriter;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)Landroidx/camera/core/ImageProcessingUtil$c;
    .locals 23

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->getWidth()I

    move-result v20

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->getHeight()I

    move-result v21

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Landroidx/camera/core/d$a;->l()I

    move-result v2

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v0

    const/4 v3, 0x1

    aget-object v0, v0, v3

    invoke-interface {v0}, Landroidx/camera/core/d$a;->l()I

    move-result v4

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v0

    const/4 v5, 0x2

    aget-object v0, v0, v5

    invoke-interface {v0}, Landroidx/camera/core/d$a;->l()I

    move-result v6

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v0

    aget-object v0, v0, v3

    invoke-interface {v0}, Landroidx/camera/core/d$a;->m()I

    move-result v7

    invoke-static/range {p1 .. p1}, Lt0/a;->b(Landroid/media/ImageWriter;)Landroid/media/Image;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Landroidx/camera/core/ImageProcessingUtil$c;->c:Landroidx/camera/core/ImageProcessingUtil$c;

    return-object v0

    :cond_0
    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v8

    aget-object v8, v8, v1

    invoke-interface {v8}, Landroidx/camera/core/d$a;->k()Ljava/nio/ByteBuffer;

    move-result-object v8

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v9

    aget-object v9, v9, v3

    invoke-interface {v9}, Landroidx/camera/core/d$a;->k()Ljava/nio/ByteBuffer;

    move-result-object v9

    invoke-interface/range {p0 .. p0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v10

    aget-object v10, v10, v5

    invoke-interface {v10}, Landroidx/camera/core/d$a;->k()Ljava/nio/ByteBuffer;

    move-result-object v10

    invoke-virtual {v0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v11

    aget-object v11, v11, v1

    invoke-virtual {v11}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v11

    invoke-virtual {v0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v12

    aget-object v12, v12, v1

    invoke-virtual {v12}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v12

    invoke-virtual {v0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v13

    aget-object v1, v13, v1

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v1

    invoke-virtual {v0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v13

    aget-object v13, v13, v3

    invoke-virtual {v13}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v13

    invoke-virtual {v0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v14

    aget-object v14, v14, v3

    invoke-virtual {v14}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v14

    invoke-virtual {v0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v15

    aget-object v3, v15, v3

    invoke-virtual {v3}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v3

    invoke-virtual {v0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v15

    aget-object v15, v15, v5

    invoke-virtual {v15}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v15

    invoke-virtual {v0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v16

    aget-object v16, v16, v5

    invoke-virtual/range {v16 .. v16}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v16

    invoke-virtual {v0}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v17

    aget-object v5, v17, v5

    invoke-virtual {v5}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v5

    move-object/from16 v17, v10

    move v10, v1

    move-object v1, v8

    move-object v8, v11

    move-object v11, v13

    move v13, v3

    move-object v3, v9

    move v9, v12

    move v12, v14

    move-object v14, v15

    move/from16 v15, v16

    move/from16 v16, v5

    move-object/from16 v5, v17

    move-object/from16 v17, p2

    move-object/from16 v18, p3

    move-object/from16 v19, p4

    move/from16 v22, p5

    invoke-static/range {v1 .. v22}, Landroidx/camera/core/ImageProcessingUtil;->nativeRotateYUV(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;ILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;III)I

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, Landroidx/camera/core/ImageProcessingUtil$c;->c:Landroidx/camera/core/ImageProcessingUtil$c;

    return-object v0

    :cond_1
    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lt0/a;->d(Landroid/media/ImageWriter;Landroid/media/Image;)V

    sget-object v0, Landroidx/camera/core/ImageProcessingUtil$c;->b:Landroidx/camera/core/ImageProcessingUtil$c;

    return-object v0
.end method

.method public static q(Landroid/view/Surface;[B)Z
    .locals 0

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1, p0}, Landroidx/camera/core/ImageProcessingUtil;->nativeWriteJpegToSurface([BLandroid/view/Surface;)I

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "ImageProcessingUtil"

    const-string p1, "Failed to enqueue JPEG image."

    invoke-static {p0, p1}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method
