.class public final Lcom/google/android/renderscript/Toolkit;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 \u00a2\u0006\u0004\u0008\u0005\u0010\u0006J:\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082 \u00a2\u0006\u0004\u0008\u0010\u0010\u0011J+\u0010\u0012\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/google/android/renderscript/Toolkit;",
        "",
        "<init>",
        "()V",
        "",
        "createNative",
        "()J",
        "nativeHandle",
        "Landroid/graphics/Bitmap;",
        "inputBitmap",
        "outputBitmap",
        "",
        "coefficients",
        "Lcom/google/android/renderscript/Range2d;",
        "restriction",
        "",
        "nativeConvolveBitmap",
        "(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[FLcom/google/android/renderscript/Range2d;)V",
        "a",
        "(Landroid/graphics/Bitmap;[FLcom/google/android/renderscript/Range2d;)Landroid/graphics/Bitmap;",
        "b",
        "J",
        "renderscript-toolkit_release"
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
.field public static final a:Lcom/google/android/renderscript/Toolkit;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/renderscript/Toolkit;

    invoke-direct {v0}, Lcom/google/android/renderscript/Toolkit;-><init>()V

    sput-object v0, Lcom/google/android/renderscript/Toolkit;->a:Lcom/google/android/renderscript/Toolkit;

    :try_start_0
    const-string v1, "renderscript-toolkit"

    invoke-static {v1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    invoke-direct {v0}, Lcom/google/android/renderscript/Toolkit;->createNative()J

    move-result-wide v0

    sput-wide v0, Lcom/google/android/renderscript/Toolkit;->b:J
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Lcom/google/android/renderscript/Toolkit;Landroid/graphics/Bitmap;[FLcom/google/android/renderscript/Range2d;ILjava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/renderscript/Toolkit;->a(Landroid/graphics/Bitmap;[FLcom/google/android/renderscript/Range2d;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private final native createNative()J
.end method

.method private final native nativeConvolveBitmap(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[FLcom/google/android/renderscript/Range2d;)V
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;[FLcom/google/android/renderscript/Range2d;)Landroid/graphics/Bitmap;
    .locals 7
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [F
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/google/android/renderscript/Range2d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "inputBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coefficients"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    const/4 v1, 0x0

    const-string v2, "convolve"

    const/4 v3, 0x0

    invoke-static {v2, p1, v3, v0, v1}, Lfe/a;->c(Ljava/lang/String;Landroid/graphics/Bitmap;ZILjava/lang/Object;)V

    array-length v0, p2

    const/16 v1, 0x9

    if-eq v0, v1, :cond_1

    array-length v0, p2

    const/16 v1, 0x19

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    array-length p1, p2

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "RenderScript Toolkit convolve. Only 3x3 or 5x5 convolutions are supported. "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " coefficients provided."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    invoke-static {v2, p1, p3}, Lfe/a;->e(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/google/android/renderscript/Range2d;)V

    invoke-static {p1}, Lfe/a;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v4

    sget-wide v1, Lcom/google/android/renderscript/Toolkit;->b:J

    move-object v0, p0

    move-object v3, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Lcom/google/android/renderscript/Toolkit;->nativeConvolveBitmap(JLandroid/graphics/Bitmap;Landroid/graphics/Bitmap;[FLcom/google/android/renderscript/Range2d;)V

    return-object v4
.end method
