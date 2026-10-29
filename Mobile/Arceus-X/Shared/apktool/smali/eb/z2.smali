.class public final enum Leb/z2;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final enum a:Leb/z2;

.field public static final synthetic b:[Leb/z2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Leb/z2;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Leb/z2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Leb/z2;->a:Leb/z2;

    filled-new-array {v0}, [Leb/z2;

    move-result-object v0

    sput-object v0, Leb/z2;->b:[Leb/z2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    const-string p1, "INSTANCE"

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Leb/z2;
    .locals 1

    sget-object v0, Leb/z2;->b:[Leb/z2;

    invoke-virtual {v0}, [Leb/z2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Leb/z2;

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    check-cast p1, [B

    check-cast p2, [B

    array-length v0, p1

    array-length v1, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-byte v2, p1, v1

    aget-byte v3, p2, v1

    and-int/lit16 v2, v2, 0xff

    and-int/lit16 v3, v3, 0xff

    sub-int/2addr v2, v3

    if-eqz v2, :cond_0

    return v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    array-length p1, p1

    array-length p2, p2

    sub-int/2addr p1, p2

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "UnsignedBytes.lexicographicalComparator() (pure Java version)"

    return-object v0
.end method
