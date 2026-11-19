.class public Li7/t;
.super Li7/a;
.source "SourceFile"


# instance fields
.field public final q:Lp7/b;

.field public final r:Ljava/lang/String;

.field public final s:Z

.field public final t:Lj7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj7/a<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public u:Lj7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj7/a<",
            "Landroid/graphics/ColorFilter;",
            "Landroid/graphics/ColorFilter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lg7/h0;Lp7/b;Lo7/s;)V
    .locals 11

    invoke-virtual {p3}, Lo7/s;->b()Lo7/s$a;

    move-result-object v0

    invoke-virtual {v0}, Lo7/s$a;->b()Landroid/graphics/Paint$Cap;

    move-result-object v4

    invoke-virtual {p3}, Lo7/s;->e()Lo7/s$b;

    move-result-object v0

    invoke-virtual {v0}, Lo7/s$b;->b()Landroid/graphics/Paint$Join;

    move-result-object v5

    invoke-virtual {p3}, Lo7/s;->g()F

    move-result v6

    invoke-virtual {p3}, Lo7/s;->i()Ln7/d;

    move-result-object v7

    invoke-virtual {p3}, Lo7/s;->j()Ln7/b;

    move-result-object v8

    invoke-virtual {p3}, Lo7/s;->f()Ljava/util/List;

    move-result-object v9

    invoke-virtual {p3}, Lo7/s;->d()Ln7/b;

    move-result-object v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v10}, Li7/a;-><init>(Lg7/h0;Lp7/b;Landroid/graphics/Paint$Cap;Landroid/graphics/Paint$Join;FLn7/d;Ln7/b;Ljava/util/List;Ln7/b;)V

    iput-object v3, v1, Li7/t;->q:Lp7/b;

    invoke-virtual {p3}, Lo7/s;->h()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v1, Li7/t;->r:Ljava/lang/String;

    invoke-virtual {p3}, Lo7/s;->k()Z

    move-result p1

    iput-boolean p1, v1, Li7/t;->s:Z

    invoke-virtual {p3}, Lo7/s;->c()Ln7/a;

    move-result-object p1

    invoke-virtual {p1}, Ln7/a;->a()Lj7/a;

    move-result-object p1

    iput-object p1, v1, Li7/t;->t:Lj7/a;

    invoke-virtual {p1, p0}, Lj7/a;->a(Lj7/a$b;)V

    invoke-virtual {v3, p1}, Lp7/b;->j(Lj7/a;)V

    return-void
.end method


# virtual methods
.method public d(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILt7/b;)V
    .locals 2

    iget-boolean v0, p0, Li7/t;->s:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Li7/a;->i:Landroid/graphics/Paint;

    iget-object v1, p0, Li7/t;->t:Lj7/a;

    check-cast v1, Lj7/b;

    invoke-virtual {v1}, Lj7/b;->r()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Li7/t;->u:Lj7/a;

    if-eqz v0, :cond_1

    iget-object v1, p0, Li7/a;->i:Landroid/graphics/Paint;

    invoke-virtual {v0}, Lj7/a;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/ColorFilter;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, Li7/a;->d(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILt7/b;)V

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

    invoke-super {p0, p1, p2}, Li7/a;->e(Ljava/lang/Object;Lu7/c;)V

    sget-object v0, Lg7/o0;->b:Ljava/lang/Integer;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Li7/t;->t:Lj7/a;

    invoke-virtual {p1, p2}, Lj7/a;->o(Lu7/c;)V

    return-void

    :cond_0
    sget-object v0, Lg7/o0;->K:Landroid/graphics/ColorFilter;

    if-ne p1, v0, :cond_3

    iget-object p1, p0, Li7/t;->u:Lj7/a;

    if-eqz p1, :cond_1

    iget-object v0, p0, Li7/t;->q:Lp7/b;

    invoke-virtual {v0, p1}, Lp7/b;->I(Lj7/a;)V

    :cond_1
    if-nez p2, :cond_2

    const/4 p1, 0x0

    iput-object p1, p0, Li7/t;->u:Lj7/a;

    return-void

    :cond_2
    new-instance p1, Lj7/q;

    invoke-direct {p1, p2}, Lj7/q;-><init>(Lu7/c;)V

    iput-object p1, p0, Li7/t;->u:Lj7/a;

    invoke-virtual {p1, p0}, Lj7/a;->a(Lj7/a$b;)V

    iget-object p1, p0, Li7/t;->q:Lp7/b;

    iget-object p2, p0, Li7/t;->t:Lj7/a;

    invoke-virtual {p1, p2}, Lp7/b;->j(Lj7/a;)V

    :cond_3
    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li7/t;->r:Ljava/lang/String;

    return-object v0
.end method
