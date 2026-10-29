.class public Li7/m;
.super Li7/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li7/a<",
        "Ln7/o;",
        "Landroid/graphics/Path;",
        ">;"
    }
.end annotation


# instance fields
.field public final i:Ln7/o;

.field public final j:Landroid/graphics/Path;

.field public k:Landroid/graphics/Path;

.field public l:Landroid/graphics/Path;

.field public m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lh7/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lt7/a<",
            "Ln7/o;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Li7/a;-><init>(Ljava/util/List;)V

    new-instance p1, Ln7/o;

    invoke-direct {p1}, Ln7/o;-><init>()V

    iput-object p1, p0, Li7/m;->i:Ln7/o;

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Li7/m;->j:Landroid/graphics/Path;

    return-void
.end method


# virtual methods
.method public bridge synthetic i(Lt7/a;F)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Li7/m;->r(Lt7/a;F)Landroid/graphics/Path;

    move-result-object p1

    return-object p1
.end method

.method public p()Z
    .locals 1

    iget-object v0, p0, Li7/m;->m:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public r(Lt7/a;F)Landroid/graphics/Path;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt7/a<",
            "Ln7/o;",
            ">;F)",
            "Landroid/graphics/Path;"
        }
    .end annotation

    iget-object v0, p1, Lt7/a;->b:Ljava/lang/Object;

    check-cast v0, Ln7/o;

    iget-object v1, p1, Lt7/a;->c:Ljava/lang/Object;

    check-cast v1, Ln7/o;

    iget-object v2, p0, Li7/m;->i:Ln7/o;

    if-nez v1, :cond_0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, v1

    :goto_0
    invoke-virtual {v2, v0, v3, p2}, Ln7/o;->c(Ln7/o;Ln7/o;F)V

    iget-object v2, p0, Li7/m;->i:Ln7/o;

    iget-object v3, p0, Li7/m;->m:Ljava/util/List;

    if-eqz v3, :cond_1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    :goto_1
    if-ltz v3, :cond_1

    iget-object v4, p0, Li7/m;->m:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh7/s;

    invoke-interface {v4, v2}, Lh7/s;->d(Ln7/o;)Ln7/o;

    move-result-object v2

    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_1
    iget-object v3, p0, Li7/m;->j:Landroid/graphics/Path;

    invoke-static {v2, v3}, Ls7/j;->h(Ln7/o;Landroid/graphics/Path;)V

    iget-object v2, p0, Li7/a;->e:Lt7/c;

    if-eqz v2, :cond_5

    iget-object v2, p0, Li7/m;->k:Landroid/graphics/Path;

    if-nez v2, :cond_2

    new-instance v2, Landroid/graphics/Path;

    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    iput-object v2, p0, Li7/m;->k:Landroid/graphics/Path;

    new-instance v2, Landroid/graphics/Path;

    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    iput-object v2, p0, Li7/m;->l:Landroid/graphics/Path;

    :cond_2
    iget-object v2, p0, Li7/m;->k:Landroid/graphics/Path;

    invoke-static {v0, v2}, Ls7/j;->h(Ln7/o;Landroid/graphics/Path;)V

    if-eqz v1, :cond_3

    iget-object v0, p0, Li7/m;->l:Landroid/graphics/Path;

    invoke-static {v1, v0}, Ls7/j;->h(Ln7/o;Landroid/graphics/Path;)V

    :cond_3
    iget-object v2, p0, Li7/a;->e:Lt7/c;

    iget v3, p1, Lt7/a;->g:F

    iget-object p1, p1, Lt7/a;->h:Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v4

    iget-object v5, p0, Li7/m;->k:Landroid/graphics/Path;

    if-nez v1, :cond_4

    move-object v6, v5

    goto :goto_2

    :cond_4
    iget-object p1, p0, Li7/m;->l:Landroid/graphics/Path;

    move-object v6, p1

    :goto_2
    invoke-virtual {p0}, Li7/a;->e()F

    move-result v8

    invoke-virtual {p0}, Li7/a;->f()F

    move-result v9

    move v7, p2

    invoke-virtual/range {v2 .. v9}, Lt7/c;->b(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Path;

    return-object p1

    :cond_5
    iget-object p1, p0, Li7/m;->j:Landroid/graphics/Path;

    return-object p1
.end method

.method public s(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lh7/s;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Li7/m;->m:Ljava/util/List;

    return-void
.end method
