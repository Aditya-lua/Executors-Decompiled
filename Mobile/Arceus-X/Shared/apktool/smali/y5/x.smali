.class public Ly5/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "Schedulers"

    invoke-static {v0}, Lx5/w;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ly5/x;->a:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(Ljava/util/concurrent/Executor;Ljava/util/List;Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Lf6/w;Z)V
    .locals 0

    new-instance p5, Ly5/w;

    invoke-direct {p5, p1, p4, p2, p3}, Ly5/w;-><init>(Ljava/util/List;Lf6/w;Landroidx/work/a;Landroidx/work/impl/WorkDatabase;)V

    invoke-interface {p0, p5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic b(Ljava/util/List;Lf6/w;Landroidx/work/a;Landroidx/work/impl/WorkDatabase;)V
    .locals 3

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly5/u;

    invoke-virtual {p1}, Lf6/w;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ly5/u;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {p2, p3, p0}, Ly5/x;->f(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    return-void
.end method

.method public static c(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;)Ly5/u;
    .locals 1

    new-instance v0, La6/f;

    invoke-direct {v0, p0, p1, p2}, La6/f;-><init>(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;)V

    const-class p1, Landroidx/work/impl/background/systemjob/SystemJobService;

    const/4 p2, 0x1

    invoke-static {p0, p1, p2}, Lg6/v;->c(Landroid/content/Context;Ljava/lang/Class;Z)V

    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object p0

    sget-object p1, Ly5/x;->a:Ljava/lang/String;

    const-string p2, "Created SystemJobScheduler and enabled SystemJobService"

    invoke-virtual {p0, p1, p2}, Lx5/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static d(Lf6/k0;Lx5/b;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/k0;",
            "Lx5/b;",
            "Ljava/util/List<",
            "Lf6/j0;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-interface {p1}, Lx5/b;->a()J

    move-result-wide v0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lf6/j0;

    iget-object p2, p2, Lf6/j0;->a:Ljava/lang/String;

    invoke-interface {p0, p2, v0, v1}, Lf6/k0;->q(Ljava/lang/String;J)I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static e(Ljava/util/List;Ly5/s;Ljava/util/concurrent/Executor;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ly5/u;",
            ">;",
            "Ly5/s;",
            "Ljava/util/concurrent/Executor;",
            "Landroidx/work/impl/WorkDatabase;",
            "Landroidx/work/a;",
            ")V"
        }
    .end annotation

    new-instance v0, Ly5/v;

    invoke-direct {v0, p2, p0, p4, p3}, Ly5/v;-><init>(Ljava/util/concurrent/Executor;Ljava/util/List;Landroidx/work/a;Landroidx/work/impl/WorkDatabase;)V

    invoke-virtual {p1, v0}, Ly5/s;->e(Ly5/e;)V

    return-void
.end method

.method public static f(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/work/a;",
            "Landroidx/work/impl/WorkDatabase;",
            "Ljava/util/List<",
            "Ly5/u;",
            ">;)V"
        }
    .end annotation

    if-eqz p2, :cond_5

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->c0()Lf6/k0;

    move-result-object v0

    invoke-virtual {p1}, Lx4/u;->i()V

    :try_start_0
    invoke-interface {v0}, Lf6/k0;->x()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/work/a;->a()Lx5/b;

    move-result-object v2

    invoke-static {v0, v2, v1}, Ly5/x;->d(Lf6/k0;Lx5/b;Ljava/util/List;)V

    invoke-virtual {p0}, Landroidx/work/a;->h()I

    move-result v2

    invoke-interface {v0, v2}, Lf6/k0;->t(I)Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Landroidx/work/a;->a()Lx5/b;

    move-result-object p0

    invoke-static {v0, p0, v2}, Ly5/x;->d(Lf6/k0;Lx5/b;Ljava/util/List;)V

    if-eqz v1, :cond_1

    invoke-interface {v2, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_1
    :goto_0
    const/16 p0, 0xc8

    invoke-interface {v0, p0}, Lf6/k0;->o(I)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p1}, Lx4/u;->V()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Lx4/u;->p()V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_3

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lf6/j0;

    invoke-interface {v2, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lf6/j0;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly5/u;

    invoke-interface {v1}, Ly5/u;->c()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1, p1}, Ly5/u;->a([Lf6/j0;)V

    goto :goto_1

    :cond_3
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_5

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lf6/j0;

    invoke-interface {p0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lf6/j0;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ly5/u;

    invoke-interface {p2}, Ly5/u;->c()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-interface {p2, p0}, Ly5/u;->a([Lf6/j0;)V

    goto :goto_2

    :goto_3
    invoke-virtual {p1}, Lx4/u;->p()V

    throw p0

    :cond_5
    :goto_4
    return-void
.end method
