.class public final Lne/s;
.super Lne/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lne/s$a;,
        Lne/s$b;
    }
.end annotation


# direct methods
.method public static a(Lne/x;Lne/q;Ljava/util/concurrent/Executor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lne/x<",
            "TV;>;",
            "Lne/q<",
            "-TV;>;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    invoke-static {p1}, Lhe/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lne/s$a;

    invoke-direct {v0, p0, p1}, Lne/s$a;-><init>(Ljava/util/concurrent/Future;Lne/q;)V

    invoke-interface {p0, v0, p2}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static b(Ljava/lang/Iterable;)Lne/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "+",
            "Lne/x<",
            "+TV;>;>;)",
            "Lne/x<",
            "Ljava/util/List<",
            "TV;>;>;"
        }
    .end annotation

    new-instance v0, Lne/j$a;

    invoke-static {p0}, Lie/t;->m(Ljava/lang/Iterable;)Lie/t;

    move-result-object p0

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lne/j$a;-><init>(Lie/r;Z)V

    return-object v0
.end method

.method public static varargs c([Lne/x;)Lne/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">([",
            "Lne/x<",
            "+TV;>;)",
            "Lne/x<",
            "Ljava/util/List<",
            "TV;>;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    new-instance v0, Lne/j$a;

    invoke-static {p0}, Lie/t;->u([Ljava/lang/Object;)Lie/t;

    move-result-object p0

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lne/j$a;-><init>(Lie/r;Z)V

    return-object v0
.end method

.method public static d(Lne/x;Ljava/lang/Class;Lhe/f;Ljava/util/concurrent/Executor;)Lne/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            "X:",
            "Ljava/lang/Throwable;",
            ">(",
            "Lne/x<",
            "+TV;>;",
            "Ljava/lang/Class<",
            "TX;>;",
            "Lhe/f<",
            "-TX;+TV;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lne/x<",
            "TV;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lne/a;->M(Lne/x;Ljava/lang/Class;Lhe/f;Ljava/util/concurrent/Executor;)Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lne/x;Ljava/lang/Class;Lne/i;Ljava/util/concurrent/Executor;)Lne/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            "X:",
            "Ljava/lang/Throwable;",
            ">(",
            "Lne/x<",
            "+TV;>;",
            "Ljava/lang/Class<",
            "TX;>;",
            "Lne/i<",
            "-TX;+TV;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lne/x<",
            "TV;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lne/a;->N(Lne/x;Ljava/lang/Class;Lne/i;Ljava/util/concurrent/Executor;)Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static f(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Future<",
            "TV;>;)TV;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    const-string v1, "Future was expected to be done: %s"

    invoke-static {v0, v1, p0}, Lhe/n;->t(ZLjava/lang/String;Ljava/lang/Object;)V

    invoke-static {p0}, Lne/h0;->a(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ljava/lang/Throwable;)Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Throwable;",
            ")",
            "Lne/x<",
            "TV;>;"
        }
    .end annotation

    invoke-static {p0}, Lhe/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lne/v$a;

    invoke-direct {v0, p0}, Lne/v$a;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static h(Ljava/lang/Object;)Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(TV;)",
            "Lne/x<",
            "TV;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    sget-object p0, Lne/v;->b:Lne/x;

    return-object p0

    :cond_0
    new-instance v0, Lne/v;

    invoke-direct {v0, p0}, Lne/v;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static i()Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    sget-object v0, Lne/v;->b:Lne/x;

    return-object v0
.end method

.method public static j(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)Lne/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lne/g0;->M(Ljava/lang/Runnable;Ljava/lang/Object;)Lne/g0;

    move-result-object p0

    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object p0
.end method

.method public static k(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lne/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<O:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TO;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lne/x<",
            "TO;>;"
        }
    .end annotation

    invoke-static {p0}, Lne/g0;->N(Ljava/util/concurrent/Callable;)Lne/g0;

    move-result-object p0

    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object p0
.end method

.method public static l(Lne/x;Lhe/f;Ljava/util/concurrent/Executor;)Lne/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "Lne/x<",
            "TI;>;",
            "Lhe/f<",
            "-TI;+TO;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lne/x<",
            "TO;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lne/d;->M(Lne/x;Lhe/f;Ljava/util/concurrent/Executor;)Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static m(Lne/x;Lne/i;Ljava/util/concurrent/Executor;)Lne/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "Lne/x<",
            "TI;>;",
            "Lne/i<",
            "-TI;+TO;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lne/x<",
            "TO;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lne/d;->N(Lne/x;Lne/i;Ljava/util/concurrent/Executor;)Lne/x;

    move-result-object p0

    return-object p0
.end method

.method public static n(Ljava/lang/Iterable;)Lne/s$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "+",
            "Lne/x<",
            "+TV;>;>;)",
            "Lne/s$b<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Lne/s$b;

    invoke-static {p0}, Lie/t;->m(Ljava/lang/Iterable;)Lie/t;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v2, p0, v1}, Lne/s$b;-><init>(ZLie/t;Lne/r;)V

    return-object v0
.end method

.method public static varargs o([Lne/x;)Lne/s$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">([",
            "Lne/x<",
            "+TV;>;)",
            "Lne/s$b<",
            "TV;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    new-instance v0, Lne/s$b;

    invoke-static {p0}, Lie/t;->u([Ljava/lang/Object;)Lie/t;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v2, p0, v1}, Lne/s$b;-><init>(ZLie/t;Lne/r;)V

    return-object v0
.end method
