.class public Lz/g1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/g1$d;,
        Lz/g1$b;,
        Lz/g1$e;,
        Lz/g1$g;,
        Lz/g1$h;,
        Lz/g1$a;,
        Lz/g1$c;,
        Lz/g1$f;
    }
.end annotation


# instance fields
.field public final a:Lz/y;

.field public final b:Ld0/b0;

.field public final c:Z

.field public final d:Ln0/k3;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:Ljava/util/concurrent/ScheduledExecutorService;

.field public final g:Z

.field public h:I


# direct methods
.method public constructor <init>(Lz/y;La0/c0;Ln0/k3;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lz/g1;->h:I

    iput-object p1, p0, Lz/g1;->a:Lz/y;

    sget-object p1, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p2, p1}, La0/c0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lz/g1;->g:Z

    iput-object p4, p0, Lz/g1;->e:Ljava/util/concurrent/Executor;

    iput-object p5, p0, Lz/g1;->f:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p3, p0, Lz/g1;->d:Ln0/k3;

    new-instance p1, Ld0/b0;

    invoke-direct {p1, p3}, Ld0/b0;-><init>(Ln0/k3;)V

    iput-object p1, p0, Lz/g1;->b:Ld0/b0;

    new-instance p1, Lz/d1;

    invoke-direct {p1, p2}, Lz/d1;-><init>(La0/c0;)V

    invoke-static {p1}, Ld0/g;->a(Ld0/b;)Z

    move-result p1

    iput-boolean p1, p0, Lz/g1;->c:Z

    return-void
.end method

.method public static synthetic a(Lz/y;Lz/g1$f;)V
    .locals 0

    invoke-virtual {p0, p1}, Lz/y;->g0(Lz/y$c;)V

    return-void
.end method

.method public static d(Landroid/hardware/camera2/TotalCaptureResult;Z)Z
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    new-instance v0, Lz/h;

    invoke-direct {v0, p0}, Lz/h;-><init>(Landroid/hardware/camera2/CaptureResult;)V

    invoke-static {v0, p1}, Ln0/q1;->a(Ln0/e0;Z)Z

    move-result p0

    return p0
.end method

.method public static e(ILandroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "isFlashRequired: flashMode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Camera2CapturePipeline"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v2, 0x1

    if-eqz p0, :cond_3

    if-eq p0, v2, :cond_2

    const/4 p1, 0x2

    if-eq p0, p1, :cond_1

    const/4 p1, 0x3

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(I)V

    throw p1

    :cond_1
    return v0

    :cond_2
    :goto_0
    return v2

    :cond_3
    if-eqz p1, :cond_4

    sget-object p0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AE_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p1, p0}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    goto :goto_1

    :cond_4
    const/4 p0, 0x0

    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isFlashRequired: aeState = "

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    const/4 p1, 0x4

    if-ne p0, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public static i(JLjava/util/concurrent/ScheduledExecutorService;Lz/y;Lz/g1$f$a;)Lne/x;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            "Lz/y;",
            "Lz/g1$f$a;",
            ")",
            "Lne/x<",
            "Landroid/hardware/camera2/TotalCaptureResult;",
            ">;"
        }
    .end annotation

    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    const/4 v5, 0x1

    invoke-static {p3, p4}, Lz/g1;->j(Lz/y;Lz/g1$f$a;)Lne/x;

    move-result-object v6

    const/4 v4, 0x0

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lr0/n;->q(JLjava/util/concurrent/ScheduledExecutorService;Ljava/lang/Object;ZLne/x;)Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static j(Lz/y;Lz/g1$f$a;)Lne/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz/y;",
            "Lz/g1$f$a;",
            ")",
            "Lne/x<",
            "Landroid/hardware/camera2/TotalCaptureResult;",
            ">;"
        }
    .end annotation

    new-instance v0, Lz/g1$f;

    invoke-direct {v0, p1}, Lz/g1$f;-><init>(Lz/g1$f$a;)V

    invoke-virtual {p0, v0}, Lz/y;->B(Lz/y$c;)V

    invoke-virtual {v0}, Lz/g1$f;->c()Lne/x;

    move-result-object p1

    new-instance v1, Lz/c1;

    invoke-direct {v1, p0, v0}, Lz/c1;-><init>(Lz/y;Lz/g1$f;)V

    iget-object p0, p0, Lz/y;->c:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v1, p0}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object p1
.end method


