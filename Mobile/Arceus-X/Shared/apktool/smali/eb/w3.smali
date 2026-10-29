.class public final Leb/w3;
.super Leb/e4;
.source "SourceFile"


# instance fields
.field public final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Leb/e4;-><init>()V

    iput-boolean p1, p0, Leb/w3;->a:Z

    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 4

    check-cast p1, Leb/e4;

    invoke-virtual {p1}, Leb/e4;->zza()I

    move-result v0

    const/16 v1, -0x20

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
    check-cast p1, Leb/w3;

    iget-boolean v0, p0, Leb/w3;->a:Z

    const/16 v1, 0x15

    const/16 v2, 0x14

    const/4 v3, 0x1

    if-eq v3, v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    iget-boolean p1, p1, Leb/w3;->a:Z

    if-eq v3, p1, :cond_2

    move v1, v2

    :cond_2
    sub-int/2addr v0, v1

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    const-class v2, Leb/w3;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    check-cast p1, Leb/w3;

    iget-boolean v2, p0, Leb/w3;->a:Z

    iget-boolean p1, p1, Leb/w3;->a:Z

    if-ne v2, p1, :cond_3

    return v0

    :cond_3
    return v1
.end method

.method public final hashCode()I
    .locals 2

    const/16 v0, -0x20

    invoke-static {v0}, Leb/e4;->c(B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-boolean v1, p0, Leb/w3;->a:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Leb/w3;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()I
    .locals 1

    const/16 v0, -0x20

    invoke-static {v0}, Leb/e4;->c(B)I

    move-result v0

    return v0
.end method
