.class public final Lpq/a$f;
.super Ljava/util/LinkedHashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpq/a;->g()Lpq/a$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/LinkedHashMap<",
        "Lpq/a$c;",
        "Lpq/a$e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\'\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004J%\u0010\u0008\u001a\u00020\u00072\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u0014\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "pq/a$f",
        "Ljava/util/LinkedHashMap;",
        "Lpq/a$c;",
        "Lpq/a$e;",
        "Lkotlin/collections/LinkedHashMap;",
        "",
        "eldest",
        "",
        "removeEldestEntry",
        "(Ljava/util/Map$Entry;)Z",
        "selfie_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge a(Ljava/lang/String;)Z
    .locals 0

    invoke-static {p1}, Lpq/a$c;->a(Ljava/lang/String;)Lpq/a$c;

    move-result-object p1

    invoke-super {p0, p1}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge b(Lpq/a$e;)Z
    .locals 0

    invoke-super {p0, p1}, Ljava/util/LinkedHashMap;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge c(Ljava/lang/String;)Lpq/a$e;
    .locals 0

    invoke-static {p1}, Lpq/a$c;->a(Ljava/lang/String;)Lpq/a$c;

    move-result-object p1

    invoke-super {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpq/a$e;

    return-object p1
.end method

.method public final bridge containsKey(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lpq/a$c;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lpq/a$c;

    invoke-virtual {p1}, Lpq/a$c;->l()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpq/a$f;->a(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final bridge containsValue(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lpq/a$e;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lpq/a$e;

    invoke-virtual {p0, p1}, Lpq/a$f;->b(Lpq/a$e;)Z

    move-result p1

    return p1
.end method

.method public bridge e()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "Lpq/a$c;",
            "Lpq/a$e;",
            ">;>;"
        }
    .end annotation

    invoke-super {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final bridge entrySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "Lpq/a$c;",
            "Lpq/a$e;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lpq/a$f;->e()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge f()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lpq/a$c;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Lpq/a$c;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, Lpq/a$c;

    invoke-virtual {p1}, Lpq/a$c;->l()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpq/a$f;->c(Ljava/lang/String;)Lpq/a$e;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Lpq/a$c;

    if-nez v0, :cond_0

    return-object p2

    :cond_0
    check-cast p1, Lpq/a$c;

    invoke-virtual {p1}, Lpq/a$c;->l()Ljava/lang/String;

    move-result-object p1

    check-cast p2, Lpq/a$e;

    invoke-virtual {p0, p1, p2}, Lpq/a$f;->i(Ljava/lang/String;Lpq/a$e;)Lpq/a$e;

    move-result-object p1

    return-object p1
.end method

.method public bridge i(Ljava/lang/String;Lpq/a$e;)Lpq/a$e;
    .locals 0

    invoke-static {p1}, Lpq/a$c;->a(Ljava/lang/String;)Lpq/a$c;

    move-result-object p1

    invoke-super {p0, p1, p2}, Ljava/util/LinkedHashMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpq/a$e;

    return-object p1
.end method

.method public bridge k()I
    .locals 1

    invoke-super {p0}, Ljava/util/AbstractMap;->size()I

    move-result v0

    return v0
.end method

.method public final bridge keySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lpq/a$c;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lpq/a$f;->f()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge l()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lpq/a$e;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public bridge o(Ljava/lang/String;Lpq/a$e;)Z
    .locals 0

    invoke-static {p1}, Lpq/a$c;->a(Ljava/lang/String;)Lpq/a$c;

    move-result-object p1

    invoke-super {p0, p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge p(Ljava/lang/String;)Lpq/a$e;
    .locals 0

    invoke-static {p1}, Lpq/a$c;->a(Ljava/lang/String;)Lpq/a$c;

    move-result-object p1

    invoke-super {p0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpq/a$e;

    return-object p1
.end method

.method public final bridge synthetic remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Lpq/a$c;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, Lpq/a$c;

    invoke-virtual {p1}, Lpq/a$c;->l()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpq/a$f;->p(Ljava/lang/String;)Lpq/a$e;

    move-result-object p1

    return-object p1
.end method

.method public final bridge remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 2
    instance-of v0, p1, Lpq/a$c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p2, Lpq/a$e;

    if-nez v0, :cond_1

    return v1

    :cond_1
    check-cast p1, Lpq/a$c;

    invoke-virtual {p1}, Lpq/a$c;->l()Ljava/lang/String;

    move-result-object p1

    check-cast p2, Lpq/a$e;

    invoke-virtual {p0, p1, p2}, Lpq/a$f;->o(Ljava/lang/String;Lpq/a$e;)Z

    move-result p1

    return p1
.end method

.method public removeEldestEntry(Ljava/util/Map$Entry;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "Lpq/a$c;",
            "Lpq/a$e;",
            ">;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Lpq/a$f;->size()I

    move-result p1

    const/16 v0, 0x64

    if-le p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final bridge size()I
    .locals 1

    invoke-virtual {p0}, Lpq/a$f;->k()I

    move-result v0

    return v0
.end method

.method public final bridge values()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lpq/a$e;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lpq/a$f;->l()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
