.class public Lhg/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhg/h$a;
    }
.end annotation


# direct methods
.method public static synthetic a(Ljava/lang/String;Lhg/h$a;Lmf/d;)Lhg/f;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p2, v0}, Lmf/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    invoke-interface {p1, p2}, Lhg/h$a;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lhg/f;->a(Ljava/lang/String;Ljava/lang/String;)Lhg/f;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Lmf/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lmf/c<",
            "*>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lhg/f;->a(Ljava/lang/String;Ljava/lang/String;)Lhg/f;

    move-result-object p0

    const-class p1, Lhg/f;

    invoke-static {p0, p1}, Lmf/c;->l(Ljava/lang/Object;Ljava/lang/Class;)Lmf/c;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/String;Lhg/h$a;)Lmf/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lhg/h$a<",
            "Landroid/content/Context;",
            ">;)",
            "Lmf/c<",
            "*>;"
        }
    .end annotation

    const-class v0, Lhg/f;

    invoke-static {v0}, Lmf/c;->m(Ljava/lang/Class;)Lmf/c$b;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-static {v1}, Lmf/r;->j(Ljava/lang/Class;)Lmf/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v0

    new-instance v1, Lhg/g;

    invoke-direct {v1, p0, p1}, Lhg/g;-><init>(Ljava/lang/String;Lhg/h$a;)V

    invoke-virtual {v0, v1}, Lmf/c$b;->f(Lmf/g;)Lmf/c$b;

    move-result-object p0

    invoke-virtual {p0}, Lmf/c$b;->d()Lmf/c;

    move-result-object p0

    return-object p0
.end method
