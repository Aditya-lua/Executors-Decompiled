.class public Lq7/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroid/view/animation/Interpolator;

.field public static b:Lw1/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw1/k<",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/animation/Interpolator;",
            ">;>;"
        }
    .end annotation
.end field

.field public static c:Lr7/c$a;

.field public static d:Lr7/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    sput-object v0, Lq7/t;->a:Landroid/view/animation/Interpolator;

    const-string v7, "to"

    const-string v8, "ti"

    const-string v1, "t"

    const-string v2, "s"

    const-string v3, "e"

    const-string v4, "o"

    const-string v5, "i"

    const-string v6, "h"

    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr7/c$a;->a([Ljava/lang/String;)Lr7/c$a;

    move-result-object v0

    sput-object v0, Lq7/t;->c:Lr7/c$a;

    const-string v0, "x"

    const-string v1, "y"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr7/c$a;->a([Ljava/lang/String;)Lr7/c$a;

    move-result-object v0

    sput-object v0, Lq7/t;->d:Lr7/c$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)Ljava/lang/ref/WeakReference;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/animation/Interpolator;",
            ">;"
        }
    .end annotation

    const-class v0, Lq7/t;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lq7/t;->g()Lw1/k;

    move-result-object v1

    invoke-virtual {v1, p0}, Lw1/k;->e(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/ref/WeakReference;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static b(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/view/animation/Interpolator;
    .locals 6

    iget v0, p0, Landroid/graphics/PointF;->x:F

    const/high16 v1, -0x40800000    # -1.0f

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v0, v1, v2}, Ls7/j;->b(FFF)F

    move-result v0

    iput v0, p0, Landroid/graphics/PointF;->x:F

    iget v0, p0, Landroid/graphics/PointF;->y:F

    const/high16 v3, -0x3d380000    # -100.0f

    const/high16 v4, 0x42c80000    # 100.0f

    invoke-static {v0, v3, v4}, Ls7/j;->b(FFF)F

    move-result v0

    iput v0, p0, Landroid/graphics/PointF;->y:F

    iget v0, p1, Landroid/graphics/PointF;->x:F

    invoke-static {v0, v1, v2}, Ls7/j;->b(FFF)F

    move-result v0

    iput v0, p1, Landroid/graphics/PointF;->x:F

    iget v0, p1, Landroid/graphics/PointF;->y:F

    invoke-static {v0, v3, v4}, Ls7/j;->b(FFF)F

    move-result v0

    iput v0, p1, Landroid/graphics/PointF;->y:F

    iget v1, p0, Landroid/graphics/PointF;->x:F

    iget v3, p0, Landroid/graphics/PointF;->y:F

    iget v4, p1, Landroid/graphics/PointF;->x:F

    invoke-static {v1, v3, v4, v0}, Ls7/m;->i(FFFF)I

    move-result v0

    invoke-static {}, Lf7/e;->e()Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    move-object v1, v3

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lq7/t;->a(I)Ljava/lang/ref/WeakReference;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/animation/Interpolator;

    :cond_1
    if-eqz v1, :cond_3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    return-object v3

    :cond_3
    :goto_1
    :try_start_0
    iget v1, p0, Landroid/graphics/PointF;->x:F

    iget v3, p0, Landroid/graphics/PointF;->y:F

    iget v4, p1, Landroid/graphics/PointF;->x:F

    iget v5, p1, Landroid/graphics/PointF;->y:F

    invoke-static {v1, v3, v4, v5}, Lz2/a;->a(FFFF)Landroid/view/animation/Interpolator;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    const-string v3, "The Path cannot loop back on itself."

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget v1, p0, Landroid/graphics/PointF;->x:F

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    iget p0, p0, Landroid/graphics/PointF;->y:F

    iget v2, p1, Landroid/graphics/PointF;->x:F

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-static {v1, p0, v2, p1}, Lz2/a;->a(FFFF)Landroid/view/animation/Interpolator;

    move-result-object p0

    goto :goto_2

    :cond_4
    new-instance p0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {p0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    :goto_2
    invoke-static {}, Lf7/e;->e()Z

    move-result p1

    if-nez p1, :cond_5

    :try_start_1
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, p1}, Lq7/t;->h(ILjava/lang/ref/WeakReference;)V
    :try_end_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_5
    return-object p0
.end method

.method public static c(Lr7/c;Lf7/i;FLq7/n0;ZZ)Lt7/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lr7/c;",
            "Lf7/i;",
            "F",
            "Lq7/n0<",
            "TT;>;ZZ)",
            "Lt7/a<",
            "TT;>;"
        }
    .end annotation

    if-eqz p4, :cond_0

    if-eqz p5, :cond_0

    invoke-static {p1, p0, p2, p3}, Lq7/t;->e(Lf7/i;Lr7/c;FLq7/n0;)Lt7/a;

    move-result-object p0

    return-object p0

    :cond_0
    if-eqz p4, :cond_1

    invoke-static {p1, p0, p2, p3}, Lq7/t;->d(Lf7/i;Lr7/c;FLq7/n0;)Lt7/a;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0, p2, p3}, Lq7/t;->f(Lr7/c;FLq7/n0;)Lt7/a;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lf7/i;Lr7/c;FLq7/n0;)Lt7/a;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lf7/i;",
            "Lr7/c;",
            "F",
            "Lq7/n0<",
            "TT;>;)",
            "Lt7/a<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p1}, Lr7/c;->c()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, v0

    move-object v5, v3

    move-object v10, v5

    move-object v11, v10

    move v8, v1

    move v4, v2

    move-object v1, v11

    :goto_0
    invoke-virtual {p1}, Lr7/c;->f()Z

    move-result v6

    if-eqz v6, :cond_1

    sget-object v6, Lq7/t;->c:Lr7/c$a;

    invoke-virtual {p1, v6}, Lr7/c;->r(Lr7/c$a;)I

    move-result v6

    const/high16 v7, 0x3f800000    # 1.0f

    packed-switch v6, :pswitch_data_0

    invoke-virtual {p1}, Lr7/c;->u()V

    goto :goto_0

    :pswitch_0
    invoke-static {p1, p2}, Lq7/s;->e(Lr7/c;F)Landroid/graphics/PointF;

    move-result-object v11

    goto :goto_0

    :pswitch_1
    invoke-static {p1, p2}, Lq7/s;->e(Lr7/c;F)Landroid/graphics/PointF;

    move-result-object v10

    goto :goto_0

    :pswitch_2
    invoke-virtual {p1}, Lr7/c;->j()I

    move-result v4

    const/4 v6, 0x1

    if-ne v4, v6, :cond_0

    move v4, v6

    goto :goto_0

    :cond_0
    move v4, v2

    goto :goto_0

    :pswitch_3
    invoke-static {p1, v7}, Lq7/s;->e(Lr7/c;F)Landroid/graphics/PointF;

    move-result-object v1

    goto :goto_0

    :pswitch_4
    invoke-static {p1, v7}, Lq7/s;->e(Lr7/c;F)Landroid/graphics/PointF;

    move-result-object v0

    goto :goto_0

    :pswitch_5
    invoke-interface {p3, p1, p2}, Lq7/n0;->a(Lr7/c;F)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    :pswitch_6
    invoke-interface {p3, p1, p2}, Lq7/n0;->a(Lr7/c;F)Ljava/lang/Object;

    move-result-object v5

    goto :goto_0

    :pswitch_7
    invoke-virtual {p1}, Lr7/c;->h()D

    move-result-wide v6

    double-to-float v8, v6

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lr7/c;->e()V

    if-eqz v4, :cond_2

    sget-object p1, Lq7/t;->a:Landroid/view/animation/Interpolator;

    move-object v7, p1

    move-object v6, v5

    goto :goto_2

    :cond_2
    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    invoke-static {v0, v1}, Lq7/t;->b(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/view/animation/Interpolator;

    move-result-object p1

    :goto_1
    move-object v7, p1

    move-object v6, v3

    goto :goto_2

    :cond_3
    sget-object p1, Lq7/t;->a:Landroid/view/animation/Interpolator;

    goto :goto_1

    :goto_2
    new-instance v3, Lt7/a;

    const/4 v9, 0x0

    move-object v4, p0

    invoke-direct/range {v3 .. v9}, Lt7/a;-><init>(Lf7/i;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V

    iput-object v10, v3, Lt7/a;->o:Landroid/graphics/PointF;

    iput-object v11, v3, Lt7/a;->p:Landroid/graphics/PointF;

    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

.method public static e(Lf7/i;Lr7/c;FLq7/n0;)Lt7/a;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lf7/i;",
            "Lr7/c;",
            "F",
            "Lq7/n0<",
            "TT;>;)",
            "Lt7/a<",
            "TT;>;"
        }
    .end annotation

    move-object/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v2, p3

    invoke-virtual {v0}, Lr7/c;->c()V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    :goto_0
    invoke-virtual {v0}, Lr7/c;->f()Z

    move-result v18

    if-eqz v18, :cond_11

    sget-object v3, Lq7/t;->c:Lr7/c$a;

    invoke-virtual {v0, v3}, Lr7/c;->r(Lr7/c$a;)I

    move-result v3

    const/4 v4, 0x1

    packed-switch v3, :pswitch_data_0

    invoke-virtual {v0}, Lr7/c;->u()V

    goto :goto_0

    :pswitch_0
    invoke-static/range {p1 .. p2}, Lq7/s;->e(Lr7/c;F)Landroid/graphics/PointF;

    move-result-object v15

    goto :goto_0

    :pswitch_1
    invoke-static/range {p1 .. p2}, Lq7/s;->e(Lr7/c;F)Landroid/graphics/PointF;

    move-result-object v14

    goto :goto_0

    :pswitch_2
    invoke-virtual {v0}, Lr7/c;->j()I

    move-result v3

    if-ne v3, v4, :cond_0

    move v6, v4

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    goto :goto_0

    :pswitch_3
    invoke-virtual {v0}, Lr7/c;->o()Lr7/c$b;

    move-result-object v3

    sget-object v5, Lr7/c$b;->c:Lr7/c$b;

    if-ne v3, v5, :cond_8

    invoke-virtual {v0}, Lr7/c;->c()V

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_1
    invoke-virtual {v0}, Lr7/c;->f()Z

    move-result v19

    if-eqz v19, :cond_7

    sget-object v4, Lq7/t;->d:Lr7/c$a;

    invoke-virtual {v0, v4}, Lr7/c;->r(Lr7/c$a;)I

    move-result v4

    if-eqz v4, :cond_4

    move/from16 v20, v6

    const/4 v6, 0x1

    if-eq v4, v6, :cond_1

    invoke-virtual {v0}, Lr7/c;->u()V

    :goto_2
    move/from16 v6, v20

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lr7/c;->o()Lr7/c$b;

    move-result-object v4

    sget-object v5, Lr7/c$b;->g:Lr7/c$b;

    if-ne v4, v5, :cond_2

    invoke-virtual {v0}, Lr7/c;->h()D

    move-result-wide v4

    double-to-float v13, v4

    move v5, v13

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lr7/c;->b()V

    move-object v4, v14

    invoke-virtual {v0}, Lr7/c;->h()D

    move-result-wide v13

    double-to-float v6, v13

    invoke-virtual {v0}, Lr7/c;->o()Lr7/c$b;

    move-result-object v13

    if-ne v13, v5, :cond_3

    invoke-virtual {v0}, Lr7/c;->h()D

    move-result-wide v13

    double-to-float v5, v13

    move v13, v5

    goto :goto_3

    :cond_3
    move v13, v6

    :goto_3
    invoke-virtual {v0}, Lr7/c;->d()V

    move-object v14, v4

    move v5, v6

    goto :goto_2

    :cond_4
    move/from16 v20, v6

    move-object v4, v14

    invoke-virtual {v0}, Lr7/c;->o()Lr7/c$b;

    move-result-object v3

    sget-object v6, Lr7/c$b;->g:Lr7/c$b;

    if-ne v3, v6, :cond_5

    move-object v14, v4

    invoke-virtual {v0}, Lr7/c;->h()D

    move-result-wide v3

    double-to-float v12, v3

    move v3, v12

    goto :goto_2

    :cond_5
    move-object v14, v4

    invoke-virtual {v0}, Lr7/c;->b()V

    invoke-virtual {v0}, Lr7/c;->h()D

    move-result-wide v3

    double-to-float v3, v3

    invoke-virtual {v0}, Lr7/c;->o()Lr7/c$b;

    move-result-object v4

    if-ne v4, v6, :cond_6

    move v6, v3

    invoke-virtual {v0}, Lr7/c;->h()D

    move-result-wide v3

    double-to-float v3, v3

    move v12, v3

    goto :goto_4

    :cond_6
    move v6, v3

    move v12, v6

    :goto_4
    invoke-virtual {v0}, Lr7/c;->d()V

    move v3, v6

    goto :goto_2

    :cond_7
    move/from16 v20, v6

    new-instance v4, Landroid/graphics/PointF;

    invoke-direct {v4, v3, v5}, Landroid/graphics/PointF;-><init>(FF)V

    new-instance v3, Landroid/graphics/PointF;

    invoke-direct {v3, v12, v13}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v0}, Lr7/c;->e()V

    move-object v13, v3

    move-object v12, v4

    goto/16 :goto_0

    :cond_8
    move/from16 v20, v6

    invoke-static/range {p1 .. p2}, Lq7/s;->e(Lr7/c;F)Landroid/graphics/PointF;

    move-result-object v8

    goto/16 :goto_0

    :pswitch_4
    move/from16 v20, v6

    invoke-virtual {v0}, Lr7/c;->o()Lr7/c$b;

    move-result-object v3

    sget-object v4, Lr7/c$b;->c:Lr7/c$b;

    if-ne v3, v4, :cond_10

    invoke-virtual {v0}, Lr7/c;->c()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_5
    invoke-virtual {v0}, Lr7/c;->f()Z

    move-result v9

    if-eqz v9, :cond_f

    sget-object v9, Lq7/t;->d:Lr7/c$a;

    invoke-virtual {v0, v9}, Lr7/c;->r(Lr7/c$a;)I

    move-result v9

    if-eqz v9, :cond_c

    const/4 v11, 0x1

    if-eq v9, v11, :cond_9

    invoke-virtual {v0}, Lr7/c;->u()V

    goto :goto_5

    :cond_9
    invoke-virtual {v0}, Lr7/c;->o()Lr7/c$b;

    move-result-object v4

    sget-object v6, Lr7/c$b;->g:Lr7/c$b;

    if-ne v4, v6, :cond_a

    move-object/from16 v19, v12

    invoke-virtual {v0}, Lr7/c;->h()D

    move-result-wide v11

    double-to-float v6, v11

    move v4, v6

    :goto_6
    move-object/from16 v12, v19

    goto :goto_5

    :cond_a
    move-object/from16 v19, v12

    invoke-virtual {v0}, Lr7/c;->b()V

    invoke-virtual {v0}, Lr7/c;->h()D

    move-result-wide v11

    double-to-float v4, v11

    invoke-virtual {v0}, Lr7/c;->o()Lr7/c$b;

    move-result-object v11

    if-ne v11, v6, :cond_b

    invoke-virtual {v0}, Lr7/c;->h()D

    move-result-wide v11

    double-to-float v6, v11

    goto :goto_7

    :cond_b
    move v6, v4

    :goto_7
    invoke-virtual {v0}, Lr7/c;->d()V

    goto :goto_6

    :cond_c
    move-object/from16 v19, v12

    invoke-virtual {v0}, Lr7/c;->o()Lr7/c$b;

    move-result-object v3

    sget-object v5, Lr7/c$b;->g:Lr7/c$b;

    if-ne v3, v5, :cond_d

    invoke-virtual {v0}, Lr7/c;->h()D

    move-result-wide v11

    double-to-float v5, v11

    move v3, v5

    goto :goto_6

    :cond_d
    invoke-virtual {v0}, Lr7/c;->b()V

    invoke-virtual {v0}, Lr7/c;->h()D

    move-result-wide v11

    double-to-float v3, v11

    invoke-virtual {v0}, Lr7/c;->o()Lr7/c$b;

    move-result-object v11

    if-ne v11, v5, :cond_e

    invoke-virtual {v0}, Lr7/c;->h()D

    move-result-wide v11

    double-to-float v5, v11

    goto :goto_8

    :cond_e
    move v5, v3

    :goto_8
    invoke-virtual {v0}, Lr7/c;->d()V

    goto :goto_6

    :cond_f
    move-object/from16 v19, v12

    new-instance v9, Landroid/graphics/PointF;

    invoke-direct {v9, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    new-instance v11, Landroid/graphics/PointF;

    invoke-direct {v11, v5, v6}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v0}, Lr7/c;->e()V

    :goto_9
    move/from16 v6, v20

    goto/16 :goto_0

    :cond_10
    move-object/from16 v19, v12

    invoke-static/range {p1 .. p2}, Lq7/s;->e(Lr7/c;F)Landroid/graphics/PointF;

    move-result-object v7

    goto :goto_9

    :pswitch_5
    move/from16 v20, v6

    move-object/from16 v19, v12

    invoke-interface {v2, v0, v1}, Lq7/n0;->a(Lr7/c;F)Ljava/lang/Object;

    move-result-object v17

    goto/16 :goto_0

    :pswitch_6
    move/from16 v20, v6

    move-object/from16 v19, v12

    invoke-interface {v2, v0, v1}, Lq7/n0;->a(Lr7/c;F)Ljava/lang/Object;

    move-result-object v10

    goto/16 :goto_0

    :pswitch_7
    move/from16 v20, v6

    move-object/from16 v19, v12

    invoke-virtual {v0}, Lr7/c;->h()D

    move-result-wide v3

    double-to-float v3, v3

    move/from16 v16, v3

    goto/16 :goto_0

    :cond_11
    move/from16 v20, v6

    move-object/from16 v19, v12

    invoke-virtual {v0}, Lr7/c;->e()V

    if-eqz v20, :cond_12

    sget-object v0, Lq7/t;->a:Landroid/view/animation/Interpolator;

    move-object v3, v0

    move-object v11, v10

    :goto_a
    const/4 v12, 0x0

    const/4 v13, 0x0

    goto :goto_c

    :cond_12
    if-eqz v7, :cond_13

    if-eqz v8, :cond_13

    invoke-static {v7, v8}, Lq7/t;->b(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/view/animation/Interpolator;

    move-result-object v0

    :goto_b
    move-object v3, v0

    move-object/from16 v11, v17

    goto :goto_a

    :cond_13
    if-eqz v9, :cond_14

    if-eqz v11, :cond_14

    if-eqz v19, :cond_14

    if-eqz v13, :cond_14

    move-object/from16 v12, v19

    invoke-static {v9, v12}, Lq7/t;->b(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/view/animation/Interpolator;

    move-result-object v0

    invoke-static {v11, v13}, Lq7/t;->b(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/view/animation/Interpolator;

    move-result-object v1

    move-object v12, v0

    move-object v13, v1

    move-object/from16 v11, v17

    const/4 v3, 0x0

    goto :goto_c

    :cond_14
    sget-object v0, Lq7/t;->a:Landroid/view/animation/Interpolator;

    goto :goto_b

    :goto_c
    if-eqz v12, :cond_15

    if-eqz v13, :cond_15

    new-instance v8, Lt7/a;

    move-object v3, v15

    const/4 v15, 0x0

    move-object/from16 v9, p0

    move-object v0, v3

    move-object v4, v14

    move/from16 v14, v16

    invoke-direct/range {v8 .. v15}, Lt7/a;-><init>(Lf7/i;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V

    goto :goto_d

    :cond_15
    move-object v4, v14

    move-object v0, v15

    move/from16 v13, v16

    new-instance v8, Lt7/a;

    const/4 v14, 0x0

    move-object/from16 v9, p0

    move-object v12, v3

    invoke-direct/range {v8 .. v14}, Lt7/a;-><init>(Lf7/i;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V

    :goto_d
    iput-object v4, v8, Lt7/a;->o:Landroid/graphics/PointF;

    iput-object v0, v8, Lt7/a;->p:Landroid/graphics/PointF;

    return-object v8

    :pswitch_data_0
    .packed-switch 0x0
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

.method public static f(Lr7/c;FLq7/n0;)Lt7/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lr7/c;",
            "F",
            "Lq7/n0<",
            "TT;>;)",
            "Lt7/a<",
            "TT;>;"
        }
    .end annotation

    invoke-interface {p2, p0, p1}, Lq7/n0;->a(Lr7/c;F)Ljava/lang/Object;

    move-result-object p0

    new-instance p1, Lt7/a;

    invoke-direct {p1, p0}, Lt7/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public static g()Lw1/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw1/k<",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/animation/Interpolator;",
            ">;>;"
        }
    .end annotation

    sget-object v0, Lq7/t;->b:Lw1/k;

    if-nez v0, :cond_0

    new-instance v0, Lw1/k;

    invoke-direct {v0}, Lw1/k;-><init>()V

    sput-object v0, Lq7/t;->b:Lw1/k;

    :cond_0
    sget-object v0, Lq7/t;->b:Lw1/k;

    return-object v0
.end method

.method public static h(ILjava/lang/ref/WeakReference;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/animation/Interpolator;",
            ">;)V"
        }
    .end annotation

    const-class v0, Lq7/t;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lq7/t;->b:Lw1/k;

    invoke-virtual {v1, p0, p1}, Lw1/k;->i(ILjava/lang/Object;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
