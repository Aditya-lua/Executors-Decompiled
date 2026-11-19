.class public final Lz/u0$j;
.super Landroid/hardware/camera2/CameraDevice$StateCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/u0$j$a;,
        Lz/u0$j$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Ljava/util/concurrent/ScheduledExecutorService;

.field public c:Lz/u0$j$b;

.field public d:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field public final e:Lz/u0$j$a;

.field public final synthetic f:Lz/u0;


# direct methods
.method public constructor <init>(Lz/u0;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;J)V
    .locals 0

    iput-object p1, p0, Lz/u0$j;->f:Lz/u0;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraDevice$StateCallback;-><init>()V

    iput-object p2, p0, Lz/u0$j;->a:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lz/u0$j;->b:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance p1, Lz/u0$j$a;

    invoke-direct {p1, p0, p4, p5}, Lz/u0$j$a;-><init>(Lz/u0$j;J)V

    iput-object p1, p0, Lz/u0$j;->e:Lz/u0$j$a;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 4

    iget-object v0, p0, Lz/u0$j;->d:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz/u0$j;->f:Lz/u0;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cancelling scheduled re-open: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lz/u0$j;->c:Lz/u0$j$b;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lz/u0;->a0(Ljava/lang/String;)V

    iget-object v0, p0, Lz/u0$j;->c:Lz/u0$j$b;

    invoke-virtual {v0}, Lz/u0$j$b;->b()V

    const/4 v0, 0x0

    iput-object v0, p0, Lz/u0$j;->c:Lz/u0$j$b;

    iget-object v2, p0, Lz/u0$j;->d:Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {v2, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    iput-object v0, p0, Lz/u0$j;->d:Ljava/util/concurrent/ScheduledFuture;

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public final b(Landroid/hardware/camera2/CameraDevice;I)V
    .locals 5

    iget-object v0, p0, Lz/u0$j;->f:Lz/u0;

    iget-object v0, v0, Lz/u0;->e:Lz/u0$i;

    sget-object v1, Lz/u0$i;->i:Lz/u0$i;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lz/u0$j;->f:Lz/u0;

    iget-object v0, v0, Lz/u0;->e:Lz/u0$i;

    sget-object v1, Lz/u0$i;->j:Lz/u0$i;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lz/u0$j;->f:Lz/u0;

    iget-object v0, v0, Lz/u0;->e:Lz/u0$i;

    sget-object v1, Lz/u0$i;->k:Lz/u0$i;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lz/u0$j;->f:Lz/u0;

    iget-object v0, v0, Lz/u0;->e:Lz/u0$i;

    sget-object v1, Lz/u0$i;->h:Lz/u0$i;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lz/u0$j;->f:Lz/u0;

    iget-object v0, v0, Lz/u0;->e:Lz/u0$i;

    sget-object v1, Lz/u0$i;->g:Lz/u0$i;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v3

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Attempt to handle open error from non open state: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lz/u0$j;->f:Lz/u0;

    iget-object v4, v4, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lx2/g;->j(ZLjava/lang/String;)V

    const-string v0, "Camera2CameraImpl"

    if-eq p2, v2, :cond_3

    const/4 v1, 0x2

    if-eq p2, v1, :cond_3

    const/4 v1, 0x4

    if-eq p2, v1, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error observed on open (or opening) camera device "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lz/u0;->g0(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " closing camera."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x3

    if-ne p2, p1, :cond_2

    const/4 p1, 0x5

    goto :goto_2

    :cond_2
    const/4 p1, 0x6

    :goto_2
    iget-object p2, p0, Lz/u0$j;->f:Lz/u0;

    sget-object v0, Lz/u0$i;->f:Lz/u0$i;

    invoke-static {p1}, Lg0/w$a;->a(I)Lg0/w$a;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lz/u0;->E0(Lz/u0$i;Lg0/w$a;)V

    iget-object p1, p0, Lz/u0$j;->f:Lz/u0;

    invoke-virtual {p1, v3}, Lz/u0;->V(Z)V

    return-void

    :cond_3
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Lz/u0;->g0(I)Ljava/lang/String;

    move-result-object v1

    filled-new-array {p1, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Attempt to reopen camera[%s] after error[%s]"

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lz/u0$j;->c(I)V

    return-void
.end method

.method public final c(I)V
    .locals 4

    iget-object v0, p0, Lz/u0$j;->f:Lz/u0;

    iget v0, v0, Lz/u0;->l:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v3, "Can only reopen camera device after error if the camera device is actually in an error state."

    invoke-static {v0, v3}, Lx2/g;->j(ZLjava/lang/String;)V

    const/4 v0, 0x2

    if-eq p1, v2, :cond_1

    if-eq p1, v0, :cond_2

    const/4 v2, 0x3

    goto :goto_1

    :cond_1
    move v2, v0

    :cond_2
    :goto_1
    iget-object p1, p0, Lz/u0$j;->f:Lz/u0;

    sget-object v0, Lz/u0$i;->h:Lz/u0$i;

    invoke-static {v2}, Lg0/w$a;->a(I)Lg0/w$a;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Lz/u0;->E0(Lz/u0$i;Lg0/w$a;)V

    iget-object p1, p0, Lz/u0$j;->f:Lz/u0;

    invoke-virtual {p1, v1}, Lz/u0;->V(Z)V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lz/u0$j;->e:Lz/u0$j$a;

    invoke-virtual {v0}, Lz/u0$j$a;->e()V

    return-void
.end method

.method public e()V
    .locals 5

    iget-object v0, p0, Lz/u0$j;->c:Lz/u0$j$b;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lx2/g;->i(Z)V

    iget-object v0, p0, Lz/u0$j;->d:Ljava/util/concurrent/ScheduledFuture;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    invoke-static {v1}, Lx2/g;->i(Z)V

    iget-object v0, p0, Lz/u0$j;->e:Lz/u0$j$a;

    invoke-virtual {v0}, Lz/u0$j$a;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lz/u0$j$b;

    iget-object v1, p0, Lz/u0$j;->a:Ljava/util/concurrent/Executor;

    invoke-direct {v0, p0, v1}, Lz/u0$j$b;-><init>(Lz/u0$j;Ljava/util/concurrent/Executor;)V

    iput-object v0, p0, Lz/u0$j;->c:Lz/u0$j$b;

    iget-object v0, p0, Lz/u0$j;->f:Lz/u0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Attempting camera re-open in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lz/u0$j;->e:Lz/u0$j$a;

    invoke-virtual {v2}, Lz/u0$j$a;->c()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "ms: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lz/u0$j;->c:Lz/u0$j$b;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " activeResuming = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lz/u0$j;->f:Lz/u0;

    iget-boolean v2, v2, Lz/u0;->J:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lz/u0;->a0(Ljava/lang/String;)V

    iget-object v0, p0, Lz/u0$j;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v1, p0, Lz/u0$j;->c:Lz/u0$j$b;

    iget-object v2, p0, Lz/u0$j;->e:Lz/u0$j$a;

    invoke-virtual {v2}, Lz/u0$j$a;->c()I

    move-result v2

    int-to-long v2, v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lz/u0$j;->d:Ljava/util/concurrent/ScheduledFuture;

    return-void

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Camera reopening attempted for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz/u0$j;->e:Lz/u0$j$a;

    invoke-virtual {v1}, Lz/u0$j$a;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "ms without success."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Camera2CameraImpl"

    invoke-static {v1, v0}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lz/u0$j;->f:Lz/u0;

    sget-object v1, Lz/u0$i;->d:Lz/u0$i;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Lz/u0;->F0(Lz/u0$i;Lg0/w$a;Z)V

    return-void
.end method

.method public f()Z
    .locals 3

    iget-object v0, p0, Lz/u0$j;->f:Lz/u0;

    iget-boolean v1, v0, Lz/u0;->J:Z

    if-eqz v1, :cond_1

    iget v0, v0, Lz/u0;->l:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public onClosed(Landroid/hardware/camera2/CameraDevice;)V
    .locals 5

    iget-object v0, p0, Lz/u0$j;->f:Lz/u0;

    const-string v1, "CameraDevice.onClosed()"

    invoke-virtual {v0, v1}, Lz/u0;->a0(Ljava/lang/String;)V

    iget-object v0, p0, Lz/u0$j;->f:Lz/u0;

    iget-object v0, v0, Lz/u0;->k:Landroid/hardware/camera2/CameraDevice;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unexpected onClose callback on camera device: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lx2/g;->j(ZLjava/lang/String;)V

    iget-object p1, p0, Lz/u0$j;->f:Lz/u0;

    iget-object p1, p1, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eq p1, v2, :cond_4

    const/4 v0, 0x5

    if-eq p1, v0, :cond_4

    const/4 v0, 0x6

    if-eq p1, v0, :cond_2

    const/4 v0, 0x7

    if-ne p1, v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Camera closed while in state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz/u0$j;->f:Lz/u0;

    iget-object v1, v1, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    iget-object p1, p0, Lz/u0$j;->f:Lz/u0;

    iget v0, p1, Lz/u0;->l:I

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Camera closed due to error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz/u0$j;->f:Lz/u0;

    iget v1, v1, Lz/u0;->l:I

    invoke-static {v1}, Lz/u0;->g0(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lz/u0;->a0(Ljava/lang/String;)V

    invoke-virtual {p0}, Lz/u0$j;->e()V

    return-void

    :cond_3
    invoke-virtual {p1, v1}, Lz/u0;->M0(Z)V

    return-void

    :cond_4
    iget-object p1, p0, Lz/u0$j;->f:Lz/u0;

    invoke-virtual {p1}, Lz/u0;->o0()Z

    move-result p1

    invoke-static {p1}, Lx2/g;->i(Z)V

    iget-object p1, p0, Lz/u0$j;->f:Lz/u0;

    invoke-static {p1}, Lz/u0;->P(Lz/u0;)V

    return-void
.end method

.method public onDisconnected(Landroid/hardware/camera2/CameraDevice;)V
    .locals 2

    iget-object v0, p0, Lz/u0$j;->f:Lz/u0;

    const-string v1, "CameraDevice.onDisconnected()"

    invoke-virtual {v0, v1}, Lz/u0;->a0(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lz/u0$j;->onError(Landroid/hardware/camera2/CameraDevice;I)V

    return-void
.end method

.method public onError(Landroid/hardware/camera2/CameraDevice;I)V
    .locals 4

    iget-object v0, p0, Lz/u0$j;->f:Lz/u0;

    iput-object p1, v0, Lz/u0;->k:Landroid/hardware/camera2/CameraDevice;

    iput p2, v0, Lz/u0;->l:I

    invoke-static {v0}, Lz/u0;->Q(Lz/u0;)Lz/u0$h;

    move-result-object v0

    invoke-virtual {v0}, Lz/u0$h;->b()V

    iget-object v0, p0, Lz/u0$j;->f:Lz/u0;

    iget-object v0, v0, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    const-string v2, "Camera2CameraImpl"

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onError() should not be possible from state: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lz/u0$j;->f:Lz/u0;

    iget-object v0, v0, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Lz/u0;->g0(I)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lz/u0$j;->f:Lz/u0;

    iget-object v3, v3, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v0, v1, v3}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error."

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lz/u0$j;->b(Landroid/hardware/camera2/CameraDevice;I)V

    return-void

    :cond_0
    :pswitch_1
    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Lz/u0;->g0(I)Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lz/u0$j;->f:Lz/u0;

    iget-object v0, v0, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    filled-new-array {p1, p2, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera."

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lz/u0$j;->f:Lz/u0;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lz/u0;->V(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public onOpened(Landroid/hardware/camera2/CameraDevice;)V
    .locals 3

    iget-object v0, p0, Lz/u0$j;->f:Lz/u0;

    const-string v1, "CameraDevice.onOpened()"

    invoke-virtual {v0, v1}, Lz/u0;->a0(Ljava/lang/String;)V

    iget-object v0, p0, Lz/u0$j;->f:Lz/u0;

    iput-object p1, v0, Lz/u0;->k:Landroid/hardware/camera2/CameraDevice;

    const/4 v1, 0x0

    iput v1, v0, Lz/u0;->l:I

    invoke-virtual {p0}, Lz/u0$j;->d()V

    iget-object v0, p0, Lz/u0$j;->f:Lz/u0;

    iget-object v0, v0, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x5

    if-eq v0, v1, :cond_3

    const/4 v1, 0x6

    if-eq v0, v1, :cond_1

    const/4 v1, 0x7

    if-eq v0, v1, :cond_1

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onOpened() should not be possible from state: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz/u0$j;->f:Lz/u0;

    iget-object v1, v1, Lz/u0;->e:Lz/u0$i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lz/u0$j;->f:Lz/u0;

    sget-object v1, Lz/u0$i;->j:Lz/u0$i;

    invoke-virtual {v0, v1}, Lz/u0;->D0(Lz/u0$i;)V

    iget-object v0, p0, Lz/u0$j;->f:Lz/u0;

    iget-object v0, v0, Lz/u0;->v:Ln0/g1;

    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lz/u0$j;->f:Lz/u0;

    iget-object v2, v1, Lz/u0;->u:Lh0/a;

    iget-object v1, v1, Lz/u0;->k:Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {v1}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lh0/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ln0/g1;->j(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lz/u0$j;->f:Lz/u0;

    invoke-virtual {p1}, Lz/u0;->v0()V

    :cond_2
    return-void

    :cond_3
    iget-object p1, p0, Lz/u0$j;->f:Lz/u0;

    invoke-virtual {p1}, Lz/u0;->o0()Z

    move-result p1

    invoke-static {p1}, Lx2/g;->i(Z)V

    iget-object p1, p0, Lz/u0$j;->f:Lz/u0;

    iget-object p1, p1, Lz/u0;->k:Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {p1}, Landroid/hardware/camera2/CameraDevice;->close()V

    iget-object p1, p0, Lz/u0$j;->f:Lz/u0;

    const/4 v0, 0x0

    iput-object v0, p1, Lz/u0;->k:Landroid/hardware/camera2/CameraDevice;

    return-void
.end method
