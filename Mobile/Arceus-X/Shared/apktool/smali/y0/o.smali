.class public Ly0/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/r0;
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly0/o$a;
    }
.end annotation


# instance fields
.field public final a:Ly0/c;

.field public final b:Landroid/os/HandlerThread;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:Landroid/os/Handler;

.field public e:I

.field public f:Z

.field public final g:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lg0/j2;",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation
.end field

.field public i:Landroid/graphics/SurfaceTexture;

.field public j:Landroid/graphics/SurfaceTexture;


# direct methods
.method public constructor <init>(Lg0/k0;Lg0/i0;Lg0/i0;)V
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-direct {p0, p1, v0, p2, p3}, Ly0/o;-><init>(Lg0/k0;Ljava/util/Map;Lg0/i0;Lg0/i0;)V

    return-void
.end method

.method public constructor <init>(Lg0/k0;Ljava/util/Map;Lg0/i0;Lg0/i0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/k0;",
            "Ljava/util/Map<",
            "Lz0/d$e;",
            "Lx0/c0;",
            ">;",
            "Lg0/i0;",
            "Lg0/i0;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Ly0/o;->e:I

    .line 4
    iput-boolean v0, p0, Ly0/o;->f:Z

    .line 5
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Ly0/o;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ly0/o;->h:Ljava/util/Map;

    .line 7
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "CameraX-GL Thread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ly0/o;->b:Landroid/os/HandlerThread;

    .line 8
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 9
    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Ly0/o;->d:Landroid/os/Handler;

    .line 10
    invoke-static {v1}, Lq0/c;->f(Landroid/os/Handler;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Ly0/o;->c:Ljava/util/concurrent/Executor;

    .line 11
    new-instance v0, Ly0/c;

    invoke-direct {v0, p3, p4}, Ly0/c;-><init>(Lg0/i0;Lg0/i0;)V

    iput-object v0, p0, Ly0/o;->a:Ly0/c;

    .line 12
    :try_start_0
    invoke-direct {p0, p1, p2}, Ly0/o;->q(Lg0/k0;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p0}, Ly0/o;->a()V

    .line 14
    throw p1
.end method

.method public static synthetic e(Ly0/o;Ljava/lang/Runnable;Ljava/lang/Runnable;)V
    .locals 0

    iget-boolean p0, p0, Ly0/o;->f:Z

    if-eqz p0, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public static synthetic f()V
    .locals 0

    return-void
.end method

.method public static synthetic g(Ly0/o;Landroid/graphics/SurfaceTexture;Landroid/view/Surface;Lg0/v2$g;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->release()V

    invoke-virtual {p2}, Landroid/view/Surface;->release()V

    iget p1, p0, Ly0/o;->e:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ly0/o;->e:I

    invoke-direct {p0}, Ly0/o;->n()V

    return-void
.end method

.method public static synthetic h(Ly0/o;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ly0/o;->f:Z

    invoke-direct {p0}, Ly0/o;->n()V

    return-void
.end method

.method public static synthetic i(Ly0/o;Lg0/j2;Lg0/j2$b;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Lg0/j2;->close()V

    iget-object p2, p0, Ly0/o;->h:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/Surface;

    if-eqz p1, :cond_0

    iget-object p0, p0, Ly0/o;->a:Ly0/c;

    invoke-virtual {p0, p1}, Lx0/z;->r(Landroid/view/Surface;)V

    :cond_0
    return-void
.end method

.method public static synthetic j(Ly0/o;Lg0/j2;)V
    .locals 2

    iget-object v0, p0, Ly0/o;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Ly0/j;

    invoke-direct {v1, p0, p1}, Ly0/j;-><init>(Ly0/o;Lg0/j2;)V

    invoke-interface {p1, v0, v1}, Lg0/j2;->q2(Ljava/util/concurrent/Executor;Lx2/a;)Landroid/view/Surface;

    move-result-object v0

    iget-object v1, p0, Ly0/o;->a:Ly0/c;

    invoke-virtual {v1, v0}, Lx0/z;->j(Landroid/view/Surface;)V

    iget-object p0, p0, Ly0/o;->h:Ljava/util/Map;

    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic k(Ly0/o;Lg0/v2;)V
    .locals 4

    iget v0, p0, Ly0/o;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ly0/o;->e:I

    new-instance v0, Landroid/graphics/SurfaceTexture;

    iget-object v1, p0, Ly0/o;->a:Ly0/c;

    invoke-virtual {p1}, Lg0/v2;->u()Z

    move-result v2

    invoke-virtual {v1, v2}, Ly0/c;->t(Z)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    invoke-virtual {p1}, Lg0/v2;->q()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Lg0/v2;->q()Landroid/util/Size;

    move-result-object v2

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    new-instance v1, Landroid/view/Surface;

    invoke-direct {v1, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iget-object v2, p0, Ly0/o;->c:Ljava/util/concurrent/Executor;

    new-instance v3, Ly0/m;

    invoke-direct {v3, p0, v0, v1}, Ly0/m;-><init>(Ly0/o;Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V

    invoke-virtual {p1, v1, v2, v3}, Lg0/v2;->w(Landroid/view/Surface;Ljava/util/concurrent/Executor;Lx2/a;)V

    invoke-virtual {p1}, Lg0/v2;->u()Z

    move-result p1

    if-eqz p1, :cond_0

    iput-object v0, p0, Ly0/o;->i:Landroid/graphics/SurfaceTexture;

    return-void

    :cond_0
    iput-object v0, p0, Ly0/o;->j:Landroid/graphics/SurfaceTexture;

    iget-object p1, p0, Ly0/o;->d:Landroid/os/Handler;

    invoke-virtual {v0, p0, p1}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;Landroid/os/Handler;)V

    return-void
.end method

.method public static synthetic l(Ly0/o;Lg0/k0;Ljava/util/Map;Ly1/c$a;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object p0, p0, Ly0/o;->a:Ly0/c;

    invoke-virtual {p0, p1, p2}, Ly0/c;->h(Lg0/k0;Ljava/util/Map;)Lz0/e;

    const/4 p0, 0x0

    invoke-virtual {p3, p0}, Ly1/c$a;->c(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    invoke-virtual {p3, p0}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public static synthetic m(Ly0/o;Lg0/k0;Ljava/util/Map;Ly1/c$a;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ly0/i;

    invoke-direct {v0, p0, p1, p2, p3}, Ly0/i;-><init>(Ly0/o;Lg0/k0;Ljava/util/Map;Ly1/c$a;)V

    invoke-direct {p0, v0}, Ly0/o;->o(Ljava/lang/Runnable;)V

    const-string p0, "Init GlRenderer"

    return-object p0
.end method

.method private n()V
    .locals 2

    iget-boolean v0, p0, Ly0/o;->f:Z

    if-eqz v0, :cond_1

    iget v0, p0, Ly0/o;->e:I

    if-nez v0, :cond_1

    iget-object v0, p0, Ly0/o;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/j2;

    invoke-interface {v1}, Lg0/j2;->close()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ly0/o;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Ly0/o;->a:Ly0/c;

    invoke-virtual {v0}, Ly0/c;->k()V

    iget-object v0, p0, Ly0/o;->b:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    :cond_1
    return-void
.end method

.method private o(Ljava/lang/Runnable;)V
    .locals 1

    new-instance v0, Ly0/l;

    invoke-direct {v0}, Ly0/l;-><init>()V

    invoke-direct {p0, p1, v0}, Ly0/o;->p(Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    return-void
.end method

.method private p(Ljava/lang/Runnable;Ljava/lang/Runnable;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Ly0/o;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Ly0/k;

    invoke-direct {v1, p0, p2, p1}, Ly0/k;-><init>(Ly0/o;Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "DualSurfaceProcessor"

    const-string v1, "Unable to executor runnable"

    invoke-static {v0, v1, p1}, Lg0/r1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method private q(Lg0/k0;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/k0;",
            "Ljava/util/Map<",
            "Lz0/d$e;",
            "Lx0/c0;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ly0/g;

    invoke-direct {v0, p0, p1, p2}, Ly0/g;-><init>(Ly0/o;Lg0/k0;Ljava/util/Map;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    instance-of p2, p1, Ljava/util/concurrent/ExecutionException;

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    :cond_0
    instance-of p2, p1, Ljava/lang/RuntimeException;

    if-eqz p2, :cond_1

    check-cast p1, Ljava/lang/RuntimeException;

    throw p1

    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v0, "Failed to create DefaultSurfaceProcessor"

    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Ly0/o;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ly0/e;

    invoke-direct {v0, p0}, Ly0/e;-><init>(Ly0/o;)V

    invoke-direct {p0, v0}, Ly0/o;->o(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Lg0/v2;)V
    .locals 2

    iget-object v0, p0, Ly0/o;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lg0/v2;->z()Z

    return-void

    :cond_0
    new-instance v0, Ly0/f;

    invoke-direct {v0, p0, p1}, Ly0/f;-><init>(Ly0/o;Lg0/v2;)V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lx0/p;

    invoke-direct {v1, p1}, Lx0/p;-><init>(Lg0/v2;)V

    invoke-direct {p0, v0, v1}, Ly0/o;->p(Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    return-void
.end method

.method public d(Lg0/j2;)V
    .locals 2

    iget-object v0, p0, Ly0/o;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lg0/j2;->close()V

    return-void

    :cond_0
    new-instance v0, Ly0/h;

    invoke-direct {v0, p0, p1}, Ly0/h;-><init>(Ly0/o;Lg0/j2;)V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lx0/n;

    invoke-direct {v1, p1}, Lx0/n;-><init>(Lg0/j2;)V

    invoke-direct {p0, v0, v1}, Ly0/o;->p(Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    return-void
.end method

.method public onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 10

    iget-object v0, p0, Ly0/o;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Ly0/o;->i:Landroid/graphics/SurfaceTexture;

    if-eqz v0, :cond_3

    iget-object v1, p0, Ly0/o;->j:Landroid/graphics/SurfaceTexture;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    iget-object v0, p0, Ly0/o;->j:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    iget-object v0, p0, Ly0/o;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroid/view/Surface;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lg0/j2;

    invoke-interface {v7}, Lg0/j2;->getFormat()I

    move-result v0

    const/16 v2, 0x22

    if-ne v0, v2, :cond_2

    :try_start_0
    iget-object v3, p0, Ly0/o;->a:Ly0/c;

    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->getTimestamp()J

    move-result-wide v4

    iget-object v8, p0, Ly0/o;->i:Landroid/graphics/SurfaceTexture;

    iget-object v9, p0, Ly0/o;->j:Landroid/graphics/SurfaceTexture;

    invoke-virtual/range {v3 .. v9}, Ly0/c;->v(JLandroid/view/Surface;Lg0/j2;Landroid/graphics/SurfaceTexture;Landroid/graphics/SurfaceTexture;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "DualSurfaceProcessor"

    const-string v3, "Failed to render with OpenGL."

    invoke-static {v2, v3, v0}, Lg0/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method
