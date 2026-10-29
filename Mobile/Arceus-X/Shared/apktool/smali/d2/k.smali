.class public Ld2/k;
.super Ld2/p;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lc2/e;)V
    .locals 0

    invoke-direct {p0, p1}, Ld2/p;-><init>(Lc2/e;)V

    return-void
.end method

.method private q(Ld2/f;)V
    .locals 1

    iget-object v0, p0, Ld2/p;->h:Ld2/f;

    iget-object v0, v0, Ld2/f;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p1, Ld2/f;->l:Ljava/util/List;

    iget-object v0, p0, Ld2/p;->h:Ld2/f;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public a(Ld2/d;)V
    .locals 6

    iget-object p1, p0, Ld2/p;->b:Lc2/e;

    check-cast p1, Lc2/a;

    invoke-virtual {p1}, Lc2/a;->w1()I

    move-result v0

    iget-object v1, p0, Ld2/p;->h:Ld2/f;

    iget-object v1, v1, Ld2/f;->l:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    move v4, v2

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ld2/f;

    iget v5, v5, Ld2/f;->g:I

    if-eq v4, v2, :cond_1

    if-ge v5, v4, :cond_2

    :cond_1
    move v4, v5

    :cond_2
    if-ge v3, v5, :cond_0

    move v3, v5

    goto :goto_0

    :cond_3
    if-eqz v0, :cond_5

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    goto :goto_1

    :cond_4
    iget-object v0, p0, Ld2/p;->h:Ld2/f;

    invoke-virtual {p1}, Lc2/a;->x1()I

    move-result p1

    add-int/2addr v3, p1

    invoke-virtual {v0, v3}, Ld2/f;->d(I)V

    return-void

    :cond_5
    :goto_1
    iget-object v0, p0, Ld2/p;->h:Ld2/f;

    invoke-virtual {p1}, Lc2/a;->x1()I

    move-result p1

    add-int/2addr v4, p1

    invoke-virtual {v0, v4}, Ld2/f;->d(I)V

    return-void
.end method

