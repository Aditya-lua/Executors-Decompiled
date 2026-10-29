.class public Lnn/z;
.super Ltn/a;
.source "SourceFile"


# instance fields
.field public final a:Lqn/w;

.field public final b:Lnn/w;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ltn/a;-><init>()V

    new-instance v0, Lqn/w;

    invoke-direct {v0}, Lqn/w;-><init>()V

    iput-object v0, p0, Lnn/z;->a:Lqn/w;

    new-instance v0, Lnn/w;

    invoke-direct {v0}, Lnn/w;-><init>()V

    iput-object v0, p0, Lnn/z;->b:Lnn/w;

    return-void
.end method


# virtual methods
.method public b(Ltn/h;)Ltn/c;
    .locals 1

    invoke-interface {p1}, Ltn/h;->a()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Ltn/h;->getIndex()I

    move-result p1

    invoke-static {p1}, Ltn/c;->b(I)Ltn/c;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Ltn/c;->d()Ltn/c;

    move-result-object p1

    return-object p1
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public d()Lqn/a;
    .locals 1

    iget-object v0, p0, Lnn/z;->a:Lqn/w;

    return-object v0
.end method

.method public f(Lrn/b;)V
    .locals 2

    iget-object v0, p0, Lnn/z;->b:Lnn/w;

    invoke-virtual {v0}, Lnn/w;->e()Lrn/j;

    move-result-object v0

    invoke-virtual {v0}, Lrn/j;->f()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lnn/z;->a:Lqn/w;

    invoke-interface {p1, v0, v1}, Lrn/b;->b(Lrn/j;Lqn/s;)V

    :cond_0
    return-void
.end method

.method public g(Lrn/i;)V
    .locals 1

    iget-object v0, p0, Lnn/z;->b:Lnn/w;

    invoke-virtual {v0, p1}, Lnn/w;->h(Lrn/i;)V

    return-void
.end method

.method public h()V
    .locals 3

    iget-object v0, p0, Lnn/z;->b:Lnn/w;

    invoke-virtual {v0}, Lnn/w;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqn/p;

    iget-object v2, p0, Lnn/z;->a:Lqn/w;

    invoke-virtual {v2, v1}, Lqn/s;->j(Lqn/s;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lnn/z;->b:Lnn/w;

    invoke-virtual {v0}, Lnn/w;->e()Lrn/j;

    move-result-object v0

    invoke-virtual {v0}, Lrn/j;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnn/z;->a:Lqn/w;

    invoke-virtual {v0}, Lqn/s;->n()V

    return-void

    :cond_1
    iget-object v0, p0, Lnn/z;->a:Lqn/w;

    iget-object v1, p0, Lnn/z;->b:Lnn/w;

    invoke-virtual {v1}, Lnn/w;->f()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqn/s;->l(Ljava/util/List;)V

    return-void
.end method

.method public i(Lqn/y;)V
    .locals 1

    iget-object v0, p0, Lnn/z;->b:Lnn/w;

    invoke-virtual {v0, p1}, Lnn/w;->a(Lqn/y;)V

    return-void
.end method

.method public j()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lqn/e<",
            "*>;>;"
        }
    .end annotation

    new-instance v0, Lqn/e;

    const-class v1, Lqn/p;

    invoke-direct {v0, v1}, Lqn/e;-><init>(Ljava/lang/Class;)V

    iget-object v1, p0, Lnn/z;->b:Lnn/w;

    invoke-virtual {v1}, Lnn/w;->d()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqn/p;

    invoke-virtual {v2}, Lqn/p;->q()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Lqn/e;->d(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lnn/r;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public k()Lrn/j;
    .locals 1

    iget-object v0, p0, Lnn/z;->b:Lnn/w;

    invoke-virtual {v0}, Lnn/w;->e()Lrn/j;

    move-result-object v0

    return-object v0
.end method

.method public l(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lqn/y;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnn/z;->b:Lnn/w;

    invoke-virtual {v0, p1}, Lnn/w;->j(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
