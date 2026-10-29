.class public Lb1/g;
.super Lg0/w2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb1/g$a;
    }
.end annotation


# instance fields
.field public A:Lx0/n0;

.field public B:Lx0/n0;

.field public C:Lx0/n0;

.field public D:Lx0/n0;

.field public E:Lx0/n0;

.field public F:Lx0/n0;

.field public G:Ln0/o3$b;

.field public H:Ln0/o3$b;

.field public I:Ln0/o3$c;

.field public final s:Lb1/i;

.field public final t:Lb1/k;

.field public final u:Lg0/i0;

.field public final v:Lg0/i0;

.field public w:Lx0/v0;

.field public x:Lx0/v0;

.field public y:Ly0/r;

.field public z:Lx0/v0;


# direct methods
.method public constructor <init>(Ln0/p0;Ln0/p0;Lg0/i0;Lg0/i0;Ljava/util/Set;Ln0/j4;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/p0;",
            "Ln0/p0;",
            "Lg0/i0;",
            "Lg0/i0;",
            "Ljava/util/Set<",
            "Lg0/w2;",
            ">;",
            "Ln0/j4;",
            ")V"
        }
    .end annotation

    invoke-static {p5}, Lb1/g;->v0(Ljava/util/Set;)Lb1/i;

    move-result-object v0

    invoke-direct {p0, v0}, Lg0/w2;-><init>(Ln0/i4;)V

    invoke-static {p5}, Lb1/g;->v0(Ljava/util/Set;)Lb1/i;

    move-result-object v0

    iput-object v0, p0, Lb1/g;->s:Lb1/i;

    iput-object p3, p0, Lb1/g;->u:Lg0/i0;

    iput-object p4, p0, Lb1/g;->v:Lg0/i0;

    move-object p3, p2

    move-object p2, p1

    new-instance p1, Lb1/k;

    move-object p4, p5

    move-object p5, p6

    new-instance p6, Lb1/f;

    invoke-direct {p6, p0}, Lb1/f;-><init>(Lb1/g;)V

    invoke-direct/range {p1 .. p6}, Lb1/k;-><init>(Ln0/p0;Ln0/p0;Ljava/util/Set;Ln0/j4;Lb1/g$a;)V

    iput-object p1, p0, Lb1/g;->t:Lb1/k;

    invoke-virtual {p0, p4}, Lb1/g;->F0(Ljava/util/Set;)V

    return-void
.end method

.method public static A0(Lg0/w2;)Z
    .locals 0

    instance-of p0, p0, Lb1/g;

    return p0
.end method

