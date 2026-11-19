.class public Lyf/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyf/i;
.implements Lyf/j;


# instance fields
.field public final a:Lag/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lag/b<",
            "Lyf/p;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Landroid/content/Context;

.field public final c:Lag/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lag/b<",
            "Ljg/i;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lyf/g;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lag/b;Ljava/util/Set;Ljava/util/concurrent/Executor;Lag/b;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lag/b<",
            "Lyf/p;",
            ">;",
            "Ljava/util/Set<",
            "Lyf/g;",
            ">;",
            "Ljava/util/concurrent/Executor;",
            "Lag/b<",
            "Ljg/i;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lyf/f;->a:Lag/b;

    .line 4
    iput-object p2, p0, Lyf/f;->d:Ljava/util/Set;

    .line 5
    iput-object p3, p0, Lyf/f;->e:Ljava/util/concurrent/Executor;

    .line 6
    iput-object p4, p0, Lyf/f;->c:Lag/b;

    .line 7
    iput-object p5, p0, Lyf/f;->b:Landroid/content/Context;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lag/b;Ljava/util/concurrent/Executor;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Lyf/g;",
            ">;",
            "Lag/b<",
            "Ljg/i;",
            ">;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance v1, Lof/x;

    new-instance v0, Lyf/e;

    invoke-direct {v0, p1, p2}, Lyf/e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-direct {v1, v0}, Lof/x;-><init>(Lag/b;)V

    move-object v0, p0

    move-object v5, p1

    move-object v2, p3

    move-object v4, p4

    move-object v3, p5

    invoke-direct/range {v0 .. v5}, Lyf/f;-><init>(Lag/b;Ljava/util/Set;Ljava/util/concurrent/Executor;Lag/b;Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic c(Lyf/f;)Ljava/lang/String;
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lyf/f;->a:Lag/b;

    invoke-interface {v0}, Lag/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyf/p;

    invoke-virtual {v0}, Lyf/p;->g()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lyf/p;->f()V

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lyf/q;

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-string v5, "agent"

    invoke-virtual {v3}, Lyf/q;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v5, "dates"

    new-instance v6, Lorg/json/JSONArray;

    invoke-virtual {v3}, Lyf/q;->b()Ljava/util/List;

    move-result-object v3

    invoke-direct {v6, v3}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "heartbeats"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "version"

    const-string v2, "2"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v2, Landroid/util/Base64OutputStream;

    const/16 v3, 0xb

    invoke-direct {v2, v0, v3}, Landroid/util/Base64OutputStream;-><init>(Ljava/io/OutputStream;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v3, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v3, v2}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v4, "UTF-8"

    invoke-virtual {v1, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-virtual {v2}, Landroid/util/Base64OutputStream;->close()V

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    return-object v0

    :catchall_1
    move-exception v0

    goto :goto_2

    :catchall_2
    move-exception v0

    :try_start_5
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v1

    :try_start_6
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_2
    :try_start_7
    invoke-virtual {v2}, Landroid/util/Base64OutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_3

    :catchall_4
    move-exception v1

    :try_start_8
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v0

    :goto_4
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    throw v0
.end method

.method public static synthetic d(Landroid/content/Context;Ljava/lang/String;)Lyf/p;
    .locals 1

    new-instance v0, Lyf/p;

    invoke-direct {v0, p0, p1}, Lyf/p;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic e(Lof/e0;Lof/d;)Lyf/f;
    .locals 6

    new-instance v0, Lyf/f;

    const-class v1, Landroid/content/Context;

    invoke-interface {p1, v1}, Lof/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lhf/e;

    invoke-interface {p1, v2}, Lof/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhf/e;

    invoke-virtual {v2}, Lhf/e;->o()Ljava/lang/String;

    move-result-object v2

    const-class v3, Lyf/g;

    invoke-interface {p1, v3}, Lof/d;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v3

    const-class v4, Ljg/i;

    invoke-interface {p1, v4}, Lof/d;->d(Ljava/lang/Class;)Lag/b;

    move-result-object v4

    invoke-interface {p1, p0}, Lof/d;->f(Lof/e0;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Ljava/util/concurrent/Executor;

    invoke-direct/range {v0 .. v5}, Lyf/f;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lag/b;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static synthetic f(Lyf/f;)Ljava/lang/Void;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lyf/f;->a:Lag/b;

    invoke-interface {v0}, Lag/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyf/p;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-object v3, p0, Lyf/f;->c:Lag/b;

    invoke-interface {v3}, Lag/b;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljg/i;

    invoke-interface {v3}, Ljg/i;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lyf/p;->o(JLjava/lang/String;)V

    monitor-exit p0

    const/4 p0, 0x0

    return-object p0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static g()Lof/c;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lof/c<",
            "Lyf/f;",
            ">;"
        }
    .end annotation

    const-class v0, Lmf/a;

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Lof/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lof/e0;

    move-result-object v0

    const-class v1, Lyf/i;

    const-class v2, Lyf/j;

    filled-new-array {v1, v2}, [Ljava/lang/Class;

    move-result-object v1

    const-class v2, Lyf/f;

    invoke-static {v2, v1}, Lof/c;->d(Ljava/lang/Class;[Ljava/lang/Class;)Lof/c$b;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-static {v2}, Lof/r;->j(Ljava/lang/Class;)Lof/r;

    move-result-object v2

    invoke-virtual {v1, v2}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v1

    const-class v2, Lhf/e;

    invoke-static {v2}, Lof/r;->j(Ljava/lang/Class;)Lof/r;

    move-result-object v2

    invoke-virtual {v1, v2}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v1

    const-class v2, Lyf/g;

    invoke-static {v2}, Lof/r;->m(Ljava/lang/Class;)Lof/r;

    move-result-object v2

    invoke-virtual {v1, v2}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v1

    const-class v2, Ljg/i;

    invoke-static {v2}, Lof/r;->l(Ljava/lang/Class;)Lof/r;

    move-result-object v2

    invoke-virtual {v1, v2}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v1

    invoke-static {v0}, Lof/r;->k(Lof/e0;)Lof/r;

    move-result-object v2

    invoke-virtual {v1, v2}, Lof/c$b;->b(Lof/r;)Lof/c$b;

    move-result-object v1

    new-instance v2, Lyf/d;

    invoke-direct {v2, v0}, Lyf/d;-><init>(Lof/e0;)V

    invoke-virtual {v1, v2}, Lof/c$b;->f(Lof/g;)Lof/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lof/c$b;->d()Lof/c;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lyf/f;->b:Landroid/content/Context;

    invoke-static {v0}, Lu2/p;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    invoke-static {v0}, Ltb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lyf/f;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Lyf/c;

    invoke-direct {v1, p0}, Lyf/c;-><init>(Lyf/f;)V

    invoke-static {v0, v1}, Ltb/m;->c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized b(Ljava/lang/String;)Lyf/j$a;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object p1, p0, Lyf/f;->a:Lag/b;

    invoke-interface {p1}, Lag/b;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lyf/p;

    invoke-virtual {p1, v0, v1}, Lyf/p;->m(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lyf/p;->k()V

    sget-object p1, Lyf/j$a;->d:Lyf/j$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    sget-object p1, Lyf/j$a;->b:Lyf/j$a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public h()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lyf/f;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    invoke-static {v1}, Ltb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lyf/f;->b:Landroid/content/Context;

    invoke-static {v0}, Lu2/p;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v1}, Ltb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Lyf/f;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Lyf/b;

    invoke-direct {v1, p0}, Lyf/b;-><init>(Lyf/f;)V

    invoke-static {v0, v1}, Ltb/m;->c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
