.class public final Lie/q$a;
.super Lie/u$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lie/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lie/u$a<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lie/u$a;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lie/u;
    .locals 1

    invoke-virtual {p0}, Lie/q$a;->k()Lie/q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lie/u;
    .locals 1

    invoke-virtual {p0}, Lie/q$a;->l()Lie/q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Ljava/lang/Object;Ljava/lang/Object;)Lie/u$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lie/q$a;->m(Ljava/lang/Object;Ljava/lang/Object;)Lie/q$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic g(Ljava/util/Map$Entry;)Lie/u$a;
    .locals 0

    invoke-virtual {p0, p1}, Lie/q$a;->n(Ljava/util/Map$Entry;)Lie/q$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic h(Ljava/lang/Iterable;)Lie/u$a;
    .locals 0

    invoke-virtual {p0, p1}, Lie/q$a;->o(Ljava/lang/Iterable;)Lie/q$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i(Ljava/util/Map;)Lie/u$a;
    .locals 0

    invoke-virtual {p0, p1}, Lie/q$a;->p(Ljava/util/Map;)Lie/q$a;

    move-result-object p1

    return-object p1
.end method

.method public k()Lie/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lie/q<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lie/q$a;->l()Lie/q;

    move-result-object v0

    return-object v0
.end method

.method public l()Lie/q;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lie/q<",
            "TK;TV;>;"
        }
    .end annotation

    iget v0, p0, Lie/u$a;->c:I

    if-nez v0, :cond_0

    invoke-static {}, Lie/q;->s()Lie/q;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v1, p0, Lie/u$a;->a:Ljava/util/Comparator;

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lie/u$a;->d:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lie/u$a;->b:[Ljava/lang/Object;

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lie/u$a;->b:[Ljava/lang/Object;

    :cond_1
    iget-object v0, p0, Lie/u$a;->b:[Ljava/lang/Object;

    iget v1, p0, Lie/u$a;->c:I

    iget-object v2, p0, Lie/u$a;->a:Ljava/util/Comparator;

    invoke-static {v0, v1, v2}, Lie/u$a;->j([Ljava/lang/Object;ILjava/util/Comparator;)V

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lie/u$a;->d:Z

    new-instance v0, Lie/o0;

    iget-object v1, p0, Lie/u$a;->b:[Ljava/lang/Object;

    iget v2, p0, Lie/u$a;->c:I

    invoke-direct {v0, v1, v2}, Lie/o0;-><init>([Ljava/lang/Object;I)V

    return-object v0
.end method

.method public m(Ljava/lang/Object;Ljava/lang/Object;)Lie/q$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)",
            "Lie/q$a<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lie/u$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Lie/u$a;

    return-object p0
.end method

.method public n(Ljava/util/Map$Entry;)Lie/q$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "+TK;+TV;>;)",
            "Lie/q$a<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Lie/u$a;->g(Ljava/util/Map$Entry;)Lie/u$a;

    return-object p0
.end method

.method public o(Ljava/lang/Iterable;)Lie/q$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Ljava/util/Map$Entry<",
            "+TK;+TV;>;>;)",
            "Lie/q$a<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Lie/u$a;->h(Ljava/lang/Iterable;)Lie/u$a;

    return-object p0
.end method

.method public p(Ljava/util/Map;)Lie/q$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "+TK;+TV;>;)",
            "Lie/q$a<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Lie/u$a;->i(Ljava/util/Map;)Lie/u$a;

    return-object p0
.end method
