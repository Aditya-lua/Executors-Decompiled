.class public final Lm0/e;
.super Lm0/f0$a;
.source "SourceFile"


# instance fields
.field public final a:Lx0/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx0/b0<",
            "[B>;"
        }
    .end annotation
.end field

.field public final b:Lg0/f1$h;


# direct methods
.method public constructor <init>(Lx0/b0;Lg0/f1$h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/b0<",
            "[B>;",
            "Lg0/f1$h;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lm0/f0$a;-><init>()V

    if-eqz p1, :cond_1

    iput-object p1, p0, Lm0/e;->a:Lx0/b0;

    if-eqz p2, :cond_0

    iput-object p2, p0, Lm0/e;->b:Lg0/f1$h;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null outputFileOptions"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null packet"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Lg0/f1$h;
    .locals 1

    iget-object v0, p0, Lm0/e;->b:Lg0/f1$h;

    return-object v0
.end method

.method public b()Lx0/b0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx0/b0<",
            "[B>;"
        }
    .end annotation

    iget-object v0, p0, Lm0/e;->a:Lx0/b0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm0/f0$a;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lm0/f0$a;

    iget-object v1, p0, Lm0/e;->a:Lx0/b0;

    invoke-virtual {p1}, Lm0/f0$a;->b()Lx0/b0;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lm0/e;->b:Lg0/f1$h;

    invoke-virtual {p1}, Lm0/f0$a;->a()Lg0/f1$h;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lm0/e;->a:Lx0/b0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v1, p0, Lm0/e;->b:Lg0/f1$h;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "In{packet="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm0/e;->a:Lx0/b0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", outputFileOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm0/e;->b:Lg0/f1$h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
