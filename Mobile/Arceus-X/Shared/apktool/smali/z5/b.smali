.class public Lz5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly5/u;
.implements Lb6/i;
.implements Ly5/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz5/b$b;
    }
.end annotation


# static fields
.field public static final o:Ljava/lang/String;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lf6/w;",
            "Lku/d2;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lz5/a;

.field public d:Z

.field public final e:Ljava/lang/Object;

.field public final f:Ly5/z;

.field public final g:Ly5/s;

.field public final h:Ly5/b1;

.field public final i:Landroidx/work/a;

.field public final j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lf6/w;",
            "Lz5/b$b;",
            ">;"
        }
    .end annotation
.end field

.field public k:Ljava/lang/Boolean;

.field public final l:Lb6/l;

.field public final m:Lh6/b;

.field public final n:Lz5/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "GreedyScheduler"

    invoke-static {v0}, Lx5/w;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lz5/b;->o:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;Ld6/n;Ly5/s;Ly5/b1;Lh6/b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lz5/b;->b:Ljava/util/Map;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lz5/b;->e:Ljava/lang/Object;

    invoke-static {}, Ly5/z;->a()Ly5/z;

    move-result-object v0

    iput-object v0, p0, Lz5/b;->f:Ly5/z;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lz5/b;->j:Ljava/util/Map;

    iput-object p1, p0, Lz5/b;->a:Landroid/content/Context;

    invoke-virtual {p2}, Landroidx/work/a;->k()Lx5/j0;

    move-result-object p1

    new-instance v0, Lz5/a;

    invoke-virtual {p2}, Landroidx/work/a;->a()Lx5/b;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, Lz5/a;-><init>(Ly5/u;Lx5/j0;Lx5/b;)V

    iput-object v0, p0, Lz5/b;->c:Lz5/a;

    new-instance v0, Lz5/d;

    invoke-direct {v0, p1, p5}, Lz5/d;-><init>(Lx5/j0;Ly5/b1;)V

    iput-object v0, p0, Lz5/b;->n:Lz5/d;

    iput-object p6, p0, Lz5/b;->m:Lh6/b;

    new-instance p1, Lb6/l;

    invoke-direct {p1, p3}, Lb6/l;-><init>(Ld6/n;)V

    iput-object p1, p0, Lz5/b;->l:Lb6/l;

    iput-object p2, p0, Lz5/b;->i:Landroidx/work/a;

    iput-object p4, p0, Lz5/b;->g:Ly5/s;

    iput-object p5, p0, Lz5/b;->h:Ly5/b1;

    return-void
.end method


