.class public final Log/i$a;
.super Llg/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Log/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Llg/a0<",
        "Ljava/util/Map<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final a:Llg/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llg/a0<",
            "TK;>;"
        }
    .end annotation
.end field

.field public final b:Llg/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llg/a0<",
            "TV;>;"
        }
    .end annotation
.end field

.field public final c:Lng/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lng/d0<",
            "+",
            "Ljava/util/Map<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field

.field public final synthetic d:Log/i;


# direct methods
.method public constructor <init>(Log/i;Llg/a0;Llg/a0;Lng/d0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llg/a0<",
            "TK;>;",
            "Llg/a0<",
            "TV;>;",
            "Lng/d0<",
            "+",
            "Ljava/util/Map<",
            "TK;TV;>;>;)V"
        }
    .end annotation

    iput-object p1, p0, Log/i$a;->d:Log/i;

    invoke-direct {p0}, Llg/a0;-><init>()V

    iput-object p2, p0, Log/i$a;->a:Llg/a0;

    iput-object p3, p0, Log/i$a;->b:Llg/a0;

    iput-object p4, p0, Log/i$a;->c:Lng/d0;

    return-void
.end method


# virtual methods
.method public final a(Llg/l;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Llg/l;->t()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Llg/l;->h()Llg/r;

    move-result-object p1

    invoke-virtual {p1}, Llg/r;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Llg/r;->j()Ljava/lang/Number;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Llg/r;->A()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Llg/r;->b()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Llg/r;->D()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Llg/r;->l()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_3
    invoke-virtual {p1}, Llg/l;->n()Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "null"

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public b(Ltg/a;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg/a;",
            ")",
            "Ljava/util/Map<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-virtual {p1}, Ltg/a;->Q()Ltg/b;

    move-result-object v0

    sget-object v1, Ltg/b;->i:Ltg/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ltg/a;->K()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v1, p0, Log/i$a;->c:Lng/d0;

    invoke-interface {v1}, Lng/d0;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    sget-object v2, Ltg/b;->a:Ltg/b;

    const-string v3, "duplicate key: "

    if-ne v0, v2, :cond_3

    invoke-virtual {p1}, Ltg/a;->b()V

    :goto_0
    invoke-virtual {p1}, Ltg/a;->p()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ltg/a;->b()V

    iget-object v0, p0, Log/i$a;->a:Llg/a0;

    invoke-virtual {v0, p1}, Llg/a0;->read(Ltg/a;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Log/i$a;->b:Llg/a0;

    invoke-virtual {v2, p1}, Llg/a0;->read(Ltg/a;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-virtual {p1}, Ltg/a;->g()V

    goto :goto_0

    :cond_1
    new-instance p1, Llg/u;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Llg/u;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {p1}, Ltg/a;->g()V

    return-object v1

    :cond_3
    invoke-virtual {p1}, Ltg/a;->c()V

    :goto_1
    invoke-virtual {p1}, Ltg/a;->p()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lng/z;->a:Lng/z;

    invoke-virtual {v0, p1}, Lng/z;->a(Ltg/a;)V

    iget-object v0, p0, Log/i$a;->a:Llg/a0;

    invoke-virtual {v0, p1}, Llg/a0;->read(Ltg/a;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Log/i$a;->b:Llg/a0;

    invoke-virtual {v2, p1}, Llg/a0;->read(Ltg/a;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    new-instance p1, Llg/u;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Llg/u;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-virtual {p1}, Ltg/a;->h()V

    return-object v1
.end method

.method public c(Ltg/c;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg/c;",
            "Ljava/util/Map<",
            "TK;TV;>;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p1}, Ltg/c;->s()Ltg/c;

    return-void

    :cond_0
    iget-object v0, p0, Log/i$a;->d:Log/i;

    iget-boolean v0, v0, Log/i;->b:Z

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ltg/c;->e()Ltg/c;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ltg/c;->p(Ljava/lang/String;)Ltg/c;

    iget-object v1, p0, Log/i$a;->b:Llg/a0;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Llg/a0;->write(Ltg/c;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ltg/c;->h()Ltg/c;

    return-void

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v2, 0x0

    move v3, v2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    iget-object v5, p0, Log/i$a;->a:Llg/a0;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6}, Llg/a0;->toJsonTree(Ljava/lang/Object;)Llg/l;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5}, Llg/l;->m()Z

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual {v5}, Llg/l;->q()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    move v4, v2

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v4, 0x1

    :goto_3
    or-int/2addr v3, v4

    goto :goto_1

    :cond_5
    if-eqz v3, :cond_7

    invoke-virtual {p1}, Ltg/c;->d()Ltg/c;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    :goto_4
    if-ge v2, p2, :cond_6

    invoke-virtual {p1}, Ltg/c;->d()Ltg/c;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llg/l;

    invoke-static {v3, p1}, Lng/h0;->b(Llg/l;Ltg/c;)V

    iget-object v3, p0, Log/i$a;->b:Llg/a0;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, p1, v4}, Llg/a0;->write(Ltg/c;Ljava/lang/Object;)V

    invoke-virtual {p1}, Ltg/c;->g()Ltg/c;

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    invoke-virtual {p1}, Ltg/c;->g()Ltg/c;

    return-void

    :cond_7
    invoke-virtual {p1}, Ltg/c;->e()Ltg/c;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    :goto_5
    if-ge v2, p2, :cond_8

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llg/l;

    invoke-virtual {p0, v3}, Log/i$a;->a(Llg/l;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ltg/c;->p(Ljava/lang/String;)Ltg/c;

    iget-object v3, p0, Log/i$a;->b:Llg/a0;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, p1, v4}, Llg/a0;->write(Ltg/c;Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_8
    invoke-virtual {p1}, Ltg/c;->h()Ltg/c;

    return-void
.end method

.method public bridge synthetic read(Ltg/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Log/i$a;->b(Ltg/a;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic write(Ltg/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, Log/i$a;->c(Ltg/c;Ljava/util/Map;)V

    return-void
.end method
