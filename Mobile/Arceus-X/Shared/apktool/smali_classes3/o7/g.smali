.class public Lo7/g;
.super Lo7/b;
.source "SourceFile"


# instance fields
.field public final E:Lh7/d;

.field public final F:Lo7/c;

.field public G:Li7/c;


# direct methods
.method public constructor <init>(Lf7/h0;Lo7/e;Lo7/c;Lf7/i;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lo7/b;-><init>(Lf7/h0;Lo7/e;)V

    iput-object p3, p0, Lo7/g;->F:Lo7/c;

    new-instance p3, Ln7/q;

    invoke-virtual {p2}, Lo7/e;->o()Ljava/util/List;

    move-result-object p2

    const/4 v0, 0x0

    const-string v1, "__container"

    invoke-direct {p3, v1, p2, v0}, Ln7/q;-><init>(Ljava/lang/String;Ljava/util/List;Z)V

    new-instance p2, Lh7/d;

    invoke-direct {p2, p1, p0, p3, p4}, Lh7/d;-><init>(Lf7/h0;Lo7/b;Ln7/q;Lf7/i;)V

    iput-object p2, p0, Lo7/g;->E:Lh7/d;

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-virtual {p2, p1, p1}, Lh7/d;->b(Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {p0}, Lo7/b;->z()Lq7/j;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance p1, Li7/c;

    invoke-virtual {p0}, Lo7/b;->z()Lq7/j;

    move-result-object p2

    invoke-direct {p1, p0, p0, p2}, Li7/c;-><init>(Li7/a$b;Lo7/b;Lq7/j;)V

    iput-object p1, p0, Lo7/g;->G:Li7/c;

    :cond_0
    return-void
.end method


# virtual methods
.method public I(Ll7/e;ILjava/util/List;Ll7/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll7/e;",
            "I",
            "Ljava/util/List<",
            "Ll7/e;",
            ">;",
            "Ll7/e;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lo7/g;->E:Lh7/d;

    invoke-virtual {v0, p1, p2, p3, p4}, Lh7/d;->h(Ll7/e;ILjava/util/List;Ll7/e;)V

    return-void
.end method

.method public c(Ljava/lang/Object;Lt7/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lt7/c<",
            "TT;>;)V"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lo7/b;->c(Ljava/lang/Object;Lt7/c;)V

    sget-object v0, Lf7/o0;->e:Ljava/lang/Integer;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lo7/g;->G:Li7/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, Li7/c;->c(Lt7/c;)V

    return-void

    :cond_0
    sget-object v0, Lf7/o0;->G:Ljava/lang/Float;

    if-ne p1, v0, :cond_1

    iget-object v0, p0, Lo7/g;->G:Li7/c;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p2}, Li7/c;->f(Lt7/c;)V

    return-void

    :cond_1
    sget-object v0, Lf7/o0;->H:Ljava/lang/Float;

    if-ne p1, v0, :cond_2

    iget-object v0, p0, Lo7/g;->G:Li7/c;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p2}, Li7/c;->d(Lt7/c;)V

    return-void

    :cond_2
    sget-object v0, Lf7/o0;->I:Ljava/lang/Float;

    if-ne p1, v0, :cond_3

    iget-object v0, p0, Lo7/g;->G:Li7/c;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p2}, Li7/c;->e(Lt7/c;)V

    return-void

    :cond_3
    sget-object v0, Lf7/o0;->J:Ljava/lang/Float;

    if-ne p1, v0, :cond_4

    iget-object p1, p0, Lo7/g;->G:Li7/c;

    if-eqz p1, :cond_4

    invoke-virtual {p1, p2}, Li7/c;->g(Lt7/c;)V

    :cond_4
    return-void
.end method

.method public e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lo7/b;->e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object p2, p0, Lo7/g;->E:Lh7/d;

    iget-object v0, p0, Lo7/b;->o:Landroid/graphics/Matrix;

    invoke-virtual {p2, p1, v0, p3}, Lh7/d;->e(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    return-void
.end method

.method public u(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILs7/b;)V
    .locals 1
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lo7/g;->G:Li7/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2, p3}, Li7/c;->b(Landroid/graphics/Matrix;I)Ls7/b;

    move-result-object p4

    :cond_0
    iget-object v0, p0, Lo7/g;->E:Lh7/d;

    invoke-virtual {v0, p1, p2, p3, p4}, Lh7/d;->i(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILs7/b;)V

    return-void
.end method

.method public x()Ln7/a;
    .locals 1

    invoke-super {p0}, Lo7/b;->x()Ln7/a;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lo7/g;->F:Lo7/c;

    invoke-virtual {v0}, Lo7/b;->x()Ln7/a;

    move-result-object v0

    return-object v0
.end method
