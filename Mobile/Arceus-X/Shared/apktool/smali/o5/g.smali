.class public Lo5/g;
.super Le4/j0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Le4/j0;-><init>()V

    return-void
.end method

.method public static synthetic C(Ljava/lang/Runnable;Lo5/q;Ljava/lang/Runnable;)V
    .locals 0

    if-nez p0, :cond_0

    invoke-virtual {p1}, Lo5/q;->cancel()V

    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public static D(Lo5/q;)Z
    .locals 1

    invoke-virtual {p0}, Lo5/q;->Q()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Le4/j0;->l(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lo5/q;->R()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Le4/j0;->l(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lo5/q;->S()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Le4/j0;->l(Ljava/util/List;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public A(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    check-cast p1, Lo5/b0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lo5/q;->T()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p1}, Lo5/q;->T()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0, p1, p2, p3}, Lo5/g;->E(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_0
    return-void
.end method

.method public B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Lo5/b0;

    invoke-direct {v0}, Lo5/b0;-><init>()V

    check-cast p1, Lo5/q;

    invoke-virtual {v0, p1}, Lo5/b0;->D0(Lo5/q;)Lo5/b0;

    return-object v0
.end method

.method public E(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/ArrayList;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .param p3    # Ljava/util/ArrayList;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    check-cast p1, Lo5/q;

    instance-of v0, p1, Lo5/b0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lo5/b0;

    invoke-virtual {p1}, Lo5/b0;->G0()I

    move-result v0

    :goto_0
    if-ge v1, v0, :cond_3

    invoke-virtual {p1, v1}, Lo5/b0;->F0(I)Lo5/q;

    move-result-object v2

    invoke-virtual {p0, v2, p2, p3}, Lo5/g;->E(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lo5/g;->D(Lo5/q;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lo5/q;->T()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ne v2, v3, :cond_3

    invoke-interface {v0, p2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_3

    if-nez p3, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_1
    if-ge v1, v0, :cond_2

    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {p1, v2}, Lo5/q;->e(Landroid/view/View;)Lo5/q;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p3

    add-int/lit8 p3, p3, -0x1

    :goto_2
    if-ltz p3, :cond_3

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p1, v0}, Lo5/q;->n0(Landroid/view/View;)Lo5/q;

    add-int/lit8 p3, p3, -0x1

    goto :goto_2

    :cond_3
    return-void
.end method

.method public a(Ljava/lang/Object;Landroid/view/View;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    check-cast p1, Lo5/q;

    invoke-virtual {p1, p2}, Lo5/q;->e(Landroid/view/View;)Lo5/q;

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Object;Ljava/util/ArrayList;)V
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/ArrayList;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    check-cast p1, Lo5/q;

    if-nez p1, :cond_0

    goto :goto_2

    :cond_0
    instance-of v0, p1, Lo5/b0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Lo5/b0;

    invoke-virtual {p1}, Lo5/b0;->G0()I

    move-result v0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p1, v1}, Lo5/b0;->F0(I)Lo5/q;

    move-result-object v2

    invoke-virtual {p0, v2, p2}, Lo5/g;->b(Ljava/lang/Object;Ljava/util/ArrayList;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lo5/g;->D(Lo5/q;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lo5/q;->T()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Le4/j0;->l(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_1
    if-ge v1, v0, :cond_2

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {p1, v2}, Lo5/q;->e(Landroid/view/View;)Lo5/q;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lo5/a0;

    invoke-interface {p1}, Lo5/a0;->c()V

    return-void
.end method

.method public d(Ljava/lang/Object;Ljava/lang/Runnable;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lo5/a0;

    invoke-interface {p1, p2}, Lo5/a0;->j(Ljava/lang/Runnable;)V

    return-void
.end method

.method public e(Landroid/view/ViewGroup;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p2, Lo5/q;

    invoke-static {p1, p2}, Lo5/y;->a(Landroid/view/ViewGroup;Lo5/q;)V

    return-void
.end method

.method public g(Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    instance-of p1, p1, Lo5/q;

    return p1
.end method

.method public h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-eqz p1, :cond_0

    check-cast p1, Lo5/q;

    invoke-virtual {p1}, Lo5/q;->r()Lo5/q;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public j(Landroid/view/ViewGroup;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p2, Lo5/q;

    invoke-static {p1, p2}, Lo5/y;->c(Landroid/view/ViewGroup;Lo5/q;)Lo5/a0;

    move-result-object p1

    return-object p1
.end method

.method public m()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public n(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    move-object v0, p1

    check-cast v0, Lo5/q;

    invoke-virtual {v0}, Lo5/q;->Y()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Predictive back not available for AndroidX Transition "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". Please enable seeking support for the designated transition by overriding isSeekingSupported()."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "FragmentManager"

    invoke-static {v1, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return v0
.end method

.method public o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lo5/q;

    check-cast p2, Lo5/q;

    check-cast p3, Lo5/q;

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    new-instance v0, Lo5/b0;

    invoke-direct {v0}, Lo5/b0;-><init>()V

    invoke-virtual {v0, p1}, Lo5/b0;->D0(Lo5/q;)Lo5/b0;

    move-result-object p1

    invoke-virtual {p1, p2}, Lo5/b0;->D0(Lo5/q;)Lo5/b0;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lo5/b0;->M0(I)Lo5/b0;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    move-object p1, p2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    if-eqz p3, :cond_4

    new-instance p2, Lo5/b0;

    invoke-direct {p2}, Lo5/b0;-><init>()V

    if-eqz p1, :cond_3

    invoke-virtual {p2, p1}, Lo5/b0;->D0(Lo5/q;)Lo5/b0;

    :cond_3
    invoke-virtual {p2, p3}, Lo5/b0;->D0(Lo5/q;)Lo5/b0;

    return-object p2

    :cond_4
    return-object p1
.end method

.method public p(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lo5/b0;

    invoke-direct {v0}, Lo5/b0;-><init>()V

    if-eqz p1, :cond_0

    check-cast p1, Lo5/q;

    invoke-virtual {v0, p1}, Lo5/b0;->D0(Lo5/q;)Lo5/b0;

    :cond_0
    if-eqz p2, :cond_1

    check-cast p2, Lo5/q;

    invoke-virtual {v0, p2}, Lo5/b0;->D0(Lo5/q;)Lo5/b0;

    :cond_1
    if-eqz p3, :cond_2

    check-cast p3, Lo5/q;

    invoke-virtual {v0, p3}, Lo5/b0;->D0(Lo5/q;)Lo5/b0;

    :cond_2
    return-object v0
.end method

.method public r(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/ArrayList;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Landroid/view/View;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    check-cast p1, Lo5/q;

    new-instance v0, Lo5/g$b;

    invoke-direct {v0, p0, p2, p3}, Lo5/g$b;-><init>(Lo5/g;Landroid/view/View;Ljava/util/ArrayList;)V

    invoke-virtual {p1, v0}, Lo5/q;->c(Lo5/q$h;)Lo5/q;

    return-void
.end method

.method public s(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V
    .locals 8
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;",
            "Ljava/lang/Object;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;",
            "Ljava/lang/Object;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    check-cast p1, Lo5/q;

    new-instance v0, Lo5/g$c;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    invoke-direct/range {v0 .. v7}, Lo5/g$c;-><init>(Lo5/g;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    invoke-virtual {p1, v0}, Lo5/q;->c(Lo5/q$h;)Lo5/q;

    return-void
.end method

.method public t(Ljava/lang/Object;F)V
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lo5/a0;

    invoke-interface {p1}, Lo5/a0;->isReady()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lo5/a0;->f()J

    move-result-wide v0

    long-to-float v0, v0

    mul-float/2addr p2, v0

    float-to-long v0, p2

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    const-wide/16 v2, 0x1

    if-nez p2, :cond_0

    move-wide v0, v2

    :cond_0
    invoke-interface {p1}, Lo5/a0;->f()J

    move-result-wide v4

    cmp-long p2, v0, v4

    if-nez p2, :cond_1

    invoke-interface {p1}, Lo5/a0;->f()J

    move-result-wide v0

    sub-long/2addr v0, v2

    :cond_1
    invoke-interface {p1, v0, v1}, Lo5/a0;->h(J)V

    :cond_2
    return-void
.end method

.method public u(Ljava/lang/Object;Landroid/graphics/Rect;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Rect;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    check-cast p1, Lo5/q;

    new-instance v0, Lo5/g$e;

    invoke-direct {v0, p0, p2}, Lo5/g$e;-><init>(Lo5/g;Landroid/graphics/Rect;)V

    invoke-virtual {p1, v0}, Lo5/q;->u0(Lo5/q$e;)V

    :cond_0
    return-void
.end method

.method public v(Ljava/lang/Object;Landroid/view/View;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-eqz p2, :cond_0

    check-cast p1, Lo5/q;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p0, p2, v0}, Le4/j0;->k(Landroid/view/View;Landroid/graphics/Rect;)V

    new-instance p2, Lo5/g$a;

    invoke-direct {p2, p0, v0}, Lo5/g$a;-><init>(Lo5/g;Landroid/graphics/Rect;)V

    invoke-virtual {p1, p2}, Lo5/q;->u0(Lo5/q$e;)V

    :cond_0
    return-void
.end method

.method public w(Landroidx/fragment/app/c;Ljava/lang/Object;Lu2/e;Ljava/lang/Runnable;)V
    .locals 6
    .param p1    # Landroidx/fragment/app/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lu2/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Runnable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lo5/g;->x(Landroidx/fragment/app/c;Ljava/lang/Object;Lu2/e;Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    return-void
.end method

.method public x(Landroidx/fragment/app/c;Ljava/lang/Object;Lu2/e;Ljava/lang/Runnable;Ljava/lang/Runnable;)V
    .locals 0
    .param p1    # Landroidx/fragment/app/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lu2/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Runnable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p2, Lo5/q;

    new-instance p1, Lo5/f;

    invoke-direct {p1, p4, p2, p5}, Lo5/f;-><init>(Ljava/lang/Runnable;Lo5/q;Ljava/lang/Runnable;)V

    invoke-virtual {p3, p1}, Lu2/e;->b(Lu2/e$a;)V

    new-instance p1, Lo5/g$d;

    invoke-direct {p1, p0, p5}, Lo5/g$d;-><init>(Lo5/g;Ljava/lang/Runnable;)V

    invoke-virtual {p2, p1}, Lo5/q;->c(Lo5/q$h;)Lo5/q;

    return-void
.end method

.method public z(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/ArrayList;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Landroid/view/View;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    check-cast p1, Lo5/b0;

    invoke-virtual {p1}, Lo5/q;->T()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-static {v0, v3}, Le4/j0;->f(Ljava/util/List;Landroid/view/View;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p1, p3}, Lo5/g;->b(Ljava/lang/Object;Ljava/util/ArrayList;)V

    return-void
.end method
