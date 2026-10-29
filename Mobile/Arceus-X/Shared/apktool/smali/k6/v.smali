.class public final Lk6/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\'\u0010\n\u001a\u00020\u0000*\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a)\u0010\u000e\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0011\u0010\u0011\u001a\u00020\u0006*\u00020\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u0019\u0010\u0015\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016*\n\u0010\u0017\"\u00020\u00002\u00020\u0000*\n\u0010\u0019\"\u00020\u00182\u00020\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Landroid/graphics/Bitmap;",
        "",
        "shareable",
        "Lk6/a;",
        "b",
        "(Landroid/graphics/Bitmap;Z)Lk6/a;",
        "Lk6/n;",
        "",
        "width",
        "height",
        "e",
        "(Lk6/n;II)Landroid/graphics/Bitmap;",
        "Landroid/graphics/Bitmap$Config;",
        "config",
        "f",
        "(Lk6/n;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;",
        "Landroid/graphics/drawable/Drawable;",
        "c",
        "(Landroid/graphics/drawable/Drawable;)Lk6/n;",
        "Landroid/content/res/Resources;",
        "resources",
        "a",
        "(Lk6/n;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;",
        "Bitmap",
        "Landroid/graphics/Canvas;",
        "Canvas",
        "coil-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lk6/n;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 1
    .param p0    # Lk6/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    instance-of v0, p0, Lk6/i;

    if-eqz v0, :cond_0

    check-cast p0, Lk6/i;

    invoke-virtual {p0}, Lk6/i;->c()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Lk6/a;

    if-eqz v0, :cond_1

    check-cast p0, Lk6/a;

    invoke-virtual {p0}, Lk6/a;->c()Landroid/graphics/Bitmap;

    move-result-object p0

    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v0, p1, p0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    return-object v0

    :cond_1
    new-instance p1, Lk6/o;

    invoke-direct {p1, p0}, Lk6/o;-><init>(Lk6/n;)V

    return-object p1
.end method

.method public static final b(Landroid/graphics/Bitmap;Z)Lk6/a;
    .locals 1
    .param p0    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lk6/a;

    invoke-direct {v0, p0, p1}, Lk6/a;-><init>(Landroid/graphics/Bitmap;Z)V

    return-object v0
.end method

.method public static final c(Landroid/graphics/drawable/Drawable;)Lk6/n;
    .locals 3
    .param p0    # Landroid/graphics/drawable/Drawable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    instance-of v0, p0, Landroid/graphics/drawable/BitmapDrawable;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p0

    const/4 v0, 0x1

    const/4 v2, 0x0

    invoke-static {p0, v1, v0, v2}, Lk6/v;->d(Landroid/graphics/Bitmap;ZILjava/lang/Object;)Lk6/a;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lk6/i;

    invoke-direct {v0, p0, v1}, Lk6/i;-><init>(Landroid/graphics/drawable/Drawable;Z)V

    return-object v0
.end method

.method public static synthetic d(Landroid/graphics/Bitmap;ZILjava/lang/Object;)Lk6/a;
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-static {p0, p1}, Lk6/v;->b(Landroid/graphics/Bitmap;Z)Lk6/a;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lk6/n;II)Landroid/graphics/Bitmap;
    .locals 1
    .param p0    # Lk6/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    instance-of v0, p0, Lk6/a;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lk6/a;

    invoke-virtual {v0}, Lk6/a;->c()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :cond_1
    invoke-static {p0, p1, p2, v0}, Lk6/v;->f(Lk6/n;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lk6/n;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 2
    .param p0    # Lk6/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Bitmap$Config;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    instance-of v0, p0, Lk6/a;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lk6/a;

    invoke-virtual {v0}, Lk6/a;->c()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    if-ne v1, p1, :cond_0

    invoke-virtual {v0}, Lk6/a;->c()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    if-ne v1, p2, :cond_0

    invoke-virtual {v0}, Lk6/a;->c()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v1

    if-ne v1, p3, :cond_0

    invoke-virtual {v0}, Lk6/a;->c()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    new-instance p2, Landroid/graphics/Canvas;

    invoke-direct {p2, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-interface {p0, p2}, Lk6/n;->b(Landroid/graphics/Canvas;)V

    return-object p1
.end method

.method public static synthetic g(Lk6/n;IIILjava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    invoke-interface {p0}, Lk6/n;->getWidth()I

    move-result p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    invoke-interface {p0}, Lk6/n;->getHeight()I

    move-result p2

    :cond_1
    invoke-static {p0, p1, p2}, Lk6/v;->e(Lk6/n;II)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method
