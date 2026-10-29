.class public Ly5/f1;
.super Lx5/p0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly5/f1$a;
    }
.end annotation


# static fields
.field public static final m:Ljava/lang/String;

.field public static n:Ly5/f1;

.field public static o:Ly5/f1;

.field public static final p:Ljava/lang/Object;


# instance fields
.field public b:Landroid/content/Context;

.field public c:Landroidx/work/a;

.field public d:Landroidx/work/impl/WorkDatabase;

.field public e:Lh6/b;

.field public f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly5/u;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ly5/s;

.field public h:Lg6/w;

.field public i:Z

.field public j:Landroid/content/BroadcastReceiver$PendingResult;

.field public final k:Ld6/n;

.field public final l:Lku/p0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkManagerImpl"

    invoke-static {v0}, Lx5/w;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ly5/f1;->m:Ljava/lang/String;

    const/4 v0, 0x0

    sput-object v0, Ly5/f1;->n:Ly5/f1;

    sput-object v0, Ly5/f1;->o:Ly5/f1;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ly5/f1;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;Lh6/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;Ly5/s;Ld6/n;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/work/a;",
            "Lh6/b;",
            "Landroidx/work/impl/WorkDatabase;",
            "Ljava/util/List<",
            "Ly5/u;",
            ">;",
            "Ly5/s;",
            "Ld6/n;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lx5/p0;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ly5/f1;->i:Z

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Ly5/f1$a;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lx5/w$a;

    invoke-virtual {p2}, Landroidx/work/a;->j()I

    move-result v1

    invoke-direct {v0, v1}, Lx5/w$a;-><init>(I)V

    invoke-static {v0}, Lx5/w;->h(Lx5/w;)V

    iput-object p1, p0, Ly5/f1;->b:Landroid/content/Context;

    iput-object p3, p0, Ly5/f1;->e:Lh6/b;

    iput-object p4, p0, Ly5/f1;->d:Landroidx/work/impl/WorkDatabase;

    iput-object p6, p0, Ly5/f1;->g:Ly5/s;

    iput-object p7, p0, Ly5/f1;->k:Ld6/n;

    iput-object p2, p0, Ly5/f1;->c:Landroidx/work/a;

    iput-object p5, p0, Ly5/f1;->f:Ljava/util/List;

    invoke-static {p3}, Landroidx/work/impl/a;->f(Lh6/b;)Lku/p0;

    move-result-object p6

    iput-object p6, p0, Ly5/f1;->l:Lku/p0;

    new-instance p7, Lg6/w;

    iget-object v0, p0, Ly5/f1;->d:Landroidx/work/impl/WorkDatabase;

    invoke-direct {p7, v0}, Lg6/w;-><init>(Landroidx/work/impl/WorkDatabase;)V

    iput-object p7, p0, Ly5/f1;->h:Lg6/w;

    iget-object p7, p0, Ly5/f1;->g:Ly5/s;

    invoke-interface {p3}, Lh6/b;->c()Lh6/a;

    move-result-object p3

    iget-object v0, p0, Ly5/f1;->d:Landroidx/work/impl/WorkDatabase;

    invoke-static {p5, p7, p3, v0, p2}, Ly5/x;->e(Ljava/util/List;Ly5/s;Ljava/util/concurrent/Executor;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;)V

    iget-object p3, p0, Ly5/f1;->e:Lh6/b;

    new-instance p5, Landroidx/work/impl/utils/ForceStopRunnable;

    invoke-direct {p5, p1, p0}, Landroidx/work/impl/utils/ForceStopRunnable;-><init>(Landroid/content/Context;Ly5/f1;)V

    invoke-interface {p3, p5}, Lh6/b;->d(Ljava/lang/Runnable;)V

    iget-object p1, p0, Ly5/f1;->b:Landroid/content/Context;

    invoke-static {p6, p1, p2, p4}, Ly5/d0;->c(Lku/p0;Landroid/content/Context;Landroidx/work/a;Landroidx/work/impl/WorkDatabase;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot initialize WorkManager in direct boot mode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static i(Landroid/content/Context;Landroidx/work/a;)V
    .locals 3

    sget-object v0, Ly5/f1;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ly5/f1;->n:Ly5/f1;

    if-eqz v1, :cond_1

    sget-object v2, Ly5/f1;->o:Ly5/f1;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    if-nez v1, :cond_3

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sget-object v1, Ly5/f1;->o:Ly5/f1;

    if-nez v1, :cond_2

    invoke-static {p0, p1}, Landroidx/work/impl/a;->c(Landroid/content/Context;Landroidx/work/a;)Ly5/f1;

    move-result-object p0

    sput-object p0, Ly5/f1;->o:Ly5/f1;

    :cond_2
    sget-object p0, Ly5/f1;->o:Ly5/f1;

    sput-object p0, Ly5/f1;->n:Ly5/f1;

    :cond_3
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static synthetic j(Ly5/f1;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Ly5/f1;->m()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, La6/f;->d(Landroid/content/Context;)V

    invoke-virtual {p0}, Ly5/f1;->u()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->c0()Lf6/k0;

    move-result-object v0

    invoke-interface {v0}, Lf6/k0;->p()I

    invoke-virtual {p0}, Ly5/f1;->n()Landroidx/work/a;

    move-result-object v0

    invoke-virtual {p0}, Ly5/f1;->u()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    invoke-virtual {p0}, Ly5/f1;->s()Ljava/util/List;

    move-result-object p0

    invoke-static {v0, v1, p0}, Ly5/x;->f(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static o()Ly5/f1;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Ly5/f1;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ly5/f1;->n:Ly5/f1;

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    sget-object v1, Ly5/f1;->o:Ly5/f1;

    monitor-exit v0

    return-object v1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static p(Landroid/content/Context;)Ly5/f1;
    .locals 2

    sget-object v0, Ly5/f1;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Ly5/f1;->o()Ly5/f1;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    instance-of v1, p0, Landroidx/work/a$c;

    if-eqz v1, :cond_0

    move-object v1, p0

    check-cast v1, Landroidx/work/a$c;

    invoke-interface {v1}, Landroidx/work/a$c;->b()Landroidx/work/a;

    move-result-object v1

    invoke-static {p0, v1}, Ly5/f1;->i(Landroid/content/Context;Landroidx/work/a;)V

    invoke-static {p0}, Ly5/f1;->p(Landroid/content/Context;)Ly5/f1;

    move-result-object v1

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v1, "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lx5/a0;
    .locals 0

    invoke-static {p1, p0}, Lg6/h;->o(Ljava/lang/String;Ly5/f1;)Lx5/a0;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;)Lx5/a0;
    .locals 0

    invoke-static {p1, p0}, Lg6/h;->k(Ljava/lang/String;Ly5/f1;)Lx5/a0;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/util/List;)Lx5/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lx5/q0;",
            ">;)",
            "Lx5/a0;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ly5/f0;

    invoke-direct {v0, p0, p1}, Ly5/f0;-><init>(Ly5/f1;Ljava/util/List;)V

    invoke-virtual {v0}, Ly5/f0;->b()Lx5/a0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "enqueue needs at least one WorkRequest."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Ljava/lang/String;Lx5/i;Lx5/g0;)Lx5/a0;
    .locals 1

    sget-object v0, Lx5/i;->c:Lx5/i;

    if-ne p2, v0, :cond_0

    invoke-static {p0, p1, p3}, Ly5/m1;->e(Ly5/f1;Ljava/lang/String;Lx5/q0;)Lx5/a0;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Ly5/f1;->l(Ljava/lang/String;Lx5/i;Lx5/g0;)Ly5/f0;

    move-result-object p1

    invoke-virtual {p1}, Ly5/f0;->b()Lx5/a0;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/String;Lx5/j;Ljava/util/List;)Lx5/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lx5/j;",
            "Ljava/util/List<",
            "Lx5/z;",
            ">;)",
            "Lx5/a0;"
        }
    .end annotation

    new-instance v0, Ly5/f0;

    invoke-direct {v0, p0, p1, p2, p3}, Ly5/f0;-><init>(Ly5/f1;Ljava/lang/String;Lx5/j;Ljava/util/List;)V

    invoke-virtual {v0}, Ly5/f0;->b()Lx5/a0;

    move-result-object p1

    return-object p1
