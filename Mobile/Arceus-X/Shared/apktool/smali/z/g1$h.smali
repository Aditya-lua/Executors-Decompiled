.class public Lz/g1$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/g1$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/g1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# static fields
.field public static final g:J


# instance fields
.field public final a:Lz/y;

.field public final b:I

.field public c:Z

.field public final d:Ljava/util/concurrent/Executor;

.field public final e:Ljava/util/concurrent/ScheduledExecutorService;

.field public final f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Lz/g1$h;->g:J

    return-void
.end method

.method public constructor <init>(Lz/y;ILjava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz/g1$h;->c:Z

    iput-object p1, p0, Lz/g1$h;->a:Lz/y;

    iput p2, p0, Lz/g1$h;->b:I

    iput-object p3, p0, Lz/g1$h;->d:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Lz/g1$h;->e:Ljava/util/concurrent/ScheduledExecutorService;

    iput-boolean p5, p0, Lz/g1$h;->f:Z

    return-void
.end method

.method public static synthetic d(Lz/g1$h;Ljava/lang/Void;)Lne/x;
    .locals 0

    iget-boolean p1, p0, Lz/g1$h;->f:Z

    if-eqz p1, :cond_0

    iget-object p0, p0, Lz/g1$h;->a:Lz/y;

    invoke-virtual {p0}, Lz/y;->I()Lz/h4;

    move-result-object p0

    invoke-virtual {p0}, Lz/h4;->Q()Lne/x;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    invoke-static {p0}, Lr0/n;->p(Ljava/lang/Object;)Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lz/g1$h;Ly1/c$a;)Ljava/lang/Object;
    .locals 1

    iget-object p0, p0, Lz/g1$h;->a:Lz/y;

    invoke-virtual {p0}, Lz/y;->U()Lz/x5;

    move-result-object p0

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lz/x5;->e(Ly1/c$a;I)V

    const-string p0, "TorchOn"

    return-object p0
.end method

.method public static synthetic f(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lz/g1;->d(Landroid/hardware/camera2/TotalCaptureResult;Z)Z

    move-result p0

    return p0
.end method

.method public static synthetic g(Landroid/hardware/camera2/TotalCaptureResult;)Ljava/lang/Boolean;
    .locals 0

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static synthetic h(Lz/g1$h;Ljava/lang/Void;)Lne/x;
    .locals 3

    sget-wide v0, Lz/g1$h;->g:J

    iget-object p1, p0, Lz/g1$h;->e:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object p0, p0, Lz/g1$h;->a:Lz/y;

    new-instance v2, Lz/j2;

    invoke-direct {v2}, Lz/j2;-><init>()V

    invoke-static {v0, v1, p1, p0, v2}, Lz/g1;->i(JLjava/util/concurrent/ScheduledExecutorService;Lz/y;Lz/g1$f$a;)Lne/x;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Landroid/hardware/camera2/TotalCaptureResult;)Lne/x;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/camera2/TotalCaptureResult;",
            ")",
            "Lne/x<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget v0, p0, Lz/g1$h;->b:I

    invoke-static {v0, p1}, Lz/g1;->e(ILandroid/hardware/camera2/TotalCaptureResult;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TorchTask#preCapture: isFlashRequired = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Camera2CapturePipeline"

    invoke-static {v1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget v0, p0, Lz/g1$h;->b:I

    invoke-static {v0, p1}, Lz/g1;->e(ILandroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lz/g1$h;->a:Lz/y;

    invoke-virtual {p1}, Lz/y;->b0()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "Low-light boost already on, not turn on"

    invoke-static {v1, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lz/g1$h;->a:Lz/y;

    invoke-virtual {p1}, Lz/y;->f0()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "Torch already on, not turn on"

    invoke-static {v1, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string p1, "Turn on torch"

    invoke-static {v1, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lz/g1$h;->c:Z

    new-instance p1, Lz/f2;

    invoke-direct {p1, p0}, Lz/f2;-><init>(Lz/g1$h;)V

    invoke-static {p1}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p1

    invoke-static {p1}, Lr0/d;->c(Lne/x;)Lr0/d;

    move-result-object p1

    new-instance v0, Lz/g2;

    invoke-direct {v0, p0}, Lz/g2;-><init>(Lz/g1$h;)V

    iget-object v1, p0, Lz/g1$h;->d:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, v0, v1}, Lr0/d;->g(Lr0/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object p1

    new-instance v0, Lz/h2;

    invoke-direct {v0, p0}, Lz/h2;-><init>(Lz/g1$h;)V

    iget-object v1, p0, Lz/g1$h;->d:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, v0, v1}, Lr0/d;->g(Lr0/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object p1

    new-instance v0, Lz/i2;

    invoke-direct {v0}, Lz/i2;-><init>()V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lr0/d;->f(Lt/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lr0/n;->p(Ljava/lang/Object;)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public b()Z
    .locals 1

    iget v0, p0, Lz/g1$h;->b:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c()V
    .locals 3

    iget-boolean v0, p0, Lz/g1$h;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz/g1$h;->a:Lz/y;

    invoke-virtual {v0}, Lz/y;->U()Lz/x5;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lz/x5;->e(Ly1/c$a;I)V

    const-string v0, "Camera2CapturePipeline"

    const-string v1, "Turning off torch"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p0, Lz/g1$h;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz/g1$h;->a:Lz/y;

    invoke-virtual {v0}, Lz/y;->I()Lz/h4;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v2, v1}, Lz/h4;->o(ZZ)V

    :cond_0
    return-void
.end method
