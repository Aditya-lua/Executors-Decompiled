.class public final Ln0/p;
.super Ln0/e3;
.source "SourceFile"


# instance fields
.field public final a:Ln0/d3;

.field public final b:Ln0/d3;

.field public final c:Ln0/d3;

.field public final d:Ln0/d3;


# direct methods
.method public constructor <init>(Ln0/d3;Ln0/d3;Ln0/d3;Ln0/d3;)V
    .locals 0

    invoke-direct {p0}, Ln0/e3;-><init>()V

    if-eqz p1, :cond_1

    iput-object p1, p0, Ln0/p;->a:Ln0/d3;

    if-eqz p2, :cond_0

    iput-object p2, p0, Ln0/p;->b:Ln0/d3;

    iput-object p3, p0, Ln0/p;->c:Ln0/d3;

    iput-object p4, p0, Ln0/p;->d:Ln0/d3;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null imageCaptureOutputSurface"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null previewOutputSurface"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public b()Ln0/d3;
    .locals 1

    iget-object v0, p0, Ln0/p;->c:Ln0/d3;

    return-object v0
.end method

.method public c()Ln0/d3;
    .locals 1

    iget-object v0, p0, Ln0/p;->b:Ln0/d3;

    return-object v0
.end method

.method public d()Ln0/d3;
    .locals 1

    iget-object v0, p0, Ln0/p;->d:Ln0/d3;

    return-object v0
.end method

.method public e()Ln0/d3;
    .locals 1

    iget-object v0, p0, Ln0/p;->a:Ln0/d3;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ln0/e3;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    check-cast p1, Ln0/e3;

    iget-object v1, p0, Ln0/p;->a:Ln0/d3;

    invoke-virtual {p1}, Ln0/e3;->e()Ln0/d3;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Ln0/p;->b:Ln0/d3;

    invoke-virtual {p1}, Ln0/e3;->c()Ln0/d3;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Ln0/p;->c:Ln0/d3;

    if-nez v1, :cond_1

    invoke-virtual {p1}, Ln0/e3;->b()Ln0/d3;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ln0/e3;->b()Ln0/d3;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    iget-object v1, p0, Ln0/p;->d:Ln0/d3;

    if-nez v1, :cond_2

    invoke-virtual {p1}, Ln0/e3;->d()Ln0/d3;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Ln0/e3;->d()Ln0/d3;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    :goto_1
    return v0

    :cond_3
    return v2
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Ln0/p;->a:Ln0/d3;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v2, p0, Ln0/p;->b:Ln0/d3;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ln0/p;->c:Ln0/d3;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Ln0/p;->d:Ln0/d3;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    xor-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OutputSurfaceConfiguration{previewOutputSurface="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln0/p;->a:Ln0/d3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", imageCaptureOutputSurface="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln0/p;->b:Ln0/d3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", imageAnalysisOutputSurface="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln0/p;->c:Ln0/d3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", postviewOutputSurface="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln0/p;->d:Ln0/d3;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
