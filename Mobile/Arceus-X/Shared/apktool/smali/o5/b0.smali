.class public Lo5/b0;
.super Lo5/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo5/b0$c;
    }
.end annotation


# instance fields
.field public Q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lo5/q;",
            ">;"
        }
    .end annotation
.end field

.field public R:Z

.field public S:I

.field public T:Z

.field public U:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lo5/q;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo5/b0;->R:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo5/b0;->T:Z

    iput v0, p0, Lo5/b0;->U:I

    return-void
.end method


# virtual methods
.method public A0(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    invoke-super {p0, p1}, Lo5/q;->A0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo5/q;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lo5/q;->A0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public B0(Lo5/q$h;)Lo5/b0;
    .locals 0
    .param p1    # Lo5/q$h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-super {p0, p1}, Lo5/q;->c(Lo5/q$h;)Lo5/q;

    move-result-object p1

    check-cast p1, Lo5/b0;

    return-object p1
.end method

.method public C0(Landroid/view/View;)Lo5/b0;
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo5/q;

    invoke-virtual {v1, p1}, Lo5/q;->e(Landroid/view/View;)Lo5/q;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lo5/q;->e(Landroid/view/View;)Lo5/q;

    move-result-object p1

    check-cast p1, Lo5/b0;

    return-object p1
.end method

.method public D0(Lo5/q;)Lo5/b0;
    .locals 4
    .param p1    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Lo5/b0;->E0(Lo5/q;)V

    iget-wide v0, p0, Lo5/q;->c:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_0

    invoke-virtual {p1, v0, v1}, Lo5/q;->t0(J)Lo5/q;

    :cond_0
    iget v0, p0, Lo5/b0;->U:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lo5/q;->D()Landroid/animation/TimeInterpolator;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo5/q;->v0(Landroid/animation/TimeInterpolator;)Lo5/q;

    :cond_1
    iget v0, p0, Lo5/b0;->U:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lo5/q;->K()Lo5/z;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo5/q;->x0(Lo5/z;)V

    :cond_2
    iget v0, p0, Lo5/b0;->U:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lo5/q;->J()Lo5/k;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo5/q;->w0(Lo5/k;)V

    :cond_3
    iget v0, p0, Lo5/b0;->U:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lo5/q;->C()Lo5/q$e;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo5/q;->u0(Lo5/q$e;)V

    :cond_4
    return-object p0
.end method

.method public final E0(Lo5/q;)V
    .locals 1
    .param p1    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object p0, p1, Lo5/q;->r:Lo5/b0;

    return-void
.end method

.method public F0(I)Lo5/q;
    .locals 1

    if-ltz p1, :cond_1

    iget-object v0, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo5/q;

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public G0()I
    .locals 1

    iget-object v0, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final H0(J)I
    .locals 4

    const/4 v0, 0x1

    move v1, v0

    :goto_0
    iget-object v2, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo5/q;

    iget-wide v2, v2, Lo5/q;->L:J

    cmp-long v2, v2, p1

    if-lez v2, :cond_0

    sub-int/2addr v1, v0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v0

    return p1
.end method

.method public I0(Lo5/q$h;)Lo5/b0;
    .locals 0
    .param p1    # Lo5/q$h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-super {p0, p1}, Lo5/q;->m0(Lo5/q$h;)Lo5/q;

    move-result-object p1

    check-cast p1, Lo5/b0;

    return-object p1
.end method

.method public J0(Landroid/view/View;)Lo5/b0;
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo5/q;

    invoke-virtual {v1, p1}, Lo5/q;->n0(Landroid/view/View;)Lo5/q;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lo5/q;->n0(Landroid/view/View;)Lo5/q;

    move-result-object p1

    check-cast p1, Lo5/b0;

    return-object p1
.end method

.method public K0(J)Lo5/b0;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-super {p0, p1, p2}, Lo5/q;->t0(J)Lo5/q;

    iget-wide v0, p0, Lo5/q;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    iget-object v0, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo5/q;

    invoke-virtual {v2, p1, p2}, Lo5/q;->t0(J)Lo5/q;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public L0(Landroid/animation/TimeInterpolator;)Lo5/b0;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget v0, p0, Lo5/b0;->U:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo5/b0;->U:I

    iget-object v0, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo5/q;

    invoke-virtual {v2, p1}, Lo5/q;->v0(Landroid/animation/TimeInterpolator;)Lo5/q;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lo5/q;->v0(Landroid/animation/TimeInterpolator;)Lo5/q;

    move-result-object p1

    check-cast p1, Lo5/b0;

    return-object p1
.end method

.method public M0(I)Lo5/b0;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lo5/b0;->R:Z

    return-object p0

    :cond_0
    new-instance v0, Landroid/util/AndroidRuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid parameter for TransitionSet ordering: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput-boolean v0, p0, Lo5/b0;->R:Z

    return-object p0
.end method

.method public N0(J)Lo5/b0;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-super {p0, p1, p2}, Lo5/q;->y0(J)Lo5/q;

    move-result-object p1

    check-cast p1, Lo5/b0;

    return-object p1
.end method

.method public final O0()V
    .locals 5

    new-instance v0, Lo5/b0$c;

    invoke-direct {v0, p0}, Lo5/b0$c;-><init>(Lo5/b0;)V

    iget-object v1, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    check-cast v4, Lo5/q;

    invoke-virtual {v4, v0}, Lo5/q;->c(Lo5/q$h;)Lo5/q;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Lo5/b0;->S:I

    return-void
.end method

.method public X()Z
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo5/q;

    invoke-virtual {v2}, Lo5/q;->X()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public Y()Z
    .locals 4

    iget-object v0, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo5/q;

    invoke-virtual {v3}, Lo5/q;->Y()Z

    move-result v3

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic c(Lo5/q$h;)Lo5/q;
    .locals 0
    .param p1    # Lo5/q$h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Lo5/b0;->B0(Lo5/q$h;)Lo5/b0;

    move-result-object p1

    return-object p1
.end method

.method public cancel()V
    .locals 3

    invoke-super {p0}, Lo5/q;->cancel()V

    iget-object v0, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo5/q;

    invoke-virtual {v2}, Lo5/q;->cancel()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Lo5/b0;->r()Lo5/q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e(Landroid/view/View;)Lo5/q;
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Lo5/b0;->C0(Landroid/view/View;)Lo5/b0;

    move-result-object p1

    return-object p1
.end method

.method public j(Lo5/d0;)V
    .locals 5
    .param p1    # Lo5/d0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p1, Lo5/d0;->b:Landroid/view/View;

    invoke-virtual {p0, v0}, Lo5/q;->a0(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :cond_0
    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    check-cast v3, Lo5/q;

    iget-object v4, p1, Lo5/d0;->b:Landroid/view/View;

    invoke-virtual {v3, v4}, Lo5/q;->a0(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3, p1}, Lo5/q;->j(Lo5/d0;)V

    iget-object v4, p1, Lo5/d0;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public j0(Landroid/view/View;)V
    .locals 3

    invoke-super {p0, p1}, Lo5/q;->j0(Landroid/view/View;)V

    iget-object v0, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo5/q;

    invoke-virtual {v2, p1}, Lo5/q;->j0(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public l0()V
    .locals 7

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo5/q;->J:J

    new-instance v0, Lo5/b0$b;

    invoke-direct {v0, p0}, Lo5/b0$b;-><init>(Lo5/b0;)V

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo5/q;

    invoke-virtual {v2, v0}, Lo5/q;->c(Lo5/q$h;)Lo5/q;

    invoke-virtual {v2}, Lo5/q;->l0()V

    invoke-virtual {v2}, Lo5/q;->U()J

    move-result-wide v3

    iget-boolean v5, p0, Lo5/b0;->R:Z

    if-eqz v5, :cond_0

    iget-wide v5, p0, Lo5/q;->J:J

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iput-wide v2, p0, Lo5/q;->J:J

    goto :goto_1

    :cond_0
    iget-wide v5, p0, Lo5/q;->J:J

    iput-wide v5, v2, Lo5/q;->L:J

    add-long/2addr v5, v3

    iput-wide v5, p0, Lo5/q;->J:J

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public bridge synthetic m0(Lo5/q$h;)Lo5/q;
    .locals 0
    .param p1    # Lo5/q$h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Lo5/b0;->I0(Lo5/q$h;)Lo5/b0;

    move-result-object p1

    return-object p1
.end method

.method public n(Lo5/d0;)V
    .locals 3

    invoke-super {p0, p1}, Lo5/q;->n(Lo5/d0;)V

    iget-object v0, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo5/q;

    invoke-virtual {v2, p1}, Lo5/q;->n(Lo5/d0;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic n0(Landroid/view/View;)Lo5/q;
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Lo5/b0;->J0(Landroid/view/View;)Lo5/b0;

    move-result-object p1

    return-object p1
.end method

.method public o(Lo5/d0;)V
    .locals 5
    .param p1    # Lo5/d0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p1, Lo5/d0;->b:Landroid/view/View;

    invoke-virtual {p0, v0}, Lo5/q;->a0(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :cond_0
    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    check-cast v3, Lo5/q;

    iget-object v4, p1, Lo5/d0;->b:Landroid/view/View;

    invoke-virtual {v3, v4}, Lo5/q;->a0(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3, p1}, Lo5/q;->o(Lo5/d0;)V

    iget-object v4, p1, Lo5/d0;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public o0(Landroid/view/View;)V
    .locals 3

    invoke-super {p0, p1}, Lo5/q;->o0(Landroid/view/View;)V

    iget-object v0, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo5/q;

    invoke-virtual {v2, p1}, Lo5/q;->o0(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public q0()V
    .locals 5

    iget-object v0, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lo5/q;->z0()V

    invoke-virtual {p0}, Lo5/q;->w()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lo5/b0;->O0()V

    iget-boolean v0, p0, Lo5/b0;->R:Z

    const/4 v1, 0x0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    iget-object v2, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    add-int/lit8 v3, v0, -0x1

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo5/q;

    iget-object v3, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo5/q;

    new-instance v4, Lo5/b0$a;

    invoke-direct {v4, p0, v3}, Lo5/b0$a;-><init>(Lo5/b0;Lo5/q;)V

    invoke-virtual {v2, v4}, Lo5/q;->c(Lo5/q$h;)Lo5/q;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo5/q;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lo5/q;->q0()V

    return-void

    :cond_2
    iget-object v0, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    :goto_1
    if-ge v1, v2, :cond_3

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v1, v1, 0x1

    check-cast v3, Lo5/q;

    invoke-virtual {v3}, Lo5/q;->q0()V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public r()Lo5/q;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-super {p0}, Lo5/q;->r()Lo5/q;

    move-result-object v0

    check-cast v0, Lo5/b0;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lo5/b0;->Q:Ljava/util/ArrayList;

    iget-object v1, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    iget-object v3, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo5/q;

    invoke-virtual {v3}, Lo5/q;->r()Lo5/q;

    move-result-object v3

    invoke-virtual {v0, v3}, Lo5/b0;->E0(Lo5/q;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public r0(Z)V
    .locals 3

    invoke-super {p0, p1}, Lo5/q;->r0(Z)V

    iget-object v0, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo5/q;

    invoke-virtual {v2, p1}, Lo5/q;->r0(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public s0(JJ)V
    .locals 19

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    invoke-virtual {v0}, Lo5/q;->U()J

    move-result-wide v5

    iget-object v7, v0, Lo5/q;->r:Lo5/b0;

    const-wide/16 v8, 0x0

    if-eqz v7, :cond_1

    cmp-long v7, v1, v8

    if-gez v7, :cond_0

    cmp-long v7, v3, v8

    if-ltz v7, :cond_f

    :cond_0
    cmp-long v7, v1, v5

    if-lez v7, :cond_1

    cmp-long v7, v3, v5

    if-lez v7, :cond_1

    goto/16 :goto_5

    :cond_1
    cmp-long v7, v1, v3

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-gez v7, :cond_2

    move v12, v11

    goto :goto_0

    :cond_2
    move v12, v10

    :goto_0
    cmp-long v13, v1, v8

    if-ltz v13, :cond_3

    cmp-long v14, v3, v8

    if-ltz v14, :cond_4

    :cond_3
    cmp-long v14, v1, v5

    if-gtz v14, :cond_5

    cmp-long v14, v3, v5

    if-lez v14, :cond_5

    :cond_4
    iput-boolean v10, v0, Lo5/q;->B:Z

    sget-object v14, Lo5/q$i;->a:Lo5/q$i;

    invoke-virtual {v0, v14, v12}, Lo5/q;->i0(Lo5/q$i;Z)V

    :cond_5
    iget-boolean v14, v0, Lo5/b0;->R:Z

    if-eqz v14, :cond_7

    :goto_1
    iget-object v7, v0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v10, v7, :cond_6

    iget-object v7, v0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lo5/q;

    invoke-virtual {v7, v1, v2, v3, v4}, Lo5/q;->s0(JJ)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_6
    move-wide/from16 v16, v8

    goto :goto_4

    :cond_7
    invoke-virtual {v0, v3, v4}, Lo5/b0;->H0(J)I

    move-result v10

    if-ltz v7, :cond_9

    :goto_2
    iget-object v7, v0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v10, v7, :cond_6

    iget-object v7, v0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lo5/q;

    iget-wide v14, v7, Lo5/q;->L:J

    move-wide/from16 v16, v8

    sub-long v8, v1, v14

    cmp-long v18, v8, v16

    if-gez v18, :cond_8

    goto :goto_4

    :cond_8
    sub-long v14, v3, v14

    invoke-virtual {v7, v8, v9, v14, v15}, Lo5/q;->s0(JJ)V

    add-int/lit8 v10, v10, 0x1

    move-wide/from16 v8, v16

    goto :goto_2

    :cond_9
    move-wide/from16 v16, v8

    :goto_3
    if-ltz v10, :cond_b

    iget-object v7, v0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lo5/q;

    iget-wide v8, v7, Lo5/q;->L:J

    sub-long v14, v1, v8

    sub-long v8, v3, v8

    invoke-virtual {v7, v14, v15, v8, v9}, Lo5/q;->s0(JJ)V

    cmp-long v7, v14, v16

    if-ltz v7, :cond_a

    goto :goto_4

    :cond_a
    add-int/lit8 v10, v10, -0x1

    goto :goto_3

    :cond_b
    :goto_4
    iget-object v7, v0, Lo5/q;->r:Lo5/b0;

    if-eqz v7, :cond_f

    cmp-long v1, v1, v5

    if-lez v1, :cond_c

    cmp-long v2, v3, v5

    if-lez v2, :cond_d

    :cond_c
    if-gez v13, :cond_f

    cmp-long v2, v3, v16

    if-ltz v2, :cond_f

    :cond_d
    if-lez v1, :cond_e

    iput-boolean v11, v0, Lo5/q;->B:Z

    :cond_e
    sget-object v1, Lo5/q$i;->b:Lo5/q$i;

    invoke-virtual {v0, v1, v12}, Lo5/q;->i0(Lo5/q$i;Z)V

    :cond_f
    :goto_5
    return-void
.end method

.method public t(Landroid/view/ViewGroup;Lo5/e0;Lo5/e0;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 11
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lo5/e0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lo5/e0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/ArrayList;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Ljava/util/ArrayList;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Lo5/e0;",
            "Lo5/e0;",
            "Ljava/util/ArrayList<",
            "Lo5/d0;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lo5/d0;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lo5/q;->P()J

    move-result-wide v0

    iget-object v2, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    iget-object v4, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lo5/q;

    const-wide/16 v6, 0x0

    cmp-long v4, v0, v6

    if-lez v4, :cond_0

    iget-boolean v4, p0, Lo5/b0;->R:Z

    if-nez v4, :cond_1

    if-nez v3, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    move-object v9, p4

    move-object/from16 v10, p5

    goto :goto_3

    :cond_1
    :goto_2
    invoke-virtual {v5}, Lo5/q;->P()J

    move-result-wide v8

    cmp-long v4, v8, v6

    if-lez v4, :cond_2

    add-long/2addr v8, v0

    invoke-virtual {v5, v8, v9}, Lo5/q;->y0(J)Lo5/q;

    goto :goto_1

    :cond_2
    invoke-virtual {v5, v0, v1}, Lo5/q;->y0(J)Lo5/q;

    goto :goto_1

    :goto_3
    invoke-virtual/range {v5 .. v10}, Lo5/q;->t(Landroid/view/ViewGroup;Lo5/e0;Lo5/e0;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public bridge synthetic t0(J)Lo5/q;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lo5/b0;->K0(J)Lo5/b0;

    move-result-object p1

    return-object p1
.end method

.method public u0(Lo5/q$e;)V
    .locals 3

    invoke-super {p0, p1}, Lo5/q;->u0(Lo5/q$e;)V

    iget v0, p0, Lo5/b0;->U:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lo5/b0;->U:I

    iget-object v0, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo5/q;

    invoke-virtual {v2, p1}, Lo5/q;->u0(Lo5/q$e;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic v0(Landroid/animation/TimeInterpolator;)Lo5/q;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Lo5/b0;->L0(Landroid/animation/TimeInterpolator;)Lo5/b0;

    move-result-object p1

    return-object p1
.end method

.method public w0(Lo5/k;)V
    .locals 2

    invoke-super {p0, p1}, Lo5/q;->w0(Lo5/k;)V

    iget v0, p0, Lo5/b0;->U:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lo5/b0;->U:I

    iget-object v0, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo5/q;

    invoke-virtual {v1, p1}, Lo5/q;->w0(Lo5/k;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public x(Landroid/view/ViewGroup;)V
    .locals 3

    invoke-super {p0, p1}, Lo5/q;->x(Landroid/view/ViewGroup;)V

    iget-object v0, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo5/q;

    invoke-virtual {v2, p1}, Lo5/q;->x(Landroid/view/ViewGroup;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public x0(Lo5/z;)V
    .locals 3

    invoke-super {p0, p1}, Lo5/q;->x0(Lo5/z;)V

    iget v0, p0, Lo5/b0;->U:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo5/b0;->U:I

    iget-object v0, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lo5/b0;->Q:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo5/q;

    invoke-virtual {v2, p1}, Lo5/q;->x0(Lo5/z;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic y0(J)Lo5/q;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1, p2}, Lo5/b0;->N0(J)Lo5/b0;

    move-result-object p1

    return-object p1
.end method
