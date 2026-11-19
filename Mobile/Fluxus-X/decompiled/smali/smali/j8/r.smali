.class public Lj8/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ld8/e;

.field public final c:Lk8/d;

.field public final d:Lj8/x;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:Ll8/b;

.field public final g:Lm8/a;

.field public final h:Lm8/a;

.field public final i:Lk8/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ld8/e;Lk8/d;Lj8/x;Ljava/util/concurrent/Executor;Ll8/b;Lm8/a;Lm8/a;Lk8/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/r;->a:Landroid/content/Context;

    iput-object p2, p0, Lj8/r;->b:Ld8/e;

    iput-object p3, p0, Lj8/r;->c:Lk8/d;

    iput-object p4, p0, Lj8/r;->d:Lj8/x;

    iput-object p5, p0, Lj8/r;->e:Ljava/util/concurrent/Executor;

    iput-object p6, p0, Lj8/r;->f:Ll8/b;

    iput-object p7, p0, Lj8/r;->g:Lm8/a;

    iput-object p8, p0, Lj8/r;->h:Lm8/a;

    iput-object p9, p0, Lj8/r;->i:Lk8/c;

    return-void
.end method

.method public static synthetic a(Lj8/r;Lc8/o;)Ljava/lang/Iterable;
    .locals 0

    iget-object p0, p0, Lj8/r;->c:Lk8/d;

    invoke-interface {p0, p1}, Lk8/d;->q1(Lc8/o;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lj8/r;Ljava/lang/Iterable;Lc8/o;J)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lj8/r;->c:Lk8/d;

    invoke-interface {v0, p1}, Lk8/d;->t1(Ljava/lang/Iterable;)V

    iget-object p1, p0, Lj8/r;->c:Lk8/d;

    iget-object p0, p0, Lj8/r;->g:Lm8/a;

    invoke-interface {p0}, Lm8/a;->a()J

    move-result-wide v0

    add-long/2addr v0, p3

    invoke-interface {p1, p2, v0, v1}, Lk8/d;->k2(Lc8/o;J)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic c(Lj8/r;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lj8/r;->i:Lk8/c;

    invoke-interface {p0}, Lk8/c;->a()V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic d(Lj8/r;Lc8/o;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lj8/r;->c:Lk8/d;

    invoke-interface {p0, p1}, Lk8/d;->o2(Lc8/o;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lj8/r;Ljava/lang/Iterable;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lj8/r;->c:Lk8/d;

    invoke-interface {p0, p1}, Lk8/d;->M(Ljava/lang/Iterable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic f(Lj8/r;Lc8/o;I)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lj8/r;->d:Lj8/x;

    add-int/lit8 p2, p2, 0x1

    invoke-interface {p0, p1, p2}, Lj8/x;->b(Lc8/o;I)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic g(Lj8/r;Lc8/o;J)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lj8/r;->c:Lk8/d;

    iget-object p0, p0, Lj8/r;->g:Lm8/a;

    invoke-interface {p0}, Lm8/a;->a()J

    move-result-wide v1

    add-long/2addr v1, p2

    invoke-interface {v0, p1, v1, v2}, Lk8/d;->k2(Lc8/o;J)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic h(Lj8/r;Ljava/util/Map;)Ljava/lang/Object;
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

    iget-object v1, p0, Lj8/r;->i:Lk8/c;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v2, v2

    sget-object v4, Lf8/c$b;->g:Lf8/c$b;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v1, v2, v3, v4, v0}, Lk8/c;->d(JLf8/c$b;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic i(Lj8/r;Lc8/o;ILjava/lang/Runnable;)V
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v0, p0, Lj8/r;->f:Ll8/b;

    iget-object v1, p0, Lj8/r;->c:Lk8/d;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lj8/i;

    invoke-direct {v2, v1}, Lj8/i;-><init>(Lk8/d;)V

    invoke-interface {v0, v2}, Ll8/b;->b(Ll8/b$a;)Ljava/lang/Object;

    invoke-virtual {p0}, Lj8/r;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lj8/r;->f:Ll8/b;

    new-instance v1, Lj8/j;

    invoke-direct {v1, p0, p1, p2}, Lj8/j;-><init>(Lj8/r;Lc8/o;I)V

    invoke-interface {v0, v1}, Ll8/b;->b(Ll8/b$a;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lj8/r;->l(Lc8/o;I)Ld8/g;
    :try_end_0
    .catch Ll8/a; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    return-void

    :catch_0
    :try_start_1
    iget-object p0, p0, Lj8/r;->d:Lj8/x;

    add-int/lit8 p2, p2, 0x1

    invoke-interface {p0, p1, p2}, Lj8/x;->b(Lc8/o;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    return-void

    :goto_1
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    throw p0
.end method


# virtual methods
.method public j(Ld8/m;)Lc8/i;
    .locals 4

    iget-object v0, p0, Lj8/r;->f:Ll8/b;

    iget-object v1, p0, Lj8/r;->i:Lk8/c;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lj8/h;

    invoke-direct {v2, v1}, Lj8/h;-><init>(Lk8/c;)V

    invoke-interface {v0, v2}, Ll8/b;->b(Ll8/b$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf8/a;

    invoke-static {}, Lc8/i;->a()Lc8/i$a;

    move-result-object v1

    iget-object v2, p0, Lj8/r;->g:Lm8/a;

    invoke-interface {v2}, Lm8/a;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lc8/i$a;->i(J)Lc8/i$a;

    move-result-object v1

    iget-object v2, p0, Lj8/r;->h:Lm8/a;

    invoke-interface {v2}, Lm8/a;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lc8/i$a;->k(J)Lc8/i$a;

    move-result-object v1

    const-string v2, "GDT_CLIENT_METRICS"

    invoke-virtual {v1, v2}, Lc8/i$a;->j(Ljava/lang/String;)Lc8/i$a;

    move-result-object v1

    new-instance v2, Lc8/h;

    const-string v3, "proto"

    invoke-static {v3}, Lz7/c;->b(Ljava/lang/String;)Lz7/c;

    move-result-object v3

    invoke-virtual {v0}, Lf8/a;->f()[B

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lc8/h;-><init>(Lz7/c;[B)V

    invoke-virtual {v1, v2}, Lc8/i$a;->h(Lc8/h;)Lc8/i$a;

    move-result-object v0

    invoke-virtual {v0}, Lc8/i$a;->d()Lc8/i;

    move-result-object v0

    invoke-interface {p1, v0}, Ld8/m;->b(Lc8/i;)Lc8/i;

    move-result-object p1

    return-object p1
.end method

.method public k()Z
    .locals 2

    iget-object v0, p0, Lj8/r;->a:Landroid/content/Context;

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

.method public l(Lc8/o;I)Ld8/g;
    .locals 11

    iget-object v0, p0, Lj8/r;->b:Ld8/e;

    invoke-virtual {p1}, Lc8/o;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ld8/e;->a(Ljava/lang/String;)Ld8/m;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ld8/g;->e(J)Ld8/g;

    move-result-object v3

    move-wide v8, v1

    :goto_0
    iget-object v1, p0, Lj8/r;->f:Ll8/b;

    new-instance v2, Lj8/k;

    invoke-direct {v2, p0, p1}, Lj8/k;-><init>(Lj8/r;Lc8/o;)V

    invoke-interface {v1, v2}, Ll8/b;->b(Ll8/b$a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, p0, Lj8/r;->f:Ll8/b;

    new-instance v2, Lj8/l;

    invoke-direct {v2, p0, p1}, Lj8/l;-><init>(Lj8/r;Lc8/o;)V

    invoke-interface {v1, v2}, Ll8/b;->b(Ll8/b$a;)Ljava/lang/Object;

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

    invoke-static {v1, v2, p1}, Lg8/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Ld8/g;->a()Ld8/g;

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

    check-cast v3, Lk8/k;

    invoke-virtual {v3}, Lk8/k;->b()Lc8/i;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lc8/o;->e()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0, v0}, Lj8/r;->j(Ld8/m;)Lc8/i;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-static {}, Ld8/f;->a()Ld8/f$a;

    move-result-object v2

    invoke-virtual {v2, v1}, Ld8/f$a;->b(Ljava/lang/Iterable;)Ld8/f$a;

    move-result-object v1

    invoke-virtual {p1}, Lc8/o;->c()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ld8/f$a;->c([B)Ld8/f$a;

    move-result-object v1

    invoke-virtual {v1}, Ld8/f$a;->a()Ld8/f;

    move-result-object v1

    invoke-interface {v0, v1}, Ld8/m;->a(Ld8/f;)Ld8/g;

    move-result-object v1

    goto :goto_1

    :goto_3
    invoke-virtual {v3}, Ld8/g;->c()Ld8/g$a;

    move-result-object v1

    sget-object v2, Ld8/g$a;->b:Ld8/g$a;

    const/4 v10, 0x1

    if-ne v1, v2, :cond_4

    iget-object v0, p0, Lj8/r;->f:Ll8/b;

    new-instance v4, Lj8/m;

    move-object v5, p0

    move-object v7, p1

    invoke-direct/range {v4 .. v9}, Lj8/m;-><init>(Lj8/r;Ljava/lang/Iterable;Lc8/o;J)V

    invoke-interface {v0, v4}, Ll8/b;->b(Ll8/b$a;)Ljava/lang/Object;

    iget-object p1, v5, Lj8/r;->d:Lj8/x;

    add-int/2addr p2, v10

    invoke-interface {p1, v7, p2, v10}, Lj8/x;->a(Lc8/o;IZ)V

    return-object v3

    :cond_4
    move-object v5, p0

    move-object v7, p1

    iget-object p1, v5, Lj8/r;->f:Ll8/b;

    new-instance v1, Lj8/n;

    invoke-direct {v1, p0, v6}, Lj8/n;-><init>(Lj8/r;Ljava/lang/Iterable;)V

    invoke-interface {p1, v1}, Ll8/b;->b(Ll8/b$a;)Ljava/lang/Object;

    invoke-virtual {v3}, Ld8/g;->c()Ld8/g$a;

    move-result-object p1

    sget-object v1, Ld8/g$a;->a:Ld8/g$a;

    if-ne p1, v1, :cond_6

    invoke-virtual {v3}, Ld8/g;->b()J

    move-result-wide v1

    invoke-static {v8, v9, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    invoke-virtual {v7}, Lc8/o;->e()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, v5, Lj8/r;->f:Ll8/b;

    new-instance v4, Lj8/o;

    invoke-direct {v4, p0}, Lj8/o;-><init>(Lj8/r;)V

    invoke-interface {p1, v4}, Ll8/b;->b(Ll8/b$a;)Ljava/lang/Object;

    :cond_5
    move-wide v8, v1

    goto :goto_5

    :cond_6
    invoke-virtual {v3}, Ld8/g;->c()Ld8/g$a;

    move-result-object p1

    sget-object v1, Ld8/g$a;->d:Ld8/g$a;

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

    check-cast v2, Lk8/k;

    invoke-virtual {v2}, Lk8/k;->b()Lc8/i;

    move-result-object v2

    invoke-virtual {v2}, Lc8/i;->j()Ljava/lang/String;

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
    iget-object v1, v5, Lj8/r;->f:Ll8/b;

    new-instance v2, Lj8/p;

    invoke-direct {v2, p0, p1}, Lj8/p;-><init>(Lj8/r;Ljava/util/Map;)V

    invoke-interface {v1, v2}, Ll8/b;->b(Ll8/b$a;)Ljava/lang/Object;

    :cond_9
    :goto_5
    move-object p1, v7

    goto/16 :goto_0

    :cond_a
    move-object v5, p0

    move-object v7, p1

    iget-object p1, v5, Lj8/r;->f:Ll8/b;

    new-instance p2, Lj8/q;

    invoke-direct {p2, p0, v7, v8, v9}, Lj8/q;-><init>(Lj8/r;Lc8/o;J)V

    invoke-interface {p1, p2}, Ll8/b;->b(Ll8/b$a;)Ljava/lang/Object;

    return-object v3
.end method

.method public m(Lc8/o;ILjava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Lj8/r;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Lj8/g;

    invoke-direct {v1, p0, p1, p2, p3}, Lj8/g;-><init>(Lj8/r;Lc8/o;ILjava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
