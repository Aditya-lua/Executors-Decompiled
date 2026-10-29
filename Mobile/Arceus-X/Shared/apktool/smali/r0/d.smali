.class public Lr0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne/x;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lne/x<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public final a:Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne/x<",
            "TV;>;"
        }
    .end annotation
.end field

.field public b:Ly1/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly1/c$a<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Lr0/d$a;

    invoke-direct {v0, p0}, Lr0/d$a;-><init>(Lr0/d;)V

    invoke-static {v0}, Ly1/c;->a(Ly1/c$c;)Lne/x;

    move-result-object v0

    iput-object v0, p0, Lr0/d;->a:Lne/x;

    return-void
.end method

.method public constructor <init>(Lne/x;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne/x<",
            "TV;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lne/x;

    iput-object p1, p0, Lr0/d;->a:Lne/x;

    return-void
.end method

.method public static c(Lne/x;)Lr0/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lne/x<",
            "TV;>;)",
            "Lr0/d<",
            "TV;>;"
        }
    .end annotation

    instance-of v0, p0, Lr0/d;

    if-eqz v0, :cond_0

    check-cast p0, Lr0/d;

    return-object p0

    :cond_0
    new-instance v0, Lr0/d;

    invoke-direct {v0, p0}, Lr0/d;-><init>(Lne/x;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 1

    iget-object v0, p0, Lr0/d;->a:Lne/x;

    invoke-interface {v0, p1, p2}, Lne/x;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public cancel(Z)Z
    .locals 1

    iget-object v0, p0, Lr0/d;->a:Lne/x;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    move-result p1

    return p1
.end method

.method public d(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    iget-object v0, p0, Lr0/d;->b:Ly1/c$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ly1/c$a;->c(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public e(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, Lr0/d;->b:Ly1/c$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ly1/c$a;->f(Ljava/lang/Throwable;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final f(Lt/a;Ljava/util/concurrent/Executor;)Lr0/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lt/a<",
            "-TV;TT;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lr0/d<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lr0/n;->x(Lne/x;Lt/a;Ljava/util/concurrent/Executor;)Lne/x;

    move-result-object p1

    check-cast p1, Lr0/d;

    return-object p1
.end method

.method public final g(Lr0/a;Ljava/util/concurrent/Executor;)Lr0/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lr0/a<",
            "-TV;TT;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lr0/d<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lr0/n;->y(Lne/x;Lr0/a;Ljava/util/concurrent/Executor;)Lne/x;

    move-result-object p1

    check-cast p1, Lr0/d;

    return-object p1
.end method

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lr0/d;->a:Lne/x;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TV;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lr0/d;->a:Lne/x;

    invoke-interface {v0, p1, p2, p3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isCancelled()Z
    .locals 1

    iget-object v0, p0, Lr0/d;->a:Lne/x;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public isDone()Z
    .locals 1

    iget-object v0, p0, Lr0/d;->a:Lne/x;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    return v0
.end method
