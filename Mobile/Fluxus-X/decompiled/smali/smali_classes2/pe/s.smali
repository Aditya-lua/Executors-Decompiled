.class public final Lpe/s;
.super Lpe/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpe/s$a;,
        Lpe/s$b;
    }
.end annotation


# direct methods
.method public static a(Lpe/x;Lpe/q;Ljava/util/concurrent/Executor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lpe/x<",
            "TV;>;",
            "Lpe/q<",
            "-TV;>;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    invoke-static {p1}, Lje/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lpe/s$a;

    invoke-direct {v0, p0, p1}, Lpe/s$a;-><init>(Ljava/util/concurrent/Future;Lpe/q;)V

    invoke-interface {p0, v0, p2}, Lpe/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static b(Ljava/lang/Iterable;)Lpe/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "+",
            "Lpe/x<",
            "+TV;>;>;)",
            "Lpe/x<",
            "Ljava/util/List<",
            "TV;>;>;"
        }
    .end annotation

    new-instance v0, Lpe/j$a;

    invoke-static {p0}, Lke/t;->m(Ljava/lang/Iterable;)Lke/t;

    move-result-object p0

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lpe/j$a;-><init>(Lke/r;Z)V

    return-object v0
.end method

.method public static varargs c([Lpe/x;)Lpe/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">([",
            "Lpe/x<",
            "+TV;>;)",
            "Lpe/x<",
            "Ljava/util/List<",
            "TV;>;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    new-instance v0, Lpe/j$a;

    invoke-static {p0}, Lke/t;->t([Ljava/lang/Object;)Lke/t;

    move-result-object p0

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lpe/j$a;-><init>(Lke/r;Z)V

    return-object v0
.end method

.method public static d(Lpe/x;Ljava/lang/Class;Lje/f;Ljava/util/concurrent/Executor;)Lpe/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            "X:",
            "Ljava/lang/Throwable;",
            ">(",
            "Lpe/x<",
            "+TV;>;",
            "Ljava/lang/Class<",
            "TX;>;",
            "Lje/f<",
            "-TX;+TV;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lpe/x<",
            "TV;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lpe/a;->M(Lpe/x;Ljava/lang/Class;Lje/f;Ljava/util/concurrent/Executor;)Lpe/x;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lpe/x;Ljava/lang/Class;Lpe/i;Ljava/util/concurrent/Executor;)Lpe/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            "X:",
            "Ljava/lang/Throwable;",
            ">(",
            "Lpe/x<",
            "+TV;>;",
            "Ljava/lang/Class<",
            "TX;>;",
            "Lpe/i<",
            "-TX;+TV;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lpe/x<",
            "TV;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lpe/a;->N(Lpe/x;Ljava/lang/Class;Lpe/i;Ljava/util/concurrent/Executor;)Lpe/x;

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

    invoke-static {v0, v1, p0}, Lje/n;->t(ZLjava/lang/String;Ljava/lang/Object;)V

    invoke-static {p0}, Lpe/h0;->a(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ljava/lang/Throwable;)Lpe/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Throwable;",
            ")",
            "Lpe/x<",
            "TV;>;"
        }
    .end annotation

    invoke-static {p0}, Lje/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lpe/v$a;

    invoke-direct {v0, p0}, Lpe/v$a;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static h(Ljava/lang/Object;)Lpe/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(TV;)",
            "Lpe/x<",
            "TV;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    sget-object p0, Lpe/v;->b:Lpe/x;

    return-object p0

    :cond_0
    new-instance v0, Lpe/v;

    invoke-direct {v0, p0}, Lpe/v;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static i()Lpe/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lpe/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    sget-object v0, Lpe/v;->b:Lpe/x;

    return-object v0
.end method

.method public static j(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)Lpe/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lpe/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lpe/g0;->M(Ljava/lang/Runnable;Ljava/lang/Object;)Lpe/g0;

    move-result-object p0

    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object p0
.end method

.method public static k(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lpe/x;
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
            "Lpe/x<",
            "TO;>;"
        }
    .end annotation

    invoke-static {p0}, Lpe/g0;->N(Ljava/util/concurrent/Callable;)Lpe/g0;

    move-result-object p0

    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object p0
.end method

.method public static l(Lpe/x;Lje/f;Ljava/util/concurrent/Executor;)Lpe/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "Lpe/x<",
            "TI;>;",
            "Lje/f<",
            "-TI;+TO;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lpe/x<",
            "TO;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lpe/d;->M(Lpe/x;Lje/f;Ljava/util/concurrent/Executor;)Lpe/x;

    move-result-object p0

    return-object p0
.end method

.method public static m(Lpe/x;Lpe/i;Ljava/util/concurrent/Executor;)Lpe/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "Lpe/x<",
            "TI;>;",
            "Lpe/i<",
            "-TI;+TO;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lpe/x<",
            "TO;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lpe/d;->N(Lpe/x;Lpe/i;Ljava/util/concurrent/Executor;)Lpe/x;

    move-result-object p0

    return-object p0
.end method

.method public static n(Ljava/lang/Iterable;)Lpe/s$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "+",
            "Lpe/x<",
            "+TV;>;>;)",
            "Lpe/s$b<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Lpe/s$b;

    invoke-static {p0}, Lke/t;->m(Ljava/lang/Iterable;)Lke/t;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v2, p0, v1}, Lpe/s$b;-><init>(ZLke/t;Lpe/r;)V

    return-object v0
.end method

.method public static varargs o([Lpe/x;)Lpe/s$b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">([",
            "Lpe/x<",
            "+TV;>;)",
            "Lpe/s$b<",
            "TV;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    new-instance v0, Lpe/s$b;

    invoke-static {p0}, Lke/t;->t([Ljava/lang/Object;)Lke/t;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v2, p0, v1}, Lpe/s$b;-><init>(ZLke/t;Lpe/r;)V

    return-object v0
.end method
