.class public final Lxg/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lxg/a;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lxg/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lxg/a;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxg/c;->a:Lxg/a;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lxg/c;->b:Ljava/util/List;

    new-instance v1, Lxg/b;

    const/4 v2, 0x1

    filled-new-array {v2}, [I

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lxg/b;-><init>(Lxg/a;[I)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final a(I)Lxg/b;
    .locals 7

    iget-object v0, p0, Lxg/c;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    iget-object v0, p0, Lxg/c;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxg/b;

    iget-object v1, p0, Lxg/c;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_0
    if-gt v1, p1, :cond_0

    new-instance v3, Lxg/b;

    iget-object v4, p0, Lxg/c;->a:Lxg/a;

    add-int/lit8 v5, v1, -0x1

    invoke-virtual {v4}, Lxg/a;->d()I

    move-result v6

    add-int/2addr v5, v6

    invoke-virtual {v4, v5}, Lxg/a;->c(I)I

    move-result v5

    filled-new-array {v2, v5}, [I

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lxg/b;-><init>(Lxg/a;[I)V

    invoke-virtual {v0, v3}, Lxg/b;->g(Lxg/b;)Lxg/b;

    move-result-object v0

    iget-object v3, p0, Lxg/c;->b:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lxg/c;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxg/b;

    return-object p1
.end method

.method public b([II)V
    .locals 6

    if-eqz p2, :cond_2

    array-length v0, p1

    sub-int/2addr v0, p2

    if-lez v0, :cond_1

    invoke-virtual {p0, p2}, Lxg/c;->a(I)Lxg/b;

    move-result-object v1

    new-array v2, v0, [I

    const/4 v3, 0x0

    invoke-static {p1, v3, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v4, Lxg/b;

    iget-object v5, p0, Lxg/c;->a:Lxg/a;

    invoke-direct {v4, v5, v2}, Lxg/b;-><init>(Lxg/a;[I)V

    const/4 v2, 0x1

    invoke-virtual {v4, p2, v2}, Lxg/b;->h(II)Lxg/b;

    move-result-object v4

    invoke-virtual {v4, v1}, Lxg/b;->b(Lxg/b;)[Lxg/b;

    move-result-object v1

    aget-object v1, v1, v2

    invoke-virtual {v1}, Lxg/b;->d()[I

    move-result-object v1

    array-length v2, v1

    sub-int/2addr p2, v2

    move v2, v3

    :goto_0
    if-ge v2, p2, :cond_0

    add-int v4, v0, v2

    aput v3, p1, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    add-int/2addr v0, p2

    array-length p2, v1

    invoke-static {v1, v3, p1, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "No data bytes provided"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "No error correction bytes"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
