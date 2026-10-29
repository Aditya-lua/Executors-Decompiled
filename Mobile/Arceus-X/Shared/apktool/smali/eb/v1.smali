.class public final Leb/v1;
.super Leb/m1;
.source "SourceFile"


# static fields
.field public static final f:Leb/v1;


# instance fields
.field public final transient e:Leb/e1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Leb/v1;

    sget-object v1, Leb/e1;->b:Leb/d2;

    sget-object v1, Leb/t1;->e:Leb/e1;

    sget-object v2, Leb/q1;->a:Leb/q1;

    invoke-direct {v0, v1, v2}, Leb/v1;-><init>(Leb/e1;Ljava/util/Comparator;)V

    sput-object v0, Leb/v1;->f:Leb/v1;

    return-void
.end method

.method public constructor <init>(Leb/e1;Ljava/util/Comparator;)V
    .locals 0

    invoke-direct {p0, p2}, Leb/m1;-><init>(Ljava/util/Comparator;)V

    iput-object p1, p0, Leb/v1;->e:Leb/e1;

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/Object;Z)Leb/m1;
    .locals 1

    iget-object v0, p0, Leb/v1;->e:Leb/e1;

    invoke-virtual {p0, p1, p2}, Leb/v1;->E(Ljava/lang/Object;Z)I

    move-result p1

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Leb/v1;->F(II)Leb/v1;

    move-result-object p1

    return-object p1
.end method

.method public final C()Leb/c2;
    .locals 2

    iget-object v0, p0, Leb/v1;->e:Leb/e1;

    invoke-virtual {v0}, Leb/e1;->f()Leb/e1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Leb/e1;->l(I)Leb/d2;

    move-result-object v0

    return-object v0
.end method

.method public final D(Ljava/lang/Object;Z)I
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Leb/v1;->e:Leb/e1;

    iget-object v1, p0, Leb/m1;->c:Ljava/util/Comparator;

    invoke-static {v0, p1, v1}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result p1

    if-ltz p1, :cond_1

    if-eqz p2, :cond_0

    add-int/lit8 p1, p1, 0x1

    :cond_0
    return p1

    :cond_1
    not-int p1, p1

    return p1
.end method

.method public final E(Ljava/lang/Object;Z)I
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Leb/v1;->e:Leb/e1;

    iget-object v1, p0, Leb/m1;->c:Ljava/util/Comparator;

    invoke-static {v0, p1, v1}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result p1

    if-ltz p1, :cond_1

    if-eqz p2, :cond_0

    return p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    return p1

    :cond_1
    not-int p1, p1

    return p1
.end method

.method public final F(II)Leb/v1;
    .locals 3

    if-nez p1, :cond_1

    iget-object p1, p0, Leb/v1;->e:Leb/e1;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    if-eq p2, p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    if-ge p1, p2, :cond_2

    iget-object v0, p0, Leb/v1;->e:Leb/e1;

    iget-object v1, p0, Leb/m1;->c:Ljava/util/Comparator;

    new-instance v2, Leb/v1;

    invoke-virtual {v0, p1, p2}, Leb/e1;->g(II)Leb/e1;

    move-result-object p1

    invoke-direct {v2, p1, v1}, Leb/v1;-><init>(Leb/e1;Ljava/util/Comparator;)V

    return-object v2

    :cond_2
    iget-object p1, p0, Leb/m1;->c:Ljava/util/Comparator;

    invoke-static {p1}, Leb/m1;->B(Ljava/util/Comparator;)Leb/v1;

    move-result-object p1

    return-object p1
.end method

