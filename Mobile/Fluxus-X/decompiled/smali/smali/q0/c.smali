.class public final Lq0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Ljava/util/concurrent/Executor;
    .locals 1

    invoke-static {}, Lq0/b;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    return-object v0
.end method

.method public static b()Ljava/util/concurrent/Executor;
    .locals 1

    invoke-static {}, Lq0/d;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    return-object v0
.end method

.method public static c()Ljava/util/concurrent/Executor;
    .locals 1

    invoke-static {}, Lq0/f;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    return-object v0
.end method

.method public static d()Ljava/util/concurrent/Executor;
    .locals 1

    invoke-static {}, Lq0/g;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    return-object v0
.end method

.method public static e()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    invoke-static {}, Lq0/h;->a()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public static f(Landroid/os/Handler;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    new-instance v0, Lq0/e;

    invoke-direct {v0, p0}, Lq0/e;-><init>(Landroid/os/Handler;)V

    return-object v0
.end method

.method public static g(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;
    .locals 1

    new-instance v0, Lq0/i;

    invoke-direct {v0, p0}, Lq0/i;-><init>(Ljava/util/concurrent/Executor;)V

    return-object v0
.end method
