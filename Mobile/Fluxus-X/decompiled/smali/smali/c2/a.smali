.class public Lc2/a;
.super Lc2/j;
.source "SourceFile"


# instance fields
.field public N0:I

.field public O0:Z

.field public P0:I

.field public Q0:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lc2/j;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lc2/a;->N0:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Lc2/a;->O0:Z

    iput v0, p0, Lc2/a;->P0:I

    iput-boolean v0, p0, Lc2/a;->Q0:Z

    return-void
.end method


# virtual methods
.method public A1(Z)V
    .locals 0

    iput-boolean p1, p0, Lc2/a;->O0:Z

    return-void
.end method

.method public B1(I)V
    .locals 0

    iput p1, p0, Lc2/a;->N0:I

    return-void
.end method

.method public C1(I)V
    .locals 0

    iput p1, p0, Lc2/a;->P0:I

    return-void
.end method

.method public g(Lz1/d;Z)V
    .locals 12

    iget-object p2, p0, Lc2/e;->W:[Lc2/d;

    iget-object v0, p0, Lc2/e;->O:Lc2/d;

    const/4 v1, 0x0

    aput-object v0, p2, v1

    iget-object v0, p0, Lc2/e;->P:Lc2/d;

    const/4 v2, 0x2

    aput-object v0, p2, v2

    iget-object v0, p0, Lc2/e;->Q:Lc2/d;

    const/4 v3, 0x1

    aput-object v0, p2, v3

    iget-object v0, p0, Lc2/e;->R:Lc2/d;

    const/4 v4, 0x3

    aput-object v0, p2, v4

    move p2, v1

    :goto_0
    iget-object v0, p0, Lc2/e;->W:[Lc2/d;

    array-length v5, v0

    if-ge p2, v5, :cond_0

    aget-object v0, v0, p2

    invoke-virtual {p1, v0}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v5

    iput-object v5, v0, Lc2/d;->i:Lz1/i;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    iget p2, p0, Lc2/a;->N0:I

    if-ltz p2, :cond_1e

    const/4 v5, 0x4

    if-ge p2, v5, :cond_1e

    aget-object p2, v0, p2

    iget-boolean v0, p0, Lc2/a;->Q0:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lc2/a;->u1()Z

    :cond_1
    iget-boolean v0, p0, Lc2/a;->Q0:Z

    if-eqz v0, :cond_5

    iput-boolean v1, p0, Lc2/a;->Q0:Z

    iget p2, p0, Lc2/a;->N0:I

    if-eqz p2, :cond_4

    if-ne p2, v3, :cond_2

    goto :goto_1

    :cond_2
    if-eq p2, v2, :cond_3

    if-ne p2, v4, :cond_1e

    :cond_3
    iget-object p2, p0, Lc2/e;->P:Lc2/d;

    iget-object p2, p2, Lc2/d;->i:Lz1/i;

    iget v0, p0, Lc2/e;->g0:I

    invoke-virtual {p1, p2, v0}, Lz1/d;->f(Lz1/i;I)V

    iget-object p2, p0, Lc2/e;->R:Lc2/d;

    iget-object p2, p2, Lc2/d;->i:Lz1/i;

    iget v0, p0, Lc2/e;->g0:I

    invoke-virtual {p1, p2, v0}, Lz1/d;->f(Lz1/i;I)V

    return-void

    :cond_4
    :goto_1
    iget-object p2, p0, Lc2/e;->O:Lc2/d;

    iget-object p2, p2, Lc2/d;->i:Lz1/i;

    iget v0, p0, Lc2/e;->f0:I

    invoke-virtual {p1, p2, v0}, Lz1/d;->f(Lz1/i;I)V

    iget-object p2, p0, Lc2/e;->Q:Lc2/d;

    iget-object p2, p2, Lc2/d;->i:Lz1/i;

    iget v0, p0, Lc2/e;->f0:I

    invoke-virtual {p1, p2, v0}, Lz1/d;->f(Lz1/i;I)V

    return-void

    :cond_5
    move v0, v1

    :goto_2
    iget v6, p0, Lc2/j;->M0:I

    if-ge v0, v6, :cond_b

    iget-object v6, p0, Lc2/j;->L0:[Lc2/e;

    aget-object v6, v6, v0

    iget-boolean v7, p0, Lc2/a;->O0:Z

    if-nez v7, :cond_6

    invoke-virtual {v6}, Lc2/e;->h()Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_4

    :cond_6
    iget v7, p0, Lc2/a;->N0:I

    if-eqz v7, :cond_7

    if-ne v7, v3, :cond_8

    :cond_7
    invoke-virtual {v6}, Lc2/e;->A()Lc2/e$b;

    move-result-object v7

    sget-object v8, Lc2/e$b;->c:Lc2/e$b;

    if-ne v7, v8, :cond_8

    iget-object v7, v6, Lc2/e;->O:Lc2/d;

    iget-object v7, v7, Lc2/d;->f:Lc2/d;

    if-eqz v7, :cond_8

    iget-object v7, v6, Lc2/e;->Q:Lc2/d;

    iget-object v7, v7, Lc2/d;->f:Lc2/d;

    if-eqz v7, :cond_8

    :goto_3
    move v0, v3

    goto :goto_5

    :cond_8
    iget v7, p0, Lc2/a;->N0:I

    if-eq v7, v2, :cond_9

    if-ne v7, v4, :cond_a

    :cond_9
    invoke-virtual {v6}, Lc2/e;->T()Lc2/e$b;

    move-result-object v7

    sget-object v8, Lc2/e$b;->c:Lc2/e$b;

    if-ne v7, v8, :cond_a

    iget-object v7, v6, Lc2/e;->P:Lc2/d;

    iget-object v7, v7, Lc2/d;->f:Lc2/d;

    if-eqz v7, :cond_a

    iget-object v6, v6, Lc2/e;->R:Lc2/d;

    iget-object v6, v6, Lc2/d;->f:Lc2/d;

    if-eqz v6, :cond_a

    goto :goto_3

    :cond_a
    :goto_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_b
    move v0, v1

    :goto_5
    iget-object v6, p0, Lc2/e;->O:Lc2/d;

    invoke-virtual {v6}, Lc2/d;->l()Z

    move-result v6

    if-nez v6, :cond_d

    iget-object v6, p0, Lc2/e;->Q:Lc2/d;

    invoke-virtual {v6}, Lc2/d;->l()Z

    move-result v6

    if-eqz v6, :cond_c

    goto :goto_6

    :cond_c
    move v6, v1

    goto :goto_7

    :cond_d
    :goto_6
    move v6, v3

    :goto_7
    iget-object v7, p0, Lc2/e;->P:Lc2/d;

    invoke-virtual {v7}, Lc2/d;->l()Z

    move-result v7

    if-nez v7, :cond_f

    iget-object v7, p0, Lc2/e;->R:Lc2/d;

    invoke-virtual {v7}, Lc2/d;->l()Z

    move-result v7

    if-eqz v7, :cond_e

    goto :goto_8

    :cond_e
    move v7, v1

    goto :goto_9

    :cond_f
    :goto_8
    move v7, v3

    :goto_9
    if-nez v0, :cond_14

    iget v8, p0, Lc2/a;->N0:I

    if-nez v8, :cond_10

    if-nez v6, :cond_13

    :cond_10
    if-ne v8, v2, :cond_11

    if-nez v7, :cond_13

    :cond_11
    if-ne v8, v3, :cond_12

    if-nez v6, :cond_13

    :cond_12
    if-ne v8, v4, :cond_14

    if-eqz v7, :cond_14

    :cond_13
    move v6, v3

    goto :goto_a

    :cond_14
    move v6, v1

    :goto_a
    if-nez v6, :cond_15

    move v6, v5

    goto :goto_b

    :cond_15
    const/4 v6, 0x5

    :goto_b
    move v7, v1

    :goto_c
    iget v8, p0, Lc2/j;->M0:I

    if-ge v7, v8, :cond_1a

    iget-object v8, p0, Lc2/j;->L0:[Lc2/e;

    aget-object v8, v8, v7

    iget-boolean v9, p0, Lc2/a;->O0:Z

    if-nez v9, :cond_16

    invoke-virtual {v8}, Lc2/e;->h()Z

    move-result v9

    if-nez v9, :cond_16

    goto :goto_10

    :cond_16
    iget-object v9, v8, Lc2/e;->W:[Lc2/d;

    iget v10, p0, Lc2/a;->N0:I

    aget-object v9, v9, v10

    invoke-virtual {p1, v9}, Lz1/d;->q(Ljava/lang/Object;)Lz1/i;

    move-result-object v9

    iget-object v8, v8, Lc2/e;->W:[Lc2/d;

    iget v10, p0, Lc2/a;->N0:I

    aget-object v8, v8, v10

    iput-object v9, v8, Lc2/d;->i:Lz1/i;

    iget-object v11, v8, Lc2/d;->f:Lc2/d;

    if-eqz v11, :cond_17

    iget-object v11, v11, Lc2/d;->d:Lc2/e;

    if-ne v11, p0, :cond_17

    iget v8, v8, Lc2/d;->g:I

    goto :goto_d

    :cond_17
    move v8, v1

    :goto_d
    if-eqz v10, :cond_19

    if-ne v10, v2, :cond_18

    goto :goto_e

    :cond_18
    iget-object v10, p2, Lc2/d;->i:Lz1/i;

    iget v11, p0, Lc2/a;->P0:I

    add-int/2addr v11, v8

    invoke-virtual {p1, v10, v9, v11, v0}, Lz1/d;->g(Lz1/i;Lz1/i;IZ)V

    goto :goto_f

    :cond_19
    :goto_e
    iget-object v10, p2, Lc2/d;->i:Lz1/i;

    iget v11, p0, Lc2/a;->P0:I

    sub-int/2addr v11, v8

    invoke-virtual {p1, v10, v9, v11, v0}, Lz1/d;->i(Lz1/i;Lz1/i;IZ)V

    :goto_f
    iget-object v10, p2, Lc2/d;->i:Lz1/i;

    iget v11, p0, Lc2/a;->P0:I

    add-int/2addr v11, v8

    invoke-virtual {p1, v10, v9, v11, v6}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    :goto_10
    add-int/lit8 v7, v7, 0x1

    goto :goto_c

    :cond_1a
    iget p2, p0, Lc2/a;->N0:I

    const/16 v0, 0x8

    if-nez p2, :cond_1b

    iget-object p2, p0, Lc2/e;->Q:Lc2/d;

    iget-object p2, p2, Lc2/d;->i:Lz1/i;

    iget-object v2, p0, Lc2/e;->O:Lc2/d;

    iget-object v2, v2, Lc2/d;->i:Lz1/i;

    invoke-virtual {p1, p2, v2, v1, v0}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    iget-object p2, p0, Lc2/e;->O:Lc2/d;

    iget-object p2, p2, Lc2/d;->i:Lz1/i;

    iget-object v0, p0, Lc2/e;->a0:Lc2/e;

    iget-object v0, v0, Lc2/e;->Q:Lc2/d;

    iget-object v0, v0, Lc2/d;->i:Lz1/i;

    invoke-virtual {p1, p2, v0, v1, v5}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    iget-object p2, p0, Lc2/e;->O:Lc2/d;

    iget-object p2, p2, Lc2/d;->i:Lz1/i;

    iget-object v0, p0, Lc2/e;->a0:Lc2/e;

    iget-object v0, v0, Lc2/e;->O:Lc2/d;

    iget-object v0, v0, Lc2/d;->i:Lz1/i;

    invoke-virtual {p1, p2, v0, v1, v1}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    return-void

    :cond_1b
    if-ne p2, v3, :cond_1c

    iget-object p2, p0, Lc2/e;->O:Lc2/d;

    iget-object p2, p2, Lc2/d;->i:Lz1/i;

    iget-object v2, p0, Lc2/e;->Q:Lc2/d;

    iget-object v2, v2, Lc2/d;->i:Lz1/i;

    invoke-virtual {p1, p2, v2, v1, v0}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    iget-object p2, p0, Lc2/e;->O:Lc2/d;

    iget-object p2, p2, Lc2/d;->i:Lz1/i;

    iget-object v0, p0, Lc2/e;->a0:Lc2/e;

    iget-object v0, v0, Lc2/e;->O:Lc2/d;

    iget-object v0, v0, Lc2/d;->i:Lz1/i;

    invoke-virtual {p1, p2, v0, v1, v5}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    iget-object p2, p0, Lc2/e;->O:Lc2/d;

    iget-object p2, p2, Lc2/d;->i:Lz1/i;

    iget-object v0, p0, Lc2/e;->a0:Lc2/e;

    iget-object v0, v0, Lc2/e;->Q:Lc2/d;

    iget-object v0, v0, Lc2/d;->i:Lz1/i;

    invoke-virtual {p1, p2, v0, v1, v1}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    return-void

    :cond_1c
    if-ne p2, v2, :cond_1d

    iget-object p2, p0, Lc2/e;->R:Lc2/d;

    iget-object p2, p2, Lc2/d;->i:Lz1/i;

    iget-object v2, p0, Lc2/e;->P:Lc2/d;

    iget-object v2, v2, Lc2/d;->i:Lz1/i;

    invoke-virtual {p1, p2, v2, v1, v0}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    iget-object p2, p0, Lc2/e;->P:Lc2/d;

    iget-object p2, p2, Lc2/d;->i:Lz1/i;

    iget-object v0, p0, Lc2/e;->a0:Lc2/e;

    iget-object v0, v0, Lc2/e;->R:Lc2/d;

    iget-object v0, v0, Lc2/d;->i:Lz1/i;

    invoke-virtual {p1, p2, v0, v1, v5}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    iget-object p2, p0, Lc2/e;->P:Lc2/d;

    iget-object p2, p2, Lc2/d;->i:Lz1/i;

    iget-object v0, p0, Lc2/e;->a0:Lc2/e;

    iget-object v0, v0, Lc2/e;->P:Lc2/d;

    iget-object v0, v0, Lc2/d;->i:Lz1/i;

    invoke-virtual {p1, p2, v0, v1, v1}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    return-void

    :cond_1d
    if-ne p2, v4, :cond_1e

    iget-object p2, p0, Lc2/e;->P:Lc2/d;

    iget-object p2, p2, Lc2/d;->i:Lz1/i;

    iget-object v2, p0, Lc2/e;->R:Lc2/d;

    iget-object v2, v2, Lc2/d;->i:Lz1/i;

    invoke-virtual {p1, p2, v2, v1, v0}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    iget-object p2, p0, Lc2/e;->P:Lc2/d;

    iget-object p2, p2, Lc2/d;->i:Lz1/i;

    iget-object v0, p0, Lc2/e;->a0:Lc2/e;

    iget-object v0, v0, Lc2/e;->P:Lc2/d;

    iget-object v0, v0, Lc2/d;->i:Lz1/i;

    invoke-virtual {p1, p2, v0, v1, v5}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    iget-object p2, p0, Lc2/e;->P:Lc2/d;

    iget-object p2, p2, Lc2/d;->i:Lz1/i;

    iget-object v0, p0, Lc2/e;->a0:Lc2/e;

    iget-object v0, v0, Lc2/e;->R:Lc2/d;

    iget-object v0, v0, Lc2/d;->i:Lz1/i;

    invoke-virtual {p1, p2, v0, v1, v1}, Lz1/d;->e(Lz1/i;Lz1/i;II)Lz1/b;

    :cond_1e
    return-void
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public n0()Z
    .locals 1

    iget-boolean v0, p0, Lc2/a;->Q0:Z

    return v0
.end method

.method public o0()Z
    .locals 1

    iget-boolean v0, p0, Lc2/a;->Q0:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[Barrier] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lc2/e;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " {"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lc2/j;->M0:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lc2/j;->L0:[Lc2/e;

    aget-object v2, v2, v1

    if-lez v1, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lc2/e;->t()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "}"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u1()Z
    .locals 8

    const/4 v0, 0x1

    const/4 v1, 0x0

    move v3, v0

    move v2, v1

    :goto_0
    iget v4, p0, Lc2/j;->M0:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    if-ge v2, v4, :cond_5

    iget-object v4, p0, Lc2/j;->L0:[Lc2/e;

    aget-object v4, v4, v2

    iget-boolean v7, p0, Lc2/a;->O0:Z

    if-nez v7, :cond_0

    invoke-virtual {v4}, Lc2/e;->h()Z

    move-result v7

    if-nez v7, :cond_0

    goto :goto_2

    :cond_0
    iget v7, p0, Lc2/a;->N0:I

    if-eqz v7, :cond_1

    if-ne v7, v0, :cond_2

    :cond_1
    invoke-virtual {v4}, Lc2/e;->n0()Z

    move-result v7

    if-nez v7, :cond_2

    :goto_1
    move v3, v1

    goto :goto_2

    :cond_2
    iget v7, p0, Lc2/a;->N0:I

    if-eq v7, v6, :cond_3

    if-ne v7, v5, :cond_4

    :cond_3
    invoke-virtual {v4}, Lc2/e;->o0()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_1

    :cond_4
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    if-eqz v3, :cond_13

    if-lez v4, :cond_13

    move v2, v1

    move v3, v2

    :goto_3
    iget v4, p0, Lc2/j;->M0:I

    if-ge v1, v4, :cond_10

    iget-object v4, p0, Lc2/j;->L0:[Lc2/e;

    aget-object v4, v4, v1

    iget-boolean v7, p0, Lc2/a;->O0:Z

    if-nez v7, :cond_6

    invoke-virtual {v4}, Lc2/e;->h()Z

    move-result v7

    if-nez v7, :cond_6

    goto/16 :goto_5

    :cond_6
    if-nez v3, :cond_b

    iget v3, p0, Lc2/a;->N0:I

    if-nez v3, :cond_7

    sget-object v2, Lc2/d$a;->b:Lc2/d$a;

    invoke-virtual {v4, v2}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object v2

    invoke-virtual {v2}, Lc2/d;->e()I

    move-result v2

    goto :goto_4

    :cond_7
    if-ne v3, v0, :cond_8

    sget-object v2, Lc2/d$a;->d:Lc2/d$a;

    invoke-virtual {v4, v2}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object v2

    invoke-virtual {v2}, Lc2/d;->e()I

    move-result v2

    goto :goto_4

    :cond_8
    if-ne v3, v6, :cond_9

    sget-object v2, Lc2/d$a;->c:Lc2/d$a;

    invoke-virtual {v4, v2}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object v2

    invoke-virtual {v2}, Lc2/d;->e()I

    move-result v2

    goto :goto_4

    :cond_9
    if-ne v3, v5, :cond_a

    sget-object v2, Lc2/d$a;->e:Lc2/d$a;

    invoke-virtual {v4, v2}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object v2

    invoke-virtual {v2}, Lc2/d;->e()I

    move-result v2

    :cond_a
    :goto_4
    move v3, v0

    :cond_b
    iget v7, p0, Lc2/a;->N0:I

    if-nez v7, :cond_c

    sget-object v7, Lc2/d$a;->b:Lc2/d$a;

    invoke-virtual {v4, v7}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object v4

    invoke-virtual {v4}, Lc2/d;->e()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_5

    :cond_c
    if-ne v7, v0, :cond_d

    sget-object v7, Lc2/d$a;->d:Lc2/d$a;

    invoke-virtual {v4, v7}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object v4

    invoke-virtual {v4}, Lc2/d;->e()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_5

    :cond_d
    if-ne v7, v6, :cond_e

    sget-object v7, Lc2/d$a;->c:Lc2/d$a;

    invoke-virtual {v4, v7}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object v4

    invoke-virtual {v4}, Lc2/d;->e()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    goto :goto_5

    :cond_e
    if-ne v7, v5, :cond_f

    sget-object v7, Lc2/d$a;->e:Lc2/d$a;

    invoke-virtual {v4, v7}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object v4

    invoke-virtual {v4}, Lc2/d;->e()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    :cond_f
    :goto_5
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_3

    :cond_10
    iget v1, p0, Lc2/a;->P0:I

    add-int/2addr v2, v1

    iget v1, p0, Lc2/a;->N0:I

    if-eqz v1, :cond_12

    if-ne v1, v0, :cond_11

    goto :goto_6

    :cond_11
    invoke-virtual {p0, v2, v2}, Lc2/e;->J0(II)V

    goto :goto_7

    :cond_12
    :goto_6
    invoke-virtual {p0, v2, v2}, Lc2/e;->G0(II)V

    :goto_7
    iput-boolean v0, p0, Lc2/a;->Q0:Z

    return v0

    :cond_13
    return v1
.end method

.method public v1()Z
    .locals 1

    iget-boolean v0, p0, Lc2/a;->O0:Z

    return v0
.end method

.method public w1()I
    .locals 1

    iget v0, p0, Lc2/a;->N0:I

    return v0
.end method

.method public x1()I
    .locals 1

    iget v0, p0, Lc2/a;->P0:I

    return v0
.end method

.method public y1()I
    .locals 3

    iget v0, p0, Lc2/a;->N0:I

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public z1()V
    .locals 6

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, Lc2/j;->M0:I

    if-ge v1, v2, :cond_5

    iget-object v2, p0, Lc2/j;->L0:[Lc2/e;

    aget-object v2, v2, v1

    iget-boolean v3, p0, Lc2/a;->O0:Z

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lc2/e;->h()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_2

    :cond_0
    iget v3, p0, Lc2/a;->N0:I

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    if-ne v3, v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v5, 0x2

    if-eq v3, v5, :cond_2

    const/4 v5, 0x3

    if-ne v3, v5, :cond_4

    :cond_2
    invoke-virtual {v2, v4, v4}, Lc2/e;->T0(IZ)V

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {v2, v0, v4}, Lc2/e;->T0(IZ)V

    :cond_4
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method
