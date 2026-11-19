.class public Lr7/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ls7/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "hd"

    const-string v1, "d"

    const-string v2, "nm"

    const-string v3, "p"

    const-string v4, "s"

    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ls7/c$a;->a([Ljava/lang/String;)Ls7/c$a;

    move-result-object v0

    sput-object v0, Lr7/f;->a:Ls7/c$a;

    return-void
.end method

.method public static a(Ls7/c;Lg7/i;I)Lo7/b;
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x3

    if-ne p2, v2, :cond_0

    move p2, v1

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    const/4 v3, 0x0

    move v8, p2

    move v9, v0

    move-object v5, v3

    move-object v6, v5

    move-object v7, v6

    :goto_1
    invoke-virtual {p0}, Ls7/c;->f()Z

    move-result p2

    if-eqz p2, :cond_7

    sget-object p2, Lr7/f;->a:Ls7/c$a;

    invoke-virtual {p0, p2}, Ls7/c;->s(Ls7/c$a;)I

    move-result p2

    if-eqz p2, :cond_6

    if-eq p2, v1, :cond_5

    const/4 v3, 0x2

    if-eq p2, v3, :cond_4

    if-eq p2, v2, :cond_3

    const/4 v3, 0x4

    if-eq p2, v3, :cond_1

    invoke-virtual {p0}, Ls7/c;->u()V

    invoke-virtual {p0}, Ls7/c;->w()V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Ls7/c;->k()I

    move-result p2

    if-ne p2, v2, :cond_2

    move v8, v1

    goto :goto_1

    :cond_2
    move v8, v0

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Ls7/c;->g()Z

    move-result v9

    goto :goto_1

    :cond_4
    invoke-static {p0, p1}, Lr7/d;->i(Ls7/c;Lg7/i;)Ln7/f;

    move-result-object v7

    goto :goto_1

    :cond_5
    invoke-static {p0, p1}, Lr7/a;->b(Ls7/c;Lg7/i;)Ln7/o;

    move-result-object v6

    goto :goto_1

    :cond_6
    invoke-virtual {p0}, Ls7/c;->n()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_7
    new-instance v4, Lo7/b;

    invoke-direct/range {v4 .. v9}, Lo7/b;-><init>(Ljava/lang/String;Ln7/o;Ln7/f;ZZ)V

    return-object v4
.end method
