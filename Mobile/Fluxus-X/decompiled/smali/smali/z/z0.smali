.class public final Lz/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/o0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La0/c0;

.field public final c:Lf0/h;

.field public final d:Ljava/lang/Object;

.field public e:Lz/y;

.field public f:Lp0/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp0/v<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public g:Lp0/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp0/v<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public h:Lp0/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp0/v<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public i:Lp0/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp0/v<",
            "Lg0/z2;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Lp0/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp0/v<",
            "Lg0/w;",
            ">;"
        }
    .end annotation
.end field

.field public k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ln0/u;",
            "Ljava/util/concurrent/Executor;",
            ">;>;"
        }
    .end annotation
.end field

.field public final l:Ln0/k3;

.field public final m:Ln0/z1;

.field public final n:La0/p0;

.field public final o:Ls0/m;


# direct methods
.method public constructor <init>(Ljava/lang/String;La0/p0;Ls0/m;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lz/z0;->d:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lz/z0;->f:Lp0/v;

    iput-object v0, p0, Lz/z0;->g:Lp0/v;

    iput-object v0, p0, Lz/z0;->h:Lp0/v;

    iput-object v0, p0, Lz/z0;->i:Lp0/v;

    iput-object v0, p0, Lz/z0;->k:Ljava/util/List;

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lz/z0;->a:Ljava/lang/String;

    iput-object p2, p0, Lz/z0;->n:La0/p0;

    invoke-virtual {p2, v0}, La0/p0;->c(Ljava/lang/String;)La0/c0;

    move-result-object p2

    iput-object p2, p0, Lz/z0;->b:La0/c0;

    new-instance v0, Lf0/h;

    invoke-direct {v0, p0}, Lf0/h;-><init>(Lz/z0;)V

    iput-object v0, p0, Lz/z0;->c:Lf0/h;

    invoke-static {p1, p2}, Lc0/a;->a(Ljava/lang/String;La0/c0;)Ln0/k3;

    move-result-object p2

    iput-object p2, p0, Lz/z0;->l:Ln0/k3;

    new-instance v0, Lz/m2;

    invoke-direct {v0, p1, p2}, Lz/m2;-><init>(Ljava/lang/String;Ln0/k3;)V

    iput-object v0, p0, Lz/z0;->m:Ln0/z1;

    new-instance p1, Lp0/v;

    sget-object p2, Lg0/w$b;->e:Lg0/w$b;

    invoke-static {p2}, Lg0/w;->a(Lg0/w$b;)Lg0/w;

    move-result-object p2

    invoke-direct {p1, p2}, Lp0/v;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lz/z0;->j:Lp0/v;

    iput-object p3, p0, Lz/z0;->o:Ls0/m;

    return-void
.end method


# virtual methods
.method public B()Lf0/h;
    .locals 1

    iget-object v0, p0, Lz/z0;->c:Lf0/h;

    return-object v0
.end method

.method public C()La0/c0;
    .locals 1

    iget-object v0, p0, Lz/z0;->b:La0/c0;

    return-object v0
.end method

.method public D()I
    .locals 2

    iget-object v0, p0, Lz/z0;->b:La0/c0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_ORIENTATION:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, La0/c0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public E()I
    .locals 2

    iget-object v0, p0, Lz/z0;->b:La0/c0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, La0/c0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public F()Z
    .locals 1

    iget-object v0, p0, Lz/z0;->b:La0/c0;

    invoke-static {v0}, Lz/q4;->b(La0/c0;)Z

    move-result v0

    return v0
.end method

.method public G(Lz/y;)V
    .locals 4

    iget-object v0, p0, Lz/z0;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lz/z0;->e:Lz/y;

    iget-object v1, p0, Lz/z0;->i:Lp0/v;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lz/y;->W()Lz/g6;

    move-result-object p1

    invoke-virtual {p1}, Lz/g6;->j()Landroidx/lifecycle/a0;

    move-result-object p1

    invoke-virtual {v1, p1}, Lp0/s;->u(Landroidx/lifecycle/a0;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    iget-object p1, p0, Lz/z0;->f:Lp0/v;

    if-eqz p1, :cond_1

    iget-object v1, p0, Lz/z0;->e:Lz/y;

    invoke-virtual {v1}, Lz/y;->U()Lz/x5;

    move-result-object v1

    invoke-virtual {v1}, Lz/x5;->g()Landroidx/lifecycle/a0;

    move-result-object v1

    invoke-virtual {p1, v1}, Lp0/s;->u(Landroidx/lifecycle/a0;)V

    :cond_1
    iget-object p1, p0, Lz/z0;->g:Lp0/v;

    if-eqz p1, :cond_2

    iget-object v1, p0, Lz/z0;->e:Lz/y;

    invoke-virtual {v1}, Lz/y;->U()Lz/x5;

    move-result-object v1

    invoke-virtual {v1}, Lz/x5;->h()Landroidx/lifecycle/a0;

    move-result-object v1

    invoke-virtual {p1, v1}, Lp0/s;->u(Landroidx/lifecycle/a0;)V

    :cond_2
    iget-object p1, p0, Lz/z0;->h:Lp0/v;

    if-eqz p1, :cond_3

    iget-object v1, p0, Lz/z0;->e:Lz/y;

    invoke-virtual {v1}, Lz/y;->J()Lz/q4;

    move-result-object v1

    invoke-virtual {v1}, Lz/q4;->c()Landroidx/lifecycle/a0;

    move-result-object v1

    invoke-virtual {p1, v1}, Lp0/s;->u(Landroidx/lifecycle/a0;)V

    :cond_3
    iget-object p1, p0, Lz/z0;->k:Ljava/util/List;

    if-eqz p1, :cond_5

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    iget-object v2, p0, Lz/z0;->e:Lz/y;

    iget-object v3, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/util/concurrent/Executor;

    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ln0/u;

    invoke-virtual {v2, v3, v1}, Lz/y;->C(Ljava/util/concurrent/Executor;Ln0/u;)V

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    iput-object p1, p0, Lz/z0;->k:Ljava/util/List;

    :cond_5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lz/z0;->H()V

    return-void

    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final H()V
    .locals 0

    invoke-virtual {p0}, Lz/z0;->I()V

    return-void
.end method

.method public final I()V
    .locals 3

    invoke-virtual {p0}, Lz/z0;->E()I

    move-result v0

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL"

    goto :goto_0

    :cond_1
    const-string v0, "INFO_SUPPORTED_HARDWARE_LEVEL_3"

    goto :goto_0

    :cond_2
    const-string v0, "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY"

    goto :goto_0

    :cond_3
    const-string v0, "INFO_SUPPORTED_HARDWARE_LEVEL_FULL"

    goto :goto_0

    :cond_4
    const-string v0, "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED"

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Device Level: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Camera2CameraInfo"

    invoke-static {v1, v0}, Lg0/r1;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public J(Landroidx/lifecycle/a0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/a0<",
            "Lg0/w;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lz/z0;->j:Lp0/v;

    invoke-virtual {v0, p1}, Lp0/s;->u(Landroidx/lifecycle/a0;)V

    return-void
.end method

.method public a()Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz/z0;->b:La0/c0;

    invoke-virtual {v0}, La0/c0;->e()La0/u0;

    move-result-object v0

    invoke-virtual {v0}, La0/u0;->e()[I

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget v4, v0, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public b()Landroidx/lifecycle/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/a0<",
            "Lg0/w;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz/z0;->j:Lp0/v;

    return-object v0
.end method

.method public c()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lg0/k0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz/z0;->b:La0/c0;

    invoke-static {v0}, Lb0/e;->a(La0/c0;)Lb0/e;

    move-result-object v0

    invoke-virtual {v0}, Lb0/e;->c()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lz/z0;->w(I)I

    move-result v0

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lz/z0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public f(Ljava/util/concurrent/Executor;Ln0/u;)V
    .locals 3

    iget-object v0, p0, Lz/z0;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz/z0;->e:Lz/y;

    if-nez v1, :cond_1

    iget-object v1, p0, Lz/z0;->k:Ljava/util/List;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lz/z0;->k:Ljava/util/List;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lz/z0;->k:Ljava/util/List;

    new-instance v2, Landroid/util/Pair;

    invoke-direct {v2, p2, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :cond_1
    invoke-virtual {v1, p1, p2}, Lz/y;->C(Ljava/util/concurrent/Executor;Ln0/u;)V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public h()Landroid/graphics/Rect;
    .locals 4

    iget-object v0, p0, Lz/z0;->b:La0/c0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_ACTIVE_ARRAY_SIZE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, La0/c0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    const-string v1, "robolectric"

    sget-object v2, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Rect;

    const/16 v1, 0xfa0

    const/16 v2, 0xbb8

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0

    :cond_0
    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    return-object v0
.end method

.method public i()I
    .locals 3

    iget-object v0, p0, Lz/z0;->b:La0/c0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, La0/c0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Unable to get the lens facing of the camera."

    invoke-static {v1, v2}, Lx2/g;->b(ZLjava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lz/o4;->a(I)I

    move-result v0

    return v0
.end method

.method public j(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz/z0;->b:La0/c0;

    invoke-virtual {v0}, La0/c0;->e()La0/u0;

    move-result-object v0

    invoke-virtual {v0, p1}, La0/u0;->a(I)[Landroid/util/Size;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public k()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz/z0;->b:La0/c0;

    invoke-virtual {v0}, La0/c0;->j()Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v0

    return-object v0
.end method

.method public l()Ln0/k3;
    .locals 1

    iget-object v0, p0, Lz/z0;->l:Ln0/k3;

    return-object v0
.end method

.method public m(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz/z0;->b:La0/c0;

    invoke-virtual {v0}, La0/c0;->e()La0/u0;

    move-result-object v0

    invoke-virtual {v0, p1}, La0/u0;->g(I)[Landroid/util/Size;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public n()Ljava/util/Set;
    .locals 5
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

    iget-object v1, p0, Lz/z0;->b:La0/c0;

    sget-object v2, Landroid/hardware/camera2/CameraCharacteristics;->REQUEST_AVAILABLE_CAPABILITIES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v1, v2}, La0/c0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    if-eqz v1, :cond_0

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget v4, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public o()Z
    .locals 6

    iget-object v0, p0, Lz/z0;->b:La0/c0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, La0/c0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    array-length v2, v0

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_1

    aget v4, v0, v3

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    return v5

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public p()Landroidx/lifecycle/a0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/a0<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz/z0;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz/z0;->e:Lz/y;

    if-nez v1, :cond_1

    iget-object v1, p0, Lz/z0;->f:Lp0/v;

    if-nez v1, :cond_0

    new-instance v1, Lp0/v;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v2}, Lp0/v;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lz/z0;->f:Lp0/v;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lz/z0;->f:Lp0/v;

    monitor-exit v0

    return-object v1

    :cond_1
    iget-object v2, p0, Lz/z0;->f:Lp0/v;

    if-eqz v2, :cond_2

    monitor-exit v0

    return-object v2

    :cond_2
    invoke-virtual {v1}, Lz/y;->U()Lz/x5;

    move-result-object v1

    invoke-virtual {v1}, Lz/x5;->g()Landroidx/lifecycle/a0;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public r(Landroid/util/Range;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lz/z0;->b:La0/c0;

    invoke-virtual {v0}, La0/c0;->e()La0/u0;

    move-result-object v0

    invoke-virtual {v0, p1}, La0/u0;->d(Landroid/util/Range;)[Landroid/util/Size;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t get high speed resolutions for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Camera2CameraInfo"

    invoke-static {v1, p1, v0}, Lg0/r1;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :cond_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :goto_1
    return-object p1
.end method

.method public s()Z
    .locals 2

    iget-object v0, p0, Lz/z0;->b:La0/c0;

    const/16 v1, 0x9

    invoke-static {v0, v1}, Lz/o6;->a(La0/c0;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public t()Ln0/a4;
    .locals 2

    iget-object v0, p0, Lz/z0;->b:La0/c0;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_TIMESTAMP_SOURCE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, La0/c0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    sget-object v0, Ln0/a4;->a:Ln0/a4;

    return-object v0

    :cond_0
    sget-object v0, Ln0/a4;->b:Ln0/a4;

    return-object v0
.end method

.method public u()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lz/z0;->E()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const-string v0, "androidx.camera.camera2.legacy"

    return-object v0

    :cond_0
    const-string v0, "androidx.camera.camera2"

    return-object v0
.end method

.method public v(Ln0/u;)V
    .locals 3

    iget-object v0, p0, Lz/z0;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz/z0;->e:Lz/y;

    if-nez v1, :cond_3

    iget-object v1, p0, Lz/z0;->k:Ljava/util/List;

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Pair;

    iget-object v2, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    if-ne v2, p1, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    monitor-exit v0

    return-void

    :cond_3
    invoke-virtual {v1, p1}, Lz/y;->h0(Ln0/u;)V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public w(I)I
    .locals 3

    invoke-virtual {p0}, Lz/z0;->D()I

    move-result v0

    invoke-static {p1}, Lp0/c;->b(I)I

    move-result p1

    invoke-virtual {p0}, Lz/z0;->i()I

    move-result v1

    const/4 v2, 0x1

    if-ne v2, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {p1, v0, v2}, Lp0/c;->a(IIZ)I

    move-result p1

    return p1
.end method

.method public x()Ln0/z1;
    .locals 1

    iget-object v0, p0, Lz/z0;->m:Ln0/z1;

    return-object v0
.end method

.method public y()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz/z0;->b:La0/c0;

    invoke-virtual {v0}, La0/c0;->e()La0/u0;

    move-result-object v0

    invoke-virtual {v0}, La0/u0;->c()[Landroid/util/Size;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method public z()Landroidx/lifecycle/a0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/a0<",
            "Lg0/z2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz/z0;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz/z0;->e:Lz/y;

    if-nez v1, :cond_1

    iget-object v1, p0, Lz/z0;->i:Lp0/v;

    if-nez v1, :cond_0

    new-instance v1, Lp0/v;

    iget-object v2, p0, Lz/z0;->b:La0/c0;

    invoke-static {v2}, Lz/g6;->h(La0/c0;)Lg0/z2;

    move-result-object v2

    invoke-direct {v1, v2}, Lp0/v;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lz/z0;->i:Lp0/v;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lz/z0;->i:Lp0/v;

    monitor-exit v0

    return-object v1

    :cond_1
    iget-object v2, p0, Lz/z0;->i:Lp0/v;

    if-eqz v2, :cond_2

    monitor-exit v0

    return-object v2

    :cond_2
    invoke-virtual {v1}, Lz/y;->W()Lz/g6;

    move-result-object v1

    invoke-virtual {v1}, Lz/g6;->j()Landroidx/lifecycle/a0;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
