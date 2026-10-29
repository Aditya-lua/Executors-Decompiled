.class public final Ldb/g;
.super Ldb/i;
.source "SourceFile"


# instance fields
.field public final transient c:Ldb/i;


# direct methods
.method public constructor <init>(Ldb/i;)V
    .locals 0

    invoke-direct {p0}, Ldb/i;-><init>()V

    iput-object p1, p0, Ldb/g;->c:Ldb/i;

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Ldb/g;->c:Ldb/i;

    invoke-virtual {v0, p1}, Ldb/i;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final e()Ldb/i;
    .locals 1

    iget-object v0, p0, Ldb/g;->c:Ldb/i;

    return-object v0
.end method

.method public final f(II)Ldb/i;
    .locals 2

    iget-object v0, p0, Ldb/g;->c:Ldb/i;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    invoke-static {p1, p2, v1}, Ldb/s;->d(III)V

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    sub-int/2addr v1, p2

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    sub-int/2addr p2, p1

    invoke-virtual {v0, v1, p2}, Ldb/i;->f(II)Ldb/i;

    move-result-object p1

    invoke-virtual {p1}, Ldb/i;->e()Ldb/i;

    move-result-object p1

    return-object p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ldb/g;->c:Ldb/i;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    const-string v2, "index"

    invoke-static {p1, v1, v2}, Ldb/s;->b(IILjava/lang/String;)I

    invoke-virtual {p0, p1}, Ldb/g;->p(I)I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Ldb/g;->c:Ldb/i;

    invoke-virtual {v0, p1}, Ldb/i;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Ldb/g;->p(I)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Ldb/g;->c:Ldb/i;

    invoke-virtual {v0, p1}, Ldb/i;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Ldb/g;->p(I)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final p(I)I
    .locals 1

    iget-object v0, p0, Ldb/g;->c:Ldb/i;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, p1

    return v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Ldb/g;->c:Ldb/i;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ldb/i;->f(II)Ldb/i;

    move-result-object p1

    return-object p1
.end method