.method public static synthetic g0(Lb1/g;Ljava/lang/String;Ljava/lang/String;Ln0/i4;Ln0/t3;Ln0/t3;Ln0/o3;Ln0/o3$g;)V
    .locals 0

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object p6

    if-nez p6, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lb1/g;->j0()V

    invoke-virtual/range {p0 .. p5}, Lb1/g;->m0(Ljava/lang/String;Ljava/lang/String;Ln0/i4;Ln0/t3;Ln0/t3;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg0/w2;->d0(Ljava/util/List;)V

    invoke-virtual {p0}, Lg0/w2;->L()V

    iget-object p0, p0, Lb1/g;->t:Lb1/k;

    invoke-virtual {p0}, Lb1/k;->Q()V

    return-void
.end method

.method public static synthetic h0(Lb1/g;II)Lne/x;
    .locals 0

    iget-object p0, p0, Lb1/g;->x:Lx0/v0;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lx0/v0;->e()Lx0/r0;

    move-result-object p0

    invoke-interface {p0, p1, p2}, Lx0/r0;->c(II)Lne/x;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/Exception;

    const-string p1, "Failed to take picture: pipeline is not ready."

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p0

    return-object p0
.end method

.method private j0()V
    .locals 2

    iget-object v0, p0, Lb1/g;->I:Ln0/o3$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln0/o3$c;->b()V

    iput-object v1, p0, Lb1/g;->I:Ln0/o3$c;

    :cond_0
    iget-object v0, p0, Lb1/g;->A:Lx0/n0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lx0/n0;->i()V

    iput-object v1, p0, Lb1/g;->A:Lx0/n0;

    :cond_1
    iget-object v0, p0, Lb1/g;->B:Lx0/n0;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lx0/n0;->i()V

    iput-object v1, p0, Lb1/g;->B:Lx0/n0;

    :cond_2
    iget-object v0, p0, Lb1/g;->C:Lx0/n0;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lx0/n0;->i()V

    iput-object v1, p0, Lb1/g;->C:Lx0/n0;

    :cond_3
    iget-object v0, p0, Lb1/g;->D:Lx0/n0;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lx0/n0;->i()V

    iput-object v1, p0, Lb1/g;->D:Lx0/n0;

    :cond_4
    iget-object v0, p0, Lb1/g;->E:Lx0/n0;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lx0/n0;->i()V

    iput-object v1, p0, Lb1/g;->E:Lx0/n0;

    :cond_5
    iget-object v0, p0, Lb1/g;->F:Lx0/n0;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lx0/n0;->i()V

    iput-object v1, p0, Lb1/g;->F:Lx0/n0;

    :cond_6
    iget-object v0, p0, Lb1/g;->x:Lx0/v0;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lx0/v0;->f()V

    iput-object v1, p0, Lb1/g;->x:Lx0/v0;

    :cond_7
    iget-object v0, p0, Lb1/g;->y:Ly0/r;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ly0/r;->d()V

    iput-object v1, p0, Lb1/g;->y:Ly0/r;

    :cond_8
    iget-object v0, p0, Lb1/g;->w:Lx0/v0;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lx0/v0;->f()V

    iput-object v1, p0, Lb1/g;->w:Lx0/v0;

    :cond_9
    iget-object v0, p0, Lb1/g;->z:Lx0/v0;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lx0/v0;->f()V

    iput-object v1, p0, Lb1/g;->z:Lx0/v0;

    :cond_a
    return-void
.end method

.method public static q0(Lg0/w2;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/w2;",
            ")",
            "Ljava/util/List<",
            "Ln0/j4$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p0}, Lb1/g;->A0(Lg0/w2;)Z

    move-result v1

    if-eqz v1, :cond_1

    check-cast p0, Lb1/g;

    invoke-virtual {p0}, Lb1/g;->s0()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    invoke-virtual {v1}, Lg0/w2;->l()Ln0/i4;

    move-result-object v1

    invoke-interface {v1}, Ln0/i4;->X()Ln0/j4$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object p0

    invoke-interface {p0}, Ln0/i4;->X()Ln0/j4$b;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static r0(Lg0/w2;)I
    .locals 0

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object p0

    invoke-interface {p0}, Ln0/i4;->S()Ln0/o3;

    move-result-object p0

    invoke-virtual {p0}, Ln0/o3;->q()I

    move-result p0

    return p0
.end method

.method private t0(Landroid/util/Size;)Landroid/graphics/Rect;
    .locals 3

    invoke-virtual {p0}, Lg0/w2;->E()Landroid/graphics/Rect;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lg0/w2;->E()Landroid/graphics/Rect;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, v1, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method public static v0(Ljava/util/Set;)Lb1/i;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lg0/w2;",
            ">;)",
            "Lb1/i;"
        }
    .end annotation

    new-instance v0, Lb1/h;

    invoke-direct {v0}, Lb1/h;-><init>()V

    invoke-virtual {v0}, Lb1/h;->a()Ln0/w2;

    move-result-object v0

    sget-object v1, Ln0/h2;->j:Ln0/n1$a;

    const/16 v2, 0x22

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg0/w2;

    invoke-virtual {v2}, Lg0/w2;->l()Ln0/i4;

    move-result-object v3

    sget-object v4, Ln0/i4;->G:Ln0/n1$a;

    invoke-interface {v3, v4}, Ln0/l3;->a(Ln0/n1$a;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lg0/w2;->l()Ln0/i4;

    move-result-object v2

    invoke-interface {v2}, Ln0/i4;->X()Ln0/j4$b;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-string v2, "StreamSharing"

    const-string v3, "A child does not have capture type."

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    sget-object p0, Lb1/i;->Q:Ln0/n1$a;

    invoke-interface {v0, p0, v1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    sget-object p0, Ln0/i2;->p:Ln0/n1$a;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    sget-object p0, Ln0/i4;->K:Ln0/n1$a;

    sget-object v1, Ln0/u3;->g:Ln0/u3;

    invoke-interface {v0, p0, v1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    new-instance p0, Lb1/i;

    invoke-static {v0}, Ln0/c3;->j0(Ln0/n1;)Ln0/c3;

    move-result-object v0

    invoke-direct {p0, v0}, Lb1/i;-><init>(Ln0/c3;)V

    return-object p0
.end method


# virtual methods
.method public A(Ln0/o0;)Ljava/util/Set;
    .locals 3
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

    invoke-virtual {p0}, Lb1/g;->s0()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    invoke-virtual {v1, p1}, Lg0/w2;->A(Ln0/o0;)Ljava/util/Set;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    if-nez v2, :cond_2

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    :cond_2
    invoke-interface {v2, v1}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_3
    return-object v2
.end method

.method public B()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final B0(Landroid/util/Size;Ln0/o3$b;)V
    .locals 3

    invoke-virtual {p0}, Lb1/g;->s0()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    invoke-virtual {v1}, Lg0/w2;->l()Ln0/i4;

    move-result-object v1

    invoke-static {v1, p1}, Ln0/o3$b;->r(Ln0/i4;Landroid/util/Size;)Ln0/o3$b;

    move-result-object v1

    invoke-virtual {v1}, Ln0/o3$b;->p()Ln0/o3;

    move-result-object v1

    invoke-virtual {v1}, Ln0/o3;->k()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p2, v2}, Ln0/o3$b;->c(Ljava/util/Collection;)Ln0/o3$b;

    invoke-virtual {v1}, Ln0/o3;->o()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p2, v2}, Ln0/o3$b;->a(Ljava/util/Collection;)Ln0/o3$b;

    invoke-virtual {v1}, Ln0/o3;->m()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p2, v2}, Ln0/o3$b;->d(Ljava/util/List;)Ln0/o3$b;

    invoke-virtual {v1}, Ln0/o3;->c()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p2, v2}, Ln0/o3$b;->b(Ljava/util/Collection;)Ln0/o3$b;

    invoke-virtual {v1}, Ln0/o3;->g()Ln0/n1;

    move-result-object v1

    invoke-virtual {p2, v1}, Ln0/o3$b;->g(Ln0/n1;)Ln0/o3$b;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final C0(Ln0/o3$b;)V
    .locals 4

    invoke-virtual {p0}, Lb1/g;->s0()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, -0x1

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg0/w2;

    invoke-static {v3}, Lb1/g;->r0(Lg0/w2;)I

    move-result v3

    invoke-static {v2, v3}, Ln0/o3;->f(II)I

    move-result v2

    goto :goto_0

    :cond_0
    if-eq v2, v1, :cond_1

    invoke-virtual {p1, v2}, Ln0/o3$b;->B(I)Ln0/o3$b;

    :cond_1
    return-void
