.class public final Ld6/k;
.super Ld6/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ld6/h<",
        "Lb6/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0008\u0004*\u0001\u001b\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Ld6/k;",
        "Ld6/h;",
        "Lb6/h;",
        "Landroid/content/Context;",
        "context",
        "Lh6/b;",
        "taskExecutor",
        "<init>",
        "(Landroid/content/Context;Lh6/b;)V",
        "o",
        "()Lb6/h;",
        "",
        "i",
        "()V",
        "j",
        "Landroid/net/ConnectivityManager;",
        "f",
        "Landroid/net/ConnectivityManager;",
        "connectivityManager",
        "",
        "g",
        "Ljava/lang/Object;",
        "lock",
        "",
        "h",
        "Z",
        "isBlocked",
        "d6/k$a",
        "Ld6/k$a;",
        "networkCallback",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final f:Landroid/net/ConnectivityManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public volatile h:Z

.field public final i:Ld6/k$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lh6/b;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lh6/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "taskExecutor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Ld6/h;-><init>(Landroid/content/Context;Lh6/b;)V

    invoke-virtual {p0}, Ld6/h;->d()Landroid/content/Context;

    move-result-object p1

    const-string p2, "connectivity"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type android.net.ConnectivityManager"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/net/ConnectivityManager;

    iput-object p1, p0, Ld6/k;->f:Landroid/net/ConnectivityManager;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld6/k;->g:Ljava/lang/Object;

    new-instance p1, Ld6/k$a;

    invoke-direct {p1, p0}, Ld6/k$a;-><init>(Ld6/k;)V

    iput-object p1, p0, Ld6/k;->i:Ld6/k$a;

    return-void
.end method

.method public static final synthetic k(Ld6/k;)Landroid/net/ConnectivityManager;
    .locals 0

    iget-object p0, p0, Ld6/k;->f:Landroid/net/ConnectivityManager;

    return-object p0
.end method

.method public static final synthetic l(Ld6/k;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Ld6/k;->g:Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic m(Ld6/k;)Z
    .locals 0

    iget-boolean p0, p0, Ld6/k;->h:Z

    return p0
.end method

.method public static final synthetic n(Ld6/k;Z)V
    .locals 0

    iput-boolean p1, p0, Ld6/k;->h:Z

    return-void
.end method


# virtual methods
.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ld6/k;->o()Lb6/h;

    move-result-object v0

    return-object v0
.end method

.method public i()V
    .locals 4

    const-string v0, "Received exception while registering network callback"

    :try_start_0
    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v1

    invoke-static {}, Ld6/j;->b()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Registering network callback"

    invoke-virtual {v1, v2, v3}, Lx5/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ld6/k;->f:Landroid/net/ConnectivityManager;

    iget-object v2, p0, Ld6/k;->i:Ld6/k$a;

    invoke-static {v1, v2}, Lg6/p;->a(Landroid/net/ConnectivityManager;Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_1

    :goto_0
    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v2

    invoke-static {}, Ld6/j;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0, v1}, Lx5/w;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :goto_1
    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v2

    invoke-static {}, Ld6/j;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0, v1}, Lx5/w;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method

.method public j()V
    .locals 4

    const-string v0, "Received exception while unregistering network callback"

    :try_start_0
    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v1

    invoke-static {}, Ld6/j;->b()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Unregistering network callback"

    invoke-virtual {v1, v2, v3}, Lx5/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Ld6/k;->f:Landroid/net/ConnectivityManager;

    iget-object v2, p0, Ld6/k;->i:Ld6/k$a;

    invoke-virtual {v1, v2}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_1

    :goto_0
    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v2

    invoke-static {}, Ld6/j;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0, v1}, Lx5/w;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :goto_1
    invoke-static {}, Lx5/w;->e()Lx5/w;

    move-result-object v2

    invoke-static {}, Ld6/j;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0, v1}, Lx5/w;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method

.method public o()Lb6/h;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Ld6/k;->f:Landroid/net/ConnectivityManager;

    iget-boolean v1, p0, Ld6/k;->h:Z

    invoke-static {v0, v1}, Ld6/j;->c(Landroid/net/ConnectivityManager;Z)Lb6/h;

    move-result-object v0

    return-object v0
.end method
