.class public Lao/z;
.super Lho/a;
.source "SourceFile"


# instance fields
.field public final a:Leo/w;

.field public final b:Lao/w;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lho/a;-><init>()V

    new-instance v0, Leo/w;

    invoke-direct {v0}, Leo/w;-><init>()V

    iput-object v0, p0, Lao/z;->a:Leo/w;

    new-instance v0, Lao/w;

    invoke-direct {v0}, Lao/w;-><init>()V

    iput-object v0, p0, Lao/z;->b:Lao/w;

    return-void
.end method


# virtual methods
.method public a(Lho/h;)Lho/c;
    .locals 1

    invoke-interface {p1}, Lho/h;->a()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lho/h;->getIndex()I

    move-result p1

    invoke-static {p1}, Lho/c;->b(I)Lho/c;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lho/c;->d()Lho/c;

    move-result-object p1

    return-object p1
.end method

.method public c(Lfo/i;)V
    .locals 1

    iget-object v0, p0, Lao/z;->b:Lao/w;

    invoke-virtual {v0, p1}, Lao/w;->h(Lfo/i;)V

    return-void
.end method

.method public d(Leo/y;)V
    .locals 1

    iget-object v0, p0, Lao/z;->b:Lao/w;

    invoke-virtual {v0, p1}, Lao/w;->a(Leo/y;)V

    return-void
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public f()Leo/a;
    .locals 1

    iget-object v0, p0, Lao/z;->a:Leo/w;

    return-object v0
.end method

.method public h()V
    .locals 3

    iget-object v0, p0, Lao/z;->b:Lao/w;

    invoke-virtual {v0}, Lao/w;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leo/p;

    iget-object v2, p0, Lao/z;->a:Leo/w;

    invoke-virtual {v2, v1}, Leo/s;->j(Leo/s;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lao/z;->b:Lao/w;

    invoke-virtual {v0}, Lao/w;->e()Lfo/j;

    move-result-object v0

    invoke-virtual {v0}, Lfo/j;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lao/z;->a:Leo/w;

    invoke-virtual {v0}, Leo/s;->n()V

    return-void

    :cond_1
    iget-object v0, p0, Lao/z;->a:Leo/w;

    iget-object v1, p0, Lao/z;->b:Lao/w;

    invoke-virtual {v1}, Lao/w;->f()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Leo/s;->l(Ljava/util/List;)V

    return-void
.end method

.method public i()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Leo/e<",
            "*>;>;"
        }
    .end annotation

    new-instance v0, Leo/e;

    const-class v1, Leo/p;

    invoke-direct {v0, v1}, Leo/e;-><init>(Ljava/lang/Class;)V

    iget-object v1, p0, Lao/z;->b:Lao/w;

    invoke-virtual {v1}, Lao/w;->d()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leo/p;

    invoke-virtual {v2}, Leo/p;->q()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Leo/e;->d(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lao/r;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public j(Lfo/b;)V
    .locals 2

    iget-object v0, p0, Lao/z;->b:Lao/w;

    invoke-virtual {v0}, Lao/w;->e()Lfo/j;

    move-result-object v0

    invoke-virtual {v0}, Lfo/j;->f()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lao/z;->a:Leo/w;

    invoke-interface {p1, v0, v1}, Lfo/b;->b(Lfo/j;Leo/s;)V

    :cond_0
    return-void
.end method

.method public k()Lfo/j;
    .locals 1

    iget-object v0, p0, Lao/z;->b:Lao/w;

    invoke-virtual {v0}, Lao/w;->e()Lfo/j;

    move-result-object v0

    return-object v0
.end method

.method public l(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Leo/y;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lao/z;->b:Lao/w;

    invoke-virtual {v0, p1}, Lao/w;->j(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
