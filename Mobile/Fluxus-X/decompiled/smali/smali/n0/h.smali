.class public final Ln0/h;
.super Ln0/g;
.source "SourceFile"


# instance fields
.field public final a:Ln0/w3;

.field public final b:I

.field public final c:Landroid/util/Size;

.field public final d:Lg0/k0;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ln0/j4$b;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ln0/n1;

.field public final g:I

.field public final h:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Z


# direct methods
.method public constructor <init>(Ln0/w3;ILandroid/util/Size;Lg0/k0;Ljava/util/List;Ln0/n1;ILandroid/util/Range;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/w3;",
            "I",
            "Landroid/util/Size;",
            "Lg0/k0;",
            "Ljava/util/List<",
            "Ln0/j4$b;",
            ">;",
            "Ln0/n1;",
            "I",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ln0/g;-><init>()V

    if-eqz p1, :cond_4

    iput-object p1, p0, Ln0/h;->a:Ln0/w3;

    iput p2, p0, Ln0/h;->b:I

    if-eqz p3, :cond_3

    iput-object p3, p0, Ln0/h;->c:Landroid/util/Size;

    if-eqz p4, :cond_2

    iput-object p4, p0, Ln0/h;->d:Lg0/k0;

    if-eqz p5, :cond_1

    iput-object p5, p0, Ln0/h;->e:Ljava/util/List;

    iput-object p6, p0, Ln0/h;->f:Ln0/n1;

    iput p7, p0, Ln0/h;->g:I

    if-eqz p8, :cond_0

    iput-object p8, p0, Ln0/h;->h:Landroid/util/Range;

    iput-boolean p9, p0, Ln0/h;->i:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null targetFrameRate"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null captureTypes"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null dynamicRange"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null size"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null surfaceConfig"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ln0/j4$b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln0/h;->e:Ljava/util/List;

    return-object v0
.end method

.method public c()Lg0/k0;
    .locals 1

    iget-object v0, p0, Ln0/h;->d:Lg0/k0;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Ln0/h;->b:I

    return v0
.end method

.method public e()Ln0/n1;
    .locals 1

    iget-object v0, p0, Ln0/h;->f:Ln0/n1;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ln0/g;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Ln0/g;

    iget-object v1, p0, Ln0/h;->a:Ln0/w3;

    invoke-virtual {p1}, Ln0/g;->h()Ln0/w3;

    move-result-object v3

    invoke-virtual {v1, v3}, Ln0/w3;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Ln0/h;->b:I

    invoke-virtual {p1}, Ln0/g;->d()I

    move-result v3

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Ln0/h;->c:Landroid/util/Size;

    invoke-virtual {p1}, Ln0/g;->g()Landroid/util/Size;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/util/Size;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ln0/h;->d:Lg0/k0;

    invoke-virtual {p1}, Ln0/g;->c()Lg0/k0;

    move-result-object v3

    invoke-virtual {v1, v3}, Lg0/k0;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ln0/h;->e:Ljava/util/List;

    invoke-virtual {p1}, Ln0/g;->b()Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ln0/h;->f:Ln0/n1;

    if-nez v1, :cond_1

    invoke-virtual {p1}, Ln0/g;->e()Ln0/n1;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ln0/g;->e()Ln0/n1;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_0
    iget v1, p0, Ln0/h;->g:I

    invoke-virtual {p1}, Ln0/g;->f()I

    move-result v3

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Ln0/h;->h:Landroid/util/Range;

    invoke-virtual {p1}, Ln0/g;->i()Landroid/util/Range;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Ln0/h;->i:Z

    invoke-virtual {p1}, Ln0/g;->j()Z

    move-result p1

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public f()I
    .locals 1

    iget v0, p0, Ln0/h;->g:I

    return v0
.end method

.method public g()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Ln0/h;->c:Landroid/util/Size;

    return-object v0
.end method

.method public h()Ln0/w3;
    .locals 1

    iget-object v0, p0, Ln0/h;->a:Ln0/w3;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Ln0/h;->a:Ln0/w3;

    invoke-virtual {v0}, Ln0/w3;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget v2, p0, Ln0/h;->b:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ln0/h;->c:Landroid/util/Size;

    invoke-virtual {v2}, Landroid/util/Size;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ln0/h;->d:Lg0/k0;

    invoke-virtual {v2}, Lg0/k0;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ln0/h;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ln0/h;->f:Ln0/n1;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Ln0/h;->g:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ln0/h;->h:Landroid/util/Range;

    invoke-virtual {v2}, Landroid/util/Range;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Ln0/h;->i:Z

    if-eqz v1, :cond_1

    const/16 v1, 0x4cf

    goto :goto_1

    :cond_1
    const/16 v1, 0x4d5

    :goto_1
    xor-int/2addr v0, v1

    return v0
.end method

.method public i()Landroid/util/Range;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln0/h;->h:Landroid/util/Range;

    return-object v0
.end method

.method public j()Z
    .locals 1

    iget-boolean v0, p0, Ln0/h;->i:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AttachedSurfaceInfo{surfaceConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln0/h;->a:Ln0/w3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", imageFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ln0/h;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln0/h;->c:Landroid/util/Size;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dynamicRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln0/h;->d:Lg0/k0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", captureTypes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln0/h;->e:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", implementationOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln0/h;->f:Ln0/n1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sessionType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ln0/h;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", targetFrameRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln0/h;->h:Landroid/util/Range;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", strictFrameRateRequired="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ln0/h;->i:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
