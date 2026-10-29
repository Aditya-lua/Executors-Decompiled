.class public Lg6/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx5/h0;


# static fields
.field public static final c:Ljava/lang/String;


# instance fields
.field public final a:Landroidx/work/impl/WorkDatabase;

.field public final b:Lh6/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkProgressUpdater"

    invoke-static {v0}, Lx5/w;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg6/g0;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase;Lh6/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/g0;->a:Landroidx/work/impl/WorkDatabase;

    iput-object p2, p0, Lg6/g0;->b:Lh6/b;

    return-void
.end method

.method public static synthetic b(Lg6/g0;Ljava/util/UUID;Landroidx/work/b;)Ljava/lang/Void;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v1

    sget-object v2, Lg6/g0;->c:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Updating progress for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " ("

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lx5/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lg6/g0;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {p1}, Lx4/u;->i()V

    :try_start_0
    iget-object p1, p0, Lg6/g0;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->c0()Lf6/k0;

    move-result-object p1

    invoke-interface {p1, v0}, Lf6/k0;->k(Ljava/lang/String;)Lf6/j0;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p1, Lf6/j0;->b:Lx5/o0$c;

    sget-object v1, Lx5/o0$c;->b:Lx5/o0$c;

    if-ne p1, v1, :cond_0

    new-instance p1, Lf6/c0;

    invoke-direct {p1, v0, p2}, Lf6/c0;-><init>(Ljava/lang/String;Landroidx/work/b;)V

    iget-object p2, p0, Lg6/g0;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {p2}, Landroidx/work/impl/WorkDatabase;->b0()Lf6/d0;

    move-result-object p2

    invoke-interface {p2, p1}, Lf6/d0;->b(Lf6/c0;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Ignoring setProgressAsync(...). WorkSpec ("

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ") is not in a RUNNING state."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v2, p2}, Lx5/w;->k(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lg6/g0;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {p1}, Lx4/u;->V()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p0, p0, Lg6/g0;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {p0}, Lx4/u;->p()V

    const/4 p0, 0x0

    return-object p0

    :cond_1
    :try_start_1
    const-string p1, "Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    :try_start_2
    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object p2

    sget-object v0, Lg6/g0;->c:Ljava/lang/String;

    const-string v1, "Error updating Worker progress"

    invoke-virtual {p2, v0, v1, p1}, Lx5/w;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    iget-object p0, p0, Lg6/g0;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {p0}, Lx4/u;->p()V

    throw p1
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/util/UUID;Landroidx/work/b;)Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/UUID;",
            "Landroidx/work/b;",
            ")",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object p1, p0, Lg6/g0;->b:Lh6/b;

    invoke-interface {p1}, Lh6/b;->c()Lh6/a;

    move-result-object p1

    new-instance v0, Lg6/f0;

    invoke-direct {v0, p0, p2, p3}, Lg6/f0;-><init>(Lg6/g0;Ljava/util/UUID;Landroidx/work/b;)V

    const-string p2, "updateProgress"

    invoke-static {p1, p2, v0}, Lx5/u;->f(Ljava/util/concurrent/Executor;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lne/x;

    move-result-object p1

    return-object p1
.end method
