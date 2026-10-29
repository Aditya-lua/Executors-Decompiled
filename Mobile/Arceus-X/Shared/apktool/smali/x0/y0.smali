.class public Lx0/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/r0;


# instance fields
.field public final a:Lg0/k2;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lx2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/a<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lg0/n;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lg0/n;->f()Lg0/k2;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lg0/k2;

    iput-object v0, p0, Lx0/y0;->a:Lg0/k2;

    invoke-virtual {p1}, Lg0/n;->c()Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lx0/y0;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p1}, Lg0/n;->b()Lx2/a;

    move-result-object p1

    iput-object p1, p0, Lx0/y0;->c:Lx2/a;

    return-void
.end method

.method public static synthetic e(Lx0/y0;Lg0/j2;)V
    .locals 0

    iget-object p0, p0, Lx0/y0;->a:Lg0/k2;

    invoke-interface {p0, p1}, Lg0/k2;->d(Lg0/j2;)V

    return-void
.end method

.method public static synthetic f(Lx0/y0;Lg0/v2;)V
    .locals 0

    iget-object p0, p0, Lx0/y0;->a:Lg0/k2;

    invoke-interface {p0, p1}, Lg0/k2;->b(Lg0/v2;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(Lg0/v2;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx0/y0;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lx0/w0;

    invoke-direct {v1, p0, p1}, Lx0/w0;-><init>(Lx0/y0;Lg0/v2;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p1, "SurfaceProcessor"

    const-string v0, "SurfaceProcessor failed due to executor shutdown"

    invoke-static {p1, v0}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public c(II)Lne/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Snapshot not supported by external SurfaceProcessor"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lr0/n;->n(Ljava/lang/Throwable;)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public d(Lg0/j2;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx0/y0;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lx0/x0;

    invoke-direct {v1, p0, p1}, Lx0/x0;-><init>(Lx0/y0;Lg0/j2;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p1, "SurfaceProcessor"

    const-string v0, "SurfaceProcessor failed due to executor shutdown"

    invoke-static {p1, v0}, Lg0/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SurfaceProcessorWithExecutor("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx0/y0;->a:Lg0/k2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
