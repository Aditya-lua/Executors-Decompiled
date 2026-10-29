.class public Lq7/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr7/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "mm"

    const-string v1, "hd"

    const-string v2, "nm"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr7/c$a;->a([Ljava/lang/String;)Lr7/c$a;

    move-result-object v0

    sput-object v0, Lq7/y;->a:Lr7/c$a;

    return-void
.end method

.method public static a(Lr7/c;)Ln7/j;
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    move v2, v1

    move-object v1, v0

    :goto_0
    invoke-virtual {p0}, Lr7/c;->f()Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object v3, Lq7/y;->a:Lr7/c$a;

    invoke-virtual {p0, v3}, Lr7/c;->r(Lr7/c$a;)I

    move-result v3

    if-eqz v3, :cond_2

    const/4 v4, 0x1

    if-eq v3, v4, :cond_1

    const/4 v4, 0x2

    if-eq v3, v4, :cond_0

    invoke-virtual {p0}, Lr7/c;->s()V

    invoke-virtual {p0}, Lr7/c;->u()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lr7/c;->g()Z

    move-result v2

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lr7/c;->j()I

    move-result v1

    invoke-static {v1}, Ln7/j$a;->b(I)Ln7/j$a;

    move-result-object v1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lr7/c;->m()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    new-instance p0, Ln7/j;

    invoke-direct {p0, v0, v1, v2}, Ln7/j;-><init>(Ljava/lang/String;Ln7/j$a;Z)V

    return-object p0
.end method
