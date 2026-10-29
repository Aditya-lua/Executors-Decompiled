.class public Lm1/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm1/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm1/i0$g;,
        Lm1/i0$e;,
        Lm1/i0$h;,
        Lm1/i0$f;,
        Lm1/i0$d;
    }
.end annotation


# static fields
.field public static final H:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public A:Ljava/lang/Long;

.field public B:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation
.end field

.field public C:Lm1/i0$g;

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation
.end field

.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/Object;

.field public final c:Z

.field public final d:Lm1/n;

.field public final e:Landroid/media/MediaFormat;

.field public final f:Landroid/media/MediaCodec;

.field public final g:Lm1/l$b;

.field public final h:Lm1/f1;

.field public final i:Ljava/util/concurrent/Executor;

.field public final j:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Ly1/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final m:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Ly1/c$a<",
            "Lm1/h1;",
            ">;>;"
        }
    .end annotation
.end field

.field public final n:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lm1/h1;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lm1/k;",
            ">;"
        }
    .end annotation
.end field

.field public final p:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Landroid/util/Range<",
            "Ljava/lang/Long;",
            ">;>;"
        }
    .end annotation
.end field

.field public final q:Ln0/a4;

.field public final r:Lm1/o1;

.field public final s:Landroid/util/Rational;

.field public final t:Z

.field public u:Lm1/m;

.field public v:Ljava/util/concurrent/Executor;

.field public w:Lm1/i0$f;

