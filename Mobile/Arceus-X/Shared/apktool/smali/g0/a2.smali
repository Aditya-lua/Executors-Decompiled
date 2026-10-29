.class public final Lg0/a2;
.super Lg0/w2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg0/a2$c;,
        Lg0/a2$b;,
        Lg0/a2$a;
    }
.end annotation


# static fields
.field public static final A:Lg0/a2$b;

.field public static final B:Ljava/util/concurrent/Executor;


# instance fields
.field public s:Lg0/a2$c;

.field public t:Ljava/util/concurrent/Executor;

.field public u:Ln0/o3$b;

.field public v:Ln0/u1;

.field public w:Lx0/n0;

.field public x:Lg0/v2;

.field public y:Lx0/v0;

.field public z:Ln0/o3$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg0/a2$b;

    invoke-direct {v0}, Lg0/a2$b;-><init>()V

    sput-object v0, Lg0/a2;->A:Lg0/a2$b;

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Lg0/a2;->B:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>(Ln0/f3;)V
    .locals 0

    invoke-direct {p0, p1}, Lg0/w2;-><init>(Ln0/i4;)V

    sget-object p1, Lg0/a2;->B:Ljava/util/concurrent/Executor;

    iput-object p1, p0, Lg0/a2;->t:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic g0(Lg0/a2;Ln0/o3;Ln0/o3$g;)V
    .locals 0

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object p1

    check-cast p1, Ln0/f3;

    invoke-virtual {p0}, Lg0/w2;->g()Ln0/t3;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lg0/a2;->t0(Ln0/f3;Ln0/t3;)V

    invoke-virtual {p0}, Lg0/w2;->L()V

    return-void
.end method

.method public static synthetic h0(Lg0/a2;Ln0/p0;)V
    .locals 1

    iget-object v0, p0, Lg0/a2;->w:Lx0/n0;

    invoke-virtual {p0, v0, p1}, Lg0/a2;->n0(Lx0/n0;Ln0/p0;)V

    return-void
.end method

.method public static synthetic i0(Lg0/a2$c;Lg0/v2;)V
    .locals 0

    invoke-interface {p0, p1}, Lg0/a2$c;->a(Lg0/v2;)V

    return-void
.end method

.method private k0()V
    .locals 2

    iget-object v0, p0, Lg0/a2;->z:Ln0/o3$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln0/o3$c;->b()V

    iput-object v1, p0, Lg0/a2;->z:Ln0/o3$c;

    :cond_0
    iget-object v0, p0, Lg0/a2;->v:Ln0/u1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ln0/u1;->d()V

    iput-object v1, p0, Lg0/a2;->v:Ln0/u1;

    :cond_1
    iget-object v0, p0, Lg0/a2;->y:Lx0/v0;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lx0/v0;->f()V

    iput-object v1, p0, Lg0/a2;->y:Lx0/v0;

    :cond_2
    iget-object v0, p0, Lg0/a2;->w:Lx0/n0;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lx0/n0;->i()V

    iput-object v1, p0, Lg0/a2;->w:Lx0/n0;

    :cond_3
    iget-object v0, p0, Lg0/a2;->x:Lg0/v2;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lg0/v2;->l()V

    :cond_4
    iput-object v1, p0, Lg0/a2;->x:Lg0/v2;

    return-void
.end method


# virtual methods
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

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public D(Ln0/n1;)Ln0/i4$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/n1;",
            ")",
            "Ln0/i4$b<",
            "***>;"
        }
    .end annotation

    invoke-static {p1}, Lg0/a2$a;->g(Ln0/n1;)Lg0/a2$a;

    move-result-object p1

    return-object p1
.end method

.method public Q(Ln0/o0;Ln0/i4$b;)Ln0/i4;
    .locals 2
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

    invoke-interface {p2}, Lg0/l0;->a()Ln0/w2;

    move-result-object p1

    sget-object v0, Ln0/h2;->j:Ln0/n1$a;

    const/16 v1, 0x22

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    invoke-interface {p2}, Ln0/i4$b;->e()Ln0/i4;

    move-result-object p1

    return-object p1
.end method

