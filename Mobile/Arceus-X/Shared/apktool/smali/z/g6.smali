.class public final Lz/g6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/g6$b;
    }
.end annotation


# instance fields
.field public final a:Lz/y;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lz/h6;

.field public final d:Landroidx/lifecycle/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/d0<",
            "Lg0/z2;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lz/g6$b;

.field public f:Z

.field public g:Lz/y$c;


# direct methods
.method public constructor <init>(Lz/y;La0/c0;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz/g6;->f:Z

    new-instance v0, Lz/g6$a;

    invoke-direct {v0, p0}, Lz/g6$a;-><init>(Lz/g6;)V

    iput-object v0, p0, Lz/g6;->g:Lz/y$c;

    iput-object p1, p0, Lz/g6;->a:Lz/y;

    iput-object p3, p0, Lz/g6;->b:Ljava/util/concurrent/Executor;

    invoke-static {p2}, Lz/g6;->f(La0/c0;)Lz/g6$b;

    move-result-object p2

    iput-object p2, p0, Lz/g6;->e:Lz/g6$b;

    new-instance p3, Lz/h6;

    invoke-interface {p2}, Lz/g6$b;->d()F

    move-result v0

    invoke-interface {p2}, Lz/g6$b;->b()F

    move-result p2

    invoke-direct {p3, v0, p2}, Lz/h6;-><init>(FF)V

    iput-object p3, p0, Lz/g6;->c:Lz/h6;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {p3, p2}, Lz/h6;->f(F)V

    new-instance p2, Landroidx/lifecycle/d0;

    invoke-static {p3}, Ls0/h;->f(Lg0/z2;)Lg0/z2;

    move-result-object p3

    invoke-direct {p2, p3}, Landroidx/lifecycle/d0;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lz/g6;->d:Landroidx/lifecycle/d0;

    iget-object p2, p0, Lz/g6;->g:Lz/y$c;

    invoke-virtual {p1, p2}, Lz/y;->B(Lz/y$c;)V

    return-void
.end method

.method public static synthetic a(Lz/g6;Ly1/c$a;Lg0/z2;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lz/g6;->o(Ly1/c$a;Lg0/z2;)V

    return-void
.end method

.method public static synthetic b(Lz/g6;Ly1/c$a;Lg0/z2;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lz/g6;->o(Ly1/c$a;Lg0/z2;)V

    return-void
.end method

.method public static synthetic c(Lz/g6;Lg0/z2;Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lz/g6;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lz/d6;

    invoke-direct {v1, p0, p2, p1}, Lz/d6;-><init>(Lz/g6;Ly1/c$a;Lg0/z2;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p0, "setLinearZoom"

    return-object p0
.end method

.method public static synthetic d(Lz/g6;Lg0/z2;Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lz/g6;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lz/c6;

    invoke-direct {v1, p0, p2, p1}, Lz/c6;-><init>(Lz/g6;Ly1/c$a;Lg0/z2;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p0, "setZoomRatio"

    return-object p0
.end method

.method public static f(La0/c0;)Lz/g6$b;
    .locals 1

    invoke-static {p0}, Lz/g6;->k(La0/c0;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lz/c;

    invoke-direct {v0, p0}, Lz/c;-><init>(La0/c0;)V

    return-object v0

    :cond_0
    new-instance v0, Lz/p3;

    invoke-direct {v0, p0}, Lz/p3;-><init>(La0/c0;)V

    return-object v0
.end method

.method public static h(La0/c0;)Lg0/z2;
    .locals 2

    invoke-static {p0}, Lz/g6;->f(La0/c0;)Lz/g6$b;

    move-result-object p0

    new-instance v0, Lz/h6;

    invoke-interface {p0}, Lz/g6$b;->d()F

    move-result v1

    invoke-interface {p0}, Lz/g6$b;->b()F

    move-result p0

    invoke-direct {v0, v1, p0}, Lz/h6;-><init>(FF)V

    const/high16 p0, 0x3f800000    # 1.0f

    invoke-virtual {v0, p0}, Lz/h6;->f(F)V

    invoke-static {v0}, Ls0/h;->f(Lg0/z2;)Lg0/z2;

    move-result-object p0

    return-object p0
.end method

.method public static i(La0/c0;)Landroid/util/Range;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La0/c0;",
            ")",
            "Landroid/util/Range<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    :try_start_0
    invoke-static {}, Lz/b;->a()Landroid/hardware/camera2/CameraCharacteristics$Key;

    move-result-object v0

    invoke-virtual {p0, v0}, La0/c0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/util/Range;
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string v0, "ZoomControl"

    const-string v1, "AssertionError, fail to get camera characteristic."

    invoke-static {v0, v1, p0}, Lg0/r1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static k(La0/c0;)Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lz/g6;->i(La0/c0;)Landroid/util/Range;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public e(Ly/a$a;)V
    .locals 1

    iget-object v0, p0, Lz/g6;->e:Lz/g6$b;

    invoke-interface {v0, p1}, Lz/g6$b;->g(Ly/a$a;)V

    return-void
.end method

.method public g()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lz/g6;->e:Lz/g6$b;

    invoke-interface {v0}, Lz/g6$b;->f()Landroid/graphics/Rect;

    move-result-object v0

    return-object v0
.end method

.method public j()Landroidx/lifecycle/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/a0<",
            "Lg0/z2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz/g6;->d:Landroidx/lifecycle/d0;

    return-object v0
.end method

.method public l(Z)V
    .locals 2

    iget-boolean v0, p0, Lz/g6;->f:Z

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean p1, p0, Lz/g6;->f:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lz/g6;->c:Lz/h6;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lz/g6;->c:Lz/h6;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lz/h6;->f(F)V

    iget-object v0, p0, Lz/g6;->c:Lz/h6;

    invoke-static {v0}, Ls0/h;->f(Lg0/z2;)Lg0/z2;

    move-result-object v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v0}, Lz/g6;->p(Lg0/z2;)V

    iget-object p1, p0, Lz/g6;->e:Lz/g6$b;

    invoke-interface {p1}, Lz/g6$b;->c()V

    iget-object p1, p0, Lz/g6;->a:Lz/y;

    invoke-virtual {p1}, Lz/y;->s0()J

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public m(F)Lne/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz/g6;->c:Lz/h6;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz/g6;->c:Lz/h6;

    invoke-virtual {v1, p1}, Lz/h6;->e(F)V

    iget-object p1, p0, Lz/g6;->c:Lz/h6;

    invoke-static {p1}, Ls0/h;->f(Lg0/z2;)Lg0/z2;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p0, p1}, Lz/g6;->p(Lg0/z2;)V

    new-instance v0, Lz/f6;

    invoke-direct {v0, p0, p1}, Lz/f6;-><init>(Lz/g6;Lg0/z2;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    invoke-static {p1}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :goto_0
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public n(F)Lne/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz/g6;->c:Lz/h6;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz/g6;->c:Lz/h6;

    invoke-virtual {v1, p1}, Lz/h6;->f(F)V

    iget-object p1, p0, Lz/g6;->c:Lz/h6;

    invoke-static {p1}, Ls0/h;->f(Lg0/z2;)Lg0/z2;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p0, p1}, Lz/g6;->p(Lg0/z2;)V

    new-instance v0, Lz/e6;

    invoke-direct {v0, p0, p1}, Lz/e6;-><init>(Lz/g6;Lg0/z2;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    invoke-static {p1}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :goto_0
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final o(Ly1/c$a;Lg0/z2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;",
            "Lg0/z2;",
            ")V"
        }
    .end annotation

    iget-boolean v0, p0, Lz/g6;->f:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lz/g6;->c:Lz/h6;

    monitor-enter v0

    :try_start_0
    iget-object p2, p0, Lz/g6;->c:Lz/h6;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p2, v1}, Lz/h6;->f(F)V

    iget-object p2, p0, Lz/g6;->c:Lz/h6;

    invoke-static {p2}, Ls0/h;->f(Lg0/z2;)Lg0/z2;

    move-result-object p2

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, p2}, Lz/g6;->p(Lg0/z2;)V

    new-instance p2, Lg0/m$a;

    const-string v0, "Camera is not active."

    invoke-direct {p2, v0}, Lg0/m$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    iget-object v0, p0, Lz/g6;->e:Lz/g6$b;

    invoke-interface {p2}, Lg0/z2;->d()F

    move-result p2

    invoke-interface {v0, p2, p1}, Lz/g6$b;->e(FLy1/c$a;)V

    iget-object p1, p0, Lz/g6;->a:Lz/y;

    invoke-virtual {p1}, Lz/y;->s0()J

    return-void
.end method

.method public final p(Lg0/z2;)V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lz/g6;->d:Landroidx/lifecycle/d0;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/d0;->o(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lz/g6;->d:Landroidx/lifecycle/d0;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/d0;->m(Ljava/lang/Object;)V

    return-void
.end method