# virtual methods
.method public b(III)Lz/g1$d;
    .locals 8

    new-instance v6, Ld0/n;

    iget-object v0, p0, Lz/g1;->d:Ln0/k3;

    invoke-direct {v6, v0}, Ld0/n;-><init>(Ln0/k3;)V

    new-instance v0, Lz/g1$d;

    iget v1, p0, Lz/g1;->h:I

    iget-object v2, p0, Lz/g1;->e:Ljava/util/concurrent/Executor;

    iget-object v3, p0, Lz/g1;->f:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v4, p0, Lz/g1;->a:Lz/y;

    iget-boolean v5, p0, Lz/g1;->g:Z

    invoke-direct/range {v0 .. v6}, Lz/g1$d;-><init>(ILjava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lz/y;ZLd0/n;)V

    if-nez p1, :cond_0

    new-instance v1, Lz/g1$b;

    iget-object v2, p0, Lz/g1;->a:Lz/y;

    invoke-direct {v1, v2}, Lz/g1$b;-><init>(Lz/y;)V

    invoke-virtual {v0, v1}, Lz/g1$d;->f(Lz/g1$e;)V

    :cond_0
    const/4 v1, 0x3

    if-ne p2, v1, :cond_2

    new-instance v1, Lz/g1$g;

    iget-object v2, p0, Lz/g1;->a:Lz/y;

    iget-object v3, p0, Lz/g1;->e:Ljava/util/concurrent/Executor;

    iget-object v4, p0, Lz/g1;->f:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v5, Ld0/a0;

    iget-object v6, p0, Lz/g1;->d:Ln0/k3;

    invoke-direct {v5, v6}, Ld0/a0;-><init>(Ln0/k3;)V

    invoke-direct {v1, v2, v3, v4, v5}, Lz/g1$g;-><init>(Lz/y;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Ld0/a0;)V

    invoke-virtual {v0, v1}, Lz/g1$d;->f(Lz/g1$e;)V

    :cond_1
    move v4, p2

    goto :goto_2

    :cond_2
    iget-boolean v1, p0, Lz/g1;->c:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0, p3}, Lz/g1;->f(I)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lz/g1;->b:Ld0/b0;

    invoke-virtual {v1}, Ld0/b0;->a()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lz/g1;->a:Lz/y;

    invoke-virtual {v1}, Lz/y;->a0()Z

    move-result v1

    if-nez v1, :cond_3

    const/4 v1, 0x1

    :goto_0
    move v7, v1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    new-instance v2, Lz/g1$h;

    iget-object v3, p0, Lz/g1;->a:Lz/y;

    iget-object v5, p0, Lz/g1;->e:Ljava/util/concurrent/Executor;

    iget-object v6, p0, Lz/g1;->f:Ljava/util/concurrent/ScheduledExecutorService;

    move v4, p2

    invoke-direct/range {v2 .. v7}, Lz/g1$h;-><init>(Lz/y;ILjava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Z)V

    invoke-virtual {v0, v2}, Lz/g1$d;->f(Lz/g1$e;)V

    goto :goto_2

    :cond_4
    move v4, p2

    new-instance p2, Lz/g1$a;

    iget-object v1, p0, Lz/g1;->a:Lz/y;

    invoke-direct {p2, v1, v4, v6}, Lz/g1$a;-><init>(Lz/y;ILd0/n;)V

    invoke-virtual {v0, p2}, Lz/g1$d;->f(Lz/g1$e;)V

    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "createPipeline: captureMode = "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", flashMode = "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", flashType = "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", pipeline tasks = "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, v0, Lz/g1$d;->h:Ljava/util/List;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Camera2CapturePipeline"

    invoke-static {p2, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public c(III)Lm0/m;
    .locals 1

    new-instance v0, Lz/g1$c;

    invoke-virtual {p0, p1, p2, p3}, Lz/g1;->b(III)Lz/g1$d;

    move-result-object p1

    iget-object p3, p0, Lz/g1;->e:Ljava/util/concurrent/Executor;

    invoke-direct {v0, p1, p3, p2}, Lz/g1$c;-><init>(Lz/g1$d;Ljava/util/concurrent/Executor;I)V

    return-object v0
.end method

.method public final f(I)Z
    .locals 3

    iget-object v0, p0, Lz/g1;->b:Ld0/b0;

    invoke-virtual {v0}, Ld0/b0;->a()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget v0, p0, Lz/g1;->h:I

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    return v1
.end method

.method public g(I)V
    .locals 0

    iput p1, p0, Lz/g1;->h:I

    return-void
.end method

.method public h(Ljava/util/List;III)Lne/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln0/l1;",
            ">;III)",
            "Lne/x<",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p0, p2, p3, p4}, Lz/g1;->b(III)Lz/g1$d;

    move-result-object p2

    invoke-virtual {p2, p1, p3}, Lz/g1$d;->i(Ljava/util/List;I)Lne/x;

    move-result-object p1

    invoke-static {p1}, Lr0/n;->s(Lne/x;)Lne/x;

    move-result-object p1

    return-object p1
.end method
