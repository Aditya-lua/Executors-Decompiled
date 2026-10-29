.class public Landroidx/recyclerview/widget/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/u$a;,
        Landroidx/recyclerview/widget/u$b;
    }
.end annotation


# instance fields
.field public final a:Lw1/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw1/j<",
            "Landroidx/recyclerview/widget/RecyclerView$f0;",
            "Landroidx/recyclerview/widget/u$a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lw1/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw1/g<",
            "Landroidx/recyclerview/widget/RecyclerView$f0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lw1/j;

    invoke-direct {v0}, Lw1/j;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/u;->a:Lw1/j;

    new-instance v0, Lw1/g;

    invoke-direct {v0}, Lw1/g;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/u;->b:Lw1/g;

    return-void
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/RecyclerView$f0;Landroidx/recyclerview/widget/RecyclerView$n$c;)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/u;->a:Lw1/j;

    invoke-virtual {v0, p1}, Lw1/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/u$a;

    if-nez v0, :cond_0

    invoke-static {}, Landroidx/recyclerview/widget/u$a;->b()Landroidx/recyclerview/widget/u$a;

    move-result-object v0

    iget-object v1, p0, Landroidx/recyclerview/widget/u;->a:Lw1/j;

    invoke-virtual {v1, p1, v0}, Lw1/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget p1, v0, Landroidx/recyclerview/widget/u$a;->a:I

    or-int/lit8 p1, p1, 0x2

    iput p1, v0, Landroidx/recyclerview/widget/u$a;->a:I

    iput-object p2, v0, Landroidx/recyclerview/widget/u$a;->b:Landroidx/recyclerview/widget/RecyclerView$n$c;

    return-void
.end method

.method public b(Landroidx/recyclerview/widget/RecyclerView$f0;)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/u;->a:Lw1/j;

    invoke-virtual {v0, p1}, Lw1/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/u$a;

    if-nez v0, :cond_0

    invoke-static {}, Landroidx/recyclerview/widget/u$a;->b()Landroidx/recyclerview/widget/u$a;

    move-result-object v0

    iget-object v1, p0, Landroidx/recyclerview/widget/u;->a:Lw1/j;

    invoke-virtual {v1, p1, v0}, Lw1/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget p1, v0, Landroidx/recyclerview/widget/u$a;->a:I

    or-int/lit8 p1, p1, 0x1

    iput p1, v0, Landroidx/recyclerview/widget/u$a;->a:I

    return-void
.end method

