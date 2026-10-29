.class public final Ln0/l1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/l1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ln0/u1;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ln0/w2;

.field public c:I

.field public d:Z

.field public e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ln0/u;",
            ">;"
        }
    .end annotation
.end field

.field public f:Z

.field public g:Ln0/z2;

.field public h:Ln0/e0;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ln0/l1$a;->a:Ljava/util/Set;

    .line 3
    invoke-static {}, Ln0/x2;->k0()Ln0/x2;

    move-result-object v0

    iput-object v0, p0, Ln0/l1$a;->b:Ln0/w2;

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Ln0/l1$a;->c:I

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Ln0/l1$a;->d:Z

    .line 6
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ln0/l1$a;->e:Ljava/util/List;

    .line 7
    iput-boolean v0, p0, Ln0/l1$a;->f:Z

    .line 8
    invoke-static {}, Ln0/z2;->g()Ln0/z2;

    move-result-object v0

    iput-object v0, p0, Ln0/l1$a;->g:Ln0/z2;

    return-void
.end method

.method public constructor <init>(Ln0/l1;)V
    .locals 3

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ln0/l1$a;->a:Ljava/util/Set;

    .line 11
    invoke-static {}, Ln0/x2;->k0()Ln0/x2;

    move-result-object v1

    iput-object v1, p0, Ln0/l1$a;->b:Ln0/w2;

    const/4 v1, -0x1

    .line 12
    iput v1, p0, Ln0/l1$a;->c:I

    const/4 v1, 0x0

    .line 13
    iput-boolean v1, p0, Ln0/l1$a;->d:Z

    .line 14
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Ln0/l1$a;->e:Ljava/util/List;

    .line 15
    iput-boolean v1, p0, Ln0/l1$a;->f:Z

    .line 16
    invoke-static {}, Ln0/z2;->g()Ln0/z2;

    move-result-object v1

    iput-object v1, p0, Ln0/l1$a;->g:Ln0/z2;

    .line 17
    iget-object v1, p1, Ln0/l1;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 18
    iget-object v0, p1, Ln0/l1;->b:Ln0/n1;

    invoke-static {v0}, Ln0/x2;->l0(Ln0/n1;)Ln0/x2;

    move-result-object v0

    iput-object v0, p0, Ln0/l1$a;->b:Ln0/w2;

    .line 19
    iget v0, p1, Ln0/l1;->c:I

    iput v0, p0, Ln0/l1$a;->c:I

    .line 20
    iget-object v0, p0, Ln0/l1$a;->e:Ljava/util/List;

    invoke-virtual {p1}, Ln0/l1;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 21
    invoke-virtual {p1}, Ln0/l1;->n()Z

    move-result v0

    iput-boolean v0, p0, Ln0/l1$a;->f:Z

    .line 22
    invoke-virtual {p1}, Ln0/l1;->j()Ln0/z3;

    move-result-object v0

    invoke-static {v0}, Ln0/z2;->h(Ln0/z3;)Ln0/z2;

    move-result-object v0

    iput-object v0, p0, Ln0/l1$a;->g:Ln0/z2;

    .line 23
    iget-boolean p1, p1, Ln0/l1;->d:Z

    iput-boolean p1, p0, Ln0/l1$a;->d:Z

    return-void
.end method

