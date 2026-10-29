.class public Lw7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw7/b$l;,
        Lw7/b$o;,
        Lw7/b$k;,
        Lw7/b$i;,
        Lw7/b$n;,
        Lw7/b$m;,
        Lw7/b$h;,
        Lw7/b$g;,
        Lw7/b$q;,
        Lw7/b$d;,
        Lw7/b$s;,
        Lw7/b$p;,
        Lw7/b$u;,
        Lw7/b$r;,
        Lw7/b$t;,
        Lw7/b$b;,
        Lw7/b$j;,
        Lw7/b$c;,
        Lw7/b$e;,
        Lw7/b$f;
    }
.end annotation


# instance fields
.field public a:Lw7/b$f;

.field public b:Lw7/b$u;

.field public c:Z


# direct methods
.method public constructor <init>(Lw7/b$f;Lw7/b$u;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lw7/b;->c:Z

    .line 4
    iput-object p1, p0, Lw7/b;->a:Lw7/b$f;

    .line 5
    iput-object p2, p0, Lw7/b;->b:Lw7/b$u;

    return-void
.end method

.method public constructor <init>(Lw7/b$u;)V
    .locals 1

    .line 1
    sget-object v0, Lw7/b$f;->h:Lw7/b$f;

    invoke-direct {p0, v0, p1}, Lw7/b;-><init>(Lw7/b$f;Lw7/b$u;)V

    return-void
.end method

.method public static a(Ljava/util/List;ILw7/g$l0;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw7/g$j0;",
            ">;I",
            "Lw7/g$l0;",
            ")I"
        }
    .end annotation

    const/4 v0, 0x0

    if-gez p1, :cond_0

    return v0

    :cond_0
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    iget-object p1, p2, Lw7/g$n0;->b:Lw7/g$j0;

    const/4 v1, -0x1

    if-eq p0, p1, :cond_1

    return v1

    :cond_1
    invoke-interface {p1}, Lw7/g$j0;->getChildren()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw7/g$n0;

    if-ne p1, p2, :cond_2

    return v0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return v1
.end method

.method public static b(Ljava/lang/String;Lw7/b$f;)Z
    .locals 1

    new-instance v0, Lw7/b$d;

    invoke-direct {v0, p0}, Lw7/b$d;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lw7/k$i;->A()V

    invoke-static {v0}, Lw7/b;->h(Lw7/b$d;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0, p1}, Lw7/b;->c(Ljava/util/List;Lw7/b$f;)Z

    move-result p0

    return p0
.end method

.method public static c(Ljava/util/List;Lw7/b$f;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw7/b$f;",
            ">;",
            "Lw7/b$f;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw7/b$f;

    sget-object v1, Lw7/b$f;->a:Lw7/b$f;

    if-eq v0, v1, :cond_1

    if-ne v0, p1, :cond_0

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static f(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lw7/b$d;

    invoke-direct {v0, p0}, Lw7/b$d;-><init>(Ljava/lang/String;)V

    const/4 p0, 0x0

    :goto_0
    invoke-virtual {v0}, Lw7/k$i;->h()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lw7/k$i;->r()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    if-nez p0, :cond_1

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lw7/k$i;->A()V

    goto :goto_0

    :cond_2
    return-object p0
.end method

.method public static h(Lw7/b$d;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw7/b$d;",
            ")",
            "Ljava/util/List<",
            "Lw7/b$f;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    invoke-virtual {p0}, Lw7/k$i;->h()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Lw7/k$i;->w()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    :try_start_0
    invoke-static {v1}, Lw7/b$f;->valueOf(Ljava/lang/String;)Lw7/b$f;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {p0}, Lw7/k$i;->z()Z

    move-result v1

    if-nez v1, :cond_0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public static k(Lw7/b$q;Lw7/b$s;ILjava/util/List;ILw7/g$l0;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw7/b$q;",
            "Lw7/b$s;",
            "I",
            "Ljava/util/List<",
            "Lw7/g$j0;",
            ">;I",
            "Lw7/g$l0;",
            ")Z"
        }
    .end annotation

    invoke-virtual {p1, p2}, Lw7/b$s;->e(I)Lw7/b$t;

    move-result-object v0

    invoke-static {p0, v0, p3, p4, p5}, Lw7/b;->n(Lw7/b$q;Lw7/b$t;Ljava/util/List;ILw7/g$l0;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    iget-object v0, v0, Lw7/b$t;->a:Lw7/b$e;

    sget-object v1, Lw7/b$e;->a:Lw7/b$e;

    const/4 v3, 0x1

    if-ne v0, v1, :cond_4

    if-nez p2, :cond_1

    return v3

    :cond_1
    :goto_0
    if-ltz p4, :cond_3

    add-int/lit8 p5, p2, -0x1

    invoke-static {p0, p1, p5, p3, p4}, Lw7/b;->m(Lw7/b$q;Lw7/b$s;ILjava/util/List;I)Z

    move-result p5

    if-eqz p5, :cond_2

    return v3

    :cond_2
    add-int/lit8 p4, p4, -0x1

    goto :goto_0

    :cond_3
    return v2

    :cond_4
    sget-object v1, Lw7/b$e;->b:Lw7/b$e;

    if-ne v0, v1, :cond_5

    sub-int/2addr p2, v3

    invoke-static {p0, p1, p2, p3, p4}, Lw7/b;->m(Lw7/b$q;Lw7/b$s;ILjava/util/List;I)Z

    move-result p0

    return p0

    :cond_5
    invoke-static {p3, p4, p5}, Lw7/b;->a(Ljava/util/List;ILw7/g$l0;)I

    move-result v0

    if-gtz v0, :cond_6

    return v2

    :cond_6
    iget-object p5, p5, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-interface {p5}, Lw7/g$j0;->getChildren()Ljava/util/List;

    move-result-object p5

    sub-int/2addr v0, v3

    invoke-interface {p5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p5

    move-object v9, p5

    check-cast v9, Lw7/g$l0;

    add-int/lit8 v6, p2, -0x1

    move-object v4, p0

    move-object v5, p1

    move-object v7, p3

    move v8, p4

    invoke-static/range {v4 .. v9}, Lw7/b;->k(Lw7/b$q;Lw7/b$s;ILjava/util/List;ILw7/g$l0;)Z

    move-result p0

    return p0
.end method

.method public static l(Lw7/b$q;Lw7/b$s;Lw7/g$l0;)Z
    .locals 6

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p2, Lw7/g$n0;->b:Lw7/g$j0;

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v3, v1, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    check-cast v0, Lw7/g$n0;

    iget-object v0, v0, Lw7/g$n0;->b:Lw7/g$j0;

    goto :goto_0

    :cond_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x1

    add-int/lit8 v4, v0, -0x1

    invoke-virtual {p1}, Lw7/b$s;->g()I

    move-result v0

    if-ne v0, v2, :cond_1

    invoke-virtual {p1, v1}, Lw7/b$s;->e(I)Lw7/b$t;

    move-result-object p1

    invoke-static {p0, p1, v3, v4, p2}, Lw7/b;->n(Lw7/b$q;Lw7/b$t;Ljava/util/List;ILw7/g$l0;)Z

    move-result p0

    return p0

    :cond_1
    invoke-virtual {p1}, Lw7/b$s;->g()I

    move-result v0

    add-int/lit8 v2, v0, -0x1

    move-object v0, p0

    move-object v1, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Lw7/b;->k(Lw7/b$q;Lw7/b$s;ILjava/util/List;ILw7/g$l0;)Z

    move-result p0

    return p0
.end method

.method public static m(Lw7/b$q;Lw7/b$s;ILjava/util/List;I)Z
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw7/b$q;",
            "Lw7/b$s;",
            "I",
            "Ljava/util/List<",
            "Lw7/g$j0;",
            ">;I)Z"
        }
    .end annotation

    invoke-virtual {p1, p2}, Lw7/b$s;->e(I)Lw7/b$t;

    move-result-object v0

    invoke-interface {p3, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw7/g$l0;

    invoke-static {p0, v0, p3, p4, v1}, Lw7/b;->n(Lw7/b$q;Lw7/b$t;Ljava/util/List;ILw7/g$l0;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return v3

    :cond_0
    iget-object v0, v0, Lw7/b$t;->a:Lw7/b$e;

    sget-object v2, Lw7/b$e;->a:Lw7/b$e;

    const/4 v4, 0x1

    if-ne v0, v2, :cond_3

    if-nez p2, :cond_1

    return v4

    :cond_1
    if-lez p4, :cond_2

    add-int/lit8 v0, p2, -0x1

    add-int/lit8 p4, p4, -0x1

    invoke-static {p0, p1, v0, p3, p4}, Lw7/b;->m(Lw7/b$q;Lw7/b$s;ILjava/util/List;I)Z

    move-result v0

    if-eqz v0, :cond_1

    return v4

    :cond_2
    return v3

    :cond_3
    sget-object v2, Lw7/b$e;->b:Lw7/b$e;

    if-ne v0, v2, :cond_4

    sub-int/2addr p2, v4

    sub-int/2addr p4, v4

    invoke-static {p0, p1, p2, p3, p4}, Lw7/b;->m(Lw7/b$q;Lw7/b$s;ILjava/util/List;I)Z

    move-result p0

    return p0

    :cond_4
    invoke-static {p3, p4, v1}, Lw7/b;->a(Ljava/util/List;ILw7/g$l0;)I

    move-result v0

    if-gtz v0, :cond_5

    return v3

    :cond_5
    iget-object v1, v1, Lw7/g$n0;->b:Lw7/g$j0;

    invoke-interface {v1}, Lw7/g$j0;->getChildren()Ljava/util/List;

    move-result-object v1

    sub-int/2addr v0, v4

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lw7/g$l0;

    add-int/lit8 v7, p2, -0x1

    move-object v5, p0

    move-object v6, p1

    move-object v8, p3

    move v9, p4

    invoke-static/range {v5 .. v10}, Lw7/b;->k(Lw7/b$q;Lw7/b$s;ILjava/util/List;ILw7/g$l0;)Z

    move-result p0

    return p0
.end method

.method public static n(Lw7/b$q;Lw7/b$t;Ljava/util/List;ILw7/g$l0;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw7/b$q;",
            "Lw7/b$t;",
            "Ljava/util/List<",
            "Lw7/g$j0;",
            ">;I",
            "Lw7/g$l0;",
            ")Z"
        }
    .end annotation

    iget-object p2, p1, Lw7/b$t;->b:Ljava/lang/String;

    const/4 p3, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p4}, Lw7/g$n0;->n()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    return p3

    :cond_0
    iget-object p2, p1, Lw7/b$t;->c:Ljava/util/List;

    if-eqz p2, :cond_5

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw7/b$b;

    iget-object v1, v0, Lw7/b$b;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "id"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    const-string v2, "class"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return p3

    :cond_2
    iget-object v1, p4, Lw7/g$l0;->g:Ljava/util/List;

    if-nez v1, :cond_3

    return p3

    :cond_3
    iget-object v0, v0, Lw7/b$b;->c:Ljava/lang/String;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return p3

    :cond_4
    iget-object v0, v0, Lw7/b$b;->c:Ljava/lang/String;

    iget-object v1, p4, Lw7/g$l0;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return p3

    :cond_5
    iget-object p1, p1, Lw7/b$t;->d:Ljava/util/List;

    if-eqz p1, :cond_7

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lw7/b$g;

    invoke-interface {p2, p0, p4}, Lw7/b$g;->a(Lw7/b$q;Lw7/g$l0;)Z

    move-result p2

    if-nez p2, :cond_6

    return p3

    :cond_7
    const/4 p0, 0x1

    return p0
.end method

.method public static varargs p(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    const-string v0, "CSSParser"

    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/String;)Lw7/b$r;
    .locals 1

    new-instance v0, Lw7/b$d;

    invoke-direct {v0, p1}, Lw7/b$d;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lw7/k$i;->A()V

    invoke-virtual {p0, v0}, Lw7/b;->j(Lw7/b$d;)Lw7/b$r;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lw7/b$r;Lw7/b$d;)V
    .locals 3

    invoke-virtual {p2}, Lw7/b$d;->H()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lw7/k$i;->A()V

    if-eqz v0, :cond_a

    iget-boolean v1, p0, Lw7/b;->c:Z

    const-string v2, "Invalid @media rule: expected \'}\' at end of rule set"

    if-nez v1, :cond_3

    const-string v1, "media"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2}, Lw7/b;->h(Lw7/b$d;)Ljava/util/List;

    move-result-object v0

    const/16 v1, 0x7b

    invoke-virtual {p2, v1}, Lw7/k$i;->f(C)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p2}, Lw7/k$i;->A()V

    iget-object v1, p0, Lw7/b;->a:Lw7/b$f;

    invoke-static {v0, v1}, Lw7/b;->c(Ljava/util/List;Lw7/b$f;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lw7/b;->c:Z

    invoke-virtual {p0, p2}, Lw7/b;->j(Lw7/b$d;)Lw7/b$r;

    move-result-object v0

    invoke-virtual {p1, v0}, Lw7/b$r;->b(Lw7/b$r;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lw7/b;->c:Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, Lw7/b;->j(Lw7/b$d;)Lw7/b$r;

    :goto_0
    invoke-virtual {p2}, Lw7/k$i;->h()Z

    move-result p1

    if-nez p1, :cond_9

    const/16 p1, 0x7d

    invoke-virtual {p2, p1}, Lw7/k$i;->f(C)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_2

    :cond_1
    new-instance p1, Lw7/a;

    invoke-direct {p1, v2}, Lw7/a;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Lw7/a;

    const-string p2, "Invalid @media rule: missing rule set"

    invoke-direct {p1, p2}, Lw7/a;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget-boolean p1, p0, Lw7/b;->c:Z

    if-nez p1, :cond_8

    const-string p1, "import"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {p2}, Lw7/b$d;->N()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    invoke-virtual {p2}, Lw7/b$d;->F()Ljava/lang/String;

    move-result-object p1

    :cond_4
    if-eqz p1, :cond_7

    invoke-virtual {p2}, Lw7/k$i;->A()V

    invoke-static {p2}, Lw7/b;->h(Lw7/b$d;)Ljava/util/List;

    invoke-virtual {p2}, Lw7/k$i;->h()Z

    move-result p1

    if-nez p1, :cond_6

    const/16 p1, 0x3b

    invoke-virtual {p2, p1}, Lw7/k$i;->f(C)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_1

    :cond_5
    new-instance p1, Lw7/a;

    invoke-direct {p1, v2}, Lw7/a;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_1
    invoke-static {}, Lw7/g;->k()Lw7/i;

    goto :goto_2

    :cond_7
    new-instance p1, Lw7/a;

    const-string p2, "Invalid @import rule: expected string or url()"

    invoke-direct {p1, p2}, Lw7/a;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    const-string p1, "Ignoring @%s rule"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Lw7/b;->p(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, p2}, Lw7/b;->o(Lw7/b$d;)V

    :cond_9
    :goto_2
    invoke-virtual {p2}, Lw7/k$i;->A()V

    return-void

    :cond_a
    new-instance p1, Lw7/a;

    const-string p2, "Invalid \'@\' rule"

    invoke-direct {p1, p2}, Lw7/a;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g(Lw7/b$d;)Lw7/g$e0;
    .locals 4

    new-instance v0, Lw7/g$e0;

    invoke-direct {v0}, Lw7/g$e0;-><init>()V

    :cond_0
    invoke-virtual {p1}, Lw7/b$d;->H()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lw7/k$i;->A()V

    const/16 v2, 0x3a

    invoke-virtual {p1, v2}, Lw7/k$i;->f(C)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p1}, Lw7/k$i;->A()V

    invoke-virtual {p1}, Lw7/b$d;->J()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {p1}, Lw7/k$i;->A()V

    const/16 v3, 0x21

    invoke-virtual {p1, v3}, Lw7/k$i;->f(C)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1}, Lw7/k$i;->A()V

    const-string v3, "important"

    invoke-virtual {p1, v3}, Lw7/k$i;->g(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p1}, Lw7/k$i;->A()V

    goto :goto_0

    :cond_1
    new-instance p1, Lw7/a;

    const-string v0, "Malformed rule set: found unexpected \'!\'"

    invoke-direct {p1, v0}, Lw7/a;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    const/16 v3, 0x3b

    invoke-virtual {p1, v3}, Lw7/k$i;->f(C)Z

    invoke-static {v0, v1, v2}, Lw7/k;->S0(Lw7/g$e0;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lw7/k$i;->A()V

    invoke-virtual {p1}, Lw7/k$i;->h()Z

    move-result v1

    if-nez v1, :cond_3

    const/16 v1, 0x7d

    invoke-virtual {p1, v1}, Lw7/k$i;->f(C)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_3
    return-object v0

    :cond_4
    new-instance p1, Lw7/a;

    const-string v0, "Expected property value"

    invoke-direct {p1, v0}, Lw7/a;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Lw7/a;

    const-string v0, "Expected \':\'"

    invoke-direct {p1, v0}, Lw7/a;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i(Lw7/b$r;Lw7/b$d;)Z
    .locals 4

    invoke-static {p2}, Lw7/b$d;->B(Lw7/b$d;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    const/16 v1, 0x7b

    invoke-virtual {p2, v1}, Lw7/k$i;->f(C)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p2}, Lw7/k$i;->A()V

    invoke-virtual {p0, p2}, Lw7/b;->g(Lw7/b$d;)Lw7/g$e0;

    move-result-object v1

    invoke-virtual {p2}, Lw7/k$i;->A()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw7/b$s;

    new-instance v2, Lw7/b$p;

    iget-object v3, p0, Lw7/b;->b:Lw7/b$u;

    invoke-direct {v2, v0, v1, v3}, Lw7/b$p;-><init>(Lw7/b$s;Lw7/g$e0;Lw7/b$u;)V

    invoke-virtual {p1, v2}, Lw7/b$r;->a(Lw7/b$p;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    new-instance p1, Lw7/a;

    const-string p2, "Malformed rule block: expected \'{\'"

    invoke-direct {p1, p2}, Lw7/a;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final j(Lw7/b$d;)Lw7/b$r;
    .locals 3

    new-instance v0, Lw7/b$r;

    invoke-direct {v0}, Lw7/b$r;-><init>()V

    :goto_0
    :try_start_0
    invoke-virtual {p1}, Lw7/k$i;->h()Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "<!--"

    invoke-virtual {p1, v1}, Lw7/k$i;->g(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "-->"

    invoke-virtual {p1, v1}, Lw7/k$i;->g(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/16 v1, 0x40

    invoke-virtual {p1, v1}, Lw7/k$i;->f(C)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, v0, p1}, Lw7/b;->e(Lw7/b$r;Lw7/b$d;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v0, p1}, Lw7/b;->i(Lw7/b$r;Lw7/b$d;)Z

    move-result v1
    :try_end_0
    .catch Lw7/a; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    return-object v0

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CSS parser terminated early due to error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "CSSParser"

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0
.end method

.method public final o(Lw7/b$d;)V
    .locals 3

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lw7/k$i;->h()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p1}, Lw7/k$i;->l()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x3b

    if-ne v1, v2, :cond_1

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const/16 v2, 0x7b

    if-ne v1, v2, :cond_2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/16 v2, 0x7d

    if-ne v1, v2, :cond_0

    if-lez v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    if-nez v0, :cond_0

    :cond_3
    :goto_1
    return-void
.end method
