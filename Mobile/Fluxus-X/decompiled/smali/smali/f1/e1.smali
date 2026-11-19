.class public final Lf1/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final b:Lf1/r0;

.field public final c:J

.field public final d:Lf1/u;

.field public final e:Z

.field public final f:Lp0/d;


# direct methods
.method public constructor <init>(Lf1/r0;JLf1/u;ZZ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lf1/e1;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {}, Lp0/d;->b()Lp0/d;

    move-result-object v1

    iput-object v1, p0, Lf1/e1;->f:Lp0/d;

    iput-object p1, p0, Lf1/e1;->b:Lf1/r0;

    iput-wide p2, p0, Lf1/e1;->c:J

    iput-object p4, p0, Lf1/e1;->d:Lf1/u;

    iput-boolean p5, p0, Lf1/e1;->e:Z

    if-eqz p6, :cond_0

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :cond_0
    const-string p1, "stop"

    invoke-virtual {v1, p1}, Lp0/d;->c(Ljava/lang/String;)V

    return-void
.end method

.method public static a(Lf1/w;J)Lf1/e1;
    .locals 8

    const-string v0, "The given PendingRecording cannot be null."

    invoke-static {p0, v0}, Lx2/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lf1/e1;

    invoke-virtual {p0}, Lf1/w;->e()Lf1/r0;

    move-result-object v2

    invoke-virtual {p0}, Lf1/w;->d()Lf1/u;

    move-result-object v5

    invoke-virtual {p0}, Lf1/w;->h()Z

    move-result v6

    const/4 v7, 0x1

    move-wide v3, p1

    invoke-direct/range {v1 .. v7}, Lf1/e1;-><init>(Lf1/r0;JLf1/u;ZZ)V

    return-object v1
.end method

.method public static b(Lf1/w;J)Lf1/e1;
    .locals 8

    const-string v0, "The given PendingRecording cannot be null."

    invoke-static {p0, v0}, Lx2/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lf1/e1;

    invoke-virtual {p0}, Lf1/w;->e()Lf1/r0;

    move-result-object v2

    invoke-virtual {p0}, Lf1/w;->d()Lf1/u;

    move-result-object v5

    invoke-virtual {p0}, Lf1/w;->h()Z

    move-result v6

    const/4 v7, 0x0

    move-wide v3, p1

    invoke-direct/range {v1 .. v7}, Lf1/e1;-><init>(Lf1/r0;JLf1/u;ZZ)V

    return-object v1
.end method


# virtual methods
.method public c()Lf1/u;
    .locals 1

    iget-object v0, p0, Lf1/e1;->d:Lf1/u;

    return-object v0
.end method

.method public close()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lf1/e1;->f(ILjava/lang/Throwable;)V

    return-void
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lf1/e1;->c:J

    return-wide v0
.end method

.method public e()V
    .locals 0

    invoke-virtual {p0}, Lf1/e1;->close()V

    return-void
.end method

.method public final f(ILjava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lf1/e1;->f:Lp0/d;

    invoke-virtual {v0}, Lp0/d;->a()V

    iget-object v0, p0, Lf1/e1;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lf1/e1;->b:Lf1/r0;

    invoke-virtual {v0, p0, p1, p2}, Lf1/r0;->x0(Lf1/e1;ILjava/lang/Throwable;)V

    return-void
.end method

.method public finalize()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lf1/e1;->f:Lp0/d;

    invoke-virtual {v0}, Lp0/d;->d()V

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Recording stopped due to being garbage collected."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    const/16 v1, 0xa

    invoke-virtual {p0, v1, v0}, Lf1/e1;->f(ILjava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void

    :catchall_0
    move-exception v0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    throw v0
.end method
