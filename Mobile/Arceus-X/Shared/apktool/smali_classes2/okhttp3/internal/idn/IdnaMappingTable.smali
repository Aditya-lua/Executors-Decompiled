.class public final Lokhttp3/internal/idn/IdnaMappingTable;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B!\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\'\u0010\u000e\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0015\u001a\u0004\u0008\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0015\u001a\u0004\u0008\u0019\u0010\u0017\u00a8\u0006\u001a"
    }
    d2 = {
        "Lokhttp3/internal/idn/IdnaMappingTable;",
        "",
        "",
        "sections",
        "ranges",
        "mappings",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "codePoint",
        "findSectionsIndex",
        "(I)I",
        "position",
        "limit",
        "findRangesOffset",
        "(III)I",
        "Lxu/f;",
        "sink",
        "",
        "map",
        "(ILxu/f;)Z",
        "Ljava/lang/String;",
        "getSections",
        "()Ljava/lang/String;",
        "getRanges",
        "getMappings",
        "okhttp"
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
.field private final mappings:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final ranges:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final sections:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sections"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ranges"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mappings"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lokhttp3/internal/idn/IdnaMappingTable;->sections:Ljava/lang/String;

    iput-object p2, p0, Lokhttp3/internal/idn/IdnaMappingTable;->ranges:Ljava/lang/String;

    iput-object p3, p0, Lokhttp3/internal/idn/IdnaMappingTable;->mappings:Ljava/lang/String;

    return-void
.end method

.method private final findRangesOffset(III)I
    .locals 3

    and-int/lit8 p1, p1, 0x7f

    add-int/lit8 p3, p3, -0x1

    :goto_0
    if-gt p2, p3, :cond_1

    add-int v0, p2, p3

    div-int/lit8 v0, v0, 0x2

    mul-int/lit8 v1, v0, 0x4

    iget-object v2, p0, Lokhttp3/internal/idn/IdnaMappingTable;->ranges:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->f(II)I

    move-result v1

    if-gez v1, :cond_0

    add-int/lit8 p3, v0, -0x1

    goto :goto_0

    :cond_0
    if-lez v1, :cond_2

    add-int/lit8 p2, v0, 0x1

    goto :goto_0

    :cond_1
    neg-int p1, p2

    add-int/lit8 v0, p1, -0x1

    :cond_2
    if-ltz v0, :cond_3

    mul-int/lit8 v0, v0, 0x4

    return v0

    :cond_3
    neg-int p1, v0

    add-int/lit8 p1, p1, -0x2

    mul-int/lit8 p1, p1, 0x4

    return p1
.end method

.method private final findSectionsIndex(I)I
    .locals 5

    const v0, 0x1fff80

    and-int/2addr p1, v0

    shr-int/lit8 p1, p1, 0x7

    iget-object v0, p0, Lokhttp3/internal/idn/IdnaMappingTable;->sections:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_0
    if-gt v1, v0, :cond_1

    add-int v2, v1, v0

    div-int/lit8 v2, v2, 0x2

    mul-int/lit8 v3, v2, 0x4

    iget-object v4, p0, Lokhttp3/internal/idn/IdnaMappingTable;->sections:Ljava/lang/String;

    invoke-static {v4, v3}, Lokhttp3/internal/idn/IdnaMappingTableKt;->read14BitInt(Ljava/lang/String;I)I

    move-result v3

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->f(II)I

    move-result v3

    if-gez v3, :cond_0

    add-int/lit8 v0, v2, -0x1

    goto :goto_0

    :cond_0
    if-lez v3, :cond_2

    add-int/lit8 v1, v2, 0x1

    goto :goto_0

    :cond_1
    neg-int p1, v1

    add-int/lit8 v2, p1, -0x1

    :cond_2
    if-ltz v2, :cond_3

    mul-int/lit8 v2, v2, 0x4

    return v2

    :cond_3
    neg-int p1, v2

    add-int/lit8 p1, p1, -0x2

    mul-int/lit8 p1, p1, 0x4

    return p1
.end method


# virtual methods
.method public final getMappings()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lokhttp3/internal/idn/IdnaMappingTable;->mappings:Ljava/lang/String;

    return-object v0
.end method

.method public final getRanges()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lokhttp3/internal/idn/IdnaMappingTable;->ranges:Ljava/lang/String;

    return-object v0
.end method

.method public final getSections()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lokhttp3/internal/idn/IdnaMappingTable;->sections:Ljava/lang/String;

    return-object v0
.end method

.method public final map(ILxu/f;)Z
    .locals 4
    .param p2    # Lxu/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sink"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lokhttp3/internal/idn/IdnaMappingTable;->findSectionsIndex(I)I

    move-result v0

    iget-object v1, p0, Lokhttp3/internal/idn/IdnaMappingTable;->sections:Ljava/lang/String;

    add-int/lit8 v2, v0, 0x2

    invoke-static {v1, v2}, Lokhttp3/internal/idn/IdnaMappingTableKt;->read14BitInt(Ljava/lang/String;I)I

    move-result v1

    add-int/lit8 v2, v0, 0x4

    iget-object v3, p0, Lokhttp3/internal/idn/IdnaMappingTable;->sections:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_0

    iget-object v2, p0, Lokhttp3/internal/idn/IdnaMappingTable;->sections:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x6

    invoke-static {v2, v0}, Lokhttp3/internal/idn/IdnaMappingTableKt;->read14BitInt(Ljava/lang/String;I)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lokhttp3/internal/idn/IdnaMappingTable;->ranges:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x4

    :goto_0
    invoke-direct {p0, p1, v1, v0}, Lokhttp3/internal/idn/IdnaMappingTable;->findRangesOffset(III)I

    move-result v0

    iget-object v1, p0, Lokhttp3/internal/idn/IdnaMappingTable;->ranges:Ljava/lang/String;

    add-int/lit8 v2, v0, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x40

    if-ltz v1, :cond_1

    if-ge v1, v2, :cond_1

    iget-object p1, p0, Lokhttp3/internal/idn/IdnaMappingTable;->ranges:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x2

    invoke-static {p1, v0}, Lokhttp3/internal/idn/IdnaMappingTableKt;->read14BitInt(Ljava/lang/String;I)I

    move-result p1

    iget-object v0, p0, Lokhttp3/internal/idn/IdnaMappingTable;->mappings:Ljava/lang/String;

    add-int/2addr v1, p1

    invoke-interface {p2, v0, p1, v1}, Lxu/f;->K0(Ljava/lang/String;II)Lxu/f;

    goto/16 :goto_1

    :cond_1
    const/16 v3, 0x50

    if-gt v2, v1, :cond_2

    if-ge v1, v3, :cond_2

    iget-object v2, p0, Lokhttp3/internal/idn/IdnaMappingTable;->ranges:Ljava/lang/String;

    add-int/lit8 v3, v0, 0x2

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    iget-object v3, p0, Lokhttp3/internal/idn/IdnaMappingTable;->ranges:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x3

    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    and-int/lit8 v1, v1, 0xf

    shl-int/lit8 v1, v1, 0xe

    shl-int/lit8 v2, v2, 0x7

    or-int/2addr v1, v2

    or-int/2addr v0, v1

    sub-int/2addr p1, v0

    invoke-interface {p2, p1}, Lxu/f;->T(I)Lxu/f;

    goto/16 :goto_1

    :cond_2
    if-gt v3, v1, :cond_3

    const/16 v2, 0x60

    if-ge v1, v2, :cond_3

    iget-object v2, p0, Lokhttp3/internal/idn/IdnaMappingTable;->ranges:Ljava/lang/String;

    add-int/lit8 v3, v0, 0x2

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    iget-object v3, p0, Lokhttp3/internal/idn/IdnaMappingTable;->ranges:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x3

    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    and-int/lit8 v1, v1, 0xf

    shl-int/lit8 v1, v1, 0xe

    shl-int/lit8 v2, v2, 0x7

    or-int/2addr v1, v2

    or-int/2addr v0, v1

    add-int/2addr p1, v0

    invoke-interface {p2, p1}, Lxu/f;->T(I)Lxu/f;

    goto/16 :goto_1

    :cond_3
    const/16 v2, 0x77

    if-ne v1, v2, :cond_4

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    goto/16 :goto_1

    :cond_4
    const/16 v2, 0x78

    if-ne v1, v2, :cond_5

    invoke-interface {p2, p1}, Lxu/f;->T(I)Lxu/f;

    goto/16 :goto_1

    :cond_5
    const/16 v2, 0x79

    if-ne v1, v2, :cond_6

    invoke-interface {p2, p1}, Lxu/f;->T(I)Lxu/f;

    const/4 p1, 0x0

    return p1

    :cond_6
    const/16 v2, 0x7a

    if-ne v1, v2, :cond_7

    iget-object p1, p0, Lokhttp3/internal/idn/IdnaMappingTable;->ranges:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-interface {p2, p1}, Lxu/f;->writeByte(I)Lxu/f;

    goto/16 :goto_1

    :cond_7
    const/16 v2, 0x7b

    if-ne v1, v2, :cond_8

    iget-object p1, p0, Lokhttp3/internal/idn/IdnaMappingTable;->ranges:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result p1

    or-int/lit16 p1, p1, 0x80

    invoke-interface {p2, p1}, Lxu/f;->writeByte(I)Lxu/f;

    goto/16 :goto_1

    :cond_8
    const/16 v2, 0x7c

    if-ne v1, v2, :cond_9

    iget-object p1, p0, Lokhttp3/internal/idn/IdnaMappingTable;->ranges:Ljava/lang/String;

    add-int/lit8 v1, v0, 0x2

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-interface {p2, p1}, Lxu/f;->writeByte(I)Lxu/f;

    iget-object p1, p0, Lokhttp3/internal/idn/IdnaMappingTable;->ranges:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x3

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-interface {p2, p1}, Lxu/f;->writeByte(I)Lxu/f;

    goto :goto_1

    :cond_9
    const/16 v2, 0x7d

    if-ne v1, v2, :cond_a

    iget-object p1, p0, Lokhttp3/internal/idn/IdnaMappingTable;->ranges:Ljava/lang/String;

    add-int/lit8 v1, v0, 0x2

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    or-int/lit16 p1, p1, 0x80

    invoke-interface {p2, p1}, Lxu/f;->writeByte(I)Lxu/f;

    iget-object p1, p0, Lokhttp3/internal/idn/IdnaMappingTable;->ranges:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x3

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-interface {p2, p1}, Lxu/f;->writeByte(I)Lxu/f;

    goto :goto_1

    :cond_a
    const/16 v2, 0x7e

    if-ne v1, v2, :cond_b

    iget-object p1, p0, Lokhttp3/internal/idn/IdnaMappingTable;->ranges:Ljava/lang/String;

    add-int/lit8 v1, v0, 0x2

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-interface {p2, p1}, Lxu/f;->writeByte(I)Lxu/f;

    iget-object p1, p0, Lokhttp3/internal/idn/IdnaMappingTable;->ranges:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x3

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result p1

    or-int/lit16 p1, p1, 0x80

    invoke-interface {p2, p1}, Lxu/f;->writeByte(I)Lxu/f;

    goto :goto_1

    :cond_b
    const/16 v2, 0x7f

    if-ne v1, v2, :cond_c

    iget-object p1, p0, Lokhttp3/internal/idn/IdnaMappingTable;->ranges:Ljava/lang/String;

    add-int/lit8 v1, v0, 0x2

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    or-int/lit16 p1, p1, 0x80

    invoke-interface {p2, p1}, Lxu/f;->writeByte(I)Lxu/f;

    iget-object p1, p0, Lokhttp3/internal/idn/IdnaMappingTable;->ranges:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x3

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result p1

    or-int/lit16 p1, p1, 0x80

    invoke-interface {p2, p1}, Lxu/f;->writeByte(I)Lxu/f;

    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_c
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unexpected rangesIndex for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
