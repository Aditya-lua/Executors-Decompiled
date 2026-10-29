.class public Lh1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/z1;


# instance fields
.field public final c:Ln0/z1;

.field public final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lf1/x;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lg0/k0;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lm1/r1$a;

.field public final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ln0/a2;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lg0/k0;",
            "Lf1/o;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln0/z1;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lm1/r1$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/z1;",
            "Ljava/util/Collection<",
            "Lf1/x;",
            ">;",
            "Ljava/util/Collection<",
            "Lg0/k0;",
            ">;",
            "Ljava/util/Collection<",
            "Landroid/util/Size;",
            ">;",
            "Lm1/r1$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lh1/h;->h:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lh1/h;->i:Ljava/util/Map;

    invoke-static {p3}, Lh1/h;->c(Ljava/util/Collection;)V

    iput-object p1, p0, Lh1/h;->c:Ln0/z1;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Lh1/h;->d:Ljava/util/Set;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1, p3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Lh1/h;->f:Ljava/util/Set;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1, p4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Lh1/h;->e:Ljava/util/Set;

    iput-object p5, p0, Lh1/h;->g:Lm1/r1$a;

    return-void
.end method

.method public static c(Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/k0;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/k0;

    invoke-virtual {v0}, Lg0/k0;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Contains non-fully specified DynamicRange: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-void
.end method

.method private g(I)Ln0/a2;
    .locals 3

    iget-object v0, p0, Lh1/h;->h:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh1/h;->h:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/a2;

    return-object p1

    :cond_0
    iget-object v0, p0, Lh1/h;->c:Ln0/z1;

    invoke-interface {v0, p1}, Ln0/z1;->b(I)Ln0/a2;

    move-result-object v0

    invoke-virtual {p0, p1}, Lh1/h;->e(I)Lf1/x$b;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0}, Lh1/h;->h(Ln0/a2;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p0, v1}, Lh1/h;->d(Lf1/x$b;)Ln0/a2;

    move-result-object v1

    invoke-static {v0, v1}, Lh1/h;->j(Ln0/a2;Ln0/a2;)Ln0/a2;

    move-result-object v0

    :cond_1
    iget-object v1, p0, Lh1/h;->h:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public static i(Ln0/a2;Lg0/k0;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-interface {p0}, Ln0/a2;->b()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/a2$c;

    invoke-static {v1, p1}, Ln1/b;->f(Ln0/a2$c;Lg0/k0;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_2
    return v0
.end method

.method public static j(Ln0/a2;Ln0/a2;)Ln0/a2;
    .locals 4

    if-nez p0, :cond_0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-eqz p0, :cond_1

    invoke-interface {p0}, Ln0/a2;->a()I

    move-result v0

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Ln0/a2;->a()I

    move-result v0

    :goto_0
    if-eqz p0, :cond_2

    invoke-interface {p0}, Ln0/a2;->e()I

    move-result v1

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Ln0/a2;->e()I

    move-result v1

    :goto_1
    if-eqz p0, :cond_3

    invoke-interface {p0}, Ln0/a2;->f()Ljava/util/List;

    move-result-object v2

    goto :goto_2

    :cond_3
    invoke-interface {p1}, Ln0/a2;->f()Ljava/util/List;

    move-result-object v2

    :goto_2
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    if-eqz p0, :cond_4

    invoke-interface {p0}, Ln0/a2;->b()Ljava/util/List;

    move-result-object p0

    invoke-interface {v3, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_4
    if-eqz p1, :cond_5

    invoke-interface {p1}, Ln0/a2;->b()Ljava/util/List;

    move-result-object p0

    invoke-interface {v3, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_5
    invoke-static {v0, v1, v2, v3}, Ln0/a2$b;->h(IILjava/util/List;Ljava/util/List;)Ln0/a2$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(I)Z
    .locals 0

    invoke-direct {p0, p1}, Lh1/h;->g(I)Ln0/a2;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public b(I)Ln0/a2;
    .locals 0

    invoke-direct {p0, p1}, Lh1/h;->g(I)Ln0/a2;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lf1/x$b;)Ln0/a2;
    .locals 10

    iget-object v0, p0, Lh1/h;->d:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lx2/g;->a(Z)V

    iget-object v0, p0, Lh1/h;->c:Ln0/z1;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lf1/x$b;->e(I)I

    move-result v1

    invoke-interface {v0, v1}, Ln0/z1;->b(I)Ln0/a2;

    move-result-object v0

    invoke-virtual {p1}, Lf1/x$b;->f()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Size;

    iget-object v2, p0, Lh1/h;->e:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/util/TreeMap;

    new-instance v3, Lp0/e;

    invoke-direct {v3}, Lp0/e;-><init>()V

    invoke-direct {v2, v3}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, p0, Lh1/h;->f:Ljava/util/Set;

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg0/k0;

    invoke-static {v0, v5}, Lh1/h;->i(Ln0/a2;Lg0/k0;)Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p0, v5}, Lh1/h;->f(Lg0/k0;)Lf1/o;

    move-result-object v5

    invoke-virtual {v5, v1}, Lf1/o;->c(Landroid/util/Size;)Lh1/i;

    move-result-object v5

    if-nez v5, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v5}, Lh1/i;->k()Ln0/a2$c;

    move-result-object v6

    iget-object v7, p0, Lh1/h;->g:Lm1/r1$a;

    invoke-virtual {v6}, Ln0/a2$c;->i()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v8}, Lm1/r1$a;->a(Ljava/lang/String;)Lm1/r1;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v8

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v9

    invoke-interface {v7, v8, v9}, Lm1/r1;->e(II)Z

    move-result v8

    if-nez v8, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {v6}, Ln0/a2$c;->k()Landroid/util/Size;

    move-result-object v8

    invoke-virtual {v2, v8, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v7}, Lm1/r1;->g()Landroid/util/Range;

    move-result-object v5

    invoke-static {v6, v1, v5}, Ln1/c;->a(Ln0/a2$c;Landroid/util/Size;Landroid/util/Range;)Ln0/a2$c;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-static {v1, v2}, Lw0/d;->a(Landroid/util/Size;Ljava/util/TreeMap;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/a2;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ln0/a2;

    invoke-interface {p1}, Ln0/a2;->a()I

    move-result v0

    invoke-interface {p1}, Ln0/a2;->e()I

    move-result v1

    invoke-interface {p1}, Ln0/a2;->f()Ljava/util/List;

    move-result-object p1

    invoke-static {v0, v1, p1, v3}, Ln0/a2$b;->h(IILjava/util/List;Ljava/util/List;)Ln0/a2$b;

    move-result-object p1

    return-object p1

    :cond_7
    const/4 p1, 0x0

    return-object p1
.end method

.method public final e(I)Lf1/x$b;
    .locals 3

    iget-object v0, p0, Lh1/h;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf1/x;

    check-cast v1, Lf1/x$b;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lf1/x$b;->e(I)I

    move-result v2

    if-ne v2, p1, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final f(Lg0/k0;)Lf1/o;
    .locals 3

    iget-object v0, p0, Lh1/h;->i:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh1/h;->i:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf1/o;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1

    :cond_0
    new-instance v0, Lh1/e;

    iget-object v1, p0, Lh1/h;->c:Ln0/z1;

    invoke-direct {v0, v1, p1}, Lh1/e;-><init>(Ln0/z1;Lg0/k0;)V

    new-instance v1, Lf1/o;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lf1/o;-><init>(Ln0/z1;I)V

    iget-object v0, p0, Lh1/h;->i:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method public final h(Ln0/a2;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lh1/h;->f:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg0/k0;

    invoke-static {p1, v2}, Lh1/h;->i(Ln0/a2;Lg0/k0;)Z

    move-result v2

    if-nez v2, :cond_1

    return v0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method
