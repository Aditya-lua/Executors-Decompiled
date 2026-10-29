.class public final Lnb/a7;
.super Ljava/util/concurrent/FutureTask;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final a:J

.field public final b:Z

.field public final c:Ljava/lang/String;

.field public final synthetic d:Lnb/c7;


# direct methods
.method public constructor <init>(Lnb/c7;Ljava/lang/Runnable;ZLjava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/a7;->d:Lnb/c7;

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p2, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    .line 3
    invoke-static {p4}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lnb/c7;->E()Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object p2

    .line 4
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    iput-wide v0, p0, Lnb/a7;->a:J

    iput-object p4, p0, Lnb/a7;->c:Ljava/lang/String;

    iput-boolean p3, p0, Lnb/a7;->b:Z

    const-wide p2, 0x7fffffffffffffffL

    cmp-long p2, v0, p2

    if-nez p2, :cond_0

    iget-object p1, p1, Lnb/j8;->a:Lnb/g7;

    .line 5
    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    const-string p2, "Tasks index overflow"

    invoke-virtual {p1, p2}, Lnb/u5;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public constructor <init>(Lnb/c7;Ljava/util/concurrent/Callable;ZLjava/lang/String;)V
    .locals 2

    .line 7
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/a7;->d:Lnb/c7;

    .line 8
    invoke-direct {p0, p2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 9
    const-string p2, "Task exception on worker thread"

    invoke-static {p2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lnb/c7;->E()Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object p4

    .line 10
    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    iput-wide v0, p0, Lnb/a7;->a:J

    iput-object p2, p0, Lnb/a7;->c:Ljava/lang/String;

    iput-boolean p3, p0, Lnb/a7;->b:Z

    const-wide p2, 0x7fffffffffffffffL

    cmp-long p2, v0, p2

    if-nez p2, :cond_0

    iget-object p1, p1, Lnb/j8;->a:Lnb/g7;

    .line 11
    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    .line 12
    invoke-virtual {p1}, Lnb/w5;->o()Lnb/u5;

    move-result-object p1

    const-string p2, "Tasks index overflow"

    invoke-virtual {p1, p2}, Lnb/u5;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lnb/a7;

    iget-boolean v0, p1, Lnb/a7;->b:Z

    iget-boolean v1, p0, Lnb/a7;->b:Z

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-eq v1, v0, :cond_1

    if-nez v1, :cond_0

    return v3

    :cond_0
    return v2

    :cond_1
    iget-wide v0, p0, Lnb/a7;->a:J

    iget-wide v4, p1, Lnb/a7;->a:J

    cmp-long p1, v0, v4

    if-gez p1, :cond_2

    return v2

    :cond_2
    if-lez p1, :cond_3

    return v3

    :cond_3
    iget-object p1, p0, Lnb/a7;->d:Lnb/c7;

    iget-object p1, p1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->p()Lnb/u5;

    move-result-object p1

    const-string v2, "Two tasks share the same index. index"

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final setException(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lnb/a7;->d:Lnb/c7;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    iget-object v1, p0, Lnb/a7;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-super {p0, p1}, Ljava/util/concurrent/FutureTask;->setException(Ljava/lang/Throwable;)V

    return-void
.end method
