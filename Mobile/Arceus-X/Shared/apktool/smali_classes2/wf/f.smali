.class public Lwf/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwf/i;
.implements Lwf/j;


# instance fields
.field public final a:Lyf/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyf/b<",
            "Lwf/p;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Landroid/content/Context;

.field public final c:Lyf/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lyf/b<",
            "Lhg/i;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lwf/g;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lyf/b;Ljava/util/concurrent/Executor;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Lwf/g;",
            ">;",
            "Lyf/b<",
            "Lhg/i;",
            ">;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance v1, Lmf/x;

    new-instance v0, Lwf/e;

    invoke-direct {v0, p1, p2}, Lwf/e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-direct {v1, v0}, Lmf/x;-><init>(Lyf/b;)V

    move-object v0, p0

    move-object v5, p1

    move-object v2, p3

    move-object v4, p4

    move-object v3, p5

    invoke-direct/range {v0 .. v5}, Lwf/f;-><init>(Lyf/b;Ljava/util/Set;Ljava/util/concurrent/Executor;Lyf/b;Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Lyf/b;Ljava/util/Set;Ljava/util/concurrent/Executor;Lyf/b;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyf/b<",
            "Lwf/p;",
            ">;",
            "Ljava/util/Set<",
            "Lwf/g;",
            ">;",
            "Ljava/util/concurrent/Executor;",
            "Lyf/b<",
            "Lhg/i;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lwf/f;->a:Lyf/b;

    .line 4
    iput-object p2, p0, Lwf/f;->d:Ljava/util/Set;

    .line 5
    iput-object p3, p0, Lwf/f;->e:Ljava/util/concurrent/Executor;

    .line 6
    iput-object p4, p0, Lwf/f;->c:Lyf/b;

    .line 7
    iput-object p5, p0, Lwf/f;->b:Landroid/content/Context;

    return-void
.end method

.method public static synthetic c(Lwf/f;)Ljava/lang/String;
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lwf/f;->a:Lyf/b;

    invoke-interface {v0}, Lyf/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwf/p;

    invoke-virtual {v0}, Lwf/p;->g()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lwf/p;->f()V

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwf/q;

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-string v5, "agent"

    invoke-virtual {v3}, Lwf/q;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v5, "dates"

    new-instance v6, Lorg/json/JSONArray;

    invoke-virtual {v3}, Lwf/q;->b()Ljava/util/List;

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

.method public static synthetic d(Landroid/content/Context;Ljava/lang/String;)Lwf/p;
    .locals 1

    new-instance v0, Lwf/p;

    invoke-direct {v0, p0, p1}, Lwf/p;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic e(Lmf/e0;Lmf/d;)Lwf/f;
    .locals 6

    new-instance v0, Lwf/f;

    const-class v1, Landroid/content/Context;

    invoke-interface {p1, v1}, Lmf/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lff/e;

    invoke-interface {p1, v2}, Lmf/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lff/e;

    invoke-virtual {v2}, Lff/e;->o()Ljava/lang/String;

    move-result-object v2

    const-class v3, Lwf/g;

    invoke-interface {p1, v3}, Lmf/d;->d(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v3

    const-class v4, Lhg/i;

    invoke-interface {p1, v4}, Lmf/d;->g(Ljava/lang/Class;)Lyf/b;

    move-result-object v4

    invoke-interface {p1, p0}, Lmf/d;->f(Lmf/e0;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Ljava/util/concurrent/Executor;

    invoke-direct/range {v0 .. v5}, Lwf/f;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lyf/b;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static synthetic f(Lwf/f;)Ljava/lang/Void;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lwf/f;->a:Lyf/b;

    invoke-interface {v0}, Lyf/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwf/p;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-object v3, p0, Lwf/f;->c:Lyf/b;

    invoke-interface {v3}, Lyf/b;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhg/i;

    invoke-interface {v3}, Lhg/i;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lwf/p;->o(JLjava/lang/String;)V

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

.method public static g()Lmf/c;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmf/c<",
            "Lwf/f;",
            ">;"
        }
    .end annotation

    const-class v0, Lkf/a;

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Lmf/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Lmf/e0;

    move-result-object v0

    const-class v1, Lwf/i;

    const-class v2, Lwf/j;

    filled-new-array {v1, v2}, [Ljava/lang/Class;

    move-result-object v1

    const-class v2, Lwf/f;

    invoke-static {v2, v1}, Lmf/c;->d(Ljava/lang/Class;[Ljava/lang/Class;)Lmf/c$b;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-static {v2}, Lmf/r;->j(Ljava/lang/Class;)Lmf/r;

    move-result-object v2

    invoke-virtual {v1, v2}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v1

    const-class v2, Lff/e;

    invoke-static {v2}, Lmf/r;->j(Ljava/lang/Class;)Lmf/r;

    move-result-object v2

    invoke-virtual {v1, v2}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v1

    const-class v2, Lwf/g;

    invoke-static {v2}, Lmf/r;->m(Ljava/lang/Class;)Lmf/r;

    move-result-object v2

    invoke-virtual {v1, v2}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v1

    const-class v2, Lhg/i;

    invoke-static {v2}, Lmf/r;->l(Ljava/lang/Class;)Lmf/r;

    move-result-object v2

    invoke-virtual {v1, v2}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v1

    invoke-static {v0}, Lmf/r;->k(Lmf/e0;)Lmf/r;

    move-result-object v2

    invoke-virtual {v1, v2}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v1

    new-instance v2, Lwf/d;

    invoke-direct {v2, v0}, Lwf/d;-><init>(Lmf/e0;)V

    invoke-virtual {v1, v2}, Lmf/c$b;->f(Lmf/g;)Lmf/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lmf/c$b;->d()Lmf/c;

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

    iget-object v0, p0, Lwf/f;->b:Landroid/content/Context;

    invoke-static {v0}, Lu2/p;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    invoke-static {v0}, Lsb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lwf/f;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Lwf/c;

    invoke-direct {v1, p0}, Lwf/c;-><init>(Lwf/f;)V

    invoke-static {v0, v1}, Lsb/m;->c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized b(Ljava/lang/String;)Lwf/j$a;
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

    iget-object p1, p0, Lwf/f;->a:Lyf/b;

    invoke-interface {p1}, Lyf/b;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwf/p;

    invoke-virtual {p1, v0, v1}, Lwf/p;->m(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lwf/p;->k()V

    sget-object p1, Lwf/j$a;->d:Lwf/j$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    sget-object p1, Lwf/j$a;->b:Lwf/j$a;
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

    iget-object v0, p0, Lwf/f;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    invoke-static {v1}, Lsb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lwf/f;->b:Landroid/content/Context;

    invoke-static {v0}, Lu2/p;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v1}, Lsb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Lwf/f;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Lwf/b;

    invoke-direct {v1, p0}, Lwf/b;-><init>(Lwf/f;)V

    invoke-static {v0, v1}, Lsb/m;->c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
