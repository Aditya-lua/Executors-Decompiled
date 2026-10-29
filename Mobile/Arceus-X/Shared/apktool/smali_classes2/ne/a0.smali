.class public final Lne/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lne/a0$c;,
        Lne/a0$b;
    }
.end annotation


# direct methods
.method public static a()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Lne/l;->a:Lne/l;

    return-object v0
.end method

.method public static b(Ljava/util/concurrent/ExecutorService;)Lne/z;
    .locals 1

    instance-of v0, p0, Lne/z;

    if-eqz v0, :cond_0

    check-cast p0, Lne/z;

    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_1

    new-instance v0, Lne/a0$c;

    check-cast p0, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-direct {v0, p0}, Lne/a0$c;-><init>(Ljava/util/concurrent/ScheduledExecutorService;)V

    return-object v0

    :cond_1
    new-instance v0, Lne/a0$b;

    invoke-direct {v0, p0}, Lne/a0$b;-><init>(Ljava/util/concurrent/ExecutorService;)V

    return-object v0
.end method

.method public static c(Ljava/util/concurrent/Executor;Lne/b;)Ljava/util/concurrent/Executor;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lne/b<",
            "*>;)",
            "Ljava/util/concurrent/Executor;"
        }
    .end annotation

    invoke-static {p0}, Lhe/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lhe/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lne/a0;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    if-ne p0, v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lne/a0$a;

    invoke-direct {v0, p0, p1}, Lne/a0$a;-><init>(Ljava/util/concurrent/Executor;Lne/b;)V

    return-object v0
.end method
