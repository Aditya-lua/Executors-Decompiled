.class public Landroidx/recyclerview/widget/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/e$b;,
        Landroidx/recyclerview/widget/e$a;
    }
.end annotation


# instance fields
.field public final a:Landroidx/recyclerview/widget/e$b;

.field public final b:Landroidx/recyclerview/widget/e$a;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public d:I

.field public e:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/e$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/recyclerview/widget/e;->d:I

    iput-object p1, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    new-instance p1, Landroidx/recyclerview/widget/e$a;

    invoke-direct {p1}, Landroidx/recyclerview/widget/e$a;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/e;->b:Landroidx/recyclerview/widget/e$a;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/e;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;IZ)V
    .locals 1

    if-gez p2, :cond_0

    iget-object p2, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    invoke-interface {p2}, Landroidx/recyclerview/widget/e$b;->c()I

    move-result p2

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/e;->h(I)I

    move-result p2

    :goto_0
    iget-object v0, p0, Landroidx/recyclerview/widget/e;->b:Landroidx/recyclerview/widget/e$a;

    invoke-virtual {v0, p2, p3}, Landroidx/recyclerview/widget/e$a;->e(IZ)V

    if-eqz p3, :cond_1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/e;->l(Landroid/view/View;)V

    :cond_1
    iget-object p3, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    invoke-interface {p3, p1, p2}, Landroidx/recyclerview/widget/e$b;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public b(Landroid/view/View;Z)V
    .locals 1

    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0, p2}, Landroidx/recyclerview/widget/e;->a(Landroid/view/View;IZ)V

    return-void
.end method

