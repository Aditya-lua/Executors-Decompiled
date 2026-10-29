.class public final synthetic Lhm/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(FLjava/lang/Object;)I
    .locals 0

    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    move-result p0

    mul-int/lit8 p0, p0, 0x1f

    invoke-static {p1}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method
