.class public Lv0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;

    invoke-static {v0}, Lu0/b;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;

    iput-object v0, p0, Lv0/c;->a:Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;

    return-void
.end method

.method public static a([B)I
    .locals 7

    const/4 v0, 0x2

    move v1, v0

    :goto_0
    add-int/lit8 v2, v1, 0x4

    array-length v3, p0

    const/4 v4, -0x1

    if-gt v2, v3, :cond_4

    aget-byte v2, p0, v1

    if-eq v2, v4, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v1, 0x2

    aget-byte v5, p0, v3

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0x8

    add-int/lit8 v6, v1, 0x3

    aget-byte v6, p0, v6

    and-int/lit16 v6, v6, 0xff

    or-int/2addr v5, v6

    if-ne v2, v4, :cond_3

    add-int/lit8 v2, v1, 0x1

    aget-byte v2, p0, v2

    const/16 v6, -0x26

    if-ne v2, v6, :cond_3

    :goto_1
    add-int/lit8 v0, v3, 0x2

    array-length v1, p0

    if-le v0, v1, :cond_1

    return v4

    :cond_1
    aget-byte v1, p0, v3

    if-ne v1, v4, :cond_2

    add-int/lit8 v1, v3, 0x1

    aget-byte v1, p0, v1

    const/16 v2, -0x27

    if-ne v1, v2, :cond_2

    return v0

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    add-int/2addr v5, v0

    add-int/2addr v1, v5

    goto :goto_0

    :cond_4
    :goto_2
    return v4
.end method


# virtual methods
.method public b([B)I
    .locals 2

    iget-object v0, p0, Lv0/c;->a:Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Landroidx/camera/core/internal/compat/quirk/LargeJpegImageQuirk;->k([B)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lv0/c;->a([B)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    return v0

    :cond_1
    array-length p1, p1

    return p1

    :cond_2
    :goto_0
    array-length p1, p1

    return p1
.end method
