.class public final Lhb/n;
.super Lhb/v;
.source "SourceFile"


# instance fields
.field public final g:Lhb/m;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lk9/f$a;Lk9/f$b;Ljava/lang/String;Ln9/d;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lhb/v;-><init>(Landroid/content/Context;Landroid/os/Looper;Lk9/f$a;Lk9/f$b;Ljava/lang/String;Ln9/d;)V

    move-object p2, p1

    move-object p1, p0

    new-instance p3, Lhb/m;

    iget-object p4, p1, Lhb/v;->f:Lhb/r;

    invoke-direct {p3, p2, p4}, Lhb/m;-><init>(Landroid/content/Context;Lhb/r;)V

    iput-object p3, p1, Lhb/n;->g:Lhb/m;

    return-void
.end method


# virtual methods
.method public final disconnect()V
    .locals 4

    iget-object v0, p0, Lhb/n;->g:Lhb/m;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Ln9/c;->isConnected()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    :try_start_1
    iget-object v1, p0, Lhb/n;->g:Lhb/m;

    invoke-virtual {v1}, Lhb/m;->b()V

    iget-object v1, p0, Lhb/n;->g:Lhb/m;

    invoke-virtual {v1}, Lhb/m;->c()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_2
    const-string v2, "LocationClientImpl"

    const-string v3, "Client disconnected before listeners could be cleaned up"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    invoke-super {p0}, Ln9/c;->disconnect()V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final usesClientTelemetry()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
