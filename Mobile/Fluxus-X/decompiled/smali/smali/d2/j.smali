.class public Ld2/j;
.super Ld2/p;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lc2/e;)V
    .locals 1

    invoke-direct {p0, p1}, Ld2/p;-><init>(Lc2/e;)V

    iget-object v0, p1, Lc2/e;->e:Ld2/l;

    invoke-virtual {v0}, Ld2/l;->f()V

    iget-object v0, p1, Lc2/e;->f:Ld2/n;

    invoke-virtual {v0}, Ld2/n;->f()V

    check-cast p1, Lc2/h;

    invoke-virtual {p1}, Lc2/h;->t1()I

    move-result p1

    iput p1, p0, Ld2/p;->f:I

    return-void
.end method


# virtual methods
.method public a(Ld2/d;)V
    .locals 1

    iget-object p1, p0, Ld2/p;->h:Ld2/f;

    iget-boolean v0, p1, Ld2/f;->c:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p1, Ld2/f;->j:Z

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object p1, p1, Ld2/f;->l:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld2/f;

    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    check-cast v0, Lc2/h;

    iget p1, p1, Ld2/f;->g:I

    int-to-float p1, p1

    invoke-virtual {v0}, Lc2/h;->w1()F

    move-result v0

    mul-float/2addr p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    iget-object v0, p0, Ld2/p;->h:Ld2/f;

    invoke-virtual {v0, p1}, Ld2/f;->d(I)V

    return-void
.end method

