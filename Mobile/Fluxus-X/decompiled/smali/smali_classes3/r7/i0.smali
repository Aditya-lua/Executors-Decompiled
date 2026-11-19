.class public Lr7/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ls7/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const-string v4, "r"

    const-string v5, "hd"

    const-string v0, "nm"

    const-string v1, "c"

    const-string v2, "o"

    const-string v3, "fillEnabled"

    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ls7/c$a;->a([Ljava/lang/String;)Ls7/c$a;

    move-result-object v0

    sput-object v0, Lr7/i0;->a:Ls7/c$a;

    return-void
.end method

.method public static a(Ls7/c;Lg7/i;)Lo7/p;
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    move-object v4, v0

    move-object v7, v4

    move v5, v1

    move v9, v5

    move v1, v2

    :goto_0
    invoke-virtual {p0}, Ls7/c;->f()Z

    move-result v3

    if-eqz v3, :cond_6

    sget-object v3, Lr7/i0;->a:Ls7/c$a;

    invoke-virtual {p0, v3}, Ls7/c;->s(Ls7/c$a;)I

    move-result v3

    if-eqz v3, :cond_5

    if-eq v3, v2, :cond_4

    const/4 v6, 0x2

    if-eq v3, v6, :cond_3

    const/4 v6, 0x3

    if-eq v3, v6, :cond_2

    const/4 v6, 0x4

    if-eq v3, v6, :cond_1

    const/4 v6, 0x5

    if-eq v3, v6, :cond_0

    invoke-virtual {p0}, Ls7/c;->u()V

    invoke-virtual {p0}, Ls7/c;->w()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ls7/c;->g()Z

    move-result v9

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ls7/c;->k()I

    move-result v1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Ls7/c;->g()Z

    move-result v5

    goto :goto_0

    :cond_3
    invoke-static {p0, p1}, Lr7/d;->h(Ls7/c;Lg7/i;)Ln7/d;

    move-result-object v0

    goto :goto_0

    :cond_4
    invoke-static {p0, p1}, Lr7/d;->c(Ls7/c;Lg7/i;)Ln7/a;

    move-result-object v7

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Ls7/c;->n()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_6
    if-nez v0, :cond_7

    new-instance v0, Ln7/d;

    new-instance p0, Lu7/a;

    const/16 p1, 0x64

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Lu7/a;-><init>(Ljava/lang/Object;)V

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Ln7/d;-><init>(Ljava/util/List;)V

    :cond_7
    move-object v8, v0

    if-ne v1, v2, :cond_8

    sget-object p0, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    :goto_1
    move-object v6, p0

    goto :goto_2

    :cond_8
    sget-object p0, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    goto :goto_1

    :goto_2
    new-instance v3, Lo7/p;

    invoke-direct/range {v3 .. v9}, Lo7/p;-><init>(Ljava/lang/String;ZLandroid/graphics/Path$FillType;Ln7/a;Ln7/d;Z)V

    return-object v3
.end method
