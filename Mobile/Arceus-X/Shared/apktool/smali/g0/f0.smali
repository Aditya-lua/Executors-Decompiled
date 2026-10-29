.class public final Lg0/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg0/f0$a;
    }
.end annotation


# static fields
.field public static final s:Ljava/lang/Object;

.field public static final t:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ln0/d1;

.field public final b:Ljava/lang/Object;

.field public final c:Lg0/g0;

.field public final d:Ljava/util/concurrent/Executor;

.field public final e:Landroid/os/Handler;

.field public final f:Landroid/os/HandlerThread;

.field public g:Ln0/n0;

.field public h:Ln0/m0;

.field public i:Ln0/j4;

.field public j:Ls0/m;

.field public k:Lg0/y;

.field public final l:Lg0/c2;

.field public final m:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Ln0/y0;

.field public o:Lg0/f0$a;

.field public p:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final q:Ljava/lang/Integer;

.field public final r:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lg0/f0;->s:Ljava/lang/Object;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lg0/f0;->t:Landroid/util/SparseArray;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lg0/g0$b;)V
    .locals 1

    .line 1
    new-instance v0, Ln0/j3;

    invoke-direct {v0}, Ln0/j3;-><init>()V

    invoke-direct {p0, p1, p2, v0}, Lg0/f0;-><init>(Landroid/content/Context;Lg0/g0$b;Lt/a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lg0/g0$b;Lt/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lg0/g0$b;",
            "Lt/a<",
            "Landroid/content/Context;",
            "Ln0/h3;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ln0/d1;

    invoke-direct {v0}, Ln0/d1;-><init>()V

    iput-object v0, p0, Lg0/f0;->a:Ln0/d1;

    .line 4
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lg0/f0;->b:Ljava/lang/Object;

    .line 5
    sget-object v0, Lg0/f0$a;->a:Lg0/f0$a;

    iput-object v0, p0, Lg0/f0;->o:Lg0/f0$a;

    const/4 v0, 0x0

    .line 6
    invoke-static {v0}, Lr0/n;->p(Ljava/lang/Object;)Lne/x;

    move-result-object v1

    iput-object v1, p0, Lg0/f0;->p:Lne/x;

    if-eqz p2, :cond_0

    .line 7
    invoke-interface {p2}, Lg0/g0$b;->getCameraXConfig()Lg0/g0;

    move-result-object p2

    iput-object p2, p0, Lg0/f0;->c:Lg0/g0;

    goto :goto_0

    .line 8
    :cond_0
    invoke-static {p1}, Lg0/f0;->k(Landroid/content/Context;)Lg0/g0$b;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 9
    invoke-interface {p2}, Lg0/g0$b;->getCameraXConfig()Lg0/g0;

    move-result-object p2

    iput-object p2, p0, Lg0/f0;->c:Lg0/g0;

    .line 10
    :goto_0
    iget-object p2, p0, Lg0/f0;->c:Lg0/g0;

    invoke-virtual {p2}, Lg0/g0;->o0()Ln0/h3;

    move-result-object p2

    invoke-static {p1, p2, p3}, Lg0/f0;->u(Landroid/content/Context;Ln0/h3;Lt/a;)V

    .line 11
    iget-object p2, p0, Lg0/f0;->c:Lg0/g0;

    invoke-virtual {p2}, Lg0/g0;->m0()I

    move-result p2

    iput p2, p0, Lg0/f0;->r:I

    .line 12
    iget-object p2, p0, Lg0/f0;->c:Lg0/g0;

    invoke-virtual {p2, v0}, Lg0/g0;->i0(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p2

    .line 13
    iget-object p3, p0, Lg0/f0;->c:Lg0/g0;

    invoke-virtual {p3, v0}, Lg0/g0;->p0(Landroid/os/Handler;)Landroid/os/Handler;

    move-result-object p3

    if-nez p2, :cond_1

    .line 14
    new-instance p2, Lg0/q;

    invoke-direct {p2}, Lg0/q;-><init>()V

    :cond_1
    iput-object p2, p0, Lg0/f0;->d:Ljava/util/concurrent/Executor;

    if-nez p3, :cond_2

    .line 15
    new-instance p3, Landroid/os/HandlerThread;

    const-string v1, "CameraX-scheduler"

    const/16 v2, 0xa

    invoke-direct {p3, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lg0/f0;->f:Landroid/os/HandlerThread;

    .line 16
    invoke-virtual {p3}, Ljava/lang/Thread;->start()V

    .line 17
    invoke-virtual {p3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p3

    invoke-static {p3}, Lu2/i;->a(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object p3

    iput-object p3, p0, Lg0/f0;->e:Landroid/os/Handler;

    goto :goto_1

    .line 18
    :cond_2
    iput-object v0, p0, Lg0/f0;->f:Landroid/os/HandlerThread;

    .line 19
    iput-object p3, p0, Lg0/f0;->e:Landroid/os/Handler;

    .line 20
    :goto_1
    iget-object p3, p0, Lg0/f0;->c:Lg0/g0;

    sget-object v1, Lg0/g0;->V:Ln0/n1$a;

    invoke-interface {p3, v1, v0}, Ln0/l3;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    iput-object p3, p0, Lg0/f0;->q:Ljava/lang/Integer;

    .line 21
    invoke-static {p3}, Lg0/f0;->m(Ljava/lang/Integer;)V

    .line 22
    new-instance p3, Lg0/c2$a;

    iget-object v0, p0, Lg0/f0;->c:Lg0/g0;

    .line 23
    invoke-virtual {v0}, Lg0/g0;->l0()Lg0/c2;

    move-result-object v0

    invoke-direct {p3, v0}, Lg0/c2$a;-><init>(Lg0/c2;)V

    invoke-virtual {p3}, Lg0/c2$a;->a()Lg0/c2;

    move-result-object p3

    iput-object p3, p0, Lg0/f0;->l:Lg0/c2;

    .line 24
    new-instance p3, Ln0/y0;

    invoke-direct {p3, p2}, Ln0/y0;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object p3, p0, Lg0/f0;->n:Ln0/y0;

    .line 25
    invoke-virtual {p0, p1}, Lg0/f0;->o(Landroid/content/Context;)Lne/x;

    move-result-object p1

    iput-object p1, p0, Lg0/f0;->m:Lne/x;

    return-void

    .line 26
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as \'camera-camera2\'."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lg0/f0;Landroid/content/Context;Ljava/util/concurrent/Executor;ILy1/c$a;J)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move/from16 v5, p3

    move-object/from16 v7, p4

    move-wide/from16 v3, p5

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "CX:initAndRetryRecursively"

    invoke-static {v0}, Ln5/a;->c(Ljava/lang/String;)V

    invoke-static/range {p1 .. p1}, Lp0/f;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v9

    const/4 v6, 0x0

    :try_start_0
    iget-object v0, v1, Lg0/f0;->c:Lg0/g0;

    invoke-virtual {v0, v6}, Lg0/g0;->j0(Ln0/n0$a;)Ln0/n0$a;

    move-result-object v8

    if-eqz v8, :cond_5

    iget-object v0, v1, Lg0/f0;->d:Ljava/util/concurrent/Executor;

    iget-object v10, v1, Lg0/f0;->e:Landroid/os/Handler;

    invoke-static {v0, v10}, Ln0/h1;->a(Ljava/util/concurrent/Executor;Landroid/os/Handler;)Ln0/h1;

    move-result-object v10

    iget-object v0, v1, Lg0/f0;->c:Lg0/g0;

    invoke-virtual {v0, v6}, Lg0/g0;->h0(Lg0/v;)Lg0/v;

    move-result-object v11

    iget-object v0, v1, Lg0/f0;->c:Lg0/g0;

    invoke-virtual {v0}, Lg0/g0;->k0()J

    move-result-wide v12

    iget-object v0, v1, Lg0/f0;->c:Lg0/g0;

    invoke-virtual {v0, v6}, Lg0/g0;->q0(Ln0/j4$c;)Ln0/j4$c;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-interface {v0, v9}, Ln0/j4$c;->a(Landroid/content/Context;)Ln0/j4;

    move-result-object v0

    iput-object v0, v1, Lg0/f0;->i:Ln0/j4;

    new-instance v15, Ls0/n;

    iget-object v0, v1, Lg0/f0;->i:Ln0/j4;

    invoke-direct {v15, v0, v6}, Ls0/n;-><init>(Ln0/j4;Ln0/m0;)V

    iput-object v15, v1, Lg0/f0;->j:Ls0/m;

    iget-object v14, v1, Lg0/f0;->c:Lg0/g0;

    invoke-interface/range {v8 .. v15}, Ln0/n0$a;->a(Landroid/content/Context;Ln0/h1;Lg0/v;JLg0/g0;Ls0/m;)Ln0/n0;

    move-result-object v0

    iput-object v0, v1, Lg0/f0;->g:Ln0/n0;

    iget-object v0, v1, Lg0/f0;->c:Lg0/g0;

    invoke-virtual {v0, v6}, Lg0/g0;->n0(Ln0/m0$a;)Ln0/m0$a;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v8, v1, Lg0/f0;->g:Ln0/n0;

    invoke-interface {v8}, Ln0/n0;->a()Ljava/lang/Object;

    move-result-object v8

    iget-object v10, v1, Lg0/f0;->g:Ln0/n0;

    invoke-interface {v10}, Ln0/n0;->d()Ljava/util/Set;

    move-result-object v10

    invoke-interface {v0, v9, v8, v10}, Ln0/m0$a;->a(Landroid/content/Context;Ljava/lang/Object;Ljava/util/Set;)Ln0/m0;

    move-result-object v0

    iput-object v0, v1, Lg0/f0;->h:Ln0/m0;

    iget-object v8, v1, Lg0/f0;->j:Ls0/m;

    invoke-interface {v8, v0}, Ls0/m;->b(Ln0/m0;)V

    instance-of v0, v2, Lg0/q;

    if-eqz v0, :cond_0

    move-object v0, v2

    check-cast v0, Lg0/q;

    iget-object v8, v1, Lg0/f0;->g:Ln0/n0;

    invoke-virtual {v0, v8}, Lg0/q;->e(Ln0/n0;)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_2

    :catch_1
    move-exception v0

    goto/16 :goto_2

    :catch_2
    move-exception v0

    goto/16 :goto_2

    :cond_0
    :goto_0
    iget-object v0, v1, Lg0/f0;->a:Ln0/d1;

    iget-object v8, v1, Lg0/f0;->g:Ln0/n0;

    invoke-virtual {v0, v8}, Ln0/d1;->n(Ln0/n0;)V

    iget-object v0, v1, Lg0/f0;->g:Ln0/n0;

    invoke-interface {v0}, Ln0/n0;->f()Lh0/a;

    move-result-object v0

    iget-object v8, v1, Lg0/f0;->a:Ln0/d1;

    invoke-interface {v0, v8}, Lh0/a;->a(Ln0/d1;)V

    new-instance v8, Lg0/z;

    iget-object v10, v1, Lg0/f0;->a:Ln0/d1;

    iget-object v12, v1, Lg0/f0;->i:Ln0/j4;

    iget-object v13, v1, Lg0/f0;->j:Ls0/m;

    invoke-direct {v8, v10, v0, v12, v13}, Lg0/z;-><init>(Ln0/d1;Lh0/a;Ln0/j4;Ls0/m;)V

    iput-object v8, v1, Lg0/f0;->k:Lg0/y;

    iget-object v0, v1, Lg0/f0;->a:Ln0/d1;

    invoke-virtual {v0}, Ln0/d1;->m()Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ln0/p0;

    invoke-interface {v8}, Ln0/p0;->k()Ln0/o0;

    move-result-object v8

    iget-object v10, v1, Lg0/f0;->k:Lg0/y;

    invoke-interface {v8, v10}, Ln0/o0;->g(Lg0/y;)V

    goto :goto_1

    :cond_1
    iget-object v0, v1, Lg0/f0;->n:Ln0/y0;

    iget-object v8, v1, Lg0/f0;->g:Ln0/n0;

    iget-object v10, v1, Lg0/f0;->a:Ln0/d1;

    invoke-virtual {v0, v8, v10}, Ln0/y0;->A(Ln0/n0;Ln0/d1;)V

    iget-object v0, v1, Lg0/f0;->n:Ln0/y0;

    iget-object v8, v1, Lg0/f0;->h:Ln0/m0;

    invoke-virtual {v0, v8}, Ln0/y0;->k(Ln0/l2;)V

    iget-object v0, v1, Lg0/f0;->n:Ln0/y0;

    iget-object v8, v1, Lg0/f0;->g:Ln0/n0;

    invoke-interface {v8}, Ln0/n0;->f()Lh0/a;

    move-result-object v8

    invoke-virtual {v0, v8}, Ln0/y0;->k(Ln0/l2;)V

    iget-object v0, v1, Lg0/f0;->a:Ln0/d1;

    invoke-static {v9, v0, v11}, Ln0/j1;->a(Landroid/content/Context;Ln0/d1;Lg0/v;)V

    const/4 v0, 0x1

    if-le v5, v0, :cond_2

    invoke-virtual {v1, v6}, Lg0/f0;->s(Lg0/c2$b;)V

    :cond_2
    invoke-virtual {v1}, Lg0/f0;->p()V

    invoke-virtual {v7, v6}, Ly1/c$a;->c(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ln0/j1$b; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lg0/p1; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-static {}, Ln5/a;->f()V

    return-void

    :cond_3
    :try_start_1
    new-instance v0, Lg0/p1;

    new-instance v8, Ljava/lang/IllegalArgumentException;

    const-string v10, "Invalid app configuration provided. Missing CameraDeviceSurfaceManager."

    invoke-direct {v8, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v8}, Lg0/p1;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_4
    new-instance v0, Lg0/p1;

    new-instance v8, Ljava/lang/IllegalArgumentException;

    const-string v10, "Invalid app configuration provided. Missing UseCaseConfigFactory."

    invoke-direct {v8, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v8}, Lg0/p1;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_5
    new-instance v0, Lg0/p1;

    new-instance v8, Ljava/lang/IllegalArgumentException;

    const-string v10, "Invalid app configuration provided. Missing CameraFactory."

    invoke-direct {v8, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v8}, Lg0/p1;-><init>(Ljava/lang/Throwable;)V

    throw v0
    :try_end_1
    .catch Ln0/j1$b; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lg0/p1; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_2
    :try_start_2
    new-instance v8, Ln0/z0;

    invoke-direct {v8, v3, v4, v5, v0}, Ln0/z0;-><init>(JILjava/lang/Throwable;)V

    iget-object v10, v1, Lg0/f0;->l:Lg0/c2;

    invoke-interface {v10, v8}, Lg0/c2;->e(Lg0/c2$b;)Lg0/c2$c;

    move-result-object v10

    invoke-virtual {v1, v8}, Lg0/f0;->s(Lg0/c2$b;)V

    iget-object v8, v1, Lg0/f0;->n:Ln0/y0;

    invoke-virtual {v8}, Ln0/y0;->z()V

    invoke-virtual {v10}, Lg0/c2$c;->d()Z

    move-result v8

    if-eqz v8, :cond_6

    const v8, 0x7fffffff

    if-ge v5, v8, :cond_6

    const-string v6, "CameraX"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Retry init. Start time "

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v11, " current time "

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v11

    invoke-virtual {v8, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v6, v8, v0}, Lg0/r1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v8, v1, Lg0/f0;->e:Landroid/os/Handler;

    new-instance v0, Lg0/e0;

    move-object v6, v9

    invoke-direct/range {v0 .. v7}, Lg0/e0;-><init>(Lg0/f0;Ljava/util/concurrent/Executor;JILandroid/content/Context;Ly1/c$a;)V

    const-string v1, "retry_token"

    invoke-virtual {v10}, Lg0/c2$c;->b()J

    move-result-wide v2

    invoke-static {v8, v0, v1, v2, v3}, Lu2/i;->b(Landroid/os/Handler;Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    goto :goto_3

    :cond_6
    iget-object v2, v1, Lg0/f0;->b:Ljava/lang/Object;

    monitor-enter v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    sget-object v3, Lg0/f0$a;->c:Lg0/f0$a;

    iput-object v3, v1, Lg0/f0;->o:Lg0/f0$a;

    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v10}, Lg0/c2$c;->c()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {v1}, Lg0/f0;->p()V

    invoke-virtual {v7, v6}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    instance-of v1, v0, Ln0/j1$b;

    if-eqz v1, :cond_8

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v2, v0

    check-cast v2, Ln0/j1$b;

    invoke-virtual {v2}, Ln0/j1$b;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "CameraX"

    invoke-static {v2, v1, v0}, Lg0/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Lg0/p1;

    new-instance v2, Lg0/x;

    const/4 v3, 0x3

    invoke-direct {v2, v3, v1}, Lg0/x;-><init>(ILjava/lang/String;)V

    invoke-direct {v0, v2}, Lg0/p1;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v7, v0}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    goto :goto_3

    :cond_8
    instance-of v1, v0, Lg0/p1;

    if-eqz v1, :cond_9

    invoke-virtual {v7, v0}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    goto :goto_3

    :cond_9
    new-instance v1, Lg0/p1;

    invoke-direct {v1, v0}, Lg0/p1;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v7, v1}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    invoke-static {}, Ln5/a;->f()V

    return-void

    :catchall_0
    move-exception v0

    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {}, Ln5/a;->f()V

    throw v0
.end method

.method public static synthetic b(Lg0/f0;Ly1/c$a;)V
    .locals 2

    iget-object v0, p0, Lg0/f0;->g:Ln0/n0;

    invoke-interface {v0}, Ln0/n0;->shutdown()V

    iget-object v0, p0, Lg0/f0;->f:Landroid/os/HandlerThread;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lg0/f0;->d:Ljava/util/concurrent/Executor;

    instance-of v1, v0, Lg0/q;

    if-eqz v1, :cond_0

    check-cast v0, Lg0/q;

    invoke-virtual {v0}, Lg0/q;->d()V

    :cond_0
    iget-object p0, p0, Lg0/f0;->f:Landroid/os/HandlerThread;

    invoke-virtual {p0}, Landroid/os/HandlerThread;->quit()Z

    :cond_1
    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic c(Lg0/f0;Landroid/content/Context;Ly1/c$a;)Ljava/lang/Object;
    .locals 7

    iget-object v1, p0, Lg0/f0;->d:Ljava/util/concurrent/Executor;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    const/4 v4, 0x1

    move-object v0, p0

    move-object v5, p1

    move-object v6, p2

    invoke-virtual/range {v0 .. v6}, Lg0/f0;->n(Ljava/util/concurrent/Executor;JILandroid/content/Context;Ly1/c$a;)V

    const-string p0, "CameraX initInternal"

    return-object p0
.end method

.method public static synthetic d(Lg0/f0;Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lg0/f0;->n:Ln0/y0;

    invoke-virtual {v0}, Ln0/y0;->z()V

    iget-object v0, p0, Lg0/f0;->a:Ln0/d1;

    invoke-virtual {v0}, Ln0/d1;->k()Lne/x;

    move-result-object v0

    new-instance v1, Lg0/d0;

    invoke-direct {v1, p0, p1}, Lg0/d0;-><init>(Lg0/f0;Ly1/c$a;)V

    iget-object p0, p0, Lg0/f0;->d:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1, p0}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    const-string p0, "CameraX shutdownInternal"

    return-object p0
.end method

.method public static synthetic e(Lg0/f0;Ljava/util/concurrent/Executor;JILandroid/content/Context;Ly1/c$a;)V
    .locals 0

    add-int/lit8 p4, p4, 0x1

    invoke-virtual/range {p0 .. p6}, Lg0/f0;->n(Ljava/util/concurrent/Executor;JILandroid/content/Context;Ly1/c$a;)V

    return-void
.end method

.method public static f(Ljava/lang/Integer;)V
    .locals 3

    sget-object v0, Lg0/f0;->s:Ljava/lang/Object;

    monitor-enter v0

    if-nez p0, :cond_0

    :try_start_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    sget-object v1, Lg0/f0;->t:Landroid/util/SparseArray;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-nez v2, :cond_1

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v1, p0}, Landroid/util/SparseArray;->remove(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :goto_0
    invoke-static {}, Lg0/f0;->t()V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static k(Landroid/content/Context;)Lg0/g0$b;
    .locals 5

    const-string v0, "CameraX"

    invoke-static {p0}, Lp0/f;->b(Landroid/content/Context;)Landroid/app/Application;

    move-result-object v1

    instance-of v2, v1, Lg0/g0$b;

    if-eqz v2, :cond_0

    check-cast v1, Lg0/g0$b;

    return-object v1

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-static {p0}, Lp0/f;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    new-instance v3, Landroid/content/ComponentName;

    const-class v4, Landroidx/camera/core/impl/MetadataHolderService;

    invoke-direct {v3, p0, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/16 p0, 0x280

    invoke-virtual {v2, v3, p0}, Landroid/content/pm/PackageManager;->getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    if-eqz p0, :cond_1

    const-string v2, "androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER"

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    goto :goto_1

    :catch_2
    move-exception p0

    goto :goto_1

    :catch_3
    move-exception p0

    goto :goto_1

    :catch_4
    move-exception p0

    goto :goto_1

    :catch_5
    move-exception p0

    goto :goto_1

    :catch_6
    move-exception p0

    goto :goto_1

    :cond_1
    move-object p0, v1

    :goto_0
    if-nez p0, :cond_2

    const-string p0, "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as \'camera-camera2\'."

    invoke-static {v0, p0}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_2
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg0/g0$b;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :goto_1
    const-string v2, "Failed to retrieve default CameraXConfig.Provider from meta-data"

    invoke-static {v0, v2, p0}, Lg0/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public static m(Ljava/lang/Integer;)V
    .locals 5

    sget-object v0, Lg0/f0;->s:Ljava/lang/Object;

    monitor-enter v0

    if-nez p0, :cond_0

    :try_start_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "minLogLevel"

    const/4 v3, 0x3

    const/4 v4, 0x6

    invoke-static {v1, v3, v4, v2}, Lx2/g;->c(IIILjava/lang/String;)I

    sget-object v1, Lg0/f0;->t:Landroid/util/SparseArray;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/2addr v3, v2

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-static {}, Lg0/f0;->t()V

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static t()V
    .locals 3

    sget-object v0, Lg0/f0;->t:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lg0/r1;->i()V

    return-void

    :cond_0
    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v1}, Lg0/r1;->j(I)V

    return-void

    :cond_1
    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v1}, Lg0/r1;->j(I)V

    return-void

    :cond_2
    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-static {v1}, Lg0/r1;->j(I)V

    return-void

    :cond_3
    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v1}, Lg0/r1;->j(I)V

    :cond_4
    return-void
.end method

.method public static u(Landroid/content/Context;Ln0/h3;Lt/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ln0/h3;",
            "Lt/a<",
            "Landroid/content/Context;",
            "Ln0/h3;",
            ">;)V"
        }
    .end annotation

    const-string v0, "CameraX"

    if-eqz p1, :cond_0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "QuirkSettings from CameraXConfig: "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-interface {p2, p0}, Lt/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    move-object p1, p0

    check-cast p1, Ln0/h3;

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "QuirkSettings from app metadata: "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    if-nez p1, :cond_1

    sget-object p1, Ln0/i3;->b:Ln0/h3;

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "QuirkSettings by default: "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Ln0/i3;->b()Ln0/i3;

    move-result-object p0

    invoke-virtual {p0, p1}, Ln0/i3;->d(Ln0/h3;)V

    return-void
.end method


# virtual methods
.method public g()Ln0/n0;
    .locals 2

    iget-object v0, p0, Lg0/f0;->g:Ln0/n0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CameraX not initialized yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h()Ln0/d1;
    .locals 1

    iget-object v0, p0, Lg0/f0;->a:Ln0/d1;

    return-object v0
.end method

.method public i()Lg0/y;
    .locals 2

    iget-object v0, p0, Lg0/f0;->k:Lg0/y;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "CameraX not initialized yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public j()I
    .locals 1

    iget v0, p0, Lg0/f0;->r:I

    return v0
.end method

.method public l()Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg0/f0;->m:Lne/x;

    return-object v0
.end method

.method public final n(Ljava/util/concurrent/Executor;JILandroid/content/Context;Ly1/c$a;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "JI",
            "Landroid/content/Context;",
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lg0/b0;

    move-object v1, p0

    move-object v3, p1

    move-wide v6, p2

    move v4, p4

    move-object v2, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v7}, Lg0/b0;-><init>(Lg0/f0;Landroid/content/Context;Ljava/util/concurrent/Executor;ILy1/c$a;J)V

    invoke-interface {v3, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final o(Landroid/content/Context;)Lne/x;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg0/f0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg0/f0;->o:Lg0/f0$a;

    sget-object v2, Lg0/f0$a;->a:Lg0/f0$a;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "CameraX.initInternal() should only be called once per instance"

    invoke-static {v1, v2}, Lx2/g;->j(ZLjava/lang/String;)V

    sget-object v1, Lg0/f0$a;->b:Lg0/f0$a;

    iput-object v1, p0, Lg0/f0;->o:Lg0/f0$a;

    new-instance v1, Lg0/a0;

    invoke-direct {v1, p0, p1}, Lg0/a0;-><init>(Lg0/f0;Landroid/content/Context;)V

    invoke-static {v1}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final p()V
    .locals 2

    iget-object v0, p0, Lg0/f0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lg0/f0$a;->d:Lg0/f0$a;

    iput-object v1, p0, Lg0/f0;->o:Lg0/f0$a;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public q()Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lg0/f0;->r()Lne/x;

    move-result-object v0

    return-object v0
.end method

.method public final r()Lne/x;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg0/f0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg0/f0;->e:Landroid/os/Handler;

    const-string v2, "retry_token"

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v1, p0, Lg0/f0;->o:Lg0/f0$a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    const/4 v2, 0x3

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lg0/f0$a;->e:Lg0/f0$a;

    iput-object v1, p0, Lg0/f0;->o:Lg0/f0$a;

    iget-object v1, p0, Lg0/f0;->q:Ljava/lang/Integer;

    invoke-static {v1}, Lg0/f0;->f(Ljava/lang/Integer;)V

    new-instance v1, Lg0/c0;

    invoke-direct {v1, p0}, Lg0/c0;-><init>(Lg0/f0;)V

    invoke-static {v1}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object v1

    iput-object v1, p0, Lg0/f0;->p:Lne/x;

    :goto_0
    iget-object v1, p0, Lg0/f0;->p:Lne/x;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "CameraX could not be shutdown when it is initializing."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    sget-object v1, Lg0/f0$a;->e:Lg0/f0$a;

    iput-object v1, p0, Lg0/f0;->o:Lg0/f0$a;

    const/4 v1, 0x0

    invoke-static {v1}, Lr0/n;->p(Ljava/lang/Object;)Lne/x;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final s(Lg0/c2$b;)V
    .locals 1

    invoke-static {}, Ln5/a;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lg0/c2$b;->m()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    const-string v0, "CX:CameraProvider-RetryStatus"

    invoke-static {v0, p1}, Ln5/a;->j(Ljava/lang/String;I)V

    :cond_1
    return-void
.end method
