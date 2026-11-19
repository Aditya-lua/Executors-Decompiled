.class public abstract Lke/t;
.super Lke/r;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lke/t$a;,
        Lke/t$c;,
        Lke/t$d;,
        Lke/t$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lke/r<",
        "TE;>;",
        "Ljava/util/List<",
        "TE;>;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# static fields
.field public static final b:Lke/z0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lke/z0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lke/t$b;

    sget-object v1, Lke/p0;->e:Lke/t;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lke/t$b;-><init>(Lke/t;I)V

    sput-object v0, Lke/t;->b:Lke/z0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lke/r;-><init>()V

    return-void
.end method

.method public static A(Ljava/lang/Object;)Lke/t;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;)",
            "Lke/t<",
            "TE;>;"
        }
    .end annotation

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lke/t;->l([Ljava/lang/Object;)Lke/t;

    move-result-object p0

    return-object p0
.end method

.method public static B(Ljava/lang/Object;Ljava/lang/Object;)Lke/t;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;)",
            "Lke/t<",
            "TE;>;"
        }
    .end annotation

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lke/t;->l([Ljava/lang/Object;)Lke/t;

    move-result-object p0

    return-object p0
.end method

.method public static C(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lke/t;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;)",
            "Lke/t<",
            "TE;>;"
        }
    .end annotation

    filled-new-array {p0, p1, p2}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lke/t;->l([Ljava/lang/Object;)Lke/t;

    move-result-object p0

    return-object p0
.end method

.method public static D(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lke/t;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;TE;TE;TE;TE;)",
            "Lke/t<",
            "TE;>;"
        }
    .end annotation

    filled-new-array/range {p0 .. p6}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lke/t;->l([Ljava/lang/Object;)Lke/t;

    move-result-object p0

    return-object p0
.end method

.method public static varargs E(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Lke/t;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;TE;TE;TE;TE;TE;TE;TE;TE;TE;[TE;)",
            "Lke/t<",
            "TE;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    move-object/from16 v0, p12

    array-length v1, v0

    const v2, 0x7ffffff3

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-gt v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    const-string v2, "the total number of elements must fit in an int"

    invoke-static {v1, v2}, Lje/n;->e(ZLjava/lang/Object;)V

    array-length v1, v0

    const/16 v2, 0xc

    add-int/2addr v1, v2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p0, v1, v4

    aput-object p1, v1, v3

    const/4 p0, 0x2

    aput-object p2, v1, p0

    const/4 p0, 0x3

    aput-object p3, v1, p0

    const/4 p0, 0x4

    aput-object p4, v1, p0

    const/4 p0, 0x5

    aput-object p5, v1, p0

    const/4 p0, 0x6

    aput-object p6, v1, p0

    const/4 p0, 0x7

    aput-object p7, v1, p0

    const/16 p0, 0x8

    aput-object p8, v1, p0

    const/16 p0, 0x9

    aput-object p9, v1, p0

    const/16 p0, 0xa

    aput-object p10, v1, p0

    const/16 p0, 0xb

    aput-object p11, v1, p0

    array-length p0, v0

    invoke-static {v0, v4, v1, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v1}, Lke/t;->l([Ljava/lang/Object;)Lke/t;

    move-result-object p0

    return-object p0
.end method

.method public static G(Ljava/util/Comparator;Ljava/lang/Iterable;)Lke/t;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "-TE;>;",
            "Ljava/lang/Iterable<",
            "+TE;>;)",
            "Lke/t<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p0}, Lje/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lke/a0;->b(Ljava/lang/Iterable;)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lke/l0;->b([Ljava/lang/Object;)[Ljava/lang/Object;

    invoke-static {p1, p0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    invoke-static {p1}, Lke/t;->h([Ljava/lang/Object;)Lke/t;

    move-result-object p0

    return-object p0
.end method

.method public static h([Ljava/lang/Object;)Lke/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            ")",
            "Lke/t<",
            "TE;>;"
        }
    .end annotation

    array-length v0, p0

    invoke-static {p0, v0}, Lke/t;->i([Ljava/lang/Object;I)Lke/t;

    move-result-object p0

    return-object p0
.end method

.method public static i([Ljava/lang/Object;I)Lke/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            "I)",
            "Lke/t<",
            "TE;>;"
        }
    .end annotation

    if-nez p1, :cond_0

    invoke-static {}, Lke/t;->x()Lke/t;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lke/p0;

    invoke-direct {v0, p0, p1}, Lke/p0;-><init>([Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static j()Lke/t$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lke/t$a<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, Lke/t$a;

    invoke-direct {v0}, Lke/t$a;-><init>()V

    return-object v0
.end method

.method public static varargs l([Ljava/lang/Object;)Lke/t;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([",
            "Ljava/lang/Object;",
            ")",
            "Lke/t<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p0}, Lke/l0;->b([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lke/t;->h([Ljava/lang/Object;)Lke/t;

    move-result-object p0

    return-object p0
.end method

.method public static m(Ljava/lang/Iterable;)Lke/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "+TE;>;)",
            "Lke/t<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p0}, Lje/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/util/Collection;

    invoke-static {p0}, Lke/t;->n(Ljava/util/Collection;)Lke/t;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-static {p0}, Lke/t;->q(Ljava/util/Iterator;)Lke/t;

    move-result-object p0

    return-object p0
.end method

.method public static n(Ljava/util/Collection;)Lke/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+TE;>;)",
            "Lke/t<",
            "TE;>;"
        }
    .end annotation

    instance-of v0, p0, Lke/r;

    if-eqz v0, :cond_1

    check-cast p0, Lke/r;

    invoke-virtual {p0}, Lke/r;->a()Lke/t;

    move-result-object p0

    invoke-virtual {p0}, Lke/r;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lke/r;->toArray()[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lke/t;->h([Ljava/lang/Object;)Lke/t;

    move-result-object p0

    :cond_0
    return-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lke/t;->l([Ljava/lang/Object;)Lke/t;

    move-result-object p0

    return-object p0
.end method

.method public static q(Ljava/util/Iterator;)Lke/t;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator<",
            "+TE;>;)",
            "Lke/t<",
            "TE;>;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lke/t;->x()Lke/t;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Lke/t;->A(Ljava/lang/Object;)Lke/t;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v1, Lke/t$a;

    invoke-direct {v1}, Lke/t$a;-><init>()V

    invoke-virtual {v1, v0}, Lke/t$a;->h(Ljava/lang/Object;)Lke/t$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lke/t$a;->j(Ljava/util/Iterator;)Lke/t$a;

    move-result-object p0

    invoke-virtual {p0}, Lke/t$a;->k()Lke/t;

    move-result-object p0

    return-object p0
.end method

.method public static t([Ljava/lang/Object;)Lke/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([TE;)",
            "Lke/t<",
            "TE;>;"
        }
    .end annotation

    array-length v0, p0

    if-nez v0, :cond_0

    invoke-static {}, Lke/t;->x()Lke/t;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;

    invoke-static {p0}, Lke/t;->l([Ljava/lang/Object;)Lke/t;

    move-result-object p0

    return-object p0
.end method

.method public static x()Lke/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lke/t<",
            "TE;>;"
        }
    .end annotation

    sget-object v0, Lke/p0;->e:Lke/t;

    return-object v0
.end method


# virtual methods
.method public F()Lke/t;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lke/t<",
            "TE;>;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lke/t$c;

    invoke-direct {v0, p0}, Lke/t$c;-><init>(Lke/t;)V

    return-object v0
.end method

.method public H(II)Lke/t;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lke/t<",
            "TE;>;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-static {p1, p2, v0}, Lje/n;->q(III)V

    sub-int v0, p2, p1

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    return-object p0

    :cond_0
    if-nez v0, :cond_1

    invoke-static {}, Lke/t;->x()Lke/t;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p0, p1, p2}, Lke/t;->I(II)Lke/t;

    move-result-object p1

    return-object p1
.end method

.method public I(II)Lke/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lke/t<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, Lke/t$d;

    sub-int/2addr p2, p1

    invoke-direct {v0, p0, p1, p2}, Lke/t$d;-><init>(Lke/t;II)V

    return-object v0
.end method

.method public final a()Lke/t;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lke/t<",
            "TE;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-object p0
.end method

.method public final add(ILjava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Collection<",
            "+TE;>;)Z"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public b([Ljava/lang/Object;I)I
    .locals 4

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    add-int v2, p2, v1

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, p1, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    add-int/2addr p2, v0

    return p2
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lke/t;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lke/d0;->a(Ljava/util/List;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public g()Lke/y0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lke/y0<",
            "TE;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lke/t;->v()Lke/z0;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    mul-int/lit8 v1, v1, 0x1f

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v1, v3

    not-int v1, v1

    not-int v1, v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    invoke-static {p0, p1}, Lke/d0;->b(Ljava/util/List;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lke/t;->g()Lke/y0;

    move-result-object v0

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    invoke-static {p0, p1}, Lke/d0;->d(Ljava/util/List;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lke/t;->v()Lke/z0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lke/t;->w(I)Lke/z0;

    move-result-object p1

    return-object p1
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lke/t;->H(II)Lke/t;

    move-result-object p1

    return-object p1
.end method

.method public v()Lke/z0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lke/z0<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lke/t;->w(I)Lke/z0;

    move-result-object v0

    return-object v0
.end method

.method public w(I)Lke/z0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lke/z0<",
            "TE;>;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-static {p1, v0}, Lje/n;->o(II)I

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lke/t;->b:Lke/z0;

    return-object p1

    :cond_0
    new-instance v0, Lke/t$b;

    invoke-direct {v0, p0, p1}, Lke/t$b;-><init>(Lke/t;I)V

    return-object v0
.end method
