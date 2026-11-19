.class public final Lch/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "",
        "b",
        "()V",
        "NativeShell_googleProdRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a()V
    .locals 0

    invoke-static {}, Lch/d;->b()V

    return-void
.end method

.method public static final b()V
    .locals 7

    sget-object v0, Ly5/p0;->a:Ly5/p0$a;

    invoke-static {}, Lcom/roblox/client/RobloxApplication;->f()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getAppContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ly5/p0$a;->a(Landroid/content/Context;)Ly5/p0;

    move-result-object v0

    sget-object v1, Ly5/j;->a:Ly5/j;

    new-instance v2, Ly5/z$a;

    const-class v3, Lcom/roblox/client/ads/GmaSdkBackgroundInstallWorker;

    invoke-direct {v2, v3}, Ly5/z$a;-><init>(Ljava/lang/Class;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v3

    invoke-interface {v3}, Lbi/i;->b0()I

    move-result v3

    int-to-long v3, v3

    const-wide/16 v5, 0x0

    invoke-static {v3, v4, v5, v6}, Lkotlin/ranges/d;->d(JJ)J

    move-result-wide v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v3, v4, v5}, Ly5/q0$a;->n(JLjava/util/concurrent/TimeUnit;)Ly5/q0$a;

    move-result-object v2

    check-cast v2, Ly5/z$a;

    invoke-virtual {v2}, Ly5/q0$a;->b()Ly5/q0;

    move-result-object v2

    check-cast v2, Ly5/z;

    const-string v3, "gmasdk-background-install"

    invoke-virtual {v0, v3, v1, v2}, Ly5/p0;->g(Ljava/lang/String;Ly5/j;Ly5/z;)Ly5/a0;

    return-void
.end method
