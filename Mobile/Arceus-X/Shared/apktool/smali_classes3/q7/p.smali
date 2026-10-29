.class public Lq7/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr7/c$a;

.field public static final b:Lr7/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const-string v6, "r"

    const-string v7, "hd"

    const-string v0, "nm"

    const-string v1, "g"

    const-string v2, "o"

    const-string v3, "t"

    const-string v4, "s"

    const-string v5, "e"

    filled-new-array/range {v0 .. v7}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr7/c$a;->a([Ljava/lang/String;)Lr7/c$a;

    move-result-object v0

    sput-object v0, Lq7/p;->a:Lr7/c$a;

    const-string v0, "p"

    const-string v1, "k"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr7/c$a;->a([Ljava/lang/String;)Lr7/c$a;

    move-result-object v0

    sput-object v0, Lq7/p;->b:Lr7/c$a;

    return-void
.end method

.method public static a(Lr7/c;Lf7/i;)Ln7/e;
    .locals 14

    sget-object v0, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v6, v0

    move-object v4, v1

    move-object v5, v4

    move-object v7, v5

    move-object v9, v7

    move-object v10, v9

    move v13, v2

    :goto_0
    invoke-virtual {p0}, Lr7/c;->f()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lq7/p;->a:Lr7/c$a;

    invoke-virtual {p0, v0}, Lr7/c;->r(Lr7/c$a;)I

    move-result v0

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lr7/c;->s()V

    invoke-virtual {p0}, Lr7/c;->u()V

    goto :goto_0

    :pswitch_0
    invoke-virtual {p0}, Lr7/c;->g()Z

    move-result v13

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0}, Lr7/c;->j()I

    move-result v0

    if-ne v0, v2, :cond_0

    sget-object v0, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    :goto_1
    move-object v6, v0

    goto :goto_0

    :cond_0
    sget-object v0, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    goto :goto_1

    :pswitch_2
    invoke-static {p0, p1}, Lq7/d;->i(Lr7/c;Lf7/i;)Lm7/f;

    move-result-object v10

    goto :goto_0

    :pswitch_3
    invoke-static {p0, p1}, Lq7/d;->i(Lr7/c;Lf7/i;)Lm7/f;

    move-result-object v9

    goto :goto_0

    :pswitch_4
    invoke-virtual {p0}, Lr7/c;->j()I

    move-result v0

    if-ne v0, v2, :cond_1

    sget-object v0, Ln7/g;->a:Ln7/g;

    :goto_2
    move-object v5, v0

    goto :goto_0

    :cond_1
    sget-object v0, Ln7/g;->b:Ln7/g;

    goto :goto_2

    :pswitch_5
    invoke-static {p0, p1}, Lq7/d;->h(Lr7/c;Lf7/i;)Lm7/d;

    move-result-object v1

    goto :goto_0

    :pswitch_6
    invoke-virtual {p0}, Lr7/c;->c()V

    const/4 v0, -0x1

    :goto_3
    invoke-virtual {p0}, Lr7/c;->f()Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v3, Lq7/p;->b:Lr7/c$a;

    invoke-virtual {p0, v3}, Lr7/c;->r(Lr7/c$a;)I

    move-result v3

    if-eqz v3, :cond_3

    if-eq v3, v2, :cond_2

    invoke-virtual {p0}, Lr7/c;->s()V

    invoke-virtual {p0}, Lr7/c;->u()V

    goto :goto_3

    :cond_2
    invoke-static {p0, p1, v0}, Lq7/d;->g(Lr7/c;Lf7/i;I)Lm7/c;

    move-result-object v7

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, Lr7/c;->j()I

    move-result v0

    goto :goto_3

    :cond_4
    invoke-virtual {p0}, Lr7/c;->e()V

    goto :goto_0

    :pswitch_7
    invoke-virtual {p0}, Lr7/c;->m()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_5
    if-nez v1, :cond_6

    new-instance v1, Lm7/d;

    new-instance p0, Lt7/a;

    const/16 p1, 0x64

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Lt7/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v1, p0}, Lm7/d;-><init>(Ljava/util/List;)V

    :cond_6
    move-object v8, v1

    new-instance v3, Ln7/e;

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v3 .. v13}, Ln7/e;-><init>(Ljava/lang/String;Ln7/g;Landroid/graphics/Path$FillType;Lm7/c;Lm7/d;Lm7/f;Lm7/f;Lm7/b;Lm7/b;Z)V

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
