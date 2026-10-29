.class public final Lfv/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lfv/h;

.field public b:Lfv/h;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public declared-synchronized a(Lfv/h;)V
    .locals 1

    monitor-enter p0

    if-eqz p1, :cond_2

    :try_start_0
    iget-object v0, p0, Lfv/i;->b:Lfv/h;

    if-eqz v0, :cond_0

    iput-object p1, v0, Lfv/h;->c:Lfv/h;

    iput-object p1, p0, Lfv/i;->b:Lfv/h;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lfv/i;->a:Lfv/h;

    if-nez v0, :cond_1

    iput-object p1, p0, Lfv/i;->b:Lfv/h;

    iput-object p1, p0, Lfv/i;->a:Lfv/h;

    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Head present, but no tail"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be enqueued"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized b()Lfv/h;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lfv/i;->a:Lfv/h;

    if-eqz v0, :cond_0

    iget-object v1, v0, Lfv/h;->c:Lfv/h;

    iput-object v1, p0, Lfv/i;->a:Lfv/h;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Lfv/i;->b:Lfv/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized c(I)Lfv/h;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lfv/i;->a:Lfv/h;

    if-nez v0, :cond_0

    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lfv/i;->b()Lfv/h;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
