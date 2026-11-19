.class public Lb0/m;
.super Lb0/l;
.source "SourceFile"


# direct methods
.method public constructor <init>(ILandroid/view/Surface;)V
    .locals 1

    .line 1
    new-instance v0, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-direct {v0, p1, p2}, Landroid/hardware/camera2/params/OutputConfiguration;-><init>(ILandroid/view/Surface;)V

    invoke-direct {p0, v0}, Lb0/m;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lb0/l;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public static k(Landroid/hardware/camera2/params/OutputConfiguration;)Lb0/m;
    .locals 1

    new-instance v0, Lb0/m;

    invoke-direct {v0, p0}, Lb0/m;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public a(J)V
    .locals 2

    const-wide/16 v0, -0x1

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lb0/m;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-virtual {v0, p1, p2}, Landroid/hardware/camera2/params/OutputConfiguration;->setStreamUseCase(J)V

    return-void
.end method

.method public bridge synthetic b(Landroid/view/Surface;)V
    .locals 0

    invoke-super {p0, p1}, Lb0/k;->b(Landroid/view/Surface;)V

    return-void
.end method

.method public c(J)V
    .locals 1

    invoke-virtual {p0}, Lb0/m;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-virtual {v0, p1, p2}, Landroid/hardware/camera2/params/OutputConfiguration;->setDynamicRangeProfile(J)V

    return-void
.end method

.method public bridge synthetic d(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lb0/l;->d(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic e()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lb0/l;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, Lb0/n;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic f()V
    .locals 0

    invoke-super {p0}, Lb0/k;->f()V

    return-void
.end method

.method public g(I)V
    .locals 1

    invoke-virtual {p0}, Lb0/m;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/params/OutputConfiguration;->setMirrorMode(I)V

    return-void
.end method

.method public bridge synthetic getSurface()Landroid/view/Surface;
    .locals 1

    invoke-super {p0}, Lb0/j;->getSurface()Landroid/view/Surface;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lb0/n;->a:Ljava/lang/Object;

    instance-of v0, v0, Landroid/hardware/camera2/params/OutputConfiguration;

    invoke-static {v0}, Lx2/g;->a(Z)V

    iget-object v0, p0, Lb0/n;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic hashCode()I
    .locals 1

    invoke-super {p0}, Lb0/n;->hashCode()I

    move-result v0

    return v0
.end method
