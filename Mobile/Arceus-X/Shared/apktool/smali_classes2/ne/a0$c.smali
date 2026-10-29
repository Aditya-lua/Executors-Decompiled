.class public final Lne/a0$c;
.super Lne/a0$b;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/ScheduledExecutorService;
.implements Lne/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lne/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lne/a0$c$b;,
        Lne/a0$c$a;
    }
.end annotation


# instance fields
.field public final c:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    invoke-direct {p0, p1}, Lne/a0$b;-><init>(Ljava/util/concurrent/ExecutorService;)V

    invoke-static {p1}, Lhe/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p1, p0, Lne/a0$c;->c:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lne/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Lne/y<",
            "*>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lne/g0;->M(Ljava/lang/Runnable;Ljava/lang/Object;)Lne/g0;

    move-result-object p1

    iget-object v0, p0, Lne/a0$c;->c:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0, p1, p2, p3, p4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p2

    new-instance p3, Lne/a0$c$a;

    invoke-direct {p3, p1, p2}, Lne/a0$c$a;-><init>(Lne/x;Ljava/util/concurrent/ScheduledFuture;)V

    return-object p3
.end method

.method public c(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Lne/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TV;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Lne/y<",
            "TV;>;"
        }
    .end annotation

    invoke-static {p1}, Lne/g0;->N(Ljava/util/concurrent/Callable;)Lne/g0;

    move-result-object p1

    iget-object v0, p0, Lne/a0$c;->c:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0, p1, p2, p3, p4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p2

    new-instance p3, Lne/a0$c$a;

    invoke-direct {p3, p1, p2}, Lne/a0$c$a;-><init>(Lne/x;Ljava/util/concurrent/ScheduledFuture;)V

    return-object p3
.end method

.method public d(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lne/y;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "JJ",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Lne/y<",
            "*>;"
        }
    .end annotation

    new-instance v1, Lne/a0$c$b;

    invoke-direct {v1, p1}, Lne/a0$c$b;-><init>(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lne/a0$c;->c:Ljava/util/concurrent/ScheduledExecutorService;

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    new-instance p2, Lne/a0$c$a;

    invoke-direct {p2, v1, p1}, Lne/a0$c$a;-><init>(Lne/x;Ljava/util/concurrent/ScheduledFuture;)V

    return-object p2
.end method

.method public e(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lne/y;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "JJ",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Lne/y<",
            "*>;"
        }
    .end annotation

    new-instance v1, Lne/a0$c$b;

    invoke-direct {v1, p1}, Lne/a0$c$b;-><init>(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lne/a0$c;->c:Ljava/util/concurrent/ScheduledExecutorService;

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    new-instance p2, Lne/a0$c$a;

    invoke-direct {p2, v1, p1}, Lne/a0$c$a;-><init>(Lne/x;Ljava/util/concurrent/ScheduledFuture;)V

    return-object p2
.end method

.method public bridge synthetic schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lne/a0$c;->b(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lne/y;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic schedule(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3, p4}, Lne/a0$c;->c(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Lne/y;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    invoke-virtual/range {p0 .. p6}, Lne/a0$c;->d(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lne/y;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    invoke-virtual/range {p0 .. p6}, Lne/a0$c;->e(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lne/y;

    move-result-object p1

    return-object p1
.end method
