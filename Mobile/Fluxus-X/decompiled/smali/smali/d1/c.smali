.class public final Ld1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/r;
.implements Lg0/l;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "UsesNonDefaultVisibleForTesting"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Landroidx/lifecycle/s;

.field public final c:Ls0/f;

.field public volatile d:Z

.field public e:Z

.field public f:Z

.field public g:Lg0/g2;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/s;Ls0/f;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ld1/c;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Ld1/c;->d:Z

    iput-boolean v0, p0, Ld1/c;->e:Z

    iput-boolean v0, p0, Ld1/c;->f:Z

    const/4 v0, 0x0

    iput-object v0, p0, Ld1/c;->g:Lg0/g2;

    iput-object p1, p0, Ld1/c;->b:Landroidx/lifecycle/s;

    iput-object p2, p0, Ld1/c;->c:Ls0/f;

    invoke-interface {p1}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/l;->b()Landroidx/lifecycle/l$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/l$b;->d:Landroidx/lifecycle/l$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/l$b;->b(Landroidx/lifecycle/l$b;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Ls0/f;->w()V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ls0/f;->H()V

    :goto_0
    invoke-interface {p1}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    return-void
.end method

.method public static synthetic m(Lj0/b;Lg0/g2;)V
    .locals 1

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lj0/b;->a()Ljava/util/Set;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_0
    invoke-virtual {p1}, Lg0/g2;->d()Lx2/a;

    move-result-object p0

    invoke-interface {p0, v0}, Lx2/a;->accept(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public A()V
    .locals 3

    iget-object v0, p0, Ld1/c;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Ld1/c;->e:Z

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    iput-boolean v1, p0, Ld1/c;->e:Z

    iget-object v1, p0, Ld1/c;->b:Landroidx/lifecycle/s;

    invoke-interface {v1}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/l;->b()Landroidx/lifecycle/l$b;

    move-result-object v1

    sget-object v2, Landroidx/lifecycle/l$b;->d:Landroidx/lifecycle/l$b;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/l$b;->b(Landroidx/lifecycle/l$b;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ld1/c;->b:Landroidx/lifecycle/s;

    invoke-virtual {p0, v1}, Ld1/c;->onStart(Landroidx/lifecycle/s;)V

    :cond_1
    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public c()Lg0/m;
    .locals 1

    iget-object v0, p0, Ld1/c;->c:Ls0/f;

    invoke-virtual {v0}, Ls0/f;->c()Lg0/m;

    move-result-object v0

    return-object v0
.end method

.method public d()Lg0/t;
    .locals 1

    iget-object v0, p0, Ld1/c;->c:Ls0/f;

    invoke-virtual {v0}, Ls0/f;->d()Lg0/t;

    move-result-object v0

    return-object v0
.end method

.method public n(Lg0/g2;)V
    .locals 5

    iget-object v0, p0, Ld1/c;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ld1/c;->g:Lg0/g2;

    if-nez v1, :cond_0

    iput-object p1, p0, Ld1/c;->g:Lg0/g2;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p1}, Lg0/g2;->m()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ld1/c;->g:Lg0/g2;

    invoke-virtual {v1}, Lg0/g2;->m()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ld1/c;->g:Lg0/g2;

    invoke-virtual {v2}, Lg0/g2;->k()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1}, Lg0/g2;->k()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    new-instance v2, Lg0/q1;

    invoke-virtual {p1}, Lg0/g2;->l()Lg0/y2;

    move-result-object v3

    invoke-virtual {p1}, Lg0/g2;->c()Ljava/util/List;

    move-result-object v4

    invoke-direct {v2, v1, v3, v4}, Lg0/q1;-><init>(Ljava/util/List;Lg0/y2;Ljava/util/List;)V

    iput-object v2, p0, Ld1/c;->g:Lg0/g2;

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v1, p0, Ld1/c;->g:Lg0/g2;

    invoke-virtual {v1}, Lg0/g2;->m()Z

    move-result v1

    if-nez v1, :cond_3

    iput-object p1, p0, Ld1/c;->g:Lg0/g2;

    iget-object v1, p0, Ld1/c;->c:Ls0/f;

    invoke-virtual {v1}, Ls0/f;->O()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls0/f;->f0(Ljava/util/Collection;)V

    :goto_0
    iget-object v1, p0, Ld1/c;->c:Ls0/f;

    invoke-virtual {p1}, Lg0/g2;->l()Lg0/y2;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls0/f;->m0(Lg0/y2;)V

    iget-object v1, p0, Ld1/c;->c:Ls0/f;

    invoke-virtual {p1}, Lg0/g2;->c()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls0/f;->i0(Ljava/util/List;)V

    iget-object v1, p0, Ld1/c;->c:Ls0/f;

    invoke-virtual {p1}, Lg0/g2;->i()I

    move-result v2

    invoke-virtual {v1, v2}, Ls0/f;->l0(I)V

    iget-object v1, p0, Ld1/c;->c:Ls0/f;

    invoke-virtual {p1}, Lg0/g2;->f()Landroid/util/Range;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls0/f;->k0(Landroid/util/Range;)V

    invoke-virtual {p0}, Ld1/c;->d()Lg0/t;

    move-result-object v1

    check-cast v1, Ln0/o0;

    invoke-static {p1, v1}, Lj0/b;->b(Lg0/g2;Ln0/o0;)Lj0/b;

    move-result-object v1

    invoke-virtual {p1}, Lg0/g2;->e()Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Ld1/b;

    invoke-direct {v3, v1, p1}, Ld1/b;-><init>(Lj0/b;Lg0/g2;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object v2, p0, Ld1/c;->c:Ls0/f;

    invoke-virtual {p1}, Lg0/g2;->k()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v2, p1, v1}, Ls0/f;->n(Ljava/util/Collection;Lj0/b;)V

    monitor-exit v0

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public onDestroy(Landroidx/lifecycle/s;)V
    .locals 2
    .annotation runtime Landroidx/lifecycle/f0;
        value = .enum Landroidx/lifecycle/l$a;->ON_DESTROY:Landroidx/lifecycle/l$a;
    .end annotation

    iget-object p1, p0, Ld1/c;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Ld1/c;->c:Ls0/f;

    invoke-virtual {v0}, Ls0/f;->O()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls0/f;->f0(Ljava/util/Collection;)V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onPause(Landroidx/lifecycle/s;)V
    .locals 1
    .annotation runtime Landroidx/lifecycle/f0;
        value = .enum Landroidx/lifecycle/l$a;->ON_PAUSE:Landroidx/lifecycle/l$a;
    .end annotation

    iget-object p1, p0, Ld1/c;->c:Ls0/f;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ls0/f;->h(Z)V

    return-void
.end method

.method public onResume(Landroidx/lifecycle/s;)V
    .locals 1
    .annotation runtime Landroidx/lifecycle/f0;
        value = .enum Landroidx/lifecycle/l$a;->ON_RESUME:Landroidx/lifecycle/l$a;
    .end annotation

    iget-object p1, p0, Ld1/c;->c:Ls0/f;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ls0/f;->h(Z)V

    return-void
.end method

.method public onStart(Landroidx/lifecycle/s;)V
    .locals 1
    .annotation runtime Landroidx/lifecycle/f0;
        value = .enum Landroidx/lifecycle/l$a;->ON_START:Landroidx/lifecycle/l$a;
    .end annotation

    iget-object p1, p0, Ld1/c;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-boolean v0, p0, Ld1/c;->e:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ld1/c;->f:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ld1/c;->c:Ls0/f;

    invoke-virtual {v0}, Ls0/f;->w()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ld1/c;->d:Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onStop(Landroidx/lifecycle/s;)V
    .locals 1
    .annotation runtime Landroidx/lifecycle/f0;
        value = .enum Landroidx/lifecycle/l$a;->ON_STOP:Landroidx/lifecycle/l$a;
    .end annotation

    iget-object p1, p0, Ld1/c;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-boolean v0, p0, Ld1/c;->e:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ld1/c;->f:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ld1/c;->c:Ls0/f;

    invoke-virtual {v0}, Ls0/f;->H()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ld1/c;->d:Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public s()Ls0/f;
    .locals 1

    iget-object v0, p0, Ld1/c;->c:Ls0/f;

    return-object v0
.end method

.method public t()Landroidx/lifecycle/s;
    .locals 2

    iget-object v0, p0, Ld1/c;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ld1/c;->b:Landroidx/lifecycle/s;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public u()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lg0/w2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ld1/c;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ld1/c;->c:Ls0/f;

    invoke-virtual {v1}, Ls0/f;->O()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

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

.method public v(Lg0/w2;)Z
    .locals 2

    iget-object v0, p0, Ld1/c;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ld1/c;->c:Ls0/f;

    invoke-virtual {v1}, Ls0/f;->O()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public w()Z
    .locals 2

    iget-object v0, p0, Ld1/c;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ld1/c;->g:Lg0/g2;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lg0/g2;->m()Z

    move-result v1

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public x()V
    .locals 2

    iget-object v0, p0, Ld1/c;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Ld1/c;->e:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ld1/c;->b:Landroidx/lifecycle/s;

    invoke-virtual {p0, v1}, Ld1/c;->onStop(Landroidx/lifecycle/s;)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Ld1/c;->e:Z

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public y(Lg0/g2;)V
    .locals 5

    iget-object v0, p0, Ld1/c;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ld1/c;->g:Lg0/g2;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lg0/g2;->m()Z

    move-result v1

    invoke-virtual {p1}, Lg0/g2;->m()Z

    move-result v2

    if-eq v1, v2, :cond_0

    goto :goto_2

    :cond_0
    iget-object v1, p0, Ld1/c;->g:Lg0/g2;

    invoke-virtual {v1}, Lg0/g2;->m()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    invoke-virtual {p1}, Lg0/g2;->m()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Ld1/c;->g:Lg0/g2;

    if-ne v1, p1, :cond_1

    iput-object v2, p0, Ld1/c;->g:Lg0/g2;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    monitor-exit v0

    return-void

    :cond_2
    iget-object v1, p0, Ld1/c;->g:Lg0/g2;

    invoke-virtual {v1}, Lg0/g2;->m()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Lg0/g2;->m()Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v1, Ljava/util/ArrayList;

    iget-object v3, p0, Ld1/c;->g:Lg0/g2;

    invoke-virtual {v3}, Lg0/g2;->k()Ljava/util/List;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1}, Lg0/g2;->k()Ljava/util/List;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    new-instance v2, Lg0/q1;

    iget-object v3, p0, Ld1/c;->g:Lg0/g2;

    invoke-virtual {v3}, Lg0/g2;->l()Lg0/y2;

    move-result-object v3

    iget-object v4, p0, Ld1/c;->g:Lg0/g2;

    invoke-virtual {v4}, Lg0/g2;->c()Ljava/util/List;

    move-result-object v4

    invoke-direct {v2, v1, v3, v4}, Lg0/q1;-><init>(Ljava/util/List;Lg0/y2;Ljava/util/List;)V

    :goto_0
    iput-object v2, p0, Ld1/c;->g:Lg0/g2;

    :cond_4
    :goto_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lg0/g2;->k()Ljava/util/List;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object p1, p0, Ld1/c;->c:Ls0/f;

    invoke-virtual {p1}, Ls0/f;->O()Ljava/util/List;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/List;->retainAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Ld1/c;->c:Ls0/f;

    invoke-virtual {p1, v1}, Ls0/f;->f0(Ljava/util/Collection;)V

    monitor-exit v0

    return-void

    :cond_5
    :goto_2
    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public z()V
    .locals 3

    iget-object v0, p0, Ld1/c;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ld1/c;->c:Ls0/f;

    invoke-virtual {v1}, Ls0/f;->O()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls0/f;->f0(Ljava/util/Collection;)V

    const/4 v1, 0x0

    iput-object v1, p0, Ld1/c;->g:Lg0/g2;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
