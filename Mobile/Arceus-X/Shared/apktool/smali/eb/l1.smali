.class public final Leb/l1;
.super Leb/f1;
.source "SourceFile"

# interfaces
.implements Ljava/util/NavigableMap;


# static fields
.field public static final f:Ljava/util/Comparator;

.field public static final g:Leb/l1;


# instance fields
.field public final transient c:Leb/v1;

.field public final transient d:Leb/e1;

.field public final transient e:Leb/l1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Leb/q1;->a:Leb/q1;

    sput-object v0, Leb/l1;->f:Ljava/util/Comparator;

    new-instance v1, Leb/l1;

    invoke-static {v0}, Leb/m1;->B(Ljava/util/Comparator;)Leb/v1;

    move-result-object v0

    sget-object v2, Leb/e1;->b:Leb/d2;

    sget-object v2, Leb/t1;->e:Leb/e1;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3}, Leb/l1;-><init>(Leb/v1;Leb/e1;Leb/l1;)V

    sput-object v1, Leb/l1;->g:Leb/l1;

    return-void
.end method

.method public constructor <init>(Leb/v1;Leb/e1;Leb/l1;)V
    .locals 0

    invoke-direct {p0}, Leb/f1;-><init>()V

    iput-object p1, p0, Leb/l1;->c:Leb/v1;

    iput-object p2, p0, Leb/l1;->d:Leb/e1;

    iput-object p3, p0, Leb/l1;->e:Leb/l1;

    return-void
.end method

.method public static bridge synthetic d(Leb/l1;)Leb/e1;
    .locals 0

    iget-object p0, p0, Leb/l1;->d:Leb/e1;

    return-object p0
.end method

