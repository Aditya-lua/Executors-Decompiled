.class public final Lz/x5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lz/y;

.field public final b:Landroidx/lifecycle/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/d0<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Landroidx/lifecycle/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/d0<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Z

.field public final e:Ljava/util/concurrent/Executor;

.field public f:Z

.field public g:Z

.field public h:I

.field public i:I

.field public j:Ly1/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public k:Ly1/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public l:Z


# direct methods
.method public constructor <init>(Lz/y;La0/c0;Ljava/util/concurrent/Executor;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/x5;->a:Lz/y;

    iput-object p3, p0, Lz/x5;->e:Ljava/util/concurrent/Executor;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p3, Lz/d1;

    invoke-direct {p3, p2}, Lz/d1;-><init>(La0/c0;)V

    invoke-static {p3}, Ld0/g;->a(Ld0/b;)Z

    move-result p3

    iput-boolean p3, p0, Lz/x5;->d:Z

    invoke-virtual {p2}, La0/c0;->h()Z

    move-result v0

    iput-boolean v0, p0, Lz/x5;->g:Z

    const/4 v1, 0x0

    if-eqz p3, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, La0/c0;->c()I

    move-result p2

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    iput p2, p0, Lz/x5;->h:I

    iput p2, p0, Lz/x5;->i:I

    new-instance p2, Landroidx/lifecycle/d0;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p2, p3}, Landroidx/lifecycle/d0;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lz/x5;->b:Landroidx/lifecycle/d0;

    new-instance p2, Landroidx/lifecycle/d0;

    iget p3, p0, Lz/x5;->h:I

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p2, p3}, Landroidx/lifecycle/d0;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lz/x5;->c:Landroidx/lifecycle/d0;

    new-instance p2, Lz/w5;

    invoke-direct {p2, p0}, Lz/w5;-><init>(Lz/x5;)V

    invoke-virtual {p1, p2}, Lz/y;->B(Lz/y$c;)V

    return-void
.end method

.method public static synthetic a(Lz/x5;Ly1/c$a;I)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lz/x5;->e(Ly1/c$a;I)V

    return-void
.end method

