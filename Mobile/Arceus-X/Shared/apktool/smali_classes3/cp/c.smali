.class public final Lcp/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\t\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a#\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0015\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0015\u0010\r\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000c\u001a\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u0004\"\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroid/content/Context;",
        "context",
        "Lcp/b;",
        "c",
        "(Landroid/content/Context;)Lcp/b;",
        "",
        "Ljava/io/File;",
        "directoriesToDeleteOnError",
        "",
        "d",
        "(Landroid/content/Context;Ljava/util/List;)V",
        "e",
        "(Landroid/content/Context;)V",
        "a",
        "b",
        "Lcp/b;",
        "errorHandler",
        "inquiry-internal_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static a:Lcp/b;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final a(Landroid/content/Context;)V
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcp/c;->c(Landroid/content/Context;)Lcp/b;

    move-result-object p0

    invoke-virtual {p0}, Lcp/b;->b()V

    return-void
.end method

.method public static final declared-synchronized b(Landroid/content/Context;)Lcp/b;
    .locals 2

    const-class v0, Lcp/c;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcp/c;->a:Lcp/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :cond_0
    :try_start_1
    new-instance v1, Lcp/b;

    invoke-direct {v1, p0}, Lcp/b;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcp/c;->a:Lcp/b;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static final c(Landroid/content/Context;)Lcp/b;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcp/c;->a:Lcp/b;

    if-nez v0, :cond_0

    invoke-static {p0}, Lcp/c;->b(Landroid/content/Context;)Lcp/b;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static final d(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "+",
            "Ljava/io/File;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "directoriesToDeleteOnError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcp/c;->c(Landroid/content/Context;)Lcp/b;

    move-result-object p0

    invoke-virtual {p0}, Lcp/b;->d()V

    invoke-virtual {p0, p1}, Lcp/b;->f(Ljava/util/List;)V

    return-void
.end method

.method public static final e(Landroid/content/Context;)V
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcp/c;->c(Landroid/content/Context;)Lcp/b;

    move-result-object p0

    invoke-virtual {p0}, Lcp/b;->g()V

    return-void
.end method
