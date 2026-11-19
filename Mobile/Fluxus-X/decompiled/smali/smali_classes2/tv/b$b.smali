.class public final Ltv/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lew/j0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltv/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Ltv/b$b;",
        "Lew/j0;",
        "<init>",
        "(Ltv/b;)V",
        "Lew/m0;",
        "t",
        "()Lew/m0;",
        "Lew/e;",
        "source",
        "",
        "byteCount",
        "",
        "R2",
        "(Lew/e;J)V",
        "flush",
        "()V",
        "close",
        "Lew/o;",
        "a",
        "Lew/o;",
        "timeout",
        "",
        "b",
        "Z",
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
.field public final a:Lew/o;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Z

.field public final synthetic c:Ltv/b;


# direct methods
.method public constructor <init>(Ltv/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ltv/b$b;->c:Ltv/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lew/o;

    invoke-virtual {p1}, Ltv/b;->s()Lrv/a;

    move-result-object p1

    invoke-interface {p1}, Lrv/a;->b()Lew/f;

    move-result-object p1

    invoke-interface {p1}, Lew/j0;->t()Lew/m0;

    move-result-object p1

    invoke-direct {v0, p1}, Lew/o;-><init>(Lew/m0;)V

    iput-object v0, p0, Ltv/b$b;->a:Lew/o;

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

    iget-boolean v0, p0, Ltv/b$b;->b:Z

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ltv/b$b;->c:Ltv/b;

    invoke-virtual {v0}, Ltv/b;->s()Lrv/a;

    move-result-object v0

    invoke-interface {v0}, Lrv/a;->b()Lew/f;

    move-result-object v0

    invoke-interface {v0, p2, p3}, Lew/f;->H2(J)Lew/f;

    const-string v1, "\r\n"

    invoke-interface {v0, v1}, Lew/f;->D0(Ljava/lang/String;)Lew/f;

    invoke-interface {v0, p1, p2, p3}, Lew/j0;->R2(Lew/e;J)V

    invoke-interface {v0, v1}, Lew/f;->D0(Ljava/lang/String;)Lew/f;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public declared-synchronized close()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Ltv/b$b;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Ltv/b$b;->b:Z

    iget-object v0, p0, Ltv/b$b;->c:Ltv/b;

    invoke-virtual {v0}, Ltv/b;->s()Lrv/a;

    move-result-object v0

    invoke-interface {v0}, Lrv/a;->b()Lew/f;

    move-result-object v0

    const-string v1, "0\r\n\r\n"

    invoke-interface {v0, v1}, Lew/f;->D0(Ljava/lang/String;)Lew/f;

    iget-object v0, p0, Ltv/b$b;->c:Ltv/b;

    iget-object v1, p0, Ltv/b$b;->a:Lew/o;

    invoke-static {v0, v1}, Ltv/b;->k(Ltv/b;Lew/o;)V

    iget-object v0, p0, Ltv/b$b;->c:Ltv/b;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Ltv/b;->p(Ltv/b;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public declared-synchronized flush()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Ltv/b$b;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Ltv/b$b;->c:Ltv/b;

    invoke-virtual {v0}, Ltv/b;->s()Lrv/a;

    move-result-object v0

    invoke-interface {v0}, Lrv/a;->b()Lew/f;

    move-result-object v0

    invoke-interface {v0}, Lew/f;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public t()Lew/m0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Ltv/b$b;->a:Lew/o;

    return-object v0
.end method
