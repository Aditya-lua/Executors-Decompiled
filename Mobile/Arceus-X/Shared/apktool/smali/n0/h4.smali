.class public final Ln0/h4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln0/h4$b;,
        Ln0/h4$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ln0/h4$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ln0/h4;->b:Ljava/util/Map;

    iput-object p1, p0, Ln0/h4;->a:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(Ln0/h4$b;)Z
    .locals 1

    invoke-virtual {p0}, Ln0/h4$b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ln0/h4$b;->b()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic b(Ln0/h4$b;)Z
    .locals 0

    invoke-virtual {p0}, Ln0/h4$b;->b()Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Ln0/h4$b;)Z
    .locals 0

    invoke-virtual {p0}, Ln0/h4$b;->b()Z

    move-result p0

    return p0
.end method

.method public static synthetic d(Ln0/h4$b;)Z
    .locals 0

    invoke-virtual {p0}, Ln0/h4$b;->b()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public e()Ln0/o3$h;
    .locals 6

    new-instance v0, Ln0/o3$h;

    invoke-direct {v0}, Ln0/o3$h;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Ln0/h4;->b:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln0/h4$b;

    invoke-virtual {v4}, Ln0/h4$b;->a()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v4}, Ln0/h4$b;->b()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v4}, Ln0/h4$b;->d()Ln0/o3;

    move-result-object v4

    invoke-virtual {v0, v4}, Ln0/o3$h;->b(Ln0/o3;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Active and attached use case: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " for camera: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln0/h4;->a:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "UseCaseAttachState"

    invoke-static {v2, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public f()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ln0/o3;",
            ">;"
        }
    .end annotation

    new-instance v0, Ln0/d4;

    invoke-direct {v0}, Ln0/d4;-><init>()V

    invoke-virtual {p0, v0}, Ln0/h4;->l(Ln0/h4$a;)Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public g()Ln0/o3$h;
    .locals 6

    new-instance v0, Ln0/o3$h;

    invoke-direct {v0}, Ln0/o3$h;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Ln0/h4;->b:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln0/h4$b;

    invoke-virtual {v4}, Ln0/h4$b;->b()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v4}, Ln0/h4$b;->d()Ln0/o3;

    move-result-object v4

    invoke-virtual {v0, v4}, Ln0/o3$h;->b(Ln0/o3;)V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "All use case: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " for camera: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln0/h4;->a:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "UseCaseAttachState"

    invoke-static {v2, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public h()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ln0/o3;",
            ">;"
        }
    .end annotation

    new-instance v0, Ln0/f4;

    invoke-direct {v0}, Ln0/f4;-><init>()V

    invoke-virtual {p0, v0}, Ln0/h4;->l(Ln0/h4$a;)Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public i()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ln0/i4<",
            "*>;>;"
        }
    .end annotation

    new-instance v0, Ln0/g4;

    invoke-direct {v0}, Ln0/g4;-><init>()V

    invoke-virtual {p0, v0}, Ln0/h4;->m(Ln0/h4$a;)Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public j()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ln0/h4$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Ln0/e4;

    invoke-direct {v0}, Ln0/e4;-><init>()V

    invoke-virtual {p0, v0}, Ln0/h4;->n(Ln0/h4$a;)Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final k(Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)Ln0/h4$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln0/o3;",
            "Ln0/i4<",
            "*>;",
            "Ln0/t3;",
            "Ljava/util/List<",
            "Ln0/j4$b;",
            ">;)",
            "Ln0/h4$b;"
        }
    .end annotation

    iget-object v0, p0, Ln0/h4;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/h4$b;

    if-nez v0, :cond_0

    new-instance v0, Ln0/h4$b;

    invoke-direct {v0, p2, p3, p4, p5}, Ln0/h4$b;-><init>(Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V

    iget-object p2, p0, Ln0/h4;->b:Ljava/util/Map;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public final l(Ln0/h4$a;)Ljava/util/Collection;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/h4$a;",
            ")",
            "Ljava/util/Collection<",
            "Ln0/o3;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Ln0/h4;->b:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    if-eqz p1, :cond_1

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln0/h4$b;

    invoke-interface {p1, v3}, Ln0/h4$a;->a(Ln0/h4$b;)Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_1
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/h4$b;

    invoke-virtual {v2}, Ln0/h4$b;->d()Ln0/o3;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public final m(Ln0/h4$a;)Ljava/util/Collection;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/h4$a;",
            ")",
            "Ljava/util/Collection<",
            "Ln0/i4<",
            "*>;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Ln0/h4;->b:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    if-eqz p1, :cond_1

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln0/h4$b;

    invoke-interface {p1, v3}, Ln0/h4$a;->a(Ln0/h4$b;)Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_1
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/h4$b;

    invoke-virtual {v2}, Ln0/h4$b;->f()Ln0/i4;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public final n(Ln0/h4$a;)Ljava/util/Collection;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/h4$a;",
            ")",
            "Ljava/util/Collection<",
            "Ln0/h4$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Ln0/h4;->b:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    if-eqz p1, :cond_1

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln0/h4$b;

    invoke-interface {p1, v3}, Ln0/h4$a;->a(Ln0/h4$b;)Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_1
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/h4$b;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public o(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Ln0/h4;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Ln0/h4;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/h4$b;

    invoke-virtual {p1}, Ln0/h4$b;->b()Z

    move-result p1

    return p1
.end method

.method public p(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Ln0/h4;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public q(Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln0/o3;",
            "Ln0/i4<",
            "*>;",
            "Ln0/t3;",
            "Ljava/util/List<",
            "Ln0/j4$b;",
            ">;)V"
        }
    .end annotation

    invoke-virtual/range {p0 .. p5}, Ln0/h4;->k(Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)Ln0/h4$b;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ln0/h4$b;->g(Z)V

    return-void
.end method

.method public r(Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln0/o3;",
            "Ln0/i4<",
            "*>;",
            "Ln0/t3;",
            "Ljava/util/List<",
            "Ln0/j4$b;",
            ">;)V"
        }
    .end annotation

    invoke-virtual/range {p0 .. p5}, Ln0/h4;->k(Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)Ln0/h4$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ln0/h4$b;->h(Z)V

    invoke-virtual/range {p0 .. p5}, Ln0/h4;->u(Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V

    return-void
.end method

.method public s(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Ln0/h4;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ln0/h4;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/h4$b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ln0/h4$b;->h(Z)V

    invoke-virtual {v0}, Ln0/h4$b;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ln0/h4;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    return-void
.end method

.method public t(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Ln0/h4;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ln0/h4;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/h4$b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ln0/h4$b;->g(Z)V

    invoke-virtual {v0}, Ln0/h4$b;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ln0/h4;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    return-void
.end method

.method public u(Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln0/o3;",
            "Ln0/i4<",
            "*>;",
            "Ln0/t3;",
            "Ljava/util/List<",
            "Ln0/j4$b;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ln0/h4;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ln0/h4$b;

    invoke-direct {v0, p2, p3, p4, p5}, Ln0/h4$b;-><init>(Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V

    iget-object p2, p0, Ln0/h4;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ln0/h4$b;

    invoke-virtual {p2}, Ln0/h4$b;->b()Z

    move-result p3

    invoke-virtual {v0, p3}, Ln0/h4$b;->h(Z)V

    invoke-virtual {p2}, Ln0/h4$b;->a()Z

    move-result p2

    invoke-virtual {v0, p2}, Ln0/h4$b;->g(Z)V

    iget-object p2, p0, Ln0/h4;->b:Ljava/util/Map;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
