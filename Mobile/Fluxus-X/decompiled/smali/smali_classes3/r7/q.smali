.class public Lr7/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ls7/c$a;

.field public static final b:Ls7/c$a;

.field public static final c:Ls7/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const-string v10, "hd"

    const-string v11, "d"

    const-string v0, "nm"

    const-string v1, "g"

    const-string v2, "o"

    const-string v3, "t"

    const-string v4, "s"

    const-string v5, "e"

    const-string v6, "w"

    const-string v7, "lc"

    const-string v8, "lj"

    const-string v9, "ml"

    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ls7/c$a;->a([Ljava/lang/String;)Ls7/c$a;

    move-result-object v0

    sput-object v0, Lr7/q;->a:Ls7/c$a;

    const-string v0, "p"

    const-string v1, "k"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ls7/c$a;->a([Ljava/lang/String;)Ls7/c$a;

    move-result-object v0

    sput-object v0, Lr7/q;->b:Ls7/c$a;

    const-string v0, "n"

    const-string v1, "v"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ls7/c$a;->a([Ljava/lang/String;)Ls7/c$a;

    move-result-object v0

    sput-object v0, Lr7/q;->c:Ls7/c$a;

    return-void
.end method

.method public static a(Ls7/c;Lg7/i;)Lo7/f;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v5, v2

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    move-object v12, v9

    move-object v13, v12

    move-object v14, v13

    move-object/from16 v16, v14

    move v10, v3

    const/4 v15, 0x0

    move-object/from16 v3, v16

    :goto_0
    invoke-virtual {v0}, Ls7/c;->f()Z

    move-result v17

    if-eqz v17, :cond_c

    sget-object v4, Lr7/q;->a:Ls7/c$a;

    invoke-virtual {v0, v4}, Ls7/c;->s(Ls7/c$a;)I

    move-result v4

    move-object/from16 v18, v2

    packed-switch v4, :pswitch_data_0

    invoke-virtual {v0}, Ls7/c;->u()V

    invoke-virtual {v0}, Ls7/c;->w()V

    :goto_1
    move-object/from16 v2, v18

    goto :goto_0

    :pswitch_0
    invoke-virtual {v0}, Ls7/c;->b()V

    :goto_2
    invoke-virtual {v0}, Ls7/c;->f()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {v0}, Ls7/c;->c()V

    move-object/from16 v4, v16

    move-object/from16 v19, v4

    :goto_3
    invoke-virtual {v0}, Ls7/c;->f()Z

    move-result v20

    if-eqz v20, :cond_2

    sget-object v2, Lr7/q;->c:Ls7/c$a;

    invoke-virtual {v0, v2}, Ls7/c;->s(Ls7/c$a;)I

    move-result v2

    if-eqz v2, :cond_1

    move-object/from16 v21, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_0

    invoke-virtual {v0}, Ls7/c;->u()V

    invoke-virtual {v0}, Ls7/c;->w()V

    :goto_4
    move-object/from16 v3, v21

    goto :goto_3

    :cond_0
    invoke-static/range {p0 .. p1}, Lr7/d;->e(Ls7/c;Lg7/i;)Ln7/b;

    move-result-object v19

    goto :goto_4

    :cond_1
    move-object/from16 v21, v3

    invoke-virtual {v0}, Ls7/c;->n()Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    :cond_2
    move-object/from16 v21, v3

    invoke-virtual {v0}, Ls7/c;->e()V

    const-string v2, "o"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move-object/from16 v14, v19

    :cond_3
    const/4 v3, 0x1

    goto :goto_5

    :cond_4
    const-string v2, "d"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "g"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_5
    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Lg7/i;->u(Z)V

    move-object/from16 v2, v19

    invoke-interface {v11, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_5
    move-object/from16 v3, v21

    goto :goto_2

    :cond_6
    move-object/from16 v21, v3

    const/4 v3, 0x1

    invoke-virtual {v0}, Ls7/c;->d()V

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v2

    if-ne v2, v3, :cond_7

    const/4 v2, 0x0

    invoke-interface {v11, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln7/b;

    invoke-interface {v11, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_7
    const/4 v2, 0x0

    :goto_6
    move-object/from16 v2, v18

    :goto_7
    move-object/from16 v3, v21

    goto/16 :goto_0

    :pswitch_1
    move-object/from16 v21, v3

    const/4 v2, 0x0

    invoke-virtual {v0}, Ls7/c;->g()Z

    move-result v15

    goto/16 :goto_1

    :pswitch_2
    move-object/from16 v21, v3

    const/4 v2, 0x0

    invoke-virtual {v0}, Ls7/c;->h()D

    move-result-wide v3

    double-to-float v10, v3

    goto :goto_6

    :pswitch_3
    move-object/from16 v21, v3

    const/4 v2, 0x0

    invoke-static {}, Lo7/s$b;->values()[Lo7/s$b;

    move-result-object v3

    invoke-virtual {v0}, Ls7/c;->k()I

    move-result v4

    const/16 v20, 0x1

    add-int/lit8 v4, v4, -0x1

    aget-object v13, v3, v4

    goto :goto_6

    :pswitch_4
    move-object/from16 v21, v3

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {}, Lo7/s$a;->values()[Lo7/s$a;

    move-result-object v4

    invoke-virtual {v0}, Ls7/c;->k()I

    move-result v12

    sub-int/2addr v12, v3

    aget-object v12, v4, v12

    goto :goto_6

    :pswitch_5
    move-object/from16 v21, v3

    const/4 v2, 0x0

    invoke-static/range {p0 .. p1}, Lr7/d;->e(Ls7/c;Lg7/i;)Ln7/b;

    move-result-object v9

    goto/16 :goto_1

    :pswitch_6
    move-object/from16 v21, v3

    const/4 v2, 0x0

    invoke-static/range {p0 .. p1}, Lr7/d;->i(Ls7/c;Lg7/i;)Ln7/f;

    move-result-object v8

    goto/16 :goto_1

    :pswitch_7
    move-object/from16 v21, v3

    const/4 v2, 0x0

    invoke-static/range {p0 .. p1}, Lr7/d;->i(Ls7/c;Lg7/i;)Ln7/f;

    move-result-object v7

    goto/16 :goto_1

    :pswitch_8
    move-object/from16 v21, v3

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0}, Ls7/c;->k()I

    move-result v4

    if-ne v4, v3, :cond_8

    sget-object v3, Lo7/g;->a:Lo7/g;

    goto :goto_8

    :cond_8
    sget-object v3, Lo7/g;->b:Lo7/g;

    :goto_8
    move-object v2, v3

    goto :goto_7

    :pswitch_9
    const/4 v2, 0x0

    invoke-static/range {p0 .. p1}, Lr7/d;->h(Ls7/c;Lg7/i;)Ln7/d;

    move-result-object v3

    goto/16 :goto_1

    :pswitch_a
    move-object/from16 v21, v3

    const/4 v2, 0x0

    invoke-virtual {v0}, Ls7/c;->c()V

    const/4 v3, -0x1

    :goto_9
    invoke-virtual {v0}, Ls7/c;->f()Z

    move-result v4

    if-eqz v4, :cond_b

    sget-object v4, Lr7/q;->b:Ls7/c$a;

    invoke-virtual {v0, v4}, Ls7/c;->s(Ls7/c$a;)I

    move-result v4

    if-eqz v4, :cond_a

    const/4 v2, 0x1

    if-eq v4, v2, :cond_9

    invoke-virtual {v0}, Ls7/c;->u()V

    invoke-virtual {v0}, Ls7/c;->w()V

    :goto_a
    const/4 v2, 0x0

    goto :goto_9

    :cond_9
    invoke-static {v0, v1, v3}, Lr7/d;->g(Ls7/c;Lg7/i;I)Ln7/c;

    move-result-object v6

    goto :goto_a

    :cond_a
    const/4 v2, 0x1

    invoke-virtual {v0}, Ls7/c;->k()I

    move-result v3

    goto :goto_a

    :cond_b
    invoke-virtual {v0}, Ls7/c;->e()V

    goto/16 :goto_6

    :pswitch_b
    move-object/from16 v21, v3

    invoke-virtual {v0}, Ls7/c;->n()Ljava/lang/String;

    move-result-object v5

    goto/16 :goto_1

    :cond_c
    move-object/from16 v18, v2

    move-object/from16 v21, v3

    if-nez v21, :cond_d

    new-instance v3, Ln7/d;

    new-instance v0, Lu7/a;

    const/16 v1, 0x64

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lu7/a;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v3, v0}, Ln7/d;-><init>(Ljava/util/List;)V

    move-object v4, v3

    goto :goto_b

    :cond_d
    move-object/from16 v4, v21

    :goto_b
    new-instance v0, Lo7/f;

    move-object v1, v5

    move-object v3, v6

    move-object v5, v7

    move-object v6, v8

    move-object v7, v9

    move-object v8, v12

    move-object v9, v13

    move-object v12, v14

    move v13, v15

    move-object/from16 v2, v18

    invoke-direct/range {v0 .. v13}, Lo7/f;-><init>(Ljava/lang/String;Lo7/g;Ln7/c;Ln7/d;Ln7/f;Ln7/f;Ln7/b;Lo7/s$a;Lo7/s$b;FLjava/util/List;Ln7/b;Z)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
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
