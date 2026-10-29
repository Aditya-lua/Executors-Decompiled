.class public final Lfb/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfb/m;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;

.field public final b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final c:Ljava/util/Queue;

.field public final d:Ljava/util/concurrent/atomic/AtomicReference;

.field public final e:Ljava/util/concurrent/atomic/AtomicReference;

.field public final f:Landroid/app/Application;

.field public final g:Lga/o;

.field public final h:Lfb/c0;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lga/o;Lcom/google/android/gms/games/internal/v2/resolution/a;Lfb/c0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p3, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Lfb/r;->a:Lfb/r;

    invoke-direct {p3, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, Lfb/b0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p3, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Lfb/p;->a:Lfb/p;

    invoke-direct {p3, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, Lfb/b0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p3, Ljava/util/ArrayDeque;

    invoke-direct {p3}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p3, p0, Lfb/b0;->c:Ljava/util/Queue;

    new-instance p3, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p3, p0, Lfb/b0;->d:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p3, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p3, p0, Lfb/b0;->e:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p1, p0, Lfb/b0;->f:Landroid/app/Application;

    iput-object p2, p0, Lfb/b0;->g:Lga/o;

    iput-object p4, p0, Lfb/b0;->h:Lfb/c0;

    return-void
.end method

.method public static i()Z
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static j(Lfb/u1;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    invoke-static {}, Lfb/b0;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lfb/u1;->zza()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/tasks/Task;

    return-object p0

    :cond_0
    new-instance v0, Lsb/k;

    invoke-direct {v0}, Lsb/k;-><init>()V

    sget-object v1, Lsb/l;->a:Ljava/util/concurrent/Executor;

    new-instance v2, Lfb/x;

    invoke-direct {v2, p0, v0}, Lfb/x;-><init>(Lfb/u1;Lsb/k;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static k()Lk9/b;
    .locals 3

    new-instance v0, Lk9/b;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-direct {v0, v1}, Lk9/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method public static l(Ljava/util/concurrent/atomic/AtomicReference;Lsb/k;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfb/r;

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_5

    const/4 v0, 0x2

    if-eq p0, v0, :cond_4

    const/4 v0, 0x3

    if-eq p0, v0, :cond_3

    if-nez p1, :cond_0

    sget-object p0, Lda/c;->c:Lda/c;

    invoke-static {p0}, Lsb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p1}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lda/c;->b:Lda/c;

    invoke-static {p0}, Lsb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object p0, Lda/c;->c:Lda/c;

    invoke-static {p0}, Lsb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p1, Lsb/k;

    invoke-direct {p1}, Lsb/k;-><init>()V

    invoke-static {}, Lfb/t1;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lfb/y;

    invoke-direct {v1, p1}, Lfb/y;-><init>(Lsb/k;)V

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/tasks/Task;->c(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    invoke-virtual {p1}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0

    :cond_3
    sget-object p0, Lda/c;->c:Lda/c;

    invoke-static {p0}, Lsb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0

    :cond_4
    sget-object p0, Lda/c;->b:Lda/c;

    invoke-static {p0}, Lsb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0

    :cond_5
    new-instance p0, Lk9/b;

    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-direct {p0, p1}, Lk9/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-static {p0}, Lsb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lfb/l;)Lcom/google/android/gms/tasks/Task;
    .locals 4

    iget-object v0, p0, Lfb/b0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfb/r;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "GamesApiManager"

    const-string v3, "Executing API call with authentication state: "

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lfb/s0;->c(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lfb/r;->c:Lfb/r;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lfb/b0;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk9/e;

    invoke-interface {p1, v0}, Lfb/l;->a(Lk9/e;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v1, Lfb/r;->d:Lfb/r;

    if-ne v0, v1, :cond_1

    invoke-static {}, Lfb/b0;->k()Lk9/b;

    move-result-object p1

    invoke-static {p1}, Lsb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object v1, Lfb/r;->a:Lfb/r;

    if-ne v0, v1, :cond_2

    new-instance p1, Lk9/b;

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-direct {p1, v0}, Lk9/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-static {p1}, Lsb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance v0, Lsb/k;

    invoke-direct {v0}, Lsb/k;-><init>()V

    new-instance v1, Lfb/t;

    invoke-direct {v1, p1, v0}, Lfb/t;-><init>(Lfb/l;Lsb/k;)V

    new-instance p1, Lfb/a0;

    invoke-direct {p1, p0, v1}, Lfb/a0;-><init>(Lfb/b0;Lfb/t;)V

    invoke-static {}, Lfb/b0;->i()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_3
    sget-object v1, Lsb/l;->a:Ljava/util/concurrent/Executor;

    invoke-interface {v1, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    invoke-virtual {v0}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic b(Lfb/t;)V
    .locals 2

    const-string v0, "Must be called on the main thread."

    invoke-static {v0}, Ln9/m;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lfb/b0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfb/r;

    sget-object v1, Lfb/r;->c:Lfb/r;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lfb/b0;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk9/e;

    invoke-virtual {p1, v0}, Lfb/t;->a(Lk9/e;)V

    return-void

    :cond_0
    sget-object v1, Lfb/r;->d:Lfb/r;

    if-ne v0, v1, :cond_1

    invoke-static {}, Lfb/b0;->k()Lk9/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lfb/t;->b(Ljava/lang/Exception;)V

    return-void

    :cond_1
    iget-object v0, p0, Lfb/b0;->c:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final synthetic c()Lcom/google/android/gms/tasks/Task;
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lfb/b0;->f(I)V

    iget-object v0, p0, Lfb/b0;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsb/k;

    iget-object v1, p0, Lfb/b0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0}, Lfb/b0;->l(Ljava/util/concurrent/atomic/AtomicReference;Lsb/k;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic d(Lsb/k;Lcom/google/android/gms/internal/games_v2/zzq;Lcom/google/android/gms/tasks/Task;)V
    .locals 6

    invoke-virtual {p3}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    const-string v1, "GamesApiManager"

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p3}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v0

    invoke-static {v0}, Lfb/b1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "Authentication task failed"

    invoke-static {v1, v3, v0}, Lfb/s0;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move v0, v2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/games_v2/zzq;->zzc()I

    move-result v2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/games_v2/zzq;->zzd()Z

    move-result v1

    xor-int/lit8 v5, v1, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lfb/b0;->h(Lsb/k;ILandroid/app/PendingIntent;ZZ)V

    return-void

    :cond_0
    move v0, v2

    invoke-virtual {p3}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfb/g0;

    invoke-virtual {v2}, Lfb/g0;->c()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Failed to authenticate: "

    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lfb/s0;->a(Ljava/lang/String;Ljava/lang/String;)V

    move-object v3, v2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/games_v2/zzq;->zzc()I

    move-result v2

    invoke-virtual {v3}, Lfb/g0;->e()Landroid/app/PendingIntent;

    move-result-object v3

    invoke-virtual {p2}, Lcom/google/android/gms/internal/games_v2/zzq;->zzd()Z

    move-result v1

    xor-int/lit8 v5, v1, 0x1

    const/4 v4, 0x1

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lfb/b0;->h(Lsb/k;ILandroid/app/PendingIntent;ZZ)V

    return-void

    :cond_1
    move-object v3, v2

    invoke-virtual {v3}, Lfb/g0;->d()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    const-string v2, "Unexpected state: game run token absent"

    invoke-static {v1, v2}, Lfb/s0;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/games_v2/zzq;->zzc()I

    move-result v2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/games_v2/zzq;->zzd()Z

    move-result v1

    xor-int/lit8 v5, v1, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lfb/b0;->h(Lsb/k;ILandroid/app/PendingIntent;ZZ)V

    return-void

    :cond_2
    const-string v4, "Successfully authenticated"

    invoke-static {v1, v4}, Lfb/s0;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "Must be called on the main thread."

    invoke-static {v1}, Ln9/m;->e(Ljava/lang/String;)V

    invoke-static {}, Lda/o;->a()Lda/n;

    move-result-object v1

    const v4, 0x201113

    invoke-virtual {v1, v4}, Lda/n;->a(I)Lda/n;

    invoke-virtual {v1, v2}, Lda/n;->b(Ljava/lang/String;)Lda/n;

    invoke-static {}, Lga/q;->d()Lga/p;

    move-result-object v2

    invoke-virtual {v2, v0}, Lga/p;->a(Z)Lga/p;

    invoke-virtual {v2, v0}, Lga/p;->b(Z)Lga/p;

    invoke-virtual {v2, v0}, Lga/p;->c(Z)Lga/p;

    invoke-virtual {v2}, Lga/p;->d()Lga/q;

    move-result-object v0

    invoke-virtual {v1, v0}, Lda/n;->c(Lga/q;)Lda/n;

    invoke-virtual {v1}, Lda/n;->d()Lda/o;

    move-result-object v0

    iget-object v1, p0, Lfb/b0;->f:Landroid/app/Application;

    new-instance v2, Lfb/r0;

    invoke-direct {v2, v1, v0}, Lfb/r0;-><init>(Landroid/content/Context;Lda/o;)V

    iget-object v0, p0, Lfb/b0;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v0, p0, Lfb/b0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Lfb/r;->c:Lfb/r;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lsb/k;->e(Ljava/lang/Object;)Z

    iget-object v0, p0, Lfb/b0;->c:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfb/t;

    invoke-virtual {v1, v2}, Lfb/t;->a(Lk9/e;)V

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final synthetic e(Lsb/k;ILcom/google/android/gms/tasks/Task;)V
    .locals 9

    invoke-virtual {p3}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    const-string v1, "GamesApiManager"

    if-nez v0, :cond_0

    invoke-virtual {p3}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v0

    invoke-static {v0}, Lfb/b1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "Resolution failed"

    invoke-static {v1, v2, v0}, Lfb/s0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v6, 0x0

    move-object v3, p0

    move-object v4, p1

    move v5, p2

    invoke-virtual/range {v3 .. v8}, Lfb/b0;->h(Lsb/k;ILandroid/app/PendingIntent;ZZ)V

    return-void

    :cond_0
    invoke-virtual {p3}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lla/a;

    invoke-virtual {v0}, Lla/a;->c()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "Resolution successful"

    invoke-static {v1, v2}, Lfb/s0;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lla/a;->d()Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/games_v2/zzx;->a(Landroid/content/Intent;)Lcom/google/android/gms/internal/games_v2/zzx;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/games_v2/zzq;->w3(ILcom/google/android/gms/internal/games_v2/zzx;)Lcom/google/android/gms/internal/games_v2/zzq;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lfb/b0;->g(Lsb/k;Lcom/google/android/gms/internal/games_v2/zzq;)V

    return-void

    :cond_1
    const-string v0, "Resolution attempt was canceled"

    invoke-static {v1, v0}, Lfb/s0;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-virtual/range {v0 .. v5}, Lfb/b0;->h(Lsb/k;ILandroid/app/PendingIntent;ZZ)V

    return-void
.end method

.method public final f(I)V
    .locals 6

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x2d

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "startAuthenticationIfNecessary() signInType: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GamesApiManager"

    invoke-static {v1, v0}, Lfb/s0;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Must be called on the main thread."

    invoke-static {v0}, Ln9/m;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lfb/b0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v2, Lfb/r;->a:Lfb/r;

    sget-object v3, Lfb/r;->b:Lfb/r;

    invoke-static {v0, v2, v3}, Lp1/t;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    if-ne p1, v5, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lfb/r;->d:Lfb/r;

    invoke-static {v0, p1, v3}, Lp1/t;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lfb/b0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v2, Lfb/p;->a:Lfb/p;

    sget-object v3, Lfb/p;->b:Lfb/p;

    invoke-static {p1, v2, v3}, Lp1/t;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x53

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Explicit sign-in during existing authentication. Marking pending explicit sign-in: "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lfb/s0;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Authentication attempt skipped. Already authenticated or authenticating. State: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lfb/s0;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    move p1, v4

    :goto_1
    iget-object v0, p0, Lfb/b0;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsb/k;

    if-eqz v1, :cond_3

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "New authentication attempt in progress"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lsb/k;->d(Ljava/lang/Exception;)Z

    :cond_3
    new-instance v1, Lsb/k;

    invoke-direct {v1}, Lsb/k;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v0, p0, Lfb/b0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    if-nez p1, :cond_4

    sget-object p1, Lfb/p;->c:Lfb/p;

    goto :goto_2

    :cond_4
    sget-object p1, Lfb/p;->a:Lfb/p;

    move v4, v5

    :goto_2
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-static {v4}, Lcom/google/android/gms/internal/games_v2/zzq;->v3(I)Lcom/google/android/gms/internal/games_v2/zzq;

    move-result-object p1

    invoke-virtual {p0, v1, p1}, Lfb/b0;->g(Lsb/k;Lcom/google/android/gms/internal/games_v2/zzq;)V

    return-void
.end method

.method public final g(Lsb/k;Lcom/google/android/gms/internal/games_v2/zzq;)V
    .locals 3

    const-string v0, "Attempting authentication: "

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "GamesApiManager"

    invoke-static {v1, v0}, Lfb/s0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lfb/b0;->h:Lfb/c0;

    invoke-interface {v0, p2}, Lfb/c0;->a(Lcom/google/android/gms/internal/games_v2/zzq;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    sget-object v1, Lsb/l;->a:Ljava/util/concurrent/Executor;

    new-instance v2, Lfb/v;

    invoke-direct {v2, p0, p1, p2}, Lfb/v;-><init>(Lfb/b0;Lsb/k;Lcom/google/android/gms/internal/games_v2/zzq;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->c(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public final h(Lsb/k;ILandroid/app/PendingIntent;ZZ)V
    .locals 5

    const-string v0, "Must be called on the main thread."

    invoke-static {v0}, Ln9/m;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lfb/b0;->f:Landroid/app/Application;

    const-string v1, "com.google.android.gms"

    invoke-static {v0, v1}, Lu9/d;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "GmsCore version is %d"

    invoke-static {v2, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "GamesApiManager"

    invoke-static {v4, v3}, Lfb/s0;->a(Ljava/lang/String;Ljava/lang/String;)V

    const v3, 0xd2952e0

    if-ge v1, v3, :cond_2

    const-string v1, "com.android.vending"

    invoke-static {v0, v1}, Lu9/d;->b(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p2, "PlayStore is not installed"

    invoke-static {v4, p2}, Lfb/s0;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    const v1, 0x4ea66c8

    if-ge v0, v1, :cond_1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string p3, "PlayStore version is below resolution threshold: %s"

    invoke-static {v2, p3, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v4, p2}, Lfb/s0;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const-string p2, "PlayStore is too old or not available and the version of GmsCore would attempt PGA installation on automatic sign-in. Skipping it."

    invoke-static {v4, p2}, Lfb/s0;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Lsb/k;->e(Ljava/lang/Object;)Z

    iget-object p1, p0, Lfb/b0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object p2, Lfb/r;->d:Lfb/r;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void

    :cond_1
    const-string v0, "Installed PlayStore version can be used for resolution."

    invoke-static {v4, v0}, Lfb/s0;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    if-eqz p4, :cond_4

    if-eqz p3, :cond_4

    iget-object p4, p0, Lfb/b0;->g:Lga/o;

    invoke-virtual {p4}, Lga/o;->d()Landroid/app/Activity;

    move-result-object p4

    if-nez p4, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {p4, p3}, Lcom/google/android/gms/games/internal/v2/resolution/a;->b(Landroid/app/Activity;Landroid/app/PendingIntent;)Lcom/google/android/gms/tasks/Task;

    move-result-object p3

    sget-object p4, Lsb/l;->a:Ljava/util/concurrent/Executor;

    new-instance p5, Lfb/w;

    invoke-direct {p5, p0, p1, p2}, Lfb/w;-><init>(Lfb/b0;Lsb/k;I)V

    invoke-virtual {p3, p4, p5}, Lcom/google/android/gms/tasks/Task;->c(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    const-string p1, "Resolution triggered"

    invoke-static {v4, p1}, Lfb/s0;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_4
    :goto_1
    iget-object p2, p0, Lfb/b0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object p3, Lfb/p;->b:Lfb/p;

    sget-object p4, Lfb/p;->c:Lfb/p;

    invoke-static {p2, p3, p4}, Lp1/t;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p5, :cond_6

    if-nez p2, :cond_5

    goto :goto_2

    :cond_5
    const-string p2, "Consumed pending explicit sign-in. Attempting explicit sign-in"

    invoke-static {v4, p2}, Lfb/s0;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x0

    invoke-static {p2}, Lcom/google/android/gms/internal/games_v2/zzq;->v3(I)Lcom/google/android/gms/internal/games_v2/zzq;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lfb/b0;->g(Lsb/k;Lcom/google/android/gms/internal/games_v2/zzq;)V

    return-void

    :cond_6
    :goto_2
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Lsb/k;->e(Ljava/lang/Object;)Z

    iget-object p1, p0, Lfb/b0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object p2, Lfb/r;->d:Lfb/r;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object p1, p0, Lfb/b0;->c:Ljava/util/Queue;

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lfb/t;

    invoke-static {}, Lfb/b0;->k()Lk9/b;

    move-result-object p3

    invoke-virtual {p2, p3}, Lfb/t;->b(Ljava/lang/Exception;)V

    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_3

    :cond_7
    return-void
.end method

.method public final zzc()Lcom/google/android/gms/tasks/Task;
    .locals 2

    iget-object v0, p0, Lfb/b0;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsb/k;

    iget-object v1, p0, Lfb/b0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0}, Lfb/b0;->l(Ljava/util/concurrent/atomic/AtomicReference;Lsb/k;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final zzd()Lcom/google/android/gms/tasks/Task;
    .locals 1

    new-instance v0, Lfb/u;

    invoke-direct {v0, p0}, Lfb/u;-><init>(Lfb/b0;)V

    invoke-static {v0}, Lfb/b0;->j(Lfb/u1;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
