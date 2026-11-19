.class public Lz5/f1;
.super Ly5/p0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz5/f1$a;
    }
.end annotation


# static fields
.field public static final m:Ljava/lang/String;

.field public static n:Lz5/f1;

.field public static o:Lz5/f1;

.field public static final p:Ljava/lang/Object;


# instance fields
.field public b:Landroid/content/Context;

.field public c:Landroidx/work/a;

.field public d:Landroidx/work/impl/WorkDatabase;

.field public e:Li6/b;

.field public f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lz5/u;",
            ">;"
        }
    .end annotation
.end field

.field public g:Lz5/s;

.field public h:Lh6/w;

.field public i:Z

.field public j:Landroid/content/BroadcastReceiver$PendingResult;

.field public final k:Le6/n;

.field public final l:Lav/p0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkManagerImpl"

    invoke-static {v0}, Ly5/w;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lz5/f1;->m:Ljava/lang/String;

    const/4 v0, 0x0

    sput-object v0, Lz5/f1;->n:Lz5/f1;

    sput-object v0, Lz5/f1;->o:Lz5/f1;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lz5/f1;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;Li6/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;Lz5/s;Le6/n;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/work/a;",
            "Li6/b;",
            "Landroidx/work/impl/WorkDatabase;",
            "Ljava/util/List<",
            "Lz5/u;",
            ">;",
            "Lz5/s;",
            "Le6/n;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ly5/p0;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz5/f1;->i:Z

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lz5/f1$a;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ly5/w$a;

    invoke-virtual {p2}, Landroidx/work/a;->j()I

    move-result v1

    invoke-direct {v0, v1}, Ly5/w$a;-><init>(I)V

    invoke-static {v0}, Ly5/w;->h(Ly5/w;)V

    iput-object p1, p0, Lz5/f1;->b:Landroid/content/Context;

    iput-object p3, p0, Lz5/f1;->e:Li6/b;

    iput-object p4, p0, Lz5/f1;->d:Landroidx/work/impl/WorkDatabase;

    iput-object p6, p0, Lz5/f1;->g:Lz5/s;

    iput-object p7, p0, Lz5/f1;->k:Le6/n;

    iput-object p2, p0, Lz5/f1;->c:Landroidx/work/a;

    iput-object p5, p0, Lz5/f1;->f:Ljava/util/List;

    invoke-static {p3}, Landroidx/work/impl/a;->f(Li6/b;)Lav/p0;

    move-result-object p6

    iput-object p6, p0, Lz5/f1;->l:Lav/p0;

    new-instance p7, Lh6/w;

    iget-object v0, p0, Lz5/f1;->d:Landroidx/work/impl/WorkDatabase;

    invoke-direct {p7, v0}, Lh6/w;-><init>(Landroidx/work/impl/WorkDatabase;)V

    iput-object p7, p0, Lz5/f1;->h:Lh6/w;

    iget-object p7, p0, Lz5/f1;->g:Lz5/s;

    invoke-interface {p3}, Li6/b;->c()Li6/a;

    move-result-object p3

    iget-object v0, p0, Lz5/f1;->d:Landroidx/work/impl/WorkDatabase;

    invoke-static {p5, p7, p3, v0, p2}, Lz5/x;->e(Ljava/util/List;Lz5/s;Ljava/util/concurrent/Executor;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;)V

    iget-object p3, p0, Lz5/f1;->e:Li6/b;

    new-instance p5, Landroidx/work/impl/utils/ForceStopRunnable;

    invoke-direct {p5, p1, p0}, Landroidx/work/impl/utils/ForceStopRunnable;-><init>(Landroid/content/Context;Lz5/f1;)V

    invoke-interface {p3, p5}, Li6/b;->d(Ljava/lang/Runnable;)V

    iget-object p1, p0, Lz5/f1;->b:Landroid/content/Context;

    invoke-static {p6, p1, p2, p4}, Lz5/d0;->c(Lav/p0;Landroid/content/Context;Landroidx/work/a;Landroidx/work/impl/WorkDatabase;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot initialize WorkManager in direct boot mode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static i(Landroid/content/Context;Landroidx/work/a;)V
    .locals 3

    sget-object v0, Lz5/f1;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lz5/f1;->n:Lz5/f1;

    if-eqz v1, :cond_1

    sget-object v2, Lz5/f1;->o:Lz5/f1;

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

    sget-object v1, Lz5/f1;->o:Lz5/f1;

    if-nez v1, :cond_2

    invoke-static {p0, p1}, Landroidx/work/impl/a;->c(Landroid/content/Context;Landroidx/work/a;)Lz5/f1;

    move-result-object p0

    sput-object p0, Lz5/f1;->o:Lz5/f1;

    :cond_2
    sget-object p0, Lz5/f1;->o:Lz5/f1;

    sput-object p0, Lz5/f1;->n:Lz5/f1;

    :cond_3
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static synthetic j(Lz5/f1;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lz5/f1;->m()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lb6/f;->a(Landroid/content/Context;)V

    invoke-virtual {p0}, Lz5/f1;->u()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->c0()Lg6/k0;

    move-result-object v0

    invoke-interface {v0}, Lg6/k0;->n()I

    invoke-virtual {p0}, Lz5/f1;->n()Landroidx/work/a;

    move-result-object v0

    invoke-virtual {p0}, Lz5/f1;->u()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    invoke-virtual {p0}, Lz5/f1;->s()Ljava/util/List;

    move-result-object p0

    invoke-static {v0, v1, p0}, Lz5/x;->f(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static o()Lz5/f1;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Lz5/f1;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lz5/f1;->n:Lz5/f1;

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    sget-object v1, Lz5/f1;->o:Lz5/f1;

    monitor-exit v0

    return-object v1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static p(Landroid/content/Context;)Lz5/f1;
    .locals 2

    sget-object v0, Lz5/f1;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lz5/f1;->o()Lz5/f1;

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

    invoke-static {p0, v1}, Lz5/f1;->i(Landroid/content/Context;Landroidx/work/a;)V

    invoke-static {p0}, Lz5/f1;->p(Landroid/content/Context;)Lz5/f1;

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
.method public a(Ljava/lang/String;)Ly5/a0;
    .locals 0

    invoke-static {p1, p0}, Lh6/h;->o(Ljava/lang/String;Lz5/f1;)Ly5/a0;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;)Ly5/a0;
    .locals 0

    invoke-static {p1, p0}, Lh6/h;->k(Ljava/lang/String;Lz5/f1;)Ly5/a0;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/util/List;)Ly5/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ly5/q0;",
            ">;)",
            "Ly5/a0;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lz5/f0;

    invoke-direct {v0, p0, p1}, Lz5/f0;-><init>(Lz5/f1;Ljava/util/List;)V

    invoke-virtual {v0}, Lz5/f0;->b()Ly5/a0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "enqueue needs at least one WorkRequest."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Ljava/lang/String;Ly5/i;Ly5/g0;)Ly5/a0;
    .locals 1

    sget-object v0, Ly5/i;->c:Ly5/i;

    if-ne p2, v0, :cond_0

    invoke-static {p0, p1, p3}, Lz5/m1;->e(Lz5/f1;Ljava/lang/String;Ly5/q0;)Ly5/a0;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lz5/f1;->l(Ljava/lang/String;Ly5/i;Ly5/g0;)Lz5/f0;

    move-result-object p1

    invoke-virtual {p1}, Lz5/f0;->b()Ly5/a0;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/String;Ly5/j;Ljava/util/List;)Ly5/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ly5/j;",
            "Ljava/util/List<",
            "Ly5/z;",
            ">;)",
            "Ly5/a0;"
        }
    .end annotation

    new-instance v0, Lz5/f0;

    invoke-direct {v0, p0, p1, p2, p3}, Lz5/f0;-><init>(Lz5/f1;Ljava/lang/String;Ly5/j;Ljava/util/List;)V

    invoke-virtual {v0}, Lz5/f0;->b()Ly5/a0;

    move-result-object p1

    return-object p1
