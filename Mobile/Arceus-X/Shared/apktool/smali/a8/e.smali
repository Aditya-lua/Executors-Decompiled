.class public final La8/e;
.super La8/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La8/e$b;
    }
.end annotation


# instance fields
.field public final a:La8/k$b;

.field public final b:La8/a;


# direct methods
.method public constructor <init>(La8/k$b;La8/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, La8/k;-><init>()V

    .line 3
    iput-object p1, p0, La8/e;->a:La8/k$b;

    .line 4
    iput-object p2, p0, La8/e;->b:La8/a;

    return-void
.end method

.method public synthetic constructor <init>(La8/k$b;La8/a;La8/e$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, La8/e;-><init>(La8/k$b;La8/a;)V

    return-void
.end method


# virtual methods
.method public b()La8/a;
    .locals 1

    iget-object v0, p0, La8/e;->b:La8/a;

    return-object v0
.end method

.method public c()La8/k$b;
    .locals 1

    iget-object v0, p0, La8/e;->a:La8/k$b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, La8/k;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    check-cast p1, La8/k;

    iget-object v1, p0, La8/e;->a:La8/k$b;

    if-nez v1, :cond_1

    invoke-virtual {p1}, La8/k;->c()La8/k$b;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, La8/k;->c()La8/k$b;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    iget-object v1, p0, La8/e;->b:La8/a;

    if-nez v1, :cond_2

    invoke-virtual {p1}, La8/k;->b()La8/a;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, La8/k;->b()La8/a;

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
    .locals 3

    iget-object v0, p0, La8/e;->a:La8/k$b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const v2, 0xf4243

    xor-int/2addr v0, v2

    mul-int/2addr v0, v2

    iget-object v2, p0, La8/e;->b:La8/a;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ClientInfo{clientType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La8/e;->a:La8/k$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", androidClientInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La8/e;->b:La8/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
