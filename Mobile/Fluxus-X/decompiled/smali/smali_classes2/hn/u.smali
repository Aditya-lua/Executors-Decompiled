.class public final Lhn/u;
.super Ljava/util/AbstractMap;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhn/u$g;,
        Lhn/u$d;,
        Lhn/u$e;,
        Lhn/u$c;,
        Lhn/u$b;,
        Lhn/u$f;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractMap<",
        "TK;TV;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field public static final i:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Ljava/lang/Comparable;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "-TK;>;"
        }
    .end annotation
.end field

.field public b:[Lhn/u$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lhn/u$g<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public final c:Lhn/u$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/u$g<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public d:I

.field public e:I

.field public f:I

.field public g:Lhn/u$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/u<",
            "TK;TV;>.d;"
        }
    .end annotation
.end field

.field public h:Lhn/u$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhn/u<",
            "TK;TV;>.e;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhn/u$a;

    invoke-direct {v0}, Lhn/u$a;-><init>()V

    sput-object v0, Lhn/u;->i:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lhn/u;-><init>(Ljava/util/Comparator;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "-TK;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lhn/u;->d:I

    .line 4
    iput v0, p0, Lhn/u;->e:I

    if-eqz p1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    sget-object p1, Lhn/u;->i:Ljava/util/Comparator;

    :goto_0
    iput-object p1, p0, Lhn/u;->a:Ljava/util/Comparator;

    .line 6
    new-instance p1, Lhn/u$g;

    invoke-direct {p1}, Lhn/u$g;-><init>()V

    iput-object p1, p0, Lhn/u;->c:Lhn/u$g;

    const/16 p1, 0x10

    .line 7
    new-array p1, p1, [Lhn/u$g;

    iput-object p1, p0, Lhn/u;->b:[Lhn/u$g;

    .line 8
    array-length v0, p1

    div-int/lit8 v0, v0, 0x2

    array-length p1, p1

    div-int/lit8 p1, p1, 0x4

    add-int/2addr v0, p1

    iput v0, p0, Lhn/u;->f:I

    return-void
.end method

.method public static b([Lhn/u$g;)[Lhn/u$g;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">([",
            "Lhn/u$g<",
            "TK;TV;>;)[",
            "Lhn/u$g<",
            "TK;TV;>;"
        }
    .end annotation

    array-length v0, p0

    mul-int/lit8 v1, v0, 0x2

    new-array v1, v1, [Lhn/u$g;

    new-instance v2, Lhn/u$c;

    invoke-direct {v2}, Lhn/u$c;-><init>()V

    new-instance v3, Lhn/u$b;

    invoke-direct {v3}, Lhn/u$b;-><init>()V

    new-instance v4, Lhn/u$b;

    invoke-direct {v4}, Lhn/u$b;-><init>()V

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v0, :cond_7

    aget-object v7, p0, v6

    if-nez v7, :cond_0

    goto :goto_4

    :cond_0
    invoke-virtual {v2, v7}, Lhn/u$c;->b(Lhn/u$g;)V

    move v8, v5

    move v9, v8

    :goto_1
    invoke-virtual {v2}, Lhn/u$c;->a()Lhn/u$g;

    move-result-object v10

    if-eqz v10, :cond_2

    iget v10, v10, Lhn/u$g;->g:I

    and-int/2addr v10, v0

    if-nez v10, :cond_1

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {v3, v8}, Lhn/u$b;->b(I)V

    invoke-virtual {v4, v9}, Lhn/u$b;->b(I)V

    invoke-virtual {v2, v7}, Lhn/u$c;->b(Lhn/u$g;)V

    :goto_2
    invoke-virtual {v2}, Lhn/u$c;->a()Lhn/u$g;

    move-result-object v7

    if-eqz v7, :cond_4

    iget v10, v7, Lhn/u$g;->g:I

    and-int/2addr v10, v0

    if-nez v10, :cond_3

    invoke-virtual {v3, v7}, Lhn/u$b;->a(Lhn/u$g;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v4, v7}, Lhn/u$b;->a(Lhn/u$g;)V

    goto :goto_2

    :cond_4
    const/4 v7, 0x0

    if-lez v8, :cond_5

    invoke-virtual {v3}, Lhn/u$b;->c()Lhn/u$g;

    move-result-object v8

    goto :goto_3

    :cond_5
    move-object v8, v7

    :goto_3
    aput-object v8, v1, v6

    add-int v8, v6, v0

    if-lez v9, :cond_6

    invoke-virtual {v4}, Lhn/u$b;->c()Lhn/u$g;

    move-result-object v7

    :cond_6
    aput-object v7, v1, v8

    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_7
    return-object v1
.end method

.method public static m(I)I
    .locals 2

    ushr-int/lit8 v0, p0, 0x14

    ushr-int/lit8 v1, p0, 0xc

    xor-int/2addr v0, v1

    xor-int/2addr p0, v0

    ushr-int/lit8 v0, p0, 0x7

    xor-int/2addr v0, p0

    ushr-int/lit8 p0, p0, 0x4

    xor-int/2addr p0, v0

    return p0
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lhn/u;->b:[Lhn/u$g;

    invoke-static {v0}, Lhn/u;->b([Lhn/u$g;)[Lhn/u$g;

    move-result-object v0

    iput-object v0, p0, Lhn/u;->b:[Lhn/u$g;

    array-length v1, v0

    div-int/lit8 v1, v1, 0x2

    array-length v0, v0

    div-int/lit8 v0, v0, 0x4

    add-int/2addr v1, v0

    iput v1, p0, Lhn/u;->f:I

    return-void
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-eq p1, p2, :cond_1

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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

.method public clear()V
    .locals 4

    iget-object v0, p0, Lhn/u;->b:[Lhn/u$g;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput v0, p0, Lhn/u;->d:I

    iget v0, p0, Lhn/u;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lhn/u;->e:I

    iget-object v0, p0, Lhn/u;->c:Lhn/u$g;

    iget-object v2, v0, Lhn/u$g;->d:Lhn/u$g;

    :goto_0
    if-eq v2, v0, :cond_0

    iget-object v3, v2, Lhn/u$g;->d:Lhn/u$g;

    iput-object v1, v2, Lhn/u$g;->e:Lhn/u$g;

    iput-object v1, v2, Lhn/u$g;->d:Lhn/u$g;

    move-object v2, v3

    goto :goto_0

    :cond_0
    iput-object v0, v0, Lhn/u$g;->e:Lhn/u$g;

    iput-object v0, v0, Lhn/u$g;->d:Lhn/u$g;

    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lhn/u;->f(Ljava/lang/Object;)Lhn/u$g;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public d(Ljava/lang/Object;Z)Lhn/u$g;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;Z)",
            "Lhn/u$g<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lhn/u;->a:Ljava/util/Comparator;

    iget-object v1, p0, Lhn/u;->b:[Lhn/u$g;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Lhn/u;->m(I)I

    move-result v6

    array-length v2, v1

    const/4 v9, 0x1

    sub-int/2addr v2, v9

    and-int/2addr v2, v6

    aget-object v3, v1, v2

    const/4 v4, 0x0

    if-eqz v3, :cond_5

    sget-object v5, Lhn/u;->i:Ljava/util/Comparator;

    if-ne v0, v5, :cond_0

    move-object v5, p1

    check-cast v5, Ljava/lang/Comparable;

    goto :goto_0

    :cond_0
    move-object v5, v4

    :goto_0
    if-eqz v5, :cond_1

    iget-object v7, v3, Lhn/u$g;->f:Ljava/lang/Object;

    invoke-interface {v5, v7}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v7

    goto :goto_1

    :cond_1
    iget-object v7, v3, Lhn/u$g;->f:Ljava/lang/Object;

    invoke-interface {v0, p1, v7}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v7

    :goto_1
    if-nez v7, :cond_2

    return-object v3

    :cond_2
    if-gez v7, :cond_3

    iget-object v8, v3, Lhn/u$g;->b:Lhn/u$g;

    goto :goto_2

    :cond_3
    iget-object v8, v3, Lhn/u$g;->c:Lhn/u$g;

    :goto_2
    if-nez v8, :cond_4

    :goto_3
    move v10, v7

    goto :goto_4

    :cond_4
    move-object v3, v8

    goto :goto_0

    :cond_5
    const/4 v7, 0x0

    goto :goto_3

    :goto_4
    if-nez p2, :cond_6

    return-object v4

    :cond_6
    iget-object v7, p0, Lhn/u;->c:Lhn/u$g;

    if-nez v3, :cond_9

    sget-object p2, Lhn/u;->i:Ljava/util/Comparator;

    if-ne v0, p2, :cond_7

    instance-of p2, p1, Ljava/lang/Comparable;

    if-eqz p2, :cond_8

    :cond_7
    move-object v4, v3

    goto :goto_5

    :cond_8
    new-instance p2, Ljava/lang/ClassCastException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " is not Comparable"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw p2

    :goto_5
    new-instance v3, Lhn/u$g;

    iget-object v8, v7, Lhn/u$g;->e:Lhn/u$g;

    move-object v5, p1

    invoke-direct/range {v3 .. v8}, Lhn/u$g;-><init>(Lhn/u$g;Ljava/lang/Object;ILhn/u$g;Lhn/u$g;)V

    aput-object v3, v1, v2

    goto :goto_7

    :cond_9
    move-object v5, p1

    move-object v4, v3

    new-instance v3, Lhn/u$g;

    iget-object v8, v7, Lhn/u$g;->e:Lhn/u$g;

    invoke-direct/range {v3 .. v8}, Lhn/u$g;-><init>(Lhn/u$g;Ljava/lang/Object;ILhn/u$g;Lhn/u$g;)V

    if-gez v10, :cond_a

    iput-object v3, v4, Lhn/u$g;->b:Lhn/u$g;

    goto :goto_6

    :cond_a
    iput-object v3, v4, Lhn/u$g;->c:Lhn/u$g;

    :goto_6
    invoke-virtual {p0, v4, v9}, Lhn/u;->g(Lhn/u$g;Z)V

    :goto_7
    iget p1, p0, Lhn/u;->d:I

    add-int/lit8 p2, p1, 0x1

    iput p2, p0, Lhn/u;->d:I

    iget p2, p0, Lhn/u;->f:I

    if-le p1, p2, :cond_b

    invoke-virtual {p0}, Lhn/u;->a()V

    :cond_b
    iget p1, p0, Lhn/u;->e:I

    add-int/2addr p1, v9

    iput p1, p0, Lhn/u;->e:I

    return-object v3
.end method

.method public e(Ljava/util/Map$Entry;)Lhn/u$g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "**>;)",
            "Lhn/u$g<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lhn/u;->f(Ljava/lang/Object;)Lhn/u$g;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, v0, Lhn/u$g;->h:Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, v1, p1}, Lhn/u;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public entrySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lhn/u;->g:Lhn/u$d;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lhn/u$d;

    invoke-direct {v0, p0}, Lhn/u$d;-><init>(Lhn/u;)V

    iput-object v0, p0, Lhn/u;->g:Lhn/u$d;

    return-object v0
.end method

.method public f(Ljava/lang/Object;)Lhn/u$g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lhn/u$g<",
            "TK;TV;>;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0, p1, v1}, Lhn/u;->d(Ljava/lang/Object;Z)Lhn/u$g;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :cond_0
    return-object v0
.end method

.method public final g(Lhn/u$g;Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/u$g<",
            "TK;TV;>;Z)V"
        }
    .end annotation

    :goto_0
    if-eqz p1, :cond_e

    iget-object v0, p1, Lhn/u$g;->b:Lhn/u$g;

    iget-object v1, p1, Lhn/u$g;->c:Lhn/u$g;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget v3, v0, Lhn/u$g;->i:I

    goto :goto_1

    :cond_0
    move v3, v2

    :goto_1
    if-eqz v1, :cond_1

    iget v4, v1, Lhn/u$g;->i:I

    goto :goto_2

    :cond_1
    move v4, v2

    :goto_2
    sub-int v5, v3, v4

    const/4 v6, -0x2

    if-ne v5, v6, :cond_6

    iget-object v0, v1, Lhn/u$g;->b:Lhn/u$g;

    iget-object v3, v1, Lhn/u$g;->c:Lhn/u$g;

    if-eqz v3, :cond_2

    iget v3, v3, Lhn/u$g;->i:I

    goto :goto_3

    :cond_2
    move v3, v2

    :goto_3
    if-eqz v0, :cond_3

    iget v2, v0, Lhn/u$g;->i:I

    :cond_3
    sub-int/2addr v2, v3

    const/4 v0, -0x1

    if-eq v2, v0, :cond_5

    if-nez v2, :cond_4

    if-eqz p2, :cond_5

    :cond_4
    invoke-virtual {p0, v1}, Lhn/u;->l(Lhn/u$g;)V

    :cond_5
    invoke-virtual {p0, p1}, Lhn/u;->k(Lhn/u$g;)V

    if-eqz p2, :cond_d

    goto :goto_5

    :cond_6
    const/4 v1, 0x2

    const/4 v6, 0x1

    if-ne v5, v1, :cond_b

    iget-object v1, v0, Lhn/u$g;->b:Lhn/u$g;

    iget-object v3, v0, Lhn/u$g;->c:Lhn/u$g;

    if-eqz v3, :cond_7

    iget v3, v3, Lhn/u$g;->i:I

    goto :goto_4

    :cond_7
    move v3, v2

    :goto_4
    if-eqz v1, :cond_8

    iget v2, v1, Lhn/u$g;->i:I

    :cond_8
    sub-int/2addr v2, v3

    if-eq v2, v6, :cond_a

    if-nez v2, :cond_9

    if-eqz p2, :cond_a

    :cond_9
    invoke-virtual {p0, v0}, Lhn/u;->k(Lhn/u$g;)V

    :cond_a
    invoke-virtual {p0, p1}, Lhn/u;->l(Lhn/u$g;)V

    if-eqz p2, :cond_d

    goto :goto_5

    :cond_b
    if-nez v5, :cond_c

    add-int/lit8 v3, v3, 0x1

    iput v3, p1, Lhn/u$g;->i:I

    if-eqz p2, :cond_d

    goto :goto_5

    :cond_c
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr v0, v6

    iput v0, p1, Lhn/u$g;->i:I

    if-nez p2, :cond_d

    goto :goto_5

    :cond_d
    iget-object p1, p1, Lhn/u$g;->a:Lhn/u$g;

    goto :goto_0

    :cond_e
    :goto_5
    return-void
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lhn/u;->f(Ljava/lang/Object;)Lhn/u$g;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, Lhn/u$g;->h:Ljava/lang/Object;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public h(Lhn/u$g;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/u$g<",
            "TK;TV;>;Z)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    iget-object p2, p1, Lhn/u$g;->e:Lhn/u$g;

    iget-object v1, p1, Lhn/u$g;->d:Lhn/u$g;

    iput-object v1, p2, Lhn/u$g;->d:Lhn/u$g;

    iget-object v1, p1, Lhn/u$g;->d:Lhn/u$g;

    iput-object p2, v1, Lhn/u$g;->e:Lhn/u$g;

    iput-object v0, p1, Lhn/u$g;->e:Lhn/u$g;

    iput-object v0, p1, Lhn/u$g;->d:Lhn/u$g;

    :cond_0
    iget-object p2, p1, Lhn/u$g;->b:Lhn/u$g;

    iget-object v1, p1, Lhn/u$g;->c:Lhn/u$g;

    iget-object v2, p1, Lhn/u$g;->a:Lhn/u$g;

    const/4 v3, 0x0

    if-eqz p2, :cond_4

    if-eqz v1, :cond_4

    iget v2, p2, Lhn/u$g;->i:I

    iget v4, v1, Lhn/u$g;->i:I

    if-le v2, v4, :cond_1

    invoke-virtual {p2}, Lhn/u$g;->b()Lhn/u$g;

    move-result-object p2

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lhn/u$g;->a()Lhn/u$g;

    move-result-object p2

    :goto_0
    invoke-virtual {p0, p2, v3}, Lhn/u;->h(Lhn/u$g;Z)V

    iget-object v1, p1, Lhn/u$g;->b:Lhn/u$g;

    if-eqz v1, :cond_2

    iget v2, v1, Lhn/u$g;->i:I

    iput-object v1, p2, Lhn/u$g;->b:Lhn/u$g;

    iput-object p2, v1, Lhn/u$g;->a:Lhn/u$g;

    iput-object v0, p1, Lhn/u$g;->b:Lhn/u$g;

    goto :goto_1

    :cond_2
    move v2, v3

    :goto_1
    iget-object v1, p1, Lhn/u$g;->c:Lhn/u$g;

    if-eqz v1, :cond_3

    iget v3, v1, Lhn/u$g;->i:I

    iput-object v1, p2, Lhn/u$g;->c:Lhn/u$g;

    iput-object p2, v1, Lhn/u$g;->a:Lhn/u$g;

    iput-object v0, p1, Lhn/u$g;->c:Lhn/u$g;

    :cond_3
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p2, Lhn/u$g;->i:I

    invoke-virtual {p0, p1, p2}, Lhn/u;->j(Lhn/u$g;Lhn/u$g;)V

    return-void

    :cond_4
    if-eqz p2, :cond_5

    invoke-virtual {p0, p1, p2}, Lhn/u;->j(Lhn/u$g;Lhn/u$g;)V

    iput-object v0, p1, Lhn/u$g;->b:Lhn/u$g;

    goto :goto_2

    :cond_5
    if-eqz v1, :cond_6

    invoke-virtual {p0, p1, v1}, Lhn/u;->j(Lhn/u$g;Lhn/u$g;)V

    iput-object v0, p1, Lhn/u$g;->c:Lhn/u$g;

    goto :goto_2

    :cond_6
    invoke-virtual {p0, p1, v0}, Lhn/u;->j(Lhn/u$g;Lhn/u$g;)V

    :goto_2
    invoke-virtual {p0, v2, v3}, Lhn/u;->g(Lhn/u$g;Z)V

    iget p1, p0, Lhn/u;->d:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lhn/u;->d:I

    iget p1, p0, Lhn/u;->e:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lhn/u;->e:I

    return-void
.end method

.method public i(Ljava/lang/Object;)Lhn/u$g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lhn/u$g<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lhn/u;->f(Ljava/lang/Object;)Lhn/u$g;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lhn/u;->h(Lhn/u$g;Z)V

    :cond_0
    return-object p1
.end method

.method public final j(Lhn/u$g;Lhn/u$g;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/u$g<",
            "TK;TV;>;",
            "Lhn/u$g<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p1, Lhn/u$g;->a:Lhn/u$g;

    const/4 v1, 0x0

    iput-object v1, p1, Lhn/u$g;->a:Lhn/u$g;

    if-eqz p2, :cond_0

    iput-object v0, p2, Lhn/u$g;->a:Lhn/u$g;

    :cond_0
    if-eqz v0, :cond_2

    iget-object v1, v0, Lhn/u$g;->b:Lhn/u$g;

    if-ne v1, p1, :cond_1

    iput-object p2, v0, Lhn/u$g;->b:Lhn/u$g;

    return-void

    :cond_1
    iput-object p2, v0, Lhn/u$g;->c:Lhn/u$g;

    return-void

    :cond_2
    iget p1, p1, Lhn/u$g;->g:I

    iget-object v0, p0, Lhn/u;->b:[Lhn/u$g;

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    and-int/2addr p1, v1

    aput-object p2, v0, p1

    return-void
.end method

.method public final k(Lhn/u$g;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/u$g<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p1, Lhn/u$g;->b:Lhn/u$g;

    iget-object v1, p1, Lhn/u$g;->c:Lhn/u$g;

    iget-object v2, v1, Lhn/u$g;->b:Lhn/u$g;

    iget-object v3, v1, Lhn/u$g;->c:Lhn/u$g;

    iput-object v2, p1, Lhn/u$g;->c:Lhn/u$g;

    if-eqz v2, :cond_0

    iput-object p1, v2, Lhn/u$g;->a:Lhn/u$g;

    :cond_0
    invoke-virtual {p0, p1, v1}, Lhn/u;->j(Lhn/u$g;Lhn/u$g;)V

    iput-object p1, v1, Lhn/u$g;->b:Lhn/u$g;

    iput-object v1, p1, Lhn/u$g;->a:Lhn/u$g;

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    iget v0, v0, Lhn/u$g;->i:I

    goto :goto_0

    :cond_1
    move v0, v4

    :goto_0
    if-eqz v2, :cond_2

    iget v2, v2, Lhn/u$g;->i:I

    goto :goto_1

    :cond_2
    move v2, v4

    :goto_1
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p1, Lhn/u$g;->i:I

    if-eqz v3, :cond_3

    iget v4, v3, Lhn/u$g;->i:I

    :cond_3
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, v1, Lhn/u$g;->i:I

    return-void
.end method

.method public keySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, Lhn/u;->h:Lhn/u$e;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lhn/u$e;

    invoke-direct {v0, p0}, Lhn/u$e;-><init>(Lhn/u;)V

    iput-object v0, p0, Lhn/u;->h:Lhn/u$e;

    return-object v0
.end method

.method public final l(Lhn/u$g;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhn/u$g<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p1, Lhn/u$g;->b:Lhn/u$g;

    iget-object v1, p1, Lhn/u$g;->c:Lhn/u$g;

    iget-object v2, v0, Lhn/u$g;->b:Lhn/u$g;

    iget-object v3, v0, Lhn/u$g;->c:Lhn/u$g;

    iput-object v3, p1, Lhn/u$g;->b:Lhn/u$g;

    if-eqz v3, :cond_0

    iput-object p1, v3, Lhn/u$g;->a:Lhn/u$g;

    :cond_0
    invoke-virtual {p0, p1, v0}, Lhn/u;->j(Lhn/u$g;Lhn/u$g;)V

    iput-object p1, v0, Lhn/u$g;->c:Lhn/u$g;

    iput-object v0, p1, Lhn/u$g;->a:Lhn/u$g;

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    iget v1, v1, Lhn/u$g;->i:I

    goto :goto_0

    :cond_1
    move v1, v4

    :goto_0
    if-eqz v3, :cond_2

    iget v3, v3, Lhn/u$g;->i:I

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_1
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p1, Lhn/u$g;->i:I

    if-eqz v2, :cond_3

    iget v4, v2, Lhn/u$g;->i:I

    :cond_3
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, v0, Lhn/u$g;->i:I

    return-void
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lhn/u;->d(Ljava/lang/Object;Z)Lhn/u$g;

    move-result-object p1

    iget-object v0, p1, Lhn/u$g;->h:Ljava/lang/Object;

    iput-object p2, p1, Lhn/u$g;->h:Ljava/lang/Object;

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "key == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lhn/u;->i(Ljava/lang/Object;)Lhn/u$g;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, Lhn/u$g;->h:Ljava/lang/Object;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lhn/u;->d:I

    return v0
.end method
