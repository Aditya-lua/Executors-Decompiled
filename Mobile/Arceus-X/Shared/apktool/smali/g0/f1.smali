.class public final Lg0/f1;
.super Lg0/w2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg0/f1$c;,
        Lg0/f1$j;,
        Lg0/f1$b;,
        Lg0/f1$f;,
        Lg0/f1$g;,
        Lg0/f1$h;,
        Lg0/f1$d;,
        Lg0/f1$e;,
        Lg0/f1$i;,
        Lg0/f1$k;
    }
.end annotation


# static fields
.field public static final E:Lg0/f1$c;

.field public static final F:Lv0/b;


# instance fields
.field public A:Lm0/d0;

.field public B:Lm0/b1;

.field public C:Ln0/o3$c;

.field public final D:Lm0/c0;

.field public final s:Ln0/j2$a;

.field public final t:I

.field public final u:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final v:I

.field public w:I

.field public x:Landroid/util/Rational;

.field public y:Ls0/k;

.field public z:Ln0/o3$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg0/f1$c;

    invoke-direct {v0}, Lg0/f1$c;-><init>()V

    sput-object v0, Lg0/f1;->E:Lg0/f1$c;

    new-instance v0, Lv0/b;

    invoke-direct {v0}, Lv0/b;-><init>()V

    sput-object v0, Lg0/f1;->F:Lv0/b;

    return-void
.end method

