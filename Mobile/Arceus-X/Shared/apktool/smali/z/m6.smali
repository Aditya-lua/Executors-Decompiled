.class public final Lz/m6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/i6;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/m6$b;
    }
.end annotation


# instance fields
.field public final a:La0/c0;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lw0/f;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Landroidx/camera/core/f;

.field public i:Ln0/u1;

.field public j:Lz/m6$b;


# direct methods
.method public constructor <init>(La0/c0;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz/m6;->d:Z

    iput-boolean v0, p0, Lz/m6;->e:Z

    iput-boolean v0, p0, Lz/m6;->f:Z

    iput-boolean v0, p0, Lz/m6;->g:Z

    iput-object p1, p0, Lz/m6;->a:La0/c0;

    iput-object p2, p0, Lz/m6;->b:Ljava/util/concurrent/Executor;

    const/4 p2, 0x4

    invoke-static {p1, p2}, Lz/o6;->a(La0/c0;I)Z

    move-result p1

    iput-boolean p1, p0, Lz/m6;->f:Z

    const-class p1, Landroidx/camera/camera2/internal/compat/quirk/ZslDisablerQuirk;

    invoke-static {p1}, Lc0/e;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, Lz/m6;->g:Z

    new-instance p1, Lw0/f;

    new-instance p2, Lz/l6;

    invoke-direct {p2}, Lz/l6;-><init>()V

    const/4 v0, 0x3

    invoke-direct {p1, v0, p2}, Lw0/f;-><init>(ILw0/c$a;)V

    iput-object p1, p0, Lz/m6;->c:Lw0/f;

    return-void
.end method

.method public static synthetic i(Lz/m6;Ln0/j2;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    invoke-interface {p1}, Ln0/j2;->b()Landroidx/camera/core/d;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p0, p0, Lz/m6;->c:Lw0/f;

    invoke-virtual {p0, p1}, Lw0/f;->c(Landroidx/camera/core/d;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failed to acquire latest image IllegalStateException = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "ZslControlImpl"

    invoke-static {p1, p0}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic j(Landroidx/camera/core/f;Lz/m6$b;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/f;->j()V

    invoke-virtual {p1}, Lz/m6$b;->e()V

    return-void
.end method


# virtual methods
.method public a(Ln0/o3$b;)V
    .locals 8

    const/16 v0, 0x22

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0}, Lz/m6;->k()V

    iget-boolean v2, p0, Lz/m6;->d:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    invoke-virtual {p1, v3}, Ln0/o3$b;->B(I)Ln0/o3$b;

    return-void

    :cond_0
    iget-boolean v2, p0, Lz/m6;->g:Z

    if-eqz v2, :cond_1

    invoke-virtual {p1, v3}, Ln0/o3$b;->B(I)Ln0/o3$b;

    return-void

    :cond_1
    iget-object v2, p0, Lz/m6;->a:La0/c0;

    invoke-virtual {p0, v2}, Lz/m6;->m(La0/c0;)Ljava/util/Map;

    move-result-object v2

    iget-boolean v4, p0, Lz/m6;->f:Z

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_3

    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v4, p0, Lz/m6;->a:La0/c0;

    invoke-virtual {p0, v4, v0}, Lz/m6;->n(La0/c0;I)Z

    move-result v4

    if-nez v4, :cond_2

    goto/16 :goto_0

    :cond_2
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Size;

    new-instance v2, Landroidx/camera/core/e;

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v3

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v1

    const/16 v4, 0x9

    invoke-direct {v2, v3, v1, v0, v4}, Landroidx/camera/core/e;-><init>(IIII)V

    new-instance v1, Landroidx/camera/core/f;

    invoke-direct {v1, v2}, Landroidx/camera/core/f;-><init>(Ln0/j2;)V

    new-instance v3, Ln0/k2;

    invoke-virtual {v1}, Landroidx/camera/core/f;->getSurface()Landroid/view/Surface;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Landroid/util/Size;

    invoke-virtual {v1}, Landroidx/camera/core/f;->getWidth()I

    move-result v6

    invoke-virtual {v1}, Landroidx/camera/core/f;->getHeight()I

    move-result v7

    invoke-direct {v5, v6, v7}, Landroid/util/Size;-><init>(II)V

    invoke-direct {v3, v4, v5, v0}, Ln0/k2;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    new-instance v0, Lz/m6$b;

    iget-object v4, p0, Lz/m6;->b:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v4}, Lz/m6$b;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v1, p0, Lz/m6;->h:Landroidx/camera/core/f;

    iput-object v3, p0, Lz/m6;->i:Ln0/u1;

    iput-object v0, p0, Lz/m6;->j:Lz/m6$b;

    new-instance v4, Lz/j6;

    invoke-direct {v4, p0}, Lz/j6;-><init>(Lz/m6;)V

    invoke-static {}, Lq0/c;->d()Ljava/util/concurrent/Executor;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Landroidx/camera/core/f;->f(Ln0/j2$a;Ljava/util/concurrent/Executor;)V

    invoke-virtual {v3}, Ln0/u1;->k()Lne/x;

    move-result-object v4

    new-instance v5, Lz/k6;

    invoke-direct {v5, v1, v0}, Lz/k6;-><init>(Landroidx/camera/core/f;Lz/m6$b;)V

    iget-object v6, p0, Lz/m6;->b:Ljava/util/concurrent/Executor;

    invoke-interface {v4, v5, v6}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p1, v3}, Ln0/o3$b;->l(Ln0/u1;)Ln0/o3$b;

    invoke-virtual {v2}, Landroidx/camera/core/e;->m()Ln0/u;

    move-result-object v2

    invoke-virtual {p1, v2}, Ln0/o3$b;->e(Ln0/u;)Ln0/o3$b;

    new-instance v2, Lz/m6$a;

    invoke-direct {v2, p0, v0}, Lz/m6$a;-><init>(Lz/m6;Lz/m6$b;)V

    invoke-virtual {p1, v2}, Ln0/o3$b;->k(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Ln0/o3$b;

    new-instance v0, Landroid/hardware/camera2/params/InputConfiguration;

    invoke-virtual {v1}, Landroidx/camera/core/f;->getWidth()I

    move-result v2

    invoke-virtual {v1}, Landroidx/camera/core/f;->getHeight()I

    move-result v3

    invoke-virtual {v1}, Landroidx/camera/core/f;->c()I

    move-result v1

    invoke-direct {v0, v2, v3, v1}, Landroid/hardware/camera2/params/InputConfiguration;-><init>(III)V

    invoke-virtual {p1, v0}, Ln0/o3$b;->x(Landroid/hardware/camera2/params/InputConfiguration;)Ln0/o3$b;

    return-void

    :cond_3
    :goto_0
    invoke-virtual {p1, v3}, Ln0/o3$b;->B(I)Ln0/o3$b;

    return-void
.end method

.method public b()V
    .locals 0

    invoke-virtual {p0}, Lz/m6;->k()V

    return-void
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lz/m6;->d:Z

    return v0
.end method

.method public d(Z)V
    .locals 0

    iput-boolean p1, p0, Lz/m6;->e:Z

    return-void
.end method

.method public e(Z)V
    .locals 1

    iget-boolean v0, p0, Lz/m6;->d:Z

    if-eq v0, p1, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lz/m6;->l()V

    :cond_0
    iput-boolean p1, p0, Lz/m6;->d:Z

    return-void
.end method

.method public f()Landroidx/camera/core/d;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lz/m6;->c:Lw0/f;

    invoke-virtual {v0}, Lw0/a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/d;
    :try_end_0
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, "ZslControlImpl"

    const-string v1, "dequeueImageFromBuffer no such element"

    invoke-static {v0, v1}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public g(Landroidx/camera/core/d;)Z
    .locals 1

    iget-object v0, p0, Lz/m6;->j:Lz/m6$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lz/m6$b;->c(Landroidx/camera/core/d;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lz/m6;->e:Z

    return v0
.end method

.method public final k()V
    .locals 2

    iget-object v0, p0, Lz/m6;->h:Landroidx/camera/core/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/camera/core/f;->d()V

    iput-object v1, p0, Lz/m6;->h:Landroidx/camera/core/f;

    :cond_0
    iget-object v0, p0, Lz/m6;->j:Lz/m6$b;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lz/m6$b;->b()V

    iput-object v1, p0, Lz/m6;->j:Lz/m6$b;

    :cond_1
    invoke-virtual {p0}, Lz/m6;->l()V

    iget-object v0, p0, Lz/m6;->i:Ln0/u1;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ln0/u1;->d()V

    iput-object v1, p0, Lz/m6;->i:Ln0/u1;

    :cond_2
    return-void
.end method

.method public final l()V
    .locals 2

    iget-object v0, p0, Lz/m6;->c:Lw0/f;

    :goto_0
    invoke-virtual {v0}, Lw0/a;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lw0/a;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/d;

    invoke-interface {v1}, Landroidx/camera/core/d;->close()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final m(La0/c0;)Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La0/c0;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    :try_start_0
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p1, v0}, La0/c0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/params/StreamConfigurationMap;
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to retrieve StreamConfigurationMap, error = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ZslControlImpl"

    invoke-static {v0, p1}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getInputFormats()[I

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getInputFormats()[I

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    if-ge v4, v2, :cond_2

    aget v5, v1, v4

    invoke-virtual {p1, v5}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getInputSizes(I)[Landroid/util/Size;

    move-result-object v6

    if-eqz v6, :cond_1

    new-instance v7, Lp0/e;

    const/4 v8, 0x1

    invoke-direct {v7, v8}, Lp0/e;-><init>(Z)V

    invoke-static {v6, v7}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aget-object v6, v6, v3

    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    return-object v0

    :cond_3
    :goto_2
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    return-object p1
.end method

.method public final n(La0/c0;I)Z
    .locals 4

    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p1, v0}, La0/c0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/params/StreamConfigurationMap;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1, p2}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getValidOutputFormatsForInput(I)[I

    move-result-object p1

    if-nez p1, :cond_1

    return v0

    :cond_1
    array-length p2, p1

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_3

    aget v2, p1, v1

    const/16 v3, 0x100

    if-ne v2, v3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return v0
.end method
