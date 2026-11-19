.class public final Lib/l;
.super Lmb/q;
.source "SourceFile"


# instance fields
.field public final a:Lm9/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm9/k<",
            "Lmb/e;",
            ">;"
        }
    .end annotation
.end field


# virtual methods
.method public final declared-synchronized t(Landroid/location/Location;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lib/l;->a:Lm9/k;

    new-instance v1, Lib/k;

    invoke-direct {v1, p0, p1}, Lib/k;-><init>(Lib/l;Landroid/location/Location;)V

    invoke-virtual {v0, v1}, Lm9/k;->c(Lm9/k$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
