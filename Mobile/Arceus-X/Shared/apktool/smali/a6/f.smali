.class public La6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly5/u;


# static fields
.field public static final f:Ljava/lang/String;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/app/job/JobScheduler;

.field public final c:La6/d;

.field public final d:Landroidx/work/impl/WorkDatabase;

.field public final e:Landroidx/work/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "SystemJobScheduler"

    invoke-static {v0}, Lx5/w;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, La6/f;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;)V
    .locals 6

    .line 1
    invoke-static {p1}, La6/c;->c(Landroid/content/Context;)Landroid/app/job/JobScheduler;

    move-result-object v4

    new-instance v5, La6/d;

    .line 2
    invoke-virtual {p3}, Landroidx/work/a;->a()Lx5/b;

    move-result-object v0

    .line 3
    invoke-virtual {p3}, Landroidx/work/a;->s()Z

    move-result v1

    invoke-direct {v5, p1, v0, v1}, La6/d;-><init>(Landroid/content/Context;Lx5/b;Z)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 4
    invoke-direct/range {v0 .. v5}, La6/f;-><init>(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Landroid/app/job/JobScheduler;La6/d;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Landroid/app/job/JobScheduler;La6/d;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, La6/f;->a:Landroid/content/Context;

    .line 7
    iput-object p4, p0, La6/f;->b:Landroid/app/job/JobScheduler;

    .line 8
    iput-object p5, p0, La6/f;->c:La6/d;

    .line 9
    iput-object p2, p0, La6/f;->d:Landroidx/work/impl/WorkDatabase;

    .line 10
    iput-object p3, p0, La6/f;->e:Landroidx/work/a;

    return-void
.end method

.method public static d(Landroid/content/Context;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    invoke-static {p0}, La6/c;->c(Landroid/content/Context;)Landroid/app/job/JobScheduler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/job/JobScheduler;->cancelAll()V

    :cond_0
    const-string v0, "jobscheduler"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/job/JobScheduler;

    invoke-static {p0, v0}, La6/f;->g(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/job/JobInfo;

    invoke-virtual {v1}, Landroid/app/job/JobInfo;->getId()I

    move-result v1

    invoke-static {v0, v1}, La6/f;->e(Landroid/app/job/JobScheduler;I)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static e(Landroid/app/job/JobScheduler;I)V
    .locals 4

    :try_start_0
    invoke-virtual {p0, p1}, Landroid/app/job/JobScheduler;->cancel(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v0

    sget-object v1, La6/f;->f:Ljava/lang/String;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v3, "Exception while trying to cancel job (%d)"

    invoke-static {v2, v3, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1, p0}, Lx5/w;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static f(Landroid/content/Context;Landroid/app/job/JobScheduler;Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/app/job/JobScheduler;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-static {p0, p1}, La6/f;->g(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/List;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x2

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/job/JobInfo;

    invoke-static {v0}, La6/f;->h(Landroid/app/job/JobInfo;)Lf6/w;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lf6/w;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/app/job/JobInfo;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object p1
.end method

.method public static g(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/app/job/JobScheduler;",
            ")",
            "Ljava/util/List<",
            "Landroid/app/job/JobInfo;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, La6/c;->b(Landroid/app/job/JobScheduler;)Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v1, Landroid/content/ComponentName;

    const-class v2, Landroidx/work/impl/background/systemjob/SystemJobService;

    invoke-direct {v1, p0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/job/JobInfo;

    invoke-virtual {p1}, Landroid/app/job/JobInfo;->getService()Landroid/content/ComponentName;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static h(Landroid/app/job/JobInfo;)Lf6/w;
    .locals 3

    const-string v0, "EXTRA_WORK_SPEC_ID"

    invoke-virtual {p0}, Landroid/app/job/JobInfo;->getExtras()Landroid/os/PersistableBundle;

    move-result-object p0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "EXTRA_WORK_SPEC_GENERATION"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    new-instance v2, Lf6/w;

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0, v1}, Lf6/w;-><init>(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static i(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;)Z
    .locals 6

    invoke-static {p0}, La6/c;->c(Landroid/content/Context;)Landroid/app/job/JobScheduler;

    move-result-object v0

    invoke-static {p0, v0}, La6/f;->g(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->Z()Lf6/p;

    move-result-object v1

    invoke-interface {v1}, Lf6/p;->c()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v3}, Ljava/util/HashSet;-><init>(I)V

    if-eqz p0, :cond_2

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/job/JobInfo;

    invoke-static {v3}, La6/f;->h(Landroid/app/job/JobInfo;)Lf6/w;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lf6/w;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Landroid/app/job/JobInfo;->getId()I

    move-result v3

    invoke-static {v0, v3}, La6/f;->e(Landroid/app/job/JobScheduler;I)V

    goto :goto_1

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v4, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object p0

    sget-object v0, La6/f;->f:Ljava/lang/String;

    const-string v2, "Reconciling jobs"

    invoke-virtual {p0, v0, v2}, Lx5/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x1

    :cond_4
    if-eqz v2, :cond_6

    invoke-virtual {p1}, Lx4/u;->i()V

    :try_start_0
    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->c0()Lf6/k0;

    move-result-object p0

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-wide/16 v3, -0x1

    invoke-interface {p0, v1, v3, v4}, Lf6/k0;->q(Ljava/lang/String;J)I

    goto :goto_2

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_5
    invoke-virtual {p1}, Lx4/u;->V()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Lx4/u;->p()V

    return v2

    :goto_3
    invoke-virtual {p1}, Lx4/u;->p()V

    throw p0

    :cond_6
    return v2
.end method


# virtual methods
.method public varargs a([Lf6/j0;)V
    .locals 8

    new-instance v0, Lg6/n;

    iget-object v1, p0, La6/f;->d:Landroidx/work/impl/WorkDatabase;

    invoke-direct {v0, v1}, Lg6/n;-><init>(Landroidx/work/impl/WorkDatabase;)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_4

    aget-object v3, p1, v2

    iget-object v4, p0, La6/f;->d:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v4}, Lx4/u;->i()V

    :try_start_0
    iget-object v4, p0, La6/f;->d:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->c0()Lf6/k0;

    move-result-object v4

    iget-object v5, v3, Lf6/j0;->a:Ljava/lang/String;

    invoke-interface {v4, v5}, Lf6/k0;->k(Ljava/lang/String;)Lf6/j0;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v5, "Skipping scheduling "

    if-nez v4, :cond_0

    :try_start_1
    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v4

    sget-object v6, La6/f;->f:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v3, Lf6/j0;->a:Ljava/lang/String;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " because it\'s no longer in the DB"

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v6, v3}, Lx5/w;->k(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, La6/f;->d:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v3}, Lx4/u;->V()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    iget-object v3, p0, La6/f;->d:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v3}, Lx4/u;->p()V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_0
    :try_start_2
    iget-object v4, v4, Lf6/j0;->b:Lx5/o0$c;

    sget-object v6, Lx5/o0$c;->a:Lx5/o0$c;

    if-eq v4, v6, :cond_1

    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v4

    sget-object v6, La6/f;->f:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v3, Lf6/j0;->a:Ljava/lang/String;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " because it is no longer enqueued"

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v6, v3}, Lx5/w;->k(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, La6/f;->d:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v3}, Lx4/u;->V()V

    goto :goto_1

    :cond_1
    invoke-static {v3}, Lf6/o1;->a(Lf6/j0;)Lf6/w;

    move-result-object v4

    iget-object v5, p0, La6/f;->d:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->Z()Lf6/p;

    move-result-object v5

    invoke-interface {v5, v4}, Lf6/p;->d(Lf6/w;)Lf6/o;

    move-result-object v5

    if-eqz v5, :cond_2

    iget v6, v5, Lf6/o;->c:I

    goto :goto_2

    :cond_2
    iget-object v6, p0, La6/f;->e:Landroidx/work/a;

    invoke-virtual {v6}, Landroidx/work/a;->i()I

    move-result v6

    iget-object v7, p0, La6/f;->e:Landroidx/work/a;

    invoke-virtual {v7}, Landroidx/work/a;->g()I

    move-result v7

    invoke-virtual {v0, v6, v7}, Lg6/n;->b(II)I

    move-result v6

    :goto_2
    if-nez v5, :cond_3

    invoke-static {v4, v6}, Lf6/v;->a(Lf6/w;I)Lf6/o;

    move-result-object v4

    iget-object v5, p0, La6/f;->d:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->Z()Lf6/p;

    move-result-object v5

    invoke-interface {v5, v4}, Lf6/p;->a(Lf6/o;)V

    :cond_3
    invoke-virtual {p0, v3, v6}, La6/f;->j(Lf6/j0;I)V

    iget-object v3, p0, La6/f;->d:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v3}, Lx4/u;->V()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :goto_4
    iget-object v0, p0, La6/f;->d:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lx4/u;->p()V

    throw p1

    :cond_4
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, La6/f;->a:Landroid/content/Context;

    iget-object v1, p0, La6/f;->b:Landroid/app/job/JobScheduler;

    invoke-static {v0, v1, p1}, La6/f;->f(Landroid/content/Context;Landroid/app/job/JobScheduler;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, La6/f;->b:Landroid/app/job/JobScheduler;

    invoke-static {v2, v1}, La6/f;->e(Landroid/app/job/JobScheduler;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, La6/f;->d:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->Z()Lf6/p;

    move-result-object v0

    invoke-interface {v0, p1}, Lf6/p;->e(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public j(Lf6/j0;I)V
    .locals 5

    iget-object v0, p0, La6/f;->c:La6/d;

    invoke-virtual {v0, p1, p2}, La6/d;->a(Lf6/j0;I)Landroid/app/job/JobInfo;

    move-result-object v0

    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v1

    sget-object v2, La6/f;->f:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Scheduling work ID "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p1, Lf6/j0;->a:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "Job ID "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lx5/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v1, p0, La6/f;->b:Landroid/app/job/JobScheduler;

    invoke-virtual {v1, v0}, Landroid/app/job/JobScheduler;->schedule(Landroid/app/job/JobInfo;)I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to schedule work ID "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p1, Lf6/j0;->a:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lx5/w;->k(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p1, Lf6/j0;->q:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Lf6/j0;->r:Lx5/f0;

    sget-object v1, Lx5/f0;->a:Lx5/f0;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p1, Lf6/j0;->q:Z

    const-string v0, "Scheduling a non-expedited job (work ID %s)"

    iget-object v1, p1, Lf6/j0;->a:Ljava/lang/String;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v1

    invoke-virtual {v1, v2, v0}, Lx5/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, La6/f;->j(Lf6/j0;I)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p2

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :goto_0
    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v0

    sget-object v1, La6/f;->f:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to schedule "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1, p2}, Lx5/w;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :goto_1
    iget-object p2, p0, La6/f;->a:Landroid/content/Context;

    iget-object v0, p0, La6/f;->d:Landroidx/work/impl/WorkDatabase;

    iget-object v1, p0, La6/f;->e:Landroidx/work/a;

    invoke-static {p2, v0, v1}, La6/c;->a(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;)Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v0

    sget-object v1, La6/f;->f:Ljava/lang/String;

    invoke-virtual {v0, v1, p2}, Lx5/w;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, La6/f;->e:Landroidx/work/a;

    invoke-virtual {p1}, Landroidx/work/a;->l()Lx2/a;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1, v0}, Lx2/a;->accept(Ljava/lang/Object;)V

    :cond_0
    :goto_2
    return-void

    :cond_1
    throw v0
.end method
