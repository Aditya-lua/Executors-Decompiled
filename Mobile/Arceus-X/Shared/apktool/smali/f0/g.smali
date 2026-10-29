.class public final Lf0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public final c:Lz/y;

.field public final d:Ljava/util/concurrent/Executor;

.field public final e:Ljava/lang/Object;

.field public f:Ly/a$a;

.field public g:Ly1/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lz/y;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lf0/g;->a:Z

    iput-boolean v0, p0, Lf0/g;->b:Z

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lf0/g;->e:Ljava/lang/Object;

    new-instance v0, Ly/a$a;

    invoke-direct {v0}, Ly/a$a;-><init>()V

    iput-object v0, p0, Lf0/g;->f:Ly/a$a;

    iput-object p1, p0, Lf0/g;->c:Lz/y;

    iput-object p2, p0, Lf0/g;->d:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic a(Lf0/g;Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lf0/g;->d:Ljava/util/concurrent/Executor;

    new-instance v1, Lf0/f;

    invoke-direct {v1, p0, p1}, Lf0/f;-><init>(Lf0/g;Ly1/c$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p0, "addCaptureRequestOptions"

    return-object p0
.end method

.method public static synthetic b(Lf0/g;Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lf0/g;->d:Ljava/util/concurrent/Executor;

    new-instance v1, Lf0/d;

    invoke-direct {v1, p0, p1}, Lf0/d;-><init>(Lf0/g;Ly1/c$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p0, "clearCaptureRequestOptions"

    return-object p0
.end method

.method public static synthetic c(Lf0/g;Ly1/c$a;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf0/g;->q(Ly1/c$a;)V

    return-void
.end method

.method public static synthetic d(Lf0/g;)V
    .locals 0

    invoke-virtual {p0}, Lf0/g;->l()V

    return-void
.end method

.method public static synthetic e(Lf0/g;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lf0/g;->p(Z)V

    return-void
.end method

.method public static synthetic f(Lf0/g;Ly1/c$a;)V
    .locals 0

    invoke-virtual {p0, p1}, Lf0/g;->q(Ly1/c$a;)V

    return-void
.end method


# virtual methods
.method public g(Lf0/l;)Lne/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf0/l;",
            ")",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lf0/g;->h(Lf0/l;)V

    new-instance p1, Lf0/a;

    invoke-direct {p1, p0}, Lf0/a;-><init>(Lf0/g;)V

    invoke-static {p1}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object p1

    invoke-static {p1}, Lr0/n;->s(Lne/x;)Lne/x;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lf0/l;)V
    .locals 2

    iget-object v0, p0, Lf0/g;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lf0/g;->f:Ly/a$a;

    invoke-virtual {v1, p1}, Ly/a$a;->c(Ln0/n1;)Ly/a$a;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public i(Ly/a$a;)V
    .locals 3

    iget-object v0, p0, Lf0/g;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lf0/g;->f:Ly/a$a;

    invoke-virtual {v1}, Ly/a$a;->a()Ln0/w2;

    move-result-object v1

    sget-object v2, Ln0/n1$c;->a:Ln0/n1$c;

    invoke-virtual {p1, v1, v2}, Ly/a$a;->d(Ln0/n1;Ln0/n1$c;)Ly/a$a;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public j()Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lf0/g;->k()V

    new-instance v0, Lf0/c;

    invoke-direct {v0, p0}, Lf0/c;-><init>(Lf0/g;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object v0

    invoke-static {v0}, Lr0/n;->s(Lne/x;)Lne/x;

    move-result-object v0

    return-object v0
.end method

.method public final k()V
    .locals 2

    iget-object v0, p0, Lf0/g;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ly/a$a;

    invoke-direct {v1}, Ly/a$a;-><init>()V

    iput-object v1, p0, Lf0/g;->f:Ly/a$a;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final l()V
    .locals 2

    iget-object v0, p0, Lf0/g;->g:Ly1/c$a;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    iput-object v1, p0, Lf0/g;->g:Ly1/c$a;

    :cond_0
    return-void
.end method

.method public final m(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lf0/g;->g:Ly1/c$a;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/Exception;

    const-string v1, "Camera2CameraControl failed with unknown error."

    invoke-direct {p1, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v0, p1}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    const/4 p1, 0x0

    iput-object p1, p0, Lf0/g;->g:Ly1/c$a;

    :cond_1
    return-void
.end method

.method public n()Ly/a;
    .locals 2

    iget-object v0, p0, Lf0/g;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lf0/g;->f:Ly/a$a;

    invoke-virtual {v1}, Ly/a$a;->b()Ly/a;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public o(Z)V
    .locals 2

    iget-object v0, p0, Lf0/g;->d:Ljava/util/concurrent/Executor;

    new-instance v1, Lf0/b;

    invoke-direct {v1, p0, p1}, Lf0/b;-><init>(Lf0/g;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final p(Z)V
    .locals 1

    iget-boolean v0, p0, Lf0/g;->a:Z

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean p1, p0, Lf0/g;->a:Z

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lf0/g;->b:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lf0/g;->r()V

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance p1, Lg0/m$a;

    const-string v0, "The camera control has became inactive."

    invoke-direct {p1, v0}, Lg0/m$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lf0/g;->m(Ljava/lang/Exception;)V

    return-void
.end method

.method public final q(Ly1/c$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly1/c$a<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf0/g;->b:Z

    new-instance v0, Lg0/m$a;

    const-string v1, "Camera2CameraControl was updated with new options."

    invoke-direct {v0, v1}, Lg0/m$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lf0/g;->m(Ljava/lang/Exception;)V

    iput-object p1, p0, Lf0/g;->g:Ly1/c$a;

    iget-boolean p1, p0, Lf0/g;->a:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lf0/g;->r()V

    :cond_0
    return-void
.end method

.method public final r()V
    .locals 3

    iget-object v0, p0, Lf0/g;->c:Lz/y;

    invoke-virtual {v0}, Lz/y;->r0()Lne/x;

    move-result-object v0

    new-instance v1, Lf0/e;

    invoke-direct {v1, p0}, Lf0/e;-><init>(Lf0/g;)V

    iget-object v2, p0, Lf0/g;->d:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1, v2}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lf0/g;->b:Z

    return-void
.end method
