.class public final Lm0/c;
.super Lm0/y$a;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/camera/core/d;

.field public final b:I

.field public final c:Lg0/f1$h;


# direct methods
.method public constructor <init>(Landroidx/camera/core/d;ILg0/f1$h;)V
    .locals 0

    invoke-direct {p0}, Lm0/y$a;-><init>()V

    if-eqz p1, :cond_1

    iput-object p1, p0, Lm0/c;->a:Landroidx/camera/core/d;

    iput p2, p0, Lm0/c;->b:I

    if-eqz p3, :cond_0

    iput-object p3, p0, Lm0/c;->c:Lg0/f1$h;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null outputFileOptions"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null imageProxy"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Landroidx/camera/core/d;
    .locals 1

    iget-object v0, p0, Lm0/c;->a:Landroidx/camera/core/d;

    return-object v0
.end method

.method public b()Lg0/f1$h;
    .locals 1

    iget-object v0, p0, Lm0/c;->c:Lg0/f1$h;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lm0/c;->b:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm0/y$a;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lm0/y$a;

    iget-object v1, p0, Lm0/c;->a:Landroidx/camera/core/d;

    invoke-virtual {p1}, Lm0/y$a;->a()Landroidx/camera/core/d;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lm0/c;->b:I

    invoke-virtual {p1}, Lm0/y$a;->c()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lm0/c;->c:Lg0/f1$h;

    invoke-virtual {p1}, Lm0/y$a;->b()Lg0/f1$h;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lm0/c;->a:Landroidx/camera/core/d;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget v2, p0, Lm0/c;->b:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lm0/c;->c:Lg0/f1$h;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "In{imageProxy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm0/c;->a:Landroidx/camera/core/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rotationDegrees="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lm0/c;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", outputFileOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm0/c;->c:Lg0/f1$h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
