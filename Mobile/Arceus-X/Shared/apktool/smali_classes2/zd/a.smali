.class public Lzd/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Ljava/util/concurrent/atomic/AtomicReference;


# instance fields
.field public final a:Lzd/f;

.field public final b:Lae/c0;

.field public final c:Ljava/util/Set;

.field public final d:Lzd/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lzd/a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lzd/a;->c:Ljava/util/Set;

    :try_start_0
    new-instance v0, Lzd/f;

    invoke-direct {v0, p1}, Lzd/f;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lzd/a;->a:Lzd/f;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v1, Lzd/b;

    invoke-direct {v1, v0}, Lzd/b;-><init>(Lzd/f;)V

    iput-object v1, p0, Lzd/a;->d:Lzd/b;

    new-instance v0, Lae/c0;

    invoke-direct {v0, p1}, Lae/c0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lzd/a;->b:Lae/c0;

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lbe/d0;

    const-string v1, "Failed to initialize FileStorage"

    invoke-direct {v0, v1, p1}, Lbe/d0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lzd/a;->k(Landroid/content/Context;Z)Z

    move-result p0

    return p0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {}, Lzd/a;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    sget-object v0, Lzd/a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzd/a;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lzd/a;->a(Landroid/content/Context;)Z

    :cond_1
    invoke-static {p0}, Lzd/a;->a(Landroid/content/Context;)Z

    move-result p0

    return p0

    :cond_2
    iget-object v1, v0, Lzd/a;->d:Lzd/b;

    invoke-virtual {v0}, Lzd/a;->h()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v1, p0, v0}, Lzd/b;->b(Landroid/content/Context;Ljava/util/Set;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic c(Lzd/a;)Lzd/f;
    .locals 0

    iget-object p0, p0, Lzd/a;->a:Lzd/f;

    return-object p0
.end method

.method public static bridge synthetic d(Lzd/a;)Ljava/util/Set;
    .locals 0

    invoke-virtual {p0}, Lzd/a;->h()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic e(Lzd/a;Ljava/util/Set;)V
    .locals 0

    invoke-virtual {p0, p1}, Lzd/a;->i(Ljava/util/Set;)V

    return-void
.end method

.method public static f(Landroid/content/Context;)Z
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lzd/a;->k(Landroid/content/Context;Z)Z

    move-result p0

    return p0
.end method

.method public static g()Z
    .locals 1

    sget-object v0, Lzd/a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static k(Landroid/content/Context;Z)Z
    .locals 11

    invoke-static {}, Lzd/a;->l()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    sget-object v0, Lzd/a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v2, Lzd/a;

    invoke-direct {v2, p0}, Lzd/a;-><init>(Landroid/content/Context;)V

    :cond_1
    const/4 v3, 0x0

    invoke-static {v0, v3, v2}, Lp1/t;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    move v0, v4

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    move v0, v1

    :goto_0
    sget-object v2, Lzd/a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzd/a;

    if-eqz v0, :cond_3

    sget-object v0, Lae/r0;->a:Lae/r0;

    new-instance v5, Lbe/l;

    invoke-static {}, Lzd/e;->a()Ljava/util/concurrent/Executor;

    move-result-object v7

    new-instance v8, Lbe/n;

    iget-object v3, v2, Lzd/a;->a:Lzd/f;

    new-instance v6, Lbe/i;

    invoke-direct {v6}, Lbe/i;-><init>()V

    invoke-direct {v8, p0, v3, v6}, Lbe/n;-><init>(Landroid/content/Context;Lzd/f;Lbe/i;)V

    iget-object v9, v2, Lzd/a;->a:Lzd/f;

    new-instance v10, Lzd/t;

    invoke-direct {v10}, Lzd/t;-><init>()V

    move-object v6, p0

    invoke-direct/range {v5 .. v10}, Lbe/l;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lbe/n;Lzd/f;Lzd/t;)V

    invoke-virtual {v0, v5}, Lae/r0;->a(Lae/k0;)V

    new-instance p0, Lzd/q;

    invoke-direct {p0, v2}, Lzd/q;-><init>(Lzd/a;)V

    invoke-static {p0}, Lae/u0;->b(Lae/t0;)V

    invoke-static {}, Lzd/e;->a()Ljava/util/concurrent/Executor;

    move-result-object p0

    new-instance v0, Lzd/p;

    invoke-direct {v0, v6}, Lzd/p;-><init>(Landroid/content/Context;)V

    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_3
    move-object v6, p0

    :goto_1
    :try_start_0
    invoke-virtual {v2, v6, p1}, Lzd/a;->j(Landroid/content/Context;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v4

    :catch_0
    move-exception v0

    move-object p0, v0

    const-string p1, "SplitCompat"

    const-string v0, "Error installing additional splits"

    invoke-static {p1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return v1
.end method

.method public static l()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final h()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, Lzd/a;->c:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/HashSet;

    iget-object v2, p0, Lzd/a;->c:Ljava/util/Set;

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final i(Ljava/util/Set;)V
    .locals 2

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lzd/a;->a:Lzd/f;

    invoke-virtual {v1, v0}, Lzd/f;->g(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lzd/f;->l(Ljava/io/File;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lzd/a;->b:Lae/c0;

    invoke-virtual {p1}, Lae/c0;->b()V

    return-void
.end method

.method public final declared-synchronized j(Landroid/content/Context;Z)V
    .locals 8

    monitor-enter p0

    if-eqz p2, :cond_0

    :try_start_0
    iget-object v0, p0, Lzd/a;->a:Lzd/f;

    invoke-virtual {v0}, Lzd/f;->k()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_f

    :cond_0
    invoke-static {}, Lzd/e;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lzd/r;

    invoke-direct {v1, p0}, Lzd/r;-><init>(Lzd/a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->splitNames:[Ljava/lang/String;

    if-nez v1, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    goto :goto_1

    :catch_0
    move-exception p1

    goto/16 :goto_e

    :cond_1
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    :try_start_2
    iget-object v0, p0, Lzd/a;->a:Lzd/f;

    invoke-virtual {v0}, Lzd/f;->j()Ljava/util/Set;

    move-result-object v0

    iget-object v2, p0, Lzd/a;->b:Lae/c0;

    invoke-virtual {v2}, Lae/c0;->a()Ljava/util/Set;

    move-result-object v2

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lzd/u;

    invoke-virtual {v5}, Lzd/u;->b()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    invoke-static {v5}, Lae/v0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    :cond_3
    invoke-interface {v3, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    goto :goto_2

    :cond_4
    if-eqz p2, :cond_5

    invoke-virtual {p0, v3}, Lzd/a;->i(Ljava/util/Set;)V

    goto :goto_3

    :cond_5
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-static {}, Lzd/e;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v4, Lzd/s;

    invoke-direct {v4, p0, v3}, Lzd/s;-><init>(Lzd/a;Ljava/util/Set;)V

    invoke-interface {v2, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_6
    :goto_3
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_7
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lzd/u;

    invoke-virtual {v4}, Lzd/u;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lae/v0;->e(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_7

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_9
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lae/v0;->e(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_9

    invoke-interface {v2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    new-instance v1, Ljava/util/HashSet;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/HashSet;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_b
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzd/u;

    invoke-virtual {v3}, Lzd/u;->b()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lae/v0;->c:Lbe/q1;

    const-string v5, "config."

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_c

    invoke-virtual {v3}, Lzd/u;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lae/v0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    :cond_c
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_d
    new-instance v0, Lzd/o;

    iget-object v2, p0, Lzd/a;->a:Lzd/f;

    invoke-direct {v0, v2}, Lzd/o;-><init>(Lzd/f;)V

    invoke-static {}, Lbe/p;->a()Lbe/o;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    if-eqz p2, :cond_e

    invoke-virtual {v0}, Lzd/o;->c()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v2, v3, v0}, Lbe/o;->b(Ljava/lang/ClassLoader;Ljava/util/Set;)V

    goto :goto_8

    :cond_e
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lzd/u;

    invoke-virtual {v0, v5}, Lzd/o;->b(Lzd/u;)Ljava/util/Set;

    move-result-object v5

    if-nez v5, :cond_f

    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    goto :goto_7

    :cond_f
    invoke-interface {v2, v3, v5}, Lbe/o;->b(Ljava/lang/ClassLoader;Ljava/util/Set;)V

    goto :goto_7

    :cond_10
    :goto_8
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lzd/u;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    new-instance v6, Ljava/util/zip/ZipFile;

    invoke-virtual {v5}, Lzd/u;->a()Ljava/io/File;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    const-string v7, "classes.dex"

    invoke-virtual {v6, v7}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v7

    invoke-virtual {v6}, Ljava/util/zip/ZipFile;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v7, :cond_12

    :try_start_5
    iget-object v6, p0, Lzd/a;->a:Lzd/f;

    invoke-virtual {v5}, Lzd/u;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lzd/f;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v6

    invoke-virtual {v5}, Lzd/u;->a()Ljava/io/File;

    move-result-object v7

    invoke-interface {v2, v3, v6, v7, p2}, Lbe/o;->a(Ljava/lang/ClassLoader;Ljava/io/File;Ljava/io/File;Z)Z

    move-result v6

    if-eqz v6, :cond_11

    goto :goto_a

    :cond_11
    invoke-virtual {v5}, Lzd/u;->a()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "split was not installed "

    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "SplitCompat"

    invoke-static {v6, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_9

    :cond_12
    :goto_a
    invoke-virtual {v5}, Lzd/u;->a()Ljava/io/File;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_9

    :catch_1
    move-exception p1

    goto :goto_b

    :catch_2
    move-exception p1

    const/4 v6, 0x0

    :goto_b
    if-eqz v6, :cond_13

    :try_start_6
    invoke-virtual {v6}, Ljava/util/zip/ZipFile;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_c

    :catch_3
    move-exception p2

    :try_start_7
    const-class v0, Ljava/lang/Throwable;

    const-string v1, "addSuppressed"

    const-class v2, Ljava/lang/Throwable;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :catch_4
    :cond_13
    :goto_c
    :try_start_8
    throw p1

    :cond_14
    iget-object p2, p0, Lzd/a;->d:Lzd/b;

    invoke-virtual {p2, p1, v0}, Lzd/b;->a(Landroid/content/Context;Ljava/util/Set;)V

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_d
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzd/u;

    invoke-virtual {v1}, Lzd/u;->a()Ljava/io/File;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-virtual {v1}, Lzd/u;->b()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Split \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\' installation emulated"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "SplitCompat"

    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v1}, Lzd/u;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_15
    invoke-virtual {v1}, Lzd/u;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Split \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\' installation not emulated."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "SplitCompat"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_d

    :cond_16
    iget-object p2, p0, Lzd/a;->c:Ljava/util/Set;

    monitor-enter p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :try_start_9
    iget-object v0, p0, Lzd/a;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    monitor-exit p2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    :try_start_a
    monitor-exit p2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :try_start_b
    throw p1

    :goto_e
    new-instance p2, Ljava/io/IOException;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Cannot load data for application \'%s\'"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :goto_f
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    throw p1
.end method
