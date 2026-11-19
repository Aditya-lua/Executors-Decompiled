.class public final Lo9/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final a:I

.field public final synthetic b:Lo9/d;


# direct methods
.method public constructor <init>(Lo9/d;I)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lo9/h1;->b:Lo9/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lo9/h1;->a:I

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    iget-object p1, p0, Lo9/h1;->b:Lo9/d;

    if-nez p2, :cond_0

    const/16 p2, 0x10

    invoke-virtual {p1, p2}, Lo9/d;->zzf(I)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lo9/d;->zzh()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    const-string v1, "com.google.android.gms.common.internal.IGmsServiceBroker"

    invoke-interface {p2, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    if-eqz v1, :cond_1

    instance-of v2, v1, Lo9/n;

    if-eqz v2, :cond_1

    check-cast v1, Lo9/n;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance v1, Lo9/w0;

    invoke-direct {v1, p2}, Lo9/w0;-><init>(Landroid/os/IBinder;)V

    :goto_0
    invoke-virtual {p1, v1}, Lo9/d;->zzi(Lo9/n;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lo9/h1;->b:Lo9/d;

    const/4 p2, 0x0

    iget v0, p0, Lo9/h1;->a:I

    const/4 v1, 0x0

    invoke-virtual {p1, v1, p2, v0}, Lo9/d;->zzb(ILandroid/os/Bundle;I)V

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3

    iget-object p1, p0, Lo9/h1;->b:Lo9/d;

    invoke-virtual {p1}, Lo9/d;->zzh()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p1, v1}, Lo9/d;->zzi(Lo9/n;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lo9/h1;->b:Lo9/d;

    iget v0, p0, Lo9/h1;->a:I

    iget-object p1, p1, Lo9/d;->zzb:Landroid/os/Handler;

    const/4 v1, 0x6

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v0, v2}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