.method public constructor <init>(Ln0/g2;)V
    .locals 1

    invoke-direct {p0, p1}, Lg0/w2;-><init>(Ln0/i4;)V

    new-instance p1, Lg0/d1;

    invoke-direct {p1}, Lg0/d1;-><init>()V

    iput-object p1, p0, Lg0/f1;->s:Ln0/j2$a;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lg0/f1;->u:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p1, -0x1

    iput p1, p0, Lg0/f1;->w:I

    iput-object v0, p0, Lg0/f1;->x:Landroid/util/Rational;

    new-instance p1, Lg0/f1$a;

    invoke-direct {p1, p0}, Lg0/f1$a;-><init>(Lg0/f1;)V

    iput-object p1, p0, Lg0/f1;->D:Lm0/c0;

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object p1

    check-cast p1, Ln0/g2;

    sget-object v0, Ln0/g2;->Q:Ln0/n1$a;

    invoke-interface {p1, v0}, Ln0/l3;->a(Ln0/n1$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ln0/g2;->i0()I

    move-result v0

    iput v0, p0, Lg0/f1;->t:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Lg0/f1;->t:I

    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ln0/g2;->k0(I)I

    move-result v0

    iput v0, p0, Lg0/f1;->v:I

    invoke-virtual {p1}, Ln0/g2;->o0()Lg0/f1$j;

    move-result-object p1

    invoke-static {p1}, Ls0/k;->g(Lg0/f1$j;)Ls0/k;

    move-result-object p1

    iput-object p1, p0, Lg0/f1;->y:Ls0/k;

    return-void
.end method

.method public static D0(Ljava/util/List;I)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "[",
            "Landroid/util/Size;",
            ">;>;I)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_2
    return v0
.end method

.method public static E0(Ln0/w2;)Z
    .locals 2

    sget-object v0, Ln0/g2;->U:Ln0/n1$a;

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static F0(Ln0/w2;)Z
    .locals 2

    sget-object v0, Ln0/g2;->U:Ln0/n1$a;

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static G0(Ln0/w2;)Z
    .locals 2

    sget-object v0, Ln0/g2;->U:Ln0/n1$a;

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic g0(Lg0/f1;Ln0/o3;Ln0/o3$g;)V
    .locals 1

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lg0/f1;->B:Lm0/b1;

    invoke-interface {p1}, Lm0/b1;->pause()V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lg0/f1;->r0(Z)V

    invoke-virtual {p0}, Lg0/w2;->k()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object p2

    check-cast p2, Ln0/g2;

    invoke-virtual {p0}, Lg0/w2;->g()Ln0/t3;

    move-result-object v0

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/t3;

    invoke-virtual {p0, p1, p2, v0}, Lg0/f1;->s0(Ljava/lang/String;Ln0/g2;Ln0/t3;)Ln0/o3$b;

    move-result-object p1

    iput-object p1, p0, Lg0/f1;->z:Ln0/o3$b;

    invoke-virtual {p1}, Ln0/o3$b;->p()Ln0/o3;

    move-result-object p1

    invoke-static {p1}, Lg0/p0;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg0/w2;->d0(Ljava/util/List;)V

    invoke-virtual {p0}, Lg0/w2;->L()V

    iget-object p0, p0, Lg0/f1;->B:Lm0/b1;

    invoke-interface {p0}, Lm0/b1;->e()V

    return-void
.end method

.method public static synthetic h0(Ln0/j2;)V
    .locals 3

    const-string v0, "ImageCapture"

    :try_start_0
    invoke-interface {p0}, Ln0/j2;->b()Landroidx/camera/core/d;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Discarding ImageProxy which was inadvertently acquired: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p0, :cond_0

    :try_start_2
    invoke-interface {p0}, Landroidx/camera/core/d;->close()V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catch_0
    move-exception p0

    goto :goto_1

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    if-eqz p0, :cond_1

    :try_start_3
    invoke-interface {p0}, Landroidx/camera/core/d;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    :try_start_4
    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw v1
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_0

    :goto_1
    const-string v1, "Failed to acquire latest image."

    invoke-static {v0, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public static synthetic i0(Ljava/util/List;)Ljava/lang/Void;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic j0(Lg0/f1;Lg0/f1$h;Ljava/util/concurrent/Executor;Lg0/f1$g;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lg0/f1;->T0(Lg0/f1$h;Ljava/util/concurrent/Executor;Lg0/f1$g;)V

    return-void
.end method

.method public static synthetic l0(Ln0/w2;)Z
    .locals 0

    invoke-static {p0}, Lg0/f1;->E0(Ln0/w2;)Z

    move-result p0

    return p0
.end method

.method public static synthetic m0(Ln0/w2;)Z
    .locals 0

    invoke-static {p0}, Lg0/f1;->F0(Ln0/w2;)Z

    move-result p0

    return p0
.end method

.method public static synthetic n0(Ln0/w2;)Z
    .locals 0

    invoke-static {p0}, Lg0/f1;->G0(Ln0/w2;)Z

    move-result p0

    return p0
.end method

.method private q0()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lg0/f1;->r0(Z)V

    return-void
.end method

.method public static x0(Lg0/t;)Lg0/g1;
    .locals 1

    new-instance v0, Lg0/f1$d;

    invoke-direct {v0, p0}, Lg0/f1$d;-><init>(Lg0/t;)V

    return-object v0
.end method


# virtual methods
.method public final A0()Ln0/q3;
    .locals 2

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v0

    invoke-interface {v0}, Ln0/p0;->f()Ln0/h0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ln0/h0;->w(Ln0/q3;)Ln0/q3;

    move-result-object v0

    return-object v0
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

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final B0()Landroid/graphics/Rect;
    .locals 5

    invoke-virtual {p0}, Lg0/w2;->E()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p0}, Lg0/w2;->h()Landroid/util/Size;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lg0/f1;->x:Landroid/util/Rational;

    invoke-static {v0}, Lw0/b;->i(Landroid/util/Rational;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ln0/p0;

    invoke-virtual {p0, v0}, Lg0/w2;->t(Ln0/p0;)I

    move-result v0

    new-instance v2, Landroid/util/Rational;

    iget-object v3, p0, Lg0/f1;->x:Landroid/util/Rational;

    invoke-virtual {v3}, Landroid/util/Rational;->getDenominator()I

    move-result v3

    iget-object v4, p0, Lg0/f1;->x:Landroid/util/Rational;

    invoke-virtual {v4}, Landroid/util/Rational;->getNumerator()I

    move-result v4

    invoke-direct {v2, v3, v4}, Landroid/util/Rational;-><init>(II)V

    invoke-static {v0}, Lp0/a0;->i(I)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lg0/f1;->x:Landroid/util/Rational;

    :goto_0
    invoke-static {v1, v2}, Lw0/b;->a(Landroid/util/Size;Landroid/util/Rational;)Landroid/graphics/Rect;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_2
    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v2

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v2, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method public C0()I
    .locals 1

    invoke-virtual {p0}, Lg0/w2;->C()I

    move-result v0

    return v0
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

    invoke-static {p1}, Lg0/f1$b;->g(Ln0/n1;)Lg0/f1$b;

    move-result-object p1

    return-object p1
.end method

.method public H0()Z
    .locals 3

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object v0

    sget-object v1, Ln0/g2;->c0:Ln0/n1$a;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1, v2}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final I0(Ljava/util/Map;I)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;I)Z"
        }
    .end annotation

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final J0()Z
    .locals 3

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v0

    invoke-interface {v0}, Ln0/p0;->f()Ln0/h0;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ln0/h0;->w(Ln0/q3;)Ln0/q3;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method public K0()V
    .locals 3

    iget-object v0, p0, Lg0/f1;->u:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg0/f1;->u:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lg0/f1;->u:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Lg0/f1;->w0()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final L0(Ljava/util/concurrent/Executor;Lg0/f1$f;Lg0/f1$g;)V
    .locals 2

    new-instance p1, Lg0/h1;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Not bound to a valid Camera ["

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-direct {p1, v1, p2, v0}, Lg0/h1;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    if-eqz p3, :cond_0

    invoke-interface {p3, p1}, Lg0/f1$g;->e(Lg0/h1;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must have either in-memory or on-disk callback."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public M0(Landroid/util/Rational;)V
    .locals 0

    iput-object p1, p0, Lg0/f1;->x:Landroid/util/Rational;

    return-void
.end method

.method public N0(I)V
    .locals 3

    const-string v0, "ImageCapture"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setFlashMode: flashMode = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    iget-object v0, p0, Lg0/f1;->y:Ls0/k;

    invoke-virtual {v0}, Ls0/k;->h()Lg0/f1$j;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lg0/f1;->u0()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Not a front camera despite setting FLASH_MODE_SCREEN"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid flash mode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    iget-object v0, p0, Lg0/f1;->u:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iput p1, p0, Lg0/f1;->w:I

    invoke-virtual {p0}, Lg0/f1;->V0()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public O()V
    .locals 2

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v0

    const-string v1, "Attached camera cannot be null"

    invoke-static {v0, v1}, Lx2/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lg0/f1;->w0()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lg0/f1;->u0()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public O0(Lg0/f1$j;)V
    .locals 0

    invoke-static {p1}, Ls0/k;->g(Lg0/f1$j;)Ls0/k;

    move-result-object p1

    iput-object p1, p0, Lg0/f1;->y:Ls0/k;

    invoke-virtual {p0}, Lg0/f1;->P0()V

    return-void
.end method

.method public P()V
    .locals 2

    const-string v0, "ImageCapture"

    const-string v1, "onCameraControlReady"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lg0/f1;->V0()V

    invoke-virtual {p0}, Lg0/f1;->P0()V

    return-void
.end method

.method public final P0()V
    .locals 1

    iget-object v0, p0, Lg0/f1;->y:Ls0/k;

    invoke-virtual {p0, v0}, Lg0/f1;->Q0(Lg0/f1$j;)V

    return-void
.end method

.method public Q(Ln0/o0;Ln0/i4$b;)Ln0/i4;
    .locals 8
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

    const/16 v0, 0x20

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x23

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x100

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p0, p2}, Lg0/f1;->o0(Ln0/i4$b;)V

    invoke-interface {p1}, Ln0/o0;->l()Ln0/k3;

    move-result-object p1

    const-class v5, Landroidx/camera/core/internal/compat/quirk/SoftwareJpegEncodingPreferredQuirk;

    invoke-virtual {p1, v5}, Ln0/k3;->a(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p2}, Lg0/l0;->a()Ln0/w2;

    move-result-object v5

    sget-object v6, Ln0/g2;->X:Ln0/n1$a;

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v5, v6, v7}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p1

    const-string v5, "ImageCapture"

    if-eqz p1, :cond_0

    const-string p1, "Device quirk suggests software JPEG encoder, but it has been explicitly disabled."

    invoke-static {v5, p1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p1, "Requesting software JPEG due to device quirk."

    invoke-static {v5, p1}, Lg0/r1;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2}, Lg0/l0;->a()Ln0/w2;

    move-result-object p1

    invoke-interface {p1, v6, v7}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    invoke-interface {p2}, Lg0/l0;->a()Ln0/w2;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg0/f1;->t0(Ln0/w2;)Z

    move-result p1

    invoke-interface {p2}, Lg0/l0;->a()Ln0/w2;

    move-result-object v5

    sget-object v6, Ln0/g2;->T:Ln0/n1$a;

    const/4 v7, 0x0

    invoke-interface {v5, v6, v7}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    if-eqz v5, :cond_5

    invoke-virtual {p0}, Lg0/f1;->J0()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v0, 0x1

    :goto_2
    const-string v2, "Cannot set non-JPEG buffer format with Extensions enabled."

    invoke-static {v0, v2}, Lx2/g;->b(ZLjava/lang/Object;)V

    invoke-interface {p2}, Lg0/l0;->a()Ln0/w2;

    move-result-object v0

    sget-object v2, Ln0/h2;->j:Ln0/n1$a;

    if-eqz p1, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v2, p1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_5
    invoke-interface {p2}, Lg0/l0;->a()Ln0/w2;

    move-result-object v5

    invoke-static {v5}, Lg0/f1;->E0(Ln0/w2;)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {p2}, Lg0/l0;->a()Ln0/w2;

    move-result-object p1

    sget-object v1, Ln0/h2;->j:Ln0/n1$a;

    invoke-interface {p1, v1, v0}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_6
    invoke-interface {p2}, Lg0/l0;->a()Ln0/w2;

    move-result-object v5

    invoke-static {v5}, Lg0/f1;->F0(Ln0/w2;)Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {p2}, Lg0/l0;->a()Ln0/w2;

    move-result-object p1

    sget-object v1, Ln0/h2;->j:Ln0/n1$a;

    invoke-interface {p1, v1, v0}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    invoke-interface {p2}, Lg0/l0;->a()Ln0/w2;

    move-result-object p1

    sget-object v0, Ln0/h2;->k:Ln0/n1$a;

    invoke-interface {p1, v0, v4}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    goto :goto_4

    :cond_7
    invoke-interface {p2}, Lg0/l0;->a()Ln0/w2;

    move-result-object v0

    invoke-static {v0}, Lg0/f1;->G0(Ln0/w2;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p2}, Lg0/l0;->a()Ln0/w2;

    move-result-object p1

    sget-object v0, Ln0/h2;->j:Ln0/n1$a;

    const/16 v1, 0x1005

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    invoke-interface {p2}, Lg0/l0;->a()Ln0/w2;

    move-result-object p1

    sget-object v0, Ln0/h2;->l:Ln0/n1$a;

    sget-object v1, Lg0/k0;->c:Lg0/k0;

    invoke-interface {p1, v0, v1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    goto :goto_4

    :cond_8
    if-eqz p1, :cond_9

    invoke-interface {p2}, Lg0/l0;->a()Ln0/w2;

    move-result-object p1

    sget-object v0, Ln0/h2;->j:Ln0/n1$a;

    invoke-interface {p1, v0, v2}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    goto :goto_4

    :cond_9
    invoke-interface {p2}, Lg0/l0;->a()Ln0/w2;

    move-result-object p1

    sget-object v0, Ln0/i2;->t:Ln0/n1$a;

    invoke-interface {p1, v0, v7}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_a

    invoke-interface {p2}, Lg0/l0;->a()Ln0/w2;

    move-result-object p1

    sget-object v0, Ln0/h2;->j:Ln0/n1$a;

    invoke-interface {p1, v0, v4}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    goto :goto_4

    :cond_a
    invoke-static {p1, v3}, Lg0/f1;->D0(Ljava/util/List;I)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p2}, Lg0/l0;->a()Ln0/w2;

    move-result-object p1

    sget-object v0, Ln0/h2;->j:Ln0/n1$a;

    invoke-interface {p1, v0, v4}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    goto :goto_4

    :cond_b
    invoke-static {p1, v1}, Lg0/f1;->D0(Ljava/util/List;I)Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-interface {p2}, Lg0/l0;->a()Ln0/w2;

    move-result-object p1

    sget-object v0, Ln0/h2;->j:Ln0/n1$a;

    invoke-interface {p1, v0, v2}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    :cond_c
    :goto_4
    invoke-interface {p2}, Ln0/i4$b;->e()Ln0/i4;

    move-result-object p1

    return-object p1
