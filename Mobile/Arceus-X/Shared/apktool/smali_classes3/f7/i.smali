.class public Lf7/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lf7/u0;

.field public final b:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lo7/e;",
            ">;>;"
        }
    .end annotation
.end field

.field public d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lf7/k0;",
            ">;"
        }
    .end annotation
.end field

.field public e:F

.field public f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ll7/c;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ll7/h;",
            ">;"
        }
    .end annotation
.end field

.field public h:Lw1/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw1/k<",
            "Ll7/d;",
            ">;"
        }
    .end annotation
.end field

.field public i:Lw1/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw1/g<",
            "Lo7/e;",
            ">;"
        }
    .end annotation
.end field

.field public j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo7/e;",
            ">;"
        }
    .end annotation
.end field

.field public k:Landroid/graphics/Rect;

.field public l:F

.field public m:F

.field public n:F

.field public o:Z

.field public p:I

.field public q:I

.field public r:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lf7/u0;

    invoke-direct {v0}, Lf7/u0;-><init>()V

    iput-object v0, p0, Lf7/i;->a:Lf7/u0;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lf7/i;->b:Ljava/util/HashSet;

    const/4 v0, 0x0

    iput v0, p0, Lf7/i;->p:I

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Ls7/e;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lf7/i;->b:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lf7/i;->k:Landroid/graphics/Rect;

    return-object v0
.end method

.method public c()Lw1/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw1/k<",
            "Ll7/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lf7/i;->h:Lw1/k;

    return-object v0
.end method

.method public d()F
    .locals 2

    invoke-virtual {p0}, Lf7/i;->e()F

    move-result v0

    iget v1, p0, Lf7/i;->n:F

    div-float/2addr v0, v1

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    float-to-long v0, v0

    long-to-float v0, v0

    return v0
.end method

.method public e()F
    .locals 2

    iget v0, p0, Lf7/i;->m:F

    iget v1, p0, Lf7/i;->l:F

    sub-float/2addr v0, v1

    return v0
.end method

.method public f()F
    .locals 1

    iget v0, p0, Lf7/i;->m:F

    return v0
.end method

.method public g()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ll7/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lf7/i;->f:Ljava/util/Map;

    return-object v0
.end method

.method public h(F)F
    .locals 2

    iget v0, p0, Lf7/i;->l:F

    iget v1, p0, Lf7/i;->m:F

    invoke-static {v0, v1, p1}, Ls7/j;->i(FFF)F

    move-result p1

    return p1
.end method

.method public i()F
    .locals 1

    iget v0, p0, Lf7/i;->n:F

    return v0
.end method

.method public j()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lf7/k0;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ls7/m;->e()F

    move-result v0

    iget v1, p0, Lf7/i;->e:F

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lf7/i;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    iget-object v3, p0, Lf7/i;->d:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf7/k0;

    iget v5, p0, Lf7/i;->e:F

    div-float/2addr v5, v0

    invoke-virtual {v2, v5}, Lf7/k0;->a(F)Lf7/k0;

    move-result-object v2

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iput v0, p0, Lf7/i;->e:F

    iget-object v0, p0, Lf7/i;->d:Ljava/util/Map;

    return-object v0
.end method

.method public k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lo7/e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lf7/i;->j:Ljava/util/List;

    return-object v0
.end method

.method public l(Ljava/lang/String;)Ll7/h;
    .locals 4

    iget-object v0, p0, Lf7/i;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lf7/i;->g:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll7/h;

    invoke-virtual {v2, p1}, Ll7/h;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public m()I
    .locals 1

    iget v0, p0, Lf7/i;->p:I

    return v0
.end method

.method public n()Lf7/u0;
    .locals 1

    iget-object v0, p0, Lf7/i;->a:Lf7/u0;

    return-object v0
.end method

.method public o(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lo7/e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lf7/i;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public p()F
    .locals 1

    iget v0, p0, Lf7/i;->l:F

    return v0
.end method

.method public q()Z
    .locals 1

    iget-boolean v0, p0, Lf7/i;->o:Z

    return v0
.end method

.method public r(I)V
    .locals 1

    iget v0, p0, Lf7/i;->p:I

    add-int/2addr v0, p1

    iput v0, p0, Lf7/i;->p:I

    return-void
.end method

.method public s(Landroid/graphics/Rect;FFFLjava/util/List;Lw1/g;Ljava/util/Map;Ljava/util/Map;FLw1/k;Ljava/util/Map;Ljava/util/List;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Rect;",
            "FFF",
            "Ljava/util/List<",
            "Lo7/e;",
            ">;",
            "Lw1/g<",
            "Lo7/e;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lo7/e;",
            ">;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lf7/k0;",
            ">;F",
            "Lw1/k<",
            "Ll7/d;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ll7/c;",
            ">;",
            "Ljava/util/List<",
            "Ll7/h;",
            ">;II)V"
        }
    .end annotation

    iput-object p1, p0, Lf7/i;->k:Landroid/graphics/Rect;

    iput p2, p0, Lf7/i;->l:F

    iput p3, p0, Lf7/i;->m:F

    iput p4, p0, Lf7/i;->n:F

    iput-object p5, p0, Lf7/i;->j:Ljava/util/List;

    iput-object p6, p0, Lf7/i;->i:Lw1/g;

    iput-object p7, p0, Lf7/i;->c:Ljava/util/Map;

    iput-object p8, p0, Lf7/i;->d:Ljava/util/Map;

    iput p9, p0, Lf7/i;->e:F

    iput-object p10, p0, Lf7/i;->h:Lw1/k;

    iput-object p11, p0, Lf7/i;->f:Ljava/util/Map;

    iput-object p12, p0, Lf7/i;->g:Ljava/util/List;

    iput p13, p0, Lf7/i;->q:I

    iput p14, p0, Lf7/i;->r:I

    return-void
.end method

.method public t(J)Lo7/e;
    .locals 1

    iget-object v0, p0, Lf7/i;->i:Lw1/g;

    invoke-virtual {v0, p1, p2}, Lw1/g;->e(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo7/e;

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LottieComposition:\n"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lf7/i;->j:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo7/e;

    const-string v3, "\t"

    invoke-virtual {v2, v3}, Lo7/e;->z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Z)V
    .locals 0

    iput-boolean p1, p0, Lf7/i;->o:Z

    return-void
.end method

.method public v(Z)V
    .locals 1

    iget-object v0, p0, Lf7/i;->a:Lf7/u0;

    invoke-virtual {v0, p1}, Lf7/u0;->b(Z)V

    return-void
.end method
