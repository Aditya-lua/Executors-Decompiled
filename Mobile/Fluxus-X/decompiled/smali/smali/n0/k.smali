.class public final Ln0/k;
.super Ln0/a2$a;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I


# direct methods
.method public constructor <init>(ILjava/lang/String;IIII)V
    .locals 0

    invoke-direct {p0}, Ln0/a2$a;-><init>()V

    iput p1, p0, Ln0/k;->a:I

    if-eqz p2, :cond_0

    iput-object p2, p0, Ln0/k;->b:Ljava/lang/String;

    iput p3, p0, Ln0/k;->c:I

    iput p4, p0, Ln0/k;->d:I

    iput p5, p0, Ln0/k;->e:I

    iput p6, p0, Ln0/k;->f:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null mediaType"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Ln0/k;->c:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Ln0/k;->e:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Ln0/k;->a:I

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln0/k;->b:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ln0/a2$a;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Ln0/a2$a;

    iget v1, p0, Ln0/k;->a:I

    invoke-virtual {p1}, Ln0/a2$a;->d()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Ln0/k;->b:Ljava/lang/String;

    invoke-virtual {p1}, Ln0/a2$a;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Ln0/k;->c:I

    invoke-virtual {p1}, Ln0/a2$a;->b()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget v1, p0, Ln0/k;->d:I

    invoke-virtual {p1}, Ln0/a2$a;->g()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget v1, p0, Ln0/k;->e:I

    invoke-virtual {p1}, Ln0/a2$a;->c()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget v1, p0, Ln0/k;->f:I

    invoke-virtual {p1}, Ln0/a2$a;->f()I

    move-result p1

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public f()I
    .locals 1

    iget v0, p0, Ln0/k;->f:I

    return v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Ln0/k;->d:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Ln0/k;->a:I

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v2, p0, Ln0/k;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Ln0/k;->c:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Ln0/k;->d:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Ln0/k;->e:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v1, p0, Ln0/k;->f:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AudioProfileProxy{codec="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ln0/k;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mediaType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln0/k;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bitrate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ln0/k;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sampleRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ln0/k;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", channels="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ln0/k;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", profile="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ln0/k;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
