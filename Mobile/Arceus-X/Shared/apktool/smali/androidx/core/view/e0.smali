.class public final Landroidx/core/view/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Landroid/graphics/Point;


# direct methods
.method public constructor <init>(IIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Landroidx/core/view/e0;->a:I

    .line 3
    iput p2, p0, Landroidx/core/view/e0;->b:I

    .line 4
    new-instance p1, Landroid/graphics/Point;

    invoke-direct {p1, p3, p4}, Landroid/graphics/Point;-><init>(II)V

    iput-object p1, p0, Landroidx/core/view/e0;->c:Landroid/graphics/Point;

    return-void
.end method

.method public constructor <init>(IILandroid/graphics/Point;)V
    .locals 1

    .line 5
    iget v0, p3, Landroid/graphics/Point;->x:I

    iget p3, p3, Landroid/graphics/Point;->y:I

    invoke-direct {p0, p1, p2, v0, p3}, Landroidx/core/view/e0;-><init>(IIII)V

    return-void
.end method

.method public static f(I)I
    .locals 3

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid position: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return v0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static g(I)I
    .locals 3

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid position: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return v0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static h(Landroidx/core/view/e0;)Landroid/view/RoundedCorner;
    .locals 3

    if-eqz p0, :cond_0

    invoke-static {}, Landroidx/core/view/d0;->a()V

    invoke-virtual {p0}, Landroidx/core/view/e0;->c()I

    move-result v0

    invoke-static {v0}, Landroidx/core/view/e0;->g(I)I

    move-result v0

    invoke-virtual {p0}, Landroidx/core/view/e0;->e()I

    move-result v1

    invoke-virtual {p0}, Landroidx/core/view/e0;->a()I

    move-result v2

    invoke-virtual {p0}, Landroidx/core/view/e0;->b()I

    move-result p0

    invoke-static {v0, v1, v2, p0}, Landroidx/core/view/c0;->a(IIII)Landroid/view/RoundedCorner;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static i(Landroid/view/RoundedCorner;)Landroidx/core/view/e0;
    .locals 3

    if-eqz p0, :cond_0

    new-instance v0, Landroidx/core/view/e0;

    invoke-virtual {p0}, Landroid/view/RoundedCorner;->getPosition()I

    move-result v1

    invoke-static {v1}, Landroidx/core/view/e0;->f(I)I

    move-result v1

    invoke-virtual {p0}, Landroid/view/RoundedCorner;->getRadius()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/RoundedCorner;->getCenter()Landroid/graphics/Point;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Landroidx/core/view/e0;-><init>(IILandroid/graphics/Point;)V

    return-object v0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Landroidx/core/view/e0;->c:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    return v0
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Landroidx/core/view/e0;->c:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Landroidx/core/view/e0;->a:I

    return v0
.end method

.method public final d(I)Ljava/lang/String;
    .locals 1

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const-string p1, "Invalid"

    return-object p1

    :cond_0
    const-string p1, "BottomLeft"

    return-object p1

    :cond_1
    const-string p1, "BottomRight"

    return-object p1

    :cond_2
    const-string p1, "TopRight"

    return-object p1

    :cond_3
    const-string p1, "TopLeft"

    return-object p1
.end method

.method public e()I
    .locals 1

    iget v0, p0, Landroidx/core/view/e0;->b:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/core/view/e0;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Landroidx/core/view/e0;

    iget v1, p0, Landroidx/core/view/e0;->a:I

    iget v3, p1, Landroidx/core/view/e0;->a:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Landroidx/core/view/e0;->b:I

    iget v3, p1, Landroidx/core/view/e0;->b:I

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Landroidx/core/view/e0;->c:Landroid/graphics/Point;

    iget-object p1, p1, Landroidx/core/view/e0;->c:Landroid/graphics/Point;

    invoke-virtual {v1, p1}, Landroid/graphics/Point;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Landroidx/core/view/e0;->a:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/core/view/e0;->b:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/core/view/e0;->c:Landroid/graphics/Point;

    invoke-virtual {v1}, Landroid/graphics/Point;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RoundedCornerCompat{position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/core/view/e0;->a:I

    invoke-virtual {p0, v1}, Landroidx/core/view/e0;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", radius="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/core/view/e0;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", center="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/core/view/e0;->c:Landroid/graphics/Point;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