.method public T(Ln0/n1;)Ln0/t3;
    .locals 1

    iget-object v0, p0, Lg0/a2;->u:Ln0/o3$b;

    invoke-virtual {v0, p1}, Ln0/o3$b;->g(Ln0/n1;)Ln0/o3$b;

    iget-object v0, p0, Lg0/a2;->u:Ln0/o3$b;

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
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onSuggestedStreamSpecUpdated: primaryStreamSpec = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", secondaryStreamSpec "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "Preview"

    invoke-static {v0, p2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object p2

    check-cast p2, Ln0/f3;

    invoke-virtual {p0, p2, p1}, Lg0/a2;->t0(Ln0/f3;Ln0/t3;)V

    return-object p1
.end method

.method public V()V
    .locals 0

    invoke-direct {p0}, Lg0/a2;->k0()V

    return-void
.end method

.method public b0(Landroid/graphics/Rect;)V
    .locals 0

    invoke-super {p0, p1}, Lg0/w2;->b0(Landroid/graphics/Rect;)V

    invoke-virtual {p0}, Lg0/a2;->p0()V

    return-void
.end method

.method public final j0(Ln0/o3$b;Ln0/t3;)V
    .locals 3

    iget-object v0, p0, Lg0/a2;->s:Lg0/a2$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg0/a2;->v:Ln0/u1;

    invoke-virtual {p2}, Ln0/t3;->b()Lg0/k0;

    move-result-object p2

    invoke-virtual {p0}, Lg0/w2;->s()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lg0/w2;->q()I

    move-result v2

    invoke-virtual {p1, v0, p2, v1, v2}, Ln0/o3$b;->n(Ln0/u1;Lg0/k0;Ljava/lang/String;I)Ln0/o3$b;

    :cond_0
    iget-object p2, p0, Lg0/a2;->z:Ln0/o3$c;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ln0/o3$c;->b()V

    :cond_1
    new-instance p2, Ln0/o3$c;

    new-instance v0, Lg0/z1;

    invoke-direct {v0, p0}, Lg0/z1;-><init>(Lg0/a2;)V

    invoke-direct {p2, v0}, Ln0/o3$c;-><init>(Ln0/o3$d;)V

    iput-object p2, p0, Lg0/a2;->z:Ln0/o3$c;

    invoke-virtual {p1, p2}, Ln0/o3$b;->u(Ln0/o3$d;)Ln0/o3$b;

    return-void
.end method

.method public final l0(Ln0/f3;Ln0/t3;)Ln0/o3$b;
    .locals 12

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ln0/p0;

    invoke-direct {p0}, Lg0/a2;->k0()V

    iget-object v1, p0, Lg0/a2;->w:Lx0/n0;

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lx2/g;->i(Z)V

    new-instance v2, Lx0/n0;

    invoke-virtual {p0}, Lg0/w2;->y()Landroid/graphics/Matrix;

    move-result-object v6

    invoke-interface {v0}, Ln0/p0;->q()Z

    move-result v7

    invoke-virtual {p2}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {p0, v1}, Lg0/a2;->m0(Landroid/util/Size;)Landroid/graphics/Rect;

    move-result-object v8

    invoke-static {v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lg0/w2;->H(Ln0/p0;)Z

    move-result v1

    invoke-virtual {p0, v0, v1}, Lg0/w2;->u(Ln0/p0;Z)I

    move-result v9

    invoke-virtual {p0}, Lg0/w2;->f()I

    move-result v10

    invoke-virtual {p0, v0}, Lg0/a2;->s0(Ln0/p0;)Z

    move-result v11

    const/4 v3, 0x1

    const/16 v4, 0x22

    move-object v5, p2

    invoke-direct/range {v2 .. v11}, Lx0/n0;-><init>(IILn0/t3;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IIZ)V

    iput-object v2, p0, Lg0/a2;->w:Lx0/n0;

    invoke-virtual {p0}, Lg0/w2;->n()Lg0/n;

    move-result-object p2

    if-eqz p2, :cond_1

    new-instance v1, Lx0/v0;

    invoke-virtual {p2}, Lg0/n;->a()Lx0/r0;

    move-result-object p2

    invoke-direct {v1, v0, p2}, Lx0/v0;-><init>(Ln0/p0;Lx0/r0;)V

    iput-object v1, p0, Lg0/a2;->y:Lx0/v0;

    iget-object p2, p0, Lg0/a2;->w:Lx0/n0;

    new-instance v1, Lg0/w1;

    invoke-direct {v1, p0}, Lg0/w1;-><init>(Lg0/a2;)V

    invoke-virtual {p2, v1}, Lx0/n0;->e(Ljava/lang/Runnable;)V

    iget-object p2, p0, Lg0/a2;->w:Lx0/n0;

    invoke-static {p2}, Lz0/f;->j(Lx0/n0;)Lz0/f;

    move-result-object p2

    iget-object v1, p0, Lg0/a2;->w:Lx0/n0;

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v1, v2}, Lx0/v0$b;->c(Lx0/n0;Ljava/util/List;)Lx0/v0$b;

    move-result-object v1

    iget-object v2, p0, Lg0/a2;->y:Lx0/v0;

    invoke-virtual {v2, v1}, Lx0/v0;->j(Lx0/v0$b;)Lx0/v0$c;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lx0/n0;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lg0/x1;

    invoke-direct {v1, p0, v0}, Lg0/x1;-><init>(Lg0/a2;Ln0/p0;)V

    invoke-virtual {p2, v1}, Lx0/n0;->e(Ljava/lang/Runnable;)V

    invoke-virtual {p2, v0}, Lx0/n0;->k(Ln0/p0;)Lg0/v2;

    move-result-object p2

    iput-object p2, p0, Lg0/a2;->x:Lg0/v2;

    iget-object p2, p0, Lg0/a2;->w:Lx0/n0;

    invoke-virtual {p2}, Lx0/n0;->o()Ln0/u1;

    move-result-object p2

    iput-object p2, p0, Lg0/a2;->v:Ln0/u1;

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lg0/a2;->w:Lx0/n0;

    new-instance v1, Lg0/w1;

    invoke-direct {v1, p0}, Lg0/w1;-><init>(Lg0/a2;)V

    invoke-virtual {p2, v1}, Lx0/n0;->e(Ljava/lang/Runnable;)V

    iget-object p2, p0, Lg0/a2;->w:Lx0/n0;

    invoke-virtual {p2, v0}, Lx0/n0;->k(Ln0/p0;)Lg0/v2;

    move-result-object p2

    iput-object p2, p0, Lg0/a2;->x:Lg0/v2;

    invoke-virtual {p2}, Lg0/v2;->n()Ln0/u1;

    move-result-object p2

    iput-object p2, p0, Lg0/a2;->v:Ln0/u1;

    :goto_1
    iget-object p2, p0, Lg0/a2;->s:Lg0/a2$c;

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Lg0/a2;->o0()V

    :cond_2
    invoke-virtual {v5}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object p2

    invoke-static {p1, p2}, Ln0/o3$b;->r(Ln0/i4;Landroid/util/Size;)Ln0/o3$b;

    move-result-object p2

    invoke-virtual {v5}, Ln0/t3;->g()I

    move-result v0

    invoke-virtual {p2, v0}, Ln0/o3$b;->A(I)Ln0/o3$b;

    invoke-virtual {p0, p2, v5}, Lg0/w2;->b(Ln0/o3$b;Ln0/t3;)V

    invoke-interface {p1}, Ln0/i4;->E()I

    move-result p1

    invoke-virtual {p2, p1}, Ln0/o3$b;->z(I)Ln0/o3$b;

    invoke-virtual {v5}, Ln0/t3;->d()Ln0/n1;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {v5}, Ln0/t3;->d()Ln0/n1;

    move-result-object p1

    invoke-virtual {p2, p1}, Ln0/o3$b;->g(Ln0/n1;)Ln0/o3$b;

    :cond_3
    invoke-virtual {p0, p2, v5}, Lg0/a2;->j0(Ln0/o3$b;Ln0/t3;)V

    return-object p2
.end method

.method public m(ZLn0/j4;)Ln0/i4;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ln0/j4;",
            ")",
            "Ln0/i4<",
            "*>;"
        }
    .end annotation

    sget-object v0, Lg0/a2;->A:Lg0/a2$b;

    invoke-virtual {v0}, Lg0/a2$b;->a()Ln0/f3;

    move-result-object v1

    invoke-interface {v1}, Ln0/i4;->X()Ln0/j4$b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {p2, v1, v2}, Ln0/j4;->a(Ln0/j4$b;I)Ln0/n1;

    move-result-object p2

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lg0/a2$b;->a()Ln0/f3;

    move-result-object p1

    invoke-static {p2, p1}, Ln0/n1;->L(Ln0/n1;Ln0/n1;)Ln0/n1;

    move-result-object p2

    :cond_0
    if-nez p2, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p0, p2}, Lg0/a2;->D(Ln0/n1;)Ln0/i4$b;

    move-result-object p1

    invoke-interface {p1}, Ln0/i4$b;->e()Ln0/i4;

    move-result-object p1

    return-object p1