.end method

.method public D(Ln0/n1;)Ln0/i4$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/n1;",
            ")",
            "Ln0/i4$b<",
            "***>;"
        }
    .end annotation

    new-instance v0, Lb1/h;

    invoke-static {p1}, Ln0/x2;->l0(Ln0/n1;)Ln0/x2;

    move-result-object p1

    invoke-direct {v0, p1}, Lb1/h;-><init>(Ln0/x2;)V

    return-object v0
.end method

.method public final D0(Lx0/n0;Lx0/v0;Z)V
    .locals 4

    invoke-virtual {p0}, Lg0/w2;->E()Landroid/graphics/Rect;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lb1/g;->t:Lb1/k;

    invoke-virtual {p0}, Lg0/w2;->C()I

    move-result v2

    invoke-virtual {v1, p1, v2, v0, p3}, Lb1/k;->E(Lx0/n0;IZZ)Ljava/util/Map;

    move-result-object p3

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p1, v1}, Lx0/v0$b;->c(Lx0/n0;Ljava/util/List;)Lx0/v0$b;

    move-result-object v1

    invoke-virtual {p2, v1}, Lx0/v0;->j(Lx0/v0$b;)Lx0/v0$c;

    move-result-object p2

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg0/w2;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx0/n0;

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lb1/g;->t:Lb1/k;

    invoke-virtual {p2, p1, v0}, Lb1/k;->J(Lx0/n0;Z)Ljava/util/Map;

    move-result-object p1

    iget-object p2, p0, Lb1/g;->t:Lb1/k;

    invoke-virtual {p2, v1, p1}, Lb1/k;->T(Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method public final E0(Lx0/n0;Lx0/n0;Ly0/r;Ln0/t3;)V
    .locals 4

    invoke-virtual {p0}, Lg0/w2;->n()Lg0/n;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lg0/w2;->E()Landroid/graphics/Rect;

    move-result-object v0

    if-eqz v0, :cond_0

    move v1, v2

    :cond_0
    iget-object v0, p0, Lb1/g;->t:Lb1/k;

    invoke-virtual {p0}, Lg0/w2;->C()I

    move-result v3

    invoke-virtual {v0, p1, p2, v3, v1}, Lb1/k;->y(Lx0/n0;Lx0/n0;IZ)Ly0/d;

    move-result-object v0

    filled-new-array {v0}, [Ly0/d;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1, p2, v0}, Ly0/r$b;->d(Lx0/n0;Lx0/n0;Ljava/util/List;)Ly0/r$b;

    move-result-object p1

    invoke-virtual {p3, p1}, Ly0/r;->g(Ly0/r$b;)Ly0/r$c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/AbstractMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx0/n0;

    iput-object p1, p0, Lb1/g;->E:Lx0/n0;

    invoke-virtual {p0}, Lg0/w2;->n()Lg0/n;

    move-result-object p1

    invoke-virtual {p1}, Lg0/n;->e()I

    move-result p1

    if-ne p1, v2, :cond_1

    iget-object p1, p0, Lb1/g;->E:Lx0/n0;

    iput-object p1, p0, Lb1/g;->F:Lx0/n0;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lb1/g;->E:Lx0/n0;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p2, Ln0/p0;

    invoke-virtual {p0, p1, p2}, Lb1/g;->w0(Lx0/n0;Ln0/p0;)Lx0/n0;

    move-result-object p1

    iput-object p1, p0, Lb1/g;->F:Lx0/n0;

    :goto_0
    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ln0/p0;

    invoke-virtual {p0, p1, p4}, Lb1/g;->l0(Ln0/p0;Ln0/t3;)Lx0/v0;

    move-result-object p1

    iput-object p1, p0, Lb1/g;->z:Lx0/v0;

    iget-object p2, p0, Lb1/g;->F:Lx0/n0;

    invoke-virtual {p0, p2, p1, v2}, Lb1/g;->D0(Lx0/n0;Lx0/v0;Z)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lg0/w2;->E()Landroid/graphics/Rect;

    move-result-object p3

    if-eqz p3, :cond_3

    move v1, v2

    :cond_3
    iget-object p3, p0, Lb1/g;->t:Lb1/k;

    invoke-virtual {p0}, Lg0/w2;->C()I

    move-result p4

    invoke-virtual {p3, p1, p2, p4, v1}, Lb1/k;->F(Lx0/n0;Lx0/n0;IZ)Ljava/util/Map;

    move-result-object p3

    iget-object p4, p0, Lb1/g;->y:Ly0/r;

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p1, p2, v0}, Ly0/r$b;->d(Lx0/n0;Lx0/n0;Ljava/util/List;)Ly0/r$b;

    move-result-object p2

    invoke-virtual {p4, p2}, Ly0/r;->g(Ly0/r$b;)Ly0/r$c;

    move-result-object p2

    new-instance p4, Ljava/util/HashMap;

    invoke-direct {p4}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg0/w2;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx0/n0;

    invoke-interface {p4, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    iget-object p2, p0, Lb1/g;->t:Lb1/k;

    invoke-virtual {p2, p1, v1}, Lb1/k;->J(Lx0/n0;Z)Ljava/util/Map;

    move-result-object p1

    iget-object p2, p0, Lb1/g;->t:Lb1/k;

    invoke-virtual {p2, p4, p1}, Lb1/k;->T(Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method public F0(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lg0/w2;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg0/w2;

    invoke-virtual {p1}, Lg0/w2;->o()Ljava/util/Set;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg0/w2;->Y(Ljava/util/Set;)V

    return-void
.end method

.method public O()V
    .locals 1

    invoke-super {p0}, Lg0/w2;->O()V

    iget-object v0, p0, Lb1/g;->t:Lb1/k;

    invoke-virtual {v0}, Lb1/k;->t()V

    return-void
.end method

.method public P()V
    .locals 1

    invoke-super {p0}, Lg0/w2;->P()V

    iget-object v0, p0, Lb1/g;->t:Lb1/k;

    invoke-virtual {v0}, Lb1/k;->N()V

    return-void
.end method

.method public Q(Ln0/o0;Ln0/i4$b;)Ln0/i4;
    .locals 1
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

    iget-object p1, p0, Lb1/g;->t:Lb1/k;

    invoke-interface {p2}, Lg0/l0;->a()Ln0/w2;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb1/k;->M(Ln0/w2;)V

    invoke-interface {p2}, Ln0/i4$b;->e()Ln0/i4;

    move-result-object p1

    return-object p1
.end method

.method public R()V
    .locals 1

    invoke-super {p0}, Lg0/w2;->R()V

    iget-object v0, p0, Lb1/g;->t:Lb1/k;

    invoke-virtual {v0}, Lb1/k;->O()V

    return-void
.end method

.method public S()V
    .locals 1

    invoke-super {p0}, Lg0/w2;->S()V

    iget-object v0, p0, Lb1/g;->t:Lb1/k;

    invoke-virtual {v0}, Lb1/k;->P()V

    return-void
.end method

.method public T(Ln0/n1;)Ln0/t3;
    .locals 1

    iget-object v0, p0, Lb1/g;->G:Ln0/o3$b;

    invoke-virtual {v0, p1}, Ln0/o3$b;->g(Ln0/n1;)Ln0/o3$b;

    iget-object v0, p0, Lb1/g;->G:Ln0/o3$b;

    invoke-virtual {v0}, Ln0/o3$b;->p()Ln0/o3;

    move-result-object v0

    invoke-static {v0}, Lg0/p0;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lg0/w2;->d0(Ljava/util/List;)V

    invoke-virtual {p0}, Lg0/w2;->g()Ln0/t3;

    move-result-object v0

    invoke-virtual {v0}, Ln0/t3;->i()Ln0/t3$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Ln0/t3$a;->d(Ln0/n1;)Ln0/t3$a;

    move-result-object p1

    invoke-virtual {p1}, Ln0/t3$a;->a()Ln0/t3;

    move-result-object p1

    return-object p1
.end method

.method public U(Ln0/t3;Ln0/t3;)Ln0/t3;
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onSuggestedStreamSpecUpdated: primaryStreamSpec = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", secondaryStreamSpec "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StreamSharing"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lg0/w2;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lg0/w2;->w()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object v5

    move-object v2, p0

    move-object v6, p1

    move-object v7, p2

    invoke-virtual/range {v2 .. v7}, Lb1/g;->m0(Ljava/lang/String;Ljava/lang/String;Ln0/i4;Ln0/t3;Ln0/t3;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg0/w2;->d0(Ljava/util/List;)V

    invoke-virtual {p0}, Lg0/w2;->J()V

    return-object v6
.end method

.method public V()V
    .locals 1

    invoke-super {p0}, Lg0/w2;->V()V

    invoke-direct {p0}, Lb1/g;->j0()V

    iget-object v0, p0, Lb1/g;->t:Lb1/k;

    invoke-virtual {v0}, Lb1/k;->V()V

    return-void
.end method

.method public final i0(Ln0/o3$b;Ljava/lang/String;Ljava/lang/String;Ln0/i4;Ln0/t3;Ln0/t3;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/o3$b;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ln0/i4<",
            "*>;",
            "Ln0/t3;",
            "Ln0/t3;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lb1/g;->I:Ln0/o3$c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln0/o3$c;->b()V

    :cond_0
    new-instance v0, Ln0/o3$c;

    new-instance v1, Lb1/e;

    move-object v2, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lb1/e;-><init>(Lb1/g;Ljava/lang/String;Ljava/lang/String;Ln0/i4;Ln0/t3;Ln0/t3;)V

    invoke-direct {v0, v1}, Ln0/o3$c;-><init>(Ln0/o3$d;)V

    iput-object v0, v2, Lb1/g;->I:Ln0/o3$c;

    invoke-virtual {p1, v0}, Ln0/o3$b;->u(Ln0/o3$d;)Ln0/o3$b;

    return-void
.end method

.method public final k0(Ln0/p0;Ln0/p0;Ln0/t3;Lg0/i0;Lg0/i0;)Ly0/r;
    .locals 1

    new-instance v0, Ly0/r;

    invoke-virtual {p3}, Ln0/t3;->b()Lg0/k0;

    move-result-object p3

    invoke-static {p3, p4, p5}, Ly0/o$a;->a(Lg0/k0;Lg0/i0;Lg0/i0;)Lx0/r0;

    move-result-object p3

    invoke-direct {v0, p1, p2, p3}, Ly0/r;-><init>(Ln0/p0;Ln0/p0;Lx0/r0;)V

    return-object v0
.end method

.method public final l0(Ln0/p0;Ln0/t3;)Lx0/v0;
    .locals 2

    invoke-virtual {p0}, Lg0/w2;->n()Lg0/n;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lg0/w2;->n()Lg0/n;

    move-result-object v0

    invoke-virtual {v0}, Lg0/n;->e()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance p2, Lx0/v0;

    invoke-virtual {p0}, Lg0/w2;->n()Lg0/n;

    move-result-object v0

    invoke-virtual {v0}, Lg0/n;->a()Lx0/r0;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Lx0/v0;-><init>(Ln0/p0;Lx0/r0;)V

    iput-object p2, p0, Lb1/g;->w:Lx0/v0;

    return-object p2

    :cond_0
    new-instance v0, Lx0/v0;

    invoke-virtual {p2}, Ln0/t3;->b()Lg0/k0;

    move-result-object p2

    invoke-static {p2}, Lx0/t$a;->a(Lg0/k0;)Lx0/r0;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lx0/v0;-><init>(Ln0/p0;Lx0/r0;)V

    return-object v0
.end method

.method public m(ZLn0/j4;)Ln0/i4;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ln0/j4;",
            ")",
            "Ln0/i4<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lb1/g;->s:Lb1/i;

    invoke-interface {v0}, Ln0/i4;->X()Ln0/j4$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p2, v0, v1}, Ln0/j4;->a(Ln0/j4$b;I)Ln0/n1;

    move-result-object p2

    if-eqz p1, :cond_0

    iget-object p1, p0, Lb1/g;->s:Lb1/i;

    invoke-virtual {p1}, Lb1/i;->n()Ln0/n1;

    move-result-object p1

    invoke-static {p2, p1}, Ln0/n1;->L(Ln0/n1;Ln0/n1;)Ln0/n1;

    move-result-object p2

    :cond_0
    if-nez p2, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p0, p2}, Lb1/g;->D(Ln0/n1;)Ln0/i4$b;

    move-result-object p1

    invoke-interface {p1}, Ln0/i4$b;->e()Ln0/i4;

    move-result-object p1

    return-object p1
.end method

.method public final m0(Ljava/lang/String;Ljava/lang/String;Ln0/i4;Ln0/t3;Ln0/t3;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ln0/i4<",
            "*>;",
            "Ln0/t3;",
            "Ln0/t3;",
            ")",
            "Ljava/util/List<",
            "Ln0/o3;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lp0/z;->b()V

    if-nez p5, :cond_0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lb1/g;->n0(Ljava/lang/String;Ljava/lang/String;Ln0/i4;Ln0/t3;Ln0/t3;)Lx0/n0;

    move-result-object p1

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p2, Ln0/p0;

    invoke-virtual {p0, p2, v4}, Lb1/g;->l0(Ln0/p0;Ln0/t3;)Lx0/v0;

    move-result-object p2

    iput-object p2, v0, Lb1/g;->x:Lx0/v0;

    const/4 p3, 0x0

    invoke-virtual {p0, p1, p2, p3}, Lb1/g;->D0(Lx0/n0;Lx0/v0;Z)V

    iget-object p1, v0, Lb1/g;->G:Ln0/o3$b;

    invoke-virtual {p1}, Ln0/o3$b;->p()Ln0/o3;

    move-result-object p1

    invoke-static {p1}, Lg0/p0;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lb1/g;->n0(Ljava/lang/String;Ljava/lang/String;Ln0/i4;Ln0/t3;Ln0/t3;)Lx0/n0;

    move-result-object p1

    invoke-virtual/range {v0 .. v5}, Lb1/g;->o0(Ljava/lang/String;Ljava/lang/String;Ln0/i4;Ln0/t3;Ln0/t3;)Lx0/n0;

    move-result-object p2

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v1

    invoke-virtual {p0}, Lg0/w2;->v()Ln0/p0;

    move-result-object v2

    move-object v3, v4

    iget-object v4, v0, Lb1/g;->u:Lg0/i0;

    iget-object v5, v0, Lb1/g;->v:Lg0/i0;

    invoke-virtual/range {v0 .. v5}, Lb1/g;->k0(Ln0/p0;Ln0/p0;Ln0/t3;Lg0/i0;Lg0/i0;)Ly0/r;

    move-result-object p3

    move-object v4, v3

    iput-object p3, v0, Lb1/g;->y:Ly0/r;

    invoke-virtual {p0, p1, p2, p3, v4}, Lb1/g;->E0(Lx0/n0;Lx0/n0;Ly0/r;Ln0/t3;)V

    iget-object p1, v0, Lb1/g;->G:Ln0/o3$b;

    invoke-virtual {p1}, Ln0/o3$b;->p()Ln0/o3;

    move-result-object p1

    iget-object p2, v0, Lb1/g;->H:Ln0/o3$b;

    invoke-virtual {p2}, Ln0/o3$b;->p()Ln0/o3;

    move-result-object p2

    invoke-static {p1, p2}, Lb1/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final n0(Ljava/lang/String;Ljava/lang/String;Ln0/i4;Ln0/t3;Ln0/t3;)Lx0/n0;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ln0/i4<",
            "*>;",
            "Ln0/t3;",
            "Ln0/t3;",
            ")",
            "Lx0/n0;"
        }
    .end annotation

    new-instance v1, Lx0/n0;

    invoke-virtual {p0}, Lg0/w2;->y()Landroid/graphics/Matrix;

    move-result-object v5

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Ln0/p0;

    invoke-interface {v2}, Ln0/p0;->q()Z

    move-result v6

    invoke-virtual {p4}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object v2

    invoke-direct {p0, v2}, Lb1/g;->t0(Landroid/util/Size;)Landroid/graphics/Rect;

    move-result-object v7

    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Ln0/p0;

    invoke-virtual {p0, v2}, Lg0/w2;->t(Ln0/p0;)I

    move-result v8

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Ln0/p0;

    invoke-virtual {p0, v2}, Lg0/w2;->H(Ln0/p0;)Z

    move-result v10

    const/4 v2, 0x3

    const/16 v3, 0x22

    const/4 v9, -0x1

    move-object v4, p4

    invoke-direct/range {v1 .. v10}, Lx0/n0;-><init>(IILn0/t3;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IIZ)V

    iput-object v1, p0, Lb1/g;->A:Lx0/n0;

    if-eqz p2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v3, Ln0/p0;

    invoke-virtual {p0, v1, v3, v2}, Lb1/g;->z0(Lx0/n0;Ln0/p0;Z)Lx0/n0;

    move-result-object v1

    iput-object v1, p0, Lb1/g;->C:Lx0/n0;

    iget-object v1, p0, Lb1/g;->A:Lx0/n0;

    invoke-virtual {p0, v1, p3, p4}, Lb1/g;->p0(Lx0/n0;Ln0/i4;Ln0/t3;)Ln0/o3$b;

    move-result-object v1

    iput-object v1, p0, Lb1/g;->G:Ln0/o3$b;

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    invoke-virtual/range {v0 .. v6}, Lb1/g;->i0(Ln0/o3$b;Ljava/lang/String;Ljava/lang/String;Ln0/i4;Ln0/t3;Ln0/t3;)V

    iget-object v1, p0, Lb1/g;->C:Lx0/n0;

    return-object v1
.end method

.method public final o0(Ljava/lang/String;Ljava/lang/String;Ln0/i4;Ln0/t3;Ln0/t3;)Lx0/n0;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ln0/i4<",
            "*>;",
            "Ln0/t3;",
            "Ln0/t3;",
            ")",
            "Lx0/n0;"
        }
    .end annotation

    new-instance v1, Lx0/n0;

    invoke-virtual {p0}, Lg0/w2;->y()Landroid/graphics/Matrix;

    move-result-object v5

    invoke-virtual {p0}, Lg0/w2;->v()Ln0/p0;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Ln0/p0;

    invoke-interface {v2}, Ln0/p0;->q()Z

    move-result v6

    invoke-virtual/range {p5 .. p5}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object v2

    invoke-direct {p0, v2}, Lb1/g;->t0(Landroid/util/Size;)Landroid/graphics/Rect;

    move-result-object v7

    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lg0/w2;->v()Ln0/p0;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Ln0/p0;

    invoke-virtual {p0, v2}, Lg0/w2;->t(Ln0/p0;)I

    move-result v8

    invoke-virtual {p0}, Lg0/w2;->v()Ln0/p0;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Ln0/p0;

    invoke-virtual {p0, v2}, Lg0/w2;->H(Ln0/p0;)Z

    move-result v10

    const/4 v2, 0x3

    const/16 v3, 0x22

    const/4 v9, -0x1

    move-object/from16 v4, p5

    invoke-direct/range {v1 .. v10}, Lx0/n0;-><init>(IILn0/t3;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IIZ)V

    iput-object v1, p0, Lb1/g;->B:Lx0/n0;

    invoke-virtual {p0}, Lg0/w2;->v()Ln0/p0;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Ln0/p0;

    const/4 v3, 0x1

    invoke-virtual {p0, v1, v2, v3}, Lb1/g;->z0(Lx0/n0;Ln0/p0;Z)Lx0/n0;

    move-result-object v1

    iput-object v1, p0, Lb1/g;->D:Lx0/n0;

    iget-object v1, p0, Lb1/g;->B:Lx0/n0;

    move-object/from16 v6, p5

    invoke-virtual {p0, v1, p3, v6}, Lb1/g;->p0(Lx0/n0;Ln0/i4;Ln0/t3;)Ln0/o3$b;

    move-result-object v1

    iput-object v1, p0, Lb1/g;->H:Ln0/o3$b;

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v6}, Lb1/g;->i0(Ln0/o3$b;Ljava/lang/String;Ljava/lang/String;Ln0/i4;Ln0/t3;Ln0/t3;)V

    iget-object v1, p0, Lb1/g;->D:Lx0/n0;

    return-object v1
.end method

.method public final p0(Lx0/n0;Ln0/i4;Ln0/t3;)Ln0/o3$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/n0;",
            "Ln0/i4<",
            "*>;",
            "Ln0/t3;",
            ")",
            "Ln0/o3$b;"
        }
    .end annotation

    invoke-virtual {p3}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object v0

    invoke-static {p2, v0}, Ln0/o3$b;->r(Ln0/i4;Landroid/util/Size;)Ln0/o3$b;

    move-result-object p2

    invoke-virtual {p0, p2}, Lb1/g;->C0(Ln0/o3$b;)V

    invoke-virtual {p3}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lb1/g;->B0(Landroid/util/Size;Ln0/o3$b;)V

    invoke-virtual {p1}, Lx0/n0;->o()Ln0/u1;

    move-result-object p1

    invoke-virtual {p3}, Ln0/t3;->b()Lg0/k0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    invoke-virtual {p2, p1, v0, v1, v2}, Ln0/o3$b;->n(Ln0/u1;Lg0/k0;Ljava/lang/String;I)Ln0/o3$b;

    iget-object p1, p0, Lb1/g;->t:Lb1/k;

    invoke-virtual {p1}, Lb1/k;->H()Ln0/u;

    move-result-object p1

    invoke-virtual {p2, p1}, Ln0/o3$b;->j(Ln0/u;)Ln0/o3$b;

    invoke-virtual {p3}, Ln0/t3;->d()Ln0/n1;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p3}, Ln0/t3;->d()Ln0/n1;

    move-result-object p1

    invoke-virtual {p2, p1}, Ln0/o3$b;->g(Ln0/n1;)Ln0/o3$b;

    :cond_0
    invoke-virtual {p3}, Ln0/t3;->g()I

    move-result p1

    invoke-virtual {p2, p1}, Ln0/o3$b;->A(I)Ln0/o3$b;

    invoke-virtual {p0, p2, p3}, Lg0/w2;->b(Ln0/o3$b;Ln0/t3;)V

    return-object p2
