.class public Lr7/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ls7/c;FLg7/i;Lr7/n0;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ls7/c;",
            "F",
            "Lg7/i;",
            "Lr7/n0<",
            "TT;>;)",
            "Ljava/util/List<",
            "Lu7/a<",
            "TT;>;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, p2, p1, p3, v0}, Lr7/u;->a(Ls7/c;Lg7/i;FLr7/n0;Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ls7/c;Lg7/i;Lr7/n0;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ls7/c;",
            "Lg7/i;",
            "Lr7/n0<",
            "TT;>;)",
            "Ljava/util/List<",
            "Lu7/a<",
            "TT;>;>;"
        }
    .end annotation

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, p2, v1}, Lr7/u;->a(Ls7/c;Lg7/i;FLr7/n0;Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ls7/c;Lg7/i;)Ln7/a;
    .locals 2

    new-instance v0, Ln7/a;

    sget-object v1, Lr7/g;->a:Lr7/g;

    invoke-static {p0, p1, v1}, Lr7/d;->b(Ls7/c;Lg7/i;Lr7/n0;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Ln7/a;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static d(Ls7/c;Lg7/i;)Ln7/j;
    .locals 3

    new-instance v0, Ln7/j;

    invoke-static {}, Lt7/m;->e()F

    move-result v1

    sget-object v2, Lr7/i;->a:Lr7/i;

    invoke-static {p0, v1, p1, v2}, Lr7/d;->a(Ls7/c;FLg7/i;Lr7/n0;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Ln7/j;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static e(Ls7/c;Lg7/i;)Ln7/b;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lr7/d;->f(Ls7/c;Lg7/i;Z)Ln7/b;

    move-result-object p0

    return-object p0
.end method

.method public static f(Ls7/c;Lg7/i;Z)Ln7/b;
    .locals 2

    new-instance v0, Ln7/b;

    if-eqz p2, :cond_0

    invoke-static {}, Lt7/m;->e()F

    move-result p2

    goto :goto_0

    :cond_0
    const/high16 p2, 0x3f800000    # 1.0f

    :goto_0
    sget-object v1, Lr7/l;->a:Lr7/l;

    invoke-static {p0, p2, p1, v1}, Lr7/d;->a(Ls7/c;FLg7/i;Lr7/n0;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Ln7/b;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static g(Ls7/c;Lg7/i;I)Ln7/c;
    .locals 2

    new-instance v0, Ln7/c;

    new-instance v1, Lr7/o;

    invoke-direct {v1, p2}, Lr7/o;-><init>(I)V

    invoke-static {p0, p1, v1}, Lr7/d;->b(Ls7/c;Lg7/i;Lr7/n0;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Ln7/c;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static h(Ls7/c;Lg7/i;)Ln7/d;
    .locals 2

    new-instance v0, Ln7/d;

    sget-object v1, Lr7/r;->a:Lr7/r;

    invoke-static {p0, p1, v1}, Lr7/d;->b(Ls7/c;Lg7/i;Lr7/n0;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Ln7/d;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static i(Ls7/c;Lg7/i;)Ln7/f;
    .locals 4

    new-instance v0, Ln7/f;

    invoke-static {}, Lt7/m;->e()F

    move-result v1

    sget-object v2, Lr7/b0;->a:Lr7/b0;

    const/4 v3, 0x1

    invoke-static {p0, p1, v1, v2, v3}, Lr7/u;->a(Ls7/c;Lg7/i;FLr7/n0;Z)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Ln7/f;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static j(Ls7/c;Lg7/i;)Ln7/g;
    .locals 2

    new-instance v0, Ln7/g;

    sget-object v1, Lr7/g0;->a:Lr7/g0;

    invoke-static {p0, p1, v1}, Lr7/d;->b(Ls7/c;Lg7/i;Lr7/n0;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Ln7/g;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static k(Ls7/c;Lg7/i;)Ln7/h;
    .locals 3

    new-instance v0, Ln7/h;

    invoke-static {}, Lt7/m;->e()F

    move-result v1

    sget-object v2, Lr7/h0;->a:Lr7/h0;

    invoke-static {p0, v1, p1, v2}, Lr7/d;->a(Ls7/c;FLg7/i;Lr7/n0;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Ln7/h;-><init>(Ljava/util/List;)V

    return-object v0
.end method
