.class public Lr7/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ls7/c$a;

.field public static final b:Ls7/c$a;


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

    invoke-static {v0}, Ls7/c$a;->a([Ljava/lang/String;)Ls7/c$a;

    move-result-object v0

    sput-object v0, Lr7/p;->a:Ls7/c$a;

    const-string v0, "p"

    const-string v1, "k"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ls7/c$a;->a([Ljava/lang/String;)Ls7/c$a;

    move-result-object v0

    sput-object v0, Lr7/p;->b:Ls7/c$a;

    return-void
.end method

.method public static a(Ls7/c;Lg7/i;)Lo7/e;
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
    invoke-virtual {p0}, Ls7/c;->f()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lr7/p;->a:Ls7/c$a;

    invoke-virtual {p0, v0}, Ls7/c;->s(Ls7/c$a;)I

    move-result v0

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Ls7/c;->u()V

    invoke-virtual {p0}, Ls7/c;->w()V

    goto :goto_0

    :pswitch_0
    invoke-virtual {p0}, Ls7/c;->g()Z

    move-result v13

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0}, Ls7/c;->k()I

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
    invoke-static {p0, p1}, Lr7/d;->i(Ls7/c;Lg7/i;)Ln7/f;

    move-result-object v10

    goto :goto_0

    :pswitch_3
    invoke-static {p0, p1}, Lr7/d;->i(Ls7/c;Lg7/i;)Ln7/f;

    move-result-object v9

    goto :goto_0

    :pswitch_4
    invoke-virtual {p0}, Ls7/c;->k()I

    move-result v0

    if-ne v0, v2, :cond_1

    sget-object v0, Lo7/g;->a:Lo7/g;

    :goto_2
    move-object v5, v0

    goto :goto_0

    :cond_1
    sget-object v0, Lo7/g;->b:Lo7/g;

    goto :goto_2

    :pswitch_5
    invoke-static {p0, p1}, Lr7/d;->h(Ls7/c;Lg7/i;)Ln7/d;

    move-result-object v1

    goto :goto_0

    :pswitch_6
    invoke-virtual {p0}, Ls7/c;->c()V

    const/4 v0, -0x1

    :goto_3
    invoke-virtual {p0}, Ls7/c;->f()Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v3, Lr7/p;->b:Ls7/c$a;

    invoke-virtual {p0, v3}, Ls7/c;->s(Ls7/c$a;)I

    move-result v3

    if-eqz v3, :cond_3

    if-eq v3, v2, :cond_2

    invoke-virtual {p0}, Ls7/c;->u()V

    invoke-virtual {p0}, Ls7/c;->w()V

    goto :goto_3

    :cond_2
    invoke-static {p0, p1, v0}, Lr7/d;->g(Ls7/c;Lg7/i;I)Ln7/c;

    move-result-object v7

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, Ls7/c;->k()I

    move-result v0

    goto :goto_3

    :cond_4
    invoke-virtual {p0}, Ls7/c;->e()V

    goto :goto_0

    :pswitch_7
    invoke-virtual {p0}, Ls7/c;->n()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_5
    if-nez v1, :cond_6

    new-instance v1, Ln7/d;

    new-instance p0, Lu7/a;

    const/16 p1, 0x64

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Lu7/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v1, p0}, Ln7/d;-><init>(Ljava/util/List;)V

    :cond_6
    move-object v8, v1

    new-instance v3, Lo7/e;

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v3 .. v13}, Lo7/e;-><init>(Ljava/lang/String;Lo7/g;Landroid/graphics/Path$FillType;Ln7/c;Ln7/d;Ln7/f;Ln7/f;Ln7/b;Ln7/b;Z)V

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
