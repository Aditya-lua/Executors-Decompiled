.class public final Lz/s5;
.super Lz/h5$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/s5$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lz/h5$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lz/h5$c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lz/h5$c;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lz/s5;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public static varargs x([Lz/h5$c;)Lz/h5$c;
    .locals 1

    new-instance v0, Lz/s5;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lz/s5;-><init>(Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public p(Lz/h5;)V
    .locals 2

    iget-object v0, p0, Lz/s5;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz/h5$c;

    invoke-virtual {v1, p1}, Lz/h5$c;->p(Lz/h5;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public q(Lz/h5;)V
    .locals 2

    iget-object v0, p0, Lz/s5;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz/h5$c;

    invoke-virtual {v1, p1}, Lz/h5$c;->q(Lz/h5;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public r(Lz/h5;)V
    .locals 2

    iget-object v0, p0, Lz/s5;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz/h5$c;

    invoke-virtual {v1, p1}, Lz/h5$c;->r(Lz/h5;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public s(Lz/h5;)V
    .locals 2

    iget-object v0, p0, Lz/s5;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz/h5$c;

    invoke-virtual {v1, p1}, Lz/h5$c;->s(Lz/h5;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public t(Lz/h5;)V
    .locals 2

    iget-object v0, p0, Lz/s5;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz/h5$c;

    invoke-virtual {v1, p1}, Lz/h5$c;->t(Lz/h5;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public u(Lz/h5;)V
    .locals 2

    iget-object v0, p0, Lz/s5;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz/h5$c;

    invoke-virtual {v1, p1}, Lz/h5$c;->u(Lz/h5;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public v(Lz/h5;)V
    .locals 2

    iget-object v0, p0, Lz/s5;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz/h5$c;

    invoke-virtual {v1, p1}, Lz/h5$c;->v(Lz/h5;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public w(Lz/h5;Landroid/view/Surface;)V
    .locals 2

    iget-object v0, p0, Lz/s5;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz/h5$c;

    invoke-virtual {v1, p1, p2}, Lz/h5$c;->w(Lz/h5;Landroid/view/Surface;)V

    goto :goto_0

    :cond_0
    return-void
.end method
