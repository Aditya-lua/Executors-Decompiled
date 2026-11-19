.class public Lz/k2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/k2$a;
    }
.end annotation


# direct methods
.method public static a(Ln0/l1;Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 1

    invoke-virtual {p0}, Ln0/l1;->e()Landroid/util/Range;

    move-result-object p0

    sget-object v0, Ln0/t3;->a:Landroid/util/Range;

    invoke-virtual {p0, v0}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_TARGET_FPS_RANGE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1, v0, p0}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "applyAeFpsRange: expectedFrameRateRange = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "Camera2CaptureRequestBuilder"

    invoke-static {p1, p0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static b(Landroid/hardware/camera2/CaptureRequest$Builder;Ln0/n1;)V
    .locals 4

    invoke-static {p1}, Lf0/l$a;->d(Ln0/n1;)Lf0/l$a;

    move-result-object p1

    invoke-virtual {p1}, Lf0/l$a;->c()Lf0/l;

    move-result-object p1

    invoke-interface {p1}, Ln0/l3;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/n1$a;

    invoke-virtual {v1}, Ln0/n1$a;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/camera2/CaptureRequest$Key;

    :try_start_0
    invoke-interface {p1, v1}, Ln0/l3;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v2, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CaptureRequest.Key is not supported: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Camera2CaptureRequestBuilder"

    invoke-static {v2, v1}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static c(Landroid/hardware/camera2/CaptureRequest$Builder;ILd0/y;)V
    .locals 1

    invoke-virtual {p2, p1}, Ld0/y;->a(I)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, v0, p2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static d(Ln0/l1;Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 1

    invoke-static {p0}, Lz/k2;->h(Ln0/l1;)Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_0

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_VIDEO_STABILIZATION_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1, v0, p0}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "applyVideoStabilization: mode = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "Camera2CaptureRequestBuilder"

    invoke-static {p1, p0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static e(Ln0/l1;Landroid/hardware/camera2/CameraDevice;Ljava/util/Map;ZLd0/y;)Landroid/hardware/camera2/CaptureRequest;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/l1;",
            "Landroid/hardware/camera2/CameraDevice;",
            "Ljava/util/Map<",
            "Ln0/u1;",
            "Landroid/view/Surface;",
            ">;Z",
            "Ld0/y;",
            ")",
            "Landroid/hardware/camera2/CaptureRequest;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Ln0/l1;->i()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, p2}, Lz/k2;->g(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p0}, Ln0/l1;->d()Ln0/e0;

    move-result-object v0

    invoke-virtual {p0}, Ln0/l1;->k()I

    move-result v1

    const-string v2, "Camera2CaptureRequestBuilder"

    const/4 v3, 0x5

    if-ne v1, v3, :cond_2

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ln0/e0;->e()Landroid/hardware/camera2/CaptureResult;

    move-result-object v1

    instance-of v1, v1, Landroid/hardware/camera2/TotalCaptureResult;

    if-eqz v1, :cond_2

    const-string p3, "createReprocessCaptureRequest"

    invoke-static {v2, p3}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0}, Ln0/e0;->e()Landroid/hardware/camera2/CaptureResult;

    move-result-object p3

    check-cast p3, Landroid/hardware/camera2/TotalCaptureResult;

    invoke-static {p1, p3}, Lz/k2$a;->a(Landroid/hardware/camera2/CameraDevice;Landroid/hardware/camera2/TotalCaptureResult;)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object p1

    goto :goto_1

    :cond_2
    const-string v0, "createCaptureRequest"

    invoke-static {v2, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Ln0/l1;->k()I

    move-result v0

    if-ne v0, v3, :cond_4

    if-eqz p3, :cond_3

    const/4 p3, 0x1

    goto :goto_0

    :cond_3
    const/4 p3, 0x2

    :goto_0
    invoke-virtual {p1, p3}, Landroid/hardware/camera2/CameraDevice;->createCaptureRequest(I)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object p1

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Ln0/l1;->k()I

    move-result p3

    invoke-virtual {p1, p3}, Landroid/hardware/camera2/CameraDevice;->createCaptureRequest(I)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object p1

    :goto_1
    invoke-virtual {p0}, Ln0/l1;->k()I

    move-result p3

    invoke-static {p1, p3, p4}, Lz/k2;->c(Landroid/hardware/camera2/CaptureRequest$Builder;ILd0/y;)V

    invoke-static {p0, p1}, Lz/k2;->a(Ln0/l1;Landroid/hardware/camera2/CaptureRequest$Builder;)V

    invoke-static {p0, p1}, Lz/k2;->d(Ln0/l1;Landroid/hardware/camera2/CaptureRequest$Builder;)V

    invoke-virtual {p0}, Ln0/l1;->g()Ln0/n1;

    move-result-object p3

    sget-object p4, Ln0/l1;->i:Ln0/n1$a;

    invoke-interface {p3, p4}, Ln0/n1;->a(Ln0/n1$a;)Z

    move-result p3

    if-eqz p3, :cond_5

    sget-object p3, Landroid/hardware/camera2/CaptureRequest;->JPEG_ORIENTATION:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p0}, Ln0/l1;->g()Ln0/n1;

    move-result-object v0

    invoke-interface {v0, p4}, Ln0/n1;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p1, p3, p4}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :cond_5
    invoke-virtual {p0}, Ln0/l1;->g()Ln0/n1;

    move-result-object p3

    sget-object p4, Ln0/l1;->j:Ln0/n1$a;

    invoke-interface {p3, p4}, Ln0/n1;->a(Ln0/n1$a;)Z

    move-result p3

    if-eqz p3, :cond_6

    sget-object p3, Landroid/hardware/camera2/CaptureRequest;->JPEG_QUALITY:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p0}, Ln0/l1;->g()Ln0/n1;

    move-result-object v0

    invoke-interface {v0, p4}, Ln0/n1;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->byteValue()B

    move-result p4

    invoke-static {p4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p4

    invoke-virtual {p1, p3, p4}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :cond_6
    invoke-virtual {p0}, Ln0/l1;->g()Ln0/n1;

    move-result-object p3

    invoke-static {p1, p3}, Lz/k2;->b(Landroid/hardware/camera2/CaptureRequest$Builder;Ln0/n1;)V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/view/Surface;

    invoke-virtual {p1, p3}, Landroid/hardware/camera2/CaptureRequest$Builder;->addTarget(Landroid/view/Surface;)V

    goto :goto_2

    :cond_7
    invoke-virtual {p0}, Ln0/l1;->j()Ln0/z3;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/hardware/camera2/CaptureRequest$Builder;->setTag(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object p0

    return-object p0
.end method

.method public static f(Ln0/l1;Landroid/hardware/camera2/CameraDevice;Ld0/y;)Landroid/hardware/camera2/CaptureRequest;
    .locals 2

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "template type = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ln0/l1;->k()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Camera2CaptureRequestBuilder"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Ln0/l1;->k()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/hardware/camera2/CameraDevice;->createCaptureRequest(I)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object p1

    invoke-virtual {p0}, Ln0/l1;->k()I

    move-result v0

    invoke-static {p1, v0, p2}, Lz/k2;->c(Landroid/hardware/camera2/CaptureRequest$Builder;ILd0/y;)V

    invoke-static {p0, p1}, Lz/k2;->a(Ln0/l1;Landroid/hardware/camera2/CaptureRequest$Builder;)V

    invoke-virtual {p0}, Ln0/l1;->g()Ln0/n1;

    move-result-object p0

    invoke-static {p1, p0}, Lz/k2;->b(Landroid/hardware/camera2/CaptureRequest$Builder;Ln0/n1;)V

    invoke-virtual {p1}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln0/u1;",
            ">;",
            "Ljava/util/Map<",
            "Ln0/u1;",
            "Landroid/view/Surface;",
            ">;)",
            "Ljava/util/List<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/u1;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/Surface;

    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "DeferrableSurface not in configuredSurfaceMap"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-object v0
.end method

.method public static h(Ln0/l1;)Ljava/lang/Integer;
    .locals 3

    invoke-virtual {p0}, Ln0/l1;->h()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    invoke-virtual {p0}, Ln0/l1;->l()I

    move-result v0

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ln0/l1;->h()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p0}, Ln0/l1;->l()I

    move-result p0

    if-ne p0, v2, :cond_2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0

    :cond_3
    :goto_0
    const/4 p0, 0x0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method