.end method

.method public final Q0(Lg0/f1$j;)V
    .locals 1

    invoke-virtual {p0}, Lg0/w2;->j()Ln0/l0;

    move-result-object v0

    invoke-interface {v0, p1}, Ln0/l0;->h(Lg0/f1$j;)V

    return-void
.end method

.method public R0(I)V
    .locals 2

    invoke-virtual {p0}, Lg0/f1;->C0()I

    move-result v0

    invoke-virtual {p0, p1}, Lg0/w2;->a0(I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lg0/f1;->x:Landroid/util/Rational;

    if-eqz v1, :cond_0

    invoke-static {v0}, Lp0/c;->b(I)I

    move-result v0

    invoke-static {p1}, Lp0/c;->b(I)I

    move-result p1

    sub-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    iget-object v0, p0, Lg0/f1;->x:Landroid/util/Rational;

    invoke-static {p1, v0}, Lw0/b;->g(ILandroid/util/Rational;)Landroid/util/Rational;

    move-result-object p1

    iput-object p1, p0, Lg0/f1;->x:Landroid/util/Rational;

    :cond_0
    return-void
.end method

.method public S()V
    .locals 0

    invoke-virtual {p0}, Lg0/f1;->k0()V

    return-void
.end method

.method public S0(Ljava/util/List;)Lne/x;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln0/l1;",
            ">;)",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p0}, Lg0/w2;->j()Ln0/l0;

    move-result-object v0

    iget v1, p0, Lg0/f1;->t:I

    iget v2, p0, Lg0/f1;->v:I

    invoke-interface {v0, p1, v1, v2}, Ln0/l0;->f(Ljava/util/List;II)Lne/x;

    move-result-object p1

    new-instance v0, Lg0/c1;

    invoke-direct {v0}, Lg0/c1;-><init>()V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lr0/n;->x(Lne/x;Lt/a;Ljava/util/concurrent/Executor;)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public T(Ln0/n1;)Ln0/t3;
    .locals 1

    iget-object v0, p0, Lg0/f1;->z:Ln0/o3$b;

    invoke-virtual {v0, p1}, Ln0/o3$b;->g(Ln0/n1;)Ln0/o3$b;

    iget-object v0, p0, Lg0/f1;->z:Ln0/o3$b;

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

