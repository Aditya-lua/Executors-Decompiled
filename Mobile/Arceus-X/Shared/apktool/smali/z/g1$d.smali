.class public Lz/g1$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/g1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# static fields
.field public static final j:J

.field public static final k:J


# instance fields
.field public final a:I

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Ljava/util/concurrent/ScheduledExecutorService;

.field public final d:Lz/y;

.field public final e:Ld0/n;

.field public final f:Z

.field public g:J

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lz/g1$e;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Lz/g1$e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v1

    sput-wide v1, Lz/g1$d;->j:J

    const-wide/16 v1, 0x5

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Lz/g1$d;->k:J

    return-void
.end method

.method public constructor <init>(ILjava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lz/y;ZLd0/n;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-wide v0, Lz/g1$d;->j:J

    iput-wide v0, p0, Lz/g1$d;->g:J

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lz/g1$d;->h:Ljava/util/List;

    new-instance v0, Lz/g1$d$a;

    invoke-direct {v0, p0}, Lz/g1$d$a;-><init>(Lz/g1$d;)V

    iput-object v0, p0, Lz/g1$d;->i:Lz/g1$e;

    iput p1, p0, Lz/g1$d;->a:I

    iput-object p2, p0, Lz/g1$d;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lz/g1$d;->c:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p4, p0, Lz/g1$d;->d:Lz/y;

    iput-boolean p5, p0, Lz/g1$d;->f:Z

    iput-object p6, p0, Lz/g1$d;->e:Ld0/n;

    return-void
.end method

.method public static synthetic a(Lz/g1$d;ILandroid/hardware/camera2/TotalCaptureResult;)Lne/x;
    .locals 2

    iget-object v0, p0, Lz/g1$d;->d:Lz/y;

    invoke-virtual {v0}, Lz/y;->b0()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1, p2}, Lz/g1;->e(ILandroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-wide v0, Lz/g1$d;->k:J

    invoke-virtual {p0, v0, v1}, Lz/g1$d;->l(J)V

    :cond_0
    iget-object p0, p0, Lz/g1$d;->i:Lz/g1$e;

    invoke-interface {p0, p2}, Lz/g1$e;->a(Landroid/hardware/camera2/TotalCaptureResult;)Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lz/g1$d;Ljava/util/List;ILandroid/hardware/camera2/TotalCaptureResult;)Lne/x;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lz/g1$d;->m(Ljava/util/List;I)Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lz/g1;->d(Landroid/hardware/camera2/TotalCaptureResult;Z)Z

    move-result p0

    return p0
.end method

.method public static synthetic d(Lz/g1$d;Ljava/lang/Boolean;)Lne/x;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-wide v0, p0, Lz/g1$d;->g:J

    iget-object p1, p0, Lz/g1$d;->c:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object p0, p0, Lz/g1$d;->d:Lz/y;

    new-instance v2, Lz/o1;

    invoke-direct {v2}, Lz/o1;-><init>()V

    invoke-static {v0, v1, p1, p0, v2}, Lz/g1;->i(JLjava/util/concurrent/ScheduledExecutorService;Lz/y;Lz/g1$f$a;)Lne/x;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    invoke-static {p0}, Lr0/n;->p(Ljava/lang/Object;)Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lz/g1$d;Ln0/l1$a;Ly1/c$a;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lz/g1$d$b;

    invoke-direct {v0, p0, p2}, Lz/g1$d$b;-><init>(Lz/g1$d;Ly1/c$a;)V

    invoke-virtual {p1, v0}, Ln0/l1$a;->c(Ln0/u;)V

    const-string p0, "submitStillCapture"

    return-object p0
.end method