.end method

.method public k(Ljava/util/UUID;)Lx5/a0;
    .locals 0

    invoke-static {p1, p0}, Lg6/h;->h(Ljava/util/UUID;Ly5/f1;)Lx5/a0;

    move-result-object p1

    return-object p1
.end method

.method public l(Ljava/lang/String;Lx5/i;Lx5/g0;)Ly5/f0;
    .locals 1

    sget-object v0, Lx5/i;->b:Lx5/i;

    if-ne p2, v0, :cond_0

    sget-object p2, Lx5/j;->b:Lx5/j;

    goto :goto_0

    :cond_0
    sget-object p2, Lx5/j;->a:Lx5/j;

    :goto_0
    new-instance v0, Ly5/f0;

    invoke-static {p3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-direct {v0, p0, p1, p2, p3}, Ly5/f0;-><init>(Ly5/f1;Ljava/lang/String;Lx5/j;Ljava/util/List;)V

    return-object v0
.end method

.method public m()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Ly5/f1;->b:Landroid/content/Context;

    return-object v0
.end method

.method public n()Landroidx/work/a;
    .locals 1

    iget-object v0, p0, Ly5/f1;->c:Landroidx/work/a;

    return-object v0
.end method

.method public q()Lg6/w;
    .locals 1

    iget-object v0, p0, Ly5/f1;->h:Lg6/w;

    return-object v0
.end method

.method public r()Ly5/s;
    .locals 1

    iget-object v0, p0, Ly5/f1;->g:Ly5/s;

    return-object v0
.end method

.method public s()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ly5/u;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ly5/f1;->f:Ljava/util/List;

    return-object v0
.end method

.method public t()Ld6/n;
    .locals 1

    iget-object v0, p0, Ly5/f1;->k:Ld6/n;

    return-object v0
.end method

.method public u()Landroidx/work/impl/WorkDatabase;
    .locals 1

    iget-object v0, p0, Ly5/f1;->d:Landroidx/work/impl/WorkDatabase;

    return-object v0
.end method

.method public v()Lh6/b;
    .locals 1

    iget-object v0, p0, Ly5/f1;->e:Lh6/b;

    return-object v0
.end method

.method public w()V
    .locals 2

    sget-object v0, Ly5/f1;->p:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Ly5/f1;->i:Z

    iget-object v1, p0, Ly5/f1;->j:Landroid/content/BroadcastReceiver$PendingResult;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    const/4 v1, 0x0

    iput-object v1, p0, Ly5/f1;->j:Landroid/content/BroadcastReceiver$PendingResult;

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

.method public x()V
    .locals 3

    invoke-virtual {p0}, Ly5/f1;->n()Landroidx/work/a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/work/a;->n()Lx5/l0;

    move-result-object v0

    new-instance v1, Ly5/e1;

    invoke-direct {v1, p0}, Ly5/e1;-><init>(Ly5/f1;)V

    const-string v2, "ReschedulingWork"

    invoke-static {v0, v2, v1}, Lx5/m0;->a(Lx5/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    return-void
.end method

.method public y(Landroid/content/BroadcastReceiver$PendingResult;)V
    .locals 2

    sget-object v0, Ly5/f1;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ly5/f1;->j:Landroid/content/BroadcastReceiver$PendingResult;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iput-object p1, p0, Ly5/f1;->j:Landroid/content/BroadcastReceiver$PendingResult;

    iget-boolean v1, p0, Ly5/f1;->i:Z

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    const/4 p1, 0x0

    iput-object p1, p0, Ly5/f1;->j:Landroid/content/BroadcastReceiver$PendingResult;

    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public z(Lf6/w;I)V
    .locals 4

    iget-object v0, p0, Ly5/f1;->e:Lh6/b;

    new-instance v1, Lg6/z;

    iget-object v2, p0, Ly5/f1;->g:Ly5/s;

    new-instance v3, Ly5/y;

    invoke-direct {v3, p1}, Ly5/y;-><init>(Lf6/w;)V

    const/4 p1, 0x1

    invoke-direct {v1, v2, v3, p1, p2}, Lg6/z;-><init>(Ly5/s;Ly5/y;ZI)V

    invoke-interface {v0, v1}, Lh6/b;->d(Ljava/lang/Runnable;)V

    return-void
.end method
