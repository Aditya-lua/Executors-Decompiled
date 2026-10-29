.class public final Lz/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/p0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/u0$h;,
        Lz/u0$j;,
        Lz/u0$i;,
        Lz/u0$g;,
        Lz/u0$e;,
        Lz/u0$f;,
        Lz/u0$k;
    }
.end annotation


# instance fields
.field public A:Z

.field public B:Z

.field public C:Lz/t4;

.field public final D:Lz/o3;

.field public final E:Lz/h5$b;

.field public final F:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public G:Ln0/h0;

.field public final H:Ljava/lang/Object;

.field public I:Ln0/q3;

.field public J:Z

.field public final K:Lz/q3;

.field public final L:La0/c0;

.field public final M:Lb0/e;

.field public final N:Lz/g5;

.field public final O:Lz/u0$h;

.field public final a:Ln0/h4;

.field public final b:La0/p0;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:Ljava/util/concurrent/ScheduledExecutorService;

.field public volatile e:Lz/u0$i;

.field public final f:Ln0/u2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln0/u2<",
            "Ln0/p0$a;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lz/z2;

.field public final h:Lz/y;

.field public final i:Lz/u0$j;

.field public final j:Lz/z0;

.field public k:Landroid/hardware/camera2/CameraDevice;

.field public l:I

.field public m:Lz/l3;

.field public final n:Ljava/util/concurrent/atomic/AtomicInteger;

.field public o:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public p:Ly1/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final q:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lz/l3;",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation
.end field

.field public r:I

.field public final s:Lz/u0$e;

.field public final t:Lz/u0$f;

.field public final u:Lh0/a;

.field public final v:Ln0/g1;

.field public final w:Lg0/g0;

.field public final x:Z

