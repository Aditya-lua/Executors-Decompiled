.class public abstract Lg0/w2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg0/w2$b;,
        Lg0/w2$c;
    }
.end annotation


# instance fields
.field public a:Z

.field public final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lg0/w2$c;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/Object;

.field public d:Lg0/w2$b;

.field public e:Ln0/i4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/i4<",
            "*>;"
        }
    .end annotation
.end field

.field public f:Ln0/i4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/i4<",
            "*>;"
        }
    .end annotation
.end field

.field public g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Li0/b;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ln0/i4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/i4<",
            "*>;"
        }
    .end annotation
.end field

.field public i:Ln0/t3;

.field public j:Ln0/i4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/i4<",
            "*>;"
        }
    .end annotation
.end field

.field public k:Landroid/graphics/Rect;

.field public l:Landroid/graphics/Matrix;

.field public m:Ln0/p0;

.field public n:Ln0/p0;

.field public o:Lg0/n;

.field public p:Ljava/lang/String;

.field public q:Ln0/o3;

.field public r:Ln0/o3;


# direct methods
.method public constructor <init>(Ln0/i4;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/i4<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lg0/w2;->a:Z

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lg0/w2;->b:Ljava/util/Set;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lg0/w2;->c:Ljava/lang/Object;

    sget-object v0, Lg0/w2$b;->b:Lg0/w2$b;

    iput-object v0, p0, Lg0/w2;->d:Lg0/w2$b;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lg0/w2;->l:Landroid/graphics/Matrix;

    invoke-static {}, Ln0/o3;->b()Ln0/o3;

    move-result-object v0

    iput-object v0, p0, Lg0/w2;->q:Ln0/o3;

    invoke-static {}, Ln0/o3;->b()Ln0/o3;

    move-result-object v0

    iput-object v0, p0, Lg0/w2;->r:Ln0/o3;

    iput-object p1, p0, Lg0/w2;->f:Ln0/i4;

    iput-object p1, p0, Lg0/w2;->h:Ln0/i4;

    return-void
.end method


# virtual methods
.method public A(Ln0/o0;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/o0;",
            ")",
            "Ljava/util/Set<",
            "Lg0/k0;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public B()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    return-object v0
.end method

.method public C()I
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    iget-object v0, p0, Lg0/w2;->h:Ln0/i4;

    check-cast v0, Ln0/i2;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ln0/i2;->J(I)I

    move-result v0

    return v0
.end method

.method public abstract D(Ln0/n1;)Ln0/i4$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/n1;",
            ")",
            "Ln0/i4$b<",
            "***>;"
        }
    .end annotation
.end method

.method public E()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lg0/w2;->k:Landroid/graphics/Rect;

    return-object v0
.end method

.method public F(I)Z
    .locals 2

    invoke-virtual {p0}, Lg0/w2;->B()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {p1, v1}, Lx0/z0;->e(II)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public G()Z
    .locals 1

    iget-boolean v0, p0, Lg0/w2;->a:Z

    return v0
.end method

.method public H(Ln0/p0;)Z
    .locals 3

    invoke-virtual {p0}, Lg0/w2;->q()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Ln0/p0;->l()Z

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown mirrorMode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public I(Ln0/o0;Ln0/i4;Ln0/i4;)Ln0/i4;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/o0;",
            "Ln0/i4<",
            "*>;",
            "Ln0/i4<",
            "*>;)",
            "Ln0/i4<",
            "*>;"
        }
    .end annotation

    if-eqz p3, :cond_0

    invoke-static {p3}, Ln0/x2;->l0(Ln0/n1;)Ln0/x2;

    move-result-object p3

    sget-object v0, Ls0/q;->M:Ln0/n1$a;

    invoke-virtual {p3, v0}, Ln0/x2;->m0(Ln0/n1$a;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {}, Ln0/x2;->k0()Ln0/x2;

    move-result-object p3

    :goto_0
    iget-object v0, p0, Lg0/w2;->f:Ln0/i4;

    sget-object v1, Ln0/i2;->m:Ln0/n1$a;

    invoke-interface {v0, v1}, Ln0/l3;->a(Ln0/n1$a;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lg0/w2;->f:Ln0/i4;

    sget-object v1, Ln0/i2;->q:Ln0/n1$a;

    invoke-interface {v0, v1}, Ln0/l3;->a(Ln0/n1$a;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    sget-object v0, Ln0/i2;->u:Ln0/n1$a;

    invoke-virtual {p3, v0}, Ln0/c3;->a(Ln0/n1$a;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p3, v0}, Ln0/x2;->m0(Ln0/n1$a;)Ljava/lang/Object;

    :cond_2
    iget-object v0, p0, Lg0/w2;->f:Ln0/i4;

    sget-object v1, Ln0/i2;->u:Ln0/n1$a;

    invoke-interface {v0, v1}, Ln0/l3;->a(Ln0/n1$a;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Ln0/i2;->s:Ln0/n1$a;

    invoke-virtual {p3, v0}, Ln0/c3;->a(Ln0/n1$a;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lg0/w2;->f:Ln0/i4;

    invoke-interface {v2, v1}, Ln0/l3;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La1/c;

    invoke-virtual {v1}, La1/c;->d()La1/d;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {p3, v0}, Ln0/x2;->m0(Ln0/n1$a;)Ljava/lang/Object;

    :cond_3
    iget-object v0, p0, Lg0/w2;->f:Ln0/i4;

    invoke-interface {v0}, Ln0/l3;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/n1$a;

    iget-object v2, p0, Lg0/w2;->f:Ln0/i4;

    invoke-static {p3, p3, v2, v1}, Ln0/n1;->P(Ln0/x2;Ln0/n1;Ln0/n1;Ln0/n1$a;)V

    goto :goto_1

    :cond_4
    if-eqz p2, :cond_6

    invoke-interface {p2}, Ln0/l3;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/n1$a;

    invoke-virtual {v1}, Ln0/n1$a;->c()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ls0/q;->M:Ln0/n1$a;

    invoke-virtual {v3}, Ln0/n1$a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_2

    :cond_5
    invoke-static {p3, p3, p2, v1}, Ln0/n1;->P(Ln0/x2;Ln0/n1;Ln0/n1;Ln0/n1$a;)V

    goto :goto_2

    :cond_6
    sget-object p2, Ln0/i2;->q:Ln0/n1$a;

    invoke-virtual {p3, p2}, Ln0/c3;->a(Ln0/n1$a;)Z

    move-result p2

    if-eqz p2, :cond_7

    sget-object p2, Ln0/i2;->m:Ln0/n1$a;

    invoke-virtual {p3, p2}, Ln0/c3;->a(Ln0/n1$a;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p3, p2}, Ln0/x2;->m0(Ln0/n1$a;)Ljava/lang/Object;

    :cond_7
    sget-object p2, Ln0/i2;->u:Ln0/n1$a;

    invoke-virtual {p3, p2}, Ln0/c3;->a(Ln0/n1$a;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p3, p2}, Ln0/c3;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, La1/c;

    invoke-virtual {p2}, La1/c;->a()I

    move-result p2

    if-eqz p2, :cond_8

    sget-object p2, Ln0/i4;->E:Ln0/n1$a;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p3, p2, v0}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    :cond_8
    invoke-virtual {p0, p3}, Lg0/w2;->c(Ln0/x2;)V

    invoke-virtual {p0, p3}, Lg0/w2;->D(Ln0/n1;)Ln0/i4$b;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lg0/w2;->Q(Ln0/o0;Ln0/i4$b;)Ln0/i4;

    move-result-object p1

    return-object p1
.end method

.method public final J()V
    .locals 1

    sget-object v0, Lg0/w2$b;->a:Lg0/w2$b;

    iput-object v0, p0, Lg0/w2;->d:Lg0/w2$b;

    invoke-virtual {p0}, Lg0/w2;->M()V

    return-void
.end method

.method public final K()V
    .locals 1

    sget-object v0, Lg0/w2$b;->b:Lg0/w2$b;

    iput-object v0, p0, Lg0/w2;->d:Lg0/w2$b;

    invoke-virtual {p0}, Lg0/w2;->M()V

    return-void
.end method

.method public final L()V
    .locals 2

    iget-object v0, p0, Lg0/w2;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2$c;

    invoke-interface {v1, p0}, Lg0/w2$c;->n(Lg0/w2;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final M()V
    .locals 2

    iget-object v0, p0, Lg0/w2;->d:Lg0/w2$b;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lg0/w2;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2$c;

    invoke-interface {v1, p0}, Lg0/w2$c;->m(Lg0/w2;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lg0/w2;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2$c;

    invoke-interface {v1, p0}, Lg0/w2$c;->s(Lg0/w2;)V

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method

.method public final N()V
    .locals 2

    iget-object v0, p0, Lg0/w2;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2$c;

    invoke-interface {v1, p0}, Lg0/w2$c;->g(Lg0/w2;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public O()V
    .locals 0

    return-void
.end method

.method public P()V
    .locals 0

    return-void
.end method

.method public Q(Ln0/o0;Ln0/i4$b;)Ln0/i4;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/o0;",
            "Ln0/i4$b<",
            "***>;)",
            "Ln0/i4<",
            "*>;"
        }
    .end annotation

    invoke-interface {p2}, Ln0/i4$b;->e()Ln0/i4;

    move-result-object p1

    return-object p1
.end method

.method public R()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg0/w2;->a:Z

    return-void
.end method

.method public S()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lg0/w2;->a:Z

    return-void
.end method

.method public T(Ln0/n1;)Ln0/t3;
    .locals 1

    iget-object v0, p0, Lg0/w2;->i:Ln0/t3;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln0/t3;->i()Ln0/t3$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Ln0/t3$a;->d(Ln0/n1;)Ln0/t3$a;

    move-result-object p1

    invoke-virtual {p1}, Ln0/t3$a;->a()Ln0/t3;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Attempt to update the implementation options for a use case without attached stream specifications."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public U(Ln0/t3;Ln0/t3;)Ln0/t3;
    .locals 0

    return-object p1
.end method

.method public V()V
    .locals 0

    return-void
.end method

.method public final W(Lg0/w2$c;)V
    .locals 1

    iget-object v0, p0, Lg0/w2;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public X(Lg0/n;)V
    .locals 1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lg0/n;->g()I

    move-result v0

    invoke-virtual {p0, v0}, Lg0/w2;->F(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Lx2/g;->a(Z)V

    iput-object p1, p0, Lg0/w2;->o:Lg0/n;

    return-void
.end method

.method public Y(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Li0/b;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lg0/w2;->g:Ljava/util/Set;

    return-void
.end method

.method public Z(Landroid/graphics/Matrix;)V
    .locals 1

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0, p1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    iput-object v0, p0, Lg0/w2;->l:Landroid/graphics/Matrix;

    return-void
.end method

.method public final a(Lg0/w2$c;)V
    .locals 1

    iget-object v0, p0, Lg0/w2;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public a0(I)Z
    .locals 2

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object v0

    check-cast v0, Ln0/i2;

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Ln0/i2;->J(I)I

    move-result v0

    if-eq v0, v1, :cond_1

    if-eq v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lg0/w2;->f:Ln0/i4;

    invoke-virtual {p0, v0}, Lg0/w2;->D(Ln0/n1;)Ln0/i4$b;

    move-result-object v0

    invoke-static {v0, p1}, Lw0/e;->a(Ln0/i4$b;I)V

    invoke-interface {v0}, Ln0/i4$b;->e()Ln0/i4;

    move-result-object p1

    iput-object p1, p0, Lg0/w2;->f:Ln0/i4;

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lg0/w2;->f:Ln0/i4;

    iput-object p1, p0, Lg0/w2;->h:Ln0/i4;

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Ln0/p0;->k()Ln0/o0;

    move-result-object p1

    iget-object v0, p0, Lg0/w2;->e:Ln0/i4;

    iget-object v1, p0, Lg0/w2;->j:Ln0/i4;

    invoke-virtual {p0, p1, v0, v1}, Lg0/w2;->I(Ln0/o0;Ln0/i4;Ln0/i4;)Ln0/i4;

    move-result-object p1

    iput-object p1, p0, Lg0/w2;->h:Ln0/i4;

    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public b(Ln0/o3$b;Ln0/t3;)V
    .locals 4

    sget-object v0, Ln0/t3;->a:Landroid/util/Range;

    invoke-virtual {p2}, Ln0/t3;->c()Landroid/util/Range;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Ln0/t3;->c()Landroid/util/Range;

    move-result-object p2

    invoke-virtual {p1, p2}, Ln0/o3$b;->v(Landroid/util/Range;)Ln0/o3$b;

    return-void

    :cond_0
    iget-object p2, p0, Lg0/w2;->c:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, Lg0/w2;->m:Ln0/p0;

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/p0;

    invoke-interface {v0}, Ln0/p0;->k()Ln0/o0;

    move-result-object v0

    invoke-interface {v0}, Ln0/o0;->l()Ln0/k3;

    move-result-object v0

    const-class v1, Landroidx/camera/core/internal/compat/quirk/AeFpsRangeQuirk;

    invoke-virtual {v0, v1}, Ln0/k3;->c(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-gt v1, v3, :cond_1

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_0
    const-string v1, "There should not have more than one AeFpsRangeQuirk."

    invoke-static {v3, v1}, Lx2/g;->b(ZLjava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/internal/compat/quirk/AeFpsRangeQuirk;

    invoke-interface {v0}, Landroidx/camera/core/internal/compat/quirk/AeFpsRangeQuirk;->a()Landroid/util/Range;

    move-result-object v0

    invoke-virtual {p1, v0}, Ln0/o3$b;->v(Landroid/util/Range;)Ln0/o3$b;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_1
    monitor-exit p2

    return-void

    :goto_2
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b0(Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Lg0/w2;->k:Landroid/graphics/Rect;

    return-void
.end method

.method public final c(Ln0/x2;)V
    .locals 11

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "applyFeaturesToConfig: mFeatureGroup = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Lg0/w2;->g:Ljava/util/Set;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ", this = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "UseCase"

    invoke-static {v6, v5}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v5, p0, Lg0/w2;->g:Ljava/util/Set;

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    sget-object v6, Lk0/a;->j:Lg0/k0;

    sget-object v7, Ln0/t3;->a:Landroid/util/Range;

    sget-object v8, Lk0/e;->j:Lk0/e$b;

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Li0/b;

    instance-of v10, v9, Lk0/a;

    if-eqz v10, :cond_2

    check-cast v9, Lk0/a;

    invoke-virtual {v9}, Lk0/a;->f()Lg0/k0;

    move-result-object v6

    goto :goto_0

    :cond_2
    instance-of v10, v9, Lk0/c;

    if-eqz v10, :cond_3

    check-cast v9, Lk0/c;

    new-instance v7, Landroid/util/Range;

    invoke-virtual {v9}, Lk0/c;->g()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v9}, Lk0/c;->f()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-direct {v7, v10, v9}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    goto :goto_0

    :cond_3
    instance-of v10, v9, Lk0/e;

    if-eqz v10, :cond_1

    check-cast v9, Lk0/e;

    invoke-virtual {v9}, Lk0/e;->f()Lk0/e$b;

    move-result-object v8

    goto :goto_0

    :cond_4
    instance-of v5, p0, Lg0/a2;

    if-nez v5, :cond_5

    invoke-static {p0}, Ls0/f;->e0(Lg0/w2;)Z

    move-result v5

    if-eqz v5, :cond_6

    :cond_5
    sget-object v5, Ln0/h2;->l:Ln0/n1$a;

    invoke-virtual {p1, v5, v6}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    :cond_6
    sget-object v5, Ln0/i4;->C:Ln0/n1$a;

    invoke-virtual {p1, v5, v7}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    sget-object v5, Lg0/w2$a;->a:[I

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v5, v5, v6

    if-eq v5, v3, :cond_9

    if-eq v5, v1, :cond_8

    const/4 v1, 0x3

    if-eq v5, v1, :cond_7

    :goto_1
    return-void

    :cond_7
    sget-object v1, Ln0/i4;->H:Ln0/n1$a;

    invoke-virtual {p1, v1, v2}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    sget-object v1, Ln0/i4;->I:Ln0/n1$a;

    invoke-virtual {p1, v1, v0}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-void

    :cond_8
    sget-object v1, Ln0/i4;->H:Ln0/n1$a;

    invoke-virtual {p1, v1, v0}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    sget-object v0, Ln0/i4;->I:Ln0/n1$a;

    invoke-virtual {p1, v0, v2}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-void

    :cond_9
    sget-object v0, Ln0/i4;->H:Ln0/n1$a;

    invoke-virtual {p1, v0, v4}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    sget-object v0, Ln0/i4;->I:Ln0/n1$a;

    invoke-virtual {p1, v0, v4}, Ln0/x2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    return-void
.end method

.method public final c0(Ln0/p0;)V
    .locals 3

    invoke-virtual {p0}, Lg0/w2;->V()V

    iget-object v0, p0, Lg0/w2;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg0/w2;->m:Ln0/p0;

    const/4 v2, 0x0

    if-ne p1, v1, :cond_0

    invoke-virtual {p0, v1}, Lg0/w2;->W(Lg0/w2$c;)V

    iput-object v2, p0, Lg0/w2;->m:Ln0/p0;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lg0/w2;->n:Ln0/p0;

    if-ne p1, v1, :cond_1

    invoke-virtual {p0, v1}, Lg0/w2;->W(Lg0/w2$c;)V

    iput-object v2, p0, Lg0/w2;->n:Ln0/p0;

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v2, p0, Lg0/w2;->i:Ln0/t3;

    iput-object v2, p0, Lg0/w2;->k:Landroid/graphics/Rect;

    iget-object p1, p0, Lg0/w2;->f:Ln0/i4;

    iput-object p1, p0, Lg0/w2;->h:Ln0/i4;

    iput-object v2, p0, Lg0/w2;->e:Ln0/i4;

    iput-object v2, p0, Lg0/w2;->j:Ln0/i4;

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final d(Ln0/p0;Ln0/p0;Ln0/i4;Ln0/i4;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/p0;",
            "Ln0/p0;",
            "Ln0/i4<",
            "*>;",
            "Ln0/i4<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Lg0/w2;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lg0/w2;->m:Ln0/p0;

    iput-object p2, p0, Lg0/w2;->n:Ln0/p0;

    invoke-virtual {p0, p1}, Lg0/w2;->a(Lg0/w2$c;)V

    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, Lg0/w2;->a(Lg0/w2$c;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object p3, p0, Lg0/w2;->e:Ln0/i4;

    iput-object p4, p0, Lg0/w2;->j:Ln0/i4;

    invoke-interface {p1}, Ln0/p0;->k()Ln0/o0;

    move-result-object p1

    iget-object p2, p0, Lg0/w2;->e:Ln0/i4;

    iget-object p3, p0, Lg0/w2;->j:Ln0/i4;

    invoke-virtual {p0, p1, p2, p3}, Lg0/w2;->I(Ln0/o0;Ln0/i4;Ln0/i4;)Ln0/i4;

    move-result-object p1

    iput-object p1, p0, Lg0/w2;->h:Ln0/i4;

    invoke-virtual {p0}, Lg0/w2;->O()V

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public d0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln0/o3;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/o3;

    iput-object v0, p0, Lg0/w2;->q:Ln0/o3;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/o3;

    iput-object v0, p0, Lg0/w2;->r:Ln0/o3;

    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/o3;

    invoke-virtual {v0}, Ln0/o3;->p()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/u1;

    invoke-virtual {v1}, Ln0/u1;->g()Ljava/lang/Class;

    move-result-object v2

    if-nez v2, :cond_3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln0/u1;->p(Ljava/lang/Class;)V

    goto :goto_0

    :cond_4
    :goto_1
    return-void
.end method

.method public e()Ln0/i4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln0/i4<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lg0/w2;->f:Ln0/i4;

    return-object v0
.end method

.method public e0(Ln0/t3;Ln0/t3;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lg0/w2;->U(Ln0/t3;Ln0/t3;)Ln0/t3;

    move-result-object p1

    iput-object p1, p0, Lg0/w2;->i:Ln0/t3;

    return-void
.end method

.method public f()I
    .locals 2

    iget-object v0, p0, Lg0/w2;->h:Ln0/i4;

    check-cast v0, Ln0/i2;

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Ln0/i2;->t(I)I

    move-result v0

    return v0
.end method

.method public f0(Ln0/n1;)V
    .locals 0

    invoke-virtual {p0, p1}, Lg0/w2;->T(Ln0/n1;)Ln0/t3;

    move-result-object p1

    iput-object p1, p0, Lg0/w2;->i:Ln0/t3;

    return-void
.end method

.method public g()Ln0/t3;
    .locals 1

    iget-object v0, p0, Lg0/w2;->i:Ln0/t3;

    return-object v0
.end method

.method public h()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Lg0/w2;->i:Ln0/t3;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public i()Ln0/p0;
    .locals 2

    iget-object v0, p0, Lg0/w2;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg0/w2;->m:Ln0/p0;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public j()Ln0/l0;
    .locals 2

    iget-object v0, p0, Lg0/w2;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg0/w2;->m:Ln0/p0;

    if-nez v1, :cond_0

    sget-object v1, Ln0/l0;->a:Ln0/l0;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ln0/p0;->e()Ln0/l0;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public k()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No camera attached to use case: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lx2/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/p0;

    invoke-interface {v0}, Ln0/p0;->k()Ln0/o0;

    move-result-object v0

    invoke-interface {v0}, Ln0/o0;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public l()Ln0/i4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln0/i4<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lg0/w2;->h:Ln0/i4;

    return-object v0
.end method

.method public abstract m(ZLn0/j4;)Ln0/i4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ln0/j4;",
            ")",
            "Ln0/i4<",
            "*>;"
        }
    .end annotation
.end method

.method public n()Lg0/n;
    .locals 1

    iget-object v0, p0, Lg0/w2;->o:Lg0/n;

    return-object v0
.end method

.method public o()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Li0/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg0/w2;->g:Ljava/util/Set;

    return-object v0
.end method

.method public p()I
    .locals 1

    iget-object v0, p0, Lg0/w2;->h:Ln0/i4;

    invoke-interface {v0}, Ln0/h2;->p()I

    move-result v0

    return v0
.end method

.method public q()I
    .locals 2

    iget-object v0, p0, Lg0/w2;->h:Ln0/i4;

    check-cast v0, Ln0/i2;

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Ln0/i2;->g0(I)I

    move-result v0

    return v0
.end method

.method public r()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lg0/w2;->h:Ln0/i4;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "<UnknownUseCase-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ">"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ls0/q;->u(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public s()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg0/w2;->p:Ljava/lang/String;

    return-object v0
.end method

.method public t(Ln0/p0;)I
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lg0/w2;->u(Ln0/p0;Z)I

    move-result p1

    return p1
.end method

.method public u(Ln0/p0;Z)I
    .locals 2

    invoke-interface {p1}, Ln0/p0;->k()Ln0/o0;

    move-result-object v0

    invoke-virtual {p0}, Lg0/w2;->C()I

    move-result v1

    invoke-interface {v0, v1}, Lg0/t;->w(I)I

    move-result v0

    invoke-interface {p1}, Ln0/p0;->q()Z

    move-result p1

    if-nez p1, :cond_0

    if-eqz p2, :cond_0

    neg-int p1, v0

    invoke-static {p1}, Lp0/a0;->w(I)I

    move-result p1

    return p1

    :cond_0
    return v0
.end method

.method public v()Ln0/p0;
    .locals 2

    iget-object v0, p0, Lg0/w2;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg0/w2;->n:Ln0/p0;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public w()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lg0/w2;->v()Ln0/p0;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lg0/w2;->v()Ln0/p0;

    move-result-object v0

    invoke-interface {v0}, Ln0/p0;->k()Ln0/o0;

    move-result-object v0

    invoke-interface {v0}, Ln0/o0;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public x()Ln0/o3;
    .locals 1

    iget-object v0, p0, Lg0/w2;->r:Ln0/o3;

    return-object v0
.end method

.method public y()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, Lg0/w2;->l:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public z()Ln0/o3;
    .locals 1

    iget-object v0, p0, Lg0/w2;->q:Ln0/o3;

    return-object v0
.end method
