.class public final Lce/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lce/b;


# instance fields
.field public final a:Lce/a0;

.field public final b:Lce/a1;

.field public final c:Lce/v0;

.field public final d:Lce/c0;

.field public final e:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lce/a0;Lce/a1;Lce/v0;Lce/c0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lce/h;->e:Landroid/os/Handler;

    iput-object p1, p0, Lce/h;->a:Lce/a0;

    iput-object p2, p0, Lce/h;->b:Lce/a1;

    iput-object p3, p0, Lce/h;->c:Lce/v0;

    iput-object p4, p0, Lce/h;->d:Lce/c0;

    return-void
.end method

.method public static bridge synthetic g(Lce/h;)Lce/a1;
    .locals 0

    iget-object p0, p0, Lce/h;->b:Lce/a1;

    return-object p0
.end method

.method public static bridge synthetic h(Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lce/h;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static i(Ljava/util/List;)Ljava/util/List;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lce/h;->d:Lce/c0;

    invoke-virtual {v0, p1}, Lce/c0;->c(Ljava/util/Collection;)V

    iget-object v0, p0, Lce/h;->a:Lce/a0;

    invoke-virtual {v0, p1}, Lce/a0;->d(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lce/h;->c:Lce/v0;

    invoke-virtual {v0}, Lce/v0;->c()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized c(Lce/f;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lce/h;->b:Lce/a1;

    invoke-virtual {v0, p1}, Lde/o1;->b(Lxd/a;)V
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

.method public final d(Lce/d;)Lcom/google/android/gms/tasks/Task;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lce/d;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Lde/j1;

    invoke-direct {v0}, Lde/j1;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lde/j1;->b(I)V

    invoke-virtual {p1}, Lce/d;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    invoke-virtual {p1}, Lce/d;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lce/h;->c:Lce/v0;

    invoke-virtual {v2}, Lce/v0;->d()Ljava/util/Set;

    move-result-object v2

    if-eqz v2, :cond_2

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Locale;

    invoke-virtual {v4}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v2, v3}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_2
    :goto_1
    invoke-virtual {p1}, Lce/d;->b()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lce/h;->c:Lce/v0;

    invoke-virtual {v2}, Lce/v0;->c()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Lce/d;->b()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lce/h;->d:Lce/c0;

    invoke-virtual {v2}, Lce/c0;->a()Ljava/util/Set;

    move-result-object v2

    invoke-static {v1, v2}, Ljava/util/Collections;->disjoint(Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lce/h;->e:Landroid/os/Handler;

    new-instance v1, Lce/b1;

    invoke-direct {v1, p0, p1}, Lce/b1;-><init>(Lce/h;Lce/d;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Ltb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_2
    iget-object v1, p0, Lce/h;->d:Lce/c0;

    invoke-virtual {p1}, Lce/d;->b()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lce/c0;->d(Ljava/util/Collection;)V

    iget-object v1, p0, Lce/h;->a:Lce/a0;

    invoke-virtual {p1}, Lce/d;->b()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, Lce/d;->a()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lce/h;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, v2, p1, v0}, Lce/a0;->e(Ljava/util/Collection;Ljava/util/Collection;Lde/j1;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lce/h;->a:Lce/a0;

    invoke-virtual {v0, p1}, Lce/a0;->c(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized f(Lce/f;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lce/h;->b:Lce/a1;

    invoke-virtual {v0, p1}, Lde/o1;->d(Lxd/a;)V
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
