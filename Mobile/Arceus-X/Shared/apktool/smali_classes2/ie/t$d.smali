.class public Lie/t$d;
.super Lie/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lie/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lie/t<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final transient c:I

.field public final transient d:I

.field public final synthetic e:Lie/t;


# direct methods
.method public constructor <init>(Lie/t;II)V
    .locals 0

    iput-object p1, p0, Lie/t$d;->e:Lie/t;

    invoke-direct {p0}, Lie/t;-><init>()V

    iput p2, p0, Lie/t$d;->c:I

    iput p3, p0, Lie/t$d;->d:I

    return-void
.end method


# virtual methods
.method public H(II)Lie/t;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lie/t<",
            "TE;>;"
        }
    .end annotation

    iget v0, p0, Lie/t$d;->d:I

    invoke-static {p1, p2, v0}, Lhe/n;->q(III)V

    iget-object v0, p0, Lie/t$d;->e:Lie/t;

    iget v1, p0, Lie/t$d;->c:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lie/t;->H(II)Lie/t;

    move-result-object p1

    return-object p1
.end method

.method public c()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lie/t$d;->e:Lie/t;

    invoke-virtual {v0}, Lie/r;->c()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 2

    iget-object v0, p0, Lie/t$d;->e:Lie/t;

    invoke-virtual {v0}, Lie/r;->e()I

    move-result v0

    iget v1, p0, Lie/t$d;->c:I

    add-int/2addr v0, v1

    iget v1, p0, Lie/t$d;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method public e()I
    .locals 2

    iget-object v0, p0, Lie/t$d;->e:Lie/t;

    invoke-virtual {v0}, Lie/r;->e()I

    move-result v0

    iget v1, p0, Lie/t$d;->c:I

    add-int/2addr v0, v1

    return v0
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget v0, p0, Lie/t$d;->d:I

    invoke-static {p1, v0}, Lhe/n;->j(II)I

    iget-object v0, p0, Lie/t$d;->e:Lie/t;

    iget v1, p0, Lie/t$d;->c:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-super {p0}, Lie/t;->g()Lie/y0;

    move-result-object v0

    return-object v0
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

    iget v0, p0, Lie/t$d;->d:I

    return v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lie/t$d;->H(II)Lie/t;

    move-result-object p1

    return-object p1
.end method
