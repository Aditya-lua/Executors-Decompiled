.class public Lx0/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/r0;
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx0/t$b;,
        Lx0/t$a;
    }
.end annotation


# instance fields
.field public final a:Lx0/z;

.field public final b:Landroid/os/HandlerThread;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:Landroid/os/Handler;

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final f:[F

.field public final g:[F

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

.field public i:I

.field public j:Z

.field public final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lx0/t$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lg0/k0;)V
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-direct {p0, p1, v0}, Lx0/t;-><init>(Lg0/k0;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Lg0/k0;Ljava/util/Map;)V
    .locals 3
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

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lx0/t;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/16 v0, 0x10

    .line 4
    new-array v2, v0, [F

    iput-object v2, p0, Lx0/t;->f:[F

    .line 5
    new-array v0, v0, [F

    iput-object v0, p0, Lx0/t;->g:[F

    .line 6
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lx0/t;->h:Ljava/util/Map;

    .line 7
    iput v1, p0, Lx0/t;->i:I

    .line 8
    iput-boolean v1, p0, Lx0/t;->j:Z

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lx0/t;->k:Ljava/util/List;

    .line 10
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "CameraX-GL Thread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lx0/t;->b:Landroid/os/HandlerThread;

    .line 11
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 12
    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lx0/t;->d:Landroid/os/Handler;

    .line 13
    invoke-static {v1}, Lq0/c;->f(Landroid/os/Handler;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lx0/t;->c:Ljava/util/concurrent/Executor;

    .line 14
    new-instance v0, Lx0/z;

    invoke-direct {v0}, Lx0/z;-><init>()V

    iput-object v0, p0, Lx0/t;->a:Lx0/z;

    .line 15
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lx0/t;->w(Lg0/k0;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 16
    invoke-virtual {p0}, Lx0/t;->a()V

    .line 17
    throw p1
.end method

.method public static synthetic e(Lx0/t;Lx0/t$b;)V
    .locals 0

    iget-object p0, p0, Lx0/t;->k:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic f(Lx0/t;Lg0/v2;Landroid/graphics/SurfaceTexture;Landroid/view/Surface;Lg0/v2$g;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lg0/v2;->l()V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    invoke-virtual {p2}, Landroid/graphics/SurfaceTexture;->release()V

    invoke-virtual {p3}, Landroid/view/Surface;->release()V

    iget p1, p0, Lx0/t;->i:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lx0/t;->i:I

    invoke-virtual {p0}, Lx0/t;->r()V

    return-void
.end method

.method public static synthetic g(Lx0/t;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lx0/t;->j:Z

    invoke-virtual {p0}, Lx0/t;->r()V

    return-void
.end method

.method public static synthetic h(Lx0/t;Lg0/k0;Ljava/util/Map;Ly1/c$a;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object p0, p0, Lx0/t;->a:Lx0/z;

    invoke-virtual {p0, p1, p2}, Lx0/z;->h(Lg0/k0;Ljava/util/Map;)Lz0/e;

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

.method public static synthetic i(Lx0/t;IILy1/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, p2, p3}, Lx0/t$b;->d(IILy1/c$a;)Lx0/a;

    move-result-object p1

    new-instance p2, Lx0/j;

    invoke-direct {p2, p0, p1}, Lx0/j;-><init>(Lx0/t;Lx0/t$b;)V

    new-instance p1, Lx0/k;

    invoke-direct {p1, p3}, Lx0/k;-><init>(Ly1/c$a;)V

    invoke-virtual {p0, p2, p1}, Lx0/t;->t(Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    const-string p0, "DefaultSurfaceProcessor#snapshot"

    return-object p0
.end method

.method public static synthetic j(Lx0/t;Lg0/v2;Lg0/v2$h;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lz0/d$e;->b:Lz0/d$e;

    invoke-virtual {p1}, Lg0/v2;->o()Lg0/k0;

    move-result-object p1

    invoke-virtual {p1}, Lg0/k0;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Lg0/v2$h;->e()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object v0, Lz0/d$e;->c:Lz0/d$e;

    :cond_0
    iget-object p0, p0, Lx0/t;->a:Lx0/z;

    invoke-virtual {p0, v0}, Lx0/z;->o(Lz0/d$e;)V

    return-void
.end method

.method public static synthetic k(Lx0/t;Lg0/j2;)V
    .locals 2

    iget-object v0, p0, Lx0/t;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lx0/r;

    invoke-direct {v1, p0, p1}, Lx0/r;-><init>(Lx0/t;Lg0/j2;)V

    invoke-interface {p1, v0, v1}, Lg0/j2;->q2(Ljava/util/concurrent/Executor;Lx2/a;)Landroid/view/Surface;

    move-result-object v0

    iget-object v1, p0, Lx0/t;->a:Lx0/z;

    invoke-virtual {v1, v0}, Lx0/z;->j(Landroid/view/Surface;)V

    iget-object p0, p0, Lx0/t;->h:Ljava/util/Map;

    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic l(Lx0/t;Lg0/j2;Lg0/j2$b;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Lg0/j2;->close()V

    iget-object p2, p0, Lx0/t;->h:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/Surface;

    if-eqz p1, :cond_0

    iget-object p0, p0, Lx0/t;->a:Lx0/z;

    invoke-virtual {p0, p1}, Lx0/z;->r(Landroid/view/Surface;)V

    :cond_0
    return-void
.end method

.method public static synthetic m(Lx0/t;Lg0/k0;Ljava/util/Map;Ly1/c$a;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lx0/g;

    invoke-direct {v0, p0, p1, p2, p3}, Lx0/g;-><init>(Lx0/t;Lg0/k0;Ljava/util/Map;Ly1/c$a;)V

    invoke-virtual {p0, v0}, Lx0/t;->s(Ljava/lang/Runnable;)V

    const-string p0, "Init GlRenderer"

    return-object p0
.end method

.method public static synthetic n()V
    .locals 0

    return-void
.end method

.method public static synthetic o(Ly1/c$a;)V
    .locals 2

    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Failed to snapshot: OpenGLRenderer not ready."

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public static synthetic p(Lx0/t;Lg0/v2;)V
    .locals 4

    iget v0, p0, Lx0/t;->i:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lx0/t;->i:I

    new-instance v0, Landroid/graphics/SurfaceTexture;

    iget-object v1, p0, Lx0/t;->a:Lx0/z;

    invoke-virtual {v1}, Lx0/z;->g()I

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

    iget-object v2, p0, Lx0/t;->c:Ljava/util/concurrent/Executor;

    new-instance v3, Lx0/e;

    invoke-direct {v3, p0, p1}, Lx0/e;-><init>(Lx0/t;Lg0/v2;)V

    invoke-virtual {p1, v2, v3}, Lg0/v2;->x(Ljava/util/concurrent/Executor;Lg0/v2$i;)V

    iget-object v2, p0, Lx0/t;->c:Ljava/util/concurrent/Executor;

    new-instance v3, Lx0/f;

    invoke-direct {v3, p0, p1, v0, v1}, Lx0/f;-><init>(Lx0/t;Lg0/v2;Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V

    invoke-virtual {p1, v1, v2, v3}, Lg0/v2;->w(Landroid/view/Surface;Ljava/util/concurrent/Executor;Lx2/a;)V

    iget-object p1, p0, Lx0/t;->d:Landroid/os/Handler;

    invoke-virtual {v0, p0, p1}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;Landroid/os/Handler;)V

    return-void
.end method

.method public static synthetic q(Lx0/t;Ljava/lang/Runnable;Ljava/lang/Runnable;)V
    .locals 0

    iget-boolean p0, p0, Lx0/t;->j:Z

    if-eqz p0, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lx0/t;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lx0/q;

    invoke-direct {v0, p0}, Lx0/q;-><init>(Lx0/t;)V

    invoke-virtual {p0, v0}, Lx0/t;->s(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Lg0/v2;)V
    .locals 2

    iget-object v0, p0, Lx0/t;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lg0/v2;->z()Z

    return-void

    :cond_0
    new-instance v0, Lx0/o;

    invoke-direct {v0, p0, p1}, Lx0/o;-><init>(Lx0/t;Lg0/v2;)V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lx0/p;

    invoke-direct {v1, p1}, Lx0/p;-><init>(Lg0/v2;)V

    invoke-virtual {p0, v0, v1}, Lx0/t;->t(Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    return-void
.end method

.method public c(II)Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lx0/d;

    invoke-direct {v0, p0, p1, p2}, Lx0/d;-><init>(Lx0/t;II)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p1

    invoke-static {p1}, Lr0/n;->s(Lne/x;)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public d(Lg0/j2;)V
    .locals 2

    iget-object v0, p0, Lx0/t;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lg0/j2;->close()V

    return-void

    :cond_0
    new-instance v0, Lx0/m;

    invoke-direct {v0, p0, p1}, Lx0/m;-><init>(Lx0/t;Lg0/j2;)V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lx0/n;

    invoke-direct {v1, p1}, Lx0/n;-><init>(Lg0/j2;)V

    invoke-virtual {p0, v0, v1}, Lx0/t;->t(Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    return-void
.end method

.method public onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 9

    iget-object v0, p0, Lx0/t;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    iget-object v0, p0, Lx0/t;->f:[F

    invoke-virtual {p1, v0}, Landroid/graphics/SurfaceTexture;->getTransformMatrix([F)V

    iget-object v0, p0, Lx0/t;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/Surface;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg0/j2;

    iget-object v4, p0, Lx0/t;->g:[F

    iget-object v5, p0, Lx0/t;->f:[F

    invoke-interface {v2, v4, v5}, Lg0/j2;->N1([F[F)V

    invoke-interface {v2}, Lg0/j2;->getFormat()I

    move-result v4

    const/16 v5, 0x22

    if-ne v4, v5, :cond_1

    :try_start_0
    iget-object v2, p0, Lx0/t;->a:Lx0/z;

    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->getTimestamp()J

    move-result-wide v4

    iget-object v6, p0, Lx0/t;->g:[F

    invoke-virtual {v2, v4, v5, v6, v3}, Lx0/z;->n(J[FLandroid/view/Surface;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v3, "DefaultSurfaceProcessor"

    const-string v4, "Failed to render with OpenGL."

    invoke-static {v3, v4, v2}, Lg0/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Lg0/j2;->getFormat()I

    move-result v4

    const/16 v5, 0x100

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-ne v4, v5, :cond_2

    move v4, v7

    goto :goto_1

    :cond_2
    move v4, v6

    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Unsupported format: "

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Lg0/j2;->getFormat()I

    move-result v8

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lx2/g;->j(ZLjava/lang/String;)V

    if-nez v1, :cond_3

    move v6, v7

    :cond_3
    const-string v1, "Only one JPEG output is supported."

    invoke-static {v6, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    new-instance v1, Ljt/r;

    invoke-interface {v2}, Lg0/j2;->i()Landroid/util/Size;

    move-result-object v2

    iget-object v4, p0, Lx0/t;->g:[F

    invoke-virtual {v4}, [F->clone()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [F

    invoke-direct {v1, v3, v2, v4}, Ljt/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    :try_start_1
    invoke-virtual {p0, v1}, Lx0/t;->x(Ljt/r;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception p1

    invoke-virtual {p0, p1}, Lx0/t;->u(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method

.method public final r()V
    .locals 4

    iget-boolean v0, p0, Lx0/t;->j:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lx0/t;->i:I

    if-nez v0, :cond_2

    iget-object v0, p0, Lx0/t;->h:Ljava/util/Map;

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
    iget-object v0, p0, Lx0/t;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx0/t$b;

    invoke-virtual {v1}, Lx0/t$b;->a()Ly1/c$a;

    move-result-object v1

    new-instance v2, Ljava/lang/Exception;

    const-string v3, "Failed to snapshot: DefaultSurfaceProcessor is released."

    invoke-direct {v2, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lx0/t;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lx0/t;->a:Lx0/z;

    invoke-virtual {v0}, Lx0/z;->k()V

    iget-object v0, p0, Lx0/t;->b:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    :cond_2
    return-void
.end method

.method public final s(Ljava/lang/Runnable;)V
    .locals 1

    new-instance v0, Lx0/h;

    invoke-direct {v0}, Lx0/h;-><init>()V

    invoke-virtual {p0, p1, v0}, Lx0/t;->t(Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final t(Ljava/lang/Runnable;Ljava/lang/Runnable;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx0/t;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lx0/i;

    invoke-direct {v1, p0, p2, p1}, Lx0/i;-><init>(Lx0/t;Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "DefaultSurfaceProcessor"

    const-string v1, "Unable to executor runnable"

    invoke-static {v0, v1, p1}, Lg0/r1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public final u(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lx0/t;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx0/t$b;

    invoke-virtual {v1}, Lx0/t$b;->a()Ly1/c$a;

    move-result-object v1

    invoke-virtual {v1, p1}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lx0/t;->k:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final v(Landroid/util/Size;[FI)Landroid/graphics/Bitmap;
    .locals 2

    invoke-virtual {p2}, [F->clone()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [F

    int-to-float v0, p3

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {p2, v0, v1, v1}, Lp0/t;->c([FFFF)V

    invoke-static {p2, v1}, Lp0/t;->d([FF)V

    invoke-static {p1, p3}, Lp0/a0;->q(Landroid/util/Size;I)Landroid/util/Size;

    move-result-object p1

    iget-object p3, p0, Lx0/t;->a:Lx0/z;

    invoke-virtual {p3, p1, p2}, Lx0/z;->p(Landroid/util/Size;[F)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public final w(Lg0/k0;Ljava/util/Map;)V
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

    new-instance v0, Lx0/l;

    invoke-direct {v0, p0, p1, p2}, Lx0/l;-><init>(Lx0/t;Lg0/k0;Ljava/util/Map;)V

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

.method public final x(Ljt/r;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljt/r<",
            "Landroid/view/Surface;",
            "Landroid/util/Size;",
            "[F>;)V"
        }
    .end annotation

    iget-object v0, p0, Lx0/t;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    new-instance p1, Ljava/lang/Exception;

    const-string v0, "Failed to snapshot: no JPEG Surface."

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lx0/t;->u(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v1, p0, Lx0/t;->k:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    move v4, v2

    move v6, v4

    move-object v5, v3

    move-object v7, v5

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lx0/t$b;

    invoke-virtual {v8}, Lx0/t$b;->c()I

    move-result v9

    if-ne v4, v9, :cond_2

    if-nez v5, :cond_4

    :cond_2
    invoke-virtual {v8}, Lx0/t$b;->c()I

    move-result v4

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {p1}, Ljt/r;->e()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/util/Size;

    invoke-virtual {p1}, Ljt/r;->f()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [F

    invoke-virtual {p0, v5, v6, v4}, Lx0/t;->v(Landroid/util/Size;[FI)Landroid/graphics/Bitmap;

    move-result-object v5

    move v6, v2

    :cond_4
    invoke-virtual {v8}, Lx0/t$b;->b()I

    move-result v9

    if-eq v6, v9, :cond_5

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V

    invoke-virtual {v8}, Lx0/t$b;->b()I

    move-result v6

    sget-object v7, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v5, v7, v6, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v7

    :cond_5
    invoke-virtual {p1}, Ljt/r;->d()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/view/Surface;

    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v10, v7

    check-cast v10, [B

    invoke-static {v9, v10}, Landroidx/camera/core/ImageProcessingUtil;->q(Landroid/view/Surface;[B)Z

    invoke-virtual {v8}, Lx0/t$b;->a()Ly1/c$a;

    move-result-object v8

    invoke-virtual {v8, v3}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_6
    :try_start_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_4

    :goto_2
    :try_start_3
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :goto_4
    invoke-virtual {p0, p1}, Lx0/t;->u(Ljava/lang/Throwable;)V

    return-void
.end method
