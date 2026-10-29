.class public final Lne/b$h;
.super Lne/b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lne/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lne/b$b;-><init>(Lne/b$a;)V

    return-void
.end method

.method public synthetic constructor <init>(Lne/b$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lne/b$h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lne/b;Lne/b$e;Lne/b$e;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne/b<",
            "*>;",
            "Lne/b$e;",
            "Lne/b$e;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Lne/b;->i(Lne/b;)Lne/b$e;

    move-result-object v0

    if-ne v0, p2, :cond_0

    invoke-static {p1, p3}, Lne/b;->j(Lne/b;Lne/b$e;)Lne/b$e;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public b(Lne/b;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne/b<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Lne/b;->e(Lne/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p2, :cond_0

    invoke-static {p1, p3}, Lne/b;->f(Lne/b;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public c(Lne/b;Lne/b$l;Lne/b$l;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne/b<",
            "*>;",
            "Lne/b$l;",
            "Lne/b$l;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Lne/b;->k(Lne/b;)Lne/b$l;

    move-result-object v0

    if-ne v0, p2, :cond_0

    invoke-static {p1, p3}, Lne/b;->l(Lne/b;Lne/b$l;)Lne/b$l;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public d(Lne/b;Lne/b$e;)Lne/b$e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne/b<",
            "*>;",
            "Lne/b$e;",
            ")",
            "Lne/b$e;"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Lne/b;->i(Lne/b;)Lne/b$e;

    move-result-object v0

    if-eq v0, p2, :cond_0

    invoke-static {p1, p2}, Lne/b;->j(Lne/b;Lne/b$e;)Lne/b$e;

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p1

    return-object v0

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public e(Lne/b;Lne/b$l;)Lne/b$l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne/b<",
            "*>;",
            "Lne/b$l;",
            ")",
            "Lne/b$l;"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Lne/b;->k(Lne/b;)Lne/b$l;

    move-result-object v0

    if-eq v0, p2, :cond_0

    invoke-static {p1, p2}, Lne/b;->l(Lne/b;Lne/b$l;)Lne/b$l;

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p1

    return-object v0

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public f(Lne/b$l;Lne/b$l;)V
    .locals 0

    iput-object p2, p1, Lne/b$l;->b:Lne/b$l;

    return-void
.end method

.method public g(Lne/b$l;Ljava/lang/Thread;)V
    .locals 0

    iput-object p2, p1, Lne/b$l;->a:Ljava/lang/Thread;

    return-void
.end method
