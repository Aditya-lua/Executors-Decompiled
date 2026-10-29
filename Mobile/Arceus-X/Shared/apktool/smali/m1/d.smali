.class public final Lm1/d;
.super Lm1/p1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm1/d$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Ln0/a4;

.field public final d:Landroid/util/Size;

.field public final e:I

.field public final f:Lm1/q1;

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I


# direct methods
.method public constructor <init>(Ljava/lang/String;ILn0/a4;Landroid/util/Size;ILm1/q1;IIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lm1/p1;-><init>()V

    .line 3
    iput-object p1, p0, Lm1/d;->a:Ljava/lang/String;

    .line 4
    iput p2, p0, Lm1/d;->b:I

    .line 5
    iput-object p3, p0, Lm1/d;->c:Ln0/a4;

    .line 6
    iput-object p4, p0, Lm1/d;->d:Landroid/util/Size;

    .line 7
    iput p5, p0, Lm1/d;->e:I

    .line 8
    iput-object p6, p0, Lm1/d;->f:Lm1/q1;

    .line 9
    iput p7, p0, Lm1/d;->g:I

    .line 10
    iput p8, p0, Lm1/d;->h:I

    .line 11
    iput p9, p0, Lm1/d;->i:I

    .line 12
    iput p10, p0, Lm1/d;->j:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILn0/a4;Landroid/util/Size;ILm1/q1;IIIILm1/d$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p10}, Lm1/d;-><init>(Ljava/lang/String;ILn0/a4;Landroid/util/Size;ILm1/q1;IIII)V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm1/d;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ln0/a4;
    .locals 1

    iget-object v0, p0, Lm1/d;->c:Ln0/a4;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lm1/d;->j:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm1/p1;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lm1/p1;

    iget-object v1, p0, Lm1/d;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lm1/p1;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lm1/d;->b:I

    invoke-virtual {p1}, Lm1/p1;->k()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lm1/d;->c:Ln0/a4;

    invoke-virtual {p1}, Lm1/p1;->c()Ln0/a4;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lm1/d;->d:Landroid/util/Size;

    invoke-virtual {p1}, Lm1/p1;->l()Landroid/util/Size;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/util/Size;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lm1/d;->e:I

    invoke-virtual {p1}, Lm1/p1;->g()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lm1/d;->f:Lm1/q1;

    invoke-virtual {p1}, Lm1/p1;->h()Lm1/q1;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lm1/d;->g:I

    invoke-virtual {p1}, Lm1/p1;->f()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget v1, p0, Lm1/d;->h:I

    invoke-virtual {p1}, Lm1/p1;->i()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget v1, p0, Lm1/d;->i:I

    invoke-virtual {p1}, Lm1/p1;->j()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget v1, p0, Lm1/d;->j:I

    invoke-virtual {p1}, Lm1/p1;->e()I

    move-result p1

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lm1/d;->g:I

    return v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lm1/d;->e:I

    return v0
.end method

.method public h()Lm1/q1;
    .locals 1

    iget-object v0, p0, Lm1/d;->f:Lm1/q1;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lm1/d;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget v2, p0, Lm1/d;->b:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lm1/d;->c:Ln0/a4;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lm1/d;->d:Landroid/util/Size;

    invoke-virtual {v2}, Landroid/util/Size;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lm1/d;->e:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lm1/d;->f:Lm1/q1;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lm1/d;->g:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lm1/d;->h:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lm1/d;->i:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v1, p0, Lm1/d;->j:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lm1/d;->h:I

    return v0
.end method

.method public j()I
    .locals 1

    iget v0, p0, Lm1/d;->i:I

    return v0
.end method

.method public k()I
    .locals 1

    iget v0, p0, Lm1/d;->b:I

    return v0
.end method

.method public l()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Lm1/d;->d:Landroid/util/Size;

    return-object v0
.end method

.method public m()Lm1/p1$a;
    .locals 2

    new-instance v0, Lm1/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lm1/d$b;-><init>(Lm1/p1;Lm1/d$a;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VideoEncoderConfig{mimeType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm1/d;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", profile="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lm1/d;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", inputTimebase="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm1/d;->c:Ln0/a4;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", resolution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm1/d;->d:Landroid/util/Size;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", colorFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lm1/d;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", dataSpace="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm1/d;->f:Lm1/q1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", captureFrameRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lm1/d;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", encodeFrameRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lm1/d;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", IFrameInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lm1/d;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bitrate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lm1/d;->j:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
