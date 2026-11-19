.class public final Lm0/b;
.super Lm0/x$c;
.source "SourceFile"


# instance fields
.field public final f:Landroid/util/Size;

.field public final g:I

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Z

.field public final j:Lg0/m1;

.field public final k:Lm0/k0;

.field public final l:Lx0/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx0/u<",
            "Lm0/v0;",
            ">;"
        }
    .end annotation
.end field

.field public final m:Lx0/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx0/u<",
            "Lm0/b1$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/util/Size;ILjava/util/List;ZLg0/m1;Lm0/k0;Lx0/u;Lx0/u;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Size;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z",
            "Lg0/m1;",
            "Lm0/k0;",
            "Lx0/u<",
            "Lm0/v0;",
            ">;",
            "Lx0/u<",
            "Lm0/b1$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lm0/x$c;-><init>()V

    if-eqz p1, :cond_3

    iput-object p1, p0, Lm0/b;->f:Landroid/util/Size;

    iput p2, p0, Lm0/b;->g:I

    if-eqz p3, :cond_2

    iput-object p3, p0, Lm0/b;->h:Ljava/util/List;

    iput-boolean p4, p0, Lm0/b;->i:Z

    iput-object p5, p0, Lm0/b;->j:Lg0/m1;

    iput-object p6, p0, Lm0/b;->k:Lm0/k0;

    if-eqz p7, :cond_1

    iput-object p7, p0, Lm0/b;->l:Lx0/u;

    if-eqz p8, :cond_0

    iput-object p8, p0, Lm0/b;->m:Lx0/u;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null errorEdge"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null requestEdge"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null outputFormats"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null size"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public b()Lx0/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx0/u<",
            "Lm0/b1$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm0/b;->m:Lx0/u;

    return-object v0
.end method

.method public c()Lg0/m1;
    .locals 1

    iget-object v0, p0, Lm0/b;->j:Lg0/m1;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lm0/b;->g:I

    return v0
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm0/b;->h:Ljava/util/List;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm0/x$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    check-cast p1, Lm0/x$c;

    iget-object v1, p0, Lm0/b;->f:Landroid/util/Size;

    invoke-virtual {p1}, Lm0/x$c;->k()Landroid/util/Size;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/util/Size;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget v1, p0, Lm0/b;->g:I

    invoke-virtual {p1}, Lm0/x$c;->d()I

    move-result v3

    if-ne v1, v3, :cond_3

    iget-object v1, p0, Lm0/b;->h:Ljava/util/List;

    invoke-virtual {p1}, Lm0/x$c;->e()Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-boolean v1, p0, Lm0/b;->i:Z

    invoke-virtual {p1}, Lm0/x$c;->m()Z

    move-result v3

    if-ne v1, v3, :cond_3

    iget-object v1, p0, Lm0/b;->j:Lg0/m1;

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lm0/x$c;->c()Lg0/m1;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lm0/x$c;->c()Lg0/m1;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    iget-object v1, p0, Lm0/b;->k:Lm0/k0;

    if-nez v1, :cond_2

    invoke-virtual {p1}, Lm0/x$c;->f()Lm0/k0;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lm0/x$c;->f()Lm0/k0;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_1
    iget-object v1, p0, Lm0/b;->l:Lx0/u;

    invoke-virtual {p1}, Lm0/x$c;->h()Lx0/u;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lm0/b;->m:Lx0/u;

    invoke-virtual {p1}, Lm0/x$c;->b()Lx0/u;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v0

    :cond_3
    return v2
.end method

.method public f()Lm0/k0;
    .locals 1

    iget-object v0, p0, Lm0/b;->k:Lm0/k0;

    return-object v0
.end method

.method public h()Lx0/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx0/u<",
            "Lm0/v0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm0/b;->l:Lx0/u;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lm0/b;->f:Landroid/util/Size;

    invoke-virtual {v0}, Landroid/util/Size;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget v2, p0, Lm0/b;->g:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lm0/b;->h:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lm0/b;->i:Z

    if-eqz v2, :cond_0

    const/16 v2, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v2, 0x4d5

    :goto_0
    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lm0/b;->j:Lg0/m1;

    const/4 v3, 0x0

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lm0/b;->k:Lm0/k0;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    xor-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v2, p0, Lm0/b;->l:Lx0/u;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lm0/b;->m:Lx0/u;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public k()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Lm0/b;->f:Landroid/util/Size;

    return-object v0
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, Lm0/b;->i:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "In{size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm0/b;->f:Landroid/util/Size;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", inputFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lm0/b;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", outputFormats="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm0/b;->h:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", virtualCamera="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lm0/b;->i:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", imageReaderProxyProvider="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm0/b;->j:Lg0/m1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", postviewSettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm0/b;->k:Lm0/k0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", requestEdge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm0/b;->l:Lx0/u;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", errorEdge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm0/b;->m:Lx0/u;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
