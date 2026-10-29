.class public Ld2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lc2/f;

.field public b:Z

.field public c:Z

.field public d:Lc2/f;

.field public e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ld2/p;",
            ">;"
        }
    .end annotation
.end field

.field public f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ld2/m;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ld2/b$b;

.field public h:Ld2/b$a;

.field public i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ld2/m;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc2/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ld2/e;->b:Z

    iput-boolean v0, p0, Ld2/e;->c:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ld2/e;->e:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ld2/e;->f:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-object v0, p0, Ld2/e;->g:Ld2/b$b;

    new-instance v0, Ld2/b$a;

    invoke-direct {v0}, Ld2/b$a;-><init>()V

    iput-object v0, p0, Ld2/e;->h:Ld2/b$a;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ld2/e;->i:Ljava/util/ArrayList;

    iput-object p1, p0, Ld2/e;->a:Lc2/f;

    iput-object p1, p0, Ld2/e;->d:Lc2/f;

    return-void
.end method


# virtual methods
.method public final a(Ld2/f;IILd2/f;Ljava/util/ArrayList;Ld2/m;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld2/f;",
            "II",
            "Ld2/f;",
            "Ljava/util/ArrayList<",
            "Ld2/m;",
            ">;",
            "Ld2/m;",
            ")V"
        }
    .end annotation

    iget-object p1, p1, Ld2/f;->d:Ld2/p;

    iget-object v0, p1, Ld2/p;->c:Ld2/m;

    if-nez v0, :cond_c

    iget-object v0, p0, Ld2/e;->a:Lc2/f;

    iget-object v1, v0, Lc2/e;->e:Ld2/l;

    if-eq p1, v1, :cond_c

    iget-object v0, v0, Lc2/e;->f:Ld2/n;

    if-ne p1, v0, :cond_0

    goto/16 :goto_7

    :cond_0
    if-nez p6, :cond_1

    new-instance p6, Ld2/m;

    invoke-direct {p6, p1, p3}, Ld2/m;-><init>(Ld2/p;I)V

    invoke-virtual {p5, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    move-object v6, p6

    iput-object v6, p1, Ld2/p;->c:Ld2/m;

    invoke-virtual {v6, p1}, Ld2/m;->a(Ld2/p;)V

    iget-object p3, p1, Ld2/p;->h:Ld2/f;

    iget-object p3, p3, Ld2/f;->k:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    if-eqz p6, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Ld2/d;

    instance-of v0, p6, Ld2/f;

    if-eqz v0, :cond_2

    move-object v1, p6

    check-cast v1, Ld2/f;

    const/4 v3, 0x0

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v6}, Ld2/e;->a(Ld2/f;IILd2/f;Ljava/util/ArrayList;Ld2/m;)V

    goto :goto_1

    :cond_2
    move v2, p2

    move-object v4, p4

    move-object v5, p5

    :goto_1
    move p2, v2

    move-object p4, v4

    move-object p5, v5

    goto :goto_0

    :cond_3
    move v2, p2

    move-object v4, p4

    move-object v5, p5

    iget-object p2, p1, Ld2/p;->i:Ld2/f;

    iget-object p2, p2, Ld2/f;->k:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_4
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ld2/d;

    instance-of p4, p3, Ld2/f;

    if-eqz p4, :cond_4

    move-object v1, p3

    check-cast v1, Ld2/f;

    const/4 v3, 0x1

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Ld2/e;->a(Ld2/f;IILd2/f;Ljava/util/ArrayList;Ld2/m;)V

    goto :goto_2

    :cond_5
    const/4 p2, 0x1

    if-ne v2, p2, :cond_7

    instance-of p3, p1, Ld2/n;

    if-eqz p3, :cond_7

    move-object p3, p1

    check-cast p3, Ld2/n;

    iget-object p3, p3, Ld2/n;->k:Ld2/f;

    iget-object p3, p3, Ld2/f;->k:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_6
    :goto_3
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_7

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ld2/d;

    instance-of p5, p4, Ld2/f;

    if-eqz p5, :cond_6

    move-object v1, p4

    check-cast v1, Ld2/f;

    const/4 v3, 0x2

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Ld2/e;->a(Ld2/f;IILd2/f;Ljava/util/ArrayList;Ld2/m;)V

    goto :goto_3

    :cond_7
    iget-object p3, p1, Ld2/p;->h:Ld2/f;

    iget-object p3, p3, Ld2/f;->l:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_4
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_9

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    move-object v1, p4

    check-cast v1, Ld2/f;

    if-ne v1, v4, :cond_8

    iput-boolean p2, v6, Ld2/m;->b:Z

    :cond_8
    const/4 v3, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Ld2/e;->a(Ld2/f;IILd2/f;Ljava/util/ArrayList;Ld2/m;)V

    goto :goto_4

    :cond_9
    iget-object p3, p1, Ld2/p;->i:Ld2/f;

    iget-object p3, p3, Ld2/f;->l:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_5
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_b

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    move-object v1, p4

    check-cast v1, Ld2/f;

    if-ne v1, v4, :cond_a

    iput-boolean p2, v6, Ld2/m;->b:Z

    :cond_a
    const/4 v3, 0x1

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Ld2/e;->a(Ld2/f;IILd2/f;Ljava/util/ArrayList;Ld2/m;)V

    goto :goto_5

    :cond_b
    if-ne v2, p2, :cond_c

    instance-of p2, p1, Ld2/n;

    if-eqz p2, :cond_c

    check-cast p1, Ld2/n;

    iget-object p1, p1, Ld2/n;->k:Ld2/f;

    iget-object p1, p1, Ld2/f;->l:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v1, p2

    check-cast v1, Ld2/f;

    const/4 v3, 0x2

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Ld2/e;->a(Ld2/f;IILd2/f;Ljava/util/ArrayList;Ld2/m;)V

    goto :goto_6

    :cond_c
    :goto_7
    return-void
.end method