.method public T0(Lg0/f1$h;Ljava/util/concurrent/Executor;Lg0/f1$g;)V
    .locals 8

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_0

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Lg0/e1;

    invoke-direct {v1, p0, p1, p2, p3}, Lg0/e1;-><init>(Lg0/f1;Lg0/f1$h;Ljava/util/concurrent/Executor;Lg0/f1$g;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    move-object v6, p1

    move-object v3, p2

    move-object v5, p3

    invoke-virtual/range {v2 .. v7}, Lg0/f1;->U0(Ljava/util/concurrent/Executor;Lg0/f1$f;Lg0/f1$g;Lg0/f1$h;Lg0/f1$h;)V

    return-void
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

    const-string v0, "ImageCapture"

    invoke-static {v0, p2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lg0/w2;->k()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object v0

    check-cast v0, Ln0/g2;

    invoke-virtual {p0, p2, v0, p1}, Lg0/f1;->s0(Ljava/lang/String;Ln0/g2;Ln0/t3;)Ln0/o3$b;

    move-result-object p2

    iput-object p2, p0, Lg0/f1;->z:Ln0/o3$b;

    invoke-virtual {p2}, Ln0/o3$b;->p()Ln0/o3;

    move-result-object p2

    invoke-static {p2}, Lg0/p0;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p2}, Lg0/w2;->d0(Ljava/util/List;)V

    invoke-virtual {p0}, Lg0/w2;->J()V

    return-object p1
.end method

.method public final U0(Ljava/util/concurrent/Executor;Lg0/f1$f;Lg0/f1$g;Lg0/f1$h;Lg0/f1$h;)V
    .locals 14

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p0}, Lg0/f1;->w0()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lg0/f1;->y:Ls0/k;

    invoke-virtual {v0}, Ls0/k;->h()Lg0/f1$j;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const-string v0, "ImageCapture"

    const-string v1, "takePictureInternal"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lg0/w2;->G()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_5

    :cond_2
    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object v1

    invoke-interface {v1}, Ln0/h2;->Z()I

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    :goto_1
    move v12, v1

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    goto :goto_1

    :goto_2
    if-eqz v12, :cond_5

    if-eqz p5, :cond_4

    goto :goto_3

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Simultaneous capture RAW and JPEG needs two output file options"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_3
    if-nez v12, :cond_7

    if-nez p5, :cond_6

    goto :goto_4

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Non simultaneous capture cannot have two output file options"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    :goto_4
    iget-object v1, p0, Lg0/f1;->B:Lm0/b1;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Lm0/b1;

    invoke-virtual {p0}, Lg0/f1;->B0()Landroid/graphics/Rect;

    move-result-object v7

    invoke-virtual {p0}, Lg0/w2;->y()Landroid/graphics/Matrix;

    move-result-object v8

    invoke-virtual {p0, v0}, Lg0/w2;->t(Ln0/p0;)I

    move-result v9

    invoke-virtual {p0}, Lg0/f1;->y0()I

    move-result v10

    invoke-virtual {p0}, Lg0/f1;->v0()I

    move-result v11

    iget-object v0, p0, Lg0/f1;->z:Ln0/o3$b;

    invoke-virtual {v0}, Ln0/o3$b;->s()Ljava/util/List;

    move-result-object v13

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    invoke-static/range {v2 .. v13}, Lm0/l1;->v(Ljava/util/concurrent/Executor;Lg0/f1$f;Lg0/f1$g;Lg0/f1$h;Lg0/f1$h;Landroid/graphics/Rect;Landroid/graphics/Matrix;IIIZLjava/util/List;)Lm0/l1;

    move-result-object p1

    invoke-interface {v1, p1}, Lm0/b1;->b(Lm0/l1;)V

    return-void

    :cond_8
    :goto_5
    invoke-virtual/range {p0 .. p3}, Lg0/f1;->L0(Ljava/util/concurrent/Executor;Lg0/f1$f;Lg0/f1$g;)V

    return-void
