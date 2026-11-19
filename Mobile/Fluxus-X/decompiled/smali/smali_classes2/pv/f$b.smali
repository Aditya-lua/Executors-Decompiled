.class public final Lpv/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpv/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0018\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0008\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\tJ\r\u0010\u0010\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\tR\u001e\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lpv/f$b;",
        "",
        "Lpv/f$c;",
        "Lpv/f;",
        "entry",
        "<init>",
        "(Lpv/f;Lpv/f$c;)V",
        "",
        "d",
        "()V",
        "",
        "index",
        "Lew/j0;",
        "g",
        "(I)Lew/j0;",
        "c",
        "b",
        "a",
        "Lpv/f$c;",
        "e",
        "()Lpv/f$c;",
        "",
        "[Z",
        "f",
        "()[Z",
        "written",
        "",
        "Z",
        "done",
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
.field public final a:Lpv/f$c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:[Z
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public c:Z

.field public final synthetic d:Lpv/f;


# direct methods
.method public constructor <init>(Lpv/f;Lpv/f$c;)V
    .locals 1
    .param p1    # Lpv/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpv/f$c;",
            ")V"
        }
    .end annotation

    const-string v0, "entry"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpv/f$b;->d:Lpv/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lpv/f$b;->a:Lpv/f$c;

    invoke-virtual {p2}, Lpv/f$c;->g()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lpv/f;->z()I

    move-result p1

    new-array p1, p1, [Z

    :goto_0
    iput-object p1, p0, Lpv/f$b;->b:[Z

    return-void
.end method

.method public static synthetic a(Lpv/f;Lpv/f$b;Ljava/io/IOException;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lpv/f$b;->h(Lpv/f;Lpv/f$b;Ljava/io/IOException;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lpv/f;Lpv/f$b;Ljava/io/IOException;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Lpv/f$b;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final b()V
    .locals 3

    iget-object v0, p0, Lpv/f$b;->d:Lpv/f;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lpv/f$b;->c:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lpv/f$b;->a:Lpv/f$c;

    invoke-virtual {v1}, Lpv/f$c;->b()Lpv/f$b;

    move-result-object v1

    invoke-static {v1, p0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lpv/f;->n(Lpv/f$b;Z)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lpv/f$b;->c:Z

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :cond_1
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Check failed."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Lpv/f$b;->d:Lpv/f;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lpv/f$b;->c:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lpv/f$b;->a:Lpv/f$c;

    invoke-virtual {v1}, Lpv/f$c;->b()Lpv/f$b;

    move-result-object v1

    invoke-static {v1, p0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p0, v2}, Lpv/f;->n(Lpv/f$b;Z)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iput-boolean v2, p0, Lpv/f$b;->c:Z

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :cond_1
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Check failed."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lpv/f$b;->a:Lpv/f$c;

    invoke-virtual {v0}, Lpv/f$c;->b()Lpv/f$b;

    move-result-object v0

    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lpv/f$b;->d:Lpv/f;

    invoke-static {v0}, Lpv/f;->b(Lpv/f;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpv/f$b;->d:Lpv/f;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lpv/f;->n(Lpv/f$b;Z)V

    return-void

    :cond_0
    iget-object v0, p0, Lpv/f$b;->a:Lpv/f$c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lpv/f$c;->q(Z)V

    :cond_1
    return-void
.end method

.method public final e()Lpv/f$c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lpv/f$b;->a:Lpv/f$c;

    return-object v0
.end method

.method public final f()[Z
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lpv/f$b;->b:[Z

    return-object v0
.end method

.method public final g(I)Lew/j0;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lpv/f$b;->d:Lpv/f;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lpv/f$b;->c:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Lpv/f$b;->a:Lpv/f$c;

    invoke-virtual {v1}, Lpv/f$c;->b()Lpv/f$b;

    move-result-object v1

    invoke-static {v1, p0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lew/v;->a()Lew/j0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v1, p0, Lpv/f$b;->a:Lpv/f$c;

    invoke-virtual {v1}, Lpv/f$c;->g()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lpv/f$b;->b:[Z

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v2, 0x1

    aput-boolean v2, v1, p1

    :cond_1
    iget-object v1, p0, Lpv/f$b;->a:Lpv/f$c;

    invoke-virtual {v1}, Lpv/f$c;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lew/b0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v0}, Lpv/f;->y()Lew/k;

    move-result-object v1

    invoke-virtual {v1, p1}, Lew/k;->s(Lew/b0;)Lew/j0;

    move-result-object p1
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    new-instance v1, Lpv/h;

    new-instance v2, Lpv/g;

    invoke-direct {v2, v0, p0}, Lpv/g;-><init>(Lpv/f;Lpv/f$b;)V

    invoke-direct {v1, p1, v2}, Lpv/h;-><init>(Lew/j0;Lkotlin/jvm/functions/Function1;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v0

    return-object v1

    :catch_0
    :try_start_4
    invoke-static {}, Lew/v;->a()Lew/j0;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v0

    return-object p1

    :cond_2
    :try_start_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_0
    monitor-exit v0

    throw p1
.end method
