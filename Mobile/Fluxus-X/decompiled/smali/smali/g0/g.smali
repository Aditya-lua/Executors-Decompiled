.class public final Lg0/g;
.super Lg0/o1;
.source "SourceFile"


# instance fields
.field public final a:Ln0/z3;

.field public final b:J

.field public final c:I

.field public final d:Landroid/graphics/Matrix;

.field public final e:I


# direct methods
.method public constructor <init>(Ln0/z3;JILandroid/graphics/Matrix;I)V
    .locals 0

    invoke-direct {p0}, Lg0/o1;-><init>()V

    if-eqz p1, :cond_1

    iput-object p1, p0, Lg0/g;->a:Ln0/z3;

    iput-wide p2, p0, Lg0/g;->b:J

    iput p4, p0, Lg0/g;->c:I

    if-eqz p5, :cond_0

    iput-object p5, p0, Lg0/g;->d:Landroid/graphics/Matrix;

    iput p6, p0, Lg0/g;->e:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null sensorToBufferTransformMatrix"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null tagBundle"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lg0/g;->e:I

    return v0
.end method

.method public c()Ln0/z3;
    .locals 1

    iget-object v0, p0, Lg0/g;->a:Ln0/z3;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lg0/g;->c:I

    return v0
.end method

.method public e()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, Lg0/g;->d:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lg0/o1;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lg0/o1;

    iget-object v1, p0, Lg0/g;->a:Ln0/z3;

    invoke-virtual {p1}, Lg0/o1;->c()Ln0/z3;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-wide v3, p0, Lg0/g;->b:J

    invoke-virtual {p1}, Lg0/o1;->getTimestamp()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    iget v1, p0, Lg0/g;->c:I

    invoke-virtual {p1}, Lg0/o1;->d()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lg0/g;->d:Landroid/graphics/Matrix;

    invoke-virtual {p1}, Lg0/o1;->e()Landroid/graphics/Matrix;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/graphics/Matrix;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lg0/g;->e:I

    invoke-virtual {p1}, Lg0/o1;->b()I

    move-result p1

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public getTimestamp()J
    .locals 2

    iget-wide v0, p0, Lg0/g;->b:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 6

    iget-object v0, p0, Lg0/g;->a:Ln0/z3;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lg0/g;->b:J

    const/16 v4, 0x20

    ushr-long v4, v2, v4

    xor-long/2addr v2, v4

    long-to-int v2, v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lg0/g;->c:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lg0/g;->d:Landroid/graphics/Matrix;

    invoke-virtual {v2}, Landroid/graphics/Matrix;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v1, p0, Lg0/g;->e:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ImmutableImageInfo{tagBundle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg0/g;->a:Ln0/z3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lg0/g;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", rotationDegrees="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lg0/g;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sensorToBufferTransformMatrix="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg0/g;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", flashState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lg0/g;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
