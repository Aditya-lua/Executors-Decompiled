.class public Lq7/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr7/c$a;

.field public static b:Lr7/c$a;

.field public static final c:Lr7/c$a;

.field public static final d:Lr7/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const-string v9, "chars"

    const-string v10, "markers"

    const-string v0, "w"

    const-string v1, "h"

    const-string v2, "ip"

    const-string v3, "op"

    const-string v4, "fr"

    const-string v5, "v"

    const-string v6, "layers"

    const-string v7, "assets"

    const-string v8, "fonts"

    filled-new-array/range {v0 .. v10}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr7/c$a;->a([Ljava/lang/String;)Lr7/c$a;

    move-result-object v0

    sput-object v0, Lq7/w;->a:Lr7/c$a;

    const-string v5, "p"

    const-string v6, "u"

    const-string v1, "id"

    const-string v2, "layers"

    const-string v3, "w"

    const-string v4, "h"

    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr7/c$a;->a([Ljava/lang/String;)Lr7/c$a;

    move-result-object v0

    sput-object v0, Lq7/w;->b:Lr7/c$a;

    const-string v0, "list"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr7/c$a;->a([Ljava/lang/String;)Lr7/c$a;

    move-result-object v0

    sput-object v0, Lq7/w;->c:Lr7/c$a;

    const-string v0, "tm"

    const-string v1, "dr"

    const-string v2, "cm"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr7/c$a;->a([Ljava/lang/String;)Lr7/c$a;

    move-result-object v0

    sput-object v0, Lq7/w;->d:Lr7/c$a;

    return-void
.end method

.method public static a(Lr7/c;)Lf7/i;
    .locals 23

    move-object/from16 v0, p0

    invoke-static {}, Ls7/m;->e()F

    move-result v1

    new-instance v8, Lw1/g;

    invoke-direct {v8}, Lw1/g;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    new-instance v13, Ljava/util/HashMap;

    invoke-direct {v13}, Ljava/util/HashMap;-><init>()V

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    new-instance v12, Lw1/k;

    invoke-direct {v12}, Lw1/k;-><init>()V

    new-instance v2, Lf7/i;

    invoke-direct {v2}, Lf7/i;-><init>()V

    invoke-virtual {v0}, Lr7/c;->c()V

    const/4 v3, 0x0

    move v5, v3

    move v6, v5

    const/4 v11, 0x0

    const/4 v15, 0x0

    :goto_0
    invoke-virtual {v0}, Lr7/c;->f()Z

    move-result v16

    if-eqz v16, :cond_1

    const/16 v16, 0x0

    sget-object v4, Lq7/w;->a:Lr7/c$a;

    invoke-virtual {v0, v4}, Lr7/c;->r(Lr7/c$a;)I

    move-result v4

    packed-switch v4, :pswitch_data_0

    invoke-virtual {v0}, Lr7/c;->s()V

    invoke-virtual {v0}, Lr7/c;->u()V

    goto :goto_1

    :pswitch_0
    invoke-static {v0, v14}, Lq7/w;->f(Lr7/c;Ljava/util/List;)V

    goto :goto_1

    :pswitch_1
    invoke-static {v0, v2, v12}, Lq7/w;->c(Lr7/c;Lf7/i;Lw1/k;)V

    goto :goto_1

    :pswitch_2
    invoke-static {v0, v13}, Lq7/w;->d(Lr7/c;Ljava/util/Map;)V

    goto :goto_1

    :pswitch_3
    invoke-static {v0, v2, v9, v10}, Lq7/w;->b(Lr7/c;Lf7/i;Ljava/util/Map;Ljava/util/Map;)V

    goto :goto_1

    :pswitch_4
    invoke-static {v0, v2, v7, v8}, Lq7/w;->e(Lr7/c;Lf7/i;Ljava/util/List;Lw1/g;)V

    goto :goto_1

    :pswitch_5
    invoke-virtual {v0}, Lr7/c;->m()Ljava/lang/String;

    move-result-object v4

    const-string v0, "\\."

    invoke-virtual {v4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    aget-object v4, v0, v16

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v17

    const/4 v4, 0x1

    aget-object v4, v0, v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v18

    const/4 v4, 0x2

    aget-object v0, v0, v4

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v19

    const/16 v21, 0x4

    const/16 v22, 0x0

    const/16 v20, 0x4

    invoke-static/range {v17 .. v22}, Ls7/m;->j(IIIIII)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Lottie only supports bodymovin >= 4.4.0"

    invoke-virtual {v2, v0}, Lf7/i;->a(Ljava/lang/String;)V

    :cond_0
    :goto_1
    move-object/from16 v0, p0

    goto :goto_0

    :pswitch_6
    move v4, v1

    invoke-virtual/range {p0 .. p0}, Lr7/c;->h()D

    move-result-wide v0

    double-to-float v6, v0

    :goto_2
    move-object/from16 v0, p0

    move v1, v4

    goto :goto_0

    :pswitch_7
    move v4, v1

    invoke-virtual/range {p0 .. p0}, Lr7/c;->h()D

    move-result-wide v0

    double-to-float v0, v0

    const v1, 0x3c23d70a    # 0.01f

    sub-float v5, v0, v1

    goto :goto_2

    :pswitch_8
    move v4, v1

    invoke-virtual/range {p0 .. p0}, Lr7/c;->h()D

    move-result-wide v0

    double-to-float v3, v0

    goto :goto_2

    :pswitch_9
    move v4, v1

    invoke-virtual/range {p0 .. p0}, Lr7/c;->h()D

    move-result-wide v0

    double-to-int v11, v0

    goto :goto_2

    :pswitch_a
    move v4, v1

    invoke-virtual/range {p0 .. p0}, Lr7/c;->h()D

    move-result-wide v0

    double-to-int v15, v0

    goto :goto_2

    :cond_1
    move v4, v1

    const/16 v16, 0x0

    int-to-float v0, v15

    mul-float/2addr v0, v4

    float-to-int v0, v0

    int-to-float v1, v11

    mul-float/2addr v1, v4

    float-to-int v1, v1

    move v4, v3

    new-instance v3, Landroid/graphics/Rect;

    move-object/from16 v17, v2

    move/from16 v2, v16

    invoke-direct {v3, v2, v2, v0, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    move/from16 v16, v11

    invoke-static {}, Ls7/m;->e()F

    move-result v11

    move-object/from16 v2, v17

    invoke-virtual/range {v2 .. v16}, Lf7/i;->s(Landroid/graphics/Rect;FFFLjava/util/List;Lw1/g;Ljava/util/Map;Ljava/util/Map;FLw1/k;Ljava/util/Map;Ljava/util/List;II)V

    return-object v17

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
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static b(Lr7/c;Lf7/i;Ljava/util/Map;Ljava/util/Map;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr7/c;",
            "Lf7/i;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lo7/e;",
            ">;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lf7/k0;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lr7/c;->b()V

    :goto_0
    invoke-virtual {p0}, Lr7/c;->f()Z

    move-result v0

    if-eqz v0, :cond_9

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lw1/g;

    invoke-direct {v1}, Lw1/g;-><init>()V

    invoke-virtual {p0}, Lr7/c;->c()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v5, v2

    move v6, v5

    move-object v7, v3

    move-object v8, v7

    move-object v9, v8

    :goto_1
    invoke-virtual {p0}, Lr7/c;->f()Z

    move-result v2

    if-eqz v2, :cond_7

    sget-object v2, Lq7/w;->b:Lr7/c$a;

    invoke-virtual {p0, v2}, Lr7/c;->r(Lr7/c$a;)I

    move-result v2

    if-eqz v2, :cond_6

    const/4 v3, 0x1

    if-eq v2, v3, :cond_4

    const/4 v3, 0x2

    if-eq v2, v3, :cond_3

    const/4 v3, 0x3

    if-eq v2, v3, :cond_2

    const/4 v3, 0x4

    if-eq v2, v3, :cond_1

    const/4 v3, 0x5

    if-eq v2, v3, :cond_0

    invoke-virtual {p0}, Lr7/c;->s()V

    invoke-virtual {p0}, Lr7/c;->u()V

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lr7/c;->m()Ljava/lang/String;

    move-result-object v9

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lr7/c;->m()Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lr7/c;->j()I

    move-result v6

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lr7/c;->j()I

    move-result v5

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lr7/c;->b()V

    :goto_2
    invoke-virtual {p0}, Lr7/c;->f()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-static {p0, p1}, Lq7/v;->b(Lr7/c;Lf7/i;)Lo7/e;

    move-result-object v2

    invoke-virtual {v2}, Lo7/e;->e()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4, v2}, Lw1/g;->i(JLjava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lr7/c;->d()V

    goto :goto_1

    :cond_6
    invoke-virtual {p0}, Lr7/c;->m()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    :cond_7
    invoke-virtual {p0}, Lr7/c;->e()V

    if-eqz v8, :cond_8

    new-instance v4, Lf7/k0;

    invoke-direct/range {v4 .. v9}, Lf7/k0;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4}, Lf7/k0;->e()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_8
    invoke-interface {p2, v7, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_9
    invoke-virtual {p0}, Lr7/c;->d()V

    return-void
.end method

.method public static c(Lr7/c;Lf7/i;Lw1/k;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr7/c;",
            "Lf7/i;",
            "Lw1/k<",
            "Ll7/d;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lr7/c;->b()V

    :goto_0
    invoke-virtual {p0}, Lr7/c;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Lq7/m;->a(Lr7/c;Lf7/i;)Ll7/d;

    move-result-object v0

    invoke-virtual {v0}, Ll7/d;->hashCode()I

    move-result v1

    invoke-virtual {p2, v1, v0}, Lw1/k;->i(ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lr7/c;->d()V

    return-void
.end method

.method public static d(Lr7/c;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr7/c;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ll7/c;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lr7/c;->c()V

    :goto_0
    invoke-virtual {p0}, Lr7/c;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lq7/w;->c:Lr7/c$a;

    invoke-virtual {p0, v0}, Lr7/c;->r(Lr7/c$a;)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lr7/c;->s()V

    invoke-virtual {p0}, Lr7/c;->u()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lr7/c;->b()V

    :goto_1
    invoke-virtual {p0}, Lr7/c;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Lq7/n;->a(Lr7/c;)Ll7/c;

    move-result-object v0

    invoke-virtual {v0}, Ll7/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lr7/c;->d()V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lr7/c;->e()V

    return-void
.end method

.method public static e(Lr7/c;Lf7/i;Ljava/util/List;Lw1/g;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr7/c;",
            "Lf7/i;",
            "Ljava/util/List<",
            "Lo7/e;",
            ">;",
            "Lw1/g<",
            "Lo7/e;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lr7/c;->b()V

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lr7/c;->f()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {p0, p1}, Lq7/v;->b(Lr7/c;Lf7/i;)Lo7/e;

    move-result-object v1

    invoke-virtual {v1}, Lo7/e;->g()Lo7/e$a;

    move-result-object v2

    sget-object v3, Lo7/e$a;->c:Lo7/e$a;

    if-ne v2, v3, :cond_1

    add-int/lit8 v0, v0, 0x1

    :cond_1
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Lo7/e;->e()J

    move-result-wide v2

    invoke-virtual {p3, v2, v3, v1}, Lw1/g;->i(JLjava/lang/Object;)V

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "You have "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ls7/e;->c(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lr7/c;->d()V

    return-void
.end method

.method public static f(Lr7/c;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr7/c;",
            "Ljava/util/List<",
            "Ll7/h;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lr7/c;->b()V

    :goto_0
    invoke-virtual {p0}, Lr7/c;->f()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lr7/c;->c()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v2, v1

    move v1, v0

    :goto_1
    invoke-virtual {p0}, Lr7/c;->f()Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object v3, Lq7/w;->d:Lr7/c$a;

    invoke-virtual {p0, v3}, Lr7/c;->r(Lr7/c$a;)I

    move-result v3

    if-eqz v3, :cond_2

    const/4 v4, 0x1

    if-eq v3, v4, :cond_1

    const/4 v4, 0x2

    if-eq v3, v4, :cond_0

    invoke-virtual {p0}, Lr7/c;->s()V

    invoke-virtual {p0}, Lr7/c;->u()V

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lr7/c;->h()D

    move-result-wide v3

    double-to-float v1, v3

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lr7/c;->h()D

    move-result-wide v3

    double-to-float v0, v3

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lr7/c;->m()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lr7/c;->e()V

    new-instance v3, Ll7/h;

    invoke-direct {v3, v2, v0, v1}, Ll7/h;-><init>(Ljava/lang/String;FF)V

    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lr7/c;->d()V

    return-void
.end method
