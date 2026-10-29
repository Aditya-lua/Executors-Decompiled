.class public Lq7/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lr7/c;FLf7/i;Lq7/n0;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lr7/c;",
            "F",
            "Lf7/i;",
            "Lq7/n0<",
            "TT;>;)",
            "Ljava/util/List<",
            "Lt7/a<",
            "TT;>;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, p2, p1, p3, v0}, Lq7/u;->a(Lr7/c;Lf7/i;FLq7/n0;Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lr7/c;Lf7/i;Lq7/n0;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lr7/c;",
            "Lf7/i;",
            "Lq7/n0<",
            "TT;>;)",
            "Ljava/util/List<",
            "Lt7/a<",
            "TT;>;>;"
        }
    .end annotation

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, p2, v1}, Lq7/u;->a(Lr7/c;Lf7/i;FLq7/n0;Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lr7/c;Lf7/i;)Lm7/a;
    .locals 2

    new-instance v0, Lm7/a;

    sget-object v1, Lq7/g;->a:Lq7/g;

    invoke-static {p0, p1, v1}, Lq7/d;->b(Lr7/c;Lf7/i;Lq7/n0;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lm7/a;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static d(Lr7/c;Lf7/i;)Lm7/j;
    .locals 3

    new-instance v0, Lm7/j;

    invoke-static {}, Ls7/m;->e()F

    move-result v1

    sget-object v2, Lq7/i;->a:Lq7/i;

    invoke-static {p0, v1, p1, v2}, Lq7/d;->a(Lr7/c;FLf7/i;Lq7/n0;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lm7/j;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static e(Lr7/c;Lf7/i;)Lm7/b;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lq7/d;->f(Lr7/c;Lf7/i;Z)Lm7/b;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lr7/c;Lf7/i;Z)Lm7/b;
    .locals 2

    new-instance v0, Lm7/b;

    if-eqz p2, :cond_0

    invoke-static {}, Ls7/m;->e()F

    move-result p2

    goto :goto_0

    :cond_0
    const/high16 p2, 0x3f800000    # 1.0f

    :goto_0
    sget-object v1, Lq7/l;->a:Lq7/l;

    invoke-static {p0, p2, p1, v1}, Lq7/d;->a(Lr7/c;FLf7/i;Lq7/n0;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lm7/b;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static g(Lr7/c;Lf7/i;I)Lm7/c;
    .locals 2

    new-instance v0, Lm7/c;

    new-instance v1, Lq7/o;

    invoke-direct {v1, p2}, Lq7/o;-><init>(I)V

    invoke-static {p0, p1, v1}, Lq7/d;->b(Lr7/c;Lf7/i;Lq7/n0;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lm7/c;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static h(Lr7/c;Lf7/i;)Lm7/d;
    .locals 2

    new-instance v0, Lm7/d;

    sget-object v1, Lq7/r;->a:Lq7/r;

    invoke-static {p0, p1, v1}, Lq7/d;->b(Lr7/c;Lf7/i;Lq7/n0;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lm7/d;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static i(Lr7/c;Lf7/i;)Lm7/f;
    .locals 4

    new-instance v0, Lm7/f;

    invoke-static {}, Ls7/m;->e()F

    move-result v1

    sget-object v2, Lq7/b0;->a:Lq7/b0;

    const/4 v3, 0x1

    invoke-static {p0, p1, v1, v2, v3}, Lq7/u;->a(Lr7/c;Lf7/i;FLq7/n0;Z)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lm7/f;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static j(Lr7/c;Lf7/i;)Lm7/g;
    .locals 2

    new-instance v0, Lm7/g;

    sget-object v1, Lq7/g0;->a:Lq7/g0;

    invoke-static {p0, p1, v1}, Lq7/d;->b(Lr7/c;Lf7/i;Lq7/n0;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lm7/g;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static k(Lr7/c;Lf7/i;)Lm7/h;
    .locals 3

    new-instance v0, Lm7/h;

    invoke-static {}, Ls7/m;->e()F

    move-result v1

    sget-object v2, Lq7/h0;->a:Lq7/h0;

    invoke-static {p0, v1, p1, v2}, Lq7/d;->a(Lr7/c;FLf7/i;Lq7/n0;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lm7/h;-><init>(Ljava/util/List;)V

    return-object v0
.end method
