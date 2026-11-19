.class public Lj7/l;
.super Lj7/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj7/g<",
        "Lu7/d;",
        ">;"
    }
.end annotation


# instance fields
.field public final i:Lu7/d;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lu7/a<",
            "Lu7/d;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lj7/g;-><init>(Ljava/util/List;)V

    new-instance p1, Lu7/d;

    invoke-direct {p1}, Lu7/d;-><init>()V

    iput-object p1, p0, Lj7/l;->i:Lu7/d;

    return-void
.end method


# virtual methods
.method public bridge synthetic i(Lu7/a;F)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lj7/l;->r(Lu7/a;F)Lu7/d;

    move-result-object p1

    return-object p1
.end method

.method public r(Lu7/a;F)Lu7/d;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu7/a<",
            "Lu7/d;",
            ">;F)",
            "Lu7/d;"
        }
    .end annotation

    iget-object v0, p1, Lu7/a;->b:Ljava/lang/Object;

    if-eqz v0, :cond_2

    iget-object v1, p1, Lu7/a;->c:Ljava/lang/Object;

    if-eqz v1, :cond_2

    move-object v5, v0

    check-cast v5, Lu7/d;

    move-object v6, v1

    check-cast v6, Lu7/d;

    iget-object v2, p0, Lj7/a;->e:Lu7/c;

    if-eqz v2, :cond_0

    iget v3, p1, Lu7/a;->g:F

    iget-object p1, p1, Lu7/a;->h:Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {p0}, Lj7/a;->e()F

    move-result v8

    invoke-virtual {p0}, Lj7/a;->f()F

    move-result v9

    move v7, p2

    invoke-virtual/range {v2 .. v9}, Lu7/c;->b(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu7/d;

    if-eqz p1, :cond_1

    return-object p1

    :cond_0
    move v7, p2

    :cond_1
    iget-object p1, p0, Lj7/l;->i:Lu7/d;

    invoke-virtual {v5}, Lu7/d;->b()F

    move-result p2

    invoke-virtual {v6}, Lu7/d;->b()F

    move-result v0

    invoke-static {p2, v0, v7}, Lt7/j;->i(FFF)F

    move-result p2

    invoke-virtual {v5}, Lu7/d;->c()F

    move-result v0

    invoke-virtual {v6}, Lu7/d;->c()F

    move-result v1

    invoke-static {v0, v1, v7}, Lt7/j;->i(FFF)F

    move-result v0

    invoke-virtual {p1, p2, v0}, Lu7/d;->d(FF)V

    iget-object p1, p0, Lj7/l;->i:Lu7/d;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Missing values for keyframe."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
