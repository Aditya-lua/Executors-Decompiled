.class public final Lsw/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsw/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsw/q$b;,
        Lsw/q$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lsw/d<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lsw/w;

.field public final b:Ljava/lang/Object;

.field public final c:[Ljava/lang/Object;

.field public final d:Lmv/e$a;

.field public final e:Lsw/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsw/h<",
            "Lmv/i0;",
            "TT;>;"
        }
    .end annotation
.end field

.field public volatile f:Z

.field public g:Lmv/e;

.field public h:Ljava/lang/Throwable;

.field public i:Z


# direct methods
.method public constructor <init>(Lsw/w;Ljava/lang/Object;[Ljava/lang/Object;Lmv/e$a;Lsw/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw/w;",
            "Ljava/lang/Object;",
            "[",
            "Ljava/lang/Object;",
            "Lmv/e$a;",
            "Lsw/h<",
            "Lmv/i0;",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsw/q;->a:Lsw/w;

    iput-object p2, p0, Lsw/q;->b:Ljava/lang/Object;

    iput-object p3, p0, Lsw/q;->c:[Ljava/lang/Object;

    iput-object p4, p0, Lsw/q;->d:Lmv/e$a;

    iput-object p5, p0, Lsw/q;->e:Lsw/h;

    return-void
.end method


# virtual methods
.method public L(Lsw/f;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsw/f<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "callback == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lsw/q;->i:Z

    if-nez v0, :cond_3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lsw/q;->i:Z

    iget-object v0, p0, Lsw/q;->g:Lmv/e;

    iget-object v1, p0, Lsw/q;->h:Ljava/lang/Throwable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v0, :cond_0

    if-nez v1, :cond_0

    :try_start_1
    invoke-virtual {p0}, Lsw/q;->b()Lmv/e;

    move-result-object v2

    iput-object v2, p0, Lsw/q;->g:Lmv/e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v0, v2

    goto :goto_0

    :catchall_0
    move-exception v1

    :try_start_2
    invoke-static {v1}, Lsw/c0;->t(Ljava/lang/Throwable;)V

    iput-object v1, p0, Lsw/q;->h:Ljava/lang/Throwable;

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v1, :cond_1

    invoke-interface {p1, p0, v1}, Lsw/f;->a(Lsw/d;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    iget-boolean v1, p0, Lsw/q;->f:Z

    if-eqz v1, :cond_2

    invoke-interface {v0}, Lmv/e;->cancel()V

    :cond_2
    new-instance v1, Lsw/q$a;

    invoke-direct {v1, p0, p1}, Lsw/q$a;-><init>(Lsw/q;Lsw/f;)V

    invoke-interface {v0, v1}, Lmv/e;->b0(Lmv/f;)V

    return-void

    :cond_3
    :try_start_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already executed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_1
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method public a()Lsw/q;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lsw/q<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lsw/q;

    iget-object v1, p0, Lsw/q;->a:Lsw/w;

    iget-object v2, p0, Lsw/q;->b:Ljava/lang/Object;

    iget-object v3, p0, Lsw/q;->c:[Ljava/lang/Object;

    iget-object v4, p0, Lsw/q;->d:Lmv/e$a;

    iget-object v5, p0, Lsw/q;->e:Lsw/h;

    invoke-direct/range {v0 .. v5}, Lsw/q;-><init>(Lsw/w;Ljava/lang/Object;[Ljava/lang/Object;Lmv/e$a;Lsw/h;)V

    return-object v0
.end method

.method public final b()Lmv/e;
    .locals 4

    iget-object v0, p0, Lsw/q;->d:Lmv/e$a;

    iget-object v1, p0, Lsw/q;->a:Lsw/w;

    iget-object v2, p0, Lsw/q;->b:Ljava/lang/Object;

    iget-object v3, p0, Lsw/q;->c:[Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lsw/w;->a(Ljava/lang/Object;[Ljava/lang/Object;)Lmv/f0;

    move-result-object v1

    invoke-interface {v0, v1}, Lmv/e$a;->a(Lmv/f0;)Lmv/e;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Call.Factory returned null."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c()Lmv/e;
    .locals 2

    iget-object v0, p0, Lsw/q;->g:Lmv/e;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lsw/q;->h:Ljava/lang/Throwable;

    if-eqz v0, :cond_3

    instance-of v1, v0, Ljava/io/IOException;

    if-nez v1, :cond_2

    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-eqz v1, :cond_1

    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    :cond_1
    check-cast v0, Ljava/lang/Error;

    throw v0

    :cond_2
    check-cast v0, Ljava/io/IOException;

    throw v0

    :cond_3
    :try_start_0
    invoke-virtual {p0}, Lsw/q;->b()Lmv/e;

    move-result-object v0

    iput-object v0, p0, Lsw/q;->g:Lmv/e;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    :goto_0
    invoke-static {v0}, Lsw/c0;->t(Ljava/lang/Throwable;)V

    iput-object v0, p0, Lsw/q;->h:Ljava/lang/Throwable;

    throw v0
.end method

.method public cancel()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lsw/q;->f:Z

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lsw/q;->g:Lmv/e;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lmv/e;->cancel()V

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsw/q;->a()Lsw/q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lsw/d;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lsw/q;->a()Lsw/q;

    move-result-object v0

    return-object v0
.end method

.method public e(Lmv/h0;)Lsw/x;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmv/h0;",
            ")",
            "Lsw/x<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p1}, Lmv/h0;->b()Lmv/i0;

    move-result-object v0

    invoke-virtual {p1}, Lmv/h0;->s()Lmv/h0$a;

    move-result-object p1

    new-instance v1, Lsw/q$c;

    invoke-virtual {v0}, Lmv/i0;->f()Lmv/b0;

    move-result-object v2

    invoke-virtual {v0}, Lmv/i0;->e()J

    move-result-wide v3

    invoke-direct {v1, v2, v3, v4}, Lsw/q$c;-><init>(Lmv/b0;J)V

    invoke-virtual {p1, v1}, Lmv/h0$a;->b(Lmv/i0;)Lmv/h0$a;

    move-result-object p1

    invoke-virtual {p1}, Lmv/h0$a;->c()Lmv/h0;

    move-result-object p1

    invoke-virtual {p1}, Lmv/h0;->f()I

    move-result v1

    const/16 v2, 0xc8

    if-lt v1, v2, :cond_3

    const/16 v2, 0x12c

    if-lt v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/16 v2, 0xcc

    if-eq v1, v2, :cond_2

    const/16 v2, 0xcd

    if-ne v1, v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Lsw/q$b;

    invoke-direct {v1, v0}, Lsw/q$b;-><init>(Lmv/i0;)V

    :try_start_0
    iget-object v0, p0, Lsw/q;->e:Lsw/h;

    invoke-interface {v0, v1}, Lsw/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Lsw/x;->j(Ljava/lang/Object;Lmv/h0;)Lsw/x;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {v1}, Lsw/q$b;->k()V

    throw p1

    :cond_2
    :goto_0
    invoke-virtual {v0}, Lmv/i0;->close()V

    const/4 v0, 0x0

    invoke-static {v0, p1}, Lsw/x;->j(Ljava/lang/Object;Lmv/h0;)Lsw/x;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_1
    :try_start_1
    invoke-static {v0}, Lsw/c0;->a(Lmv/i0;)Lmv/i0;

    move-result-object v1

    invoke-static {v1, p1}, Lsw/x;->d(Lmv/i0;Lmv/h0;)Lsw/x;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v0}, Lmv/i0;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Lmv/i0;->close()V

    throw p1
.end method

.method public declared-synchronized h()Lmv/f0;
    .locals 3

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lsw/q;->c()Lmv/e;

    move-result-object v0

    invoke-interface {v0}, Lmv/e;->h()Lmv/f0;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unable to create request."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public j()Lsw/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lsw/x<",
            "TT;>;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lsw/q;->i:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lsw/q;->i:Z

    invoke-virtual {p0}, Lsw/q;->c()Lmv/e;

    move-result-object v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v1, p0, Lsw/q;->f:Z

    if-eqz v1, :cond_0

    invoke-interface {v0}, Lmv/e;->cancel()V

    :cond_0
    invoke-interface {v0}, Lmv/e;->j()Lmv/h0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lsw/q;->e(Lmv/h0;)Lsw/x;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already executed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public m()Z
    .locals 2

    iget-boolean v0, p0, Lsw/q;->f:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lsw/q;->g:Lmv/e;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lmv/e;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_0
    monitor-exit p0

    return v1

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
