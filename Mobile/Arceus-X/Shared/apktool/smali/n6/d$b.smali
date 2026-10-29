.class public final Ln6/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln6/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010\u0018\n\u0002\u0008\u0005\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0013\u0010\u0011\u001a\u0008\u0018\u00010\u0010R\u00020\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0013\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001bR\u0017\u0010!\u001a\u00020\u001d8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Ln6/d$b;",
        "",
        "Ln6/d$c;",
        "Ln6/d;",
        "entry",
        "<init>",
        "(Ln6/d;Ln6/d$c;)V",
        "",
        "index",
        "Lxu/h0;",
        "f",
        "(I)Lxu/h0;",
        "",
        "e",
        "()V",
        "b",
        "Ln6/d$d;",
        "c",
        "()Ln6/d$d;",
        "a",
        "",
        "success",
        "d",
        "(Z)V",
        "Ln6/d$c;",
        "g",
        "()Ln6/d$c;",
        "Z",
        "closed",
        "",
        "[Z",
        "h",
        "()[Z",
        "written",
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
.field public final a:Ln6/d$c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Z

.field public final c:[Z
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final synthetic d:Ln6/d;


# direct methods
.method public constructor <init>(Ln6/d;Ln6/d$c;)V
    .locals 0
    .param p1    # Ln6/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln6/d$c;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Ln6/d$b;->d:Ln6/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ln6/d$b;->a:Ln6/d$c;

    invoke-static {p1}, Ln6/d;->h(Ln6/d;)I

    move-result p1

    new-array p1, p1, [Z

    iput-object p1, p0, Ln6/d$b;->c:[Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ln6/d$b;->d(Z)V

    return-void
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ln6/d$b;->d(Z)V

    return-void
.end method

.method public final c()Ln6/d$d;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Ln6/d$b;->d:Ln6/d;

    invoke-static {v0}, Ln6/d;->g(Ln6/d;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Ln6/d$b;->d:Ln6/d;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Ln6/d$b;->b()V

    iget-object v2, p0, Ln6/d$b;->a:Ln6/d$c;

    invoke-virtual {v2}, Ln6/d$c;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln6/d;->y(Ljava/lang/String;)Ln6/d$d;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final d(Z)V
    .locals 3

    iget-object v0, p0, Ln6/d$b;->d:Ln6/d;

    invoke-static {v0}, Ln6/d;->g(Ln6/d;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Ln6/d$b;->d:Ln6/d;

    monitor-enter v0

    :try_start_0
    iget-boolean v2, p0, Ln6/d$b;->b:Z

    if-nez v2, :cond_1

    iget-object v2, p0, Ln6/d$b;->a:Ln6/d$c;

    invoke-virtual {v2}, Ln6/d$c;->b()Ln6/d$b;

    move-result-object v2

    invoke-static {v2, p0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v1, p0, p1}, Ln6/d;->b(Ln6/d;Ln6/d$b;Z)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Ln6/d$b;->b:Z

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :cond_1
    :try_start_1
    const-string p1, "editor is closed"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Ln6/d$b;->a:Ln6/d$c;

    invoke-virtual {v0}, Ln6/d$c;->b()Ln6/d$b;

    move-result-object v0

    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ln6/d$b;->a:Ln6/d$c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ln6/d$c;->m(Z)V

    :cond_0
    return-void
.end method

.method public final f(I)Lxu/h0;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Ln6/d$b;->d:Ln6/d;

    invoke-static {v0}, Ln6/d;->g(Ln6/d;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Ln6/d$b;->d:Ln6/d;

    monitor-enter v0

    :try_start_0
    iget-boolean v2, p0, Ln6/d$b;->b:Z

    if-nez v2, :cond_0

    iget-object v2, p0, Ln6/d$b;->c:[Z

    const/4 v3, 0x1

    aput-boolean v3, v2, p1

    iget-object v2, p0, Ln6/d$b;->a:Ln6/d$c;

    invoke-virtual {v2}, Ln6/d$c;->c()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1}, Ln6/d;->e(Ln6/d;)Ln6/d$e;

    move-result-object v1

    move-object v2, p1

    check-cast v2, Lxu/h0;

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v5, v3, v4}, Le7/l;->b(Lxu/l;Lxu/h0;ZILjava/lang/Object;)V

    check-cast p1, Lxu/h0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    const-string p1, "editor is closed"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit v0

    throw p1
.end method

.method public final g()Ln6/d$c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Ln6/d$b;->a:Ln6/d$c;

    return-object v0
.end method

.method public final h()[Z
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Ln6/d$b;->c:[Z

    return-object v0
.end method
