.class public final Lfn/c0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfn/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfn/c0;->e(Landroid/media/Image;I)Lfn/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\t*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u000c\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u001b\u0010\u0012\u001a\u00020\r8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00048VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u000f\u001a\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u00178\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0019\u001a\u0004\u0008\u001d\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00178\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0019\u001a\u0004\u0008\u0018\u0010\u001b\u00a8\u0006 "
    }
    d2 = {
        "fn/c0$a",
        "Lfn/z;",
        "Landroid/graphics/Rect;",
        "cropRect",
        "Landroid/graphics/Bitmap;",
        "f",
        "(Landroid/graphics/Rect;)Landroid/graphics/Bitmap;",
        "Landroid/media/Image;",
        "a",
        "Landroid/media/Image;",
        "p",
        "()Landroid/media/Image;",
        "image",
        "Lcom/google/mlkit/vision/common/InputImage;",
        "b",
        "Ljt/h;",
        "g",
        "()Lcom/google/mlkit/vision/common/InputImage;",
        "inputImage",
        "c",
        "e",
        "()Landroid/graphics/Bitmap;",
        "bitmap",
        "",
        "d",
        "I",
        "getWidth",
        "()I",
        "width",
        "getHeight",
        "height",
        "rotationDegrees",
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


# instance fields
.field public final a:Landroid/media/Image;

.field public final b:Ljt/h;

.field public final c:Ljt/h;

.field public final d:I

.field public final e:I

.field public final f:I

.field public final synthetic g:Landroid/media/Image;

.field public final synthetic h:I


# direct methods
.method public constructor <init>(Landroid/media/Image;I)V
    .locals 1

    iput-object p1, p0, Lfn/c0$a;->g:Landroid/media/Image;

    iput p2, p0, Lfn/c0$a;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/c0$a;->a:Landroid/media/Image;

    new-instance v0, Lfn/a0;

    invoke-direct {v0, p1, p2}, Lfn/a0;-><init>(Landroid/media/Image;I)V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    iput-object v0, p0, Lfn/c0$a;->b:Ljt/h;

    new-instance v0, Lfn/b0;

    invoke-direct {v0, p1, p2}, Lfn/b0;-><init>(Landroid/media/Image;I)V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    iput-object v0, p0, Lfn/c0$a;->c:Ljt/h;

    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v0

    iput v0, p0, Lfn/c0$a;->d:I

    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    move-result p1

    iput p1, p0, Lfn/c0$a;->e:I

    iput p2, p0, Lfn/c0$a;->f:I

    return-void
.end method

.method public static synthetic a(Landroid/media/Image;I)Lcom/google/mlkit/vision/common/InputImage;
    .locals 0

    invoke-static {p0, p1}, Lfn/c0$a;->h(Landroid/media/Image;I)Lcom/google/mlkit/vision/common/InputImage;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/media/Image;I)Landroid/graphics/Bitmap;
    .locals 0

    invoke-static {p0, p1}, Lfn/c0$a;->c(Landroid/media/Image;I)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroid/media/Image;I)Landroid/graphics/Bitmap;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lfn/c0;->d(Landroid/media/Image;ILandroid/graphics/Rect;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Landroid/media/Image;I)Lcom/google/mlkit/vision/common/InputImage;
    .locals 0

    invoke-static {p0, p1}, Lcom/google/mlkit/vision/common/InputImage;->fromMediaImage(Landroid/media/Image;I)Lcom/google/mlkit/vision/common/InputImage;

    move-result-object p0

    const-string p1, "fromMediaImage(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public d()I
    .locals 1

    iget v0, p0, Lfn/c0$a;->f:I

    return v0
.end method

.method public e()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lfn/c0$a;->c:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public f(Landroid/graphics/Rect;)Landroid/graphics/Bitmap;
    .locals 2

    const-string v0, "cropRect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfn/c0$a;->g:Landroid/media/Image;

    iget v1, p0, Lfn/c0$a;->h:I

    invoke-static {v0, v1, p1}, Lfn/c0;->c(Landroid/media/Image;ILandroid/graphics/Rect;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public g()Lcom/google/mlkit/vision/common/InputImage;
    .locals 1

    iget-object v0, p0, Lfn/c0$a;->b:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/mlkit/vision/common/InputImage;

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    iget v0, p0, Lfn/c0$a;->e:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, Lfn/c0$a;->d:I

    return v0
.end method

.method public p()Landroid/media/Image;
    .locals 1

    iget-object v0, p0, Lfn/c0$a;->a:Landroid/media/Image;

    return-object v0
.end method
