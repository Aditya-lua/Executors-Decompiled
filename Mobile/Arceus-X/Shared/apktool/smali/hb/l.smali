.class public final Lhb/l;
.super Llb/q;
.source "SourceFile"


# instance fields
.field public final a:Ll9/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll9/k<",
            "Llb/e;",
            ">;"
        }
    .end annotation
.end field


# virtual methods
.method public final declared-synchronized s(Landroid/location/Location;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lhb/l;->a:Ll9/k;

    new-instance v1, Lhb/k;

    invoke-direct {v1, p0, p1}, Lhb/k;-><init>(Lhb/l;Landroid/location/Location;)V

    invoke-virtual {v0, v1}, Ll9/k;->c(Ll9/k$b;)V
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
