.class public final Ln0/q;
.super Ln0/o3$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln0/q$b;
    }
.end annotation


# instance fields
.field public final a:Ln0/u1;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ln0/u1;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:I

.field public final f:Lg0/k0;


# direct methods
.method public constructor <init>(Ln0/u1;Ljava/util/List;Ljava/lang/String;IILg0/k0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/u1;",
            "Ljava/util/List<",
            "Ln0/u1;",
            ">;",
            "Ljava/lang/String;",
            "II",
            "Lg0/k0;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ln0/o3$f;-><init>()V

    .line 3
    iput-object p1, p0, Ln0/q;->a:Ln0/u1;

    .line 4
    iput-object p2, p0, Ln0/q;->b:Ljava/util/List;

    .line 5
    iput-object p3, p0, Ln0/q;->c:Ljava/lang/String;

    .line 6
    iput p4, p0, Ln0/q;->d:I

    .line 7
    iput p5, p0, Ln0/q;->e:I

    .line 8
    iput-object p6, p0, Ln0/q;->f:Lg0/k0;

    return-void
.end method

.method public synthetic constructor <init>(Ln0/u1;Ljava/util/List;Ljava/lang/String;IILg0/k0;Ln0/q$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Ln0/q;-><init>(Ln0/u1;Ljava/util/List;Ljava/lang/String;IILg0/k0;)V

    return-void
.end method


# virtual methods
.method public b()Lg0/k0;
    .locals 1

    iget-object v0, p0, Ln0/q;->f:Lg0/k0;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Ln0/q;->d:I

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln0/q;->c:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ln0/u1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln0/q;->b:Ljava/util/List;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ln0/o3$f;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Ln0/o3$f;

    iget-object v1, p0, Ln0/q;->a:Ln0/u1;

    invoke-virtual {p1}, Ln0/o3$f;->f()Ln0/u1;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ln0/q;->b:Ljava/util/List;

    invoke-virtual {p1}, Ln0/o3$f;->e()Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ln0/q;->c:Ljava/lang/String;

    if-nez v1, :cond_1

    invoke-virtual {p1}, Ln0/o3$f;->d()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ln0/o3$f;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_0
    iget v1, p0, Ln0/q;->d:I

    invoke-virtual {p1}, Ln0/o3$f;->c()I

    move-result v3

    if-ne v1, v3, :cond_2

    iget v1, p0, Ln0/q;->e:I

    invoke-virtual {p1}, Ln0/o3$f;->g()I

    move-result v3

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Ln0/q;->f:Lg0/k0;

    invoke-virtual {p1}, Ln0/o3$f;->b()Lg0/k0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lg0/k0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public f()Ln0/u1;
    .locals 1

    iget-object v0, p0, Ln0/q;->a:Ln0/u1;

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Ln0/q;->e:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Ln0/q;->a:Ln0/u1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int/2addr v0, v1

    iget-object v2, p0, Ln0/q;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Ln0/q;->c:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Ln0/q;->d:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Ln0/q;->e:I

    xor-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Ln0/q;->f:Lg0/k0;

    invoke-virtual {v1}, Lg0/k0;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OutputConfig{surface="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln0/q;->a:Ln0/u1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sharedSurfaces="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln0/q;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", physicalCameraId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln0/q;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mirrorMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ln0/q;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", surfaceGroupId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ln0/q;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", dynamicRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln0/q;->f:Lg0/k0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
