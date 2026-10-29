.class public final Landroidx/camera/core/c;
.super Lg0/x0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/c$b;
    }
.end annotation


# instance fields
.field public final v:Ljava/util/concurrent/Executor;

.field public final w:Ljava/lang/Object;

.field public x:Landroidx/camera/core/d;

.field public y:Landroidx/camera/core/c$b;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Lg0/x0;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/c;->w:Ljava/lang/Object;

    iput-object p1, p0, Landroidx/camera/core/c;->v:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public d(Ln0/j2;)Landroidx/camera/core/d;
    .locals 0

    invoke-interface {p1}, Ln0/j2;->b()Landroidx/camera/core/d;

    move-result-object p1

    return-object p1
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/c;->w:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/c;->x:Landroidx/camera/core/d;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Landroidx/camera/core/d;->close()V

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/camera/core/c;->x:Landroidx/camera/core/d;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public l(Landroidx/camera/core/d;)V
    .locals 5

    iget-object v0, p0, Landroidx/camera/core/c;->w:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lg0/x0;->u:Z

    if-nez v1, :cond_0

    invoke-interface {p1}, Landroidx/camera/core/d;->close()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Landroidx/camera/core/c;->y:Landroidx/camera/core/c$b;

    if-eqz v1, :cond_3

    invoke-interface {p1}, Landroidx/camera/core/d;->H2()Lg0/i1;

    move-result-object v1

    invoke-interface {v1}, Lg0/i1;->getTimestamp()J

    move-result-wide v1

    iget-object v3, p0, Landroidx/camera/core/c;->y:Landroidx/camera/core/c$b;

    invoke-virtual {v3}, Landroidx/camera/core/b;->H2()Lg0/i1;

    move-result-object v3

    invoke-interface {v3}, Lg0/i1;->getTimestamp()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-gtz v1, :cond_1

    invoke-interface {p1}, Landroidx/camera/core/d;->close()V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Landroidx/camera/core/c;->x:Landroidx/camera/core/d;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Landroidx/camera/core/d;->close()V

    :cond_2
    iput-object p1, p0, Landroidx/camera/core/c;->x:Landroidx/camera/core/d;

    :goto_0
    monitor-exit v0

    return-void

    :cond_3
    new-instance v1, Landroidx/camera/core/c$b;

    invoke-direct {v1, p1, p0}, Landroidx/camera/core/c$b;-><init>(Landroidx/camera/core/d;Landroidx/camera/core/c;)V

    iput-object v1, p0, Landroidx/camera/core/c;->y:Landroidx/camera/core/c$b;

    invoke-virtual {p0, v1}, Lg0/x0;->e(Landroidx/camera/core/d;)Lne/x;

    move-result-object p1

    new-instance v2, Landroidx/camera/core/c$a;

    invoke-direct {v2, p0, v1}, Landroidx/camera/core/c$a;-><init>(Landroidx/camera/core/c;Landroidx/camera/core/c$b;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-static {p1, v2, v1}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public w()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/c;->w:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, Landroidx/camera/core/c;->y:Landroidx/camera/core/c$b;

    iget-object v2, p0, Landroidx/camera/core/c;->x:Landroidx/camera/core/d;

    if-eqz v2, :cond_0

    iput-object v1, p0, Landroidx/camera/core/c;->x:Landroidx/camera/core/d;

    invoke-virtual {p0, v2}, Landroidx/camera/core/c;->l(Landroidx/camera/core/d;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