.method public c(JLandroidx/recyclerview/widget/RecyclerView$f0;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u;->b:Lw1/g;

    invoke-virtual {v0, p1, p2, p3}, Lw1/g;->i(JLjava/lang/Object;)V

    return-void
.end method

.method public d(Landroidx/recyclerview/widget/RecyclerView$f0;Landroidx/recyclerview/widget/RecyclerView$n$c;)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/u;->a:Lw1/j;

    invoke-virtual {v0, p1}, Lw1/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/u$a;

    if-nez v0, :cond_0

    invoke-static {}, Landroidx/recyclerview/widget/u$a;->b()Landroidx/recyclerview/widget/u$a;

    move-result-object v0

    iget-object v1, p0, Landroidx/recyclerview/widget/u;->a:Lw1/j;

    invoke-virtual {v1, p1, v0}, Lw1/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iput-object p2, v0, Landroidx/recyclerview/widget/u$a;->c:Landroidx/recyclerview/widget/RecyclerView$n$c;

    iget p1, v0, Landroidx/recyclerview/widget/u$a;->a:I

    or-int/lit8 p1, p1, 0x8

    iput p1, v0, Landroidx/recyclerview/widget/u$a;->a:I

    return-void
.end method

.method public e(Landroidx/recyclerview/widget/RecyclerView$f0;Landroidx/recyclerview/widget/RecyclerView$n$c;)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/u;->a:Lw1/j;

    invoke-virtual {v0, p1}, Lw1/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/u$a;

    if-nez v0, :cond_0

    invoke-static {}, Landroidx/recyclerview/widget/u$a;->b()Landroidx/recyclerview/widget/u$a;

    move-result-object v0

    iget-object v1, p0, Landroidx/recyclerview/widget/u;->a:Lw1/j;

    invoke-virtual {v1, p1, v0}, Lw1/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iput-object p2, v0, Landroidx/recyclerview/widget/u$a;->b:Landroidx/recyclerview/widget/RecyclerView$n$c;

    iget p1, v0, Landroidx/recyclerview/widget/u$a;->a:I

    or-int/lit8 p1, p1, 0x4

    iput p1, v0, Landroidx/recyclerview/widget/u$a;->a:I

    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u;->a:Lw1/j;

    invoke-virtual {v0}, Lw1/j;->clear()V

    iget-object v0, p0, Landroidx/recyclerview/widget/u;->b:Lw1/g;

    invoke-virtual {v0}, Lw1/g;->a()V

    return-void
.end method

.method public g(J)Landroidx/recyclerview/widget/RecyclerView$f0;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u;->b:Lw1/g;

    invoke-virtual {v0, p1, p2}, Lw1/g;->e(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$f0;

    return-object p1
.end method

.method public h(Landroidx/recyclerview/widget/RecyclerView$f0;)Z
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u;->a:Lw1/j;

    invoke-virtual {v0, p1}, Lw1/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/u$a;

    if-eqz p1, :cond_0

    iget p1, p1, Landroidx/recyclerview/widget/u$a;->a:I

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public i(Landroidx/recyclerview/widget/RecyclerView$f0;)Z
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u;->a:Lw1/j;

    invoke-virtual {v0, p1}, Lw1/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/u$a;

    if-eqz p1, :cond_0

    iget p1, p1, Landroidx/recyclerview/widget/u$a;->a:I

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public j()V
    .locals 0

    invoke-static {}, Landroidx/recyclerview/widget/u$a;->a()V

    return-void
.end method

.method public k(Landroidx/recyclerview/widget/RecyclerView$f0;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/u;->p(Landroidx/recyclerview/widget/RecyclerView$f0;)V

    return-void
.end method

.method public final l(Landroidx/recyclerview/widget/RecyclerView$f0;I)Landroidx/recyclerview/widget/RecyclerView$n$c;
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/u;->a:Lw1/j;

    invoke-virtual {v0, p1}, Lw1/j;->d(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, 0x0

    if-gez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/u;->a:Lw1/j;

    invoke-virtual {v1, p1}, Lw1/j;->k(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/u$a;

    if-eqz v1, :cond_4

    iget v2, v1, Landroidx/recyclerview/widget/u$a;->a:I

    and-int v3, v2, p2

    if-eqz v3, :cond_4

    not-int v0, p2

    and-int/2addr v0, v2

    iput v0, v1, Landroidx/recyclerview/widget/u$a;->a:I

    const/4 v2, 0x4

    if-ne p2, v2, :cond_1

    iget-object p2, v1, Landroidx/recyclerview/widget/u$a;->b:Landroidx/recyclerview/widget/RecyclerView$n$c;

    goto :goto_0

    :cond_1
    const/16 v2, 0x8

    if-ne p2, v2, :cond_3

    iget-object p2, v1, Landroidx/recyclerview/widget/u$a;->c:Landroidx/recyclerview/widget/RecyclerView$n$c;

    :goto_0
    and-int/lit8 v0, v0, 0xc

    if-nez v0, :cond_2

    iget-object v0, p0, Landroidx/recyclerview/widget/u;->a:Lw1/j;

    invoke-virtual {v0, p1}, Lw1/j;->i(I)Ljava/lang/Object;

    invoke-static {v1}, Landroidx/recyclerview/widget/u$a;->c(Landroidx/recyclerview/widget/u$a;)V

    :cond_2
    return-object p2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must provide flag PRE or POST"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-object v0
.end method

.method public m(Landroidx/recyclerview/widget/RecyclerView$f0;)Landroidx/recyclerview/widget/RecyclerView$n$c;
    .locals 1

    const/16 v0, 0x8

    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/u;->l(Landroidx/recyclerview/widget/RecyclerView$f0;I)Landroidx/recyclerview/widget/RecyclerView$n$c;

    move-result-object p1

    return-object p1
.end method

.method public n(Landroidx/recyclerview/widget/RecyclerView$f0;)Landroidx/recyclerview/widget/RecyclerView$n$c;
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/u;->l(Landroidx/recyclerview/widget/RecyclerView$f0;I)Landroidx/recyclerview/widget/RecyclerView$n$c;

    move-result-object p1

    return-object p1
.end method

.method public o(Landroidx/recyclerview/widget/u$b;)V
    .locals 6

    iget-object v0, p0, Landroidx/recyclerview/widget/u;->a:Lw1/j;

    invoke-virtual {v0}, Lw1/j;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_7

    iget-object v1, p0, Landroidx/recyclerview/widget/u;->a:Lw1/j;

    invoke-virtual {v1, v0}, Lw1/j;->f(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$f0;

    iget-object v2, p0, Landroidx/recyclerview/widget/u;->a:Lw1/j;

    invoke-virtual {v2, v0}, Lw1/j;->i(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/u$a;

    iget v3, v2, Landroidx/recyclerview/widget/u$a;->a:I

    and-int/lit8 v4, v3, 0x3

    const/4 v5, 0x3

    if-ne v4, v5, :cond_0

    invoke-interface {p1, v1}, Landroidx/recyclerview/widget/u$b;->b(Landroidx/recyclerview/widget/RecyclerView$f0;)V

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v3, 0x1

    if-eqz v4, :cond_2

    iget-object v3, v2, Landroidx/recyclerview/widget/u$a;->b:Landroidx/recyclerview/widget/RecyclerView$n$c;

    if-nez v3, :cond_1

    invoke-interface {p1, v1}, Landroidx/recyclerview/widget/u$b;->b(Landroidx/recyclerview/widget/RecyclerView$f0;)V

    goto :goto_1

    :cond_1
    iget-object v4, v2, Landroidx/recyclerview/widget/u$a;->c:Landroidx/recyclerview/widget/RecyclerView$n$c;

    invoke-interface {p1, v1, v3, v4}, Landroidx/recyclerview/widget/u$b;->c(Landroidx/recyclerview/widget/RecyclerView$f0;Landroidx/recyclerview/widget/RecyclerView$n$c;Landroidx/recyclerview/widget/RecyclerView$n$c;)V

    goto :goto_1

    :cond_2
    and-int/lit8 v4, v3, 0xe

    const/16 v5, 0xe

    if-ne v4, v5, :cond_3

    iget-object v3, v2, Landroidx/recyclerview/widget/u$a;->b:Landroidx/recyclerview/widget/RecyclerView$n$c;

    iget-object v4, v2, Landroidx/recyclerview/widget/u$a;->c:Landroidx/recyclerview/widget/RecyclerView$n$c;

    invoke-interface {p1, v1, v3, v4}, Landroidx/recyclerview/widget/u$b;->a(Landroidx/recyclerview/widget/RecyclerView$f0;Landroidx/recyclerview/widget/RecyclerView$n$c;Landroidx/recyclerview/widget/RecyclerView$n$c;)V

    goto :goto_1

    :cond_3
    and-int/lit8 v4, v3, 0xc

    const/16 v5, 0xc

    if-ne v4, v5, :cond_4

    iget-object v3, v2, Landroidx/recyclerview/widget/u$a;->b:Landroidx/recyclerview/widget/RecyclerView$n$c;

    iget-object v4, v2, Landroidx/recyclerview/widget/u$a;->c:Landroidx/recyclerview/widget/RecyclerView$n$c;

    invoke-interface {p1, v1, v3, v4}, Landroidx/recyclerview/widget/u$b;->d(Landroidx/recyclerview/widget/RecyclerView$f0;Landroidx/recyclerview/widget/RecyclerView$n$c;Landroidx/recyclerview/widget/RecyclerView$n$c;)V

    goto :goto_1

    :cond_4
    and-int/lit8 v4, v3, 0x4

    if-eqz v4, :cond_5

    iget-object v3, v2, Landroidx/recyclerview/widget/u$a;->b:Landroidx/recyclerview/widget/RecyclerView$n$c;

    const/4 v4, 0x0

    invoke-interface {p1, v1, v3, v4}, Landroidx/recyclerview/widget/u$b;->c(Landroidx/recyclerview/widget/RecyclerView$f0;Landroidx/recyclerview/widget/RecyclerView$n$c;Landroidx/recyclerview/widget/RecyclerView$n$c;)V

    goto :goto_1

    :cond_5
    and-int/lit8 v3, v3, 0x8

    if-eqz v3, :cond_6

    iget-object v3, v2, Landroidx/recyclerview/widget/u$a;->b:Landroidx/recyclerview/widget/RecyclerView$n$c;

    iget-object v4, v2, Landroidx/recyclerview/widget/u$a;->c:Landroidx/recyclerview/widget/RecyclerView$n$c;

    invoke-interface {p1, v1, v3, v4}, Landroidx/recyclerview/widget/u$b;->a(Landroidx/recyclerview/widget/RecyclerView$f0;Landroidx/recyclerview/widget/RecyclerView$n$c;Landroidx/recyclerview/widget/RecyclerView$n$c;)V

    :cond_6
    :goto_1
    invoke-static {v2}, Landroidx/recyclerview/widget/u$a;->c(Landroidx/recyclerview/widget/u$a;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_7
    return-void
.end method

.method public p(Landroidx/recyclerview/widget/RecyclerView$f0;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u;->a:Lw1/j;

    invoke-virtual {v0, p1}, Lw1/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/u$a;

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget v0, p1, Landroidx/recyclerview/widget/u$a;->a:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p1, Landroidx/recyclerview/widget/u$a;->a:I

    return-void
.end method

.method public q(Landroidx/recyclerview/widget/RecyclerView$f0;)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/u;->b:Lw1/g;

    invoke-virtual {v0}, Lw1/g;->n()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, Landroidx/recyclerview/widget/u;->b:Lw1/g;

    invoke-virtual {v1, v0}, Lw1/g;->o(I)Ljava/lang/Object;

    move-result-object v1

    if-ne p1, v1, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/u;->b:Lw1/g;

    invoke-virtual {v1, v0}, Lw1/g;->k(I)V

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v0, p0, Landroidx/recyclerview/widget/u;->a:Lw1/j;

    invoke-virtual {v0, p1}, Lw1/j;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/u$a;

    if-eqz p1, :cond_2

    invoke-static {p1}, Landroidx/recyclerview/widget/u$a;->c(Landroidx/recyclerview/widget/u$a;)V

    :cond_2
    return-void
.end method
