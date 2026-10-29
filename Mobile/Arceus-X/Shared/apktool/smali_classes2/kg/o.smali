.class public final Lkg/o;
.super Lkg/l;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/gson/internal/LinkedTreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/gson/internal/LinkedTreeMap<",
            "Ljava/lang/String;",
            "Lkg/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lkg/l;-><init>()V

    new-instance v0, Lcom/google/gson/internal/LinkedTreeMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/gson/internal/LinkedTreeMap;-><init>(Z)V

    iput-object v0, p0, Lkg/o;->a:Lcom/google/gson/internal/LinkedTreeMap;

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-nez p2, :cond_0

    sget-object p2, Lkg/n;->a:Lkg/n;

    goto :goto_0

    :cond_0
    new-instance v0, Lkg/r;

    invoke-direct {v0, p2}, Lkg/r;-><init>(Ljava/lang/String;)V

    move-object p2, v0

    :goto_0
    invoke-virtual {p0, p1, p2}, Lkg/o;->x(Ljava/lang/String;Lkg/l;)V

    return-void
.end method

.method public B()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lkg/l;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkg/o;->a:Lcom/google/gson/internal/LinkedTreeMap;

    return-object v0
.end method

.method public C()Lkg/o;
    .locals 4

    new-instance v0, Lkg/o;

    invoke-direct {v0}, Lkg/o;-><init>()V

    iget-object v1, p0, Lkg/o;->a:Lcom/google/gson/internal/LinkedTreeMap;

    invoke-virtual {v1}, Lcom/google/gson/internal/LinkedTreeMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkg/l;

    invoke-virtual {v2}, Lkg/l;->a()Lkg/l;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lkg/o;->x(Ljava/lang/String;Lkg/l;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public D()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Lkg/l;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lkg/o;->a:Lcom/google/gson/internal/LinkedTreeMap;

    invoke-virtual {v0}, Lcom/google/gson/internal/LinkedTreeMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public E(Ljava/lang/String;)Lkg/l;
    .locals 1

    iget-object v0, p0, Lkg/o;->a:Lcom/google/gson/internal/LinkedTreeMap;

    invoke-virtual {v0, p1}, Lcom/google/gson/internal/LinkedTreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkg/l;

    return-object p1
.end method

.method public F(Ljava/lang/String;)Lkg/i;
    .locals 1

    iget-object v0, p0, Lkg/o;->a:Lcom/google/gson/internal/LinkedTreeMap;

    invoke-virtual {v0, p1}, Lcom/google/gson/internal/LinkedTreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkg/i;

    return-object p1
.end method

.method public G(Ljava/lang/String;)Lkg/o;
    .locals 1

    iget-object v0, p0, Lkg/o;->a:Lcom/google/gson/internal/LinkedTreeMap;

    invoke-virtual {v0, p1}, Lcom/google/gson/internal/LinkedTreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkg/o;

    return-object p1
.end method

.method public H(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lkg/o;->a:Lcom/google/gson/internal/LinkedTreeMap;

    invoke-virtual {v0, p1}, Lcom/google/gson/internal/LinkedTreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public I()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkg/o;->a:Lcom/google/gson/internal/LinkedTreeMap;

    invoke-virtual {v0}, Lcom/google/gson/internal/LinkedTreeMap;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public J(Ljava/lang/String;)Lkg/l;
    .locals 1

    iget-object v0, p0, Lkg/o;->a:Lcom/google/gson/internal/LinkedTreeMap;

    invoke-virtual {v0, p1}, Lcom/google/gson/internal/LinkedTreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkg/l;

    return-object p1
.end method

.method public bridge synthetic a()Lkg/l;
    .locals 1

    invoke-virtual {p0}, Lkg/o;->C()Lkg/o;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p1, p0, :cond_1

    instance-of v0, p1, Lkg/o;

    if-eqz v0, :cond_0

    check-cast p1, Lkg/o;

    iget-object p1, p1, Lkg/o;->a:Lcom/google/gson/internal/LinkedTreeMap;

    iget-object v0, p0, Lkg/o;->a:Lcom/google/gson/internal/LinkedTreeMap;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lkg/o;->a:Lcom/google/gson/internal/LinkedTreeMap;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lkg/o;->a:Lcom/google/gson/internal/LinkedTreeMap;

    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public x(Ljava/lang/String;Lkg/l;)V
    .locals 1

    iget-object v0, p0, Lkg/o;->a:Lcom/google/gson/internal/LinkedTreeMap;

    if-nez p2, :cond_0

    sget-object p2, Lkg/n;->a:Lkg/n;

    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/google/gson/internal/LinkedTreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public y(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 1

    if-nez p2, :cond_0

    sget-object p2, Lkg/n;->a:Lkg/n;

    goto :goto_0

    :cond_0
    new-instance v0, Lkg/r;

    invoke-direct {v0, p2}, Lkg/r;-><init>(Ljava/lang/Boolean;)V

    move-object p2, v0

    :goto_0
    invoke-virtual {p0, p1, p2}, Lkg/o;->x(Ljava/lang/String;Lkg/l;)V

    return-void
.end method

.method public z(Ljava/lang/String;Ljava/lang/Number;)V
    .locals 1

    if-nez p2, :cond_0

    sget-object p2, Lkg/n;->a:Lkg/n;

    goto :goto_0

    :cond_0
    new-instance v0, Lkg/r;

    invoke-direct {v0, p2}, Lkg/r;-><init>(Ljava/lang/Number;)V

    move-object p2, v0

    :goto_0
    invoke-virtual {p0, p1, p2}, Lkg/o;->x(Ljava/lang/String;Lkg/l;)V

    return-void
.end method