.method public static j(Ln0/i4;)Ln0/l1$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/i4<",
            "*>;)",
            "Ln0/l1$a;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ln0/i4;->K(Ln0/l1$b;)Ln0/l1$b;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ln0/l1$a;

    invoke-direct {v1}, Ln0/l1$a;-><init>()V

    invoke-interface {v0, p0, v1}, Ln0/l1$b;->a(Ln0/i4;Ln0/l1$a;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Implementation is missing option unpacker for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v2}, Ls0/q;->u(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static k(Ln0/l1;)Ln0/l1$a;
    .locals 1

    new-instance v0, Ln0/l1$a;

    invoke-direct {v0, p0}, Ln0/l1$a;-><init>(Ln0/l1;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ln0/u;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/u;

    invoke-virtual {p0, v0}, Ln0/l1$a;->c(Ln0/u;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(Ln0/z3;)V
    .locals 1

    iget-object v0, p0, Ln0/l1$a;->g:Ln0/z2;

    invoke-virtual {v0, p1}, Ln0/z2;->f(Ln0/z3;)V

    return-void
.end method

.method public c(Ln0/u;)V
    .locals 1

    iget-object v0, p0, Ln0/l1$a;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ln0/l1$a;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public d(Ln0/n1$a;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ln0/n1$a<",
            "TT;>;TT;)V"
        }
    .end annotation

    iget-object v0, p0, Ln0/l1$a;->b:Ln0/w2;

    invoke-interface {v0, p1, p2}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-void
.end method

.method public e(Ln0/n1;)V
    .locals 5

    invoke-interface {p1}, Ln0/n1;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/n1$a;

    iget-object v2, p0, Ln0/l1$a;->b:Ln0/w2;

    const/4 v3, 0x0

    invoke-interface {v2, v1, v3}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v1}, Ln0/n1;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v2, Ln0/v2;

    if-eqz v4, :cond_0

    check-cast v2, Ln0/v2;

    check-cast v3, Ln0/v2;

    invoke-virtual {v3}, Ln0/v2;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v2, v1}, Ln0/v2;->a(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    instance-of v2, v3, Ln0/v2;

    if-eqz v2, :cond_1

    check-cast v3, Ln0/v2;

    invoke-virtual {v3}, Ln0/v2;->b()Ln0/v2;

    move-result-object v3

    :cond_1
    iget-object v2, p0, Ln0/l1$a;->b:Ln0/w2;

    invoke-interface {p1, v1}, Ln0/n1;->g(Ln0/n1$a;)Ln0/n1$c;

    move-result-object v4

    invoke-interface {v2, v1, v4, v3}, Ln0/w2;->D(Ln0/n1$a;Ln0/n1$c;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public f(Ln0/u1;)V
    .locals 1

    iget-object v0, p0, Ln0/l1$a;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public g(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ln0/l1$a;->g:Ln0/z2;

    invoke-virtual {v0, p1, p2}, Ln0/z2;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public h()Ln0/l1;
    .locals 9

    new-instance v0, Ln0/l1;

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ln0/l1$a;->a:Ljava/util/Set;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v2, p0, Ln0/l1$a;->b:Ln0/w2;

    invoke-static {v2}, Ln0/c3;->j0(Ln0/n1;)Ln0/c3;

    move-result-object v2

    iget v3, p0, Ln0/l1$a;->c:I

    iget-boolean v4, p0, Ln0/l1$a;->d:Z

    new-instance v5, Ljava/util/ArrayList;

    iget-object v6, p0, Ln0/l1$a;->e:Ljava/util/List;

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-boolean v6, p0, Ln0/l1$a;->f:Z

    iget-object v7, p0, Ln0/l1$a;->g:Ln0/z2;

    invoke-static {v7}, Ln0/z3;->c(Ln0/z3;)Ln0/z3;

    move-result-object v7

    iget-object v8, p0, Ln0/l1$a;->h:Ln0/e0;

    invoke-direct/range {v0 .. v8}, Ln0/l1;-><init>(Ljava/util/List;Ln0/n1;IZLjava/util/List;ZLn0/z3;Ln0/e0;)V

    return-object v0
.end method

.method public i()V
    .locals 1

    iget-object v0, p0, Ln0/l1$a;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public l()Landroid/util/Range;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln0/l1$a;->b:Ln0/w2;

    invoke-static {}, Ln0/l1;->a()Ln0/n1$a;

    move-result-object v1

    sget-object v2, Ln0/t3;->a:Landroid/util/Range;

    invoke-interface {v0, v1, v2}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Range;

    return-object v0
.end method

.method public m()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ln0/u1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln0/l1$a;->a:Ljava/util/Set;

    return-object v0
.end method

.method public n()I
    .locals 1

    iget v0, p0, Ln0/l1$a;->c:I

    return v0
.end method

.method public o(Ln0/u;)Z
    .locals 1

    iget-object v0, p0, Ln0/l1$a;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public p(Ln0/e0;)V
    .locals 0

    iput-object p1, p0, Ln0/l1$a;->h:Ln0/e0;

    return-void
.end method

.method public q(Landroid/util/Range;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Ln0/l1;->a()Ln0/n1$a;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Ln0/l1$a;->d(Ln0/n1$a;Ljava/lang/Object;)V

    return-void
.end method

.method public r(I)V
    .locals 2

    iget-object v0, p0, Ln0/l1$a;->g:Ln0/z2;

    const-string v1, "CAPTURE_CONFIG_ID_KEY"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ln0/z2;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public s(Ln0/n1;)V
    .locals 0

    invoke-static {p1}, Ln0/x2;->l0(Ln0/n1;)Ln0/x2;

    move-result-object p1

    iput-object p1, p0, Ln0/l1$a;->b:Ln0/w2;

    return-void
.end method

.method public t(Z)V
    .locals 0

    iput-boolean p1, p0, Ln0/l1$a;->d:Z

    return-void
.end method

.method public u(I)V
    .locals 1

    if-eqz p1, :cond_0

    sget-object v0, Ln0/i4;->H:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Ln0/l1$a;->d(Ln0/n1$a;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public v(I)V
    .locals 0

    iput p1, p0, Ln0/l1$a;->c:I

    return-void
.end method

.method public w(Z)V
    .locals 0

    iput-boolean p1, p0, Ln0/l1$a;->f:Z

    return-void
.end method

.method public x(I)V
    .locals 1

    if-eqz p1, :cond_0

    sget-object v0, Ln0/i4;->I:Ln0/n1$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Ln0/l1$a;->d(Ln0/n1$a;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
