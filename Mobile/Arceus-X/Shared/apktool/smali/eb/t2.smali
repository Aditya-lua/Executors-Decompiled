.class public Leb/t2;
.super Leb/u2;
.source "SourceFile"


# instance fields
.field public final f:Leb/q2;

.field public final g:Ljava/lang/Character;

.field public volatile h:Leb/u2;


# direct methods
.method public constructor <init>(Leb/q2;Ljava/lang/Character;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Leb/u2;-><init>()V

    iput-object p1, p0, Leb/t2;->f:Leb/q2;

    if-eqz p2, :cond_1

    const/16 v0, 0x3d

    invoke-virtual {p1, v0}, Leb/q2;->c(C)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string v0, "Padding character %s was already in alphabet"

    .line 2
    invoke-static {v0, p2}, Leb/p0;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p2, p0, Leb/t2;->g:Ljava/lang/Character;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V
    .locals 1

    .line 3
    new-instance v0, Leb/q2;

    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    move-result-object p2

    invoke-direct {v0, p1, p2}, Leb/q2;-><init>(Ljava/lang/String;[C)V

    invoke-direct {p0, v0, p3}, Leb/t2;-><init>(Leb/q2;Ljava/lang/Character;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Appendable;[BII)V
    .locals 2

    array-length p3, p2

    const/4 v0, 0x0

    invoke-static {v0, p4, p3}, Leb/n0;->e(III)V

    :goto_0
    if-ge v0, p4, :cond_0

    iget-object p3, p0, Leb/t2;->f:Leb/q2;

    iget p3, p3, Leb/q2;->f:I

    sub-int v1, p4, v0

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    invoke-virtual {p0, p1, p2, v0, p3}, Leb/t2;->g(Ljava/lang/Appendable;[BII)V

    iget-object p3, p0, Leb/t2;->f:Leb/q2;

    iget p3, p3, Leb/q2;->f:I

    add-int/2addr v0, p3

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b(I)I
    .locals 3

    iget-object v0, p0, Leb/t2;->f:Leb/q2;

    iget v1, v0, Leb/q2;->f:I

    sget-object v2, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    invoke-static {p1, v1, v2}, Leb/w2;->a(IILjava/math/RoundingMode;)I

    move-result p1

    iget v0, v0, Leb/q2;->e:I

    mul-int/2addr v0, p1

    return v0
.end method

.method public final c()Leb/u2;
    .locals 2

    iget-object v0, p0, Leb/t2;->h:Leb/u2;

    if-nez v0, :cond_1

    iget-object v0, p0, Leb/t2;->f:Leb/q2;

    invoke-virtual {v0}, Leb/q2;->b()Leb/q2;

    move-result-object v1

    if-ne v1, v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Leb/t2;->g:Ljava/lang/Character;

    invoke-virtual {p0, v1, v0}, Leb/t2;->f(Leb/q2;Ljava/lang/Character;)Leb/u2;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Leb/t2;->h:Leb/u2;

    :cond_1
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Leb/t2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Leb/t2;

    iget-object v0, p0, Leb/t2;->f:Leb/q2;

    iget-object v2, p1, Leb/t2;->f:Leb/q2;

    invoke-virtual {v0, v2}, Leb/q2;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Leb/t2;->g:Ljava/lang/Character;

    iget-object p1, p1, Leb/t2;->g:Ljava/lang/Character;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public f(Leb/q2;Ljava/lang/Character;)Leb/u2;
    .locals 1

    new-instance v0, Leb/t2;

    invoke-direct {v0, p1, p2}, Leb/t2;-><init>(Leb/q2;Ljava/lang/Character;)V

    return-object v0
.end method

.method public final g(Ljava/lang/Appendable;[BII)V
    .locals 7

    add-int v0, p3, p4

    array-length v1, p2

    invoke-static {p3, v0, v1}, Leb/n0;->e(III)V

    iget-object v0, p0, Leb/t2;->f:Leb/q2;

    iget v0, v0, Leb/q2;->f:I

    const/4 v1, 0x0

    if-gt p4, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, Leb/n0;->c(Z)V

    const-wide/16 v2, 0x0

    move v0, v1

    :goto_1
    const/16 v4, 0x8

    if-ge v0, p4, :cond_1

    add-int v5, p3, v0

    aget-byte v5, p2, v5

    and-int/lit16 v5, v5, 0xff

    int-to-long v5, v5

    or-long/2addr v2, v5

    shl-long/2addr v2, v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 p2, p4, 0x1

    mul-int/2addr p2, v4

    iget-object p3, p0, Leb/t2;->f:Leb/q2;

    :goto_2
    mul-int/lit8 v0, p4, 0x8

    if-ge v1, v0, :cond_2

    iget v0, p3, Leb/q2;->d:I

    sub-int v0, p2, v0

    sub-int/2addr v0, v1

    ushr-long v5, v2, v0

    iget-object v0, p0, Leb/t2;->f:Leb/q2;

    long-to-int v5, v5

    iget v6, v0, Leb/q2;->c:I

    and-int/2addr v5, v6

    invoke-virtual {v0, v5}, Leb/q2;->a(I)C

    move-result v0

    invoke-interface {p1, v0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    iget-object v0, p0, Leb/t2;->f:Leb/q2;

    iget v0, v0, Leb/q2;->d:I

    add-int/2addr v1, v0

    goto :goto_2

    :cond_2
    iget-object p2, p0, Leb/t2;->g:Ljava/lang/Character;

    if-eqz p2, :cond_3

    :goto_3
    iget-object p2, p0, Leb/t2;->f:Leb/q2;

    iget p2, p2, Leb/q2;->f:I

    mul-int/2addr p2, v4

    if-ge v1, p2, :cond_3

    iget-object p2, p0, Leb/t2;->g:Ljava/lang/Character;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p2, 0x3d

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    iget-object p2, p0, Leb/t2;->f:Leb/q2;

    iget p2, p2, Leb/q2;->d:I

    add-int/2addr v1, p2

    goto :goto_3

    :cond_3
    return-void
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Leb/t2;->g:Ljava/lang/Character;

    iget-object v1, p0, Leb/t2;->f:Leb/q2;

    invoke-virtual {v1}, Leb/q2;->hashCode()I

    move-result v1

    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BaseEncoding."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Leb/t2;->f:Leb/q2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Leb/t2;->f:Leb/q2;

    iget v1, v1, Leb/q2;->d:I

    const/16 v2, 0x8

    rem-int/2addr v2, v1

    if-eqz v2, :cond_1

    iget-object v1, p0, Leb/t2;->g:Ljava/lang/Character;

    if-nez v1, :cond_0

    const-string v1, ".omitPadding()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v1, ".withPadChar(\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Leb/t2;->g:Ljava/lang/Character;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
