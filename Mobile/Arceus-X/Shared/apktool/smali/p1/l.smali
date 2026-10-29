.class public final Lp1/l;
.super Lp1/i;
.source "SourceFile"


# instance fields
.field public R:Landroidx/lifecycle/s;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lp1/i;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public K()Lg0/l;
    .locals 4

    iget-object v0, p0, Lp1/l;->R:Landroidx/lifecycle/s;

    const-string v1, "CamLifecycleController"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const-string v0, "Lifecycle is not set."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-object v2

    :cond_0
    iget-object v0, p0, Lp1/i;->v:Lp1/y;

    if-nez v0, :cond_1

    const-string v0, "CameraProvider is not ready."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-object v2

    :cond_1
    invoke-virtual {p0}, Lp1/i;->j()Lg0/x2;

    move-result-object v0

    if-nez v0, :cond_2

    return-object v2

    :cond_2
    :try_start_0
    iget-object v1, p0, Lp1/i;->v:Lp1/y;

    iget-object v2, p0, Lp1/l;->R:Landroidx/lifecycle/s;

    iget-object v3, p0, Lp1/i;->a:Lg0/v;

    invoke-interface {v1, v2, v3, v0}, Lp1/y;->b(Landroidx/lifecycle/s;Lg0/v;Lg0/x2;)Lg0/l;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public X(Landroidx/lifecycle/s;)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    invoke-static {}, Lp0/z;->b()V

    iput-object p1, p0, Lp1/l;->R:Landroidx/lifecycle/s;

    invoke-virtual {p0}, Lp1/i;->L()V

    return-void
.end method
