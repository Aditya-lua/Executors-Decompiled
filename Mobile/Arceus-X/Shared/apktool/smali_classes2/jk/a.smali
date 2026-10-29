.class public final Ljk/a;
.super Lc7/c;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J \u0010\u000c\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0096@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00138\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u0014\u001a\u0004\u0008\u0010\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Ljk/a;",
        "Lc7/c;",
        "Landroid/content/Context;",
        "context",
        "",
        "colorAttr",
        "<init>",
        "(Landroid/content/Context;I)V",
        "Landroid/graphics/Bitmap;",
        "input",
        "Ly6/g;",
        "size",
        "b",
        "(Landroid/graphics/Bitmap;Ly6/g;Lnt/b;)Ljava/lang/Object;",
        "c",
        "()I",
        "a",
        "Landroid/content/Context;",
        "I",
        "",
        "Ljava/lang/String;",
        "()Ljava/lang/String;",
        "cacheKey",
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


# instance fields
.field public final a:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:I

.field public final c:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lc7/c;-><init>()V

    .line 2
    iput-object p1, p0, Ljk/a;->a:Landroid/content/Context;

    .line 3
    iput p2, p0, Ljk/a;->b:I

    .line 4
    const-string p1, "FillTransparentBackgroundTransformation"

    iput-object p1, p0, Ljk/a;->c:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const p2, 0x1010054

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Ljk/a;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Ljk/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b(Landroid/graphics/Bitmap;Ly6/g;Lnt/b;)Ljava/lang/Object;
    .locals 2
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

    invoke-virtual {p0}, Ljk/a;->c()I

    move-result p2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p3, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p3

    const-string v0, "createBitmap(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, p3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, p2}, Landroid/graphics/Canvas;->drawColor(I)V

    const/4 p2, 0x0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, p2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    return-object p3
.end method

.method public final c()I
    .locals 4

    :try_start_0
    sget-object v0, Ljt/n;->b:Ljt/n$a;

    iget-object v0, p0, Ljk/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v0, v0, 0x30

    const/16 v1, 0x10

    const v2, 0x106000f

    const/16 v3, 0x22

    if-eq v0, v1, :cond_2

    const/16 v1, 0x20

    if-eq v0, v1, :cond_0

    const-string v0, "Unable to get system theme. Falling back to system light background"

    invoke-static {v0}, Lgk/q;->d(Ljava/lang/String;)I

    iget-object v0, p0, Ljk/a;->a:Landroid/content/Context;

    invoke-static {v0, v2}, Ll2/b;->c(Landroid/content/Context;I)I

    move-result v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v3, :cond_1

    iget-object v0, p0, Ljk/a;->a:Landroid/content/Context;

    const v1, 0x1060095

    invoke-static {v0, v1}, Ll2/b;->c(Landroid/content/Context;I)I

    move-result v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ljk/a;->a:Landroid/content/Context;

    const v1, 0x106000e

    invoke-static {v0, v1}, Ll2/b;->c(Landroid/content/Context;I)I

    move-result v0

    goto :goto_0

    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v3, :cond_3

    iget-object v0, p0, Ljk/a;->a:Landroid/content/Context;

    const v1, 0x106006a

    invoke-static {v0, v1}, Ll2/b;->c(Landroid/content/Context;I)I

    move-result v0

    goto :goto_0

    :cond_3
    iget-object v0, p0, Ljk/a;->a:Landroid/content/Context;

    invoke-static {v0, v2}, Ll2/b;->c(Landroid/content/Context;I)I

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    sget-object v1, Ljt/n;->b:Ljt/n$a;

    invoke-static {v0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_2
    invoke-static {v0}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    instance-of v0, v1, Landroid/content/res/Resources$NotFoundException;

    const-string v2, "FillTransparentBackgroundTransformation"

    if-eqz v0, :cond_5

    const-string v0, "Error fetching system theme color"

    invoke-static {v2, v0, v1}, Lgk/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_3

    :cond_5
    const-string v0, "Unknown error occurred while fetching system theme color"

    invoke-static {v2, v0, v1}, Lgk/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_3
    const-string v0, "Falling back to white background"

    invoke-static {v2, v0}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_4
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method
