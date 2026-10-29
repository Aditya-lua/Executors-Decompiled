.class public Lcom/roblox/client/realtime/RealtimeService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/realtime/RealtimeService$b;,
        Lcom/roblox/client/realtime/RealtimeService$a;,
        Lcom/roblox/client/realtime/RealtimeService$c;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public volatile d:Landroid/os/Looper;

.field public volatile e:Lcom/roblox/client/realtime/RealtimeService$c;

.field public final f:Landroid/os/IBinder;

.field public g:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const/16 v0, 0xa

    iput v0, p0, Lcom/roblox/client/realtime/RealtimeService;->a:I

    const/16 v0, 0x14

    iput v0, p0, Lcom/roblox/client/realtime/RealtimeService;->b:I

    const/16 v0, 0x1e

    iput v0, p0, Lcom/roblox/client/realtime/RealtimeService;->c:I

    new-instance v0, Lcom/roblox/client/realtime/RealtimeService$b;

    invoke-direct {v0, p0}, Lcom/roblox/client/realtime/RealtimeService$b;-><init>(Lcom/roblox/client/realtime/RealtimeService;)V

    iput-object v0, p0, Lcom/roblox/client/realtime/RealtimeService;->f:Landroid/os/IBinder;

    new-instance v0, Lcom/roblox/client/realtime/RealtimeService$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/roblox/client/realtime/RealtimeService$a;-><init>(Lsj/d;)V

    iput-object v0, p0, Lcom/roblox/client/realtime/RealtimeService;->g:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method public static bridge synthetic a(Lcom/roblox/client/realtime/RealtimeService;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/realtime/RealtimeService;->h()V

    return-void
.end method

.method public static bridge synthetic b(Lcom/roblox/client/realtime/RealtimeService;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/realtime/RealtimeService;->i()V

    return-void
.end method

.method public static c()J
    .locals 2

    invoke-static {}, Lsj/a;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public static d()Z
    .locals 1

    invoke-static {}, Lsj/a;->b()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final e(J)V
    .locals 4

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v0

    invoke-virtual {v0}, Lvi/h;->g()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/realtime/RealtimeService;->e:Lcom/roblox/client/realtime/RealtimeService$c;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    const/16 v1, 0xa

    iput v1, v0, Landroid/os/Message;->arg1:I

    iget-object v1, p0, Lcom/roblox/client/realtime/RealtimeService;->e:Lcom/roblox/client/realtime/RealtimeService$c;

    invoke-virtual {v1, v0, p1, p2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_0
    return-void
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/realtime/RealtimeService;->e:Lcom/roblox/client/realtime/RealtimeService$c;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    const/16 v1, 0x14

    iput v1, v0, Landroid/os/Message;->arg1:I

    iget-object v1, p0, Lcom/roblox/client/realtime/RealtimeService;->e:Lcom/roblox/client/realtime/RealtimeService$c;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final g()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/realtime/RealtimeService;->e:Lcom/roblox/client/realtime/RealtimeService$c;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    const/16 v1, 0x1e

    iput v1, v0, Landroid/os/Message;->arg1:I

    iget-object v1, p0, Lcom/roblox/client/realtime/RealtimeService;->e:Lcom/roblox/client/realtime/RealtimeService$c;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final h()V
    .locals 0

    return-void
.end method

.method public final i()V
    .locals 0

    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 2

    iget-object p1, p0, Lcom/roblox/client/realtime/RealtimeService;->g:Landroid/content/BroadcastReceiver;

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object p1

    invoke-virtual {p1, p0}, Lfv/c;->n(Ljava/lang/Object;)V

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/realtime/RealtimeService;->e(J)V

    iget-object p1, p0, Lcom/roblox/client/realtime/RealtimeService;->f:Landroid/os/IBinder;

    return-object p1
.end method

.method public onConnectivityChangeEvent(Lph/e;)V
    .locals 2
    .annotation runtime Lfv/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->POSTING:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RealtimeService.onConnectivityChangeEvent() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lph/e;->a()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RealtimeService"

    invoke-static {v1, v0}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Lph/e;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/roblox/client/realtime/RealtimeService;->e(J)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/realtime/RealtimeService;->f()V

    return-void
.end method

.method public onCreate()V
    .locals 2

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    invoke-static {p0}, Ljm/a;->c(Landroid/content/Context;)V

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "RealtimeService"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/realtime/RealtimeService;->d:Landroid/os/Looper;

    new-instance v0, Lcom/roblox/client/realtime/RealtimeService$c;

    iget-object v1, p0, Lcom/roblox/client/realtime/RealtimeService;->d:Landroid/os/Looper;

    invoke-direct {v0, p0, v1}, Lcom/roblox/client/realtime/RealtimeService$c;-><init>(Lcom/roblox/client/realtime/RealtimeService;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/roblox/client/realtime/RealtimeService;->e:Lcom/roblox/client/realtime/RealtimeService$c;

    return-void
.end method

.method public onDestroy()V
    .locals 0

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public onUnbind(Landroid/content/Intent;)Z
    .locals 1

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lfv/c;->p(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/roblox/client/realtime/RealtimeService;->g:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    invoke-virtual {p0}, Lcom/roblox/client/realtime/RealtimeService;->g()V

    invoke-super {p0, p1}, Landroid/app/Service;->onUnbind(Landroid/content/Intent;)Z

    move-result p1

    return p1
.end method
