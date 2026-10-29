.class public Lh7/t;
.super Lh7/a;
.source "SourceFile"


# instance fields
.field public final q:Lo7/b;

.field public final r:Ljava/lang/String;

.field public final s:Z

.field public final t:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public u:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "Landroid/graphics/ColorFilter;",
            "Landroid/graphics/ColorFilter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf7/h0;Lo7/b;Ln7/s;)V
    .locals 11

    invoke-virtual {p3}, Ln7/s;->b()Ln7/s$a;

    move-result-object v0

    invoke-virtual {v0}, Ln7/s$a;->b()Landroid/graphics/Paint$Cap;

    move-result-object v4

    invoke-virtual {p3}, Ln7/s;->e()Ln7/s$b;

    move-result-object v0

    invoke-virtual {v0}, Ln7/s$b;->b()Landroid/graphics/Paint$Join;

    move-result-object v5

    invoke-virtual {p3}, Ln7/s;->g()F

    move-result v6

    invoke-virtual {p3}, Ln7/s;->i()Lm7/d;

    move-result-object v7

    invoke-virtual {p3}, Ln7/s;->j()Lm7/b;

    move-result-object v8

    invoke-virtual {p3}, Ln7/s;->f()Ljava/util/List;

    move-result-object v9

    invoke-virtual {p3}, Ln7/s;->d()Lm7/b;

    move-result-object v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v10}, Lh7/a;-><init>(Lf7/h0;Lo7/b;Landroid/graphics/Paint$Cap;Landroid/graphics/Paint$Join;FLm7/d;Lm7/b;Ljava/util/List;Lm7/b;)V

    iput-object v3, v1, Lh7/t;->q:Lo7/b;

    invoke-virtual {p3}, Ln7/s;->h()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v1, Lh7/t;->r:Ljava/lang/String;

    invoke-virtual {p3}, Ln7/s;->k()Z

    move-result p1

    iput-boolean p1, v1, Lh7/t;->s:Z

    invoke-virtual {p3}, Ln7/s;->c()Lm7/a;

    move-result-object p1

    invoke-virtual {p1}, Lm7/a;->a()Li7/a;

    move-result-object p1

    iput-object p1, v1, Lh7/t;->t:Li7/a;

    invoke-virtual {p1, p0}, Li7/a;->a(Li7/a$b;)V

    invoke-virtual {v3, p1}, Lo7/b;->j(Li7/a;)V

    return-void
.end method


# virtual methods
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

    invoke-super {p0, p1, p2}, Lh7/a;->c(Ljava/lang/Object;Lt7/c;)V

    sget-object v0, Lf7/o0;->b:Ljava/lang/Integer;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lh7/t;->t:Li7/a;

    invoke-virtual {p1, p2}, Li7/a;->o(Lt7/c;)V

    return-void

    :cond_0
    sget-object v0, Lf7/o0;->K:Landroid/graphics/ColorFilter;

    if-ne p1, v0, :cond_3

    iget-object p1, p0, Lh7/t;->u:Li7/a;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lh7/t;->q:Lo7/b;

    invoke-virtual {v0, p1}, Lo7/b;->H(Li7/a;)V

    :cond_1
    if-nez p2, :cond_2

    const/4 p1, 0x0

    iput-object p1, p0, Lh7/t;->u:Li7/a;

    return-void

    :cond_2
    new-instance p1, Li7/q;

    invoke-direct {p1, p2}, Li7/q;-><init>(Lt7/c;)V

    iput-object p1, p0, Lh7/t;->u:Li7/a;

    invoke-virtual {p1, p0}, Li7/a;->a(Li7/a$b;)V

    iget-object p1, p0, Lh7/t;->q:Lo7/b;

    iget-object p2, p0, Lh7/t;->t:Li7/a;

    invoke-virtual {p1, p2}, Lo7/b;->j(Li7/a;)V

    :cond_3
    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh7/t;->r:Ljava/lang/String;

    return-object v0
.end method

.method public i(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILs7/b;)V
    .locals 2

    iget-boolean v0, p0, Lh7/t;->s:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lh7/a;->i:Landroid/graphics/Paint;

    iget-object v1, p0, Lh7/t;->t:Li7/a;

    check-cast v1, Li7/b;

    invoke-virtual {v1}, Li7/b;->r()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lh7/t;->u:Li7/a;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lh7/a;->i:Landroid/graphics/Paint;

    invoke-virtual {v0}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/ColorFilter;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, Lh7/a;->i(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILs7/b;)V

    return-void
.end method
