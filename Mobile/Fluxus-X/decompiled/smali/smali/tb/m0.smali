.class public final Ltb/m0;
.super Lm9/i;
.source "SourceFile"


# instance fields
.field public final b:Ljava/util/List;


# direct methods
.method public constructor <init>(Lm9/j;)V
    .locals 1

    invoke-direct {p0, p1}, Lm9/i;-><init>(Lm9/j;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ltb/m0;->b:Ljava/util/List;

    iget-object p1, p0, Lm9/i;->a:Lm9/j;

    const-string v0, "TaskOnStopCallback"

    invoke-interface {p1, v0, p0}, Lm9/j;->f(Ljava/lang/String;Lm9/i;)V

    return-void
.end method

.method public static l(Landroid/app/Activity;)Ltb/m0;
    .locals 2

    invoke-static {p0}, Lm9/i;->c(Landroid/app/Activity;)Lm9/j;

    move-result-object p0

    monitor-enter p0

    :try_start_0
    const-string v0, "TaskOnStopCallback"

    const-class v1, Ltb/m0;

    invoke-interface {p0, v0, v1}, Lm9/j;->d(Ljava/lang/String;Ljava/lang/Class;)Lm9/i;

    move-result-object v0

    check-cast v0, Ltb/m0;

    if-nez v0, :cond_0

    new-instance v0, Ltb/m0;

    invoke-direct {v0, p0}, Ltb/m0;-><init>(Lm9/j;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public final k()V
    .locals 3

    iget-object v0, p0, Ltb/m0;->b:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltb/m0;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltb/h0;

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ltb/h0;->zzc()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Ltb/m0;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final m(Ltb/h0;)V
    .locals 3

    iget-object v0, p0, Ltb/m0;->b:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltb/m0;->b:Ljava/util/List;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