.end method

.method public s0()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lg0/w2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lb1/g;->t:Lb1/k;

    invoke-virtual {v0}, Lb1/k;->D()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final u0(Lx0/n0;)Landroid/graphics/Rect;
    .locals 2

    invoke-virtual {p0}, Lg0/w2;->n()Lg0/n;

    move-result-object v0

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/n;

    invoke-virtual {v0}, Lg0/n;->h()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lx0/n0;->s()Ln0/t3;

    move-result-object p1

    invoke-virtual {p1}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object p1

    invoke-static {p1}, Lp0/a0;->r(Landroid/util/Size;)Landroid/graphics/Rect;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lx0/n0;->n()Landroid/graphics/Rect;

    move-result-object p1

    return-object p1
.end method

.method public final w0(Lx0/n0;Ln0/p0;)Lx0/n0;
    .locals 9

    new-instance v0, Lx0/v0;

    invoke-virtual {p0}, Lg0/w2;->n()Lg0/n;

    move-result-object v1

    invoke-virtual {v1}, Lg0/n;->a()Lx0/r0;

    move-result-object v1

    invoke-direct {v0, p2, v1}, Lx0/v0;-><init>(Ln0/p0;Lx0/r0;)V

    iput-object v0, p0, Lb1/g;->w:Lx0/v0;

    invoke-virtual {p0}, Lb1/g;->y0()I

    move-result v6

    invoke-virtual {p0, p1}, Lb1/g;->u0(Lx0/n0;)Landroid/graphics/Rect;

    move-result-object v4

    invoke-virtual {p1}, Lx0/n0;->t()I

    move-result v2

    invoke-virtual {p1}, Lx0/n0;->p()I

    move-result v3

    invoke-static {v4, v6}, Lp0/a0;->f(Landroid/graphics/Rect;I)Landroid/util/Size;

    move-result-object v5

    invoke-virtual {p0}, Lb1/g;->x0()Z

    move-result v7

    const/4 v8, 0x1

    invoke-static/range {v2 .. v8}, Lz0/f;->i(IILandroid/graphics/Rect;Landroid/util/Size;IZZ)Lz0/f;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Lx0/v0$b;->c(Lx0/n0;Ljava/util/List;)Lx0/v0$b;

    move-result-object p1

    iget-object v0, p0, Lb1/g;->w:Lx0/v0;

    invoke-virtual {v0, p1}, Lx0/v0;->j(Lx0/v0$b;)Lx0/v0$c;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx0/n0;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public final x0()Z
    .locals 4

    invoke-virtual {p0}, Lg0/w2;->n()Lg0/n;

    move-result-object v0

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/n;

    invoke-virtual {v0}, Lg0/n;->h()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v0

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/p0;

    invoke-interface {v0}, Ln0/p0;->l()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ln0/p0;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public final y0()I
    .locals 2

    invoke-virtual {p0}, Lg0/w2;->n()Lg0/n;

    move-result-object v0

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/n;

    invoke-virtual {v0}, Lg0/n;->h()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v0

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/p0;

    invoke-virtual {p0, v0}, Lg0/w2;->t(Ln0/p0;)I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final z0(Lx0/n0;Ln0/p0;Z)Lx0/n0;
    .locals 2

    invoke-virtual {p0}, Lg0/w2;->n()Lg0/n;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lg0/w2;->n()Lg0/n;

    move-result-object v0

    invoke-virtual {v0}, Lg0/n;->h()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lg0/w2;->n()Lg0/n;

    move-result-object p3

    invoke-virtual {p3}, Lg0/n;->e()I

    move-result p3

    const/4 v0, 0x1

    if-ne p3, v0, :cond_3

    :goto_0
    return-object p1

    :cond_3
    invoke-virtual {p0, p1, p2}, Lb1/g;->w0(Lx0/n0;Ln0/p0;)Lx0/n0;

    move-result-object p1

    return-object p1
.end method
