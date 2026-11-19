.class public final Lce/x0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lce/s0;


# direct methods
.method public static declared-synchronized a(Landroid/content/Context;)Lce/s0;
    .locals 3

    const-class v0, Lce/x0;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lce/x0;->a:Lce/s0;

    if-nez v1, :cond_0

    new-instance v1, Lce/f0;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lce/f0;-><init>(Lce/x;)V

    new-instance v2, Lce/j;

    invoke-static {p0}, Lde/n0;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    invoke-direct {v2, p0}, Lce/j;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Lce/f0;->a(Lce/j;)Lce/f0;

    invoke-virtual {v1}, Lce/f0;->b()Lce/s0;

    move-result-object p0

    sput-object p0, Lce/x0;->a:Lce/s0;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p0, Lce/x0;->a:Lce/s0;
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
