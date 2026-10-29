.class public Lm0/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static f:I

.field public static final g:Lv0/b;


# instance fields
.field public final a:Ln0/g2;

.field public final b:Ln0/l1;

.field public final c:Lm0/x;

.field public final d:Lm0/u0;

.field public final e:Lm0/x$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv0/b;

    invoke-direct {v0}, Lv0/b;-><init>()V

    sput-object v0, Lm0/d0;->g:Lv0/b;

    return-void
.end method

.method public constructor <init>(Ln0/g2;Landroid/util/Size;Landroid/hardware/camera2/CameraCharacteristics;Lg0/n;ZLm0/k0;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lp0/z;->b()V

    iput-object p1, p0, Lm0/d0;->a:Ln0/g2;

    invoke-static {p1}, Ln0/l1$a;->j(Ln0/i4;)Ln0/l1$a;

    move-result-object v0

    invoke-virtual {v0}, Ln0/l1$a;->h()Ln0/l1;

    move-result-object v0

    iput-object v0, p0, Lm0/d0;->b:Ln0/l1;

    new-instance v0, Lm0/x;

    invoke-direct {v0}, Lm0/x;-><init>()V

    iput-object v0, p0, Lm0/d0;->c:Lm0/x;

    new-instance v1, Lm0/u0;

    invoke-static {}, Lq0/c;->d()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-virtual {p1, v2}, Ln0/g2;->m0(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/Executor;

    if-eqz p4, :cond_0

    new-instance v3, Lx0/y;

    invoke-direct {v3, p4}, Lx0/y;-><init>(Lg0/n;)V

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-direct {v1, v2, p3, v3}, Lm0/u0;-><init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCharacteristics;Lx0/y;)V

    iput-object v1, p0, Lm0/d0;->d:Lm0/u0;

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ln0/h2;->Z()I

    move-result p4

    if-eqz p4, :cond_1

    const/16 p4, 0x20

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/16 p4, 0x100

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    move-object p4, p1

    move-object p1, p2

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Lm0/d0;->i()I

    move-result p4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :goto_2
    invoke-virtual {p4}, Ln0/g2;->p()I

    move-result p2

    invoke-virtual {p4}, Ln0/g2;->l0()Lg0/m1;

    move-result-object p4

    move v4, p5

    move-object p5, p4

    move p4, v4

    invoke-static/range {p1 .. p6}, Lm0/x$c;->n(Landroid/util/Size;ILjava/util/List;ZLg0/m1;Lm0/k0;)Lm0/x$c;

    move-result-object p1

    iput-object p1, p0, Lm0/d0;->e:Lm0/x$c;

    invoke-virtual {v0, p1}, Lm0/x;->s(Lm0/x$c;)Lm0/u0$a;

    move-result-object p1

    invoke-virtual {v1, p1}, Lm0/u0;->r(Lm0/u0$a;)Ljava/lang/Void;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lm0/d0;->c:Lm0/x;

    invoke-virtual {v0}, Lm0/x;->n()V

    iget-object v0, p0, Lm0/d0;->d:Lm0/u0;

    invoke-virtual {v0}, Lm0/u0;->n()V

    return-void
.end method

.method public final b(ILn0/k1;Lm0/l1;Lm0/a1;)Lm0/n;
    .locals 7

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2}, Ln0/k1;->a()Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/m1;

    new-instance v3, Ln0/l1$a;

    invoke-direct {v3}, Ln0/l1$a;-><init>()V

    iget-object v4, p0, Lm0/d0;->b:Ln0/l1;

    invoke-virtual {v4}, Ln0/l1;->k()I

    move-result v4

    invoke-virtual {v3, v4}, Ln0/l1$a;->v(I)V

    iget-object v4, p0, Lm0/d0;->b:Ln0/l1;

    invoke-virtual {v4}, Ln0/l1;->g()Ln0/n1;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln0/l1$a;->e(Ln0/n1;)V

    invoke-virtual {p3}, Lm0/l1;->q()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln0/l1$a;->a(Ljava/util/Collection;)V

    iget-object v4, p0, Lm0/d0;->e:Lm0/x$c;

    invoke-virtual {v4}, Lm0/x$c;->l()Ln0/u1;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln0/l1$a;->f(Ln0/u1;)V

    iget-object v4, p0, Lm0/d0;->e:Lm0/x$c;

    invoke-virtual {v4}, Lm0/x$c;->e()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x1

    if-le v4, v5, :cond_0

    iget-object v4, p0, Lm0/d0;->e:Lm0/x$c;

    invoke-virtual {v4}, Lm0/x$c;->j()Ln0/u1;

    move-result-object v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lm0/d0;->e:Lm0/x$c;

    invoke-virtual {v4}, Lm0/x$c;->j()Ln0/u1;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln0/l1$a;->f(Ln0/u1;)V

    :cond_0
    invoke-virtual {p0}, Lm0/d0;->l()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v6, p0, Lm0/d0;->e:Lm0/x$c;

    invoke-virtual {v6}, Lm0/x$c;->g()Ln0/u1;

    move-result-object v6

    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v6}, Ln0/l1$a;->f(Ln0/u1;)V

    :cond_1
    invoke-virtual {v3, v4}, Ln0/l1$a;->t(Z)V

    iget-object v4, p0, Lm0/d0;->e:Lm0/x$c;

    invoke-virtual {v4}, Lm0/x$c;->d()I

    move-result v4

    invoke-static {v4}, Lw0/b;->j(I)Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, p0, Lm0/d0;->e:Lm0/x$c;

    invoke-virtual {v4}, Lm0/x$c;->d()I

    move-result v4

    invoke-static {v4}, Lw0/b;->k(I)Z

    move-result v4

    if-eqz v4, :cond_4

    :cond_2
    sget-object v4, Lm0/d0;->g:Lv0/b;

    invoke-virtual {v4}, Lv0/b;->a()Z

    move-result v4

    if-eqz v4, :cond_3

    sget-object v4, Ln0/l1;->i:Ln0/n1$a;

    invoke-virtual {p3}, Lm0/l1;->n()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v3, v4, v6}, Ln0/l1$a;->d(Ln0/n1$a;Ljava/lang/Object;)V

    :cond_3
    sget-object v4, Ln0/l1;->j:Ln0/n1$a;

    invoke-virtual {p0, p3}, Lm0/d0;->g(Lm0/l1;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v3, v4, v6}, Ln0/l1$a;->d(Ln0/n1$a;Ljava/lang/Object;)V

    :cond_4
    invoke-interface {v2}, Ln0/m1;->a()Ln0/l1;

    move-result-object v4

    invoke-virtual {v4}, Ln0/l1;->g()Ln0/n1;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln0/l1$a;->e(Ln0/n1;)V

    invoke-interface {v2}, Ln0/m1;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v1, v2}, Ln0/l1$a;->g(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v3, p1}, Ln0/l1$a;->r(I)V

    iget-object v2, p0, Lm0/d0;->e:Lm0/x$c;

    invoke-virtual {v2}, Lm0/x$c;->a()Ln0/u;

    move-result-object v2

    invoke-virtual {v3, v2}, Ln0/l1$a;->c(Ln0/u;)V

    iget-object v2, p0, Lm0/d0;->e:Lm0/x$c;

    invoke-virtual {v2}, Lm0/x$c;->e()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-le v2, v5, :cond_5

    iget-object v2, p0, Lm0/d0;->e:Lm0/x$c;

    invoke-virtual {v2}, Lm0/x$c;->i()Ln0/u;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lm0/d0;->e:Lm0/x$c;

    invoke-virtual {v2}, Lm0/x$c;->i()Ln0/u;

    move-result-object v2

    invoke-virtual {v3, v2}, Ln0/l1$a;->c(Ln0/u;)V

    :cond_5
    invoke-virtual {v3}, Ln0/l1$a;->h()Ln0/l1;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_6
    new-instance p1, Lm0/n;

    invoke-direct {p1, v0, p4}, Lm0/n;-><init>(Ljava/util/List;Lm0/a1;)V

    return-object p1
