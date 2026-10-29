.class public Landroidx/datastore/preferences/protobuf/p1;
.super Landroidx/datastore/preferences/protobuf/n1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/datastore/preferences/protobuf/n1<",
        "Landroidx/datastore/preferences/protobuf/o1;",
        "Landroidx/datastore/preferences/protobuf/o1;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/n1;-><init>()V

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/o1;
    .locals 0

    check-cast p1, Landroidx/datastore/preferences/protobuf/x;

    iget-object p1, p1, Landroidx/datastore/preferences/protobuf/x;->unknownFields:Landroidx/datastore/preferences/protobuf/o1;

    return-object p1
.end method

.method public B(Landroidx/datastore/preferences/protobuf/o1;)I
    .locals 0

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/o1;->d()I

    move-result p1

    return p1
.end method

.method public C(Landroidx/datastore/preferences/protobuf/o1;)I
    .locals 0

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/o1;->e()I

    move-result p1

    return p1
.end method

.method public D(Landroidx/datastore/preferences/protobuf/o1;Landroidx/datastore/preferences/protobuf/o1;)Landroidx/datastore/preferences/protobuf/o1;
    .locals 1

    invoke-static {}, Landroidx/datastore/preferences/protobuf/o1;->c()Landroidx/datastore/preferences/protobuf/o1;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroidx/datastore/preferences/protobuf/o1;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {}, Landroidx/datastore/preferences/protobuf/o1;->c()Landroidx/datastore/preferences/protobuf/o1;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/datastore/preferences/protobuf/o1;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, Landroidx/datastore/preferences/protobuf/o1;->j(Landroidx/datastore/preferences/protobuf/o1;Landroidx/datastore/preferences/protobuf/o1;)Landroidx/datastore/preferences/protobuf/o1;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1, p2}, Landroidx/datastore/preferences/protobuf/o1;->i(Landroidx/datastore/preferences/protobuf/o1;)Landroidx/datastore/preferences/protobuf/o1;

    move-result-object p1

    return-object p1
.end method

.method public E()Landroidx/datastore/preferences/protobuf/o1;
    .locals 1

    invoke-static {}, Landroidx/datastore/preferences/protobuf/o1;->k()Landroidx/datastore/preferences/protobuf/o1;

    move-result-object v0

    return-object v0
.end method

.method public F(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/o1;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/p1;->G(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/o1;)V

    return-void
.end method

.method public G(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/o1;)V
    .locals 0

    check-cast p1, Landroidx/datastore/preferences/protobuf/x;

    iput-object p2, p1, Landroidx/datastore/preferences/protobuf/x;->unknownFields:Landroidx/datastore/preferences/protobuf/o1;

    return-void
.end method

.method public H(Landroidx/datastore/preferences/protobuf/o1;)Landroidx/datastore/preferences/protobuf/o1;
    .locals 0

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/o1;->h()V

    return-object p1
.end method

.method public I(Landroidx/datastore/preferences/protobuf/o1;Landroidx/datastore/preferences/protobuf/t1;)V
    .locals 0

    invoke-virtual {p1, p2}, Landroidx/datastore/preferences/protobuf/o1;->p(Landroidx/datastore/preferences/protobuf/t1;)V

    return-void
.end method

.method public J(Landroidx/datastore/preferences/protobuf/o1;Landroidx/datastore/preferences/protobuf/t1;)V
    .locals 0

    invoke-virtual {p1, p2}, Landroidx/datastore/preferences/protobuf/o1;->r(Landroidx/datastore/preferences/protobuf/t1;)V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;II)V
    .locals 0

    check-cast p1, Landroidx/datastore/preferences/protobuf/o1;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/p1;->u(Landroidx/datastore/preferences/protobuf/o1;II)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;IJ)V
    .locals 0

    check-cast p1, Landroidx/datastore/preferences/protobuf/o1;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/datastore/preferences/protobuf/p1;->v(Landroidx/datastore/preferences/protobuf/o1;IJ)V

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    check-cast p1, Landroidx/datastore/preferences/protobuf/o1;

    check-cast p3, Landroidx/datastore/preferences/protobuf/o1;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/p1;->w(Landroidx/datastore/preferences/protobuf/o1;ILandroidx/datastore/preferences/protobuf/o1;)V

    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;ILandroidx/datastore/preferences/protobuf/g;)V
    .locals 0

    check-cast p1, Landroidx/datastore/preferences/protobuf/o1;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/p1;->x(Landroidx/datastore/preferences/protobuf/o1;ILandroidx/datastore/preferences/protobuf/g;)V

    return-void
.end method

