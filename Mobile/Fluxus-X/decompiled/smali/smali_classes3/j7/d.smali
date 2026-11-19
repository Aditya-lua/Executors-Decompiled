.class public Lj7/d;
.super Lj7/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj7/g<",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lu7/a<",
            "Ljava/lang/Float;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lj7/g;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic i(Lu7/a;F)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lj7/d;->t(Lu7/a;F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public r()F
    .locals 2

    invoke-virtual {p0}, Lj7/a;->b()Lu7/a;

    move-result-object v0

    invoke-virtual {p0}, Lj7/a;->d()F

    move-result v1

    invoke-virtual {p0, v0, v1}, Lj7/d;->s(Lu7/a;F)F

    move-result v0

    return v0
.end method

.method public s(Lu7/a;F)F
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu7/a<",
            "Ljava/lang/Float;",
            ">;F)F"
        }
    .end annotation

    iget-object v0, p1, Lu7/a;->b:Ljava/lang/Object;

    if-eqz v0, :cond_2

    iget-object v0, p1, Lu7/a;->c:Ljava/lang/Object;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lj7/a;->e:Lu7/c;

    if-eqz v1, :cond_0

    iget v2, p1, Lu7/a;->g:F

    iget-object v0, p1, Lu7/a;->h:Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v3

    iget-object v0, p1, Lu7/a;->b:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/Float;

    iget-object v0, p1, Lu7/a;->c:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/Float;

    invoke-virtual {p0}, Lj7/a;->e()F

    move-result v7

    invoke-virtual {p0}, Lj7/a;->f()F

    move-result v8

    move v6, p2

    invoke-virtual/range {v1 .. v8}, Lu7/c;->b(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Float;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p1

    return p1

    :cond_0
    move v6, p2

    :cond_1
    invoke-virtual {p1}, Lu7/a;->g()F

    move-result p2

    invoke-virtual {p1}, Lu7/a;->d()F

    move-result p1

    invoke-static {p2, p1, v6}, Lt7/j;->i(FFF)F

    move-result p1

    return p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Missing values for keyframe."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public t(Lu7/a;F)Ljava/lang/Float;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu7/a<",
            "Ljava/lang/Float;",
            ">;F)",
            "Ljava/lang/Float;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lj7/d;->s(Lu7/a;F)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
