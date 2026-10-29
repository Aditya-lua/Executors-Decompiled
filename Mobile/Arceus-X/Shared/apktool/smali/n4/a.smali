.class public abstract Ln4/a;
.super Ln4/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln4/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Ljava/lang/Object;",
        ">",
        "Ln4/b<",
        "TD;>;"
    }
.end annotation


# instance fields
.field public i:Ljava/util/concurrent/Executor;

.field public volatile j:Ln4/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln4/a<",
            "TD;>.a;"
        }
    .end annotation
.end field

.field public volatile k:Ln4/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln4/a<",
            "TD;>.a;"
        }
    .end annotation
.end field

.field public l:J

.field public m:J

.field public n:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Ln4/b;-><init>(Landroid/content/Context;)V

    const-wide/16 v0, -0x2710

    iput-wide v0, p0, Ln4/a;->m:J

    return-void
.end method


# virtual methods
.method public A()V
    .locals 6

    iget-object v0, p0, Ln4/a;->k:Ln4/a$a;

    if-nez v0, :cond_3

    iget-object v0, p0, Ln4/a;->j:Ln4/a$a;

    if-eqz v0, :cond_3

    iget-object v0, p0, Ln4/a;->j:Ln4/a$a;

    iget-boolean v0, v0, Ln4/a$a;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ln4/a;->j:Ln4/a$a;

    const/4 v1, 0x0

    iput-boolean v1, v0, Ln4/a$a;->f:Z

    iget-object v0, p0, Ln4/a;->n:Landroid/os/Handler;

    iget-object v1, p0, Ln4/a;->j:Ln4/a$a;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    iget-wide v0, p0, Ln4/a;->l:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Ln4/a;->m:J

    iget-wide v4, p0, Ln4/a;->l:J

    add-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    iget-object v0, p0, Ln4/a;->j:Ln4/a$a;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ln4/a$a;->f:Z

    iget-object v0, p0, Ln4/a;->n:Landroid/os/Handler;

    iget-object v1, p0, Ln4/a;->j:Ln4/a$a;

    iget-wide v2, p0, Ln4/a;->m:J

    iget-wide v4, p0, Ln4/a;->l:J

    add-long/2addr v2, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;J)Z

    return-void

    :cond_1
    iget-object v0, p0, Ln4/a;->i:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Ln4/a;->B()Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Ln4/a;->i:Ljava/util/concurrent/Executor;

    :cond_2
    iget-object v0, p0, Ln4/a;->j:Ln4/a$a;

    iget-object v1, p0, Ln4/a;->i:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1}, Ln4/c;->c(Ljava/util/concurrent/Executor;)V

    :cond_3
    return-void
.end method

.method public B()Ljava/util/concurrent/Executor;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public abstract C()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TD;"
        }
    .end annotation
.end method

.method public D(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)V"
        }
    .end annotation

    return-void
.end method