# virtual methods
.method public varargs a([Lf6/j0;)V
    .locals 11

    iget-object v0, p0, Lz5/b;->k:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lz5/b;->f()V

    :cond_0
    iget-object v0, p0, Lz5/b;->k:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object p1

    sget-object v0, Lz5/b;->o:Ljava/lang/String;

    const-string v1, "Ignoring schedule request in a secondary process"

    invoke-virtual {p1, v0, v1}, Lx5/w;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lz5/b;->g()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    array-length v2, p1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_8

    aget-object v4, p1, v3

    invoke-static {v4}, Lf6/o1;->a(Lf6/j0;)Lf6/w;

    move-result-object v5

    iget-object v6, p0, Lz5/b;->f:Ly5/z;

    invoke-interface {v6, v5}, Ly5/z;->e(Lf6/w;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto/16 :goto_1

    :cond_2
    invoke-virtual {p0, v4}, Lz5/b;->i(Lf6/j0;)J

    move-result-wide v5

    invoke-virtual {v4}, Lf6/j0;->c()J

    move-result-wide v7

    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    iget-object v7, p0, Lz5/b;->i:Landroidx/work/a;

    invoke-virtual {v7}, Landroidx/work/a;->a()Lx5/b;

    move-result-object v7

    invoke-interface {v7}, Lx5/b;->a()J

    move-result-wide v7

    iget-object v9, v4, Lf6/j0;->b:Lx5/o0$c;

    sget-object v10, Lx5/o0$c;->a:Lx5/o0$c;

    if-ne v9, v10, :cond_7

    cmp-long v7, v7, v5

    if-gez v7, :cond_3

    iget-object v7, p0, Lz5/b;->c:Lz5/a;

    if-eqz v7, :cond_7

    invoke-virtual {v7, v4, v5, v6}, Lz5/a;->a(Lf6/j0;J)V

    goto/16 :goto_1

    :cond_3
    invoke-virtual {v4}, Lf6/j0;->m()Z

    move-result v5

    if-eqz v5, :cond_6

    iget-object v5, v4, Lf6/j0;->j:Lx5/d;

    invoke-virtual {v5}, Lx5/d;->j()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v5

    sget-object v6, Lz5/b;->o:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Ignoring "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ". Requires device idle."

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v6, v4}, Lx5/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    invoke-virtual {v5}, Lx5/d;->g()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v5

    sget-object v6, Lz5/b;->o:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Ignoring "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ". Requires ContentUri triggers."

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v6, v4}, Lx5/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v4, v4, Lf6/j0;->a:Ljava/lang/String;

    invoke-interface {v1, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    iget-object v5, p0, Lz5/b;->f:Ly5/z;

    invoke-static {v4}, Lf6/o1;->a(Lf6/j0;)Lf6/w;

    move-result-object v6

    invoke-interface {v5, v6}, Ly5/z;->e(Lf6/w;)Z

    move-result v5

    if-nez v5, :cond_7

    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v5

    sget-object v6, Lz5/b;->o:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Starting work for "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, v4, Lf6/j0;->a:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lx5/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v5, p0, Lz5/b;->f:Ly5/z;

    invoke-interface {v5, v4}, Ly5/z;->d(Lf6/j0;)Ly5/y;

    move-result-object v4

    iget-object v5, p0, Lz5/b;->n:Lz5/d;

    invoke-virtual {v5, v4}, Lz5/d;->c(Ly5/y;)V

    iget-object v5, p0, Lz5/b;->h:Ly5/b1;

    invoke-interface {v5, v4}, Ly5/b1;->d(Ly5/y;)V

    :cond_7
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_8
    iget-object p1, p0, Lz5/b;->e:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_a

    const-string v2, ","

    invoke-static {v2, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v2

    sget-object v3, Lz5/b;->o:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Starting tracking for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Lx5/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_9
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf6/j0;

    invoke-static {v1}, Lf6/o1;->a(Lf6/j0;)Lf6/w;

    move-result-object v2

    iget-object v3, p0, Lz5/b;->b:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    iget-object v3, p0, Lz5/b;->l:Lb6/l;

    iget-object v4, p0, Lz5/b;->m:Lh6/b;

    invoke-interface {v4}, Lh6/b;->b()Lku/l0;

    move-result-object v4

    invoke-static {v3, v1, v4, p0}, Lb6/m;->e(Lb6/l;Lf6/j0;Lku/l0;Lb6/i;)Lku/d2;

    move-result-object v1

    iget-object v3, p0, Lz5/b;->b:Ljava/util/Map;

    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_a
    monitor-exit p1

    return-void

    :goto_3
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lz5/b;->k:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lz5/b;->f()V

    :cond_0
    iget-object v0, p0, Lz5/b;->k:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object p1

    sget-object v0, Lz5/b;->o:Ljava/lang/String;

    const-string v1, "Ignoring schedule request in non-main process"

    invoke-virtual {p1, v0, v1}, Lx5/w;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lz5/b;->g()V

    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v0

    sget-object v1, Lz5/b;->o:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cancelling work ID "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lx5/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lz5/b;->c:Lz5/a;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Lz5/a;->b(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lz5/b;->f:Ly5/z;

    invoke-interface {v0, p1}, Ly5/z;->remove(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly5/y;

    iget-object v1, p0, Lz5/b;->n:Lz5/d;

    invoke-virtual {v1, v0}, Lz5/d;->b(Ly5/y;)V

    iget-object v1, p0, Lz5/b;->h:Ly5/b1;

    invoke-interface {v1, v0}, Ly5/b1;->a(Ly5/y;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public d(Lf6/w;Z)V
    .locals 2

    iget-object v0, p0, Lz5/b;->f:Ly5/z;

    invoke-interface {v0, p1}, Ly5/z;->c(Lf6/w;)Ly5/y;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lz5/b;->n:Lz5/d;

    invoke-virtual {v1, v0}, Lz5/d;->b(Ly5/y;)V

    :cond_0
    invoke-virtual {p0, p1}, Lz5/b;->h(Lf6/w;)V

    if-nez p2, :cond_1

    iget-object p2, p0, Lz5/b;->e:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, Lz5/b;->j:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    return-void
.end method

.method public e(Lf6/j0;Lb6/b;)V
    .locals 4

    invoke-static {p1}, Lf6/o1;->a(Lf6/j0;)Lf6/w;

    move-result-object p1

    instance-of v0, p2, Lb6/b$a;

    if-eqz v0, :cond_0

    iget-object p2, p0, Lz5/b;->f:Ly5/z;

    invoke-interface {p2, p1}, Ly5/z;->e(Lf6/w;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object p2

    sget-object v0, Lz5/b;->o:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Constraints met: Scheduling work ID "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lx5/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lz5/b;->f:Ly5/z;

    invoke-interface {p2, p1}, Ly5/z;->f(Lf6/w;)Ly5/y;

    move-result-object p1

    iget-object p2, p0, Lz5/b;->n:Lz5/d;

    invoke-virtual {p2, p1}, Lz5/d;->c(Ly5/y;)V

    iget-object p2, p0, Lz5/b;->h:Ly5/b1;

    invoke-interface {p2, p1}, Ly5/b1;->d(Ly5/y;)V

    return-void

    :cond_0
    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v0

    sget-object v1, Lz5/b;->o:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Constraints not met: Cancelling work ID "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lx5/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lz5/b;->f:Ly5/z;

    invoke-interface {v0, p1}, Ly5/z;->c(Lf6/w;)Ly5/y;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lz5/b;->n:Lz5/d;

    invoke-virtual {v0, p1}, Lz5/d;->b(Ly5/y;)V

    check-cast p2, Lb6/b$b;

    invoke-virtual {p2}, Lb6/b$b;->a()I

    move-result p2

    iget-object v0, p0, Lz5/b;->h:Ly5/b1;

    invoke-interface {v0, p1, p2}, Ly5/b1;->c(Ly5/y;I)V

    :cond_1
    return-void
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, Lz5/b;->a:Landroid/content/Context;

    iget-object v1, p0, Lz5/b;->i:Landroidx/work/a;

    invoke-static {v0, v1}, Lg6/x;->b(Landroid/content/Context;Landroidx/work/a;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lz5/b;->k:Ljava/lang/Boolean;

    return-void
.end method

.method public final g()V
    .locals 1

    iget-boolean v0, p0, Lz5/b;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lz5/b;->g:Ly5/s;

    invoke-virtual {v0, p0}, Ly5/s;->e(Ly5/e;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz5/b;->d:Z

    :cond_0
    return-void
.end method

.method public final h(Lf6/w;)V
    .locals 5

    iget-object v0, p0, Lz5/b;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz5/b;->b:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lku/d2;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v0

    sget-object v2, Lz5/b;->o:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Stopping tracking for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v2, p1}, Lx5/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-interface {v1, p1}, Lku/d2;->c(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final i(Lf6/j0;)J
    .locals 7

    iget-object v0, p0, Lz5/b;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p1}, Lf6/o1;->a(Lf6/j0;)Lf6/w;

    move-result-object v1

    iget-object v2, p0, Lz5/b;->j:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz5/b$b;

    if-nez v2, :cond_0

    new-instance v2, Lz5/b$b;

    iget v3, p1, Lf6/j0;->k:I

    iget-object v4, p0, Lz5/b;->i:Landroidx/work/a;

    invoke-virtual {v4}, Landroidx/work/a;->a()Lx5/b;

    move-result-object v4

    invoke-interface {v4}, Lx5/b;->a()J

    move-result-wide v4

    const/4 v6, 0x0

    invoke-direct {v2, v3, v4, v5, v6}, Lz5/b$b;-><init>(IJLz5/b$a;)V

    iget-object v3, p0, Lz5/b;->j:Ljava/util/Map;

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-wide v3, v2, Lz5/b$b;->b:J

    iget p1, p1, Lf6/j0;->k:I

    iget v1, v2, Lz5/b$b;->a:I

    sub-int/2addr p1, v1

    add-int/lit8 p1, p1, -0x5

    const/4 v1, 0x0

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    int-to-long v1, p1

    const-wide/16 v5, 0x7530

    mul-long/2addr v1, v5

    add-long/2addr v3, v1

    monitor-exit v0

    return-wide v3

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
