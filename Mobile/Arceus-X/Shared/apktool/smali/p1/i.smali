.class public abstract Lp1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp1/i$c;,
        Lp1/i$b;
    }
.end annotation


# static fields
.field public static final Q:Lg0/f1$j;


# instance fields
.field public A:I

.field public B:Z

.field public C:Z

.field public D:Lp1/i$b;

.field public final E:Lp1/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/k<",
            "Lg0/z2;",
            ">;"
        }
    .end annotation
.end field

.field public final F:Lp1/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/k<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final G:Landroidx/lifecycle/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/d0<",
            "Lp1/k0;",
            ">;"
        }
    .end annotation
.end field

.field public final H:Landroidx/lifecycle/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/a0<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final I:Lp1/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/n<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final J:Lp1/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/n<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final K:Lp1/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/n<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final L:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lg0/n;",
            ">;"
        }
    .end annotation
.end field

.field public final M:Landroid/content/Context;

.field public final N:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final O:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lr1/a$a;",
            "Lr1/a;",
            ">;"
        }
    .end annotation
.end field

.field public P:J

.field public a:Lg0/v;

.field public b:I

.field public c:Lg0/a2;

.field public d:La1/c;

.field public e:Lg0/f1;

.field public f:La1/c;

.field public g:Ljava/util/concurrent/Executor;

.field public h:Ljava/util/concurrent/Executor;

.field public i:Ljava/util/concurrent/Executor;

.field public j:Lg0/u0$a;

.field public k:Lg0/u0;

.field public l:La1/c;

.field public m:Lf1/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf1/p1<",
            "Lf1/r0;",
            ">;"
        }
    .end annotation
.end field

.field public n:Lf1/e1;

.field public o:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lx2/a<",
            "Lf1/b2;",
            ">;",
            "Lf1/e1;",
            ">;"
        }
    .end annotation
.end field

.field public p:Lf1/a0;

.field public q:I

.field public r:Lg0/k0;

.field public s:Lg0/k0;

.field public t:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public u:Lg0/l;

.field public v:Lp1/y;

.field public w:Lg0/y2;

.field public x:Lg0/a2$c;

.field public final y:Lp1/b0;

