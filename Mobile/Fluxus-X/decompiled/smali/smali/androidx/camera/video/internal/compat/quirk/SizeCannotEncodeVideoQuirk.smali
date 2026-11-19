.class public Landroidx/camera/video/internal/compat/quirk/SizeCannotEncodeVideoQuirk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/g3;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static h()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    invoke-static {}, Landroidx/camera/video/internal/compat/quirk/SizeCannotEncodeVideoQuirk;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/HashSet;

    new-instance v1, Landroid/util/Size;

    const/16 v2, 0x2d0

    const/16 v3, 0x500

    invoke-direct {v1, v2, v3}, Landroid/util/Size;-><init>(II)V

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object v0

    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    return-object v0
.end method

.method private static i()Z
    .locals 2

    const-string v0, "motorola"

    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "moto c"

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static k()Z
    .locals 1

    invoke-static {}, Landroidx/camera/video/internal/compat/quirk/SizeCannotEncodeVideoQuirk;->i()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public g(Landroid/graphics/Rect;ILm1/r1;)Landroid/graphics/Rect;
    .locals 1

    invoke-static {p1}, Lp0/a0;->m(Landroid/graphics/Rect;)Landroid/util/Size;

    move-result-object v0

    invoke-static {v0, p2}, Lp0/a0;->q(Landroid/util/Size;I)Landroid/util/Size;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroidx/camera/video/internal/compat/quirk/SizeCannotEncodeVideoQuirk;->j(Landroid/util/Size;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    if-eqz p3, :cond_1

    invoke-interface {p3}, Lm1/r1;->c()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    goto :goto_0

    :cond_1
    const/16 p3, 0x8

    :goto_0
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result p1

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p2

    if-ne p1, p2, :cond_2

    iget p1, v0, Landroid/graphics/Rect;->left:I

    add-int/2addr p1, p3

    iput p1, v0, Landroid/graphics/Rect;->left:I

    iget p1, v0, Landroid/graphics/Rect;->right:I

    sub-int/2addr p1, p3

    iput p1, v0, Landroid/graphics/Rect;->right:I

    return-object v0

    :cond_2
    iget p1, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr p1, p3

    iput p1, v0, Landroid/graphics/Rect;->top:I

    iget p1, v0, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p1, p3

    iput p1, v0, Landroid/graphics/Rect;->bottom:I

    return-object v0
.end method

.method public j(Landroid/util/Size;)Z
    .locals 1

    invoke-static {}, Landroidx/camera/video/internal/compat/quirk/SizeCannotEncodeVideoQuirk;->h()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