.method public d()V
    .locals 5

    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    check-cast v0, Lc2/h;

    invoke-virtual {v0}, Lc2/h;->u1()I

    move-result v1

    invoke-virtual {v0}, Lc2/h;->v1()I

    move-result v2

    invoke-virtual {v0}, Lc2/h;->w1()F

    invoke-virtual {v0}, Lc2/h;->t1()I

    move-result v0

    const/4 v3, -0x1

    const/4 v4, 0x1

    if-ne v0, v4, :cond_2

    if-eq v1, v3, :cond_0

    iget-object v0, p0, Ld2/p;->h:Ld2/f;

    iget-object v0, v0, Ld2/f;->l:Ljava/util/List;

    iget-object v2, p0, Ld2/p;->b:Lc2/e;

    iget-object v2, v2, Lc2/e;->a0:Lc2/e;

    iget-object v2, v2, Lc2/e;->e:Ld2/l;

    iget-object v2, v2, Ld2/p;->h:Ld2/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget-object v0, v0, Lc2/e;->a0:Lc2/e;

    iget-object v0, v0, Lc2/e;->e:Ld2/l;

    iget-object v0, v0, Ld2/p;->h:Ld2/f;

    iget-object v0, v0, Ld2/f;->k:Ljava/util/List;

    iget-object v2, p0, Ld2/p;->h:Ld2/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ld2/p;->h:Ld2/f;

    iput v1, v0, Ld2/f;->f:I

    goto :goto_0

    :cond_0
    if-eq v2, v3, :cond_1

    iget-object v0, p0, Ld2/p;->h:Ld2/f;

    iget-object v0, v0, Ld2/f;->l:Ljava/util/List;

    iget-object v1, p0, Ld2/p;->b:Lc2/e;

    iget-object v1, v1, Lc2/e;->a0:Lc2/e;

    iget-object v1, v1, Lc2/e;->e:Ld2/l;

    iget-object v1, v1, Ld2/p;->i:Ld2/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget-object v0, v0, Lc2/e;->a0:Lc2/e;

    iget-object v0, v0, Lc2/e;->e:Ld2/l;

    iget-object v0, v0, Ld2/p;->i:Ld2/f;

    iget-object v0, v0, Ld2/f;->k:Ljava/util/List;

    iget-object v1, p0, Ld2/p;->h:Ld2/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ld2/p;->h:Ld2/f;

    neg-int v1, v2

    iput v1, v0, Ld2/f;->f:I

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ld2/p;->h:Ld2/f;

    iput-boolean v4, v0, Ld2/f;->b:Z

    iget-object v0, v0, Ld2/f;->l:Ljava/util/List;

    iget-object v1, p0, Ld2/p;->b:Lc2/e;

    iget-object v1, v1, Lc2/e;->a0:Lc2/e;

    iget-object v1, v1, Lc2/e;->e:Ld2/l;

    iget-object v1, v1, Ld2/p;->i:Ld2/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget-object v0, v0, Lc2/e;->a0:Lc2/e;

    iget-object v0, v0, Lc2/e;->e:Ld2/l;

    iget-object v0, v0, Ld2/p;->i:Ld2/f;

    iget-object v0, v0, Ld2/f;->k:Ljava/util/List;

    iget-object v1, p0, Ld2/p;->h:Ld2/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget-object v0, v0, Lc2/e;->e:Ld2/l;

    iget-object v0, v0, Ld2/p;->h:Ld2/f;

    invoke-virtual {p0, v0}, Ld2/j;->q(Ld2/f;)V

    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget-object v0, v0, Lc2/e;->e:Ld2/l;

    iget-object v0, v0, Ld2/p;->i:Ld2/f;

    invoke-virtual {p0, v0}, Ld2/j;->q(Ld2/f;)V

    return-void

    :cond_2
    if-eq v1, v3, :cond_3

    iget-object v0, p0, Ld2/p;->h:Ld2/f;

    iget-object v0, v0, Ld2/f;->l:Ljava/util/List;

    iget-object v2, p0, Ld2/p;->b:Lc2/e;

    iget-object v2, v2, Lc2/e;->a0:Lc2/e;

    iget-object v2, v2, Lc2/e;->f:Ld2/n;

    iget-object v2, v2, Ld2/p;->h:Ld2/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget-object v0, v0, Lc2/e;->a0:Lc2/e;

    iget-object v0, v0, Lc2/e;->f:Ld2/n;

    iget-object v0, v0, Ld2/p;->h:Ld2/f;

    iget-object v0, v0, Ld2/f;->k:Ljava/util/List;

    iget-object v2, p0, Ld2/p;->h:Ld2/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ld2/p;->h:Ld2/f;

    iput v1, v0, Ld2/f;->f:I

    goto :goto_1

    :cond_3
    if-eq v2, v3, :cond_4

    iget-object v0, p0, Ld2/p;->h:Ld2/f;

    iget-object v0, v0, Ld2/f;->l:Ljava/util/List;

    iget-object v1, p0, Ld2/p;->b:Lc2/e;

    iget-object v1, v1, Lc2/e;->a0:Lc2/e;

    iget-object v1, v1, Lc2/e;->f:Ld2/n;

    iget-object v1, v1, Ld2/p;->i:Ld2/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget-object v0, v0, Lc2/e;->a0:Lc2/e;

    iget-object v0, v0, Lc2/e;->f:Ld2/n;

    iget-object v0, v0, Ld2/p;->i:Ld2/f;

    iget-object v0, v0, Ld2/f;->k:Ljava/util/List;

    iget-object v1, p0, Ld2/p;->h:Ld2/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ld2/p;->h:Ld2/f;

    neg-int v1, v2

    iput v1, v0, Ld2/f;->f:I

    goto :goto_1

    :cond_4
    iget-object v0, p0, Ld2/p;->h:Ld2/f;

    iput-boolean v4, v0, Ld2/f;->b:Z

    iget-object v0, v0, Ld2/f;->l:Ljava/util/List;

    iget-object v1, p0, Ld2/p;->b:Lc2/e;

    iget-object v1, v1, Lc2/e;->a0:Lc2/e;

    iget-object v1, v1, Lc2/e;->f:Ld2/n;

    iget-object v1, v1, Ld2/p;->i:Ld2/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget-object v0, v0, Lc2/e;->a0:Lc2/e;

    iget-object v0, v0, Lc2/e;->f:Ld2/n;

    iget-object v0, v0, Ld2/p;->i:Ld2/f;

    iget-object v0, v0, Ld2/f;->k:Ljava/util/List;

    iget-object v1, p0, Ld2/p;->h:Ld2/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget-object v0, v0, Lc2/e;->f:Ld2/n;

    iget-object v0, v0, Ld2/p;->h:Ld2/f;

    invoke-virtual {p0, v0}, Ld2/j;->q(Ld2/f;)V

    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget-object v0, v0, Lc2/e;->f:Ld2/n;

    iget-object v0, v0, Ld2/p;->i:Ld2/f;

    invoke-virtual {p0, v0}, Ld2/j;->q(Ld2/f;)V

    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    check-cast v0, Lc2/h;

    invoke-virtual {v0}, Lc2/h;->t1()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget-object v1, p0, Ld2/p;->h:Ld2/f;

    iget v1, v1, Ld2/f;->g:I

    invoke-virtual {v0, v1}, Lc2/e;->n1(I)V

    return-void

    :cond_0
    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget-object v1, p0, Ld2/p;->h:Ld2/f;

    iget v1, v1, Ld2/f;->g:I

    invoke-virtual {v0, v1}, Lc2/e;->o1(I)V

    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Ld2/p;->h:Ld2/f;

    invoke-virtual {v0}, Ld2/f;->c()V

    return-void
.end method

.method public m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final q(Ld2/f;)V
    .locals 1

    iget-object v0, p0, Ld2/p;->h:Ld2/f;

    iget-object v0, v0, Ld2/f;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p1, Ld2/f;->l:Ljava/util/List;

    iget-object v0, p0, Ld2/p;->h:Ld2/f;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
