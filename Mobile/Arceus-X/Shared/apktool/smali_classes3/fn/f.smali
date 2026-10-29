.class public final Lfn/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ-\u0010\u000f\u001a\u00020\u000e2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J?\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lfn/f;",
        "",
        "<init>",
        "()V",
        "",
        "Landroid/media/Image$Plane;",
        "yuv420888planes",
        "",
        "width",
        "height",
        "Ljava/nio/ByteBuffer;",
        "c",
        "([Landroid/media/Image$Plane;II)Ljava/nio/ByteBuffer;",
        "planes",
        "",
        "a",
        "([Landroid/media/Image$Plane;II)Z",
        "plane",
        "",
        "out",
        "offset",
        "pixelStride",
        "",
        "b",
        "(Landroid/media/Image$Plane;II[BII)V",
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
.field public static final a:Lfn/f;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfn/f;

    invoke-direct {v0}, Lfn/f;-><init>()V

    sput-object v0, Lfn/f;->a:Lfn/f;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a([Landroid/media/Image$Plane;II)Z
    .locals 6

    mul-int/2addr p2, p3

    const/4 p3, 0x1

    aget-object v0, p1, p3

    invoke-virtual {v0}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x2

    aget-object p1, p1, v1

    invoke-virtual {p1}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v2

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v3

    add-int/lit8 v4, v2, 0x1

    const/4 v5, 0x0

    :try_start_0
    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    add-int/lit8 v4, v3, -0x1

    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v4

    mul-int/2addr p2, v1

    div-int/lit8 p2, p2, 0x4

    sub-int/2addr p2, v1

    if-ne v4, p2, :cond_0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->compareTo(Ljava/nio/ByteBuffer;)I

    move-result p2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    move p3, v5

    :goto_0
    move v5, p3

    :catch_0
    :try_start_1
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return v5
.end method

.method public final b(Landroid/media/Image$Plane;II[BII)V
    .locals 7

    invoke-virtual {p1}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v1

    invoke-virtual {p1}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p1}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v2

    div-int/2addr v1, v2

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    div-int/2addr p3, v1

    div-int/2addr p2, p3

    const/4 p3, 0x0

    move v2, p3

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_2

    move v4, p3

    move v5, v3

    :goto_1
    if-ge v4, p2, :cond_1

    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v6

    aput-byte v6, p4, p5

    add-int/2addr p5, p6

    invoke-virtual {p1}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v6

    add-int/2addr v5, v6

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    return-void
.end method

.method public final c([Landroid/media/Image$Plane;II)Ljava/nio/ByteBuffer;
    .locals 15
    .param p1    # [Landroid/media/Image$Plane;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "yuv420888planes"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    mul-int v7, p2, p3

    div-int/lit8 v1, v7, 0x4

    const/4 v2, 0x2

    mul-int/2addr v1, v2

    add-int/2addr v1, v7

    new-array v12, v1, [B

    invoke-virtual/range {p0 .. p3}, Lfn/f;->a([Landroid/media/Image$Plane;II)Z

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_0

    aget-object v1, v0, v3

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    aget-object v1, v0, v3

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1, v12, v3, v7}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    aget-object v1, v0, v4

    invoke-virtual {v1}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v1

    aget-object v0, v0, v2

    invoke-virtual {v0}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v12, v7, v4}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    add-int/lit8 v0, v7, 0x1

    mul-int/2addr v7, v2

    div-int/lit8 v7, v7, 0x4

    sub-int/2addr v7, v4

    invoke-virtual {v1, v12, v0, v7}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    goto :goto_0

    :cond_0
    aget-object v9, v0, v3

    const/4 v13, 0x0

    const/4 v14, 0x1

    move-object v8, p0

    move/from16 v10, p2

    move/from16 v11, p3

    invoke-virtual/range {v8 .. v14}, Lfn/f;->b(Landroid/media/Image$Plane;II[BII)V

    aget-object v9, v0, v4

    add-int/lit8 v13, v7, 0x1

    const/4 v14, 0x2

    invoke-virtual/range {v8 .. v14}, Lfn/f;->b(Landroid/media/Image$Plane;II[BII)V

    aget-object v3, v0, v2

    const/4 v8, 0x2

    move-object v2, p0

    move/from16 v4, p2

    move/from16 v5, p3

    move-object v6, v12

    invoke-virtual/range {v2 .. v8}, Lfn/f;->b(Landroid/media/Image$Plane;II[BII)V

    :goto_0
    invoke-static {v12}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "wrap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
