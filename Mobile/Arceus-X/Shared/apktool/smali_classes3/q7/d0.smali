.class public Lq7/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr7/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "r"

    const-string v1, "hd"

    const-string v2, "nm"

    const-string v3, "p"

    const-string v4, "s"

    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr7/c$a;->a([Ljava/lang/String;)Lr7/c$a;

    move-result-object v0

    sput-object v0, Lq7/d0;->a:Lr7/c$a;

    return-void
.end method

.method public static a(Lr7/c;Lf7/i;)Ln7/l;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v3, v0

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move v7, v1

    :goto_0
    invoke-virtual {p0}, Lr7/c;->f()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lq7/d0;->a:Lr7/c$a;

    invoke-virtual {p0, v0}, Lr7/c;->r(Lr7/c$a;)I

    move-result v0

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lr7/c;->u()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lr7/c;->g()Z

    move-result v7

    goto :goto_0

    :cond_1
    invoke-static {p0, p1}, Lq7/d;->e(Lr7/c;Lf7/i;)Lm7/b;

    move-result-object v6

    goto :goto_0

    :cond_2
    invoke-static {p0, p1}, Lq7/d;->i(Lr7/c;Lf7/i;)Lm7/f;

    move-result-object v5

    goto :goto_0

    :cond_3
    invoke-static {p0, p1}, Lq7/a;->b(Lr7/c;Lf7/i;)Lm7/o;

    move-result-object v4

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lr7/c;->m()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_5
    new-instance v2, Ln7/l;

    invoke-direct/range {v2 .. v7}, Ln7/l;-><init>(Ljava/lang/String;Lm7/o;Lm7/o;Lm7/b;Z)V

    return-object v2
.end method
