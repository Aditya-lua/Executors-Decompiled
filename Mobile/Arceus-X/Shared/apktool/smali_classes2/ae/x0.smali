.class public final Lae/x0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lae/s0;


# direct methods
.method public static declared-synchronized a(Landroid/content/Context;)Lae/s0;
    .locals 3

    const-class v0, Lae/x0;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lae/x0;->a:Lae/s0;

    if-nez v1, :cond_0

    new-instance v1, Lae/f0;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lae/f0;-><init>(Lae/x;)V

    new-instance v2, Lae/j;

    invoke-static {p0}, Lbe/n0;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    invoke-direct {v2, p0}, Lae/j;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Lae/f0;->a(Lae/j;)Lae/f0;

    invoke-virtual {v1}, Lae/f0;->b()Lae/s0;

    move-result-object p0

    sput-object p0, Lae/x0;->a:Lae/s0;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p0, Lae/x0;->a:Lae/s0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method
