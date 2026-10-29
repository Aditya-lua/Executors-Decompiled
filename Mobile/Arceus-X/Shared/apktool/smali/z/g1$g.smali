.class public Lz/g1$g;
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
    name = "g"
.end annotation


# static fields
.field public static final f:J


# instance fields
.field public final a:Lz/y;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Ljava/util/concurrent/ScheduledExecutorService;

.field public final d:Lg0/f1$j;

.field public final e:Ld0/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Lz/g1$g;->f:J

    return-void
.end method

.method public constructor <init>(Lz/y;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Ld0/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/g1$g;->a:Lz/y;

    iput-object p2, p0, Lz/g1$g;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lz/g1$g;->c:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p4, p0, Lz/g1$g;->e:Ld0/a0;

    invoke-virtual {p1}, Lz/y;->N()Lg0/f1$j;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Lg0/f1$j;

    iput-object p1, p0, Lz/g1$g;->d:Lg0/f1$j;

    return-void
.end method

.method public static synthetic d(Lz/g1$g;Ljava/util/concurrent/atomic/AtomicReference;Ly1/c$a;)V
    .locals 5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "Camera2CapturePipeline"

    const-string v1, "ScreenFlashTask#preCapture: invoking applyScreenFlashUi"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p0, p0, Lz/g1$g;->d:Lg0/f1$j;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x3

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg0/f1$k;

    invoke-interface {p0, v0, v1, p1}, Lg0/f1$j;->a(JLg0/f1$k;)V

    const/4 p0, 0x0

    invoke-virtual {p2, p0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic e(Landroid/hardware/camera2/TotalCaptureResult;)Ljava/lang/Boolean;
    .locals 0

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static synthetic f(Lz/g1$g;Ljava/lang/Void;)Lne/x;
    .locals 3

    sget-wide v0, Lz/g1$g;->f:J

    iget-object p1, p0, Lz/g1$g;->c:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object p0, p0, Lz/g1$g;->a:Lz/y;

    new-instance v2, Lz/u1;

    invoke-direct {v2}, Lz/u1;-><init>()V

    invoke-static {v0, v1, p1, p0, v2}, Lz/g1;->i(JLjava/util/concurrent/ScheduledExecutorService;Lz/y;Lz/g1$f$a;)Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lz/g1$g;Ljava/lang/Void;)Lne/x;
    .locals 0

    iget-object p0, p0, Lz/g1$g;->a:Lz/y;

    invoke-virtual {p0}, Lz/y;->I()Lz/h4;

    move-result-object p0

    invoke-virtual {p0}, Lz/h4;->Q()Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lz/g1$g;Ljava/lang/Void;)Lne/x;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lz/s1;

    invoke-direct {p1, p0}, Lz/s1;-><init>(Lz/g1$g;)V

    invoke-static {p1}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i()V
    .locals 2

    const-string v0, "Camera2CapturePipeline"

    const-string v1, "enableExternalFlashAeMode disabled"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static synthetic j(Lz/g1$g;Ljava/util/concurrent/atomic/AtomicReference;Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Lz/t1;

    invoke-direct {v1, p0, p1, p2}, Lz/t1;-><init>(Lz/g1$g;Ljava/util/concurrent/atomic/AtomicReference;Ly1/c$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p0, "OnScreenFlashStart"

    return-object p0
.end method

.method public static synthetic k(Ly1/c$a;)V
    .locals 2

    const-string v0, "Camera2CapturePipeline"

    const-string v1, "ScreenFlashTask#preCapture: UI change applied"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic l(Lz/g1$g;Ly1/c$a;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lz/g1$g;->e:Ld0/a0;

    invoke-virtual {v0}, Ld0/a0;->a()Z

    move-result v0

    const-string v1, "EnableTorchInternal"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p1, v2}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-object v1

    :cond_0
    const-string v0, "Camera2CapturePipeline"

    const-string v3, "ScreenFlashTask#preCapture: enable torch"

    invoke-static {v0, v3}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p0, p0, Lz/g1$g;->a:Lz/y;

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lz/y;->F(I)V

    invoke-virtual {p1, v2}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    return-object v1
.end method

.method public static synthetic m(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lz/g1;->d(Landroid/hardware/camera2/TotalCaptureResult;Z)Z

    move-result p0

    return p0
.end method

.method public static synthetic n(Ljava/util/concurrent/atomic/AtomicReference;Ly1/c$a;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lz/v1;

    invoke-direct {v0, p1}, Lz/v1;-><init>(Ly1/c$a;)V

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    const-string p0, "OnScreenFlashUiApplied"

    return-object p0
.end method

.method public static synthetic o(Lz/g1$g;Ljava/lang/Void;)Lne/x;
    .locals 0

    iget-object p0, p0, Lz/g1$g;->a:Lz/y;

    invoke-virtual {p0}, Lz/y;->I()Lz/h4;

    move-result-object p0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lz/h4;->v(Z)Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lz/g1$g;Lne/x;Ljava/lang/Object;)Lne/x;
    .locals 8

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v0, 0x3

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    iget-object v4, p0, Lz/g1$g;->c:Ljava/util/concurrent/ScheduledExecutorService;

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v7, p1

    invoke-static/range {v2 .. v7}, Lr0/n;->q(JLjava/util/concurrent/ScheduledExecutorService;Ljava/lang/Object;ZLne/x;)Lne/x;

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

    const-string p1, "Camera2CapturePipeline"

    const-string v0, "ScreenFlashTask#preCapture"

    invoke-static {p1, v0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    new-instance v0, Lz/x1;

    invoke-direct {v0, p1}, Lz/x1;-><init>(Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object v0

    new-instance v1, Lz/y1;

    invoke-direct {v1, p0, p1}, Lz/y1;-><init>(Lz/g1$g;Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-static {v1}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p1

    invoke-static {p1}, Lr0/d;->c(Lne/x;)Lr0/d;

    move-result-object p1

    new-instance v1, Lz/z1;

    invoke-direct {v1, p0}, Lz/z1;-><init>(Lz/g1$g;)V

    iget-object v2, p0, Lz/g1$g;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, v1, v2}, Lr0/d;->g(Lr0/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object p1

    new-instance v1, Lz/a2;

    invoke-direct {v1, p0}, Lz/a2;-><init>(Lz/g1$g;)V

    iget-object v2, p0, Lz/g1$g;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, v1, v2}, Lr0/d;->g(Lr0/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object p1

    new-instance v1, Lz/b2;

    invoke-direct {v1, p0, v0}, Lz/b2;-><init>(Lz/g1$g;Lne/x;)V

    iget-object v0, p0, Lz/g1$g;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, v1, v0}, Lr0/d;->g(Lr0/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object p1

    new-instance v0, Lz/c2;

    invoke-direct {v0, p0}, Lz/c2;-><init>(Lz/g1$g;)V

    iget-object v1, p0, Lz/g1$g;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, v0, v1}, Lr0/d;->g(Lr0/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object p1

    new-instance v0, Lz/d2;

    invoke-direct {v0, p0}, Lz/d2;-><init>(Lz/g1$g;)V

    iget-object v1, p0, Lz/g1$g;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, v0, v1}, Lr0/d;->g(Lr0/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object p1

    new-instance v0, Lz/e2;

    invoke-direct {v0}, Lz/e2;-><init>()V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lr0/d;->f(Lt/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object p1

    return-object p1
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c()V
    .locals 4

    const-string v0, "Camera2CapturePipeline"

    const-string v1, "ScreenFlashTask#postCapture"

    invoke-static {v0, v1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lz/g1$g;->e:Ld0/a0;

    invoke-virtual {v0}, Ld0/a0;->a()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz/g1$g;->a:Lz/y;

    invoke-virtual {v0, v1}, Lz/y;->F(I)V

    :cond_0
    iget-object v0, p0, Lz/g1$g;->a:Lz/y;

    invoke-virtual {v0}, Lz/y;->I()Lz/h4;

    move-result-object v0

    invoke-virtual {v0, v1}, Lz/h4;->v(Z)Lne/x;

    move-result-object v0

    new-instance v2, Lz/r1;

    invoke-direct {v2}, Lz/r1;-><init>()V

    iget-object v3, p0, Lz/g1$g;->b:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v2, v3}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object v0, p0, Lz/g1$g;->a:Lz/y;

    invoke-virtual {v0}, Lz/y;->I()Lz/h4;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lz/h4;->o(ZZ)V

    invoke-static {}, Lq0/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iget-object v1, p0, Lz/g1$g;->d:Lg0/f1$j;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lz/w1;

    invoke-direct {v2, v1}, Lz/w1;-><init>(Lg0/f1$j;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