.method public final b(Lc2/f;)Z
    .locals 21

    move-object/from16 v0, p1

    iget-object v1, v0, Lc2/m;->L0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_29

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v4, v4, 0x1

    move-object v7, v5

    check-cast v7, Lc2/e;

    iget-object v5, v7, Lc2/e;->Z:[Lc2/e$b;

    aget-object v6, v5, v3

    const/4 v12, 0x1

    aget-object v5, v5, v12

    invoke-virtual {v7}, Lc2/e;->V()I

    move-result v8

    const/16 v9, 0x8

    if-ne v8, v9, :cond_0

    iput-boolean v12, v7, Lc2/e;->a:Z

    goto :goto_0

    :cond_0
    iget v8, v7, Lc2/e;->B:F

    const/high16 v13, 0x3f800000    # 1.0f

    cmpg-float v8, v8, v13

    const/4 v9, 0x2

    if-gez v8, :cond_1

    sget-object v8, Lc2/e$b;->c:Lc2/e$b;

    if-ne v6, v8, :cond_1

    iput v9, v7, Lc2/e;->w:I

    :cond_1
    iget v8, v7, Lc2/e;->E:F

    cmpg-float v8, v8, v13

    if-gez v8, :cond_2

    sget-object v8, Lc2/e$b;->c:Lc2/e$b;

    if-ne v5, v8, :cond_2

    iput v9, v7, Lc2/e;->x:I

    :cond_2
    invoke-virtual {v7}, Lc2/e;->v()F

    move-result v8

    const/4 v10, 0x0

    cmpl-float v8, v8, v10

    const/4 v10, 0x3

    if-lez v8, :cond_8

    sget-object v8, Lc2/e$b;->c:Lc2/e$b;

    if-ne v6, v8, :cond_4

    sget-object v11, Lc2/e$b;->b:Lc2/e$b;

    if-eq v5, v11, :cond_3

    sget-object v11, Lc2/e$b;->a:Lc2/e$b;

    if-ne v5, v11, :cond_4

    :cond_3
    iput v10, v7, Lc2/e;->w:I

    goto :goto_1

    :cond_4
    if-ne v5, v8, :cond_6

    sget-object v11, Lc2/e$b;->b:Lc2/e$b;

    if-eq v6, v11, :cond_5

    sget-object v11, Lc2/e$b;->a:Lc2/e$b;

    if-ne v6, v11, :cond_6

    :cond_5
    iput v10, v7, Lc2/e;->x:I

    goto :goto_1

    :cond_6
    if-ne v6, v8, :cond_8

    if-ne v5, v8, :cond_8

    iget v8, v7, Lc2/e;->w:I

    if-nez v8, :cond_7

    iput v10, v7, Lc2/e;->w:I

    :cond_7
    iget v8, v7, Lc2/e;->x:I

    if-nez v8, :cond_8

    iput v10, v7, Lc2/e;->x:I

    :cond_8
    :goto_1
    sget-object v8, Lc2/e$b;->c:Lc2/e$b;

    if-ne v6, v8, :cond_a

    iget v11, v7, Lc2/e;->w:I

    if-ne v11, v12, :cond_a

    iget-object v11, v7, Lc2/e;->O:Lc2/d;

    iget-object v11, v11, Lc2/d;->f:Lc2/d;

    if-eqz v11, :cond_9

    iget-object v11, v7, Lc2/e;->Q:Lc2/d;

    iget-object v11, v11, Lc2/d;->f:Lc2/d;

    if-nez v11, :cond_a

    :cond_9
    sget-object v6, Lc2/e$b;->b:Lc2/e$b;

    :cond_a
    if-ne v5, v8, :cond_c

    iget v11, v7, Lc2/e;->x:I

    if-ne v11, v12, :cond_c

    iget-object v11, v7, Lc2/e;->P:Lc2/d;

    iget-object v11, v11, Lc2/d;->f:Lc2/d;

    if-eqz v11, :cond_b

    iget-object v11, v7, Lc2/e;->R:Lc2/d;

    iget-object v11, v11, Lc2/d;->f:Lc2/d;

    if-nez v11, :cond_c

    :cond_b
    sget-object v5, Lc2/e$b;->b:Lc2/e$b;

    :cond_c
    iget-object v11, v7, Lc2/e;->e:Ld2/l;

    iput-object v6, v11, Ld2/p;->d:Lc2/e$b;

    iget v14, v7, Lc2/e;->w:I

    iput v14, v11, Ld2/p;->a:I

    iget-object v11, v7, Lc2/e;->f:Ld2/n;

    iput-object v5, v11, Ld2/p;->d:Lc2/e$b;

    iget v15, v7, Lc2/e;->x:I

    iput v15, v11, Ld2/p;->a:I

    sget-object v11, Lc2/e$b;->d:Lc2/e$b;

    move/from16 v16, v3

    if-eq v6, v11, :cond_d

    sget-object v3, Lc2/e$b;->a:Lc2/e$b;

    if-eq v6, v3, :cond_d

    sget-object v3, Lc2/e$b;->b:Lc2/e$b;

    if-ne v6, v3, :cond_f

    :cond_d
    if-eq v5, v11, :cond_e

    sget-object v3, Lc2/e$b;->a:Lc2/e$b;

    if-eq v5, v3, :cond_e

    sget-object v3, Lc2/e$b;->b:Lc2/e$b;

    if-ne v5, v3, :cond_f

    :cond_e
    move-object v10, v5

    move-object v8, v6

    goto/16 :goto_9

    :cond_f
    if-ne v6, v8, :cond_19

    move-object v3, v8

    const/high16 v17, 0x3f000000    # 0.5f

    sget-object v8, Lc2/e$b;->b:Lc2/e$b;

    move/from16 v18, v13

    if-eq v5, v8, :cond_11

    sget-object v13, Lc2/e$b;->a:Lc2/e$b;

    if-ne v5, v13, :cond_10

    goto :goto_2

    :cond_10
    move/from16 v20, v10

    move-object v10, v5

    move/from16 v5, v20

    goto/16 :goto_4

    :cond_11
    :goto_2
    if-ne v14, v10, :cond_14

    if-ne v5, v8, :cond_12

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v10, v8

    move-object/from16 v6, p0

    invoke-virtual/range {v6 .. v11}, Ld2/e;->l(Lc2/e;Lc2/e$b;ILc2/e$b;I)V

    :cond_12
    invoke-virtual {v7}, Lc2/e;->x()I

    move-result v11

    int-to-float v3, v11

    iget v5, v7, Lc2/e;->d0:F

    mul-float/2addr v3, v5

    add-float v3, v3, v17

    float-to-int v9, v3

    sget-object v8, Lc2/e$b;->a:Lc2/e$b;

    move-object v10, v8

    move-object/from16 v6, p0

    invoke-virtual/range {v6 .. v11}, Ld2/e;->l(Lc2/e;Lc2/e$b;ILc2/e$b;I)V

    iget-object v3, v7, Lc2/e;->e:Ld2/l;

    iget-object v3, v3, Ld2/p;->e:Ld2/g;

    invoke-virtual {v7}, Lc2/e;->W()I

    move-result v5

    invoke-virtual {v3, v5}, Ld2/g;->d(I)V

    iget-object v3, v7, Lc2/e;->f:Ld2/n;

    iget-object v3, v3, Ld2/p;->e:Ld2/g;

    invoke-virtual {v7}, Lc2/e;->x()I

    move-result v5

    invoke-virtual {v3, v5}, Ld2/g;->d(I)V

    iput-boolean v12, v7, Lc2/e;->a:Z

    :cond_13
    :goto_3
    move/from16 v3, v16

    goto/16 :goto_0

    :cond_14
    if-ne v14, v12, :cond_15

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v6, p0

    move-object v10, v5

    invoke-virtual/range {v6 .. v11}, Ld2/e;->l(Lc2/e;Lc2/e$b;ILc2/e$b;I)V

    iget-object v3, v7, Lc2/e;->e:Ld2/l;

    iget-object v3, v3, Ld2/p;->e:Ld2/g;

    invoke-virtual {v7}, Lc2/e;->W()I

    move-result v5

    iput v5, v3, Ld2/g;->m:I

    goto :goto_3

    :cond_15
    move/from16 v20, v10

    move-object v10, v5

    move/from16 v5, v20

    if-ne v14, v9, :cond_17

    iget-object v8, v0, Lc2/e;->Z:[Lc2/e$b;

    aget-object v8, v8, v16

    sget-object v13, Lc2/e$b;->a:Lc2/e$b;

    if-eq v8, v13, :cond_16

    if-ne v8, v11, :cond_1a

    :cond_16
    iget v3, v7, Lc2/e;->B:F

    invoke-virtual {v0}, Lc2/e;->W()I

    move-result v5

    int-to-float v5, v5

    mul-float/2addr v3, v5

    add-float v3, v3, v17

    float-to-int v9, v3

    invoke-virtual {v7}, Lc2/e;->x()I

    move-result v11

    move-object/from16 v6, p0

    move-object v8, v13

    invoke-virtual/range {v6 .. v11}, Ld2/e;->l(Lc2/e;Lc2/e$b;ILc2/e$b;I)V

    iget-object v3, v7, Lc2/e;->e:Ld2/l;

    iget-object v3, v3, Ld2/p;->e:Ld2/g;

    invoke-virtual {v7}, Lc2/e;->W()I

    move-result v5

    invoke-virtual {v3, v5}, Ld2/g;->d(I)V

    iget-object v3, v7, Lc2/e;->f:Ld2/n;

    iget-object v3, v3, Ld2/p;->e:Ld2/g;

    invoke-virtual {v7}, Lc2/e;->x()I

    move-result v5

    invoke-virtual {v3, v5}, Ld2/g;->d(I)V

    iput-boolean v12, v7, Lc2/e;->a:Z

    goto :goto_3

    :cond_17
    iget-object v13, v7, Lc2/e;->W:[Lc2/d;

    aget-object v9, v13, v16

    iget-object v9, v9, Lc2/d;->f:Lc2/d;

    if-eqz v9, :cond_18

    aget-object v9, v13, v12

    iget-object v9, v9, Lc2/d;->f:Lc2/d;

    if-nez v9, :cond_1a

    :cond_18
    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v6, p0

    invoke-virtual/range {v6 .. v11}, Ld2/e;->l(Lc2/e;Lc2/e$b;ILc2/e$b;I)V

    iget-object v3, v7, Lc2/e;->e:Ld2/l;

    iget-object v3, v3, Ld2/p;->e:Ld2/g;

    invoke-virtual {v7}, Lc2/e;->W()I

    move-result v5

    invoke-virtual {v3, v5}, Ld2/g;->d(I)V

    iget-object v3, v7, Lc2/e;->f:Ld2/n;

    iget-object v3, v3, Ld2/p;->e:Ld2/g;

    invoke-virtual {v7}, Lc2/e;->x()I

    move-result v5

    invoke-virtual {v3, v5}, Ld2/g;->d(I)V

    iput-boolean v12, v7, Lc2/e;->a:Z

    goto/16 :goto_3

    :cond_19
    move v3, v10

    move-object v10, v5

    move v5, v3

    move-object v3, v8

    move/from16 v18, v13

    const/high16 v17, 0x3f000000    # 0.5f

    :cond_1a
    :goto_4
    if-ne v10, v3, :cond_1b

    sget-object v8, Lc2/e$b;->b:Lc2/e$b;

    if-eq v6, v8, :cond_1c

    sget-object v9, Lc2/e$b;->a:Lc2/e$b;

    if-ne v6, v9, :cond_1b

    goto :goto_5

    :cond_1b
    move-object v8, v6

    goto/16 :goto_7

    :cond_1c
    :goto_5
    if-ne v15, v5, :cond_1f

    if-ne v6, v8, :cond_1d

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v10, v8

    move-object/from16 v6, p0

    invoke-virtual/range {v6 .. v11}, Ld2/e;->l(Lc2/e;Lc2/e$b;ILc2/e$b;I)V

    :cond_1d
    invoke-virtual {v7}, Lc2/e;->W()I

    move-result v9

    iget v3, v7, Lc2/e;->d0:F

    invoke-virtual {v7}, Lc2/e;->w()I

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_1e

    div-float v3, v18, v3

    :cond_1e
    int-to-float v5, v9

    mul-float/2addr v5, v3

    add-float v5, v5, v17

    float-to-int v11, v5

    sget-object v8, Lc2/e$b;->a:Lc2/e$b;

    move-object v10, v8

    move-object/from16 v6, p0

    invoke-virtual/range {v6 .. v11}, Ld2/e;->l(Lc2/e;Lc2/e$b;ILc2/e$b;I)V

    iget-object v3, v7, Lc2/e;->e:Ld2/l;

    iget-object v3, v3, Ld2/p;->e:Ld2/g;

    invoke-virtual {v7}, Lc2/e;->W()I

    move-result v5

    invoke-virtual {v3, v5}, Ld2/g;->d(I)V

    iget-object v3, v7, Lc2/e;->f:Ld2/n;

    iget-object v3, v3, Ld2/p;->e:Ld2/g;

    invoke-virtual {v7}, Lc2/e;->x()I

    move-result v5

    invoke-virtual {v3, v5}, Ld2/g;->d(I)V

    iput-boolean v12, v7, Lc2/e;->a:Z

    goto/16 :goto_3

    :cond_1f
    if-ne v15, v12, :cond_20

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v10, v8

    move-object v8, v6

    move-object/from16 v6, p0

    invoke-virtual/range {v6 .. v11}, Ld2/e;->l(Lc2/e;Lc2/e$b;ILc2/e$b;I)V

    iget-object v3, v7, Lc2/e;->f:Ld2/n;

    iget-object v3, v3, Ld2/p;->e:Ld2/g;

    invoke-virtual {v7}, Lc2/e;->x()I

    move-result v5

    iput v5, v3, Ld2/g;->m:I

    goto/16 :goto_3

    :cond_20
    move-object v9, v8

    move-object v8, v6

    move-object v6, v9

    const/4 v9, 0x2

    if-ne v15, v9, :cond_23

    iget-object v5, v0, Lc2/e;->Z:[Lc2/e$b;

    aget-object v5, v5, v12

    move-object v9, v10

    sget-object v10, Lc2/e$b;->a:Lc2/e$b;

    if-eq v5, v10, :cond_22

    if-ne v5, v11, :cond_21

    goto :goto_6

    :cond_21
    move-object v10, v9

    goto :goto_7

    :cond_22
    :goto_6
    iget v3, v7, Lc2/e;->E:F

    invoke-virtual {v7}, Lc2/e;->W()I

    move-result v9

    invoke-virtual {v0}, Lc2/e;->x()I

    move-result v5

    int-to-float v5, v5

    mul-float/2addr v3, v5

    add-float v3, v3, v17

    float-to-int v11, v3

    move-object/from16 v6, p0

    invoke-virtual/range {v6 .. v11}, Ld2/e;->l(Lc2/e;Lc2/e$b;ILc2/e$b;I)V

    iget-object v3, v7, Lc2/e;->e:Ld2/l;

    iget-object v3, v3, Ld2/p;->e:Ld2/g;

    invoke-virtual {v7}, Lc2/e;->W()I

    move-result v5

    invoke-virtual {v3, v5}, Ld2/g;->d(I)V

    iget-object v3, v7, Lc2/e;->f:Ld2/n;

    iget-object v3, v3, Ld2/p;->e:Ld2/g;

    invoke-virtual {v7}, Lc2/e;->x()I

    move-result v5

    invoke-virtual {v3, v5}, Ld2/g;->d(I)V

    iput-boolean v12, v7, Lc2/e;->a:Z

    goto/16 :goto_3

    :cond_23
    move-object v9, v10

    iget-object v10, v7, Lc2/e;->W:[Lc2/d;

    const/16 v19, 0x2

    aget-object v11, v10, v19

    iget-object v11, v11, Lc2/d;->f:Lc2/d;

    if-eqz v11, :cond_24

    aget-object v5, v10, v5

    iget-object v5, v5, Lc2/d;->f:Lc2/d;

    if-nez v5, :cond_21

    :cond_24
    move-object v10, v9

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v8, v6

    move-object/from16 v6, p0

    invoke-virtual/range {v6 .. v11}, Ld2/e;->l(Lc2/e;Lc2/e$b;ILc2/e$b;I)V

    iget-object v3, v7, Lc2/e;->e:Ld2/l;

    iget-object v3, v3, Ld2/p;->e:Ld2/g;

    invoke-virtual {v7}, Lc2/e;->W()I

    move-result v5

    invoke-virtual {v3, v5}, Ld2/g;->d(I)V

    iget-object v3, v7, Lc2/e;->f:Ld2/n;

    iget-object v3, v3, Ld2/p;->e:Ld2/g;

    invoke-virtual {v7}, Lc2/e;->x()I

    move-result v5

    invoke-virtual {v3, v5}, Ld2/g;->d(I)V

    iput-boolean v12, v7, Lc2/e;->a:Z

    goto/16 :goto_3

    :goto_7
    if-ne v8, v3, :cond_13

    if-ne v10, v3, :cond_13

    if-eq v14, v12, :cond_26

    if-ne v15, v12, :cond_25

    goto :goto_8

    :cond_25
    const/4 v9, 0x2

    if-ne v15, v9, :cond_13

    if-ne v14, v9, :cond_13

    iget-object v3, v0, Lc2/e;->Z:[Lc2/e$b;

    aget-object v5, v3, v16

    sget-object v8, Lc2/e$b;->a:Lc2/e$b;

    if-ne v5, v8, :cond_13

    aget-object v3, v3, v12

    if-ne v3, v8, :cond_13

    iget v3, v7, Lc2/e;->B:F

    iget v5, v7, Lc2/e;->E:F

    invoke-virtual {v0}, Lc2/e;->W()I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v3, v6

    add-float v3, v3, v17

    float-to-int v9, v3

    invoke-virtual {v0}, Lc2/e;->x()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v5, v3

    add-float v5, v5, v17

    float-to-int v11, v5

    move-object v10, v8

    move-object/from16 v6, p0

    invoke-virtual/range {v6 .. v11}, Ld2/e;->l(Lc2/e;Lc2/e$b;ILc2/e$b;I)V

    iget-object v3, v7, Lc2/e;->e:Ld2/l;

    iget-object v3, v3, Ld2/p;->e:Ld2/g;

    invoke-virtual {v7}, Lc2/e;->W()I

    move-result v5

    invoke-virtual {v3, v5}, Ld2/g;->d(I)V

    iget-object v3, v7, Lc2/e;->f:Ld2/n;

    iget-object v3, v3, Ld2/p;->e:Ld2/g;

    invoke-virtual {v7}, Lc2/e;->x()I

    move-result v5

    invoke-virtual {v3, v5}, Ld2/g;->d(I)V

    iput-boolean v12, v7, Lc2/e;->a:Z

    goto/16 :goto_3

    :cond_26
    :goto_8
    sget-object v8, Lc2/e$b;->b:Lc2/e$b;

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v10, v8

    move-object/from16 v6, p0

    invoke-virtual/range {v6 .. v11}, Ld2/e;->l(Lc2/e;Lc2/e$b;ILc2/e$b;I)V

    iget-object v3, v7, Lc2/e;->e:Ld2/l;

    iget-object v3, v3, Ld2/p;->e:Ld2/g;

    invoke-virtual {v7}, Lc2/e;->W()I

    move-result v5

    iput v5, v3, Ld2/g;->m:I

    iget-object v3, v7, Lc2/e;->f:Ld2/n;

    iget-object v3, v3, Ld2/p;->e:Ld2/g;

    invoke-virtual {v7}, Lc2/e;->x()I

    move-result v5

    iput v5, v3, Ld2/g;->m:I

    goto/16 :goto_3

    :goto_9
    invoke-virtual {v7}, Lc2/e;->W()I

    move-result v3

    if-ne v8, v11, :cond_27

    invoke-virtual {v0}, Lc2/e;->W()I

    move-result v3

    iget-object v5, v7, Lc2/e;->O:Lc2/d;

    iget v5, v5, Lc2/d;->g:I

    sub-int/2addr v3, v5

    iget-object v5, v7, Lc2/e;->Q:Lc2/d;

    iget v5, v5, Lc2/d;->g:I

    sub-int/2addr v3, v5

    sget-object v6, Lc2/e$b;->a:Lc2/e$b;

    move-object v8, v6

    :cond_27
    move v9, v3

    invoke-virtual {v7}, Lc2/e;->x()I

    move-result v3

    if-ne v10, v11, :cond_28

    invoke-virtual {v0}, Lc2/e;->x()I

    move-result v3

    iget-object v5, v7, Lc2/e;->P:Lc2/d;

    iget v5, v5, Lc2/d;->g:I

    sub-int/2addr v3, v5

    iget-object v5, v7, Lc2/e;->R:Lc2/d;

    iget v5, v5, Lc2/d;->g:I

    sub-int/2addr v3, v5

    sget-object v5, Lc2/e$b;->a:Lc2/e$b;

    move-object v10, v5

    :cond_28
    move-object/from16 v6, p0

    move v11, v3

    invoke-virtual/range {v6 .. v11}, Ld2/e;->l(Lc2/e;Lc2/e$b;ILc2/e$b;I)V

    iget-object v3, v7, Lc2/e;->e:Ld2/l;

    iget-object v3, v3, Ld2/p;->e:Ld2/g;

    invoke-virtual {v7}, Lc2/e;->W()I

    move-result v5

    invoke-virtual {v3, v5}, Ld2/g;->d(I)V

    iget-object v3, v7, Lc2/e;->f:Ld2/n;

    iget-object v3, v3, Ld2/p;->e:Ld2/g;

    invoke-virtual {v7}, Lc2/e;->x()I

    move-result v5

    invoke-virtual {v3, v5}, Ld2/g;->d(I)V

    iput-boolean v12, v7, Lc2/e;->a:Z

    goto/16 :goto_3

    :cond_29
    move/from16 v16, v3

    return v16
.end method

.method public c()V
    .locals 4

    iget-object v0, p0, Ld2/e;->e:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Ld2/e;->d(Ljava/util/ArrayList;)V

    iget-object v0, p0, Ld2/e;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    sput v0, Ld2/m;->h:I

    iget-object v1, p0, Ld2/e;->a:Lc2/f;

    iget-object v1, v1, Lc2/e;->e:Ld2/l;

    iget-object v2, p0, Ld2/e;->i:Ljava/util/ArrayList;

    invoke-virtual {p0, v1, v0, v2}, Ld2/e;->i(Ld2/p;ILjava/util/ArrayList;)V

    iget-object v1, p0, Ld2/e;->a:Lc2/f;

    iget-object v1, v1, Lc2/e;->f:Ld2/n;

    const/4 v2, 0x1

    iget-object v3, p0, Ld2/e;->i:Ljava/util/ArrayList;

    invoke-virtual {p0, v1, v2, v3}, Ld2/e;->i(Ld2/p;ILjava/util/ArrayList;)V

    iput-boolean v0, p0, Ld2/e;->b:Z

    return-void
.end method

.method public d(Ljava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ld2/p;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Ld2/e;->d:Lc2/f;

    iget-object v0, v0, Lc2/e;->e:Ld2/l;

    invoke-virtual {v0}, Ld2/l;->f()V

    iget-object v0, p0, Ld2/e;->d:Lc2/f;

    iget-object v0, v0, Lc2/e;->f:Ld2/n;

    invoke-virtual {v0}, Ld2/n;->f()V

    iget-object v0, p0, Ld2/e;->d:Lc2/f;

    iget-object v0, v0, Lc2/e;->e:Ld2/l;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ld2/e;->d:Lc2/f;

    iget-object v0, v0, Lc2/e;->f:Ld2/n;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ld2/e;->d:Lc2/f;

    iget-object v0, v0, Lc2/m;->L0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v4, v3

    :cond_0
    :goto_0
    if-ge v4, v1, :cond_8

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v4, v4, 0x1

    check-cast v5, Lc2/e;

    instance-of v6, v5, Lc2/h;

    if-eqz v6, :cond_1

    new-instance v6, Ld2/j;

    invoke-direct {v6, v5}, Ld2/j;-><init>(Lc2/e;)V

    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v5}, Lc2/e;->i0()Z

    move-result v6

    if-eqz v6, :cond_4

    iget-object v6, v5, Lc2/e;->c:Ld2/c;

    if-nez v6, :cond_2

    new-instance v6, Ld2/c;

    invoke-direct {v6, v5, v3}, Ld2/c;-><init>(Lc2/e;I)V

    iput-object v6, v5, Lc2/e;->c:Ld2/c;

    :cond_2
    if-nez v2, :cond_3

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    :cond_3
    iget-object v6, v5, Lc2/e;->c:Ld2/c;

    invoke-virtual {v2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    iget-object v6, v5, Lc2/e;->e:Ld2/l;

    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    invoke-virtual {v5}, Lc2/e;->k0()Z

    move-result v6

    if-eqz v6, :cond_7

    iget-object v6, v5, Lc2/e;->d:Ld2/c;

    if-nez v6, :cond_5

    new-instance v6, Ld2/c;

    const/4 v7, 0x1

    invoke-direct {v6, v5, v7}, Ld2/c;-><init>(Lc2/e;I)V

    iput-object v6, v5, Lc2/e;->d:Ld2/c;

    :cond_5
    if-nez v2, :cond_6

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    :cond_6
    iget-object v6, v5, Lc2/e;->d:Ld2/c;

    invoke-virtual {v2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    iget-object v6, v5, Lc2/e;->f:Ld2/n;

    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    instance-of v6, v5, Lc2/j;

    if-eqz v6, :cond_0

    new-instance v6, Ld2/k;

    invoke-direct {v6, v5}, Ld2/k;-><init>(Lc2/e;)V

    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_8
    if-eqz v2, :cond_9

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_9
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v1, v3

    :goto_3
    if-ge v1, v0, :cond_a

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    check-cast v2, Ld2/p;

    invoke-virtual {v2}, Ld2/p;->f()V

    goto :goto_3

    :cond_a
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_4
    if-ge v3, v0, :cond_c

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v3, v3, 0x1

    check-cast v1, Ld2/p;

    iget-object v2, v1, Ld2/p;->b:Lc2/e;

    iget-object v4, p0, Ld2/e;->d:Lc2/f;

    if-ne v2, v4, :cond_b

    goto :goto_4

    :cond_b
    invoke-virtual {v1}, Ld2/p;->d()V

    goto :goto_4

    :cond_c
    return-void
.end method

.method public final e(Lc2/f;I)I
    .locals 6

    iget-object v0, p0, Ld2/e;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    iget-object v4, p0, Ld2/e;->i:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld2/m;

    invoke-virtual {v4, p1, p2}, Ld2/m;->b(Lc2/f;I)J

    move-result-wide v4

    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    long-to-int p1, v1

    return p1
.end method

.method public f(Z)Z
    .locals 10

    iget-boolean v0, p0, Ld2/e;->b:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ld2/e;->c:Z

    if-eqz v0, :cond_2

    :cond_0
    iget-object v0, p0, Ld2/e;->a:Lc2/f;

    iget-object v0, v0, Lc2/m;->L0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    check-cast v4, Lc2/e;

    invoke-virtual {v4}, Lc2/e;->n()V

    iput-boolean v1, v4, Lc2/e;->a:Z

    iget-object v5, v4, Lc2/e;->e:Ld2/l;

    invoke-virtual {v5}, Ld2/l;->r()V

    iget-object v4, v4, Lc2/e;->f:Ld2/n;

    invoke-virtual {v4}, Ld2/n;->q()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ld2/e;->a:Lc2/f;

    invoke-virtual {v0}, Lc2/e;->n()V

    iget-object v0, p0, Ld2/e;->a:Lc2/f;

    iput-boolean v1, v0, Lc2/e;->a:Z

    iget-object v0, v0, Lc2/e;->e:Ld2/l;

    invoke-virtual {v0}, Ld2/l;->r()V

    iget-object v0, p0, Ld2/e;->a:Lc2/f;

    iget-object v0, v0, Lc2/e;->f:Ld2/n;

    invoke-virtual {v0}, Ld2/n;->q()V

    iput-boolean v1, p0, Ld2/e;->c:Z

    :cond_2
    iget-object v0, p0, Ld2/e;->d:Lc2/f;

    invoke-virtual {p0, v0}, Ld2/e;->b(Lc2/f;)Z

    move-result v0

    if-eqz v0, :cond_3

    return v1

    :cond_3
    iget-object v0, p0, Ld2/e;->a:Lc2/f;

    invoke-virtual {v0, v1}, Lc2/e;->n1(I)V

    iget-object v0, p0, Ld2/e;->a:Lc2/f;

    invoke-virtual {v0, v1}, Lc2/e;->o1(I)V

    iget-object v0, p0, Ld2/e;->a:Lc2/f;

    invoke-virtual {v0, v1}, Lc2/e;->u(I)Lc2/e$b;

    move-result-object v0

    iget-object v2, p0, Ld2/e;->a:Lc2/f;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lc2/e;->u(I)Lc2/e$b;

    move-result-object v2

    iget-boolean v4, p0, Ld2/e;->b:Z

    if-eqz v4, :cond_4

    invoke-virtual {p0}, Ld2/e;->c()V

    :cond_4
    iget-object v4, p0, Ld2/e;->a:Lc2/f;

    invoke-virtual {v4}, Lc2/e;->X()I

    move-result v4

    iget-object v5, p0, Ld2/e;->a:Lc2/f;

    invoke-virtual {v5}, Lc2/e;->Y()I

    move-result v5

    iget-object v6, p0, Ld2/e;->a:Lc2/f;

    iget-object v6, v6, Lc2/e;->e:Ld2/l;

    iget-object v6, v6, Ld2/p;->h:Ld2/f;

    invoke-virtual {v6, v4}, Ld2/f;->d(I)V

    iget-object v6, p0, Ld2/e;->a:Lc2/f;

    iget-object v6, v6, Lc2/e;->f:Ld2/n;

    iget-object v6, v6, Ld2/p;->h:Ld2/f;

    invoke-virtual {v6, v5}, Ld2/f;->d(I)V

    invoke-virtual {p0}, Ld2/e;->m()V

    sget-object v6, Lc2/e$b;->b:Lc2/e$b;

    if-eq v0, v6, :cond_5

    if-ne v2, v6, :cond_9

    :cond_5
    if-eqz p1, :cond_7

    iget-object v6, p0, Ld2/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    move v8, v1

    :cond_6
    if-ge v8, v7, :cond_7

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v8, v8, 0x1

    check-cast v9, Ld2/p;

    invoke-virtual {v9}, Ld2/p;->m()Z

    move-result v9

    if-nez v9, :cond_6

    move p1, v1

    :cond_7
    if-eqz p1, :cond_8

    sget-object v6, Lc2/e$b;->b:Lc2/e$b;

    if-ne v0, v6, :cond_8

    iget-object v6, p0, Ld2/e;->a:Lc2/f;

    sget-object v7, Lc2/e$b;->a:Lc2/e$b;

    invoke-virtual {v6, v7}, Lc2/e;->Q0(Lc2/e$b;)V

    iget-object v6, p0, Ld2/e;->a:Lc2/f;

    invoke-virtual {p0, v6, v1}, Ld2/e;->e(Lc2/f;I)I

    move-result v7

    invoke-virtual {v6, v7}, Lc2/e;->l1(I)V

    iget-object v6, p0, Ld2/e;->a:Lc2/f;

    iget-object v7, v6, Lc2/e;->e:Ld2/l;

    iget-object v7, v7, Ld2/p;->e:Ld2/g;

    invoke-virtual {v6}, Lc2/e;->W()I

    move-result v6

    invoke-virtual {v7, v6}, Ld2/g;->d(I)V

    :cond_8
    if-eqz p1, :cond_9

    sget-object p1, Lc2/e$b;->b:Lc2/e$b;

    if-ne v2, p1, :cond_9

    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    sget-object v6, Lc2/e$b;->a:Lc2/e$b;

    invoke-virtual {p1, v6}, Lc2/e;->h1(Lc2/e$b;)V

    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    invoke-virtual {p0, p1, v3}, Ld2/e;->e(Lc2/f;I)I

    move-result v6

    invoke-virtual {p1, v6}, Lc2/e;->M0(I)V

    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    iget-object v6, p1, Lc2/e;->f:Ld2/n;

    iget-object v6, v6, Ld2/p;->e:Ld2/g;

    invoke-virtual {p1}, Lc2/e;->x()I

    move-result p1

    invoke-virtual {v6, p1}, Ld2/g;->d(I)V

    :cond_9
    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    iget-object v6, p1, Lc2/e;->Z:[Lc2/e$b;

    aget-object v6, v6, v1

    sget-object v7, Lc2/e$b;->a:Lc2/e$b;

    if-eq v6, v7, :cond_b

    sget-object v8, Lc2/e$b;->d:Lc2/e$b;

    if-ne v6, v8, :cond_a

    goto :goto_1

    :cond_a
    move p1, v1

    goto :goto_2

    :cond_b
    :goto_1
    invoke-virtual {p1}, Lc2/e;->W()I

    move-result p1

    add-int/2addr p1, v4

    iget-object v6, p0, Ld2/e;->a:Lc2/f;

    iget-object v6, v6, Lc2/e;->e:Ld2/l;

    iget-object v6, v6, Ld2/p;->i:Ld2/f;

    invoke-virtual {v6, p1}, Ld2/f;->d(I)V

    iget-object v6, p0, Ld2/e;->a:Lc2/f;

    iget-object v6, v6, Lc2/e;->e:Ld2/l;

    iget-object v6, v6, Ld2/p;->e:Ld2/g;

    sub-int/2addr p1, v4

    invoke-virtual {v6, p1}, Ld2/g;->d(I)V

    invoke-virtual {p0}, Ld2/e;->m()V

    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    iget-object v4, p1, Lc2/e;->Z:[Lc2/e$b;

    aget-object v4, v4, v3

    if-eq v4, v7, :cond_c

    sget-object v6, Lc2/e$b;->d:Lc2/e$b;

    if-ne v4, v6, :cond_d

    :cond_c
    invoke-virtual {p1}, Lc2/e;->x()I

    move-result p1

    add-int/2addr p1, v5

    iget-object v4, p0, Ld2/e;->a:Lc2/f;

    iget-object v4, v4, Lc2/e;->f:Ld2/n;

    iget-object v4, v4, Ld2/p;->i:Ld2/f;

    invoke-virtual {v4, p1}, Ld2/f;->d(I)V

    iget-object v4, p0, Ld2/e;->a:Lc2/f;

    iget-object v4, v4, Lc2/e;->f:Ld2/n;

    iget-object v4, v4, Ld2/p;->e:Ld2/g;

    sub-int/2addr p1, v5

    invoke-virtual {v4, p1}, Ld2/g;->d(I)V

    :cond_d
    invoke-virtual {p0}, Ld2/e;->m()V

    move p1, v3

    :goto_2
    iget-object v4, p0, Ld2/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v6, v1

    :goto_3
    if-ge v6, v5, :cond_f

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v6, v6, 0x1

    check-cast v7, Ld2/p;

    iget-object v8, v7, Ld2/p;->b:Lc2/e;

    iget-object v9, p0, Ld2/e;->a:Lc2/f;

    if-ne v8, v9, :cond_e

    iget-boolean v8, v7, Ld2/p;->g:Z

    if-nez v8, :cond_e

    goto :goto_3

    :cond_e
    invoke-virtual {v7}, Ld2/p;->e()V

    goto :goto_3

    :cond_f
    iget-object v4, p0, Ld2/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v6, v1

    :cond_10
    :goto_4
    if-ge v6, v5, :cond_14

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v6, v6, 0x1

    check-cast v7, Ld2/p;

    if-nez p1, :cond_11

    iget-object v8, v7, Ld2/p;->b:Lc2/e;

    iget-object v9, p0, Ld2/e;->a:Lc2/f;

    if-ne v8, v9, :cond_11

    goto :goto_4

    :cond_11
    iget-object v8, v7, Ld2/p;->h:Ld2/f;

    iget-boolean v8, v8, Ld2/f;->j:Z

    if-nez v8, :cond_12

    goto :goto_5

    :cond_12
    iget-object v8, v7, Ld2/p;->i:Ld2/f;

    iget-boolean v8, v8, Ld2/f;->j:Z

    if-nez v8, :cond_13

    instance-of v8, v7, Ld2/j;

    if-nez v8, :cond_13

    goto :goto_5

    :cond_13
    iget-object v8, v7, Ld2/p;->e:Ld2/g;

    iget-boolean v8, v8, Ld2/f;->j:Z

    if-nez v8, :cond_10

    instance-of v8, v7, Ld2/c;

    if-nez v8, :cond_10

    instance-of v7, v7, Ld2/j;

    if-nez v7, :cond_10

    goto :goto_5

    :cond_14
    move v1, v3

    :goto_5
    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    invoke-virtual {p1, v0}, Lc2/e;->Q0(Lc2/e$b;)V

    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    invoke-virtual {p1, v2}, Lc2/e;->h1(Lc2/e$b;)V

    return v1
.end method

.method public g(Z)Z
    .locals 6

    iget-boolean p1, p0, Ld2/e;->b:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    iget-object p1, p1, Lc2/m;->L0:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    check-cast v3, Lc2/e;

    invoke-virtual {v3}, Lc2/e;->n()V

    iput-boolean v0, v3, Lc2/e;->a:Z

    iget-object v4, v3, Lc2/e;->e:Ld2/l;

    iget-object v5, v4, Ld2/p;->e:Ld2/g;

    iput-boolean v0, v5, Ld2/f;->j:Z

    iput-boolean v0, v4, Ld2/p;->g:Z

    invoke-virtual {v4}, Ld2/l;->r()V

    iget-object v3, v3, Lc2/e;->f:Ld2/n;

    iget-object v4, v3, Ld2/p;->e:Ld2/g;

    iput-boolean v0, v4, Ld2/f;->j:Z

    iput-boolean v0, v3, Ld2/p;->g:Z

    invoke-virtual {v3}, Ld2/n;->q()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    invoke-virtual {p1}, Lc2/e;->n()V

    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    iput-boolean v0, p1, Lc2/e;->a:Z

    iget-object p1, p1, Lc2/e;->e:Ld2/l;

    iget-object v1, p1, Ld2/p;->e:Ld2/g;

    iput-boolean v0, v1, Ld2/f;->j:Z

    iput-boolean v0, p1, Ld2/p;->g:Z

    invoke-virtual {p1}, Ld2/l;->r()V

    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    iget-object p1, p1, Lc2/e;->f:Ld2/n;

    iget-object v1, p1, Ld2/p;->e:Ld2/g;

    iput-boolean v0, v1, Ld2/f;->j:Z

    iput-boolean v0, p1, Ld2/p;->g:Z

    invoke-virtual {p1}, Ld2/n;->q()V

    invoke-virtual {p0}, Ld2/e;->c()V

    :cond_1
    iget-object p1, p0, Ld2/e;->d:Lc2/f;

    invoke-virtual {p0, p1}, Ld2/e;->b(Lc2/f;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    invoke-virtual {p1, v0}, Lc2/e;->n1(I)V

    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    invoke-virtual {p1, v0}, Lc2/e;->o1(I)V

    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    iget-object p1, p1, Lc2/e;->e:Ld2/l;

    iget-object p1, p1, Ld2/p;->h:Ld2/f;

    invoke-virtual {p1, v0}, Ld2/f;->d(I)V

    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    iget-object p1, p1, Lc2/e;->f:Ld2/n;

    iget-object p1, p1, Ld2/p;->h:Ld2/f;

    invoke-virtual {p1, v0}, Ld2/f;->d(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public h(ZI)Z
    .locals 11

    iget-object v0, p0, Ld2/e;->a:Lc2/f;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lc2/e;->u(I)Lc2/e$b;

    move-result-object v0

    iget-object v2, p0, Ld2/e;->a:Lc2/f;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lc2/e;->u(I)Lc2/e$b;

    move-result-object v2

    iget-object v4, p0, Ld2/e;->a:Lc2/f;

    invoke-virtual {v4}, Lc2/e;->X()I

    move-result v4

    iget-object v5, p0, Ld2/e;->a:Lc2/f;

    invoke-virtual {v5}, Lc2/e;->Y()I

    move-result v5

    if-eqz p1, :cond_4

    sget-object v6, Lc2/e$b;->b:Lc2/e$b;

    if-eq v0, v6, :cond_0

    if-ne v2, v6, :cond_4

    :cond_0
    iget-object v6, p0, Ld2/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    move v8, v1

    :cond_1
    if-ge v8, v7, :cond_2

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v8, v8, 0x1

    check-cast v9, Ld2/p;

    iget v10, v9, Ld2/p;->f:I

    if-ne v10, p2, :cond_1

    invoke-virtual {v9}, Ld2/p;->m()Z

    move-result v9

    if-nez v9, :cond_1

    move p1, v1

    :cond_2
    if-nez p2, :cond_3

    if-eqz p1, :cond_4

    sget-object p1, Lc2/e$b;->b:Lc2/e$b;

    if-ne v0, p1, :cond_4

    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    sget-object v6, Lc2/e$b;->a:Lc2/e$b;

    invoke-virtual {p1, v6}, Lc2/e;->Q0(Lc2/e$b;)V

    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    invoke-virtual {p0, p1, v1}, Ld2/e;->e(Lc2/f;I)I

    move-result v6

    invoke-virtual {p1, v6}, Lc2/e;->l1(I)V

    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    iget-object v6, p1, Lc2/e;->e:Ld2/l;

    iget-object v6, v6, Ld2/p;->e:Ld2/g;

    invoke-virtual {p1}, Lc2/e;->W()I

    move-result p1

    invoke-virtual {v6, p1}, Ld2/g;->d(I)V

    goto :goto_0

    :cond_3
    if-eqz p1, :cond_4

    sget-object p1, Lc2/e$b;->b:Lc2/e$b;

    if-ne v2, p1, :cond_4

    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    sget-object v6, Lc2/e$b;->a:Lc2/e$b;

    invoke-virtual {p1, v6}, Lc2/e;->h1(Lc2/e$b;)V

    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    invoke-virtual {p0, p1, v3}, Ld2/e;->e(Lc2/f;I)I

    move-result v6

    invoke-virtual {p1, v6}, Lc2/e;->M0(I)V

    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    iget-object v6, p1, Lc2/e;->f:Ld2/n;

    iget-object v6, v6, Ld2/p;->e:Ld2/g;

    invoke-virtual {p1}, Lc2/e;->x()I

    move-result p1

    invoke-virtual {v6, p1}, Ld2/g;->d(I)V

    :cond_4
    :goto_0
    if-nez p2, :cond_6

    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    iget-object v5, p1, Lc2/e;->Z:[Lc2/e$b;

    aget-object v5, v5, v1

    sget-object v6, Lc2/e$b;->a:Lc2/e$b;

    if-eq v5, v6, :cond_5

    sget-object v6, Lc2/e$b;->d:Lc2/e$b;

    if-ne v5, v6, :cond_7

    :cond_5
    invoke-virtual {p1}, Lc2/e;->W()I

    move-result p1

    add-int/2addr p1, v4

    iget-object v5, p0, Ld2/e;->a:Lc2/f;

    iget-object v5, v5, Lc2/e;->e:Ld2/l;

    iget-object v5, v5, Ld2/p;->i:Ld2/f;

    invoke-virtual {v5, p1}, Ld2/f;->d(I)V

    iget-object v5, p0, Ld2/e;->a:Lc2/f;

    iget-object v5, v5, Lc2/e;->e:Ld2/l;

    iget-object v5, v5, Ld2/p;->e:Ld2/g;

    sub-int/2addr p1, v4

    invoke-virtual {v5, p1}, Ld2/g;->d(I)V

    :goto_1
    move p1, v3

    goto :goto_3

    :cond_6
    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    iget-object v4, p1, Lc2/e;->Z:[Lc2/e$b;

    aget-object v4, v4, v3

    sget-object v6, Lc2/e$b;->a:Lc2/e$b;

    if-eq v4, v6, :cond_8

    sget-object v6, Lc2/e$b;->d:Lc2/e$b;

    if-ne v4, v6, :cond_7

    goto :goto_2

    :cond_7
    move p1, v1

    goto :goto_3

    :cond_8
    :goto_2
    invoke-virtual {p1}, Lc2/e;->x()I

    move-result p1

    add-int/2addr p1, v5

    iget-object v4, p0, Ld2/e;->a:Lc2/f;

    iget-object v4, v4, Lc2/e;->f:Ld2/n;

    iget-object v4, v4, Ld2/p;->i:Ld2/f;

    invoke-virtual {v4, p1}, Ld2/f;->d(I)V

    iget-object v4, p0, Ld2/e;->a:Lc2/f;

    iget-object v4, v4, Lc2/e;->f:Ld2/n;

    iget-object v4, v4, Ld2/p;->e:Ld2/g;

    sub-int/2addr p1, v5

    invoke-virtual {v4, p1}, Ld2/g;->d(I)V

    goto :goto_1

    :goto_3
    invoke-virtual {p0}, Ld2/e;->m()V

    iget-object v4, p0, Ld2/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v6, v1

    :goto_4
    if-ge v6, v5, :cond_b

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v6, v6, 0x1

    check-cast v7, Ld2/p;

    iget v8, v7, Ld2/p;->f:I

    if-eq v8, p2, :cond_9

    goto :goto_4

    :cond_9
    iget-object v8, v7, Ld2/p;->b:Lc2/e;

    iget-object v9, p0, Ld2/e;->a:Lc2/f;

    if-ne v8, v9, :cond_a

    iget-boolean v8, v7, Ld2/p;->g:Z

    if-nez v8, :cond_a

    goto :goto_4

    :cond_a
    invoke-virtual {v7}, Ld2/p;->e()V

    goto :goto_4

    :cond_b
    iget-object v4, p0, Ld2/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v6, v1

    :cond_c
    :goto_5
    if-ge v6, v5, :cond_11

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v6, v6, 0x1

    check-cast v7, Ld2/p;

    iget v8, v7, Ld2/p;->f:I

    if-eq v8, p2, :cond_d

    goto :goto_5

    :cond_d
    if-nez p1, :cond_e

    iget-object v8, v7, Ld2/p;->b:Lc2/e;

    iget-object v9, p0, Ld2/e;->a:Lc2/f;

    if-ne v8, v9, :cond_e

    goto :goto_5

    :cond_e
    iget-object v8, v7, Ld2/p;->h:Ld2/f;

    iget-boolean v8, v8, Ld2/f;->j:Z

    if-nez v8, :cond_f

    goto :goto_6

    :cond_f
    iget-object v8, v7, Ld2/p;->i:Ld2/f;

    iget-boolean v8, v8, Ld2/f;->j:Z

    if-nez v8, :cond_10

    goto :goto_6

    :cond_10
    instance-of v8, v7, Ld2/c;

    if-nez v8, :cond_c

    iget-object v7, v7, Ld2/p;->e:Ld2/g;

    iget-boolean v7, v7, Ld2/f;->j:Z

    if-nez v7, :cond_c

    goto :goto_6

    :cond_11
    move v1, v3

    :goto_6
    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    invoke-virtual {p1, v0}, Lc2/e;->Q0(Lc2/e$b;)V

    iget-object p1, p0, Ld2/e;->a:Lc2/f;

    invoke-virtual {p1, v2}, Lc2/e;->h1(Lc2/e$b;)V

    return v1
.end method

.method public final i(Ld2/p;ILjava/util/ArrayList;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld2/p;",
            "I",
            "Ljava/util/ArrayList<",
            "Ld2/m;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p1

    iget-object v1, v0, Ld2/p;->h:Ld2/f;

    iget-object v1, v1, Ld2/f;->k:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld2/d;

    instance-of v3, v2, Ld2/f;

    if-eqz v3, :cond_1

    move-object v5, v2

    check-cast v5, Ld2/f;

    iget-object v8, v0, Ld2/p;->i:Ld2/f;

    const/4 v10, 0x0

    const/4 v7, 0x0

    move-object/from16 v4, p0

    move/from16 v6, p2

    move-object/from16 v9, p3

    invoke-virtual/range {v4 .. v10}, Ld2/e;->a(Ld2/f;IILd2/f;Ljava/util/ArrayList;Ld2/m;)V

    goto :goto_0

    :cond_1
    instance-of v3, v2, Ld2/p;

    if-eqz v3, :cond_0

    check-cast v2, Ld2/p;

    iget-object v12, v2, Ld2/p;->h:Ld2/f;

    iget-object v15, v0, Ld2/p;->i:Ld2/f;

    const/16 v17, 0x0

    const/4 v14, 0x0

    move-object/from16 v11, p0

    move/from16 v13, p2

    move-object/from16 v16, p3

    invoke-virtual/range {v11 .. v17}, Ld2/e;->a(Ld2/f;IILd2/f;Ljava/util/ArrayList;Ld2/m;)V

    goto :goto_0

    :cond_2
    iget-object v1, v0, Ld2/p;->i:Ld2/f;

    iget-object v1, v1, Ld2/f;->k:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld2/d;

    instance-of v3, v2, Ld2/f;

    if-eqz v3, :cond_4

    move-object v12, v2

    check-cast v12, Ld2/f;

    iget-object v15, v0, Ld2/p;->h:Ld2/f;

    const/16 v17, 0x0

    const/4 v14, 0x1

    move-object/from16 v11, p0

    move/from16 v13, p2

    move-object/from16 v16, p3

    invoke-virtual/range {v11 .. v17}, Ld2/e;->a(Ld2/f;IILd2/f;Ljava/util/ArrayList;Ld2/m;)V

    goto :goto_1

    :cond_4
    instance-of v3, v2, Ld2/p;

    if-eqz v3, :cond_3

    check-cast v2, Ld2/p;

    iget-object v12, v2, Ld2/p;->i:Ld2/f;

    iget-object v15, v0, Ld2/p;->h:Ld2/f;

    const/16 v17, 0x0

    const/4 v14, 0x1

    move-object/from16 v11, p0

    move/from16 v13, p2

    move-object/from16 v16, p3

    invoke-virtual/range {v11 .. v17}, Ld2/e;->a(Ld2/f;IILd2/f;Ljava/util/ArrayList;Ld2/m;)V

    goto :goto_1

    :cond_5
    const/4 v1, 0x1

    move/from16 v13, p2

    if-ne v13, v1, :cond_7

    check-cast v0, Ld2/n;

    iget-object v0, v0, Ld2/n;->k:Ld2/f;

    iget-object v0, v0, Ld2/f;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld2/d;

    instance-of v2, v1, Ld2/f;

    if-eqz v2, :cond_6

    move-object v12, v1

    check-cast v12, Ld2/f;

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/4 v14, 0x2

    move-object/from16 v11, p0

    move-object/from16 v16, p3

    invoke-virtual/range {v11 .. v17}, Ld2/e;->a(Ld2/f;IILd2/f;Ljava/util/ArrayList;Ld2/m;)V

    :cond_6
    move/from16 v13, p2

    goto :goto_2

    :cond_7
    return-void
.end method

.method public j()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ld2/e;->b:Z

    return-void
.end method

.method public k()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ld2/e;->c:Z

    return-void
.end method

.method public final l(Lc2/e;Lc2/e$b;ILc2/e$b;I)V
    .locals 1

    iget-object v0, p0, Ld2/e;->h:Ld2/b$a;

    iput-object p2, v0, Ld2/b$a;->a:Lc2/e$b;

    iput-object p4, v0, Ld2/b$a;->b:Lc2/e$b;

    iput p3, v0, Ld2/b$a;->c:I

    iput p5, v0, Ld2/b$a;->d:I

    iget-object p2, p0, Ld2/e;->g:Ld2/b$b;

    invoke-interface {p2, p1, v0}, Ld2/b$b;->b(Lc2/e;Ld2/b$a;)V

    iget-object p2, p0, Ld2/e;->h:Ld2/b$a;

    iget p2, p2, Ld2/b$a;->e:I

    invoke-virtual {p1, p2}, Lc2/e;->l1(I)V

    iget-object p2, p0, Ld2/e;->h:Ld2/b$a;

    iget p2, p2, Ld2/b$a;->f:I

    invoke-virtual {p1, p2}, Lc2/e;->M0(I)V

    iget-object p2, p0, Ld2/e;->h:Ld2/b$a;

    iget-boolean p2, p2, Ld2/b$a;->h:Z

    invoke-virtual {p1, p2}, Lc2/e;->L0(Z)V

    iget-object p2, p0, Ld2/e;->h:Ld2/b$a;

    iget p2, p2, Ld2/b$a;->g:I

    invoke-virtual {p1, p2}, Lc2/e;->B0(I)V

    return-void
.end method

.method public m()V
    .locals 15

    iget-object v0, p0, Ld2/e;->a:Lc2/f;

    iget-object v0, v0, Lc2/m;->L0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :cond_0
    :goto_0
    if-ge v3, v1, :cond_b

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    move-object v6, v4

    check-cast v6, Lc2/e;

    iget-boolean v4, v6, Lc2/e;->a:Z

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    iget-object v4, v6, Lc2/e;->Z:[Lc2/e$b;

    aget-object v11, v4, v2

    const/4 v12, 0x1

    aget-object v4, v4, v12

    iget v5, v6, Lc2/e;->w:I

    iget v7, v6, Lc2/e;->x:I

    sget-object v9, Lc2/e$b;->b:Lc2/e$b;

    if-eq v11, v9, :cond_3

    sget-object v8, Lc2/e$b;->c:Lc2/e$b;

    if-ne v11, v8, :cond_2

    if-ne v5, v12, :cond_2

    goto :goto_1

    :cond_2
    move v5, v2

    goto :goto_2

    :cond_3
    :goto_1
    move v5, v12

    :goto_2
    if-eq v4, v9, :cond_5

    sget-object v8, Lc2/e$b;->c:Lc2/e$b;

    if-ne v4, v8, :cond_4

    if-ne v7, v12, :cond_4

    goto :goto_3

    :cond_4
    move v7, v2

    goto :goto_4

    :cond_5
    :goto_3
    move v7, v12

    :goto_4
    iget-object v8, v6, Lc2/e;->e:Ld2/l;

    iget-object v8, v8, Ld2/p;->e:Ld2/g;

    iget-boolean v10, v8, Ld2/f;->j:Z

    iget-object v13, v6, Lc2/e;->f:Ld2/n;

    iget-object v13, v13, Ld2/p;->e:Ld2/g;

    iget-boolean v14, v13, Ld2/f;->j:Z

    if-eqz v10, :cond_6

    if-eqz v14, :cond_6

    sget-object v7, Lc2/e$b;->a:Lc2/e$b;

    iget v8, v8, Ld2/f;->g:I

    iget v10, v13, Ld2/f;->g:I

    move-object v9, v7

    move-object v5, p0

    invoke-virtual/range {v5 .. v10}, Ld2/e;->l(Lc2/e;Lc2/e$b;ILc2/e$b;I)V

    iput-boolean v12, v6, Lc2/e;->a:Z

    goto :goto_5

    :cond_6
    if-eqz v10, :cond_8

    if-eqz v7, :cond_8

    sget-object v7, Lc2/e$b;->a:Lc2/e$b;

    iget v8, v8, Ld2/f;->g:I

    iget v10, v13, Ld2/f;->g:I

    move-object v5, p0

    invoke-virtual/range {v5 .. v10}, Ld2/e;->l(Lc2/e;Lc2/e$b;ILc2/e$b;I)V

    sget-object v5, Lc2/e$b;->c:Lc2/e$b;

    if-ne v4, v5, :cond_7

    iget-object v4, v6, Lc2/e;->f:Ld2/n;

    iget-object v4, v4, Ld2/p;->e:Ld2/g;

    invoke-virtual {v6}, Lc2/e;->x()I

    move-result v5

    iput v5, v4, Ld2/g;->m:I

    goto :goto_5

    :cond_7
    iget-object v4, v6, Lc2/e;->f:Ld2/n;

    iget-object v4, v4, Ld2/p;->e:Ld2/g;

    invoke-virtual {v6}, Lc2/e;->x()I

    move-result v5

    invoke-virtual {v4, v5}, Ld2/g;->d(I)V

    iput-boolean v12, v6, Lc2/e;->a:Z

    goto :goto_5

    :cond_8
    move-object v7, v9

    if-eqz v14, :cond_a

    if-eqz v5, :cond_a

    iget v8, v8, Ld2/f;->g:I

    sget-object v9, Lc2/e$b;->a:Lc2/e$b;

    iget v10, v13, Ld2/f;->g:I

    move-object v5, p0

    invoke-virtual/range {v5 .. v10}, Ld2/e;->l(Lc2/e;Lc2/e$b;ILc2/e$b;I)V

    sget-object v4, Lc2/e$b;->c:Lc2/e$b;

    if-ne v11, v4, :cond_9

    iget-object v4, v6, Lc2/e;->e:Ld2/l;

    iget-object v4, v4, Ld2/p;->e:Ld2/g;

    invoke-virtual {v6}, Lc2/e;->W()I

    move-result v5

    iput v5, v4, Ld2/g;->m:I

    goto :goto_5

    :cond_9
    iget-object v4, v6, Lc2/e;->e:Ld2/l;

    iget-object v4, v4, Ld2/p;->e:Ld2/g;

    invoke-virtual {v6}, Lc2/e;->W()I

    move-result v5

    invoke-virtual {v4, v5}, Ld2/g;->d(I)V

    iput-boolean v12, v6, Lc2/e;->a:Z

    :cond_a
    :goto_5
    iget-boolean v4, v6, Lc2/e;->a:Z

    if-eqz v4, :cond_0

    iget-object v4, v6, Lc2/e;->f:Ld2/n;

    iget-object v4, v4, Ld2/n;->l:Ld2/g;

    if-eqz v4, :cond_0

    invoke-virtual {v6}, Lc2/e;->p()I

    move-result v5

    invoke-virtual {v4, v5}, Ld2/g;->d(I)V

    goto/16 :goto_0

    :cond_b
    return-void
.end method

.method public n(Ld2/b$b;)V
    .locals 0

    iput-object p1, p0, Ld2/e;->g:Ld2/b$b;

    return-void
.end method