.field public final y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;La0/p0;Ljava/lang/String;Lz/z0;Lh0/a;Ln0/g1;Ljava/util/concurrent/Executor;Landroid/os/Handler;Lz/q3;JLg0/g0;)V
    .locals 18
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NullAnnotationGroup"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p6

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lz/u0$i;->c:Lz/u0$i;

    iput-object v0, v1, Lz/u0;->e:Lz/u0$i;

    new-instance v10, Ln0/u2;

    invoke-direct {v10}, Ln0/u2;-><init>()V

    iput-object v10, v1, Lz/u0;->f:Ln0/u2;

    const/4 v0, 0x0

    iput v0, v1, Lz/u0;->l:I

    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v2, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v2, v1, Lz/u0;->n:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v2, v1, Lz/u0;->q:Ljava/util/Map;

    iput v0, v1, Lz/u0;->r:I

    iput-boolean v0, v1, Lz/u0;->z:Z

    iput-boolean v0, v1, Lz/u0;->A:Z

    const/4 v2, 0x1

    iput-boolean v2, v1, Lz/u0;->B:Z

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, v1, Lz/u0;->F:Ljava/util/Set;

    invoke-static {}, Ln0/k0;->a()Ln0/h0;

    move-result-object v2

    iput-object v2, v1, Lz/u0;->G:Ln0/h0;

    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, v1, Lz/u0;->H:Ljava/lang/Object;

    iput-boolean v0, v1, Lz/u0;->J:Z

    new-instance v0, Lz/u0$h;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lz/u0$h;-><init>(Lz/u0;Lz/u0$a;)V

    iput-object v0, v1, Lz/u0;->O:Lz/u0$h;

    iput-object v6, v1, Lz/u0;->b:La0/p0;

    move-object/from16 v0, p5

    iput-object v0, v1, Lz/u0;->u:Lh0/a;

    iput-object v9, v1, Lz/u0;->v:Ln0/g1;

    invoke-static/range {p8 .. p8}, Lq0/c;->f(Landroid/os/Handler;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v3

    iput-object v3, v1, Lz/u0;->d:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static/range {p7 .. p7}, Lq0/c;->g(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v12

    iput-object v12, v1, Lz/u0;->c:Ljava/util/concurrent/Executor;

    new-instance v0, Lz/u0$j;

    move-wide/from16 v4, p10

    move-object v2, v12

    invoke-direct/range {v0 .. v5}, Lz/u0$j;-><init>(Lz/u0;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;J)V

    move-object v11, v1

    iput-object v0, v11, Lz/u0;->i:Lz/u0$j;

    new-instance v0, Ln0/h4;

    invoke-direct {v0, v7}, Ln0/h4;-><init>(Ljava/lang/String;)V

    iput-object v0, v11, Lz/u0;->a:Ln0/h4;

    sget-object v0, Ln0/p0$a;->d:Ln0/p0$a;

    invoke-virtual {v10, v0}, Ln0/u2;->n(Ljava/lang/Object;)V

    new-instance v10, Lz/z2;

    invoke-direct {v10, v9}, Lz/z2;-><init>(Ln0/g1;)V

    iput-object v10, v11, Lz/u0;->g:Lz/z2;

    new-instance v15, Lz/o3;

    invoke-direct {v15, v12}, Lz/o3;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v15, v11, Lz/u0;->D:Lz/o3;

    move-object/from16 v0, p9

    iput-object v0, v11, Lz/u0;->K:Lz/q3;

    move-object/from16 v0, p12

    iput-object v0, v11, Lz/u0;->w:Lg0/g0;

    :try_start_0
    invoke-virtual/range {p2 .. p3}, La0/p0;->c(Ljava/lang/String;)La0/c0;

    move-result-object v1

    iput-object v1, v11, Lz/u0;->L:La0/c0;

    new-instance v0, Lz/y;

    new-instance v4, Lz/u0$g;

    invoke-direct {v4, v11}, Lz/u0$g;-><init>(Lz/u0;)V

    invoke-virtual {v8}, Lz/z0;->l()Ln0/k3;

    move-result-object v5

    move-object v2, v3

    move-object v3, v12

    invoke-direct/range {v0 .. v5}, Lz/y;-><init>(La0/c0;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;Ln0/l0$d;Ln0/k3;)V

    move-object v12, v3

    move-object v3, v2

    iput-object v0, v11, Lz/u0;->h:Lz/y;

    iput-object v8, v11, Lz/u0;->j:Lz/z0;

    invoke-virtual {v8, v0}, Lz/z0;->G(Lz/y;)V

    invoke-virtual {v10}, Lz/z2;->a()Landroidx/lifecycle/a0;

    move-result-object v0

    invoke-virtual {v8, v0}, Lz/z0;->J(Landroidx/lifecycle/a0;)V
    :try_end_0
    .catch La0/f; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {v1}, Lb0/e;->a(La0/c0;)Lb0/e;

    move-result-object v0

    iput-object v0, v11, Lz/u0;->M:Lb0/e;

    invoke-virtual {v11}, Lz/u0;->q0()Lz/l3;

    move-result-object v0

    iput-object v0, v11, Lz/u0;->m:Lz/l3;

    new-instance v11, Lz/h5$b;

    invoke-virtual {v8}, Lz/z0;->l()Ln0/k3;

    move-result-object v16

    invoke-static {}, Lc0/e;->c()Ln0/k3;

    move-result-object v17

    move-object/from16 v1, p0

    move-object/from16 v14, p8

    move-object v13, v3

    invoke-direct/range {v11 .. v17}, Lz/h5$b;-><init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;Lz/o3;Ln0/k3;Ln0/k3;)V

    iput-object v11, v1, Lz/u0;->E:Lz/h5$b;

    invoke-virtual {v8}, Lz/z0;->l()Ln0/k3;

    move-result-object v0

    invoke-static {v0}, Ld0/c;->a(Ln0/k3;)Z

    move-result v0

    iput-boolean v0, v1, Lz/u0;->x:Z

    invoke-virtual {v8}, Lz/z0;->l()Ln0/k3;

    move-result-object v0

    const-class v2, Landroidx/camera/camera2/internal/compat/quirk/LegacyCameraSurfaceCleanupQuirk;

    invoke-virtual {v0, v2}, Ln0/k3;->a(Ljava/lang/Class;)Z

    move-result v0

    iput-boolean v0, v1, Lz/u0;->y:Z

    new-instance v0, Lz/u0$e;

    invoke-direct {v0, v1, v7}, Lz/u0$e;-><init>(Lz/u0;Ljava/lang/String;)V

    iput-object v0, v1, Lz/u0;->s:Lz/u0$e;

    new-instance v2, Lz/u0$f;

    invoke-direct {v2, v1}, Lz/u0$f;-><init>(Lz/u0;)V

    iput-object v2, v1, Lz/u0;->t:Lz/u0$f;

    invoke-virtual {v9, v1, v12, v2, v0}, Ln0/g1;->g(Lg0/l;Ljava/util/concurrent/Executor;Ln0/g1$b;Ln0/g1$c;)V

    invoke-virtual {v6, v12, v0}, La0/p0;->g(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    new-instance v0, Lz/g5;

    new-instance v2, Lz/u0$a;

    invoke-direct {v2, v1}, Lz/u0$a;-><init>(Lz/u0;)V

    sget-object v3, Lj0/a;->b:Lj0/a;

    move-object/from16 p5, p1

    move-object/from16 p4, v0

    move-object/from16 p8, v2

    move-object/from16 p9, v3

    move-object/from16 p7, v6

    move-object/from16 p6, v7

    invoke-direct/range {p4 .. p9}, Lz/g5;-><init>(Landroid/content/Context;Ljava/lang/String;La0/p0;Lz/g;Lj0/a;)V

    iput-object v0, v1, Lz/u0;->N:Lz/g5;

    return-void

    :catch_0
    move-exception v0

    move-object v1, v11

    invoke-static {v0}, Lz/a3;->a(La0/f;)Lg0/x;

    move-result-object v0

    throw v0
.end method

.method public static synthetic A(Lz/k3;Ln0/u1;Ljava/lang/Void;)Lne/x;
    .locals 0

    invoke-virtual {p0}, Lz/k3;->close()V

    invoke-virtual {p1}, Ln0/u1;->d()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lz/k3;->f(Z)Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lz/u0;Z)V
    .locals 1

    iput-boolean p1, p0, Lz/u0;->J:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lz/u0;->e:Lz/u0$i;

    sget-object v0, Lz/u0$i;->d:Lz/u0$i;

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Lz/u0;->e:Lz/u0$i;

    sget-object v0, Lz/u0$i;->e:Lz/u0$i;

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lz/u0;->L0(Z)V

    :cond_1
    return-void
.end method

.method public static synthetic C(Ln0/o3$d;Ln0/o3;)V
    .locals 1

    sget-object v0, Ln0/o3$g;->a:Ln0/o3$g;

    invoke-interface {p0, p1, v0}, Ln0/o3$d;->a(Ln0/o3;Ln0/o3$g;)V

    return-void
.end method

.method public static synthetic D(Lz/u0;Ly1/c$a;)V
    .locals 0

    invoke-virtual {p0}, Lz/u0;->l0()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {p1, p0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic E(Lz/u0;Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V
    .locals 8

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Use case "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ACTIVE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    iget-object v1, p0, Lz/u0;->a:Ln0/h4;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Ln0/h4;->q(Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V

    iget-object p1, p0, Lz/u0;->a:Ln0/h4;

    move-object v7, v6

    move-object v6, v5

    move-object v5, v4

    move-object v4, v3

    move-object v3, v2

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Ln0/h4;->u(Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V

    invoke-virtual {p0}, Lz/u0;->N0()V

    return-void
.end method

.method public static synthetic F(Lz/u0;Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V
    .locals 7

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Use case "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " RESET"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    iget-object v1, p0, Lz/u0;->a:Ln0/h4;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Ln0/h4;->u(Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V

    invoke-virtual {p0}, Lz/u0;->T()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lz/u0;->B0(Z)V

    invoke-virtual {p0}, Lz/u0;->N0()V

    iget-object p1, p0, Lz/u0;->e:Lz/u0$i;

    sget-object p2, Lz/u0$i;->j:Lz/u0$i;

    if-ne p1, p2, :cond_0

    invoke-virtual {p0}, Lz/u0;->v0()V

    :cond_0
    return-void
.end method

.method public static synthetic G(Lz/u0;Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lz/u0;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lz/m0;

    invoke-direct {v1, p0, p1}, Lz/m0;-><init>(Lz/u0;Ly1/c$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Release[request="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lz/u0;->n:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lz/u0;Ly1/c$a;)V
    .locals 0

    invoke-virtual {p0}, Lz/u0;->y0()Lne/x;

    move-result-object p0

    invoke-static {p0, p1}, Lr0/n;->t(Lne/x;Ly1/c$a;)V

    return-void
.end method

.method public static synthetic I(Lz/u0;)V
    .locals 4

    const-string v0, "Camera is removed. Updating state and cleaning up."

    invoke-virtual {p0, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    iget-object v0, p0, Lz/u0;->e:Lz/u0$i;

    sget-object v1, Lz/u0$i;->b:Lz/u0$i;

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lz/u0;->e:Lz/u0$i;

    sget-object v2, Lz/u0$i;->a:Lz/u0$i;

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    invoke-static {v0}, Lg0/w$a;->a(I)Lg0/w$a;

    move-result-object v0

    iget-object v2, p0, Lz/u0;->g:Lz/z2;

    sget-object v3, Ln0/p0$a;->d:Ln0/p0$a;

    invoke-virtual {v2, v3, v0}, Lz/z2;->c(Ln0/p0$a;Lg0/w$a;)V

    invoke-virtual {p0, v1, v0}, Lz/u0;->E0(Lz/u0$i;Lg0/w$a;)V

    iget-object v0, p0, Lz/u0;->i:Lz/u0$j;

    invoke-virtual {v0}, Lz/u0$j;->a()Z

    iget-object v0, p0, Lz/u0;->O:Lz/u0$h;

    invoke-virtual {v0}, Lz/u0$h;->a()V

    iget-object v0, p0, Lz/u0;->k:Landroid/hardware/camera2/CameraDevice;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lz/u0;->V(Z)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lz/u0;->d0()V

    :cond_2
    :goto_0
    return-void
.end method

.method public static synthetic J(Lz/u0;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1}, Lz/u0;->K0(Ljava/util/Collection;)V

    return-void
.end method

.method public static synthetic K(Lz/u0;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    invoke-virtual {p0, p1}, Lz/u0;->J0(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p0, p0, Lz/u0;->h:Lz/y;

    invoke-virtual {p0}, Lz/y;->D()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p0, p0, Lz/u0;->h:Lz/y;

    invoke-virtual {p0}, Lz/y;->D()V

    throw p1
.end method

.method public static synthetic L(Lz/u0;Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lz/u0;->p:Ly1/c$a;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Camera can only be released once, so release completer should be null on creation."

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    iput-object p1, p0, Lz/u0;->p:Ly1/c$a;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Release[camera="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic M(Lz/u0;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    iget-object p0, p0, Lz/u0;->d:Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method

.method public static synthetic N(Lz/u0;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lz/u0;->c:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public static synthetic O(Lz/u0;)Lz/u0$j;
    .locals 0

    iget-object p0, p0, Lz/u0;->i:Lz/u0$j;

    return-object p0
.end method

.method public static synthetic P(Lz/u0;)V
    .locals 0

    invoke-virtual {p0}, Lz/u0;->Y()V

    return-void
.end method

.method public static synthetic Q(Lz/u0;)Lz/u0$h;
    .locals 0

    iget-object p0, p0, Lz/u0;->O:Lz/u0$h;

    return-object p0
.end method

.method public static synthetic R(Lz/u0;Landroid/hardware/camera2/CameraDevice;)Lne/x;
    .locals 0

    invoke-virtual {p0, p1}, Lz/u0;->X(Landroid/hardware/camera2/CameraDevice;)Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static f0(Lg0/w2;)Ljava/util/List;
    .locals 1
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

    invoke-virtual {p0}, Lg0/w2;->i()Ln0/p0;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {p0}, Lb1/g;->q0(Lg0/w2;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static g0(I)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_5

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const-string p0, "UNKNOWN ERROR"

    return-object p0

    :cond_0
    const-string p0, "ERROR_CAMERA_SERVICE"

    return-object p0

    :cond_1
    const-string p0, "ERROR_CAMERA_DEVICE"

    return-object p0

    :cond_2
    const-string p0, "ERROR_CAMERA_DISABLED"

    return-object p0

    :cond_3
    const-string p0, "ERROR_MAX_CAMERAS_IN_USE"

    return-object p0

    :cond_4
    const-string p0, "ERROR_CAMERA_IN_USE"

    return-object p0

    :cond_5
    const-string p0, "ERROR_NONE"

    return-object p0
.end method

.method public static h0(Lz/t4;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lz/t4;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static j0(Lg0/w2;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lg0/w2;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lz/u0;Ly1/c$a;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v0, p0, Lz/u0;->a:Ln0/h4;

    invoke-virtual {v0}, Ln0/h4;->g()Ln0/o3$h;

    move-result-object v0

    invoke-virtual {v0}, Ln0/o3$h;->c()Ln0/o3;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ln0/o3;->c()Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v0, p0, Lz/u0;->D:Lz/o3;

    invoke-virtual {v0}, Lz/o3;->c()Landroid/hardware/camera2/CameraDevice$StateCallback;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lz/u0$b;

    invoke-direct {v0, p0, p1}, Lz/u0$b;-><init>(Lz/u0;Ly1/c$a;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lz/u0;->b:La0/p0;

    iget-object v2, p0, Lz/u0;->j:Lz/z0;

    invoke-virtual {v2}, Lz/z0;->e()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lz/u0;->c:Ljava/util/concurrent/Executor;

    invoke-static {v1}, Lz/w2;->a(Ljava/util/List;)Landroid/hardware/camera2/CameraDevice$StateCallback;

    move-result-object v1

    invoke-virtual {v0, v2, v3, v1}, La0/p0;->f(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V
    :try_end_0
    .catch La0/f; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to open camera for configAndClose: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lz/u0;->b0(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p1, v0}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    :goto_1
    const-string p0, "configAndCloseTask"

    return-object p0
.end method

.method public static synthetic u(Lz/u0;Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v0, p0, Lz/u0;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lz/r0;

    invoke-direct {v1, p0, p1}, Lz/r0;-><init>(Lz/u0;Ly1/c$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "Unable to check if MeteringRepeating is attached. Camera executor shut down."

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    :goto_0
    const-string p0, "isMeteringRepeatingAttached"

    return-object p0
.end method

.method public static synthetic v(Lz/u0;)V
    .locals 7

    invoke-virtual {p0}, Lz/u0;->k0()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lz/u0;->C:Lz/t4;

    invoke-virtual {v0}, Lz/t4;->h()Ln0/o3;

    move-result-object v3

    iget-object v0, p0, Lz/u0;->C:Lz/t4;

    invoke-virtual {v0}, Lz/t4;->i()Ln0/i4;

    move-result-object v4

    iget-object v0, p0, Lz/u0;->C:Lz/t4;

    invoke-static {v0}, Lz/u0;->h0(Lz/t4;)Ljava/lang/String;

    move-result-object v2

    sget-object v0, Ln0/j4$b;->f:Ln0/j4$b;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const/4 v5, 0x0

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lz/u0;->C0(Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic w(Lz/u0;)V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz/u0;->A:Z

    iput-boolean v0, p0, Lz/u0;->z:Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "OpenCameraConfigAndClose is done, state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lz/u0;->a0(Ljava/lang/String;)V

    iget-object v1, p0, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x5

    if-eq v1, v2, :cond_2

    const/4 v2, 0x7

    if-eq v1, v2, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OpenCameraConfigAndClose finished while in state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    return-void

    :cond_0
    iget v1, p0, Lz/u0;->l:I

    if-eqz v1, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OpenCameraConfigAndClose in error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lz/u0;->l:I

    invoke-static {v1}, Lz/u0;->g0(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    iget-object p0, p0, Lz/u0;->i:Lz/u0$j;

    invoke-virtual {p0}, Lz/u0$j;->e()V

    return-void

    :cond_1
    invoke-virtual {p0, v0}, Lz/u0;->M0(Z)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lz/u0;->o0()Z

    move-result v0

    invoke-static {v0}, Lx2/g;->i(Z)V

    invoke-virtual {p0}, Lz/u0;->d0()V

    return-void
.end method

.method public static synthetic x(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V
    .locals 0

    invoke-virtual {p0}, Landroid/view/Surface;->release()V

    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->release()V

    return-void
.end method

.method public static synthetic y(Lz/u0;Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Use case "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " INACTIVE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    iget-object v0, p0, Lz/u0;->a:Ln0/h4;

    invoke-virtual {v0, p1}, Ln0/h4;->t(Ljava/lang/String;)V

    invoke-virtual {p0}, Lz/u0;->N0()V

    return-void
.end method

.method public static synthetic z(Lz/u0;Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V
    .locals 7

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Use case "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " UPDATED"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    iget-object v1, p0, Lz/u0;->a:Ln0/h4;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Ln0/h4;->u(Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V

    invoke-virtual {p0}, Lz/u0;->N0()V

    return-void
.end method


# virtual methods
.method public final A0()V
    .locals 3

    iget-object v0, p0, Lz/u0;->C:Lz/t4;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz/u0;->a:Ln0/h4;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lz/u0;->C:Lz/t4;

    invoke-virtual {v2}, Lz/t4;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lz/u0;->C:Lz/t4;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln0/h4;->s(Ljava/lang/String;)V

    iget-object v0, p0, Lz/u0;->a:Ln0/h4;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lz/u0;->C:Lz/t4;

    invoke-virtual {v2}, Lz/t4;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lz/u0;->C:Lz/t4;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln0/h4;->t(Ljava/lang/String;)V

    iget-object v0, p0, Lz/u0;->C:Lz/t4;

    invoke-virtual {v0}, Lz/t4;->c()V

    const/4 v0, 0x0

    iput-object v0, p0, Lz/u0;->C:Lz/t4;

    :cond_0
    return-void
.end method

.method public B0(Z)V
    .locals 5

    iget-object v0, p0, Lz/u0;->m:Lz/l3;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lx2/g;->i(Z)V

    const-string v0, "Resetting Capture Session"

    invoke-virtual {p0, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    iget-object v0, p0, Lz/u0;->m:Lz/l3;

    invoke-interface {v0}, Lz/l3;->h()Ln0/o3;

    move-result-object v2

    invoke-interface {v0}, Lz/l3;->g()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p0}, Lz/u0;->q0()Lz/l3;

    move-result-object v4

    iput-object v4, p0, Lz/u0;->m:Lz/l3;

    invoke-interface {v4, v2}, Lz/l3;->d(Ln0/o3;)V

    iget-object v2, p0, Lz/u0;->m:Lz/l3;

    invoke-interface {v2, v3}, Lz/l3;->b(Ljava/util/List;)V

    iget-object v2, p0, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/16 v3, 0x9

    if-eq v2, v3, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Skipping Capture Session state check due to current camera state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " and previous session status: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Lz/l3;->c()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lz/u0;->a0(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    iget-boolean v2, p0, Lz/u0;->x:Z

    if-eqz v2, :cond_2

    invoke-interface {v0}, Lz/l3;->c()Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "Close camera before creating new session"

    invoke-virtual {p0, v2}, Lz/u0;->a0(Ljava/lang/String;)V

    sget-object v2, Lz/u0$i;->g:Lz/u0$i;

    invoke-virtual {p0, v2}, Lz/u0;->D0(Lz/u0$i;)V

    :cond_2
    :goto_1
    iget-boolean v2, p0, Lz/u0;->y:Z

    if-eqz v2, :cond_3

    invoke-interface {v0}, Lz/l3;->c()Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "ConfigAndClose is required when close the camera."

    invoke-virtual {p0, v2}, Lz/u0;->a0(Ljava/lang/String;)V

    iput-boolean v1, p0, Lz/u0;->z:Z

    :cond_3
    invoke-virtual {p0, v0, p1}, Lz/u0;->z0(Lz/l3;Z)Lne/x;

    return-void
.end method

.method public final C0(Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln0/o3;",
            "Ln0/i4<",
            "*>;",
            "Ln0/t3;",
            "Ljava/util/List<",
            "Ln0/j4$b;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lz/u0;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lz/i0;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lz/i0;-><init>(Lz/u0;Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public D0(Lz/u0$i;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lz/u0;->E0(Lz/u0$i;Lg0/w$a;)V

    return-void
.end method

.method public E0(Lz/u0$i;Lg0/w$a;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Lz/u0;->F0(Lz/u0$i;Lg0/w$a;Z)V

    return-void
.end method

.method public F0(Lz/u0$i;Lg0/w$a;Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Transitioning camera internal state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " --> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lz/u0;->I0(Lz/u0$i;Lg0/w$a;)V

    iput-object p1, p0, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unknown state: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_0
    sget-object p1, Ln0/p0$a;->i:Ln0/p0$a;

    goto :goto_0

    :pswitch_1
    sget-object p1, Ln0/p0$a;->h:Ln0/p0$a;

    goto :goto_0

    :pswitch_2
    sget-object p1, Ln0/p0$a;->g:Ln0/p0$a;

    goto :goto_0

    :pswitch_3
    sget-object p1, Ln0/p0$a;->f:Ln0/p0$a;

    goto :goto_0

    :pswitch_4
    sget-object p1, Ln0/p0$a;->e:Ln0/p0$a;

    goto :goto_0

    :pswitch_5
    sget-object p1, Ln0/p0$a;->d:Ln0/p0$a;

    goto :goto_0

    :pswitch_6
    sget-object p1, Ln0/p0$a;->c:Ln0/p0$a;

    goto :goto_0

    :pswitch_7
    sget-object p1, Ln0/p0$a;->b:Ln0/p0$a;

    :goto_0
    iget-object v0, p0, Lz/u0;->v:Ln0/g1;

    invoke-virtual {v0, p0, p1, p3}, Ln0/g1;->e(Lg0/l;Ln0/p0$a;Z)V

    iget-object p3, p0, Lz/u0;->f:Ln0/u2;

    invoke-virtual {p3, p1}, Ln0/u2;->n(Ljava/lang/Object;)V

    iget-object p3, p0, Lz/u0;->g:Lz/z2;

    invoke-virtual {p3, p1, p2}, Lz/z2;->c(Ln0/p0$a;Lg0/w$a;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public G0(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln0/l1;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/l1;

    invoke-static {v1}, Ln0/l1$a;->k(Ln0/l1;)Ln0/l1$a;

    move-result-object v2

    invoke-virtual {v1}, Ln0/l1;->k()I

    move-result v3

    const/4 v4, 0x5

    if-ne v3, v4, :cond_0

    invoke-virtual {v1}, Ln0/l1;->d()Ln0/e0;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Ln0/l1;->d()Ln0/e0;

    move-result-object v3

    invoke-virtual {v2, v3}, Ln0/l1$a;->p(Ln0/e0;)V

    :cond_0
    invoke-virtual {v1}, Ln0/l1;->i()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Ln0/l1;->n()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v2}, Lz/u0;->U(Ln0/l1$a;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ln0/l1$a;->h()Ln0/l1;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const-string p1, "Issue capture request"

    invoke-virtual {p0, p1}, Lz/u0;->a0(Ljava/lang/String;)V

    iget-object p1, p0, Lz/u0;->m:Lz/l3;

    invoke-interface {p1, v0}, Lz/l3;->b(Ljava/util/List;)V

    return-void
.end method

.method public final H0(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;)",
            "Ljava/util/Collection<",
            "Lz/u0$k;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    iget-boolean v2, p0, Lz/u0;->B:Z

    invoke-static {v1, v2}, Lz/u0$k;->b(Lg0/w2;Z)Lz/u0$k;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public I0(Lz/u0$i;Lg0/w$a;)V
    .locals 2

    invoke-static {}, Ln5/a;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CX:C2State["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    invoke-static {v0, p1}, Ln5/a;->j(Ljava/lang/String;I)V

    if-eqz p2, :cond_0

    iget p1, p0, Lz/u0;->r:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lz/u0;->r:I

    :cond_0
    iget p1, p0, Lz/u0;->r:I

    if-lez p1, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "CX:C2StateErrorCode["

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lg0/w$a;->d()I

    move-result p2

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    invoke-static {p1, p2}, Ln5/a;->j(Ljava/lang/String;I)V

    :cond_2
    return-void
.end method

.method public final J0(Ljava/util/Collection;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lz/u0$k;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lz/u0;->a:Ln0/h4;

    invoke-virtual {v0}, Ln0/h4;->h()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz/u0$k;

    iget-object v4, p0, Lz/u0;->a:Ln0/h4;

    invoke-virtual {v3}, Lz/u0$k;->h()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ln0/h4;->o(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v5, p0, Lz/u0;->a:Ln0/h4;

    invoke-virtual {v3}, Lz/u0$k;->h()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Lz/u0$k;->d()Ln0/o3;

    move-result-object v7

    invoke-virtual {v3}, Lz/u0$k;->g()Ln0/i4;

    move-result-object v8

    invoke-virtual {v3}, Lz/u0$k;->e()Ln0/t3;

    move-result-object v9

    invoke-virtual {v3}, Lz/u0$k;->c()Ljava/util/List;

    move-result-object v10

    invoke-virtual/range {v5 .. v10}, Ln0/h4;->r(Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V

    invoke-virtual {v3}, Lz/u0$k;->h()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Lz/u0$k;->i()Ljava/lang/Class;

    move-result-object v4

    const-class v5, Lg0/a2;

    if-ne v4, v5, :cond_0

    invoke-virtual {v3}, Lz/u0$k;->f()Landroid/util/Size;

    move-result-object v3

    if-eqz v3, :cond_0

    new-instance v2, Landroid/util/Rational;

    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    move-result v4

    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    move-result v3

    invoke-direct {v2, v4, v3}, Landroid/util/Rational;-><init>(II)V

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Use cases ["

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-static {v3, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] now ATTACHED"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz/u0;->a0(Ljava/lang/String;)V

    if-eqz v0, :cond_3

    iget-object p1, p0, Lz/u0;->h:Lz/y;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lz/y;->k0(Z)V

    iget-object p1, p0, Lz/u0;->h:Lz/y;

    invoke-virtual {p1}, Lz/y;->Y()V

    :cond_3
    invoke-virtual {p0}, Lz/u0;->T()V

    invoke-virtual {p0}, Lz/u0;->P0()V

    invoke-virtual {p0}, Lz/u0;->O0()V

    invoke-virtual {p0}, Lz/u0;->N0()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lz/u0;->B0(Z)V

    iget-object p1, p0, Lz/u0;->e:Lz/u0$i;

    sget-object v0, Lz/u0$i;->j:Lz/u0$i;

    if-ne p1, v0, :cond_4

    invoke-virtual {p0}, Lz/u0;->v0()V

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lz/u0;->w0()V

    :goto_1
    if-eqz v2, :cond_5

    iget-object p1, p0, Lz/u0;->h:Lz/y;

    invoke-virtual {p1, v2}, Lz/y;->n0(Landroid/util/Rational;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public final K0(Ljava/util/Collection;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lz/u0$k;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    move v2, v1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz/u0$k;

    iget-object v4, p0, Lz/u0;->a:Ln0/h4;

    invoke-virtual {v3}, Lz/u0$k;->h()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ln0/h4;->o(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lz/u0;->a:Ln0/h4;

    invoke-virtual {v3}, Lz/u0$k;->h()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ln0/h4;->p(Ljava/lang/String;)V

    invoke-virtual {v3}, Lz/u0$k;->h()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Lz/u0$k;->i()Ljava/lang/Class;

    move-result-object v3

    const-class v4, Lg0/a2;

    if-ne v3, v4, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    goto/16 :goto_2

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Use cases ["

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-static {v3, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "] now DETACHED for camera"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz/u0;->a0(Ljava/lang/String;)V

    if-eqz v2, :cond_3

    iget-object p1, p0, Lz/u0;->h:Lz/y;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lz/y;->n0(Landroid/util/Rational;)V

    :cond_3
    invoke-virtual {p0}, Lz/u0;->T()V

    iget-object p1, p0, Lz/u0;->a:Ln0/h4;

    invoke-virtual {p1}, Ln0/h4;->i()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lz/u0;->h:Lz/y;

    invoke-virtual {p1, v1}, Lz/y;->p0(Z)V

    iget-object p1, p0, Lz/u0;->h:Lz/y;

    invoke-virtual {p1, v1}, Lz/y;->m0(Z)V

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lz/u0;->P0()V

    invoke-virtual {p0}, Lz/u0;->O0()V

    :goto_1
    iget-object p1, p0, Lz/u0;->a:Ln0/h4;

    invoke-virtual {p1}, Ln0/h4;->h()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lz/u0;->h:Lz/y;

    invoke-virtual {p1}, Lz/y;->D()V

    invoke-virtual {p0, v1}, Lz/u0;->B0(Z)V

    iget-object p1, p0, Lz/u0;->h:Lz/y;

    invoke-virtual {p1, v1}, Lz/y;->k0(Z)V

    invoke-virtual {p0}, Lz/u0;->q0()Lz/l3;

    move-result-object p1

    iput-object p1, p0, Lz/u0;->m:Lz/l3;

    invoke-virtual {p0}, Lz/u0;->W()V

    return-void

    :cond_5
    invoke-virtual {p0}, Lz/u0;->N0()V

    invoke-virtual {p0, v1}, Lz/u0;->B0(Z)V

    iget-object p1, p0, Lz/u0;->e:Lz/u0$i;

    sget-object v0, Lz/u0$i;->j:Lz/u0$i;

    if-ne p1, v0, :cond_6

    invoke-virtual {p0}, Lz/u0;->v0()V

    :cond_6
    :goto_2
    return-void
.end method

.method public L0(Z)V
    .locals 1

    const-string v0, "Attempting to force open the camera."

    invoke-virtual {p0, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    iget-object v0, p0, Lz/u0;->v:Ln0/g1;

    invoke-virtual {v0, p0}, Ln0/g1;->i(Lg0/l;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "No cameras available. Waiting for available camera before opening camera."

    invoke-virtual {p0, p1}, Lz/u0;->a0(Ljava/lang/String;)V

    sget-object p1, Lz/u0$i;->d:Lz/u0$i;

    invoke-virtual {p0, p1}, Lz/u0;->D0(Lz/u0$i;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lz/u0;->u0(Z)V

    return-void
.end method

.method public M0(Z)V
    .locals 1

    const-string v0, "Attempting to open the camera."

    invoke-virtual {p0, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    iget-object v0, p0, Lz/u0;->s:Lz/u0$e;

    invoke-virtual {v0}, Lz/u0$e;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz/u0;->v:Ln0/g1;

    invoke-virtual {v0, p0}, Ln0/g1;->i(Lg0/l;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lz/u0;->u0(Z)V

    return-void

    :cond_0
    const-string p1, "No cameras available. Waiting for available camera before opening camera."

    invoke-virtual {p0, p1}, Lz/u0;->a0(Ljava/lang/String;)V

    sget-object p1, Lz/u0$i;->d:Lz/u0$i;

    invoke-virtual {p0, p1}, Lz/u0;->D0(Lz/u0$i;)V

    return-void
.end method

.method public N0()V
    .locals 3

    iget-object v0, p0, Lz/u0;->a:Ln0/h4;

    invoke-virtual {v0}, Ln0/h4;->e()Ln0/o3$h;

    move-result-object v0

    invoke-virtual {v0}, Ln0/o3$h;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ln0/o3$h;->c()Ln0/o3;

    move-result-object v1

    iget-object v2, p0, Lz/u0;->h:Lz/y;

    invoke-virtual {v1}, Ln0/o3;->q()I

    move-result v1

    invoke-virtual {v2, v1}, Lz/y;->o0(I)V

    iget-object v1, p0, Lz/u0;->h:Lz/y;

    invoke-virtual {v1}, Lz/y;->O()Ln0/o3;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln0/o3$h;->b(Ln0/o3;)V

    invoke-virtual {v0}, Ln0/o3$h;->c()Ln0/o3;

    move-result-object v0

    iget-object v1, p0, Lz/u0;->m:Lz/l3;

    invoke-interface {v1, v0}, Lz/l3;->d(Ln0/o3;)V

    return-void

    :cond_0
    iget-object v0, p0, Lz/u0;->h:Lz/y;

    invoke-virtual {v0}, Lz/y;->j0()V

    iget-object v0, p0, Lz/u0;->m:Lz/l3;

    iget-object v1, p0, Lz/u0;->h:Lz/y;

    invoke-virtual {v1}, Lz/y;->O()Ln0/o3;

    move-result-object v1

    invoke-interface {v0, v1}, Lz/l3;->d(Ln0/o3;)V

    return-void
.end method

.method public final O0()V
    .locals 2

    iget-object v0, p0, Lz/u0;->j:Lz/z0;

    invoke-virtual {v0}, Lz/z0;->F()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz/u0;->a:Ln0/h4;

    invoke-virtual {v0}, Ln0/h4;->e()Ln0/o3$h;

    move-result-object v0

    invoke-virtual {v0}, Ln0/o3$h;->g()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ln0/o3$h;->c()Ln0/o3;

    move-result-object v0

    invoke-virtual {v0}, Ln0/o3;->e()Landroid/util/Range;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x1e

    if-le v0, v1, :cond_1

    iget-object v0, p0, Lz/u0;->h:Lz/y;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lz/y;->m0(Z)V

    return-void

    :cond_1
    iget-object v0, p0, Lz/u0;->h:Lz/y;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lz/y;->m0(Z)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final P0()V
    .locals 4

    iget-object v0, p0, Lz/u0;->a:Ln0/h4;

    invoke-virtual {v0}, Ln0/h4;->i()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln0/i4;

    invoke-interface {v3, v1}, Ln0/i4;->T(Z)Z

    move-result v3

    or-int/2addr v2, v3

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz/u0;->h:Lz/y;

    invoke-virtual {v0, v2}, Lz/y;->p0(Z)V

    return-void
.end method

.method public final S()V
    .locals 7

    iget-object v0, p0, Lz/u0;->C:Lz/t4;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lz/u0;->h0(Lz/t4;)Ljava/lang/String;

    move-result-object v2

    iget-object v1, p0, Lz/u0;->a:Ln0/h4;

    iget-object v0, p0, Lz/u0;->C:Lz/t4;

    invoke-virtual {v0}, Lz/t4;->h()Ln0/o3;

    move-result-object v3

    iget-object v0, p0, Lz/u0;->C:Lz/t4;

    invoke-virtual {v0}, Lz/t4;->i()Ln0/i4;

    move-result-object v4

    sget-object v0, Ln0/j4$b;->f:Ln0/j4$b;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const/4 v5, 0x0

    invoke-virtual/range {v1 .. v6}, Ln0/h4;->r(Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V

    iget-object v1, p0, Lz/u0;->a:Ln0/h4;

    iget-object v3, p0, Lz/u0;->C:Lz/t4;

    invoke-virtual {v3}, Lz/t4;->h()Ln0/o3;

    move-result-object v3

    iget-object v4, p0, Lz/u0;->C:Lz/t4;

    invoke-virtual {v4}, Lz/t4;->i()Ln0/i4;

    move-result-object v4

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-virtual/range {v1 .. v6}, Ln0/h4;->q(Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public final T()V
    .locals 6

    iget-object v0, p0, Lz/u0;->a:Ln0/h4;

    invoke-virtual {v0}, Ln0/h4;->g()Ln0/o3$h;

    move-result-object v0

    invoke-virtual {v0}, Ln0/o3$h;->c()Ln0/o3;

    move-result-object v0

    invoke-virtual {v0}, Ln0/o3;->l()Ln0/l1;

    move-result-object v1

    invoke-virtual {v1}, Ln0/l1;->i()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0}, Ln0/o3;->p()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p0}, Lz/u0;->l0()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-ne v1, v4, :cond_1

    if-ne v0, v4, :cond_0

    goto :goto_0

    :cond_0
    move v0, v3

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v4

    :goto_1
    if-nez v0, :cond_2

    iget-object v1, p0, Lz/u0;->C:Lz/t4;

    invoke-virtual {p0, v1}, Lz/u0;->n0(Lz/t4;)Z

    move-result v1

    if-eqz v1, :cond_6

    :cond_2
    invoke-virtual {p0}, Lz/u0;->A0()V

    if-nez v0, :cond_6

    goto :goto_2

    :cond_3
    if-nez v1, :cond_6

    if-lez v0, :cond_6

    iget-object v0, p0, Lz/u0;->C:Lz/t4;

    if-nez v0, :cond_4

    new-instance v0, Lz/t4;

    iget-object v1, p0, Lz/u0;->j:Lz/z0;

    invoke-virtual {v1}, Lz/z0;->C()La0/c0;

    move-result-object v1

    iget-object v2, p0, Lz/u0;->K:Lz/q3;

    new-instance v5, Lz/l0;

    invoke-direct {v5, p0}, Lz/l0;-><init>(Lz/u0;)V

    invoke-direct {v0, v1, v2, v5}, Lz/t4;-><init>(La0/c0;Lz/q3;Lz/t4$c;)V

    iput-object v0, p0, Lz/u0;->C:Lz/t4;

    :cond_4
    iget-object v0, p0, Lz/u0;->C:Lz/t4;

    invoke-virtual {p0, v0}, Lz/u0;->n0(Lz/t4;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lz/u0;->S()V

    :cond_6
    move v3, v4

    :goto_2
    iget-object v0, p0, Lz/u0;->h:Lz/y;

    invoke-virtual {v0, v3}, Lz/y;->l0(Z)V

    if-nez v3, :cond_7

    const-string v0, "Camera2CameraImpl"

    const-string v1, "The repeating surface is missing, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly."

    invoke-static {v0, v1}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    return-void
.end method

.method public final U(Ln0/l1$a;)Z
    .locals 6

    invoke-virtual {p1}, Ln0/l1$a;->m()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "Camera2CameraImpl"

    if-nez v0, :cond_0

    const-string p1, "The capture config builder already has surface inside."

    invoke-static {v2, p1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_0
    iget-object v0, p0, Lz/u0;->a:Ln0/h4;

    invoke-virtual {v0}, Ln0/h4;->f()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln0/o3;

    invoke-virtual {v3}, Ln0/o3;->l()Ln0/l1;

    move-result-object v3

    invoke-virtual {v3}, Ln0/l1;->i()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v3}, Ln0/l1;->h()I

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v3}, Ln0/l1;->h()I

    move-result v5

    invoke-virtual {p1, v5}, Ln0/l1$a;->u(I)V

    :cond_2
    invoke-virtual {v3}, Ln0/l1;->l()I

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v3}, Ln0/l1;->l()I

    move-result v3

    invoke-virtual {p1, v3}, Ln0/l1$a;->x(I)V

    :cond_3
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln0/u1;

    invoke-virtual {p1, v4}, Ln0/l1$a;->f(Ln0/u1;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Ln0/l1$a;->m()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    const-string p1, "Unable to find a repeating surface to attach to CaptureConfig"

    invoke-static {v2, p1}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_5
    const/4 p1, 0x1

    return p1
.end method

.method public V(Z)V
    .locals 3

    iget-object v0, p0, Lz/u0;->e:Lz/u0$i;

    sget-object v1, Lz/u0$i;->f:Lz/u0$i;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lz/u0;->e:Lz/u0$i;

    sget-object v1, Lz/u0$i;->b:Lz/u0$i;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lz/u0;->e:Lz/u0$i;

    sget-object v1, Lz/u0$i;->h:Lz/u0$i;

    if-ne v0, v1, :cond_0

    iget v0, p0, Lz/u0;->l:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " (error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lz/u0;->l:I

    invoke-static {v2}, Lz/u0;->g0(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    invoke-virtual {p0, p1}, Lz/u0;->B0(Z)V

    iget-object p1, p0, Lz/u0;->m:Lz/l3;

    invoke-interface {p1}, Lz/l3;->e()V

    return-void
.end method

.method public final W()V
    .locals 3

    const-string v0, "Closing camera."

    invoke-virtual {p0, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    iget-object v0, p0, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "close() ignored due to being in state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    return-void

    :pswitch_1
    sget-object v0, Lz/u0$i;->f:Lz/u0$i;

    invoke-virtual {p0, v0}, Lz/u0;->D0(Lz/u0$i;)V

    invoke-virtual {p0, v2}, Lz/u0;->V(Z)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lz/u0;->i:Lz/u0$j;

    invoke-virtual {v0}, Lz/u0$j;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lz/u0;->O:Lz/u0$h;

    invoke-virtual {v0}, Lz/u0$h;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :cond_1
    :goto_0
    iget-object v0, p0, Lz/u0;->O:Lz/u0$h;

    invoke-virtual {v0}, Lz/u0$h;->a()V

    sget-object v0, Lz/u0$i;->f:Lz/u0$i;

    invoke-virtual {p0, v0}, Lz/u0;->D0(Lz/u0$i;)V

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lz/u0;->o0()Z

    move-result v0

    invoke-static {v0}, Lx2/g;->i(Z)V

    invoke-virtual {p0}, Lz/u0;->Y()V

    :cond_2
    return-void

    :pswitch_3
    iget-object v0, p0, Lz/u0;->k:Landroid/hardware/camera2/CameraDevice;

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    move v1, v2

    :goto_1
    invoke-static {v1}, Lx2/g;->i(Z)V

    sget-object v0, Lz/u0$i;->c:Lz/u0$i;

    invoke-virtual {p0, v0}, Lz/u0;->D0(Lz/u0$i;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public final X(Landroid/hardware/camera2/CameraDevice;)Lne/x;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/camera2/CameraDevice;",
            ")",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lz/k3;

    iget-object v1, p0, Lz/u0;->M:Lb0/e;

    invoke-direct {v0, v1}, Lz/k3;-><init>(Lb0/e;)V

    new-instance v1, Landroid/graphics/SurfaceTexture;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    const/16 v2, 0x280

    const/16 v3, 0x1e0

    invoke-virtual {v1, v2, v3}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    new-instance v2, Landroid/view/Surface;

    invoke-direct {v2, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    new-instance v3, Ln0/k2;

    invoke-direct {v3, v2}, Ln0/k2;-><init>(Landroid/view/Surface;)V

    invoke-virtual {v3}, Ln0/u1;->k()Lne/x;

    move-result-object v4

    new-instance v5, Lz/p0;

    invoke-direct {v5, v2, v1}, Lz/p0;-><init>(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-interface {v4, v5, v1}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    new-instance v1, Ln0/o3$b;

    invoke-direct {v1}, Ln0/o3$b;-><init>()V

    invoke-virtual {v1, v3}, Ln0/o3$b;->h(Ln0/u1;)Ln0/o3$b;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ln0/o3$b;->B(I)Ln0/o3$b;

    const-string v2, "Start configAndClose."

    invoke-virtual {p0, v2}, Lz/u0;->a0(Ljava/lang/String;)V

    invoke-virtual {v1}, Ln0/o3$b;->p()Ln0/o3;

    move-result-object v1

    iget-object v2, p0, Lz/u0;->E:Lz/h5$b;

    invoke-virtual {v2}, Lz/h5$b;->a()Lz/h5$a;

    move-result-object v2

    invoke-virtual {v0, v1, p1, v2}, Lz/k3;->a(Ln0/o3;Landroid/hardware/camera2/CameraDevice;Lz/h5$a;)Lne/x;

    move-result-object p1

    invoke-static {p1}, Lr0/n;->z(Lne/x;)Lne/x;

    move-result-object p1

    invoke-static {p1}, Lr0/d;->c(Lne/x;)Lr0/d;

    move-result-object p1

    new-instance v1, Lz/q0;

    invoke-direct {v1, v0, v3}, Lz/q0;-><init>(Lz/k3;Ln0/u1;)V

    iget-object v0, p0, Lz/u0;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, v1, v0}, Lr0/d;->g(Lr0/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object p1

    return-object p1
.end method

.method public final Y()V
    .locals 4

    iget-object v0, p0, Lz/u0;->e:Lz/u0$i;

    sget-object v1, Lz/u0$i;->b:Lz/u0$i;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lz/u0;->e:Lz/u0$i;

    sget-object v1, Lz/u0$i;->f:Lz/u0$i;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v3

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    :goto_1
    invoke-static {v0}, Lx2/g;->i(Z)V

    iget-object v0, p0, Lz/u0;->q:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    invoke-static {v0}, Lx2/g;->i(Z)V

    iget-boolean v0, p0, Lz/u0;->z:Z

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lz/u0;->d0()V

    return-void

    :cond_2
    iget-boolean v0, p0, Lz/u0;->A:Z

    if-eqz v0, :cond_3

    const-string v0, "Ignored since configAndClose is processing"

    invoke-virtual {p0, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    return-void

    :cond_3
    iget-object v0, p0, Lz/u0;->s:Lz/u0$e;

    invoke-virtual {v0}, Lz/u0$e;->b()Z

    move-result v0

    if-nez v0, :cond_4

    iput-boolean v3, p0, Lz/u0;->z:Z

    invoke-virtual {p0}, Lz/u0;->d0()V

    const-string v0, "Ignore configAndClose and finish the close flow directly since camera is unavailable."

    invoke-virtual {p0, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    return-void

    :cond_4
    const-string v0, "Open camera to configAndClose"

    invoke-virtual {p0, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    invoke-virtual {p0}, Lz/u0;->t0()Lne/x;

    move-result-object v0

    iput-boolean v2, p0, Lz/u0;->A:Z

    new-instance v1, Lz/s0;

    invoke-direct {v1, p0}, Lz/s0;-><init>(Lz/u0;)V

    iget-object v2, p0, Lz/u0;->c:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1, v2}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final Z()Landroid/hardware/camera2/CameraDevice$StateCallback;
    .locals 2

    iget-object v0, p0, Lz/u0;->a:Ln0/h4;

    invoke-virtual {v0}, Ln0/h4;->g()Ln0/o3$h;

    move-result-object v0

    invoke-virtual {v0}, Ln0/o3$h;->c()Ln0/o3;

    move-result-object v0

    invoke-virtual {v0}, Ln0/o3;->c()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v0, p0, Lz/u0;->D:Lz/o3;

    invoke-virtual {v0}, Lz/o3;->c()Landroid/hardware/camera2/CameraDevice$StateCallback;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lz/u0;->i:Lz/u0$j;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, Lz/w2;->a(Ljava/util/List;)Landroid/hardware/camera2/CameraDevice$StateCallback;

    move-result-object v0

    return-object v0
.end method

.method public a()Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lz/f0;

    invoke-direct {v0, p0}, Lz/f0;-><init>(Lz/u0;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object v0

    return-object v0
.end method

.method public a0(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lz/u0;->b0(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public b()Ln0/a3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln0/a3<",
            "Ln0/p0$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz/u0;->f:Ln0/u2;

    return-object v0
.end method

.method public final b0(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    invoke-virtual {p0}, Lz/u0;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "{%s} %s"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Camera2CameraImpl"

    invoke-static {v0, p1, p2}, Lg0/r1;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public c0(Ln0/u1;)Ln0/o3;
    .locals 3

    iget-object v0, p0, Lz/u0;->a:Ln0/h4;

    invoke-virtual {v0}, Ln0/h4;->h()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/o3;

    invoke-virtual {v1}, Ln0/o3;->p()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public d0()V
    .locals 3

    iget-object v0, p0, Lz/u0;->e:Lz/u0$i;

    sget-object v1, Lz/u0$i;->b:Lz/u0$i;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lz/u0;->e:Lz/u0$i;

    sget-object v1, Lz/u0$i;->f:Lz/u0$i;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Lx2/g;->i(Z)V

    iget-object v0, p0, Lz/u0;->q:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    invoke-static {v0}, Lx2/g;->i(Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Lz/u0;->k:Landroid/hardware/camera2/CameraDevice;

    iget-object v1, p0, Lz/u0;->e:Lz/u0$i;

    sget-object v2, Lz/u0$i;->f:Lz/u0$i;

    if-ne v1, v2, :cond_2

    sget-object v0, Lz/u0$i;->c:Lz/u0$i;

    invoke-virtual {p0, v0}, Lz/u0;->D0(Lz/u0$i;)V

    return-void

    :cond_2
    iget-object v1, p0, Lz/u0;->b:La0/p0;

    iget-object v2, p0, Lz/u0;->s:Lz/u0$e;

    invoke-virtual {v1, v2}, La0/p0;->h(Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V

    sget-object v1, Lz/u0$i;->a:Lz/u0$i;

    invoke-virtual {p0, v1}, Lz/u0;->D0(Lz/u0$i;)V

    iget-object v1, p0, Lz/u0;->p:Ly1/c$a;

    if-eqz v1, :cond_3

    invoke-virtual {v1, v0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    iput-object v0, p0, Lz/u0;->p:Ly1/c$a;

    :cond_3
    return-void
.end method

.method public e()Ln0/l0;
    .locals 1

    iget-object v0, p0, Lz/u0;->h:Lz/y;

    return-object v0
.end method

.method public final e0()I
    .locals 3

    iget-object v0, p0, Lz/u0;->H:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz/u0;->u:Lh0/a;

    invoke-interface {v1}, Lh0/a;->e()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public f()Ln0/h0;
    .locals 1

    iget-object v0, p0, Lz/u0;->G:Ln0/h0;

    return-object v0
.end method

.method public g(Lg0/w2;)V
    .locals 7

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lz/u0;->j0(Lg0/w2;)Ljava/lang/String;

    move-result-object v2

    iget-boolean v0, p0, Lz/u0;->B:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lg0/w2;->z()Ln0/o3;

    move-result-object v0

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lg0/w2;->x()Ln0/o3;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-virtual {p1}, Lg0/w2;->l()Ln0/i4;

    move-result-object v4

    invoke-virtual {p1}, Lg0/w2;->g()Ln0/t3;

    move-result-object v5

    invoke-static {p1}, Lz/u0;->f0(Lg0/w2;)Ljava/util/List;

    move-result-object v6

    iget-object p1, p0, Lz/u0;->c:Ljava/util/concurrent/Executor;

    new-instance v0, Lz/c0;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lz/c0;-><init>(Lz/u0;Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public h(Z)V
    .locals 2

    iget-object v0, p0, Lz/u0;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lz/j0;

    invoke-direct {v1, p0, p1}, Lz/j0;-><init>(Lz/u0;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public i(Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lz/u0;->h:Lz/y;

    invoke-virtual {p1}, Lz/y;->Y()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, p1}, Lz/u0;->r0(Ljava/util/List;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Lz/u0;->H0(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :try_start_0
    iget-object v0, p0, Lz/u0;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lz/t0;

    invoke-direct {v1, p0, p1}, Lz/t0;-><init>(Lz/u0;Ljava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Unable to attach use cases."

    invoke-virtual {p0, v0, p1}, Lz/u0;->b0(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lz/u0;->h:Lz/y;

    invoke-virtual {p1}, Lz/y;->D()V

    return-void
.end method

.method public final i0()Lne/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz/u0;->o:Lne/x;

    if-nez v0, :cond_1

    iget-object v0, p0, Lz/u0;->e:Lz/u0$i;

    sget-object v1, Lz/u0$i;->a:Lz/u0$i;

    if-eq v0, v1, :cond_0

    new-instance v0, Lz/n0;

    invoke-direct {v0, p0}, Lz/n0;-><init>(Lz/u0;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object v0

    iput-object v0, p0, Lz/u0;->o:Lne/x;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lr0/n;->p(Ljava/lang/Object;)Lne/x;

    move-result-object v0

    iput-object v0, p0, Lz/u0;->o:Lne/x;

    :cond_1
    :goto_0
    iget-object v0, p0, Lz/u0;->o:Lne/x;

    return-object v0
.end method

.method public j(Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Lz/u0;->H0(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v1}, Lz/u0;->s0(Ljava/util/List;)V

    iget-object v0, p0, Lz/u0;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lz/h0;

    invoke-direct {v1, p0, p1}, Lz/h0;-><init>(Lz/u0;Ljava/util/List;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public k()Ln0/o0;
    .locals 1

    iget-object v0, p0, Lz/u0;->j:Lz/z0;

    return-object v0
.end method

.method public k0()Z
    .locals 3

    :try_start_0
    new-instance v0, Lz/o0;

    invoke-direct {v0, p0}, Lz/o0;-><init>(Lz/u0;)V

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

    const-string v2, "Unable to check if MeteringRepeating is attached."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final l0()Z
    .locals 2

    iget-object v0, p0, Lz/u0;->C:Lz/t4;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {v0}, Lz/u0;->h0(Lz/t4;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lz/u0;->a:Ln0/h4;

    invoke-virtual {v1, v0}, Ln0/h4;->o(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public m(Lg0/w2;)V
    .locals 2

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lz/u0;->j0(Lg0/w2;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lz/u0;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lz/d0;

    invoke-direct {v1, p0, p1}, Lz/d0;-><init>(Lz/u0;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final m0()Z
    .locals 1

    iget-object v0, p0, Lz/u0;->w:Lg0/g0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg0/g0;->r0()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public n(Lg0/w2;)V
    .locals 7

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, p0, Lz/u0;->B:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lg0/w2;->z()Ln0/o3;

    move-result-object v0

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lg0/w2;->x()Ln0/o3;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-virtual {p1}, Lg0/w2;->l()Ln0/i4;

    move-result-object v4

    invoke-virtual {p1}, Lg0/w2;->g()Ln0/t3;

    move-result-object v5

    invoke-static {p1}, Lz/u0;->f0(Lg0/w2;)Ljava/util/List;

    move-result-object v6

    invoke-static {p1}, Lz/u0;->j0(Lg0/w2;)Ljava/lang/String;

    move-result-object v2

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lz/u0;->C0(Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V

    return-void
.end method

.method public final n0(Lz/t4;)Z
    .locals 0

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lz/u0;->p0(Lz/t4;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lz/u0;->m0()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public o(Ln0/h0;)V
    .locals 1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ln0/k0;->a()Ln0/h0;

    move-result-object p1

    :goto_0
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ln0/h0;->w(Ln0/q3;)Ln0/q3;

    move-result-object v0

    iput-object p1, p0, Lz/u0;->G:Ln0/h0;

    iget-object p1, p0, Lz/u0;->H:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iput-object v0, p0, Lz/u0;->I:Ln0/q3;

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public o0()Z
    .locals 1

    iget-object v0, p0, Lz/u0;->q:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public p()V
    .locals 2

    iget-object v0, p0, Lz/u0;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lz/k0;

    invoke-direct {v1, p0}, Lz/k0;-><init>(Lz/u0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final p0(Lz/t4;)Z
    .locals 21

    move-object/from16 v1, p0

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Lz/u0;->e0()I

    move-result v3

    iget-object v0, v1, Lz/u0;->a:Ln0/h4;

    invoke-virtual {v0}, Ln0/h4;->j()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v10, 0x0

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/h4$b;

    invoke-virtual {v2}, Ln0/h4$b;->c()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v2}, Ln0/h4$b;->c()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Ln0/j4$b;->f:Ln0/j4$b;

    if-ne v5, v6, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ln0/h4$b;->e()Ln0/t3;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v2}, Ln0/h4$b;->c()Ljava/util/List;

    move-result-object v5

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ln0/h4$b;->d()Ln0/o3;

    move-result-object v5

    invoke-virtual {v2}, Ln0/h4$b;->f()Ln0/i4;

    move-result-object v6

    invoke-virtual {v5}, Ln0/o3;->p()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ln0/u1;

    iget-object v8, v1, Lz/u0;->N:Lz/g5;

    invoke-interface {v6}, Ln0/h2;->p()I

    move-result v9

    invoke-virtual {v7}, Ln0/u1;->h()Landroid/util/Size;

    move-result-object v10

    invoke-interface {v6}, Ln0/i4;->W()Ln0/u3;

    move-result-object v11

    invoke-virtual {v8, v3, v9, v10, v11}, Lz/g5;->a0(IILandroid/util/Size;Ln0/u3;)Ln0/w3;

    move-result-object v12

    invoke-interface {v6}, Ln0/h2;->p()I

    move-result v13

    invoke-virtual {v7}, Ln0/u1;->h()Landroid/util/Size;

    move-result-object v14

    invoke-virtual {v2}, Ln0/h4$b;->e()Ln0/t3;

    move-result-object v7

    invoke-virtual {v7}, Ln0/t3;->b()Lg0/k0;

    move-result-object v15

    invoke-virtual {v2}, Ln0/h4$b;->c()Ljava/util/List;

    move-result-object v16

    invoke-virtual {v2}, Ln0/h4$b;->e()Ln0/t3;

    move-result-object v7

    invoke-virtual {v7}, Ln0/t3;->d()Ln0/n1;

    move-result-object v17

    invoke-virtual {v2}, Ln0/h4$b;->e()Ln0/t3;

    move-result-object v7

    invoke-virtual {v7}, Ln0/t3;->g()I

    move-result v18

    invoke-virtual {v2}, Ln0/h4$b;->e()Ln0/t3;

    move-result-object v7

    invoke-virtual {v7}, Ln0/t3;->c()Landroid/util/Range;

    move-result-object v19

    invoke-interface {v6}, Ln0/i4;->H()Z

    move-result v20

    invoke-static/range {v12 .. v20}, Ln0/g;->a(Ln0/w3;ILandroid/util/Size;Lg0/k0;Ljava/util/List;Ln0/n1;ILandroid/util/Range;Z)Ln0/g;

    move-result-object v7

    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid stream spec or capture types in "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Camera2CameraImpl"

    invoke-static {v2, v0}, Lg0/r1;->l(Ljava/lang/String;Ljava/lang/String;)V

    return v10

    :cond_4
    invoke-static/range {p1 .. p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    invoke-virtual/range {p1 .. p1}, Lz/t4;->i()Ln0/i4;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lz/t4;->e()Landroid/util/Size;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v5, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v2, v1, Lz/u0;->N:Lz/g5;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v9}, Lz/g5;->K(ILjava/util/List;Ljava/util/Map;ZZZZ)Ln0/y3;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v0, "Surface combination with metering repeating supported!"

    invoke-virtual {v1, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v0

    const-string v2, "Surface combination with metering repeating  not supported!"

    invoke-virtual {v1, v2, v0}, Lz/u0;->b0(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v10
.end method

.method public final q0()Lz/l3;
    .locals 9

    iget-object v1, p0, Lz/u0;->H:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lz/u0;->w:Lg0/g0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    move-object v8, v0

    goto :goto_1

    :cond_0
    invoke-static {v0}, Lf0/j;->a(Lg0/g0;)Lf0/i;

    move-result-object v0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lz/u0;->I:Ln0/q3;

    if-nez v0, :cond_1

    new-instance v0, Lz/k3;

    iget-object v2, p0, Lz/u0;->M:Lb0/e;

    iget-object v3, p0, Lz/u0;->j:Lz/z0;

    invoke-virtual {v3}, Lz/z0;->l()Ln0/k3;

    move-result-object v3

    invoke-direct {v0, v2, v3, v8}, Lz/k3;-><init>(Lb0/e;Ln0/k3;Lf0/i;)V

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    new-instance v2, Lz/z4;

    iget-object v3, p0, Lz/u0;->I:Ln0/q3;

    iget-object v4, p0, Lz/u0;->j:Lz/z0;

    iget-object v5, p0, Lz/u0;->M:Lb0/e;

    iget-object v6, p0, Lz/u0;->c:Ljava/util/concurrent/Executor;

    iget-object v7, p0, Lz/u0;->d:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-direct/range {v2 .. v8}, Lz/z4;-><init>(Ln0/q3;Lz/z0;Lb0/e;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lf0/i;)V

    monitor-exit v1

    return-object v2

    :goto_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public r(Z)V
    .locals 0

    iput-boolean p1, p0, Lz/u0;->B:Z

    return-void
.end method

.method public final r0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lg0/w2;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/w2;

    invoke-static {v0}, Lz/u0;->j0(Lg0/w2;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lz/u0;->F:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lz/u0;->F:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lg0/w2;->R()V

    invoke-virtual {v0}, Lg0/w2;->P()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public s(Lg0/w2;)V
    .locals 7

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lz/u0;->j0(Lg0/w2;)Ljava/lang/String;

    move-result-object v2

    iget-boolean v0, p0, Lz/u0;->B:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lg0/w2;->z()Ln0/o3;

    move-result-object v0

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lg0/w2;->x()Ln0/o3;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-virtual {p1}, Lg0/w2;->l()Ln0/i4;

    move-result-object v4

    invoke-virtual {p1}, Lg0/w2;->g()Ln0/t3;

    move-result-object v5

    invoke-static {p1}, Lz/u0;->f0(Lg0/w2;)Ljava/util/List;

    move-result-object v6

    iget-object p1, p0, Lz/u0;->c:Ljava/util/concurrent/Executor;

    new-instance v0, Lz/e0;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lz/e0;-><init>(Lz/u0;Ljava/lang/String;Ln0/o3;Ln0/i4;Ln0/t3;Ljava/util/List;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final s0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lg0/w2;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/w2;

    invoke-static {v0}, Lz/u0;->j0(Lg0/w2;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lz/u0;->F:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lg0/w2;->S()V

    iget-object v0, p0, Lz/u0;->F:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final t0()Lne/x;
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lz/b0;

    invoke-direct {v0, p0}, Lz/b0;-><init>(Lz/u0;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lz/u0;->j:Lz/z0;

    invoke-virtual {v2}, Lz/z0;->e()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Camera@%x[id=%s]"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u0(Z)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const-string v0, "Unable to open camera due to "

    if-nez p1, :cond_0

    iget-object p1, p0, Lz/u0;->i:Lz/u0$j;

    invoke-virtual {p1}, Lz/u0$j;->d()V

    :cond_0
    iget-object p1, p0, Lz/u0;->i:Lz/u0$j;

    invoke-virtual {p1}, Lz/u0$j;->a()Z

    iget-object p1, p0, Lz/u0;->O:Lz/u0$h;

    invoke-virtual {p1}, Lz/u0$h;->a()V

    const-string p1, "Opening camera."

    invoke-virtual {p0, p1}, Lz/u0;->a0(Ljava/lang/String;)V

    sget-object p1, Lz/u0$i;->i:Lz/u0$i;

    invoke-virtual {p0, p1}, Lz/u0;->D0(Lz/u0$i;)V

    :try_start_0
    iget-object p1, p0, Lz/u0;->b:La0/p0;

    iget-object v1, p0, Lz/u0;->j:Lz/z0;

    invoke-virtual {v1}, Lz/z0;->e()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lz/u0;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {p0}, Lz/u0;->Z()Landroid/hardware/camera2/CameraDevice$StateCallback;

    move-result-object v3

    invoke-virtual {p1, v1, v2, v3}, La0/p0;->f(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V
    :try_end_0
    .catch La0/f; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_2

    :goto_0
    const-string v0, "Unexpected error occurred when opening camera."

    invoke-virtual {p0, v0, p1}, Lz/u0;->b0(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p1, Lz/u0$i;->e:Lz/u0$i;

    const/4 v0, 0x6

    invoke-static {v0}, Lg0/w$a;->a(I)Lg0/w$a;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lz/u0;->E0(Lz/u0$i;Lg0/w$a;)V

    goto :goto_3

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lz/u0;->a0(Ljava/lang/String;)V

    sget-object p1, Lz/u0$i;->h:Lz/u0$i;

    invoke-virtual {p0, p1}, Lz/u0;->D0(Lz/u0$i;)V

    iget-object p1, p0, Lz/u0;->i:Lz/u0$j;

    invoke-virtual {p1}, Lz/u0$j;->e()V

    goto :goto_3

    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    invoke-virtual {p1}, La0/f;->d()I

    move-result v0

    const/16 v1, 0x2711

    if-eq v0, v1, :cond_1

    iget-object p1, p0, Lz/u0;->O:Lz/u0$h;

    invoke-virtual {p1}, Lz/u0$h;->d()V

    goto :goto_3

    :cond_1
    sget-object v0, Lz/u0$i;->c:Lz/u0$i;

    const/4 v1, 0x7

    invoke-static {v1, p1}, Lg0/w$a;->b(ILjava/lang/Throwable;)Lg0/w$a;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lz/u0;->E0(Lz/u0$i;Lg0/w$a;)V

    :goto_3
    return-void
.end method

.method public v0()V
    .locals 5

    iget-object v0, p0, Lz/u0;->e:Lz/u0$i;

    sget-object v1, Lz/u0$i;->j:Lz/u0$i;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lx2/g;->i(Z)V

    iget-object v0, p0, Lz/u0;->a:Ln0/h4;

    invoke-virtual {v0}, Ln0/h4;->g()Ln0/o3$h;

    move-result-object v0

    invoke-virtual {v0}, Ln0/o3$h;->g()Z

    move-result v1

    if-nez v1, :cond_1

    const-string v0, "Unable to create capture session due to conflicting configurations"

    invoke-virtual {p0, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v1, p0, Lz/u0;->v:Ln0/g1;

    iget-object v2, p0, Lz/u0;->k:Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {v2}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lz/u0;->u:Lh0/a;

    iget-object v4, p0, Lz/u0;->k:Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {v4}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lh0/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ln0/g1;->j(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to create capture session in camera operating mode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz/u0;->u:Lh0/a;

    invoke-interface {v1}, Lh0/a;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    return-void

    :cond_2
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iget-object v2, p0, Lz/u0;->a:Ln0/h4;

    invoke-virtual {v2}, Ln0/h4;->h()Ljava/util/Collection;

    move-result-object v2

    iget-object v3, p0, Lz/u0;->a:Ln0/h4;

    invoke-virtual {v3}, Ln0/h4;->i()Ljava/util/Collection;

    move-result-object v3

    invoke-static {v2, v3, v1}, Lz/c5;->m(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Map;)V

    iget-object v2, p0, Lz/u0;->m:Lz/l3;

    invoke-interface {v2, v1}, Lz/l3;->i(Ljava/util/Map;)V

    iget-object v1, p0, Lz/u0;->m:Lz/l3;

    invoke-virtual {v0}, Ln0/o3$h;->c()Ln0/o3;

    move-result-object v0

    iget-object v2, p0, Lz/u0;->k:Landroid/hardware/camera2/CameraDevice;

    invoke-static {v2}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/camera2/CameraDevice;

    iget-object v3, p0, Lz/u0;->E:Lz/h5$b;

    invoke-virtual {v3}, Lz/h5$b;->a()Lz/h5$a;

    move-result-object v3

    invoke-interface {v1, v0, v2, v3}, Lz/l3;->a(Ln0/o3;Landroid/hardware/camera2/CameraDevice;Lz/h5$a;)Lne/x;

    move-result-object v0

    new-instance v2, Lz/u0$d;

    invoke-direct {v2, p0, v1}, Lz/u0$d;-><init>(Lz/u0;Lz/l3;)V

    iget-object v1, p0, Lz/u0;->c:Ljava/util/concurrent/Executor;

    invoke-static {v0, v2, v1}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final w0()V
    .locals 3

    iget-object v0, p0, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const/4 v1, 0x4

    if-eq v0, v1, :cond_3

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "open() ignored due to being in state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    return-void

    :cond_0
    sget-object v0, Lz/u0$i;->h:Lz/u0$i;

    invoke-virtual {p0, v0}, Lz/u0;->D0(Lz/u0$i;)V

    invoke-virtual {p0}, Lz/u0;->o0()Z

    move-result v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lz/u0;->A:Z

    if-nez v0, :cond_2

    iget v0, p0, Lz/u0;->l:I

    if-nez v0, :cond_2

    iget-object v0, p0, Lz/u0;->k:Landroid/hardware/camera2/CameraDevice;

    if-eqz v0, :cond_1

    const/4 v2, 0x1

    :cond_1
    const-string v0, "Camera Device should be open if session close is not complete"

    invoke-static {v2, v0}, Lx2/g;->j(ZLjava/lang/String;)V

    sget-object v0, Lz/u0$i;->j:Lz/u0$i;

    invoke-virtual {p0, v0}, Lz/u0;->D0(Lz/u0$i;)V

    invoke-virtual {p0}, Lz/u0;->v0()V

    :cond_2
    return-void

    :cond_3
    invoke-virtual {p0, v2}, Lz/u0;->L0(Z)V

    return-void
.end method

.method public x0(Ln0/o3;)V
    .locals 4

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-virtual {p1}, Ln0/o3;->d()Ln0/o3$d;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Ljava/lang/Throwable;

    invoke-direct {v2}, Ljava/lang/Throwable;-><init>()V

    const-string v3, "Posting surface closed"

    invoke-virtual {p0, v3, v2}, Lz/u0;->b0(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v2, Lz/g0;

    invoke-direct {v2, v1, p1}, Lz/g0;-><init>(Ln0/o3$d;Ln0/o3;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final y0()Lne/x;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lz/u0;->i0()Lne/x;

    move-result-object v0

    iget-object v1, p0, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "release() ignored due to being in state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lz/u0;->a0(Ljava/lang/String;)V

    return-object v0

    :pswitch_0
    sget-object v1, Lz/u0$i;->b:Lz/u0$i;

    invoke-virtual {p0, v1}, Lz/u0;->D0(Lz/u0$i;)V

    invoke-virtual {p0, v3}, Lz/u0;->V(Z)V

    return-object v0

    :pswitch_1
    iget-object v1, p0, Lz/u0;->k:Landroid/hardware/camera2/CameraDevice;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    invoke-static {v2}, Lx2/g;->i(Z)V

    sget-object v1, Lz/u0$i;->b:Lz/u0$i;

    invoke-virtual {p0, v1}, Lz/u0;->D0(Lz/u0$i;)V

    invoke-virtual {p0}, Lz/u0;->o0()Z

    move-result v1

    invoke-static {v1}, Lx2/g;->i(Z)V

    invoke-virtual {p0}, Lz/u0;->Y()V

    return-object v0

    :pswitch_2
    iget-object v1, p0, Lz/u0;->i:Lz/u0$j;

    invoke-virtual {v1}, Lz/u0$j;->a()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lz/u0;->O:Lz/u0$h;

    invoke-virtual {v1}, Lz/u0$h;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :cond_2
    :goto_1
    iget-object v1, p0, Lz/u0;->O:Lz/u0$h;

    invoke-virtual {v1}, Lz/u0$h;->a()V

    sget-object v1, Lz/u0$i;->b:Lz/u0$i;

    invoke-virtual {p0, v1}, Lz/u0;->D0(Lz/u0$i;)V

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lz/u0;->o0()Z

    move-result v1

    invoke-static {v1}, Lx2/g;->i(Z)V

    invoke-virtual {p0}, Lz/u0;->Y()V

    :cond_3
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public z0(Lz/l3;Z)Lne/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz/l3;",
            "Z)",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-interface {p1}, Lz/l3;->close()V

    invoke-interface {p1, p2}, Lz/l3;->f(Z)Lne/x;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Releasing session in state "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    iget-object v0, p0, Lz/u0;->q:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lz/u0$c;

    invoke-direct {v0, p0, p1}, Lz/u0$c;-><init>(Lz/u0;Lz/l3;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {p2, v0, p1}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    return-object p2
.end method
