.class public Lh7/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh7/m;
.implements Li7/a$b;
.implements Lh7/k;


# instance fields
.field public final a:Landroid/graphics/Path;

.field public final b:Ljava/lang/String;

.field public final c:Z

.field public final d:Lf7/h0;

.field public final e:Li7/m;

.field public f:Z

.field public final g:Lh7/b;


# direct methods
.method public constructor <init>(Lf7/h0;Lo7/b;Ln7/r;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lh7/r;->a:Landroid/graphics/Path;

    new-instance v0, Lh7/b;

    invoke-direct {v0}, Lh7/b;-><init>()V

    iput-object v0, p0, Lh7/r;->g:Lh7/b;

    invoke-virtual {p3}, Ln7/r;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lh7/r;->b:Ljava/lang/String;

    invoke-virtual {p3}, Ln7/r;->d()Z

    move-result v0

    iput-boolean v0, p0, Lh7/r;->c:Z

    iput-object p1, p0, Lh7/r;->d:Lf7/h0;

    invoke-virtual {p3}, Ln7/r;->c()Lm7/h;

    move-result-object p1

    invoke-virtual {p1}, Lm7/h;->d()Li7/m;

    move-result-object p1

    iput-object p1, p0, Lh7/r;->e:Li7/m;

    invoke-virtual {p2, p1}, Lo7/b;->j(Li7/a;)V

    invoke-virtual {p1, p0}, Li7/a;->a(Li7/a$b;)V

    return-void
.end method

.method private f()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lh7/r;->f:Z

    iget-object v0, p0, Lh7/r;->d:Lf7/h0;

    invoke-virtual {v0}, Lf7/h0;->invalidateSelf()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-direct {p0}, Lh7/r;->f()V

    return-void
.end method

.method public b(Ljava/util/List;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lh7/c;",
            ">;",
            "Ljava/util/List<",
            "Lh7/c;",
            ">;)V"
        }
    .end annotation

    const/4 p2, 0x0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh7/c;

    instance-of v2, v1, Lh7/u;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lh7/u;

    invoke-virtual {v2}, Lh7/u;->k()Ln7/t$a;

    move-result-object v3

    sget-object v4, Ln7/t$a;->a:Ln7/t$a;

    if-ne v3, v4, :cond_0

    iget-object v1, p0, Lh7/r;->g:Lh7/b;

    invoke-virtual {v1, v2}, Lh7/b;->a(Lh7/u;)V

    invoke-virtual {v2, p0}, Lh7/u;->c(Li7/a$b;)V

    goto :goto_1

    :cond_0
    instance-of v2, v1, Lh7/s;

    if-eqz v2, :cond_2

    if-nez p2, :cond_1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    check-cast v1, Lh7/s;

    invoke-interface {v1, p0}, Lh7/s;->g(Li7/a$b;)V

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lh7/r;->e:Li7/m;

    invoke-virtual {p1, p2}, Li7/m;->s(Ljava/util/List;)V

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

    sget-object v0, Lf7/o0;->P:Landroid/graphics/Path;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lh7/r;->e:Li7/m;

    invoke-virtual {p1, p2}, Li7/a;->o(Lt7/c;)V

    :cond_0
    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh7/r;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getPath()Landroid/graphics/Path;
    .locals 3

    iget-boolean v0, p0, Lh7/r;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh7/r;->e:Li7/m;

    invoke-virtual {v0}, Li7/a;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lh7/r;->a:Landroid/graphics/Path;

    return-object v0

    :cond_0
    iget-object v0, p0, Lh7/r;->a:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget-boolean v0, p0, Lh7/r;->c:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iput-boolean v1, p0, Lh7/r;->f:Z

    iget-object v0, p0, Lh7/r;->a:Landroid/graphics/Path;

    return-object v0

    :cond_1
    iget-object v0, p0, Lh7/r;->e:Li7/m;

    invoke-virtual {v0}, Li7/a;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Path;

    if-nez v0, :cond_2

    iget-object v0, p0, Lh7/r;->a:Landroid/graphics/Path;

    return-object v0

    :cond_2
    iget-object v2, p0, Lh7/r;->a:Landroid/graphics/Path;

    invoke-virtual {v2, v0}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    iget-object v0, p0, Lh7/r;->a:Landroid/graphics/Path;

    sget-object v2, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    invoke-virtual {v0, v2}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    iget-object v0, p0, Lh7/r;->g:Lh7/b;

    iget-object v2, p0, Lh7/r;->a:Landroid/graphics/Path;

    invoke-virtual {v0, v2}, Lh7/b;->b(Landroid/graphics/Path;)V

    iput-boolean v1, p0, Lh7/r;->f:Z

    iget-object v0, p0, Lh7/r;->a:Landroid/graphics/Path;

    return-object v0
.end method

.method public h(Ll7/e;ILjava/util/List;Ll7/e;)V
    .locals 0
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

    invoke-static {p1, p2, p3, p4, p0}, Ls7/j;->k(Ll7/e;ILjava/util/List;Ll7/e;Lh7/k;)V

    return-void
.end method