.method public bridge synthetic e(Ljava/lang/Object;IJ)V
    .locals 0

    check-cast p1, Landroidx/datastore/preferences/protobuf/o1;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/datastore/preferences/protobuf/p1;->y(Landroidx/datastore/preferences/protobuf/o1;IJ)V

    return-void
.end method

.method public bridge synthetic f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/p1;->z(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/o1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/p1;->A(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/o1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic h(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Landroidx/datastore/preferences/protobuf/o1;

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/p1;->B(Landroidx/datastore/preferences/protobuf/o1;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic i(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Landroidx/datastore/preferences/protobuf/o1;

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/p1;->C(Landroidx/datastore/preferences/protobuf/o1;)I

    move-result p1

    return p1
.end method

.method public j(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/p1;->A(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/o1;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/o1;->h()V

    return-void
.end method

.method public bridge synthetic k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/datastore/preferences/protobuf/o1;

    check-cast p2, Landroidx/datastore/preferences/protobuf/o1;

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/p1;->D(Landroidx/datastore/preferences/protobuf/o1;Landroidx/datastore/preferences/protobuf/o1;)Landroidx/datastore/preferences/protobuf/o1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic n()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/p1;->E()Landroidx/datastore/preferences/protobuf/o1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Landroidx/datastore/preferences/protobuf/o1;

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/p1;->F(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/o1;)V

    return-void
.end method

.method public bridge synthetic p(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Landroidx/datastore/preferences/protobuf/o1;

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/p1;->G(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/o1;)V

    return-void
.end method

.method public q(Landroidx/datastore/preferences/protobuf/f1;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/datastore/preferences/protobuf/o1;

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/p1;->H(Landroidx/datastore/preferences/protobuf/o1;)Landroidx/datastore/preferences/protobuf/o1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/t1;)V
    .locals 0

    check-cast p1, Landroidx/datastore/preferences/protobuf/o1;

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/p1;->I(Landroidx/datastore/preferences/protobuf/o1;Landroidx/datastore/preferences/protobuf/t1;)V

    return-void
.end method

.method public bridge synthetic t(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/t1;)V
    .locals 0

    check-cast p1, Landroidx/datastore/preferences/protobuf/o1;

    invoke-virtual {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/p1;->J(Landroidx/datastore/preferences/protobuf/o1;Landroidx/datastore/preferences/protobuf/t1;)V

    return-void
.end method

.method public u(Landroidx/datastore/preferences/protobuf/o1;II)V
    .locals 1

    const/4 v0, 0x5

    invoke-static {p2, v0}, Landroidx/datastore/preferences/protobuf/s1;->c(II)I

    move-result p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Landroidx/datastore/preferences/protobuf/o1;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public v(Landroidx/datastore/preferences/protobuf/o1;IJ)V
    .locals 1

    const/4 v0, 0x1

    invoke-static {p2, v0}, Landroidx/datastore/preferences/protobuf/s1;->c(II)I

    move-result p2

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Landroidx/datastore/preferences/protobuf/o1;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public w(Landroidx/datastore/preferences/protobuf/o1;ILandroidx/datastore/preferences/protobuf/o1;)V
    .locals 1

    const/4 v0, 0x3

    invoke-static {p2, v0}, Landroidx/datastore/preferences/protobuf/s1;->c(II)I

    move-result p2

    invoke-virtual {p1, p2, p3}, Landroidx/datastore/preferences/protobuf/o1;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public x(Landroidx/datastore/preferences/protobuf/o1;ILandroidx/datastore/preferences/protobuf/g;)V
    .locals 1

    const/4 v0, 0x2

    invoke-static {p2, v0}, Landroidx/datastore/preferences/protobuf/s1;->c(II)I

    move-result p2

    invoke-virtual {p1, p2, p3}, Landroidx/datastore/preferences/protobuf/o1;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public y(Landroidx/datastore/preferences/protobuf/o1;IJ)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p2, v0}, Landroidx/datastore/preferences/protobuf/s1;->c(II)I

    move-result p2

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Landroidx/datastore/preferences/protobuf/o1;->n(ILjava/lang/Object;)V

    return-void
.end method

.method public z(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/o1;
    .locals 2

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/p1;->A(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/o1;

    move-result-object v0

    invoke-static {}, Landroidx/datastore/preferences/protobuf/o1;->c()Landroidx/datastore/preferences/protobuf/o1;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Landroidx/datastore/preferences/protobuf/o1;->k()Landroidx/datastore/preferences/protobuf/o1;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Landroidx/datastore/preferences/protobuf/p1;->G(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/o1;)V

    :cond_0
    return-object v0
.end method
