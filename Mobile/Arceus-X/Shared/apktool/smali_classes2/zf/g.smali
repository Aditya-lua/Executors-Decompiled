.class public Lzf/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzf/h;


# static fields
.field public static final m:Ljava/lang/Object;

.field public static final n:Ljava/util/concurrent/ThreadFactory;


# instance fields
.field public final a:Lff/e;

.field public final b:Lcg/c;

.field public final c:Lbg/c;

.field public final d:Lzf/p;

.field public final e:Lmf/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmf/x<",
            "Lbg/b;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lzf/n;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/util/concurrent/ExecutorService;

.field public final i:Ljava/util/concurrent/Executor;

.field public j:Ljava/lang/String;

.field public k:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lag/a;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lzf/o;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lzf/g;->m:Ljava/lang/Object;

    new-instance v0, Lzf/g$a;

    invoke-direct {v0}, Lzf/g$a;-><init>()V

    sput-object v0, Lzf/g;->n:Ljava/util/concurrent/ThreadFactory;

    return-void
.end method

.method public constructor <init>(Lff/e;Lyf/b;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/Executor;)V
    .locals 9
    .param p2    # Lyf/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/concurrent/ExecutorService;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/concurrent/Executor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ThreadPoolCreation"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lff/e;",
            "Lyf/b<",
            "Lwf/i;",
            ">;",
            "Ljava/util/concurrent/ExecutorService;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance v4, Lcg/c;

    .line 2
    invoke-virtual {p1}, Lff/e;->j()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v4, v0, p2}, Lcg/c;-><init>(Landroid/content/Context;Lyf/b;)V

    new-instance v5, Lbg/c;

    invoke-direct {v5, p1}, Lbg/c;-><init>(Lff/e;)V

    .line 3
    invoke-static {}, Lzf/p;->c()Lzf/p;

    move-result-object v6

    new-instance v7, Lmf/x;

    new-instance p2, Lzf/c;

    invoke-direct {p2, p1}, Lzf/c;-><init>(Lff/e;)V

    invoke-direct {v7, p2}, Lmf/x;-><init>(Lyf/b;)V

    new-instance v8, Lzf/n;

    invoke-direct {v8}, Lzf/n;-><init>()V

    move-object v0, p0

    move-object v3, p1

    move-object v1, p3

    move-object v2, p4

    .line 4
    invoke-direct/range {v0 .. v8}, Lzf/g;-><init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/Executor;Lff/e;Lcg/c;Lbg/c;Lzf/p;Lmf/x;Lzf/n;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/Executor;Lff/e;Lcg/c;Lbg/c;Lzf/p;Lmf/x;Lzf/n;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ThreadPoolCreation"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ExecutorService;",
            "Ljava/util/concurrent/Executor;",
            "Lff/e;",
            "Lcg/c;",
            "Lbg/c;",
            "Lzf/p;",
            "Lmf/x<",
            "Lbg/b;",
            ">;",
            "Lzf/n;",
            ")V"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lzf/g;->g:Ljava/lang/Object;

    .line 7
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lzf/g;->k:Ljava/util/Set;

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lzf/g;->l:Ljava/util/List;

    .line 9
    iput-object p3, p0, Lzf/g;->a:Lff/e;

    .line 10
    iput-object p4, p0, Lzf/g;->b:Lcg/c;

    .line 11
    iput-object p5, p0, Lzf/g;->c:Lbg/c;

    .line 12
    iput-object p6, p0, Lzf/g;->d:Lzf/p;

    .line 13
    iput-object p7, p0, Lzf/g;->e:Lmf/x;

    .line 14
    iput-object p8, p0, Lzf/g;->f:Lzf/n;

    .line 15
    iput-object p1, p0, Lzf/g;->h:Ljava/util/concurrent/ExecutorService;

    .line 16
    iput-object p2, p0, Lzf/g;->i:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic b(Lzf/g;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lzf/g;->j(Z)V

    return-void
.end method

.method public static synthetic c(Lzf/g;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lzf/g;->i(Z)V

    return-void
.end method

.method public static synthetic d(Lzf/g;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lzf/g;->j(Z)V

    return-void
.end method

.method public static synthetic e(Lff/e;)Lbg/b;
    .locals 1

    new-instance v0, Lbg/b;

    invoke-direct {v0, p0}, Lbg/b;-><init>(Lff/e;)V

    return-object v0
.end method

.method public static p()Lzf/g;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {}, Lff/e;->l()Lff/e;

    move-result-object v0

    invoke-static {v0}, Lzf/g;->q(Lff/e;)Lzf/g;

    move-result-object v0

    return-object v0
.end method

.method public static q(Lff/e;)Lzf/g;
    .locals 2
    .param p0    # Lff/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Null is not a valid value of FirebaseApp."

    invoke-static {v0, v1}, Ln9/m;->b(ZLjava/lang/Object;)V

    const-class v0, Lzf/h;

    invoke-virtual {p0, v0}, Lff/e;->i(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzf/g;

    return-object p0
.end method


# virtual methods
.method public final declared-synchronized A(Ljava/lang/String;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lzf/g;->j:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized B(Lbg/d;Lbg/d;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lzf/g;->k:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lbg/d;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lbg/d;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lzf/g;->k:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lag/a;

    invoke-virtual {p2}, Lbg/d;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lag/a;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public a(Z)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/android/gms/tasks/Task<",
            "Lzf/m;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lzf/g;->v()V

    invoke-virtual {p0}, Lzf/g;->f()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, Lzf/g;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lzf/f;

    invoke-direct {v2, p0, p1}, Lzf/f;-><init>(Lzf/g;Z)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public final f()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Lzf/m;",
            ">;"
        }
    .end annotation

    new-instance v0, Lsb/k;

    invoke-direct {v0}, Lsb/k;-><init>()V

    new-instance v1, Lzf/k;

    iget-object v2, p0, Lzf/g;->d:Lzf/p;

    invoke-direct {v1, v2, v0}, Lzf/k;-><init>(Lzf/p;Lsb/k;)V

    invoke-virtual {p0, v1}, Lzf/g;->h(Lzf/o;)V

    invoke-virtual {v0}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final g()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lsb/k;

    invoke-direct {v0}, Lsb/k;-><init>()V

    new-instance v1, Lzf/l;

    invoke-direct {v1, v0}, Lzf/l;-><init>(Lsb/k;)V

    invoke-virtual {p0, v1}, Lzf/g;->h(Lzf/o;)V

    invoke-virtual {v0}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public getId()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lzf/g;->v()V

    invoke-virtual {p0}, Lzf/g;->n()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lsb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lzf/g;->g()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, Lzf/g;->h:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lzf/d;

    invoke-direct {v2, p0}, Lzf/d;-><init>(Lzf/g;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public final h(Lzf/o;)V
    .locals 2

    iget-object v0, p0, Lzf/g;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lzf/g;->l:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final i(Z)V
    .locals 2

    invoke-virtual {p0}, Lzf/g;->r()Lbg/d;

    move-result-object v0

    :try_start_0
    invoke-virtual {v0}, Lbg/d;->i()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Lbg/d;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    if-nez p1, :cond_2

    iget-object p1, p0, Lzf/g;->d:Lzf/p;

    invoke-virtual {p1, v0}, Lzf/p;->f(Lbg/d;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    return-void

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, Lzf/g;->k(Lbg/d;)Lbg/d;

    move-result-object p1

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {p0, v0}, Lzf/g;->x(Lbg/d;)Lbg/d;

    move-result-object p1
    :try_end_0
    .catch Lzf/i; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    invoke-virtual {p0, p1}, Lzf/g;->u(Lbg/d;)V

    invoke-virtual {p0, v0, p1}, Lzf/g;->B(Lbg/d;Lbg/d;)V

    invoke-virtual {p1}, Lbg/d;->k()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lbg/d;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lzf/g;->A(Ljava/lang/String;)V

    :cond_4
    invoke-virtual {p1}, Lbg/d;->i()Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance p1, Lzf/i;

    sget-object v0, Lzf/i$a;->a:Lzf/i$a;

    invoke-direct {p1, v0}, Lzf/i;-><init>(Lzf/i$a;)V

    invoke-virtual {p0, p1}, Lzf/g;->y(Ljava/lang/Exception;)V

    return-void

    :cond_5
    invoke-virtual {p1}, Lbg/d;->j()Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance p1, Ljava/io/IOException;

    const-string v0, "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lzf/g;->y(Ljava/lang/Exception;)V

    return-void

    :cond_6
    invoke-virtual {p0, p1}, Lzf/g;->z(Lbg/d;)V

    return-void

    :goto_3
    invoke-virtual {p0, p1}, Lzf/g;->y(Ljava/lang/Exception;)V

    return-void
.end method

.method public final j(Z)V
    .locals 2

    invoke-virtual {p0}, Lzf/g;->s()Lbg/d;

    move-result-object v0

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lbg/d;->p()Lbg/d;

    move-result-object v0

    :cond_0
    invoke-virtual {p0, v0}, Lzf/g;->z(Lbg/d;)V

    iget-object v0, p0, Lzf/g;->i:Ljava/util/concurrent/Executor;

    new-instance v1, Lzf/e;

    invoke-direct {v1, p0, p1}, Lzf/e;-><init>(Lzf/g;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final k(Lbg/d;)Lbg/d;
    .locals 6
    .param p1    # Lbg/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lzf/g;->b:Lcg/c;

    invoke-virtual {p0}, Lzf/g;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lbg/d;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lzf/g;->t()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lbg/d;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcg/c;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcg/f;

    move-result-object v0

    sget-object v1, Lzf/g$b;->b:[I

    invoke-virtual {v0}, Lcg/f;->b()Lcg/f$b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v0, 0x2

    if-eq v1, v0, :cond_1

    const/4 v0, 0x3

    if-ne v1, v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lzf/g;->A(Ljava/lang/String;)V

    invoke-virtual {p1}, Lbg/d;->r()Lbg/d;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lzf/i;

    const-string v0, "Firebase Installations Service is unavailable. Please try again later."

    sget-object v1, Lzf/i$a;->b:Lzf/i$a;

    invoke-direct {p1, v0, v1}, Lzf/i;-><init>(Ljava/lang/String;Lzf/i$a;)V

    throw p1

    :cond_1
    const-string v0, "BAD CONFIG"

    invoke-virtual {p1, v0}, Lbg/d;->q(Ljava/lang/String;)Lbg/d;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {v0}, Lcg/f;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcg/f;->d()J

    move-result-wide v2

    iget-object v0, p0, Lzf/g;->d:Lzf/p;

    invoke-virtual {v0}, Lzf/p;->b()J

    move-result-wide v4

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lbg/d;->o(Ljava/lang/String;JJ)Lbg/d;

    move-result-object p1

    return-object p1
.end method

.method public l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzf/g;->a:Lff/e;

    invoke-virtual {v0}, Lff/e;->n()Lff/k;

    move-result-object v0

    invoke-virtual {v0}, Lff/k;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzf/g;->a:Lff/e;

    invoke-virtual {v0}, Lff/e;->n()Lff/k;

    move-result-object v0

    invoke-virtual {v0}, Lff/k;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized n()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lzf/g;->j:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final o()Lbg/b;
    .locals 1

    iget-object v0, p0, Lzf/g;->e:Lmf/x;

    invoke-virtual {v0}, Lmf/x;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbg/b;

    return-object v0
.end method

.method public final r()Lbg/d;
    .locals 3

    sget-object v0, Lzf/g;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lzf/g;->a:Lff/e;

    invoke-virtual {v1}, Lff/e;->j()Landroid/content/Context;

    move-result-object v1

    const-string v2, "generatefid.lock"

    invoke-static {v1, v2}, Lzf/b;->a(Landroid/content/Context;Ljava/lang/String;)Lzf/b;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v2, p0, Lzf/g;->c:Lbg/c;

    invoke-virtual {v2}, Lbg/c;->d()Lbg/d;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v1, :cond_0

    :try_start_2
    invoke-virtual {v1}, Lzf/b;->b()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-object v2

    :catchall_1
    move-exception v2

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lzf/b;->b()V

    :cond_1
    throw v2

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final s()Lbg/d;
    .locals 5

    sget-object v0, Lzf/g;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lzf/g;->a:Lff/e;

    invoke-virtual {v1}, Lff/e;->j()Landroid/content/Context;

    move-result-object v1

    const-string v2, "generatefid.lock"

    invoke-static {v1, v2}, Lzf/b;->a(Landroid/content/Context;Ljava/lang/String;)Lzf/b;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v2, p0, Lzf/g;->c:Lbg/c;

    invoke-virtual {v2}, Lbg/c;->d()Lbg/d;

    move-result-object v2

    invoke-virtual {v2}, Lbg/d;->j()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0, v2}, Lzf/g;->w(Lbg/d;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lzf/g;->c:Lbg/c;

    invoke-virtual {v2, v3}, Lbg/d;->t(Ljava/lang/String;)Lbg/d;

    move-result-object v2

    invoke-virtual {v4, v2}, Lbg/c;->b(Lbg/d;)Lbg/d;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    goto :goto_2

    :cond_0
    :goto_0
    if-eqz v1, :cond_1

    :try_start_2
    invoke-virtual {v1}, Lzf/b;->b()V

    goto :goto_1

    :catchall_1
    move-exception v1

    goto :goto_3

    :cond_1
    :goto_1
    monitor-exit v0

    return-object v2

    :goto_2
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lzf/b;->b()V

    :cond_2
    throw v2

    :goto_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public t()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzf/g;->a:Lff/e;

    invoke-virtual {v0}, Lff/e;->n()Lff/k;

    move-result-object v0

    invoke-virtual {v0}, Lff/k;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Lbg/d;)V
    .locals 3

    sget-object v0, Lzf/g;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lzf/g;->a:Lff/e;

    invoke-virtual {v1}, Lff/e;->j()Landroid/content/Context;

    move-result-object v1

    const-string v2, "generatefid.lock"

    invoke-static {v1, v2}, Lzf/b;->a(Landroid/content/Context;Ljava/lang/String;)Lzf/b;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v2, p0, Lzf/g;->c:Lbg/c;

    invoke-virtual {v2, p1}, Lbg/c;->b(Lbg/d;)Lbg/d;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v1, :cond_0

    :try_start_2
    invoke-virtual {v1}, Lzf/b;->b()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lzf/b;->b()V

    :cond_1
    throw p1

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final v()V
    .locals 3

    invoke-virtual {p0}, Lzf/g;->m()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options."

    invoke-static {v0, v1}, Ln9/m;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {p0}, Lzf/g;->t()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options."

    invoke-static {v0, v2}, Ln9/m;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {p0}, Lzf/g;->l()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options."

    invoke-static {v0, v2}, Ln9/m;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {p0}, Lzf/g;->m()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lzf/p;->h(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0, v1}, Ln9/m;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Lzf/g;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lzf/p;->g(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0, v2}, Ln9/m;->b(ZLjava/lang/Object;)V

    return-void
.end method

.method public final w(Lbg/d;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lzf/g;->a:Lff/e;

    invoke-virtual {v0}, Lff/e;->m()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CHIME_ANDROID_SDK"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lzf/g;->a:Lff/e;

    invoke-virtual {v0}, Lff/e;->u()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p1}, Lbg/d;->m()Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    iget-object p1, p0, Lzf/g;->f:Lzf/n;

    invoke-virtual {p1}, Lzf/n;->a()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p0}, Lzf/g;->o()Lbg/b;

    move-result-object p1

    invoke-virtual {p1}, Lbg/b;->f()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p1, p0, Lzf/g;->f:Lzf/n;

    invoke-virtual {p1}, Lzf/n;->a()Ljava/lang/String;

    move-result-object p1

    :cond_3
    return-object p1
.end method

.method public final x(Lbg/d;)Lbg/d;
    .locals 10

    invoke-virtual {p1}, Lbg/d;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lbg/d;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xb

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lzf/g;->o()Lbg/b;

    move-result-object v0

    invoke-virtual {v0}, Lbg/b;->i()Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    iget-object v1, p0, Lzf/g;->b:Lcg/c;

    invoke-virtual {p0}, Lzf/g;->l()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lbg/d;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lzf/g;->t()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lzf/g;->m()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v1 .. v6}, Lcg/c;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcg/d;

    move-result-object v0

    sget-object v1, Lzf/g$b;->a:[I

    invoke-virtual {v0}, Lcg/d;->e()Lcg/d$b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v0, 0x2

    if-ne v1, v0, :cond_1

    const-string v0, "BAD CONFIG"

    invoke-virtual {p1, v0}, Lbg/d;->q(Ljava/lang/String;)Lbg/d;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lzf/i;

    const-string v0, "Firebase Installations Service is unavailable. Please try again later."

    sget-object v1, Lzf/i$a;->b:Lzf/i$a;

    invoke-direct {p1, v0, v1}, Lzf/i;-><init>(Ljava/lang/String;Lzf/i$a;)V

    throw p1

    :cond_2
    invoke-virtual {v0}, Lcg/d;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcg/d;->d()Ljava/lang/String;

    move-result-object v4

    iget-object v1, p0, Lzf/g;->d:Lzf/p;

    invoke-virtual {v1}, Lzf/p;->b()J

    move-result-wide v5

    invoke-virtual {v0}, Lcg/d;->b()Lcg/f;

    move-result-object v1

    invoke-virtual {v1}, Lcg/f;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lcg/d;->b()Lcg/f;

    move-result-object v0

    invoke-virtual {v0}, Lcg/f;->d()J

    move-result-wide v8

    move-object v2, p1

    invoke-virtual/range {v2 .. v9}, Lbg/d;->s(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)Lbg/d;

    move-result-object p1

    return-object p1
.end method

.method public final y(Ljava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, Lzf/g;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lzf/g;->l:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzf/o;

    invoke-interface {v2, p1}, Lzf/o;->a(Ljava/lang/Exception;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final z(Lbg/d;)V
    .locals 3

    iget-object v0, p0, Lzf/g;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lzf/g;->l:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzf/o;

    invoke-interface {v2, p1}, Lzf/o;->b(Lbg/d;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