.end method

.method public final c()Ln0/k1;
    .locals 2

    iget-object v0, p0, Lm0/d0;->a:Ln0/g2;

    invoke-static {}, Lg0/h0;->b()Ln0/k1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln0/g2;->h0(Ln0/k1;)Ln0/k1;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ln0/k1;

    return-object v0
.end method

.method public final d(ILn0/k1;Lm0/l1;Lm0/a1;Lne/x;)Lm0/v0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ln0/k1;",
            "Lm0/l1;",
            "Lm0/a1;",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;)",
            "Lm0/v0;"
        }
    .end annotation

    new-instance v0, Lm0/v0;

    move v5, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    invoke-direct/range {v0 .. v5}, Lm0/v0;-><init>(Ln0/k1;Lm0/l1;Lm0/a1;Lne/x;I)V

    return-object v0
.end method

.method public e(Lm0/l1;Lm0/a1;Lne/x;)Lx2/c;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm0/l1;",
            "Lm0/a1;",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;)",
            "Lx2/c<",
            "Lm0/n;",
            "Lm0/v0;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p0}, Lm0/d0;->c()Ln0/k1;

    move-result-object v2

    sget v1, Lm0/d0;->f:I

    add-int/lit8 v0, v1, 0x1

    sput v0, Lm0/d0;->f:I

    new-instance v6, Lx2/c;

    invoke-virtual {p0, v1, v2, p1, p2}, Lm0/d0;->b(ILn0/k1;Lm0/l1;Lm0/a1;)Lm0/n;

    move-result-object v7

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, Lm0/d0;->d(ILn0/k1;Lm0/l1;Lm0/a1;Lne/x;)Lm0/v0;

    move-result-object p1

    invoke-direct {v6, v7, p1}, Lx2/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v6
