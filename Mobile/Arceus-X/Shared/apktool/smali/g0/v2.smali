.class public final Lg0/v2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg0/v2$h;,
        Lg0/v2$i;,
        Lg0/v2$g;,
        Lg0/v2$f;
    }
.end annotation


# static fields
.field public static final q:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Landroid/util/Size;

.field public final c:Lg0/k0;

.field public final d:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ln0/p0;

.field public final f:Z

.field public final g:I

.field public final h:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ly1/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/c$a<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Ly1/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Ly1/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final m:Ln0/u1;

.field public n:Lg0/v2$h;

.field public o:Lg0/v2$i;

.field public p:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ln0/t3;->a:Landroid/util/Range;

    sput-object v0, Lg0/v2;->q:Landroid/util/Range;

    return-void
.end method

.method public constructor <init>(Landroid/util/Size;Ln0/p0;ZLg0/k0;ILandroid/util/Range;Ljava/lang/Runnable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Size;",
            "Ln0/p0;",
            "Z",
            "Lg0/k0;",
            "I",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/Runnable;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lg0/v2;->a:Ljava/lang/Object;

    iput-object p1, p0, Lg0/v2;->b:Landroid/util/Size;

    iput-object p2, p0, Lg0/v2;->e:Ln0/p0;

    iput-boolean p3, p0, Lg0/v2;->f:Z

    invoke-virtual {p4}, Lg0/k0;->e()Z

    move-result p2

    const-string p3, "SurfaceRequest\'s DynamicRange must always be fully specified."

    invoke-static {p2, p3}, Lx2/g;->b(ZLjava/lang/Object;)V

    iput-object p4, p0, Lg0/v2;->c:Lg0/k0;

    iput p5, p0, Lg0/v2;->g:I

    iput-object p6, p0, Lg0/v2;->d:Landroid/util/Range;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "SurfaceRequest[size: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, ", id: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "]"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p4, 0x0

    invoke-direct {p3, p4}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    new-instance p5, Lg0/m2;

    invoke-direct {p5, p3, p2}, Lg0/m2;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;)V

    invoke-static {p5}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p5

    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ly1/c$a;

    invoke-static {p3}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ly1/c$a;

    iput-object p3, p0, Lg0/v2;->l:Ly1/c$a;

    new-instance p6, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p6, p4}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    new-instance v0, Lg0/n2;

    invoke-direct {v0, p6, p2}, Lg0/n2;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object v0

    iput-object v0, p0, Lg0/v2;->j:Lne/x;

    new-instance v1, Lg0/v2$a;

    invoke-direct {v1, p0, p3, p5}, Lg0/v2$a;-><init>(Lg0/v2;Ly1/c$a;Lne/x;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object p3

    invoke-static {v0, v1, p3}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p6}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ly1/c$a;

    invoke-static {p3}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ly1/c$a;

    new-instance p5, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p5, p4}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    new-instance p4, Lg0/o2;

    invoke-direct {p4, p5, p2}, Lg0/o2;-><init>(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;)V

    invoke-static {p4}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p4

    iput-object p4, p0, Lg0/v2;->h:Lne/x;

    invoke-virtual {p5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ly1/c$a;

    invoke-static {p5}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ly1/c$a;

    iput-object p5, p0, Lg0/v2;->i:Ly1/c$a;

    new-instance p5, Lg0/v2$b;

    const/16 p6, 0x22

    invoke-direct {p5, p0, p1, p6}, Lg0/v2$b;-><init>(Lg0/v2;Landroid/util/Size;I)V

    iput-object p5, p0, Lg0/v2;->m:Ln0/u1;

    invoke-virtual {p5}, Ln0/u1;->k()Lne/x;

    move-result-object p1

    new-instance p5, Lg0/v2$c;

    invoke-direct {p5, p0, p1, p3, p2}, Lg0/v2$c;-><init>(Lg0/v2;Lne/x;Ly1/c$a;Ljava/lang/String;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object p2

    invoke-static {p4, p5, p2}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    new-instance p2, Lg0/p2;

    invoke-direct {p2, p0}, Lg0/p2;-><init>(Lg0/v2;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-virtual {p0, p1, p7}, Lg0/v2;->s(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)Ly1/c$a;

    move-result-object p1

    iput-object p1, p0, Lg0/v2;->k:Ly1/c$a;

    return-void
.end method

.method public static synthetic a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ly1/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-cancellation"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lg0/v2$i;Lg0/v2$h;)V
    .locals 0

    invoke-interface {p0, p1}, Lg0/v2$i;->a(Lg0/v2$h;)V

    return-void
.end method

.method public static synthetic c(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ly1/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-Surface"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lg0/v2;)V
    .locals 1

    iget-object p0, p0, Lg0/v2;->h:Lne/x;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    return-void
.end method

.method public static synthetic e(Lx2/a;Landroid/view/Surface;)V
    .locals 1

    const/4 v0, 0x3

    invoke-static {v0, p1}, Lg0/v2$g;->c(ILandroid/view/Surface;)Lg0/v2$g;

    move-result-object p1

    invoke-interface {p0, p1}, Lx2/a;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(Lx2/a;Landroid/view/Surface;)V
    .locals 1

    const/4 v0, 0x2

    invoke-static {v0, p1}, Lg0/v2$g;->c(ILandroid/view/Surface;)Lg0/v2$g;

    move-result-object p1

    invoke-interface {p0, p1}, Lx2/a;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic g(Lg0/v2;Ljava/util/concurrent/atomic/AtomicReference;Ly1/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "SurfaceRequest-surface-recreation("

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lg0/v2$i;Lg0/v2$h;)V
    .locals 0

    invoke-interface {p0, p1}, Lg0/v2$i;->a(Lg0/v2$h;)V

    return-void
.end method

.method public static synthetic i(Lx2/a;Landroid/view/Surface;)V
    .locals 1

    const/4 v0, 0x4

    invoke-static {v0, p1}, Lg0/v2$g;->c(ILandroid/view/Surface;)Lg0/v2$g;

    move-result-object p1

    invoke-interface {p0, p1}, Lx2/a;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic j(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ly1/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-status"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public k(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "PairedRegistration"
        }
    .end annotation

    iget-object v0, p0, Lg0/v2;->l:Ly1/c$a;

    invoke-virtual {v0, p2, p1}, Ly1/c$a;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public l()V
    .locals 2

    iget-object v0, p0, Lg0/v2;->a:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, Lg0/v2;->o:Lg0/v2$i;

    iput-object v1, p0, Lg0/v2;->p:Ljava/util/concurrent/Executor;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public m()Ln0/p0;
    .locals 1

    iget-object v0, p0, Lg0/v2;->e:Ln0/p0;

    return-object v0
.end method

.method public n()Ln0/u1;
    .locals 1

    iget-object v0, p0, Lg0/v2;->m:Ln0/u1;

    return-object v0
.end method

.method public o()Lg0/k0;
    .locals 1

    iget-object v0, p0, Lg0/v2;->c:Lg0/k0;

    return-object v0
.end method

.method public p()Landroid/util/Range;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg0/v2;->d:Landroid/util/Range;

    return-object v0
.end method

.method public q()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Lg0/v2;->b:Landroid/util/Size;

    return-object v0
.end method

.method public r()I
    .locals 1

    iget v0, p0, Lg0/v2;->g:I

    return v0
.end method

.method public final s(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)Ly1/c$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Ljava/lang/Runnable;",
            ")",
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    new-instance v1, Lg0/r2;

    invoke-direct {v1, p0, v0}, Lg0/r2;-><init>(Lg0/v2;Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-static {v1}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object v1

    new-instance v2, Lg0/v2$e;

    invoke-direct {v2, p0, p2}, Lg0/v2$e;-><init>(Lg0/v2;Ljava/lang/Runnable;)V

    invoke-static {v1, v2, p1}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly1/c$a;

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly1/c$a;

    return-object p1
.end method

.method public t()Z
    .locals 2

    invoke-virtual {p0}, Lg0/v2;->z()Z

    iget-object v0, p0, Lg0/v2;->k:Ly1/c$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public u()Z
    .locals 1

    iget-boolean v0, p0, Lg0/v2;->f:Z

    return v0
.end method

.method public v()Z
    .locals 1

    iget-object v0, p0, Lg0/v2;->h:Lne/x;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    return v0
.end method

.method public w(Landroid/view/Surface;Ljava/util/concurrent/Executor;Lx2/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/Surface;",
            "Ljava/util/concurrent/Executor;",
            "Lx2/a<",
            "Lg0/v2$g;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/view/Surface;->isValid()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lg0/s2;

    invoke-direct {v0, p3, p1}, Lg0/s2;-><init>(Lx2/a;Landroid/view/Surface;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lg0/v2;->i:Ly1/c$a;

    invoke-virtual {v0, p1}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lg0/v2;->h:Lne/x;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lg0/v2;->h:Lne/x;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    invoke-static {v0}, Lx2/g;->i(Z)V

    :try_start_0
    iget-object v0, p0, Lg0/v2;->h:Lne/x;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    new-instance v0, Lg0/t2;

    invoke-direct {v0, p3, p1}, Lg0/t2;-><init>(Lx2/a;Landroid/view/Surface;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    new-instance v0, Lg0/u2;

    invoke-direct {v0, p3, p1}, Lg0/u2;-><init>(Lx2/a;Landroid/view/Surface;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_2
    :goto_0
    iget-object v0, p0, Lg0/v2;->j:Lne/x;

    new-instance v1, Lg0/v2$d;

    invoke-direct {v1, p0, p3, p1}, Lg0/v2$d;-><init>(Lg0/v2;Lx2/a;Landroid/view/Surface;)V

    invoke-static {v0, v1, p2}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public x(Ljava/util/concurrent/Executor;Lg0/v2$i;)V
    .locals 2

    iget-object v0, p0, Lg0/v2;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p2, p0, Lg0/v2;->o:Lg0/v2$i;

    iput-object p1, p0, Lg0/v2;->p:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lg0/v2;->n:Lg0/v2$h;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    new-instance v0, Lg0/q2;

    invoke-direct {v0, p2, v1}, Lg0/q2;-><init>(Lg0/v2$i;Lg0/v2$h;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public y(Lg0/v2$h;)V
    .locals 3

    iget-object v0, p0, Lg0/v2;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lg0/v2;->n:Lg0/v2$h;

    iget-object v1, p0, Lg0/v2;->o:Lg0/v2$i;

    iget-object v2, p0, Lg0/v2;->p:Ljava/util/concurrent/Executor;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    new-instance v0, Lg0/l2;

    invoke-direct {v0, v1, p1}, Lg0/l2;-><init>(Lg0/v2$i;Lg0/v2$h;)V

    invoke-interface {v2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public z()Z
    .locals 3

    iget-object v0, p0, Lg0/v2;->i:Ly1/c$a;

    new-instance v1, Ln0/u1$b;

    const-string v2, "Surface request will not complete."

    invoke-direct {v1, v2}, Ln0/u1$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    move-result v0

    return v0
.end method