.method public static synthetic b(Lz/x5;Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 4

    iget-object v0, p0, Lz/x5;->k:Ly1/c$a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/hardware/camera2/CaptureResult;->getRequest()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v0

    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {v0, v3}, Landroid/hardware/camera2/CaptureRequest;->get(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-boolean v3, p0, Lz/x5;->l:Z

    if-ne v0, v3, :cond_1

    iget-object v0, p0, Lz/x5;->k:Ly1/c$a;

    invoke-virtual {v0, v2}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    iput-object v2, p0, Lz/x5;->k:Ly1/c$a;

    :cond_1
    iget-boolean v0, p0, Lz/x5;->g:Z

    if-eqz v0, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x23

    if-lt v0, v3, :cond_2

    iget-object v0, p0, Lz/x5;->j:Ly1/c$a;

    if-eqz v0, :cond_2

    sget-object v0, Landroid/hardware/camera2/CaptureResult;->FLASH_STRENGTH_LEVEL:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p1, v0}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget v0, p0, Lz/x5;->i:I

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lz/x5;->j:Ly1/c$a;

    invoke-virtual {p1, v2}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    iput-object v2, p0, Lz/x5;->j:Ly1/c$a;

    :cond_2
    return v1
.end method

.method public static synthetic c(Lz/x5;IZLy1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lz/x5;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Lz/u5;

    invoke-direct {v1, p0, p3, p1}, Lz/u5;-><init>(Lz/x5;Ly1/c$a;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "enableTorch: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public d(Z)Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, Lz/x5;->d:Z

    if-nez v0, :cond_0

    const-string p1, "TorchControl"

    const-string v0, "Unable to enableTorch due to there is no flash unit."

    invoke-static {p1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No flash unit"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lz/x5;->k(I)V

    new-instance v0, Lz/v5;

    invoke-direct {v0, p0, p1, p1}, Lz/v5;-><init>(Lz/x5;IZ)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public e(Ly1/c$a;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;I)V"
        }
    .end annotation

    iget-boolean v0, p0, Lz/x5;->d:Z

    if-nez v0, :cond_0

    if-eqz p1, :cond_2

    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v0, "No flash unit"

    invoke-direct {p2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    return-void

    :cond_0
    iget-boolean v0, p0, Lz/x5;->f:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0, v1}, Lz/x5;->k(I)V

    if-eqz p1, :cond_2

    new-instance p2, Lg0/m$a;

    const-string v0, "Camera is not active."

    invoke-direct {p2, v0}, Lg0/m$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    return-void

    :cond_1
    iget-object v0, p0, Lz/x5;->a:Lz/y;

    invoke-virtual {v0}, Lz/y;->b0()Z

    move-result v0

    if-eqz v0, :cond_3

    if-eqz p1, :cond_2

    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v0, "Torch can not be enabled when low-light boost is on!"

    invoke-direct {p2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    :cond_2
    return-void

    :cond_3
    if-eqz p2, :cond_4

    const/4 v1, 0x1

    :cond_4
    iput-boolean v1, p0, Lz/x5;->l:Z

    iget-object v0, p0, Lz/x5;->a:Lz/y;

    invoke-virtual {v0, p2}, Lz/y;->F(I)V

    invoke-virtual {p0, p2}, Lz/x5;->k(I)V

    iget-object p2, p0, Lz/x5;->k:Ly1/c$a;

    if-eqz p2, :cond_5

    new-instance v0, Lg0/m$a;

    const-string v1, "There is a new enableTorch being set"

    invoke-direct {v0, v1}, Lg0/m$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    :cond_5
    iput-object p1, p0, Lz/x5;->k:Ly1/c$a;

    return-void
.end method

.method public f()V
    .locals 1

    iget-boolean v0, p0, Lz/x5;->l:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lz/x5;->l:Z

    invoke-virtual {p0, v0}, Lz/x5;->k(I)V

    return-void
.end method

.method public g()Landroidx/lifecycle/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/a0<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz/x5;->b:Landroidx/lifecycle/d0;

    return-object v0
.end method

.method public h()Landroidx/lifecycle/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/a0<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz/x5;->c:Landroidx/lifecycle/d0;

    return-object v0
.end method

.method public i(Z)V
    .locals 3

    iget-boolean v0, p0, Lz/x5;->f:Z

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean p1, p0, Lz/x5;->f:Z

    if-nez p1, :cond_3

    iget-boolean p1, p0, Lz/x5;->l:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    iput-boolean p1, p0, Lz/x5;->l:Z

    iget v0, p0, Lz/x5;->h:I

    iput v0, p0, Lz/x5;->i:I

    iget-object v0, p0, Lz/x5;->a:Lz/y;

    invoke-virtual {v0, p1}, Lz/y;->F(I)V

    invoke-virtual {p0, p1}, Lz/x5;->k(I)V

    iget-object p1, p0, Lz/x5;->c:Landroidx/lifecycle/d0;

    iget v0, p0, Lz/x5;->h:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lz/x5;->j(Landroidx/lifecycle/d0;Ljava/lang/Object;)V

    :cond_1
    iget-object p1, p0, Lz/x5;->k:Ly1/c$a;

    const/4 v0, 0x0

    const-string v1, "Camera is not active."

    if-eqz p1, :cond_2

    new-instance v2, Lg0/m$a;

    invoke-direct {v2, v1}, Lg0/m$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    iput-object v0, p0, Lz/x5;->k:Ly1/c$a;

    :cond_2
    iget-object p1, p0, Lz/x5;->j:Ly1/c$a;

    if-eqz p1, :cond_3

    new-instance v2, Lg0/m$a;

    invoke-direct {v2, v1}, Lg0/m$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    iput-object v0, p0, Lz/x5;->j:Ly1/c$a;

    :cond_3
    :goto_0
    return-void
.end method

.method public final j(Landroidx/lifecycle/d0;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/lifecycle/d0<",
            "TT;>;TT;)V"
        }
    .end annotation

    invoke-static {}, Lp0/z;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2}, Landroidx/lifecycle/d0;->o(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p1, p2}, Landroidx/lifecycle/d0;->m(Ljava/lang/Object;)V

    return-void
.end method

.method public final k(I)V
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x0

    :cond_0
    iget-object p1, p0, Lz/x5;->b:Landroidx/lifecycle/d0;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lz/x5;->j(Landroidx/lifecycle/d0;Ljava/lang/Object;)V

    return-void
.end method
