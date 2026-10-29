.class public Lm7/c;
.super Lm7/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lm7/p<",
        "Ln7/d;",
        "Ln7/d;",
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
            "Lt7/a<",
            "Ln7/d;",
            ">;>;)V"
        }
    .end annotation

    invoke-static {p1}, Lm7/c;->e(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lm7/p;-><init>(Ljava/util/List;)V

    return-void
.end method

.method public static d(Lt7/a;)Lt7/a;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt7/a<",
            "Ln7/d;",
            ">;)",
            "Lt7/a<",
            "Ln7/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lt7/a;->b:Ljava/lang/Object;

    check-cast v0, Ln7/d;

    iget-object v1, p0, Lt7/a;->c:Ljava/lang/Object;

    check-cast v1, Ln7/d;

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ln7/d;->e()[F

    move-result-object v2

    array-length v2, v2

    invoke-virtual {v1}, Ln7/d;->e()[F

    move-result-object v3

    array-length v3, v3

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ln7/d;->e()[F

    move-result-object v2

    invoke-virtual {v1}, Ln7/d;->e()[F

    move-result-object v3

    invoke-static {v2, v3}, Lm7/c;->f([F[F)[F

    move-result-object v2

    invoke-virtual {v0, v2}, Ln7/d;->b([F)Ln7/d;

    move-result-object v0

    invoke-virtual {v1, v2}, Ln7/d;->b([F)Ln7/d;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lt7/a;->b(Ljava/lang/Object;Ljava/lang/Object;)Lt7/a;

    move-result-object p0

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static e(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lt7/a<",
            "Ln7/d;",
            ">;>;)",
            "Ljava/util/List<",
            "Lt7/a<",
            "Ln7/d;",
            ">;>;"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt7/a;

    invoke-static {v1}, Lm7/c;->d(Lt7/a;)Lt7/a;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public static f([F[F)[F
    .locals 6

    array-length v0, p0

    array-length v1, p1

    add-int/2addr v0, v1

    new-array v1, v0, [F

    array-length v2, p0

    const/4 v3, 0x0

    invoke-static {p0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length p0, p0

    array-length v2, p1

    invoke-static {p1, v3, v1, p0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v1}, Ljava/util/Arrays;->sort([F)V

    const/high16 p0, 0x7fc00000    # Float.NaN

    move p1, v3

    move v2, p1

    :goto_0
    if-ge p1, v0, :cond_1

    aget v4, v1, p1

    cmpl-float v5, v4, p0

    if-eqz v5, :cond_0

    aput v4, v1, v2

    add-int/lit8 v2, v2, 0x1

    aget p0, v1, p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v1, v3, v2}, Ljava/util/Arrays;->copyOfRange([FII)[F

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Li7/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/a<",
            "Ln7/d;",
            "Ln7/d;",
            ">;"
        }
    .end annotation

    new-instance v0, Li7/e;

    iget-object v1, p0, Lm7/p;->a:Ljava/util/List;

    invoke-direct {v0, v1}, Li7/e;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/util/List;
    .locals 1

    invoke-super {p0}, Lm7/p;->b()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Z
    .locals 1

    invoke-super {p0}, Lm7/p;->c()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lm7/p;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