.end method

.method public V()V
    .locals 1

    invoke-virtual {p0}, Lg0/f1;->k0()V

    invoke-direct {p0}, Lg0/f1;->q0()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lg0/f1;->Q0(Lg0/f1$j;)V

    return-void
.end method

.method public final V0()V
    .locals 3

    iget-object v0, p0, Lg0/f1;->u:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg0/f1;->u:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lg0/w2;->j()Ln0/l0;

    move-result-object v1

    invoke-virtual {p0}, Lg0/f1;->w0()I

    move-result v2

    invoke-interface {v1, v2}, Ln0/l0;->i(I)V

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public W0()V
    .locals 3

    iget-object v0, p0, Lg0/f1;->u:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg0/f1;->u:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0}, Lg0/f1;->w0()I

    move-result v2

    if-eq v1, v2, :cond_1

    invoke-virtual {p0}, Lg0/f1;->V0()V

    :cond_1
    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final k0()V
    .locals 1

    iget-object v0, p0, Lg0/f1;->y:Ls0/k;

    invoke-virtual {v0}, Ls0/k;->f()V

    iget-object v0, p0, Lg0/f1;->B:Lm0/b1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lm0/b1;->c()V

    :cond_0
    return-void
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

    sget-object v0, Lg0/f1;->E:Lg0/f1$c;

    invoke-virtual {v0}, Lg0/f1$c;->a()Ln0/g2;

    move-result-object v1

    invoke-interface {v1}, Ln0/i4;->X()Ln0/j4$b;

    move-result-object v1

    invoke-virtual {p0}, Lg0/f1;->v0()I

    move-result v2

    invoke-interface {p2, v1, v2}, Ln0/j4;->a(Ln0/j4$b;I)Ln0/n1;

    move-result-object p2

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lg0/f1$c;->a()Ln0/g2;

    move-result-object p1

    invoke-static {p2, p1}, Ln0/n1;->L(Ln0/n1;Ln0/n1;)Ln0/n1;

    move-result-object p2

    :cond_0
    if-nez p2, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p0, p2}, Lg0/f1;->D(Ln0/n1;)Ln0/i4$b;

    move-result-object p1

    invoke-interface {p1}, Ln0/i4$b;->e()Ln0/i4;

    move-result-object p1

    return-object p1
