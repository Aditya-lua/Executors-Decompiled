.class public abstract Leo/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Leo/s;

.field public b:Leo/s;

.field public c:Leo/s;

.field public d:Leo/s;

.field public e:Leo/s;

.field public f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Leo/y;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Leo/s;->a:Leo/s;

    iput-object v0, p0, Leo/s;->b:Leo/s;

    iput-object v0, p0, Leo/s;->c:Leo/s;

    iput-object v0, p0, Leo/s;->d:Leo/s;

    iput-object v0, p0, Leo/s;->e:Leo/s;

    iput-object v0, p0, Leo/s;->f:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public abstract a(Leo/d0;)V
.end method

.method public b(Leo/y;)V
    .locals 1

    iget-object v0, p0, Leo/s;->f:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Leo/s;->f:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Leo/s;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public c(Leo/s;)V
    .locals 1

    invoke-virtual {p1}, Leo/s;->n()V

    invoke-virtual {p1, p0}, Leo/s;->k(Leo/s;)V

    iget-object v0, p0, Leo/s;->c:Leo/s;

    if-eqz v0, :cond_0

    iput-object p1, v0, Leo/s;->e:Leo/s;

    iput-object v0, p1, Leo/s;->d:Leo/s;

    goto :goto_0

    :cond_0
    iput-object p1, p0, Leo/s;->b:Leo/s;

    :goto_0
    iput-object p1, p0, Leo/s;->c:Leo/s;

    return-void
.end method

.method public d()Leo/s;
    .locals 1

    iget-object v0, p0, Leo/s;->b:Leo/s;

    return-object v0
.end method

.method public e()Leo/s;
    .locals 1

    iget-object v0, p0, Leo/s;->c:Leo/s;

    return-object v0
.end method

.method public f()Leo/s;
    .locals 1

    iget-object v0, p0, Leo/s;->e:Leo/s;

    return-object v0
.end method

.method public g()Leo/s;
    .locals 1

    iget-object v0, p0, Leo/s;->a:Leo/s;

    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Leo/y;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Leo/s;->f:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method public i(Leo/s;)V
    .locals 2

    invoke-virtual {p1}, Leo/s;->n()V

    iget-object v0, p0, Leo/s;->e:Leo/s;

    iput-object v0, p1, Leo/s;->e:Leo/s;

    if-eqz v0, :cond_0

    iput-object p1, v0, Leo/s;->d:Leo/s;

    :cond_0
    iput-object p0, p1, Leo/s;->d:Leo/s;

    iput-object p1, p0, Leo/s;->e:Leo/s;

    iget-object v0, p0, Leo/s;->a:Leo/s;

    iput-object v0, p1, Leo/s;->a:Leo/s;

    iget-object v1, p1, Leo/s;->e:Leo/s;

    if-nez v1, :cond_1

    iput-object p1, v0, Leo/s;->c:Leo/s;

    :cond_1
    return-void
.end method

.method public j(Leo/s;)V
    .locals 2

    invoke-virtual {p1}, Leo/s;->n()V

    iget-object v0, p0, Leo/s;->d:Leo/s;

    iput-object v0, p1, Leo/s;->d:Leo/s;

    if-eqz v0, :cond_0

    iput-object p1, v0, Leo/s;->e:Leo/s;

    :cond_0
    iput-object p0, p1, Leo/s;->e:Leo/s;

    iput-object p1, p0, Leo/s;->d:Leo/s;

    iget-object v0, p0, Leo/s;->a:Leo/s;

    iput-object v0, p1, Leo/s;->a:Leo/s;

    iget-object v1, p1, Leo/s;->d:Leo/s;

    if-nez v1, :cond_1

    iput-object p1, v0, Leo/s;->b:Leo/s;

    :cond_1
    return-void
.end method

.method public k(Leo/s;)V
    .locals 0

    iput-object p1, p0, Leo/s;->a:Leo/s;

    return-void
.end method

.method public l(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Leo/y;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Leo/s;->f:Ljava/util/List;

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Leo/s;->f:Ljava/util/List;

    return-void
.end method

.method public m()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public n()V
    .locals 3

    iget-object v0, p0, Leo/s;->d:Leo/s;

    if-eqz v0, :cond_0

    iget-object v1, p0, Leo/s;->e:Leo/s;

    iput-object v1, v0, Leo/s;->e:Leo/s;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Leo/s;->a:Leo/s;

    if-eqz v1, :cond_1

    iget-object v2, p0, Leo/s;->e:Leo/s;

    iput-object v2, v1, Leo/s;->b:Leo/s;

    :cond_1
    :goto_0
    iget-object v1, p0, Leo/s;->e:Leo/s;

    if-eqz v1, :cond_2

    iput-object v0, v1, Leo/s;->d:Leo/s;

    goto :goto_1

    :cond_2
    iget-object v1, p0, Leo/s;->a:Leo/s;

    if-eqz v1, :cond_3

    iput-object v0, v1, Leo/s;->c:Leo/s;

    :cond_3
    :goto_1
    const/4 v0, 0x0

    iput-object v0, p0, Leo/s;->a:Leo/s;

    iput-object v0, p0, Leo/s;->e:Leo/s;

    iput-object v0, p0, Leo/s;->d:Leo/s;

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

    invoke-virtual {p0}, Leo/s;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
