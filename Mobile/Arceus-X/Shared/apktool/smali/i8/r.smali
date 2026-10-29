.class public Li8/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lc8/e;

.field public final c:Lj8/d;

.field public final d:Li8/x;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:Lk8/b;

.field public final g:Ll8/a;

.field public final h:Ll8/a;

.field public final i:Lj8/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lc8/e;Lj8/d;Li8/x;Ljava/util/concurrent/Executor;Lk8/b;Ll8/a;Ll8/a;Lj8/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/r;->a:Landroid/content/Context;

    iput-object p2, p0, Li8/r;->b:Lc8/e;

    iput-object p3, p0, Li8/r;->c:Lj8/d;

    iput-object p4, p0, Li8/r;->d:Li8/x;

    iput-object p5, p0, Li8/r;->e:Ljava/util/concurrent/Executor;

    iput-object p6, p0, Li8/r;->f:Lk8/b;

    iput-object p7, p0, Li8/r;->g:Ll8/a;

    iput-object p8, p0, Li8/r;->h:Ll8/a;

    iput-object p9, p0, Li8/r;->i:Lj8/c;

    return-void
.end method

.method public static synthetic a(Li8/r;Lb8/o;)Ljava/lang/Iterable;
    .locals 0

    iget-object p0, p0, Li8/r;->c:Lj8/d;

    invoke-interface {p0, p1}, Lj8/d;->e1(Lb8/o;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Li8/r;Ljava/lang/Iterable;Lb8/o;J)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Li8/r;->c:Lj8/d;

    invoke-interface {v0, p1}, Lj8/d;->t1(Ljava/lang/Iterable;)V

    iget-object p1, p0, Li8/r;->c:Lj8/d;

    iget-object p0, p0, Li8/r;->g:Ll8/a;

    invoke-interface {p0}, Ll8/a;->a()J

    move-result-wide v0

    add-long/2addr v0, p3

    invoke-interface {p1, p2, v0, v1}, Lj8/d;->o2(Lb8/o;J)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic c(Li8/r;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Li8/r;->i:Lj8/c;

    invoke-interface {p0}, Lj8/c;->a()V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic d(Li8/r;Lb8/o;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Li8/r;->c:Lj8/d;

    invoke-interface {p0, p1}, Lj8/d;->K(Lb8/o;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Li8/r;Ljava/lang/Iterable;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Li8/r;->c:Lj8/d;

    invoke-interface {p0, p1}, Lj8/d;->J(Ljava/lang/Iterable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic f(Li8/r;Lb8/o;I)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Li8/r;->d:Li8/x;

    add-int/lit8 p2, p2, 0x1

    invoke-interface {p0, p1, p2}, Li8/x;->b(Lb8/o;I)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic g(Li8/r;Lb8/o;J)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Li8/r;->c:Lj8/d;

    iget-object p0, p0, Li8/r;->g:Ll8/a;

    invoke-interface {p0}, Ll8/a;->a()J

    move-result-wide v1

    add-long/2addr v1, p2

    invoke-interface {v0, p1, v1, v2}, Lj8/d;->o2(Lb8/o;J)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic h(Li8/r;Ljava/util/Map;)Ljava/lang/Object;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iget-object v1, p0, Li8/r;->i:Lj8/c;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v2, v2

    sget-object v4, Le8/c$b;->g:Le8/c$b;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v1, v2, v3, v4, v0}, Lj8/c;->d(JLe8/c$b;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic i(Li8/r;Lb8/o;ILjava/lang/Runnable;)V
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v0, p0, Li8/r;->f:Lk8/b;

    iget-object v1, p0, Li8/r;->c:Lj8/d;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Li8/i;

    invoke-direct {v2, v1}, Li8/i;-><init>(Lj8/d;)V

    invoke-interface {v0, v2}, Lk8/b;->b(Lk8/b$a;)Ljava/lang/Object;

    invoke-virtual {p0}, Li8/r;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Li8/r;->f:Lk8/b;

    new-instance v1, Li8/j;

    invoke-direct {v1, p0, p1, p2}, Li8/j;-><init>(Li8/r;Lb8/o;I)V

    invoke-interface {v0, v1}, Lk8/b;->b(Lk8/b$a;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, p1, p2}, Li8/r;->l(Lb8/o;I)Lc8/g;
    :try_end_0
    .catch Lk8/a; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    return-void

    :catch_0
    :try_start_1
    iget-object p0, p0, Li8/r;->d:Li8/x;

    add-int/lit8 p2, p2, 0x1

    invoke-interface {p0, p1, p2}, Li8/x;->b(Lb8/o;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    return-void

    :goto_1
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    throw p0
.end method


# virtual methods
.method public j(Lc8/m;)Lb8/i;
    .locals 4

    iget-object v0, p0, Li8/r;->f:Lk8/b;

    iget-object v1, p0, Li8/r;->i:Lj8/c;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Li8/h;

    invoke-direct {v2, v1}, Li8/h;-><init>(Lj8/c;)V

    invoke-interface {v0, v2}, Lk8/b;->b(Lk8/b$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le8/a;

    invoke-static {}, Lb8/i;->a()Lb8/i$a;

    move-result-object v1

    iget-object v2, p0, Li8/r;->g:Ll8/a;

    invoke-interface {v2}, Ll8/a;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lb8/i$a;->i(J)Lb8/i$a;

    move-result-object v1

    iget-object v2, p0, Li8/r;->h:Ll8/a;

    invoke-interface {v2}, Ll8/a;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lb8/i$a;->k(J)Lb8/i$a;

    move-result-object v1

    const-string v2, "GDT_CLIENT_METRICS"

    invoke-virtual {v1, v2}, Lb8/i$a;->j(Ljava/lang/String;)Lb8/i$a;

    move-result-object v1

    new-instance v2, Lb8/h;

    const-string v3, "proto"

    invoke-static {v3}, Ly7/c;->b(Ljava/lang/String;)Ly7/c;

    move-result-object v3

    invoke-virtual {v0}, Le8/a;->f()[B

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lb8/h;-><init>(Ly7/c;[B)V

    invoke-virtual {v1, v2}, Lb8/i$a;->h(Lb8/h;)Lb8/i$a;

    move-result-object v0

    invoke-virtual {v0}, Lb8/i$a;->d()Lb8/i;

    move-result-object v0

    invoke-interface {p1, v0}, Lc8/m;->a(Lb8/i;)Lb8/i;

    move-result-object p1

    return-object p1
.end method

.method public k()Z
    .locals 2

    iget-object v0, p0, Li8/r;->a:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public l(Lb8/o;I)Lc8/g;
    .locals 11

    iget-object v0, p0, Li8/r;->b:Lc8/e;

    invoke-virtual {p1}, Lb8/o;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lc8/e;->a(Ljava/lang/String;)Lc8/m;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Lc8/g;->e(J)Lc8/g;

    move-result-object v3

    move-wide v8, v1

    :goto_0
    iget-object v1, p0, Li8/r;->f:Lk8/b;

    new-instance v2, Li8/k;

    invoke-direct {v2, p0, p1}, Li8/k;-><init>(Li8/r;Lb8/o;)V

    invoke-interface {v1, v2}, Lk8/b;->b(Lk8/b$a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, p0, Li8/r;->f:Lk8/b;

    new-instance v2, Li8/l;

    invoke-direct {v2, p0, p1}, Li8/l;-><init>(Li8/r;Lb8/o;)V

    invoke-interface {v1, v2}, Lk8/b;->b(Lk8/b$a;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v3

    :cond_0
    if-nez v0, :cond_1

    const-string v1, "Uploader"

    const-string v2, "Unknown backend for %s, deleting event batch for it..."

    invoke-static {v1, v2, p1}, Lf8/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lc8/g;->a()Lc8/g;

    move-result-object v1

    :goto_1
    move-object v3, v1

    goto :goto_3

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj8/k;

    invoke-virtual {v3}, Lj8/k;->b()Lb8/i;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lb8/o;->e()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0, v0}, Li8/r;->j(Lc8/m;)Lb8/i;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-static {}, Lc8/f;->a()Lc8/f$a;

    move-result-object v2

    invoke-virtual {v2, v1}, Lc8/f$a;->b(Ljava/lang/Iterable;)Lc8/f$a;

    move-result-object v1

    invoke-virtual {p1}, Lb8/o;->c()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Lc8/f$a;->c([B)Lc8/f$a;

    move-result-object v1

    invoke-virtual {v1}, Lc8/f$a;->a()Lc8/f;

    move-result-object v1

    invoke-interface {v0, v1}, Lc8/m;->b(Lc8/f;)Lc8/g;

    move-result-object v1

    goto :goto_1

    :goto_3
    invoke-virtual {v3}, Lc8/g;->c()Lc8/g$a;

    move-result-object v1

    sget-object v2, Lc8/g$a;->b:Lc8/g$a;

    const/4 v10, 0x1

    if-ne v1, v2, :cond_4

    iget-object v0, p0, Li8/r;->f:Lk8/b;

    new-instance v4, Li8/m;

    move-object v5, p0

    move-object v7, p1

    invoke-direct/range {v4 .. v9}, Li8/m;-><init>(Li8/r;Ljava/lang/Iterable;Lb8/o;J)V

    invoke-interface {v0, v4}, Lk8/b;->b(Lk8/b$a;)Ljava/lang/Object;

    iget-object p1, v5, Li8/r;->d:Li8/x;

    add-int/2addr p2, v10

    invoke-interface {p1, v7, p2, v10}, Li8/x;->a(Lb8/o;IZ)V

    return-object v3

    :cond_4
    move-object v5, p0

    move-object v7, p1

    iget-object p1, v5, Li8/r;->f:Lk8/b;

    new-instance v1, Li8/n;

    invoke-direct {v1, p0, v6}, Li8/n;-><init>(Li8/r;Ljava/lang/Iterable;)V

    invoke-interface {p1, v1}, Lk8/b;->b(Lk8/b$a;)Ljava/lang/Object;

    invoke-virtual {v3}, Lc8/g;->c()Lc8/g$a;

    move-result-object p1

    sget-object v1, Lc8/g$a;->a:Lc8/g$a;

    if-ne p1, v1, :cond_6

    invoke-virtual {v3}, Lc8/g;->b()J

    move-result-wide v1

    invoke-static {v8, v9, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    invoke-virtual {v7}, Lb8/o;->e()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, v5, Li8/r;->f:Lk8/b;

    new-instance v4, Li8/o;

    invoke-direct {v4, p0}, Li8/o;-><init>(Li8/r;)V

    invoke-interface {p1, v4}, Lk8/b;->b(Lk8/b$a;)Ljava/lang/Object;

    :cond_5
    move-wide v8, v1

    goto :goto_5

    :cond_6
    invoke-virtual {v3}, Lc8/g;->c()Lc8/g$a;

    move-result-object p1

    sget-object v1, Lc8/g$a;->d:Lc8/g$a;

    if-ne p1, v1, :cond_9

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj8/k;

    invoke-virtual {v2}, Lj8/k;->b()Lb8/i;

    move-result-object v2

    invoke-virtual {v2}, Lb8/i;->j()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_7
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    add-int/2addr v4, v10

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_8
    iget-object v1, v5, Li8/r;->f:Lk8/b;

    new-instance v2, Li8/p;

    invoke-direct {v2, p0, p1}, Li8/p;-><init>(Li8/r;Ljava/util/Map;)V

    invoke-interface {v1, v2}, Lk8/b;->b(Lk8/b$a;)Ljava/lang/Object;

    :cond_9
    :goto_5
    move-object p1, v7

    goto/16 :goto_0

    :cond_a
    move-object v5, p0

    move-object v7, p1

    iget-object p1, v5, Li8/r;->f:Lk8/b;

    new-instance p2, Li8/q;

    invoke-direct {p2, p0, v7, v8, v9}, Li8/q;-><init>(Li8/r;Lb8/o;J)V

    invoke-interface {p1, p2}, Lk8/b;->b(Lk8/b$a;)Ljava/lang/Object;

    return-object v3
.end method

.method public m(Lb8/o;ILjava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Li8/r;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Li8/g;

    invoke-direct {v1, p0, p1, p2, p3}, Li8/g;-><init>(Li8/r;Lb8/o;ILjava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