.end method

.method public final m0(Landroid/util/Size;)Landroid/graphics/Rect;
    .locals 3

    invoke-virtual {p0}, Lg0/w2;->E()Landroid/graphics/Rect;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lg0/w2;->E()Landroid/graphics/Rect;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p1, :cond_1

    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, v1, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final n0(Lx0/n0;Ln0/p0;)V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v0

    if-ne p2, v0, :cond_0

    invoke-virtual {p1}, Lx0/n0;->v()V

    :cond_0
    return-void
.end method

.method public final o0()V
    .locals 4

    invoke-virtual {p0}, Lg0/a2;->p0()V

    iget-object v0, p0, Lg0/a2;->s:Lg0/a2$c;

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/a2$c;

    iget-object v1, p0, Lg0/a2;->x:Lg0/v2;

    invoke-static {v1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/v2;

    iget-object v2, p0, Lg0/a2;->t:Ljava/util/concurrent/Executor;

    new-instance v3, Lg0/y1;

    invoke-direct {v3, v0, v1}, Lg0/y1;-><init>(Lg0/a2$c;Lg0/v2;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final p0()V
    .locals 3

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v0

    iget-object v1, p0, Lg0/a2;->w:Lx0/n0;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Lg0/w2;->H(Ln0/p0;)Z

    move-result v2

    invoke-virtual {p0, v0, v2}, Lg0/w2;->u(Ln0/p0;Z)I

    move-result v0

    invoke-virtual {p0}, Lg0/w2;->f()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Lx0/n0;->z(II)V

    :cond_0
    return-void
.end method

.method public q0(Lg0/a2$c;)V
    .locals 1

    sget-object v0, Lg0/a2;->B:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lg0/a2;->r0(Ljava/util/concurrent/Executor;Lg0/a2$c;)V

    return-void
.end method

.method public r0(Ljava/util/concurrent/Executor;Lg0/a2$c;)V
    .locals 0

    invoke-static {}, Lp0/z;->b()V

    if-nez p2, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lg0/a2;->s:Lg0/a2$c;

    invoke-virtual {p0}, Lg0/w2;->K()V

    return-void

    :cond_0
    iput-object p2, p0, Lg0/a2;->s:Lg0/a2$c;

    iput-object p1, p0, Lg0/a2;->t:Ljava/util/concurrent/Executor;

    invoke-virtual {p0}, Lg0/w2;->h()Landroid/util/Size;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object p1

    check-cast p1, Ln0/f3;

    invoke-virtual {p0}, Lg0/w2;->g()Ln0/t3;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lg0/a2;->t0(Ln0/f3;Ln0/t3;)V

    invoke-virtual {p0}, Lg0/w2;->L()V

    :cond_1
    invoke-virtual {p0}, Lg0/w2;->J()V

    return-void
.end method

.method public final s0(Ln0/p0;)Z
    .locals 1

    invoke-interface {p1}, Ln0/p0;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lg0/w2;->H(Ln0/p0;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final t0(Ln0/f3;Ln0/t3;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lg0/a2;->l0(Ln0/f3;Ln0/t3;)Ln0/o3$b;

    move-result-object p1

    iput-object p1, p0, Lg0/a2;->u:Ln0/o3$b;

    invoke-virtual {p1}, Ln0/o3$b;->p()Ln0/o3;

    move-result-object p1

    invoke-static {p1}, Lg0/p0;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg0/w2;->d0(Ljava/util/List;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Preview:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lg0/w2;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