.field public x:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public y:J

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0, v0}, Landroid/util/Range;->create(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;

    move-result-object v0

    sput-object v0, Lm1/i0;->H:Landroid/util/Range;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Lm1/n;I)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lm1/i0;->b:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lm1/i0;->l:Ljava/util/Queue;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lm1/i0;->m:Ljava/util/Queue;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lm1/i0;->n:Ljava/util/Set;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lm1/i0;->o:Ljava/util/Set;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lm1/i0;->p:Ljava/util/Deque;

    sget-object v0, Lm1/m;->a:Lm1/m;

    iput-object v0, p0, Lm1/i0;->u:Lm1/m;

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lm1/i0;->v:Ljava/util/concurrent/Executor;

    sget-object v0, Lm1/i0;->H:Landroid/util/Range;

    iput-object v0, p0, Lm1/i0;->x:Landroid/util/Range;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lm1/i0;->y:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lm1/i0;->z:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lm1/i0;->A:Ljava/lang/Long;

    iput-object v1, p0, Lm1/i0;->B:Ljava/util/concurrent/Future;

    iput-object v1, p0, Lm1/i0;->C:Lm1/i0$g;

    iput-boolean v0, p0, Lm1/i0;->D:Z

    iput-boolean v0, p0, Lm1/i0;->E:Z

    iput-boolean v0, p0, Lm1/i0;->F:Z

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm1/n;

    iput-object v1, p0, Lm1/i0;->d:Lm1/n;

    invoke-static {p2}, Ln1/a;->b(Lm1/n;)Landroid/media/MediaCodec;

    move-result-object v1

    iput-object v1, p0, Lm1/i0;->f:Landroid/media/MediaCodec;

    invoke-virtual {v1}, Landroid/media/MediaCodec;->getCodecInfo()Landroid/media/MediaCodecInfo;

    move-result-object v1

    invoke-static {p1}, Lq0/c;->g(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p1

    iput-object p1, p0, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    invoke-interface {p2}, Lm1/n;->a()Landroid/media/MediaFormat;

    move-result-object p1

    iput-object p1, p0, Lm1/i0;->e:Landroid/media/MediaFormat;

    invoke-interface {p2}, Lm1/n;->c()Ln0/a4;

    move-result-object v2

    iput-object v2, p0, Lm1/i0;->q:Ln0/a4;

    new-instance v3, Lm1/n1;

    invoke-direct {v3}, Lm1/n1;-><init>()V

    new-instance v4, Lm1/d0;

    invoke-direct {v4, p0}, Lm1/d0;-><init>(Lm1/i0;)V

    invoke-static {v3, v4}, Lm1/i0;->f0(Lm1/o1;Lt/a;)Lm1/o1;

    move-result-object v3

    iput-object v3, p0, Lm1/i0;->r:Lm1/o1;

    instance-of v3, p2, Lm1/a;

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    move-object v3, p2

    check-cast v3, Lm1/a;

    const-string v5, "AudioEncoder"

    iput-object v5, p0, Lm1/i0;->a:Ljava/lang/String;

    iput-boolean v0, p0, Lm1/i0;->c:Z

    new-instance v5, Lm1/i0$e;

    invoke-direct {v5, p0}, Lm1/i0$e;-><init>(Lm1/i0;)V

    iput-object v5, p0, Lm1/i0;->g:Lm1/l$b;

    new-instance v5, Lm1/b;

    invoke-interface {p2}, Lm1/n;->b()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v5, v1, p2}, Lm1/b;-><init>(Landroid/media/MediaCodecInfo;Ljava/lang/String;)V

    iput-object v5, p0, Lm1/i0;->h:Lm1/f1;

    new-instance p2, Landroid/util/Rational;

    invoke-virtual {v3}, Lm1/a;->f()I

    move-result v1

    invoke-virtual {v3}, Lm1/a;->h()I

    move-result v3

    invoke-direct {p2, v1, v3}, Landroid/util/Rational;-><init>(II)V

    iput-object p2, p0, Lm1/i0;->s:Landroid/util/Rational;

    goto :goto_0

    :cond_0
    instance-of v3, p2, Lm1/p1;

    if-eqz v3, :cond_2

    move-object v3, p2

    check-cast v3, Lm1/p1;

    const-string v5, "VideoEncoder"

    iput-object v5, p0, Lm1/i0;->a:Ljava/lang/String;

    iput-boolean v4, p0, Lm1/i0;->c:Z

    new-instance v5, Lm1/i0$h;

    invoke-direct {v5, p0}, Lm1/i0$h;-><init>(Lm1/i0;)V

    iput-object v5, p0, Lm1/i0;->g:Lm1/l$b;

    new-instance v5, Lm1/t1;

    invoke-interface {p2}, Lm1/n;->b()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v5, v1, p2}, Lm1/t1;-><init>(Landroid/media/MediaCodecInfo;Ljava/lang/String;)V

    invoke-virtual {p0, v5, p1}, Lm1/i0;->H(Lm1/r1;Landroid/media/MediaFormat;)V

    iput-object v5, p0, Lm1/i0;->h:Lm1/f1;

    new-instance p2, Landroid/util/Rational;

    invoke-virtual {v3}, Lm1/p1;->f()I

    move-result v1

    invoke-virtual {v3}, Lm1/p1;->i()I

    move-result v3

    invoke-direct {p2, v1, v3}, Landroid/util/Rational;-><init>(II)V

    iput-object p2, p0, Lm1/i0;->s:Landroid/util/Rational;

    :goto_0
    iget-object p2, p0, Lm1/i0;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mInputTimebase = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lm1/i0;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mMediaFormat = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lm1/i0;->a:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "mCaptureToEncodeFrameRateRatio = "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm1/i0;->s:Landroid/util/Rational;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Lm1/i0;->X()V
    :try_end_0
    .catch Landroid/media/MediaCodec$CodecException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    new-instance p2, Lm1/e0;

    invoke-direct {p2, p1}, Lm1/e0;-><init>(Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-static {p2}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p2

    invoke-static {p2}, Lr0/n;->s(Lne/x;)Lne/x;

    move-result-object p2

    iput-object p2, p0, Lm1/i0;->j:Lne/x;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly1/c$a;

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly1/c$a;

    iput-object p1, p0, Lm1/i0;->k:Ly1/c$a;

    iget-boolean p1, p0, Lm1/i0;->c:Z

    if-eqz p1, :cond_1

    if-ne p3, v4, :cond_1

    const-class p1, Landroidx/camera/video/internal/compat/quirk/PreviewFreezeAfterHighSpeedRecordingQuirk;

    invoke-static {p1}, Lk1/c;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object p1

    if-eqz p1, :cond_1

    move v0, v4

    :cond_1
    iput-boolean v0, p0, Lm1/i0;->t:Z

    sget-object p1, Lm1/i0$f;->a:Lm1/i0$f;

    invoke-virtual {p0, p1}, Lm1/i0;->Z(Lm1/i0$f;)V

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lm1/k1;

    invoke-direct {p2, p1}, Lm1/k1;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_2
    new-instance p1, Lm1/k1;

    const-string p2, "Unknown encoder config type"

    invoke-direct {p1, p2}, Lm1/k1;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic A(Lm1/i0;J)J
    .locals 0

    invoke-virtual {p0, p1, p2}, Lm1/i0;->e0(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic B(Lm1/i0;)Ljava/util/concurrent/Future;
    .locals 0

    iget-object p0, p0, Lm1/i0;->G:Ljava/util/concurrent/Future;

    return-object p0
.end method

.method public static synthetic C(Lm1/i0;Ljava/util/concurrent/Future;)Ljava/util/concurrent/Future;
    .locals 0

    iput-object p1, p0, Lm1/i0;->G:Ljava/util/concurrent/Future;

    return-object p1
.end method

.method public static synthetic D(Lm1/i0;)Z
    .locals 0

    invoke-virtual {p0}, Lm1/i0;->S()Z

    move-result p0

    return p0
.end method

.method public static synthetic E(Lm1/i0;)Lm1/n;
    .locals 0

    iget-object p0, p0, Lm1/i0;->d:Lm1/n;

    return-object p0
.end method

.method public static N(Landroid/media/MediaCodec$BufferInfo;)Z
    .locals 0

    iget p0, p0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 p0, p0, 0x4

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static Q(Landroid/media/MediaCodec$BufferInfo;)Z
    .locals 1

    iget p0, p0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    const/4 v0, 0x1

    and-int/2addr p0, v0

    if-eqz p0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static R(Landroid/util/Rational;)Z
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/util/Rational;->getDenominator()I

    move-result v0

    invoke-virtual {p0}, Landroid/util/Rational;->getNumerator()I

    move-result p0

    if-ne v0, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static f0(Lm1/o1;Lt/a;)Lm1/o1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm1/o1;",
            "Lt/a<",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;)",
            "Lm1/o1;"
        }
    .end annotation

    new-instance v0, Lm1/i0$c;

    invoke-direct {v0, p1, p0}, Lm1/i0$c;-><init>(Lt/a;Lm1/o1;)V

    return-object v0
