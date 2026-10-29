.class public Lq7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr7/c$a;

.field public static final b:Lr7/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const-string v8, "sk"

    const-string v9, "sa"

    const-string v0, "a"

    const-string v1, "p"

    const-string v2, "s"

    const-string v3, "rz"

    const-string v4, "r"

    const-string v5, "o"

    const-string v6, "so"

    const-string v7, "eo"

    filled-new-array/range {v0 .. v9}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr7/c$a;->a([Ljava/lang/String;)Lr7/c$a;

    move-result-object v0

    sput-object v0, Lq7/c;->a:Lr7/c$a;

    const-string v0, "k"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr7/c$a;->a([Ljava/lang/String;)Lr7/c$a;

    move-result-object v0

    sput-object v0, Lq7/c;->b:Lr7/c$a;

    return-void
.end method

.method public static a(Lm7/e;)Z
    .locals 2

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lm7/e;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lm7/e;->b()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lt7/a;

    iget-object p0, p0, Lt7/a;->b:Ljava/lang/Object;

    check-cast p0, Landroid/graphics/PointF;

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, Landroid/graphics/PointF;->equals(FF)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static b(Lm7/o;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm7/o<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;)Z"
        }
    .end annotation

    if-eqz p0, :cond_1

    instance-of v0, p0, Lm7/i;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-interface {p0}, Lm7/o;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lm7/o;->b()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lt7/a;

    iget-object p0, p0, Lt7/a;->b:Ljava/lang/Object;

    check-cast p0, Landroid/graphics/PointF;

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, Landroid/graphics/PointF;->equals(FF)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static c(Lm7/b;)Z
    .locals 2

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lm7/b;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lm7/b;->b()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lt7/a;

    iget-object p0, p0, Lt7/a;->b:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    const/4 v0, 0x0

    cmpl-float p0, p0, v0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static d(Lm7/g;)Z
    .locals 2

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lm7/g;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lm7/g;->b()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lt7/a;

    iget-object p0, p0, Lt7/a;->b:Ljava/lang/Object;

    check-cast p0, Lt7/d;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0, v0}, Lt7/d;->a(FF)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static e(Lm7/b;)Z
    .locals 2

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lm7/b;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lm7/b;->b()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lt7/a;

    iget-object p0, p0, Lt7/a;->b:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    const/4 v0, 0x0

    cmpl-float p0, p0, v0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static f(Lm7/b;)Z
    .locals 2

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lm7/b;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lm7/b;->b()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lt7/a;

    iget-object p0, p0, Lt7/a;->b:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    const/4 v0, 0x0

    cmpl-float p0, p0, v0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static g(Lr7/c;Lf7/i;)Lm7/n;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v0}, Lr7/c;->o()Lr7/c$b;

    move-result-object v1

    sget-object v4, Lr7/c$b;->c:Lr7/c$b;

    const/4 v8, 0x0

    if-ne v1, v4, :cond_0

    const/4 v1, 0x1

    move v9, v1

    goto :goto_0

    :cond_0
    move v9, v8

    :goto_0
    if-eqz v9, :cond_1

    invoke-virtual {v0}, Lr7/c;->c()V

    :cond_1
    const/4 v1, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    :goto_1
    invoke-virtual {v0}, Lr7/c;->f()Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, Lq7/c;->a:Lr7/c$a;

    invoke-virtual {v0, v4}, Lr7/c;->r(Lr7/c$a;)I

    move-result v4

    packed-switch v4, :pswitch_data_0

    invoke-virtual {v0}, Lr7/c;->s()V

    invoke-virtual {v0}, Lr7/c;->u()V

    goto :goto_1

    :pswitch_0
    invoke-static {v0, v2, v8}, Lq7/d;->f(Lr7/c;Lf7/i;Z)Lm7/b;

    move-result-object v15

    goto :goto_1

    :pswitch_1
    invoke-static {v0, v2, v8}, Lq7/d;->f(Lr7/c;Lf7/i;Z)Lm7/b;

    move-result-object v14

    goto :goto_1

    :pswitch_2
    invoke-static {v0, v2, v8}, Lq7/d;->f(Lr7/c;Lf7/i;Z)Lm7/b;

    move-result-object v23

    goto :goto_1

    :pswitch_3
    invoke-static {v0, v2, v8}, Lq7/d;->f(Lr7/c;Lf7/i;Z)Lm7/b;

    move-result-object v22

    goto :goto_1

    :pswitch_4
    invoke-static/range {p0 .. p1}, Lq7/d;->h(Lr7/c;Lf7/i;)Lm7/d;

    move-result-object v21

    goto :goto_1

    :pswitch_5
    const-string v1, "Lottie doesn\'t support 3D layers."

    invoke-virtual {v2, v1}, Lf7/i;->a(Ljava/lang/String;)V

    :pswitch_6
    invoke-static {v0, v2, v8}, Lq7/d;->f(Lr7/c;Lf7/i;Z)Lm7/b;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lm7/b;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual/range {v16 .. v16}, Lm7/b;->b()Ljava/util/List;

    move-result-object v1

    move-object v4, v1

    new-instance v1, Lt7/a;

    invoke-virtual {v2}, Lf7/i;->f()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v17, v4

    move-object v4, v3

    move-object/from16 v10, v17

    invoke-direct/range {v1 .. v7}, Lt7/a;-><init>(Lf7/i;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V

    invoke-interface {v10, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-virtual/range {v16 .. v16}, Lm7/b;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt7/a;

    iget-object v1, v1, Lt7/a;->b:Ljava/lang/Object;

    if-nez v1, :cond_3

    invoke-virtual/range {v16 .. v16}, Lm7/b;->b()Ljava/util/List;

    move-result-object v10

    new-instance v1, Lt7/a;

    invoke-virtual/range {p1 .. p1}, Lf7/i;->f()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v4, v3

    move-object/from16 v2, p1

    invoke-direct/range {v1 .. v7}, Lt7/a;-><init>(Lf7/i;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V

    invoke-interface {v10, v8, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_2
    move-object/from16 v2, p1

    move-object/from16 v1, v16

    goto/16 :goto_1

    :pswitch_7
    invoke-static/range {p0 .. p1}, Lq7/d;->j(Lr7/c;Lf7/i;)Lm7/g;

    move-result-object v13

    :goto_3
    move-object/from16 v2, p1

    goto/16 :goto_1

    :pswitch_8
    invoke-static/range {p0 .. p1}, Lq7/a;->b(Lr7/c;Lf7/i;)Lm7/o;

    move-result-object v12

    goto :goto_3

    :pswitch_9
    invoke-virtual {v0}, Lr7/c;->c()V

    :goto_4
    invoke-virtual {v0}, Lr7/c;->f()Z

    move-result v2

    if-eqz v2, :cond_5

    sget-object v2, Lq7/c;->b:Lr7/c$a;

    invoke-virtual {v0, v2}, Lr7/c;->r(Lr7/c$a;)I

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v0}, Lr7/c;->s()V

    invoke-virtual {v0}, Lr7/c;->u()V

    goto :goto_4

    :cond_4
    invoke-static/range {p0 .. p1}, Lq7/a;->a(Lr7/c;Lf7/i;)Lm7/e;

    move-result-object v11

    goto :goto_4

    :cond_5
    invoke-virtual {v0}, Lr7/c;->e()V

    goto :goto_3

    :cond_6
    if-eqz v9, :cond_7

    invoke-virtual {v0}, Lr7/c;->e()V

    :cond_7
    invoke-static {v11}, Lq7/c;->a(Lm7/e;)Z

    move-result v0

    if-eqz v0, :cond_8

    const/16 v17, 0x0

    goto :goto_5

    :cond_8
    move-object/from16 v17, v11

    :goto_5
    invoke-static {v12}, Lq7/c;->b(Lm7/o;)Z

    move-result v0

    if-eqz v0, :cond_9

    const/4 v12, 0x0

    :cond_9
    invoke-static {v1}, Lq7/c;->c(Lm7/b;)Z

    move-result v0

    if-eqz v0, :cond_a

    const/16 v20, 0x0

    goto :goto_6

    :cond_a
    move-object/from16 v20, v1

    :goto_6
    invoke-static {v13}, Lq7/c;->d(Lm7/g;)Z

    move-result v0

    if-eqz v0, :cond_b

    const/16 v19, 0x0

    goto :goto_7

    :cond_b
    move-object/from16 v19, v13

    :goto_7
    invoke-static {v14}, Lq7/c;->f(Lm7/b;)Z

    move-result v0

    if-eqz v0, :cond_c

    const/16 v24, 0x0

    goto :goto_8

    :cond_c
    move-object/from16 v24, v14

    :goto_8
    invoke-static {v15}, Lq7/c;->e(Lm7/b;)Z

    move-result v0

    if-eqz v0, :cond_d

    const/16 v25, 0x0

    goto :goto_9

    :cond_d
    move-object/from16 v25, v15

    :goto_9
    new-instance v16, Lm7/n;

    move-object/from16 v18, v12

    invoke-direct/range {v16 .. v25}, Lm7/n;-><init>(Lm7/e;Lm7/o;Lm7/g;Lm7/b;Lm7/d;Lm7/b;Lm7/b;Lm7/b;Lm7/b;)V

    return-object v16

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_5
        :pswitch_6
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
