.class public final Luv/v$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lew/j0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luv/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR$\u0010#\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"R\"\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008$\u0010\u0016\u001a\u0004\u0008\u001a\u0010\u0018\"\u0004\u0008%\u0010\u0015\u00a8\u0006\'"
    }
    d2 = {
        "Luv/v$b;",
        "Lew/j0;",
        "",
        "finished",
        "<init>",
        "(Luv/v;Z)V",
        "Lew/e;",
        "source",
        "",
        "byteCount",
        "",
        "R2",
        "(Lew/e;J)V",
        "flush",
        "()V",
        "Lew/m0;",
        "t",
        "()Lew/m0;",
        "close",
        "outFinishedOnLastFrame",
        "a",
        "(Z)V",
        "Z",
        "c",
        "()Z",
        "setFinished",
        "b",
        "Lew/e;",
        "sendBuffer",
        "Lmv/y;",
        "Lmv/y;",
        "getTrailers",
        "()Lmv/y;",
        "setTrailers",
        "(Lmv/y;)V",
        "trailers",
        "d",
        "setClosed",
        "closed",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public a:Z

.field public final b:Lew/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:Lmv/y;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public d:Z

.field public final synthetic e:Luv/v;


# direct methods
.method public constructor <init>(Luv/v;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    iput-object p1, p0, Luv/v$b;->e:Luv/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Luv/v$b;->a:Z

    new-instance p1, Lew/e;

    invoke-direct {p1}, Lew/e;-><init>()V

    iput-object p1, p0, Luv/v$b;->b:Lew/e;

    return-void
.end method


# virtual methods
.method public R2(Lew/e;J)V
    .locals 2
    .param p1    # Lew/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Luv/v$b;->e:Luv/v;

    sget-boolean v1, Lnv/q;->b:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Thread "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " MUST NOT hold lock on "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Luv/v$b;->b:Lew/e;

    invoke-virtual {v0, p1, p2, p3}, Lew/e;->R2(Lew/e;J)V

    :goto_1
    iget-object p1, p0, Luv/v$b;->b:Lew/e;

    invoke-virtual {p1}, Lew/e;->size()J

    move-result-wide p1

    const-wide/16 v0, 0x4000

    cmp-long p1, p1, v0

    if-ltz p1, :cond_2

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Luv/v$b;->a(Z)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final a(Z)V
    .locals 12

    iget-object v1, p0, Luv/v$b;->e:Luv/v;

    monitor-enter v1

    :try_start_0
    invoke-virtual {v1}, Luv/v;->u()Luv/v$d;

    move-result-object v0

    invoke-virtual {v0}, Lew/c;->s()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    :try_start_1
    invoke-virtual {v1}, Luv/v;->t()J

    move-result-wide v2

    invoke-virtual {v1}, Luv/v;->s()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-ltz v0, :cond_0

    iget-boolean v0, p0, Luv/v$b;->a:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Luv/v$b;->d:Z

    if-nez v0, :cond_0

    invoke-virtual {v1}, Luv/v;->l()Luv/b;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Luv/v;->E()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_0
    :try_start_2
    invoke-virtual {v1}, Luv/v;->u()Luv/v$d;

    move-result-object v0

    invoke-virtual {v0}, Luv/v$d;->A()V

    invoke-virtual {v1}, Luv/v;->f()V

    invoke-virtual {v1}, Luv/v;->s()J

    move-result-wide v2

    invoke-virtual {v1}, Luv/v;->t()J

    move-result-wide v4

    sub-long/2addr v2, v4

    iget-object v0, p0, Luv/v$b;->b:Lew/e;

    invoke-virtual {v0}, Lew/e;->size()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v10

    invoke-virtual {v1}, Luv/v;->t()J

    move-result-wide v2

    add-long/2addr v2, v10

    invoke-virtual {v1, v2, v3}, Luv/v;->C(J)V

    if-eqz p1, :cond_1

    iget-object p1, p0, Luv/v$b;->b:Lew/e;

    invoke-virtual {p1}, Lew/e;->size()J

    move-result-wide v2

    cmp-long p1, v10, v2

    if-nez p1, :cond_1

    const/4 p1, 0x1

    :goto_1
    move v8, p1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v0

    goto :goto_4

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v1

    iget-object p1, p0, Luv/v$b;->e:Luv/v;

    invoke-virtual {p1}, Luv/v;->u()Luv/v$d;

    move-result-object p1

    invoke-virtual {p1}, Lew/c;->s()V

    :try_start_3
    iget-object p1, p0, Luv/v$b;->e:Luv/v;

    invoke-virtual {p1}, Luv/v;->k()Luv/o;

    move-result-object v6

    iget-object p1, p0, Luv/v$b;->e:Luv/v;

    invoke-virtual {p1}, Luv/v;->n()I

    move-result v7

    iget-object v9, p0, Luv/v$b;->b:Lew/e;

    invoke-virtual/range {v6 .. v11}, Luv/o;->X0(IZLew/e;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    iget-object p1, p0, Luv/v$b;->e:Luv/v;

    invoke-virtual {p1}, Luv/v;->u()Luv/v$d;

    move-result-object p1

    invoke-virtual {p1}, Luv/v$d;->A()V

    return-void

    :catchall_2
    move-exception v0

    move-object p1, v0

    iget-object v0, p0, Luv/v$b;->e:Luv/v;

    invoke-virtual {v0}, Luv/v;->u()Luv/v$d;

    move-result-object v0

    invoke-virtual {v0}, Luv/v$d;->A()V

    throw p1

    :goto_3
    :try_start_4
    invoke-virtual {v1}, Luv/v;->u()Luv/v$d;

    move-result-object v0

    invoke-virtual {v0}, Luv/v$d;->A()V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_4
    monitor-exit v1

    throw p1
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Luv/v$b;->d:Z

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Luv/v$b;->a:Z

    return v0
.end method

.method public close()V
    .locals 10

    iget-object v0, p0, Luv/v$b;->e:Luv/v;

    sget-boolean v1, Lnv/q;->b:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Thread "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " MUST NOT hold lock on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :cond_1
    :goto_0
    iget-object v1, p0, Luv/v$b;->e:Luv/v;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Luv/v$b;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v0, :cond_2

    monitor-exit v1

    return-void

    :cond_2
    :try_start_1
    invoke-virtual {v1}, Luv/v;->l()Luv/b;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_3

    move v0, v3

    goto :goto_1

    :cond_3
    move v0, v2

    :goto_1
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v1

    iget-object v1, p0, Luv/v$b;->e:Luv/v;

    invoke-virtual {v1}, Luv/v;->q()Luv/v$b;

    move-result-object v1

    iget-boolean v1, v1, Luv/v$b;->a:Z

    if-nez v1, :cond_8

    iget-object v1, p0, Luv/v$b;->b:Lew/e;

    invoke-virtual {v1}, Lew/e;->size()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v1, v4, v6

    if-lez v1, :cond_4

    move v1, v3

    goto :goto_2

    :cond_4
    move v1, v2

    :goto_2
    iget-object v4, p0, Luv/v$b;->c:Lmv/y;

    if-eqz v4, :cond_6

    :goto_3
    iget-object v1, p0, Luv/v$b;->b:Lew/e;

    invoke-virtual {v1}, Lew/e;->size()J

    move-result-wide v4

    cmp-long v1, v4, v6

    if-lez v1, :cond_5

    invoke-virtual {p0, v2}, Luv/v$b;->a(Z)V

    goto :goto_3

    :cond_5
    iget-object v1, p0, Luv/v$b;->e:Luv/v;

    invoke-virtual {v1}, Luv/v;->k()Luv/o;

    move-result-object v1

    iget-object v2, p0, Luv/v$b;->e:Luv/v;

    invoke-virtual {v2}, Luv/v;->n()I

    move-result v2

    iget-object v4, p0, Luv/v$b;->c:Lmv/y;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v4}, Lnv/q;->r(Lmv/y;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1, v2, v0, v4}, Luv/o;->Y0(IZLjava/util/List;)V

    goto :goto_5

    :cond_6
    if-eqz v1, :cond_7

    :goto_4
    iget-object v0, p0, Luv/v$b;->b:Lew/e;

    invoke-virtual {v0}, Lew/e;->size()J

    move-result-wide v0

    cmp-long v0, v0, v6

    if-lez v0, :cond_8

    invoke-virtual {p0, v3}, Luv/v$b;->a(Z)V

    goto :goto_4

    :cond_7
    if-eqz v0, :cond_8

    iget-object v0, p0, Luv/v$b;->e:Luv/v;

    invoke-virtual {v0}, Luv/v;->k()Luv/o;

    move-result-object v4

    iget-object v0, p0, Luv/v$b;->e:Luv/v;

    invoke-virtual {v0}, Luv/v;->n()I

    move-result v5

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v6, 0x1

    invoke-virtual/range {v4 .. v9}, Luv/o;->X0(IZLew/e;J)V

    :cond_8
    :goto_5
    iget-object v1, p0, Luv/v$b;->e:Luv/v;

    monitor-enter v1

    :try_start_2
    iput-boolean v3, p0, Luv/v$b;->d:Z

    const-string v0, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v1

    iget-object v0, p0, Luv/v$b;->e:Luv/v;

    invoke-virtual {v0}, Luv/v;->k()Luv/o;

    move-result-object v0

    invoke-virtual {v0}, Luv/o;->flush()V

    iget-object v0, p0, Luv/v$b;->e:Luv/v;

    invoke-virtual {v0}, Luv/v;->e()V

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :catchall_1
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public flush()V
    .locals 4

    iget-object v0, p0, Luv/v$b;->e:Luv/v;

    sget-boolean v1, Lnv/q;->b:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Thread "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " MUST NOT hold lock on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :cond_1
    :goto_0
    iget-object v0, p0, Luv/v$b;->e:Luv/v;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0}, Luv/v;->f()V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    :goto_1
    iget-object v0, p0, Luv/v$b;->b:Lew/e;

    invoke-virtual {v0}, Lew/e;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Luv/v$b;->a(Z)V

    iget-object v0, p0, Luv/v$b;->e:Luv/v;

    invoke-virtual {v0}, Luv/v;->k()Luv/o;

    move-result-object v0

    invoke-virtual {v0}, Luv/o;->flush()V

    goto :goto_1

    :cond_2
    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public t()Lew/m0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Luv/v$b;->e:Luv/v;

    invoke-virtual {v0}, Luv/v;->u()Luv/v$d;

    move-result-object v0

    return-object v0
.end method
