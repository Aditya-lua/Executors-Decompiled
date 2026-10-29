.class public Lq7/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr7/c$a;

.field public static final b:Lr7/c$a;

.field public static final c:Lr7/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 26

    const-string v24, "ao"

    const-string v25, "bm"

    const-string v1, "nm"

    const-string v2, "ind"

    const-string v3, "refId"

    const-string v4, "ty"

    const-string v5, "parent"

    const-string v6, "sw"

    const-string v7, "sh"

    const-string v8, "sc"

    const-string v9, "ks"

    const-string v10, "tt"

    const-string v11, "masksProperties"

    const-string v12, "shapes"

    const-string v13, "t"

    const-string v14, "ef"

    const-string v15, "sr"

    const-string v16, "st"

    const-string v17, "w"

    const-string v18, "h"

    const-string v19, "ip"

    const-string v20, "op"

    const-string v21, "tm"

    const-string v22, "cl"

    const-string v23, "hd"

    filled-new-array/range {v1 .. v25}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr7/c$a;->a([Ljava/lang/String;)Lr7/c$a;

    move-result-object v0

    sput-object v0, Lq7/v;->a:Lr7/c$a;

    const-string v0, "d"

    const-string v1, "a"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr7/c$a;->a([Ljava/lang/String;)Lr7/c$a;

    move-result-object v0

    sput-object v0, Lq7/v;->b:Lr7/c$a;

    const-string v0, "ty"

    const-string v1, "nm"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr7/c$a;->a([Ljava/lang/String;)Lr7/c$a;

    move-result-object v0

    sput-object v0, Lq7/v;->c:Lr7/c$a;

    return-void
.end method

.method public static a(Lf7/i;)Lo7/e;
    .locals 29

    invoke-virtual/range {p0 .. p0}, Lf7/i;->b()Landroid/graphics/Rect;

    move-result-object v0

    new-instance v1, Lo7/e;

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sget-object v7, Lo7/e$a;->a:Lo7/e$a;

    new-instance v12, Lm7/n;

    invoke-direct {v12}, Lm7/n;-><init>()V

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    sget-object v23, Lo7/e$b;->a:Lo7/e$b;

    const/16 v27, 0x0

    sget-object v28, Ln7/h;->a:Ln7/h;

    const-string v4, "__container"

    const-wide/16 v5, -0x1

    const-wide/16 v8, -0x1

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object v11, v2

    move-object/from16 v22, v2

    move/from16 v19, v0

    move/from16 v18, v3

    move-object/from16 v3, p0

    invoke-direct/range {v1 .. v28}, Lo7/e;-><init>(Ljava/util/List;Lf7/i;Ljava/lang/String;JLo7/e$a;JLjava/lang/String;Ljava/util/List;Lm7/n;IIIFFFFLm7/j;Lm7/k;Ljava/util/List;Lo7/e$b;Lm7/b;ZLn7/a;Lq7/j;Ln7/h;)V

    return-object v1
.end method

.method public static b(Lr7/c;Lf7/i;)Lo7/e;
    .locals 40

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    sget-object v4, Lo7/e$b;->a:Lo7/e$b;

    sget-object v5, Ln7/h;->a:Ln7/h;

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Lr7/c;->c()V

    const-string v6, "UNSET"

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, -0x1

    move-object/from16 v22, v4

    move-object/from16 v27, v5

    move/from16 v21, v7

    move/from16 v24, v21

    move/from16 v33, v24

    move/from16 v34, v33

    move/from16 v35, v34

    move/from16 v37, v35

    move-object/from16 v18, v8

    move-object/from16 v17, v11

    move-object/from16 v19, v17

    move-object/from16 v20, v19

    move-object/from16 v23, v20

    move-object/from16 v25, v23

    move-object/from16 v26, v25

    move-wide/from16 v28, v12

    move/from16 v30, v14

    move/from16 v31, v30

    move/from16 v32, v31

    move/from16 v36, v32

    move-wide v7, v15

    move v15, v3

    move-object v11, v6

    move-object/from16 v12, v26

    move-object v13, v12

    move-object/from16 v16, v13

    move/from16 v3, v36

    :goto_0
    invoke-virtual {v0}, Lr7/c;->f()Z

    move-result v4

    if-eqz v4, :cond_14

    sget-object v4, Lq7/v;->a:Lr7/c$a;

    invoke-virtual {v0, v4}, Lr7/c;->r(Lr7/c$a;)I

    move-result v4

    const/4 v5, 0x1

    packed-switch v4, :pswitch_data_0

    invoke-virtual {v0}, Lr7/c;->s()V

    invoke-virtual {v0}, Lr7/c;->u()V

    move/from16 v39, v15

    goto/16 :goto_1

    :pswitch_0
    invoke-virtual {v0}, Lr7/c;->j()I

    move-result v4

    invoke-static {}, Ln7/h;->values()[Ln7/h;

    move-result-object v5

    array-length v5, v5

    if-lt v4, v5, :cond_0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Unsupported Blend Mode: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lf7/i;->a(Ljava/lang/String;)V

    sget-object v27, Ln7/h;->a:Ln7/h;

    goto :goto_0

    :cond_0
    invoke-static {}, Ln7/h;->values()[Ln7/h;

    move-result-object v5

    aget-object v27, v5, v4

    goto :goto_0

    :pswitch_1
    invoke-virtual {v0}, Lr7/c;->j()I

    move-result v3

    if-ne v3, v5, :cond_1

    move v3, v5

    goto :goto_0

    :cond_1
    move v3, v14

    goto :goto_0

    :pswitch_2
    invoke-virtual {v0}, Lr7/c;->g()Z

    move-result v36

    goto :goto_0

    :pswitch_3
    invoke-virtual {v0}, Lr7/c;->m()Ljava/lang/String;

    move-result-object v12

    goto :goto_0

    :pswitch_4
    invoke-static {v0, v1, v14}, Lq7/d;->f(Lr7/c;Lf7/i;Z)Lm7/b;

    move-result-object v23

    goto :goto_0

    :pswitch_5
    invoke-virtual {v0}, Lr7/c;->h()D

    move-result-wide v4

    double-to-float v4, v4

    move/from16 v24, v4

    goto :goto_0

    :pswitch_6
    invoke-virtual {v0}, Lr7/c;->h()D

    move-result-wide v4

    double-to-float v4, v4

    move/from16 v21, v4

    goto :goto_0

    :pswitch_7
    invoke-virtual {v0}, Lr7/c;->h()D

    move-result-wide v4

    invoke-static {}, Ls7/m;->e()F

    move-result v6

    move/from16 v39, v15

    float-to-double v14, v6

    mul-double/2addr v4, v14

    double-to-float v4, v4

    move/from16 v34, v4

    :cond_2
    :goto_1
    move/from16 v15, v39

    :goto_2
    const/4 v14, 0x0

    goto :goto_0

    :pswitch_8
    move/from16 v39, v15

    invoke-virtual {v0}, Lr7/c;->h()D

    move-result-wide v4

    invoke-static {}, Ls7/m;->e()F

    move-result v6

    float-to-double v14, v6

    mul-double/2addr v4, v14

    double-to-float v4, v4

    move/from16 v33, v4

    goto :goto_1

    :pswitch_9
    move/from16 v39, v15

    invoke-virtual {v0}, Lr7/c;->h()D

    move-result-wide v4

    double-to-float v4, v4

    move/from16 v35, v4

    goto :goto_2

    :pswitch_a
    invoke-virtual {v0}, Lr7/c;->h()D

    move-result-wide v4

    double-to-float v15, v4

    goto :goto_2

    :pswitch_b
    move/from16 v39, v15

    invoke-virtual {v0}, Lr7/c;->b()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :goto_3
    invoke-virtual {v0}, Lr7/c;->f()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-virtual {v0}, Lr7/c;->c()V

    :cond_3
    :goto_4
    invoke-virtual {v0}, Lr7/c;->f()Z

    move-result v6

    if-eqz v6, :cond_7

    sget-object v6, Lq7/v;->c:Lr7/c$a;

    invoke-virtual {v0, v6}, Lr7/c;->r(Lr7/c$a;)I

    move-result v6

    if-eqz v6, :cond_5

    if-eq v6, v5, :cond_4

    invoke-virtual {v0}, Lr7/c;->s()V

    invoke-virtual {v0}, Lr7/c;->u()V

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Lr7/c;->m()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    invoke-virtual {v0}, Lr7/c;->j()I

    move-result v6

    const/16 v14, 0x1d

    if-ne v6, v14, :cond_6

    invoke-static/range {p0 .. p1}, Lq7/e;->b(Lr7/c;Lf7/i;)Ln7/a;

    move-result-object v25

    goto :goto_4

    :cond_6
    const/16 v14, 0x19

    if-ne v6, v14, :cond_3

    new-instance v6, Lq7/k;

    invoke-direct {v6}, Lq7/k;-><init>()V

    invoke-virtual {v6, v0, v1}, Lq7/k;->b(Lr7/c;Lf7/i;)Lq7/j;

    move-result-object v26

    goto :goto_4

    :cond_7
    invoke-virtual {v0}, Lr7/c;->e()V

    goto :goto_3

    :cond_8
    invoke-virtual {v0}, Lr7/c;->d()V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Lottie doesn\'t support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lf7/i;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    :pswitch_c
    move/from16 v39, v15

    invoke-virtual {v0}, Lr7/c;->c()V

    :goto_5
    invoke-virtual {v0}, Lr7/c;->f()Z

    move-result v4

    if-eqz v4, :cond_d

    sget-object v4, Lq7/v;->b:Lr7/c$a;

    invoke-virtual {v0, v4}, Lr7/c;->r(Lr7/c$a;)I

    move-result v4

    if-eqz v4, :cond_c

    if-eq v4, v5, :cond_9

    invoke-virtual {v0}, Lr7/c;->s()V

    invoke-virtual {v0}, Lr7/c;->u()V

    goto :goto_5

    :cond_9
    invoke-virtual {v0}, Lr7/c;->b()V

    invoke-virtual {v0}, Lr7/c;->f()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-static/range {p0 .. p1}, Lq7/b;->a(Lr7/c;Lf7/i;)Lm7/k;

    move-result-object v20

    :cond_a
    :goto_6
    invoke-virtual {v0}, Lr7/c;->f()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-virtual {v0}, Lr7/c;->u()V

    goto :goto_6

    :cond_b
    invoke-virtual {v0}, Lr7/c;->d()V

    goto :goto_5

    :cond_c
    invoke-static/range {p0 .. p1}, Lq7/d;->d(Lr7/c;Lf7/i;)Lm7/j;

    move-result-object v19

    goto :goto_5

    :cond_d
    invoke-virtual {v0}, Lr7/c;->e()V

    goto/16 :goto_1

    :pswitch_d
    move/from16 v39, v15

    invoke-virtual {v0}, Lr7/c;->b()V

    :cond_e
    :goto_7
    invoke-virtual {v0}, Lr7/c;->f()Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-static/range {p0 .. p1}, Lq7/h;->a(Lr7/c;Lf7/i;)Ln7/c;

    move-result-object v4

    if-eqz v4, :cond_e

    invoke-interface {v9, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_f
    invoke-virtual {v0}, Lr7/c;->d()V

    goto/16 :goto_1

    :pswitch_e
    move/from16 v39, v15

    invoke-virtual {v0}, Lr7/c;->b()V

    :goto_8
    invoke-virtual {v0}, Lr7/c;->f()Z

    move-result v4

    if-eqz v4, :cond_10

    invoke-static/range {p0 .. p1}, Lq7/x;->a(Lr7/c;Lf7/i;)Ln7/i;

    move-result-object v4

    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_10
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v1, v4}, Lf7/i;->r(I)V

    invoke-virtual {v0}, Lr7/c;->d()V

    goto/16 :goto_1

    :pswitch_f
    move/from16 v39, v15

    invoke-virtual {v0}, Lr7/c;->j()I

    move-result v4

    invoke-static {}, Lo7/e$b;->values()[Lo7/e$b;

    move-result-object v6

    array-length v6, v6

    if-lt v4, v6, :cond_11

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Unsupported matte type: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lf7/i;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_11
    invoke-static {}, Lo7/e$b;->values()[Lo7/e$b;

    move-result-object v6

    aget-object v22, v6, v4

    sget-object v4, Lq7/v$a;->a:[I

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v4, v4, v6

    if-eq v4, v5, :cond_13

    const/4 v6, 0x2

    if-eq v4, v6, :cond_12

    goto :goto_9

    :cond_12
    const-string v4, "Unsupported matte type: Luma Inverted"

    invoke-virtual {v1, v4}, Lf7/i;->a(Ljava/lang/String;)V

    goto :goto_9

    :cond_13
    const-string v4, "Unsupported matte type: Luma"

    invoke-virtual {v1, v4}, Lf7/i;->a(Ljava/lang/String;)V

    :goto_9
    invoke-virtual {v1, v5}, Lf7/i;->r(I)V

    goto/16 :goto_1

    :pswitch_10
    move/from16 v39, v15

    invoke-static/range {p0 .. p1}, Lq7/c;->g(Lr7/c;Lf7/i;)Lm7/n;

    move-result-object v13

    goto/16 :goto_2

    :pswitch_11
    move/from16 v39, v15

    invoke-virtual {v0}, Lr7/c;->m()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v32

    goto/16 :goto_2

    :pswitch_12
    move/from16 v39, v15

    invoke-virtual {v0}, Lr7/c;->j()I

    move-result v4

    int-to-float v4, v4

    invoke-static {}, Ls7/m;->e()F

    move-result v5

    mul-float/2addr v4, v5

    float-to-int v4, v4

    move/from16 v31, v4

    goto/16 :goto_2

    :pswitch_13
    move/from16 v39, v15

    invoke-virtual {v0}, Lr7/c;->j()I

    move-result v4

    int-to-float v4, v4

    invoke-static {}, Ls7/m;->e()F

    move-result v5

    mul-float/2addr v4, v5

    float-to-int v4, v4

    move/from16 v30, v4

    goto/16 :goto_2

    :pswitch_14
    move/from16 v39, v15

    invoke-virtual {v0}, Lr7/c;->j()I

    move-result v4

    int-to-long v7, v4

    goto/16 :goto_2

    :pswitch_15
    move/from16 v39, v15

    invoke-virtual {v0}, Lr7/c;->j()I

    move-result v4

    sget-object v16, Lo7/e$a;->g:Lo7/e$a;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    if-ge v4, v5, :cond_2

    invoke-static {}, Lo7/e$a;->values()[Lo7/e$a;

    move-result-object v5

    aget-object v16, v5, v4

    goto/16 :goto_1

    :pswitch_16
    move/from16 v39, v15

    invoke-virtual {v0}, Lr7/c;->m()Ljava/lang/String;

    move-result-object v17

    goto/16 :goto_2

    :pswitch_17
    move/from16 v39, v15

    invoke-virtual {v0}, Lr7/c;->j()I

    move-result v4

    int-to-long v4, v4

    move-wide/from16 v28, v4

    goto/16 :goto_2

    :pswitch_18
    move/from16 v39, v15

    invoke-virtual {v0}, Lr7/c;->m()Ljava/lang/String;

    move-result-object v11

    goto/16 :goto_2

    :cond_14
    move/from16 v39, v15

    invoke-virtual {v0}, Lr7/c;->e()V

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    cmpl-float v0, v21, v37

    if-lez v0, :cond_15

    new-instance v0, Lt7/a;

    const/4 v5, 0x0

    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    const/4 v4, 0x0

    move v15, v3

    move-object v3, v2

    invoke-direct/range {v0 .. v6}, Lt7/a;-><init>(Lf7/i;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V

    move-object/from16 v38, v2

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_15
    move-object/from16 v38, v2

    move v15, v3

    :goto_a
    cmpl-float v0, v24, v37

    if-lez v0, :cond_16

    goto :goto_b

    :cond_16
    invoke-virtual/range {p1 .. p1}, Lf7/i;->f()F

    move-result v24

    :goto_b
    new-instance v0, Lt7/a;

    const/4 v4, 0x0

    invoke-static/range {v24 .. v24}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    move-object/from16 v3, v18

    move-object/from16 v1, p1

    move-object/from16 v2, v18

    move/from16 v5, v21

    invoke-direct/range {v0 .. v6}, Lt7/a;-><init>(Lf7/i;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lt7/a;

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    move-object/from16 v3, v38

    move-object/from16 v1, p1

    move/from16 v5, v24

    move-object/from16 v2, v38

    invoke-direct/range {v0 .. v6}, Lt7/a;-><init>(Lf7/i;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v0, ".ai"

    invoke-virtual {v11, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_17

    const-string v0, "ai"

    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    :cond_17
    const-string v0, "Convert your Illustrator layers to shape layers."

    invoke-virtual {v1, v0}, Lf7/i;->a(Ljava/lang/String;)V

    :cond_18
    if-eqz v15, :cond_1a

    if-nez v13, :cond_19

    new-instance v13, Lm7/n;

    invoke-direct {v13}, Lm7/n;-><init>()V

    :cond_19
    invoke-virtual {v13, v15}, Lm7/n;->m(Z)V

    :cond_1a
    new-instance v0, Lo7/e;

    move-object v2, v1

    move-object v1, v9

    move-object v3, v11

    move-object v11, v13

    move-object/from16 v21, v14

    move-object/from16 v6, v16

    move-object/from16 v9, v17

    move-wide/from16 v4, v28

    move/from16 v12, v30

    move/from16 v13, v31

    move/from16 v14, v32

    move/from16 v17, v33

    move/from16 v18, v34

    move/from16 v16, v35

    move/from16 v24, v36

    move/from16 v15, v39

    invoke-direct/range {v0 .. v27}, Lo7/e;-><init>(Ljava/util/List;Lf7/i;Ljava/lang/String;JLo7/e$a;JLjava/lang/String;Ljava/util/List;Lm7/n;IIIFFFFLm7/j;Lm7/k;Ljava/util/List;Lo7/e$b;Lm7/b;ZLn7/a;Lq7/j;Ln7/h;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
