.class public final Lg0/e;
.super Lg0/w;
.source "SourceFile"


# instance fields
.field public final a:Lg0/w$b;

.field public final b:Lg0/w$a;


# direct methods
.method public constructor <init>(Lg0/w$b;Lg0/w$a;)V
    .locals 0

    invoke-direct {p0}, Lg0/w;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lg0/e;->a:Lg0/w$b;

    iput-object p2, p0, Lg0/e;->b:Lg0/w$a;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null type"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public c()Lg0/w$a;
    .locals 1

    iget-object v0, p0, Lg0/e;->b:Lg0/w$a;

    return-object v0
.end method

.method public d()Lg0/w$b;
    .locals 1

    iget-object v0, p0, Lg0/e;->a:Lg0/w$b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lg0/w;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lg0/w;

    iget-object v1, p0, Lg0/e;->a:Lg0/w$b;

    invoke-virtual {p1}, Lg0/w;->d()Lg0/w$b;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lg0/e;->b:Lg0/w$a;

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lg0/w;->c()Lg0/w$a;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lg0/w;->c()Lg0/w$a;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lg0/e;->a:Lg0/w$b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v1, p0, Lg0/e;->b:Lg0/w$a;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CameraState{type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg0/e;->a:Lg0/w$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", error="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lg0/e;->b:Lg0/w$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
