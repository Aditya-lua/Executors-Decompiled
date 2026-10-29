.class public Lz/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/l0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/y$a;,
        Lz/y$b;,
        Lz/y$c;
    }
.end annotation


# instance fields
.field public A:I

.field public B:J

.field public final C:Lz/y$a;

.field public final b:Lz/y$b;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:Ljava/lang/Object;

.field public final e:La0/c0;

.field public final f:Ln0/l0$d;

.field public final g:Ln0/o3$b;

.field public final h:Lz/h4;

.field public final i:Lz/g6;

.field public final j:Lz/x5;

.field public final k:Lz/q4;

.field public final l:Lz/s3;

.field public m:Lz/i6;

.field public final n:Lf0/g;

.field public final o:Lz/g1;

.field public final p:Lz/b6;

.field public q:I

.field public r:Lg0/f1$j;

.field public volatile s:I

.field public volatile t:I

.field public volatile u:Z

.field public volatile v:I

.field public final w:Ld0/a;

.field public x:Z

.field public final y:Ljava/util/concurrent/atomic/AtomicLong;

.field public volatile z:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(La0/c0;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;Ln0/l0$d;Ln0/k3;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lz/y;->d:Ljava/lang/Object;

    new-instance v0, Ln0/o3$b;

    invoke-direct {v0}, Ln0/o3$b;-><init>()V

    iput-object v0, p0, Lz/y;->g:Ln0/o3$b;

    const/4 v1, 0x0

    iput v1, p0, Lz/y;->q:I

    iput v1, p0, Lz/y;->s:I

    iput-boolean v1, p0, Lz/y;->u:Z

    const/4 v1, 0x2

    iput v1, p0, Lz/y;->v:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Lz/y;->x:Z

    new-instance v2, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v3, 0x0

    invoke-direct {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v2, p0, Lz/y;->y:Ljava/util/concurrent/atomic/AtomicLong;

    const/4 v2, 0x0

    invoke-static {v2}, Lr0/n;->p(Ljava/lang/Object;)Lne/x;

    move-result-object v2

    iput-object v2, p0, Lz/y;->z:Lne/x;

    iput v1, p0, Lz/y;->A:I

    iput-wide v3, p0, Lz/y;->B:J

    new-instance v1, Lz/y$a;

    invoke-direct {v1}, Lz/y$a;-><init>()V

    iput-object v1, p0, Lz/y;->C:Lz/y$a;

    iput-object p1, p0, Lz/y;->e:La0/c0;

    iput-object p4, p0, Lz/y;->f:Ln0/l0$d;

    iput-object p3, p0, Lz/y;->c:Ljava/util/concurrent/Executor;

    new-instance p4, Lz/b6;

    invoke-direct {p4, p3}, Lz/b6;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object p4, p0, Lz/y;->p:Lz/b6;

    new-instance p4, Lz/y$b;

    invoke-direct {p4, p3}, Lz/y$b;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object p4, p0, Lz/y;->b:Lz/y$b;

    iget v2, p0, Lz/y;->A:I

    invoke-virtual {v0, v2}, Ln0/o3$b;->B(I)Ln0/o3$b;

    invoke-static {p4}, Lz/c3;->e(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Lz/c3;

    move-result-object p4

    invoke-virtual {v0, p4}, Ln0/o3$b;->j(Ln0/u;)Ln0/o3$b;

    invoke-virtual {v0, v1}, Ln0/o3$b;->j(Ln0/u;)Ln0/o3$b;

    new-instance p4, Lz/s3;

    invoke-direct {p4, p0, p1, p3}, Lz/s3;-><init>(Lz/y;La0/c0;Ljava/util/concurrent/Executor;)V

    iput-object p4, p0, Lz/y;->l:Lz/s3;

    new-instance p4, Lz/h4;

    invoke-direct {p4, p0, p2, p3, p5}, Lz/h4;-><init>(Lz/y;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;Ln0/k3;)V

    iput-object p4, p0, Lz/y;->h:Lz/h4;

    new-instance p4, Lz/g6;

    invoke-direct {p4, p0, p1, p3}, Lz/g6;-><init>(Lz/y;La0/c0;Ljava/util/concurrent/Executor;)V

    iput-object p4, p0, Lz/y;->i:Lz/g6;

    new-instance p4, Lz/x5;

    invoke-direct {p4, p0, p1, p3}, Lz/x5;-><init>(Lz/y;La0/c0;Ljava/util/concurrent/Executor;)V

    iput-object p4, p0, Lz/y;->j:Lz/x5;

    invoke-virtual {p1}, La0/c0;->c()I

    move-result p4

    iput p4, p0, Lz/y;->t:I

    new-instance p4, Lz/q4;

    invoke-direct {p4, p0, p1, p3}, Lz/q4;-><init>(Lz/y;La0/c0;Ljava/util/concurrent/Executor;)V

    iput-object p4, p0, Lz/y;->k:Lz/q4;

    new-instance p4, Lz/m6;

    invoke-direct {p4, p1, p3}, Lz/m6;-><init>(La0/c0;Ljava/util/concurrent/Executor;)V

    iput-object p4, p0, Lz/y;->m:Lz/i6;

    new-instance p4, Ld0/a;

    invoke-direct {p4, p5}, Ld0/a;-><init>(Ln0/k3;)V

    iput-object p4, p0, Lz/y;->w:Ld0/a;

    new-instance p4, Lf0/g;

    invoke-direct {p4, p0, p3}, Lf0/g;-><init>(Lz/y;Ljava/util/concurrent/Executor;)V

    iput-object p4, p0, Lz/y;->n:Lf0/g;

    new-instance v0, Lz/g1;

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    move-object v4, p3

    move-object v3, p5

    invoke-direct/range {v0 .. v5}, Lz/g1;-><init>(Lz/y;La0/c0;Ln0/k3;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    iput-object v0, v1, Lz/y;->o:Lz/g1;

    return-void
.end method

.method public static synthetic A(JLy1/c$a;Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 0

    invoke-static {p3, p0, p1}, Lz/y;->e0(Landroid/hardware/camera2/TotalCaptureResult;J)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    invoke-virtual {p2, p0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static R(La0/c0;I)I
    .locals 2

    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p0, v0}, La0/c0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [I

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-static {p1, p0}, Lz/y;->c0(I[I)Z

    move-result v1

    if-eqz v1, :cond_1

    return p1

    :cond_1
    const/4 p1, 0x1

    invoke-static {p1, p0}, Lz/y;->c0(I[I)Z

    move-result p0

    if-eqz p0, :cond_2

    return p1

    :cond_2
    return v0
.end method

.method public static c0(I[I)Z
    .locals 4

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget v3, p1, v2

    if-ne p0, v3, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static e0(Landroid/hardware/camera2/TotalCaptureResult;J)Z
    .locals 4

    invoke-virtual {p0}, Landroid/hardware/camera2/CaptureResult;->getRequest()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Landroid/hardware/camera2/CaptureResult;->getRequest()Landroid/hardware/camera2/CaptureRequest;

    move-result-object p0

    invoke-virtual {p0}, Landroid/hardware/camera2/CaptureRequest;->getTag()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Ln0/z3;

    if-eqz v0, :cond_2

    check-cast p0, Ln0/z3;

    const-string v0, "CameraControlSessionUpdateId"

    invoke-virtual {p0, v0}, Ln0/z3;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    if-nez p0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long p0, v2, p1

    if-ltz p0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    return v1
.end method

.method public static synthetic p(Lz/y;Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v0, p0, Lz/y;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lz/n;

    invoke-direct {v1, p0, p1}, Lz/n;-><init>(Lz/y;Ly1/c$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "Unable to check if repeating request is available. Camera executor shut down."

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    :goto_0
    const-string p0, "isRepeatingRequestAvailable"

    return-object p0
.end method

.method public static synthetic q()V
    .locals 0

    return-void
.end method

.method public static synthetic r()V
    .locals 0

    return-void
.end method

.method public static synthetic s(Lz/y;Ly1/c$a;)V
    .locals 2

    invoke-virtual {p0}, Lz/y;->s0()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lz/y;->t0(J)Lne/x;

    move-result-object p0

    invoke-static {p0, p1}, Lr0/n;->t(Lne/x;Ly1/c$a;)V

    return-void
.end method

.method public static synthetic t(Lz/y;IIILjava/lang/Void;)Lne/x;
    .locals 0

    iget-object p0, p0, Lz/y;->o:Lz/g1;

    invoke-virtual {p0, p1, p2, p3}, Lz/g1;->c(III)Lm0/m;

    move-result-object p0

    invoke-static {p0}, Lr0/n;->p(Ljava/lang/Object;)Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lz/y;Ln0/u;)V
    .locals 0

    iget-object p0, p0, Lz/y;->C:Lz/y$a;

    invoke-virtual {p0, p1}, Lz/y$a;->i(Ln0/u;)V

    return-void
.end method

.method public static synthetic v(Lz/y;JLy1/c$a;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lz/p;

    invoke-direct {v0, p1, p2, p3}, Lz/p;-><init>(JLy1/c$a;)V

    invoke-virtual {p0, v0}, Lz/y;->B(Lz/y$c;)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "waitForSessionUpdateId:"

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lz/y;Ly1/c$a;)V
    .locals 0

    iget-boolean p0, p0, Lz/y;->x:Z

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {p1, p0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic x(Lz/y;Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lz/y;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lz/m;

    invoke-direct {v1, p0, p1}, Lz/m;-><init>(Lz/y;Ly1/c$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p0, "updateSessionConfigAsync"

    return-object p0
.end method

.method public static synthetic y(Lz/y;Ljava/util/concurrent/Executor;Ln0/u;)V
    .locals 0

    iget-object p0, p0, Lz/y;->C:Lz/y$a;

    invoke-virtual {p0, p1, p2}, Lz/y$a;->h(Ljava/util/concurrent/Executor;Ln0/u;)V

    return-void
.end method

.method public static synthetic z(Lz/y;Ljava/util/List;IIILjava/lang/Void;)Lne/x;
    .locals 0

    iget-object p0, p0, Lz/y;->o:Lz/g1;

    invoke-virtual {p0, p1, p2, p3, p4}, Lz/g1;->h(Ljava/util/List;III)Lne/x;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public B(Lz/y$c;)V
    .locals 1

    iget-object v0, p0, Lz/y;->b:Lz/y$b;

    invoke-virtual {v0, p1}, Lz/y$b;->b(Lz/y$c;)V

    return-void
.end method

.method public C(Ljava/util/concurrent/Executor;Ln0/u;)V
    .locals 2

    iget-object v0, p0, Lz/y;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lz/t;

    invoke-direct {v1, p0, p1, p2}, Lz/t;-><init>(Lz/y;Ljava/util/concurrent/Executor;Ln0/u;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public D()V
    .locals 3

    iget-object v0, p0, Lz/y;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lz/y;->q:I

    if-eqz v1, :cond_0

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lz/y;->q:I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Decrementing use count occurs more times than incrementing"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public E(Z)V
    .locals 1

    iget-boolean v0, p0, Lz/y;->u:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lz/y;->f0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lz/y;->i0()V

    const/4 v0, 0x0

    iput v0, p0, Lz/y;->s:I

    iget-object v0, p0, Lz/y;->j:Lz/x5;

    invoke-virtual {v0}, Lz/x5;->f()V

    :cond_1
    iput-boolean p1, p0, Lz/y;->u:Z

    invoke-virtual {p0}, Lz/y;->s0()J

    return-void
.end method

.method public F(I)V
    .locals 1

    iget-boolean v0, p0, Lz/y;->u:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lz/y;->s:I

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lz/y;->i0()V

    :cond_1
    invoke-virtual {p0}, Lz/y;->s0()J

    return-void
.end method

.method public G()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lz/y;->i:Lz/g6;

    invoke-virtual {v0}, Lz/g6;->g()Landroid/graphics/Rect;

    move-result-object v0

    return-object v0
.end method

.method public H()I
    .locals 1

    iget v0, p0, Lz/y;->v:I

    return v0
.end method

.method public I()Lz/h4;
    .locals 1

    iget-object v0, p0, Lz/y;->h:Lz/h4;

    return-object v0
.end method

.method public J()Lz/q4;
    .locals 1

    iget-object v0, p0, Lz/y;->k:Lz/q4;

    return-object v0
.end method

.method public K()I
    .locals 2

    iget-object v0, p0, Lz/y;->e:La0/c0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_MAX_REGIONS_AE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, La0/c0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public L()I
    .locals 2

    iget-object v0, p0, Lz/y;->e:La0/c0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_MAX_REGIONS_AF:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, La0/c0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public M()I
    .locals 2

    iget-object v0, p0, Lz/y;->e:La0/c0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_MAX_REGIONS_AWB:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, La0/c0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public N()Lg0/f1$j;
    .locals 1

    iget-object v0, p0, Lz/y;->r:Lg0/f1$j;

    return-object v0
.end method

.method public O()Ln0/o3;
    .locals 3

    iget-object v0, p0, Lz/y;->g:Ln0/o3$b;

    iget v1, p0, Lz/y;->A:I

    invoke-virtual {v0, v1}, Ln0/o3$b;->B(I)Ln0/o3$b;

    iget-object v0, p0, Lz/y;->g:Ln0/o3$b;

    invoke-virtual {p0}, Lz/y;->P()Ln0/n1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln0/o3$b;->w(Ln0/n1;)Ln0/o3$b;

    iget-object v0, p0, Lz/y;->g:Ln0/o3$b;

    iget-wide v1, p0, Lz/y;->B:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "CameraControlSessionUpdateId"

    invoke-virtual {v0, v2, v1}, Ln0/o3$b;->o(Ljava/lang/String;Ljava/lang/Object;)Ln0/o3$b;

    iget-object v0, p0, Lz/y;->g:Ln0/o3$b;

    invoke-virtual {v0}, Ln0/o3$b;->p()Ln0/o3;

    move-result-object v0

    return-object v0
.end method

.method public P()Ln0/n1;
    .locals 7

    new-instance v0, Ly/a$a;

    invoke-direct {v0}, Ly/a$a;-><init>()V

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v4, Ln0/n1$c;->c:Ln0/n1$c;

    invoke-virtual {v0, v1, v3, v4}, Ly/a$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;Ln0/n1$c;)Ly/a$a;

    iget-object v1, p0, Lz/y;->h:Lz/h4;

    invoke-virtual {v1, v0}, Lz/h4;->n(Ly/a$a;)V

    iget-object v1, p0, Lz/y;->i:Lz/g6;

    invoke-virtual {v1, v0}, Lz/g6;->e(Ly/a$a;)V

    iget-object v1, p0, Lz/y;->h:Lz/h4;

    invoke-virtual {v1}, Lz/h4;->G()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x5

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    iget-boolean v3, p0, Lz/y;->u:Z

    if-eqz v3, :cond_1

    const/4 v1, 0x6

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lz/y;->f0()Z

    move-result v3

    const/4 v5, 0x2

    if-eqz v3, :cond_3

    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0, v3, v6, v4}, Ly/a$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;Ln0/n1$c;)Ly/a$a;

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x23

    if-lt v3, v6, :cond_7

    iget v3, p0, Lz/y;->s:I

    if-ne v3, v2, :cond_2

    invoke-static {}, Lz/i;->a()Landroid/hardware/camera2/CaptureRequest$Key;

    move-result-object v3

    iget v5, p0, Lz/y;->t:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v3, v5, v4}, Ly/a$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;Ln0/n1$c;)Ly/a$a;

    goto :goto_1

    :cond_2
    iget v3, p0, Lz/y;->s:I

    if-ne v3, v5, :cond_7

    invoke-static {}, Lz/i;->a()Landroid/hardware/camera2/CaptureRequest$Key;

    move-result-object v3

    iget-object v5, p0, Lz/y;->e:La0/c0;

    invoke-virtual {v5}, La0/c0;->c()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v3, v5, v4}, Ly/a$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;Ln0/n1$c;)Ly/a$a;

    goto :goto_1

    :cond_3
    iget v3, p0, Lz/y;->v:I

    if-eqz v3, :cond_6

    if-eq v3, v2, :cond_5

    if-eq v3, v5, :cond_4

    goto :goto_1

    :cond_4
    move v1, v2

    goto :goto_1

    :cond_5
    const/4 v1, 0x3

    goto :goto_1

    :cond_6
    iget-object v1, p0, Lz/y;->w:Ld0/a;

    invoke-virtual {v1, v5}, Ld0/a;->a(I)I

    move-result v1

    :cond_7
    :goto_1
    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p0, v1}, Lz/y;->Q(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v3, v1, v4}, Ly/a$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;Ln0/n1$c;)Ly/a$a;

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AWB_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p0, v2}, Lz/y;->T(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2, v4}, Ly/a$a;->g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;Ln0/n1$c;)Ly/a$a;

    iget-object v1, p0, Lz/y;->l:Lz/s3;

    invoke-virtual {v1, v0}, Lz/s3;->c(Ly/a$a;)V

    iget-object v1, p0, Lz/y;->n:Lf0/g;

    invoke-virtual {v1, v0}, Lf0/g;->i(Ly/a$a;)V

    invoke-virtual {v0}, Ly/a$a;->b()Ly/a;

    move-result-object v0

    return-object v0
.end method

.method public Q(I)I
    .locals 1

    iget-object v0, p0, Lz/y;->e:La0/c0;

    invoke-static {v0, p1}, Lz/y;->R(La0/c0;I)I

    move-result p1

    return p1
.end method

.method public S(I)I
    .locals 3

    iget-object v0, p0, Lz/y;->e:La0/c0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AF_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, La0/c0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {p1, v0}, Lz/y;->c0(I[I)Z

    move-result v2

    if-eqz v2, :cond_1

    return p1

    :cond_1
    const/4 p1, 0x4

    invoke-static {p1, v0}, Lz/y;->c0(I[I)Z

    move-result v2

    if-eqz v2, :cond_2

    return p1

    :cond_2
    const/4 p1, 0x1

    invoke-static {p1, v0}, Lz/y;->c0(I[I)Z

    move-result v0

    if-eqz v0, :cond_3

    return p1

    :cond_3
    return v1
.end method

.method public final T(I)I
    .locals 3

    iget-object v0, p0, Lz/y;->e:La0/c0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AWB_AVAILABLE_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, La0/c0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {p1, v0}, Lz/y;->c0(I[I)Z

    move-result v2

    if-eqz v2, :cond_1

    return p1

    :cond_1
    const/4 p1, 0x1

    invoke-static {p1, v0}, Lz/y;->c0(I[I)Z

    move-result v0

    if-eqz v0, :cond_2

    return p1

    :cond_2
    return v1
.end method

.method public U()Lz/x5;
    .locals 1

    iget-object v0, p0, Lz/y;->j:Lz/x5;

    return-object v0
.end method

.method public V()I
    .locals 2

    iget-object v0, p0, Lz/y;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lz/y;->q:I

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public W()Lz/g6;
    .locals 1

    iget-object v0, p0, Lz/y;->i:Lz/g6;

    return-object v0
.end method

.method public X()Lz/i6;
    .locals 1

    iget-object v0, p0, Lz/y;->m:Lz/i6;

    return-object v0
.end method

.method public Y()V
    .locals 2

    iget-object v0, p0, Lz/y;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lz/y;->q:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lz/y;->q:I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final Z()Z
    .locals 1

    invoke-virtual {p0}, Lz/y;->V()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public a(Ln0/o3$b;)V
    .locals 1

    iget-object v0, p0, Lz/y;->m:Lz/i6;

    invoke-interface {v0, p1}, Lz/i6;->a(Ln0/o3$b;)V

    return-void
.end method

.method public a0()Z
    .locals 3

    iget-object v0, p0, Lz/y;->p:Lz/b6;

    invoke-virtual {v0}, Lz/b6;->e()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isInVideoUsage: mVideoUsageControl value = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Camera2CameraControlImp"

    invoke-static {v2, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lz/y;->m:Lz/i6;

    invoke-interface {v0}, Lz/i6;->b()V

    return-void
.end method

.method public b0()Z
    .locals 1

    iget-boolean v0, p0, Lz/y;->u:Z

    return v0
.end method

.method public c(Z)Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lz/y;->Z()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Lg0/m$a;

    const-string v0, "Camera is not active."

    invoke-direct {p1, v0}, Lg0/m$a;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lz/y;->j:Lz/x5;

    invoke-virtual {v0, p1}, Lz/x5;->d(Z)Lne/x;

    move-result-object p1

    invoke-static {p1}, Lr0/n;->s(Lne/x;)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lz/y;->p:Lz/b6;

    invoke-virtual {v0}, Lz/b6;->c()V

    return-void
.end method

.method public final d0()Z
    .locals 3

    :try_start_0
    new-instance v0, Lz/s;

    invoke-direct {v0, p0}, Lz/s;-><init>(Lz/y;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unable to check if repeating request is available."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public e(F)Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lz/y;->Z()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Lg0/m$a;

    const-string v0, "Camera is not active."

    invoke-direct {p1, v0}, Lg0/m$a;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lz/y;->i:Lz/g6;

    invoke-virtual {v0, p1}, Lz/g6;->m(F)Lne/x;

    move-result-object p1

    invoke-static {p1}, Lr0/n;->s(Lne/x;)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/util/List;II)Lne/x;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln0/l1;",
            ">;II)",
            "Lne/x<",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lz/y;->Z()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "Camera2CameraControlImp"

    const-string p2, "Camera is not active."

    invoke-static {p1, p2}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lg0/m$a;

    invoke-direct {p1, p2}, Lg0/m$a;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lz/y;->H()I

    move-result v4

    iget-object v0, p0, Lz/y;->z:Lne/x;

    invoke-static {v0}, Lr0/n;->s(Lne/x;)Lne/x;

    move-result-object v0

    invoke-static {v0}, Lr0/d;->c(Lne/x;)Lr0/d;

    move-result-object v6

    new-instance v0, Lz/q;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lz/q;-><init>(Lz/y;Ljava/util/List;III)V

    iget-object p1, v1, Lz/y;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {v6, v0, p1}, Lr0/d;->g(Lr0/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object p1

    return-object p1
.end method

.method public f0()Z
    .locals 1

    iget v0, p0, Lz/y;->s:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public g(F)Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lz/y;->Z()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Lg0/m$a;

    const-string v0, "Camera is not active."

    invoke-direct {p1, v0}, Lg0/m$a;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lz/y;->i:Lz/g6;

    invoke-virtual {v0, p1}, Lz/g6;->n(F)Lne/x;

    move-result-object p1

    invoke-static {p1}, Lr0/n;->s(Lne/x;)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public g0(Lz/y$c;)V
    .locals 1

    iget-object v0, p0, Lz/y;->b:Lz/y$b;

    invoke-virtual {v0, p1}, Lz/y$b;->c(Lz/y$c;)V

    return-void
.end method

.method public h(Lg0/f1$j;)V
    .locals 0

    iput-object p1, p0, Lz/y;->r:Lg0/f1$j;

    return-void
.end method

.method public h0(Ln0/u;)V
    .locals 2

    iget-object v0, p0, Lz/y;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lz/j;

    invoke-direct {v1, p0, p1}, Lz/j;-><init>(Lz/y;Ln0/u;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public i(I)V
    .locals 2

    invoke-virtual {p0}, Lz/y;->Z()Z

    move-result v0

    const-string v1, "Camera2CameraControlImp"

    if-nez v0, :cond_0

    const-string p1, "Camera is not active."

    invoke-static {v1, p1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iput p1, p0, Lz/y;->v:I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "setFlashMode: mFlashMode = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lz/y;->v:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lz/y;->m:Lz/i6;

    iget v0, p0, Lz/y;->v:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    iget v0, p0, Lz/y;->v:I

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    invoke-interface {p1, v1}, Lz/i6;->d(Z)V

    invoke-virtual {p0}, Lz/y;->r0()Lne/x;

    move-result-object p1

    iput-object p1, p0, Lz/y;->z:Lne/x;

    return-void
.end method

.method public final i0()V
    .locals 4

    new-instance v0, Ln0/l1$a;

    invoke-direct {v0}, Ln0/l1$a;-><init>()V

    iget v1, p0, Lz/y;->A:I

    invoke-virtual {v0, v1}, Ln0/l1$a;->v(I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ln0/l1$a;->w(Z)V

    new-instance v2, Ly/a$a;

    invoke-direct {v2}, Ly/a$a;-><init>()V

    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p0, v1}, Lz/y;->Q(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Ly/a$a;->f(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Ly/a$a;

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Ly/a$a;->f(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Ly/a$a;

    invoke-virtual {v2}, Ly/a$a;->b()Ly/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln0/l1$a;->e(Ln0/n1;)V

    invoke-virtual {v0}, Ln0/l1$a;->h()Ln0/l1;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lz/y;->q0(Ljava/util/List;)V

    return-void
.end method

.method public j()Ln0/n1;
    .locals 1

    iget-object v0, p0, Lz/y;->n:Lf0/g;

    invoke-virtual {v0}, Lf0/g;->n()Ly/a;

    move-result-object v0

    return-object v0
.end method

.method public j0()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lz/y;->o0(I)V

    return-void
.end method

.method public k()V
    .locals 1

    iget-object v0, p0, Lz/y;->p:Lz/b6;

    invoke-virtual {v0}, Lz/b6;->f()V

    return-void
.end method

.method public k0(Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setActive: isActive = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Camera2CameraControlImp"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lz/y;->h:Lz/h4;

    invoke-virtual {v0, p1}, Lz/h4;->J(Z)V

    iget-object v0, p0, Lz/y;->i:Lz/g6;

    invoke-virtual {v0, p1}, Lz/g6;->l(Z)V

    iget-object v0, p0, Lz/y;->k:Lz/q4;

    invoke-virtual {v0, p1}, Lz/q4;->d(Z)V

    iget-object v0, p0, Lz/y;->j:Lz/x5;

    invoke-virtual {v0, p1}, Lz/x5;->i(Z)V

    iget-object v0, p0, Lz/y;->l:Lz/s3;

    invoke-virtual {v0, p1}, Lz/s3;->b(Z)V

    iget-object v0, p0, Lz/y;->n:Lf0/g;

    invoke-virtual {v0, p1}, Lf0/g;->o(Z)V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lz/y;->r:Lg0/f1$j;

    iget-object p1, p0, Lz/y;->p:Lz/b6;

    invoke-virtual {p1}, Lz/b6;->h()V

    :cond_0
    return-void
.end method

.method public l(Ln0/n1;)V
    .locals 2

    iget-object v0, p0, Lz/y;->n:Lf0/g;

    invoke-static {p1}, Lf0/l$a;->d(Ln0/n1;)Lf0/l$a;

    move-result-object p1

    invoke-virtual {p1}, Lf0/l$a;->c()Lf0/l;

    move-result-object p1

    invoke-virtual {v0, p1}, Lf0/g;->g(Lf0/l;)Lne/x;

    move-result-object p1

    new-instance v0, Lz/u;

    invoke-direct {v0}, Lz/u;-><init>()V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public l0(Z)V
    .locals 0

    iput-boolean p1, p0, Lz/y;->x:Z

    return-void
.end method

.method public m(II)Lne/x;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lne/x<",
            "Lm0/m;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lz/y;->Z()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "Camera2CameraControlImp"

    const-string p2, "Camera is not active."

    invoke-static {p1, p2}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lg0/m$a;

    invoke-direct {p1, p2}, Lg0/m$a;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lz/y;->H()I

    move-result v0

    iget-object v1, p0, Lz/y;->z:Lne/x;

    invoke-static {v1}, Lr0/n;->s(Lne/x;)Lne/x;

    move-result-object v1

    invoke-static {v1}, Lr0/d;->c(Lne/x;)Lr0/d;

    move-result-object v1

    new-instance v2, Lz/r;

    invoke-direct {v2, p0, p1, v0, p2}, Lz/r;-><init>(Lz/y;III)V

    iget-object p1, p0, Lz/y;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v2, p1}, Lr0/d;->g(Lr0/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object p1

    return-object p1
.end method

.method public m0(Z)V
    .locals 1

    iget-object v0, p0, Lz/y;->k:Lz/q4;

    invoke-virtual {v0, p1}, Lz/q4;->f(Z)V

    return-void
.end method

.method public n()V
    .locals 3

    iget-object v0, p0, Lz/y;->n:Lf0/g;

    invoke-virtual {v0}, Lf0/g;->j()Lne/x;

    move-result-object v0

    new-instance v1, Lz/l;

    invoke-direct {v1}, Lz/l;-><init>()V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public n0(Landroid/util/Rational;)V
    .locals 1

    iget-object v0, p0, Lz/y;->h:Lz/h4;

    invoke-virtual {v0, p1}, Lz/h4;->K(Landroid/util/Rational;)V

    return-void
.end method

.method public o(Lg0/m0;)Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/m0;",
            ")",
            "Lne/x<",
            "Lg0/n0;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lz/y;->Z()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance p1, Lg0/m$a;

    const-string v0, "Camera is not active."

    invoke-direct {p1, v0}, Lg0/m$a;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lz/y;->d0()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance p1, Lg0/m$a;

    const-string v0, "Repeating request is not available possibly because it\'s disable for the ImageCapture."

    invoke-direct {p1, v0}, Lg0/m$a;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, Lz/y;->h:Lz/h4;

    invoke-virtual {v0, p1}, Lz/h4;->N(Lg0/m0;)Lne/x;

    move-result-object p1

    invoke-static {p1}, Lr0/n;->s(Lne/x;)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public o0(I)V
    .locals 1

    iput p1, p0, Lz/y;->A:I

    iget-object v0, p0, Lz/y;->h:Lz/h4;

    invoke-virtual {v0, p1}, Lz/h4;->L(I)V

    iget-object p1, p0, Lz/y;->o:Lz/g1;

    iget v0, p0, Lz/y;->A:I

    invoke-virtual {p1, v0}, Lz/g1;->g(I)V

    return-void
.end method

.method public p0(Z)V
    .locals 1

    iget-object v0, p0, Lz/y;->m:Lz/i6;

    invoke-interface {v0, p1}, Lz/i6;->e(Z)V

    return-void
.end method

.method public q0(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln0/l1;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lz/y;->f:Ln0/l0$d;

    invoke-interface {v0, p1}, Ln0/l0$d;->b(Ljava/util/List;)V

    return-void
.end method

.method public r0()Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lz/k;

    invoke-direct {v0, p0}, Lz/k;-><init>(Lz/y;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object v0

    invoke-static {v0}, Lr0/n;->s(Lne/x;)Lne/x;

    move-result-object v0

    return-object v0
.end method

.method public s0()J
    .locals 2

    iget-object v0, p0, Lz/y;->y:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    iput-wide v0, p0, Lz/y;->B:J

    iget-object v0, p0, Lz/y;->f:Ln0/l0$d;

    invoke-interface {v0}, Ln0/l0$d;->a()V

    iget-wide v0, p0, Lz/y;->B:J

    return-wide v0
.end method

.method public final t0(J)Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lz/o;

    invoke-direct {v0, p0, p1, p2}, Lz/o;-><init>(Lz/y;J)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p1

    return-object p1
.end method