.end method

.method public static synthetic i(Lm1/i0;)V
    .locals 2

    iget-boolean v0, p0, Lm1/i0;->z:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm1/i0;->a:Ljava/lang/String;

    const-string v1, "The data didn\'t reach the expected timestamp before timeout, stop the codec."

    invoke-static {v0, v1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lm1/i0;->A:Ljava/lang/Long;

    invoke-virtual {p0}, Lm1/i0;->a0()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lm1/i0;->z:Z

    :cond_0
    return-void
.end method

.method public static synthetic j(Lm1/i0;)V
    .locals 2

    iget-object v0, p0, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    new-instance v1, Lm1/x;

    invoke-direct {v1, p0}, Lm1/x;-><init>(Lm1/i0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic k(Lm1/i0;)V
    .locals 2

    iget-object v0, p0, Lm1/i0;->w:Lm1/i0$f;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 p0, 0x6

    if-eq v0, p0, :cond_0

    const/16 p0, 0x8

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Encoder is released"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-virtual {p0}, Lm1/i0;->W()V

    return-void
.end method

.method public static synthetic l(Lm1/i0;ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lm1/i0;->U(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic m(Lm1/i0;J)V
    .locals 3

    iget-object v0, p0, Lm1/i0;->w:Lm1/i0$f;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unknown state: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lm1/i0;->w:Lm1/i0$f;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Encoder is released"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_1
    sget-object p1, Lm1/i0$f;->f:Lm1/i0$f;

    invoke-virtual {p0, p1}, Lm1/i0;->Z(Lm1/i0$f;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lm1/i0;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Pause on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1, p2}, Lh1/d;->f(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lm1/i0;->p:Ljava/util/Deque;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-wide v1, 0x7fffffffffffffffL

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Range;->create(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Deque;->addLast(Ljava/lang/Object;)V

    sget-object p1, Lm1/i0$f;->c:Lm1/i0$f;

    invoke-virtual {p0, p1}, Lm1/i0;->Z(Lm1/i0$f;)V

    :pswitch_3
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_0
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic n(Ljava/util/concurrent/Executor;Lm1/i0$g;)V
    .locals 1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lm1/c0;

    invoke-direct {v0, p1}, Lm1/c0;-><init>(Lm1/i0$g;)V

    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic o(Lm1/i0;Lm1/j1;)V
    .locals 0

    iget-object p0, p0, Lm1/i0;->n:Ljava/util/Set;

    invoke-interface {p0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic p(Lm1/i0;)V
    .locals 0

    invoke-virtual {p0}, Lm1/i0;->b0()V

    return-void
.end method

.method public static synthetic q(Lm1/i0;)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lm1/i0;->E:Z

    iget-boolean v0, p0, Lm1/i0;->D:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lm1/i0;->t:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lm1/i0;->a:Ljava/lang/String;

    const-string v1, "mMediaCodec.stop()"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lm1/i0;->f:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    :cond_0
    invoke-virtual {p0}, Lm1/i0;->X()V

    :cond_1
    return-void
.end method

.method public static synthetic r(Lm1/m;ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    new-instance v0, Lm1/h;

    invoke-direct {v0, p1, p2, p3}, Lm1/h;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p0, v0}, Lm1/m;->c(Lm1/h;)V

    return-void
.end method

.method public static synthetic s(Lm1/i0;JJ)V
    .locals 6

    iget-object v0, p0, Lm1/i0;->w:Lm1/i0$f;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unknown state: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lm1/i0;->w:Lm1/i0$f;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Encoder is released"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_1
    sget-object p1, Lm1/i0$f;->a:Lm1/i0$f;

    invoke-virtual {p0, p1}, Lm1/i0;->Z(Lm1/i0$f;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lm1/i0;->w:Lm1/i0$f;

    sget-object v1, Lm1/i0$f;->d:Lm1/i0$f;

    invoke-virtual {p0, v1}, Lm1/i0;->Z(Lm1/i0$f;)V

    iget-object v1, p0, Lm1/i0;->x:Landroid/util/Range;

    invoke-virtual {v1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    const-wide v4, 0x7fffffffffffffffL

    cmp-long v4, v2, v4

    if-eqz v4, :cond_4

    const-wide/16 v4, -0x1

    cmp-long v4, p1, v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    cmp-long v4, p1, v2

    if-gez v4, :cond_1

    iget-object p1, p0, Lm1/i0;->a:Ljava/lang/String;

    const-string p2, "The expected stop time is less than the start time. Use current time as stop time."

    invoke-static {p1, p2}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    move-wide p1, p3

    :cond_1
    cmp-long p3, p1, v2

    if-ltz p3, :cond_3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-static {v1, p3}, Landroid/util/Range;->create(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;

    move-result-object p3

    iput-object p3, p0, Lm1/i0;->x:Landroid/util/Range;

    iget-object p3, p0, Lm1/i0;->a:Ljava/lang/String;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Stop on "

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1, p2}, Lh1/d;->f(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p3, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lm1/i0$f;->c:Lm1/i0$f;

    if-ne v0, p1, :cond_2

    iget-object p1, p0, Lm1/i0;->A:Ljava/lang/Long;

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lm1/i0;->a0()V

    return-void

    :cond_2
    const/4 p1, 0x1

    iput-boolean p1, p0, Lm1/i0;->z:Z

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    new-instance p2, Lm1/v;

    invoke-direct {p2, p0}, Lm1/v;-><init>(Lm1/i0;)V

    const-wide/16 p3, 0x3e8

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, p2, p3, p4, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lm1/i0;->B:Ljava/util/concurrent/Future;

    return-void

    :cond_3
    new-instance p0, Ljava/lang/AssertionError;

    const-string p1, "The start time should be before the stop time."

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_4
    new-instance p0, Ljava/lang/AssertionError;

    const-string p1, "There should be a \"start\" before \"stop\""

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :pswitch_3
    return-void

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
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic t(Lm1/i0;J)V
    .locals 7

    iget-object v0, p0, Lm1/i0;->w:Lm1/i0$f;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const-wide v1, 0x7fffffffffffffffL

    const/4 v3, 0x0

    const/4 v4, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unknown state: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lm1/i0;->w:Lm1/i0$f;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Encoder is released"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_1
    sget-object p1, Lm1/i0$f;->e:Lm1/i0$f;

    invoke-virtual {p0, p1}, Lm1/i0;->Z(Lm1/i0$f;)V

    return-void

    :pswitch_2
    iput-object v3, p0, Lm1/i0;->A:Ljava/lang/Long;

    iget-object v0, p0, Lm1/i0;->p:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->removeLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Range;

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v1, v5, v1

    if-nez v1, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    const-string v2, "There should be a \"pause\" before \"resume\""

    invoke-static {v1, v2}, Lx2/g;->j(ZLjava/lang/String;)V

    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v5, p0, Lm1/i0;->p:Ljava/util/Deque;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-static {v0, v6}, Landroid/util/Range;->create(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/Deque;->addLast(Ljava/lang/Object;)V

    iget-object v0, p0, Lm1/i0;->a:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Resume on "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1, p2}, Lh1/d;->f(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\nPaused duration = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sub-long/2addr p1, v1

    invoke-static {p1, p2}, Lh1/d;->f(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean p1, p0, Lm1/i0;->c:Z

    if-nez p1, :cond_1

    const-class p1, Landroidx/camera/video/internal/compat/quirk/AudioEncoderIgnoresInputTimestampQuirk;

    invoke-static {p1}, Lk1/c;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    iget-boolean p1, p0, Lm1/i0;->c:Z

    if-eqz p1, :cond_2

    const-class p1, Landroidx/camera/video/internal/compat/quirk/VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;

    invoke-static {p1}, Lk1/c;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v3}, Lm1/i0;->Y(Z)V

    iget-object p1, p0, Lm1/i0;->g:Lm1/l$b;

    instance-of p2, p1, Lm1/i0$e;

    if-eqz p2, :cond_3

    check-cast p1, Lm1/i0$e;

    invoke-virtual {p1, v4}, Lm1/i0$e;->q(Z)V

    :cond_3
    :goto_1
    iget-boolean p1, p0, Lm1/i0;->c:Z

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lm1/i0;->W()V

    :cond_4
    sget-object p1, Lm1/i0$f;->b:Lm1/i0$f;

    invoke-virtual {p0, p1}, Lm1/i0;->Z(Lm1/i0$f;)V

    :pswitch_3
    return-void

    :pswitch_4
    iput-object v3, p0, Lm1/i0;->A:Ljava/lang/Long;

    iget-object v0, p0, Lm1/i0;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Start on "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1, p2}, Lh1/d;->f(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-boolean v0, p0, Lm1/i0;->D:Z

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lm1/i0;->X()V

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_5
    :goto_2
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Range;->create(Ljava/lang/Comparable;Ljava/lang/Comparable;)Landroid/util/Range;

    move-result-object p1

    iput-object p1, p0, Lm1/i0;->x:Landroid/util/Range;

    iget-object p1, p0, Lm1/i0;->a:Ljava/lang/String;

    const-string p2, "mMediaCodec.start()"

    invoke-static {p1, p2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lm1/i0;->f:Landroid/media/MediaCodec;

    invoke-virtual {p1}, Landroid/media/MediaCodec;->start()V
    :try_end_0
    .catch Landroid/media/MediaCodec$CodecException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object p1, p0, Lm1/i0;->g:Lm1/l$b;

    instance-of p2, p1, Lm1/i0$e;

    if-eqz p2, :cond_6

    check-cast p1, Lm1/i0$e;

    invoke-virtual {p1, v4}, Lm1/i0$e;->q(Z)V

    :cond_6
    sget-object p1, Lm1/i0$f;->b:Lm1/i0$f;

    invoke-virtual {p0, p1}, Lm1/i0;->Z(Lm1/i0$f;)V

    return-void

    :goto_3
    invoke-virtual {p0, p1}, Lm1/i0;->L(Landroid/media/MediaCodec$CodecException;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic u(Lm1/i0;Ly1/c$a;)V
    .locals 0

    iget-object p0, p0, Lm1/i0;->m:Ljava/util/Queue;

    invoke-interface {p0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic v(Ljava/util/concurrent/atomic/AtomicReference;Ly1/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    const-string p0, "mReleasedFuture"

    return-object p0
.end method

.method public static synthetic w(Lm1/i0;J)J
    .locals 0

    invoke-virtual {p0, p1, p2}, Lm1/i0;->e0(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic x(Lm1/i0;Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Lm1/i0;->w:Lm1/i0$f;

    sget-object v1, Lm1/i0$f;->h:Lm1/i0$f;

    if-eq v0, v1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lm1/i0;->a:Ljava/lang/String;

    const-string v0, "encoded data and input buffers are returned"

    invoke-static {p1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lm1/i0;->g:Lm1/l$b;

    instance-of p1, p1, Lm1/i0$h;

    const-string v0, "mMediaCodec.stop()"

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lm1/i0;->E:Z

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lm1/i0;->O()Z

    move-result p1

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lm1/i0;->t:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lm1/i0;->a:Ljava/lang/String;

    invoke-static {p1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lm1/i0;->f:Landroid/media/MediaCodec;

    invoke-virtual {p1}, Landroid/media/MediaCodec;->stop()V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lm1/i0;->a:Ljava/lang/String;

    const-string v0, "mMediaCodec.flush()"

    invoke-static {p1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lm1/i0;->f:Landroid/media/MediaCodec;

    invoke-virtual {p1}, Landroid/media/MediaCodec;->flush()V

    :goto_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lm1/i0;->D:Z

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lm1/i0;->a:Ljava/lang/String;

    invoke-static {p1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lm1/i0;->f:Landroid/media/MediaCodec;

    invoke-virtual {p1}, Landroid/media/MediaCodec;->stop()V

    :cond_3
    :goto_1
    if-eqz p2, :cond_4

    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    :cond_4
    invoke-virtual {p0}, Lm1/i0;->M()V

    return-void
.end method

.method public static synthetic y(Lm1/i0;)V
    .locals 3

    iget-object v0, p0, Lm1/i0;->w:Lm1/i0$f;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lm1/i0;->w:Lm1/i0$f;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    return-void

    :pswitch_1
    sget-object v0, Lm1/i0$f;->g:Lm1/i0$f;

    invoke-virtual {p0, v0}, Lm1/i0;->Z(Lm1/i0$f;)V

    return-void

    :pswitch_2
    invoke-virtual {p0}, Lm1/i0;->V()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic z(Ljava/util/concurrent/atomic/AtomicReference;Ly1/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    const-string p0, "acquireInputBuffer"

    return-object p0
.end method


# virtual methods
.method public F()Lne/x;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Lm1/h1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm1/i0;->w:Lm1/i0$f;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lm1/i0;->w:Lm1/i0$f;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Encoder is released."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object v0

    return-object v0

    :pswitch_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Encoder is in error state."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object v0

    return-object v0

    :pswitch_2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    new-instance v1, Lm1/a0;

    invoke-direct {v1, v0}, Lm1/a0;-><init>(Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-static {v1}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object v1

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/c$a;

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/c$a;

    iget-object v2, p0, Lm1/i0;->m:Ljava/util/Queue;

    invoke-interface {v2, v0}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    new-instance v2, Lm1/b0;

    invoke-direct {v2, p0, v0}, Lm1/b0;-><init>(Lm1/i0;Ly1/c$a;)V

    iget-object v3, p0, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v2, v3}, Ly1/c$a;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p0}, Lm1/i0;->T()V

    return-object v1

    :pswitch_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Encoder is not started yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final G()V
    .locals 5

    const-class v0, Landroidx/camera/video/internal/compat/quirk/SignalEosOutputBufferNotComeQuirk;

    invoke-static {v0}, Lk1/c;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lm1/i0;->C:Lm1/i0$g;

    iget-object v1, p0, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lm1/i0;->G:Ljava/util/concurrent/Future;

    if-eqz v2, :cond_0

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_0
    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    new-instance v3, Lm1/z;

    invoke-direct {v3, v1, v0}, Lm1/z;-><init>(Ljava/util/concurrent/Executor;Lm1/i0$g;)V

    const-wide/16 v0, 0x3e8

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v2, v3, v0, v1, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lm1/i0;->G:Ljava/util/concurrent/Future;

    :cond_1
    return-void
.end method

.method public final H(Lm1/r1;Landroid/media/MediaFormat;)V
    .locals 3

    iget-boolean v0, p0, Lm1/i0;->c:Z

    invoke-static {v0}, Lx2/g;->i(Z)V

    const-string v0, "bitrate"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1}, Lm1/r1;->g()Landroid/util/Range;

    move-result-object p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/util/Range;->clamp(Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eq v1, p1, :cond_0

    invoke-virtual {p2, v0, p1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget-object p2, p0, Lm1/i0;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updated bitrate from "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public I()J
    .locals 2

    iget-object v0, p0, Lm1/i0;->r:Lm1/o1;

    invoke-interface {v0}, Lm1/o1;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public J(Landroid/media/MediaCodec$BufferInfo;)J
    .locals 4

    iget-wide v0, p0, Lm1/i0;->y:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    iget-wide v2, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    sub-long/2addr v2, v0

    return-wide v2

    :cond_0
    iget-wide v0, p1, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    return-wide v0
.end method

.method public K(ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lm1/i0;->w:Lm1/i0$f;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v0, p0, Lm1/i0;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Get more than one error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "("

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, p3}, Lg0/r1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :pswitch_1
    sget-object v0, Lm1/i0$f;->h:Lm1/i0$f;

    invoke-virtual {p0, v0}, Lm1/i0;->Z(Lm1/i0$f;)V

    new-instance v0, Lm1/r;

    invoke-direct {v0, p0, p1, p2, p3}, Lm1/r;-><init>(Lm1/i0;ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Lm1/i0;->d0(Ljava/lang/Runnable;)V

    return-void

    :pswitch_2
    invoke-virtual {p0, p1, p2, p3}, Lm1/i0;->U(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lm1/i0;->X()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public L(Landroid/media/MediaCodec$CodecException;)V
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lm1/i0;->K(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public M()V
    .locals 2

    iget-object v0, p0, Lm1/i0;->w:Lm1/i0$f;

    sget-object v1, Lm1/i0$f;->g:Lm1/i0$f;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lm1/i0;->V()V

    return-void

    :cond_0
    iget-boolean v1, p0, Lm1/i0;->D:Z

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lm1/i0;->X()V

    :cond_1
    sget-object v1, Lm1/i0$f;->a:Lm1/i0$f;

    invoke-virtual {p0, v1}, Lm1/i0;->Z(Lm1/i0$f;)V

    sget-object v1, Lm1/i0$f;->e:Lm1/i0$f;

    if-eq v0, v1, :cond_2

    sget-object v1, Lm1/i0$f;->f:Lm1/i0$f;

    if-ne v0, v1, :cond_3

    :cond_2
    invoke-virtual {p0}, Lm1/i0;->start()V

    sget-object v1, Lm1/i0$f;->f:Lm1/i0$f;

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, Lm1/i0;->pause()V

    :cond_3
    return-void
.end method

.method public final O()Z
    .locals 1

    const-class v0, Landroidx/camera/video/internal/compat/quirk/StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;

    invoke-static {v0}, Lk1/c;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public P(J)Z
    .locals 5

    iget-object v0, p0, Lm1/i0;->p:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Range;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-virtual {v1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long v1, p1, v3

    if-gez v1, :cond_0

    :cond_2
    return v2
.end method

.method public final S()Z
    .locals 1

    iget-object v0, p0, Lm1/i0;->s:Landroid/util/Rational;

    invoke-static {v0}, Lm1/i0;->R(Landroid/util/Rational;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public T()V
    .locals 4

    :goto_0
    iget-object v0, p0, Lm1/i0;->m:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lm1/i0;->l:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lm1/i0;->m:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/c$a;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lm1/i0;->l:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :try_start_0
    new-instance v2, Lm1/i0$b;

    iget-object v3, p0, Lm1/i0;->f:Landroid/media/MediaCodec;

    invoke-direct {v2, p0, v3, v1}, Lm1/i0$b;-><init>(Lm1/i0;Landroid/media/MediaCodec;I)V
    :try_end_0
    .catch Landroid/media/MediaCodec$CodecException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0, v2}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm1/i0;->n:Ljava/util/Set;

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Lm1/j1;->d()Lne/x;

    move-result-object v0

    new-instance v1, Lm1/w;

    invoke-direct {v1, p0, v2}, Lm1/w;-><init>(Lm1/i0;Lm1/j1;)V

    iget-object v2, p0, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1, v2}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lm1/j1;->cancel()Z

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Lm1/i0;->L(Landroid/media/MediaCodec$CodecException;)V

    :cond_1
    return-void
.end method

.method public U(ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lm1/i0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lm1/i0;->u:Lm1/m;

    iget-object v2, p0, Lm1/i0;->v:Ljava/util/concurrent/Executor;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v0, Lm1/t;

    invoke-direct {v0, v1, p1, p2, p3}, Lm1/t;-><init>(Lm1/m;ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {v2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lm1/i0;->a:Ljava/lang/String;

    const-string p3, "Unable to post to the supplied executor."

    invoke-static {p2, p3, p1}, Lg0/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final V()V
    .locals 2

    iget-object v0, p0, Lm1/i0;->a:Ljava/lang/String;

    const-string v1, "releaseInternal"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p0, Lm1/i0;->D:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lm1/i0;->t:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lm1/i0;->a:Ljava/lang/String;

    const-string v1, "mMediaCodec.stop()"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lm1/i0;->f:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lm1/i0;->D:Z

    :cond_1
    iget-object v0, p0, Lm1/i0;->a:Ljava/lang/String;

    const-string v1, "mMediaCodec.release()"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lm1/i0;->f:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    iget-object v0, p0, Lm1/i0;->g:Lm1/l$b;

    instance-of v1, v0, Lm1/i0$h;

    if-eqz v1, :cond_2

    check-cast v0, Lm1/i0$h;

    invoke-virtual {v0}, Lm1/i0$h;->d()V

    :cond_2
    sget-object v0, Lm1/i0$f;->i:Lm1/i0$f;

    invoke-virtual {p0, v0}, Lm1/i0;->Z(Lm1/i0$f;)V

    iget-object v0, p0, Lm1/i0;->k:Ly1/c$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public W()V
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "request-sync"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object v1, p0, Lm1/i0;->a:Ljava/lang/String;

    const-string v2, "mMediaCodec.setParameters - requestKeyFrameToMediaCodec"

    invoke-static {v1, v2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lm1/i0;->f:Landroid/media/MediaCodec;

    invoke-virtual {v1, v0}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V

    return-void
.end method

.method public final X()V
    .locals 4

    sget-object v0, Lm1/i0;->H:Landroid/util/Range;

    iput-object v0, p0, Lm1/i0;->x:Landroid/util/Range;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lm1/i0;->y:J

    iget-object v0, p0, Lm1/i0;->p:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    iget-object v0, p0, Lm1/i0;->l:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    iget-object v0, p0, Lm1/i0;->m:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly1/c$a;

    invoke-virtual {v1}, Ly1/c$a;->d()Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lm1/i0;->m:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    iget-object v0, p0, Lm1/i0;->a:Ljava/lang/String;

    const-string v1, "mMediaCodec.reset()"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lm1/i0;->f:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->reset()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lm1/i0;->D:Z

    iput-boolean v0, p0, Lm1/i0;->E:Z

    iput-boolean v0, p0, Lm1/i0;->F:Z

    iput-boolean v0, p0, Lm1/i0;->z:Z

    iget-object v1, p0, Lm1/i0;->B:Ljava/util/concurrent/Future;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    iput-object v3, p0, Lm1/i0;->B:Ljava/util/concurrent/Future;

    :cond_1
    iget-object v1, p0, Lm1/i0;->G:Ljava/util/concurrent/Future;

    if-eqz v1, :cond_2

    invoke-interface {v1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    iput-object v3, p0, Lm1/i0;->G:Ljava/util/concurrent/Future;

    :cond_2
    iget-object v0, p0, Lm1/i0;->C:Lm1/i0$g;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lm1/i0$g;->p()V

    :cond_3
    new-instance v0, Lm1/i0$g;

    invoke-direct {v0, p0}, Lm1/i0$g;-><init>(Lm1/i0;)V

    iput-object v0, p0, Lm1/i0;->C:Lm1/i0$g;

    iget-object v0, p0, Lm1/i0;->a:Ljava/lang/String;

    const-string v1, "mMediaCodec.setCallback()"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lm1/i0;->f:Landroid/media/MediaCodec;

    iget-object v1, p0, Lm1/i0;->C:Lm1/i0$g;

    invoke-virtual {v0, v1}, Landroid/media/MediaCodec;->setCallback(Landroid/media/MediaCodec$Callback;)V

    iget-object v0, p0, Lm1/i0;->a:Ljava/lang/String;

    const-string v1, "mMediaCodec.configure()"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lm1/i0;->f:Landroid/media/MediaCodec;

    iget-object v1, p0, Lm1/i0;->e:Landroid/media/MediaFormat;

    invoke-virtual {v0, v1, v3, v3, v2}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    iget-object v0, p0, Lm1/i0;->g:Lm1/l$b;

    instance-of v1, v0, Lm1/i0$h;

    if-eqz v1, :cond_4

    check-cast v0, Lm1/i0$h;

    invoke-virtual {v0}, Lm1/i0$h;->e()V

    :cond_4
    return-void
.end method

.method public Y(Z)V
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "drop-input-frames"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object v1, p0, Lm1/i0;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mMediaCodec.setParameters - setMediaCodecPaused: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lm1/i0;->f:Landroid/media/MediaCodec;

    invoke-virtual {p1, v0}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V

    return-void
.end method

.method public final Z(Lm1/i0$f;)V
    .locals 3

    iget-object v0, p0, Lm1/i0;->w:Lm1/i0$f;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lm1/i0;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Transitioning encoder internal state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lm1/i0;->w:Lm1/i0$f;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " --> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lm1/i0;->w:Lm1/i0$f;

    return-void
.end method

.method public a()V
    .locals 2

    iget-object v0, p0, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    new-instance v1, Lm1/g0;

    invoke-direct {v1, p0}, Lm1/g0;-><init>(Lm1/i0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a0()V
    .locals 3

    iget-object v0, p0, Lm1/i0;->a:Ljava/lang/String;

    const-string v1, "signalCodecStop"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lm1/i0;->g:Lm1/l$b;

    instance-of v1, v0, Lm1/i0$e;

    if-eqz v1, :cond_1

    check-cast v0, Lm1/i0$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lm1/i0$e;->q(Z)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lm1/i0;->n:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm1/h1;

    invoke-interface {v2}, Lm1/h1;->d()Lne/x;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lr0/n;->w(Ljava/util/Collection;)Lne/x;

    move-result-object v0

    new-instance v1, Lm1/y;

    invoke-direct {v1, p0}, Lm1/y;-><init>(Lm1/i0;)V

    iget-object v2, p0, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1, v2}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_1
    instance-of v0, v0, Lm1/i0$h;

    if-eqz v0, :cond_2

    :try_start_0
    invoke-virtual {p0}, Lm1/i0;->G()V

    iget-object v0, p0, Lm1/i0;->a:Ljava/lang/String;

    const-string v1, "mMediaCodec.signalEndOfInputStream()"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lm1/i0;->f:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->signalEndOfInputStream()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lm1/i0;->F:Z
    :try_end_0
    .catch Landroid/media/MediaCodec$CodecException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Lm1/i0;->L(Landroid/media/MediaCodec$CodecException;)V

    :cond_2
    return-void
.end method

.method public b()Lm1/l$b;
    .locals 1

    iget-object v0, p0, Lm1/i0;->g:Lm1/l$b;

    return-object v0
.end method

.method public final b0()V
    .locals 3

    iget-object v0, p0, Lm1/i0;->a:Ljava/lang/String;

    const-string v1, "signalEndOfInputStream"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm1/i0;->F()Lne/x;

    move-result-object v0

    new-instance v1, Lm1/i0$a;

    invoke-direct {v1, p0}, Lm1/i0$a;-><init>(Lm1/i0;)V

    iget-object v2, p0, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public c(Lm1/m;Ljava/util/concurrent/Executor;)V
    .locals 1

    iget-object v0, p0, Lm1/i0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lm1/i0;->u:Lm1/m;

    iput-object p2, p0, Lm1/i0;->v:Ljava/util/concurrent/Executor;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public c0()V
    .locals 2

    iget-object v0, p0, Lm1/i0;->a:Ljava/lang/String;

    const-string v1, "signalSourceStopped"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    new-instance v1, Lm1/h0;

    invoke-direct {v1, p0}, Lm1/h0;-><init>(Lm1/i0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public d(J)V
    .locals 7

    invoke-virtual {p0}, Lm1/i0;->I()J

    move-result-wide v4

    iget-object v6, p0, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    new-instance v0, Lm1/s;

    move-object v1, p0

    move-wide v2, p1

    invoke-direct/range {v0 .. v5}, Lm1/s;-><init>(Lm1/i0;JJ)V

    invoke-interface {v6, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public d0(Ljava/lang/Runnable;)V
    .locals 4

    iget-object v0, p0, Lm1/i0;->a:Ljava/lang/String;

    const-string v1, "stopMediaCodec"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lm1/i0;->o:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm1/k;

    invoke-virtual {v2}, Lm1/k;->b()Lne/x;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lm1/i0;->n:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm1/h1;

    invoke-interface {v2}, Lm1/h1;->d()Lne/x;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lm1/i0;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Waiting for resources to return. encoded data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lm1/i0;->o:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", input buffers = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lm1/i0;->n:Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    invoke-static {v0}, Lr0/n;->w(Ljava/util/Collection;)Lne/x;

    move-result-object v1

    new-instance v2, Lm1/u;

    invoke-direct {v2, p0, v0, p1}, Lm1/u;-><init>(Lm1/i0;Ljava/util/List;Ljava/lang/Runnable;)V

    iget-object p1, p0, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v2, p1}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public e()Lm1/f1;
    .locals 1

    iget-object v0, p0, Lm1/i0;->h:Lm1/f1;

    return-object v0
.end method

.method public final e0(J)J
    .locals 2

    invoke-virtual {p0}, Lm1/i0;->S()Z

    move-result v0

    if-eqz v0, :cond_0

    long-to-double p1, p1

    iget-object v0, p0, Lm1/i0;->s:Landroid/util/Rational;

    invoke-virtual {v0}, Landroid/util/Rational;->doubleValue()D

    move-result-wide v0

    mul-double/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    move-result-wide p1

    :cond_0
    return-wide p1
.end method

.method public f()Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm1/i0;->j:Lne/x;

    return-object v0
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    new-instance v1, Lm1/p;

    invoke-direct {v1, p0}, Lm1/p;-><init>(Lm1/i0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public g0(J)V
    .locals 7

    :goto_0
    iget-object v0, p0, Lm1/i0;->p:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lm1/i0;->p:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Range;

    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    cmp-long v1, p1, v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lm1/i0;->p:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->removeFirst()Ljava/lang/Object;

    iget-wide v1, p0, Lm1/i0;->y:J

    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    sub-long/2addr v3, v5

    add-long/2addr v1, v3

    iput-wide v1, p0, Lm1/i0;->y:J

    iget-object v0, p0, Lm1/i0;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Total paused duration = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lm1/i0;->y:J

    invoke-static {v2, v3}, Lh1/d;->f(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public h()I
    .locals 2

    iget-object v0, p0, Lm1/i0;->e:Landroid/media/MediaFormat;

    const-string v1, "bitrate"

    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm1/i0;->e:Landroid/media/MediaFormat;

    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public pause()V
    .locals 4

    invoke-virtual {p0}, Lm1/i0;->I()J

    move-result-wide v0

    iget-object v2, p0, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    new-instance v3, Lm1/f0;

    invoke-direct {v3, p0, v0, v1}, Lm1/f0;-><init>(Lm1/i0;J)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public start()V
    .locals 4

    invoke-virtual {p0}, Lm1/i0;->I()J

    move-result-wide v0

    iget-object v2, p0, Lm1/i0;->i:Ljava/util/concurrent/Executor;

    new-instance v3, Lm1/q;

    invoke-direct {v3, p0, v0, v1}, Lm1/q;-><init>(Lm1/i0;J)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
