.class public Ljg/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljg/h$a;
    }
.end annotation


# direct methods
.method public static synthetic a(Ljava/lang/String;Ljg/h$a;Lof/d;)Ljg/f;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p2, v0}, Lof/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    invoke-interface {p1, p2}, Ljg/h$a;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Ljg/f;->a(Ljava/lang/String;Ljava/lang/String;)Ljg/f;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Lof/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lof/c<",
            "*>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljg/f;->a(Ljava/lang/String;Ljava/lang/String;)Ljg/f;

    move-result-object p0

    const-class p1, Ljg/f;

    invoke-static {p0, p1}, Lof/c;->l(Ljava/lang/Object;Ljava/lang/Class;)Lof/c;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/String;Ljg/h$a;)Lof/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljg/h$a<",
            "Landroid/content/Context;",
            ">;)",
            "Lof/c<",
            "*>;"
        }
    .end annotation

    const-class v0, Ljg/f;

    invoke-static {v0}, Lof/c;->m(Ljava/lang/Class;)Lof/c$b;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-static {v1}, Lof/r;->j(Ljava/lang/Class;)Lof/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v0

    new-instance v1, Ljg/g;

    invoke-direct {v1, p0, p1}, Ljg/g;-><init>(Ljava/lang/String;Ljg/h$a;)V

    invoke-virtual {v0, v1}, Lof/c$b;->f(Lof/g;)Lof/c$b;

    move-result-object p0

    invoke-virtual {p0}, Lof/c$b;->d()Lof/c;

    move-result-object p0

    return-object p0
.end method
