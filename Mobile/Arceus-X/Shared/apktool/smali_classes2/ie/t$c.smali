.class public Lie/t$c;
.super Lie/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lie/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lie/t<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final transient c:Lie/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lie/t<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lie/t;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lie/t<",
            "TE;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lie/t;-><init>()V

    iput-object p1, p0, Lie/t$c;->c:Lie/t;

    return-void
.end method


# virtual methods
.method public F()Lie/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lie/t<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, Lie/t$c;->c:Lie/t;

    return-object v0
.end method

.method public H(II)Lie/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lie/t<",
            "TE;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lie/t$c;->size()I

    move-result v0

    invoke-static {p1, p2, v0}, Lhe/n;->q(III)V

    iget-object v0, p0, Lie/t$c;->c:Lie/t;

    invoke-virtual {p0, p2}, Lie/t$c;->K(I)I

    move-result p2

    invoke-virtual {p0, p1}, Lie/t$c;->K(I)I

    move-result p1

    invoke-virtual {v0, p2, p1}, Lie/t;->H(II)Lie/t;

    move-result-object p1

    invoke-virtual {p1}, Lie/t;->F()Lie/t;

    move-result-object p1

    return-object p1
.end method

.method public final J(I)I
    .locals 1

    invoke-virtual {p0}, Lie/t$c;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, p1

    return v0
.end method

.method public final K(I)I
    .locals 1

    invoke-virtual {p0}, Lie/t$c;->size()I

    move-result v0

    sub-int/2addr v0, p1

    return v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lie/t$c;->c:Lie/t;

    invoke-virtual {v0, p1}, Lie/t;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lie/t$c;->c:Lie/t;

    invoke-virtual {v0}, Lie/r;->f()Z

    move-result v0

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    invoke-virtual {p0}, Lie/t$c;->size()I

    move-result v0

    invoke-static {p1, v0}, Lhe/n;->j(II)I

    iget-object v0, p0, Lie/t$c;->c:Lie/t;

    invoke-virtual {p0, p1}, Lie/t$c;->J(I)I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lie/t$c;->c:Lie/t;

    invoke-virtual {v0, p1}, Lie/t;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Lie/t$c;->J(I)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-super {p0}, Lie/t;->g()Lie/y0;

    move-result-object v0

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lie/t$c;->c:Lie/t;

    invoke-virtual {v0, p1}, Lie/t;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Lie/t$c;->J(I)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    .line 1
    invoke-super {p0}, Lie/t;->x()Lie/z0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lie/t;->y(I)Lie/z0;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lie/t$c;->c:Lie/t;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lie/t$c;->H(II)Lie/t;

    move-result-object p1

    return-object p1
.end method