.end method

.method public f(Landroid/util/Size;)Ln0/o3$b;
    .locals 2

    iget-object v0, p0, Lm0/d0;->a:Ln0/g2;

    invoke-static {v0, p1}, Ln0/o3$b;->r(Ln0/i4;Landroid/util/Size;)Ln0/o3$b;

    move-result-object p1

    iget-object v0, p0, Lm0/d0;->e:Lm0/x$c;

    invoke-virtual {v0}, Lm0/x$c;->l()Ln0/u1;

    move-result-object v0

    invoke-virtual {p1, v0}, Ln0/o3$b;->h(Ln0/u1;)Ln0/o3$b;

    iget-object v0, p0, Lm0/d0;->e:Lm0/x$c;

    invoke-virtual {v0}, Lm0/x$c;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lm0/d0;->e:Lm0/x$c;

    invoke-virtual {v0}, Lm0/x$c;->j()Ln0/u1;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm0/d0;->e:Lm0/x$c;

    invoke-virtual {v0}, Lm0/x$c;->j()Ln0/u1;

    move-result-object v0

    invoke-virtual {p1, v0}, Ln0/o3$b;->h(Ln0/u1;)Ln0/o3$b;

    :cond_0
    iget-object v0, p0, Lm0/d0;->e:Lm0/x$c;

    invoke-virtual {v0}, Lm0/x$c;->g()Ln0/u1;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lm0/d0;->e:Lm0/x$c;

    invoke-virtual {v0}, Lm0/x$c;->g()Ln0/u1;

    move-result-object v0

    invoke-virtual {p1, v0}, Ln0/o3$b;->y(Ln0/u1;)Ln0/o3$b;

    :cond_1
    return-object p1
.end method

.method public g(Lm0/l1;)I
    .locals 3

    invoke-virtual {p1}, Lm0/l1;->l()Lg0/f1$g;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lm0/l1;->i()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Lm0/d0;->e:Lm0/x$c;

    invoke-virtual {v2}, Lm0/x$c;->k()Landroid/util/Size;

    move-result-object v2

    invoke-static {v1, v2}, Lp0/a0;->h(Landroid/graphics/Rect;Landroid/util/Size;)Z

    move-result v1

    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lm0/l1;->h()I

    move-result p1

    if-nez p1, :cond_1

    const/16 p1, 0x64

    return p1

    :cond_1
    const/16 p1, 0x5f

    return p1

    :cond_2
    invoke-virtual {p1}, Lm0/l1;->k()I

    move-result p1

    return p1
.end method

.method public h()I
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lm0/d0;->c:Lm0/x;

    invoke-virtual {v0}, Lm0/x;->i()I

    move-result v0

    return v0
.end method

.method public final i()I
    .locals 3

    iget-object v0, p0, Lm0/d0;->a:Ln0/g2;

    sget-object v1, Ln0/g2;->T:Ln0/n1$a;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lm0/d0;->a:Ln0/g2;

    sget-object v1, Ln0/h2;->j:Ln0/n1$a;

    invoke-interface {v0, v1, v2}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x1005

    if-ne v1, v2, :cond_1

    return v2

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_2

    return v1

    :cond_2
    const/16 v0, 0x100

    return v0
.end method

.method public j(Lm0/b1$a;)V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lm0/d0;->e:Lm0/x$c;

    invoke-virtual {v0}, Lm0/x$c;->b()Lx0/u;

    move-result-object v0

    invoke-virtual {v0, p1}, Lx0/u;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public k(Landroidx/camera/core/b$a;)V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lm0/d0;->c:Lm0/x;

    invoke-virtual {v0, p1}, Lm0/x;->r(Landroidx/camera/core/b$a;)V

    return-void
.end method

.method public final l()Z
    .locals 1

    iget-object v0, p0, Lm0/d0;->e:Lm0/x$c;

    invoke-virtual {v0}, Lm0/x$c;->g()Ln0/u1;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public m(Lm0/v0;)V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lm0/d0;->e:Lm0/x$c;

    invoke-virtual {v0}, Lm0/x$c;->h()Lx0/u;

    move-result-object v0

    invoke-virtual {v0, p1}, Lx0/u;->accept(Ljava/lang/Object;)V

    return-void
.end method
