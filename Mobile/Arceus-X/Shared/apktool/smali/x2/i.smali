.class public Lx2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx2/i$a;
    }
.end annotation


# direct methods
.method public static a(IFLandroid/util/DisplayMetrics;)F
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1, p2}, Lx2/i$a;->a(IFLandroid/util/DisplayMetrics;)F

    move-result p0

    return p0

    :cond_0
    if-eqz p0, :cond_b

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p0, v0, :cond_9

    const/4 v0, 0x2

    if-eq p0, v0, :cond_7

    const/4 v0, 0x3

    if-eq p0, v0, :cond_5

    const/4 v0, 0x4

    if-eq p0, v0, :cond_3

    const/4 v0, 0x5

    if-ne p0, v0, :cond_2

    iget p0, p2, Landroid/util/DisplayMetrics;->xdpi:F

    cmpl-float p2, p0, v1

    if-nez p2, :cond_1

    return v1

    :cond_1
    div-float/2addr p1, p0

    const p0, 0x3d214285

    :goto_0
    div-float/2addr p1, p0

    return p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid unitToConvertTo "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget p0, p2, Landroid/util/DisplayMetrics;->xdpi:F

    cmpl-float p2, p0, v1

    if-nez p2, :cond_4

    return v1

    :cond_4
    div-float/2addr p1, p0

    return p1

    :cond_5
    iget p0, p2, Landroid/util/DisplayMetrics;->xdpi:F

    cmpl-float p2, p0, v1

    if-nez p2, :cond_6

    return v1

    :cond_6
    div-float/2addr p1, p0

    const p0, 0x3c638e39

    goto :goto_0

    :cond_7
    iget p0, p2, Landroid/util/DisplayMetrics;->scaledDensity:F

    cmpl-float p2, p0, v1

    if-nez p2, :cond_8

    return v1

    :cond_8
    div-float/2addr p1, p0

    return p1

    :cond_9
    iget p0, p2, Landroid/util/DisplayMetrics;->density:F

    cmpl-float p2, p0, v1

    if-nez p2, :cond_a

    return v1

    :cond_a
    div-float/2addr p1, p0

    :cond_b
    return p1
.end method

.method public static b(I)I
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    and-int/lit8 p0, p0, 0xf

    return p0
.end method

.method public static c(FLandroid/util/DisplayMetrics;)F
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0, p0, p1}, Lx2/i;->a(IFLandroid/util/DisplayMetrics;)F

    move-result p0

    return p0
.end method