.end method

.method public final o0(Ln0/i4$b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/i4$b<",
            "***>;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lg0/w2;->o()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li0/b;

    instance-of v3, v2, Lk0/d;

    if-eqz v3, :cond_0

    check-cast v2, Lk0/d;

    invoke-virtual {v2}, Lk0/d;->f()I

    move-result v1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lg0/l0;->a()Ln0/w2;

    move-result-object p1

    sget-object v0, Ln0/g2;->U:Ln0/n1$a;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public final p0(ILandroid/util/Size;)Lm0/k0;
    .locals 11

    invoke-virtual {p0}, Lg0/f1;->A0()Ln0/q3;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-interface {v0, p2}, Ln0/q3;->f(Landroid/util/Size;)Ljava/util/Map;

    move-result-object p2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/16 v2, 0x23

    invoke-virtual {p0, p2, v2}, Lg0/f1;->I0(Ljava/util/Map;I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    const/16 v2, 0x100

    invoke-virtual {p0, p2, v2}, Lg0/f1;->I0(Ljava/util/Map;I)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    const/16 v2, 0x1005

    invoke-virtual {p0, p2, v2}, Lg0/f1;->I0(Ljava/util/Map;I)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_4

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v2

    invoke-interface {v2}, Ln0/p0;->f()Ln0/h0;

    move-result-object v2

    invoke-interface {v2}, Ln0/h0;->I()Ln0/h0$a;

    move-result-object v2

    invoke-interface {v2, p1, v0}, Ln0/h0$a;->a(ILjava/util/List;)I

    move-result p1

    goto :goto_0

    :cond_4
    move p1, v3

    :goto_0
    if-nez p1, :cond_5

    return-object v1

    :cond_5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, Ljava/util/List;

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object p2

    sget-object v0, Ln0/g2;->b0:Ln0/n1$a;

    invoke-interface {p2, v0, v1}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v4, p2

    check-cast v4, La1/c;

    if-eqz v4, :cond_7

    new-instance p2, Lp0/e;

    const/4 v0, 0x1

    invoke-direct {p2, v0}, Lp0/e;-><init>(Z)V

    invoke-static {v5, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object p2

    invoke-interface {p2}, Ln0/p0;->k()Ln0/o0;

    move-result-object v0

    invoke-interface {v0}, Ln0/o0;->h()Landroid/graphics/Rect;

    move-result-object v0

    invoke-interface {p2}, Ln0/p0;->k()Ln0/o0;

    move-result-object p2

    new-instance v8, Landroid/util/Rational;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    invoke-direct {v8, v1, v0}, Landroid/util/Rational;-><init>(II)V

    invoke-virtual {p0}, Lg0/f1;->C0()I

    move-result v7

    invoke-interface {p2}, Lg0/t;->d()I

    move-result v9

    invoke-interface {p2}, Lg0/t;->i()I

    move-result v10

    const/4 v6, 0x0

    invoke-static/range {v4 .. v10}, Ls0/o;->p(La1/c;Ljava/util/List;Landroid/util/Size;ILandroid/util/Rational;II)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/util/Size;

    invoke-static {p2, p1}, Lm0/k0;->a(Landroid/util/Size;I)Lm0/k0;

    move-result-object p1

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The postview ResolutionSelector cannot select a valid size for the postview."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p2, Lp0/e;

    invoke-direct {p2}, Lp0/e;-><init>()V

    invoke-static {v5, p2}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/util/Size;

    invoke-static {p2, p1}, Lm0/k0;->a(Landroid/util/Size;I)Lm0/k0;

    move-result-object p1

    return-object p1
.end method

.method public final r0(Z)V
    .locals 2

    const-string v0, "ImageCapture"

    const-string v1, "clearPipeline"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lg0/f1;->C:Ln0/o3$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln0/o3$c;->b()V

    iput-object v1, p0, Lg0/f1;->C:Ln0/o3$c;

    :cond_0
    iget-object v0, p0, Lg0/f1;->A:Lm0/d0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lm0/d0;->a()V

    iput-object v1, p0, Lg0/f1;->A:Lm0/d0;

    :cond_1
    if-nez p1, :cond_2

    iget-object p1, p0, Lg0/f1;->B:Lm0/b1;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lm0/b1;->c()V

    iput-object v1, p0, Lg0/f1;->B:Lm0/b1;

    :cond_2
    invoke-virtual {p0}, Lg0/w2;->j()Ln0/l0;

    move-result-object p1

    invoke-interface {p1}, Ln0/l0;->b()V

    return-void
.end method

.method public final s0(Ljava/lang/String;Ln0/g2;Ln0/t3;)Ln0/o3$b;
    .locals 9

    invoke-static {}, Lp0/z;->b()V

    const-string v0, "createPipeline(cameraId: %s, streamSpec: %s)"

    filled-new-array {p1, p3}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "ImageCapture"

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p3}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object v4

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ln0/p0;

    invoke-interface {p1}, Ln0/p0;->q()Z

    move-result p1

    xor-int/lit8 v7, p1, 0x1

    iget-object p1, p0, Lg0/f1;->A:Lm0/d0;

    if-eqz p1, :cond_0

    invoke-static {v7}, Lx2/g;->i(Z)V

    iget-object p1, p0, Lg0/f1;->A:Lm0/d0;

    invoke-virtual {p1}, Lm0/d0;->a()V

    :cond_0
    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object p1

    invoke-interface {p1}, Ln0/p0;->d()Lg0/t;

    move-result-object p1

    invoke-static {p1}, Lg0/f1;->x0(Lg0/t;)Lg0/g1;

    move-result-object p1

    invoke-interface {p1}, Lg0/g1;->a()Ljava/util/Set;

    move-result-object p1

    invoke-virtual {p0}, Lg0/f1;->z0()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "The specified output format ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lg0/f1;->z0()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ") is not supported by current configuration. Supported output formats: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lx2/g;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Lg0/f1;->H0()Z

    move-result p1

    const/4 v2, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p2}, Ln0/g2;->p()I

    move-result p1

    invoke-virtual {p0, p1, v4}, Lg0/f1;->p0(ILandroid/util/Size;)Lm0/k0;

    move-result-object p1

    move-object v8, p1

    goto :goto_0

    :cond_1
    move-object v8, v2

    :goto_0
    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object p1

    if-eqz p1, :cond_2

    :try_start_0
    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object p1

    invoke-interface {p1}, Ln0/p0;->k()Ln0/o0;

    move-result-object p1

    invoke-interface {p1}, Ln0/o0;->k()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/hardware/camera2/CameraCharacteristics;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/hardware/camera2/CameraCharacteristics;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, p1

    goto :goto_1

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_2
    :goto_1
    move-object v5, v2

    goto :goto_3

    :goto_2
    const-string v0, "getCameraCharacteristics failed"

    invoke-static {v1, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    :goto_3
    new-instance v2, Lm0/d0;

    invoke-virtual {p0}, Lg0/w2;->n()Lg0/n;

    move-result-object v6

    move-object v3, p2

    invoke-direct/range {v2 .. v8}, Lm0/d0;-><init>(Ln0/g2;Landroid/util/Size;Landroid/hardware/camera2/CameraCharacteristics;Lg0/n;ZLm0/k0;)V

    iput-object v2, p0, Lg0/f1;->A:Lm0/d0;

    iget-object p1, p0, Lg0/f1;->B:Lm0/b1;

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object p1

    invoke-interface {p1}, Ln0/i4;->r()Lm0/b1$b;

    move-result-object p1

    iget-object p2, p0, Lg0/f1;->D:Lm0/c0;

    invoke-interface {p1, p2}, Lm0/b1$b;->a(Lm0/c0;)Lm0/b1;

    move-result-object p1

    iput-object p1, p0, Lg0/f1;->B:Lm0/b1;

    :cond_3
    iget-object p1, p0, Lg0/f1;->B:Lm0/b1;

    iget-object p2, p0, Lg0/f1;->A:Lm0/d0;

    invoke-interface {p1, p2}, Lm0/b1;->d(Lm0/d0;)V

    iget-object p1, p0, Lg0/f1;->A:Lm0/d0;

    invoke-virtual {p3}, Ln0/t3;->f()Landroid/util/Size;

    move-result-object p2

    invoke-virtual {p1, p2}, Lm0/d0;->f(Landroid/util/Size;)Ln0/o3$b;

    move-result-object p1

    invoke-virtual {p3}, Ln0/t3;->g()I

    move-result p2

    invoke-virtual {p1, p2}, Ln0/o3$b;->A(I)Ln0/o3$b;

    invoke-virtual {p0}, Lg0/f1;->v0()I

    move-result p2

    const/4 v0, 0x2

    if-ne p2, v0, :cond_4

    invoke-virtual {p3}, Ln0/t3;->h()Z

    move-result p2

    if-nez p2, :cond_4

    invoke-virtual {p0}, Lg0/w2;->j()Ln0/l0;

    move-result-object p2

    invoke-interface {p2, p1}, Ln0/l0;->a(Ln0/o3$b;)V

    :cond_4
    invoke-virtual {p3}, Ln0/t3;->d()Ln0/n1;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-virtual {p3}, Ln0/t3;->d()Ln0/n1;

    move-result-object p2

    invoke-virtual {p1, p2}, Ln0/o3$b;->g(Ln0/n1;)Ln0/o3$b;

    :cond_5
    iget-object p2, p0, Lg0/f1;->C:Ln0/o3$c;

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Ln0/o3$c;->b()V

    :cond_6
    new-instance p2, Ln0/o3$c;

    new-instance p3, Lg0/b1;

    invoke-direct {p3, p0}, Lg0/b1;-><init>(Lg0/f1;)V

    invoke-direct {p2, p3}, Ln0/o3$c;-><init>(Ln0/o3$d;)V

    iput-object p2, p0, Lg0/f1;->C:Ln0/o3$c;

    invoke-virtual {p1, p2}, Ln0/o3$b;->u(Ln0/o3$d;)Ln0/o3$b;

    return-object p1
.end method

.method public t0(Ln0/w2;)Z
    .locals 7

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v1, Ln0/g2;->X:Ln0/n1$a;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v1, v2}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lg0/f1;->J0()Z

    move-result v0

    const-string v4, "ImageCapture"

    if-eqz v0, :cond_0

    const-string v0, "Software JPEG cannot be used with Extensions."

    invoke-static {v4, v0}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    move v0, v3

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    sget-object v5, Ln0/g2;->T:Ln0/n1$a;

    const/4 v6, 0x0

    invoke-interface {p1, v5, v6}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x100

    if-eq v5, v6, :cond_1

    const-string v0, "Software JPEG cannot be used with non-JPEG output buffer format."

    invoke-static {v4, v0}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    if-nez v3, :cond_2

    const-string v0, "Unable to support software JPEG. Disabling."

    invoke-static {v4, v0}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v1, v2}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    :cond_2
    return v3
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ImageCapture:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lg0/w2;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u0()I
    .locals 1

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lg0/l;->d()Lg0/t;

    move-result-object v0

    invoke-interface {v0}, Lg0/t;->i()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public v0()I
    .locals 1

    iget v0, p0, Lg0/f1;->t:I

    return v0
.end method

.method public w0()I
    .locals 3

    iget-object v0, p0, Lg0/f1;->u:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lg0/f1;->w:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object v1

    check-cast v1, Ln0/g2;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Ln0/g2;->j0(I)I

    move-result v1

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final y0()I
    .locals 3

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object v0

    check-cast v0, Ln0/g2;

    sget-object v1, Ln0/g2;->Z:Ln0/n1$a;

    invoke-interface {v0, v1}, Ln0/l3;->a(Ln0/n1$a;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ln0/g2;->n0()I

    move-result v0

    return v0

    :cond_0
    iget v0, p0, Lg0/f1;->t:I

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CaptureMode "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lg0/f1;->t:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " is invalid"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    const/16 v0, 0x5f

    return v0

    :cond_3
    const/16 v0, 0x64

    return v0
.end method

.method public z0()I
    .locals 3

    invoke-virtual {p0}, Lg0/w2;->l()Ln0/i4;

    move-result-object v0

    sget-object v1, Ln0/g2;->U:Ln0/n1$a;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method
