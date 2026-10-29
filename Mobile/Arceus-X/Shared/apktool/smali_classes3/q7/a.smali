.class public Lq7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr7/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "x"

    const-string v1, "y"

    const-string v2, "k"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr7/c$a;->a([Ljava/lang/String;)Lr7/c$a;

    move-result-object v0

    sput-object v0, Lq7/a;->a:Lr7/c$a;

    return-void
.end method

.method public static a(Lr7/c;Lf7/i;)Lm7/e;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lr7/c;->o()Lr7/c$b;

    move-result-object v1

    sget-object v2, Lr7/c$b;->a:Lr7/c$b;

    if-ne v1, v2, :cond_1

    invoke-virtual {p0}, Lr7/c;->b()V

    :goto_0
    invoke-virtual {p0}, Lr7/c;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0, p1}, Lq7/z;->a(Lr7/c;Lf7/i;)Li7/i;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lr7/c;->d()V

    invoke-static {v0}, Lq7/u;->b(Ljava/util/List;)V

    goto :goto_1

    :cond_1
    new-instance p1, Lt7/a;

    invoke-static {}, Ls7/m;->e()F

    move-result v1

    invoke-static {p0, v1}, Lq7/s;->e(Lr7/c;F)Landroid/graphics/PointF;

    move-result-object p0

    invoke-direct {p1, p0}, Lt7/a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    new-instance p0, Lm7/e;

    invoke-direct {p0, v0}, Lm7/e;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method public static b(Lr7/c;Lf7/i;)Lm7/o;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr7/c;",
            "Lf7/i;",
            ")",
            "Lm7/o<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lr7/c;->c()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v2, v0

    move v3, v1

    move-object v1, v2

    :goto_0
    invoke-virtual {p0}, Lr7/c;->o()Lr7/c$b;

    move-result-object v4

    sget-object v5, Lr7/c$b;->d:Lr7/c$b;

    if-eq v4, v5, :cond_5

    sget-object v4, Lq7/a;->a:Lr7/c$a;

    invoke-virtual {p0, v4}, Lr7/c;->r(Lr7/c$a;)I

    move-result v4

    if-eqz v4, :cond_4

    const/4 v5, 0x1

    if-eq v4, v5, :cond_2

    const/4 v6, 0x2

    if-eq v4, v6, :cond_0

    invoke-virtual {p0}, Lr7/c;->s()V

    invoke-virtual {p0}, Lr7/c;->u()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lr7/c;->o()Lr7/c$b;

    move-result-object v4

    sget-object v6, Lr7/c$b;->f:Lr7/c$b;

    if-ne v4, v6, :cond_1

    invoke-virtual {p0}, Lr7/c;->u()V

    :goto_1
    move v3, v5

    goto :goto_0

    :cond_1
    invoke-static {p0, p1}, Lq7/d;->e(Lr7/c;Lf7/i;)Lm7/b;

    move-result-object v2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lr7/c;->o()Lr7/c$b;

    move-result-object v4

    sget-object v6, Lr7/c$b;->f:Lr7/c$b;

    if-ne v4, v6, :cond_3

    invoke-virtual {p0}, Lr7/c;->u()V

    goto :goto_1

    :cond_3
    invoke-static {p0, p1}, Lq7/d;->e(Lr7/c;Lf7/i;)Lm7/b;

    move-result-object v1

    goto :goto_0

    :cond_4
    invoke-static {p0, p1}, Lq7/a;->a(Lr7/c;Lf7/i;)Lm7/e;

    move-result-object v0

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Lr7/c;->e()V

    if-eqz v3, :cond_6

    const-string p0, "Lottie doesn\'t support expressions."

    invoke-virtual {p1, p0}, Lf7/i;->a(Ljava/lang/String;)V

    :cond_6
    if-eqz v0, :cond_7

    return-object v0

    :cond_7
    new-instance p0, Lm7/i;

    invoke-direct {p0, v1, v2}, Lm7/i;-><init>(Lm7/b;Lm7/b;)V

    return-object p0
.end method
