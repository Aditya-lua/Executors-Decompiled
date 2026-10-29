.class public final Leb/x3;
.super Leb/e4;
.source "SourceFile"


# instance fields
.field public final a:Leb/m3;


# direct methods
.method public constructor <init>(Leb/m3;)V
    .locals 0

    invoke-direct {p0}, Leb/e4;-><init>()V

    iput-object p1, p0, Leb/x3;->a:Leb/m3;

    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 4

    check-cast p1, Leb/e4;

    invoke-virtual {p1}, Leb/e4;->zza()I

    move-result v0

    const/16 v1, 0x40

    invoke-static {v1}, Leb/e4;->c(B)I

    move-result v2

    if-eq v2, v0, :cond_0

    invoke-virtual {p1}, Leb/e4;->zza()I

    move-result p1

    invoke-static {v1}, Leb/e4;->c(B)I

    move-result v0

    sub-int/2addr v0, p1

    return v0

    :cond_0
    check-cast p1, Leb/x3;

    iget-object v0, p0, Leb/x3;->a:Leb/m3;

    invoke-virtual {v0}, Leb/m3;->d()I

    move-result v1

    iget-object v2, p1, Leb/x3;->a:Leb/m3;

    invoke-virtual {v2}, Leb/m3;->d()I

    move-result v3

    if-eq v1, v3, :cond_1

    invoke-virtual {v0}, Leb/m3;->d()I

    move-result p1

    invoke-virtual {v2}, Leb/m3;->d()I

    move-result v0

    sub-int/2addr p1, v0

    return p1

    :cond_1
    invoke-virtual {v0}, Leb/m3;->p()[B

    move-result-object v0

    iget-object p1, p1, Leb/x3;->a:Leb/m3;

    invoke-virtual {p1}, Leb/m3;->p()[B

    move-result-object p1

    invoke-static {}, Leb/b3;->a()Ljava/util/Comparator;

    move-result-object v1

    invoke-interface {v1, v0, p1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    const-class v1, Leb/x3;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    check-cast p1, Leb/x3;

    iget-object v0, p0, Leb/x3;->a:Leb/m3;

    iget-object p1, p1, Leb/x3;->a:Leb/m3;

    invoke-virtual {v0, p1}, Leb/m3;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    const/16 v0, 0x40

    invoke-static {v0}, Leb/e4;->c(B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Leb/x3;->a:Leb/m3;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final q()Leb/m3;
    .locals 1

    iget-object v0, p0, Leb/x3;->a:Leb/m3;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    invoke-static {}, Leb/u2;->d()Leb/u2;

    move-result-object v0

    invoke-virtual {v0}, Leb/u2;->c()Leb/u2;

    move-result-object v0

    iget-object v1, p0, Leb/x3;->a:Leb/m3;

    invoke-virtual {v1}, Leb/m3;->p()[B

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Leb/u2;->e([BII)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "h\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\'"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()I
    .locals 1

    const/16 v0, 0x40

    invoke-static {v0}, Leb/e4;->c(B)I

    move-result v0

    return v0
.end method
