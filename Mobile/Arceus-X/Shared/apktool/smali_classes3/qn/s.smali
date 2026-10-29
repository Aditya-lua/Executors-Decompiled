.class public abstract Lqn/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lqn/s;

.field public b:Lqn/s;

.field public c:Lqn/s;

.field public d:Lqn/s;

.field public e:Lqn/s;

.field public f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lqn/y;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lqn/s;->a:Lqn/s;

    iput-object v0, p0, Lqn/s;->b:Lqn/s;

    iput-object v0, p0, Lqn/s;->c:Lqn/s;

    iput-object v0, p0, Lqn/s;->d:Lqn/s;

    iput-object v0, p0, Lqn/s;->e:Lqn/s;

    iput-object v0, p0, Lqn/s;->f:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public abstract a(Lqn/d0;)V
.end method

.method public b(Lqn/y;)V
    .locals 1

    iget-object v0, p0, Lqn/s;->f:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lqn/s;->f:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lqn/s;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public c(Lqn/s;)V
    .locals 1

    invoke-virtual {p1}, Lqn/s;->n()V

    invoke-virtual {p1, p0}, Lqn/s;->k(Lqn/s;)V

    iget-object v0, p0, Lqn/s;->c:Lqn/s;

    if-eqz v0, :cond_0

    iput-object p1, v0, Lqn/s;->e:Lqn/s;

    iput-object v0, p1, Lqn/s;->d:Lqn/s;

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lqn/s;->b:Lqn/s;

    :goto_0
    iput-object p1, p0, Lqn/s;->c:Lqn/s;

    return-void
.end method

.method public d()Lqn/s;
    .locals 1

    iget-object v0, p0, Lqn/s;->b:Lqn/s;

    return-object v0
.end method

.method public e()Lqn/s;
    .locals 1

    iget-object v0, p0, Lqn/s;->c:Lqn/s;

    return-object v0
.end method

.method public f()Lqn/s;
    .locals 1

    iget-object v0, p0, Lqn/s;->e:Lqn/s;

    return-object v0
.end method

.method public g()Lqn/s;
    .locals 1

    iget-object v0, p0, Lqn/s;->a:Lqn/s;

    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lqn/y;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lqn/s;->f:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method public i(Lqn/s;)V
    .locals 2

    invoke-virtual {p1}, Lqn/s;->n()V

    iget-object v0, p0, Lqn/s;->e:Lqn/s;

    iput-object v0, p1, Lqn/s;->e:Lqn/s;

    if-eqz v0, :cond_0

    iput-object p1, v0, Lqn/s;->d:Lqn/s;

    :cond_0
    iput-object p0, p1, Lqn/s;->d:Lqn/s;

    iput-object p1, p0, Lqn/s;->e:Lqn/s;

    iget-object v0, p0, Lqn/s;->a:Lqn/s;

    iput-object v0, p1, Lqn/s;->a:Lqn/s;

    iget-object v1, p1, Lqn/s;->e:Lqn/s;

    if-nez v1, :cond_1

    iput-object p1, v0, Lqn/s;->c:Lqn/s;

    :cond_1
    return-void
.end method

.method public j(Lqn/s;)V
    .locals 2

    invoke-virtual {p1}, Lqn/s;->n()V

    iget-object v0, p0, Lqn/s;->d:Lqn/s;

    iput-object v0, p1, Lqn/s;->d:Lqn/s;

    if-eqz v0, :cond_0

    iput-object p1, v0, Lqn/s;->e:Lqn/s;

    :cond_0
    iput-object p0, p1, Lqn/s;->e:Lqn/s;

    iput-object p1, p0, Lqn/s;->d:Lqn/s;

    iget-object v0, p0, Lqn/s;->a:Lqn/s;

    iput-object v0, p1, Lqn/s;->a:Lqn/s;

    iget-object v1, p1, Lqn/s;->d:Lqn/s;

    if-nez v1, :cond_1

    iput-object p1, v0, Lqn/s;->b:Lqn/s;

    :cond_1
    return-void
.end method

.method public k(Lqn/s;)V
    .locals 0

    iput-object p1, p0, Lqn/s;->a:Lqn/s;

    return-void
.end method

.method public l(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lqn/y;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lqn/s;->f:Ljava/util/List;

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqn/s;->f:Ljava/util/List;

    return-void
.end method

.method public m()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public n()V
    .locals 3

    iget-object v0, p0, Lqn/s;->d:Lqn/s;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lqn/s;->e:Lqn/s;

    iput-object v1, v0, Lqn/s;->e:Lqn/s;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lqn/s;->a:Lqn/s;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lqn/s;->e:Lqn/s;

    iput-object v2, v1, Lqn/s;->b:Lqn/s;

    :cond_1
    :goto_0
    iget-object v1, p0, Lqn/s;->e:Lqn/s;

    if-eqz v1, :cond_2

    iput-object v0, v1, Lqn/s;->d:Lqn/s;

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lqn/s;->a:Lqn/s;

    if-eqz v1, :cond_3

    iput-object v0, v1, Lqn/s;->c:Lqn/s;

    :cond_3
    :goto_1
    const/4 v0, 0x0

    iput-object v0, p0, Lqn/s;->a:Lqn/s;

    iput-object v0, p0, Lqn/s;->e:Lqn/s;

    iput-object v0, p0, Lqn/s;->d:Lqn/s;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lqn/s;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
