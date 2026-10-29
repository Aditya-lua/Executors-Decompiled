.class public final Lgn/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgn/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgn/k$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0016\n\u0002\u0008\u0006\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\nB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J(\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ!\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\r\u0010\u000eJ1\u0010\u0015\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ3\u0010 \u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010#R\u001a\u0010)\u001a\u00020%8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010&\u001a\u0004\u0008\'\u0010(\u00a8\u0006*"
    }
    d2 = {
        "Lgn/k;",
        "Lgn/e;",
        "<init>",
        "()V",
        "Lfn/z;",
        "image",
        "Landroid/graphics/Rect;",
        "viewfinderRect",
        "Ljt/n;",
        "Lgn/a;",
        "a",
        "(Lfn/z;Landroid/graphics/Rect;Lnt/b;)Ljava/lang/Object;",
        "Lcom/withpersona/sdk2/camera/ImageLightCondition;",
        "b",
        "(Lfn/z;Landroid/graphics/Rect;)Lcom/withpersona/sdk2/camera/ImageLightCondition;",
        "Ljava/nio/ByteBuffer;",
        "yPlaneBuffer",
        "",
        "imageWidth",
        "imageHeight",
        "region",
        "c",
        "(Ljava/nio/ByteBuffer;IILandroid/graphics/Rect;)Lcom/withpersona/sdk2/camera/ImageLightCondition;",
        "averageLuma",
        "",
        "f",
        "(Ljava/nio/ByteBuffer;IILandroid/graphics/Rect;)D",
        "",
        "histogram",
        "sampleSize",
        "lowerPercentile",
        "higherPercentile",
        "d",
        "([JIDD)I",
        "",
        "[B",
        "byteArr",
        "Landroid/util/Size;",
        "Landroid/util/Size;",
        "getPreferredImageSize",
        "()Landroid/util/Size;",
        "preferredImageSize",
        "camera_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final c:Lgn/k$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:[B
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Landroid/util/Size;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgn/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgn/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lgn/k;->c:Lgn/k$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x8000

    new-array v0, v0, [B

    iput-object v0, p0, Lgn/k;->a:[B

    new-instance v0, Landroid/util/Size;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Landroid/util/Size;-><init>(II)V

    iput-object v0, p0, Lgn/k;->b:Landroid/util/Size;

    return-void
.end method

.method public static synthetic e(Lgn/k;[JIDDILjava/lang/Object;)I
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    const-wide/high16 p3, 0x3ff0000000000000L    # 1.0

    :cond_0
    move-wide v3, p3

    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    const-wide p5, 0x4058c00000000000L    # 99.0

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-wide v5, p5

    invoke-virtual/range {v0 .. v6}, Lgn/k;->d([JIDD)I

    move-result p0

    return p0
.end method


# virtual methods
.method public a(Lfn/z;Landroid/graphics/Rect;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lfn/z;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfn/z;",
            "Landroid/graphics/Rect;",
            "Lnt/b<",
            "-",
            "Ljt/n<",
            "+",
            "Lgn/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lgn/k;->b(Lfn/z;Landroid/graphics/Rect;)Lcom/withpersona/sdk2/camera/ImageLightCondition;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Ljt/n;->b:Ljt/n$a;

    sget-object p1, Lgn/a$b;->a:Lgn/a$b;

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p2, Ljt/n;->b:Ljt/n$a;

    new-instance p2, Lgn/a$e;

    invoke-direct {p2, p1}, Lgn/a$e;-><init>(Lcom/withpersona/sdk2/camera/ImageLightCondition;)V

    invoke-static {p2}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lfn/z;Landroid/graphics/Rect;)Lcom/withpersona/sdk2/camera/ImageLightCondition;
    .locals 4
    .param p1    # Lfn/z;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "image"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lfn/z;->p()Landroid/media/Image;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/Image;->getWidth()I

    move-result v0

    invoke-interface {p1}, Lfn/z;->p()Landroid/media/Image;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/Image;->getHeight()I

    move-result v1

    invoke-interface {p1}, Lfn/z;->p()Landroid/media/Image;

    move-result-object p1

    invoke-virtual {p1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object p1

    const/4 v2, 0x0

    if-eqz p1, :cond_3

    const/4 v3, 0x0

    aget-object p1, p1, v3

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    if-nez p2, :cond_1

    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2, v3, v3, v0, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    :cond_1
    invoke-virtual {p1}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v3, "getBuffer(...)"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0, v1, p2}, Lgn/k;->c(Ljava/nio/ByteBuffer;IILandroid/graphics/Rect;)Lcom/withpersona/sdk2/camera/ImageLightCondition;

    move-result-object p1

    if-nez p1, :cond_2

    return-object v2

    :cond_2
    return-object p1

    :cond_3
    :goto_0
    return-object v2
.end method

.method public final c(Ljava/nio/ByteBuffer;IILandroid/graphics/Rect;)Lcom/withpersona/sdk2/camera/ImageLightCondition;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p4

    const/4 v4, 0x0

    if-eqz v2, :cond_4

    if-nez p3, :cond_0

    goto :goto_2

    :cond_0
    const/16 v5, 0x100

    new-array v5, v5, [J

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v6

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v7

    mul-int v15, v6, v7

    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v6

    const v7, 0x8000

    if-le v6, v7, :cond_1

    return-object v4

    :cond_1
    iget v4, v3, Landroid/graphics/Rect;->top:I

    iget v7, v3, Landroid/graphics/Rect;->bottom:I

    const-wide/16 v8, 0x0

    :goto_0
    if-ge v4, v7, :cond_3

    mul-int v10, v4, v2

    iget v11, v3, Landroid/graphics/Rect;->left:I

    add-int/2addr v10, v11

    invoke-virtual {v1, v10}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v10, v0, Lgn/k;->a:[B

    const/4 v11, 0x0

    invoke-virtual {v1, v10, v11, v6}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    :goto_1
    if-ge v11, v6, :cond_2

    iget-object v10, v0, Lgn/k;->a:[B

    aget-byte v10, v10, v11

    and-int/lit16 v10, v10, 0xff

    int-to-long v12, v10

    add-long/2addr v8, v12

    aget-wide v12, v5, v10

    const-wide/16 v16, 0x1

    add-long v12, v12, v16

    aput-wide v12, v5, v10

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    long-to-double v6, v8

    int-to-double v8, v15

    div-double v9, v6, v8

    double-to-int v4, v9

    invoke-virtual {v0, v1, v2, v4, v3}, Lgn/k;->f(Ljava/nio/ByteBuffer;IILandroid/graphics/Rect;)D

    move-result-wide v11

    const/16 v7, 0xc

    const/4 v8, 0x0

    const-wide/16 v3, 0x0

    move-object v1, v5

    const-wide/16 v5, 0x0

    move v2, v15

    invoke-static/range {v0 .. v8}, Lgn/k;->e(Lgn/k;[JIDDILjava/lang/Object;)I

    move-result v1

    int-to-double v0, v1

    const-wide v2, 0x406fe00000000000L    # 255.0

    div-double v13, v0, v2

    new-instance v8, Lcom/withpersona/sdk2/camera/ImageLightCondition;

    div-double/2addr v9, v2

    invoke-direct/range {v8 .. v15}, Lcom/withpersona/sdk2/camera/ImageLightCondition;-><init>(DDDI)V

    return-object v8

    :cond_4
    :goto_2
    return-object v4
.end method

.method public final d([JIDD)I
    .locals 16

    move-object/from16 v0, p1

    const/16 v1, 0x64

    int-to-double v1, v1

    div-double v3, p3, v1

    move/from16 v5, p2

    int-to-double v5, v5

    mul-double/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    move-result-wide v3

    div-double v1, p5, v1

    mul-double/2addr v1, v5

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    array-length v7, v0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    move v11, v8

    move-wide v12, v9

    :goto_0
    if-ge v11, v7, :cond_1

    aget-wide v14, v0, v11

    add-long/2addr v12, v14

    long-to-double v14, v12

    cmpl-double v14, v14, v3

    if-lez v14, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_1
    move v11, v8

    :goto_1
    sub-double/2addr v5, v1

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_4

    :goto_2
    add-int/lit8 v2, v1, -0x1

    aget-wide v3, v0, v1

    add-long/2addr v9, v3

    long-to-double v3, v9

    cmpl-double v3, v3, v5

    if-lez v3, :cond_2

    move v8, v1

    goto :goto_3

    :cond_2
    if-gez v2, :cond_3

    goto :goto_3

    :cond_3
    move v1, v2

    goto :goto_2

    :cond_4
    :goto_3
    sub-int/2addr v8, v11

    return v8
.end method

.method public final f(Ljava/nio/ByteBuffer;IILandroid/graphics/Rect;)D
    .locals 10

    invoke-virtual {p4}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p4}, Landroid/graphics/Rect;->height()I

    move-result v1

    mul-int/2addr v0, v1

    invoke-virtual {p4}, Landroid/graphics/Rect;->width()I

    move-result v1

    iget v2, p4, Landroid/graphics/Rect;->top:I

    iget v3, p4, Landroid/graphics/Rect;->bottom:I

    const-wide/16 v4, 0x0

    :goto_0
    if-ge v2, v3, :cond_1

    mul-int v6, v2, p2

    iget v7, p4, Landroid/graphics/Rect;->left:I

    add-int/2addr v6, v7

    invoke-virtual {p1, v6}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v6, p0, Lgn/k;->a:[B

    const/4 v7, 0x0

    invoke-virtual {p1, v6, v7, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    :goto_1
    if-ge v7, v1, :cond_0

    iget-object v6, p0, Lgn/k;->a:[B

    aget-byte v6, v6, v7

    and-int/lit16 v6, v6, 0xff

    sub-int/2addr v6, p3

    mul-int/2addr v6, v6

    int-to-long v8, v6

    add-long/2addr v4, v8

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    long-to-double p1, v4

    int-to-double p3, v0

    div-double/2addr p1, p3

    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p1

    const-wide/high16 p3, 0x4060000000000000L    # 128.0

    div-double/2addr p1, p3

    return-wide p1
.end method
