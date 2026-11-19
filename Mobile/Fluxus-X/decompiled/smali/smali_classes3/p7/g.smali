.class public Lp7/g;
.super Lp7/b;
.source "SourceFile"


# instance fields
.field public final E:Li7/d;

.field public final F:Lp7/c;

.field public G:Lj7/c;


# direct methods
.method public constructor <init>(Lg7/h0;Lp7/e;Lp7/c;Lg7/i;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lp7/b;-><init>(Lg7/h0;Lp7/e;)V

    iput-object p3, p0, Lp7/g;->F:Lp7/c;

    new-instance p3, Lo7/q;

    invoke-virtual {p2}, Lp7/e;->o()Ljava/util/List;

    move-result-object p2

    const/4 v0, 0x0

    const-string v1, "__container"

    invoke-direct {p3, v1, p2, v0}, Lo7/q;-><init>(Ljava/lang/String;Ljava/util/List;Z)V

    new-instance p2, Li7/d;

    invoke-direct {p2, p1, p0, p3, p4}, Li7/d;-><init>(Lg7/h0;Lp7/b;Lo7/q;Lg7/i;)V

    iput-object p2, p0, Lp7/g;->E:Li7/d;

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-virtual {p2, p1, p1}, Li7/d;->b(Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {p0}, Lp7/b;->A()Lr7/j;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance p1, Lj7/c;

    invoke-virtual {p0}, Lp7/b;->A()Lr7/j;

    move-result-object p2

    invoke-direct {p1, p0, p0, p2}, Lj7/c;-><init>(Lj7/a$b;Lp7/b;Lr7/j;)V

    iput-object p1, p0, Lp7/g;->G:Lj7/c;

    :cond_0
    return-void
.end method


# virtual methods
.method public J(Lm7/e;ILjava/util/List;Lm7/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm7/e;",
            "I",
            "Ljava/util/List<",
            "Lm7/e;",
            ">;",
            "Lm7/e;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lp7/g;->E:Li7/d;

    invoke-virtual {v0, p1, p2, p3, p4}, Li7/d;->c(Lm7/e;ILjava/util/List;Lm7/e;)V

    return-void
.end method

.method public e(Ljava/lang/Object;Lu7/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lu7/c<",
            "TT;>;)V"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lp7/b;->e(Ljava/lang/Object;Lu7/c;)V

    sget-object v0, Lg7/o0;->e:Ljava/lang/Integer;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lp7/g;->G:Lj7/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, Lj7/c;->c(Lu7/c;)V

    return-void

    :cond_0
    sget-object v0, Lg7/o0;->G:Ljava/lang/Float;

    if-ne p1, v0, :cond_1

    iget-object v0, p0, Lp7/g;->G:Lj7/c;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p2}, Lj7/c;->f(Lu7/c;)V

    return-void

    :cond_1
    sget-object v0, Lg7/o0;->H:Ljava/lang/Float;

    if-ne p1, v0, :cond_2

    iget-object v0, p0, Lp7/g;->G:Lj7/c;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p2}, Lj7/c;->d(Lu7/c;)V

    return-void

    :cond_2
    sget-object v0, Lg7/o0;->I:Ljava/lang/Float;

    if-ne p1, v0, :cond_3

    iget-object v0, p0, Lp7/g;->G:Lj7/c;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p2}, Lj7/c;->e(Lu7/c;)V

    return-void

    :cond_3
    sget-object v0, Lg7/o0;->J:Ljava/lang/Float;

    if-ne p1, v0, :cond_4

    iget-object p1, p0, Lp7/g;->G:Lj7/c;

    if-eqz p1, :cond_4

    invoke-virtual {p1, p2}, Lj7/c;->g(Lu7/c;)V

    :cond_4
    return-void
.end method

.method public g(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lp7/b;->g(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object p2, p0, Lp7/g;->E:Li7/d;

    iget-object v0, p0, Lp7/b;->o:Landroid/graphics/Matrix;

    invoke-virtual {p2, p1, v0, p3}, Li7/d;->g(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    return-void
.end method

.method public u(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILt7/b;)V
    .locals 1
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lp7/g;->G:Lj7/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2, p3}, Lj7/c;->b(Landroid/graphics/Matrix;I)Lt7/b;

    move-result-object p4

    :cond_0
    iget-object v0, p0, Lp7/g;->E:Li7/d;

    invoke-virtual {v0, p1, p2, p3, p4}, Li7/d;->d(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILt7/b;)V

    return-void
.end method

.method public y()Lo7/a;
    .locals 1

    invoke-super {p0}, Lp7/b;->y()Lo7/a;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lp7/g;->F:Lp7/c;

    invoke-virtual {v0}, Lp7/b;->y()Lo7/a;

    move-result-object v0

    return-object v0
.end method
