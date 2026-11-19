.class public final Le6/k$a;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le6/k;-><init>(Landroid/content/Context;Li6/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "e6/k$a",
        "Landroid/net/ConnectivityManager$NetworkCallback;",
        "Landroid/net/Network;",
        "network",
        "Landroid/net/NetworkCapabilities;",
        "capabilities",
        "",
        "onCapabilitiesChanged",
        "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V",
        "onLost",
        "(Landroid/net/Network;)V",
        "",
        "blocked",
        "onBlockedStatusChanged",
        "(Landroid/net/Network;Z)V",
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
.field public final synthetic a:Le6/k;


# direct methods
.method public constructor <init>(Le6/k;)V
    .locals 0

    iput-object p1, p0, Le6/k$a;->a:Le6/k;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onBlockedStatusChanged(Landroid/net/Network;Z)V
    .locals 8

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le6/k$a;->a:Le6/k;

    invoke-static {v0}, Le6/k;->k(Le6/k;)Landroid/net/ConnectivityManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Ly5/w;->e()Ly5/w;

    move-result-object p1

    invoke-static {}, Le6/j;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Network blocked status changed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ly5/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Le6/k$a;->a:Le6/k;

    invoke-virtual {p1}, Le6/h;->e()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lc6/h;

    iget-object p1, p0, Le6/k$a;->a:Le6/k;

    invoke-static {p1}, Le6/k;->l(Le6/k;)Ljava/lang/Object;

    move-result-object p1

    iget-object v1, p0, Le6/k$a;->a:Le6/k;

    monitor-enter p1

    :try_start_0
    invoke-static {v1}, Le6/k;->m(Le6/k;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v2, p2, :cond_0

    monitor-exit p1

    return-void

    :cond_0
    :try_start_1
    invoke-static {v1, p2}, Le6/k;->n(Le6/k;Z)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p1

    iget-object p1, p0, Le6/k$a;->a:Le6/k;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v5, p2

    invoke-static/range {v0 .. v7}, Lc6/h;->b(Lc6/h;ZZZZZILjava/lang/Object;)Lc6/h;

    move-result-object p2

    invoke-virtual {p1, p2}, Le6/h;->h(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v0

    move-object p2, v0

    monitor-exit p1

    throw p2

    :cond_1
    return-void
.end method

.method public onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 3

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "capabilities"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ly5/w;->e()Ly5/w;

    move-result-object p1

    invoke-static {}, Le6/j;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Network capabilities changed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Ly5/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Le6/k$a;->a:Le6/k;

    invoke-static {p1}, Le6/k;->k(Le6/k;)Landroid/net/ConnectivityManager;

    move-result-object p2

    iget-object v0, p0, Le6/k$a;->a:Le6/k;

    invoke-static {v0}, Le6/k;->m(Le6/k;)Z

    move-result v0

    invoke-static {p2, v0}, Le6/j;->c(Landroid/net/ConnectivityManager;Z)Lc6/h;

    move-result-object p2

    invoke-virtual {p1, p2}, Le6/h;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public onLost(Landroid/net/Network;)V
    .locals 6

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ly5/w;->e()Ly5/w;

    move-result-object p1

    invoke-static {}, Le6/j;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Network connection lost"

    invoke-virtual {p1, v0, v1}, Ly5/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Le6/k$a;->a:Le6/k;

    new-instance v0, Lc6/h;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lc6/h;-><init>(ZZZZZ)V

    invoke-virtual {p1, v0}, Le6/h;->h(Ljava/lang/Object;)V

    return-void
.end method
