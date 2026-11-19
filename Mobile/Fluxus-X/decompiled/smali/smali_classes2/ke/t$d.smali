.class public Lke/t$d;
.super Lke/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lke/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lke/t<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final transient c:I

.field public final transient d:I

.field public final synthetic e:Lke/t;


# direct methods
.method public constructor <init>(Lke/t;II)V
    .locals 0

    iput-object p1, p0, Lke/t$d;->e:Lke/t;

    invoke-direct {p0}, Lke/t;-><init>()V

    iput p2, p0, Lke/t$d;->c:I

    iput p3, p0, Lke/t$d;->d:I

    return-void
.end method


# virtual methods
.method public H(II)Lke/t;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lke/t<",
            "TE;>;"
        }
    .end annotation

    iget v0, p0, Lke/t$d;->d:I

    invoke-static {p1, p2, v0}, Lje/n;->q(III)V

    iget-object v0, p0, Lke/t$d;->e:Lke/t;

    iget v1, p0, Lke/t$d;->c:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lke/t;->H(II)Lke/t;

    move-result-object p1

    return-object p1
.end method

.method public c()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lke/t$d;->e:Lke/t;

    invoke-virtual {v0}, Lke/r;->c()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 2

    iget-object v0, p0, Lke/t$d;->e:Lke/t;

    invoke-virtual {v0}, Lke/r;->e()I

    move-result v0

    iget v1, p0, Lke/t$d;->c:I

    add-int/2addr v0, v1

    iget v1, p0, Lke/t$d;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method public e()I
    .locals 2

    iget-object v0, p0, Lke/t$d;->e:Lke/t;

    invoke-virtual {v0}, Lke/r;->e()I

    move-result v0

    iget v1, p0, Lke/t$d;->c:I

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

    iget v0, p0, Lke/t$d;->d:I

    invoke-static {p1, v0}, Lje/n;->j(II)I

    iget-object v0, p0, Lke/t$d;->e:Lke/t;

    iget v1, p0, Lke/t$d;->c:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-super {p0}, Lke/t;->g()Lke/y0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    .line 1
    invoke-super {p0}, Lke/t;->v()Lke/z0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lke/t;->w(I)Lke/z0;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lke/t$d;->d:I

    return v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lke/t$d;->H(II)Lke/t;

    move-result-object p1

    return-object p1
.end method
