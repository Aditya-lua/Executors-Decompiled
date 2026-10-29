.class public final Lf1/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf1/a2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf1/r0$l;,
        Lf1/r0$j;,
        Lf1/r0$h;,
        Lf1/r0$k;,
        Lf1/r0$i;
    }
.end annotation


# static fields
.field public static A0:J

.field public static final q0:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lf1/r0$l;",
            ">;"
        }
    .end annotation
.end field

.field public static final r0:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lf1/r0$l;",
            ">;"
        }
    .end annotation
.end field

.field public static final s0:Lf1/a0;

.field public static final t0:Lf1/c2;

.field public static final u0:Lf1/s;

.field public static final v0:Ljava/lang/Exception;

.field public static final w0:Lm1/o;

.field public static final x0:Lh1/f$a;

.field public static final y0:Ljava/util/concurrent/Executor;

.field public static z0:I


# instance fields
.field public A:Ljava/lang/Integer;

.field public B:Lg0/v2;

.field public C:Ln0/a4;

.field public D:Landroid/view/Surface;

.field public E:Landroid/view/Surface;

.field public F:Landroid/media/MediaMuxer;

.field public final G:Ln0/y2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/y2<",
            "Lf1/s;",
            ">;"
        }
    .end annotation
.end field

.field public H:Li1/n;

.field public I:Lm1/l;

.field public J:Lm1/l1;

.field public K:Lm1/l;

.field public L:Lm1/l1;

.field public M:Lf1/r0$h;

.field public N:Landroid/net/Uri;

.field public O:J

.field public P:J

.field public Q:J

.field public R:J

.field public S:I

.field public T:J

.field public U:J

.field public V:J

.field public W:J

.field public X:J

.field public Y:I

.field public Z:Ljava/lang/Throwable;

.field public final a:Ln0/y2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/y2<",
            "Lf1/g1;",
            ">;"
        }
    .end annotation
.end field

.field public a0:Lm1/i;

.field public final b:Ln0/y2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/y2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final b0:Lw0/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw0/c<",
            "Lm1/i;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/concurrent/Executor;

.field public c0:Ljava/lang/Throwable;

.field public final d:Ljava/util/concurrent/Executor;

.field public d0:Z

.field public final e:Ljava/util/concurrent/Executor;

.field public e0:Lf1/a2$a;

.field public final f:Lm1/o;

.field public f0:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field public final g:Lm1/o;

.field public g0:Z

.field public final h:Lh1/f$a;

.field public h0:Lf1/z1;

.field public final i:Ljava/lang/Object;

.field public i0:Lm1/p1;

.field public final j:Z

.field public j0:Lf1/z1;

.field public final k:I

.field public k0:D

.field public final l:J

.field public l0:Z

.field public final m:Ln0/y2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/y2<",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field public m0:Lf1/r0$k;

.field public n:Lf1/r0$l;

.field public n0:Lh1/f;

.field public o:Lf1/r0$l;

.field public o0:J

.field public p:I

.field public p0:Z

.field public q:Lf1/r0$j;

.field public r:Lf1/r0$j;

.field public s:J

.field public t:Lf1/r0$j;

.field public u:Z

.field public v:Lg0/v2$h;

.field public w:Lg0/v2$h;

.field public x:Lh1/i;

.field public final y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation
.end field