.method public d()V
    .locals 7

    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    instance-of v1, v0, Lc2/a;

    if-eqz v1, :cond_c

    iget-object v1, p0, Ld2/p;->h:Ld2/f;

    const/4 v2, 0x1

    iput-boolean v2, v1, Ld2/f;->b:Z

    check-cast v0, Lc2/a;

    invoke-virtual {v0}, Lc2/a;->w1()I

    move-result v1

    invoke-virtual {v0}, Lc2/a;->v1()Z

    move-result v3

    const/16 v4, 0x8

    const/4 v5, 0x0

    if-eqz v1, :cond_9

    if-eq v1, v2, :cond_6

    const/4 v2, 0x2

    if-eq v1, v2, :cond_3

    const/4 v2, 0x3

    if-eq v1, v2, :cond_0

    goto/16 :goto_8

    :cond_0
    iget-object v1, p0, Ld2/p;->h:Ld2/f;

    sget-object v2, Ld2/f$a;->g:Ld2/f$a;

    iput-object v2, v1, Ld2/f;->e:Ld2/f$a;

    :goto_0
    iget v1, v0, Lc2/j;->M0:I

    if-ge v5, v1, :cond_2

    iget-object v1, v0, Lc2/j;->L0:[Lc2/e;

    aget-object v1, v1, v5

    if-nez v3, :cond_1

    invoke-virtual {v1}, Lc2/e;->V()I

    move-result v2

    if-ne v2, v4, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, v1, Lc2/e;->f:Ld2/n;

    iget-object v1, v1, Ld2/p;->i:Ld2/f;

    iget-object v2, v1, Ld2/f;->k:Ljava/util/List;

    iget-object v6, p0, Ld2/p;->h:Ld2/f;

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Ld2/p;->h:Ld2/f;

    iget-object v2, v2, Ld2/f;->l:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget-object v0, v0, Lc2/e;->f:Ld2/n;

    iget-object v0, v0, Ld2/p;->h:Ld2/f;

    invoke-direct {p0, v0}, Ld2/k;->q(Ld2/f;)V

    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget-object v0, v0, Lc2/e;->f:Ld2/n;

    iget-object v0, v0, Ld2/p;->i:Ld2/f;

    invoke-direct {p0, v0}, Ld2/k;->q(Ld2/f;)V

    return-void

    :cond_3
    iget-object v1, p0, Ld2/p;->h:Ld2/f;

    sget-object v2, Ld2/f$a;->f:Ld2/f$a;

    iput-object v2, v1, Ld2/f;->e:Ld2/f$a;

    :goto_2
    iget v1, v0, Lc2/j;->M0:I

    if-ge v5, v1, :cond_5

    iget-object v1, v0, Lc2/j;->L0:[Lc2/e;

    aget-object v1, v1, v5

    if-nez v3, :cond_4

    invoke-virtual {v1}, Lc2/e;->V()I

    move-result v2

    if-ne v2, v4, :cond_4

    goto :goto_3

    :cond_4
    iget-object v1, v1, Lc2/e;->f:Ld2/n;

    iget-object v1, v1, Ld2/p;->h:Ld2/f;

    iget-object v2, v1, Ld2/f;->k:Ljava/util/List;

    iget-object v6, p0, Ld2/p;->h:Ld2/f;

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Ld2/p;->h:Ld2/f;

    iget-object v2, v2, Ld2/f;->l:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_5
    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget-object v0, v0, Lc2/e;->f:Ld2/n;

    iget-object v0, v0, Ld2/p;->h:Ld2/f;

    invoke-direct {p0, v0}, Ld2/k;->q(Ld2/f;)V

    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget-object v0, v0, Lc2/e;->f:Ld2/n;

    iget-object v0, v0, Ld2/p;->i:Ld2/f;

    invoke-direct {p0, v0}, Ld2/k;->q(Ld2/f;)V

    return-void

    :cond_6
    iget-object v1, p0, Ld2/p;->h:Ld2/f;

    sget-object v2, Ld2/f$a;->e:Ld2/f$a;

    iput-object v2, v1, Ld2/f;->e:Ld2/f$a;

    :goto_4
    iget v1, v0, Lc2/j;->M0:I

    if-ge v5, v1, :cond_8

    iget-object v1, v0, Lc2/j;->L0:[Lc2/e;

    aget-object v1, v1, v5

    if-nez v3, :cond_7

    invoke-virtual {v1}, Lc2/e;->V()I

    move-result v2

    if-ne v2, v4, :cond_7

    goto :goto_5

    :cond_7
    iget-object v1, v1, Lc2/e;->e:Ld2/l;

    iget-object v1, v1, Ld2/p;->i:Ld2/f;

    iget-object v2, v1, Ld2/f;->k:Ljava/util/List;

    iget-object v6, p0, Ld2/p;->h:Ld2/f;

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Ld2/p;->h:Ld2/f;

    iget-object v2, v2, Ld2/f;->l:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_8
    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget-object v0, v0, Lc2/e;->e:Ld2/l;

    iget-object v0, v0, Ld2/p;->h:Ld2/f;

    invoke-direct {p0, v0}, Ld2/k;->q(Ld2/f;)V

    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget-object v0, v0, Lc2/e;->e:Ld2/l;

    iget-object v0, v0, Ld2/p;->i:Ld2/f;

    invoke-direct {p0, v0}, Ld2/k;->q(Ld2/f;)V

    return-void

    :cond_9
    iget-object v1, p0, Ld2/p;->h:Ld2/f;

    sget-object v2, Ld2/f$a;->d:Ld2/f$a;

    iput-object v2, v1, Ld2/f;->e:Ld2/f$a;

    :goto_6
    iget v1, v0, Lc2/j;->M0:I

    if-ge v5, v1, :cond_b

    iget-object v1, v0, Lc2/j;->L0:[Lc2/e;

    aget-object v1, v1, v5

    if-nez v3, :cond_a

    invoke-virtual {v1}, Lc2/e;->V()I

    move-result v2

    if-ne v2, v4, :cond_a

    goto :goto_7

    :cond_a
    iget-object v1, v1, Lc2/e;->e:Ld2/l;

    iget-object v1, v1, Ld2/p;->h:Ld2/f;

    iget-object v2, v1, Ld2/f;->k:Ljava/util/List;

    iget-object v6, p0, Ld2/p;->h:Ld2/f;

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Ld2/p;->h:Ld2/f;

    iget-object v2, v2, Ld2/f;->l:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_7
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_b
    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget-object v0, v0, Lc2/e;->e:Ld2/l;

    iget-object v0, v0, Ld2/p;->h:Ld2/f;

    invoke-direct {p0, v0}, Ld2/k;->q(Ld2/f;)V

    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget-object v0, v0, Lc2/e;->e:Ld2/l;

    iget-object v0, v0, Ld2/p;->i:Ld2/f;

    invoke-direct {p0, v0}, Ld2/k;->q(Ld2/f;)V

    :cond_c
    :goto_8
    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    instance-of v1, v0, Lc2/a;

    if-eqz v1, :cond_2

    check-cast v0, Lc2/a;

    invoke-virtual {v0}, Lc2/a;->w1()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget-object v1, p0, Ld2/p;->h:Ld2/f;

    iget v1, v1, Ld2/f;->g:I

    invoke-virtual {v0, v1}, Lc2/e;->o1(I)V

    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Ld2/p;->b:Lc2/e;

    iget-object v1, p0, Ld2/p;->h:Ld2/f;

    iget v1, v1, Ld2/f;->g:I

    invoke-virtual {v0, v1}, Lc2/e;->n1(I)V

    :cond_2
    return-void
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ld2/p;->c:Ld2/m;

    iget-object v0, p0, Ld2/p;->h:Ld2/f;

    invoke-virtual {v0}, Ld2/f;->c()V

    return-void
.end method

.method public m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