.method public E()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TD;"
        }
    .end annotation

    invoke-virtual {p0}, Ln4/a;->C()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public g(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0, p1, p2, p3, p4}, Ln4/b;->g(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    iget-object p2, p0, Ln4/a;->j:Ln4/a$a;

    const-string p4, " waiting="

    if-eqz p2, :cond_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "mTask="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Ln4/a;->j:Ln4/a$a;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Ln4/a;->j:Ln4/a$a;

    iget-boolean p2, p2, Ln4/a$a;->f:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    :cond_0
    iget-object p2, p0, Ln4/a;->k:Ln4/a$a;

    if-eqz p2, :cond_1

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "mCancellingTask="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Ln4/a;->k:Ln4/a$a;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, Ln4/a;->k:Ln4/a$a;

    iget-boolean p2, p2, Ln4/a$a;->f:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    :cond_1
    iget-wide v0, p0, Ln4/a;->l:J

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-eqz p2, :cond_3

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "mUpdateThrottle="

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v0, p0, Ln4/a;->l:J

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Landroid/text/format/DateUtils;->formatElapsedTime(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, " mLastLoadCompleteTime="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-wide v0, p0, Ln4/a;->m:J

    const-wide/16 v2, -0x2710

    cmp-long p2, v0, v2

    if-nez p2, :cond_2

    const-string p1, "--"

    goto :goto_0

    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "-"

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Ln4/a;->m:J

    sub-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Landroid/text/format/DateUtils;->formatElapsedTime(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/io/PrintWriter;->println()V

    :cond_3
    return-void
.end method

.method public l()Z
    .locals 4

    iget-object v0, p0, Ln4/a;->j:Ln4/a$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Ln4/b;->j()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ln4/b;->m()V

    :cond_0
    iget-object v0, p0, Ln4/a;->k:Ln4/a$a;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ln4/a;->j:Ln4/a$a;

    iget-boolean v0, v0, Ln4/a$a;->f:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ln4/a;->j:Ln4/a$a;

    iput-boolean v1, v0, Ln4/a$a;->f:Z

    iget-object v0, p0, Ln4/a;->n:Landroid/os/Handler;

    iget-object v3, p0, Ln4/a;->j:Ln4/a$a;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    iput-object v2, p0, Ln4/a;->j:Ln4/a$a;

    return v1

    :cond_2
    iget-object v0, p0, Ln4/a;->j:Ln4/a$a;

    iget-boolean v0, v0, Ln4/a$a;->f:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Ln4/a;->j:Ln4/a$a;

    iput-boolean v1, v0, Ln4/a$a;->f:Z

    iget-object v0, p0, Ln4/a;->n:Landroid/os/Handler;

    iget-object v3, p0, Ln4/a;->j:Ln4/a$a;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iput-object v2, p0, Ln4/a;->j:Ln4/a$a;

    return v1

    :cond_3
    iget-object v0, p0, Ln4/a;->j:Ln4/a$a;

    invoke-virtual {v0, v1}, Ln4/c;->a(Z)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v1, p0, Ln4/a;->j:Ln4/a$a;

    iput-object v1, p0, Ln4/a;->k:Ln4/a$a;

    invoke-virtual {p0}, Ln4/a;->x()V

    :cond_4
    iput-object v2, p0, Ln4/a;->j:Ln4/a$a;

    return v0

    :cond_5
    return v1
.end method

.method public n()V
    .locals 1

    invoke-super {p0}, Ln4/b;->n()V

    invoke-virtual {p0}, Ln4/b;->b()Z

    new-instance v0, Ln4/a$a;

    invoke-direct {v0, p0}, Ln4/a$a;-><init>(Ln4/a;)V

    iput-object v0, p0, Ln4/a;->j:Ln4/a$a;

    invoke-virtual {p0}, Ln4/a;->A()V

    return-void
.end method

.method public x()V
    .locals 0

    return-void
.end method

.method public y(Ln4/a$a;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln4/a<",
            "TD;>.a;TD;)V"
        }
    .end annotation

    invoke-virtual {p0, p2}, Ln4/a;->D(Ljava/lang/Object;)V

    iget-object p2, p0, Ln4/a;->k:Ln4/a$a;

    if-ne p2, p1, :cond_0

    invoke-virtual {p0}, Ln4/b;->t()V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Ln4/a;->m:J

    const/4 p1, 0x0

    iput-object p1, p0, Ln4/a;->k:Ln4/a$a;

    invoke-virtual {p0}, Ln4/b;->e()V

    invoke-virtual {p0}, Ln4/a;->A()V

    :cond_0
    return-void
.end method

.method public z(Ln4/a$a;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln4/a<",
            "TD;>.a;TD;)V"
        }
    .end annotation

    iget-object v0, p0, Ln4/a;->j:Ln4/a$a;

    if-eq v0, p1, :cond_0

    invoke-virtual {p0, p1, p2}, Ln4/a;->y(Ln4/a$a;Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Ln4/b;->i()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0, p2}, Ln4/a;->D(Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Ln4/b;->c()V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ln4/a;->m:J

    const/4 p1, 0x0

    iput-object p1, p0, Ln4/a;->j:Ln4/a$a;

    invoke-virtual {p0, p2}, Ln4/b;->f(Ljava/lang/Object;)V

    return-void
.end method
