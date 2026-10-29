.class public final Lae/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lae/b;


# instance fields
.field public final a:Lae/a0;

.field public final b:Lae/a1;

.field public final c:Lae/v0;

.field public final d:Lae/c0;

.field public final e:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lae/a0;Lae/a1;Lae/v0;Lae/c0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lae/h;->e:Landroid/os/Handler;

    iput-object p1, p0, Lae/h;->a:Lae/a0;

    iput-object p2, p0, Lae/h;->b:Lae/a1;

    iput-object p3, p0, Lae/h;->c:Lae/v0;

    iput-object p4, p0, Lae/h;->d:Lae/c0;

    return-void
.end method

.method public static bridge synthetic g(Lae/h;)Lae/a1;
    .locals 0

    iget-object p0, p0, Lae/h;->b:Lae/a1;

    return-object p0
.end method

.method public static bridge synthetic h(Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lae/h;->i(Ljava/util/List;)Ljava/util/List;

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
.method public final a(Lae/d;)Lcom/google/android/gms/tasks/Task;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lae/d;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Lbe/j1;

    invoke-direct {v0}, Lbe/j1;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lbe/j1;->b(I)V

    invoke-virtual {p1}, Lae/d;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    invoke-virtual {p1}, Lae/d;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lae/h;->c:Lae/v0;

    invoke-virtual {v2}, Lae/v0;->d()Ljava/util/Set;

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
    invoke-virtual {p1}, Lae/d;->b()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lae/h;->c:Lae/v0;

    invoke-virtual {v2}, Lae/v0;->c()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Lae/d;->b()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lae/h;->d:Lae/c0;

    invoke-virtual {v2}, Lae/c0;->a()Ljava/util/Set;

    move-result-object v2

    invoke-static {v1, v2}, Ljava/util/Collections;->disjoint(Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lae/h;->e:Landroid/os/Handler;

    new-instance v1, Lae/b1;

    invoke-direct {v1, p0, p1}, Lae/b1;-><init>(Lae/h;Lae/d;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lsb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_2
    iget-object v1, p0, Lae/h;->d:Lae/c0;

    invoke-virtual {p1}, Lae/d;->b()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lae/c0;->d(Ljava/util/Collection;)V

    iget-object v1, p0, Lae/h;->a:Lae/a0;

    invoke-virtual {p1}, Lae/d;->b()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, Lae/d;->a()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lae/h;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, v2, p1, v0}, Lae/a0;->e(Ljava/util/Collection;Ljava/util/Collection;Lbe/j1;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized b(Lae/f;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lae/h;->b:Lae/a1;

    invoke-virtual {v0, p1}, Lbe/o1;->d(Lvd/a;)V
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

.method public final declared-synchronized c(Lae/f;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lae/h;->b:Lae/a1;

    invoke-virtual {v0, p1}, Lbe/o1;->b(Lvd/a;)V
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

.method public final d(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
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

    iget-object v0, p0, Lae/h;->d:Lae/c0;

    invoke-virtual {v0, p1}, Lae/c0;->c(Ljava/util/Collection;)V

    iget-object v0, p0, Lae/h;->a:Lae/a0;

    invoke-virtual {v0, p1}, Lae/a0;->d(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final e()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lae/h;->c:Lae/v0;

    invoke-virtual {v0}, Lae/v0;->c()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final f(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
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

    iget-object v0, p0, Lae/h;->a:Lae/a0;

    invoke-virtual {v0, p1}, Lae/a0;->c(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
