.class public final Leb/q2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:[C

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:[B

.field public final h:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;[C)V
    .locals 9

    const/16 v0, 0x80

    .line 1
    new-array v1, v0, [B

    const/4 v2, -0x1

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([BB)V

    const/4 v3, 0x0

    move v4, v3

    .line 2
    :goto_0
    array-length v5, p2

    if-ge v4, v5, :cond_2

    .line 3
    aget-char v5, p2, v4

    const/4 v6, 0x1

    if-ge v5, v0, :cond_0

    move v7, v6

    goto :goto_1

    :cond_0
    move v7, v3

    :goto_1
    const-string v8, "Non-ASCII character: %s"

    .line 4
    invoke-static {v7, v8, v5}, Leb/n0;->d(ZLjava/lang/String;C)V

    .line 5
    aget-byte v7, v1, v5

    if-ne v7, v2, :cond_1

    goto :goto_2

    :cond_1
    move v6, v3

    :goto_2
    const-string v7, "Duplicate character: %s"

    invoke-static {v6, v7, v5}, Leb/n0;->d(ZLjava/lang/String;C)V

    int-to-byte v6, v4

    .line 6
    aput-byte v6, v1, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 7
    :cond_2
    invoke-direct {p0, p1, p2, v1, v3}, Leb/q2;-><init>(Ljava/lang/String;[C[BZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[C[BZ)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb/q2;->a:Ljava/lang/String;

    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    iput-object p2, p0, Leb/q2;->b:[C

    :try_start_0
    array-length p1, p2

    .line 10
    sget-object v0, Ljava/math/RoundingMode;->UNNECESSARY:Ljava/math/RoundingMode;

    invoke-static {p1, v0}, Leb/w2;->b(ILjava/math/RoundingMode;)I

    move-result v0

    iput v0, p0, Leb/q2;->d:I
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    invoke-static {v0}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    move-result p2

    rsub-int/lit8 v1, p2, 0x3

    const/4 v2, 0x1

    shl-int v1, v2, v1

    iput v1, p0, Leb/q2;->e:I

    shr-int p2, v0, p2

    iput p2, p0, Leb/q2;->f:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Leb/q2;->c:I

    iput-object p3, p0, Leb/q2;->g:[B

    .line 12
    new-array p1, v1, [Z

    const/4 p2, 0x0

    :goto_0
    iget p3, p0, Leb/q2;->f:I

    if-ge p2, p3, :cond_0

    mul-int/lit8 p3, p2, 0x8

    iget v0, p0, Leb/q2;->d:I

    sget-object v1, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 13
    invoke-static {p3, v0, v1}, Leb/w2;->a(IILjava/math/RoundingMode;)I

    move-result p3

    aput-boolean v2, p1, p3

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 14
    :cond_0
    iput-boolean p4, p0, Leb/q2;->h:Z

    return-void

    :catch_0
    move-exception p1

    .line 15
    array-length p2, p2

    new-instance p3, Ljava/lang/IllegalArgumentException;

    new-instance p4, Ljava/lang/StringBuilder;

    .line 16
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Illegal alphabet length "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p3
.end method

.method public static bridge synthetic d(Leb/q2;)[C
    .locals 0

    iget-object p0, p0, Leb/q2;->b:[C

    return-object p0
.end method


# virtual methods
.method public final a(I)C
    .locals 1

    iget-object v0, p0, Leb/q2;->b:[C

    aget-char p1, v0, p1

    return p1
.end method

.method public final b()Leb/q2;
    .locals 11

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Leb/q2;->b:[C

    array-length v3, v2

    if-ge v1, v3, :cond_a

    aget-char v3, v2, v1

    invoke-static {v3}, Leb/b0;->a(C)Z

    move-result v3

    if-eqz v3, :cond_9

    move v1, v0

    :goto_1
    array-length v3, v2

    const/16 v4, 0x5a

    const/16 v5, 0x41

    const/4 v6, 0x1

    if-ge v1, v3, :cond_1

    aget-char v3, v2, v1

    if-lt v3, v5, :cond_0

    if-gt v3, v4, :cond_0

    move v1, v6

    goto :goto_2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_2
    xor-int/2addr v1, v6

    const-string v2, "Cannot call upperCase() on a mixed-case alphabet"

    invoke-static {v1, v2}, Leb/n0;->f(ZLjava/lang/Object;)V

    iget-object v1, p0, Leb/q2;->b:[C

    array-length v1, v1

    new-array v1, v1, [C

    :goto_3
    iget-object v2, p0, Leb/q2;->b:[C

    array-length v3, v2

    if-ge v0, v3, :cond_3

    aget-char v2, v2, v0

    invoke-static {v2}, Leb/b0;->a(C)Z

    move-result v3

    if-eqz v3, :cond_2

    xor-int/lit8 v2, v2, 0x20

    :cond_2
    int-to-char v2, v2

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_3
    iget-object v0, p0, Leb/q2;->a:Ljava/lang/String;

    new-instance v2, Leb/q2;

    const-string v3, ".upperCase()"

    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Leb/q2;-><init>(Ljava/lang/String;[C)V

    iget-boolean v0, p0, Leb/q2;->h:Z

    if-eqz v0, :cond_8

    iget-boolean v0, v2, Leb/q2;->h:Z

    if-eqz v0, :cond_4

    goto :goto_6

    :cond_4
    iget-object v0, v2, Leb/q2;->g:[B

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    :goto_4
    if-gt v5, v4, :cond_7

    or-int/lit8 v1, v5, 0x20

    iget-object v3, v2, Leb/q2;->g:[B

    aget-byte v7, v3, v5

    aget-byte v3, v3, v1

    const/4 v8, -0x1

    if-ne v7, v8, :cond_5

    aput-byte v3, v0, v5

    goto :goto_5

    :cond_5
    int-to-char v9, v5

    int-to-char v10, v1

    if-ne v3, v8, :cond_6

    aput-byte v7, v0, v1

    :goto_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {v9}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-static {v10}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Can\'t ignoreCase() since \'%s\' and \'%s\' encode different values"

    invoke-static {v2, v1}, Leb/p0;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    iget-object v1, v2, Leb/q2;->a:Ljava/lang/String;

    iget-object v2, v2, Leb/q2;->b:[C

    new-instance v3, Leb/q2;

    const-string v4, ".ignoreCase()"

    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1, v2, v0, v6}, Leb/q2;-><init>(Ljava/lang/String;[C[BZ)V

    return-object v3

    :cond_8
    :goto_6
    return-object v2

    :cond_9
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_a
    return-object p0
.end method

.method public final c(C)Z
    .locals 2

    iget-object p1, p0, Leb/q2;->g:[B

    array-length v0, p1

    const/16 v1, 0x3d

    if-le v0, v1, :cond_0

    aget-byte p1, p1, v1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Leb/q2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Leb/q2;

    iget-boolean v0, p0, Leb/q2;->h:Z

    iget-boolean v2, p1, Leb/q2;->h:Z

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Leb/q2;->b:[C

    iget-object p1, p1, Leb/q2;->b:[C

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([C[C)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Leb/q2;->h:Z

    iget-object v1, p0, Leb/q2;->b:[C

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([C)I

    move-result v1

    const/4 v2, 0x1

    if-eq v2, v0, :cond_0

    const/16 v0, 0x4d5

    goto :goto_0

    :cond_0
    const/16 v0, 0x4cf

    :goto_0
    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Leb/q2;->a:Ljava/lang/String;

    return-object v0
.end method
