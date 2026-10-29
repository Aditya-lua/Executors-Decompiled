.class public Li7/o;
.super Li7/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li7/g<",
        "Ll7/b;",
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
            "Ll7/b;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Li7/g;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic i(Lt7/a;F)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Li7/o;->r(Lt7/a;F)Ll7/b;

    move-result-object p1

    return-object p1
.end method

.method public r(Lt7/a;F)Ll7/b;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt7/a<",
            "Ll7/b;",
            ">;F)",
            "Ll7/b;"
        }
    .end annotation

    iget-object v0, p0, Li7/a;->e:Lt7/c;

    if-eqz v0, :cond_2

    iget v1, p1, Lt7/a;->g:F

    iget-object v2, p1, Lt7/a;->h:Ljava/lang/Float;

    if-nez v2, :cond_0

    const v2, 0x7f7fffff    # Float.MAX_VALUE

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    :goto_0
    iget-object v3, p1, Lt7/a;->b:Ljava/lang/Object;

    move-object v4, v3

    move-object v3, v4

    check-cast v3, Ll7/b;

    iget-object p1, p1, Lt7/a;->c:Ljava/lang/Object;

    if-nez p1, :cond_1

    move-object p1, v4

    check-cast p1, Ll7/b;

    :goto_1
    move-object v4, p1

    goto :goto_2

    :cond_1
    check-cast p1, Ll7/b;

    goto :goto_1

    :goto_2
    invoke-virtual {p0}, Li7/a;->d()F

    move-result v6

    invoke-virtual {p0}, Li7/a;->f()F

    move-result v7

    move v5, p2

    invoke-virtual/range {v0 .. v7}, Lt7/c;->b(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll7/b;

    return-object p1

    :cond_2
    move v5, p2

    const/high16 p2, 0x3f800000    # 1.0f

    cmpl-float p2, v5, p2

    if-nez p2, :cond_4

    iget-object p2, p1, Lt7/a;->c:Ljava/lang/Object;

    if-nez p2, :cond_3

    goto :goto_3

    :cond_3
    check-cast p2, Ll7/b;

    return-object p2

    :cond_4
    :goto_3
    iget-object p1, p1, Lt7/a;->b:Ljava/lang/Object;

    check-cast p1, Ll7/b;

    return-object p1
.end method

.method public s(Lt7/c;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt7/c<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lt7/b;

    invoke-direct {v0}, Lt7/b;-><init>()V

    new-instance v1, Ll7/b;

    invoke-direct {v1}, Ll7/b;-><init>()V

    new-instance v2, Li7/o$a;

    invoke-direct {v2, p0, v0, p1, v1}, Li7/o$a;-><init>(Li7/o;Lt7/b;Lt7/c;Ll7/b;)V

    invoke-super {p0, v2}, Li7/a;->o(Lt7/c;)V

    return-void
.end method