.method public static e(Ljava/util/Map;)Leb/l1;
    .locals 11

    sget-object v0, Leb/l1;->f:Ljava/util/Comparator;

    invoke-interface {p0}, Ljava/util/SortedMap;->comparator()Ljava/util/Comparator;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    sget-object v3, Leb/f1;->b:[Ljava/util/Map$Entry;

    instance-of v4, p0, Ljava/util/Collection;

    if-nez v4, :cond_2

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    move-object p0, v4

    :cond_2
    invoke-interface {p0, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/util/Map$Entry;

    array-length v3, p0

    if-eqz v3, :cond_7

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eq v3, v2, :cond_6

    new-array v6, v3, [Ljava/lang/Object;

    new-array v7, v3, [Ljava/lang/Object;

    if-eqz v1, :cond_3

    :goto_2
    if-ge v5, v3, :cond_5

    aget-object v1, p0, v5

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2, v1}, Leb/w0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v2, v6, v5

    aput-object v1, v7, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_3
    new-instance v1, Leb/i1;

    invoke-direct {v1, v0}, Leb/i1;-><init>(Ljava/util/Comparator;)V

    invoke-static {p0, v5, v3, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    aget-object v1, p0, v5

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    aput-object v8, v6, v5

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    aput-object v1, v7, v5

    aget-object v5, v6, v5

    invoke-static {v5, v1}, Leb/w0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_3
    if-ge v2, v3, :cond_5

    add-int/lit8 v1, v2, -0x1

    aget-object v1, p0, v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/util/Map$Entry;

    aget-object v5, p0, v2

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9, v10}, Leb/w0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v9, v6, v2

    aput-object v10, v7, v2

    invoke-interface {v0, v8, v9}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v8

    if-eqz v8, :cond_4

    add-int/lit8 v2, v2, 0x1

    move-object v8, v9

    goto :goto_3

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Multiple entries with same key: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " and "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    new-instance p0, Leb/l1;

    new-instance v1, Leb/v1;

    invoke-static {v6, v3}, Leb/e1;->h([Ljava/lang/Object;I)Leb/e1;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Leb/v1;-><init>(Leb/e1;Ljava/util/Comparator;)V

    invoke-static {v7, v3}, Leb/e1;->h([Ljava/lang/Object;I)Leb/e1;

    move-result-object v0

    invoke-direct {p0, v1, v0, v4}, Leb/l1;-><init>(Leb/v1;Leb/e1;Leb/l1;)V

    return-object p0

    :cond_6
    aget-object p0, p0, v5

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ljava/util/Map$Entry;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    new-instance v2, Leb/l1;

    new-instance v3, Leb/v1;

    invoke-static {v1}, Leb/e1;->k(Ljava/lang/Object;)Leb/e1;

    move-result-object v1

    invoke-direct {v3, v1, v0}, Leb/v1;-><init>(Leb/e1;Ljava/util/Comparator;)V

    invoke-static {p0}, Leb/e1;->k(Ljava/lang/Object;)Leb/e1;

    move-result-object p0

    invoke-direct {v2, v3, p0, v4}, Leb/l1;-><init>(Leb/v1;Leb/e1;Leb/l1;)V

    return-object v2

    :cond_7
    invoke-static {v0}, Leb/l1;->f(Ljava/util/Comparator;)Leb/l1;

    move-result-object p0

    return-object p0
.end method

.method public static f(Ljava/util/Comparator;)Leb/l1;
    .locals 3

    sget-object v0, Leb/q1;->a:Leb/q1;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Leb/l1;->g:Leb/l1;

    return-object p0

    :cond_0
    new-instance v0, Leb/l1;

    invoke-static {p0}, Leb/m1;->B(Ljava/util/Comparator;)Leb/v1;

    move-result-object p0

    sget-object v1, Leb/e1;->b:Leb/d2;

    sget-object v1, Leb/t1;->e:Leb/e1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Leb/l1;-><init>(Leb/v1;Leb/e1;Leb/l1;)V

    return-object v0
.end method

.method public static bridge synthetic k(Leb/l1;)Leb/v1;
    .locals 0

    iget-object p0, p0, Leb/l1;->c:Leb/v1;

    return-object p0
.end method


# virtual methods
.method public final a()Leb/z0;
    .locals 1

    iget-object v0, p0, Leb/l1;->d:Leb/e1;

    return-object v0
.end method

.method public final b()Leb/h1;
    .locals 1

    invoke-virtual {p0}, Leb/f1;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Leb/u1;->i:Leb/u1;

    return-object v0

    :cond_0
    new-instance v0, Leb/k1;

    invoke-direct {v0, p0}, Leb/k1;-><init>(Leb/l1;)V

    return-object v0
.end method

.method public final ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Leb/l1;->j(Ljava/lang/Object;Z)Leb/l1;

    move-result-object p1

    invoke-virtual {p1}, Leb/l1;->firstEntry()Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final ceilingKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Leb/l1;->ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    invoke-static {p1}, Leb/o1;->a(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final comparator()Ljava/util/Comparator;
    .locals 1

    iget-object v0, p0, Leb/l1;->c:Leb/v1;

    iget-object v0, v0, Leb/m1;->c:Ljava/util/Comparator;

    return-object v0
.end method

.method public final synthetic descendingKeySet()Ljava/util/NavigableSet;
    .locals 1

    iget-object v0, p0, Leb/l1;->c:Leb/v1;

    invoke-virtual {v0}, Leb/m1;->u()Leb/m1;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic descendingMap()Ljava/util/NavigableMap;
    .locals 3

    iget-object v0, p0, Leb/l1;->e:Leb/l1;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Leb/f1;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Leb/l1;->c:Leb/v1;

    iget-object v0, v0, Leb/m1;->c:Ljava/util/Comparator;

    instance-of v1, v0, Leb/s1;

    if-eqz v1, :cond_0

    check-cast v0, Leb/s1;

    goto :goto_0

    :cond_0
    new-instance v1, Leb/x0;

    invoke-direct {v1, v0}, Leb/x0;-><init>(Ljava/util/Comparator;)V

    move-object v0, v1

    :goto_0
    invoke-virtual {v0}, Leb/s1;->a()Leb/s1;

    move-result-object v0

    invoke-static {v0}, Leb/l1;->f(Ljava/util/Comparator;)Leb/l1;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Leb/l1;->c:Leb/v1;

    new-instance v1, Leb/l1;

    invoke-virtual {v0}, Leb/m1;->u()Leb/m1;

    move-result-object v0

    check-cast v0, Leb/v1;

    iget-object v2, p0, Leb/l1;->d:Leb/e1;

    invoke-virtual {v2}, Leb/e1;->f()Leb/e1;

    move-result-object v2

    invoke-direct {v1, v0, v2, p0}, Leb/l1;-><init>(Leb/v1;Leb/e1;Leb/l1;)V

    return-object v1

    :cond_2
    return-object v0
.end method

.method public final bridge synthetic entrySet()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, Leb/f1;->c()Leb/h1;

    move-result-object v0

    return-object v0
.end method

.method public final firstEntry()Ljava/util/Map$Entry;
    .locals 2

    invoke-virtual {p0}, Leb/f1;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Leb/f1;->c()Leb/h1;

    move-result-object v0

    invoke-virtual {v0}, Leb/h1;->i()Leb/e1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    return-object v0
.end method

.method public final firstKey()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Leb/l1;->c:Leb/v1;

    invoke-virtual {v0}, Leb/m1;->first()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Leb/l1;->g(Ljava/lang/Object;Z)Leb/l1;

    move-result-object p1

    invoke-virtual {p1}, Leb/l1;->lastEntry()Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final floorKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Leb/l1;->floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    invoke-static {p1}, Leb/o1;->a(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljava/lang/Object;Z)Leb/l1;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Leb/l1;->c:Leb/v1;

    invoke-virtual {v0, p1, p2}, Leb/v1;->D(Ljava/lang/Object;Z)I

    move-result p1

    const/4 p2, 0x0

    invoke-virtual {p0, p2, p1}, Leb/l1;->l(II)Leb/l1;

    move-result-object p1

    return-object p1
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Leb/l1;->c:Leb/v1;

    const/4 v1, -0x1

    if-nez p1, :cond_0

    :catch_0
    :goto_0
    move p1, v1

    goto :goto_1

    :cond_0
    :try_start_0
    iget-object v2, v0, Leb/v1;->e:Leb/e1;

    iget-object v0, v0, Leb/m1;->c:Ljava/util/Comparator;

    invoke-static {v2, p1, v0}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-gez p1, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    if-ne p1, v1, :cond_2

    const/4 p1, 0x0

    return-object p1

    :cond_2
    iget-object v0, p0, Leb/l1;->d:Leb/e1;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic headMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Leb/l1;->g(Ljava/lang/Object;Z)Leb/l1;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic headMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Leb/l1;->g(Ljava/lang/Object;Z)Leb/l1;

    move-result-object p1

    return-object p1
.end method

.method public final higherEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Leb/l1;->j(Ljava/lang/Object;Z)Leb/l1;

    move-result-object p1

    invoke-virtual {p1}, Leb/l1;->firstEntry()Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final higherKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Leb/l1;->higherEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    invoke-static {p1}, Leb/o1;->a(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final i(Ljava/lang/Object;ZLjava/lang/Object;Z)Leb/l1;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Leb/l1;->c:Leb/v1;

    iget-object v0, v0, Leb/m1;->c:Ljava/util/Comparator;

    invoke-interface {v0, p1, p3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_0

    invoke-virtual {p0, p3, p4}, Leb/l1;->g(Ljava/lang/Object;Z)Leb/l1;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Leb/l1;->j(Ljava/lang/Object;Z)Leb/l1;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    filled-new-array {p1, p3}, [Ljava/lang/Object;

    move-result-object p1

    const-string p3, "expected fromKey <= toKey but %s > %s"

    invoke-static {p3, p1}, Leb/p0;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final j(Ljava/lang/Object;Z)Leb/l1;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Leb/l1;->c:Leb/v1;

    invoke-virtual {v0, p1, p2}, Leb/v1;->E(Ljava/lang/Object;Z)I

    move-result p1

    iget-object p2, p0, Leb/l1;->d:Leb/e1;

    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Leb/l1;->l(II)Leb/l1;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic keySet()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Leb/l1;->c:Leb/v1;

    return-object v0
.end method

.method public final l(II)Leb/l1;
    .locals 3

    if-nez p1, :cond_1

    iget-object p1, p0, Leb/l1;->d:Leb/e1;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    if-eq p2, p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    if-ne p1, p2, :cond_2

    iget-object p1, p0, Leb/l1;->c:Leb/v1;

    iget-object p1, p1, Leb/m1;->c:Ljava/util/Comparator;

    invoke-static {p1}, Leb/l1;->f(Ljava/util/Comparator;)Leb/l1;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object v0, p0, Leb/l1;->c:Leb/v1;

    iget-object v1, p0, Leb/l1;->d:Leb/e1;

    new-instance v2, Leb/l1;

    invoke-virtual {v0, p1, p2}, Leb/v1;->F(II)Leb/v1;

    move-result-object v0

    invoke-virtual {v1, p1, p2}, Leb/e1;->g(II)Leb/e1;

    move-result-object p1

    const/4 p2, 0x0

    invoke-direct {v2, v0, p1, p2}, Leb/l1;-><init>(Leb/v1;Leb/e1;Leb/l1;)V

    return-object v2
.end method

.method public final lastEntry()Ljava/util/Map$Entry;
    .locals 2

    invoke-virtual {p0}, Leb/f1;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Leb/f1;->c()Leb/h1;

    move-result-object v0

    invoke-virtual {v0}, Leb/h1;->i()Leb/e1;

    move-result-object v0

    iget-object v1, p0, Leb/l1;->d:Leb/e1;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    return-object v0
.end method

.method public final lastKey()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Leb/l1;->c:Leb/v1;

    invoke-virtual {v0}, Leb/m1;->last()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final lowerEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Leb/l1;->g(Ljava/lang/Object;Z)Leb/l1;

    move-result-object p1

    invoke-virtual {p1}, Leb/l1;->lastEntry()Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final lowerKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Leb/l1;->lowerEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    invoke-static {p1}, Leb/o1;->a(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic navigableKeySet()Ljava/util/NavigableSet;
    .locals 1

    iget-object v0, p0, Leb/l1;->c:Leb/v1;

    return-object v0
.end method

.method public final pollFirstEntry()Ljava/util/Map$Entry;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final pollLastEntry()Ljava/util/Map$Entry;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Leb/l1;->d:Leb/e1;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic subMap(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3, p4}, Leb/l1;->i(Ljava/lang/Object;ZLjava/lang/Object;Z)Leb/l1;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic subMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, p2, v1}, Leb/l1;->i(Ljava/lang/Object;ZLjava/lang/Object;Z)Leb/l1;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic tailMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Leb/l1;->j(Ljava/lang/Object;Z)Leb/l1;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic tailMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Leb/l1;->j(Ljava/lang/Object;Z)Leb/l1;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic values()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Leb/l1;->d:Leb/e1;

    return-object v0
.end method