.method public final a([Ljava/lang/Object;I)I
    .locals 1

    iget-object p2, p0, Leb/v1;->e:Leb/e1;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Leb/z0;->a([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final b()I
    .locals 1

    iget-object v0, p0, Leb/v1;->e:Leb/e1;

    invoke-virtual {v0}, Leb/z0;->b()I

    move-result v0

    return v0
.end method

.method public final c()I
    .locals 1

    iget-object v0, p0, Leb/v1;->e:Leb/e1;

    invoke-virtual {v0}, Leb/z0;->c()I

    move-result v0

    return v0
.end method

.method public final ceiling(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Leb/v1;->e:Leb/e1;

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v1}, Leb/v1;->E(Ljava/lang/Object;Z)I

    move-result p1

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Leb/v1;->e:Leb/e1;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v1, p0, Leb/v1;->e:Leb/e1;

    iget-object v2, p0, Leb/m1;->c:Ljava/util/Comparator;

    invoke-static {v1, p1, v2}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :catch_0
    :cond_0
    return v0
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 6

    instance-of v0, p1, Leb/p1;

    if-eqz v0, :cond_0

    check-cast p1, Leb/p1;

    invoke-interface {p1}, Leb/p1;->zza()Ljava/util/Set;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Leb/m1;->c:Ljava/util/Comparator;

    invoke-static {v0, p1}, Leb/b2;->a(Ljava/util/Comparator;Ljava/lang/Iterable;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Leb/v1;->e:Leb/e1;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Leb/e1;->l(I)Leb/d2;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    :goto_0
    :try_start_0
    iget-object v5, p0, Leb/m1;->c:Ljava/util/Comparator;

    invoke-interface {v5, v4, v3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v5

    if-gez v5, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_3

    return v2

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    goto :goto_0

    :cond_4
    if-nez v5, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_5

    return v1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_6
    return v2

    :cond_7
    :goto_1
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final d()Leb/c2;
    .locals 2

    iget-object v0, p0, Leb/v1;->e:Leb/e1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Leb/e1;->l(I)Leb/d2;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic descendingIterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Leb/v1;->C()Leb/c2;

    move-result-object v0

    return-object v0
.end method

.method public final e()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Leb/v1;->e:Leb/e1;

    invoke-virtual {v0}, Leb/z0;->e()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljava/util/Set;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ljava/util/Set;

    iget-object v1, p0, Leb/v1;->e:Leb/e1;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    return v0

    :cond_3
    iget-object v1, p0, Leb/m1;->c:Ljava/util/Comparator;

    invoke-static {v1, p1}, Leb/b2;->a(Ljava/util/Comparator;Ljava/lang/Iterable;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :try_start_0
    iget-object v1, p0, Leb/v1;->e:Leb/e1;

    invoke-virtual {v1, v2}, Leb/e1;->l(I)Leb/d2;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_5

    iget-object v5, p0, Leb/m1;->c:Ljava/util/Comparator;

    invoke-interface {v5, v3, v4}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v3
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_4

    :cond_5
    return v2

    :cond_6
    return v0

    :catch_0
    return v2

    :cond_7
    invoke-virtual {p0, p1}, Leb/v1;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final first()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Leb/v1;->e:Leb/e1;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final floor(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Leb/v1;->D(Ljava/lang/Object;Z)I

    move-result p1

    const/4 v0, -0x1

    add-int/2addr p1, v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Leb/v1;->e:Leb/e1;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final higher(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Leb/v1;->e:Leb/e1;

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1}, Leb/v1;->E(Ljava/lang/Object;Z)I

    move-result p1

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Leb/v1;->e:Leb/e1;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final i()Leb/e1;
    .locals 1

    iget-object v0, p0, Leb/v1;->e:Leb/e1;

    return-object v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, Leb/v1;->e:Leb/e1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Leb/e1;->l(I)Leb/d2;

    move-result-object v0

    return-object v0
.end method

.method public final last()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Leb/v1;->e:Leb/e1;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final lower(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Leb/v1;->D(Ljava/lang/Object;Z)I

    move-result p1

    const/4 v0, -0x1

    add-int/2addr p1, v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Leb/v1;->e:Leb/e1;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Leb/v1;->e:Leb/e1;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method

.method public final t()Leb/m1;
    .locals 3

    iget-object v0, p0, Leb/m1;->c:Ljava/util/Comparator;

    invoke-static {v0}, Ljava/util/Collections;->reverseOrder(Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object v0

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Leb/m1;->B(Ljava/util/Comparator;)Leb/v1;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v1, p0, Leb/v1;->e:Leb/e1;

    new-instance v2, Leb/v1;

    invoke-virtual {v1}, Leb/e1;->f()Leb/e1;

    move-result-object v1

    invoke-direct {v2, v1, v0}, Leb/v1;-><init>(Leb/e1;Ljava/util/Comparator;)V

    return-object v2
.end method

.method public final x(Ljava/lang/Object;Z)Leb/m1;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2}, Leb/v1;->D(Ljava/lang/Object;Z)I

    move-result p1

    invoke-virtual {p0, v0, p1}, Leb/v1;->F(II)Leb/v1;

    move-result-object p1

    return-object p1
.end method

.method public final z(Ljava/lang/Object;ZLjava/lang/Object;Z)Leb/m1;
    .locals 0

    invoke-virtual {p0, p1, p2}, Leb/v1;->A(Ljava/lang/Object;Z)Leb/m1;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, Leb/m1;->x(Ljava/lang/Object;Z)Leb/m1;

    move-result-object p1

    return-object p1
.end method
