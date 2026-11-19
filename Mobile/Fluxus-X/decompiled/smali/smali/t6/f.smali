.class public final Lt6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0008\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0008H\u0096\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\nH\u0096\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0018\u0010!\u001a\u00060\u001dj\u0002`\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\u0015\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#R$\u0010%\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00148V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008$\u0010#\"\u0004\u0008\u001b\u0010\u0017R\u0014\u0010&\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010#\u00a8\u0006\'"
    }
    d2 = {
        "Lt6/f;",
        "Lt6/d;",
        "Lt6/i;",
        "strongMemoryCache",
        "Lt6/j;",
        "weakMemoryCache",
        "<init>",
        "(Lt6/i;Lt6/j;)V",
        "Lt6/d$b;",
        "key",
        "Lt6/d$c;",
        "a",
        "(Lt6/d$b;)Lt6/d$c;",
        "value",
        "",
        "g",
        "(Lt6/d$b;Lt6/d$c;)V",
        "",
        "e",
        "(Lt6/d$b;)Z",
        "",
        "size",
        "f",
        "(J)V",
        "clear",
        "()V",
        "Lt6/i;",
        "b",
        "Lt6/j;",
        "",
        "Lkotlinx/atomicfu/locks/SynchronizedObject;",
        "c",
        "Ljava/lang/Object;",
        "lock",
        "i",
        "()J",
        "d",
        "maxSize",
        "initialMaxSize",
        "coil-core_release"
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
.field public final a:Lt6/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lt6/j;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lt6/i;Lt6/j;)V
    .locals 0
    .param p1    # Lt6/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lt6/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/f;->a:Lt6/i;

    iput-object p2, p0, Lt6/f;->b:Lt6/j;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/f;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lt6/d$b;)Lt6/d$c;
    .locals 3
    .param p1    # Lt6/d$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lt6/f;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lt6/f;->a:Lt6/i;

    invoke-interface {v1, p1}, Lt6/i;->a(Lt6/d$b;)Lt6/d$c;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lt6/f;->b:Lt6/j;

    invoke-interface {v1, p1}, Lt6/j;->a(Lt6/d$b;)Lt6/d$c;

    move-result-object v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lt6/d$c;->b()Ll6/n;

    move-result-object v2

    invoke-interface {v2}, Ll6/n;->a()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p0, p1}, Lt6/f;->e(Lt6/d$b;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public b(J)V
    .locals 2

    iget-object v0, p0, Lt6/f;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lt6/f;->a:Lt6/i;

    invoke-interface {v1, p1, p2}, Lt6/i;->b(J)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public c()J
    .locals 3

    iget-object v0, p0, Lt6/f;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lt6/f;->a:Lt6/i;

    invoke-interface {v1}, Lt6/i;->c()J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public clear()V
    .locals 2

    iget-object v0, p0, Lt6/f;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lt6/f;->a:Lt6/i;

    invoke-interface {v1}, Lt6/i;->clear()V

    iget-object v1, p0, Lt6/f;->b:Lt6/j;

    invoke-interface {v1}, Lt6/j;->clear()V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public d()J
    .locals 3

    iget-object v0, p0, Lt6/f;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lt6/f;->a:Lt6/i;

    invoke-interface {v1}, Lt6/i;->d()J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public e(Lt6/d$b;)Z
    .locals 3
    .param p1    # Lt6/d$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    iget-object v0, p0, Lt6/f;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lt6/f;->a:Lt6/i;

    invoke-interface {v1, p1}, Lt6/i;->e(Lt6/d$b;)Z

    move-result v1

    iget-object v2, p0, Lt6/f;->b:Lt6/j;

    invoke-interface {v2, p1}, Lt6/j;->e(Lt6/d$b;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public f(J)V
    .locals 2

    iget-object v0, p0, Lt6/f;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lt6/f;->a:Lt6/i;

    invoke-interface {v1, p1, p2}, Lt6/i;->f(J)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public g(Lt6/d$b;Lt6/d$c;)V
    .locals 8
    .param p1    # Lt6/d$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lt6/d$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    iget-object v1, p0, Lt6/f;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p2}, Lt6/d$c;->b()Ll6/n;

    move-result-object v0

    invoke-interface {v0}, Ll6/n;->i()J

    move-result-wide v6

    const-wide/16 v2, 0x0

    cmp-long v0, v6, v2

    if-ltz v0, :cond_0

    iget-object v2, p0, Lt6/f;->a:Lt6/i;

    invoke-virtual {p2}, Lt6/d$c;->b()Ll6/n;

    move-result-object v4

    invoke-virtual {p2}, Lt6/d$c;->a()Ljava/util/Map;

    move-result-object v5

    move-object v3, p1

    invoke-interface/range {v2 .. v7}, Lt6/i;->g(Lt6/d$b;Ll6/n;Ljava/util/Map;J)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Image size must be non-negative: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit v1

    throw p1
.end method

.method public i()J
    .locals 3

    iget-object v0, p0, Lt6/f;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lt6/f;->a:Lt6/i;

    invoke-interface {v1}, Lt6/i;->i()J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
