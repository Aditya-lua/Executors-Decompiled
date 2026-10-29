.class public Ljk/b;
.super Lc7/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljk/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0016\u0018\u0000 \u00122\u00020\u0001:\u0001\u000cB\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0011\u001a\u00020\u000e8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000f\u001a\u0004\u0008\u000c\u0010\u0010\u00a8\u0006\u0013"
    }
    d2 = {
        "Ljk/b;",
        "Lc7/c;",
        "",
        "aspectRatio",
        "<init>",
        "(F)V",
        "Landroid/graphics/Bitmap;",
        "input",
        "Ly6/g;",
        "size",
        "b",
        "(Landroid/graphics/Bitmap;Ly6/g;Lnt/b;)Ljava/lang/Object;",
        "a",
        "F",
        "",
        "Ljava/lang/String;",
        "()Ljava/lang/String;",
        "cacheKey",
        "c",
        "NativeShell_googleProdRelease"
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
.field public static final c:Ljk/b$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:F

.field public final b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljk/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljk/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ljk/b;->c:Ljk/b$a;

    return-void
.end method

.method public constructor <init>(F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc7/c;-><init>()V

    .line 2
    iput p1, p0, Ljk/b;->a:F

    .line 3
    const-string p1, "RectangleCropTransformation"

    iput-object p1, p0, Ljk/b;->b:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const p1, 0x3fe38e39

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Ljk/b;-><init>(F)V

    return-void
.end method

.method public static synthetic c(Ljk/b;Landroid/graphics/Bitmap;Ly6/g;Lnt/b;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljk/b;",
            "Landroid/graphics/Bitmap;",
            "Ly6/g;",
            "Lnt/b<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p3

    if-lez p2, :cond_2

    if-gtz p3, :cond_0

    goto :goto_0

    :cond_0
    int-to-float v0, p2

    int-to-float v1, p3

    div-float v2, v0, v1

    iget p0, p0, Ljk/b;->a:F

    cmpl-float v2, v2, p0

    const-string v3, "let(...)"

    const/4 v4, 0x0

    if-lez v2, :cond_1

    mul-float/2addr v1, p0

    float-to-int p0, v1

    sub-int/2addr p2, p0

    div-int/lit8 p2, p2, 0x2

    invoke-static {p1, p2, v4, p0, p3}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_1
    div-float/2addr v0, p0

    float-to-int p0, v0

    sub-int/2addr p3, p0

    div-int/lit8 p3, p3, 0x2

    invoke-static {p1, v4, p3, p2, p0}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_2
    :goto_0
    return-object p1
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Ljk/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b(Landroid/graphics/Bitmap;Ly6/g;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ly6/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Ly6/g;",
            "Lnt/b<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1, p2, p3}, Ljk/b;->c(Ljk/b;Landroid/graphics/Bitmap;Ly6/g;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
