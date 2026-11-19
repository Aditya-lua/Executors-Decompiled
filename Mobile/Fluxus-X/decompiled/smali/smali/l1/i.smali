.class public final Ll1/i;
.super Ll1/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll1/i$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Ln0/a2$c;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILn0/a2$c;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ll1/p;-><init>()V

    .line 3
    iput-object p1, p0, Ll1/i;->a:Ljava/lang/String;

    .line 4
    iput p2, p0, Ll1/i;->b:I

    .line 5
    iput-object p3, p0, Ll1/i;->c:Ln0/a2$c;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILn0/a2$c;Ll1/i$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ll1/i;-><init>(Ljava/lang/String;ILn0/a2$c;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll1/i;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Ll1/i;->b:I

    return v0
.end method

.method public d()Ln0/a2$c;
    .locals 1

    iget-object v0, p0, Ll1/i;->c:Ln0/a2$c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ll1/p;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Ll1/p;

    iget-object v1, p0, Ll1/i;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ll1/l;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Ll1/i;->b:I

    invoke-virtual {p1}, Ll1/l;->b()I

    move-result v3

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Ll1/i;->c:Ln0/a2$c;

    if-nez v1, :cond_1

    invoke-virtual {p1}, Ll1/p;->d()Ln0/a2$c;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ll1/p;->d()Ln0/a2$c;

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
    .locals 3

    iget-object v0, p0, Ll1/i;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget v2, p0, Ll1/i;->b:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Ll1/i;->c:Ln0/a2$c;

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

    const-string v1, "VideoMimeInfo{mimeType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll1/i;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", profile="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll1/i;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", compatibleVideoProfile="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll1/i;->c:Ln0/a2$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
