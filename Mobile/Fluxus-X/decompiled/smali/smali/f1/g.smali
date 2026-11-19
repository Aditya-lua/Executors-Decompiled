.class public final Lf1/g;
.super Lf1/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf1/g$b;
    }
.end annotation


# instance fields
.field public final a:Lf1/c2;

.field public final b:Lf1/a;

.field public final c:I


# direct methods
.method public constructor <init>(Lf1/c2;Lf1/a;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lf1/s;-><init>()V

    .line 3
    iput-object p1, p0, Lf1/g;->a:Lf1/c2;

    .line 4
    iput-object p2, p0, Lf1/g;->b:Lf1/a;

    .line 5
    iput p3, p0, Lf1/g;->c:I

    return-void
.end method

.method public synthetic constructor <init>(Lf1/c2;Lf1/a;ILf1/g$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lf1/g;-><init>(Lf1/c2;Lf1/a;I)V

    return-void
.end method


# virtual methods
.method public b()Lf1/a;
    .locals 1

    iget-object v0, p0, Lf1/g;->b:Lf1/a;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lf1/g;->c:I

    return v0
.end method

.method public d()Lf1/c2;
    .locals 1

    iget-object v0, p0, Lf1/g;->a:Lf1/c2;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lf1/s;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lf1/s;

    iget-object v1, p0, Lf1/g;->a:Lf1/c2;

    invoke-virtual {p1}, Lf1/s;->d()Lf1/c2;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lf1/g;->b:Lf1/a;

    invoke-virtual {p1}, Lf1/s;->b()Lf1/a;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lf1/g;->c:I

    invoke-virtual {p1}, Lf1/s;->c()I

    move-result p1

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lf1/g;->a:Lf1/c2;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v2, p0, Lf1/g;->b:Lf1/a;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v1, p0, Lf1/g;->c:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public i()Lf1/s$a;
    .locals 2

    new-instance v0, Lf1/g$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lf1/g$b;-><init>(Lf1/s;Lf1/g$a;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MediaSpec{videoSpec="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf1/g;->a:Lf1/c2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", audioSpec="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf1/g;->b:Lf1/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", outputFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lf1/g;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
