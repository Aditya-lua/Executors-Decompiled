.class public Ld2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld2/b$a;,
        Ld2/b$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc2/e;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ld2/b$a;

.field public c:Lc2/f;


# direct methods
.method public constructor <init>(Lc2/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ld2/b;->a:Ljava/util/ArrayList;

    new-instance v0, Ld2/b$a;

    invoke-direct {v0}, Ld2/b$a;-><init>()V

    iput-object v0, p0, Ld2/b;->b:Ld2/b$a;

    iput-object p1, p0, Ld2/b;->c:Lc2/f;

    return-void
.end method


# virtual methods
.method public final a(Ld2/b$b;Lc2/e;I)Z
    .locals 5

    iget-object v0, p0, Ld2/b;->b:Ld2/b$a;

    invoke-virtual {p2}, Lc2/e;->A()Lc2/e$b;

    move-result-object v1

    iput-object v1, v0, Ld2/b$a;->a:Lc2/e$b;

    iget-object v0, p0, Ld2/b;->b:Ld2/b$a;

    invoke-virtual {p2}, Lc2/e;->T()Lc2/e$b;

    move-result-object v1

    iput-object v1, v0, Ld2/b$a;->b:Lc2/e$b;

    iget-object v0, p0, Ld2/b;->b:Ld2/b$a;

    invoke-virtual {p2}, Lc2/e;->W()I

    move-result v1

    iput v1, v0, Ld2/b$a;->c:I

    iget-object v0, p0, Ld2/b;->b:Ld2/b$a;

    invoke-virtual {p2}, Lc2/e;->x()I

    move-result v1

    iput v1, v0, Ld2/b$a;->d:I

    iget-object v0, p0, Ld2/b;->b:Ld2/b$a;

    const/4 v1, 0x0

    iput-boolean v1, v0, Ld2/b$a;->i:Z

    iput p3, v0, Ld2/b$a;->j:I

    iget-object p3, v0, Ld2/b$a;->a:Lc2/e$b;

    sget-object v2, Lc2/e$b;->c:Lc2/e$b;

    const/4 v3, 0x1

    if-ne p3, v2, :cond_0

    move p3, v3

    goto :goto_0

    :cond_0
    move p3, v1

    :goto_0
    iget-object v4, v0, Ld2/b$a;->b:Lc2/e$b;

    if-ne v4, v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    const/4 v4, 0x0

    if-eqz p3, :cond_2

    iget p3, p2, Lc2/e;->d0:F

    cmpl-float p3, p3, v4

    if-lez p3, :cond_2

    move p3, v3

    goto :goto_2

    :cond_2
    move p3, v1

    :goto_2
    if-eqz v2, :cond_3

    iget v2, p2, Lc2/e;->d0:F

    cmpl-float v2, v2, v4

    if-lez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    move v2, v1

    :goto_3
    const/4 v4, 0x4

    if-eqz p3, :cond_4

    iget-object p3, p2, Lc2/e;->y:[I

    aget p3, p3, v1

    if-ne p3, v4, :cond_4

    sget-object p3, Lc2/e$b;->a:Lc2/e$b;

    iput-object p3, v0, Ld2/b$a;->a:Lc2/e$b;

    :cond_4
    if-eqz v2, :cond_5

    iget-object p3, p2, Lc2/e;->y:[I

    aget p3, p3, v3

    if-ne p3, v4, :cond_5

    sget-object p3, Lc2/e$b;->a:Lc2/e$b;

    iput-object p3, v0, Ld2/b$a;->b:Lc2/e$b;

    :cond_5
    invoke-interface {p1, p2, v0}, Ld2/b$b;->b(Lc2/e;Ld2/b$a;)V

    iget-object p1, p0, Ld2/b;->b:Ld2/b$a;

    iget p1, p1, Ld2/b$a;->e:I

    invoke-virtual {p2, p1}, Lc2/e;->l1(I)V

    iget-object p1, p0, Ld2/b;->b:Ld2/b$a;

    iget p1, p1, Ld2/b$a;->f:I

    invoke-virtual {p2, p1}, Lc2/e;->M0(I)V

    iget-object p1, p0, Ld2/b;->b:Ld2/b$a;

    iget-boolean p1, p1, Ld2/b$a;->h:Z

    invoke-virtual {p2, p1}, Lc2/e;->L0(Z)V

    iget-object p1, p0, Ld2/b;->b:Ld2/b$a;

    iget p1, p1, Ld2/b$a;->g:I

    invoke-virtual {p2, p1}, Lc2/e;->B0(I)V

    iget-object p1, p0, Ld2/b;->b:Ld2/b$a;

    sget p2, Ld2/b$a;->k:I

    iput p2, p1, Ld2/b$a;->j:I

    iget-boolean p1, p1, Ld2/b$a;->i:Z

    return p1
.end method

.method public final b(Lc2/f;)V
    .locals 12

    iget-object v0, p1, Lc2/m;->L0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x40

    invoke-virtual {p1, v1}, Lc2/f;->V1(I)Z

    move-result v1

    invoke-virtual {p1}, Lc2/f;->K1()Ld2/b$b;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v0, :cond_a

    iget-object v5, p1, Lc2/m;->L0:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lc2/e;

    instance-of v6, v5, Lc2/h;

    if-eqz v6, :cond_0

    goto/16 :goto_3

    :cond_0
    instance-of v6, v5, Lc2/a;

    if-eqz v6, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-virtual {v5}, Lc2/e;->l0()Z

    move-result v6

    if-eqz v6, :cond_2

    goto/16 :goto_3

    :cond_2
    if-eqz v1, :cond_3

    iget-object v6, v5, Lc2/e;->e:Ld2/l;

    if-eqz v6, :cond_3

    iget-object v7, v5, Lc2/e;->f:Ld2/n;

    if-eqz v7, :cond_3

    iget-object v6, v6, Ld2/p;->e:Ld2/g;

    iget-boolean v6, v6, Ld2/f;->j:Z

    if-eqz v6, :cond_3

    iget-object v6, v7, Ld2/p;->e:Ld2/g;

    iget-boolean v6, v6, Ld2/f;->j:Z

    if-eqz v6, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v5, v3}, Lc2/e;->u(I)Lc2/e$b;

    move-result-object v6

    const/4 v7, 0x1

    invoke-virtual {v5, v7}, Lc2/e;->u(I)Lc2/e$b;

    move-result-object v8

    sget-object v9, Lc2/e$b;->c:Lc2/e$b;

    if-ne v6, v9, :cond_4

    iget v10, v5, Lc2/e;->w:I

    if-eq v10, v7, :cond_4

    if-ne v8, v9, :cond_4

    iget v10, v5, Lc2/e;->x:I

    if-eq v10, v7, :cond_4

    move v10, v7

    goto :goto_1

    :cond_4
    move v10, v3

    :goto_1
    if-nez v10, :cond_8

    invoke-virtual {p1, v7}, Lc2/f;->V1(I)Z

    move-result v11

    if-eqz v11, :cond_8

    instance-of v11, v5, Lc2/l;

    if-nez v11, :cond_8

    if-ne v6, v9, :cond_5

    iget v11, v5, Lc2/e;->w:I

    if-nez v11, :cond_5

    if-eq v8, v9, :cond_5

    invoke-virtual {v5}, Lc2/e;->i0()Z

    move-result v11

    if-nez v11, :cond_5

    move v10, v7

    :cond_5
    if-ne v8, v9, :cond_6

    iget v11, v5, Lc2/e;->x:I

    if-nez v11, :cond_6

    if-eq v6, v9, :cond_6

    invoke-virtual {v5}, Lc2/e;->i0()Z

    move-result v11

    if-nez v11, :cond_6

    move v10, v7

    :cond_6
    if-eq v6, v9, :cond_7

    if-ne v8, v9, :cond_8

    :cond_7
    iget v6, v5, Lc2/e;->d0:F

    const/4 v8, 0x0

    cmpl-float v6, v6, v8

    if-lez v6, :cond_8

    goto :goto_2

    :cond_8
    move v7, v10

    :goto_2
    if-eqz v7, :cond_9

    goto :goto_3

    :cond_9
    sget v6, Ld2/b$a;->k:I

    invoke-virtual {p0, v2, v5, v6}, Ld2/b;->a(Ld2/b$b;Lc2/e;I)Z

    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_a
    invoke-interface {v2}, Ld2/b$b;->a()V

    return-void
.end method

.method public final c(Lc2/f;Ljava/lang/String;III)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lc2/e;->I()I

    move-result p2

    invoke-virtual {p1}, Lc2/e;->H()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lc2/e;->b1(I)V

    invoke-virtual {p1, v1}, Lc2/e;->a1(I)V

    invoke-virtual {p1, p4}, Lc2/e;->l1(I)V

    invoke-virtual {p1, p5}, Lc2/e;->M0(I)V

    invoke-virtual {p1, p2}, Lc2/e;->b1(I)V

    invoke-virtual {p1, v0}, Lc2/e;->a1(I)V

    iget-object p1, p0, Ld2/b;->c:Lc2/f;

    invoke-virtual {p1, p3}, Lc2/f;->Z1(I)V

    iget-object p1, p0, Ld2/b;->c:Lc2/f;

    invoke-virtual {p1}, Lc2/f;->t1()V

    return-void
.end method

.method public d(Lc2/f;IIIIIIIII)J
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p5

    move/from16 v4, p7

    invoke-virtual {v1}, Lc2/f;->K1()Ld2/b$b;

    move-result-object v5

    iget-object v6, v1, Lc2/m;->L0:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-virtual {v1}, Lc2/e;->W()I

    move-result v7

    invoke-virtual {v1}, Lc2/e;->x()I

    move-result v8

    const/16 v9, 0x80

    invoke-static {v2, v9}, Lc2/k;->b(II)Z

    move-result v9

    const/4 v11, 0x0

    if-nez v9, :cond_1

    const/16 v12, 0x40

    invoke-static {v2, v12}, Lc2/k;->b(II)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v11

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    :goto_1
    if-eqz v2, :cond_a

    move v12, v11

    :goto_2
    if-ge v12, v6, :cond_a

    iget-object v13, v1, Lc2/m;->L0:Ljava/util/ArrayList;

    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lc2/e;

    invoke-virtual {v13}, Lc2/e;->A()Lc2/e$b;

    move-result-object v14

    sget-object v15, Lc2/e$b;->c:Lc2/e$b;

    if-ne v14, v15, :cond_2

    const/4 v14, 0x1

    goto :goto_3

    :cond_2
    move v14, v11

    :goto_3
    invoke-virtual {v13}, Lc2/e;->T()Lc2/e$b;

    move-result-object v10

    if-ne v10, v15, :cond_3

    const/4 v10, 0x1

    goto :goto_4

    :cond_3
    move v10, v11

    :goto_4
    if-eqz v14, :cond_4

    if-eqz v10, :cond_4

    invoke-virtual {v13}, Lc2/e;->v()F

    move-result v10

    const/4 v14, 0x0

    cmpl-float v10, v10, v14

    if-lez v10, :cond_4

    const/4 v10, 0x1

    goto :goto_5

    :cond_4
    move v10, v11

    :goto_5
    invoke-virtual {v13}, Lc2/e;->i0()Z

    move-result v14

    if-eqz v14, :cond_6

    if-eqz v10, :cond_6

    :cond_5
    :goto_6
    move v2, v11

    goto :goto_7

    :cond_6
    invoke-virtual {v13}, Lc2/e;->k0()Z

    move-result v14

    if-eqz v14, :cond_7

    if-eqz v10, :cond_7

    goto :goto_6

    :cond_7
    instance-of v10, v13, Lc2/l;

    if-eqz v10, :cond_8

    goto :goto_6

    :cond_8
    invoke-virtual {v13}, Lc2/e;->i0()Z

    move-result v10

    if-nez v10, :cond_5

    invoke-virtual {v13}, Lc2/e;->k0()Z

    move-result v10

    if-eqz v10, :cond_9

    goto :goto_6

    :cond_9
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    :cond_a
    :goto_7
    if-eqz v2, :cond_b

    sget-boolean v10, Lz1/d;->s:Z

    :cond_b
    const/high16 v10, 0x40000000    # 2.0f

    if-ne v3, v10, :cond_c

    if-eq v4, v10, :cond_d

    :cond_c
    if-eqz v9, :cond_e

    :cond_d
    const/4 v12, 0x1

    goto :goto_8

    :cond_e
    move v12, v11

    :goto_8
    and-int/2addr v2, v12

    const/4 v12, 0x2

    if-eqz v2, :cond_16

    invoke-virtual {v1}, Lc2/e;->G()I

    move-result v13

    move/from16 v14, p6

    invoke-static {v13, v14}, Ljava/lang/Math;->min(II)I

    move-result v13

    invoke-virtual {v1}, Lc2/e;->F()I

    move-result v14

    move/from16 v15, p8

    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    move-result v14

    if-ne v3, v10, :cond_f

    invoke-virtual {v1}, Lc2/e;->W()I

    move-result v15

    if-eq v15, v13, :cond_f

    invoke-virtual {v1, v13}, Lc2/e;->l1(I)V

    invoke-virtual {v1}, Lc2/f;->O1()V

    :cond_f
    if-ne v4, v10, :cond_10

    invoke-virtual {v1}, Lc2/e;->x()I

    move-result v13

    if-eq v13, v14, :cond_10

    invoke-virtual {v1, v14}, Lc2/e;->M0(I)V

    invoke-virtual {v1}, Lc2/f;->O1()V

    :cond_10
    if-ne v3, v10, :cond_11

    if-ne v4, v10, :cond_11

    invoke-virtual {v1, v9}, Lc2/f;->G1(Z)Z

    move-result v9

    move v14, v12

    goto :goto_a

    :cond_11
    invoke-virtual {v1, v9}, Lc2/f;->H1(Z)Z

    move-result v13

    if-ne v3, v10, :cond_12

    invoke-virtual {v1, v9, v11}, Lc2/f;->I1(ZI)Z

    move-result v14

    and-int/2addr v13, v14

    const/4 v14, 0x1

    goto :goto_9

    :cond_12
    move v14, v11

    :goto_9
    if-ne v4, v10, :cond_13

    const/4 v15, 0x1

    invoke-virtual {v1, v9, v15}, Lc2/f;->I1(ZI)Z

    move-result v9

    and-int/2addr v9, v13

    add-int/lit8 v14, v14, 0x1

    goto :goto_a

    :cond_13
    move v9, v13

    :goto_a
    if-eqz v9, :cond_17

    if-ne v3, v10, :cond_14

    const/4 v15, 0x1

    goto :goto_b

    :cond_14
    move v15, v11

    :goto_b
    if-ne v4, v10, :cond_15

    const/4 v3, 0x1

    goto :goto_c

    :cond_15
    move v3, v11

    :goto_c
    invoke-virtual {v1, v15, v3}, Lc2/f;->q1(ZZ)V

    goto :goto_d

    :cond_16
    move v9, v11

    move v14, v9

    :cond_17
    :goto_d
    if-eqz v9, :cond_18

    if-eq v14, v12, :cond_31

    :cond_18
    invoke-virtual {v1}, Lc2/f;->L1()I

    move-result v3

    if-lez v6, :cond_19

    invoke-virtual/range {p0 .. p1}, Ld2/b;->b(Lc2/f;)V

    :cond_19
    invoke-virtual/range {p0 .. p1}, Ld2/b;->e(Lc2/f;)V

    iget-object v4, v0, Ld2/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v6, :cond_1a

    const-string v6, "First pass"

    const/4 v9, 0x0

    move-object/from16 p2, v0

    move-object/from16 p3, v1

    move-object/from16 p4, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p5, v9

    invoke-virtual/range {p2 .. p7}, Ld2/b;->c(Lc2/f;Ljava/lang/String;III)V

    move/from16 v1, p6

    move/from16 v6, p7

    goto :goto_e

    :cond_1a
    move v1, v7

    move v6, v8

    :goto_e
    if-lez v4, :cond_30

    invoke-virtual/range {p1 .. p1}, Lc2/e;->A()Lc2/e$b;

    move-result-object v7

    sget-object v8, Lc2/e$b;->b:Lc2/e$b;

    if-ne v7, v8, :cond_1b

    const/4 v15, 0x1

    goto :goto_f

    :cond_1b
    move v15, v11

    :goto_f
    invoke-virtual/range {p1 .. p1}, Lc2/e;->T()Lc2/e$b;

    move-result-object v7

    if-ne v7, v8, :cond_1c

    const/4 v7, 0x1

    goto :goto_10

    :cond_1c
    move v7, v11

    :goto_10
    invoke-virtual/range {p1 .. p1}, Lc2/e;->W()I

    move-result v8

    iget-object v9, v0, Ld2/b;->c:Lc2/f;

    invoke-virtual {v9}, Lc2/e;->I()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v8

    invoke-virtual/range {p1 .. p1}, Lc2/e;->x()I

    move-result v9

    iget-object v10, v0, Ld2/b;->c:Lc2/f;

    invoke-virtual {v10}, Lc2/e;->H()I

    move-result v10

    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    move-result v9

    move v10, v11

    move v13, v10

    :goto_11
    if-ge v10, v4, :cond_22

    iget-object v14, v0, Ld2/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lc2/e;

    instance-of v11, v14, Lc2/l;

    if-nez v11, :cond_1d

    move/from16 p6, v1

    goto :goto_13

    :cond_1d
    invoke-virtual {v14}, Lc2/e;->W()I

    move-result v11

    invoke-virtual {v14}, Lc2/e;->x()I

    move-result v12

    move/from16 p6, v1

    sget v1, Ld2/b$a;->l:I

    invoke-virtual {v0, v5, v14, v1}, Ld2/b;->a(Ld2/b$b;Lc2/e;I)Z

    move-result v1

    or-int/2addr v1, v13

    invoke-virtual {v14}, Lc2/e;->W()I

    move-result v13

    move/from16 p2, v1

    invoke-virtual {v14}, Lc2/e;->x()I

    move-result v1

    if-eq v13, v11, :cond_1f

    invoke-virtual {v14, v13}, Lc2/e;->l1(I)V

    if-eqz v15, :cond_1e

    invoke-virtual {v14}, Lc2/e;->M()I

    move-result v11

    if-le v11, v8, :cond_1e

    invoke-virtual {v14}, Lc2/e;->M()I

    move-result v11

    sget-object v13, Lc2/d$a;->d:Lc2/d$a;

    invoke-virtual {v14, v13}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object v13

    invoke-virtual {v13}, Lc2/d;->f()I

    move-result v13

    add-int/2addr v11, v13

    invoke-static {v8, v11}, Ljava/lang/Math;->max(II)I

    move-result v8

    :cond_1e
    const/4 v11, 0x1

    goto :goto_12

    :cond_1f
    move/from16 v11, p2

    :goto_12
    if-eq v1, v12, :cond_21

    invoke-virtual {v14, v1}, Lc2/e;->M0(I)V

    if-eqz v7, :cond_20

    invoke-virtual {v14}, Lc2/e;->r()I

    move-result v1

    if-le v1, v9, :cond_20

    invoke-virtual {v14}, Lc2/e;->r()I

    move-result v1

    sget-object v11, Lc2/d$a;->e:Lc2/d$a;

    invoke-virtual {v14, v11}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object v11

    invoke-virtual {v11}, Lc2/d;->f()I

    move-result v11

    add-int/2addr v1, v11

    invoke-static {v9, v1}, Ljava/lang/Math;->max(II)I

    move-result v9

    :cond_20
    const/4 v11, 0x1

    :cond_21
    check-cast v14, Lc2/l;

    invoke-virtual {v14}, Lc2/l;->G1()Z

    move-result v1

    or-int v13, v11, v1

    :goto_13
    add-int/lit8 v10, v10, 0x1

    move/from16 v1, p6

    const/4 v11, 0x0

    const/4 v12, 0x2

    goto :goto_11

    :cond_22
    move/from16 p6, v1

    move v10, v12

    const/4 v1, 0x0

    :goto_14
    if-ge v1, v10, :cond_30

    const/4 v11, 0x0

    :goto_15
    if-ge v11, v4, :cond_2f

    iget-object v12, v0, Ld2/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lc2/e;

    instance-of v14, v12, Lc2/i;

    if-eqz v14, :cond_23

    instance-of v14, v12, Lc2/l;

    if-eqz v14, :cond_27

    :cond_23
    instance-of v14, v12, Lc2/h;

    if-eqz v14, :cond_24

    goto :goto_16

    :cond_24
    invoke-virtual {v12}, Lc2/e;->V()I

    move-result v14

    const/16 v10, 0x8

    if-ne v14, v10, :cond_25

    goto :goto_16

    :cond_25
    if-eqz v2, :cond_26

    iget-object v10, v12, Lc2/e;->e:Ld2/l;

    iget-object v10, v10, Ld2/p;->e:Ld2/g;

    iget-boolean v10, v10, Ld2/f;->j:Z

    if-eqz v10, :cond_26

    iget-object v10, v12, Lc2/e;->f:Ld2/n;

    iget-object v10, v10, Ld2/p;->e:Ld2/g;

    iget-boolean v10, v10, Ld2/f;->j:Z

    if-eqz v10, :cond_26

    goto :goto_16

    :cond_26
    instance-of v10, v12, Lc2/l;

    if-eqz v10, :cond_28

    :cond_27
    :goto_16
    move/from16 v16, v2

    move/from16 p8, v4

    goto/16 :goto_17

    :cond_28
    invoke-virtual {v12}, Lc2/e;->W()I

    move-result v10

    invoke-virtual {v12}, Lc2/e;->x()I

    move-result v14

    move/from16 v16, v2

    invoke-virtual {v12}, Lc2/e;->p()I

    move-result v2

    sget v17, Ld2/b$a;->l:I

    move/from16 p8, v4

    const/4 v4, 0x1

    if-ne v1, v4, :cond_29

    sget v17, Ld2/b$a;->m:I

    :cond_29
    move/from16 v4, v17

    invoke-virtual {v0, v5, v12, v4}, Ld2/b;->a(Ld2/b$b;Lc2/e;I)Z

    move-result v4

    or-int/2addr v4, v13

    invoke-virtual {v12}, Lc2/e;->W()I

    move-result v13

    invoke-virtual {v12}, Lc2/e;->x()I

    move-result v0

    if-eq v13, v10, :cond_2b

    invoke-virtual {v12, v13}, Lc2/e;->l1(I)V

    if-eqz v15, :cond_2a

    invoke-virtual {v12}, Lc2/e;->M()I

    move-result v4

    if-le v4, v8, :cond_2a

    invoke-virtual {v12}, Lc2/e;->M()I

    move-result v4

    sget-object v10, Lc2/d$a;->d:Lc2/d$a;

    invoke-virtual {v12, v10}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object v10

    invoke-virtual {v10}, Lc2/d;->f()I

    move-result v10

    add-int/2addr v4, v10

    invoke-static {v8, v4}, Ljava/lang/Math;->max(II)I

    move-result v8

    :cond_2a
    const/4 v4, 0x1

    :cond_2b
    if-eq v0, v14, :cond_2d

    invoke-virtual {v12, v0}, Lc2/e;->M0(I)V

    if-eqz v7, :cond_2c

    invoke-virtual {v12}, Lc2/e;->r()I

    move-result v0

    if-le v0, v9, :cond_2c

    invoke-virtual {v12}, Lc2/e;->r()I

    move-result v0

    sget-object v4, Lc2/d$a;->e:Lc2/d$a;

    invoke-virtual {v12, v4}, Lc2/e;->o(Lc2/d$a;)Lc2/d;

    move-result-object v4

    invoke-virtual {v4}, Lc2/d;->f()I

    move-result v4

    add-int/2addr v0, v4

    invoke-static {v9, v0}, Ljava/lang/Math;->max(II)I

    move-result v9

    :cond_2c
    const/4 v4, 0x1

    :cond_2d
    invoke-virtual {v12}, Lc2/e;->Z()Z

    move-result v0

    if-eqz v0, :cond_2e

    invoke-virtual {v12}, Lc2/e;->p()I

    move-result v0

    if-eq v2, v0, :cond_2e

    const/4 v13, 0x1

    goto :goto_17

    :cond_2e
    move v13, v4

    :goto_17
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v0, p0

    move/from16 v4, p8

    move/from16 v2, v16

    const/4 v10, 0x2

    goto/16 :goto_15

    :cond_2f
    move/from16 v16, v2

    move/from16 p8, v4

    if-eqz v13, :cond_30

    add-int/lit8 v1, v1, 0x1

    const-string v0, "intermediate pass"

    move-object/from16 p2, p0

    move-object/from16 p3, p1

    move-object/from16 p4, v0

    move/from16 p5, v1

    move/from16 p7, v6

    invoke-virtual/range {p2 .. p7}, Ld2/b;->c(Lc2/f;Ljava/lang/String;III)V

    move-object/from16 v0, p3

    move-object/from16 v0, p0

    move/from16 v4, p8

    move/from16 v2, v16

    const/4 v10, 0x2

    const/4 v13, 0x0

    goto/16 :goto_14

    :cond_30
    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Lc2/f;->Y1(I)V

    :cond_31
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public e(Lc2/f;)V
    .locals 5

    iget-object v0, p0, Ld2/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p1, Lc2/m;->L0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    iget-object v2, p1, Lc2/m;->L0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc2/e;

    invoke-virtual {v2}, Lc2/e;->A()Lc2/e$b;

    move-result-object v3

    sget-object v4, Lc2/e$b;->c:Lc2/e$b;

    if-eq v3, v4, :cond_0

    invoke-virtual {v2}, Lc2/e;->T()Lc2/e$b;

    move-result-object v3

    if-ne v3, v4, :cond_1

    :cond_0
    iget-object v3, p0, Ld2/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lc2/f;->O1()V

    return-void
.end method
