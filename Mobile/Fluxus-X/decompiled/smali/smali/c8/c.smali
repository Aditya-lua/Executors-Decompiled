.class public final Lc8/c;
.super Lc8/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc8/c$b;
    }
.end annotation


# instance fields
.field public final a:Lc8/o;

.field public final b:Ljava/lang/String;

.field public final c:Lz7/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz7/d<",
            "*>;"
        }
    .end annotation
.end field

.field public final d:Lz7/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz7/g<",
            "*[B>;"
        }
    .end annotation
.end field

.field public final e:Lz7/c;


# direct methods
.method public constructor <init>(Lc8/o;Ljava/lang/String;Lz7/d;Lz7/g;Lz7/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc8/o;",
            "Ljava/lang/String;",
            "Lz7/d<",
            "*>;",
            "Lz7/g<",
            "*[B>;",
            "Lz7/c;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Lc8/n;-><init>()V

    .line 3
    iput-object p1, p0, Lc8/c;->a:Lc8/o;

    .line 4
    iput-object p2, p0, Lc8/c;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lc8/c;->c:Lz7/d;

    .line 6
    iput-object p4, p0, Lc8/c;->d:Lz7/g;

    .line 7
    iput-object p5, p0, Lc8/c;->e:Lz7/c;

    return-void
.end method

.method public synthetic constructor <init>(Lc8/o;Ljava/lang/String;Lz7/d;Lz7/g;Lz7/c;Lc8/c$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lc8/c;-><init>(Lc8/o;Ljava/lang/String;Lz7/d;Lz7/g;Lz7/c;)V

    return-void
.end method


# virtual methods
.method public b()Lz7/c;
    .locals 1

    iget-object v0, p0, Lc8/c;->e:Lz7/c;

    return-object v0
.end method

.method public c()Lz7/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lz7/d<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lc8/c;->c:Lz7/d;

    return-object v0
.end method

.method public e()Lz7/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lz7/g<",
            "*[B>;"
        }
    .end annotation

    iget-object v0, p0, Lc8/c;->d:Lz7/g;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lc8/n;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lc8/n;

    iget-object v1, p0, Lc8/c;->a:Lc8/o;

    invoke-virtual {p1}, Lc8/n;->f()Lc8/o;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lc8/c;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lc8/n;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lc8/c;->c:Lz7/d;

    invoke-virtual {p1}, Lc8/n;->c()Lz7/d;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lc8/c;->d:Lz7/g;

    invoke-virtual {p1}, Lc8/n;->e()Lz7/g;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lc8/c;->e:Lz7/c;

    invoke-virtual {p1}, Lc8/n;->b()Lz7/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Lz7/c;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public f()Lc8/o;
    .locals 1

    iget-object v0, p0, Lc8/c;->a:Lc8/o;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc8/c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lc8/c;->a:Lc8/o;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v2, p0, Lc8/c;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lc8/c;->c:Lz7/d;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lc8/c;->d:Lz7/g;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lc8/c;->e:Lz7/c;

    invoke-virtual {v1}, Lz7/c;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SendRequest{transportContext="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc8/c;->a:Lc8/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transportName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc8/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", event="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc8/c;->c:Lz7/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transformer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc8/c;->d:Lz7/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", encoding="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lc8/c;->e:Lz7/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
