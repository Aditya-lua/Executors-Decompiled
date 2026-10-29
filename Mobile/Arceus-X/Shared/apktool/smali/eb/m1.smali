.class public abstract Leb/m1;
.super Leb/h1;
.source "SourceFile"

# interfaces
.implements Ljava/util/NavigableSet;
.implements Leb/a2;


# instance fields
.field public final transient c:Ljava/util/Comparator;

.field public transient d:Leb/m1;


# direct methods
.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    invoke-direct {p0}, Leb/h1;-><init>()V

    iput-object p1, p0, Leb/m1;->c:Ljava/util/Comparator;

    return-void
.end method

.method public static B(Ljava/util/Comparator;)Leb/v1;
    .locals 2

    sget-object v0, Leb/q1;->a:Leb/q1;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Leb/v1;->f:Leb/v1;

    return-object p0

    :cond_0
    new-instance v0, Leb/v1;

    sget-object v1, Leb/e1;->b:Leb/d2;

    sget-object v1, Leb/t1;->e:Leb/e1;

    invoke-direct {v0, v1, p0}, Leb/v1;-><init>(Leb/e1;Ljava/util/Comparator;)V

    return-object v0
.end method


# virtual methods
.method public abstract A(Ljava/lang/Object;Z)Leb/m1;
.end method

.method public final addFirst(Ljava/lang/Object;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final addLast(Ljava/lang/Object;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final comparator()Ljava/util/Comparator;
    .locals 1

    iget-object v0, p0, Leb/m1;->c:Ljava/util/Comparator;

    return-object v0
.end method

.method public final bridge synthetic descendingSet()Ljava/util/NavigableSet;
    .locals 1

    invoke-virtual {p0}, Leb/m1;->u()Leb/m1;

    move-result-object v0

    return-object v0
.end method

.method public abstract first()Ljava/lang/Object;
.end method

.method public final getFirst()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Leb/m1;->first()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getLast()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Leb/m1;->last()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic headSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    invoke-virtual {p0, p1, p2}, Leb/m1;->x(Ljava/lang/Object;Z)Leb/m1;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Leb/m1;->x(Ljava/lang/Object;Z)Leb/m1;

    move-result-object p1

    return-object p1
.end method

.method public abstract last()Ljava/lang/Object;
.end method

.method public final pollFirst()Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final pollLast()Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final removeFirst()Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final removeLast()Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final bridge synthetic subSet(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3, p4}, Leb/m1;->y(Ljava/lang/Object;ZLjava/lang/Object;Z)Leb/m1;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, p2, v1}, Leb/m1;->y(Ljava/lang/Object;ZLjava/lang/Object;Z)Leb/m1;

    move-result-object p1

    return-object p1
.end method

.method public abstract t()Leb/m1;
.end method

.method public final synthetic tailSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    invoke-virtual {p0, p1, p2}, Leb/m1;->A(Ljava/lang/Object;Z)Leb/m1;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Leb/m1;->A(Ljava/lang/Object;Z)Leb/m1;

    move-result-object p1

    return-object p1
.end method

.method public final u()Leb/m1;
    .locals 1

    iget-object v0, p0, Leb/m1;->d:Leb/m1;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Leb/m1;->t()Leb/m1;

    move-result-object v0

    iput-object v0, p0, Leb/m1;->d:Leb/m1;

    iput-object p0, v0, Leb/m1;->d:Leb/m1;

    :cond_0
    return-object v0
.end method

.method public abstract x(Ljava/lang/Object;Z)Leb/m1;
.end method

.method public final y(Ljava/lang/Object;ZLjava/lang/Object;Z)Leb/m1;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Leb/m1;->c:Ljava/util/Comparator;

    invoke-interface {v0, p1, p3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Leb/n0;->c(Z)V

    invoke-virtual {p0, p1, p2, p3, p4}, Leb/m1;->z(Ljava/lang/Object;ZLjava/lang/Object;Z)Leb/m1;

    move-result-object p1

    return-object p1
.end method

.method public abstract z(Ljava/lang/Object;ZLjava/lang/Object;Z)Leb/m1;
.end method
