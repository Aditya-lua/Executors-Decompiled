.class public final Lg0/u0;
.super Lg0/w2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg0/u0$a;,
        Lg0/u0$d;,
        Lg0/u0$c;,
        Lg0/u0$e;,
        Lg0/u0$b;
    }
.end annotation


# static fields
.field public static final B:Lg0/u0$d;

.field public static final C:Ljava/lang/Boolean;


# instance fields
.field public A:Ln0/o3$c;

.field public final s:Ljava/lang/Object;

.field public t:Lg0/x0;

.field public u:Ljava/util/concurrent/Executor;

.field public v:Lg0/u0$a;

.field public w:Landroid/graphics/Rect;

.field public x:Landroid/graphics/Matrix;

.field public y:Ln0/o3$b;

.field public z:Ln0/u1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg0/u0$d;

    invoke-direct {v0}, Lg0/u0$d;-><init>()V

    sput-object v0, Lg0/u0;->B:Lg0/u0$d;

    const/4 v0, 0x0

    sput-object v0, Lg0/u0;->C:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Ln0/f2;)V
    .locals 0

    invoke-direct {p0, p1}, Lg0/w2;-><init>(Ln0/i4;)V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/u0;->s:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic g0(Landroidx/camera/core/f;Landroidx/camera/core/f;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/f;->j()V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/camera/core/f;->j()V

    :cond_0
    return-void
.end method

.method public static synthetic h0(Lg0/u0;Lg0/x0;Ln0/o3;Ln0/o3$g;)V
    .locals 0

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lg0/u0;->k0()V

    invoke-virtual {p1}, Lg0/x0;->f()V

    invoke-virtual {p0}, Lg0/w2;->k()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object p2

    check-cast p2, Ln0/f2;

    invoke-virtual {p0}, Lg0/w2;->g()Ln0/t3;

    move-result-object p3

    invoke-static {p3}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ln0/t3;

    invoke-virtual {p0, p1, p2, p3}, Lg0/u0;->l0(Ljava/lang/String;Ln0/f2;Ln0/t3;)Ln0/o3$b;

    move-result-object p1

    iput-object p1, p0, Lg0/u0;->y:Ln0/o3$b;

    invoke-virtual {p1}, Ln0/o3$b;->p()Ln0/o3;

    move-result-object p1

    invoke-static {p1}, Lg0/p0;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg0/w2;->d0(Ljava/util/List;)V

    invoke-virtual {p0}, Lg0/w2;->L()V

    return-void
.end method

.method public static synthetic i0(Lg0/u0$a;Landroidx/camera/core/d;)V
    .locals 0

    invoke-interface {p0, p1}, Lg0/u0$a;->k(Landroidx/camera/core/d;)V

    return-void
.end method

.method public static synthetic j0(Landroid/util/Size;Ljava/util/List;I)Ljava/util/List;
    .locals 0

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {p2, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p2, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    invoke-interface {p2, p1, p0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_0
    return-object p2
.end method


# virtual methods
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

    invoke-static {p1}, Lg0/u0$c;->g(Ln0/n1;)Lg0/u0$c;

    move-result-object p1

    return-object p1
.end method

.method public Q(Ln0/o0;Ln0/i4$b;)Ln0/i4;
    .locals 5
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

    iget-object v0, p0, Lg0/u0;->s:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg0/u0;->v:Lg0/u0$a;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lg0/u0$a;->c()Landroid/util/Size;

    move-result-object v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    move-object v1, v2

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    invoke-interface {p2}, Ln0/i4$b;->e()Ln0/i4;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-interface {p2}, Lg0/l0;->a()Ln0/w2;

    move-result-object v0

    sget-object v3, Ln0/i2;->n:Ln0/n1$a;

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {p1, v0}, Lg0/t;->w(I)I

    move-result p1

    rem-int/lit16 p1, p1, 0xb4

    const/16 v0, 0x5a

    if-ne p1, v0, :cond_2

    new-instance p1, Landroid/util/Size;

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-direct {p1, v0, v1}, Landroid/util/Size;-><init>(II)V

    move-object v1, p1

    :cond_2
    invoke-interface {p2}, Ln0/i4$b;->e()Ln0/i4;

    move-result-object p1

    sget-object v0, Ln0/i2;->q:Ln0/n1$a;

    invoke-interface {p1, v0}, Ln0/l3;->a(Ln0/n1$a;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-interface {p2}, Lg0/l0;->a()Ln0/w2;

    move-result-object p1

    invoke-interface {p1, v0, v1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    :cond_3
    invoke-interface {p2}, Ln0/i4$b;->e()Ln0/i4;

    move-result-object p1

    sget-object v0, Ln0/i2;->u:Ln0/n1$a;

    invoke-interface {p1, v0}, Ln0/l3;->a(Ln0/n1$a;)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Lg0/w2;->e()Ln0/i4;

    move-result-object p1

    invoke-interface {p1, v0, v2}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La1/c;

    if-nez p1, :cond_4

    new-instance v2, La1/c$a;

    invoke-direct {v2}, La1/c$a;-><init>()V

    goto :goto_1

    :cond_4
    invoke-static {p1}, La1/c$a;->b(La1/c;)La1/c$a;

    move-result-object v2

    :goto_1
    if-eqz p1, :cond_5

    invoke-virtual {p1}, La1/c;->d()La1/d;

    move-result-object v3

    if-nez v3, :cond_6

    :cond_5
    new-instance v3, La1/d;

    const/4 v4, 0x1

    invoke-direct {v3, v1, v4}, La1/d;-><init>(Landroid/util/Size;I)V

    invoke-virtual {v2, v3}, La1/c$a;->f(La1/d;)La1/c$a;

    :cond_6
    if-nez p1, :cond_7

    new-instance p1, Lg0/t0;

    invoke-direct {p1, v1}, Lg0/t0;-><init>(Landroid/util/Size;)V

    invoke-virtual {v2, p1}, La1/c$a;->e(La1/b;)La1/c$a;

    :cond_7
    invoke-interface {p2}, Lg0/l0;->a()Ln0/w2;

    move-result-object p1

    invoke-virtual {v2}, La1/c$a;->a()La1/c;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    :cond_8
    invoke-interface {p2}, Ln0/i4$b;->e()Ln0/i4;

    move-result-object p1

    return-object p1

    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public T(Ln0/n1;)Ln0/t3;
    .locals 1

    iget-object v0, p0, Lg0/u0;->y:Ln0/o3$b;

    invoke-virtual {v0, p1}, Ln0/o3$b;->g(Ln0/n1;)Ln0/o3$b;

    iget-object v0, p0, Lg0/u0;->y:Ln0/o3$b;

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

    const-string v0, "ImageAnalysis"

    invoke-static {v0, p2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object p2

    check-cast p2, Ln0/f2;

    invoke-virtual {p0}, Lg0/w2;->k()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p2, p1}, Lg0/u0;->l0(Ljava/lang/String;Ln0/f2;Ln0/t3;)Ln0/o3$b;

    move-result-object p2

    iput-object p2, p0, Lg0/u0;->y:Ln0/o3$b;

    invoke-virtual {p2}, Ln0/o3$b;->p()Ln0/o3;

    move-result-object p2

    invoke-static {p2}, Lg0/p0;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p2}, Lg0/w2;->d0(Ljava/util/List;)V

    return-object p1
.end method

.method public V()V
    .locals 2

    invoke-virtual {p0}, Lg0/u0;->k0()V

    iget-object v0, p0, Lg0/u0;->s:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg0/u0;->t:Lg0/x0;

    invoke-virtual {v1}, Lg0/x0;->i()V

    const/4 v1, 0x0

    iput-object v1, p0, Lg0/u0;->t:Lg0/x0;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public Z(Landroid/graphics/Matrix;)V
    .locals 2

    invoke-super {p0, p1}, Lg0/w2;->Z(Landroid/graphics/Matrix;)V

    iget-object v0, p0, Lg0/u0;->s:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg0/u0;->t:Lg0/x0;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lg0/x0;->u(Landroid/graphics/Matrix;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iput-object p1, p0, Lg0/u0;->x:Landroid/graphics/Matrix;

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b0(Landroid/graphics/Rect;)V
    .locals 2

    invoke-super {p0, p1}, Lg0/w2;->b0(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lg0/u0;->s:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg0/u0;->t:Lg0/x0;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lg0/x0;->v(Landroid/graphics/Rect;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iput-object p1, p0, Lg0/u0;->w:Landroid/graphics/Rect;

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public k0()V
    .locals 2

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lg0/u0;->A:Ln0/o3$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln0/o3$c;->b()V

    iput-object v1, p0, Lg0/u0;->A:Ln0/o3$c;

    :cond_0
    iget-object v0, p0, Lg0/u0;->z:Ln0/u1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ln0/u1;->d()V

    iput-object v1, p0, Lg0/u0;->z:Ln0/u1;

    :cond_1
    return-void
.end method

.method public l0(Ljava/lang/String;Ln0/f2;Ln0/t3;)Ln0/o3$b;
    .locals 12

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p3}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object p1

    invoke-static {}, Lq0/c;->c()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-interface {p2, v0}, Ls0/r;->e0(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    invoke-virtual {p0}, Lg0/u0;->m0()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    invoke-virtual {p0}, Lg0/u0;->n0()I

    move-result v1

    :goto_0
    move v7, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x4

    goto :goto_0

    :goto_1
    invoke-virtual {p2}, Ln0/f2;->j0()Lg0/m1;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v1, Landroidx/camera/core/f;

    invoke-virtual {p2}, Ln0/f2;->j0()Lg0/m1;

    move-result-object v3

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v4

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v5

    invoke-virtual {p0}, Lg0/w2;->p()I

    move-result v6

    const-wide/16 v8, 0x0

    invoke-interface/range {v3 .. v9}, Lg0/m1;->a(IIIIJ)Ln0/j2;

    move-result-object v3

    invoke-direct {v1, v3}, Landroidx/camera/core/f;-><init>(Ln0/j2;)V

    goto :goto_2

    :cond_1
    new-instance v1, Landroidx/camera/core/f;

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v4

    invoke-virtual {p0}, Lg0/w2;->p()I

    move-result v5

    invoke-static {v3, v4, v5, v7}, Lg0/n1;->a(IIII)Ln0/j2;

    move-result-object v3

    invoke-direct {v1, v3}, Landroidx/camera/core/f;-><init>(Ln0/j2;)V

    :goto_2
    iget-object v3, p0, Lg0/u0;->s:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    invoke-virtual {p0}, Lg0/u0;->s0()V

    iget-object v4, p0, Lg0/u0;->t:Lg0/x0;

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v3

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v3

    invoke-virtual {p0, v3}, Lg0/u0;->q0(Ln0/p0;)Z

    move-result v3

    goto :goto_3

    :cond_2
    move v3, v5

    :goto_3
    if-eqz v3, :cond_3

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v6

    goto :goto_4

    :cond_3
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v6

    :goto_4
    if-eqz v3, :cond_4

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v3

    goto :goto_5

    :cond_4
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v3

    :goto_5
    invoke-virtual {p0}, Lg0/u0;->p0()I

    move-result v7

    const/4 v8, 0x2

    const/16 v9, 0x23

    if-ne v7, v8, :cond_5

    move v7, v2

    goto :goto_6

    :cond_5
    move v7, v9

    :goto_6
    invoke-virtual {p0}, Lg0/w2;->p()I

    move-result v10

    if-ne v10, v9, :cond_6

    invoke-virtual {p0}, Lg0/u0;->p0()I

    move-result v10

    if-ne v10, v8, :cond_6

    move v8, v2

    goto :goto_7

    :cond_6
    move v8, v5

    :goto_7
    invoke-virtual {p0}, Lg0/w2;->p()I

    move-result v10

    if-ne v10, v9, :cond_7

    invoke-virtual {p0}, Lg0/u0;->p0()I

    move-result v10

    const/4 v11, 0x3

    if-ne v10, v11, :cond_7

    move v10, v2

    goto :goto_8

    :cond_7
    move v10, v5

    :goto_8
    invoke-virtual {p0}, Lg0/w2;->p()I

    move-result v11

    if-ne v11, v9, :cond_9

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v9

    if-eqz v9, :cond_8

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v9

    invoke-virtual {p0, v9}, Lg0/w2;->t(Ln0/p0;)I

    move-result v9

    if-nez v9, :cond_a

    :cond_8
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0}, Lg0/u0;->o0()Ljava/lang/Boolean;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    goto :goto_9

    :cond_9
    move v2, v5

    :cond_a
    :goto_9
    const/4 v5, 0x0

    if-nez v8, :cond_c

    if-eqz v2, :cond_b

    if-nez v10, :cond_b

    goto :goto_a

    :cond_b
    move-object v2, v5

    goto :goto_b

    :cond_c
    :goto_a
    new-instance v2, Landroidx/camera/core/f;

    invoke-virtual {v1}, Landroidx/camera/core/f;->e()I

    move-result v8

    invoke-static {v6, v3, v7, v8}, Lg0/n1;->a(IIII)Ln0/j2;

    move-result-object v3

    invoke-direct {v2, v3}, Landroidx/camera/core/f;-><init>(Ln0/j2;)V

    :goto_b
    if-eqz v2, :cond_d

    invoke-virtual {v4, v2}, Lg0/x0;->s(Landroidx/camera/core/f;)V

    :cond_d
    invoke-virtual {p0}, Lg0/u0;->v0()V

    invoke-virtual {v1, v4, v0}, Landroidx/camera/core/f;->f(Ln0/j2$a;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p3}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object v0

    invoke-static {p2, v0}, Ln0/o3$b;->r(Ln0/i4;Landroid/util/Size;)Ln0/o3$b;

    move-result-object p2

    invoke-virtual {p3}, Ln0/t3;->d()Ln0/n1;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {p3}, Ln0/t3;->d()Ln0/n1;

    move-result-object v0

    invoke-virtual {p2, v0}, Ln0/o3$b;->g(Ln0/n1;)Ln0/o3$b;

    :cond_e
    iget-object v0, p0, Lg0/u0;->z:Ln0/u1;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Ln0/u1;->d()V

    :cond_f
    new-instance v0, Ln0/k2;

    invoke-virtual {v1}, Landroidx/camera/core/f;->getSurface()Landroid/view/Surface;

    move-result-object v3

    invoke-virtual {p0}, Lg0/w2;->p()I

    move-result v6

    invoke-direct {v0, v3, p1, v6}, Ln0/k2;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    iput-object v0, p0, Lg0/u0;->z:Ln0/u1;

    invoke-virtual {v0}, Ln0/u1;->k()Lne/x;

    move-result-object p1

    new-instance v0, Lg0/q0;

    invoke-direct {v0, v1, v2}, Lg0/q0;-><init>(Landroidx/camera/core/f;Landroidx/camera/core/f;)V

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p3}, Ln0/t3;->g()I

    move-result p1

    invoke-virtual {p2, p1}, Ln0/o3$b;->A(I)Ln0/o3$b;

    invoke-virtual {p0, p2, p3}, Lg0/w2;->b(Ln0/o3$b;Ln0/t3;)V

    iget-object p1, p0, Lg0/u0;->z:Ln0/u1;

    invoke-virtual {p3}, Ln0/t3;->b()Lg0/k0;

    move-result-object p3

    const/4 v0, -0x1

    invoke-virtual {p2, p1, p3, v5, v0}, Ln0/o3$b;->n(Ln0/u1;Lg0/k0;Ljava/lang/String;I)Ln0/o3$b;

    iget-object p1, p0, Lg0/u0;->A:Ln0/o3$c;

    if-eqz p1, :cond_10

    invoke-virtual {p1}, Ln0/o3$c;->b()V

    :cond_10
    new-instance p1, Ln0/o3$c;

    new-instance p3, Lg0/r0;

    invoke-direct {p3, p0, v4}, Lg0/r0;-><init>(Lg0/u0;Lg0/x0;)V

    invoke-direct {p1, p3}, Ln0/o3$c;-><init>(Ln0/o3$d;)V

    iput-object p1, p0, Lg0/u0;->A:Ln0/o3$c;

    invoke-virtual {p2, p1}, Ln0/o3$b;->u(Ln0/o3$d;)Ln0/o3$b;

    return-object p2

    :catchall_0
    move-exception v0

    move-object p1, v0

    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
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

    sget-object v0, Lg0/u0;->B:Lg0/u0$d;

    invoke-virtual {v0}, Lg0/u0$d;->a()Ln0/f2;

    move-result-object v1

    invoke-interface {v1}, Ln0/i4;->X()Ln0/j4$b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {p2, v1, v2}, Ln0/j4;->a(Ln0/j4$b;I)Ln0/n1;

    move-result-object p2

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lg0/u0$d;->a()Ln0/f2;

    move-result-object p1

    invoke-static {p2, p1}, Ln0/n1;->L(Ln0/n1;Ln0/n1;)Ln0/n1;

    move-result-object p2

    :cond_0
    if-nez p2, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p0, p2}, Lg0/u0;->D(Ln0/n1;)Ln0/i4$b;

    move-result-object p1

    invoke-interface {p1}, Ln0/i4$b;->e()Ln0/i4;

    move-result-object p1

    return-object p1
.end method

.method public m0()I
    .locals 2

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object v0

    check-cast v0, Ln0/f2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ln0/f2;->h0(I)I

    move-result v0

    return v0
.end method

.method public n0()I
    .locals 2

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object v0

    check-cast v0, Ln0/f2;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Ln0/f2;->i0(I)I

    move-result v0

    return v0
.end method

.method public o0()Ljava/lang/Boolean;
    .locals 2

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object v0

    check-cast v0, Ln0/f2;

    sget-object v1, Lg0/u0;->C:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ln0/f2;->k0(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public p0()I
    .locals 2

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object v0

    check-cast v0, Ln0/f2;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ln0/f2;->l0(I)I

    move-result v0

    return v0
.end method

.method public final q0(Ln0/p0;)Z
    .locals 2

    invoke-virtual {p0}, Lg0/u0;->r0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lg0/w2;->t(Ln0/p0;)I

    move-result p1

    rem-int/lit16 p1, p1, 0xb4

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public r0()Z
    .locals 2

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object v0

    check-cast v0, Ln0/f2;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ln0/f2;->m0(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final s0()V
    .locals 5

    iget-object v0, p0, Lg0/u0;->s:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object v1

    check-cast v1, Ln0/f2;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ln0/f2;->h0(I)I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    new-instance v1, Lg0/y0;

    invoke-direct {v1}, Lg0/y0;-><init>()V

    iput-object v1, p0, Lg0/u0;->t:Lg0/x0;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_0
    new-instance v3, Landroidx/camera/core/c;

    invoke-static {}, Lq0/c;->c()Ljava/util/concurrent/Executor;

    move-result-object v4

    invoke-interface {v1, v4}, Ls0/r;->e0(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-direct {v3, v1}, Landroidx/camera/core/c;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v3, p0, Lg0/u0;->t:Lg0/x0;

    :goto_0
    iget-object v1, p0, Lg0/u0;->t:Lg0/x0;

    invoke-virtual {p0}, Lg0/u0;->p0()I

    move-result v3

    invoke-virtual {v1, v3}, Lg0/x0;->q(I)V

    iget-object v1, p0, Lg0/u0;->t:Lg0/x0;

    invoke-virtual {p0}, Lg0/u0;->r0()Z

    move-result v3

    invoke-virtual {v1, v3}, Lg0/x0;->r(Z)V

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v1

    invoke-virtual {p0}, Lg0/u0;->o0()Ljava/lang/Boolean;

    move-result-object v3

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ln0/p0;->k()Ln0/o0;

    move-result-object v2

    invoke-interface {v2}, Ln0/o0;->l()Ln0/k3;

    move-result-object v2

    const-class v4, Landroidx/camera/core/internal/compat/quirk/OnePixelShiftQuirk;

    invoke-virtual {v2, v4}, Ln0/k3;->a(Ljava/lang/Class;)Z

    move-result v2

    :cond_1
    iget-object v4, p0, Lg0/u0;->t:Lg0/x0;

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :goto_1
    invoke-virtual {v4, v2}, Lg0/x0;->p(Z)V

    if-eqz v1, :cond_3

    iget-object v2, p0, Lg0/u0;->t:Lg0/x0;

    invoke-virtual {p0, v1}, Lg0/w2;->t(Ln0/p0;)I

    move-result v1

    invoke-virtual {v2, v1}, Lg0/x0;->t(I)V

    :cond_3
    iget-object v1, p0, Lg0/u0;->w:Landroid/graphics/Rect;

    if-eqz v1, :cond_4

    iget-object v2, p0, Lg0/u0;->t:Lg0/x0;

    invoke-virtual {v2, v1}, Lg0/x0;->v(Landroid/graphics/Rect;)V

    :cond_4
    iget-object v1, p0, Lg0/u0;->x:Landroid/graphics/Matrix;

    if-eqz v1, :cond_5

    iget-object v2, p0, Lg0/u0;->t:Lg0/x0;

    invoke-virtual {v2, v1}, Lg0/x0;->u(Landroid/graphics/Matrix;)V

    :cond_5
    iget-object v1, p0, Lg0/u0;->u:Ljava/util/concurrent/Executor;

    if-eqz v1, :cond_6

    iget-object v2, p0, Lg0/u0;->v:Lg0/u0$a;

    if-eqz v2, :cond_6

    iget-object v3, p0, Lg0/u0;->t:Lg0/x0;

    invoke-virtual {v3, v1, v2}, Lg0/x0;->o(Ljava/util/concurrent/Executor;Lg0/u0$a;)V

    :cond_6
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public t0(Ljava/util/concurrent/Executor;Lg0/u0$a;)V
    .locals 3

    iget-object v0, p0, Lg0/u0;->s:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg0/u0;->t:Lg0/x0;

    if-eqz v1, :cond_0

    new-instance v2, Lg0/s0;

    invoke-direct {v2, p2}, Lg0/s0;-><init>(Lg0/u0$a;)V

    invoke-virtual {v1, p1, v2}, Lg0/x0;->o(Ljava/util/concurrent/Executor;Lg0/u0$a;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lg0/u0;->v:Lg0/u0$a;

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lg0/w2;->J()V

    :cond_1
    iput-object p1, p0, Lg0/u0;->u:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lg0/u0;->v:Lg0/u0$a;

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ImageAnalysis:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lg0/w2;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u0(I)V
    .locals 0

    invoke-virtual {p0, p1}, Lg0/w2;->a0(I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lg0/u0;->v0()V

    :cond_0
    return-void
.end method

.method public final v0()V
    .locals 3

    iget-object v0, p0, Lg0/u0;->s:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lg0/u0;->t:Lg0/x0;

    invoke-virtual {p0, v1}, Lg0/w2;->t(Ln0/p0;)I

    move-result v1

    invoke-virtual {v2, v1}, Lg0/x0;->t(I)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
