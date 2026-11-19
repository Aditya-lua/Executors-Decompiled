.class public final Lke/q$a;
.super Lke/u$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lke/q;
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
        "Lke/u$a<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lke/u$a;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lke/u;
    .locals 1

    invoke-virtual {p0}, Lke/q$a;->k()Lke/q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lke/u;
    .locals 1

    invoke-virtual {p0}, Lke/q$a;->l()Lke/q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Ljava/lang/Object;Ljava/lang/Object;)Lke/u$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lke/q$a;->m(Ljava/lang/Object;Ljava/lang/Object;)Lke/q$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic g(Ljava/util/Map$Entry;)Lke/u$a;
    .locals 0

    invoke-virtual {p0, p1}, Lke/q$a;->n(Ljava/util/Map$Entry;)Lke/q$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic h(Ljava/lang/Iterable;)Lke/u$a;
    .locals 0

    invoke-virtual {p0, p1}, Lke/q$a;->o(Ljava/lang/Iterable;)Lke/q$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i(Ljava/util/Map;)Lke/u$a;
    .locals 0

    invoke-virtual {p0, p1}, Lke/q$a;->p(Ljava/util/Map;)Lke/q$a;

    move-result-object p1

    return-object p1
.end method

.method public k()Lke/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lke/q<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lke/q$a;->l()Lke/q;

    move-result-object v0

    return-object v0
.end method

.method public l()Lke/q;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lke/q<",
            "TK;TV;>;"
        }
    .end annotation

    iget v0, p0, Lke/u$a;->c:I

    if-nez v0, :cond_0

    invoke-static {}, Lke/q;->s()Lke/q;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v1, p0, Lke/u$a;->a:Ljava/util/Comparator;

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lke/u$a;->d:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lke/u$a;->b:[Ljava/lang/Object;

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lke/u$a;->b:[Ljava/lang/Object;

    :cond_1
    iget-object v0, p0, Lke/u$a;->b:[Ljava/lang/Object;

    iget v1, p0, Lke/u$a;->c:I

    iget-object v2, p0, Lke/u$a;->a:Ljava/util/Comparator;

    invoke-static {v0, v1, v2}, Lke/u$a;->j([Ljava/lang/Object;ILjava/util/Comparator;)V

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lke/u$a;->d:Z

    new-instance v0, Lke/o0;

    iget-object v1, p0, Lke/u$a;->b:[Ljava/lang/Object;

    iget v2, p0, Lke/u$a;->c:I

    invoke-direct {v0, v1, v2}, Lke/o0;-><init>([Ljava/lang/Object;I)V

    return-object v0
.end method

.method public m(Ljava/lang/Object;Ljava/lang/Object;)Lke/q$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)",
            "Lke/q$a<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lke/u$a;->f(Ljava/lang/Object;Ljava/lang/Object;)Lke/u$a;

    return-object p0
.end method

.method public n(Ljava/util/Map$Entry;)Lke/q$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "+TK;+TV;>;)",
            "Lke/q$a<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Lke/u$a;->g(Ljava/util/Map$Entry;)Lke/u$a;

    return-object p0
.end method

.method public o(Ljava/lang/Iterable;)Lke/q$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Ljava/util/Map$Entry<",
            "+TK;+TV;>;>;)",
            "Lke/q$a<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Lke/u$a;->h(Ljava/lang/Iterable;)Lke/u$a;

    return-object p0
.end method

.method public p(Ljava/util/Map;)Lke/q$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "+TK;+TV;>;)",
            "Lke/q$a<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-super {p0, p1}, Lke/u$a;->i(Ljava/util/Map;)Lke/u$a;

    return-object p0
.end method