.field public final z:Lp1/b0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp1/i$a;

    invoke-direct {v0}, Lp1/i$a;-><init>()V

    sput-object v0, Lp1/i;->Q:Lg0/f1$j;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-static {p1}, Ld1/k;->e(Landroid/content/Context;)Lne/x;

    move-result-object v0

    new-instance v1, Lp1/e;

    invoke-direct {v1}, Lp1/e;-><init>()V

    .line 2
    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v2

    .line 3
    invoke-static {v0, v1, v2}, Lr0/n;->x(Lne/x;Lt/a;Ljava/util/concurrent/Executor;)Lne/x;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lp1/i;-><init>(Landroid/content/Context;Lne/x;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lne/x;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lne/x<",
            "Lp1/y;",
            ">;)V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    sget-object v0, Lg0/v;->d:Lg0/v;

    iput-object v0, p0, Lp1/i;->a:Lg0/v;

    const/4 v0, 0x3

    .line 6
    iput v0, p0, Lp1/i;->b:I

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lp1/i;->n:Lf1/e1;

    .line 8
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lp1/i;->o:Ljava/util/Map;

    .line 9
    sget-object v1, Lf1/r0;->s0:Lf1/a0;

    iput-object v1, p0, Lp1/i;->p:Lf1/a0;

    const/4 v1, 0x0

    .line 10
    iput v1, p0, Lp1/i;->q:I

    .line 11
    sget-object v2, Lg0/k0;->c:Lg0/k0;

    iput-object v2, p0, Lp1/i;->r:Lg0/k0;

    .line 12
    iput-object v2, p0, Lp1/i;->s:Lg0/k0;

    .line 13
    sget-object v2, Ln0/t3;->a:Landroid/util/Range;

    iput-object v2, p0, Lp1/i;->t:Landroid/util/Range;

    const/4 v2, -0x1

    .line 14
    iput v2, p0, Lp1/i;->A:I

    const/4 v2, 0x1

    .line 15
    iput-boolean v2, p0, Lp1/i;->B:Z

    .line 16
    iput-boolean v2, p0, Lp1/i;->C:Z

    .line 17
    new-instance v2, Lp1/k;

    invoke-direct {v2}, Lp1/k;-><init>()V

    iput-object v2, p0, Lp1/i;->E:Lp1/k;

    .line 18
    new-instance v2, Lp1/k;

    invoke-direct {v2}, Lp1/k;-><init>()V

    iput-object v2, p0, Lp1/i;->F:Lp1/k;

    .line 19
    new-instance v2, Landroidx/lifecycle/d0;

    new-instance v3, Lp1/k0;

    invoke-direct {v3, v1, v0}, Lp1/k0;-><init>(ILandroid/graphics/PointF;)V

    invoke-direct {v2, v3}, Landroidx/lifecycle/d0;-><init>(Ljava/lang/Object;)V

    iput-object v2, p0, Lp1/i;->G:Landroidx/lifecycle/d0;

    .line 20
    new-instance v1, Lp1/f;

    invoke-direct {v1}, Lp1/f;-><init>()V

    invoke-static {v2, v1}, Lp0/m;->a(Landroidx/lifecycle/a0;Lt/a;)Landroidx/lifecycle/a0;

    move-result-object v1

    iput-object v1, p0, Lp1/i;->H:Landroidx/lifecycle/a0;

    .line 21
    new-instance v1, Lp1/n;

    invoke-direct {v1}, Lp1/n;-><init>()V

    iput-object v1, p0, Lp1/i;->I:Lp1/n;

    .line 22
    new-instance v1, Lp1/n;

    invoke-direct {v1}, Lp1/n;-><init>()V

    iput-object v1, p0, Lp1/i;->J:Lp1/n;

    .line 23
    new-instance v1, Lp1/n;

    invoke-direct {v1}, Lp1/n;-><init>()V

    iput-object v1, p0, Lp1/i;->K:Lp1/n;

    .line 24
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lp1/i;->L:Ljava/util/Set;

    .line 25
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lp1/i;->O:Ljava/util/Map;

    .line 26
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1388

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v1

    iput-wide v1, p0, Lp1/i;->P:J

    .line 27
    invoke-static {p1}, Lp0/f;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lp1/i;->M:Landroid/content/Context;

    .line 28
    invoke-virtual {p0}, Lp1/i;->i()Lg0/a2;

    move-result-object v1

    iput-object v1, p0, Lp1/i;->c:Lg0/a2;

    .line 29
    invoke-virtual {p0, v0}, Lp1/i;->h(Ljava/lang/Integer;)Lg0/f1;

    move-result-object v1

    iput-object v1, p0, Lp1/i;->e:Lg0/f1;

    .line 30
    invoke-virtual {p0, v0, v0, v0}, Lp1/i;->g(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lg0/u0;

    move-result-object v0

    iput-object v0, p0, Lp1/i;->k:Lg0/u0;

    .line 31
    invoke-virtual {p0}, Lp1/i;->k()Lf1/p1;

    move-result-object v0

    iput-object v0, p0, Lp1/i;->m:Lf1/p1;

    .line 32
    new-instance v0, Lp1/g;

    invoke-direct {v0, p0}, Lp1/g;-><init>(Lp1/i;)V

    .line 33
    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    .line 34
    invoke-static {p2, v0, v1}, Lr0/n;->x(Lne/x;Lt/a;Ljava/util/concurrent/Executor;)Lne/x;

    move-result-object p2

    iput-object p2, p0, Lp1/i;->N:Lne/x;

    .line 35
    new-instance p2, Lp1/b0;

    invoke-direct {p2, p1}, Lp1/b0;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lp1/i;->y:Lp1/b0;

    .line 36
    new-instance p1, Lp1/h;

    invoke-direct {p1, p0}, Lp1/h;-><init>(Lp1/i;)V

    iput-object p1, p0, Lp1/i;->z:Lp1/b0$b;

    return-void
.end method

.method public static synthetic a(Lp1/i;Lp1/y;)Ljava/lang/Void;
    .locals 0

    iput-object p1, p0, Lp1/i;->v:Lp1/y;

    invoke-virtual {p0}, Lp1/i;->P()V

    invoke-virtual {p0}, Lp1/i;->L()V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic b(Lp1/i;I)V
    .locals 1

    iput p1, p0, Lp1/i;->A:I

    iget-object v0, p0, Lp1/i;->k:Lg0/u0;

    invoke-virtual {v0, p1}, Lg0/u0;->u0(I)V

    iget-object v0, p0, Lp1/i;->e:Lg0/f1;

    invoke-virtual {v0, p1}, Lg0/f1;->R0(I)V

    iget-object p0, p0, Lp1/i;->m:Lf1/p1;

    invoke-virtual {p0, p1}, Lf1/p1;->c1(I)V

    return-void
.end method


# virtual methods
.method public A(F)V
    .locals 3

    invoke-virtual {p0}, Lp1/i;->t()Z

    move-result v0

    const-string v1, "CameraController"

    if-nez v0, :cond_0

    const-string p1, "Use cases not attached to camera."

    invoke-static {v1, p1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-boolean v0, p0, Lp1/i;->B:Z

    if-nez v0, :cond_1

    const-string p1, "Pinch to zoom disabled."

    invoke-static {v1, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Pinch to zoom with scale: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lp1/i;->s()Landroidx/lifecycle/a0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/a0;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/z2;

    if-nez v0, :cond_2

    return-void

    :cond_2
    invoke-interface {v0}, Lg0/z2;->d()F

    move-result v1

    invoke-virtual {p0, p1}, Lp1/i;->J(F)F

    move-result p1

    mul-float/2addr v1, p1

    invoke-interface {v0}, Lg0/z2;->c()F

    move-result p1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-interface {v0}, Lg0/z2;->a()F

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-virtual {p0, p1}, Lp1/i;->I(F)Lne/x;

    return-void
.end method

.method public B(Lg0/v1;FF)V
    .locals 4

    invoke-virtual {p0}, Lp1/i;->t()Z

    move-result v0

    const-string v1, "CameraController"

    if-nez v0, :cond_0

    const-string p1, "Use cases not attached to camera."

    invoke-static {v1, p1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-boolean v0, p0, Lp1/i;->C:Z

    if-nez v0, :cond_1

    const-string p1, "Tap to focus disabled. "

    invoke-static {v1, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0, p2, p3}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {p0, p1, v0}, Lp1/i;->f(Lg0/v1;Landroid/graphics/PointF;)Lg0/m0;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Tap to focus started: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p2, ", "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lp1/i;->D:Lp1/i$b;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lp1/i$b;->a()V

    :cond_2
    iget-object p2, p0, Lp1/i;->G:Landroidx/lifecycle/d0;

    new-instance p3, Lp1/k0;

    const/4 v2, 0x1

    invoke-direct {p3, v2, v0}, Lp1/k0;-><init>(ILandroid/graphics/PointF;)V

    invoke-virtual {p2, p3}, Landroidx/lifecycle/d0;->m(Ljava/lang/Object;)V

    new-instance p2, Lp1/i$b;

    iget-object p3, p0, Lp1/i;->G:Landroidx/lifecycle/d0;

    invoke-direct {p2, v0, p3}, Lp1/i$b;-><init>(Landroid/graphics/PointF;Landroidx/lifecycle/d0;)V

    iput-object p2, p0, Lp1/i;->D:Lp1/i$b;

    iget-object p3, p0, Lp1/i;->u:Lg0/l;

    invoke-interface {p3}, Lg0/l;->c()Lg0/m;

    move-result-object p3

    invoke-interface {p3, p1}, Lg0/m;->o(Lg0/m0;)Lne/x;

    move-result-object p1

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object p3

    invoke-static {p1, p2, p3}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    sget-object p1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v2, p0, Lp1/i;->P:J

    invoke-virtual {p1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Tap to focus auto cancel duration: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p3, " ms"

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long p1, v2, v0

    if-lez p1, :cond_3

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    invoke-direct {p1, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p3, Lp1/d;

    invoke-direct {p3, p2}, Lp1/d;-><init>(Lp1/i$b;)V

    invoke-virtual {p1, p3, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_3
    return-void
.end method

.method public final C(Lg0/u0$a;Lg0/u0$a;)V
    .locals 1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lg0/u0$a;->c()Landroid/util/Size;

    move-result-object p1

    :goto_0
    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p2}, Lg0/u0$a;->c()Landroid/util/Size;

    move-result-object v0

    :goto_1
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lp1/i;->k:Lg0/u0;

    invoke-virtual {p1}, Lg0/u0;->m0()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object p2, p0, Lp1/i;->k:Lg0/u0;

    invoke-virtual {p2}, Lg0/u0;->n0()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget-object v0, p0, Lp1/i;->k:Lg0/u0;

    invoke-virtual {v0}, Lg0/u0;->p0()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lp1/i;->R(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    invoke-virtual {p0}, Lp1/i;->L()V

    :cond_2
    return-void
.end method

.method public D(Ljava/util/concurrent/Executor;Lg0/u0$a;)V
    .locals 2

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lp1/i;->j:Lg0/u0$a;

    if-ne v0, p2, :cond_0

    iget-object v1, p0, Lp1/i;->h:Ljava/util/concurrent/Executor;

    if-ne v1, p1, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lp1/i;->h:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lp1/i;->j:Lg0/u0$a;

    iget-object v1, p0, Lp1/i;->k:Lg0/u0;

    invoke-virtual {v1, p1, p2}, Lg0/u0;->t0(Ljava/util/concurrent/Executor;Lg0/u0$a;)V

    invoke-virtual {p0, v0, p2}, Lp1/i;->C(Lg0/u0$a;Lg0/u0$a;)V

    return-void
.end method

.method public E(La1/c;)V
    .locals 2

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lp1/i;->l:La1/c;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lp1/i;->l:La1/c;

    iget-object p1, p0, Lp1/i;->k:Lg0/u0;

    invoke-virtual {p1}, Lg0/u0;->m0()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v0, p0, Lp1/i;->k:Lg0/u0;

    invoke-virtual {v0}, Lg0/u0;->n0()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lp1/i;->k:Lg0/u0;

    invoke-virtual {v1}, Lg0/u0;->p0()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lp1/i;->R(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    invoke-virtual {p0}, Lp1/i;->L()V

    return-void
.end method

.method public F(I)V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    iget-object v0, p0, Lp1/i;->a:Lg0/v;

    invoke-virtual {v0}, Lg0/v;->d()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Not a front camera despite setting FLASH_MODE_SCREEN"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lp1/i;->W()V

    :cond_2
    iget-object v0, p0, Lp1/i;->e:Lg0/f1;

    invoke-virtual {v0, p1}, Lg0/f1;->N0(I)V

    return-void
.end method

.method public G(F)Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p0}, Lp1/i;->t()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lp1/i;->J:Lp1/n;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp1/n;->c(Ljava/lang/Object;)Lne/x;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lp1/i;->u:Lg0/l;

    invoke-interface {v0}, Lg0/l;->c()Lg0/m;

    move-result-object v0

    invoke-interface {v0, p1}, Lg0/m;->e(F)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public H(Lr1/a;)V
    .locals 3

    invoke-virtual {p0}, Lp1/i;->p()Lr1/a;

    move-result-object v0

    iget-object v1, p0, Lp1/i;->O:Ljava/util/Map;

    invoke-virtual {p1}, Lr1/a;->a()Lr1/a$a;

    move-result-object v2

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lp1/i;->p()Lr1/a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Lr1/a;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lp1/i;->W()V

    :cond_0
    return-void
.end method

.method public I(F)Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p0}, Lp1/i;->t()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lp1/i;->K:Lp1/n;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp1/n;->c(Ljava/lang/Object;)Lne/x;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lp1/i;->u:Lg0/l;

    invoke-interface {v0}, Lg0/l;->c()Lg0/m;

    move-result-object v0

    invoke-interface {v0, p1}, Lg0/m;->g(F)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public final J(F)F
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v0

    const/high16 v2, 0x40000000    # 2.0f

    if-lez v1, :cond_0

    sub-float/2addr p1, v0

    mul-float/2addr p1, v2

    add-float/2addr p1, v0

    return p1

    :cond_0
    sub-float p1, v0, p1

    mul-float/2addr p1, v2

    sub-float/2addr v0, p1

    return v0
.end method

.method public abstract K()Lg0/l;
.end method

.method public L()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lp1/i;->M(Ljava/lang/Runnable;)V

    return-void
.end method

.method public M(Ljava/lang/Runnable;)V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lp1/i;->K()Lg0/l;

    move-result-object v0

    iput-object v0, p0, Lp1/i;->u:Lg0/l;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0}, Lp1/i;->t()Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "CameraController"

    const-string v0, "Use cases not attached to camera."

    invoke-static {p1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object p1, p0, Lp1/i;->E:Lp1/k;

    iget-object v0, p0, Lp1/i;->u:Lg0/l;

    invoke-interface {v0}, Lg0/l;->d()Lg0/t;

    move-result-object v0

    invoke-interface {v0}, Lg0/t;->z()Landroidx/lifecycle/a0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lp1/k;->r(Landroidx/lifecycle/a0;)V

    iget-object p1, p0, Lp1/i;->F:Lp1/k;

    iget-object v0, p0, Lp1/i;->u:Lg0/l;

    invoke-interface {v0}, Lg0/l;->d()Lg0/t;

    move-result-object v0

    invoke-interface {v0}, Lg0/t;->p()Landroidx/lifecycle/a0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lp1/k;->r(Landroidx/lifecycle/a0;)V

    iget-object p1, p0, Lp1/i;->I:Lp1/n;

    new-instance v0, Lp1/a;

    invoke-direct {v0, p0}, Lp1/a;-><init>(Lp1/i;)V

    invoke-virtual {p1, v0}, Lp1/n;->b(Lt/a;)V

    iget-object p1, p0, Lp1/i;->J:Lp1/n;

    new-instance v0, Lp1/b;

    invoke-direct {v0, p0}, Lp1/b;-><init>(Lp1/i;)V

    invoke-virtual {p1, v0}, Lp1/n;->b(Lt/a;)V

    iget-object p1, p0, Lp1/i;->K:Lp1/n;

    new-instance v0, Lp1/c;

    invoke-direct {v0, p0}, Lp1/c;-><init>(Lp1/i;)V

    invoke-virtual {p1, v0}, Lp1/n;->b(Lt/a;)V

    return-void

    :catch_0
    move-exception v0

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_1
    throw v0
.end method

.method public final N()V
    .locals 3

    iget-object v0, p0, Lp1/i;->y:Lp1/b0;

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    iget-object v2, p0, Lp1/i;->z:Lp1/b0$b;

    invoke-virtual {v0, v1, v2}, Lp1/b0;->a(Ljava/util/concurrent/Executor;Lp1/b0$b;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "CameraController"

    const-string v1, "The device cannot detect rotation changes."

    invoke-static {v0, v1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final O()V
    .locals 2

    iget-object v0, p0, Lp1/i;->y:Lp1/b0;

    iget-object v1, p0, Lp1/i;->z:Lp1/b0$b;

    invoke-virtual {v0, v1}, Lp1/b0;->c(Lp1/b0$b;)V

    return-void
.end method

.method public final P()V
    .locals 3

    invoke-virtual {p0}, Lp1/i;->T()V

    invoke-virtual {p0}, Lp1/i;->n()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lp1/i;->S(Ljava/lang/Integer;)V

    iget-object v0, p0, Lp1/i;->k:Lg0/u0;

    invoke-virtual {v0}, Lg0/u0;->m0()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lp1/i;->k:Lg0/u0;

    invoke-virtual {v1}, Lg0/u0;->n0()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lp1/i;->k:Lg0/u0;

    invoke-virtual {v2}, Lg0/u0;->p0()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lp1/i;->R(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    invoke-virtual {p0}, Lp1/i;->U()V

    return-void
.end method

.method public final Q()V
    .locals 7

    invoke-virtual {p0}, Lp1/i;->u()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lp1/i;->v:Lp1/y;

    iget-object v1, p0, Lp1/i;->c:Lg0/a2;

    iget-object v2, p0, Lp1/i;->e:Lg0/f1;

    iget-object v3, p0, Lp1/i;->k:Lg0/u0;

    iget-object v4, p0, Lp1/i;->m:Lf1/p1;

    const/4 v5, 0x4

    new-array v5, v5, [Lg0/w2;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    const/4 v1, 0x1

    aput-object v2, v5, v1

    const/4 v1, 0x2

    aput-object v3, v5, v1

    const/4 v1, 0x3

    aput-object v4, v5, v1

    invoke-interface {v0, v5}, Lp1/y;->c([Lg0/w2;)V

    return-void
.end method

.method public final R(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 4

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p0}, Lp1/i;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp1/i;->v:Lp1/y;

    iget-object v1, p0, Lp1/i;->k:Lg0/u0;

    const/4 v2, 0x1

    new-array v2, v2, [Lg0/w2;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-interface {v0, v2}, Lp1/y;->c([Lg0/w2;)V

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lp1/i;->g(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lg0/u0;

    move-result-object p1

    iput-object p1, p0, Lp1/i;->k:Lg0/u0;

    iget-object p2, p0, Lp1/i;->h:Ljava/util/concurrent/Executor;

    if-eqz p2, :cond_1

    iget-object p3, p0, Lp1/i;->j:Lg0/u0$a;

    if-eqz p3, :cond_1

    invoke-virtual {p1, p2, p3}, Lg0/u0;->t0(Ljava/util/concurrent/Executor;Lg0/u0$a;)V

    :cond_1
    return-void
.end method

.method public final S(Ljava/lang/Integer;)V
    .locals 4

    invoke-virtual {p0}, Lp1/i;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp1/i;->v:Lp1/y;

    iget-object v1, p0, Lp1/i;->e:Lg0/f1;

    const/4 v2, 0x1

    new-array v2, v2, [Lg0/w2;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-interface {v0, v2}, Lp1/y;->c([Lg0/w2;)V

    :cond_0
    iget-object v0, p0, Lp1/i;->e:Lg0/f1;

    invoke-virtual {v0}, Lg0/f1;->w0()I

    move-result v0

    invoke-virtual {p0, p1}, Lp1/i;->h(Ljava/lang/Integer;)Lg0/f1;

    move-result-object p1

    iput-object p1, p0, Lp1/i;->e:Lg0/f1;

    invoke-virtual {p0, v0}, Lp1/i;->F(I)V

    return-void
.end method

.method public final T()V
    .locals 4

    invoke-virtual {p0}, Lp1/i;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp1/i;->v:Lp1/y;

    iget-object v1, p0, Lp1/i;->c:Lg0/a2;

    const/4 v2, 0x1

    new-array v2, v2, [Lg0/w2;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-interface {v0, v2}, Lp1/y;->c([Lg0/w2;)V

    :cond_0
    invoke-virtual {p0}, Lp1/i;->i()Lg0/a2;

    move-result-object v0

    iput-object v0, p0, Lp1/i;->c:Lg0/a2;

    iget-object v1, p0, Lp1/i;->x:Lg0/a2$c;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Lg0/a2;->q0(Lg0/a2$c;)V

    :cond_1
    return-void
.end method

.method public final U()V
    .locals 4

    invoke-virtual {p0}, Lp1/i;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp1/i;->v:Lp1/y;

    iget-object v1, p0, Lp1/i;->m:Lf1/p1;

    const/4 v2, 0x1

    new-array v2, v2, [Lg0/w2;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-interface {v0, v2}, Lp1/y;->c([Lg0/w2;)V

    :cond_0
    invoke-virtual {p0}, Lp1/i;->k()Lf1/p1;

    move-result-object v0

    iput-object v0, p0, Lp1/i;->m:Lf1/p1;

    return-void
.end method

.method public V(Landroid/graphics/Matrix;)V
    .locals 2

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lp1/i;->j:Lg0/u0$a;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lg0/u0$a;->d()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lp1/i;->j:Lg0/u0$a;

    invoke-interface {v0, p1}, Lg0/u0$a;->f(Landroid/graphics/Matrix;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public W()V
    .locals 4

    invoke-virtual {p0}, Lp1/i;->p()Lr1/a;

    move-result-object v0

    const-string v1, "CameraController"

    if-nez v0, :cond_0

    const-string v0, "No ScreenFlash instance set yet, need to wait for controller to be set to either ScreenFlashView or PreviewView"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lp1/i;->e:Lg0/f1;

    sget-object v1, Lp1/i;->Q:Lg0/f1$j;

    invoke-virtual {v0, v1}, Lg0/f1;->O0(Lg0/f1$j;)V

    return-void

    :cond_0
    iget-object v2, p0, Lp1/i;->e:Lg0/f1;

    invoke-virtual {v0}, Lr1/a;->b()Lg0/f1$j;

    move-result-object v3

    invoke-virtual {v2, v3}, Lg0/f1;->O0(Lg0/f1$j;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Set ScreenFlash instance to ImageCapture, provided by "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lr1/a;->a()Lr1/a$a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public c(Lg0/a2$c;Lg0/y2;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission",
            "WrongConstant"
        }
    .end annotation

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lp1/i;->x:Lg0/a2$c;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lp1/i;->x:Lg0/a2$c;

    iget-object v0, p0, Lp1/i;->c:Lg0/a2;

    invoke-virtual {v0, p1}, Lg0/a2;->q0(Lg0/a2$c;)V

    :cond_0
    iget-object p1, p0, Lp1/i;->w:Lg0/y2;

    if-eqz p1, :cond_2

    invoke-virtual {p0, p2}, Lp1/i;->r(Lg0/y2;)La1/a;

    move-result-object p1

    iget-object v0, p0, Lp1/i;->w:Lg0/y2;

    invoke-virtual {p0, v0}, Lp1/i;->r(Lg0/y2;)La1/a;

    move-result-object v0

    if-eq p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iput-object p2, p0, Lp1/i;->w:Lg0/y2;

    invoke-virtual {p0}, Lp1/i;->N()V

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lp1/i;->P()V

    :cond_3
    invoke-virtual {p0}, Lp1/i;->L()V

    return-void
.end method

.method public d()V
    .locals 7

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lp1/i;->v:Lp1/y;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lp1/i;->c:Lg0/a2;

    iget-object v2, p0, Lp1/i;->e:Lg0/f1;

    iget-object v3, p0, Lp1/i;->k:Lg0/u0;

    iget-object v4, p0, Lp1/i;->m:Lf1/p1;

    const/4 v5, 0x4

    new-array v5, v5, [Lg0/w2;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    const/4 v1, 0x1

    aput-object v2, v5, v1

    const/4 v1, 0x2

    aput-object v3, v5, v1

    const/4 v1, 0x3

    aput-object v4, v5, v1

    invoke-interface {v0, v5}, Lp1/y;->c([Lg0/w2;)V

    :cond_0
    iget-object v0, p0, Lp1/i;->c:Lg0/a2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lg0/a2;->q0(Lg0/a2$c;)V

    iput-object v1, p0, Lp1/i;->u:Lg0/l;

    iput-object v1, p0, Lp1/i;->x:Lg0/a2$c;

    iput-object v1, p0, Lp1/i;->w:Lg0/y2;

    invoke-virtual {p0}, Lp1/i;->O()V

    return-void
.end method

.method public final e(Ln0/i2$a;La1/c;Lp1/i$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/i2$a<",
            "*>;",
            "La1/c;",
            "Lp1/i$c;",
            ")V"
        }
    .end annotation

    if-eqz p2, :cond_0

    invoke-interface {p1, p2}, Ln0/i2$a;->b(La1/c;)Ljava/lang/Object;

    return-void

    :cond_0
    iget-object p2, p0, Lp1/i;->w:Lg0/y2;

    if-eqz p2, :cond_1

    invoke-virtual {p0, p2}, Lp1/i;->r(Lg0/y2;)La1/a;

    move-result-object p2

    if-eqz p2, :cond_1

    new-instance p3, La1/c$a;

    invoke-direct {p3}, La1/c$a;-><init>()V

    invoke-virtual {p3, p2}, La1/c$a;->d(La1/a;)La1/c$a;

    move-result-object p2

    invoke-virtual {p2}, La1/c$a;->a()La1/c;

    move-result-object p2

    invoke-interface {p1, p2}, Ln0/i2$a;->b(La1/c;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final f(Lg0/v1;Landroid/graphics/PointF;)Lg0/m0;
    .locals 4

    iget v0, p2, Landroid/graphics/PointF;->x:F

    iget v1, p2, Landroid/graphics/PointF;->y:F

    const v2, 0x3e2aaaab

    invoke-virtual {p1, v0, v1, v2}, Lg0/v1;->c(FFF)Lg0/u1;

    move-result-object v0

    iget v1, p2, Landroid/graphics/PointF;->x:F

    iget p2, p2, Landroid/graphics/PointF;->y:F

    const/high16 v2, 0x3e800000    # 0.25f

    invoke-virtual {p1, v1, p2, v2}, Lg0/v1;->c(FFF)Lg0/u1;

    move-result-object p1

    new-instance p2, Lg0/m0$a;

    const/4 v1, 0x1

    invoke-direct {p2, v0, v1}, Lg0/m0$a;-><init>(Lg0/u1;I)V

    const/4 v0, 0x2

    invoke-virtual {p2, p1, v0}, Lg0/m0$a;->a(Lg0/u1;I)Lg0/m0$a;

    move-result-object p1

    iget-wide v0, p0, Lp1/i;->P:J

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-lez p2, :cond_0

    sget-object p2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, p2}, Lg0/m0$a;->e(JLjava/util/concurrent/TimeUnit;)Lg0/m0$a;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lg0/m0$a;->c()Lg0/m0$a;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Lg0/m0$a;->b()Lg0/m0;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lg0/u0;
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    new-instance v0, Lg0/u0$c;

    invoke-direct {v0}, Lg0/u0$c;-><init>()V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lg0/u0$c;->j(I)Lg0/u0$c;

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lg0/u0$c;->n(I)Lg0/u0$c;

    :cond_1
    if-eqz p3, :cond_2

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lg0/u0$c;->o(I)Lg0/u0$c;

    :cond_2
    iget-object p1, p0, Lp1/i;->l:La1/c;

    const/4 p2, 0x0

    invoke-virtual {p0, v0, p1, p2}, Lp1/i;->e(Ln0/i2$a;La1/c;Lp1/i$c;)V

    iget-object p1, p0, Lp1/i;->i:Ljava/util/concurrent/Executor;

    if-eqz p1, :cond_3

    invoke-virtual {v0, p1}, Lg0/u0$c;->i(Ljava/util/concurrent/Executor;)Lg0/u0$c;

    :cond_3
    iget p1, p0, Lp1/i;->A:I

    const/4 p2, -0x1

    if-eq p1, p2, :cond_4

    invoke-virtual {v0, p1}, Lg0/u0$c;->v(I)Lg0/u0$c;

    :cond_4
    invoke-virtual {v0}, Lg0/u0$c;->f()Lg0/u0;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljava/lang/Integer;)Lg0/f1;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    new-instance v0, Lg0/f1$b;

    invoke-direct {v0}, Lg0/f1$b;-><init>()V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lg0/f1$b;->i(I)Lg0/f1$b;

    :cond_0
    iget-object p1, p0, Lp1/i;->f:La1/c;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lp1/i;->e(Ln0/i2$a;La1/c;Lp1/i$c;)V

    iget-object p1, p0, Lp1/i;->g:Ljava/util/concurrent/Executor;

    if-eqz p1, :cond_1

    invoke-virtual {v0, p1}, Lg0/f1$b;->l(Ljava/util/concurrent/Executor;)Lg0/f1$b;

    :cond_1
    iget p1, p0, Lp1/i;->A:I

    const/4 v1, -0x1

    if-eq p1, v1, :cond_2

    invoke-virtual {v0, p1}, Lg0/f1$b;->u(I)Lg0/f1$b;

    :cond_2
    invoke-virtual {v0}, Lg0/f1$b;->f()Lg0/f1;

    move-result-object p1

    return-object p1
.end method

.method public final i()Lg0/a2;
    .locals 3

    new-instance v0, Lg0/a2$a;

    invoke-direct {v0}, Lg0/a2$a;-><init>()V

    iget-object v1, p0, Lp1/i;->d:La1/c;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lp1/i;->e(Ln0/i2$a;La1/c;Lp1/i$c;)V

    iget-object v1, p0, Lp1/i;->s:Lg0/k0;

    invoke-virtual {v0, v1}, Lg0/a2$a;->j(Lg0/k0;)Lg0/a2$a;

    invoke-virtual {v0}, Lg0/a2$a;->f()Lg0/a2;

    move-result-object v0

    return-object v0
.end method

.method public j()Lg0/x2;
    .locals 3

    invoke-virtual {p0}, Lp1/i;->u()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "CameraController"

    if-nez v0, :cond_0

    const-string v0, "Camera not initialized."

    invoke-static {v2, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_0
    invoke-virtual {p0}, Lp1/i;->x()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "PreviewView not attached to CameraController."

    invoke-static {v2, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_1
    invoke-virtual {p0}, Lp1/i;->Q()V

    new-instance v0, Lg0/x2$a;

    invoke-direct {v0}, Lg0/x2$a;-><init>()V

    iget-object v1, p0, Lp1/i;->c:Lg0/a2;

    invoke-virtual {v0, v1}, Lg0/x2$a;->b(Lg0/w2;)Lg0/x2$a;

    move-result-object v0

    invoke-virtual {p0}, Lp1/i;->w()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lp1/i;->e:Lg0/f1;

    invoke-virtual {v0, v1}, Lg0/x2$a;->b(Lg0/w2;)Lg0/x2$a;

    :cond_2
    invoke-virtual {p0}, Lp1/i;->v()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lp1/i;->k:Lg0/u0;

    invoke-virtual {v0, v1}, Lg0/x2$a;->b(Lg0/w2;)Lg0/x2$a;

    :cond_3
    invoke-virtual {p0}, Lp1/i;->z()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lp1/i;->m:Lf1/p1;

    invoke-virtual {v0, v1}, Lg0/x2$a;->b(Lg0/w2;)Lg0/x2$a;

    :cond_4
    iget-object v1, p0, Lp1/i;->w:Lg0/y2;

    invoke-virtual {v0, v1}, Lg0/x2$a;->e(Lg0/y2;)Lg0/x2$a;

    iget-object v1, p0, Lp1/i;->L:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg0/n;

    invoke-virtual {v0, v2}, Lg0/x2$a;->a(Lg0/n;)Lg0/x2$a;

    goto :goto_0

    :cond_5
    invoke-virtual {v0}, Lg0/x2$a;->c()Lg0/x2;

    move-result-object v0

    return-object v0
.end method

.method public final k()Lf1/p1;
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lf1/p1<",
            "Lf1/r0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lf1/r0$i;

    invoke-direct {v0}, Lf1/r0$i;-><init>()V

    iget-object v1, p0, Lp1/i;->p:Lf1/a0;

    invoke-virtual {v0, v1}, Lf1/r0$i;->f(Lf1/a0;)Lf1/r0$i;

    move-result-object v0

    iget-object v1, p0, Lp1/i;->w:Lg0/y2;

    const/4 v2, -0x1

    if-eqz v1, :cond_0

    iget-object v3, p0, Lp1/i;->p:Lf1/a0;

    sget-object v4, Lf1/r0;->s0:Lf1/a0;

    if-ne v3, v4, :cond_0

    invoke-virtual {p0, v1}, Lp1/i;->q(Lg0/y2;)I

    move-result v1

    if-eq v1, v2, :cond_0

    invoke-virtual {v0, v1}, Lf1/r0$i;->d(I)Lf1/r0$i;

    :cond_0
    new-instance v1, Lf1/p1$d;

    invoke-virtual {v0}, Lf1/r0$i;->c()Lf1/r0;

    move-result-object v0

    invoke-direct {v1, v0}, Lf1/p1$d;-><init>(Lf1/a2;)V

    iget-object v0, p0, Lp1/i;->t:Landroid/util/Range;

    invoke-virtual {v1, v0}, Lf1/p1$d;->q(Landroid/util/Range;)Lf1/p1$d;

    move-result-object v0

    iget v1, p0, Lp1/i;->q:I

    invoke-virtual {v0, v1}, Lf1/p1$d;->l(I)Lf1/p1$d;

    move-result-object v0

    iget-object v1, p0, Lp1/i;->r:Lg0/k0;

    invoke-virtual {v0, v1}, Lf1/p1$d;->k(Lg0/k0;)Lf1/p1$d;

    move-result-object v0

    iget v1, p0, Lp1/i;->A:I

    if-eq v1, v2, :cond_1

    invoke-virtual {v0, v1}, Lf1/p1$d;->t(I)Lf1/p1$d;

    :cond_1
    invoke-virtual {v0}, Lf1/p1$d;->f()Lf1/p1;

    move-result-object v0

    return-object v0
.end method

.method public l(Z)Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p0}, Lp1/i;->t()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lp1/i;->I:Lp1/n;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp1/n;->c(Ljava/lang/Object;)Lne/x;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lp1/i;->u:Lg0/l;

    invoke-interface {v0}, Lg0/l;->c()Lg0/m;

    move-result-object v0

    invoke-interface {v0, p1}, Lg0/m;->c(Z)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public m()I
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lp1/i;->e:Lg0/f1;

    invoke-virtual {v0}, Lg0/f1;->w0()I

    move-result v0

    return v0
.end method

.method public n()I
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lp1/i;->e:Lg0/f1;

    invoke-virtual {v0}, Lg0/f1;->v0()I

    move-result v0

    return v0
.end method

.method public final o(Lg0/v;)Ljava/lang/String;
    .locals 3

    if-nez p1, :cond_0

    const-string p1, "null"

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CameraSelector{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lg0/v;->d()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eqz v1, :cond_3

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const-string v1, "lensFacing=UNKNOWN("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string p1, "lensFacing=EXTERNAL"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    const-string p1, "lensFacing=BACK"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_3
    const-string p1, "lensFacing=FRONT"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_4
    const-string p1, "lensFacing=NOT_SPECIFIED"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string p1, "}"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public p()Lr1/a;
    .locals 2

    iget-object v0, p0, Lp1/i;->O:Ljava/util/Map;

    sget-object v1, Lr1/a$a;->b:Lr1/a$a;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp1/i;->O:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr1/a;

    return-object v0

    :cond_0
    iget-object v0, p0, Lp1/i;->O:Ljava/util/Map;

    sget-object v1, Lr1/a$a;->a:Lr1/a$a;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lp1/i;->O:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr1/a;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final q(Lg0/y2;)I
    .locals 8

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lg0/y2;->c()I

    move-result v1

    invoke-static {v1}, Lp0/c;->b(I)I

    move-result v1

    :goto_0
    const/4 v2, 0x1

    :try_start_0
    iget-object v3, p0, Lp1/i;->v:Lp1/y;

    if-eqz v3, :cond_2

    iget-object v4, p0, Lp1/i;->a:Lg0/v;

    invoke-interface {v3, v4}, Lp1/y;->a(Lg0/v;)Lg0/t;

    move-result-object v3

    invoke-interface {v3}, Lg0/t;->d()I

    move-result v4
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-interface {v3}, Lg0/t;->i()I

    move-result v3
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne v3, v2, :cond_1

    goto :goto_2

    :cond_1
    move v3, v0

    goto :goto_3

    :catch_0
    move-exception v3

    goto :goto_1

    :catch_1
    move-exception v3

    move v4, v0

    goto :goto_1

    :cond_2
    move v4, v0

    goto :goto_2

    :goto_1
    iget-object v5, p0, Lp1/i;->a:Lg0/v;

    invoke-virtual {p0, v5}, Lp1/i;->o(Lg0/v;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Failed to retrieve CameraInfo for selector: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "CameraController"

    invoke-static {v6, v5, v3}, Lg0/r1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    move v3, v2

    :goto_3
    invoke-static {v1, v4, v3}, Lp0/c;->a(IIZ)I

    move-result v1

    invoke-virtual {p1}, Lg0/y2;->a()Landroid/util/Rational;

    move-result-object p1

    const/16 v3, 0x5a

    if-eq v1, v3, :cond_3

    const/16 v3, 0x10e

    if-ne v1, v3, :cond_4

    :cond_3
    new-instance v1, Landroid/util/Rational;

    invoke-virtual {p1}, Landroid/util/Rational;->getDenominator()I

    move-result v3

    invoke-virtual {p1}, Landroid/util/Rational;->getNumerator()I

    move-result p1

    invoke-direct {v1, v3, p1}, Landroid/util/Rational;-><init>(II)V

    move-object p1, v1

    :cond_4
    sget-object v1, Lp0/a;->a:Landroid/util/Rational;

    invoke-virtual {p1, v1}, Landroid/util/Rational;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    return v0

    :cond_5
    sget-object v0, Lp0/a;->c:Landroid/util/Rational;

    invoke-virtual {p1, v0}, Landroid/util/Rational;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    return v2

    :cond_6
    const/4 p1, -0x1

    return p1
.end method

.method public final r(Lg0/y2;)La1/a;
    .locals 2

    invoke-virtual {p0, p1}, Lp1/i;->q(Lg0/y2;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    new-instance v0, La1/a;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, La1/a;-><init>(II)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public s()Landroidx/lifecycle/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/a0<",
            "Lg0/z2;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lp1/i;->E:Lp1/k;

    return-object v0
.end method

.method public final t()Z
    .locals 1

    iget-object v0, p0, Lp1/i;->u:Lg0/l;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final u()Z
    .locals 1

    iget-object v0, p0, Lp1/i;->v:Lp1/y;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public v()Z
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lp1/i;->y(I)Z

    move-result v0

    return v0
.end method

.method public w()Z
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lp1/i;->y(I)Z

    move-result v0

    return v0
.end method

.method public final x()Z
    .locals 1

    iget-object v0, p0, Lp1/i;->x:Lg0/a2$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp1/i;->w:Lg0/y2;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final y(I)Z
    .locals 1

    iget v0, p0, Lp1/i;->b:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public z()Z
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lp1/i;->y(I)Z

    move-result v0

    return v0
.end method
