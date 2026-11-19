.class public Ldl/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lmv/d0;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lmv/h0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmv/d0;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lmv/h0;"
        }
    .end annotation

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v6}, Ldl/g;->b(Lmv/d0;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Z)Lmv/h0;

    move-result-object p1

    return-object p1
.end method

.method public b(Lmv/d0;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Z)Lmv/h0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmv/d0;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Z)",
            "Lmv/h0;"
        }
    .end annotation

    new-instance v2, Lmv/f0$a;

    invoke-direct {v2}, Lmv/f0$a;-><init>()V

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v7}, Ldl/g;->c(Lmv/d0;Lmv/f0$a;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Z)Lmv/h0;

    move-result-object p1

    return-object p1
.end method

.method public c(Lmv/d0;Lmv/f0$a;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Z)Lmv/h0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmv/d0;",
            "Lmv/f0$a;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Z)",
            "Lmv/h0;"
        }
    .end annotation

    invoke-virtual/range {p2 .. p3}, Lmv/f0$a;->t(Ljava/lang/String;)Lmv/f0$a;

    if-eqz p5, :cond_1

    invoke-interface {p5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {p5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v2, :cond_0

    if-eqz v5, :cond_0

    invoke-virtual {p2, v2, v5}, Lmv/f0$a;->m(Ljava/lang/String;Ljava/lang/String;)Lmv/f0$a;

    goto :goto_0

    :cond_1
    const-string v1, "X-CSRF-TOKEN"

    if-eqz p4, :cond_4

    if-nez p6, :cond_2

    const-string v2, "application/x-www-form-urlencoded;charset=UTF-8"

    goto :goto_1

    :cond_2
    move-object v2, p6

    :goto_1
    invoke-static {v2}, Lmv/b0;->g(Ljava/lang/String;)Lmv/b0;

    move-result-object v5

    invoke-static {v5, p4}, Lmv/g0;->d(Lmv/b0;Ljava/lang/String;)Lmv/g0;

    move-result-object v5

    invoke-virtual {p2, v5}, Lmv/f0$a;->p(Lmv/g0;)Lmv/f0$a;

    invoke-static {}, Lfl/b;->a()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {p2, v1, v5}, Lmv/f0$a;->m(Ljava/lang/String;Ljava/lang/String;)Lmv/f0$a;

    :cond_3
    move-object v5, v2

    goto :goto_2

    :cond_4
    move-object v5, p6

    :goto_2
    invoke-virtual {p2}, Lmv/f0$a;->b()Lmv/f0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lmv/d0;->a(Lmv/f0;)Lmv/e;

    move-result-object v0

    invoke-interface {v0}, Lmv/e;->j()Lmv/h0;

    move-result-object v0

    invoke-virtual {v0}, Lmv/h0;->f()I

    move-result v6

    const/16 v7, 0x193

    if-ne v6, v7, :cond_7

    invoke-virtual {v0, v1}, Lmv/h0;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "rbx.platform"

    if-nez p7, :cond_5

    if-eqz v1, :cond_5

    const-string v0, "XSRF: got token. retrying"

    invoke-static {v6, v0}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v1}, Lfl/b;->c(Ljava/lang/String;)V

    const/4 v6, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    invoke-virtual/range {v0 .. v6}, Ldl/g;->b(Lmv/d0;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Z)Lmv/h0;

    move-result-object v1

    return-object v1

    :cond_5
    if-eqz p7, :cond_6

    const-string v1, "XSRF Error: retry already attempted. Will not retry"

    invoke-static {v6, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0

    :cond_6
    const-string v1, "XSRF Error: token not present in response. Will not retry"

    invoke-static {v6, v1}, Lok/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    return-object v0
.end method