.end method

.method public k(Ljava/util/UUID;)Ly5/a0;
    .locals 0

    invoke-static {p1, p0}, Lh6/h;->h(Ljava/util/UUID;Lz5/f1;)Ly5/a0;

    move-result-object p1

    return-object p1
.end method

.method public l(Ljava/lang/String;Ly5/i;Ly5/g0;)Lz5/f0;
    .locals 1

    sget-object v0, Ly5/i;->b:Ly5/i;

    if-ne p2, v0, :cond_0

    sget-object p2, Ly5/j;->b:Ly5/j;

    goto :goto_0

    :cond_0
    sget-object p2, Ly5/j;->a:Ly5/j;

    :goto_0
    new-instance v0, Lz5/f0;

    invoke-static {p3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-direct {v0, p0, p1, p2, p3}, Lz5/f0;-><init>(Lz5/f1;Ljava/lang/String;Ly5/j;Ljava/util/List;)V

    return-object v0
.end method

.method public m()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lz5/f1;->b:Landroid/content/Context;

    return-object v0
.end method

.method public n()Landroidx/work/a;
    .locals 1

    iget-object v0, p0, Lz5/f1;->c:Landroidx/work/a;

    return-object v0
.end method

.method public q()Lh6/w;
    .locals 1

    iget-object v0, p0, Lz5/f1;->h:Lh6/w;

    return-object v0
.end method

.method public r()Lz5/s;
    .locals 1

    iget-object v0, p0, Lz5/f1;->g:Lz5/s;

    return-object v0
.end method

.method public s()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lz5/u;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz5/f1;->f:Ljava/util/List;

    return-object v0
.end method

.method public t()Le6/n;
    .locals 1

    iget-object v0, p0, Lz5/f1;->k:Le6/n;

    return-object v0
.end method

.method public u()Landroidx/work/impl/WorkDatabase;
    .locals 1

    iget-object v0, p0, Lz5/f1;->d:Landroidx/work/impl/WorkDatabase;

    return-object v0
.end method

.method public v()Li6/b;
    .locals 1

    iget-object v0, p0, Lz5/f1;->e:Li6/b;

    return-object v0
.end method

.method public w()V
    .locals 2

    sget-object v0, Lz5/f1;->p:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lz5/f1;->i:Z

    iget-object v1, p0, Lz5/f1;->j:Landroid/content/BroadcastReceiver$PendingResult;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    const/4 v1, 0x0

    iput-object v1, p0, Lz5/f1;->j:Landroid/content/BroadcastReceiver$PendingResult;

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

    invoke-virtual {p0}, Lz5/f1;->n()Landroidx/work/a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/work/a;->n()Ly5/l0;

    move-result-object v0

    new-instance v1, Lz5/e1;

    invoke-direct {v1, p0}, Lz5/e1;-><init>(Lz5/f1;)V

    const-string v2, "ReschedulingWork"

    invoke-static {v0, v2, v1}, Ly5/m0;->a(Ly5/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    return-void
.end method

.method public y(Landroid/content/BroadcastReceiver$PendingResult;)V
    .locals 2

    sget-object v0, Lz5/f1;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz5/f1;->j:Landroid/content/BroadcastReceiver$PendingResult;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iput-object p1, p0, Lz5/f1;->j:Landroid/content/BroadcastReceiver$PendingResult;

    iget-boolean v1, p0, Lz5/f1;->i:Z

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    const/4 p1, 0x0

    iput-object p1, p0, Lz5/f1;->j:Landroid/content/BroadcastReceiver$PendingResult;

    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public z(Lg6/w;I)V
    .locals 4

    iget-object v0, p0, Lz5/f1;->e:Li6/b;

    new-instance v1, Lh6/z;

    iget-object v2, p0, Lz5/f1;->g:Lz5/s;

    new-instance v3, Lz5/y;

    invoke-direct {v3, p1}, Lz5/y;-><init>(Lg6/w;)V

    const/4 p1, 0x1

    invoke-direct {v1, v2, v3, p1, p2}, Lh6/z;-><init>(Lz5/s;Lz5/y;ZI)V

    invoke-interface {v0, v1}, Li6/b;->d(Ljava/lang/Runnable;)V

    return-void
.end method
