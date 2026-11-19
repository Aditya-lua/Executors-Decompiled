.class public final Lob/ub;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic b:Lob/hf;

.field public final synthetic c:Lob/yc;


# direct methods
.method public constructor <init>(Lob/yc;Ljava/util/concurrent/atomic/AtomicReference;Lob/hf;)V
    .locals 0

    iput-object p2, p0, Lob/ub;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lob/ub;->b:Lob/hf;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/ub;->c:Lob/yc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lob/ub;->a:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lob/ub;->c:Lob/yc;

    iget-object v2, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->x()Lob/p6;

    move-result-object v3

    invoke-virtual {v3}, Lob/p6;->w()Lob/v8;

    move-result-object v3

    sget-object v4, Lob/u8;->c:Lob/u8;

    invoke-virtual {v3, v4}, Lob/v8;->o(Lob/u8;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v3

    invoke-virtual {v3}, Lob/b6;->t()Lob/z5;

    move-result-object v3

    const-string v4, "Analytics storage consent denied; will not get app instance id"

    invoke-virtual {v3, v4}, Lob/z5;->a(Ljava/lang/String;)V

    iget-object v1, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->B()Lob/va;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lob/va;->E(Ljava/lang/String;)V

    invoke-virtual {v2}, Lob/l7;->x()Lob/p6;

    move-result-object v1

    iget-object v1, v1, Lob/p6;->h:Lob/o6;

    invoke-virtual {v1, v3}, Lob/o6;->b(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_4

    :catchall_1
    move-exception v1

    goto :goto_3

    :catch_0
    move-exception v1

    goto :goto_1

    :cond_0
    :try_start_2
    invoke-virtual {v1}, Lob/yc;->N()Lob/i5;

    move-result-object v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->o()Lob/z5;

    move-result-object v1

    const-string v2, "Failed to get app instance id"

    invoke-virtual {v1, v2}, Lob/z5;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v4, p0, Lob/ub;->b:Lob/hf;

    invoke-static {v4}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v3, v4}, Lob/i5;->Y0(Lob/hf;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_2

    iget-object v4, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v4}, Lob/l7;->B()Lob/va;

    move-result-object v4

    invoke-virtual {v4, v3}, Lob/va;->E(Ljava/lang/String;)V

    invoke-virtual {v2}, Lob/l7;->x()Lob/p6;

    move-result-object v2

    iget-object v2, v2, Lob/p6;->h:Lob/o6;

    invoke-virtual {v2, v3}, Lob/o6;->b(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v1}, Lob/yc;->J()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iget-object v1, p0, Lob/ub;->a:Ljava/util/concurrent/atomic/AtomicReference;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :goto_1
    :try_start_4
    iget-object v2, p0, Lob/ub;->c:Lob/yc;

    iget-object v2, v2, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v2

    invoke-virtual {v2}, Lob/b6;->o()Lob/z5;

    move-result-object v2

    const-string v3, "Failed to get app instance id"

    invoke-virtual {v2, v3, v1}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    iget-object v1, p0, Lob/ub;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_2
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    monitor-exit v0

    return-void

    :goto_3
    iget-object v2, p0, Lob/ub;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    throw v1

    :goto_4
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v1
.end method
