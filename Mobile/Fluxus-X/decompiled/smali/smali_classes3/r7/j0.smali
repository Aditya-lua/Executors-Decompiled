.class public Lr7/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ls7/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "hd"

    const-string v1, "it"

    const-string v2, "nm"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ls7/c$a;->a([Ljava/lang/String;)Ls7/c$a;

    move-result-object v0

    sput-object v0, Lr7/j0;->a:Ls7/c$a;

    return-void
.end method

.method public static a(Ls7/c;Lg7/i;)Lo7/q;
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0}, Ls7/c;->f()Z

    move-result v3

    if-eqz v3, :cond_5

    sget-object v3, Lr7/j0;->a:Ls7/c$a;

    invoke-virtual {p0, v3}, Ls7/c;->s(Ls7/c$a;)I

    move-result v3

    if-eqz v3, :cond_4

    const/4 v4, 0x1

    if-eq v3, v4, :cond_3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_0

    invoke-virtual {p0}, Ls7/c;->w()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ls7/c;->b()V

    :cond_1
    :goto_1
    invoke-virtual {p0}, Ls7/c;->f()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {p0, p1}, Lr7/h;->a(Ls7/c;Lg7/i;)Lo7/c;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Ls7/c;->d()V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Ls7/c;->g()Z

    move-result v2

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Ls7/c;->n()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_5
    new-instance p0, Lo7/q;

    invoke-direct {p0, v1, v0, v2}, Lo7/q;-><init>(Ljava/lang/String;Ljava/util/List;Z)V

    return-object p0
.end method