.method public c(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V
    .locals 1

    if-gez p2, :cond_0

    iget-object p2, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    invoke-interface {p2}, Landroidx/recyclerview/widget/e$b;->c()I

    move-result p2

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/e;->h(I)I

    move-result p2

    :goto_0
    iget-object v0, p0, Landroidx/recyclerview/widget/e;->b:Landroidx/recyclerview/widget/e$a;

    invoke-virtual {v0, p2, p4}, Landroidx/recyclerview/widget/e$a;->e(IZ)V

    if-eqz p4, :cond_1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/e;->l(Landroid/view/View;)V

    :cond_1
    iget-object p4, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    invoke-interface {p4, p1, p2, p3}, Landroidx/recyclerview/widget/e$b;->j(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public d(I)V
    .locals 1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/e;->h(I)I

    move-result p1

    iget-object v0, p0, Landroidx/recyclerview/widget/e;->b:Landroidx/recyclerview/widget/e$a;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/e$a;->f(I)Z

    iget-object v0, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    invoke-interface {v0, p1}, Landroidx/recyclerview/widget/e$b;->e(I)V

    return-void
.end method

.method public e(I)Landroid/view/View;
    .locals 5

    iget-object v0, p0, Landroidx/recyclerview/widget/e;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Landroidx/recyclerview/widget/e;->c:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    iget-object v3, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    invoke-interface {v3, v2}, Landroidx/recyclerview/widget/e$b;->d(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$f0;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$f0;->n()I

    move-result v4

    if-ne v4, p1, :cond_0

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$f0;->u()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$f0;->w()Z

    move-result v3

    if-nez v3, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public f(I)Landroid/view/View;
    .locals 1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/e;->h(I)I

    move-result p1

    iget-object v0, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    invoke-interface {v0, p1}, Landroidx/recyclerview/widget/e$b;->a(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public g()I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    invoke-interface {v0}, Landroidx/recyclerview/widget/e$b;->c()I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/e;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public final h(I)I
    .locals 4

    const/4 v0, -0x1

    if-gez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    invoke-interface {v1}, Landroidx/recyclerview/widget/e$b;->c()I

    move-result v1

    move v2, p1

    :goto_0
    if-ge v2, v1, :cond_3

    iget-object v3, p0, Landroidx/recyclerview/widget/e;->b:Landroidx/recyclerview/widget/e$a;

    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/e$a;->b(I)I

    move-result v3

    sub-int v3, v2, v3

    sub-int v3, p1, v3

    if-nez v3, :cond_2

    :goto_1
    iget-object p1, p0, Landroidx/recyclerview/widget/e;->b:Landroidx/recyclerview/widget/e$a;

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/e$a;->d(I)Z

    move-result p1

    if-eqz p1, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return v2

    :cond_2
    add-int/2addr v2, v3

    goto :goto_0

    :cond_3
    return v0
.end method

.method public i(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    invoke-interface {v0, p1}, Landroidx/recyclerview/widget/e$b;->a(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public j()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    invoke-interface {v0}, Landroidx/recyclerview/widget/e$b;->c()I

    move-result v0

    return v0
.end method

.method public k(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    invoke-interface {v0, p1}, Landroidx/recyclerview/widget/e$b;->g(Landroid/view/View;)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/e;->b:Landroidx/recyclerview/widget/e$a;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/e$a;->h(I)V

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/e;->l(Landroid/view/View;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "view is not a child, cannot hide "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final l(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/e;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    invoke-interface {v0, p1}, Landroidx/recyclerview/widget/e$b;->b(Landroid/view/View;)V

    return-void
.end method

.method public m(Landroid/view/View;)I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    invoke-interface {v0, p1}, Landroidx/recyclerview/widget/e$b;->g(Landroid/view/View;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/e;->b:Landroidx/recyclerview/widget/e$a;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/e$a;->d(I)Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/e;->b:Landroidx/recyclerview/widget/e$a;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/e$a;->b(I)I

    move-result v0

    sub-int/2addr p1, v0

    return p1
.end method

.method public n(Landroid/view/View;)Z
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/e;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public o()V
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/e;->b:Landroidx/recyclerview/widget/e$a;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/e$a;->g()V

    iget-object v0, p0, Landroidx/recyclerview/widget/e;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    iget-object v2, p0, Landroidx/recyclerview/widget/e;->c:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-interface {v1, v2}, Landroidx/recyclerview/widget/e$b;->h(Landroid/view/View;)V

    iget-object v1, p0, Landroidx/recyclerview/widget/e;->c:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    invoke-interface {v0}, Landroidx/recyclerview/widget/e$b;->f()V

    return-void
.end method

.method public p(Landroid/view/View;)V
    .locals 4

    iget v0, p0, Landroidx/recyclerview/widget/e;->d:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v0, 0x0

    const/4 v2, 0x0

    :try_start_0
    iput v1, p0, Landroidx/recyclerview/widget/e;->d:I

    iput-object p1, p0, Landroidx/recyclerview/widget/e;->e:Landroid/view/View;

    iget-object v1, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    invoke-interface {v1, p1}, Landroidx/recyclerview/widget/e$b;->g(Landroid/view/View;)I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gez v1, :cond_0

    :goto_0
    iput v2, p0, Landroidx/recyclerview/widget/e;->d:I

    iput-object v0, p0, Landroidx/recyclerview/widget/e;->e:Landroid/view/View;

    return-void

    :cond_0
    :try_start_1
    iget-object v3, p0, Landroidx/recyclerview/widget/e;->b:Landroidx/recyclerview/widget/e$a;

    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/e$a;->f(I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/e;->t(Landroid/view/View;)Z

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_1
    iget-object p1, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    invoke-interface {p1, v1}, Landroidx/recyclerview/widget/e$b;->i(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_2
    iput v2, p0, Landroidx/recyclerview/widget/e;->d:I

    iput-object v0, p0, Landroidx/recyclerview/widget/e;->e:Landroid/view/View;

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot call removeView(At) within removeViewIfHidden"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot call removeView(At) within removeView(At)"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public q(I)V
    .locals 4

    iget v0, p0, Landroidx/recyclerview/widget/e;->d:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v0, 0x0

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/e;->h(I)I

    move-result p1

    iget-object v3, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    invoke-interface {v3, p1}, Landroidx/recyclerview/widget/e$b;->a(I)Landroid/view/View;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_0

    :goto_0
    iput v2, p0, Landroidx/recyclerview/widget/e;->d:I

    iput-object v0, p0, Landroidx/recyclerview/widget/e;->e:Landroid/view/View;

    return-void

    :cond_0
    :try_start_1
    iput v1, p0, Landroidx/recyclerview/widget/e;->d:I

    iput-object v3, p0, Landroidx/recyclerview/widget/e;->e:Landroid/view/View;

    iget-object v1, p0, Landroidx/recyclerview/widget/e;->b:Landroidx/recyclerview/widget/e$a;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/e$a;->f(I)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/e;->t(Landroid/view/View;)Z

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_1
    iget-object v1, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    invoke-interface {v1, p1}, Landroidx/recyclerview/widget/e$b;->i(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_2
    iput v2, p0, Landroidx/recyclerview/widget/e;->d:I

    iput-object v0, p0, Landroidx/recyclerview/widget/e;->e:Landroid/view/View;

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot call removeView(At) within removeViewIfHidden"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot call removeView(At) within removeView(At)"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public r(Landroid/view/View;)Z
    .locals 4

    iget v0, p0, Landroidx/recyclerview/widget/e;->d:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/e;->e:Landroid/view/View;

    if-ne v0, p1, :cond_0

    return v1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot call removeViewIfHidden within removeView(At) for a different view"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/4 v3, 0x2

    if-eq v0, v3, :cond_4

    :try_start_0
    iput v3, p0, Landroidx/recyclerview/widget/e;->d:I

    iget-object v0, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    invoke-interface {v0, p1}, Landroidx/recyclerview/widget/e$b;->g(Landroid/view/View;)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/e;->t(Landroid/view/View;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput v1, p0, Landroidx/recyclerview/widget/e;->d:I

    return v2

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_2
    :try_start_1
    iget-object v3, p0, Landroidx/recyclerview/widget/e;->b:Landroidx/recyclerview/widget/e$a;

    invoke-virtual {v3, v0}, Landroidx/recyclerview/widget/e$a;->d(I)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Landroidx/recyclerview/widget/e;->b:Landroidx/recyclerview/widget/e$a;

    invoke-virtual {v3, v0}, Landroidx/recyclerview/widget/e$a;->f(I)Z

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/e;->t(Landroid/view/View;)Z

    iget-object p1, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    invoke-interface {p1, v0}, Landroidx/recyclerview/widget/e$b;->i(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput v1, p0, Landroidx/recyclerview/widget/e;->d:I

    return v2

    :cond_3
    iput v1, p0, Landroidx/recyclerview/widget/e;->d:I

    return v1

    :goto_0
    iput v1, p0, Landroidx/recyclerview/widget/e;->d:I

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot call removeViewIfHidden within removeViewIfHidden"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public s(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    invoke-interface {v0, p1}, Landroidx/recyclerview/widget/e$b;->g(Landroid/view/View;)I

    move-result v0

    if-ltz v0, :cond_1

    iget-object v1, p0, Landroidx/recyclerview/widget/e;->b:Landroidx/recyclerview/widget/e$a;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/e$a;->d(I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/e;->b:Landroidx/recyclerview/widget/e$a;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/e$a;->a(I)V

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/e;->t(Landroid/view/View;)Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "trying to unhide a view that was not hidden"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "view is not a child, cannot hide "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final t(Landroid/view/View;)Z
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/e;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/e;->a:Landroidx/recyclerview/widget/e$b;

    invoke-interface {v0, p1}, Landroidx/recyclerview/widget/e$b;->h(Landroid/view/View;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Landroidx/recyclerview/widget/e;->b:Landroidx/recyclerview/widget/e$a;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/e$a;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", hidden list:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/recyclerview/widget/e;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
