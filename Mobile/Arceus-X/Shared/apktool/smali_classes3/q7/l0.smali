.class public Lq7/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr7/c$a;

.field public static final b:Lr7/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const-string v7, "hd"

    const-string v8, "d"

    const-string v0, "nm"

    const-string v1, "c"

    const-string v2, "w"

    const-string v3, "o"

    const-string v4, "lc"

    const-string v5, "lj"

    const-string v6, "ml"

    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr7/c$a;->a([Ljava/lang/String;)Lr7/c$a;

    move-result-object v0

    sput-object v0, Lq7/l0;->a:Lr7/c$a;

    const-string v0, "n"

    const-string v1, "v"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr7/c$a;->a([Ljava/lang/String;)Lr7/c$a;

    move-result-object v0

    sput-object v0, Lq7/l0;->b:Lr7/c$a;

    return-void
.end method

.method public static a(Lr7/c;Lf7/i;)Ln7/s;
    .locals 18

    move-object/from16 v0, p0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v5, v1

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v10, v8

    move-object v12, v10

    move v9, v2

    move v11, v4

    move-object v2, v12

    :goto_0
    invoke-virtual {v0}, Lr7/c;->f()Z

    move-result v13

    if-eqz v13, :cond_8

    sget-object v13, Lq7/l0;->a:Lr7/c$a;

    invoke-virtual {v0, v13}, Lr7/c;->r(Lr7/c$a;)I

    move-result v13

    const/4 v14, 0x1

    packed-switch v13, :pswitch_data_0

    invoke-virtual {v0}, Lr7/c;->u()V

    goto :goto_0

    :pswitch_0
    invoke-virtual {v0}, Lr7/c;->b()V

    :goto_1
    invoke-virtual {v0}, Lr7/c;->f()Z

    move-result v13

    if-eqz v13, :cond_6

    invoke-virtual {v0}, Lr7/c;->c()V

    move-object v13, v12

    move-object v15, v13

    :goto_2
    invoke-virtual {v0}, Lr7/c;->f()Z

    move-result v16

    if-eqz v16, :cond_2

    sget-object v12, Lq7/l0;->b:Lr7/c$a;

    invoke-virtual {v0, v12}, Lr7/c;->r(Lr7/c$a;)I

    move-result v12

    if-eqz v12, :cond_1

    if-eq v12, v14, :cond_0

    invoke-virtual {v0}, Lr7/c;->s()V

    invoke-virtual {v0}, Lr7/c;->u()V

    :goto_3
    const/4 v12, 0x0

    goto :goto_2

    :cond_0
    invoke-static/range {p0 .. p1}, Lq7/d;->e(Lr7/c;Lf7/i;)Lm7/b;

    move-result-object v15

    goto :goto_3

    :cond_1
    invoke-virtual {v0}, Lr7/c;->m()Ljava/lang/String;

    move-result-object v13

    goto :goto_3

    :cond_2
    invoke-virtual {v0}, Lr7/c;->e()V

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    move-result v12

    const/16 v17, -0x1

    sparse-switch v12, :sswitch_data_0

    goto :goto_4

    :sswitch_0
    const-string v12, "o"

    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3

    goto :goto_4

    :cond_3
    const/16 v17, 0x2

    goto :goto_4

    :sswitch_1
    const-string v12, "g"

    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    goto :goto_4

    :cond_4
    move/from16 v17, v14

    goto :goto_4

    :sswitch_2
    const-string v12, "d"

    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_5

    goto :goto_4

    :cond_5
    move/from16 v17, v4

    :goto_4
    packed-switch v17, :pswitch_data_1

    move-object/from16 v12, p1

    goto :goto_5

    :pswitch_1
    move-object/from16 v12, p1

    move-object v7, v15

    goto :goto_5

    :pswitch_2
    move-object/from16 v12, p1

    invoke-virtual {v12, v14}, Lf7/i;->u(Z)V

    invoke-interface {v3, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_5
    const/4 v12, 0x0

    goto :goto_1

    :cond_6
    move-object/from16 v12, p1

    invoke-virtual {v0}, Lr7/c;->d()V

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v13

    if-ne v13, v14, :cond_7

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lm7/b;

    invoke-interface {v3, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    :goto_6
    const/4 v12, 0x0

    goto/16 :goto_0

    :pswitch_3
    move-object/from16 v12, p1

    invoke-virtual {v0}, Lr7/c;->g()Z

    move-result v11

    goto :goto_6

    :pswitch_4
    move-object/from16 v12, p1

    invoke-virtual {v0}, Lr7/c;->h()D

    move-result-wide v13

    double-to-float v9, v13

    goto :goto_6

    :pswitch_5
    move-object/from16 v12, p1

    invoke-static {}, Ln7/s$b;->values()[Ln7/s$b;

    move-result-object v6

    invoke-virtual {v0}, Lr7/c;->j()I

    move-result v13

    sub-int/2addr v13, v14

    aget-object v6, v6, v13

    goto :goto_6

    :pswitch_6
    move-object/from16 v12, p1

    invoke-static {}, Ln7/s$a;->values()[Ln7/s$a;

    move-result-object v5

    invoke-virtual {v0}, Lr7/c;->j()I

    move-result v13

    sub-int/2addr v13, v14

    aget-object v5, v5, v13

    goto :goto_6

    :pswitch_7
    move-object/from16 v12, p1

    invoke-static/range {p0 .. p1}, Lq7/d;->h(Lr7/c;Lf7/i;)Lm7/d;

    move-result-object v2

    goto :goto_6

    :pswitch_8
    move-object/from16 v12, p1

    invoke-static/range {p0 .. p1}, Lq7/d;->e(Lr7/c;Lf7/i;)Lm7/b;

    move-result-object v10

    goto :goto_6

    :pswitch_9
    move-object/from16 v12, p1

    invoke-static/range {p0 .. p1}, Lq7/d;->c(Lr7/c;Lf7/i;)Lm7/a;

    move-result-object v8

    goto :goto_6

    :pswitch_a
    move-object/from16 v12, p1

    invoke-virtual {v0}, Lr7/c;->m()Ljava/lang/String;

    move-result-object v1

    goto :goto_6

    :cond_8
    if-nez v2, :cond_9

    new-instance v2, Lm7/d;

    new-instance v0, Lt7/a;

    const/16 v4, 0x64

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v0, v4}, Lt7/a;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v2, v0}, Lm7/d;-><init>(Ljava/util/List;)V

    :cond_9
    if-nez v5, :cond_a

    sget-object v5, Ln7/s$a;->a:Ln7/s$a;

    :cond_a
    if-nez v6, :cond_b

    sget-object v6, Ln7/s$b;->a:Ln7/s$b;

    :cond_b
    new-instance v0, Ln7/s;

    move-object v4, v5

    move-object v5, v2

    move-object v2, v7

    move-object v7, v4

    move-object v4, v8

    move-object v8, v6

    move-object v6, v10

    move v10, v11

    invoke-direct/range {v0 .. v10}, Ln7/s;-><init>(Ljava/lang/String;Lm7/b;Ljava/util/List;Lm7/a;Lm7/d;Lm7/b;Ln7/s$a;Ln7/s$b;FZ)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_2
        0x67 -> :sswitch_1
        0x6f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