.field public z:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    sget-object v0, Lf1/r0$l;->b:Lf1/r0$l;

    sget-object v1, Lf1/r0$l;->c:Lf1/r0$l;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lf1/r0;->q0:Ljava/util/Set;

    sget-object v0, Lf1/r0$l;->a:Lf1/r0$l;

    sget-object v1, Lf1/r0$l;->d:Lf1/r0$l;

    sget-object v2, Lf1/r0$l;->h:Lf1/r0$l;

    sget-object v3, Lf1/r0$l;->g:Lf1/r0$l;

    sget-object v4, Lf1/r0$l;->i:Lf1/r0$l;

    invoke-static {v0, v1, v2, v3, v4}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lf1/r0;->r0:Ljava/util/Set;

    sget-object v0, Lf1/c2;->b:Lf1/a0;

    sput-object v0, Lf1/r0;->s0:Lf1/a0;

    invoke-static {}, Lf1/c2;->a()Lf1/c2$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lf1/c2$a;->e(Lf1/a0;)Lf1/c2$a;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lf1/c2$a;->b(I)Lf1/c2$a;

    move-result-object v0

    invoke-virtual {v0}, Lf1/c2$a;->a()Lf1/c2;

    move-result-object v0

    sput-object v0, Lf1/r0;->t0:Lf1/c2;

    invoke-static {}, Lf1/s;->a()Lf1/s$a;

    move-result-object v2

    invoke-virtual {v2, v1}, Lf1/s$a;->e(I)Lf1/s$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lf1/s$a;->f(Lf1/c2;)Lf1/s$a;

    move-result-object v0

    invoke-virtual {v0}, Lf1/s$a;->a()Lf1/s;

    move-result-object v0

    sput-object v0, Lf1/r0;->u0:Lf1/s;

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "The video frame producer became inactive before any data was received."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    sput-object v0, Lf1/r0;->v0:Ljava/lang/Exception;

    new-instance v0, Lf1/j0;

    invoke-direct {v0}, Lf1/j0;-><init>()V

    sput-object v0, Lf1/r0;->w0:Lm1/o;

    new-instance v0, Lf1/k0;

    invoke-direct {v0}, Lf1/k0;-><init>()V

    sput-object v0, Lf1/r0;->x0:Lh1/f$a;

    invoke-static {}, Lq0/c;->d()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-static {v0}, Lq0/c;->g(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v0

    sput-object v0, Lf1/r0;->y0:Ljava/util/concurrent/Executor;

    const/4 v0, 0x3

    sput v0, Lf1/r0;->z0:I

    const-wide/16 v0, 0x3e8

    sput-wide v0, Lf1/r0;->A0:J

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Lf1/s;ILm1/o;Lm1/o;Lh1/f$a;J)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lf1/r0;->i:Ljava/lang/Object;

    const-class v0, Landroidx/camera/video/internal/compat/quirk/EncoderNotUsePersistentInputSurfaceQuirk;

    invoke-static {v0}, Lk1/c;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput-boolean v0, p0, Lf1/r0;->j:Z

    const/4 v0, 0x0

    invoke-static {v0}, Ln0/y2;->l(Ljava/lang/Object;)Ln0/y2;

    move-result-object v3

    iput-object v3, p0, Lf1/r0;->m:Ln0/y2;

    sget-object v3, Lf1/r0$l;->a:Lf1/r0$l;

    iput-object v3, p0, Lf1/r0;->n:Lf1/r0$l;

    iput-object v0, p0, Lf1/r0;->o:Lf1/r0$l;

    iput v2, p0, Lf1/r0;->p:I

    iput-object v0, p0, Lf1/r0;->q:Lf1/r0$j;

    iput-object v0, p0, Lf1/r0;->r:Lf1/r0$j;

    const-wide/16 v3, 0x0

    iput-wide v3, p0, Lf1/r0;->s:J

    iput-object v0, p0, Lf1/r0;->t:Lf1/r0$j;

    iput-boolean v2, p0, Lf1/r0;->u:Z

    iput-object v0, p0, Lf1/r0;->v:Lg0/v2$h;

    iput-object v0, p0, Lf1/r0;->w:Lg0/v2$h;

    iput-object v0, p0, Lf1/r0;->x:Lh1/i;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, p0, Lf1/r0;->y:Ljava/util/List;

    iput-object v0, p0, Lf1/r0;->z:Ljava/lang/Integer;

    iput-object v0, p0, Lf1/r0;->A:Ljava/lang/Integer;

    iput-object v0, p0, Lf1/r0;->D:Landroid/view/Surface;

    iput-object v0, p0, Lf1/r0;->E:Landroid/view/Surface;

    iput-object v0, p0, Lf1/r0;->F:Landroid/media/MediaMuxer;

    iput-object v0, p0, Lf1/r0;->H:Li1/n;

    iput-object v0, p0, Lf1/r0;->I:Lm1/l;

    iput-object v0, p0, Lf1/r0;->J:Lm1/l1;

    iput-object v0, p0, Lf1/r0;->K:Lm1/l;

    iput-object v0, p0, Lf1/r0;->L:Lm1/l1;

    sget-object v5, Lf1/r0$h;->a:Lf1/r0$h;

    iput-object v5, p0, Lf1/r0;->M:Lf1/r0$h;

    sget-object v5, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iput-object v5, p0, Lf1/r0;->N:Landroid/net/Uri;

    iput-wide v3, p0, Lf1/r0;->O:J

    iput-wide v3, p0, Lf1/r0;->P:J

    iput-wide v3, p0, Lf1/r0;->Q:J

    const-wide v5, 0x7fffffffffffffffL

    iput-wide v5, p0, Lf1/r0;->R:J

    iput v2, p0, Lf1/r0;->S:I

    iput-wide v5, p0, Lf1/r0;->T:J

    iput-wide v5, p0, Lf1/r0;->U:J

    iput-wide v5, p0, Lf1/r0;->V:J

    iput-wide v3, p0, Lf1/r0;->W:J

    iput-wide v3, p0, Lf1/r0;->X:J

    iput v1, p0, Lf1/r0;->Y:I

    iput-object v0, p0, Lf1/r0;->Z:Ljava/lang/Throwable;

    iput-object v0, p0, Lf1/r0;->a0:Lm1/i;

    new-instance v1, Lw0/a;

    const/16 v3, 0x3c

    invoke-direct {v1, v3}, Lw0/a;-><init>(I)V

    iput-object v1, p0, Lf1/r0;->b0:Lw0/c;

    iput-object v0, p0, Lf1/r0;->c0:Ljava/lang/Throwable;

    iput-boolean v2, p0, Lf1/r0;->d0:Z

    sget-object v1, Lf1/a2$a;->c:Lf1/a2$a;

    iput-object v1, p0, Lf1/r0;->e0:Lf1/a2$a;

    iput-object v0, p0, Lf1/r0;->f0:Ljava/util/concurrent/ScheduledFuture;

    iput-boolean v2, p0, Lf1/r0;->g0:Z

    iput-object v0, p0, Lf1/r0;->i0:Lm1/p1;

    iput-object v0, p0, Lf1/r0;->j0:Lf1/z1;

    const-wide/16 v3, 0x0

    iput-wide v3, p0, Lf1/r0;->k0:D

    iput-boolean v2, p0, Lf1/r0;->l0:Z

    iput-object v0, p0, Lf1/r0;->m0:Lf1/r0$k;

    iput-object v0, p0, Lf1/r0;->n0:Lh1/f;

    iput-wide v5, p0, Lf1/r0;->o0:J

    iput-boolean v2, p0, Lf1/r0;->p0:Z

    iput-object p1, p0, Lf1/r0;->c:Ljava/util/concurrent/Executor;

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Lq0/c;->d()Ljava/util/concurrent/Executor;

    move-result-object p1

    :goto_1
    iput-object p1, p0, Lf1/r0;->d:Ljava/util/concurrent/Executor;

    invoke-static {p1}, Lq0/c;->g(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lf1/r0;->e:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, p2}, Lf1/r0;->E(Lf1/s;)Lf1/s;

    move-result-object p2

    invoke-static {p2}, Ln0/y2;->l(Ljava/lang/Object;)Ln0/y2;

    move-result-object p2

    iput-object p2, p0, Lf1/r0;->G:Ln0/y2;

    iput p3, p0, Lf1/r0;->k:I

    iget p2, p0, Lf1/r0;->p:I

    iget-object p3, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {p0, p3}, Lf1/r0;->N(Lf1/r0$l;)Lf1/g1$a;

    move-result-object p3

    invoke-static {p2, p3}, Lf1/g1;->d(ILf1/g1$a;)Lf1/g1;

    move-result-object p2

    invoke-static {p2}, Ln0/y2;->l(Ljava/lang/Object;)Ln0/y2;

    move-result-object p2

    iput-object p2, p0, Lf1/r0;->a:Ln0/y2;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2}, Ln0/y2;->l(Ljava/lang/Object;)Ln0/y2;

    move-result-object p2

    iput-object p2, p0, Lf1/r0;->b:Ln0/y2;

    iput-object p4, p0, Lf1/r0;->f:Lm1/o;

    iput-object p5, p0, Lf1/r0;->g:Lm1/o;

    iput-object p6, p0, Lf1/r0;->h:Lh1/f$a;

    new-instance p2, Lf1/z1;

    invoke-direct {p2, p4, v0, p1}, Lf1/z1;-><init>(Lm1/o;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    iput-object p2, p0, Lf1/r0;->h0:Lf1/z1;

    const-wide/16 p1, -0x1

    cmp-long p1, p7, p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    const-wide/32 p7, 0x3200000

    :goto_2
    iput-wide p7, p0, Lf1/r0;->l:J

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "mRequiredFreeStorageBytes = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p7, p8}, Ln1/e;->a(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Recorder"

    invoke-static {p2, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic A(Lf1/r0;)Lh1/i;
    .locals 0

    iget-object p0, p0, Lf1/r0;->x:Lh1/i;

    return-object p0
.end method

.method public static synthetic B(Lf1/r0;Lm1/p1;)Lm1/p1;
    .locals 0

    iput-object p1, p0, Lf1/r0;->i0:Lm1/p1;

    return-object p1
.end method

.method public static synthetic C(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lf1/r0;->l0(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p0

    return-object p0
.end method

.method public static L(ILg0/t;I)Lf1/h1;
    .locals 2

    new-instance v0, Lf1/d1;

    check-cast p1, Ln0/o0;

    sget-object v1, Lm1/t1;->d:Lm1/r1$a;

    invoke-direct {v0, p2, p1, p0, v1}, Lf1/d1;-><init>(ILn0/o0;ILm1/r1$a;)V

    return-object v0
.end method

.method public static R(Lf1/e1;Lf1/r0$j;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lf1/e1;->d()J

    move-result-wide v1

    invoke-virtual {p1}, Lf1/r0$j;->q()J

    move-result-wide p0

    cmp-long p0, v1, p0

    if-nez p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return v0
.end method

.method public static T(Lm1/l;)V
    .locals 1

    instance-of v0, p0, Lm1/i0;

    if-eqz v0, :cond_0

    check-cast p0, Lm1/i0;

    invoke-virtual {p0}, Lm1/i0;->c0()V

    :cond_0
    return-void
.end method

.method public static synthetic h(Lf1/r0;Lf1/r0$j;JILjava/lang/Throwable;)V
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lf1/r0;->y0(Lf1/r0$j;JILjava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic i(Lm1/l;)V
    .locals 2

    const-string v0, "Recorder"

    const-string v1, "The source didn\'t become non-streaming before timeout. Waited 1000ms"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-class v0, Landroidx/camera/video/internal/compat/quirk/DeactivateEncoderSurfaceBeforeStopEncoderQuirk;

    invoke-static {v0}, Lk1/c;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lf1/r0;->T(Lm1/l;)V

    :cond_0
    return-void
.end method

.method public static synthetic j(Lf1/r0;Ly1/c$a;Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lf1/r0;->c0:Ljava/lang/Throwable;

    if-nez v0, :cond_1

    instance-of v0, p2, Lm1/h;

    if-eqz v0, :cond_0

    sget-object v0, Lf1/r0$h;->e:Lf1/r0$h;

    invoke-virtual {p0, v0}, Lf1/r0;->m0(Lf1/r0$h;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lf1/r0$h;->f:Lf1/r0$h;

    invoke-virtual {p0, v0}, Lf1/r0;->m0(Lf1/r0$h;)V

    :goto_0
    iput-object p2, p0, Lf1/r0;->c0:Ljava/lang/Throwable;

    const/4 p2, 0x1

    invoke-virtual {p0, p2}, Lf1/r0;->D0(Z)V

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public static synthetic k(Lf1/r0;Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, Lf1/r0;->N:Landroid/net/Uri;

    return-void
.end method

.method public static synthetic l(Lf1/r0;)V
    .locals 3

    iget-object v0, p0, Lf1/r0;->B:Lg0/v2;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lf1/r0;->C:Ln0/a4;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lf1/r0;->F(Lg0/v2;Ln0/a4;Z)V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    const-string v0, "surface request is required to retry initialization."

    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0
.end method

.method public static l0(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "Ljava/util/concurrent/Executor;",
            "J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Lf1/f0;

    invoke-direct {v1, p1, p0}, Lf1/f0;-><init>(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)V

    invoke-interface {v0, v1, p2, p3, p4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lf1/r0;Lf1/a2$a;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf1/r0;->Z(Lf1/a2$a;)V

    return-void
.end method

.method public static synthetic n(Lf1/c2$a;)V
    .locals 1

    sget-object v0, Lf1/r0;->t0:Lf1/c2;

    invoke-virtual {v0}, Lf1/c2;->b()I

    move-result v0

    invoke-virtual {p0, v0}, Lf1/c2$a;->b(I)Lf1/c2$a;

    return-void
.end method

.method public static synthetic o(Lf1/r0;Lg0/v2;Ln0/a4;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lf1/r0;->a0(Lg0/v2;Ln0/a4;Z)V

    return-void
.end method

.method public static synthetic p(Lf1/r0;Lf1/r0$j;Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lf1/r0;->I:Lm1/l;

    new-instance v1, Lf1/r0$c;

    invoke-direct {v1, p0, p2, p1}, Lf1/r0$c;-><init>(Lf1/r0;Ly1/c$a;Lf1/r0$j;)V

    iget-object p0, p0, Lf1/r0;->e:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1, p0}, Lm1/l;->c(Lm1/m;Ljava/util/concurrent/Executor;)V

    const-string p0, "videoEncodingFuture"

    return-object p0
.end method

.method public static synthetic q(Lf1/r0;Lf1/r0$j;Ly1/c$a;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lf1/g0;

    invoke-direct {v0, p0, p2}, Lf1/g0;-><init>(Lf1/r0;Ly1/c$a;)V

    iget-object v1, p0, Lf1/r0;->H:Li1/n;

    iget-object v2, p0, Lf1/r0;->e:Ljava/util/concurrent/Executor;

    new-instance v3, Lf1/r0$d;

    invoke-direct {v3, p0, v0}, Lf1/r0$d;-><init>(Lf1/r0;Lx2/a;)V

    invoke-virtual {v1, v2, v3}, Li1/n;->A(Ljava/util/concurrent/Executor;Li1/n$c;)V

    iget-object v1, p0, Lf1/r0;->K:Lm1/l;

    new-instance v2, Lf1/r0$e;

    invoke-direct {v2, p0, p2, v0, p1}, Lf1/r0$e;-><init>(Lf1/r0;Ly1/c$a;Lx2/a;Lf1/r0$j;)V

    iget-object p0, p0, Lf1/r0;->e:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v2, p0}, Lm1/l;->c(Lm1/m;Ljava/util/concurrent/Executor;)V

    const-string p0, "audioEncodingFuture"

    return-object p0
.end method

.method public static synthetic r(Lf1/r0;Lg0/v2$h;)V
    .locals 0

    iput-object p1, p0, Lf1/r0;->w:Lg0/v2$h;

    return-void
.end method

.method public static synthetic s(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)V
    .locals 0

    invoke-interface {p0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic t(Lf1/r0;)Z
    .locals 0

    iget-boolean p0, p0, Lf1/r0;->p0:Z

    return p0
.end method

.method public static synthetic u(Lf1/r0;Z)Z
    .locals 0

    iput-boolean p1, p0, Lf1/r0;->p0:Z

    return p1
.end method

.method public static synthetic v(Lf1/r0;)Lne/x;
    .locals 0

    invoke-virtual {p0}, Lf1/r0;->k0()Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lf1/r0;)Ln0/y2;
    .locals 0

    iget-object p0, p0, Lf1/r0;->b:Ln0/y2;

    return-object p0
.end method

.method public static synthetic x()Lh1/f$a;
    .locals 1

    sget-object v0, Lf1/r0;->x0:Lh1/f$a;

    return-object v0
.end method

.method public static synthetic y(Lf1/r0;)Lm1/o;
    .locals 0

    iget-object p0, p0, Lf1/r0;->f:Lm1/o;

    return-object p0
.end method

.method public static synthetic z(Lf1/r0;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lf1/r0;->d:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public static z0(Lh1/i;I)I
    .locals 2

    if-eqz p0, :cond_3

    invoke-interface {p0}, Ln0/a2;->e()I

    move-result p0

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq p0, v1, :cond_2

    if-eq p0, v0, :cond_1

    const/16 v0, 0x9

    if-eq p0, v0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    const/4 p0, 0x0

    return p0

    :cond_2
    return v0

    :cond_3
    :goto_0
    return p1
.end method


# virtual methods
.method public final A0()V
    .locals 2

    iget-object v0, p0, Lf1/r0;->j0:Lf1/z1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lf1/z1;->m()Lm1/l;

    move-result-object v0

    iget-object v1, p0, Lf1/r0;->I:Lm1/l;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lx2/g;->i(Z)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Releasing video encoder: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf1/r0;->I:Lm1/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Recorder"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lf1/r0;->j0:Lf1/z1;

    invoke-virtual {v0}, Lf1/z1;->r()V

    const/4 v0, 0x0

    iput-object v0, p0, Lf1/r0;->j0:Lf1/z1;

    iput-object v0, p0, Lf1/r0;->I:Lm1/l;

    iput-object v0, p0, Lf1/r0;->J:Lm1/l1;

    invoke-virtual {p0, v0}, Lf1/r0;->o0(Landroid/view/Surface;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lf1/r0;->k0()Lne/x;

    return-void
.end method

.method public B0()V
    .locals 8

    iget-object v0, p0, Lf1/r0;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v1, "Recorder"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "tryServicePendingRecording on state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eq v1, v2, :cond_0

    const/4 v5, 0x2

    if-eq v1, v5, :cond_1

    move v5, v3

    move-object v1, v4

    :goto_0
    move-object v2, v1

    goto :goto_2

    :cond_0
    move v2, v3

    :cond_1
    iget-object v1, p0, Lf1/r0;->e0:Lf1/a2$a;

    sget-object v5, Lf1/a2$a;->c:Lf1/a2$a;

    if-ne v1, v5, :cond_2

    iget-object v1, p0, Lf1/r0;->r:Lf1/r0$j;

    iput-object v4, p0, Lf1/r0;->r:Lf1/r0$j;

    invoke-virtual {p0}, Lf1/r0;->j0()V

    sget-object v3, Lf1/r0;->v0:Ljava/lang/Exception;

    const/4 v5, 0x4

    move-object v7, v3

    move v3, v2

    move-object v2, v7

    goto :goto_2

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_2
    iget-object v1, p0, Lf1/r0;->q:Lf1/r0$j;

    if-nez v1, :cond_4

    iget-boolean v1, p0, Lf1/r0;->g0:Z

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lf1/r0;->I:Lm1/l;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {p0, v1}, Lf1/r0;->S(Lf1/r0$l;)Lf1/r0$j;

    move-result-object v1

    move v5, v3

    move v3, v2

    move-object v2, v4

    move-object v4, v1

    move-object v1, v2

    goto :goto_2

    :cond_4
    :goto_1
    const-string v1, "Recorder"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "PendingRecording is not handled, active recording = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Lf1/r0;->q:Lf1/r0$j;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ", need reset flag = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v6, p0, Lf1/r0;->g0:Z

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    move v5, v3

    move-object v1, v4

    move v3, v2

    goto :goto_0

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_6

    invoke-virtual {p0, v4, v3}, Lf1/r0;->w0(Lf1/r0$j;Z)V

    return-void

    :cond_6
    if-eqz v1, :cond_7

    invoke-virtual {p0, v1, v5, v2}, Lf1/r0;->H(Lf1/r0$j;ILjava/lang/Throwable;)V

    :cond_7
    return-void

    :goto_3
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final C0(Lf1/r0$j;Z)V
    .locals 2

    iget-object v0, p0, Lf1/r0;->y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lf1/r0;->y:Ljava/util/List;

    invoke-static {v0}, Lr0/n;->k(Ljava/util/Collection;)Lne/x;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_0
    iget-object v0, p0, Lf1/r0;->y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_1
    iget-object v0, p0, Lf1/r0;->y:Ljava/util/List;

    new-instance v1, Lf1/d0;

    invoke-direct {v1, p0, p1}, Lf1/d0;-><init>(Lf1/r0;Lf1/r0$j;)V

    invoke-static {v1}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lf1/r0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    if-nez p2, :cond_2

    iget-object p2, p0, Lf1/r0;->y:Ljava/util/List;

    new-instance v0, Lf1/e0;

    invoke-direct {v0, p0, p1}, Lf1/e0;-><init>(Lf1/r0;Lf1/r0$j;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-object p1, p0, Lf1/r0;->y:Ljava/util/List;

    invoke-static {p1}, Lr0/n;->k(Ljava/util/Collection;)Lne/x;

    move-result-object p1

    new-instance p2, Lf1/r0$f;

    invoke-direct {p2, p0}, Lf1/r0$f;-><init>(Lf1/r0;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final D()V
    .locals 1

    :goto_0
    iget-object v0, p0, Lf1/r0;->b0:Lw0/c;

    invoke-interface {v0}, Lw0/c;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lf1/r0;->b0:Lw0/c;

    invoke-interface {v0}, Lw0/c;->a()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public D0(Z)V
    .locals 3

    iget-object v0, p0, Lf1/r0;->t:Lf1/r0$j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf1/r0$j;->o()Lf1/u;

    move-result-object v1

    invoke-virtual {p0}, Lf1/r0;->J()Lf1/f1;

    move-result-object v2

    invoke-static {v1, v2}, Lf1/b2;->g(Lf1/u;Lf1/f1;)Lf1/b2$e;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lf1/r0$j;->L(Lf1/b2;Z)V

    :cond_0
    return-void
.end method

.method public final E(Lf1/s;)Lf1/s;
    .locals 2

    invoke-virtual {p1}, Lf1/s;->i()Lf1/s$a;

    move-result-object v0

    invoke-virtual {p1}, Lf1/s;->d()Lf1/c2;

    move-result-object p1

    invoke-virtual {p1}, Lf1/c2;->b()I

    move-result p1

    const/4 v1, -0x1

    if-ne p1, v1, :cond_0

    new-instance p1, Lf1/i0;

    invoke-direct {p1}, Lf1/i0;-><init>()V

    invoke-virtual {v0, p1}, Lf1/s$a;->b(Lx2/a;)Lf1/s$a;

    :cond_0
    invoke-virtual {v0}, Lf1/s$a;->a()Lf1/s;

    move-result-object p1

    return-object p1
.end method

.method public final E0(Lf1/r0$l;)V
    .locals 3

    sget-object v0, Lf1/r0;->q0:Ljava/util/Set;

    iget-object v1, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lf1/r0;->r0:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lf1/r0;->o:Lf1/r0$l;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lf1/r0;->o:Lf1/r0$l;

    iget-object v0, p0, Lf1/r0;->a:Ln0/y2;

    iget v1, p0, Lf1/r0;->p:I

    invoke-virtual {p0, p1}, Lf1/r0;->N(Lf1/r0$l;)Lf1/g1$a;

    move-result-object p1

    iget-object v2, p0, Lf1/r0;->v:Lg0/v2$h;

    invoke-static {v1, p1, v2}, Lf1/g1;->e(ILf1/g1$a;Lg0/v2$h;)Lf1/g1;

    move-result-object p1

    invoke-virtual {v0, p1}, Ln0/y2;->k(Ljava/lang/Object;)V

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid state transition. State is not a valid non-pending state while in a pending state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Can only updated non-pending state from a pending state, but state is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public final F(Lg0/v2;Ln0/a4;Z)V
    .locals 7

    invoke-virtual {p1}, Lg0/v2;->v()Z

    move-result v0

    const-string v1, "Recorder"

    if-eqz v0, :cond_0

    const-string p1, "Ignore the SurfaceRequest since it is already served."

    invoke-static {v1, p1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lf1/r0;->e:Ljava/util/concurrent/Executor;

    new-instance v2, Lf1/o0;

    invoke-direct {v2, p0}, Lf1/o0;-><init>(Lf1/r0;)V

    invoke-virtual {p1, v0, v2}, Lg0/v2;->x(Ljava/util/concurrent/Executor;Lg0/v2$i;)V

    invoke-virtual {p1}, Lg0/v2;->q()Landroid/util/Size;

    move-result-object v0

    invoke-virtual {p1}, Lg0/v2;->o()Lg0/k0;

    move-result-object v2

    invoke-virtual {p1}, Lg0/v2;->m()Ln0/p0;

    move-result-object v3

    invoke-interface {v3}, Ln0/p0;->d()Lg0/t;

    move-result-object v3

    invoke-virtual {p1}, Lg0/v2;->r()I

    move-result v4

    invoke-virtual {p0, v3, v4}, Lf1/r0;->f(Lg0/t;I)Lf1/h1;

    move-result-object v3

    invoke-interface {v3, v0, v2}, Lf1/h1;->a(Landroid/util/Size;Lg0/k0;)Lf1/x;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Using supported quality of "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " for surface size "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lf1/x;->g:Lf1/x;

    if-eq v4, v0, :cond_2

    invoke-interface {v3, v4, v2}, Lf1/h1;->d(Lf1/x;Lg0/k0;)Lh1/i;

    move-result-object v0

    iput-object v0, p0, Lf1/r0;->x:Lh1/i;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Camera advertised available quality but did not produce EncoderProfiles  for advertised quality."

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_2
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mResolvedEncoderProfiles = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lf1/r0;->x:Lh1/i;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lf1/r0;->m0:Lf1/r0$k;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lf1/r0$k;->j()V

    :cond_3
    new-instance v1, Lf1/r0$k;

    iget-boolean v5, p0, Lf1/r0;->p0:Z

    if-eqz p3, :cond_4

    sget p3, Lf1/r0;->z0:I

    :goto_1
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v6, p3

    goto :goto_2

    :cond_4
    const/4 p3, 0x0

    goto :goto_1

    :goto_2
    invoke-direct/range {v1 .. v6}, Lf1/r0$k;-><init>(Lf1/r0;Lg0/v2;Ln0/a4;ZI)V

    iput-object v1, v2, Lf1/r0;->m0:Lf1/r0$k;

    invoke-virtual {v1}, Lf1/r0$k;->l()V

    return-void
.end method

.method public F0(Lm1/i;Lf1/r0$j;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    iget-wide v3, v1, Lf1/r0;->O:J

    invoke-interface/range {p1 .. p1}, Lm1/i;->size()J

    move-result-wide v5

    add-long/2addr v3, v5

    iget-wide v5, v1, Lf1/r0;->W:J

    const-wide/16 v7, 0x0

    cmp-long v0, v5, v7

    const/4 v9, 0x0

    const-string v10, "Recorder"

    if-eqz v0, :cond_0

    cmp-long v0, v3, v5

    if-lez v0, :cond_0

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-wide v3, v1, Lf1/r0;->W:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v0

    const-string v3, "Reach file size limit %d > %d"

    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-virtual {v1, v2, v0, v9}, Lf1/r0;->W(Lf1/r0$j;ILjava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-interface/range {p1 .. p1}, Lm1/i;->f1()J

    move-result-wide v5

    iget-wide v11, v1, Lf1/r0;->T:J

    const-wide v13, 0x7fffffffffffffffL

    cmp-long v0, v11, v13

    const/4 v15, 0x1

    if-nez v0, :cond_1

    iput-wide v5, v1, Lf1/r0;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-wide v7, v1, Lf1/r0;->T:J

    invoke-static {v7, v8}, Lh1/d;->f(J)Ljava/lang/String;

    move-result-object v7

    filled-new-array {v0, v7}, [Ljava/lang/Object;

    move-result-object v0

    const-string v7, "First audio time: %d (%s)"

    invoke-static {v7, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide/from16 v16, v7

    iget-wide v7, v1, Lf1/r0;->R:J

    invoke-static {v7, v8, v11, v12}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    sub-long v7, v5, v7

    invoke-virtual {v0, v7, v8}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v7

    iget-wide v11, v1, Lf1/r0;->V:J

    cmp-long v11, v11, v13

    if-eqz v11, :cond_2

    move v11, v15

    goto :goto_0

    :cond_2
    const/4 v11, 0x0

    :goto_0
    const-string v12, "There should be a previous data for adjusting the duration."

    invoke-static {v11, v12}, Lx2/g;->j(ZLjava/lang/String;)V

    iget-wide v11, v1, Lf1/r0;->V:J

    sub-long v11, v5, v11

    invoke-virtual {v0, v11, v12}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v11

    add-long/2addr v7, v11

    iget-wide v11, v1, Lf1/r0;->X:J

    cmp-long v0, v11, v16

    if-eqz v0, :cond_3

    cmp-long v0, v7, v11

    if-lez v0, :cond_3

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-wide v3, v1, Lf1/r0;->X:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v0

    const-string v3, "Audio data reaches duration limit %d > %d"

    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x9

    invoke-virtual {v1, v2, v0, v9}, Lf1/r0;->W(Lf1/r0$j;ILjava/lang/Throwable;)V

    return-void

    :cond_3
    :goto_1
    :try_start_0
    iget-object v0, v1, Lf1/r0;->F:Landroid/media/MediaMuxer;

    iget-object v7, v1, Lf1/r0;->z:Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-interface/range {p1 .. p1}, Lm1/i;->t()Ljava/nio/ByteBuffer;

    move-result-object v8

    invoke-interface/range {p1 .. p1}, Lm1/i;->m0()Landroid/media/MediaCodec$BufferInfo;

    move-result-object v9

    invoke-virtual {v0, v7, v8, v9}, Landroid/media/MediaMuxer;->writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    iput-wide v3, v1, Lf1/r0;->O:J

    iget-wide v2, v1, Lf1/r0;->P:J

    invoke-interface/range {p1 .. p1}, Lm1/i;->size()J

    move-result-wide v7

    add-long/2addr v2, v7

    iput-wide v2, v1, Lf1/r0;->P:J

    iput-wide v5, v1, Lf1/r0;->V:J

    return-void

    :catch_0
    move-exception v0

    iget-object v3, v1, Lf1/r0;->n0:Lh1/f;

    invoke-static {v3}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh1/f;

    invoke-interface {v3}, Lh1/f;->a()J

    move-result-wide v3

    iget-wide v5, v1, Lf1/r0;->l:J

    cmp-long v3, v3, v5

    if-gez v3, :cond_4

    const/4 v15, 0x3

    :cond_4
    invoke-virtual {v1, v2, v15, v0}, Lf1/r0;->W(Lf1/r0$j;ILjava/lang/Throwable;)V

    return-void
.end method

.method public G(ILjava/lang/Throwable;)V
    .locals 11

    iget-object v0, p0, Lf1/r0;->t:Lf1/r0$j;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lf1/r0;->F:Landroid/media/MediaMuxer;

    const/4 v1, 0x1

    const/16 v2, 0x8

    const/4 v3, 0x3

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    if-eqz v0, :cond_3

    :try_start_0
    invoke-virtual {v0}, Landroid/media/MediaMuxer;->stop()V

    iget-object v0, p0, Lf1/r0;->F:Landroid/media/MediaMuxer;

    invoke-virtual {v0}, Landroid/media/MediaMuxer;->release()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "MediaMuxer failed to stop or release with error: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, "Recorder"

    invoke-static {v8, v7, v0}, Lg0/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-nez p1, :cond_2

    iget-object p1, p0, Lf1/r0;->n0:Lh1/f;

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh1/f;

    invoke-interface {p1}, Lh1/f;->a()J

    move-result-wide v7

    iget-wide v9, p0, Lf1/r0;->l:J

    cmp-long p1, v7, v9

    if-gez p1, :cond_0

    move p1, v3

    goto :goto_0

    :cond_0
    iget-wide v7, p0, Lf1/r0;->P:J

    cmp-long p1, v7, v4

    if-nez p1, :cond_1

    move p1, v2

    goto :goto_0

    :cond_1
    move p1, v1

    :cond_2
    :goto_0
    iput-object v6, p0, Lf1/r0;->F:Landroid/media/MediaMuxer;

    goto :goto_1

    :cond_3
    if-nez p1, :cond_4

    move p1, v2

    :cond_4
    :goto_1
    iget-object v0, p0, Lf1/r0;->t:Lf1/r0$j;

    iget-object v2, p0, Lf1/r0;->N:Landroid/net/Uri;

    invoke-virtual {v0, v2}, Lf1/r0$j;->h(Landroid/net/Uri;)V

    iget-object v0, p0, Lf1/r0;->t:Lf1/r0$j;

    invoke-virtual {v0}, Lf1/r0$j;->o()Lf1/u;

    move-result-object v0

    invoke-virtual {p0}, Lf1/r0;->J()Lf1/f1;

    move-result-object v2

    iget-object v7, p0, Lf1/r0;->N:Landroid/net/Uri;

    invoke-static {v7}, Lf1/v;->b(Landroid/net/Uri;)Lf1/v;

    move-result-object v7

    iget-object v8, p0, Lf1/r0;->t:Lf1/r0$j;

    if-nez p1, :cond_5

    invoke-static {v0, v2, v7}, Lf1/b2;->a(Lf1/u;Lf1/f1;Lf1/v;)Lf1/b2$a;

    move-result-object p1

    goto :goto_2

    :cond_5
    invoke-static {v0, v2, v7, p1, p2}, Lf1/b2;->b(Lf1/u;Lf1/f1;Lf1/v;ILjava/lang/Throwable;)Lf1/b2$a;

    move-result-object p1

    :goto_2
    invoke-virtual {v8, p1}, Lf1/r0$j;->I(Lf1/b2;)V

    iget-object p1, p0, Lf1/r0;->t:Lf1/r0$j;

    iput-object v6, p0, Lf1/r0;->t:Lf1/r0$j;

    const/4 p2, 0x0

    iput-boolean p2, p0, Lf1/r0;->u:Z

    iput-object v6, p0, Lf1/r0;->z:Ljava/lang/Integer;

    iput-object v6, p0, Lf1/r0;->A:Ljava/lang/Integer;

    iget-object p2, p0, Lf1/r0;->y:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->clear()V

    sget-object p2, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iput-object p2, p0, Lf1/r0;->N:Landroid/net/Uri;

    iput-wide v4, p0, Lf1/r0;->O:J

    iput-wide v4, p0, Lf1/r0;->P:J

    iput-wide v4, p0, Lf1/r0;->Q:J

    const-wide v4, 0x7fffffffffffffffL

    iput-wide v4, p0, Lf1/r0;->R:J

    iput-wide v4, p0, Lf1/r0;->T:J

    iput-wide v4, p0, Lf1/r0;->U:J

    iput-wide v4, p0, Lf1/r0;->V:J

    iput v1, p0, Lf1/r0;->Y:I

    iput-object v6, p0, Lf1/r0;->Z:Ljava/lang/Throwable;

    iput-object v6, p0, Lf1/r0;->c0:Ljava/lang/Throwable;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lf1/r0;->k0:D

    iput-object v6, p0, Lf1/r0;->n0:Lh1/f;

    iput-wide v4, p0, Lf1/r0;->o0:J

    invoke-virtual {p0}, Lf1/r0;->D()V

    invoke-virtual {p0, v6}, Lf1/r0;->n0(Lg0/v2$h;)V

    iget-object p2, p0, Lf1/r0;->M:Lf1/r0$h;

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_7

    if-eq p2, v3, :cond_7

    const/4 v0, 0x4

    if-eq p2, v0, :cond_6

    const/4 v0, 0x5

    if-eq p2, v0, :cond_6

    goto :goto_3

    :cond_6
    sget-object p2, Lf1/r0$h;->a:Lf1/r0$h;

    invoke-virtual {p0, p2}, Lf1/r0;->m0(Lf1/r0$h;)V

    goto :goto_3

    :cond_7
    sget-object p2, Lf1/r0$h;->b:Lf1/r0$h;

    invoke-virtual {p0, p2}, Lf1/r0;->m0(Lf1/r0$h;)V

    iget-object p2, p0, Lf1/r0;->H:Li1/n;

    invoke-virtual {p2}, Li1/n;->F()V

    :goto_3
    invoke-virtual {p0, p1}, Lf1/r0;->X(Lf1/r0$j;)V

    return-void

    :cond_8
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Attempted to finalize in-progress recording, but no recording is in progress."

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public G0(Lm1/i;Lf1/r0$j;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    iget-object v0, v1, Lf1/r0;->A:Ljava/lang/Integer;

    if-eqz v0, :cond_7

    iget-wide v3, v1, Lf1/r0;->O:J

    invoke-interface/range {p1 .. p1}, Lm1/i;->size()J

    move-result-wide v5

    add-long/2addr v3, v5

    iget-wide v5, v1, Lf1/r0;->W:J

    const-wide/16 v7, 0x0

    cmp-long v0, v5, v7

    const/4 v9, 0x0

    const-string v10, "Recorder"

    if-eqz v0, :cond_0

    cmp-long v0, v3, v5

    if-lez v0, :cond_0

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-wide v3, v1, Lf1/r0;->W:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v0

    const-string v3, "Reach file size limit %d > %d"

    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-virtual {v1, v2, v0, v9}, Lf1/r0;->W(Lf1/r0$j;ILjava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-interface/range {p1 .. p1}, Lm1/i;->f1()J

    move-result-wide v5

    iget-wide v11, v1, Lf1/r0;->R:J

    const-wide v13, 0x7fffffffffffffffL

    cmp-long v0, v11, v13

    const/4 v15, 0x1

    if-nez v0, :cond_1

    iput-wide v5, v1, Lf1/r0;->R:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-wide v11, v1, Lf1/r0;->R:J

    invoke-static {v11, v12}, Lh1/d;->f(J)Ljava/lang/String;

    move-result-object v9

    filled-new-array {v0, v9}, [Ljava/lang/Object;

    move-result-object v0

    const-string v9, "First video time: %d (%s)"

    invoke-static {v9, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide/from16 v16, v7

    iget-wide v7, v1, Lf1/r0;->T:J

    invoke-static {v11, v12, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    sub-long v7, v5, v7

    invoke-virtual {v0, v7, v8}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v7

    iget-wide v11, v1, Lf1/r0;->U:J

    cmp-long v11, v11, v13

    if-eqz v11, :cond_2

    move v11, v15

    goto :goto_0

    :cond_2
    const/4 v11, 0x0

    :goto_0
    const-string v12, "There should be a previous data for adjusting the duration."

    invoke-static {v11, v12}, Lx2/g;->j(ZLjava/lang/String;)V

    iget-wide v11, v1, Lf1/r0;->U:J

    sub-long v11, v5, v11

    invoke-virtual {v0, v11, v12}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v11

    add-long/2addr v11, v7

    iget-wide v13, v1, Lf1/r0;->X:J

    cmp-long v0, v13, v16

    if-eqz v0, :cond_3

    cmp-long v0, v11, v13

    if-lez v0, :cond_3

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-wide v3, v1, Lf1/r0;->X:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v0

    const-string v3, "Video data reaches duration limit %d > %d"

    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x9

    invoke-virtual {v1, v2, v0, v9}, Lf1/r0;->W(Lf1/r0$j;ILjava/lang/Throwable;)V

    return-void

    :cond_3
    :goto_1
    const/4 v9, 0x3

    :try_start_0
    iget-object v0, v1, Lf1/r0;->F:Landroid/media/MediaMuxer;

    iget-object v11, v1, Lf1/r0;->A:Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-interface/range {p1 .. p1}, Lm1/i;->t()Ljava/nio/ByteBuffer;

    move-result-object v12

    invoke-interface/range {p1 .. p1}, Lm1/i;->m0()Landroid/media/MediaCodec$BufferInfo;

    move-result-object v13

    invoke-virtual {v0, v11, v12, v13}, Landroid/media/MediaMuxer;->writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    iput-wide v3, v1, Lf1/r0;->O:J

    iput-wide v7, v1, Lf1/r0;->Q:J

    iput-wide v5, v1, Lf1/r0;->U:J

    invoke-interface/range {p1 .. p1}, Lm1/i;->w0()Z

    move-result v0

    invoke-virtual {v1, v0}, Lf1/r0;->D0(Z)V

    iget-wide v5, v1, Lf1/r0;->o0:J

    cmp-long v0, v3, v5

    if-lez v0, :cond_5

    iget-object v0, v1, Lf1/r0;->n0:Lh1/f;

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh1/f;

    invoke-interface {v0}, Lh1/f;->a()J

    move-result-wide v3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "availableBytes = "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3, v4}, Ln1/e;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v10, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-wide v5, v1, Lf1/r0;->l:J

    cmp-long v0, v3, v5

    if-gez v0, :cond_4

    new-instance v0, Ljava/io/IOException;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-wide v4, v1, Lf1/r0;->l:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes."

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2, v9, v0}, Lf1/r0;->W(Lf1/r0$j;ILjava/lang/Throwable;)V

    return-void

    :cond_4
    sub-long/2addr v3, v5

    iput-wide v3, v1, Lf1/r0;->o0:J

    :cond_5
    return-void

    :catch_0
    move-exception v0

    iget-object v3, v1, Lf1/r0;->n0:Lh1/f;

    invoke-static {v3}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh1/f;

    invoke-interface {v3}, Lh1/f;->a()J

    move-result-wide v3

    iget-wide v5, v1, Lf1/r0;->l:J

    cmp-long v3, v3, v5

    if-gez v3, :cond_6

    move v15, v9

    :cond_6
    invoke-virtual {v1, v2, v15, v0}, Lf1/r0;->W(Lf1/r0$j;ILjava/lang/Throwable;)V

    return-void

    :cond_7
    new-instance v0, Ljava/lang/AssertionError;

    const-string v2, "Video data comes before the track is added to MediaMuxer."

    invoke-direct {v0, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public final H(Lf1/r0$j;ILjava/lang/Throwable;)V
    .locals 8

    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {p1, v0}, Lf1/r0$j;->h(Landroid/net/Uri;)V

    invoke-virtual {p1}, Lf1/r0$j;->o()Lf1/u;

    move-result-object v1

    iget-object v3, p0, Lf1/r0;->c0:Ljava/lang/Throwable;

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v2, 0x1

    invoke-static/range {v2 .. v7}, Lf1/b;->e(ILjava/lang/Throwable;DJ)Lf1/b;

    move-result-object v2

    const-wide/16 v3, 0x0

    invoke-static {v3, v4, v3, v4, v2}, Lf1/f1;->d(JJLf1/b;)Lf1/f1;

    move-result-object v2

    invoke-static {v0}, Lf1/v;->b(Landroid/net/Uri;)Lf1/v;

    move-result-object v0

    invoke-static {v1, v2, v0, p2, p3}, Lf1/b2;->b(Lf1/u;Lf1/f1;Lf1/v;ILjava/lang/Throwable;)Lf1/b2$a;

    move-result-object p2

    invoke-virtual {p1, p2}, Lf1/r0$j;->I(Lf1/b2;)V

    return-void
.end method

.method public final I(J)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lm1/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    :goto_0
    iget-object v1, p0, Lf1/r0;->b0:Lw0/c;

    invoke-interface {v1}, Lw0/c;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lf1/r0;->b0:Lw0/c;

    invoke-interface {v1}, Lw0/c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm1/i;

    invoke-interface {v1}, Lm1/i;->f1()J

    move-result-wide v2

    cmp-long v2, v2, p1

    if-ltz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public J()Lf1/f1;
    .locals 11

    iget-wide v0, p0, Lf1/r0;->Q:J

    iget-wide v2, p0, Lf1/r0;->O:J

    iget-object v4, p0, Lf1/r0;->M:Lf1/r0$h;

    invoke-virtual {p0, v4}, Lf1/r0;->M(Lf1/r0$h;)I

    move-result v5

    iget-object v6, p0, Lf1/r0;->c0:Ljava/lang/Throwable;

    iget-wide v7, p0, Lf1/r0;->k0:D

    iget-wide v9, p0, Lf1/r0;->P:J

    invoke-static/range {v5 .. v10}, Lf1/b;->e(ILjava/lang/Throwable;DJ)Lf1/b;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lf1/f1;->d(JJLf1/b;)Lf1/f1;

    move-result-object v0

    return-object v0
.end method

.method public K(Ln0/s3;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ln0/s3<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p1}, Ln0/s3;->b()Lne/x;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final M(Lf1/r0$h;)I
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    if-eq v0, v1, :cond_5

    const/4 v2, 0x2

    if-eq v0, v2, :cond_5

    const/4 v1, 0x5

    const/4 v3, 0x3

    if-eq v0, v3, :cond_2

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid internal audio state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    return v3

    :cond_2
    iget-object p1, p0, Lf1/r0;->t:Lf1/r0$j;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lf1/r0$j;->v()Z

    move-result p1

    if-eqz p1, :cond_3

    return v1

    :cond_3
    iget-boolean p1, p0, Lf1/r0;->d0:Z

    if-eqz p1, :cond_4

    return v2

    :cond_4
    const/4 p1, 0x0

    return p1

    :cond_5
    return v1
.end method

.method public final N(Lf1/r0$l;)Lf1/g1$a;
    .locals 2

    const-class v0, Landroidx/camera/video/internal/compat/quirk/DeactivateEncoderSurfaceBeforeStopEncoderQuirk;

    invoke-static {v0}, Lk1/c;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v0

    check-cast v0, Landroidx/camera/video/internal/compat/quirk/DeactivateEncoderSurfaceBeforeStopEncoderQuirk;

    sget-object v1, Lf1/r0$l;->e:Lf1/r0$l;

    if-eq p1, v1, :cond_1

    sget-object v1, Lf1/r0$l;->g:Lf1/r0$l;

    if-ne p1, v1, :cond_0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lf1/g1$a;->b:Lf1/g1$a;

    return-object p1

    :cond_1
    :goto_0
    sget-object p1, Lf1/g1$a;->a:Lf1/g1$a;

    return-object p1
.end method

.method public O()Z
    .locals 2

    iget-object v0, p0, Lf1/r0;->M:Lf1/r0$h;

    sget-object v1, Lf1/r0$h;->d:Lf1/r0$h;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public P()Z
    .locals 1

    iget-object v0, p0, Lf1/r0;->G:Ln0/y2;

    invoke-virtual {p0, v0}, Lf1/r0;->K(Ln0/s3;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf1/s;

    invoke-virtual {v0}, Lf1/s;->b()Lf1/a;

    move-result-object v0

    invoke-virtual {v0}, Lf1/a;->c()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public Q()Z
    .locals 1

    iget-object v0, p0, Lf1/r0;->t:Lf1/r0$j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lf1/r0$j;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final S(Lf1/r0$l;)Lf1/r0$j;
    .locals 4

    sget-object v0, Lf1/r0$l;->c:Lf1/r0$l;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lf1/r0$l;->b:Lf1/r0$l;

    if-ne p1, v0, :cond_4

    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lf1/r0;->q:Lf1/r0$j;

    if-nez v0, :cond_3

    iget-object v0, p0, Lf1/r0;->r:Lf1/r0$j;

    if-eqz v0, :cond_2

    iput-object v0, p0, Lf1/r0;->q:Lf1/r0$j;

    invoke-virtual {v0}, Lf1/r0$j;->r()Ln0/s3;

    move-result-object v1

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lf1/r0$g;

    invoke-direct {v3, p0}, Lf1/r0$g;-><init>(Lf1/r0;)V

    invoke-virtual {v1, v2, v3}, Ln0/s3;->c(Ljava/util/concurrent/Executor;Ln0/a3$a;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lf1/r0;->r:Lf1/r0$j;

    if-eqz p1, :cond_1

    sget-object p1, Lf1/r0$l;->f:Lf1/r0$l;

    invoke-virtual {p0, p1}, Lf1/r0;->p0(Lf1/r0$l;)V

    return-object v0

    :cond_1
    sget-object p1, Lf1/r0$l;->e:Lf1/r0$l;

    invoke-virtual {p0, p1}, Lf1/r0;->p0(Lf1/r0$l;)V

    return-object v0

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Pending recording should exist when in a PENDING state."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Cannot make pending recording active because another recording is already active."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "makePendingRecordingActiveLocked() can only be called from a pending state."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public U()V
    .locals 9

    iget-object v0, p0, Lf1/r0;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    const-string v1, "Recorder"

    const-string v5, "onConfigured() was invoked when the Recorder had encountered error"

    invoke-static {v1, v5}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_3

    :catchall_0
    move-exception v1

    goto/16 :goto_5

    :pswitch_1
    iget-boolean v1, p0, Lf1/r0;->j:Z

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    new-instance v1, Ljava/lang/AssertionError;

    const-string v2, "Unexpectedly invoke onConfigured() in a STOPPING state when it\'s not waiting for a new surface."

    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :pswitch_2
    move v1, v2

    goto :goto_0

    :pswitch_3
    move v1, v4

    :goto_0
    invoke-virtual {p0}, Lf1/r0;->Q()Z

    move-result v5

    const-string v6, "Unexpectedly invoke onConfigured() when there\'s a non-persistent in-progress recording"

    invoke-static {v5, v6}, Lx2/g;->j(ZLjava/lang/String;)V

    move v8, v2

    move-object v5, v3

    move-object v6, v5

    move v7, v4

    goto :goto_4

    :pswitch_4
    new-instance v1, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Incorrectly invoke onConfigured() in state "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :pswitch_5
    move v1, v2

    goto :goto_1

    :pswitch_6
    move v1, v4

    :goto_1
    iget-object v5, p0, Lf1/r0;->q:Lf1/r0$j;

    if-eqz v5, :cond_1

    move-object v5, v3

    move-object v6, v5

    move v7, v4

    :goto_2
    move v8, v7

    goto :goto_4

    :cond_1
    iget-object v5, p0, Lf1/r0;->e0:Lf1/a2$a;

    sget-object v6, Lf1/a2$a;->c:Lf1/a2$a;

    if-ne v5, v6, :cond_2

    iget-object v5, p0, Lf1/r0;->r:Lf1/r0$j;

    iput-object v3, p0, Lf1/r0;->r:Lf1/r0$j;

    invoke-virtual {p0}, Lf1/r0;->j0()V

    sget-object v6, Lf1/r0;->v0:Ljava/lang/Exception;

    const/4 v7, 0x4

    move v8, v4

    goto :goto_4

    :cond_2
    iget-object v5, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {p0, v5}, Lf1/r0;->S(Lf1/r0$l;)Lf1/r0$j;

    move-result-object v5

    move-object v6, v3

    move v7, v4

    move v8, v7

    move-object v3, v5

    move-object v5, v6

    goto :goto_4

    :pswitch_7
    sget-object v1, Lf1/r0$l;->d:Lf1/r0$l;

    invoke-virtual {p0, v1}, Lf1/r0;->p0(Lf1/r0$l;)V

    :goto_3
    move-object v5, v3

    move-object v6, v5

    move v1, v4

    move v7, v1

    goto :goto_2

    :goto_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v8, :cond_4

    iget-object v0, p0, Lf1/r0;->t:Lf1/r0$j;

    invoke-virtual {p0, v0, v2}, Lf1/r0;->C0(Lf1/r0$j;Z)V

    iget-object v0, p0, Lf1/r0;->I:Lm1/l;

    invoke-interface {v0}, Lm1/l;->start()V

    iget-boolean v0, p0, Lf1/r0;->l0:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lf1/r0;->t:Lf1/r0$j;

    invoke-virtual {v0}, Lf1/r0$j;->o()Lf1/u;

    move-result-object v2

    invoke-virtual {p0}, Lf1/r0;->J()Lf1/f1;

    move-result-object v3

    invoke-static {v2, v3}, Lf1/b2;->e(Lf1/u;Lf1/f1;)Lf1/b2$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Lf1/r0$j;->I(Lf1/b2;)V

    iput-boolean v4, p0, Lf1/r0;->l0:Z

    :cond_3
    if-eqz v1, :cond_6

    iget-object v0, p0, Lf1/r0;->I:Lm1/l;

    invoke-interface {v0}, Lm1/l;->pause()V

    return-void

    :cond_4
    if-eqz v3, :cond_5

    invoke-virtual {p0, v3, v1}, Lf1/r0;->w0(Lf1/r0$j;Z)V

    return-void

    :cond_5
    if-eqz v5, :cond_6

    invoke-virtual {p0, v5, v7, v6}, Lf1/r0;->H(Lf1/r0$j;ILjava/lang/Throwable;)V

    :cond_6
    return-void

    :goto_5
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_0
    .end packed-switch
.end method

.method public V(Ljava/lang/Throwable;)V
    .locals 4

    iget-object v0, p0, Lf1/r0;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    new-instance v1, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Encountered encoder setup error while in unexpected state "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :catchall_0
    move-exception p1

    goto :goto_1

    :pswitch_1
    iget-object v1, p0, Lf1/r0;->r:Lf1/r0$j;

    iput-object v2, p0, Lf1/r0;->r:Lf1/r0$j;

    move-object v2, v1

    :pswitch_2
    const/4 v1, -0x1

    invoke-virtual {p0, v1}, Lf1/r0;->q0(I)V

    sget-object v1, Lf1/r0$l;->i:Lf1/r0$l;

    invoke-virtual {p0, v1}, Lf1/r0;->p0(Lf1/r0$l;)V

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    const/4 v0, 0x7

    invoke-virtual {p0, v2, v0, p1}, Lf1/r0;->H(Lf1/r0$j;ILjava/lang/Throwable;)V

    :cond_0
    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public W(Lf1/r0$j;ILjava/lang/Throwable;)V
    .locals 9

    iget-object v0, p0, Lf1/r0;->t:Lf1/r0$j;

    if-ne p1, v0, :cond_2

    iget-object v1, p0, Lf1/r0;->i:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    :try_start_1
    sget-object v0, Lf1/r0$l;->g:Lf1/r0$l;

    invoke-virtual {p0, v0}, Lf1/r0;->p0(Lf1/r0$l;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v3, p0

    goto :goto_3

    :goto_0
    :pswitch_1
    :try_start_2
    iget-object v0, p0, Lf1/r0;->q:Lf1/r0$j;

    if-ne p1, v0, :cond_1

    :goto_1
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v2, :cond_0

    const-wide/16 v5, -0x1

    move-object v3, p0

    move-object v4, p1

    move v7, p2

    move-object v8, p3

    invoke-virtual/range {v3 .. v8}, Lf1/r0;->y0(Lf1/r0$j;JILjava/lang/Throwable;)V

    return-void

    :cond_0
    move-object v3, p0

    return-void

    :catchall_1
    move-exception v0

    move-object v3, p0

    :goto_2
    move-object p1, v0

    goto :goto_3

    :cond_1
    move-object v3, p0

    :try_start_3
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Internal error occurred for recording but it is not the active recording."

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :catchall_2
    move-exception v0

    goto :goto_2

    :pswitch_2
    move-object v3, p0

    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "In-progress recording error occurred while in unexpected state: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, v3, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :goto_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw p1

    :cond_2
    move-object v3, p0

    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Internal error occurred on recording that is not the current in-progress recording."

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public final X(Lf1/r0$j;)V
    .locals 8

    iget-object v0, p0, Lf1/r0;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lf1/r0;->q:Lf1/r0$j;

    if-ne v1, p1, :cond_b

    invoke-virtual {v1}, Lf1/r0$j;->r()Ln0/s3;

    move-result-object p1

    invoke-virtual {p1}, Ln0/s3;->f()V

    const/4 p1, 0x0

    iput-object p1, p0, Lf1/r0;->q:Lf1/r0$j;

    iget-object v1, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    move-object v4, p1

    move v6, v2

    move v1, v3

    move v5, v1

    move v7, v5

    :goto_0
    move-object v2, v4

    goto/16 :goto_7

    :pswitch_1
    iget-boolean v1, p0, Lf1/r0;->j:Z

    if-eqz v1, :cond_1

    iput-object p1, p0, Lf1/r0;->E:Landroid/view/Surface;

    iget-object v1, p0, Lf1/r0;->B:Lg0/v2;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lg0/v2;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_8

    :cond_0
    move v2, v3

    :goto_1
    sget-object v1, Lf1/r0$l;->a:Lf1/r0$l;

    invoke-virtual {p0, v1}, Lf1/r0;->p0(Lf1/r0$l;)V

    move-object v4, p1

    move v5, v2

    move v1, v3

    move v6, v1

    :goto_2
    move v7, v6

    goto :goto_0

    :cond_1
    sget-object v1, Lf1/r0$l;->d:Lf1/r0$l;

    invoke-virtual {p0, v1}, Lf1/r0;->p0(Lf1/r0$l;)V

    :goto_3
    move-object v2, p1

    move-object v4, v2

    move v1, v3

    move v5, v1

    :goto_4
    move v6, v5

    move v7, v6

    goto/16 :goto_7

    :pswitch_2
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected state on finalize of recording: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :pswitch_3
    move v1, v2

    goto :goto_5

    :pswitch_4
    move v1, v3

    :goto_5
    iget-object v4, p0, Lf1/r0;->e0:Lf1/a2$a;

    sget-object v5, Lf1/a2$a;->c:Lf1/a2$a;

    if-ne v4, v5, :cond_2

    iget-object v2, p0, Lf1/r0;->r:Lf1/r0$j;

    iput-object p1, p0, Lf1/r0;->r:Lf1/r0$j;

    sget-object v4, Lf1/r0$l;->a:Lf1/r0$l;

    invoke-virtual {p0, v4}, Lf1/r0;->p0(Lf1/r0$l;)V

    sget-object v4, Lf1/r0;->v0:Ljava/lang/Exception;

    const/4 v5, 0x4

    move v6, v3

    move v7, v5

    move v5, v6

    goto :goto_7

    :cond_2
    iget-boolean v4, p0, Lf1/r0;->j:Z

    if-eqz v4, :cond_4

    iput-object p1, p0, Lf1/r0;->E:Landroid/view/Surface;

    iget-object v4, p0, Lf1/r0;->B:Lg0/v2;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lg0/v2;->v()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_6

    :cond_3
    move v2, v3

    :goto_6
    sget-object v4, Lf1/r0$l;->a:Lf1/r0$l;

    invoke-virtual {p0, v4}, Lf1/r0;->E0(Lf1/r0$l;)V

    move-object v4, p1

    move v5, v2

    move v6, v3

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lf1/r0;->I:Lm1/l;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {p0, v2}, Lf1/r0;->S(Lf1/r0$l;)Lf1/r0$j;

    move-result-object v2

    move-object v4, p1

    move v5, v3

    move v6, v5

    move v7, v6

    move-object p1, v2

    goto/16 :goto_0

    :cond_5
    move-object v2, p1

    move-object v4, v2

    move v5, v3

    goto :goto_4

    :goto_7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v5, :cond_6

    iget-object p1, p0, Lf1/r0;->B:Lg0/v2;

    iget-object v0, p0, Lf1/r0;->C:Ln0/a4;

    invoke-virtual {p0, p1, v0, v3}, Lf1/r0;->F(Lg0/v2;Ln0/a4;Z)V

    return-void

    :cond_6
    if-eqz v6, :cond_7

    invoke-virtual {p0}, Lf1/r0;->h0()V

    return-void

    :cond_7
    if-eqz p1, :cond_9

    iget-boolean v0, p0, Lf1/r0;->j:Z

    if-nez v0, :cond_8

    invoke-virtual {p0, p1, v1}, Lf1/r0;->w0(Lf1/r0$j;Z)V

    return-void

    :cond_8
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Attempt to start a pending recording while the Recorder is waiting for a new surface request."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_9
    if-eqz v2, :cond_a

    invoke-virtual {p0, v2, v7, v4}, Lf1/r0;->H(Lf1/r0$j;ILjava/lang/Throwable;)V

    :cond_a
    return-void

    :cond_b
    :try_start_1
    new-instance p1, Ljava/lang/AssertionError;

    const-string v1, "Active recording did not match finalized recording on finalize."

    invoke-direct {p1, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :goto_8
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final Y()V
    .locals 3

    iget-object v0, p0, Lf1/r0;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-virtual {p0}, Lf1/r0;->Q()Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_0
    :pswitch_1
    sget-object v1, Lf1/r0$l;->a:Lf1/r0$l;

    invoke-virtual {p0, v1}, Lf1/r0;->p0(Lf1/r0$l;)V

    goto :goto_0

    :pswitch_2
    sget-object v1, Lf1/r0$l;->a:Lf1/r0$l;

    invoke-virtual {p0, v1}, Lf1/r0;->E0(Lf1/r0$l;)V

    :goto_0
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v2, p0, Lf1/r0;->g0:Z

    if-eqz v1, :cond_1

    iget-object v0, p0, Lf1/r0;->B:Lg0/v2;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lg0/v2;->v()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lf1/r0;->B:Lg0/v2;

    iget-object v1, p0, Lf1/r0;->C:Ln0/a4;

    invoke-virtual {p0, v0, v1, v2}, Lf1/r0;->F(Lg0/v2;Ln0/a4;Z)V

    :cond_1
    return-void

    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public Z(Lf1/a2$a;)V
    .locals 3

    iget-object v0, p0, Lf1/r0;->e0:Lf1/a2$a;

    iput-object p1, p0, Lf1/r0;->e0:Lf1/a2$a;

    const-string v1, "Recorder"

    if-eq v0, p1, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Video source has transitioned to state: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lf1/a2$a;->c:Lf1/a2$a;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lf1/r0;->E:Landroid/view/Surface;

    const/4 v0, 0x4

    const/4 v2, 0x0

    if-nez p1, :cond_1

    iget-object p1, p0, Lf1/r0;->m0:Lf1/r0$k;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lf1/r0$k;->j()V

    iput-object v2, p0, Lf1/r0;->m0:Lf1/r0$k;

    :cond_0
    invoke-virtual {p0, v0, v2, v1}, Lf1/r0;->g0(ILjava/lang/Throwable;Z)V

    return-void

    :cond_1
    const/4 p1, 0x1

    iput-boolean p1, p0, Lf1/r0;->g0:Z

    iget-object p1, p0, Lf1/r0;->t:Lf1/r0$j;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lf1/r0$j;->w()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lf1/r0;->t:Lf1/r0$j;

    invoke-virtual {p0, p1, v0, v2}, Lf1/r0;->W(Lf1/r0$j;ILjava/lang/Throwable;)V

    return-void

    :cond_2
    sget-object v0, Lf1/a2$a;->b:Lf1/a2$a;

    if-ne p1, v0, :cond_3

    iget-object p1, p0, Lf1/r0;->f0:Ljava/util/concurrent/ScheduledFuture;

    if-eqz p1, :cond_3

    invoke-interface {p1, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lf1/r0;->I:Lm1/l;

    if-eqz p1, :cond_3

    invoke-static {p1}, Lf1/r0;->T(Lm1/l;)V

    :cond_3
    return-void

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Video source transitions to the same state: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public a(Lg0/v2;)V
    .locals 2

    sget-object v0, Ln0/a4;->a:Ln0/a4;

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lf1/r0;->b(Lg0/v2;Ln0/a4;Z)V

    return-void
.end method

.method public final a0(Lg0/v2;Ln0/a4;Z)V
    .locals 1

    iget-object v0, p0, Lf1/r0;->B:Lg0/v2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg0/v2;->v()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lf1/r0;->B:Lg0/v2;

    invoke-virtual {v0}, Lg0/v2;->z()Z

    :cond_0
    iput-boolean p3, p0, Lf1/r0;->p0:Z

    iput-object p1, p0, Lf1/r0;->B:Lg0/v2;

    iput-object p2, p0, Lf1/r0;->C:Ln0/a4;

    const/4 p3, 0x1

    invoke-virtual {p0, p1, p2, p3}, Lf1/r0;->F(Lg0/v2;Ln0/a4;Z)V

    return-void
.end method

.method public b(Lg0/v2;Ln0/a4;Z)V
    .locals 4

    iget-object v0, p0, Lf1/r0;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v1, "Recorder"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Surface is requested in state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", Current surface: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lf1/r0;->p:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lf1/r0;->n:Lf1/r0$l;

    sget-object v2, Lf1/r0$l;->i:Lf1/r0$l;

    if-ne v1, v2, :cond_0

    sget-object v1, Lf1/r0$l;->a:Lf1/r0$l;

    invoke-virtual {p0, v1}, Lf1/r0;->p0(Lf1/r0$l;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lf1/r0;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Lf1/p0;

    invoke-direct {v1, p0, p1, p2, p3}, Lf1/p0;-><init>(Lf1/r0;Lg0/v2;Ln0/a4;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public b0(Lf1/z1;)V
    .locals 2

    invoke-virtual {p1}, Lf1/z1;->m()Lm1/l;

    move-result-object v0

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm1/l;

    iput-object v0, p0, Lf1/r0;->I:Lm1/l;

    iget-object v1, p0, Lf1/r0;->m:Ln0/y2;

    invoke-interface {v0}, Lm1/l;->e()Lm1/f1;

    move-result-object v0

    check-cast v0, Lm1/r1;

    invoke-interface {v0}, Lm1/r1;->g()Landroid/util/Range;

    move-result-object v0

    invoke-virtual {v1, v0}, Ln0/y2;->k(Ljava/lang/Object;)V

    iget-object v0, p0, Lf1/r0;->I:Lm1/l;

    invoke-interface {v0}, Lm1/l;->h()I

    move-result v0

    iput v0, p0, Lf1/r0;->S:I

    invoke-virtual {p1}, Lf1/z1;->k()Landroid/view/Surface;

    move-result-object v0

    iput-object v0, p0, Lf1/r0;->E:Landroid/view/Surface;

    invoke-virtual {p0, v0}, Lf1/r0;->o0(Landroid/view/Surface;)V

    iget-object v0, p0, Lf1/r0;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Lf1/h0;

    invoke-direct {v1, p0}, Lf1/h0;-><init>(Lf1/r0;)V

    invoke-virtual {p1, v0, v1}, Lf1/z1;->p(Ljava/util/concurrent/Executor;Lm1/l$c$a;)V

    invoke-virtual {p1}, Lf1/z1;->l()Lne/x;

    move-result-object v0

    new-instance v1, Lf1/r0$a;

    invoke-direct {v1, p0, p1}, Lf1/r0$a;-><init>(Lf1/r0;Lf1/z1;)V

    iget-object p1, p0, Lf1/r0;->e:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, p1}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public c()Ln0/a3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln0/a3<",
            "Lf1/s;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lf1/r0;->G:Ln0/y2;

    return-object v0
.end method

.method public final c0(Lf1/r0$j;)V
    .locals 2

    iget-object v0, p0, Lf1/r0;->t:Lf1/r0$j;

    if-ne v0, p1, :cond_1

    iget-boolean p1, p0, Lf1/r0;->u:Z

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lf1/r0;->O()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lf1/r0;->K:Lm1/l;

    invoke-interface {p1}, Lm1/l;->pause()V

    :cond_0
    iget-object p1, p0, Lf1/r0;->I:Lm1/l;

    invoke-interface {p1}, Lm1/l;->pause()V

    iget-object p1, p0, Lf1/r0;->t:Lf1/r0$j;

    invoke-virtual {p1}, Lf1/r0$j;->o()Lf1/u;

    move-result-object v0

    invoke-virtual {p0}, Lf1/r0;->J()Lf1/f1;

    move-result-object v1

    invoke-static {v0, v1}, Lf1/b2;->d(Lf1/u;Lf1/f1;)Lf1/b2$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lf1/r0$j;->I(Lf1/b2;)V

    :cond_1
    return-void
.end method

.method public d(Lf1/a2$a;)V
    .locals 2

    iget-object v0, p0, Lf1/r0;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Lf1/n0;

    invoke-direct {v1, p0, p1}, Lf1/n0;-><init>(Lf1/r0;Lf1/a2$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public d0(Landroid/content/Context;Lf1/r;)Lf1/w;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lf1/r0;->e0(Landroid/content/Context;Lf1/u;)Lf1/w;

    move-result-object p1

    return-object p1
.end method

.method public e()Ln0/a3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln0/a3<",
            "Lf1/g1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lf1/r0;->a:Ln0/y2;

    return-object v0
.end method

.method public final e0(Landroid/content/Context;Lf1/u;)Lf1/w;
    .locals 1

    const-string v0, "The OutputOptions cannot be null."

    invoke-static {p2, v0}, Lx2/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lf1/w;

    invoke-direct {v0, p1, p0, p2}, Lf1/w;-><init>(Landroid/content/Context;Lf1/r0;Lf1/u;)V

    return-object v0
.end method

.method public f(Lg0/t;I)Lf1/h1;
    .locals 1

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    const/4 v0, 0x2

    :cond_0
    iget p2, p0, Lf1/r0;->k:I

    invoke-static {v0, p1, p2}, Lf1/r0;->L(ILg0/t;I)Lf1/h1;

    move-result-object p1

    return-object p1
.end method

.method public final f0()V
    .locals 3

    iget-object v0, p0, Lf1/r0;->H:Li1/n;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Lf1/r0;->H:Li1/n;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Releasing audio source: 0x%x"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Recorder"

    invoke-static {v2, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Li1/n;->w()Lne/x;

    move-result-object v1

    new-instance v2, Lf1/r0$b;

    invoke-direct {v2, p0, v0}, Lf1/r0$b;-><init>(Lf1/r0;Li1/n;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Cannot release null audio source."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public g()Ln0/a3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln0/a3<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lf1/r0;->b:Ln0/y2;

    return-object v0
.end method

.method public g0(ILjava/lang/Throwable;Z)V
    .locals 11

    iget-object v1, p0, Lf1/r0;->i:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    :pswitch_1
    sget-object v0, Lf1/r0$l;->h:Lf1/r0$l;

    invoke-virtual {p0, v0}, Lf1/r0;->p0(Lf1/r0$l;)V

    :goto_0
    move v2, v3

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :pswitch_2
    iget-object v0, p0, Lf1/r0;->t:Lf1/r0$j;

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_1

    :cond_0
    move v0, v3

    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "In-progress recording shouldn\'t be null when in state "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lx2/g;->j(ZLjava/lang/String;)V

    iget-object v0, p0, Lf1/r0;->q:Lf1/r0$j;

    iget-object v4, p0, Lf1/r0;->t:Lf1/r0$j;

    if-ne v0, v4, :cond_2

    invoke-virtual {p0}, Lf1/r0;->Q()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    sget-object v0, Lf1/r0$l;->h:Lf1/r0$l;

    invoke-virtual {p0, v0}, Lf1/r0;->p0(Lf1/r0$l;)V

    move v10, v3

    move v3, v2

    move v2, v10

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "In-progress recording does not match the active recording. Unable to reset encoder."

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :pswitch_3
    sget-object v0, Lf1/r0$l;->h:Lf1/r0$l;

    invoke-virtual {p0, v0}, Lf1/r0;->E0(Lf1/r0$l;)V

    :goto_2
    :pswitch_4
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_4

    if-eqz p3, :cond_3

    invoke-virtual {p0}, Lf1/r0;->i0()V

    return-void

    :cond_3
    invoke-virtual {p0}, Lf1/r0;->h0()V

    return-void

    :cond_4
    if-eqz v3, :cond_5

    iget-object v5, p0, Lf1/r0;->t:Lf1/r0$j;

    const-wide/16 v6, -0x1

    move-object v4, p0

    move v8, p1

    move-object v9, p2

    invoke-virtual/range {v4 .. v9}, Lf1/r0;->y0(Lf1/r0$j;JILjava/lang/Throwable;)V

    :cond_5
    return-void

    :goto_3
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method public final h0()V
    .locals 2

    iget-object v0, p0, Lf1/r0;->K:Lm1/l;

    if-eqz v0, :cond_0

    const-string v0, "Recorder"

    const-string v1, "Releasing audio encoder."

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lf1/r0;->K:Lm1/l;

    invoke-interface {v0}, Lm1/l;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lf1/r0;->K:Lm1/l;

    iput-object v0, p0, Lf1/r0;->L:Lm1/l1;

    :cond_0
    iget-object v0, p0, Lf1/r0;->H:Li1/n;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lf1/r0;->f0()V

    :cond_1
    sget-object v0, Lf1/r0$h;->a:Lf1/r0$h;

    invoke-virtual {p0, v0}, Lf1/r0;->m0(Lf1/r0$h;)V

    invoke-virtual {p0}, Lf1/r0;->i0()V

    return-void
.end method

.method public final i0()V
    .locals 2

    iget-object v0, p0, Lf1/r0;->I:Lm1/l;

    if-eqz v0, :cond_0

    const-string v0, "Recorder"

    const-string v1, "Releasing video encoder."

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf1/r0;->A0()V

    :cond_0
    invoke-virtual {p0}, Lf1/r0;->Y()V

    return-void
.end method

.method public final j0()V
    .locals 3

    sget-object v0, Lf1/r0;->q0:Ljava/util/Set;

    iget-object v1, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf1/r0;->o:Lf1/r0$l;

    invoke-virtual {p0, v0}, Lf1/r0;->p0(Lf1/r0$l;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot restore non-pending state when in state "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public final k0()Lne/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Try to safely release video encoder: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf1/r0;->I:Lm1/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Recorder"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lf1/r0;->h0:Lf1/z1;

    invoke-virtual {v0}, Lf1/z1;->q()Lne/x;

    move-result-object v0

    return-object v0
.end method

.method public m0(Lf1/r0$h;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Transitioning audio state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf1/r0;->M:Lf1/r0$h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " --> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Recorder"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lf1/r0;->M:Lf1/r0$h;

    return-void
.end method

.method public n0(Lg0/v2$h;)V
    .locals 4

    const-string v0, "Recorder"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Update stream transformation info: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lf1/r0;->v:Lg0/v2$h;

    iget-object v0, p0, Lf1/r0;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lf1/r0;->a:Ln0/y2;

    iget v2, p0, Lf1/r0;->p:I

    iget-object v3, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {p0, v3}, Lf1/r0;->N(Lf1/r0$l;)Lf1/g1$a;

    move-result-object v3

    invoke-static {v2, v3, p1}, Lf1/g1;->e(ILf1/g1$a;Lg0/v2$h;)Lf1/g1;

    move-result-object p1

    invoke-virtual {v1, p1}, Ln0/y2;->k(Ljava/lang/Object;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public o0(Landroid/view/Surface;)V
    .locals 1

    iget-object v0, p0, Lf1/r0;->D:Landroid/view/Surface;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lf1/r0;->D:Landroid/view/Surface;

    iget-object v0, p0, Lf1/r0;->i:Ljava/lang/Object;

    monitor-enter v0

    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lf1/r0;->q0(I)V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public p0(Lf1/r0$l;)V
    .locals 3

    iget-object v0, p0, Lf1/r0;->n:Lf1/r0$l;

    if-eq v0, p1, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Transitioning Recorder internal state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " --> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Recorder"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lf1/r0;->q0:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v1, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lf1/r0;->r0:Ljava/util/Set;

    iget-object v1, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf1/r0;->n:Lf1/r0$l;

    iput-object v0, p0, Lf1/r0;->o:Lf1/r0$l;

    invoke-virtual {p0, v0}, Lf1/r0;->N(Lf1/r0$l;)Lf1/g1$a;

    move-result-object v2

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid state transition. Should not be transitioning to a PENDING state from state "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lf1/r0;->o:Lf1/r0$l;

    if-eqz v0, :cond_2

    iput-object v2, p0, Lf1/r0;->o:Lf1/r0$l;

    :cond_2
    :goto_0
    iput-object p1, p0, Lf1/r0;->n:Lf1/r0$l;

    if-nez v2, :cond_3

    invoke-virtual {p0, p1}, Lf1/r0;->N(Lf1/r0$l;)Lf1/g1$a;

    move-result-object v2

    :cond_3
    iget-object p1, p0, Lf1/r0;->a:Ln0/y2;

    iget v0, p0, Lf1/r0;->p:I

    iget-object v1, p0, Lf1/r0;->v:Lg0/v2$h;

    invoke-static {v0, v2, v1}, Lf1/g1;->e(ILf1/g1$a;Lg0/v2$h;)Lf1/g1;

    move-result-object v0

    invoke-virtual {p1, v0}, Ln0/y2;->k(Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Attempted to transition to state "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", but Recorder is already in state "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public final q0(I)V
    .locals 3

    iget v0, p0, Lf1/r0;->p:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Transitioning streamId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lf1/r0;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " --> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Recorder"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput p1, p0, Lf1/r0;->p:I

    iget-object v0, p0, Lf1/r0;->a:Ln0/y2;

    iget-object v1, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {p0, v1}, Lf1/r0;->N(Lf1/r0$l;)Lf1/g1$a;

    move-result-object v1

    iget-object v2, p0, Lf1/r0;->v:Lg0/v2$h;

    invoke-static {p1, v1, v2}, Lf1/g1;->e(ILf1/g1$a;Lg0/v2$h;)Lf1/g1;

    move-result-object p1

    invoke-virtual {v0, p1}, Ln0/y2;->k(Ljava/lang/Object;)V

    return-void
.end method

.method public r0(Lf1/r0$j;)V
    .locals 10

    iget-object v0, p0, Lf1/r0;->F:Landroid/media/MediaMuxer;

    if-nez v0, :cond_d

    invoke-virtual {p0}, Lf1/r0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lf1/r0;->b0:Lw0/c;

    invoke-interface {v0}, Lw0/c;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Audio is enabled but no audio sample is ready. Cannot start media muxer."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lf1/r0;->a0:Lm1/i;

    if-eqz v0, :cond_c

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, Lf1/r0;->a0:Lm1/i;

    invoke-interface {v0}, Lm1/i;->f1()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lf1/r0;->I(J)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0}, Lm1/i;->size()J

    move-result-wide v3

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm1/i;

    invoke-interface {v6}, Lm1/i;->size()J

    move-result-wide v6

    add-long/2addr v3, v6

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_8

    :cond_2
    iget-wide v5, p0, Lf1/r0;->W:J

    const-wide/16 v7, 0x0

    cmp-long v7, v5, v7

    if-eqz v7, :cond_3

    cmp-long v5, v3, v5

    if-lez v5, :cond_3

    const-string v2, "Recorder"

    const-string v5, "Initial data exceeds file size limit %d > %d"

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-wide v6, p0, Lf1/r0;->W:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v5, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x2

    invoke-virtual {p0, p1, v2, v1}, Lf1/r0;->W(Lf1/r0$j;ILjava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Lm1/i;->close()V

    return-void

    :cond_3
    const/4 v1, 0x3

    const/4 v3, 0x5

    :try_start_1
    iget-object v4, p0, Lf1/r0;->G:Ln0/y2;

    invoke-virtual {p0, v4}, Lf1/r0;->K(Ln0/s3;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf1/s;

    invoke-virtual {v4}, Lf1/s;->c()I

    move-result v5

    const/4 v6, -0x1

    if-ne v5, v6, :cond_4

    iget-object v4, p0, Lf1/r0;->x:Lh1/i;

    sget-object v5, Lf1/r0;->u0:Lf1/s;

    invoke-virtual {v5}, Lf1/s;->c()I

    move-result v5

    invoke-static {v5}, Lf1/s;->g(I)I

    move-result v5

    invoke-static {v4, v5}, Lf1/r0;->z0(Lh1/i;I)I

    move-result v4

    goto :goto_2

    :catch_0
    move-exception v2

    goto/16 :goto_6

    :cond_4
    invoke-virtual {v4}, Lf1/s;->c()I

    move-result v4

    invoke-static {v4}, Lf1/s;->g(I)I

    move-result v4

    :goto_2
    new-instance v5, Lf1/b0;

    invoke-direct {v5, p0}, Lf1/b0;-><init>(Lf1/r0;)V

    invoke-virtual {p1, v4, v5}, Lf1/r0$j;->F(ILx2/a;)Landroid/media/MediaMuxer;

    move-result-object v4
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v5, p0, Lf1/r0;->w:Lg0/v2$h;

    if-eqz v5, :cond_5

    invoke-virtual {p0, v5}, Lf1/r0;->n0(Lg0/v2$h;)V

    invoke-virtual {v5}, Lg0/v2$h;->b()I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/media/MediaMuxer;->setOrientationHint(I)V

    :cond_5
    invoke-virtual {p1}, Lf1/r0$j;->o()Lf1/u;

    move-result-object v5

    invoke-virtual {v5}, Lf1/u;->c()Landroid/location/Location;

    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v5, :cond_6

    :try_start_3
    invoke-virtual {v5}, Landroid/location/Location;->getLatitude()D

    move-result-wide v6

    invoke-virtual {v5}, Landroid/location/Location;->getLongitude()D

    move-result-wide v8

    invoke-static {v6, v7, v8, v9}, Lo1/a;->a(DD)Landroid/util/Pair;

    move-result-object v5

    iget-object v6, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Double;

    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    double-to-float v6, v6

    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Double;

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    double-to-float v5, v7

    invoke-virtual {v4, v6, v5}, Landroid/media/MediaMuxer;->setLocation(FF)V
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_3

    :catch_1
    move-exception v1

    :try_start_4
    invoke-virtual {v4}, Landroid/media/MediaMuxer;->release()V

    invoke-virtual {p0, p1, v3, v1}, Lf1/r0;->W(Lf1/r0$j;ILjava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-interface {v0}, Lm1/i;->close()V

    return-void

    :cond_6
    :goto_3
    :try_start_5
    iget-object v3, p0, Lf1/r0;->J:Lm1/l1;

    invoke-interface {v3}, Lm1/l1;->a()Landroid/media/MediaFormat;

    move-result-object v3

    invoke-virtual {v4, v3}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, p0, Lf1/r0;->A:Ljava/lang/Integer;

    invoke-virtual {p0}, Lf1/r0;->O()Z

    move-result v3

    if-eqz v3, :cond_7

    iget-object v3, p0, Lf1/r0;->L:Lm1/l1;

    invoke-interface {v3}, Lm1/l1;->a()Landroid/media/MediaFormat;

    move-result-object v3

    invoke-virtual {v4, v3}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, p0, Lf1/r0;->z:Ljava/lang/Integer;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_7
    :try_start_6
    invoke-virtual {v4}, Landroid/media/MediaMuxer;->start()V
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    iput-object v4, p0, Lf1/r0;->F:Landroid/media/MediaMuxer;

    invoke-virtual {p0, v0, p1}, Lf1/r0;->G0(Lm1/i;Lf1/r0$j;)V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm1/i;

    invoke-virtual {p0, v2, p1}, Lf1/r0;->F0(Lm1/i;Lf1/r0$j;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_4

    :cond_8
    invoke-interface {v0}, Lm1/i;->close()V

    return-void

    :catch_2
    move-exception v2

    :try_start_8
    iget-object v3, p0, Lf1/r0;->n0:Lh1/f;

    invoke-static {v3}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh1/f;

    invoke-interface {v3}, Lh1/f;->a()J

    move-result-wide v3

    iget-wide v5, p0, Lf1/r0;->l:J

    cmp-long v3, v3, v5

    if-gez v3, :cond_9

    goto :goto_5

    :cond_9
    const/4 v1, 0x1

    :goto_5
    invoke-virtual {p0, p1, v1, v2}, Lf1/r0;->W(Lf1/r0$j;ILjava/lang/Throwable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    invoke-interface {v0}, Lm1/i;->close()V

    return-void

    :goto_6
    :try_start_9
    invoke-static {v2}, Ln1/e;->e(Ljava/lang/Exception;)Z

    move-result v4

    if-eqz v4, :cond_a

    goto :goto_7

    :cond_a
    move v1, v3

    :goto_7
    invoke-virtual {p0, p1, v1, v2}, Lf1/r0;->W(Lf1/r0$j;ILjava/lang/Throwable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    invoke-interface {v0}, Lm1/i;->close()V

    return-void

    :goto_8
    if-eqz v0, :cond_b

    :try_start_a
    invoke-interface {v0}, Lm1/i;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    goto :goto_9

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_b
    :goto_9
    throw p1

    :cond_c
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Media muxer cannot be started without an encoded video frame."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_d
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Unable to set up media muxer when one already exists."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public final s0(Lf1/r0$j;)V
    .locals 6

    iget-object v0, p0, Lf1/r0;->G:Ln0/y2;

    invoke-virtual {p0, v0}, Lf1/r0;->K(Ln0/s3;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf1/s;

    iget-object v1, p0, Lf1/r0;->x:Lh1/i;

    invoke-static {v0, v1}, Ll1/b;->c(Lf1/s;Lh1/i;)Ll1/e;

    move-result-object v1

    sget-object v2, Ln0/a4;->a:Ln0/a4;

    iget-object v3, p0, Lf1/r0;->i0:Lm1/p1;

    invoke-static {v3}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm1/p1;

    invoke-virtual {v3}, Lm1/p1;->f()I

    move-result v4

    invoke-virtual {v3}, Lm1/p1;->i()I

    move-result v5

    if-eq v4, v5, :cond_0

    new-instance v4, Landroid/util/Rational;

    invoke-virtual {v3}, Lm1/p1;->f()I

    move-result v5

    invoke-virtual {v3}, Lm1/p1;->i()I

    move-result v3

    invoke-direct {v4, v5, v3}, Landroid/util/Rational;-><init>(II)V

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v0}, Lf1/s;->b()Lf1/a;

    move-result-object v3

    invoke-static {v1, v3, v4}, Ll1/b;->d(Ll1/e;Lf1/a;Landroid/util/Rational;)Li1/a;

    move-result-object v3

    iget-object v4, p0, Lf1/r0;->H:Li1/n;

    if-eqz v4, :cond_1

    invoke-virtual {p0}, Lf1/r0;->f0()V

    :cond_1
    invoke-virtual {p0, p1, v3}, Lf1/r0;->t0(Lf1/r0$j;Li1/a;)Li1/n;

    move-result-object p1

    iput-object p1, p0, Lf1/r0;->H:Li1/n;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v4, "Set up new audio source: 0x%x"

    invoke-static {v4, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v4, "Recorder"

    invoke-static {v4, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lf1/s;->b()Lf1/a;

    move-result-object p1

    invoke-static {v1, v2, v3, p1}, Ll1/b;->b(Ll1/e;Ln0/a4;Li1/a;Lf1/a;)Lm1/a;

    move-result-object p1

    iget-object v0, p0, Lf1/r0;->g:Lm1/o;

    iget-object v1, p0, Lf1/r0;->d:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lf1/r0;->B:Lg0/v2;

    invoke-static {v2}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg0/v2;

    invoke-virtual {v2}, Lg0/v2;->r()I

    move-result v2

    invoke-interface {v0, v1, p1, v2}, Lm1/o;->a(Ljava/util/concurrent/Executor;Lm1/n;I)Lm1/l;

    move-result-object p1

    iput-object p1, p0, Lf1/r0;->K:Lm1/l;

    invoke-interface {p1}, Lm1/l;->b()Lm1/l$b;

    move-result-object p1

    instance-of v0, p1, Lm1/l$a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lf1/r0;->H:Li1/n;

    check-cast p1, Lm1/l$a;

    invoke-virtual {v0, p1}, Li1/n;->B(Lh1/c;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "The EncoderInput of audio isn\'t a ByteBufferInput."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public final t0(Lf1/r0$j;Li1/a;)Li1/n;
    .locals 1

    sget-object v0, Lf1/r0;->y0:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, p2, v0}, Lf1/r0$j;->B(Li1/a;Ljava/util/concurrent/Executor;)Li1/n;

    move-result-object p1

    return-object p1
.end method

.method public u0(Lf1/w;)Lf1/e1;
    .locals 9

    const-string v0, "The given PendingRecording cannot be null."

    invoke-static {p1, v0}, Lx2/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lf1/r0;->i:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-wide v1, p0, Lf1/r0;->s:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Lf1/r0;->s:J

    iget-object v3, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_2

    :pswitch_0
    iget-object v3, p0, Lf1/r0;->q:Lf1/r0$j;

    :goto_0
    move-object v8, v4

    move-object v4, v3

    move-object v3, v8

    goto :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :pswitch_1
    iget-object v3, p0, Lf1/r0;->r:Lf1/r0$j;

    invoke-static {v3}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf1/r0$j;

    goto :goto_0

    :pswitch_2
    iget-object v3, p0, Lf1/r0;->n:Lf1/r0$l;

    sget-object v6, Lf1/r0$l;->d:Lf1/r0$l;

    if-ne v3, v6, :cond_1

    iget-object v3, p0, Lf1/r0;->q:Lf1/r0$j;

    if-nez v3, :cond_0

    iget-object v3, p0, Lf1/r0;->r:Lf1/r0$j;

    if-nez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_1

    :cond_0
    move v3, v5

    :goto_1
    const-string v7, "Expected recorder to be idle but a recording is either pending or in progress."

    invoke-static {v3, v7}, Lx2/g;->j(ZLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :try_start_1
    invoke-static {p1, v1, v2}, Lf1/r0$j;->l(Lf1/w;J)Lf1/r0$j;

    move-result-object v3

    invoke-virtual {p1}, Lf1/w;->a()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v3, v7}, Lf1/r0$j;->u(Landroid/content/Context;)V

    iput-object v3, p0, Lf1/r0;->r:Lf1/r0$j;

    iget-object v3, p0, Lf1/r0;->n:Lf1/r0$l;

    if-ne v3, v6, :cond_2

    sget-object v3, Lf1/r0$l;->b:Lf1/r0$l;

    invoke-virtual {p0, v3}, Lf1/r0;->p0(Lf1/r0$l;)V

    iget-object v3, p0, Lf1/r0;->e:Ljava/util/concurrent/Executor;

    new-instance v6, Lf1/l0;

    invoke-direct {v6, p0}, Lf1/l0;-><init>(Lf1/r0;)V

    invoke-interface {v3, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_2

    :catch_0
    move-exception v3

    goto :goto_3

    :cond_2
    sget-object v6, Lf1/r0$l;->i:Lf1/r0$l;

    if-ne v3, v6, :cond_3

    sget-object v3, Lf1/r0$l;->b:Lf1/r0$l;

    invoke-virtual {p0, v3}, Lf1/r0;->p0(Lf1/r0$l;)V

    iget-object v3, p0, Lf1/r0;->e:Ljava/util/concurrent/Executor;

    new-instance v6, Lf1/m0;

    invoke-direct {v6, p0}, Lf1/m0;-><init>(Lf1/r0;)V

    invoke-interface {v3, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_3
    sget-object v3, Lf1/r0$l;->b:Lf1/r0$l;

    invoke-virtual {p0, v3}, Lf1/r0;->p0(Lf1/r0$l;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    move-object v3, v4

    goto :goto_4

    :goto_3
    const/4 v5, 0x5

    :goto_4
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v4, :cond_5

    if-eqz v5, :cond_4

    const-string v0, "Recorder"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Recording was started when the Recorder had encountered error "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1, v1, v2}, Lf1/r0$j;->l(Lf1/w;J)Lf1/r0$j;

    move-result-object v0

    invoke-virtual {p0, v0, v5, v3}, Lf1/r0;->H(Lf1/r0$j;ILjava/lang/Throwable;)V

    invoke-static {p1, v1, v2}, Lf1/e1;->a(Lf1/w;J)Lf1/e1;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p1, v1, v2}, Lf1/e1;->b(Lf1/w;J)Lf1/e1;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "A recording is already in progress. Previous recordings must be stopped before a new recording can be started."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_5
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public final v0(Lf1/r0$j;)V
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    iget-object v0, p0, Lf1/r0;->t:Lf1/r0$j;

    if-nez v0, :cond_d

    iput-object p1, p0, Lf1/r0;->t:Lf1/r0$j;

    iget-object v0, p0, Lf1/r0;->h:Lh1/f$a;

    invoke-virtual {p1}, Lf1/r0$j;->o()Lf1/u;

    move-result-object v1

    invoke-interface {v0, v1}, Lh1/f$a;->a(Lf1/u;)Lh1/f;

    move-result-object v0

    iput-object v0, p0, Lf1/r0;->n0:Lh1/f;

    invoke-interface {v0}, Lh1/f;->a()J

    move-result-wide v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "availableBytes = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0, v1}, Ln1/e;->a(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Recorder"

    invoke-static {v3, v2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-wide v4, p0, Lf1/r0;->l:J

    cmp-long v2, v0, v4

    const/4 v6, 0x3

    if-gez v2, :cond_0

    new-instance p1, Ljava/io/IOException;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-wide v1, p0, Lf1/r0;->l:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes."

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v6, p1}, Lf1/r0;->G(ILjava/lang/Throwable;)V

    return-void

    :cond_0
    sub-long/2addr v0, v4

    iput-wide v0, p0, Lf1/r0;->o0:J

    invoke-virtual {p1}, Lf1/r0$j;->o()Lf1/u;

    move-result-object v0

    invoke-virtual {v0}, Lf1/u;->b()J

    move-result-wide v0

    const-wide/16 v4, 0x0

    cmp-long v0, v0, v4

    if-lez v0, :cond_1

    invoke-virtual {p1}, Lf1/r0$j;->o()Lf1/u;

    move-result-object v0

    invoke-virtual {v0}, Lf1/u;->b()J

    move-result-wide v0

    long-to-double v0, v0

    const-wide v7, 0x3fee666666666666L    # 0.95

    mul-double/2addr v0, v7

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    iput-wide v0, p0, Lf1/r0;->W:J

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "File size limit in bytes: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lf1/r0;->W:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iput-wide v4, p0, Lf1/r0;->W:J

    :goto_0
    invoke-virtual {p1}, Lf1/r0$j;->o()Lf1/u;

    move-result-object v0

    invoke-virtual {v0}, Lf1/u;->a()J

    move-result-wide v0

    cmp-long v0, v0, v4

    if-lez v0, :cond_2

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1}, Lf1/r0$j;->o()Lf1/u;

    move-result-object v1

    invoke-virtual {v1}, Lf1/u;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    iput-wide v0, p0, Lf1/r0;->X:J

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Duration limit in nanoseconds: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lf1/r0;->X:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    iput-wide v4, p0, Lf1/r0;->X:J

    :goto_1
    iget-object v0, p0, Lf1/r0;->M:Lf1/r0$h;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_6

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    if-eq v0, v6, :cond_3

    const/4 v1, 0x4

    if-eq v0, v1, :cond_3

    const/4 v1, 0x5

    if-eq v0, v1, :cond_3

    goto/16 :goto_6

    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Incorrectly invoke startInternal in audio state "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf1/r0;->M:Lf1/r0$h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_4
    invoke-virtual {p1}, Lf1/r0$j;->s()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lf1/r0$h;->d:Lf1/r0$h;

    goto :goto_2

    :cond_5
    sget-object v0, Lf1/r0$h;->c:Lf1/r0$h;

    :goto_2
    invoke-virtual {p0, v0}, Lf1/r0;->m0(Lf1/r0$h;)V

    goto :goto_6

    :cond_6
    invoke-virtual {p1}, Lf1/r0$j;->s()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p0}, Lf1/r0;->P()Z

    move-result v0

    if-eqz v0, :cond_a

    :try_start_0
    iget-object v0, p0, Lf1/r0;->t:Lf1/r0$j;

    invoke-virtual {v0}, Lf1/r0$j;->w()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lf1/r0;->K:Lm1/l;

    if-nez v0, :cond_8

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v0

    goto :goto_4

    :cond_7
    :goto_3
    invoke-virtual {p0, p1}, Lf1/r0;->s0(Lf1/r0$j;)V

    :cond_8
    sget-object v0, Lf1/r0$h;->d:Lf1/r0$h;

    invoke-virtual {p0, v0}, Lf1/r0;->m0(Lf1/r0$h;)V
    :try_end_0
    .catch Li1/o; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lm1/k1; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    :goto_4
    const-string v1, "Unable to create audio resource with error: "

    invoke-static {v3, v1, v0}, Lg0/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    instance-of v1, v0, Lm1/k1;

    if-eqz v1, :cond_9

    sget-object v1, Lf1/r0$h;->e:Lf1/r0$h;

    goto :goto_5

    :cond_9
    sget-object v1, Lf1/r0$h;->f:Lf1/r0$h;

    :goto_5
    invoke-virtual {p0, v1}, Lf1/r0;->m0(Lf1/r0$h;)V

    iput-object v0, p0, Lf1/r0;->c0:Ljava/lang/Throwable;

    goto :goto_6

    :cond_a
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "The Recorder doesn\'t support recording with audio"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_b
    :goto_6
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lf1/r0;->C0(Lf1/r0$j;Z)V

    invoke-virtual {p0}, Lf1/r0;->O()Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p0, Lf1/r0;->H:Li1/n;

    invoke-virtual {p1}, Lf1/r0$j;->v()Z

    move-result p1

    invoke-virtual {v0, p1}, Li1/n;->D(Z)V

    iget-object p1, p0, Lf1/r0;->K:Lm1/l;

    invoke-interface {p1}, Lm1/l;->start()V

    :cond_c
    iget-object p1, p0, Lf1/r0;->I:Lm1/l;

    invoke-interface {p1}, Lm1/l;->start()V

    iget-object p1, p0, Lf1/r0;->t:Lf1/r0$j;

    invoke-virtual {p1}, Lf1/r0$j;->o()Lf1/u;

    move-result-object v0

    invoke-virtual {p0}, Lf1/r0;->J()Lf1/f1;

    move-result-object v1

    invoke-static {v0, v1}, Lf1/b2;->f(Lf1/u;Lf1/f1;)Lf1/b2$d;

    move-result-object v0

    invoke-virtual {p1, v0}, Lf1/r0$j;->I(Lf1/b2;)V

    return-void

    :cond_d
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Attempted to start a new recording while another was in progress."

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public final w0(Lf1/r0$j;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lf1/r0;->v0(Lf1/r0$j;)V

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lf1/r0;->c0(Lf1/r0$j;)V

    :cond_0
    return-void
.end method

.method public x0(Lf1/e1;ILjava/lang/Throwable;)V
    .locals 12

    iget-object v1, p0, Lf1/r0;->i:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lf1/r0;->r:Lf1/r0$j;

    invoke-static {p1, v0}, Lf1/r0;->R(Lf1/e1;Lf1/r0$j;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-nez v0, :cond_0

    :try_start_1
    iget-object v0, p0, Lf1/r0;->q:Lf1/r0$j;

    invoke-static {p1, v0}, Lf1/r0;->R(Lf1/e1;Lf1/r0$j;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string p2, "Recorder"

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "stop() called on a recording that is no longer active: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lf1/e1;->c()Lf1/u;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v6, p0

    goto/16 :goto_3

    :cond_0
    :try_start_2
    iget-object v0, p0, Lf1/r0;->n:Lf1/r0$l;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    :goto_0
    move-object v6, p0

    move v10, p2

    move-object v11, p3

    goto :goto_2

    :pswitch_0
    :try_start_3
    iget-object v0, p0, Lf1/r0;->q:Lf1/r0$j;

    invoke-static {p1, v0}, Lf1/r0;->R(Lf1/e1;Lf1/r0$j;)Z

    move-result p1

    invoke-static {p1}, Lx2/g;->i(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :pswitch_1
    :try_start_4
    sget-object p1, Lf1/r0$l;->g:Lf1/r0$l;

    invoke-virtual {p0, p1}, Lf1/r0;->p0(Lf1/r0$l;)V

    sget-object p1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    invoke-virtual {p1, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    move-result-wide v8

    iget-object v7, p0, Lf1/r0;->q:Lf1/r0$j;

    iget-object p1, p0, Lf1/r0;->e:Ljava/util/concurrent/Executor;

    new-instance v5, Lf1/c0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move-object v6, p0

    move v10, p2

    move-object v11, p3

    :try_start_5
    invoke-direct/range {v5 .. v11}, Lf1/c0;-><init>(Lf1/r0;Lf1/r0$j;JILjava/lang/Throwable;)V

    invoke-interface {p1, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_2

    :catchall_1
    move-exception v0

    :goto_1
    move-object p1, v0

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v6, p0

    goto :goto_1

    :pswitch_2
    move-object v6, p0

    move v10, p2

    move-object v11, p3

    iget-object p2, v6, Lf1/r0;->r:Lf1/r0$j;

    invoke-static {p1, p2}, Lf1/r0;->R(Lf1/e1;Lf1/r0$j;)Z

    move-result p1

    invoke-static {p1}, Lx2/g;->i(Z)V

    iget-object p1, v6, Lf1/r0;->r:Lf1/r0$j;

    iput-object v2, v6, Lf1/r0;->r:Lf1/r0$j;

    invoke-virtual {p0}, Lf1/r0;->j0()V

    move-object v2, p1

    :goto_2
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-eqz v2, :cond_2

    const/16 p1, 0xa

    if-ne v10, p1, :cond_1

    const-string p1, "Recorder"

    const-string p2, "Recording was stopped due to recording being garbage collected before any valid data has been produced."

    invoke-static {p1, p2}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Recording was stopped before any data could be produced."

    invoke-direct {p1, p2, v11}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/16 p2, 0x8

    invoke-virtual {p0, v2, p2, p1}, Lf1/r0;->H(Lf1/r0$j;ILjava/lang/Throwable;)V

    :cond_2
    return-void

    :pswitch_3
    move-object v6, p0

    :try_start_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Calling stop() while idling or initializing is invalid."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_3
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public y0(Lf1/r0$j;JILjava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lf1/r0;->t:Lf1/r0$j;

    if-ne v0, p1, :cond_3

    iget-boolean p1, p0, Lf1/r0;->u:Z

    if-nez p1, :cond_3

    const/4 p1, 0x1

    iput-boolean p1, p0, Lf1/r0;->u:Z

    iput p4, p0, Lf1/r0;->Y:I

    iput-object p5, p0, Lf1/r0;->Z:Ljava/lang/Throwable;

    invoke-virtual {p0}, Lf1/r0;->O()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lf1/r0;->D()V

    iget-object p1, p0, Lf1/r0;->K:Lm1/l;

    invoke-interface {p1, p2, p3}, Lm1/l;->d(J)V

    :cond_0
    iget-object p1, p0, Lf1/r0;->a0:Lm1/i;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lm1/i;->close()V

    const/4 p1, 0x0

    iput-object p1, p0, Lf1/r0;->a0:Lm1/i;

    :cond_1
    iget-object p1, p0, Lf1/r0;->e0:Lf1/a2$a;

    sget-object p4, Lf1/a2$a;->b:Lf1/a2$a;

    if-eq p1, p4, :cond_2

    iget-object p1, p0, Lf1/r0;->I:Lm1/l;

    new-instance p4, Lf1/q0;

    invoke-direct {p4, p1}, Lf1/q0;-><init>(Lm1/l;)V

    iget-object p1, p0, Lf1/r0;->e:Ljava/util/concurrent/Executor;

    const-wide/16 v0, 0x3e8

    sget-object p5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p4, p1, v0, v1, p5}, Lf1/r0;->l0(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lf1/r0;->f0:Ljava/util/concurrent/ScheduledFuture;

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lf1/r0;->I:Lm1/l;

    invoke-static {p1}, Lf1/r0;->T(Lm1/l;)V

    :goto_0
    iget-object p1, p0, Lf1/r0;->I:Lm1/l;

    invoke-interface {p1, p2, p3}, Lm1/l;->d(J)V

    :cond_3
    return-void
.end method