# virtual methods
.method public f(Lz/g1$e;)V
    .locals 1

    iget-object v0, p0, Lz/g1$d;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final g(Ln0/l1$a;)V
    .locals 3

    new-instance v0, Ly/a$a;

    invoke-direct {v0}, Ly/a$a;-><init>()V

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ly/a$a;->f(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Ly/a$a;

    invoke-virtual {v0}, Ly/a$a;->b()Ly/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Ln0/l1$a;->e(Ln0/n1;)V

    return-void
.end method

.method public final h(Ln0/l1$a;Ln0/l1;)V
    .locals 3

    iget v0, p0, Lz/g1$d;->a:I

    const/4 v1, 0x3

    const/4 v2, -0x1

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lz/g1$d;->f:Z

    if-nez v0, :cond_0

    const/4 p2, 0x4

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Ln0/l1;->k()I

    move-result v0

    if-eq v0, v2, :cond_2

    invoke-virtual {p2}, Ln0/l1;->k()I

    move-result p2

    const/4 v0, 0x5

    if-ne p2, v0, :cond_1

    goto :goto_0

    :cond_1
    move p2, v2

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p2, 0x2

    :goto_1
    if-eq p2, v2, :cond_3

    invoke-virtual {p1, p2}, Ln0/l1$a;->v(I)V

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "applyStillCaptureTemplate: templateToModify = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Camera2CapturePipeline"

    invoke-static {p2, p1}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public i(Ljava/util/List;I)Lne/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln0/l1;",
            ">;I)",
            "Lne/x<",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p0, p2}, Lz/g1$d;->k(I)Lne/x;

    move-result-object v0

    invoke-static {v0}, Lr0/d;->c(Lne/x;)Lr0/d;

    move-result-object v0

    new-instance v1, Lz/j1;

    invoke-direct {v1, p0, p1, p2}, Lz/j1;-><init>(Lz/g1$d;Ljava/util/List;I)V

    iget-object p1, p0, Lz/g1$d;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, p1}, Lr0/d;->g(Lr0/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object p1

    new-instance p2, Lz/k1;

    invoke-direct {p2, p0}, Lz/k1;-><init>(Lz/g1$d;)V

    iget-object v0, p0, Lz/g1$d;->b:Ljava/util/concurrent/Executor;

    invoke-interface {p1, p2, v0}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object p1
.end method

.method public j()V
    .locals 1

    iget-object v0, p0, Lz/g1$d;->i:Lz/g1$e;

    invoke-interface {v0}, Lz/g1$e;->c()V

    return-void
.end method

.method public k(I)Lne/x;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lne/x<",
            "Landroid/hardware/camera2/TotalCaptureResult;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, Lr0/n;->p(Ljava/lang/Object;)Lne/x;

    move-result-object v1

    iget-object v2, p0, Lz/g1$d;->h:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v1, p0, Lz/g1$d;->i:Lz/g1$e;

    invoke-interface {v1}, Lz/g1$e;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lz/g1$d;->d:Lz/y;

    invoke-static {v1, v0}, Lz/g1;->j(Lz/y;Lz/g1$f$a;)Lne/x;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lr0/n;->p(Ljava/lang/Object;)Lne/x;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lr0/d;->c(Lne/x;)Lr0/d;

    move-result-object v0

    new-instance v1, Lz/m1;

    invoke-direct {v1, p0, p1}, Lz/m1;-><init>(Lz/g1$d;I)V

    iget-object p1, p0, Lz/g1$d;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, p1}, Lr0/d;->g(Lr0/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object p1

    new-instance v0, Lz/n1;

    invoke-direct {v0, p0}, Lz/n1;-><init>(Lz/g1$d;)V

    iget-object v1, p0, Lz/g1$d;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, v0, v1}, Lr0/d;->g(Lr0/a;Ljava/util/concurrent/Executor;)Lr0/d;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v1
.end method

.method public final l(J)V
    .locals 0

    iput-wide p1, p0, Lz/g1$d;->g:J

    return-void
.end method

.method public m(Ljava/util/List;I)Lne/x;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln0/l1;",
            ">;I)",
            "Lne/x<",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/l1;

    invoke-static {v2}, Ln0/l1$a;->k(Ln0/l1;)Ln0/l1$a;

    move-result-object v3

    invoke-virtual {v2}, Ln0/l1;->k()I

    move-result v4

    const/4 v5, 0x5

    const/4 v6, 0x0

    if-ne v4, v5, :cond_2

    iget-object v4, p0, Lz/g1$d;->d:Lz/y;

    invoke-virtual {v4}, Lz/y;->X()Lz/i6;

    move-result-object v4

    invoke-interface {v4}, Lz/i6;->h()Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, p0, Lz/g1$d;->d:Lz/y;

    invoke-virtual {v4}, Lz/y;->X()Lz/i6;

    move-result-object v4

    invoke-interface {v4}, Lz/i6;->c()Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, p0, Lz/g1$d;->d:Lz/y;

    invoke-virtual {v4}, Lz/y;->X()Lz/i6;

    move-result-object v4

    invoke-interface {v4}, Lz/i6;->f()Landroidx/camera/core/d;

    move-result-object v4

    const-string v5, "Camera2CapturePipeline"

    if-eqz v4, :cond_1

    iget-object v7, p0, Lz/g1$d;->d:Lz/y;

    invoke-virtual {v7}, Lz/y;->X()Lz/i6;

    move-result-object v7

    invoke-interface {v7, v4}, Lz/i6;->g(Landroidx/camera/core/d;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v4}, Landroidx/camera/core/d;->H2()Lg0/i1;

    move-result-object v5

    invoke-static {v5}, Ln0/f0;->a(Lg0/i1;)Ln0/e0;

    move-result-object v6

    goto :goto_1

    :cond_0
    const-string v7, "Failed to enqueue image to image writer"

    invoke-static {v5, v7}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    if-nez v6, :cond_2

    invoke-interface {v4}, Landroidx/camera/core/d;->close()V

    goto :goto_2

    :cond_1
    const-string v4, "ZSL capture skipped due to no valid buffer image"

    invoke-static {v5, v4}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_2
    if-eqz v6, :cond_3

    invoke-virtual {v3, v6}, Ln0/l1$a;->p(Ln0/e0;)V

    goto :goto_3

    :cond_3
    invoke-virtual {p0, v3, v2}, Lz/g1$d;->h(Ln0/l1$a;Ln0/l1;)V

    :goto_3
    iget-object v2, p0, Lz/g1$d;->e:Ld0/n;

    invoke-virtual {v2, p2}, Ld0/n;->c(I)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, v3}, Lz/g1$d;->g(Ln0/l1$a;)V

    :cond_4
    new-instance v2, Lz/l1;

    invoke-direct {v2, p0, v3}, Lz/l1;-><init>(Lz/g1$d;Ln0/l1$a;)V

    invoke-static {v2}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Ln0/l1$a;->h()Ln0/l1;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_5
    iget-object p1, p0, Lz/g1$d;->d:Lz/y;

    invoke-virtual {p1, v1}, Lz/y;->q0(Ljava/util/List;)V

    invoke-static {v0}, Lr0/n;->k(Ljava/util/Collection;)Lne/x;

    move-result-object p1

    return-object p1
.end method
