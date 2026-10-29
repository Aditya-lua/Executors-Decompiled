.class public Li7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/a$b;


# instance fields
.field public final a:Lo7/b;

.field public final b:Li7/a$b;

.field public final c:Li7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/a<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Li7/d;

.field public final e:Li7/d;

.field public final f:Li7/d;

.field public final g:Li7/d;

.field public h:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Li7/a$b;Lo7/b;Lq7/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li7/c;->b:Li7/a$b;

    iput-object p2, p0, Li7/c;->a:Lo7/b;

    invoke-virtual {p3}, Lq7/j;->a()Lm7/a;

    move-result-object p1

    invoke-virtual {p1}, Lm7/a;->a()Li7/a;

    move-result-object p1

    iput-object p1, p0, Li7/c;->c:Li7/a;

    invoke-virtual {p1, p0}, Li7/a;->a(Li7/a$b;)V

    invoke-virtual {p2, p1}, Lo7/b;->j(Li7/a;)V

    invoke-virtual {p3}, Lq7/j;->d()Lm7/b;

    move-result-object p1

    invoke-virtual {p1}, Lm7/b;->d()Li7/d;

    move-result-object p1

    iput-object p1, p0, Li7/c;->d:Li7/d;

    invoke-virtual {p1, p0}, Li7/a;->a(Li7/a$b;)V

    invoke-virtual {p2, p1}, Lo7/b;->j(Li7/a;)V

    invoke-virtual {p3}, Lq7/j;->b()Lm7/b;

    move-result-object p1

    invoke-virtual {p1}, Lm7/b;->d()Li7/d;

    move-result-object p1

    iput-object p1, p0, Li7/c;->e:Li7/d;

    invoke-virtual {p1, p0}, Li7/a;->a(Li7/a$b;)V

    invoke-virtual {p2, p1}, Lo7/b;->j(Li7/a;)V

    invoke-virtual {p3}, Lq7/j;->c()Lm7/b;

    move-result-object p1

    invoke-virtual {p1}, Lm7/b;->d()Li7/d;

    move-result-object p1

    iput-object p1, p0, Li7/c;->f:Li7/d;

    invoke-virtual {p1, p0}, Li7/a;->a(Li7/a$b;)V

    invoke-virtual {p2, p1}, Lo7/b;->j(Li7/a;)V

    invoke-virtual {p3}, Lq7/j;->e()Lm7/b;

    move-result-object p1

    invoke-virtual {p1}, Lm7/b;->d()Li7/d;

    move-result-object p1

    iput-object p1, p0, Li7/c;->g:Li7/d;

    invoke-virtual {p1, p0}, Li7/a;->a(Li7/a$b;)V

    invoke-virtual {p2, p1}, Lo7/b;->j(Li7/a;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Li7/c;->b:Li7/a$b;

    invoke-interface {v0}, Li7/a$b;->a()V

    return-void
.end method

.method public b(Landroid/graphics/Matrix;I)Ls7/b;
    .locals 6

    iget-object v0, p0, Li7/c;->e:Li7/d;

    invoke-virtual {v0}, Li7/d;->r()F

    move-result v0

    const v1, 0x3c8efa35

    mul-float/2addr v0, v1

    iget-object v1, p0, Li7/c;->f:Li7/d;

    invoke-virtual {v1}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    double-to-float v0, v4

    mul-float/2addr v0, v1

    const-wide v4, 0x400921fb54442d18L    # Math.PI

    add-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v2, v1

    iget-object v1, p0, Li7/c;->g:Li7/d;

    invoke-virtual {v1}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iget-object v3, p0, Li7/c;->c:Li7/a;

    invoke-virtual {v3}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, Li7/c;->d:Li7/d;

    invoke-virtual {v4}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    int-to-float p2, p2

    mul-float/2addr v4, p2

    const/high16 p2, 0x437f0000    # 255.0f

    div-float/2addr v4, p2

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result p2

    invoke-static {v3}, Landroid/graphics/Color;->red(I)I

    move-result v4

    invoke-static {v3}, Landroid/graphics/Color;->green(I)I

    move-result v5

    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    invoke-static {p2, v4, v5, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result p2

    new-instance v3, Ls7/b;

    const v4, 0x3ea8f5c3    # 0.33f

    mul-float/2addr v1, v4

    invoke-direct {v3, v1, v0, v2, p2}, Ls7/b;-><init>(FFFI)V

    invoke-virtual {v3, p1}, Ls7/b;->k(Landroid/graphics/Matrix;)V

    iget-object p1, p0, Li7/c;->h:Landroid/graphics/Matrix;

    if-nez p1, :cond_0

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Li7/c;->h:Landroid/graphics/Matrix;

    :cond_0
    iget-object p1, p0, Li7/c;->a:Lo7/b;

    iget-object p1, p1, Lo7/b;->x:Li7/p;

    invoke-virtual {p1}, Li7/p;->f()Landroid/graphics/Matrix;

    move-result-object p1

    iget-object p2, p0, Li7/c;->h:Landroid/graphics/Matrix;

    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    iget-object p1, p0, Li7/c;->h:Landroid/graphics/Matrix;

    invoke-virtual {v3, p1}, Ls7/b;->k(Landroid/graphics/Matrix;)V

    return-object v3
.end method

.method public c(Lt7/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt7/c<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Li7/c;->c:Li7/a;

    invoke-virtual {v0, p1}, Li7/a;->o(Lt7/c;)V

    return-void
.end method

.method public d(Lt7/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt7/c<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Li7/c;->e:Li7/d;

    invoke-virtual {v0, p1}, Li7/a;->o(Lt7/c;)V

    return-void
.end method

.method public e(Lt7/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt7/c<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Li7/c;->f:Li7/d;

    invoke-virtual {v0, p1}, Li7/a;->o(Lt7/c;)V

    return-void
.end method

.method public f(Lt7/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt7/c<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    iget-object p1, p0, Li7/c;->d:Li7/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Li7/a;->o(Lt7/c;)V

    return-void

    :cond_0
    iget-object v0, p0, Li7/c;->d:Li7/d;

    new-instance v1, Li7/c$a;

    invoke-direct {v1, p0, p1}, Li7/c$a;-><init>(Li7/c;Lt7/c;)V

    invoke-virtual {v0, v1}, Li7/a;->o(Lt7/c;)V

    return-void
.end method

.method public g(Lt7/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt7/c<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Li7/c;->g:Li7/d;

    invoke-virtual {v0, p1}, Li7/a;->o(Lt7/c;)V

    return-void
.end method
