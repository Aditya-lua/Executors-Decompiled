.class public Lr7/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ls7/c$a;

.field public static final b:Ls7/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "ef"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ls7/c$a;->a([Ljava/lang/String;)Ls7/c$a;

    move-result-object v0

    sput-object v0, Lr7/e;->a:Ls7/c$a;

    const-string v0, "ty"

    const-string v1, "v"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ls7/c$a;->a([Ljava/lang/String;)Ls7/c$a;

    move-result-object v0

    sput-object v0, Lr7/e;->b:Ls7/c$a;

    return-void
.end method

.method public static a(Ls7/c;Lg7/i;)Lo7/a;
    .locals 5

    invoke-virtual {p0}, Ls7/c;->c()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {p0}, Ls7/c;->f()Z

    move-result v3

    if-eqz v3, :cond_4

    sget-object v3, Lr7/e;->b:Ls7/c$a;

    invoke-virtual {p0, v3}, Ls7/c;->s(Ls7/c$a;)I

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v4, :cond_1

    invoke-virtual {p0}, Ls7/c;->u()V

    invoke-virtual {p0}, Ls7/c;->w()V

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_2

    new-instance v0, Lo7/a;

    invoke-static {p0, p1}, Lr7/d;->e(Ls7/c;Lg7/i;)Ln7/b;

    move-result-object v3

    invoke-direct {v0, v3}, Lo7/a;-><init>(Ln7/b;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Ls7/c;->w()V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Ls7/c;->k()I

    move-result v2

    if-nez v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Ls7/c;->e()V

    return-object v0
.end method

.method public static b(Ls7/c;Lg7/i;)Lo7/a;
    .locals 2

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Ls7/c;->f()Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Lr7/e;->a:Ls7/c$a;

    invoke-virtual {p0, v1}, Ls7/c;->s(Ls7/c$a;)I

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ls7/c;->u()V

    invoke-virtual {p0}, Ls7/c;->w()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ls7/c;->b()V

    :cond_1
    :goto_1
    invoke-virtual {p0}, Ls7/c;->f()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {p0, p1}, Lr7/e;->a(Ls7/c;Lg7/i;)Lo7/a;

    move-result-object v1

    if-eqz v1, :cond_1

    move-object v0, v1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Ls7/c;->d()V

    goto :goto_0

    :cond_3
    return-object v0
.end method
