.class public final Lsb/m0;
.super Ll9/i;
.source "SourceFile"


# instance fields
.field public final b:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll9/j;)V
    .locals 1

    invoke-direct {p0, p1}, Ll9/i;-><init>(Ll9/j;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lsb/m0;->b:Ljava/util/List;

    iget-object p1, p0, Ll9/i;->a:Ll9/j;

    const-string v0, "TaskOnStopCallback"

    invoke-interface {p1, v0, p0}, Ll9/j;->g(Ljava/lang/String;Ll9/i;)V

    return-void
.end method

.method public static l(Landroid/app/Activity;)Lsb/m0;
    .locals 2

    invoke-static {p0}, Ll9/i;->c(Landroid/app/Activity;)Ll9/j;

    move-result-object p0

    monitor-enter p0

    :try_start_0
    const-string v0, "TaskOnStopCallback"

    const-class v1, Lsb/m0;

    invoke-interface {p0, v0, v1}, Ll9/j;->d(Ljava/lang/String;Ljava/lang/Class;)Ll9/i;

    move-result-object v0

    check-cast v0, Lsb/m0;

    if-nez v0, :cond_0

    new-instance v0, Lsb/m0;

    invoke-direct {v0, p0}, Lsb/m0;-><init>(Ll9/j;)V

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

    iget-object v0, p0, Lsb/m0;->b:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lsb/m0;->b:Ljava/util/List;

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

    check-cast v2, Lsb/h0;

    if-eqz v2, :cond_0

    invoke-interface {v2}, Lsb/h0;->zzc()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lsb/m0;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final m(Lsb/h0;)V
    .locals 3

    iget-object v0, p0, Lsb/m0;->b:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lsb/m0;->b:Ljava/util/List;

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
